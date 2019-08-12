/***
 *   Copyright (c) 1995-2009 Cycorp Inc.
 * 
 *   Licensed under the Apache License, Version 2.0 (the "License");
 *   you may not use this file except in compliance with the License.
 *   You may obtain a copy of the License at
 *   
 *   http://www.apache.org/licenses/LICENSE-2.0
 * 
 *   Unless required by applicable law or agreed to in writing, software
 *   distributed under the License is distributed on an "AS IS" BASIS,
 *   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *   See the License for the specific language governing permissions and
 *   limitations under the License.
 *
 *  Substantial portions of this code were developed by the Cyc project
 *  and by Cycorp Inc, whose contribution is gratefully acknowledged.
*/

package com.cyc.cycjava_1.cycl;

import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import static com.cyc.tool.subl.util.SubLFiles.*;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.*;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.*;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.*;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.*;
import com.cyc.tool.subl.util.*;


//dm import com.cyc.cycjava_1.cycl.access_macros;
//dm import com.cyc.cycjava_1.cycl.constant_handles;
//dm import com.cyc.cycjava_1.cycl.constants_high;
//dm import com.cyc.cycjava_1.cycl.control_vars;
//dm import com.cyc.cycjava_1.cycl.cyc_bookkeeping;
//dm import com.cyc.cycjava_1.cycl.cycl_variables;
//dm import com.cyc.cycjava_1.cycl.encapsulation;
//dm import com.cyc.cycjava_1.cycl.eval_in_api;
//dm import com.cyc.cycjava_1.cycl.file_utilities;
//dm import com.cyc.cycjava_1.cycl.format_nil;
//dm import com.cyc.cycjava_1.cycl.hash_table_utilities;
//dm import com.cyc.cycjava_1.cycl.isa;
//dm import com.cyc.cycjava_1.cycl.list_utilities;
//dm import com.cyc.cycjava_1.cycl.mt_vars;
//dm import com.cyc.cycjava_1.cycl.numeric_date_utilities;
//dm import com.cyc.cycjava_1.cycl.operation_communication;
//dm import com.cyc.cycjava_1.cycl.operation_queues;
//dm import com.cyc.cycjava_1.cycl.precanonicalizer;
//dm import com.cyc.cycjava_1.cycl.string_utilities;
//dm import com.cyc.cycjava_1.cycl.subl_macro_promotions;
//dm import com.cyc.cycjava_1.cycl.transcript_server;
//dm import com.cyc.cycjava_1.cycl.utilities_macros;

public  final class transcript_utilities extends SubLTranslatedFile {

  //// Constructor

  private transcript_utilities() {}
  public static final SubLFile me = new transcript_utilities();
  public static final String myName = "com.cyc.cycjava_1.cycl.transcript_utilities";

  //// Definitions

  /** Initialize or reinitialize the handling of transcripts. */
  @SubL(source = "cycl/transcript-utilities.lisp", position = 2074) 
  public static final SubLObject initialize_transcript_handling() {
    set_master_transcript_already_exists(NIL);
    new_local_transcript();
    set_master_transcript(UNPROVIDED);
    set_read_transcript(master_transcript());
    if ((NIL != transcript_server.use_transcript_server())) {
      control_vars.$auto_increment_kb$.setGlobalValue(T);
    }
    return T;
  }

  @SubL(source = "cycl/transcript-utilities.lisp", position = 2599) 
  public static SubLSymbol $transcript_suffix$ = null;

  @SubL(source = "cycl/transcript-utilities.lisp", position = 2640) 
  public static final SubLObject transcript_suffix() {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      return $transcript_suffix$.getDynamicValue(thread);
    }
  }

  /** Boolean: has the master transcript been accessed --
probed, touched, written to, or read from -- yet? */
  @SubL(source = "cycl/transcript-utilities.lisp", position = 2706) 
  public static SubLSymbol $master_transcript_already_exists$ = null;

  @SubL(source = "cycl/transcript-utilities.lisp", position = 3016) 
  public static final SubLObject set_master_transcript_already_exists(SubLObject number) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      $master_transcript_already_exists$.setDynamicValue(number, thread);
      return $master_transcript_already_exists$.getDynamicValue(thread);
    }
  }

  @SubL(source = "cycl/transcript-utilities.lisp", position = 3174) 
  public static SubLSymbol $local_transcript_version$ = null;

  @SubL(source = "cycl/transcript-utilities.lisp", position = 3216) 
  public static final SubLObject local_transcript_version() {
    return $local_transcript_version$.getGlobalValue();
  }

  @SubL(source = "cycl/transcript-utilities.lisp", position = 3416) 
  public static SubLSymbol $local_transcript_history$ = null;

  @SubL(source = "cycl/transcript-utilities.lisp", position = 3711) 
  public static SubLSymbol $local_hl_transcript_version$ = null;

  @SubL(source = "cycl/transcript-utilities.lisp", position = 3971) 
  public static SubLSymbol $local_hl_transcript_history$ = null;

  @SubL(source = "cycl/transcript-utilities.lisp", position = 4284) 
  public static SubLSymbol $read_transcript_position$ = null;

  @SubL(source = "cycl/transcript-utilities.lisp", position = 4683) 
  public static SubLSymbol $approx_chars_per_op$ = null;

  /** A transcript containing operations from an individual Cyc image */
  @SubL(source = "cycl/transcript-utilities.lisp", position = 4914) 
  public static SubLSymbol $local_transcript$ = null;

  /** Accessor for *local-transcript*. */
  @SubL(source = "cycl/transcript-utilities.lisp", position = 5188) 
  public static final SubLObject local_transcript() {
    return $local_transcript$.getGlobalValue();
  }

  /** Clear local-operation-storage-queue and set *local-transcript* to a new file. */
  @SubL(source = "cycl/transcript-utilities.lisp", position = 6760) 
  public static final SubLObject new_local_transcript() {
    operation_queues.clear_local_operation_storage_queue();
    return new_local_transcript_int();
  }

  /** Set *local-transcript* to a new file. */
  @SubL(source = "cycl/transcript-utilities.lisp", position = 6958) 
  public static final SubLObject new_local_transcript_int() {
    if (((NIL != $local_transcript$.getGlobalValue())
         && (NIL != Filesys.probe_file($local_transcript$.getGlobalValue())))) {
      Errors
			.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 6062");
      Errors
			.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 6055");
    }
    $local_transcript$.setGlobalValue(construct_transcript_filename(make_local_transcript_filename(local_transcript_version())));
    return $local_transcript$.getGlobalValue();
  }

  /** transcript file from which ops are currenlty being read. */
  @SubL(source = "cycl/transcript-utilities.lisp", position = 7374) 
  public static SubLSymbol $read_transcript$ = null;

  @SubL(source = "cycl/transcript-utilities.lisp", position = 7568) 
  public static final SubLObject set_read_transcript(SubLObject filename) {
    $read_transcript$.setGlobalValue(filename);
    return $read_transcript$.getGlobalValue();
  }

  /** The master transcript file, containing operations from all communicating Cyc images. */
  @SubL(source = "cycl/transcript-utilities.lisp", position = 7680) 
  public static SubLSymbol $master_transcript$ = null;

  /** Accessor for *master-transcript*. */
  @SubL(source = "cycl/transcript-utilities.lisp", position = 7806) 
  public static final SubLObject master_transcript() {
    return $master_transcript$.getGlobalValue();
  }

  @SubL(source = "cycl/transcript-utilities.lisp", position = 7908) 
  public static final SubLObject set_master_transcript(SubLObject name) {
    if ((name == UNPROVIDED)) {
      name = make_master_transcript_filename(UNPROVIDED);
    }
    if ((NIL == transcript_server.use_transcript_server())) {
      $master_transcript$.setGlobalValue(construct_transcript_filename(name));
    }
    return $master_transcript$.getGlobalValue();
  }

  /** A hl-transcript containing operations from an individual Cyc image */
  @SubL(source = "cycl/transcript-utilities.lisp", position = 8405) 
  public static SubLSymbol $local_hl_transcript$ = null;

  @SubL(source = "cycl/transcript-utilities.lisp", position = 10982) 
  public static final SubLObject make_master_transcript_filename(SubLObject version) {
    if ((version == UNPROVIDED)) {
      version = control_vars.kb_loaded();
    }
    {
      SubLObject filename = PrintLow.format(NIL, $str18$cyc_kb__a, version);
      return filename;
    }
  }

  /** Produces the base of a transcript filename based on
   the cyc-image-id and a version number */
  @SubL(source = "cycl/transcript-utilities.lisp", position = 11293) 
  public static final SubLObject make_local_transcript_filename(SubLObject version_number) {
    if ((NIL == control_vars.cyc_image_id())) {
      control_vars.set_cyc_image_id();
    }
    {
      SubLObject filename = PrintLow.format(NIL, $str19$_a_local__a, control_vars.cyc_image_id(), version_number);
      return filename;
    }
  }

  /** Adds on the directory and suffix to a transcript filename */
  @SubL(source = "cycl/transcript-utilities.lisp", position = 11927) 
  public static final SubLObject construct_transcript_filename(SubLObject name) {
    {
      SubLObject filename = Sequences.cconcatenate(transcript_directory(), new SubLObject[] {name, $str21$_, transcript_suffix()});
      return filename;
    }
  }

  /** Returns a relative pathname to the current transcript directory, creating it if necessary. */
  @SubL(source = "cycl/transcript-utilities.lisp", position = 12151) 
  public static final SubLObject transcript_directory() {
    return transcript_directory_int(control_vars.kb_loaded());
  }

  @SubL(source = "cycl/transcript-utilities.lisp", position = 12525) 
  public static final SubLObject transcript_directory_int(SubLObject kb_number) {
    {
      SubLObject directory = file_utilities.cyc_home_subdirectory(list($str22$transcripts, PrintLow.format(NIL, $str23$_4__0D, kb_number)));
      if ((NIL == Filesys.directory_p(directory))) {
        file_utilities.make_directory_recursive(directory, T, UNPROVIDED);
      }
      return directory;
    }
  }

  @SubL(source = "cycl/transcript-utilities.lisp", position = 13463) 
  public static SubLSymbol $count_ops_table$ = null;

  @SubL(source = "cycl/transcript-utilities.lisp", position = 25884) 
  private static SubLSymbol $transcript_rename_hash$ = null;

  @SubL(source = "cycl/transcript-utilities.lisp", position = 26596) 
  private static SubLSymbol $transcript_create_hash$ = null;

  public static final SubLObject declare_transcript_utilities_file() {
    //declareFunction(myName, "transcript_eval", "TRANSCRIPT-EVAL", 1, 1, false);
    //declareFunction(myName, "transcript_form", "TRANSCRIPT-FORM", 1, 1, false);
    //declareFunction(myName, "transcript_form_int", "TRANSCRIPT-FORM-INT", 3, 0, false);
    //declareFunction(myName, "form_to_transcript_form", "FORM-TO-TRANSCRIPT-FORM", 1, 0, false);
    declareFunction(myName, "initialize_transcript_handling", "INITIALIZE-TRANSCRIPT-HANDLING", 0, 0, false);
    declareFunction(myName, "transcript_suffix", "TRANSCRIPT-SUFFIX", 0, 0, false);
    //declareFunction(myName, "master_transcript_already_exists", "MASTER-TRANSCRIPT-ALREADY-EXISTS", 0, 0, false);
    declareFunction(myName, "set_master_transcript_already_exists", "SET-MASTER-TRANSCRIPT-ALREADY-EXISTS", 1, 0, false);
    declareFunction(myName, "local_transcript_version", "LOCAL-TRANSCRIPT-VERSION", 0, 0, false);
    //declareFunction(myName, "inc_local_transcript_version", "INC-LOCAL-TRANSCRIPT-VERSION", 0, 0, false);
    //declareFunction(myName, "local_transcript_history", "LOCAL-TRANSCRIPT-HISTORY", 0, 0, false);
    //declareFunction(myName, "local_transcript_history_add", "LOCAL-TRANSCRIPT-HISTORY-ADD", 1, 0, false);
    //declareFunction(myName, "local_hl_transcript_version", "LOCAL-HL-TRANSCRIPT-VERSION", 0, 0, false);
    //declareFunction(myName, "inc_local_hl_transcript_version", "INC-LOCAL-HL-TRANSCRIPT-VERSION", 0, 0, false);
    //declareFunction(myName, "local_hl_transcript_history", "LOCAL-HL-TRANSCRIPT-HISTORY", 0, 0, false);
    //declareFunction(myName, "local_hl_transcript_history_add", "LOCAL-HL-TRANSCRIPT-HISTORY-ADD", 1, 0, false);
    //declareFunction(myName, "read_transcript_position", "READ-TRANSCRIPT-POSITION", 0, 0, false);
    //declareFunction(myName, "set_read_transcript_position", "SET-READ-TRANSCRIPT-POSITION", 1, 0, false);
    //declareFunction(myName, "approx_chars_per_op", "APPROX-CHARS-PER-OP", 0, 0, false);
    //declareFunction(myName, "set_approx_chars_per_op", "SET-APPROX-CHARS-PER-OP", 1, 0, false);
    declareFunction(myName, "local_transcript", "LOCAL-TRANSCRIPT", 0, 0, false);
    //declareFunction(myName, "mark_local_transcript", "MARK-LOCAL-TRANSCRIPT", 1, 0, false);
    //declareFunction(myName, "roll_local_transcript", "ROLL-LOCAL-TRANSCRIPT", 0, 0, false);
    declareFunction(myName, "new_local_transcript", "NEW-LOCAL-TRANSCRIPT", 0, 0, false);
    declareFunction(myName, "new_local_transcript_int", "NEW-LOCAL-TRANSCRIPT-INT", 0, 0, false);
    //declareFunction(myName, "read_transcript", "READ-TRANSCRIPT", 0, 0, false);
    declareFunction(myName, "set_read_transcript", "SET-READ-TRANSCRIPT", 1, 0, false);
    declareFunction(myName, "master_transcript", "MASTER-TRANSCRIPT", 0, 0, false);
    declareFunction(myName, "set_master_transcript", "SET-MASTER-TRANSCRIPT", 0, 1, false);
    //declareFunction(myName, "get_all_transcripts_image", "GET-ALL-TRANSCRIPTS-IMAGE", 0, 0, false);
    //declareFunction(myName, "local_hl_transcript", "LOCAL-HL-TRANSCRIPT", 0, 0, false);
    //declareFunction(myName, "mark_local_hl_transcript", "MARK-LOCAL-HL-TRANSCRIPT", 1, 0, false);
    //declareFunction(myName, "roll_local_hl_transcript", "ROLL-LOCAL-HL-TRANSCRIPT", 0, 0, false);
    //declareFunction(myName, "new_local_hl_transcript", "NEW-LOCAL-HL-TRANSCRIPT", 0, 0, false);
    //declareFunction(myName, "new_local_hl_transcript_int", "NEW-LOCAL-HL-TRANSCRIPT-INT", 0, 0, false);
    declareFunction(myName, "make_master_transcript_filename", "MAKE-MASTER-TRANSCRIPT-FILENAME", 0, 1, false);
    declareFunction(myName, "make_local_transcript_filename", "MAKE-LOCAL-TRANSCRIPT-FILENAME", 1, 0, false);
    //declareFunction(myName, "make_local_hl_transcript_filename", "MAKE-LOCAL-HL-TRANSCRIPT-FILENAME", 1, 0, false);
    declareFunction(myName, "construct_transcript_filename", "CONSTRUCT-TRANSCRIPT-FILENAME", 1, 0, false);
    declareFunction(myName, "transcript_directory", "TRANSCRIPT-DIRECTORY", 0, 0, false);
    //declareFunction(myName, "next_transcript_directory", "NEXT-TRANSCRIPT-DIRECTORY", 0, 0, false);
    declareFunction(myName, "transcript_directory_int", "TRANSCRIPT-DIRECTORY-INT", 1, 0, false);
    //declareFunction(myName, "mark_transcript_filename", "MARK-TRANSCRIPT-FILENAME", 2, 0, false);
    //declareFunction(myName, "get_count_ops_data", "GET-COUNT-OPS-DATA", 1, 0, false);
    //declareFunction(myName, "get_current_op_count", "GET-CURRENT-OP-COUNT", 1, 0, false);
    //declareFunction(myName, "get_current_position", "GET-CURRENT-POSITION", 1, 0, false);
    //declareFunction(myName, "update_count_ops_data", "UPDATE-COUNT-OPS-DATA", 3, 0, false);
    //declareFunction(myName, "really_count_ops", "REALLY-COUNT-OPS", 1, 0, false);
    //declareFunction(myName, "count_operations", "COUNT-OPERATIONS", 1, 0, false);
    //declareFunction(myName, "estimate_number_of_ops", "ESTIMATE-NUMBER-OF-OPS", 1, 0, false);
    //declareFunction(myName, "collect_ops_in_range", "COLLECT-OPS-IN-RANGE", 2, 2, false);
    //declareFunction(myName, "bp_count_ops", "BP-COUNT-OPS", 1, 0, false);
    //declareFunction(myName, "constant_modifications_in_transcript", "CONSTANT-MODIFICATIONS-IN-TRANSCRIPT", 1, 0, false);
    //declareFunction(myName, "report_constant_modifications_in_transcript", "REPORT-CONSTANT-MODIFICATIONS-IN-TRANSCRIPT", 0, 2, false);
    //declareFunction(myName, "report_constant_modifications_in_transcript_to_file", "REPORT-CONSTANT-MODIFICATIONS-IN-TRANSCRIPT-TO-FILE", 1, 1, false);
    //declareFunction(myName, "encapsulated_cyclist_string", "ENCAPSULATED-CYCLIST-STRING", 1, 0, false);
    //declareFunction(myName, "reset_transcript_rename_hash", "RESET-TRANSCRIPT-RENAME-HASH", 0, 0, false);
    //declareFunction(myName, "sort_transcript_renames", "SORT-TRANSCRIPT-RENAMES", 0, 0, false);
    //declareFunction(myName, "add_transcript_rename_info", "ADD-TRANSCRIPT-RENAME-INFO", 6, 0, false);
    //declareFunction(myName, "rem_transcript_rename_info", "REM-TRANSCRIPT-RENAME-INFO", 1, 0, false);
    //declareFunction(myName, "reset_transcript_create_hash", "RESET-TRANSCRIPT-CREATE-HASH", 0, 0, false);
    //declareFunction(myName, "sort_transcript_creates", "SORT-TRANSCRIPT-CREATES", 0, 0, false);
    //declareFunction(myName, "add_transcript_create_info", "ADD-TRANSCRIPT-CREATE-INFO", 5, 0, false);
    //declareFunction(myName, "constant_created_in_transcript", "CONSTANT-CREATED-IN-TRANSCRIPT", 1, 0, false);
    //declareFunction(myName, "rem_transcript_create_info", "REM-TRANSCRIPT-CREATE-INFO", 1, 0, false);
    //declareFunction(myName, "write_specific_transcript_file_as_ke_text", "WRITE-SPECIFIC-TRANSCRIPT-FILE-AS-KE-TEXT", 2, 0, false);
    //declareFunction(myName, "transcript_file_to_ke_text", "TRANSCRIPT-FILE-TO-KE-TEXT", 1, 0, false);
    //declareFunction(myName, "unencapsulate_to_string", "UNENCAPSULATE-TO-STRING", 1, 1, false);
    //declareFunction(myName, "unencapsulate_string", "UNENCAPSULATE-STRING", 1, 0, false);
    return NIL;
  }

  public static final SubLObject init_transcript_utilities_file() {
    $transcript_suffix$ = defparameter("*TRANSCRIPT-SUFFIX*", $str2$ts);
    $master_transcript_already_exists$ = defparameter("*MASTER-TRANSCRIPT-ALREADY-EXISTS*", NIL);
    $local_transcript_version$ = deflexical("*LOCAL-TRANSCRIPT-VERSION*", maybeDefault( $sym3$_LOCAL_TRANSCRIPT_VERSION_, $local_transcript_version$, ()-> (ZERO_INTEGER)));
    $local_transcript_history$ = deflexical("*LOCAL-TRANSCRIPT-HISTORY*", maybeDefault( $sym4$_LOCAL_TRANSCRIPT_HISTORY_, $local_transcript_history$, NIL));
    $local_hl_transcript_version$ = deflexical("*LOCAL-HL-TRANSCRIPT-VERSION*", maybeDefault( $sym5$_LOCAL_HL_TRANSCRIPT_VERSION_, $local_hl_transcript_version$, ()-> (ZERO_INTEGER)));
    $local_hl_transcript_history$ = deflexical("*LOCAL-HL-TRANSCRIPT-HISTORY*", maybeDefault( $sym6$_LOCAL_HL_TRANSCRIPT_HISTORY_, $local_hl_transcript_history$, NIL));
    $read_transcript_position$ = deflexical("*READ-TRANSCRIPT-POSITION*", maybeDefault( $sym7$_READ_TRANSCRIPT_POSITION_, $read_transcript_position$, ()-> (ZERO_INTEGER)));
    $approx_chars_per_op$ = defparameter("*APPROX-CHARS-PER-OP*", $int8$206);
    $local_transcript$ = deflexical("*LOCAL-TRANSCRIPT*", maybeDefault( $sym9$_LOCAL_TRANSCRIPT_, $local_transcript$, NIL));
    $read_transcript$ = deflexical("*READ-TRANSCRIPT*", maybeDefault( $sym15$_READ_TRANSCRIPT_, $read_transcript$, NIL));
    $master_transcript$ = deflexical("*MASTER-TRANSCRIPT*", maybeDefault( $sym16$_MASTER_TRANSCRIPT_, $master_transcript$, NIL));
    $local_hl_transcript$ = deflexical("*LOCAL-HL-TRANSCRIPT*", maybeDefault( $sym17$_LOCAL_HL_TRANSCRIPT_, $local_hl_transcript$, NIL));
    $count_ops_table$ = deflexical("*COUNT-OPS-TABLE*", maybeDefault( $sym28$_COUNT_OPS_TABLE_, $count_ops_table$, NIL));
    $transcript_rename_hash$ = deflexical("*TRANSCRIPT-RENAME-HASH*", maybeDefault( $sym59$_TRANSCRIPT_RENAME_HASH_, $transcript_rename_hash$, NIL));
    $transcript_create_hash$ = deflexical("*TRANSCRIPT-CREATE-HASH*", maybeDefault( $sym63$_TRANSCRIPT_CREATE_HASH_, $transcript_create_hash$, NIL));
    return NIL;
  }

  public static final SubLObject setup_transcript_utilities_file() {
        subl_macro_promotions.declare_defglobal($sym3$_LOCAL_TRANSCRIPT_VERSION_);
    subl_macro_promotions.declare_defglobal($sym4$_LOCAL_TRANSCRIPT_HISTORY_);
    subl_macro_promotions.declare_defglobal($sym5$_LOCAL_HL_TRANSCRIPT_VERSION_);
    subl_macro_promotions.declare_defglobal($sym6$_LOCAL_HL_TRANSCRIPT_HISTORY_);
    subl_macro_promotions.declare_defglobal($sym7$_READ_TRANSCRIPT_POSITION_);
    subl_macro_promotions.declare_defglobal($sym9$_LOCAL_TRANSCRIPT_);
    subl_macro_promotions.declare_defglobal($sym15$_READ_TRANSCRIPT_);
    subl_macro_promotions.declare_defglobal($sym16$_MASTER_TRANSCRIPT_);
    subl_macro_promotions.declare_defglobal($sym17$_LOCAL_HL_TRANSCRIPT_);
    subl_macro_promotions.declare_defglobal($sym28$_COUNT_OPS_TABLE_);
    subl_macro_promotions.declare_defglobal($sym59$_TRANSCRIPT_RENAME_HASH_);
    subl_macro_promotions.declare_defglobal($sym63$_TRANSCRIPT_CREATE_HASH_);
    utilities_macros.register_cyc_api_function($sym66$WRITE_SPECIFIC_TRANSCRIPT_FILE_AS_KE_TEXT, $list67, $str68$Generate_a_KE_Text_file_from_a_tr, $list69, NIL);
    return NIL;
  }

  //// Internal Constants

  public static final SubLSymbol $kw0$IGNORE_ERRORS_TARGET = makeKeyword("IGNORE-ERRORS-TARGET");
  public static final SubLSymbol $sym1$IGNORE_ERRORS_HANDLER = makeSymbol("IGNORE-ERRORS-HANDLER", "SUBLISP");
  public static final SubLString $str2$ts = makeString("ts");
  public static final SubLSymbol $sym3$_LOCAL_TRANSCRIPT_VERSION_ = makeSymbol("*LOCAL-TRANSCRIPT-VERSION*");
  public static final SubLSymbol $sym4$_LOCAL_TRANSCRIPT_HISTORY_ = makeSymbol("*LOCAL-TRANSCRIPT-HISTORY*");
  public static final SubLSymbol $sym5$_LOCAL_HL_TRANSCRIPT_VERSION_ = makeSymbol("*LOCAL-HL-TRANSCRIPT-VERSION*");
  public static final SubLSymbol $sym6$_LOCAL_HL_TRANSCRIPT_HISTORY_ = makeSymbol("*LOCAL-HL-TRANSCRIPT-HISTORY*");
  public static final SubLSymbol $sym7$_READ_TRANSCRIPT_POSITION_ = makeSymbol("*READ-TRANSCRIPT-POSITION*");
  public static final SubLInteger $int8$206 = makeInteger(206);
  public static final SubLSymbol $sym9$_LOCAL_TRANSCRIPT_ = makeSymbol("*LOCAL-TRANSCRIPT*");
  public static final SubLString $str10$ROLLED = makeString("ROLLED");
  public static final SubLSymbol $kw11$APPEND = makeKeyword("APPEND");
  public static final SubLSymbol $kw12$OUTPUT = makeKeyword("OUTPUT");
  public static final SubLString $str13$Unable_to_open__S = makeString("Unable to open ~S");
  public static final SubLString $str14$_s__ = makeString("~s~%");
  public static final SubLSymbol $sym15$_READ_TRANSCRIPT_ = makeSymbol("*READ-TRANSCRIPT*");
  public static final SubLSymbol $sym16$_MASTER_TRANSCRIPT_ = makeSymbol("*MASTER-TRANSCRIPT*");
  public static final SubLSymbol $sym17$_LOCAL_HL_TRANSCRIPT_ = makeSymbol("*LOCAL-HL-TRANSCRIPT*");
  public static final SubLString $str18$cyc_kb__a = makeString("cyc-kb-~a");
  public static final SubLString $str19$_a_local__a = makeString("~a-local-~a");
  public static final SubLString $str20$_a_local_hl__a = makeString("~a-local-hl-~a");
  public static final SubLString $str21$_ = makeString(".");
  public static final SubLString $str22$transcripts = makeString("transcripts");
  public static final SubLString $str23$_4__0D = makeString("~4,'0D");
  public static final SubLSymbol $sym24$STRINGP = makeSymbol("STRINGP");
  public static final SubLString $str25$_TS = makeString(".TS");
  public static final SubLString $str26$_ = makeString("-");
  public static final SubLString $str27$_ts = makeString(".ts");
  public static final SubLSymbol $sym28$_COUNT_OPS_TABLE_ = makeSymbol("*COUNT-OPS-TABLE*");
  public static final SubLSymbol $sym29$CAR = makeSymbol("CAR");
  public static final SubLSymbol $kw30$INPUT = makeKeyword("INPUT");
  public static final SubLSymbol $kw31$EOF = makeKeyword("EOF");
  public static final SubLInteger $int32$100000 = makeInteger(100000);
  public static final SubLString $str33$_____s = makeString("~%~%~s");
  public static final SubLString $str34$_s_is_not_a_stream_or_pathname_st = makeString("~s is not a stream or pathname string");
  public static final SubLString $str35$__The_file__s_does_not_exist__or_ = makeString("~%The file ~s does not exist, or contains no operations.");
  public static final SubLString $str36$___s_is_not_a_pathname_string__or = makeString("~%~s is not a pathname string, or the file does not exist.");
  public static final SubLSymbol $sym37$CATCH_ERROR_MESSAGE_HANDLER = makeSymbol("CATCH-ERROR-MESSAGE-HANDLER");
  public static final SubLString $str38$Examining__A = makeString("Examining ~A");
  public static final SubLList $list39 = list(makeSymbol("ENCAPSULATED-CYCLIST"), makeSymbol("CYC-IMAGE-ID"), makeSymbol("WHEN"), cons(makeSymbol("FUNCTION"), makeSymbol("ARGS")));
  public static final SubLSymbol $sym40$FI_CREATE = makeSymbol("FI-CREATE");
  public static final SubLList $list41 = list(makeSymbol("NAME"), makeSymbol("EXTERNAL-ID"));
  public static final SubLSymbol $sym42$FI_RENAME = makeSymbol("FI-RENAME");
  public static final SubLList $list43 = list(makeSymbol("TERM"), makeSymbol("NEW-NAME"));
  public static final SubLSymbol $sym44$FI_KILL = makeSymbol("FI-KILL");
  public static final SubLList $list45 = list(makeSymbol("TERM"));
  public static final SubLString $str46$____Transcript____S = makeString(";;; Transcript:  ~S");
  public static final SubLString $str47$______Examined______A = makeString("~%;;; Examined:    ~A");
  public static final SubLString $str48$______Total_Ops_____S = makeString("~%;;; Total Ops:   ~S");
  public static final SubLString $str49$______error_during_transcript_ana = makeString("~%;;; error during transcript analysis: At operation: ~S");
  public static final SubLString $str50$___A = makeString("~%~A");
  public static final SubLList $list51 = list(makeSymbol("TRANSCRIPT-CREATE-LIST"), makeSymbol("TRANSCRIPT-RENAME-LIST"), makeSymbol("TRANSCRIPT-KILL-LIST"));
  public static final SubLString $str52$_______S_KILLED = makeString("~%;;; ~S KILLED");
  public static final SubLList $list53 = list(makeSymbol("OP-NUM"), makeSymbol("EXTERNAL-ID"), makeSymbol("NAME"), makeSymbol("WHO"), makeSymbol("WHEN"));
  public static final SubLString $str54$__EXTERNAL_ID__S____A_by__A_at__A = makeString("~%EXTERNAL-ID ~S : ~A by ~A at ~A");
  public static final SubLString $str55$_______S_RENAMED = makeString("~%;;; ~S RENAMED");
  public static final SubLList $list56 = list(makeSymbol("OP-NUM"), makeSymbol("EXTERNAL-ID"), makeSymbol("OLD-NAME"), makeSymbol("NEW-NAME"), makeSymbol("WHO"), makeSymbol("WHEN"));
  public static final SubLString $str57$__EXTERNAL_ID__S____A_to__A_by__A = makeString("~%EXTERNAL-ID ~S : ~A to ~A by ~A at ~A");
  public static final SubLString $str58$_______S_CREATED = makeString("~%;;; ~S CREATED");
  public static final SubLSymbol $sym59$_TRANSCRIPT_RENAME_HASH_ = makeSymbol("*TRANSCRIPT-RENAME-HASH*");
  public static final SubLInteger $int60$100 = makeInteger(100);
  public static final SubLSymbol $sym61$_ = makeSymbol("<");
  public static final SubLSymbol $sym62$FIRST = makeSymbol("FIRST");
  public static final SubLSymbol $sym63$_TRANSCRIPT_CREATE_HASH_ = makeSymbol("*TRANSCRIPT-CREATE-HASH*");
  public static final SubLString $str64$transcript_file_not_found = makeString("transcript file not found");
  public static final SubLString $str65$_A__ = makeString("~A~%");
  public static final SubLSymbol $sym66$WRITE_SPECIFIC_TRANSCRIPT_FILE_AS_KE_TEXT = makeSymbol("WRITE-SPECIFIC-TRANSCRIPT-FILE-AS-KE-TEXT");
  public static final SubLList $list67 = list(makeSymbol("TRANSCRIPT-FILENAME"), makeSymbol("OUTPUT-FILENAME"));
  public static final SubLString $str68$Generate_a_KE_Text_file_from_a_tr = makeString("Generate a KE Text file from a transcript and write it to a file.");
  public static final SubLList $list69 = list(list(makeSymbol("TRANSCRIPT-FILENAME"), makeSymbol("STRINGP")), list(makeSymbol("OUTPUT-FILENAME"), makeSymbol("STRINGP")));
  public static final SubLSymbol $kw70$ENTER = makeKeyword("ENTER");
  public static final SubLSymbol $sym71$FI_FIND_OR_CREATE = makeSymbol("FI-FIND-OR-CREATE");
  public static final SubLString $str72$ = makeString("");
  public static final SubLString $str73$Constant__ = makeString("Constant: ");
  public static final SubLList $list74 = list(makeSymbol("OLD-NAME"), makeSymbol("NEW-NAME"));
  public static final SubLString $str75$Rename__ = makeString("Rename: ");
  public static final SubLString $str76$_ = makeString(" ");
  public static final SubLSymbol $sym77$FI_MERGE = makeSymbol("FI-MERGE");
  public static final SubLList $list78 = list(makeSymbol("KILL-FORT"), makeSymbol("KEEP-FORT"));
  public static final SubLString $str79$Merge__ = makeString("Merge: ");
  public static final SubLString $str80$Kill__ = makeString("Kill: ");
  public static final SubLSymbol $sym81$FI_ASSERT = makeSymbol("FI-ASSERT");
  public static final SubLSymbol $sym82$FI_REASSERT = makeSymbol("FI-REASSERT");
  public static final SubLSymbol $sym83$FI_UNASSERT = makeSymbol("FI-UNASSERT");
  public static final SubLSymbol $sym84$FI_BLAST = makeSymbol("FI-BLAST");
  public static final SubLString $str85$Enter_ = makeString("Enter.");
  public static final SubLString $str86$___The_following_assertion_simula = makeString(";; The following assertion simulates an fi-reassert. (two of these simulate a repropagate)");
  public static final SubLSymbol $kw87$DELETE = makeKeyword("DELETE");
  public static final SubLString $str88$Delete_ = makeString("Delete.");
  public static final SubLSymbol $kw89$BLAST = makeKeyword("BLAST");
  public static final SubLString $str90$Delete_____Simulate_an_fi_blast_ = makeString("Delete. ;; Simulate an fi-blast.");
  public static final SubLString $str91$In_Mt__ = makeString("In Mt: ");
  public static final SubLSymbol $kw92$UNKNOWN = makeKeyword("UNKNOWN");
  public static final SubLString $str93$Truth_Value___unknown_ = makeString("Truth Value: :unknown.");
  public static final SubLObject $const94$DefaultMonotonicPredicate = constant_handles.reader_make_constant_shell(makeString("DefaultMonotonicPredicate"));
  public static final SubLSymbol $kw95$DEFAULT = makeKeyword("DEFAULT");
  public static final SubLString $str96$Truth_Value___default_ = makeString("Truth Value: :default.");
  public static final SubLSymbol $kw97$MONOTONIC = makeKeyword("MONOTONIC");
  public static final SubLString $str98$Truth_Value___monotonic_ = makeString("Truth Value: :monotonic.");
  public static final SubLSymbol $kw99$FORWARD = makeKeyword("FORWARD");
  public static final SubLString $str100$Direction___forward_ = makeString("Direction: :forward.");
  public static final SubLSymbol $kw101$BACKWARD = makeKeyword("BACKWARD");
  public static final SubLString $str102$Direction___backward_ = makeString("Direction: :backward.");
  public static final SubLSymbol $kw103$CODE = makeKeyword("CODE");
  public static final SubLString $str104$Direction___code_ = makeString("Direction: :code.");
  public static final SubLString $str105$_A___A_ = makeString("~A: ~A.");
  public static final SubLString $str106$f___A_ = makeString("f: ~A.");
  public static final SubLSymbol $sym107$FI_TIMESTAMP_ASSERTION = makeSymbol("FI-TIMESTAMP-ASSERTION");
  public static final SubLSymbol $sym108$FI_TIMESTAMP_CONSTANT = makeSymbol("FI-TIMESTAMP-CONSTANT");
  public static final SubLSymbol $sym109$FI_CREATE_SKOLEM = makeSymbol("FI-CREATE-SKOLEM");
  public static final SubLString $str110$___This_skolem_creation_should_be = makeString(";; This skolem creation should be implicit in the following assertion and can safely be deleted.");
  public static final SubLString $str111$____A = makeString(";; ~A");
  public static final SubLString $str112$___Don_t_know_how_convert_next_li = makeString(";; Don't know how convert next line");
  public static final SubLString $str113$Internal_Error___A = makeString("Internal Error: ~A");
  public static final SubLString $str114$_ = makeString(":");
  public static final SubLString $str115$_ = makeString("'");
  public static final SubLSymbol $kw116$HP = makeKeyword("HP");
  public static final SubLSymbol $kw117$NAT = makeKeyword("NAT");
  public static final SubLString $str118$_ = makeString("(");
  public static final SubLString $str119$___ = makeString(" . ");
  public static final SubLString $str120$_ = makeString(")");
  public static final SubLSymbol $sym121$CCONCATENATE = makeSymbol("CCONCATENATE");
  public static final SubLString $str122$_ = makeString("\"");
  public static final SubLString $str123$__ = makeString("\\\"");
  public static final SubLString $str124$___ = makeString("\\\\\"");

  //// Initializers

  public void declareFunctions() {
    declare_transcript_utilities_file();
  }

  public void initializeVariables() {
    init_transcript_utilities_file();
  }

  public void runTopLevelForms() {
    setup_transcript_utilities_file();
  }

}
