package com.cyc.cycjava.cycl.sksi.corba;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.UnaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDecl;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDeclNative;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLStructNative;
import com.cyc.cycjava.cycl.constant_handles;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.visitation;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLSpecialOperatorDeclarations;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.cycjava.cycl.cfasl;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.cycjava.cycl.subl_macro_promotions;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.cycjava.cycl.el_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.cycjava.cycl.subl_promotions;
import com.cyc.cycjava.cycl.isa;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class corba_utilities extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.sksi.corba.corba_utilities";
    public static final String myFingerPrint = "3d81c671f786875e838e21407459cf8ab4719f2ddef92d42d05d66e924e0630f";
    @SubLTranslatedFile.SubL(source = "cycl/sksi/corba/corba-utilities.lisp", position = 957L)
    private static SubLSymbol $corba_predicates$;
    @SubLTranslatedFile.SubL(source = "cycl/sksi/corba/corba-utilities.lisp", position = 1391L)
    private static SubLSymbol $corba_removal_predicates$;
    @SubLTranslatedFile.SubL(source = "cycl/sksi/corba/corba-utilities.lisp", position = 1776L)
    private static SubLSymbol $corba_storage_predicates$;
    @SubLTranslatedFile.SubL(source = "cycl/sksi/corba/corba-utilities.lisp", position = 4635L)
    public static SubLSymbol $dtp_corba_connection$;
    @SubLTranslatedFile.SubL(source = "cycl/sksi/corba/corba-utilities.lisp", position = 5463L)
    private static SubLSymbol $corba_connection_open_connection_timeout$;
    @SubLTranslatedFile.SubL(source = "cycl/sksi/corba/corba-utilities.lisp", position = 5592L)
    private static SubLSymbol $corba_connection_transaction_timeout$;
    @SubLTranslatedFile.SubL(source = "cycl/sksi/corba/corba-utilities.lisp", position = 6989L)
    private static SubLSymbol $corba_connection_property_keywords$;
    private static final SubLObject $const0$CORBAPredicate;
    private static final SubLObject $const1$CORBARemovalPredicate;
    private static final SubLObject $const2$CORBAStoragePredicate;
    private static final SubLSymbol $sym3$CORBA_CONNECTION_P;
    private static final SubLObject $const4$TheCORBAInitialObject;
    private static final SubLObject $const5$CORBAObjectFn;
    private static final SubLSymbol $sym6$EL_LIST_P;
    private static final SubLSymbol $sym7$LISTP;
    private static final SubLSymbol $sym8$CORBA_CONNECTION;
    private static final SubLList $list9;
    private static final SubLList $list10;
    private static final SubLList $list11;
    private static final SubLList $list12;
    private static final SubLSymbol $sym13$CORBA_CONNECTION_INT_PRINT;
    private static final SubLSymbol $sym14$CORBA_CONNECTION_PRINT_FUNCTION_TRAMPOLINE;
    private static final SubLList $list15;
    private static final SubLSymbol $sym16$CORBA_CONNECTION_INT_STREAM;
    private static final SubLSymbol $sym17$_CSETF_CORBA_CONNECTION_INT_STREAM;
    private static final SubLSymbol $sym18$CORBA_CONNECTION_INT_PROPERTIES;
    private static final SubLSymbol $sym19$_CSETF_CORBA_CONNECTION_INT_PROPERTIES;
    private static final SubLSymbol $sym20$CORBA_CONNECTION_INT_INITIAL_OBJECT_ID;
    private static final SubLSymbol $sym21$_CSETF_CORBA_CONNECTION_INT_INITIAL_OBJECT_ID;
    private static final SubLSymbol $sym22$CORBA_CONNECTION_INT_HISTORY;
    private static final SubLSymbol $sym23$_CSETF_CORBA_CONNECTION_INT_HISTORY;
    private static final SubLSymbol $sym24$CORBA_CONNECTION_INT_ERROR_HANDLING;
    private static final SubLSymbol $sym25$_CSETF_CORBA_CONNECTION_INT_ERROR_HANDLING;
    private static final SubLSymbol $kw26$STREAM;
    private static final SubLSymbol $kw27$PROPERTIES;
    private static final SubLSymbol $kw28$INITIAL_OBJECT_ID;
    private static final SubLSymbol $kw29$HISTORY;
    private static final SubLSymbol $kw30$ERROR_HANDLING;
    private static final SubLString $str31$Invalid_slot__S_for_construction_;
    private static final SubLSymbol $kw32$BEGIN;
    private static final SubLSymbol $sym33$MAKE_CORBA_CONNECTION;
    private static final SubLSymbol $kw34$SLOT;
    private static final SubLSymbol $kw35$END;
    private static final SubLSymbol $sym36$VISIT_DEFSTRUCT_OBJECT_CORBA_CONNECTION_METHOD;
    private static final SubLString $str37$__CORBA_CONNECTION_;
    private static final SubLString $str38$_streamless;
    private static final SubLString $str39$_open;
    private static final SubLString $str40$_closed;
    private static final SubLString $str41$_;
    private static final SubLInteger $int42$900;
    private static final SubLSymbol $kw43$PRIVATE;
    private static final SubLSymbol $kw44$NEW_CONNECTION;
    private static final SubLString $str45$corba_connection_timeout;
    private static final SubLString $str46$corba_transaction_timeout;
    private static final SubLString $str47$_A;
    private static final SubLString $str48$corba_server_not_found;
    private static final SubLList $list49;
    private static final SubLSymbol $sym50$STREAMP;
    private static final SubLSymbol $sym51$KEYWORDP;
    private static final SubLSymbol $kw52$INVALID;
    private static final SubLSymbol $kw53$PUBLIC;
    private static final SubLString $str54$CORBA_connection_being_reopened_;
    private static final SubLSymbol $kw55$PROXY_HOST;
    private static final SubLSymbol $kw56$PROXY_PORT;
    private static final SubLSymbol $kw57$CLOSE_CONNECTION;
    private static final SubLSymbol $sym58$CORBA_CONNECTION_OPEN_P;
    private static final SubLSymbol $kw59$SHUTDOWN_CONNECTION;
    private static final SubLString $str60$corba_result_error___A;
    private static final SubLString $str61$attempt_to_use_corba_connection_p;
    private static final SubLString $str62$connection_timeout;
    private static final SubLString $str63$transaction_timeout;
    private static final SubLString $str64$corba_eval_send_error___A;
    private static final SubLString $str65$corba_eval_receive_error___A;
    private static final SubLSymbol $sym66$STRINGP;
    private static final SubLSymbol $kw67$ERROR;
    private static final SubLSymbol $kw68$VERIFY_CONNECTION;
    private static final SubLSymbol $kw69$NULL;
    private static final SubLString $str70$CORBA_server_has_been_restarted__;
    private static final SubLSymbol $sym71$CATCH_ERROR_MESSAGE_HANDLER;
    private static final SubLString $str72$continue;
    
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/corba/corba-utilities.lisp", position = 1114L)
    public static SubLObject get_corba_predicates() {
        if (corba_utilities.NIL == corba_utilities.$corba_predicates$.getGlobalValue()) {
            corba_utilities.$corba_predicates$.setGlobalValue(isa.all_fort_instances_in_all_mts(corba_utilities.$const0$CORBAPredicate));
        }
        return corba_utilities.$corba_predicates$.getGlobalValue();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/corba/corba-utilities.lisp", position = 1296L)
    public static SubLObject corba_predicate_p(final SubLObject v_object) {
        return subl_promotions.memberP(v_object, get_corba_predicates(), (SubLObject)corba_utilities.UNPROVIDED, (SubLObject)corba_utilities.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/corba/corba-utilities.lisp", position = 1444L)
    public static SubLObject get_corba_removal_predicates() {
        if (corba_utilities.NIL == corba_utilities.$corba_removal_predicates$.getGlobalValue()) {
            corba_utilities.$corba_removal_predicates$.setGlobalValue(isa.all_fort_instances_in_all_mts(corba_utilities.$const1$CORBARemovalPredicate));
        }
        return corba_utilities.$corba_removal_predicates$.getGlobalValue();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/corba/corba-utilities.lisp", position = 1665L)
    public static SubLObject corba_removal_predicate_p(final SubLObject v_object) {
        return subl_promotions.memberP(v_object, get_corba_removal_predicates(), (SubLObject)corba_utilities.UNPROVIDED, (SubLObject)corba_utilities.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/corba/corba-utilities.lisp", position = 1829L)
    public static SubLObject get_corba_storage_predicates() {
        if (corba_utilities.NIL == corba_utilities.$corba_storage_predicates$.getGlobalValue()) {
            corba_utilities.$corba_storage_predicates$.setGlobalValue(isa.all_fort_instances_in_all_mts(corba_utilities.$const2$CORBAStoragePredicate));
        }
        return corba_utilities.$corba_storage_predicates$.getGlobalValue();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/corba/corba-utilities.lisp", position = 2050L)
    public static SubLObject corba_storage_predicate_p(final SubLObject v_object) {
        return subl_promotions.memberP(v_object, get_corba_storage_predicates(), (SubLObject)corba_utilities.UNPROVIDED, (SubLObject)corba_utilities.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/corba/corba-utilities.lisp", position = 2161L)
    public static SubLObject clear_corba_caches() {
        corba_utilities.$corba_predicates$.setGlobalValue((SubLObject)corba_utilities.NIL);
        corba_utilities.$corba_removal_predicates$.setGlobalValue((SubLObject)corba_utilities.NIL);
        corba_utilities.$corba_storage_predicates$.setGlobalValue((SubLObject)corba_utilities.NIL);
        corba_module_utilities.$corba_connections_by_sks$.setGlobalValue((SubLObject)corba_utilities.NIL);
        return (SubLObject)corba_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/corba/corba-utilities.lisp", position = 2453L)
    public static SubLObject corba_object_id_from_object(final SubLObject v_object, final SubLObject corba_connection) {
        if (corba_utilities.NIL != corba_connection && !corba_utilities.assertionsDisabledInClass && corba_utilities.NIL == corba_connection_p(corba_connection)) {
            throw new AssertionError(corba_connection);
        }
        if (v_object.eql(corba_utilities.$const4$TheCORBAInitialObject)) {
            return corba_connection_get_initial_object_id(corba_connection);
        }
        if (v_object.isList() && corba_utilities.$const5$CORBAObjectFn.equal(v_object.first())) {
            return conses_high.second(v_object);
        }
        return v_object;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/corba/corba-utilities.lisp", position = 2949L)
    public static SubLObject corba_object_from_object_id(final SubLObject object_id, final SubLObject corba_connection) {
        if (corba_utilities.NIL != corba_connection && !corba_utilities.assertionsDisabledInClass && corba_utilities.NIL == corba_connection_p(corba_connection)) {
            throw new AssertionError(corba_connection);
        }
        final SubLObject initial_object_id = corba_connection_get_initial_object_id(corba_connection);
        if (object_id.equal(initial_object_id)) {
            return corba_utilities.$const4$TheCORBAInitialObject;
        }
        return (SubLObject)ConsesLow.list(corba_utilities.$const5$CORBAObjectFn, object_id);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/corba/corba-utilities.lisp", position = 3322L)
    public static SubLObject corba_object_id_ify_list(final SubLObject el_list, final SubLObject corba_connection) {
        assert corba_utilities.NIL != el_utilities.el_list_p(el_list) : el_list;
        if (corba_utilities.NIL != el_utilities.el_empty_list_p(el_list)) {
            return (SubLObject)corba_utilities.NIL;
        }
        final SubLObject list = el_utilities.el_list_items(el_list);
        SubLObject result = (SubLObject)corba_utilities.NIL;
        SubLObject cdolist_list_var = list;
        SubLObject item = (SubLObject)corba_utilities.NIL;
        item = cdolist_list_var.first();
        while (corba_utilities.NIL != cdolist_list_var) {
            result = (SubLObject)ConsesLow.cons(corba_object_id_from_object(item, corba_connection), result);
            cdolist_list_var = cdolist_list_var.rest();
            item = cdolist_list_var.first();
        }
        return Sequences.nreverse(result);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/corba/corba-utilities.lisp", position = 3694L)
    public static SubLObject corba_encode_object(final SubLObject v_object, final SubLObject corba_connection) {
        assert corba_utilities.NIL != corba_connection_p(corba_connection) : corba_connection;
        if (corba_utilities.NIL != el_utilities.el_list_p(v_object)) {
            return corba_object_id_ify_list(v_object, corba_connection);
        }
        return corba_object_id_from_object(v_object, corba_connection);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/corba/corba-utilities.lisp", position = 3980L)
    public static SubLObject corba_encode_list(final SubLObject list, final SubLObject corba_connection) {
        assert corba_utilities.NIL != Types.listp(list) : list;
        assert corba_utilities.NIL != corba_connection_p(corba_connection) : corba_connection;
        SubLObject result = (SubLObject)corba_utilities.NIL;
        SubLObject cdolist_list_var = list;
        SubLObject elem = (SubLObject)corba_utilities.NIL;
        elem = cdolist_list_var.first();
        while (corba_utilities.NIL != cdolist_list_var) {
            result = (SubLObject)ConsesLow.cons(corba_encode_object(elem, corba_connection), result);
            cdolist_list_var = cdolist_list_var.rest();
            elem = cdolist_list_var.first();
        }
        return Sequences.nreverse(result);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/corba/corba-utilities.lisp", position = 4635L)
    public static SubLObject corba_connection_print_function_trampoline(final SubLObject v_object, final SubLObject stream) {
        corba_connection_int_print(v_object, stream, (SubLObject)corba_utilities.ZERO_INTEGER);
        return (SubLObject)corba_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/corba/corba-utilities.lisp", position = 4635L)
    public static SubLObject corba_connection_p(final SubLObject v_object) {
        return (SubLObject)((v_object.getClass() == $corba_connection_native.class) ? corba_utilities.T : corba_utilities.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/corba/corba-utilities.lisp", position = 4635L)
    public static SubLObject corba_connection_int_stream(final SubLObject v_object) {
        assert corba_utilities.NIL != corba_connection_p(v_object) : v_object;
        return v_object.getField2();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/corba/corba-utilities.lisp", position = 4635L)
    public static SubLObject corba_connection_int_properties(final SubLObject v_object) {
        assert corba_utilities.NIL != corba_connection_p(v_object) : v_object;
        return v_object.getField3();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/corba/corba-utilities.lisp", position = 4635L)
    public static SubLObject corba_connection_int_initial_object_id(final SubLObject v_object) {
        assert corba_utilities.NIL != corba_connection_p(v_object) : v_object;
        return v_object.getField4();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/corba/corba-utilities.lisp", position = 4635L)
    public static SubLObject corba_connection_int_history(final SubLObject v_object) {
        assert corba_utilities.NIL != corba_connection_p(v_object) : v_object;
        return v_object.getField5();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/corba/corba-utilities.lisp", position = 4635L)
    public static SubLObject corba_connection_int_error_handling(final SubLObject v_object) {
        assert corba_utilities.NIL != corba_connection_p(v_object) : v_object;
        return v_object.getField6();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/corba/corba-utilities.lisp", position = 4635L)
    public static SubLObject _csetf_corba_connection_int_stream(final SubLObject v_object, final SubLObject value) {
        assert corba_utilities.NIL != corba_connection_p(v_object) : v_object;
        return v_object.setField2(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/corba/corba-utilities.lisp", position = 4635L)
    public static SubLObject _csetf_corba_connection_int_properties(final SubLObject v_object, final SubLObject value) {
        assert corba_utilities.NIL != corba_connection_p(v_object) : v_object;
        return v_object.setField3(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/corba/corba-utilities.lisp", position = 4635L)
    public static SubLObject _csetf_corba_connection_int_initial_object_id(final SubLObject v_object, final SubLObject value) {
        assert corba_utilities.NIL != corba_connection_p(v_object) : v_object;
        return v_object.setField4(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/corba/corba-utilities.lisp", position = 4635L)
    public static SubLObject _csetf_corba_connection_int_history(final SubLObject v_object, final SubLObject value) {
        assert corba_utilities.NIL != corba_connection_p(v_object) : v_object;
        return v_object.setField5(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/corba/corba-utilities.lisp", position = 4635L)
    public static SubLObject _csetf_corba_connection_int_error_handling(final SubLObject v_object, final SubLObject value) {
        assert corba_utilities.NIL != corba_connection_p(v_object) : v_object;
        return v_object.setField6(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/corba/corba-utilities.lisp", position = 4635L)
    public static SubLObject make_corba_connection(SubLObject arglist) {
        if (arglist == corba_utilities.UNPROVIDED) {
            arglist = (SubLObject)corba_utilities.NIL;
        }
        final SubLObject v_new = (SubLObject)new $corba_connection_native();
        SubLObject next;
        SubLObject current_arg;
        SubLObject current_value;
        SubLObject pcase_var;
        for (next = (SubLObject)corba_utilities.NIL, next = arglist; corba_utilities.NIL != next; next = conses_high.cddr(next)) {
            current_arg = next.first();
            current_value = conses_high.cadr(next);
            pcase_var = current_arg;
            if (pcase_var.eql((SubLObject)corba_utilities.$kw26$STREAM)) {
                _csetf_corba_connection_int_stream(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)corba_utilities.$kw27$PROPERTIES)) {
                _csetf_corba_connection_int_properties(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)corba_utilities.$kw28$INITIAL_OBJECT_ID)) {
                _csetf_corba_connection_int_initial_object_id(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)corba_utilities.$kw29$HISTORY)) {
                _csetf_corba_connection_int_history(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)corba_utilities.$kw30$ERROR_HANDLING)) {
                _csetf_corba_connection_int_error_handling(v_new, current_value);
            }
            else {
                Errors.error((SubLObject)corba_utilities.$str31$Invalid_slot__S_for_construction_, current_arg);
            }
        }
        return v_new;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/corba/corba-utilities.lisp", position = 4635L)
    public static SubLObject visit_defstruct_corba_connection(final SubLObject obj, final SubLObject visitor_fn) {
        Functions.funcall(visitor_fn, obj, (SubLObject)corba_utilities.$kw32$BEGIN, (SubLObject)corba_utilities.$sym33$MAKE_CORBA_CONNECTION, (SubLObject)corba_utilities.FIVE_INTEGER);
        Functions.funcall(visitor_fn, obj, (SubLObject)corba_utilities.$kw34$SLOT, (SubLObject)corba_utilities.$kw26$STREAM, corba_connection_int_stream(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)corba_utilities.$kw34$SLOT, (SubLObject)corba_utilities.$kw27$PROPERTIES, corba_connection_int_properties(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)corba_utilities.$kw34$SLOT, (SubLObject)corba_utilities.$kw28$INITIAL_OBJECT_ID, corba_connection_int_initial_object_id(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)corba_utilities.$kw34$SLOT, (SubLObject)corba_utilities.$kw29$HISTORY, corba_connection_int_history(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)corba_utilities.$kw34$SLOT, (SubLObject)corba_utilities.$kw30$ERROR_HANDLING, corba_connection_int_error_handling(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)corba_utilities.$kw35$END, (SubLObject)corba_utilities.$sym33$MAKE_CORBA_CONNECTION, (SubLObject)corba_utilities.FIVE_INTEGER);
        return obj;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/corba/corba-utilities.lisp", position = 4635L)
    public static SubLObject visit_defstruct_object_corba_connection_method(final SubLObject obj, final SubLObject visitor_fn) {
        return visit_defstruct_corba_connection(obj, visitor_fn);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/corba/corba-utilities.lisp", position = 4830L)
    public static SubLObject corba_connection_int_print(final SubLObject corba_connection, final SubLObject stream, final SubLObject depth) {
        assert corba_utilities.NIL != corba_connection_p(corba_connection) : corba_connection;
        streams_high.write_string((SubLObject)corba_utilities.$str37$__CORBA_CONNECTION_, stream, (SubLObject)corba_utilities.UNPROVIDED, (SubLObject)corba_utilities.UNPROVIDED);
        print_high.prin1(corba_connection_int_initial_object_id(corba_connection), stream);
        if (!corba_connection_int_stream(corba_connection).isStream()) {
            streams_high.write_string((SubLObject)corba_utilities.$str38$_streamless, stream, (SubLObject)corba_utilities.UNPROVIDED, (SubLObject)corba_utilities.UNPROVIDED);
        }
        else if (corba_utilities.NIL != streams_high.open_stream_p(corba_connection_int_stream(corba_connection))) {
            streams_high.write_string((SubLObject)corba_utilities.$str39$_open, stream, (SubLObject)corba_utilities.UNPROVIDED, (SubLObject)corba_utilities.UNPROVIDED);
        }
        else {
            streams_high.write_string((SubLObject)corba_utilities.$str40$_closed, stream, (SubLObject)corba_utilities.UNPROVIDED, (SubLObject)corba_utilities.UNPROVIDED);
        }
        streams_high.write_string((SubLObject)corba_utilities.$str41$_, stream, (SubLObject)corba_utilities.UNPROVIDED, (SubLObject)corba_utilities.UNPROVIDED);
        return (SubLObject)corba_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/corba/corba-utilities.lisp", position = 5719L)
    public static SubLObject new_corba_connection(final SubLObject corba_connection_properties) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject corba_connection = make_corba_connection((SubLObject)ConsesLow.list((SubLObject)corba_utilities.$kw27$PROPERTIES, corba_connection_properties));
        SubLObject connection_timed_outP = (SubLObject)corba_utilities.T;
        SubLObject transaction_timed_outP = (SubLObject)corba_utilities.T;
        SubLObject corba_result = (SubLObject)corba_utilities.NIL;
        SubLObject transaction_timed_out = (SubLObject)corba_utilities.NIL;
        final SubLObject tag = subl_macro_promotions.with_timeout_make_tag();
        try {
            thread.throwStack.push(tag);
            final SubLObject _prev_bind_0 = subl_macro_promotions.$within_with_timeout$.currentBinding(thread);
            try {
                subl_macro_promotions.$within_with_timeout$.bind((SubLObject)corba_utilities.T, thread);
                SubLObject timer = (SubLObject)corba_utilities.NIL;
                try {
                    final SubLObject _prev_bind_0_$1 = subl_macro_promotions.$with_timeout_nesting_depth$.currentBinding(thread);
                    try {
                        subl_macro_promotions.$with_timeout_nesting_depth$.bind(Numbers.add((SubLObject)corba_utilities.ONE_INTEGER, subl_macro_promotions.$with_timeout_nesting_depth$.getDynamicValue(thread)), thread);
                        timer = subl_macro_promotions.with_timeout_start_timer(corba_utilities.$corba_connection_transaction_timeout$.getDynamicValue(thread), tag);
                        try {
                            if (corba_utilities.NIL != corba_connection_open(corba_connection, corba_utilities.$corba_connection_open_connection_timeout$.getDynamicValue(thread), (SubLObject)corba_utilities.$kw43$PRIVATE)) {
                                connection_timed_outP = (SubLObject)corba_utilities.NIL;
                                corba_result = corba_connection_eval_encoded_int(corba_connection, (SubLObject)ConsesLow.list((SubLObject)corba_utilities.$kw44$NEW_CONNECTION, corba_connection_properties));
                                transaction_timed_outP = (SubLObject)corba_utilities.NIL;
                            }
                        }
                        finally {
                            final SubLObject _prev_bind_0_$2 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)corba_utilities.T, thread);
                                final SubLObject _values = Values.getValuesAsVector();
                                if (corba_utilities.NIL != corba_connection_open_p(corba_connection)) {
                                    corba_connection_close(corba_connection);
                                }
                                Values.restoreValuesFromVector(_values);
                            }
                            finally {
                                Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$2, thread);
                            }
                        }
                    }
                    finally {
                        subl_macro_promotions.$with_timeout_nesting_depth$.rebind(_prev_bind_0_$1, thread);
                    }
                }
                finally {
                    final SubLObject _prev_bind_0_$3 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                    try {
                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)corba_utilities.T, thread);
                        final SubLObject _values2 = Values.getValuesAsVector();
                        subl_macro_promotions.with_timeout_stop_timer(timer);
                        Values.restoreValuesFromVector(_values2);
                    }
                    finally {
                        Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$3, thread);
                    }
                }
            }
            finally {
                subl_macro_promotions.$within_with_timeout$.rebind(_prev_bind_0, thread);
            }
        }
        catch (Throwable ccatch_env_var) {
            transaction_timed_out = Errors.handleThrowable(ccatch_env_var, tag);
        }
        finally {
            thread.throwStack.pop();
        }
        if (corba_utilities.NIL != connection_timed_outP) {
            return Errors.error((SubLObject)corba_utilities.$str45$corba_connection_timeout);
        }
        if (corba_utilities.NIL != transaction_timed_outP) {
            return Errors.error((SubLObject)corba_utilities.$str46$corba_transaction_timeout);
        }
        if (corba_utilities.NIL != corba_connection_eval_errorP(corba_result)) {
            return Errors.error((SubLObject)corba_utilities.$str47$_A, corba_connection_eval_error_get_string(corba_result));
        }
        if (!corba_result.isInteger()) {
            return Errors.error((SubLObject)corba_utilities.$str48$corba_server_not_found);
        }
        corba_connection_set_initial_object_id(corba_connection, corba_result);
        return corba_connection;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/corba/corba-utilities.lisp", position = 7364L)
    public static SubLObject corba_connection_set_stream(final SubLObject corba_connection, final SubLObject stream) {
        assert corba_utilities.NIL != corba_connection_p(corba_connection) : corba_connection;
        if (corba_utilities.NIL != stream && !corba_utilities.assertionsDisabledInClass && corba_utilities.NIL == Types.streamp(stream)) {
            throw new AssertionError(stream);
        }
        _csetf_corba_connection_int_stream(corba_connection, stream);
        return stream;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/corba/corba-utilities.lisp", position = 7728L)
    public static SubLObject corba_connection_get_stream(final SubLObject corba_connection) {
        assert corba_utilities.NIL != corba_connection_p(corba_connection) : corba_connection;
        return corba_connection_int_stream(corba_connection);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/corba/corba-utilities.lisp", position = 7898L)
    public static SubLObject corba_connection_set_initial_object_id(final SubLObject corba_connection, final SubLObject initial_object_id) {
        assert corba_utilities.NIL != corba_connection_p(corba_connection) : corba_connection;
        _csetf_corba_connection_int_initial_object_id(corba_connection, initial_object_id);
        return initial_object_id;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/corba/corba-utilities.lisp", position = 8154L)
    public static SubLObject corba_connection_get_initial_object_id(final SubLObject corba_connection) {
        assert corba_utilities.NIL != corba_connection_p(corba_connection) : corba_connection;
        return corba_connection_int_initial_object_id(corba_connection);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/corba/corba-utilities.lisp", position = 8346L)
    public static SubLObject corba_connection_get_properties(final SubLObject corba_connection) {
        return corba_connection_int_properties(corba_connection);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/corba/corba-utilities.lisp", position = 8545L)
    public static SubLObject corba_connection_set_property(final SubLObject corba_connection, final SubLObject property, final SubLObject value) {
        assert corba_utilities.NIL != corba_connection_p(corba_connection) : corba_connection;
        assert corba_utilities.NIL != Types.keywordp(property) : property;
        return conses_high.putf(corba_connection_int_properties(corba_connection), property, value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/corba/corba-utilities.lisp", position = 8791L)
    public static SubLObject corba_connection_get_property(final SubLObject corba_connection, final SubLObject property) {
        assert corba_utilities.NIL != corba_connection_p(corba_connection) : corba_connection;
        assert corba_utilities.NIL != Types.keywordp(property) : property;
        return conses_high.getf(corba_connection_int_properties(corba_connection), property, (SubLObject)corba_utilities.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/corba/corba-utilities.lisp", position = 9025L)
    public static SubLObject corba_connection_rem_property(final SubLObject corba_connection, final SubLObject property) {
        assert corba_utilities.NIL != corba_connection_p(corba_connection) : corba_connection;
        assert corba_utilities.NIL != Types.keywordp(property) : property;
        return conses_high.remf(corba_connection_int_properties(corba_connection), property);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/corba/corba-utilities.lisp", position = 9259L)
    public static SubLObject corba_connection_set_invalid(final SubLObject corba_connection, final SubLObject invalidP) {
        return corba_connection_set_property(corba_connection, (SubLObject)corba_utilities.$kw52$INVALID, invalidP);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/corba/corba-utilities.lisp", position = 9408L)
    public static SubLObject corba_connection_invalidP(final SubLObject corba_connection) {
        return corba_connection_get_property(corba_connection, (SubLObject)corba_utilities.$kw52$INVALID);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/corba/corba-utilities.lisp", position = 9536L)
    public static SubLObject corba_connection_open(final SubLObject corba_connection, SubLObject connection_timeout, SubLObject access_mode) {
        if (connection_timeout == corba_utilities.UNPROVIDED) {
            connection_timeout = (SubLObject)corba_utilities.NIL;
        }
        if (access_mode == corba_utilities.UNPROVIDED) {
            access_mode = (SubLObject)corba_utilities.$kw53$PUBLIC;
        }
        assert corba_utilities.NIL != corba_connection_p(corba_connection) : corba_connection;
        if (corba_utilities.NIL != corba_connection_open_p(corba_connection)) {
            Errors.warn((SubLObject)corba_utilities.$str54$CORBA_connection_being_reopened_);
        }
        final SubLObject proxy_host = corba_connection_get_property(corba_connection, (SubLObject)corba_utilities.$kw55$PROXY_HOST);
        final SubLObject proxy_port = corba_connection_get_property(corba_connection, (SubLObject)corba_utilities.$kw56$PROXY_PORT);
        final SubLObject stream = subl_promotions.open_tcp_stream_with_timeout(proxy_host, proxy_port, connection_timeout, access_mode);
        if (corba_utilities.NIL == stream) {
            return (SubLObject)corba_utilities.NIL;
        }
        corba_connection_set_stream(corba_connection, stream);
        return stream;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/corba/corba-utilities.lisp", position = 10476L)
    public static SubLObject corba_connection_close(final SubLObject corba_connection) {
        assert corba_utilities.NIL != corba_connection_p(corba_connection) : corba_connection;
        if (corba_utilities.NIL == corba_connection_open_p(corba_connection)) {
            return (SubLObject)corba_utilities.NIL;
        }
        final SubLObject corba_form = (SubLObject)ConsesLow.list((SubLObject)corba_utilities.$kw57$CLOSE_CONNECTION);
        SubLObject send_response = (SubLObject)corba_utilities.NIL;
        send_response = corba_connection_send(corba_connection, corba_form);
        final SubLObject stream = corba_connection_get_stream(corba_connection);
        streams_high.close(stream, (SubLObject)corba_utilities.UNPROVIDED);
        return send_response;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/corba/corba-utilities.lisp", position = 10982L)
    public static SubLObject corba_connection_shutdown(final SubLObject corba_connection) {
        assert corba_utilities.NIL != corba_connection_open_p(corba_connection) : corba_connection;
        final SubLObject initial_object_id = corba_connection_get_initial_object_id(corba_connection);
        if (corba_utilities.NIL != initial_object_id) {
            final SubLObject corba_form = (SubLObject)ConsesLow.list((SubLObject)corba_utilities.$kw59$SHUTDOWN_CONNECTION, initial_object_id);
            SubLObject send_response = (SubLObject)corba_utilities.NIL;
            send_response = corba_connection_send(corba_connection, corba_form);
            final SubLObject stream = corba_connection_get_stream(corba_connection);
            streams_high.close(stream, (SubLObject)corba_utilities.UNPROVIDED);
            return send_response;
        }
        return (SubLObject)corba_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/corba/corba-utilities.lisp", position = 11615L)
    public static SubLObject corba_connection_open_p(final SubLObject corba_connection) {
        assert corba_utilities.NIL != corba_connection_p(corba_connection) : corba_connection;
        final SubLObject stream = corba_connection_get_stream(corba_connection);
        return (SubLObject)SubLObjectFactory.makeBoolean(stream.isStream() && corba_utilities.NIL != streams_high.open_stream_p(stream));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/corba/corba-utilities.lisp", position = 11861L)
    public static SubLObject corba_connection_eval(final SubLObject corba_connection, final SubLObject corba_predicate, final SubLObject args) {
        assert corba_utilities.NIL != corba_connection_p(corba_connection) : corba_connection;
        assert corba_utilities.NIL != Types.listp(args) : args;
        final SubLObject corba_fn = corba_module_utilities.make_corba_gateway_keyword(corba_predicate);
        final SubLObject encoded_args = corba_encode_list(args, corba_connection);
        SubLObject result = corba_connection_eval_encoded(corba_connection, (SubLObject)ConsesLow.cons(corba_fn, encoded_args));
        if (corba_utilities.NIL != corba_connection_eval_errorP(result)) {
            Errors.error((SubLObject)corba_utilities.$str60$corba_result_error___A, result);
        }
        if (corba_utilities.NIL != corba_module_utilities.corba_predicate_returns_objectP(corba_predicate)) {
            result = corba_object_from_object_id(result, corba_connection);
        }
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/corba/corba-utilities.lisp", position = 12536L)
    public static SubLObject corba_connection_eval_encoded(final SubLObject corba_connection, final SubLObject encoded_corba_form) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert corba_utilities.NIL != corba_connection_p(corba_connection) : corba_connection;
        if (corba_utilities.NIL != corba_connection_open_p(corba_connection)) {
            Errors.warn((SubLObject)corba_utilities.$str61$attempt_to_use_corba_connection_p);
            return corba_connection_eval_encoded(corba_connection_clone(corba_connection), encoded_corba_form);
        }
        SubLObject connection_timed_outP = (SubLObject)corba_utilities.T;
        SubLObject transaction_timed_outP = (SubLObject)corba_utilities.T;
        SubLObject result = (SubLObject)corba_utilities.NIL;
        SubLObject transaction_timed_out = (SubLObject)corba_utilities.NIL;
        final SubLObject tag = subl_macro_promotions.with_timeout_make_tag();
        try {
            thread.throwStack.push(tag);
            final SubLObject _prev_bind_0 = subl_macro_promotions.$within_with_timeout$.currentBinding(thread);
            try {
                subl_macro_promotions.$within_with_timeout$.bind((SubLObject)corba_utilities.T, thread);
                SubLObject timer = (SubLObject)corba_utilities.NIL;
                try {
                    final SubLObject _prev_bind_0_$4 = subl_macro_promotions.$with_timeout_nesting_depth$.currentBinding(thread);
                    try {
                        subl_macro_promotions.$with_timeout_nesting_depth$.bind(Numbers.add((SubLObject)corba_utilities.ONE_INTEGER, subl_macro_promotions.$with_timeout_nesting_depth$.getDynamicValue(thread)), thread);
                        timer = subl_macro_promotions.with_timeout_start_timer(corba_utilities.$corba_connection_transaction_timeout$.getDynamicValue(thread), tag);
                        try {
                            if (corba_utilities.NIL != corba_connection_open(corba_connection, corba_utilities.$corba_connection_open_connection_timeout$.getDynamicValue(thread), (SubLObject)corba_utilities.$kw53$PUBLIC)) {
                                connection_timed_outP = (SubLObject)corba_utilities.NIL;
                                corba_connection_verify(corba_connection);
                                result = corba_connection_eval_encoded_int(corba_connection, encoded_corba_form);
                                transaction_timed_outP = (SubLObject)corba_utilities.NIL;
                            }
                        }
                        finally {
                            final SubLObject _prev_bind_0_$5 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)corba_utilities.T, thread);
                                final SubLObject _values = Values.getValuesAsVector();
                                if (corba_utilities.NIL != corba_connection_open_p(corba_connection)) {
                                    corba_connection_close(corba_connection);
                                }
                                Values.restoreValuesFromVector(_values);
                            }
                            finally {
                                Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$5, thread);
                            }
                        }
                    }
                    finally {
                        subl_macro_promotions.$with_timeout_nesting_depth$.rebind(_prev_bind_0_$4, thread);
                    }
                }
                finally {
                    final SubLObject _prev_bind_0_$6 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                    try {
                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)corba_utilities.T, thread);
                        final SubLObject _values2 = Values.getValuesAsVector();
                        subl_macro_promotions.with_timeout_stop_timer(timer);
                        Values.restoreValuesFromVector(_values2);
                    }
                    finally {
                        Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$6, thread);
                    }
                }
            }
            finally {
                subl_macro_promotions.$within_with_timeout$.rebind(_prev_bind_0, thread);
            }
        }
        catch (Throwable ccatch_env_var) {
            transaction_timed_out = Errors.handleThrowable(ccatch_env_var, tag);
        }
        finally {
            thread.throwStack.pop();
        }
        if (corba_utilities.NIL != connection_timed_outP) {
            result = new_corba_connection_eval_error((SubLObject)corba_utilities.$str62$connection_timeout);
        }
        if (corba_utilities.NIL != transaction_timed_outP) {
            result = new_corba_connection_eval_error((SubLObject)corba_utilities.$str63$transaction_timeout);
        }
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/corba/corba-utilities.lisp", position = 13691L)
    public static SubLObject corba_connection_eval_encoded_int(final SubLObject corba_connection, final SubLObject encoded_corba_form) {
        SubLObject send_response = (SubLObject)corba_utilities.NIL;
        SubLObject receive_response = (SubLObject)corba_utilities.NIL;
        send_response = corba_connection_send(corba_connection, encoded_corba_form);
        if (corba_utilities.NIL != corba_connection_eval_errorP(send_response)) {
            Errors.error((SubLObject)corba_utilities.$str64$corba_eval_send_error___A, send_response);
        }
        receive_response = corba_connection_receive(corba_connection);
        if (corba_utilities.NIL != corba_connection_eval_errorP(receive_response)) {
            Errors.error((SubLObject)corba_utilities.$str65$corba_eval_receive_error___A, receive_response);
        }
        return receive_response;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/corba/corba-utilities.lisp", position = 14303L)
    public static SubLObject new_corba_connection_eval_error(final SubLObject error_string) {
        assert corba_utilities.NIL != Types.stringp(error_string) : error_string;
        return (SubLObject)ConsesLow.list((SubLObject)corba_utilities.$kw67$ERROR, error_string);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/corba/corba-utilities.lisp", position = 14480L)
    public static SubLObject corba_connection_eval_errorP(final SubLObject corba_connection_eval_result) {
        if (corba_connection_eval_result.isList() && corba_connection_eval_result.first() == corba_utilities.$kw67$ERROR) {
            return (SubLObject)corba_utilities.T;
        }
        return (SubLObject)corba_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/corba/corba-utilities.lisp", position = 14697L)
    public static SubLObject corba_connection_eval_error_get_string(final SubLObject corba_connection_eval_error) {
        if (corba_utilities.NIL != corba_connection_eval_errorP(corba_connection_eval_error)) {
            return conses_high.second(corba_connection_eval_error);
        }
        return (SubLObject)corba_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/corba/corba-utilities.lisp", position = 14914L)
    public static SubLObject corba_connection_verify(final SubLObject corba_connection) {
        assert corba_utilities.NIL != corba_connection_open_p(corba_connection) : corba_connection;
        if (corba_utilities.NIL == corba_connection_get_initial_object_id(corba_connection)) {
            return (SubLObject)corba_utilities.NIL;
        }
        final SubLObject result = corba_connection_eval_encoded_int(corba_connection, (SubLObject)ConsesLow.list((SubLObject)corba_utilities.$kw68$VERIFY_CONNECTION, corba_connection_get_initial_object_id(corba_connection)));
        if (result == corba_utilities.$kw69$NULL) {
            corba_connection_set_invalid(corba_connection, (SubLObject)corba_utilities.T);
            Errors.warn((SubLObject)corba_utilities.$str70$CORBA_server_has_been_restarted__);
            clear_corba_caches();
            corba_connection_set_initial_object_id(corba_connection, (SubLObject)corba_utilities.NIL);
            return (SubLObject)corba_utilities.NIL;
        }
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/corba/corba-utilities.lisp", position = 15826L)
    public static SubLObject corba_connection_clone(final SubLObject corba_connection) {
        return new_corba_connection(corba_connection_get_properties(corba_connection));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/corba/corba-utilities.lisp", position = 15968L)
    public static SubLObject corba_connection_send(final SubLObject corba_connection, final SubLObject form) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert corba_utilities.NIL != corba_connection_open_p(corba_connection) : corba_connection;
        SubLObject error_message = (SubLObject)corba_utilities.NIL;
        final SubLObject response = (SubLObject)corba_utilities.NIL;
        try {
            thread.throwStack.push(subl_macro_promotions.$catch_error_message_target$.getGlobalValue());
            final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
            try {
                Errors.$error_handler$.bind((SubLObject)corba_utilities.$sym71$CATCH_ERROR_MESSAGE_HANDLER, thread);
                try {
                    cfasl.cfasl_output(form, corba_connection_get_stream(corba_connection));
                    streams_high.force_output(corba_connection_get_stream(corba_connection));
                }
                catch (Throwable catch_var) {
                    Errors.handleThrowable(catch_var, (SubLObject)corba_utilities.NIL);
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
        if (corba_utilities.NIL != error_message) {
            Errors.cerror((SubLObject)corba_utilities.$str72$continue, error_message);
        }
        return response;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/corba/corba-utilities.lisp", position = 16395L)
    public static SubLObject corba_connection_receive(final SubLObject corba_connection) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert corba_utilities.NIL != corba_connection_open_p(corba_connection) : corba_connection;
        SubLObject error_message = (SubLObject)corba_utilities.NIL;
        SubLObject response = (SubLObject)corba_utilities.NIL;
        try {
            thread.throwStack.push(subl_macro_promotions.$catch_error_message_target$.getGlobalValue());
            final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
            try {
                Errors.$error_handler$.bind((SubLObject)corba_utilities.$sym71$CATCH_ERROR_MESSAGE_HANDLER, thread);
                try {
                    response = cfasl.cfasl_input(corba_connection_get_stream(corba_connection), (SubLObject)corba_utilities.UNPROVIDED, (SubLObject)corba_utilities.UNPROVIDED);
                }
                catch (Throwable catch_var) {
                    Errors.handleThrowable(catch_var, (SubLObject)corba_utilities.NIL);
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
        if (corba_utilities.NIL != error_message) {
            Errors.cerror((SubLObject)corba_utilities.$str72$continue, error_message);
        }
        return response;
    }
    
    public static SubLObject declare_corba_utilities_file() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.corba.corba_utilities", "get_corba_predicates", "GET-CORBA-PREDICATES", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.corba.corba_utilities", "corba_predicate_p", "CORBA-PREDICATE-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.corba.corba_utilities", "get_corba_removal_predicates", "GET-CORBA-REMOVAL-PREDICATES", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.corba.corba_utilities", "corba_removal_predicate_p", "CORBA-REMOVAL-PREDICATE-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.corba.corba_utilities", "get_corba_storage_predicates", "GET-CORBA-STORAGE-PREDICATES", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.corba.corba_utilities", "corba_storage_predicate_p", "CORBA-STORAGE-PREDICATE-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.corba.corba_utilities", "clear_corba_caches", "CLEAR-CORBA-CACHES", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.corba.corba_utilities", "corba_object_id_from_object", "CORBA-OBJECT-ID-FROM-OBJECT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.corba.corba_utilities", "corba_object_from_object_id", "CORBA-OBJECT-FROM-OBJECT-ID", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.corba.corba_utilities", "corba_object_id_ify_list", "CORBA-OBJECT-ID-IFY-LIST", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.corba.corba_utilities", "corba_encode_object", "CORBA-ENCODE-OBJECT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.corba.corba_utilities", "corba_encode_list", "CORBA-ENCODE-LIST", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.corba.corba_utilities", "corba_connection_print_function_trampoline", "CORBA-CONNECTION-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.corba.corba_utilities", "corba_connection_p", "CORBA-CONNECTION-P", 1, 0, false);
        new $corba_connection_p$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.corba.corba_utilities", "corba_connection_int_stream", "CORBA-CONNECTION-INT-STREAM", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.corba.corba_utilities", "corba_connection_int_properties", "CORBA-CONNECTION-INT-PROPERTIES", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.corba.corba_utilities", "corba_connection_int_initial_object_id", "CORBA-CONNECTION-INT-INITIAL-OBJECT-ID", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.corba.corba_utilities", "corba_connection_int_history", "CORBA-CONNECTION-INT-HISTORY", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.corba.corba_utilities", "corba_connection_int_error_handling", "CORBA-CONNECTION-INT-ERROR-HANDLING", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.corba.corba_utilities", "_csetf_corba_connection_int_stream", "_CSETF-CORBA-CONNECTION-INT-STREAM", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.corba.corba_utilities", "_csetf_corba_connection_int_properties", "_CSETF-CORBA-CONNECTION-INT-PROPERTIES", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.corba.corba_utilities", "_csetf_corba_connection_int_initial_object_id", "_CSETF-CORBA-CONNECTION-INT-INITIAL-OBJECT-ID", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.corba.corba_utilities", "_csetf_corba_connection_int_history", "_CSETF-CORBA-CONNECTION-INT-HISTORY", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.corba.corba_utilities", "_csetf_corba_connection_int_error_handling", "_CSETF-CORBA-CONNECTION-INT-ERROR-HANDLING", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.corba.corba_utilities", "make_corba_connection", "MAKE-CORBA-CONNECTION", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.corba.corba_utilities", "visit_defstruct_corba_connection", "VISIT-DEFSTRUCT-CORBA-CONNECTION", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.corba.corba_utilities", "visit_defstruct_object_corba_connection_method", "VISIT-DEFSTRUCT-OBJECT-CORBA-CONNECTION-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.corba.corba_utilities", "corba_connection_int_print", "CORBA-CONNECTION-INT-PRINT", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.corba.corba_utilities", "new_corba_connection", "NEW-CORBA-CONNECTION", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.corba.corba_utilities", "corba_connection_set_stream", "CORBA-CONNECTION-SET-STREAM", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.corba.corba_utilities", "corba_connection_get_stream", "CORBA-CONNECTION-GET-STREAM", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.corba.corba_utilities", "corba_connection_set_initial_object_id", "CORBA-CONNECTION-SET-INITIAL-OBJECT-ID", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.corba.corba_utilities", "corba_connection_get_initial_object_id", "CORBA-CONNECTION-GET-INITIAL-OBJECT-ID", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.corba.corba_utilities", "corba_connection_get_properties", "CORBA-CONNECTION-GET-PROPERTIES", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.corba.corba_utilities", "corba_connection_set_property", "CORBA-CONNECTION-SET-PROPERTY", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.corba.corba_utilities", "corba_connection_get_property", "CORBA-CONNECTION-GET-PROPERTY", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.corba.corba_utilities", "corba_connection_rem_property", "CORBA-CONNECTION-REM-PROPERTY", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.corba.corba_utilities", "corba_connection_set_invalid", "CORBA-CONNECTION-SET-INVALID", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.corba.corba_utilities", "corba_connection_invalidP", "CORBA-CONNECTION-INVALID?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.corba.corba_utilities", "corba_connection_open", "CORBA-CONNECTION-OPEN", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.corba.corba_utilities", "corba_connection_close", "CORBA-CONNECTION-CLOSE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.corba.corba_utilities", "corba_connection_shutdown", "CORBA-CONNECTION-SHUTDOWN", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.corba.corba_utilities", "corba_connection_open_p", "CORBA-CONNECTION-OPEN-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.corba.corba_utilities", "corba_connection_eval", "CORBA-CONNECTION-EVAL", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.corba.corba_utilities", "corba_connection_eval_encoded", "CORBA-CONNECTION-EVAL-ENCODED", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.corba.corba_utilities", "corba_connection_eval_encoded_int", "CORBA-CONNECTION-EVAL-ENCODED-INT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.corba.corba_utilities", "new_corba_connection_eval_error", "NEW-CORBA-CONNECTION-EVAL-ERROR", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.corba.corba_utilities", "corba_connection_eval_errorP", "CORBA-CONNECTION-EVAL-ERROR?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.corba.corba_utilities", "corba_connection_eval_error_get_string", "CORBA-CONNECTION-EVAL-ERROR-GET-STRING", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.corba.corba_utilities", "corba_connection_verify", "CORBA-CONNECTION-VERIFY", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.corba.corba_utilities", "corba_connection_clone", "CORBA-CONNECTION-CLONE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.corba.corba_utilities", "corba_connection_send", "CORBA-CONNECTION-SEND", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.corba.corba_utilities", "corba_connection_receive", "CORBA-CONNECTION-RECEIVE", 1, 0, false);
        return (SubLObject)corba_utilities.NIL;
    }
    
    public static SubLObject init_corba_utilities_file() {
        corba_utilities.$corba_predicates$ = SubLFiles.deflexical("*CORBA-PREDICATES*", (SubLObject)corba_utilities.NIL);
        corba_utilities.$corba_removal_predicates$ = SubLFiles.deflexical("*CORBA-REMOVAL-PREDICATES*", (SubLObject)corba_utilities.NIL);
        corba_utilities.$corba_storage_predicates$ = SubLFiles.deflexical("*CORBA-STORAGE-PREDICATES*", (SubLObject)corba_utilities.NIL);
        corba_utilities.$dtp_corba_connection$ = SubLFiles.defconstant("*DTP-CORBA-CONNECTION*", (SubLObject)corba_utilities.$sym8$CORBA_CONNECTION);
        corba_utilities.$corba_connection_open_connection_timeout$ = SubLFiles.defvar("*CORBA-CONNECTION-OPEN-CONNECTION-TIMEOUT*", (SubLObject)corba_utilities.TEN_INTEGER);
        corba_utilities.$corba_connection_transaction_timeout$ = SubLFiles.defvar("*CORBA-CONNECTION-TRANSACTION-TIMEOUT*", (SubLObject)corba_utilities.$int42$900);
        corba_utilities.$corba_connection_property_keywords$ = SubLFiles.deflexical("*CORBA-CONNECTION-PROPERTY-KEYWORDS*", (SubLObject)corba_utilities.$list49);
        return (SubLObject)corba_utilities.NIL;
    }
    
    public static SubLObject setup_corba_utilities_file() {
        Structures.register_method(print_high.$print_object_method_table$.getGlobalValue(), corba_utilities.$dtp_corba_connection$.getGlobalValue(), Symbols.symbol_function((SubLObject)corba_utilities.$sym14$CORBA_CONNECTION_PRINT_FUNCTION_TRAMPOLINE));
        SubLSpecialOperatorDeclarations.proclaim((SubLObject)corba_utilities.$list15);
        Structures.def_csetf((SubLObject)corba_utilities.$sym16$CORBA_CONNECTION_INT_STREAM, (SubLObject)corba_utilities.$sym17$_CSETF_CORBA_CONNECTION_INT_STREAM);
        Structures.def_csetf((SubLObject)corba_utilities.$sym18$CORBA_CONNECTION_INT_PROPERTIES, (SubLObject)corba_utilities.$sym19$_CSETF_CORBA_CONNECTION_INT_PROPERTIES);
        Structures.def_csetf((SubLObject)corba_utilities.$sym20$CORBA_CONNECTION_INT_INITIAL_OBJECT_ID, (SubLObject)corba_utilities.$sym21$_CSETF_CORBA_CONNECTION_INT_INITIAL_OBJECT_ID);
        Structures.def_csetf((SubLObject)corba_utilities.$sym22$CORBA_CONNECTION_INT_HISTORY, (SubLObject)corba_utilities.$sym23$_CSETF_CORBA_CONNECTION_INT_HISTORY);
        Structures.def_csetf((SubLObject)corba_utilities.$sym24$CORBA_CONNECTION_INT_ERROR_HANDLING, (SubLObject)corba_utilities.$sym25$_CSETF_CORBA_CONNECTION_INT_ERROR_HANDLING);
        Equality.identity((SubLObject)corba_utilities.$sym8$CORBA_CONNECTION);
        Structures.register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), corba_utilities.$dtp_corba_connection$.getGlobalValue(), Symbols.symbol_function((SubLObject)corba_utilities.$sym36$VISIT_DEFSTRUCT_OBJECT_CORBA_CONNECTION_METHOD));
        return (SubLObject)corba_utilities.NIL;
    }
    
    public void declareFunctions() {
        declare_corba_utilities_file();
    }
    
    public void initializeVariables() {
        init_corba_utilities_file();
    }
    
    public void runTopLevelForms() {
        setup_corba_utilities_file();
    }
    
    static {
        me = (SubLFile)new corba_utilities();
        corba_utilities.$corba_predicates$ = null;
        corba_utilities.$corba_removal_predicates$ = null;
        corba_utilities.$corba_storage_predicates$ = null;
        corba_utilities.$dtp_corba_connection$ = null;
        corba_utilities.$corba_connection_open_connection_timeout$ = null;
        corba_utilities.$corba_connection_transaction_timeout$ = null;
        corba_utilities.$corba_connection_property_keywords$ = null;
        $const0$CORBAPredicate = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CORBAPredicate"));
        $const1$CORBARemovalPredicate = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CORBARemovalPredicate"));
        $const2$CORBAStoragePredicate = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CORBAStoragePredicate"));
        $sym3$CORBA_CONNECTION_P = SubLObjectFactory.makeSymbol("CORBA-CONNECTION-P");
        $const4$TheCORBAInitialObject = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("TheCORBAInitialObject"));
        $const5$CORBAObjectFn = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CORBAObjectFn"));
        $sym6$EL_LIST_P = SubLObjectFactory.makeSymbol("EL-LIST-P");
        $sym7$LISTP = SubLObjectFactory.makeSymbol("LISTP");
        $sym8$CORBA_CONNECTION = SubLObjectFactory.makeSymbol("CORBA-CONNECTION");
        $list9 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("STREAM"), (SubLObject)SubLObjectFactory.makeSymbol("PROPERTIES"), (SubLObject)SubLObjectFactory.makeSymbol("INITIAL-OBJECT-ID"), (SubLObject)SubLObjectFactory.makeSymbol("HISTORY"), (SubLObject)SubLObjectFactory.makeSymbol("ERROR-HANDLING"));
        $list10 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("STREAM"), (SubLObject)SubLObjectFactory.makeKeyword("PROPERTIES"), (SubLObject)SubLObjectFactory.makeKeyword("INITIAL-OBJECT-ID"), (SubLObject)SubLObjectFactory.makeKeyword("HISTORY"), (SubLObject)SubLObjectFactory.makeKeyword("ERROR-HANDLING"));
        $list11 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CORBA-CONNECTION-INT-STREAM"), (SubLObject)SubLObjectFactory.makeSymbol("CORBA-CONNECTION-INT-PROPERTIES"), (SubLObject)SubLObjectFactory.makeSymbol("CORBA-CONNECTION-INT-INITIAL-OBJECT-ID"), (SubLObject)SubLObjectFactory.makeSymbol("CORBA-CONNECTION-INT-HISTORY"), (SubLObject)SubLObjectFactory.makeSymbol("CORBA-CONNECTION-INT-ERROR-HANDLING"));
        $list12 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("_CSETF-CORBA-CONNECTION-INT-STREAM"), (SubLObject)SubLObjectFactory.makeSymbol("_CSETF-CORBA-CONNECTION-INT-PROPERTIES"), (SubLObject)SubLObjectFactory.makeSymbol("_CSETF-CORBA-CONNECTION-INT-INITIAL-OBJECT-ID"), (SubLObject)SubLObjectFactory.makeSymbol("_CSETF-CORBA-CONNECTION-INT-HISTORY"), (SubLObject)SubLObjectFactory.makeSymbol("_CSETF-CORBA-CONNECTION-INT-ERROR-HANDLING"));
        $sym13$CORBA_CONNECTION_INT_PRINT = SubLObjectFactory.makeSymbol("CORBA-CONNECTION-INT-PRINT");
        $sym14$CORBA_CONNECTION_PRINT_FUNCTION_TRAMPOLINE = SubLObjectFactory.makeSymbol("CORBA-CONNECTION-PRINT-FUNCTION-TRAMPOLINE");
        $list15 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("OPTIMIZE-FUNCALL"), (SubLObject)SubLObjectFactory.makeSymbol("CORBA-CONNECTION-P"));
        $sym16$CORBA_CONNECTION_INT_STREAM = SubLObjectFactory.makeSymbol("CORBA-CONNECTION-INT-STREAM");
        $sym17$_CSETF_CORBA_CONNECTION_INT_STREAM = SubLObjectFactory.makeSymbol("_CSETF-CORBA-CONNECTION-INT-STREAM");
        $sym18$CORBA_CONNECTION_INT_PROPERTIES = SubLObjectFactory.makeSymbol("CORBA-CONNECTION-INT-PROPERTIES");
        $sym19$_CSETF_CORBA_CONNECTION_INT_PROPERTIES = SubLObjectFactory.makeSymbol("_CSETF-CORBA-CONNECTION-INT-PROPERTIES");
        $sym20$CORBA_CONNECTION_INT_INITIAL_OBJECT_ID = SubLObjectFactory.makeSymbol("CORBA-CONNECTION-INT-INITIAL-OBJECT-ID");
        $sym21$_CSETF_CORBA_CONNECTION_INT_INITIAL_OBJECT_ID = SubLObjectFactory.makeSymbol("_CSETF-CORBA-CONNECTION-INT-INITIAL-OBJECT-ID");
        $sym22$CORBA_CONNECTION_INT_HISTORY = SubLObjectFactory.makeSymbol("CORBA-CONNECTION-INT-HISTORY");
        $sym23$_CSETF_CORBA_CONNECTION_INT_HISTORY = SubLObjectFactory.makeSymbol("_CSETF-CORBA-CONNECTION-INT-HISTORY");
        $sym24$CORBA_CONNECTION_INT_ERROR_HANDLING = SubLObjectFactory.makeSymbol("CORBA-CONNECTION-INT-ERROR-HANDLING");
        $sym25$_CSETF_CORBA_CONNECTION_INT_ERROR_HANDLING = SubLObjectFactory.makeSymbol("_CSETF-CORBA-CONNECTION-INT-ERROR-HANDLING");
        $kw26$STREAM = SubLObjectFactory.makeKeyword("STREAM");
        $kw27$PROPERTIES = SubLObjectFactory.makeKeyword("PROPERTIES");
        $kw28$INITIAL_OBJECT_ID = SubLObjectFactory.makeKeyword("INITIAL-OBJECT-ID");
        $kw29$HISTORY = SubLObjectFactory.makeKeyword("HISTORY");
        $kw30$ERROR_HANDLING = SubLObjectFactory.makeKeyword("ERROR-HANDLING");
        $str31$Invalid_slot__S_for_construction_ = SubLObjectFactory.makeString("Invalid slot ~S for construction function");
        $kw32$BEGIN = SubLObjectFactory.makeKeyword("BEGIN");
        $sym33$MAKE_CORBA_CONNECTION = SubLObjectFactory.makeSymbol("MAKE-CORBA-CONNECTION");
        $kw34$SLOT = SubLObjectFactory.makeKeyword("SLOT");
        $kw35$END = SubLObjectFactory.makeKeyword("END");
        $sym36$VISIT_DEFSTRUCT_OBJECT_CORBA_CONNECTION_METHOD = SubLObjectFactory.makeSymbol("VISIT-DEFSTRUCT-OBJECT-CORBA-CONNECTION-METHOD");
        $str37$__CORBA_CONNECTION_ = SubLObjectFactory.makeString("#<CORBA-CONNECTION ");
        $str38$_streamless = SubLObjectFactory.makeString(" streamless");
        $str39$_open = SubLObjectFactory.makeString(" open");
        $str40$_closed = SubLObjectFactory.makeString(" closed");
        $str41$_ = SubLObjectFactory.makeString(">");
        $int42$900 = SubLObjectFactory.makeInteger(900);
        $kw43$PRIVATE = SubLObjectFactory.makeKeyword("PRIVATE");
        $kw44$NEW_CONNECTION = SubLObjectFactory.makeKeyword("NEW-CONNECTION");
        $str45$corba_connection_timeout = SubLObjectFactory.makeString("corba connection timeout");
        $str46$corba_transaction_timeout = SubLObjectFactory.makeString("corba transaction timeout");
        $str47$_A = SubLObjectFactory.makeString("~A");
        $str48$corba_server_not_found = SubLObjectFactory.makeString("corba server not found");
        $list49 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("PROXY-HOST"), (SubLObject)SubLObjectFactory.makeKeyword("PROXY-PORT"), (SubLObject)SubLObjectFactory.makeKeyword("INITIAL-ORB-HOST"), (SubLObject)SubLObjectFactory.makeKeyword("INITIAL-ORB-PORT"), (SubLObject)SubLObjectFactory.makeKeyword("SERVICE-NAME"), (SubLObject)SubLObjectFactory.makeKeyword("INITIAL-OBJECT-FACTORY-HELPER"), (SubLObject)SubLObjectFactory.makeKeyword("INITIAL-OBJECT-CLASS"), (SubLObject)SubLObjectFactory.makeKeyword("INVALID"));
        $sym50$STREAMP = SubLObjectFactory.makeSymbol("STREAMP");
        $sym51$KEYWORDP = SubLObjectFactory.makeSymbol("KEYWORDP");
        $kw52$INVALID = SubLObjectFactory.makeKeyword("INVALID");
        $kw53$PUBLIC = SubLObjectFactory.makeKeyword("PUBLIC");
        $str54$CORBA_connection_being_reopened_ = SubLObjectFactory.makeString("CORBA connection being reopened.");
        $kw55$PROXY_HOST = SubLObjectFactory.makeKeyword("PROXY-HOST");
        $kw56$PROXY_PORT = SubLObjectFactory.makeKeyword("PROXY-PORT");
        $kw57$CLOSE_CONNECTION = SubLObjectFactory.makeKeyword("CLOSE-CONNECTION");
        $sym58$CORBA_CONNECTION_OPEN_P = SubLObjectFactory.makeSymbol("CORBA-CONNECTION-OPEN-P");
        $kw59$SHUTDOWN_CONNECTION = SubLObjectFactory.makeKeyword("SHUTDOWN-CONNECTION");
        $str60$corba_result_error___A = SubLObjectFactory.makeString("corba result error: ~A");
        $str61$attempt_to_use_corba_connection_p = SubLObjectFactory.makeString("attempt to use corba-connection-p again awhile open (possibly because of multithreading).  cloning connection.");
        $str62$connection_timeout = SubLObjectFactory.makeString("connection timeout");
        $str63$transaction_timeout = SubLObjectFactory.makeString("transaction timeout");
        $str64$corba_eval_send_error___A = SubLObjectFactory.makeString("corba-eval send error: ~A");
        $str65$corba_eval_receive_error___A = SubLObjectFactory.makeString("corba-eval receive error: ~A");
        $sym66$STRINGP = SubLObjectFactory.makeSymbol("STRINGP");
        $kw67$ERROR = SubLObjectFactory.makeKeyword("ERROR");
        $kw68$VERIFY_CONNECTION = SubLObjectFactory.makeKeyword("VERIFY-CONNECTION");
        $kw69$NULL = SubLObjectFactory.makeKeyword("NULL");
        $str70$CORBA_server_has_been_restarted__ = SubLObjectFactory.makeString("CORBA server has been restarted.  Existing codeMapping assertions for this knowledge source are now stale, should be removed, and the relevant forward rules repropagated.");
        $sym71$CATCH_ERROR_MESSAGE_HANDLER = SubLObjectFactory.makeSymbol("CATCH-ERROR-MESSAGE-HANDLER");
        $str72$continue = SubLObjectFactory.makeString("continue");
    }
    
    public static final class $corba_connection_native extends SubLStructNative
    {
        public SubLObject $stream;
        public SubLObject $properties;
        public SubLObject $initial_object_id;
        public SubLObject $history;
        public SubLObject $error_handling;
        private static final SubLStructDeclNative structDecl;
        
        public $corba_connection_native() {
            this.$stream = (SubLObject)CommonSymbols.NIL;
            this.$properties = (SubLObject)CommonSymbols.NIL;
            this.$initial_object_id = (SubLObject)CommonSymbols.NIL;
            this.$history = (SubLObject)CommonSymbols.NIL;
            this.$error_handling = (SubLObject)CommonSymbols.NIL;
        }
        
        public SubLStructDecl getStructDecl() {
            return (SubLStructDecl)$corba_connection_native.structDecl;
        }
        
        public SubLObject getField2() {
            return this.$stream;
        }
        
        public SubLObject getField3() {
            return this.$properties;
        }
        
        public SubLObject getField4() {
            return this.$initial_object_id;
        }
        
        public SubLObject getField5() {
            return this.$history;
        }
        
        public SubLObject getField6() {
            return this.$error_handling;
        }
        
        public SubLObject setField2(final SubLObject value) {
            return this.$stream = value;
        }
        
        public SubLObject setField3(final SubLObject value) {
            return this.$properties = value;
        }
        
        public SubLObject setField4(final SubLObject value) {
            return this.$initial_object_id = value;
        }
        
        public SubLObject setField5(final SubLObject value) {
            return this.$history = value;
        }
        
        public SubLObject setField6(final SubLObject value) {
            return this.$error_handling = value;
        }
        
        static {
            structDecl = Structures.makeStructDeclNative((Class)$corba_connection_native.class, corba_utilities.$sym8$CORBA_CONNECTION, corba_utilities.$sym3$CORBA_CONNECTION_P, corba_utilities.$list9, corba_utilities.$list10, new String[] { "$stream", "$properties", "$initial_object_id", "$history", "$error_handling" }, corba_utilities.$list11, corba_utilities.$list12, corba_utilities.$sym13$CORBA_CONNECTION_INT_PRINT);
        }
    }
    
    public static final class $corba_connection_p$UnaryFunction extends UnaryFunction
    {
        public $corba_connection_p$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("CORBA-CONNECTION-P"));
        }
        
        public SubLObject processItem(final SubLObject arg1) {
            return corba_utilities.corba_connection_p(arg1);
        }
    }
}

/*

	Total time: 211 ms
	 synthetic 
*/