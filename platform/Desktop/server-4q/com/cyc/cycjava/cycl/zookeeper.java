package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.UnaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDecl;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDeclNative;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLStructNative;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.visitation;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLSpecialOperatorDeclarations;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.compatibility;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class zookeeper extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.zookeeper";
    public static final String myFingerPrint = "56ef334dd5fdb72ff061a0ae757c68ffebc9e46418c8090be58bbcd4d1bc1de9";
    @SubLTranslatedFile.SubL(source = "cycl/zookeeper.lisp", position = 841L)
    public static SubLSymbol $zookeeper_rest_servers$;
    @SubLTranslatedFile.SubL(source = "cycl/zookeeper.lisp", position = 1039L)
    public static SubLSymbol $zookeeper_rest_port$;
    @SubLTranslatedFile.SubL(source = "cycl/zookeeper.lisp", position = 1147L)
    public static SubLSymbol $zookeeper_rest_timeout$;
    @SubLTranslatedFile.SubL(source = "cycl/zookeeper.lisp", position = 2647L)
    public static SubLSymbol $dtp_zk_child_state$;
    @SubLTranslatedFile.SubL(source = "cycl/zookeeper.lisp", position = 9388L)
    public static SubLSymbol $dtp_zk_node_state$;
    private static final SubLString $str0$localhost;
    private static final SubLInteger $int1$9998;
    private static final SubLInteger $int2$60;
    private static final SubLSymbol $sym3$ZK_GET_NODE_CHILDREN;
    private static final SubLString $str4$view_children;
    private static final SubLSymbol $kw5$GET;
    private static final SubLList $list6;
    private static final SubLSymbol $sym7$ZK_CHILD_STATE;
    private static final SubLSymbol $sym8$ZK_CHILD_STATE_P;
    private static final SubLList $list9;
    private static final SubLList $list10;
    private static final SubLList $list11;
    private static final SubLList $list12;
    private static final SubLSymbol $sym13$DEFAULT_STRUCT_PRINT_FUNCTION;
    private static final SubLSymbol $sym14$ZK_CHILD_STATE_PRINT_FUNCTION_TRAMPOLINE;
    private static final SubLList $list15;
    private static final SubLSymbol $sym16$ZKKIDS_PATH;
    private static final SubLSymbol $sym17$_CSETF_ZKKIDS_PATH;
    private static final SubLSymbol $sym18$ZKKIDS_URI;
    private static final SubLSymbol $sym19$_CSETF_ZKKIDS_URI;
    private static final SubLSymbol $sym20$ZKKIDS_CHILD_URI_TEMPLATE;
    private static final SubLSymbol $sym21$_CSETF_ZKKIDS_CHILD_URI_TEMPLATE;
    private static final SubLSymbol $sym22$ZKKIDS_CHILDREN;
    private static final SubLSymbol $sym23$_CSETF_ZKKIDS_CHILDREN;
    private static final SubLSymbol $kw24$PATH;
    private static final SubLSymbol $kw25$URI;
    private static final SubLSymbol $kw26$CHILD_URI_TEMPLATE;
    private static final SubLSymbol $kw27$CHILDREN;
    private static final SubLString $str28$Invalid_slot__S_for_construction_;
    private static final SubLSymbol $kw29$BEGIN;
    private static final SubLSymbol $sym30$MAKE_ZK_CHILD_STATE;
    private static final SubLSymbol $kw31$SLOT;
    private static final SubLSymbol $kw32$END;
    private static final SubLSymbol $sym33$VISIT_DEFSTRUCT_OBJECT_ZK_CHILD_STATE_METHOD;
    private static final SubLString $str34$child;
    private static final SubLString $str35$path;
    private static final SubLString $str36$uri;
    private static final SubLString $str37$child_uri_template;
    private static final SubLString $str38$children;
    private static final SubLString $str39$Unexpected_XML_tag__A___;
    private static final SubLString $str40$Unexpected_token_stream__A_;
    private static final SubLSymbol $sym41$ZK_SET_NODE_DATA;
    private static final SubLSymbol $sym42$CATCH_ERROR_MESSAGE_HANDLER;
    private static final SubLSymbol $kw43$DEFAULT;
    private static final SubLInteger $int44$80;
    private static final SubLSymbol $kw45$PRIVATE;
    private static final SubLSymbol $kw46$MACHINE;
    private static final SubLSymbol $kw47$PORT;
    private static final SubLSymbol $kw48$METHOD;
    private static final SubLSymbol $kw49$PUT;
    private static final SubLSymbol $kw50$URL;
    private static final SubLSymbol $kw51$QUERY;
    private static final SubLSymbol $kw52$KEEP_ALIVE_;
    private static final SubLSymbol $kw53$WIDE_NEWLINES_;
    private static final SubLSymbol $kw54$ACCEPT_TYPES;
    private static final SubLSymbol $kw55$CONTENT_TYPE;
    private static final SubLString $str56$application_octet_stream;
    private static final SubLSymbol $kw57$SOAP_ACTION_URI;
    private static final SubLSymbol $sym58$_EXIT;
    private static final SubLString $str59$n_a;
    private static final SubLString $str60$no_connection;
    private static final SubLString $str61$Could_not_create_node_on_any_serv;
    private static final SubLString $str62$HTTP_1_1_200_OK;
    private static final SubLString $str63$HTTP_1_1_404_Not_Found;
    private static final SubLString $str64$No_such_node_;
    private static final SubLString $str65$Unexpected_HTTP_header_;
    private static final SubLString $str66$_;
    private static final SubLSymbol $sym67$ZK_DELETE_NODE;
    private static final SubLSymbol $kw68$DELETE;
    private static final SubLString $str69$;
    private static final SubLString $str70$HTTP_1_1_204_No_Content;
    private static final SubLSymbol $sym71$ZK_GET_NODE_STATE;
    private static final SubLString $str72$dataformat_utf8;
    private static final SubLSymbol $sym73$ZK_NODE_STATE;
    private static final SubLSymbol $sym74$ZK_NODE_STATE_P;
    private static final SubLList $list75;
    private static final SubLList $list76;
    private static final SubLList $list77;
    private static final SubLList $list78;
    private static final SubLSymbol $sym79$ZK_NODE_STATE_PRINT_FUNCTION_TRAMPOLINE;
    private static final SubLList $list80;
    private static final SubLSymbol $sym81$ZKSTAT_PATH;
    private static final SubLSymbol $sym82$_CSETF_ZKSTAT_PATH;
    private static final SubLSymbol $sym83$ZKSTAT_URI;
    private static final SubLSymbol $sym84$_CSETF_ZKSTAT_URI;
    private static final SubLSymbol $sym85$ZKSTAT_DATA;
    private static final SubLSymbol $sym86$_CSETF_ZKSTAT_DATA;
    private static final SubLSymbol $sym87$ZKSTAT_CZXID;
    private static final SubLSymbol $sym88$_CSETF_ZKSTAT_CZXID;
    private static final SubLSymbol $sym89$ZKSTAT_MZXID;
    private static final SubLSymbol $sym90$_CSETF_ZKSTAT_MZXID;
    private static final SubLSymbol $sym91$ZKSTAT_CTIME;
    private static final SubLSymbol $sym92$_CSETF_ZKSTAT_CTIME;
    private static final SubLSymbol $sym93$ZKSTAT_MTIME;
    private static final SubLSymbol $sym94$_CSETF_ZKSTAT_MTIME;
    private static final SubLSymbol $sym95$ZKSTAT_VERSION;
    private static final SubLSymbol $sym96$_CSETF_ZKSTAT_VERSION;
    private static final SubLSymbol $sym97$ZKSTAT_CVERSION;
    private static final SubLSymbol $sym98$_CSETF_ZKSTAT_CVERSION;
    private static final SubLSymbol $sym99$ZKSTAT_AVERSION;
    private static final SubLSymbol $sym100$_CSETF_ZKSTAT_AVERSION;
    private static final SubLSymbol $sym101$ZKSTAT_EPHEMERAL_OWNER;
    private static final SubLSymbol $sym102$_CSETF_ZKSTAT_EPHEMERAL_OWNER;
    private static final SubLSymbol $sym103$ZKSTAT_DATA_LEN;
    private static final SubLSymbol $sym104$_CSETF_ZKSTAT_DATA_LEN;
    private static final SubLSymbol $sym105$ZKSTAT_NUM_CHILDREN;
    private static final SubLSymbol $sym106$_CSETF_ZKSTAT_NUM_CHILDREN;
    private static final SubLSymbol $sym107$ZKSTAT_PZXID;
    private static final SubLSymbol $sym108$_CSETF_ZKSTAT_PZXID;
    private static final SubLSymbol $kw109$DATA;
    private static final SubLSymbol $kw110$CZXID;
    private static final SubLSymbol $kw111$MZXID;
    private static final SubLSymbol $kw112$CTIME;
    private static final SubLSymbol $kw113$MTIME;
    private static final SubLSymbol $kw114$VERSION;
    private static final SubLSymbol $kw115$CVERSION;
    private static final SubLSymbol $kw116$AVERSION;
    private static final SubLSymbol $kw117$EPHEMERAL_OWNER;
    private static final SubLSymbol $kw118$DATA_LEN;
    private static final SubLSymbol $kw119$NUM_CHILDREN;
    private static final SubLSymbol $kw120$PZXID;
    private static final SubLSymbol $sym121$MAKE_ZK_NODE_STATE;
    private static final SubLSymbol $sym122$VISIT_DEFSTRUCT_OBJECT_ZK_NODE_STATE_METHOD;
    private static final SubLString $str123$stat;
    private static final SubLString $str124$dataUtf8;
    private static final SubLString $str125$czxid;
    private static final SubLString $str126$mzxid;
    private static final SubLString $str127$pzxid;
    private static final SubLString $str128$ctime;
    private static final SubLString $str129$mtime;
    private static final SubLString $str130$version;
    private static final SubLString $str131$aversion;
    private static final SubLString $str132$cversion;
    private static final SubLString $str133$ephemeralOwner;
    private static final SubLString $str134$dataLength;
    private static final SubLString $str135$numChildren;
    private static final SubLString $str136$Expected_closing_tag__A_but_got__;
    private static final SubLSymbol $sym137$ZK_CREATE_PERMANENT_NODE;
    private static final SubLString $str138$_op_create_name_;
    private static final SubLSymbol $kw139$POST;
    private static final SubLString $str140$HTTP_1_1_201_Created;
    private static final SubLString $str141$HTTP_1_1_409_Conflict;
    private static final SubLString $str142$Node_already_exits_;
    private static final SubLString $str143$No_such_parent_node_;
    private static final SubLSymbol $sym144$ZK_CREATE_SESSION;
    private static final SubLString $str145$_sessions_v1__op_create_expire_;
    private static final SubLSymbol $sym146$ZK_SEND_SESSION_HEARTBEAT;
    private static final SubLString $str147$_sessions_v1_;
    private static final SubLSymbol $sym148$ZK_DELETE_SESSION;
    private static final SubLString $str149$No_such_session_;
    
    @SubLTranslatedFile.SubL(source = "cycl/zookeeper.lisp", position = 1239L)
    public static SubLObject zk_get_node_children(final SubLObject node_path) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject port = zookeeper.$zookeeper_rest_port$.getDynamicValue(thread);
        final SubLObject timeout = zookeeper.$zookeeper_rest_timeout$.getDynamicValue(thread);
        SubLObject problems = (SubLObject)zookeeper.NIL;
        SubLObject cdolist_list_var = zookeeper.$zookeeper_rest_servers$.getDynamicValue(thread);
        SubLObject server = (SubLObject)zookeeper.NIL;
        server = cdolist_list_var.first();
        while (zookeeper.NIL != cdolist_list_var) {
            thread.resetMultipleValues();
            final SubLObject xml_tokens = xml_parsing_utilities.xml_tokenized_http_request(server, node_path, (SubLObject)zookeeper.$str4$view_children, (SubLObject)zookeeper.$kw5$GET, port, (SubLObject)zookeeper.NIL, (SubLObject)zookeeper.NIL, timeout, timeout, (SubLObject)zookeeper.NIL, (SubLObject)zookeeper.$list6);
            final SubLObject status = thread.secondMultipleValue();
            final SubLObject status_msg = thread.thirdMultipleValue();
            thread.resetMultipleValues();
            if (zookeeper.NIL == status) {
                return Values.values(parse_zk_children(xml_tokens), (SubLObject)zookeeper.NIL);
            }
            problems = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(server, status, status_msg), problems);
            cdolist_list_var = cdolist_list_var.rest();
            server = cdolist_list_var.first();
        }
        return Values.values((SubLObject)zookeeper.NIL, problems);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/zookeeper.lisp", position = 2647L)
    public static SubLObject zk_child_state_print_function_trampoline(final SubLObject v_object, final SubLObject stream) {
        compatibility.default_struct_print_function(v_object, stream, (SubLObject)zookeeper.ZERO_INTEGER);
        return (SubLObject)zookeeper.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/zookeeper.lisp", position = 2647L)
    public static SubLObject zk_child_state_p(final SubLObject v_object) {
        return (SubLObject)((v_object.getClass() == $zk_child_state_native.class) ? zookeeper.T : zookeeper.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/zookeeper.lisp", position = 2647L)
    public static SubLObject zkkids_path(final SubLObject v_object) {
        assert zookeeper.NIL != zk_child_state_p(v_object) : v_object;
        return v_object.getField2();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/zookeeper.lisp", position = 2647L)
    public static SubLObject zkkids_uri(final SubLObject v_object) {
        assert zookeeper.NIL != zk_child_state_p(v_object) : v_object;
        return v_object.getField3();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/zookeeper.lisp", position = 2647L)
    public static SubLObject zkkids_child_uri_template(final SubLObject v_object) {
        assert zookeeper.NIL != zk_child_state_p(v_object) : v_object;
        return v_object.getField4();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/zookeeper.lisp", position = 2647L)
    public static SubLObject zkkids_children(final SubLObject v_object) {
        assert zookeeper.NIL != zk_child_state_p(v_object) : v_object;
        return v_object.getField5();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/zookeeper.lisp", position = 2647L)
    public static SubLObject _csetf_zkkids_path(final SubLObject v_object, final SubLObject value) {
        assert zookeeper.NIL != zk_child_state_p(v_object) : v_object;
        return v_object.setField2(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/zookeeper.lisp", position = 2647L)
    public static SubLObject _csetf_zkkids_uri(final SubLObject v_object, final SubLObject value) {
        assert zookeeper.NIL != zk_child_state_p(v_object) : v_object;
        return v_object.setField3(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/zookeeper.lisp", position = 2647L)
    public static SubLObject _csetf_zkkids_child_uri_template(final SubLObject v_object, final SubLObject value) {
        assert zookeeper.NIL != zk_child_state_p(v_object) : v_object;
        return v_object.setField4(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/zookeeper.lisp", position = 2647L)
    public static SubLObject _csetf_zkkids_children(final SubLObject v_object, final SubLObject value) {
        assert zookeeper.NIL != zk_child_state_p(v_object) : v_object;
        return v_object.setField5(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/zookeeper.lisp", position = 2647L)
    public static SubLObject make_zk_child_state(SubLObject arglist) {
        if (arglist == zookeeper.UNPROVIDED) {
            arglist = (SubLObject)zookeeper.NIL;
        }
        final SubLObject v_new = (SubLObject)new $zk_child_state_native();
        SubLObject next;
        SubLObject current_arg;
        SubLObject current_value;
        SubLObject pcase_var;
        for (next = (SubLObject)zookeeper.NIL, next = arglist; zookeeper.NIL != next; next = conses_high.cddr(next)) {
            current_arg = next.first();
            current_value = conses_high.cadr(next);
            pcase_var = current_arg;
            if (pcase_var.eql((SubLObject)zookeeper.$kw24$PATH)) {
                _csetf_zkkids_path(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)zookeeper.$kw25$URI)) {
                _csetf_zkkids_uri(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)zookeeper.$kw26$CHILD_URI_TEMPLATE)) {
                _csetf_zkkids_child_uri_template(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)zookeeper.$kw27$CHILDREN)) {
                _csetf_zkkids_children(v_new, current_value);
            }
            else {
                Errors.error((SubLObject)zookeeper.$str28$Invalid_slot__S_for_construction_, current_arg);
            }
        }
        return v_new;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/zookeeper.lisp", position = 2647L)
    public static SubLObject visit_defstruct_zk_child_state(final SubLObject obj, final SubLObject visitor_fn) {
        Functions.funcall(visitor_fn, obj, (SubLObject)zookeeper.$kw29$BEGIN, (SubLObject)zookeeper.$sym30$MAKE_ZK_CHILD_STATE, (SubLObject)zookeeper.FOUR_INTEGER);
        Functions.funcall(visitor_fn, obj, (SubLObject)zookeeper.$kw31$SLOT, (SubLObject)zookeeper.$kw24$PATH, zkkids_path(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)zookeeper.$kw31$SLOT, (SubLObject)zookeeper.$kw25$URI, zkkids_uri(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)zookeeper.$kw31$SLOT, (SubLObject)zookeeper.$kw26$CHILD_URI_TEMPLATE, zkkids_child_uri_template(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)zookeeper.$kw31$SLOT, (SubLObject)zookeeper.$kw27$CHILDREN, zkkids_children(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)zookeeper.$kw32$END, (SubLObject)zookeeper.$sym30$MAKE_ZK_CHILD_STATE, (SubLObject)zookeeper.FOUR_INTEGER);
        return obj;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/zookeeper.lisp", position = 2647L)
    public static SubLObject visit_defstruct_object_zk_child_state_method(final SubLObject obj, final SubLObject visitor_fn) {
        return visit_defstruct_zk_child_state(obj, visitor_fn);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/zookeeper.lisp", position = 2896L)
    public static SubLObject parse_zk_children(final SubLObject xml_tokens) {
        final SubLObject node = make_zk_child_state((SubLObject)zookeeper.UNPROVIDED);
        final SubLObject tokens = iteration.new_list_iterator(xml_tokens);
        iteration.iteration_next(tokens);
        iteration.iteration_next(tokens);
        if (zookeeper.NIL != web_utilities.matching_open_tagP((SubLObject)zookeeper.$str34$child, iteration.iteration_next(tokens), (SubLObject)zookeeper.UNPROVIDED)) {
            SubLObject children = (SubLObject)zookeeper.NIL;
            while (zookeeper.NIL == iteration.iteration_done(tokens)) {
                final SubLObject tag = iteration.iteration_next(tokens);
                if (zookeeper.NIL != web_utilities.matching_close_tagP((SubLObject)zookeeper.$str34$child, tag, (SubLObject)zookeeper.UNPROVIDED)) {
                    return node;
                }
                if (zookeeper.NIL != web_utilities.matching_open_tagP((SubLObject)zookeeper.$str35$path, tag, (SubLObject)zookeeper.UNPROVIDED)) {
                    _csetf_zkkids_path(node, iteration.iteration_next(tokens));
                    zk_must_match_closing_tag(tokens, (SubLObject)zookeeper.$str35$path);
                }
                else if (zookeeper.NIL != web_utilities.matching_open_tagP((SubLObject)zookeeper.$str36$uri, tag, (SubLObject)zookeeper.UNPROVIDED)) {
                    _csetf_zkkids_uri(node, iteration.iteration_next(tokens));
                    zk_must_match_closing_tag(tokens, (SubLObject)zookeeper.$str36$uri);
                }
                else if (zookeeper.NIL != web_utilities.matching_open_tagP((SubLObject)zookeeper.$str37$child_uri_template, tag, (SubLObject)zookeeper.UNPROVIDED)) {
                    _csetf_zkkids_child_uri_template(node, iteration.iteration_next(tokens));
                    zk_must_match_closing_tag(tokens, (SubLObject)zookeeper.$str37$child_uri_template);
                }
                else if (zookeeper.NIL != web_utilities.matching_open_tagP((SubLObject)zookeeper.$str38$children, tag, (SubLObject)zookeeper.UNPROVIDED)) {
                    children = (SubLObject)zookeeper.NIL;
                }
                else if (zookeeper.NIL != web_utilities.matching_open_tagP((SubLObject)zookeeper.$str34$child, tag, (SubLObject)zookeeper.UNPROVIDED)) {
                    children = (SubLObject)ConsesLow.cons(iteration.iteration_next(tokens), children);
                    zk_must_match_closing_tag(tokens, (SubLObject)zookeeper.$str34$child);
                }
                else if (zookeeper.NIL != web_utilities.matching_close_tagP((SubLObject)zookeeper.$str38$children, tag, (SubLObject)zookeeper.UNPROVIDED)) {
                    _csetf_zkkids_children(node, Sequences.nreverse(children));
                }
                else {
                    Errors.error((SubLObject)zookeeper.$str39$Unexpected_XML_tag__A___, tag);
                }
            }
        }
        return Errors.error((SubLObject)zookeeper.$str40$Unexpected_token_stream__A_, tokens);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/zookeeper.lisp", position = 4569L)
    public static SubLObject zk_set_node_data(final SubLObject node_path, final SubLObject utf8_data) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject problems = (SubLObject)zookeeper.NIL;
        SubLObject cdolist_list_var = zookeeper.$zookeeper_rest_servers$.getDynamicValue(thread);
        SubLObject server = (SubLObject)zookeeper.NIL;
        server = cdolist_list_var.first();
        while (zookeeper.NIL != cdolist_list_var) {
            SubLObject connection_error = (SubLObject)zookeeper.NIL;
            try {
                thread.throwStack.push(subl_macro_promotions.$catch_error_message_target$.getGlobalValue());
                final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
                try {
                    Errors.$error_handler$.bind((SubLObject)zookeeper.$sym42$CATCH_ERROR_MESSAGE_HANDLER, thread);
                    try {
                        final SubLObject real_port = (SubLObject)(zookeeper.$zookeeper_rest_port$.getDynamicValue(thread).eql((SubLObject)zookeeper.$kw43$DEFAULT) ? zookeeper.$int44$80 : zookeeper.$zookeeper_rest_port$.getDynamicValue(thread));
                        SubLObject in_stream = (SubLObject)zookeeper.NIL;
                        try {
                            in_stream = subl_promotions.open_tcp_stream_with_timeout(server, real_port, zookeeper.$zookeeper_rest_timeout$.getDynamicValue(thread), (SubLObject)zookeeper.$kw45$PRIVATE);
                            if (zookeeper.NIL != subl_macro_promotions.validate_tcp_connection(in_stream, server, real_port)) {
                                web_utilities.send_http_request(in_stream, (SubLObject)ConsesLow.list(new SubLObject[] { zookeeper.$kw46$MACHINE, server, zookeeper.$kw47$PORT, zookeeper.$zookeeper_rest_port$.getDynamicValue(thread), zookeeper.$kw48$METHOD, zookeeper.$kw49$PUT, zookeeper.$kw50$URL, node_path, zookeeper.$kw51$QUERY, utf8_data, zookeeper.$kw52$KEEP_ALIVE_, zookeeper.NIL, zookeeper.$kw53$WIDE_NEWLINES_, zookeeper.NIL, zookeeper.$kw54$ACCEPT_TYPES, zookeeper.$list6, zookeeper.$kw55$CONTENT_TYPE, zookeeper.$str56$application_octet_stream, zookeeper.$kw57$SOAP_ACTION_URI, zookeeper.NIL }));
                                if (in_stream.isStream()) {
                                    thread.resetMultipleValues();
                                    final SubLObject status = zk_analyze_set_response(xml_parsing_utilities.xml_tokenize(in_stream, (SubLObject)zookeeper.UNPROVIDED, (SubLObject)zookeeper.UNPROVIDED, (SubLObject)zookeeper.UNPROVIDED));
                                    final SubLObject message = thread.secondMultipleValue();
                                    thread.resetMultipleValues();
                                    return Values.values(status, message);
                                }
                                problems = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(server, (SubLObject)zookeeper.$str59$n_a, (SubLObject)zookeeper.$str60$no_connection), problems);
                            }
                        }
                        finally {
                            final SubLObject _prev_bind_0_$1 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)zookeeper.T, thread);
                                final SubLObject _values = Values.getValuesAsVector();
                                if (zookeeper.NIL != in_stream) {
                                    streams_high.close(in_stream, (SubLObject)zookeeper.UNPROVIDED);
                                }
                                Values.restoreValuesFromVector(_values);
                            }
                            finally {
                                Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$1, thread);
                            }
                        }
                    }
                    catch (Throwable catch_var) {
                        Errors.handleThrowable(catch_var, (SubLObject)zookeeper.NIL);
                    }
                }
                finally {
                    Errors.$error_handler$.rebind(_prev_bind_0, thread);
                }
            }
            catch (Throwable ccatch_env_var) {
                connection_error = Errors.handleThrowable(ccatch_env_var, subl_macro_promotions.$catch_error_message_target$.getGlobalValue());
            }
            finally {
                thread.throwStack.pop();
            }
            problems = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(server, (SubLObject)zookeeper.$str59$n_a, connection_error), problems);
            cdolist_list_var = cdolist_list_var.rest();
            server = cdolist_list_var.first();
        }
        return Errors.error((SubLObject)zookeeper.$str61$Could_not_create_node_on_any_serv, problems);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/zookeeper.lisp", position = 6138L)
    public static SubLObject zk_analyze_set_response(final SubLObject tokens) {
        final SubLObject header = tokens.first();
        if (zookeeper.NIL != string_utilities.starts_with(header, (SubLObject)zookeeper.$str62$HTTP_1_1_200_OK)) {
            return Values.values((SubLObject)zookeeper.T, (SubLObject)zookeeper.NIL);
        }
        if (zookeeper.NIL != string_utilities.starts_with(header, (SubLObject)zookeeper.$str63$HTTP_1_1_404_Not_Found)) {
            return Values.values((SubLObject)zookeeper.NIL, (SubLObject)zookeeper.$str64$No_such_node_);
        }
        return Values.values((SubLObject)zookeeper.NIL, Sequences.cconcatenate((SubLObject)zookeeper.$str65$Unexpected_HTTP_header_, new SubLObject[] { format_nil.format_nil_a_no_copy(header), zookeeper.$str66$_, format_nil.$format_nil_percent$.getGlobalValue() }));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/zookeeper.lisp", position = 6488L)
    public static SubLObject zk_delete_node(final SubLObject node_path) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject problems = (SubLObject)zookeeper.NIL;
        SubLObject cdolist_list_var = zookeeper.$zookeeper_rest_servers$.getDynamicValue(thread);
        SubLObject server = (SubLObject)zookeeper.NIL;
        server = cdolist_list_var.first();
        while (zookeeper.NIL != cdolist_list_var) {
            SubLObject connection_error = (SubLObject)zookeeper.NIL;
            try {
                thread.throwStack.push(subl_macro_promotions.$catch_error_message_target$.getGlobalValue());
                final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
                try {
                    Errors.$error_handler$.bind((SubLObject)zookeeper.$sym42$CATCH_ERROR_MESSAGE_HANDLER, thread);
                    try {
                        final SubLObject real_port = (SubLObject)(zookeeper.$zookeeper_rest_port$.getDynamicValue(thread).eql((SubLObject)zookeeper.$kw43$DEFAULT) ? zookeeper.$int44$80 : zookeeper.$zookeeper_rest_port$.getDynamicValue(thread));
                        SubLObject in_stream = (SubLObject)zookeeper.NIL;
                        try {
                            in_stream = subl_promotions.open_tcp_stream_with_timeout(server, real_port, zookeeper.$zookeeper_rest_timeout$.getDynamicValue(thread), (SubLObject)zookeeper.$kw45$PRIVATE);
                            if (zookeeper.NIL != subl_macro_promotions.validate_tcp_connection(in_stream, server, real_port)) {
                                web_utilities.send_http_request(in_stream, (SubLObject)ConsesLow.list(new SubLObject[] { zookeeper.$kw46$MACHINE, server, zookeeper.$kw47$PORT, zookeeper.$zookeeper_rest_port$.getDynamicValue(thread), zookeeper.$kw48$METHOD, zookeeper.$kw68$DELETE, zookeeper.$kw50$URL, node_path, zookeeper.$kw51$QUERY, zookeeper.$str69$, zookeeper.$kw52$KEEP_ALIVE_, zookeeper.NIL, zookeeper.$kw53$WIDE_NEWLINES_, zookeeper.NIL, zookeeper.$kw54$ACCEPT_TYPES, zookeeper.$list6, zookeeper.$kw55$CONTENT_TYPE, zookeeper.$str56$application_octet_stream, zookeeper.$kw57$SOAP_ACTION_URI, zookeeper.NIL }));
                                if (in_stream.isStream()) {
                                    thread.resetMultipleValues();
                                    final SubLObject status = zk_analyze_delete_response(xml_parsing_utilities.xml_tokenize(in_stream, (SubLObject)zookeeper.UNPROVIDED, (SubLObject)zookeeper.UNPROVIDED, (SubLObject)zookeeper.UNPROVIDED));
                                    final SubLObject message = thread.secondMultipleValue();
                                    thread.resetMultipleValues();
                                    return Values.values(status, message);
                                }
                                problems = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(server, (SubLObject)zookeeper.$str59$n_a, (SubLObject)zookeeper.$str60$no_connection), problems);
                            }
                        }
                        finally {
                            final SubLObject _prev_bind_0_$2 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)zookeeper.T, thread);
                                final SubLObject _values = Values.getValuesAsVector();
                                if (zookeeper.NIL != in_stream) {
                                    streams_high.close(in_stream, (SubLObject)zookeeper.UNPROVIDED);
                                }
                                Values.restoreValuesFromVector(_values);
                            }
                            finally {
                                Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$2, thread);
                            }
                        }
                    }
                    catch (Throwable catch_var) {
                        Errors.handleThrowable(catch_var, (SubLObject)zookeeper.NIL);
                    }
                }
                finally {
                    Errors.$error_handler$.rebind(_prev_bind_0, thread);
                }
            }
            catch (Throwable ccatch_env_var) {
                connection_error = Errors.handleThrowable(ccatch_env_var, subl_macro_promotions.$catch_error_message_target$.getGlobalValue());
            }
            finally {
                thread.throwStack.pop();
            }
            problems = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(server, (SubLObject)zookeeper.$str59$n_a, connection_error), problems);
            cdolist_list_var = cdolist_list_var.rest();
            server = cdolist_list_var.first();
        }
        return Errors.error((SubLObject)zookeeper.$str61$Could_not_create_node_on_any_serv, problems);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/zookeeper.lisp", position = 7982L)
    public static SubLObject zk_analyze_delete_response(final SubLObject tokens) {
        final SubLObject header = tokens.first();
        if (zookeeper.NIL != string_utilities.starts_with(header, (SubLObject)zookeeper.$str70$HTTP_1_1_204_No_Content)) {
            return Values.values((SubLObject)zookeeper.T, (SubLObject)zookeeper.NIL);
        }
        if (zookeeper.NIL != string_utilities.starts_with(header, (SubLObject)zookeeper.$str63$HTTP_1_1_404_Not_Found)) {
            return Values.values((SubLObject)zookeeper.NIL, (SubLObject)zookeeper.$str64$No_such_node_);
        }
        return Values.values((SubLObject)zookeeper.NIL, Sequences.cconcatenate((SubLObject)zookeeper.$str65$Unexpected_HTTP_header_, new SubLObject[] { format_nil.format_nil_a_no_copy(header), zookeeper.$str66$_, format_nil.$format_nil_percent$.getGlobalValue() }));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/zookeeper.lisp", position = 8343L)
    public static SubLObject zk_get_node_state(final SubLObject node_path) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject port = zookeeper.$zookeeper_rest_port$.getDynamicValue(thread);
        final SubLObject timeout = zookeeper.$zookeeper_rest_timeout$.getDynamicValue(thread);
        SubLObject problems = (SubLObject)zookeeper.NIL;
        SubLObject cdolist_list_var = zookeeper.$zookeeper_rest_servers$.getDynamicValue(thread);
        SubLObject server = (SubLObject)zookeeper.NIL;
        server = cdolist_list_var.first();
        while (zookeeper.NIL != cdolist_list_var) {
            thread.resetMultipleValues();
            final SubLObject xml_tokens = xml_parsing_utilities.xml_tokenized_http_request(server, node_path, (SubLObject)zookeeper.$str72$dataformat_utf8, (SubLObject)zookeeper.$kw5$GET, port, (SubLObject)zookeeper.NIL, (SubLObject)zookeeper.NIL, timeout, timeout, (SubLObject)zookeeper.NIL, (SubLObject)zookeeper.$list6);
            final SubLObject status = thread.secondMultipleValue();
            final SubLObject status_msg = thread.thirdMultipleValue();
            thread.resetMultipleValues();
            if (zookeeper.NIL == status) {
                return Values.values(parse_zk_state(xml_tokens), (SubLObject)zookeeper.NIL);
            }
            problems = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(server, status, status_msg), problems);
            cdolist_list_var = cdolist_list_var.rest();
            server = cdolist_list_var.first();
        }
        return Values.values((SubLObject)zookeeper.NIL, problems);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/zookeeper.lisp", position = 9388L)
    public static SubLObject zk_node_state_print_function_trampoline(final SubLObject v_object, final SubLObject stream) {
        compatibility.default_struct_print_function(v_object, stream, (SubLObject)zookeeper.ZERO_INTEGER);
        return (SubLObject)zookeeper.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/zookeeper.lisp", position = 9388L)
    public static SubLObject zk_node_state_p(final SubLObject v_object) {
        return (SubLObject)((v_object.getClass() == $zk_node_state_native.class) ? zookeeper.T : zookeeper.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/zookeeper.lisp", position = 9388L)
    public static SubLObject zkstat_path(final SubLObject v_object) {
        assert zookeeper.NIL != zk_node_state_p(v_object) : v_object;
        return v_object.getField2();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/zookeeper.lisp", position = 9388L)
    public static SubLObject zkstat_uri(final SubLObject v_object) {
        assert zookeeper.NIL != zk_node_state_p(v_object) : v_object;
        return v_object.getField3();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/zookeeper.lisp", position = 9388L)
    public static SubLObject zkstat_data(final SubLObject v_object) {
        assert zookeeper.NIL != zk_node_state_p(v_object) : v_object;
        return v_object.getField4();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/zookeeper.lisp", position = 9388L)
    public static SubLObject zkstat_czxid(final SubLObject v_object) {
        assert zookeeper.NIL != zk_node_state_p(v_object) : v_object;
        return v_object.getField5();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/zookeeper.lisp", position = 9388L)
    public static SubLObject zkstat_mzxid(final SubLObject v_object) {
        assert zookeeper.NIL != zk_node_state_p(v_object) : v_object;
        return v_object.getField6();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/zookeeper.lisp", position = 9388L)
    public static SubLObject zkstat_ctime(final SubLObject v_object) {
        assert zookeeper.NIL != zk_node_state_p(v_object) : v_object;
        return v_object.getField7();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/zookeeper.lisp", position = 9388L)
    public static SubLObject zkstat_mtime(final SubLObject v_object) {
        assert zookeeper.NIL != zk_node_state_p(v_object) : v_object;
        return v_object.getField8();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/zookeeper.lisp", position = 9388L)
    public static SubLObject zkstat_version(final SubLObject v_object) {
        assert zookeeper.NIL != zk_node_state_p(v_object) : v_object;
        return v_object.getField9();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/zookeeper.lisp", position = 9388L)
    public static SubLObject zkstat_cversion(final SubLObject v_object) {
        assert zookeeper.NIL != zk_node_state_p(v_object) : v_object;
        return v_object.getField10();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/zookeeper.lisp", position = 9388L)
    public static SubLObject zkstat_aversion(final SubLObject v_object) {
        assert zookeeper.NIL != zk_node_state_p(v_object) : v_object;
        return v_object.getField11();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/zookeeper.lisp", position = 9388L)
    public static SubLObject zkstat_ephemeral_owner(final SubLObject v_object) {
        assert zookeeper.NIL != zk_node_state_p(v_object) : v_object;
        return v_object.getField12();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/zookeeper.lisp", position = 9388L)
    public static SubLObject zkstat_data_len(final SubLObject v_object) {
        assert zookeeper.NIL != zk_node_state_p(v_object) : v_object;
        return v_object.getField13();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/zookeeper.lisp", position = 9388L)
    public static SubLObject zkstat_num_children(final SubLObject v_object) {
        assert zookeeper.NIL != zk_node_state_p(v_object) : v_object;
        return v_object.getField14();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/zookeeper.lisp", position = 9388L)
    public static SubLObject zkstat_pzxid(final SubLObject v_object) {
        assert zookeeper.NIL != zk_node_state_p(v_object) : v_object;
        return v_object.getField15();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/zookeeper.lisp", position = 9388L)
    public static SubLObject _csetf_zkstat_path(final SubLObject v_object, final SubLObject value) {
        assert zookeeper.NIL != zk_node_state_p(v_object) : v_object;
        return v_object.setField2(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/zookeeper.lisp", position = 9388L)
    public static SubLObject _csetf_zkstat_uri(final SubLObject v_object, final SubLObject value) {
        assert zookeeper.NIL != zk_node_state_p(v_object) : v_object;
        return v_object.setField3(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/zookeeper.lisp", position = 9388L)
    public static SubLObject _csetf_zkstat_data(final SubLObject v_object, final SubLObject value) {
        assert zookeeper.NIL != zk_node_state_p(v_object) : v_object;
        return v_object.setField4(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/zookeeper.lisp", position = 9388L)
    public static SubLObject _csetf_zkstat_czxid(final SubLObject v_object, final SubLObject value) {
        assert zookeeper.NIL != zk_node_state_p(v_object) : v_object;
        return v_object.setField5(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/zookeeper.lisp", position = 9388L)
    public static SubLObject _csetf_zkstat_mzxid(final SubLObject v_object, final SubLObject value) {
        assert zookeeper.NIL != zk_node_state_p(v_object) : v_object;
        return v_object.setField6(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/zookeeper.lisp", position = 9388L)
    public static SubLObject _csetf_zkstat_ctime(final SubLObject v_object, final SubLObject value) {
        assert zookeeper.NIL != zk_node_state_p(v_object) : v_object;
        return v_object.setField7(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/zookeeper.lisp", position = 9388L)
    public static SubLObject _csetf_zkstat_mtime(final SubLObject v_object, final SubLObject value) {
        assert zookeeper.NIL != zk_node_state_p(v_object) : v_object;
        return v_object.setField8(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/zookeeper.lisp", position = 9388L)
    public static SubLObject _csetf_zkstat_version(final SubLObject v_object, final SubLObject value) {
        assert zookeeper.NIL != zk_node_state_p(v_object) : v_object;
        return v_object.setField9(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/zookeeper.lisp", position = 9388L)
    public static SubLObject _csetf_zkstat_cversion(final SubLObject v_object, final SubLObject value) {
        assert zookeeper.NIL != zk_node_state_p(v_object) : v_object;
        return v_object.setField10(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/zookeeper.lisp", position = 9388L)
    public static SubLObject _csetf_zkstat_aversion(final SubLObject v_object, final SubLObject value) {
        assert zookeeper.NIL != zk_node_state_p(v_object) : v_object;
        return v_object.setField11(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/zookeeper.lisp", position = 9388L)
    public static SubLObject _csetf_zkstat_ephemeral_owner(final SubLObject v_object, final SubLObject value) {
        assert zookeeper.NIL != zk_node_state_p(v_object) : v_object;
        return v_object.setField12(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/zookeeper.lisp", position = 9388L)
    public static SubLObject _csetf_zkstat_data_len(final SubLObject v_object, final SubLObject value) {
        assert zookeeper.NIL != zk_node_state_p(v_object) : v_object;
        return v_object.setField13(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/zookeeper.lisp", position = 9388L)
    public static SubLObject _csetf_zkstat_num_children(final SubLObject v_object, final SubLObject value) {
        assert zookeeper.NIL != zk_node_state_p(v_object) : v_object;
        return v_object.setField14(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/zookeeper.lisp", position = 9388L)
    public static SubLObject _csetf_zkstat_pzxid(final SubLObject v_object, final SubLObject value) {
        assert zookeeper.NIL != zk_node_state_p(v_object) : v_object;
        return v_object.setField15(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/zookeeper.lisp", position = 9388L)
    public static SubLObject make_zk_node_state(SubLObject arglist) {
        if (arglist == zookeeper.UNPROVIDED) {
            arglist = (SubLObject)zookeeper.NIL;
        }
        final SubLObject v_new = (SubLObject)new $zk_node_state_native();
        SubLObject next;
        SubLObject current_arg;
        SubLObject current_value;
        SubLObject pcase_var;
        for (next = (SubLObject)zookeeper.NIL, next = arglist; zookeeper.NIL != next; next = conses_high.cddr(next)) {
            current_arg = next.first();
            current_value = conses_high.cadr(next);
            pcase_var = current_arg;
            if (pcase_var.eql((SubLObject)zookeeper.$kw24$PATH)) {
                _csetf_zkstat_path(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)zookeeper.$kw25$URI)) {
                _csetf_zkstat_uri(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)zookeeper.$kw109$DATA)) {
                _csetf_zkstat_data(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)zookeeper.$kw110$CZXID)) {
                _csetf_zkstat_czxid(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)zookeeper.$kw111$MZXID)) {
                _csetf_zkstat_mzxid(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)zookeeper.$kw112$CTIME)) {
                _csetf_zkstat_ctime(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)zookeeper.$kw113$MTIME)) {
                _csetf_zkstat_mtime(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)zookeeper.$kw114$VERSION)) {
                _csetf_zkstat_version(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)zookeeper.$kw115$CVERSION)) {
                _csetf_zkstat_cversion(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)zookeeper.$kw116$AVERSION)) {
                _csetf_zkstat_aversion(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)zookeeper.$kw117$EPHEMERAL_OWNER)) {
                _csetf_zkstat_ephemeral_owner(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)zookeeper.$kw118$DATA_LEN)) {
                _csetf_zkstat_data_len(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)zookeeper.$kw119$NUM_CHILDREN)) {
                _csetf_zkstat_num_children(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)zookeeper.$kw120$PZXID)) {
                _csetf_zkstat_pzxid(v_new, current_value);
            }
            else {
                Errors.error((SubLObject)zookeeper.$str28$Invalid_slot__S_for_construction_, current_arg);
            }
        }
        return v_new;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/zookeeper.lisp", position = 9388L)
    public static SubLObject visit_defstruct_zk_node_state(final SubLObject obj, final SubLObject visitor_fn) {
        Functions.funcall(visitor_fn, obj, (SubLObject)zookeeper.$kw29$BEGIN, (SubLObject)zookeeper.$sym121$MAKE_ZK_NODE_STATE, (SubLObject)zookeeper.FOURTEEN_INTEGER);
        Functions.funcall(visitor_fn, obj, (SubLObject)zookeeper.$kw31$SLOT, (SubLObject)zookeeper.$kw24$PATH, zkstat_path(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)zookeeper.$kw31$SLOT, (SubLObject)zookeeper.$kw25$URI, zkstat_uri(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)zookeeper.$kw31$SLOT, (SubLObject)zookeeper.$kw109$DATA, zkstat_data(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)zookeeper.$kw31$SLOT, (SubLObject)zookeeper.$kw110$CZXID, zkstat_czxid(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)zookeeper.$kw31$SLOT, (SubLObject)zookeeper.$kw111$MZXID, zkstat_mzxid(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)zookeeper.$kw31$SLOT, (SubLObject)zookeeper.$kw112$CTIME, zkstat_ctime(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)zookeeper.$kw31$SLOT, (SubLObject)zookeeper.$kw113$MTIME, zkstat_mtime(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)zookeeper.$kw31$SLOT, (SubLObject)zookeeper.$kw114$VERSION, zkstat_version(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)zookeeper.$kw31$SLOT, (SubLObject)zookeeper.$kw115$CVERSION, zkstat_cversion(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)zookeeper.$kw31$SLOT, (SubLObject)zookeeper.$kw116$AVERSION, zkstat_aversion(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)zookeeper.$kw31$SLOT, (SubLObject)zookeeper.$kw117$EPHEMERAL_OWNER, zkstat_ephemeral_owner(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)zookeeper.$kw31$SLOT, (SubLObject)zookeeper.$kw118$DATA_LEN, zkstat_data_len(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)zookeeper.$kw31$SLOT, (SubLObject)zookeeper.$kw119$NUM_CHILDREN, zkstat_num_children(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)zookeeper.$kw31$SLOT, (SubLObject)zookeeper.$kw120$PZXID, zkstat_pzxid(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)zookeeper.$kw32$END, (SubLObject)zookeeper.$sym121$MAKE_ZK_NODE_STATE, (SubLObject)zookeeper.FOURTEEN_INTEGER);
        return obj;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/zookeeper.lisp", position = 9388L)
    public static SubLObject visit_defstruct_object_zk_node_state_method(final SubLObject obj, final SubLObject visitor_fn) {
        return visit_defstruct_zk_node_state(obj, visitor_fn);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/zookeeper.lisp", position = 9996L)
    public static SubLObject parse_zk_state(final SubLObject xml_tokens) {
        final SubLObject node = make_zk_node_state((SubLObject)zookeeper.UNPROVIDED);
        final SubLObject tokens = iteration.new_list_iterator(xml_tokens);
        iteration.iteration_next(tokens);
        iteration.iteration_next(tokens);
        if (zookeeper.NIL != web_utilities.matching_open_tagP((SubLObject)zookeeper.$str123$stat, iteration.iteration_next(tokens), (SubLObject)zookeeper.UNPROVIDED)) {
            while (zookeeper.NIL == iteration.iteration_done(tokens)) {
                final SubLObject tag = iteration.iteration_next(tokens);
                if (zookeeper.NIL != web_utilities.matching_close_tagP((SubLObject)zookeeper.$str123$stat, tag, (SubLObject)zookeeper.UNPROVIDED)) {
                    return node;
                }
                if (zookeeper.NIL != web_utilities.matching_open_tagP((SubLObject)zookeeper.$str35$path, tag, (SubLObject)zookeeper.UNPROVIDED)) {
                    _csetf_zkstat_path(node, iteration.iteration_next(tokens));
                    zk_must_match_closing_tag(tokens, (SubLObject)zookeeper.$str35$path);
                }
                else if (zookeeper.NIL != web_utilities.matching_open_tagP((SubLObject)zookeeper.$str36$uri, tag, (SubLObject)zookeeper.UNPROVIDED)) {
                    _csetf_zkstat_uri(node, iteration.iteration_next(tokens));
                    zk_must_match_closing_tag(tokens, (SubLObject)zookeeper.$str36$uri);
                }
                else if (zookeeper.NIL != web_utilities.matching_open_tagP((SubLObject)zookeeper.$str124$dataUtf8, tag, (SubLObject)zookeeper.UNPROVIDED)) {
                    _csetf_zkstat_data(node, iteration.iteration_next(tokens));
                    zk_must_match_closing_tag(tokens, (SubLObject)zookeeper.$str124$dataUtf8);
                }
                else if (zookeeper.NIL != web_utilities.matching_open_tagP((SubLObject)zookeeper.$str125$czxid, tag, (SubLObject)zookeeper.UNPROVIDED)) {
                    _csetf_zkstat_czxid(node, reader.parse_integer(iteration.iteration_next(tokens), (SubLObject)zookeeper.UNPROVIDED, (SubLObject)zookeeper.UNPROVIDED, (SubLObject)zookeeper.UNPROVIDED, (SubLObject)zookeeper.UNPROVIDED));
                    zk_must_match_closing_tag(tokens, (SubLObject)zookeeper.$str125$czxid);
                }
                else if (zookeeper.NIL != web_utilities.matching_open_tagP((SubLObject)zookeeper.$str126$mzxid, tag, (SubLObject)zookeeper.UNPROVIDED)) {
                    _csetf_zkstat_mzxid(node, reader.parse_integer(iteration.iteration_next(tokens), (SubLObject)zookeeper.UNPROVIDED, (SubLObject)zookeeper.UNPROVIDED, (SubLObject)zookeeper.UNPROVIDED, (SubLObject)zookeeper.UNPROVIDED));
                    zk_must_match_closing_tag(tokens, (SubLObject)zookeeper.$str126$mzxid);
                }
                else if (zookeeper.NIL != web_utilities.matching_open_tagP((SubLObject)zookeeper.$str127$pzxid, tag, (SubLObject)zookeeper.UNPROVIDED)) {
                    _csetf_zkstat_pzxid(node, reader.parse_integer(iteration.iteration_next(tokens), (SubLObject)zookeeper.UNPROVIDED, (SubLObject)zookeeper.UNPROVIDED, (SubLObject)zookeeper.UNPROVIDED, (SubLObject)zookeeper.UNPROVIDED));
                    zk_must_match_closing_tag(tokens, (SubLObject)zookeeper.$str127$pzxid);
                }
                else if (zookeeper.NIL != web_utilities.matching_open_tagP((SubLObject)zookeeper.$str128$ctime, tag, (SubLObject)zookeeper.UNPROVIDED)) {
                    _csetf_zkstat_ctime(node, reader.parse_integer(iteration.iteration_next(tokens), (SubLObject)zookeeper.UNPROVIDED, (SubLObject)zookeeper.UNPROVIDED, (SubLObject)zookeeper.UNPROVIDED, (SubLObject)zookeeper.UNPROVIDED));
                    zk_must_match_closing_tag(tokens, (SubLObject)zookeeper.$str128$ctime);
                }
                else if (zookeeper.NIL != web_utilities.matching_open_tagP((SubLObject)zookeeper.$str129$mtime, tag, (SubLObject)zookeeper.UNPROVIDED)) {
                    _csetf_zkstat_mtime(node, reader.parse_integer(iteration.iteration_next(tokens), (SubLObject)zookeeper.UNPROVIDED, (SubLObject)zookeeper.UNPROVIDED, (SubLObject)zookeeper.UNPROVIDED, (SubLObject)zookeeper.UNPROVIDED));
                    zk_must_match_closing_tag(tokens, (SubLObject)zookeeper.$str129$mtime);
                }
                else if (zookeeper.NIL != web_utilities.matching_open_tagP((SubLObject)zookeeper.$str130$version, tag, (SubLObject)zookeeper.UNPROVIDED)) {
                    _csetf_zkstat_version(node, reader.parse_integer(iteration.iteration_next(tokens), (SubLObject)zookeeper.UNPROVIDED, (SubLObject)zookeeper.UNPROVIDED, (SubLObject)zookeeper.UNPROVIDED, (SubLObject)zookeeper.UNPROVIDED));
                    zk_must_match_closing_tag(tokens, (SubLObject)zookeeper.$str130$version);
                }
                else if (zookeeper.NIL != web_utilities.matching_open_tagP((SubLObject)zookeeper.$str131$aversion, tag, (SubLObject)zookeeper.UNPROVIDED)) {
                    _csetf_zkstat_aversion(node, reader.parse_integer(iteration.iteration_next(tokens), (SubLObject)zookeeper.UNPROVIDED, (SubLObject)zookeeper.UNPROVIDED, (SubLObject)zookeeper.UNPROVIDED, (SubLObject)zookeeper.UNPROVIDED));
                    zk_must_match_closing_tag(tokens, (SubLObject)zookeeper.$str131$aversion);
                }
                else if (zookeeper.NIL != web_utilities.matching_open_tagP((SubLObject)zookeeper.$str132$cversion, tag, (SubLObject)zookeeper.UNPROVIDED)) {
                    _csetf_zkstat_cversion(node, reader.parse_integer(iteration.iteration_next(tokens), (SubLObject)zookeeper.UNPROVIDED, (SubLObject)zookeeper.UNPROVIDED, (SubLObject)zookeeper.UNPROVIDED, (SubLObject)zookeeper.UNPROVIDED));
                    zk_must_match_closing_tag(tokens, (SubLObject)zookeeper.$str132$cversion);
                }
                else if (zookeeper.NIL != web_utilities.matching_open_tagP((SubLObject)zookeeper.$str133$ephemeralOwner, tag, (SubLObject)zookeeper.UNPROVIDED)) {
                    _csetf_zkstat_ephemeral_owner(node, reader.parse_integer(iteration.iteration_next(tokens), (SubLObject)zookeeper.UNPROVIDED, (SubLObject)zookeeper.UNPROVIDED, (SubLObject)zookeeper.UNPROVIDED, (SubLObject)zookeeper.UNPROVIDED));
                    zk_must_match_closing_tag(tokens, (SubLObject)zookeeper.$str133$ephemeralOwner);
                }
                else if (zookeeper.NIL != web_utilities.matching_open_tagP((SubLObject)zookeeper.$str134$dataLength, tag, (SubLObject)zookeeper.UNPROVIDED)) {
                    _csetf_zkstat_data_len(node, reader.parse_integer(iteration.iteration_next(tokens), (SubLObject)zookeeper.UNPROVIDED, (SubLObject)zookeeper.UNPROVIDED, (SubLObject)zookeeper.UNPROVIDED, (SubLObject)zookeeper.UNPROVIDED));
                    zk_must_match_closing_tag(tokens, (SubLObject)zookeeper.$str134$dataLength);
                }
                else if (zookeeper.NIL != web_utilities.matching_open_tagP((SubLObject)zookeeper.$str135$numChildren, tag, (SubLObject)zookeeper.UNPROVIDED)) {
                    _csetf_zkstat_num_children(node, reader.parse_integer(iteration.iteration_next(tokens), (SubLObject)zookeeper.UNPROVIDED, (SubLObject)zookeeper.UNPROVIDED, (SubLObject)zookeeper.UNPROVIDED, (SubLObject)zookeeper.UNPROVIDED));
                    zk_must_match_closing_tag(tokens, (SubLObject)zookeeper.$str135$numChildren);
                }
                else {
                    Errors.error((SubLObject)zookeeper.$str39$Unexpected_XML_tag__A___, tag);
                }
            }
        }
        return Errors.error((SubLObject)zookeeper.$str40$Unexpected_token_stream__A_, tokens);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/zookeeper.lisp", position = 13259L)
    public static SubLObject zk_must_match_closing_tag(final SubLObject tokens, final SubLObject close_tag) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject ctag = iteration.iteration_next(tokens);
        if (zookeeper.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && zookeeper.NIL == web_utilities.matching_close_tagP(close_tag, ctag, (SubLObject)zookeeper.UNPROVIDED)) {
            Errors.error((SubLObject)zookeeper.$str136$Expected_closing_tag__A_but_got__, close_tag, ctag);
        }
        return tokens;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/zookeeper.lisp", position = 13497L)
    public static SubLObject zk_create_permanent_node(final SubLObject parent_node_path, final SubLObject name, SubLObject initial_data) {
        if (initial_data == zookeeper.UNPROVIDED) {
            initial_data = (SubLObject)zookeeper.$str69$;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject full_path = Sequences.cconcatenate(parent_node_path, new SubLObject[] { zookeeper.$str138$_op_create_name_, name });
        SubLObject problems = (SubLObject)zookeeper.NIL;
        SubLObject cdolist_list_var = zookeeper.$zookeeper_rest_servers$.getDynamicValue(thread);
        SubLObject server = (SubLObject)zookeeper.NIL;
        server = cdolist_list_var.first();
        while (zookeeper.NIL != cdolist_list_var) {
            SubLObject connection_error = (SubLObject)zookeeper.NIL;
            try {
                thread.throwStack.push(subl_macro_promotions.$catch_error_message_target$.getGlobalValue());
                final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
                try {
                    Errors.$error_handler$.bind((SubLObject)zookeeper.$sym42$CATCH_ERROR_MESSAGE_HANDLER, thread);
                    try {
                        final SubLObject real_port = (SubLObject)(zookeeper.$zookeeper_rest_port$.getDynamicValue(thread).eql((SubLObject)zookeeper.$kw43$DEFAULT) ? zookeeper.$int44$80 : zookeeper.$zookeeper_rest_port$.getDynamicValue(thread));
                        SubLObject in_stream = (SubLObject)zookeeper.NIL;
                        try {
                            in_stream = subl_promotions.open_tcp_stream_with_timeout(server, real_port, zookeeper.$zookeeper_rest_timeout$.getDynamicValue(thread), (SubLObject)zookeeper.$kw45$PRIVATE);
                            if (zookeeper.NIL != subl_macro_promotions.validate_tcp_connection(in_stream, server, real_port)) {
                                web_utilities.send_http_request(in_stream, (SubLObject)ConsesLow.list(new SubLObject[] { zookeeper.$kw46$MACHINE, server, zookeeper.$kw47$PORT, zookeeper.$zookeeper_rest_port$.getDynamicValue(thread), zookeeper.$kw48$METHOD, zookeeper.$kw139$POST, zookeeper.$kw50$URL, full_path, zookeeper.$kw51$QUERY, initial_data, zookeeper.$kw52$KEEP_ALIVE_, zookeeper.NIL, zookeeper.$kw53$WIDE_NEWLINES_, zookeeper.NIL, zookeeper.$kw54$ACCEPT_TYPES, zookeeper.$list6, zookeeper.$kw55$CONTENT_TYPE, zookeeper.$str56$application_octet_stream, zookeeper.$kw57$SOAP_ACTION_URI, zookeeper.NIL }));
                                if (in_stream.isStream()) {
                                    thread.resetMultipleValues();
                                    final SubLObject status = zk_analyze_create_response(xml_parsing_utilities.xml_tokenize(in_stream, (SubLObject)zookeeper.UNPROVIDED, (SubLObject)zookeeper.UNPROVIDED, (SubLObject)zookeeper.UNPROVIDED));
                                    final SubLObject message = thread.secondMultipleValue();
                                    thread.resetMultipleValues();
                                    return Values.values(status, message);
                                }
                                problems = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(server, (SubLObject)zookeeper.$str59$n_a, (SubLObject)zookeeper.$str60$no_connection), problems);
                            }
                        }
                        finally {
                            final SubLObject _prev_bind_0_$3 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)zookeeper.T, thread);
                                final SubLObject _values = Values.getValuesAsVector();
                                if (zookeeper.NIL != in_stream) {
                                    streams_high.close(in_stream, (SubLObject)zookeeper.UNPROVIDED);
                                }
                                Values.restoreValuesFromVector(_values);
                            }
                            finally {
                                Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$3, thread);
                            }
                        }
                    }
                    catch (Throwable catch_var) {
                        Errors.handleThrowable(catch_var, (SubLObject)zookeeper.NIL);
                    }
                }
                finally {
                    Errors.$error_handler$.rebind(_prev_bind_0, thread);
                }
            }
            catch (Throwable ccatch_env_var) {
                connection_error = Errors.handleThrowable(ccatch_env_var, subl_macro_promotions.$catch_error_message_target$.getGlobalValue());
            }
            finally {
                thread.throwStack.pop();
            }
            problems = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(server, (SubLObject)zookeeper.$str59$n_a, connection_error), problems);
            cdolist_list_var = cdolist_list_var.rest();
            server = cdolist_list_var.first();
        }
        return Values.values((SubLObject)zookeeper.NIL, problems);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/zookeeper.lisp", position = 14828L)
    public static SubLObject zk_analyze_create_response(final SubLObject tokens) {
        final SubLObject header = tokens.first();
        if (zookeeper.NIL != string_utilities.starts_with(header, (SubLObject)zookeeper.$str140$HTTP_1_1_201_Created)) {
            return Values.values((SubLObject)zookeeper.T, (SubLObject)zookeeper.NIL);
        }
        if (zookeeper.NIL != string_utilities.starts_with(header, (SubLObject)zookeeper.$str141$HTTP_1_1_409_Conflict)) {
            return Values.values((SubLObject)zookeeper.NIL, (SubLObject)zookeeper.$str142$Node_already_exits_);
        }
        if (zookeeper.NIL != string_utilities.starts_with(header, (SubLObject)zookeeper.$str63$HTTP_1_1_404_Not_Found)) {
            return Values.values((SubLObject)zookeeper.NIL, (SubLObject)zookeeper.$str143$No_such_parent_node_);
        }
        return Values.values((SubLObject)zookeeper.NIL, Sequences.cconcatenate((SubLObject)zookeeper.$str65$Unexpected_HTTP_header_, new SubLObject[] { format_nil.format_nil_a_no_copy(header), zookeeper.$str66$_, format_nil.$format_nil_percent$.getGlobalValue() }));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/zookeeper.lisp", position = 15293L)
    public static SubLObject zk_create_session(SubLObject timeout_secs) {
        if (timeout_secs == zookeeper.UNPROVIDED) {
            timeout_secs = (SubLObject)zookeeper.FIVE_INTEGER;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject session_uri = Sequences.cconcatenate((SubLObject)zookeeper.$str145$_sessions_v1__op_create_expire_, format_nil.format_nil_a_no_copy(timeout_secs));
        SubLObject problems = (SubLObject)zookeeper.NIL;
        SubLObject cdolist_list_var = zookeeper.$zookeeper_rest_servers$.getDynamicValue(thread);
        SubLObject server = (SubLObject)zookeeper.NIL;
        server = cdolist_list_var.first();
        while (zookeeper.NIL != cdolist_list_var) {
            SubLObject connection_error = (SubLObject)zookeeper.NIL;
            try {
                thread.throwStack.push(subl_macro_promotions.$catch_error_message_target$.getGlobalValue());
                final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
                try {
                    Errors.$error_handler$.bind((SubLObject)zookeeper.$sym42$CATCH_ERROR_MESSAGE_HANDLER, thread);
                    try {
                        final SubLObject real_port = (SubLObject)(zookeeper.$zookeeper_rest_port$.getDynamicValue(thread).eql((SubLObject)zookeeper.$kw43$DEFAULT) ? zookeeper.$int44$80 : zookeeper.$zookeeper_rest_port$.getDynamicValue(thread));
                        SubLObject in_stream = (SubLObject)zookeeper.NIL;
                        try {
                            in_stream = subl_promotions.open_tcp_stream_with_timeout(server, real_port, zookeeper.$zookeeper_rest_timeout$.getDynamicValue(thread), (SubLObject)zookeeper.$kw45$PRIVATE);
                            if (zookeeper.NIL != subl_macro_promotions.validate_tcp_connection(in_stream, server, real_port)) {
                                web_utilities.send_http_request(in_stream, (SubLObject)ConsesLow.list(new SubLObject[] { zookeeper.$kw46$MACHINE, server, zookeeper.$kw47$PORT, zookeeper.$zookeeper_rest_port$.getDynamicValue(thread), zookeeper.$kw48$METHOD, zookeeper.$kw139$POST, zookeeper.$kw50$URL, session_uri, zookeeper.$kw51$QUERY, zookeeper.$str69$, zookeeper.$kw52$KEEP_ALIVE_, zookeeper.NIL, zookeeper.$kw53$WIDE_NEWLINES_, zookeeper.NIL, zookeeper.$kw54$ACCEPT_TYPES, zookeeper.$list6, zookeeper.$kw55$CONTENT_TYPE, zookeeper.$str56$application_octet_stream, zookeeper.$kw57$SOAP_ACTION_URI, zookeeper.NIL }));
                                if (in_stream.isStream()) {
                                    thread.resetMultipleValues();
                                    final SubLObject session_id = zk_analyze_create_session_response(xml_parsing_utilities.xml_tokenize(in_stream, (SubLObject)zookeeper.UNPROVIDED, (SubLObject)zookeeper.UNPROVIDED, (SubLObject)zookeeper.UNPROVIDED));
                                    final SubLObject message = thread.secondMultipleValue();
                                    thread.resetMultipleValues();
                                    return Values.values(session_id, message);
                                }
                                problems = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(server, (SubLObject)zookeeper.$str59$n_a, (SubLObject)zookeeper.$str60$no_connection), problems);
                            }
                        }
                        finally {
                            final SubLObject _prev_bind_0_$4 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)zookeeper.T, thread);
                                final SubLObject _values = Values.getValuesAsVector();
                                if (zookeeper.NIL != in_stream) {
                                    streams_high.close(in_stream, (SubLObject)zookeeper.UNPROVIDED);
                                }
                                Values.restoreValuesFromVector(_values);
                            }
                            finally {
                                Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$4, thread);
                            }
                        }
                    }
                    catch (Throwable catch_var) {
                        Errors.handleThrowable(catch_var, (SubLObject)zookeeper.NIL);
                    }
                }
                finally {
                    Errors.$error_handler$.rebind(_prev_bind_0, thread);
                }
            }
            catch (Throwable ccatch_env_var) {
                connection_error = Errors.handleThrowable(ccatch_env_var, subl_macro_promotions.$catch_error_message_target$.getGlobalValue());
            }
            finally {
                thread.throwStack.pop();
            }
            problems = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(server, (SubLObject)zookeeper.$str59$n_a, connection_error), problems);
            cdolist_list_var = cdolist_list_var.rest();
            server = cdolist_list_var.first();
        }
        return Values.values((SubLObject)zookeeper.NIL, problems);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/zookeeper.lisp", position = 17023L)
    public static SubLObject zk_analyze_create_session_response(final SubLObject tokens) {
        final SubLObject header = tokens.first();
        if (zookeeper.NIL != string_utilities.starts_with(header, (SubLObject)zookeeper.$str140$HTTP_1_1_201_Created)) {
            final SubLObject id_string = ConsesLow.nth((SubLObject)zookeeper.FOUR_INTEGER, tokens);
            return Values.values(id_string, (SubLObject)zookeeper.NIL);
        }
        return Values.values((SubLObject)zookeeper.NIL, Sequences.cconcatenate((SubLObject)zookeeper.$str65$Unexpected_HTTP_header_, new SubLObject[] { format_nil.format_nil_a_no_copy(header), zookeeper.$str66$_, format_nil.$format_nil_percent$.getGlobalValue() }));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/zookeeper.lisp", position = 17347L)
    public static SubLObject zk_send_session_heartbeat(final SubLObject session_id) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject session_uri = Sequences.cconcatenate((SubLObject)zookeeper.$str147$_sessions_v1_, format_nil.format_nil_a_no_copy(session_id));
        SubLObject problems = (SubLObject)zookeeper.NIL;
        SubLObject cdolist_list_var = zookeeper.$zookeeper_rest_servers$.getDynamicValue(thread);
        SubLObject server = (SubLObject)zookeeper.NIL;
        server = cdolist_list_var.first();
        while (zookeeper.NIL != cdolist_list_var) {
            SubLObject connection_error = (SubLObject)zookeeper.NIL;
            try {
                thread.throwStack.push(subl_macro_promotions.$catch_error_message_target$.getGlobalValue());
                final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
                try {
                    Errors.$error_handler$.bind((SubLObject)zookeeper.$sym42$CATCH_ERROR_MESSAGE_HANDLER, thread);
                    try {
                        final SubLObject real_port = (SubLObject)(zookeeper.$zookeeper_rest_port$.getDynamicValue(thread).eql((SubLObject)zookeeper.$kw43$DEFAULT) ? zookeeper.$int44$80 : zookeeper.$zookeeper_rest_port$.getDynamicValue(thread));
                        SubLObject in_stream = (SubLObject)zookeeper.NIL;
                        try {
                            in_stream = subl_promotions.open_tcp_stream_with_timeout(server, real_port, zookeeper.$zookeeper_rest_timeout$.getDynamicValue(thread), (SubLObject)zookeeper.$kw45$PRIVATE);
                            if (zookeeper.NIL != subl_macro_promotions.validate_tcp_connection(in_stream, server, real_port)) {
                                web_utilities.send_http_request(in_stream, (SubLObject)ConsesLow.list(new SubLObject[] { zookeeper.$kw46$MACHINE, server, zookeeper.$kw47$PORT, zookeeper.$zookeeper_rest_port$.getDynamicValue(thread), zookeeper.$kw48$METHOD, zookeeper.$kw139$POST, zookeeper.$kw50$URL, session_uri, zookeeper.$kw51$QUERY, zookeeper.$str69$, zookeeper.$kw52$KEEP_ALIVE_, zookeeper.NIL, zookeeper.$kw53$WIDE_NEWLINES_, zookeeper.NIL, zookeeper.$kw54$ACCEPT_TYPES, zookeeper.$list6, zookeeper.$kw55$CONTENT_TYPE, zookeeper.$str56$application_octet_stream, zookeeper.$kw57$SOAP_ACTION_URI, zookeeper.NIL }));
                                if (in_stream.isStream()) {
                                    thread.resetMultipleValues();
                                    final SubLObject status = zk_analyze_session_heartbeat_response(xml_parsing_utilities.xml_tokenize(in_stream, (SubLObject)zookeeper.UNPROVIDED, (SubLObject)zookeeper.UNPROVIDED, (SubLObject)zookeeper.UNPROVIDED));
                                    final SubLObject message = thread.secondMultipleValue();
                                    thread.resetMultipleValues();
                                    return Values.values(status, message);
                                }
                                problems = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(server, (SubLObject)zookeeper.$str59$n_a, (SubLObject)zookeeper.$str60$no_connection), problems);
                            }
                        }
                        finally {
                            final SubLObject _prev_bind_0_$5 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)zookeeper.T, thread);
                                final SubLObject _values = Values.getValuesAsVector();
                                if (zookeeper.NIL != in_stream) {
                                    streams_high.close(in_stream, (SubLObject)zookeeper.UNPROVIDED);
                                }
                                Values.restoreValuesFromVector(_values);
                            }
                            finally {
                                Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$5, thread);
                            }
                        }
                    }
                    catch (Throwable catch_var) {
                        Errors.handleThrowable(catch_var, (SubLObject)zookeeper.NIL);
                    }
                }
                finally {
                    Errors.$error_handler$.rebind(_prev_bind_0, thread);
                }
            }
            catch (Throwable ccatch_env_var) {
                connection_error = Errors.handleThrowable(ccatch_env_var, subl_macro_promotions.$catch_error_message_target$.getGlobalValue());
            }
            finally {
                thread.throwStack.pop();
            }
            problems = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(server, (SubLObject)zookeeper.$str59$n_a, connection_error), problems);
            cdolist_list_var = cdolist_list_var.rest();
            server = cdolist_list_var.first();
        }
        return Values.values((SubLObject)zookeeper.NIL, problems);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/zookeeper.lisp", position = 18933L)
    public static SubLObject zk_analyze_session_heartbeat_response(final SubLObject tokens) {
        final SubLObject header = tokens.first();
        if (zookeeper.NIL != string_utilities.starts_with(header, (SubLObject)zookeeper.$str140$HTTP_1_1_201_Created)) {
            final SubLObject id_string = ConsesLow.nth((SubLObject)zookeeper.FOUR_INTEGER, tokens);
            return Values.values(id_string, (SubLObject)zookeeper.NIL);
        }
        return Values.values((SubLObject)zookeeper.NIL, Sequences.cconcatenate((SubLObject)zookeeper.$str65$Unexpected_HTTP_header_, new SubLObject[] { format_nil.format_nil_a_no_copy(header), zookeeper.$str66$_, format_nil.$format_nil_percent$.getGlobalValue() }));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/zookeeper.lisp", position = 19260L)
    public static SubLObject zk_delete_session(final SubLObject session_id) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject session_uri = Sequences.cconcatenate((SubLObject)zookeeper.$str147$_sessions_v1_, format_nil.format_nil_a_no_copy(session_id));
        SubLObject problems = (SubLObject)zookeeper.NIL;
        SubLObject cdolist_list_var = zookeeper.$zookeeper_rest_servers$.getDynamicValue(thread);
        SubLObject server = (SubLObject)zookeeper.NIL;
        server = cdolist_list_var.first();
        while (zookeeper.NIL != cdolist_list_var) {
            SubLObject connection_error = (SubLObject)zookeeper.NIL;
            try {
                thread.throwStack.push(subl_macro_promotions.$catch_error_message_target$.getGlobalValue());
                final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
                try {
                    Errors.$error_handler$.bind((SubLObject)zookeeper.$sym42$CATCH_ERROR_MESSAGE_HANDLER, thread);
                    try {
                        final SubLObject real_port = (SubLObject)(zookeeper.$zookeeper_rest_port$.getDynamicValue(thread).eql((SubLObject)zookeeper.$kw43$DEFAULT) ? zookeeper.$int44$80 : zookeeper.$zookeeper_rest_port$.getDynamicValue(thread));
                        SubLObject in_stream = (SubLObject)zookeeper.NIL;
                        try {
                            in_stream = subl_promotions.open_tcp_stream_with_timeout(server, real_port, zookeeper.$zookeeper_rest_timeout$.getDynamicValue(thread), (SubLObject)zookeeper.$kw45$PRIVATE);
                            if (zookeeper.NIL != subl_macro_promotions.validate_tcp_connection(in_stream, server, real_port)) {
                                web_utilities.send_http_request(in_stream, (SubLObject)ConsesLow.list(new SubLObject[] { zookeeper.$kw46$MACHINE, server, zookeeper.$kw47$PORT, zookeeper.$zookeeper_rest_port$.getDynamicValue(thread), zookeeper.$kw48$METHOD, zookeeper.$kw68$DELETE, zookeeper.$kw50$URL, session_uri, zookeeper.$kw51$QUERY, zookeeper.$str69$, zookeeper.$kw52$KEEP_ALIVE_, zookeeper.NIL, zookeeper.$kw53$WIDE_NEWLINES_, zookeeper.NIL, zookeeper.$kw54$ACCEPT_TYPES, zookeeper.$list6, zookeeper.$kw55$CONTENT_TYPE, zookeeper.$str56$application_octet_stream, zookeeper.$kw57$SOAP_ACTION_URI, zookeeper.NIL }));
                                if (in_stream.isStream()) {
                                    thread.resetMultipleValues();
                                    final SubLObject status = zk_analyze_delete_session_response(xml_parsing_utilities.xml_tokenize(in_stream, (SubLObject)zookeeper.UNPROVIDED, (SubLObject)zookeeper.UNPROVIDED, (SubLObject)zookeeper.UNPROVIDED));
                                    final SubLObject message = thread.secondMultipleValue();
                                    thread.resetMultipleValues();
                                    return Values.values(status, message);
                                }
                                problems = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(server, (SubLObject)zookeeper.$str59$n_a, (SubLObject)zookeeper.$str60$no_connection), problems);
                            }
                        }
                        finally {
                            final SubLObject _prev_bind_0_$6 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)zookeeper.T, thread);
                                final SubLObject _values = Values.getValuesAsVector();
                                if (zookeeper.NIL != in_stream) {
                                    streams_high.close(in_stream, (SubLObject)zookeeper.UNPROVIDED);
                                }
                                Values.restoreValuesFromVector(_values);
                            }
                            finally {
                                Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$6, thread);
                            }
                        }
                    }
                    catch (Throwable catch_var) {
                        Errors.handleThrowable(catch_var, (SubLObject)zookeeper.NIL);
                    }
                }
                finally {
                    Errors.$error_handler$.rebind(_prev_bind_0, thread);
                }
            }
            catch (Throwable ccatch_env_var) {
                connection_error = Errors.handleThrowable(ccatch_env_var, subl_macro_promotions.$catch_error_message_target$.getGlobalValue());
            }
            finally {
                thread.throwStack.pop();
            }
            problems = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(server, (SubLObject)zookeeper.$str59$n_a, connection_error), problems);
            cdolist_list_var = cdolist_list_var.rest();
            server = cdolist_list_var.first();
        }
        return Errors.error((SubLObject)zookeeper.$str61$Could_not_create_node_on_any_serv, problems);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/zookeeper.lisp", position = 20940L)
    public static SubLObject zk_analyze_delete_session_response(final SubLObject tokens) {
        final SubLObject header = tokens.first();
        if (zookeeper.NIL != string_utilities.starts_with(header, (SubLObject)zookeeper.$str70$HTTP_1_1_204_No_Content)) {
            return Values.values((SubLObject)zookeeper.T, (SubLObject)zookeeper.NIL);
        }
        if (zookeeper.NIL != string_utilities.starts_with(header, (SubLObject)zookeeper.$str63$HTTP_1_1_404_Not_Found)) {
            return Values.values((SubLObject)zookeeper.NIL, (SubLObject)zookeeper.$str149$No_such_session_);
        }
        return Values.values((SubLObject)zookeeper.NIL, Sequences.cconcatenate((SubLObject)zookeeper.$str65$Unexpected_HTTP_header_, new SubLObject[] { format_nil.format_nil_a_no_copy(header), zookeeper.$str66$_, format_nil.$format_nil_percent$.getGlobalValue() }));
    }
    
    public static SubLObject declare_zookeeper_file() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.zookeeper", "zk_get_node_children", "ZK-GET-NODE-CHILDREN", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.zookeeper", "zk_child_state_print_function_trampoline", "ZK-CHILD-STATE-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.zookeeper", "zk_child_state_p", "ZK-CHILD-STATE-P", 1, 0, false);
        new $zk_child_state_p$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.zookeeper", "zkkids_path", "ZKKIDS-PATH", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.zookeeper", "zkkids_uri", "ZKKIDS-URI", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.zookeeper", "zkkids_child_uri_template", "ZKKIDS-CHILD-URI-TEMPLATE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.zookeeper", "zkkids_children", "ZKKIDS-CHILDREN", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.zookeeper", "_csetf_zkkids_path", "_CSETF-ZKKIDS-PATH", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.zookeeper", "_csetf_zkkids_uri", "_CSETF-ZKKIDS-URI", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.zookeeper", "_csetf_zkkids_child_uri_template", "_CSETF-ZKKIDS-CHILD-URI-TEMPLATE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.zookeeper", "_csetf_zkkids_children", "_CSETF-ZKKIDS-CHILDREN", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.zookeeper", "make_zk_child_state", "MAKE-ZK-CHILD-STATE", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.zookeeper", "visit_defstruct_zk_child_state", "VISIT-DEFSTRUCT-ZK-CHILD-STATE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.zookeeper", "visit_defstruct_object_zk_child_state_method", "VISIT-DEFSTRUCT-OBJECT-ZK-CHILD-STATE-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.zookeeper", "parse_zk_children", "PARSE-ZK-CHILDREN", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.zookeeper", "zk_set_node_data", "ZK-SET-NODE-DATA", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.zookeeper", "zk_analyze_set_response", "ZK-ANALYZE-SET-RESPONSE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.zookeeper", "zk_delete_node", "ZK-DELETE-NODE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.zookeeper", "zk_analyze_delete_response", "ZK-ANALYZE-DELETE-RESPONSE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.zookeeper", "zk_get_node_state", "ZK-GET-NODE-STATE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.zookeeper", "zk_node_state_print_function_trampoline", "ZK-NODE-STATE-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.zookeeper", "zk_node_state_p", "ZK-NODE-STATE-P", 1, 0, false);
        new $zk_node_state_p$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.zookeeper", "zkstat_path", "ZKSTAT-PATH", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.zookeeper", "zkstat_uri", "ZKSTAT-URI", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.zookeeper", "zkstat_data", "ZKSTAT-DATA", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.zookeeper", "zkstat_czxid", "ZKSTAT-CZXID", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.zookeeper", "zkstat_mzxid", "ZKSTAT-MZXID", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.zookeeper", "zkstat_ctime", "ZKSTAT-CTIME", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.zookeeper", "zkstat_mtime", "ZKSTAT-MTIME", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.zookeeper", "zkstat_version", "ZKSTAT-VERSION", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.zookeeper", "zkstat_cversion", "ZKSTAT-CVERSION", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.zookeeper", "zkstat_aversion", "ZKSTAT-AVERSION", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.zookeeper", "zkstat_ephemeral_owner", "ZKSTAT-EPHEMERAL-OWNER", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.zookeeper", "zkstat_data_len", "ZKSTAT-DATA-LEN", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.zookeeper", "zkstat_num_children", "ZKSTAT-NUM-CHILDREN", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.zookeeper", "zkstat_pzxid", "ZKSTAT-PZXID", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.zookeeper", "_csetf_zkstat_path", "_CSETF-ZKSTAT-PATH", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.zookeeper", "_csetf_zkstat_uri", "_CSETF-ZKSTAT-URI", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.zookeeper", "_csetf_zkstat_data", "_CSETF-ZKSTAT-DATA", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.zookeeper", "_csetf_zkstat_czxid", "_CSETF-ZKSTAT-CZXID", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.zookeeper", "_csetf_zkstat_mzxid", "_CSETF-ZKSTAT-MZXID", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.zookeeper", "_csetf_zkstat_ctime", "_CSETF-ZKSTAT-CTIME", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.zookeeper", "_csetf_zkstat_mtime", "_CSETF-ZKSTAT-MTIME", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.zookeeper", "_csetf_zkstat_version", "_CSETF-ZKSTAT-VERSION", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.zookeeper", "_csetf_zkstat_cversion", "_CSETF-ZKSTAT-CVERSION", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.zookeeper", "_csetf_zkstat_aversion", "_CSETF-ZKSTAT-AVERSION", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.zookeeper", "_csetf_zkstat_ephemeral_owner", "_CSETF-ZKSTAT-EPHEMERAL-OWNER", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.zookeeper", "_csetf_zkstat_data_len", "_CSETF-ZKSTAT-DATA-LEN", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.zookeeper", "_csetf_zkstat_num_children", "_CSETF-ZKSTAT-NUM-CHILDREN", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.zookeeper", "_csetf_zkstat_pzxid", "_CSETF-ZKSTAT-PZXID", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.zookeeper", "make_zk_node_state", "MAKE-ZK-NODE-STATE", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.zookeeper", "visit_defstruct_zk_node_state", "VISIT-DEFSTRUCT-ZK-NODE-STATE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.zookeeper", "visit_defstruct_object_zk_node_state_method", "VISIT-DEFSTRUCT-OBJECT-ZK-NODE-STATE-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.zookeeper", "parse_zk_state", "PARSE-ZK-STATE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.zookeeper", "zk_must_match_closing_tag", "ZK-MUST-MATCH-CLOSING-TAG", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.zookeeper", "zk_create_permanent_node", "ZK-CREATE-PERMANENT-NODE", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.zookeeper", "zk_analyze_create_response", "ZK-ANALYZE-CREATE-RESPONSE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.zookeeper", "zk_create_session", "ZK-CREATE-SESSION", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.zookeeper", "zk_analyze_create_session_response", "ZK-ANALYZE-CREATE-SESSION-RESPONSE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.zookeeper", "zk_send_session_heartbeat", "ZK-SEND-SESSION-HEARTBEAT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.zookeeper", "zk_analyze_session_heartbeat_response", "ZK-ANALYZE-SESSION-HEARTBEAT-RESPONSE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.zookeeper", "zk_delete_session", "ZK-DELETE-SESSION", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.zookeeper", "zk_analyze_delete_session_response", "ZK-ANALYZE-DELETE-SESSION-RESPONSE", 1, 0, false);
        return (SubLObject)zookeeper.NIL;
    }
    
    public static SubLObject init_zookeeper_file() {
        zookeeper.$zookeeper_rest_servers$ = SubLFiles.defparameter("*ZOOKEEPER-REST-SERVERS*", (SubLObject)ConsesLow.list((SubLObject)zookeeper.$str0$localhost));
        zookeeper.$zookeeper_rest_port$ = SubLFiles.defparameter("*ZOOKEEPER-REST-PORT*", (SubLObject)zookeeper.$int1$9998);
        zookeeper.$zookeeper_rest_timeout$ = SubLFiles.defparameter("*ZOOKEEPER-REST-TIMEOUT*", (SubLObject)zookeeper.$int2$60);
        zookeeper.$dtp_zk_child_state$ = SubLFiles.defconstant("*DTP-ZK-CHILD-STATE*", (SubLObject)zookeeper.$sym7$ZK_CHILD_STATE);
        zookeeper.$dtp_zk_node_state$ = SubLFiles.defconstant("*DTP-ZK-NODE-STATE*", (SubLObject)zookeeper.$sym73$ZK_NODE_STATE);
        return (SubLObject)zookeeper.NIL;
    }
    
    public static SubLObject setup_zookeeper_file() {
        access_macros.register_external_symbol((SubLObject)zookeeper.$sym3$ZK_GET_NODE_CHILDREN);
        Structures.register_method(print_high.$print_object_method_table$.getGlobalValue(), zookeeper.$dtp_zk_child_state$.getGlobalValue(), Symbols.symbol_function((SubLObject)zookeeper.$sym14$ZK_CHILD_STATE_PRINT_FUNCTION_TRAMPOLINE));
        SubLSpecialOperatorDeclarations.proclaim((SubLObject)zookeeper.$list15);
        Structures.def_csetf((SubLObject)zookeeper.$sym16$ZKKIDS_PATH, (SubLObject)zookeeper.$sym17$_CSETF_ZKKIDS_PATH);
        Structures.def_csetf((SubLObject)zookeeper.$sym18$ZKKIDS_URI, (SubLObject)zookeeper.$sym19$_CSETF_ZKKIDS_URI);
        Structures.def_csetf((SubLObject)zookeeper.$sym20$ZKKIDS_CHILD_URI_TEMPLATE, (SubLObject)zookeeper.$sym21$_CSETF_ZKKIDS_CHILD_URI_TEMPLATE);
        Structures.def_csetf((SubLObject)zookeeper.$sym22$ZKKIDS_CHILDREN, (SubLObject)zookeeper.$sym23$_CSETF_ZKKIDS_CHILDREN);
        Equality.identity((SubLObject)zookeeper.$sym7$ZK_CHILD_STATE);
        Structures.register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), zookeeper.$dtp_zk_child_state$.getGlobalValue(), Symbols.symbol_function((SubLObject)zookeeper.$sym33$VISIT_DEFSTRUCT_OBJECT_ZK_CHILD_STATE_METHOD));
        access_macros.register_external_symbol((SubLObject)zookeeper.$sym41$ZK_SET_NODE_DATA);
        access_macros.register_external_symbol((SubLObject)zookeeper.$sym67$ZK_DELETE_NODE);
        access_macros.register_external_symbol((SubLObject)zookeeper.$sym71$ZK_GET_NODE_STATE);
        Structures.register_method(print_high.$print_object_method_table$.getGlobalValue(), zookeeper.$dtp_zk_node_state$.getGlobalValue(), Symbols.symbol_function((SubLObject)zookeeper.$sym79$ZK_NODE_STATE_PRINT_FUNCTION_TRAMPOLINE));
        SubLSpecialOperatorDeclarations.proclaim((SubLObject)zookeeper.$list80);
        Structures.def_csetf((SubLObject)zookeeper.$sym81$ZKSTAT_PATH, (SubLObject)zookeeper.$sym82$_CSETF_ZKSTAT_PATH);
        Structures.def_csetf((SubLObject)zookeeper.$sym83$ZKSTAT_URI, (SubLObject)zookeeper.$sym84$_CSETF_ZKSTAT_URI);
        Structures.def_csetf((SubLObject)zookeeper.$sym85$ZKSTAT_DATA, (SubLObject)zookeeper.$sym86$_CSETF_ZKSTAT_DATA);
        Structures.def_csetf((SubLObject)zookeeper.$sym87$ZKSTAT_CZXID, (SubLObject)zookeeper.$sym88$_CSETF_ZKSTAT_CZXID);
        Structures.def_csetf((SubLObject)zookeeper.$sym89$ZKSTAT_MZXID, (SubLObject)zookeeper.$sym90$_CSETF_ZKSTAT_MZXID);
        Structures.def_csetf((SubLObject)zookeeper.$sym91$ZKSTAT_CTIME, (SubLObject)zookeeper.$sym92$_CSETF_ZKSTAT_CTIME);
        Structures.def_csetf((SubLObject)zookeeper.$sym93$ZKSTAT_MTIME, (SubLObject)zookeeper.$sym94$_CSETF_ZKSTAT_MTIME);
        Structures.def_csetf((SubLObject)zookeeper.$sym95$ZKSTAT_VERSION, (SubLObject)zookeeper.$sym96$_CSETF_ZKSTAT_VERSION);
        Structures.def_csetf((SubLObject)zookeeper.$sym97$ZKSTAT_CVERSION, (SubLObject)zookeeper.$sym98$_CSETF_ZKSTAT_CVERSION);
        Structures.def_csetf((SubLObject)zookeeper.$sym99$ZKSTAT_AVERSION, (SubLObject)zookeeper.$sym100$_CSETF_ZKSTAT_AVERSION);
        Structures.def_csetf((SubLObject)zookeeper.$sym101$ZKSTAT_EPHEMERAL_OWNER, (SubLObject)zookeeper.$sym102$_CSETF_ZKSTAT_EPHEMERAL_OWNER);
        Structures.def_csetf((SubLObject)zookeeper.$sym103$ZKSTAT_DATA_LEN, (SubLObject)zookeeper.$sym104$_CSETF_ZKSTAT_DATA_LEN);
        Structures.def_csetf((SubLObject)zookeeper.$sym105$ZKSTAT_NUM_CHILDREN, (SubLObject)zookeeper.$sym106$_CSETF_ZKSTAT_NUM_CHILDREN);
        Structures.def_csetf((SubLObject)zookeeper.$sym107$ZKSTAT_PZXID, (SubLObject)zookeeper.$sym108$_CSETF_ZKSTAT_PZXID);
        Equality.identity((SubLObject)zookeeper.$sym73$ZK_NODE_STATE);
        Structures.register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), zookeeper.$dtp_zk_node_state$.getGlobalValue(), Symbols.symbol_function((SubLObject)zookeeper.$sym122$VISIT_DEFSTRUCT_OBJECT_ZK_NODE_STATE_METHOD));
        access_macros.register_external_symbol((SubLObject)zookeeper.$sym137$ZK_CREATE_PERMANENT_NODE);
        access_macros.register_external_symbol((SubLObject)zookeeper.$sym144$ZK_CREATE_SESSION);
        access_macros.register_external_symbol((SubLObject)zookeeper.$sym146$ZK_SEND_SESSION_HEARTBEAT);
        access_macros.register_external_symbol((SubLObject)zookeeper.$sym148$ZK_DELETE_SESSION);
        return (SubLObject)zookeeper.NIL;
    }
    
    public void declareFunctions() {
        declare_zookeeper_file();
    }
    
    public void initializeVariables() {
        init_zookeeper_file();
    }
    
    public void runTopLevelForms() {
        setup_zookeeper_file();
    }
    
    static {
        me = (SubLFile)new zookeeper();
        zookeeper.$zookeeper_rest_servers$ = null;
        zookeeper.$zookeeper_rest_port$ = null;
        zookeeper.$zookeeper_rest_timeout$ = null;
        zookeeper.$dtp_zk_child_state$ = null;
        zookeeper.$dtp_zk_node_state$ = null;
        $str0$localhost = SubLObjectFactory.makeString("localhost");
        $int1$9998 = SubLObjectFactory.makeInteger(9998);
        $int2$60 = SubLObjectFactory.makeInteger(60);
        $sym3$ZK_GET_NODE_CHILDREN = SubLObjectFactory.makeSymbol("ZK-GET-NODE-CHILDREN");
        $str4$view_children = SubLObjectFactory.makeString("view=children");
        $kw5$GET = SubLObjectFactory.makeKeyword("GET");
        $list6 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("application/xml"));
        $sym7$ZK_CHILD_STATE = SubLObjectFactory.makeSymbol("ZK-CHILD-STATE");
        $sym8$ZK_CHILD_STATE_P = SubLObjectFactory.makeSymbol("ZK-CHILD-STATE-P");
        $list9 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PATH"), (SubLObject)SubLObjectFactory.makeSymbol("URI"), (SubLObject)SubLObjectFactory.makeSymbol("CHILD-URI-TEMPLATE"), (SubLObject)SubLObjectFactory.makeSymbol("CHILDREN"));
        $list10 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("PATH"), (SubLObject)SubLObjectFactory.makeKeyword("URI"), (SubLObject)SubLObjectFactory.makeKeyword("CHILD-URI-TEMPLATE"), (SubLObject)SubLObjectFactory.makeKeyword("CHILDREN"));
        $list11 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ZKKIDS-PATH"), (SubLObject)SubLObjectFactory.makeSymbol("ZKKIDS-URI"), (SubLObject)SubLObjectFactory.makeSymbol("ZKKIDS-CHILD-URI-TEMPLATE"), (SubLObject)SubLObjectFactory.makeSymbol("ZKKIDS-CHILDREN"));
        $list12 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("_CSETF-ZKKIDS-PATH"), (SubLObject)SubLObjectFactory.makeSymbol("_CSETF-ZKKIDS-URI"), (SubLObject)SubLObjectFactory.makeSymbol("_CSETF-ZKKIDS-CHILD-URI-TEMPLATE"), (SubLObject)SubLObjectFactory.makeSymbol("_CSETF-ZKKIDS-CHILDREN"));
        $sym13$DEFAULT_STRUCT_PRINT_FUNCTION = SubLObjectFactory.makeSymbol("DEFAULT-STRUCT-PRINT-FUNCTION");
        $sym14$ZK_CHILD_STATE_PRINT_FUNCTION_TRAMPOLINE = SubLObjectFactory.makeSymbol("ZK-CHILD-STATE-PRINT-FUNCTION-TRAMPOLINE");
        $list15 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("OPTIMIZE-FUNCALL"), (SubLObject)SubLObjectFactory.makeSymbol("ZK-CHILD-STATE-P"));
        $sym16$ZKKIDS_PATH = SubLObjectFactory.makeSymbol("ZKKIDS-PATH");
        $sym17$_CSETF_ZKKIDS_PATH = SubLObjectFactory.makeSymbol("_CSETF-ZKKIDS-PATH");
        $sym18$ZKKIDS_URI = SubLObjectFactory.makeSymbol("ZKKIDS-URI");
        $sym19$_CSETF_ZKKIDS_URI = SubLObjectFactory.makeSymbol("_CSETF-ZKKIDS-URI");
        $sym20$ZKKIDS_CHILD_URI_TEMPLATE = SubLObjectFactory.makeSymbol("ZKKIDS-CHILD-URI-TEMPLATE");
        $sym21$_CSETF_ZKKIDS_CHILD_URI_TEMPLATE = SubLObjectFactory.makeSymbol("_CSETF-ZKKIDS-CHILD-URI-TEMPLATE");
        $sym22$ZKKIDS_CHILDREN = SubLObjectFactory.makeSymbol("ZKKIDS-CHILDREN");
        $sym23$_CSETF_ZKKIDS_CHILDREN = SubLObjectFactory.makeSymbol("_CSETF-ZKKIDS-CHILDREN");
        $kw24$PATH = SubLObjectFactory.makeKeyword("PATH");
        $kw25$URI = SubLObjectFactory.makeKeyword("URI");
        $kw26$CHILD_URI_TEMPLATE = SubLObjectFactory.makeKeyword("CHILD-URI-TEMPLATE");
        $kw27$CHILDREN = SubLObjectFactory.makeKeyword("CHILDREN");
        $str28$Invalid_slot__S_for_construction_ = SubLObjectFactory.makeString("Invalid slot ~S for construction function");
        $kw29$BEGIN = SubLObjectFactory.makeKeyword("BEGIN");
        $sym30$MAKE_ZK_CHILD_STATE = SubLObjectFactory.makeSymbol("MAKE-ZK-CHILD-STATE");
        $kw31$SLOT = SubLObjectFactory.makeKeyword("SLOT");
        $kw32$END = SubLObjectFactory.makeKeyword("END");
        $sym33$VISIT_DEFSTRUCT_OBJECT_ZK_CHILD_STATE_METHOD = SubLObjectFactory.makeSymbol("VISIT-DEFSTRUCT-OBJECT-ZK-CHILD-STATE-METHOD");
        $str34$child = SubLObjectFactory.makeString("child");
        $str35$path = SubLObjectFactory.makeString("path");
        $str36$uri = SubLObjectFactory.makeString("uri");
        $str37$child_uri_template = SubLObjectFactory.makeString("child_uri_template");
        $str38$children = SubLObjectFactory.makeString("children");
        $str39$Unexpected_XML_tag__A___ = SubLObjectFactory.makeString("Unexpected XML tag ~A.~%");
        $str40$Unexpected_token_stream__A_ = SubLObjectFactory.makeString("Unexpected token stream ~A.");
        $sym41$ZK_SET_NODE_DATA = SubLObjectFactory.makeSymbol("ZK-SET-NODE-DATA");
        $sym42$CATCH_ERROR_MESSAGE_HANDLER = SubLObjectFactory.makeSymbol("CATCH-ERROR-MESSAGE-HANDLER");
        $kw43$DEFAULT = SubLObjectFactory.makeKeyword("DEFAULT");
        $int44$80 = SubLObjectFactory.makeInteger(80);
        $kw45$PRIVATE = SubLObjectFactory.makeKeyword("PRIVATE");
        $kw46$MACHINE = SubLObjectFactory.makeKeyword("MACHINE");
        $kw47$PORT = SubLObjectFactory.makeKeyword("PORT");
        $kw48$METHOD = SubLObjectFactory.makeKeyword("METHOD");
        $kw49$PUT = SubLObjectFactory.makeKeyword("PUT");
        $kw50$URL = SubLObjectFactory.makeKeyword("URL");
        $kw51$QUERY = SubLObjectFactory.makeKeyword("QUERY");
        $kw52$KEEP_ALIVE_ = SubLObjectFactory.makeKeyword("KEEP-ALIVE?");
        $kw53$WIDE_NEWLINES_ = SubLObjectFactory.makeKeyword("WIDE-NEWLINES?");
        $kw54$ACCEPT_TYPES = SubLObjectFactory.makeKeyword("ACCEPT-TYPES");
        $kw55$CONTENT_TYPE = SubLObjectFactory.makeKeyword("CONTENT-TYPE");
        $str56$application_octet_stream = SubLObjectFactory.makeString("application/octet-stream");
        $kw57$SOAP_ACTION_URI = SubLObjectFactory.makeKeyword("SOAP-ACTION-URI");
        $sym58$_EXIT = SubLObjectFactory.makeSymbol("%EXIT");
        $str59$n_a = SubLObjectFactory.makeString("n/a");
        $str60$no_connection = SubLObjectFactory.makeString("no-connection");
        $str61$Could_not_create_node_on_any_serv = SubLObjectFactory.makeString("Could not create node on any server: ~A.");
        $str62$HTTP_1_1_200_OK = SubLObjectFactory.makeString("HTTP/1.1 200 OK");
        $str63$HTTP_1_1_404_Not_Found = SubLObjectFactory.makeString("HTTP/1.1 404 Not Found");
        $str64$No_such_node_ = SubLObjectFactory.makeString("No such node.");
        $str65$Unexpected_HTTP_header_ = SubLObjectFactory.makeString("Unexpected HTTP header ");
        $str66$_ = SubLObjectFactory.makeString(".");
        $sym67$ZK_DELETE_NODE = SubLObjectFactory.makeSymbol("ZK-DELETE-NODE");
        $kw68$DELETE = SubLObjectFactory.makeKeyword("DELETE");
        $str69$ = SubLObjectFactory.makeString("");
        $str70$HTTP_1_1_204_No_Content = SubLObjectFactory.makeString("HTTP/1.1 204 No Content");
        $sym71$ZK_GET_NODE_STATE = SubLObjectFactory.makeSymbol("ZK-GET-NODE-STATE");
        $str72$dataformat_utf8 = SubLObjectFactory.makeString("dataformat=utf8");
        $sym73$ZK_NODE_STATE = SubLObjectFactory.makeSymbol("ZK-NODE-STATE");
        $sym74$ZK_NODE_STATE_P = SubLObjectFactory.makeSymbol("ZK-NODE-STATE-P");
        $list75 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeSymbol("PATH"), SubLObjectFactory.makeSymbol("URI"), SubLObjectFactory.makeSymbol("DATA"), SubLObjectFactory.makeSymbol("CZXID"), SubLObjectFactory.makeSymbol("MZXID"), SubLObjectFactory.makeSymbol("CTIME"), SubLObjectFactory.makeSymbol("MTIME"), SubLObjectFactory.makeSymbol("VERSION"), SubLObjectFactory.makeSymbol("CVERSION"), SubLObjectFactory.makeSymbol("AVERSION"), SubLObjectFactory.makeSymbol("EPHEMERAL-OWNER"), SubLObjectFactory.makeSymbol("DATA-LEN"), SubLObjectFactory.makeSymbol("NUM-CHILDREN"), SubLObjectFactory.makeSymbol("PZXID") });
        $list76 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("PATH"), SubLObjectFactory.makeKeyword("URI"), SubLObjectFactory.makeKeyword("DATA"), SubLObjectFactory.makeKeyword("CZXID"), SubLObjectFactory.makeKeyword("MZXID"), SubLObjectFactory.makeKeyword("CTIME"), SubLObjectFactory.makeKeyword("MTIME"), SubLObjectFactory.makeKeyword("VERSION"), SubLObjectFactory.makeKeyword("CVERSION"), SubLObjectFactory.makeKeyword("AVERSION"), SubLObjectFactory.makeKeyword("EPHEMERAL-OWNER"), SubLObjectFactory.makeKeyword("DATA-LEN"), SubLObjectFactory.makeKeyword("NUM-CHILDREN"), SubLObjectFactory.makeKeyword("PZXID") });
        $list77 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeSymbol("ZKSTAT-PATH"), SubLObjectFactory.makeSymbol("ZKSTAT-URI"), SubLObjectFactory.makeSymbol("ZKSTAT-DATA"), SubLObjectFactory.makeSymbol("ZKSTAT-CZXID"), SubLObjectFactory.makeSymbol("ZKSTAT-MZXID"), SubLObjectFactory.makeSymbol("ZKSTAT-CTIME"), SubLObjectFactory.makeSymbol("ZKSTAT-MTIME"), SubLObjectFactory.makeSymbol("ZKSTAT-VERSION"), SubLObjectFactory.makeSymbol("ZKSTAT-CVERSION"), SubLObjectFactory.makeSymbol("ZKSTAT-AVERSION"), SubLObjectFactory.makeSymbol("ZKSTAT-EPHEMERAL-OWNER"), SubLObjectFactory.makeSymbol("ZKSTAT-DATA-LEN"), SubLObjectFactory.makeSymbol("ZKSTAT-NUM-CHILDREN"), SubLObjectFactory.makeSymbol("ZKSTAT-PZXID") });
        $list78 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeSymbol("_CSETF-ZKSTAT-PATH"), SubLObjectFactory.makeSymbol("_CSETF-ZKSTAT-URI"), SubLObjectFactory.makeSymbol("_CSETF-ZKSTAT-DATA"), SubLObjectFactory.makeSymbol("_CSETF-ZKSTAT-CZXID"), SubLObjectFactory.makeSymbol("_CSETF-ZKSTAT-MZXID"), SubLObjectFactory.makeSymbol("_CSETF-ZKSTAT-CTIME"), SubLObjectFactory.makeSymbol("_CSETF-ZKSTAT-MTIME"), SubLObjectFactory.makeSymbol("_CSETF-ZKSTAT-VERSION"), SubLObjectFactory.makeSymbol("_CSETF-ZKSTAT-CVERSION"), SubLObjectFactory.makeSymbol("_CSETF-ZKSTAT-AVERSION"), SubLObjectFactory.makeSymbol("_CSETF-ZKSTAT-EPHEMERAL-OWNER"), SubLObjectFactory.makeSymbol("_CSETF-ZKSTAT-DATA-LEN"), SubLObjectFactory.makeSymbol("_CSETF-ZKSTAT-NUM-CHILDREN"), SubLObjectFactory.makeSymbol("_CSETF-ZKSTAT-PZXID") });
        $sym79$ZK_NODE_STATE_PRINT_FUNCTION_TRAMPOLINE = SubLObjectFactory.makeSymbol("ZK-NODE-STATE-PRINT-FUNCTION-TRAMPOLINE");
        $list80 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("OPTIMIZE-FUNCALL"), (SubLObject)SubLObjectFactory.makeSymbol("ZK-NODE-STATE-P"));
        $sym81$ZKSTAT_PATH = SubLObjectFactory.makeSymbol("ZKSTAT-PATH");
        $sym82$_CSETF_ZKSTAT_PATH = SubLObjectFactory.makeSymbol("_CSETF-ZKSTAT-PATH");
        $sym83$ZKSTAT_URI = SubLObjectFactory.makeSymbol("ZKSTAT-URI");
        $sym84$_CSETF_ZKSTAT_URI = SubLObjectFactory.makeSymbol("_CSETF-ZKSTAT-URI");
        $sym85$ZKSTAT_DATA = SubLObjectFactory.makeSymbol("ZKSTAT-DATA");
        $sym86$_CSETF_ZKSTAT_DATA = SubLObjectFactory.makeSymbol("_CSETF-ZKSTAT-DATA");
        $sym87$ZKSTAT_CZXID = SubLObjectFactory.makeSymbol("ZKSTAT-CZXID");
        $sym88$_CSETF_ZKSTAT_CZXID = SubLObjectFactory.makeSymbol("_CSETF-ZKSTAT-CZXID");
        $sym89$ZKSTAT_MZXID = SubLObjectFactory.makeSymbol("ZKSTAT-MZXID");
        $sym90$_CSETF_ZKSTAT_MZXID = SubLObjectFactory.makeSymbol("_CSETF-ZKSTAT-MZXID");
        $sym91$ZKSTAT_CTIME = SubLObjectFactory.makeSymbol("ZKSTAT-CTIME");
        $sym92$_CSETF_ZKSTAT_CTIME = SubLObjectFactory.makeSymbol("_CSETF-ZKSTAT-CTIME");
        $sym93$ZKSTAT_MTIME = SubLObjectFactory.makeSymbol("ZKSTAT-MTIME");
        $sym94$_CSETF_ZKSTAT_MTIME = SubLObjectFactory.makeSymbol("_CSETF-ZKSTAT-MTIME");
        $sym95$ZKSTAT_VERSION = SubLObjectFactory.makeSymbol("ZKSTAT-VERSION");
        $sym96$_CSETF_ZKSTAT_VERSION = SubLObjectFactory.makeSymbol("_CSETF-ZKSTAT-VERSION");
        $sym97$ZKSTAT_CVERSION = SubLObjectFactory.makeSymbol("ZKSTAT-CVERSION");
        $sym98$_CSETF_ZKSTAT_CVERSION = SubLObjectFactory.makeSymbol("_CSETF-ZKSTAT-CVERSION");
        $sym99$ZKSTAT_AVERSION = SubLObjectFactory.makeSymbol("ZKSTAT-AVERSION");
        $sym100$_CSETF_ZKSTAT_AVERSION = SubLObjectFactory.makeSymbol("_CSETF-ZKSTAT-AVERSION");
        $sym101$ZKSTAT_EPHEMERAL_OWNER = SubLObjectFactory.makeSymbol("ZKSTAT-EPHEMERAL-OWNER");
        $sym102$_CSETF_ZKSTAT_EPHEMERAL_OWNER = SubLObjectFactory.makeSymbol("_CSETF-ZKSTAT-EPHEMERAL-OWNER");
        $sym103$ZKSTAT_DATA_LEN = SubLObjectFactory.makeSymbol("ZKSTAT-DATA-LEN");
        $sym104$_CSETF_ZKSTAT_DATA_LEN = SubLObjectFactory.makeSymbol("_CSETF-ZKSTAT-DATA-LEN");
        $sym105$ZKSTAT_NUM_CHILDREN = SubLObjectFactory.makeSymbol("ZKSTAT-NUM-CHILDREN");
        $sym106$_CSETF_ZKSTAT_NUM_CHILDREN = SubLObjectFactory.makeSymbol("_CSETF-ZKSTAT-NUM-CHILDREN");
        $sym107$ZKSTAT_PZXID = SubLObjectFactory.makeSymbol("ZKSTAT-PZXID");
        $sym108$_CSETF_ZKSTAT_PZXID = SubLObjectFactory.makeSymbol("_CSETF-ZKSTAT-PZXID");
        $kw109$DATA = SubLObjectFactory.makeKeyword("DATA");
        $kw110$CZXID = SubLObjectFactory.makeKeyword("CZXID");
        $kw111$MZXID = SubLObjectFactory.makeKeyword("MZXID");
        $kw112$CTIME = SubLObjectFactory.makeKeyword("CTIME");
        $kw113$MTIME = SubLObjectFactory.makeKeyword("MTIME");
        $kw114$VERSION = SubLObjectFactory.makeKeyword("VERSION");
        $kw115$CVERSION = SubLObjectFactory.makeKeyword("CVERSION");
        $kw116$AVERSION = SubLObjectFactory.makeKeyword("AVERSION");
        $kw117$EPHEMERAL_OWNER = SubLObjectFactory.makeKeyword("EPHEMERAL-OWNER");
        $kw118$DATA_LEN = SubLObjectFactory.makeKeyword("DATA-LEN");
        $kw119$NUM_CHILDREN = SubLObjectFactory.makeKeyword("NUM-CHILDREN");
        $kw120$PZXID = SubLObjectFactory.makeKeyword("PZXID");
        $sym121$MAKE_ZK_NODE_STATE = SubLObjectFactory.makeSymbol("MAKE-ZK-NODE-STATE");
        $sym122$VISIT_DEFSTRUCT_OBJECT_ZK_NODE_STATE_METHOD = SubLObjectFactory.makeSymbol("VISIT-DEFSTRUCT-OBJECT-ZK-NODE-STATE-METHOD");
        $str123$stat = SubLObjectFactory.makeString("stat");
        $str124$dataUtf8 = SubLObjectFactory.makeString("dataUtf8");
        $str125$czxid = SubLObjectFactory.makeString("czxid");
        $str126$mzxid = SubLObjectFactory.makeString("mzxid");
        $str127$pzxid = SubLObjectFactory.makeString("pzxid");
        $str128$ctime = SubLObjectFactory.makeString("ctime");
        $str129$mtime = SubLObjectFactory.makeString("mtime");
        $str130$version = SubLObjectFactory.makeString("version");
        $str131$aversion = SubLObjectFactory.makeString("aversion");
        $str132$cversion = SubLObjectFactory.makeString("cversion");
        $str133$ephemeralOwner = SubLObjectFactory.makeString("ephemeralOwner");
        $str134$dataLength = SubLObjectFactory.makeString("dataLength");
        $str135$numChildren = SubLObjectFactory.makeString("numChildren");
        $str136$Expected_closing_tag__A_but_got__ = SubLObjectFactory.makeString("Expected closing tag ~A but got ~A instead.~%");
        $sym137$ZK_CREATE_PERMANENT_NODE = SubLObjectFactory.makeSymbol("ZK-CREATE-PERMANENT-NODE");
        $str138$_op_create_name_ = SubLObjectFactory.makeString("?op=create&name=");
        $kw139$POST = SubLObjectFactory.makeKeyword("POST");
        $str140$HTTP_1_1_201_Created = SubLObjectFactory.makeString("HTTP/1.1 201 Created");
        $str141$HTTP_1_1_409_Conflict = SubLObjectFactory.makeString("HTTP/1.1 409 Conflict");
        $str142$Node_already_exits_ = SubLObjectFactory.makeString("Node already exits.");
        $str143$No_such_parent_node_ = SubLObjectFactory.makeString("No such parent node.");
        $sym144$ZK_CREATE_SESSION = SubLObjectFactory.makeSymbol("ZK-CREATE-SESSION");
        $str145$_sessions_v1__op_create_expire_ = SubLObjectFactory.makeString("/sessions/v1/?op=create&expire=");
        $sym146$ZK_SEND_SESSION_HEARTBEAT = SubLObjectFactory.makeSymbol("ZK-SEND-SESSION-HEARTBEAT");
        $str147$_sessions_v1_ = SubLObjectFactory.makeString("/sessions/v1/");
        $sym148$ZK_DELETE_SESSION = SubLObjectFactory.makeSymbol("ZK-DELETE-SESSION");
        $str149$No_such_session_ = SubLObjectFactory.makeString("No such session.");
    }
    
    public static final class $zk_child_state_native extends SubLStructNative
    {
        public SubLObject $path;
        public SubLObject $uri;
        public SubLObject $child_uri_template;
        public SubLObject $children;
        private static final SubLStructDeclNative structDecl;
        
        public $zk_child_state_native() {
            this.$path = (SubLObject)CommonSymbols.NIL;
            this.$uri = (SubLObject)CommonSymbols.NIL;
            this.$child_uri_template = (SubLObject)CommonSymbols.NIL;
            this.$children = (SubLObject)CommonSymbols.NIL;
        }
        
        public SubLStructDecl getStructDecl() {
            return (SubLStructDecl)$zk_child_state_native.structDecl;
        }
        
        public SubLObject getField2() {
            return this.$path;
        }
        
        public SubLObject getField3() {
            return this.$uri;
        }
        
        public SubLObject getField4() {
            return this.$child_uri_template;
        }
        
        public SubLObject getField5() {
            return this.$children;
        }
        
        public SubLObject setField2(final SubLObject value) {
            return this.$path = value;
        }
        
        public SubLObject setField3(final SubLObject value) {
            return this.$uri = value;
        }
        
        public SubLObject setField4(final SubLObject value) {
            return this.$child_uri_template = value;
        }
        
        public SubLObject setField5(final SubLObject value) {
            return this.$children = value;
        }
        
        static {
            structDecl = Structures.makeStructDeclNative((Class)$zk_child_state_native.class, zookeeper.$sym7$ZK_CHILD_STATE, zookeeper.$sym8$ZK_CHILD_STATE_P, zookeeper.$list9, zookeeper.$list10, new String[] { "$path", "$uri", "$child_uri_template", "$children" }, zookeeper.$list11, zookeeper.$list12, zookeeper.$sym13$DEFAULT_STRUCT_PRINT_FUNCTION);
        }
    }
    
    public static final class $zk_child_state_p$UnaryFunction extends UnaryFunction
    {
        public $zk_child_state_p$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("ZK-CHILD-STATE-P"));
        }
        
        public SubLObject processItem(final SubLObject arg1) {
            return zookeeper.zk_child_state_p(arg1);
        }
    }
    
    public static final class $zk_node_state_native extends SubLStructNative
    {
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
        
        public $zk_node_state_native() {
            this.$path = (SubLObject)CommonSymbols.NIL;
            this.$uri = (SubLObject)CommonSymbols.NIL;
            this.$data = (SubLObject)CommonSymbols.NIL;
            this.$czxid = (SubLObject)CommonSymbols.NIL;
            this.$mzxid = (SubLObject)CommonSymbols.NIL;
            this.$ctime = (SubLObject)CommonSymbols.NIL;
            this.$mtime = (SubLObject)CommonSymbols.NIL;
            this.$version = (SubLObject)CommonSymbols.NIL;
            this.$cversion = (SubLObject)CommonSymbols.NIL;
            this.$aversion = (SubLObject)CommonSymbols.NIL;
            this.$ephemeral_owner = (SubLObject)CommonSymbols.NIL;
            this.$data_len = (SubLObject)CommonSymbols.NIL;
            this.$num_children = (SubLObject)CommonSymbols.NIL;
            this.$pzxid = (SubLObject)CommonSymbols.NIL;
        }
        
        public SubLStructDecl getStructDecl() {
            return (SubLStructDecl)$zk_node_state_native.structDecl;
        }
        
        public SubLObject getField2() {
            return this.$path;
        }
        
        public SubLObject getField3() {
            return this.$uri;
        }
        
        public SubLObject getField4() {
            return this.$data;
        }
        
        public SubLObject getField5() {
            return this.$czxid;
        }
        
        public SubLObject getField6() {
            return this.$mzxid;
        }
        
        public SubLObject getField7() {
            return this.$ctime;
        }
        
        public SubLObject getField8() {
            return this.$mtime;
        }
        
        public SubLObject getField9() {
            return this.$version;
        }
        
        public SubLObject getField10() {
            return this.$cversion;
        }
        
        public SubLObject getField11() {
            return this.$aversion;
        }
        
        public SubLObject getField12() {
            return this.$ephemeral_owner;
        }
        
        public SubLObject getField13() {
            return this.$data_len;
        }
        
        public SubLObject getField14() {
            return this.$num_children;
        }
        
        public SubLObject getField15() {
            return this.$pzxid;
        }
        
        public SubLObject setField2(final SubLObject value) {
            return this.$path = value;
        }
        
        public SubLObject setField3(final SubLObject value) {
            return this.$uri = value;
        }
        
        public SubLObject setField4(final SubLObject value) {
            return this.$data = value;
        }
        
        public SubLObject setField5(final SubLObject value) {
            return this.$czxid = value;
        }
        
        public SubLObject setField6(final SubLObject value) {
            return this.$mzxid = value;
        }
        
        public SubLObject setField7(final SubLObject value) {
            return this.$ctime = value;
        }
        
        public SubLObject setField8(final SubLObject value) {
            return this.$mtime = value;
        }
        
        public SubLObject setField9(final SubLObject value) {
            return this.$version = value;
        }
        
        public SubLObject setField10(final SubLObject value) {
            return this.$cversion = value;
        }
        
        public SubLObject setField11(final SubLObject value) {
            return this.$aversion = value;
        }
        
        public SubLObject setField12(final SubLObject value) {
            return this.$ephemeral_owner = value;
        }
        
        public SubLObject setField13(final SubLObject value) {
            return this.$data_len = value;
        }
        
        public SubLObject setField14(final SubLObject value) {
            return this.$num_children = value;
        }
        
        public SubLObject setField15(final SubLObject value) {
            return this.$pzxid = value;
        }
        
        static {
            structDecl = Structures.makeStructDeclNative((Class)$zk_node_state_native.class, zookeeper.$sym73$ZK_NODE_STATE, zookeeper.$sym74$ZK_NODE_STATE_P, zookeeper.$list75, zookeeper.$list76, new String[] { "$path", "$uri", "$data", "$czxid", "$mzxid", "$ctime", "$mtime", "$version", "$cversion", "$aversion", "$ephemeral_owner", "$data_len", "$num_children", "$pzxid" }, zookeeper.$list77, zookeeper.$list78, zookeeper.$sym13$DEFAULT_STRUCT_PRINT_FUNCTION);
        }
    }
    
    public static final class $zk_node_state_p$UnaryFunction extends UnaryFunction
    {
        public $zk_node_state_p$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("ZK-NODE-STATE-P"));
        }
        
        public SubLObject processItem(final SubLObject arg1) {
            return zookeeper.zk_node_state_p(arg1);
        }
    }
}

/*

	Total time: 474 ms
	
*/