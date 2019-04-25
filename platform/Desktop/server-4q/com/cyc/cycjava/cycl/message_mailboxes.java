package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.UnaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDecl;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDeclNative;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLStructNative;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.visitation;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLSpecialOperatorDeclarations;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Locks;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.compatibility;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class message_mailboxes extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.message_mailboxes";
    public static final String myFingerPrint = "26e3e349aaa14c9cdee94a2e0cc7e179d893dce78516684832a93afe8749de0f";
    @SubLTranslatedFile.SubL(source = "cycl/message-mailboxes.lisp", position = 792L)
    public static SubLSymbol $dtp_message_mailbox_suite$;
    @SubLTranslatedFile.SubL(source = "cycl/message-mailboxes.lisp", position = 1238L)
    public static SubLSymbol $message_mailbox_suite$;
    @SubLTranslatedFile.SubL(source = "cycl/message-mailboxes.lisp", position = 1709L)
    public static SubLSymbol $message_mailbox_style$;
    private static final SubLSymbol $sym0$MESSAGE_MAILBOX_SUITE;
    private static final SubLSymbol $sym1$MESSAGE_MAILBOX_SUITE_P;
    private static final SubLList $list2;
    private static final SubLList $list3;
    private static final SubLList $list4;
    private static final SubLList $list5;
    private static final SubLSymbol $sym6$DEFAULT_STRUCT_PRINT_FUNCTION;
    private static final SubLSymbol $sym7$MESSAGE_MAILBOX_SUITE_PRINT_FUNCTION_TRAMPOLINE;
    private static final SubLList $list8;
    private static final SubLSymbol $sym9$MESSAGE_MAILBOX_SUITE_LOCK;
    private static final SubLSymbol $sym10$_CSETF_MESSAGE_MAILBOX_SUITE_LOCK;
    private static final SubLSymbol $sym11$MESSAGE_MAILBOX_SUITE_MAILBOXES;
    private static final SubLSymbol $sym12$_CSETF_MESSAGE_MAILBOX_SUITE_MAILBOXES;
    private static final SubLSymbol $kw13$LOCK;
    private static final SubLSymbol $kw14$MAILBOXES;
    private static final SubLString $str15$Invalid_slot__S_for_construction_;
    private static final SubLSymbol $kw16$BEGIN;
    private static final SubLSymbol $sym17$MAKE_MESSAGE_MAILBOX_SUITE;
    private static final SubLSymbol $kw18$SLOT;
    private static final SubLSymbol $kw19$END;
    private static final SubLSymbol $sym20$VISIT_DEFSTRUCT_OBJECT_MESSAGE_MAILBOX_SUITE_METHOD;
    private static final SubLString $str21$Message_Mailbox_Suite;
    private static final SubLList $list22;
    private static final SubLSymbol $sym23$CLET;
    private static final SubLSymbol $sym24$_MESSAGE_MAILBOX_SUITE_;
    private static final SubLList $list25;
    private static final SubLSymbol $sym26$WITH_LOCK_HELD;
    private static final SubLSymbol $kw27$NON_BLOCKING;
    private static final SubLList $list28;
    private static final SubLList $list29;
    private static final SubLSymbol $sym30$PIF;
    private static final SubLList $list31;
    private static final SubLSymbol $sym32$ENQUEUE;
    private static final SubLSymbol $sym33$IPC_ENQUEUE;
    private static final SubLList $list34;
    private static final SubLSymbol $sym35$FIF;
    private static final SubLSymbol $sym36$QUEUE_P;
    private static final SubLSymbol $sym37$IPC_QUEUE_P;
    private static final SubLList $list38;
    private static final SubLList $list39;
    private static final SubLSymbol $sym40$NEW_IPC_QUEUE;
    private static final SubLSymbol $sym41$QUEUE_EMPTY_P;
    private static final SubLString $str42$;
    private static final SubLSymbol $sym43$DEQUEUE;
    private static final SubLSymbol $sym44$IPC_DEQUEUE;
    private static final SubLSymbol $sym45$QUEUE_SIZE;
    private static final SubLSymbol $sym46$IPC_CURRENT_QUEUE_SIZE;
    private static final SubLString $str47$Message_Mailbox;
    private static final SubLString $str48$Address__S___;
    private static final SubLString $str49$_D_messages___;
    
    @SubLTranslatedFile.SubL(source = "cycl/message-mailboxes.lisp", position = 792L)
    public static SubLObject message_mailbox_suite_print_function_trampoline(final SubLObject v_object, final SubLObject stream) {
        compatibility.default_struct_print_function(v_object, stream, (SubLObject)message_mailboxes.ZERO_INTEGER);
        return (SubLObject)message_mailboxes.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/message-mailboxes.lisp", position = 792L)
    public static SubLObject message_mailbox_suite_p(final SubLObject v_object) {
        return (SubLObject)((v_object.getClass() == $message_mailbox_suite_native.class) ? message_mailboxes.T : message_mailboxes.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/message-mailboxes.lisp", position = 792L)
    public static SubLObject message_mailbox_suite_lock(final SubLObject v_object) {
        assert message_mailboxes.NIL != message_mailbox_suite_p(v_object) : v_object;
        return v_object.getField2();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/message-mailboxes.lisp", position = 792L)
    public static SubLObject message_mailbox_suite_mailboxes(final SubLObject v_object) {
        assert message_mailboxes.NIL != message_mailbox_suite_p(v_object) : v_object;
        return v_object.getField3();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/message-mailboxes.lisp", position = 792L)
    public static SubLObject _csetf_message_mailbox_suite_lock(final SubLObject v_object, final SubLObject value) {
        assert message_mailboxes.NIL != message_mailbox_suite_p(v_object) : v_object;
        return v_object.setField2(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/message-mailboxes.lisp", position = 792L)
    public static SubLObject _csetf_message_mailbox_suite_mailboxes(final SubLObject v_object, final SubLObject value) {
        assert message_mailboxes.NIL != message_mailbox_suite_p(v_object) : v_object;
        return v_object.setField3(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/message-mailboxes.lisp", position = 792L)
    public static SubLObject make_message_mailbox_suite(SubLObject arglist) {
        if (arglist == message_mailboxes.UNPROVIDED) {
            arglist = (SubLObject)message_mailboxes.NIL;
        }
        final SubLObject v_new = (SubLObject)new $message_mailbox_suite_native();
        SubLObject next;
        SubLObject current_arg;
        SubLObject current_value;
        SubLObject pcase_var;
        for (next = (SubLObject)message_mailboxes.NIL, next = arglist; message_mailboxes.NIL != next; next = conses_high.cddr(next)) {
            current_arg = next.first();
            current_value = conses_high.cadr(next);
            pcase_var = current_arg;
            if (pcase_var.eql((SubLObject)message_mailboxes.$kw13$LOCK)) {
                _csetf_message_mailbox_suite_lock(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)message_mailboxes.$kw14$MAILBOXES)) {
                _csetf_message_mailbox_suite_mailboxes(v_new, current_value);
            }
            else {
                Errors.error((SubLObject)message_mailboxes.$str15$Invalid_slot__S_for_construction_, current_arg);
            }
        }
        return v_new;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/message-mailboxes.lisp", position = 792L)
    public static SubLObject visit_defstruct_message_mailbox_suite(final SubLObject obj, final SubLObject visitor_fn) {
        Functions.funcall(visitor_fn, obj, (SubLObject)message_mailboxes.$kw16$BEGIN, (SubLObject)message_mailboxes.$sym17$MAKE_MESSAGE_MAILBOX_SUITE, (SubLObject)message_mailboxes.TWO_INTEGER);
        Functions.funcall(visitor_fn, obj, (SubLObject)message_mailboxes.$kw18$SLOT, (SubLObject)message_mailboxes.$kw13$LOCK, message_mailbox_suite_lock(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)message_mailboxes.$kw18$SLOT, (SubLObject)message_mailboxes.$kw14$MAILBOXES, message_mailbox_suite_mailboxes(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)message_mailboxes.$kw19$END, (SubLObject)message_mailboxes.$sym17$MAKE_MESSAGE_MAILBOX_SUITE, (SubLObject)message_mailboxes.TWO_INTEGER);
        return obj;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/message-mailboxes.lisp", position = 792L)
    public static SubLObject visit_defstruct_object_message_mailbox_suite_method(final SubLObject obj, final SubLObject visitor_fn) {
        return visit_defstruct_message_mailbox_suite(obj, visitor_fn);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/message-mailboxes.lisp", position = 946L)
    public static SubLObject new_message_mailbox_suite() {
        final SubLObject mbox_suite = make_message_mailbox_suite((SubLObject)message_mailboxes.UNPROVIDED);
        _csetf_message_mailbox_suite_lock(mbox_suite, Locks.make_lock((SubLObject)message_mailboxes.$str21$Message_Mailbox_Suite));
        _csetf_message_mailbox_suite_mailboxes(mbox_suite, dictionary.new_dictionary(Symbols.symbol_function((SubLObject)message_mailboxes.EQUALP), (SubLObject)message_mailboxes.UNPROVIDED));
        return mbox_suite;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/message-mailboxes.lisp", position = 1318L)
    public static SubLObject with_message_mailbox_suite(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)message_mailboxes.$list22);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject mailbox = (SubLObject)message_mailboxes.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)message_mailboxes.$list22);
        mailbox = current.first();
        current = current.rest();
        if (message_mailboxes.NIL == current) {
            final SubLObject body;
            current = (body = temp);
            return (SubLObject)ConsesLow.listS((SubLObject)message_mailboxes.$sym23$CLET, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)message_mailboxes.$sym24$_MESSAGE_MAILBOX_SUITE_, mailbox)), ConsesLow.append(body, (SubLObject)message_mailboxes.NIL));
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)message_mailboxes.$list22);
        return (SubLObject)message_mailboxes.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/message-mailboxes.lisp", position = 1457L)
    public static SubLObject with_message_mailbox_suite_lock_held(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)message_mailboxes.$list25);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject mbox_suite = (SubLObject)message_mailboxes.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)message_mailboxes.$list25);
        mbox_suite = current.first();
        current = current.rest();
        if (message_mailboxes.NIL == current) {
            final SubLObject body;
            current = (body = temp);
            return (SubLObject)ConsesLow.listS((SubLObject)message_mailboxes.$sym26$WITH_LOCK_HELD, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)message_mailboxes.$sym9$MESSAGE_MAILBOX_SUITE_LOCK, mbox_suite)), ConsesLow.append(body, (SubLObject)message_mailboxes.NIL));
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)message_mailboxes.$list25);
        return (SubLObject)message_mailboxes.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/message-mailboxes.lisp", position = 1625L)
    public static SubLObject current_message_mailbox_suite() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return message_mailboxes.$message_mailbox_suite$.getDynamicValue(thread);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/message-mailboxes.lisp", position = 1805L)
    public static SubLObject with_blocking_message_mailbox_style(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return (SubLObject)ConsesLow.listS((SubLObject)message_mailboxes.$sym23$CLET, (SubLObject)message_mailboxes.$list28, ConsesLow.append(body, (SubLObject)message_mailboxes.NIL));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/message-mailboxes.lisp", position = 1948L)
    public static SubLObject is_non_blocking_message_mailboxP() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return Equality.eq(message_mailboxes.$message_mailbox_style$.getDynamicValue(thread), (SubLObject)message_mailboxes.$kw27$NON_BLOCKING);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/message-mailboxes.lisp", position = 2053L)
    public static SubLObject is_blocking_message_mailboxP() {
        return (SubLObject)SubLObjectFactory.makeBoolean(message_mailboxes.NIL == is_non_blocking_message_mailboxP());
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/message-mailboxes.lisp", position = 2153L)
    public static SubLObject add_message_to_message_mailbox(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject message = (SubLObject)message_mailboxes.NIL;
        SubLObject mailbox = (SubLObject)message_mailboxes.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)message_mailboxes.$list29);
        message = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)message_mailboxes.$list29);
        mailbox = current.first();
        current = current.rest();
        if (message_mailboxes.NIL == current) {
            return (SubLObject)ConsesLow.list((SubLObject)message_mailboxes.$sym30$PIF, (SubLObject)message_mailboxes.$list31, (SubLObject)ConsesLow.list((SubLObject)message_mailboxes.$sym32$ENQUEUE, message, mailbox), (SubLObject)ConsesLow.list((SubLObject)message_mailboxes.$sym33$IPC_ENQUEUE, message, mailbox));
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)message_mailboxes.$list29);
        return (SubLObject)message_mailboxes.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/message-mailboxes.lisp", position = 2359L)
    public static SubLObject is_message_mailbox_p(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject mailbox = (SubLObject)message_mailboxes.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)message_mailboxes.$list34);
        mailbox = current.first();
        current = current.rest();
        if (message_mailboxes.NIL == current) {
            return (SubLObject)ConsesLow.list((SubLObject)message_mailboxes.$sym35$FIF, (SubLObject)message_mailboxes.$list31, (SubLObject)ConsesLow.list((SubLObject)message_mailboxes.$sym36$QUEUE_P, mailbox), (SubLObject)ConsesLow.list((SubLObject)message_mailboxes.$sym37$IPC_QUEUE_P, mailbox));
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)message_mailboxes.$list34);
        return (SubLObject)message_mailboxes.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/message-mailboxes.lisp", position = 2530L)
    public static SubLObject allocate_message_mailbox(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject name = (SubLObject)message_mailboxes.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)message_mailboxes.$list38);
        name = current.first();
        current = current.rest();
        if (message_mailboxes.NIL == current) {
            return (SubLObject)ConsesLow.list((SubLObject)message_mailboxes.$sym35$FIF, (SubLObject)message_mailboxes.$list31, (SubLObject)message_mailboxes.$list39, (SubLObject)ConsesLow.list((SubLObject)message_mailboxes.$sym40$NEW_IPC_QUEUE, name));
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)message_mailboxes.$list38);
        return (SubLObject)message_mailboxes.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/message-mailboxes.lisp", position = 2696L)
    public static SubLObject remove_message_from_message_mailbox(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject mailbox = (SubLObject)message_mailboxes.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)message_mailboxes.$list34);
        mailbox = current.first();
        current = current.rest();
        if (message_mailboxes.NIL == current) {
            return (SubLObject)ConsesLow.list((SubLObject)message_mailboxes.$sym35$FIF, (SubLObject)message_mailboxes.$list31, (SubLObject)ConsesLow.list((SubLObject)message_mailboxes.$sym35$FIF, (SubLObject)ConsesLow.list((SubLObject)message_mailboxes.$sym41$QUEUE_EMPTY_P, mailbox), (SubLObject)message_mailboxes.$str42$, (SubLObject)ConsesLow.list((SubLObject)message_mailboxes.$sym43$DEQUEUE, mailbox)), (SubLObject)ConsesLow.list((SubLObject)message_mailboxes.$sym44$IPC_DEQUEUE, mailbox));
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)message_mailboxes.$list34);
        return (SubLObject)message_mailboxes.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/message-mailboxes.lisp", position = 2914L)
    public static SubLObject fetch_mailbox_size(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject mailbox = (SubLObject)message_mailboxes.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)message_mailboxes.$list34);
        mailbox = current.first();
        current = current.rest();
        if (message_mailboxes.NIL == current) {
            return (SubLObject)ConsesLow.list((SubLObject)message_mailboxes.$sym35$FIF, (SubLObject)message_mailboxes.$list31, (SubLObject)ConsesLow.list((SubLObject)message_mailboxes.$sym45$QUEUE_SIZE, mailbox), (SubLObject)ConsesLow.list((SubLObject)message_mailboxes.$sym46$IPC_CURRENT_QUEUE_SIZE, mailbox));
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)message_mailboxes.$list34);
        return (SubLObject)message_mailboxes.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/message-mailboxes.lisp", position = 3095L)
    public static SubLObject known_message_mailboxP(final SubLObject address) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject mbox_suite = message_mailboxes.$message_mailbox_suite$.getDynamicValue(thread);
        SubLObject result = (SubLObject)message_mailboxes.NIL;
        final SubLObject lock = message_mailbox_suite_lock(mbox_suite);
        SubLObject release = (SubLObject)message_mailboxes.NIL;
        try {
            release = Locks.seize_lock(lock);
            final SubLObject v_dictionary = message_mailbox_suite_mailboxes(mbox_suite);
            result = dictionary.dictionary_lookup(v_dictionary, address, (SubLObject)message_mailboxes.NIL);
        }
        finally {
            if (message_mailboxes.NIL != release) {
                Locks.release_lock(lock);
            }
        }
        return list_utilities.sublisp_boolean(result);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/message-mailboxes.lisp", position = 3439L)
    public static SubLObject store_mail_in_message_mailbox(final SubLObject address, final SubLObject message, SubLObject mbox_suite) {
        if (mbox_suite == message_mailboxes.UNPROVIDED) {
            mbox_suite = message_mailboxes.$message_mailbox_suite$.getDynamicValue();
        }
        final SubLObject mailbox = ensure_message_mailbox_allocation(address, mbox_suite);
        final SubLObject lock = message_mailbox_suite_lock(mbox_suite);
        SubLObject release = (SubLObject)message_mailboxes.NIL;
        try {
            release = Locks.seize_lock(lock);
            if (message_mailboxes.NIL != is_non_blocking_message_mailboxP()) {
                queues.enqueue(message, mailbox);
            }
            else {
                process_utilities.ipc_enqueue(message, mailbox, (SubLObject)message_mailboxes.UNPROVIDED);
            }
        }
        finally {
            if (message_mailboxes.NIL != release) {
                Locks.release_lock(lock);
            }
        }
        return address;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/message-mailboxes.lisp", position = 3848L)
    public static SubLObject ensure_message_mailbox_allocation(final SubLObject address, SubLObject mbox_suite) {
        if (mbox_suite == message_mailboxes.UNPROVIDED) {
            mbox_suite = message_mailboxes.$message_mailbox_suite$.getDynamicValue();
        }
        SubLObject mailbox = (SubLObject)message_mailboxes.NIL;
        final SubLObject lock = message_mailbox_suite_lock(mbox_suite);
        SubLObject release = (SubLObject)message_mailboxes.NIL;
        try {
            release = Locks.seize_lock(lock);
            final SubLObject v_dictionary = message_mailbox_suite_mailboxes(mbox_suite);
            mailbox = dictionary.dictionary_lookup(v_dictionary, address, (SubLObject)message_mailboxes.UNPROVIDED);
            if (message_mailboxes.NIL == ((message_mailboxes.NIL != is_non_blocking_message_mailboxP()) ? queues.queue_p(mailbox) : process_utilities.ipc_queue_p(mailbox))) {
                mailbox = ((message_mailboxes.NIL != is_non_blocking_message_mailboxP()) ? queues.create_queue((SubLObject)message_mailboxes.UNPROVIDED) : process_utilities.new_ipc_queue((SubLObject)message_mailboxes.$str47$Message_Mailbox));
                dictionary.dictionary_enter(v_dictionary, address, mailbox);
            }
        }
        finally {
            if (message_mailboxes.NIL != release) {
                Locks.release_lock(lock);
            }
        }
        return mailbox;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/message-mailboxes.lisp", position = 4365L)
    public static SubLObject deallocate_message_mailbox(final SubLObject address, SubLObject mbox_suite) {
        if (mbox_suite == message_mailboxes.UNPROVIDED) {
            mbox_suite = message_mailboxes.$message_mailbox_suite$.getDynamicValue();
        }
        SubLObject mailbox = (SubLObject)message_mailboxes.NIL;
        final SubLObject lock = message_mailbox_suite_lock(mbox_suite);
        SubLObject release = (SubLObject)message_mailboxes.NIL;
        try {
            release = Locks.seize_lock(lock);
            final SubLObject v_dictionary = message_mailbox_suite_mailboxes(mbox_suite);
            mailbox = dictionary.dictionary_lookup(v_dictionary, address, (SubLObject)message_mailboxes.UNPROVIDED);
            if (message_mailboxes.NIL != ((message_mailboxes.NIL != is_non_blocking_message_mailboxP()) ? queues.queue_p(mailbox) : process_utilities.ipc_queue_p(mailbox))) {
                dictionary.dictionary_remove(v_dictionary, address);
            }
        }
        finally {
            if (message_mailboxes.NIL != release) {
                Locks.release_lock(lock);
            }
        }
        return mailbox;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/message-mailboxes.lisp", position = 4794L)
    public static SubLObject retrieve_mail_from_message_mailbox(final SubLObject address) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject mbox_suite = message_mailboxes.$message_mailbox_suite$.getDynamicValue(thread);
        SubLObject message = (SubLObject)message_mailboxes.NIL;
        SubLObject mailbox = (SubLObject)message_mailboxes.NIL;
        final SubLObject lock = message_mailbox_suite_lock(mbox_suite);
        SubLObject release = (SubLObject)message_mailboxes.NIL;
        try {
            release = Locks.seize_lock(lock);
            final SubLObject v_dictionary = message_mailbox_suite_mailboxes(mbox_suite);
            mailbox = dictionary.dictionary_lookup(v_dictionary, address, (SubLObject)message_mailboxes.UNPROVIDED);
        }
        finally {
            if (message_mailboxes.NIL != release) {
                Locks.release_lock(lock);
            }
        }
        if (message_mailboxes.NIL != ((message_mailboxes.NIL != is_non_blocking_message_mailboxP()) ? queues.queue_p(mailbox) : process_utilities.ipc_queue_p(mailbox))) {
            if (message_mailboxes.NIL != is_non_blocking_message_mailboxP()) {
                final SubLObject lock_$1 = message_mailbox_suite_lock(mbox_suite);
                SubLObject release_$2 = (SubLObject)message_mailboxes.NIL;
                try {
                    release_$2 = Locks.seize_lock(lock_$1);
                    message = (SubLObject)((message_mailboxes.NIL != is_non_blocking_message_mailboxP()) ? ((message_mailboxes.NIL != queues.queue_empty_p(mailbox)) ? message_mailboxes.$str42$ : queues.dequeue(mailbox)) : process_utilities.ipc_dequeue(mailbox, (SubLObject)message_mailboxes.UNPROVIDED));
                }
                finally {
                    if (message_mailboxes.NIL != release_$2) {
                        Locks.release_lock(lock_$1);
                    }
                }
            }
            else {
                message = (SubLObject)((message_mailboxes.NIL != is_non_blocking_message_mailboxP()) ? ((message_mailboxes.NIL != queues.queue_empty_p(mailbox)) ? message_mailboxes.$str42$ : queues.dequeue(mailbox)) : process_utilities.ipc_dequeue(mailbox, (SubLObject)message_mailboxes.UNPROVIDED));
            }
        }
        return message;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/message-mailboxes.lisp", position = 5686L)
    public static SubLObject show_current_message_mailbox_suite(SubLObject stream) {
        if (stream == message_mailboxes.UNPROVIDED) {
            stream = (SubLObject)message_mailboxes.T;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject mbox_suite = message_mailboxes.$message_mailbox_suite$.getDynamicValue(thread);
        final SubLObject v_dictionary = message_mailbox_suite_mailboxes(mbox_suite);
        SubLObject iteration_state;
        for (iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(v_dictionary)); message_mailboxes.NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
            thread.resetMultipleValues();
            final SubLObject address = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
            final SubLObject mbox = thread.secondMultipleValue();
            thread.resetMultipleValues();
            PrintLow.format(stream, (SubLObject)message_mailboxes.$str48$Address__S___, address);
            PrintLow.format(stream, (SubLObject)message_mailboxes.$str49$_D_messages___, (message_mailboxes.NIL != is_non_blocking_message_mailboxP()) ? queues.queue_size(mbox) : process_utilities.ipc_current_queue_size(mbox));
        }
        dictionary_contents.do_dictionary_contents_finalize(iteration_state);
        return stream;
    }
    
    public static SubLObject declare_message_mailboxes_file() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.message_mailboxes", "message_mailbox_suite_print_function_trampoline", "MESSAGE-MAILBOX-SUITE-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.message_mailboxes", "message_mailbox_suite_p", "MESSAGE-MAILBOX-SUITE-P", 1, 0, false);
        new $message_mailbox_suite_p$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.message_mailboxes", "message_mailbox_suite_lock", "MESSAGE-MAILBOX-SUITE-LOCK", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.message_mailboxes", "message_mailbox_suite_mailboxes", "MESSAGE-MAILBOX-SUITE-MAILBOXES", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.message_mailboxes", "_csetf_message_mailbox_suite_lock", "_CSETF-MESSAGE-MAILBOX-SUITE-LOCK", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.message_mailboxes", "_csetf_message_mailbox_suite_mailboxes", "_CSETF-MESSAGE-MAILBOX-SUITE-MAILBOXES", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.message_mailboxes", "make_message_mailbox_suite", "MAKE-MESSAGE-MAILBOX-SUITE", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.message_mailboxes", "visit_defstruct_message_mailbox_suite", "VISIT-DEFSTRUCT-MESSAGE-MAILBOX-SUITE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.message_mailboxes", "visit_defstruct_object_message_mailbox_suite_method", "VISIT-DEFSTRUCT-OBJECT-MESSAGE-MAILBOX-SUITE-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.message_mailboxes", "new_message_mailbox_suite", "NEW-MESSAGE-MAILBOX-SUITE", 0, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.message_mailboxes", "with_message_mailbox_suite", "WITH-MESSAGE-MAILBOX-SUITE");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.message_mailboxes", "with_message_mailbox_suite_lock_held", "WITH-MESSAGE-MAILBOX-SUITE-LOCK-HELD");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.message_mailboxes", "current_message_mailbox_suite", "CURRENT-MESSAGE-MAILBOX-SUITE", 0, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.message_mailboxes", "with_blocking_message_mailbox_style", "WITH-BLOCKING-MESSAGE-MAILBOX-STYLE");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.message_mailboxes", "is_non_blocking_message_mailboxP", "IS-NON-BLOCKING-MESSAGE-MAILBOX?", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.message_mailboxes", "is_blocking_message_mailboxP", "IS-BLOCKING-MESSAGE-MAILBOX?", 0, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.message_mailboxes", "add_message_to_message_mailbox", "ADD-MESSAGE-TO-MESSAGE-MAILBOX");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.message_mailboxes", "is_message_mailbox_p", "IS-MESSAGE-MAILBOX-P");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.message_mailboxes", "allocate_message_mailbox", "ALLOCATE-MESSAGE-MAILBOX");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.message_mailboxes", "remove_message_from_message_mailbox", "REMOVE-MESSAGE-FROM-MESSAGE-MAILBOX");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.message_mailboxes", "fetch_mailbox_size", "FETCH-MAILBOX-SIZE");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.message_mailboxes", "known_message_mailboxP", "KNOWN-MESSAGE-MAILBOX?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.message_mailboxes", "store_mail_in_message_mailbox", "STORE-MAIL-IN-MESSAGE-MAILBOX", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.message_mailboxes", "ensure_message_mailbox_allocation", "ENSURE-MESSAGE-MAILBOX-ALLOCATION", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.message_mailboxes", "deallocate_message_mailbox", "DEALLOCATE-MESSAGE-MAILBOX", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.message_mailboxes", "retrieve_mail_from_message_mailbox", "RETRIEVE-MAIL-FROM-MESSAGE-MAILBOX", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.message_mailboxes", "show_current_message_mailbox_suite", "SHOW-CURRENT-MESSAGE-MAILBOX-SUITE", 0, 1, false);
        return (SubLObject)message_mailboxes.NIL;
    }
    
    public static SubLObject init_message_mailboxes_file() {
        message_mailboxes.$dtp_message_mailbox_suite$ = SubLFiles.defconstant("*DTP-MESSAGE-MAILBOX-SUITE*", (SubLObject)message_mailboxes.$sym0$MESSAGE_MAILBOX_SUITE);
        message_mailboxes.$message_mailbox_suite$ = SubLFiles.defparameter("*MESSAGE-MAILBOX-SUITE*", new_message_mailbox_suite());
        message_mailboxes.$message_mailbox_style$ = SubLFiles.defparameter("*MESSAGE-MAILBOX-STYLE*", (SubLObject)message_mailboxes.$kw27$NON_BLOCKING);
        return (SubLObject)message_mailboxes.NIL;
    }
    
    public static SubLObject setup_message_mailboxes_file() {
        Structures.register_method(print_high.$print_object_method_table$.getGlobalValue(), message_mailboxes.$dtp_message_mailbox_suite$.getGlobalValue(), Symbols.symbol_function((SubLObject)message_mailboxes.$sym7$MESSAGE_MAILBOX_SUITE_PRINT_FUNCTION_TRAMPOLINE));
        SubLSpecialOperatorDeclarations.proclaim((SubLObject)message_mailboxes.$list8);
        Structures.def_csetf((SubLObject)message_mailboxes.$sym9$MESSAGE_MAILBOX_SUITE_LOCK, (SubLObject)message_mailboxes.$sym10$_CSETF_MESSAGE_MAILBOX_SUITE_LOCK);
        Structures.def_csetf((SubLObject)message_mailboxes.$sym11$MESSAGE_MAILBOX_SUITE_MAILBOXES, (SubLObject)message_mailboxes.$sym12$_CSETF_MESSAGE_MAILBOX_SUITE_MAILBOXES);
        Equality.identity((SubLObject)message_mailboxes.$sym0$MESSAGE_MAILBOX_SUITE);
        Structures.register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), message_mailboxes.$dtp_message_mailbox_suite$.getGlobalValue(), Symbols.symbol_function((SubLObject)message_mailboxes.$sym20$VISIT_DEFSTRUCT_OBJECT_MESSAGE_MAILBOX_SUITE_METHOD));
        return (SubLObject)message_mailboxes.NIL;
    }
    
    @Override
	public void declareFunctions() {
        declare_message_mailboxes_file();
    }
    
    @Override
	public void initializeVariables() {
        init_message_mailboxes_file();
    }
    
    @Override
	public void runTopLevelForms() {
        setup_message_mailboxes_file();
    }
    
    static {
        me = (SubLFile)new message_mailboxes();
        message_mailboxes.$dtp_message_mailbox_suite$ = null;
        message_mailboxes.$message_mailbox_suite$ = null;
        message_mailboxes.$message_mailbox_style$ = null;
        $sym0$MESSAGE_MAILBOX_SUITE = SubLObjectFactory.makeSymbol("MESSAGE-MAILBOX-SUITE");
        $sym1$MESSAGE_MAILBOX_SUITE_P = SubLObjectFactory.makeSymbol("MESSAGE-MAILBOX-SUITE-P");
        $list2 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("LOCK"), (SubLObject)SubLObjectFactory.makeSymbol("MAILBOXES"));
        $list3 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("LOCK"), (SubLObject)SubLObjectFactory.makeKeyword("MAILBOXES"));
        $list4 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("MESSAGE-MAILBOX-SUITE-LOCK"), (SubLObject)SubLObjectFactory.makeSymbol("MESSAGE-MAILBOX-SUITE-MAILBOXES"));
        $list5 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("_CSETF-MESSAGE-MAILBOX-SUITE-LOCK"), (SubLObject)SubLObjectFactory.makeSymbol("_CSETF-MESSAGE-MAILBOX-SUITE-MAILBOXES"));
        $sym6$DEFAULT_STRUCT_PRINT_FUNCTION = SubLObjectFactory.makeSymbol("DEFAULT-STRUCT-PRINT-FUNCTION");
        $sym7$MESSAGE_MAILBOX_SUITE_PRINT_FUNCTION_TRAMPOLINE = SubLObjectFactory.makeSymbol("MESSAGE-MAILBOX-SUITE-PRINT-FUNCTION-TRAMPOLINE");
        $list8 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("OPTIMIZE-FUNCALL"), (SubLObject)SubLObjectFactory.makeSymbol("MESSAGE-MAILBOX-SUITE-P"));
        $sym9$MESSAGE_MAILBOX_SUITE_LOCK = SubLObjectFactory.makeSymbol("MESSAGE-MAILBOX-SUITE-LOCK");
        $sym10$_CSETF_MESSAGE_MAILBOX_SUITE_LOCK = SubLObjectFactory.makeSymbol("_CSETF-MESSAGE-MAILBOX-SUITE-LOCK");
        $sym11$MESSAGE_MAILBOX_SUITE_MAILBOXES = SubLObjectFactory.makeSymbol("MESSAGE-MAILBOX-SUITE-MAILBOXES");
        $sym12$_CSETF_MESSAGE_MAILBOX_SUITE_MAILBOXES = SubLObjectFactory.makeSymbol("_CSETF-MESSAGE-MAILBOX-SUITE-MAILBOXES");
        $kw13$LOCK = SubLObjectFactory.makeKeyword("LOCK");
        $kw14$MAILBOXES = SubLObjectFactory.makeKeyword("MAILBOXES");
        $str15$Invalid_slot__S_for_construction_ = SubLObjectFactory.makeString("Invalid slot ~S for construction function");
        $kw16$BEGIN = SubLObjectFactory.makeKeyword("BEGIN");
        $sym17$MAKE_MESSAGE_MAILBOX_SUITE = SubLObjectFactory.makeSymbol("MAKE-MESSAGE-MAILBOX-SUITE");
        $kw18$SLOT = SubLObjectFactory.makeKeyword("SLOT");
        $kw19$END = SubLObjectFactory.makeKeyword("END");
        $sym20$VISIT_DEFSTRUCT_OBJECT_MESSAGE_MAILBOX_SUITE_METHOD = SubLObjectFactory.makeSymbol("VISIT-DEFSTRUCT-OBJECT-MESSAGE-MAILBOX-SUITE-METHOD");
        $str21$Message_Mailbox_Suite = SubLObjectFactory.makeString("Message Mailbox Suite");
        $list22 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("MAILBOX")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $sym23$CLET = SubLObjectFactory.makeSymbol("CLET");
        $sym24$_MESSAGE_MAILBOX_SUITE_ = SubLObjectFactory.makeSymbol("*MESSAGE-MAILBOX-SUITE*");
        $list25 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("MBOX-SUITE")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $sym26$WITH_LOCK_HELD = SubLObjectFactory.makeSymbol("WITH-LOCK-HELD");
        $kw27$NON_BLOCKING = SubLObjectFactory.makeKeyword("NON-BLOCKING");
        $list28 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*MESSAGE-MAILBOX-STYLE*"), (SubLObject)SubLObjectFactory.makeKeyword("BLOCKING")));
        $list29 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("MESSAGE"), (SubLObject)SubLObjectFactory.makeSymbol("MAILBOX"));
        $sym30$PIF = SubLObjectFactory.makeSymbol("PIF");
        $list31 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("IS-NON-BLOCKING-MESSAGE-MAILBOX?"));
        $sym32$ENQUEUE = SubLObjectFactory.makeSymbol("ENQUEUE");
        $sym33$IPC_ENQUEUE = SubLObjectFactory.makeSymbol("IPC-ENQUEUE");
        $list34 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("MAILBOX"));
        $sym35$FIF = SubLObjectFactory.makeSymbol("FIF");
        $sym36$QUEUE_P = SubLObjectFactory.makeSymbol("QUEUE-P");
        $sym37$IPC_QUEUE_P = SubLObjectFactory.makeSymbol("IPC-QUEUE-P");
        $list38 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NAME"));
        $list39 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CREATE-QUEUE"));
        $sym40$NEW_IPC_QUEUE = SubLObjectFactory.makeSymbol("NEW-IPC-QUEUE");
        $sym41$QUEUE_EMPTY_P = SubLObjectFactory.makeSymbol("QUEUE-EMPTY-P");
        $str42$ = SubLObjectFactory.makeString("");
        $sym43$DEQUEUE = SubLObjectFactory.makeSymbol("DEQUEUE");
        $sym44$IPC_DEQUEUE = SubLObjectFactory.makeSymbol("IPC-DEQUEUE");
        $sym45$QUEUE_SIZE = SubLObjectFactory.makeSymbol("QUEUE-SIZE");
        $sym46$IPC_CURRENT_QUEUE_SIZE = SubLObjectFactory.makeSymbol("IPC-CURRENT-QUEUE-SIZE");
        $str47$Message_Mailbox = SubLObjectFactory.makeString("Message Mailbox");
        $str48$Address__S___ = SubLObjectFactory.makeString("Address ~S : ");
        $str49$_D_messages___ = SubLObjectFactory.makeString("~D messages.~%");
    }
    
    public static final class $message_mailbox_suite_native extends SubLStructNative
    {
        public SubLObject $lock;
        public SubLObject $mailboxes;
        private static final SubLStructDeclNative structDecl;
        
        public $message_mailbox_suite_native() {
            this.$lock = (SubLObject)CommonSymbols.NIL;
            this.$mailboxes = (SubLObject)CommonSymbols.NIL;
        }
        
        @Override
		public SubLStructDecl getStructDecl() {
            return (SubLStructDecl)$message_mailbox_suite_native.structDecl;
        }
        
        @Override
		public SubLObject getField2() {
            return this.$lock;
        }
        
        @Override
		public SubLObject getField3() {
            return this.$mailboxes;
        }
        
        @Override
		public SubLObject setField2(final SubLObject value) {
            return this.$lock = value;
        }
        
        @Override
		public SubLObject setField3(final SubLObject value) {
            return this.$mailboxes = value;
        }
        
        static {
            structDecl = Structures.makeStructDeclNative((Class)$message_mailbox_suite_native.class, message_mailboxes.$sym0$MESSAGE_MAILBOX_SUITE, message_mailboxes.$sym1$MESSAGE_MAILBOX_SUITE_P, message_mailboxes.$list2, message_mailboxes.$list3, new String[] { "$lock", "$mailboxes" }, message_mailboxes.$list4, message_mailboxes.$list5, message_mailboxes.$sym6$DEFAULT_STRUCT_PRINT_FUNCTION);
        }
    }
    
    public static final class $message_mailbox_suite_p$UnaryFunction extends UnaryFunction
    {
        public $message_mailbox_suite_p$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("MESSAGE-MAILBOX-SUITE-P"));
        }
        
        @Override
		public SubLObject processItem(final SubLObject arg1) {
            return message_mailboxes.message_mailbox_suite_p(arg1);
        }
    }
}

/*

	Total time: 129 ms
	
*/