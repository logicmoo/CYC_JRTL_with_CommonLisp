package com.cyc.cycjava.cycl;

import static com.cyc.cycjava.cycl.access_macros.register_external_symbol;
import static com.cyc.cycjava.cycl.subl_macro_promotions.$catch_error_message_target$;
import static com.cyc.cycjava.cycl.subl_macro_promotions.validate_tcp_connection;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.cons;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.nth;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality.identity;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions.funcall;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.cconcatenate;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.nreverse;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures.def_csetf;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures.makeStructDeclNative;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures.register_method;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.symbol_function;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.$is_thread_performing_cleanupP$;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.getValuesAsVector;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.restoreValuesFromVector;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.values;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeInteger;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeKeyword;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeString;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeSymbol;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.cadr;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.cddr;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high.$print_object_method_table$;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader.parse_integer;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.close;
import static com.cyc.tool.subl.util.SubLFiles.declareFunction;
import static com.cyc.tool.subl.util.SubLFiles.defconstant;
import static com.cyc.tool.subl.util.SubLFiles.defparameter;

import org.armedbear.lisp.Lisp;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
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
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.visitation;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class zookeeper extends SubLTranslatedFile implements V10 {
    public static final SubLFile me = new zookeeper();



    // defparameter
    public static final SubLSymbol $zookeeper_rest_servers$ = makeSymbol("*ZOOKEEPER-REST-SERVERS*");

    // defparameter
    public static final SubLSymbol $zookeeper_rest_port$ = makeSymbol("*ZOOKEEPER-REST-PORT*");

    // defparameter
    public static final SubLSymbol $zookeeper_rest_timeout$ = makeSymbol("*ZOOKEEPER-REST-TIMEOUT*");

    // defconstant
    public static final SubLSymbol $dtp_zk_child_state$ = makeSymbol("*DTP-ZK-CHILD-STATE*");

    // defconstant
    public static final SubLSymbol $dtp_zk_node_state$ = makeSymbol("*DTP-ZK-NODE-STATE*");

    private static final SubLString $$$localhost = makeString("localhost");

    private static final SubLInteger $int$9998 = makeInteger(9998);

    private static final SubLInteger $int$60 = makeInteger(60);

    private static final SubLSymbol ZK_GET_NODE_CHILDREN = makeSymbol("ZK-GET-NODE-CHILDREN");

    private static final SubLString $str4$view_children = makeString("view=children");

    private static final SubLList $list6 = list(makeString("application/xml"));

    private static final SubLSymbol ZK_CHILD_STATE = makeSymbol("ZK-CHILD-STATE");

    private static final SubLSymbol ZK_CHILD_STATE_P = makeSymbol("ZK-CHILD-STATE-P");

    private static final SubLList $list9 = list(makeSymbol("PATH"), makeSymbol("URI"), makeSymbol("CHILD-URI-TEMPLATE"), makeSymbol("CHILDREN"));

    private static final SubLList $list10 = list($PATH, makeKeyword("URI"), makeKeyword("CHILD-URI-TEMPLATE"), makeKeyword("CHILDREN"));

    private static final SubLList $list11 = list(makeSymbol("ZKKIDS-PATH"), makeSymbol("ZKKIDS-URI"), makeSymbol("ZKKIDS-CHILD-URI-TEMPLATE"), makeSymbol("ZKKIDS-CHILDREN"));

    private static final SubLList $list12 = list(makeSymbol("_CSETF-ZKKIDS-PATH"), makeSymbol("_CSETF-ZKKIDS-URI"), makeSymbol("_CSETF-ZKKIDS-CHILD-URI-TEMPLATE"), makeSymbol("_CSETF-ZKKIDS-CHILDREN"));

    private static final SubLSymbol ZK_CHILD_STATE_PRINT_FUNCTION_TRAMPOLINE = makeSymbol("ZK-CHILD-STATE-PRINT-FUNCTION-TRAMPOLINE");

    private static final SubLList $list15 = list(makeSymbol("OPTIMIZE-FUNCALL"), makeSymbol("ZK-CHILD-STATE-P"));

    private static final SubLSymbol ZKKIDS_PATH = makeSymbol("ZKKIDS-PATH");

    private static final SubLSymbol _CSETF_ZKKIDS_PATH = makeSymbol("_CSETF-ZKKIDS-PATH");

    private static final SubLSymbol ZKKIDS_URI = makeSymbol("ZKKIDS-URI");

    private static final SubLSymbol _CSETF_ZKKIDS_URI = makeSymbol("_CSETF-ZKKIDS-URI");

    private static final SubLSymbol ZKKIDS_CHILD_URI_TEMPLATE = makeSymbol("ZKKIDS-CHILD-URI-TEMPLATE");

    private static final SubLSymbol _CSETF_ZKKIDS_CHILD_URI_TEMPLATE = makeSymbol("_CSETF-ZKKIDS-CHILD-URI-TEMPLATE");

    private static final SubLSymbol ZKKIDS_CHILDREN = makeSymbol("ZKKIDS-CHILDREN");

    private static final SubLSymbol _CSETF_ZKKIDS_CHILDREN = makeSymbol("_CSETF-ZKKIDS-CHILDREN");

    private static final SubLSymbol $CHILD_URI_TEMPLATE = makeKeyword("CHILD-URI-TEMPLATE");

    private static final SubLString $str28$Invalid_slot__S_for_construction_ = makeString("Invalid slot ~S for construction function");

    private static final SubLSymbol MAKE_ZK_CHILD_STATE = makeSymbol("MAKE-ZK-CHILD-STATE");

    private static final SubLSymbol VISIT_DEFSTRUCT_OBJECT_ZK_CHILD_STATE_METHOD = makeSymbol("VISIT-DEFSTRUCT-OBJECT-ZK-CHILD-STATE-METHOD");

    private static final SubLString $$$child = makeString("child");

    private static final SubLString $$$path = makeString("path");

    private static final SubLString $$$uri = makeString("uri");

    private static final SubLString $str37$child_uri_template = makeString("child_uri_template");

    private static final SubLString $$$children = makeString("children");

    private static final SubLString $str39$Unexpected_XML_tag__A___ = makeString("Unexpected XML tag ~A.~%");

    private static final SubLString $str40$Unexpected_token_stream__A_ = makeString("Unexpected token stream ~A.");

    private static final SubLSymbol ZK_SET_NODE_DATA = makeSymbol("ZK-SET-NODE-DATA");

    private static final SubLInteger $int$80 = makeInteger(80);

    private static final SubLSymbol $kw52$KEEP_ALIVE_ = makeKeyword("KEEP-ALIVE?");

    private static final SubLSymbol $kw53$WIDE_NEWLINES_ = makeKeyword("WIDE-NEWLINES?");

    private static final SubLString $str56$application_octet_stream = makeString("application/octet-stream");

    private static final SubLSymbol $SOAP_ACTION_URI = makeKeyword("SOAP-ACTION-URI");

    private static final SubLSymbol $sym58$_EXIT = makeSymbol("%EXIT");

    private static final SubLString $str59$n_a = makeString("n/a");

    private static final SubLString $str60$no_connection = makeString("no-connection");

    private static final SubLString $str61$Could_not_create_node_on_any_serv = makeString("Could not create node on any server: ~A.");

    private static final SubLString $str62$HTTP_1_1_200_OK = makeString("HTTP/1.1 200 OK");

    private static final SubLString $str63$HTTP_1_1_404_Not_Found = makeString("HTTP/1.1 404 Not Found");

    private static final SubLString $str64$No_such_node_ = makeString("No such node.");

    private static final SubLString $$$Unexpected_HTTP_header_ = makeString("Unexpected HTTP header ");

    private static final SubLString $str66$_ = makeString(".");

    private static final SubLSymbol ZK_DELETE_NODE = makeSymbol("ZK-DELETE-NODE");

    private static final SubLString $str69$ = makeString("");

    private static final SubLString $str70$HTTP_1_1_204_No_Content = makeString("HTTP/1.1 204 No Content");

    private static final SubLSymbol ZK_GET_NODE_STATE = makeSymbol("ZK-GET-NODE-STATE");

    private static final SubLString $str72$dataformat_utf8 = makeString("dataformat=utf8");

    private static final SubLSymbol ZK_NODE_STATE = makeSymbol("ZK-NODE-STATE");

    private static final SubLSymbol ZK_NODE_STATE_P = makeSymbol("ZK-NODE-STATE-P");

    private static final SubLList $list75 = list(new SubLObject[] { makeSymbol("PATH"), makeSymbol("URI"), makeSymbol("DATA"), makeSymbol("CZXID"), makeSymbol("MZXID"), makeSymbol("CTIME"), makeSymbol("MTIME"), makeSymbol("VERSION"), makeSymbol("CVERSION"), makeSymbol("AVERSION"),
	    makeSymbol("EPHEMERAL-OWNER"), makeSymbol("DATA-LEN"), makeSymbol("NUM-CHILDREN"), makeSymbol("PZXID") });

    private static final SubLList $list76 = list(new SubLObject[] { $PATH, makeKeyword("URI"), $DATA, makeKeyword("CZXID"), makeKeyword("MZXID"), makeKeyword("CTIME"), makeKeyword("MTIME"), makeKeyword("VERSION"), makeKeyword("CVERSION"), makeKeyword("AVERSION"),
	    makeKeyword("EPHEMERAL-OWNER"), makeKeyword("DATA-LEN"), makeKeyword("NUM-CHILDREN"), makeKeyword("PZXID") });

    private static final SubLList $list77 = list(new SubLObject[] { makeSymbol("ZKSTAT-PATH"), makeSymbol("ZKSTAT-URI"), makeSymbol("ZKSTAT-DATA"), makeSymbol("ZKSTAT-CZXID"), makeSymbol("ZKSTAT-MZXID"), makeSymbol("ZKSTAT-CTIME"), makeSymbol("ZKSTAT-MTIME"), makeSymbol("ZKSTAT-VERSION"),
	    makeSymbol("ZKSTAT-CVERSION"), makeSymbol("ZKSTAT-AVERSION"), makeSymbol("ZKSTAT-EPHEMERAL-OWNER"), makeSymbol("ZKSTAT-DATA-LEN"), makeSymbol("ZKSTAT-NUM-CHILDREN"), makeSymbol("ZKSTAT-PZXID") });

    private static final SubLList $list78 = list(
	    new SubLObject[] { makeSymbol("_CSETF-ZKSTAT-PATH"), makeSymbol("_CSETF-ZKSTAT-URI"), makeSymbol("_CSETF-ZKSTAT-DATA"), makeSymbol("_CSETF-ZKSTAT-CZXID"), makeSymbol("_CSETF-ZKSTAT-MZXID"), makeSymbol("_CSETF-ZKSTAT-CTIME"), makeSymbol("_CSETF-ZKSTAT-MTIME"),
		    makeSymbol("_CSETF-ZKSTAT-VERSION"), makeSymbol("_CSETF-ZKSTAT-CVERSION"), makeSymbol("_CSETF-ZKSTAT-AVERSION"), makeSymbol("_CSETF-ZKSTAT-EPHEMERAL-OWNER"), makeSymbol("_CSETF-ZKSTAT-DATA-LEN"), makeSymbol("_CSETF-ZKSTAT-NUM-CHILDREN"), makeSymbol("_CSETF-ZKSTAT-PZXID") });

    private static final SubLSymbol ZK_NODE_STATE_PRINT_FUNCTION_TRAMPOLINE = makeSymbol("ZK-NODE-STATE-PRINT-FUNCTION-TRAMPOLINE");

    private static final SubLList $list80 = list(makeSymbol("OPTIMIZE-FUNCALL"), makeSymbol("ZK-NODE-STATE-P"));

    private static final SubLSymbol ZKSTAT_PATH = makeSymbol("ZKSTAT-PATH");

    private static final SubLSymbol _CSETF_ZKSTAT_PATH = makeSymbol("_CSETF-ZKSTAT-PATH");

    private static final SubLSymbol ZKSTAT_URI = makeSymbol("ZKSTAT-URI");

    private static final SubLSymbol _CSETF_ZKSTAT_URI = makeSymbol("_CSETF-ZKSTAT-URI");

    private static final SubLSymbol ZKSTAT_DATA = makeSymbol("ZKSTAT-DATA");

    private static final SubLSymbol _CSETF_ZKSTAT_DATA = makeSymbol("_CSETF-ZKSTAT-DATA");

    private static final SubLSymbol ZKSTAT_CZXID = makeSymbol("ZKSTAT-CZXID");

    private static final SubLSymbol _CSETF_ZKSTAT_CZXID = makeSymbol("_CSETF-ZKSTAT-CZXID");

    private static final SubLSymbol ZKSTAT_MZXID = makeSymbol("ZKSTAT-MZXID");

    private static final SubLSymbol _CSETF_ZKSTAT_MZXID = makeSymbol("_CSETF-ZKSTAT-MZXID");

    private static final SubLSymbol ZKSTAT_CTIME = makeSymbol("ZKSTAT-CTIME");

    private static final SubLSymbol _CSETF_ZKSTAT_CTIME = makeSymbol("_CSETF-ZKSTAT-CTIME");

    private static final SubLSymbol ZKSTAT_MTIME = makeSymbol("ZKSTAT-MTIME");

    private static final SubLSymbol _CSETF_ZKSTAT_MTIME = makeSymbol("_CSETF-ZKSTAT-MTIME");

    private static final SubLSymbol ZKSTAT_VERSION = makeSymbol("ZKSTAT-VERSION");

    private static final SubLSymbol _CSETF_ZKSTAT_VERSION = makeSymbol("_CSETF-ZKSTAT-VERSION");

    private static final SubLSymbol ZKSTAT_CVERSION = makeSymbol("ZKSTAT-CVERSION");

    private static final SubLSymbol _CSETF_ZKSTAT_CVERSION = makeSymbol("_CSETF-ZKSTAT-CVERSION");

    private static final SubLSymbol ZKSTAT_AVERSION = makeSymbol("ZKSTAT-AVERSION");

    private static final SubLSymbol _CSETF_ZKSTAT_AVERSION = makeSymbol("_CSETF-ZKSTAT-AVERSION");

    private static final SubLSymbol ZKSTAT_EPHEMERAL_OWNER = makeSymbol("ZKSTAT-EPHEMERAL-OWNER");

    private static final SubLSymbol _CSETF_ZKSTAT_EPHEMERAL_OWNER = makeSymbol("_CSETF-ZKSTAT-EPHEMERAL-OWNER");

    private static final SubLSymbol ZKSTAT_DATA_LEN = makeSymbol("ZKSTAT-DATA-LEN");

    private static final SubLSymbol _CSETF_ZKSTAT_DATA_LEN = makeSymbol("_CSETF-ZKSTAT-DATA-LEN");

    private static final SubLSymbol ZKSTAT_NUM_CHILDREN = makeSymbol("ZKSTAT-NUM-CHILDREN");

    private static final SubLSymbol _CSETF_ZKSTAT_NUM_CHILDREN = makeSymbol("_CSETF-ZKSTAT-NUM-CHILDREN");

    private static final SubLSymbol ZKSTAT_PZXID = makeSymbol("ZKSTAT-PZXID");

    private static final SubLSymbol _CSETF_ZKSTAT_PZXID = makeSymbol("_CSETF-ZKSTAT-PZXID");

    private static final SubLSymbol $CZXID = makeKeyword("CZXID");

    private static final SubLSymbol $MZXID = makeKeyword("MZXID");

    private static final SubLSymbol $CTIME = makeKeyword("CTIME");

    private static final SubLSymbol $MTIME = makeKeyword("MTIME");

    private static final SubLSymbol $CVERSION = makeKeyword("CVERSION");

    private static final SubLSymbol $AVERSION = makeKeyword("AVERSION");

    private static final SubLSymbol $EPHEMERAL_OWNER = makeKeyword("EPHEMERAL-OWNER");

    private static final SubLSymbol $DATA_LEN = makeKeyword("DATA-LEN");

    private static final SubLSymbol $NUM_CHILDREN = makeKeyword("NUM-CHILDREN");

    private static final SubLSymbol $PZXID = makeKeyword("PZXID");

    private static final SubLSymbol MAKE_ZK_NODE_STATE = makeSymbol("MAKE-ZK-NODE-STATE");

    private static final SubLSymbol VISIT_DEFSTRUCT_OBJECT_ZK_NODE_STATE_METHOD = makeSymbol("VISIT-DEFSTRUCT-OBJECT-ZK-NODE-STATE-METHOD");

    private static final SubLString $$$stat = makeString("stat");

    private static final SubLString $$$dataUtf8 = makeString("dataUtf8");

    private static final SubLString $$$czxid = makeString("czxid");

    private static final SubLString $$$mzxid = makeString("mzxid");

    private static final SubLString $$$pzxid = makeString("pzxid");

    private static final SubLString $$$ctime = makeString("ctime");

    private static final SubLString $$$mtime = makeString("mtime");

    private static final SubLString $$$version = makeString("version");

    private static final SubLString $$$aversion = makeString("aversion");

    private static final SubLString $$$cversion = makeString("cversion");

    private static final SubLString $$$ephemeralOwner = makeString("ephemeralOwner");

    private static final SubLString $$$dataLength = makeString("dataLength");

    private static final SubLString $$$numChildren = makeString("numChildren");

    private static final SubLString $str136$Expected_closing_tag__A_but_got__ = makeString("Expected closing tag ~A but got ~A instead.~%");

    private static final SubLSymbol ZK_CREATE_PERMANENT_NODE = makeSymbol("ZK-CREATE-PERMANENT-NODE");

    private static final SubLString $str138$_op_create_name_ = makeString("?op=create&name=");

    private static final SubLString $str140$HTTP_1_1_201_Created = makeString("HTTP/1.1 201 Created");

    private static final SubLString $str141$HTTP_1_1_409_Conflict = makeString("HTTP/1.1 409 Conflict");

    private static final SubLString $str142$Node_already_exits_ = makeString("Node already exits.");

    private static final SubLString $str143$No_such_parent_node_ = makeString("No such parent node.");

    private static final SubLSymbol ZK_CREATE_SESSION = makeSymbol("ZK-CREATE-SESSION");

    private static final SubLString $str145$_sessions_v1__op_create_expire_ = makeString("/sessions/v1/?op=create&expire=");

    private static final SubLSymbol ZK_SEND_SESSION_HEARTBEAT = makeSymbol("ZK-SEND-SESSION-HEARTBEAT");

    private static final SubLString $str147$_sessions_v1_ = makeString("/sessions/v1/");

    private static final SubLSymbol ZK_DELETE_SESSION = makeSymbol("ZK-DELETE-SESSION");

    private static final SubLString $str149$No_such_session_ = makeString("No such session.");

    public static SubLObject zk_get_node_children(final SubLObject node_path) {
	final SubLThread thread = SubLProcess.currentSubLThread();
	final SubLObject port = $zookeeper_rest_port$.getDynamicValue(thread);
	final SubLObject timeout = $zookeeper_rest_timeout$.getDynamicValue(thread);
	SubLObject problems = NIL;
	SubLObject cdolist_list_var = $zookeeper_rest_servers$.getDynamicValue(thread);
	SubLObject server = NIL;
	server = cdolist_list_var.first();
	while (NIL != cdolist_list_var) {
	    thread.resetMultipleValues();
	    final SubLObject xml_tokens = xml_parsing_utilities.xml_tokenized_http_request(server, node_path, $str4$view_children, $GET, port, NIL, NIL, timeout, timeout, NIL, $list6);
	    final SubLObject status = thread.secondMultipleValue();
	    final SubLObject status_msg = thread.thirdMultipleValue();
	    thread.resetMultipleValues();
	    if (NIL == status) {
		return values(parse_zk_children(xml_tokens), NIL);
	    }
	    problems = cons(list(server, status, status_msg), problems);
	    cdolist_list_var = cdolist_list_var.rest();
	    server = cdolist_list_var.first();
	}
	return values(NIL, problems);
    }

    public static SubLObject zk_child_state_print_function_trampoline(final SubLObject v_object, final SubLObject stream) {
	compatibility.default_struct_print_function(v_object, stream, ZERO_INTEGER);
	return NIL;
    }

    public static SubLObject zk_child_state_p(final SubLObject v_object) {
	return v_object.getClass() == $zk_child_state_native.class ? T : NIL;
    }

    public static SubLObject zkkids_path(final SubLObject v_object) {
	assert NIL != zk_child_state_p(v_object) : "zookeeper.zk_child_state_p error :" + v_object;
	return v_object.getField2();
    }

    public static SubLObject zkkids_uri(final SubLObject v_object) {
	assert NIL != zk_child_state_p(v_object) : "zookeeper.zk_child_state_p error :" + v_object;
	return v_object.getField3();
    }

    public static SubLObject zkkids_child_uri_template(final SubLObject v_object) {
	assert NIL != zk_child_state_p(v_object) : "zookeeper.zk_child_state_p error :" + v_object;
	return v_object.getField4();
    }

    public static SubLObject zkkids_children(final SubLObject v_object) {
	assert NIL != zk_child_state_p(v_object) : "zookeeper.zk_child_state_p error :" + v_object;
	return v_object.getField5();
    }

    public static SubLObject _csetf_zkkids_path(final SubLObject v_object, final SubLObject value) {
	assert NIL != zk_child_state_p(v_object) : "zookeeper.zk_child_state_p error :" + v_object;
	return v_object.setField2(value);
    }

    public static SubLObject _csetf_zkkids_uri(final SubLObject v_object, final SubLObject value) {
	assert NIL != zk_child_state_p(v_object) : "zookeeper.zk_child_state_p error :" + v_object;
	return v_object.setField3(value);
    }

    public static SubLObject _csetf_zkkids_child_uri_template(final SubLObject v_object, final SubLObject value) {
	assert NIL != zk_child_state_p(v_object) : "zookeeper.zk_child_state_p error :" + v_object;
	return v_object.setField4(value);
    }

    public static SubLObject _csetf_zkkids_children(final SubLObject v_object, final SubLObject value) {
	assert NIL != zk_child_state_p(v_object) : "zookeeper.zk_child_state_p error :" + v_object;
	return v_object.setField5(value);
    }

    public static SubLObject make_zk_child_state(SubLObject arglist) {
	if (arglist == UNPROVIDED) {
	    arglist = NIL;
	}
	final SubLObject v_new = new $zk_child_state_native();
	SubLObject next;
	SubLObject current_arg;
	SubLObject current_value;
	SubLObject pcase_var;
	for (next = NIL, next = arglist; NIL != next; next = cddr(next)) {
	    current_arg = next.first();
	    current_value = cadr(next);
	    pcase_var = current_arg;
	    if (pcase_var.eql($PATH)) {
		_csetf_zkkids_path(v_new, current_value);
	    } else if (pcase_var.eql($URI)) {
		_csetf_zkkids_uri(v_new, current_value);
	    } else if (pcase_var.eql($CHILD_URI_TEMPLATE)) {
		_csetf_zkkids_child_uri_template(v_new, current_value);
	    } else if (pcase_var.eql($CHILDREN)) {
		_csetf_zkkids_children(v_new, current_value);
	    } else {
		Errors.error($str28$Invalid_slot__S_for_construction_, current_arg);
	    }

	}
	return v_new;
    }

    public static SubLObject visit_defstruct_zk_child_state(final SubLObject obj, final SubLObject visitor_fn) {
	funcall(visitor_fn, obj, $BEGIN, MAKE_ZK_CHILD_STATE, FOUR_INTEGER);
	funcall(visitor_fn, obj, $SLOT, $PATH, zkkids_path(obj));
	funcall(visitor_fn, obj, $SLOT, $URI, zkkids_uri(obj));
	funcall(visitor_fn, obj, $SLOT, $CHILD_URI_TEMPLATE, zkkids_child_uri_template(obj));
	funcall(visitor_fn, obj, $SLOT, $CHILDREN, zkkids_children(obj));
	funcall(visitor_fn, obj, $END, MAKE_ZK_CHILD_STATE, FOUR_INTEGER);
	return obj;
    }

    public static SubLObject visit_defstruct_object_zk_child_state_method(final SubLObject obj, final SubLObject visitor_fn) {
	return visit_defstruct_zk_child_state(obj, visitor_fn);
    }

    public static SubLObject parse_zk_children(final SubLObject xml_tokens) {
	final SubLObject node = make_zk_child_state(UNPROVIDED);
	final SubLObject tokens = iteration.new_list_iterator(xml_tokens);
	iteration.iteration_next(tokens);
	iteration.iteration_next(tokens);
	if (NIL != web_utilities.matching_open_tagP($$$child, iteration.iteration_next(tokens), UNPROVIDED)) {
	    SubLObject children = NIL;
	    while (NIL == iteration.iteration_done(tokens)) {
		final SubLObject tag = iteration.iteration_next(tokens);
		if (NIL != web_utilities.matching_close_tagP($$$child, tag, UNPROVIDED)) {
		    return node;
		}
		if (NIL != web_utilities.matching_open_tagP($$$path, tag, UNPROVIDED)) {
		    _csetf_zkkids_path(node, iteration.iteration_next(tokens));
		    zk_must_match_closing_tag(tokens, $$$path);
		} else if (NIL != web_utilities.matching_open_tagP($$$uri, tag, UNPROVIDED)) {
		    _csetf_zkkids_uri(node, iteration.iteration_next(tokens));
		    zk_must_match_closing_tag(tokens, $$$uri);
		} else if (NIL != web_utilities.matching_open_tagP($str37$child_uri_template, tag, UNPROVIDED)) {
		    _csetf_zkkids_child_uri_template(node, iteration.iteration_next(tokens));
		    zk_must_match_closing_tag(tokens, $str37$child_uri_template);
		} else if (NIL != web_utilities.matching_open_tagP($$$children, tag, UNPROVIDED)) {
		    children = NIL;
		} else if (NIL != web_utilities.matching_open_tagP($$$child, tag, UNPROVIDED)) {
		    children = cons(iteration.iteration_next(tokens), children);
		    zk_must_match_closing_tag(tokens, $$$child);
		} else if (NIL != web_utilities.matching_close_tagP($$$children, tag, UNPROVIDED)) {
		    _csetf_zkkids_children(node, nreverse(children));
		} else {
		    Errors.error($str39$Unexpected_XML_tag__A___, tag);
		}

	    }
	}
	return Errors.error($str40$Unexpected_token_stream__A_, tokens);
    }

    public static SubLObject zk_set_node_data(final SubLObject node_path, final SubLObject utf8_data) {
	final SubLThread thread = SubLProcess.currentSubLThread();
	SubLObject problems = NIL;
	SubLObject cdolist_list_var = $zookeeper_rest_servers$.getDynamicValue(thread);
	SubLObject server = NIL;
	server = cdolist_list_var.first();
	while (NIL != cdolist_list_var) {
	    SubLObject connection_error = NIL;
	    try {
		thread.throwStack.push($catch_error_message_target$.getGlobalValue());
		final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
		try {
		    Errors.$error_handler$.bind(CATCH_ERROR_MESSAGE_HANDLER, thread);
		    try {
			final SubLObject real_port = ($zookeeper_rest_port$.getDynamicValue(thread).eql($DEFAULT)) ? $int$80 : $zookeeper_rest_port$.getDynamicValue(thread);
			SubLObject in_stream = NIL;
			try {
			    in_stream = subl_promotions.open_tcp_stream_with_timeout(server, real_port, $zookeeper_rest_timeout$.getDynamicValue(thread), $PRIVATE);
			    if (NIL != validate_tcp_connection(in_stream, server, real_port)) {
				web_utilities.send_http_request(in_stream, list(new SubLObject[] { $MACHINE, server, $PORT, $zookeeper_rest_port$.getDynamicValue(thread), $METHOD, $PUT, $URL, node_path, $QUERY, utf8_data, $kw52$KEEP_ALIVE_, NIL, $kw53$WIDE_NEWLINES_, NIL, $ACCEPT_TYPES, $list6,
					$CONTENT_TYPE, $str56$application_octet_stream, $SOAP_ACTION_URI, NIL }));
				if (in_stream.isStream()) {
				    thread.resetMultipleValues();
				    final SubLObject status = zk_analyze_set_response(xml_parsing_utilities.xml_tokenize(in_stream, UNPROVIDED, UNPROVIDED, UNPROVIDED));
				    final SubLObject message = thread.secondMultipleValue();
				    thread.resetMultipleValues();
				    return values(status, message);
				}
				problems = cons(list(server, $str59$n_a, $str60$no_connection), problems);
			    }
			} finally {
			    final SubLObject _prev_bind_0_$1 = $is_thread_performing_cleanupP$.currentBinding(thread);
			    try {
				$is_thread_performing_cleanupP$.bind(T, thread);
				final SubLObject _values = getValuesAsVector();
				if (NIL != in_stream) {
				    close(in_stream, UNPROVIDED);
				}
				restoreValuesFromVector(_values);
			    } finally {
				$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$1, thread);
			    }
			}
		    } catch (final Throwable catch_var) {
			Errors.handleThrowable(catch_var, NIL);
		    }
		} finally {
		    Errors.$error_handler$.rebind(_prev_bind_0, thread);
		}
	    } catch (final Throwable ccatch_env_var) {
		connection_error = Errors.handleThrowable(ccatch_env_var, $catch_error_message_target$.getGlobalValue());
	    } finally {
		thread.throwStack.pop();
	    }
	    problems = cons(list(server, $str59$n_a, connection_error), problems);
	    cdolist_list_var = cdolist_list_var.rest();
	    server = cdolist_list_var.first();
	}
	return Errors.error($str61$Could_not_create_node_on_any_serv, problems);
    }

    public static SubLObject zk_analyze_set_response(final SubLObject tokens) {
	final SubLObject header = tokens.first();
	if (NIL != string_utilities.starts_with(header, $str62$HTTP_1_1_200_OK)) {
	    return values(T, NIL);
	}
	if (NIL != string_utilities.starts_with(header, $str63$HTTP_1_1_404_Not_Found)) {
	    return values(NIL, $str64$No_such_node_);
	}
	return values(NIL, cconcatenate($$$Unexpected_HTTP_header_, new SubLObject[] { format_nil.format_nil_a_no_copy(header), $str66$_, format_nil.$format_nil_percent$.getGlobalValue() }));
    }

    public static SubLObject zk_delete_node(final SubLObject node_path) {
	final SubLThread thread = SubLProcess.currentSubLThread();
	SubLObject problems = NIL;
	SubLObject cdolist_list_var = $zookeeper_rest_servers$.getDynamicValue(thread);
	SubLObject server = NIL;
	server = cdolist_list_var.first();
	while (NIL != cdolist_list_var) {
	    SubLObject connection_error = NIL;
	    try {
		thread.throwStack.push($catch_error_message_target$.getGlobalValue());
		final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
		try {
		    Errors.$error_handler$.bind(CATCH_ERROR_MESSAGE_HANDLER, thread);
		    try {
			final SubLObject real_port = ($zookeeper_rest_port$.getDynamicValue(thread).eql($DEFAULT)) ? $int$80 : $zookeeper_rest_port$.getDynamicValue(thread);
			SubLObject in_stream = NIL;
			try {
			    in_stream = subl_promotions.open_tcp_stream_with_timeout(server, real_port, $zookeeper_rest_timeout$.getDynamicValue(thread), $PRIVATE);
			    if (NIL != validate_tcp_connection(in_stream, server, real_port)) {
				web_utilities.send_http_request(in_stream, list(new SubLObject[] { $MACHINE, server, $PORT, $zookeeper_rest_port$.getDynamicValue(thread), $METHOD, $DELETE, $URL, node_path, $QUERY, $str69$, $kw52$KEEP_ALIVE_, NIL, $kw53$WIDE_NEWLINES_, NIL, $ACCEPT_TYPES, $list6,
					$CONTENT_TYPE, $str56$application_octet_stream, $SOAP_ACTION_URI, NIL }));
				if (in_stream.isStream()) {
				    thread.resetMultipleValues();
				    final SubLObject status = zk_analyze_delete_response(xml_parsing_utilities.xml_tokenize(in_stream, UNPROVIDED, UNPROVIDED, UNPROVIDED));
				    final SubLObject message = thread.secondMultipleValue();
				    thread.resetMultipleValues();
				    return values(status, message);
				}
				problems = cons(list(server, $str59$n_a, $str60$no_connection), problems);
			    }
			} finally {
			    final SubLObject _prev_bind_0_$2 = $is_thread_performing_cleanupP$.currentBinding(thread);
			    try {
				$is_thread_performing_cleanupP$.bind(T, thread);
				final SubLObject _values = getValuesAsVector();
				if (NIL != in_stream) {
				    close(in_stream, UNPROVIDED);
				}
				restoreValuesFromVector(_values);
			    } finally {
				$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$2, thread);
			    }
			}
		    } catch (final Throwable catch_var) {
			Errors.handleThrowable(catch_var, NIL);
		    }
		} finally {
		    Errors.$error_handler$.rebind(_prev_bind_0, thread);
		}
	    } catch (final Throwable ccatch_env_var) {
		connection_error = Errors.handleThrowable(ccatch_env_var, $catch_error_message_target$.getGlobalValue());
	    } finally {
		thread.throwStack.pop();
	    }
	    problems = cons(list(server, $str59$n_a, connection_error), problems);
	    cdolist_list_var = cdolist_list_var.rest();
	    server = cdolist_list_var.first();
	}
	return Errors.error($str61$Could_not_create_node_on_any_serv, problems);
    }

    public static SubLObject zk_analyze_delete_response(final SubLObject tokens) {
	final SubLObject header = tokens.first();
	if (NIL != string_utilities.starts_with(header, $str70$HTTP_1_1_204_No_Content)) {
	    return values(T, NIL);
	}
	if (NIL != string_utilities.starts_with(header, $str63$HTTP_1_1_404_Not_Found)) {
	    return values(NIL, $str64$No_such_node_);
	}
	return values(NIL, cconcatenate($$$Unexpected_HTTP_header_, new SubLObject[] { format_nil.format_nil_a_no_copy(header), $str66$_, format_nil.$format_nil_percent$.getGlobalValue() }));
    }

    public static SubLObject zk_get_node_state(final SubLObject node_path) {
	final SubLThread thread = SubLProcess.currentSubLThread();
	final SubLObject port = $zookeeper_rest_port$.getDynamicValue(thread);
	final SubLObject timeout = $zookeeper_rest_timeout$.getDynamicValue(thread);
	SubLObject problems = NIL;
	SubLObject cdolist_list_var = $zookeeper_rest_servers$.getDynamicValue(thread);
	SubLObject server = NIL;
	server = cdolist_list_var.first();
	while (NIL != cdolist_list_var) {
	    thread.resetMultipleValues();
	    final SubLObject xml_tokens = xml_parsing_utilities.xml_tokenized_http_request(server, node_path, $str72$dataformat_utf8, $GET, port, NIL, NIL, timeout, timeout, NIL, $list6);
	    final SubLObject status = thread.secondMultipleValue();
	    final SubLObject status_msg = thread.thirdMultipleValue();
	    thread.resetMultipleValues();
	    if (NIL == status) {
		return values(parse_zk_state(xml_tokens), NIL);
	    }
	    problems = cons(list(server, status, status_msg), problems);
	    cdolist_list_var = cdolist_list_var.rest();
	    server = cdolist_list_var.first();
	}
	return values(NIL, problems);
    }

    public static SubLObject zk_node_state_print_function_trampoline(final SubLObject v_object, final SubLObject stream) {
	compatibility.default_struct_print_function(v_object, stream, ZERO_INTEGER);
	return NIL;
    }

    public static SubLObject zk_node_state_p(final SubLObject v_object) {
	return v_object.getClass() == $zk_node_state_native.class ? T : NIL;
    }

    public static SubLObject zkstat_path(final SubLObject v_object) {
	assert NIL != zk_node_state_p(v_object) : "zookeeper.zk_node_state_p error :" + v_object;
	return v_object.getField2();
    }

    public static SubLObject zkstat_uri(final SubLObject v_object) {
	assert NIL != zk_node_state_p(v_object) : "zookeeper.zk_node_state_p error :" + v_object;
	return v_object.getField3();
    }

    public static SubLObject zkstat_data(final SubLObject v_object) {
	assert NIL != zk_node_state_p(v_object) : "zookeeper.zk_node_state_p error :" + v_object;
	return v_object.getField4();
    }

    public static SubLObject zkstat_czxid(final SubLObject v_object) {
	assert NIL != zk_node_state_p(v_object) : "zookeeper.zk_node_state_p error :" + v_object;
	return v_object.getField5();
    }

    public static SubLObject zkstat_mzxid(final SubLObject v_object) {
	assert NIL != zk_node_state_p(v_object) : "zookeeper.zk_node_state_p error :" + v_object;
	return v_object.getField6();
    }

    public static SubLObject zkstat_ctime(final SubLObject v_object) {
	assert NIL != zk_node_state_p(v_object) : "zookeeper.zk_node_state_p error :" + v_object;
	return v_object.getField7();
    }

    public static SubLObject zkstat_mtime(final SubLObject v_object) {
	assert NIL != zk_node_state_p(v_object) : "zookeeper.zk_node_state_p error :" + v_object;
	return v_object.getField8();
    }

    public static SubLObject zkstat_version(final SubLObject v_object) {
	assert NIL != zk_node_state_p(v_object) : "zookeeper.zk_node_state_p error :" + v_object;
	return v_object.getField9();
    }

    public static SubLObject zkstat_cversion(final SubLObject v_object) {
	assert NIL != zk_node_state_p(v_object) : "zookeeper.zk_node_state_p error :" + v_object;
	return v_object.getField10();
    }

    public static SubLObject zkstat_aversion(final SubLObject v_object) {
	assert NIL != zk_node_state_p(v_object) : "zookeeper.zk_node_state_p error :" + v_object;
	return v_object.getField11();
    }

    public static SubLObject zkstat_ephemeral_owner(final SubLObject v_object) {
	assert NIL != zk_node_state_p(v_object) : "zookeeper.zk_node_state_p error :" + v_object;
	return v_object.getField12();
    }

    public static SubLObject zkstat_data_len(final SubLObject v_object) {
	assert NIL != zk_node_state_p(v_object) : "zookeeper.zk_node_state_p error :" + v_object;
	return v_object.getField13();
    }

    public static SubLObject zkstat_num_children(final SubLObject v_object) {
	assert NIL != zk_node_state_p(v_object) : "zookeeper.zk_node_state_p error :" + v_object;
	return v_object.getField14();
    }

    public static SubLObject zkstat_pzxid(final SubLObject v_object) {
	assert NIL != zk_node_state_p(v_object) : "zookeeper.zk_node_state_p error :" + v_object;
	return v_object.getField15();
    }

    public static SubLObject _csetf_zkstat_path(final SubLObject v_object, final SubLObject value) {
	assert NIL != zk_node_state_p(v_object) : "zookeeper.zk_node_state_p error :" + v_object;
	return v_object.setField2(value);
    }

    public static SubLObject _csetf_zkstat_uri(final SubLObject v_object, final SubLObject value) {
	assert NIL != zk_node_state_p(v_object) : "zookeeper.zk_node_state_p error :" + v_object;
	return v_object.setField3(value);
    }

    public static SubLObject _csetf_zkstat_data(final SubLObject v_object, final SubLObject value) {
	assert NIL != zk_node_state_p(v_object) : "zookeeper.zk_node_state_p error :" + v_object;
	return v_object.setField4(value);
    }

    public static SubLObject _csetf_zkstat_czxid(final SubLObject v_object, final SubLObject value) {
	assert NIL != zk_node_state_p(v_object) : "zookeeper.zk_node_state_p error :" + v_object;
	return v_object.setField5(value);
    }

    public static SubLObject _csetf_zkstat_mzxid(final SubLObject v_object, final SubLObject value) {
	assert NIL != zk_node_state_p(v_object) : "zookeeper.zk_node_state_p error :" + v_object;
	return v_object.setField6(value);
    }

    public static SubLObject _csetf_zkstat_ctime(final SubLObject v_object, final SubLObject value) {
	assert NIL != zk_node_state_p(v_object) : "zookeeper.zk_node_state_p error :" + v_object;
	return v_object.setField7(value);
    }

    public static SubLObject _csetf_zkstat_mtime(final SubLObject v_object, final SubLObject value) {
	assert NIL != zk_node_state_p(v_object) : "zookeeper.zk_node_state_p error :" + v_object;
	return v_object.setField8(value);
    }

    public static SubLObject _csetf_zkstat_version(final SubLObject v_object, final SubLObject value) {
	assert NIL != zk_node_state_p(v_object) : "zookeeper.zk_node_state_p error :" + v_object;
	return v_object.setField9(value);
    }

    public static SubLObject _csetf_zkstat_cversion(final SubLObject v_object, final SubLObject value) {
	assert NIL != zk_node_state_p(v_object) : "zookeeper.zk_node_state_p error :" + v_object;
	return v_object.setField10(value);
    }

    public static SubLObject _csetf_zkstat_aversion(final SubLObject v_object, final SubLObject value) {
	assert NIL != zk_node_state_p(v_object) : "zookeeper.zk_node_state_p error :" + v_object;
	return v_object.setField11(value);
    }

    public static SubLObject _csetf_zkstat_ephemeral_owner(final SubLObject v_object, final SubLObject value) {
	assert NIL != zk_node_state_p(v_object) : "zookeeper.zk_node_state_p error :" + v_object;
	return v_object.setField12(value);
    }

    public static SubLObject _csetf_zkstat_data_len(final SubLObject v_object, final SubLObject value) {
	assert NIL != zk_node_state_p(v_object) : "zookeeper.zk_node_state_p error :" + v_object;
	return v_object.setField13(value);
    }

    public static SubLObject _csetf_zkstat_num_children(final SubLObject v_object, final SubLObject value) {
	assert NIL != zk_node_state_p(v_object) : "zookeeper.zk_node_state_p error :" + v_object;
	return v_object.setField14(value);
    }

    public static SubLObject _csetf_zkstat_pzxid(final SubLObject v_object, final SubLObject value) {
	assert NIL != zk_node_state_p(v_object) : "zookeeper.zk_node_state_p error :" + v_object;
	return v_object.setField15(value);
    }

    public static SubLObject make_zk_node_state(SubLObject arglist) {
	if (arglist == UNPROVIDED) {
	    arglist = NIL;
	}
	final SubLObject v_new = new $zk_node_state_native();
	SubLObject next;
	SubLObject current_arg;
	SubLObject current_value;
	SubLObject pcase_var;
	for (next = NIL, next = arglist; NIL != next; next = cddr(next)) {
	    current_arg = next.first();
	    current_value = cadr(next);
	    pcase_var = current_arg;
	    if (pcase_var.eql($PATH)) {
		_csetf_zkstat_path(v_new, current_value);
	    } else if (pcase_var.eql($URI)) {
		_csetf_zkstat_uri(v_new, current_value);
	    } else if (pcase_var.eql($DATA)) {
		_csetf_zkstat_data(v_new, current_value);
	    } else if (pcase_var.eql($CZXID)) {
		_csetf_zkstat_czxid(v_new, current_value);
	    } else if (pcase_var.eql($MZXID)) {
		_csetf_zkstat_mzxid(v_new, current_value);
	    } else if (pcase_var.eql($CTIME)) {
		_csetf_zkstat_ctime(v_new, current_value);
	    } else if (pcase_var.eql($MTIME)) {
		_csetf_zkstat_mtime(v_new, current_value);
	    } else if (pcase_var.eql($VERSION)) {
		_csetf_zkstat_version(v_new, current_value);
	    } else if (pcase_var.eql($CVERSION)) {
		_csetf_zkstat_cversion(v_new, current_value);
	    } else if (pcase_var.eql($AVERSION)) {
		_csetf_zkstat_aversion(v_new, current_value);
	    } else if (pcase_var.eql($EPHEMERAL_OWNER)) {
		_csetf_zkstat_ephemeral_owner(v_new, current_value);
	    } else if (pcase_var.eql($DATA_LEN)) {
		_csetf_zkstat_data_len(v_new, current_value);
	    } else if (pcase_var.eql($NUM_CHILDREN)) {
		_csetf_zkstat_num_children(v_new, current_value);
	    } else if (pcase_var.eql($PZXID)) {
		_csetf_zkstat_pzxid(v_new, current_value);
	    } else {
		Errors.error($str28$Invalid_slot__S_for_construction_, current_arg);
	    }

	}
	return v_new;
    }

    public static SubLObject visit_defstruct_zk_node_state(final SubLObject obj, final SubLObject visitor_fn) {
	funcall(visitor_fn, obj, $BEGIN, MAKE_ZK_NODE_STATE, FOURTEEN_INTEGER);
	funcall(visitor_fn, obj, $SLOT, $PATH, zkstat_path(obj));
	funcall(visitor_fn, obj, $SLOT, $URI, zkstat_uri(obj));
	funcall(visitor_fn, obj, $SLOT, $DATA, zkstat_data(obj));
	funcall(visitor_fn, obj, $SLOT, $CZXID, zkstat_czxid(obj));
	funcall(visitor_fn, obj, $SLOT, $MZXID, zkstat_mzxid(obj));
	funcall(visitor_fn, obj, $SLOT, $CTIME, zkstat_ctime(obj));
	funcall(visitor_fn, obj, $SLOT, $MTIME, zkstat_mtime(obj));
	funcall(visitor_fn, obj, $SLOT, $VERSION, zkstat_version(obj));
	funcall(visitor_fn, obj, $SLOT, $CVERSION, zkstat_cversion(obj));
	funcall(visitor_fn, obj, $SLOT, $AVERSION, zkstat_aversion(obj));
	funcall(visitor_fn, obj, $SLOT, $EPHEMERAL_OWNER, zkstat_ephemeral_owner(obj));
	funcall(visitor_fn, obj, $SLOT, $DATA_LEN, zkstat_data_len(obj));
	funcall(visitor_fn, obj, $SLOT, $NUM_CHILDREN, zkstat_num_children(obj));
	funcall(visitor_fn, obj, $SLOT, $PZXID, zkstat_pzxid(obj));
	funcall(visitor_fn, obj, $END, MAKE_ZK_NODE_STATE, FOURTEEN_INTEGER);
	return obj;
    }

    public static SubLObject visit_defstruct_object_zk_node_state_method(final SubLObject obj, final SubLObject visitor_fn) {
	return visit_defstruct_zk_node_state(obj, visitor_fn);
    }

    public static SubLObject parse_zk_state(final SubLObject xml_tokens) {
	final SubLObject node = make_zk_node_state(UNPROVIDED);
	final SubLObject tokens = iteration.new_list_iterator(xml_tokens);
	iteration.iteration_next(tokens);
	iteration.iteration_next(tokens);
	if (NIL != web_utilities.matching_open_tagP($$$stat, iteration.iteration_next(tokens), UNPROVIDED)) {
	    while (NIL == iteration.iteration_done(tokens)) {
		final SubLObject tag = iteration.iteration_next(tokens);
		if (NIL != web_utilities.matching_close_tagP($$$stat, tag, UNPROVIDED)) {
		    return node;
		}
		if (NIL != web_utilities.matching_open_tagP($$$path, tag, UNPROVIDED)) {
		    _csetf_zkstat_path(node, iteration.iteration_next(tokens));
		    zk_must_match_closing_tag(tokens, $$$path);
		} else if (NIL != web_utilities.matching_open_tagP($$$uri, tag, UNPROVIDED)) {
		    _csetf_zkstat_uri(node, iteration.iteration_next(tokens));
		    zk_must_match_closing_tag(tokens, $$$uri);
		} else if (NIL != web_utilities.matching_open_tagP($$$dataUtf8, tag, UNPROVIDED)) {
		    _csetf_zkstat_data(node, iteration.iteration_next(tokens));
		    zk_must_match_closing_tag(tokens, $$$dataUtf8);
		} else if (NIL != web_utilities.matching_open_tagP($$$czxid, tag, UNPROVIDED)) {
		    _csetf_zkstat_czxid(node, parse_integer(iteration.iteration_next(tokens), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED));
		    zk_must_match_closing_tag(tokens, $$$czxid);
		} else if (NIL != web_utilities.matching_open_tagP($$$mzxid, tag, UNPROVIDED)) {
		    _csetf_zkstat_mzxid(node, parse_integer(iteration.iteration_next(tokens), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED));
		    zk_must_match_closing_tag(tokens, $$$mzxid);
		} else if (NIL != web_utilities.matching_open_tagP($$$pzxid, tag, UNPROVIDED)) {
		    _csetf_zkstat_pzxid(node, parse_integer(iteration.iteration_next(tokens), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED));
		    zk_must_match_closing_tag(tokens, $$$pzxid);
		} else if (NIL != web_utilities.matching_open_tagP($$$ctime, tag, UNPROVIDED)) {
		    _csetf_zkstat_ctime(node, parse_integer(iteration.iteration_next(tokens), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED));
		    zk_must_match_closing_tag(tokens, $$$ctime);
		} else if (NIL != web_utilities.matching_open_tagP($$$mtime, tag, UNPROVIDED)) {
		    _csetf_zkstat_mtime(node, parse_integer(iteration.iteration_next(tokens), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED));
		    zk_must_match_closing_tag(tokens, $$$mtime);
		} else if (NIL != web_utilities.matching_open_tagP($$$version, tag, UNPROVIDED)) {
		    _csetf_zkstat_version(node, parse_integer(iteration.iteration_next(tokens), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED));
		    zk_must_match_closing_tag(tokens, $$$version);
		} else if (NIL != web_utilities.matching_open_tagP($$$aversion, tag, UNPROVIDED)) {
		    _csetf_zkstat_aversion(node, parse_integer(iteration.iteration_next(tokens), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED));
		    zk_must_match_closing_tag(tokens, $$$aversion);
		} else if (NIL != web_utilities.matching_open_tagP($$$cversion, tag, UNPROVIDED)) {
		    _csetf_zkstat_cversion(node, parse_integer(iteration.iteration_next(tokens), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED));
		    zk_must_match_closing_tag(tokens, $$$cversion);
		} else if (NIL != web_utilities.matching_open_tagP($$$ephemeralOwner, tag, UNPROVIDED)) {
		    _csetf_zkstat_ephemeral_owner(node, parse_integer(iteration.iteration_next(tokens), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED));
		    zk_must_match_closing_tag(tokens, $$$ephemeralOwner);
		} else if (NIL != web_utilities.matching_open_tagP($$$dataLength, tag, UNPROVIDED)) {
		    _csetf_zkstat_data_len(node, parse_integer(iteration.iteration_next(tokens), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED));
		    zk_must_match_closing_tag(tokens, $$$dataLength);
		} else if (NIL != web_utilities.matching_open_tagP($$$numChildren, tag, UNPROVIDED)) {
		    _csetf_zkstat_num_children(node, parse_integer(iteration.iteration_next(tokens), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED));
		    zk_must_match_closing_tag(tokens, $$$numChildren);
		} else {
		    Errors.error($str39$Unexpected_XML_tag__A___, tag);
		}

	    }
	}
	return Errors.error($str40$Unexpected_token_stream__A_, tokens);
    }

    public static SubLObject zk_must_match_closing_tag(final SubLObject tokens, final SubLObject close_tag) {
	final SubLThread thread = SubLProcess.currentSubLThread();
	final SubLObject ctag = iteration.iteration_next(tokens);
	if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (NIL == web_utilities.matching_close_tagP(close_tag, ctag, UNPROVIDED))) {
	    Errors.error($str136$Expected_closing_tag__A_but_got__, close_tag, ctag);
	}
	return tokens;
    }

    public static SubLObject zk_create_permanent_node(final SubLObject parent_node_path, final SubLObject name, SubLObject initial_data) {
	if (initial_data == UNPROVIDED) {
	    initial_data = $str69$;
	}
	final SubLThread thread = SubLProcess.currentSubLThread();
	final SubLObject full_path = cconcatenate(parent_node_path, new SubLObject[] { $str138$_op_create_name_, name });
	SubLObject problems = NIL;
	SubLObject cdolist_list_var = $zookeeper_rest_servers$.getDynamicValue(thread);
	SubLObject server = NIL;
	server = cdolist_list_var.first();
	while (NIL != cdolist_list_var) {
	    SubLObject connection_error = NIL;
	    try {
		thread.throwStack.push($catch_error_message_target$.getGlobalValue());
		final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
		try {
		    Errors.$error_handler$.bind(CATCH_ERROR_MESSAGE_HANDLER, thread);
		    try {
			final SubLObject real_port = ($zookeeper_rest_port$.getDynamicValue(thread).eql($DEFAULT)) ? $int$80 : $zookeeper_rest_port$.getDynamicValue(thread);
			SubLObject in_stream = NIL;
			try {
			    in_stream = subl_promotions.open_tcp_stream_with_timeout(server, real_port, $zookeeper_rest_timeout$.getDynamicValue(thread), $PRIVATE);
			    if (NIL != validate_tcp_connection(in_stream, server, real_port)) {
				web_utilities.send_http_request(in_stream, list(new SubLObject[] { $MACHINE, server, $PORT, $zookeeper_rest_port$.getDynamicValue(thread), $METHOD, $POST, $URL, full_path, $QUERY, initial_data, $kw52$KEEP_ALIVE_, NIL, $kw53$WIDE_NEWLINES_, NIL, $ACCEPT_TYPES, $list6,
					$CONTENT_TYPE, $str56$application_octet_stream, $SOAP_ACTION_URI, NIL }));
				if (in_stream.isStream()) {
				    thread.resetMultipleValues();
				    final SubLObject status = zk_analyze_create_response(xml_parsing_utilities.xml_tokenize(in_stream, UNPROVIDED, UNPROVIDED, UNPROVIDED));
				    final SubLObject message = thread.secondMultipleValue();
				    thread.resetMultipleValues();
				    return values(status, message);
				}
				problems = cons(list(server, $str59$n_a, $str60$no_connection), problems);
			    }
			} finally {
			    final SubLObject _prev_bind_0_$3 = $is_thread_performing_cleanupP$.currentBinding(thread);
			    try {
				$is_thread_performing_cleanupP$.bind(T, thread);
				final SubLObject _values = getValuesAsVector();
				if (NIL != in_stream) {
				    close(in_stream, UNPROVIDED);
				}
				restoreValuesFromVector(_values);
			    } finally {
				$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$3, thread);
			    }
			}
		    } catch (final Throwable catch_var) {
			Errors.handleThrowable(catch_var, NIL);
		    }
		} finally {
		    Errors.$error_handler$.rebind(_prev_bind_0, thread);
		}
	    } catch (final Throwable ccatch_env_var) {
		connection_error = Errors.handleThrowable(ccatch_env_var, $catch_error_message_target$.getGlobalValue());
	    } finally {
		thread.throwStack.pop();
	    }
	    problems = cons(list(server, $str59$n_a, connection_error), problems);
	    cdolist_list_var = cdolist_list_var.rest();
	    server = cdolist_list_var.first();
	}
	return values(NIL, problems);
    }

    public static SubLObject zk_analyze_create_response(final SubLObject tokens) {
	final SubLObject header = tokens.first();
	if (NIL != string_utilities.starts_with(header, $str140$HTTP_1_1_201_Created)) {
	    return values(T, NIL);
	}
	if (NIL != string_utilities.starts_with(header, $str141$HTTP_1_1_409_Conflict)) {
	    return values(NIL, $str142$Node_already_exits_);
	}
	if (NIL != string_utilities.starts_with(header, $str63$HTTP_1_1_404_Not_Found)) {
	    return values(NIL, $str143$No_such_parent_node_);
	}
	return values(NIL, cconcatenate($$$Unexpected_HTTP_header_, new SubLObject[] { format_nil.format_nil_a_no_copy(header), $str66$_, format_nil.$format_nil_percent$.getGlobalValue() }));
    }

    public static SubLObject zk_create_session(SubLObject timeout_secs) {
	if (timeout_secs == UNPROVIDED) {
	    timeout_secs = FIVE_INTEGER;
	}
	final SubLThread thread = SubLProcess.currentSubLThread();
	final SubLObject session_uri = cconcatenate($str145$_sessions_v1__op_create_expire_, format_nil.format_nil_a_no_copy(timeout_secs));
	SubLObject problems = NIL;
	SubLObject cdolist_list_var = $zookeeper_rest_servers$.getDynamicValue(thread);
	SubLObject server = NIL;
	server = cdolist_list_var.first();
	while (NIL != cdolist_list_var) {
	    SubLObject connection_error = NIL;
	    try {
		thread.throwStack.push($catch_error_message_target$.getGlobalValue());
		final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
		try {
		    Errors.$error_handler$.bind(CATCH_ERROR_MESSAGE_HANDLER, thread);
		    try {
			final SubLObject real_port = ($zookeeper_rest_port$.getDynamicValue(thread).eql($DEFAULT)) ? $int$80 : $zookeeper_rest_port$.getDynamicValue(thread);
			SubLObject in_stream = NIL;
			try {
			    in_stream = subl_promotions.open_tcp_stream_with_timeout(server, real_port, $zookeeper_rest_timeout$.getDynamicValue(thread), $PRIVATE);
			    if (NIL != validate_tcp_connection(in_stream, server, real_port)) {
				web_utilities.send_http_request(in_stream, list(new SubLObject[] { $MACHINE, server, $PORT, $zookeeper_rest_port$.getDynamicValue(thread), $METHOD, $POST, $URL, session_uri, $QUERY, $str69$, $kw52$KEEP_ALIVE_, NIL, $kw53$WIDE_NEWLINES_, NIL, $ACCEPT_TYPES, $list6,
					$CONTENT_TYPE, $str56$application_octet_stream, $SOAP_ACTION_URI, NIL }));
				if (in_stream.isStream()) {
				    thread.resetMultipleValues();
				    final SubLObject session_id = zk_analyze_create_session_response(xml_parsing_utilities.xml_tokenize(in_stream, UNPROVIDED, UNPROVIDED, UNPROVIDED));
				    final SubLObject message = thread.secondMultipleValue();
				    thread.resetMultipleValues();
				    return values(session_id, message);
				}
				problems = cons(list(server, $str59$n_a, $str60$no_connection), problems);
			    }
			} finally {
			    final SubLObject _prev_bind_0_$4 = $is_thread_performing_cleanupP$.currentBinding(thread);
			    try {
				$is_thread_performing_cleanupP$.bind(T, thread);
				final SubLObject _values = getValuesAsVector();
				if (NIL != in_stream) {
				    close(in_stream, UNPROVIDED);
				}
				restoreValuesFromVector(_values);
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
	    } catch (final Throwable ccatch_env_var) {
		connection_error = Errors.handleThrowable(ccatch_env_var, $catch_error_message_target$.getGlobalValue());
	    } finally {
		thread.throwStack.pop();
	    }
	    problems = cons(list(server, $str59$n_a, connection_error), problems);
	    cdolist_list_var = cdolist_list_var.rest();
	    server = cdolist_list_var.first();
	}
	return values(NIL, problems);
    }

    public static SubLObject zk_analyze_create_session_response(final SubLObject tokens) {
	final SubLObject header = tokens.first();
	if (NIL != string_utilities.starts_with(header, $str140$HTTP_1_1_201_Created)) {
	    final SubLObject id_string = nth(FOUR_INTEGER, tokens);
	    return values(id_string, NIL);
	}
	return values(NIL, cconcatenate($$$Unexpected_HTTP_header_, new SubLObject[] { format_nil.format_nil_a_no_copy(header), $str66$_, format_nil.$format_nil_percent$.getGlobalValue() }));
    }

    public static SubLObject zk_send_session_heartbeat(final SubLObject session_id) {
	final SubLThread thread = SubLProcess.currentSubLThread();
	final SubLObject session_uri = cconcatenate($str147$_sessions_v1_, format_nil.format_nil_a_no_copy(session_id));
	SubLObject problems = NIL;
	SubLObject cdolist_list_var = $zookeeper_rest_servers$.getDynamicValue(thread);
	SubLObject server = NIL;
	server = cdolist_list_var.first();
	while (NIL != cdolist_list_var) {
	    SubLObject connection_error = NIL;
	    try {
		thread.throwStack.push($catch_error_message_target$.getGlobalValue());
		final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
		try {
		    Errors.$error_handler$.bind(CATCH_ERROR_MESSAGE_HANDLER, thread);
		    try {
			final SubLObject real_port = ($zookeeper_rest_port$.getDynamicValue(thread).eql($DEFAULT)) ? $int$80 : $zookeeper_rest_port$.getDynamicValue(thread);
			SubLObject in_stream = NIL;
			try {
			    in_stream = subl_promotions.open_tcp_stream_with_timeout(server, real_port, $zookeeper_rest_timeout$.getDynamicValue(thread), $PRIVATE);
			    if (NIL != validate_tcp_connection(in_stream, server, real_port)) {
				web_utilities.send_http_request(in_stream, list(new SubLObject[] { $MACHINE, server, $PORT, $zookeeper_rest_port$.getDynamicValue(thread), $METHOD, $POST, $URL, session_uri, $QUERY, $str69$, $kw52$KEEP_ALIVE_, NIL, $kw53$WIDE_NEWLINES_, NIL, $ACCEPT_TYPES, $list6,
					$CONTENT_TYPE, $str56$application_octet_stream, $SOAP_ACTION_URI, NIL }));
				if (in_stream.isStream()) {
				    thread.resetMultipleValues();
				    final SubLObject status = zk_analyze_session_heartbeat_response(xml_parsing_utilities.xml_tokenize(in_stream, UNPROVIDED, UNPROVIDED, UNPROVIDED));
				    final SubLObject message = thread.secondMultipleValue();
				    thread.resetMultipleValues();
				    return values(status, message);
				}
				problems = cons(list(server, $str59$n_a, $str60$no_connection), problems);
			    }
			} finally {
			    final SubLObject _prev_bind_0_$5 = $is_thread_performing_cleanupP$.currentBinding(thread);
			    try {
				$is_thread_performing_cleanupP$.bind(T, thread);
				final SubLObject _values = getValuesAsVector();
				if (NIL != in_stream) {
				    close(in_stream, UNPROVIDED);
				}
				restoreValuesFromVector(_values);
			    } finally {
				$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$5, thread);
			    }
			}
		    } catch (final Throwable catch_var) {
			Errors.handleThrowable(catch_var, NIL);
		    }
		} finally {
		    Errors.$error_handler$.rebind(_prev_bind_0, thread);
		}
	    } catch (final Throwable ccatch_env_var) {
		connection_error = Errors.handleThrowable(ccatch_env_var, $catch_error_message_target$.getGlobalValue());
	    } finally {
		thread.throwStack.pop();
	    }
	    problems = cons(list(server, $str59$n_a, connection_error), problems);
	    cdolist_list_var = cdolist_list_var.rest();
	    server = cdolist_list_var.first();
	}
	return values(NIL, problems);
    }

    public static SubLObject zk_analyze_session_heartbeat_response(final SubLObject tokens) {
	final SubLObject header = tokens.first();
	if (NIL != string_utilities.starts_with(header, $str140$HTTP_1_1_201_Created)) {
	    final SubLObject id_string = nth(FOUR_INTEGER, tokens);
	    return values(id_string, NIL);
	}
	return values(NIL, cconcatenate($$$Unexpected_HTTP_header_, new SubLObject[] { format_nil.format_nil_a_no_copy(header), $str66$_, format_nil.$format_nil_percent$.getGlobalValue() }));
    }

    public static SubLObject zk_delete_session(final SubLObject session_id) {
	final SubLThread thread = SubLProcess.currentSubLThread();
	final SubLObject session_uri = cconcatenate($str147$_sessions_v1_, format_nil.format_nil_a_no_copy(session_id));
	SubLObject problems = NIL;
	SubLObject cdolist_list_var = $zookeeper_rest_servers$.getDynamicValue(thread);
	SubLObject server = NIL;
	server = cdolist_list_var.first();
	while (NIL != cdolist_list_var) {
	    SubLObject connection_error = NIL;
	    try {
		thread.throwStack.push($catch_error_message_target$.getGlobalValue());
		final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
		try {
		    Errors.$error_handler$.bind(CATCH_ERROR_MESSAGE_HANDLER, thread);
		    try {
			final SubLObject real_port = ($zookeeper_rest_port$.getDynamicValue(thread).eql($DEFAULT)) ? $int$80 : $zookeeper_rest_port$.getDynamicValue(thread);
			SubLObject in_stream = NIL;
			try {
			    in_stream = subl_promotions.open_tcp_stream_with_timeout(server, real_port, $zookeeper_rest_timeout$.getDynamicValue(thread), $PRIVATE);
			    if (NIL != validate_tcp_connection(in_stream, server, real_port)) {
				web_utilities.send_http_request(in_stream, list(new SubLObject[] { $MACHINE, server, $PORT, $zookeeper_rest_port$.getDynamicValue(thread), $METHOD, $DELETE, $URL, session_uri, $QUERY, $str69$, $kw52$KEEP_ALIVE_, NIL, $kw53$WIDE_NEWLINES_, NIL, $ACCEPT_TYPES, $list6,
					$CONTENT_TYPE, $str56$application_octet_stream, $SOAP_ACTION_URI, NIL }));
				if (in_stream.isStream()) {
				    thread.resetMultipleValues();
				    final SubLObject status = zk_analyze_delete_session_response(xml_parsing_utilities.xml_tokenize(in_stream, UNPROVIDED, UNPROVIDED, UNPROVIDED));
				    final SubLObject message = thread.secondMultipleValue();
				    thread.resetMultipleValues();
				    return values(status, message);
				}
				problems = cons(list(server, $str59$n_a, $str60$no_connection), problems);
			    }
			} finally {
			    final SubLObject _prev_bind_0_$6 = $is_thread_performing_cleanupP$.currentBinding(thread);
			    try {
				$is_thread_performing_cleanupP$.bind(T, thread);
				final SubLObject _values = getValuesAsVector();
				if (NIL != in_stream) {
				    close(in_stream, UNPROVIDED);
				}
				restoreValuesFromVector(_values);
			    } finally {
				$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$6, thread);
			    }
			}
		    } catch (final Throwable catch_var) {
			Errors.handleThrowable(catch_var, NIL);
		    }
		} finally {
		    Errors.$error_handler$.rebind(_prev_bind_0, thread);
		}
	    } catch (final Throwable ccatch_env_var) {
		connection_error = Errors.handleThrowable(ccatch_env_var, $catch_error_message_target$.getGlobalValue());
	    } finally {
		thread.throwStack.pop();
	    }
	    problems = cons(list(server, $str59$n_a, connection_error), problems);
	    cdolist_list_var = cdolist_list_var.rest();
	    server = cdolist_list_var.first();
	}
	return Errors.error($str61$Could_not_create_node_on_any_serv, problems);
    }

    public static SubLObject zk_analyze_delete_session_response(final SubLObject tokens) {
	final SubLObject header = tokens.first();
	if (NIL != string_utilities.starts_with(header, $str70$HTTP_1_1_204_No_Content)) {
	    return values(T, NIL);
	}
	if (NIL != string_utilities.starts_with(header, $str63$HTTP_1_1_404_Not_Found)) {
	    return values(NIL, $str149$No_such_session_);
	}
	return values(NIL, cconcatenate($$$Unexpected_HTTP_header_, new SubLObject[] { format_nil.format_nil_a_no_copy(header), $str66$_, format_nil.$format_nil_percent$.getGlobalValue() }));
    }

    public static SubLObject declare_zookeeper_file() {
	declareFunction("zk_get_node_children", "ZK-GET-NODE-CHILDREN", 1, 0, false);
	declareFunction("zk_child_state_print_function_trampoline", "ZK-CHILD-STATE-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
	declareFunction("zk_child_state_p", "ZK-CHILD-STATE-P", 1, 0, false);
	new zookeeper.$zk_child_state_p$UnaryFunction();
	declareFunction("zkkids_path", "ZKKIDS-PATH", 1, 0, false);
	declareFunction("zkkids_uri", "ZKKIDS-URI", 1, 0, false);
	declareFunction("zkkids_child_uri_template", "ZKKIDS-CHILD-URI-TEMPLATE", 1, 0, false);
	declareFunction("zkkids_children", "ZKKIDS-CHILDREN", 1, 0, false);
	declareFunction("_csetf_zkkids_path", "_CSETF-ZKKIDS-PATH", 2, 0, false);
	declareFunction("_csetf_zkkids_uri", "_CSETF-ZKKIDS-URI", 2, 0, false);
	declareFunction("_csetf_zkkids_child_uri_template", "_CSETF-ZKKIDS-CHILD-URI-TEMPLATE", 2, 0, false);
	declareFunction("_csetf_zkkids_children", "_CSETF-ZKKIDS-CHILDREN", 2, 0, false);
	declareFunction("make_zk_child_state", "MAKE-ZK-CHILD-STATE", 0, 1, false);
	declareFunction("visit_defstruct_zk_child_state", "VISIT-DEFSTRUCT-ZK-CHILD-STATE", 2, 0, false);
	declareFunction("visit_defstruct_object_zk_child_state_method", "VISIT-DEFSTRUCT-OBJECT-ZK-CHILD-STATE-METHOD", 2, 0, false);
	declareFunction("parse_zk_children", "PARSE-ZK-CHILDREN", 1, 0, false);
	declareFunction("zk_set_node_data", "ZK-SET-NODE-DATA", 2, 0, false);
	declareFunction("zk_analyze_set_response", "ZK-ANALYZE-SET-RESPONSE", 1, 0, false);
	declareFunction("zk_delete_node", "ZK-DELETE-NODE", 1, 0, false);
	declareFunction("zk_analyze_delete_response", "ZK-ANALYZE-DELETE-RESPONSE", 1, 0, false);
	declareFunction("zk_get_node_state", "ZK-GET-NODE-STATE", 1, 0, false);
	declareFunction("zk_node_state_print_function_trampoline", "ZK-NODE-STATE-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
	declareFunction("zk_node_state_p", "ZK-NODE-STATE-P", 1, 0, false);
	new zookeeper.$zk_node_state_p$UnaryFunction();
	declareFunction("zkstat_path", "ZKSTAT-PATH", 1, 0, false);
	declareFunction("zkstat_uri", "ZKSTAT-URI", 1, 0, false);
	declareFunction("zkstat_data", "ZKSTAT-DATA", 1, 0, false);
	declareFunction("zkstat_czxid", "ZKSTAT-CZXID", 1, 0, false);
	declareFunction("zkstat_mzxid", "ZKSTAT-MZXID", 1, 0, false);
	declareFunction("zkstat_ctime", "ZKSTAT-CTIME", 1, 0, false);
	declareFunction("zkstat_mtime", "ZKSTAT-MTIME", 1, 0, false);
	declareFunction("zkstat_version", "ZKSTAT-VERSION", 1, 0, false);
	declareFunction("zkstat_cversion", "ZKSTAT-CVERSION", 1, 0, false);
	declareFunction("zkstat_aversion", "ZKSTAT-AVERSION", 1, 0, false);
	declareFunction("zkstat_ephemeral_owner", "ZKSTAT-EPHEMERAL-OWNER", 1, 0, false);
	declareFunction("zkstat_data_len", "ZKSTAT-DATA-LEN", 1, 0, false);
	declareFunction("zkstat_num_children", "ZKSTAT-NUM-CHILDREN", 1, 0, false);
	declareFunction("zkstat_pzxid", "ZKSTAT-PZXID", 1, 0, false);
	declareFunction("_csetf_zkstat_path", "_CSETF-ZKSTAT-PATH", 2, 0, false);
	declareFunction("_csetf_zkstat_uri", "_CSETF-ZKSTAT-URI", 2, 0, false);
	declareFunction("_csetf_zkstat_data", "_CSETF-ZKSTAT-DATA", 2, 0, false);
	declareFunction("_csetf_zkstat_czxid", "_CSETF-ZKSTAT-CZXID", 2, 0, false);
	declareFunction("_csetf_zkstat_mzxid", "_CSETF-ZKSTAT-MZXID", 2, 0, false);
	declareFunction("_csetf_zkstat_ctime", "_CSETF-ZKSTAT-CTIME", 2, 0, false);
	declareFunction("_csetf_zkstat_mtime", "_CSETF-ZKSTAT-MTIME", 2, 0, false);
	declareFunction("_csetf_zkstat_version", "_CSETF-ZKSTAT-VERSION", 2, 0, false);
	declareFunction("_csetf_zkstat_cversion", "_CSETF-ZKSTAT-CVERSION", 2, 0, false);
	declareFunction("_csetf_zkstat_aversion", "_CSETF-ZKSTAT-AVERSION", 2, 0, false);
	declareFunction("_csetf_zkstat_ephemeral_owner", "_CSETF-ZKSTAT-EPHEMERAL-OWNER", 2, 0, false);
	declareFunction("_csetf_zkstat_data_len", "_CSETF-ZKSTAT-DATA-LEN", 2, 0, false);
	declareFunction("_csetf_zkstat_num_children", "_CSETF-ZKSTAT-NUM-CHILDREN", 2, 0, false);
	declareFunction("_csetf_zkstat_pzxid", "_CSETF-ZKSTAT-PZXID", 2, 0, false);
	declareFunction("make_zk_node_state", "MAKE-ZK-NODE-STATE", 0, 1, false);
	declareFunction("visit_defstruct_zk_node_state", "VISIT-DEFSTRUCT-ZK-NODE-STATE", 2, 0, false);
	declareFunction("visit_defstruct_object_zk_node_state_method", "VISIT-DEFSTRUCT-OBJECT-ZK-NODE-STATE-METHOD", 2, 0, false);
	declareFunction("parse_zk_state", "PARSE-ZK-STATE", 1, 0, false);
	declareFunction("zk_must_match_closing_tag", "ZK-MUST-MATCH-CLOSING-TAG", 2, 0, false);
	declareFunction("zk_create_permanent_node", "ZK-CREATE-PERMANENT-NODE", 2, 1, false);
	declareFunction("zk_analyze_create_response", "ZK-ANALYZE-CREATE-RESPONSE", 1, 0, false);
	declareFunction("zk_create_session", "ZK-CREATE-SESSION", 0, 1, false);
	declareFunction("zk_analyze_create_session_response", "ZK-ANALYZE-CREATE-SESSION-RESPONSE", 1, 0, false);
	declareFunction("zk_send_session_heartbeat", "ZK-SEND-SESSION-HEARTBEAT", 1, 0, false);
	declareFunction("zk_analyze_session_heartbeat_response", "ZK-ANALYZE-SESSION-HEARTBEAT-RESPONSE", 1, 0, false);
	declareFunction("zk_delete_session", "ZK-DELETE-SESSION", 1, 0, false);
	declareFunction("zk_analyze_delete_session_response", "ZK-ANALYZE-DELETE-SESSION-RESPONSE", 1, 0, false);
	return NIL;
    }

    public static SubLObject init_zookeeper_file() {
	defparameter("*ZOOKEEPER-REST-SERVERS*", list($$$localhost));
	defparameter("*ZOOKEEPER-REST-PORT*", $int$9998);
	defparameter("*ZOOKEEPER-REST-TIMEOUT*", $int$60);
	defconstant("*DTP-ZK-CHILD-STATE*", ZK_CHILD_STATE);
	defconstant("*DTP-ZK-NODE-STATE*", ZK_NODE_STATE);
	return NIL;
    }

    public static SubLObject setup_zookeeper_file() {
	register_external_symbol(ZK_GET_NODE_CHILDREN);
	register_method($print_object_method_table$.getGlobalValue(), $dtp_zk_child_state$.getGlobalValue(), symbol_function(ZK_CHILD_STATE_PRINT_FUNCTION_TRAMPOLINE));
	SubLSpecialOperatorDeclarations.proclaim($list15);
	def_csetf(ZKKIDS_PATH, _CSETF_ZKKIDS_PATH);
	def_csetf(ZKKIDS_URI, _CSETF_ZKKIDS_URI);
	def_csetf(ZKKIDS_CHILD_URI_TEMPLATE, _CSETF_ZKKIDS_CHILD_URI_TEMPLATE);
	def_csetf(ZKKIDS_CHILDREN, _CSETF_ZKKIDS_CHILDREN);
	identity(ZK_CHILD_STATE);
	register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $dtp_zk_child_state$.getGlobalValue(), symbol_function(VISIT_DEFSTRUCT_OBJECT_ZK_CHILD_STATE_METHOD));
	register_external_symbol(ZK_SET_NODE_DATA);
	register_external_symbol(ZK_DELETE_NODE);
	register_external_symbol(ZK_GET_NODE_STATE);
	register_method($print_object_method_table$.getGlobalValue(), $dtp_zk_node_state$.getGlobalValue(), symbol_function(ZK_NODE_STATE_PRINT_FUNCTION_TRAMPOLINE));
	SubLSpecialOperatorDeclarations.proclaim($list80);
	def_csetf(ZKSTAT_PATH, _CSETF_ZKSTAT_PATH);
	def_csetf(ZKSTAT_URI, _CSETF_ZKSTAT_URI);
	def_csetf(ZKSTAT_DATA, _CSETF_ZKSTAT_DATA);
	def_csetf(ZKSTAT_CZXID, _CSETF_ZKSTAT_CZXID);
	def_csetf(ZKSTAT_MZXID, _CSETF_ZKSTAT_MZXID);
	def_csetf(ZKSTAT_CTIME, _CSETF_ZKSTAT_CTIME);
	def_csetf(ZKSTAT_MTIME, _CSETF_ZKSTAT_MTIME);
	def_csetf(ZKSTAT_VERSION, _CSETF_ZKSTAT_VERSION);
	def_csetf(ZKSTAT_CVERSION, _CSETF_ZKSTAT_CVERSION);
	def_csetf(ZKSTAT_AVERSION, _CSETF_ZKSTAT_AVERSION);
	def_csetf(ZKSTAT_EPHEMERAL_OWNER, _CSETF_ZKSTAT_EPHEMERAL_OWNER);
	def_csetf(ZKSTAT_DATA_LEN, _CSETF_ZKSTAT_DATA_LEN);
	def_csetf(ZKSTAT_NUM_CHILDREN, _CSETF_ZKSTAT_NUM_CHILDREN);
	def_csetf(ZKSTAT_PZXID, _CSETF_ZKSTAT_PZXID);
	identity(ZK_NODE_STATE);
	register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $dtp_zk_node_state$.getGlobalValue(), symbol_function(VISIT_DEFSTRUCT_OBJECT_ZK_NODE_STATE_METHOD));
	register_external_symbol(ZK_CREATE_PERMANENT_NODE);
	register_external_symbol(ZK_CREATE_SESSION);
	register_external_symbol(ZK_SEND_SESSION_HEARTBEAT);
	register_external_symbol(ZK_DELETE_SESSION);
	return NIL;
    }

    @Override
    public void declareFunctions() {
	declare_zookeeper_file();
    }

    @Override
    public void initializeVariables() {
	init_zookeeper_file();
    }

    @Override
    public void runTopLevelForms() {
	setup_zookeeper_file();
    }

    static {

    }

    public static final class $zk_child_state_native extends SubLStructNative {
	public SubLObject $path;

	public SubLObject $uri;

	public SubLObject $child_uri_template;

	public SubLObject $children;

	private static final SubLStructDeclNative structDecl;

	private $zk_child_state_native() {
	    this.$path = Lisp.NIL;
	    this.$uri = Lisp.NIL;
	    this.$child_uri_template = Lisp.NIL;
	    this.$children = Lisp.NIL;
	}

	@Override
	public SubLStructDecl getStructDecl() {
	    return structDecl;
	}

	@Override
	public SubLObject getField2() {
	    return this.$path;
	}

	@Override
	public SubLObject getField3() {
	    return this.$uri;
	}

	@Override
	public SubLObject getField4() {
	    return this.$child_uri_template;
	}

	@Override
	public SubLObject getField5() {
	    return this.$children;
	}

	@Override
	public SubLObject setField2(final SubLObject value) {
	    return this.$path = value;
	}

	@Override
	public SubLObject setField3(final SubLObject value) {
	    return this.$uri = value;
	}

	@Override
	public SubLObject setField4(final SubLObject value) {
	    return this.$child_uri_template = value;
	}

	@Override
	public SubLObject setField5(final SubLObject value) {
	    return this.$children = value;
	}

	static {
	    structDecl = makeStructDeclNative($zk_child_state_native.class, ZK_CHILD_STATE, ZK_CHILD_STATE_P, $list9, $list10, new String[] { "$path", "$uri", "$child_uri_template", "$children" }, $list11, $list12, DEFAULT_STRUCT_PRINT_FUNCTION);
	}
    }

    public static final class $zk_child_state_p$UnaryFunction extends UnaryFunction {
	public $zk_child_state_p$UnaryFunction() {
	    super(extractFunctionNamed("ZK-CHILD-STATE-P"));
	}

	@Override
	public SubLObject processItem(final SubLObject arg1) {
	    return zk_child_state_p(arg1);
	}
    }

    public static final class $zk_node_state_native extends SubLStructNative {
	public SubLObject $path;

	public SubLObject $uri;

	public SubLObject $data;

	public SubLObject $czxid;

	public SubLObject $mzxid;

	public SubLObject $ctime;

	public SubLObject $mtime;

	public SubLObject $version;

	public SubLObject $cversion;

	public SubLObject $aversion;

	public SubLObject $ephemeral_owner;

	public SubLObject $data_len;

	public SubLObject $num_children;

	public SubLObject $pzxid;

	private static final SubLStructDeclNative structDecl;

	private $zk_node_state_native() {
	    this.$path = Lisp.NIL;
	    this.$uri = Lisp.NIL;
	    this.$data = Lisp.NIL;
	    this.$czxid = Lisp.NIL;
	    this.$mzxid = Lisp.NIL;
	    this.$ctime = Lisp.NIL;
	    this.$mtime = Lisp.NIL;
	    this.$version = Lisp.NIL;
	    this.$cversion = Lisp.NIL;
	    this.$aversion = Lisp.NIL;
	    this.$ephemeral_owner = Lisp.NIL;
	    this.$data_len = Lisp.NIL;
	    this.$num_children = Lisp.NIL;
	    this.$pzxid = Lisp.NIL;
	}

	@Override
	public SubLStructDecl getStructDecl() {
	    return structDecl;
	}

	@Override
	public SubLObject getField2() {
	    return this.$path;
	}

	@Override
	public SubLObject getField3() {
	    return this.$uri;
	}

	@Override
	public SubLObject getField4() {
	    return this.$data;
	}

	@Override
	public SubLObject getField5() {
	    return this.$czxid;
	}

	@Override
	public SubLObject getField6() {
	    return this.$mzxid;
	}

	@Override
	public SubLObject getField7() {
	    return this.$ctime;
	}

	@Override
	public SubLObject getField8() {
	    return this.$mtime;
	}

	@Override
	public SubLObject getField9() {
	    return this.$version;
	}

	@Override
	public SubLObject getField10() {
	    return this.$cversion;
	}

	@Override
	public SubLObject getField11() {
	    return this.$aversion;
	}

	@Override
	public SubLObject getField12() {
	    return this.$ephemeral_owner;
	}

	@Override
	public SubLObject getField13() {
	    return this.$data_len;
	}

	@Override
	public SubLObject getField14() {
	    return this.$num_children;
	}

	@Override
	public SubLObject getField15() {
	    return this.$pzxid;
	}

	@Override
	public SubLObject setField2(final SubLObject value) {
	    return this.$path = value;
	}

	@Override
	public SubLObject setField3(final SubLObject value) {
	    return this.$uri = value;
	}

	@Override
	public SubLObject setField4(final SubLObject value) {
	    return this.$data = value;
	}

	@Override
	public SubLObject setField5(final SubLObject value) {
	    return this.$czxid = value;
	}

	@Override
	public SubLObject setField6(final SubLObject value) {
	    return this.$mzxid = value;
	}

	@Override
	public SubLObject setField7(final SubLObject value) {
	    return this.$ctime = value;
	}

	@Override
	public SubLObject setField8(final SubLObject value) {
	    return this.$mtime = value;
	}

	@Override
	public SubLObject setField9(final SubLObject value) {
	    return this.$version = value;
	}

	@Override
	public SubLObject setField10(final SubLObject value) {
	    return this.$cversion = value;
	}

	@Override
	public SubLObject setField11(final SubLObject value) {
	    return this.$aversion = value;
	}

	@Override
	public SubLObject setField12(final SubLObject value) {
	    return this.$ephemeral_owner = value;
	}

	@Override
	public SubLObject setField13(final SubLObject value) {
	    return this.$data_len = value;
	}

	@Override
	public SubLObject setField14(final SubLObject value) {
	    return this.$num_children = value;
	}

	@Override
	public SubLObject setField15(final SubLObject value) {
	    return this.$pzxid = value;
	}

	static {
	    structDecl = makeStructDeclNative($zk_node_state_native.class, ZK_NODE_STATE, ZK_NODE_STATE_P, $list75, $list76,
		    new String[] { "$path", "$uri", "$data", "$czxid", "$mzxid", "$ctime", "$mtime", "$version", "$cversion", "$aversion", "$ephemeral_owner", "$data_len", "$num_children", "$pzxid" }, $list77, $list78, DEFAULT_STRUCT_PRINT_FUNCTION);
	}
    }

    public static final class $zk_node_state_p$UnaryFunction extends UnaryFunction {
	public $zk_node_state_p$UnaryFunction() {
	    super(extractFunctionNamed("ZK-NODE-STATE-P"));
	}

	@Override
	public SubLObject processItem(final SubLObject arg1) {
	    return zk_node_state_p(arg1);
	}
    }
}

/**
 * Total time: 474 ms
 */
