/**
 *
 */
/**
 * //
 */
/**
 *
 */
/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 */
package com.cyc.cycjava.cycl;

import static com.cyc.cycjava.cycl.access_macros.register_external_symbol;
import static com.cyc.cycjava.cycl.access_macros.register_macro_helper;
import static com.cyc.cycjava.cycl.cfasl.cfasl_input;
import static com.cyc.cycjava.cycl.cfasl.cfasl_output;
import static com.cyc.cycjava.cycl.cyc_testing.generic_testing.define_test_case_table_int;
import static com.cyc.cycjava.cycl.format_nil.format_nil_a_no_copy;
import static com.cyc.cycjava.cycl.number_utilities.f_1X;
import static com.cyc.cycjava.cycl.number_utilities.f_1_;
import static com.cyc.cycjava.cycl.subl_macro_promotions.$catch_error_message_target$;
import static com.cyc.cycjava.cycl.subl_macro_promotions.$with_timeout_nesting_depth$;
import static com.cyc.cycjava.cycl.subl_macro_promotions.$within_with_timeout$;
import static com.cyc.cycjava.cycl.subl_macro_promotions.declare_defglobal;
import static com.cyc.cycjava.cycl.subl_macro_promotions.validate_tcp_connection;
import static com.cyc.cycjava.cycl.subl_macro_promotions.with_timeout_make_tag;
import static com.cyc.cycjava.cycl.subl_macro_promotions.with_timeout_start_timer;
import static com.cyc.cycjava.cycl.subl_macro_promotions.with_timeout_stop_timer;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_greater;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_newline;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_period;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_space;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_tab;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.append;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.cons;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.listS;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.make_list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.set_nth;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.bind;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.currentBinding;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.rebind;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality.eq;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality.eql;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality.identity;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality.pointer;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions.apply;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions.funcall;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Locks.make_lock;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Locks.release_lock;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Locks.seize_lock;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.add;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.floor;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.max;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.min;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.multiply;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.numG;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.numLE;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.subtract;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow.format;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow.write;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.cconcatenate;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.length;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.nreverse;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.remove;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures.def_csetf;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures.makeStructDeclNative;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures.register_method;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.boundp;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.gensym;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.symbol_function;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.symbol_value;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.$is_thread_performing_cleanupP$;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.kill_process;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.booleanp;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.consp;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.floatp;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.integerp;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.listp;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.stringp;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.type_of;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.vectorp;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.getValuesAsVector;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.restoreValuesFromVector;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors.aref;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeBoolean;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeInteger;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeKeyword;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeString;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeSymbol;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeUninternedSymbol;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.cdestructuring_bind_error;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.destructuring_bind_must_consp;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.property_list_member;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.assoc;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.cadr;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.cddr;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.copy_list;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.getf;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.member;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.putf;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.second;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high.$print_object_method_table$;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high.$print_readably$;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high.prin1;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high.prin1_to_string;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high.princ;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high.princ_to_string;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high.print_not_readable;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader.bq_cons;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.close;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.finish_output;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.force_output;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.get_output_stream_string;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.make_private_string_output_stream;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.make_string_output_stream;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.open_stream_p;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.output_stream_p;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.terpri;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.write_char;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.write_string;
import static com.cyc.tool.subl.util.SubLFiles.declareFunction;
import static com.cyc.tool.subl.util.SubLFiles.declareMacro;
import static com.cyc.tool.subl.util.SubLFiles.defconstant;
import static com.cyc.tool.subl.util.SubLFiles.deflexical;
import static com.cyc.tool.subl.util.SubLFiles.defparameter;

import org.armedbear.lisp.Lisp;

import com.cyc.cycjava.cycl.inference.harness.inference_datastructures_inference;
import com.cyc.cycjava.cycl.inference.harness.inference_macros;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Environment;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Semaphores;
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
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.visitation;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.util.SubLFiles.LispMethod;
import com.cyc.tool.subl.util.SubLTrampolineFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 * module:      SDBC
 * source file: /cyc/top/cycl/sdbc.lisp
 * created:     2019/07/03 17:37:16
 */
public final class sdbc extends SubLTranslatedFile implements V12 {
    static private final SubLString $str_alt150$ = makeString("");

    public static final class $sql_ticket_native extends SubLStructNative {
	public SubLStructDecl getStructDecl() {
	    return structDecl;
	}

	public SubLObject getField2() {
	    return com.cyc.cycjava.cycl.sdbc.$sql_ticket_native.this.$semaphore;
	}

	public SubLObject getField3() {
	    return com.cyc.cycjava.cycl.sdbc.$sql_ticket_native.this.$result;
	}

	public SubLObject setField2(SubLObject value) {
	    return com.cyc.cycjava.cycl.sdbc.$sql_ticket_native.this.$semaphore = value;
	}

	public SubLObject setField3(SubLObject value) {
	    return com.cyc.cycjava.cycl.sdbc.$sql_ticket_native.this.$result = value;
	}

	public SubLObject $semaphore = Lisp.NIL;

	public SubLObject $result = Lisp.NIL;

	private static final SubLStructDeclNative structDecl = makeStructDeclNative(com.cyc.cycjava.cycl.sdbc.$sql_ticket_native.class, SQL_TICKET, SQL_TICKET_P, $list_alt102, $list_alt103, new String[] { "$semaphore", "$result" }, $list_alt104, $list_alt105, DEFAULT_STRUCT_PRINT_FUNCTION);
    }

    public static final class $sql_statement_native extends SubLStructNative {
	public SubLStructDecl getStructDecl() {
	    return com.cyc.cycjava.cycl.sdbc.$sql_statement_native.structDecl;
	}

	public SubLObject getField2() {
	    return com.cyc.cycjava.cycl.sdbc.$sql_statement_native.this.$connection;
	}

	public SubLObject getField3() {
	    return com.cyc.cycjava.cycl.sdbc.$sql_statement_native.this.$id;
	}

	public SubLObject getField4() {
	    return com.cyc.cycjava.cycl.sdbc.$sql_statement_native.this.$sql;
	}

	public SubLObject getField5() {
	    return com.cyc.cycjava.cycl.sdbc.$sql_statement_native.this.$settings;
	}

	public SubLObject getField6() {
	    return com.cyc.cycjava.cycl.sdbc.$sql_statement_native.this.$batch;
	}

	public SubLObject getField7() {
	    return com.cyc.cycjava.cycl.sdbc.$sql_statement_native.this.$rs;
	}

	public SubLObject setField2(SubLObject value) {
	    return com.cyc.cycjava.cycl.sdbc.$sql_statement_native.this.$connection = value;
	}

	public SubLObject setField3(SubLObject value) {
	    return com.cyc.cycjava.cycl.sdbc.$sql_statement_native.this.$id = value;
	}

	public SubLObject setField4(SubLObject value) {
	    return com.cyc.cycjava.cycl.sdbc.$sql_statement_native.this.$sql = value;
	}

	public SubLObject setField5(SubLObject value) {
	    return com.cyc.cycjava.cycl.sdbc.$sql_statement_native.this.$settings = value;
	}

	public SubLObject setField6(SubLObject value) {
	    return com.cyc.cycjava.cycl.sdbc.$sql_statement_native.this.$batch = value;
	}

	public SubLObject setField7(SubLObject value) {
	    return com.cyc.cycjava.cycl.sdbc.$sql_statement_native.this.$rs = value;
	}

	public SubLObject $connection = Lisp.NIL;

	public SubLObject $id = Lisp.NIL;

	public SubLObject $sql = Lisp.NIL;

	public SubLObject $settings = Lisp.NIL;

	public SubLObject $batch = Lisp.NIL;

	public SubLObject $rs = Lisp.NIL;

	private static final SubLStructDeclNative structDecl = makeStructDeclNative(com.cyc.cycjava.cycl.sdbc.$sql_statement_native.class, SQL_STATEMENT, SQL_STATEMENT_P, $list_alt201, $list_alt202, new String[] { "$connection", "$id", "$sql", "$settings", "$batch", "$rs" }, $list_alt203,
		$list_alt204, DEFAULT_STRUCT_PRINT_FUNCTION);
    }

    public static final class $sql_connection_native extends SubLStructNative {
	public SubLStructDecl getStructDecl() {
	    return com.cyc.cycjava.cycl.sdbc.$sql_connection_native.structDecl;
	}

	public SubLObject getField2() {
	    return com.cyc.cycjava.cycl.sdbc.$sql_connection_native.this.$db;
	}

	public SubLObject getField3() {
	    return com.cyc.cycjava.cycl.sdbc.$sql_connection_native.this.$user;
	}

	public SubLObject getField4() {
	    return com.cyc.cycjava.cycl.sdbc.$sql_connection_native.this.$dbms_server;
	}

	public SubLObject getField5() {
	    return com.cyc.cycjava.cycl.sdbc.$sql_connection_native.this.$port;
	}

	public SubLObject getField6() {
	    return com.cyc.cycjava.cycl.sdbc.$sql_connection_native.this.$channel;
	}

	public SubLObject getField7() {
	    return com.cyc.cycjava.cycl.sdbc.$sql_connection_native.this.$statements;
	}

	public SubLObject getField8() {
	    return com.cyc.cycjava.cycl.sdbc.$sql_connection_native.this.$lock;
	}

	public SubLObject getField9() {
	    return com.cyc.cycjava.cycl.sdbc.$sql_connection_native.this.$subprotocol;
	}

	public SubLObject getField10() {
	    return com.cyc.cycjava.cycl.sdbc.$sql_connection_native.this.$proxy_server;
	}

	public SubLObject getField11() {
	    return com.cyc.cycjava.cycl.sdbc.$sql_connection_native.this.$error_handling;
	}

	public SubLObject getField12() {
	    return com.cyc.cycjava.cycl.sdbc.$sql_connection_native.this.$tickets;
	}

	public SubLObject getField13() {
	    return com.cyc.cycjava.cycl.sdbc.$sql_connection_native.this.$mailman;
	}

	public SubLObject setField2(SubLObject value) {
	    return com.cyc.cycjava.cycl.sdbc.$sql_connection_native.this.$db = value;
	}

	public SubLObject setField3(SubLObject value) {
	    return com.cyc.cycjava.cycl.sdbc.$sql_connection_native.this.$user = value;
	}

	public SubLObject setField4(SubLObject value) {
	    return com.cyc.cycjava.cycl.sdbc.$sql_connection_native.this.$dbms_server = value;
	}

	public SubLObject setField5(SubLObject value) {
	    return com.cyc.cycjava.cycl.sdbc.$sql_connection_native.this.$port = value;
	}

	public SubLObject setField6(SubLObject value) {
	    return com.cyc.cycjava.cycl.sdbc.$sql_connection_native.this.$channel = value;
	}

	public SubLObject setField7(SubLObject value) {
	    return com.cyc.cycjava.cycl.sdbc.$sql_connection_native.this.$statements = value;
	}

	public SubLObject setField8(SubLObject value) {
	    return com.cyc.cycjava.cycl.sdbc.$sql_connection_native.this.$lock = value;
	}

	public SubLObject setField9(SubLObject value) {
	    return com.cyc.cycjava.cycl.sdbc.$sql_connection_native.this.$subprotocol = value;
	}

	public SubLObject setField10(SubLObject value) {
	    return com.cyc.cycjava.cycl.sdbc.$sql_connection_native.this.$proxy_server = value;
	}

	public SubLObject setField11(SubLObject value) {
	    return com.cyc.cycjava.cycl.sdbc.$sql_connection_native.this.$error_handling = value;
	}

	public SubLObject setField12(SubLObject value) {
	    return com.cyc.cycjava.cycl.sdbc.$sql_connection_native.this.$tickets = value;
	}

	public SubLObject setField13(SubLObject value) {
	    return com.cyc.cycjava.cycl.sdbc.$sql_connection_native.this.$mailman = value;
	}

	public SubLObject $db = Lisp.NIL;

	public SubLObject $user = Lisp.NIL;

	public SubLObject $dbms_server = Lisp.NIL;

	public SubLObject $port = Lisp.NIL;

	public SubLObject $channel = Lisp.NIL;

	public SubLObject $statements = Lisp.NIL;

	public SubLObject $lock = Lisp.NIL;

	public SubLObject $subprotocol = Lisp.NIL;

	public SubLObject $proxy_server = Lisp.NIL;

	public SubLObject $error_handling = Lisp.NIL;

	public SubLObject $tickets = Lisp.NIL;

	public SubLObject $mailman = Lisp.NIL;

	private static final SubLStructDeclNative structDecl = makeStructDeclNative(com.cyc.cycjava.cycl.sdbc.$sql_connection_native.class, SQL_CONNECTION, SQL_CONNECTION_P, $list_alt39, $list_alt40,
		new String[] { "$db", "$user", "$dbms_server", "$port", "$channel", "$statements", "$lock", "$subprotocol", "$proxy_server", "$error_handling", "$tickets", "$mailman" }, $list_alt41, $list_alt42, SQLC_PRINT);
    }

    /**
     *
     *
     * @param SERVER
    stringp;
     * 		
     * @param PORT
    positive-integer-p
     * 		
     * @return boolean; t if an SQL server is ready for services, nil otherwise
     */
    @LispMethod(comment = "@param SERVER\nstringp;\r\n\t\t\r\n@param PORT\npositive-integer-p\r\n\t\t\r\n@return boolean; t if an SQL server is ready for services, nil otherwise")
    public static final SubLObject sql_proxy_server_runningP_alt(SubLObject server, SubLObject port, SubLObject timeout) {
	if (server == UNPROVIDED) {
	    server = $sdbc_proxy_server$.getGlobalValue();
	}
	if (port == UNPROVIDED) {
	    port = $sql_port$.getGlobalValue();
	}
	if (timeout == UNPROVIDED) {
	    timeout = FIVE_INTEGER;
	}
	{
	    final SubLThread thread = SubLProcess.currentSubLThread();
	    SubLTrampolineFile.checkType(server, STRINGP);
	    SubLTrampolineFile.checkType(port, POSITIVE_INTEGER_P);
	    {
		SubLObject downP = NIL;
		try {
		    {
			SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
			try {
			    Errors.$error_handler$.bind(CATCH_ERROR_MESSAGE_HANDLER, thread);
			    try {
				{
				    SubLObject stream = NIL;
				    try {
					stream = subl_promotions.open_tcp_stream_with_timeout(server, port, NIL, $PRIVATE);
					if (NIL != stream) {
					    cfasl_output(cons($quit$.getGlobalValue(), NIL), stream);
					    finish_output(stream);
					    {
						SubLObject tag = with_timeout_make_tag();
						try {
						    {
							SubLObject _prev_bind_0_1 = $within_with_timeout$.currentBinding(thread);
							try {
							    $within_with_timeout$.bind(T, thread);
							    {
								SubLObject timer = NIL;
								try {
								    {
									SubLObject _prev_bind_0_2 = $with_timeout_nesting_depth$.currentBinding(thread);
									try {
									    $with_timeout_nesting_depth$.bind(add(ONE_INTEGER, $with_timeout_nesting_depth$.getDynamicValue(thread)), thread);
									    timer = with_timeout_start_timer(timeout, tag);
									    cfasl_input(stream, UNPROVIDED, UNPROVIDED);
									} finally {
									    $with_timeout_nesting_depth$.rebind(_prev_bind_0_2, thread);
									}
								    }
								} finally {
								    {
									SubLObject _prev_bind_0_3 = $is_thread_performing_cleanupP$.currentBinding(thread);
									try {
									    $is_thread_performing_cleanupP$.bind(T, thread);
									    with_timeout_stop_timer(timer);
									} finally {
									    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_3, thread);
									}
								    }
								}
							    }
							} finally {
							    $within_with_timeout$.rebind(_prev_bind_0_1, thread);
							}
						    }
						} catch (Throwable ccatch_env_var) {
						    downP = Errors.handleThrowable(ccatch_env_var, tag);
						}
					    }
					}
				    } finally {
					{
					    SubLObject _prev_bind_0_4 = $is_thread_performing_cleanupP$.currentBinding(thread);
					    try {
						$is_thread_performing_cleanupP$.bind(T, thread);
						if (NIL != stream) {
						    close(stream, UNPROVIDED);
						}
					    } finally {
						$is_thread_performing_cleanupP$.rebind(_prev_bind_0_4, thread);
					    }
					}
				    }
				}
			    } catch (Throwable catch_var) {
				Errors.handleThrowable(catch_var, NIL);
			    }
			} finally {
			    Errors.$error_handler$.rebind(_prev_bind_0, thread);
			}
		    }
		} catch (Throwable ccatch_env_var) {
		    downP = Errors.handleThrowable(ccatch_env_var, $catch_error_message_target$.getGlobalValue());
		}
		return makeBoolean(NIL == downP);
	    }
	}
    }

    /**
     *
     *
     * @param SERVER
    stringp;
     * 		
     * @param PORT
    positive-integer-p
     * 		
     * @return boolean; t if an SQL server is ready for services, nil otherwise
     */
    @LispMethod(comment = "@param SERVER\nstringp;\r\n\t\t\r\n@param PORT\npositive-integer-p\r\n\t\t\r\n@return boolean; t if an SQL server is ready for services, nil otherwise")
    public static SubLObject sql_proxy_server_runningP(SubLObject server, SubLObject port, SubLObject timeout) {
	if (server == UNPROVIDED) {
	    server = $sdbc_proxy_server$.getGlobalValue();
	}
	if (port == UNPROVIDED) {
	    port = $sql_port$.getGlobalValue();
	}
	if (timeout == UNPROVIDED) {
	    timeout = FIVE_INTEGER;
	}
	final SubLThread thread = SubLProcess.currentSubLThread();
	assert NIL != stringp(server) : "! stringp(server) " + ("Types.stringp(server) " + "CommonSymbols.NIL != Types.stringp(server) ") + server;
	assert NIL != subl_promotions.positive_integer_p(port) : "! subl_promotions.positive_integer_p(port) " + ("subl_promotions.positive_integer_p(port) " + "CommonSymbols.NIL != subl_promotions.positive_integer_p(port) ") + port;
	SubLObject downP = NIL;
	try {
	    thread.throwStack.push($catch_error_message_target$.getGlobalValue());
	    final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
	    try {
		Errors.$error_handler$.bind(CATCH_ERROR_MESSAGE_HANDLER, thread);
		try {
		    SubLObject stream = NIL;
		    try {
			stream = subl_promotions.open_tcp_stream_with_timeout(server, port, NIL, $PRIVATE);
			if (NIL != validate_tcp_connection(stream, server, port)) {
			    cfasl_output(cons($quit$.getGlobalValue(), NIL), stream);
			    finish_output(stream);
			    final SubLObject tag = with_timeout_make_tag();
			    try {
				thread.throwStack.push(tag);
				final SubLObject _prev_bind_0_$1 = $within_with_timeout$.currentBinding(thread);
				try {
				    $within_with_timeout$.bind(T, thread);
				    SubLObject timer = NIL;
				    try {
					final SubLObject _prev_bind_0_$2 = $with_timeout_nesting_depth$.currentBinding(thread);
					try {
					    $with_timeout_nesting_depth$.bind(add(ONE_INTEGER, $with_timeout_nesting_depth$.getDynamicValue(thread)), thread);
					    timer = with_timeout_start_timer(timeout, tag);
					    cfasl_input(stream, UNPROVIDED, UNPROVIDED);
					} finally {
					    $with_timeout_nesting_depth$.rebind(_prev_bind_0_$2, thread);
					}
				    } finally {
					final SubLObject _prev_bind_0_$3 = $is_thread_performing_cleanupP$.currentBinding(thread);
					try {
					    $is_thread_performing_cleanupP$.bind(T, thread);
					    final SubLObject _values = getValuesAsVector();
					    with_timeout_stop_timer(timer);
					    restoreValuesFromVector(_values);
					} finally {
					    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$3, thread);
					}
				    }
				} finally {
				    $within_with_timeout$.rebind(_prev_bind_0_$1, thread);
				}
			    } catch (final Throwable ccatch_env_var) {
				downP = Errors.handleThrowable(ccatch_env_var, tag);
			    } finally {
				thread.throwStack.pop();
			    }
			}
		    } finally {
			final SubLObject _prev_bind_0_$4 = $is_thread_performing_cleanupP$.currentBinding(thread);
			try {
			    $is_thread_performing_cleanupP$.bind(T, thread);
			    final SubLObject _values2 = getValuesAsVector();
			    if (NIL != stream) {
				close(stream, UNPROVIDED);
			    }
			    restoreValuesFromVector(_values2);
			} finally {
			    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$4, thread);
			}
		    }
		} catch (final Throwable catch_var) {
		    Errors.handleThrowable(catch_var, NIL);
		}
	    } finally {
		Errors.$error_handler$.rebind(_prev_bind_0, thread);
	    }
	} catch (final Throwable ccatch_env_var2) {
	    downP = Errors.handleThrowable(ccatch_env_var2, $catch_error_message_target$.getGlobalValue());
	} finally {
	    thread.throwStack.pop();
	}
	return makeBoolean(NIL == downP);
    }

    public static final SubLObject sql_connection_print_function_trampoline_alt(SubLObject v_object, SubLObject stream) {
	sqlc_print(v_object, stream, ZERO_INTEGER);
	return NIL;
    }

    public static SubLObject sql_connection_print_function_trampoline(final SubLObject v_object, final SubLObject stream) {
	sqlc_print(v_object, stream, ZERO_INTEGER);
	return NIL;
    }

    public static final SubLObject sql_connection_p_alt(SubLObject v_object) {
	return v_object.getClass() == com.cyc.cycjava.cycl.sdbc.$sql_connection_native.class ? ((SubLObject) (T)) : NIL;
    }

    public static SubLObject sql_connection_p(final SubLObject v_object) {
	return v_object.getClass() == com.cyc.cycjava.cycl.sdbc.$sql_connection_native.class ? T : NIL;
    }

    public static final SubLObject sqlc_db_alt(SubLObject v_object) {
	SubLTrampolineFile.checkType(v_object, SQL_CONNECTION_P);
	return v_object.getField2();
    }

    public static SubLObject sqlc_db(final SubLObject v_object) {
	assert NIL != sql_connection_p(v_object) : "! sdbc.sql_connection_p(v_object) " + "sdbc.sql_connection_p error :" + v_object;
	return v_object.getField2();
    }

    public static final SubLObject sqlc_user_alt(SubLObject v_object) {
	SubLTrampolineFile.checkType(v_object, SQL_CONNECTION_P);
	return v_object.getField3();
    }

    public static SubLObject sqlc_user(final SubLObject v_object) {
	assert NIL != sql_connection_p(v_object) : "! sdbc.sql_connection_p(v_object) " + "sdbc.sql_connection_p error :" + v_object;
	return v_object.getField3();
    }

    public static final SubLObject sqlc_dbms_server_alt(SubLObject v_object) {
	SubLTrampolineFile.checkType(v_object, SQL_CONNECTION_P);
	return v_object.getField4();
    }

    public static SubLObject sqlc_dbms_server(final SubLObject v_object) {
	assert NIL != sql_connection_p(v_object) : "! sdbc.sql_connection_p(v_object) " + "sdbc.sql_connection_p error :" + v_object;
	return v_object.getField4();
    }

    public static final SubLObject sqlc_port_alt(SubLObject v_object) {
	SubLTrampolineFile.checkType(v_object, SQL_CONNECTION_P);
	return v_object.getField5();
    }

    public static SubLObject sqlc_port(final SubLObject v_object) {
	assert NIL != sql_connection_p(v_object) : "! sdbc.sql_connection_p(v_object) " + "sdbc.sql_connection_p error :" + v_object;
	return v_object.getField5();
    }

    public static final SubLObject sqlc_channel_alt(SubLObject v_object) {
	SubLTrampolineFile.checkType(v_object, SQL_CONNECTION_P);
	return v_object.getField6();
    }

    public static SubLObject sqlc_channel(final SubLObject v_object) {
	assert NIL != sql_connection_p(v_object) : "! sdbc.sql_connection_p(v_object) " + "sdbc.sql_connection_p error :" + v_object;
	return v_object.getField6();
    }

    public static final SubLObject sqlc_statements_alt(SubLObject v_object) {
	SubLTrampolineFile.checkType(v_object, SQL_CONNECTION_P);
	return v_object.getField7();
    }

    public static SubLObject sqlc_statements(final SubLObject v_object) {
	assert NIL != sql_connection_p(v_object) : "! sdbc.sql_connection_p(v_object) " + "sdbc.sql_connection_p error :" + v_object;
	return v_object.getField7();
    }

    public static final SubLObject sqlc_lock_alt(SubLObject v_object) {
	SubLTrampolineFile.checkType(v_object, SQL_CONNECTION_P);
	return v_object.getField8();
    }

    public static SubLObject sqlc_lock(final SubLObject v_object) {
	assert NIL != sql_connection_p(v_object) : "! sdbc.sql_connection_p(v_object) " + "sdbc.sql_connection_p error :" + v_object;
	return v_object.getField8();
    }

    public static final SubLObject sqlc_subprotocol_alt(SubLObject v_object) {
	SubLTrampolineFile.checkType(v_object, SQL_CONNECTION_P);
	return v_object.getField9();
    }

    public static SubLObject sqlc_subprotocol(final SubLObject v_object) {
	assert NIL != sql_connection_p(v_object) : "! sdbc.sql_connection_p(v_object) " + "sdbc.sql_connection_p error :" + v_object;
	return v_object.getField9();
    }

    public static final SubLObject sqlc_proxy_server_alt(SubLObject v_object) {
	SubLTrampolineFile.checkType(v_object, SQL_CONNECTION_P);
	return v_object.getField10();
    }

    public static SubLObject sqlc_proxy_server(final SubLObject v_object) {
	assert NIL != sql_connection_p(v_object) : "! sdbc.sql_connection_p(v_object) " + "sdbc.sql_connection_p error :" + v_object;
	return v_object.getField10();
    }

    public static final SubLObject sqlc_error_handling_alt(SubLObject v_object) {
	SubLTrampolineFile.checkType(v_object, SQL_CONNECTION_P);
	return v_object.getField11();
    }

    public static SubLObject sqlc_error_handling(final SubLObject v_object) {
	assert NIL != sql_connection_p(v_object) : "! sdbc.sql_connection_p(v_object) " + "sdbc.sql_connection_p error :" + v_object;
	return v_object.getField11();
    }

    public static final SubLObject sqlc_tickets_alt(SubLObject v_object) {
	SubLTrampolineFile.checkType(v_object, SQL_CONNECTION_P);
	return v_object.getField12();
    }

    public static SubLObject sqlc_tickets(final SubLObject v_object) {
	assert NIL != sql_connection_p(v_object) : "! sdbc.sql_connection_p(v_object) " + "sdbc.sql_connection_p error :" + v_object;
	return v_object.getField12();
    }

    public static final SubLObject sqlc_mailman_alt(SubLObject v_object) {
	SubLTrampolineFile.checkType(v_object, SQL_CONNECTION_P);
	return v_object.getField13();
    }

    public static SubLObject sqlc_mailman(final SubLObject v_object) {
	assert NIL != sql_connection_p(v_object) : "! sdbc.sql_connection_p(v_object) " + "sdbc.sql_connection_p error :" + v_object;
	return v_object.getField13();
    }

    public static final SubLObject _csetf_sqlc_db_alt(SubLObject v_object, SubLObject value) {
	SubLTrampolineFile.checkType(v_object, SQL_CONNECTION_P);
	return v_object.setField2(value);
    }

    public static SubLObject _csetf_sqlc_db(final SubLObject v_object, final SubLObject value) {
	assert NIL != sql_connection_p(v_object) : "! sdbc.sql_connection_p(v_object) " + "sdbc.sql_connection_p error :" + v_object;
	return v_object.setField2(value);
    }

    public static final SubLObject _csetf_sqlc_user_alt(SubLObject v_object, SubLObject value) {
	SubLTrampolineFile.checkType(v_object, SQL_CONNECTION_P);
	return v_object.setField3(value);
    }

    public static SubLObject _csetf_sqlc_user(final SubLObject v_object, final SubLObject value) {
	assert NIL != sql_connection_p(v_object) : "! sdbc.sql_connection_p(v_object) " + "sdbc.sql_connection_p error :" + v_object;
	return v_object.setField3(value);
    }

    public static final SubLObject _csetf_sqlc_dbms_server_alt(SubLObject v_object, SubLObject value) {
	SubLTrampolineFile.checkType(v_object, SQL_CONNECTION_P);
	return v_object.setField4(value);
    }

    public static SubLObject _csetf_sqlc_dbms_server(final SubLObject v_object, final SubLObject value) {
	assert NIL != sql_connection_p(v_object) : "! sdbc.sql_connection_p(v_object) " + "sdbc.sql_connection_p error :" + v_object;
	return v_object.setField4(value);
    }

    public static final SubLObject _csetf_sqlc_port_alt(SubLObject v_object, SubLObject value) {
	SubLTrampolineFile.checkType(v_object, SQL_CONNECTION_P);
	return v_object.setField5(value);
    }

    public static SubLObject _csetf_sqlc_port(final SubLObject v_object, final SubLObject value) {
	assert NIL != sql_connection_p(v_object) : "! sdbc.sql_connection_p(v_object) " + "sdbc.sql_connection_p error :" + v_object;
	return v_object.setField5(value);
    }

    public static final SubLObject _csetf_sqlc_channel_alt(SubLObject v_object, SubLObject value) {
	SubLTrampolineFile.checkType(v_object, SQL_CONNECTION_P);
	return v_object.setField6(value);
    }

    public static SubLObject _csetf_sqlc_channel(final SubLObject v_object, final SubLObject value) {
	assert NIL != sql_connection_p(v_object) : "! sdbc.sql_connection_p(v_object) " + "sdbc.sql_connection_p error :" + v_object;
	return v_object.setField6(value);
    }

    public static final SubLObject _csetf_sqlc_statements_alt(SubLObject v_object, SubLObject value) {
	SubLTrampolineFile.checkType(v_object, SQL_CONNECTION_P);
	return v_object.setField7(value);
    }

    public static SubLObject _csetf_sqlc_statements(final SubLObject v_object, final SubLObject value) {
	assert NIL != sql_connection_p(v_object) : "! sdbc.sql_connection_p(v_object) " + "sdbc.sql_connection_p error :" + v_object;
	return v_object.setField7(value);
    }

    public static final SubLObject _csetf_sqlc_lock_alt(SubLObject v_object, SubLObject value) {
	SubLTrampolineFile.checkType(v_object, SQL_CONNECTION_P);
	return v_object.setField8(value);
    }

    public static SubLObject _csetf_sqlc_lock(final SubLObject v_object, final SubLObject value) {
	assert NIL != sql_connection_p(v_object) : "! sdbc.sql_connection_p(v_object) " + "sdbc.sql_connection_p error :" + v_object;
	return v_object.setField8(value);
    }

    public static final SubLObject _csetf_sqlc_subprotocol_alt(SubLObject v_object, SubLObject value) {
	SubLTrampolineFile.checkType(v_object, SQL_CONNECTION_P);
	return v_object.setField9(value);
    }

    public static SubLObject _csetf_sqlc_subprotocol(final SubLObject v_object, final SubLObject value) {
	assert NIL != sql_connection_p(v_object) : "! sdbc.sql_connection_p(v_object) " + "sdbc.sql_connection_p error :" + v_object;
	return v_object.setField9(value);
    }

    public static final SubLObject _csetf_sqlc_proxy_server_alt(SubLObject v_object, SubLObject value) {
	SubLTrampolineFile.checkType(v_object, SQL_CONNECTION_P);
	return v_object.setField10(value);
    }

    public static SubLObject _csetf_sqlc_proxy_server(final SubLObject v_object, final SubLObject value) {
	assert NIL != sql_connection_p(v_object) : "! sdbc.sql_connection_p(v_object) " + "sdbc.sql_connection_p error :" + v_object;
	return v_object.setField10(value);
    }

    public static final SubLObject _csetf_sqlc_error_handling_alt(SubLObject v_object, SubLObject value) {
	SubLTrampolineFile.checkType(v_object, SQL_CONNECTION_P);
	return v_object.setField11(value);
    }

    public static SubLObject _csetf_sqlc_error_handling(final SubLObject v_object, final SubLObject value) {
	assert NIL != sql_connection_p(v_object) : "! sdbc.sql_connection_p(v_object) " + "sdbc.sql_connection_p error :" + v_object;
	return v_object.setField11(value);
    }

    public static final SubLObject _csetf_sqlc_tickets_alt(SubLObject v_object, SubLObject value) {
	SubLTrampolineFile.checkType(v_object, SQL_CONNECTION_P);
	return v_object.setField12(value);
    }

    public static SubLObject _csetf_sqlc_tickets(final SubLObject v_object, final SubLObject value) {
	assert NIL != sql_connection_p(v_object) : "! sdbc.sql_connection_p(v_object) " + "sdbc.sql_connection_p error :" + v_object;
	return v_object.setField12(value);
    }

    public static final SubLObject _csetf_sqlc_mailman_alt(SubLObject v_object, SubLObject value) {
	SubLTrampolineFile.checkType(v_object, SQL_CONNECTION_P);
	return v_object.setField13(value);
    }

    public static SubLObject _csetf_sqlc_mailman(final SubLObject v_object, final SubLObject value) {
	assert NIL != sql_connection_p(v_object) : "! sdbc.sql_connection_p(v_object) " + "sdbc.sql_connection_p error :" + v_object;
	return v_object.setField13(value);
    }

    public static final SubLObject make_sql_connection_alt(SubLObject arglist) {
	if (arglist == UNPROVIDED) {
	    arglist = NIL;
	}
	{
	    SubLObject v_new = new com.cyc.cycjava.cycl.sdbc.$sql_connection_native();
	    SubLObject next = NIL;
	    for (next = arglist; NIL != next; next = cddr(next)) {
		{
		    SubLObject current_arg = next.first();
		    SubLObject current_value = cadr(next);
		    SubLObject pcase_var = current_arg;
		    if (pcase_var.eql($DB)) {
			_csetf_sqlc_db(v_new, current_value);
		    } else {
			if (pcase_var.eql($USER)) {
			    _csetf_sqlc_user(v_new, current_value);
			} else {
			    if (pcase_var.eql($DBMS_SERVER)) {
				_csetf_sqlc_dbms_server(v_new, current_value);
			    } else {
				if (pcase_var.eql($PORT)) {
				    _csetf_sqlc_port(v_new, current_value);
				} else {
				    if (pcase_var.eql($CHANNEL)) {
					_csetf_sqlc_channel(v_new, current_value);
				    } else {
					if (pcase_var.eql($STATEMENTS)) {
					    _csetf_sqlc_statements(v_new, current_value);
					} else {
					    if (pcase_var.eql($LOCK)) {
						_csetf_sqlc_lock(v_new, current_value);
					    } else {
						if (pcase_var.eql($SUBPROTOCOL)) {
						    _csetf_sqlc_subprotocol(v_new, current_value);
						} else {
						    if (pcase_var.eql($PROXY_SERVER)) {
							_csetf_sqlc_proxy_server(v_new, current_value);
						    } else {
							if (pcase_var.eql($ERROR_HANDLING)) {
							    _csetf_sqlc_error_handling(v_new, current_value);
							} else {
							    if (pcase_var.eql($TICKETS)) {
								_csetf_sqlc_tickets(v_new, current_value);
							    } else {
								if (pcase_var.eql($MAILMAN)) {
								    _csetf_sqlc_mailman(v_new, current_value);
								} else {
								    Errors.error($str_alt81$Invalid_slot__S_for_construction_, current_arg);
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

    public static SubLObject make_sql_connection(SubLObject arglist) {
	if (arglist == UNPROVIDED) {
	    arglist = NIL;
	}
	final SubLObject v_new = new com.cyc.cycjava.cycl.sdbc.$sql_connection_native();
	SubLObject next;
	SubLObject current_arg;
	SubLObject current_value;
	SubLObject pcase_var;
	for (next = NIL, next = arglist; NIL != next; next = cddr(next)) {
	    current_arg = next.first();
	    current_value = cadr(next);
	    pcase_var = current_arg;
	    if (pcase_var.eql($DB)) {
		_csetf_sqlc_db(v_new, current_value);
	    } else if (pcase_var.eql($USER)) {
		_csetf_sqlc_user(v_new, current_value);
	    } else if (pcase_var.eql($DBMS_SERVER)) {
		_csetf_sqlc_dbms_server(v_new, current_value);
	    } else if (pcase_var.eql($PORT)) {
		_csetf_sqlc_port(v_new, current_value);
	    } else if (pcase_var.eql($CHANNEL)) {
		_csetf_sqlc_channel(v_new, current_value);
	    } else if (pcase_var.eql($STATEMENTS)) {
		_csetf_sqlc_statements(v_new, current_value);
	    } else if (pcase_var.eql($LOCK)) {
		_csetf_sqlc_lock(v_new, current_value);
	    } else if (pcase_var.eql($SUBPROTOCOL)) {
		_csetf_sqlc_subprotocol(v_new, current_value);
	    } else if (pcase_var.eql($PROXY_SERVER)) {
		_csetf_sqlc_proxy_server(v_new, current_value);
	    } else if (pcase_var.eql($ERROR_HANDLING)) {
		_csetf_sqlc_error_handling(v_new, current_value);
	    } else if (pcase_var.eql($TICKETS)) {
		_csetf_sqlc_tickets(v_new, current_value);
	    } else if (pcase_var.eql($MAILMAN)) {
		_csetf_sqlc_mailman(v_new, current_value);
	    } else {
		Errors.error($str82$Invalid_slot__S_for_construction_, current_arg);
	    }

	}
	return v_new;
    }

    public static SubLObject visit_defstruct_sql_connection(final SubLObject obj, final SubLObject visitor_fn) {
	funcall(visitor_fn, obj, $BEGIN, MAKE_SQL_CONNECTION, TWELVE_INTEGER);
	funcall(visitor_fn, obj, $SLOT, $DB, sqlc_db(obj));
	funcall(visitor_fn, obj, $SLOT, $USER, sqlc_user(obj));
	funcall(visitor_fn, obj, $SLOT, $DBMS_SERVER, sqlc_dbms_server(obj));
	funcall(visitor_fn, obj, $SLOT, $PORT, sqlc_port(obj));
	funcall(visitor_fn, obj, $SLOT, $CHANNEL, sqlc_channel(obj));
	funcall(visitor_fn, obj, $SLOT, $STATEMENTS, sqlc_statements(obj));
	funcall(visitor_fn, obj, $SLOT, $LOCK, sqlc_lock(obj));
	funcall(visitor_fn, obj, $SLOT, $SUBPROTOCOL, sqlc_subprotocol(obj));
	funcall(visitor_fn, obj, $SLOT, $PROXY_SERVER, sqlc_proxy_server(obj));
	funcall(visitor_fn, obj, $SLOT, $ERROR_HANDLING, sqlc_error_handling(obj));
	funcall(visitor_fn, obj, $SLOT, $TICKETS, sqlc_tickets(obj));
	funcall(visitor_fn, obj, $SLOT, $MAILMAN, sqlc_mailman(obj));
	funcall(visitor_fn, obj, $END, MAKE_SQL_CONNECTION, TWELVE_INTEGER);
	return obj;
    }

    public static SubLObject visit_defstruct_object_sql_connection_method(final SubLObject obj, final SubLObject visitor_fn) {
	return visit_defstruct_sql_connection(obj, visitor_fn);
    }

    /**
     * Pretty-print CONNECTION to STREAM, ignoring DEPTH
     */
    @LispMethod(comment = "Pretty-print CONNECTION to STREAM, ignoring DEPTH")
    public static final SubLObject sqlc_print_alt(SubLObject connection, SubLObject stream, SubLObject depth) {
	write_string(sqlc_print_string(connection), stream, UNPROVIDED, UNPROVIDED);
	return connection;
    }

    @LispMethod(comment = "Pretty-print CONNECTION to STREAM, ignoring DEPTH")
    public static SubLObject sqlc_print(final SubLObject connection, final SubLObject stream, final SubLObject depth) {
	write_string(sqlc_print_string(connection), stream, UNPROVIDED, UNPROVIDED);
	return connection;
    }

    /**
    * Pretty-print CONNECTION to STREAM, ignoring DEPTH
    */

    /**
     *
     *
     * @param CONNECTION
    sql-connection-p
     * 		
     * @return stringp; a string representation of CONNECTION
     */
    @LispMethod(comment = "@param CONNECTION\nsql-connection-p\r\n\t\t\r\n@return stringp; a string representation of CONNECTION")
    public static final SubLObject sqlc_print_string_alt(SubLObject connection) {
	{
	    SubLObject string = NIL;
	    SubLObject stream = NIL;
	    try {
		stream = make_private_string_output_stream();
		write_string($str_alt82$__SQL_CONNECTION_, stream, UNPROVIDED, UNPROVIDED);
		if (NIL == sqlc_open_p(connection)) {
		    write_string($str_alt83$closed_, stream, UNPROVIDED, UNPROVIDED);
		}
		write_string($str_alt84$to_, stream, UNPROVIDED, UNPROVIDED);
		write_string(sqlc_db(connection), stream, UNPROVIDED, UNPROVIDED);
		write_string($str_alt85$__, stream, UNPROVIDED, UNPROVIDED);
		write_string(sqlc_dbms_server(connection), stream, UNPROVIDED, UNPROVIDED);
		write_string($str_alt86$_, stream, UNPROVIDED, UNPROVIDED);
		prin1(sqlc_port(connection), stream);
		write_string($str_alt87$__, stream, UNPROVIDED, UNPROVIDED);
		string = get_output_stream_string(stream);
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
	    return string;
	}
    }

    /**
     *
     *
     * @param CONNECTION
    sql-connection-p
     * 		
     * @return stringp; a string representation of CONNECTION
     */
    @LispMethod(comment = "@param CONNECTION\nsql-connection-p\r\n\t\t\r\n@return stringp; a string representation of CONNECTION")
    public static SubLObject sqlc_print_string(final SubLObject connection) {
	SubLObject string = NIL;
	SubLObject stream = NIL;
	try {
	    stream = make_private_string_output_stream();
	    write_string($str88$__SQL_CONNECTION_, stream, UNPROVIDED, UNPROVIDED);
	    if (NIL == sqlc_open_p(connection)) {
		write_string($$$closed_, stream, UNPROVIDED, UNPROVIDED);
	    }
	    write_string($$$to_, stream, UNPROVIDED, UNPROVIDED);
	    write_string(sqlc_db(connection), stream, UNPROVIDED, UNPROVIDED);
	    write_string($str91$__, stream, UNPROVIDED, UNPROVIDED);
	    write_string(sqlc_dbms_server(connection), stream, UNPROVIDED, UNPROVIDED);
	    write_string($str92$_, stream, UNPROVIDED, UNPROVIDED);
	    prin1(sqlc_port(connection), stream);
	    write_string($str93$__, stream, UNPROVIDED, UNPROVIDED);
	    string = get_output_stream_string(stream);
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
	return string;
    }

    /**
     *
     *
     * @param DB
     * 		stringp; the database to which to connect
     * @param USER;
     * 		the database user id
     * @param PASSWORD;
     * 		the database password for USER
     * @param PROPERTIES;
     * 		a property list allowing the following values:
     * 		:dbms-server   the name of the machine running the DBMS
     * 		:subprotocol   the subprotocol of the DBMS, e.g. 'postgresql' or 'mysql'
     * 		:proxy-server  the name or ip address of the machine running the SDBC proxy server
     * 		:port          the port on which the SDBC proxy server is listening
     * 		:timeout       the maximum number of seconds spent to obtain a connection to the
     * 		proxy server before giving up
     * @return sql-connection-p; a new sql connection to database DB for user USER with
    password PASSWORD and properties PROPERTIES
     */
    @LispMethod(comment = "@param DB\r\n\t\tstringp; the database to which to connect\r\n@param USER;\r\n\t\tthe database user id\r\n@param PASSWORD;\r\n\t\tthe database password for USER\r\n@param PROPERTIES;\r\n\t\ta property list allowing the following values:\r\n\t\t:dbms-server   the name of the machine running the DBMS\r\n\t\t:subprotocol   the subprotocol of the DBMS, e.g. \'postgresql\' or \'mysql\'\r\n\t\t:proxy-server  the name or ip address of the machine running the SDBC proxy server\r\n\t\t:port          the port on which the SDBC proxy server is listening\r\n\t\t:timeout       the maximum number of seconds spent to obtain a connection to the\r\n\t\tproxy server before giving up\r\n@return sql-connection-p; a new sql connection to database DB for user USER with\r\npassword PASSWORD and properties PROPERTIES")
    public static final SubLObject new_sql_connection_alt(SubLObject db, SubLObject user, SubLObject password, SubLObject v_properties) {
	if (v_properties == UNPROVIDED) {
	    v_properties = NIL;
	}
	{
	    final SubLThread thread = SubLProcess.currentSubLThread();
	    {
		SubLObject datum = v_properties;
		SubLObject current = datum;
		SubLObject allow_other_keys_p = NIL;
		SubLObject rest = current;
		SubLObject bad = NIL;
		SubLObject current_5 = NIL;
		for (; NIL != rest;) {
		    destructuring_bind_must_consp(rest, datum, $list_alt88);
		    current_5 = rest.first();
		    rest = rest.rest();
		    destructuring_bind_must_consp(rest, datum, $list_alt88);
		    if (NIL == member(current_5, $list_alt89, UNPROVIDED, UNPROVIDED)) {
			bad = T;
		    }
		    if (current_5 == $ALLOW_OTHER_KEYS) {
			allow_other_keys_p = rest.first();
		    }
		    rest = rest.rest();
		}
		if ((NIL != bad) && (NIL == allow_other_keys_p)) {
		    cdestructuring_bind_error(datum, $list_alt88);
		}
		{
		    SubLObject dbms_server_tail = property_list_member($DBMS_SERVER, current);
		    SubLObject dbms_server = (NIL != dbms_server_tail) ? ((SubLObject) (cadr(dbms_server_tail))) : $dbms_server$.getGlobalValue();
		    SubLObject subprotocol_tail = property_list_member($SUBPROTOCOL, current);
		    SubLObject subprotocol = (NIL != subprotocol_tail) ? ((SubLObject) (cadr(subprotocol_tail))) : $sql_subprotocol$.getGlobalValue();
		    SubLObject proxy_server_tail = property_list_member($PROXY_SERVER, current);
		    SubLObject proxy_server = (NIL != proxy_server_tail) ? ((SubLObject) (cadr(proxy_server_tail))) : dbms_server;
		    SubLObject port_tail = property_list_member($PORT, current);
		    SubLObject port = (NIL != port_tail) ? ((SubLObject) (cadr(port_tail))) : $sql_port$.getGlobalValue();
		    SubLObject timeout_tail = property_list_member($TIMEOUT, current);
		    SubLObject timeout = (NIL != timeout_tail) ? ((SubLObject) (cadr(timeout_tail))) : $sql_connection_timeout$.getGlobalValue();
		    SubLTrampolineFile.checkType(db, STRINGP);
		    SubLTrampolineFile.checkType(user, STRINGP);
		    SubLTrampolineFile.checkType(password, STRINGP);
		    SubLTrampolineFile.checkType(dbms_server, STRINGP);
		    SubLTrampolineFile.checkType(port, INTEGERP);
		    SubLTrampolineFile.checkType(subprotocol, STRINGP);
		    SubLTrampolineFile.checkType(proxy_server, STRINGP);
		    SubLTrampolineFile.checkType(timeout, NON_NEGATIVE_NUMBER_P);
		    {
			SubLObject connection = make_sql_connection(UNPROVIDED);
			SubLObject error_message = NIL;
			SubLObject timed_outP = NIL;
			_csetf_sqlc_db(connection, db);
			_csetf_sqlc_user(connection, user);
			_csetf_sqlc_dbms_server(connection, dbms_server);
			_csetf_sqlc_port(connection, port);
			_csetf_sqlc_subprotocol(connection, subprotocol);
			_csetf_sqlc_proxy_server(connection, proxy_server);
			_csetf_sqlc_lock(connection, make_lock($$$SQL_connection_lock));
			_csetf_sqlc_error_handling(connection, $RETURN);
			_csetf_sqlc_tickets(connection, queues.create_queue());
			{
			    SubLObject tag = with_timeout_make_tag();
			    try {
				{
				    SubLObject _prev_bind_0 = $within_with_timeout$.currentBinding(thread);
				    try {
					$within_with_timeout$.bind(T, thread);
					{
					    SubLObject timer = NIL;
					    try {
						{
						    SubLObject _prev_bind_0_6 = $with_timeout_nesting_depth$.currentBinding(thread);
						    try {
							$with_timeout_nesting_depth$.bind(add(ONE_INTEGER, $with_timeout_nesting_depth$.getDynamicValue(thread)), thread);
							timer = with_timeout_start_timer(timeout, tag);
							try {
							    {
								SubLObject _prev_bind_0_7 = Errors.$error_handler$.currentBinding(thread);
								try {
								    Errors.$error_handler$.bind(CATCH_ERROR_MESSAGE_HANDLER, thread);
								    try {
									_csetf_sqlc_channel(connection, subl_promotions.open_tcp_stream_with_access(proxy_server, port, $PRIVATE));
								    } catch (Throwable catch_var) {
									Errors.handleThrowable(catch_var, NIL);
								    }
								} finally {
								    Errors.$error_handler$.rebind(_prev_bind_0_7, thread);
								}
							    }
							} catch (Throwable ccatch_env_var) {
							    error_message = Errors.handleThrowable(ccatch_env_var, $catch_error_message_target$.getGlobalValue());
							}
							if (NIL != error_message) {
							    connection = sqlc_handle_error(connection, new_sdbc_error($client_error$.getGlobalValue(), error_message, UNPROVIDED));
							} else {
							    _csetf_sqlc_mailman(connection, launch_sql_mailman(connection));
							    {
								SubLObject result = sqlc_execute(connection, $new_connection$.getGlobalValue(), list(new_db_url(dbms_server, db, user, password, subprotocol)));
								if (NIL != sdbc_error_p(result)) {
								    sqlc_close(connection);
								    connection = result;
								}
							    }
							}
						    } finally {
							$with_timeout_nesting_depth$.rebind(_prev_bind_0_6, thread);
						    }
						}
					    } finally {
						{
						    SubLObject _prev_bind_0_8 = $is_thread_performing_cleanupP$.currentBinding(thread);
						    try {
							$is_thread_performing_cleanupP$.bind(T, thread);
							with_timeout_stop_timer(timer);
						    } finally {
							$is_thread_performing_cleanupP$.rebind(_prev_bind_0_8, thread);
						    }
						}
					    }
					}
				    } finally {
					$within_with_timeout$.rebind(_prev_bind_0, thread);
				    }
				}
			    } catch (Throwable ccatch_env_var) {
				timed_outP = Errors.handleThrowable(ccatch_env_var, tag);
			    }
			}
			if (NIL != timed_outP) {
			    sqlc_close(connection);
			    connection = sqlc_handle_error(connection, new_sdbc_error($client_error$.getGlobalValue(), $$$timeout, UNPROVIDED));
			}
			return connection;
		    }
		}
	    }
	}
    }

    /**
     *
     *
     * @param DB
     * 		stringp; the database to which to connect
     * @param USER;
     * 		the database user id
     * @param PASSWORD;
     * 		the database password for USER
     * @param PROPERTIES;
     * 		a property list allowing the following values:
     * 		:dbms-server   the name of the machine running the DBMS
     * 		:subprotocol   the subprotocol of the DBMS, e.g. 'postgresql' or 'mysql'
     * 		:proxy-server  the name or ip address of the machine running the SDBC proxy server
     * 		:port          the port on which the SDBC proxy server is listening
     * 		:timeout       the maximum number of seconds spent to obtain a connection to the
     * 		proxy server before giving up
     * @return sql-connection-p; a new sql connection to database DB for user USER with
    password PASSWORD and properties PROPERTIES
     */
    @LispMethod(comment = "@param DB\r\n\t\tstringp; the database to which to connect\r\n@param USER;\r\n\t\tthe database user id\r\n@param PASSWORD;\r\n\t\tthe database password for USER\r\n@param PROPERTIES;\r\n\t\ta property list allowing the following values:\r\n\t\t:dbms-server   the name of the machine running the DBMS\r\n\t\t:subprotocol   the subprotocol of the DBMS, e.g. \'postgresql\' or \'mysql\'\r\n\t\t:proxy-server  the name or ip address of the machine running the SDBC proxy server\r\n\t\t:port          the port on which the SDBC proxy server is listening\r\n\t\t:timeout       the maximum number of seconds spent to obtain a connection to the\r\n\t\tproxy server before giving up\r\n@return sql-connection-p; a new sql connection to database DB for user USER with\r\npassword PASSWORD and properties PROPERTIES")
    public static SubLObject new_sql_connection(final SubLObject db, final SubLObject user, final SubLObject password, SubLObject v_properties) {
	if (v_properties == UNPROVIDED) {
	    v_properties = NIL;
	}
	final SubLThread thread = SubLProcess.currentSubLThread();
	final SubLObject current;
	final SubLObject datum = current = v_properties;
	SubLObject allow_other_keys_p = NIL;
	SubLObject rest = current;
	SubLObject bad = NIL;
	SubLObject current_$5 = NIL;
	while (NIL != rest) {
	    destructuring_bind_must_consp(rest, datum, $list94);
	    current_$5 = rest.first();
	    rest = rest.rest();
	    destructuring_bind_must_consp(rest, datum, $list94);
	    if (NIL == member(current_$5, $list95, UNPROVIDED, UNPROVIDED)) {
		bad = T;
	    }
	    if (current_$5 == $ALLOW_OTHER_KEYS) {
		allow_other_keys_p = rest.first();
	    }
	    rest = rest.rest();
	}
	if ((NIL != bad) && (NIL == allow_other_keys_p)) {
	    cdestructuring_bind_error(datum, $list94);
	}
	final SubLObject dbms_server_tail = property_list_member($DBMS_SERVER, current);
	final SubLObject dbms_server = (NIL != dbms_server_tail) ? cadr(dbms_server_tail) : $dbms_server$.getGlobalValue();
	final SubLObject dbms_port_tail = property_list_member($DBMS_PORT, current);
	final SubLObject dbms_port = (NIL != dbms_port_tail) ? cadr(dbms_port_tail) : NIL;
	final SubLObject subprotocol_tail = property_list_member($SUBPROTOCOL, current);
	final SubLObject subprotocol = (NIL != subprotocol_tail) ? cadr(subprotocol_tail) : $sql_subprotocol$.getGlobalValue();
	final SubLObject proxy_server_tail = property_list_member($PROXY_SERVER, current);
	final SubLObject proxy_server = (NIL != proxy_server_tail) ? cadr(proxy_server_tail) : dbms_server;
	final SubLObject port_tail = property_list_member($PORT, current);
	final SubLObject port = (NIL != port_tail) ? cadr(port_tail) : $sql_port$.getGlobalValue();
	final SubLObject timeout_tail = property_list_member($TIMEOUT, current);
	final SubLObject timeout = (NIL != timeout_tail) ? cadr(timeout_tail) : $sql_connection_timeout$.getGlobalValue();
	assert NIL != stringp(db) : "! stringp(db) " + ("Types.stringp(db) " + "CommonSymbols.NIL != Types.stringp(db) ") + db;
	if (((NIL != user) && (!SubLTrampolineFile.assertionsDisabledInClass)) && (NIL == stringp(user))) {
	    throw new AssertionError(user);
	}
	if (((NIL != password) && (!SubLTrampolineFile.assertionsDisabledInClass)) && (NIL == stringp(password))) {
	    throw new AssertionError(password);
	}
	assert NIL != stringp(dbms_server) : "! stringp(dbms_server) " + ("Types.stringp(dbms_server) " + "CommonSymbols.NIL != Types.stringp(dbms_server) ") + dbms_server;
	if (((NIL != dbms_port) && (!SubLTrampolineFile.assertionsDisabledInClass)) && (NIL == integerp(dbms_port))) {
	    throw new AssertionError(dbms_port);
	}
	assert NIL != integerp(port) : "! integerp(port) " + ("Types.integerp(port) " + "CommonSymbols.NIL != Types.integerp(port) ") + port;
	assert NIL != stringp(subprotocol) : "! stringp(subprotocol) " + ("Types.stringp(subprotocol) " + "CommonSymbols.NIL != Types.stringp(subprotocol) ") + subprotocol;
	assert NIL != stringp(proxy_server) : "! stringp(proxy_server) " + ("Types.stringp(proxy_server) " + "CommonSymbols.NIL != Types.stringp(proxy_server) ") + proxy_server;
	assert NIL != number_utilities.non_negative_number_p(timeout) : "! number_utilities.non_negative_number_p(timeout) " + ("number_utilities.non_negative_number_p(timeout) " + "CommonSymbols.NIL != number_utilities.non_negative_number_p(timeout) ") + timeout;
	SubLObject connection = make_sql_connection(UNPROVIDED);
	SubLObject error_message = NIL;
	SubLObject timed_outP = NIL;
	_csetf_sqlc_db(connection, db);
	_csetf_sqlc_user(connection, user);
	_csetf_sqlc_dbms_server(connection, dbms_server);
	_csetf_sqlc_port(connection, port);
	_csetf_sqlc_subprotocol(connection, subprotocol);
	_csetf_sqlc_proxy_server(connection, proxy_server);
	_csetf_sqlc_lock(connection, make_lock($$$SQL_connection_lock));
	_csetf_sqlc_error_handling(connection, $RETURN);
	_csetf_sqlc_tickets(connection, queues.create_queue(UNPROVIDED));
	final SubLObject tag = with_timeout_make_tag();
	try {
	    thread.throwStack.push(tag);
	    final SubLObject _prev_bind_0 = $within_with_timeout$.currentBinding(thread);
	    try {
		$within_with_timeout$.bind(T, thread);
		SubLObject timer = NIL;
		try {
		    final SubLObject _prev_bind_0_$6 = $with_timeout_nesting_depth$.currentBinding(thread);
		    try {
			$with_timeout_nesting_depth$.bind(add(ONE_INTEGER, $with_timeout_nesting_depth$.getDynamicValue(thread)), thread);
			timer = with_timeout_start_timer(timeout, tag);
			try {
			    thread.throwStack.push($catch_error_message_target$.getGlobalValue());
			    final SubLObject _prev_bind_0_$7 = Errors.$error_handler$.currentBinding(thread);
			    try {
				Errors.$error_handler$.bind(CATCH_ERROR_MESSAGE_HANDLER, thread);
				try {
				    if ((NIL == proxy_server) || (NIL == port)) {
					Errors.error($str103$Trying_to_open_from_a_null_sqlc_c);
				    }
				    _csetf_sqlc_channel(connection, subl_promotions.open_tcp_stream_with_timeout(proxy_server, port, NIL, $PRIVATE));
				} catch (final Throwable catch_var) {
				    Errors.handleThrowable(catch_var, NIL);
				}
			    } finally {
				Errors.$error_handler$.rebind(_prev_bind_0_$7, thread);
			    }
			} catch (final Throwable ccatch_env_var) {
			    error_message = Errors.handleThrowable(ccatch_env_var, $catch_error_message_target$.getGlobalValue());
			} finally {
			    thread.throwStack.pop();
			}
			if (NIL != error_message) {
			    connection = sqlc_handle_error(connection, new_sdbc_error($client_error$.getGlobalValue(), error_message, UNPROVIDED));
			} else {
			    _csetf_sqlc_mailman(connection, launch_sql_mailman(connection));
			    final SubLObject result = sqlc_execute(connection, $new_connection$.getGlobalValue(), list(new_db_url(dbms_server, db, user, password, subprotocol, dbms_port)));
			    if (NIL != sdbc_error_p(result)) {
				sqlc_close(connection);
				connection = result;
			    }
			}
		    } finally {
			$with_timeout_nesting_depth$.rebind(_prev_bind_0_$6, thread);
		    }
		} finally {
		    final SubLObject _prev_bind_0_$8 = $is_thread_performing_cleanupP$.currentBinding(thread);
		    try {
			$is_thread_performing_cleanupP$.bind(T, thread);
			final SubLObject _values = getValuesAsVector();
			with_timeout_stop_timer(timer);
			restoreValuesFromVector(_values);
		    } finally {
			$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$8, thread);
		    }
		}
	    } finally {
		$within_with_timeout$.rebind(_prev_bind_0, thread);
	    }
	} catch (final Throwable ccatch_env_var2) {
	    timed_outP = Errors.handleThrowable(ccatch_env_var2, tag);
	} finally {
	    thread.throwStack.pop();
	}
	if (NIL != timed_outP) {
	    sqlc_close(connection);
	    connection = sqlc_handle_error(connection, new_sdbc_error($client_error$.getGlobalValue(), $$$timeout, UNPROVIDED));
	}
	return connection;
    }

    /**
     * Returns t if OBJECT is an open sql connection
     */
    @LispMethod(comment = "Returns t if OBJECT is an open sql connection")
    public static final SubLObject sql_open_connection_p_alt(SubLObject v_object) {
	return makeBoolean((NIL != sql_connection_p(v_object)) && (NIL != sqlc_open_p(v_object)));
    }

    @LispMethod(comment = "Returns t if OBJECT is an open sql connection")
    public static SubLObject sql_open_connection_p(final SubLObject v_object) {
	return makeBoolean((NIL != sql_connection_p(v_object)) && (NIL != sqlc_open_p(v_object)));
    }

    /**
    * Returns t if OBJECT is an open sql connection
    */

    /**
     *
     *
     * @param CONNECTION
    sql-connection-p
     * 		
     * @return boolean; t if CONNECTION is open and nil otherwise
     */
    @LispMethod(comment = "@param CONNECTION\nsql-connection-p\r\n\t\t\r\n@return boolean; t if CONNECTION is open and nil otherwise")
    public static final SubLObject sqlc_open_p_alt(SubLObject connection) {
	SubLTrampolineFile.checkType(connection, SQL_CONNECTION_P);
	return makeBoolean((NIL != sqlc_channel(connection)) && (NIL != open_stream_p(sqlc_channel(connection))));
    }

    /**
     *
     *
     * @param CONNECTION
    sql-connection-p
     * 		
     * @return boolean; t if CONNECTION is open and nil otherwise
     */
    @LispMethod(comment = "@param CONNECTION\nsql-connection-p\r\n\t\t\r\n@return boolean; t if CONNECTION is open and nil otherwise")
    public static SubLObject sqlc_open_p(final SubLObject connection) {
	assert NIL != sql_connection_p(connection) : "! sdbc.sql_connection_p(connection) " + ("sdbc.sql_connection_p(connection) " + "CommonSymbols.NIL != sdbc.sql_connection_p(connection) ") + connection;
	return makeBoolean((NIL != sqlc_channel(connection)) && (NIL != open_stream_p(sqlc_channel(connection))));
    }

    /**
     *
     *
     * @param CONNECTION
    sql-connection-p
     * 		
     * @return sql-connection-p or sdbc-error-p
    Closes CONNECTION. All statements associated with CONNECTION are also
    automatically closed
     */
    @LispMethod(comment = "@param CONNECTION\nsql-connection-p\r\n\t\t\r\n@return sql-connection-p or sdbc-error-p\r\nCloses CONNECTION. All statements associated with CONNECTION are also\r\nautomatically closed")
    public static final SubLObject sqlc_close_alt(SubLObject connection) {
	SubLTrampolineFile.checkType(connection, SQL_CONNECTION_P);
	if (NIL != sqlc_mailman(connection)) {
	    kill_process(sqlc_mailman(connection));
	}
	if (NIL != sqlc_channel(connection)) {
	    close(sqlc_channel(connection), UNPROVIDED);
	}
	{
	    SubLObject cdolist_list_var = sqlc_statements(connection);
	    SubLObject statement = NIL;
	    for (statement = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest(), statement = cdolist_list_var.first()) {
		sqls_local_close(statement);
	    }
	}
	return connection;
    }

    /**
     *
     *
     * @param CONNECTION
    sql-connection-p
     * 		
     * @return sql-connection-p or sdbc-error-p
    Closes CONNECTION. All statements associated with CONNECTION are also
    automatically closed
     */
    @LispMethod(comment = "@param CONNECTION\nsql-connection-p\r\n\t\t\r\n@return sql-connection-p or sdbc-error-p\r\nCloses CONNECTION. All statements associated with CONNECTION are also\r\nautomatically closed")
    public static SubLObject sqlc_close(final SubLObject connection) {
	assert NIL != sql_connection_p(connection) : "! sdbc.sql_connection_p(connection) " + ("sdbc.sql_connection_p(connection) " + "CommonSymbols.NIL != sdbc.sql_connection_p(connection) ") + connection;
	final SubLObject lock = sqlc_lock(connection);
	SubLObject release = NIL;
	try {
	    release = seize_lock(lock);
	    if (NIL != sqlc_mailman(connection)) {
		kill_process(sqlc_mailman(connection));
	    }
	    _csetf_sqlc_mailman(connection, NIL);
	    if (NIL != sqlc_channel(connection)) {
		close(sqlc_channel(connection), UNPROVIDED);
	    }
	    _csetf_sqlc_channel(connection, NIL);
	    SubLObject cdolist_list_var = sqlc_statements(connection);
	    SubLObject statement = NIL;
	    statement = cdolist_list_var.first();
	    while (NIL != cdolist_list_var) {
		sqls_local_close(statement);
		cdolist_list_var = cdolist_list_var.rest();
		statement = cdolist_list_var.first();
	    }
	    _csetf_sqlc_statements(connection, NIL);
	    return connection;
	} finally {
	    if (NIL != release) {
		release_lock(lock);
	    }
	}
    }

    /**
     *
     *
     * @param CONNECTION
    sql-connection-p
     * 		
     * @return sql-statement-p; return a new statement from CONNECTION, or an sdbc error
     */
    @LispMethod(comment = "@param CONNECTION\nsql-connection-p\r\n\t\t\r\n@return sql-statement-p; return a new statement from CONNECTION, or an sdbc error")
    public static final SubLObject sqlc_create_statement_alt(SubLObject connection) {
	SubLTrampolineFile.checkType(connection, SQL_OPEN_CONNECTION_P);
	{
	    SubLObject statement = new_sql_statement(connection);
	    if (NIL != sql_statement_p(statement)) {
		_csetf_sqlc_statements(connection, cons(statement, sqlc_statements(connection)));
	    }
	    return statement;
	}
    }

    /**
     *
     *
     * @param CONNECTION
    sql-connection-p
     * 		
     * @return sql-statement-p; return a new statement from CONNECTION, or an sdbc error
     */
    @LispMethod(comment = "@param CONNECTION\nsql-connection-p\r\n\t\t\r\n@return sql-statement-p; return a new statement from CONNECTION, or an sdbc error")
    public static SubLObject sqlc_create_statement(final SubLObject connection) {
	assert NIL != sql_open_connection_p(connection) : "! sdbc.sql_open_connection_p(connection) " + ("sdbc.sql_open_connection_p(connection) " + "CommonSymbols.NIL != sdbc.sql_open_connection_p(connection) ") + connection;
	final SubLObject statement = new_sql_statement(connection);
	if (NIL != sql_statement_p(statement)) {
	    _csetf_sqlc_statements(connection, cons(statement, sqlc_statements(connection)));
	}
	return statement;
    }

    /**
     *
     *
     * @param CONNECTION
    sql-connection-p
     * 		
     * @return sql-statement-p; return a new prepared statemant from CONNECTION
    with SQL precompiled, or an sdbc error
     */
    @LispMethod(comment = "@param CONNECTION\nsql-connection-p\r\n\t\t\r\n@return sql-statement-p; return a new prepared statemant from CONNECTION\r\nwith SQL precompiled, or an sdbc error")
    public static final SubLObject sqlc_prepare_statement_alt(SubLObject connection, SubLObject sql) {
	SubLTrampolineFile.checkType(connection, SQL_OPEN_CONNECTION_P);
	SubLTrampolineFile.checkType(sql, STRINGP);
	{
	    SubLObject statement = new_sql_prepared_statement(connection, sql);
	    if (NIL != sql_statement_p(statement)) {
		_csetf_sqlc_statements(connection, cons(statement, sqlc_statements(connection)));
	    }
	    return statement;
	}
    }

    /**
     *
     *
     * @param CONNECTION
    sql-connection-p
     * 		
     * @return sql-statement-p; return a new prepared statemant from CONNECTION
    with SQL precompiled, or an sdbc error
     */
    @LispMethod(comment = "@param CONNECTION\nsql-connection-p\r\n\t\t\r\n@return sql-statement-p; return a new prepared statemant from CONNECTION\r\nwith SQL precompiled, or an sdbc error")
    public static SubLObject sqlc_prepare_statement(final SubLObject connection, final SubLObject sql) {
	assert NIL != sql_open_connection_p(connection) : "! sdbc.sql_open_connection_p(connection) " + ("sdbc.sql_open_connection_p(connection) " + "CommonSymbols.NIL != sdbc.sql_open_connection_p(connection) ") + connection;
	assert NIL != stringp(sql) : "! stringp(sql) " + ("Types.stringp(sql) " + "CommonSymbols.NIL != Types.stringp(sql) ") + sql;
	final SubLObject statement = new_sql_prepared_statement(connection, sql);
	if (NIL != sql_statement_p(statement)) {
	    _csetf_sqlc_statements(connection, cons(statement, sqlc_statements(connection)));
	}
	return statement;
    }

    /**
     *
     *
     * @param CONNNECTION
    sql-connection-p;
     * 		
     * @param FLAG
    boolean;
     * 		
     * @return boolean; non-nil if setting the auto commit was successful, nil otherwise
     */
    @LispMethod(comment = "@param CONNNECTION\nsql-connection-p;\r\n\t\t\r\n@param FLAG\nboolean;\r\n\t\t\r\n@return boolean; non-nil if setting the auto commit was successful, nil otherwise")
    public static final SubLObject sqlc_set_auto_commit_alt(SubLObject connection, SubLObject flag) {
	SubLTrampolineFile.checkType(connection, SQL_OPEN_CONNECTION_P);
	SubLTrampolineFile.checkType(flag, BOOLEANP);
	return sqlc_execute(connection, $set_auto_commit$.getGlobalValue(), list(flag));
    }

    /**
     *
     *
     * @param CONNNECTION
    sql-connection-p;
     * 		
     * @param FLAG
    boolean;
     * 		
     * @return boolean; non-nil if setting the auto commit was successful, nil otherwise
     */
    @LispMethod(comment = "@param CONNNECTION\nsql-connection-p;\r\n\t\t\r\n@param FLAG\nboolean;\r\n\t\t\r\n@return boolean; non-nil if setting the auto commit was successful, nil otherwise")
    public static SubLObject sqlc_set_auto_commit(final SubLObject connection, final SubLObject flag) {
	assert NIL != sql_open_connection_p(connection) : "! sdbc.sql_open_connection_p(connection) " + ("sdbc.sql_open_connection_p(connection) " + "CommonSymbols.NIL != sdbc.sql_open_connection_p(connection) ") + connection;
	assert NIL != booleanp(flag) : "! booleanp(flag) " + ("Types.booleanp(flag) " + "CommonSymbols.NIL != Types.booleanp(flag) ") + flag;
	return sqlc_execute(connection, $set_auto_commit$.getGlobalValue(), list(flag));
    }

    /**
     *
     *
     * @param CONNECTION
    sql-connection-p
     * 		
     * @return boolean; t if CONNECTION is in auto-commit mode, nil if it isn't, and an
    SDBC error in case of error
     */
    @LispMethod(comment = "@param CONNECTION\nsql-connection-p\r\n\t\t\r\n@return boolean; t if CONNECTION is in auto-commit mode, nil if it isn\'t, and an\r\nSDBC error in case of error")
    public static final SubLObject sqlc_get_auto_commit_alt(SubLObject connection) {
	SubLTrampolineFile.checkType(connection, SQL_OPEN_CONNECTION_P);
	return sqlc_execute(connection, $get_auto_commit$.getGlobalValue(), NIL);
    }

    /**
     *
     *
     * @param CONNECTION
    sql-connection-p
     * 		
     * @return boolean; t if CONNECTION is in auto-commit mode, nil if it isn't, and an
    SDBC error in case of error
     */
    @LispMethod(comment = "@param CONNECTION\nsql-connection-p\r\n\t\t\r\n@return boolean; t if CONNECTION is in auto-commit mode, nil if it isn\'t, and an\r\nSDBC error in case of error")
    public static SubLObject sqlc_get_auto_commit(final SubLObject connection) {
	assert NIL != sql_open_connection_p(connection) : "! sdbc.sql_open_connection_p(connection) " + ("sdbc.sql_open_connection_p(connection) " + "CommonSymbols.NIL != sdbc.sql_open_connection_p(connection) ") + connection;
	return sqlc_execute(connection, $get_auto_commit$.getGlobalValue(), NIL);
    }

    /**
     *
     *
     * @param CONNECTION
     * 		sql-connection-p;
     * 		Makes all changes made since the previous commit/rollback permanent and releases
     * 		any database locks currently held by CONNECTION
     * @return boolean; non-nil if the commit was successful, nil otherwise
     */
    @LispMethod(comment = "@param CONNECTION\r\n\t\tsql-connection-p;\r\n\t\tMakes all changes made since the previous commit/rollback permanent and releases\r\n\t\tany database locks currently held by CONNECTION\r\n@return boolean; non-nil if the commit was successful, nil otherwise")
    public static final SubLObject sqlc_commit_alt(SubLObject connection) {
	SubLTrampolineFile.checkType(connection, SQL_OPEN_CONNECTION_P);
	return sqlc_execute(connection, $commit$.getGlobalValue(), NIL);
    }

    /**
     *
     *
     * @param CONNECTION
     * 		sql-connection-p;
     * 		Makes all changes made since the previous commit/rollback permanent and releases
     * 		any database locks currently held by CONNECTION
     * @return boolean; non-nil if the commit was successful, nil otherwise
     */
    @LispMethod(comment = "@param CONNECTION\r\n\t\tsql-connection-p;\r\n\t\tMakes all changes made since the previous commit/rollback permanent and releases\r\n\t\tany database locks currently held by CONNECTION\r\n@return boolean; non-nil if the commit was successful, nil otherwise")
    public static SubLObject sqlc_commit(final SubLObject connection) {
	assert NIL != sql_open_connection_p(connection) : "! sdbc.sql_open_connection_p(connection) " + ("sdbc.sql_open_connection_p(connection) " + "CommonSymbols.NIL != sdbc.sql_open_connection_p(connection) ") + connection;
	return sqlc_execute(connection, $commit$.getGlobalValue(), NIL);
    }

    /**
     *
     *
     * @param CONNECTION
     * 		sql-connection-p;
     * 		Undoes all changes made in the current transaction and releases any database locks
     * 		currently held by CONNECTION
     * @return boolean; non-nil if the commit was successful, nil otherwise
     */
    @LispMethod(comment = "@param CONNECTION\r\n\t\tsql-connection-p;\r\n\t\tUndoes all changes made in the current transaction and releases any database locks\r\n\t\tcurrently held by CONNECTION\r\n@return boolean; non-nil if the commit was successful, nil otherwise")
    public static final SubLObject sqlc_rollback_alt(SubLObject connection) {
	SubLTrampolineFile.checkType(connection, SQL_OPEN_CONNECTION_P);
	return sqlc_execute(connection, $rollback$.getGlobalValue(), NIL);
    }

    /**
     *
     *
     * @param CONNECTION
     * 		sql-connection-p;
     * 		Undoes all changes made in the current transaction and releases any database locks
     * 		currently held by CONNECTION
     * @return boolean; non-nil if the commit was successful, nil otherwise
     */
    @LispMethod(comment = "@param CONNECTION\r\n\t\tsql-connection-p;\r\n\t\tUndoes all changes made in the current transaction and releases any database locks\r\n\t\tcurrently held by CONNECTION\r\n@return boolean; non-nil if the commit was successful, nil otherwise")
    public static SubLObject sqlc_rollback(final SubLObject connection) {
	assert NIL != sql_open_connection_p(connection) : "! sdbc.sql_open_connection_p(connection) " + ("sdbc.sql_open_connection_p(connection) " + "CommonSymbols.NIL != sdbc.sql_open_connection_p(connection) ") + connection;
	return sqlc_execute(connection, $rollback$.getGlobalValue(), NIL);
    }

    /**
     *
     *
     * @param CONNECTION
    sql-connection-p;
     * 		
     * @return keyword; the current transaction isolation level, which will be one of
    :transaction-none, :transaction-read-committed, :transaction-read-uncommitted,
    :transaction-repeatable-read, :transaction-serializable
     */
    @LispMethod(comment = "@param CONNECTION\nsql-connection-p;\r\n\t\t\r\n@return keyword; the current transaction isolation level, which will be one of\r\n:transaction-none, :transaction-read-committed, :transaction-read-uncommitted,\r\n:transaction-repeatable-read, :transaction-serializable")
    public static final SubLObject sqlc_get_transaction_isolation_alt(SubLObject connection) {
	SubLTrampolineFile.checkType(connection, SQL_OPEN_CONNECTION_P);
	return sqlc_execute(connection, $get_transaction_isolation$.getGlobalValue(), NIL);
    }

    /**
     *
     *
     * @param CONNECTION
    sql-connection-p;
     * 		
     * @return keyword; the current transaction isolation level, which will be one of
    :transaction-none, :transaction-read-committed, :transaction-read-uncommitted,
    :transaction-repeatable-read, :transaction-serializable
     */
    @LispMethod(comment = "@param CONNECTION\nsql-connection-p;\r\n\t\t\r\n@return keyword; the current transaction isolation level, which will be one of\r\n:transaction-none, :transaction-read-committed, :transaction-read-uncommitted,\r\n:transaction-repeatable-read, :transaction-serializable")
    public static SubLObject sqlc_get_transaction_isolation(final SubLObject connection) {
	assert NIL != sql_open_connection_p(connection) : "! sdbc.sql_open_connection_p(connection) " + ("sdbc.sql_open_connection_p(connection) " + "CommonSymbols.NIL != sdbc.sql_open_connection_p(connection) ") + connection;
	return sqlc_execute(connection, $get_transaction_isolation$.getGlobalValue(), NIL);
    }

    /**
     *
     *
     * @param CONNECTION
    sql-connection-p
     * 		
     * @param transaction-level;
     * 		one of :transaction-none, :transaction-read-committed,
     * 		:transaction-read-uncommitted, :transaction-repeatable-read,
     * 		:transaction-serializable
     * 		Attempts to change the transaction isolation level for CONNECTION  to the one given
     * @unknown iff this method is called during a transaction, the result is
    implementation-defined
     * @return object; 0 or an sdbc error
     */
    @LispMethod(comment = "@param CONNECTION\nsql-connection-p\r\n\t\t\r\n@param transaction-level;\r\n\t\tone of :transaction-none, :transaction-read-committed,\r\n\t\t:transaction-read-uncommitted, :transaction-repeatable-read,\r\n\t\t:transaction-serializable\r\n\t\tAttempts to change the transaction isolation level for CONNECTION  to the one given\r\n@unknown iff this method is called during a transaction, the result is\r\nimplementation-defined\r\n@return object; 0 or an sdbc error")
    public static final SubLObject sqlc_set_transaction_isolation_alt(SubLObject connection, SubLObject transaction_level) {
	SubLTrampolineFile.checkType(connection, SQL_OPEN_CONNECTION_P);
	SubLTrampolineFile.checkType(transaction_level, SQL_TRANSACTION_LEVEL_P);
	return sqlc_execute(connection, $set_transaction_isolation$.getGlobalValue(), list(transaction_level));
    }

    /**
     *
     *
     * @param CONNECTION
    sql-connection-p
     * 		
     * @param transaction-level;
     * 		one of :transaction-none, :transaction-read-committed,
     * 		:transaction-read-uncommitted, :transaction-repeatable-read,
     * 		:transaction-serializable
     * 		Attempts to change the transaction isolation level for CONNECTION  to the one given
     * @unknown iff this method is called during a transaction, the result is
    implementation-defined
     * @return object; 0 or an sdbc error
     */
    @LispMethod(comment = "@param CONNECTION\nsql-connection-p\r\n\t\t\r\n@param transaction-level;\r\n\t\tone of :transaction-none, :transaction-read-committed,\r\n\t\t:transaction-read-uncommitted, :transaction-repeatable-read,\r\n\t\t:transaction-serializable\r\n\t\tAttempts to change the transaction isolation level for CONNECTION  to the one given\r\n@unknown iff this method is called during a transaction, the result is\r\nimplementation-defined\r\n@return object; 0 or an sdbc error")
    public static SubLObject sqlc_set_transaction_isolation(final SubLObject connection, final SubLObject transaction_level) {
	assert NIL != sql_open_connection_p(connection) : "! sdbc.sql_open_connection_p(connection) " + ("sdbc.sql_open_connection_p(connection) " + "CommonSymbols.NIL != sdbc.sql_open_connection_p(connection) ") + connection;
	assert NIL != sql_transaction_level_p(transaction_level) : "! sdbc.sql_transaction_level_p(transaction_level) " + ("sdbc.sql_transaction_level_p(transaction_level) " + "CommonSymbols.NIL != sdbc.sql_transaction_level_p(transaction_level) ") + transaction_level;
	return sqlc_execute(connection, $set_transaction_isolation$.getGlobalValue(), list(transaction_level));
    }

    public static final SubLObject sql_ticket_print_function_trampoline_alt(SubLObject v_object, SubLObject stream) {
	compatibility.default_struct_print_function(v_object, stream, ZERO_INTEGER);
	return NIL;
    }

    public static SubLObject sql_ticket_print_function_trampoline(final SubLObject v_object, final SubLObject stream) {
	compatibility.default_struct_print_function(v_object, stream, ZERO_INTEGER);
	return NIL;
    }

    public static final SubLObject sql_ticket_p_alt(SubLObject v_object) {
	return v_object.getClass() == com.cyc.cycjava.cycl.sdbc.$sql_ticket_native.class ? ((SubLObject) (T)) : NIL;
    }

    public static SubLObject sql_ticket_p(final SubLObject v_object) {
	return v_object.getClass() == com.cyc.cycjava.cycl.sdbc.$sql_ticket_native.class ? T : NIL;
    }

    public static final SubLObject sql_ticket_semaphore_alt(SubLObject v_object) {
	SubLTrampolineFile.checkType(v_object, SQL_TICKET_P);
	return v_object.getField2();
    }

    public static SubLObject sql_ticket_semaphore(final SubLObject v_object) {
	assert NIL != sql_ticket_p(v_object) : "! sdbc.sql_ticket_p(v_object) " + "sdbc.sql_ticket_p error :" + v_object;
	return v_object.getField2();
    }

    public static final SubLObject sql_ticket_result_alt(SubLObject v_object) {
	SubLTrampolineFile.checkType(v_object, SQL_TICKET_P);
	return v_object.getField3();
    }

    public static SubLObject sql_ticket_result(final SubLObject v_object) {
	assert NIL != sql_ticket_p(v_object) : "! sdbc.sql_ticket_p(v_object) " + "sdbc.sql_ticket_p error :" + v_object;
	return v_object.getField3();
    }

    public static final SubLObject _csetf_sql_ticket_semaphore_alt(SubLObject v_object, SubLObject value) {
	SubLTrampolineFile.checkType(v_object, SQL_TICKET_P);
	return v_object.setField2(value);
    }

    public static SubLObject _csetf_sql_ticket_semaphore(final SubLObject v_object, final SubLObject value) {
	assert NIL != sql_ticket_p(v_object) : "! sdbc.sql_ticket_p(v_object) " + "sdbc.sql_ticket_p error :" + v_object;
	return v_object.setField2(value);
    }

    public static final SubLObject _csetf_sql_ticket_result_alt(SubLObject v_object, SubLObject value) {
	SubLTrampolineFile.checkType(v_object, SQL_TICKET_P);
	return v_object.setField3(value);
    }

    public static SubLObject _csetf_sql_ticket_result(final SubLObject v_object, final SubLObject value) {
	assert NIL != sql_ticket_p(v_object) : "! sdbc.sql_ticket_p(v_object) " + "sdbc.sql_ticket_p error :" + v_object;
	return v_object.setField3(value);
    }

    public static final SubLObject make_sql_ticket_alt(SubLObject arglist) {
	if (arglist == UNPROVIDED) {
	    arglist = NIL;
	}
	{
	    SubLObject v_new = new com.cyc.cycjava.cycl.sdbc.$sql_ticket_native();
	    SubLObject next = NIL;
	    for (next = arglist; NIL != next; next = cddr(next)) {
		{
		    SubLObject current_arg = next.first();
		    SubLObject current_value = cadr(next);
		    SubLObject pcase_var = current_arg;
		    if (pcase_var.eql($SEMAPHORE)) {
			_csetf_sql_ticket_semaphore(v_new, current_value);
		    } else {
			if (pcase_var.eql($RESULT)) {
			    _csetf_sql_ticket_result(v_new, current_value);
			} else {
			    Errors.error($str_alt81$Invalid_slot__S_for_construction_, current_arg);
			}
		    }
		}
	    }
	    return v_new;
	}
    }

    public static SubLObject make_sql_ticket(SubLObject arglist) {
	if (arglist == UNPROVIDED) {
	    arglist = NIL;
	}
	final SubLObject v_new = new com.cyc.cycjava.cycl.sdbc.$sql_ticket_native();
	SubLObject next;
	SubLObject current_arg;
	SubLObject current_value;
	SubLObject pcase_var;
	for (next = NIL, next = arglist; NIL != next; next = cddr(next)) {
	    current_arg = next.first();
	    current_value = cadr(next);
	    pcase_var = current_arg;
	    if (pcase_var.eql($SEMAPHORE)) {
		_csetf_sql_ticket_semaphore(v_new, current_value);
	    } else if (pcase_var.eql($RESULT)) {
		_csetf_sql_ticket_result(v_new, current_value);
	    } else {
		Errors.error($str82$Invalid_slot__S_for_construction_, current_arg);
	    }

	}
	return v_new;
    }

    public static SubLObject visit_defstruct_sql_ticket(final SubLObject obj, final SubLObject visitor_fn) {
	funcall(visitor_fn, obj, $BEGIN, MAKE_SQL_TICKET, TWO_INTEGER);
	funcall(visitor_fn, obj, $SLOT, $SEMAPHORE, sql_ticket_semaphore(obj));
	funcall(visitor_fn, obj, $SLOT, $RESULT, sql_ticket_result(obj));
	funcall(visitor_fn, obj, $END, MAKE_SQL_TICKET, TWO_INTEGER);
	return obj;
    }

    public static SubLObject visit_defstruct_object_sql_ticket_method(final SubLObject obj, final SubLObject visitor_fn) {
	return visit_defstruct_sql_ticket(obj, visitor_fn);
    }

    /**
     *
     *
     * @return sql-ticket-p; a unique identifier for an SQL request
     */
    @LispMethod(comment = "@return sql-ticket-p; a unique identifier for an SQL request")
    public static final SubLObject new_sql_ticket_alt() {
	{
	    SubLObject ticket = make_sql_ticket(UNPROVIDED);
	    _csetf_sql_ticket_semaphore(ticket, Semaphores.new_semaphore($$$SQL_Request, ZERO_INTEGER));
	    return ticket;
	}
    }

    /**
     *
     *
     * @return sql-ticket-p; a unique identifier for an SQL request
     */
    @LispMethod(comment = "@return sql-ticket-p; a unique identifier for an SQL request")
    public static SubLObject new_sql_ticket() {
	final SubLObject ticket = make_sql_ticket(UNPROVIDED);
	_csetf_sql_ticket_semaphore(ticket, Semaphores.new_semaphore($$$SQL_Request, ZERO_INTEGER));
	return ticket;
    }

    /**
     *
     *
     * @param connection
    sql-connection-p
     * 		
     * @param ticket
    consp
     * 		
     * @return object; the result that connection associates with TICKET
     */
    @LispMethod(comment = "@param connection\nsql-connection-p\r\n\t\t\r\n@param ticket\nconsp\r\n\t\t\r\n@return object; the result that connection associates with TICKET")
    public static final SubLObject sql_ticket_retrieve_alt(SubLObject ticket) {
	{
	    SubLObject result = NIL;
	    while (NIL == result) {
		Semaphores.semaphore_wait(sql_ticket_semaphore(ticket));
		result = sql_ticket_result(ticket);
	    }
	    return result;
	}
    }

    /**
     *
     *
     * @param connection
    sql-connection-p
     * 		
     * @param ticket
    consp
     * 		
     * @return object; the result that connection associates with TICKET
     */
    @LispMethod(comment = "@param connection\nsql-connection-p\r\n\t\t\r\n@param ticket\nconsp\r\n\t\t\r\n@return object; the result that connection associates with TICKET")
    public static SubLObject sql_ticket_retrieve(final SubLObject ticket) {
	final SubLThread thread = SubLProcess.currentSubLThread();
	SubLObject result = NIL;
	while (NIL == result) {
	    final SubLObject inference = inference_macros.current_controlling_inference();
	    final SubLObject inference_remaining_time = (NIL != inference) ? inference_datastructures_inference.inference_remaining_time(inference, T) : NIL;
	    final SubLObject max_secs_to_wait = (inference_remaining_time.isInteger()) ? add(FIVE_INTEGER, inference_remaining_time) : NIL != inference ? $sql_connection_timeout_seconds_within_inference$.getDynamicValue(thread) : $sql_connection_timeout_seconds$.getDynamicValue(thread);
	    if (NIL != Semaphores.semaphore_wait_with_timeout(sql_ticket_semaphore(ticket), max_secs_to_wait)) {
		result = sql_ticket_result(ticket);
	    } else {
		result = new_sdbc_error($io_error$.getGlobalValue(), cconcatenate($$$Timed_out_after_, new SubLObject[] { format_nil.format_nil_d_no_copy(max_secs_to_wait), $$$_seconds_retrieving_SQL_ticket }), UNPROVIDED);
	    }
	}
	return result;
    }

    /**
     *
     *
     * @param CONNECTION
     * 		sql-connection-p; the SQL connection from which to deliver results
     */
    @LispMethod(comment = "@param CONNECTION\r\n\t\tsql-connection-p; the SQL connection from which to deliver results")
    public static final SubLObject launch_sql_mailman_alt(SubLObject connection) {
	return subl_promotions.make_process_with_args(cconcatenate($str_alt115$SQL_Mailman_for_, format_nil_a_no_copy(sqlc_print_string(connection))), SQLC_DELIVER, list(connection));
    }

    /**
     *
     *
     * @param CONNECTION
     * 		sql-connection-p; the SQL connection from which to deliver results
     */
    @LispMethod(comment = "@param CONNECTION\r\n\t\tsql-connection-p; the SQL connection from which to deliver results")
    public static SubLObject launch_sql_mailman(final SubLObject connection) {
	return subl_promotions.make_process_with_args(cconcatenate($$$SQL_Mailman_for_, format_nil.format_nil_a_no_copy(sqlc_print_string(connection))), SQLC_DELIVER, list(connection));
    }

    /**
     *
     *
     * @param CONNECTION
     * 		sql-connection-p;
     * 		continuously read sql results from CONNECTION and deliver them to the appropriate
     * 		recipient
     */
    @LispMethod(comment = "@param CONNECTION\r\n\t\tsql-connection-p;\r\n\t\tcontinuously read sql results from CONNECTION and deliver them to the appropriate\r\n\t\trecipient")
    public static final SubLObject sqlc_deliver_alt(SubLObject connection) {
	{
	    SubLObject result = NIL;
	    SubLObject ticket = NIL;
	    while (true) {
		result = sqlc_receive(connection);
		{
		    SubLObject lock = sqlc_lock(connection);
		    SubLObject release = NIL;
		    try {
			release = seize_lock(lock);
			ticket = queues.dequeue(sqlc_tickets(connection));
		    } finally {
			if (NIL != release) {
			    release_lock(lock);
			}
		    }
		}
		if (NIL != ticket) {
		    _csetf_sql_ticket_result(ticket, result);
		    Semaphores.semaphore_signal(sql_ticket_semaphore(ticket));
		} else {
		    if (NIL != sdbc_client_error_p(result)) {
			close(sqlc_channel(connection), UNPROVIDED);
			sqlc_close(connection);
		    } else {
			Errors.error($str_alt117$Implementation_error__no_ticket_f, result);
		    }
		}
	    }
	}
    }

    /**
     *
     *
     * @param CONNECTION
     * 		sql-connection-p;
     * 		continuously read sql results from CONNECTION and deliver them to the appropriate
     * 		recipient
     */
    @LispMethod(comment = "@param CONNECTION\r\n\t\tsql-connection-p;\r\n\t\tcontinuously read sql results from CONNECTION and deliver them to the appropriate\r\n\t\trecipient")
    public static SubLObject sqlc_deliver(final SubLObject connection) {
	SubLTrampolineFile.enforceType(connection, SQL_CONNECTION_P);
	SubLObject result = NIL;
	SubLObject ticket = NIL;
	while (true) {
	    result = sqlc_receive(connection);
	    final SubLObject lock = sqlc_lock(connection);
	    SubLObject release = NIL;
	    try {
		release = seize_lock(lock);
		ticket = queues.dequeue(sqlc_tickets(connection));
	    } finally {
		if (NIL != release) {
		    release_lock(lock);
		}
	    }
	    if (NIL != ticket) {
		_csetf_sql_ticket_result(ticket, result);
		Semaphores.semaphore_signal(sql_ticket_semaphore(ticket));
	    } else if (NIL != sdbc_client_error_p(result)) {
		close(sqlc_channel(connection), UNPROVIDED);
		sqlc_close(connection);
	    } else {
		Errors.error($str132$Implementation_error__no_ticket_f, result);
	    }

	}
    }

    /**
     *
     *
     * @param CONNECTION
    sql-connection-p
     * 		
     * @param FUNCTION
     * 		positive-integerp; a code for a function to be executed
     * @param ARGS
     * 		listp; the arguments of FUNCTION
     * @return object; the result of executing FUNCTION with ARGS on the SQL server
    we're connected to via CONNECTION
     */
    @LispMethod(comment = "@param CONNECTION\nsql-connection-p\r\n\t\t\r\n@param FUNCTION\r\n\t\tpositive-integerp; a code for a function to be executed\r\n@param ARGS\r\n\t\tlistp; the arguments of FUNCTION\r\n@return object; the result of executing FUNCTION with ARGS on the SQL server\r\nwe\'re connected to via CONNECTION")
    public static final SubLObject sqlc_execute_alt(SubLObject connection, SubLObject function, SubLObject args) {
	{
	    SubLObject ticket = new_sql_ticket();
	    SubLObject send_response = NIL;
	    SubLObject receive_response = NIL;
	    send_response = sqlc_send(connection, ticket, function, args);
	    if (NIL != sdbc_client_error_p(send_response)) {
		close(sqlc_channel(connection), UNPROVIDED);
		sqlc_close(connection);
		return sqlc_handle_error(connection, send_response);
	    }
	    receive_response = sql_ticket_retrieve(ticket);
	    if (NIL != sdbc_error_p(receive_response)) {
		if (NIL != sdbc_client_error_p(receive_response)) {
		    close(sqlc_channel(connection), UNPROVIDED);
		    sqlc_close(connection);
		}
		return sqlc_handle_error(connection, receive_response);
	    }
	    return receive_response;
	}
    }

    /**
     *
     *
     * @param CONNECTION
    sql-connection-p
     * 		
     * @param FUNCTION
     * 		positive-integerp; a code for a function to be executed
     * @param ARGS
     * 		listp; the arguments of FUNCTION
     * @return object; the result of executing FUNCTION with ARGS on the SQL server
    we're connected to via CONNECTION
     */
    @LispMethod(comment = "@param CONNECTION\nsql-connection-p\r\n\t\t\r\n@param FUNCTION\r\n\t\tpositive-integerp; a code for a function to be executed\r\n@param ARGS\r\n\t\tlistp; the arguments of FUNCTION\r\n@return object; the result of executing FUNCTION with ARGS on the SQL server\r\nwe\'re connected to via CONNECTION")
    public static SubLObject sqlc_execute(final SubLObject connection, final SubLObject function, final SubLObject args) {
	final SubLObject ticket = new_sql_ticket();
	SubLObject send_response = NIL;
	SubLObject receive_response = NIL;
	send_response = sqlc_send(connection, ticket, function, args);
	if (NIL != sdbc_client_error_p(send_response)) {
	    close(sqlc_channel(connection), UNPROVIDED);
	    sqlc_close(connection);
	    return sqlc_handle_error(connection, send_response);
	}
	receive_response = sql_ticket_retrieve(ticket);
	if (NIL != sdbc_error_p(receive_response)) {
	    if (NIL != sdbc_client_error_p(receive_response)) {
		close(sqlc_channel(connection), UNPROVIDED);
		sqlc_close(connection);
	    }
	    return sqlc_handle_error(connection, receive_response);
	}
	return receive_response;
    }

    /**
     * Send FUNCTION applied to ARGS over CONNECTION
     *
     * @param CONNECTION
    sql-connection-p
     * 		
     * @param FUNCTION
    positive-integer-p
     * 		
     * @param ARGS
    listp
     * 		
     * @return nil or sql-error-p; nil on successful sending, an appropriate error
    response otherwise
     */
    @LispMethod(comment = "Send FUNCTION applied to ARGS over CONNECTION\r\n\r\n@param CONNECTION\nsql-connection-p\r\n\t\t\r\n@param FUNCTION\npositive-integer-p\r\n\t\t\r\n@param ARGS\nlistp\r\n\t\t\r\n@return nil or sql-error-p; nil on successful sending, an appropriate error\r\nresponse otherwise")
    public static final SubLObject sqlc_send_alt(SubLObject connection, SubLObject ticket, SubLObject function, SubLObject args) {
	{
	    SubLObject error_message = NIL;
	    SubLObject response = NIL;
	    try {
		{
		    SubLObject _prev_bind_0 = currentBinding(Errors.$error_handler$);
		    try {
			bind(Errors.$error_handler$, CATCH_ERROR_MESSAGE_HANDLER);
			try {
			    {
				SubLObject lock = sqlc_lock(connection);
				SubLObject release = NIL;
				try {
				    release = seize_lock(lock);
				    queues.enqueue(ticket, sqlc_tickets(connection));
				    cfasl_output(cons(function, args), sqlc_channel(connection));
				    force_output(sqlc_channel(connection));
				} finally {
				    if (NIL != release) {
					release_lock(lock);
				    }
				}
			    }
			} catch (Throwable catch_var) {
			    Errors.handleThrowable(catch_var, NIL);
			}
		    } finally {
			rebind(Errors.$error_handler$, _prev_bind_0);
		    }
		}
	    } catch (Throwable ccatch_env_var) {
		error_message = Errors.handleThrowable(ccatch_env_var, $catch_error_message_target$.getGlobalValue());
	    }
	    if (NIL != error_message) {
		response = new_sdbc_error($client_error$.getGlobalValue(), error_message, UNPROVIDED);
	    }
	    return response;
	}
    }

    @LispMethod(comment = "Send FUNCTION applied to ARGS over CONNECTION\r\n\r\n@param CONNECTION\n\t\tsql-connection-p\r\n\t\t\r\n@param FUNCTION\n\t\tpositive-integer-p\r\n\t\t\r\n@param ARGS\n\t\tlistp\r\n\t\t\r\n@return nil or sql-error-p; nil on successful sending, an appropriate error\r\nresponse otherwise")
    public static SubLObject sqlc_send(final SubLObject connection, final SubLObject ticket, final SubLObject function, final SubLObject args) {
	final SubLThread thread = SubLProcess.currentSubLThread();
	SubLTrampolineFile.enforceType(connection, SQL_CONNECTION_P);
	SubLObject error_message = NIL;
	SubLObject response = NIL;
	try {
	    thread.throwStack.push($catch_error_message_target$.getGlobalValue());
	    final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
	    try {
		Errors.$error_handler$.bind(CATCH_ERROR_MESSAGE_HANDLER, thread);
		try {
		    if (NIL == sqlc_channel(connection)) {
			Errors.error($str133$Trying_to_read_from_a_null_sqlc_c);
		    }
		    final SubLObject lock = sqlc_lock(connection);
		    SubLObject release = NIL;
		    try {
			release = seize_lock(lock);
			queues.enqueue(ticket, sqlc_tickets(connection));
			cfasl_output(cons(function, args), sqlc_channel(connection));
			force_output(sqlc_channel(connection));
		    } finally {
			if (NIL != release) {
			    release_lock(lock);
			}
		    }
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
	    response = new_sdbc_error($client_error$.getGlobalValue(), error_message, UNPROVIDED);
	}
	return response;
    }

    /**
    * Send FUNCTION applied to ARGS over CONNECTION
    *
    * @param CONNECTION
    	sql-connection-p
    * 		
    * @param FUNCTION
    	positive-integer-p
    * 		
    * @param ARGS
    	listp
    * 		
    * @return nil or sql-error-p; nil on successful sending, an appropriate error
    response otherwise
    */

    /**
     *
     *
     * @param CONNECTION
    sql-connection-p
     * 		
     * @return consp; a response from CONNECTION
     * @unknown responses are conses whose car is the type of response and whose cdr
    is the response value
     */
    @LispMethod(comment = "@param CONNECTION\nsql-connection-p\r\n\t\t\r\n@return consp; a response from CONNECTION\r\n@unknown responses are conses whose car is the type of response and whose cdr\r\nis the response value")
    public static final SubLObject sqlc_receive_alt(SubLObject connection) {
	{
	    SubLObject error_message = NIL;
	    SubLObject response = NIL;
	    try {
		{
		    SubLObject _prev_bind_0 = currentBinding(Errors.$error_handler$);
		    try {
			bind(Errors.$error_handler$, CATCH_ERROR_MESSAGE_HANDLER);
			try {
			    response = cfasl_input(sqlc_channel(connection), UNPROVIDED, UNPROVIDED);
			} catch (Throwable catch_var) {
			    Errors.handleThrowable(catch_var, NIL);
			}
		    } finally {
			rebind(Errors.$error_handler$, _prev_bind_0);
		    }
		}
	    } catch (Throwable ccatch_env_var) {
		error_message = Errors.handleThrowable(ccatch_env_var, $catch_error_message_target$.getGlobalValue());
	    }
	    if (NIL != error_message) {
		response = cons($client_error$.getGlobalValue(), list(error_message));
	    }
	    return sql_response_value(response);
	}
    }

    /**
     *
     *
     * @param CONNECTION
    sql-connection-p
     * 		
     * @return consp; a response from CONNECTION
     * @unknown responses are conses whose car is the type of response and whose cdr
    is the response value
     */
    @LispMethod(comment = "@param CONNECTION\nsql-connection-p\r\n\t\t\r\n@return consp; a response from CONNECTION\r\n@unknown responses are conses whose car is the type of response and whose cdr\r\nis the response value")
    public static SubLObject sqlc_receive(final SubLObject connection) {
	final SubLThread thread = SubLProcess.currentSubLThread();
	SubLTrampolineFile.enforceType(connection, SQL_CONNECTION_P);
	SubLObject error_message = NIL;
	SubLObject response = NIL;
	try {
	    thread.throwStack.push($catch_error_message_target$.getGlobalValue());
	    final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
	    try {
		Errors.$error_handler$.bind(CATCH_ERROR_MESSAGE_HANDLER, thread);
		try {
		    if (NIL == sqlc_channel(connection)) {
			Errors.error($str133$Trying_to_read_from_a_null_sqlc_c);
		    }
		    response = cfasl_input(sqlc_channel(connection), UNPROVIDED, UNPROVIDED);
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
	    response = cons($client_error$.getGlobalValue(), list(error_message));
	}
	return sql_response_value(response);
    }

    /**
     * Handles ERROR depending on CONNECTION's error-handling settings
     *
     * @param CONNECTION
    sql-connection-p
     * 		
     * @param ERROR
    sdbc-error-p
     * 		
     */
    @LispMethod(comment = "Handles ERROR depending on CONNECTION\'s error-handling settings\r\n\r\n@param CONNECTION\nsql-connection-p\r\n\t\t\r\n@param ERROR\nsdbc-error-p")
    public static final SubLObject sqlc_handle_error_alt(SubLObject connection, SubLObject error) {
	{
	    SubLObject pcase_var = sqlc_error_handling(connection);
	    if (pcase_var.eql($RETURN)) {
		return error;
	    } else {
		if (pcase_var.eql($THROW)) {
		    sdbc_error_throw(error);
		    return error;
		} else {
		    if (pcase_var.eql($WARN)) {
			sdbc_error_warn(error);
			return error;
		    } else {
			SubLTrampolineFile.checkType(sqlc_error_handling(connection), SDBC_ERROR_HANDLING_TAG_P);
		    }
		}
	    }
	}
	return NIL;
    }

    @LispMethod(comment = "Handles ERROR depending on CONNECTION\'s error-handling settings\r\n\r\n@param CONNECTION\n\t\tsql-connection-p\r\n\t\t\r\n@param ERROR\n\t\tsdbc-error-p")
    public static SubLObject sqlc_handle_error(final SubLObject connection, final SubLObject error) {
	final SubLObject pcase_var = sqlc_error_handling(connection);
	if (pcase_var.eql($RETURN)) {
	    return error;
	}
	if (pcase_var.eql($THROW)) {
	    sdbc_error_throw(error);
	    return error;
	}
	if (pcase_var.eql($WARN)) {
	    sdbc_error_warn(error);
	    return error;
	}
	assert NIL != sdbc_error_handling_tag_p(sqlc_error_handling(connection)) : "! sdbc.sdbc_error_handling_tag_p(sdbc.sqlc_error_handling(connection)) "
		+ ("sdbc.sdbc_error_handling_tag_p(sdbc.sqlc_error_handling(connection)) " + "CommonSymbols.NIL != sdbc.sdbc_error_handling_tag_p(sdbc.sqlc_error_handling(connection)) ") + sqlc_error_handling(connection);
	return NIL;
    }

    /**
    * Handles ERROR depending on CONNECTION's error-handling settings
    *
    * @param CONNECTION
    	sql-connection-p
    * 		
    * @param ERROR
    	sdbc-error-p
    * 		
    */

    /**
     *
     *
     * @return boolean; t if OBJECT is a valid transaction level, nil otherwise
    :transaction-none means that transactions are not supported,
    :transaction-read-committed means that dirty read are prevented; non-repeatable
    non-repeatable reads and phantom reads can occur,
    :transaction-read-uncommitted means that dirty reads, non-repeatable reads and
    phantom reads can occur,
    :transaction-repeatable-read means that dirty reads and non-repeatable reads
    are prevented; phantom reads can occur, and
    :transaction-serializable means that dirty reads, non-repeatable reads and
    phantom reads are prevented
     */
    @LispMethod(comment = "@return boolean; t if OBJECT is a valid transaction level, nil otherwise\r\n:transaction-none means that transactions are not supported,\r\n:transaction-read-committed means that dirty read are prevented; non-repeatable\r\nnon-repeatable reads and phantom reads can occur,\r\n:transaction-read-uncommitted means that dirty reads, non-repeatable reads and\r\nphantom reads can occur,\r\n:transaction-repeatable-read means that dirty reads and non-repeatable reads\r\nare prevented; phantom reads can occur, and\r\n:transaction-serializable means that dirty reads, non-repeatable reads and\r\nphantom reads are prevented")
    public static final SubLObject sql_transaction_level_p_alt(SubLObject v_object) {
	return member(v_object, $list_alt121, UNPROVIDED, UNPROVIDED);
    }

    /**
     *
     *
     * @return boolean; t if OBJECT is a valid transaction level, nil otherwise
    :transaction-none means that transactions are not supported,
    :transaction-read-committed means that dirty read are prevented; non-repeatable
    non-repeatable reads and phantom reads can occur,
    :transaction-read-uncommitted means that dirty reads, non-repeatable reads and
    phantom reads can occur,
    :transaction-repeatable-read means that dirty reads and non-repeatable reads
    are prevented; phantom reads can occur, and
    :transaction-serializable means that dirty reads, non-repeatable reads and
    phantom reads are prevented
     */
    @LispMethod(comment = "@return boolean; t if OBJECT is a valid transaction level, nil otherwise\r\n:transaction-none means that transactions are not supported,\r\n:transaction-read-committed means that dirty read are prevented; non-repeatable\r\nnon-repeatable reads and phantom reads can occur,\r\n:transaction-read-uncommitted means that dirty reads, non-repeatable reads and\r\nphantom reads can occur,\r\n:transaction-repeatable-read means that dirty reads and non-repeatable reads\r\nare prevented; phantom reads can occur, and\r\n:transaction-serializable means that dirty reads, non-repeatable reads and\r\nphantom reads are prevented")
    public static SubLObject sql_transaction_level_p(final SubLObject v_object) {
	return member(v_object, $list137, UNPROVIDED, UNPROVIDED);
    }

    /**
     *
     *
     * @param CONNECTION
    sql-connection-p
     * 		
     * @param ERROR-HANDLING
    sdbc-error-handling-tag-p
     * 		
     * @return sql-connection
     */
    @LispMethod(comment = "@param CONNECTION\nsql-connection-p\r\n\t\t\r\n@param ERROR-HANDLING\nsdbc-error-handling-tag-p\r\n\t\t\r\n@return sql-connection")
    public static final SubLObject sqlc_set_error_handling_alt(SubLObject connection, SubLObject error_handling) {
	_csetf_sqlc_error_handling(connection, error_handling);
	return connection;
    }

    /**
     *
     *
     * @param CONNECTION
    sql-connection-p
     * 		
     * @param ERROR-HANDLING
    sdbc-error-handling-tag-p
     * 		
     * @return sql-connection
     */
    @LispMethod(comment = "@param CONNECTION\nsql-connection-p\r\n\t\t\r\n@param ERROR-HANDLING\nsdbc-error-handling-tag-p\r\n\t\t\r\n@return sql-connection")
    public static SubLObject sqlc_set_error_handling(final SubLObject connection, final SubLObject error_handling) {
	_csetf_sqlc_error_handling(connection, error_handling);
	return connection;
    }

    /**
     * Returns a new sql response of type CODE and content VALUE
     */
    @LispMethod(comment = "Returns a new sql response of type CODE and content VALUE")
    public static final SubLObject new_sql_response_alt(SubLObject code, SubLObject value) {
	return cons(code, value);
    }

    @LispMethod(comment = "Returns a new sql response of type CODE and content VALUE")
    public static SubLObject new_sql_response(final SubLObject code, final SubLObject value) {
	return cons(code, value);
    }

    /**
    * Returns a new sql response of type CODE and content VALUE
    */

    /**
     * Returns the type of RESPONSE
     */
    @LispMethod(comment = "Returns the type of RESPONSE")
    public static final SubLObject sql_response_code_alt(SubLObject response) {
	return response.first();
    }

    @LispMethod(comment = "Returns the type of RESPONSE")
    public static SubLObject sql_response_code(final SubLObject response) {
	return response.first();
    }

    /**
    * Returns the type of RESPONSE
    */

    /**
     * Returns the actual value (as opposed to the type) of RESPONSE
     */
    @LispMethod(comment = "Returns the actual value (as opposed to the type) of RESPONSE")
    public static final SubLObject sql_response_value_alt(SubLObject response) {
	{
	    SubLObject code = sql_response_code(response);
	    if (code.isNegative()) {
		{
		    SubLObject args = response.rest();
		    SubLObject message = args.first();
		    SubLObject vendor_code = second(args);
		    return new_sdbc_error(code, message, vendor_code);
		}
	    } else {
		if (code.eql($stop_response$.getGlobalValue())) {
		    return $STOP;
		} else {
		    return response.rest();
		}
	    }
	}
    }

    @LispMethod(comment = "Returns the actual value (as opposed to the type) of RESPONSE")
    public static SubLObject sql_response_value(final SubLObject response) {
	final SubLObject code = sql_response_code(response);
	if (code.isNegative()) {
	    final SubLObject args = response.rest();
	    final SubLObject message = args.first();
	    final SubLObject vendor_code = second(args);
	    return new_sdbc_error(code, message, vendor_code);
	}
	if (code.eql($stop_response$.getGlobalValue())) {
	    return $STOP;
	}
	return response.rest();
    }

    /**
    * Returns the actual value (as opposed to the type) of RESPONSE
    */

    /**
     *
     *
     * @return booleanp; t if OBJECT is the reserved SQL type NULL, nil otherwise
     */
    @LispMethod(comment = "@return booleanp; t if OBJECT is the reserved SQL type NULL, nil otherwise")
    public static final SubLObject sql_null_p_alt(SubLObject v_object) {
	return eq(v_object, $NULL);
    }

    /**
     *
     *
     * @return booleanp; t if OBJECT is the reserved SQL type NULL, nil otherwise
     */
    @LispMethod(comment = "@return booleanp; t if OBJECT is the reserved SQL type NULL, nil otherwise")
    public static SubLObject sql_null_p(final SubLObject v_object) {
	return eq(v_object, $NULL);
    }

    /**
     *
     *
     * @return booleanp; t if OBJECT is boolean SQL type true, nil otherwise
     */
    @LispMethod(comment = "@return booleanp; t if OBJECT is boolean SQL type true, nil otherwise")
    public static final SubLObject sql_true_p_alt(SubLObject v_object) {
	return v_object;
    }

    /**
     *
     *
     * @return booleanp; t if OBJECT is boolean SQL type true, nil otherwise
     */
    @LispMethod(comment = "@return booleanp; t if OBJECT is boolean SQL type true, nil otherwise")
    public static SubLObject sql_true_p(final SubLObject v_object) {
	return v_object;
    }

    /**
     *
     *
     * @return booleanp; t if OBJECT is boolean SQL type false, nil otherwise
     */
    @LispMethod(comment = "@return booleanp; t if OBJECT is boolean SQL type false, nil otherwise")
    public static final SubLObject sql_false_p_alt(SubLObject v_object) {
	return makeBoolean(NIL == v_object);
    }

    /**
     *
     *
     * @return booleanp; t if OBJECT is boolean SQL type false, nil otherwise
     */
    @LispMethod(comment = "@return booleanp; t if OBJECT is boolean SQL type false, nil otherwise")
    public static SubLObject sql_false_p(final SubLObject v_object) {
	return makeBoolean(NIL == v_object);
    }

    public static final SubLObject sdbc_error_print_function_trampoline_alt(SubLObject v_object, SubLObject stream) {
	sdbc_error_print(v_object, stream, ZERO_INTEGER);
	return NIL;
    }

    public static SubLObject sdbc_error_print_function_trampoline(final SubLObject v_object, final SubLObject stream) {
	sdbc_error_print(v_object, stream, ZERO_INTEGER);
	return NIL;
    }

    public static final SubLObject sdbc_error_p_alt(SubLObject v_object) {
	return v_object.getClass() == com.cyc.cycjava.cycl.sdbc.$sdbc_error_native.class ? ((SubLObject) (T)) : NIL;
    }

    public static SubLObject sdbc_error_p(final SubLObject v_object) {
	return v_object.getClass() == com.cyc.cycjava.cycl.sdbc.$sdbc_error_native.class ? T : NIL;
    }

    public static final SubLObject sdbc_error_type_alt(SubLObject v_object) {
	SubLTrampolineFile.checkType(v_object, SDBC_ERROR_P);
	return v_object.getField2();
    }

    public static SubLObject sdbc_error_type(final SubLObject v_object) {
	assert NIL != sdbc_error_p(v_object) : "! sdbc.sdbc_error_p(v_object) " + "sdbc.sdbc_error_p error :" + v_object;
	return v_object.getField2();
    }

    public static final SubLObject sdbc_error_message_alt(SubLObject v_object) {
	SubLTrampolineFile.checkType(v_object, SDBC_ERROR_P);
	return v_object.getField3();
    }

    public static SubLObject sdbc_error_message(final SubLObject v_object) {
	assert NIL != sdbc_error_p(v_object) : "! sdbc.sdbc_error_p(v_object) " + "sdbc.sdbc_error_p error :" + v_object;
	return v_object.getField3();
    }

    public static final SubLObject sdbc_error_code_alt(SubLObject v_object) {
	SubLTrampolineFile.checkType(v_object, SDBC_ERROR_P);
	return v_object.getField4();
    }

    public static SubLObject sdbc_error_code(final SubLObject v_object) {
	assert NIL != sdbc_error_p(v_object) : "! sdbc.sdbc_error_p(v_object) " + "sdbc.sdbc_error_p error :" + v_object;
	return v_object.getField4();
    }

    public static final SubLObject _csetf_sdbc_error_type_alt(SubLObject v_object, SubLObject value) {
	SubLTrampolineFile.checkType(v_object, SDBC_ERROR_P);
	return v_object.setField2(value);
    }

    public static SubLObject _csetf_sdbc_error_type(final SubLObject v_object, final SubLObject value) {
	assert NIL != sdbc_error_p(v_object) : "! sdbc.sdbc_error_p(v_object) " + "sdbc.sdbc_error_p error :" + v_object;
	return v_object.setField2(value);
    }

    public static final SubLObject _csetf_sdbc_error_message_alt(SubLObject v_object, SubLObject value) {
	SubLTrampolineFile.checkType(v_object, SDBC_ERROR_P);
	return v_object.setField3(value);
    }

    public static SubLObject _csetf_sdbc_error_message(final SubLObject v_object, final SubLObject value) {
	assert NIL != sdbc_error_p(v_object) : "! sdbc.sdbc_error_p(v_object) " + "sdbc.sdbc_error_p error :" + v_object;
	return v_object.setField3(value);
    }

    public static final SubLObject _csetf_sdbc_error_code_alt(SubLObject v_object, SubLObject value) {
	SubLTrampolineFile.checkType(v_object, SDBC_ERROR_P);
	return v_object.setField4(value);
    }

    public static SubLObject _csetf_sdbc_error_code(final SubLObject v_object, final SubLObject value) {
	assert NIL != sdbc_error_p(v_object) : "! sdbc.sdbc_error_p(v_object) " + "sdbc.sdbc_error_p error :" + v_object;
	return v_object.setField4(value);
    }

    public static final SubLObject make_sdbc_error_alt(SubLObject arglist) {
	if (arglist == UNPROVIDED) {
	    arglist = NIL;
	}
	{
	    SubLObject v_new = new com.cyc.cycjava.cycl.sdbc.$sdbc_error_native();
	    SubLObject next = NIL;
	    for (next = arglist; NIL != next; next = cddr(next)) {
		{
		    SubLObject current_arg = next.first();
		    SubLObject current_value = cadr(next);
		    SubLObject pcase_var = current_arg;
		    if (pcase_var.eql($TYPE)) {
			_csetf_sdbc_error_type(v_new, current_value);
		    } else {
			if (pcase_var.eql($MESSAGE)) {
			    _csetf_sdbc_error_message(v_new, current_value);
			} else {
			    if (pcase_var.eql($CODE)) {
				_csetf_sdbc_error_code(v_new, current_value);
			    } else {
				Errors.error($str_alt81$Invalid_slot__S_for_construction_, current_arg);
			    }
			}
		    }
		}
	    }
	    return v_new;
	}
    }

    public static SubLObject make_sdbc_error(SubLObject arglist) {
	if (arglist == UNPROVIDED) {
	    arglist = NIL;
	}
	final SubLObject v_new = new com.cyc.cycjava.cycl.sdbc.$sdbc_error_native();
	SubLObject next;
	SubLObject current_arg;
	SubLObject current_value;
	SubLObject pcase_var;
	for (next = NIL, next = arglist; NIL != next; next = cddr(next)) {
	    current_arg = next.first();
	    current_value = cadr(next);
	    pcase_var = current_arg;
	    if (pcase_var.eql($TYPE)) {
		_csetf_sdbc_error_type(v_new, current_value);
	    } else if (pcase_var.eql($MESSAGE)) {
		_csetf_sdbc_error_message(v_new, current_value);
	    } else if (pcase_var.eql($CODE)) {
		_csetf_sdbc_error_code(v_new, current_value);
	    } else {
		Errors.error($str82$Invalid_slot__S_for_construction_, current_arg);
	    }

	}
	return v_new;
    }

    public static SubLObject visit_defstruct_sdbc_error(final SubLObject obj, final SubLObject visitor_fn) {
	funcall(visitor_fn, obj, $BEGIN, MAKE_SDBC_ERROR, THREE_INTEGER);
	funcall(visitor_fn, obj, $SLOT, $TYPE, sdbc_error_type(obj));
	funcall(visitor_fn, obj, $SLOT, $MESSAGE, sdbc_error_message(obj));
	funcall(visitor_fn, obj, $SLOT, $CODE, sdbc_error_code(obj));
	funcall(visitor_fn, obj, $END, MAKE_SDBC_ERROR, THREE_INTEGER);
	return obj;
    }

    public static SubLObject visit_defstruct_object_sdbc_error_method(final SubLObject obj, final SubLObject visitor_fn) {
	return visit_defstruct_sdbc_error(obj, visitor_fn);
    }

    /**
     * Throws the sdbc error ERROR
     */
    @LispMethod(comment = "Throws the sdbc error ERROR")
    public static final SubLObject sdbc_error_throw_alt(SubLObject error) {
	SubLTrampolineFile.checkType(error, SDBC_ERROR_P);
	Errors.error($str_alt143$_a, sdbc_error_message(error));
	return NIL;
    }

    @LispMethod(comment = "Throws the sdbc error ERROR")
    public static SubLObject sdbc_error_throw(final SubLObject error) {
	assert NIL != sdbc_error_p(error) : "! sdbc.sdbc_error_p(error) " + ("sdbc.sdbc_error_p(error) " + "CommonSymbols.NIL != sdbc.sdbc_error_p(error) ") + error;
	Errors.error($str162$_a, sdbc_error_message(error));
	return NIL;
    }

    /**
    * Throws the sdbc error ERROR
    */

    /**
     * Warns the sdbc error ERROR
     */
    @LispMethod(comment = "Warns the sdbc error ERROR")
    public static final SubLObject sdbc_error_warn_alt(SubLObject error) {
	SubLTrampolineFile.checkType(error, SDBC_ERROR_P);
	Errors.warn($str_alt144$SDBC__a___a, decode_sdbc_error_code(sdbc_error_type(error)), sdbc_error_message(error));
	return NIL;
    }

    @LispMethod(comment = "Warns the sdbc error ERROR")
    public static SubLObject sdbc_error_warn(final SubLObject error) {
	assert NIL != sdbc_error_p(error) : "! sdbc.sdbc_error_p(error) " + ("sdbc.sdbc_error_p(error) " + "CommonSymbols.NIL != sdbc.sdbc_error_p(error) ") + error;
	Errors.warn($str163$SDBC__a___a, decode_sdbc_error_code(sdbc_error_type(error)), sdbc_error_message(error));
	return NIL;
    }

    /**
    * Warns the sdbc error ERROR
    */

    /**
     *
     *
     * @return boolean; t if OBJECT is an error originating on the sdbc server
     */
    @LispMethod(comment = "@return boolean; t if OBJECT is an error originating on the sdbc server")
    public static final SubLObject sdbc_server_error_p_alt(SubLObject v_object) {
	return makeBoolean((NIL != sdbc_error_p(v_object)) && (NIL == sdbc_client_error_p(v_object)));
    }

    /**
     *
     *
     * @return boolean; t if OBJECT is an error originating on the sdbc server
     */
    @LispMethod(comment = "@return boolean; t if OBJECT is an error originating on the sdbc server")
    public static SubLObject sdbc_server_error_p(final SubLObject v_object) {
	return makeBoolean((NIL != sdbc_error_p(v_object)) && (NIL == sdbc_client_error_p(v_object)));
    }

    /**
     *
     *
     * @return boolean; t if OBJECT is an error originating on the sdbc client
     */
    @LispMethod(comment = "@return boolean; t if OBJECT is an error originating on the sdbc client")
    public static final SubLObject sdbc_client_error_p_alt(SubLObject v_object) {
	return makeBoolean((NIL != sdbc_error_p(v_object)) && sdbc_error_type(v_object).eql($client_error$.getGlobalValue()));
    }

    /**
     *
     *
     * @return boolean; t if OBJECT is an error originating on the sdbc client
     */
    @LispMethod(comment = "@return boolean; t if OBJECT is an error originating on the sdbc client")
    public static SubLObject sdbc_client_error_p(final SubLObject v_object) {
	return makeBoolean((NIL != sdbc_error_p(v_object)) && sdbc_error_type(v_object).eql($client_error$.getGlobalValue()));
    }

    /**
     *
     *
     * @return boolean; t if OBJECT is a server sql error
     */
    @LispMethod(comment = "@return boolean; t if OBJECT is a server sql error")
    public static final SubLObject sdbc_sql_error_p_alt(SubLObject v_object) {
	return makeBoolean((NIL != sdbc_error_p(v_object)) && sdbc_error_type(v_object).eql($sql_error$.getGlobalValue()));
    }

    /**
     *
     *
     * @return boolean; t if OBJECT is a server sql error
     */
    @LispMethod(comment = "@return boolean; t if OBJECT is a server sql error")
    public static SubLObject sdbc_sql_error_p(final SubLObject v_object) {
	return makeBoolean((NIL != sdbc_error_p(v_object)) && sdbc_error_type(v_object).eql($sql_error$.getGlobalValue()));
    }

    /**
     *
     *
     * @return boolean; t if OBJECT is a server io error
     */
    @LispMethod(comment = "@return boolean; t if OBJECT is a server io error")
    public static final SubLObject sdbc_io_error_p_alt(SubLObject v_object) {
	return makeBoolean((NIL != sdbc_error_p(v_object)) && sdbc_error_type(v_object).eql($io_error$.getGlobalValue()));
    }

    /**
     *
     *
     * @return boolean; t if OBJECT is a server io error
     */
    @LispMethod(comment = "@return boolean; t if OBJECT is a server io error")
    public static SubLObject sdbc_io_error_p(final SubLObject v_object) {
	return makeBoolean((NIL != sdbc_error_p(v_object)) && sdbc_error_type(v_object).eql($io_error$.getGlobalValue()));
    }

    /**
     *
     *
     * @return boolean; t if OBJECT is a server transaction error
     */
    @LispMethod(comment = "@return boolean; t if OBJECT is a server transaction error")
    public static final SubLObject sdbc_transaction_error_p_alt(SubLObject v_object) {
	return makeBoolean((NIL != sdbc_error_p(v_object)) && sdbc_error_type(v_object).eql($transaction_error$.getGlobalValue()));
    }

    /**
     *
     *
     * @return boolean; t if OBJECT is a server transaction error
     */
    @LispMethod(comment = "@return boolean; t if OBJECT is a server transaction error")
    public static SubLObject sdbc_transaction_error_p(final SubLObject v_object) {
	return makeBoolean((NIL != sdbc_error_p(v_object)) && sdbc_error_type(v_object).eql($transaction_error$.getGlobalValue()));
    }

    /**
     *
     *
     * @return boolean; t if OBJECT is a batch update error
     */
    @LispMethod(comment = "@return boolean; t if OBJECT is a batch update error")
    public static final SubLObject sdbc_batch_update_error_p_alt(SubLObject v_object) {
	return makeBoolean((NIL != sdbc_error_p(v_object)) && sdbc_error_type(v_object).eql($batch_update_error$.getGlobalValue()));
    }

    /**
     *
     *
     * @return boolean; t if OBJECT is a batch update error
     */
    @LispMethod(comment = "@return boolean; t if OBJECT is a batch update error")
    public static SubLObject sdbc_batch_update_error_p(final SubLObject v_object) {
	return makeBoolean((NIL != sdbc_error_p(v_object)) && sdbc_error_type(v_object).eql($batch_update_error$.getGlobalValue()));
    }

    /**
     *
     *
     * @return boolean; t if OBJECT is a server error other than an sql or io error
     */
    @LispMethod(comment = "@return boolean; t if OBJECT is a server error other than an sql or io error")
    public static final SubLObject sdbc_other_error_p_alt(SubLObject v_object) {
	return makeBoolean((NIL != sdbc_error_p(v_object)) && sdbc_error_type(v_object).eql($unknown_error$.getGlobalValue()));
    }

    /**
     *
     *
     * @return boolean; t if OBJECT is a server error other than an sql or io error
     */
    @LispMethod(comment = "@return boolean; t if OBJECT is a server error other than an sql or io error")
    public static SubLObject sdbc_other_error_p(final SubLObject v_object) {
	return makeBoolean((NIL != sdbc_error_p(v_object)) && sdbc_error_type(v_object).eql($unknown_error$.getGlobalValue()));
    }

    /**
     *
     *
     * @param TYPE
     * 		negative-integer-p; the type of this error
     * @param MESSAGE
     * 		stringp; the error message
     * @param CODE
     * 		integerp; the vendor code of this error, if any
     * @return sdbc-error-p; a new error of TYPE, MESSAGE and CODE
     */
    @LispMethod(comment = "@param TYPE\r\n\t\tnegative-integer-p; the type of this error\r\n@param MESSAGE\r\n\t\tstringp; the error message\r\n@param CODE\r\n\t\tintegerp; the vendor code of this error, if any\r\n@return sdbc-error-p; a new error of TYPE, MESSAGE and CODE")
    public static final SubLObject new_sdbc_error_alt(SubLObject type, SubLObject message, SubLObject code) {
	if (code == UNPROVIDED) {
	    code = NIL;
	}
	{
	    SubLObject error = make_sdbc_error(UNPROVIDED);
	    _csetf_sdbc_error_type(error, type);
	    _csetf_sdbc_error_message(error, message);
	    _csetf_sdbc_error_code(error, code);
	    return error;
	}
    }

    /**
     *
     *
     * @param TYPE
     * 		negative-integer-p; the type of this error
     * @param MESSAGE
     * 		stringp; the error message
     * @param CODE
     * 		integerp; the vendor code of this error, if any
     * @return sdbc-error-p; a new error of TYPE, MESSAGE and CODE
     */
    @LispMethod(comment = "@param TYPE\r\n\t\tnegative-integer-p; the type of this error\r\n@param MESSAGE\r\n\t\tstringp; the error message\r\n@param CODE\r\n\t\tintegerp; the vendor code of this error, if any\r\n@return sdbc-error-p; a new error of TYPE, MESSAGE and CODE")
    public static SubLObject new_sdbc_error(final SubLObject type, final SubLObject message, SubLObject code) {
	if (code == UNPROVIDED) {
	    code = NIL;
	}
	final SubLObject error = make_sdbc_error(UNPROVIDED);
	_csetf_sdbc_error_type(error, type);
	_csetf_sdbc_error_message(error, message);
	_csetf_sdbc_error_code(error, code);
	return error;
    }

    /**
     * Print ERROR to STREAM, ignoring DEPTH
     */
    @LispMethod(comment = "Print ERROR to STREAM, ignoring DEPTH")
    public static final SubLObject sdbc_error_print_alt(SubLObject error, SubLObject stream, SubLObject depth) {
	write_string($str_alt145$__SDBC, stream, UNPROVIDED, UNPROVIDED);
	write_string(decode_sdbc_error_code(sdbc_error_type(error)), stream, UNPROVIDED, UNPROVIDED);
	write_string($str_alt146$_ERROR__, stream, UNPROVIDED, UNPROVIDED);
	write_string(sdbc_error_message(error), stream, UNPROVIDED, UNPROVIDED);
	write_string($str_alt147$_, stream, UNPROVIDED, UNPROVIDED);
	return error;
    }

    @LispMethod(comment = "Print ERROR to STREAM, ignoring DEPTH")
    public static SubLObject sdbc_error_print(final SubLObject error, final SubLObject stream, final SubLObject depth) {
	write_string($str164$__SDBC, stream, UNPROVIDED, UNPROVIDED);
	write_string(decode_sdbc_error_code(sdbc_error_type(error)), stream, UNPROVIDED, UNPROVIDED);
	write_string($str165$_ERROR__, stream, UNPROVIDED, UNPROVIDED);
	write_string(sdbc_error_message(error), stream, UNPROVIDED, UNPROVIDED);
	write_string($str166$_, stream, UNPROVIDED, UNPROVIDED);
	return error;
    }

    /**
    * Print ERROR to STREAM, ignoring DEPTH
    */

    /**
     *
     *
     * @param CODE
     * 		negative-integer-p; an sdbc error code
     * @return stringp; a string representation of CODE
     */
    @LispMethod(comment = "@param CODE\r\n\t\tnegative-integer-p; an sdbc error code\r\n@return stringp; a string representation of CODE")
    public static final SubLObject decode_sdbc_error_code_alt(SubLObject code) {
	{
	    final SubLThread thread = SubLProcess.currentSubLThread();
	    return assoc(code, $sdbc_error_decoding$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED).rest();
	}
    }

    /**
     *
     *
     * @param CODE
     * 		negative-integer-p; an sdbc error code
     * @return stringp; a string representation of CODE
     */
    @LispMethod(comment = "@param CODE\r\n\t\tnegative-integer-p; an sdbc error code\r\n@return stringp; a string representation of CODE")
    public static SubLObject decode_sdbc_error_code(final SubLObject code) {
	final SubLThread thread = SubLProcess.currentSubLThread();
	return assoc(code, $sdbc_error_decoding$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED).rest();
    }

    public static final SubLObject sql_result_set_print_function_trampoline_alt(SubLObject v_object, SubLObject stream) {
	sqlrs_print(v_object, stream, ZERO_INTEGER);
	return NIL;
    }

    public static SubLObject sql_result_set_print_function_trampoline(final SubLObject v_object, final SubLObject stream) {
	sqlrs_print(v_object, stream, ZERO_INTEGER);
	return NIL;
    }

    public static final SubLObject sql_result_set_p_alt(SubLObject v_object) {
	return v_object.getClass() == com.cyc.cycjava.cycl.sdbc.$sql_result_set_native.class ? ((SubLObject) (T)) : NIL;
    }

    public static SubLObject sql_result_set_p(final SubLObject v_object) {
	return v_object.getClass() == com.cyc.cycjava.cycl.sdbc.$sql_result_set_native.class ? T : NIL;
    }

    public static final SubLObject sqlrs_rows_alt(SubLObject v_object) {
	SubLTrampolineFile.checkType(v_object, SQL_RESULT_SET_P);
	return v_object.getField2();
    }

    public static SubLObject sqlrs_rows(final SubLObject v_object) {
	assert NIL != sql_result_set_p(v_object) : "! sdbc.sql_result_set_p(v_object) " + "sdbc.sql_result_set_p error :" + v_object;
	return v_object.getField2();
    }

    public static final SubLObject sqlrs_current_alt(SubLObject v_object) {
	SubLTrampolineFile.checkType(v_object, SQL_RESULT_SET_P);
	return v_object.getField3();
    }

    public static SubLObject sqlrs_current(final SubLObject v_object) {
	assert NIL != sql_result_set_p(v_object) : "! sdbc.sql_result_set_p(v_object) " + "sdbc.sql_result_set_p error :" + v_object;
	return v_object.getField3();
    }

    public static final SubLObject sqlrs_last_alt(SubLObject v_object) {
	SubLTrampolineFile.checkType(v_object, SQL_RESULT_SET_P);
	return v_object.getField4();
    }

    public static SubLObject sqlrs_last(final SubLObject v_object) {
	assert NIL != sql_result_set_p(v_object) : "! sdbc.sql_result_set_p(v_object) " + "sdbc.sql_result_set_p error :" + v_object;
	return v_object.getField4();
    }

    public static final SubLObject sqlrs_start_alt(SubLObject v_object) {
	SubLTrampolineFile.checkType(v_object, SQL_RESULT_SET_P);
	return v_object.getField5();
    }

    public static SubLObject sqlrs_start(final SubLObject v_object) {
	assert NIL != sql_result_set_p(v_object) : "! sdbc.sql_result_set_p(v_object) " + "sdbc.sql_result_set_p error :" + v_object;
	return v_object.getField5();
    }

    public static final SubLObject sqlrs_connection_alt(SubLObject v_object) {
	SubLTrampolineFile.checkType(v_object, SQL_RESULT_SET_P);
	return v_object.getField6();
    }

    public static SubLObject sqlrs_connection(final SubLObject v_object) {
	assert NIL != sql_result_set_p(v_object) : "! sdbc.sql_result_set_p(v_object) " + "sdbc.sql_result_set_p error :" + v_object;
	return v_object.getField6();
    }

    public static final SubLObject sqlrs_block_size_alt(SubLObject v_object) {
	SubLTrampolineFile.checkType(v_object, SQL_RESULT_SET_P);
	return v_object.getField7();
    }

    public static SubLObject sqlrs_block_size(final SubLObject v_object) {
	assert NIL != sql_result_set_p(v_object) : "! sdbc.sql_result_set_p(v_object) " + "sdbc.sql_result_set_p error :" + v_object;
	return v_object.getField7();
    }

    public static final SubLObject sqlrs_id_alt(SubLObject v_object) {
	SubLTrampolineFile.checkType(v_object, SQL_RESULT_SET_P);
	return v_object.getField8();
    }

    public static SubLObject sqlrs_id(final SubLObject v_object) {
	assert NIL != sql_result_set_p(v_object) : "! sdbc.sql_result_set_p(v_object) " + "sdbc.sql_result_set_p error :" + v_object;
	return v_object.getField8();
    }

    public static final SubLObject _csetf_sqlrs_rows_alt(SubLObject v_object, SubLObject value) {
	SubLTrampolineFile.checkType(v_object, SQL_RESULT_SET_P);
	return v_object.setField2(value);
    }

    public static SubLObject _csetf_sqlrs_rows(final SubLObject v_object, final SubLObject value) {
	assert NIL != sql_result_set_p(v_object) : "! sdbc.sql_result_set_p(v_object) " + "sdbc.sql_result_set_p error :" + v_object;
	return v_object.setField2(value);
    }

    public static final SubLObject _csetf_sqlrs_current_alt(SubLObject v_object, SubLObject value) {
	SubLTrampolineFile.checkType(v_object, SQL_RESULT_SET_P);
	return v_object.setField3(value);
    }

    public static SubLObject _csetf_sqlrs_current(final SubLObject v_object, final SubLObject value) {
	assert NIL != sql_result_set_p(v_object) : "! sdbc.sql_result_set_p(v_object) " + "sdbc.sql_result_set_p error :" + v_object;
	return v_object.setField3(value);
    }

    public static final SubLObject _csetf_sqlrs_last_alt(SubLObject v_object, SubLObject value) {
	SubLTrampolineFile.checkType(v_object, SQL_RESULT_SET_P);
	return v_object.setField4(value);
    }

    public static SubLObject _csetf_sqlrs_last(final SubLObject v_object, final SubLObject value) {
	assert NIL != sql_result_set_p(v_object) : "! sdbc.sql_result_set_p(v_object) " + "sdbc.sql_result_set_p error :" + v_object;
	return v_object.setField4(value);
    }

    public static final SubLObject _csetf_sqlrs_start_alt(SubLObject v_object, SubLObject value) {
	SubLTrampolineFile.checkType(v_object, SQL_RESULT_SET_P);
	return v_object.setField5(value);
    }

    public static SubLObject _csetf_sqlrs_start(final SubLObject v_object, final SubLObject value) {
	assert NIL != sql_result_set_p(v_object) : "! sdbc.sql_result_set_p(v_object) " + "sdbc.sql_result_set_p error :" + v_object;
	return v_object.setField5(value);
    }

    public static final SubLObject _csetf_sqlrs_connection_alt(SubLObject v_object, SubLObject value) {
	SubLTrampolineFile.checkType(v_object, SQL_RESULT_SET_P);
	return v_object.setField6(value);
    }

    public static SubLObject _csetf_sqlrs_connection(final SubLObject v_object, final SubLObject value) {
	assert NIL != sql_result_set_p(v_object) : "! sdbc.sql_result_set_p(v_object) " + "sdbc.sql_result_set_p error :" + v_object;
	return v_object.setField6(value);
    }

    public static final SubLObject _csetf_sqlrs_block_size_alt(SubLObject v_object, SubLObject value) {
	SubLTrampolineFile.checkType(v_object, SQL_RESULT_SET_P);
	return v_object.setField7(value);
    }

    public static SubLObject _csetf_sqlrs_block_size(final SubLObject v_object, final SubLObject value) {
	assert NIL != sql_result_set_p(v_object) : "! sdbc.sql_result_set_p(v_object) " + "sdbc.sql_result_set_p error :" + v_object;
	return v_object.setField7(value);
    }

    public static final SubLObject _csetf_sqlrs_id_alt(SubLObject v_object, SubLObject value) {
	SubLTrampolineFile.checkType(v_object, SQL_RESULT_SET_P);
	return v_object.setField8(value);
    }

    public static SubLObject _csetf_sqlrs_id(final SubLObject v_object, final SubLObject value) {
	assert NIL != sql_result_set_p(v_object) : "! sdbc.sql_result_set_p(v_object) " + "sdbc.sql_result_set_p error :" + v_object;
	return v_object.setField8(value);
    }

    public static final SubLObject make_sql_result_set_alt(SubLObject arglist) {
	if (arglist == UNPROVIDED) {
	    arglist = NIL;
	}
	{
	    SubLObject v_new = new com.cyc.cycjava.cycl.sdbc.$sql_result_set_native();
	    SubLObject next = NIL;
	    for (next = arglist; NIL != next; next = cddr(next)) {
		{
		    SubLObject current_arg = next.first();
		    SubLObject current_value = cadr(next);
		    SubLObject pcase_var = current_arg;
		    if (pcase_var.eql($ROWS)) {
			_csetf_sqlrs_rows(v_new, current_value);
		    } else {
			if (pcase_var.eql($CURRENT)) {
			    _csetf_sqlrs_current(v_new, current_value);
			} else {
			    if (pcase_var.eql($LAST)) {
				_csetf_sqlrs_last(v_new, current_value);
			    } else {
				if (pcase_var.eql($START)) {
				    _csetf_sqlrs_start(v_new, current_value);
				} else {
				    if (pcase_var.eql($CONNECTION)) {
					_csetf_sqlrs_connection(v_new, current_value);
				    } else {
					if (pcase_var.eql($BLOCK_SIZE)) {
					    _csetf_sqlrs_block_size(v_new, current_value);
					} else {
					    if (pcase_var.eql($ID)) {
						_csetf_sqlrs_id(v_new, current_value);
					    } else {
						Errors.error($str_alt81$Invalid_slot__S_for_construction_, current_arg);
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

    public static SubLObject make_sql_result_set(SubLObject arglist) {
	if (arglist == UNPROVIDED) {
	    arglist = NIL;
	}
	final SubLObject v_new = new com.cyc.cycjava.cycl.sdbc.$sql_result_set_native();
	SubLObject next;
	SubLObject current_arg;
	SubLObject current_value;
	SubLObject pcase_var;
	for (next = NIL, next = arglist; NIL != next; next = cddr(next)) {
	    current_arg = next.first();
	    current_value = cadr(next);
	    pcase_var = current_arg;
	    if (pcase_var.eql($ROWS)) {
		_csetf_sqlrs_rows(v_new, current_value);
	    } else if (pcase_var.eql($CURRENT)) {
		_csetf_sqlrs_current(v_new, current_value);
	    } else if (pcase_var.eql($LAST)) {
		_csetf_sqlrs_last(v_new, current_value);
	    } else if (pcase_var.eql($START)) {
		_csetf_sqlrs_start(v_new, current_value);
	    } else if (pcase_var.eql($CONNECTION)) {
		_csetf_sqlrs_connection(v_new, current_value);
	    } else if (pcase_var.eql($BLOCK_SIZE)) {
		_csetf_sqlrs_block_size(v_new, current_value);
	    } else if (pcase_var.eql($ID)) {
		_csetf_sqlrs_id(v_new, current_value);
	    } else {
		Errors.error($str82$Invalid_slot__S_for_construction_, current_arg);
	    }

	}
	return v_new;
    }

    public static SubLObject visit_defstruct_sql_result_set(final SubLObject obj, final SubLObject visitor_fn) {
	funcall(visitor_fn, obj, $BEGIN, MAKE_SQL_RESULT_SET, SEVEN_INTEGER);
	funcall(visitor_fn, obj, $SLOT, $ROWS, sqlrs_rows(obj));
	funcall(visitor_fn, obj, $SLOT, $CURRENT, sqlrs_current(obj));
	funcall(visitor_fn, obj, $SLOT, $LAST, sqlrs_last(obj));
	funcall(visitor_fn, obj, $SLOT, $START, sqlrs_start(obj));
	funcall(visitor_fn, obj, $SLOT, $CONNECTION, sqlrs_connection(obj));
	funcall(visitor_fn, obj, $SLOT, $BLOCK_SIZE, sqlrs_block_size(obj));
	funcall(visitor_fn, obj, $SLOT, $ID, sqlrs_id(obj));
	funcall(visitor_fn, obj, $END, MAKE_SQL_RESULT_SET, SEVEN_INTEGER);
	return obj;
    }

    public static SubLObject visit_defstruct_object_sql_result_set_method(final SubLObject obj, final SubLObject visitor_fn) {
	return visit_defstruct_sql_result_set(obj, visitor_fn);
    }

    /**
     * Prints RS to STREAM, ignoring DEPTH
     */
    @LispMethod(comment = "Prints RS to STREAM, ignoring DEPTH")
    public static final SubLObject sqlrs_print_alt(SubLObject rs, SubLObject stream, SubLObject depth) {
	{
	    final SubLThread thread = SubLProcess.currentSubLThread();
	    if (NIL != $print_readably$.getDynamicValue(thread)) {
		print_not_readable(rs, stream);
	    } else {
		{
		    SubLObject v_object = rs;
		    SubLObject stream_9 = stream;
		    write_string($str_alt184$__, stream_9, UNPROVIDED, UNPROVIDED);
		    write(type_of(v_object), new SubLObject[] { $STREAM, stream_9 });
		    write_char(CHAR_space, stream_9);
		    if (NIL != sqlrs_open_p(rs)) {
			{
			    SubLObject row_count = sqlrs_row_count(rs);
			    SubLObject column_count = sqlrs_column_count(rs);
			    write_string($str_alt186$_, stream, UNPROVIDED, UNPROVIDED);
			    princ(row_count, stream);
			    write_string(row_count.numE(ONE_INTEGER) ? ((SubLObject) ($str_alt187$_row__)) : $str_alt188$_rows__, stream, UNPROVIDED, UNPROVIDED);
			    princ(column_count, stream);
			    write_string(column_count.numE(ONE_INTEGER) ? ((SubLObject) ($str_alt189$_column_)) : $str_alt190$_columns_, stream, UNPROVIDED, UNPROVIDED);
			}
		    } else {
			write_string($$$closed, stream, UNPROVIDED, UNPROVIDED);
		    }
		    write_char(CHAR_space, stream_9);
		    write(pointer(v_object), new SubLObject[] { $STREAM, stream_9, $BASE, SIXTEEN_INTEGER });
		    write_char(CHAR_greater, stream_9);
		}
	    }
	    return rs;
	}
    }

    @LispMethod(comment = "Prints RS to STREAM, ignoring DEPTH")
    public static SubLObject sqlrs_print(final SubLObject rs, final SubLObject stream, final SubLObject depth) {
	final SubLThread thread = SubLProcess.currentSubLThread();
	if (NIL != $print_readably$.getDynamicValue(thread)) {
	    print_not_readable(rs, stream);
	} else {
	    print_macros.print_unreadable_object_preamble(stream, rs, T, T);
	    if (NIL != sqlrs_open_p(rs)) {
		final SubLObject row_count = sqlrs_row_count(rs);
		final SubLObject column_count = sqlrs_column_count(rs);
		write_string($str206$_, stream, UNPROVIDED, UNPROVIDED);
		princ(row_count, stream);
		write_string(row_count.numE(ONE_INTEGER) ? $str207$_row__ : $str208$_rows__, stream, UNPROVIDED, UNPROVIDED);
		princ(column_count, stream);
		write_string(column_count.numE(ONE_INTEGER) ? $str209$_column_ : $str210$_columns_, stream, UNPROVIDED, UNPROVIDED);
	    } else {
		write_string($$$closed, stream, UNPROVIDED, UNPROVIDED);
	    }
	    print_macros.print_unreadable_object_postamble(stream, rs, T, T);
	}
	return rs;
    }

    /**
    * Prints RS to STREAM, ignoring DEPTH
    */

    /**
     *
     *
     * @return boolean; t if OBJECT is an open result set, nil otherwise
     */
    @LispMethod(comment = "@return boolean; t if OBJECT is an open result set, nil otherwise")
    public static final SubLObject sql_open_result_set_p_alt(SubLObject v_object) {
	return makeBoolean((NIL != sql_result_set_p(v_object)) && (NIL != sqlrs_open_p(v_object)));
    }

    /**
     *
     *
     * @return boolean; t if OBJECT is an open result set, nil otherwise
     */
    @LispMethod(comment = "@return boolean; t if OBJECT is an open result set, nil otherwise")
    public static SubLObject sql_open_result_set_p(final SubLObject v_object) {
	return makeBoolean((NIL != sql_result_set_p(v_object)) && (NIL != sqlrs_open_p(v_object)));
    }

    /**
     *
     *
     * @param RS
    sql-result-set-p;
     * 		
     * @return sql-result-set-p; the closed result-set RS
     * @unknown it is usually not neccessary to close a result set since it will be
    closed automatically when its statement is reexecuted or closed. Although
    it may be cleaner to close it explicitly, it involves another network transaction
     */
    @LispMethod(comment = "@param RS\nsql-result-set-p;\r\n\t\t\r\n@return sql-result-set-p; the closed result-set RS\r\n@unknown it is usually not neccessary to close a result set since it will be\r\nclosed automatically when its statement is reexecuted or closed. Although\r\nit may be cleaner to close it explicitly, it involves another network transaction")
    public static final SubLObject sqlrs_close_alt(SubLObject rs) {
	SubLTrampolineFile.checkType(rs, SQL_RESULT_SET_P);
	if (NIL != sqlrs_open_p(rs)) {
	    {
		SubLObject status = sqlc_execute(sqlrs_connection(rs), $close_result_set$.getGlobalValue(), list(sqlrs_id(rs)));
		sqlrs_local_close(rs);
		return NIL != sdbc_error_p(status) ? ((SubLObject) (status)) : rs;
	    }
	}
	return NIL;
    }

    /**
     *
     *
     * @param RS
    sql-result-set-p;
     * 		
     * @return sql-result-set-p; the closed result-set RS
     * @unknown it is usually not neccessary to close a result set since it will be
    closed automatically when its statement is reexecuted or closed. Although
    it may be cleaner to close it explicitly, it involves another network transaction
     */
    @LispMethod(comment = "@param RS\nsql-result-set-p;\r\n\t\t\r\n@return sql-result-set-p; the closed result-set RS\r\n@unknown it is usually not neccessary to close a result set since it will be\r\nclosed automatically when its statement is reexecuted or closed. Although\r\nit may be cleaner to close it explicitly, it involves another network transaction")
    public static SubLObject sqlrs_close(final SubLObject rs) {
	assert NIL != sql_result_set_p(rs) : "! sdbc.sql_result_set_p(rs) " + ("sdbc.sql_result_set_p(rs) " + "CommonSymbols.NIL != sdbc.sql_result_set_p(rs) ") + rs;
	if (NIL != sqlrs_open_p(rs)) {
	    final SubLObject status = sqlc_execute(sqlrs_connection(rs), $close_result_set$.getGlobalValue(), list(sqlrs_id(rs)));
	    sqlrs_local_close(rs);
	    return NIL != sdbc_error_p(status) ? status : rs;
	}
	return NIL;
    }

    /**
     * does the result set RS contain any results?
     */
    @LispMethod(comment = "does the result set RS contain any results?")
    public static final SubLObject sqlrs_emptyP_alt(SubLObject rs) {
	return eql(ZERO_INTEGER, sqlrs_row_count(rs));
    }

    @LispMethod(comment = "does the result set RS contain any results?")
    public static SubLObject sqlrs_emptyP(final SubLObject rs) {
	return eql(ZERO_INTEGER, sqlrs_row_count(rs));
    }

    /**
    * does the result set RS contain any results?
    */

    /**
     * Moves to the absolute row I of result set RS. If I is positive, counts from
     * the beginning of RS; if I is negative, counts from the end.
     */
    @LispMethod(comment = "Moves to the absolute row I of result set RS. If I is positive, counts from\r\nthe beginning of RS; if I is negative, counts from the end.\nMoves to the absolute row I of result set RS. If I is positive, counts from\nthe beginning of RS; if I is negative, counts from the end.")
    public static final SubLObject sqlrs_absolute_alt(SubLObject rs, SubLObject i) {
	SubLTrampolineFile.checkType(rs, SQL_OPEN_RESULT_SET_P);
	SubLTrampolineFile.checkType(i, INTEGERP);
	if (NIL != subl_promotions.negative_integer_p(i)) {
	    _csetf_sqlrs_current(rs, max(add(sqlrs_last(rs), ONE_INTEGER, i), ZERO_INTEGER));
	} else {
	    _csetf_sqlrs_current(rs, min(i, f_1X(sqlrs_last(rs))));
	}
	return sqlrs_valid_row_p(rs);
    }

    @LispMethod(comment = "Moves to the absolute row I of result set RS. If I is positive, counts from\r\nthe beginning of RS; if I is negative, counts from the end.\nMoves to the absolute row I of result set RS. If I is positive, counts from\nthe beginning of RS; if I is negative, counts from the end.")
    public static SubLObject sqlrs_absolute(final SubLObject rs, final SubLObject i) {
	assert NIL != sql_open_result_set_p(rs) : "! sdbc.sql_open_result_set_p(rs) " + ("sdbc.sql_open_result_set_p(rs) " + "CommonSymbols.NIL != sdbc.sql_open_result_set_p(rs) ") + rs;
	assert NIL != integerp(i) : "! integerp(i) " + ("Types.integerp(i) " + "CommonSymbols.NIL != Types.integerp(i) ") + i;
	if (NIL != subl_promotions.negative_integer_p(i)) {
	    _csetf_sqlrs_current(rs, max(add(sqlrs_last(rs), ONE_INTEGER, i), ZERO_INTEGER));
	} else {
	    _csetf_sqlrs_current(rs, min(i, number_utilities.f_1X(sqlrs_last(rs))));
	}
	return sqlrs_valid_row_p(rs);
    }

    /**
    * Moves to the absolute row I of result set RS. If I is positive, counts from
    * the beginning of RS; if I is negative, counts from the end.
    */

    /**
     * Moves to the next row of result set RS
     *
     * @return boolean; t if the next row is valid, nil otherwise
     */
    @LispMethod(comment = "Moves to the next row of result set RS\r\n\r\n@return boolean; t if the next row is valid, nil otherwise")
    public static final SubLObject sqlrs_next_alt(SubLObject rs) {
	SubLTrampolineFile.checkType(rs, SQL_OPEN_RESULT_SET_P);
	if (sqlrs_current(rs).numLE(sqlrs_last(rs))) {
	    _csetf_sqlrs_current(rs, add(sqlrs_current(rs), ONE_INTEGER));
	}
	return numLE(sqlrs_current(rs), sqlrs_last(rs));
    }

    @LispMethod(comment = "Moves to the next row of result set RS\r\n\r\n@return boolean; t if the next row is valid, nil otherwise")
    public static SubLObject sqlrs_next(final SubLObject rs) {
	assert NIL != sql_open_result_set_p(rs) : "! sdbc.sql_open_result_set_p(rs) " + ("sdbc.sql_open_result_set_p(rs) " + "CommonSymbols.NIL != sdbc.sql_open_result_set_p(rs) ") + rs;
	if (sqlrs_current(rs).numLE(sqlrs_last(rs))) {
	    _csetf_sqlrs_current(rs, add(sqlrs_current(rs), ONE_INTEGER));
	}
	return numLE(sqlrs_current(rs), sqlrs_last(rs));
    }

    /**
    * Moves to the next row of result set RS
    *
    * @return boolean; t if the next row is valid, nil otherwise
    */

    /**
     * Moves to the previous row of result set RS
     */
    @LispMethod(comment = "Moves to the previous row of result set RS")
    public static final SubLObject sqlrs_previous_alt(SubLObject rs) {
	SubLTrampolineFile.checkType(rs, SQL_OPEN_RESULT_SET_P);
	if (sqlrs_current(rs).numG(ZERO_INTEGER)) {
	    _csetf_sqlrs_current(rs, subtract(sqlrs_current(rs), ONE_INTEGER));
	}
	return numG(sqlrs_current(rs), ZERO_INTEGER);
    }

    @LispMethod(comment = "Moves to the previous row of result set RS")
    public static SubLObject sqlrs_previous(final SubLObject rs) {
	assert NIL != sql_open_result_set_p(rs) : "! sdbc.sql_open_result_set_p(rs) " + ("sdbc.sql_open_result_set_p(rs) " + "CommonSymbols.NIL != sdbc.sql_open_result_set_p(rs) ") + rs;
	if (sqlrs_current(rs).numG(ZERO_INTEGER)) {
	    _csetf_sqlrs_current(rs, subtract(sqlrs_current(rs), ONE_INTEGER));
	}
	return numG(sqlrs_current(rs), ZERO_INTEGER);
    }

    /**
    * Moves to the previous row of result set RS
    */

    /**
     * Returns true if the cursor is on RS's last row
     */
    @LispMethod(comment = "Returns true if the cursor is on RS\'s last row")
    public static final SubLObject sqlrs_is_last_alt(SubLObject rs) {
	SubLTrampolineFile.checkType(rs, SQL_OPEN_RESULT_SET_P);
	return eql(sqlrs_current(rs), sqlrs_last(rs));
    }

    @LispMethod(comment = "Returns true if the cursor is on RS\'s last row")
    public static SubLObject sqlrs_is_last(final SubLObject rs) {
	assert NIL != sql_open_result_set_p(rs) : "! sdbc.sql_open_result_set_p(rs) " + ("sdbc.sql_open_result_set_p(rs) " + "CommonSymbols.NIL != sdbc.sql_open_result_set_p(rs) ") + rs;
	return eql(sqlrs_current(rs), sqlrs_last(rs));
    }

    /**
    * Returns true if the cursor is on RS's last row
    */

    /**
     * Returns true if the cursor is on RS's first row
     */
    @LispMethod(comment = "Returns true if the cursor is on RS\'s first row")
    public static final SubLObject sqlrs_is_first_alt(SubLObject rs) {
	SubLTrampolineFile.checkType(rs, SQL_OPEN_RESULT_SET_P);
	return eql(sqlrs_current(rs), ONE_INTEGER);
    }

    @LispMethod(comment = "Returns true if the cursor is on RS\'s first row")
    public static SubLObject sqlrs_is_first(final SubLObject rs) {
	assert NIL != sql_open_result_set_p(rs) : "! sdbc.sql_open_result_set_p(rs) " + ("sdbc.sql_open_result_set_p(rs) " + "CommonSymbols.NIL != sdbc.sql_open_result_set_p(rs) ") + rs;
	return eql(sqlrs_current(rs), ONE_INTEGER);
    }

    /**
    * Returns true if the cursor is on RS's first row
    */

    /**
     * Returns the number of columns of RS
     */
    @LispMethod(comment = "Returns the number of columns of RS")
    public static final SubLObject sqlrs_column_count_alt(SubLObject rs) {
	SubLTrampolineFile.checkType(rs, SQL_OPEN_RESULT_SET_P);
	return sqlrs_row_count(rs).numG(ZERO_INTEGER) ? ((SubLObject) (length(aref(sqlrs_rows(rs), ZERO_INTEGER)))) : ZERO_INTEGER;
    }

    @LispMethod(comment = "Returns the number of columns of RS")
    public static SubLObject sqlrs_column_count(final SubLObject rs) {
	assert NIL != sql_open_result_set_p(rs) : "! sdbc.sql_open_result_set_p(rs) " + ("sdbc.sql_open_result_set_p(rs) " + "CommonSymbols.NIL != sdbc.sql_open_result_set_p(rs) ") + rs;
	return sqlrs_row_count(rs).numG(ZERO_INTEGER) ? length(aref(sqlrs_rows(rs), ZERO_INTEGER)) : ZERO_INTEGER;
    }

    /**
    * Returns the number of columns of RS
    */

    /**
     * Returns the number of rows of RS
     */
    @LispMethod(comment = "Returns the number of rows of RS")
    public static final SubLObject sqlrs_row_count_alt(SubLObject rs) {
	SubLTrampolineFile.checkType(rs, SQL_OPEN_RESULT_SET_P);
	return sqlrs_last(rs);
    }

    @LispMethod(comment = "Returns the number of rows of RS")
    public static SubLObject sqlrs_row_count(final SubLObject rs) {
	assert NIL != sql_open_result_set_p(rs) : "! sdbc.sql_open_result_set_p(rs) " + ("sdbc.sql_open_result_set_p(rs) " + "CommonSymbols.NIL != sdbc.sql_open_result_set_p(rs) ") + rs;
	return sqlrs_last(rs);
    }

    /**
    * Returns the number of rows of RS
    */

    /**
     * Retrieves the current row number of RS
     */
    @LispMethod(comment = "Retrieves the current row number of RS")
    public static final SubLObject sqlrs_get_row_alt(SubLObject rs) {
	SubLTrampolineFile.checkType(rs, SQL_OPEN_RESULT_SET_P);
	return sqlrs_current(rs);
    }

    @LispMethod(comment = "Retrieves the current row number of RS")
    public static SubLObject sqlrs_get_row(final SubLObject rs) {
	assert NIL != sql_open_result_set_p(rs) : "! sdbc.sql_open_result_set_p(rs) " + ("sdbc.sql_open_result_set_p(rs) " + "CommonSymbols.NIL != sdbc.sql_open_result_set_p(rs) ") + rs;
	return sqlrs_current(rs);
    }

    /**
    * Retrieves the current row number of RS
    */

    /**
     * Returns the value of column I of RS's  current row
     */
    @LispMethod(comment = "Returns the value of column I of RS\'s  current row")
    public static final SubLObject sqlrs_get_object_alt(SubLObject rs, SubLObject i) {
	{
	    final SubLThread thread = SubLProcess.currentSubLThread();
	    SubLTrampolineFile.checkType(rs, SQL_OPEN_RESULT_SET_P);
	    SubLTrampolineFile.checkType(i, POSITIVE_INTEGER_P);
	    if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
		if (NIL == sqlrs_valid_row_p(rs)) {
		    Errors.error($$$cursor_not_on_valid_row);
		}
	    }
	    if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
		if (NIL == sqlrs_valid_column_p(rs, i)) {
		    Errors.error($str_alt195$invalid_column__a, i);
		}
	    }
	    if (NIL == sqlrs_row_local_p(rs)) {
		{
		    SubLObject range = sqlrs_block(rs, sqlrs_current(rs));
		    SubLObject lo = range.first();
		    SubLObject hi = range.rest();
		    SubLObject rs2 = sqlc_execute(sqlrs_connection(rs), $get_rows$.getGlobalValue(), list(sqlrs_id(rs), lo, hi));
		    if (NIL != sdbc_error_p(rs2)) {
			return rs2;
		    }
		    _csetf_sqlrs_rows(rs, sqlrs_rows(rs2));
		    _csetf_sqlrs_start(rs, lo);
		}
	    }
	    return aref(aref(sqlrs_rows(rs), subtract(sqlrs_current(rs), sqlrs_start(rs))), f_1_(i));
	}
    }

    @LispMethod(comment = "Returns the value of column I of RS\'s  current row")
    public static SubLObject sqlrs_get_object(final SubLObject rs, final SubLObject i) {
	final SubLThread thread = SubLProcess.currentSubLThread();
	assert NIL != sql_open_result_set_p(rs) : "! sdbc.sql_open_result_set_p(rs) " + ("sdbc.sql_open_result_set_p(rs) " + "CommonSymbols.NIL != sdbc.sql_open_result_set_p(rs) ") + rs;
	assert NIL != subl_promotions.positive_integer_p(i) : "! subl_promotions.positive_integer_p(i) " + ("subl_promotions.positive_integer_p(i) " + "CommonSymbols.NIL != subl_promotions.positive_integer_p(i) ") + i;
	if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (NIL == sqlrs_valid_row_p(rs))) {
	    Errors.error($$$cursor_not_on_valid_row);
	}
	if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (NIL == sqlrs_valid_column_p(rs, i))) {
	    Errors.error($str214$invalid_column__a, i);
	}
	if (NIL == sqlrs_row_local_p(rs)) {
	    final SubLObject range = sqlrs_block(rs, sqlrs_current(rs));
	    final SubLObject lo = range.first();
	    final SubLObject hi = range.rest();
	    final SubLObject rs2 = sqlc_execute(sqlrs_connection(rs), $get_rows$.getGlobalValue(), list(sqlrs_id(rs), lo, hi));
	    if (NIL != sdbc_error_p(rs2)) {
		return rs2;
	    }
	    _csetf_sqlrs_rows(rs, sqlrs_rows(rs2));
	    _csetf_sqlrs_start(rs, lo);
	}
	return aref(aref(sqlrs_rows(rs), subtract(sqlrs_current(rs), sqlrs_start(rs))), number_utilities.f_1_(i));
    }

    /**
    * Returns the value of column I of RS's  current row
    */

    /**
     * Return a N-tuple of the values of the N columns of RS's current row
     */
    @LispMethod(comment = "Return a N-tuple of the values of the N columns of RS\'s current row")
    public static final SubLObject sqlrs_get_object_tuple_alt(SubLObject rs) {
	SubLTrampolineFile.checkType(rs, SQL_OPEN_RESULT_SET_P);
	{
	    SubLObject columns = sqlrs_column_count(rs);
	    SubLObject tuple = make_list(columns, UNPROVIDED);
	    SubLObject i = NIL;
	    for (i = ZERO_INTEGER; i.numL(columns); i = add(i, ONE_INTEGER)) {
		set_nth(i, tuple, sqlrs_get_object(rs, f_1X(i)));
	    }
	    return tuple;
	}
    }

    @LispMethod(comment = "Return a N-tuple of the values of the N columns of RS\'s current row")
    public static SubLObject sqlrs_get_object_tuple(final SubLObject rs) {
	assert NIL != sql_open_result_set_p(rs) : "! sdbc.sql_open_result_set_p(rs) " + ("sdbc.sql_open_result_set_p(rs) " + "CommonSymbols.NIL != sdbc.sql_open_result_set_p(rs) ") + rs;
	final SubLObject columns = sqlrs_column_count(rs);
	final SubLObject tuple = make_list(columns, UNPROVIDED);
	SubLObject i;
	for (i = NIL, i = ZERO_INTEGER; i.numL(columns); i = add(i, ONE_INTEGER)) {
	    set_nth(i, tuple, sqlrs_get_object(rs, number_utilities.f_1X(i)));
	}
	return tuple;
    }

    /**
    * Return a N-tuple of the values of the N columns of RS's current row
    */

    /**
     *
     *
     * @param FIRST
     * 		non-negative-integer-p; the global row number of the first row of ROWS
     * @param ROWS
     * 		listp; a list of lists, with each element list representing a single row
     * @param ROW-COUNT
     * 		non-negative-integer-p; the global total number of rows in this
     * 		result set
     * @return sql-result-set-p; a new result set containing each element of ROWS as a row
     */
    @LispMethod(comment = "@param FIRST\r\n\t\tnon-negative-integer-p; the global row number of the first row of ROWS\r\n@param ROWS\r\n\t\tlistp; a list of lists, with each element list representing a single row\r\n@param ROW-COUNT\r\n\t\tnon-negative-integer-p; the global total number of rows in this\r\n\t\tresult set\r\n@return sql-result-set-p; a new result set containing each element of ROWS as a row")
    public static final SubLObject new_sql_result_set_alt(SubLObject first, SubLObject rows, SubLObject row_count) {
	{
	    final SubLThread thread = SubLProcess.currentSubLThread();
	    SubLTrampolineFile.checkType(first, NON_NEGATIVE_INTEGER_P);
	    SubLTrampolineFile.checkType(rows, VECTORP);
	    SubLTrampolineFile.checkType(row_count, NON_NEGATIVE_INTEGER_P);
	    {
		SubLObject rs = make_sql_result_set(UNPROVIDED);
		_csetf_sqlrs_start(rs, first);
		_csetf_sqlrs_rows(rs, rows);
		_csetf_sqlrs_current(rs, ZERO_INTEGER);
		_csetf_sqlrs_last(rs, row_count);
		_csetf_sqlrs_connection(rs, T);
		_csetf_sqlrs_block_size(rs, $result_set_block_size$.getDynamicValue(thread));
		return rs;
	    }
	}
    }

    /**
     *
     *
     * @param FIRST
     * 		non-negative-integer-p; the global row number of the first row of ROWS
     * @param ROWS
     * 		listp; a list of lists, with each element list representing a single row
     * @param ROW-COUNT
     * 		non-negative-integer-p; the global total number of rows in this
     * 		result set
     * @return sql-result-set-p; a new result set containing each element of ROWS as a row
     */
    @LispMethod(comment = "@param FIRST\r\n\t\tnon-negative-integer-p; the global row number of the first row of ROWS\r\n@param ROWS\r\n\t\tlistp; a list of lists, with each element list representing a single row\r\n@param ROW-COUNT\r\n\t\tnon-negative-integer-p; the global total number of rows in this\r\n\t\tresult set\r\n@return sql-result-set-p; a new result set containing each element of ROWS as a row")
    public static SubLObject new_sql_result_set(final SubLObject first, final SubLObject rows, final SubLObject row_count) {
	final SubLThread thread = SubLProcess.currentSubLThread();
	assert NIL != subl_promotions.non_negative_integer_p(first) : "! subl_promotions.non_negative_integer_p(first) " + ("subl_promotions.non_negative_integer_p(first) " + "CommonSymbols.NIL != subl_promotions.non_negative_integer_p(first) ") + first;
	assert NIL != vectorp(rows) : "! vectorp(rows) " + ("Types.vectorp(rows) " + "CommonSymbols.NIL != Types.vectorp(rows) ") + rows;
	assert NIL != subl_promotions.non_negative_integer_p(row_count) : "! subl_promotions.non_negative_integer_p(row_count) " + ("subl_promotions.non_negative_integer_p(row_count) " + "CommonSymbols.NIL != subl_promotions.non_negative_integer_p(row_count) ") + row_count;
	final SubLObject rs = make_sql_result_set(UNPROVIDED);
	_csetf_sqlrs_start(rs, first);
	_csetf_sqlrs_rows(rs, rows);
	_csetf_sqlrs_current(rs, ZERO_INTEGER);
	_csetf_sqlrs_last(rs, row_count);
	_csetf_sqlrs_connection(rs, T);
	_csetf_sqlrs_block_size(rs, $result_set_block_size$.getDynamicValue(thread));
	return rs;
    }

    /**
     *
     *
     * @return boolean; t if result set RS if closed, nil otherwise
     */
    @LispMethod(comment = "@return boolean; t if result set RS if closed, nil otherwise")
    public static final SubLObject sqlrs_closed_p_alt(SubLObject rs) {
	return makeBoolean(NIL == sqlrs_open_p(rs));
    }

    /**
     *
     *
     * @return boolean; t if result set RS if closed, nil otherwise
     */
    @LispMethod(comment = "@return boolean; t if result set RS if closed, nil otherwise")
    public static SubLObject sqlrs_closed_p(final SubLObject rs) {
	return makeBoolean(NIL == sqlrs_open_p(rs));
    }

    /**
     *
     *
     * @return boolean; t if result set RS if open, nil otherwise
     */
    @LispMethod(comment = "@return boolean; t if result set RS if open, nil otherwise")
    public static final SubLObject sqlrs_open_p_alt(SubLObject rs) {
	return list_utilities.sublisp_boolean(sqlrs_connection(rs));
    }

    /**
     *
     *
     * @return boolean; t if result set RS if open, nil otherwise
     */
    @LispMethod(comment = "@return boolean; t if result set RS if open, nil otherwise")
    public static SubLObject sqlrs_open_p(final SubLObject rs) {
	return list_utilities.sublisp_boolean(sqlrs_connection(rs));
    }

    /**
     * Returns true if RS's cursor is on a valid row
     */
    @LispMethod(comment = "Returns true if RS\'s cursor is on a valid row")
    public static final SubLObject sqlrs_valid_row_p_alt(SubLObject rs) {
	return makeBoolean(sqlrs_current(rs).numG(ZERO_INTEGER) && sqlrs_current(rs).numLE(sqlrs_last(rs)));
    }

    @LispMethod(comment = "Returns true if RS\'s cursor is on a valid row")
    public static SubLObject sqlrs_valid_row_p(final SubLObject rs) {
	return makeBoolean(sqlrs_current(rs).numG(ZERO_INTEGER) && sqlrs_current(rs).numLE(sqlrs_last(rs)));
    }

    /**
    * Returns true if RS's cursor is on a valid row
    */

    /**
     * Returns true if I is a valid (existent) column of RS
     */
    @LispMethod(comment = "Returns true if I is a valid (existent) column of RS")
    public static final SubLObject sqlrs_valid_column_p_alt(SubLObject rs, SubLObject i) {
	return makeBoolean(i.numG(ZERO_INTEGER) && i.numLE(sqlrs_column_count(rs)));
    }

    @LispMethod(comment = "Returns true if I is a valid (existent) column of RS")
    public static SubLObject sqlrs_valid_column_p(final SubLObject rs, final SubLObject i) {
	return makeBoolean(i.numG(ZERO_INTEGER) && i.numLE(sqlrs_column_count(rs)));
    }

    /**
    * Returns true if I is a valid (existent) column of RS
    */

    /**
     *
     *
     * @return consp; a cons consisting of the first and last row of the block
    (inclusive) that row ROW belongs to
     */
    @LispMethod(comment = "@return consp; a cons consisting of the first and last row of the block\r\n(inclusive) that row ROW belongs to")
    public static final SubLObject sqlrs_block_alt(SubLObject rs, SubLObject row) {
	{
	    final SubLThread thread = SubLProcess.currentSubLThread();
	    if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
		if (!(row.numG(ZERO_INTEGER) && row.numLE(sqlrs_last(rs)))) {
		    Errors.error($str_alt198$invalid_row__a, row);
		}
	    }
	    {
		SubLObject lo = f_1X(multiply(floor(f_1_(row), sqlrs_block_size(rs)), $result_set_block_size$.getDynamicValue(thread)));
		SubLObject hi = min(sqlrs_last(rs), add(lo, sqlrs_block_size(rs), MINUS_ONE_INTEGER));
		return cons(lo, hi);
	    }
	}
    }

    /**
     *
     *
     * @return consp; a cons consisting of the first and last row of the block
    (inclusive) that row ROW belongs to
     */
    @LispMethod(comment = "@return consp; a cons consisting of the first and last row of the block\r\n(inclusive) that row ROW belongs to")
    public static SubLObject sqlrs_block(final SubLObject rs, final SubLObject row) {
	final SubLThread thread = SubLProcess.currentSubLThread();
	if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && ((!row.numG(ZERO_INTEGER)) || (!row.numLE(sqlrs_last(rs))))) {
	    Errors.error($str217$invalid_row__a, row);
	}
	final SubLObject lo = number_utilities.f_1X(multiply(floor(number_utilities.f_1_(row), sqlrs_block_size(rs)), $result_set_block_size$.getDynamicValue(thread)));
	final SubLObject hi = min(sqlrs_last(rs), add(lo, sqlrs_block_size(rs), MINUS_ONE_INTEGER));
	return cons(lo, hi);
    }

    /**
     *
     *
     * @return boolean; t if RS's current row resides locally in RS, nil otherwise
     */
    @LispMethod(comment = "@return boolean; t if RS\'s current row resides locally in RS, nil otherwise")
    public static final SubLObject sqlrs_row_local_p_alt(SubLObject rs) {
	return makeBoolean(sqlrs_current(rs).numGE(sqlrs_start(rs)) && sqlrs_current(rs).numL(add(sqlrs_start(rs), sqlrs_block_size(rs))));
    }

    /**
     *
     *
     * @return boolean; t if RS's current row resides locally in RS, nil otherwise
     */
    @LispMethod(comment = "@return boolean; t if RS\'s current row resides locally in RS, nil otherwise")
    public static SubLObject sqlrs_row_local_p(final SubLObject rs) {
	return makeBoolean(sqlrs_current(rs).numGE(sqlrs_start(rs)) && sqlrs_current(rs).numL(add(sqlrs_start(rs), sqlrs_block_size(rs))));
    }

    /**
     *
     *
     * @return boolean; nil if RS's current row already resides in RS, t otherwise
     */
    @LispMethod(comment = "@return boolean; nil if RS\'s current row already resides in RS, t otherwise")
    public static final SubLObject sqlrs_row_remote_p_alt(SubLObject rs) {
	return makeBoolean(NIL == sqlrs_row_local_p(rs));
    }

    /**
     *
     *
     * @return boolean; nil if RS's current row already resides in RS, t otherwise
     */
    @LispMethod(comment = "@return boolean; nil if RS\'s current row already resides in RS, t otherwise")
    public static SubLObject sqlrs_row_remote_p(final SubLObject rs) {
	return makeBoolean(NIL == sqlrs_row_local_p(rs));
    }

    /**
     *
     *
     * @param RS
    sql-result-set-p;
     * 		
     * @return sql-result-set-p; RS destructively marked as closed
     */
    @LispMethod(comment = "@param RS\nsql-result-set-p;\r\n\t\t\r\n@return sql-result-set-p; RS destructively marked as closed")
    public static final SubLObject sqlrs_local_close_alt(SubLObject rs) {
	_csetf_sqlrs_rows(rs, NIL);
	_csetf_sqlrs_connection(rs, NIL);
	return rs;
    }

    /**
     *
     *
     * @param RS
    sql-result-set-p;
     * 		
     * @return sql-result-set-p; RS destructively marked as closed
     */
    @LispMethod(comment = "@param RS\nsql-result-set-p;\r\n\t\t\r\n@return sql-result-set-p; RS destructively marked as closed")
    public static SubLObject sqlrs_local_close(final SubLObject rs) {
	_csetf_sqlrs_rows(rs, NIL);
	_csetf_sqlrs_connection(rs, NIL);
	return rs;
    }

    public static final SubLObject sql_statement_print_function_trampoline_alt(SubLObject v_object, SubLObject stream) {
	compatibility.default_struct_print_function(v_object, stream, ZERO_INTEGER);
	return NIL;
    }

    public static SubLObject sql_statement_print_function_trampoline(final SubLObject v_object, final SubLObject stream) {
	compatibility.default_struct_print_function(v_object, stream, ZERO_INTEGER);
	return NIL;
    }

    public static final SubLObject sql_statement_p_alt(SubLObject v_object) {
	return v_object.getClass() == com.cyc.cycjava.cycl.sdbc.$sql_statement_native.class ? ((SubLObject) (T)) : NIL;
    }

    public static SubLObject sql_statement_p(final SubLObject v_object) {
	return v_object.getClass() == com.cyc.cycjava.cycl.sdbc.$sql_statement_native.class ? T : NIL;
    }

    public static final SubLObject sqls_connection_alt(SubLObject v_object) {
	SubLTrampolineFile.checkType(v_object, SQL_STATEMENT_P);
	return v_object.getField2();
    }

    public static SubLObject sqls_connection(final SubLObject v_object) {
	assert NIL != sql_statement_p(v_object) : "! sdbc.sql_statement_p(v_object) " + "sdbc.sql_statement_p error :" + v_object;
	return v_object.getField2();
    }

    public static final SubLObject sqls_id_alt(SubLObject v_object) {
	SubLTrampolineFile.checkType(v_object, SQL_STATEMENT_P);
	return v_object.getField3();
    }

    public static SubLObject sqls_id(final SubLObject v_object) {
	assert NIL != sql_statement_p(v_object) : "! sdbc.sql_statement_p(v_object) " + "sdbc.sql_statement_p error :" + v_object;
	return v_object.getField3();
    }

    public static final SubLObject sqls_sql_alt(SubLObject v_object) {
	SubLTrampolineFile.checkType(v_object, SQL_STATEMENT_P);
	return v_object.getField4();
    }

    public static SubLObject sqls_sql(final SubLObject v_object) {
	assert NIL != sql_statement_p(v_object) : "! sdbc.sql_statement_p(v_object) " + "sdbc.sql_statement_p error :" + v_object;
	return v_object.getField4();
    }

    public static final SubLObject sqls_settings_alt(SubLObject v_object) {
	SubLTrampolineFile.checkType(v_object, SQL_STATEMENT_P);
	return v_object.getField5();
    }

    public static SubLObject sqls_settings(final SubLObject v_object) {
	assert NIL != sql_statement_p(v_object) : "! sdbc.sql_statement_p(v_object) " + "sdbc.sql_statement_p error :" + v_object;
	return v_object.getField5();
    }

    public static final SubLObject sqls_batch_alt(SubLObject v_object) {
	SubLTrampolineFile.checkType(v_object, SQL_STATEMENT_P);
	return v_object.getField6();
    }

    public static SubLObject sqls_batch(final SubLObject v_object) {
	assert NIL != sql_statement_p(v_object) : "! sdbc.sql_statement_p(v_object) " + "sdbc.sql_statement_p error :" + v_object;
	return v_object.getField6();
    }

    public static final SubLObject sqls_rs_alt(SubLObject v_object) {
	SubLTrampolineFile.checkType(v_object, SQL_STATEMENT_P);
	return v_object.getField7();
    }

    public static SubLObject sqls_rs(final SubLObject v_object) {
	assert NIL != sql_statement_p(v_object) : "! sdbc.sql_statement_p(v_object) " + "sdbc.sql_statement_p error :" + v_object;
	return v_object.getField7();
    }

    public static final SubLObject _csetf_sqls_connection_alt(SubLObject v_object, SubLObject value) {
	SubLTrampolineFile.checkType(v_object, SQL_STATEMENT_P);
	return v_object.setField2(value);
    }

    public static SubLObject _csetf_sqls_connection(final SubLObject v_object, final SubLObject value) {
	assert NIL != sql_statement_p(v_object) : "! sdbc.sql_statement_p(v_object) " + "sdbc.sql_statement_p error :" + v_object;
	return v_object.setField2(value);
    }

    public static final SubLObject _csetf_sqls_id_alt(SubLObject v_object, SubLObject value) {
	SubLTrampolineFile.checkType(v_object, SQL_STATEMENT_P);
	return v_object.setField3(value);
    }

    public static SubLObject _csetf_sqls_id(final SubLObject v_object, final SubLObject value) {
	assert NIL != sql_statement_p(v_object) : "! sdbc.sql_statement_p(v_object) " + "sdbc.sql_statement_p error :" + v_object;
	return v_object.setField3(value);
    }

    public static final SubLObject _csetf_sqls_sql_alt(SubLObject v_object, SubLObject value) {
	SubLTrampolineFile.checkType(v_object, SQL_STATEMENT_P);
	return v_object.setField4(value);
    }

    public static SubLObject _csetf_sqls_sql(final SubLObject v_object, final SubLObject value) {
	assert NIL != sql_statement_p(v_object) : "! sdbc.sql_statement_p(v_object) " + "sdbc.sql_statement_p error :" + v_object;
	return v_object.setField4(value);
    }

    public static final SubLObject _csetf_sqls_settings_alt(SubLObject v_object, SubLObject value) {
	SubLTrampolineFile.checkType(v_object, SQL_STATEMENT_P);
	return v_object.setField5(value);
    }

    public static SubLObject _csetf_sqls_settings(final SubLObject v_object, final SubLObject value) {
	assert NIL != sql_statement_p(v_object) : "! sdbc.sql_statement_p(v_object) " + "sdbc.sql_statement_p error :" + v_object;
	return v_object.setField5(value);
    }

    public static final SubLObject _csetf_sqls_batch_alt(SubLObject v_object, SubLObject value) {
	SubLTrampolineFile.checkType(v_object, SQL_STATEMENT_P);
	return v_object.setField6(value);
    }

    public static SubLObject _csetf_sqls_batch(final SubLObject v_object, final SubLObject value) {
	assert NIL != sql_statement_p(v_object) : "! sdbc.sql_statement_p(v_object) " + "sdbc.sql_statement_p error :" + v_object;
	return v_object.setField6(value);
    }

    public static final SubLObject _csetf_sqls_rs_alt(SubLObject v_object, SubLObject value) {
	SubLTrampolineFile.checkType(v_object, SQL_STATEMENT_P);
	return v_object.setField7(value);
    }

    public static SubLObject _csetf_sqls_rs(final SubLObject v_object, final SubLObject value) {
	assert NIL != sql_statement_p(v_object) : "! sdbc.sql_statement_p(v_object) " + "sdbc.sql_statement_p error :" + v_object;
	return v_object.setField7(value);
    }

    public static final SubLObject make_sql_statement_alt(SubLObject arglist) {
	if (arglist == UNPROVIDED) {
	    arglist = NIL;
	}
	{
	    SubLObject v_new = new com.cyc.cycjava.cycl.sdbc.$sql_statement_native();
	    SubLObject next = NIL;
	    for (next = arglist; NIL != next; next = cddr(next)) {
		{
		    SubLObject current_arg = next.first();
		    SubLObject current_value = cadr(next);
		    SubLObject pcase_var = current_arg;
		    if (pcase_var.eql($CONNECTION)) {
			_csetf_sqls_connection(v_new, current_value);
		    } else {
			if (pcase_var.eql($ID)) {
			    _csetf_sqls_id(v_new, current_value);
			} else {
			    if (pcase_var.eql($SQL)) {
				_csetf_sqls_sql(v_new, current_value);
			    } else {
				if (pcase_var.eql($SETTINGS)) {
				    _csetf_sqls_settings(v_new, current_value);
				} else {
				    if (pcase_var.eql($BATCH)) {
					_csetf_sqls_batch(v_new, current_value);
				    } else {
					if (pcase_var.eql($RS)) {
					    _csetf_sqls_rs(v_new, current_value);
					} else {
					    Errors.error($str_alt81$Invalid_slot__S_for_construction_, current_arg);
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

    public static SubLObject make_sql_statement(SubLObject arglist) {
	if (arglist == UNPROVIDED) {
	    arglist = NIL;
	}
	final SubLObject v_new = new com.cyc.cycjava.cycl.sdbc.$sql_statement_native();
	SubLObject next;
	SubLObject current_arg;
	SubLObject current_value;
	SubLObject pcase_var;
	for (next = NIL, next = arglist; NIL != next; next = cddr(next)) {
	    current_arg = next.first();
	    current_value = cadr(next);
	    pcase_var = current_arg;
	    if (pcase_var.eql($CONNECTION)) {
		_csetf_sqls_connection(v_new, current_value);
	    } else if (pcase_var.eql($ID)) {
		_csetf_sqls_id(v_new, current_value);
	    } else if (pcase_var.eql($SQL)) {
		_csetf_sqls_sql(v_new, current_value);
	    } else if (pcase_var.eql($SETTINGS)) {
		_csetf_sqls_settings(v_new, current_value);
	    } else if (pcase_var.eql($BATCH)) {
		_csetf_sqls_batch(v_new, current_value);
	    } else if (pcase_var.eql($RS)) {
		_csetf_sqls_rs(v_new, current_value);
	    } else {
		Errors.error($str82$Invalid_slot__S_for_construction_, current_arg);
	    }

	}
	return v_new;
    }

    public static SubLObject visit_defstruct_sql_statement(final SubLObject obj, final SubLObject visitor_fn) {
	funcall(visitor_fn, obj, $BEGIN, MAKE_SQL_STATEMENT, SIX_INTEGER);
	funcall(visitor_fn, obj, $SLOT, $CONNECTION, sqls_connection(obj));
	funcall(visitor_fn, obj, $SLOT, $ID, sqls_id(obj));
	funcall(visitor_fn, obj, $SLOT, $SQL, sqls_sql(obj));
	funcall(visitor_fn, obj, $SLOT, $SETTINGS, sqls_settings(obj));
	funcall(visitor_fn, obj, $SLOT, $BATCH, sqls_batch(obj));
	funcall(visitor_fn, obj, $SLOT, $RS, sqls_rs(obj));
	funcall(visitor_fn, obj, $END, MAKE_SQL_STATEMENT, SIX_INTEGER);
	return obj;
    }

    public static SubLObject visit_defstruct_object_sql_statement_method(final SubLObject obj, final SubLObject visitor_fn) {
	return visit_defstruct_sql_statement(obj, visitor_fn);
    }

    /**
     *
     *
     * @param STATEMENT
    sql-statement-p
     * 		
     * @return boolean; t if STATEMENT is open, nil otherwise
     */
    @LispMethod(comment = "@param STATEMENT\nsql-statement-p\r\n\t\t\r\n@return boolean; t if STATEMENT is open, nil otherwise")
    public static final SubLObject sqls_open_p_alt(SubLObject statement) {
	SubLTrampolineFile.checkType(statement, SQL_STATEMENT_P);
	return makeBoolean((NIL != sqls_connection(statement)) && (NIL != sqlc_open_p(sqls_connection(statement))));
    }

    /**
     *
     *
     * @param STATEMENT
    sql-statement-p
     * 		
     * @return boolean; t if STATEMENT is open, nil otherwise
     */
    @LispMethod(comment = "@param STATEMENT\nsql-statement-p\r\n\t\t\r\n@return boolean; t if STATEMENT is open, nil otherwise")
    public static SubLObject sqls_open_p(final SubLObject statement) {
	assert NIL != sql_statement_p(statement) : "! sdbc.sql_statement_p(statement) " + ("sdbc.sql_statement_p(statement) " + "CommonSymbols.NIL != sdbc.sql_statement_p(statement) ") + statement;
	return makeBoolean((NIL != sqls_connection(statement)) && (NIL != sqlc_open_p(sqls_connection(statement))));
    }

    /**
     *
     *
     * @return boolean; t if OBJECT is an open statement, nil otherwise
     */
    @LispMethod(comment = "@return boolean; t if OBJECT is an open statement, nil otherwise")
    public static final SubLObject sql_open_statement_p_alt(SubLObject v_object) {
	return makeBoolean(((NIL != sql_statement_p(v_object)) && (NIL != sql_connection_p(sqls_connection(v_object)))) && (NIL != sqlc_open_p(sqls_connection(v_object))));
    }

    /**
     *
     *
     * @return boolean; t if OBJECT is an open statement, nil otherwise
     */
    @LispMethod(comment = "@return boolean; t if OBJECT is an open statement, nil otherwise")
    public static SubLObject sql_open_statement_p(final SubLObject v_object) {
	return makeBoolean(((NIL != sql_statement_p(v_object)) && (NIL != sql_connection_p(sqls_connection(v_object)))) && (NIL != sqlc_open_p(sqls_connection(v_object))));
    }

    /**
     * Execute an SQL database query
     *
     * @param STATEMENT
    sql-statement-p
     * 		
     * @param SQL
    stringp;
     * 		
     * @param BLOCK-SIZE
     * 		positive-integer-p; the maximum number of rows locally residing in the
     * 		result set created by this query
     * @return sql-open-result-set-p; the result set resulting from executing SQL on STATEMENT
     */
    @LispMethod(comment = "Execute an SQL database query\r\n\r\n@param STATEMENT\nsql-statement-p\r\n\t\t\r\n@param SQL\nstringp;\r\n\t\t\r\n@param BLOCK-SIZE\r\n\t\tpositive-integer-p; the maximum number of rows locally residing in the\r\n\t\tresult set created by this query\r\n@return sql-open-result-set-p; the result set resulting from executing SQL on STATEMENT")
    public static final SubLObject sqls_execute_query_alt(SubLObject statement, SubLObject sql, SubLObject block_size) {
	if (block_size == UNPROVIDED) {
	    block_size = $result_set_block_size$.getDynamicValue();
	}
	SubLTrampolineFile.checkType(statement, SQL_OPEN_STATEMENT_P);
	SubLTrampolineFile.checkType(sql, STRINGP);
	SubLTrampolineFile.checkType(block_size, POSITIVE_INTEGER_P);
	{
	    SubLObject rs = sqlc_execute(sqls_connection(statement), $execute_query$.getGlobalValue(), list(sqls_id(statement), sql, block_size));
	    if (NIL != sql_result_set_p(rs)) {
		_csetf_sqlrs_connection(rs, sqls_connection(statement));
		_csetf_sqlrs_id(rs, sqls_id(statement));
		_csetf_sqlrs_block_size(rs, block_size);
		if (NIL != sqls_rs(statement)) {
		    sqlrs_local_close(sqls_rs(statement));
		}
		_csetf_sqls_rs(statement, rs);
	    }
	    return rs;
	}
    }

    @LispMethod(comment = "Execute an SQL database query\r\n\r\n@param STATEMENT\n\t\tsql-statement-p\r\n\t\t\r\n@param SQL\n\t\tstringp;\r\n\t\t\r\n@param BLOCK-SIZE\r\n\t\tpositive-integer-p; the maximum number of rows locally residing in the\r\n\t\tresult set created by this query\r\n@return sql-open-result-set-p; the result set resulting from executing SQL on STATEMENT")
    public static SubLObject sqls_execute_query(final SubLObject statement, final SubLObject sql, SubLObject block_size) {
	if (block_size == UNPROVIDED) {
	    block_size = $result_set_block_size$.getDynamicValue();
	}
	assert NIL != sql_open_statement_p(statement) : "! sdbc.sql_open_statement_p(statement) " + ("sdbc.sql_open_statement_p(statement) " + "CommonSymbols.NIL != sdbc.sql_open_statement_p(statement) ") + statement;
	assert NIL != stringp(sql) : "! stringp(sql) " + ("Types.stringp(sql) " + "CommonSymbols.NIL != Types.stringp(sql) ") + sql;
	assert NIL != subl_promotions.positive_integer_p(block_size) : "! subl_promotions.positive_integer_p(block_size) " + ("subl_promotions.positive_integer_p(block_size) " + "CommonSymbols.NIL != subl_promotions.positive_integer_p(block_size) ") + block_size;
	final SubLObject rs = sqlc_execute(sqls_connection(statement), $execute_query$.getGlobalValue(), list(sqls_id(statement), sql, block_size));
	if (NIL != sql_result_set_p(rs)) {
	    _csetf_sqlrs_connection(rs, sqls_connection(statement));
	    _csetf_sqlrs_id(rs, sqls_id(statement));
	    _csetf_sqlrs_block_size(rs, block_size);
	    if (NIL != sqls_rs(statement)) {
		sqlrs_local_close(sqls_rs(statement));
	    }
	    _csetf_sqls_rs(statement, rs);
	}
	return rs;
    }

    /**
    * Execute an SQL database query
    *
    * @param STATEMENT
    	sql-statement-p
    * 		
    * @param SQL
    	stringp;
    * 		
    * @param BLOCK-SIZE
    * 		positive-integer-p; the maximum number of rows locally residing in the
    * 		result set created by this query
    * @return sql-open-result-set-p; the result set resulting from executing SQL on STATEMENT
    */

    /**
     * Execute an SQL database update
     *
     * @param STATEMENT
    sql-statement-p
     * 		
     * @param SQL
    stringp;
     * 		
     * @return stringp; the result of executing the update sql SQL
     */
    @LispMethod(comment = "Execute an SQL database update\r\n\r\n@param STATEMENT\nsql-statement-p\r\n\t\t\r\n@param SQL\nstringp;\r\n\t\t\r\n@return stringp; the result of executing the update sql SQL")
    public static final SubLObject sqls_execute_update_alt(SubLObject statement, SubLObject sql) {
	SubLTrampolineFile.checkType(statement, SQL_OPEN_STATEMENT_P);
	SubLTrampolineFile.checkType(sql, STRINGP);
	return sqlc_execute(sqls_connection(statement), $execute_update$.getGlobalValue(), list(sqls_id(statement), sql));
    }

    @LispMethod(comment = "Execute an SQL database update\r\n\r\n@param STATEMENT\n\t\tsql-statement-p\r\n\t\t\r\n@param SQL\n\t\tstringp;\r\n\t\t\r\n@return stringp; the result of executing the update sql SQL")
    public static SubLObject sqls_execute_update(final SubLObject statement, final SubLObject sql) {
	assert NIL != sql_open_statement_p(statement) : "! sdbc.sql_open_statement_p(statement) " + ("sdbc.sql_open_statement_p(statement) " + "CommonSymbols.NIL != sdbc.sql_open_statement_p(statement) ") + statement;
	assert NIL != stringp(sql) : "! stringp(sql) " + ("Types.stringp(sql) " + "CommonSymbols.NIL != Types.stringp(sql) ") + sql;
	return sqlc_execute(sqls_connection(statement), $execute_update$.getGlobalValue(), list(sqls_id(statement), sql));
    }

    /**
    * Execute an SQL database update
    *
    * @param STATEMENT
    	sql-statement-p
    * 		
    * @param SQL
    	stringp;
    * 		
    * @return stringp; the result of executing the update sql SQL
    */

    /**
     * Cancels STATEMENT if both the DBMS and driver support aborting
     * an SQL statement. This method can be used by one thread to cancel a statement
     * that is being executed by another thread.
     *
     * @param STATEMENT
    sql-open-statement-p;
     * 		
     * @return 0 or an sql error
     */
    @LispMethod(comment = "Cancels STATEMENT if both the DBMS and driver support aborting\r\nan SQL statement. This method can be used by one thread to cancel a statement\r\nthat is being executed by another thread.\r\n\r\n@param STATEMENT\nsql-open-statement-p;\r\n\t\t\r\n@return 0 or an sql error\nCancels STATEMENT if both the DBMS and driver support aborting\nan SQL statement. This method can be used by one thread to cancel a statement\nthat is being executed by another thread.")
    public static final SubLObject sqls_cancel_alt(SubLObject statement) {
	SubLTrampolineFile.checkType(statement, SQL_OPEN_STATEMENT_P);
	return sqlc_execute(sqls_connection(statement), $cancel$.getGlobalValue(), list(sqls_id(statement)));
    }

    @LispMethod(comment = "Cancels STATEMENT if both the DBMS and driver support aborting\r\nan SQL statement. This method can be used by one thread to cancel a statement\r\nthat is being executed by another thread.\r\n\r\n@param STATEMENT\n\t\tsql-open-statement-p;\r\n\t\t\r\n@return 0 or an sql error\nCancels STATEMENT if both the DBMS and driver support aborting\nan SQL statement. This method can be used by one thread to cancel a statement\nthat is being executed by another thread.")
    public static SubLObject sqls_cancel(final SubLObject statement) {
	assert NIL != sql_open_statement_p(statement) : "! sdbc.sql_open_statement_p(statement) " + ("sdbc.sql_open_statement_p(statement) " + "CommonSymbols.NIL != sdbc.sql_open_statement_p(statement) ") + statement;
	return sqlc_execute(sqls_connection(statement), $cancel$.getGlobalValue(), list(sqls_id(statement)));
    }

    /**
    * Cancels STATEMENT if both the DBMS and driver support aborting
    * an SQL statement. This method can be used by one thread to cancel a statement
    * that is being executed by another thread.
    *
    * @param STATEMENT
    	sql-open-statement-p;
    * 		
    * @return 0 or an sql error
    */

    /**
     *
     *
     * @param STATEMENT
    sql-statement-p;
     * 		
     * @return sql-open-result-set-p; any auto-generated keys created as a result of executing
    this statement. If this statement did not generate any keys, an empty result set
    is returned.
     */
    @LispMethod(comment = "@param STATEMENT\nsql-statement-p;\r\n\t\t\r\n@return sql-open-result-set-p; any auto-generated keys created as a result of executing\r\nthis statement. If this statement did not generate any keys, an empty result set\r\nis returned.")
    public static final SubLObject sqls_get_generated_keys_alt(SubLObject statement, SubLObject block_size) {
	if (block_size == UNPROVIDED) {
	    block_size = $result_set_block_size$.getDynamicValue();
	}
	SubLTrampolineFile.checkType(statement, SQL_OPEN_STATEMENT_P);
	SubLTrampolineFile.checkType(block_size, POSITIVE_INTEGER_P);
	{
	    SubLObject rs = sqlc_execute(sqls_connection(statement), $get_generated_keys$.getGlobalValue(), list(sqls_id(statement), block_size));
	    if (NIL != sql_result_set_p(rs)) {
		_csetf_sqlrs_connection(rs, sqls_connection(statement));
		_csetf_sqlrs_id(rs, sqls_id(statement));
		_csetf_sqlrs_block_size(rs, block_size);
		if (NIL != sqls_rs(statement)) {
		    sqlrs_local_close(sqls_rs(statement));
		}
		_csetf_sqls_rs(statement, rs);
	    }
	    return rs;
	}
    }

    /**
     *
     *
     * @param STATEMENT
    sql-statement-p;
     * 		
     * @return sql-open-result-set-p; any auto-generated keys created as a result of executing
    this statement. If this statement did not generate any keys, an empty result set
    is returned.
     */
    @LispMethod(comment = "@param STATEMENT\nsql-statement-p;\r\n\t\t\r\n@return sql-open-result-set-p; any auto-generated keys created as a result of executing\r\nthis statement. If this statement did not generate any keys, an empty result set\r\nis returned.")
    public static SubLObject sqls_get_generated_keys(final SubLObject statement, SubLObject block_size) {
	if (block_size == UNPROVIDED) {
	    block_size = $result_set_block_size$.getDynamicValue();
	}
	assert NIL != sql_open_statement_p(statement) : "! sdbc.sql_open_statement_p(statement) " + ("sdbc.sql_open_statement_p(statement) " + "CommonSymbols.NIL != sdbc.sql_open_statement_p(statement) ") + statement;
	assert NIL != subl_promotions.positive_integer_p(block_size) : "! subl_promotions.positive_integer_p(block_size) " + ("subl_promotions.positive_integer_p(block_size) " + "CommonSymbols.NIL != subl_promotions.positive_integer_p(block_size) ") + block_size;
	final SubLObject rs = sqlc_execute(sqls_connection(statement), $get_generated_keys$.getGlobalValue(), list(sqls_id(statement), block_size));
	if (NIL != sql_result_set_p(rs)) {
	    _csetf_sqlrs_connection(rs, sqls_connection(statement));
	    _csetf_sqlrs_id(rs, sqls_id(statement));
	    _csetf_sqlrs_block_size(rs, block_size);
	    if (NIL != sqls_rs(statement)) {
		sqlrs_local_close(sqls_rs(statement));
	    }
	    _csetf_sqls_rs(statement, rs);
	}
	return rs;
    }

    /**
     * Closes STATEMENT
     *
     * @param STATEMENT
    sql-statement-p
     * 		
     * @return boolean; a closed STATEMENT or an error
     */
    @LispMethod(comment = "Closes STATEMENT\r\n\r\n@param STATEMENT\nsql-statement-p\r\n\t\t\r\n@return boolean; a closed STATEMENT or an error")
    public static final SubLObject sqls_close_alt(SubLObject statement) {
	SubLTrampolineFile.checkType(statement, SQL_STATEMENT_P);
	{
	    SubLObject result = NIL;
	    if (NIL != sqls_open_p(statement)) {
		result = sqlc_execute(sqls_connection(statement), $close_statement$.getGlobalValue(), list(sqls_id(statement)));
	    }
	    sqls_local_close(statement);
	    return NIL != sdbc_error_p(result) ? ((SubLObject) (result)) : statement;
	}
    }

    @LispMethod(comment = "Closes STATEMENT\r\n\r\n@param STATEMENT\n\t\tsql-statement-p\r\n\t\t\r\n@return boolean; a closed STATEMENT or an error")
    public static SubLObject sqls_close(final SubLObject statement) {
	assert NIL != sql_statement_p(statement) : "! sdbc.sql_statement_p(statement) " + ("sdbc.sql_statement_p(statement) " + "CommonSymbols.NIL != sdbc.sql_statement_p(statement) ") + statement;
	SubLObject result = NIL;
	if (NIL != sqls_open_p(statement)) {
	    result = sqlc_execute(sqls_connection(statement), $close_statement$.getGlobalValue(), list(sqls_id(statement)));
	}
	sqls_local_close(statement);
	return NIL != sdbc_error_p(result) ? result : statement;
    }

    /**
    * Closes STATEMENT
    *
    * @param STATEMENT
    	sql-statement-p
    * 		
    * @return boolean; a closed STATEMENT or an error
    */

    /**
     * Adds the SQL command to the current batch of commands for STATEMENT
     * Only INSERTs, UPDATEs or DELETE's are allowed, but no SELECTs.
     *
     * @param STATEMENT
    sql-statement-p
     * 		
     * @param SQL
    string
     * 		
     * @return nil
     */
    @LispMethod(comment = "Adds the SQL command to the current batch of commands for STATEMENT\r\nOnly INSERTs, UPDATEs or DELETE\'s are allowed, but no SELECTs.\r\n\r\n@param STATEMENT\nsql-statement-p\r\n\t\t\r\n@param SQL\nstring\r\n\t\t\r\n@return nil\nAdds the SQL command to the current batch of commands for STATEMENT\nOnly INSERTs, UPDATEs or DELETE\'s are allowed, but no SELECTs.")
    public static final SubLObject sqls_add_batch_alt(SubLObject statement, SubLObject sql) {
	SubLTrampolineFile.checkType(statement, SQL_OPEN_STATEMENT_P);
	SubLTrampolineFile.checkType(sql, STRINGP);
	_csetf_sqls_batch(statement, cons(sql, sqls_batch(statement)));
	return sql;
    }

    @LispMethod(comment = "Adds the SQL command to the current batch of commands for STATEMENT\r\nOnly INSERTs, UPDATEs or DELETE\'s are allowed, but no SELECTs.\r\n\r\n@param STATEMENT\n\t\tsql-statement-p\r\n\t\t\r\n@param SQL\n\t\tstring\r\n\t\t\r\n@return nil\nAdds the SQL command to the current batch of commands for STATEMENT\nOnly INSERTs, UPDATEs or DELETE\'s are allowed, but no SELECTs.")
    public static SubLObject sqls_add_batch(final SubLObject statement, final SubLObject sql) {
	assert NIL != sql_open_statement_p(statement) : "! sdbc.sql_open_statement_p(statement) " + ("sdbc.sql_open_statement_p(statement) " + "CommonSymbols.NIL != sdbc.sql_open_statement_p(statement) ") + statement;
	assert NIL != stringp(sql) : "! stringp(sql) " + ("Types.stringp(sql) " + "CommonSymbols.NIL != Types.stringp(sql) ") + sql;
	_csetf_sqls_batch(statement, cons(sql, sqls_batch(statement)));
	return sql;
    }

    /**
    * Adds the SQL command to the current batch of commands for STATEMENT
    * Only INSERTs, UPDATEs or DELETE's are allowed, but no SELECTs.
    *
    * @param STATEMENT
    	sql-statement-p
    * 		
    * @param SQL
    	string
    * 		
    * @return nil
    */

    /**
     * Makes the set of commands in the current batch empty
     */
    @LispMethod(comment = "Makes the set of commands in the current batch empty")
    public static final SubLObject sqls_clear_batch_alt(SubLObject statement) {
	SubLTrampolineFile.checkType(statement, SQL_OPEN_STATEMENT_P);
	{
	    SubLObject count = length(sqls_batch(statement));
	    _csetf_sqls_batch(statement, NIL);
	    return count;
	}
    }

    @LispMethod(comment = "Makes the set of commands in the current batch empty")
    public static SubLObject sqls_clear_batch(final SubLObject statement) {
	assert NIL != sql_open_statement_p(statement) : "! sdbc.sql_open_statement_p(statement) " + ("sdbc.sql_open_statement_p(statement) " + "CommonSymbols.NIL != sdbc.sql_open_statement_p(statement) ") + statement;
	final SubLObject count = length(sqls_batch(statement));
	_csetf_sqls_batch(statement, NIL);
	return count;
    }

    /**
    * Makes the set of commands in the current batch empty
    */

    /**
     * Submits the batch of commands in STATEMENT to the database and clears
     * the batch.
     *
     * @return vectorp; a vector of update counts
     */
    @LispMethod(comment = "Submits the batch of commands in STATEMENT to the database and clears\r\nthe batch.\r\n\r\n@return vectorp; a vector of update counts\nSubmits the batch of commands in STATEMENT to the database and clears\nthe batch.")
    public static final SubLObject sqls_execute_batch_alt(SubLObject statement) {
	SubLTrampolineFile.checkType(statement, SQL_OPEN_STATEMENT_P);
	{
	    SubLObject batch = sqls_batch(statement);
	    sqls_clear_batch(statement);
	    return NIL != batch ? ((SubLObject) (sqlc_execute(sqls_connection(statement), $execute_batch$.getGlobalValue(), list(sqls_id(statement), nreverse(batch))))) : NIL;
	}
    }

    @LispMethod(comment = "Submits the batch of commands in STATEMENT to the database and clears\r\nthe batch.\r\n\r\n@return vectorp; a vector of update counts\nSubmits the batch of commands in STATEMENT to the database and clears\nthe batch.")
    public static SubLObject sqls_execute_batch(final SubLObject statement) {
	assert NIL != sql_open_statement_p(statement) : "! sdbc.sql_open_statement_p(statement) " + ("sdbc.sql_open_statement_p(statement) " + "CommonSymbols.NIL != sdbc.sql_open_statement_p(statement) ") + statement;
	final SubLObject batch = sqls_batch(statement);
	sqls_clear_batch(statement);
	return NIL != batch ? sqlc_execute(sqls_connection(statement), $execute_batch$.getGlobalValue(), list(sqls_id(statement), nreverse(batch))) : NIL;
    }

    /**
    * Submits the batch of commands in STATEMENT to the database and clears
    * the batch.
    *
    * @return vectorp; a vector of update counts
    */

    /**
     *
     *
     * @return boolean; t if OBJECT is a prepared statement, nil otherwise
     */
    @LispMethod(comment = "@return boolean; t if OBJECT is a prepared statement, nil otherwise")
    public static final SubLObject sql_prepared_statement_p_alt(SubLObject v_object) {
	return makeBoolean((NIL != sql_statement_p(v_object)) && (NIL != sqls_sql(v_object)));
    }

    /**
     *
     *
     * @return boolean; t if OBJECT is a prepared statement, nil otherwise
     */
    @LispMethod(comment = "@return boolean; t if OBJECT is a prepared statement, nil otherwise")
    public static SubLObject sql_prepared_statement_p(final SubLObject v_object) {
	return makeBoolean((NIL != sql_statement_p(v_object)) && (NIL != sqls_sql(v_object)));
    }

    /**
     *
     *
     * @return boolean; t if OBJECT is a prepared open statement, nil otherwise
     */
    @LispMethod(comment = "@return boolean; t if OBJECT is a prepared open statement, nil otherwise")
    public static final SubLObject sql_prepared_open_statement_p_alt(SubLObject v_object) {
	return makeBoolean((NIL != sql_open_statement_p(v_object)) && (NIL != sqls_sql(v_object)));
    }

    /**
     *
     *
     * @return boolean; t if OBJECT is a prepared open statement, nil otherwise
     */
    @LispMethod(comment = "@return boolean; t if OBJECT is a prepared open statement, nil otherwise")
    public static SubLObject sql_prepared_open_statement_p(final SubLObject v_object) {
	return makeBoolean((NIL != sql_open_statement_p(v_object)) && (NIL != sqls_sql(v_object)));
    }

    /**
     * Execute the SQL database query of this statement
     *
     * @param STATEMENT
    sql-prepared-statement-p
     * 		
     * @param SQL
    stringp;
     * 		
     * @param BLOCK-SIZE
     * 		positive-integer-p; the maximum number of rows locally residing in the
     * 		result set created by this query
     * @return sql-open-result-set-p; the result set resulting from executing this statement
     */
    @LispMethod(comment = "Execute the SQL database query of this statement\r\n\r\n@param STATEMENT\nsql-prepared-statement-p\r\n\t\t\r\n@param SQL\nstringp;\r\n\t\t\r\n@param BLOCK-SIZE\r\n\t\tpositive-integer-p; the maximum number of rows locally residing in the\r\n\t\tresult set created by this query\r\n@return sql-open-result-set-p; the result set resulting from executing this statement")
    public static final SubLObject sqlps_execute_query_alt(SubLObject statement, SubLObject block_size) {
	if (block_size == UNPROVIDED) {
	    block_size = $result_set_block_size$.getDynamicValue();
	}
	SubLTrampolineFile.checkType(statement, SQL_PREPARED_OPEN_STATEMENT_P);
	SubLTrampolineFile.checkType(block_size, POSITIVE_INTEGER_P);
	if (NIL != sqls_rs(statement)) {
	    sqlrs_close(sqls_rs(statement));
	}
	{
	    SubLObject settings = sqls_settings(statement);
	    SubLObject rs = sqlc_execute(sqls_connection(statement), $ps_execute_query$.getGlobalValue(), list(sqls_id(statement), nreverse(settings), block_size));
	    _csetf_sqls_settings(statement, NIL);
	    _csetf_sqlrs_connection(rs, sqls_connection(statement));
	    _csetf_sqlrs_id(rs, sqls_id(statement));
	    _csetf_sqlrs_block_size(rs, block_size);
	    if (NIL != sqls_rs(statement)) {
		sqlrs_local_close(sqls_rs(statement));
	    }
	    _csetf_sqls_rs(statement, rs);
	    return rs;
	}
    }

    @LispMethod(comment = "Execute the SQL database query of this statement\r\n\r\n@param STATEMENT\n\t\tsql-prepared-statement-p\r\n\t\t\r\n@param SQL\n\t\tstringp;\r\n\t\t\r\n@param BLOCK-SIZE\r\n\t\tpositive-integer-p; the maximum number of rows locally residing in the\r\n\t\tresult set created by this query\r\n@return sql-open-result-set-p; the result set resulting from executing this statement")
    public static SubLObject sqlps_execute_query(final SubLObject statement, SubLObject block_size) {
	if (block_size == UNPROVIDED) {
	    block_size = $result_set_block_size$.getDynamicValue();
	}
	assert NIL != sql_prepared_open_statement_p(statement) : "! sdbc.sql_prepared_open_statement_p(statement) " + ("sdbc.sql_prepared_open_statement_p(statement) " + "CommonSymbols.NIL != sdbc.sql_prepared_open_statement_p(statement) ") + statement;
	assert NIL != subl_promotions.positive_integer_p(block_size) : "! subl_promotions.positive_integer_p(block_size) " + ("subl_promotions.positive_integer_p(block_size) " + "CommonSymbols.NIL != subl_promotions.positive_integer_p(block_size) ") + block_size;
	if (NIL != sqls_rs(statement)) {
	    sqlrs_close(sqls_rs(statement));
	}
	final SubLObject settings = sqls_settings(statement);
	final SubLObject rs = sqlc_execute(sqls_connection(statement), $ps_execute_query$.getGlobalValue(), list(sqls_id(statement), nreverse(settings), block_size));
	_csetf_sqls_settings(statement, NIL);
	_csetf_sqlrs_connection(rs, sqls_connection(statement));
	_csetf_sqlrs_id(rs, sqls_id(statement));
	_csetf_sqlrs_block_size(rs, block_size);
	if (NIL != sqls_rs(statement)) {
	    sqlrs_local_close(sqls_rs(statement));
	}
	_csetf_sqls_rs(statement, rs);
	return rs;
    }

    /**
    * Execute the SQL database query of this statement
    *
    * @param STATEMENT
    	sql-prepared-statement-p
    * 		
    * @param SQL
    	stringp;
    * 		
    * @param BLOCK-SIZE
    * 		positive-integer-p; the maximum number of rows locally residing in the
    * 		result set created by this query
    * @return sql-open-result-set-p; the result set resulting from executing this statement
    */

    /**
     * Executes the SQL database update of this statement
     *
     * @param STATEMENT
    sql-prepared-statement-p
     * 		
     */
    @LispMethod(comment = "Executes the SQL database update of this statement\r\n\r\n@param STATEMENT\nsql-prepared-statement-p")
    public static final SubLObject sqlps_execute_update_alt(SubLObject statement) {
	SubLTrampolineFile.checkType(statement, SQL_PREPARED_OPEN_STATEMENT_P);
	{
	    SubLObject settings = sqls_settings(statement);
	    _csetf_sqls_settings(statement, NIL);
	    return sqlc_execute(sqls_connection(statement), $ps_execute_update$.getGlobalValue(), list(sqls_id(statement), nreverse(settings)));
	}
    }

    @LispMethod(comment = "Executes the SQL database update of this statement\r\n\r\n@param STATEMENT\n\t\tsql-prepared-statement-p")
    public static SubLObject sqlps_execute_update(final SubLObject statement) {
	assert NIL != sql_prepared_open_statement_p(statement) : "! sdbc.sql_prepared_open_statement_p(statement) " + ("sdbc.sql_prepared_open_statement_p(statement) " + "CommonSymbols.NIL != sdbc.sql_prepared_open_statement_p(statement) ") + statement;
	final SubLObject settings = sqls_settings(statement);
	_csetf_sqls_settings(statement, NIL);
	return sqlc_execute(sqls_connection(statement), $ps_execute_update$.getGlobalValue(), list(sqls_id(statement), nreverse(settings)));
    }

    /**
    * Executes the SQL database update of this statement
    *
    * @param STATEMENT
    	sql-prepared-statement-p
    * 		
    */

    /**
     * Sets PARAMETER of STATEMENT to BYTES
     *
     * @param STATEMENT
    sql-prepared-statement-p
     * 		
     * @param PARAMETER
    integerp
     * 		
     * @param BYTES
    byte-vector-p
     * 		
     */
    @LispMethod(comment = "Sets PARAMETER of STATEMENT to BYTES\r\n\r\n@param STATEMENT\nsql-prepared-statement-p\r\n\t\t\r\n@param PARAMETER\nintegerp\r\n\t\t\r\n@param BYTES\nbyte-vector-p")
    public static final SubLObject sqlps_set_bytes_alt(SubLObject statement, SubLObject parameter, SubLObject bytes) {
	SubLTrampolineFile.checkType(statement, SQL_PREPARED_OPEN_STATEMENT_P);
	SubLTrampolineFile.checkType(parameter, NON_NEGATIVE_INTEGER_P);
	SubLTrampolineFile.checkType(bytes, BYTE_VECTOR_P);
	return sqlps_set(statement, $set_bytes$.getGlobalValue(), parameter, bytes);
    }

    @LispMethod(comment = "Sets PARAMETER of STATEMENT to BYTES\r\n\r\n@param STATEMENT\n\t\tsql-prepared-statement-p\r\n\t\t\r\n@param PARAMETER\n\t\tintegerp\r\n\t\t\r\n@param BYTES\n\t\tbyte-vector-p")
    public static SubLObject sqlps_set_bytes(final SubLObject statement, final SubLObject parameter, final SubLObject bytes) {
	assert NIL != sql_prepared_open_statement_p(statement) : "! sdbc.sql_prepared_open_statement_p(statement) " + ("sdbc.sql_prepared_open_statement_p(statement) " + "CommonSymbols.NIL != sdbc.sql_prepared_open_statement_p(statement) ") + statement;
	assert NIL != subl_promotions.non_negative_integer_p(parameter) : "! subl_promotions.non_negative_integer_p(parameter) " + ("subl_promotions.non_negative_integer_p(parameter) " + "CommonSymbols.NIL != subl_promotions.non_negative_integer_p(parameter) ") + parameter;
	assert NIL != vector_utilities.byte_vector_p(bytes) : "! vector_utilities.byte_vector_p(bytes) " + ("vector_utilities.byte_vector_p(bytes) " + "CommonSymbols.NIL != vector_utilities.byte_vector_p(bytes) ") + bytes;
	return sqlps_set(statement, $set_bytes$.getGlobalValue(), parameter, bytes);
    }

    /**
    * Sets PARAMETER of STATEMENT to BYTES
    *
    * @param STATEMENT
    	sql-prepared-statement-p
    * 		
    * @param PARAMETER
    	integerp
    * 		
    * @param BYTES
    	byte-vector-p
    * 		
    */

    /**
     * Sets PARAMETER of STATEMENT to INT
     *
     * @param STATEMENT
    sql-prepared-statement-p
     * 		
     * @param PARAMETER
    integerp
     * 		
     * @param INT
    integerp
     * 		
     */
    @LispMethod(comment = "Sets PARAMETER of STATEMENT to INT\r\n\r\n@param STATEMENT\nsql-prepared-statement-p\r\n\t\t\r\n@param PARAMETER\nintegerp\r\n\t\t\r\n@param INT\nintegerp")
    public static final SubLObject sqlps_set_int_alt(SubLObject statement, SubLObject parameter, SubLObject v_int) {
	SubLTrampolineFile.checkType(statement, SQL_PREPARED_OPEN_STATEMENT_P);
	SubLTrampolineFile.checkType(parameter, NON_NEGATIVE_INTEGER_P);
	SubLTrampolineFile.checkType(v_int, JAVA_INTEGERP);
	return sqlps_set(statement, $set_int$.getGlobalValue(), parameter, v_int);
    }

    @LispMethod(comment = "Sets PARAMETER of STATEMENT to INT\r\n\r\n@param STATEMENT\n\t\tsql-prepared-statement-p\r\n\t\t\r\n@param PARAMETER\n\t\tintegerp\r\n\t\t\r\n@param INT\n\t\tintegerp")
    public static SubLObject sqlps_set_int(final SubLObject statement, final SubLObject parameter, final SubLObject v_int) {
	assert NIL != sql_prepared_open_statement_p(statement) : "! sdbc.sql_prepared_open_statement_p(statement) " + ("sdbc.sql_prepared_open_statement_p(statement) " + "CommonSymbols.NIL != sdbc.sql_prepared_open_statement_p(statement) ") + statement;
	assert NIL != subl_promotions.non_negative_integer_p(parameter) : "! subl_promotions.non_negative_integer_p(parameter) " + ("subl_promotions.non_negative_integer_p(parameter) " + "CommonSymbols.NIL != subl_promotions.non_negative_integer_p(parameter) ") + parameter;
	assert NIL != java_integerp(v_int) : "! sdbc.java_integerp(v_int) " + ("sdbc.java_integerp(v_int) " + "CommonSymbols.NIL != sdbc.java_integerp(v_int) ") + v_int;
	return sqlps_set(statement, $set_int$.getGlobalValue(), parameter, v_int);
    }

    /**
    * Sets PARAMETER of STATEMENT to INT
    *
    * @param STATEMENT
    	sql-prepared-statement-p
    * 		
    * @param PARAMETER
    	integerp
    * 		
    * @param INT
    	integerp
    * 		
    */

    /**
     * Sets PARAMETER of STATEMENT to INT
     *
     * @param STATEMENT
    sql-prepared-statement-p
     * 		
     * @param PARAMETER
    integerp
     * 		
     * @param INT
    integerp
     * 		
     */
    @LispMethod(comment = "Sets PARAMETER of STATEMENT to INT\r\n\r\n@param STATEMENT\nsql-prepared-statement-p\r\n\t\t\r\n@param PARAMETER\nintegerp\r\n\t\t\r\n@param INT\nintegerp")
    public static final SubLObject sqlps_set_long_alt(SubLObject statement, SubLObject parameter, SubLObject v_long) {
	SubLTrampolineFile.checkType(statement, SQL_PREPARED_OPEN_STATEMENT_P);
	SubLTrampolineFile.checkType(parameter, NON_NEGATIVE_INTEGER_P);
	SubLTrampolineFile.checkType(v_long, JAVA_LONGP);
	return sqlps_set(statement, $set_long$.getGlobalValue(), parameter, v_long);
    }

    @LispMethod(comment = "Sets PARAMETER of STATEMENT to INT\r\n\r\n@param STATEMENT\n\t\tsql-prepared-statement-p\r\n\t\t\r\n@param PARAMETER\n\t\tintegerp\r\n\t\t\r\n@param INT\n\t\tintegerp")
    public static SubLObject sqlps_set_long(final SubLObject statement, final SubLObject parameter, final SubLObject v_long) {
	assert NIL != sql_prepared_open_statement_p(statement) : "! sdbc.sql_prepared_open_statement_p(statement) " + ("sdbc.sql_prepared_open_statement_p(statement) " + "CommonSymbols.NIL != sdbc.sql_prepared_open_statement_p(statement) ") + statement;
	assert NIL != subl_promotions.non_negative_integer_p(parameter) : "! subl_promotions.non_negative_integer_p(parameter) " + ("subl_promotions.non_negative_integer_p(parameter) " + "CommonSymbols.NIL != subl_promotions.non_negative_integer_p(parameter) ") + parameter;
	assert NIL != java_longp(v_long) : "! sdbc.java_longp(v_long) " + ("sdbc.java_longp(v_long) " + "CommonSymbols.NIL != sdbc.java_longp(v_long) ") + v_long;
	return sqlps_set(statement, $set_long$.getGlobalValue(), parameter, v_long);
    }

    /**
    * Sets PARAMETER of STATEMENT to INT
    *
    * @param STATEMENT
    	sql-prepared-statement-p
    * 		
    * @param PARAMETER
    	integerp
    * 		
    * @param INT
    	integerp
    * 		
    */

    /**
     * Sets PARAMETER of STATEMENT to INT
     *
     * @param STATEMENT
    sql-prepared-statement-p
     * 		
     * @param PARAMETER
    integerp
     * 		
     * @param INT
    integerp
     * 		
     */
    @LispMethod(comment = "Sets PARAMETER of STATEMENT to INT\r\n\r\n@param STATEMENT\nsql-prepared-statement-p\r\n\t\t\r\n@param PARAMETER\nintegerp\r\n\t\t\r\n@param INT\nintegerp")
    public static final SubLObject sqlps_set_float_alt(SubLObject statement, SubLObject parameter, SubLObject v_float) {
	SubLTrampolineFile.checkType(statement, SQL_PREPARED_OPEN_STATEMENT_P);
	SubLTrampolineFile.checkType(parameter, NON_NEGATIVE_INTEGER_P);
	SubLTrampolineFile.checkType(v_float, JAVA_FLOATP);
	return sqlps_set(statement, $set_float$.getGlobalValue(), parameter, v_float);
    }

    @LispMethod(comment = "Sets PARAMETER of STATEMENT to INT\r\n\r\n@param STATEMENT\n\t\tsql-prepared-statement-p\r\n\t\t\r\n@param PARAMETER\n\t\tintegerp\r\n\t\t\r\n@param INT\n\t\tintegerp")
    public static SubLObject sqlps_set_float(final SubLObject statement, final SubLObject parameter, final SubLObject v_float) {
	assert NIL != sql_prepared_open_statement_p(statement) : "! sdbc.sql_prepared_open_statement_p(statement) " + ("sdbc.sql_prepared_open_statement_p(statement) " + "CommonSymbols.NIL != sdbc.sql_prepared_open_statement_p(statement) ") + statement;
	assert NIL != subl_promotions.non_negative_integer_p(parameter) : "! subl_promotions.non_negative_integer_p(parameter) " + ("subl_promotions.non_negative_integer_p(parameter) " + "CommonSymbols.NIL != subl_promotions.non_negative_integer_p(parameter) ") + parameter;
	assert NIL != java_floatp(v_float) : "! sdbc.java_floatp(v_float) " + ("sdbc.java_floatp(v_float) " + "CommonSymbols.NIL != sdbc.java_floatp(v_float) ") + v_float;
	return sqlps_set(statement, $set_float$.getGlobalValue(), parameter, v_float);
    }

    /**
    * Sets PARAMETER of STATEMENT to INT
    *
    * @param STATEMENT
    	sql-prepared-statement-p
    * 		
    * @param PARAMETER
    	integerp
    * 		
    * @param INT
    	integerp
    * 		
    */

    /**
     * Sets PARAMETER of STATEMENT to INT
     *
     * @param STATEMENT
    sql-prepared-statement-p
     * 		
     * @param PARAMETER
    integerp
     * 		
     * @param INT
    integerp
     * 		
     */
    @LispMethod(comment = "Sets PARAMETER of STATEMENT to INT\r\n\r\n@param STATEMENT\nsql-prepared-statement-p\r\n\t\t\r\n@param PARAMETER\nintegerp\r\n\t\t\r\n@param INT\nintegerp")
    public static final SubLObject sqlps_set_double_alt(SubLObject statement, SubLObject parameter, SubLObject v_double) {
	SubLTrampolineFile.checkType(statement, SQL_PREPARED_OPEN_STATEMENT_P);
	SubLTrampolineFile.checkType(parameter, NON_NEGATIVE_INTEGER_P);
	SubLTrampolineFile.checkType(v_double, JAVA_DOUBLEP);
	return sqlps_set(statement, $set_double$.getGlobalValue(), parameter, v_double);
    }

    @LispMethod(comment = "Sets PARAMETER of STATEMENT to INT\r\n\r\n@param STATEMENT\n\t\tsql-prepared-statement-p\r\n\t\t\r\n@param PARAMETER\n\t\tintegerp\r\n\t\t\r\n@param INT\n\t\tintegerp")
    public static SubLObject sqlps_set_double(final SubLObject statement, final SubLObject parameter, final SubLObject v_double) {
	assert NIL != sql_prepared_open_statement_p(statement) : "! sdbc.sql_prepared_open_statement_p(statement) " + ("sdbc.sql_prepared_open_statement_p(statement) " + "CommonSymbols.NIL != sdbc.sql_prepared_open_statement_p(statement) ") + statement;
	assert NIL != subl_promotions.non_negative_integer_p(parameter) : "! subl_promotions.non_negative_integer_p(parameter) " + ("subl_promotions.non_negative_integer_p(parameter) " + "CommonSymbols.NIL != subl_promotions.non_negative_integer_p(parameter) ") + parameter;
	assert NIL != java_doublep(v_double) : "! sdbc.java_doublep(v_double) " + ("sdbc.java_doublep(v_double) " + "CommonSymbols.NIL != sdbc.java_doublep(v_double) ") + v_double;
	return sqlps_set(statement, $set_double$.getGlobalValue(), parameter, v_double);
    }

    /**
    * Sets PARAMETER of STATEMENT to INT
    *
    * @param STATEMENT
    	sql-prepared-statement-p
    * 		
    * @param PARAMETER
    	integerp
    * 		
    * @param INT
    	integerp
    * 		
    */

    /**
     * Sets PARAMETER of STATEMENT to INT
     *
     * @param STATEMENT
    sql-prepared-statement-p
     * 		
     * @param PARAMETER
    integerp
     * 		
     * @param STRING
    stringp
     * 		
     */
    @LispMethod(comment = "Sets PARAMETER of STATEMENT to INT\r\n\r\n@param STATEMENT\nsql-prepared-statement-p\r\n\t\t\r\n@param PARAMETER\nintegerp\r\n\t\t\r\n@param STRING\nstringp")
    public static final SubLObject sqlps_set_string_alt(SubLObject statement, SubLObject parameter, SubLObject string) {
	SubLTrampolineFile.checkType(statement, SQL_PREPARED_OPEN_STATEMENT_P);
	SubLTrampolineFile.checkType(parameter, NON_NEGATIVE_INTEGER_P);
	SubLTrampolineFile.checkType(string, STRINGP);
	return sqlps_set(statement, $set_string$.getGlobalValue(), parameter, string);
    }

    @LispMethod(comment = "Sets PARAMETER of STATEMENT to INT\r\n\r\n@param STATEMENT\n\t\tsql-prepared-statement-p\r\n\t\t\r\n@param PARAMETER\n\t\tintegerp\r\n\t\t\r\n@param STRING\n\t\tstringp")
    public static SubLObject sqlps_set_string(final SubLObject statement, final SubLObject parameter, final SubLObject string) {
	assert NIL != sql_prepared_open_statement_p(statement) : "! sdbc.sql_prepared_open_statement_p(statement) " + ("sdbc.sql_prepared_open_statement_p(statement) " + "CommonSymbols.NIL != sdbc.sql_prepared_open_statement_p(statement) ") + statement;
	assert NIL != subl_promotions.non_negative_integer_p(parameter) : "! subl_promotions.non_negative_integer_p(parameter) " + ("subl_promotions.non_negative_integer_p(parameter) " + "CommonSymbols.NIL != subl_promotions.non_negative_integer_p(parameter) ") + parameter;
	assert NIL != stringp(string) : "! stringp(string) " + ("Types.stringp(string) " + "CommonSymbols.NIL != Types.stringp(string) ") + string;
	return sqlps_set(statement, $set_string$.getGlobalValue(), parameter, string);
    }

    /**
    * Sets PARAMETER of STATEMENT to INT
    *
    * @param STATEMENT
    	sql-prepared-statement-p
    * 		
    * @param PARAMETER
    	integerp
    * 		
    * @param STRING
    	stringp
    * 		
    */

    /**
     * Creates a new database statement from CONNECTION
     *
     * @param CONNECTION
    sql-connection-p
     * 		
     * @return sql-statement-p, or an sdbc error
     */
    @LispMethod(comment = "Creates a new database statement from CONNECTION\r\n\r\n@param CONNECTION\nsql-connection-p\r\n\t\t\r\n@return sql-statement-p, or an sdbc error")
    public static final SubLObject new_sql_statement_alt(SubLObject connection) {
	{
	    SubLObject statement = make_sql_statement(UNPROVIDED);
	    SubLObject result = NIL;
	    _csetf_sqls_connection(statement, connection);
	    _csetf_sqls_id(statement, new_statement_id());
	    result = sqlc_execute(connection, $create_statement$.getGlobalValue(), list(sqls_id(statement)));
	    if (NIL != sdbc_error_p(result)) {
		statement = result;
	    }
	    return statement;
	}
    }

    @LispMethod(comment = "Creates a new database statement from CONNECTION\r\n\r\n@param CONNECTION\n\t\tsql-connection-p\r\n\t\t\r\n@return sql-statement-p, or an sdbc error")
    public static SubLObject new_sql_statement(final SubLObject connection) {
	SubLObject statement = make_sql_statement(UNPROVIDED);
	SubLObject result = NIL;
	_csetf_sqls_connection(statement, connection);
	_csetf_sqls_id(statement, new_statement_id());
	result = sqlc_execute(connection, $create_statement$.getGlobalValue(), list(sqls_id(statement)));
	if (NIL != sdbc_error_p(result)) {
	    statement = result;
	}
	return statement;
    }

    /**
    * Creates a new database statement from CONNECTION
    *
    * @param CONNECTION
    	sql-connection-p
    * 		
    * @return sql-statement-p, or an sdbc error
    */

    /**
     *
     *
     * @param STATEMENT
    sql-statement-p
     * 		
     * @return sql-connection; STATEMENT's connection
     */
    @LispMethod(comment = "@param STATEMENT\nsql-statement-p\r\n\t\t\r\n@return sql-connection; STATEMENT\'s connection")
    public static final SubLObject sqls_get_connection_alt(SubLObject statement) {
	SubLTrampolineFile.checkType(statement, SQL_STATEMENT_P);
	return sqls_connection(statement);
    }

    /**
     *
     *
     * @param STATEMENT
    sql-statement-p
     * 		
     * @return sql-connection; STATEMENT's connection
     */
    @LispMethod(comment = "@param STATEMENT\nsql-statement-p\r\n\t\t\r\n@return sql-connection; STATEMENT\'s connection")
    public static SubLObject sqls_get_connection(final SubLObject statement) {
	assert NIL != sql_statement_p(statement) : "! sdbc.sql_statement_p(statement) " + ("sdbc.sql_statement_p(statement) " + "CommonSymbols.NIL != sdbc.sql_statement_p(statement) ") + statement;
	return sqls_connection(statement);
    }

    /**
     * Closes the SubL part of STATEMENT
     *
     * @param STATEMENT
    sql-statement-p
     * 		
     * @return sql-statement-p; a closed STATEMENT
     */
    @LispMethod(comment = "Closes the SubL part of STATEMENT\r\n\r\n@param STATEMENT\nsql-statement-p\r\n\t\t\r\n@return sql-statement-p; a closed STATEMENT")
    public static final SubLObject sqls_local_close_alt(SubLObject statement) {
	if (NIL != sqls_rs(statement)) {
	    sqlrs_local_close(sqls_rs(statement));
	    _csetf_sqls_rs(statement, NIL);
	}
	if (NIL != sqls_connection(statement)) {
	    _csetf_sqlc_statements(sqls_connection(statement), remove(statement, sqlc_statements(sqls_connection(statement)), EQ, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED));
	    _csetf_sqls_connection(statement, NIL);
	}
	return statement;
    }

    @LispMethod(comment = "Closes the SubL part of STATEMENT\r\n\r\n@param STATEMENT\n\t\tsql-statement-p\r\n\t\t\r\n@return sql-statement-p; a closed STATEMENT")
    public static SubLObject sqls_local_close(final SubLObject statement) {
	if (NIL != sqls_rs(statement)) {
	    sqlrs_local_close(sqls_rs(statement));
	    _csetf_sqls_rs(statement, NIL);
	}
	if (NIL != sqls_connection(statement)) {
	    _csetf_sqlc_statements(sqls_connection(statement), remove(statement, sqlc_statements(sqls_connection(statement)), EQ, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED));
	    _csetf_sqls_connection(statement, NIL);
	}
	return statement;
    }

    /**
    * Closes the SubL part of STATEMENT
    *
    * @param STATEMENT
    	sql-statement-p
    * 		
    * @return sql-statement-p; a closed STATEMENT
    */

    /**
     * Stores a command encoded by integer COMMAND, the parameter number PARAMETER
     * and the parameter value DATA into STATEMENTS settings. All settings will
     * be executed as a batch on the server side once this statement is executed.
     */
    @LispMethod(comment = "Stores a command encoded by integer COMMAND, the parameter number PARAMETER\r\nand the parameter value DATA into STATEMENTS settings. All settings will\r\nbe executed as a batch on the server side once this statement is executed.\nStores a command encoded by integer COMMAND, the parameter number PARAMETER\nand the parameter value DATA into STATEMENTS settings. All settings will\nbe executed as a batch on the server side once this statement is executed.")
    public static final SubLObject sqlps_set_alt(SubLObject statement, SubLObject command, SubLObject parameter, SubLObject data) {
	{
	    SubLObject setting = list(command, parameter, data);
	    _csetf_sqls_settings(statement, cons(setting, sqls_settings(statement)));
	    return setting;
	}
    }

    @LispMethod(comment = "Stores a command encoded by integer COMMAND, the parameter number PARAMETER\r\nand the parameter value DATA into STATEMENTS settings. All settings will\r\nbe executed as a batch on the server side once this statement is executed.\nStores a command encoded by integer COMMAND, the parameter number PARAMETER\nand the parameter value DATA into STATEMENTS settings. All settings will\nbe executed as a batch on the server side once this statement is executed.")
    public static SubLObject sqlps_set(final SubLObject statement, final SubLObject command, final SubLObject parameter, final SubLObject data) {
	final SubLObject setting = list(command, parameter, data);
	_csetf_sqls_settings(statement, cons(setting, sqls_settings(statement)));
	return setting;
    }

    /**
    * Stores a command encoded by integer COMMAND, the parameter number PARAMETER
    * and the parameter value DATA into STATEMENTS settings. All settings will
    * be executed as a batch on the server side once this statement is executed.
    */

    /**
     * Creates a new prepared database statement from CONNECTION with precompiled sql SQL
     *
     * @param CONNECTION
    sql-connection-p
     * 		
     * @param SQL
    stringp
     * 		
     * @return sql-prepared-statement-p, or an sdbc error
     */
    @LispMethod(comment = "Creates a new prepared database statement from CONNECTION with precompiled sql SQL\r\n\r\n@param CONNECTION\nsql-connection-p\r\n\t\t\r\n@param SQL\nstringp\r\n\t\t\r\n@return sql-prepared-statement-p, or an sdbc error")
    public static final SubLObject new_sql_prepared_statement_alt(SubLObject connection, SubLObject sql) {
	{
	    SubLObject statement = make_sql_statement(UNPROVIDED);
	    SubLObject result = NIL;
	    _csetf_sqls_connection(statement, connection);
	    _csetf_sqls_id(statement, new_statement_id());
	    _csetf_sqls_sql(statement, sql);
	    result = sqlc_execute(sqls_connection(statement), $prepare_statement$.getGlobalValue(), list(sqls_id(statement), sql));
	    if (NIL != sdbc_error_p(result)) {
		statement = result;
	    }
	    return statement;
	}
    }

    @LispMethod(comment = "Creates a new prepared database statement from CONNECTION with precompiled sql SQL\r\n\r\n@param CONNECTION\n\t\tsql-connection-p\r\n\t\t\r\n@param SQL\n\t\tstringp\r\n\t\t\r\n@return sql-prepared-statement-p, or an sdbc error")
    public static SubLObject new_sql_prepared_statement(final SubLObject connection, final SubLObject sql) {
	SubLObject statement = make_sql_statement(UNPROVIDED);
	SubLObject result = NIL;
	_csetf_sqls_connection(statement, connection);
	_csetf_sqls_id(statement, new_statement_id());
	_csetf_sqls_sql(statement, sql);
	result = sqlc_execute(sqls_connection(statement), $prepare_statement$.getGlobalValue(), list(sqls_id(statement), sql));
	if (NIL != sdbc_error_p(result)) {
	    statement = result;
	}
	return statement;
    }

    /**
    * Creates a new prepared database statement from CONNECTION with precompiled sql SQL
    *
    * @param CONNECTION
    	sql-connection-p
    * 		
    * @param SQL
    	stringp
    * 		
    * @return sql-prepared-statement-p, or an sdbc error
    */

    /**
     * Returns a unique statement id string
     */
    @LispMethod(comment = "Returns a unique statement id string")
    public static final SubLObject new_statement_id_alt() {
	return princ_to_string(gensym($$$STMT));
    }

    @LispMethod(comment = "Returns a unique statement id string")
    public static SubLObject new_statement_id() {
	return princ_to_string(gensym($$$STMT));
    }

    /**
    * Returns a unique statement id string
    */

    /**
     * Returns a unique result set id string
     */
    @LispMethod(comment = "Returns a unique result set id string")
    public static final SubLObject new_result_set_id_alt() {
	return princ_to_string(gensym($$$RS));
    }

    @LispMethod(comment = "Returns a unique result set id string")
    public static SubLObject new_result_set_id() {
	return princ_to_string(gensym($$$RS));
    }

    /**
    * Returns a unique result set id string
    */

    /**
     * Retrieves a description of the tables available in the given catalog.
     *
     * @param CONNECTION
    sql-connection-p;
     * 		
     * @param CATALOG
     * 		stringp; a catalog name; must match the catalog name as it is stored in
     * 		the database; "" retrieves those without a catalog; nil means that the catalog name
     * 		should not be used to narrow the search
     * @param SCHEMA-PATTERN
     * 		stringp; a schema name pattern; must match the schema name as it
     * 		is stored in the database; "" retrieves those without a schema; nil means that the schema
     * 		name should not be used to narrow the search
     * @param TABLE-NAME-PATTERN
     * 		stringp; a table name pattern; must match the table name as
     * 		it is stored in the database
     * @param TYPES
     * 		listp; a list of table types to include; nil returns all types
     * @return sql-result-set-p; each row is a table description
     */
    @LispMethod(comment = "Retrieves a description of the tables available in the given catalog.\r\n\r\n@param CONNECTION\nsql-connection-p;\r\n\t\t\r\n@param CATALOG\r\n\t\tstringp; a catalog name; must match the catalog name as it is stored in\r\n\t\tthe database; \"\" retrieves those without a catalog; nil means that the catalog name\r\n\t\tshould not be used to narrow the search\r\n@param SCHEMA-PATTERN\r\n\t\tstringp; a schema name pattern; must match the schema name as it\r\n\t\tis stored in the database; \"\" retrieves those without a schema; nil means that the schema\r\n\t\tname should not be used to narrow the search\r\n@param TABLE-NAME-PATTERN\r\n\t\tstringp; a table name pattern; must match the table name as\r\n\t\tit is stored in the database\r\n@param TYPES\r\n\t\tlistp; a list of table types to include; nil returns all types\r\n@return sql-result-set-p; each row is a table description")
    public static final SubLObject sqlc_get_tables_alt(SubLObject connection, SubLObject catalog, SubLObject schema_pattern, SubLObject table_name_pattern, SubLObject types) {
	{
	    final SubLThread thread = SubLProcess.currentSubLThread();
	    SubLTrampolineFile.checkType(connection, SQL_OPEN_CONNECTION_P);
	    SubLTrampolineFile.checkType(catalog, STRINGP);
	    SubLTrampolineFile.checkType(schema_pattern, STRINGP);
	    SubLTrampolineFile.checkType(table_name_pattern, STRINGP);
	    SubLTrampolineFile.checkType(types, LISTP);
	    {
		SubLObject rs = sqlc_execute(connection, $get_tables$.getGlobalValue(), list(catalog, schema_pattern, table_name_pattern, types, $result_set_block_size$.getDynamicValue(thread)));
		if (NIL != sql_result_set_p(rs)) {
		    _csetf_sqlrs_connection(rs, connection);
		    _csetf_sqlrs_id(rs, $connection_id$.getGlobalValue());
		}
		return rs;
	    }
	}
    }

    @LispMethod(comment = "Retrieves a description of the tables available in the given catalog.\r\n\r\n@param CONNECTION\n\t\tsql-connection-p;\r\n\t\t\r\n@param CATALOG\r\n\t\tstringp; a catalog name; must match the catalog name as it is stored in\r\n\t\tthe database; \"\" retrieves those without a catalog; nil means that the catalog name\r\n\t\tshould not be used to narrow the search\r\n@param SCHEMA-PATTERN\r\n\t\tstringp; a schema name pattern; must match the schema name as it\r\n\t\tis stored in the database; \"\" retrieves those without a schema; nil means that the schema\r\n\t\tname should not be used to narrow the search\r\n@param TABLE-NAME-PATTERN\r\n\t\tstringp; a table name pattern; must match the table name as\r\n\t\tit is stored in the database\r\n@param TYPES\r\n\t\tlistp; a list of table types to include; nil returns all types\r\n@return sql-result-set-p; each row is a table description")
    public static SubLObject sqlc_get_tables(final SubLObject connection, final SubLObject catalog, final SubLObject schema_pattern, final SubLObject table_name_pattern, final SubLObject types) {
	final SubLThread thread = SubLProcess.currentSubLThread();
	assert NIL != sql_open_connection_p(connection) : "! sdbc.sql_open_connection_p(connection) " + ("sdbc.sql_open_connection_p(connection) " + "CommonSymbols.NIL != sdbc.sql_open_connection_p(connection) ") + connection;
	assert NIL != stringp(schema_pattern) : "! stringp(schema_pattern) " + ("Types.stringp(schema_pattern) " + "CommonSymbols.NIL != Types.stringp(schema_pattern) ") + schema_pattern;
	assert NIL != stringp(table_name_pattern) : "! stringp(table_name_pattern) " + ("Types.stringp(table_name_pattern) " + "CommonSymbols.NIL != Types.stringp(table_name_pattern) ") + table_name_pattern;
	assert NIL != listp(types) : "! listp(types) " + ("Types.listp(types) " + "CommonSymbols.NIL != Types.listp(types) ") + types;
	final SubLObject rs = sqlc_execute(connection, $get_tables$.getGlobalValue(), list(catalog, schema_pattern, table_name_pattern, types, $result_set_block_size$.getDynamicValue(thread)));
	if (NIL != sql_result_set_p(rs)) {
	    _csetf_sqlrs_connection(rs, connection);
	    _csetf_sqlrs_id(rs, $connection_id$.getGlobalValue());
	}
	return rs;
    }

    /**
    * Retrieves a description of the tables available in the given catalog.
    *
    * @param CONNECTION
    	sql-connection-p;
    * 		
    * @param CATALOG
    * 		stringp; a catalog name; must match the catalog name as it is stored in
    * 		the database; "" retrieves those without a catalog; nil means that the catalog name
    * 		should not be used to narrow the search
    * @param SCHEMA-PATTERN
    * 		stringp; a schema name pattern; must match the schema name as it
    * 		is stored in the database; "" retrieves those without a schema; nil means that the schema
    * 		name should not be used to narrow the search
    * @param TABLE-NAME-PATTERN
    * 		stringp; a table name pattern; must match the table name as
    * 		it is stored in the database
    * @param TYPES
    * 		listp; a list of table types to include; nil returns all types
    * @return sql-result-set-p; each row is a table description
    */

    public static final SubLObject sqlc_get_tables_meta_data_alt(SubLObject connection, SubLObject catalog, SubLObject schema_pattern, SubLObject table_name_pattern, SubLObject types) {
	{
	    SubLObject result_set = apply(SQLC_GET_TABLES, list(connection, catalog, schema_pattern, table_name_pattern, types));
	    if (NIL == sql_result_set_p(result_set)) {
		Errors.warn($str_alt234$SQLC_error___A, result_set);
		return NIL;
	    }
	    {
		SubLObject column_count = sqlrs_column_count(result_set);
		SubLObject results = NIL;
		while (NIL == sqlrs_is_last(result_set)) {
		    sqlrs_next(result_set);
		    {
			SubLObject i = ZERO_INTEGER;
			SubLObject v_bindings = NIL;
			SubLObject cdolist_list_var = $list_alt235;
			SubLObject key = NIL;
			for (key = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest(), key = cdolist_list_var.first()) {
			    i = add(i, ONE_INTEGER);
			    if (i.numLE(column_count)) {
				v_bindings = cons(key, v_bindings);
				v_bindings = cons(sqlrs_get_object(result_set, i), v_bindings);
			    }
			}
			results = cons(nreverse(v_bindings), results);
		    }
		}
		return nreverse(results);
	    }
	}
    }

    public static SubLObject sqlc_get_tables_meta_data(final SubLObject connection, final SubLObject catalog, final SubLObject schema_pattern, final SubLObject table_name_pattern, final SubLObject types) {
	final SubLObject result_set = apply(SQLC_GET_TABLES, list(connection, catalog, schema_pattern, table_name_pattern, types));
	if (NIL == sql_result_set_p(result_set)) {
	    Errors.warn($str256$SQLC_error___A, result_set);
	    return NIL;
	}
	final SubLObject column_count = sqlrs_column_count(result_set);
	SubLObject results = NIL;
	while (NIL == sqlrs_is_last(result_set)) {
	    sqlrs_next(result_set);
	    SubLObject i = ZERO_INTEGER;
	    SubLObject v_bindings = NIL;
	    SubLObject cdolist_list_var = $list257;
	    SubLObject key = NIL;
	    key = cdolist_list_var.first();
	    while (NIL != cdolist_list_var) {
		i = add(i, ONE_INTEGER);
		if (i.numLE(column_count)) {
		    v_bindings = cons(key, v_bindings);
		    v_bindings = cons(sqlrs_get_object(result_set, i), v_bindings);
		}
		cdolist_list_var = cdolist_list_var.rest();
		key = cdolist_list_var.first();
	    }
	    results = cons(nreverse(v_bindings), results);
	}
	return nreverse(results);
    }

    /**
     * Retrieves a description of table columns available in the specified catalog.
     *
     * @param CONNECTION
    sql-connection-p;
     * 		
     * @param CATALOG
     * 		stringp; a catalog name; must match the catalog name as it is stored in
     * 		the database; "" retrieves those without a catalog; nil means that the catalog name
     * 		should not be used to narrow the search
     * @param SCHEMA-PATTERN
     * 		stringp; a schema name pattern; must match the schema name as it
     * 		is stored in the database; "" retrieves those without a schema; nil means that the schema
     * 		name should not be used to narrow the search
     * @param TABLE-NAME-PATTERN
     * 		stringp; a table name pattern; must match the table name as
     * 		it is stored in the database
     * @param COLUMN-NAME-PATTERN
     * 		stringp; a column name pattern; must match the column name
     * 		as it is stored in the database
     * @return sql-result-set-p; each row is a column description
     */
    @LispMethod(comment = "Retrieves a description of table columns available in the specified catalog.\r\n\r\n@param CONNECTION\nsql-connection-p;\r\n\t\t\r\n@param CATALOG\r\n\t\tstringp; a catalog name; must match the catalog name as it is stored in\r\n\t\tthe database; \"\" retrieves those without a catalog; nil means that the catalog name\r\n\t\tshould not be used to narrow the search\r\n@param SCHEMA-PATTERN\r\n\t\tstringp; a schema name pattern; must match the schema name as it\r\n\t\tis stored in the database; \"\" retrieves those without a schema; nil means that the schema\r\n\t\tname should not be used to narrow the search\r\n@param TABLE-NAME-PATTERN\r\n\t\tstringp; a table name pattern; must match the table name as\r\n\t\tit is stored in the database\r\n@param COLUMN-NAME-PATTERN\r\n\t\tstringp; a column name pattern; must match the column name\r\n\t\tas it is stored in the database\r\n@return sql-result-set-p; each row is a column description")
    public static final SubLObject sqlc_get_columns_alt(SubLObject connection, SubLObject catalog, SubLObject schema_pattern, SubLObject table_name_pattern, SubLObject column_name_pattern) {
	{
	    final SubLThread thread = SubLProcess.currentSubLThread();
	    SubLTrampolineFile.checkType(connection, SQL_OPEN_CONNECTION_P);
	    SubLTrampolineFile.checkType(catalog, STRINGP);
	    SubLTrampolineFile.checkType(schema_pattern, STRINGP);
	    SubLTrampolineFile.checkType(table_name_pattern, STRINGP);
	    SubLTrampolineFile.checkType(column_name_pattern, STRINGP);
	    {
		SubLObject rs = sqlc_execute(connection, $get_columns$.getGlobalValue(), list(catalog, schema_pattern, table_name_pattern, column_name_pattern, $result_set_block_size$.getDynamicValue(thread)));
		if (NIL != sql_result_set_p(rs)) {
		    _csetf_sqlrs_connection(rs, connection);
		    _csetf_sqlrs_id(rs, $connection_id$.getGlobalValue());
		}
		return rs;
	    }
	}
    }

    @LispMethod(comment = "Retrieves a description of table columns available in the specified catalog.\r\n\r\n@param CONNECTION\n\t\tsql-connection-p;\r\n\t\t\r\n@param CATALOG\r\n\t\tstringp; a catalog name; must match the catalog name as it is stored in\r\n\t\tthe database; \"\" retrieves those without a catalog; nil means that the catalog name\r\n\t\tshould not be used to narrow the search\r\n@param SCHEMA-PATTERN\r\n\t\tstringp; a schema name pattern; must match the schema name as it\r\n\t\tis stored in the database; \"\" retrieves those without a schema; nil means that the schema\r\n\t\tname should not be used to narrow the search\r\n@param TABLE-NAME-PATTERN\r\n\t\tstringp; a table name pattern; must match the table name as\r\n\t\tit is stored in the database\r\n@param COLUMN-NAME-PATTERN\r\n\t\tstringp; a column name pattern; must match the column name\r\n\t\tas it is stored in the database\r\n@return sql-result-set-p; each row is a column description")
    public static SubLObject sqlc_get_columns(final SubLObject connection, final SubLObject catalog, final SubLObject schema_pattern, final SubLObject table_name_pattern, final SubLObject column_name_pattern) {
	final SubLThread thread = SubLProcess.currentSubLThread();
	assert NIL != sql_open_connection_p(connection) : "! sdbc.sql_open_connection_p(connection) " + ("sdbc.sql_open_connection_p(connection) " + "CommonSymbols.NIL != sdbc.sql_open_connection_p(connection) ") + connection;
	assert NIL != stringp(catalog) : "! stringp(catalog) " + ("Types.stringp(catalog) " + "CommonSymbols.NIL != Types.stringp(catalog) ") + catalog;
	assert NIL != stringp(schema_pattern) : "! stringp(schema_pattern) " + ("Types.stringp(schema_pattern) " + "CommonSymbols.NIL != Types.stringp(schema_pattern) ") + schema_pattern;
	assert NIL != stringp(table_name_pattern) : "! stringp(table_name_pattern) " + ("Types.stringp(table_name_pattern) " + "CommonSymbols.NIL != Types.stringp(table_name_pattern) ") + table_name_pattern;
	assert NIL != stringp(column_name_pattern) : "! stringp(column_name_pattern) " + ("Types.stringp(column_name_pattern) " + "CommonSymbols.NIL != Types.stringp(column_name_pattern) ") + column_name_pattern;
	final SubLObject rs = sqlc_execute(connection, $get_columns$.getGlobalValue(), list(catalog, schema_pattern, table_name_pattern, column_name_pattern, $result_set_block_size$.getDynamicValue(thread)));
	if (NIL != sql_result_set_p(rs)) {
	    _csetf_sqlrs_connection(rs, connection);
	    _csetf_sqlrs_id(rs, $connection_id$.getGlobalValue());
	}
	return rs;
    }

    /**
    * Retrieves a description of table columns available in the specified catalog.
    *
    * @param CONNECTION
    	sql-connection-p;
    * 		
    * @param CATALOG
    * 		stringp; a catalog name; must match the catalog name as it is stored in
    * 		the database; "" retrieves those without a catalog; nil means that the catalog name
    * 		should not be used to narrow the search
    * @param SCHEMA-PATTERN
    * 		stringp; a schema name pattern; must match the schema name as it
    * 		is stored in the database; "" retrieves those without a schema; nil means that the schema
    * 		name should not be used to narrow the search
    * @param TABLE-NAME-PATTERN
    * 		stringp; a table name pattern; must match the table name as
    * 		it is stored in the database
    * @param COLUMN-NAME-PATTERN
    * 		stringp; a column name pattern; must match the column name
    * 		as it is stored in the database
    * @return sql-result-set-p; each row is a column description
    */

    public static final SubLObject sqlc_get_columns_meta_data_alt(SubLObject connection, SubLObject catalog, SubLObject schema_pattern, SubLObject table_name_pattern, SubLObject column_name_pattern) {
	{
	    SubLObject result_set = apply(SQLC_GET_COLUMNS, list(connection, catalog, schema_pattern, table_name_pattern, column_name_pattern));
	    if (NIL == sql_result_set_p(result_set)) {
		Errors.warn($str_alt234$SQLC_error___A, result_set);
		return NIL;
	    }
	    {
		SubLObject column_count = sqlrs_column_count(result_set);
		SubLObject results = NIL;
		while (NIL == sqlrs_is_last(result_set)) {
		    sqlrs_next(result_set);
		    {
			SubLObject i = ZERO_INTEGER;
			SubLObject v_bindings = NIL;
			SubLObject cdolist_list_var = $list_alt237;
			SubLObject key = NIL;
			for (key = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest(), key = cdolist_list_var.first()) {
			    i = add(i, ONE_INTEGER);
			    if (i.numLE(column_count)) {
				v_bindings = cons(key, v_bindings);
				v_bindings = cons(sqlrs_get_object(result_set, i), v_bindings);
			    }
			}
			results = cons(nreverse(v_bindings), results);
		    }
		}
		return nreverse(results);
	    }
	}
    }

    public static SubLObject sqlc_get_columns_meta_data(final SubLObject connection, final SubLObject catalog, final SubLObject schema_pattern, final SubLObject table_name_pattern, final SubLObject column_name_pattern) {
	final SubLObject result_set = apply(SQLC_GET_COLUMNS, list(connection, catalog, schema_pattern, table_name_pattern, column_name_pattern));
	if (NIL == sql_result_set_p(result_set)) {
	    Errors.warn($str256$SQLC_error___A, result_set);
	    return NIL;
	}
	final SubLObject column_count = sqlrs_column_count(result_set);
	SubLObject results = NIL;
	while (NIL == sqlrs_is_last(result_set)) {
	    sqlrs_next(result_set);
	    SubLObject i = ZERO_INTEGER;
	    SubLObject v_bindings = NIL;
	    SubLObject cdolist_list_var = $list259;
	    SubLObject key = NIL;
	    key = cdolist_list_var.first();
	    while (NIL != cdolist_list_var) {
		i = add(i, ONE_INTEGER);
		if (i.numLE(column_count)) {
		    v_bindings = cons(key, v_bindings);
		    v_bindings = cons(sqlrs_get_object(result_set, i), v_bindings);
		}
		cdolist_list_var = cdolist_list_var.rest();
		key = cdolist_list_var.first();
	    }
	    results = cons(nreverse(v_bindings), results);
	}
	return nreverse(results);
    }

    /**
     * Retrieves a description of the given table's primary key columns.
     *
     * @param CONNECTION
    sql-connection-p;
     * 		
     * @param CATALOG
     * 		stringp; a catalog name; must match the catalog name as it is stored in
     * 		the database; "" retrieves those without a catalog; null means that the catalog name
     * 		should not be used to narrow the search
     * @param SCHEMA
     * 		stringp; a schema name; must match the schema name as it is stored in the
     * 		database; "" retrieves those without a schema; null means that the schema name should not
     * 		be used to narrow the search
     * @param TABLE
     * 		stringp; a table name; must match the table name as it is stored in the
     * 		database
     * @return sql-result-set-p; each row is a primary key column description
     */
    @LispMethod(comment = "Retrieves a description of the given table\'s primary key columns.\r\n\r\n@param CONNECTION\nsql-connection-p;\r\n\t\t\r\n@param CATALOG\r\n\t\tstringp; a catalog name; must match the catalog name as it is stored in\r\n\t\tthe database; \"\" retrieves those without a catalog; null means that the catalog name\r\n\t\tshould not be used to narrow the search\r\n@param SCHEMA\r\n\t\tstringp; a schema name; must match the schema name as it is stored in the\r\n\t\tdatabase; \"\" retrieves those without a schema; null means that the schema name should not\r\n\t\tbe used to narrow the search\r\n@param TABLE\r\n\t\tstringp; a table name; must match the table name as it is stored in the\r\n\t\tdatabase\r\n@return sql-result-set-p; each row is a primary key column description")
    public static final SubLObject sqlc_get_primary_keys_alt(SubLObject connection, SubLObject catalog, SubLObject schema, SubLObject table) {
	{
	    final SubLThread thread = SubLProcess.currentSubLThread();
	    SubLTrampolineFile.checkType(catalog, STRINGP);
	    SubLTrampolineFile.checkType(schema, STRINGP);
	    SubLTrampolineFile.checkType(table, STRINGP);
	    {
		SubLObject rs = sqlc_execute(connection, $get_primary_keys$.getGlobalValue(), list(catalog, schema, table, $result_set_block_size$.getDynamicValue(thread)));
		if (NIL != sql_result_set_p(rs)) {
		    _csetf_sqlrs_connection(rs, connection);
		    _csetf_sqlrs_id(rs, $connection_id$.getGlobalValue());
		}
		return rs;
	    }
	}
    }

    @LispMethod(comment = "Retrieves a description of the given table\'s primary key columns.\r\n\r\n@param CONNECTION\n\t\tsql-connection-p;\r\n\t\t\r\n@param CATALOG\r\n\t\tstringp; a catalog name; must match the catalog name as it is stored in\r\n\t\tthe database; \"\" retrieves those without a catalog; null means that the catalog name\r\n\t\tshould not be used to narrow the search\r\n@param SCHEMA\r\n\t\tstringp; a schema name; must match the schema name as it is stored in the\r\n\t\tdatabase; \"\" retrieves those without a schema; null means that the schema name should not\r\n\t\tbe used to narrow the search\r\n@param TABLE\r\n\t\tstringp; a table name; must match the table name as it is stored in the\r\n\t\tdatabase\r\n@return sql-result-set-p; each row is a primary key column description")
    public static SubLObject sqlc_get_primary_keys(final SubLObject connection, final SubLObject catalog, final SubLObject schema, final SubLObject table) {
	final SubLThread thread = SubLProcess.currentSubLThread();
	assert NIL != stringp(catalog) : "! stringp(catalog) " + ("Types.stringp(catalog) " + "CommonSymbols.NIL != Types.stringp(catalog) ") + catalog;
	assert NIL != stringp(schema) : "! stringp(schema) " + ("Types.stringp(schema) " + "CommonSymbols.NIL != Types.stringp(schema) ") + schema;
	assert NIL != stringp(table) : "! stringp(table) " + ("Types.stringp(table) " + "CommonSymbols.NIL != Types.stringp(table) ") + table;
	final SubLObject rs = sqlc_execute(connection, $get_primary_keys$.getGlobalValue(), list(catalog, schema, table, $result_set_block_size$.getDynamicValue(thread)));
	if (NIL != sql_result_set_p(rs)) {
	    _csetf_sqlrs_connection(rs, connection);
	    _csetf_sqlrs_id(rs, $connection_id$.getGlobalValue());
	}
	return rs;
    }

    /**
    * Retrieves a description of the given table's primary key columns.
    *
    * @param CONNECTION
    	sql-connection-p;
    * 		
    * @param CATALOG
    * 		stringp; a catalog name; must match the catalog name as it is stored in
    * 		the database; "" retrieves those without a catalog; null means that the catalog name
    * 		should not be used to narrow the search
    * @param SCHEMA
    * 		stringp; a schema name; must match the schema name as it is stored in the
    * 		database; "" retrieves those without a schema; null means that the schema name should not
    * 		be used to narrow the search
    * @param TABLE
    * 		stringp; a table name; must match the table name as it is stored in the
    * 		database
    * @return sql-result-set-p; each row is a primary key column description
    */

    public static final SubLObject sqlc_get_primary_keys_meta_data_alt(SubLObject connection, SubLObject catalog, SubLObject schema, SubLObject table) {
	{
	    SubLObject result_set = apply(SQLC_GET_PRIMARY_KEYS, list(connection, catalog, schema, table));
	    if (NIL == sql_result_set_p(result_set)) {
		Errors.warn($str_alt234$SQLC_error___A, result_set);
		return NIL;
	    }
	    {
		SubLObject column_count = sqlrs_column_count(result_set);
		SubLObject results = NIL;
		while (NIL == sqlrs_is_last(result_set)) {
		    sqlrs_next(result_set);
		    {
			SubLObject i = ZERO_INTEGER;
			SubLObject v_bindings = NIL;
			SubLObject cdolist_list_var = $list_alt239;
			SubLObject key = NIL;
			for (key = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest(), key = cdolist_list_var.first()) {
			    i = add(i, ONE_INTEGER);
			    if (i.numLE(column_count)) {
				v_bindings = cons(key, v_bindings);
				v_bindings = cons(sqlrs_get_object(result_set, i), v_bindings);
			    }
			}
			results = cons(nreverse(v_bindings), results);
		    }
		}
		return nreverse(results);
	    }
	}
    }

    public static SubLObject sqlc_get_primary_keys_meta_data(final SubLObject connection, final SubLObject catalog, final SubLObject schema, final SubLObject table) {
	final SubLObject result_set = apply(SQLC_GET_PRIMARY_KEYS, list(connection, catalog, schema, table));
	if (NIL == sql_result_set_p(result_set)) {
	    Errors.warn($str256$SQLC_error___A, result_set);
	    return NIL;
	}
	final SubLObject column_count = sqlrs_column_count(result_set);
	SubLObject results = NIL;
	while (NIL == sqlrs_is_last(result_set)) {
	    sqlrs_next(result_set);
	    SubLObject i = ZERO_INTEGER;
	    SubLObject v_bindings = NIL;
	    SubLObject cdolist_list_var = $list261;
	    SubLObject key = NIL;
	    key = cdolist_list_var.first();
	    while (NIL != cdolist_list_var) {
		i = add(i, ONE_INTEGER);
		if (i.numLE(column_count)) {
		    v_bindings = cons(key, v_bindings);
		    v_bindings = cons(sqlrs_get_object(result_set, i), v_bindings);
		}
		cdolist_list_var = cdolist_list_var.rest();
		key = cdolist_list_var.first();
	    }
	    results = cons(nreverse(v_bindings), results);
	}
	return nreverse(results);
    }

    /**
     * Retrieves a description of the primary key columns that are referenced by a table's
     * foreign key columns (the primary keys imported by a table).
     *
     * @param CONNECTION
    sql-connection-p;
     * 		
     * @param CATALOG
     * 		stringp; a catalog name; must match the catalog name as it is stored in
     * 		the database; "" retrieves those without a catalog; null means that the catalog name
     * 		should not be used to narrow the search
     * @param SCHEMA
     * 		stringp; a schema name; must match the schema name as it is stored in the
     * 		database; "" retrieves those without a schema; null means that the schema name should not
     * 		be used to narrow the search
     * @param TABLE
     * 		stringp; a table name; must match the table name as it is stored in the
     * 		database
     * @return sql-result-set-p; each row is a primary key column description
     */
    @LispMethod(comment = "Retrieves a description of the primary key columns that are referenced by a table\'s\r\nforeign key columns (the primary keys imported by a table).\r\n\r\n@param CONNECTION\nsql-connection-p;\r\n\t\t\r\n@param CATALOG\r\n\t\tstringp; a catalog name; must match the catalog name as it is stored in\r\n\t\tthe database; \"\" retrieves those without a catalog; null means that the catalog name\r\n\t\tshould not be used to narrow the search\r\n@param SCHEMA\r\n\t\tstringp; a schema name; must match the schema name as it is stored in the\r\n\t\tdatabase; \"\" retrieves those without a schema; null means that the schema name should not\r\n\t\tbe used to narrow the search\r\n@param TABLE\r\n\t\tstringp; a table name; must match the table name as it is stored in the\r\n\t\tdatabase\r\n@return sql-result-set-p; each row is a primary key column description\nRetrieves a description of the primary key columns that are referenced by a table\'s\nforeign key columns (the primary keys imported by a table).")
    public static final SubLObject sqlc_get_imported_keys_alt(SubLObject connection, SubLObject catalog, SubLObject schema, SubLObject table) {
	{
	    final SubLThread thread = SubLProcess.currentSubLThread();
	    SubLTrampolineFile.checkType(catalog, STRINGP);
	    SubLTrampolineFile.checkType(schema, STRINGP);
	    SubLTrampolineFile.checkType(table, STRINGP);
	    {
		SubLObject rs = sqlc_execute(connection, $get_imported_keys$.getGlobalValue(), list(catalog, schema, table, $result_set_block_size$.getDynamicValue(thread)));
		if (NIL != sql_result_set_p(rs)) {
		    _csetf_sqlrs_connection(rs, connection);
		    _csetf_sqlrs_id(rs, $connection_id$.getGlobalValue());
		}
		return rs;
	    }
	}
    }

    @LispMethod(comment = "Retrieves a description of the primary key columns that are referenced by a table\'s\r\nforeign key columns (the primary keys imported by a table).\r\n\r\n@param CONNECTION\n\t\tsql-connection-p;\r\n\t\t\r\n@param CATALOG\r\n\t\tstringp; a catalog name; must match the catalog name as it is stored in\r\n\t\tthe database; \"\" retrieves those without a catalog; null means that the catalog name\r\n\t\tshould not be used to narrow the search\r\n@param SCHEMA\r\n\t\tstringp; a schema name; must match the schema name as it is stored in the\r\n\t\tdatabase; \"\" retrieves those without a schema; null means that the schema name should not\r\n\t\tbe used to narrow the search\r\n@param TABLE\r\n\t\tstringp; a table name; must match the table name as it is stored in the\r\n\t\tdatabase\r\n@return sql-result-set-p; each row is a primary key column description\nRetrieves a description of the primary key columns that are referenced by a table\'s\nforeign key columns (the primary keys imported by a table).")
    public static SubLObject sqlc_get_imported_keys(final SubLObject connection, final SubLObject catalog, final SubLObject schema, final SubLObject table) {
	final SubLThread thread = SubLProcess.currentSubLThread();
	assert NIL != stringp(catalog) : "! stringp(catalog) " + ("Types.stringp(catalog) " + "CommonSymbols.NIL != Types.stringp(catalog) ") + catalog;
	assert NIL != stringp(schema) : "! stringp(schema) " + ("Types.stringp(schema) " + "CommonSymbols.NIL != Types.stringp(schema) ") + schema;
	assert NIL != stringp(table) : "! stringp(table) " + ("Types.stringp(table) " + "CommonSymbols.NIL != Types.stringp(table) ") + table;
	final SubLObject rs = sqlc_execute(connection, $get_imported_keys$.getGlobalValue(), list(catalog, schema, table, $result_set_block_size$.getDynamicValue(thread)));
	if (NIL != sql_result_set_p(rs)) {
	    _csetf_sqlrs_connection(rs, connection);
	    _csetf_sqlrs_id(rs, $connection_id$.getGlobalValue());
	}
	return rs;
    }

    /**
    * Retrieves a description of the primary key columns that are referenced by a table's
    * foreign key columns (the primary keys imported by a table).
    *
    * @param CONNECTION
    	sql-connection-p;
    * 		
    * @param CATALOG
    * 		stringp; a catalog name; must match the catalog name as it is stored in
    * 		the database; "" retrieves those without a catalog; null means that the catalog name
    * 		should not be used to narrow the search
    * @param SCHEMA
    * 		stringp; a schema name; must match the schema name as it is stored in the
    * 		database; "" retrieves those without a schema; null means that the schema name should not
    * 		be used to narrow the search
    * @param TABLE
    * 		stringp; a table name; must match the table name as it is stored in the
    * 		database
    * @return sql-result-set-p; each row is a primary key column description
    */

    public static final SubLObject sqlc_get_imported_keys_meta_data_alt(SubLObject connection, SubLObject catalog, SubLObject schema, SubLObject table) {
	{
	    SubLObject result_set = apply(SQLC_GET_IMPORTED_KEYS, list(connection, catalog, schema, table));
	    if (NIL == sql_result_set_p(result_set)) {
		Errors.warn($str_alt234$SQLC_error___A, result_set);
		return NIL;
	    }
	    {
		SubLObject column_count = sqlrs_column_count(result_set);
		SubLObject results = NIL;
		while (NIL == sqlrs_is_last(result_set)) {
		    sqlrs_next(result_set);
		    {
			SubLObject i = ZERO_INTEGER;
			SubLObject v_bindings = NIL;
			SubLObject cdolist_list_var = $list_alt241;
			SubLObject key = NIL;
			for (key = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest(), key = cdolist_list_var.first()) {
			    i = add(i, ONE_INTEGER);
			    if (i.numLE(column_count)) {
				v_bindings = cons(key, v_bindings);
				v_bindings = cons(sqlrs_get_object(result_set, i), v_bindings);
			    }
			}
			results = cons(nreverse(v_bindings), results);
		    }
		}
		return nreverse(results);
	    }
	}
    }

    public static SubLObject sqlc_get_imported_keys_meta_data(final SubLObject connection, final SubLObject catalog, final SubLObject schema, final SubLObject table) {
	final SubLObject result_set = apply(SQLC_GET_IMPORTED_KEYS, list(connection, catalog, schema, table));
	if (NIL == sql_result_set_p(result_set)) {
	    Errors.warn($str256$SQLC_error___A, result_set);
	    return NIL;
	}
	final SubLObject column_count = sqlrs_column_count(result_set);
	SubLObject results = NIL;
	while (NIL == sqlrs_is_last(result_set)) {
	    sqlrs_next(result_set);
	    SubLObject i = ZERO_INTEGER;
	    SubLObject v_bindings = NIL;
	    SubLObject cdolist_list_var = $list263;
	    SubLObject key = NIL;
	    key = cdolist_list_var.first();
	    while (NIL != cdolist_list_var) {
		i = add(i, ONE_INTEGER);
		if (i.numLE(column_count)) {
		    v_bindings = cons(key, v_bindings);
		    v_bindings = cons(sqlrs_get_object(result_set, i), v_bindings);
		}
		cdolist_list_var = cdolist_list_var.rest();
		key = cdolist_list_var.first();
	    }
	    results = cons(nreverse(v_bindings), results);
	}
	return nreverse(results);
    }

    /**
     * Retrieves a description of the foreign key columns that reference the given table's
     * primary key columns (the foreign keys exported by a table).
     *
     * @param CONNECTION
    sql-connection-p;
     * 		
     * @param CATALOG
     * 		stringp; a catalog name; must match the catalog name as it is stored in
     * 		the database; "" retrieves those without a catalog; null means that the catalog name
     * 		should not be used to narrow the search
     * @param SCHEMA
     * 		stringp; a schema name; must match the schema name as it is stored in the
     * 		database; "" retrieves those without a schema; null means that the schema name should not
     * 		be used to narrow the search
     * @param TABLE
     * 		stringp; a table name; must match the table name as it is stored in the
     * 		database
     * @return sql-result-set-p; each row is a foreign key column description
     */
    @LispMethod(comment = "Retrieves a description of the foreign key columns that reference the given table\'s\r\nprimary key columns (the foreign keys exported by a table).\r\n\r\n@param CONNECTION\nsql-connection-p;\r\n\t\t\r\n@param CATALOG\r\n\t\tstringp; a catalog name; must match the catalog name as it is stored in\r\n\t\tthe database; \"\" retrieves those without a catalog; null means that the catalog name\r\n\t\tshould not be used to narrow the search\r\n@param SCHEMA\r\n\t\tstringp; a schema name; must match the schema name as it is stored in the\r\n\t\tdatabase; \"\" retrieves those without a schema; null means that the schema name should not\r\n\t\tbe used to narrow the search\r\n@param TABLE\r\n\t\tstringp; a table name; must match the table name as it is stored in the\r\n\t\tdatabase\r\n@return sql-result-set-p; each row is a foreign key column description\nRetrieves a description of the foreign key columns that reference the given table\'s\nprimary key columns (the foreign keys exported by a table).")
    public static final SubLObject sqlc_get_exported_keys_alt(SubLObject connection, SubLObject catalog, SubLObject schema, SubLObject table) {
	{
	    final SubLThread thread = SubLProcess.currentSubLThread();
	    SubLTrampolineFile.checkType(connection, SQL_OPEN_CONNECTION_P);
	    SubLTrampolineFile.checkType(catalog, STRINGP);
	    SubLTrampolineFile.checkType(schema, STRINGP);
	    SubLTrampolineFile.checkType(table, STRINGP);
	    {
		SubLObject rs = sqlc_execute(connection, $get_exported_keys$.getGlobalValue(), list(catalog, schema, table, $result_set_block_size$.getDynamicValue(thread)));
		if (NIL != sql_result_set_p(rs)) {
		    _csetf_sqlrs_connection(rs, connection);
		    _csetf_sqlrs_id(rs, $connection_id$.getGlobalValue());
		}
		return rs;
	    }
	}
    }

    @LispMethod(comment = "Retrieves a description of the foreign key columns that reference the given table\'s\r\nprimary key columns (the foreign keys exported by a table).\r\n\r\n@param CONNECTION\n\t\tsql-connection-p;\r\n\t\t\r\n@param CATALOG\r\n\t\tstringp; a catalog name; must match the catalog name as it is stored in\r\n\t\tthe database; \"\" retrieves those without a catalog; null means that the catalog name\r\n\t\tshould not be used to narrow the search\r\n@param SCHEMA\r\n\t\tstringp; a schema name; must match the schema name as it is stored in the\r\n\t\tdatabase; \"\" retrieves those without a schema; null means that the schema name should not\r\n\t\tbe used to narrow the search\r\n@param TABLE\r\n\t\tstringp; a table name; must match the table name as it is stored in the\r\n\t\tdatabase\r\n@return sql-result-set-p; each row is a foreign key column description\nRetrieves a description of the foreign key columns that reference the given table\'s\nprimary key columns (the foreign keys exported by a table).")
    public static SubLObject sqlc_get_exported_keys(final SubLObject connection, final SubLObject catalog, final SubLObject schema, final SubLObject table) {
	final SubLThread thread = SubLProcess.currentSubLThread();
	assert NIL != sql_open_connection_p(connection) : "! sdbc.sql_open_connection_p(connection) " + ("sdbc.sql_open_connection_p(connection) " + "CommonSymbols.NIL != sdbc.sql_open_connection_p(connection) ") + connection;
	assert NIL != stringp(catalog) : "! stringp(catalog) " + ("Types.stringp(catalog) " + "CommonSymbols.NIL != Types.stringp(catalog) ") + catalog;
	assert NIL != stringp(schema) : "! stringp(schema) " + ("Types.stringp(schema) " + "CommonSymbols.NIL != Types.stringp(schema) ") + schema;
	assert NIL != stringp(table) : "! stringp(table) " + ("Types.stringp(table) " + "CommonSymbols.NIL != Types.stringp(table) ") + table;
	final SubLObject rs = sqlc_execute(connection, $get_exported_keys$.getGlobalValue(), list(catalog, schema, table, $result_set_block_size$.getDynamicValue(thread)));
	if (NIL != sql_result_set_p(rs)) {
	    _csetf_sqlrs_connection(rs, connection);
	    _csetf_sqlrs_id(rs, $connection_id$.getGlobalValue());
	}
	return rs;
    }

    /**
    * Retrieves a description of the foreign key columns that reference the given table's
    * primary key columns (the foreign keys exported by a table).
    *
    * @param CONNECTION
    	sql-connection-p;
    * 		
    * @param CATALOG
    * 		stringp; a catalog name; must match the catalog name as it is stored in
    * 		the database; "" retrieves those without a catalog; null means that the catalog name
    * 		should not be used to narrow the search
    * @param SCHEMA
    * 		stringp; a schema name; must match the schema name as it is stored in the
    * 		database; "" retrieves those without a schema; null means that the schema name should not
    * 		be used to narrow the search
    * @param TABLE
    * 		stringp; a table name; must match the table name as it is stored in the
    * 		database
    * @return sql-result-set-p; each row is a foreign key column description
    */

    public static final SubLObject sqlc_get_exported_keys_meta_data_alt(SubLObject connection, SubLObject catalog, SubLObject schema, SubLObject table) {
	{
	    SubLObject result_set = apply(SQLC_GET_EXPORTED_KEYS, list(connection, catalog, schema, table));
	    if (NIL == sql_result_set_p(result_set)) {
		Errors.warn($str_alt234$SQLC_error___A, result_set);
		return NIL;
	    }
	    {
		SubLObject column_count = sqlrs_column_count(result_set);
		SubLObject results = NIL;
		while (NIL == sqlrs_is_last(result_set)) {
		    sqlrs_next(result_set);
		    {
			SubLObject i = ZERO_INTEGER;
			SubLObject v_bindings = NIL;
			SubLObject cdolist_list_var = $list_alt241;
			SubLObject key = NIL;
			for (key = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest(), key = cdolist_list_var.first()) {
			    i = add(i, ONE_INTEGER);
			    if (i.numLE(column_count)) {
				v_bindings = cons(key, v_bindings);
				v_bindings = cons(sqlrs_get_object(result_set, i), v_bindings);
			    }
			}
			results = cons(nreverse(v_bindings), results);
		    }
		}
		return nreverse(results);
	    }
	}
    }

    public static SubLObject sqlc_get_exported_keys_meta_data(final SubLObject connection, final SubLObject catalog, final SubLObject schema, final SubLObject table) {
	final SubLObject result_set = apply(SQLC_GET_EXPORTED_KEYS, list(connection, catalog, schema, table));
	if (NIL == sql_result_set_p(result_set)) {
	    Errors.warn($str256$SQLC_error___A, result_set);
	    return NIL;
	}
	final SubLObject column_count = sqlrs_column_count(result_set);
	SubLObject results = NIL;
	while (NIL == sqlrs_is_last(result_set)) {
	    sqlrs_next(result_set);
	    SubLObject i = ZERO_INTEGER;
	    SubLObject v_bindings = NIL;
	    SubLObject cdolist_list_var = $list263;
	    SubLObject key = NIL;
	    key = cdolist_list_var.first();
	    while (NIL != cdolist_list_var) {
		i = add(i, ONE_INTEGER);
		if (i.numLE(column_count)) {
		    v_bindings = cons(key, v_bindings);
		    v_bindings = cons(sqlrs_get_object(result_set, i), v_bindings);
		}
		cdolist_list_var = cdolist_list_var.rest();
		key = cdolist_list_var.first();
	    }
	    results = cons(nreverse(v_bindings), results);
	}
	return nreverse(results);
    }

    /**
     * Retrieves a description of the given table's indices and statistics.
     *
     * @param CONNECTION
    sql-connection-p;
     * 		
     * @param CATALOG
     * 		stringp; a catalog name; must match the catalog name as it is stored in
     * 		this database; "" retrieves those without a catalog; null means that the catalog name
     * 		should not be used to narrow the search
     * @param SCHEMA
     * 		stringp; a schema name; must match the schema name as it is stored in
     * 		this database; "" retrieves those without a schema; null means that the schema name should
     * 		not be used to narrow the search
     * @param TABLE
     * 		stringp; a table name; must match the table name as it is stored in this
     * 		database
     * @param UNIQUE
     * 		booleanp; when true, return only indices for unique values; when false,
     * 		return indices regardless of whether unique or not
     * @param APPROXIMATE
     * 		booleanp; when true, result is allowed to reflect approximate or out
     * 		of data values; when false, results are requested to be accurate
     * @return sql-result-set-p; each row is an index column description
     */
    @LispMethod(comment = "Retrieves a description of the given table\'s indices and statistics.\r\n\r\n@param CONNECTION\nsql-connection-p;\r\n\t\t\r\n@param CATALOG\r\n\t\tstringp; a catalog name; must match the catalog name as it is stored in\r\n\t\tthis database; \"\" retrieves those without a catalog; null means that the catalog name\r\n\t\tshould not be used to narrow the search\r\n@param SCHEMA\r\n\t\tstringp; a schema name; must match the schema name as it is stored in\r\n\t\tthis database; \"\" retrieves those without a schema; null means that the schema name should\r\n\t\tnot be used to narrow the search\r\n@param TABLE\r\n\t\tstringp; a table name; must match the table name as it is stored in this\r\n\t\tdatabase\r\n@param UNIQUE\r\n\t\tbooleanp; when true, return only indices for unique values; when false,\r\n\t\treturn indices regardless of whether unique or not\r\n@param APPROXIMATE\r\n\t\tbooleanp; when true, result is allowed to reflect approximate or out\r\n\t\tof data values; when false, results are requested to be accurate\r\n@return sql-result-set-p; each row is an index column description")
    public static final SubLObject sqlc_get_index_info_alt(SubLObject connection, SubLObject catalog, SubLObject schema, SubLObject table, SubLObject unique, SubLObject approximate) {
	{
	    final SubLThread thread = SubLProcess.currentSubLThread();
	    SubLTrampolineFile.checkType(connection, SQL_OPEN_CONNECTION_P);
	    SubLTrampolineFile.checkType(catalog, STRINGP);
	    SubLTrampolineFile.checkType(schema, STRINGP);
	    SubLTrampolineFile.checkType(table, STRINGP);
	    SubLTrampolineFile.checkType(unique, BOOLEANP);
	    SubLTrampolineFile.checkType(approximate, BOOLEANP);
	    {
		SubLObject rs = sqlc_execute(connection, $get_index_info$.getGlobalValue(), list(catalog, schema, table, unique, approximate, $result_set_block_size$.getDynamicValue(thread)));
		if (NIL != sql_result_set_p(rs)) {
		    _csetf_sqlrs_connection(rs, connection);
		    _csetf_sqlrs_id(rs, $connection_id$.getGlobalValue());
		}
		return rs;
	    }
	}
    }

    @LispMethod(comment = "Retrieves a description of the given table\'s indices and statistics.\r\n\r\n@param CONNECTION\n\t\tsql-connection-p;\r\n\t\t\r\n@param CATALOG\r\n\t\tstringp; a catalog name; must match the catalog name as it is stored in\r\n\t\tthis database; \"\" retrieves those without a catalog; null means that the catalog name\r\n\t\tshould not be used to narrow the search\r\n@param SCHEMA\r\n\t\tstringp; a schema name; must match the schema name as it is stored in\r\n\t\tthis database; \"\" retrieves those without a schema; null means that the schema name should\r\n\t\tnot be used to narrow the search\r\n@param TABLE\r\n\t\tstringp; a table name; must match the table name as it is stored in this\r\n\t\tdatabase\r\n@param UNIQUE\r\n\t\tbooleanp; when true, return only indices for unique values; when false,\r\n\t\treturn indices regardless of whether unique or not\r\n@param APPROXIMATE\r\n\t\tbooleanp; when true, result is allowed to reflect approximate or out\r\n\t\tof data values; when false, results are requested to be accurate\r\n@return sql-result-set-p; each row is an index column description")
    public static SubLObject sqlc_get_index_info(final SubLObject connection, final SubLObject catalog, final SubLObject schema, final SubLObject table, final SubLObject unique, final SubLObject approximate) {
	final SubLThread thread = SubLProcess.currentSubLThread();
	assert NIL != sql_open_connection_p(connection) : "! sdbc.sql_open_connection_p(connection) " + ("sdbc.sql_open_connection_p(connection) " + "CommonSymbols.NIL != sdbc.sql_open_connection_p(connection) ") + connection;
	assert NIL != stringp(catalog) : "! stringp(catalog) " + ("Types.stringp(catalog) " + "CommonSymbols.NIL != Types.stringp(catalog) ") + catalog;
	assert NIL != stringp(schema) : "! stringp(schema) " + ("Types.stringp(schema) " + "CommonSymbols.NIL != Types.stringp(schema) ") + schema;
	assert NIL != stringp(table) : "! stringp(table) " + ("Types.stringp(table) " + "CommonSymbols.NIL != Types.stringp(table) ") + table;
	assert NIL != booleanp(unique) : "! booleanp(unique) " + ("Types.booleanp(unique) " + "CommonSymbols.NIL != Types.booleanp(unique) ") + unique;
	assert NIL != booleanp(approximate) : "! booleanp(approximate) " + ("Types.booleanp(approximate) " + "CommonSymbols.NIL != Types.booleanp(approximate) ") + approximate;
	final SubLObject rs = sqlc_execute(connection, $get_index_info$.getGlobalValue(), list(catalog, schema, table, unique, approximate, $result_set_block_size$.getDynamicValue(thread)));
	if (NIL != sql_result_set_p(rs)) {
	    _csetf_sqlrs_connection(rs, connection);
	    _csetf_sqlrs_id(rs, $connection_id$.getGlobalValue());
	}
	return rs;
    }

    /**
    * Retrieves a description of the given table's indices and statistics.
    *
    * @param CONNECTION
    	sql-connection-p;
    * 		
    * @param CATALOG
    * 		stringp; a catalog name; must match the catalog name as it is stored in
    * 		this database; "" retrieves those without a catalog; null means that the catalog name
    * 		should not be used to narrow the search
    * @param SCHEMA
    * 		stringp; a schema name; must match the schema name as it is stored in
    * 		this database; "" retrieves those without a schema; null means that the schema name should
    * 		not be used to narrow the search
    * @param TABLE
    * 		stringp; a table name; must match the table name as it is stored in this
    * 		database
    * @param UNIQUE
    * 		booleanp; when true, return only indices for unique values; when false,
    * 		return indices regardless of whether unique or not
    * @param APPROXIMATE
    * 		booleanp; when true, result is allowed to reflect approximate or out
    * 		of data values; when false, results are requested to be accurate
    * @return sql-result-set-p; each row is an index column description
    */

    public static final SubLObject sqlc_get_index_info_meta_data_alt(SubLObject connection, SubLObject catalog, SubLObject schema, SubLObject table, SubLObject unique, SubLObject approximate) {
	{
	    SubLObject result_set = apply(SQLC_GET_INDEX_INFO, list(connection, catalog, schema, table, unique, approximate));
	    if (NIL == sql_result_set_p(result_set)) {
		Errors.warn($str_alt234$SQLC_error___A, result_set);
		return NIL;
	    }
	    {
		SubLObject column_count = sqlrs_column_count(result_set);
		SubLObject results = NIL;
		while (NIL == sqlrs_is_last(result_set)) {
		    sqlrs_next(result_set);
		    {
			SubLObject i = ZERO_INTEGER;
			SubLObject v_bindings = NIL;
			SubLObject cdolist_list_var = $list_alt244;
			SubLObject key = NIL;
			for (key = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest(), key = cdolist_list_var.first()) {
			    i = add(i, ONE_INTEGER);
			    if (i.numLE(column_count)) {
				v_bindings = cons(key, v_bindings);
				v_bindings = cons(sqlrs_get_object(result_set, i), v_bindings);
			    }
			}
			results = cons(nreverse(v_bindings), results);
		    }
		}
		return nreverse(results);
	    }
	}
    }

    public static SubLObject sqlc_get_index_info_meta_data(final SubLObject connection, final SubLObject catalog, final SubLObject schema, final SubLObject table, final SubLObject unique, final SubLObject approximate) {
	final SubLObject result_set = apply(SQLC_GET_INDEX_INFO, list(connection, catalog, schema, table, unique, approximate));
	if (NIL == sql_result_set_p(result_set)) {
	    Errors.warn($str256$SQLC_error___A, result_set);
	    return NIL;
	}
	final SubLObject column_count = sqlrs_column_count(result_set);
	SubLObject results = NIL;
	while (NIL == sqlrs_is_last(result_set)) {
	    sqlrs_next(result_set);
	    SubLObject i = ZERO_INTEGER;
	    SubLObject v_bindings = NIL;
	    SubLObject cdolist_list_var = $list266;
	    SubLObject key = NIL;
	    key = cdolist_list_var.first();
	    while (NIL != cdolist_list_var) {
		i = add(i, ONE_INTEGER);
		if (i.numLE(column_count)) {
		    v_bindings = cons(key, v_bindings);
		    v_bindings = cons(sqlrs_get_object(result_set, i), v_bindings);
		}
		cdolist_list_var = cdolist_list_var.rest();
		key = cdolist_list_var.first();
	    }
	    results = cons(nreverse(v_bindings), results);
	}
	return nreverse(results);
    }

    /**
     *
     *
     * @param CONNECTION
    sql-open-connection-p;
     * 		
     * @return non-negative-integer-p; the maximum number of concurrent connections
    to this database that are possible.
     */
    @LispMethod(comment = "@param CONNECTION\nsql-open-connection-p;\r\n\t\t\r\n@return non-negative-integer-p; the maximum number of concurrent connections\r\nto this database that are possible.")
    public static final SubLObject sqlc_get_max_connections_alt(SubLObject connection) {
	SubLTrampolineFile.checkType(connection, SQL_OPEN_CONNECTION_P);
	return sqlc_execute(connection, $get_max_connections$.getGlobalValue(), NIL);
    }

    /**
     *
     *
     * @param CONNECTION
    sql-open-connection-p;
     * 		
     * @return non-negative-integer-p; the maximum number of concurrent connections
    to this database that are possible.
     */
    @LispMethod(comment = "@param CONNECTION\nsql-open-connection-p;\r\n\t\t\r\n@return non-negative-integer-p; the maximum number of concurrent connections\r\nto this database that are possible.")
    public static SubLObject sqlc_get_max_connections(final SubLObject connection) {
	assert NIL != sql_open_connection_p(connection) : "! sdbc.sql_open_connection_p(connection) " + ("sdbc.sql_open_connection_p(connection) " + "CommonSymbols.NIL != sdbc.sql_open_connection_p(connection) ") + connection;
	return sqlc_execute(connection, $get_max_connections$.getGlobalValue(), NIL);
    }

    /**
     *
     *
     * @return boolean; t if OBJECT is a valid error-handling tag, nil otherwise
     */
    @LispMethod(comment = "@return boolean; t if OBJECT is a valid error-handling tag, nil otherwise")
    public static final SubLObject sdbc_error_handling_tag_p_alt(SubLObject v_object) {
	return member(v_object, $list_alt245, UNPROVIDED, UNPROVIDED);
    }

    /**
     *
     *
     * @return boolean; t if OBJECT is a valid error-handling tag, nil otherwise
     */
    @LispMethod(comment = "@return boolean; t if OBJECT is a valid error-handling tag, nil otherwise")
    public static SubLObject sdbc_error_handling_tag_p(final SubLObject v_object) {
	return member(v_object, $list267, UNPROVIDED, UNPROVIDED);
    }

    /**
     * Creates a url string that is used to connect to a SQL dbms
     */
    @LispMethod(comment = "Creates a url string that is used to connect to a SQL dbms")
    public static final SubLObject new_db_url(SubLObject dbms_server, SubLObject db, SubLObject user, SubLObject password, SubLObject subprotocol) {
	return NIL != Strings.string_equal(subprotocol, $$$postgresql, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED) ? ((SubLObject) (format(NIL, $str_alt246$_a__a____a__a_user__a_password__a, new SubLObject[] { $sql_protocol$.getGlobalValue(), subprotocol, dbms_server, db, user, password })))
		: NIL != Strings.string_equal(subprotocol, $$$mysql, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED) ? ((SubLObject) (format(NIL, $str_alt248$_a__a____a__a_user__a_password__a, new SubLObject[] { $sql_protocol$.getGlobalValue(), subprotocol, dbms_server, db, user, password })))
			: NIL != Strings.string_equal(subprotocol, $$$oracle, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED) ? ((SubLObject) (format(NIL, $str_alt250$_a__a_thin__a__a____a_1521__a, new SubLObject[] { $sql_protocol$.getGlobalValue(), subprotocol, user, password, dbms_server, db })))
				: NIL != Strings.string_equal(subprotocol, $$$sqlserver, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED)
					? ((SubLObject) (format(NIL, $str_alt252$_a__a__a____a_1433_DatabaseName__, new SubLObject[] { $sql_protocol$.getGlobalValue(), $$$microsoft, subprotocol, dbms_server, db, user, password })))
					: NIL != Strings.string_equal(subprotocol, $$$odbc, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED) ? ((SubLObject) (format(NIL, $str_alt255$_a__a__a_UID__a_PWD__a, new SubLObject[] { $sql_protocol$.getGlobalValue(), subprotocol, db, user, password })))
						: NIL != Strings.string_equal(subprotocol, $$$sybase, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED)
							? ((SubLObject) (format(NIL, $str_alt257$_a__a__a____a__a_USER__a_PASSWORD, new SubLObject[] { $sql_protocol$.getGlobalValue(), $$$jtds, subprotocol, dbms_server, db, user, password })))
							: NIL != Strings.string_equal(string_utilities.string_first_n(EIGHT_INTEGER, subprotocol), $str_alt259$com_cyc_, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED)
								? ((SubLObject) (format(NIL, $str_alt260$_a__a__a, new SubLObject[] { $sql_protocol$.getGlobalValue(), subprotocol, db })))
								: Errors.error($str_alt261$unknown_jdbc_subprotocol___a, subprotocol);
    }

    public static SubLObject new_db_url(final SubLObject dbms_server, final SubLObject db, final SubLObject user, final SubLObject password, final SubLObject subprotocol, SubLObject port) {
	if (port == UNPROVIDED) {
	    port = NIL;
	}
	if (NIL != Strings.string_equal(string_utilities.string_first_n(EIGHT_INTEGER, subprotocol), $str268$com_cyc_, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED)) {
	    return format(NIL, $str269$_a__a__a, new SubLObject[] { $sql_protocol$.getGlobalValue(), subprotocol, db });
	}
	SubLObject v_properties = list(new SubLObject[] { $SUB_PROTOCOL, subprotocol, $DBMS_SERVER, dbms_server, $DATABASE, db, $USER, user, $PASSWORD, password });
	if (NIL != subl_promotions.non_negative_integer_p(port)) {
	    v_properties = putf(v_properties, $PORT, port);
	}
	return construct_new_database_connection_url(subprotocol, v_properties);
    }

    public static SubLObject add_sdbc_database_connection_url_description(final SubLObject sub_protocol, final SubLObject pattern, final SubLObject option_names, final SubLObject option_punctuation, final SubLObject defaults) {
	assert NIL != stringp(sub_protocol) : "! stringp(sub_protocol) " + ("Types.stringp(sub_protocol) " + "CommonSymbols.NIL != Types.stringp(sub_protocol) ") + sub_protocol;
	assert NIL != consp(pattern) : "! consp(pattern) " + ("Types.consp(pattern) " + "CommonSymbols.NIL != Types.consp(pattern) ") + pattern;
	assert NIL != list_utilities.property_list_p(option_names) : "! list_utilities.property_list_p(option_names) " + ("list_utilities.property_list_p(option_names) " + "CommonSymbols.NIL != list_utilities.property_list_p(option_names) ") + option_names;
	assert NIL != list_utilities.property_list_p(option_punctuation) : "! list_utilities.property_list_p(option_punctuation) " + ("list_utilities.property_list_p(option_punctuation) " + "CommonSymbols.NIL != list_utilities.property_list_p(option_punctuation) ") + option_punctuation;
	assert NIL != list_utilities.property_list_p(defaults) : "! list_utilities.property_list_p(defaults) " + ("list_utilities.property_list_p(defaults) " + "CommonSymbols.NIL != list_utilities.property_list_p(defaults) ") + defaults;
	final SubLObject description = dictionary.new_dictionary(UNPROVIDED, UNPROVIDED);
	map_utilities.map_put(description, $DEFAULTS, defaults);
	map_utilities.map_put(description, $PATTERN, pattern);
	map_utilities.map_put(description, $OPTION_PUNCTUATION, compile_db_conn_url_punctuation_info(option_punctuation));
	map_utilities.map_put(description, $OPTION_NAMES, option_names);
	map_utilities.map_put($sdbc_database_connection_url_descriptions$.getGlobalValue(), sub_protocol, description);
	return sub_protocol;
    }

    public static SubLObject get_all_sdbc_database_sub_protocols() {
	return map_utilities.map_keys($sdbc_database_connection_url_descriptions$.getGlobalValue());
    }

    public static SubLObject compile_db_conn_url_punctuation_info(final SubLObject option_punctuation) {
	final SubLThread thread = SubLProcess.currentSubLThread();
	if (NIL == option_punctuation) {
	    return NIL;
	}
	SubLObject final_punctuation = copy_list(option_punctuation);
	if ($UNDEFINED == getf(final_punctuation, $TERMINATOR, $UNDEFINED)) {
	    final_punctuation = putf(final_punctuation, $TERMINATOR, $str169$);
	}
	if ($SEPARATOR == getf(final_punctuation, $START, $SEPARATOR)) {
	    final SubLObject separator = getf(final_punctuation, $SEPARATOR, $UNDEFINED);
	    if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (!separator.isString())) {
		Errors.error($str293$Separator_must_be_defined_as_stri, separator);
	    }
	    final_punctuation = putf(final_punctuation, $START, separator);
	}
	final SubLObject value = getf(final_punctuation, $VALUE, $UNDEFINED);
	if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (!value.isString())) {
	    Errors.error($str295$Value_demarcator_must_be_specifie, value);
	}
	return final_punctuation;
    }

    public static SubLObject register_sdbc_database_connection_url_description(final SubLObject macroform, final SubLObject environment) {
	final SubLObject current;
	final SubLObject datum = current = macroform.rest();
	SubLObject allow_other_keys_p = NIL;
	SubLObject rest = current;
	SubLObject bad = NIL;
	SubLObject current_$9 = NIL;
	while (NIL != rest) {
	    destructuring_bind_must_consp(rest, datum, $list296);
	    current_$9 = rest.first();
	    rest = rest.rest();
	    destructuring_bind_must_consp(rest, datum, $list296);
	    if (NIL == member(current_$9, $list297, UNPROVIDED, UNPROVIDED)) {
		bad = T;
	    }
	    if (current_$9 == $ALLOW_OTHER_KEYS) {
		allow_other_keys_p = rest.first();
	    }
	    rest = rest.rest();
	}
	if ((NIL != bad) && (NIL == allow_other_keys_p)) {
	    cdestructuring_bind_error(datum, $list296);
	}
	final SubLObject sub_protocol_tail = property_list_member($SUB_PROTOCOL, current);
	final SubLObject sub_protocol = (NIL != sub_protocol_tail) ? cadr(sub_protocol_tail) : NIL;
	final SubLObject pattern_tail = property_list_member($PATTERN, current);
	final SubLObject pattern = (NIL != pattern_tail) ? cadr(pattern_tail) : NIL;
	final SubLObject option_names_tail = property_list_member($OPTION_NAMES, current);
	final SubLObject option_names = (NIL != option_names_tail) ? cadr(option_names_tail) : NIL;
	final SubLObject option_punctuation_tail = property_list_member($OPTION_PUNCTUATION, current);
	final SubLObject option_punctuation = (NIL != option_punctuation_tail) ? cadr(option_punctuation_tail) : NIL;
	final SubLObject defaults_tail = property_list_member($DEFAULTS, current);
	final SubLObject defaults = (NIL != defaults_tail) ? cadr(defaults_tail) : NIL;
	return list(ADD_SDBC_DATABASE_CONNECTION_URL_DESCRIPTION, sub_protocol, pattern, option_names, option_punctuation, defaults);
    }

    public static SubLObject set_sdbc_db2_port(final SubLObject port) {
	SubLTrampolineFile.enforceType(port, NON_NEGATIVE_INTEGER_P);
	$sdbc_db2_port$.setGlobalValue(port);
	return $sdbc_db2_port$.getGlobalValue();
    }

    public static SubLObject sdbc_db2_port() {
	return $sdbc_db2_port$.getGlobalValue();
    }

    public static SubLObject set_sdbc_sybase_iq_port(final SubLObject port) {
	SubLTrampolineFile.enforceType(port, NON_NEGATIVE_INTEGER_P);
	$sdbc_sybase_iq_port$.setGlobalValue(port);
	return $sdbc_sybase_iq_port$.getGlobalValue();
    }

    public static SubLObject sdbc_sybase_iq_port() {
	return $sdbc_sybase_iq_port$.getGlobalValue();
    }

    public static SubLObject construct_new_database_connection_url(final SubLObject sub_protocol, SubLObject v_properties) {
	final SubLThread thread = SubLProcess.currentSubLThread();
	assert NIL != list_utilities.property_list_p(v_properties) : "! list_utilities.property_list_p(v_properties) " + ("list_utilities.property_list_p(v_properties) " + "CommonSymbols.NIL != list_utilities.property_list_p(v_properties) ") + v_properties;
	final SubLObject description = map_utilities.map_get($sdbc_database_connection_url_descriptions$.getGlobalValue(), sub_protocol, $UNDEFINED);
	SubLObject result = NIL;
	if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (NIL == map_utilities.map_p(description))) {
	    Errors.error($str345$unknown_jdbc_subprotocol___a, sub_protocol);
	}
	if (!sub_protocol.equal(getf(v_properties, $SUB_PROTOCOL, UNPROVIDED))) {
	    v_properties = cons($SUB_PROTOCOL, cons(sub_protocol, v_properties));
	}
	if (!getf(v_properties, $PROTOCOL, $NOT_FOUND).isString()) {
	    v_properties = cons($PROTOCOL, cons($sql_protocol$.getGlobalValue(), v_properties));
	}
	final SubLObject pattern = map_utilities.map_get(description, $PATTERN, UNPROVIDED);
	final SubLObject defaults = map_utilities.map_get(description, $DEFAULTS, UNPROVIDED);
	final SubLObject option_names = map_utilities.map_get(description, $OPTION_NAMES, UNPROVIDED);
	final SubLObject option_punctuation = map_utilities.map_get(description, $OPTION_PUNCTUATION, UNPROVIDED);
	final SubLObject url_stream = make_string_output_stream();
	construct_new_dbconn_url_required(url_stream, pattern, v_properties, defaults);
	append_dbconn_url_options(url_stream, option_names, option_punctuation, v_properties, defaults);
	result = get_output_stream_string(url_stream);
	return result;
    }

    public static SubLObject construct_new_dbconn_url_required(final SubLObject url_stream, final SubLObject pattern, final SubLObject v_properties, final SubLObject defaults) {
	SubLObject cdolist_list_var = pattern;
	SubLObject element = NIL;
	element = cdolist_list_var.first();
	while (NIL != cdolist_list_var) {
	    if (element.isString()) {
		write_string(element, url_stream, UNPROVIDED, UNPROVIDED);
	    } else if (element.isKeyword()) {
		princ(resolve_dbconn_url_reference(element, v_properties, defaults), url_stream);
	    } else if (element.isCons()) {
		SubLObject current;
		final SubLObject datum = current = element;
		SubLObject functor = NIL;
		SubLObject item = NIL;
		destructuring_bind_must_consp(current, datum, $list348);
		functor = current.first();
		current = current.rest();
		destructuring_bind_must_consp(current, datum, $list348);
		item = current.first();
		current = current.rest();
		if (NIL == current) {
		    final SubLObject value = resolve_dbconn_url_reference(item, v_properties, defaults);
		    SubLObject result = NIL;
		    final SubLObject pcase_var = functor;
		    if (pcase_var.eql($UPCASE)) {
			result = Strings.string_upcase(string_utilities.to_string(value), UNPROVIDED, UNPROVIDED);
		    } else {
			Errors.error($str350$Functor__A_not_implemented_yet_, functor);
		    }
		    write_string(result, url_stream, UNPROVIDED, UNPROVIDED);
		} else {
		    cdestructuring_bind_error(datum, $list348);
		}
	    } else {
		Errors.error($str351$Pattern__S_contains__S__which_is_, pattern, element);
	    }

	    cdolist_list_var = cdolist_list_var.rest();
	    element = cdolist_list_var.first();
	}
	return url_stream;
    }

    public static SubLObject resolve_dbconn_url_reference(final SubLObject element, final SubLObject v_properties, final SubLObject defaults) {
	final SubLThread thread = SubLProcess.currentSubLThread();
	if (element.isString()) {
	    return element;
	}
	if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (!element.isKeyword())) {
	    Errors.error($str352$Element__A_is_neither_a_STRINGP_n, element);
	}
	final SubLObject default_value = getf(defaults, element, $NOT_FOUND);
	SubLObject value = getf(v_properties, element, default_value);
	if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && ($NOT_FOUND == value)) {
	    Errors.error($str353$No_value_provided_for__S_in_eithe, element, v_properties, defaults);
	}
	if ((value.isSymbol() && (!value.isKeyword())) && (NIL != boundp(value))) {
	    value = symbol_value(value);
	}
	return value;
    }

    public static SubLObject append_dbconn_url_options(final SubLObject url_stream, final SubLObject option_names, final SubLObject option_punctuation, final SubLObject v_properties, final SubLObject defaults) {
	SubLObject written = ZERO_INTEGER;
	SubLObject remainder;
	SubLObject option_keyword;
	SubLObject option_name;
	SubLObject default_value;
	SubLObject value;
	for (remainder = NIL, remainder = option_names; NIL != remainder; remainder = cddr(remainder)) {
	    option_keyword = remainder.first();
	    option_name = cadr(remainder);
	    default_value = getf(defaults, option_keyword, $NOT_FOUND);
	    value = getf(v_properties, option_keyword, default_value);
	    if (((NIL != value) && (NIL == string_utilities.empty_string_p(value))) && ($NOT_FOUND != value)) {
		write_dbconn_url_punctuation(url_stream, option_punctuation, written.isZero() ? $START : $SEPARATOR);
		write_string(option_name, url_stream, UNPROVIDED, UNPROVIDED);
		write_dbconn_url_punctuation(url_stream, option_punctuation, $VALUE);
		princ(value, url_stream);
		written = add(written, ONE_INTEGER);
	    }
	}
	if (!written.isZero()) {
	    write_dbconn_url_punctuation(url_stream, option_punctuation, $TERMINATOR);
	}
	return url_stream;
    }

    public static SubLObject write_dbconn_url_punctuation(final SubLObject url_stream, final SubLObject punctuation, final SubLObject key) {
	write_string(getf(punctuation, key, $str169$), url_stream, UNPROVIDED, UNPROVIDED);
	return url_stream;
    }

    public static final SubLObject java_integerp_alt(SubLObject number) {
	return makeBoolean((number.isInteger() && number.numG($int$_2147483649)) && number.numL($int$2147483648));
    }

    public static SubLObject java_integerp(final SubLObject number) {
	return makeBoolean((number.isInteger() && number.numG($int$_2147483649)) && number.numL($int$2147483648));
    }

    public static final SubLObject java_longp_alt(SubLObject number) {
	return makeBoolean((number.isInteger() && number.numG($int$_9223372036854775809)) && number.numL($int$9223372036854775808));
    }

    public static SubLObject java_longp(final SubLObject number) {
	return makeBoolean((number.isInteger() && number.numG($int$_9223372036854775809)) && number.numL($int$9223372036854775808));
    }

    public static final SubLObject java_floatp_alt(SubLObject number) {
	return floatp(number);
    }

    public static SubLObject java_floatp(final SubLObject number) {
	return floatp(number);
    }

    public static final SubLObject java_doublep_alt(SubLObject number) {
	return floatp(number);
    }

    public static SubLObject java_doublep(final SubLObject number) {
	return floatp(number);
    }

    /**
     * Execute BODY with CONNECTION bound to an sql connection with the specified parameters,
     * or an SDBC error if a connection could not be obtained
     */
    @LispMethod(comment = "Execute BODY with CONNECTION bound to an sql connection with the specified parameters,\r\nor an SDBC error if a connection could not be obtained\nExecute BODY with CONNECTION bound to an sql connection with the specified parameters,\nor an SDBC error if a connection could not be obtained")
    public static final SubLObject with_sql_connection_alt(SubLObject macroform, SubLObject environment) {
	{
	    SubLObject datum = macroform.rest();
	    SubLObject current = datum;
	    destructuring_bind_must_consp(current, datum, $list_alt266);
	    {
		SubLObject temp = current.rest();
		current = current.first();
		{
		    SubLObject connection = NIL;
		    SubLObject db = NIL;
		    SubLObject user = NIL;
		    SubLObject password = NIL;
		    destructuring_bind_must_consp(current, datum, $list_alt266);
		    connection = current.first();
		    current = current.rest();
		    destructuring_bind_must_consp(current, datum, $list_alt266);
		    db = current.first();
		    current = current.rest();
		    destructuring_bind_must_consp(current, datum, $list_alt266);
		    user = current.first();
		    current = current.rest();
		    destructuring_bind_must_consp(current, datum, $list_alt266);
		    password = current.first();
		    current = current.rest();
		    {
			SubLObject allow_other_keys_p = NIL;
			SubLObject rest = current;
			SubLObject bad = NIL;
			SubLObject current_10 = NIL;
			for (; NIL != rest;) {
			    destructuring_bind_must_consp(rest, datum, $list_alt266);
			    current_10 = rest.first();
			    rest = rest.rest();
			    destructuring_bind_must_consp(rest, datum, $list_alt266);
			    if (NIL == member(current_10, $list_alt267, UNPROVIDED, UNPROVIDED)) {
				bad = T;
			    }
			    if (current_10 == $ALLOW_OTHER_KEYS) {
				allow_other_keys_p = rest.first();
			    }
			    rest = rest.rest();
			}
			if ((NIL != bad) && (NIL == allow_other_keys_p)) {
			    cdestructuring_bind_error(datum, $list_alt266);
			}
			{
			    SubLObject dbms_server_tail = property_list_member($DBMS_SERVER, current);
			    SubLObject dbms_server = (NIL != dbms_server_tail) ? ((SubLObject) (cadr(dbms_server_tail))) : $dbms_server$;
			    SubLObject port_tail = property_list_member($PORT, current);
			    SubLObject port = (NIL != port_tail) ? ((SubLObject) (cadr(port_tail))) : $sql_port$;
			    SubLObject subprotocol_tail = property_list_member($SUBPROTOCOL, current);
			    SubLObject subprotocol = (NIL != subprotocol_tail) ? ((SubLObject) (cadr(subprotocol_tail))) : $sql_subprotocol$;
			    SubLObject proxy_server_tail = property_list_member($PROXY_SERVER, current);
			    SubLObject proxy_server = (NIL != proxy_server_tail) ? ((SubLObject) (cadr(proxy_server_tail))) : dbms_server;
			    SubLObject timeout_tail = property_list_member($TIMEOUT, current);
			    SubLObject timeout = (NIL != timeout_tail) ? ((SubLObject) (cadr(timeout_tail))) : $sql_connection_timeout$;
			    current = temp;
			    {
				SubLObject body = current;
				return list(CLET, list(connection),
					list(CUNWIND_PROTECT,
						listS(PROGN, list(CSETQ, connection, list(NEW_SQL_CONNECTION, db, user, password, list(new SubLObject[] { LIST, $DBMS_SERVER, dbms_server, $PORT, port, $SUBPROTOCOL, subprotocol, $PROXY_SERVER, proxy_server, $TIMEOUT, timeout }))), append(body, NIL)),
						list(PWHEN, list(SQL_CONNECTION_P, connection), list(SQLC_CLOSE, connection))));
			    }
			}
		    }
		}
	    }
	}
    }

    @LispMethod(comment = "Execute BODY with CONNECTION bound to an sql connection with the specified parameters,\r\nor an SDBC error if a connection could not be obtained\nExecute BODY with CONNECTION bound to an sql connection with the specified parameters,\nor an SDBC error if a connection could not be obtained")
    public static SubLObject with_sql_connection(final SubLObject macroform, final SubLObject environment) {
	SubLObject current;
	final SubLObject datum = current = macroform.rest();
	destructuring_bind_must_consp(current, datum, $list358);
	final SubLObject temp = current.rest();
	current = current.first();
	SubLObject connection = NIL;
	SubLObject db = NIL;
	SubLObject user = NIL;
	SubLObject password = NIL;
	destructuring_bind_must_consp(current, datum, $list358);
	connection = current.first();
	current = current.rest();
	destructuring_bind_must_consp(current, datum, $list358);
	db = current.first();
	current = current.rest();
	destructuring_bind_must_consp(current, datum, $list358);
	user = current.first();
	current = current.rest();
	destructuring_bind_must_consp(current, datum, $list358);
	password = current.first();
	current = current.rest();
	SubLObject allow_other_keys_p = NIL;
	SubLObject rest = current;
	SubLObject bad = NIL;
	SubLObject current_$10 = NIL;
	while (NIL != rest) {
	    destructuring_bind_must_consp(rest, datum, $list358);
	    current_$10 = rest.first();
	    rest = rest.rest();
	    destructuring_bind_must_consp(rest, datum, $list358);
	    if (NIL == member(current_$10, $list359, UNPROVIDED, UNPROVIDED)) {
		bad = T;
	    }
	    if (current_$10 == $ALLOW_OTHER_KEYS) {
		allow_other_keys_p = rest.first();
	    }
	    rest = rest.rest();
	}
	if ((NIL != bad) && (NIL == allow_other_keys_p)) {
	    cdestructuring_bind_error(datum, $list358);
	}
	final SubLObject dbms_server_tail = property_list_member($DBMS_SERVER, current);
	final SubLObject dbms_server = (NIL != dbms_server_tail) ? cadr(dbms_server_tail) : $dbms_server$;
	final SubLObject port_tail = property_list_member($PORT, current);
	final SubLObject port = (NIL != port_tail) ? cadr(port_tail) : $sql_port$;
	final SubLObject subprotocol_tail = property_list_member($SUBPROTOCOL, current);
	final SubLObject subprotocol = (NIL != subprotocol_tail) ? cadr(subprotocol_tail) : $sql_subprotocol$;
	final SubLObject proxy_server_tail = property_list_member($PROXY_SERVER, current);
	final SubLObject proxy_server = (NIL != proxy_server_tail) ? cadr(proxy_server_tail) : dbms_server;
	final SubLObject timeout_tail = property_list_member($TIMEOUT, current);
	final SubLObject timeout = (NIL != timeout_tail) ? cadr(timeout_tail) : $sql_connection_timeout$;
	final SubLObject body;
	current = body = temp;
	return list(CLET, list(connection),
		list(CUNWIND_PROTECT, listS(PROGN, list(CSETQ, connection, list(NEW_SQL_CONNECTION, db, user, password, list(new SubLObject[] { LIST, $DBMS_SERVER, dbms_server, $PORT, port, $SUBPROTOCOL, subprotocol, $PROXY_SERVER, proxy_server, $TIMEOUT, timeout }))), append(body, NIL)),
			list(PWHEN, list(SQL_CONNECTION_P, connection), list(SQLC_CLOSE, connection))));
    }

    /**
    * Execute BODY with CONNECTION bound to an sql connection with the specified parameters,
    * or an SDBC error if a connection could not be obtained
    */

    /**
     * Execute BODY with STATEMENT bound to an sql statement created from a auto-commit
     * connection with the specified parameters, or bound to an SDBC error if a statement
     * could not be obtained
     */
    @LispMethod(comment = "Execute BODY with STATEMENT bound to an sql statement created from a auto-commit\r\nconnection with the specified parameters, or bound to an SDBC error if a statement\r\ncould not be obtained\nExecute BODY with STATEMENT bound to an sql statement created from a auto-commit\nconnection with the specified parameters, or bound to an SDBC error if a statement\ncould not be obtained")
    public static final SubLObject with_sql_statement_alt(SubLObject macroform, SubLObject environment) {
	{
	    SubLObject datum = macroform.rest();
	    SubLObject current = datum;
	    destructuring_bind_must_consp(current, datum, $list_alt278);
	    {
		SubLObject temp = current.rest();
		current = current.first();
		{
		    SubLObject statement = NIL;
		    SubLObject db = NIL;
		    SubLObject user = NIL;
		    SubLObject password = NIL;
		    destructuring_bind_must_consp(current, datum, $list_alt278);
		    statement = current.first();
		    current = current.rest();
		    destructuring_bind_must_consp(current, datum, $list_alt278);
		    db = current.first();
		    current = current.rest();
		    destructuring_bind_must_consp(current, datum, $list_alt278);
		    user = current.first();
		    current = current.rest();
		    destructuring_bind_must_consp(current, datum, $list_alt278);
		    password = current.first();
		    current = current.rest();
		    {
			SubLObject allow_other_keys_p = NIL;
			SubLObject rest = current;
			SubLObject bad = NIL;
			SubLObject current_11 = NIL;
			for (; NIL != rest;) {
			    destructuring_bind_must_consp(rest, datum, $list_alt278);
			    current_11 = rest.first();
			    rest = rest.rest();
			    destructuring_bind_must_consp(rest, datum, $list_alt278);
			    if (NIL == member(current_11, $list_alt267, UNPROVIDED, UNPROVIDED)) {
				bad = T;
			    }
			    if (current_11 == $ALLOW_OTHER_KEYS) {
				allow_other_keys_p = rest.first();
			    }
			    rest = rest.rest();
			}
			if ((NIL != bad) && (NIL == allow_other_keys_p)) {
			    cdestructuring_bind_error(datum, $list_alt278);
			}
			{
			    SubLObject dbms_server_tail = property_list_member($DBMS_SERVER, current);
			    SubLObject dbms_server = (NIL != dbms_server_tail) ? ((SubLObject) (cadr(dbms_server_tail))) : $dbms_server$;
			    SubLObject port_tail = property_list_member($PORT, current);
			    SubLObject port = (NIL != port_tail) ? ((SubLObject) (cadr(port_tail))) : $sql_port$;
			    SubLObject subprotocol_tail = property_list_member($SUBPROTOCOL, current);
			    SubLObject subprotocol = (NIL != subprotocol_tail) ? ((SubLObject) (cadr(subprotocol_tail))) : $sql_subprotocol$;
			    SubLObject proxy_server_tail = property_list_member($PROXY_SERVER, current);
			    SubLObject proxy_server = (NIL != proxy_server_tail) ? ((SubLObject) (cadr(proxy_server_tail))) : dbms_server;
			    SubLObject timeout_tail = property_list_member($TIMEOUT, current);
			    SubLObject timeout = (NIL != timeout_tail) ? ((SubLObject) (cadr(timeout_tail))) : $sql_connection_timeout$;
			    current = temp;
			    {
				SubLObject body = current;
				SubLObject connection = $sym279$CONNECTION;
				return list(CLET, list(statement), listS(WITH_SQL_CONNECTION, list(new SubLObject[] { connection, db, user, password, $DBMS_SERVER, dbms_server, $PORT, port, $SUBPROTOCOL, subprotocol, $PROXY_SERVER, proxy_server, $TIMEOUT, timeout }),
					list(PIF, list(SQL_OPEN_CONNECTION_P, connection), list(CSETQ, statement, list(SQLC_CREATE_STATEMENT, connection)), list(CSETQ, statement, connection)), append(body, NIL)));
			    }
			}
		    }
		}
	    }
	}
    }

    @LispMethod(comment = "Execute BODY with STATEMENT bound to an sql statement created from a auto-commit\r\nconnection with the specified parameters, or bound to an SDBC error if a statement\r\ncould not be obtained\nExecute BODY with STATEMENT bound to an sql statement created from a auto-commit\nconnection with the specified parameters, or bound to an SDBC error if a statement\ncould not be obtained")
    public static SubLObject with_sql_statement(final SubLObject macroform, final SubLObject environment) {
	SubLObject current;
	final SubLObject datum = current = macroform.rest();
	destructuring_bind_must_consp(current, datum, $list370);
	final SubLObject temp = current.rest();
	current = current.first();
	SubLObject statement = NIL;
	SubLObject db = NIL;
	SubLObject user = NIL;
	SubLObject password = NIL;
	destructuring_bind_must_consp(current, datum, $list370);
	statement = current.first();
	current = current.rest();
	destructuring_bind_must_consp(current, datum, $list370);
	db = current.first();
	current = current.rest();
	destructuring_bind_must_consp(current, datum, $list370);
	user = current.first();
	current = current.rest();
	destructuring_bind_must_consp(current, datum, $list370);
	password = current.first();
	current = current.rest();
	SubLObject allow_other_keys_p = NIL;
	SubLObject rest = current;
	SubLObject bad = NIL;
	SubLObject current_$11 = NIL;
	while (NIL != rest) {
	    destructuring_bind_must_consp(rest, datum, $list370);
	    current_$11 = rest.first();
	    rest = rest.rest();
	    destructuring_bind_must_consp(rest, datum, $list370);
	    if (NIL == member(current_$11, $list359, UNPROVIDED, UNPROVIDED)) {
		bad = T;
	    }
	    if (current_$11 == $ALLOW_OTHER_KEYS) {
		allow_other_keys_p = rest.first();
	    }
	    rest = rest.rest();
	}
	if ((NIL != bad) && (NIL == allow_other_keys_p)) {
	    cdestructuring_bind_error(datum, $list370);
	}
	final SubLObject dbms_server_tail = property_list_member($DBMS_SERVER, current);
	final SubLObject dbms_server = (NIL != dbms_server_tail) ? cadr(dbms_server_tail) : $dbms_server$;
	final SubLObject port_tail = property_list_member($PORT, current);
	final SubLObject port = (NIL != port_tail) ? cadr(port_tail) : $sql_port$;
	final SubLObject subprotocol_tail = property_list_member($SUBPROTOCOL, current);
	final SubLObject subprotocol = (NIL != subprotocol_tail) ? cadr(subprotocol_tail) : $sql_subprotocol$;
	final SubLObject proxy_server_tail = property_list_member($PROXY_SERVER, current);
	final SubLObject proxy_server = (NIL != proxy_server_tail) ? cadr(proxy_server_tail) : dbms_server;
	final SubLObject timeout_tail = property_list_member($TIMEOUT, current);
	final SubLObject timeout = (NIL != timeout_tail) ? cadr(timeout_tail) : $sql_connection_timeout$;
	final SubLObject body;
	current = body = temp;
	final SubLObject connection = $sym371$CONNECTION;
	return list(CLET, list(statement), listS(WITH_SQL_CONNECTION, list(new SubLObject[] { connection, db, user, password, $DBMS_SERVER, dbms_server, $PORT, port, $SUBPROTOCOL, subprotocol, $PROXY_SERVER, proxy_server, $TIMEOUT, timeout }),
		list(PIF, list(SQL_OPEN_CONNECTION_P, connection), list(CSETQ, statement, list(SQLC_CREATE_STATEMENT, connection)), list(CSETQ, statement, connection)), append(body, NIL)));
    }

    /**
    * Execute BODY with STATEMENT bound to an sql statement created from a auto-commit
    * connection with the specified parameters, or bound to an SDBC error if a statement
    * could not be obtained
    */

    /**
     * Execute BODY with STATEMENT bound to an sql statement created from a auto-commit
     * connection with the specified parameters, or bound to an SDBC error if a statement
     * could not be obtained
     */
    @LispMethod(comment = "Execute BODY with STATEMENT bound to an sql statement created from a auto-commit\r\nconnection with the specified parameters, or bound to an SDBC error if a statement\r\ncould not be obtained\nExecute BODY with STATEMENT bound to an sql statement created from a auto-commit\nconnection with the specified parameters, or bound to an SDBC error if a statement\ncould not be obtained")
    public static final SubLObject with_prepared_sql_statement_alt(SubLObject macroform, SubLObject environment) {
	{
	    SubLObject datum = macroform.rest();
	    SubLObject current = datum;
	    destructuring_bind_must_consp(current, datum, $list_alt283);
	    {
		SubLObject temp = current.rest();
		current = current.first();
		{
		    SubLObject statement = NIL;
		    SubLObject sql = NIL;
		    SubLObject db = NIL;
		    SubLObject user = NIL;
		    SubLObject password = NIL;
		    destructuring_bind_must_consp(current, datum, $list_alt283);
		    statement = current.first();
		    current = current.rest();
		    destructuring_bind_must_consp(current, datum, $list_alt283);
		    sql = current.first();
		    current = current.rest();
		    destructuring_bind_must_consp(current, datum, $list_alt283);
		    db = current.first();
		    current = current.rest();
		    destructuring_bind_must_consp(current, datum, $list_alt283);
		    user = current.first();
		    current = current.rest();
		    destructuring_bind_must_consp(current, datum, $list_alt283);
		    password = current.first();
		    current = current.rest();
		    {
			SubLObject allow_other_keys_p = NIL;
			SubLObject rest = current;
			SubLObject bad = NIL;
			SubLObject current_12 = NIL;
			for (; NIL != rest;) {
			    destructuring_bind_must_consp(rest, datum, $list_alt283);
			    current_12 = rest.first();
			    rest = rest.rest();
			    destructuring_bind_must_consp(rest, datum, $list_alt283);
			    if (NIL == member(current_12, $list_alt267, UNPROVIDED, UNPROVIDED)) {
				bad = T;
			    }
			    if (current_12 == $ALLOW_OTHER_KEYS) {
				allow_other_keys_p = rest.first();
			    }
			    rest = rest.rest();
			}
			if ((NIL != bad) && (NIL == allow_other_keys_p)) {
			    cdestructuring_bind_error(datum, $list_alt283);
			}
			{
			    SubLObject dbms_server_tail = property_list_member($DBMS_SERVER, current);
			    SubLObject dbms_server = (NIL != dbms_server_tail) ? ((SubLObject) (cadr(dbms_server_tail))) : $dbms_server$;
			    SubLObject port_tail = property_list_member($PORT, current);
			    SubLObject port = (NIL != port_tail) ? ((SubLObject) (cadr(port_tail))) : $sql_port$;
			    SubLObject subprotocol_tail = property_list_member($SUBPROTOCOL, current);
			    SubLObject subprotocol = (NIL != subprotocol_tail) ? ((SubLObject) (cadr(subprotocol_tail))) : $sql_subprotocol$;
			    SubLObject proxy_server_tail = property_list_member($PROXY_SERVER, current);
			    SubLObject proxy_server = (NIL != proxy_server_tail) ? ((SubLObject) (cadr(proxy_server_tail))) : dbms_server;
			    SubLObject timeout_tail = property_list_member($TIMEOUT, current);
			    SubLObject timeout = (NIL != timeout_tail) ? ((SubLObject) (cadr(timeout_tail))) : $sql_connection_timeout$;
			    current = temp;
			    {
				SubLObject body = current;
				SubLObject connection = $sym284$CONNECTION;
				return list(CLET, list(statement), listS(WITH_SQL_CONNECTION, list(new SubLObject[] { connection, db, user, password, $DBMS_SERVER, dbms_server, $PORT, port, $SUBPROTOCOL, subprotocol, $PROXY_SERVER, proxy_server, $TIMEOUT, timeout }),
					list(PIF, list(SQL_OPEN_CONNECTION_P, connection), list(CSETQ, statement, list(SQLC_PREPARE_STATEMENT, connection, sql)), list(CSETQ, statement, connection)), append(body, NIL)));
			    }
			}
		    }
		}
	    }
	}
    }

    @LispMethod(comment = "Execute BODY with STATEMENT bound to an sql statement created from a auto-commit\r\nconnection with the specified parameters, or bound to an SDBC error if a statement\r\ncould not be obtained\nExecute BODY with STATEMENT bound to an sql statement created from a auto-commit\nconnection with the specified parameters, or bound to an SDBC error if a statement\ncould not be obtained")
    public static SubLObject with_prepared_sql_statement(final SubLObject macroform, final SubLObject environment) {
	SubLObject current;
	final SubLObject datum = current = macroform.rest();
	destructuring_bind_must_consp(current, datum, $list375);
	final SubLObject temp = current.rest();
	current = current.first();
	SubLObject statement = NIL;
	SubLObject sql = NIL;
	SubLObject db = NIL;
	SubLObject user = NIL;
	SubLObject password = NIL;
	destructuring_bind_must_consp(current, datum, $list375);
	statement = current.first();
	current = current.rest();
	destructuring_bind_must_consp(current, datum, $list375);
	sql = current.first();
	current = current.rest();
	destructuring_bind_must_consp(current, datum, $list375);
	db = current.first();
	current = current.rest();
	destructuring_bind_must_consp(current, datum, $list375);
	user = current.first();
	current = current.rest();
	destructuring_bind_must_consp(current, datum, $list375);
	password = current.first();
	current = current.rest();
	SubLObject allow_other_keys_p = NIL;
	SubLObject rest = current;
	SubLObject bad = NIL;
	SubLObject current_$12 = NIL;
	while (NIL != rest) {
	    destructuring_bind_must_consp(rest, datum, $list375);
	    current_$12 = rest.first();
	    rest = rest.rest();
	    destructuring_bind_must_consp(rest, datum, $list375);
	    if (NIL == member(current_$12, $list359, UNPROVIDED, UNPROVIDED)) {
		bad = T;
	    }
	    if (current_$12 == $ALLOW_OTHER_KEYS) {
		allow_other_keys_p = rest.first();
	    }
	    rest = rest.rest();
	}
	if ((NIL != bad) && (NIL == allow_other_keys_p)) {
	    cdestructuring_bind_error(datum, $list375);
	}
	final SubLObject dbms_server_tail = property_list_member($DBMS_SERVER, current);
	final SubLObject dbms_server = (NIL != dbms_server_tail) ? cadr(dbms_server_tail) : $dbms_server$;
	final SubLObject port_tail = property_list_member($PORT, current);
	final SubLObject port = (NIL != port_tail) ? cadr(port_tail) : $sql_port$;
	final SubLObject subprotocol_tail = property_list_member($SUBPROTOCOL, current);
	final SubLObject subprotocol = (NIL != subprotocol_tail) ? cadr(subprotocol_tail) : $sql_subprotocol$;
	final SubLObject proxy_server_tail = property_list_member($PROXY_SERVER, current);
	final SubLObject proxy_server = (NIL != proxy_server_tail) ? cadr(proxy_server_tail) : dbms_server;
	final SubLObject timeout_tail = property_list_member($TIMEOUT, current);
	final SubLObject timeout = (NIL != timeout_tail) ? cadr(timeout_tail) : $sql_connection_timeout$;
	final SubLObject body;
	current = body = temp;
	final SubLObject connection = $sym376$CONNECTION;
	return list(CLET, list(statement), listS(WITH_SQL_CONNECTION, list(new SubLObject[] { connection, db, user, password, $DBMS_SERVER, dbms_server, $PORT, port, $SUBPROTOCOL, subprotocol, $PROXY_SERVER, proxy_server, $TIMEOUT, timeout }),
		list(PIF, list(SQL_OPEN_CONNECTION_P, connection), list(CSETQ, statement, list(SQLC_PREPARE_STATEMENT, connection, sql)), list(CSETQ, statement, connection)), append(body, NIL)));
    }

    /**
    * Execute BODY with STATEMENT bound to an sql statement created from a auto-commit
    * connection with the specified parameters, or bound to an SDBC error if a statement
    * could not be obtained
    */

    /**
     *
     *
     * @param STATEMENT
     * 		sql-statement-p
     * 		Execute BODY on STATEMENT as a single atomic transaction, potentially rolling back on
     * 		error. If set, ERROR is an sdbc error containing all error messages encountered, one
     * 		per line, from most to least recent.
     * 		If ERROR is nil, the transaction was successfully completed. If ERROR contains
     * 		no rollback error message, the transaction could not be completed but left the database
     * 		in a consistent state. If ERROR contains a rollback error message, the transaction
     * 		generated an error and couldn't be rolled back.
     * @unknown STATEMENT's connection shouldn't be in the middle of another transaction.
    If STATEMENT's connection is in the middle of another transaction, that transaction
    will become part of this transaction
     */
    @LispMethod(comment = "@param STATEMENT\r\n\t\tsql-statement-p\r\n\t\tExecute BODY on STATEMENT as a single atomic transaction, potentially rolling back on\r\n\t\terror. If set, ERROR is an sdbc error containing all error messages encountered, one\r\n\t\tper line, from most to least recent.\r\n\t\tIf ERROR is nil, the transaction was successfully completed. If ERROR contains\r\n\t\tno rollback error message, the transaction could not be completed but left the database\r\n\t\tin a consistent state. If ERROR contains a rollback error message, the transaction\r\n\t\tgenerated an error and couldn\'t be rolled back.\r\n@unknown STATEMENT\'s connection shouldn\'t be in the middle of another transaction.\r\nIf STATEMENT\'s connection is in the middle of another transaction, that transaction\r\nwill become part of this transaction")
    public static final SubLObject sqls_execute_transaction_alt(SubLObject macroform, SubLObject environment) {
	{
	    SubLObject datum = macroform.rest();
	    SubLObject current = datum;
	    destructuring_bind_must_consp(current, datum, $list_alt286);
	    {
		SubLObject temp = current.rest();
		current = current.first();
		{
		    SubLObject statement = NIL;
		    SubLObject error = NIL;
		    destructuring_bind_must_consp(current, datum, $list_alt286);
		    statement = current.first();
		    current = current.rest();
		    destructuring_bind_must_consp(current, datum, $list_alt286);
		    error = current.first();
		    current = current.rest();
		    if (NIL == current) {
			current = temp;
			{
			    SubLObject body = current;
			    SubLObject connection = $sym287$CONNECTION;
			    SubLObject auto_commit = $sym288$AUTO_COMMIT;
			    SubLObject commit_error = $sym289$COMMIT_ERROR;
			    SubLObject rollback_result = $sym290$ROLLBACK_RESULT;
			    SubLObject auto_commit_result = $sym291$AUTO_COMMIT_RESULT;
			    SubLObject errors = $sym292$ERRORS;
			    return list(PROGN,
				    list(CLET, list(list(connection, list(SQLS_GET_CONNECTION, statement)), list(auto_commit, list(SQLC_GET_AUTO_COMMIT, connection)), commit_error, rollback_result, auto_commit_result, errors),
					    list(PIF, list(SDBC_ERROR_P, auto_commit), list(CPUSH, auto_commit, errors),
						    list(PROGN, listS(SQLC_SET_ERROR_HANDLING, connection, $list_alt295),
							    listS(CATCH_ERROR_MESSAGE, list(commit_error), list(PWHEN, auto_commit, listS(SQLC_SET_AUTO_COMMIT, connection, $list_alt298)), append(body, list(list(SQLC_COMMIT, connection)))), listS(SQLC_SET_ERROR_HANDLING, connection, $list_alt300),
							    list(PWHEN, commit_error, list(CPUSH, list(SQLS_HANDLE_COMMIT_ERROR, commit_error), errors), list(CSETQ, rollback_result, list(SQLS_HANDLE_ROLLBACK, connection)),
								    list(PWHEN, list(SDBC_ERROR_P, rollback_result), list(CPUSH, rollback_result, errors))),
							    list(PWHEN, auto_commit, list(CSETQ, auto_commit_result, listS(SQLC_SET_AUTO_COMMIT, connection, $list_alt303))), list(PWHEN, list(SDBC_ERROR_P, auto_commit_result), list(CPUSH, auto_commit_result, errors)))),
					    list(PWHEN, errors, list(CSETQ, error, list(SQLS_HANDLE_TRANSACTION_ERRORS, errors)))));
			}
		    } else {
			cdestructuring_bind_error(datum, $list_alt286);
		    }
		}
	    }
	}
	return NIL;
    }

    /**
     *
     *
     * @param STATEMENT
     * 		sql-statement-p
     * 		Execute BODY on STATEMENT as a single atomic transaction, potentially rolling back on
     * 		error. If set, ERROR is an sdbc error containing all error messages encountered, one
     * 		per line, from most to least recent.
     * 		If ERROR is nil, the transaction was successfully completed. If ERROR contains
     * 		no rollback error message, the transaction could not be completed but left the database
     * 		in a consistent state. If ERROR contains a rollback error message, the transaction
     * 		generated an error and couldn't be rolled back.
     * @unknown STATEMENT's connection shouldn't be in the middle of another transaction.
    If STATEMENT's connection is in the middle of another transaction, that transaction
    will become part of this transaction
     */
    @LispMethod(comment = "@param STATEMENT\r\n\t\tsql-statement-p\r\n\t\tExecute BODY on STATEMENT as a single atomic transaction, potentially rolling back on\r\n\t\terror. If set, ERROR is an sdbc error containing all error messages encountered, one\r\n\t\tper line, from most to least recent.\r\n\t\tIf ERROR is nil, the transaction was successfully completed. If ERROR contains\r\n\t\tno rollback error message, the transaction could not be completed but left the database\r\n\t\tin a consistent state. If ERROR contains a rollback error message, the transaction\r\n\t\tgenerated an error and couldn\'t be rolled back.\r\n@unknown STATEMENT\'s connection shouldn\'t be in the middle of another transaction.\r\nIf STATEMENT\'s connection is in the middle of another transaction, that transaction\r\nwill become part of this transaction")
    public static SubLObject sqls_execute_transaction(final SubLObject macroform, final SubLObject environment) {
	SubLObject current;
	final SubLObject datum = current = macroform.rest();
	destructuring_bind_must_consp(current, datum, $list378);
	final SubLObject temp = current.rest();
	current = current.first();
	SubLObject statement = NIL;
	SubLObject error = NIL;
	destructuring_bind_must_consp(current, datum, $list378);
	statement = current.first();
	current = current.rest();
	destructuring_bind_must_consp(current, datum, $list378);
	error = current.first();
	current = current.rest();
	if (NIL == current) {
	    final SubLObject body;
	    current = body = temp;
	    final SubLObject connection = $sym379$CONNECTION;
	    final SubLObject auto_commit = $sym380$AUTO_COMMIT;
	    final SubLObject commit_error = $sym381$COMMIT_ERROR;
	    final SubLObject rollback_result = $sym382$ROLLBACK_RESULT;
	    final SubLObject auto_commit_result = $sym383$AUTO_COMMIT_RESULT;
	    final SubLObject errors = $sym384$ERRORS;
	    return list(PROGN,
		    list(CLET, list(list(connection, list(SQLS_GET_CONNECTION, statement)), list(auto_commit, list(SQLC_GET_AUTO_COMMIT, connection)), commit_error, rollback_result, auto_commit_result, errors),
			    list(PIF, list(SDBC_ERROR_P, auto_commit), list(CPUSH, auto_commit, errors),
				    list(PROGN, listS(SQLC_SET_ERROR_HANDLING, connection, $list387), listS(CATCH_ERROR_MESSAGE, list(commit_error), list(PWHEN, auto_commit, listS(SQLC_SET_AUTO_COMMIT, connection, $list390)), append(body, list(list(SQLC_COMMIT, connection)))),
					    listS(SQLC_SET_ERROR_HANDLING, connection, $list392),
					    list(PWHEN, commit_error, list(CPUSH, list(SQLS_HANDLE_COMMIT_ERROR, commit_error), errors), list(CSETQ, rollback_result, list(SQLS_HANDLE_ROLLBACK, connection)), list(PWHEN, list(SDBC_ERROR_P, rollback_result), list(CPUSH, rollback_result, errors))),
					    list(PWHEN, auto_commit, list(CSETQ, auto_commit_result, listS(SQLC_SET_AUTO_COMMIT, connection, $list395))), list(PWHEN, list(SDBC_ERROR_P, auto_commit_result), list(CPUSH, auto_commit_result, errors)))),
			    list(PWHEN, errors, list(CSETQ, error, list(SQLS_HANDLE_TRANSACTION_ERRORS, errors)))));
	}
	cdestructuring_bind_error(datum, $list378);
	return NIL;
    }

    public static final SubLObject sqls_handle_commit_error_alt(SubLObject error) {
	if (NIL != sdbc_error_p(error)) {
	    return new_sdbc_error($commit_error$.getGlobalValue(), sdbc_error_message(error), UNPROVIDED);
	} else {
	    if (error.isString()) {
		return new_sdbc_error($transaction_error$.getGlobalValue(), error, UNPROVIDED);
	    } else {
		return new_sdbc_error($unknown_error$.getGlobalValue(), $str_alt305$An_unknown_error_occurred_during_, UNPROVIDED);
	    }
	}
    }

    public static SubLObject sqls_handle_commit_error(final SubLObject error) {
	if (NIL != sdbc_error_p(error)) {
	    return new_sdbc_error($commit_error$.getGlobalValue(), sdbc_error_message(error), UNPROVIDED);
	}
	if (error.isString()) {
	    return new_sdbc_error($transaction_error$.getGlobalValue(), error, UNPROVIDED);
	}
	return new_sdbc_error($unknown_error$.getGlobalValue(), $str397$An_unknown_error_occurred_during_, UNPROVIDED);
    }

    public static final SubLObject sqls_handle_rollback_alt(SubLObject connection) {
	{
	    SubLObject rollback_result = NIL;
	    rollback_result = sqlc_rollback(connection);
	    if (NIL != sdbc_error_p(rollback_result)) {
		rollback_result = new_sdbc_error($rollback_error$.getGlobalValue(), sdbc_error_message(rollback_result), UNPROVIDED);
	    }
	    return rollback_result;
	}
    }

    public static SubLObject sqls_handle_rollback(final SubLObject connection) {
	SubLObject rollback_result = NIL;
	rollback_result = sqlc_rollback(connection);
	if (NIL != sdbc_error_p(rollback_result)) {
	    rollback_result = new_sdbc_error($rollback_error$.getGlobalValue(), sdbc_error_message(rollback_result), UNPROVIDED);
	}
	return rollback_result;
    }

    public static final SubLObject sqls_handle_transaction_errors_alt(SubLObject errors) {
	{
	    SubLObject error_message = string_utilities.bunge(Mapping.mapcar(SDBC_ERROR_MESSAGE, errors), CHAR_newline);
	    return new_sdbc_error($transaction_error$.getGlobalValue(), error_message, UNPROVIDED);
	}
    }

    public static SubLObject sqls_handle_transaction_errors(final SubLObject errors) {
	final SubLObject error_message = string_utilities.bunge(Mapping.mapcar(SDBC_ERROR_MESSAGE, errors), CHAR_newline);
	return new_sdbc_error($transaction_error$.getGlobalValue(), error_message, UNPROVIDED);
    }

    /**
     * This macro creates an SQL statement, which it binds to STATEMENT, and executes
     * BODY within this scope.  All SQL operations executed within BODY will be done
     * as a single atomic transaction, potentially rolling back on error.  If set,
     * ERROR is an sdbc-error-p containing all error messages encountered, one per line,
     * from most to least recent.  If ERROR is nil, the transaction was successfully
     * completed. If ERROR contains no rollback error message, the transaction could
     * not be completed but left the database in a consistent state. If ERROR contains
     * a rollback error message, the transaction generated an error and couldn't be
     * rolled back.
     */
    @LispMethod(comment = "This macro creates an SQL statement, which it binds to STATEMENT, and executes\r\nBODY within this scope.  All SQL operations executed within BODY will be done\r\nas a single atomic transaction, potentially rolling back on error.  If set,\r\nERROR is an sdbc-error-p containing all error messages encountered, one per line,\r\nfrom most to least recent.  If ERROR is nil, the transaction was successfully\r\ncompleted. If ERROR contains no rollback error message, the transaction could\r\nnot be completed but left the database in a consistent state. If ERROR contains\r\na rollback error message, the transaction generated an error and couldn\'t be\r\nrolled back.\nThis macro creates an SQL statement, which it binds to STATEMENT, and executes\nBODY within this scope.  All SQL operations executed within BODY will be done\nas a single atomic transaction, potentially rolling back on error.  If set,\nERROR is an sdbc-error-p containing all error messages encountered, one per line,\nfrom most to least recent.  If ERROR is nil, the transaction was successfully\ncompleted. If ERROR contains no rollback error message, the transaction could\nnot be completed but left the database in a consistent state. If ERROR contains\na rollback error message, the transaction generated an error and couldn\'t be\nrolled back.")
    public static final SubLObject with_sql_transaction_alt(SubLObject macroform, SubLObject environment) {
	{
	    SubLObject datum = macroform.rest();
	    SubLObject current = datum;
	    destructuring_bind_must_consp(current, datum, $list_alt306);
	    {
		SubLObject temp = current.rest();
		current = current.first();
		{
		    SubLObject statement = NIL;
		    SubLObject error = NIL;
		    SubLObject db = NIL;
		    SubLObject user = NIL;
		    SubLObject password = NIL;
		    destructuring_bind_must_consp(current, datum, $list_alt306);
		    statement = current.first();
		    current = current.rest();
		    destructuring_bind_must_consp(current, datum, $list_alt306);
		    error = current.first();
		    current = current.rest();
		    destructuring_bind_must_consp(current, datum, $list_alt306);
		    db = current.first();
		    current = current.rest();
		    destructuring_bind_must_consp(current, datum, $list_alt306);
		    user = current.first();
		    current = current.rest();
		    destructuring_bind_must_consp(current, datum, $list_alt306);
		    password = current.first();
		    current = current.rest();
		    {
			SubLObject allow_other_keys_p = NIL;
			SubLObject rest = current;
			SubLObject bad = NIL;
			SubLObject current_13 = NIL;
			for (; NIL != rest;) {
			    destructuring_bind_must_consp(rest, datum, $list_alt306);
			    current_13 = rest.first();
			    rest = rest.rest();
			    destructuring_bind_must_consp(rest, datum, $list_alt306);
			    if (NIL == member(current_13, $list_alt267, UNPROVIDED, UNPROVIDED)) {
				bad = T;
			    }
			    if (current_13 == $ALLOW_OTHER_KEYS) {
				allow_other_keys_p = rest.first();
			    }
			    rest = rest.rest();
			}
			if ((NIL != bad) && (NIL == allow_other_keys_p)) {
			    cdestructuring_bind_error(datum, $list_alt306);
			}
			{
			    SubLObject dbms_server_tail = property_list_member($DBMS_SERVER, current);
			    SubLObject dbms_server = (NIL != dbms_server_tail) ? ((SubLObject) (cadr(dbms_server_tail))) : $dbms_server$;
			    SubLObject port_tail = property_list_member($PORT, current);
			    SubLObject port = (NIL != port_tail) ? ((SubLObject) (cadr(port_tail))) : $sql_port$;
			    SubLObject subprotocol_tail = property_list_member($SUBPROTOCOL, current);
			    SubLObject subprotocol = (NIL != subprotocol_tail) ? ((SubLObject) (cadr(subprotocol_tail))) : $sql_subprotocol$;
			    SubLObject proxy_server_tail = property_list_member($PROXY_SERVER, current);
			    SubLObject proxy_server = (NIL != proxy_server_tail) ? ((SubLObject) (cadr(proxy_server_tail))) : dbms_server;
			    SubLObject timeout_tail = property_list_member($TIMEOUT, current);
			    SubLObject timeout = (NIL != timeout_tail) ? ((SubLObject) (cadr(timeout_tail))) : $sql_connection_timeout$;
			    current = temp;
			    {
				SubLObject body = current;
				return list(WITH_SQL_STATEMENT, list(new SubLObject[] { statement, db, user, password, $DBMS_SERVER, dbms_server, $PORT, port, $SUBPROTOCOL, subprotocol, $PROXY_SERVER, proxy_server, $TIMEOUT, timeout }),
					list(PWHEN, list(SQL_OPEN_STATEMENT_P, statement), listS(SQLS_EXECUTE_TRANSACTION, list(statement, error), append(body, NIL))));
			    }
			}
		    }
		}
	    }
	}
    }

    @LispMethod(comment = "This macro creates an SQL statement, which it binds to STATEMENT, and executes\r\nBODY within this scope.  All SQL operations executed within BODY will be done\r\nas a single atomic transaction, potentially rolling back on error.  If set,\r\nERROR is an sdbc-error-p containing all error messages encountered, one per line,\r\nfrom most to least recent.  If ERROR is nil, the transaction was successfully\r\ncompleted. If ERROR contains no rollback error message, the transaction could\r\nnot be completed but left the database in a consistent state. If ERROR contains\r\na rollback error message, the transaction generated an error and couldn\'t be\r\nrolled back.\nThis macro creates an SQL statement, which it binds to STATEMENT, and executes\nBODY within this scope.  All SQL operations executed within BODY will be done\nas a single atomic transaction, potentially rolling back on error.  If set,\nERROR is an sdbc-error-p containing all error messages encountered, one per line,\nfrom most to least recent.  If ERROR is nil, the transaction was successfully\ncompleted. If ERROR contains no rollback error message, the transaction could\nnot be completed but left the database in a consistent state. If ERROR contains\na rollback error message, the transaction generated an error and couldn\'t be\nrolled back.")
    public static SubLObject with_sql_transaction(final SubLObject macroform, final SubLObject environment) {
	SubLObject current;
	final SubLObject datum = current = macroform.rest();
	destructuring_bind_must_consp(current, datum, $list398);
	final SubLObject temp = current.rest();
	current = current.first();
	SubLObject statement = NIL;
	SubLObject error = NIL;
	SubLObject db = NIL;
	SubLObject user = NIL;
	SubLObject password = NIL;
	destructuring_bind_must_consp(current, datum, $list398);
	statement = current.first();
	current = current.rest();
	destructuring_bind_must_consp(current, datum, $list398);
	error = current.first();
	current = current.rest();
	destructuring_bind_must_consp(current, datum, $list398);
	db = current.first();
	current = current.rest();
	destructuring_bind_must_consp(current, datum, $list398);
	user = current.first();
	current = current.rest();
	destructuring_bind_must_consp(current, datum, $list398);
	password = current.first();
	current = current.rest();
	SubLObject allow_other_keys_p = NIL;
	SubLObject rest = current;
	SubLObject bad = NIL;
	SubLObject current_$13 = NIL;
	while (NIL != rest) {
	    destructuring_bind_must_consp(rest, datum, $list398);
	    current_$13 = rest.first();
	    rest = rest.rest();
	    destructuring_bind_must_consp(rest, datum, $list398);
	    if (NIL == member(current_$13, $list359, UNPROVIDED, UNPROVIDED)) {
		bad = T;
	    }
	    if (current_$13 == $ALLOW_OTHER_KEYS) {
		allow_other_keys_p = rest.first();
	    }
	    rest = rest.rest();
	}
	if ((NIL != bad) && (NIL == allow_other_keys_p)) {
	    cdestructuring_bind_error(datum, $list398);
	}
	final SubLObject dbms_server_tail = property_list_member($DBMS_SERVER, current);
	final SubLObject dbms_server = (NIL != dbms_server_tail) ? cadr(dbms_server_tail) : $dbms_server$;
	final SubLObject port_tail = property_list_member($PORT, current);
	final SubLObject port = (NIL != port_tail) ? cadr(port_tail) : $sql_port$;
	final SubLObject subprotocol_tail = property_list_member($SUBPROTOCOL, current);
	final SubLObject subprotocol = (NIL != subprotocol_tail) ? cadr(subprotocol_tail) : $sql_subprotocol$;
	final SubLObject proxy_server_tail = property_list_member($PROXY_SERVER, current);
	final SubLObject proxy_server = (NIL != proxy_server_tail) ? cadr(proxy_server_tail) : dbms_server;
	final SubLObject timeout_tail = property_list_member($TIMEOUT, current);
	final SubLObject timeout = (NIL != timeout_tail) ? cadr(timeout_tail) : $sql_connection_timeout$;
	final SubLObject body;
	current = body = temp;
	return list(WITH_SQL_STATEMENT, list(new SubLObject[] { statement, db, user, password, $DBMS_SERVER, dbms_server, $PORT, port, $SUBPROTOCOL, subprotocol, $PROXY_SERVER, proxy_server, $TIMEOUT, timeout }),
		list(PWHEN, list(SQL_OPEN_STATEMENT_P, statement), listS(SQLS_EXECUTE_TRANSACTION, list(statement, error), append(body, NIL))));
    }

    /**
    * This macro creates an SQL statement, which it binds to STATEMENT, and executes
    * BODY within this scope.  All SQL operations executed within BODY will be done
    * as a single atomic transaction, potentially rolling back on error.  If set,
    * ERROR is an sdbc-error-p containing all error messages encountered, one per line,
    * from most to least recent.  If ERROR is nil, the transaction was successfully
    * completed. If ERROR contains no rollback error message, the transaction could
    * not be completed but left the database in a consistent state. If ERROR contains
    * a rollback error message, the transaction generated an error and couldn't be
    * rolled back.
    */

    /**
     * Execute BODY with RS bound to a result set answering QUERY with the specified
     * connection parameters. RS must be declared outside. After the execution, RS
     * will contain an error if one occurred
     */
    @LispMethod(comment = "Execute BODY with RS bound to a result set answering QUERY with the specified\r\nconnection parameters. RS must be declared outside. After the execution, RS\r\nwill contain an error if one occurred\nExecute BODY with RS bound to a result set answering QUERY with the specified\nconnection parameters. RS must be declared outside. After the execution, RS\nwill contain an error if one occurred")
    public static final SubLObject with_sql_result_set_alt(SubLObject macroform, SubLObject environment) {
	{
	    SubLObject datum = macroform.rest();
	    SubLObject current = datum;
	    destructuring_bind_must_consp(current, datum, $list_alt308);
	    {
		SubLObject temp = current.rest();
		current = current.first();
		{
		    SubLObject rs = NIL;
		    SubLObject query = NIL;
		    SubLObject db = NIL;
		    SubLObject user = NIL;
		    SubLObject password = NIL;
		    destructuring_bind_must_consp(current, datum, $list_alt308);
		    rs = current.first();
		    current = current.rest();
		    destructuring_bind_must_consp(current, datum, $list_alt308);
		    query = current.first();
		    current = current.rest();
		    destructuring_bind_must_consp(current, datum, $list_alt308);
		    db = current.first();
		    current = current.rest();
		    destructuring_bind_must_consp(current, datum, $list_alt308);
		    user = current.first();
		    current = current.rest();
		    destructuring_bind_must_consp(current, datum, $list_alt308);
		    password = current.first();
		    current = current.rest();
		    {
			SubLObject allow_other_keys_p = NIL;
			SubLObject rest = current;
			SubLObject bad = NIL;
			SubLObject current_14 = NIL;
			for (; NIL != rest;) {
			    destructuring_bind_must_consp(rest, datum, $list_alt308);
			    current_14 = rest.first();
			    rest = rest.rest();
			    destructuring_bind_must_consp(rest, datum, $list_alt308);
			    if (NIL == member(current_14, $list_alt267, UNPROVIDED, UNPROVIDED)) {
				bad = T;
			    }
			    if (current_14 == $ALLOW_OTHER_KEYS) {
				allow_other_keys_p = rest.first();
			    }
			    rest = rest.rest();
			}
			if ((NIL != bad) && (NIL == allow_other_keys_p)) {
			    cdestructuring_bind_error(datum, $list_alt308);
			}
			{
			    SubLObject dbms_server_tail = property_list_member($DBMS_SERVER, current);
			    SubLObject dbms_server = (NIL != dbms_server_tail) ? ((SubLObject) (cadr(dbms_server_tail))) : $dbms_server$;
			    SubLObject port_tail = property_list_member($PORT, current);
			    SubLObject port = (NIL != port_tail) ? ((SubLObject) (cadr(port_tail))) : $sql_port$;
			    SubLObject subprotocol_tail = property_list_member($SUBPROTOCOL, current);
			    SubLObject subprotocol = (NIL != subprotocol_tail) ? ((SubLObject) (cadr(subprotocol_tail))) : $sql_subprotocol$;
			    SubLObject proxy_server_tail = property_list_member($PROXY_SERVER, current);
			    SubLObject proxy_server = (NIL != proxy_server_tail) ? ((SubLObject) (cadr(proxy_server_tail))) : dbms_server;
			    SubLObject timeout_tail = property_list_member($TIMEOUT, current);
			    SubLObject timeout = (NIL != timeout_tail) ? ((SubLObject) (cadr(timeout_tail))) : $sql_connection_timeout$;
			    current = temp;
			    {
				SubLObject body = current;
				SubLObject statement = $sym309$STATEMENT;
				return list(CLET, list(rs), listS(WITH_SQL_STATEMENT, list(new SubLObject[] { statement, db, user, password, $DBMS_SERVER, dbms_server, $PORT, port, $SUBPROTOCOL, subprotocol, $PROXY_SERVER, proxy_server, $TIMEOUT, timeout }),
					list(PIF, list(SQL_OPEN_STATEMENT_P, statement), list(CSETQ, RS, list(SQLS_EXECUTE_QUERY, statement, query)), list(CSETQ, rs, statement)), append(body, NIL)));
			    }
			}
		    }
		}
	    }
	}
    }

    @LispMethod(comment = "Execute BODY with RS bound to a result set answering QUERY with the specified\r\nconnection parameters. RS must be declared outside. After the execution, RS\r\nwill contain an error if one occurred\nExecute BODY with RS bound to a result set answering QUERY with the specified\nconnection parameters. RS must be declared outside. After the execution, RS\nwill contain an error if one occurred")
    public static SubLObject with_sql_result_set(final SubLObject macroform, final SubLObject environment) {
	SubLObject current;
	final SubLObject datum = current = macroform.rest();
	destructuring_bind_must_consp(current, datum, $list400);
	final SubLObject temp = current.rest();
	current = current.first();
	SubLObject rs = NIL;
	SubLObject query = NIL;
	SubLObject db = NIL;
	SubLObject user = NIL;
	SubLObject password = NIL;
	destructuring_bind_must_consp(current, datum, $list400);
	rs = current.first();
	current = current.rest();
	destructuring_bind_must_consp(current, datum, $list400);
	query = current.first();
	current = current.rest();
	destructuring_bind_must_consp(current, datum, $list400);
	db = current.first();
	current = current.rest();
	destructuring_bind_must_consp(current, datum, $list400);
	user = current.first();
	current = current.rest();
	destructuring_bind_must_consp(current, datum, $list400);
	password = current.first();
	current = current.rest();
	SubLObject allow_other_keys_p = NIL;
	SubLObject rest = current;
	SubLObject bad = NIL;
	SubLObject current_$14 = NIL;
	while (NIL != rest) {
	    destructuring_bind_must_consp(rest, datum, $list400);
	    current_$14 = rest.first();
	    rest = rest.rest();
	    destructuring_bind_must_consp(rest, datum, $list400);
	    if (NIL == member(current_$14, $list359, UNPROVIDED, UNPROVIDED)) {
		bad = T;
	    }
	    if (current_$14 == $ALLOW_OTHER_KEYS) {
		allow_other_keys_p = rest.first();
	    }
	    rest = rest.rest();
	}
	if ((NIL != bad) && (NIL == allow_other_keys_p)) {
	    cdestructuring_bind_error(datum, $list400);
	}
	final SubLObject dbms_server_tail = property_list_member($DBMS_SERVER, current);
	final SubLObject dbms_server = (NIL != dbms_server_tail) ? cadr(dbms_server_tail) : $dbms_server$;
	final SubLObject port_tail = property_list_member($PORT, current);
	final SubLObject port = (NIL != port_tail) ? cadr(port_tail) : $sql_port$;
	final SubLObject subprotocol_tail = property_list_member($SUBPROTOCOL, current);
	final SubLObject subprotocol = (NIL != subprotocol_tail) ? cadr(subprotocol_tail) : $sql_subprotocol$;
	final SubLObject proxy_server_tail = property_list_member($PROXY_SERVER, current);
	final SubLObject proxy_server = (NIL != proxy_server_tail) ? cadr(proxy_server_tail) : dbms_server;
	final SubLObject timeout_tail = property_list_member($TIMEOUT, current);
	final SubLObject timeout = (NIL != timeout_tail) ? cadr(timeout_tail) : $sql_connection_timeout$;
	final SubLObject body;
	current = body = temp;
	final SubLObject statement = $sym401$STATEMENT;
	return list(CLET, list(rs), listS(WITH_SQL_STATEMENT, list(new SubLObject[] { statement, db, user, password, $DBMS_SERVER, dbms_server, $PORT, port, $SUBPROTOCOL, subprotocol, $PROXY_SERVER, proxy_server, $TIMEOUT, timeout }),
		list(PIF, list(SQL_OPEN_STATEMENT_P, statement), list(CSETQ, RS, list(SQLS_EXECUTE_QUERY, statement, query)), list(CSETQ, rs, statement)), append(body, NIL)));
    }

    /**
    * Execute BODY with RS bound to a result set answering QUERY with the specified
    * connection parameters. RS must be declared outside. After the execution, RS
    * will contain an error if one occurred
    */

    /**
     * Execute BODY with RS bound to a result set answering QUERY with the specified
     * connection parameters. RS must be declared outside.
     * In each iteration, RS's cursor is successively pointing to each row in RS.
     * After execution, RS will contain an error if one occurred.
     */
    @LispMethod(comment = "Execute BODY with RS bound to a result set answering QUERY with the specified\r\nconnection parameters. RS must be declared outside.\r\nIn each iteration, RS\'s cursor is successively pointing to each row in RS.\r\nAfter execution, RS will contain an error if one occurred.\nExecute BODY with RS bound to a result set answering QUERY with the specified\nconnection parameters. RS must be declared outside.\nIn each iteration, RS\'s cursor is successively pointing to each row in RS.\nAfter execution, RS will contain an error if one occurred.")
    public static final SubLObject do_sql_result_set_alt(SubLObject macroform, SubLObject environment) {
	{
	    SubLObject datum = macroform.rest();
	    SubLObject current = datum;
	    destructuring_bind_must_consp(current, datum, $list_alt308);
	    {
		SubLObject temp = current.rest();
		current = current.first();
		{
		    SubLObject rs = NIL;
		    SubLObject query = NIL;
		    SubLObject db = NIL;
		    SubLObject user = NIL;
		    SubLObject password = NIL;
		    destructuring_bind_must_consp(current, datum, $list_alt308);
		    rs = current.first();
		    current = current.rest();
		    destructuring_bind_must_consp(current, datum, $list_alt308);
		    query = current.first();
		    current = current.rest();
		    destructuring_bind_must_consp(current, datum, $list_alt308);
		    db = current.first();
		    current = current.rest();
		    destructuring_bind_must_consp(current, datum, $list_alt308);
		    user = current.first();
		    current = current.rest();
		    destructuring_bind_must_consp(current, datum, $list_alt308);
		    password = current.first();
		    current = current.rest();
		    {
			SubLObject allow_other_keys_p = NIL;
			SubLObject rest = current;
			SubLObject bad = NIL;
			SubLObject current_15 = NIL;
			for (; NIL != rest;) {
			    destructuring_bind_must_consp(rest, datum, $list_alt308);
			    current_15 = rest.first();
			    rest = rest.rest();
			    destructuring_bind_must_consp(rest, datum, $list_alt308);
			    if (NIL == member(current_15, $list_alt267, UNPROVIDED, UNPROVIDED)) {
				bad = T;
			    }
			    if (current_15 == $ALLOW_OTHER_KEYS) {
				allow_other_keys_p = rest.first();
			    }
			    rest = rest.rest();
			}
			if ((NIL != bad) && (NIL == allow_other_keys_p)) {
			    cdestructuring_bind_error(datum, $list_alt308);
			}
			{
			    SubLObject dbms_server_tail = property_list_member($DBMS_SERVER, current);
			    SubLObject dbms_server = (NIL != dbms_server_tail) ? ((SubLObject) (cadr(dbms_server_tail))) : $dbms_server$;
			    SubLObject port_tail = property_list_member($PORT, current);
			    SubLObject port = (NIL != port_tail) ? ((SubLObject) (cadr(port_tail))) : $sql_port$;
			    SubLObject subprotocol_tail = property_list_member($SUBPROTOCOL, current);
			    SubLObject subprotocol = (NIL != subprotocol_tail) ? ((SubLObject) (cadr(subprotocol_tail))) : $sql_subprotocol$;
			    SubLObject proxy_server_tail = property_list_member($PROXY_SERVER, current);
			    SubLObject proxy_server = (NIL != proxy_server_tail) ? ((SubLObject) (cadr(proxy_server_tail))) : dbms_server;
			    SubLObject timeout_tail = property_list_member($TIMEOUT, current);
			    SubLObject timeout = (NIL != timeout_tail) ? ((SubLObject) (cadr(timeout_tail))) : $sql_connection_timeout$;
			    current = temp;
			    {
				SubLObject body = current;
				return list(WITH_SQL_RESULT_SET, list(new SubLObject[] { rs, query, db, user, password, $DBMS_SERVER, dbms_server, $PORT, port, $SUBPROTOCOL, subprotocol, $PROXY_SERVER, proxy_server, $TIMEOUT, timeout }),
					list(PWHEN, list(SQL_RESULT_SET_P, rs), listS(WHILE, list(SQLRS_NEXT, rs), append(body, NIL))));
			    }
			}
		    }
		}
	    }
	}
    }

    @LispMethod(comment = "Execute BODY with RS bound to a result set answering QUERY with the specified\r\nconnection parameters. RS must be declared outside.\r\nIn each iteration, RS\'s cursor is successively pointing to each row in RS.\r\nAfter execution, RS will contain an error if one occurred.\nExecute BODY with RS bound to a result set answering QUERY with the specified\nconnection parameters. RS must be declared outside.\nIn each iteration, RS\'s cursor is successively pointing to each row in RS.\nAfter execution, RS will contain an error if one occurred.")
    public static SubLObject do_sql_result_set(final SubLObject macroform, final SubLObject environment) {
	SubLObject current;
	final SubLObject datum = current = macroform.rest();
	destructuring_bind_must_consp(current, datum, $list400);
	final SubLObject temp = current.rest();
	current = current.first();
	SubLObject rs = NIL;
	SubLObject query = NIL;
	SubLObject db = NIL;
	SubLObject user = NIL;
	SubLObject password = NIL;
	destructuring_bind_must_consp(current, datum, $list400);
	rs = current.first();
	current = current.rest();
	destructuring_bind_must_consp(current, datum, $list400);
	query = current.first();
	current = current.rest();
	destructuring_bind_must_consp(current, datum, $list400);
	db = current.first();
	current = current.rest();
	destructuring_bind_must_consp(current, datum, $list400);
	user = current.first();
	current = current.rest();
	destructuring_bind_must_consp(current, datum, $list400);
	password = current.first();
	current = current.rest();
	SubLObject allow_other_keys_p = NIL;
	SubLObject rest = current;
	SubLObject bad = NIL;
	SubLObject current_$15 = NIL;
	while (NIL != rest) {
	    destructuring_bind_must_consp(rest, datum, $list400);
	    current_$15 = rest.first();
	    rest = rest.rest();
	    destructuring_bind_must_consp(rest, datum, $list400);
	    if (NIL == member(current_$15, $list359, UNPROVIDED, UNPROVIDED)) {
		bad = T;
	    }
	    if (current_$15 == $ALLOW_OTHER_KEYS) {
		allow_other_keys_p = rest.first();
	    }
	    rest = rest.rest();
	}
	if ((NIL != bad) && (NIL == allow_other_keys_p)) {
	    cdestructuring_bind_error(datum, $list400);
	}
	final SubLObject dbms_server_tail = property_list_member($DBMS_SERVER, current);
	final SubLObject dbms_server = (NIL != dbms_server_tail) ? cadr(dbms_server_tail) : $dbms_server$;
	final SubLObject port_tail = property_list_member($PORT, current);
	final SubLObject port = (NIL != port_tail) ? cadr(port_tail) : $sql_port$;
	final SubLObject subprotocol_tail = property_list_member($SUBPROTOCOL, current);
	final SubLObject subprotocol = (NIL != subprotocol_tail) ? cadr(subprotocol_tail) : $sql_subprotocol$;
	final SubLObject proxy_server_tail = property_list_member($PROXY_SERVER, current);
	final SubLObject proxy_server = (NIL != proxy_server_tail) ? cadr(proxy_server_tail) : dbms_server;
	final SubLObject timeout_tail = property_list_member($TIMEOUT, current);
	final SubLObject timeout = (NIL != timeout_tail) ? cadr(timeout_tail) : $sql_connection_timeout$;
	final SubLObject body;
	current = body = temp;
	return list(WITH_SQL_RESULT_SET, list(new SubLObject[] { rs, query, db, user, password, $DBMS_SERVER, dbms_server, $PORT, port, $SUBPROTOCOL, subprotocol, $PROXY_SERVER, proxy_server, $TIMEOUT, timeout }),
		list(PWHEN, list(SQL_RESULT_SET_P, rs), listS(WHILE, list(SQLRS_NEXT, rs), append(body, NIL))));
    }

    /**
    * Execute BODY with RS bound to a result set answering QUERY with the specified
    * connection parameters. RS must be declared outside.
    * In each iteration, RS's cursor is successively pointing to each row in RS.
    * After execution, RS will contain an error if one occurred.
    */

    /**
     * Writes the entire contents of TABLE in DB to STREAM in a tab separated format
     *
     * @param TABLE
     * 		stringp; the table to be exported
     * @param DB
     * 		stringp; the database which hosts TABLE
     * @param USER
     * 		stringp; the user
     * @param PASSWORD
     * 		stringp; the password for USER
     * @param STREAM
     * 		streamp; the stream to write to
     * @param DBMS-SERVER
     * 		stringp; the server on which the DBMS is hosted
     * @param PORT
     * 		positive-integer-p; the port on the the proxy server runs
     * @param SUBPROTOCOL
     * 		stringp; the dbms's  subprotocol
     * @param PROXY-SERVER
     * 		the server of the proxy
     * @return sql-result-set-p or sdbc-error
     */
    @LispMethod(comment = "Writes the entire contents of TABLE in DB to STREAM in a tab separated format\r\n\r\n@param TABLE\r\n\t\tstringp; the table to be exported\r\n@param DB\r\n\t\tstringp; the database which hosts TABLE\r\n@param USER\r\n\t\tstringp; the user\r\n@param PASSWORD\r\n\t\tstringp; the password for USER\r\n@param STREAM\r\n\t\tstreamp; the stream to write to\r\n@param DBMS-SERVER\r\n\t\tstringp; the server on which the DBMS is hosted\r\n@param PORT\r\n\t\tpositive-integer-p; the port on the the proxy server runs\r\n@param SUBPROTOCOL\r\n\t\tstringp; the dbms\'s  subprotocol\r\n@param PROXY-SERVER\r\n\t\tthe server of the proxy\r\n@return sql-result-set-p or sdbc-error")
    public static final SubLObject sql_export_alt(SubLObject table, SubLObject db, SubLObject user, SubLObject password, SubLObject stream, SubLObject dbms_server, SubLObject port, SubLObject subprotocol, SubLObject proxy_server) {
	if (stream == UNPROVIDED) {
	    stream = StreamsLow.$standard_output$.getDynamicValue();
	}
	if (dbms_server == UNPROVIDED) {
	    dbms_server = $dbms_server$.getGlobalValue();
	}
	if (port == UNPROVIDED) {
	    port = $sql_port$.getGlobalValue();
	}
	if (subprotocol == UNPROVIDED) {
	    subprotocol = $sql_subprotocol$.getGlobalValue();
	}
	if (proxy_server == UNPROVIDED) {
	    proxy_server = dbms_server;
	}
	SubLTrampolineFile.checkType(table, STRINGP);
	SubLTrampolineFile.checkType(db, STRINGP);
	SubLTrampolineFile.checkType(user, STRINGP);
	SubLTrampolineFile.checkType(password, STRINGP);
	SubLTrampolineFile.checkType(stream, OUTPUT_STREAM_P);
	SubLTrampolineFile.checkType(dbms_server, STRINGP);
	SubLTrampolineFile.checkType(port, POSITIVE_INTEGER_P);
	SubLTrampolineFile.checkType(subprotocol, STRINGP);
	SubLTrampolineFile.checkType(proxy_server, STRINGP);
	{
	    SubLObject rs = NIL;
	    SubLObject col = NIL;
	    {
		SubLObject rs_16 = NIL;
		SubLObject statement = NIL;
		SubLObject connection = NIL;
		try {
		    connection = new_sql_connection(db, user, password, list(new SubLObject[] { $DBMS_SERVER, dbms_server, $PORT, port, $SUBPROTOCOL, subprotocol, $PROXY_SERVER, proxy_server, $TIMEOUT, $sql_connection_timeout$.getGlobalValue() }));
		    if (NIL != sql_open_connection_p(connection)) {
			statement = sqlc_create_statement(connection);
		    } else {
			statement = connection;
		    }
		    if (NIL != sql_open_statement_p(statement)) {
			rs_16 = sqls_execute_query(statement, cconcatenate($str_alt316$SELECT___FROM_, table), UNPROVIDED);
		    } else {
			rs_16 = statement;
		    }
		    if (NIL != sql_result_set_p(rs_16)) {
			while (NIL != sqlrs_next(rs_16)) {
			    col = ZERO_INTEGER;
			    while (!col.numE(f_1_(sqlrs_column_count(rs_16)))) {
				col = add(col, ONE_INTEGER);
				princ(sqlrs_get_object(rs_16, col), stream);
				princ(CHAR_tab, stream);
			    }
			    col = add(col, ONE_INTEGER);
			    princ(sqlrs_get_object(rs_16, col), stream);
			    terpri(stream);
			}
		    }
		} finally {
		    {
			SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
			try {
			    bind($is_thread_performing_cleanupP$, T);
			    if (NIL != sql_connection_p(connection)) {
				sqlc_close(connection);
			    }
			} finally {
			    rebind($is_thread_performing_cleanupP$, _prev_bind_0);
			}
		    }
		}
	    }
	    return rs;
	}
    }

    @LispMethod(comment = "Writes the entire contents of TABLE in DB to STREAM in a tab separated format\r\n\r\n@param TABLE\r\n\t\tstringp; the table to be exported\r\n@param DB\r\n\t\tstringp; the database which hosts TABLE\r\n@param USER\r\n\t\tstringp; the user\r\n@param PASSWORD\r\n\t\tstringp; the password for USER\r\n@param STREAM\r\n\t\tstreamp; the stream to write to\r\n@param DBMS-SERVER\r\n\t\tstringp; the server on which the DBMS is hosted\r\n@param PORT\r\n\t\tpositive-integer-p; the port on the the proxy server runs\r\n@param SUBPROTOCOL\r\n\t\tstringp; the dbms\'s  subprotocol\r\n@param PROXY-SERVER\r\n\t\tthe server of the proxy\r\n@return sql-result-set-p or sdbc-error")
    public static SubLObject sql_export(final SubLObject table, final SubLObject db, final SubLObject user, final SubLObject password, SubLObject stream, SubLObject dbms_server, SubLObject port, SubLObject subprotocol, SubLObject proxy_server) {
	if (stream == UNPROVIDED) {
	    stream = StreamsLow.$standard_output$.getDynamicValue();
	}
	if (dbms_server == UNPROVIDED) {
	    dbms_server = $dbms_server$.getGlobalValue();
	}
	if (port == UNPROVIDED) {
	    port = $sql_port$.getGlobalValue();
	}
	if (subprotocol == UNPROVIDED) {
	    subprotocol = $sql_subprotocol$.getGlobalValue();
	}
	if (proxy_server == UNPROVIDED) {
	    proxy_server = dbms_server;
	}
	assert NIL != stringp(table) : "! stringp(table) " + ("Types.stringp(table) " + "CommonSymbols.NIL != Types.stringp(table) ") + table;
	assert NIL != stringp(db) : "! stringp(db) " + ("Types.stringp(db) " + "CommonSymbols.NIL != Types.stringp(db) ") + db;
	assert NIL != stringp(user) : "! stringp(user) " + ("Types.stringp(user) " + "CommonSymbols.NIL != Types.stringp(user) ") + user;
	assert NIL != stringp(password) : "! stringp(password) " + ("Types.stringp(password) " + "CommonSymbols.NIL != Types.stringp(password) ") + password;
	assert NIL != output_stream_p(stream) : "! streams_high.output_stream_p(stream) " + ("streams_high.output_stream_p(stream) " + "CommonSymbols.NIL != streams_high.output_stream_p(stream) ") + stream;
	assert NIL != stringp(dbms_server) : "! stringp(dbms_server) " + ("Types.stringp(dbms_server) " + "CommonSymbols.NIL != Types.stringp(dbms_server) ") + dbms_server;
	assert NIL != subl_promotions.positive_integer_p(port) : "! subl_promotions.positive_integer_p(port) " + ("subl_promotions.positive_integer_p(port) " + "CommonSymbols.NIL != subl_promotions.positive_integer_p(port) ") + port;
	assert NIL != stringp(subprotocol) : "! stringp(subprotocol) " + ("Types.stringp(subprotocol) " + "CommonSymbols.NIL != Types.stringp(subprotocol) ") + subprotocol;
	assert NIL != stringp(proxy_server) : "! stringp(proxy_server) " + ("Types.stringp(proxy_server) " + "CommonSymbols.NIL != Types.stringp(proxy_server) ") + proxy_server;
	final SubLObject rs = NIL;
	SubLObject col = NIL;
	SubLObject rs_$16 = NIL;
	SubLObject statement = NIL;
	SubLObject connection = NIL;
	try {
	    connection = new_sql_connection(db, user, password, list(new SubLObject[] { $DBMS_SERVER, dbms_server, $PORT, port, $SUBPROTOCOL, subprotocol, $PROXY_SERVER, proxy_server, $TIMEOUT, $sql_connection_timeout$.getGlobalValue() }));
	    if (NIL != sql_open_connection_p(connection)) {
		statement = sqlc_create_statement(connection);
	    } else {
		statement = connection;
	    }
	    if (NIL != sql_open_statement_p(statement)) {
		rs_$16 = sqls_execute_query(statement, cconcatenate($str408$SELECT___FROM_, table), UNPROVIDED);
	    } else {
		rs_$16 = statement;
	    }
	    if (NIL != sql_result_set_p(rs_$16)) {
		while (NIL != sqlrs_next(rs_$16)) {
		    col = ZERO_INTEGER;
		    while (!col.numE(number_utilities.f_1_(sqlrs_column_count(rs_$16)))) {
			col = add(col, ONE_INTEGER);
			princ(sqlrs_get_object(rs_$16, col), stream);
			princ(CHAR_tab, stream);
		    }
		    col = add(col, ONE_INTEGER);
		    princ(sqlrs_get_object(rs_$16, col), stream);
		    terpri(stream);
		}
	    }
	} finally {
	    final SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
	    try {
		bind($is_thread_performing_cleanupP$, T);
		final SubLObject _values = getValuesAsVector();
		if (NIL != sql_connection_p(connection)) {
		    sqlc_close(connection);
		}
		restoreValuesFromVector(_values);
	    } finally {
		rebind($is_thread_performing_cleanupP$, _prev_bind_0);
	    }
	}
	return rs;
    }

    /**
    * Writes the entire contents of TABLE in DB to STREAM in a tab separated format
    *
    * @param TABLE
    * 		stringp; the table to be exported
    * @param DB
    * 		stringp; the database which hosts TABLE
    * @param USER
    * 		stringp; the user
    * @param PASSWORD
    * 		stringp; the password for USER
    * @param STREAM
    * 		streamp; the stream to write to
    * @param DBMS-SERVER
    * 		stringp; the server on which the DBMS is hosted
    * @param PORT
    * 		positive-integer-p; the port on the the proxy server runs
    * @param SUBPROTOCOL
    * 		stringp; the dbms's  subprotocol
    * @param PROXY-SERVER
    * 		the server of the proxy
    * @return sql-result-set-p or sdbc-error
    */

    public static final SubLObject sdbc_test_alt(SubLObject db, SubLObject user, SubLObject password, SubLObject dbms_server, SubLObject port, SubLObject subprotocol, SubLObject proxy_server, SubLObject table) {
	if (dbms_server == UNPROVIDED) {
	    dbms_server = $dbms_server$.getGlobalValue();
	}
	if (port == UNPROVIDED) {
	    port = $sql_port$.getGlobalValue();
	}
	if (subprotocol == UNPROVIDED) {
	    subprotocol = $sql_subprotocol$.getGlobalValue();
	}
	if (proxy_server == UNPROVIDED) {
	    proxy_server = dbms_server;
	}
	if (table == UNPROVIDED) {
	    table = string_utilities.split_string(Environment.machine_instance(), $list_alt317).first();
	}
	return makeBoolean(((NIL != sdbc_test_created(db, user, password, dbms_server, port, subprotocol, proxy_server, table)) && (NIL != sdbc_test_prepared(db, user, password, dbms_server, port, subprotocol, proxy_server, table)))
		&& (NIL != sdbc_test_batch(db, user, password, dbms_server, port, subprotocol, proxy_server, table)));
    }

    public static SubLObject sdbc_test(final SubLObject db, final SubLObject user, final SubLObject password, SubLObject dbms_server, SubLObject port, SubLObject subprotocol, SubLObject proxy_server, SubLObject table) {
	if (dbms_server == UNPROVIDED) {
	    dbms_server = $dbms_server$.getGlobalValue();
	}
	if (port == UNPROVIDED) {
	    port = $sql_port$.getGlobalValue();
	}
	if (subprotocol == UNPROVIDED) {
	    subprotocol = $sql_subprotocol$.getGlobalValue();
	}
	if (proxy_server == UNPROVIDED) {
	    proxy_server = dbms_server;
	}
	if (table == UNPROVIDED) {
	    table = string_utilities.split_string(Environment.machine_instance(), $list409).first();
	}
	return makeBoolean(((NIL != sdbc_test_created(db, user, password, dbms_server, port, subprotocol, proxy_server, table)) && (NIL != sdbc_test_prepared(db, user, password, dbms_server, port, subprotocol, proxy_server, table)))
		&& (NIL != sdbc_test_batch(db, user, password, dbms_server, port, subprotocol, proxy_server, table)));
    }

    /**
     *
     *
     * @param DB
     * 		stringp; the name of the SQL database
     * @param USER
    stringp;
     * 		
     * @param PASSWORD
    stringp;
     * 		
     * @param TABLE
     * 		stringp; the name of a (temporary) table used to test the sdbc
     * @return boolean; t if the test succeeds, nil otherwise
     */
    @LispMethod(comment = "@param DB\r\n\t\tstringp; the name of the SQL database\r\n@param USER\nstringp;\r\n\t\t\r\n@param PASSWORD\nstringp;\r\n\t\t\r\n@param TABLE\r\n\t\tstringp; the name of a (temporary) table used to test the sdbc\r\n@return boolean; t if the test succeeds, nil otherwise")
    public static final SubLObject sdbc_test_prepared_alt(SubLObject db, SubLObject user, SubLObject password, SubLObject dbms_server, SubLObject port, SubLObject subprotocol, SubLObject proxy_server, SubLObject table) {
	if (dbms_server == UNPROVIDED) {
	    dbms_server = $dbms_server$.getGlobalValue();
	}
	if (port == UNPROVIDED) {
	    port = $sql_port$.getGlobalValue();
	}
	if (subprotocol == UNPROVIDED) {
	    subprotocol = $sql_subprotocol$.getGlobalValue();
	}
	if (proxy_server == UNPROVIDED) {
	    proxy_server = dbms_server;
	}
	if (table == UNPROVIDED) {
	    table = string_utilities.split_string(Environment.machine_instance(), $list_alt317).first();
	}
	{
	    SubLObject c = NIL;
	    SubLObject s = NIL;
	    SubLObject insert = NIL;
	    SubLObject select = NIL;
	    SubLObject passP = NIL;
	    SubLObject rs = NIL;
	    SubLObject result = NIL;
	    try {
		c = new_sql_connection(db, user, password, list(new SubLObject[] { $DBMS_SERVER, dbms_server, $PORT, port, $SUBPROTOCOL, subprotocol, $PROXY_SERVER, proxy_server, $TIMEOUT, $sql_connection_timeout$.getGlobalValue() }));
		s = sqlc_create_statement(c);
		insert = sqlc_prepare_statement(c, format(NIL, $str_alt318$INSERT_INTO__a_VALUES______, table));
		select = sqlc_prepare_statement(c, format(NIL, $str_alt319$SELECT_number2_FROM__a_WHERE_numb, table));
		passP = T;
		sqls_execute_update(s, cconcatenate($str_alt320$CREATE_TABLE_, new SubLObject[] { table, $str_alt321$__number1_INT_PRIMARY_KEY__number }));
		{
		    SubLObject i = NIL;
		    for (i = ZERO_INTEGER; i.numL($sdbc_test_row_cardinality$.getGlobalValue()); i = add(i, ONE_INTEGER)) {
			sqlps_set_int(insert, ONE_INTEGER, i);
			sqlps_set_int(insert, TWO_INTEGER, i);
			sqlps_execute_update(insert);
		    }
		}
		{
		    SubLObject i = NIL;
		    for (i = ZERO_INTEGER; i.numL($sdbc_test_row_cardinality$.getGlobalValue()); i = add(i, ONE_INTEGER)) {
			sqlps_set_int(select, ONE_INTEGER, i);
			rs = sqlps_execute_query(select, UNPROVIDED);
			sqlrs_next(rs);
			result = sqlrs_get_object(rs, ONE_INTEGER);
			passP = makeBoolean((NIL != passP) && result.eql(i));
			if (!result.eql(i)) {
			    Errors.warn($str_alt322$validation_failed_for__a__result_, i, result);
			}
		    }
		}
		sqls_execute_update(s, cconcatenate($str_alt323$DROP_TABLE_, table));
	    } finally {
		{
		    SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
		    try {
			bind($is_thread_performing_cleanupP$, T);
			if (NIL != sql_connection_p(c)) {
			    sqlc_close(c);
			}
		    } finally {
			rebind($is_thread_performing_cleanupP$, _prev_bind_0);
		    }
		}
	    }
	    return passP;
	}
    }

    /**
     *
     *
     * @param DB
     * 		stringp; the name of the SQL database
     * @param USER
    stringp;
     * 		
     * @param PASSWORD
    stringp;
     * 		
     * @param TABLE
     * 		stringp; the name of a (temporary) table used to test the sdbc
     * @return boolean; t if the test succeeds, nil otherwise
     */
    @LispMethod(comment = "@param DB\r\n\t\tstringp; the name of the SQL database\r\n@param USER\nstringp;\r\n\t\t\r\n@param PASSWORD\nstringp;\r\n\t\t\r\n@param TABLE\r\n\t\tstringp; the name of a (temporary) table used to test the sdbc\r\n@return boolean; t if the test succeeds, nil otherwise")
    public static SubLObject sdbc_test_prepared(final SubLObject db, final SubLObject user, final SubLObject password, SubLObject dbms_server, SubLObject port, SubLObject subprotocol, SubLObject proxy_server, SubLObject table) {
	if (dbms_server == UNPROVIDED) {
	    dbms_server = $dbms_server$.getGlobalValue();
	}
	if (port == UNPROVIDED) {
	    port = $sql_port$.getGlobalValue();
	}
	if (subprotocol == UNPROVIDED) {
	    subprotocol = $sql_subprotocol$.getGlobalValue();
	}
	if (proxy_server == UNPROVIDED) {
	    proxy_server = dbms_server;
	}
	if (table == UNPROVIDED) {
	    table = string_utilities.split_string(Environment.machine_instance(), $list409).first();
	}
	SubLObject c = NIL;
	SubLObject s = NIL;
	SubLObject insert = NIL;
	SubLObject select = NIL;
	SubLObject passP = NIL;
	SubLObject rs = NIL;
	SubLObject result = NIL;
	try {
	    c = new_sql_connection(db, user, password, list(new SubLObject[] { $DBMS_SERVER, dbms_server, $PORT, port, $SUBPROTOCOL, subprotocol, $PROXY_SERVER, proxy_server, $TIMEOUT, $sql_connection_timeout$.getGlobalValue() }));
	    s = sqlc_create_statement(c);
	    insert = sqlc_prepare_statement(c, format(NIL, $str410$INSERT_INTO__a_VALUES______, table));
	    select = sqlc_prepare_statement(c, format(NIL, $str411$SELECT_number2_FROM__a_WHERE_numb, table));
	    passP = T;
	    sqls_execute_update(s, cconcatenate($$$CREATE_TABLE_, new SubLObject[] { table, $str413$__number1_INT_PRIMARY_KEY__number }));
	    SubLObject i;
	    for (i = NIL, i = ZERO_INTEGER; i.numL($sdbc_test_row_cardinality$.getGlobalValue()); i = add(i, ONE_INTEGER)) {
		sqlps_set_int(insert, ONE_INTEGER, i);
		sqlps_set_int(insert, TWO_INTEGER, i);
		sqlps_execute_update(insert);
	    }
	    for (i = NIL, i = ZERO_INTEGER; i.numL($sdbc_test_row_cardinality$.getGlobalValue()); i = add(i, ONE_INTEGER)) {
		sqlps_set_int(select, ONE_INTEGER, i);
		rs = sqlps_execute_query(select, UNPROVIDED);
		sqlrs_next(rs);
		result = sqlrs_get_object(rs, ONE_INTEGER);
		passP = makeBoolean((NIL != passP) && result.eql(i));
		if (!result.eql(i)) {
		    Errors.warn($str414$validation_failed_for__a__result_, i, result);
		}
	    }
	    sqls_execute_update(s, cconcatenate($$$DROP_TABLE_, table));
	} finally {
	    final SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
	    try {
		bind($is_thread_performing_cleanupP$, T);
		final SubLObject _values = getValuesAsVector();
		if (NIL != sql_connection_p(c)) {
		    sqlc_close(c);
		}
		restoreValuesFromVector(_values);
	    } finally {
		rebind($is_thread_performing_cleanupP$, _prev_bind_0);
	    }
	}
	return passP;
    }

    /**
     *
     *
     * @param DB
     * 		stringp; the name of the SQL database
     * @param USER
    stringp;
     * 		
     * @param PASSWORD
    stringp;
     * 		
     * @param TABLE
     * 		stringp; the name of a (temporary) table used to test the sdbc
     * @return boolean; t if the test succeeds, nil otherwise
     */
    @LispMethod(comment = "@param DB\r\n\t\tstringp; the name of the SQL database\r\n@param USER\nstringp;\r\n\t\t\r\n@param PASSWORD\nstringp;\r\n\t\t\r\n@param TABLE\r\n\t\tstringp; the name of a (temporary) table used to test the sdbc\r\n@return boolean; t if the test succeeds, nil otherwise")
    public static final SubLObject sdbc_test_created_alt(SubLObject db, SubLObject user, SubLObject password, SubLObject dbms_server, SubLObject port, SubLObject subprotocol, SubLObject proxy_server, SubLObject table) {
	if (dbms_server == UNPROVIDED) {
	    dbms_server = $dbms_server$.getGlobalValue();
	}
	if (port == UNPROVIDED) {
	    port = $sql_port$.getGlobalValue();
	}
	if (subprotocol == UNPROVIDED) {
	    subprotocol = $sql_subprotocol$.getGlobalValue();
	}
	if (proxy_server == UNPROVIDED) {
	    proxy_server = dbms_server;
	}
	if (table == UNPROVIDED) {
	    table = string_utilities.split_string(Environment.machine_instance(), $list_alt317).first();
	}
	{
	    SubLObject passP = T;
	    SubLObject num_string = NIL;
	    SubLObject rs = NIL;
	    SubLObject result = NIL;
	    SubLObject s = NIL;
	    SubLObject connection = NIL;
	    try {
		connection = new_sql_connection(db, user, password, list(new SubLObject[] { $DBMS_SERVER, dbms_server, $PORT, port, $SUBPROTOCOL, subprotocol, $PROXY_SERVER, proxy_server, $TIMEOUT, $sql_connection_timeout$.getGlobalValue() }));
		if (NIL != sql_open_connection_p(connection)) {
		    s = sqlc_create_statement(connection);
		} else {
		    s = connection;
		}
		sqls_execute_update(s, cconcatenate($str_alt320$CREATE_TABLE_, new SubLObject[] { table, $str_alt321$__number1_INT_PRIMARY_KEY__number }));
		{
		    SubLObject i = NIL;
		    for (i = ZERO_INTEGER; i.numL($sdbc_test_row_cardinality$.getGlobalValue()); i = add(i, ONE_INTEGER)) {
			num_string = prin1_to_string(i);
			sqls_execute_update(s, cconcatenate($str_alt324$INSERT_INTO_, new SubLObject[] { table, $str_alt325$_VALUES_, num_string, $str_alt326$__, num_string, $str_alt327$_ }));
		    }
		}
		{
		    SubLObject i = NIL;
		    for (i = ZERO_INTEGER; i.numL($sdbc_test_row_cardinality$.getGlobalValue()); i = add(i, ONE_INTEGER)) {
			rs = sqls_execute_query(s, cconcatenate($str_alt328$SELECT_number2_FROM_, new SubLObject[] { table, $str_alt329$_WHERE_number1___, prin1_to_string(i) }), UNPROVIDED);
			sqlrs_next(rs);
			result = sqlrs_get_object(rs, ONE_INTEGER);
			passP = makeBoolean((NIL != passP) && result.eql(i));
			if (!result.eql(i)) {
			    Errors.warn($str_alt322$validation_failed_for__a__result_, i, result);
			}
		    }
		}
		sqls_execute_update(s, cconcatenate($str_alt323$DROP_TABLE_, table));
	    } finally {
		{
		    SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
		    try {
			bind($is_thread_performing_cleanupP$, T);
			if (NIL != sql_connection_p(connection)) {
			    sqlc_close(connection);
			}
		    } finally {
			rebind($is_thread_performing_cleanupP$, _prev_bind_0);
		    }
		}
	    }
	    return passP;
	}
    }

    /**
     *
     *
     * @param DB
     * 		stringp; the name of the SQL database
     * @param USER
    stringp;
     * 		
     * @param PASSWORD
    stringp;
     * 		
     * @param TABLE
     * 		stringp; the name of a (temporary) table used to test the sdbc
     * @return boolean; t if the test succeeds, nil otherwise
     */
    @LispMethod(comment = "@param DB\r\n\t\tstringp; the name of the SQL database\r\n@param USER\nstringp;\r\n\t\t\r\n@param PASSWORD\nstringp;\r\n\t\t\r\n@param TABLE\r\n\t\tstringp; the name of a (temporary) table used to test the sdbc\r\n@return boolean; t if the test succeeds, nil otherwise")
    public static SubLObject sdbc_test_created(final SubLObject db, final SubLObject user, final SubLObject password, SubLObject dbms_server, SubLObject port, SubLObject subprotocol, SubLObject proxy_server, SubLObject table) {
	if (dbms_server == UNPROVIDED) {
	    dbms_server = $dbms_server$.getGlobalValue();
	}
	if (port == UNPROVIDED) {
	    port = $sql_port$.getGlobalValue();
	}
	if (subprotocol == UNPROVIDED) {
	    subprotocol = $sql_subprotocol$.getGlobalValue();
	}
	if (proxy_server == UNPROVIDED) {
	    proxy_server = dbms_server;
	}
	if (table == UNPROVIDED) {
	    table = string_utilities.split_string(Environment.machine_instance(), $list409).first();
	}
	SubLObject passP = T;
	SubLObject num_string = NIL;
	SubLObject rs = NIL;
	SubLObject result = NIL;
	SubLObject s = NIL;
	SubLObject connection = NIL;
	try {
	    connection = new_sql_connection(db, user, password, list(new SubLObject[] { $DBMS_SERVER, dbms_server, $PORT, port, $SUBPROTOCOL, subprotocol, $PROXY_SERVER, proxy_server, $TIMEOUT, $sql_connection_timeout$.getGlobalValue() }));
	    if (NIL != sql_open_connection_p(connection)) {
		s = sqlc_create_statement(connection);
	    } else {
		s = connection;
	    }
	    sqls_execute_update(s, cconcatenate($$$CREATE_TABLE_, new SubLObject[] { table, $str413$__number1_INT_PRIMARY_KEY__number }));
	    SubLObject i;
	    for (i = NIL, i = ZERO_INTEGER; i.numL($sdbc_test_row_cardinality$.getGlobalValue()); i = add(i, ONE_INTEGER)) {
		num_string = prin1_to_string(i);
		sqls_execute_update(s, cconcatenate($$$INSERT_INTO_, new SubLObject[] { table, $str417$_VALUES_, num_string, $str418$__, num_string, $str419$_ }));
	    }
	    for (i = NIL, i = ZERO_INTEGER; i.numL($sdbc_test_row_cardinality$.getGlobalValue()); i = add(i, ONE_INTEGER)) {
		rs = sqls_execute_query(s, cconcatenate($$$SELECT_number2_FROM_, new SubLObject[] { table, $str421$_WHERE_number1___, prin1_to_string(i) }), UNPROVIDED);
		sqlrs_next(rs);
		result = sqlrs_get_object(rs, ONE_INTEGER);
		passP = makeBoolean((NIL != passP) && result.eql(i));
		if (!result.eql(i)) {
		    Errors.warn($str414$validation_failed_for__a__result_, i, result);
		}
	    }
	    sqls_execute_update(s, cconcatenate($$$DROP_TABLE_, table));
	} finally {
	    final SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
	    try {
		bind($is_thread_performing_cleanupP$, T);
		final SubLObject _values = getValuesAsVector();
		if (NIL != sql_connection_p(connection)) {
		    sqlc_close(connection);
		}
		restoreValuesFromVector(_values);
	    } finally {
		rebind($is_thread_performing_cleanupP$, _prev_bind_0);
	    }
	}
	return passP;
    }

    /**
     *
     *
     * @param DB
     * 		stringp; the name of the SQL database
     * @param USER
    stringp;
     * 		
     * @param PASSWORD
    stringp;
     * 		
     * @param TABLE
     * 		stringp; the name of a (temporary) table used to test the sdbc
     * @return boolean; t if the test succeeds, nil otherwise
     */
    @LispMethod(comment = "@param DB\r\n\t\tstringp; the name of the SQL database\r\n@param USER\nstringp;\r\n\t\t\r\n@param PASSWORD\nstringp;\r\n\t\t\r\n@param TABLE\r\n\t\tstringp; the name of a (temporary) table used to test the sdbc\r\n@return boolean; t if the test succeeds, nil otherwise")
    public static final SubLObject sdbc_test_batch_alt(SubLObject db, SubLObject user, SubLObject password, SubLObject dbms_server, SubLObject port, SubLObject subprotocol, SubLObject proxy_server, SubLObject table) {
	if (dbms_server == UNPROVIDED) {
	    dbms_server = $dbms_server$.getGlobalValue();
	}
	if (port == UNPROVIDED) {
	    port = $sql_port$.getGlobalValue();
	}
	if (subprotocol == UNPROVIDED) {
	    subprotocol = $sql_subprotocol$.getGlobalValue();
	}
	if (proxy_server == UNPROVIDED) {
	    proxy_server = dbms_server;
	}
	if (table == UNPROVIDED) {
	    table = string_utilities.split_string(Environment.machine_instance(), $list_alt317).first();
	}
	{
	    SubLObject passP = T;
	    SubLObject num_string = NIL;
	    SubLObject rs = NIL;
	    SubLObject result = NIL;
	    SubLObject s = NIL;
	    SubLObject connection = NIL;
	    try {
		connection = new_sql_connection(db, user, password, list(new SubLObject[] { $DBMS_SERVER, dbms_server, $PORT, port, $SUBPROTOCOL, subprotocol, $PROXY_SERVER, proxy_server, $TIMEOUT, $sql_connection_timeout$.getGlobalValue() }));
		if (NIL != sql_open_connection_p(connection)) {
		    s = sqlc_create_statement(connection);
		} else {
		    s = connection;
		}
		sqls_execute_update(s, cconcatenate($str_alt320$CREATE_TABLE_, new SubLObject[] { table, $str_alt321$__number1_INT_PRIMARY_KEY__number }));
		{
		    SubLObject i = NIL;
		    for (i = ZERO_INTEGER; i.numL($sdbc_test_row_cardinality$.getGlobalValue()); i = add(i, ONE_INTEGER)) {
			num_string = prin1_to_string(i);
			sqls_add_batch(s, cconcatenate($str_alt324$INSERT_INTO_, new SubLObject[] { table, $str_alt325$_VALUES_, num_string, $str_alt326$__, num_string, $str_alt327$_ }));
		    }
		}
		sqls_execute_batch(s);
		{
		    SubLObject i = NIL;
		    for (i = ZERO_INTEGER; i.numL($sdbc_test_row_cardinality$.getGlobalValue()); i = add(i, ONE_INTEGER)) {
			rs = sqls_execute_query(s, cconcatenate($str_alt328$SELECT_number2_FROM_, new SubLObject[] { table, $str_alt329$_WHERE_number1___, prin1_to_string(i) }), UNPROVIDED);
			sqlrs_next(rs);
			result = sqlrs_get_object(rs, ONE_INTEGER);
			passP = makeBoolean((NIL != passP) && result.eql(i));
			if (!result.eql(i)) {
			    Errors.warn($str_alt322$validation_failed_for__a__result_, i, result);
			}
		    }
		}
		sqls_execute_update(s, cconcatenate($str_alt323$DROP_TABLE_, table));
	    } finally {
		{
		    SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
		    try {
			bind($is_thread_performing_cleanupP$, T);
			if (NIL != sql_connection_p(connection)) {
			    sqlc_close(connection);
			}
		    } finally {
			rebind($is_thread_performing_cleanupP$, _prev_bind_0);
		    }
		}
	    }
	    return passP;
	}
    }

    /**
     *
     *
     * @param DB
     * 		stringp; the name of the SQL database
     * @param USER
    stringp;
     * 		
     * @param PASSWORD
    stringp;
     * 		
     * @param TABLE
     * 		stringp; the name of a (temporary) table used to test the sdbc
     * @return boolean; t if the test succeeds, nil otherwise
     */
    @LispMethod(comment = "@param DB\r\n\t\tstringp; the name of the SQL database\r\n@param USER\nstringp;\r\n\t\t\r\n@param PASSWORD\nstringp;\r\n\t\t\r\n@param TABLE\r\n\t\tstringp; the name of a (temporary) table used to test the sdbc\r\n@return boolean; t if the test succeeds, nil otherwise")
    public static SubLObject sdbc_test_batch(final SubLObject db, final SubLObject user, final SubLObject password, SubLObject dbms_server, SubLObject port, SubLObject subprotocol, SubLObject proxy_server, SubLObject table) {
	if (dbms_server == UNPROVIDED) {
	    dbms_server = $dbms_server$.getGlobalValue();
	}
	if (port == UNPROVIDED) {
	    port = $sql_port$.getGlobalValue();
	}
	if (subprotocol == UNPROVIDED) {
	    subprotocol = $sql_subprotocol$.getGlobalValue();
	}
	if (proxy_server == UNPROVIDED) {
	    proxy_server = dbms_server;
	}
	if (table == UNPROVIDED) {
	    table = string_utilities.split_string(Environment.machine_instance(), $list409).first();
	}
	SubLObject passP = T;
	SubLObject num_string = NIL;
	SubLObject rs = NIL;
	SubLObject result = NIL;
	SubLObject s = NIL;
	SubLObject connection = NIL;
	try {
	    connection = new_sql_connection(db, user, password, list(new SubLObject[] { $DBMS_SERVER, dbms_server, $PORT, port, $SUBPROTOCOL, subprotocol, $PROXY_SERVER, proxy_server, $TIMEOUT, $sql_connection_timeout$.getGlobalValue() }));
	    if (NIL != sql_open_connection_p(connection)) {
		s = sqlc_create_statement(connection);
	    } else {
		s = connection;
	    }
	    sqls_execute_update(s, cconcatenate($$$CREATE_TABLE_, new SubLObject[] { table, $str413$__number1_INT_PRIMARY_KEY__number }));
	    SubLObject i;
	    for (i = NIL, i = ZERO_INTEGER; i.numL($sdbc_test_row_cardinality$.getGlobalValue()); i = add(i, ONE_INTEGER)) {
		num_string = prin1_to_string(i);
		sqls_add_batch(s, cconcatenate($$$INSERT_INTO_, new SubLObject[] { table, $str417$_VALUES_, num_string, $str418$__, num_string, $str419$_ }));
	    }
	    sqls_execute_batch(s);
	    for (i = NIL, i = ZERO_INTEGER; i.numL($sdbc_test_row_cardinality$.getGlobalValue()); i = add(i, ONE_INTEGER)) {
		rs = sqls_execute_query(s, cconcatenate($$$SELECT_number2_FROM_, new SubLObject[] { table, $str421$_WHERE_number1___, prin1_to_string(i) }), UNPROVIDED);
		sqlrs_next(rs);
		result = sqlrs_get_object(rs, ONE_INTEGER);
		passP = makeBoolean((NIL != passP) && result.eql(i));
		if (!result.eql(i)) {
		    Errors.warn($str414$validation_failed_for__a__result_, i, result);
		}
	    }
	    sqls_execute_update(s, cconcatenate($$$DROP_TABLE_, table));
	} finally {
	    final SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
	    try {
		bind($is_thread_performing_cleanupP$, T);
		final SubLObject _values = getValuesAsVector();
		if (NIL != sql_connection_p(connection)) {
		    sqlc_close(connection);
		}
		restoreValuesFromVector(_values);
	    } finally {
		rebind($is_thread_performing_cleanupP$, _prev_bind_0);
	    }
	}
	return passP;
    }

    public static final SubLObject declare_sdbc_file_alt() {
	declareFunction("sql_proxy_server_runningP", "SQL-PROXY-SERVER-RUNNING?", 0, 3, false);
	declareFunction("sql_connection_print_function_trampoline", "SQL-CONNECTION-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
	declareFunction("sql_connection_p", "SQL-CONNECTION-P", 1, 0, false);
	new com.cyc.cycjava.cycl.sdbc.$sql_connection_p$UnaryFunction();
	declareFunction("sqlc_db", "SQLC-DB", 1, 0, false);
	declareFunction("sqlc_user", "SQLC-USER", 1, 0, false);
	declareFunction("sqlc_dbms_server", "SQLC-DBMS-SERVER", 1, 0, false);
	declareFunction("sqlc_port", "SQLC-PORT", 1, 0, false);
	declareFunction("sqlc_channel", "SQLC-CHANNEL", 1, 0, false);
	declareFunction("sqlc_statements", "SQLC-STATEMENTS", 1, 0, false);
	declareFunction("sqlc_lock", "SQLC-LOCK", 1, 0, false);
	declareFunction("sqlc_subprotocol", "SQLC-SUBPROTOCOL", 1, 0, false);
	declareFunction("sqlc_proxy_server", "SQLC-PROXY-SERVER", 1, 0, false);
	declareFunction("sqlc_error_handling", "SQLC-ERROR-HANDLING", 1, 0, false);
	declareFunction("sqlc_tickets", "SQLC-TICKETS", 1, 0, false);
	declareFunction("sqlc_mailman", "SQLC-MAILMAN", 1, 0, false);
	declareFunction("_csetf_sqlc_db", "_CSETF-SQLC-DB", 2, 0, false);
	declareFunction("_csetf_sqlc_user", "_CSETF-SQLC-USER", 2, 0, false);
	declareFunction("_csetf_sqlc_dbms_server", "_CSETF-SQLC-DBMS-SERVER", 2, 0, false);
	declareFunction("_csetf_sqlc_port", "_CSETF-SQLC-PORT", 2, 0, false);
	declareFunction("_csetf_sqlc_channel", "_CSETF-SQLC-CHANNEL", 2, 0, false);
	declareFunction("_csetf_sqlc_statements", "_CSETF-SQLC-STATEMENTS", 2, 0, false);
	declareFunction("_csetf_sqlc_lock", "_CSETF-SQLC-LOCK", 2, 0, false);
	declareFunction("_csetf_sqlc_subprotocol", "_CSETF-SQLC-SUBPROTOCOL", 2, 0, false);
	declareFunction("_csetf_sqlc_proxy_server", "_CSETF-SQLC-PROXY-SERVER", 2, 0, false);
	declareFunction("_csetf_sqlc_error_handling", "_CSETF-SQLC-ERROR-HANDLING", 2, 0, false);
	declareFunction("_csetf_sqlc_tickets", "_CSETF-SQLC-TICKETS", 2, 0, false);
	declareFunction("_csetf_sqlc_mailman", "_CSETF-SQLC-MAILMAN", 2, 0, false);
	declareFunction("make_sql_connection", "MAKE-SQL-CONNECTION", 0, 1, false);
	declareFunction("sqlc_print", "SQLC-PRINT", 3, 0, false);
	declareFunction("sqlc_print_string", "SQLC-PRINT-STRING", 1, 0, false);
	declareFunction("new_sql_connection", "NEW-SQL-CONNECTION", 3, 1, false);
	declareFunction("sql_open_connection_p", "SQL-OPEN-CONNECTION-P", 1, 0, false);
	declareFunction("sqlc_open_p", "SQLC-OPEN-P", 1, 0, false);
	declareFunction("sqlc_close", "SQLC-CLOSE", 1, 0, false);
	declareFunction("sqlc_create_statement", "SQLC-CREATE-STATEMENT", 1, 0, false);
	declareFunction("sqlc_prepare_statement", "SQLC-PREPARE-STATEMENT", 2, 0, false);
	declareFunction("sqlc_set_auto_commit", "SQLC-SET-AUTO-COMMIT", 2, 0, false);
	declareFunction("sqlc_get_auto_commit", "SQLC-GET-AUTO-COMMIT", 1, 0, false);
	declareFunction("sqlc_commit", "SQLC-COMMIT", 1, 0, false);
	declareFunction("sqlc_rollback", "SQLC-ROLLBACK", 1, 0, false);
	declareFunction("sqlc_get_transaction_isolation", "SQLC-GET-TRANSACTION-ISOLATION", 1, 0, false);
	declareFunction("sqlc_set_transaction_isolation", "SQLC-SET-TRANSACTION-ISOLATION", 2, 0, false);
	declareFunction("sql_ticket_print_function_trampoline", "SQL-TICKET-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
	declareFunction("sql_ticket_p", "SQL-TICKET-P", 1, 0, false);
	new com.cyc.cycjava.cycl.sdbc.$sql_ticket_p$UnaryFunction();
	declareFunction("sql_ticket_semaphore", "SQL-TICKET-SEMAPHORE", 1, 0, false);
	declareFunction("sql_ticket_result", "SQL-TICKET-RESULT", 1, 0, false);
	declareFunction("_csetf_sql_ticket_semaphore", "_CSETF-SQL-TICKET-SEMAPHORE", 2, 0, false);
	declareFunction("_csetf_sql_ticket_result", "_CSETF-SQL-TICKET-RESULT", 2, 0, false);
	declareFunction("make_sql_ticket", "MAKE-SQL-TICKET", 0, 1, false);
	declareFunction("new_sql_ticket", "NEW-SQL-TICKET", 0, 0, false);
	declareFunction("sql_ticket_retrieve", "SQL-TICKET-RETRIEVE", 1, 0, false);
	declareFunction("launch_sql_mailman", "LAUNCH-SQL-MAILMAN", 1, 0, false);
	declareFunction("sqlc_deliver", "SQLC-DELIVER", 1, 0, false);
	declareFunction("sqlc_execute", "SQLC-EXECUTE", 3, 0, false);
	declareFunction("sqlc_send", "SQLC-SEND", 4, 0, false);
	declareFunction("sqlc_receive", "SQLC-RECEIVE", 1, 0, false);
	declareFunction("sqlc_handle_error", "SQLC-HANDLE-ERROR", 2, 0, false);
	declareFunction("sql_transaction_level_p", "SQL-TRANSACTION-LEVEL-P", 1, 0, false);
	declareFunction("sqlc_set_error_handling", "SQLC-SET-ERROR-HANDLING", 2, 0, false);
	declareFunction("new_sql_response", "NEW-SQL-RESPONSE", 2, 0, false);
	declareFunction("sql_response_code", "SQL-RESPONSE-CODE", 1, 0, false);
	declareFunction("sql_response_value", "SQL-RESPONSE-VALUE", 1, 0, false);
	declareFunction("sql_null_p", "SQL-NULL-P", 1, 0, false);
	declareFunction("sql_true_p", "SQL-TRUE-P", 1, 0, false);
	declareFunction("sql_false_p", "SQL-FALSE-P", 1, 0, false);
	declareFunction("sdbc_error_print_function_trampoline", "SDBC-ERROR-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
	declareFunction("sdbc_error_p", "SDBC-ERROR-P", 1, 0, false);
	new com.cyc.cycjava.cycl.sdbc.$sdbc_error_p$UnaryFunction();
	declareFunction("sdbc_error_type", "SDBC-ERROR-TYPE", 1, 0, false);
	declareFunction("sdbc_error_message", "SDBC-ERROR-MESSAGE", 1, 0, false);
	declareFunction("sdbc_error_code", "SDBC-ERROR-CODE", 1, 0, false);
	declareFunction("_csetf_sdbc_error_type", "_CSETF-SDBC-ERROR-TYPE", 2, 0, false);
	declareFunction("_csetf_sdbc_error_message", "_CSETF-SDBC-ERROR-MESSAGE", 2, 0, false);
	declareFunction("_csetf_sdbc_error_code", "_CSETF-SDBC-ERROR-CODE", 2, 0, false);
	declareFunction("make_sdbc_error", "MAKE-SDBC-ERROR", 0, 1, false);
	declareFunction("sdbc_error_throw", "SDBC-ERROR-THROW", 1, 0, false);
	declareFunction("sdbc_error_warn", "SDBC-ERROR-WARN", 1, 0, false);
	declareFunction("sdbc_server_error_p", "SDBC-SERVER-ERROR-P", 1, 0, false);
	declareFunction("sdbc_client_error_p", "SDBC-CLIENT-ERROR-P", 1, 0, false);
	declareFunction("sdbc_sql_error_p", "SDBC-SQL-ERROR-P", 1, 0, false);
	declareFunction("sdbc_io_error_p", "SDBC-IO-ERROR-P", 1, 0, false);
	declareFunction("sdbc_transaction_error_p", "SDBC-TRANSACTION-ERROR-P", 1, 0, false);
	declareFunction("sdbc_batch_update_error_p", "SDBC-BATCH-UPDATE-ERROR-P", 1, 0, false);
	declareFunction("sdbc_other_error_p", "SDBC-OTHER-ERROR-P", 1, 0, false);
	declareFunction("new_sdbc_error", "NEW-SDBC-ERROR", 2, 1, false);
	declareFunction("sdbc_error_print", "SDBC-ERROR-PRINT", 3, 0, false);
	declareFunction("decode_sdbc_error_code", "DECODE-SDBC-ERROR-CODE", 1, 0, false);
	declareFunction("sql_result_set_print_function_trampoline", "SQL-RESULT-SET-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
	declareFunction("sql_result_set_p", "SQL-RESULT-SET-P", 1, 0, false);
	new com.cyc.cycjava.cycl.sdbc.$sql_result_set_p$UnaryFunction();
	declareFunction("sqlrs_rows", "SQLRS-ROWS", 1, 0, false);
	declareFunction("sqlrs_current", "SQLRS-CURRENT", 1, 0, false);
	declareFunction("sqlrs_last", "SQLRS-LAST", 1, 0, false);
	declareFunction("sqlrs_start", "SQLRS-START", 1, 0, false);
	declareFunction("sqlrs_connection", "SQLRS-CONNECTION", 1, 0, false);
	declareFunction("sqlrs_block_size", "SQLRS-BLOCK-SIZE", 1, 0, false);
	declareFunction("sqlrs_id", "SQLRS-ID", 1, 0, false);
	declareFunction("_csetf_sqlrs_rows", "_CSETF-SQLRS-ROWS", 2, 0, false);
	declareFunction("_csetf_sqlrs_current", "_CSETF-SQLRS-CURRENT", 2, 0, false);
	declareFunction("_csetf_sqlrs_last", "_CSETF-SQLRS-LAST", 2, 0, false);
	declareFunction("_csetf_sqlrs_start", "_CSETF-SQLRS-START", 2, 0, false);
	declareFunction("_csetf_sqlrs_connection", "_CSETF-SQLRS-CONNECTION", 2, 0, false);
	declareFunction("_csetf_sqlrs_block_size", "_CSETF-SQLRS-BLOCK-SIZE", 2, 0, false);
	declareFunction("_csetf_sqlrs_id", "_CSETF-SQLRS-ID", 2, 0, false);
	declareFunction("make_sql_result_set", "MAKE-SQL-RESULT-SET", 0, 1, false);
	declareFunction("sqlrs_print", "SQLRS-PRINT", 3, 0, false);
	declareFunction("sql_open_result_set_p", "SQL-OPEN-RESULT-SET-P", 1, 0, false);
	declareFunction("sqlrs_close", "SQLRS-CLOSE", 1, 0, false);
	declareFunction("sqlrs_emptyP", "SQLRS-EMPTY?", 1, 0, false);
	declareFunction("sqlrs_absolute", "SQLRS-ABSOLUTE", 2, 0, false);
	declareFunction("sqlrs_next", "SQLRS-NEXT", 1, 0, false);
	declareFunction("sqlrs_previous", "SQLRS-PREVIOUS", 1, 0, false);
	declareFunction("sqlrs_is_last", "SQLRS-IS-LAST", 1, 0, false);
	declareFunction("sqlrs_is_first", "SQLRS-IS-FIRST", 1, 0, false);
	declareFunction("sqlrs_column_count", "SQLRS-COLUMN-COUNT", 1, 0, false);
	declareFunction("sqlrs_row_count", "SQLRS-ROW-COUNT", 1, 0, false);
	declareFunction("sqlrs_get_row", "SQLRS-GET-ROW", 1, 0, false);
	declareFunction("sqlrs_get_object", "SQLRS-GET-OBJECT", 2, 0, false);
	declareFunction("sqlrs_get_object_tuple", "SQLRS-GET-OBJECT-TUPLE", 1, 0, false);
	declareFunction("new_sql_result_set", "NEW-SQL-RESULT-SET", 3, 0, false);
	declareFunction("sqlrs_closed_p", "SQLRS-CLOSED-P", 1, 0, false);
	declareFunction("sqlrs_open_p", "SQLRS-OPEN-P", 1, 0, false);
	declareFunction("sqlrs_valid_row_p", "SQLRS-VALID-ROW-P", 1, 0, false);
	declareFunction("sqlrs_valid_column_p", "SQLRS-VALID-COLUMN-P", 2, 0, false);
	declareFunction("sqlrs_block", "SQLRS-BLOCK", 2, 0, false);
	declareFunction("sqlrs_row_local_p", "SQLRS-ROW-LOCAL-P", 1, 0, false);
	declareFunction("sqlrs_row_remote_p", "SQLRS-ROW-REMOTE-P", 1, 0, false);
	declareFunction("sqlrs_local_close", "SQLRS-LOCAL-CLOSE", 1, 0, false);
	declareFunction("sql_statement_print_function_trampoline", "SQL-STATEMENT-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
	declareFunction("sql_statement_p", "SQL-STATEMENT-P", 1, 0, false);
	new com.cyc.cycjava.cycl.sdbc.$sql_statement_p$UnaryFunction();
	declareFunction("sqls_connection", "SQLS-CONNECTION", 1, 0, false);
	declareFunction("sqls_id", "SQLS-ID", 1, 0, false);
	declareFunction("sqls_sql", "SQLS-SQL", 1, 0, false);
	declareFunction("sqls_settings", "SQLS-SETTINGS", 1, 0, false);
	declareFunction("sqls_batch", "SQLS-BATCH", 1, 0, false);
	declareFunction("sqls_rs", "SQLS-RS", 1, 0, false);
	declareFunction("_csetf_sqls_connection", "_CSETF-SQLS-CONNECTION", 2, 0, false);
	declareFunction("_csetf_sqls_id", "_CSETF-SQLS-ID", 2, 0, false);
	declareFunction("_csetf_sqls_sql", "_CSETF-SQLS-SQL", 2, 0, false);
	declareFunction("_csetf_sqls_settings", "_CSETF-SQLS-SETTINGS", 2, 0, false);
	declareFunction("_csetf_sqls_batch", "_CSETF-SQLS-BATCH", 2, 0, false);
	declareFunction("_csetf_sqls_rs", "_CSETF-SQLS-RS", 2, 0, false);
	declareFunction("make_sql_statement", "MAKE-SQL-STATEMENT", 0, 1, false);
	declareFunction("sqls_open_p", "SQLS-OPEN-P", 1, 0, false);
	declareFunction("sql_open_statement_p", "SQL-OPEN-STATEMENT-P", 1, 0, false);
	declareFunction("sqls_execute_query", "SQLS-EXECUTE-QUERY", 2, 1, false);
	declareFunction("sqls_execute_update", "SQLS-EXECUTE-UPDATE", 2, 0, false);
	declareFunction("sqls_cancel", "SQLS-CANCEL", 1, 0, false);
	declareFunction("sqls_get_generated_keys", "SQLS-GET-GENERATED-KEYS", 1, 1, false);
	declareFunction("sqls_close", "SQLS-CLOSE", 1, 0, false);
	declareFunction("sqls_add_batch", "SQLS-ADD-BATCH", 2, 0, false);
	declareFunction("sqls_clear_batch", "SQLS-CLEAR-BATCH", 1, 0, false);
	declareFunction("sqls_execute_batch", "SQLS-EXECUTE-BATCH", 1, 0, false);
	declareFunction("sql_prepared_statement_p", "SQL-PREPARED-STATEMENT-P", 1, 0, false);
	declareFunction("sql_prepared_open_statement_p", "SQL-PREPARED-OPEN-STATEMENT-P", 1, 0, false);
	declareFunction("sqlps_execute_query", "SQLPS-EXECUTE-QUERY", 1, 1, false);
	declareFunction("sqlps_execute_update", "SQLPS-EXECUTE-UPDATE", 1, 0, false);
	declareFunction("sqlps_set_bytes", "SQLPS-SET-BYTES", 3, 0, false);
	declareFunction("sqlps_set_int", "SQLPS-SET-INT", 3, 0, false);
	declareFunction("sqlps_set_long", "SQLPS-SET-LONG", 3, 0, false);
	declareFunction("sqlps_set_float", "SQLPS-SET-FLOAT", 3, 0, false);
	declareFunction("sqlps_set_double", "SQLPS-SET-DOUBLE", 3, 0, false);
	declareFunction("sqlps_set_string", "SQLPS-SET-STRING", 3, 0, false);
	declareFunction("new_sql_statement", "NEW-SQL-STATEMENT", 1, 0, false);
	declareFunction("sqls_get_connection", "SQLS-GET-CONNECTION", 1, 0, false);
	declareFunction("sqls_local_close", "SQLS-LOCAL-CLOSE", 1, 0, false);
	declareFunction("sqlps_set", "SQLPS-SET", 4, 0, false);
	declareFunction("new_sql_prepared_statement", "NEW-SQL-PREPARED-STATEMENT", 2, 0, false);
	declareFunction("new_statement_id", "NEW-STATEMENT-ID", 0, 0, false);
	declareFunction("new_result_set_id", "NEW-RESULT-SET-ID", 0, 0, false);
	declareFunction("sqlc_get_tables", "SQLC-GET-TABLES", 5, 0, false);
	declareFunction("sqlc_get_tables_meta_data", "SQLC-GET-TABLES-META-DATA", 5, 0, false);
	declareFunction("sqlc_get_columns", "SQLC-GET-COLUMNS", 5, 0, false);
	declareFunction("sqlc_get_columns_meta_data", "SQLC-GET-COLUMNS-META-DATA", 5, 0, false);
	declareFunction("sqlc_get_primary_keys", "SQLC-GET-PRIMARY-KEYS", 4, 0, false);
	declareFunction("sqlc_get_primary_keys_meta_data", "SQLC-GET-PRIMARY-KEYS-META-DATA", 4, 0, false);
	declareFunction("sqlc_get_imported_keys", "SQLC-GET-IMPORTED-KEYS", 4, 0, false);
	declareFunction("sqlc_get_imported_keys_meta_data", "SQLC-GET-IMPORTED-KEYS-META-DATA", 4, 0, false);
	declareFunction("sqlc_get_exported_keys", "SQLC-GET-EXPORTED-KEYS", 4, 0, false);
	declareFunction("sqlc_get_exported_keys_meta_data", "SQLC-GET-EXPORTED-KEYS-META-DATA", 4, 0, false);
	declareFunction("sqlc_get_index_info", "SQLC-GET-INDEX-INFO", 6, 0, false);
	declareFunction("sqlc_get_index_info_meta_data", "SQLC-GET-INDEX-INFO-META-DATA", 6, 0, false);
	declareFunction("sqlc_get_max_connections", "SQLC-GET-MAX-CONNECTIONS", 1, 0, false);
	declareFunction("sdbc_error_handling_tag_p", "SDBC-ERROR-HANDLING-TAG-P", 1, 0, false);
	declareFunction("new_db_url", "NEW-DB-URL", 5, 0, false);
	declareFunction("java_integerp", "JAVA-INTEGERP", 1, 0, false);
	declareFunction("java_longp", "JAVA-LONGP", 1, 0, false);
	declareFunction("java_floatp", "JAVA-FLOATP", 1, 0, false);
	declareFunction("java_doublep", "JAVA-DOUBLEP", 1, 0, false);
	declareMacro("with_sql_connection", "WITH-SQL-CONNECTION");
	declareMacro("with_sql_statement", "WITH-SQL-STATEMENT");
	declareMacro("with_prepared_sql_statement", "WITH-PREPARED-SQL-STATEMENT");
	declareMacro("sqls_execute_transaction", "SQLS-EXECUTE-TRANSACTION");
	declareFunction("sqls_handle_commit_error", "SQLS-HANDLE-COMMIT-ERROR", 1, 0, false);
	declareFunction("sqls_handle_rollback", "SQLS-HANDLE-ROLLBACK", 1, 0, false);
	declareFunction("sqls_handle_transaction_errors", "SQLS-HANDLE-TRANSACTION-ERRORS", 1, 0, false);
	declareMacro("with_sql_transaction", "WITH-SQL-TRANSACTION");
	declareMacro("with_sql_result_set", "WITH-SQL-RESULT-SET");
	declareMacro("do_sql_result_set", "DO-SQL-RESULT-SET");
	declareFunction("sql_export", "SQL-EXPORT", 4, 5, false);
	declareFunction("sdbc_test", "SDBC-TEST", 3, 5, false);
	declareFunction("sdbc_test_prepared", "SDBC-TEST-PREPARED", 3, 5, false);
	declareFunction("sdbc_test_created", "SDBC-TEST-CREATED", 3, 5, false);
	declareFunction("sdbc_test_batch", "SDBC-TEST-BATCH", 3, 5, false);
	return NIL;
    }

    public static SubLObject declare_sdbc_file() {
	if (SubLFiles.USE_V1) {
	    declareFunction("sql_proxy_server_runningP", "SQL-PROXY-SERVER-RUNNING?", 0, 3, false);
	    declareFunction("sql_connection_print_function_trampoline", "SQL-CONNECTION-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
	    declareFunction("sql_connection_p", "SQL-CONNECTION-P", 1, 0, false);
	    new sdbc.$sql_connection_p$UnaryFunction();
	    declareFunction("sqlc_db", "SQLC-DB", 1, 0, false);
	    declareFunction("sqlc_user", "SQLC-USER", 1, 0, false);
	    declareFunction("sqlc_dbms_server", "SQLC-DBMS-SERVER", 1, 0, false);
	    declareFunction("sqlc_port", "SQLC-PORT", 1, 0, false);
	    declareFunction("sqlc_channel", "SQLC-CHANNEL", 1, 0, false);
	    declareFunction("sqlc_statements", "SQLC-STATEMENTS", 1, 0, false);
	    declareFunction("sqlc_lock", "SQLC-LOCK", 1, 0, false);
	    declareFunction("sqlc_subprotocol", "SQLC-SUBPROTOCOL", 1, 0, false);
	    declareFunction("sqlc_proxy_server", "SQLC-PROXY-SERVER", 1, 0, false);
	    declareFunction("sqlc_error_handling", "SQLC-ERROR-HANDLING", 1, 0, false);
	    declareFunction("sqlc_tickets", "SQLC-TICKETS", 1, 0, false);
	    declareFunction("sqlc_mailman", "SQLC-MAILMAN", 1, 0, false);
	    declareFunction("_csetf_sqlc_db", "_CSETF-SQLC-DB", 2, 0, false);
	    declareFunction("_csetf_sqlc_user", "_CSETF-SQLC-USER", 2, 0, false);
	    declareFunction("_csetf_sqlc_dbms_server", "_CSETF-SQLC-DBMS-SERVER", 2, 0, false);
	    declareFunction("_csetf_sqlc_port", "_CSETF-SQLC-PORT", 2, 0, false);
	    declareFunction("_csetf_sqlc_channel", "_CSETF-SQLC-CHANNEL", 2, 0, false);
	    declareFunction("_csetf_sqlc_statements", "_CSETF-SQLC-STATEMENTS", 2, 0, false);
	    declareFunction("_csetf_sqlc_lock", "_CSETF-SQLC-LOCK", 2, 0, false);
	    declareFunction("_csetf_sqlc_subprotocol", "_CSETF-SQLC-SUBPROTOCOL", 2, 0, false);
	    declareFunction("_csetf_sqlc_proxy_server", "_CSETF-SQLC-PROXY-SERVER", 2, 0, false);
	    declareFunction("_csetf_sqlc_error_handling", "_CSETF-SQLC-ERROR-HANDLING", 2, 0, false);
	    declareFunction("_csetf_sqlc_tickets", "_CSETF-SQLC-TICKETS", 2, 0, false);
	    declareFunction("_csetf_sqlc_mailman", "_CSETF-SQLC-MAILMAN", 2, 0, false);
	    declareFunction("make_sql_connection", "MAKE-SQL-CONNECTION", 0, 1, false);
	    declareFunction("visit_defstruct_sql_connection", "VISIT-DEFSTRUCT-SQL-CONNECTION", 2, 0, false);
	    declareFunction("visit_defstruct_object_sql_connection_method", "VISIT-DEFSTRUCT-OBJECT-SQL-CONNECTION-METHOD", 2, 0, false);
	    declareFunction("sqlc_print", "SQLC-PRINT", 3, 0, false);
	    declareFunction("sqlc_print_string", "SQLC-PRINT-STRING", 1, 0, false);
	    declareFunction("new_sql_connection", "NEW-SQL-CONNECTION", 3, 1, false);
	    declareFunction("sql_open_connection_p", "SQL-OPEN-CONNECTION-P", 1, 0, false);
	    declareFunction("sqlc_open_p", "SQLC-OPEN-P", 1, 0, false);
	    declareFunction("sqlc_close", "SQLC-CLOSE", 1, 0, false);
	    declareFunction("sqlc_create_statement", "SQLC-CREATE-STATEMENT", 1, 0, false);
	    declareFunction("sqlc_prepare_statement", "SQLC-PREPARE-STATEMENT", 2, 0, false);
	    declareFunction("sqlc_set_auto_commit", "SQLC-SET-AUTO-COMMIT", 2, 0, false);
	    declareFunction("sqlc_get_auto_commit", "SQLC-GET-AUTO-COMMIT", 1, 0, false);
	    declareFunction("sqlc_commit", "SQLC-COMMIT", 1, 0, false);
	    declareFunction("sqlc_rollback", "SQLC-ROLLBACK", 1, 0, false);
	    declareFunction("sqlc_get_transaction_isolation", "SQLC-GET-TRANSACTION-ISOLATION", 1, 0, false);
	    declareFunction("sqlc_set_transaction_isolation", "SQLC-SET-TRANSACTION-ISOLATION", 2, 0, false);
	    declareFunction("sql_ticket_print_function_trampoline", "SQL-TICKET-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
	    declareFunction("sql_ticket_p", "SQL-TICKET-P", 1, 0, false);
	    new sdbc.$sql_ticket_p$UnaryFunction();
	    declareFunction("sql_ticket_semaphore", "SQL-TICKET-SEMAPHORE", 1, 0, false);
	    declareFunction("sql_ticket_result", "SQL-TICKET-RESULT", 1, 0, false);
	    declareFunction("_csetf_sql_ticket_semaphore", "_CSETF-SQL-TICKET-SEMAPHORE", 2, 0, false);
	    declareFunction("_csetf_sql_ticket_result", "_CSETF-SQL-TICKET-RESULT", 2, 0, false);
	    declareFunction("make_sql_ticket", "MAKE-SQL-TICKET", 0, 1, false);
	    declareFunction("visit_defstruct_sql_ticket", "VISIT-DEFSTRUCT-SQL-TICKET", 2, 0, false);
	    declareFunction("visit_defstruct_object_sql_ticket_method", "VISIT-DEFSTRUCT-OBJECT-SQL-TICKET-METHOD", 2, 0, false);
	    declareFunction("new_sql_ticket", "NEW-SQL-TICKET", 0, 0, false);
	    declareFunction("sql_ticket_retrieve", "SQL-TICKET-RETRIEVE", 1, 0, false);
	    declareFunction("launch_sql_mailman", "LAUNCH-SQL-MAILMAN", 1, 0, false);
	    declareFunction("sqlc_deliver", "SQLC-DELIVER", 1, 0, false);
	    declareFunction("sqlc_execute", "SQLC-EXECUTE", 3, 0, false);
	    declareFunction("sqlc_send", "SQLC-SEND", 4, 0, false);
	    declareFunction("sqlc_receive", "SQLC-RECEIVE", 1, 0, false);
	    declareFunction("sqlc_handle_error", "SQLC-HANDLE-ERROR", 2, 0, false);
	    declareFunction("sql_transaction_level_p", "SQL-TRANSACTION-LEVEL-P", 1, 0, false);
	    declareFunction("sqlc_set_error_handling", "SQLC-SET-ERROR-HANDLING", 2, 0, false);
	    declareFunction("new_sql_response", "NEW-SQL-RESPONSE", 2, 0, false);
	    declareFunction("sql_response_code", "SQL-RESPONSE-CODE", 1, 0, false);
	    declareFunction("sql_response_value", "SQL-RESPONSE-VALUE", 1, 0, false);
	    declareFunction("sql_null_p", "SQL-NULL-P", 1, 0, false);
	    declareFunction("sql_true_p", "SQL-TRUE-P", 1, 0, false);
	    declareFunction("sql_false_p", "SQL-FALSE-P", 1, 0, false);
	    declareFunction("sdbc_error_print_function_trampoline", "SDBC-ERROR-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
	    declareFunction("sdbc_error_p", "SDBC-ERROR-P", 1, 0, false);
	    new sdbc.$sdbc_error_p$UnaryFunction();
	    declareFunction("sdbc_error_type", "SDBC-ERROR-TYPE", 1, 0, false);
	    declareFunction("sdbc_error_message", "SDBC-ERROR-MESSAGE", 1, 0, false);
	    declareFunction("sdbc_error_code", "SDBC-ERROR-CODE", 1, 0, false);
	    declareFunction("_csetf_sdbc_error_type", "_CSETF-SDBC-ERROR-TYPE", 2, 0, false);
	    declareFunction("_csetf_sdbc_error_message", "_CSETF-SDBC-ERROR-MESSAGE", 2, 0, false);
	    declareFunction("_csetf_sdbc_error_code", "_CSETF-SDBC-ERROR-CODE", 2, 0, false);
	    declareFunction("make_sdbc_error", "MAKE-SDBC-ERROR", 0, 1, false);
	    declareFunction("visit_defstruct_sdbc_error", "VISIT-DEFSTRUCT-SDBC-ERROR", 2, 0, false);
	    declareFunction("visit_defstruct_object_sdbc_error_method", "VISIT-DEFSTRUCT-OBJECT-SDBC-ERROR-METHOD", 2, 0, false);
	    declareFunction("sdbc_error_throw", "SDBC-ERROR-THROW", 1, 0, false);
	    declareFunction("sdbc_error_warn", "SDBC-ERROR-WARN", 1, 0, false);
	    declareFunction("sdbc_server_error_p", "SDBC-SERVER-ERROR-P", 1, 0, false);
	    declareFunction("sdbc_client_error_p", "SDBC-CLIENT-ERROR-P", 1, 0, false);
	    declareFunction("sdbc_sql_error_p", "SDBC-SQL-ERROR-P", 1, 0, false);
	    declareFunction("sdbc_io_error_p", "SDBC-IO-ERROR-P", 1, 0, false);
	    declareFunction("sdbc_transaction_error_p", "SDBC-TRANSACTION-ERROR-P", 1, 0, false);
	    declareFunction("sdbc_batch_update_error_p", "SDBC-BATCH-UPDATE-ERROR-P", 1, 0, false);
	    declareFunction("sdbc_other_error_p", "SDBC-OTHER-ERROR-P", 1, 0, false);
	    declareFunction("new_sdbc_error", "NEW-SDBC-ERROR", 2, 1, false);
	    declareFunction("sdbc_error_print", "SDBC-ERROR-PRINT", 3, 0, false);
	    declareFunction("decode_sdbc_error_code", "DECODE-SDBC-ERROR-CODE", 1, 0, false);
	    declareFunction("sql_result_set_print_function_trampoline", "SQL-RESULT-SET-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
	    declareFunction("sql_result_set_p", "SQL-RESULT-SET-P", 1, 0, false);
	    new sdbc.$sql_result_set_p$UnaryFunction();
	    declareFunction("sqlrs_rows", "SQLRS-ROWS", 1, 0, false);
	    declareFunction("sqlrs_current", "SQLRS-CURRENT", 1, 0, false);
	    declareFunction("sqlrs_last", "SQLRS-LAST", 1, 0, false);
	    declareFunction("sqlrs_start", "SQLRS-START", 1, 0, false);
	    declareFunction("sqlrs_connection", "SQLRS-CONNECTION", 1, 0, false);
	    declareFunction("sqlrs_block_size", "SQLRS-BLOCK-SIZE", 1, 0, false);
	    declareFunction("sqlrs_id", "SQLRS-ID", 1, 0, false);
	    declareFunction("_csetf_sqlrs_rows", "_CSETF-SQLRS-ROWS", 2, 0, false);
	    declareFunction("_csetf_sqlrs_current", "_CSETF-SQLRS-CURRENT", 2, 0, false);
	    declareFunction("_csetf_sqlrs_last", "_CSETF-SQLRS-LAST", 2, 0, false);
	    declareFunction("_csetf_sqlrs_start", "_CSETF-SQLRS-START", 2, 0, false);
	    declareFunction("_csetf_sqlrs_connection", "_CSETF-SQLRS-CONNECTION", 2, 0, false);
	    declareFunction("_csetf_sqlrs_block_size", "_CSETF-SQLRS-BLOCK-SIZE", 2, 0, false);
	    declareFunction("_csetf_sqlrs_id", "_CSETF-SQLRS-ID", 2, 0, false);
	    declareFunction("make_sql_result_set", "MAKE-SQL-RESULT-SET", 0, 1, false);
	    declareFunction("visit_defstruct_sql_result_set", "VISIT-DEFSTRUCT-SQL-RESULT-SET", 2, 0, false);
	    declareFunction("visit_defstruct_object_sql_result_set_method", "VISIT-DEFSTRUCT-OBJECT-SQL-RESULT-SET-METHOD", 2, 0, false);
	    declareFunction("sqlrs_print", "SQLRS-PRINT", 3, 0, false);
	    declareFunction("sql_open_result_set_p", "SQL-OPEN-RESULT-SET-P", 1, 0, false);
	    declareFunction("sqlrs_close", "SQLRS-CLOSE", 1, 0, false);
	    declareFunction("sqlrs_emptyP", "SQLRS-EMPTY?", 1, 0, false);
	    declareFunction("sqlrs_absolute", "SQLRS-ABSOLUTE", 2, 0, false);
	    declareFunction("sqlrs_next", "SQLRS-NEXT", 1, 0, false);
	    declareFunction("sqlrs_previous", "SQLRS-PREVIOUS", 1, 0, false);
	    declareFunction("sqlrs_is_last", "SQLRS-IS-LAST", 1, 0, false);
	    declareFunction("sqlrs_is_first", "SQLRS-IS-FIRST", 1, 0, false);
	    declareFunction("sqlrs_column_count", "SQLRS-COLUMN-COUNT", 1, 0, false);
	    declareFunction("sqlrs_row_count", "SQLRS-ROW-COUNT", 1, 0, false);
	    declareFunction("sqlrs_get_row", "SQLRS-GET-ROW", 1, 0, false);
	    declareFunction("sqlrs_get_object", "SQLRS-GET-OBJECT", 2, 0, false);
	    declareFunction("sqlrs_get_object_tuple", "SQLRS-GET-OBJECT-TUPLE", 1, 0, false);
	    declareFunction("new_sql_result_set", "NEW-SQL-RESULT-SET", 3, 0, false);
	    declareFunction("sqlrs_closed_p", "SQLRS-CLOSED-P", 1, 0, false);
	    declareFunction("sqlrs_open_p", "SQLRS-OPEN-P", 1, 0, false);
	    declareFunction("sqlrs_valid_row_p", "SQLRS-VALID-ROW-P", 1, 0, false);
	    declareFunction("sqlrs_valid_column_p", "SQLRS-VALID-COLUMN-P", 2, 0, false);
	    declareFunction("sqlrs_block", "SQLRS-BLOCK", 2, 0, false);
	    declareFunction("sqlrs_row_local_p", "SQLRS-ROW-LOCAL-P", 1, 0, false);
	    declareFunction("sqlrs_row_remote_p", "SQLRS-ROW-REMOTE-P", 1, 0, false);
	    declareFunction("sqlrs_local_close", "SQLRS-LOCAL-CLOSE", 1, 0, false);
	    declareFunction("sql_statement_print_function_trampoline", "SQL-STATEMENT-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
	    declareFunction("sql_statement_p", "SQL-STATEMENT-P", 1, 0, false);
	    new sdbc.$sql_statement_p$UnaryFunction();
	    declareFunction("sqls_connection", "SQLS-CONNECTION", 1, 0, false);
	    declareFunction("sqls_id", "SQLS-ID", 1, 0, false);
	    declareFunction("sqls_sql", "SQLS-SQL", 1, 0, false);
	    declareFunction("sqls_settings", "SQLS-SETTINGS", 1, 0, false);
	    declareFunction("sqls_batch", "SQLS-BATCH", 1, 0, false);
	    declareFunction("sqls_rs", "SQLS-RS", 1, 0, false);
	    declareFunction("_csetf_sqls_connection", "_CSETF-SQLS-CONNECTION", 2, 0, false);
	    declareFunction("_csetf_sqls_id", "_CSETF-SQLS-ID", 2, 0, false);
	    declareFunction("_csetf_sqls_sql", "_CSETF-SQLS-SQL", 2, 0, false);
	    declareFunction("_csetf_sqls_settings", "_CSETF-SQLS-SETTINGS", 2, 0, false);
	    declareFunction("_csetf_sqls_batch", "_CSETF-SQLS-BATCH", 2, 0, false);
	    declareFunction("_csetf_sqls_rs", "_CSETF-SQLS-RS", 2, 0, false);
	    declareFunction("make_sql_statement", "MAKE-SQL-STATEMENT", 0, 1, false);
	    declareFunction("visit_defstruct_sql_statement", "VISIT-DEFSTRUCT-SQL-STATEMENT", 2, 0, false);
	    declareFunction("visit_defstruct_object_sql_statement_method", "VISIT-DEFSTRUCT-OBJECT-SQL-STATEMENT-METHOD", 2, 0, false);
	    declareFunction("sqls_open_p", "SQLS-OPEN-P", 1, 0, false);
	    declareFunction("sql_open_statement_p", "SQL-OPEN-STATEMENT-P", 1, 0, false);
	    declareFunction("sqls_execute_query", "SQLS-EXECUTE-QUERY", 2, 1, false);
	    declareFunction("sqls_execute_update", "SQLS-EXECUTE-UPDATE", 2, 0, false);
	    declareFunction("sqls_cancel", "SQLS-CANCEL", 1, 0, false);
	    declareFunction("sqls_get_generated_keys", "SQLS-GET-GENERATED-KEYS", 1, 1, false);
	    declareFunction("sqls_close", "SQLS-CLOSE", 1, 0, false);
	    declareFunction("sqls_add_batch", "SQLS-ADD-BATCH", 2, 0, false);
	    declareFunction("sqls_clear_batch", "SQLS-CLEAR-BATCH", 1, 0, false);
	    declareFunction("sqls_execute_batch", "SQLS-EXECUTE-BATCH", 1, 0, false);
	    declareFunction("sql_prepared_statement_p", "SQL-PREPARED-STATEMENT-P", 1, 0, false);
	    declareFunction("sql_prepared_open_statement_p", "SQL-PREPARED-OPEN-STATEMENT-P", 1, 0, false);
	    declareFunction("sqlps_execute_query", "SQLPS-EXECUTE-QUERY", 1, 1, false);
	    declareFunction("sqlps_execute_update", "SQLPS-EXECUTE-UPDATE", 1, 0, false);
	    declareFunction("sqlps_set_bytes", "SQLPS-SET-BYTES", 3, 0, false);
	    declareFunction("sqlps_set_int", "SQLPS-SET-INT", 3, 0, false);
	    declareFunction("sqlps_set_long", "SQLPS-SET-LONG", 3, 0, false);
	    declareFunction("sqlps_set_float", "SQLPS-SET-FLOAT", 3, 0, false);
	    declareFunction("sqlps_set_double", "SQLPS-SET-DOUBLE", 3, 0, false);
	    declareFunction("sqlps_set_string", "SQLPS-SET-STRING", 3, 0, false);
	    declareFunction("new_sql_statement", "NEW-SQL-STATEMENT", 1, 0, false);
	    declareFunction("sqls_get_connection", "SQLS-GET-CONNECTION", 1, 0, false);
	    declareFunction("sqls_local_close", "SQLS-LOCAL-CLOSE", 1, 0, false);
	    declareFunction("sqlps_set", "SQLPS-SET", 4, 0, false);
	    declareFunction("new_sql_prepared_statement", "NEW-SQL-PREPARED-STATEMENT", 2, 0, false);
	    declareFunction("new_statement_id", "NEW-STATEMENT-ID", 0, 0, false);
	    declareFunction("new_result_set_id", "NEW-RESULT-SET-ID", 0, 0, false);
	    declareFunction("sqlc_get_tables", "SQLC-GET-TABLES", 5, 0, false);
	    declareFunction("sqlc_get_tables_meta_data", "SQLC-GET-TABLES-META-DATA", 5, 0, false);
	    declareFunction("sqlc_get_columns", "SQLC-GET-COLUMNS", 5, 0, false);
	    declareFunction("sqlc_get_columns_meta_data", "SQLC-GET-COLUMNS-META-DATA", 5, 0, false);
	    declareFunction("sqlc_get_primary_keys", "SQLC-GET-PRIMARY-KEYS", 4, 0, false);
	    declareFunction("sqlc_get_primary_keys_meta_data", "SQLC-GET-PRIMARY-KEYS-META-DATA", 4, 0, false);
	    declareFunction("sqlc_get_imported_keys", "SQLC-GET-IMPORTED-KEYS", 4, 0, false);
	    declareFunction("sqlc_get_imported_keys_meta_data", "SQLC-GET-IMPORTED-KEYS-META-DATA", 4, 0, false);
	    declareFunction("sqlc_get_exported_keys", "SQLC-GET-EXPORTED-KEYS", 4, 0, false);
	    declareFunction("sqlc_get_exported_keys_meta_data", "SQLC-GET-EXPORTED-KEYS-META-DATA", 4, 0, false);
	    declareFunction("sqlc_get_index_info", "SQLC-GET-INDEX-INFO", 6, 0, false);
	    declareFunction("sqlc_get_index_info_meta_data", "SQLC-GET-INDEX-INFO-META-DATA", 6, 0, false);
	    declareFunction("sqlc_get_max_connections", "SQLC-GET-MAX-CONNECTIONS", 1, 0, false);
	    declareFunction("sdbc_error_handling_tag_p", "SDBC-ERROR-HANDLING-TAG-P", 1, 0, false);
	    declareFunction("new_db_url", "NEW-DB-URL", 5, 1, false);
	    declareFunction("add_sdbc_database_connection_url_description", "ADD-SDBC-DATABASE-CONNECTION-URL-DESCRIPTION", 5, 0, false);
	    declareFunction("get_all_sdbc_database_sub_protocols", "GET-ALL-SDBC-DATABASE-SUB-PROTOCOLS", 0, 0, false);
	    declareFunction("compile_db_conn_url_punctuation_info", "COMPILE-DB-CONN-URL-PUNCTUATION-INFO", 1, 0, false);
	    declareMacro("register_sdbc_database_connection_url_description", "REGISTER-SDBC-DATABASE-CONNECTION-URL-DESCRIPTION");
	    declareFunction("set_sdbc_db2_port", "SET-SDBC-DB2-PORT", 1, 0, false);
	    declareFunction("sdbc_db2_port", "SDBC-DB2-PORT", 0, 0, false);
	    declareFunction("set_sdbc_sybase_iq_port", "SET-SDBC-SYBASE-IQ-PORT", 1, 0, false);
	    declareFunction("sdbc_sybase_iq_port", "SDBC-SYBASE-IQ-PORT", 0, 0, false);
	    declareFunction("construct_new_database_connection_url", "CONSTRUCT-NEW-DATABASE-CONNECTION-URL", 2, 0, false);
	    declareFunction("construct_new_dbconn_url_required", "CONSTRUCT-NEW-DBCONN-URL-REQUIRED", 4, 0, false);
	    declareFunction("resolve_dbconn_url_reference", "RESOLVE-DBCONN-URL-REFERENCE", 3, 0, false);
	    declareFunction("append_dbconn_url_options", "APPEND-DBCONN-URL-OPTIONS", 5, 0, false);
	    declareFunction("write_dbconn_url_punctuation", "WRITE-DBCONN-URL-PUNCTUATION", 3, 0, false);
	    declareFunction("java_integerp", "JAVA-INTEGERP", 1, 0, false);
	    declareFunction("java_longp", "JAVA-LONGP", 1, 0, false);
	    declareFunction("java_floatp", "JAVA-FLOATP", 1, 0, false);
	    declareFunction("java_doublep", "JAVA-DOUBLEP", 1, 0, false);
	    declareMacro("with_sql_connection", "WITH-SQL-CONNECTION");
	    declareMacro("with_sql_statement", "WITH-SQL-STATEMENT");
	    declareMacro("with_prepared_sql_statement", "WITH-PREPARED-SQL-STATEMENT");
	    declareMacro("sqls_execute_transaction", "SQLS-EXECUTE-TRANSACTION");
	    declareFunction("sqls_handle_commit_error", "SQLS-HANDLE-COMMIT-ERROR", 1, 0, false);
	    declareFunction("sqls_handle_rollback", "SQLS-HANDLE-ROLLBACK", 1, 0, false);
	    declareFunction("sqls_handle_transaction_errors", "SQLS-HANDLE-TRANSACTION-ERRORS", 1, 0, false);
	    declareMacro("with_sql_transaction", "WITH-SQL-TRANSACTION");
	    declareMacro("with_sql_result_set", "WITH-SQL-RESULT-SET");
	    declareMacro("do_sql_result_set", "DO-SQL-RESULT-SET");
	    declareFunction("sql_export", "SQL-EXPORT", 4, 5, false);
	    declareFunction("sdbc_test", "SDBC-TEST", 3, 5, false);
	    declareFunction("sdbc_test_prepared", "SDBC-TEST-PREPARED", 3, 5, false);
	    declareFunction("sdbc_test_created", "SDBC-TEST-CREATED", 3, 5, false);
	    declareFunction("sdbc_test_batch", "SDBC-TEST-BATCH", 3, 5, false);
	}
	if (SubLFiles.USE_V2) {
	    declareFunction("new_db_url", "NEW-DB-URL", 5, 0, false);
	}
	return NIL;
    }

    public static SubLObject declare_sdbc_file_Previous() {
	declareFunction("sql_proxy_server_runningP", "SQL-PROXY-SERVER-RUNNING?", 0, 3, false);
	declareFunction("sql_connection_print_function_trampoline", "SQL-CONNECTION-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
	declareFunction("sql_connection_p", "SQL-CONNECTION-P", 1, 0, false);
	new sdbc.$sql_connection_p$UnaryFunction();
	declareFunction("sqlc_db", "SQLC-DB", 1, 0, false);
	declareFunction("sqlc_user", "SQLC-USER", 1, 0, false);
	declareFunction("sqlc_dbms_server", "SQLC-DBMS-SERVER", 1, 0, false);
	declareFunction("sqlc_port", "SQLC-PORT", 1, 0, false);
	declareFunction("sqlc_channel", "SQLC-CHANNEL", 1, 0, false);
	declareFunction("sqlc_statements", "SQLC-STATEMENTS", 1, 0, false);
	declareFunction("sqlc_lock", "SQLC-LOCK", 1, 0, false);
	declareFunction("sqlc_subprotocol", "SQLC-SUBPROTOCOL", 1, 0, false);
	declareFunction("sqlc_proxy_server", "SQLC-PROXY-SERVER", 1, 0, false);
	declareFunction("sqlc_error_handling", "SQLC-ERROR-HANDLING", 1, 0, false);
	declareFunction("sqlc_tickets", "SQLC-TICKETS", 1, 0, false);
	declareFunction("sqlc_mailman", "SQLC-MAILMAN", 1, 0, false);
	declareFunction("_csetf_sqlc_db", "_CSETF-SQLC-DB", 2, 0, false);
	declareFunction("_csetf_sqlc_user", "_CSETF-SQLC-USER", 2, 0, false);
	declareFunction("_csetf_sqlc_dbms_server", "_CSETF-SQLC-DBMS-SERVER", 2, 0, false);
	declareFunction("_csetf_sqlc_port", "_CSETF-SQLC-PORT", 2, 0, false);
	declareFunction("_csetf_sqlc_channel", "_CSETF-SQLC-CHANNEL", 2, 0, false);
	declareFunction("_csetf_sqlc_statements", "_CSETF-SQLC-STATEMENTS", 2, 0, false);
	declareFunction("_csetf_sqlc_lock", "_CSETF-SQLC-LOCK", 2, 0, false);
	declareFunction("_csetf_sqlc_subprotocol", "_CSETF-SQLC-SUBPROTOCOL", 2, 0, false);
	declareFunction("_csetf_sqlc_proxy_server", "_CSETF-SQLC-PROXY-SERVER", 2, 0, false);
	declareFunction("_csetf_sqlc_error_handling", "_CSETF-SQLC-ERROR-HANDLING", 2, 0, false);
	declareFunction("_csetf_sqlc_tickets", "_CSETF-SQLC-TICKETS", 2, 0, false);
	declareFunction("_csetf_sqlc_mailman", "_CSETF-SQLC-MAILMAN", 2, 0, false);
	declareFunction("make_sql_connection", "MAKE-SQL-CONNECTION", 0, 1, false);
	declareFunction("visit_defstruct_sql_connection", "VISIT-DEFSTRUCT-SQL-CONNECTION", 2, 0, false);
	declareFunction("visit_defstruct_object_sql_connection_method", "VISIT-DEFSTRUCT-OBJECT-SQL-CONNECTION-METHOD", 2, 0, false);
	declareFunction("sqlc_print", "SQLC-PRINT", 3, 0, false);
	declareFunction("sqlc_print_string", "SQLC-PRINT-STRING", 1, 0, false);
	declareFunction("new_sql_connection", "NEW-SQL-CONNECTION", 3, 1, false);
	declareFunction("sql_open_connection_p", "SQL-OPEN-CONNECTION-P", 1, 0, false);
	declareFunction("sqlc_open_p", "SQLC-OPEN-P", 1, 0, false);
	declareFunction("sqlc_close", "SQLC-CLOSE", 1, 0, false);
	declareFunction("sqlc_create_statement", "SQLC-CREATE-STATEMENT", 1, 0, false);
	declareFunction("sqlc_prepare_statement", "SQLC-PREPARE-STATEMENT", 2, 0, false);
	declareFunction("sqlc_set_auto_commit", "SQLC-SET-AUTO-COMMIT", 2, 0, false);
	declareFunction("sqlc_get_auto_commit", "SQLC-GET-AUTO-COMMIT", 1, 0, false);
	declareFunction("sqlc_commit", "SQLC-COMMIT", 1, 0, false);
	declareFunction("sqlc_rollback", "SQLC-ROLLBACK", 1, 0, false);
	declareFunction("sqlc_get_transaction_isolation", "SQLC-GET-TRANSACTION-ISOLATION", 1, 0, false);
	declareFunction("sqlc_set_transaction_isolation", "SQLC-SET-TRANSACTION-ISOLATION", 2, 0, false);
	declareFunction("sql_ticket_print_function_trampoline", "SQL-TICKET-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
	declareFunction("sql_ticket_p", "SQL-TICKET-P", 1, 0, false);
	new sdbc.$sql_ticket_p$UnaryFunction();
	declareFunction("sql_ticket_semaphore", "SQL-TICKET-SEMAPHORE", 1, 0, false);
	declareFunction("sql_ticket_result", "SQL-TICKET-RESULT", 1, 0, false);
	declareFunction("_csetf_sql_ticket_semaphore", "_CSETF-SQL-TICKET-SEMAPHORE", 2, 0, false);
	declareFunction("_csetf_sql_ticket_result", "_CSETF-SQL-TICKET-RESULT", 2, 0, false);
	declareFunction("make_sql_ticket", "MAKE-SQL-TICKET", 0, 1, false);
	declareFunction("visit_defstruct_sql_ticket", "VISIT-DEFSTRUCT-SQL-TICKET", 2, 0, false);
	declareFunction("visit_defstruct_object_sql_ticket_method", "VISIT-DEFSTRUCT-OBJECT-SQL-TICKET-METHOD", 2, 0, false);
	declareFunction("new_sql_ticket", "NEW-SQL-TICKET", 0, 0, false);
	declareFunction("sql_ticket_retrieve", "SQL-TICKET-RETRIEVE", 1, 0, false);
	declareFunction("launch_sql_mailman", "LAUNCH-SQL-MAILMAN", 1, 0, false);
	declareFunction("sqlc_deliver", "SQLC-DELIVER", 1, 0, false);
	declareFunction("sqlc_execute", "SQLC-EXECUTE", 3, 0, false);
	declareFunction("sqlc_send", "SQLC-SEND", 4, 0, false);
	declareFunction("sqlc_receive", "SQLC-RECEIVE", 1, 0, false);
	declareFunction("sqlc_handle_error", "SQLC-HANDLE-ERROR", 2, 0, false);
	declareFunction("sql_transaction_level_p", "SQL-TRANSACTION-LEVEL-P", 1, 0, false);
	declareFunction("sqlc_set_error_handling", "SQLC-SET-ERROR-HANDLING", 2, 0, false);
	declareFunction("new_sql_response", "NEW-SQL-RESPONSE", 2, 0, false);
	declareFunction("sql_response_code", "SQL-RESPONSE-CODE", 1, 0, false);
	declareFunction("sql_response_value", "SQL-RESPONSE-VALUE", 1, 0, false);
	declareFunction("sql_null_p", "SQL-NULL-P", 1, 0, false);
	declareFunction("sql_true_p", "SQL-TRUE-P", 1, 0, false);
	declareFunction("sql_false_p", "SQL-FALSE-P", 1, 0, false);
	declareFunction("sdbc_error_print_function_trampoline", "SDBC-ERROR-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
	declareFunction("sdbc_error_p", "SDBC-ERROR-P", 1, 0, false);
	new sdbc.$sdbc_error_p$UnaryFunction();
	declareFunction("sdbc_error_type", "SDBC-ERROR-TYPE", 1, 0, false);
	declareFunction("sdbc_error_message", "SDBC-ERROR-MESSAGE", 1, 0, false);
	declareFunction("sdbc_error_code", "SDBC-ERROR-CODE", 1, 0, false);
	declareFunction("_csetf_sdbc_error_type", "_CSETF-SDBC-ERROR-TYPE", 2, 0, false);
	declareFunction("_csetf_sdbc_error_message", "_CSETF-SDBC-ERROR-MESSAGE", 2, 0, false);
	declareFunction("_csetf_sdbc_error_code", "_CSETF-SDBC-ERROR-CODE", 2, 0, false);
	declareFunction("make_sdbc_error", "MAKE-SDBC-ERROR", 0, 1, false);
	declareFunction("visit_defstruct_sdbc_error", "VISIT-DEFSTRUCT-SDBC-ERROR", 2, 0, false);
	declareFunction("visit_defstruct_object_sdbc_error_method", "VISIT-DEFSTRUCT-OBJECT-SDBC-ERROR-METHOD", 2, 0, false);
	declareFunction("sdbc_error_throw", "SDBC-ERROR-THROW", 1, 0, false);
	declareFunction("sdbc_error_warn", "SDBC-ERROR-WARN", 1, 0, false);
	declareFunction("sdbc_server_error_p", "SDBC-SERVER-ERROR-P", 1, 0, false);
	declareFunction("sdbc_client_error_p", "SDBC-CLIENT-ERROR-P", 1, 0, false);
	declareFunction("sdbc_sql_error_p", "SDBC-SQL-ERROR-P", 1, 0, false);
	declareFunction("sdbc_io_error_p", "SDBC-IO-ERROR-P", 1, 0, false);
	declareFunction("sdbc_transaction_error_p", "SDBC-TRANSACTION-ERROR-P", 1, 0, false);
	declareFunction("sdbc_batch_update_error_p", "SDBC-BATCH-UPDATE-ERROR-P", 1, 0, false);
	declareFunction("sdbc_other_error_p", "SDBC-OTHER-ERROR-P", 1, 0, false);
	declareFunction("new_sdbc_error", "NEW-SDBC-ERROR", 2, 1, false);
	declareFunction("sdbc_error_print", "SDBC-ERROR-PRINT", 3, 0, false);
	declareFunction("decode_sdbc_error_code", "DECODE-SDBC-ERROR-CODE", 1, 0, false);
	declareFunction("sql_result_set_print_function_trampoline", "SQL-RESULT-SET-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
	declareFunction("sql_result_set_p", "SQL-RESULT-SET-P", 1, 0, false);
	new sdbc.$sql_result_set_p$UnaryFunction();
	declareFunction("sqlrs_rows", "SQLRS-ROWS", 1, 0, false);
	declareFunction("sqlrs_current", "SQLRS-CURRENT", 1, 0, false);
	declareFunction("sqlrs_last", "SQLRS-LAST", 1, 0, false);
	declareFunction("sqlrs_start", "SQLRS-START", 1, 0, false);
	declareFunction("sqlrs_connection", "SQLRS-CONNECTION", 1, 0, false);
	declareFunction("sqlrs_block_size", "SQLRS-BLOCK-SIZE", 1, 0, false);
	declareFunction("sqlrs_id", "SQLRS-ID", 1, 0, false);
	declareFunction("_csetf_sqlrs_rows", "_CSETF-SQLRS-ROWS", 2, 0, false);
	declareFunction("_csetf_sqlrs_current", "_CSETF-SQLRS-CURRENT", 2, 0, false);
	declareFunction("_csetf_sqlrs_last", "_CSETF-SQLRS-LAST", 2, 0, false);
	declareFunction("_csetf_sqlrs_start", "_CSETF-SQLRS-START", 2, 0, false);
	declareFunction("_csetf_sqlrs_connection", "_CSETF-SQLRS-CONNECTION", 2, 0, false);
	declareFunction("_csetf_sqlrs_block_size", "_CSETF-SQLRS-BLOCK-SIZE", 2, 0, false);
	declareFunction("_csetf_sqlrs_id", "_CSETF-SQLRS-ID", 2, 0, false);
	declareFunction("make_sql_result_set", "MAKE-SQL-RESULT-SET", 0, 1, false);
	declareFunction("visit_defstruct_sql_result_set", "VISIT-DEFSTRUCT-SQL-RESULT-SET", 2, 0, false);
	declareFunction("visit_defstruct_object_sql_result_set_method", "VISIT-DEFSTRUCT-OBJECT-SQL-RESULT-SET-METHOD", 2, 0, false);
	declareFunction("sqlrs_print", "SQLRS-PRINT", 3, 0, false);
	declareFunction("sql_open_result_set_p", "SQL-OPEN-RESULT-SET-P", 1, 0, false);
	declareFunction("sqlrs_close", "SQLRS-CLOSE", 1, 0, false);
	declareFunction("sqlrs_emptyP", "SQLRS-EMPTY?", 1, 0, false);
	declareFunction("sqlrs_absolute", "SQLRS-ABSOLUTE", 2, 0, false);
	declareFunction("sqlrs_next", "SQLRS-NEXT", 1, 0, false);
	declareFunction("sqlrs_previous", "SQLRS-PREVIOUS", 1, 0, false);
	declareFunction("sqlrs_is_last", "SQLRS-IS-LAST", 1, 0, false);
	declareFunction("sqlrs_is_first", "SQLRS-IS-FIRST", 1, 0, false);
	declareFunction("sqlrs_column_count", "SQLRS-COLUMN-COUNT", 1, 0, false);
	declareFunction("sqlrs_row_count", "SQLRS-ROW-COUNT", 1, 0, false);
	declareFunction("sqlrs_get_row", "SQLRS-GET-ROW", 1, 0, false);
	declareFunction("sqlrs_get_object", "SQLRS-GET-OBJECT", 2, 0, false);
	declareFunction("sqlrs_get_object_tuple", "SQLRS-GET-OBJECT-TUPLE", 1, 0, false);
	declareFunction("new_sql_result_set", "NEW-SQL-RESULT-SET", 3, 0, false);
	declareFunction("sqlrs_closed_p", "SQLRS-CLOSED-P", 1, 0, false);
	declareFunction("sqlrs_open_p", "SQLRS-OPEN-P", 1, 0, false);
	declareFunction("sqlrs_valid_row_p", "SQLRS-VALID-ROW-P", 1, 0, false);
	declareFunction("sqlrs_valid_column_p", "SQLRS-VALID-COLUMN-P", 2, 0, false);
	declareFunction("sqlrs_block", "SQLRS-BLOCK", 2, 0, false);
	declareFunction("sqlrs_row_local_p", "SQLRS-ROW-LOCAL-P", 1, 0, false);
	declareFunction("sqlrs_row_remote_p", "SQLRS-ROW-REMOTE-P", 1, 0, false);
	declareFunction("sqlrs_local_close", "SQLRS-LOCAL-CLOSE", 1, 0, false);
	declareFunction("sql_statement_print_function_trampoline", "SQL-STATEMENT-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
	declareFunction("sql_statement_p", "SQL-STATEMENT-P", 1, 0, false);
	new sdbc.$sql_statement_p$UnaryFunction();
	declareFunction("sqls_connection", "SQLS-CONNECTION", 1, 0, false);
	declareFunction("sqls_id", "SQLS-ID", 1, 0, false);
	declareFunction("sqls_sql", "SQLS-SQL", 1, 0, false);
	declareFunction("sqls_settings", "SQLS-SETTINGS", 1, 0, false);
	declareFunction("sqls_batch", "SQLS-BATCH", 1, 0, false);
	declareFunction("sqls_rs", "SQLS-RS", 1, 0, false);
	declareFunction("_csetf_sqls_connection", "_CSETF-SQLS-CONNECTION", 2, 0, false);
	declareFunction("_csetf_sqls_id", "_CSETF-SQLS-ID", 2, 0, false);
	declareFunction("_csetf_sqls_sql", "_CSETF-SQLS-SQL", 2, 0, false);
	declareFunction("_csetf_sqls_settings", "_CSETF-SQLS-SETTINGS", 2, 0, false);
	declareFunction("_csetf_sqls_batch", "_CSETF-SQLS-BATCH", 2, 0, false);
	declareFunction("_csetf_sqls_rs", "_CSETF-SQLS-RS", 2, 0, false);
	declareFunction("make_sql_statement", "MAKE-SQL-STATEMENT", 0, 1, false);
	declareFunction("visit_defstruct_sql_statement", "VISIT-DEFSTRUCT-SQL-STATEMENT", 2, 0, false);
	declareFunction("visit_defstruct_object_sql_statement_method", "VISIT-DEFSTRUCT-OBJECT-SQL-STATEMENT-METHOD", 2, 0, false);
	declareFunction("sqls_open_p", "SQLS-OPEN-P", 1, 0, false);
	declareFunction("sql_open_statement_p", "SQL-OPEN-STATEMENT-P", 1, 0, false);
	declareFunction("sqls_execute_query", "SQLS-EXECUTE-QUERY", 2, 1, false);
	declareFunction("sqls_execute_update", "SQLS-EXECUTE-UPDATE", 2, 0, false);
	declareFunction("sqls_cancel", "SQLS-CANCEL", 1, 0, false);
	declareFunction("sqls_get_generated_keys", "SQLS-GET-GENERATED-KEYS", 1, 1, false);
	declareFunction("sqls_close", "SQLS-CLOSE", 1, 0, false);
	declareFunction("sqls_add_batch", "SQLS-ADD-BATCH", 2, 0, false);
	declareFunction("sqls_clear_batch", "SQLS-CLEAR-BATCH", 1, 0, false);
	declareFunction("sqls_execute_batch", "SQLS-EXECUTE-BATCH", 1, 0, false);
	declareFunction("sql_prepared_statement_p", "SQL-PREPARED-STATEMENT-P", 1, 0, false);
	declareFunction("sql_prepared_open_statement_p", "SQL-PREPARED-OPEN-STATEMENT-P", 1, 0, false);
	declareFunction("sqlps_execute_query", "SQLPS-EXECUTE-QUERY", 1, 1, false);
	declareFunction("sqlps_execute_update", "SQLPS-EXECUTE-UPDATE", 1, 0, false);
	declareFunction("sqlps_set_bytes", "SQLPS-SET-BYTES", 3, 0, false);
	declareFunction("sqlps_set_int", "SQLPS-SET-INT", 3, 0, false);
	declareFunction("sqlps_set_long", "SQLPS-SET-LONG", 3, 0, false);
	declareFunction("sqlps_set_float", "SQLPS-SET-FLOAT", 3, 0, false);
	declareFunction("sqlps_set_double", "SQLPS-SET-DOUBLE", 3, 0, false);
	declareFunction("sqlps_set_string", "SQLPS-SET-STRING", 3, 0, false);
	declareFunction("new_sql_statement", "NEW-SQL-STATEMENT", 1, 0, false);
	declareFunction("sqls_get_connection", "SQLS-GET-CONNECTION", 1, 0, false);
	declareFunction("sqls_local_close", "SQLS-LOCAL-CLOSE", 1, 0, false);
	declareFunction("sqlps_set", "SQLPS-SET", 4, 0, false);
	declareFunction("new_sql_prepared_statement", "NEW-SQL-PREPARED-STATEMENT", 2, 0, false);
	declareFunction("new_statement_id", "NEW-STATEMENT-ID", 0, 0, false);
	declareFunction("new_result_set_id", "NEW-RESULT-SET-ID", 0, 0, false);
	declareFunction("sqlc_get_tables", "SQLC-GET-TABLES", 5, 0, false);
	declareFunction("sqlc_get_tables_meta_data", "SQLC-GET-TABLES-META-DATA", 5, 0, false);
	declareFunction("sqlc_get_columns", "SQLC-GET-COLUMNS", 5, 0, false);
	declareFunction("sqlc_get_columns_meta_data", "SQLC-GET-COLUMNS-META-DATA", 5, 0, false);
	declareFunction("sqlc_get_primary_keys", "SQLC-GET-PRIMARY-KEYS", 4, 0, false);
	declareFunction("sqlc_get_primary_keys_meta_data", "SQLC-GET-PRIMARY-KEYS-META-DATA", 4, 0, false);
	declareFunction("sqlc_get_imported_keys", "SQLC-GET-IMPORTED-KEYS", 4, 0, false);
	declareFunction("sqlc_get_imported_keys_meta_data", "SQLC-GET-IMPORTED-KEYS-META-DATA", 4, 0, false);
	declareFunction("sqlc_get_exported_keys", "SQLC-GET-EXPORTED-KEYS", 4, 0, false);
	declareFunction("sqlc_get_exported_keys_meta_data", "SQLC-GET-EXPORTED-KEYS-META-DATA", 4, 0, false);
	declareFunction("sqlc_get_index_info", "SQLC-GET-INDEX-INFO", 6, 0, false);
	declareFunction("sqlc_get_index_info_meta_data", "SQLC-GET-INDEX-INFO-META-DATA", 6, 0, false);
	declareFunction("sqlc_get_max_connections", "SQLC-GET-MAX-CONNECTIONS", 1, 0, false);
	declareFunction("sdbc_error_handling_tag_p", "SDBC-ERROR-HANDLING-TAG-P", 1, 0, false);
	declareFunction("new_db_url", "NEW-DB-URL", 5, 1, false);
	declareFunction("add_sdbc_database_connection_url_description", "ADD-SDBC-DATABASE-CONNECTION-URL-DESCRIPTION", 5, 0, false);
	declareFunction("get_all_sdbc_database_sub_protocols", "GET-ALL-SDBC-DATABASE-SUB-PROTOCOLS", 0, 0, false);
	declareFunction("compile_db_conn_url_punctuation_info", "COMPILE-DB-CONN-URL-PUNCTUATION-INFO", 1, 0, false);
	declareMacro("register_sdbc_database_connection_url_description", "REGISTER-SDBC-DATABASE-CONNECTION-URL-DESCRIPTION");
	declareFunction("set_sdbc_db2_port", "SET-SDBC-DB2-PORT", 1, 0, false);
	declareFunction("sdbc_db2_port", "SDBC-DB2-PORT", 0, 0, false);
	declareFunction("set_sdbc_sybase_iq_port", "SET-SDBC-SYBASE-IQ-PORT", 1, 0, false);
	declareFunction("sdbc_sybase_iq_port", "SDBC-SYBASE-IQ-PORT", 0, 0, false);
	declareFunction("construct_new_database_connection_url", "CONSTRUCT-NEW-DATABASE-CONNECTION-URL", 2, 0, false);
	declareFunction("construct_new_dbconn_url_required", "CONSTRUCT-NEW-DBCONN-URL-REQUIRED", 4, 0, false);
	declareFunction("resolve_dbconn_url_reference", "RESOLVE-DBCONN-URL-REFERENCE", 3, 0, false);
	declareFunction("append_dbconn_url_options", "APPEND-DBCONN-URL-OPTIONS", 5, 0, false);
	declareFunction("write_dbconn_url_punctuation", "WRITE-DBCONN-URL-PUNCTUATION", 3, 0, false);
	declareFunction("java_integerp", "JAVA-INTEGERP", 1, 0, false);
	declareFunction("java_longp", "JAVA-LONGP", 1, 0, false);
	declareFunction("java_floatp", "JAVA-FLOATP", 1, 0, false);
	declareFunction("java_doublep", "JAVA-DOUBLEP", 1, 0, false);
	declareMacro("with_sql_connection", "WITH-SQL-CONNECTION");
	declareMacro("with_sql_statement", "WITH-SQL-STATEMENT");
	declareMacro("with_prepared_sql_statement", "WITH-PREPARED-SQL-STATEMENT");
	declareMacro("sqls_execute_transaction", "SQLS-EXECUTE-TRANSACTION");
	declareFunction("sqls_handle_commit_error", "SQLS-HANDLE-COMMIT-ERROR", 1, 0, false);
	declareFunction("sqls_handle_rollback", "SQLS-HANDLE-ROLLBACK", 1, 0, false);
	declareFunction("sqls_handle_transaction_errors", "SQLS-HANDLE-TRANSACTION-ERRORS", 1, 0, false);
	declareMacro("with_sql_transaction", "WITH-SQL-TRANSACTION");
	declareMacro("with_sql_result_set", "WITH-SQL-RESULT-SET");
	declareMacro("do_sql_result_set", "DO-SQL-RESULT-SET");
	declareFunction("sql_export", "SQL-EXPORT", 4, 5, false);
	declareFunction("sdbc_test", "SDBC-TEST", 3, 5, false);
	declareFunction("sdbc_test_prepared", "SDBC-TEST-PREPARED", 3, 5, false);
	declareFunction("sdbc_test_created", "SDBC-TEST-CREATED", 3, 5, false);
	declareFunction("sdbc_test_batch", "SDBC-TEST-BATCH", 3, 5, false);
	return NIL;
    }

    public static final SubLObject init_sdbc_file_alt() {
	deflexical("*DBMS-SERVER*", red_infrastructure_macros.red_def_helper($list_alt0.isSymbol() ? ((SubLObject) (symbol_value($list_alt0))) : $list_alt0, $dbms_server$,
		$str_alt2$db_server_cyc_com.isSymbol() ? ((SubLObject) (symbol_value($str_alt2$db_server_cyc_com))) : $str_alt2$db_server_cyc_com, $LEXICAL, UNPROVIDED));
	deflexical("*SDBC-PROXY-SERVER*", red_infrastructure_macros.red_def_helper($list_alt4.isSymbol() ? ((SubLObject) (symbol_value($list_alt4))) : $list_alt4, $sdbc_proxy_server$,
		$str_alt2$db_server_cyc_com.isSymbol() ? ((SubLObject) (symbol_value($str_alt2$db_server_cyc_com))) : $str_alt2$db_server_cyc_com, $LEXICAL, UNPROVIDED));
	deflexical("*SQL-PORT*", red_infrastructure_macros.red_def_helper($list_alt6.isSymbol() ? ((SubLObject) (symbol_value($list_alt6))) : $list_alt6, $sql_port$, $int$9999.isSymbol() ? ((SubLObject) (symbol_value($int$9999))) : $int$9999, $LEXICAL, UNPROVIDED));
	deflexical("*SQL-PROTOCOL*", $$$jdbc);
	deflexical("*SQL-SUBPROTOCOL*", $$$postgresql);
	deflexical("*SQL-CONNECTION-TIMEOUT*", FIVE_INTEGER);
	deflexical("*CONNECTION-ID*", $$$CONNECTION);
	defparameter("*RESULT-SET-BLOCK-SIZE*", $int$1000);
	deflexical("*QUIT*", ZERO_INTEGER);
	deflexical("*EXECUTE-UPDATE*", ONE_INTEGER);
	deflexical("*EXECUTE-QUERY*", TWO_INTEGER);
	deflexical("*PREPARE-STATEMENT*", THREE_INTEGER);
	deflexical("*CREATE-STATEMENT*", FOUR_INTEGER);
	deflexical("*SET-BYTES*", FIVE_INTEGER);
	deflexical("*PS-EXECUTE-UPDATE*", SIX_INTEGER);
	deflexical("*PS-EXECUTE-QUERY*", SEVEN_INTEGER);
	deflexical("*SET-INT*", EIGHT_INTEGER);
	deflexical("*CLOSE-STATEMENT*", NINE_INTEGER);
	deflexical("*NEW-CONNECTION*", TEN_INTEGER);
	deflexical("*SET-STRING*", ELEVEN_INTEGER);
	deflexical("*SET-LONG*", TWELVE_INTEGER);
	deflexical("*SET-DOUBLE*", THIRTEEN_INTEGER);
	deflexical("*SET-FLOAT*", FOURTEEN_INTEGER);
	deflexical("*EXECUTE-BATCH*", FIFTEEN_INTEGER);
	deflexical("*GET-ROWS*", SIXTEEN_INTEGER);
	deflexical("*CLOSE-RESULT-SET*", SEVENTEEN_INTEGER);
	deflexical("*EXECUTE-UPDATE-AUTO-KEYS*", EIGHTEEN_INTEGER);
	deflexical("*GET-GENERATED-KEYS*", NINETEEN_INTEGER);
	deflexical("*SET-AUTO-COMMIT*", TWENTY_INTEGER);
	deflexical("*COMMIT*", $int$21);
	deflexical("*ROLLBACK*", $int$22);
	deflexical("*GET-TRANSACTION-ISOLATION*", $int$23);
	deflexical("*SET-TRANSACTION-ISOLATION*", $int$24);
	deflexical("*GET-AUTO-COMMIT*", $int$25);
	deflexical("*GET-TABLES*", $int$26);
	deflexical("*GET-COLUMNS*", $int$27);
	deflexical("*GET-PRIMARY-KEYS*", $int$28);
	deflexical("*GET-IMPORTED-KEYS*", $int$29);
	deflexical("*GET-EXPORTED-KEYS*", $int$30);
	deflexical("*GET-INDEX-INFO*", $int$31);
	deflexical("*CANCEL*", $int$32);
	deflexical("*GET-MAX-CONNECTIONS*", $int$33);
	deflexical("*STOP-RESPONSE*", ZERO_INTEGER);
	deflexical("*INTEGER-RESPONSE*", ONE_INTEGER);
	deflexical("*RESULT-SET-RESPONSE*", TWO_INTEGER);
	deflexical("*VOID-RESPONSE*", THREE_INTEGER);
	deflexical("*CONNECTION*", FOUR_INTEGER);
	deflexical("*UPDATE-COUNTS*", FIVE_INTEGER);
	deflexical("*TRANSACTION-ISOLATION-LEVEL*", SIX_INTEGER);
	deflexical("*BOOLEAN*", SEVEN_INTEGER);
	deflexical("*IO-ERROR*", MINUS_ONE_INTEGER);
	deflexical("*SQL-ERROR*", $int$_2);
	deflexical("*UNKNOWN-ERROR*", $int$_3);
	deflexical("*CLIENT-ERROR*", $int$_4);
	deflexical("*COMMIT-ERROR*", $int$_5);
	deflexical("*ROLLBACK-ERROR*", $int$_6);
	deflexical("*TRANSACTION-ERROR*", $int$_7);
	deflexical("*BATCH-UPDATE-ERROR*", $int$_8);
	defconstant("*DTP-SQL-CONNECTION*", SQL_CONNECTION);
	defconstant("*DTP-SQL-TICKET*", SQL_TICKET);
	defconstant("*DTP-SDBC-ERROR*", SDBC_ERROR);
	defparameter("*SDBC-ERROR-DECODING*", list(bq_cons($io_error$.getGlobalValue(), $str_alt148$_IO), bq_cons($sql_error$.getGlobalValue(), $str_alt149$_SQL), bq_cons($unknown_error$.getGlobalValue(), $str_alt150$), bq_cons($client_error$.getGlobalValue(), $str_alt151$_CLIENT),
		bq_cons($transaction_error$.getGlobalValue(), $str_alt152$_TRANSACTION), bq_cons($rollback_error$.getGlobalValue(), $str_alt153$_ROLLBACK), bq_cons($batch_update_error$.getGlobalValue(), $str_alt154$_BATCH_UPDATE)));
	defconstant("*DTP-SQL-RESULT-SET*", SQL_RESULT_SET);
	defconstant("*DTP-SQL-STATEMENT*", SQL_STATEMENT);
	deflexical("*SDBC-TEST-ROW-CARDINALITY*", $int$25);
	return NIL;
    }

    public static SubLObject init_sdbc_file() {
	if (SubLFiles.USE_V1) {
	    deflexical("*DBMS-SERVER*", red_infrastructure_macros.red_def_helper($list0.isSymbol() ? symbol_value($list0) : $list0, $dbms_server$, $str2$db_server_cyc_com.isSymbol() ? symbol_value($str2$db_server_cyc_com) : $str2$db_server_cyc_com, $LEXICAL, UNPROVIDED));
	    deflexical("*SDBC-PROXY-SERVER*", red_infrastructure_macros.red_def_helper($list4.isSymbol() ? symbol_value($list4) : $list4, $sdbc_proxy_server$, $str2$db_server_cyc_com.isSymbol() ? symbol_value($str2$db_server_cyc_com) : $str2$db_server_cyc_com, $LEXICAL, UNPROVIDED));
	    deflexical("*SQL-PORT*", red_infrastructure_macros.red_def_helper($list6.isSymbol() ? symbol_value($list6) : $list6, $sql_port$, $int$9999.isSymbol() ? symbol_value($int$9999) : $int$9999, $LEXICAL, UNPROVIDED));
	    deflexical("*SQL-PROTOCOL*", $$$jdbc);
	    deflexical("*SQL-SUBPROTOCOL*", $$$postgresql);
	    deflexical("*SQL-CONNECTION-TIMEOUT*", FIVE_INTEGER);
	    deflexical("*CONNECTION-ID*", $$$CONNECTION);
	    defparameter("*RESULT-SET-BLOCK-SIZE*", $int$1000);
	    deflexical("*QUIT*", ZERO_INTEGER);
	    deflexical("*EXECUTE-UPDATE*", ONE_INTEGER);
	    deflexical("*EXECUTE-QUERY*", TWO_INTEGER);
	    deflexical("*PREPARE-STATEMENT*", THREE_INTEGER);
	    deflexical("*CREATE-STATEMENT*", FOUR_INTEGER);
	    deflexical("*SET-BYTES*", FIVE_INTEGER);
	    deflexical("*PS-EXECUTE-UPDATE*", SIX_INTEGER);
	    deflexical("*PS-EXECUTE-QUERY*", SEVEN_INTEGER);
	    deflexical("*SET-INT*", EIGHT_INTEGER);
	    deflexical("*CLOSE-STATEMENT*", NINE_INTEGER);
	    deflexical("*NEW-CONNECTION*", TEN_INTEGER);
	    deflexical("*SET-STRING*", ELEVEN_INTEGER);
	    deflexical("*SET-LONG*", TWELVE_INTEGER);
	    deflexical("*SET-DOUBLE*", THIRTEEN_INTEGER);
	    deflexical("*SET-FLOAT*", FOURTEEN_INTEGER);
	    deflexical("*EXECUTE-BATCH*", FIFTEEN_INTEGER);
	    deflexical("*GET-ROWS*", SIXTEEN_INTEGER);
	    deflexical("*CLOSE-RESULT-SET*", SEVENTEEN_INTEGER);
	    deflexical("*EXECUTE-UPDATE-AUTO-KEYS*", EIGHTEEN_INTEGER);
	    deflexical("*GET-GENERATED-KEYS*", NINETEEN_INTEGER);
	    deflexical("*SET-AUTO-COMMIT*", TWENTY_INTEGER);
	    deflexical("*COMMIT*", $int$21);
	    deflexical("*ROLLBACK*", $int$22);
	    deflexical("*GET-TRANSACTION-ISOLATION*", $int$23);
	    deflexical("*SET-TRANSACTION-ISOLATION*", $int$24);
	    deflexical("*GET-AUTO-COMMIT*", $int$25);
	    deflexical("*GET-TABLES*", $int$26);
	    deflexical("*GET-COLUMNS*", $int$27);
	    deflexical("*GET-PRIMARY-KEYS*", $int$28);
	    deflexical("*GET-IMPORTED-KEYS*", $int$29);
	    deflexical("*GET-EXPORTED-KEYS*", $int$30);
	    deflexical("*GET-INDEX-INFO*", $int$31);
	    deflexical("*CANCEL*", $int$32);
	    deflexical("*GET-MAX-CONNECTIONS*", $int$33);
	    deflexical("*STOP-RESPONSE*", ZERO_INTEGER);
	    deflexical("*INTEGER-RESPONSE*", ONE_INTEGER);
	    deflexical("*RESULT-SET-RESPONSE*", TWO_INTEGER);
	    deflexical("*VOID-RESPONSE*", THREE_INTEGER);
	    deflexical("*CONNECTION*", FOUR_INTEGER);
	    deflexical("*UPDATE-COUNTS*", FIVE_INTEGER);
	    deflexical("*TRANSACTION-ISOLATION-LEVEL*", SIX_INTEGER);
	    deflexical("*BOOLEAN*", SEVEN_INTEGER);
	    deflexical("*IO-ERROR*", MINUS_ONE_INTEGER);
	    deflexical("*SQL-ERROR*", $int$_2);
	    deflexical("*UNKNOWN-ERROR*", $int$_3);
	    deflexical("*CLIENT-ERROR*", $int$_4);
	    deflexical("*COMMIT-ERROR*", $int$_5);
	    deflexical("*ROLLBACK-ERROR*", $int$_6);
	    deflexical("*TRANSACTION-ERROR*", $int$_7);
	    deflexical("*BATCH-UPDATE-ERROR*", $int$_8);
	    defconstant("*DTP-SQL-CONNECTION*", SQL_CONNECTION);
	    defconstant("*DTP-SQL-TICKET*", SQL_TICKET);
	    defparameter("*SQL-CONNECTION-TIMEOUT-SECONDS*", $int$212);
	    defparameter("*SQL-CONNECTION-TIMEOUT-SECONDS-WITHIN-INFERENCE*", numeric_date_utilities.$seconds_in_an_hour$.getGlobalValue());
	    defconstant("*DTP-SDBC-ERROR*", SDBC_ERROR);
	    defparameter("*SDBC-ERROR-DECODING*", list(bq_cons($io_error$.getGlobalValue(), $str167$_IO), bq_cons($sql_error$.getGlobalValue(), $str168$_SQL), bq_cons($unknown_error$.getGlobalValue(), $str169$), bq_cons($client_error$.getGlobalValue(), $str170$_CLIENT),
		    bq_cons($transaction_error$.getGlobalValue(), $str171$_TRANSACTION), bq_cons($rollback_error$.getGlobalValue(), $str172$_ROLLBACK), bq_cons($batch_update_error$.getGlobalValue(), $str173$_BATCH_UPDATE)));
	    defconstant("*DTP-SQL-RESULT-SET*", SQL_RESULT_SET);
	    defconstant("*DTP-SQL-STATEMENT*", SQL_STATEMENT);
	    deflexical("*SDBC-DATABASE-CONNECTION-URL-DESCRIPTIONS*", SubLTrampolineFile.maybeDefault($sdbc_database_connection_url_descriptions$, $sdbc_database_connection_url_descriptions$, () -> dictionary.new_dictionary(EQUAL, UNPROVIDED)));
	    deflexical("*SDBC-DB2-PORT*", SubLTrampolineFile.maybeDefault($sym331$_SDBC_DB2_PORT_, $sdbc_db2_port$, $int$50001));
	    deflexical("*SDBC-SYBASE-IQ-PORT*", SubLTrampolineFile.maybeDefault($sdbc_sybase_iq_port$, $sdbc_sybase_iq_port$, $int$2638));
	    deflexical("*SDBC-TEST-ROW-CARDINALITY*", $int$25);
	}
	if (SubLFiles.USE_V2) {
	    deflexical("*DBMS-SERVER*", red_infrastructure_macros.red_def_helper($list_alt0.isSymbol() ? ((SubLObject) (symbol_value($list_alt0))) : $list_alt0, $dbms_server$,
		    $str_alt2$db_server_cyc_com.isSymbol() ? ((SubLObject) (symbol_value($str_alt2$db_server_cyc_com))) : $str_alt2$db_server_cyc_com, $LEXICAL, UNPROVIDED));
	    deflexical("*SDBC-PROXY-SERVER*", red_infrastructure_macros.red_def_helper($list_alt4.isSymbol() ? ((SubLObject) (symbol_value($list_alt4))) : $list_alt4, $sdbc_proxy_server$,
		    $str_alt2$db_server_cyc_com.isSymbol() ? ((SubLObject) (symbol_value($str_alt2$db_server_cyc_com))) : $str_alt2$db_server_cyc_com, $LEXICAL, UNPROVIDED));
	    deflexical("*SQL-PORT*", red_infrastructure_macros.red_def_helper($list_alt6.isSymbol() ? ((SubLObject) (symbol_value($list_alt6))) : $list_alt6, $sql_port$, $int$9999.isSymbol() ? ((SubLObject) (symbol_value($int$9999))) : $int$9999, $LEXICAL, UNPROVIDED));
	    defparameter("*SDBC-ERROR-DECODING*", list(bq_cons($io_error$.getGlobalValue(), $str_alt148$_IO), bq_cons($sql_error$.getGlobalValue(), $str_alt149$_SQL), bq_cons($unknown_error$.getGlobalValue(), $str_alt150$), bq_cons($client_error$.getGlobalValue(), $str_alt151$_CLIENT),
		    bq_cons($transaction_error$.getGlobalValue(), $str_alt152$_TRANSACTION), bq_cons($rollback_error$.getGlobalValue(), $str_alt153$_ROLLBACK), bq_cons($batch_update_error$.getGlobalValue(), $str_alt154$_BATCH_UPDATE)));
	}
	return NIL;
    }

    public static SubLObject init_sdbc_file_Previous() {
	deflexical("*DBMS-SERVER*", red_infrastructure_macros.red_def_helper($list0.isSymbol() ? symbol_value($list0) : $list0, $dbms_server$, $str2$db_server_cyc_com.isSymbol() ? symbol_value($str2$db_server_cyc_com) : $str2$db_server_cyc_com, $LEXICAL, UNPROVIDED));
	deflexical("*SDBC-PROXY-SERVER*", red_infrastructure_macros.red_def_helper($list4.isSymbol() ? symbol_value($list4) : $list4, $sdbc_proxy_server$, $str2$db_server_cyc_com.isSymbol() ? symbol_value($str2$db_server_cyc_com) : $str2$db_server_cyc_com, $LEXICAL, UNPROVIDED));
	deflexical("*SQL-PORT*", red_infrastructure_macros.red_def_helper($list6.isSymbol() ? symbol_value($list6) : $list6, $sql_port$, $int$9999.isSymbol() ? symbol_value($int$9999) : $int$9999, $LEXICAL, UNPROVIDED));
	deflexical("*SQL-PROTOCOL*", $$$jdbc);
	deflexical("*SQL-SUBPROTOCOL*", $$$postgresql);
	deflexical("*SQL-CONNECTION-TIMEOUT*", FIVE_INTEGER);
	deflexical("*CONNECTION-ID*", $$$CONNECTION);
	defparameter("*RESULT-SET-BLOCK-SIZE*", $int$1000);
	deflexical("*QUIT*", ZERO_INTEGER);
	deflexical("*EXECUTE-UPDATE*", ONE_INTEGER);
	deflexical("*EXECUTE-QUERY*", TWO_INTEGER);
	deflexical("*PREPARE-STATEMENT*", THREE_INTEGER);
	deflexical("*CREATE-STATEMENT*", FOUR_INTEGER);
	deflexical("*SET-BYTES*", FIVE_INTEGER);
	deflexical("*PS-EXECUTE-UPDATE*", SIX_INTEGER);
	deflexical("*PS-EXECUTE-QUERY*", SEVEN_INTEGER);
	deflexical("*SET-INT*", EIGHT_INTEGER);
	deflexical("*CLOSE-STATEMENT*", NINE_INTEGER);
	deflexical("*NEW-CONNECTION*", TEN_INTEGER);
	deflexical("*SET-STRING*", ELEVEN_INTEGER);
	deflexical("*SET-LONG*", TWELVE_INTEGER);
	deflexical("*SET-DOUBLE*", THIRTEEN_INTEGER);
	deflexical("*SET-FLOAT*", FOURTEEN_INTEGER);
	deflexical("*EXECUTE-BATCH*", FIFTEEN_INTEGER);
	deflexical("*GET-ROWS*", SIXTEEN_INTEGER);
	deflexical("*CLOSE-RESULT-SET*", SEVENTEEN_INTEGER);
	deflexical("*EXECUTE-UPDATE-AUTO-KEYS*", EIGHTEEN_INTEGER);
	deflexical("*GET-GENERATED-KEYS*", NINETEEN_INTEGER);
	deflexical("*SET-AUTO-COMMIT*", TWENTY_INTEGER);
	deflexical("*COMMIT*", $int$21);
	deflexical("*ROLLBACK*", $int$22);
	deflexical("*GET-TRANSACTION-ISOLATION*", $int$23);
	deflexical("*SET-TRANSACTION-ISOLATION*", $int$24);
	deflexical("*GET-AUTO-COMMIT*", $int$25);
	deflexical("*GET-TABLES*", $int$26);
	deflexical("*GET-COLUMNS*", $int$27);
	deflexical("*GET-PRIMARY-KEYS*", $int$28);
	deflexical("*GET-IMPORTED-KEYS*", $int$29);
	deflexical("*GET-EXPORTED-KEYS*", $int$30);
	deflexical("*GET-INDEX-INFO*", $int$31);
	deflexical("*CANCEL*", $int$32);
	deflexical("*GET-MAX-CONNECTIONS*", $int$33);
	deflexical("*STOP-RESPONSE*", ZERO_INTEGER);
	deflexical("*INTEGER-RESPONSE*", ONE_INTEGER);
	deflexical("*RESULT-SET-RESPONSE*", TWO_INTEGER);
	deflexical("*VOID-RESPONSE*", THREE_INTEGER);
	deflexical("*CONNECTION*", FOUR_INTEGER);
	deflexical("*UPDATE-COUNTS*", FIVE_INTEGER);
	deflexical("*TRANSACTION-ISOLATION-LEVEL*", SIX_INTEGER);
	deflexical("*BOOLEAN*", SEVEN_INTEGER);
	deflexical("*IO-ERROR*", MINUS_ONE_INTEGER);
	deflexical("*SQL-ERROR*", $int$_2);
	deflexical("*UNKNOWN-ERROR*", $int$_3);
	deflexical("*CLIENT-ERROR*", $int$_4);
	deflexical("*COMMIT-ERROR*", $int$_5);
	deflexical("*ROLLBACK-ERROR*", $int$_6);
	deflexical("*TRANSACTION-ERROR*", $int$_7);
	deflexical("*BATCH-UPDATE-ERROR*", $int$_8);
	defconstant("*DTP-SQL-CONNECTION*", SQL_CONNECTION);
	defconstant("*DTP-SQL-TICKET*", SQL_TICKET);
	defparameter("*SQL-CONNECTION-TIMEOUT-SECONDS*", $int$212);
	defparameter("*SQL-CONNECTION-TIMEOUT-SECONDS-WITHIN-INFERENCE*", numeric_date_utilities.$seconds_in_an_hour$.getGlobalValue());
	defconstant("*DTP-SDBC-ERROR*", SDBC_ERROR);
	defparameter("*SDBC-ERROR-DECODING*", list(bq_cons($io_error$.getGlobalValue(), $str167$_IO), bq_cons($sql_error$.getGlobalValue(), $str168$_SQL), bq_cons($unknown_error$.getGlobalValue(), $str169$), bq_cons($client_error$.getGlobalValue(), $str170$_CLIENT),
		bq_cons($transaction_error$.getGlobalValue(), $str171$_TRANSACTION), bq_cons($rollback_error$.getGlobalValue(), $str172$_ROLLBACK), bq_cons($batch_update_error$.getGlobalValue(), $str173$_BATCH_UPDATE)));
	defconstant("*DTP-SQL-RESULT-SET*", SQL_RESULT_SET);
	defconstant("*DTP-SQL-STATEMENT*", SQL_STATEMENT);
	deflexical("*SDBC-DATABASE-CONNECTION-URL-DESCRIPTIONS*", SubLTrampolineFile.maybeDefault($sdbc_database_connection_url_descriptions$, $sdbc_database_connection_url_descriptions$, () -> dictionary.new_dictionary(EQUAL, UNPROVIDED)));
	deflexical("*SDBC-DB2-PORT*", SubLTrampolineFile.maybeDefault($sym331$_SDBC_DB2_PORT_, $sdbc_db2_port$, $int$50001));
	deflexical("*SDBC-SYBASE-IQ-PORT*", SubLTrampolineFile.maybeDefault($sdbc_sybase_iq_port$, $sdbc_sybase_iq_port$, $int$2638));
	deflexical("*SDBC-TEST-ROW-CARDINALITY*", $int$25);
	return NIL;
    }

    public static SubLObject setup_sdbc_file() {
	register_method($print_object_method_table$.getGlobalValue(), $dtp_sql_connection$.getGlobalValue(), symbol_function(SQL_CONNECTION_PRINT_FUNCTION_TRAMPOLINE));
	SubLSpecialOperatorDeclarations.proclaim($list45);
	def_csetf(SQLC_DB, _CSETF_SQLC_DB);
	def_csetf(SQLC_USER, _CSETF_SQLC_USER);
	def_csetf(SQLC_DBMS_SERVER, _CSETF_SQLC_DBMS_SERVER);
	def_csetf(SQLC_PORT, _CSETF_SQLC_PORT);
	def_csetf(SQLC_CHANNEL, _CSETF_SQLC_CHANNEL);
	def_csetf(SQLC_STATEMENTS, _CSETF_SQLC_STATEMENTS);
	def_csetf(SQLC_LOCK, _CSETF_SQLC_LOCK);
	def_csetf(SQLC_SUBPROTOCOL, _CSETF_SQLC_SUBPROTOCOL);
	def_csetf(SQLC_PROXY_SERVER, _CSETF_SQLC_PROXY_SERVER);
	def_csetf(SQLC_ERROR_HANDLING, _CSETF_SQLC_ERROR_HANDLING);
	def_csetf(SQLC_TICKETS, _CSETF_SQLC_TICKETS);
	def_csetf(SQLC_MAILMAN, _CSETF_SQLC_MAILMAN);
	identity(SQL_CONNECTION);
	register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $dtp_sql_connection$.getGlobalValue(), symbol_function(VISIT_DEFSTRUCT_OBJECT_SQL_CONNECTION_METHOD));
	register_method($print_object_method_table$.getGlobalValue(), $dtp_sql_ticket$.getGlobalValue(), symbol_function(SQL_TICKET_PRINT_FUNCTION_TRAMPOLINE));
	SubLSpecialOperatorDeclarations.proclaim($list117);
	def_csetf(SQL_TICKET_SEMAPHORE, _CSETF_SQL_TICKET_SEMAPHORE);
	def_csetf(SQL_TICKET_RESULT, _CSETF_SQL_TICKET_RESULT);
	identity(SQL_TICKET);
	register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $dtp_sql_ticket$.getGlobalValue(), symbol_function(VISIT_DEFSTRUCT_OBJECT_SQL_TICKET_METHOD));
	register_macro_helper(SQLC_SET_ERROR_HANDLING, SQLS_EXECUTE_TRANSACTION);
	register_method($print_object_method_table$.getGlobalValue(), $dtp_sdbc_error$.getGlobalValue(), symbol_function(SDBC_ERROR_PRINT_FUNCTION_TRAMPOLINE));
	SubLSpecialOperatorDeclarations.proclaim($list150);
	def_csetf(SDBC_ERROR_TYPE, _CSETF_SDBC_ERROR_TYPE);
	def_csetf(SDBC_ERROR_MESSAGE, _CSETF_SDBC_ERROR_MESSAGE);
	def_csetf(SDBC_ERROR_CODE, _CSETF_SDBC_ERROR_CODE);
	identity(SDBC_ERROR);
	register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $dtp_sdbc_error$.getGlobalValue(), symbol_function(VISIT_DEFSTRUCT_OBJECT_SDBC_ERROR_METHOD));
	register_method($print_object_method_table$.getGlobalValue(), $dtp_sql_result_set$.getGlobalValue(), symbol_function(SQL_RESULT_SET_PRINT_FUNCTION_TRAMPOLINE));
	SubLSpecialOperatorDeclarations.proclaim($list182);
	def_csetf(SQLRS_ROWS, _CSETF_SQLRS_ROWS);
	def_csetf(SQLRS_CURRENT, _CSETF_SQLRS_CURRENT);
	def_csetf(SQLRS_LAST, _CSETF_SQLRS_LAST);
	def_csetf(SQLRS_START, _CSETF_SQLRS_START);
	def_csetf(SQLRS_CONNECTION, _CSETF_SQLRS_CONNECTION);
	def_csetf(SQLRS_BLOCK_SIZE, _CSETF_SQLRS_BLOCK_SIZE);
	def_csetf(SQLRS_ID, _CSETF_SQLRS_ID);
	identity(SQL_RESULT_SET);
	register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $dtp_sql_result_set$.getGlobalValue(), symbol_function(VISIT_DEFSTRUCT_OBJECT_SQL_RESULT_SET_METHOD));
	register_method($print_object_method_table$.getGlobalValue(), $dtp_sql_statement$.getGlobalValue(), symbol_function(SQL_STATEMENT_PRINT_FUNCTION_TRAMPOLINE));
	SubLSpecialOperatorDeclarations.proclaim($list225);
	def_csetf(SQLS_CONNECTION, _CSETF_SQLS_CONNECTION);
	def_csetf(SQLS_ID, _CSETF_SQLS_ID);
	def_csetf(SQLS_SQL, _CSETF_SQLS_SQL);
	def_csetf(SQLS_SETTINGS, _CSETF_SQLS_SETTINGS);
	def_csetf(SQLS_BATCH, _CSETF_SQLS_BATCH);
	def_csetf(SQLS_RS, _CSETF_SQLS_RS);
	identity(SQL_STATEMENT);
	register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $dtp_sql_statement$.getGlobalValue(), symbol_function(VISIT_DEFSTRUCT_OBJECT_SQL_STATEMENT_METHOD));
	register_macro_helper(SQLS_GET_CONNECTION, SQLS_EXECUTE_TRANSACTION);
	define_test_case_table_int(NEW_DB_URL, list(new SubLObject[] { $TEST, symbol_function($sym275$STRING_), $OWNER, NIL, $CLASSES, NIL, $KB, $TINY, $WORKING_, T }), $list281);
	declare_defglobal($sdbc_database_connection_url_descriptions$);
	register_external_symbol(GET_ALL_SDBC_DATABASE_SUB_PROTOCOLS);
	add_sdbc_database_connection_url_description($$$postgresql, $list299, $list300, $list301, $list302);
	add_sdbc_database_connection_url_description($$$mysql, $list299, $list304, $list301, $list305);
	add_sdbc_database_connection_url_description($$$oracle, $list307, NIL, NIL, $list308);
	add_sdbc_database_connection_url_description($$$sqlserver, $list310, $list311, $list312, $list313);
	add_sdbc_database_connection_url_description($str314$microsoft_sqlserver, $list315, $list311, $list312, $list313);
	add_sdbc_database_connection_url_description($$$odbc, $list317, $list318, $list312, NIL);
	add_sdbc_database_connection_url_description($$$sybase, $list320, $list321, $list312, $list322);
	add_sdbc_database_connection_url_description($$$derby, $list299, $list304, $list312, $list324);
	add_sdbc_database_connection_url_description($$$st, $list299, $list326, $list301, $list327);
	add_sdbc_database_connection_url_description($$$poiseschema, $list329, NIL, $list301, NIL);
	add_sdbc_database_connection_url_description($$$poisedata, $list317, NIL, $list301, NIL);
	register_external_symbol($sym331$_SDBC_DB2_PORT_);
	declare_defglobal($sym331$_SDBC_DB2_PORT_);
	register_external_symbol(SET_SDBC_DB2_PORT);
	add_sdbc_database_connection_url_description($$$db2, $list335, $list304, $list336, $list337);
	register_external_symbol($sdbc_sybase_iq_port$);
	declare_defglobal($sdbc_sybase_iq_port$);
	register_external_symbol(SET_SDBC_SYBASE_IQ_PORT);
	add_sdbc_database_connection_url_description($str341$sybase_iq, $list342, $list321, $list343, $list344);
	register_macro_helper(SQLS_HANDLE_COMMIT_ERROR, SQLS_EXECUTE_TRANSACTION);
	register_macro_helper(SQLS_HANDLE_ROLLBACK, SQLS_EXECUTE_TRANSACTION);
	register_macro_helper(SQLS_HANDLE_TRANSACTION_ERRORS, SQLS_EXECUTE_TRANSACTION);
	return NIL;
    }

    @Override
    public void declareFunctions() {
	declare_sdbc_file();
    }

    @Override
    public void initializeVariables() {
	init_sdbc_file();
    }

    @Override
    public void runTopLevelForms() {
	setup_sdbc_file();
    }

    public static final class $sql_connection_p$UnaryFunction extends UnaryFunction {
	public $sql_connection_p$UnaryFunction() {
	    super(extractFunctionNamed("SQL-CONNECTION-P"));
	}

	@Override
	public SubLObject processItem(final SubLObject arg1) {
	    return sql_connection_p(arg1);
	}
    }

    public static final class $sql_ticket_p$UnaryFunction extends UnaryFunction {
	public $sql_ticket_p$UnaryFunction() {
	    super(extractFunctionNamed("SQL-TICKET-P"));
	}

	@Override
	public SubLObject processItem(final SubLObject arg1) {
	    return sql_ticket_p(arg1);
	}
    }

    public static final class $sdbc_error_native extends SubLStructNative {
	public SubLObject $type;

	public SubLObject $message;

	public SubLObject $code;

	private static final SubLStructDeclNative structDecl;

	public $sdbc_error_native() {
	    this.$type = Lisp.NIL;
	    this.$message = Lisp.NIL;
	    this.$code = Lisp.NIL;
	}

	@Override
	public SubLStructDecl getStructDecl() {
	    return structDecl;
	}

	@Override
	public SubLObject getField2() {
	    return this.$type;
	}

	@Override
	public SubLObject getField3() {
	    return this.$message;
	}

	@Override
	public SubLObject getField4() {
	    return this.$code;
	}

	@Override
	public SubLObject setField2(final SubLObject value) {
	    return this.$type = value;
	}

	@Override
	public SubLObject setField3(final SubLObject value) {
	    return this.$message = value;
	}

	@Override
	public SubLObject setField4(final SubLObject value) {
	    return this.$code = value;
	}

	static {
	    structDecl = makeStructDeclNative(com.cyc.cycjava.cycl.sdbc.$sdbc_error_native.class, SDBC_ERROR, SDBC_ERROR_P, $list144, $list145, new String[] { "$type", "$message", "$code" }, $list146, $list147, SDBC_ERROR_PRINT);
	}
    }

    public static final class $sdbc_error_p$UnaryFunction extends UnaryFunction {
	public $sdbc_error_p$UnaryFunction() {
	    super(extractFunctionNamed("SDBC-ERROR-P"));
	}

	@Override
	public SubLObject processItem(final SubLObject arg1) {
	    return sdbc_error_p(arg1);
	}
    }

    public static final class $sql_result_set_native extends SubLStructNative {
	public SubLObject $rows;

	public SubLObject $current;

	public SubLObject $last;

	public SubLObject $start;

	public SubLObject $connection;

	public SubLObject $block_size;

	public SubLObject $id;

	private static final SubLStructDeclNative structDecl;

	public $sql_result_set_native() {
	    sdbc.$sql_result_set_native.this.$rows = Lisp.NIL;
	    sdbc.$sql_result_set_native.this.$current = Lisp.NIL;
	    sdbc.$sql_result_set_native.this.$last = Lisp.NIL;
	    sdbc.$sql_result_set_native.this.$start = Lisp.NIL;
	    sdbc.$sql_result_set_native.this.$connection = Lisp.NIL;
	    sdbc.$sql_result_set_native.this.$block_size = Lisp.NIL;
	    sdbc.$sql_result_set_native.this.$id = Lisp.NIL;
	}

	@Override
	public SubLStructDecl getStructDecl() {
	    return sdbc.$sql_result_set_native.structDecl;
	}

	@Override
	public SubLObject getField2() {
	    return sdbc.$sql_result_set_native.this.$rows;
	}

	@Override
	public SubLObject getField3() {
	    return sdbc.$sql_result_set_native.this.$current;
	}

	@Override
	public SubLObject getField4() {
	    return sdbc.$sql_result_set_native.this.$last;
	}

	@Override
	public SubLObject getField5() {
	    return sdbc.$sql_result_set_native.this.$start;
	}

	@Override
	public SubLObject getField6() {
	    return sdbc.$sql_result_set_native.this.$connection;
	}

	@Override
	public SubLObject getField7() {
	    return sdbc.$sql_result_set_native.this.$block_size;
	}

	@Override
	public SubLObject getField8() {
	    return sdbc.$sql_result_set_native.this.$id;
	}

	@Override
	public SubLObject setField2(final SubLObject value) {
	    return sdbc.$sql_result_set_native.this.$rows = value;
	}

	@Override
	public SubLObject setField3(final SubLObject value) {
	    return sdbc.$sql_result_set_native.this.$current = value;
	}

	@Override
	public SubLObject setField4(final SubLObject value) {
	    return sdbc.$sql_result_set_native.this.$last = value;
	}

	@Override
	public SubLObject setField5(final SubLObject value) {
	    return sdbc.$sql_result_set_native.this.$start = value;
	}

	@Override
	public SubLObject setField6(final SubLObject value) {
	    return sdbc.$sql_result_set_native.this.$connection = value;
	}

	@Override
	public SubLObject setField7(final SubLObject value) {
	    return sdbc.$sql_result_set_native.this.$block_size = value;
	}

	@Override
	public SubLObject setField8(final SubLObject value) {
	    return sdbc.$sql_result_set_native.this.$id = value;
	}

	static {
	    structDecl = makeStructDeclNative(com.cyc.cycjava.cycl.sdbc.$sql_result_set_native.class, SQL_RESULT_SET, SQL_RESULT_SET_P, $list176, $list177, new String[] { "$rows", "$current", "$last", "$start", "$connection", "$block_size", "$id" }, $list178, $list179, SQLRS_PRINT);
	}
    }

    public static final class $sql_result_set_p$UnaryFunction extends UnaryFunction {
	public $sql_result_set_p$UnaryFunction() {
	    super(extractFunctionNamed("SQL-RESULT-SET-P"));
	}

	@Override
	public SubLObject processItem(final SubLObject arg1) {
	    return sql_result_set_p(arg1);
	}
    }

    public static final class $sql_statement_p$UnaryFunction extends UnaryFunction {
	public $sql_statement_p$UnaryFunction() {
	    super(extractFunctionNamed("SQL-STATEMENT-P"));
	}

	@Override
	public SubLObject processItem(final SubLObject arg1) {
	    return sql_statement_p(arg1);
	}
    }

    public static final SubLFile me = new sdbc();

 public static final String myName = "com.cyc.cycjava.cycl.sdbc";


    // deflexical
    @LispMethod(comment = "deflexical")
    public static final SubLSymbol $sql_protocol$ = makeSymbol("*SQL-PROTOCOL*");

    // deflexical
    @LispMethod(comment = "deflexical")
    public static final SubLSymbol $connection_id$ = makeSymbol("*CONNECTION-ID*");

    // defparameter
    /**
     * The maximum number of rows that will reside locally in a result set at a
     * given time
     */
    @LispMethod(comment = "The maximum number of rows that will reside locally in a result set at a\r\ngiven time\ndefparameter\nThe maximum number of rows that will reside locally in a result set at a\ngiven time")
    private static final SubLSymbol $result_set_block_size$ = makeSymbol("*RESULT-SET-BLOCK-SIZE*");

    // deflexical
    @LispMethod(comment = "deflexical")
    private static final SubLSymbol $quit$ = makeSymbol("*QUIT*");

    // deflexical
    @LispMethod(comment = "deflexical")
    private static final SubLSymbol $execute_update$ = makeSymbol("*EXECUTE-UPDATE*");

    // deflexical
    @LispMethod(comment = "deflexical")
    private static final SubLSymbol $execute_query$ = makeSymbol("*EXECUTE-QUERY*");

    // deflexical
    @LispMethod(comment = "deflexical")
    private static final SubLSymbol $prepare_statement$ = makeSymbol("*PREPARE-STATEMENT*");

    // deflexical
    @LispMethod(comment = "deflexical")
    private static final SubLSymbol $create_statement$ = makeSymbol("*CREATE-STATEMENT*");

    // deflexical
    @LispMethod(comment = "deflexical")
    private static final SubLSymbol $set_bytes$ = makeSymbol("*SET-BYTES*");

    // deflexical
    @LispMethod(comment = "deflexical")
    private static final SubLSymbol $ps_execute_update$ = makeSymbol("*PS-EXECUTE-UPDATE*");

    // deflexical
    @LispMethod(comment = "deflexical")
    private static final SubLSymbol $ps_execute_query$ = makeSymbol("*PS-EXECUTE-QUERY*");

    // deflexical
    @LispMethod(comment = "deflexical")
    private static final SubLSymbol $set_int$ = makeSymbol("*SET-INT*");

    // deflexical
    @LispMethod(comment = "deflexical")
    private static final SubLSymbol $close_statement$ = makeSymbol("*CLOSE-STATEMENT*");

    // deflexical
    @LispMethod(comment = "deflexical")
    private static final SubLSymbol $new_connection$ = makeSymbol("*NEW-CONNECTION*");

    // deflexical
    @LispMethod(comment = "deflexical")
    private static final SubLSymbol $set_string$ = makeSymbol("*SET-STRING*");

    // deflexical
    @LispMethod(comment = "deflexical")
    private static final SubLSymbol $set_long$ = makeSymbol("*SET-LONG*");

    // deflexical
    @LispMethod(comment = "deflexical")
    private static final SubLSymbol $set_double$ = makeSymbol("*SET-DOUBLE*");

    // deflexical
    @LispMethod(comment = "deflexical")
    private static final SubLSymbol $set_float$ = makeSymbol("*SET-FLOAT*");

    // deflexical
    @LispMethod(comment = "deflexical")
    private static final SubLSymbol $execute_batch$ = makeSymbol("*EXECUTE-BATCH*");

    // deflexical
    @LispMethod(comment = "deflexical")
    private static final SubLSymbol $get_rows$ = makeSymbol("*GET-ROWS*");

    // deflexical
    @LispMethod(comment = "deflexical")
    private static final SubLSymbol $close_result_set$ = makeSymbol("*CLOSE-RESULT-SET*");

    // deflexical
    @LispMethod(comment = "deflexical")
    private static final SubLSymbol $execute_update_auto_keys$ = makeSymbol("*EXECUTE-UPDATE-AUTO-KEYS*");

    // deflexical
    @LispMethod(comment = "deflexical")
    private static final SubLSymbol $get_generated_keys$ = makeSymbol("*GET-GENERATED-KEYS*");

    // deflexical
    @LispMethod(comment = "deflexical")
    private static final SubLSymbol $set_auto_commit$ = makeSymbol("*SET-AUTO-COMMIT*");

    // deflexical
    @LispMethod(comment = "deflexical")
    private static final SubLSymbol $commit$ = makeSymbol("*COMMIT*");

    // deflexical
    @LispMethod(comment = "deflexical")
    private static final SubLSymbol $rollback$ = makeSymbol("*ROLLBACK*");

    // deflexical
    @LispMethod(comment = "deflexical")
    private static final SubLSymbol $get_transaction_isolation$ = makeSymbol("*GET-TRANSACTION-ISOLATION*");

    // deflexical
    @LispMethod(comment = "deflexical")
    private static final SubLSymbol $set_transaction_isolation$ = makeSymbol("*SET-TRANSACTION-ISOLATION*");

    // deflexical
    @LispMethod(comment = "deflexical")
    private static final SubLSymbol $get_auto_commit$ = makeSymbol("*GET-AUTO-COMMIT*");

    // deflexical
    @LispMethod(comment = "deflexical")
    private static final SubLSymbol $get_tables$ = makeSymbol("*GET-TABLES*");

    // deflexical
    @LispMethod(comment = "deflexical")
    private static final SubLSymbol $get_columns$ = makeSymbol("*GET-COLUMNS*");

    // deflexical
    @LispMethod(comment = "deflexical")
    private static final SubLSymbol $get_primary_keys$ = makeSymbol("*GET-PRIMARY-KEYS*");

    // deflexical
    @LispMethod(comment = "deflexical")
    private static final SubLSymbol $get_imported_keys$ = makeSymbol("*GET-IMPORTED-KEYS*");

    // deflexical
    @LispMethod(comment = "deflexical")
    private static final SubLSymbol $get_exported_keys$ = makeSymbol("*GET-EXPORTED-KEYS*");

    // deflexical
    @LispMethod(comment = "deflexical")
    private static final SubLSymbol $get_index_info$ = makeSymbol("*GET-INDEX-INFO*");

    // deflexical
    @LispMethod(comment = "deflexical")
    private static final SubLSymbol $cancel$ = makeSymbol("*CANCEL*");

    // deflexical
    @LispMethod(comment = "deflexical")
    private static final SubLSymbol $get_max_connections$ = makeSymbol("*GET-MAX-CONNECTIONS*");

    // deflexical
    @LispMethod(comment = "deflexical")
    private static final SubLSymbol $stop_response$ = makeSymbol("*STOP-RESPONSE*");

    // deflexical
    @LispMethod(comment = "deflexical")
    private static final SubLSymbol $integer_response$ = makeSymbol("*INTEGER-RESPONSE*");

    // deflexical
    @LispMethod(comment = "deflexical")
    private static final SubLSymbol $result_set_response$ = makeSymbol("*RESULT-SET-RESPONSE*");

    // deflexical
    @LispMethod(comment = "deflexical")
    private static final SubLSymbol $void_response$ = makeSymbol("*VOID-RESPONSE*");

    // deflexical
    @LispMethod(comment = "deflexical")
    private static final SubLSymbol $connection$ = makeSymbol("*CONNECTION*");

    // deflexical
    @LispMethod(comment = "deflexical")
    private static final SubLSymbol $update_counts$ = makeSymbol("*UPDATE-COUNTS*");

    // deflexical
    @LispMethod(comment = "deflexical")
    private static final SubLSymbol $transaction_isolation_level$ = makeSymbol("*TRANSACTION-ISOLATION-LEVEL*");

    // deflexical
    @LispMethod(comment = "deflexical")
    private static final SubLSymbol $boolean$ = makeSymbol("*BOOLEAN*");

    // deflexical
    @LispMethod(comment = "deflexical")
    private static final SubLSymbol $io_error$ = makeSymbol("*IO-ERROR*");

    // deflexical
    @LispMethod(comment = "deflexical")
    private static final SubLSymbol $sql_error$ = makeSymbol("*SQL-ERROR*");

    // deflexical
    @LispMethod(comment = "deflexical")
    private static final SubLSymbol $unknown_error$ = makeSymbol("*UNKNOWN-ERROR*");

    // deflexical
    @LispMethod(comment = "deflexical")
    private static final SubLSymbol $client_error$ = makeSymbol("*CLIENT-ERROR*");

    // deflexical
    @LispMethod(comment = "deflexical")
    private static final SubLSymbol $commit_error$ = makeSymbol("*COMMIT-ERROR*");

    // deflexical
    @LispMethod(comment = "deflexical")
    private static final SubLSymbol $rollback_error$ = makeSymbol("*ROLLBACK-ERROR*");

    // deflexical
    @LispMethod(comment = "deflexical")
    private static final SubLSymbol $transaction_error$ = makeSymbol("*TRANSACTION-ERROR*");

    // deflexical
    @LispMethod(comment = "deflexical")
    private static final SubLSymbol $batch_update_error$ = makeSymbol("*BATCH-UPDATE-ERROR*");

    // defconstant
    @LispMethod(comment = "defconstant")
    public static final SubLSymbol $dtp_sql_connection$ = makeSymbol("*DTP-SQL-CONNECTION*");

    // defconstant
    @LispMethod(comment = "defconstant")
    public static final SubLSymbol $dtp_sql_ticket$ = makeSymbol("*DTP-SQL-TICKET*");

    // defparameter
    @LispMethod(comment = "defparameter")
    public static final SubLSymbol $sql_connection_timeout_seconds$ = makeSymbol("*SQL-CONNECTION-TIMEOUT-SECONDS*");

    // defparameter
    @LispMethod(comment = "defparameter")
    public static final SubLSymbol $sql_connection_timeout_seconds_within_inference$ = makeSymbol("*SQL-CONNECTION-TIMEOUT-SECONDS-WITHIN-INFERENCE*");

    // defconstant
    @LispMethod(comment = "defconstant")
    public static final SubLSymbol $dtp_sdbc_error$ = makeSymbol("*DTP-SDBC-ERROR*");

    // defparameter
    @LispMethod(comment = "defparameter")
    private static final SubLSymbol $sdbc_error_decoding$ = makeSymbol("*SDBC-ERROR-DECODING*");

    // defconstant
    @LispMethod(comment = "defconstant")
    public static final SubLSymbol $dtp_sql_result_set$ = makeSymbol("*DTP-SQL-RESULT-SET*");

    // defconstant
    @LispMethod(comment = "defconstant")
    public static final SubLSymbol $dtp_sql_statement$ = makeSymbol("*DTP-SQL-STATEMENT*");

    // deflexical
    @LispMethod(comment = "deflexical")
    public static final SubLSymbol $sdbc_db2_port$ = makeSymbol("*SDBC-DB2-PORT*");

    // deflexical
    /**
     * The number of rows created and validated in each separate sdbc test
     */
    @LispMethod(comment = "The number of rows created and validated in each separate sdbc test\ndeflexical")
    private static final SubLSymbol $sdbc_test_row_cardinality$ = makeSymbol("*SDBC-TEST-ROW-CARDINALITY*");

    static private final SubLList $list0 = list(makeString("application.dbms-server"));

    public static final SubLSymbol $dbms_server$ = makeSymbol("*DBMS-SERVER*");

    static private final SubLString $str2$db_server_cyc_com = makeString("db-server.cyc.com");

    static private final SubLList $list4 = list(makeString("application.proxy-server"));

    public static final SubLSymbol $sdbc_proxy_server$ = makeSymbol("*SDBC-PROXY-SERVER*");

    static private final SubLList $list6 = list(makeString("application.sql-port"));

    public static final SubLSymbol $sql_port$ = makeSymbol("*SQL-PORT*");

    private static final SubLInteger $int$9999 = makeInteger(9999);

    static private final SubLString $$$jdbc = makeString("jdbc");

    static private final SubLString $$$postgresql = makeString("postgresql");

    static private final SubLString $$$CONNECTION = makeString("CONNECTION");

    private static final SubLInteger $int$_3 = makeInteger(-3);

    private static final SubLInteger $int$_4 = makeInteger(-4);

    private static final SubLInteger $int$_5 = makeInteger(-5);

    private static final SubLInteger $int$_6 = makeInteger(-6);

    private static final SubLInteger $int$_7 = makeInteger(-7);

    private static final SubLInteger $int$_8 = makeInteger(-8);

    private static final SubLSymbol SQL_CONNECTION = makeSymbol("SQL-CONNECTION");

    private static final SubLSymbol SQL_CONNECTION_P = makeSymbol("SQL-CONNECTION-P");

    static private final SubLList $list39 = list(new SubLObject[] { makeSymbol("DB"), makeSymbol("USER"), makeSymbol("DBMS-SERVER"), makeSymbol("PORT"), makeSymbol("CHANNEL"), makeSymbol("STATEMENTS"), makeSymbol("LOCK"), makeSymbol("SUBPROTOCOL"), makeSymbol("PROXY-SERVER"),
	    makeSymbol("ERROR-HANDLING"), makeSymbol("TICKETS"), makeSymbol("MAILMAN") });

    static private final SubLList $list40 = list(new SubLObject[] { makeKeyword("DB"), $USER, makeKeyword("DBMS-SERVER"), $PORT, makeKeyword("CHANNEL"), makeKeyword("STATEMENTS"), $LOCK, makeKeyword("SUBPROTOCOL"), makeKeyword("PROXY-SERVER"),
	    makeKeyword("ERROR-HANDLING"), makeKeyword("TICKETS"), makeKeyword("MAILMAN") });

    static private final SubLList $list41 = list(new SubLObject[] { makeSymbol("SQLC-DB"), makeSymbol("SQLC-USER"), makeSymbol("SQLC-DBMS-SERVER"), makeSymbol("SQLC-PORT"), makeSymbol("SQLC-CHANNEL"), makeSymbol("SQLC-STATEMENTS"), makeSymbol("SQLC-LOCK"), makeSymbol("SQLC-SUBPROTOCOL"),
	    makeSymbol("SQLC-PROXY-SERVER"), makeSymbol("SQLC-ERROR-HANDLING"), makeSymbol("SQLC-TICKETS"), makeSymbol("SQLC-MAILMAN") });

    static private final SubLList $list42 = list(new SubLObject[] { makeSymbol("_CSETF-SQLC-DB"), makeSymbol("_CSETF-SQLC-USER"), makeSymbol("_CSETF-SQLC-DBMS-SERVER"), makeSymbol("_CSETF-SQLC-PORT"), makeSymbol("_CSETF-SQLC-CHANNEL"), makeSymbol("_CSETF-SQLC-STATEMENTS"),
	    makeSymbol("_CSETF-SQLC-LOCK"), makeSymbol("_CSETF-SQLC-SUBPROTOCOL"), makeSymbol("_CSETF-SQLC-PROXY-SERVER"), makeSymbol("_CSETF-SQLC-ERROR-HANDLING"), makeSymbol("_CSETF-SQLC-TICKETS"), makeSymbol("_CSETF-SQLC-MAILMAN") });

    private static final SubLSymbol SQLC_PRINT = makeSymbol("SQLC-PRINT");

    private static final SubLSymbol SQL_CONNECTION_PRINT_FUNCTION_TRAMPOLINE = makeSymbol("SQL-CONNECTION-PRINT-FUNCTION-TRAMPOLINE");

    private static final SubLList $list45 = list(makeSymbol("OPTIMIZE-FUNCALL"), makeSymbol("SQL-CONNECTION-P"));

    private static final SubLSymbol SQLC_DB = makeSymbol("SQLC-DB");

    private static final SubLSymbol _CSETF_SQLC_DB = makeSymbol("_CSETF-SQLC-DB");

    private static final SubLSymbol SQLC_USER = makeSymbol("SQLC-USER");

    private static final SubLSymbol _CSETF_SQLC_USER = makeSymbol("_CSETF-SQLC-USER");

    private static final SubLSymbol SQLC_DBMS_SERVER = makeSymbol("SQLC-DBMS-SERVER");

    private static final SubLSymbol _CSETF_SQLC_DBMS_SERVER = makeSymbol("_CSETF-SQLC-DBMS-SERVER");

    private static final SubLSymbol SQLC_PORT = makeSymbol("SQLC-PORT");

    private static final SubLSymbol _CSETF_SQLC_PORT = makeSymbol("_CSETF-SQLC-PORT");

    // Internal Constants
    @LispMethod(comment = "Internal Constants")
    static private final SubLList $list_alt0 = list(makeString("application.sdbc.dbms-server"));

    private static final SubLSymbol SQLC_CHANNEL = makeSymbol("SQLC-CHANNEL");

    private static final SubLSymbol _CSETF_SQLC_CHANNEL = makeSymbol("_CSETF-SQLC-CHANNEL");

    private static final SubLSymbol SQLC_STATEMENTS = makeSymbol("SQLC-STATEMENTS");

    static private final SubLString $str_alt2$db_server_cyc_com = makeString("db-server.cyc.com");

    private static final SubLSymbol _CSETF_SQLC_STATEMENTS = makeSymbol("_CSETF-SQLC-STATEMENTS");

    static private final SubLList $list_alt4 = list(makeString("application.sdbc.proxy-server"));

    private static final SubLSymbol SQLC_LOCK = makeSymbol("SQLC-LOCK");

    private static final SubLSymbol _CSETF_SQLC_LOCK = makeSymbol("_CSETF-SQLC-LOCK");

    static private final SubLList $list_alt6 = list(makeString("application.sdbc.sql-port"));

    private static final SubLSymbol SQLC_SUBPROTOCOL = makeSymbol("SQLC-SUBPROTOCOL");

    private static final SubLSymbol _CSETF_SQLC_SUBPROTOCOL = makeSymbol("_CSETF-SQLC-SUBPROTOCOL");

    private static final SubLSymbol SQLC_PROXY_SERVER = makeSymbol("SQLC-PROXY-SERVER");

    private static final SubLSymbol _CSETF_SQLC_PROXY_SERVER = makeSymbol("_CSETF-SQLC-PROXY-SERVER");

    private static final SubLSymbol SQLC_ERROR_HANDLING = makeSymbol("SQLC-ERROR-HANDLING");

    private static final SubLSymbol _CSETF_SQLC_ERROR_HANDLING = makeSymbol("_CSETF-SQLC-ERROR-HANDLING");

    private static final SubLSymbol SQLC_TICKETS = makeSymbol("SQLC-TICKETS");

    private static final SubLSymbol _CSETF_SQLC_TICKETS = makeSymbol("_CSETF-SQLC-TICKETS");

    private static final SubLSymbol SQLC_MAILMAN = makeSymbol("SQLC-MAILMAN");

    private static final SubLSymbol _CSETF_SQLC_MAILMAN = makeSymbol("_CSETF-SQLC-MAILMAN");

    private static final SubLString $str82$Invalid_slot__S_for_construction_ = makeString("Invalid slot ~S for construction function");

    private static final SubLSymbol MAKE_SQL_CONNECTION = makeSymbol("MAKE-SQL-CONNECTION");

    private static final SubLSymbol VISIT_DEFSTRUCT_OBJECT_SQL_CONNECTION_METHOD = makeSymbol("VISIT-DEFSTRUCT-OBJECT-SQL-CONNECTION-METHOD");

    private static final SubLString $str88$__SQL_CONNECTION_ = makeString("#<SQL-CONNECTION ");

    private static final SubLString $$$closed_ = makeString("closed ");

    private static final SubLString $$$to_ = makeString("to ");

    private static final SubLString $str91$__ = makeString(" [");

    private static final SubLString $str92$_ = makeString("/");

    private static final SubLString $str93$__ = makeString("]>");

    static private final SubLList $list_alt39 = list(new SubLObject[] { makeSymbol("DB"), makeSymbol("USER"), makeSymbol("DBMS-SERVER"), makeSymbol("PORT"), makeSymbol("CHANNEL"), makeSymbol("STATEMENTS"), makeSymbol("LOCK"), makeSymbol("SUBPROTOCOL"), makeSymbol("PROXY-SERVER"),
	    makeSymbol("ERROR-HANDLING"), makeSymbol("TICKETS"), makeSymbol("MAILMAN") });

    private static final SubLList $list94 = list(makeSymbol("&KEY"), list(makeSymbol("DBMS-SERVER"), makeSymbol("*DBMS-SERVER*")), makeSymbol("DBMS-PORT"), list(makeSymbol("SUBPROTOCOL"), makeSymbol("*SQL-SUBPROTOCOL*")), list(makeSymbol("PROXY-SERVER"), makeSymbol("DBMS-SERVER")),
	    list(makeSymbol("PORT"), makeSymbol("*SQL-PORT*")), list(makeSymbol("TIMEOUT"), makeSymbol("*SQL-CONNECTION-TIMEOUT*")));

    static private final SubLList $list_alt40 = list(new SubLObject[] { makeKeyword("DB"), $USER, makeKeyword("DBMS-SERVER"), $PORT, makeKeyword("CHANNEL"), makeKeyword("STATEMENTS"), $LOCK, makeKeyword("SUBPROTOCOL"), makeKeyword("PROXY-SERVER"),
	    makeKeyword("ERROR-HANDLING"), makeKeyword("TICKETS"), makeKeyword("MAILMAN") });

    private static final SubLList $list95 = list(makeKeyword("DBMS-SERVER"), makeKeyword("DBMS-PORT"), makeKeyword("SUBPROTOCOL"), makeKeyword("PROXY-SERVER"), $PORT, makeKeyword("TIMEOUT"));

    private static final SubLSymbol $ALLOW_OTHER_KEYS = makeKeyword("ALLOW-OTHER-KEYS");

    static private final SubLList $list_alt41 = list(new SubLObject[] { makeSymbol("SQLC-DB"), makeSymbol("SQLC-USER"), makeSymbol("SQLC-DBMS-SERVER"), makeSymbol("SQLC-PORT"), makeSymbol("SQLC-CHANNEL"), makeSymbol("SQLC-STATEMENTS"), makeSymbol("SQLC-LOCK"), makeSymbol("SQLC-SUBPROTOCOL"),
	    makeSymbol("SQLC-PROXY-SERVER"), makeSymbol("SQLC-ERROR-HANDLING"), makeSymbol("SQLC-TICKETS"), makeSymbol("SQLC-MAILMAN") });

    private static final SubLString $$$SQL_connection_lock = makeString("SQL connection lock");

    private static final SubLString $str103$Trying_to_open_from_a_null_sqlc_c = makeString("Trying to open from a null sqlc channel.");

    private static final SubLString $$$timeout = makeString("timeout");

    private static final SubLSymbol $sym105$_EXIT = makeSymbol("%EXIT");

    private static final SubLSymbol SQL_OPEN_CONNECTION_P = makeSymbol("SQL-OPEN-CONNECTION-P");

    static private final SubLList $list_alt42 = list(new SubLObject[] { makeSymbol("_CSETF-SQLC-DB"), makeSymbol("_CSETF-SQLC-USER"), makeSymbol("_CSETF-SQLC-DBMS-SERVER"), makeSymbol("_CSETF-SQLC-PORT"), makeSymbol("_CSETF-SQLC-CHANNEL"), makeSymbol("_CSETF-SQLC-STATEMENTS"),
	    makeSymbol("_CSETF-SQLC-LOCK"), makeSymbol("_CSETF-SQLC-SUBPROTOCOL"), makeSymbol("_CSETF-SQLC-PROXY-SERVER"), makeSymbol("_CSETF-SQLC-ERROR-HANDLING"), makeSymbol("_CSETF-SQLC-TICKETS"), makeSymbol("_CSETF-SQLC-MAILMAN") });

    private static final SubLSymbol SQL_TRANSACTION_LEVEL_P = makeSymbol("SQL-TRANSACTION-LEVEL-P");

    private static final SubLSymbol SQL_TICKET = makeSymbol("SQL-TICKET");

    private static final SubLSymbol SQL_TICKET_P = makeSymbol("SQL-TICKET-P");

    private static final SubLList $list111 = list(makeSymbol("SEMAPHORE"), makeSymbol("RESULT"));

    private static final SubLList $list112 = list(makeKeyword("SEMAPHORE"), makeKeyword("RESULT"));

    private static final SubLList $list113 = list(makeSymbol("SQL-TICKET-SEMAPHORE"), makeSymbol("SQL-TICKET-RESULT"));

    private static final SubLList $list114 = list(makeSymbol("_CSETF-SQL-TICKET-SEMAPHORE"), makeSymbol("_CSETF-SQL-TICKET-RESULT"));

    private static final SubLSymbol SQL_TICKET_PRINT_FUNCTION_TRAMPOLINE = makeSymbol("SQL-TICKET-PRINT-FUNCTION-TRAMPOLINE");

    private static final SubLList $list117 = list(makeSymbol("OPTIMIZE-FUNCALL"), makeSymbol("SQL-TICKET-P"));

    private static final SubLSymbol SQL_TICKET_SEMAPHORE = makeSymbol("SQL-TICKET-SEMAPHORE");

    private static final SubLSymbol _CSETF_SQL_TICKET_SEMAPHORE = makeSymbol("_CSETF-SQL-TICKET-SEMAPHORE");

    private static final SubLSymbol SQL_TICKET_RESULT = makeSymbol("SQL-TICKET-RESULT");

    private static final SubLSymbol _CSETF_SQL_TICKET_RESULT = makeSymbol("_CSETF-SQL-TICKET-RESULT");

    private static final SubLSymbol MAKE_SQL_TICKET = makeSymbol("MAKE-SQL-TICKET");

    private static final SubLSymbol VISIT_DEFSTRUCT_OBJECT_SQL_TICKET_METHOD = makeSymbol("VISIT-DEFSTRUCT-OBJECT-SQL-TICKET-METHOD");

    private static final SubLString $$$SQL_Request = makeString("SQL Request");

    private static final SubLInteger $int$212 = makeInteger(212);

    private static final SubLString $$$Timed_out_after_ = makeString("Timed out after ");

    private static final SubLString $$$_seconds_retrieving_SQL_ticket = makeString(" seconds retrieving SQL ticket");

    private static final SubLString $$$SQL_Mailman_for_ = makeString("SQL Mailman for ");

    private static final SubLSymbol SQLC_DELIVER = makeSymbol("SQLC-DELIVER");

    private static final SubLString $str132$Implementation_error__no_ticket_f = makeString("Implementation error: no ticket for result ~a");

    private static final SubLString $str133$Trying_to_read_from_a_null_sqlc_c = makeString("Trying to read from a null sqlc channel.");

    private static final SubLSymbol SDBC_ERROR_HANDLING_TAG_P = makeSymbol("SDBC-ERROR-HANDLING-TAG-P");

    private static final SubLList $list137 = list(makeKeyword("TRANSACTION-NONE"), makeKeyword("TRANSACTION-READ-COMMITTED"), makeKeyword("TRANSACTION-READ-UNCOMMITTED"), makeKeyword("TRANSACTION-REPEATABLE-READ"), makeKeyword("TRANSACTION-SERIALIZABLE"));

    private static final SubLSymbol SQLC_SET_ERROR_HANDLING = makeSymbol("SQLC-SET-ERROR-HANDLING");

    static private final SubLString $str_alt81$Invalid_slot__S_for_construction_ = makeString("Invalid slot ~S for construction function");

    private static final SubLSymbol SQLS_EXECUTE_TRANSACTION = makeSymbol("SQLS-EXECUTE-TRANSACTION");

    static private final SubLString $str_alt82$__SQL_CONNECTION_ = makeString("#<SQL-CONNECTION ");

    private static final SubLSymbol SDBC_ERROR = makeSymbol("SDBC-ERROR");

    static private final SubLString $str_alt83$closed_ = makeString("closed ");

    private static final SubLSymbol SDBC_ERROR_P = makeSymbol("SDBC-ERROR-P");

    static private final SubLString $str_alt84$to_ = makeString("to ");

    private static final SubLList $list144 = list(makeSymbol("TYPE"), makeSymbol("MESSAGE"), makeSymbol("CODE"));

    static private final SubLString $str_alt85$__ = makeString(" [");

    static private final SubLString $str_alt86$_ = makeString("/");

    private static final SubLList $list145 = list($TYPE, makeKeyword("MESSAGE"), $CODE);

    static private final SubLString $str_alt87$__ = makeString("]>");

    private static final SubLList $list146 = list(makeSymbol("SDBC-ERROR-TYPE"), makeSymbol("SDBC-ERROR-MESSAGE"), makeSymbol("SDBC-ERROR-CODE"));

    static private final SubLList $list_alt88 = list(makeSymbol("&KEY"), list(makeSymbol("DBMS-SERVER"), makeSymbol("*DBMS-SERVER*")), list(makeSymbol("SUBPROTOCOL"), makeSymbol("*SQL-SUBPROTOCOL*")), list(makeSymbol("PROXY-SERVER"), makeSymbol("DBMS-SERVER")),
	    list(makeSymbol("PORT"), makeSymbol("*SQL-PORT*")), list(makeSymbol("TIMEOUT"), makeSymbol("*SQL-CONNECTION-TIMEOUT*")));

    private static final SubLList $list147 = list(makeSymbol("_CSETF-SDBC-ERROR-TYPE"), makeSymbol("_CSETF-SDBC-ERROR-MESSAGE"), makeSymbol("_CSETF-SDBC-ERROR-CODE"));

    private static final SubLSymbol SDBC_ERROR_PRINT = makeSymbol("SDBC-ERROR-PRINT");

    static private final SubLList $list_alt89 = list(makeKeyword("DBMS-SERVER"), makeKeyword("SUBPROTOCOL"), makeKeyword("PROXY-SERVER"), $PORT, makeKeyword("TIMEOUT"));

    private static final SubLSymbol SDBC_ERROR_PRINT_FUNCTION_TRAMPOLINE = makeSymbol("SDBC-ERROR-PRINT-FUNCTION-TRAMPOLINE");

    private static final SubLList $list150 = list(makeSymbol("OPTIMIZE-FUNCALL"), makeSymbol("SDBC-ERROR-P"));

    private static final SubLSymbol SDBC_ERROR_TYPE = makeSymbol("SDBC-ERROR-TYPE");

    private static final SubLSymbol _CSETF_SDBC_ERROR_TYPE = makeSymbol("_CSETF-SDBC-ERROR-TYPE");

    private static final SubLSymbol SDBC_ERROR_MESSAGE = makeSymbol("SDBC-ERROR-MESSAGE");

    private static final SubLSymbol _CSETF_SDBC_ERROR_MESSAGE = makeSymbol("_CSETF-SDBC-ERROR-MESSAGE");

    private static final SubLSymbol SDBC_ERROR_CODE = makeSymbol("SDBC-ERROR-CODE");

    private static final SubLSymbol _CSETF_SDBC_ERROR_CODE = makeSymbol("_CSETF-SDBC-ERROR-CODE");

    static private final SubLList $list_alt102 = list(makeSymbol("SEMAPHORE"), makeSymbol("RESULT"));

    private static final SubLSymbol MAKE_SDBC_ERROR = makeSymbol("MAKE-SDBC-ERROR");

    static private final SubLList $list_alt103 = list(makeKeyword("SEMAPHORE"), makeKeyword("RESULT"));

    private static final SubLSymbol VISIT_DEFSTRUCT_OBJECT_SDBC_ERROR_METHOD = makeSymbol("VISIT-DEFSTRUCT-OBJECT-SDBC-ERROR-METHOD");

    static private final SubLList $list_alt104 = list(makeSymbol("SQL-TICKET-SEMAPHORE"), makeSymbol("SQL-TICKET-RESULT"));

    private static final SubLString $str162$_a = makeString("~a");

    private static final SubLString $str163$SDBC__a___a = makeString("SDBC ~a: ~a");

    static private final SubLList $list_alt105 = list(makeSymbol("_CSETF-SQL-TICKET-SEMAPHORE"), makeSymbol("_CSETF-SQL-TICKET-RESULT"));

    private static final SubLString $str164$__SDBC = makeString("#<SDBC");

    private static final SubLString $str165$_ERROR__ = makeString("-ERROR: ");

    private static final SubLString $str166$_ = makeString(">");

    private static final SubLString $str167$_IO = makeString("-IO");

    private static final SubLString $str168$_SQL = makeString("-SQL");

    private static final SubLString $str169$ = makeString("");

    private static final SubLString $str170$_CLIENT = makeString("-CLIENT");

    private static final SubLString $str171$_TRANSACTION = makeString("-TRANSACTION");

    private static final SubLString $str172$_ROLLBACK = makeString("-ROLLBACK");

    static private final SubLString $str_alt115$SQL_Mailman_for_ = makeString("SQL Mailman for ");

    private static final SubLString $str173$_BATCH_UPDATE = makeString("-BATCH-UPDATE");

    private static final SubLSymbol SQL_RESULT_SET = makeSymbol("SQL-RESULT-SET");

    private static final SubLSymbol SQL_RESULT_SET_P = makeSymbol("SQL-RESULT-SET-P");

    static private final SubLString $str_alt117$Implementation_error__no_ticket_f = makeString("Implementation error: no ticket for result ~a");

    private static final SubLList $list176 = list(makeSymbol("ROWS"), makeSymbol("CURRENT"), makeSymbol("LAST"), makeSymbol("START"), makeSymbol("CONNECTION"), makeSymbol("BLOCK-SIZE"), makeSymbol("ID"));

    static private final SubLList $list_alt121 = list(makeKeyword("TRANSACTION-NONE"), makeKeyword("TRANSACTION-READ-COMMITTED"), makeKeyword("TRANSACTION-READ-UNCOMMITTED"), makeKeyword("TRANSACTION-REPEATABLE-READ"), makeKeyword("TRANSACTION-SERIALIZABLE"));

    private static final SubLList $list177 = list($ROWS, makeKeyword("CURRENT"), $LAST, makeKeyword("START"), makeKeyword("CONNECTION"), makeKeyword("BLOCK-SIZE"), makeKeyword("ID"));

    private static final SubLList $list178 = list(makeSymbol("SQLRS-ROWS"), makeSymbol("SQLRS-CURRENT"), makeSymbol("SQLRS-LAST"), makeSymbol("SQLRS-START"), makeSymbol("SQLRS-CONNECTION"), makeSymbol("SQLRS-BLOCK-SIZE"), makeSymbol("SQLRS-ID"));

    private static final SubLList $list179 = list(makeSymbol("_CSETF-SQLRS-ROWS"), makeSymbol("_CSETF-SQLRS-CURRENT"), makeSymbol("_CSETF-SQLRS-LAST"), makeSymbol("_CSETF-SQLRS-START"), makeSymbol("_CSETF-SQLRS-CONNECTION"), makeSymbol("_CSETF-SQLRS-BLOCK-SIZE"), makeSymbol("_CSETF-SQLRS-ID"));

    static private final SubLList $list_alt128 = list(makeSymbol("TYPE"), makeSymbol("MESSAGE"), makeSymbol("CODE"));

    static private final SubLList $list_alt129 = list($TYPE, makeKeyword("MESSAGE"), $CODE);

    private static final SubLSymbol SQLRS_PRINT = makeSymbol("SQLRS-PRINT");

    private static final SubLSymbol SQL_RESULT_SET_PRINT_FUNCTION_TRAMPOLINE = makeSymbol("SQL-RESULT-SET-PRINT-FUNCTION-TRAMPOLINE");

    static private final SubLList $list_alt130 = list(makeSymbol("SDBC-ERROR-TYPE"), makeSymbol("SDBC-ERROR-MESSAGE"), makeSymbol("SDBC-ERROR-CODE"));

    private static final SubLList $list182 = list(makeSymbol("OPTIMIZE-FUNCALL"), makeSymbol("SQL-RESULT-SET-P"));

    static private final SubLList $list_alt131 = list(makeSymbol("_CSETF-SDBC-ERROR-TYPE"), makeSymbol("_CSETF-SDBC-ERROR-MESSAGE"), makeSymbol("_CSETF-SDBC-ERROR-CODE"));

    private static final SubLSymbol SQLRS_ROWS = makeSymbol("SQLRS-ROWS");

    private static final SubLSymbol _CSETF_SQLRS_ROWS = makeSymbol("_CSETF-SQLRS-ROWS");

    private static final SubLSymbol SQLRS_CURRENT = makeSymbol("SQLRS-CURRENT");

    private static final SubLSymbol _CSETF_SQLRS_CURRENT = makeSymbol("_CSETF-SQLRS-CURRENT");

    private static final SubLSymbol SQLRS_LAST = makeSymbol("SQLRS-LAST");

    private static final SubLSymbol _CSETF_SQLRS_LAST = makeSymbol("_CSETF-SQLRS-LAST");

    private static final SubLSymbol SQLRS_START = makeSymbol("SQLRS-START");

    private static final SubLSymbol _CSETF_SQLRS_START = makeSymbol("_CSETF-SQLRS-START");

    private static final SubLSymbol SQLRS_CONNECTION = makeSymbol("SQLRS-CONNECTION");

    private static final SubLSymbol _CSETF_SQLRS_CONNECTION = makeSymbol("_CSETF-SQLRS-CONNECTION");

    static private final SubLString $str_alt143$_a = makeString("~a");

    private static final SubLSymbol SQLRS_BLOCK_SIZE = makeSymbol("SQLRS-BLOCK-SIZE");

    static private final SubLString $str_alt144$SDBC__a___a = makeString("SDBC ~a: ~a");

    private static final SubLSymbol _CSETF_SQLRS_BLOCK_SIZE = makeSymbol("_CSETF-SQLRS-BLOCK-SIZE");

    static private final SubLString $str_alt145$__SDBC = makeString("#<SDBC");

    private static final SubLSymbol SQLRS_ID = makeSymbol("SQLRS-ID");

    static private final SubLString $str_alt146$_ERROR__ = makeString("-ERROR: ");

    private static final SubLSymbol _CSETF_SQLRS_ID = makeSymbol("_CSETF-SQLRS-ID");

    static private final SubLString $str_alt147$_ = makeString(">");

    private static final SubLSymbol MAKE_SQL_RESULT_SET = makeSymbol("MAKE-SQL-RESULT-SET");

    static private final SubLString $str_alt148$_IO = makeString("-IO");

    static private final SubLString $str_alt149$_SQL = makeString("-SQL");

    private static final SubLSymbol VISIT_DEFSTRUCT_OBJECT_SQL_RESULT_SET_METHOD = makeSymbol("VISIT-DEFSTRUCT-OBJECT-SQL-RESULT-SET-METHOD");

    static private final SubLString $str_alt151$_CLIENT = makeString("-CLIENT");

    private static final SubLString $str206$_ = makeString("(");

    private static final SubLString $str207$_row__ = makeString(" row, ");

    static private final SubLString $str_alt152$_TRANSACTION = makeString("-TRANSACTION");

    private static final SubLString $str208$_rows__ = makeString(" rows, ");

    static private final SubLString $str_alt153$_ROLLBACK = makeString("-ROLLBACK");

    private static final SubLString $str209$_column_ = makeString(" column)");

    static private final SubLString $str_alt154$_BATCH_UPDATE = makeString("-BATCH-UPDATE");

    private static final SubLString $str210$_columns_ = makeString(" columns)");

    private static final SubLString $$$closed = makeString("closed");

    private static final SubLSymbol SQL_OPEN_RESULT_SET_P = makeSymbol("SQL-OPEN-RESULT-SET-P");

    static private final SubLList $list_alt157 = list(makeSymbol("ROWS"), makeSymbol("CURRENT"), makeSymbol("LAST"), makeSymbol("START"), makeSymbol("CONNECTION"), makeSymbol("BLOCK-SIZE"), makeSymbol("ID"));

    private static final SubLString $$$cursor_not_on_valid_row = makeString("cursor not on valid row");

    private static final SubLString $str214$invalid_column__a = makeString("invalid column ~a");

    static private final SubLList $list_alt158 = list($ROWS, makeKeyword("CURRENT"), $LAST, makeKeyword("START"), makeKeyword("CONNECTION"), makeKeyword("BLOCK-SIZE"), makeKeyword("ID"));

    private static final SubLString $str217$invalid_row__a = makeString("invalid row ~a");

    private static final SubLSymbol SQL_STATEMENT = makeSymbol("SQL-STATEMENT");

    static private final SubLList $list_alt159 = list(makeSymbol("SQLRS-ROWS"), makeSymbol("SQLRS-CURRENT"), makeSymbol("SQLRS-LAST"), makeSymbol("SQLRS-START"), makeSymbol("SQLRS-CONNECTION"), makeSymbol("SQLRS-BLOCK-SIZE"), makeSymbol("SQLRS-ID"));

    private static final SubLSymbol SQL_STATEMENT_P = makeSymbol("SQL-STATEMENT-P");

    private static final SubLList $list220 = list(makeSymbol("CONNECTION"), makeSymbol("ID"), makeSymbol("SQL"), makeSymbol("SETTINGS"), makeSymbol("BATCH"), makeSymbol("RS"));

    static private final SubLList $list_alt160 = list(makeSymbol("_CSETF-SQLRS-ROWS"), makeSymbol("_CSETF-SQLRS-CURRENT"), makeSymbol("_CSETF-SQLRS-LAST"), makeSymbol("_CSETF-SQLRS-START"), makeSymbol("_CSETF-SQLRS-CONNECTION"), makeSymbol("_CSETF-SQLRS-BLOCK-SIZE"), makeSymbol("_CSETF-SQLRS-ID"));

    private static final SubLList $list221 = list(makeKeyword("CONNECTION"), makeKeyword("ID"), makeKeyword("SQL"), makeKeyword("SETTINGS"), makeKeyword("BATCH"), makeKeyword("RS"));

    private static final SubLList $list222 = list(makeSymbol("SQLS-CONNECTION"), makeSymbol("SQLS-ID"), makeSymbol("SQLS-SQL"), makeSymbol("SQLS-SETTINGS"), makeSymbol("SQLS-BATCH"), makeSymbol("SQLS-RS"));

    private static final SubLList $list223 = list(makeSymbol("_CSETF-SQLS-CONNECTION"), makeSymbol("_CSETF-SQLS-ID"), makeSymbol("_CSETF-SQLS-SQL"), makeSymbol("_CSETF-SQLS-SETTINGS"), makeSymbol("_CSETF-SQLS-BATCH"), makeSymbol("_CSETF-SQLS-RS"));

    private static final SubLSymbol SQL_STATEMENT_PRINT_FUNCTION_TRAMPOLINE = makeSymbol("SQL-STATEMENT-PRINT-FUNCTION-TRAMPOLINE");

    private static final SubLList $list225 = list(makeSymbol("OPTIMIZE-FUNCALL"), makeSymbol("SQL-STATEMENT-P"));

    private static final SubLSymbol SQLS_CONNECTION = makeSymbol("SQLS-CONNECTION");

    private static final SubLSymbol _CSETF_SQLS_CONNECTION = makeSymbol("_CSETF-SQLS-CONNECTION");

    private static final SubLSymbol SQLS_ID = makeSymbol("SQLS-ID");

    private static final SubLSymbol _CSETF_SQLS_ID = makeSymbol("_CSETF-SQLS-ID");

    private static final SubLSymbol SQLS_SQL = makeSymbol("SQLS-SQL");

    private static final SubLSymbol _CSETF_SQLS_SQL = makeSymbol("_CSETF-SQLS-SQL");

    private static final SubLSymbol SQLS_SETTINGS = makeSymbol("SQLS-SETTINGS");

    private static final SubLSymbol _CSETF_SQLS_SETTINGS = makeSymbol("_CSETF-SQLS-SETTINGS");

    private static final SubLSymbol SQLS_BATCH = makeSymbol("SQLS-BATCH");

    private static final SubLSymbol _CSETF_SQLS_BATCH = makeSymbol("_CSETF-SQLS-BATCH");

    static private final SubLString $str_alt184$__ = makeString("#<");

    private static final SubLSymbol SQLS_RS = makeSymbol("SQLS-RS");

    static private final SubLString $str_alt186$_ = makeString("(");

    private static final SubLSymbol _CSETF_SQLS_RS = makeSymbol("_CSETF-SQLS-RS");

    static private final SubLString $str_alt187$_row__ = makeString(" row, ");

    private static final SubLSymbol MAKE_SQL_STATEMENT = makeSymbol("MAKE-SQL-STATEMENT");

    static private final SubLString $str_alt188$_rows__ = makeString(" rows, ");

    private static final SubLSymbol VISIT_DEFSTRUCT_OBJECT_SQL_STATEMENT_METHOD = makeSymbol("VISIT-DEFSTRUCT-OBJECT-SQL-STATEMENT-METHOD");

    static private final SubLString $str_alt189$_column_ = makeString(" column)");

    static private final SubLString $str_alt190$_columns_ = makeString(" columns)");

    private static final SubLSymbol SQL_OPEN_STATEMENT_P = makeSymbol("SQL-OPEN-STATEMENT-P");

    private static final SubLSymbol SQL_PREPARED_OPEN_STATEMENT_P = makeSymbol("SQL-PREPARED-OPEN-STATEMENT-P");

    private static final SubLSymbol BYTE_VECTOR_P = makeSymbol("BYTE-VECTOR-P");

    private static final SubLSymbol JAVA_INTEGERP = makeSymbol("JAVA-INTEGERP");

    static private final SubLString $str_alt195$invalid_column__a = makeString("invalid column ~a");

    private static final SubLSymbol JAVA_LONGP = makeSymbol("JAVA-LONGP");

    static private final SubLString $str_alt198$invalid_row__a = makeString("invalid row ~a");

    private static final SubLSymbol JAVA_FLOATP = makeSymbol("JAVA-FLOATP");

    private static final SubLSymbol JAVA_DOUBLEP = makeSymbol("JAVA-DOUBLEP");

    private static final SubLSymbol SQLS_GET_CONNECTION = makeSymbol("SQLS-GET-CONNECTION");

    private static final SubLString $$$STMT = makeString("STMT");

    static private final SubLList $list_alt201 = list(makeSymbol("CONNECTION"), makeSymbol("ID"), makeSymbol("SQL"), makeSymbol("SETTINGS"), makeSymbol("BATCH"), makeSymbol("RS"));

    private static final SubLString $$$RS = makeString("RS");

    private static final SubLSymbol SQLC_GET_TABLES = makeSymbol("SQLC-GET-TABLES");

    static private final SubLList $list_alt202 = list(makeKeyword("CONNECTION"), makeKeyword("ID"), makeKeyword("SQL"), makeKeyword("SETTINGS"), makeKeyword("BATCH"), makeKeyword("RS"));

    private static final SubLString $str256$SQLC_error___A = makeString("SQLC error: ~A");

    private static final SubLList $list257 = list(new SubLObject[] { makeKeyword("TABLE-CAT"), makeKeyword("TABLE-SCHEM"), makeKeyword("TABLE-NAME"), makeKeyword("TABLE-TYPE"), makeKeyword("REMARKS"), makeKeyword("TYPE-CAT"), makeKeyword("TYPE-SCHEM"), makeKeyword("TYPE-NAME"),
	    makeKeyword("SELF-REFERENCING-COL-NAME"), makeKeyword("REF-GENERATION") });

    static private final SubLList $list_alt203 = list(makeSymbol("SQLS-CONNECTION"), makeSymbol("SQLS-ID"), makeSymbol("SQLS-SQL"), makeSymbol("SQLS-SETTINGS"), makeSymbol("SQLS-BATCH"), makeSymbol("SQLS-RS"));

    static private final SubLList $list_alt204 = list(makeSymbol("_CSETF-SQLS-CONNECTION"), makeSymbol("_CSETF-SQLS-ID"), makeSymbol("_CSETF-SQLS-SQL"), makeSymbol("_CSETF-SQLS-SETTINGS"), makeSymbol("_CSETF-SQLS-BATCH"), makeSymbol("_CSETF-SQLS-RS"));

    private static final SubLSymbol SQLC_GET_COLUMNS = makeSymbol("SQLC-GET-COLUMNS");

    private static final SubLList $list259 = list(new SubLObject[] { makeKeyword("TABLE-CAT"), makeKeyword("TABLE-SCHEM"), makeKeyword("TABLE-NAME"), makeKeyword("COLUMN-NAME"), makeKeyword("DATA-TYPE"), makeKeyword("TYPE-NAME"), makeKeyword("COLUMN-SIZE"), makeKeyword("BUFFER-LENGTH"),
	    makeKeyword("DECIMAL-DIGITS"), makeKeyword("NUM-PREC-RADIX"), makeKeyword("NULLABLE"), makeKeyword("REMARKS"), makeKeyword("COLUMN-DEF"), makeKeyword("SQL-DATA-TYPE"), makeKeyword("SQL-DATETIME-SUB"), makeKeyword("CHAR-OCTET-LENGTH"), makeKeyword("ORDINAL-POSITION"),
	    makeKeyword("IS-NULLABLE"), makeKeyword("SCOPE-CATLOG"), makeKeyword("SCOPE-SCHEMA"), makeKeyword("SCOPE-TABLE"), makeKeyword("SOURCE-DATA-TYPE") });

    private static final SubLSymbol SQLC_GET_PRIMARY_KEYS = makeSymbol("SQLC-GET-PRIMARY-KEYS");

    private static final SubLList $list261 = list(makeKeyword("TABLE-CAT"), makeKeyword("TABLE-SCHEM"), makeKeyword("TABLE-NAME"), makeKeyword("COLUMN-NAME"), makeKeyword("KEY-SEQ"), makeKeyword("PK-NAME"));

    private static final SubLSymbol SQLC_GET_IMPORTED_KEYS = makeSymbol("SQLC-GET-IMPORTED-KEYS");

    private static final SubLList $list263 = list(new SubLObject[] { makeKeyword("PKTABLE-CAT"), makeKeyword("PKTABLE-SCHEM"), makeKeyword("PKTABLE-NAME"), makeKeyword("PKCOLUMN-NAME"), makeKeyword("FKTABLE-CAT"), makeKeyword("FKTABLE-SCHEM"), makeKeyword("FKTABLE-NAME"),
	    makeKeyword("FKCOLUMN-NAME"), makeKeyword("KEY-SEQ"), makeKeyword("UPDATE-RULE"), makeKeyword("DELETE-RULE"), makeKeyword("FK-NAME"), makeKeyword("PK-NAME"), makeKeyword("DEFERRABILITY") });

    private static final SubLSymbol SQLC_GET_EXPORTED_KEYS = makeSymbol("SQLC-GET-EXPORTED-KEYS");

    private static final SubLSymbol SQLC_GET_INDEX_INFO = makeSymbol("SQLC-GET-INDEX-INFO");

    static private final SubLList $list266 = list(new SubLObject[] { makeKeyword("TABLE-CAT"), makeKeyword("TABLE-SCHEM"), makeKeyword("TABLE-NAME"), makeKeyword("NON-UNIQUE"), makeKeyword("INDEX-QUALIFIER"), makeKeyword("INDEX-NAME"), $TYPE, makeKeyword("ORDINAL-POSITION"),
	    makeKeyword("COLUMN-NAME"), makeKeyword("ASC-OR-DESC"), makeKeyword("CARDINALITY"), makeKeyword("PAGES"), makeKeyword("FILTER-CONDITION") });

    static private final SubLString $str_alt234$SQLC_error___A = makeString("SQLC error: ~A");

    static private final SubLList $list267 = list(makeKeyword("RETURN"), makeKeyword("THROW"), $WARN);

    static private final SubLList $list_alt235 = list(new SubLObject[] { makeKeyword("TABLE-CAT"), makeKeyword("TABLE-SCHEM"), makeKeyword("TABLE-NAME"), makeKeyword("TABLE-TYPE"), makeKeyword("REMARKS"), makeKeyword("TYPE-CAT"), makeKeyword("TYPE-SCHEM"), makeKeyword("TYPE-NAME"),
	    makeKeyword("SELF-REFERENCING-COL-NAME"), makeKeyword("REF-GENERATION") });

    private static final SubLString $str268$com_cyc_ = makeString("com.cyc.");

    private static final SubLString $str269$_a__a__a = makeString("~a:~a:~a");

    private static final SubLSymbol NEW_DB_URL = makeSymbol("NEW-DB-URL");

    private static final SubLSymbol $sym275$STRING_ = makeSymbol("STRING=");

    private static final SubLList $list281 = list(new SubLObject[] {
	    list(list(makeString("dbms-server.cyc.com"), makeString("testdatabase"), makeString("theuser"), makeString("thepassword"), makeString("postgresql")), makeString("jdbc:postgresql://dbms-server.cyc.com:5432/testdatabase?user=theuser&password=thepassword&charSet=ASCII")),
	    list(list(makeString("dbms-server.cyc.com"), makeString("testdatabase"), makeString("theuser"), makeString("thepassword"), makeString("mysql")), makeString("jdbc:mysql://dbms-server.cyc.com:3306/testdatabase?user=theuser&password=thepassword")),
	    list(list(makeString("dbms-server.cyc.com"), makeString("testdatabase"), makeString("theuser"), makeString("thepassword"), makeString("oracle")), makeString("jdbc:oracle:thin:theuser/thepassword@//dbms-server.cyc.com:1521/testdatabase")),
	    list(list(makeString("dbms-server.cyc.com"), makeString("testdatabase"), makeString("theuser"), makeString("thepassword"), makeString("microsoft-sqlserver")),
		    makeString("jdbc:microsoft:sqlserver://dbms-server.cyc.com:1433;DatabaseName=testdatabase;SelectMethod=cursor;USER=theuser;PASSWORD=thepassword")),
	    list(list(makeString("dbms-server.cyc.com"), makeString("testdatabase"), makeString("theuser"), makeString("thepassword"), makeString("sqlserver")), makeString("jdbc:sqlserver://dbms-server.cyc.com:1433;DatabaseName=testdatabase;SelectMethod=cursor;USER=theuser;PASSWORD=thepassword")),
	    list(list(makeString("dbms-server.cyc.com"), makeString("testdatabase"), makeString("theuser"), makeString("thepassword"), makeString("odbc")), makeString("jdbc:odbc:testdatabase;UID=theuser;PWD=thepassword")),
	    list(list(makeString("dbms-server.cyc.com"), makeString("testdatabase"), makeString("theuser"), makeString("thepassword"), makeString("sybase")), makeString("jdbc:jtds:sybase://dbms-server.cyc.com:2048/testdatabase;USER=theuser;PASSWORD=thepassword")),
	    list(list(makeString("dbms-server.cyc.com"), makeString("testdatabase"), makeString("theuser"), makeString("thepassword"), makeString("db2")), makeString("jdbc:db2://dbms-server.cyc.com:50001/TESTDATABASE:user=theuser;password=thepassword;")),
	    list(list(makeString("dbms-server.cyc.com"), makeString("testdatabase"), NIL, NIL, makeString("derby")), makeString("jdbc:derby://dbms-server.cyc.com:1527/testdatabase")),
	    list(list(makeString("dbms-server.cyc.com"), makeString("testdatabase"), NIL, NIL, makeString("com.cyc.project.mysentient.query.webScraper.Ents24SKSI")), makeString("jdbc:com.cyc.project.mysentient.query.webScraper.Ents24SKSI:testdatabase")),
	    list(list(makeString("dbms-server.cyc.com"), makeString("testdatabase"), makeString("theuser"), makeString("thepassword"), makeString("derby")), makeString("jdbc:derby://dbms-server.cyc.com:1527/testdatabase;user=theuser;password=thepassword")),
	    list(list(makeString("dbms-server.cyc.com"), makeString("testdatabase"), makeString("theuser"), makeString("thepassword"), makeString("derby"), makeInteger(15270)), makeString("jdbc:derby://dbms-server.cyc.com:15270/testdatabase;user=theuser;password=thepassword")),
	    list(list(makeString("dbms-server.cyc.com"), makeString("testdatabase"), makeString("theuser"), makeString("thepassword"), makeString("db2"), makeInteger(6501)), makeString("jdbc:db2://dbms-server.cyc.com:6501/TESTDATABASE:user=theuser;password=thepassword;")),
	    list(list(makeString("dbms-server.cyc.com"), makeString("iq-demo"), makeString("theuser"), makeString("thepassword"), makeString("sybase-iq")), makeString("jdbc:sybase:Tds:dbms-server.cyc.com:2638?ServiceName=iq-demo&USER=theuser&PASSWORD=thepassword")) });

    static private final SubLList $list_alt237 = list(new SubLObject[] { makeKeyword("TABLE-CAT"), makeKeyword("TABLE-SCHEM"), makeKeyword("TABLE-NAME"), makeKeyword("COLUMN-NAME"), makeKeyword("DATA-TYPE"), makeKeyword("TYPE-NAME"), makeKeyword("COLUMN-SIZE"), makeKeyword("BUFFER-LENGTH"),
	    makeKeyword("DECIMAL-DIGITS"), makeKeyword("NUM-PREC-RADIX"), makeKeyword("NULLABLE"), makeKeyword("REMARKS"), makeKeyword("COLUMN-DEF"), makeKeyword("SQL-DATA-TYPE"), makeKeyword("SQL-DATETIME-SUB"), makeKeyword("CHAR-OCTET-LENGTH"), makeKeyword("ORDINAL-POSITION"),
	    makeKeyword("IS-NULLABLE"), makeKeyword("SCOPE-CATLOG"), makeKeyword("SCOPE-SCHEMA"), makeKeyword("SCOPE-TABLE"), makeKeyword("SOURCE-DATA-TYPE") });

    static private final SubLList $list_alt239 = list(makeKeyword("TABLE-CAT"), makeKeyword("TABLE-SCHEM"), makeKeyword("TABLE-NAME"), makeKeyword("COLUMN-NAME"), makeKeyword("KEY-SEQ"), makeKeyword("PK-NAME"));

    static private final SubLList $list_alt241 = list(new SubLObject[] { makeKeyword("PKTABLE-CAT"), makeKeyword("PKTABLE-SCHEM"), makeKeyword("PKTABLE-NAME"), makeKeyword("PKCOLUMN-NAME"), makeKeyword("FKTABLE-CAT"), makeKeyword("FKTABLE-SCHEM"), makeKeyword("FKTABLE-NAME"),
	    makeKeyword("FKCOLUMN-NAME"), makeKeyword("KEY-SEQ"), makeKeyword("UPDATE-RULE"), makeKeyword("DELETE-RULE"), makeKeyword("FK-NAME"), makeKeyword("PK-NAME"), makeKeyword("DEFERRABILITY") });

    static private final SubLList $list_alt244 = list(new SubLObject[] { makeKeyword("TABLE-CAT"), makeKeyword("TABLE-SCHEM"), makeKeyword("TABLE-NAME"), makeKeyword("NON-UNIQUE"), makeKeyword("INDEX-QUALIFIER"), makeKeyword("INDEX-NAME"), $TYPE, makeKeyword("ORDINAL-POSITION"),
	    makeKeyword("COLUMN-NAME"), makeKeyword("ASC-OR-DESC"), makeKeyword("CARDINALITY"), makeKeyword("PAGES"), makeKeyword("FILTER-CONDITION") });

    static private final SubLList $list_alt245 = list(makeKeyword("RETURN"), makeKeyword("THROW"), $WARN);

    static private final SubLString $str_alt246$_a__a____a__a_user__a_password__a = makeString("~a:~a://~a/~a?user=~a&password=~a&charSet=ASCII");

    static private final SubLString $str_alt248$_a__a____a__a_user__a_password__a = makeString("~a:~a://~a/~a?user=~a&password=~a");

    static private final SubLString $str_alt250$_a__a_thin__a__a____a_1521__a = makeString("~a:~a:thin:~a/~a@//~a:1521/~a");

    static private final SubLString $str_alt252$_a__a__a____a_1433_DatabaseName__ = makeString("~a:~a:~a://~a:1433;DatabaseName=~a;SelectMethod=cursor;USER=~a;PASSWORD=~a");

    static private final SubLString $$$microsoft = makeString("microsoft");

    static private final SubLString $str_alt255$_a__a__a_UID__a_PWD__a = makeString("~a:~a:~a;UID=~a;PWD=~a");

    static private final SubLString $str_alt257$_a__a__a____a__a_USER__a_PASSWORD = makeString("~a:~a:~a://~a/~a;USER=~a;PASSWORD=~a");

    public static final SubLSymbol $sdbc_database_connection_url_descriptions$ = makeSymbol("*SDBC-DATABASE-CONNECTION-URL-DESCRIPTIONS*");

    static private final SubLString $$$jtds = makeString("jtds");

    static private final SubLString $str_alt259$com_cyc_ = makeString("com.cyc.");

    private static final SubLSymbol GET_ALL_SDBC_DATABASE_SUB_PROTOCOLS = makeSymbol("GET-ALL-SDBC-DATABASE-SUB-PROTOCOLS");

    static private final SubLString $str_alt260$_a__a__a = makeString("~a:~a:~a");

    static private final SubLString $str_alt261$unknown_jdbc_subprotocol___a = makeString("unknown jdbc subprotocol: ~a");

    private static final SubLString $str293$Separator_must_be_defined_as_stri = makeString("Separator must be defined as string, not ~A.");

    private static final SubLString $str295$Value_demarcator_must_be_specifie = makeString("Value demarcator must be specified as string, not ~A.");

    private static final SubLList $list296 = list(makeSymbol("&KEY"), makeSymbol("SUB-PROTOCOL"), makeSymbol("PATTERN"), list(makeSymbol("OPTION-NAMES")), list(makeSymbol("OPTION-PUNCTUATION")), makeSymbol("DEFAULTS"));

    static private final SubLList $list_alt266 = list(list(new SubLObject[] { makeSymbol("CONNECTION"), makeSymbol("DB"), makeSymbol("USER"), makeSymbol("PASSWORD"), makeSymbol("&KEY"), list(makeSymbol("DBMS-SERVER"), list(QUOTE, makeSymbol("*DBMS-SERVER*"))),
	    list(makeSymbol("PORT"), list(QUOTE, makeSymbol("*SQL-PORT*"))), list(makeSymbol("SUBPROTOCOL"), list(QUOTE, makeSymbol("*SQL-SUBPROTOCOL*"))), list(makeSymbol("PROXY-SERVER"), makeSymbol("DBMS-SERVER")),
	    list(makeSymbol("TIMEOUT"), list(QUOTE, makeSymbol("*SQL-CONNECTION-TIMEOUT*"))) }), makeSymbol("&BODY"), makeSymbol("BODY"));

    private static final SubLList $list297 = list(makeKeyword("SUB-PROTOCOL"), makeKeyword("PATTERN"), makeKeyword("OPTION-NAMES"), makeKeyword("OPTION-PUNCTUATION"), makeKeyword("DEFAULTS"));

    private static final SubLSymbol ADD_SDBC_DATABASE_CONNECTION_URL_DESCRIPTION = makeSymbol("ADD-SDBC-DATABASE-CONNECTION-URL-DESCRIPTION");

    private static final SubLList $list299 = list(new SubLObject[] { makeKeyword("PROTOCOL"), makeString(":"), makeKeyword("SUB-PROTOCOL"), makeString("://"), makeKeyword("DBMS-SERVER"), makeString(":"), $PORT, makeString("/"), makeKeyword("DATABASE") });

    static private final SubLList $list300 = list($USER, makeString("user"), makeKeyword("PASSWORD"), makeString("password"), makeKeyword("CHAR-SET"), makeString("charSet"));

    static private final SubLList $list_alt267 = list(makeKeyword("DBMS-SERVER"), $PORT, makeKeyword("SUBPROTOCOL"), makeKeyword("PROXY-SERVER"), makeKeyword("TIMEOUT"));

    private static final SubLList $list301 = list(makeKeyword("START"), makeString("?"), makeKeyword("SEPARATOR"), makeString("&"), makeKeyword("VALUE"), makeString("="));

    private static final SubLList $list302 = list($PORT, makeInteger(5432), makeKeyword("CHAR-SET"), makeString("ASCII"));

    private static final SubLString $$$mysql = makeString("mysql");

    private static final SubLList $list304 = list($USER, makeString("user"), makeKeyword("PASSWORD"), makeString("password"));

    static private final SubLList $list_alt278 = list(list(new SubLObject[] { makeSymbol("STATEMENT"), makeSymbol("DB"), makeSymbol("USER"), makeSymbol("PASSWORD"), makeSymbol("&KEY"), list(makeSymbol("DBMS-SERVER"), list(QUOTE, makeSymbol("*DBMS-SERVER*"))),
	    list(makeSymbol("PORT"), list(QUOTE, makeSymbol("*SQL-PORT*"))), list(makeSymbol("SUBPROTOCOL"), list(QUOTE, makeSymbol("*SQL-SUBPROTOCOL*"))), list(makeSymbol("PROXY-SERVER"), makeSymbol("DBMS-SERVER")),
	    list(makeSymbol("TIMEOUT"), list(QUOTE, makeSymbol("*SQL-CONNECTION-TIMEOUT*"))) }), makeSymbol("&BODY"), makeSymbol("BODY"));

    private static final SubLList $list305 = list($PORT, makeInteger(3306));

    private static final SubLString $$$oracle = makeString("oracle");

    private static final SubLList $list307 = list(new SubLObject[] { makeKeyword("PROTOCOL"), makeString(":"), makeKeyword("SUB-PROTOCOL"), makeString(":thin:"), $USER, makeString("/"), makeKeyword("PASSWORD"), makeString("@//"), makeKeyword("DBMS-SERVER"), makeString(":"),
	    $PORT, makeString("/"), makeKeyword("DATABASE") });

    static private final SubLSymbol $sym279$CONNECTION = makeUninternedSymbol("CONNECTION");

    static private final SubLList $list308 = list($PORT, makeInteger(1521));

    private static final SubLString $$$sqlserver = makeString("sqlserver");

    private static final SubLList $list310 = list(makeKeyword("PROTOCOL"), makeString(":"), makeKeyword("SUB-PROTOCOL"), makeString("://"), makeKeyword("DBMS-SERVER"), makeString(":"), $PORT);

    static private final SubLList $list_alt283 = list(list(new SubLObject[] { makeSymbol("STATEMENT"), makeSymbol("SQL"), makeSymbol("DB"), makeSymbol("USER"), makeSymbol("PASSWORD"), makeSymbol("&KEY"), list(makeSymbol("DBMS-SERVER"), list(QUOTE, makeSymbol("*DBMS-SERVER*"))),
	    list(makeSymbol("PORT"), list(QUOTE, makeSymbol("*SQL-PORT*"))), list(makeSymbol("SUBPROTOCOL"), list(QUOTE, makeSymbol("*SQL-SUBPROTOCOL*"))), list(makeSymbol("PROXY-SERVER"), makeSymbol("DBMS-SERVER")),
	    list(makeSymbol("TIMEOUT"), list(QUOTE, makeSymbol("*SQL-CONNECTION-TIMEOUT*"))) }), makeSymbol("&BODY"), makeSymbol("BODY"));

    private static final SubLList $list311 = list(makeKeyword("DATABASE"), makeString("DatabaseName"), makeKeyword("SELECT-METHOD"), makeString("SelectMethod"), $USER, makeString("USER"), makeKeyword("PASSWORD"), makeString("PASSWORD"));

    private static final SubLList $list312 = list(makeKeyword("START"), makeKeyword("SEPARATOR"), makeKeyword("SEPARATOR"), makeString(";"), makeKeyword("VALUE"), makeString("="));

    private static final SubLList $list313 = list($PORT, makeInteger(1433), makeKeyword("SELECT-METHOD"), makeString("cursor"));

    static private final SubLSymbol $sym284$CONNECTION = makeUninternedSymbol("CONNECTION");

    private static final SubLString $str314$microsoft_sqlserver = makeString("microsoft-sqlserver");

    private static final SubLList $list315 = list(makeKeyword("PROTOCOL"), makeString(":microsoft:"), makeString("sqlserver"), makeString("://"), makeKeyword("DBMS-SERVER"), makeString(":"), $PORT);

    static private final SubLList $list_alt286 = list(list(makeSymbol("STATEMENT"), makeSymbol("ERROR")), makeSymbol("&BODY"), makeSymbol("BODY"));

    private static final SubLString $$$odbc = makeString("odbc");

    static private final SubLSymbol $sym287$CONNECTION = makeUninternedSymbol("CONNECTION");

    static private final SubLList $list317 = list(makeKeyword("PROTOCOL"), makeString(":"), makeKeyword("SUB-PROTOCOL"), makeString(":"), makeKeyword("DATABASE"));

    static private final SubLSymbol $sym288$AUTO_COMMIT = makeUninternedSymbol("AUTO-COMMIT");

    static private final SubLSymbol $sym289$COMMIT_ERROR = makeUninternedSymbol("COMMIT-ERROR");

    private static final SubLList $list318 = list($USER, makeString("UID"), makeKeyword("PASSWORD"), makeString("PWD"));

    static private final SubLSymbol $sym290$ROLLBACK_RESULT = makeUninternedSymbol("ROLLBACK-RESULT");

    private static final SubLString $$$sybase = makeString("sybase");

    static private final SubLSymbol $sym291$AUTO_COMMIT_RESULT = makeUninternedSymbol("AUTO-COMMIT-RESULT");

    private static final SubLList $list320 = list(new SubLObject[] { makeKeyword("PROTOCOL"), makeString(":jtds:"), makeKeyword("SUB-PROTOCOL"), makeString("://"), makeKeyword("DBMS-SERVER"), makeString(":"), $PORT, makeString("/"), makeKeyword("DATABASE") });

    static private final SubLSymbol $sym292$ERRORS = makeUninternedSymbol("ERRORS");

    static private final SubLList $list_alt295 = list(makeKeyword("THROW"));

    private static final SubLList $list321 = list($USER, makeString("USER"), makeKeyword("PASSWORD"), makeString("PASSWORD"));

    private static final SubLList $list322 = list($PORT, makeInteger(2048));

    static private final SubLList $list_alt298 = list(NIL);

    private static final SubLString $$$derby = makeString("derby");

    static private final SubLList $list_alt300 = list(makeKeyword("RETURN"));

    private static final SubLList $list324 = list($PORT, makeInteger(1527));

    private static final SubLString $$$st = makeString("st");

    private static final SubLList $list326 = list($USER, makeString("userName"), makeKeyword("PASSWORD"), makeString("passWord"), makeKeyword("FORMAT"), makeString("format"));

    static private final SubLList $list_alt303 = list(T);

    private static final SubLList $list327 = list($PORT, makeInteger(8084), makeKeyword("FORMAT"), makeString("xhtml"));

    static private final SubLString $str_alt305$An_unknown_error_occurred_during_ = makeString("An unknown error occurred during execution");

    private static final SubLString $$$poiseschema = makeString("poiseschema");

    private static final SubLList $list329 = list(makeKeyword("PROTOCOL"), makeString(":"), makeKeyword("SUB-PROTOCOL"), makeString(":"));

    static private final SubLList $list_alt306 = list(list(new SubLObject[] { makeSymbol("STATEMENT"), makeSymbol("ERROR"), makeSymbol("DB"), makeSymbol("USER"), makeSymbol("PASSWORD"), makeSymbol("&KEY"), list(makeSymbol("DBMS-SERVER"), list(QUOTE, makeSymbol("*DBMS-SERVER*"))),
	    list(makeSymbol("PORT"), list(QUOTE, makeSymbol("*SQL-PORT*"))), list(makeSymbol("SUBPROTOCOL"), list(QUOTE, makeSymbol("*SQL-SUBPROTOCOL*"))), list(makeSymbol("PROXY-SERVER"), makeSymbol("DBMS-SERVER")),
	    list(makeSymbol("TIMEOUT"), list(QUOTE, makeSymbol("*SQL-CONNECTION-TIMEOUT*"))) }), makeSymbol("&BODY"), makeSymbol("BODY"));

    private static final SubLString $$$poisedata = makeString("poisedata");

    private static final SubLSymbol $sym331$_SDBC_DB2_PORT_ = makeSymbol("*SDBC-DB2-PORT*");

    private static final SubLInteger $int$50001 = makeInteger(50001);

    private static final SubLSymbol SET_SDBC_DB2_PORT = makeSymbol("SET-SDBC-DB2-PORT");

    private static final SubLString $$$db2 = makeString("db2");

    private static final SubLList $list335 = list(new SubLObject[] { makeKeyword("PROTOCOL"), makeString(":"), makeKeyword("SUB-PROTOCOL"), makeString("://"), makeKeyword("DBMS-SERVER"), makeString(":"), $PORT, makeString("/"), list(makeKeyword("UPCASE"), makeKeyword("DATABASE")) });

    static private final SubLList $list_alt308 = list(list(new SubLObject[] { makeSymbol("RS"), makeSymbol("QUERY"), makeSymbol("DB"), makeSymbol("USER"), makeSymbol("PASSWORD"), makeSymbol("&KEY"), list(makeSymbol("DBMS-SERVER"), list(QUOTE, makeSymbol("*DBMS-SERVER*"))),
	    list(makeSymbol("PORT"), list(QUOTE, makeSymbol("*SQL-PORT*"))), list(makeSymbol("SUBPROTOCOL"), list(QUOTE, makeSymbol("*SQL-SUBPROTOCOL*"))), list(makeSymbol("PROXY-SERVER"), makeSymbol("DBMS-SERVER")),
	    list(makeSymbol("TIMEOUT"), list(QUOTE, makeSymbol("*SQL-CONNECTION-TIMEOUT*"))) }), makeSymbol("&BODY"), makeSymbol("BODY"));

    private static final SubLList $list336 = list(makeKeyword("START"), makeString(":"), makeKeyword("SEPARATOR"), makeString(";"), makeKeyword("VALUE"), makeString("="), makeKeyword("TERMINATOR"), makeString(";"));

    private static final SubLList $list337 = list($PORT, makeSymbol("*SDBC-DB2-PORT*"));

    public static final SubLSymbol $sdbc_sybase_iq_port$ = makeSymbol("*SDBC-SYBASE-IQ-PORT*");

    private static final SubLInteger $int$2638 = makeInteger(2638);

    private static final SubLSymbol SET_SDBC_SYBASE_IQ_PORT = makeSymbol("SET-SDBC-SYBASE-IQ-PORT");

    private static final SubLString $str341$sybase_iq = makeString("sybase-iq");

    static private final SubLSymbol $sym309$STATEMENT = makeUninternedSymbol("STATEMENT");

    private static final SubLList $list342 = list(makeKeyword("PROTOCOL"), makeString(":sybase:Tds:"), makeKeyword("DBMS-SERVER"), makeString(":"), $PORT, makeString("?ServiceName="), makeKeyword("DATABASE"));

    private static final SubLList $list343 = list(makeKeyword("START"), makeKeyword("SEPARATOR"), makeKeyword("SEPARATOR"), makeString("&"), makeKeyword("VALUE"), makeString("="));

    static private final SubLString $str_alt316$SELECT___FROM_ = makeString("SELECT * FROM ");

    static private final SubLList $list_alt317 = list(CHAR_period);

    private static final SubLList $list344 = list($PORT, makeSymbol("*SDBC-SYBASE-IQ-PORT*"));

    static private final SubLString $str_alt318$INSERT_INTO__a_VALUES______ = makeString("INSERT INTO ~a VALUES(?, ?)");

    private static final SubLString $str345$unknown_jdbc_subprotocol___a = makeString("unknown jdbc subprotocol: ~a");

    static private final SubLString $str_alt319$SELECT_number2_FROM__a_WHERE_numb = makeString("SELECT number2 FROM ~a WHERE number1 = ?");

    private static final SubLList $list348 = list(makeSymbol("FUNCTOR"), makeSymbol("ITEM"));

    static private final SubLString $str_alt320$CREATE_TABLE_ = makeString("CREATE TABLE ");

    private static final SubLString $str350$Functor__A_not_implemented_yet_ = makeString("Functor ~A not implemented yet.");

    static private final SubLString $str_alt321$__number1_INT_PRIMARY_KEY__number = makeString(" (number1 INT PRIMARY KEY, number2 INT)");

    private static final SubLString $str351$Pattern__S_contains__S__which_is_ = makeString("Pattern ~S contains ~S, which is neither STRINGP nor KEYWORDP");

    static private final SubLString $str_alt322$validation_failed_for__a__result_ = makeString("validation failed for ~a: result ~a");

    private static final SubLString $str352$Element__A_is_neither_a_STRINGP_n = makeString("Element ~A is neither a STRINGP nor a KEYWORD.");

    static private final SubLString $str_alt323$DROP_TABLE_ = makeString("DROP TABLE ");

    static private final SubLString $str_alt324$INSERT_INTO_ = makeString("INSERT INTO ");

    private static final SubLString $str353$No_value_provided_for__S_in_eithe = makeString("No value provided for ~S in either properties ~S or defaults ~S.");

    static private final SubLString $str_alt325$_VALUES_ = makeString(" VALUES(");

    private static final SubLInteger $int$_2147483649 = makeInteger("-2147483649");

    static private final SubLString $str_alt326$__ = makeString(", ");

    private static final SubLInteger $int$2147483648 = makeInteger("2147483648");

    static private final SubLString $str_alt327$_ = makeString(")");

    static private final SubLString $str_alt328$SELECT_number2_FROM_ = makeString("SELECT number2 FROM ");

    private static final SubLInteger $int$_9223372036854775809 = makeInteger("-9223372036854775809");

    static private final SubLString $str_alt329$_WHERE_number1___ = makeString(" WHERE number1 = ");

    private static final SubLInteger $int$9223372036854775808 = makeInteger("9223372036854775808");

    private static final SubLList $list358 = list(list(new SubLObject[] { makeSymbol("CONNECTION"), makeSymbol("DB"), makeSymbol("USER"), makeSymbol("PASSWORD"), makeSymbol("&KEY"), list(makeSymbol("DBMS-SERVER"), list(QUOTE, makeSymbol("*DBMS-SERVER*"))),
	    list(makeSymbol("PORT"), list(QUOTE, makeSymbol("*SQL-PORT*"))), list(makeSymbol("SUBPROTOCOL"), list(QUOTE, makeSymbol("*SQL-SUBPROTOCOL*"))), list(makeSymbol("PROXY-SERVER"), makeSymbol("DBMS-SERVER")),
	    list(makeSymbol("TIMEOUT"), list(QUOTE, makeSymbol("*SQL-CONNECTION-TIMEOUT*"))) }), makeSymbol("&BODY"), makeSymbol("BODY"));

    private static final SubLList $list359 = list(makeKeyword("DBMS-SERVER"), $PORT, makeKeyword("SUBPROTOCOL"), makeKeyword("PROXY-SERVER"), makeKeyword("TIMEOUT"));

    public static final SubLSymbol $sql_subprotocol$ = makeSymbol("*SQL-SUBPROTOCOL*");

    public static final SubLSymbol $sql_connection_timeout$ = makeSymbol("*SQL-CONNECTION-TIMEOUT*");

    private static final SubLSymbol NEW_SQL_CONNECTION = makeSymbol("NEW-SQL-CONNECTION");

    private static final SubLSymbol SQLC_CLOSE = makeSymbol("SQLC-CLOSE");

    private static final SubLList $list370 = list(list(new SubLObject[] { makeSymbol("STATEMENT"), makeSymbol("DB"), makeSymbol("USER"), makeSymbol("PASSWORD"), makeSymbol("&KEY"), list(makeSymbol("DBMS-SERVER"), list(QUOTE, makeSymbol("*DBMS-SERVER*"))),
	    list(makeSymbol("PORT"), list(QUOTE, makeSymbol("*SQL-PORT*"))), list(makeSymbol("SUBPROTOCOL"), list(QUOTE, makeSymbol("*SQL-SUBPROTOCOL*"))), list(makeSymbol("PROXY-SERVER"), makeSymbol("DBMS-SERVER")),
	    list(makeSymbol("TIMEOUT"), list(QUOTE, makeSymbol("*SQL-CONNECTION-TIMEOUT*"))) }), makeSymbol("&BODY"), makeSymbol("BODY"));

    private static final SubLSymbol $sym371$CONNECTION = makeUninternedSymbol("CONNECTION");

    private static final SubLSymbol WITH_SQL_CONNECTION = makeSymbol("WITH-SQL-CONNECTION");

    private static final SubLSymbol SQLC_CREATE_STATEMENT = makeSymbol("SQLC-CREATE-STATEMENT");

    private static final SubLList $list375 = list(list(new SubLObject[] { makeSymbol("STATEMENT"), makeSymbol("SQL"), makeSymbol("DB"), makeSymbol("USER"), makeSymbol("PASSWORD"), makeSymbol("&KEY"), list(makeSymbol("DBMS-SERVER"), list(QUOTE, makeSymbol("*DBMS-SERVER*"))),
	    list(makeSymbol("PORT"), list(QUOTE, makeSymbol("*SQL-PORT*"))), list(makeSymbol("SUBPROTOCOL"), list(QUOTE, makeSymbol("*SQL-SUBPROTOCOL*"))), list(makeSymbol("PROXY-SERVER"), makeSymbol("DBMS-SERVER")),
	    list(makeSymbol("TIMEOUT"), list(QUOTE, makeSymbol("*SQL-CONNECTION-TIMEOUT*"))) }), makeSymbol("&BODY"), makeSymbol("BODY"));

    private static final SubLSymbol $sym376$CONNECTION = makeUninternedSymbol("CONNECTION");

    private static final SubLSymbol SQLC_PREPARE_STATEMENT = makeSymbol("SQLC-PREPARE-STATEMENT");

    private static final SubLList $list378 = list(list(makeSymbol("STATEMENT"), makeSymbol("ERROR")), makeSymbol("&BODY"), makeSymbol("BODY"));

    private static final SubLSymbol $sym379$CONNECTION = makeUninternedSymbol("CONNECTION");

    private static final SubLSymbol $sym380$AUTO_COMMIT = makeUninternedSymbol("AUTO-COMMIT");

    private static final SubLSymbol $sym381$COMMIT_ERROR = makeUninternedSymbol("COMMIT-ERROR");

    private static final SubLSymbol $sym382$ROLLBACK_RESULT = makeUninternedSymbol("ROLLBACK-RESULT");

    private static final SubLSymbol $sym383$AUTO_COMMIT_RESULT = makeUninternedSymbol("AUTO-COMMIT-RESULT");

    private static final SubLSymbol $sym384$ERRORS = makeUninternedSymbol("ERRORS");

    private static final SubLSymbol SQLC_GET_AUTO_COMMIT = makeSymbol("SQLC-GET-AUTO-COMMIT");

    private static final SubLList $list387 = list(makeKeyword("THROW"));

    private static final SubLSymbol SQLC_SET_AUTO_COMMIT = makeSymbol("SQLC-SET-AUTO-COMMIT");

    private static final SubLList $list390 = list(NIL);

    private static final SubLSymbol SQLC_COMMIT = makeSymbol("SQLC-COMMIT");

    private static final SubLList $list392 = list(makeKeyword("RETURN"));

    private static final SubLSymbol SQLS_HANDLE_COMMIT_ERROR = makeSymbol("SQLS-HANDLE-COMMIT-ERROR");

    private static final SubLSymbol SQLS_HANDLE_ROLLBACK = makeSymbol("SQLS-HANDLE-ROLLBACK");

    private static final SubLList $list395 = list(T);

    private static final SubLSymbol SQLS_HANDLE_TRANSACTION_ERRORS = makeSymbol("SQLS-HANDLE-TRANSACTION-ERRORS");

    private static final SubLString $str397$An_unknown_error_occurred_during_ = makeString("An unknown error occurred during execution");

    private static final SubLList $list398 = list(list(new SubLObject[] { makeSymbol("STATEMENT"), makeSymbol("ERROR"), makeSymbol("DB"), makeSymbol("USER"), makeSymbol("PASSWORD"), makeSymbol("&KEY"), list(makeSymbol("DBMS-SERVER"), list(QUOTE, makeSymbol("*DBMS-SERVER*"))),
	    list(makeSymbol("PORT"), list(QUOTE, makeSymbol("*SQL-PORT*"))), list(makeSymbol("SUBPROTOCOL"), list(QUOTE, makeSymbol("*SQL-SUBPROTOCOL*"))), list(makeSymbol("PROXY-SERVER"), makeSymbol("DBMS-SERVER")),
	    list(makeSymbol("TIMEOUT"), list(QUOTE, makeSymbol("*SQL-CONNECTION-TIMEOUT*"))) }), makeSymbol("&BODY"), makeSymbol("BODY"));

    private static final SubLSymbol WITH_SQL_STATEMENT = makeSymbol("WITH-SQL-STATEMENT");

    private static final SubLList $list400 = list(list(new SubLObject[] { makeSymbol("RS"), makeSymbol("QUERY"), makeSymbol("DB"), makeSymbol("USER"), makeSymbol("PASSWORD"), makeSymbol("&KEY"), list(makeSymbol("DBMS-SERVER"), list(QUOTE, makeSymbol("*DBMS-SERVER*"))),
	    list(makeSymbol("PORT"), list(QUOTE, makeSymbol("*SQL-PORT*"))), list(makeSymbol("SUBPROTOCOL"), list(QUOTE, makeSymbol("*SQL-SUBPROTOCOL*"))), list(makeSymbol("PROXY-SERVER"), makeSymbol("DBMS-SERVER")),
	    list(makeSymbol("TIMEOUT"), list(QUOTE, makeSymbol("*SQL-CONNECTION-TIMEOUT*"))) }), makeSymbol("&BODY"), makeSymbol("BODY"));

    private static final SubLSymbol $sym401$STATEMENT = makeUninternedSymbol("STATEMENT");

    private static final SubLSymbol SQLS_EXECUTE_QUERY = makeSymbol("SQLS-EXECUTE-QUERY");

    private static final SubLSymbol WITH_SQL_RESULT_SET = makeSymbol("WITH-SQL-RESULT-SET");

    private static final SubLSymbol SQLRS_NEXT = makeSymbol("SQLRS-NEXT");

    private static final SubLString $str408$SELECT___FROM_ = makeString("SELECT * FROM ");

    private static final SubLList $list409 = list(CHAR_period);

    private static final SubLString $str410$INSERT_INTO__a_VALUES______ = makeString("INSERT INTO ~a VALUES(?, ?)");

    private static final SubLString $str411$SELECT_number2_FROM__a_WHERE_numb = makeString("SELECT number2 FROM ~a WHERE number1 = ?");

    private static final SubLString $$$CREATE_TABLE_ = makeString("CREATE TABLE ");

    private static final SubLString $str413$__number1_INT_PRIMARY_KEY__number = makeString(" (number1 INT PRIMARY KEY, number2 INT)");

    private static final SubLString $str414$validation_failed_for__a__result_ = makeString("validation failed for ~a: result ~a");

    private static final SubLString $$$DROP_TABLE_ = makeString("DROP TABLE ");

    private static final SubLString $$$INSERT_INTO_ = makeString("INSERT INTO ");

    private static final SubLString $str417$_VALUES_ = makeString(" VALUES(");

    private static final SubLString $str418$__ = makeString(", ");

    private static final SubLString $str419$_ = makeString(")");

    private static final SubLString $$$SELECT_number2_FROM_ = makeString("SELECT number2 FROM ");

    private static final SubLString $str421$_WHERE_number1___ = makeString(" WHERE number1 = ");

    
}
