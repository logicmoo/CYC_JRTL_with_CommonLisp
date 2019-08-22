/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 */
package com.cyc.cycjava.cycl;


import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.append;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.listS;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality.eq;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality.identity;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions.funcall;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Locks.make_lock;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Locks.release_lock;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Locks.seize_lock;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow.format;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures.def_csetf;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures.makeStructDeclNative;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures.register_method;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.symbol_function;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeBoolean;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeKeyword;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeString;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeSymbol;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.cdestructuring_bind_error;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.destructuring_bind_must_consp;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.cadr;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.cddr;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high.$print_object_method_table$;
import static com.cyc.tool.subl.util.SubLFiles.declareFunction;
import static com.cyc.tool.subl.util.SubLFiles.declareMacro;
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
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.compatibility;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.visitation;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLFiles.LispMethod;
import com.cyc.tool.subl.util.SubLTrampolineFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 * module:      MESSAGE-MAILBOXES
 * source file: /cyc/top/cycl/message-mailboxes.lisp
 * created:     2019/07/03 17:37:18
 */
public final class message_mailboxes extends SubLTranslatedFile implements V12 {
    static private final SubLString $str_alt36$ = makeString("");

    public static final SubLFile me = new message_mailboxes();

 public static final String myName = "com.cyc.cycjava.cycl.message_mailboxes";


    // defconstant
    @LispMethod(comment = "defconstant")
    public static final SubLSymbol $dtp_message_mailbox_suite$ = makeSymbol("*DTP-MESSAGE-MAILBOX-SUITE*");

    // defparameter
    @LispMethod(comment = "defparameter")
    public static final SubLSymbol $message_mailbox_style$ = makeSymbol("*MESSAGE-MAILBOX-STYLE*");

    // Internal Constants
    @LispMethod(comment = "Internal Constants")
    private static final SubLSymbol MESSAGE_MAILBOX_SUITE = makeSymbol("MESSAGE-MAILBOX-SUITE");

    private static final SubLSymbol MESSAGE_MAILBOX_SUITE_P = makeSymbol("MESSAGE-MAILBOX-SUITE-P");

    static private final SubLList $list2 = list(makeSymbol("LOCK"), makeSymbol("MAILBOXES"));

    static private final SubLList $list3 = list($LOCK, makeKeyword("MAILBOXES"));

    static private final SubLList $list4 = list(makeSymbol("MESSAGE-MAILBOX-SUITE-LOCK"), makeSymbol("MESSAGE-MAILBOX-SUITE-MAILBOXES"));

    static private final SubLList $list5 = list(makeSymbol("_CSETF-MESSAGE-MAILBOX-SUITE-LOCK"), makeSymbol("_CSETF-MESSAGE-MAILBOX-SUITE-MAILBOXES"));

    private static final SubLSymbol MESSAGE_MAILBOX_SUITE_PRINT_FUNCTION_TRAMPOLINE = makeSymbol("MESSAGE-MAILBOX-SUITE-PRINT-FUNCTION-TRAMPOLINE");

    private static final SubLList $list8 = list(makeSymbol("OPTIMIZE-FUNCALL"), makeSymbol("MESSAGE-MAILBOX-SUITE-P"));

    private static final SubLSymbol MESSAGE_MAILBOX_SUITE_LOCK = makeSymbol("MESSAGE-MAILBOX-SUITE-LOCK");

    private static final SubLSymbol _CSETF_MESSAGE_MAILBOX_SUITE_LOCK = makeSymbol("_CSETF-MESSAGE-MAILBOX-SUITE-LOCK");

    private static final SubLSymbol MESSAGE_MAILBOX_SUITE_MAILBOXES = makeSymbol("MESSAGE-MAILBOX-SUITE-MAILBOXES");

    private static final SubLSymbol _CSETF_MESSAGE_MAILBOX_SUITE_MAILBOXES = makeSymbol("_CSETF-MESSAGE-MAILBOX-SUITE-MAILBOXES");

    private static final SubLString $str15$Invalid_slot__S_for_construction_ = makeString("Invalid slot ~S for construction function");

    private static final SubLSymbol MAKE_MESSAGE_MAILBOX_SUITE = makeSymbol("MAKE-MESSAGE-MAILBOX-SUITE");

    private static final SubLSymbol VISIT_DEFSTRUCT_OBJECT_MESSAGE_MAILBOX_SUITE_METHOD = makeSymbol("VISIT-DEFSTRUCT-OBJECT-MESSAGE-MAILBOX-SUITE-METHOD");

    private static final SubLString $$$Message_Mailbox_Suite = makeString("Message Mailbox Suite");

    static private final SubLList $list22 = list(list(makeSymbol("MAILBOX")), makeSymbol("&BODY"), makeSymbol("BODY"));

    public static final SubLSymbol $message_mailbox_suite$ = makeSymbol("*MESSAGE-MAILBOX-SUITE*");

    static private final SubLList $list25 = list(list(makeSymbol("MBOX-SUITE")), makeSymbol("&BODY"), makeSymbol("BODY"));

    static private final SubLList $list28 = list(list(makeSymbol("*MESSAGE-MAILBOX-STYLE*"), makeKeyword("BLOCKING")));

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

    public static final SubLObject message_mailbox_suite_print_function_trampoline_alt(SubLObject v_object, SubLObject stream) {
        compatibility.default_struct_print_function(v_object, stream, ZERO_INTEGER);
        return NIL;
    }

    public static SubLObject message_mailbox_suite_print_function_trampoline(final SubLObject v_object, final SubLObject stream) {
        compatibility.default_struct_print_function(v_object, stream, ZERO_INTEGER);
        return NIL;
    }

    public static final SubLObject message_mailbox_suite_p_alt(SubLObject v_object) {
        return v_object.getClass() == com.cyc.cycjava.cycl.message_mailboxes.$message_mailbox_suite_native.class ? ((SubLObject) (T)) : NIL;
    }

    public static SubLObject message_mailbox_suite_p(final SubLObject v_object) {
        return v_object.getClass() == com.cyc.cycjava.cycl.message_mailboxes.$message_mailbox_suite_native.class ? T : NIL;
    }

    public static final SubLObject message_mailbox_suite_lock_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, MESSAGE_MAILBOX_SUITE_P);
        return v_object.getField2();
    }

    public static SubLObject message_mailbox_suite_lock(final SubLObject v_object) {
        assert NIL != message_mailboxes.message_mailbox_suite_p(v_object) : "! message_mailboxes.message_mailbox_suite_p(v_object) " + "message_mailboxes.message_mailbox_suite_p error :" + v_object;
        return v_object.getField2();
    }

    public static final SubLObject message_mailbox_suite_mailboxes_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, MESSAGE_MAILBOX_SUITE_P);
        return v_object.getField3();
    }

    public static SubLObject message_mailbox_suite_mailboxes(final SubLObject v_object) {
        assert NIL != message_mailboxes.message_mailbox_suite_p(v_object) : "! message_mailboxes.message_mailbox_suite_p(v_object) " + "message_mailboxes.message_mailbox_suite_p error :" + v_object;
        return v_object.getField3();
    }

    public static final SubLObject _csetf_message_mailbox_suite_lock_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, MESSAGE_MAILBOX_SUITE_P);
        return v_object.setField2(value);
    }

    public static SubLObject _csetf_message_mailbox_suite_lock(final SubLObject v_object, final SubLObject value) {
        assert NIL != message_mailboxes.message_mailbox_suite_p(v_object) : "! message_mailboxes.message_mailbox_suite_p(v_object) " + "message_mailboxes.message_mailbox_suite_p error :" + v_object;
        return v_object.setField2(value);
    }

    public static final SubLObject _csetf_message_mailbox_suite_mailboxes_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, MESSAGE_MAILBOX_SUITE_P);
        return v_object.setField3(value);
    }

    public static SubLObject _csetf_message_mailbox_suite_mailboxes(final SubLObject v_object, final SubLObject value) {
        assert NIL != message_mailboxes.message_mailbox_suite_p(v_object) : "! message_mailboxes.message_mailbox_suite_p(v_object) " + "message_mailboxes.message_mailbox_suite_p error :" + v_object;
        return v_object.setField3(value);
    }

    public static final SubLObject make_message_mailbox_suite_alt(SubLObject arglist) {
        if (arglist == UNPROVIDED) {
            arglist = NIL;
        }
        {
            SubLObject v_new = new com.cyc.cycjava.cycl.message_mailboxes.$message_mailbox_suite_native();
            SubLObject next = NIL;
            for (next = arglist; NIL != next; next = cddr(next)) {
                {
                    SubLObject current_arg = next.first();
                    SubLObject current_value = cadr(next);
                    SubLObject pcase_var = current_arg;
                    if (pcase_var.eql($LOCK)) {
                        com.cyc.cycjava.cycl.message_mailboxes._csetf_message_mailbox_suite_lock(v_new, current_value);
                    } else {
                        if (pcase_var.eql($MAILBOXES)) {
                            com.cyc.cycjava.cycl.message_mailboxes._csetf_message_mailbox_suite_mailboxes(v_new, current_value);
                        } else {
                            Errors.error($str_alt14$Invalid_slot__S_for_construction_, current_arg);
                        }
                    }
                }
            }
            return v_new;
        }
    }

    public static SubLObject make_message_mailbox_suite(SubLObject arglist) {
        if (arglist == UNPROVIDED) {
            arglist = NIL;
        }
        final SubLObject v_new = new com.cyc.cycjava.cycl.message_mailboxes.$message_mailbox_suite_native();
        SubLObject next;
        SubLObject current_arg;
        SubLObject current_value;
        SubLObject pcase_var;
        for (next = NIL, next = arglist; NIL != next; next = cddr(next)) {
            current_arg = next.first();
            current_value = cadr(next);
            pcase_var = current_arg;
            if (pcase_var.eql($LOCK)) {
                message_mailboxes._csetf_message_mailbox_suite_lock(v_new, current_value);
            } else
                if (pcase_var.eql($MAILBOXES)) {
                    message_mailboxes._csetf_message_mailbox_suite_mailboxes(v_new, current_value);
                } else {
                    Errors.error(message_mailboxes.$str15$Invalid_slot__S_for_construction_, current_arg);
                }

        }
        return v_new;
    }

    public static SubLObject visit_defstruct_message_mailbox_suite(final SubLObject obj, final SubLObject visitor_fn) {
        funcall(visitor_fn, obj, $BEGIN, message_mailboxes.MAKE_MESSAGE_MAILBOX_SUITE, TWO_INTEGER);
        funcall(visitor_fn, obj, $SLOT, $LOCK, message_mailboxes.message_mailbox_suite_lock(obj));
        funcall(visitor_fn, obj, $SLOT, $MAILBOXES, message_mailboxes.message_mailbox_suite_mailboxes(obj));
        funcall(visitor_fn, obj, $END, message_mailboxes.MAKE_MESSAGE_MAILBOX_SUITE, TWO_INTEGER);
        return obj;
    }

    public static SubLObject visit_defstruct_object_message_mailbox_suite_method(final SubLObject obj, final SubLObject visitor_fn) {
        return message_mailboxes.visit_defstruct_message_mailbox_suite(obj, visitor_fn);
    }

    public static final SubLObject new_message_mailbox_suite_alt() {
        {
            SubLObject mbox_suite = com.cyc.cycjava.cycl.message_mailboxes.make_message_mailbox_suite(UNPROVIDED);
            com.cyc.cycjava.cycl.message_mailboxes._csetf_message_mailbox_suite_lock(mbox_suite, make_lock($$$Message_Mailbox_Suite));
            com.cyc.cycjava.cycl.message_mailboxes._csetf_message_mailbox_suite_mailboxes(mbox_suite, dictionary.new_dictionary(symbol_function(EQUALP), UNPROVIDED));
            return mbox_suite;
        }
    }

    public static SubLObject new_message_mailbox_suite() {
        final SubLObject mbox_suite = message_mailboxes.make_message_mailbox_suite(UNPROVIDED);
        message_mailboxes._csetf_message_mailbox_suite_lock(mbox_suite, make_lock(message_mailboxes.$$$Message_Mailbox_Suite));
        message_mailboxes._csetf_message_mailbox_suite_mailboxes(mbox_suite, dictionary.new_dictionary(symbol_function(EQUALP), UNPROVIDED));
        return mbox_suite;
    }

    public static final SubLObject with_message_mailbox_suite_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            destructuring_bind_must_consp(current, datum, $list_alt16);
            {
                SubLObject temp = current.rest();
                current = current.first();
                {
                    SubLObject mailbox = NIL;
                    destructuring_bind_must_consp(current, datum, $list_alt16);
                    mailbox = current.first();
                    current = current.rest();
                    if (NIL == current) {
                        current = temp;
                        {
                            SubLObject body = current;
                            return listS(CLET, list(list($message_mailbox_suite$, mailbox)), append(body, NIL));
                        }
                    } else {
                        cdestructuring_bind_error(datum, $list_alt16);
                    }
                }
            }
        }
        return NIL;
    }

    public static SubLObject with_message_mailbox_suite(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, message_mailboxes.$list22);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject mailbox = NIL;
        destructuring_bind_must_consp(current, datum, message_mailboxes.$list22);
        mailbox = current.first();
        current = current.rest();
        if (NIL == current) {
            final SubLObject body;
            current = body = temp;
            return listS(CLET, list(list(message_mailboxes.$message_mailbox_suite$, mailbox)), append(body, NIL));
        }
        cdestructuring_bind_error(datum, message_mailboxes.$list22);
        return NIL;
    }

    public static final SubLObject with_message_mailbox_suite_lock_held_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            destructuring_bind_must_consp(current, datum, $list_alt19);
            {
                SubLObject temp = current.rest();
                current = current.first();
                {
                    SubLObject mbox_suite = NIL;
                    destructuring_bind_must_consp(current, datum, $list_alt19);
                    mbox_suite = current.first();
                    current = current.rest();
                    if (NIL == current) {
                        current = temp;
                        {
                            SubLObject body = current;
                            return listS(WITH_LOCK_HELD, list(list(MESSAGE_MAILBOX_SUITE_LOCK, mbox_suite)), append(body, NIL));
                        }
                    } else {
                        cdestructuring_bind_error(datum, $list_alt19);
                    }
                }
            }
        }
        return NIL;
    }

    public static SubLObject with_message_mailbox_suite_lock_held(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, message_mailboxes.$list25);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject mbox_suite = NIL;
        destructuring_bind_must_consp(current, datum, message_mailboxes.$list25);
        mbox_suite = current.first();
        current = current.rest();
        if (NIL == current) {
            final SubLObject body;
            current = body = temp;
            return listS(WITH_LOCK_HELD, list(list(message_mailboxes.MESSAGE_MAILBOX_SUITE_LOCK, mbox_suite)), append(body, NIL));
        }
        cdestructuring_bind_error(datum, message_mailboxes.$list25);
        return NIL;
    }

    public static final SubLObject current_message_mailbox_suite_alt() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            return $message_mailbox_suite$.getDynamicValue(thread);
        }
    }

    public static SubLObject current_message_mailbox_suite() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return message_mailboxes.$message_mailbox_suite$.getDynamicValue(thread);
    }

    public static final SubLObject with_blocking_message_mailbox_style_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject body = current;
            return listS(CLET, $list_alt22, append(body, NIL));
        }
    }

    public static SubLObject with_blocking_message_mailbox_style(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return listS(CLET, message_mailboxes.$list28, append(body, NIL));
    }

    public static final SubLObject is_non_blocking_message_mailboxP_alt() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            return eq($message_mailbox_style$.getDynamicValue(thread), $NON_BLOCKING);
        }
    }

    public static SubLObject is_non_blocking_message_mailboxP() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return eq(message_mailboxes.$message_mailbox_style$.getDynamicValue(thread), $NON_BLOCKING);
    }

    public static final SubLObject is_blocking_message_mailboxP_alt() {
        return makeBoolean(NIL == com.cyc.cycjava.cycl.message_mailboxes.is_non_blocking_message_mailboxP());
    }

    public static SubLObject is_blocking_message_mailboxP() {
        return makeBoolean(NIL == message_mailboxes.is_non_blocking_message_mailboxP());
    }

    public static final SubLObject add_message_to_message_mailbox_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject message = NIL;
            SubLObject mailbox = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt23);
            message = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt23);
            mailbox = current.first();
            current = current.rest();
            if (NIL == current) {
                return list(PIF, $list_alt25, list(ENQUEUE, message, mailbox), list(IPC_ENQUEUE, message, mailbox));
            } else {
                cdestructuring_bind_error(datum, $list_alt23);
            }
        }
        return NIL;
    }

    public static SubLObject add_message_to_message_mailbox(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject message = NIL;
        SubLObject mailbox = NIL;
        destructuring_bind_must_consp(current, datum, message_mailboxes.$list29);
        message = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, message_mailboxes.$list29);
        mailbox = current.first();
        current = current.rest();
        if (NIL == current) {
            return list(PIF, message_mailboxes.$list31, list(ENQUEUE, message, mailbox), list(message_mailboxes.IPC_ENQUEUE, message, mailbox));
        }
        cdestructuring_bind_error(datum, message_mailboxes.$list29);
        return NIL;
    }

    public static final SubLObject is_message_mailbox_p_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject mailbox = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt28);
            mailbox = current.first();
            current = current.rest();
            if (NIL == current) {
                return list(FIF, $list_alt25, list(QUEUE_P, mailbox), list(IPC_QUEUE_P, mailbox));
            } else {
                cdestructuring_bind_error(datum, $list_alt28);
            }
        }
        return NIL;
    }

    public static SubLObject is_message_mailbox_p(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject mailbox = NIL;
        destructuring_bind_must_consp(current, datum, message_mailboxes.$list34);
        mailbox = current.first();
        current = current.rest();
        if (NIL == current) {
            return list(FIF, message_mailboxes.$list31, list(QUEUE_P, mailbox), list(message_mailboxes.IPC_QUEUE_P, mailbox));
        }
        cdestructuring_bind_error(datum, message_mailboxes.$list34);
        return NIL;
    }

    public static final SubLObject allocate_message_mailbox_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject name = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt32);
            name = current.first();
            current = current.rest();
            if (NIL == current) {
                return list(FIF, $list_alt25, $list_alt33, list(NEW_IPC_QUEUE, name));
            } else {
                cdestructuring_bind_error(datum, $list_alt32);
            }
        }
        return NIL;
    }

    public static SubLObject allocate_message_mailbox(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject name = NIL;
        destructuring_bind_must_consp(current, datum, message_mailboxes.$list38);
        name = current.first();
        current = current.rest();
        if (NIL == current) {
            return list(FIF, message_mailboxes.$list31, message_mailboxes.$list39, list(message_mailboxes.NEW_IPC_QUEUE, name));
        }
        cdestructuring_bind_error(datum, message_mailboxes.$list38);
        return NIL;
    }

    public static final SubLObject remove_message_from_message_mailbox_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject mailbox = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt28);
            mailbox = current.first();
            current = current.rest();
            if (NIL == current) {
                return list(FIF, $list_alt25, list(FIF, list(QUEUE_EMPTY_P, mailbox), $str_alt36$, list(DEQUEUE, mailbox)), list(IPC_DEQUEUE, mailbox));
            } else {
                cdestructuring_bind_error(datum, $list_alt28);
            }
        }
        return NIL;
    }

    public static SubLObject remove_message_from_message_mailbox(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject mailbox = NIL;
        destructuring_bind_must_consp(current, datum, message_mailboxes.$list34);
        mailbox = current.first();
        current = current.rest();
        if (NIL == current) {
            return list(FIF, message_mailboxes.$list31, list(FIF, list(QUEUE_EMPTY_P, mailbox), message_mailboxes.$str42$, list(DEQUEUE, mailbox)), list(message_mailboxes.IPC_DEQUEUE, mailbox));
        }
        cdestructuring_bind_error(datum, message_mailboxes.$list34);
        return NIL;
    }

    public static final SubLObject fetch_mailbox_size_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject mailbox = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt28);
            mailbox = current.first();
            current = current.rest();
            if (NIL == current) {
                return list(FIF, $list_alt25, list(QUEUE_SIZE, mailbox), list(IPC_CURRENT_QUEUE_SIZE, mailbox));
            } else {
                cdestructuring_bind_error(datum, $list_alt28);
            }
        }
        return NIL;
    }

    public static SubLObject fetch_mailbox_size(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject mailbox = NIL;
        destructuring_bind_must_consp(current, datum, message_mailboxes.$list34);
        mailbox = current.first();
        current = current.rest();
        if (NIL == current) {
            return list(FIF, message_mailboxes.$list31, list(message_mailboxes.QUEUE_SIZE, mailbox), list(message_mailboxes.IPC_CURRENT_QUEUE_SIZE, mailbox));
        }
        cdestructuring_bind_error(datum, message_mailboxes.$list34);
        return NIL;
    }

    public static final SubLObject known_message_mailboxP_alt(SubLObject address) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject mbox_suite = $message_mailbox_suite$.getDynamicValue(thread);
                SubLObject result = NIL;
                SubLObject lock = com.cyc.cycjava.cycl.message_mailboxes.message_mailbox_suite_lock(mbox_suite);
                SubLObject release = NIL;
                try {
                    release = seize_lock(lock);
                    {
                        SubLObject v_dictionary = com.cyc.cycjava.cycl.message_mailboxes.message_mailbox_suite_mailboxes(mbox_suite);
                        result = dictionary.dictionary_lookup(v_dictionary, address, NIL);
                    }
                } finally {
                    if (NIL != release) {
                        release_lock(lock);
                    }
                }
                return list_utilities.sublisp_boolean(result);
            }
        }
    }

    public static SubLObject known_message_mailboxP(final SubLObject address) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject mbox_suite = message_mailboxes.$message_mailbox_suite$.getDynamicValue(thread);
        SubLObject result = NIL;
        final SubLObject lock = message_mailboxes.message_mailbox_suite_lock(mbox_suite);
        SubLObject release = NIL;
        try {
            release = seize_lock(lock);
            final SubLObject v_dictionary = message_mailboxes.message_mailbox_suite_mailboxes(mbox_suite);
            result = dictionary.dictionary_lookup(v_dictionary, address, NIL);
        } finally {
            if (NIL != release) {
                release_lock(lock);
            }
        }
        return list_utilities.sublisp_boolean(result);
    }

    public static final SubLObject store_mail_in_message_mailbox_alt(SubLObject address, SubLObject message, SubLObject mbox_suite) {
        if (mbox_suite == UNPROVIDED) {
            mbox_suite = $message_mailbox_suite$.getDynamicValue();
        }
        {
            SubLObject mailbox = com.cyc.cycjava.cycl.message_mailboxes.ensure_message_mailbox_allocation(address, mbox_suite);
            SubLObject lock = com.cyc.cycjava.cycl.message_mailboxes.message_mailbox_suite_lock(mbox_suite);
            SubLObject release = NIL;
            try {
                release = seize_lock(lock);
                if (NIL != com.cyc.cycjava.cycl.message_mailboxes.is_non_blocking_message_mailboxP()) {
                    queues.enqueue(message, mailbox);
                } else {
                    process_utilities.ipc_enqueue(message, mailbox);
                }
            } finally {
                if (NIL != release) {
                    release_lock(lock);
                }
            }
        }
        return address;
    }

    public static SubLObject store_mail_in_message_mailbox(final SubLObject address, final SubLObject message, SubLObject mbox_suite) {
        if (mbox_suite == UNPROVIDED) {
            mbox_suite = message_mailboxes.$message_mailbox_suite$.getDynamicValue();
        }
        final SubLObject mailbox = message_mailboxes.ensure_message_mailbox_allocation(address, mbox_suite);
        final SubLObject lock = message_mailboxes.message_mailbox_suite_lock(mbox_suite);
        SubLObject release = NIL;
        try {
            release = seize_lock(lock);
            if (NIL != message_mailboxes.is_non_blocking_message_mailboxP()) {
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

    public static final SubLObject ensure_message_mailbox_allocation_alt(SubLObject address, SubLObject mbox_suite) {
        if (mbox_suite == UNPROVIDED) {
            mbox_suite = $message_mailbox_suite$.getDynamicValue();
        }
        {
            SubLObject mailbox = NIL;
            SubLObject lock = com.cyc.cycjava.cycl.message_mailboxes.message_mailbox_suite_lock(mbox_suite);
            SubLObject release = NIL;
            try {
                release = seize_lock(lock);
                {
                    SubLObject v_dictionary = com.cyc.cycjava.cycl.message_mailboxes.message_mailbox_suite_mailboxes(mbox_suite);
                    mailbox = dictionary.dictionary_lookup(v_dictionary, address, UNPROVIDED);
                    if (NIL == (NIL != com.cyc.cycjava.cycl.message_mailboxes.is_non_blocking_message_mailboxP() ? ((SubLObject) (queues.queue_p(mailbox))) : process_utilities.ipc_queue_p(mailbox))) {
                        mailbox = (NIL != com.cyc.cycjava.cycl.message_mailboxes.is_non_blocking_message_mailboxP()) ? ((SubLObject) (queues.create_queue())) : process_utilities.new_ipc_queue($$$Message_Mailbox);
                        dictionary.dictionary_enter(v_dictionary, address, mailbox);
                    }
                }
            } finally {
                if (NIL != release) {
                    release_lock(lock);
                }
            }
            return mailbox;
        }
    }

    public static SubLObject ensure_message_mailbox_allocation(final SubLObject address, SubLObject mbox_suite) {
        if (mbox_suite == UNPROVIDED) {
            mbox_suite = message_mailboxes.$message_mailbox_suite$.getDynamicValue();
        }
        SubLObject mailbox = NIL;
        final SubLObject lock = message_mailboxes.message_mailbox_suite_lock(mbox_suite);
        SubLObject release = NIL;
        try {
            release = seize_lock(lock);
            final SubLObject v_dictionary = message_mailboxes.message_mailbox_suite_mailboxes(mbox_suite);
            mailbox = dictionary.dictionary_lookup(v_dictionary, address, UNPROVIDED);
            if (NIL == (NIL != message_mailboxes.is_non_blocking_message_mailboxP() ? queues.queue_p(mailbox) : process_utilities.ipc_queue_p(mailbox))) {
                mailbox = (NIL != message_mailboxes.is_non_blocking_message_mailboxP()) ? queues.create_queue(UNPROVIDED) : process_utilities.new_ipc_queue(message_mailboxes.$$$Message_Mailbox);
                dictionary.dictionary_enter(v_dictionary, address, mailbox);
            }
        } finally {
            if (NIL != release) {
                release_lock(lock);
            }
        }
        return mailbox;
    }

    public static final SubLObject deallocate_message_mailbox_alt(SubLObject address, SubLObject mbox_suite) {
        if (mbox_suite == UNPROVIDED) {
            mbox_suite = $message_mailbox_suite$.getDynamicValue();
        }
        {
            SubLObject mailbox = NIL;
            SubLObject lock = com.cyc.cycjava.cycl.message_mailboxes.message_mailbox_suite_lock(mbox_suite);
            SubLObject release = NIL;
            try {
                release = seize_lock(lock);
                {
                    SubLObject v_dictionary = com.cyc.cycjava.cycl.message_mailboxes.message_mailbox_suite_mailboxes(mbox_suite);
                    mailbox = dictionary.dictionary_lookup(v_dictionary, address, UNPROVIDED);
                    if (NIL != (NIL != com.cyc.cycjava.cycl.message_mailboxes.is_non_blocking_message_mailboxP() ? ((SubLObject) (queues.queue_p(mailbox))) : process_utilities.ipc_queue_p(mailbox))) {
                        dictionary.dictionary_remove(v_dictionary, address);
                    }
                }
            } finally {
                if (NIL != release) {
                    release_lock(lock);
                }
            }
            return mailbox;
        }
    }

    public static SubLObject deallocate_message_mailbox(final SubLObject address, SubLObject mbox_suite) {
        if (mbox_suite == UNPROVIDED) {
            mbox_suite = message_mailboxes.$message_mailbox_suite$.getDynamicValue();
        }
        SubLObject mailbox = NIL;
        final SubLObject lock = message_mailboxes.message_mailbox_suite_lock(mbox_suite);
        SubLObject release = NIL;
        try {
            release = seize_lock(lock);
            final SubLObject v_dictionary = message_mailboxes.message_mailbox_suite_mailboxes(mbox_suite);
            mailbox = dictionary.dictionary_lookup(v_dictionary, address, UNPROVIDED);
            if (NIL != (NIL != message_mailboxes.is_non_blocking_message_mailboxP() ? queues.queue_p(mailbox) : process_utilities.ipc_queue_p(mailbox))) {
                dictionary.dictionary_remove(v_dictionary, address);
            }
        } finally {
            if (NIL != release) {
                release_lock(lock);
            }
        }
        return mailbox;
    }

    /**
     * This one is tricky, since the blocking version potentially blocks
     * on dequeue (if empty) and thus we cannot hold the lock, while in
     * the non-blocking case we must hold the lock to ensure serialization.
     */
    @LispMethod(comment = "This one is tricky, since the blocking version potentially blocks\r\non dequeue (if empty) and thus we cannot hold the lock, while in\r\nthe non-blocking case we must hold the lock to ensure serialization.\nThis one is tricky, since the blocking version potentially blocks\non dequeue (if empty) and thus we cannot hold the lock, while in\nthe non-blocking case we must hold the lock to ensure serialization.")
    public static final SubLObject retrieve_mail_from_message_mailbox_alt(SubLObject address) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject mbox_suite = $message_mailbox_suite$.getDynamicValue(thread);
                SubLObject message = NIL;
                SubLObject mailbox = NIL;
                SubLObject lock = com.cyc.cycjava.cycl.message_mailboxes.message_mailbox_suite_lock(mbox_suite);
                SubLObject release = NIL;
                try {
                    release = seize_lock(lock);
                    {
                        SubLObject v_dictionary = com.cyc.cycjava.cycl.message_mailboxes.message_mailbox_suite_mailboxes(mbox_suite);
                        mailbox = dictionary.dictionary_lookup(v_dictionary, address, UNPROVIDED);
                    }
                } finally {
                    if (NIL != release) {
                        release_lock(lock);
                    }
                }
                if (NIL != (NIL != com.cyc.cycjava.cycl.message_mailboxes.is_non_blocking_message_mailboxP() ? ((SubLObject) (queues.queue_p(mailbox))) : process_utilities.ipc_queue_p(mailbox))) {
                    if (NIL != com.cyc.cycjava.cycl.message_mailboxes.is_non_blocking_message_mailboxP()) {
                        {
                            SubLObject lock_1 = com.cyc.cycjava.cycl.message_mailboxes.message_mailbox_suite_lock(mbox_suite);
                            SubLObject release_2 = NIL;
                            try {
                                release_2 = seize_lock(lock_1);
                                message = (NIL != com.cyc.cycjava.cycl.message_mailboxes.is_non_blocking_message_mailboxP()) ? ((SubLObject) (NIL != queues.queue_empty_p(mailbox) ? ((SubLObject) ($str_alt36$)) : queues.dequeue(mailbox))) : process_utilities.ipc_dequeue(mailbox);
                            } finally {
                                if (NIL != release_2) {
                                    release_lock(lock_1);
                                }
                            }
                        }
                    } else {
                        message = (NIL != com.cyc.cycjava.cycl.message_mailboxes.is_non_blocking_message_mailboxP()) ? ((SubLObject) (NIL != queues.queue_empty_p(mailbox) ? ((SubLObject) ($str_alt36$)) : queues.dequeue(mailbox))) : process_utilities.ipc_dequeue(mailbox);
                    }
                }
                return message;
            }
        }
    }

    @LispMethod(comment = "This one is tricky, since the blocking version potentially blocks\r\non dequeue (if empty) and thus we cannot hold the lock, while in\r\nthe non-blocking case we must hold the lock to ensure serialization.\nThis one is tricky, since the blocking version potentially blocks\non dequeue (if empty) and thus we cannot hold the lock, while in\nthe non-blocking case we must hold the lock to ensure serialization.")
    public static SubLObject retrieve_mail_from_message_mailbox(final SubLObject address) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject mbox_suite = message_mailboxes.$message_mailbox_suite$.getDynamicValue(thread);
        SubLObject message = NIL;
        SubLObject mailbox = NIL;
        final SubLObject lock = message_mailboxes.message_mailbox_suite_lock(mbox_suite);
        SubLObject release = NIL;
        try {
            release = seize_lock(lock);
            final SubLObject v_dictionary = message_mailboxes.message_mailbox_suite_mailboxes(mbox_suite);
            mailbox = dictionary.dictionary_lookup(v_dictionary, address, UNPROVIDED);
        } finally {
            if (NIL != release) {
                release_lock(lock);
            }
        }
        if (NIL != (NIL != message_mailboxes.is_non_blocking_message_mailboxP() ? queues.queue_p(mailbox) : process_utilities.ipc_queue_p(mailbox))) {
            if (NIL != message_mailboxes.is_non_blocking_message_mailboxP()) {
                final SubLObject lock_$1 = message_mailboxes.message_mailbox_suite_lock(mbox_suite);
                SubLObject release_$2 = NIL;
                try {
                    release_$2 = seize_lock(lock_$1);
                    message = (NIL != message_mailboxes.is_non_blocking_message_mailboxP()) ? NIL != queues.queue_empty_p(mailbox) ? message_mailboxes.$str42$ : queues.dequeue(mailbox) : process_utilities.ipc_dequeue(mailbox, UNPROVIDED);
                } finally {
                    if (NIL != release_$2) {
                        release_lock(lock_$1);
                    }
                }
            } else {
                message = (NIL != message_mailboxes.is_non_blocking_message_mailboxP()) ? NIL != queues.queue_empty_p(mailbox) ? message_mailboxes.$str42$ : queues.dequeue(mailbox) : process_utilities.ipc_dequeue(mailbox, UNPROVIDED);
            }
        }
        return message;
    }

    public static final SubLObject show_current_message_mailbox_suite_alt(SubLObject stream) {
        if (stream == UNPROVIDED) {
            stream = T;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject mbox_suite = $message_mailbox_suite$.getDynamicValue(thread);
                SubLObject v_dictionary = com.cyc.cycjava.cycl.message_mailboxes.message_mailbox_suite_mailboxes(mbox_suite);
                SubLObject iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(v_dictionary));
                while (NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state)) {
                    thread.resetMultipleValues();
                    {
                        SubLObject address = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                        SubLObject mbox = thread.secondMultipleValue();
                        thread.resetMultipleValues();
                        format(stream, $str_alt42$Address__S___, address);
                        format(stream, $str_alt43$_D_messages___, NIL != com.cyc.cycjava.cycl.message_mailboxes.is_non_blocking_message_mailboxP() ? ((SubLObject) (queues.queue_size(mbox))) : process_utilities.ipc_current_queue_size(mbox));
                        iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state);
                    }
                } 
                dictionary_contents.do_dictionary_contents_finalize(iteration_state);
            }
            return stream;
        }
    }

    public static SubLObject show_current_message_mailbox_suite(SubLObject stream) {
        if (stream == UNPROVIDED) {
            stream = T;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject mbox_suite = message_mailboxes.$message_mailbox_suite$.getDynamicValue(thread);
        final SubLObject v_dictionary = message_mailboxes.message_mailbox_suite_mailboxes(mbox_suite);
        SubLObject iteration_state;
        for (iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(v_dictionary)); NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
            thread.resetMultipleValues();
            final SubLObject address = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
            final SubLObject mbox = thread.secondMultipleValue();
            thread.resetMultipleValues();
            format(stream, message_mailboxes.$str48$Address__S___, address);
            format(stream, message_mailboxes.$str49$_D_messages___, NIL != message_mailboxes.is_non_blocking_message_mailboxP() ? queues.queue_size(mbox) : process_utilities.ipc_current_queue_size(mbox));
        }
        dictionary_contents.do_dictionary_contents_finalize(iteration_state);
        return stream;
    }

    public static SubLObject declare_message_mailboxes_file() {
        declareFunction("message_mailbox_suite_print_function_trampoline", "MESSAGE-MAILBOX-SUITE-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        declareFunction("message_mailbox_suite_p", "MESSAGE-MAILBOX-SUITE-P", 1, 0, false);
        new message_mailboxes.$message_mailbox_suite_p$UnaryFunction();
        declareFunction("message_mailbox_suite_lock", "MESSAGE-MAILBOX-SUITE-LOCK", 1, 0, false);
        declareFunction("message_mailbox_suite_mailboxes", "MESSAGE-MAILBOX-SUITE-MAILBOXES", 1, 0, false);
        declareFunction("_csetf_message_mailbox_suite_lock", "_CSETF-MESSAGE-MAILBOX-SUITE-LOCK", 2, 0, false);
        declareFunction("_csetf_message_mailbox_suite_mailboxes", "_CSETF-MESSAGE-MAILBOX-SUITE-MAILBOXES", 2, 0, false);
        declareFunction("make_message_mailbox_suite", "MAKE-MESSAGE-MAILBOX-SUITE", 0, 1, false);
        declareFunction("visit_defstruct_message_mailbox_suite", "VISIT-DEFSTRUCT-MESSAGE-MAILBOX-SUITE", 2, 0, false);
        declareFunction("visit_defstruct_object_message_mailbox_suite_method", "VISIT-DEFSTRUCT-OBJECT-MESSAGE-MAILBOX-SUITE-METHOD", 2, 0, false);
        declareFunction("new_message_mailbox_suite", "NEW-MESSAGE-MAILBOX-SUITE", 0, 0, false);
        declareMacro("with_message_mailbox_suite", "WITH-MESSAGE-MAILBOX-SUITE");
        declareMacro("with_message_mailbox_suite_lock_held", "WITH-MESSAGE-MAILBOX-SUITE-LOCK-HELD");
        declareFunction("current_message_mailbox_suite", "CURRENT-MESSAGE-MAILBOX-SUITE", 0, 0, false);
        declareMacro("with_blocking_message_mailbox_style", "WITH-BLOCKING-MESSAGE-MAILBOX-STYLE");
        declareFunction("is_non_blocking_message_mailboxP", "IS-NON-BLOCKING-MESSAGE-MAILBOX?", 0, 0, false);
        declareFunction("is_blocking_message_mailboxP", "IS-BLOCKING-MESSAGE-MAILBOX?", 0, 0, false);
        declareMacro("add_message_to_message_mailbox", "ADD-MESSAGE-TO-MESSAGE-MAILBOX");
        declareMacro("is_message_mailbox_p", "IS-MESSAGE-MAILBOX-P");
        declareMacro("allocate_message_mailbox", "ALLOCATE-MESSAGE-MAILBOX");
        declareMacro("remove_message_from_message_mailbox", "REMOVE-MESSAGE-FROM-MESSAGE-MAILBOX");
        declareMacro("fetch_mailbox_size", "FETCH-MAILBOX-SIZE");
        declareFunction("known_message_mailboxP", "KNOWN-MESSAGE-MAILBOX?", 1, 0, false);
        declareFunction("store_mail_in_message_mailbox", "STORE-MAIL-IN-MESSAGE-MAILBOX", 2, 1, false);
        declareFunction("ensure_message_mailbox_allocation", "ENSURE-MESSAGE-MAILBOX-ALLOCATION", 1, 1, false);
        declareFunction("deallocate_message_mailbox", "DEALLOCATE-MESSAGE-MAILBOX", 1, 1, false);
        declareFunction("retrieve_mail_from_message_mailbox", "RETRIEVE-MAIL-FROM-MESSAGE-MAILBOX", 1, 0, false);
        declareFunction("show_current_message_mailbox_suite", "SHOW-CURRENT-MESSAGE-MAILBOX-SUITE", 0, 1, false);
        return NIL;
    }

    public static SubLObject init_message_mailboxes_file() {
        defconstant("*DTP-MESSAGE-MAILBOX-SUITE*", message_mailboxes.MESSAGE_MAILBOX_SUITE);
        defparameter("*MESSAGE-MAILBOX-SUITE*", message_mailboxes.new_message_mailbox_suite());
        defparameter("*MESSAGE-MAILBOX-STYLE*", $NON_BLOCKING);
        return NIL;
    }

    public static SubLObject setup_message_mailboxes_file() {
        register_method($print_object_method_table$.getGlobalValue(), message_mailboxes.$dtp_message_mailbox_suite$.getGlobalValue(), symbol_function(message_mailboxes.MESSAGE_MAILBOX_SUITE_PRINT_FUNCTION_TRAMPOLINE));
        SubLSpecialOperatorDeclarations.proclaim(message_mailboxes.$list8);
        def_csetf(message_mailboxes.MESSAGE_MAILBOX_SUITE_LOCK, message_mailboxes._CSETF_MESSAGE_MAILBOX_SUITE_LOCK);
        def_csetf(message_mailboxes.MESSAGE_MAILBOX_SUITE_MAILBOXES, message_mailboxes._CSETF_MESSAGE_MAILBOX_SUITE_MAILBOXES);
        identity(message_mailboxes.MESSAGE_MAILBOX_SUITE);
        register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), message_mailboxes.$dtp_message_mailbox_suite$.getGlobalValue(), symbol_function(message_mailboxes.VISIT_DEFSTRUCT_OBJECT_MESSAGE_MAILBOX_SUITE_METHOD));
        return NIL;
    }

    @Override
    public void declareFunctions() {
        message_mailboxes.declare_message_mailboxes_file();
    }

    static private final SubLList $list_alt2 = list(makeSymbol("LOCK"), makeSymbol("MAILBOXES"));

    @Override
    public void initializeVariables() {
        message_mailboxes.init_message_mailboxes_file();
    }

    static private final SubLList $list_alt3 = list($LOCK, makeKeyword("MAILBOXES"));

    @Override
    public void runTopLevelForms() {
        message_mailboxes.setup_message_mailboxes_file();
    }

    static private final SubLList $list_alt4 = list(makeSymbol("MESSAGE-MAILBOX-SUITE-LOCK"), makeSymbol("MESSAGE-MAILBOX-SUITE-MAILBOXES"));

    

    static private final SubLList $list_alt5 = list(makeSymbol("_CSETF-MESSAGE-MAILBOX-SUITE-LOCK"), makeSymbol("_CSETF-MESSAGE-MAILBOX-SUITE-MAILBOXES"));

    public static final class $message_mailbox_suite_native extends SubLStructNative {
        public SubLObject $lock;

        public SubLObject $mailboxes;

        private static final SubLStructDeclNative structDecl;

        public $message_mailbox_suite_native() {
            message_mailboxes.$message_mailbox_suite_native.this.$lock = Lisp.NIL;
            message_mailboxes.$message_mailbox_suite_native.this.$mailboxes = Lisp.NIL;
        }

        @Override
        public SubLStructDecl getStructDecl() {
            return structDecl;
        }

        @Override
        public SubLObject getField2() {
            return message_mailboxes.$message_mailbox_suite_native.this.$lock;
        }

        @Override
        public SubLObject getField3() {
            return message_mailboxes.$message_mailbox_suite_native.this.$mailboxes;
        }

        @Override
        public SubLObject setField2(final SubLObject value) {
            return message_mailboxes.$message_mailbox_suite_native.this.$lock = value;
        }

        @Override
        public SubLObject setField3(final SubLObject value) {
            return message_mailboxes.$message_mailbox_suite_native.this.$mailboxes = value;
        }

        static {
            structDecl = makeStructDeclNative(com.cyc.cycjava.cycl.message_mailboxes.$message_mailbox_suite_native.class, message_mailboxes.MESSAGE_MAILBOX_SUITE, message_mailboxes.MESSAGE_MAILBOX_SUITE_P, message_mailboxes.$list2, message_mailboxes.$list3, new String[]{ "$lock", "$mailboxes" }, message_mailboxes.$list4, message_mailboxes.$list5, DEFAULT_STRUCT_PRINT_FUNCTION);
        }
    }

    static private final SubLString $str_alt14$Invalid_slot__S_for_construction_ = makeString("Invalid slot ~S for construction function");

    static private final SubLList $list_alt16 = list(list(makeSymbol("MAILBOX")), makeSymbol("&BODY"), makeSymbol("BODY"));

    static private final SubLList $list_alt19 = list(list(makeSymbol("MBOX-SUITE")), makeSymbol("&BODY"), makeSymbol("BODY"));

    public static final class $message_mailbox_suite_p$UnaryFunction extends UnaryFunction {
        public $message_mailbox_suite_p$UnaryFunction() {
            super(extractFunctionNamed("MESSAGE-MAILBOX-SUITE-P"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1) {
            return message_mailboxes.message_mailbox_suite_p(arg1);
        }
    }

    static private final SubLList $list_alt22 = list(list(makeSymbol("*MESSAGE-MAILBOX-STYLE*"), makeKeyword("BLOCKING")));

    static private final SubLList $list_alt23 = list(makeSymbol("MESSAGE"), makeSymbol("MAILBOX"));

    static private final SubLList $list_alt25 = list(makeSymbol("IS-NON-BLOCKING-MESSAGE-MAILBOX?"));

    static private final SubLList $list_alt28 = list(makeSymbol("MAILBOX"));

    static private final SubLList $list_alt32 = list(makeSymbol("NAME"));

    static private final SubLList $list_alt33 = list(makeSymbol("CREATE-QUEUE"));

    static private final SubLString $str_alt42$Address__S___ = makeString("Address ~S : ");

    static private final SubLString $str_alt43$_D_messages___ = makeString("~D messages.~%");
}

/**
 * Total time: 129 ms
 */
