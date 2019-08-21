package com.cyc.cycjava.cycl;


import com.cyc.cycjava.cycl.cfasl;
import com.cyc.cycjava.cycl.queues;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.BinaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sort;
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
import com.cyc.tool.subl.util.SubLTranslatedFile;
import org.armedbear.lisp.Lisp;

import static com.cyc.cycjava.cycl.access_macros.*;
import static com.cyc.cycjava.cycl.cfasl.*;
import static com.cyc.cycjava.cycl.queues.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.EQL;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.FIVE_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.IDENTITY;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.NIL;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.ONE_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.T;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.THREE_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.TWO_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.UNPROVIDED;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.ZERO_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Locks.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.*;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high.$print_object_method_table$;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high.$print_readably$;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.*;
import static com.cyc.tool.subl.util.SubLFiles.*;
import static com.cyc.tool.subl.util.SubLTranslatedFile.*;


import static com.cyc.cycjava.cycl.queues.*; 
 public final class queues extends SubLTranslatedFile {
    public static final SubLFile me = new queues();

    public static final String myName = "com.cyc.cycjava.cycl.queues";

    public static final String myFingerPrint = "4ea470777cc1a58b46b2346208558b4c44a196c7f0661352be50f6c1fb15f498";

    // defconstant
    public static final SubLSymbol $dtp_queue$ = makeSymbol("*DTP-QUEUE*");

    // defconstant
    private static final SubLSymbol $cfasl_wide_opcode_queue$ = makeSymbol("*CFASL-WIDE-OPCODE-QUEUE*");

    // defconstant
    public static final SubLSymbol $dtp_priority_queue$ = makeSymbol("*DTP-PRIORITY-QUEUE*");

    // defconstant
    public static final SubLSymbol $dtp_lazy_priority_queue$ = makeSymbol("*DTP-LAZY-PRIORITY-QUEUE*");

    // defconstant
    public static final SubLSymbol $dtp_locked_queue$ = makeSymbol("*DTP-LOCKED-QUEUE*");

    // defconstant
    public static final SubLSymbol $dtp_locked_p_queue$ = makeSymbol("*DTP-LOCKED-P-QUEUE*");





    public static final SubLList $list2 = list(makeSymbol("NUM"), makeSymbol("ELEMENTS"), makeSymbol("LAST"));

    public static final SubLList $list3 = list(makeKeyword("NUM"), makeKeyword("ELEMENTS"), makeKeyword("LAST"));

    public static final SubLList $list4 = list(makeSymbol("Q-NUM"), makeSymbol("Q-ELEMENTS"), makeSymbol("Q-LAST"));

    public static final SubLList $list5 = list(makeSymbol("_CSETF-Q-NUM"), makeSymbol("_CSETF-Q-ELEMENTS"), makeSymbol("_CSETF-Q-LAST"));

    public static final SubLSymbol PRINT_QUEUE = makeSymbol("PRINT-QUEUE");

    public static final SubLSymbol QUEUE_PRINT_FUNCTION_TRAMPOLINE = makeSymbol("QUEUE-PRINT-FUNCTION-TRAMPOLINE");

    private static final SubLList $list8 = list(makeSymbol("OPTIMIZE-FUNCALL"), makeSymbol("QUEUE-P"));

    private static final SubLSymbol Q_NUM = makeSymbol("Q-NUM");

    private static final SubLSymbol _CSETF_Q_NUM = makeSymbol("_CSETF-Q-NUM");

    private static final SubLSymbol Q_ELEMENTS = makeSymbol("Q-ELEMENTS");

    private static final SubLSymbol _CSETF_Q_ELEMENTS = makeSymbol("_CSETF-Q-ELEMENTS");

    private static final SubLSymbol Q_LAST = makeSymbol("Q-LAST");

    private static final SubLSymbol _CSETF_Q_LAST = makeSymbol("_CSETF-Q-LAST");







    private static final SubLString $str18$Invalid_slot__S_for_construction_ = makeString("Invalid slot ~S for construction function");



    private static final SubLSymbol MAKE_QUEUE = makeSymbol("MAKE-QUEUE");





    private static final SubLSymbol VISIT_DEFSTRUCT_OBJECT_QUEUE_METHOD = makeSymbol("VISIT-DEFSTRUCT-OBJECT-QUEUE-METHOD");

    private static final SubLString $str24$size_ = makeString("size=");

    private static final SubLList $list25 = list(list(makeSymbol("ITEM-VAR"), makeSymbol("QUEUE"), makeSymbol("&KEY"), makeSymbol("DONE")), makeSymbol("&BODY"), makeSymbol("BODY"));

    private static final SubLList $list26 = list(makeKeyword("DONE"));

    private static final SubLSymbol $ALLOW_OTHER_KEYS = makeKeyword("ALLOW-OTHER-KEYS");





    private static final SubLSymbol DO_QUEUE_ELEMENTS_QUEUE_ELEMENTS = makeSymbol("DO-QUEUE-ELEMENTS-QUEUE-ELEMENTS");

    private static final SubLSymbol DO_QUEUE_ELEMENTS = makeSymbol("DO-QUEUE-ELEMENTS");

    private static final SubLSymbol $sym32$Q = makeUninternedSymbol("Q");

    private static final SubLSymbol $sym33$DONE_VAR = makeUninternedSymbol("DONE-VAR");















    private static final SubLString $str41$__Queue_length____a = makeString("~%Queue length : ~a");

    private static final SubLString $str42$__Queue_contents__ = makeString("~%Queue contents :");

    private static final SubLString $str43$___s = makeString("~%~s");

    private static final SubLInteger $int$131 = makeInteger(131);

    private static final SubLSymbol CFASL_INPUT_QUEUE = makeSymbol("CFASL-INPUT-QUEUE");

    private static final SubLSymbol CFASL_OUTPUT_OBJECT_QUEUE_METHOD = makeSymbol("CFASL-OUTPUT-OBJECT-QUEUE-METHOD");

    private static final SubLString $str47$We_promised_to_write__A_elements_ = makeString("We promised to write ~A elements but wrote ~A.");

    private static final SubLSymbol PRIORITY_QUEUE = makeSymbol("PRIORITY-QUEUE");

    private static final SubLSymbol PRIORITY_QUEUE_P = makeSymbol("PRIORITY-QUEUE-P");

    public static final SubLList $list50 = list(makeSymbol("NUM"), makeSymbol("MAX-SIZE"), makeSymbol("RANK-FUNC"), makeSymbol("COMP-FUNC"), makeSymbol("TREE"));

    private static final SubLList $list51 = list(makeKeyword("NUM"), makeKeyword("MAX-SIZE"), makeKeyword("RANK-FUNC"), makeKeyword("COMP-FUNC"), makeKeyword("TREE"));

    private static final SubLList $list52 = list(makeSymbol("P-QUEUE-NUM"), makeSymbol("P-QUEUE-MAX-SIZE"), makeSymbol("P-QUEUE-RANK-FUNC"), makeSymbol("P-QUEUE-COMP-FUNC"), makeSymbol("P-QUEUE-TREE"));

    private static final SubLList $list53 = list(makeSymbol("_CSETF-P-QUEUE-NUM"), makeSymbol("_CSETF-P-QUEUE-MAX-SIZE"), makeSymbol("_CSETF-P-QUEUE-RANK-FUNC"), makeSymbol("_CSETF-P-QUEUE-COMP-FUNC"), makeSymbol("_CSETF-P-QUEUE-TREE"));

    private static final SubLSymbol PRINT_P_QUEUE = makeSymbol("PRINT-P-QUEUE");

    private static final SubLSymbol PRIORITY_QUEUE_PRINT_FUNCTION_TRAMPOLINE = makeSymbol("PRIORITY-QUEUE-PRINT-FUNCTION-TRAMPOLINE");

    private static final SubLList $list56 = list(makeSymbol("OPTIMIZE-FUNCALL"), makeSymbol("PRIORITY-QUEUE-P"));

    private static final SubLSymbol P_QUEUE_NUM = makeSymbol("P-QUEUE-NUM");

    private static final SubLSymbol _CSETF_P_QUEUE_NUM = makeSymbol("_CSETF-P-QUEUE-NUM");

    private static final SubLSymbol P_QUEUE_MAX_SIZE = makeSymbol("P-QUEUE-MAX-SIZE");

    private static final SubLSymbol _CSETF_P_QUEUE_MAX_SIZE = makeSymbol("_CSETF-P-QUEUE-MAX-SIZE");

    private static final SubLSymbol P_QUEUE_RANK_FUNC = makeSymbol("P-QUEUE-RANK-FUNC");

    private static final SubLSymbol _CSETF_P_QUEUE_RANK_FUNC = makeSymbol("_CSETF-P-QUEUE-RANK-FUNC");

    private static final SubLSymbol P_QUEUE_COMP_FUNC = makeSymbol("P-QUEUE-COMP-FUNC");

    private static final SubLSymbol _CSETF_P_QUEUE_COMP_FUNC = makeSymbol("_CSETF-P-QUEUE-COMP-FUNC");

    private static final SubLSymbol P_QUEUE_TREE = makeSymbol("P-QUEUE-TREE");

    private static final SubLSymbol _CSETF_P_QUEUE_TREE = makeSymbol("_CSETF-P-QUEUE-TREE");









    private static final SubLSymbol MAKE_PRIORITY_QUEUE = makeSymbol("MAKE-PRIORITY-QUEUE");

    private static final SubLSymbol VISIT_DEFSTRUCT_OBJECT_PRIORITY_QUEUE_METHOD = makeSymbol("VISIT-DEFSTRUCT-OBJECT-PRIORITY-QUEUE-METHOD");

    private static final SubLSymbol $sym73$_ = makeSymbol("<");

    private static final SubLSymbol PQ_COLLISION_ENTER = makeSymbol("PQ-COLLISION-ENTER");

    private static final SubLSymbol PQ_COLLISION_REMOVE = makeSymbol("PQ-COLLISION-REMOVE");

    private static final SubLSymbol PQ_COLLISION_EMPTY = makeSymbol("PQ-COLLISION-EMPTY");

    private static final SubLList $list77 = list(list(makeSymbol("ITEM-VAR"), makeSymbol("PRIORITY-QUEUE"), makeSymbol("&KEY"), makeSymbol("DONE")), makeSymbol("&BODY"), makeSymbol("BODY"));

    private static final SubLSymbol $sym78$KEY_VAR = makeUninternedSymbol("KEY-VAR");

    private static final SubLSymbol $sym79$COLLISIONS_VAR = makeUninternedSymbol("COLLISIONS-VAR");

    private static final SubLSymbol DO_BTREE_INDEX = makeSymbol("DO-BTREE-INDEX");

    private static final SubLSymbol DO_PRIORITY_QUEUE_ELEMENTS_BTREE = makeSymbol("DO-PRIORITY-QUEUE-ELEMENTS-BTREE");



    private static final SubLSymbol DO_PRIORITY_QUEUE_ELEMENTS = makeSymbol("DO-PRIORITY-QUEUE-ELEMENTS");

    private static final SubLSymbol LAZY_PRIORITY_QUEUE = makeSymbol("LAZY-PRIORITY-QUEUE");

    private static final SubLSymbol LAZY_PRIORITY_QUEUE_P = makeSymbol("LAZY-PRIORITY-QUEUE-P");

    private static final SubLList $list86 = list(makeSymbol("ORDERED-ITEMS"), makeSymbol("NEW-ITEMS"));

    private static final SubLList $list87 = list(makeKeyword("ORDERED-ITEMS"), makeKeyword("NEW-ITEMS"));

    private static final SubLList $list88 = list(makeSymbol("LAZY-P-QUEUE-ORDERED-ITEMS"), makeSymbol("LAZY-P-QUEUE-NEW-ITEMS"));

    private static final SubLList $list89 = list(makeSymbol("_CSETF-LAZY-P-QUEUE-ORDERED-ITEMS"), makeSymbol("_CSETF-LAZY-P-QUEUE-NEW-ITEMS"));

    private static final SubLSymbol PRINT_LAZY_P_QUEUE = makeSymbol("PRINT-LAZY-P-QUEUE");

    private static final SubLSymbol LAZY_PRIORITY_QUEUE_PRINT_FUNCTION_TRAMPOLINE = makeSymbol("LAZY-PRIORITY-QUEUE-PRINT-FUNCTION-TRAMPOLINE");

    private static final SubLList $list92 = list(makeSymbol("OPTIMIZE-FUNCALL"), makeSymbol("LAZY-PRIORITY-QUEUE-P"));

    private static final SubLSymbol LAZY_P_QUEUE_ORDERED_ITEMS = makeSymbol("LAZY-P-QUEUE-ORDERED-ITEMS");

    private static final SubLSymbol _CSETF_LAZY_P_QUEUE_ORDERED_ITEMS = makeSymbol("_CSETF-LAZY-P-QUEUE-ORDERED-ITEMS");

    private static final SubLSymbol LAZY_P_QUEUE_NEW_ITEMS = makeSymbol("LAZY-P-QUEUE-NEW-ITEMS");

    private static final SubLSymbol _CSETF_LAZY_P_QUEUE_NEW_ITEMS = makeSymbol("_CSETF-LAZY-P-QUEUE-NEW-ITEMS");





    private static final SubLSymbol MAKE_LAZY_PRIORITY_QUEUE = makeSymbol("MAKE-LAZY-PRIORITY-QUEUE");

    private static final SubLSymbol VISIT_DEFSTRUCT_OBJECT_LAZY_PRIORITY_QUEUE_METHOD = makeSymbol("VISIT-DEFSTRUCT-OBJECT-LAZY-PRIORITY-QUEUE-METHOD");

    private static final SubLString $str101$___S_new_ = makeString(" (~S new)");

    private static final SubLSymbol $sym102$_ = makeSymbol(">");

    private static final SubLList $list103 = list(list(makeSymbol("ITEM-VAR"), makeSymbol("LPQ"), makeSymbol("&KEY"), makeSymbol("DONE")), makeSymbol("&BODY"), makeSymbol("BODY"));

    private static final SubLSymbol LAZY_PRIORITY_QUEUE_ELEMENTS = makeSymbol("LAZY-PRIORITY-QUEUE-ELEMENTS");

    private static final SubLSymbol LOCKED_QUEUE = makeSymbol("LOCKED-QUEUE");

    private static final SubLSymbol LOCKED_QUEUE_P = makeSymbol("LOCKED-QUEUE-P");

    private static final SubLList $list107 = list(makeSymbol("LOCK"), makeSymbol("QUEUE"));

    private static final SubLList $list108 = list(makeKeyword("LOCK"), makeKeyword("QUEUE"));

    private static final SubLList $list109 = list(makeSymbol("LOCKED-QUEUE-LOCK"), makeSymbol("LOCKED-QUEUE-QUEUE"));

    private static final SubLList $list110 = list(makeSymbol("_CSETF-LOCKED-QUEUE-LOCK"), makeSymbol("_CSETF-LOCKED-QUEUE-QUEUE"));



    private static final SubLSymbol LOCKED_QUEUE_PRINT_FUNCTION_TRAMPOLINE = makeSymbol("LOCKED-QUEUE-PRINT-FUNCTION-TRAMPOLINE");

    public static final SubLList $list113 = list(makeSymbol("OPTIMIZE-FUNCALL"), makeSymbol("LOCKED-QUEUE-P"));

    private static final SubLSymbol LOCKED_QUEUE_LOCK = makeSymbol("LOCKED-QUEUE-LOCK");

    private static final SubLSymbol _CSETF_LOCKED_QUEUE_LOCK = makeSymbol("_CSETF-LOCKED-QUEUE-LOCK");

    private static final SubLSymbol LOCKED_QUEUE_QUEUE = makeSymbol("LOCKED-QUEUE-QUEUE");

    private static final SubLSymbol _CSETF_LOCKED_QUEUE_QUEUE = makeSymbol("_CSETF-LOCKED-QUEUE-QUEUE");





    private static final SubLSymbol MAKE_LOCKED_QUEUE = makeSymbol("MAKE-LOCKED-QUEUE");

    private static final SubLSymbol VISIT_DEFSTRUCT_OBJECT_LOCKED_QUEUE_METHOD = makeSymbol("VISIT-DEFSTRUCT-OBJECT-LOCKED-QUEUE-METHOD");

    private static final SubLString $$$Queue_Lock = makeString("Queue Lock");

    private static final SubLSymbol LOCKED_P_QUEUE = makeSymbol("LOCKED-P-QUEUE");

    private static final SubLSymbol LOCKED_P_QUEUE_P = makeSymbol("LOCKED-P-QUEUE-P");

    private static final SubLList $list125 = list(makeSymbol("LOCK"), makeSymbol("PRIORITY-QUEUE"));

    private static final SubLList $list126 = list(makeKeyword("LOCK"), makeKeyword("PRIORITY-QUEUE"));

    private static final SubLList $list127 = list(makeSymbol("LP-QUEUE-LOCK"), makeSymbol("LP-QUEUE-PRIORITY-QUEUE"));

    private static final SubLList $list128 = list(makeSymbol("_CSETF-LP-QUEUE-LOCK"), makeSymbol("_CSETF-LP-QUEUE-PRIORITY-QUEUE"));

    private static final SubLSymbol PRINT_LP_QUEUE = makeSymbol("PRINT-LP-QUEUE");

    private static final SubLSymbol LOCKED_P_QUEUE_PRINT_FUNCTION_TRAMPOLINE = makeSymbol("LOCKED-P-QUEUE-PRINT-FUNCTION-TRAMPOLINE");

    private static final SubLList $list131 = list(makeSymbol("OPTIMIZE-FUNCALL"), makeSymbol("LOCKED-P-QUEUE-P"));

    private static final SubLSymbol LP_QUEUE_LOCK = makeSymbol("LP-QUEUE-LOCK");

    private static final SubLSymbol _CSETF_LP_QUEUE_LOCK = makeSymbol("_CSETF-LP-QUEUE-LOCK");

    private static final SubLSymbol LP_QUEUE_PRIORITY_QUEUE = makeSymbol("LP-QUEUE-PRIORITY-QUEUE");

    private static final SubLSymbol _CSETF_LP_QUEUE_PRIORITY_QUEUE = makeSymbol("_CSETF-LP-QUEUE-PRIORITY-QUEUE");



    private static final SubLSymbol MAKE_LOCKED_P_QUEUE = makeSymbol("MAKE-LOCKED-P-QUEUE");

    private static final SubLSymbol VISIT_DEFSTRUCT_OBJECT_LOCKED_P_QUEUE_METHOD = makeSymbol("VISIT-DEFSTRUCT-OBJECT-LOCKED-P-QUEUE-METHOD");

    private static final SubLString $str139$_tree_ = makeString(" tree=");

    private static final SubLString $$$Queues_Module_Supercategory = makeString("Queues Module Supercategory");

    private static final SubLString $$$Priority_Queue_Subcategory = makeString("Priority Queue Subcategory");

    private static final SubLString $$$Priority_Queue_Testing_Suite = makeString("Priority Queue Testing Suite");

    private static final SubLString $$$Locked_Priority_Queue_Subcategory = makeString("Locked Priority Queue Subcategory");

    private static final SubLString $str144$Locked_Priority_Queue_Testing_Sui = makeString("Locked Priority Queue Testing Suite");

    public static SubLObject queue_print_function_trampoline(final SubLObject v_object, final SubLObject stream) {
        print_queue(v_object, stream, ZERO_INTEGER);
        return NIL;
    }

    public static SubLObject queue_p(final SubLObject v_object) {
        return v_object.getClass() == $queue_native.class ? T : NIL;
    }

    public static SubLObject q_num(final SubLObject v_object) {
        assert NIL != queue_p(v_object) : "queues.queue_p error :" + v_object;
        return v_object.getField2();
    }

    public static SubLObject q_elements(final SubLObject v_object) {
        assert NIL != queue_p(v_object) : "queues.queue_p error :" + v_object;
        return v_object.getField3();
    }

    public static SubLObject q_last(final SubLObject v_object) {
        assert NIL != queue_p(v_object) : "queues.queue_p error :" + v_object;
        return v_object.getField4();
    }

    public static SubLObject _csetf_q_num(final SubLObject v_object, final SubLObject value) {
        assert NIL != queue_p(v_object) : "queues.queue_p error :" + v_object;
        return v_object.setField2(value);
    }

    public static SubLObject _csetf_q_elements(final SubLObject v_object, final SubLObject value) {
        assert NIL != queue_p(v_object) : "queues.queue_p error :" + v_object;
        return v_object.setField3(value);
    }

    public static SubLObject _csetf_q_last(final SubLObject v_object, final SubLObject value) {
        assert NIL != queue_p(v_object) : "queues.queue_p error :" + v_object;
        return v_object.setField4(value);
    }

    public static SubLObject make_queue(SubLObject arglist) {
        if (arglist == UNPROVIDED) {
            arglist = NIL;
        }
        final SubLObject v_new = new $queue_native();
        SubLObject next;
        SubLObject current_arg;
        SubLObject current_value;
        SubLObject pcase_var;
        for (next = NIL, next = arglist; NIL != next; next = cddr(next)) {
            current_arg = next.first();
            current_value = cadr(next);
            pcase_var = current_arg;
            if (pcase_var.eql($NUM)) {
                _csetf_q_num(v_new, current_value);
            } else
                if (pcase_var.eql($ELEMENTS)) {
                    _csetf_q_elements(v_new, current_value);
                } else
                    if (pcase_var.eql($LAST)) {
                        _csetf_q_last(v_new, current_value);
                    } else {
                        Errors.error($str18$Invalid_slot__S_for_construction_, current_arg);
                    }


        }
        return v_new;
    }

    public static SubLObject visit_defstruct_queue(final SubLObject obj, final SubLObject visitor_fn) {
        funcall(visitor_fn, obj, $BEGIN, MAKE_QUEUE, THREE_INTEGER);
        funcall(visitor_fn, obj, $SLOT, $NUM, q_num(obj));
        funcall(visitor_fn, obj, $SLOT, $ELEMENTS, q_elements(obj));
        funcall(visitor_fn, obj, $SLOT, $LAST, q_last(obj));
        funcall(visitor_fn, obj, $END, MAKE_QUEUE, THREE_INTEGER);
        return obj;
    }

    public static SubLObject visit_defstruct_object_queue_method(final SubLObject obj, final SubLObject visitor_fn) {
        return visit_defstruct_queue(obj, visitor_fn);
    }

    public static SubLObject print_queue(final SubLObject queue, final SubLObject stream, final SubLObject depth) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != $print_readably$.getDynamicValue(thread)) {
            print_not_readable(queue, stream);
        } else {
            print_macros.print_unreadable_object_preamble(stream, queue, T, T);
            write_string($str24$size_, stream, UNPROVIDED, UNPROVIDED);
            princ(queue_size(queue), stream);
            print_macros.print_unreadable_object_postamble(stream, queue, T, T);
        }
        return queue;
    }

    public static SubLObject create_queue(SubLObject initial_elements) {
        if (initial_elements == UNPROVIDED) {
            initial_elements = NIL;
        }
        final SubLObject queue = clear_queue(make_queue(UNPROVIDED));
        if (NIL != initial_elements) {
            enqueue_all(initial_elements, queue);
        }
        return queue;
    }

    public static SubLObject clear_queue(final SubLObject queue) {
        assert NIL != queue_p(queue) : "queues.queue_p(queue) " + "CommonSymbols.NIL != queues.queue_p(queue) " + queue;
        _csetf_q_num(queue, ZERO_INTEGER);
        _csetf_q_elements(queue, NIL);
        _csetf_q_last(queue, NIL);
        return queue;
    }

    public static SubLObject queue_empty_p(final SubLObject queue) {
        assert NIL != queue_p(queue) : "queues.queue_p(queue) " + "CommonSymbols.NIL != queues.queue_p(queue) " + queue;
        return sublisp_null(q_elements(queue));
    }

    public static SubLObject queue_not_empty_p(final SubLObject queue) {
        assert NIL != queue_p(queue) : "queues.queue_p(queue) " + "CommonSymbols.NIL != queues.queue_p(queue) " + queue;
        return list_utilities.sublisp_boolean(q_elements(queue));
    }

    public static SubLObject queue_size(final SubLObject queue) {
        assert NIL != queue_p(queue) : "queues.queue_p(queue) " + "CommonSymbols.NIL != queues.queue_p(queue) " + queue;
        return q_num(queue);
    }

    public static SubLObject queue_elements(final SubLObject queue) {
        assert NIL != queue_p(queue) : "queues.queue_p(queue) " + "CommonSymbols.NIL != queues.queue_p(queue) " + queue;
        return copy_list(q_elements(queue));
    }

    public static SubLObject enqueue(final SubLObject item, final SubLObject queue) {
        final SubLObject new_cell = list(item);
        if (NIL != queue_empty_p(queue)) {
            _csetf_q_elements(queue, new_cell);
        } else {
            rplacd(q_last(queue), new_cell);
        }
        _csetf_q_num(queue, add(q_num(queue), ONE_INTEGER));
        _csetf_q_last(queue, new_cell);
        return queue;
    }

    public static SubLObject enqueue_all(final SubLObject items, final SubLObject queue) {
        SubLObject cdolist_list_var = items;
        SubLObject item = NIL;
        item = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            enqueue(item, queue);
            cdolist_list_var = cdolist_list_var.rest();
            item = cdolist_list_var.first();
        } 
        return queue;
    }

    public static SubLObject dequeue(final SubLObject queue) {
        assert NIL != queue_p(queue) : "queues.queue_p(queue) " + "CommonSymbols.NIL != queues.queue_p(queue) " + queue;
        if (NIL == queue_empty_p(queue)) {
            final SubLObject elements = q_elements(queue);
            final SubLObject item = elements.first();
            final SubLObject rest = elements.rest();
            _csetf_q_num(queue, subtract(q_num(queue), ONE_INTEGER));
            _csetf_q_elements(queue, rest);
            if (NIL == rest) {
                _csetf_q_last(queue, NIL);
            }
            return item;
        }
        return NIL;
    }

    public static SubLObject dequeue_all(final SubLObject queue) {
        assert NIL != queue_p(queue) : "queues.queue_p(queue) " + "CommonSymbols.NIL != queues.queue_p(queue) " + queue;
        final SubLObject elements = q_elements(queue);
        clear_queue(queue);
        return elements;
    }

    public static SubLObject requeue(final SubLObject queue) {
        assert NIL != queue_p(queue) : "queues.queue_p(queue) " + "CommonSymbols.NIL != queues.queue_p(queue) " + queue;
        final SubLObject item = dequeue(queue);
        enqueue(item, queue);
        return item;
    }

    public static SubLObject remqueue(final SubLObject item, final SubLObject queue, SubLObject test) {
        if (test == UNPROVIDED) {
            test = symbol_function(EQL);
        }
        assert NIL != queue_p(queue) : "queues.queue_p(queue) " + "CommonSymbols.NIL != queues.queue_p(queue) " + queue;
        final SubLObject last = q_last(queue);
        SubLObject back = NIL;
        SubLObject next;
        for (next = NIL, next = q_elements(queue); NIL != next; next = next.rest()) {
            if (NIL != funcall(test, next.first(), item)) {
                _csetf_q_num(queue, subtract(q_num(queue), ONE_INTEGER));
                if (next.eql(last)) {
                    _csetf_q_last(queue, back);
                }
                if (next.eql(q_elements(queue))) {
                    _csetf_q_elements(queue, next.rest());
                } else {
                    rplacd(back, next.rest());
                }
            } else {
                back = next;
            }
        }
        return queue;
    }

    public static SubLObject remlast_queue(final SubLObject queue) {
        assert NIL != queue_p(queue) : "queues.queue_p(queue) " + "CommonSymbols.NIL != queues.queue_p(queue) " + queue;
        if (NIL != queue_empty_p(queue)) {
            return queue;
        }
        if (queue_size(queue).numE(ONE_INTEGER)) {
            return clear_queue(queue);
        }
        SubLObject back = NIL;
        SubLObject last;
        SubLObject next;
        for (last = q_last(queue), next = NIL, next = q_elements(queue); !next.eql(last); next = next.rest()) {
            back = next;
        }
        _csetf_q_num(queue, subtract(q_num(queue), ONE_INTEGER));
        _csetf_q_last(queue, back);
        rplacd(back, next.rest());
        return queue;
    }

    public static SubLObject queue_find(final SubLObject item, final SubLObject queue, SubLObject test, SubLObject key) {
        if (test == UNPROVIDED) {
            test = symbol_function(EQL);
        }
        if (key == UNPROVIDED) {
            key = symbol_function(IDENTITY);
        }
        assert NIL != queue_p(queue) : "queues.queue_p(queue) " + "CommonSymbols.NIL != queues.queue_p(queue) " + queue;
        return find(item, q_elements(queue), test, key, UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject queue_find_if(final SubLObject test, final SubLObject queue, SubLObject key) {
        if (key == UNPROVIDED) {
            key = symbol_function(IDENTITY);
        }
        assert NIL != queue_p(queue) : "queues.queue_p(queue) " + "CommonSymbols.NIL != queues.queue_p(queue) " + queue;
        return find_if(test, q_elements(queue), key, UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject queue_peek(final SubLObject queue) {
        assert NIL != queue_p(queue) : "queues.queue_p(queue) " + "CommonSymbols.NIL != queues.queue_p(queue) " + queue;
        return q_elements(queue).first();
    }

    public static SubLObject queue_peek_n(final SubLObject queue, final SubLObject n) {
        assert NIL != queue_p(queue) : "queues.queue_p(queue) " + "CommonSymbols.NIL != queues.queue_p(queue) " + queue;
        return list_utilities.first_n(n, q_elements(queue));
    }

    public static SubLObject new_queue_iterator(final SubLObject queue) {
        assert NIL != queue_p(queue) : "queues.queue_p(queue) " + "CommonSymbols.NIL != queues.queue_p(queue) " + queue;
        return iteration.new_list_iterator(q_elements(queue));
    }

    public static SubLObject do_queue_elements(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list25);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject item_var = NIL;
        SubLObject queue = NIL;
        destructuring_bind_must_consp(current, datum, $list25);
        item_var = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list25);
        queue = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = NIL;
        SubLObject rest = current;
        SubLObject bad = NIL;
        SubLObject current_$1 = NIL;
        while (NIL != rest) {
            destructuring_bind_must_consp(rest, datum, $list25);
            current_$1 = rest.first();
            rest = rest.rest();
            destructuring_bind_must_consp(rest, datum, $list25);
            if (NIL == member(current_$1, $list26, UNPROVIDED, UNPROVIDED)) {
                bad = T;
            }
            if (current_$1 == $ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        } 
        if ((NIL != bad) && (NIL == allow_other_keys_p)) {
            cdestructuring_bind_error(datum, $list25);
        }
        final SubLObject done_tail = property_list_member($DONE, current);
        final SubLObject done = (NIL != done_tail) ? cadr(done_tail) : NIL;
        final SubLObject body;
        current = body = temp;
        return listS(DO_LIST, list(item_var, list(DO_QUEUE_ELEMENTS_QUEUE_ELEMENTS, queue), $DONE, done), append(body, NIL));
    }

    public static SubLObject do_queue_elements_queue_elements(final SubLObject queue) {
        return q_elements(queue);
    }

    public static SubLObject do_queue_dequeue(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list25);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject item_var = NIL;
        SubLObject queue = NIL;
        destructuring_bind_must_consp(current, datum, $list25);
        item_var = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list25);
        queue = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = NIL;
        SubLObject rest = current;
        SubLObject bad = NIL;
        SubLObject current_$2 = NIL;
        while (NIL != rest) {
            destructuring_bind_must_consp(rest, datum, $list25);
            current_$2 = rest.first();
            rest = rest.rest();
            destructuring_bind_must_consp(rest, datum, $list25);
            if (NIL == member(current_$2, $list26, UNPROVIDED, UNPROVIDED)) {
                bad = T;
            }
            if (current_$2 == $ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        } 
        if ((NIL != bad) && (NIL == allow_other_keys_p)) {
            cdestructuring_bind_error(datum, $list25);
        }
        final SubLObject done_tail = property_list_member($DONE, current);
        final SubLObject done = (NIL != done_tail) ? cadr(done_tail) : NIL;
        final SubLObject body;
        current = body = temp;
        final SubLObject q = $sym32$Q;
        final SubLObject done_var = $sym33$DONE_VAR;
        return list(CLET, list(list(q, queue), list(done_var, bq_cons(COR, append(NIL != done ? list(done) : NIL, list(list(QUEUE_EMPTY_P, q)))))), list(WHILE, list(CNOT, done_var), listS(CLET, list(list(item_var, list(DEQUEUE, q))), append(body, list(list(CSETQ, done_var, bq_cons(COR, append(NIL != done ? list(done) : NIL, list(list(QUEUE_EMPTY_P, q))))))))));
    }

    public static SubLObject queue_copy(final SubLObject queue) {
        final SubLObject copy = create_queue(UNPROVIDED);
        SubLObject cdolist_list_var = do_queue_elements_queue_elements(queue);
        SubLObject item = NIL;
        item = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            enqueue(item, copy);
            cdolist_list_var = cdolist_list_var.rest();
            item = cdolist_list_var.first();
        } 
        return copy;
    }

    public static SubLObject print_queue_contents(final SubLObject queue, SubLObject stream) {
        if (stream == UNPROVIDED) {
            stream = T;
        }
        format(stream, $str41$__Queue_length____a, queue_size(queue));
        format(stream, $str42$__Queue_contents__);
        SubLObject cdolist_list_var = q_elements(queue);
        SubLObject item = NIL;
        item = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            format(stream, $str43$___s, item);
            cdolist_list_var = cdolist_list_var.rest();
            item = cdolist_list_var.first();
        } 
        return NIL;
    }

    public static SubLObject cfasl_output_object_queue_method(final SubLObject v_object, final SubLObject stream) {
        cfasl_wide_output_queue(v_object, stream);
        return v_object;
    }

    public static SubLObject cfasl_wide_output_queue(final SubLObject queue, final SubLObject stream) {
        cfasl_output_wide_opcode($cfasl_wide_opcode_queue$.getGlobalValue(), stream);
        cfasl_output_queue_internal(queue, stream);
        return queue;
    }

    public static SubLObject cfasl_output_queue_internal(final SubLObject queue, final SubLObject stream) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject size = queue_size(queue);
        SubLObject counter = ZERO_INTEGER;
        cfasl_output(size, stream);
        SubLObject cdolist_list_var = do_queue_elements_queue_elements(queue);
        SubLObject curr = NIL;
        curr = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            cfasl_output(curr, stream);
            counter = add(counter, ONE_INTEGER);
            cdolist_list_var = cdolist_list_var.rest();
            curr = cdolist_list_var.first();
        } 
        if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (!counter.numE(size))) {
            Errors.error($str47$We_promised_to_write__A_elements_, size, counter);
        }
        return queue;
    }

    public static SubLObject cfasl_input_queue(final SubLObject stream) {
        final SubLObject size = cfasl_input(stream, UNPROVIDED, UNPROVIDED);
        final SubLObject queue = create_queue(UNPROVIDED);
        SubLObject i;
        SubLObject item;
        for (i = NIL, i = ZERO_INTEGER; i.numL(size); i = add(i, ONE_INTEGER)) {
            item = cfasl_input(stream, UNPROVIDED, UNPROVIDED);
            enqueue(item, queue);
        }
        return queue;
    }

    public static SubLObject priority_queue_print_function_trampoline(final SubLObject v_object, final SubLObject stream) {
        print_p_queue(v_object, stream, ZERO_INTEGER);
        return NIL;
    }

    public static SubLObject priority_queue_p(final SubLObject v_object) {
        return v_object.getClass() == $priority_queue_native.class ? T : NIL;
    }

    public static SubLObject p_queue_num(final SubLObject v_object) {
        assert NIL != priority_queue_p(v_object) : "queues.priority_queue_p error :" + v_object;
        return v_object.getField2();
    }

    public static SubLObject p_queue_max_size(final SubLObject v_object) {
        assert NIL != priority_queue_p(v_object) : "queues.priority_queue_p error :" + v_object;
        return v_object.getField3();
    }

    public static SubLObject p_queue_rank_func(final SubLObject v_object) {
        assert NIL != priority_queue_p(v_object) : "queues.priority_queue_p error :" + v_object;
        return v_object.getField4();
    }

    public static SubLObject p_queue_comp_func(final SubLObject v_object) {
        assert NIL != priority_queue_p(v_object) : "queues.priority_queue_p error :" + v_object;
        return v_object.getField5();
    }

    public static SubLObject p_queue_tree(final SubLObject v_object) {
        assert NIL != priority_queue_p(v_object) : "queues.priority_queue_p error :" + v_object;
        return v_object.getField6();
    }

    public static SubLObject _csetf_p_queue_num(final SubLObject v_object, final SubLObject value) {
        assert NIL != priority_queue_p(v_object) : "queues.priority_queue_p error :" + v_object;
        return v_object.setField2(value);
    }

    public static SubLObject _csetf_p_queue_max_size(final SubLObject v_object, final SubLObject value) {
        assert NIL != priority_queue_p(v_object) : "queues.priority_queue_p error :" + v_object;
        return v_object.setField3(value);
    }

    public static SubLObject _csetf_p_queue_rank_func(final SubLObject v_object, final SubLObject value) {
        assert NIL != priority_queue_p(v_object) : "queues.priority_queue_p error :" + v_object;
        return v_object.setField4(value);
    }

    public static SubLObject _csetf_p_queue_comp_func(final SubLObject v_object, final SubLObject value) {
        assert NIL != priority_queue_p(v_object) : "queues.priority_queue_p error :" + v_object;
        return v_object.setField5(value);
    }

    public static SubLObject _csetf_p_queue_tree(final SubLObject v_object, final SubLObject value) {
        assert NIL != priority_queue_p(v_object) : "queues.priority_queue_p error :" + v_object;
        return v_object.setField6(value);
    }

    public static SubLObject make_priority_queue(SubLObject arglist) {
        if (arglist == UNPROVIDED) {
            arglist = NIL;
        }
        final SubLObject v_new = new $priority_queue_native();
        SubLObject next;
        SubLObject current_arg;
        SubLObject current_value;
        SubLObject pcase_var;
        for (next = NIL, next = arglist; NIL != next; next = cddr(next)) {
            current_arg = next.first();
            current_value = cadr(next);
            pcase_var = current_arg;
            if (pcase_var.eql($NUM)) {
                _csetf_p_queue_num(v_new, current_value);
            } else
                if (pcase_var.eql($MAX_SIZE)) {
                    _csetf_p_queue_max_size(v_new, current_value);
                } else
                    if (pcase_var.eql($RANK_FUNC)) {
                        _csetf_p_queue_rank_func(v_new, current_value);
                    } else
                        if (pcase_var.eql($COMP_FUNC)) {
                            _csetf_p_queue_comp_func(v_new, current_value);
                        } else
                            if (pcase_var.eql($TREE)) {
                                _csetf_p_queue_tree(v_new, current_value);
                            } else {
                                Errors.error($str18$Invalid_slot__S_for_construction_, current_arg);
                            }




        }
        return v_new;
    }

    public static SubLObject visit_defstruct_priority_queue(final SubLObject obj, final SubLObject visitor_fn) {
        funcall(visitor_fn, obj, $BEGIN, MAKE_PRIORITY_QUEUE, FIVE_INTEGER);
        funcall(visitor_fn, obj, $SLOT, $NUM, p_queue_num(obj));
        funcall(visitor_fn, obj, $SLOT, $MAX_SIZE, p_queue_max_size(obj));
        funcall(visitor_fn, obj, $SLOT, $RANK_FUNC, p_queue_rank_func(obj));
        funcall(visitor_fn, obj, $SLOT, $COMP_FUNC, p_queue_comp_func(obj));
        funcall(visitor_fn, obj, $SLOT, $TREE, p_queue_tree(obj));
        funcall(visitor_fn, obj, $END, MAKE_PRIORITY_QUEUE, FIVE_INTEGER);
        return obj;
    }

    public static SubLObject visit_defstruct_object_priority_queue_method(final SubLObject obj, final SubLObject visitor_fn) {
        return visit_defstruct_priority_queue(obj, visitor_fn);
    }

    public static SubLObject print_p_queue(final SubLObject p_queue, final SubLObject stream, final SubLObject depth) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != $print_readably$.getDynamicValue(thread)) {
            print_not_readable(p_queue, stream);
        } else {
            print_macros.print_unreadable_object_preamble(stream, p_queue, T, T);
            write_string($str24$size_, stream, UNPROVIDED, UNPROVIDED);
            princ(p_queue_size(p_queue), stream);
            print_macros.print_unreadable_object_postamble(stream, p_queue, T, T);
        }
        return p_queue;
    }

    public static SubLObject create_p_queue(final SubLObject max_size, SubLObject rank_func, SubLObject comp_func) {
        if (comp_func == UNPROVIDED) {
            comp_func = symbol_function($sym73$_);
        }
        if (rank_func.isSymbol()) {
            rank_func = symbol_function(rank_func);
        }
        if (comp_func.isSymbol()) {
            comp_func = symbol_function(comp_func);
        }
        final SubLObject pq = make_priority_queue(UNPROVIDED);
        _csetf_p_queue_num(pq, ZERO_INTEGER);
        _csetf_p_queue_max_size(pq, max_size);
        _csetf_p_queue_rank_func(pq, rank_func);
        _csetf_p_queue_comp_func(pq, comp_func);
        _csetf_p_queue_tree(pq, NIL);
        return pq;
    }

    public static SubLObject p_queue_clear(final SubLObject priority_queue) {
        _csetf_p_queue_num(priority_queue, ZERO_INTEGER);
        _csetf_p_queue_tree(priority_queue, NIL);
        return priority_queue;
    }

    public static SubLObject p_queue_size(final SubLObject priority_queue) {
        assert NIL != priority_queue_p(priority_queue) : "queues.priority_queue_p(priority_queue) " + "CommonSymbols.NIL != queues.priority_queue_p(priority_queue) " + priority_queue;
        return p_queue_num(priority_queue);
    }

    public static SubLObject p_queue_empty_p(final SubLObject priority_queue) {
        assert NIL != priority_queue_p(priority_queue) : "queues.priority_queue_p(priority_queue) " + "CommonSymbols.NIL != queues.priority_queue_p(priority_queue) " + priority_queue;
        return numE(p_queue_size(priority_queue), ZERO_INTEGER);
    }

    public static SubLObject p_queue_full_p(final SubLObject priority_queue) {
        assert NIL != priority_queue_p(priority_queue) : "queues.priority_queue_p(priority_queue) " + "CommonSymbols.NIL != queues.priority_queue_p(priority_queue) " + priority_queue;
        return makeBoolean(p_queue_max_size(priority_queue).isFixnum() && p_queue_size(priority_queue).numE(p_queue_max_size(priority_queue)));
    }

    public static SubLObject p_queue_best(final SubLObject priority_queue) {
        assert NIL != priority_queue_p(priority_queue) : "queues.priority_queue_p(priority_queue) " + "CommonSymbols.NIL != queues.priority_queue_p(priority_queue) " + priority_queue;
        final SubLObject best = binary_tree.btree_find_best(p_queue_tree(priority_queue));
        if (NIL != binary_tree.btree_p(best)) {
            return pq_collision_next(binary_tree.bt_state(best));
        }
        return NIL;
    }

    public static SubLObject p_queue_worst(final SubLObject priority_queue) {
        assert NIL != priority_queue_p(priority_queue) : "queues.priority_queue_p(priority_queue) " + "CommonSymbols.NIL != queues.priority_queue_p(priority_queue) " + priority_queue;
        final SubLObject worst = binary_tree.btree_find_worst(p_queue_tree(priority_queue));
        if (NIL != binary_tree.btree_p(worst)) {
            return pq_collision_last(binary_tree.bt_state(worst));
        }
        return NIL;
    }

    public static SubLObject p_enqueue(final SubLObject item, final SubLObject priority_queue) {
        assert NIL != priority_queue_p(priority_queue) : "queues.priority_queue_p(priority_queue) " + "CommonSymbols.NIL != queues.priority_queue_p(priority_queue) " + priority_queue;
        final SubLObject bumpedP = p_queue_full_p(priority_queue);
        if (NIL == bumpedP) {
            final SubLObject ans = binary_tree.btree_insert(item, funcall(p_queue_rank_func(priority_queue), item), p_queue_tree(priority_queue), p_queue_comp_func(priority_queue), symbol_function(PQ_COLLISION_ENTER));
            if (!ans.eql(p_queue_tree(priority_queue))) {
                _csetf_p_queue_tree(priority_queue, ans);
            }
            _csetf_p_queue_num(priority_queue, add(p_queue_num(priority_queue), ONE_INTEGER));
            return values(priority_queue, bumpedP, NIL);
        }
        final SubLObject worst = p_queue_worst(priority_queue);
        if (NIL != funcall(p_queue_comp_func(priority_queue), funcall(p_queue_rank_func(priority_queue), item), funcall(p_queue_rank_func(priority_queue), worst))) {
            final SubLObject bumped_item = p_dequeue(priority_queue, T);
            p_enqueue(item, priority_queue);
            return values(priority_queue, bumpedP, bumped_item);
        }
        return values(priority_queue, bumpedP, item);
    }

    public static SubLObject p_dequeue(final SubLObject priority_queue, SubLObject worstP) {
        if (worstP == UNPROVIDED) {
            worstP = NIL;
        }
        assert NIL != priority_queue_p(priority_queue) : "queues.priority_queue_p(priority_queue) " + "CommonSymbols.NIL != queues.priority_queue_p(priority_queue) " + priority_queue;
        if (NIL == p_queue_empty_p(priority_queue)) {
            final SubLObject remove = (NIL != worstP) ? p_queue_worst(priority_queue) : p_queue_best(priority_queue);
            final SubLObject ans = binary_tree.btree_remove(remove, funcall(p_queue_rank_func(priority_queue), remove), p_queue_tree(priority_queue), p_queue_comp_func(priority_queue), symbol_function(PQ_COLLISION_REMOVE), symbol_function(PQ_COLLISION_EMPTY));
            if (!ans.eql(p_queue_tree(priority_queue))) {
                _csetf_p_queue_tree(priority_queue, ans);
            }
            _csetf_p_queue_num(priority_queue, subtract(p_queue_num(priority_queue), ONE_INTEGER));
            return remove;
        }
        return NIL;
    }

    public static SubLObject do_priority_queue_elements(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list77);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject item_var = NIL;
        SubLObject priority_queue = NIL;
        destructuring_bind_must_consp(current, datum, $list77);
        item_var = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list77);
        priority_queue = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = NIL;
        SubLObject rest = current;
        SubLObject bad = NIL;
        SubLObject current_$3 = NIL;
        while (NIL != rest) {
            destructuring_bind_must_consp(rest, datum, $list77);
            current_$3 = rest.first();
            rest = rest.rest();
            destructuring_bind_must_consp(rest, datum, $list77);
            if (NIL == member(current_$3, $list26, UNPROVIDED, UNPROVIDED)) {
                bad = T;
            }
            if (current_$3 == $ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        } 
        if ((NIL != bad) && (NIL == allow_other_keys_p)) {
            cdestructuring_bind_error(datum, $list77);
        }
        final SubLObject done_tail = property_list_member($DONE, current);
        final SubLObject done = (NIL != done_tail) ? cadr(done_tail) : NIL;
        final SubLObject body;
        current = body = temp;
        final SubLObject key_var = $sym78$KEY_VAR;
        final SubLObject collisions_var = $sym79$COLLISIONS_VAR;
        return list(DO_BTREE_INDEX, list(key_var, collisions_var, list(DO_PRIORITY_QUEUE_ELEMENTS_BTREE, priority_queue), $DONE, done), list(IGNORE, key_var), listS(DO_LIST, list(item_var, collisions_var, $DONE, done), append(body, NIL)));
    }

    public static SubLObject do_priority_queue_elements_btree(final SubLObject priority_queue) {
        assert NIL != priority_queue_p(priority_queue) : "queues.priority_queue_p(priority_queue) " + "CommonSymbols.NIL != queues.priority_queue_p(priority_queue) " + priority_queue;
        return p_queue_tree(priority_queue);
    }

    public static SubLObject p_queue_elements(final SubLObject priority_queue) {
        SubLObject items = NIL;
        SubLObject stack = NIL;
        SubLObject subtree = do_priority_queue_elements_btree(priority_queue);
        while (NIL != subtree) {
            final SubLObject key_var = binary_tree.do_btree_index_key(subtree);
            SubLObject cdolist_list_var;
            final SubLObject collisions_var = cdolist_list_var = binary_tree.do_btree_index_value(subtree);
            SubLObject item = NIL;
            item = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                items = cons(item, items);
                cdolist_list_var = cdolist_list_var.rest();
                item = cdolist_list_var.first();
            } 
            final SubLObject lower = binary_tree.do_btree_lower(subtree);
            final SubLObject higher = binary_tree.do_btree_higher(subtree);
            if (NIL != lower) {
                if (NIL != higher) {
                    stack = cons(higher, stack);
                }
                subtree = lower;
            } else
                if (NIL != higher) {
                    subtree = higher;
                } else {
                    subtree = stack.first();
                    stack = stack.rest();
                }

        } 
        stack = NIL;
        final SubLObject comp_func = p_queue_comp_func(priority_queue);
        final SubLObject rank_func = p_queue_rank_func(priority_queue);
        items = Sort.sort(items, comp_func, rank_func);
        return items;
    }

    public static SubLObject p_queue_find(final SubLObject item, final SubLObject queue, SubLObject test, SubLObject key) {
        if (test == UNPROVIDED) {
            test = symbol_function(EQL);
        }
        if (key == UNPROVIDED) {
            key = symbol_function(IDENTITY);
        }
        assert NIL != priority_queue_p(queue) : "queues.priority_queue_p(queue) " + "CommonSymbols.NIL != queues.priority_queue_p(queue) " + queue;
        SubLObject found = NIL;
        SubLObject stack = NIL;
        SubLObject subtree = do_priority_queue_elements_btree(queue);
        while ((NIL == found) && (NIL != subtree)) {
            final SubLObject key_var = binary_tree.do_btree_index_key(subtree);
            final SubLObject collisions_var = binary_tree.do_btree_index_value(subtree);
            SubLObject rest;
            SubLObject this_item;
            for (rest = NIL, rest = collisions_var; (NIL == found) && (NIL != rest); rest = rest.rest()) {
                this_item = rest.first();
                if (NIL != funcall(test, item, funcall(key, this_item))) {
                    found = this_item;
                }
            }
            final SubLObject lower = binary_tree.do_btree_lower(subtree);
            final SubLObject higher = binary_tree.do_btree_higher(subtree);
            if (NIL != lower) {
                if (NIL != higher) {
                    stack = cons(higher, stack);
                }
                subtree = lower;
            } else
                if (NIL != higher) {
                    subtree = higher;
                } else {
                    subtree = stack.first();
                    stack = stack.rest();
                }

        } 
        stack = NIL;
        return found;
    }

    public static SubLObject p_queue_find_if(final SubLObject test, final SubLObject queue, SubLObject key) {
        if (key == UNPROVIDED) {
            key = symbol_function(IDENTITY);
        }
        assert NIL != priority_queue_p(queue) : "queues.priority_queue_p(queue) " + "CommonSymbols.NIL != queues.priority_queue_p(queue) " + queue;
        SubLObject found = NIL;
        SubLObject stack = NIL;
        SubLObject subtree = do_priority_queue_elements_btree(queue);
        while ((NIL == found) && (NIL != subtree)) {
            final SubLObject key_var = binary_tree.do_btree_index_key(subtree);
            final SubLObject collisions_var = binary_tree.do_btree_index_value(subtree);
            SubLObject rest;
            SubLObject this_item;
            for (rest = NIL, rest = collisions_var; (NIL == found) && (NIL != rest); rest = rest.rest()) {
                this_item = rest.first();
                if (NIL != funcall(test, funcall(key, this_item))) {
                    found = this_item;
                }
            }
            final SubLObject lower = binary_tree.do_btree_lower(subtree);
            final SubLObject higher = binary_tree.do_btree_higher(subtree);
            if (NIL != lower) {
                if (NIL != higher) {
                    stack = cons(higher, stack);
                }
                subtree = lower;
            } else
                if (NIL != higher) {
                    subtree = higher;
                } else {
                    subtree = stack.first();
                    stack = stack.rest();
                }

        } 
        stack = NIL;
        return found;
    }

    public static SubLObject pq_collision_enter(final SubLObject item, final SubLObject queue) {
        return list_utilities.nadd_to_end(item, queue);
    }

    public static SubLObject pq_collision_next(final SubLObject queue) {
        return queue.first();
    }

    public static SubLObject pq_collision_last(final SubLObject queue) {
        return list_utilities.last_one(queue);
    }

    public static SubLObject pq_collision_remove(final SubLObject item, final SubLObject queue) {
        return list_utilities.delete_first(item, queue, UNPROVIDED);
    }

    public static SubLObject pq_collision_empty(final SubLObject queue) {
        return sublisp_null(queue);
    }

    public static SubLObject lazy_priority_queue_print_function_trampoline(final SubLObject v_object, final SubLObject stream) {
        print_lazy_p_queue(v_object, stream, ZERO_INTEGER);
        return NIL;
    }

    public static SubLObject lazy_priority_queue_p(final SubLObject v_object) {
        return v_object.getClass() == $lazy_priority_queue_native.class ? T : NIL;
    }

    public static SubLObject lazy_p_queue_ordered_items(final SubLObject v_object) {
        assert NIL != lazy_priority_queue_p(v_object) : "queues.lazy_priority_queue_p error :" + v_object;
        return v_object.getField2();
    }

    public static SubLObject lazy_p_queue_new_items(final SubLObject v_object) {
        assert NIL != lazy_priority_queue_p(v_object) : "queues.lazy_priority_queue_p error :" + v_object;
        return v_object.getField3();
    }

    public static SubLObject _csetf_lazy_p_queue_ordered_items(final SubLObject v_object, final SubLObject value) {
        assert NIL != lazy_priority_queue_p(v_object) : "queues.lazy_priority_queue_p error :" + v_object;
        return v_object.setField2(value);
    }

    public static SubLObject _csetf_lazy_p_queue_new_items(final SubLObject v_object, final SubLObject value) {
        assert NIL != lazy_priority_queue_p(v_object) : "queues.lazy_priority_queue_p error :" + v_object;
        return v_object.setField3(value);
    }

    public static SubLObject make_lazy_priority_queue(SubLObject arglist) {
        if (arglist == UNPROVIDED) {
            arglist = NIL;
        }
        final SubLObject v_new = new $lazy_priority_queue_native();
        SubLObject next;
        SubLObject current_arg;
        SubLObject current_value;
        SubLObject pcase_var;
        for (next = NIL, next = arglist; NIL != next; next = cddr(next)) {
            current_arg = next.first();
            current_value = cadr(next);
            pcase_var = current_arg;
            if (pcase_var.eql($ORDERED_ITEMS)) {
                _csetf_lazy_p_queue_ordered_items(v_new, current_value);
            } else
                if (pcase_var.eql($NEW_ITEMS)) {
                    _csetf_lazy_p_queue_new_items(v_new, current_value);
                } else {
                    Errors.error($str18$Invalid_slot__S_for_construction_, current_arg);
                }

        }
        return v_new;
    }

    public static SubLObject visit_defstruct_lazy_priority_queue(final SubLObject obj, final SubLObject visitor_fn) {
        funcall(visitor_fn, obj, $BEGIN, MAKE_LAZY_PRIORITY_QUEUE, TWO_INTEGER);
        funcall(visitor_fn, obj, $SLOT, $ORDERED_ITEMS, lazy_p_queue_ordered_items(obj));
        funcall(visitor_fn, obj, $SLOT, $NEW_ITEMS, lazy_p_queue_new_items(obj));
        funcall(visitor_fn, obj, $END, MAKE_LAZY_PRIORITY_QUEUE, TWO_INTEGER);
        return obj;
    }

    public static SubLObject visit_defstruct_object_lazy_priority_queue_method(final SubLObject obj, final SubLObject visitor_fn) {
        return visit_defstruct_lazy_priority_queue(obj, visitor_fn);
    }

    public static SubLObject print_lazy_p_queue(final SubLObject lpq, final SubLObject stream, final SubLObject depth) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != $print_readably$.getDynamicValue(thread)) {
            print_not_readable(lpq, stream);
        } else {
            print_macros.print_unreadable_object_preamble(stream, lpq, T, T);
            write_string($str24$size_, stream, UNPROVIDED, UNPROVIDED);
            princ(lazy_priority_queue_size(lpq), stream);
            final SubLObject additions = queue_size(lazy_p_queue_new_items(lpq));
            if (!additions.isZero()) {
                format(stream, $str101$___S_new_, additions);
            }
            print_macros.print_unreadable_object_postamble(stream, lpq, T, T);
        }
        return lpq;
    }

    public static SubLObject new_lazy_priority_queue(final SubLObject rank_func, SubLObject comp_func) {
        if (comp_func == UNPROVIDED) {
            comp_func = symbol_function($sym102$_);
        }
        final SubLObject lpq = make_lazy_priority_queue(UNPROVIDED);
        _csetf_lazy_p_queue_ordered_items(lpq, create_p_queue(NIL, rank_func, comp_func));
        _csetf_lazy_p_queue_new_items(lpq, create_queue(UNPROVIDED));
        return lpq;
    }

    public static SubLObject do_lazy_priority_queue_elements(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list103);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject item_var = NIL;
        SubLObject lpq = NIL;
        destructuring_bind_must_consp(current, datum, $list103);
        item_var = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list103);
        lpq = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = NIL;
        SubLObject rest = current;
        SubLObject bad = NIL;
        SubLObject current_$4 = NIL;
        while (NIL != rest) {
            destructuring_bind_must_consp(rest, datum, $list103);
            current_$4 = rest.first();
            rest = rest.rest();
            destructuring_bind_must_consp(rest, datum, $list103);
            if (NIL == member(current_$4, $list26, UNPROVIDED, UNPROVIDED)) {
                bad = T;
            }
            if (current_$4 == $ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        } 
        if ((NIL != bad) && (NIL == allow_other_keys_p)) {
            cdestructuring_bind_error(datum, $list103);
        }
        final SubLObject done_tail = property_list_member($DONE, current);
        final SubLObject done = (NIL != done_tail) ? cadr(done_tail) : NIL;
        final SubLObject body;
        current = body = temp;
        return listS(DO_LIST, list(item_var, list(LAZY_PRIORITY_QUEUE_ELEMENTS, lpq), $DONE, done), append(body, NIL));
    }

    public static SubLObject lazy_priority_queue_size(final SubLObject lpq) {
        assert NIL != lazy_priority_queue_p(lpq) : "queues.lazy_priority_queue_p(lpq) " + "CommonSymbols.NIL != queues.lazy_priority_queue_p(lpq) " + lpq;
        return add(p_queue_size(lazy_p_queue_ordered_items(lpq)), queue_size(lazy_p_queue_new_items(lpq)));
    }

    public static SubLObject lazy_priority_queue_empty_p(final SubLObject lpq) {
        return zerop(lazy_priority_queue_size(lpq));
    }

    public static SubLObject lazy_priority_queue_peek(final SubLObject lpq) {
        assert NIL != lazy_priority_queue_p(lpq) : "queues.lazy_priority_queue_p(lpq) " + "CommonSymbols.NIL != queues.lazy_priority_queue_p(lpq) " + lpq;
        ensure_lazy_priority_queue_ordered(lpq);
        return p_queue_best(lazy_p_queue_ordered_items(lpq));
    }

    public static SubLObject lazy_priority_queue_elements(final SubLObject lpq) {
        assert NIL != lazy_priority_queue_p(lpq) : "queues.lazy_priority_queue_p(lpq) " + "CommonSymbols.NIL != queues.lazy_priority_queue_p(lpq) " + lpq;
        ensure_lazy_priority_queue_ordered(lpq);
        return p_queue_elements(lazy_p_queue_ordered_items(lpq));
    }

    public static SubLObject lazy_priority_queue_add(final SubLObject lpq, final SubLObject item) {
        assert NIL != lazy_priority_queue_p(lpq) : "queues.lazy_priority_queue_p(lpq) " + "CommonSymbols.NIL != queues.lazy_priority_queue_p(lpq) " + lpq;
        enqueue(item, lazy_p_queue_new_items(lpq));
        return lpq;
    }

    public static SubLObject lazy_priority_queue_remove(final SubLObject lpq) {
        assert NIL != lazy_priority_queue_p(lpq) : "queues.lazy_priority_queue_p(lpq) " + "CommonSymbols.NIL != queues.lazy_priority_queue_p(lpq) " + lpq;
        ensure_lazy_priority_queue_ordered(lpq);
        return p_dequeue(lazy_p_queue_ordered_items(lpq), UNPROVIDED);
    }

    public static SubLObject ensure_lazy_priority_queue_ordered(final SubLObject lpq) {
        final SubLObject ordered_items = lazy_p_queue_ordered_items(lpq);
        final SubLObject new_items = lazy_p_queue_new_items(lpq);
        while (NIL == queue_empty_p(new_items)) {
            p_enqueue(dequeue(new_items), ordered_items);
        } 
        return lpq;
    }

    public static SubLObject locked_queue_print_function_trampoline(final SubLObject v_object, final SubLObject stream) {
        compatibility.default_struct_print_function(v_object, stream, ZERO_INTEGER);
        return NIL;
    }

    public static SubLObject locked_queue_p(final SubLObject v_object) {
        return v_object.getClass() == $locked_queue_native.class ? T : NIL;
    }

    public static SubLObject locked_queue_lock(final SubLObject v_object) {
        assert NIL != locked_queue_p(v_object) : "queues.locked_queue_p error :" + v_object;
        return v_object.getField2();
    }

    public static SubLObject locked_queue_queue(final SubLObject v_object) {
        assert NIL != locked_queue_p(v_object) : "queues.locked_queue_p error :" + v_object;
        return v_object.getField3();
    }

    public static SubLObject _csetf_locked_queue_lock(final SubLObject v_object, final SubLObject value) {
        assert NIL != locked_queue_p(v_object) : "queues.locked_queue_p error :" + v_object;
        return v_object.setField2(value);
    }

    public static SubLObject _csetf_locked_queue_queue(final SubLObject v_object, final SubLObject value) {
        assert NIL != locked_queue_p(v_object) : "queues.locked_queue_p error :" + v_object;
        return v_object.setField3(value);
    }

    public static SubLObject make_locked_queue(SubLObject arglist) {
        if (arglist == UNPROVIDED) {
            arglist = NIL;
        }
        final SubLObject v_new = new $locked_queue_native();
        SubLObject next;
        SubLObject current_arg;
        SubLObject current_value;
        SubLObject pcase_var;
        for (next = NIL, next = arglist; NIL != next; next = cddr(next)) {
            current_arg = next.first();
            current_value = cadr(next);
            pcase_var = current_arg;
            if (pcase_var.eql($LOCK)) {
                _csetf_locked_queue_lock(v_new, current_value);
            } else
                if (pcase_var.eql($QUEUE)) {
                    _csetf_locked_queue_queue(v_new, current_value);
                } else {
                    Errors.error($str18$Invalid_slot__S_for_construction_, current_arg);
                }

        }
        return v_new;
    }

    public static SubLObject visit_defstruct_locked_queue(final SubLObject obj, final SubLObject visitor_fn) {
        funcall(visitor_fn, obj, $BEGIN, MAKE_LOCKED_QUEUE, TWO_INTEGER);
        funcall(visitor_fn, obj, $SLOT, $LOCK, locked_queue_lock(obj));
        funcall(visitor_fn, obj, $SLOT, $QUEUE, locked_queue_queue(obj));
        funcall(visitor_fn, obj, $END, MAKE_LOCKED_QUEUE, TWO_INTEGER);
        return obj;
    }

    public static SubLObject visit_defstruct_object_locked_queue_method(final SubLObject obj, final SubLObject visitor_fn) {
        return visit_defstruct_locked_queue(obj, visitor_fn);
    }

    public static SubLObject create_locked_queue() {
        final SubLObject lq = make_locked_queue(UNPROVIDED);
        _csetf_locked_queue_queue(lq, create_queue(UNPROVIDED));
        _csetf_locked_queue_lock(lq, make_lock($$$Queue_Lock));
        return lq;
    }

    public static SubLObject clear_locked_queue(final SubLObject lq) {
        SubLObject ans = NIL;
        if (NIL != locked_queue_p(lq)) {
            final SubLObject lock = locked_queue_lock(lq);
            SubLObject release = NIL;
            try {
                release = seize_lock(lock);
                ans = clear_queue(locked_queue_queue(lq));
            } finally {
                if (NIL != release) {
                    release_lock(lock);
                }
            }
        }
        return ans;
    }

    public static SubLObject locked_queue_empty_p(final SubLObject lq) {
        SubLObject ans = NIL;
        if (NIL != locked_queue_p(lq)) {
            final SubLObject lock = locked_queue_lock(lq);
            SubLObject release = NIL;
            try {
                release = seize_lock(lock);
                ans = queue_empty_p(locked_queue_queue(lq));
            } finally {
                if (NIL != release) {
                    release_lock(lock);
                }
            }
        }
        return ans;
    }

    public static SubLObject locked_queue_size(final SubLObject lq) {
        SubLObject ans = NIL;
        if (NIL != locked_queue_p(lq)) {
            final SubLObject lock = locked_queue_lock(lq);
            SubLObject release = NIL;
            try {
                release = seize_lock(lock);
                ans = queue_size(locked_queue_queue(lq));
            } finally {
                if (NIL != release) {
                    release_lock(lock);
                }
            }
        }
        return ans;
    }

    public static SubLObject locked_queue_elements(final SubLObject lq) {
        SubLObject ans = NIL;
        if (NIL != locked_queue_p(lq)) {
            final SubLObject lock = locked_queue_lock(lq);
            SubLObject release = NIL;
            try {
                release = seize_lock(lock);
                ans = queue_elements(locked_queue_queue(lq));
            } finally {
                if (NIL != release) {
                    release_lock(lock);
                }
            }
        }
        return ans;
    }

    public static SubLObject locked_enqueue(final SubLObject item, final SubLObject lq) {
        SubLObject ans = NIL;
        if (NIL != locked_queue_p(lq)) {
            final SubLObject lock = locked_queue_lock(lq);
            SubLObject release = NIL;
            try {
                release = seize_lock(lock);
                ans = enqueue(item, locked_queue_queue(lq));
            } finally {
                if (NIL != release) {
                    release_lock(lock);
                }
            }
        }
        return ans;
    }

    public static SubLObject locked_dequeue(final SubLObject lq) {
        SubLObject ans = NIL;
        if (NIL != locked_queue_p(lq)) {
            final SubLObject lock = locked_queue_lock(lq);
            SubLObject release = NIL;
            try {
                release = seize_lock(lock);
                ans = dequeue(locked_queue_queue(lq));
            } finally {
                if (NIL != release) {
                    release_lock(lock);
                }
            }
        }
        return ans;
    }

    public static SubLObject locked_p_queue_print_function_trampoline(final SubLObject v_object, final SubLObject stream) {
        print_lp_queue(v_object, stream, ZERO_INTEGER);
        return NIL;
    }

    public static SubLObject locked_p_queue_p(final SubLObject v_object) {
        return v_object.getClass() == $locked_p_queue_native.class ? T : NIL;
    }

    public static SubLObject lp_queue_lock(final SubLObject v_object) {
        assert NIL != locked_p_queue_p(v_object) : "queues.locked_p_queue_p error :" + v_object;
        return v_object.getField2();
    }

    public static SubLObject lp_queue_priority_queue(final SubLObject v_object) {
        assert NIL != locked_p_queue_p(v_object) : "queues.locked_p_queue_p error :" + v_object;
        return v_object.getField3();
    }

    public static SubLObject _csetf_lp_queue_lock(final SubLObject v_object, final SubLObject value) {
        assert NIL != locked_p_queue_p(v_object) : "queues.locked_p_queue_p error :" + v_object;
        return v_object.setField2(value);
    }

    public static SubLObject _csetf_lp_queue_priority_queue(final SubLObject v_object, final SubLObject value) {
        assert NIL != locked_p_queue_p(v_object) : "queues.locked_p_queue_p error :" + v_object;
        return v_object.setField3(value);
    }

    public static SubLObject make_locked_p_queue(SubLObject arglist) {
        if (arglist == UNPROVIDED) {
            arglist = NIL;
        }
        final SubLObject v_new = new $locked_p_queue_native();
        SubLObject next;
        SubLObject current_arg;
        SubLObject current_value;
        SubLObject pcase_var;
        for (next = NIL, next = arglist; NIL != next; next = cddr(next)) {
            current_arg = next.first();
            current_value = cadr(next);
            pcase_var = current_arg;
            if (pcase_var.eql($LOCK)) {
                _csetf_lp_queue_lock(v_new, current_value);
            } else
                if (pcase_var.eql($PRIORITY_QUEUE)) {
                    _csetf_lp_queue_priority_queue(v_new, current_value);
                } else {
                    Errors.error($str18$Invalid_slot__S_for_construction_, current_arg);
                }

        }
        return v_new;
    }

    public static SubLObject visit_defstruct_locked_p_queue(final SubLObject obj, final SubLObject visitor_fn) {
        funcall(visitor_fn, obj, $BEGIN, MAKE_LOCKED_P_QUEUE, TWO_INTEGER);
        funcall(visitor_fn, obj, $SLOT, $LOCK, lp_queue_lock(obj));
        funcall(visitor_fn, obj, $SLOT, $PRIORITY_QUEUE, lp_queue_priority_queue(obj));
        funcall(visitor_fn, obj, $END, MAKE_LOCKED_P_QUEUE, TWO_INTEGER);
        return obj;
    }

    public static SubLObject visit_defstruct_object_locked_p_queue_method(final SubLObject obj, final SubLObject visitor_fn) {
        return visit_defstruct_locked_p_queue(obj, visitor_fn);
    }

    public static SubLObject print_lp_queue(final SubLObject lp_queue, final SubLObject stream, final SubLObject depth) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != $print_readably$.getDynamicValue(thread)) {
            print_not_readable(lp_queue, stream);
        } else {
            print_macros.print_unreadable_object_preamble(stream, lp_queue, T, T);
            write_string($str24$size_, stream, UNPROVIDED, UNPROVIDED);
            princ(lp_queue_size(lp_queue), stream);
            write_string($str139$_tree_, stream, UNPROVIDED, UNPROVIDED);
            princ(p_queue_tree(lp_queue_priority_queue(lp_queue)), stream);
            print_macros.print_unreadable_object_postamble(stream, lp_queue, T, T);
        }
        return lp_queue;
    }

    public static SubLObject create_lp_queue(final SubLObject max_size, final SubLObject rank_func, SubLObject comp_func) {
        if (comp_func == UNPROVIDED) {
            comp_func = symbol_function($sym73$_);
        }
        final SubLObject lp_queue = make_locked_p_queue(UNPROVIDED);
        _csetf_lp_queue_priority_queue(lp_queue, create_p_queue(max_size, rank_func, comp_func));
        _csetf_lp_queue_lock(lp_queue, make_lock($$$Queue_Lock));
        return lp_queue;
    }

    public static SubLObject lp_queue_size(final SubLObject lp_queue) {
        SubLObject ans = NIL;
        if (NIL != locked_p_queue_p(lp_queue)) {
            final SubLObject lock = lp_queue_lock(lp_queue);
            SubLObject release = NIL;
            try {
                release = seize_lock(lock);
                ans = p_queue_size(lp_queue_priority_queue(lp_queue));
            } finally {
                if (NIL != release) {
                    release_lock(lock);
                }
            }
        }
        return ans;
    }

    public static SubLObject lp_queue_empty_p(final SubLObject lp_queue) {
        SubLObject ans = NIL;
        if (NIL != locked_p_queue_p(lp_queue)) {
            final SubLObject lock = lp_queue_lock(lp_queue);
            SubLObject release = NIL;
            try {
                release = seize_lock(lock);
                ans = p_queue_empty_p(lp_queue_priority_queue(lp_queue));
            } finally {
                if (NIL != release) {
                    release_lock(lock);
                }
            }
        }
        return ans;
    }

    public static SubLObject lp_queue_full_p(final SubLObject lp_queue) {
        SubLObject ans = NIL;
        if (NIL != locked_p_queue_p(lp_queue)) {
            final SubLObject lock = lp_queue_lock(lp_queue);
            SubLObject release = NIL;
            try {
                release = seize_lock(lock);
                ans = p_queue_full_p(lp_queue_priority_queue(lp_queue));
            } finally {
                if (NIL != release) {
                    release_lock(lock);
                }
            }
        }
        return ans;
    }

    public static SubLObject lp_queue_best(final SubLObject lp_queue) {
        SubLObject ans = NIL;
        if (NIL != locked_p_queue_p(lp_queue)) {
            final SubLObject lock = lp_queue_lock(lp_queue);
            SubLObject release = NIL;
            try {
                release = seize_lock(lock);
                ans = p_queue_best(lp_queue_priority_queue(lp_queue));
            } finally {
                if (NIL != release) {
                    release_lock(lock);
                }
            }
        }
        return ans;
    }

    public static SubLObject lp_queue_worst(final SubLObject lp_queue) {
        SubLObject ans = NIL;
        if (NIL != locked_p_queue_p(lp_queue)) {
            final SubLObject lock = lp_queue_lock(lp_queue);
            SubLObject release = NIL;
            try {
                release = seize_lock(lock);
                ans = p_queue_worst(lp_queue_priority_queue(lp_queue));
            } finally {
                if (NIL != release) {
                    release_lock(lock);
                }
            }
        }
        return ans;
    }

    public static SubLObject lp_enqueue(final SubLObject item, final SubLObject lp_queue) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject ans = NIL;
        if (NIL != locked_p_queue_p(lp_queue)) {
            final SubLObject lock = lp_queue_lock(lp_queue);
            SubLObject release = NIL;
            try {
                release = seize_lock(lock);
                thread.resetMultipleValues();
                final SubLObject queue = p_enqueue(item, lp_queue_priority_queue(lp_queue));
                final SubLObject bumpedP = thread.secondMultipleValue();
                final SubLObject bumped_item = thread.thirdMultipleValue();
                thread.resetMultipleValues();
                ans = list(lp_queue, bumpedP, bumped_item);
            } finally {
                if (NIL != release) {
                    release_lock(lock);
                }
            }
        }
        return subl_promotions.values_list(ans);
    }

    public static SubLObject lp_dequeue(final SubLObject lp_queue, SubLObject worstP) {
        if (worstP == UNPROVIDED) {
            worstP = NIL;
        }
        SubLObject ans = NIL;
        if (NIL != locked_p_queue_p(lp_queue)) {
            final SubLObject lock = lp_queue_lock(lp_queue);
            SubLObject release = NIL;
            try {
                release = seize_lock(lock);
                ans = p_dequeue(lp_queue_priority_queue(lp_queue), worstP);
            } finally {
                if (NIL != release) {
                    release_lock(lock);
                }
            }
        }
        return ans;
    }

    public static SubLObject declare_queues_file() {
        declareFunction(me, "queue_print_function_trampoline", "QUEUE-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        declareFunction(me, "queue_p", "QUEUE-P", 1, 0, false);
        new queues.$queue_p$UnaryFunction();
        declareFunction(me, "q_num", "Q-NUM", 1, 0, false);
        declareFunction(me, "q_elements", "Q-ELEMENTS", 1, 0, false);
        declareFunction(me, "q_last", "Q-LAST", 1, 0, false);
        declareFunction(me, "_csetf_q_num", "_CSETF-Q-NUM", 2, 0, false);
        declareFunction(me, "_csetf_q_elements", "_CSETF-Q-ELEMENTS", 2, 0, false);
        declareFunction(me, "_csetf_q_last", "_CSETF-Q-LAST", 2, 0, false);
        declareFunction(me, "make_queue", "MAKE-QUEUE", 0, 1, false);
        declareFunction(me, "visit_defstruct_queue", "VISIT-DEFSTRUCT-QUEUE", 2, 0, false);
        declareFunction(me, "visit_defstruct_object_queue_method", "VISIT-DEFSTRUCT-OBJECT-QUEUE-METHOD", 2, 0, false);
        declareFunction(me, "print_queue", "PRINT-QUEUE", 3, 0, false);
        declareFunction(me, "create_queue", "CREATE-QUEUE", 0, 1, false);
        declareFunction(me, "clear_queue", "CLEAR-QUEUE", 1, 0, false);
        declareFunction(me, "queue_empty_p", "QUEUE-EMPTY-P", 1, 0, false);
        declareFunction(me, "queue_not_empty_p", "QUEUE-NOT-EMPTY-P", 1, 0, false);
        declareFunction(me, "queue_size", "QUEUE-SIZE", 1, 0, false);
        declareFunction(me, "queue_elements", "QUEUE-ELEMENTS", 1, 0, false);
        declareFunction(me, "enqueue", "ENQUEUE", 2, 0, false);
        declareFunction(me, "enqueue_all", "ENQUEUE-ALL", 2, 0, false);
        declareFunction(me, "dequeue", "DEQUEUE", 1, 0, false);
        declareFunction(me, "dequeue_all", "DEQUEUE-ALL", 1, 0, false);
        declareFunction(me, "requeue", "REQUEUE", 1, 0, false);
        declareFunction(me, "remqueue", "REMQUEUE", 2, 1, false);
        declareFunction(me, "remlast_queue", "REMLAST-QUEUE", 1, 0, false);
        declareFunction(me, "queue_find", "QUEUE-FIND", 2, 2, false);
        declareFunction(me, "queue_find_if", "QUEUE-FIND-IF", 2, 1, false);
        declareFunction(me, "queue_peek", "QUEUE-PEEK", 1, 0, false);
        declareFunction(me, "queue_peek_n", "QUEUE-PEEK-N", 2, 0, false);
        declareFunction(me, "new_queue_iterator", "NEW-QUEUE-ITERATOR", 1, 0, false);
        declareMacro(me, "do_queue_elements", "DO-QUEUE-ELEMENTS");
        declareFunction(me, "do_queue_elements_queue_elements", "DO-QUEUE-ELEMENTS-QUEUE-ELEMENTS", 1, 0, false);
        declareMacro(me, "do_queue_dequeue", "DO-QUEUE-DEQUEUE");
        declareFunction(me, "queue_copy", "QUEUE-COPY", 1, 0, false);
        declareFunction(me, "print_queue_contents", "PRINT-QUEUE-CONTENTS", 1, 1, false);
        declareFunction(me, "cfasl_output_object_queue_method", "CFASL-OUTPUT-OBJECT-QUEUE-METHOD", 2, 0, false);
        declareFunction(me, "cfasl_wide_output_queue", "CFASL-WIDE-OUTPUT-QUEUE", 2, 0, false);
        declareFunction(me, "cfasl_output_queue_internal", "CFASL-OUTPUT-QUEUE-INTERNAL", 2, 0, false);
        declareFunction(me, "cfasl_input_queue", "CFASL-INPUT-QUEUE", 1, 0, false);
        declareFunction(me, "priority_queue_print_function_trampoline", "PRIORITY-QUEUE-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        declareFunction(me, "priority_queue_p", "PRIORITY-QUEUE-P", 1, 0, false);
        new queues.$priority_queue_p$UnaryFunction();
        declareFunction(me, "p_queue_num", "P-QUEUE-NUM", 1, 0, false);
        declareFunction(me, "p_queue_max_size", "P-QUEUE-MAX-SIZE", 1, 0, false);
        declareFunction(me, "p_queue_rank_func", "P-QUEUE-RANK-FUNC", 1, 0, false);
        declareFunction(me, "p_queue_comp_func", "P-QUEUE-COMP-FUNC", 1, 0, false);
        declareFunction(me, "p_queue_tree", "P-QUEUE-TREE", 1, 0, false);
        declareFunction(me, "_csetf_p_queue_num", "_CSETF-P-QUEUE-NUM", 2, 0, false);
        declareFunction(me, "_csetf_p_queue_max_size", "_CSETF-P-QUEUE-MAX-SIZE", 2, 0, false);
        declareFunction(me, "_csetf_p_queue_rank_func", "_CSETF-P-QUEUE-RANK-FUNC", 2, 0, false);
        declareFunction(me, "_csetf_p_queue_comp_func", "_CSETF-P-QUEUE-COMP-FUNC", 2, 0, false);
        declareFunction(me, "_csetf_p_queue_tree", "_CSETF-P-QUEUE-TREE", 2, 0, false);
        declareFunction(me, "make_priority_queue", "MAKE-PRIORITY-QUEUE", 0, 1, false);
        declareFunction(me, "visit_defstruct_priority_queue", "VISIT-DEFSTRUCT-PRIORITY-QUEUE", 2, 0, false);
        declareFunction(me, "visit_defstruct_object_priority_queue_method", "VISIT-DEFSTRUCT-OBJECT-PRIORITY-QUEUE-METHOD", 2, 0, false);
        declareFunction(me, "print_p_queue", "PRINT-P-QUEUE", 3, 0, false);
        declareFunction(me, "create_p_queue", "CREATE-P-QUEUE", 2, 1, false);
        declareFunction(me, "p_queue_clear", "P-QUEUE-CLEAR", 1, 0, false);
        declareFunction(me, "p_queue_size", "P-QUEUE-SIZE", 1, 0, false);
        declareFunction(me, "p_queue_empty_p", "P-QUEUE-EMPTY-P", 1, 0, false);
        declareFunction(me, "p_queue_full_p", "P-QUEUE-FULL-P", 1, 0, false);
        declareFunction(me, "p_queue_best", "P-QUEUE-BEST", 1, 0, false);
        declareFunction(me, "p_queue_worst", "P-QUEUE-WORST", 1, 0, false);
        declareFunction(me, "p_enqueue", "P-ENQUEUE", 2, 0, false);
        declareFunction(me, "p_dequeue", "P-DEQUEUE", 1, 1, false);
        declareMacro(me, "do_priority_queue_elements", "DO-PRIORITY-QUEUE-ELEMENTS");
        declareFunction(me, "do_priority_queue_elements_btree", "DO-PRIORITY-QUEUE-ELEMENTS-BTREE", 1, 0, false);
        declareFunction(me, "p_queue_elements", "P-QUEUE-ELEMENTS", 1, 0, false);
        declareFunction(me, "p_queue_find", "P-QUEUE-FIND", 2, 2, false);
        declareFunction(me, "p_queue_find_if", "P-QUEUE-FIND-IF", 2, 1, false);
        declareFunction(me, "pq_collision_enter", "PQ-COLLISION-ENTER", 2, 0, false);
        new queues.$pq_collision_enter$BinaryFunction();
        declareFunction(me, "pq_collision_next", "PQ-COLLISION-NEXT", 1, 0, false);
        declareFunction(me, "pq_collision_last", "PQ-COLLISION-LAST", 1, 0, false);
        declareFunction(me, "pq_collision_remove", "PQ-COLLISION-REMOVE", 2, 0, false);
        new queues.$pq_collision_remove$BinaryFunction();
        declareFunction(me, "pq_collision_empty", "PQ-COLLISION-EMPTY", 1, 0, false);
        new queues.$pq_collision_empty$UnaryFunction();
        declareFunction(me, "lazy_priority_queue_print_function_trampoline", "LAZY-PRIORITY-QUEUE-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        declareFunction(me, "lazy_priority_queue_p", "LAZY-PRIORITY-QUEUE-P", 1, 0, false);
        new queues.$lazy_priority_queue_p$UnaryFunction();
        declareFunction(me, "lazy_p_queue_ordered_items", "LAZY-P-QUEUE-ORDERED-ITEMS", 1, 0, false);
        declareFunction(me, "lazy_p_queue_new_items", "LAZY-P-QUEUE-NEW-ITEMS", 1, 0, false);
        declareFunction(me, "_csetf_lazy_p_queue_ordered_items", "_CSETF-LAZY-P-QUEUE-ORDERED-ITEMS", 2, 0, false);
        declareFunction(me, "_csetf_lazy_p_queue_new_items", "_CSETF-LAZY-P-QUEUE-NEW-ITEMS", 2, 0, false);
        declareFunction(me, "make_lazy_priority_queue", "MAKE-LAZY-PRIORITY-QUEUE", 0, 1, false);
        declareFunction(me, "visit_defstruct_lazy_priority_queue", "VISIT-DEFSTRUCT-LAZY-PRIORITY-QUEUE", 2, 0, false);
        declareFunction(me, "visit_defstruct_object_lazy_priority_queue_method", "VISIT-DEFSTRUCT-OBJECT-LAZY-PRIORITY-QUEUE-METHOD", 2, 0, false);
        declareFunction(me, "print_lazy_p_queue", "PRINT-LAZY-P-QUEUE", 3, 0, false);
        declareFunction(me, "new_lazy_priority_queue", "NEW-LAZY-PRIORITY-QUEUE", 1, 1, false);
        declareMacro(me, "do_lazy_priority_queue_elements", "DO-LAZY-PRIORITY-QUEUE-ELEMENTS");
        declareFunction(me, "lazy_priority_queue_size", "LAZY-PRIORITY-QUEUE-SIZE", 1, 0, false);
        declareFunction(me, "lazy_priority_queue_empty_p", "LAZY-PRIORITY-QUEUE-EMPTY-P", 1, 0, false);
        declareFunction(me, "lazy_priority_queue_peek", "LAZY-PRIORITY-QUEUE-PEEK", 1, 0, false);
        declareFunction(me, "lazy_priority_queue_elements", "LAZY-PRIORITY-QUEUE-ELEMENTS", 1, 0, false);
        declareFunction(me, "lazy_priority_queue_add", "LAZY-PRIORITY-QUEUE-ADD", 2, 0, false);
        declareFunction(me, "lazy_priority_queue_remove", "LAZY-PRIORITY-QUEUE-REMOVE", 1, 0, false);
        declareFunction(me, "ensure_lazy_priority_queue_ordered", "ENSURE-LAZY-PRIORITY-QUEUE-ORDERED", 1, 0, false);
        declareFunction(me, "locked_queue_print_function_trampoline", "LOCKED-QUEUE-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        declareFunction(me, "locked_queue_p", "LOCKED-QUEUE-P", 1, 0, false);
        new queues.$locked_queue_p$UnaryFunction();
        declareFunction(me, "locked_queue_lock", "LOCKED-QUEUE-LOCK", 1, 0, false);
        declareFunction(me, "locked_queue_queue", "LOCKED-QUEUE-QUEUE", 1, 0, false);
        declareFunction(me, "_csetf_locked_queue_lock", "_CSETF-LOCKED-QUEUE-LOCK", 2, 0, false);
        declareFunction(me, "_csetf_locked_queue_queue", "_CSETF-LOCKED-QUEUE-QUEUE", 2, 0, false);
        declareFunction(me, "make_locked_queue", "MAKE-LOCKED-QUEUE", 0, 1, false);
        declareFunction(me, "visit_defstruct_locked_queue", "VISIT-DEFSTRUCT-LOCKED-QUEUE", 2, 0, false);
        declareFunction(me, "visit_defstruct_object_locked_queue_method", "VISIT-DEFSTRUCT-OBJECT-LOCKED-QUEUE-METHOD", 2, 0, false);
        declareFunction(me, "create_locked_queue", "CREATE-LOCKED-QUEUE", 0, 0, false);
        declareFunction(me, "clear_locked_queue", "CLEAR-LOCKED-QUEUE", 1, 0, false);
        declareFunction(me, "locked_queue_empty_p", "LOCKED-QUEUE-EMPTY-P", 1, 0, false);
        declareFunction(me, "locked_queue_size", "LOCKED-QUEUE-SIZE", 1, 0, false);
        declareFunction(me, "locked_queue_elements", "LOCKED-QUEUE-ELEMENTS", 1, 0, false);
        declareFunction(me, "locked_enqueue", "LOCKED-ENQUEUE", 2, 0, false);
        declareFunction(me, "locked_dequeue", "LOCKED-DEQUEUE", 1, 0, false);
        declareFunction(me, "locked_p_queue_print_function_trampoline", "LOCKED-P-QUEUE-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        declareFunction(me, "locked_p_queue_p", "LOCKED-P-QUEUE-P", 1, 0, false);
        new queues.$locked_p_queue_p$UnaryFunction();
        declareFunction(me, "lp_queue_lock", "LP-QUEUE-LOCK", 1, 0, false);
        declareFunction(me, "lp_queue_priority_queue", "LP-QUEUE-PRIORITY-QUEUE", 1, 0, false);
        declareFunction(me, "_csetf_lp_queue_lock", "_CSETF-LP-QUEUE-LOCK", 2, 0, false);
        declareFunction(me, "_csetf_lp_queue_priority_queue", "_CSETF-LP-QUEUE-PRIORITY-QUEUE", 2, 0, false);
        declareFunction(me, "make_locked_p_queue", "MAKE-LOCKED-P-QUEUE", 0, 1, false);
        declareFunction(me, "visit_defstruct_locked_p_queue", "VISIT-DEFSTRUCT-LOCKED-P-QUEUE", 2, 0, false);
        declareFunction(me, "visit_defstruct_object_locked_p_queue_method", "VISIT-DEFSTRUCT-OBJECT-LOCKED-P-QUEUE-METHOD", 2, 0, false);
        declareFunction(me, "print_lp_queue", "PRINT-LP-QUEUE", 3, 0, false);
        declareFunction(me, "create_lp_queue", "CREATE-LP-QUEUE", 2, 1, false);
        declareFunction(me, "lp_queue_size", "LP-QUEUE-SIZE", 1, 0, false);
        declareFunction(me, "lp_queue_empty_p", "LP-QUEUE-EMPTY-P", 1, 0, false);
        declareFunction(me, "lp_queue_full_p", "LP-QUEUE-FULL-P", 1, 0, false);
        declareFunction(me, "lp_queue_best", "LP-QUEUE-BEST", 1, 0, false);
        declareFunction(me, "lp_queue_worst", "LP-QUEUE-WORST", 1, 0, false);
        declareFunction(me, "lp_enqueue", "LP-ENQUEUE", 2, 0, false);
        declareFunction(me, "lp_dequeue", "LP-DEQUEUE", 1, 1, false);
        return NIL;
    }

    public static SubLObject init_queues_file() {
        defconstant("*DTP-QUEUE*", QUEUE);
        defconstant("*CFASL-WIDE-OPCODE-QUEUE*", $int$131);
        defconstant("*DTP-PRIORITY-QUEUE*", PRIORITY_QUEUE);
        defconstant("*DTP-LAZY-PRIORITY-QUEUE*", LAZY_PRIORITY_QUEUE);
        defconstant("*DTP-LOCKED-QUEUE*", LOCKED_QUEUE);
        defconstant("*DTP-LOCKED-P-QUEUE*", LOCKED_P_QUEUE);
        return NIL;
    }

    public static SubLObject setup_queues_file() {
        register_method($print_object_method_table$.getGlobalValue(), $dtp_queue$.getGlobalValue(), symbol_function(QUEUE_PRINT_FUNCTION_TRAMPOLINE));
        SubLSpecialOperatorDeclarations.proclaim($list8);
        def_csetf(Q_NUM, _CSETF_Q_NUM);
        def_csetf(Q_ELEMENTS, _CSETF_Q_ELEMENTS);
        def_csetf(Q_LAST, _CSETF_Q_LAST);
        identity(QUEUE);
        register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $dtp_queue$.getGlobalValue(), symbol_function(VISIT_DEFSTRUCT_OBJECT_QUEUE_METHOD));
        register_macro_helper(DO_QUEUE_ELEMENTS_QUEUE_ELEMENTS, DO_QUEUE_ELEMENTS);
        register_wide_cfasl_opcode_input_function($cfasl_wide_opcode_queue$.getGlobalValue(), CFASL_INPUT_QUEUE);
        register_method($cfasl_output_object_method_table$.getGlobalValue(), $dtp_queue$.getGlobalValue(), symbol_function(CFASL_OUTPUT_OBJECT_QUEUE_METHOD));
        register_method($print_object_method_table$.getGlobalValue(), $dtp_priority_queue$.getGlobalValue(), symbol_function(PRIORITY_QUEUE_PRINT_FUNCTION_TRAMPOLINE));
        SubLSpecialOperatorDeclarations.proclaim($list56);
        def_csetf(P_QUEUE_NUM, _CSETF_P_QUEUE_NUM);
        def_csetf(P_QUEUE_MAX_SIZE, _CSETF_P_QUEUE_MAX_SIZE);
        def_csetf(P_QUEUE_RANK_FUNC, _CSETF_P_QUEUE_RANK_FUNC);
        def_csetf(P_QUEUE_COMP_FUNC, _CSETF_P_QUEUE_COMP_FUNC);
        def_csetf(P_QUEUE_TREE, _CSETF_P_QUEUE_TREE);
        identity(PRIORITY_QUEUE);
        register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $dtp_priority_queue$.getGlobalValue(), symbol_function(VISIT_DEFSTRUCT_OBJECT_PRIORITY_QUEUE_METHOD));
        register_macro_helper(DO_PRIORITY_QUEUE_ELEMENTS_BTREE, DO_PRIORITY_QUEUE_ELEMENTS);
        register_method($print_object_method_table$.getGlobalValue(), $dtp_lazy_priority_queue$.getGlobalValue(), symbol_function(LAZY_PRIORITY_QUEUE_PRINT_FUNCTION_TRAMPOLINE));
        SubLSpecialOperatorDeclarations.proclaim($list92);
        def_csetf(LAZY_P_QUEUE_ORDERED_ITEMS, _CSETF_LAZY_P_QUEUE_ORDERED_ITEMS);
        def_csetf(LAZY_P_QUEUE_NEW_ITEMS, _CSETF_LAZY_P_QUEUE_NEW_ITEMS);
        identity(LAZY_PRIORITY_QUEUE);
        register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $dtp_lazy_priority_queue$.getGlobalValue(), symbol_function(VISIT_DEFSTRUCT_OBJECT_LAZY_PRIORITY_QUEUE_METHOD));
        register_method($print_object_method_table$.getGlobalValue(), $dtp_locked_queue$.getGlobalValue(), symbol_function(LOCKED_QUEUE_PRINT_FUNCTION_TRAMPOLINE));
        SubLSpecialOperatorDeclarations.proclaim($list113);
        def_csetf(LOCKED_QUEUE_LOCK, _CSETF_LOCKED_QUEUE_LOCK);
        def_csetf(LOCKED_QUEUE_QUEUE, _CSETF_LOCKED_QUEUE_QUEUE);
        identity(LOCKED_QUEUE);
        register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $dtp_locked_queue$.getGlobalValue(), symbol_function(VISIT_DEFSTRUCT_OBJECT_LOCKED_QUEUE_METHOD));
        register_method($print_object_method_table$.getGlobalValue(), $dtp_locked_p_queue$.getGlobalValue(), symbol_function(LOCKED_P_QUEUE_PRINT_FUNCTION_TRAMPOLINE));
        SubLSpecialOperatorDeclarations.proclaim($list131);
        def_csetf(LP_QUEUE_LOCK, _CSETF_LP_QUEUE_LOCK);
        def_csetf(LP_QUEUE_PRIORITY_QUEUE, _CSETF_LP_QUEUE_PRIORITY_QUEUE);
        identity(LOCKED_P_QUEUE);
        register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $dtp_locked_p_queue$.getGlobalValue(), symbol_function(VISIT_DEFSTRUCT_OBJECT_LOCKED_P_QUEUE_METHOD));
        sunit_external.define_test_category($$$Queues_Module_Supercategory, UNPROVIDED);
        sunit_external.define_test_category($$$Priority_Queue_Subcategory, list($$$Queues_Module_Supercategory));
        sunit_external.define_test_suite($$$Priority_Queue_Testing_Suite, list($$$Priority_Queue_Subcategory), UNPROVIDED, UNPROVIDED);
        sunit_external.define_test_category($$$Locked_Priority_Queue_Subcategory, list($$$Queues_Module_Supercategory));
        sunit_external.define_test_suite($str144$Locked_Priority_Queue_Testing_Sui, list($$$Locked_Priority_Queue_Subcategory), UNPROVIDED, UNPROVIDED);
        return NIL;
    }

    @Override
    public void declareFunctions() {
        declare_queues_file();
    }

    @Override
    public void initializeVariables() {
        init_queues_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_queues_file();
    }

    static {
























































































































































    }

    public static final class $queue_native extends SubLStructNative {
        public SubLObject $num;

        public SubLObject $elements;

        public SubLObject $last;

        private static final SubLStructDeclNative structDecl;

        private $queue_native() {
            this.$num = Lisp.NIL;
            this.$elements = Lisp.NIL;
            this.$last = Lisp.NIL;
        }

        @Override
        public SubLStructDecl getStructDecl() {
            return structDecl;
        }

        @Override
        public SubLObject getField2() {
            return this.$num;
        }

        @Override
        public SubLObject getField3() {
            return this.$elements;
        }

        @Override
        public SubLObject getField4() {
            return this.$last;
        }

        @Override
        public SubLObject setField2(final SubLObject value) {
            return this.$num = value;
        }

        @Override
        public SubLObject setField3(final SubLObject value) {
            return this.$elements = value;
        }

        @Override
        public SubLObject setField4(final SubLObject value) {
            return this.$last = value;
        }

        static {
            structDecl = makeStructDeclNative($queue_native.class, QUEUE, QUEUE_P, $list2, $list3, new String[]{ "$num", "$elements", "$last" }, $list4, $list5, PRINT_QUEUE);
        }
    }

    public static final class $queue_p$UnaryFunction extends UnaryFunction {
        public $queue_p$UnaryFunction() {
            super(extractFunctionNamed("QUEUE-P"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1) {
            return queue_p(arg1);
        }
    }

    public static final class $priority_queue_native extends SubLStructNative {
        public SubLObject $num;

        public SubLObject $max_size;

        public SubLObject $rank_func;

        public SubLObject $comp_func;

        public SubLObject $tree;

        private static final SubLStructDeclNative structDecl;

        private $priority_queue_native() {
            this.$num = Lisp.NIL;
            this.$max_size = Lisp.NIL;
            this.$rank_func = Lisp.NIL;
            this.$comp_func = Lisp.NIL;
            this.$tree = Lisp.NIL;
        }

        @Override
        public SubLStructDecl getStructDecl() {
            return structDecl;
        }

        @Override
        public SubLObject getField2() {
            return this.$num;
        }

        @Override
        public SubLObject getField3() {
            return this.$max_size;
        }

        @Override
        public SubLObject getField4() {
            return this.$rank_func;
        }

        @Override
        public SubLObject getField5() {
            return this.$comp_func;
        }

        @Override
        public SubLObject getField6() {
            return this.$tree;
        }

        @Override
        public SubLObject setField2(final SubLObject value) {
            return this.$num = value;
        }

        @Override
        public SubLObject setField3(final SubLObject value) {
            return this.$max_size = value;
        }

        @Override
        public SubLObject setField4(final SubLObject value) {
            return this.$rank_func = value;
        }

        @Override
        public SubLObject setField5(final SubLObject value) {
            return this.$comp_func = value;
        }

        @Override
        public SubLObject setField6(final SubLObject value) {
            return this.$tree = value;
        }

        static {
            structDecl = makeStructDeclNative($priority_queue_native.class, PRIORITY_QUEUE, PRIORITY_QUEUE_P, $list50, $list51, new String[]{ "$num", "$max_size", "$rank_func", "$comp_func", "$tree" }, $list52, $list53, PRINT_P_QUEUE);
        }
    }

    public static final class $priority_queue_p$UnaryFunction extends UnaryFunction {
        public $priority_queue_p$UnaryFunction() {
            super(extractFunctionNamed("PRIORITY-QUEUE-P"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1) {
            return priority_queue_p(arg1);
        }
    }

    public static final class $pq_collision_enter$BinaryFunction extends BinaryFunction {
        public $pq_collision_enter$BinaryFunction() {
            super(extractFunctionNamed("PQ-COLLISION-ENTER"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1, final SubLObject arg2) {
            return pq_collision_enter(arg1, arg2);
        }
    }

    public static final class $pq_collision_remove$BinaryFunction extends BinaryFunction {
        public $pq_collision_remove$BinaryFunction() {
            super(extractFunctionNamed("PQ-COLLISION-REMOVE"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1, final SubLObject arg2) {
            return pq_collision_remove(arg1, arg2);
        }
    }

    public static final class $pq_collision_empty$UnaryFunction extends UnaryFunction {
        public $pq_collision_empty$UnaryFunction() {
            super(extractFunctionNamed("PQ-COLLISION-EMPTY"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1) {
            return pq_collision_empty(arg1);
        }
    }

    public static final class $lazy_priority_queue_native extends SubLStructNative {
        public SubLObject $ordered_items;

        public SubLObject $new_items;

        private static final SubLStructDeclNative structDecl;

        private $lazy_priority_queue_native() {
            this.$ordered_items = Lisp.NIL;
            this.$new_items = Lisp.NIL;
        }

        @Override
        public SubLStructDecl getStructDecl() {
            return structDecl;
        }

        @Override
        public SubLObject getField2() {
            return this.$ordered_items;
        }

        @Override
        public SubLObject getField3() {
            return this.$new_items;
        }

        @Override
        public SubLObject setField2(final SubLObject value) {
            return this.$ordered_items = value;
        }

        @Override
        public SubLObject setField3(final SubLObject value) {
            return this.$new_items = value;
        }

        static {
            structDecl = makeStructDeclNative($lazy_priority_queue_native.class, LAZY_PRIORITY_QUEUE, LAZY_PRIORITY_QUEUE_P, $list86, $list87, new String[]{ "$ordered_items", "$new_items" }, $list88, $list89, PRINT_LAZY_P_QUEUE);
        }
    }

    public static final class $lazy_priority_queue_p$UnaryFunction extends UnaryFunction {
        public $lazy_priority_queue_p$UnaryFunction() {
            super(extractFunctionNamed("LAZY-PRIORITY-QUEUE-P"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1) {
            return lazy_priority_queue_p(arg1);
        }
    }

    public static final class $locked_queue_native extends SubLStructNative {
        public SubLObject $lock;

        public SubLObject $queue;

        private static final SubLStructDeclNative structDecl;

        private $locked_queue_native() {
            this.$lock = Lisp.NIL;
            this.$queue = Lisp.NIL;
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
            return this.$queue;
        }

        @Override
        public SubLObject setField2(final SubLObject value) {
            return this.$lock = value;
        }

        @Override
        public SubLObject setField3(final SubLObject value) {
            return this.$queue = value;
        }

        static {
            structDecl = makeStructDeclNative($locked_queue_native.class, LOCKED_QUEUE, LOCKED_QUEUE_P, $list107, $list108, new String[]{ "$lock", "$queue" }, $list109, $list110, DEFAULT_STRUCT_PRINT_FUNCTION);
        }
    }

    public static final class $locked_queue_p$UnaryFunction extends UnaryFunction {
        public $locked_queue_p$UnaryFunction() {
            super(extractFunctionNamed("LOCKED-QUEUE-P"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1) {
            return locked_queue_p(arg1);
        }
    }

    public static final class $locked_p_queue_native extends SubLStructNative {
        public SubLObject $lock;

        public SubLObject $priority_queue;

        private static final SubLStructDeclNative structDecl;

        private $locked_p_queue_native() {
            this.$lock = Lisp.NIL;
            this.$priority_queue = Lisp.NIL;
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
            return this.$priority_queue;
        }

        @Override
        public SubLObject setField2(final SubLObject value) {
            return this.$lock = value;
        }

        @Override
        public SubLObject setField3(final SubLObject value) {
            return this.$priority_queue = value;
        }

        static {
            structDecl = makeStructDeclNative($locked_p_queue_native.class, LOCKED_P_QUEUE, LOCKED_P_QUEUE_P, $list125, $list126, new String[]{ "$lock", "$priority_queue" }, $list127, $list128, PRINT_LP_QUEUE);
        }
    }

    public static final class $locked_p_queue_p$UnaryFunction extends UnaryFunction {
        public $locked_p_queue_p$UnaryFunction() {
            super(extractFunctionNamed("LOCKED-P-QUEUE-P"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1) {
            return locked_p_queue_p(arg1);
        }
    }

    /**
     *
     *
     * @return 
     */
    public static SubLObject create_queue() {
        return create_queue(NIL);
    }
}

/**
 * Total time: 508 ms
 */
