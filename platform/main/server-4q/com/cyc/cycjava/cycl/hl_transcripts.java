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

public final class hl_transcripts
    extends
      SubLTranslatedFile
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
  public static SubLObject do_constants_by_internal_id(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list0 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject constant_var = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list0 );
    constant_var = current.first();
    current = current.rest();
    SubLObject allow_other_keys_p = NIL;
    SubLObject rest = current;
    SubLObject bad = NIL;
    SubLObject current_$1 = NIL;
    while ( NIL != rest)
    {
      cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list0 );
      current_$1 = rest.first();
      rest = rest.rest();
      cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list0 );
      if( NIL == conses_high.member( current_$1, $list1, UNPROVIDED, UNPROVIDED ) )
      {
        bad = T;
      }
      if( current_$1 == $kw2$ALLOW_OTHER_KEYS )
      {
        allow_other_keys_p = rest.first();
      }
      rest = rest.rest();
    }
    if( NIL != bad && NIL == allow_other_keys_p )
    {
      cdestructuring_bind.cdestructuring_bind_error( datum, $list0 );
    }
    final SubLObject start_tail = cdestructuring_bind.property_list_member( $kw3$START, current );
    final SubLObject start = ( NIL != start_tail ) ? conses_high.cadr( start_tail ) : NIL;
    final SubLObject end_tail = cdestructuring_bind.property_list_member( $kw4$END, current );
    final SubLObject end = ( NIL != end_tail ) ? conses_high.cadr( end_tail ) : NIL;
    final SubLObject progress_message_tail = cdestructuring_bind.property_list_member( $kw5$PROGRESS_MESSAGE, current );
    final SubLObject progress_message = ( NIL != progress_message_tail ) ? conses_high.cadr( progress_message_tail ) : NIL;
    final SubLObject done_tail = cdestructuring_bind.property_list_member( $kw6$DONE, current );
    final SubLObject done = ( NIL != done_tail ) ? conses_high.cadr( done_tail ) : NIL;
    final SubLObject body;
    current = ( body = temp );
    if( NIL != progress_message )
    {
      final SubLObject progress_var = $sym7$PROGRESS_VAR;
      final SubLObject total_var = $sym8$TOTAL_VAR;
      return ConsesLow.list( $sym9$CLET, ConsesLow.list( ConsesLow.list( progress_var, progress_message ), ConsesLow.list( total_var, ConsesLow.list( $sym10$_, end, start ) ) ), ConsesLow.list(
          $sym11$NOTING_PERCENT_PROGRESS, progress_var, ConsesLow.listS( $sym12$DO_CONSTANTS_BY_INTERNAL_ID, ConsesLow.list( constant_var, $kw3$START, start, $kw4$END, end, $kw6$DONE, done ), ConsesLow.list(
              $sym13$NOTE_CONSTANTS_BY_INTERNAL_ID_PROGRESS, constant_var, start, total_var ), ConsesLow.append( body, NIL ) ) ) );
    }
    final SubLObject id_var = $sym14$ID_VAR;
    return ConsesLow.list( $sym15$DO_NUMBERS, ConsesLow.list( id_var, $kw3$START, start, $kw4$END, end, $kw6$DONE, done ), ConsesLow.list( $sym9$CLET, ConsesLow.list( ConsesLow.list( constant_var, ConsesLow.list(
        $sym16$FIND_CONSTANT_BY_INTERNAL_ID, id_var ) ) ), ConsesLow.listS( $sym17$PWHEN, ConsesLow.list( $sym18$CONSTANT_P, constant_var ), ConsesLow.append( body, NIL ) ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/hl-transcripts.lisp", position = 2254L)
  public static SubLObject note_constants_by_internal_id_progress(final SubLObject constant, final SubLObject start, final SubLObject total)
  {
    final SubLObject sofar = Numbers.subtract( constants_high.constant_internal_id( constant ), start );
    return utilities_macros.note_percent_progress( sofar, total );
  }

  @SubLTranslatedFile.SubL(source = "cycl/hl-transcripts.lisp", position = 2485L)
  public static SubLObject do_narts_by_id(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list19 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject nart_var = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list19 );
    nart_var = current.first();
    current = current.rest();
    SubLObject allow_other_keys_p = NIL;
    SubLObject rest = current;
    SubLObject bad = NIL;
    SubLObject current_$2 = NIL;
    while ( NIL != rest)
    {
      cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list19 );
      current_$2 = rest.first();
      rest = rest.rest();
      cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list19 );
      if( NIL == conses_high.member( current_$2, $list1, UNPROVIDED, UNPROVIDED ) )
      {
        bad = T;
      }
      if( current_$2 == $kw2$ALLOW_OTHER_KEYS )
      {
        allow_other_keys_p = rest.first();
      }
      rest = rest.rest();
    }
    if( NIL != bad && NIL == allow_other_keys_p )
    {
      cdestructuring_bind.cdestructuring_bind_error( datum, $list19 );
    }
    final SubLObject start_tail = cdestructuring_bind.property_list_member( $kw3$START, current );
    final SubLObject start = ( NIL != start_tail ) ? conses_high.cadr( start_tail ) : NIL;
    final SubLObject end_tail = cdestructuring_bind.property_list_member( $kw4$END, current );
    final SubLObject end = ( NIL != end_tail ) ? conses_high.cadr( end_tail ) : NIL;
    final SubLObject progress_message_tail = cdestructuring_bind.property_list_member( $kw5$PROGRESS_MESSAGE, current );
    final SubLObject progress_message = ( NIL != progress_message_tail ) ? conses_high.cadr( progress_message_tail ) : NIL;
    final SubLObject done_tail = cdestructuring_bind.property_list_member( $kw6$DONE, current );
    final SubLObject done = ( NIL != done_tail ) ? conses_high.cadr( done_tail ) : NIL;
    final SubLObject body;
    current = ( body = temp );
    if( NIL != progress_message )
    {
      final SubLObject progress_var = $sym20$PROGRESS_VAR;
      final SubLObject total_var = $sym21$TOTAL_VAR;
      return ConsesLow.list( $sym9$CLET, ConsesLow.list( ConsesLow.list( progress_var, progress_message ), ConsesLow.list( total_var, ConsesLow.list( $sym10$_, end, start ) ) ), ConsesLow.list(
          $sym11$NOTING_PERCENT_PROGRESS, progress_var, ConsesLow.listS( $sym22$DO_NARTS_BY_ID, ConsesLow.list( nart_var, $kw3$START, start, $kw4$END, end, $kw6$DONE, done ), ConsesLow.list(
              $sym23$NOTE_NARTS_BY_ID_PROGRESS, nart_var, start, total_var ), ConsesLow.append( body, NIL ) ) ) );
    }
    final SubLObject id_var = $sym24$ID_VAR;
    return ConsesLow.list( $sym15$DO_NUMBERS, ConsesLow.list( id_var, $kw3$START, start, $kw4$END, end, $kw6$DONE, done ), ConsesLow.list( $sym9$CLET, ConsesLow.list( ConsesLow.list( nart_var, ConsesLow.list(
        $sym25$FIND_NART_BY_ID, id_var ) ) ), ConsesLow.listS( $sym17$PWHEN, ConsesLow.list( $sym26$NART_P, nart_var ), ConsesLow.append( body, NIL ) ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/hl-transcripts.lisp", position = 3137L)
  public static SubLObject note_narts_by_id_progress(final SubLObject nart, final SubLObject start, final SubLObject total)
  {
    final SubLObject sofar = Numbers.subtract( nart_handles.nart_id( nart ), start );
    return utilities_macros.note_percent_progress( sofar, total );
  }

  @SubLTranslatedFile.SubL(source = "cycl/hl-transcripts.lisp", position = 3321L)
  public static SubLObject do_assertions_by_id(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list27 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject assertion_var = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list27 );
    assertion_var = current.first();
    current = current.rest();
    SubLObject allow_other_keys_p = NIL;
    SubLObject rest = current;
    SubLObject bad = NIL;
    SubLObject current_$3 = NIL;
    while ( NIL != rest)
    {
      cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list27 );
      current_$3 = rest.first();
      rest = rest.rest();
      cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list27 );
      if( NIL == conses_high.member( current_$3, $list1, UNPROVIDED, UNPROVIDED ) )
      {
        bad = T;
      }
      if( current_$3 == $kw2$ALLOW_OTHER_KEYS )
      {
        allow_other_keys_p = rest.first();
      }
      rest = rest.rest();
    }
    if( NIL != bad && NIL == allow_other_keys_p )
    {
      cdestructuring_bind.cdestructuring_bind_error( datum, $list27 );
    }
    final SubLObject start_tail = cdestructuring_bind.property_list_member( $kw3$START, current );
    final SubLObject start = ( NIL != start_tail ) ? conses_high.cadr( start_tail ) : NIL;
    final SubLObject end_tail = cdestructuring_bind.property_list_member( $kw4$END, current );
    final SubLObject end = ( NIL != end_tail ) ? conses_high.cadr( end_tail ) : NIL;
    final SubLObject progress_message_tail = cdestructuring_bind.property_list_member( $kw5$PROGRESS_MESSAGE, current );
    final SubLObject progress_message = ( NIL != progress_message_tail ) ? conses_high.cadr( progress_message_tail ) : NIL;
    final SubLObject done_tail = cdestructuring_bind.property_list_member( $kw6$DONE, current );
    final SubLObject done = ( NIL != done_tail ) ? conses_high.cadr( done_tail ) : NIL;
    final SubLObject body;
    current = ( body = temp );
    if( NIL != progress_message )
    {
      final SubLObject progress_var = $sym28$PROGRESS_VAR;
      final SubLObject total_var = $sym29$TOTAL_VAR;
      return ConsesLow.list( $sym9$CLET, ConsesLow.list( ConsesLow.list( progress_var, progress_message ), ConsesLow.list( total_var, ConsesLow.list( $sym10$_, end, start ) ) ), ConsesLow.list(
          $sym11$NOTING_PERCENT_PROGRESS, progress_var, ConsesLow.listS( $sym30$DO_ASSERTIONS_BY_ID, ConsesLow.list( assertion_var, $kw3$START, start, $kw4$END, end, $kw6$DONE, done ), ConsesLow.list(
              $sym31$NOTE_ASSERTIONS_BY_ID_PROGRESS, assertion_var, start, total_var ), ConsesLow.append( body, NIL ) ) ) );
    }
    final SubLObject id_var = $sym32$ID_VAR;
    return ConsesLow.list( $sym15$DO_NUMBERS, ConsesLow.list( id_var, $kw3$START, start, $kw4$END, end, $kw6$DONE, done ), ConsesLow.list( $sym9$CLET, ConsesLow.list( ConsesLow.list( assertion_var, ConsesLow.list(
        $sym33$FIND_ASSERTION_BY_ID, id_var ) ) ), ConsesLow.listS( $sym17$PWHEN, ConsesLow.list( $sym34$ASSERTION_P, assertion_var ), ConsesLow.append( body, NIL ) ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/hl-transcripts.lisp", position = 4028L)
  public static SubLObject note_assertions_by_id_progress(final SubLObject assertion, final SubLObject start, final SubLObject total)
  {
    final SubLObject sofar = Numbers.subtract( assertion_handles.assertion_id( assertion ), start );
    return utilities_macros.note_percent_progress( sofar, total );
  }

  @SubLTranslatedFile.SubL(source = "cycl/hl-transcripts.lisp", position = 4237L)
  public static SubLObject do_deductions_by_id(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list35 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject deduction_var = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list35 );
    deduction_var = current.first();
    current = current.rest();
    SubLObject allow_other_keys_p = NIL;
    SubLObject rest = current;
    SubLObject bad = NIL;
    SubLObject current_$4 = NIL;
    while ( NIL != rest)
    {
      cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list35 );
      current_$4 = rest.first();
      rest = rest.rest();
      cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list35 );
      if( NIL == conses_high.member( current_$4, $list1, UNPROVIDED, UNPROVIDED ) )
      {
        bad = T;
      }
      if( current_$4 == $kw2$ALLOW_OTHER_KEYS )
      {
        allow_other_keys_p = rest.first();
      }
      rest = rest.rest();
    }
    if( NIL != bad && NIL == allow_other_keys_p )
    {
      cdestructuring_bind.cdestructuring_bind_error( datum, $list35 );
    }
    final SubLObject start_tail = cdestructuring_bind.property_list_member( $kw3$START, current );
    final SubLObject start = ( NIL != start_tail ) ? conses_high.cadr( start_tail ) : NIL;
    final SubLObject end_tail = cdestructuring_bind.property_list_member( $kw4$END, current );
    final SubLObject end = ( NIL != end_tail ) ? conses_high.cadr( end_tail ) : NIL;
    final SubLObject progress_message_tail = cdestructuring_bind.property_list_member( $kw5$PROGRESS_MESSAGE, current );
    final SubLObject progress_message = ( NIL != progress_message_tail ) ? conses_high.cadr( progress_message_tail ) : NIL;
    final SubLObject done_tail = cdestructuring_bind.property_list_member( $kw6$DONE, current );
    final SubLObject done = ( NIL != done_tail ) ? conses_high.cadr( done_tail ) : NIL;
    final SubLObject body;
    current = ( body = temp );
    if( NIL != progress_message )
    {
      final SubLObject progress_var = $sym36$PROGRESS_VAR;
      final SubLObject total_var = $sym37$TOTAL_VAR;
      return ConsesLow.list( $sym9$CLET, ConsesLow.list( ConsesLow.list( progress_var, progress_message ), ConsesLow.list( total_var, ConsesLow.list( $sym10$_, end, start ) ) ), ConsesLow.list(
          $sym11$NOTING_PERCENT_PROGRESS, progress_var, ConsesLow.listS( $sym38$DO_DEDUCTIONS_BY_ID, ConsesLow.list( deduction_var, $kw3$START, start, $kw4$END, end, $kw6$DONE, done ), ConsesLow.list(
              $sym39$NOTE_DEDUCTIONS_BY_ID_PROGRESS, deduction_var, start, total_var ), ConsesLow.append( body, NIL ) ) ) );
    }
    final SubLObject id_var = $sym40$ID_VAR;
    return ConsesLow.list( $sym15$DO_NUMBERS, ConsesLow.list( id_var, $kw3$START, start, $kw4$END, end, $kw6$DONE, done ), ConsesLow.list( $sym9$CLET, ConsesLow.list( ConsesLow.list( deduction_var, ConsesLow.list(
        $sym41$FIND_DEDUCTION_BY_ID, id_var ) ) ), ConsesLow.listS( $sym17$PWHEN, ConsesLow.list( $sym42$DEDUCTION_P, deduction_var ), ConsesLow.append( body, NIL ) ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/hl-transcripts.lisp", position = 4944L)
  public static SubLObject note_deductions_by_id_progress(final SubLObject deduction, final SubLObject start, final SubLObject total)
  {
    final SubLObject sofar = Numbers.subtract( deduction_handles.deduction_id( deduction ), start );
    return utilities_macros.note_percent_progress( sofar, total );
  }

  @SubLTranslatedFile.SubL(source = "cycl/hl-transcripts.lisp", position = 5153L)
  public static SubLObject do_kb_hl_supports_by_id(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list43 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject kb_hl_support_var = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list43 );
    kb_hl_support_var = current.first();
    current = current.rest();
    SubLObject allow_other_keys_p = NIL;
    SubLObject rest = current;
    SubLObject bad = NIL;
    SubLObject current_$5 = NIL;
    while ( NIL != rest)
    {
      cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list43 );
      current_$5 = rest.first();
      rest = rest.rest();
      cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list43 );
      if( NIL == conses_high.member( current_$5, $list1, UNPROVIDED, UNPROVIDED ) )
      {
        bad = T;
      }
      if( current_$5 == $kw2$ALLOW_OTHER_KEYS )
      {
        allow_other_keys_p = rest.first();
      }
      rest = rest.rest();
    }
    if( NIL != bad && NIL == allow_other_keys_p )
    {
      cdestructuring_bind.cdestructuring_bind_error( datum, $list43 );
    }
    final SubLObject start_tail = cdestructuring_bind.property_list_member( $kw3$START, current );
    final SubLObject start = ( NIL != start_tail ) ? conses_high.cadr( start_tail ) : NIL;
    final SubLObject end_tail = cdestructuring_bind.property_list_member( $kw4$END, current );
    final SubLObject end = ( NIL != end_tail ) ? conses_high.cadr( end_tail ) : NIL;
    final SubLObject progress_message_tail = cdestructuring_bind.property_list_member( $kw5$PROGRESS_MESSAGE, current );
    final SubLObject progress_message = ( NIL != progress_message_tail ) ? conses_high.cadr( progress_message_tail ) : NIL;
    final SubLObject done_tail = cdestructuring_bind.property_list_member( $kw6$DONE, current );
    final SubLObject done = ( NIL != done_tail ) ? conses_high.cadr( done_tail ) : NIL;
    final SubLObject body;
    current = ( body = temp );
    if( NIL != progress_message )
    {
      final SubLObject progress_var = $sym44$PROGRESS_VAR;
      final SubLObject total_var = $sym45$TOTAL_VAR;
      return ConsesLow.list( $sym9$CLET, ConsesLow.list( ConsesLow.list( progress_var, progress_message ), ConsesLow.list( total_var, ConsesLow.list( $sym10$_, end, start ) ) ), ConsesLow.list(
          $sym11$NOTING_PERCENT_PROGRESS, progress_var, ConsesLow.listS( $sym46$DO_KB_HL_SUPPORTS_BY_ID, ConsesLow.list( kb_hl_support_var, $kw3$START, start, $kw4$END, end, $kw6$DONE, done ), ConsesLow.list(
              $sym47$NOTE_KB_HL_SUPPORTS_BY_ID_PROGRESS, kb_hl_support_var, start, total_var ), ConsesLow.append( body, NIL ) ) ) );
    }
    final SubLObject id_var = $sym48$ID_VAR;
    return ConsesLow.list( $sym15$DO_NUMBERS, ConsesLow.list( id_var, $kw3$START, start, $kw4$END, end, $kw6$DONE, done ), ConsesLow.list( $sym9$CLET, ConsesLow.list( ConsesLow.list( kb_hl_support_var, ConsesLow.list(
        $sym49$FIND_KB_HL_SUPPORT_BY_ID, id_var ) ) ), ConsesLow.listS( $sym17$PWHEN, ConsesLow.list( $sym50$KB_HL_SUPPORT_P, kb_hl_support_var ), ConsesLow.append( body, NIL ) ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/hl-transcripts.lisp", position = 5904L)
  public static SubLObject note_kb_hl_supports_by_id_progress(final SubLObject kb_hl_support, final SubLObject start, final SubLObject total)
  {
    final SubLObject sofar = Numbers.subtract( kb_hl_support_handles.kb_hl_support_id( kb_hl_support ), start );
    return utilities_macros.note_percent_progress( sofar, total );
  }

  @SubLTranslatedFile.SubL(source = "cycl/hl-transcripts.lisp", position = 6133L)
  public static SubLObject most_recent_constants(SubLObject n)
  {
    if( n == UNPROVIDED )
    {
      n = TEN_INTEGER;
    }
    return most_recent_kb_objects( n, $sym51$NEXT_CONSTANT_SUID, $sym16$FIND_CONSTANT_BY_INTERNAL_ID, $sym52$VALID_CONSTANT_ );
  }

  @SubLTranslatedFile.SubL(source = "cycl/hl-transcripts.lisp", position = 6449L)
  public static SubLObject most_recent_narts(SubLObject n)
  {
    if( n == UNPROVIDED )
    {
      n = TEN_INTEGER;
    }
    return most_recent_kb_objects( n, $sym53$NEXT_NART_ID, $sym25$FIND_NART_BY_ID, $sym54$VALID_NART_ );
  }

  @SubLTranslatedFile.SubL(source = "cycl/hl-transcripts.lisp", position = 6582L)
  public static SubLObject most_recent_assertions(SubLObject n)
  {
    if( n == UNPROVIDED )
    {
      n = TEN_INTEGER;
    }
    return most_recent_kb_objects( n, $sym55$NEXT_ASSERTION_ID, $sym33$FIND_ASSERTION_BY_ID, $sym56$VALID_ASSERTION_ );
  }

  @SubLTranslatedFile.SubL(source = "cycl/hl-transcripts.lisp", position = 6735L)
  public static SubLObject most_recent_deductions(SubLObject n)
  {
    if( n == UNPROVIDED )
    {
      n = TEN_INTEGER;
    }
    return most_recent_kb_objects( n, $sym57$NEXT_DEDUCTION_ID, $sym41$FIND_DEDUCTION_BY_ID, $sym58$VALID_DEDUCTION_ );
  }

  @SubLTranslatedFile.SubL(source = "cycl/hl-transcripts.lisp", position = 6888L)
  public static SubLObject most_recent_kb_hl_supports(SubLObject n)
  {
    if( n == UNPROVIDED )
    {
      n = TEN_INTEGER;
    }
    return most_recent_kb_objects( n, $sym59$NEXT_KB_HL_SUPPORT_ID, $sym49$FIND_KB_HL_SUPPORT_BY_ID, $sym60$VALID_KB_HL_SUPPORT_ );
  }

  @SubLTranslatedFile.SubL(source = "cycl/hl-transcripts.lisp", position = 7057L)
  public static SubLObject most_recent_kb_objects(final SubLObject n, final SubLObject next_id_fn, final SubLObject find_fn, final SubLObject valid_fn)
  {
    assert NIL != subl_promotions.non_negative_integer_p( n ) : n;
    SubLObject objects = NIL;
    SubLObject total = ZERO_INTEGER;
    final SubLObject start = Functions.funcall( next_id_fn );
    SubLObject doneP = Numbers.numGE( total, n );
    if( NIL == doneP )
    {
      SubLObject id = NIL;
      id = start;
      while ( NIL == doneP)
      {
        final SubLObject v_object = Functions.funcall( find_fn, id );
        if( NIL != Functions.funcall( valid_fn, v_object ) )
        {
          objects = ConsesLow.cons( v_object, objects );
          total = Numbers.add( total, ONE_INTEGER );
          doneP = Numbers.numGE( total, n );
        }
        id = Numbers.add( id, MINUS_ONE_INTEGER );
      }
    }
    return Sequences.nreverse( objects );
  }

  @SubLTranslatedFile.SubL(source = "cycl/hl-transcripts.lisp", position = 7498L)
  public static SubLObject previous_dump_kb_state_checkpoint()
  {
    final SubLObject constant_suid = constant_index_manager.get_file_backed_constant_internal_id_threshold();
    final SubLObject nart_id = nart_hl_formula_manager.get_file_backed_nart_id_threshold();
    final SubLObject assertion_id = assertion_manager.get_file_backed_assertion_id_threshold();
    final SubLObject kb_hl_support_id = kb_hl_support_manager.get_file_backed_kb_hl_support_id_threshold();
    final SubLObject deduction_id = deduction_manager.get_file_backed_deduction_id_threshold();
    return make_kb_state_checkpoint( constant_suid, nart_id, assertion_id, kb_hl_support_id, deduction_id );
  }

  @SubLTranslatedFile.SubL(source = "cycl/hl-transcripts.lisp", position = 8160L)
  public static SubLObject current_kb_state_checkpoint()
  {
    final SubLObject constant_suid = constant_handles.next_constant_suid();
    final SubLObject nart_id = nart_handles.next_nart_id();
    final SubLObject assertion_id = assertion_handles.next_assertion_id();
    final SubLObject kb_hl_support_id = kb_hl_support_handles.next_kb_hl_support_id();
    final SubLObject deduction_id = deduction_handles.next_deduction_id();
    return make_kb_state_checkpoint( constant_suid, nart_id, assertion_id, kb_hl_support_id, deduction_id );
  }

  @SubLTranslatedFile.SubL(source = "cycl/hl-transcripts.lisp", position = 8544L)
  public static SubLObject make_kb_state_checkpoint(final SubLObject constant_suid, final SubLObject nart_id, final SubLObject assertion_id, final SubLObject kb_hl_support_id, final SubLObject deduction_id)
  {
    return ConsesLow.list( new SubLObject[] { $kw62$CONSTANT, constant_suid, $kw63$NART, nart_id, $kw64$ASSERTION, assertion_id, $kw65$KB_HL_SUPPORT, kb_hl_support_id, $kw66$DEDUCTION, deduction_id
    } );
  }

  @SubLTranslatedFile.SubL(source = "cycl/hl-transcripts.lisp", position = 8854L)
  public static SubLObject destructure_kb_state_checkpoint(final SubLObject kb_state_checkpoint)
  {
    final SubLObject constant_tail = cdestructuring_bind.property_list_member( $kw62$CONSTANT, kb_state_checkpoint );
    final SubLObject constant = ( NIL != constant_tail ) ? conses_high.cadr( constant_tail ) : NIL;
    final SubLObject nart_tail = cdestructuring_bind.property_list_member( $kw63$NART, kb_state_checkpoint );
    final SubLObject nart = ( NIL != nart_tail ) ? conses_high.cadr( nart_tail ) : NIL;
    final SubLObject assertion_tail = cdestructuring_bind.property_list_member( $kw64$ASSERTION, kb_state_checkpoint );
    final SubLObject assertion = ( NIL != assertion_tail ) ? conses_high.cadr( assertion_tail ) : NIL;
    final SubLObject deduction_tail = cdestructuring_bind.property_list_member( $kw66$DEDUCTION, kb_state_checkpoint );
    final SubLObject deduction = ( NIL != deduction_tail ) ? conses_high.cadr( deduction_tail ) : NIL;
    final SubLObject kb_hl_support_tail = cdestructuring_bind.property_list_member( $kw65$KB_HL_SUPPORT, kb_state_checkpoint );
    final SubLObject kb_hl_support = ( NIL != kb_hl_support_tail ) ? conses_high.cadr( kb_hl_support_tail ) : NIL;
    return Values.values( constant, nart, assertion, kb_hl_support, deduction );
  }

  @SubLTranslatedFile.SubL(source = "cycl/hl-transcripts.lisp", position = 9110L)
  public static SubLObject kb_checkpoint_difference(SubLObject earlier_kb_checkpoint, SubLObject later_kb_checkpoint)
  {
    if( earlier_kb_checkpoint == UNPROVIDED )
    {
      earlier_kb_checkpoint = previous_dump_kb_state_checkpoint();
    }
    if( later_kb_checkpoint == UNPROVIDED )
    {
      later_kb_checkpoint = current_kb_state_checkpoint();
    }
    return Mapping.mapcar( Symbols.symbol_function( $sym10$_ ), Values.arg2( Values.resetMultipleValues(), Values.multiple_value_list( destructure_kb_state_checkpoint( later_kb_checkpoint ) ) ), new SubLObject[] { Values
        .arg2( Values.resetMultipleValues(), Values.multiple_value_list( destructure_kb_state_checkpoint( earlier_kb_checkpoint ) ) )
    } );
  }

  @SubLTranslatedFile.SubL(source = "cycl/hl-transcripts.lisp", position = 9474L)
  public static SubLObject save_hl_transcript(final SubLObject filename, SubLObject start_checkpoint, SubLObject end_checkpoint)
  {
    if( start_checkpoint == UNPROVIDED )
    {
      start_checkpoint = previous_dump_kb_state_checkpoint();
    }
    if( end_checkpoint == UNPROVIDED )
    {
      end_checkpoint = current_kb_state_checkpoint();
    }
    final SubLObject modification_spec = ConsesLow.list( $kw67$START_CHECKPOINT, start_checkpoint, $kw68$END_CHECKPOINT, end_checkpoint );
    return save_hl_transcript_from_modification_spec( filename, modification_spec );
  }

  @SubLTranslatedFile.SubL(source = "cycl/hl-transcripts.lisp", position = 10198L)
  public static SubLObject save_hl_transcript_from_modification_spec(final SubLObject filename, final SubLObject modification_spec)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject result = NIL;
    final SubLObject _prev_bind_0 = StreamsLow.$stream_initial_input_buffer_size$.currentBinding( thread );
    final SubLObject _prev_bind_2 = StreamsLow.$stream_initial_output_buffer_size$.currentBinding( thread );
    try
    {
      StreamsLow.$stream_initial_input_buffer_size$.bind( file_utilities.$default_big_stream_buffer_size$.getDynamicValue( thread ), thread );
      StreamsLow.$stream_initial_output_buffer_size$.bind( StreamsLow.$stream_initial_input_buffer_size$.getDynamicValue( thread ), thread );
      SubLObject stream = NIL;
      try
      {
        final SubLObject _prev_bind_0_$6 = stream_macros.$stream_requires_locking$.currentBinding( thread );
        try
        {
          stream_macros.$stream_requires_locking$.bind( NIL, thread );
          stream = compatibility.open_binary( filename, $kw69$OUTPUT );
        }
        finally
        {
          stream_macros.$stream_requires_locking$.rebind( _prev_bind_0_$6, thread );
        }
        if( !stream.isStream() )
        {
          Errors.error( $str70$Unable_to_open__S, filename );
        }
        final SubLObject stream_$7 = stream;
        result = save_hl_transcript_from_modification_spec_to_stream( stream_$7, modification_spec );
      }
      finally
      {
        final SubLObject _prev_bind_0_$7 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          if( stream.isStream() )
          {
            streams_high.close( stream, UNPROVIDED );
          }
          Values.restoreValuesFromVector( _values );
        }
        finally
        {
          Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$7, thread );
        }
      }
    }
    finally
    {
      StreamsLow.$stream_initial_output_buffer_size$.rebind( _prev_bind_2, thread );
      StreamsLow.$stream_initial_input_buffer_size$.rebind( _prev_bind_0, thread );
    }
    return result;
  }

  @SubLTranslatedFile.SubL(source = "cycl/hl-transcripts.lisp", position = 10540L)
  public static SubLObject load_hl_transcript_new(final SubLObject filename, SubLObject error_mode)
  {
    if( error_mode == UNPROVIDED )
    {
      error_mode = $kw71$WARN;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject total_ops = ZERO_INTEGER;
    SubLObject success_ops = ZERO_INTEGER;
    SubLObject file_size = NIL;
    final SubLObject _prev_bind_0 = StreamsLow.$stream_initial_input_buffer_size$.currentBinding( thread );
    final SubLObject _prev_bind_2 = StreamsLow.$stream_initial_output_buffer_size$.currentBinding( thread );
    try
    {
      StreamsLow.$stream_initial_input_buffer_size$.bind( file_utilities.$default_big_stream_buffer_size$.getDynamicValue( thread ), thread );
      StreamsLow.$stream_initial_output_buffer_size$.bind( StreamsLow.$stream_initial_input_buffer_size$.getDynamicValue( thread ), thread );
      SubLObject stream = NIL;
      try
      {
        final SubLObject _prev_bind_0_$9 = stream_macros.$stream_requires_locking$.currentBinding( thread );
        try
        {
          stream_macros.$stream_requires_locking$.bind( NIL, thread );
          stream = compatibility.open_binary( filename, $kw72$INPUT );
        }
        finally
        {
          stream_macros.$stream_requires_locking$.rebind( _prev_bind_0_$9, thread );
        }
        if( !stream.isStream() )
        {
          Errors.error( $str70$Unable_to_open__S, filename );
        }
        SubLObject stream_$10 = stream;
        stream_$10 = file_utilities.enable_file_stream_memory_mapping( stream_$10 );
        final SubLObject _prev_bind_0_$10 = cfasl.$cfasl_input_guid_string_resource$.currentBinding( thread );
        try
        {
          cfasl.$cfasl_input_guid_string_resource$.bind( cfasl.get_new_cfasl_input_guid_string_resource(), thread );
          file_size = streams_high.file_length( stream_$10 );
          final SubLObject _prev_bind_0_$11 = kb_control_vars.$forward_inference_enabledP$.currentBinding( thread );
          final SubLObject _prev_bind_1_$13 = utilities_macros.$last_percent_progress_index$.currentBinding( thread );
          final SubLObject _prev_bind_3 = utilities_macros.$last_percent_progress_prediction$.currentBinding( thread );
          final SubLObject _prev_bind_4 = utilities_macros.$within_noting_percent_progress$.currentBinding( thread );
          final SubLObject _prev_bind_5 = utilities_macros.$percent_progress_start_time$.currentBinding( thread );
          try
          {
            kb_control_vars.$forward_inference_enabledP$.bind( NIL, thread );
            utilities_macros.$last_percent_progress_index$.bind( ZERO_INTEGER, thread );
            utilities_macros.$last_percent_progress_prediction$.bind( NIL, thread );
            utilities_macros.$within_noting_percent_progress$.bind( T, thread );
            utilities_macros.$percent_progress_start_time$.bind( Time.get_universal_time(), thread );
            try
            {
              utilities_macros.noting_percent_progress_preamble( Sequences.cconcatenate( $str73$Loading_HL_Transcript_, format_nil.format_nil_a_no_copy( filename ) ) );
              SubLObject hl_op = load_one_hl_transcript_operation( stream_$10 );
              SubLObject sofar = streams_high.file_position( stream_$10, UNPROVIDED );
              while ( $kw74$EOF != hl_op)
              {
                utilities_macros.note_percent_progress( sofar, file_size );
                if( NIL != process_hl_transcript_operation( hl_op, error_mode, total_ops ) )
                {
                  success_ops = Numbers.add( success_ops, ONE_INTEGER );
                }
                total_ops = Numbers.add( total_ops, ONE_INTEGER );
                hl_op = load_one_hl_transcript_operation( stream_$10 );
                sofar = streams_high.file_position( stream_$10, UNPROVIDED );
              }
            }
            finally
            {
              final SubLObject _prev_bind_0_$12 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
              try
              {
                Threads.$is_thread_performing_cleanupP$.bind( T, thread );
                final SubLObject _values = Values.getValuesAsVector();
                utilities_macros.noting_percent_progress_postamble();
                Values.restoreValuesFromVector( _values );
              }
              finally
              {
                Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$12, thread );
              }
            }
          }
          finally
          {
            utilities_macros.$percent_progress_start_time$.rebind( _prev_bind_5, thread );
            utilities_macros.$within_noting_percent_progress$.rebind( _prev_bind_4, thread );
            utilities_macros.$last_percent_progress_prediction$.rebind( _prev_bind_3, thread );
            utilities_macros.$last_percent_progress_index$.rebind( _prev_bind_1_$13, thread );
            kb_control_vars.$forward_inference_enabledP$.rebind( _prev_bind_0_$11, thread );
          }
        }
        finally
        {
          cfasl.$cfasl_input_guid_string_resource$.rebind( _prev_bind_0_$10, thread );
        }
      }
      finally
      {
        final SubLObject _prev_bind_0_$13 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values2 = Values.getValuesAsVector();
          if( stream.isStream() )
          {
            streams_high.close( stream, UNPROVIDED );
          }
          Values.restoreValuesFromVector( _values2 );
        }
        finally
        {
          Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$13, thread );
        }
      }
    }
    finally
    {
      StreamsLow.$stream_initial_output_buffer_size$.rebind( _prev_bind_2, thread );
      StreamsLow.$stream_initial_input_buffer_size$.rebind( _prev_bind_0, thread );
    }
    return Values.values( total_ops, Numbers.subtract( total_ops, success_ops ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/hl-transcripts.lisp", position = 11579L)
  public static SubLObject show_hl_transcript(final SubLObject filename, SubLObject out_stream)
  {
    if( out_stream == UNPROVIDED )
    {
      out_stream = StreamsLow.$standard_output$.getDynamicValue();
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject total = ZERO_INTEGER;
    final SubLObject _prev_bind_0 = StreamsLow.$stream_initial_input_buffer_size$.currentBinding( thread );
    final SubLObject _prev_bind_2 = StreamsLow.$stream_initial_output_buffer_size$.currentBinding( thread );
    try
    {
      StreamsLow.$stream_initial_input_buffer_size$.bind( file_utilities.$default_big_stream_buffer_size$.getDynamicValue( thread ), thread );
      StreamsLow.$stream_initial_output_buffer_size$.bind( StreamsLow.$stream_initial_input_buffer_size$.getDynamicValue( thread ), thread );
      SubLObject stream = NIL;
      try
      {
        final SubLObject _prev_bind_0_$16 = stream_macros.$stream_requires_locking$.currentBinding( thread );
        try
        {
          stream_macros.$stream_requires_locking$.bind( NIL, thread );
          stream = compatibility.open_binary( filename, $kw72$INPUT );
        }
        finally
        {
          stream_macros.$stream_requires_locking$.rebind( _prev_bind_0_$16, thread );
        }
        if( !stream.isStream() )
        {
          Errors.error( $str70$Unable_to_open__S, filename );
        }
        SubLObject in_stream = stream;
        in_stream = file_utilities.enable_file_stream_memory_mapping( in_stream );
        final SubLObject _prev_bind_0_$17 = cfasl.$cfasl_input_guid_string_resource$.currentBinding( thread );
        try
        {
          cfasl.$cfasl_input_guid_string_resource$.bind( cfasl.get_new_cfasl_input_guid_string_resource(), thread );
          for( SubLObject hl_op = load_one_hl_transcript_operation( in_stream ); $kw74$EOF != hl_op; hl_op = load_one_hl_transcript_operation( in_stream ) )
          {
            show_hl_transcript_operation( hl_op, out_stream );
            total = Numbers.add( total, ONE_INTEGER );
          }
        }
        finally
        {
          cfasl.$cfasl_input_guid_string_resource$.rebind( _prev_bind_0_$17, thread );
        }
      }
      finally
      {
        final SubLObject _prev_bind_0_$18 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          if( stream.isStream() )
          {
            streams_high.close( stream, UNPROVIDED );
          }
          Values.restoreValuesFromVector( _values );
        }
        finally
        {
          Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$18, thread );
        }
      }
    }
    finally
    {
      StreamsLow.$stream_initial_output_buffer_size$.rebind( _prev_bind_2, thread );
      StreamsLow.$stream_initial_input_buffer_size$.rebind( _prev_bind_0, thread );
    }
    return total;
  }

  @SubLTranslatedFile.SubL(source = "cycl/hl-transcripts.lisp", position = 12310L)
  public static SubLObject with_hl_transcript_compression(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list75 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject stream = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list75 );
    stream = current.first();
    current = current.rest();
    SubLObject allow_other_keys_p = NIL;
    SubLObject rest = current;
    SubLObject bad = NIL;
    SubLObject current_$19 = NIL;
    while ( NIL != rest)
    {
      cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list75 );
      current_$19 = rest.first();
      rest = rest.rest();
      cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list75 );
      if( NIL == conses_high.member( current_$19, $list76, UNPROVIDED, UNPROVIDED ) )
      {
        bad = T;
      }
      if( current_$19 == $kw2$ALLOW_OTHER_KEYS )
      {
        allow_other_keys_p = rest.first();
      }
      rest = rest.rest();
    }
    if( NIL != bad && NIL == allow_other_keys_p )
    {
      cdestructuring_bind.cdestructuring_bind_error( datum, $list75 );
    }
    final SubLObject modification_spec_tail = cdestructuring_bind.property_list_member( $kw77$MODIFICATION_SPEC, current );
    final SubLObject modification_spec = ( NIL != modification_spec_tail ) ? conses_high.cadr( modification_spec_tail ) : NIL;
    final SubLObject body;
    current = ( body = temp );
    final SubLObject mod_spec_var = $sym78$MOD_SPEC_VAR;
    final SubLObject objects_to_compress = $sym79$OBJECTS_TO_COMPRESS;
    final SubLObject compression_sample = $sym80$COMPRESSION_SAMPLE;
    final SubLObject compression_options = $sym81$COMPRESSION_OPTIONS;
    return ConsesLow.list( $sym9$CLET, ConsesLow.list( ConsesLow.list( mod_spec_var, modification_spec ), ConsesLow.list( objects_to_compress, ConsesLow.list( $sym82$HL_TRANSCRIPT_OBJECTS_TO_COMPRESS, mod_spec_var ) ),
        ConsesLow.list( compression_sample, ConsesLow.list( $sym83$APPEND, objects_to_compress, objects_to_compress ) ), ConsesLow.list( compression_options, ConsesLow.list( $sym84$LIST, $kw85$EXTERNALIZED_, T,
            $kw86$ANALYZE, compression_sample ) ) ), ConsesLow.listS( $sym87$WITH_CFASL_COMPRESSION, ConsesLow.list( stream, compression_options ), ConsesLow.append( body, NIL ) ), ConsesLow.list(
                $sym88$SAVE_ONE_HL_TRANSCRIPT_OPERATION, $list89, stream ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/hl-transcripts.lisp", position = 13370L)
  public static SubLObject save_hl_transcript_from_modification_spec_to_stream(final SubLObject stream, final SubLObject modification_spec)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject result = NIL;
    if( NIL != $hl_transcript_compression_enabledP$.getDynamicValue( thread ) )
    {
      final SubLObject objects_to_compress = hl_transcript_objects_to_compress( modification_spec );
      final SubLObject compression_sample = ConsesLow.append( objects_to_compress, objects_to_compress );
      final SubLObject compression_options = ConsesLow.list( $kw85$EXTERNALIZED_, T, $kw86$ANALYZE, compression_sample );
      final SubLObject _prev_bind_0 = cfasl_compression.$cfasl_output_compression_options$.currentBinding( thread );
      final SubLObject _prev_bind_2 = cfasl_compression.$cfasl_output_compression_code_isg$.currentBinding( thread );
      final SubLObject _prev_bind_3 = cfasl_compression.$cfasl_output_compression_table$.currentBinding( thread );
      try
      {
        cfasl_compression.$cfasl_output_compression_options$.bind( compression_options, thread );
        cfasl_compression.$cfasl_output_compression_code_isg$.bind( integer_sequence_generator.new_integer_sequence_generator( UNPROVIDED, UNPROVIDED, UNPROVIDED ), thread );
        cfasl_compression.$cfasl_output_compression_table$.bind( cfasl_compression.with_cfasl_compression_cfasl_output_compression_table( stream ), thread );
        cfasl_compression.with_cfasl_compression_preamble( stream );
        result = save_hl_transcript_from_modification_spec_to_stream_int( stream, modification_spec );
        cfasl_compression.with_cfasl_compression_postamble( stream );
      }
      finally
      {
        cfasl_compression.$cfasl_output_compression_table$.rebind( _prev_bind_3, thread );
        cfasl_compression.$cfasl_output_compression_code_isg$.rebind( _prev_bind_2, thread );
        cfasl_compression.$cfasl_output_compression_options$.rebind( _prev_bind_0, thread );
      }
      save_one_hl_transcript_operation( $list90, stream );
    }
    else
    {
      result = save_hl_transcript_from_modification_spec_to_stream_int( stream, modification_spec );
    }
    return result;
  }

  @SubLTranslatedFile.SubL(source = "cycl/hl-transcripts.lisp", position = 13832L)
  public static SubLObject save_hl_transcript_from_modification_spec_to_stream_int(final SubLObject stream, final SubLObject hl_modification_spec)
  {
    final SubLObject removals_result = save_hl_transcript_removals_from_modification_spec_to_stream( stream, hl_modification_spec );
    final SubLObject additions_result = save_hl_transcript_additions_from_modification_spec_to_stream( stream, hl_modification_spec );
    final SubLObject complete_result = list_utilities.merge_plist( additions_result, removals_result );
    return complete_result;
  }

  @SubLTranslatedFile.SubL(source = "cycl/hl-transcripts.lisp", position = 14265L)
  public static SubLObject save_hl_transcript_additions_from_modification_spec_to_stream(final SubLObject stream, final SubLObject hl_modification_spec)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject start_checkpoint_tail = cdestructuring_bind.property_list_member( $kw67$START_CHECKPOINT, hl_modification_spec );
    final SubLObject start_checkpoint = ( NIL != start_checkpoint_tail ) ? conses_high.cadr( start_checkpoint_tail ) : NIL;
    final SubLObject end_checkpoint_tail = cdestructuring_bind.property_list_member( $kw68$END_CHECKPOINT, hl_modification_spec );
    final SubLObject end_checkpoint = ( NIL != end_checkpoint_tail ) ? conses_high.cadr( end_checkpoint_tail ) : NIL;
    final SubLObject new_constants_tail = cdestructuring_bind.property_list_member( $kw91$NEW_CONSTANTS, hl_modification_spec );
    final SubLObject new_constants = ( NIL != new_constants_tail ) ? conses_high.cadr( new_constants_tail ) : NIL;
    final SubLObject new_narts_tail = cdestructuring_bind.property_list_member( $kw92$NEW_NARTS, hl_modification_spec );
    final SubLObject new_narts = ( NIL != new_narts_tail ) ? conses_high.cadr( new_narts_tail ) : NIL;
    final SubLObject new_assertions_tail = cdestructuring_bind.property_list_member( $kw93$NEW_ASSERTIONS, hl_modification_spec );
    final SubLObject new_assertions = ( NIL != new_assertions_tail ) ? conses_high.cadr( new_assertions_tail ) : NIL;
    final SubLObject new_kb_hl_supports_tail = cdestructuring_bind.property_list_member( $kw94$NEW_KB_HL_SUPPORTS, hl_modification_spec );
    final SubLObject new_kb_hl_supports = ( NIL != new_kb_hl_supports_tail ) ? conses_high.cadr( new_kb_hl_supports_tail ) : NIL;
    final SubLObject new_deductions_tail = cdestructuring_bind.property_list_member( $kw95$NEW_DEDUCTIONS, hl_modification_spec );
    final SubLObject new_deductions = ( NIL != new_deductions_tail ) ? conses_high.cadr( new_deductions_tail ) : NIL;
    final SubLObject kb_checkpointP = makeBoolean( NIL != start_checkpoint && NIL != end_checkpoint );
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
    if( NIL != kb_checkpointP )
    {
      thread.resetMultipleValues();
      final SubLObject constant_suid_start_$20 = destructure_kb_state_checkpoint( start_checkpoint );
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
      final SubLObject constant_suid_end_$25 = destructure_kb_state_checkpoint( end_checkpoint );
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
    if( NIL != kb_checkpointP )
    {
      final SubLObject progress_var = $str96$saving_constants;
      final SubLObject total_var = Numbers.subtract( constant_suid_end, constant_suid_start );
      final SubLObject _prev_bind_0 = utilities_macros.$last_percent_progress_index$.currentBinding( thread );
      final SubLObject _prev_bind_2 = utilities_macros.$last_percent_progress_prediction$.currentBinding( thread );
      final SubLObject _prev_bind_3 = utilities_macros.$within_noting_percent_progress$.currentBinding( thread );
      final SubLObject _prev_bind_4 = utilities_macros.$percent_progress_start_time$.currentBinding( thread );
      try
      {
        utilities_macros.$last_percent_progress_index$.bind( ZERO_INTEGER, thread );
        utilities_macros.$last_percent_progress_prediction$.bind( NIL, thread );
        utilities_macros.$within_noting_percent_progress$.bind( T, thread );
        utilities_macros.$percent_progress_start_time$.bind( Time.get_universal_time(), thread );
        try
        {
          utilities_macros.noting_percent_progress_preamble( progress_var );
          SubLObject end_var;
          SubLObject id_var;
          SubLObject constant;
          for( end_var = constant_suid_end, id_var = NIL, id_var = constant_suid_start; !id_var.numGE( end_var ); id_var = number_utilities.f_1X( id_var ) )
          {
            constant = constants_high.find_constant_by_internal_id( id_var );
            if( NIL != constant_handles.constant_p( constant ) )
            {
              note_constants_by_internal_id_progress( constant, constant_suid_start, total_var );
              write_constant_to_hl_transcript_stream( constant, stream );
              total_constants = Numbers.add( total_constants, ONE_INTEGER );
            }
          }
        }
        finally
        {
          final SubLObject _prev_bind_0_$30 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
          try
          {
            Threads.$is_thread_performing_cleanupP$.bind( T, thread );
            final SubLObject _values = Values.getValuesAsVector();
            utilities_macros.noting_percent_progress_postamble();
            Values.restoreValuesFromVector( _values );
          }
          finally
          {
            Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$30, thread );
          }
        }
      }
      finally
      {
        utilities_macros.$percent_progress_start_time$.rebind( _prev_bind_4, thread );
        utilities_macros.$within_noting_percent_progress$.rebind( _prev_bind_3, thread );
        utilities_macros.$last_percent_progress_prediction$.rebind( _prev_bind_2, thread );
        utilities_macros.$last_percent_progress_index$.rebind( _prev_bind_0, thread );
      }
    }
    if( NIL != new_constants )
    {
      final SubLObject message_var = $str96$saving_constants;
      final SubLObject list_var = new_constants;
      SubLObject sofar = ZERO_INTEGER;
      final SubLObject total = Sequences.length( list_var );
      final SubLObject _prev_bind_5 = utilities_macros.$last_percent_progress_index$.currentBinding( thread );
      final SubLObject _prev_bind_6 = utilities_macros.$last_percent_progress_prediction$.currentBinding( thread );
      final SubLObject _prev_bind_7 = utilities_macros.$within_noting_percent_progress$.currentBinding( thread );
      final SubLObject _prev_bind_8 = utilities_macros.$percent_progress_start_time$.currentBinding( thread );
      try
      {
        utilities_macros.$last_percent_progress_index$.bind( ZERO_INTEGER, thread );
        utilities_macros.$last_percent_progress_prediction$.bind( NIL, thread );
        utilities_macros.$within_noting_percent_progress$.bind( T, thread );
        utilities_macros.$percent_progress_start_time$.bind( Time.get_universal_time(), thread );
        try
        {
          utilities_macros.noting_percent_progress_preamble( message_var );
          SubLObject cdolist_list_var = list_var;
          SubLObject constant2 = NIL;
          constant2 = cdolist_list_var.first();
          while ( NIL != cdolist_list_var)
          {
            utilities_macros.note_percent_progress( sofar, total );
            sofar = Numbers.add( sofar, ONE_INTEGER );
            write_constant_to_hl_transcript_stream( constant2, stream );
            total_constants = Numbers.add( total_constants, ONE_INTEGER );
            cdolist_list_var = cdolist_list_var.rest();
            constant2 = cdolist_list_var.first();
          }
        }
        finally
        {
          final SubLObject _prev_bind_0_$31 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
          try
          {
            Threads.$is_thread_performing_cleanupP$.bind( T, thread );
            final SubLObject _values2 = Values.getValuesAsVector();
            utilities_macros.noting_percent_progress_postamble();
            Values.restoreValuesFromVector( _values2 );
          }
          finally
          {
            Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$31, thread );
          }
        }
      }
      finally
      {
        utilities_macros.$percent_progress_start_time$.rebind( _prev_bind_8, thread );
        utilities_macros.$within_noting_percent_progress$.rebind( _prev_bind_7, thread );
        utilities_macros.$last_percent_progress_prediction$.rebind( _prev_bind_6, thread );
        utilities_macros.$last_percent_progress_index$.rebind( _prev_bind_5, thread );
      }
    }
    if( NIL != kb_checkpointP )
    {
      final SubLObject progress_var = $str97$saving_NARTs;
      final SubLObject total_var = Numbers.subtract( nart_id_end, nart_id_start );
      final SubLObject _prev_bind_0 = utilities_macros.$last_percent_progress_index$.currentBinding( thread );
      final SubLObject _prev_bind_2 = utilities_macros.$last_percent_progress_prediction$.currentBinding( thread );
      final SubLObject _prev_bind_3 = utilities_macros.$within_noting_percent_progress$.currentBinding( thread );
      final SubLObject _prev_bind_4 = utilities_macros.$percent_progress_start_time$.currentBinding( thread );
      try
      {
        utilities_macros.$last_percent_progress_index$.bind( ZERO_INTEGER, thread );
        utilities_macros.$last_percent_progress_prediction$.bind( NIL, thread );
        utilities_macros.$within_noting_percent_progress$.bind( T, thread );
        utilities_macros.$percent_progress_start_time$.bind( Time.get_universal_time(), thread );
        try
        {
          utilities_macros.noting_percent_progress_preamble( progress_var );
          SubLObject end_var;
          SubLObject id_var;
          SubLObject nart;
          for( end_var = nart_id_end, id_var = NIL, id_var = nart_id_start; !id_var.numGE( end_var ); id_var = number_utilities.f_1X( id_var ) )
          {
            nart = nart_handles.find_nart_by_id( id_var );
            if( NIL != nart_handles.nart_p( nart ) )
            {
              note_narts_by_id_progress( nart, nart_id_start, total_var );
              write_nart_to_hl_transcript_stream( nart, stream );
              total_narts = Numbers.add( total_narts, ONE_INTEGER );
            }
          }
        }
        finally
        {
          final SubLObject _prev_bind_0_$32 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
          try
          {
            Threads.$is_thread_performing_cleanupP$.bind( T, thread );
            final SubLObject _values3 = Values.getValuesAsVector();
            utilities_macros.noting_percent_progress_postamble();
            Values.restoreValuesFromVector( _values3 );
          }
          finally
          {
            Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$32, thread );
          }
        }
      }
      finally
      {
        utilities_macros.$percent_progress_start_time$.rebind( _prev_bind_4, thread );
        utilities_macros.$within_noting_percent_progress$.rebind( _prev_bind_3, thread );
        utilities_macros.$last_percent_progress_prediction$.rebind( _prev_bind_2, thread );
        utilities_macros.$last_percent_progress_index$.rebind( _prev_bind_0, thread );
      }
    }
    if( NIL != new_narts )
    {
      final SubLObject message_var = $str97$saving_NARTs;
      final SubLObject list_var = new_narts;
      SubLObject sofar = ZERO_INTEGER;
      final SubLObject total = Sequences.length( list_var );
      final SubLObject _prev_bind_5 = utilities_macros.$last_percent_progress_index$.currentBinding( thread );
      final SubLObject _prev_bind_6 = utilities_macros.$last_percent_progress_prediction$.currentBinding( thread );
      final SubLObject _prev_bind_7 = utilities_macros.$within_noting_percent_progress$.currentBinding( thread );
      final SubLObject _prev_bind_8 = utilities_macros.$percent_progress_start_time$.currentBinding( thread );
      try
      {
        utilities_macros.$last_percent_progress_index$.bind( ZERO_INTEGER, thread );
        utilities_macros.$last_percent_progress_prediction$.bind( NIL, thread );
        utilities_macros.$within_noting_percent_progress$.bind( T, thread );
        utilities_macros.$percent_progress_start_time$.bind( Time.get_universal_time(), thread );
        try
        {
          utilities_macros.noting_percent_progress_preamble( message_var );
          SubLObject cdolist_list_var = list_var;
          SubLObject nart2 = NIL;
          nart2 = cdolist_list_var.first();
          while ( NIL != cdolist_list_var)
          {
            utilities_macros.note_percent_progress( sofar, total );
            sofar = Numbers.add( sofar, ONE_INTEGER );
            write_nart_to_hl_transcript_stream( nart2, stream );
            total_narts = Numbers.add( total_narts, ONE_INTEGER );
            cdolist_list_var = cdolist_list_var.rest();
            nart2 = cdolist_list_var.first();
          }
        }
        finally
        {
          final SubLObject _prev_bind_0_$33 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
          try
          {
            Threads.$is_thread_performing_cleanupP$.bind( T, thread );
            final SubLObject _values4 = Values.getValuesAsVector();
            utilities_macros.noting_percent_progress_postamble();
            Values.restoreValuesFromVector( _values4 );
          }
          finally
          {
            Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$33, thread );
          }
        }
      }
      finally
      {
        utilities_macros.$percent_progress_start_time$.rebind( _prev_bind_8, thread );
        utilities_macros.$within_noting_percent_progress$.rebind( _prev_bind_7, thread );
        utilities_macros.$last_percent_progress_prediction$.rebind( _prev_bind_6, thread );
        utilities_macros.$last_percent_progress_index$.rebind( _prev_bind_5, thread );
      }
    }
    if( NIL != kb_checkpointP )
    {
      final SubLObject progress_var = $str98$saving_assertions;
      final SubLObject total_var = Numbers.subtract( assertion_id_end, assertion_id_start );
      final SubLObject _prev_bind_0 = utilities_macros.$last_percent_progress_index$.currentBinding( thread );
      final SubLObject _prev_bind_2 = utilities_macros.$last_percent_progress_prediction$.currentBinding( thread );
      final SubLObject _prev_bind_3 = utilities_macros.$within_noting_percent_progress$.currentBinding( thread );
      final SubLObject _prev_bind_4 = utilities_macros.$percent_progress_start_time$.currentBinding( thread );
      try
      {
        utilities_macros.$last_percent_progress_index$.bind( ZERO_INTEGER, thread );
        utilities_macros.$last_percent_progress_prediction$.bind( NIL, thread );
        utilities_macros.$within_noting_percent_progress$.bind( T, thread );
        utilities_macros.$percent_progress_start_time$.bind( Time.get_universal_time(), thread );
        try
        {
          utilities_macros.noting_percent_progress_preamble( progress_var );
          SubLObject end_var;
          SubLObject id_var;
          SubLObject assertion;
          for( end_var = assertion_id_end, id_var = NIL, id_var = assertion_id_start; !id_var.numGE( end_var ); id_var = number_utilities.f_1X( id_var ) )
          {
            assertion = assertion_handles.find_assertion_by_id( id_var );
            if( NIL != assertion_handles.assertion_p( assertion ) )
            {
              note_assertions_by_id_progress( assertion, assertion_id_start, total_var );
              write_assertion_to_hl_transcript_stream( assertion, stream );
              total_assertions = Numbers.add( total_assertions, ONE_INTEGER );
            }
          }
        }
        finally
        {
          final SubLObject _prev_bind_0_$34 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
          try
          {
            Threads.$is_thread_performing_cleanupP$.bind( T, thread );
            final SubLObject _values5 = Values.getValuesAsVector();
            utilities_macros.noting_percent_progress_postamble();
            Values.restoreValuesFromVector( _values5 );
          }
          finally
          {
            Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$34, thread );
          }
        }
      }
      finally
      {
        utilities_macros.$percent_progress_start_time$.rebind( _prev_bind_4, thread );
        utilities_macros.$within_noting_percent_progress$.rebind( _prev_bind_3, thread );
        utilities_macros.$last_percent_progress_prediction$.rebind( _prev_bind_2, thread );
        utilities_macros.$last_percent_progress_index$.rebind( _prev_bind_0, thread );
      }
    }
    if( NIL != new_assertions )
    {
      final SubLObject message_var = $str98$saving_assertions;
      final SubLObject list_var = new_assertions;
      SubLObject sofar = ZERO_INTEGER;
      final SubLObject total = Sequences.length( list_var );
      final SubLObject _prev_bind_5 = utilities_macros.$last_percent_progress_index$.currentBinding( thread );
      final SubLObject _prev_bind_6 = utilities_macros.$last_percent_progress_prediction$.currentBinding( thread );
      final SubLObject _prev_bind_7 = utilities_macros.$within_noting_percent_progress$.currentBinding( thread );
      final SubLObject _prev_bind_8 = utilities_macros.$percent_progress_start_time$.currentBinding( thread );
      try
      {
        utilities_macros.$last_percent_progress_index$.bind( ZERO_INTEGER, thread );
        utilities_macros.$last_percent_progress_prediction$.bind( NIL, thread );
        utilities_macros.$within_noting_percent_progress$.bind( T, thread );
        utilities_macros.$percent_progress_start_time$.bind( Time.get_universal_time(), thread );
        try
        {
          utilities_macros.noting_percent_progress_preamble( message_var );
          SubLObject cdolist_list_var = list_var;
          SubLObject assertion2 = NIL;
          assertion2 = cdolist_list_var.first();
          while ( NIL != cdolist_list_var)
          {
            utilities_macros.note_percent_progress( sofar, total );
            sofar = Numbers.add( sofar, ONE_INTEGER );
            write_assertion_to_hl_transcript_stream( assertion2, stream );
            total_assertions = Numbers.add( total_assertions, ONE_INTEGER );
            cdolist_list_var = cdolist_list_var.rest();
            assertion2 = cdolist_list_var.first();
          }
        }
        finally
        {
          final SubLObject _prev_bind_0_$35 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
          try
          {
            Threads.$is_thread_performing_cleanupP$.bind( T, thread );
            final SubLObject _values6 = Values.getValuesAsVector();
            utilities_macros.noting_percent_progress_postamble();
            Values.restoreValuesFromVector( _values6 );
          }
          finally
          {
            Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$35, thread );
          }
        }
      }
      finally
      {
        utilities_macros.$percent_progress_start_time$.rebind( _prev_bind_8, thread );
        utilities_macros.$within_noting_percent_progress$.rebind( _prev_bind_7, thread );
        utilities_macros.$last_percent_progress_prediction$.rebind( _prev_bind_6, thread );
        utilities_macros.$last_percent_progress_index$.rebind( _prev_bind_5, thread );
      }
    }
    if( NIL != kb_checkpointP )
    {
      final SubLObject progress_var = $str99$saving_KB_HL_supports;
      final SubLObject total_var = Numbers.subtract( kb_hl_support_id_end, kb_hl_support_id_start );
      final SubLObject _prev_bind_0 = utilities_macros.$last_percent_progress_index$.currentBinding( thread );
      final SubLObject _prev_bind_2 = utilities_macros.$last_percent_progress_prediction$.currentBinding( thread );
      final SubLObject _prev_bind_3 = utilities_macros.$within_noting_percent_progress$.currentBinding( thread );
      final SubLObject _prev_bind_4 = utilities_macros.$percent_progress_start_time$.currentBinding( thread );
      try
      {
        utilities_macros.$last_percent_progress_index$.bind( ZERO_INTEGER, thread );
        utilities_macros.$last_percent_progress_prediction$.bind( NIL, thread );
        utilities_macros.$within_noting_percent_progress$.bind( T, thread );
        utilities_macros.$percent_progress_start_time$.bind( Time.get_universal_time(), thread );
        try
        {
          utilities_macros.noting_percent_progress_preamble( progress_var );
          SubLObject end_var;
          SubLObject id_var;
          SubLObject kb_hl_support;
          for( end_var = kb_hl_support_id_end, id_var = NIL, id_var = kb_hl_support_id_start; !id_var.numGE( end_var ); id_var = number_utilities.f_1X( id_var ) )
          {
            kb_hl_support = kb_hl_support_handles.find_kb_hl_support_by_id( id_var );
            if( NIL != kb_hl_support_handles.kb_hl_support_p( kb_hl_support ) )
            {
              note_kb_hl_supports_by_id_progress( kb_hl_support, kb_hl_support_id_start, total_var );
              write_kb_hl_support_to_hl_transcript_stream( kb_hl_support, stream );
              total_kb_hl_supports = Numbers.add( total_kb_hl_supports, ONE_INTEGER );
            }
          }
        }
        finally
        {
          final SubLObject _prev_bind_0_$36 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
          try
          {
            Threads.$is_thread_performing_cleanupP$.bind( T, thread );
            final SubLObject _values7 = Values.getValuesAsVector();
            utilities_macros.noting_percent_progress_postamble();
            Values.restoreValuesFromVector( _values7 );
          }
          finally
          {
            Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$36, thread );
          }
        }
      }
      finally
      {
        utilities_macros.$percent_progress_start_time$.rebind( _prev_bind_4, thread );
        utilities_macros.$within_noting_percent_progress$.rebind( _prev_bind_3, thread );
        utilities_macros.$last_percent_progress_prediction$.rebind( _prev_bind_2, thread );
        utilities_macros.$last_percent_progress_index$.rebind( _prev_bind_0, thread );
      }
    }
    if( NIL != new_kb_hl_supports )
    {
      final SubLObject message_var = $str99$saving_KB_HL_supports;
      final SubLObject list_var = new_kb_hl_supports;
      SubLObject sofar = ZERO_INTEGER;
      final SubLObject total = Sequences.length( list_var );
      final SubLObject _prev_bind_5 = utilities_macros.$last_percent_progress_index$.currentBinding( thread );
      final SubLObject _prev_bind_6 = utilities_macros.$last_percent_progress_prediction$.currentBinding( thread );
      final SubLObject _prev_bind_7 = utilities_macros.$within_noting_percent_progress$.currentBinding( thread );
      final SubLObject _prev_bind_8 = utilities_macros.$percent_progress_start_time$.currentBinding( thread );
      try
      {
        utilities_macros.$last_percent_progress_index$.bind( ZERO_INTEGER, thread );
        utilities_macros.$last_percent_progress_prediction$.bind( NIL, thread );
        utilities_macros.$within_noting_percent_progress$.bind( T, thread );
        utilities_macros.$percent_progress_start_time$.bind( Time.get_universal_time(), thread );
        try
        {
          utilities_macros.noting_percent_progress_preamble( message_var );
          SubLObject cdolist_list_var = list_var;
          SubLObject kb_hl_support2 = NIL;
          kb_hl_support2 = cdolist_list_var.first();
          while ( NIL != cdolist_list_var)
          {
            utilities_macros.note_percent_progress( sofar, total );
            sofar = Numbers.add( sofar, ONE_INTEGER );
            write_kb_hl_support_to_hl_transcript_stream( kb_hl_support2, stream );
            total_kb_hl_supports = Numbers.add( total_kb_hl_supports, ONE_INTEGER );
            cdolist_list_var = cdolist_list_var.rest();
            kb_hl_support2 = cdolist_list_var.first();
          }
        }
        finally
        {
          final SubLObject _prev_bind_0_$37 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
          try
          {
            Threads.$is_thread_performing_cleanupP$.bind( T, thread );
            final SubLObject _values8 = Values.getValuesAsVector();
            utilities_macros.noting_percent_progress_postamble();
            Values.restoreValuesFromVector( _values8 );
          }
          finally
          {
            Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$37, thread );
          }
        }
      }
      finally
      {
        utilities_macros.$percent_progress_start_time$.rebind( _prev_bind_8, thread );
        utilities_macros.$within_noting_percent_progress$.rebind( _prev_bind_7, thread );
        utilities_macros.$last_percent_progress_prediction$.rebind( _prev_bind_6, thread );
        utilities_macros.$last_percent_progress_index$.rebind( _prev_bind_5, thread );
      }
    }
    if( NIL != kb_checkpointP )
    {
      final SubLObject progress_var = $str100$saving_deductions;
      final SubLObject total_var = Numbers.subtract( deduction_id_end, deduction_id_start );
      final SubLObject _prev_bind_0 = utilities_macros.$last_percent_progress_index$.currentBinding( thread );
      final SubLObject _prev_bind_2 = utilities_macros.$last_percent_progress_prediction$.currentBinding( thread );
      final SubLObject _prev_bind_3 = utilities_macros.$within_noting_percent_progress$.currentBinding( thread );
      final SubLObject _prev_bind_4 = utilities_macros.$percent_progress_start_time$.currentBinding( thread );
      try
      {
        utilities_macros.$last_percent_progress_index$.bind( ZERO_INTEGER, thread );
        utilities_macros.$last_percent_progress_prediction$.bind( NIL, thread );
        utilities_macros.$within_noting_percent_progress$.bind( T, thread );
        utilities_macros.$percent_progress_start_time$.bind( Time.get_universal_time(), thread );
        try
        {
          utilities_macros.noting_percent_progress_preamble( progress_var );
          SubLObject end_var;
          SubLObject id_var;
          SubLObject deduction;
          for( end_var = deduction_id_end, id_var = NIL, id_var = deduction_id_start; !id_var.numGE( end_var ); id_var = number_utilities.f_1X( id_var ) )
          {
            deduction = deduction_handles.find_deduction_by_id( id_var );
            if( NIL != deduction_handles.deduction_p( deduction ) )
            {
              note_deductions_by_id_progress( deduction, deduction_id_start, total_var );
              write_deduction_to_hl_transcript_stream( deduction, stream );
              total_deductions = Numbers.add( total_deductions, ONE_INTEGER );
            }
          }
        }
        finally
        {
          final SubLObject _prev_bind_0_$38 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
          try
          {
            Threads.$is_thread_performing_cleanupP$.bind( T, thread );
            final SubLObject _values9 = Values.getValuesAsVector();
            utilities_macros.noting_percent_progress_postamble();
            Values.restoreValuesFromVector( _values9 );
          }
          finally
          {
            Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$38, thread );
          }
        }
      }
      finally
      {
        utilities_macros.$percent_progress_start_time$.rebind( _prev_bind_4, thread );
        utilities_macros.$within_noting_percent_progress$.rebind( _prev_bind_3, thread );
        utilities_macros.$last_percent_progress_prediction$.rebind( _prev_bind_2, thread );
        utilities_macros.$last_percent_progress_index$.rebind( _prev_bind_0, thread );
      }
    }
    if( NIL != new_deductions )
    {
      final SubLObject message_var = $str100$saving_deductions;
      final SubLObject list_var = new_deductions;
      SubLObject sofar = ZERO_INTEGER;
      final SubLObject total = Sequences.length( list_var );
      final SubLObject _prev_bind_5 = utilities_macros.$last_percent_progress_index$.currentBinding( thread );
      final SubLObject _prev_bind_6 = utilities_macros.$last_percent_progress_prediction$.currentBinding( thread );
      final SubLObject _prev_bind_7 = utilities_macros.$within_noting_percent_progress$.currentBinding( thread );
      final SubLObject _prev_bind_8 = utilities_macros.$percent_progress_start_time$.currentBinding( thread );
      try
      {
        utilities_macros.$last_percent_progress_index$.bind( ZERO_INTEGER, thread );
        utilities_macros.$last_percent_progress_prediction$.bind( NIL, thread );
        utilities_macros.$within_noting_percent_progress$.bind( T, thread );
        utilities_macros.$percent_progress_start_time$.bind( Time.get_universal_time(), thread );
        try
        {
          utilities_macros.noting_percent_progress_preamble( message_var );
          SubLObject cdolist_list_var = list_var;
          SubLObject deduction2 = NIL;
          deduction2 = cdolist_list_var.first();
          while ( NIL != cdolist_list_var)
          {
            utilities_macros.note_percent_progress( sofar, total );
            sofar = Numbers.add( sofar, ONE_INTEGER );
            write_deduction_to_hl_transcript_stream( deduction2, stream );
            total_deductions = Numbers.add( total_deductions, ONE_INTEGER );
            cdolist_list_var = cdolist_list_var.rest();
            deduction2 = cdolist_list_var.first();
          }
        }
        finally
        {
          final SubLObject _prev_bind_0_$39 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
          try
          {
            Threads.$is_thread_performing_cleanupP$.bind( T, thread );
            final SubLObject _values10 = Values.getValuesAsVector();
            utilities_macros.noting_percent_progress_postamble();
            Values.restoreValuesFromVector( _values10 );
          }
          finally
          {
            Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$39, thread );
          }
        }
      }
      finally
      {
        utilities_macros.$percent_progress_start_time$.rebind( _prev_bind_8, thread );
        utilities_macros.$within_noting_percent_progress$.rebind( _prev_bind_7, thread );
        utilities_macros.$last_percent_progress_prediction$.rebind( _prev_bind_6, thread );
        utilities_macros.$last_percent_progress_index$.rebind( _prev_bind_5, thread );
      }
    }
    result = ConsesLow.list( new SubLObject[] { $kw101$CONSTANTS, total_constants, $kw102$NARTS, total_narts, $kw103$ASSERTIONS, total_assertions, $kw104$KB_HL_SUPPORTS, total_kb_hl_supports, $kw105$DEDUCTIONS,
      total_deductions
    } );
    return result;
  }

  @SubLTranslatedFile.SubL(source = "cycl/hl-transcripts.lisp", position = 18006L)
  public static SubLObject save_hl_transcript_removals_from_modification_spec_to_stream(final SubLObject stream, final SubLObject hl_modification_spec)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject transcript_file_tail = cdestructuring_bind.property_list_member( $kw106$TRANSCRIPT_FILE, hl_modification_spec );
    final SubLObject transcript_file = ( NIL != transcript_file_tail ) ? conses_high.cadr( transcript_file_tail ) : NIL;
    final SubLObject remove_constants_tail = cdestructuring_bind.property_list_member( $kw107$REMOVE_CONSTANTS, hl_modification_spec );
    final SubLObject remove_constants = ( NIL != remove_constants_tail ) ? conses_high.cadr( remove_constants_tail ) : NIL;
    final SubLObject remove_narts_tail = cdestructuring_bind.property_list_member( $kw108$REMOVE_NARTS, hl_modification_spec );
    final SubLObject remove_narts = ( NIL != remove_narts_tail ) ? conses_high.cadr( remove_narts_tail ) : NIL;
    final SubLObject remove_assertions_tail = cdestructuring_bind.property_list_member( $kw109$REMOVE_ASSERTIONS, hl_modification_spec );
    final SubLObject remove_assertions = ( NIL != remove_assertions_tail ) ? conses_high.cadr( remove_assertions_tail ) : NIL;
    final SubLObject remove_deductions_tail = cdestructuring_bind.property_list_member( $kw110$REMOVE_DEDUCTIONS, hl_modification_spec );
    final SubLObject remove_deductions = ( NIL != remove_deductions_tail ) ? conses_high.cadr( remove_deductions_tail ) : NIL;
    SubLObject total_constants = ZERO_INTEGER;
    final SubLObject total_narts = ZERO_INTEGER;
    SubLObject total_assertions = ZERO_INTEGER;
    final SubLObject total_kb_hl_supports = ZERO_INTEGER;
    final SubLObject total_deductions = ZERO_INTEGER;
    SubLObject result = NIL;
    if( NIL != remove_constants )
    {
      SubLObject cdolist_list_var = remove_constants;
      SubLObject constant = NIL;
      constant = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        write_existing_constant_removal_to_hl_transcript_stream( constant, stream );
        total_constants = Numbers.add( total_constants, ONE_INTEGER );
        cdolist_list_var = cdolist_list_var.rest();
        constant = cdolist_list_var.first();
      }
    }
    if( NIL != transcript_file )
    {
      SubLObject current_$41;
      final SubLObject datum_$40 = current_$41 = transcript_file.isString() ? ConsesLow.list( transcript_file ) : transcript_file;
      SubLObject transcript_filename = NIL;
      cdestructuring_bind.destructuring_bind_must_consp( current_$41, datum_$40, $list111 );
      transcript_filename = current_$41.first();
      current_$41 = current_$41.rest();
      final SubLObject start_op = current_$41.isCons() ? current_$41.first() : ZERO_INTEGER;
      cdestructuring_bind.destructuring_bind_must_listp( current_$41, datum_$40, $list111 );
      current_$41 = current_$41.rest();
      final SubLObject end_op = current_$41.isCons() ? current_$41.first() : NIL;
      cdestructuring_bind.destructuring_bind_must_listp( current_$41, datum_$40, $list111 );
      current_$41 = current_$41.rest();
      if( NIL == current_$41 )
      {
        final SubLObject op_iterator = new_transcript_file_kb_removal_operations_iterator( transcript_filename, start_op, end_op );
        try
        {
          SubLObject valid;
          for( SubLObject done_var = NIL; NIL == done_var; done_var = makeBoolean( NIL == valid ) )
          {
            thread.resetMultipleValues();
            final SubLObject op = iteration.iteration_next( op_iterator );
            valid = thread.secondMultipleValue();
            thread.resetMultipleValues();
            if( NIL != valid )
            {
              final SubLObject form = conses_high.fourth( op );
              SubLObject current_$42;
              final SubLObject datum_$41 = current_$42 = form;
              SubLObject method = NIL;
              cdestructuring_bind.destructuring_bind_must_consp( current_$42, datum_$41, $list112 );
              method = current_$42.first();
              final SubLObject args;
              current_$42 = ( args = current_$42.rest() );
              final SubLObject pcase_var = method;
              if( pcase_var.eql( $sym113$FI_KILL ) )
              {
                SubLObject current_$43;
                final SubLObject datum_$42 = current_$43 = args;
                SubLObject encapsulated_constant = NIL;
                cdestructuring_bind.destructuring_bind_must_consp( current_$43, datum_$42, $list114 );
                encapsulated_constant = current_$43.first();
                current_$43 = current_$43.rest();
                if( NIL == current_$43 )
                {
                  encapsulated_constant = list_utilities.unquotify( encapsulated_constant );
                  write_constant_removal_to_hl_transcript_stream( encapsulated_constant, stream );
                  total_constants = Numbers.add( total_constants, ONE_INTEGER );
                }
                else
                {
                  cdestructuring_bind.cdestructuring_bind_error( datum_$42, $list114 );
                }
              }
              else if( pcase_var.eql( $sym115$FI_MERGE ) )
              {
                SubLObject current_$44;
                final SubLObject datum_$43 = current_$44 = args;
                SubLObject encapsulated_kill = NIL;
                SubLObject encapsulated_keep = NIL;
                cdestructuring_bind.destructuring_bind_must_consp( current_$44, datum_$43, $list116 );
                encapsulated_kill = current_$44.first();
                current_$44 = current_$44.rest();
                cdestructuring_bind.destructuring_bind_must_consp( current_$44, datum_$43, $list116 );
                encapsulated_keep = current_$44.first();
                current_$44 = current_$44.rest();
                if( NIL == current_$44 )
                {
                  encapsulated_kill = list_utilities.unquotify( encapsulated_kill );
                  write_constant_removal_to_hl_transcript_stream( encapsulated_kill, stream );
                  total_constants = Numbers.add( total_constants, ONE_INTEGER );
                }
                else
                {
                  cdestructuring_bind.cdestructuring_bind_error( datum_$43, $list116 );
                }
              }
              else if( pcase_var.eql( $sym117$FI_UNASSERT ) )
              {
                SubLObject current_$45;
                final SubLObject datum_$44 = current_$45 = args;
                SubLObject encapsulated_sentence = NIL;
                SubLObject encapsulated_mt = NIL;
                cdestructuring_bind.destructuring_bind_must_consp( current_$45, datum_$44, $list118 );
                encapsulated_sentence = current_$45.first();
                current_$45 = current_$45.rest();
                cdestructuring_bind.destructuring_bind_must_consp( current_$45, datum_$44, $list118 );
                encapsulated_mt = current_$45.first();
                current_$45 = current_$45.rest();
                if( NIL == current_$45 )
                {
                  encapsulated_sentence = list_utilities.unquotify( encapsulated_sentence );
                  encapsulated_mt = list_utilities.unquotify( encapsulated_mt );
                  write_assertion_unassert_to_hl_transcript_stream( encapsulated_sentence, encapsulated_mt, stream );
                  total_assertions = Numbers.add( total_assertions, ONE_INTEGER );
                }
                else
                {
                  cdestructuring_bind.cdestructuring_bind_error( datum_$44, $list118 );
                }
              }
              else if( pcase_var.eql( $sym119$FI_BLAST ) )
              {
                SubLObject current_$46;
                final SubLObject datum_$45 = current_$46 = args;
                SubLObject encapsulated_sentence = NIL;
                SubLObject encapsulated_mt = NIL;
                cdestructuring_bind.destructuring_bind_must_consp( current_$46, datum_$45, $list118 );
                encapsulated_sentence = current_$46.first();
                current_$46 = current_$46.rest();
                cdestructuring_bind.destructuring_bind_must_consp( current_$46, datum_$45, $list118 );
                encapsulated_mt = current_$46.first();
                current_$46 = current_$46.rest();
                if( NIL == current_$46 )
                {
                  encapsulated_sentence = list_utilities.unquotify( encapsulated_sentence );
                  encapsulated_mt = list_utilities.unquotify( encapsulated_mt );
                  write_assertion_removal_to_hl_transcript_stream( encapsulated_sentence, encapsulated_mt, stream );
                  total_assertions = Numbers.add( total_assertions, ONE_INTEGER );
                }
                else
                {
                  cdestructuring_bind.cdestructuring_bind_error( datum_$45, $list118 );
                }
              }
              else
              {
                Errors.warn( $str120$time_to_implement__S, method );
              }
            }
          }
        }
        finally
        {
          final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
          try
          {
            Threads.$is_thread_performing_cleanupP$.bind( T, thread );
            final SubLObject _values = Values.getValuesAsVector();
            iteration.iteration_finalize( op_iterator );
            Values.restoreValuesFromVector( _values );
          }
          finally
          {
            Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0, thread );
          }
        }
      }
      else
      {
        cdestructuring_bind.cdestructuring_bind_error( datum_$40, $list111 );
      }
    }
    result = ConsesLow.list( new SubLObject[] { $kw121$REMOVED_CONSTANTS, total_constants, $kw122$REMOVED_NARTS, total_narts, $kw123$REMOVED_ASSERTIONS, total_assertions, $kw124$REMOVED_KB_HL_SUPPORTS,
      total_kb_hl_supports, $kw125$REMOVED_DEDUCTIONS, total_deductions
    } );
    result = plist_remove_value( result, ZERO_INTEGER, UNPROVIDED );
    return result;
  }

  @SubLTranslatedFile.SubL(source = "cycl/hl-transcripts.lisp", position = 21132L)
  public static SubLObject plist_remove_value(final SubLObject plist, final SubLObject value, SubLObject test)
  {
    if( test == UNPROVIDED )
    {
      test = Symbols.symbol_function( EQL );
    }
    return list_utilities.alist_to_plist( Sequences.delete( value, list_utilities.plist_to_alist( plist ), test, Symbols.symbol_function( $sym126$CDR ), UNPROVIDED, UNPROVIDED, UNPROVIDED ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/hl-transcripts.lisp", position = 21316L)
  public static SubLObject save_one_hl_transcript_operation(final SubLObject hl_op, final SubLObject stream)
  {
    return cfasl.cfasl_output_externalized( hl_op, stream );
  }

  @SubLTranslatedFile.SubL(source = "cycl/hl-transcripts.lisp", position = 21432L)
  public static SubLObject load_one_hl_transcript_operation(final SubLObject stream)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject result = NIL;
    final SubLObject _prev_bind_0 = control_vars.$bootstrapping_kbP$.currentBinding( thread );
    try
    {
      control_vars.$bootstrapping_kbP$.bind( T, thread );
      result = cfasl.cfasl_input( stream, NIL, $kw74$EOF );
    }
    finally
    {
      control_vars.$bootstrapping_kbP$.rebind( _prev_bind_0, thread );
    }
    return result;
  }

  @SubLTranslatedFile.SubL(source = "cycl/hl-transcripts.lisp", position = 21679L)
  public static SubLObject process_hl_transcript_operation(final SubLObject hl_op, final SubLObject error_mode, final SubLObject total_ops)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject success = NIL;
    if( error_mode.eql( $kw127$IGNORE ) )
    {
      SubLObject ignore_errors_tag = NIL;
      try
      {
        thread.throwStack.push( $kw128$IGNORE_ERRORS_TARGET );
        final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding( thread );
        try
        {
          Errors.$error_handler$.bind( Symbols.symbol_function( $sym129$IGNORE_ERRORS_HANDLER ), thread );
          try
          {
            process_hl_transcript_operation_int( hl_op );
            success = T;
          }
          catch( final Throwable catch_var )
          {
            Errors.handleThrowable( catch_var, NIL );
          }
        }
        finally
        {
          Errors.$error_handler$.rebind( _prev_bind_0, thread );
        }
      }
      catch( final Throwable ccatch_env_var )
      {
        ignore_errors_tag = Errors.handleThrowable( ccatch_env_var, $kw128$IGNORE_ERRORS_TARGET );
      }
      finally
      {
        thread.throwStack.pop();
      }
    }
    else if( error_mode.eql( $kw71$WARN ) )
    {
      SubLObject error_message = NIL;
      try
      {
        thread.throwStack.push( subl_macro_promotions.$catch_error_message_target$.getGlobalValue() );
        final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding( thread );
        try
        {
          Errors.$error_handler$.bind( $sym130$CATCH_ERROR_MESSAGE_HANDLER, thread );
          try
          {
            process_hl_transcript_operation_int( hl_op );
          }
          catch( final Throwable catch_var )
          {
            Errors.handleThrowable( catch_var, NIL );
          }
        }
        finally
        {
          Errors.$error_handler$.rebind( _prev_bind_0, thread );
        }
      }
      catch( final Throwable ccatch_env_var )
      {
        error_message = Errors.handleThrowable( ccatch_env_var, subl_macro_promotions.$catch_error_message_target$.getGlobalValue() );
      }
      finally
      {
        thread.throwStack.pop();
      }
      if( NIL != error_message )
      {
        Errors.warn( $str131$operation__S___S___A, total_ops, hl_op, error_message );
      }
      else
      {
        success = T;
      }
    }
    else if( error_mode.eql( $kw132$ERROR ) )
    {
      process_hl_transcript_operation_int( hl_op );
      success = T;
    }
    else
    {
      Errors.error( $str133$unexpected_error_mode__S, error_mode );
    }
    return success;
  }

  @SubLTranslatedFile.SubL(source = "cycl/hl-transcripts.lisp", position = 22331L)
  public static SubLObject process_hl_transcript_operation_int(final SubLObject hl_op)
  {
    SubLObject current;
    final SubLObject datum = current = possibly_transform_hl_op_wrt_compatibility( hl_op );
    SubLObject function_spec = NIL;
    SubLObject args = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list134 );
    function_spec = current.first();
    current = ( args = current.rest() );
    return Functions.apply( function_spec, args );
  }

  @SubLTranslatedFile.SubL(source = "cycl/hl-transcripts.lisp", position = 22616L)
  public static SubLObject show_hl_transcript_operation(SubLObject hl_op, final SubLObject stream)
  {
    hl_op = possibly_transform_hl_op_wrt_compatibility( hl_op );
    print_high.print( hl_op, stream );
    return hl_op;
  }

  @SubLTranslatedFile.SubL(source = "cycl/hl-transcripts.lisp", position = 22846L)
  public static SubLObject possibly_transform_hl_op_wrt_compatibility(final SubLObject hl_op)
  {
    SubLObject function_spec = NIL;
    SubLObject args = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( hl_op, hl_op, $list134 );
    function_spec = hl_op.first();
    final SubLObject current = args = hl_op.rest();
    final SubLObject pcase_var = function_spec;
    if( pcase_var.eql( $sym135$CYC_FIND_OR_CREATE_CANONICAL_NART ) )
    {
      function_spec = $sym136$HLT_FIND_OR_CREATE_NART;
    }
    else if( pcase_var.eql( $sym137$CYC_FIND_OR_CREATE ) )
    {
      function_spec = $sym138$HLT_FIND_OR_CREATE;
    }
    else if( pcase_var.eql( $sym139$FIND_OR_CREATE_ASSERTION ) )
    {
      function_spec = $sym140$HLT_FIND_OR_CREATE_ASSERTION;
    }
    else if( pcase_var.eql( $sym141$FIND_OR_CREATE_KB_HL_SUPPORT ) )
    {
      function_spec = $sym142$HLT_FIND_OR_CREATE_KB_HL_SUPPORT;
    }
    else
    {
      if( !pcase_var.eql( $sym143$TMS_ADD_DEDUCTION_FOR_ASSERTION ) )
      {
        return hl_op;
      }
      function_spec = $sym144$HLT_FIND_OR_CREATE_DEDUCTION;
    }
    return ConsesLow.listS( function_spec, args );
  }

  @SubLTranslatedFile.SubL(source = "cycl/hl-transcripts.lisp", position = 24440L)
  public static SubLObject hl_transcript_objects_to_compress(final SubLObject modification_spec)
  {
    final SubLObject object_reference_alist = compressible_references_in_modification_spec( modification_spec, TWO_INTEGER );
    final SubLObject referenced_constants = list_utilities.alist_keys( object_reference_alist );
    final SubLObject objects_to_compress = ConsesLow.append( $hl_transcript_common_symbols$.getGlobalValue(), referenced_constants, $hl_transcript_el_constants$.getGlobalValue() );
    return objects_to_compress;
  }

  @SubLTranslatedFile.SubL(source = "cycl/hl-transcripts.lisp", position = 24825L)
  public static SubLObject new_objects_between_kb_checkpoints(SubLObject start_checkpoint, SubLObject end_checkpoint)
  {
    if( start_checkpoint == UNPROVIDED )
    {
      start_checkpoint = previous_dump_kb_state_checkpoint();
    }
    if( end_checkpoint == UNPROVIDED )
    {
      end_checkpoint = current_kb_state_checkpoint();
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    thread.resetMultipleValues();
    final SubLObject constant_suid_start = destructure_kb_state_checkpoint( start_checkpoint );
    final SubLObject nart_id_start = thread.secondMultipleValue();
    final SubLObject assertion_id_start = thread.thirdMultipleValue();
    final SubLObject kb_hl_support_id_start = thread.fourthMultipleValue();
    final SubLObject deduction_id_start = thread.fifthMultipleValue();
    thread.resetMultipleValues();
    thread.resetMultipleValues();
    final SubLObject constant_suid_end = destructure_kb_state_checkpoint( end_checkpoint );
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
    for( end_var = constant_suid_end, id_var = NIL, id_var = constant_suid_start; !id_var.numGE( end_var ); id_var = number_utilities.f_1X( id_var ) )
    {
      constant = constants_high.find_constant_by_internal_id( id_var );
      if( NIL != constant_handles.constant_p( constant ) )
      {
        new_constants = ConsesLow.cons( constant, new_constants );
      }
    }
    SubLObject nart;
    for( end_var = nart_id_end, id_var = NIL, id_var = nart_id_start; !id_var.numGE( end_var ); id_var = number_utilities.f_1X( id_var ) )
    {
      nart = nart_handles.find_nart_by_id( id_var );
      if( NIL != nart_handles.nart_p( nart ) )
      {
        new_narts = ConsesLow.cons( nart, new_narts );
      }
    }
    SubLObject assertion;
    for( end_var = assertion_id_end, id_var = NIL, id_var = assertion_id_start; !id_var.numGE( end_var ); id_var = number_utilities.f_1X( id_var ) )
    {
      assertion = assertion_handles.find_assertion_by_id( id_var );
      if( NIL != assertion_handles.assertion_p( assertion ) )
      {
        new_assertions = ConsesLow.cons( assertion, new_assertions );
      }
    }
    SubLObject kb_hl_support;
    for( end_var = kb_hl_support_id_end, id_var = NIL, id_var = kb_hl_support_id_start; !id_var.numGE( end_var ); id_var = number_utilities.f_1X( id_var ) )
    {
      kb_hl_support = kb_hl_support_handles.find_kb_hl_support_by_id( id_var );
      if( NIL != kb_hl_support_handles.kb_hl_support_p( kb_hl_support ) )
      {
        new_kb_hl_supports = ConsesLow.cons( kb_hl_support, new_kb_hl_supports );
      }
    }
    SubLObject deduction;
    for( end_var = deduction_id_end, id_var = NIL, id_var = deduction_id_start; !id_var.numGE( end_var ); id_var = number_utilities.f_1X( id_var ) )
    {
      deduction = deduction_handles.find_deduction_by_id( id_var );
      if( NIL != deduction_handles.deduction_p( deduction ) )
      {
        new_deductions = ConsesLow.cons( deduction, new_deductions );
      }
    }
    return ConsesLow.list( new SubLObject[] { $kw91$NEW_CONSTANTS, new_constants, $kw92$NEW_NARTS, new_narts, $kw93$NEW_ASSERTIONS, new_assertions, $kw94$NEW_KB_HL_SUPPORTS, new_kb_hl_supports, $kw95$NEW_DEDUCTIONS,
      new_deductions
    } );
  }

  @SubLTranslatedFile.SubL(source = "cycl/hl-transcripts.lisp", position = 26634L)
  public static SubLObject gathering_new_kb_objects(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list147 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject result_var = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list147 );
    result_var = current.first();
    current = current.rest();
    if( NIL == current )
    {
      final SubLObject body;
      current = ( body = temp );
      final SubLObject start = $sym148$START;
      return ConsesLow.listS( $sym9$CLET, ConsesLow.list( reader.bq_cons( start, $list149 ) ), ConsesLow.append( body, ConsesLow.list( ConsesLow.list( $sym150$CSETQ, result_var, ConsesLow.list(
          $sym151$NEW_OBJECTS_BETWEEN_KB_CHECKPOINTS, start ) ) ) ) );
    }
    cdestructuring_bind.cdestructuring_bind_error( datum, $list147 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/hl-transcripts.lisp", position = 27047L)
  public static SubLObject gathering_rules_used_in_new_deductions(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list152 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject rules_var = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list152 );
    rules_var = current.first();
    current = current.rest();
    SubLObject allow_other_keys_p = NIL;
    SubLObject rest = current;
    SubLObject bad = NIL;
    SubLObject current_$52 = NIL;
    while ( NIL != rest)
    {
      cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list152 );
      current_$52 = rest.first();
      rest = rest.rest();
      cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list152 );
      if( NIL == conses_high.member( current_$52, $list153, UNPROVIDED, UNPROVIDED ) )
      {
        bad = T;
      }
      if( current_$52 == $kw2$ALLOW_OTHER_KEYS )
      {
        allow_other_keys_p = rest.first();
      }
      rest = rest.rest();
    }
    if( NIL != bad && NIL == allow_other_keys_p )
    {
      cdestructuring_bind.cdestructuring_bind_error( datum, $list152 );
    }
    final SubLObject direction_tail = cdestructuring_bind.property_list_member( $kw154$DIRECTION, current );
    final SubLObject direction = ( NIL != direction_tail ) ? conses_high.cadr( direction_tail ) : $kw155$FORWARD;
    final SubLObject body;
    current = ( body = temp );
    final SubLObject new_objects = $sym156$NEW_OBJECTS;
    return ConsesLow.list( $sym9$CLET, ConsesLow.list( new_objects ), ConsesLow.listS( $sym157$GATHERING_NEW_KB_OBJECTS, ConsesLow.list( new_objects ), ConsesLow.append( body, NIL ) ), ConsesLow.list( $sym150$CSETQ,
        rules_var, ConsesLow.list( $sym158$GATHERING_RULES_USED_IN_NEW_DEDUCTIONS_POSTPROCESS, new_objects, direction ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/hl-transcripts.lisp", position = 27585L)
  public static SubLObject gathering_rules_used_in_new_deductions_postprocess(final SubLObject new_objects, final SubLObject direction)
  {
    final SubLObject new_deductions_tail = cdestructuring_bind.property_list_member( $kw95$NEW_DEDUCTIONS, new_objects );
    final SubLObject new_deductions = ( NIL != new_deductions_tail ) ? conses_high.cadr( new_deductions_tail ) : NIL;
    final SubLObject rule_set = set.new_set( UNPROVIDED, UNPROVIDED );
    SubLObject cdolist_list_var = new_deductions;
    SubLObject deduction = NIL;
    deduction = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      SubLObject cdolist_list_var_$53;
      final SubLObject supports = cdolist_list_var_$53 = deductions_high.deduction_supports( deduction );
      SubLObject support = NIL;
      support = cdolist_list_var_$53.first();
      while ( NIL != cdolist_list_var_$53)
      {
        if( NIL != assertions_high.rule_assertionP( support ) && ( NIL == direction || NIL != assertions_high.assertion_has_direction( support, direction ) ) )
        {
          set.set_add( support, rule_set );
        }
        cdolist_list_var_$53 = cdolist_list_var_$53.rest();
        support = cdolist_list_var_$53.first();
      }
      cdolist_list_var = cdolist_list_var.rest();
      deduction = cdolist_list_var.first();
    }
    final SubLObject raw_rules = set.set_element_list( rule_set );
    final SubLObject useful_rules = assertion_utilities.sort_assertions( raw_rules );
    return useful_rules;
  }

  @SubLTranslatedFile.SubL(source = "cycl/hl-transcripts.lisp", position = 28254L)
  public static SubLObject compressible_references_in_modification_spec(final SubLObject hl_modification_spec, SubLObject minimum)
  {
    if( minimum == UNPROVIDED )
    {
      minimum = ONE_INTEGER;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject start_checkpoint_tail = cdestructuring_bind.property_list_member( $kw67$START_CHECKPOINT, hl_modification_spec );
    final SubLObject start_checkpoint = ( NIL != start_checkpoint_tail ) ? conses_high.cadr( start_checkpoint_tail ) : NIL;
    final SubLObject end_checkpoint_tail = cdestructuring_bind.property_list_member( $kw68$END_CHECKPOINT, hl_modification_spec );
    final SubLObject end_checkpoint = ( NIL != end_checkpoint_tail ) ? conses_high.cadr( end_checkpoint_tail ) : NIL;
    final SubLObject new_constants_tail = cdestructuring_bind.property_list_member( $kw91$NEW_CONSTANTS, hl_modification_spec );
    final SubLObject new_constants = ( NIL != new_constants_tail ) ? conses_high.cadr( new_constants_tail ) : NIL;
    final SubLObject new_narts_tail = cdestructuring_bind.property_list_member( $kw92$NEW_NARTS, hl_modification_spec );
    final SubLObject new_narts = ( NIL != new_narts_tail ) ? conses_high.cadr( new_narts_tail ) : NIL;
    final SubLObject new_assertions_tail = cdestructuring_bind.property_list_member( $kw93$NEW_ASSERTIONS, hl_modification_spec );
    final SubLObject new_assertions = ( NIL != new_assertions_tail ) ? conses_high.cadr( new_assertions_tail ) : NIL;
    final SubLObject new_kb_hl_supports_tail = cdestructuring_bind.property_list_member( $kw94$NEW_KB_HL_SUPPORTS, hl_modification_spec );
    final SubLObject new_kb_hl_supports = ( NIL != new_kb_hl_supports_tail ) ? conses_high.cadr( new_kb_hl_supports_tail ) : NIL;
    final SubLObject new_deductions_tail = cdestructuring_bind.property_list_member( $kw95$NEW_DEDUCTIONS, hl_modification_spec );
    final SubLObject new_deductions = ( NIL != new_deductions_tail ) ? conses_high.cadr( new_deductions_tail ) : NIL;
    final SubLObject kb_checkpointP = makeBoolean( NIL != start_checkpoint && NIL != end_checkpoint );
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
    if( NIL != kb_checkpointP )
    {
      thread.resetMultipleValues();
      final SubLObject constant_suid_start_$54 = destructure_kb_state_checkpoint( start_checkpoint );
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
      final SubLObject constant_suid_end_$59 = destructure_kb_state_checkpoint( end_checkpoint );
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
    final SubLObject _prev_bind_0 = control_vars.$mapping_target$.currentBinding( thread );
    try
    {
      control_vars.$mapping_target$.bind( Hashtables.make_hash_table( $int160$500, Symbols.symbol_function( EQUAL ), UNPROVIDED ), thread );
      if( NIL != kb_checkpointP )
      {
        SubLObject end_var;
        SubLObject id_var;
        SubLObject constant;
        for( end_var = constant_suid_end, id_var = NIL, id_var = constant_suid_start; !id_var.numGE( end_var ); id_var = number_utilities.f_1X( id_var ) )
        {
          constant = constants_high.find_constant_by_internal_id( id_var );
          if( NIL != constant_handles.constant_p( constant ) )
          {
            increment_compressible_object_mention_count( constant );
          }
        }
      }
      SubLObject cdolist_list_var = new_constants;
      SubLObject constant2 = NIL;
      constant2 = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        increment_compressible_object_mention_count( constant2 );
        cdolist_list_var = cdolist_list_var.rest();
        constant2 = cdolist_list_var.first();
      }
      if( NIL != kb_checkpointP )
      {
        SubLObject end_var;
        SubLObject id_var;
        SubLObject nart;
        for( end_var = nart_id_end, id_var = NIL, id_var = nart_id_start; !id_var.numGE( end_var ); id_var = number_utilities.f_1X( id_var ) )
        {
          nart = nart_handles.find_nart_by_id( id_var );
          if( NIL != nart_handles.nart_p( nart ) )
          {
            cycl_utilities.nart_map( $sym161$INCREMENT_COMPRESSIBLE_OBJECT_MENTION_COUNT, nart, T, UNPROVIDED );
          }
        }
      }
      cdolist_list_var = new_narts;
      SubLObject nart2 = NIL;
      nart2 = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        cycl_utilities.nart_map( $sym161$INCREMENT_COMPRESSIBLE_OBJECT_MENTION_COUNT, nart2, T, UNPROVIDED );
        cdolist_list_var = cdolist_list_var.rest();
        nart2 = cdolist_list_var.first();
      }
      if( NIL != kb_checkpointP )
      {
        SubLObject end_var;
        SubLObject id_var;
        SubLObject assertion;
        for( end_var = assertion_id_end, id_var = NIL, id_var = assertion_id_start; !id_var.numGE( end_var ); id_var = number_utilities.f_1X( id_var ) )
        {
          assertion = assertion_handles.find_assertion_by_id( id_var );
          if( NIL != assertion_handles.assertion_p( assertion ) )
          {
            cycl_utilities.assertion_map( $sym161$INCREMENT_COMPRESSIBLE_OBJECT_MENTION_COUNT, assertion, T, UNPROVIDED );
          }
        }
      }
      cdolist_list_var = new_assertions;
      SubLObject assertion2 = NIL;
      assertion2 = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        cycl_utilities.assertion_map( $sym161$INCREMENT_COMPRESSIBLE_OBJECT_MENTION_COUNT, assertion2, T, UNPROVIDED );
        cdolist_list_var = cdolist_list_var.rest();
        assertion2 = cdolist_list_var.first();
      }
      if( NIL != kb_checkpointP )
      {
        SubLObject end_var;
        SubLObject id_var;
        SubLObject kb_hl_support;
        for( end_var = kb_hl_support_id_end, id_var = NIL, id_var = kb_hl_support_id_start; !id_var.numGE( end_var ); id_var = number_utilities.f_1X( id_var ) )
        {
          kb_hl_support = kb_hl_support_handles.find_kb_hl_support_by_id( id_var );
          if( NIL != kb_hl_support_handles.kb_hl_support_p( kb_hl_support ) )
          {
            kb_hl_support_map( $sym161$INCREMENT_COMPRESSIBLE_OBJECT_MENTION_COUNT, kb_hl_support, T, UNPROVIDED );
          }
        }
      }
      cdolist_list_var = new_kb_hl_supports;
      SubLObject kb_hl_support2 = NIL;
      kb_hl_support2 = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        kb_hl_support_map( $sym161$INCREMENT_COMPRESSIBLE_OBJECT_MENTION_COUNT, kb_hl_support2, T, UNPROVIDED );
        cdolist_list_var = cdolist_list_var.rest();
        kb_hl_support2 = cdolist_list_var.first();
      }
      if( NIL != kb_checkpointP )
      {
        SubLObject end_var;
        SubLObject id_var;
        SubLObject deduction;
        for( end_var = deduction_id_end, id_var = NIL, id_var = deduction_id_start; !id_var.numGE( end_var ); id_var = number_utilities.f_1X( id_var ) )
        {
          deduction = deduction_handles.find_deduction_by_id( id_var );
          if( NIL != deduction_handles.deduction_p( deduction ) )
          {
            deduction_map( $sym161$INCREMENT_COMPRESSIBLE_OBJECT_MENTION_COUNT, deduction, T, UNPROVIDED );
          }
        }
      }
      cdolist_list_var = new_deductions;
      SubLObject deduction2 = NIL;
      deduction2 = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        deduction_map( $sym161$INCREMENT_COMPRESSIBLE_OBJECT_MENTION_COUNT, deduction2, T, UNPROVIDED );
        cdolist_list_var = cdolist_list_var.rest();
        deduction2 = cdolist_list_var.first();
      }
      result = hash_table_utilities.hash_table_to_alist( control_vars.$mapping_target$.getDynamicValue( thread ) );
    }
    finally
    {
      control_vars.$mapping_target$.rebind( _prev_bind_0, thread );
    }
    if( minimum.numG( ONE_INTEGER ) )
    {
      result = Sequences.delete( minimum, result, Symbols.symbol_function( $sym162$_ ), Symbols.symbol_function( $sym126$CDR ), UNPROVIDED, UNPROVIDED, UNPROVIDED );
    }
    result = Sort.sort( result, Symbols.symbol_function( $sym162$_ ), Symbols.symbol_function( $sym126$CDR ) );
    return result;
  }

  @SubLTranslatedFile.SubL(source = "cycl/hl-transcripts.lisp", position = 31304L)
  public static SubLObject increment_compressible_object_mention_count(final SubLObject v_object)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL != constant_handles.constant_p( v_object ) || ( v_object.isString() && NIL != list_utilities.lengthGE( v_object, $int163$32, UNPROVIDED ) ) )
    {
      Hashtables.sethash( v_object, control_vars.$mapping_target$.getDynamicValue( thread ), Numbers.add( Hashtables.gethash_without_values( v_object, control_vars.$mapping_target$.getDynamicValue( thread ),
          ZERO_INTEGER ), ONE_INTEGER ) );
      return T;
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/hl-transcripts.lisp", position = 31833L)
  public static SubLObject deduction_map(final SubLObject function, final SubLObject deduction, SubLObject penetrate_hl_structuresP, SubLObject key)
  {
    if( penetrate_hl_structuresP == UNPROVIDED )
    {
      penetrate_hl_structuresP = NIL;
    }
    if( key == UNPROVIDED )
    {
      key = Symbols.symbol_function( IDENTITY );
    }
    assert NIL != deduction_handles.deduction_p( deduction ) : deduction;
    final SubLObject supported_object = deductions_high.deduction_supported_object( deduction );
    final SubLObject justification = deductions_high.deduction_supports( deduction );
    expression_map_support( function, supported_object, penetrate_hl_structuresP, key );
    SubLObject cdolist_list_var = justification;
    SubLObject support = NIL;
    support = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      expression_map_support( function, support, penetrate_hl_structuresP, key );
      cdolist_list_var = cdolist_list_var.rest();
      support = cdolist_list_var.first();
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/hl-transcripts.lisp", position = 32315L)
  public static SubLObject kb_hl_support_map(final SubLObject function, final SubLObject kb_hl_support, SubLObject penetrate_hl_structuresP, SubLObject key)
  {
    if( penetrate_hl_structuresP == UNPROVIDED )
    {
      penetrate_hl_structuresP = NIL;
    }
    if( key == UNPROVIDED )
    {
      key = Symbols.symbol_function( IDENTITY );
    }
    assert NIL != kb_hl_support_handles.kb_hl_support_p( kb_hl_support ) : kb_hl_support;
    final SubLObject hl_support = kb_hl_supports_high.kb_hl_support_hl_support( kb_hl_support );
    final SubLObject justification = kb_hl_supports_high.kb_hl_support_justification( kb_hl_support );
    expression_map_support( function, hl_support, penetrate_hl_structuresP, key );
    SubLObject cdolist_list_var = justification;
    SubLObject support = NIL;
    support = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      expression_map_support( function, support, penetrate_hl_structuresP, key );
      cdolist_list_var = cdolist_list_var.rest();
      support = cdolist_list_var.first();
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/hl-transcripts.lisp", position = 32811L)
  public static SubLObject expression_map_support(final SubLObject function, final SubLObject v_object, SubLObject penetrate_hl_structuresP, SubLObject key)
  {
    if( penetrate_hl_structuresP == UNPROVIDED )
    {
      penetrate_hl_structuresP = NIL;
    }
    if( key == UNPROVIDED )
    {
      key = Symbols.symbol_function( IDENTITY );
    }
    if( NIL != assertion_handles.assertion_p( v_object ) )
    {
      cycl_utilities.assertion_map( function, v_object, penetrate_hl_structuresP, key );
    }
    else if( NIL != kb_hl_support_handles.kb_hl_support_p( v_object ) )
    {
      kb_hl_support_map( function, v_object, penetrate_hl_structuresP, key );
    }
    else if( NIL != arguments.hl_support_p( v_object ) )
    {
      cycl_utilities.expression_map( function, arguments.support_sentence( v_object ), penetrate_hl_structuresP, key );
      cycl_utilities.expression_map( function, arguments.support_mt( v_object ), penetrate_hl_structuresP, key );
    }
    else
    {
      Errors.error( $str164$_S_was_not_a_support_p, v_object );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/hl-transcripts.lisp", position = 33825L)
  public static SubLObject with_hl_transcript_created_constant_equivalence_by_name(final SubLObject macroform, final SubLObject environment)
  {
    final SubLObject datum = macroform.rest();
    final SubLObject body;
    final SubLObject current = body = datum;
    return ConsesLow.listS( $sym9$CLET, $list165, ConsesLow.append( body, NIL ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/hl-transcripts.lisp", position = 34276L)
  public static SubLObject new_hlt_external_id_equivalence_map()
  {
    return dictionary.new_dictionary( Symbols.symbol_function( EQUALP ), UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/hl-transcripts.lisp", position = 34439L)
  public static SubLObject hlt_possibly_find_via_external_id_equivalence(final SubLObject name, final SubLObject external_id)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL != map_utilities.map_p( $hl_transcript_constant_external_id_equivalence_map$.getDynamicValue( thread ) ) )
    {
      final SubLObject existing_by_name = fi.fi_find_int( name );
      if( NIL != constant_handles.constant_p( existing_by_name ) )
      {
        if( NIL == constants_high.constant_has_external_id( existing_by_name, external_id ) )
        {
          final SubLObject preferred_external_id = constants_high.constant_external_id( existing_by_name );
          map_utilities.map_put( $hl_transcript_constant_external_id_equivalence_map$.getDynamicValue( thread ), external_id, preferred_external_id );
        }
        return existing_by_name;
      }
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/hl-transcripts.lisp", position = 34984L)
  public static SubLObject write_constant_to_hl_transcript_stream(final SubLObject constant, final SubLObject stream)
  {
    final SubLObject name = constants_high.constant_name( constant );
    final SubLObject external_id = constants_high.constant_external_id( constant );
    final SubLObject hl_operation = ConsesLow.list( $sym138$HLT_FIND_OR_CREATE, name, external_id );
    save_one_hl_transcript_operation( hl_operation, stream );
    return constant;
  }

  @SubLTranslatedFile.SubL(source = "cycl/hl-transcripts.lisp", position = 35333L)
  public static SubLObject hlt_find_or_create(final SubLObject name, SubLObject external_id)
  {
    if( external_id == UNPROVIDED )
    {
      external_id = NIL;
    }
    SubLObject constant = ( NIL != external_id ) ? hlt_possibly_find_via_external_id_equivalence( name, external_id ) : NIL;
    if( NIL == constant )
    {
      constant = fi.fi_create_int( name, external_id );
    }
    return constant;
  }

  @SubLTranslatedFile.SubL(source = "cycl/hl-transcripts.lisp", position = 35620L)
  public static SubLObject hlt_find_or_create_missing_constant(final SubLObject name, SubLObject external_id)
  {
    if( external_id == UNPROVIDED )
    {
      external_id = NIL;
    }
    final SubLObject constant = hlt_find_or_create( name, external_id );
    if( NIL != constant )
    {
      Errors.warn( $str168$missing_constant_added___S, constant );
      return constant;
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/hl-transcripts.lisp", position = 35895L)
  public static SubLObject write_nart_to_hl_transcript_stream(final SubLObject nart, final SubLObject stream)
  {
    final SubLObject hl_formula = narts_high.nart_hl_formula( nart );
    final SubLObject hl_operation = ConsesLow.list( $sym136$HLT_FIND_OR_CREATE_NART, hl_formula );
    save_one_hl_transcript_operation( hl_operation, stream );
    return nart;
  }

  @SubLTranslatedFile.SubL(source = "cycl/hl-transcripts.lisp", position = 36259L)
  public static SubLObject hlt_find_or_create_nart(final SubLObject hl_formula)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject result = NIL;
    final SubLObject _prev_bind_0 = control_vars.$bootstrapping_kbP$.currentBinding( thread );
    try
    {
      control_vars.$bootstrapping_kbP$.bind( T, thread );
      result = czer_main.cyc_find_or_create_canonical_nart( hl_formula );
    }
    finally
    {
      control_vars.$bootstrapping_kbP$.rebind( _prev_bind_0, thread );
    }
    return result;
  }

  @SubLTranslatedFile.SubL(source = "cycl/hl-transcripts.lisp", position = 36572L)
  public static SubLObject hlt_find_or_create_missing_nart(final SubLObject canonical_naut)
  {
    final SubLObject nart = hlt_find_or_create_nart( canonical_naut );
    if( NIL != nart )
    {
      Errors.warn( $str169$missing_NART_added___S, nart );
      return nart;
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/hl-transcripts.lisp", position = 36810L)
  public static SubLObject write_assertion_to_hl_transcript_stream(final SubLObject assertion, final SubLObject stream)
  {
    final SubLObject cnf = assertions_high.assertion_cnf( assertion );
    final SubLObject mt = assertions_high.assertion_mt( assertion );
    final SubLObject variable_names = assertions_high.assertion_variable_names( assertion );
    final SubLObject direction = assertions_high.assertion_direction( assertion );
    final SubLObject truth = assertions_high.assertion_truth( assertion );
    final SubLObject strength = assertions_high.assertion_strength( assertion );
    final SubLObject asserted_argument = assertions_high.get_asserted_argument( assertion );
    final SubLObject hl_operation = ConsesLow.list( $sym140$HLT_FIND_OR_CREATE_ASSERTION, cnf, mt, variable_names, direction, truth, strength, asserted_argument );
    save_one_hl_transcript_operation( hl_operation, stream );
    if( NIL != assertions_high.asserted_assertionP( assertion ) )
    {
      final SubLObject bookkeeping_info = cyc_bookkeeping.assertion_bookkeeping_info( assertion );
      final SubLObject sentence = ( NIL != assertions_high.gaf_assertionP( assertion ) ) ? assertions_high.gaf_el_formula( assertion ) : uncanonicalizer.assertion_el_formula( assertion );
      final SubLObject hl_operation_$64 = ConsesLow.list( $sym170$HLT_ASSERT, sentence, mt, strength, direction, bookkeeping_info );
      save_one_hl_transcript_operation( hl_operation_$64, stream );
    }
    return assertion;
  }

  @SubLTranslatedFile.SubL(source = "cycl/hl-transcripts.lisp", position = 38034L)
  public static SubLObject hlt_find_or_create_assertion(final SubLObject cnf, final SubLObject mt, final SubLObject variable_names, final SubLObject direction, final SubLObject truth, final SubLObject strength,
      final SubLObject asserted_argument)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    thread.resetMultipleValues();
    final SubLObject assertion = assertions_high.find_or_create_assertion( cnf, mt, variable_names, direction, truth, strength, asserted_argument );
    final SubLObject new_assertionP = thread.secondMultipleValue();
    thread.resetMultipleValues();
    if( NIL != new_assertionP )
    {
      tms.tms_handle_after_addings( assertion );
    }
    return Values.values( assertion, new_assertionP );
  }

  @SubLTranslatedFile.SubL(source = "cycl/hl-transcripts.lisp", position = 38434L)
  public static SubLObject hlt_find_or_create_missing_gaf(final SubLObject gaf, final SubLObject mt)
  {
    final SubLObject gaf_assertion = hlt_find_or_create_assertion( clause_utilities.make_gaf_cnf( gaf ), mt, NIL, $kw155$FORWARD, $kw171$UNKNOWN, $kw172$DEFAULT, NIL );
    if( NIL != gaf_assertion )
    {
      Errors.warn( $str173$missing_gaf_added___S, gaf_assertion );
      return gaf_assertion;
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/hl-transcripts.lisp", position = 38771L)
  public static SubLObject hlt_find_or_create_missing_rule(final SubLObject cnf, final SubLObject mt)
  {
    final SubLObject rule_assertion = hlt_find_or_create_assertion( cnf, mt, NIL, $kw174$BACKWARD, $kw171$UNKNOWN, $kw172$DEFAULT, NIL );
    if( NIL != rule_assertion )
    {
      Errors.warn( $str175$missing_rule_added___S, rule_assertion );
      return rule_assertion;
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/hl-transcripts.lisp", position = 39100L)
  public static SubLObject hlt_assert(final SubLObject sentence, final SubLObject mt, final SubLObject strength, final SubLObject direction, final SubLObject bookkeeping_info)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject v_properties = ConsesLow.list( $kw176$STRENGTH, strength, $kw154$DIRECTION, direction, $kw177$CHECK_WFF_, NIL, $kw178$FORWARD_RULES, NIL );
    SubLObject result = NIL;
    final SubLObject _prev_bind_0 = kb_control_vars.$forward_inference_enabledP$.currentBinding( thread );
    final SubLObject _prev_bind_2 = cyc_bookkeeping.$cyc_bookkeeping_info$.currentBinding( thread );
    try
    {
      kb_control_vars.$forward_inference_enabledP$.bind( NIL, thread );
      cyc_bookkeeping.$cyc_bookkeeping_info$.bind( bookkeeping_info, thread );
      result = cyc_kernel.cyc_assert( sentence, mt, v_properties );
    }
    finally
    {
      cyc_bookkeeping.$cyc_bookkeeping_info$.rebind( _prev_bind_2, thread );
      kb_control_vars.$forward_inference_enabledP$.rebind( _prev_bind_0, thread );
    }
    return result;
  }

  @SubLTranslatedFile.SubL(source = "cycl/hl-transcripts.lisp", position = 39473L)
  public static SubLObject hlt_timestamp_assertion(final SubLObject assertion, final SubLObject who, final SubLObject when, final SubLObject why, final SubLObject second)
  {
    if( NIL != assertions_high.asserted_assertionP( assertion ) )
    {
      assertions_interface.kb_timestamp_asserted_assertion( assertion, who, when, why, second );
      return assertion;
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/hl-transcripts.lisp", position = 39685L)
  public static SubLObject write_kb_hl_support_to_hl_transcript_stream(final SubLObject kb_hl_support, final SubLObject stream)
  {
    final SubLObject hl_support = kb_hl_supports_high.kb_hl_support_hl_support( kb_hl_support );
    SubLObject cdolist_list_var;
    final SubLObject justification = cdolist_list_var = kb_hl_supports_high.kb_hl_support_justification( kb_hl_support );
    SubLObject justification_support = NIL;
    justification_support = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      if( NIL != kb_hl_support_handles.kb_hl_support_p( justification_support ) && kb_hl_support_handles.kb_hl_support_id( justification_support ).numG( kb_hl_support_handles.kb_hl_support_id( kb_hl_support ) ) )
      {
        write_kb_hl_support_to_hl_transcript_stream( justification_support, stream );
      }
      cdolist_list_var = cdolist_list_var.rest();
      justification_support = cdolist_list_var.first();
    }
    final SubLObject hl_operation = ConsesLow.list( $sym142$HLT_FIND_OR_CREATE_KB_HL_SUPPORT, hl_support, justification );
    save_one_hl_transcript_operation( hl_operation, stream );
    return kb_hl_support;
  }

  @SubLTranslatedFile.SubL(source = "cycl/hl-transcripts.lisp", position = 40553L)
  public static SubLObject hlt_find_or_create_kb_hl_support(final SubLObject hl_support, final SubLObject justification)
  {
    return kb_hl_supports_high.find_or_create_kb_hl_support( hl_support, justification );
  }

  @SubLTranslatedFile.SubL(source = "cycl/hl-transcripts.lisp", position = 40768L)
  public static SubLObject hlt_find_or_create_missing_kb_hl_support(final SubLObject hl_support)
  {
    final SubLObject kb_hl_support = kb_hl_supports_high.find_or_possibly_create_kb_hl_support( hl_support );
    if( NIL != kb_hl_support )
    {
      Errors.warn( $str180$missing_KB_HL_support_added___S, kb_hl_support );
      return kb_hl_support;
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/hl-transcripts.lisp", position = 41033L)
  public static SubLObject write_deduction_to_hl_transcript_stream(final SubLObject deduction, final SubLObject stream)
  {
    final SubLObject assertion = deductions_high.deduction_supported_object( deduction );
    if( NIL != assertion_handles.assertion_p( assertion ) )
    {
      SubLObject cdolist_list_var;
      final SubLObject supports = cdolist_list_var = deductions_high.deduction_supports( deduction );
      SubLObject deduction_support = NIL;
      deduction_support = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        if( NIL != assertion_handles.assertion_p( deduction_support ) && assertion_handles.assertion_id( deduction_support ).numG( assertion_handles.assertion_id( assertion ) ) )
        {
          write_assertion_to_hl_transcript_stream( deduction_support, stream );
        }
        cdolist_list_var = cdolist_list_var.rest();
        deduction_support = cdolist_list_var.first();
      }
      final SubLObject truth = deductions_high.deduction_truth( deduction );
      final SubLObject hl_operation = ConsesLow.list( $sym144$HLT_FIND_OR_CREATE_DEDUCTION, assertion, supports, truth );
      save_one_hl_transcript_operation( hl_operation, stream );
    }
    return deduction;
  }

  @SubLTranslatedFile.SubL(source = "cycl/hl-transcripts.lisp", position = 41931L)
  public static SubLObject hlt_find_or_create_deduction(final SubLObject supported_object, final SubLObject supports, final SubLObject truth, SubLObject v_bindings, SubLObject pragmatic_support_mts)
  {
    if( v_bindings == UNPROVIDED )
    {
      v_bindings = NIL;
    }
    if( pragmatic_support_mts == UNPROVIDED )
    {
      pragmatic_support_mts = NIL;
    }
    if( NIL != assertion_handles.assertion_p( supported_object ) )
    {
      return tms.tms_add_deduction_for_assertion( supported_object, supports, truth, v_bindings, pragmatic_support_mts );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/hl-transcripts.lisp", position = 42277L)
  public static SubLObject hlt_find_or_create_missing_deduction(final SubLObject supported_object, final SubLObject supports, SubLObject truth, SubLObject v_bindings, SubLObject pragmatic_support_mts)
  {
    if( truth == UNPROVIDED )
    {
      truth = $kw181$TRUE;
    }
    if( v_bindings == UNPROVIDED )
    {
      v_bindings = NIL;
    }
    if( pragmatic_support_mts == UNPROVIDED )
    {
      pragmatic_support_mts = NIL;
    }
    final SubLObject deduction = hlt_find_or_create_deduction( supported_object, supports, truth, v_bindings, pragmatic_support_mts );
    if( NIL != deduction )
    {
      Errors.warn( $str182$missing_deduction_added___S, deduction );
      return deduction;
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/hl-transcripts.lisp", position = 42631L)
  public static SubLObject write_existing_constant_removal_to_hl_transcript_stream(final SubLObject constant, final SubLObject stream)
  {
    final SubLObject encapsulated_constant = encapsulation.encapsulate( constant );
    return write_constant_removal_to_hl_transcript_stream( encapsulated_constant, stream );
  }

  @SubLTranslatedFile.SubL(source = "cycl/hl-transcripts.lisp", position = 42891L)
  public static SubLObject write_constant_removal_to_hl_transcript_stream(final SubLObject encapsulated_constant, final SubLObject stream)
  {
    final SubLObject hl_operation = ConsesLow.list( $sym183$HLT_REMOVE_CONSTANT, encapsulated_constant );
    save_one_hl_transcript_operation( hl_operation, stream );
    return encapsulated_constant;
  }

  @SubLTranslatedFile.SubL(source = "cycl/hl-transcripts.lisp", position = 43176L)
  public static SubLObject hlt_catch_unencapsulation_errors(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    SubLObject error_var = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list184 );
    error_var = current.first();
    final SubLObject body;
    current = ( body = current.rest() );
    return ConsesLow.list( $sym185$CATCH_ERROR_MESSAGE, ConsesLow.list( error_var ), ConsesLow.list( $sym186$CCATCH, $kw187$UNENCAPSULATION_ERROR, error_var, ConsesLow.listS( $sym9$CLET, $list188, ConsesLow.append( body,
        NIL ) ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/hl-transcripts.lisp", position = 43422L)
  public static SubLObject hlt_remove_constant(final SubLObject encapsulated_constant)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject constant = NIL;
    SubLObject errorP = NIL;
    try
    {
      thread.throwStack.push( subl_macro_promotions.$catch_error_message_target$.getGlobalValue() );
      final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding( thread );
      try
      {
        Errors.$error_handler$.bind( $sym130$CATCH_ERROR_MESSAGE_HANDLER, thread );
        try
        {
          try
          {
            thread.throwStack.push( $kw187$UNENCAPSULATION_ERROR );
            final SubLObject _prev_bind_0_$65 = encapsulation.$unencapsulate_constant_via_name_optimizationP$.currentBinding( thread );
            try
            {
              encapsulation.$unencapsulate_constant_via_name_optimizationP$.bind( T, thread );
              constant = encapsulation.unencapsulate( encapsulated_constant );
            }
            finally
            {
              encapsulation.$unencapsulate_constant_via_name_optimizationP$.rebind( _prev_bind_0_$65, thread );
            }
          }
          catch( final Throwable ccatch_env_var )
          {
            errorP = Errors.handleThrowable( ccatch_env_var, $kw187$UNENCAPSULATION_ERROR );
          }
          finally
          {
            thread.throwStack.pop();
          }
        }
        catch( final Throwable catch_var )
        {
          Errors.handleThrowable( catch_var, NIL );
        }
      }
      finally
      {
        Errors.$error_handler$.rebind( _prev_bind_0, thread );
      }
    }
    catch( final Throwable ccatch_env_var2 )
    {
      errorP = Errors.handleThrowable( ccatch_env_var2, subl_macro_promotions.$catch_error_message_target$.getGlobalValue() );
    }
    finally
    {
      thread.throwStack.pop();
    }
    if( NIL == errorP && NIL != constant_handles.constant_p( constant ) )
    {
      return fi.fi_kill_int( constant );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/hl-transcripts.lisp", position = 43713L)
  public static SubLObject write_existing_assertion_unassert_to_hl_transcript_stream(final SubLObject assertion, final SubLObject stream)
  {
    final SubLObject sentence = ke.ke_assertion_find_formula( assertion );
    final SubLObject mt = assertions_high.assertion_mt( assertion );
    final SubLObject encapsulated_sentence = canon_tl.tl_encapsulate( sentence );
    final SubLObject encapsulated_mt = canon_tl.tl_encapsulate( mt );
    return write_assertion_unassert_to_hl_transcript_stream( encapsulated_sentence, encapsulated_mt, stream );
  }

  @SubLTranslatedFile.SubL(source = "cycl/hl-transcripts.lisp", position = 44163L)
  public static SubLObject write_assertion_unassert_to_hl_transcript_stream(final SubLObject encapsulated_sentence, final SubLObject encapsulated_mt, final SubLObject stream)
  {
    final SubLObject hl_operation = ConsesLow.list( $sym189$HLT_UNASSERT, encapsulated_sentence, encapsulated_mt );
    save_one_hl_transcript_operation( hl_operation, stream );
    return encapsulated_sentence;
  }

  @SubLTranslatedFile.SubL(source = "cycl/hl-transcripts.lisp", position = 44476L)
  public static SubLObject hlt_unassert(final SubLObject encapsulated_sentence, final SubLObject encapsulated_mt)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject sentence = NIL;
    SubLObject mt = NIL;
    SubLObject errorP = NIL;
    try
    {
      thread.throwStack.push( subl_macro_promotions.$catch_error_message_target$.getGlobalValue() );
      final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding( thread );
      try
      {
        Errors.$error_handler$.bind( $sym130$CATCH_ERROR_MESSAGE_HANDLER, thread );
        try
        {
          try
          {
            thread.throwStack.push( $kw187$UNENCAPSULATION_ERROR );
            final SubLObject _prev_bind_0_$66 = encapsulation.$unencapsulate_constant_via_name_optimizationP$.currentBinding( thread );
            try
            {
              encapsulation.$unencapsulate_constant_via_name_optimizationP$.bind( T, thread );
              sentence = encapsulation.unencapsulate( encapsulated_sentence );
              mt = encapsulation.unencapsulate( encapsulated_mt );
            }
            finally
            {
              encapsulation.$unencapsulate_constant_via_name_optimizationP$.rebind( _prev_bind_0_$66, thread );
            }
          }
          catch( final Throwable ccatch_env_var )
          {
            errorP = Errors.handleThrowable( ccatch_env_var, $kw187$UNENCAPSULATION_ERROR );
          }
          finally
          {
            thread.throwStack.pop();
          }
        }
        catch( final Throwable catch_var )
        {
          Errors.handleThrowable( catch_var, NIL );
        }
      }
      finally
      {
        Errors.$error_handler$.rebind( _prev_bind_0, thread );
      }
    }
    catch( final Throwable ccatch_env_var2 )
    {
      errorP = Errors.handleThrowable( ccatch_env_var2, subl_macro_promotions.$catch_error_message_target$.getGlobalValue() );
    }
    finally
    {
      thread.throwStack.pop();
    }
    if( NIL == errorP )
    {
      return fi.fi_unassert_int( sentence, mt );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/hl-transcripts.lisp", position = 44814L)
  public static SubLObject write_existing_assertion_removal_to_hl_transcript_stream(final SubLObject assertion, final SubLObject stream)
  {
    final SubLObject sentence = ke.ke_assertion_find_formula( assertion );
    final SubLObject mt = assertions_high.assertion_mt( assertion );
    final SubLObject encapsulated_sentence = canon_tl.tl_encapsulate( sentence );
    final SubLObject encapsulated_mt = canon_tl.tl_encapsulate( mt );
    return write_assertion_removal_to_hl_transcript_stream( encapsulated_sentence, encapsulated_mt, stream );
  }

  @SubLTranslatedFile.SubL(source = "cycl/hl-transcripts.lisp", position = 45247L)
  public static SubLObject write_assertion_removal_to_hl_transcript_stream(final SubLObject encapsulated_sentence, final SubLObject encapsulated_mt, final SubLObject stream)
  {
    final SubLObject hl_operation = ConsesLow.list( $sym190$HLT_REMOVE_ASSERTION, encapsulated_sentence, encapsulated_mt );
    save_one_hl_transcript_operation( hl_operation, stream );
    return encapsulated_sentence;
  }

  @SubLTranslatedFile.SubL(source = "cycl/hl-transcripts.lisp", position = 45567L)
  public static SubLObject hlt_remove_assertion(final SubLObject encapsulated_sentence, final SubLObject encapsulated_mt)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject sentence = NIL;
    SubLObject mt = NIL;
    SubLObject errorP = NIL;
    try
    {
      thread.throwStack.push( subl_macro_promotions.$catch_error_message_target$.getGlobalValue() );
      final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding( thread );
      try
      {
        Errors.$error_handler$.bind( $sym130$CATCH_ERROR_MESSAGE_HANDLER, thread );
        try
        {
          try
          {
            thread.throwStack.push( $kw187$UNENCAPSULATION_ERROR );
            final SubLObject _prev_bind_0_$67 = encapsulation.$unencapsulate_constant_via_name_optimizationP$.currentBinding( thread );
            try
            {
              encapsulation.$unencapsulate_constant_via_name_optimizationP$.bind( T, thread );
              sentence = encapsulation.unencapsulate( encapsulated_sentence );
              mt = encapsulation.unencapsulate( encapsulated_mt );
            }
            finally
            {
              encapsulation.$unencapsulate_constant_via_name_optimizationP$.rebind( _prev_bind_0_$67, thread );
            }
          }
          catch( final Throwable ccatch_env_var )
          {
            errorP = Errors.handleThrowable( ccatch_env_var, $kw187$UNENCAPSULATION_ERROR );
          }
          finally
          {
            thread.throwStack.pop();
          }
        }
        catch( final Throwable catch_var )
        {
          Errors.handleThrowable( catch_var, NIL );
        }
      }
      finally
      {
        Errors.$error_handler$.rebind( _prev_bind_0, thread );
      }
    }
    catch( final Throwable ccatch_env_var2 )
    {
      errorP = Errors.handleThrowable( ccatch_env_var2, subl_macro_promotions.$catch_error_message_target$.getGlobalValue() );
    }
    finally
    {
      thread.throwStack.pop();
    }
    if( NIL == errorP )
    {
      return fi.fi_blast_int( sentence, mt );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/hl-transcripts.lisp", position = 45906L)
  public static SubLObject new_transcript_file_operations_iterator(final SubLObject transcript_file, SubLObject start, SubLObject end)
  {
    if( start == UNPROVIDED )
    {
      start = ZERO_INTEGER;
    }
    if( end == UNPROVIDED )
    {
      end = NIL;
    }
    return iteration.new_file_form_iterator( transcript_file, start, end );
  }

  @SubLTranslatedFile.SubL(source = "cycl/hl-transcripts.lisp", position = 46631L)
  public static SubLObject new_transcript_file_kb_removal_operations_iterator(final SubLObject transcript_file, SubLObject start, SubLObject end)
  {
    if( start == UNPROVIDED )
    {
      start = ZERO_INTEGER;
    }
    if( end == UNPROVIDED )
    {
      end = NIL;
    }
    return iteration.new_filter_iterator( new_transcript_file_operations_iterator( transcript_file, start, end ), $sym191$KB_REMOVAL_OPERATION_, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/hl-transcripts.lisp", position = 46867L)
  public static SubLObject transcript_file_kb_removal_operations(final SubLObject transcript_file, SubLObject start, SubLObject end)
  {
    if( start == UNPROVIDED )
    {
      start = ZERO_INTEGER;
    }
    if( end == UNPROVIDED )
    {
      end = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject kb_removal_operations = NIL;
    final SubLObject iterator_var = new_transcript_file_operations_iterator( transcript_file, start, end );
    SubLObject valid;
    for( SubLObject done_var = NIL; NIL == done_var; done_var = makeBoolean( NIL == valid ) )
    {
      thread.resetMultipleValues();
      final SubLObject op = iteration.iteration_next( iterator_var );
      valid = thread.secondMultipleValue();
      thread.resetMultipleValues();
      if( NIL != valid && NIL != kb_removal_operationP( op ) )
      {
        kb_removal_operations = ConsesLow.cons( op, kb_removal_operations );
      }
    }
    return Sequences.nreverse( kb_removal_operations );
  }

  @SubLTranslatedFile.SubL(source = "cycl/hl-transcripts.lisp", position = 47211L)
  public static SubLObject kb_removal_operationP(final SubLObject op)
  {
    if( NIL != list_utilities.proper_list_p( op ) && NIL != list_utilities.lengthE( op, FOUR_INTEGER, UNPROVIDED ) )
    {
      final SubLObject form = conses_high.fourth( op );
      if( form.isList() )
      {
        final SubLObject method = form.first();
        return list_utilities.member_eqP( method, $list192 );
      }
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/hl-transcripts.lisp", position = 47508L)
  public static SubLObject constants_to_remove_wrt_sibling_image(final SubLObject remote_machine, final SubLObject remote_port, SubLObject protocol)
  {
    if( protocol == UNPROVIDED )
    {
      protocol = $kw193$CFASL;
    }
    return kb_objects_to_remove_wrt_sibling_image_int( remote_machine, remote_port, protocol, $sym194$MISSING_CONSTANT_ID_SET, $sym16$FIND_CONSTANT_BY_INTERNAL_ID );
  }

  @SubLTranslatedFile.SubL(source = "cycl/hl-transcripts.lisp", position = 47990L)
  public static SubLObject narts_to_remove_wrt_sibling_image(final SubLObject remote_machine, final SubLObject remote_port, SubLObject protocol)
  {
    if( protocol == UNPROVIDED )
    {
      protocol = $kw193$CFASL;
    }
    return kb_objects_to_remove_wrt_sibling_image_int( remote_machine, remote_port, protocol, $sym195$MISSING_NART_ID_SET, $sym25$FIND_NART_BY_ID );
  }

  @SubLTranslatedFile.SubL(source = "cycl/hl-transcripts.lisp", position = 48262L)
  public static SubLObject assertions_to_remove_wrt_sibling_image(final SubLObject remote_machine, final SubLObject remote_port, SubLObject protocol)
  {
    if( protocol == UNPROVIDED )
    {
      protocol = $kw193$CFASL;
    }
    return kb_objects_to_remove_wrt_sibling_image_int( remote_machine, remote_port, protocol, $sym196$MISSING_ASSERTION_ID_SET, $sym33$FIND_ASSERTION_BY_ID );
  }

  @SubLTranslatedFile.SubL(source = "cycl/hl-transcripts.lisp", position = 48554L)
  public static SubLObject deductions_to_remove_wrt_sibling_image(final SubLObject remote_machine, final SubLObject remote_port, SubLObject protocol)
  {
    if( protocol == UNPROVIDED )
    {
      protocol = $kw193$CFASL;
    }
    return kb_objects_to_remove_wrt_sibling_image_int( remote_machine, remote_port, protocol, $sym197$MISSING_DEDUCTION_ID_SET, $sym41$FIND_DEDUCTION_BY_ID );
  }

  @SubLTranslatedFile.SubL(source = "cycl/hl-transcripts.lisp", position = 48888L)
  public static SubLObject kb_hl_supports_to_remove_wrt_sibling_image(final SubLObject remote_machine, final SubLObject remote_port, SubLObject protocol)
  {
    if( protocol == UNPROVIDED )
    {
      protocol = $kw193$CFASL;
    }
    return kb_objects_to_remove_wrt_sibling_image_int( remote_machine, remote_port, protocol, $sym198$MISSING_KB_HL_SUPPORT_ID_SET, $sym49$FIND_KB_HL_SUPPORT_BY_ID );
  }

  @SubLTranslatedFile.SubL(source = "cycl/hl-transcripts.lisp", position = 49173L)
  public static SubLObject kb_objects_to_remove_wrt_sibling_image_int(final SubLObject remote_machine, final SubLObject remote_port, final SubLObject protocol, final SubLObject missing_method,
      final SubLObject lookup_method)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject v_remote_image = remote_image.new_remote_image( remote_machine, remote_port, protocol );
    final SubLObject remote_form = ConsesLow.list( missing_method );
    SubLObject missing_id_set = NIL;
    final SubLObject connection = remote_image.new_remote_image_connection( v_remote_image );
    try
    {
      remote_image.open_remote_image_connection( connection );
      final SubLObject _prev_bind_0 = remote_image.$current_remote_image_connection$.currentBinding( thread );
      try
      {
        remote_image.$current_remote_image_connection$.bind( connection, thread );
        missing_id_set = remote_image.current_remote_image_connection_eval( remote_form );
      }
      finally
      {
        remote_image.$current_remote_image_connection$.rebind( _prev_bind_0, thread );
      }
    }
    finally
    {
      final SubLObject _prev_bind_2 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
      try
      {
        Threads.$is_thread_performing_cleanupP$.bind( T, thread );
        final SubLObject _values = Values.getValuesAsVector();
        remote_image.close_remote_image_connection( connection );
        Values.restoreValuesFromVector( _values );
      }
      finally
      {
        Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_2, thread );
      }
    }
    final SubLObject missing_ids = Sort.sort( set.set_element_list( missing_id_set ), Symbols.symbol_function( $sym199$_ ), UNPROVIDED );
    final SubLObject objects_to_remove = Sequences.delete( NIL, Mapping.mapcar( lookup_method, missing_ids ), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    return objects_to_remove;
  }

  @SubLTranslatedFile.SubL(source = "cycl/hl-transcripts.lisp", position = 49754L)
  public static SubLObject save_catchup_hl_transcript(SubLObject start_op, SubLObject start_checkpoint, SubLObject directory_string)
  {
    if( start_op == UNPROVIDED )
    {
      start_op = ZERO_INTEGER;
    }
    if( start_checkpoint == UNPROVIDED )
    {
      start_checkpoint = previous_dump_kb_state_checkpoint();
    }
    if( directory_string == UNPROVIDED )
    {
      directory_string = transcript_utilities.transcript_directory();
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    assert NIL != Filesys.directory_p( directory_string ) : directory_string;
    if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && NIL == file_utilities.directory_writeable_p( directory_string, UNPROVIDED ) )
    {
      Errors.error( $str201$Directory__S_is_not_writeable );
    }
    final SubLObject end_op = operation_communication.kb_op_number();
    final SubLObject el_transcript = transcript_utilities.construct_transcript_filename( transcript_utilities.make_master_transcript_filename( UNPROVIDED ) );
    final SubLObject hl_transcript = make_next_cyc_hlt_filename( start_op, end_op, directory_string );
    SubLObject stats = NIL;
    stats = save_hl_transcript_from_modification_spec( hl_transcript, ConsesLow.list( $kw106$TRANSCRIPT_FILE, ConsesLow.list( el_transcript, start_op, end_op ), $kw67$START_CHECKPOINT, start_checkpoint,
        $kw68$END_CHECKPOINT, current_kb_state_checkpoint() ) );
    return Values.values( hl_transcript, stats );
  }

  @SubLTranslatedFile.SubL(source = "cycl/hl-transcripts.lisp", position = 50565L)
  public static SubLObject make_next_cyc_hlt_filename(SubLObject start_op, SubLObject end_op, SubLObject directory_string)
  {
    if( start_op == UNPROVIDED )
    {
      start_op = ZERO_INTEGER;
    }
    if( end_op == UNPROVIDED )
    {
      end_op = operation_communication.kb_op_number();
    }
    if( directory_string == UNPROVIDED )
    {
      directory_string = transcript_utilities.transcript_directory();
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    assert NIL != Filesys.directory_p( directory_string ) : directory_string;
    if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && NIL == file_utilities.directory_writeable_p( directory_string, UNPROVIDED ) )
    {
      Errors.error( $str201$Directory__S_is_not_writeable );
    }
    SubLObject minor_version;
    SubLObject cyc_image_filename;
    SubLObject full_filename;
    for( minor_version = NIL, minor_version = ZERO_INTEGER; minor_version.numL( $int202$26 ); minor_version = Numbers.add( minor_version, ONE_INTEGER ) )
    {
      cyc_image_filename = make_cyc_hlt_filename( start_op, end_op, minor_version );
      full_filename = Sequences.cconcatenate( directory_string, cyc_image_filename );
      if( NIL == Filesys.probe_file( full_filename ) )
      {
        return full_filename;
      }
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/hl-transcripts.lisp", position = 51441L)
  public static SubLObject make_cyc_hlt_filename(SubLObject start_op, SubLObject end_op, SubLObject minor_version)
  {
    if( start_op == UNPROVIDED )
    {
      start_op = ZERO_INTEGER;
    }
    if( end_op == UNPROVIDED )
    {
      end_op = operation_communication.kb_op_number();
    }
    if( minor_version == UNPROVIDED )
    {
      minor_version = ZERO_INTEGER;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && ( NIL == subl_promotions.non_negative_integer_p( minor_version ) || !minor_version.numLE( $int203$25 ) ) )
    {
      Errors.error( $str204$Minor_version__S_is_not_in_the_ra );
    }
    final SubLObject kb_loaded = control_vars.kb_loaded();
    final SubLObject minor_version_char = Strings.sublisp_char( $str205$ABCDEFGHIJKLMNOPQRSTUVWXYZ, minor_version );
    final SubLObject filename = PrintLow.format( NIL, $str206$cyc_hlt_kb__A_op__A_to__A__C, new SubLObject[] { kb_loaded, start_op, end_op, minor_version_char
    } );
    final SubLObject extension = $str207$cfasl;
    return Sequences.cconcatenate( filename, new SubLObject[] { $str208$_, extension
    } );
  }

  @SubLTranslatedFile.SubL(source = "cycl/hl-transcripts.lisp", position = 52194L)
  public static SubLObject extract_removals_hl_transcript(final SubLObject input_filename, final SubLObject removals_filename)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject first_removal_position = $kw209$UNINITIALIZED;
    final SubLObject _prev_bind_0 = cfasl.$cfasl_input_guid_string_resource$.currentBinding( thread );
    final SubLObject _prev_bind_2 = StreamsLow.$stream_initial_input_buffer_size$.currentBinding( thread );
    final SubLObject _prev_bind_3 = StreamsLow.$stream_initial_output_buffer_size$.currentBinding( thread );
    try
    {
      cfasl.$cfasl_input_guid_string_resource$.bind( cfasl.get_new_cfasl_input_guid_string_resource(), thread );
      StreamsLow.$stream_initial_input_buffer_size$.bind( file_utilities.$default_big_stream_buffer_size$.getDynamicValue( thread ), thread );
      StreamsLow.$stream_initial_output_buffer_size$.bind( StreamsLow.$stream_initial_input_buffer_size$.getDynamicValue( thread ), thread );
      SubLObject stream = NIL;
      try
      {
        final SubLObject _prev_bind_0_$68 = stream_macros.$stream_requires_locking$.currentBinding( thread );
        try
        {
          stream_macros.$stream_requires_locking$.bind( NIL, thread );
          stream = compatibility.open_binary( input_filename, $kw72$INPUT );
        }
        finally
        {
          stream_macros.$stream_requires_locking$.rebind( _prev_bind_0_$68, thread );
        }
        if( !stream.isStream() )
        {
          Errors.error( $str70$Unable_to_open__S, input_filename );
        }
        SubLObject in_stream = stream;
        SubLObject stream_$69 = NIL;
        try
        {
          final SubLObject _prev_bind_0_$69 = stream_macros.$stream_requires_locking$.currentBinding( thread );
          try
          {
            stream_macros.$stream_requires_locking$.bind( NIL, thread );
            stream_$69 = compatibility.open_binary( removals_filename, $kw69$OUTPUT );
          }
          finally
          {
            stream_macros.$stream_requires_locking$.rebind( _prev_bind_0_$69, thread );
          }
          if( !stream_$69.isStream() )
          {
            Errors.error( $str70$Unable_to_open__S, removals_filename );
          }
          SubLObject rem_stream = stream_$69;
          in_stream = file_utilities.enable_file_stream_memory_mapping( in_stream );
          rem_stream = file_utilities.enable_file_stream_memory_mapping( rem_stream );
          final SubLObject in_length = streams_high.file_length( in_stream );
          SubLObject start_position = compatibility.get_file_position( in_stream );
          SubLObject hl_op = load_one_hl_transcript_operation( in_stream );
          SubLObject end_position = compatibility.get_file_position( in_stream );
          final SubLObject _prev_bind_0_$70 = utilities_macros.$last_percent_progress_index$.currentBinding( thread );
          final SubLObject _prev_bind_1_$72 = utilities_macros.$last_percent_progress_prediction$.currentBinding( thread );
          final SubLObject _prev_bind_2_$73 = utilities_macros.$within_noting_percent_progress$.currentBinding( thread );
          final SubLObject _prev_bind_4 = utilities_macros.$percent_progress_start_time$.currentBinding( thread );
          try
          {
            utilities_macros.$last_percent_progress_index$.bind( ZERO_INTEGER, thread );
            utilities_macros.$last_percent_progress_prediction$.bind( NIL, thread );
            utilities_macros.$within_noting_percent_progress$.bind( T, thread );
            utilities_macros.$percent_progress_start_time$.bind( Time.get_universal_time(), thread );
            try
            {
              utilities_macros.noting_percent_progress_preamble( $str210$Extracting_Removals_HL_Transcript );
              while ( $kw74$EOF != hl_op)
              {
                utilities_macros.note_percent_progress( start_position, in_length );
                final SubLObject method = hl_op.first();
                if( NIL != hlt_removal_methodP( method ) )
                {
                  if( first_removal_position == $kw209$UNINITIALIZED )
                  {
                    first_removal_position = start_position;
                  }
                  final SubLObject _prev_bind_0_$71 = $hl_transcript_compression_enabledP$.currentBinding( thread );
                  try
                  {
                    $hl_transcript_compression_enabledP$.bind( NIL, thread );
                    save_one_hl_transcript_operation( hl_op, rem_stream );
                  }
                  finally
                  {
                    $hl_transcript_compression_enabledP$.rebind( _prev_bind_0_$71, thread );
                  }
                }
                start_position = end_position;
                hl_op = load_one_hl_transcript_operation( in_stream );
                end_position = compatibility.get_file_position( in_stream );
              }
            }
            finally
            {
              final SubLObject _prev_bind_0_$72 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
              try
              {
                Threads.$is_thread_performing_cleanupP$.bind( T, thread );
                final SubLObject _values = Values.getValuesAsVector();
                utilities_macros.noting_percent_progress_postamble();
                Values.restoreValuesFromVector( _values );
              }
              finally
              {
                Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$72, thread );
              }
            }
          }
          finally
          {
            utilities_macros.$percent_progress_start_time$.rebind( _prev_bind_4, thread );
            utilities_macros.$within_noting_percent_progress$.rebind( _prev_bind_2_$73, thread );
            utilities_macros.$last_percent_progress_prediction$.rebind( _prev_bind_1_$72, thread );
            utilities_macros.$last_percent_progress_index$.rebind( _prev_bind_0_$70, thread );
          }
          save_one_hl_transcript_operation( $list90, rem_stream );
          if( first_removal_position == $kw209$UNINITIALIZED )
          {
            first_removal_position = in_length;
          }
          streams_high.force_output( rem_stream );
        }
        finally
        {
          final SubLObject _prev_bind_0_$73 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
          try
          {
            Threads.$is_thread_performing_cleanupP$.bind( T, thread );
            final SubLObject _values2 = Values.getValuesAsVector();
            if( stream_$69.isStream() )
            {
              streams_high.close( stream_$69, UNPROVIDED );
            }
            Values.restoreValuesFromVector( _values2 );
          }
          finally
          {
            Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$73, thread );
          }
        }
      }
      finally
      {
        final SubLObject _prev_bind_0_$74 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values3 = Values.getValuesAsVector();
          if( stream.isStream() )
          {
            streams_high.close( stream, UNPROVIDED );
          }
          Values.restoreValuesFromVector( _values3 );
        }
        finally
        {
          Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$74, thread );
        }
      }
    }
    finally
    {
      StreamsLow.$stream_initial_output_buffer_size$.rebind( _prev_bind_3, thread );
      StreamsLow.$stream_initial_input_buffer_size$.rebind( _prev_bind_2, thread );
      cfasl.$cfasl_input_guid_string_resource$.rebind( _prev_bind_0, thread );
    }
    final SubLObject rem_length = file_utilities.get_file_length( removals_filename );
    final SubLObject result = ConsesLow.list( $kw211$REMOVALS_START, first_removal_position, $kw212$REMOVALS_LENGTH, rem_length );
    return result;
  }

  @SubLTranslatedFile.SubL(source = "cycl/hl-transcripts.lisp", position = 59537L)
  public static SubLObject hlt_removal_methodP(final SubLObject method)
  {
    return list_utilities.member_eqP( method, $hlt_removal_methods$.getGlobalValue() );
  }

  public static SubLObject declare_hl_transcripts_file()
  {
    SubLFiles.declareMacro( me, "do_constants_by_internal_id", "DO-CONSTANTS-BY-INTERNAL-ID" );
    SubLFiles.declareFunction( me, "note_constants_by_internal_id_progress", "NOTE-CONSTANTS-BY-INTERNAL-ID-PROGRESS", 3, 0, false );
    SubLFiles.declareMacro( me, "do_narts_by_id", "DO-NARTS-BY-ID" );
    SubLFiles.declareFunction( me, "note_narts_by_id_progress", "NOTE-NARTS-BY-ID-PROGRESS", 3, 0, false );
    SubLFiles.declareMacro( me, "do_assertions_by_id", "DO-ASSERTIONS-BY-ID" );
    SubLFiles.declareFunction( me, "note_assertions_by_id_progress", "NOTE-ASSERTIONS-BY-ID-PROGRESS", 3, 0, false );
    SubLFiles.declareMacro( me, "do_deductions_by_id", "DO-DEDUCTIONS-BY-ID" );
    SubLFiles.declareFunction( me, "note_deductions_by_id_progress", "NOTE-DEDUCTIONS-BY-ID-PROGRESS", 3, 0, false );
    SubLFiles.declareMacro( me, "do_kb_hl_supports_by_id", "DO-KB-HL-SUPPORTS-BY-ID" );
    SubLFiles.declareFunction( me, "note_kb_hl_supports_by_id_progress", "NOTE-KB-HL-SUPPORTS-BY-ID-PROGRESS", 3, 0, false );
    SubLFiles.declareFunction( me, "most_recent_constants", "MOST-RECENT-CONSTANTS", 0, 1, false );
    SubLFiles.declareFunction( me, "most_recent_narts", "MOST-RECENT-NARTS", 0, 1, false );
    SubLFiles.declareFunction( me, "most_recent_assertions", "MOST-RECENT-ASSERTIONS", 0, 1, false );
    SubLFiles.declareFunction( me, "most_recent_deductions", "MOST-RECENT-DEDUCTIONS", 0, 1, false );
    SubLFiles.declareFunction( me, "most_recent_kb_hl_supports", "MOST-RECENT-KB-HL-SUPPORTS", 0, 1, false );
    SubLFiles.declareFunction( me, "most_recent_kb_objects", "MOST-RECENT-KB-OBJECTS", 4, 0, false );
    SubLFiles.declareFunction( me, "previous_dump_kb_state_checkpoint", "PREVIOUS-DUMP-KB-STATE-CHECKPOINT", 0, 0, false );
    SubLFiles.declareFunction( me, "current_kb_state_checkpoint", "CURRENT-KB-STATE-CHECKPOINT", 0, 0, false );
    SubLFiles.declareFunction( me, "make_kb_state_checkpoint", "MAKE-KB-STATE-CHECKPOINT", 5, 0, false );
    SubLFiles.declareFunction( me, "destructure_kb_state_checkpoint", "DESTRUCTURE-KB-STATE-CHECKPOINT", 1, 0, false );
    SubLFiles.declareFunction( me, "kb_checkpoint_difference", "KB-CHECKPOINT-DIFFERENCE", 0, 2, false );
    SubLFiles.declareFunction( me, "save_hl_transcript", "SAVE-HL-TRANSCRIPT", 1, 2, false );
    SubLFiles.declareFunction( me, "save_hl_transcript_from_modification_spec", "SAVE-HL-TRANSCRIPT-FROM-MODIFICATION-SPEC", 2, 0, false );
    SubLFiles.declareFunction( me, "load_hl_transcript_new", "LOAD-HL-TRANSCRIPT-NEW", 1, 1, false );
    SubLFiles.declareFunction( me, "show_hl_transcript", "SHOW-HL-TRANSCRIPT", 1, 1, false );
    SubLFiles.declareMacro( me, "with_hl_transcript_compression", "WITH-HL-TRANSCRIPT-COMPRESSION" );
    SubLFiles.declareFunction( me, "save_hl_transcript_from_modification_spec_to_stream", "SAVE-HL-TRANSCRIPT-FROM-MODIFICATION-SPEC-TO-STREAM", 2, 0, false );
    SubLFiles.declareFunction( me, "save_hl_transcript_from_modification_spec_to_stream_int", "SAVE-HL-TRANSCRIPT-FROM-MODIFICATION-SPEC-TO-STREAM-INT", 2, 0, false );
    SubLFiles.declareFunction( me, "save_hl_transcript_additions_from_modification_spec_to_stream", "SAVE-HL-TRANSCRIPT-ADDITIONS-FROM-MODIFICATION-SPEC-TO-STREAM", 2, 0, false );
    SubLFiles.declareFunction( me, "save_hl_transcript_removals_from_modification_spec_to_stream", "SAVE-HL-TRANSCRIPT-REMOVALS-FROM-MODIFICATION-SPEC-TO-STREAM", 2, 0, false );
    SubLFiles.declareFunction( me, "plist_remove_value", "PLIST-REMOVE-VALUE", 2, 1, false );
    SubLFiles.declareFunction( me, "save_one_hl_transcript_operation", "SAVE-ONE-HL-TRANSCRIPT-OPERATION", 2, 0, false );
    SubLFiles.declareFunction( me, "load_one_hl_transcript_operation", "LOAD-ONE-HL-TRANSCRIPT-OPERATION", 1, 0, false );
    SubLFiles.declareFunction( me, "process_hl_transcript_operation", "PROCESS-HL-TRANSCRIPT-OPERATION", 3, 0, false );
    SubLFiles.declareFunction( me, "process_hl_transcript_operation_int", "PROCESS-HL-TRANSCRIPT-OPERATION-INT", 1, 0, false );
    SubLFiles.declareFunction( me, "show_hl_transcript_operation", "SHOW-HL-TRANSCRIPT-OPERATION", 2, 0, false );
    SubLFiles.declareFunction( me, "possibly_transform_hl_op_wrt_compatibility", "POSSIBLY-TRANSFORM-HL-OP-WRT-COMPATIBILITY", 1, 0, false );
    SubLFiles.declareFunction( me, "hl_transcript_objects_to_compress", "HL-TRANSCRIPT-OBJECTS-TO-COMPRESS", 1, 0, false );
    SubLFiles.declareFunction( me, "new_objects_between_kb_checkpoints", "NEW-OBJECTS-BETWEEN-KB-CHECKPOINTS", 0, 2, false );
    SubLFiles.declareMacro( me, "gathering_new_kb_objects", "GATHERING-NEW-KB-OBJECTS" );
    SubLFiles.declareMacro( me, "gathering_rules_used_in_new_deductions", "GATHERING-RULES-USED-IN-NEW-DEDUCTIONS" );
    SubLFiles.declareFunction( me, "gathering_rules_used_in_new_deductions_postprocess", "GATHERING-RULES-USED-IN-NEW-DEDUCTIONS-POSTPROCESS", 2, 0, false );
    SubLFiles.declareFunction( me, "compressible_references_in_modification_spec", "COMPRESSIBLE-REFERENCES-IN-MODIFICATION-SPEC", 1, 1, false );
    SubLFiles.declareFunction( me, "increment_compressible_object_mention_count", "INCREMENT-COMPRESSIBLE-OBJECT-MENTION-COUNT", 1, 0, false );
    SubLFiles.declareFunction( me, "deduction_map", "DEDUCTION-MAP", 2, 2, false );
    SubLFiles.declareFunction( me, "kb_hl_support_map", "KB-HL-SUPPORT-MAP", 2, 2, false );
    SubLFiles.declareFunction( me, "expression_map_support", "EXPRESSION-MAP-SUPPORT", 2, 2, false );
    SubLFiles.declareMacro( me, "with_hl_transcript_created_constant_equivalence_by_name", "WITH-HL-TRANSCRIPT-CREATED-CONSTANT-EQUIVALENCE-BY-NAME" );
    SubLFiles.declareFunction( me, "new_hlt_external_id_equivalence_map", "NEW-HLT-EXTERNAL-ID-EQUIVALENCE-MAP", 0, 0, false );
    SubLFiles.declareFunction( me, "hlt_possibly_find_via_external_id_equivalence", "HLT-POSSIBLY-FIND-VIA-EXTERNAL-ID-EQUIVALENCE", 2, 0, false );
    SubLFiles.declareFunction( me, "write_constant_to_hl_transcript_stream", "WRITE-CONSTANT-TO-HL-TRANSCRIPT-STREAM", 2, 0, false );
    SubLFiles.declareFunction( me, "hlt_find_or_create", "HLT-FIND-OR-CREATE", 1, 1, false );
    SubLFiles.declareFunction( me, "hlt_find_or_create_missing_constant", "HLT-FIND-OR-CREATE-MISSING-CONSTANT", 1, 1, false );
    SubLFiles.declareFunction( me, "write_nart_to_hl_transcript_stream", "WRITE-NART-TO-HL-TRANSCRIPT-STREAM", 2, 0, false );
    SubLFiles.declareFunction( me, "hlt_find_or_create_nart", "HLT-FIND-OR-CREATE-NART", 1, 0, false );
    SubLFiles.declareFunction( me, "hlt_find_or_create_missing_nart", "HLT-FIND-OR-CREATE-MISSING-NART", 1, 0, false );
    SubLFiles.declareFunction( me, "write_assertion_to_hl_transcript_stream", "WRITE-ASSERTION-TO-HL-TRANSCRIPT-STREAM", 2, 0, false );
    SubLFiles.declareFunction( me, "hlt_find_or_create_assertion", "HLT-FIND-OR-CREATE-ASSERTION", 7, 0, false );
    SubLFiles.declareFunction( me, "hlt_find_or_create_missing_gaf", "HLT-FIND-OR-CREATE-MISSING-GAF", 2, 0, false );
    SubLFiles.declareFunction( me, "hlt_find_or_create_missing_rule", "HLT-FIND-OR-CREATE-MISSING-RULE", 2, 0, false );
    SubLFiles.declareFunction( me, "hlt_assert", "HLT-ASSERT", 5, 0, false );
    SubLFiles.declareFunction( me, "hlt_timestamp_assertion", "HLT-TIMESTAMP-ASSERTION", 5, 0, false );
    SubLFiles.declareFunction( me, "write_kb_hl_support_to_hl_transcript_stream", "WRITE-KB-HL-SUPPORT-TO-HL-TRANSCRIPT-STREAM", 2, 0, false );
    SubLFiles.declareFunction( me, "hlt_find_or_create_kb_hl_support", "HLT-FIND-OR-CREATE-KB-HL-SUPPORT", 2, 0, false );
    SubLFiles.declareFunction( me, "hlt_find_or_create_missing_kb_hl_support", "HLT-FIND-OR-CREATE-MISSING-KB-HL-SUPPORT", 1, 0, false );
    SubLFiles.declareFunction( me, "write_deduction_to_hl_transcript_stream", "WRITE-DEDUCTION-TO-HL-TRANSCRIPT-STREAM", 2, 0, false );
    SubLFiles.declareFunction( me, "hlt_find_or_create_deduction", "HLT-FIND-OR-CREATE-DEDUCTION", 3, 2, false );
    SubLFiles.declareFunction( me, "hlt_find_or_create_missing_deduction", "HLT-FIND-OR-CREATE-MISSING-DEDUCTION", 2, 3, false );
    SubLFiles.declareFunction( me, "write_existing_constant_removal_to_hl_transcript_stream", "WRITE-EXISTING-CONSTANT-REMOVAL-TO-HL-TRANSCRIPT-STREAM", 2, 0, false );
    SubLFiles.declareFunction( me, "write_constant_removal_to_hl_transcript_stream", "WRITE-CONSTANT-REMOVAL-TO-HL-TRANSCRIPT-STREAM", 2, 0, false );
    SubLFiles.declareMacro( me, "hlt_catch_unencapsulation_errors", "HLT-CATCH-UNENCAPSULATION-ERRORS" );
    SubLFiles.declareFunction( me, "hlt_remove_constant", "HLT-REMOVE-CONSTANT", 1, 0, false );
    SubLFiles.declareFunction( me, "write_existing_assertion_unassert_to_hl_transcript_stream", "WRITE-EXISTING-ASSERTION-UNASSERT-TO-HL-TRANSCRIPT-STREAM", 2, 0, false );
    SubLFiles.declareFunction( me, "write_assertion_unassert_to_hl_transcript_stream", "WRITE-ASSERTION-UNASSERT-TO-HL-TRANSCRIPT-STREAM", 3, 0, false );
    SubLFiles.declareFunction( me, "hlt_unassert", "HLT-UNASSERT", 2, 0, false );
    SubLFiles.declareFunction( me, "write_existing_assertion_removal_to_hl_transcript_stream", "WRITE-EXISTING-ASSERTION-REMOVAL-TO-HL-TRANSCRIPT-STREAM", 2, 0, false );
    SubLFiles.declareFunction( me, "write_assertion_removal_to_hl_transcript_stream", "WRITE-ASSERTION-REMOVAL-TO-HL-TRANSCRIPT-STREAM", 3, 0, false );
    SubLFiles.declareFunction( me, "hlt_remove_assertion", "HLT-REMOVE-ASSERTION", 2, 0, false );
    SubLFiles.declareFunction( me, "new_transcript_file_operations_iterator", "NEW-TRANSCRIPT-FILE-OPERATIONS-ITERATOR", 1, 2, false );
    SubLFiles.declareFunction( me, "new_transcript_file_kb_removal_operations_iterator", "NEW-TRANSCRIPT-FILE-KB-REMOVAL-OPERATIONS-ITERATOR", 1, 2, false );
    SubLFiles.declareFunction( me, "transcript_file_kb_removal_operations", "TRANSCRIPT-FILE-KB-REMOVAL-OPERATIONS", 1, 2, false );
    SubLFiles.declareFunction( me, "kb_removal_operationP", "KB-REMOVAL-OPERATION?", 1, 0, false );
    SubLFiles.declareFunction( me, "constants_to_remove_wrt_sibling_image", "CONSTANTS-TO-REMOVE-WRT-SIBLING-IMAGE", 2, 1, false );
    SubLFiles.declareFunction( me, "narts_to_remove_wrt_sibling_image", "NARTS-TO-REMOVE-WRT-SIBLING-IMAGE", 2, 1, false );
    SubLFiles.declareFunction( me, "assertions_to_remove_wrt_sibling_image", "ASSERTIONS-TO-REMOVE-WRT-SIBLING-IMAGE", 2, 1, false );
    SubLFiles.declareFunction( me, "deductions_to_remove_wrt_sibling_image", "DEDUCTIONS-TO-REMOVE-WRT-SIBLING-IMAGE", 2, 1, false );
    SubLFiles.declareFunction( me, "kb_hl_supports_to_remove_wrt_sibling_image", "KB-HL-SUPPORTS-TO-REMOVE-WRT-SIBLING-IMAGE", 2, 1, false );
    SubLFiles.declareFunction( me, "kb_objects_to_remove_wrt_sibling_image_int", "KB-OBJECTS-TO-REMOVE-WRT-SIBLING-IMAGE-INT", 5, 0, false );
    SubLFiles.declareFunction( me, "save_catchup_hl_transcript", "SAVE-CATCHUP-HL-TRANSCRIPT", 0, 3, false );
    SubLFiles.declareFunction( me, "make_next_cyc_hlt_filename", "MAKE-NEXT-CYC-HLT-FILENAME", 0, 3, false );
    SubLFiles.declareFunction( me, "make_cyc_hlt_filename", "MAKE-CYC-HLT-FILENAME", 0, 3, false );
    SubLFiles.declareFunction( me, "extract_removals_hl_transcript", "EXTRACT-REMOVALS-HL-TRANSCRIPT", 2, 0, false );
    SubLFiles.declareFunction( me, "hlt_removal_methodP", "HLT-REMOVAL-METHOD?", 1, 0, false );
    return NIL;
  }

  public static SubLObject init_hl_transcripts_file()
  {
    $hl_transcript_compression_enabledP$ = SubLFiles.defparameter( "*HL-TRANSCRIPT-COMPRESSION-ENABLED?*", T );
    $hl_transcript_common_symbols$ = SubLFiles.deflexical( "*HL-TRANSCRIPT-COMMON-SYMBOLS*", $list145 );
    $hl_transcript_el_constants$ = SubLFiles.deflexical( "*HL-TRANSCRIPT-EL-CONSTANTS*", $list146 );
    $hl_transcript_constant_external_id_equivalence_map$ = SubLFiles.defparameter( "*HL-TRANSCRIPT-CONSTANT-EXTERNAL-ID-EQUIVALENCE-MAP*", NIL );
    $hlt_removal_methods$ = SubLFiles.deflexical( "*HLT-REMOVAL-METHODS*", $list213 );
    return NIL;
  }

  public static SubLObject setup_hl_transcripts_file()
  {
    access_macros.register_macro_helper( $sym13$NOTE_CONSTANTS_BY_INTERNAL_ID_PROGRESS, $sym12$DO_CONSTANTS_BY_INTERNAL_ID );
    access_macros.register_macro_helper( $sym23$NOTE_NARTS_BY_ID_PROGRESS, $sym22$DO_NARTS_BY_ID );
    access_macros.register_macro_helper( $sym31$NOTE_ASSERTIONS_BY_ID_PROGRESS, $sym30$DO_ASSERTIONS_BY_ID );
    access_macros.register_macro_helper( $sym39$NOTE_DEDUCTIONS_BY_ID_PROGRESS, $sym38$DO_DEDUCTIONS_BY_ID );
    access_macros.register_macro_helper( $sym47$NOTE_KB_HL_SUPPORTS_BY_ID_PROGRESS, $sym46$DO_KB_HL_SUPPORTS_BY_ID );
    access_macros.register_macro_helper( $sym158$GATHERING_RULES_USED_IN_NEW_DEDUCTIONS_POSTPROCESS, $sym159$GATHERING_RULES_USED_IN_NEW_DEDUCTIONS );
    utilities_macros.note_funcall_helper_function( $sym161$INCREMENT_COMPRESSIBLE_OBJECT_MENTION_COUNT );
    access_macros.register_macro_helper( $sym166$NEW_HLT_EXTERNAL_ID_EQUIVALENCE_MAP, $sym167$WITH_HL_TRANSCRIPT_CREATED_CONSTANT_EQUIVALENCE_BY_NAME );
    utilities_macros.note_funcall_helper_function( $sym138$HLT_FIND_OR_CREATE );
    utilities_macros.note_funcall_helper_function( $sym136$HLT_FIND_OR_CREATE_NART );
    utilities_macros.note_funcall_helper_function( $sym140$HLT_FIND_OR_CREATE_ASSERTION );
    utilities_macros.note_funcall_helper_function( $sym170$HLT_ASSERT );
    utilities_macros.note_funcall_helper_function( $sym179$HLT_TIMESTAMP_ASSERTION );
    utilities_macros.note_funcall_helper_function( $sym183$HLT_REMOVE_CONSTANT );
    utilities_macros.note_funcall_helper_function( $sym189$HLT_UNASSERT );
    utilities_macros.note_funcall_helper_function( $sym190$HLT_REMOVE_ASSERTION );
    return NIL;
  }

  @Override
  public void declareFunctions()
  {
    declare_hl_transcripts_file();
  }

  @Override
  public void initializeVariables()
  {
    init_hl_transcripts_file();
  }

  @Override
  public void runTopLevelForms()
  {
    setup_hl_transcripts_file();
  }
  static
  {
    me = new hl_transcripts();
    $hl_transcript_compression_enabledP$ = null;
    $hl_transcript_common_symbols$ = null;
    $hl_transcript_el_constants$ = null;
    $hl_transcript_constant_external_id_equivalence_map$ = null;
    $hlt_removal_methods$ = null;
    $list0 = ConsesLow.list( ConsesLow.list( makeSymbol( "CONSTANT-VAR" ), makeSymbol( "&KEY" ), makeSymbol( "START" ), makeSymbol( "END" ), makeSymbol( "PROGRESS-MESSAGE" ), makeSymbol( "DONE" ) ), makeSymbol(
        "&BODY" ), makeSymbol( "BODY" ) );
    $list1 = ConsesLow.list( makeKeyword( "START" ), makeKeyword( "END" ), makeKeyword( "PROGRESS-MESSAGE" ), makeKeyword( "DONE" ) );
    $kw2$ALLOW_OTHER_KEYS = makeKeyword( "ALLOW-OTHER-KEYS" );
    $kw3$START = makeKeyword( "START" );
    $kw4$END = makeKeyword( "END" );
    $kw5$PROGRESS_MESSAGE = makeKeyword( "PROGRESS-MESSAGE" );
    $kw6$DONE = makeKeyword( "DONE" );
    $sym7$PROGRESS_VAR = makeUninternedSymbol( "PROGRESS-VAR" );
    $sym8$TOTAL_VAR = makeUninternedSymbol( "TOTAL-VAR" );
    $sym9$CLET = makeSymbol( "CLET" );
    $sym10$_ = makeSymbol( "-" );
    $sym11$NOTING_PERCENT_PROGRESS = makeSymbol( "NOTING-PERCENT-PROGRESS" );
    $sym12$DO_CONSTANTS_BY_INTERNAL_ID = makeSymbol( "DO-CONSTANTS-BY-INTERNAL-ID" );
    $sym13$NOTE_CONSTANTS_BY_INTERNAL_ID_PROGRESS = makeSymbol( "NOTE-CONSTANTS-BY-INTERNAL-ID-PROGRESS" );
    $sym14$ID_VAR = makeUninternedSymbol( "ID-VAR" );
    $sym15$DO_NUMBERS = makeSymbol( "DO-NUMBERS" );
    $sym16$FIND_CONSTANT_BY_INTERNAL_ID = makeSymbol( "FIND-CONSTANT-BY-INTERNAL-ID" );
    $sym17$PWHEN = makeSymbol( "PWHEN" );
    $sym18$CONSTANT_P = makeSymbol( "CONSTANT-P" );
    $list19 = ConsesLow.list( ConsesLow.list( makeSymbol( "NART-VAR" ), makeSymbol( "&KEY" ), makeSymbol( "START" ), makeSymbol( "END" ), makeSymbol( "PROGRESS-MESSAGE" ), makeSymbol( "DONE" ) ), makeSymbol( "&BODY" ),
        makeSymbol( "BODY" ) );
    $sym20$PROGRESS_VAR = makeUninternedSymbol( "PROGRESS-VAR" );
    $sym21$TOTAL_VAR = makeUninternedSymbol( "TOTAL-VAR" );
    $sym22$DO_NARTS_BY_ID = makeSymbol( "DO-NARTS-BY-ID" );
    $sym23$NOTE_NARTS_BY_ID_PROGRESS = makeSymbol( "NOTE-NARTS-BY-ID-PROGRESS" );
    $sym24$ID_VAR = makeUninternedSymbol( "ID-VAR" );
    $sym25$FIND_NART_BY_ID = makeSymbol( "FIND-NART-BY-ID" );
    $sym26$NART_P = makeSymbol( "NART-P" );
    $list27 = ConsesLow.list( ConsesLow.list( makeSymbol( "ASSERTION-VAR" ), makeSymbol( "&KEY" ), makeSymbol( "START" ), makeSymbol( "END" ), makeSymbol( "PROGRESS-MESSAGE" ), makeSymbol( "DONE" ) ), makeSymbol(
        "&BODY" ), makeSymbol( "BODY" ) );
    $sym28$PROGRESS_VAR = makeUninternedSymbol( "PROGRESS-VAR" );
    $sym29$TOTAL_VAR = makeUninternedSymbol( "TOTAL-VAR" );
    $sym30$DO_ASSERTIONS_BY_ID = makeSymbol( "DO-ASSERTIONS-BY-ID" );
    $sym31$NOTE_ASSERTIONS_BY_ID_PROGRESS = makeSymbol( "NOTE-ASSERTIONS-BY-ID-PROGRESS" );
    $sym32$ID_VAR = makeUninternedSymbol( "ID-VAR" );
    $sym33$FIND_ASSERTION_BY_ID = makeSymbol( "FIND-ASSERTION-BY-ID" );
    $sym34$ASSERTION_P = makeSymbol( "ASSERTION-P" );
    $list35 = ConsesLow.list( ConsesLow.list( makeSymbol( "DEDUCTION-VAR" ), makeSymbol( "&KEY" ), makeSymbol( "START" ), makeSymbol( "END" ), makeSymbol( "PROGRESS-MESSAGE" ), makeSymbol( "DONE" ) ), makeSymbol(
        "&BODY" ), makeSymbol( "BODY" ) );
    $sym36$PROGRESS_VAR = makeUninternedSymbol( "PROGRESS-VAR" );
    $sym37$TOTAL_VAR = makeUninternedSymbol( "TOTAL-VAR" );
    $sym38$DO_DEDUCTIONS_BY_ID = makeSymbol( "DO-DEDUCTIONS-BY-ID" );
    $sym39$NOTE_DEDUCTIONS_BY_ID_PROGRESS = makeSymbol( "NOTE-DEDUCTIONS-BY-ID-PROGRESS" );
    $sym40$ID_VAR = makeUninternedSymbol( "ID-VAR" );
    $sym41$FIND_DEDUCTION_BY_ID = makeSymbol( "FIND-DEDUCTION-BY-ID" );
    $sym42$DEDUCTION_P = makeSymbol( "DEDUCTION-P" );
    $list43 = ConsesLow.list( ConsesLow.list( makeSymbol( "KB-HL-SUPPORT-VAR" ), makeSymbol( "&KEY" ), makeSymbol( "START" ), makeSymbol( "END" ), makeSymbol( "PROGRESS-MESSAGE" ), makeSymbol( "DONE" ) ), makeSymbol(
        "&BODY" ), makeSymbol( "BODY" ) );
    $sym44$PROGRESS_VAR = makeUninternedSymbol( "PROGRESS-VAR" );
    $sym45$TOTAL_VAR = makeUninternedSymbol( "TOTAL-VAR" );
    $sym46$DO_KB_HL_SUPPORTS_BY_ID = makeSymbol( "DO-KB-HL-SUPPORTS-BY-ID" );
    $sym47$NOTE_KB_HL_SUPPORTS_BY_ID_PROGRESS = makeSymbol( "NOTE-KB-HL-SUPPORTS-BY-ID-PROGRESS" );
    $sym48$ID_VAR = makeUninternedSymbol( "ID-VAR" );
    $sym49$FIND_KB_HL_SUPPORT_BY_ID = makeSymbol( "FIND-KB-HL-SUPPORT-BY-ID" );
    $sym50$KB_HL_SUPPORT_P = makeSymbol( "KB-HL-SUPPORT-P" );
    $sym51$NEXT_CONSTANT_SUID = makeSymbol( "NEXT-CONSTANT-SUID" );
    $sym52$VALID_CONSTANT_ = makeSymbol( "VALID-CONSTANT?" );
    $sym53$NEXT_NART_ID = makeSymbol( "NEXT-NART-ID" );
    $sym54$VALID_NART_ = makeSymbol( "VALID-NART?" );
    $sym55$NEXT_ASSERTION_ID = makeSymbol( "NEXT-ASSERTION-ID" );
    $sym56$VALID_ASSERTION_ = makeSymbol( "VALID-ASSERTION?" );
    $sym57$NEXT_DEDUCTION_ID = makeSymbol( "NEXT-DEDUCTION-ID" );
    $sym58$VALID_DEDUCTION_ = makeSymbol( "VALID-DEDUCTION?" );
    $sym59$NEXT_KB_HL_SUPPORT_ID = makeSymbol( "NEXT-KB-HL-SUPPORT-ID" );
    $sym60$VALID_KB_HL_SUPPORT_ = makeSymbol( "VALID-KB-HL-SUPPORT?" );
    $sym61$NON_NEGATIVE_INTEGER_P = makeSymbol( "NON-NEGATIVE-INTEGER-P" );
    $kw62$CONSTANT = makeKeyword( "CONSTANT" );
    $kw63$NART = makeKeyword( "NART" );
    $kw64$ASSERTION = makeKeyword( "ASSERTION" );
    $kw65$KB_HL_SUPPORT = makeKeyword( "KB-HL-SUPPORT" );
    $kw66$DEDUCTION = makeKeyword( "DEDUCTION" );
    $kw67$START_CHECKPOINT = makeKeyword( "START-CHECKPOINT" );
    $kw68$END_CHECKPOINT = makeKeyword( "END-CHECKPOINT" );
    $kw69$OUTPUT = makeKeyword( "OUTPUT" );
    $str70$Unable_to_open__S = makeString( "Unable to open ~S" );
    $kw71$WARN = makeKeyword( "WARN" );
    $kw72$INPUT = makeKeyword( "INPUT" );
    $str73$Loading_HL_Transcript_ = makeString( "Loading HL Transcript " );
    $kw74$EOF = makeKeyword( "EOF" );
    $list75 = ConsesLow.list( ConsesLow.list( makeSymbol( "STREAM" ), makeSymbol( "&KEY" ), makeSymbol( "MODIFICATION-SPEC" ) ), makeSymbol( "&BODY" ), makeSymbol( "BODY" ) );
    $list76 = ConsesLow.list( makeKeyword( "MODIFICATION-SPEC" ) );
    $kw77$MODIFICATION_SPEC = makeKeyword( "MODIFICATION-SPEC" );
    $sym78$MOD_SPEC_VAR = makeUninternedSymbol( "MOD-SPEC-VAR" );
    $sym79$OBJECTS_TO_COMPRESS = makeUninternedSymbol( "OBJECTS-TO-COMPRESS" );
    $sym80$COMPRESSION_SAMPLE = makeUninternedSymbol( "COMPRESSION-SAMPLE" );
    $sym81$COMPRESSION_OPTIONS = makeUninternedSymbol( "COMPRESSION-OPTIONS" );
    $sym82$HL_TRANSCRIPT_OBJECTS_TO_COMPRESS = makeSymbol( "HL-TRANSCRIPT-OBJECTS-TO-COMPRESS" );
    $sym83$APPEND = makeSymbol( "APPEND" );
    $sym84$LIST = makeSymbol( "LIST" );
    $kw85$EXTERNALIZED_ = makeKeyword( "EXTERNALIZED?" );
    $kw86$ANALYZE = makeKeyword( "ANALYZE" );
    $sym87$WITH_CFASL_COMPRESSION = makeSymbol( "WITH-CFASL-COMPRESSION" );
    $sym88$SAVE_ONE_HL_TRANSCRIPT_OPERATION = makeSymbol( "SAVE-ONE-HL-TRANSCRIPT-OPERATION" );
    $list89 = ConsesLow.list( makeSymbol( "QUOTE" ), ConsesLow.list( makeSymbol( "IGNORE" ) ) );
    $list90 = ConsesLow.list( makeSymbol( "IGNORE" ) );
    $kw91$NEW_CONSTANTS = makeKeyword( "NEW-CONSTANTS" );
    $kw92$NEW_NARTS = makeKeyword( "NEW-NARTS" );
    $kw93$NEW_ASSERTIONS = makeKeyword( "NEW-ASSERTIONS" );
    $kw94$NEW_KB_HL_SUPPORTS = makeKeyword( "NEW-KB-HL-SUPPORTS" );
    $kw95$NEW_DEDUCTIONS = makeKeyword( "NEW-DEDUCTIONS" );
    $str96$saving_constants = makeString( "saving constants" );
    $str97$saving_NARTs = makeString( "saving NARTs" );
    $str98$saving_assertions = makeString( "saving assertions" );
    $str99$saving_KB_HL_supports = makeString( "saving KB HL supports" );
    $str100$saving_deductions = makeString( "saving deductions" );
    $kw101$CONSTANTS = makeKeyword( "CONSTANTS" );
    $kw102$NARTS = makeKeyword( "NARTS" );
    $kw103$ASSERTIONS = makeKeyword( "ASSERTIONS" );
    $kw104$KB_HL_SUPPORTS = makeKeyword( "KB-HL-SUPPORTS" );
    $kw105$DEDUCTIONS = makeKeyword( "DEDUCTIONS" );
    $kw106$TRANSCRIPT_FILE = makeKeyword( "TRANSCRIPT-FILE" );
    $kw107$REMOVE_CONSTANTS = makeKeyword( "REMOVE-CONSTANTS" );
    $kw108$REMOVE_NARTS = makeKeyword( "REMOVE-NARTS" );
    $kw109$REMOVE_ASSERTIONS = makeKeyword( "REMOVE-ASSERTIONS" );
    $kw110$REMOVE_DEDUCTIONS = makeKeyword( "REMOVE-DEDUCTIONS" );
    $list111 = ConsesLow.list( makeSymbol( "TRANSCRIPT-FILENAME" ), makeSymbol( "&OPTIONAL" ), ConsesLow.list( makeSymbol( "START-OP" ), ZERO_INTEGER ), makeSymbol( "END-OP" ) );
    $list112 = ConsesLow.list( makeSymbol( "METHOD" ), makeSymbol( "&REST" ), makeSymbol( "ARGS" ) );
    $sym113$FI_KILL = makeSymbol( "FI-KILL" );
    $list114 = ConsesLow.list( makeSymbol( "ENCAPSULATED-CONSTANT" ) );
    $sym115$FI_MERGE = makeSymbol( "FI-MERGE" );
    $list116 = ConsesLow.list( makeSymbol( "ENCAPSULATED-KILL" ), makeSymbol( "ENCAPSULATED-KEEP" ) );
    $sym117$FI_UNASSERT = makeSymbol( "FI-UNASSERT" );
    $list118 = ConsesLow.list( makeSymbol( "ENCAPSULATED-SENTENCE" ), makeSymbol( "ENCAPSULATED-MT" ) );
    $sym119$FI_BLAST = makeSymbol( "FI-BLAST" );
    $str120$time_to_implement__S = makeString( "time to implement ~S" );
    $kw121$REMOVED_CONSTANTS = makeKeyword( "REMOVED-CONSTANTS" );
    $kw122$REMOVED_NARTS = makeKeyword( "REMOVED-NARTS" );
    $kw123$REMOVED_ASSERTIONS = makeKeyword( "REMOVED-ASSERTIONS" );
    $kw124$REMOVED_KB_HL_SUPPORTS = makeKeyword( "REMOVED-KB-HL-SUPPORTS" );
    $kw125$REMOVED_DEDUCTIONS = makeKeyword( "REMOVED-DEDUCTIONS" );
    $sym126$CDR = makeSymbol( "CDR" );
    $kw127$IGNORE = makeKeyword( "IGNORE" );
    $kw128$IGNORE_ERRORS_TARGET = makeKeyword( "IGNORE-ERRORS-TARGET" );
    $sym129$IGNORE_ERRORS_HANDLER = makeSymbol( "IGNORE-ERRORS-HANDLER", "SUBLISP" );
    $sym130$CATCH_ERROR_MESSAGE_HANDLER = makeSymbol( "CATCH-ERROR-MESSAGE-HANDLER" );
    $str131$operation__S___S___A = makeString( "operation ~S~%~S~%~A" );
    $kw132$ERROR = makeKeyword( "ERROR" );
    $str133$unexpected_error_mode__S = makeString( "unexpected error mode ~S" );
    $list134 = ConsesLow.cons( makeSymbol( "FUNCTION-SPEC" ), makeSymbol( "ARGS" ) );
    $sym135$CYC_FIND_OR_CREATE_CANONICAL_NART = makeSymbol( "CYC-FIND-OR-CREATE-CANONICAL-NART" );
    $sym136$HLT_FIND_OR_CREATE_NART = makeSymbol( "HLT-FIND-OR-CREATE-NART" );
    $sym137$CYC_FIND_OR_CREATE = makeSymbol( "CYC-FIND-OR-CREATE" );
    $sym138$HLT_FIND_OR_CREATE = makeSymbol( "HLT-FIND-OR-CREATE" );
    $sym139$FIND_OR_CREATE_ASSERTION = makeSymbol( "FIND-OR-CREATE-ASSERTION" );
    $sym140$HLT_FIND_OR_CREATE_ASSERTION = makeSymbol( "HLT-FIND-OR-CREATE-ASSERTION" );
    $sym141$FIND_OR_CREATE_KB_HL_SUPPORT = makeSymbol( "FIND-OR-CREATE-KB-HL-SUPPORT" );
    $sym142$HLT_FIND_OR_CREATE_KB_HL_SUPPORT = makeSymbol( "HLT-FIND-OR-CREATE-KB-HL-SUPPORT" );
    $sym143$TMS_ADD_DEDUCTION_FOR_ASSERTION = makeSymbol( "TMS-ADD-DEDUCTION-FOR-ASSERTION" );
    $sym144$HLT_FIND_OR_CREATE_DEDUCTION = makeSymbol( "HLT-FIND-OR-CREATE-DEDUCTION" );
    $list145 = ConsesLow.list( new SubLObject[] { makeKeyword( "FORWARD" ), makeKeyword( "BACKWARD" ), makeKeyword( "TRUE" ), makeKeyword( "FALSE" ), makeKeyword( "DEFAULT" ), makeKeyword( "MONOTONIC" ), makeKeyword(
        "ASSERTED-TRUE-DEF" ), makeKeyword( "ASSERTED-TRUE-MON" ), makeKeyword( "HP" ), makeSymbol( "HLT-FIND-OR-CREATE" ), makeSymbol( "HLT-FIND-OR-CREATE-NART" ), makeSymbol( "HLT-FIND-OR-CREATE-ASSERTION" ),
      makeSymbol( "HLT-ASSERT" ), makeSymbol( "HLT-FIND-OR-CREATE-KB-HL-SUPPORT" ), makeSymbol( "HLT-FIND-OR-CREATE-DEDUCTION" ), makeSymbol( "HLT-REMOVE-CONSTANT" ), makeSymbol( "HLT-REMOVE-NART" ), makeSymbol(
          "HLT-UNASSERT" ), makeSymbol( "HLT-REMOVE-ASSERTION" ), makeSymbol( "HLT-REMOVE-DEDUCTION" )
    } );
    $list146 = ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "not" ) ), constant_handles.reader_make_constant_shell( makeString( "implies" ) ), constant_handles.reader_make_constant_shell(
        makeString( "thereExists" ) ), constant_handles.reader_make_constant_shell( makeString( "forAll" ) ) );
    $list147 = ConsesLow.list( ConsesLow.list( makeSymbol( "RESULT-VAR" ) ), makeSymbol( "&BODY" ), makeSymbol( "BODY" ) );
    $sym148$START = makeUninternedSymbol( "START" );
    $list149 = ConsesLow.list( ConsesLow.list( makeSymbol( "CURRENT-KB-STATE-CHECKPOINT" ) ) );
    $sym150$CSETQ = makeSymbol( "CSETQ" );
    $sym151$NEW_OBJECTS_BETWEEN_KB_CHECKPOINTS = makeSymbol( "NEW-OBJECTS-BETWEEN-KB-CHECKPOINTS" );
    $list152 = ConsesLow.list( ConsesLow.list( makeSymbol( "RULES-VAR" ), makeSymbol( "&KEY" ), ConsesLow.list( makeSymbol( "DIRECTION" ), makeKeyword( "FORWARD" ) ) ), makeSymbol( "&BODY" ), makeSymbol( "BODY" ) );
    $list153 = ConsesLow.list( makeKeyword( "DIRECTION" ) );
    $kw154$DIRECTION = makeKeyword( "DIRECTION" );
    $kw155$FORWARD = makeKeyword( "FORWARD" );
    $sym156$NEW_OBJECTS = makeUninternedSymbol( "NEW-OBJECTS" );
    $sym157$GATHERING_NEW_KB_OBJECTS = makeSymbol( "GATHERING-NEW-KB-OBJECTS" );
    $sym158$GATHERING_RULES_USED_IN_NEW_DEDUCTIONS_POSTPROCESS = makeSymbol( "GATHERING-RULES-USED-IN-NEW-DEDUCTIONS-POSTPROCESS" );
    $sym159$GATHERING_RULES_USED_IN_NEW_DEDUCTIONS = makeSymbol( "GATHERING-RULES-USED-IN-NEW-DEDUCTIONS" );
    $int160$500 = makeInteger( 500 );
    $sym161$INCREMENT_COMPRESSIBLE_OBJECT_MENTION_COUNT = makeSymbol( "INCREMENT-COMPRESSIBLE-OBJECT-MENTION-COUNT" );
    $sym162$_ = makeSymbol( ">" );
    $int163$32 = makeInteger( 32 );
    $str164$_S_was_not_a_support_p = makeString( "~S was not a support-p" );
    $list165 = ConsesLow.list( ConsesLow.list( makeSymbol( "*HL-TRANSCRIPT-CONSTANT-EXTERNAL-ID-EQUIVALENCE-MAP*" ), ConsesLow.list( makeSymbol( "NEW-HLT-EXTERNAL-ID-EQUIVALENCE-MAP" ) ) ), ConsesLow.list( makeSymbol(
        "*CONSTANT-EXTERNAL-ID-EQUIVALENCE-MAP*" ), makeSymbol( "*HL-TRANSCRIPT-CONSTANT-EXTERNAL-ID-EQUIVALENCE-MAP*" ) ) );
    $sym166$NEW_HLT_EXTERNAL_ID_EQUIVALENCE_MAP = makeSymbol( "NEW-HLT-EXTERNAL-ID-EQUIVALENCE-MAP" );
    $sym167$WITH_HL_TRANSCRIPT_CREATED_CONSTANT_EQUIVALENCE_BY_NAME = makeSymbol( "WITH-HL-TRANSCRIPT-CREATED-CONSTANT-EQUIVALENCE-BY-NAME" );
    $str168$missing_constant_added___S = makeString( "missing constant added: ~S" );
    $str169$missing_NART_added___S = makeString( "missing NART added: ~S" );
    $sym170$HLT_ASSERT = makeSymbol( "HLT-ASSERT" );
    $kw171$UNKNOWN = makeKeyword( "UNKNOWN" );
    $kw172$DEFAULT = makeKeyword( "DEFAULT" );
    $str173$missing_gaf_added___S = makeString( "missing gaf added: ~S" );
    $kw174$BACKWARD = makeKeyword( "BACKWARD" );
    $str175$missing_rule_added___S = makeString( "missing rule added: ~S" );
    $kw176$STRENGTH = makeKeyword( "STRENGTH" );
    $kw177$CHECK_WFF_ = makeKeyword( "CHECK-WFF?" );
    $kw178$FORWARD_RULES = makeKeyword( "FORWARD-RULES" );
    $sym179$HLT_TIMESTAMP_ASSERTION = makeSymbol( "HLT-TIMESTAMP-ASSERTION" );
    $str180$missing_KB_HL_support_added___S = makeString( "missing KB HL support added: ~S" );
    $kw181$TRUE = makeKeyword( "TRUE" );
    $str182$missing_deduction_added___S = makeString( "missing deduction added: ~S" );
    $sym183$HLT_REMOVE_CONSTANT = makeSymbol( "HLT-REMOVE-CONSTANT" );
    $list184 = ConsesLow.list( makeSymbol( "ERROR-VAR" ), makeSymbol( "&BODY" ), makeSymbol( "BODY" ) );
    $sym185$CATCH_ERROR_MESSAGE = makeSymbol( "CATCH-ERROR-MESSAGE" );
    $sym186$CCATCH = makeSymbol( "CCATCH" );
    $kw187$UNENCAPSULATION_ERROR = makeKeyword( "UNENCAPSULATION-ERROR" );
    $list188 = ConsesLow.list( ConsesLow.list( makeSymbol( "*UNENCAPSULATE-CONSTANT-VIA-NAME-OPTIMIZATION?*" ), T ) );
    $sym189$HLT_UNASSERT = makeSymbol( "HLT-UNASSERT" );
    $sym190$HLT_REMOVE_ASSERTION = makeSymbol( "HLT-REMOVE-ASSERTION" );
    $sym191$KB_REMOVAL_OPERATION_ = makeSymbol( "KB-REMOVAL-OPERATION?" );
    $list192 = ConsesLow.list( makeSymbol( "FI-UNASSERT" ), makeSymbol( "FI-KILL" ), makeSymbol( "FI-BLAST" ), makeSymbol( "FI-MERGE" ) );
    $kw193$CFASL = makeKeyword( "CFASL" );
    $sym194$MISSING_CONSTANT_ID_SET = makeSymbol( "MISSING-CONSTANT-ID-SET" );
    $sym195$MISSING_NART_ID_SET = makeSymbol( "MISSING-NART-ID-SET" );
    $sym196$MISSING_ASSERTION_ID_SET = makeSymbol( "MISSING-ASSERTION-ID-SET" );
    $sym197$MISSING_DEDUCTION_ID_SET = makeSymbol( "MISSING-DEDUCTION-ID-SET" );
    $sym198$MISSING_KB_HL_SUPPORT_ID_SET = makeSymbol( "MISSING-KB-HL-SUPPORT-ID-SET" );
    $sym199$_ = makeSymbol( "<" );
    $sym200$DIRECTORY_P = makeSymbol( "DIRECTORY-P" );
    $str201$Directory__S_is_not_writeable = makeString( "Directory ~S is not writeable" );
    $int202$26 = makeInteger( 26 );
    $int203$25 = makeInteger( 25 );
    $str204$Minor_version__S_is_not_in_the_ra = makeString( "Minor-version ~S is not in the range 0 - 25." );
    $str205$ABCDEFGHIJKLMNOPQRSTUVWXYZ = makeString( "ABCDEFGHIJKLMNOPQRSTUVWXYZ" );
    $str206$cyc_hlt_kb__A_op__A_to__A__C = makeString( "cyc-hlt-kb-~A-op-~A-to-~A-~C" );
    $str207$cfasl = makeString( "cfasl" );
    $str208$_ = makeString( "." );
    $kw209$UNINITIALIZED = makeKeyword( "UNINITIALIZED" );
    $str210$Extracting_Removals_HL_Transcript = makeString( "Extracting Removals HL Transcript" );
    $kw211$REMOVALS_START = makeKeyword( "REMOVALS-START" );
    $kw212$REMOVALS_LENGTH = makeKeyword( "REMOVALS-LENGTH" );
    $list213 = ConsesLow.list( makeSymbol( "HLT-REMOVE-CONSTANT" ), makeSymbol( "HLT-REMOVE-NART" ), makeSymbol( "HLT-UNASSERT" ), makeSymbol( "HLT-REMOVE-ASSERTION" ), makeSymbol( "HLT-REMOVE-DEDUCTION" ) );
  }
}
/*
 * 
 * Total time: 2524 ms
 * 
 */