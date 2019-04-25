package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Semaphores;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class subl_macro_promotions extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.subl_macro_promotions";
    public static final String myFingerPrint = "2d74906a9eae326f593826ff5f5661436bd73add795d00b96421e3d974f9d190";
    @SubLTranslatedFile.SubL(source = "cycl/subl-macro-promotions.lisp", position = 1480L)
    public static SubLSymbol $catch_error_message_target$;
    @SubLTranslatedFile.SubL(source = "cycl/subl-macro-promotions.lisp", position = 3664L)
    public static SubLSymbol $within_with_timeout$;
    @SubLTranslatedFile.SubL(source = "cycl/subl-macro-promotions.lisp", position = 3818L)
    public static SubLSymbol $with_timeout_nesting_depth$;
    private static final SubLList $list0;
    private static final SubLSymbol $sym1$PROGN;
    private static final SubLSymbol $sym2$DEFLEXICAL;
    private static final SubLSymbol $sym3$FIF;
    private static final SubLSymbol $sym4$BOUNDP;
    private static final SubLSymbol $sym5$QUOTE;
    private static final SubLSymbol $sym6$DECLARE_DEFGLOBAL;
    private static final SubLSymbol $kw7$INITIALIZATION_TYPE;
    private static final SubLSymbol $kw8$WORLD;
    private static final SubLSymbol $sym9$_CATCH_ERROR_MESSAGE_TARGET_;
    private static final SubLString $str10$ERROR;
    private static final SubLList $list11;
    private static final SubLSymbol $sym12$CCATCH;
    private static final SubLSymbol $sym13$WITH_ERROR_HANDLER;
    private static final SubLList $list14;
    private static final SubLList $list15;
    private static final SubLSymbol $sym16$WITH_TIMEOUT_VIA_INTERRUPT;
    private static final SubLSymbol $sym17$TAG;
    private static final SubLSymbol $sym18$TIMER;
    private static final SubLSymbol $sym19$CLET;
    private static final SubLList $list20;
    private static final SubLList $list21;
    private static final SubLSymbol $sym22$CUNWIND_PROTECT;
    private static final SubLList $list23;
    private static final SubLSymbol $sym24$CSETQ;
    private static final SubLSymbol $sym25$WITH_TIMEOUT_START_TIMER;
    private static final SubLSymbol $sym26$WITH_TIMEOUT_STOP_TIMER;
    private static final SubLSymbol $sym27$WITH_TIMEOUT_MAKE_TAG;
    private static final SubLSymbol $sym28$WITH_TIMEOUT;
    private static final SubLSymbol $sym29$WITH_TIMEOUT_THROW;
    private static final SubLList $list30;
    private static final SubLList $list31;
    private static final SubLSymbol $kw32$ALLOW_OTHER_KEYS;
    private static final SubLSymbol $kw33$TIMEOUT;
    private static final SubLSymbol $kw34$ACCESS_MODE;
    private static final SubLSymbol $kw35$PUBLIC;
    private static final SubLSymbol $sym36$OPEN_TCP_STREAM_WITH_TIMEOUT;
    private static final SubLSymbol $sym37$PWHEN;
    private static final SubLSymbol $sym38$VALIDATE_TCP_CONNECTION;
    private static final SubLSymbol $sym39$CLOSE;
    private static final SubLSymbol $sym40$WITH_TCP_CONNECTION_WITH_TIMEOUT;
    private static final SubLList $list41;
    private static final SubLSymbol $sym42$WITH_TCP_CONNECTION;
    private static final SubLString $str43$Connection_to__A__A_timed_out_;
    private static final SubLList $list44;
    private static final SubLSymbol $sym45$LISTP;
    private static final SubLSymbol $sym46$CMULTIPLE_VALUE_BIND;
    private static final SubLSymbol $sym47$CMULTIPLE_VALUE_SETQ;
    private static final SubLList $list48;
    private static final SubLSymbol $sym49$WITH_SPACE_PROFILING;
    private static final SubLList $list50;
    private static final SubLList $list51;
    private static final SubLSymbol $kw52$STREAM;
    private static final SubLSymbol $sym53$_STANDARD_OUTPUT_;
    private static final SubLSymbol $sym54$WITH_SPACE_PROFILING_SL2C;
    private static final SubLSymbol $sym55$SPACE_INFO;
    private static final SubLList $list56;
    private static final SubLSymbol $sym57$REMOVE_SPACE_PROBE;
    private static final SubLSymbol $sym58$_INTERPRET_CSPACE_RESULTS;
    private static final SubLList $list59;
    private static final SubLSymbol $sym60$STRINGP;
    private static final SubLList $list61;
    
    @SubLTranslatedFile.SubL(source = "cycl/subl-macro-promotions.lisp", position = 848L)
    public static SubLObject defglobal(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject variable = (SubLObject)subl_macro_promotions.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)subl_macro_promotions.$list0);
        variable = current.first();
        current = current.rest();
        final SubLObject initialization = (SubLObject)(current.isCons() ? current.first() : subl_macro_promotions.NIL);
        cdestructuring_bind.destructuring_bind_must_listp(current, datum, (SubLObject)subl_macro_promotions.$list0);
        current = current.rest();
        final SubLObject documentation = (SubLObject)(current.isCons() ? current.first() : subl_macro_promotions.NIL);
        cdestructuring_bind.destructuring_bind_must_listp(current, datum, (SubLObject)subl_macro_promotions.$list0);
        current = current.rest();
        if (subl_macro_promotions.NIL == current) {
            return (SubLObject)ConsesLow.list((SubLObject)subl_macro_promotions.$sym1$PROGN, (SubLObject)ConsesLow.listS((SubLObject)subl_macro_promotions.$sym2$DEFLEXICAL, variable, (SubLObject)ConsesLow.list((SubLObject)subl_macro_promotions.$sym3$FIF, (SubLObject)ConsesLow.list((SubLObject)subl_macro_promotions.$sym4$BOUNDP, (SubLObject)ConsesLow.list((SubLObject)subl_macro_promotions.$sym5$QUOTE, variable)), variable, initialization), ConsesLow.append((SubLObject)((subl_macro_promotions.NIL != documentation) ? ConsesLow.list(documentation) : subl_macro_promotions.NIL), (SubLObject)subl_macro_promotions.NIL)), (SubLObject)ConsesLow.list((SubLObject)subl_macro_promotions.$sym6$DECLARE_DEFGLOBAL, (SubLObject)ConsesLow.list((SubLObject)subl_macro_promotions.$sym5$QUOTE, variable)));
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)subl_macro_promotions.$list0);
        return (SubLObject)subl_macro_promotions.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subl-macro-promotions.lisp", position = 1266L)
    public static SubLObject declare_defglobal(final SubLObject global) {
        Symbols.put(global, (SubLObject)subl_macro_promotions.$kw7$INITIALIZATION_TYPE, (SubLObject)subl_macro_promotions.$kw8$WORLD);
        return global;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subl-macro-promotions.lisp", position = 1712L)
    public static SubLObject catch_error_message(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)subl_macro_promotions.$list11);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject var = (SubLObject)subl_macro_promotions.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)subl_macro_promotions.$list11);
        var = current.first();
        current = current.rest();
        if (subl_macro_promotions.NIL == current) {
            final SubLObject body;
            current = (body = temp);
            return (SubLObject)ConsesLow.list((SubLObject)subl_macro_promotions.$sym12$CCATCH, (SubLObject)subl_macro_promotions.$sym9$_CATCH_ERROR_MESSAGE_TARGET_, var, (SubLObject)ConsesLow.listS((SubLObject)subl_macro_promotions.$sym13$WITH_ERROR_HANDLER, (SubLObject)subl_macro_promotions.$list14, ConsesLow.append(body, (SubLObject)subl_macro_promotions.NIL)));
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)subl_macro_promotions.$list11);
        return (SubLObject)subl_macro_promotions.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subl-macro-promotions.lisp", position = 2030L)
    public static SubLObject catch_error_message_handler() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return Dynamic.sublisp_throw(subl_macro_promotions.$catch_error_message_target$.getGlobalValue(), Errors.$error_message$.getDynamicValue(thread));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subl-macro-promotions.lisp", position = 2200L)
    public static SubLObject with_timeout(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)subl_macro_promotions.$list15);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject time = (SubLObject)subl_macro_promotions.NIL;
        SubLObject timed_out_var = (SubLObject)subl_macro_promotions.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)subl_macro_promotions.$list15);
        time = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)subl_macro_promotions.$list15);
        timed_out_var = current.first();
        current = current.rest();
        if (subl_macro_promotions.NIL == current) {
            final SubLObject body;
            current = (body = temp);
            return (SubLObject)ConsesLow.listS((SubLObject)subl_macro_promotions.$sym16$WITH_TIMEOUT_VIA_INTERRUPT, (SubLObject)ConsesLow.list(time, timed_out_var), ConsesLow.append(body, (SubLObject)subl_macro_promotions.NIL));
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)subl_macro_promotions.$list15);
        return (SubLObject)subl_macro_promotions.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subl-macro-promotions.lisp", position = 3028L)
    public static SubLObject with_timeout_via_interrupt(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)subl_macro_promotions.$list15);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject time = (SubLObject)subl_macro_promotions.NIL;
        SubLObject timed_out_var = (SubLObject)subl_macro_promotions.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)subl_macro_promotions.$list15);
        time = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)subl_macro_promotions.$list15);
        timed_out_var = current.first();
        current = current.rest();
        if (subl_macro_promotions.NIL == current) {
            final SubLObject body;
            current = (body = temp);
            return with_timeout_internal(time, timed_out_var, body);
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)subl_macro_promotions.$list15);
        return (SubLObject)subl_macro_promotions.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subl-macro-promotions.lisp", position = 3205L)
    public static SubLObject with_timeout_internal(final SubLObject time, final SubLObject timed_out_var, final SubLObject body) {
        final SubLObject tag = (SubLObject)subl_macro_promotions.$sym17$TAG;
        final SubLObject timer = (SubLObject)subl_macro_promotions.$sym18$TIMER;
        return (SubLObject)ConsesLow.list((SubLObject)subl_macro_promotions.$sym19$CLET, (SubLObject)ConsesLow.list(reader.bq_cons(tag, (SubLObject)subl_macro_promotions.$list20)), (SubLObject)ConsesLow.list((SubLObject)subl_macro_promotions.$sym12$CCATCH, tag, timed_out_var, (SubLObject)ConsesLow.list((SubLObject)subl_macro_promotions.$sym19$CLET, (SubLObject)ConsesLow.list((SubLObject)subl_macro_promotions.$list21, timer), (SubLObject)ConsesLow.list((SubLObject)subl_macro_promotions.$sym22$CUNWIND_PROTECT, (SubLObject)ConsesLow.listS((SubLObject)subl_macro_promotions.$sym19$CLET, (SubLObject)subl_macro_promotions.$list23, (SubLObject)ConsesLow.list((SubLObject)subl_macro_promotions.$sym24$CSETQ, timer, (SubLObject)ConsesLow.list((SubLObject)subl_macro_promotions.$sym25$WITH_TIMEOUT_START_TIMER, time, tag)), ConsesLow.append(body, (SubLObject)subl_macro_promotions.NIL)), (SubLObject)ConsesLow.list((SubLObject)subl_macro_promotions.$sym26$WITH_TIMEOUT_STOP_TIMER, timer)))));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subl-macro-promotions.lisp", position = 3904L)
    public static SubLObject with_timeout_make_tag() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return (SubLObject)ConsesLow.cons((SubLObject)subl_macro_promotions.$sym28$WITH_TIMEOUT, subl_macro_promotions.$with_timeout_nesting_depth$.getDynamicValue(thread));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subl-macro-promotions.lisp", position = 4034L)
    public static SubLObject with_timeout_start_timer(final SubLObject time, final SubLObject tag) {
        Time.schedule_current_process_for_timeout(tag, time);
        return tag;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subl-macro-promotions.lisp", position = 5290L)
    public static SubLObject timeout_tag_nesting_depth(final SubLObject tag) {
        return tag.rest();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subl-macro-promotions.lisp", position = 5358L)
    public static SubLObject with_timeout_stop_timer(final SubLObject timer) {
        Time.ensure_current_process_timeout_is_cancelled();
        return timer;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subl-macro-promotions.lisp", position = 5650L)
    public static SubLObject with_timeout_timer_thread(final SubLObject client, final SubLObject time, final SubLObject tag, final SubLObject client_semaphore, final SubLObject timer_semaphore) {
        Semaphores.semaphore_signal(timer_semaphore);
        Semaphores.semaphore_wait(client_semaphore);
        Threads.sleep(time);
        with_timeout_signal_timeout(client, tag);
        return (SubLObject)subl_macro_promotions.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subl-macro-promotions.lisp", position = 6118L)
    public static SubLObject with_timeout_signal_timeout(final SubLObject client, final SubLObject tag) {
        if (subl_macro_promotions.NIL != Threads.valid_process_p(client)) {
            return subl_promotions.interrupt_process_with_args(client, (SubLObject)subl_macro_promotions.$sym29$WITH_TIMEOUT_THROW, (SubLObject)ConsesLow.list(tag));
        }
        return (SubLObject)subl_macro_promotions.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subl-macro-promotions.lisp", position = 6313L)
    public static SubLObject with_timeout_throw(final SubLObject tag) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (subl_macro_promotions.NIL != subl_macro_promotions.$within_with_timeout$.getDynamicValue(thread)) {
            Dynamic.sublisp_throw(tag, (SubLObject)subl_macro_promotions.T);
        }
        return (SubLObject)subl_macro_promotions.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subl-macro-promotions.lisp", position = 6418L)
    public static SubLObject with_tcp_connection(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)subl_macro_promotions.$list30);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject bi_stream = (SubLObject)subl_macro_promotions.NIL;
        SubLObject host = (SubLObject)subl_macro_promotions.NIL;
        SubLObject port = (SubLObject)subl_macro_promotions.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)subl_macro_promotions.$list30);
        bi_stream = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)subl_macro_promotions.$list30);
        host = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)subl_macro_promotions.$list30);
        port = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = (SubLObject)subl_macro_promotions.NIL;
        SubLObject rest = current;
        SubLObject bad = (SubLObject)subl_macro_promotions.NIL;
        SubLObject current_$1 = (SubLObject)subl_macro_promotions.NIL;
        while (subl_macro_promotions.NIL != rest) {
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)subl_macro_promotions.$list30);
            current_$1 = rest.first();
            rest = rest.rest();
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)subl_macro_promotions.$list30);
            if (subl_macro_promotions.NIL == conses_high.member(current_$1, (SubLObject)subl_macro_promotions.$list31, (SubLObject)subl_macro_promotions.UNPROVIDED, (SubLObject)subl_macro_promotions.UNPROVIDED)) {
                bad = (SubLObject)subl_macro_promotions.T;
            }
            if (current_$1 == subl_macro_promotions.$kw32$ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        }
        if (subl_macro_promotions.NIL != bad && subl_macro_promotions.NIL == allow_other_keys_p) {
            cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)subl_macro_promotions.$list30);
        }
        final SubLObject timeout_tail = cdestructuring_bind.property_list_member((SubLObject)subl_macro_promotions.$kw33$TIMEOUT, current);
        final SubLObject timeout = (SubLObject)((subl_macro_promotions.NIL != timeout_tail) ? conses_high.cadr(timeout_tail) : subl_macro_promotions.NIL);
        final SubLObject access_mode_tail = cdestructuring_bind.property_list_member((SubLObject)subl_macro_promotions.$kw34$ACCESS_MODE, current);
        final SubLObject access_mode = (SubLObject)((subl_macro_promotions.NIL != access_mode_tail) ? conses_high.cadr(access_mode_tail) : subl_macro_promotions.$kw35$PUBLIC);
        final SubLObject body;
        current = (body = temp);
        return (SubLObject)ConsesLow.list((SubLObject)subl_macro_promotions.$sym19$CLET, (SubLObject)ConsesLow.list(bi_stream), (SubLObject)ConsesLow.list((SubLObject)subl_macro_promotions.$sym22$CUNWIND_PROTECT, (SubLObject)ConsesLow.list((SubLObject)subl_macro_promotions.$sym1$PROGN, (SubLObject)ConsesLow.list((SubLObject)subl_macro_promotions.$sym24$CSETQ, bi_stream, (SubLObject)ConsesLow.list((SubLObject)subl_macro_promotions.$sym36$OPEN_TCP_STREAM_WITH_TIMEOUT, host, port, timeout, access_mode)), (SubLObject)ConsesLow.listS((SubLObject)subl_macro_promotions.$sym37$PWHEN, (SubLObject)ConsesLow.list((SubLObject)subl_macro_promotions.$sym38$VALIDATE_TCP_CONNECTION, bi_stream, host, port), ConsesLow.append(body, (SubLObject)subl_macro_promotions.NIL))), (SubLObject)ConsesLow.list((SubLObject)subl_macro_promotions.$sym37$PWHEN, bi_stream, (SubLObject)ConsesLow.list((SubLObject)subl_macro_promotions.$sym39$CLOSE, bi_stream))));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subl-macro-promotions.lisp", position = 7115L)
    public static SubLObject with_tcp_connection_with_timeout(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)subl_macro_promotions.$list30);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject bi_stream = (SubLObject)subl_macro_promotions.NIL;
        SubLObject host = (SubLObject)subl_macro_promotions.NIL;
        SubLObject port = (SubLObject)subl_macro_promotions.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)subl_macro_promotions.$list30);
        bi_stream = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)subl_macro_promotions.$list30);
        host = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)subl_macro_promotions.$list30);
        port = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = (SubLObject)subl_macro_promotions.NIL;
        SubLObject rest = current;
        SubLObject bad = (SubLObject)subl_macro_promotions.NIL;
        SubLObject current_$2 = (SubLObject)subl_macro_promotions.NIL;
        while (subl_macro_promotions.NIL != rest) {
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)subl_macro_promotions.$list30);
            current_$2 = rest.first();
            rest = rest.rest();
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)subl_macro_promotions.$list30);
            if (subl_macro_promotions.NIL == conses_high.member(current_$2, (SubLObject)subl_macro_promotions.$list31, (SubLObject)subl_macro_promotions.UNPROVIDED, (SubLObject)subl_macro_promotions.UNPROVIDED)) {
                bad = (SubLObject)subl_macro_promotions.T;
            }
            if (current_$2 == subl_macro_promotions.$kw32$ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        }
        if (subl_macro_promotions.NIL != bad && subl_macro_promotions.NIL == allow_other_keys_p) {
            cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)subl_macro_promotions.$list30);
        }
        final SubLObject timeout_tail = cdestructuring_bind.property_list_member((SubLObject)subl_macro_promotions.$kw33$TIMEOUT, current);
        final SubLObject timeout = (SubLObject)((subl_macro_promotions.NIL != timeout_tail) ? conses_high.cadr(timeout_tail) : subl_macro_promotions.NIL);
        final SubLObject access_mode_tail = cdestructuring_bind.property_list_member((SubLObject)subl_macro_promotions.$kw34$ACCESS_MODE, current);
        final SubLObject access_mode = (SubLObject)((subl_macro_promotions.NIL != access_mode_tail) ? conses_high.cadr(access_mode_tail) : subl_macro_promotions.$kw35$PUBLIC);
        final SubLObject body;
        current = (body = temp);
        access_macros.defmacro_obsolete_warning((SubLObject)subl_macro_promotions.$sym40$WITH_TCP_CONNECTION_WITH_TIMEOUT, (SubLObject)subl_macro_promotions.$list41);
        return (SubLObject)ConsesLow.listS((SubLObject)subl_macro_promotions.$sym42$WITH_TCP_CONNECTION, (SubLObject)ConsesLow.list(bi_stream, host, port, (SubLObject)subl_macro_promotions.$kw33$TIMEOUT, timeout, (SubLObject)subl_macro_promotions.$kw34$ACCESS_MODE, access_mode), ConsesLow.append(body, (SubLObject)subl_macro_promotions.NIL));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subl-macro-promotions.lisp", position = 7402L)
    public static SubLObject validate_tcp_connection(final SubLObject channel, final SubLObject host, final SubLObject port) {
        if (subl_macro_promotions.NIL == channel) {
            return Errors.error((SubLObject)subl_macro_promotions.$str43$Connection_to__A__A_timed_out_, host, port);
        }
        return (SubLObject)subl_macro_promotions.T;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subl-macro-promotions.lisp", position = 7656L)
    public static SubLObject cmultiple_value_setq(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject v_variables = (SubLObject)subl_macro_promotions.NIL;
        SubLObject expression = (SubLObject)subl_macro_promotions.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)subl_macro_promotions.$list44);
        v_variables = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)subl_macro_promotions.$list44);
        expression = current.first();
        current = current.rest();
        if (subl_macro_promotions.NIL != current) {
            cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)subl_macro_promotions.$list44);
            return (SubLObject)subl_macro_promotions.NIL;
        }
        assert subl_macro_promotions.NIL != Types.listp(v_variables) : v_variables;
        if (subl_macro_promotions.NIL == v_variables) {
            return (SubLObject)ConsesLow.list((SubLObject)subl_macro_promotions.$sym1$PROGN, expression);
        }
        SubLObject parallel_variables = (SubLObject)subl_macro_promotions.NIL;
        SubLObject variable_assignments = (SubLObject)subl_macro_promotions.NIL;
        SubLObject cdolist_list_var = v_variables;
        SubLObject variable = (SubLObject)subl_macro_promotions.NIL;
        variable = cdolist_list_var.first();
        while (subl_macro_promotions.NIL != cdolist_list_var) {
            variable_assignments = (SubLObject)ConsesLow.cons(variable, variable_assignments);
            final SubLObject parallel_variable = meta_macros.make_temp_var(variable);
            parallel_variables = (SubLObject)ConsesLow.cons(parallel_variable, parallel_variables);
            variable_assignments = (SubLObject)ConsesLow.cons(parallel_variable, variable_assignments);
            cdolist_list_var = cdolist_list_var.rest();
            variable = cdolist_list_var.first();
        }
        return (SubLObject)ConsesLow.list((SubLObject)subl_macro_promotions.$sym46$CMULTIPLE_VALUE_BIND, Sequences.nreverse(parallel_variables), expression, reader.bq_cons((SubLObject)subl_macro_promotions.$sym24$CSETQ, ConsesLow.append(Sequences.nreverse(variable_assignments), (SubLObject)subl_macro_promotions.NIL)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subl-macro-promotions.lisp", position = 8742L)
    public static SubLObject with_space_profiling(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)subl_macro_promotions.$list50);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject allow_other_keys_p = (SubLObject)subl_macro_promotions.NIL;
        SubLObject rest = current;
        SubLObject bad = (SubLObject)subl_macro_promotions.NIL;
        SubLObject current_$3 = (SubLObject)subl_macro_promotions.NIL;
        while (subl_macro_promotions.NIL != rest) {
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)subl_macro_promotions.$list50);
            current_$3 = rest.first();
            rest = rest.rest();
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)subl_macro_promotions.$list50);
            if (subl_macro_promotions.NIL == conses_high.member(current_$3, (SubLObject)subl_macro_promotions.$list51, (SubLObject)subl_macro_promotions.UNPROVIDED, (SubLObject)subl_macro_promotions.UNPROVIDED)) {
                bad = (SubLObject)subl_macro_promotions.T;
            }
            if (current_$3 == subl_macro_promotions.$kw32$ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        }
        if (subl_macro_promotions.NIL != bad && subl_macro_promotions.NIL == allow_other_keys_p) {
            cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)subl_macro_promotions.$list50);
        }
        final SubLObject stream_tail = cdestructuring_bind.property_list_member((SubLObject)subl_macro_promotions.$kw52$STREAM, current);
        final SubLObject stream = (SubLObject)((subl_macro_promotions.NIL != stream_tail) ? conses_high.cadr(stream_tail) : subl_macro_promotions.$sym53$_STANDARD_OUTPUT_);
        final SubLObject body;
        current = (body = temp);
        return with_space_profiling_sl2c(stream, body);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subl-macro-promotions.lisp", position = 9444L)
    public static SubLObject with_space_profiling_sl2c(final SubLObject stream, final SubLObject body) {
        final SubLObject space_info = (SubLObject)subl_macro_promotions.$sym55$SPACE_INFO;
        return (SubLObject)ConsesLow.list((SubLObject)subl_macro_promotions.$sym19$CLET, (SubLObject)ConsesLow.list(space_info), (SubLObject)ConsesLow.list((SubLObject)subl_macro_promotions.$sym22$CUNWIND_PROTECT, (SubLObject)ConsesLow.list((SubLObject)subl_macro_promotions.$sym1$PROGN, (SubLObject)ConsesLow.listS((SubLObject)subl_macro_promotions.$sym24$CSETQ, space_info, (SubLObject)subl_macro_promotions.$list56), reader.bq_cons((SubLObject)subl_macro_promotions.$sym1$PROGN, ConsesLow.append(body, (SubLObject)subl_macro_promotions.NIL))), (SubLObject)ConsesLow.list((SubLObject)subl_macro_promotions.$sym37$PWHEN, space_info, (SubLObject)ConsesLow.list((SubLObject)subl_macro_promotions.$sym57$REMOVE_SPACE_PROBE, space_info), (SubLObject)ConsesLow.list((SubLObject)subl_macro_promotions.$sym58$_INTERPRET_CSPACE_RESULTS, space_info, stream))));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subl-macro-promotions.lisp", position = 9964L)
    public static SubLObject code_comment(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject comment_string = (SubLObject)subl_macro_promotions.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)subl_macro_promotions.$list59);
        comment_string = current.first();
        current = current.rest();
        if (subl_macro_promotions.NIL != current) {
            cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)subl_macro_promotions.$list59);
            return (SubLObject)subl_macro_promotions.NIL;
        }
        assert subl_macro_promotions.NIL != Types.stringp(comment_string) : comment_string;
        return (SubLObject)subl_macro_promotions.$list61;
    }
    
    public static SubLObject declare_subl_macro_promotions_file() {
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.subl_macro_promotions", "defglobal", "DEFGLOBAL");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subl_macro_promotions", "declare_defglobal", "DECLARE-DEFGLOBAL", 1, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.subl_macro_promotions", "catch_error_message", "CATCH-ERROR-MESSAGE");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subl_macro_promotions", "catch_error_message_handler", "CATCH-ERROR-MESSAGE-HANDLER", 0, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.subl_macro_promotions", "with_timeout", "WITH-TIMEOUT");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.subl_macro_promotions", "with_timeout_via_interrupt", "WITH-TIMEOUT-VIA-INTERRUPT");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subl_macro_promotions", "with_timeout_internal", "WITH-TIMEOUT-INTERNAL", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subl_macro_promotions", "with_timeout_make_tag", "WITH-TIMEOUT-MAKE-TAG", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subl_macro_promotions", "with_timeout_start_timer", "WITH-TIMEOUT-START-TIMER", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subl_macro_promotions", "timeout_tag_nesting_depth", "TIMEOUT-TAG-NESTING-DEPTH", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subl_macro_promotions", "with_timeout_stop_timer", "WITH-TIMEOUT-STOP-TIMER", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subl_macro_promotions", "with_timeout_timer_thread", "WITH-TIMEOUT-TIMER-THREAD", 5, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subl_macro_promotions", "with_timeout_signal_timeout", "WITH-TIMEOUT-SIGNAL-TIMEOUT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subl_macro_promotions", "with_timeout_throw", "WITH-TIMEOUT-THROW", 1, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.subl_macro_promotions", "with_tcp_connection", "WITH-TCP-CONNECTION");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.subl_macro_promotions", "with_tcp_connection_with_timeout", "WITH-TCP-CONNECTION-WITH-TIMEOUT");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subl_macro_promotions", "validate_tcp_connection", "VALIDATE-TCP-CONNECTION", 3, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.subl_macro_promotions", "cmultiple_value_setq", "CMULTIPLE-VALUE-SETQ");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.subl_macro_promotions", "with_space_profiling", "WITH-SPACE-PROFILING");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subl_macro_promotions", "with_space_profiling_sl2c", "WITH-SPACE-PROFILING-SL2C", 2, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.subl_macro_promotions", "code_comment", "CODE-COMMENT");
        return (SubLObject)subl_macro_promotions.NIL;
    }
    
    public static SubLObject init_subl_macro_promotions_file() {
        subl_macro_promotions.$catch_error_message_target$ = SubLFiles.deflexical("*CATCH-ERROR-MESSAGE-TARGET*", maybeDefault((SubLObject)subl_macro_promotions.$sym9$_CATCH_ERROR_MESSAGE_TARGET_, subl_macro_promotions.$catch_error_message_target$, ()->(Symbols.make_symbol((SubLObject)subl_macro_promotions.$str10$ERROR))));
        subl_macro_promotions.$within_with_timeout$ = SubLFiles.defparameter("*WITHIN-WITH-TIMEOUT*", (SubLObject)subl_macro_promotions.NIL);
        subl_macro_promotions.$with_timeout_nesting_depth$ = SubLFiles.defparameter("*WITH-TIMEOUT-NESTING-DEPTH*", (SubLObject)subl_macro_promotions.ZERO_INTEGER);
        return (SubLObject)subl_macro_promotions.NIL;
    }
    
    public static SubLObject setup_subl_macro_promotions_file() {
        declare_defglobal((SubLObject)subl_macro_promotions.$sym9$_CATCH_ERROR_MESSAGE_TARGET_);
        access_macros.register_macro_helper((SubLObject)subl_macro_promotions.$sym27$WITH_TIMEOUT_MAKE_TAG, (SubLObject)subl_macro_promotions.$sym28$WITH_TIMEOUT);
        access_macros.register_macro_helper((SubLObject)subl_macro_promotions.$sym25$WITH_TIMEOUT_START_TIMER, (SubLObject)subl_macro_promotions.$sym28$WITH_TIMEOUT);
        access_macros.register_macro_helper((SubLObject)subl_macro_promotions.$sym26$WITH_TIMEOUT_STOP_TIMER, (SubLObject)subl_macro_promotions.$sym28$WITH_TIMEOUT);
        access_macros.register_macro_helper((SubLObject)subl_macro_promotions.$sym38$VALIDATE_TCP_CONNECTION, (SubLObject)subl_macro_promotions.$sym42$WITH_TCP_CONNECTION);
        meta_macros.declare_indention_pattern((SubLObject)subl_macro_promotions.$sym47$CMULTIPLE_VALUE_SETQ, (SubLObject)subl_macro_promotions.$list48);
        access_macros.register_external_symbol((SubLObject)subl_macro_promotions.$sym49$WITH_SPACE_PROFILING);
        access_macros.register_macro_helper((SubLObject)subl_macro_promotions.$sym54$WITH_SPACE_PROFILING_SL2C, (SubLObject)subl_macro_promotions.$sym49$WITH_SPACE_PROFILING);
        return (SubLObject)subl_macro_promotions.NIL;
    }
    
    @Override
	public void declareFunctions() {
        declare_subl_macro_promotions_file();
    }
    
    @Override
	public void initializeVariables() {
        init_subl_macro_promotions_file();
    }
    
    @Override
	public void runTopLevelForms() {
        setup_subl_macro_promotions_file();
    }
    
    static {
        me = (SubLFile)new subl_macro_promotions();
        subl_macro_promotions.$catch_error_message_target$ = null;
        subl_macro_promotions.$within_with_timeout$ = null;
        subl_macro_promotions.$with_timeout_nesting_depth$ = null;
        $list0 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("VARIABLE"), (SubLObject)SubLObjectFactory.makeSymbol("&OPTIONAL"), (SubLObject)SubLObjectFactory.makeSymbol("INITIALIZATION"), (SubLObject)SubLObjectFactory.makeSymbol("DOCUMENTATION"));
        $sym1$PROGN = SubLObjectFactory.makeSymbol("PROGN");
        $sym2$DEFLEXICAL = SubLObjectFactory.makeSymbol("DEFLEXICAL");
        $sym3$FIF = SubLObjectFactory.makeSymbol("FIF");
        $sym4$BOUNDP = SubLObjectFactory.makeSymbol("BOUNDP");
        $sym5$QUOTE = SubLObjectFactory.makeSymbol("QUOTE");
        $sym6$DECLARE_DEFGLOBAL = SubLObjectFactory.makeSymbol("DECLARE-DEFGLOBAL");
        $kw7$INITIALIZATION_TYPE = SubLObjectFactory.makeKeyword("INITIALIZATION-TYPE");
        $kw8$WORLD = SubLObjectFactory.makeKeyword("WORLD");
        $sym9$_CATCH_ERROR_MESSAGE_TARGET_ = SubLObjectFactory.makeSymbol("*CATCH-ERROR-MESSAGE-TARGET*");
        $str10$ERROR = SubLObjectFactory.makeString("ERROR");
        $list11 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("VAR")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $sym12$CCATCH = SubLObjectFactory.makeSymbol("CCATCH");
        $sym13$WITH_ERROR_HANDLER = SubLObjectFactory.makeSymbol("WITH-ERROR-HANDLER");
        $list14 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("CATCH-ERROR-MESSAGE-HANDLER"));
        $list15 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TIME"), (SubLObject)SubLObjectFactory.makeSymbol("TIMED-OUT-VAR")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $sym16$WITH_TIMEOUT_VIA_INTERRUPT = SubLObjectFactory.makeSymbol("WITH-TIMEOUT-VIA-INTERRUPT");
        $sym17$TAG = SubLObjectFactory.makeUninternedSymbol("TAG");
        $sym18$TIMER = SubLObjectFactory.makeUninternedSymbol("TIMER");
        $sym19$CLET = SubLObjectFactory.makeSymbol("CLET");
        $list20 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("WITH-TIMEOUT-MAKE-TAG")));
        $list21 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*WITHIN-WITH-TIMEOUT*"), (SubLObject)subl_macro_promotions.T);
        $sym22$CUNWIND_PROTECT = SubLObjectFactory.makeSymbol("CUNWIND-PROTECT");
        $list23 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*WITH-TIMEOUT-NESTING-DEPTH*"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("+"), (SubLObject)subl_macro_promotions.ONE_INTEGER, (SubLObject)SubLObjectFactory.makeSymbol("*WITH-TIMEOUT-NESTING-DEPTH*"))));
        $sym24$CSETQ = SubLObjectFactory.makeSymbol("CSETQ");
        $sym25$WITH_TIMEOUT_START_TIMER = SubLObjectFactory.makeSymbol("WITH-TIMEOUT-START-TIMER");
        $sym26$WITH_TIMEOUT_STOP_TIMER = SubLObjectFactory.makeSymbol("WITH-TIMEOUT-STOP-TIMER");
        $sym27$WITH_TIMEOUT_MAKE_TAG = SubLObjectFactory.makeSymbol("WITH-TIMEOUT-MAKE-TAG");
        $sym28$WITH_TIMEOUT = SubLObjectFactory.makeSymbol("WITH-TIMEOUT");
        $sym29$WITH_TIMEOUT_THROW = SubLObjectFactory.makeSymbol("WITH-TIMEOUT-THROW");
        $list30 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("BI-STREAM"), (SubLObject)SubLObjectFactory.makeSymbol("HOST"), (SubLObject)SubLObjectFactory.makeSymbol("PORT"), (SubLObject)SubLObjectFactory.makeSymbol("&KEY"), (SubLObject)SubLObjectFactory.makeSymbol("TIMEOUT"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ACCESS-MODE"), (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC"))), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $list31 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TIMEOUT"), (SubLObject)SubLObjectFactory.makeKeyword("ACCESS-MODE"));
        $kw32$ALLOW_OTHER_KEYS = SubLObjectFactory.makeKeyword("ALLOW-OTHER-KEYS");
        $kw33$TIMEOUT = SubLObjectFactory.makeKeyword("TIMEOUT");
        $kw34$ACCESS_MODE = SubLObjectFactory.makeKeyword("ACCESS-MODE");
        $kw35$PUBLIC = SubLObjectFactory.makeKeyword("PUBLIC");
        $sym36$OPEN_TCP_STREAM_WITH_TIMEOUT = SubLObjectFactory.makeSymbol("OPEN-TCP-STREAM-WITH-TIMEOUT");
        $sym37$PWHEN = SubLObjectFactory.makeSymbol("PWHEN");
        $sym38$VALIDATE_TCP_CONNECTION = SubLObjectFactory.makeSymbol("VALIDATE-TCP-CONNECTION");
        $sym39$CLOSE = SubLObjectFactory.makeSymbol("CLOSE");
        $sym40$WITH_TCP_CONNECTION_WITH_TIMEOUT = SubLObjectFactory.makeSymbol("WITH-TCP-CONNECTION-WITH-TIMEOUT");
        $list41 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("WITH-TCP-CONNECTION"));
        $sym42$WITH_TCP_CONNECTION = SubLObjectFactory.makeSymbol("WITH-TCP-CONNECTION");
        $str43$Connection_to__A__A_timed_out_ = SubLObjectFactory.makeString("Connection to ~A:~A timed out.");
        $list44 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("VARIABLES"), (SubLObject)SubLObjectFactory.makeSymbol("EXPRESSION"));
        $sym45$LISTP = SubLObjectFactory.makeSymbol("LISTP");
        $sym46$CMULTIPLE_VALUE_BIND = SubLObjectFactory.makeSymbol("CMULTIPLE-VALUE-BIND");
        $sym47$CMULTIPLE_VALUE_SETQ = SubLObjectFactory.makeSymbol("CMULTIPLE-VALUE-SETQ");
        $list48 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("VARIABLES"), (SubLObject)SubLObjectFactory.makeSymbol("EXPRESSION"), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $sym49$WITH_SPACE_PROFILING = SubLObjectFactory.makeSymbol("WITH-SPACE-PROFILING");
        $list50 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("&KEY"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("STREAM"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("*STANDARD-OUTPUT*")))), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $list51 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("STREAM"));
        $kw52$STREAM = SubLObjectFactory.makeKeyword("STREAM");
        $sym53$_STANDARD_OUTPUT_ = SubLObjectFactory.makeSymbol("*STANDARD-OUTPUT*");
        $sym54$WITH_SPACE_PROFILING_SL2C = SubLObjectFactory.makeSymbol("WITH-SPACE-PROFILING-SL2C");
        $sym55$SPACE_INFO = SubLObjectFactory.makeUninternedSymbol("SPACE-INFO");
        $list56 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ADD-SPACE-PROBE", "SUBLISP")));
        $sym57$REMOVE_SPACE_PROBE = SubLObjectFactory.makeSymbol("REMOVE-SPACE-PROBE", "SUBLISP");
        $sym58$_INTERPRET_CSPACE_RESULTS = SubLObjectFactory.makeSymbol("%INTERPRET-CSPACE-RESULTS", "SUBLISP");
        $list59 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("COMMENT-STRING"));
        $sym60$STRINGP = SubLObjectFactory.makeSymbol("STRINGP");
        $list61 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PROGN"));
    }
}

/*

	Total time: 255 ms
	
*/