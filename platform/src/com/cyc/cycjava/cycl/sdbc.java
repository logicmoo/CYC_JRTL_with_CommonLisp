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

package  com.cyc.cycjava.cycl;

import java.util.Iterator;
import java.util.Map.Entry;
import java.util.ArrayList;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.*;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.*;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.*;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.*;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.*;
import com.cyc.tool.subl.util.*;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeBoolean;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeInteger;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeDouble;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeChar;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeString;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeSymbol;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeKeyword;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeUninternedSymbol;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeGuid;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.cons;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.listS;
import static com.cyc.tool.subl.util.SubLFiles.defconstant;
import static com.cyc.tool.subl.util.SubLFiles.deflexical;
import static com.cyc.tool.subl.util.SubLFiles.defparameter;
import static com.cyc.tool.subl.util.SubLFiles.defvar;
import static com.cyc.tool.subl.util.SubLFiles.declareFunction;
import static com.cyc.tool.subl.util.SubLFiles.declareMacro;


import com.cyc.cycjava.cycl.access_macros;
import com.cyc.cycjava.cycl.cfasl;
import com.cyc.cycjava.cycl.constant_handles;
import com.cyc.cycjava.cycl.format_nil;
import com.cyc.cycjava.cycl.list_utilities;
import com.cyc.cycjava.cycl.meta_macros;
import com.cyc.cycjava.cycl.number_utilities;
import com.cyc.cycjava.cycl.queues;
import com.cyc.cycjava.cycl.red_infrastructure_macros;
import com.cyc.cycjava.cycl.string_utilities;
import com.cyc.cycjava.cycl.subl_macro_promotions;
import com.cyc.cycjava.cycl.subl_macros;
import com.cyc.cycjava.cycl.subl_promotions;
import com.cyc.cycjava.cycl.utilities_macros;
import com.cyc.cycjava.cycl.vector_utilities;

public  final class sdbc extends SubLTranslatedFile {

  //// Constructor

  private sdbc() {}
  public static final SubLFile me = new sdbc();
  public static final String myName = "com.cyc.cycjava.cycl.sdbc";

  //// Definitions

  /** the DBMS server machine */
  @SubL(source = "cycl/sdbc.lisp", position = 13256) 
  public static SubLSymbol $dbms_server$ = null;

  /** the Java proxy server machine */
  @SubL(source = "cycl/sdbc.lisp", position = 13440) 
  public static SubLSymbol $sdbc_proxy_server$ = null;

  /** the database server port */
  @SubL(source = "cycl/sdbc.lisp", position = 13577) 
  public static SubLSymbol $sql_port$ = null;

  @SubL(source = "cycl/sdbc.lisp", position = 13709) 
  public static SubLSymbol $sql_protocol$ = null;

  @SubL(source = "cycl/sdbc.lisp", position = 13757) 
  public static SubLSymbol $sql_subprotocol$ = null;

  @SubL(source = "cycl/sdbc.lisp", position = 13811) 
  public static SubLSymbol $sql_connection_timeout$ = null;

  @SubL(source = "cycl/sdbc.lisp", position = 13861) 
  public static SubLSymbol $connection_id$ = null;

  /** The maximum number of rows that will reside locally in a result set at a given time */
  @SubL(source = "cycl/sdbc.lisp", position = 13913) 
  private static SubLSymbol $result_set_block_size$ = null;

  @SubL(source = "cycl/sdbc.lisp", position = 14054) 
  private static SubLSymbol $quit$ = null;

  @SubL(source = "cycl/sdbc.lisp", position = 14435) 
  private static SubLSymbol $execute_update$ = null;

  @SubL(source = "cycl/sdbc.lisp", position = 14475) 
  private static SubLSymbol $execute_query$ = null;

  @SubL(source = "cycl/sdbc.lisp", position = 14514) 
  private static SubLSymbol $prepare_statement$ = null;

  @SubL(source = "cycl/sdbc.lisp", position = 14557) 
  private static SubLSymbol $create_statement$ = null;

  @SubL(source = "cycl/sdbc.lisp", position = 14599) 
  private static SubLSymbol $set_bytes$ = null;

  @SubL(source = "cycl/sdbc.lisp", position = 14634) 
  private static SubLSymbol $ps_execute_update$ = null;

  @SubL(source = "cycl/sdbc.lisp", position = 14677) 
  private static SubLSymbol $ps_execute_query$ = null;

  @SubL(source = "cycl/sdbc.lisp", position = 14720) 
  private static SubLSymbol $set_int$ = null;

  @SubL(source = "cycl/sdbc.lisp", position = 14753) 
  private static SubLSymbol $close_statement$ = null;

  @SubL(source = "cycl/sdbc.lisp", position = 14794) 
  private static SubLSymbol $new_connection$ = null;

  @SubL(source = "cycl/sdbc.lisp", position = 14835) 
  private static SubLSymbol $set_string$ = null;

  @SubL(source = "cycl/sdbc.lisp", position = 14872) 
  private static SubLSymbol $set_long$ = null;

  @SubL(source = "cycl/sdbc.lisp", position = 14907) 
  private static SubLSymbol $set_double$ = null;

  @SubL(source = "cycl/sdbc.lisp", position = 14944) 
  private static SubLSymbol $set_float$ = null;

  @SubL(source = "cycl/sdbc.lisp", position = 14980) 
  private static SubLSymbol $execute_batch$ = null;

  @SubL(source = "cycl/sdbc.lisp", position = 15020) 
  private static SubLSymbol $get_rows$ = null;

  @SubL(source = "cycl/sdbc.lisp", position = 15055) 
  private static SubLSymbol $close_result_set$ = null;

  @SubL(source = "cycl/sdbc.lisp", position = 15098) 
  private static SubLSymbol $execute_update_auto_keys$ = null;

  @SubL(source = "cycl/sdbc.lisp", position = 15149) 
  private static SubLSymbol $get_generated_keys$ = null;

  @SubL(source = "cycl/sdbc.lisp", position = 15194) 
  private static SubLSymbol $set_auto_commit$ = null;

  @SubL(source = "cycl/sdbc.lisp", position = 15236) 
  private static SubLSymbol $commit$ = null;

  @SubL(source = "cycl/sdbc.lisp", position = 15269) 
  private static SubLSymbol $rollback$ = null;

  @SubL(source = "cycl/sdbc.lisp", position = 15304) 
  private static SubLSymbol $get_transaction_isolation$ = null;

  @SubL(source = "cycl/sdbc.lisp", position = 15356) 
  private static SubLSymbol $set_transaction_isolation$ = null;

  @SubL(source = "cycl/sdbc.lisp", position = 15408) 
  private static SubLSymbol $get_auto_commit$ = null;

  @SubL(source = "cycl/sdbc.lisp", position = 15450) 
  private static SubLSymbol $get_tables$ = null;

  @SubL(source = "cycl/sdbc.lisp", position = 15487) 
  private static SubLSymbol $get_columns$ = null;

  @SubL(source = "cycl/sdbc.lisp", position = 15525) 
  private static SubLSymbol $get_primary_keys$ = null;

  @SubL(source = "cycl/sdbc.lisp", position = 15568) 
  private static SubLSymbol $get_imported_keys$ = null;

  @SubL(source = "cycl/sdbc.lisp", position = 15612) 
  private static SubLSymbol $get_exported_keys$ = null;

  @SubL(source = "cycl/sdbc.lisp", position = 15656) 
  private static SubLSymbol $get_index_info$ = null;

  @SubL(source = "cycl/sdbc.lisp", position = 15697) 
  private static SubLSymbol $cancel$ = null;

  @SubL(source = "cycl/sdbc.lisp", position = 15730) 
  private static SubLSymbol $get_max_connections$ = null;

  @SubL(source = "cycl/sdbc.lisp", position = 15776) 
  private static SubLSymbol $stop_response$ = null;

  @SubL(source = "cycl/sdbc.lisp", position = 15834) 
  private static SubLSymbol $integer_response$ = null;

  @SubL(source = "cycl/sdbc.lisp", position = 15876) 
  private static SubLSymbol $result_set_response$ = null;

  @SubL(source = "cycl/sdbc.lisp", position = 15921) 
  private static SubLSymbol $void_response$ = null;

  @SubL(source = "cycl/sdbc.lisp", position = 15960) 
  private static SubLSymbol $connection$ = null;

  @SubL(source = "cycl/sdbc.lisp", position = 15996) 
  private static SubLSymbol $update_counts$ = null;

  @SubL(source = "cycl/sdbc.lisp", position = 16035) 
  private static SubLSymbol $transaction_isolation_level$ = null;

  @SubL(source = "cycl/sdbc.lisp", position = 16088) 
  private static SubLSymbol $boolean$ = null;

  @SubL(source = "cycl/sdbc.lisp", position = 16121) 
  private static SubLSymbol $io_error$ = null;

  @SubL(source = "cycl/sdbc.lisp", position = 16156) 
  private static SubLSymbol $sql_error$ = null;

  @SubL(source = "cycl/sdbc.lisp", position = 16192) 
  private static SubLSymbol $unknown_error$ = null;

  @SubL(source = "cycl/sdbc.lisp", position = 16232) 
  private static SubLSymbol $client_error$ = null;

  @SubL(source = "cycl/sdbc.lisp", position = 16271) 
  private static SubLSymbol $commit_error$ = null;

  @SubL(source = "cycl/sdbc.lisp", position = 16310) 
  private static SubLSymbol $rollback_error$ = null;

  @SubL(source = "cycl/sdbc.lisp", position = 16351) 
  private static SubLSymbol $transaction_error$ = null;

  @SubL(source = "cycl/sdbc.lisp", position = 16395) 
  private static SubLSymbol $batch_update_error$ = null;

  public static final class $sql_connection_native extends SubLStructNative {
    public SubLStructDecl getStructDecl() { return structDecl; }
    public SubLObject getField2() { return $db; }
    public SubLObject getField3() { return $user; }
    public SubLObject getField4() { return $dbms_server; }
    public SubLObject getField5() { return $port; }
    public SubLObject getField6() { return $channel; }
    public SubLObject getField7() { return $statements; }
    public SubLObject getField8() { return $lock; }
    public SubLObject getField9() { return $subprotocol; }
    public SubLObject getField10() { return $proxy_server; }
    public SubLObject getField11() { return $error_handling; }
    public SubLObject getField12() { return $tickets; }
    public SubLObject getField13() { return $mailman; }
    public SubLObject setField2(SubLObject value) { return $db = value; }
    public SubLObject setField3(SubLObject value) { return $user = value; }
    public SubLObject setField4(SubLObject value) { return $dbms_server = value; }
    public SubLObject setField5(SubLObject value) { return $port = value; }
    public SubLObject setField6(SubLObject value) { return $channel = value; }
    public SubLObject setField7(SubLObject value) { return $statements = value; }
    public SubLObject setField8(SubLObject value) { return $lock = value; }
    public SubLObject setField9(SubLObject value) { return $subprotocol = value; }
    public SubLObject setField10(SubLObject value) { return $proxy_server = value; }
    public SubLObject setField11(SubLObject value) { return $error_handling = value; }
    public SubLObject setField12(SubLObject value) { return $tickets = value; }
    public SubLObject setField13(SubLObject value) { return $mailman = value; }
    public SubLObject $db = NIL;
    public SubLObject $user = NIL;
    public SubLObject $dbms_server = NIL;
    public SubLObject $port = NIL;
    public SubLObject $channel = NIL;
    public SubLObject $statements = NIL;
    public SubLObject $lock = NIL;
    public SubLObject $subprotocol = NIL;
    public SubLObject $proxy_server = NIL;
    public SubLObject $error_handling = NIL;
    public SubLObject $tickets = NIL;
    public SubLObject $mailman = NIL;
    private static final SubLStructDeclNative structDecl =
    Structures.makeStructDeclNative($sql_connection_native.class, $sym37$SQL_CONNECTION, $sym38$SQL_CONNECTION_P, $list39, $list40, new String[] {"$db", "$user", "$dbms_server", "$port", "$channel", "$statements", "$lock", "$subprotocol", "$proxy_server", "$error_handling", "$tickets", "$mailman"}, $list41, $list42, $sym43$SQLC_PRINT);
  }

  @SubL(source = "cycl/sdbc.lisp", position = 17418) 
  public static SubLSymbol $dtp_sql_connection$ = null;

  @SubL(source = "cycl/sdbc.lisp", position = 17418) 
  public static final SubLObject sql_connection_print_function_trampoline(SubLObject object, SubLObject stream) {
    Errors
			.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 12022");
    return NIL;
  }

  public static final class $sql_connection_p$UnaryFunction extends UnaryFunction {
    public $sql_connection_p$UnaryFunction() { super(extractFunctionNamed("SQL-CONNECTION-P")); }
    public SubLObject processItem(SubLObject arg1) { return Errors
			.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 11950"); }
  }

  public static final class $sql_ticket_native extends SubLStructNative {
    public SubLStructDecl getStructDecl() { return structDecl; }
    public SubLObject getField2() { return $semaphore; }
    public SubLObject getField3() { return $result; }
    public SubLObject setField2(SubLObject value) { return $semaphore = value; }
    public SubLObject setField3(SubLObject value) { return $result = value; }
    public SubLObject $semaphore = NIL;
    public SubLObject $result = NIL;
    private static final SubLStructDeclNative structDecl =
    Structures.makeStructDeclNative($sql_ticket_native.class, $sym100$SQL_TICKET, $sym101$SQL_TICKET_P, $list102, $list103, new String[] {"$semaphore", "$result"}, $list104, $list105, $sym106$DEFAULT_STRUCT_PRINT_FUNCTION);
  }

  @SubL(source = "cycl/sdbc.lisp", position = 26808) 
  public static SubLSymbol $dtp_sql_ticket$ = null;

  @SubL(source = "cycl/sdbc.lisp", position = 26808) 
  public static final SubLObject sql_ticket_print_function_trampoline(SubLObject object, SubLObject stream) {
    compatibility.default_struct_print_function(object, stream, ZERO_INTEGER);
    return NIL;
  }

  public static final class $sql_ticket_p$UnaryFunction extends UnaryFunction {
    public $sql_ticket_p$UnaryFunction() { super(extractFunctionNamed("SQL-TICKET-P")); }
    public SubLObject processItem(SubLObject arg1) { return Errors
			.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 11975"); }
  }

  public static final class $sdbc_error_native extends SubLStructNative {
    public SubLStructDecl getStructDecl() { return structDecl; }
    public SubLObject getField2() { return $type; }
    public SubLObject getField3() { return $message; }
    public SubLObject getField4() { return $code; }
    public SubLObject setField2(SubLObject value) { return $type = value; }
    public SubLObject setField3(SubLObject value) { return $message = value; }
    public SubLObject setField4(SubLObject value) { return $code = value; }
    public SubLObject $type = NIL;
    public SubLObject $message = NIL;
    public SubLObject $code = NIL;
    private static final SubLStructDeclNative structDecl =
    Structures.makeStructDeclNative($sdbc_error_native.class, $sym126$SDBC_ERROR, $sym127$SDBC_ERROR_P, $list128, $list129, new String[] {"$type", "$message", "$code"}, $list130, $list131, $sym132$SDBC_ERROR_PRINT);
  }

  @SubL(source = "cycl/sdbc.lisp", position = 34297) 
  public static SubLSymbol $dtp_sdbc_error$ = null;

  @SubL(source = "cycl/sdbc.lisp", position = 34297) 
  public static final SubLObject sdbc_error_print_function_trampoline(SubLObject object, SubLObject stream) {
    Errors
			.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 11943");
    return NIL;
  }

  public static final class $sdbc_error_p$UnaryFunction extends UnaryFunction {
    public $sdbc_error_p$UnaryFunction() { super(extractFunctionNamed("SDBC-ERROR-P")); }
    public SubLObject processItem(SubLObject arg1) { return Errors
			.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 11932"); }
  }

  @SubL(source = "cycl/sdbc.lisp", position = 37222) 
  private static SubLSymbol $sdbc_error_decoding$ = null;

  public static final class $sql_result_set_native extends SubLStructNative {
    public SubLStructDecl getStructDecl() { return structDecl; }
    public SubLObject getField2() { return $rows; }
    public SubLObject getField3() { return $current; }
    public SubLObject getField4() { return $last; }
    public SubLObject getField5() { return $start; }
    public SubLObject getField6() { return $connection; }
    public SubLObject getField7() { return $block_size; }
    public SubLObject getField8() { return $id; }
    public SubLObject setField2(SubLObject value) { return $rows = value; }
    public SubLObject setField3(SubLObject value) { return $current = value; }
    public SubLObject setField4(SubLObject value) { return $last = value; }
    public SubLObject setField5(SubLObject value) { return $start = value; }
    public SubLObject setField6(SubLObject value) { return $connection = value; }
    public SubLObject setField7(SubLObject value) { return $block_size = value; }
    public SubLObject setField8(SubLObject value) { return $id = value; }
    public SubLObject $rows = NIL;
    public SubLObject $current = NIL;
    public SubLObject $last = NIL;
    public SubLObject $start = NIL;
    public SubLObject $connection = NIL;
    public SubLObject $block_size = NIL;
    public SubLObject $id = NIL;
    private static final SubLStructDeclNative structDecl =
    Structures.makeStructDeclNative($sql_result_set_native.class, $sym155$SQL_RESULT_SET, $sym156$SQL_RESULT_SET_P, $list157, $list158, new String[] {"$rows", "$current", "$last", "$start", "$connection", "$block_size", "$id"}, $list159, $list160, $sym161$SQLRS_PRINT);
  }

  @SubL(source = "cycl/sdbc.lisp", position = 37974) 
  public static SubLSymbol $dtp_sql_result_set$ = null;

  @SubL(source = "cycl/sdbc.lisp", position = 37974) 
  public static final SubLObject sql_result_set_print_function_trampoline(SubLObject object, SubLObject stream) {
    Errors
			.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 12057");
    return NIL;
  }

  public static final class $sql_result_set_p$UnaryFunction extends UnaryFunction {
    public $sql_result_set_p$UnaryFunction() { super(extractFunctionNamed("SQL-RESULT-SET-P")); }
    public SubLObject processItem(SubLObject arg1) { return Errors
			.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 11957"); }
  }

  public static final class $sql_statement_native extends SubLStructNative {
    public SubLStructDecl getStructDecl() { return structDecl; }
    public SubLObject getField2() { return $connection; }
    public SubLObject getField3() { return $id; }
    public SubLObject getField4() { return $sql; }
    public SubLObject getField5() { return $settings; }
    public SubLObject getField6() { return $batch; }
    public SubLObject getField7() { return $rs; }
    public SubLObject setField2(SubLObject value) { return $connection = value; }
    public SubLObject setField3(SubLObject value) { return $id = value; }
    public SubLObject setField4(SubLObject value) { return $sql = value; }
    public SubLObject setField5(SubLObject value) { return $settings = value; }
    public SubLObject setField6(SubLObject value) { return $batch = value; }
    public SubLObject setField7(SubLObject value) { return $rs = value; }
    public SubLObject $connection = NIL;
    public SubLObject $id = NIL;
    public SubLObject $sql = NIL;
    public SubLObject $settings = NIL;
    public SubLObject $batch = NIL;
    public SubLObject $rs = NIL;
    private static final SubLStructDeclNative structDecl =
    Structures.makeStructDeclNative($sql_statement_native.class, $sym199$SQL_STATEMENT, $sym200$SQL_STATEMENT_P, $list201, $list202, new String[] {"$connection", "$id", "$sql", "$settings", "$batch", "$rs"}, $list203, $list204, $sym106$DEFAULT_STRUCT_PRINT_FUNCTION);
  }

  @SubL(source = "cycl/sdbc.lisp", position = 45800) 
  public static SubLSymbol $dtp_sql_statement$ = null;

  @SubL(source = "cycl/sdbc.lisp", position = 45800) 
  public static final SubLObject sql_statement_print_function_trampoline(SubLObject object, SubLObject stream) {
    compatibility.default_struct_print_function(object, stream, ZERO_INTEGER);
    return NIL;
  }

  public static final class $sql_statement_p$UnaryFunction extends UnaryFunction {
    public $sql_statement_p$UnaryFunction() { super(extractFunctionNamed("SQL-STATEMENT-P")); }
    public SubLObject processItem(SubLObject arg1) { return Errors
			.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 11974"); }
  }

  /** The number of rows created and validated in each separate sdbc test */
  @SubL(source = "cycl/sdbc.lisp", position = 81964) 
  private static SubLSymbol $sdbc_test_row_cardinality$ = null;

  public static final SubLObject declare_sdbc_file() {
    //declareFunction(myName, "sql_proxy_server_runningP", "SQL-PROXY-SERVER-RUNNING?", 0, 3, false);
    declareFunction(myName, "sql_connection_print_function_trampoline", "SQL-CONNECTION-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
    //declareFunction(myName, "sql_connection_p", "SQL-CONNECTION-P", 1, 0, false); new $sql_connection_p$UnaryFunction();
    //declareFunction(myName, "sqlc_db", "SQLC-DB", 1, 0, false);
    //declareFunction(myName, "sqlc_user", "SQLC-USER", 1, 0, false);
    //declareFunction(myName, "sqlc_dbms_server", "SQLC-DBMS-SERVER", 1, 0, false);
    //declareFunction(myName, "sqlc_port", "SQLC-PORT", 1, 0, false);
    //declareFunction(myName, "sqlc_channel", "SQLC-CHANNEL", 1, 0, false);
    //declareFunction(myName, "sqlc_statements", "SQLC-STATEMENTS", 1, 0, false);
    //declareFunction(myName, "sqlc_lock", "SQLC-LOCK", 1, 0, false);
    //declareFunction(myName, "sqlc_subprotocol", "SQLC-SUBPROTOCOL", 1, 0, false);
    //declareFunction(myName, "sqlc_proxy_server", "SQLC-PROXY-SERVER", 1, 0, false);
    //declareFunction(myName, "sqlc_error_handling", "SQLC-ERROR-HANDLING", 1, 0, false);
    //declareFunction(myName, "sqlc_tickets", "SQLC-TICKETS", 1, 0, false);
    //declareFunction(myName, "sqlc_mailman", "SQLC-MAILMAN", 1, 0, false);
    //declareFunction(myName, "_csetf_sqlc_db", "_CSETF-SQLC-DB", 2, 0, false);
    //declareFunction(myName, "_csetf_sqlc_user", "_CSETF-SQLC-USER", 2, 0, false);
    //declareFunction(myName, "_csetf_sqlc_dbms_server", "_CSETF-SQLC-DBMS-SERVER", 2, 0, false);
    //declareFunction(myName, "_csetf_sqlc_port", "_CSETF-SQLC-PORT", 2, 0, false);
    //declareFunction(myName, "_csetf_sqlc_channel", "_CSETF-SQLC-CHANNEL", 2, 0, false);
    //declareFunction(myName, "_csetf_sqlc_statements", "_CSETF-SQLC-STATEMENTS", 2, 0, false);
    //declareFunction(myName, "_csetf_sqlc_lock", "_CSETF-SQLC-LOCK", 2, 0, false);
    //declareFunction(myName, "_csetf_sqlc_subprotocol", "_CSETF-SQLC-SUBPROTOCOL", 2, 0, false);
    //declareFunction(myName, "_csetf_sqlc_proxy_server", "_CSETF-SQLC-PROXY-SERVER", 2, 0, false);
    //declareFunction(myName, "_csetf_sqlc_error_handling", "_CSETF-SQLC-ERROR-HANDLING", 2, 0, false);
    //declareFunction(myName, "_csetf_sqlc_tickets", "_CSETF-SQLC-TICKETS", 2, 0, false);
    //declareFunction(myName, "_csetf_sqlc_mailman", "_CSETF-SQLC-MAILMAN", 2, 0, false);
    //declareFunction(myName, "make_sql_connection", "MAKE-SQL-CONNECTION", 0, 1, false);
    //declareFunction(myName, "sqlc_print", "SQLC-PRINT", 3, 0, false);
    //declareFunction(myName, "sqlc_print_string", "SQLC-PRINT-STRING", 1, 0, false);
    //declareFunction(myName, "new_sql_connection", "NEW-SQL-CONNECTION", 3, 1, false);
    //declareFunction(myName, "sql_open_connection_p", "SQL-OPEN-CONNECTION-P", 1, 0, false);
    //declareFunction(myName, "sqlc_open_p", "SQLC-OPEN-P", 1, 0, false);
    //declareFunction(myName, "sqlc_close", "SQLC-CLOSE", 1, 0, false);
    //declareFunction(myName, "sqlc_create_statement", "SQLC-CREATE-STATEMENT", 1, 0, false);
    //declareFunction(myName, "sqlc_prepare_statement", "SQLC-PREPARE-STATEMENT", 2, 0, false);
    //declareFunction(myName, "sqlc_set_auto_commit", "SQLC-SET-AUTO-COMMIT", 2, 0, false);
    //declareFunction(myName, "sqlc_get_auto_commit", "SQLC-GET-AUTO-COMMIT", 1, 0, false);
    //declareFunction(myName, "sqlc_commit", "SQLC-COMMIT", 1, 0, false);
    //declareFunction(myName, "sqlc_rollback", "SQLC-ROLLBACK", 1, 0, false);
    //declareFunction(myName, "sqlc_get_transaction_isolation", "SQLC-GET-TRANSACTION-ISOLATION", 1, 0, false);
    //declareFunction(myName, "sqlc_set_transaction_isolation", "SQLC-SET-TRANSACTION-ISOLATION", 2, 0, false);
    declareFunction(myName, "sql_ticket_print_function_trampoline", "SQL-TICKET-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
    //declareFunction(myName, "sql_ticket_p", "SQL-TICKET-P", 1, 0, false); new $sql_ticket_p$UnaryFunction();
    //declareFunction(myName, "sql_ticket_semaphore", "SQL-TICKET-SEMAPHORE", 1, 0, false);
    //declareFunction(myName, "sql_ticket_result", "SQL-TICKET-RESULT", 1, 0, false);
    //declareFunction(myName, "_csetf_sql_ticket_semaphore", "_CSETF-SQL-TICKET-SEMAPHORE", 2, 0, false);
    //declareFunction(myName, "_csetf_sql_ticket_result", "_CSETF-SQL-TICKET-RESULT", 2, 0, false);
    //declareFunction(myName, "make_sql_ticket", "MAKE-SQL-TICKET", 0, 1, false);
    //declareFunction(myName, "new_sql_ticket", "NEW-SQL-TICKET", 0, 0, false);
    //declareFunction(myName, "sql_ticket_retrieve", "SQL-TICKET-RETRIEVE", 1, 0, false);
    //declareFunction(myName, "launch_sql_mailman", "LAUNCH-SQL-MAILMAN", 1, 0, false);
    //declareFunction(myName, "sqlc_deliver", "SQLC-DELIVER", 1, 0, false);
    //declareFunction(myName, "sqlc_execute", "SQLC-EXECUTE", 3, 0, false);
    //declareFunction(myName, "sqlc_send", "SQLC-SEND", 4, 0, false);
    //declareFunction(myName, "sqlc_receive", "SQLC-RECEIVE", 1, 0, false);
    //declareFunction(myName, "sqlc_handle_error", "SQLC-HANDLE-ERROR", 2, 0, false);
    //declareFunction(myName, "sql_transaction_level_p", "SQL-TRANSACTION-LEVEL-P", 1, 0, false);
    //declareFunction(myName, "sqlc_set_error_handling", "SQLC-SET-ERROR-HANDLING", 2, 0, false);
    //declareFunction(myName, "new_sql_response", "NEW-SQL-RESPONSE", 2, 0, false);
    //declareFunction(myName, "sql_response_code", "SQL-RESPONSE-CODE", 1, 0, false);
    //declareFunction(myName, "sql_response_value", "SQL-RESPONSE-VALUE", 1, 0, false);
    //declareFunction(myName, "sql_null_p", "SQL-NULL-P", 1, 0, false);
    //declareFunction(myName, "sql_true_p", "SQL-TRUE-P", 1, 0, false);
    //declareFunction(myName, "sql_false_p", "SQL-FALSE-P", 1, 0, false);
    declareFunction(myName, "sdbc_error_print_function_trampoline", "SDBC-ERROR-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
    //declareFunction(myName, "sdbc_error_p", "SDBC-ERROR-P", 1, 0, false); new $sdbc_error_p$UnaryFunction();
    //declareFunction(myName, "sdbc_error_type", "SDBC-ERROR-TYPE", 1, 0, false);
    //declareFunction(myName, "sdbc_error_message", "SDBC-ERROR-MESSAGE", 1, 0, false);
    //declareFunction(myName, "sdbc_error_code", "SDBC-ERROR-CODE", 1, 0, false);
    //declareFunction(myName, "_csetf_sdbc_error_type", "_CSETF-SDBC-ERROR-TYPE", 2, 0, false);
    //declareFunction(myName, "_csetf_sdbc_error_message", "_CSETF-SDBC-ERROR-MESSAGE", 2, 0, false);
    //declareFunction(myName, "_csetf_sdbc_error_code", "_CSETF-SDBC-ERROR-CODE", 2, 0, false);
    //declareFunction(myName, "make_sdbc_error", "MAKE-SDBC-ERROR", 0, 1, false);
    //declareFunction(myName, "sdbc_error_throw", "SDBC-ERROR-THROW", 1, 0, false);
    //declareFunction(myName, "sdbc_error_warn", "SDBC-ERROR-WARN", 1, 0, false);
    //declareFunction(myName, "sdbc_server_error_p", "SDBC-SERVER-ERROR-P", 1, 0, false);
    //declareFunction(myName, "sdbc_client_error_p", "SDBC-CLIENT-ERROR-P", 1, 0, false);
    //declareFunction(myName, "sdbc_sql_error_p", "SDBC-SQL-ERROR-P", 1, 0, false);
    //declareFunction(myName, "sdbc_io_error_p", "SDBC-IO-ERROR-P", 1, 0, false);
    //declareFunction(myName, "sdbc_transaction_error_p", "SDBC-TRANSACTION-ERROR-P", 1, 0, false);
    //declareFunction(myName, "sdbc_batch_update_error_p", "SDBC-BATCH-UPDATE-ERROR-P", 1, 0, false);
    //declareFunction(myName, "sdbc_other_error_p", "SDBC-OTHER-ERROR-P", 1, 0, false);
    //declareFunction(myName, "new_sdbc_error", "NEW-SDBC-ERROR", 2, 1, false);
    //declareFunction(myName, "sdbc_error_print", "SDBC-ERROR-PRINT", 3, 0, false);
    //declareFunction(myName, "decode_sdbc_error_code", "DECODE-SDBC-ERROR-CODE", 1, 0, false);
    declareFunction(myName, "sql_result_set_print_function_trampoline", "SQL-RESULT-SET-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
    //declareFunction(myName, "sql_result_set_p", "SQL-RESULT-SET-P", 1, 0, false); new $sql_result_set_p$UnaryFunction();
    //declareFunction(myName, "sqlrs_rows", "SQLRS-ROWS", 1, 0, false);
    //declareFunction(myName, "sqlrs_current", "SQLRS-CURRENT", 1, 0, false);
    //declareFunction(myName, "sqlrs_last", "SQLRS-LAST", 1, 0, false);
    //declareFunction(myName, "sqlrs_start", "SQLRS-START", 1, 0, false);
    //declareFunction(myName, "sqlrs_connection", "SQLRS-CONNECTION", 1, 0, false);
    //declareFunction(myName, "sqlrs_block_size", "SQLRS-BLOCK-SIZE", 1, 0, false);
    //declareFunction(myName, "sqlrs_id", "SQLRS-ID", 1, 0, false);
    //declareFunction(myName, "_csetf_sqlrs_rows", "_CSETF-SQLRS-ROWS", 2, 0, false);
    //declareFunction(myName, "_csetf_sqlrs_current", "_CSETF-SQLRS-CURRENT", 2, 0, false);
    //declareFunction(myName, "_csetf_sqlrs_last", "_CSETF-SQLRS-LAST", 2, 0, false);
    //declareFunction(myName, "_csetf_sqlrs_start", "_CSETF-SQLRS-START", 2, 0, false);
    //declareFunction(myName, "_csetf_sqlrs_connection", "_CSETF-SQLRS-CONNECTION", 2, 0, false);
    //declareFunction(myName, "_csetf_sqlrs_block_size", "_CSETF-SQLRS-BLOCK-SIZE", 2, 0, false);
    //declareFunction(myName, "_csetf_sqlrs_id", "_CSETF-SQLRS-ID", 2, 0, false);
    //declareFunction(myName, "make_sql_result_set", "MAKE-SQL-RESULT-SET", 0, 1, false);
    //declareFunction(myName, "sqlrs_print", "SQLRS-PRINT", 3, 0, false);
    //declareFunction(myName, "sql_open_result_set_p", "SQL-OPEN-RESULT-SET-P", 1, 0, false);
    //declareFunction(myName, "sqlrs_close", "SQLRS-CLOSE", 1, 0, false);
    //declareFunction(myName, "sqlrs_emptyP", "SQLRS-EMPTY?", 1, 0, false);
    //declareFunction(myName, "sqlrs_absolute", "SQLRS-ABSOLUTE", 2, 0, false);
    //declareFunction(myName, "sqlrs_next", "SQLRS-NEXT", 1, 0, false);
    //declareFunction(myName, "sqlrs_previous", "SQLRS-PREVIOUS", 1, 0, false);
    //declareFunction(myName, "sqlrs_is_last", "SQLRS-IS-LAST", 1, 0, false);
    //declareFunction(myName, "sqlrs_is_first", "SQLRS-IS-FIRST", 1, 0, false);
    //declareFunction(myName, "sqlrs_column_count", "SQLRS-COLUMN-COUNT", 1, 0, false);
    //declareFunction(myName, "sqlrs_row_count", "SQLRS-ROW-COUNT", 1, 0, false);
    //declareFunction(myName, "sqlrs_get_row", "SQLRS-GET-ROW", 1, 0, false);
    //declareFunction(myName, "sqlrs_get_object", "SQLRS-GET-OBJECT", 2, 0, false);
    //declareFunction(myName, "sqlrs_get_object_tuple", "SQLRS-GET-OBJECT-TUPLE", 1, 0, false);
    //declareFunction(myName, "new_sql_result_set", "NEW-SQL-RESULT-SET", 3, 0, false);
    //declareFunction(myName, "sqlrs_closed_p", "SQLRS-CLOSED-P", 1, 0, false);
    //declareFunction(myName, "sqlrs_open_p", "SQLRS-OPEN-P", 1, 0, false);
    //declareFunction(myName, "sqlrs_valid_row_p", "SQLRS-VALID-ROW-P", 1, 0, false);
    //declareFunction(myName, "sqlrs_valid_column_p", "SQLRS-VALID-COLUMN-P", 2, 0, false);
    //declareFunction(myName, "sqlrs_block", "SQLRS-BLOCK", 2, 0, false);
    //declareFunction(myName, "sqlrs_row_local_p", "SQLRS-ROW-LOCAL-P", 1, 0, false);
    //declareFunction(myName, "sqlrs_row_remote_p", "SQLRS-ROW-REMOTE-P", 1, 0, false);
    //declareFunction(myName, "sqlrs_local_close", "SQLRS-LOCAL-CLOSE", 1, 0, false);
    declareFunction(myName, "sql_statement_print_function_trampoline", "SQL-STATEMENT-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
    //declareFunction(myName, "sql_statement_p", "SQL-STATEMENT-P", 1, 0, false); new $sql_statement_p$UnaryFunction();
    //declareFunction(myName, "sqls_connection", "SQLS-CONNECTION", 1, 0, false);
    //declareFunction(myName, "sqls_id", "SQLS-ID", 1, 0, false);
    //declareFunction(myName, "sqls_sql", "SQLS-SQL", 1, 0, false);
    //declareFunction(myName, "sqls_settings", "SQLS-SETTINGS", 1, 0, false);
    //declareFunction(myName, "sqls_batch", "SQLS-BATCH", 1, 0, false);
    //declareFunction(myName, "sqls_rs", "SQLS-RS", 1, 0, false);
    //declareFunction(myName, "_csetf_sqls_connection", "_CSETF-SQLS-CONNECTION", 2, 0, false);
    //declareFunction(myName, "_csetf_sqls_id", "_CSETF-SQLS-ID", 2, 0, false);
    //declareFunction(myName, "_csetf_sqls_sql", "_CSETF-SQLS-SQL", 2, 0, false);
    //declareFunction(myName, "_csetf_sqls_settings", "_CSETF-SQLS-SETTINGS", 2, 0, false);
    //declareFunction(myName, "_csetf_sqls_batch", "_CSETF-SQLS-BATCH", 2, 0, false);
    //declareFunction(myName, "_csetf_sqls_rs", "_CSETF-SQLS-RS", 2, 0, false);
    //declareFunction(myName, "make_sql_statement", "MAKE-SQL-STATEMENT", 0, 1, false);
    //declareFunction(myName, "sqls_open_p", "SQLS-OPEN-P", 1, 0, false);
    //declareFunction(myName, "sql_open_statement_p", "SQL-OPEN-STATEMENT-P", 1, 0, false);
    //declareFunction(myName, "sqls_execute_query", "SQLS-EXECUTE-QUERY", 2, 1, false);
    //declareFunction(myName, "sqls_execute_update", "SQLS-EXECUTE-UPDATE", 2, 0, false);
    //declareFunction(myName, "sqls_cancel", "SQLS-CANCEL", 1, 0, false);
    //declareFunction(myName, "sqls_get_generated_keys", "SQLS-GET-GENERATED-KEYS", 1, 1, false);
    //declareFunction(myName, "sqls_close", "SQLS-CLOSE", 1, 0, false);
    //declareFunction(myName, "sqls_add_batch", "SQLS-ADD-BATCH", 2, 0, false);
    //declareFunction(myName, "sqls_clear_batch", "SQLS-CLEAR-BATCH", 1, 0, false);
    //declareFunction(myName, "sqls_execute_batch", "SQLS-EXECUTE-BATCH", 1, 0, false);
    //declareFunction(myName, "sql_prepared_statement_p", "SQL-PREPARED-STATEMENT-P", 1, 0, false);
    //declareFunction(myName, "sql_prepared_open_statement_p", "SQL-PREPARED-OPEN-STATEMENT-P", 1, 0, false);
    //declareFunction(myName, "sqlps_execute_query", "SQLPS-EXECUTE-QUERY", 1, 1, false);
    //declareFunction(myName, "sqlps_execute_update", "SQLPS-EXECUTE-UPDATE", 1, 0, false);
    //declareFunction(myName, "sqlps_set_bytes", "SQLPS-SET-BYTES", 3, 0, false);
    //declareFunction(myName, "sqlps_set_int", "SQLPS-SET-INT", 3, 0, false);
    //declareFunction(myName, "sqlps_set_long", "SQLPS-SET-LONG", 3, 0, false);
    //declareFunction(myName, "sqlps_set_float", "SQLPS-SET-FLOAT", 3, 0, false);
    //declareFunction(myName, "sqlps_set_double", "SQLPS-SET-DOUBLE", 3, 0, false);
    //declareFunction(myName, "sqlps_set_string", "SQLPS-SET-STRING", 3, 0, false);
    //declareFunction(myName, "new_sql_statement", "NEW-SQL-STATEMENT", 1, 0, false);
    //declareFunction(myName, "sqls_get_connection", "SQLS-GET-CONNECTION", 1, 0, false);
    //declareFunction(myName, "sqls_local_close", "SQLS-LOCAL-CLOSE", 1, 0, false);
    //declareFunction(myName, "sqlps_set", "SQLPS-SET", 4, 0, false);
    //declareFunction(myName, "new_sql_prepared_statement", "NEW-SQL-PREPARED-STATEMENT", 2, 0, false);
    //declareFunction(myName, "new_statement_id", "NEW-STATEMENT-ID", 0, 0, false);
    //declareFunction(myName, "new_result_set_id", "NEW-RESULT-SET-ID", 0, 0, false);
    //declareFunction(myName, "sqlc_get_tables", "SQLC-GET-TABLES", 5, 0, false);
    //declareFunction(myName, "sqlc_get_tables_meta_data", "SQLC-GET-TABLES-META-DATA", 5, 0, false);
    //declareFunction(myName, "sqlc_get_columns", "SQLC-GET-COLUMNS", 5, 0, false);
    //declareFunction(myName, "sqlc_get_columns_meta_data", "SQLC-GET-COLUMNS-META-DATA", 5, 0, false);
    //declareFunction(myName, "sqlc_get_primary_keys", "SQLC-GET-PRIMARY-KEYS", 4, 0, false);
    //declareFunction(myName, "sqlc_get_primary_keys_meta_data", "SQLC-GET-PRIMARY-KEYS-META-DATA", 4, 0, false);
    //declareFunction(myName, "sqlc_get_imported_keys", "SQLC-GET-IMPORTED-KEYS", 4, 0, false);
    //declareFunction(myName, "sqlc_get_imported_keys_meta_data", "SQLC-GET-IMPORTED-KEYS-META-DATA", 4, 0, false);
    //declareFunction(myName, "sqlc_get_exported_keys", "SQLC-GET-EXPORTED-KEYS", 4, 0, false);
    //declareFunction(myName, "sqlc_get_exported_keys_meta_data", "SQLC-GET-EXPORTED-KEYS-META-DATA", 4, 0, false);
    //declareFunction(myName, "sqlc_get_index_info", "SQLC-GET-INDEX-INFO", 6, 0, false);
    //declareFunction(myName, "sqlc_get_index_info_meta_data", "SQLC-GET-INDEX-INFO-META-DATA", 6, 0, false);
    //declareFunction(myName, "sqlc_get_max_connections", "SQLC-GET-MAX-CONNECTIONS", 1, 0, false);
    //declareFunction(myName, "sdbc_error_handling_tag_p", "SDBC-ERROR-HANDLING-TAG-P", 1, 0, false);
    //declareFunction(myName, "new_db_url", "NEW-DB-URL", 5, 0, false);
    //declareFunction(myName, "java_integerp", "JAVA-INTEGERP", 1, 0, false);
    //declareFunction(myName, "java_longp", "JAVA-LONGP", 1, 0, false);
    //declareFunction(myName, "java_floatp", "JAVA-FLOATP", 1, 0, false);
    //declareFunction(myName, "java_doublep", "JAVA-DOUBLEP", 1, 0, false);
    //declareMacro(myName, "with_sql_connection", "WITH-SQL-CONNECTION");
    //declareMacro(myName, "with_sql_statement", "WITH-SQL-STATEMENT");
    //declareMacro(myName, "with_prepared_sql_statement", "WITH-PREPARED-SQL-STATEMENT");
    //declareMacro(myName, "sqls_execute_transaction", "SQLS-EXECUTE-TRANSACTION");
    //declareFunction(myName, "sqls_handle_commit_error", "SQLS-HANDLE-COMMIT-ERROR", 1, 0, false);
    //declareFunction(myName, "sqls_handle_rollback", "SQLS-HANDLE-ROLLBACK", 1, 0, false);
    //declareFunction(myName, "sqls_handle_transaction_errors", "SQLS-HANDLE-TRANSACTION-ERRORS", 1, 0, false);
    //declareMacro(myName, "with_sql_transaction", "WITH-SQL-TRANSACTION");
    //declareMacro(myName, "with_sql_result_set", "WITH-SQL-RESULT-SET");
    //declareMacro(myName, "do_sql_result_set", "DO-SQL-RESULT-SET");
    //declareFunction(myName, "sql_export", "SQL-EXPORT", 4, 5, false);
    //declareFunction(myName, "sdbc_test", "SDBC-TEST", 3, 5, false);
    //declareFunction(myName, "sdbc_test_prepared", "SDBC-TEST-PREPARED", 3, 5, false);
    //declareFunction(myName, "sdbc_test_created", "SDBC-TEST-CREATED", 3, 5, false);
    //declareFunction(myName, "sdbc_test_batch", "SDBC-TEST-BATCH", 3, 5, false);
    return NIL;
  }

  public static final SubLObject init_sdbc_file() {
    $dbms_server$ = deflexical("*DBMS-SERVER*", red_infrastructure_macros.red_def_helper(($list0.isSymbol() ? ((SubLObject) Symbols.symbol_value($list0)) : $list0), $sym1$_DBMS_SERVER_, ($str2$db_server_cyc_com.isSymbol() ? ((SubLObject) Symbols.symbol_value($str2$db_server_cyc_com)) : $str2$db_server_cyc_com), $kw3$LEXICAL, UNPROVIDED));
    $sdbc_proxy_server$ = deflexical("*SDBC-PROXY-SERVER*", red_infrastructure_macros.red_def_helper(($list4.isSymbol() ? ((SubLObject) Symbols.symbol_value($list4)) : $list4), $sym5$_SDBC_PROXY_SERVER_, ($str2$db_server_cyc_com.isSymbol() ? ((SubLObject) Symbols.symbol_value($str2$db_server_cyc_com)) : $str2$db_server_cyc_com), $kw3$LEXICAL, UNPROVIDED));
    $sql_port$ = deflexical("*SQL-PORT*", red_infrastructure_macros.red_def_helper(($list6.isSymbol() ? ((SubLObject) Symbols.symbol_value($list6)) : $list6), $sym7$_SQL_PORT_, ($int8$9999.isSymbol() ? ((SubLObject) Symbols.symbol_value($int8$9999)) : $int8$9999), $kw3$LEXICAL, UNPROVIDED));
    $sql_protocol$ = deflexical("*SQL-PROTOCOL*", $str9$jdbc);
    $sql_subprotocol$ = deflexical("*SQL-SUBPROTOCOL*", $str10$postgresql);
    $sql_connection_timeout$ = deflexical("*SQL-CONNECTION-TIMEOUT*", FIVE_INTEGER);
    $connection_id$ = deflexical("*CONNECTION-ID*", $str11$CONNECTION);
    $result_set_block_size$ = defparameter("*RESULT-SET-BLOCK-SIZE*", $int12$1000);
    $quit$ = deflexical("*QUIT*", ZERO_INTEGER);
    $execute_update$ = deflexical("*EXECUTE-UPDATE*", ONE_INTEGER);
    $execute_query$ = deflexical("*EXECUTE-QUERY*", TWO_INTEGER);
    $prepare_statement$ = deflexical("*PREPARE-STATEMENT*", THREE_INTEGER);
    $create_statement$ = deflexical("*CREATE-STATEMENT*", FOUR_INTEGER);
    $set_bytes$ = deflexical("*SET-BYTES*", FIVE_INTEGER);
    $ps_execute_update$ = deflexical("*PS-EXECUTE-UPDATE*", SIX_INTEGER);
    $ps_execute_query$ = deflexical("*PS-EXECUTE-QUERY*", SEVEN_INTEGER);
    $set_int$ = deflexical("*SET-INT*", EIGHT_INTEGER);
    $close_statement$ = deflexical("*CLOSE-STATEMENT*", NINE_INTEGER);
    $new_connection$ = deflexical("*NEW-CONNECTION*", TEN_INTEGER);
    $set_string$ = deflexical("*SET-STRING*", ELEVEN_INTEGER);
    $set_long$ = deflexical("*SET-LONG*", TWELVE_INTEGER);
    $set_double$ = deflexical("*SET-DOUBLE*", THIRTEEN_INTEGER);
    $set_float$ = deflexical("*SET-FLOAT*", FOURTEEN_INTEGER);
    $execute_batch$ = deflexical("*EXECUTE-BATCH*", FIFTEEN_INTEGER);
    $get_rows$ = deflexical("*GET-ROWS*", SIXTEEN_INTEGER);
    $close_result_set$ = deflexical("*CLOSE-RESULT-SET*", SEVENTEEN_INTEGER);
    $execute_update_auto_keys$ = deflexical("*EXECUTE-UPDATE-AUTO-KEYS*", EIGHTEEN_INTEGER);
    $get_generated_keys$ = deflexical("*GET-GENERATED-KEYS*", NINETEEN_INTEGER);
    $set_auto_commit$ = deflexical("*SET-AUTO-COMMIT*", TWENTY_INTEGER);
    $commit$ = deflexical("*COMMIT*", $int13$21);
    $rollback$ = deflexical("*ROLLBACK*", $int14$22);
    $get_transaction_isolation$ = deflexical("*GET-TRANSACTION-ISOLATION*", $int15$23);
    $set_transaction_isolation$ = deflexical("*SET-TRANSACTION-ISOLATION*", $int16$24);
    $get_auto_commit$ = deflexical("*GET-AUTO-COMMIT*", $int17$25);
    $get_tables$ = deflexical("*GET-TABLES*", $int18$26);
    $get_columns$ = deflexical("*GET-COLUMNS*", $int19$27);
    $get_primary_keys$ = deflexical("*GET-PRIMARY-KEYS*", $int20$28);
    $get_imported_keys$ = deflexical("*GET-IMPORTED-KEYS*", $int21$29);
    $get_exported_keys$ = deflexical("*GET-EXPORTED-KEYS*", $int22$30);
    $get_index_info$ = deflexical("*GET-INDEX-INFO*", $int23$31);
    $cancel$ = deflexical("*CANCEL*", $int24$32);
    $get_max_connections$ = deflexical("*GET-MAX-CONNECTIONS*", $int25$33);
    $stop_response$ = deflexical("*STOP-RESPONSE*", ZERO_INTEGER);
    $integer_response$ = deflexical("*INTEGER-RESPONSE*", ONE_INTEGER);
    $result_set_response$ = deflexical("*RESULT-SET-RESPONSE*", TWO_INTEGER);
    $void_response$ = deflexical("*VOID-RESPONSE*", THREE_INTEGER);
    $connection$ = deflexical("*CONNECTION*", FOUR_INTEGER);
    $update_counts$ = deflexical("*UPDATE-COUNTS*", FIVE_INTEGER);
    $transaction_isolation_level$ = deflexical("*TRANSACTION-ISOLATION-LEVEL*", SIX_INTEGER);
    $boolean$ = deflexical("*BOOLEAN*", SEVEN_INTEGER);
    $io_error$ = deflexical("*IO-ERROR*", MINUS_ONE_INTEGER);
    $sql_error$ = deflexical("*SQL-ERROR*", $int26$_2);
    $unknown_error$ = deflexical("*UNKNOWN-ERROR*", $int27$_3);
    $client_error$ = deflexical("*CLIENT-ERROR*", $int28$_4);
    $commit_error$ = deflexical("*COMMIT-ERROR*", $int29$_5);
    $rollback_error$ = deflexical("*ROLLBACK-ERROR*", $int30$_6);
    $transaction_error$ = deflexical("*TRANSACTION-ERROR*", $int31$_7);
    $batch_update_error$ = deflexical("*BATCH-UPDATE-ERROR*", $int32$_8);
    $dtp_sql_connection$ = defconstant("*DTP-SQL-CONNECTION*", $sym37$SQL_CONNECTION);
    $dtp_sql_ticket$ = defconstant("*DTP-SQL-TICKET*", $sym100$SQL_TICKET);
    $dtp_sdbc_error$ = defconstant("*DTP-SDBC-ERROR*", $sym126$SDBC_ERROR);
    $sdbc_error_decoding$ = defparameter("*SDBC-ERROR-DECODING*", list(reader.bq_cons($io_error$.getGlobalValue(), $str148$_IO), reader.bq_cons($sql_error$.getGlobalValue(), $str149$_SQL), reader.bq_cons($unknown_error$.getGlobalValue(), $str150$), reader.bq_cons($client_error$.getGlobalValue(), $str151$_CLIENT), reader.bq_cons($transaction_error$.getGlobalValue(), $str152$_TRANSACTION), reader.bq_cons($rollback_error$.getGlobalValue(), $str153$_ROLLBACK), reader.bq_cons($batch_update_error$.getGlobalValue(), $str154$_BATCH_UPDATE)));
    $dtp_sql_result_set$ = defconstant("*DTP-SQL-RESULT-SET*", $sym155$SQL_RESULT_SET);
    $dtp_sql_statement$ = defconstant("*DTP-SQL-STATEMENT*", $sym199$SQL_STATEMENT);
    $sdbc_test_row_cardinality$ = deflexical("*SDBC-TEST-ROW-CARDINALITY*", $int17$25);
    return NIL;
  }

  public static final SubLObject setup_sdbc_file() {
    // CVS_ID("Id: sdbc.lisp 127036 2009-02-06 15:50:12Z goolsbey ");
    Structures.register_method(print_high.$print_object_method_table$.getGlobalValue(), $dtp_sql_connection$.getGlobalValue(), Symbols.symbol_function($sym44$SQL_CONNECTION_PRINT_FUNCTION_TRAMPOLINE));
    Structures.def_csetf($sym45$SQLC_DB, $sym46$_CSETF_SQLC_DB);
    Structures.def_csetf($sym47$SQLC_USER, $sym48$_CSETF_SQLC_USER);
    Structures.def_csetf($sym49$SQLC_DBMS_SERVER, $sym50$_CSETF_SQLC_DBMS_SERVER);
    Structures.def_csetf($sym51$SQLC_PORT, $sym52$_CSETF_SQLC_PORT);
    Structures.def_csetf($sym53$SQLC_CHANNEL, $sym54$_CSETF_SQLC_CHANNEL);
    Structures.def_csetf($sym55$SQLC_STATEMENTS, $sym56$_CSETF_SQLC_STATEMENTS);
    Structures.def_csetf($sym57$SQLC_LOCK, $sym58$_CSETF_SQLC_LOCK);
    Structures.def_csetf($sym59$SQLC_SUBPROTOCOL, $sym60$_CSETF_SQLC_SUBPROTOCOL);
    Structures.def_csetf($sym61$SQLC_PROXY_SERVER, $sym62$_CSETF_SQLC_PROXY_SERVER);
    Structures.def_csetf($sym63$SQLC_ERROR_HANDLING, $sym64$_CSETF_SQLC_ERROR_HANDLING);
    Structures.def_csetf($sym65$SQLC_TICKETS, $sym66$_CSETF_SQLC_TICKETS);
    Structures.def_csetf($sym67$SQLC_MAILMAN, $sym68$_CSETF_SQLC_MAILMAN);
    Equality.identity($sym37$SQL_CONNECTION);
    Structures.register_method(print_high.$print_object_method_table$.getGlobalValue(), $dtp_sql_ticket$.getGlobalValue(), Symbols.symbol_function($sym107$SQL_TICKET_PRINT_FUNCTION_TRAMPOLINE));
    Structures.def_csetf($sym108$SQL_TICKET_SEMAPHORE, $sym109$_CSETF_SQL_TICKET_SEMAPHORE);
    Structures.def_csetf($sym110$SQL_TICKET_RESULT, $sym111$_CSETF_SQL_TICKET_RESULT);
    Equality.identity($sym100$SQL_TICKET);
    access_macros.register_macro_helper($sym122$SQLC_SET_ERROR_HANDLING, $sym123$SQLS_EXECUTE_TRANSACTION);
    Structures.register_method(print_high.$print_object_method_table$.getGlobalValue(), $dtp_sdbc_error$.getGlobalValue(), Symbols.symbol_function($sym133$SDBC_ERROR_PRINT_FUNCTION_TRAMPOLINE));
    Structures.def_csetf($sym134$SDBC_ERROR_TYPE, $sym135$_CSETF_SDBC_ERROR_TYPE);
    Structures.def_csetf($sym136$SDBC_ERROR_MESSAGE, $sym137$_CSETF_SDBC_ERROR_MESSAGE);
    Structures.def_csetf($sym138$SDBC_ERROR_CODE, $sym139$_CSETF_SDBC_ERROR_CODE);
    Equality.identity($sym126$SDBC_ERROR);
    Structures.register_method(print_high.$print_object_method_table$.getGlobalValue(), $dtp_sql_result_set$.getGlobalValue(), Symbols.symbol_function($sym162$SQL_RESULT_SET_PRINT_FUNCTION_TRAMPOLINE));
    Structures.def_csetf($sym163$SQLRS_ROWS, $sym164$_CSETF_SQLRS_ROWS);
    Structures.def_csetf($sym165$SQLRS_CURRENT, $sym166$_CSETF_SQLRS_CURRENT);
    Structures.def_csetf($sym167$SQLRS_LAST, $sym168$_CSETF_SQLRS_LAST);
    Structures.def_csetf($sym169$SQLRS_START, $sym170$_CSETF_SQLRS_START);
    Structures.def_csetf($sym171$SQLRS_CONNECTION, $sym172$_CSETF_SQLRS_CONNECTION);
    Structures.def_csetf($sym173$SQLRS_BLOCK_SIZE, $sym174$_CSETF_SQLRS_BLOCK_SIZE);
    Structures.def_csetf($sym175$SQLRS_ID, $sym176$_CSETF_SQLRS_ID);
    Equality.identity($sym155$SQL_RESULT_SET);
    Structures.register_method(print_high.$print_object_method_table$.getGlobalValue(), $dtp_sql_statement$.getGlobalValue(), Symbols.symbol_function($sym205$SQL_STATEMENT_PRINT_FUNCTION_TRAMPOLINE));
    Structures.def_csetf($sym206$SQLS_CONNECTION, $sym207$_CSETF_SQLS_CONNECTION);
    Structures.def_csetf($sym208$SQLS_ID, $sym209$_CSETF_SQLS_ID);
    Structures.def_csetf($sym210$SQLS_SQL, $sym211$_CSETF_SQLS_SQL);
    Structures.def_csetf($sym212$SQLS_SETTINGS, $sym213$_CSETF_SQLS_SETTINGS);
    Structures.def_csetf($sym214$SQLS_BATCH, $sym215$_CSETF_SQLS_BATCH);
    Structures.def_csetf($sym216$SQLS_RS, $sym217$_CSETF_SQLS_RS);
    Equality.identity($sym199$SQL_STATEMENT);
    access_macros.register_macro_helper($sym229$SQLS_GET_CONNECTION, $sym123$SQLS_EXECUTE_TRANSACTION);
    access_macros.register_macro_helper($sym301$SQLS_HANDLE_COMMIT_ERROR, $sym123$SQLS_EXECUTE_TRANSACTION);
    access_macros.register_macro_helper($sym302$SQLS_HANDLE_ROLLBACK, $sym123$SQLS_EXECUTE_TRANSACTION);
    access_macros.register_macro_helper($sym304$SQLS_HANDLE_TRANSACTION_ERRORS, $sym123$SQLS_EXECUTE_TRANSACTION);
    return NIL;
  }

  //// Internal Constants

  public static final SubLList $list0 = list(makeString("application.sdbc.dbms-server"));
  public static final SubLSymbol $sym1$_DBMS_SERVER_ = makeSymbol("*DBMS-SERVER*");
  public static final SubLString $str2$db_server_cyc_com = makeString("db-server.cyc.com");
  public static final SubLSymbol $kw3$LEXICAL = makeKeyword("LEXICAL");
  public static final SubLList $list4 = list(makeString("application.sdbc.proxy-server"));
  public static final SubLSymbol $sym5$_SDBC_PROXY_SERVER_ = makeSymbol("*SDBC-PROXY-SERVER*");
  public static final SubLList $list6 = list(makeString("application.sdbc.sql-port"));
  public static final SubLSymbol $sym7$_SQL_PORT_ = makeSymbol("*SQL-PORT*");
  public static final SubLInteger $int8$9999 = makeInteger(9999);
  public static final SubLString $str9$jdbc = makeString("jdbc");
  public static final SubLString $str10$postgresql = makeString("postgresql");
  public static final SubLString $str11$CONNECTION = makeString("CONNECTION");
  public static final SubLInteger $int12$1000 = makeInteger(1000);
  public static final SubLInteger $int13$21 = makeInteger(21);
  public static final SubLInteger $int14$22 = makeInteger(22);
  public static final SubLInteger $int15$23 = makeInteger(23);
  public static final SubLInteger $int16$24 = makeInteger(24);
  public static final SubLInteger $int17$25 = makeInteger(25);
  public static final SubLInteger $int18$26 = makeInteger(26);
  public static final SubLInteger $int19$27 = makeInteger(27);
  public static final SubLInteger $int20$28 = makeInteger(28);
  public static final SubLInteger $int21$29 = makeInteger(29);
  public static final SubLInteger $int22$30 = makeInteger(30);
  public static final SubLInteger $int23$31 = makeInteger(31);
  public static final SubLInteger $int24$32 = makeInteger(32);
  public static final SubLInteger $int25$33 = makeInteger(33);
  public static final SubLInteger $int26$_2 = makeInteger(-2);
  public static final SubLInteger $int27$_3 = makeInteger(-3);
  public static final SubLInteger $int28$_4 = makeInteger(-4);
  public static final SubLInteger $int29$_5 = makeInteger(-5);
  public static final SubLInteger $int30$_6 = makeInteger(-6);
  public static final SubLInteger $int31$_7 = makeInteger(-7);
  public static final SubLInteger $int32$_8 = makeInteger(-8);
  public static final SubLSymbol $sym33$STRINGP = makeSymbol("STRINGP");
  public static final SubLSymbol $sym34$POSITIVE_INTEGER_P = makeSymbol("POSITIVE-INTEGER-P");
  public static final SubLSymbol $sym35$CATCH_ERROR_MESSAGE_HANDLER = makeSymbol("CATCH-ERROR-MESSAGE-HANDLER");
  public static final SubLSymbol $kw36$PRIVATE = makeKeyword("PRIVATE");
  public static final SubLSymbol $sym37$SQL_CONNECTION = makeSymbol("SQL-CONNECTION");
  public static final SubLSymbol $sym38$SQL_CONNECTION_P = makeSymbol("SQL-CONNECTION-P");
  public static final SubLList $list39 = list(new SubLObject[] {makeSymbol("DB"), makeSymbol("USER"), makeSymbol("DBMS-SERVER"), makeSymbol("PORT"), makeSymbol("CHANNEL"), makeSymbol("STATEMENTS"), makeSymbol("LOCK"), makeSymbol("SUBPROTOCOL"), makeSymbol("PROXY-SERVER"), makeSymbol("ERROR-HANDLING"), makeSymbol("TICKETS"), makeSymbol("MAILMAN")});
  public static final SubLList $list40 = list(new SubLObject[] {makeKeyword("DB"), makeKeyword("USER"), makeKeyword("DBMS-SERVER"), makeKeyword("PORT"), makeKeyword("CHANNEL"), makeKeyword("STATEMENTS"), makeKeyword("LOCK"), makeKeyword("SUBPROTOCOL"), makeKeyword("PROXY-SERVER"), makeKeyword("ERROR-HANDLING"), makeKeyword("TICKETS"), makeKeyword("MAILMAN")});
  public static final SubLList $list41 = list(new SubLObject[] {makeSymbol("SQLC-DB"), makeSymbol("SQLC-USER"), makeSymbol("SQLC-DBMS-SERVER"), makeSymbol("SQLC-PORT"), makeSymbol("SQLC-CHANNEL"), makeSymbol("SQLC-STATEMENTS"), makeSymbol("SQLC-LOCK"), makeSymbol("SQLC-SUBPROTOCOL"), makeSymbol("SQLC-PROXY-SERVER"), makeSymbol("SQLC-ERROR-HANDLING"), makeSymbol("SQLC-TICKETS"), makeSymbol("SQLC-MAILMAN")});
  public static final SubLList $list42 = list(new SubLObject[] {makeSymbol("_CSETF-SQLC-DB"), makeSymbol("_CSETF-SQLC-USER"), makeSymbol("_CSETF-SQLC-DBMS-SERVER"), makeSymbol("_CSETF-SQLC-PORT"), makeSymbol("_CSETF-SQLC-CHANNEL"), makeSymbol("_CSETF-SQLC-STATEMENTS"), makeSymbol("_CSETF-SQLC-LOCK"), makeSymbol("_CSETF-SQLC-SUBPROTOCOL"), makeSymbol("_CSETF-SQLC-PROXY-SERVER"), makeSymbol("_CSETF-SQLC-ERROR-HANDLING"), makeSymbol("_CSETF-SQLC-TICKETS"), makeSymbol("_CSETF-SQLC-MAILMAN")});
  public static final SubLSymbol $sym43$SQLC_PRINT = makeSymbol("SQLC-PRINT");
  public static final SubLSymbol $sym44$SQL_CONNECTION_PRINT_FUNCTION_TRAMPOLINE = makeSymbol("SQL-CONNECTION-PRINT-FUNCTION-TRAMPOLINE");
  public static final SubLSymbol $sym45$SQLC_DB = makeSymbol("SQLC-DB");
  public static final SubLSymbol $sym46$_CSETF_SQLC_DB = makeSymbol("_CSETF-SQLC-DB");
  public static final SubLSymbol $sym47$SQLC_USER = makeSymbol("SQLC-USER");
  public static final SubLSymbol $sym48$_CSETF_SQLC_USER = makeSymbol("_CSETF-SQLC-USER");
  public static final SubLSymbol $sym49$SQLC_DBMS_SERVER = makeSymbol("SQLC-DBMS-SERVER");
  public static final SubLSymbol $sym50$_CSETF_SQLC_DBMS_SERVER = makeSymbol("_CSETF-SQLC-DBMS-SERVER");
  public static final SubLSymbol $sym51$SQLC_PORT = makeSymbol("SQLC-PORT");
  public static final SubLSymbol $sym52$_CSETF_SQLC_PORT = makeSymbol("_CSETF-SQLC-PORT");
  public static final SubLSymbol $sym53$SQLC_CHANNEL = makeSymbol("SQLC-CHANNEL");
  public static final SubLSymbol $sym54$_CSETF_SQLC_CHANNEL = makeSymbol("_CSETF-SQLC-CHANNEL");
  public static final SubLSymbol $sym55$SQLC_STATEMENTS = makeSymbol("SQLC-STATEMENTS");
  public static final SubLSymbol $sym56$_CSETF_SQLC_STATEMENTS = makeSymbol("_CSETF-SQLC-STATEMENTS");
  public static final SubLSymbol $sym57$SQLC_LOCK = makeSymbol("SQLC-LOCK");
  public static final SubLSymbol $sym58$_CSETF_SQLC_LOCK = makeSymbol("_CSETF-SQLC-LOCK");
  public static final SubLSymbol $sym59$SQLC_SUBPROTOCOL = makeSymbol("SQLC-SUBPROTOCOL");
  public static final SubLSymbol $sym60$_CSETF_SQLC_SUBPROTOCOL = makeSymbol("_CSETF-SQLC-SUBPROTOCOL");
  public static final SubLSymbol $sym61$SQLC_PROXY_SERVER = makeSymbol("SQLC-PROXY-SERVER");
  public static final SubLSymbol $sym62$_CSETF_SQLC_PROXY_SERVER = makeSymbol("_CSETF-SQLC-PROXY-SERVER");
  public static final SubLSymbol $sym63$SQLC_ERROR_HANDLING = makeSymbol("SQLC-ERROR-HANDLING");
  public static final SubLSymbol $sym64$_CSETF_SQLC_ERROR_HANDLING = makeSymbol("_CSETF-SQLC-ERROR-HANDLING");
  public static final SubLSymbol $sym65$SQLC_TICKETS = makeSymbol("SQLC-TICKETS");
  public static final SubLSymbol $sym66$_CSETF_SQLC_TICKETS = makeSymbol("_CSETF-SQLC-TICKETS");
  public static final SubLSymbol $sym67$SQLC_MAILMAN = makeSymbol("SQLC-MAILMAN");
  public static final SubLSymbol $sym68$_CSETF_SQLC_MAILMAN = makeSymbol("_CSETF-SQLC-MAILMAN");
  public static final SubLSymbol $kw69$DB = makeKeyword("DB");
  public static final SubLSymbol $kw70$USER = makeKeyword("USER");
  public static final SubLSymbol $kw71$DBMS_SERVER = makeKeyword("DBMS-SERVER");
  public static final SubLSymbol $kw72$PORT = makeKeyword("PORT");
  public static final SubLSymbol $kw73$CHANNEL = makeKeyword("CHANNEL");
  public static final SubLSymbol $kw74$STATEMENTS = makeKeyword("STATEMENTS");
  public static final SubLSymbol $kw75$LOCK = makeKeyword("LOCK");
  public static final SubLSymbol $kw76$SUBPROTOCOL = makeKeyword("SUBPROTOCOL");
  public static final SubLSymbol $kw77$PROXY_SERVER = makeKeyword("PROXY-SERVER");
  public static final SubLSymbol $kw78$ERROR_HANDLING = makeKeyword("ERROR-HANDLING");
  public static final SubLSymbol $kw79$TICKETS = makeKeyword("TICKETS");
  public static final SubLSymbol $kw80$MAILMAN = makeKeyword("MAILMAN");
  public static final SubLString $str81$Invalid_slot__S_for_construction_ = makeString("Invalid slot ~S for construction function");
  public static final SubLString $str82$__SQL_CONNECTION_ = makeString("#<SQL-CONNECTION ");
  public static final SubLString $str83$closed_ = makeString("closed ");
  public static final SubLString $str84$to_ = makeString("to ");
  public static final SubLString $str85$__ = makeString(" [");
  public static final SubLString $str86$_ = makeString("/");
  public static final SubLString $str87$__ = makeString("]>");
  public static final SubLList $list88 = list(makeSymbol("&KEY"), list(makeSymbol("DBMS-SERVER"), makeSymbol("*DBMS-SERVER*")), list(makeSymbol("SUBPROTOCOL"), makeSymbol("*SQL-SUBPROTOCOL*")), list(makeSymbol("PROXY-SERVER"), makeSymbol("DBMS-SERVER")), list(makeSymbol("PORT"), makeSymbol("*SQL-PORT*")), list(makeSymbol("TIMEOUT"), makeSymbol("*SQL-CONNECTION-TIMEOUT*")));
  public static final SubLList $list89 = list(makeKeyword("DBMS-SERVER"), makeKeyword("SUBPROTOCOL"), makeKeyword("PROXY-SERVER"), makeKeyword("PORT"), makeKeyword("TIMEOUT"));
  public static final SubLSymbol $kw90$ALLOW_OTHER_KEYS = makeKeyword("ALLOW-OTHER-KEYS");
  public static final SubLSymbol $kw91$TIMEOUT = makeKeyword("TIMEOUT");
  public static final SubLSymbol $sym92$INTEGERP = makeSymbol("INTEGERP");
  public static final SubLSymbol $sym93$NON_NEGATIVE_NUMBER_P = makeSymbol("NON-NEGATIVE-NUMBER-P");
  public static final SubLString $str94$SQL_connection_lock = makeString("SQL connection lock");
  public static final SubLSymbol $kw95$RETURN = makeKeyword("RETURN");
  public static final SubLString $str96$timeout = makeString("timeout");
  public static final SubLSymbol $sym97$SQL_OPEN_CONNECTION_P = makeSymbol("SQL-OPEN-CONNECTION-P");
  public static final SubLSymbol $sym98$BOOLEANP = makeSymbol("BOOLEANP");
  public static final SubLSymbol $sym99$SQL_TRANSACTION_LEVEL_P = makeSymbol("SQL-TRANSACTION-LEVEL-P");
  public static final SubLSymbol $sym100$SQL_TICKET = makeSymbol("SQL-TICKET");
  public static final SubLSymbol $sym101$SQL_TICKET_P = makeSymbol("SQL-TICKET-P");
  public static final SubLList $list102 = list(makeSymbol("SEMAPHORE"), makeSymbol("RESULT"));
  public static final SubLList $list103 = list(makeKeyword("SEMAPHORE"), makeKeyword("RESULT"));
  public static final SubLList $list104 = list(makeSymbol("SQL-TICKET-SEMAPHORE"), makeSymbol("SQL-TICKET-RESULT"));
  public static final SubLList $list105 = list(makeSymbol("_CSETF-SQL-TICKET-SEMAPHORE"), makeSymbol("_CSETF-SQL-TICKET-RESULT"));
  public static final SubLSymbol $sym106$DEFAULT_STRUCT_PRINT_FUNCTION = makeSymbol("DEFAULT-STRUCT-PRINT-FUNCTION");
  public static final SubLSymbol $sym107$SQL_TICKET_PRINT_FUNCTION_TRAMPOLINE = makeSymbol("SQL-TICKET-PRINT-FUNCTION-TRAMPOLINE");
  public static final SubLSymbol $sym108$SQL_TICKET_SEMAPHORE = makeSymbol("SQL-TICKET-SEMAPHORE");
  public static final SubLSymbol $sym109$_CSETF_SQL_TICKET_SEMAPHORE = makeSymbol("_CSETF-SQL-TICKET-SEMAPHORE");
  public static final SubLSymbol $sym110$SQL_TICKET_RESULT = makeSymbol("SQL-TICKET-RESULT");
  public static final SubLSymbol $sym111$_CSETF_SQL_TICKET_RESULT = makeSymbol("_CSETF-SQL-TICKET-RESULT");
  public static final SubLSymbol $kw112$SEMAPHORE = makeKeyword("SEMAPHORE");
  public static final SubLSymbol $kw113$RESULT = makeKeyword("RESULT");
  public static final SubLString $str114$SQL_Request = makeString("SQL Request");
  public static final SubLString $str115$SQL_Mailman_for_ = makeString("SQL Mailman for ");
  public static final SubLSymbol $sym116$SQLC_DELIVER = makeSymbol("SQLC-DELIVER");
  public static final SubLString $str117$Implementation_error__no_ticket_f = makeString("Implementation error: no ticket for result ~a");
  public static final SubLSymbol $kw118$THROW = makeKeyword("THROW");
  public static final SubLSymbol $kw119$WARN = makeKeyword("WARN");
  public static final SubLSymbol $sym120$SDBC_ERROR_HANDLING_TAG_P = makeSymbol("SDBC-ERROR-HANDLING-TAG-P");
  public static final SubLList $list121 = list(makeKeyword("TRANSACTION-NONE"), makeKeyword("TRANSACTION-READ-COMMITTED"), makeKeyword("TRANSACTION-READ-UNCOMMITTED"), makeKeyword("TRANSACTION-REPEATABLE-READ"), makeKeyword("TRANSACTION-SERIALIZABLE"));
  public static final SubLSymbol $sym122$SQLC_SET_ERROR_HANDLING = makeSymbol("SQLC-SET-ERROR-HANDLING");
  public static final SubLSymbol $sym123$SQLS_EXECUTE_TRANSACTION = makeSymbol("SQLS-EXECUTE-TRANSACTION");
  public static final SubLSymbol $kw124$STOP = makeKeyword("STOP");
  public static final SubLSymbol $kw125$NULL = makeKeyword("NULL");
  public static final SubLSymbol $sym126$SDBC_ERROR = makeSymbol("SDBC-ERROR");
  public static final SubLSymbol $sym127$SDBC_ERROR_P = makeSymbol("SDBC-ERROR-P");
  public static final SubLList $list128 = list(makeSymbol("TYPE"), makeSymbol("MESSAGE"), makeSymbol("CODE"));
  public static final SubLList $list129 = list(makeKeyword("TYPE"), makeKeyword("MESSAGE"), makeKeyword("CODE"));
  public static final SubLList $list130 = list(makeSymbol("SDBC-ERROR-TYPE"), makeSymbol("SDBC-ERROR-MESSAGE"), makeSymbol("SDBC-ERROR-CODE"));
  public static final SubLList $list131 = list(makeSymbol("_CSETF-SDBC-ERROR-TYPE"), makeSymbol("_CSETF-SDBC-ERROR-MESSAGE"), makeSymbol("_CSETF-SDBC-ERROR-CODE"));
  public static final SubLSymbol $sym132$SDBC_ERROR_PRINT = makeSymbol("SDBC-ERROR-PRINT");
  public static final SubLSymbol $sym133$SDBC_ERROR_PRINT_FUNCTION_TRAMPOLINE = makeSymbol("SDBC-ERROR-PRINT-FUNCTION-TRAMPOLINE");
  public static final SubLSymbol $sym134$SDBC_ERROR_TYPE = makeSymbol("SDBC-ERROR-TYPE");
  public static final SubLSymbol $sym135$_CSETF_SDBC_ERROR_TYPE = makeSymbol("_CSETF-SDBC-ERROR-TYPE");
  public static final SubLSymbol $sym136$SDBC_ERROR_MESSAGE = makeSymbol("SDBC-ERROR-MESSAGE");
  public static final SubLSymbol $sym137$_CSETF_SDBC_ERROR_MESSAGE = makeSymbol("_CSETF-SDBC-ERROR-MESSAGE");
  public static final SubLSymbol $sym138$SDBC_ERROR_CODE = makeSymbol("SDBC-ERROR-CODE");
  public static final SubLSymbol $sym139$_CSETF_SDBC_ERROR_CODE = makeSymbol("_CSETF-SDBC-ERROR-CODE");
  public static final SubLSymbol $kw140$TYPE = makeKeyword("TYPE");
  public static final SubLSymbol $kw141$MESSAGE = makeKeyword("MESSAGE");
  public static final SubLSymbol $kw142$CODE = makeKeyword("CODE");
  public static final SubLString $str143$_a = makeString("~a");
  public static final SubLString $str144$SDBC__a___a = makeString("SDBC ~a: ~a");
  public static final SubLString $str145$__SDBC = makeString("#<SDBC");
  public static final SubLString $str146$_ERROR__ = makeString("-ERROR: ");
  public static final SubLString $str147$_ = makeString(">");
  public static final SubLString $str148$_IO = makeString("-IO");
  public static final SubLString $str149$_SQL = makeString("-SQL");
  public static final SubLString $str150$ = makeString("");
  public static final SubLString $str151$_CLIENT = makeString("-CLIENT");
  public static final SubLString $str152$_TRANSACTION = makeString("-TRANSACTION");
  public static final SubLString $str153$_ROLLBACK = makeString("-ROLLBACK");
  public static final SubLString $str154$_BATCH_UPDATE = makeString("-BATCH-UPDATE");
  public static final SubLSymbol $sym155$SQL_RESULT_SET = makeSymbol("SQL-RESULT-SET");
  public static final SubLSymbol $sym156$SQL_RESULT_SET_P = makeSymbol("SQL-RESULT-SET-P");
  public static final SubLList $list157 = list(makeSymbol("ROWS"), makeSymbol("CURRENT"), makeSymbol("LAST"), makeSymbol("START"), makeSymbol("CONNECTION"), makeSymbol("BLOCK-SIZE"), makeSymbol("ID"));
  public static final SubLList $list158 = list(makeKeyword("ROWS"), makeKeyword("CURRENT"), makeKeyword("LAST"), makeKeyword("START"), makeKeyword("CONNECTION"), makeKeyword("BLOCK-SIZE"), makeKeyword("ID"));
  public static final SubLList $list159 = list(makeSymbol("SQLRS-ROWS"), makeSymbol("SQLRS-CURRENT"), makeSymbol("SQLRS-LAST"), makeSymbol("SQLRS-START"), makeSymbol("SQLRS-CONNECTION"), makeSymbol("SQLRS-BLOCK-SIZE"), makeSymbol("SQLRS-ID"));
  public static final SubLList $list160 = list(makeSymbol("_CSETF-SQLRS-ROWS"), makeSymbol("_CSETF-SQLRS-CURRENT"), makeSymbol("_CSETF-SQLRS-LAST"), makeSymbol("_CSETF-SQLRS-START"), makeSymbol("_CSETF-SQLRS-CONNECTION"), makeSymbol("_CSETF-SQLRS-BLOCK-SIZE"), makeSymbol("_CSETF-SQLRS-ID"));
  public static final SubLSymbol $sym161$SQLRS_PRINT = makeSymbol("SQLRS-PRINT");
  public static final SubLSymbol $sym162$SQL_RESULT_SET_PRINT_FUNCTION_TRAMPOLINE = makeSymbol("SQL-RESULT-SET-PRINT-FUNCTION-TRAMPOLINE");
  public static final SubLSymbol $sym163$SQLRS_ROWS = makeSymbol("SQLRS-ROWS");
  public static final SubLSymbol $sym164$_CSETF_SQLRS_ROWS = makeSymbol("_CSETF-SQLRS-ROWS");
  public static final SubLSymbol $sym165$SQLRS_CURRENT = makeSymbol("SQLRS-CURRENT");
  public static final SubLSymbol $sym166$_CSETF_SQLRS_CURRENT = makeSymbol("_CSETF-SQLRS-CURRENT");
  public static final SubLSymbol $sym167$SQLRS_LAST = makeSymbol("SQLRS-LAST");
  public static final SubLSymbol $sym168$_CSETF_SQLRS_LAST = makeSymbol("_CSETF-SQLRS-LAST");
  public static final SubLSymbol $sym169$SQLRS_START = makeSymbol("SQLRS-START");
  public static final SubLSymbol $sym170$_CSETF_SQLRS_START = makeSymbol("_CSETF-SQLRS-START");
  public static final SubLSymbol $sym171$SQLRS_CONNECTION = makeSymbol("SQLRS-CONNECTION");
  public static final SubLSymbol $sym172$_CSETF_SQLRS_CONNECTION = makeSymbol("_CSETF-SQLRS-CONNECTION");
  public static final SubLSymbol $sym173$SQLRS_BLOCK_SIZE = makeSymbol("SQLRS-BLOCK-SIZE");
  public static final SubLSymbol $sym174$_CSETF_SQLRS_BLOCK_SIZE = makeSymbol("_CSETF-SQLRS-BLOCK-SIZE");
  public static final SubLSymbol $sym175$SQLRS_ID = makeSymbol("SQLRS-ID");
  public static final SubLSymbol $sym176$_CSETF_SQLRS_ID = makeSymbol("_CSETF-SQLRS-ID");
  public static final SubLSymbol $kw177$ROWS = makeKeyword("ROWS");
  public static final SubLSymbol $kw178$CURRENT = makeKeyword("CURRENT");
  public static final SubLSymbol $kw179$LAST = makeKeyword("LAST");
  public static final SubLSymbol $kw180$START = makeKeyword("START");
  public static final SubLSymbol $kw181$CONNECTION = makeKeyword("CONNECTION");
  public static final SubLSymbol $kw182$BLOCK_SIZE = makeKeyword("BLOCK-SIZE");
  public static final SubLSymbol $kw183$ID = makeKeyword("ID");
  public static final SubLString $str184$__ = makeString("#<");
  public static final SubLSymbol $kw185$STREAM = makeKeyword("STREAM");
  public static final SubLString $str186$_ = makeString("(");
  public static final SubLString $str187$_row__ = makeString(" row, ");
  public static final SubLString $str188$_rows__ = makeString(" rows, ");
  public static final SubLString $str189$_column_ = makeString(" column)");
  public static final SubLString $str190$_columns_ = makeString(" columns)");
  public static final SubLString $str191$closed = makeString("closed");
  public static final SubLSymbol $kw192$BASE = makeKeyword("BASE");
  public static final SubLSymbol $sym193$SQL_OPEN_RESULT_SET_P = makeSymbol("SQL-OPEN-RESULT-SET-P");
  public static final SubLString $str194$cursor_not_on_valid_row = makeString("cursor not on valid row");
  public static final SubLString $str195$invalid_column__a = makeString("invalid column ~a");
  public static final SubLSymbol $sym196$NON_NEGATIVE_INTEGER_P = makeSymbol("NON-NEGATIVE-INTEGER-P");
  public static final SubLSymbol $sym197$VECTORP = makeSymbol("VECTORP");
  public static final SubLString $str198$invalid_row__a = makeString("invalid row ~a");
  public static final SubLSymbol $sym199$SQL_STATEMENT = makeSymbol("SQL-STATEMENT");
  public static final SubLSymbol $sym200$SQL_STATEMENT_P = makeSymbol("SQL-STATEMENT-P");
  public static final SubLList $list201 = list(makeSymbol("CONNECTION"), makeSymbol("ID"), makeSymbol("SQL"), makeSymbol("SETTINGS"), makeSymbol("BATCH"), makeSymbol("RS"));
  public static final SubLList $list202 = list(makeKeyword("CONNECTION"), makeKeyword("ID"), makeKeyword("SQL"), makeKeyword("SETTINGS"), makeKeyword("BATCH"), makeKeyword("RS"));
  public static final SubLList $list203 = list(makeSymbol("SQLS-CONNECTION"), makeSymbol("SQLS-ID"), makeSymbol("SQLS-SQL"), makeSymbol("SQLS-SETTINGS"), makeSymbol("SQLS-BATCH"), makeSymbol("SQLS-RS"));
  public static final SubLList $list204 = list(makeSymbol("_CSETF-SQLS-CONNECTION"), makeSymbol("_CSETF-SQLS-ID"), makeSymbol("_CSETF-SQLS-SQL"), makeSymbol("_CSETF-SQLS-SETTINGS"), makeSymbol("_CSETF-SQLS-BATCH"), makeSymbol("_CSETF-SQLS-RS"));
  public static final SubLSymbol $sym205$SQL_STATEMENT_PRINT_FUNCTION_TRAMPOLINE = makeSymbol("SQL-STATEMENT-PRINT-FUNCTION-TRAMPOLINE");
  public static final SubLSymbol $sym206$SQLS_CONNECTION = makeSymbol("SQLS-CONNECTION");
  public static final SubLSymbol $sym207$_CSETF_SQLS_CONNECTION = makeSymbol("_CSETF-SQLS-CONNECTION");
  public static final SubLSymbol $sym208$SQLS_ID = makeSymbol("SQLS-ID");
  public static final SubLSymbol $sym209$_CSETF_SQLS_ID = makeSymbol("_CSETF-SQLS-ID");
  public static final SubLSymbol $sym210$SQLS_SQL = makeSymbol("SQLS-SQL");
  public static final SubLSymbol $sym211$_CSETF_SQLS_SQL = makeSymbol("_CSETF-SQLS-SQL");
  public static final SubLSymbol $sym212$SQLS_SETTINGS = makeSymbol("SQLS-SETTINGS");
  public static final SubLSymbol $sym213$_CSETF_SQLS_SETTINGS = makeSymbol("_CSETF-SQLS-SETTINGS");
  public static final SubLSymbol $sym214$SQLS_BATCH = makeSymbol("SQLS-BATCH");
  public static final SubLSymbol $sym215$_CSETF_SQLS_BATCH = makeSymbol("_CSETF-SQLS-BATCH");
  public static final SubLSymbol $sym216$SQLS_RS = makeSymbol("SQLS-RS");
  public static final SubLSymbol $sym217$_CSETF_SQLS_RS = makeSymbol("_CSETF-SQLS-RS");
  public static final SubLSymbol $kw218$SQL = makeKeyword("SQL");
  public static final SubLSymbol $kw219$SETTINGS = makeKeyword("SETTINGS");
  public static final SubLSymbol $kw220$BATCH = makeKeyword("BATCH");
  public static final SubLSymbol $kw221$RS = makeKeyword("RS");
  public static final SubLSymbol $sym222$SQL_OPEN_STATEMENT_P = makeSymbol("SQL-OPEN-STATEMENT-P");
  public static final SubLSymbol $sym223$SQL_PREPARED_OPEN_STATEMENT_P = makeSymbol("SQL-PREPARED-OPEN-STATEMENT-P");
  public static final SubLSymbol $sym224$BYTE_VECTOR_P = makeSymbol("BYTE-VECTOR-P");
  public static final SubLSymbol $sym225$JAVA_INTEGERP = makeSymbol("JAVA-INTEGERP");
  public static final SubLSymbol $sym226$JAVA_LONGP = makeSymbol("JAVA-LONGP");
  public static final SubLSymbol $sym227$JAVA_FLOATP = makeSymbol("JAVA-FLOATP");
  public static final SubLSymbol $sym228$JAVA_DOUBLEP = makeSymbol("JAVA-DOUBLEP");
  public static final SubLSymbol $sym229$SQLS_GET_CONNECTION = makeSymbol("SQLS-GET-CONNECTION");
  public static final SubLString $str230$STMT = makeString("STMT");
  public static final SubLString $str231$RS = makeString("RS");
  public static final SubLSymbol $sym232$LISTP = makeSymbol("LISTP");
  public static final SubLSymbol $sym233$SQLC_GET_TABLES = makeSymbol("SQLC-GET-TABLES");
  public static final SubLString $str234$SQLC_error___A = makeString("SQLC error: ~A");
  public static final SubLList $list235 = list(new SubLObject[] {makeKeyword("TABLE-CAT"), makeKeyword("TABLE-SCHEM"), makeKeyword("TABLE-NAME"), makeKeyword("TABLE-TYPE"), makeKeyword("REMARKS"), makeKeyword("TYPE-CAT"), makeKeyword("TYPE-SCHEM"), makeKeyword("TYPE-NAME"), makeKeyword("SELF-REFERENCING-COL-NAME"), makeKeyword("REF-GENERATION")});
  public static final SubLSymbol $sym236$SQLC_GET_COLUMNS = makeSymbol("SQLC-GET-COLUMNS");
  public static final SubLList $list237 = list(new SubLObject[] {makeKeyword("TABLE-CAT"), makeKeyword("TABLE-SCHEM"), makeKeyword("TABLE-NAME"), makeKeyword("COLUMN-NAME"), makeKeyword("DATA-TYPE"), makeKeyword("TYPE-NAME"), makeKeyword("COLUMN-SIZE"), makeKeyword("BUFFER-LENGTH"), makeKeyword("DECIMAL-DIGITS"), makeKeyword("NUM-PREC-RADIX"), makeKeyword("NULLABLE"), makeKeyword("REMARKS"), makeKeyword("COLUMN-DEF"), makeKeyword("SQL-DATA-TYPE"), makeKeyword("SQL-DATETIME-SUB"), makeKeyword("CHAR-OCTET-LENGTH"), makeKeyword("ORDINAL-POSITION"), makeKeyword("IS-NULLABLE"), makeKeyword("SCOPE-CATLOG"), makeKeyword("SCOPE-SCHEMA"), makeKeyword("SCOPE-TABLE"), makeKeyword("SOURCE-DATA-TYPE")});
  public static final SubLSymbol $sym238$SQLC_GET_PRIMARY_KEYS = makeSymbol("SQLC-GET-PRIMARY-KEYS");
  public static final SubLList $list239 = list(makeKeyword("TABLE-CAT"), makeKeyword("TABLE-SCHEM"), makeKeyword("TABLE-NAME"), makeKeyword("COLUMN-NAME"), makeKeyword("KEY-SEQ"), makeKeyword("PK-NAME"));
  public static final SubLSymbol $sym240$SQLC_GET_IMPORTED_KEYS = makeSymbol("SQLC-GET-IMPORTED-KEYS");
  public static final SubLList $list241 = list(new SubLObject[] {makeKeyword("PKTABLE-CAT"), makeKeyword("PKTABLE-SCHEM"), makeKeyword("PKTABLE-NAME"), makeKeyword("PKCOLUMN-NAME"), makeKeyword("FKTABLE-CAT"), makeKeyword("FKTABLE-SCHEM"), makeKeyword("FKTABLE-NAME"), makeKeyword("FKCOLUMN-NAME"), makeKeyword("KEY-SEQ"), makeKeyword("UPDATE-RULE"), makeKeyword("DELETE-RULE"), makeKeyword("FK-NAME"), makeKeyword("PK-NAME"), makeKeyword("DEFERRABILITY")});
  public static final SubLSymbol $sym242$SQLC_GET_EXPORTED_KEYS = makeSymbol("SQLC-GET-EXPORTED-KEYS");
  public static final SubLSymbol $sym243$SQLC_GET_INDEX_INFO = makeSymbol("SQLC-GET-INDEX-INFO");
  public static final SubLList $list244 = list(new SubLObject[] {makeKeyword("TABLE-CAT"), makeKeyword("TABLE-SCHEM"), makeKeyword("TABLE-NAME"), makeKeyword("NON-UNIQUE"), makeKeyword("INDEX-QUALIFIER"), makeKeyword("INDEX-NAME"), makeKeyword("TYPE"), makeKeyword("ORDINAL-POSITION"), makeKeyword("COLUMN-NAME"), makeKeyword("ASC-OR-DESC"), makeKeyword("CARDINALITY"), makeKeyword("PAGES"), makeKeyword("FILTER-CONDITION")});
  public static final SubLList $list245 = list(makeKeyword("RETURN"), makeKeyword("THROW"), makeKeyword("WARN"));
  public static final SubLString $str246$_a__a____a__a_user__a_password__a = makeString("~a:~a://~a/~a?user=~a&password=~a&charSet=ASCII");
  public static final SubLString $str247$mysql = makeString("mysql");
  public static final SubLString $str248$_a__a____a__a_user__a_password__a = makeString("~a:~a://~a/~a?user=~a&password=~a");
  public static final SubLString $str249$oracle = makeString("oracle");
  public static final SubLString $str250$_a__a_thin__a__a____a_1521__a = makeString("~a:~a:thin:~a/~a@//~a:1521/~a");
  public static final SubLString $str251$sqlserver = makeString("sqlserver");
  public static final SubLString $str252$_a__a__a____a_1433_DatabaseName__ = makeString("~a:~a:~a://~a:1433;DatabaseName=~a;SelectMethod=cursor;USER=~a;PASSWORD=~a");
  public static final SubLString $str253$microsoft = makeString("microsoft");
  public static final SubLString $str254$odbc = makeString("odbc");
  public static final SubLString $str255$_a__a__a_UID__a_PWD__a = makeString("~a:~a:~a;UID=~a;PWD=~a");
  public static final SubLString $str256$sybase = makeString("sybase");
  public static final SubLString $str257$_a__a__a____a__a_USER__a_PASSWORD = makeString("~a:~a:~a://~a/~a;USER=~a;PASSWORD=~a");
  public static final SubLString $str258$jtds = makeString("jtds");
  public static final SubLString $str259$com_cyc_ = makeString("com.cyc.");
  public static final SubLString $str260$_a__a__a = makeString("~a:~a:~a");
  public static final SubLString $str261$unknown_jdbc_subprotocol___a = makeString("unknown jdbc subprotocol: ~a");
  public static final SubLInteger $int262$_2147483649 = makeInteger("-2147483649");
  public static final SubLInteger $int263$2147483648 = makeInteger("2147483648");
  public static final SubLInteger $int264$_9223372036854775809 = makeInteger("-9223372036854775809");
  public static final SubLInteger $int265$9223372036854775808 = makeInteger("9223372036854775808");
  public static final SubLList $list266 = list(list(new SubLObject[] {makeSymbol("CONNECTION"), makeSymbol("DB"), makeSymbol("USER"), makeSymbol("PASSWORD"), makeSymbol("&KEY"), list(makeSymbol("DBMS-SERVER"), list(makeSymbol("QUOTE"), makeSymbol("*DBMS-SERVER*"))), list(makeSymbol("PORT"), list(makeSymbol("QUOTE"), makeSymbol("*SQL-PORT*"))), list(makeSymbol("SUBPROTOCOL"), list(makeSymbol("QUOTE"), makeSymbol("*SQL-SUBPROTOCOL*"))), list(makeSymbol("PROXY-SERVER"), makeSymbol("DBMS-SERVER")), list(makeSymbol("TIMEOUT"), list(makeSymbol("QUOTE"), makeSymbol("*SQL-CONNECTION-TIMEOUT*")))}), makeSymbol("&BODY"), makeSymbol("BODY"));
  public static final SubLList $list267 = list(makeKeyword("DBMS-SERVER"), makeKeyword("PORT"), makeKeyword("SUBPROTOCOL"), makeKeyword("PROXY-SERVER"), makeKeyword("TIMEOUT"));
  public static final SubLSymbol $sym268$_SQL_SUBPROTOCOL_ = makeSymbol("*SQL-SUBPROTOCOL*");
  public static final SubLSymbol $sym269$_SQL_CONNECTION_TIMEOUT_ = makeSymbol("*SQL-CONNECTION-TIMEOUT*");
  public static final SubLSymbol $sym270$CLET = makeSymbol("CLET");
  public static final SubLSymbol $sym271$CUNWIND_PROTECT = makeSymbol("CUNWIND-PROTECT");
  public static final SubLSymbol $sym272$PROGN = makeSymbol("PROGN");
  public static final SubLSymbol $sym273$CSETQ = makeSymbol("CSETQ");
  public static final SubLSymbol $sym274$NEW_SQL_CONNECTION = makeSymbol("NEW-SQL-CONNECTION");
  public static final SubLSymbol $sym275$LIST = makeSymbol("LIST");
  public static final SubLSymbol $sym276$PWHEN = makeSymbol("PWHEN");
  public static final SubLSymbol $sym277$SQLC_CLOSE = makeSymbol("SQLC-CLOSE");
  public static final SubLList $list278 = list(list(new SubLObject[] {makeSymbol("STATEMENT"), makeSymbol("DB"), makeSymbol("USER"), makeSymbol("PASSWORD"), makeSymbol("&KEY"), list(makeSymbol("DBMS-SERVER"), list(makeSymbol("QUOTE"), makeSymbol("*DBMS-SERVER*"))), list(makeSymbol("PORT"), list(makeSymbol("QUOTE"), makeSymbol("*SQL-PORT*"))), list(makeSymbol("SUBPROTOCOL"), list(makeSymbol("QUOTE"), makeSymbol("*SQL-SUBPROTOCOL*"))), list(makeSymbol("PROXY-SERVER"), makeSymbol("DBMS-SERVER")), list(makeSymbol("TIMEOUT"), list(makeSymbol("QUOTE"), makeSymbol("*SQL-CONNECTION-TIMEOUT*")))}), makeSymbol("&BODY"), makeSymbol("BODY"));
  public static final SubLSymbol $sym279$CONNECTION = makeUninternedSymbol("CONNECTION");
  public static final SubLSymbol $sym280$WITH_SQL_CONNECTION = makeSymbol("WITH-SQL-CONNECTION");
  public static final SubLSymbol $sym281$PIF = makeSymbol("PIF");
  public static final SubLSymbol $sym282$SQLC_CREATE_STATEMENT = makeSymbol("SQLC-CREATE-STATEMENT");
  public static final SubLList $list283 = list(list(new SubLObject[] {makeSymbol("STATEMENT"), makeSymbol("SQL"), makeSymbol("DB"), makeSymbol("USER"), makeSymbol("PASSWORD"), makeSymbol("&KEY"), list(makeSymbol("DBMS-SERVER"), list(makeSymbol("QUOTE"), makeSymbol("*DBMS-SERVER*"))), list(makeSymbol("PORT"), list(makeSymbol("QUOTE"), makeSymbol("*SQL-PORT*"))), list(makeSymbol("SUBPROTOCOL"), list(makeSymbol("QUOTE"), makeSymbol("*SQL-SUBPROTOCOL*"))), list(makeSymbol("PROXY-SERVER"), makeSymbol("DBMS-SERVER")), list(makeSymbol("TIMEOUT"), list(makeSymbol("QUOTE"), makeSymbol("*SQL-CONNECTION-TIMEOUT*")))}), makeSymbol("&BODY"), makeSymbol("BODY"));
  public static final SubLSymbol $sym284$CONNECTION = makeUninternedSymbol("CONNECTION");
  public static final SubLSymbol $sym285$SQLC_PREPARE_STATEMENT = makeSymbol("SQLC-PREPARE-STATEMENT");
  public static final SubLList $list286 = list(list(makeSymbol("STATEMENT"), makeSymbol("ERROR")), makeSymbol("&BODY"), makeSymbol("BODY"));
  public static final SubLSymbol $sym287$CONNECTION = makeUninternedSymbol("CONNECTION");
  public static final SubLSymbol $sym288$AUTO_COMMIT = makeUninternedSymbol("AUTO-COMMIT");
  public static final SubLSymbol $sym289$COMMIT_ERROR = makeUninternedSymbol("COMMIT-ERROR");
  public static final SubLSymbol $sym290$ROLLBACK_RESULT = makeUninternedSymbol("ROLLBACK-RESULT");
  public static final SubLSymbol $sym291$AUTO_COMMIT_RESULT = makeUninternedSymbol("AUTO-COMMIT-RESULT");
  public static final SubLSymbol $sym292$ERRORS = makeUninternedSymbol("ERRORS");
  public static final SubLSymbol $sym293$SQLC_GET_AUTO_COMMIT = makeSymbol("SQLC-GET-AUTO-COMMIT");
  public static final SubLSymbol $sym294$CPUSH = makeSymbol("CPUSH");
  public static final SubLList $list295 = list(makeKeyword("THROW"));
  public static final SubLSymbol $sym296$CATCH_ERROR_MESSAGE = makeSymbol("CATCH-ERROR-MESSAGE");
  public static final SubLSymbol $sym297$SQLC_SET_AUTO_COMMIT = makeSymbol("SQLC-SET-AUTO-COMMIT");
  public static final SubLList $list298 = list(NIL);
  public static final SubLSymbol $sym299$SQLC_COMMIT = makeSymbol("SQLC-COMMIT");
  public static final SubLList $list300 = list(makeKeyword("RETURN"));
  public static final SubLSymbol $sym301$SQLS_HANDLE_COMMIT_ERROR = makeSymbol("SQLS-HANDLE-COMMIT-ERROR");
  public static final SubLSymbol $sym302$SQLS_HANDLE_ROLLBACK = makeSymbol("SQLS-HANDLE-ROLLBACK");
  public static final SubLList $list303 = list(T);
  public static final SubLSymbol $sym304$SQLS_HANDLE_TRANSACTION_ERRORS = makeSymbol("SQLS-HANDLE-TRANSACTION-ERRORS");
  public static final SubLString $str305$An_unknown_error_occurred_during_ = makeString("An unknown error occurred during execution");
  public static final SubLList $list306 = list(list(new SubLObject[] {makeSymbol("STATEMENT"), makeSymbol("ERROR"), makeSymbol("DB"), makeSymbol("USER"), makeSymbol("PASSWORD"), makeSymbol("&KEY"), list(makeSymbol("DBMS-SERVER"), list(makeSymbol("QUOTE"), makeSymbol("*DBMS-SERVER*"))), list(makeSymbol("PORT"), list(makeSymbol("QUOTE"), makeSymbol("*SQL-PORT*"))), list(makeSymbol("SUBPROTOCOL"), list(makeSymbol("QUOTE"), makeSymbol("*SQL-SUBPROTOCOL*"))), list(makeSymbol("PROXY-SERVER"), makeSymbol("DBMS-SERVER")), list(makeSymbol("TIMEOUT"), list(makeSymbol("QUOTE"), makeSymbol("*SQL-CONNECTION-TIMEOUT*")))}), makeSymbol("&BODY"), makeSymbol("BODY"));
  public static final SubLSymbol $sym307$WITH_SQL_STATEMENT = makeSymbol("WITH-SQL-STATEMENT");
  public static final SubLList $list308 = list(list(new SubLObject[] {makeSymbol("RS"), makeSymbol("QUERY"), makeSymbol("DB"), makeSymbol("USER"), makeSymbol("PASSWORD"), makeSymbol("&KEY"), list(makeSymbol("DBMS-SERVER"), list(makeSymbol("QUOTE"), makeSymbol("*DBMS-SERVER*"))), list(makeSymbol("PORT"), list(makeSymbol("QUOTE"), makeSymbol("*SQL-PORT*"))), list(makeSymbol("SUBPROTOCOL"), list(makeSymbol("QUOTE"), makeSymbol("*SQL-SUBPROTOCOL*"))), list(makeSymbol("PROXY-SERVER"), makeSymbol("DBMS-SERVER")), list(makeSymbol("TIMEOUT"), list(makeSymbol("QUOTE"), makeSymbol("*SQL-CONNECTION-TIMEOUT*")))}), makeSymbol("&BODY"), makeSymbol("BODY"));
  public static final SubLSymbol $sym309$STATEMENT = makeUninternedSymbol("STATEMENT");
  public static final SubLSymbol $sym310$RS = makeSymbol("RS");
  public static final SubLSymbol $sym311$SQLS_EXECUTE_QUERY = makeSymbol("SQLS-EXECUTE-QUERY");
  public static final SubLSymbol $sym312$WITH_SQL_RESULT_SET = makeSymbol("WITH-SQL-RESULT-SET");
  public static final SubLSymbol $sym313$WHILE = makeSymbol("WHILE");
  public static final SubLSymbol $sym314$SQLRS_NEXT = makeSymbol("SQLRS-NEXT");
  public static final SubLSymbol $sym315$OUTPUT_STREAM_P = makeSymbol("OUTPUT-STREAM-P");
  public static final SubLString $str316$SELECT___FROM_ = makeString("SELECT * FROM ");
  public static final SubLList $list317 = list(Characters.CHAR_period);
  public static final SubLString $str318$INSERT_INTO__a_VALUES______ = makeString("INSERT INTO ~a VALUES(?, ?)");
  public static final SubLString $str319$SELECT_number2_FROM__a_WHERE_numb = makeString("SELECT number2 FROM ~a WHERE number1 = ?");
  public static final SubLString $str320$CREATE_TABLE_ = makeString("CREATE TABLE ");
  public static final SubLString $str321$__number1_INT_PRIMARY_KEY__number = makeString(" (number1 INT PRIMARY KEY, number2 INT)");
  public static final SubLString $str322$validation_failed_for__a__result_ = makeString("validation failed for ~a: result ~a");
  public static final SubLString $str323$DROP_TABLE_ = makeString("DROP TABLE ");
  public static final SubLString $str324$INSERT_INTO_ = makeString("INSERT INTO ");
  public static final SubLString $str325$_VALUES_ = makeString(" VALUES(");
  public static final SubLString $str326$__ = makeString(", ");
  public static final SubLString $str327$_ = makeString(")");
  public static final SubLString $str328$SELECT_number2_FROM_ = makeString("SELECT number2 FROM ");
  public static final SubLString $str329$_WHERE_number1___ = makeString(" WHERE number1 = ");

  //// Initializers

  public void declareFunctions() {
    declare_sdbc_file();
  }

  public void initializeVariables() {
    init_sdbc_file();
  }

  public void runTopLevelForms() {
    setup_sdbc_file();
  }

}
