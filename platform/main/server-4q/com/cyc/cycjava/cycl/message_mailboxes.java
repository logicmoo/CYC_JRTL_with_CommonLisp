package com.cyc.cycjava.cycl;


import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions.funcall;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Locks.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow.format;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.symbol_function;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high.$print_object_method_table$;
import static com.cyc.tool.subl.util.SubLFiles.*;

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
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.compatibility;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.visitation;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile; 
 public final class message_mailboxes extends SubLTranslatedFile {
    public static final SubLFile me = new message_mailboxes();

    public static final String myName = "com.cyc.cycjava.cycl.message_mailboxes";

    public static final String myFingerPrint = "26e3e349aaa14c9cdee94a2e0cc7e179d893dce78516684832a93afe8749de0f";

    // defconstant
    public static final SubLSymbol $dtp_message_mailbox_suite$ = makeSymbol("*DTP-MESSAGE-MAILBOX-SUITE*");



    // defparameter
    public static final SubLSymbol $message_mailbox_style$ = makeSymbol("*MESSAGE-MAILBOX-STYLE*");

    // Internal Constants
    public static final SubLSymbol MESSAGE_MAILBOX_SUITE = makeSymbol("MESSAGE-MAILBOX-SUITE");

    public static final SubLSymbol MESSAGE_MAILBOX_SUITE_P = makeSymbol("MESSAGE-MAILBOX-SUITE-P");

    public static final SubLList $list2 = list(makeSymbol("LOCK"), makeSymbol("MAILBOXES"));

    public static final SubLList $list3 = list(makeKeyword("LOCK"), makeKeyword("MAILBOXES"));

    public static final SubLList $list4 = list(makeSymbol("MESSAGE-MAILBOX-SUITE-LOCK"), makeSymbol("MESSAGE-MAILBOX-SUITE-MAILBOXES"));

    public static final SubLList $list5 = list(makeSymbol("_CSETF-MESSAGE-MAILBOX-SUITE-LOCK"), makeSymbol("_CSETF-MESSAGE-MAILBOX-SUITE-MAILBOXES"));



    public static final SubLSymbol MESSAGE_MAILBOX_SUITE_PRINT_FUNCTION_TRAMPOLINE = makeSymbol("MESSAGE-MAILBOX-SUITE-PRINT-FUNCTION-TRAMPOLINE");

    private static final SubLList $list8 = list(makeSymbol("OPTIMIZE-FUNCALL"), makeSymbol("MESSAGE-MAILBOX-SUITE-P"));

    private static final SubLSymbol MESSAGE_MAILBOX_SUITE_LOCK = makeSymbol("MESSAGE-MAILBOX-SUITE-LOCK");

    private static final SubLSymbol _CSETF_MESSAGE_MAILBOX_SUITE_LOCK = makeSymbol("_CSETF-MESSAGE-MAILBOX-SUITE-LOCK");

    private static final SubLSymbol MESSAGE_MAILBOX_SUITE_MAILBOXES = makeSymbol("MESSAGE-MAILBOX-SUITE-MAILBOXES");

    private static final SubLSymbol _CSETF_MESSAGE_MAILBOX_SUITE_MAILBOXES = makeSymbol("_CSETF-MESSAGE-MAILBOX-SUITE-MAILBOXES");





    private static final SubLString $str15$Invalid_slot__S_for_construction_ = makeString("Invalid slot ~S for construction function");



    private static final SubLSymbol MAKE_MESSAGE_MAILBOX_SUITE = makeSymbol("MAKE-MESSAGE-MAILBOX-SUITE");





    private static final SubLSymbol VISIT_DEFSTRUCT_OBJECT_MESSAGE_MAILBOX_SUITE_METHOD = makeSymbol("VISIT-DEFSTRUCT-OBJECT-MESSAGE-MAILBOX-SUITE-METHOD");

    private static final SubLString $$$Message_Mailbox_Suite = makeString("Message Mailbox Suite");

    public static final SubLList $list22 = list(list(makeSymbol("MAILBOX")), makeSymbol("&BODY"), makeSymbol("BODY"));



    public static final SubLSymbol $message_mailbox_suite$ = makeSymbol("*MESSAGE-MAILBOX-SUITE*");

    public static final SubLList $list25 = list(list(makeSymbol("MBOX-SUITE")), makeSymbol("&BODY"), makeSymbol("BODY"));





    public static final SubLList $list28 = list(list(makeSymbol("*MESSAGE-MAILBOX-STYLE*"), makeKeyword("BLOCKING")));

    private static final SubLList $list29 = list(makeSymbol("MESSAGE"), makeSymbol("MAILBOX"));



    private static final SubLList $list31 = list(makeSymbol("IS-NON-BLOCKING-MESSAGE-MAILBOX?"));



    private static final SubLSymbol IPC_ENQUEUE = makeSymbol("IPC-ENQUEUE");

    private static final SubLList $list34 = list(makeSymbol("MAILBOX"));





    private static final SubLSymbol IPC_QUEUE_P = makeSymbol("IPC-QUEUE-P");

    private static final SubLList $list38 = list(makeSymbol("NAME"));

    private static final SubLList $list39 = list(makeSymbol("CREATE-QUEUE"));

    private static final SubLSymbol NEW_IPC_QUEUE = makeSymbol("NEW-IPC-QUEUE");



    private static final SubLString $str42$ = makeString("");



    private static final SubLSymbol IPC_DEQUEUE = makeSymbol("IPC-DEQUEUE");

    private static final SubLSymbol QUEUE_SIZE = makeSymbol("QUEUE-SIZE");

    private static final SubLSymbol IPC_CURRENT_QUEUE_SIZE = makeSymbol("IPC-CURRENT-QUEUE-SIZE");

    private static final SubLString $$$Message_Mailbox = makeString("Message Mailbox");

    private static final SubLString $str48$Address__S___ = makeString("Address ~S : ");

    private static final SubLString $str49$_D_messages___ = makeString("~D messages.~%");

    public static SubLObject message_mailbox_suite_print_function_trampoline(final SubLObject v_object, final SubLObject stream) {
        compatibility.default_struct_print_function(v_object, stream, ZERO_INTEGER);
        return NIL;
    }

    public static SubLObject message_mailbox_suite_p(final SubLObject v_object) {
        return v_object.getJavaClass() ==$message_mailbox_suite_native.class ? T : NIL;
    }

    public static SubLObject message_mailbox_suite_lock(final SubLObject v_object) {
        assert NIL != message_mailbox_suite_p(v_object) : "message_mailboxes.message_mailbox_suite_p error :" + v_object;
        return v_object.getField2();
    }

    public static SubLObject message_mailbox_suite_mailboxes(final SubLObject v_object) {
        assert NIL != message_mailbox_suite_p(v_object) : "message_mailboxes.message_mailbox_suite_p error :" + v_object;
        return v_object.getField3();
    }

    public static SubLObject _csetf_message_mailbox_suite_lock(final SubLObject v_object, final SubLObject value) {
        assert NIL != message_mailbox_suite_p(v_object) : "message_mailboxes.message_mailbox_suite_p error :" + v_object;
        return v_object.setField2(value);
    }

    public static SubLObject _csetf_message_mailbox_suite_mailboxes(final SubLObject v_object, final SubLObject value) {
        assert NIL != message_mailbox_suite_p(v_object) : "message_mailboxes.message_mailbox_suite_p error :" + v_object;
        return v_object.setField3(value);
    }

    public static SubLObject make_message_mailbox_suite(SubLObject arglist) {
        if (arglist == UNPROVIDED) {
            arglist = NIL;
        }
        final SubLObject v_new = new $message_mailbox_suite_native();
        SubLObject next;
        SubLObject current_arg;
        SubLObject current_value;
        SubLObject pcase_var;
        for (next = NIL, next = arglist; NIL != next; next = cddr(next)) {
            current_arg = next.first();
            current_value = cadr(next);
            pcase_var = current_arg;
            if (pcase_var.eql($LOCK)) {
                _csetf_message_mailbox_suite_lock(v_new, current_value);
            } else
                if (pcase_var.eql($MAILBOXES)) {
                    _csetf_message_mailbox_suite_mailboxes(v_new, current_value);
                } else {
                    Errors.error($str15$Invalid_slot__S_for_construction_, current_arg);
                }

        }
        return v_new;
    }

    public static SubLObject visit_defstruct_message_mailbox_suite(final SubLObject obj, final SubLObject visitor_fn) {
        funcall(visitor_fn, obj, $BEGIN, MAKE_MESSAGE_MAILBOX_SUITE, TWO_INTEGER);
        funcall(visitor_fn, obj, $SLOT, $LOCK, message_mailbox_suite_lock(obj));
        funcall(visitor_fn, obj, $SLOT, $MAILBOXES, message_mailbox_suite_mailboxes(obj));
        funcall(visitor_fn, obj, $END, MAKE_MESSAGE_MAILBOX_SUITE, TWO_INTEGER);
        return obj;
    }

    public static SubLObject visit_defstruct_object_message_mailbox_suite_method(final SubLObject obj, final SubLObject visitor_fn) {
        return visit_defstruct_message_mailbox_suite(obj, visitor_fn);
    }

    public static SubLObject new_message_mailbox_suite() {
        final SubLObject mbox_suite = make_message_mailbox_suite(UNPROVIDED);
        _csetf_message_mailbox_suite_lock(mbox_suite, make_lock($$$Message_Mailbox_Suite));
        _csetf_message_mailbox_suite_mailboxes(mbox_suite, dictionary.new_dictionary(symbol_function(EQUALP), UNPROVIDED));
        return mbox_suite;
    }

    public static SubLObject with_message_mailbox_suite(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list22);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject mailbox = NIL;
        destructuring_bind_must_consp(current, datum, $list22);
        mailbox = current.first();
        current = current.rest();
        if (NIL == current) {
            final SubLObject body;
            current = body = temp;
            return listS(CLET, list(list($message_mailbox_suite$, mailbox)), append(body, NIL));
        }
        cdestructuring_bind_error(datum, $list22);
        return NIL;
    }

    public static SubLObject with_message_mailbox_suite_lock_held(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list25);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject mbox_suite = NIL;
        destructuring_bind_must_consp(current, datum, $list25);
        mbox_suite = current.first();
        current = current.rest();
        if (NIL == current) {
            final SubLObject body;
            current = body = temp;
            return listS(WITH_LOCK_HELD, list(list(MESSAGE_MAILBOX_SUITE_LOCK, mbox_suite)), append(body, NIL));
        }
        cdestructuring_bind_error(datum, $list25);
        return NIL;
    }

    public static SubLObject current_message_mailbox_suite() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return $message_mailbox_suite$.getDynamicValue(thread);
    }

    public static SubLObject with_blocking_message_mailbox_style(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return listS(CLET, $list28, append(body, NIL));
    }

    public static SubLObject is_non_blocking_message_mailboxP() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return eq($message_mailbox_style$.getDynamicValue(thread), $NON_BLOCKING);
    }

    public static SubLObject is_blocking_message_mailboxP() {
        return makeBoolean(NIL == is_non_blocking_message_mailboxP());
    }

    public static SubLObject add_message_to_message_mailbox(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject message = NIL;
        SubLObject mailbox = NIL;
        destructuring_bind_must_consp(current, datum, $list29);
        message = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list29);
        mailbox = current.first();
        current = current.rest();
        if (NIL == current) {
            return list(PIF, $list31, list(ENQUEUE, message, mailbox), list(IPC_ENQUEUE, message, mailbox));
        }
        cdestructuring_bind_error(datum, $list29);
        return NIL;
    }

    public static SubLObject is_message_mailbox_p(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject mailbox = NIL;
        destructuring_bind_must_consp(current, datum, $list34);
        mailbox = current.first();
        current = current.rest();
        if (NIL == current) {
            return list(FIF, $list31, list(QUEUE_P, mailbox), list(IPC_QUEUE_P, mailbox));
        }
        cdestructuring_bind_error(datum, $list34);
        return NIL;
    }

    public static SubLObject allocate_message_mailbox(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject name = NIL;
        destructuring_bind_must_consp(current, datum, $list38);
        name = current.first();
        current = current.rest();
        if (NIL == current) {
            return list(FIF, $list31, $list39, list(NEW_IPC_QUEUE, name));
        }
        cdestructuring_bind_error(datum, $list38);
        return NIL;
    }

    public static SubLObject remove_message_from_message_mailbox(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject mailbox = NIL;
        destructuring_bind_must_consp(current, datum, $list34);
        mailbox = current.first();
        current = current.rest();
        if (NIL == current) {
            return list(FIF, $list31, list(FIF, list(QUEUE_EMPTY_P, mailbox), $str42$, list(DEQUEUE, mailbox)), list(IPC_DEQUEUE, mailbox));
        }
        cdestructuring_bind_error(datum, $list34);
        return NIL;
    }

    public static SubLObject fetch_mailbox_size(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject mailbox = NIL;
        destructuring_bind_must_consp(current, datum, $list34);
        mailbox = current.first();
        current = current.rest();
        if (NIL == current) {
            return list(FIF, $list31, list(QUEUE_SIZE, mailbox), list(IPC_CURRENT_QUEUE_SIZE, mailbox));
        }
        cdestructuring_bind_error(datum, $list34);
        return NIL;
    }

    public static SubLObject known_message_mailboxP(final SubLObject address) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject mbox_suite = $message_mailbox_suite$.getDynamicValue(thread);
        SubLObject result = NIL;
        final SubLObject lock = message_mailbox_suite_lock(mbox_suite);
        SubLObject release = NIL;
        try {
            release = seize_lock(lock);
            final SubLObject v_dictionary = message_mailbox_suite_mailboxes(mbox_suite);
            result = dictionary.dictionary_lookup(v_dictionary, address, NIL);
        } finally {
            if (NIL != release) {
                release_lock(lock);
            }
        }
        return list_utilities.sublisp_boolean(result);
    }

    public static SubLObject store_mail_in_message_mailbox(final SubLObject address, final SubLObject message, SubLObject mbox_suite) {
        if (mbox_suite == UNPROVIDED) {
            mbox_suite = $message_mailbox_suite$.getDynamicValue();
        }
        final SubLObject mailbox = ensure_message_mailbox_allocation(address, mbox_suite);
        final SubLObject lock = message_mailbox_suite_lock(mbox_suite);
        SubLObject release = NIL;
        try {
            release = seize_lock(lock);
            if (NIL != is_non_blocking_message_mailboxP()) {
                queues.enqueue(message, mailbox);
            } else {
                process_utilities.ipc_enqueue(message, mailbox, UNPROVIDED);
            }
        } finally {
            if (NIL != release) {
                release_lock(lock);
            }
        }
        return address;
    }

    public static SubLObject ensure_message_mailbox_allocation(final SubLObject address, SubLObject mbox_suite) {
        if (mbox_suite == UNPROVIDED) {
            mbox_suite = $message_mailbox_suite$.getDynamicValue();
        }
        SubLObject mailbox = NIL;
        final SubLObject lock = message_mailbox_suite_lock(mbox_suite);
        SubLObject release = NIL;
        try {
            release = seize_lock(lock);
            final SubLObject v_dictionary = message_mailbox_suite_mailboxes(mbox_suite);
            mailbox = dictionary.dictionary_lookup(v_dictionary, address, UNPROVIDED);
            if (NIL == (NIL != is_non_blocking_message_mailboxP() ? queues.queue_p(mailbox) : process_utilities.ipc_queue_p(mailbox))) {
                mailbox = (NIL != is_non_blocking_message_mailboxP()) ? queues.create_queue(UNPROVIDED) : process_utilities.new_ipc_queue($$$Message_Mailbox);
                dictionary.dictionary_enter(v_dictionary, address, mailbox);
            }
        } finally {
            if (NIL != release) {
                release_lock(lock);
            }
        }
        return mailbox;
    }

    public static SubLObject deallocate_message_mailbox(final SubLObject address, SubLObject mbox_suite) {
        if (mbox_suite == UNPROVIDED) {
            mbox_suite = $message_mailbox_suite$.getDynamicValue();
        }
        SubLObject mailbox = NIL;
        final SubLObject lock = message_mailbox_suite_lock(mbox_suite);
        SubLObject release = NIL;
        try {
            release = seize_lock(lock);
            final SubLObject v_dictionary = message_mailbox_suite_mailboxes(mbox_suite);
            mailbox = dictionary.dictionary_lookup(v_dictionary, address, UNPROVIDED);
            if (NIL != (NIL != is_non_blocking_message_mailboxP() ? queues.queue_p(mailbox) : process_utilities.ipc_queue_p(mailbox))) {
                dictionary.dictionary_remove(v_dictionary, address);
            }
        } finally {
            if (NIL != release) {
                release_lock(lock);
            }
        }
        return mailbox;
    }

    public static SubLObject retrieve_mail_from_message_mailbox(final SubLObject address) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject mbox_suite = $message_mailbox_suite$.getDynamicValue(thread);
        SubLObject message = NIL;
        SubLObject mailbox = NIL;
        final SubLObject lock = message_mailbox_suite_lock(mbox_suite);
        SubLObject release = NIL;
        try {
            release = seize_lock(lock);
            final SubLObject v_dictionary = message_mailbox_suite_mailboxes(mbox_suite);
            mailbox = dictionary.dictionary_lookup(v_dictionary, address, UNPROVIDED);
        } finally {
            if (NIL != release) {
                release_lock(lock);
            }
        }
        if (NIL != (NIL != is_non_blocking_message_mailboxP() ? queues.queue_p(mailbox) : process_utilities.ipc_queue_p(mailbox))) {
            if (NIL != is_non_blocking_message_mailboxP()) {
                final SubLObject lock_$1 = message_mailbox_suite_lock(mbox_suite);
                SubLObject release_$2 = NIL;
                try {
                    release_$2 = seize_lock(lock_$1);
                    message = (NIL != is_non_blocking_message_mailboxP()) ? NIL != queues.queue_empty_p(mailbox) ? $str42$ : queues.dequeue(mailbox) : process_utilities.ipc_dequeue(mailbox, UNPROVIDED);
                } finally {
                    if (NIL != release_$2) {
                        release_lock(lock_$1);
                    }
                }
            } else {
                message = (NIL != is_non_blocking_message_mailboxP()) ? NIL != queues.queue_empty_p(mailbox) ? $str42$ : queues.dequeue(mailbox) : process_utilities.ipc_dequeue(mailbox, UNPROVIDED);
            }
        }
        return message;
    }

    public static SubLObject show_current_message_mailbox_suite(SubLObject stream) {
        if (stream == UNPROVIDED) {
            stream = T;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject mbox_suite = $message_mailbox_suite$.getDynamicValue(thread);
        final SubLObject v_dictionary = message_mailbox_suite_mailboxes(mbox_suite);
        SubLObject iteration_state;
        for (iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(v_dictionary)); NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
            thread.resetMultipleValues();
            final SubLObject address = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
            final SubLObject mbox = thread.secondMultipleValue();
            thread.resetMultipleValues();
            format(stream, $str48$Address__S___, address);
            format(stream, $str49$_D_messages___, NIL != is_non_blocking_message_mailboxP() ? queues.queue_size(mbox) : process_utilities.ipc_current_queue_size(mbox));
        }
        dictionary_contents.do_dictionary_contents_finalize(iteration_state);
        return stream;
    }

    public static SubLObject declare_message_mailboxes_file() {
        declareFunction(me, "message_mailbox_suite_print_function_trampoline", "MESSAGE-MAILBOX-SUITE-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        declareFunction(me, "message_mailbox_suite_p", "MESSAGE-MAILBOX-SUITE-P", 1, 0, false);
        new message_mailboxes.$message_mailbox_suite_p$UnaryFunction();
        declareFunction(me, "message_mailbox_suite_lock", "MESSAGE-MAILBOX-SUITE-LOCK", 1, 0, false);
        declareFunction(me, "message_mailbox_suite_mailboxes", "MESSAGE-MAILBOX-SUITE-MAILBOXES", 1, 0, false);
        declareFunction(me, "_csetf_message_mailbox_suite_lock", "_CSETF-MESSAGE-MAILBOX-SUITE-LOCK", 2, 0, false);
        declareFunction(me, "_csetf_message_mailbox_suite_mailboxes", "_CSETF-MESSAGE-MAILBOX-SUITE-MAILBOXES", 2, 0, false);
        declareFunction(me, "make_message_mailbox_suite", "MAKE-MESSAGE-MAILBOX-SUITE", 0, 1, false);
        declareFunction(me, "visit_defstruct_message_mailbox_suite", "VISIT-DEFSTRUCT-MESSAGE-MAILBOX-SUITE", 2, 0, false);
        declareFunction(me, "visit_defstruct_object_message_mailbox_suite_method", "VISIT-DEFSTRUCT-OBJECT-MESSAGE-MAILBOX-SUITE-METHOD", 2, 0, false);
        declareFunction(me, "new_message_mailbox_suite", "NEW-MESSAGE-MAILBOX-SUITE", 0, 0, false);
        declareMacro(me, "with_message_mailbox_suite", "WITH-MESSAGE-MAILBOX-SUITE");
        declareMacro(me, "with_message_mailbox_suite_lock_held", "WITH-MESSAGE-MAILBOX-SUITE-LOCK-HELD");
        declareFunction(me, "current_message_mailbox_suite", "CURRENT-MESSAGE-MAILBOX-SUITE", 0, 0, false);
        declareMacro(me, "with_blocking_message_mailbox_style", "WITH-BLOCKING-MESSAGE-MAILBOX-STYLE");
        declareFunction(me, "is_non_blocking_message_mailboxP", "IS-NON-BLOCKING-MESSAGE-MAILBOX?", 0, 0, false);
        declareFunction(me, "is_blocking_message_mailboxP", "IS-BLOCKING-MESSAGE-MAILBOX?", 0, 0, false);
        declareMacro(me, "add_message_to_message_mailbox", "ADD-MESSAGE-TO-MESSAGE-MAILBOX");
        declareMacro(me, "is_message_mailbox_p", "IS-MESSAGE-MAILBOX-P");
        declareMacro(me, "allocate_message_mailbox", "ALLOCATE-MESSAGE-MAILBOX");
        declareMacro(me, "remove_message_from_message_mailbox", "REMOVE-MESSAGE-FROM-MESSAGE-MAILBOX");
        declareMacro(me, "fetch_mailbox_size", "FETCH-MAILBOX-SIZE");
        declareFunction(me, "known_message_mailboxP", "KNOWN-MESSAGE-MAILBOX?", 1, 0, false);
        declareFunction(me, "store_mail_in_message_mailbox", "STORE-MAIL-IN-MESSAGE-MAILBOX", 2, 1, false);
        declareFunction(me, "ensure_message_mailbox_allocation", "ENSURE-MESSAGE-MAILBOX-ALLOCATION", 1, 1, false);
        declareFunction(me, "deallocate_message_mailbox", "DEALLOCATE-MESSAGE-MAILBOX", 1, 1, false);
        declareFunction(me, "retrieve_mail_from_message_mailbox", "RETRIEVE-MAIL-FROM-MESSAGE-MAILBOX", 1, 0, false);
        declareFunction(me, "show_current_message_mailbox_suite", "SHOW-CURRENT-MESSAGE-MAILBOX-SUITE", 0, 1, false);
        return NIL;
    }

    public static SubLObject init_message_mailboxes_file() {
        defconstant("*DTP-MESSAGE-MAILBOX-SUITE*", MESSAGE_MAILBOX_SUITE);
        defparameter("*MESSAGE-MAILBOX-SUITE*", new_message_mailbox_suite());
        defparameter("*MESSAGE-MAILBOX-STYLE*", $NON_BLOCKING);
        return NIL;
    }

    public static SubLObject setup_message_mailboxes_file() {
        register_method($print_object_method_table$.getGlobalValue(), $dtp_message_mailbox_suite$.getGlobalValue(), symbol_function(MESSAGE_MAILBOX_SUITE_PRINT_FUNCTION_TRAMPOLINE));
        SubLSpecialOperatorDeclarations.proclaim($list8);
        def_csetf(MESSAGE_MAILBOX_SUITE_LOCK, _CSETF_MESSAGE_MAILBOX_SUITE_LOCK);
        def_csetf(MESSAGE_MAILBOX_SUITE_MAILBOXES, _CSETF_MESSAGE_MAILBOX_SUITE_MAILBOXES);
        identity(MESSAGE_MAILBOX_SUITE);
        register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $dtp_message_mailbox_suite$.getGlobalValue(), symbol_function(VISIT_DEFSTRUCT_OBJECT_MESSAGE_MAILBOX_SUITE_METHOD));
        return NIL;
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

    

    public static final class $message_mailbox_suite_native extends SubLStructNative {
        public SubLObject $lock;

        public SubLObject $mailboxes;

        private static final SubLStructDeclNative structDecl;

        private $message_mailbox_suite_native() {
            this.$lock = Lisp.NIL;
            this.$mailboxes = Lisp.NIL;
        }

        @Override
        public SubLStructDecl getStructDecl() {
            return structDecl;
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
            structDecl = makeStructDeclNative($message_mailbox_suite_native.class, MESSAGE_MAILBOX_SUITE, MESSAGE_MAILBOX_SUITE_P, $list2, $list3, new String[]{ "$lock", "$mailboxes" }, $list4, $list5, DEFAULT_STRUCT_PRINT_FUNCTION);
        }
    }

    public static final class $message_mailbox_suite_p$UnaryFunction extends UnaryFunction {
        public $message_mailbox_suite_p$UnaryFunction() {
            super(extractFunctionNamed("MESSAGE-MAILBOX-SUITE-P"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1) {
            return message_mailbox_suite_p(arg1);
        }
    }
}

/**
 * Total time: 129 ms
 */
