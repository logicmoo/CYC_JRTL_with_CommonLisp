package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.BinaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.UnaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDecl;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDeclNative;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLStructNative;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.visitation;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLSpecialOperatorDeclarations;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Locks;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.compatibility;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sort;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_macros;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class queues extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.queues";
    public static final String myFingerPrint = "4ea470777cc1a58b46b2346208558b4c44a196c7f0661352be50f6c1fb15f498";
    @SubLTranslatedFile.SubL(source = "cycl/queues.lisp", position = 948L)
    public static SubLSymbol $dtp_queue$;
    @SubLTranslatedFile.SubL(source = "cycl/queues.lisp", position = 6933L)
    private static SubLSymbol $cfasl_wide_opcode_queue$;
    @SubLTranslatedFile.SubL(source = "cycl/queues.lisp", position = 8165L)
    public static SubLSymbol $dtp_priority_queue$;
    @SubLTranslatedFile.SubL(source = "cycl/queues.lisp", position = 15549L)
    public static SubLSymbol $dtp_lazy_priority_queue$;
    @SubLTranslatedFile.SubL(source = "cycl/queues.lisp", position = 18017L)
    public static SubLSymbol $dtp_locked_queue$;
    @SubLTranslatedFile.SubL(source = "cycl/queues.lisp", position = 19978L)
    public static SubLSymbol $dtp_locked_p_queue$;
    private static final SubLSymbol $sym0$QUEUE;
    private static final SubLSymbol $sym1$QUEUE_P;
    private static final SubLList $list2;
    private static final SubLList $list3;
    private static final SubLList $list4;
    private static final SubLList $list5;
    private static final SubLSymbol $sym6$PRINT_QUEUE;
    private static final SubLSymbol $sym7$QUEUE_PRINT_FUNCTION_TRAMPOLINE;
    private static final SubLList $list8;
    private static final SubLSymbol $sym9$Q_NUM;
    private static final SubLSymbol $sym10$_CSETF_Q_NUM;
    private static final SubLSymbol $sym11$Q_ELEMENTS;
    private static final SubLSymbol $sym12$_CSETF_Q_ELEMENTS;
    private static final SubLSymbol $sym13$Q_LAST;
    private static final SubLSymbol $sym14$_CSETF_Q_LAST;
    private static final SubLSymbol $kw15$NUM;
    private static final SubLSymbol $kw16$ELEMENTS;
    private static final SubLSymbol $kw17$LAST;
    private static final SubLString $str18$Invalid_slot__S_for_construction_;
    private static final SubLSymbol $kw19$BEGIN;
    private static final SubLSymbol $sym20$MAKE_QUEUE;
    private static final SubLSymbol $kw21$SLOT;
    private static final SubLSymbol $kw22$END;
    private static final SubLSymbol $sym23$VISIT_DEFSTRUCT_OBJECT_QUEUE_METHOD;
    private static final SubLString $str24$size_;
    private static final SubLList $list25;
    private static final SubLList $list26;
    private static final SubLSymbol $kw27$ALLOW_OTHER_KEYS;
    private static final SubLSymbol $kw28$DONE;
    private static final SubLSymbol $sym29$DO_LIST;
    private static final SubLSymbol $sym30$DO_QUEUE_ELEMENTS_QUEUE_ELEMENTS;
    private static final SubLSymbol $sym31$DO_QUEUE_ELEMENTS;
    private static final SubLSymbol $sym32$Q;
    private static final SubLSymbol $sym33$DONE_VAR;
    private static final SubLSymbol $sym34$CLET;
    private static final SubLSymbol $sym35$COR;
    private static final SubLSymbol $sym36$QUEUE_EMPTY_P;
    private static final SubLSymbol $sym37$WHILE;
    private static final SubLSymbol $sym38$CNOT;
    private static final SubLSymbol $sym39$DEQUEUE;
    private static final SubLSymbol $sym40$CSETQ;
    private static final SubLString $str41$__Queue_length____a;
    private static final SubLString $str42$__Queue_contents__;
    private static final SubLString $str43$___s;
    private static final SubLInteger $int44$131;
    private static final SubLSymbol $sym45$CFASL_INPUT_QUEUE;
    private static final SubLSymbol $sym46$CFASL_OUTPUT_OBJECT_QUEUE_METHOD;
    private static final SubLString $str47$We_promised_to_write__A_elements_;
    private static final SubLSymbol $sym48$PRIORITY_QUEUE;
    private static final SubLSymbol $sym49$PRIORITY_QUEUE_P;
    private static final SubLList $list50;
    private static final SubLList $list51;
    private static final SubLList $list52;
    private static final SubLList $list53;
    private static final SubLSymbol $sym54$PRINT_P_QUEUE;
    private static final SubLSymbol $sym55$PRIORITY_QUEUE_PRINT_FUNCTION_TRAMPOLINE;
    private static final SubLList $list56;
    private static final SubLSymbol $sym57$P_QUEUE_NUM;
    private static final SubLSymbol $sym58$_CSETF_P_QUEUE_NUM;
    private static final SubLSymbol $sym59$P_QUEUE_MAX_SIZE;
    private static final SubLSymbol $sym60$_CSETF_P_QUEUE_MAX_SIZE;
    private static final SubLSymbol $sym61$P_QUEUE_RANK_FUNC;
    private static final SubLSymbol $sym62$_CSETF_P_QUEUE_RANK_FUNC;
    private static final SubLSymbol $sym63$P_QUEUE_COMP_FUNC;
    private static final SubLSymbol $sym64$_CSETF_P_QUEUE_COMP_FUNC;
    private static final SubLSymbol $sym65$P_QUEUE_TREE;
    private static final SubLSymbol $sym66$_CSETF_P_QUEUE_TREE;
    private static final SubLSymbol $kw67$MAX_SIZE;
    private static final SubLSymbol $kw68$RANK_FUNC;
    private static final SubLSymbol $kw69$COMP_FUNC;
    private static final SubLSymbol $kw70$TREE;
    private static final SubLSymbol $sym71$MAKE_PRIORITY_QUEUE;
    private static final SubLSymbol $sym72$VISIT_DEFSTRUCT_OBJECT_PRIORITY_QUEUE_METHOD;
    private static final SubLSymbol $sym73$_;
    private static final SubLSymbol $sym74$PQ_COLLISION_ENTER;
    private static final SubLSymbol $sym75$PQ_COLLISION_REMOVE;
    private static final SubLSymbol $sym76$PQ_COLLISION_EMPTY;
    private static final SubLList $list77;
    private static final SubLSymbol $sym78$KEY_VAR;
    private static final SubLSymbol $sym79$COLLISIONS_VAR;
    private static final SubLSymbol $sym80$DO_BTREE_INDEX;
    private static final SubLSymbol $sym81$DO_PRIORITY_QUEUE_ELEMENTS_BTREE;
    private static final SubLSymbol $sym82$IGNORE;
    private static final SubLSymbol $sym83$DO_PRIORITY_QUEUE_ELEMENTS;
    private static final SubLSymbol $sym84$LAZY_PRIORITY_QUEUE;
    private static final SubLSymbol $sym85$LAZY_PRIORITY_QUEUE_P;
    private static final SubLList $list86;
    private static final SubLList $list87;
    private static final SubLList $list88;
    private static final SubLList $list89;
    private static final SubLSymbol $sym90$PRINT_LAZY_P_QUEUE;
    private static final SubLSymbol $sym91$LAZY_PRIORITY_QUEUE_PRINT_FUNCTION_TRAMPOLINE;
    private static final SubLList $list92;
    private static final SubLSymbol $sym93$LAZY_P_QUEUE_ORDERED_ITEMS;
    private static final SubLSymbol $sym94$_CSETF_LAZY_P_QUEUE_ORDERED_ITEMS;
    private static final SubLSymbol $sym95$LAZY_P_QUEUE_NEW_ITEMS;
    private static final SubLSymbol $sym96$_CSETF_LAZY_P_QUEUE_NEW_ITEMS;
    private static final SubLSymbol $kw97$ORDERED_ITEMS;
    private static final SubLSymbol $kw98$NEW_ITEMS;
    private static final SubLSymbol $sym99$MAKE_LAZY_PRIORITY_QUEUE;
    private static final SubLSymbol $sym100$VISIT_DEFSTRUCT_OBJECT_LAZY_PRIORITY_QUEUE_METHOD;
    private static final SubLString $str101$___S_new_;
    private static final SubLSymbol $sym102$_;
    private static final SubLList $list103;
    private static final SubLSymbol $sym104$LAZY_PRIORITY_QUEUE_ELEMENTS;
    private static final SubLSymbol $sym105$LOCKED_QUEUE;
    private static final SubLSymbol $sym106$LOCKED_QUEUE_P;
    private static final SubLList $list107;
    private static final SubLList $list108;
    private static final SubLList $list109;
    private static final SubLList $list110;
    private static final SubLSymbol $sym111$DEFAULT_STRUCT_PRINT_FUNCTION;
    private static final SubLSymbol $sym112$LOCKED_QUEUE_PRINT_FUNCTION_TRAMPOLINE;
    private static final SubLList $list113;
    private static final SubLSymbol $sym114$LOCKED_QUEUE_LOCK;
    private static final SubLSymbol $sym115$_CSETF_LOCKED_QUEUE_LOCK;
    private static final SubLSymbol $sym116$LOCKED_QUEUE_QUEUE;
    private static final SubLSymbol $sym117$_CSETF_LOCKED_QUEUE_QUEUE;
    private static final SubLSymbol $kw118$LOCK;
    private static final SubLSymbol $kw119$QUEUE;
    private static final SubLSymbol $sym120$MAKE_LOCKED_QUEUE;
    private static final SubLSymbol $sym121$VISIT_DEFSTRUCT_OBJECT_LOCKED_QUEUE_METHOD;
    private static final SubLString $str122$Queue_Lock;
    private static final SubLSymbol $sym123$LOCKED_P_QUEUE;
    private static final SubLSymbol $sym124$LOCKED_P_QUEUE_P;
    private static final SubLList $list125;
    private static final SubLList $list126;
    private static final SubLList $list127;
    private static final SubLList $list128;
    private static final SubLSymbol $sym129$PRINT_LP_QUEUE;
    private static final SubLSymbol $sym130$LOCKED_P_QUEUE_PRINT_FUNCTION_TRAMPOLINE;
    private static final SubLList $list131;
    private static final SubLSymbol $sym132$LP_QUEUE_LOCK;
    private static final SubLSymbol $sym133$_CSETF_LP_QUEUE_LOCK;
    private static final SubLSymbol $sym134$LP_QUEUE_PRIORITY_QUEUE;
    private static final SubLSymbol $sym135$_CSETF_LP_QUEUE_PRIORITY_QUEUE;
    private static final SubLSymbol $kw136$PRIORITY_QUEUE;
    private static final SubLSymbol $sym137$MAKE_LOCKED_P_QUEUE;
    private static final SubLSymbol $sym138$VISIT_DEFSTRUCT_OBJECT_LOCKED_P_QUEUE_METHOD;
    private static final SubLString $str139$_tree_;
    private static final SubLString $str140$Queues_Module_Supercategory;
    private static final SubLString $str141$Priority_Queue_Subcategory;
    private static final SubLString $str142$Priority_Queue_Testing_Suite;
    private static final SubLString $str143$Locked_Priority_Queue_Subcategory;
    private static final SubLString $str144$Locked_Priority_Queue_Testing_Sui;
    
    @SubLTranslatedFile.SubL(source = "cycl/queues.lisp", position = 948L)
    public static SubLObject queue_print_function_trampoline(final SubLObject v_object, final SubLObject stream) {
        print_queue(v_object, stream, (SubLObject)queues.ZERO_INTEGER);
        return (SubLObject)queues.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/queues.lisp", position = 948L)
    public static SubLObject queue_p(final SubLObject v_object) {
        return (SubLObject)((v_object.getClass() == $queue_native.class) ? queues.T : queues.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/queues.lisp", position = 948L)
    public static SubLObject q_num(final SubLObject v_object) {
        assert queues.NIL != queue_p(v_object) : v_object;
        return v_object.getField2();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/queues.lisp", position = 948L)
    public static SubLObject q_elements(final SubLObject v_object) {
        assert queues.NIL != queue_p(v_object) : v_object;
        return v_object.getField3();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/queues.lisp", position = 948L)
    public static SubLObject q_last(final SubLObject v_object) {
        assert queues.NIL != queue_p(v_object) : v_object;
        return v_object.getField4();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/queues.lisp", position = 948L)
    public static SubLObject _csetf_q_num(final SubLObject v_object, final SubLObject value) {
        assert queues.NIL != queue_p(v_object) : v_object;
        return v_object.setField2(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/queues.lisp", position = 948L)
    public static SubLObject _csetf_q_elements(final SubLObject v_object, final SubLObject value) {
        assert queues.NIL != queue_p(v_object) : v_object;
        return v_object.setField3(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/queues.lisp", position = 948L)
    public static SubLObject _csetf_q_last(final SubLObject v_object, final SubLObject value) {
        assert queues.NIL != queue_p(v_object) : v_object;
        return v_object.setField4(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/queues.lisp", position = 948L)
    public static SubLObject make_queue(SubLObject arglist) {
        if (arglist == queues.UNPROVIDED) {
            arglist = (SubLObject)queues.NIL;
        }
        final SubLObject v_new = (SubLObject)new $queue_native();
        SubLObject next;
        SubLObject current_arg;
        SubLObject current_value;
        SubLObject pcase_var;
        for (next = (SubLObject)queues.NIL, next = arglist; queues.NIL != next; next = conses_high.cddr(next)) {
            current_arg = next.first();
            current_value = conses_high.cadr(next);
            pcase_var = current_arg;
            if (pcase_var.eql((SubLObject)queues.$kw15$NUM)) {
                _csetf_q_num(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)queues.$kw16$ELEMENTS)) {
                _csetf_q_elements(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)queues.$kw17$LAST)) {
                _csetf_q_last(v_new, current_value);
            }
            else {
                Errors.error((SubLObject)queues.$str18$Invalid_slot__S_for_construction_, current_arg);
            }
        }
        return v_new;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/queues.lisp", position = 948L)
    public static SubLObject visit_defstruct_queue(final SubLObject obj, final SubLObject visitor_fn) {
        Functions.funcall(visitor_fn, obj, (SubLObject)queues.$kw19$BEGIN, (SubLObject)queues.$sym20$MAKE_QUEUE, (SubLObject)queues.THREE_INTEGER);
        Functions.funcall(visitor_fn, obj, (SubLObject)queues.$kw21$SLOT, (SubLObject)queues.$kw15$NUM, q_num(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)queues.$kw21$SLOT, (SubLObject)queues.$kw16$ELEMENTS, q_elements(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)queues.$kw21$SLOT, (SubLObject)queues.$kw17$LAST, q_last(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)queues.$kw22$END, (SubLObject)queues.$sym20$MAKE_QUEUE, (SubLObject)queues.THREE_INTEGER);
        return obj;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/queues.lisp", position = 948L)
    public static SubLObject visit_defstruct_object_queue_method(final SubLObject obj, final SubLObject visitor_fn) {
        return visit_defstruct_queue(obj, visitor_fn);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/queues.lisp", position = 1060L)
    public static SubLObject print_queue(final SubLObject queue, final SubLObject stream, final SubLObject depth) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (queues.NIL != print_high.$print_readably$.getDynamicValue(thread)) {
            print_high.print_not_readable(queue, stream);
        }
        else {
            print_macros.print_unreadable_object_preamble(stream, queue, (SubLObject)queues.T, (SubLObject)queues.T);
            streams_high.write_string((SubLObject)queues.$str24$size_, stream, (SubLObject)queues.UNPROVIDED, (SubLObject)queues.UNPROVIDED);
            print_high.princ(queue_size(queue), stream);
            print_macros.print_unreadable_object_postamble(stream, queue, (SubLObject)queues.T, (SubLObject)queues.T);
        }
        return queue;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/queues.lisp", position = 1277L)
    public static SubLObject create_queue(SubLObject initial_elements) {
        if (initial_elements == queues.UNPROVIDED) {
            initial_elements = (SubLObject)queues.NIL;
        }
        final SubLObject queue = clear_queue(make_queue((SubLObject)queues.UNPROVIDED));
        if (queues.NIL != initial_elements) {
            enqueue_all(initial_elements, queue);
        }
        return queue;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/queues.lisp", position = 1546L)
    public static SubLObject clear_queue(final SubLObject queue) {
        assert queues.NIL != queue_p(queue) : queue;
        _csetf_q_num(queue, (SubLObject)queues.ZERO_INTEGER);
        _csetf_q_elements(queue, (SubLObject)queues.NIL);
        _csetf_q_last(queue, (SubLObject)queues.NIL);
        return queue;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/queues.lisp", position = 1744L)
    public static SubLObject queue_empty_p(final SubLObject queue) {
        assert queues.NIL != queue_p(queue) : queue;
        return Types.sublisp_null(q_elements(queue));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/queues.lisp", position = 1879L)
    public static SubLObject queue_not_empty_p(final SubLObject queue) {
        assert queues.NIL != queue_p(queue) : queue;
        return list_utilities.sublisp_boolean(q_elements(queue));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/queues.lisp", position = 2025L)
    public static SubLObject queue_size(final SubLObject queue) {
        assert queues.NIL != queue_p(queue) : queue;
        return q_num(queue);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/queues.lisp", position = 2156L)
    public static SubLObject queue_elements(final SubLObject queue) {
        assert queues.NIL != queue_p(queue) : queue;
        return conses_high.copy_list(q_elements(queue));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/queues.lisp", position = 2308L)
    public static SubLObject enqueue(final SubLObject item, final SubLObject queue) {
        final SubLObject new_cell = (SubLObject)ConsesLow.list(item);
        if (queues.NIL != queue_empty_p(queue)) {
            _csetf_q_elements(queue, new_cell);
        }
        else {
            ConsesLow.rplacd(q_last(queue), new_cell);
        }
        _csetf_q_num(queue, Numbers.add(q_num(queue), (SubLObject)queues.ONE_INTEGER));
        _csetf_q_last(queue, new_cell);
        return queue;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/queues.lisp", position = 2636L)
    public static SubLObject enqueue_all(final SubLObject items, final SubLObject queue) {
        SubLObject cdolist_list_var = items;
        SubLObject item = (SubLObject)queues.NIL;
        item = cdolist_list_var.first();
        while (queues.NIL != cdolist_list_var) {
            enqueue(item, queue);
            cdolist_list_var = cdolist_list_var.rest();
            item = cdolist_list_var.first();
        }
        return queue;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/queues.lisp", position = 2875L)
    public static SubLObject dequeue(final SubLObject queue) {
        assert queues.NIL != queue_p(queue) : queue;
        if (queues.NIL == queue_empty_p(queue)) {
            final SubLObject elements = q_elements(queue);
            final SubLObject item = elements.first();
            final SubLObject rest = elements.rest();
            _csetf_q_num(queue, Numbers.subtract(q_num(queue), (SubLObject)queues.ONE_INTEGER));
            _csetf_q_elements(queue, rest);
            if (queues.NIL == rest) {
                _csetf_q_last(queue, (SubLObject)queues.NIL);
            }
            return item;
        }
        return (SubLObject)queues.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/queues.lisp", position = 3252L)
    public static SubLObject dequeue_all(final SubLObject queue) {
        assert queues.NIL != queue_p(queue) : queue;
        final SubLObject elements = q_elements(queue);
        clear_queue(queue);
        return elements;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/queues.lisp", position = 3487L)
    public static SubLObject requeue(final SubLObject queue) {
        assert queues.NIL != queue_p(queue) : queue;
        final SubLObject item = dequeue(queue);
        enqueue(item, queue);
        return item;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/queues.lisp", position = 3777L)
    public static SubLObject remqueue(final SubLObject item, final SubLObject queue, SubLObject test) {
        if (test == queues.UNPROVIDED) {
            test = Symbols.symbol_function((SubLObject)queues.EQL);
        }
        assert queues.NIL != queue_p(queue) : queue;
        final SubLObject last = q_last(queue);
        SubLObject back = (SubLObject)queues.NIL;
        SubLObject next;
        for (next = (SubLObject)queues.NIL, next = q_elements(queue); queues.NIL != next; next = next.rest()) {
            if (queues.NIL != Functions.funcall(test, next.first(), item)) {
                _csetf_q_num(queue, Numbers.subtract(q_num(queue), (SubLObject)queues.ONE_INTEGER));
                if (next.eql(last)) {
                    _csetf_q_last(queue, back);
                }
                if (next.eql(q_elements(queue))) {
                    _csetf_q_elements(queue, next.rest());
                }
                else {
                    ConsesLow.rplacd(back, next.rest());
                }
            }
            else {
                back = next;
            }
        }
        return queue;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/queues.lisp", position = 4336L)
    public static SubLObject remlast_queue(final SubLObject queue) {
        assert queues.NIL != queue_p(queue) : queue;
        if (queues.NIL != queue_empty_p(queue)) {
            return queue;
        }
        if (queue_size(queue).numE((SubLObject)queues.ONE_INTEGER)) {
            return clear_queue(queue);
        }
        SubLObject back = (SubLObject)queues.NIL;
        SubLObject last;
        SubLObject next;
        for (last = q_last(queue), next = (SubLObject)queues.NIL, next = q_elements(queue); !next.eql(last); next = next.rest()) {
            back = next;
        }
        _csetf_q_num(queue, Numbers.subtract(q_num(queue), (SubLObject)queues.ONE_INTEGER));
        _csetf_q_last(queue, back);
        ConsesLow.rplacd(back, next.rest());
        return queue;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/queues.lisp", position = 4840L)
    public static SubLObject queue_find(final SubLObject item, final SubLObject queue, SubLObject test, SubLObject key) {
        if (test == queues.UNPROVIDED) {
            test = Symbols.symbol_function((SubLObject)queues.EQL);
        }
        if (key == queues.UNPROVIDED) {
            key = Symbols.symbol_function((SubLObject)queues.IDENTITY);
        }
        assert queues.NIL != queue_p(queue) : queue;
        return Sequences.find(item, q_elements(queue), test, key, (SubLObject)queues.UNPROVIDED, (SubLObject)queues.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/queues.lisp", position = 5048L)
    public static SubLObject queue_find_if(final SubLObject test, final SubLObject queue, SubLObject key) {
        if (key == queues.UNPROVIDED) {
            key = Symbols.symbol_function((SubLObject)queues.IDENTITY);
        }
        assert queues.NIL != queue_p(queue) : queue;
        return Sequences.find_if(test, q_elements(queue), key, (SubLObject)queues.UNPROVIDED, (SubLObject)queues.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/queues.lisp", position = 5244L)
    public static SubLObject queue_peek(final SubLObject queue) {
        assert queues.NIL != queue_p(queue) : queue;
        return q_elements(queue).first();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/queues.lisp", position = 5407L)
    public static SubLObject queue_peek_n(final SubLObject queue, final SubLObject n) {
        assert queues.NIL != queue_p(queue) : queue;
        return list_utilities.first_n(n, q_elements(queue));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/queues.lisp", position = 5583L)
    public static SubLObject new_queue_iterator(final SubLObject queue) {
        assert queues.NIL != queue_p(queue) : queue;
        return iteration.new_list_iterator(q_elements(queue));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/queues.lisp", position = 5755L)
    public static SubLObject do_queue_elements(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)queues.$list25);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject item_var = (SubLObject)queues.NIL;
        SubLObject queue = (SubLObject)queues.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)queues.$list25);
        item_var = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)queues.$list25);
        queue = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = (SubLObject)queues.NIL;
        SubLObject rest = current;
        SubLObject bad = (SubLObject)queues.NIL;
        SubLObject current_$1 = (SubLObject)queues.NIL;
        while (queues.NIL != rest) {
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)queues.$list25);
            current_$1 = rest.first();
            rest = rest.rest();
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)queues.$list25);
            if (queues.NIL == conses_high.member(current_$1, (SubLObject)queues.$list26, (SubLObject)queues.UNPROVIDED, (SubLObject)queues.UNPROVIDED)) {
                bad = (SubLObject)queues.T;
            }
            if (current_$1 == queues.$kw27$ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        }
        if (queues.NIL != bad && queues.NIL == allow_other_keys_p) {
            cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)queues.$list25);
        }
        final SubLObject done_tail = cdestructuring_bind.property_list_member((SubLObject)queues.$kw28$DONE, current);
        final SubLObject done = (SubLObject)((queues.NIL != done_tail) ? conses_high.cadr(done_tail) : queues.NIL);
        final SubLObject body;
        current = (body = temp);
        return (SubLObject)ConsesLow.listS((SubLObject)queues.$sym29$DO_LIST, (SubLObject)ConsesLow.list(item_var, (SubLObject)ConsesLow.list((SubLObject)queues.$sym30$DO_QUEUE_ELEMENTS_QUEUE_ELEMENTS, queue), (SubLObject)queues.$kw28$DONE, done), ConsesLow.append(body, (SubLObject)queues.NIL));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/queues.lisp", position = 6044L)
    public static SubLObject do_queue_elements_queue_elements(final SubLObject queue) {
        return q_elements(queue);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/queues.lisp", position = 6164L)
    public static SubLObject do_queue_dequeue(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)queues.$list25);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject item_var = (SubLObject)queues.NIL;
        SubLObject queue = (SubLObject)queues.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)queues.$list25);
        item_var = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)queues.$list25);
        queue = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = (SubLObject)queues.NIL;
        SubLObject rest = current;
        SubLObject bad = (SubLObject)queues.NIL;
        SubLObject current_$2 = (SubLObject)queues.NIL;
        while (queues.NIL != rest) {
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)queues.$list25);
            current_$2 = rest.first();
            rest = rest.rest();
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)queues.$list25);
            if (queues.NIL == conses_high.member(current_$2, (SubLObject)queues.$list26, (SubLObject)queues.UNPROVIDED, (SubLObject)queues.UNPROVIDED)) {
                bad = (SubLObject)queues.T;
            }
            if (current_$2 == queues.$kw27$ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        }
        if (queues.NIL != bad && queues.NIL == allow_other_keys_p) {
            cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)queues.$list25);
        }
        final SubLObject done_tail = cdestructuring_bind.property_list_member((SubLObject)queues.$kw28$DONE, current);
        final SubLObject done = (SubLObject)((queues.NIL != done_tail) ? conses_high.cadr(done_tail) : queues.NIL);
        final SubLObject body;
        current = (body = temp);
        final SubLObject q = (SubLObject)queues.$sym32$Q;
        final SubLObject done_var = (SubLObject)queues.$sym33$DONE_VAR;
        return (SubLObject)ConsesLow.list((SubLObject)queues.$sym34$CLET, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(q, queue), (SubLObject)ConsesLow.list(done_var, reader.bq_cons((SubLObject)queues.$sym35$COR, ConsesLow.append((SubLObject)((queues.NIL != done) ? ConsesLow.list(done) : queues.NIL), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)queues.$sym36$QUEUE_EMPTY_P, q)))))), (SubLObject)ConsesLow.list((SubLObject)queues.$sym37$WHILE, (SubLObject)ConsesLow.list((SubLObject)queues.$sym38$CNOT, done_var), (SubLObject)ConsesLow.listS((SubLObject)queues.$sym34$CLET, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(item_var, (SubLObject)ConsesLow.list((SubLObject)queues.$sym39$DEQUEUE, q))), ConsesLow.append(body, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)queues.$sym40$CSETQ, done_var, reader.bq_cons((SubLObject)queues.$sym35$COR, ConsesLow.append((SubLObject)((queues.NIL != done) ? ConsesLow.list(done) : queues.NIL), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)queues.$sym36$QUEUE_EMPTY_P, q))))))))));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/queues.lisp", position = 6532L)
    public static SubLObject queue_copy(final SubLObject queue) {
        final SubLObject copy = create_queue((SubLObject)queues.UNPROVIDED);
        SubLObject cdolist_list_var = do_queue_elements_queue_elements(queue);
        SubLObject item = (SubLObject)queues.NIL;
        item = cdolist_list_var.first();
        while (queues.NIL != cdolist_list_var) {
            enqueue(item, copy);
            cdolist_list_var = cdolist_list_var.rest();
            item = cdolist_list_var.first();
        }
        return copy;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/queues.lisp", position = 6679L)
    public static SubLObject print_queue_contents(final SubLObject queue, SubLObject stream) {
        if (stream == queues.UNPROVIDED) {
            stream = (SubLObject)queues.T;
        }
        PrintLow.format(stream, (SubLObject)queues.$str41$__Queue_length____a, queue_size(queue));
        PrintLow.format(stream, (SubLObject)queues.$str42$__Queue_contents__);
        SubLObject cdolist_list_var = q_elements(queue);
        SubLObject item = (SubLObject)queues.NIL;
        item = cdolist_list_var.first();
        while (queues.NIL != cdolist_list_var) {
            PrintLow.format(stream, (SubLObject)queues.$str43$___s, item);
            cdolist_list_var = cdolist_list_var.rest();
            item = cdolist_list_var.first();
        }
        return (SubLObject)queues.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/queues.lisp", position = 7036L)
    public static SubLObject cfasl_output_object_queue_method(final SubLObject v_object, final SubLObject stream) {
        cfasl_wide_output_queue(v_object, stream);
        return v_object;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/queues.lisp", position = 7156L)
    public static SubLObject cfasl_wide_output_queue(final SubLObject queue, final SubLObject stream) {
        cfasl.cfasl_output_wide_opcode(queues.$cfasl_wide_opcode_queue$.getGlobalValue(), stream);
        cfasl_output_queue_internal(queue, stream);
        return queue;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/queues.lisp", position = 7335L)
    public static SubLObject cfasl_output_queue_internal(final SubLObject queue, final SubLObject stream) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject size = queue_size(queue);
        SubLObject counter = (SubLObject)queues.ZERO_INTEGER;
        cfasl.cfasl_output(size, stream);
        SubLObject cdolist_list_var = do_queue_elements_queue_elements(queue);
        SubLObject curr = (SubLObject)queues.NIL;
        curr = cdolist_list_var.first();
        while (queues.NIL != cdolist_list_var) {
            cfasl.cfasl_output(curr, stream);
            counter = Numbers.add(counter, (SubLObject)queues.ONE_INTEGER);
            cdolist_list_var = cdolist_list_var.rest();
            curr = cdolist_list_var.first();
        }
        if (queues.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && !counter.numE(size)) {
            Errors.error((SubLObject)queues.$str47$We_promised_to_write__A_elements_, size, counter);
        }
        return queue;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/queues.lisp", position = 7686L)
    public static SubLObject cfasl_input_queue(final SubLObject stream) {
        final SubLObject size = cfasl.cfasl_input(stream, (SubLObject)queues.UNPROVIDED, (SubLObject)queues.UNPROVIDED);
        final SubLObject queue = create_queue((SubLObject)queues.UNPROVIDED);
        SubLObject i;
        SubLObject item;
        for (i = (SubLObject)queues.NIL, i = (SubLObject)queues.ZERO_INTEGER; i.numL(size); i = Numbers.add(i, (SubLObject)queues.ONE_INTEGER)) {
            item = cfasl.cfasl_input(stream, (SubLObject)queues.UNPROVIDED, (SubLObject)queues.UNPROVIDED);
            enqueue(item, queue);
        }
        return queue;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/queues.lisp", position = 8165L)
    public static SubLObject priority_queue_print_function_trampoline(final SubLObject v_object, final SubLObject stream) {
        print_p_queue(v_object, stream, (SubLObject)queues.ZERO_INTEGER);
        return (SubLObject)queues.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/queues.lisp", position = 8165L)
    public static SubLObject priority_queue_p(final SubLObject v_object) {
        return (SubLObject)((v_object.getClass() == $priority_queue_native.class) ? queues.T : queues.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/queues.lisp", position = 8165L)
    public static SubLObject p_queue_num(final SubLObject v_object) {
        assert queues.NIL != priority_queue_p(v_object) : v_object;
        return v_object.getField2();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/queues.lisp", position = 8165L)
    public static SubLObject p_queue_max_size(final SubLObject v_object) {
        assert queues.NIL != priority_queue_p(v_object) : v_object;
        return v_object.getField3();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/queues.lisp", position = 8165L)
    public static SubLObject p_queue_rank_func(final SubLObject v_object) {
        assert queues.NIL != priority_queue_p(v_object) : v_object;
        return v_object.getField4();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/queues.lisp", position = 8165L)
    public static SubLObject p_queue_comp_func(final SubLObject v_object) {
        assert queues.NIL != priority_queue_p(v_object) : v_object;
        return v_object.getField5();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/queues.lisp", position = 8165L)
    public static SubLObject p_queue_tree(final SubLObject v_object) {
        assert queues.NIL != priority_queue_p(v_object) : v_object;
        return v_object.getField6();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/queues.lisp", position = 8165L)
    public static SubLObject _csetf_p_queue_num(final SubLObject v_object, final SubLObject value) {
        assert queues.NIL != priority_queue_p(v_object) : v_object;
        return v_object.setField2(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/queues.lisp", position = 8165L)
    public static SubLObject _csetf_p_queue_max_size(final SubLObject v_object, final SubLObject value) {
        assert queues.NIL != priority_queue_p(v_object) : v_object;
        return v_object.setField3(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/queues.lisp", position = 8165L)
    public static SubLObject _csetf_p_queue_rank_func(final SubLObject v_object, final SubLObject value) {
        assert queues.NIL != priority_queue_p(v_object) : v_object;
        return v_object.setField4(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/queues.lisp", position = 8165L)
    public static SubLObject _csetf_p_queue_comp_func(final SubLObject v_object, final SubLObject value) {
        assert queues.NIL != priority_queue_p(v_object) : v_object;
        return v_object.setField5(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/queues.lisp", position = 8165L)
    public static SubLObject _csetf_p_queue_tree(final SubLObject v_object, final SubLObject value) {
        assert queues.NIL != priority_queue_p(v_object) : v_object;
        return v_object.setField6(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/queues.lisp", position = 8165L)
    public static SubLObject make_priority_queue(SubLObject arglist) {
        if (arglist == queues.UNPROVIDED) {
            arglist = (SubLObject)queues.NIL;
        }
        final SubLObject v_new = (SubLObject)new $priority_queue_native();
        SubLObject next;
        SubLObject current_arg;
        SubLObject current_value;
        SubLObject pcase_var;
        for (next = (SubLObject)queues.NIL, next = arglist; queues.NIL != next; next = conses_high.cddr(next)) {
            current_arg = next.first();
            current_value = conses_high.cadr(next);
            pcase_var = current_arg;
            if (pcase_var.eql((SubLObject)queues.$kw15$NUM)) {
                _csetf_p_queue_num(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)queues.$kw67$MAX_SIZE)) {
                _csetf_p_queue_max_size(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)queues.$kw68$RANK_FUNC)) {
                _csetf_p_queue_rank_func(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)queues.$kw69$COMP_FUNC)) {
                _csetf_p_queue_comp_func(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)queues.$kw70$TREE)) {
                _csetf_p_queue_tree(v_new, current_value);
            }
            else {
                Errors.error((SubLObject)queues.$str18$Invalid_slot__S_for_construction_, current_arg);
            }
        }
        return v_new;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/queues.lisp", position = 8165L)
    public static SubLObject visit_defstruct_priority_queue(final SubLObject obj, final SubLObject visitor_fn) {
        Functions.funcall(visitor_fn, obj, (SubLObject)queues.$kw19$BEGIN, (SubLObject)queues.$sym71$MAKE_PRIORITY_QUEUE, (SubLObject)queues.FIVE_INTEGER);
        Functions.funcall(visitor_fn, obj, (SubLObject)queues.$kw21$SLOT, (SubLObject)queues.$kw15$NUM, p_queue_num(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)queues.$kw21$SLOT, (SubLObject)queues.$kw67$MAX_SIZE, p_queue_max_size(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)queues.$kw21$SLOT, (SubLObject)queues.$kw68$RANK_FUNC, p_queue_rank_func(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)queues.$kw21$SLOT, (SubLObject)queues.$kw69$COMP_FUNC, p_queue_comp_func(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)queues.$kw21$SLOT, (SubLObject)queues.$kw70$TREE, p_queue_tree(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)queues.$kw22$END, (SubLObject)queues.$sym71$MAKE_PRIORITY_QUEUE, (SubLObject)queues.FIVE_INTEGER);
        return obj;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/queues.lisp", position = 8165L)
    public static SubLObject visit_defstruct_object_priority_queue_method(final SubLObject obj, final SubLObject visitor_fn) {
        return visit_defstruct_priority_queue(obj, visitor_fn);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/queues.lisp", position = 8318L)
    public static SubLObject print_p_queue(final SubLObject p_queue, final SubLObject stream, final SubLObject depth) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (queues.NIL != print_high.$print_readably$.getDynamicValue(thread)) {
            print_high.print_not_readable(p_queue, stream);
        }
        else {
            print_macros.print_unreadable_object_preamble(stream, p_queue, (SubLObject)queues.T, (SubLObject)queues.T);
            streams_high.write_string((SubLObject)queues.$str24$size_, stream, (SubLObject)queues.UNPROVIDED, (SubLObject)queues.UNPROVIDED);
            print_high.princ(p_queue_size(p_queue), stream);
            print_macros.print_unreadable_object_postamble(stream, p_queue, (SubLObject)queues.T, (SubLObject)queues.T);
        }
        return p_queue;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/queues.lisp", position = 8547L)
    public static SubLObject create_p_queue(final SubLObject max_size, SubLObject rank_func, SubLObject comp_func) {
        if (comp_func == queues.UNPROVIDED) {
            comp_func = Symbols.symbol_function((SubLObject)queues.$sym73$_);
        }
        if (rank_func.isSymbol()) {
            rank_func = Symbols.symbol_function(rank_func);
        }
        if (comp_func.isSymbol()) {
            comp_func = Symbols.symbol_function(comp_func);
        }
        final SubLObject pq = make_priority_queue((SubLObject)queues.UNPROVIDED);
        _csetf_p_queue_num(pq, (SubLObject)queues.ZERO_INTEGER);
        _csetf_p_queue_max_size(pq, max_size);
        _csetf_p_queue_rank_func(pq, rank_func);
        _csetf_p_queue_comp_func(pq, comp_func);
        _csetf_p_queue_tree(pq, (SubLObject)queues.NIL);
        return pq;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/queues.lisp", position = 9079L)
    public static SubLObject p_queue_clear(final SubLObject priority_queue) {
        _csetf_p_queue_num(priority_queue, (SubLObject)queues.ZERO_INTEGER);
        _csetf_p_queue_tree(priority_queue, (SubLObject)queues.NIL);
        return priority_queue;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/queues.lisp", position = 9235L)
    public static SubLObject p_queue_size(final SubLObject priority_queue) {
        assert queues.NIL != priority_queue_p(priority_queue) : priority_queue;
        return p_queue_num(priority_queue);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/queues.lisp", position = 9419L)
    public static SubLObject p_queue_empty_p(final SubLObject priority_queue) {
        assert queues.NIL != priority_queue_p(priority_queue) : priority_queue;
        return Numbers.numE(p_queue_size(priority_queue), (SubLObject)queues.ZERO_INTEGER);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/queues.lisp", position = 9602L)
    public static SubLObject p_queue_full_p(final SubLObject priority_queue) {
        assert queues.NIL != priority_queue_p(priority_queue) : priority_queue;
        return (SubLObject)SubLObjectFactory.makeBoolean(p_queue_max_size(priority_queue).isFixnum() && p_queue_size(priority_queue).numE(p_queue_max_size(priority_queue)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/queues.lisp", position = 9874L)
    public static SubLObject p_queue_best(final SubLObject priority_queue) {
        assert queues.NIL != priority_queue_p(priority_queue) : priority_queue;
        final SubLObject best = binary_tree.btree_find_best(p_queue_tree(priority_queue));
        if (queues.NIL != binary_tree.btree_p(best)) {
            return pq_collision_next(binary_tree.bt_state(best));
        }
        return (SubLObject)queues.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/queues.lisp", position = 10109L)
    public static SubLObject p_queue_worst(final SubLObject priority_queue) {
        assert queues.NIL != priority_queue_p(priority_queue) : priority_queue;
        final SubLObject worst = binary_tree.btree_find_worst(p_queue_tree(priority_queue));
        if (queues.NIL != binary_tree.btree_p(worst)) {
            return pq_collision_last(binary_tree.bt_state(worst));
        }
        return (SubLObject)queues.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/queues.lisp", position = 10349L)
    public static SubLObject p_enqueue(final SubLObject item, final SubLObject priority_queue) {
        assert queues.NIL != priority_queue_p(priority_queue) : priority_queue;
        final SubLObject bumpedP = p_queue_full_p(priority_queue);
        if (queues.NIL == bumpedP) {
            final SubLObject ans = binary_tree.btree_insert(item, Functions.funcall(p_queue_rank_func(priority_queue), item), p_queue_tree(priority_queue), p_queue_comp_func(priority_queue), Symbols.symbol_function((SubLObject)queues.$sym74$PQ_COLLISION_ENTER));
            if (!ans.eql(p_queue_tree(priority_queue))) {
                _csetf_p_queue_tree(priority_queue, ans);
            }
            _csetf_p_queue_num(priority_queue, Numbers.add(p_queue_num(priority_queue), (SubLObject)queues.ONE_INTEGER));
            return Values.values(priority_queue, bumpedP, (SubLObject)queues.NIL);
        }
        final SubLObject worst = p_queue_worst(priority_queue);
        if (queues.NIL != Functions.funcall(p_queue_comp_func(priority_queue), Functions.funcall(p_queue_rank_func(priority_queue), item), Functions.funcall(p_queue_rank_func(priority_queue), worst))) {
            final SubLObject bumped_item = p_dequeue(priority_queue, (SubLObject)queues.T);
            p_enqueue(item, priority_queue);
            return Values.values(priority_queue, bumpedP, bumped_item);
        }
        return Values.values(priority_queue, bumpedP, item);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/queues.lisp", position = 11348L)
    public static SubLObject p_dequeue(final SubLObject priority_queue, SubLObject worstP) {
        if (worstP == queues.UNPROVIDED) {
            worstP = (SubLObject)queues.NIL;
        }
        assert queues.NIL != priority_queue_p(priority_queue) : priority_queue;
        if (queues.NIL == p_queue_empty_p(priority_queue)) {
            final SubLObject remove = (queues.NIL != worstP) ? p_queue_worst(priority_queue) : p_queue_best(priority_queue);
            final SubLObject ans = binary_tree.btree_remove(remove, Functions.funcall(p_queue_rank_func(priority_queue), remove), p_queue_tree(priority_queue), p_queue_comp_func(priority_queue), Symbols.symbol_function((SubLObject)queues.$sym75$PQ_COLLISION_REMOVE), Symbols.symbol_function((SubLObject)queues.$sym76$PQ_COLLISION_EMPTY));
            if (!ans.eql(p_queue_tree(priority_queue))) {
                _csetf_p_queue_tree(priority_queue, ans);
            }
            _csetf_p_queue_num(priority_queue, Numbers.subtract(p_queue_num(priority_queue), (SubLObject)queues.ONE_INTEGER));
            return remove;
        }
        return (SubLObject)queues.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/queues.lisp", position = 12037L)
    public static SubLObject do_priority_queue_elements(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)queues.$list77);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject item_var = (SubLObject)queues.NIL;
        SubLObject priority_queue = (SubLObject)queues.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)queues.$list77);
        item_var = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)queues.$list77);
        priority_queue = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = (SubLObject)queues.NIL;
        SubLObject rest = current;
        SubLObject bad = (SubLObject)queues.NIL;
        SubLObject current_$3 = (SubLObject)queues.NIL;
        while (queues.NIL != rest) {
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)queues.$list77);
            current_$3 = rest.first();
            rest = rest.rest();
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)queues.$list77);
            if (queues.NIL == conses_high.member(current_$3, (SubLObject)queues.$list26, (SubLObject)queues.UNPROVIDED, (SubLObject)queues.UNPROVIDED)) {
                bad = (SubLObject)queues.T;
            }
            if (current_$3 == queues.$kw27$ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        }
        if (queues.NIL != bad && queues.NIL == allow_other_keys_p) {
            cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)queues.$list77);
        }
        final SubLObject done_tail = cdestructuring_bind.property_list_member((SubLObject)queues.$kw28$DONE, current);
        final SubLObject done = (SubLObject)((queues.NIL != done_tail) ? conses_high.cadr(done_tail) : queues.NIL);
        final SubLObject body;
        current = (body = temp);
        final SubLObject key_var = (SubLObject)queues.$sym78$KEY_VAR;
        final SubLObject collisions_var = (SubLObject)queues.$sym79$COLLISIONS_VAR;
        return (SubLObject)ConsesLow.list((SubLObject)queues.$sym80$DO_BTREE_INDEX, (SubLObject)ConsesLow.list(key_var, collisions_var, (SubLObject)ConsesLow.list((SubLObject)queues.$sym81$DO_PRIORITY_QUEUE_ELEMENTS_BTREE, priority_queue), (SubLObject)queues.$kw28$DONE, done), (SubLObject)ConsesLow.list((SubLObject)queues.$sym82$IGNORE, key_var), (SubLObject)ConsesLow.listS((SubLObject)queues.$sym29$DO_LIST, (SubLObject)ConsesLow.list(item_var, collisions_var, (SubLObject)queues.$kw28$DONE, done), ConsesLow.append(body, (SubLObject)queues.NIL)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/queues.lisp", position = 12437L)
    public static SubLObject do_priority_queue_elements_btree(final SubLObject priority_queue) {
        assert queues.NIL != priority_queue_p(priority_queue) : priority_queue;
        return p_queue_tree(priority_queue);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/queues.lisp", position = 12633L)
    public static SubLObject p_queue_elements(final SubLObject priority_queue) {
        SubLObject items = (SubLObject)queues.NIL;
        SubLObject stack = (SubLObject)queues.NIL;
        SubLObject subtree = do_priority_queue_elements_btree(priority_queue);
        while (queues.NIL != subtree) {
            final SubLObject key_var = binary_tree.do_btree_index_key(subtree);
            SubLObject cdolist_list_var;
            final SubLObject collisions_var = cdolist_list_var = binary_tree.do_btree_index_value(subtree);
            SubLObject item = (SubLObject)queues.NIL;
            item = cdolist_list_var.first();
            while (queues.NIL != cdolist_list_var) {
                items = (SubLObject)ConsesLow.cons(item, items);
                cdolist_list_var = cdolist_list_var.rest();
                item = cdolist_list_var.first();
            }
            final SubLObject lower = binary_tree.do_btree_lower(subtree);
            final SubLObject higher = binary_tree.do_btree_higher(subtree);
            if (queues.NIL != lower) {
                if (queues.NIL != higher) {
                    stack = (SubLObject)ConsesLow.cons(higher, stack);
                }
                subtree = lower;
            }
            else if (queues.NIL != higher) {
                subtree = higher;
            }
            else {
                subtree = stack.first();
                stack = stack.rest();
            }
        }
        stack = (SubLObject)queues.NIL;
        final SubLObject comp_func = p_queue_comp_func(priority_queue);
        final SubLObject rank_func = p_queue_rank_func(priority_queue);
        items = Sort.sort(items, comp_func, rank_func);
        return items;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/queues.lisp", position = 13102L)
    public static SubLObject p_queue_find(final SubLObject item, final SubLObject queue, SubLObject test, SubLObject key) {
        if (test == queues.UNPROVIDED) {
            test = Symbols.symbol_function((SubLObject)queues.EQL);
        }
        if (key == queues.UNPROVIDED) {
            key = Symbols.symbol_function((SubLObject)queues.IDENTITY);
        }
        assert queues.NIL != priority_queue_p(queue) : queue;
        SubLObject found = (SubLObject)queues.NIL;
        SubLObject stack = (SubLObject)queues.NIL;
        SubLObject subtree = do_priority_queue_elements_btree(queue);
        while (queues.NIL == found && queues.NIL != subtree) {
            final SubLObject key_var = binary_tree.do_btree_index_key(subtree);
            final SubLObject collisions_var = binary_tree.do_btree_index_value(subtree);
            SubLObject rest;
            SubLObject this_item;
            for (rest = (SubLObject)queues.NIL, rest = collisions_var; queues.NIL == found && queues.NIL != rest; rest = rest.rest()) {
                this_item = rest.first();
                if (queues.NIL != Functions.funcall(test, item, Functions.funcall(key, this_item))) {
                    found = this_item;
                }
            }
            final SubLObject lower = binary_tree.do_btree_lower(subtree);
            final SubLObject higher = binary_tree.do_btree_higher(subtree);
            if (queues.NIL != lower) {
                if (queues.NIL != higher) {
                    stack = (SubLObject)ConsesLow.cons(higher, stack);
                }
                subtree = lower;
            }
            else if (queues.NIL != higher) {
                subtree = higher;
            }
            else {
                subtree = stack.first();
                stack = stack.rest();
            }
        }
        stack = (SubLObject)queues.NIL;
        return found;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/queues.lisp", position = 13458L)
    public static SubLObject p_queue_find_if(final SubLObject test, final SubLObject queue, SubLObject key) {
        if (key == queues.UNPROVIDED) {
            key = Symbols.symbol_function((SubLObject)queues.IDENTITY);
        }
        assert queues.NIL != priority_queue_p(queue) : queue;
        SubLObject found = (SubLObject)queues.NIL;
        SubLObject stack = (SubLObject)queues.NIL;
        SubLObject subtree = do_priority_queue_elements_btree(queue);
        while (queues.NIL == found && queues.NIL != subtree) {
            final SubLObject key_var = binary_tree.do_btree_index_key(subtree);
            final SubLObject collisions_var = binary_tree.do_btree_index_value(subtree);
            SubLObject rest;
            SubLObject this_item;
            for (rest = (SubLObject)queues.NIL, rest = collisions_var; queues.NIL == found && queues.NIL != rest; rest = rest.rest()) {
                this_item = rest.first();
                if (queues.NIL != Functions.funcall(test, Functions.funcall(key, this_item))) {
                    found = this_item;
                }
            }
            final SubLObject lower = binary_tree.do_btree_lower(subtree);
            final SubLObject higher = binary_tree.do_btree_higher(subtree);
            if (queues.NIL != lower) {
                if (queues.NIL != higher) {
                    stack = (SubLObject)ConsesLow.cons(higher, stack);
                }
                subtree = lower;
            }
            else if (queues.NIL != higher) {
                subtree = higher;
            }
            else {
                subtree = stack.first();
                stack = stack.rest();
            }
        }
        stack = (SubLObject)queues.NIL;
        return found;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/queues.lisp", position = 13815L)
    public static SubLObject pq_collision_enter(final SubLObject item, final SubLObject queue) {
        return list_utilities.nadd_to_end(item, queue);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/queues.lisp", position = 14064L)
    public static SubLObject pq_collision_next(final SubLObject queue) {
        return queue.first();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/queues.lisp", position = 14237L)
    public static SubLObject pq_collision_last(final SubLObject queue) {
        return list_utilities.last_one(queue);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/queues.lisp", position = 14413L)
    public static SubLObject pq_collision_remove(final SubLObject item, final SubLObject queue) {
        return list_utilities.delete_first(item, queue, (SubLObject)queues.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/queues.lisp", position = 14639L)
    public static SubLObject pq_collision_empty(final SubLObject queue) {
        return Types.sublisp_null(queue);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/queues.lisp", position = 15549L)
    public static SubLObject lazy_priority_queue_print_function_trampoline(final SubLObject v_object, final SubLObject stream) {
        print_lazy_p_queue(v_object, stream, (SubLObject)queues.ZERO_INTEGER);
        return (SubLObject)queues.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/queues.lisp", position = 15549L)
    public static SubLObject lazy_priority_queue_p(final SubLObject v_object) {
        return (SubLObject)((v_object.getClass() == $lazy_priority_queue_native.class) ? queues.T : queues.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/queues.lisp", position = 15549L)
    public static SubLObject lazy_p_queue_ordered_items(final SubLObject v_object) {
        assert queues.NIL != lazy_priority_queue_p(v_object) : v_object;
        return v_object.getField2();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/queues.lisp", position = 15549L)
    public static SubLObject lazy_p_queue_new_items(final SubLObject v_object) {
        assert queues.NIL != lazy_priority_queue_p(v_object) : v_object;
        return v_object.getField3();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/queues.lisp", position = 15549L)
    public static SubLObject _csetf_lazy_p_queue_ordered_items(final SubLObject v_object, final SubLObject value) {
        assert queues.NIL != lazy_priority_queue_p(v_object) : v_object;
        return v_object.setField2(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/queues.lisp", position = 15549L)
    public static SubLObject _csetf_lazy_p_queue_new_items(final SubLObject v_object, final SubLObject value) {
        assert queues.NIL != lazy_priority_queue_p(v_object) : v_object;
        return v_object.setField3(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/queues.lisp", position = 15549L)
    public static SubLObject make_lazy_priority_queue(SubLObject arglist) {
        if (arglist == queues.UNPROVIDED) {
            arglist = (SubLObject)queues.NIL;
        }
        final SubLObject v_new = (SubLObject)new $lazy_priority_queue_native();
        SubLObject next;
        SubLObject current_arg;
        SubLObject current_value;
        SubLObject pcase_var;
        for (next = (SubLObject)queues.NIL, next = arglist; queues.NIL != next; next = conses_high.cddr(next)) {
            current_arg = next.first();
            current_value = conses_high.cadr(next);
            pcase_var = current_arg;
            if (pcase_var.eql((SubLObject)queues.$kw97$ORDERED_ITEMS)) {
                _csetf_lazy_p_queue_ordered_items(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)queues.$kw98$NEW_ITEMS)) {
                _csetf_lazy_p_queue_new_items(v_new, current_value);
            }
            else {
                Errors.error((SubLObject)queues.$str18$Invalid_slot__S_for_construction_, current_arg);
            }
        }
        return v_new;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/queues.lisp", position = 15549L)
    public static SubLObject visit_defstruct_lazy_priority_queue(final SubLObject obj, final SubLObject visitor_fn) {
        Functions.funcall(visitor_fn, obj, (SubLObject)queues.$kw19$BEGIN, (SubLObject)queues.$sym99$MAKE_LAZY_PRIORITY_QUEUE, (SubLObject)queues.TWO_INTEGER);
        Functions.funcall(visitor_fn, obj, (SubLObject)queues.$kw21$SLOT, (SubLObject)queues.$kw97$ORDERED_ITEMS, lazy_p_queue_ordered_items(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)queues.$kw21$SLOT, (SubLObject)queues.$kw98$NEW_ITEMS, lazy_p_queue_new_items(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)queues.$kw22$END, (SubLObject)queues.$sym99$MAKE_LAZY_PRIORITY_QUEUE, (SubLObject)queues.TWO_INTEGER);
        return obj;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/queues.lisp", position = 15549L)
    public static SubLObject visit_defstruct_object_lazy_priority_queue_method(final SubLObject obj, final SubLObject visitor_fn) {
        return visit_defstruct_lazy_priority_queue(obj, visitor_fn);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/queues.lisp", position = 15695L)
    public static SubLObject print_lazy_p_queue(final SubLObject lpq, final SubLObject stream, final SubLObject depth) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (queues.NIL != print_high.$print_readably$.getDynamicValue(thread)) {
            print_high.print_not_readable(lpq, stream);
        }
        else {
            print_macros.print_unreadable_object_preamble(stream, lpq, (SubLObject)queues.T, (SubLObject)queues.T);
            streams_high.write_string((SubLObject)queues.$str24$size_, stream, (SubLObject)queues.UNPROVIDED, (SubLObject)queues.UNPROVIDED);
            print_high.princ(lazy_priority_queue_size(lpq), stream);
            final SubLObject additions = queue_size(lazy_p_queue_new_items(lpq));
            if (!additions.isZero()) {
                PrintLow.format(stream, (SubLObject)queues.$str101$___S_new_, additions);
            }
            print_macros.print_unreadable_object_postamble(stream, lpq, (SubLObject)queues.T, (SubLObject)queues.T);
        }
        return lpq;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/queues.lisp", position = 16065L)
    public static SubLObject new_lazy_priority_queue(final SubLObject rank_func, SubLObject comp_func) {
        if (comp_func == queues.UNPROVIDED) {
            comp_func = Symbols.symbol_function((SubLObject)queues.$sym102$_);
        }
        final SubLObject lpq = make_lazy_priority_queue((SubLObject)queues.UNPROVIDED);
        _csetf_lazy_p_queue_ordered_items(lpq, create_p_queue((SubLObject)queues.NIL, rank_func, comp_func));
        _csetf_lazy_p_queue_new_items(lpq, create_queue((SubLObject)queues.UNPROVIDED));
        return lpq;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/queues.lisp", position = 16364L)
    public static SubLObject do_lazy_priority_queue_elements(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)queues.$list103);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject item_var = (SubLObject)queues.NIL;
        SubLObject lpq = (SubLObject)queues.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)queues.$list103);
        item_var = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)queues.$list103);
        lpq = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = (SubLObject)queues.NIL;
        SubLObject rest = current;
        SubLObject bad = (SubLObject)queues.NIL;
        SubLObject current_$4 = (SubLObject)queues.NIL;
        while (queues.NIL != rest) {
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)queues.$list103);
            current_$4 = rest.first();
            rest = rest.rest();
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)queues.$list103);
            if (queues.NIL == conses_high.member(current_$4, (SubLObject)queues.$list26, (SubLObject)queues.UNPROVIDED, (SubLObject)queues.UNPROVIDED)) {
                bad = (SubLObject)queues.T;
            }
            if (current_$4 == queues.$kw27$ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        }
        if (queues.NIL != bad && queues.NIL == allow_other_keys_p) {
            cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)queues.$list103);
        }
        final SubLObject done_tail = cdestructuring_bind.property_list_member((SubLObject)queues.$kw28$DONE, current);
        final SubLObject done = (SubLObject)((queues.NIL != done_tail) ? conses_high.cadr(done_tail) : queues.NIL);
        final SubLObject body;
        current = (body = temp);
        return (SubLObject)ConsesLow.listS((SubLObject)queues.$sym29$DO_LIST, (SubLObject)ConsesLow.list(item_var, (SubLObject)ConsesLow.list((SubLObject)queues.$sym104$LAZY_PRIORITY_QUEUE_ELEMENTS, lpq), (SubLObject)queues.$kw28$DONE, done), ConsesLow.append(body, (SubLObject)queues.NIL));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/queues.lisp", position = 16586L)
    public static SubLObject lazy_priority_queue_size(final SubLObject lpq) {
        assert queues.NIL != lazy_priority_queue_p(lpq) : lpq;
        return Numbers.add(p_queue_size(lazy_p_queue_ordered_items(lpq)), queue_size(lazy_p_queue_new_items(lpq)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/queues.lisp", position = 16800L)
    public static SubLObject lazy_priority_queue_empty_p(final SubLObject lpq) {
        return Numbers.zerop(lazy_priority_queue_size(lpq));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/queues.lisp", position = 16940L)
    public static SubLObject lazy_priority_queue_peek(final SubLObject lpq) {
        assert queues.NIL != lazy_priority_queue_p(lpq) : lpq;
        ensure_lazy_priority_queue_ordered(lpq);
        return p_queue_best(lazy_p_queue_ordered_items(lpq));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/queues.lisp", position = 17128L)
    public static SubLObject lazy_priority_queue_elements(final SubLObject lpq) {
        assert queues.NIL != lazy_priority_queue_p(lpq) : lpq;
        ensure_lazy_priority_queue_ordered(lpq);
        return p_queue_elements(lazy_p_queue_ordered_items(lpq));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/queues.lisp", position = 17324L)
    public static SubLObject lazy_priority_queue_add(final SubLObject lpq, final SubLObject item) {
        assert queues.NIL != lazy_priority_queue_p(lpq) : lpq;
        enqueue(item, lazy_p_queue_new_items(lpq));
        return lpq;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/queues.lisp", position = 17489L)
    public static SubLObject lazy_priority_queue_remove(final SubLObject lpq) {
        assert queues.NIL != lazy_priority_queue_p(lpq) : lpq;
        ensure_lazy_priority_queue_ordered(lpq);
        return p_dequeue(lazy_p_queue_ordered_items(lpq), (SubLObject)queues.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/queues.lisp", position = 17678L)
    public static SubLObject ensure_lazy_priority_queue_ordered(final SubLObject lpq) {
        final SubLObject ordered_items = lazy_p_queue_ordered_items(lpq);
        final SubLObject new_items = lazy_p_queue_new_items(lpq);
        while (queues.NIL == queue_empty_p(new_items)) {
            p_enqueue(dequeue(new_items), ordered_items);
        }
        return lpq;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/queues.lisp", position = 18017L)
    public static SubLObject locked_queue_print_function_trampoline(final SubLObject v_object, final SubLObject stream) {
        compatibility.default_struct_print_function(v_object, stream, (SubLObject)queues.ZERO_INTEGER);
        return (SubLObject)queues.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/queues.lisp", position = 18017L)
    public static SubLObject locked_queue_p(final SubLObject v_object) {
        return (SubLObject)((v_object.getClass() == $locked_queue_native.class) ? queues.T : queues.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/queues.lisp", position = 18017L)
    public static SubLObject locked_queue_lock(final SubLObject v_object) {
        assert queues.NIL != locked_queue_p(v_object) : v_object;
        return v_object.getField2();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/queues.lisp", position = 18017L)
    public static SubLObject locked_queue_queue(final SubLObject v_object) {
        assert queues.NIL != locked_queue_p(v_object) : v_object;
        return v_object.getField3();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/queues.lisp", position = 18017L)
    public static SubLObject _csetf_locked_queue_lock(final SubLObject v_object, final SubLObject value) {
        assert queues.NIL != locked_queue_p(v_object) : v_object;
        return v_object.setField2(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/queues.lisp", position = 18017L)
    public static SubLObject _csetf_locked_queue_queue(final SubLObject v_object, final SubLObject value) {
        assert queues.NIL != locked_queue_p(v_object) : v_object;
        return v_object.setField3(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/queues.lisp", position = 18017L)
    public static SubLObject make_locked_queue(SubLObject arglist) {
        if (arglist == queues.UNPROVIDED) {
            arglist = (SubLObject)queues.NIL;
        }
        final SubLObject v_new = (SubLObject)new $locked_queue_native();
        SubLObject next;
        SubLObject current_arg;
        SubLObject current_value;
        SubLObject pcase_var;
        for (next = (SubLObject)queues.NIL, next = arglist; queues.NIL != next; next = conses_high.cddr(next)) {
            current_arg = next.first();
            current_value = conses_high.cadr(next);
            pcase_var = current_arg;
            if (pcase_var.eql((SubLObject)queues.$kw118$LOCK)) {
                _csetf_locked_queue_lock(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)queues.$kw119$QUEUE)) {
                _csetf_locked_queue_queue(v_new, current_value);
            }
            else {
                Errors.error((SubLObject)queues.$str18$Invalid_slot__S_for_construction_, current_arg);
            }
        }
        return v_new;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/queues.lisp", position = 18017L)
    public static SubLObject visit_defstruct_locked_queue(final SubLObject obj, final SubLObject visitor_fn) {
        Functions.funcall(visitor_fn, obj, (SubLObject)queues.$kw19$BEGIN, (SubLObject)queues.$sym120$MAKE_LOCKED_QUEUE, (SubLObject)queues.TWO_INTEGER);
        Functions.funcall(visitor_fn, obj, (SubLObject)queues.$kw21$SLOT, (SubLObject)queues.$kw118$LOCK, locked_queue_lock(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)queues.$kw21$SLOT, (SubLObject)queues.$kw119$QUEUE, locked_queue_queue(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)queues.$kw22$END, (SubLObject)queues.$sym120$MAKE_LOCKED_QUEUE, (SubLObject)queues.TWO_INTEGER);
        return obj;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/queues.lisp", position = 18017L)
    public static SubLObject visit_defstruct_object_locked_queue_method(final SubLObject obj, final SubLObject visitor_fn) {
        return visit_defstruct_locked_queue(obj, visitor_fn);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/queues.lisp", position = 18122L)
    public static SubLObject create_locked_queue() {
        final SubLObject lq = make_locked_queue((SubLObject)queues.UNPROVIDED);
        _csetf_locked_queue_queue(lq, create_queue((SubLObject)queues.UNPROVIDED));
        _csetf_locked_queue_lock(lq, Locks.make_lock((SubLObject)queues.$str122$Queue_Lock));
        return lq;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/queues.lisp", position = 18323L)
    public static SubLObject clear_locked_queue(final SubLObject lq) {
        SubLObject ans = (SubLObject)queues.NIL;
        if (queues.NIL != locked_queue_p(lq)) {
            final SubLObject lock = locked_queue_lock(lq);
            SubLObject release = (SubLObject)queues.NIL;
            try {
                release = Locks.seize_lock(lock);
                ans = clear_queue(locked_queue_queue(lq));
            }
            finally {
                if (queues.NIL != release) {
                    Locks.release_lock(lock);
                }
            }
        }
        return ans;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/queues.lisp", position = 18588L)
    public static SubLObject locked_queue_empty_p(final SubLObject lq) {
        SubLObject ans = (SubLObject)queues.NIL;
        if (queues.NIL != locked_queue_p(lq)) {
            final SubLObject lock = locked_queue_lock(lq);
            SubLObject release = (SubLObject)queues.NIL;
            try {
                release = Locks.seize_lock(lock);
                ans = queue_empty_p(locked_queue_queue(lq));
            }
            finally {
                if (queues.NIL != release) {
                    Locks.release_lock(lock);
                }
            }
        }
        return ans;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/queues.lisp", position = 18859L)
    public static SubLObject locked_queue_size(final SubLObject lq) {
        SubLObject ans = (SubLObject)queues.NIL;
        if (queues.NIL != locked_queue_p(lq)) {
            final SubLObject lock = locked_queue_lock(lq);
            SubLObject release = (SubLObject)queues.NIL;
            try {
                release = Locks.seize_lock(lock);
                ans = queue_size(locked_queue_queue(lq));
            }
            finally {
                if (queues.NIL != release) {
                    Locks.release_lock(lock);
                }
            }
        }
        return ans;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/queues.lisp", position = 19150L)
    public static SubLObject locked_queue_elements(final SubLObject lq) {
        SubLObject ans = (SubLObject)queues.NIL;
        if (queues.NIL != locked_queue_p(lq)) {
            final SubLObject lock = locked_queue_lock(lq);
            SubLObject release = (SubLObject)queues.NIL;
            try {
                release = Locks.seize_lock(lock);
                ans = queue_elements(locked_queue_queue(lq));
            }
            finally {
                if (queues.NIL != release) {
                    Locks.release_lock(lock);
                }
            }
        }
        return ans;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/queues.lisp", position = 19442L)
    public static SubLObject locked_enqueue(final SubLObject item, final SubLObject lq) {
        SubLObject ans = (SubLObject)queues.NIL;
        if (queues.NIL != locked_queue_p(lq)) {
            final SubLObject lock = locked_queue_lock(lq);
            SubLObject release = (SubLObject)queues.NIL;
            try {
                release = Locks.seize_lock(lock);
                ans = enqueue(item, locked_queue_queue(lq));
            }
            finally {
                if (queues.NIL != release) {
                    Locks.release_lock(lock);
                }
            }
        }
        return ans;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/queues.lisp", position = 19714L)
    public static SubLObject locked_dequeue(final SubLObject lq) {
        SubLObject ans = (SubLObject)queues.NIL;
        if (queues.NIL != locked_queue_p(lq)) {
            final SubLObject lock = locked_queue_lock(lq);
            SubLObject release = (SubLObject)queues.NIL;
            try {
                release = Locks.seize_lock(lock);
                ans = dequeue(locked_queue_queue(lq));
            }
            finally {
                if (queues.NIL != release) {
                    Locks.release_lock(lock);
                }
            }
        }
        return ans;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/queues.lisp", position = 19978L)
    public static SubLObject locked_p_queue_print_function_trampoline(final SubLObject v_object, final SubLObject stream) {
        print_lp_queue(v_object, stream, (SubLObject)queues.ZERO_INTEGER);
        return (SubLObject)queues.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/queues.lisp", position = 19978L)
    public static SubLObject locked_p_queue_p(final SubLObject v_object) {
        return (SubLObject)((v_object.getClass() == $locked_p_queue_native.class) ? queues.T : queues.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/queues.lisp", position = 19978L)
    public static SubLObject lp_queue_lock(final SubLObject v_object) {
        assert queues.NIL != locked_p_queue_p(v_object) : v_object;
        return v_object.getField2();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/queues.lisp", position = 19978L)
    public static SubLObject lp_queue_priority_queue(final SubLObject v_object) {
        assert queues.NIL != locked_p_queue_p(v_object) : v_object;
        return v_object.getField3();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/queues.lisp", position = 19978L)
    public static SubLObject _csetf_lp_queue_lock(final SubLObject v_object, final SubLObject value) {
        assert queues.NIL != locked_p_queue_p(v_object) : v_object;
        return v_object.setField2(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/queues.lisp", position = 19978L)
    public static SubLObject _csetf_lp_queue_priority_queue(final SubLObject v_object, final SubLObject value) {
        assert queues.NIL != locked_p_queue_p(v_object) : v_object;
        return v_object.setField3(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/queues.lisp", position = 19978L)
    public static SubLObject make_locked_p_queue(SubLObject arglist) {
        if (arglist == queues.UNPROVIDED) {
            arglist = (SubLObject)queues.NIL;
        }
        final SubLObject v_new = (SubLObject)new $locked_p_queue_native();
        SubLObject next;
        SubLObject current_arg;
        SubLObject current_value;
        SubLObject pcase_var;
        for (next = (SubLObject)queues.NIL, next = arglist; queues.NIL != next; next = conses_high.cddr(next)) {
            current_arg = next.first();
            current_value = conses_high.cadr(next);
            pcase_var = current_arg;
            if (pcase_var.eql((SubLObject)queues.$kw118$LOCK)) {
                _csetf_lp_queue_lock(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)queues.$kw136$PRIORITY_QUEUE)) {
                _csetf_lp_queue_priority_queue(v_new, current_value);
            }
            else {
                Errors.error((SubLObject)queues.$str18$Invalid_slot__S_for_construction_, current_arg);
            }
        }
        return v_new;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/queues.lisp", position = 19978L)
    public static SubLObject visit_defstruct_locked_p_queue(final SubLObject obj, final SubLObject visitor_fn) {
        Functions.funcall(visitor_fn, obj, (SubLObject)queues.$kw19$BEGIN, (SubLObject)queues.$sym137$MAKE_LOCKED_P_QUEUE, (SubLObject)queues.TWO_INTEGER);
        Functions.funcall(visitor_fn, obj, (SubLObject)queues.$kw21$SLOT, (SubLObject)queues.$kw118$LOCK, lp_queue_lock(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)queues.$kw21$SLOT, (SubLObject)queues.$kw136$PRIORITY_QUEUE, lp_queue_priority_queue(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)queues.$kw22$END, (SubLObject)queues.$sym137$MAKE_LOCKED_P_QUEUE, (SubLObject)queues.TWO_INTEGER);
        return obj;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/queues.lisp", position = 19978L)
    public static SubLObject visit_defstruct_object_locked_p_queue_method(final SubLObject obj, final SubLObject visitor_fn) {
        return visit_defstruct_locked_p_queue(obj, visitor_fn);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/queues.lisp", position = 20177L)
    public static SubLObject print_lp_queue(final SubLObject lp_queue, final SubLObject stream, final SubLObject depth) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (queues.NIL != print_high.$print_readably$.getDynamicValue(thread)) {
            print_high.print_not_readable(lp_queue, stream);
        }
        else {
            print_macros.print_unreadable_object_preamble(stream, lp_queue, (SubLObject)queues.T, (SubLObject)queues.T);
            streams_high.write_string((SubLObject)queues.$str24$size_, stream, (SubLObject)queues.UNPROVIDED, (SubLObject)queues.UNPROVIDED);
            print_high.princ(lp_queue_size(lp_queue), stream);
            streams_high.write_string((SubLObject)queues.$str139$_tree_, stream, (SubLObject)queues.UNPROVIDED, (SubLObject)queues.UNPROVIDED);
            print_high.princ(p_queue_tree(lp_queue_priority_queue(lp_queue)), stream);
            print_macros.print_unreadable_object_postamble(stream, lp_queue, (SubLObject)queues.T, (SubLObject)queues.T);
        }
        return lp_queue;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/queues.lisp", position = 20569L)
    public static SubLObject create_lp_queue(final SubLObject max_size, final SubLObject rank_func, SubLObject comp_func) {
        if (comp_func == queues.UNPROVIDED) {
            comp_func = Symbols.symbol_function((SubLObject)queues.$sym73$_);
        }
        final SubLObject lp_queue = make_locked_p_queue((SubLObject)queues.UNPROVIDED);
        _csetf_lp_queue_priority_queue(lp_queue, create_p_queue(max_size, rank_func, comp_func));
        _csetf_lp_queue_lock(lp_queue, Locks.make_lock((SubLObject)queues.$str122$Queue_Lock));
        return lp_queue;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/queues.lisp", position = 20927L)
    public static SubLObject lp_queue_size(final SubLObject lp_queue) {
        SubLObject ans = (SubLObject)queues.NIL;
        if (queues.NIL != locked_p_queue_p(lp_queue)) {
            final SubLObject lock = lp_queue_lock(lp_queue);
            SubLObject release = (SubLObject)queues.NIL;
            try {
                release = Locks.seize_lock(lock);
                ans = p_queue_size(lp_queue_priority_queue(lp_queue));
            }
            finally {
                if (queues.NIL != release) {
                    Locks.release_lock(lock);
                }
            }
        }
        return ans;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/queues.lisp", position = 21249L)
    public static SubLObject lp_queue_empty_p(final SubLObject lp_queue) {
        SubLObject ans = (SubLObject)queues.NIL;
        if (queues.NIL != locked_p_queue_p(lp_queue)) {
            final SubLObject lock = lp_queue_lock(lp_queue);
            SubLObject release = (SubLObject)queues.NIL;
            try {
                release = Locks.seize_lock(lock);
                ans = p_queue_empty_p(lp_queue_priority_queue(lp_queue));
            }
            finally {
                if (queues.NIL != release) {
                    Locks.release_lock(lock);
                }
            }
        }
        return ans;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/queues.lisp", position = 21558L)
    public static SubLObject lp_queue_full_p(final SubLObject lp_queue) {
        SubLObject ans = (SubLObject)queues.NIL;
        if (queues.NIL != locked_p_queue_p(lp_queue)) {
            final SubLObject lock = lp_queue_lock(lp_queue);
            SubLObject release = (SubLObject)queues.NIL;
            try {
                release = Locks.seize_lock(lock);
                ans = p_queue_full_p(lp_queue_priority_queue(lp_queue));
            }
            finally {
                if (queues.NIL != release) {
                    Locks.release_lock(lock);
                }
            }
        }
        return ans;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/queues.lisp", position = 21870L)
    public static SubLObject lp_queue_best(final SubLObject lp_queue) {
        SubLObject ans = (SubLObject)queues.NIL;
        if (queues.NIL != locked_p_queue_p(lp_queue)) {
            final SubLObject lock = lp_queue_lock(lp_queue);
            SubLObject release = (SubLObject)queues.NIL;
            try {
                release = Locks.seize_lock(lock);
                ans = p_queue_best(lp_queue_priority_queue(lp_queue));
            }
            finally {
                if (queues.NIL != release) {
                    Locks.release_lock(lock);
                }
            }
        }
        return ans;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/queues.lisp", position = 22195L)
    public static SubLObject lp_queue_worst(final SubLObject lp_queue) {
        SubLObject ans = (SubLObject)queues.NIL;
        if (queues.NIL != locked_p_queue_p(lp_queue)) {
            final SubLObject lock = lp_queue_lock(lp_queue);
            SubLObject release = (SubLObject)queues.NIL;
            try {
                release = Locks.seize_lock(lock);
                ans = p_queue_worst(lp_queue_priority_queue(lp_queue));
            }
            finally {
                if (queues.NIL != release) {
                    Locks.release_lock(lock);
                }
            }
        }
        return ans;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/queues.lisp", position = 22523L)
    public static SubLObject lp_enqueue(final SubLObject item, final SubLObject lp_queue) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject ans = (SubLObject)queues.NIL;
        if (queues.NIL != locked_p_queue_p(lp_queue)) {
            final SubLObject lock = lp_queue_lock(lp_queue);
            SubLObject release = (SubLObject)queues.NIL;
            try {
                release = Locks.seize_lock(lock);
                thread.resetMultipleValues();
                final SubLObject queue = p_enqueue(item, lp_queue_priority_queue(lp_queue));
                final SubLObject bumpedP = thread.secondMultipleValue();
                final SubLObject bumped_item = thread.thirdMultipleValue();
                thread.resetMultipleValues();
                ans = (SubLObject)ConsesLow.list(lp_queue, bumpedP, bumped_item);
            }
            finally {
                if (queues.NIL != release) {
                    Locks.release_lock(lock);
                }
            }
        }
        return subl_promotions.values_list(ans);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/queues.lisp", position = 23073L)
    public static SubLObject lp_dequeue(final SubLObject lp_queue, SubLObject worstP) {
        if (worstP == queues.UNPROVIDED) {
            worstP = (SubLObject)queues.NIL;
        }
        SubLObject ans = (SubLObject)queues.NIL;
        if (queues.NIL != locked_p_queue_p(lp_queue)) {
            final SubLObject lock = lp_queue_lock(lp_queue);
            SubLObject release = (SubLObject)queues.NIL;
            try {
                release = Locks.seize_lock(lock);
                ans = p_dequeue(lp_queue_priority_queue(lp_queue), worstP);
            }
            finally {
                if (queues.NIL != release) {
                    Locks.release_lock(lock);
                }
            }
        }
        return ans;
    }
    
    public static SubLObject declare_queues_file() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.queues", "queue_print_function_trampoline", "QUEUE-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.queues", "queue_p", "QUEUE-P", 1, 0, false);
        new $queue_p$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.queues", "q_num", "Q-NUM", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.queues", "q_elements", "Q-ELEMENTS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.queues", "q_last", "Q-LAST", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.queues", "_csetf_q_num", "_CSETF-Q-NUM", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.queues", "_csetf_q_elements", "_CSETF-Q-ELEMENTS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.queues", "_csetf_q_last", "_CSETF-Q-LAST", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.queues", "make_queue", "MAKE-QUEUE", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.queues", "visit_defstruct_queue", "VISIT-DEFSTRUCT-QUEUE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.queues", "visit_defstruct_object_queue_method", "VISIT-DEFSTRUCT-OBJECT-QUEUE-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.queues", "print_queue", "PRINT-QUEUE", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.queues", "create_queue", "CREATE-QUEUE", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.queues", "clear_queue", "CLEAR-QUEUE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.queues", "queue_empty_p", "QUEUE-EMPTY-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.queues", "queue_not_empty_p", "QUEUE-NOT-EMPTY-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.queues", "queue_size", "QUEUE-SIZE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.queues", "queue_elements", "QUEUE-ELEMENTS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.queues", "enqueue", "ENQUEUE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.queues", "enqueue_all", "ENQUEUE-ALL", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.queues", "dequeue", "DEQUEUE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.queues", "dequeue_all", "DEQUEUE-ALL", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.queues", "requeue", "REQUEUE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.queues", "remqueue", "REMQUEUE", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.queues", "remlast_queue", "REMLAST-QUEUE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.queues", "queue_find", "QUEUE-FIND", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.queues", "queue_find_if", "QUEUE-FIND-IF", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.queues", "queue_peek", "QUEUE-PEEK", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.queues", "queue_peek_n", "QUEUE-PEEK-N", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.queues", "new_queue_iterator", "NEW-QUEUE-ITERATOR", 1, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.queues", "do_queue_elements", "DO-QUEUE-ELEMENTS");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.queues", "do_queue_elements_queue_elements", "DO-QUEUE-ELEMENTS-QUEUE-ELEMENTS", 1, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.queues", "do_queue_dequeue", "DO-QUEUE-DEQUEUE");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.queues", "queue_copy", "QUEUE-COPY", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.queues", "print_queue_contents", "PRINT-QUEUE-CONTENTS", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.queues", "cfasl_output_object_queue_method", "CFASL-OUTPUT-OBJECT-QUEUE-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.queues", "cfasl_wide_output_queue", "CFASL-WIDE-OUTPUT-QUEUE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.queues", "cfasl_output_queue_internal", "CFASL-OUTPUT-QUEUE-INTERNAL", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.queues", "cfasl_input_queue", "CFASL-INPUT-QUEUE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.queues", "priority_queue_print_function_trampoline", "PRIORITY-QUEUE-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.queues", "priority_queue_p", "PRIORITY-QUEUE-P", 1, 0, false);
        new $priority_queue_p$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.queues", "p_queue_num", "P-QUEUE-NUM", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.queues", "p_queue_max_size", "P-QUEUE-MAX-SIZE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.queues", "p_queue_rank_func", "P-QUEUE-RANK-FUNC", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.queues", "p_queue_comp_func", "P-QUEUE-COMP-FUNC", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.queues", "p_queue_tree", "P-QUEUE-TREE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.queues", "_csetf_p_queue_num", "_CSETF-P-QUEUE-NUM", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.queues", "_csetf_p_queue_max_size", "_CSETF-P-QUEUE-MAX-SIZE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.queues", "_csetf_p_queue_rank_func", "_CSETF-P-QUEUE-RANK-FUNC", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.queues", "_csetf_p_queue_comp_func", "_CSETF-P-QUEUE-COMP-FUNC", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.queues", "_csetf_p_queue_tree", "_CSETF-P-QUEUE-TREE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.queues", "make_priority_queue", "MAKE-PRIORITY-QUEUE", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.queues", "visit_defstruct_priority_queue", "VISIT-DEFSTRUCT-PRIORITY-QUEUE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.queues", "visit_defstruct_object_priority_queue_method", "VISIT-DEFSTRUCT-OBJECT-PRIORITY-QUEUE-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.queues", "print_p_queue", "PRINT-P-QUEUE", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.queues", "create_p_queue", "CREATE-P-QUEUE", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.queues", "p_queue_clear", "P-QUEUE-CLEAR", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.queues", "p_queue_size", "P-QUEUE-SIZE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.queues", "p_queue_empty_p", "P-QUEUE-EMPTY-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.queues", "p_queue_full_p", "P-QUEUE-FULL-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.queues", "p_queue_best", "P-QUEUE-BEST", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.queues", "p_queue_worst", "P-QUEUE-WORST", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.queues", "p_enqueue", "P-ENQUEUE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.queues", "p_dequeue", "P-DEQUEUE", 1, 1, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.queues", "do_priority_queue_elements", "DO-PRIORITY-QUEUE-ELEMENTS");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.queues", "do_priority_queue_elements_btree", "DO-PRIORITY-QUEUE-ELEMENTS-BTREE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.queues", "p_queue_elements", "P-QUEUE-ELEMENTS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.queues", "p_queue_find", "P-QUEUE-FIND", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.queues", "p_queue_find_if", "P-QUEUE-FIND-IF", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.queues", "pq_collision_enter", "PQ-COLLISION-ENTER", 2, 0, false);
        new $pq_collision_enter$BinaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.queues", "pq_collision_next", "PQ-COLLISION-NEXT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.queues", "pq_collision_last", "PQ-COLLISION-LAST", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.queues", "pq_collision_remove", "PQ-COLLISION-REMOVE", 2, 0, false);
        new $pq_collision_remove$BinaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.queues", "pq_collision_empty", "PQ-COLLISION-EMPTY", 1, 0, false);
        new $pq_collision_empty$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.queues", "lazy_priority_queue_print_function_trampoline", "LAZY-PRIORITY-QUEUE-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.queues", "lazy_priority_queue_p", "LAZY-PRIORITY-QUEUE-P", 1, 0, false);
        new $lazy_priority_queue_p$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.queues", "lazy_p_queue_ordered_items", "LAZY-P-QUEUE-ORDERED-ITEMS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.queues", "lazy_p_queue_new_items", "LAZY-P-QUEUE-NEW-ITEMS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.queues", "_csetf_lazy_p_queue_ordered_items", "_CSETF-LAZY-P-QUEUE-ORDERED-ITEMS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.queues", "_csetf_lazy_p_queue_new_items", "_CSETF-LAZY-P-QUEUE-NEW-ITEMS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.queues", "make_lazy_priority_queue", "MAKE-LAZY-PRIORITY-QUEUE", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.queues", "visit_defstruct_lazy_priority_queue", "VISIT-DEFSTRUCT-LAZY-PRIORITY-QUEUE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.queues", "visit_defstruct_object_lazy_priority_queue_method", "VISIT-DEFSTRUCT-OBJECT-LAZY-PRIORITY-QUEUE-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.queues", "print_lazy_p_queue", "PRINT-LAZY-P-QUEUE", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.queues", "new_lazy_priority_queue", "NEW-LAZY-PRIORITY-QUEUE", 1, 1, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.queues", "do_lazy_priority_queue_elements", "DO-LAZY-PRIORITY-QUEUE-ELEMENTS");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.queues", "lazy_priority_queue_size", "LAZY-PRIORITY-QUEUE-SIZE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.queues", "lazy_priority_queue_empty_p", "LAZY-PRIORITY-QUEUE-EMPTY-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.queues", "lazy_priority_queue_peek", "LAZY-PRIORITY-QUEUE-PEEK", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.queues", "lazy_priority_queue_elements", "LAZY-PRIORITY-QUEUE-ELEMENTS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.queues", "lazy_priority_queue_add", "LAZY-PRIORITY-QUEUE-ADD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.queues", "lazy_priority_queue_remove", "LAZY-PRIORITY-QUEUE-REMOVE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.queues", "ensure_lazy_priority_queue_ordered", "ENSURE-LAZY-PRIORITY-QUEUE-ORDERED", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.queues", "locked_queue_print_function_trampoline", "LOCKED-QUEUE-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.queues", "locked_queue_p", "LOCKED-QUEUE-P", 1, 0, false);
        new $locked_queue_p$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.queues", "locked_queue_lock", "LOCKED-QUEUE-LOCK", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.queues", "locked_queue_queue", "LOCKED-QUEUE-QUEUE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.queues", "_csetf_locked_queue_lock", "_CSETF-LOCKED-QUEUE-LOCK", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.queues", "_csetf_locked_queue_queue", "_CSETF-LOCKED-QUEUE-QUEUE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.queues", "make_locked_queue", "MAKE-LOCKED-QUEUE", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.queues", "visit_defstruct_locked_queue", "VISIT-DEFSTRUCT-LOCKED-QUEUE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.queues", "visit_defstruct_object_locked_queue_method", "VISIT-DEFSTRUCT-OBJECT-LOCKED-QUEUE-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.queues", "create_locked_queue", "CREATE-LOCKED-QUEUE", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.queues", "clear_locked_queue", "CLEAR-LOCKED-QUEUE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.queues", "locked_queue_empty_p", "LOCKED-QUEUE-EMPTY-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.queues", "locked_queue_size", "LOCKED-QUEUE-SIZE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.queues", "locked_queue_elements", "LOCKED-QUEUE-ELEMENTS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.queues", "locked_enqueue", "LOCKED-ENQUEUE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.queues", "locked_dequeue", "LOCKED-DEQUEUE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.queues", "locked_p_queue_print_function_trampoline", "LOCKED-P-QUEUE-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.queues", "locked_p_queue_p", "LOCKED-P-QUEUE-P", 1, 0, false);
        new $locked_p_queue_p$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.queues", "lp_queue_lock", "LP-QUEUE-LOCK", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.queues", "lp_queue_priority_queue", "LP-QUEUE-PRIORITY-QUEUE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.queues", "_csetf_lp_queue_lock", "_CSETF-LP-QUEUE-LOCK", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.queues", "_csetf_lp_queue_priority_queue", "_CSETF-LP-QUEUE-PRIORITY-QUEUE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.queues", "make_locked_p_queue", "MAKE-LOCKED-P-QUEUE", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.queues", "visit_defstruct_locked_p_queue", "VISIT-DEFSTRUCT-LOCKED-P-QUEUE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.queues", "visit_defstruct_object_locked_p_queue_method", "VISIT-DEFSTRUCT-OBJECT-LOCKED-P-QUEUE-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.queues", "print_lp_queue", "PRINT-LP-QUEUE", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.queues", "create_lp_queue", "CREATE-LP-QUEUE", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.queues", "lp_queue_size", "LP-QUEUE-SIZE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.queues", "lp_queue_empty_p", "LP-QUEUE-EMPTY-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.queues", "lp_queue_full_p", "LP-QUEUE-FULL-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.queues", "lp_queue_best", "LP-QUEUE-BEST", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.queues", "lp_queue_worst", "LP-QUEUE-WORST", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.queues", "lp_enqueue", "LP-ENQUEUE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.queues", "lp_dequeue", "LP-DEQUEUE", 1, 1, false);
        return (SubLObject)queues.NIL;
    }
    
    public static SubLObject init_queues_file() {
        queues.$dtp_queue$ = SubLFiles.defconstant("*DTP-QUEUE*", (SubLObject)queues.$sym0$QUEUE);
        queues.$cfasl_wide_opcode_queue$ = SubLFiles.defconstant("*CFASL-WIDE-OPCODE-QUEUE*", (SubLObject)queues.$int44$131);
        queues.$dtp_priority_queue$ = SubLFiles.defconstant("*DTP-PRIORITY-QUEUE*", (SubLObject)queues.$sym48$PRIORITY_QUEUE);
        queues.$dtp_lazy_priority_queue$ = SubLFiles.defconstant("*DTP-LAZY-PRIORITY-QUEUE*", (SubLObject)queues.$sym84$LAZY_PRIORITY_QUEUE);
        queues.$dtp_locked_queue$ = SubLFiles.defconstant("*DTP-LOCKED-QUEUE*", (SubLObject)queues.$sym105$LOCKED_QUEUE);
        queues.$dtp_locked_p_queue$ = SubLFiles.defconstant("*DTP-LOCKED-P-QUEUE*", (SubLObject)queues.$sym123$LOCKED_P_QUEUE);
        return (SubLObject)queues.NIL;
    }
    
    public static SubLObject setup_queues_file() {
        Structures.register_method(print_high.$print_object_method_table$.getGlobalValue(), queues.$dtp_queue$.getGlobalValue(), Symbols.symbol_function((SubLObject)queues.$sym7$QUEUE_PRINT_FUNCTION_TRAMPOLINE));
        SubLSpecialOperatorDeclarations.proclaim((SubLObject)queues.$list8);
        Structures.def_csetf((SubLObject)queues.$sym9$Q_NUM, (SubLObject)queues.$sym10$_CSETF_Q_NUM);
        Structures.def_csetf((SubLObject)queues.$sym11$Q_ELEMENTS, (SubLObject)queues.$sym12$_CSETF_Q_ELEMENTS);
        Structures.def_csetf((SubLObject)queues.$sym13$Q_LAST, (SubLObject)queues.$sym14$_CSETF_Q_LAST);
        Equality.identity((SubLObject)queues.$sym0$QUEUE);
        Structures.register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), queues.$dtp_queue$.getGlobalValue(), Symbols.symbol_function((SubLObject)queues.$sym23$VISIT_DEFSTRUCT_OBJECT_QUEUE_METHOD));
        access_macros.register_macro_helper((SubLObject)queues.$sym30$DO_QUEUE_ELEMENTS_QUEUE_ELEMENTS, (SubLObject)queues.$sym31$DO_QUEUE_ELEMENTS);
        cfasl.register_wide_cfasl_opcode_input_function(queues.$cfasl_wide_opcode_queue$.getGlobalValue(), (SubLObject)queues.$sym45$CFASL_INPUT_QUEUE);
        Structures.register_method(cfasl.$cfasl_output_object_method_table$.getGlobalValue(), queues.$dtp_queue$.getGlobalValue(), Symbols.symbol_function((SubLObject)queues.$sym46$CFASL_OUTPUT_OBJECT_QUEUE_METHOD));
        Structures.register_method(print_high.$print_object_method_table$.getGlobalValue(), queues.$dtp_priority_queue$.getGlobalValue(), Symbols.symbol_function((SubLObject)queues.$sym55$PRIORITY_QUEUE_PRINT_FUNCTION_TRAMPOLINE));
        SubLSpecialOperatorDeclarations.proclaim((SubLObject)queues.$list56);
        Structures.def_csetf((SubLObject)queues.$sym57$P_QUEUE_NUM, (SubLObject)queues.$sym58$_CSETF_P_QUEUE_NUM);
        Structures.def_csetf((SubLObject)queues.$sym59$P_QUEUE_MAX_SIZE, (SubLObject)queues.$sym60$_CSETF_P_QUEUE_MAX_SIZE);
        Structures.def_csetf((SubLObject)queues.$sym61$P_QUEUE_RANK_FUNC, (SubLObject)queues.$sym62$_CSETF_P_QUEUE_RANK_FUNC);
        Structures.def_csetf((SubLObject)queues.$sym63$P_QUEUE_COMP_FUNC, (SubLObject)queues.$sym64$_CSETF_P_QUEUE_COMP_FUNC);
        Structures.def_csetf((SubLObject)queues.$sym65$P_QUEUE_TREE, (SubLObject)queues.$sym66$_CSETF_P_QUEUE_TREE);
        Equality.identity((SubLObject)queues.$sym48$PRIORITY_QUEUE);
        Structures.register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), queues.$dtp_priority_queue$.getGlobalValue(), Symbols.symbol_function((SubLObject)queues.$sym72$VISIT_DEFSTRUCT_OBJECT_PRIORITY_QUEUE_METHOD));
        access_macros.register_macro_helper((SubLObject)queues.$sym81$DO_PRIORITY_QUEUE_ELEMENTS_BTREE, (SubLObject)queues.$sym83$DO_PRIORITY_QUEUE_ELEMENTS);
        Structures.register_method(print_high.$print_object_method_table$.getGlobalValue(), queues.$dtp_lazy_priority_queue$.getGlobalValue(), Symbols.symbol_function((SubLObject)queues.$sym91$LAZY_PRIORITY_QUEUE_PRINT_FUNCTION_TRAMPOLINE));
        SubLSpecialOperatorDeclarations.proclaim((SubLObject)queues.$list92);
        Structures.def_csetf((SubLObject)queues.$sym93$LAZY_P_QUEUE_ORDERED_ITEMS, (SubLObject)queues.$sym94$_CSETF_LAZY_P_QUEUE_ORDERED_ITEMS);
        Structures.def_csetf((SubLObject)queues.$sym95$LAZY_P_QUEUE_NEW_ITEMS, (SubLObject)queues.$sym96$_CSETF_LAZY_P_QUEUE_NEW_ITEMS);
        Equality.identity((SubLObject)queues.$sym84$LAZY_PRIORITY_QUEUE);
        Structures.register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), queues.$dtp_lazy_priority_queue$.getGlobalValue(), Symbols.symbol_function((SubLObject)queues.$sym100$VISIT_DEFSTRUCT_OBJECT_LAZY_PRIORITY_QUEUE_METHOD));
        Structures.register_method(print_high.$print_object_method_table$.getGlobalValue(), queues.$dtp_locked_queue$.getGlobalValue(), Symbols.symbol_function((SubLObject)queues.$sym112$LOCKED_QUEUE_PRINT_FUNCTION_TRAMPOLINE));
        SubLSpecialOperatorDeclarations.proclaim((SubLObject)queues.$list113);
        Structures.def_csetf((SubLObject)queues.$sym114$LOCKED_QUEUE_LOCK, (SubLObject)queues.$sym115$_CSETF_LOCKED_QUEUE_LOCK);
        Structures.def_csetf((SubLObject)queues.$sym116$LOCKED_QUEUE_QUEUE, (SubLObject)queues.$sym117$_CSETF_LOCKED_QUEUE_QUEUE);
        Equality.identity((SubLObject)queues.$sym105$LOCKED_QUEUE);
        Structures.register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), queues.$dtp_locked_queue$.getGlobalValue(), Symbols.symbol_function((SubLObject)queues.$sym121$VISIT_DEFSTRUCT_OBJECT_LOCKED_QUEUE_METHOD));
        Structures.register_method(print_high.$print_object_method_table$.getGlobalValue(), queues.$dtp_locked_p_queue$.getGlobalValue(), Symbols.symbol_function((SubLObject)queues.$sym130$LOCKED_P_QUEUE_PRINT_FUNCTION_TRAMPOLINE));
        SubLSpecialOperatorDeclarations.proclaim((SubLObject)queues.$list131);
        Structures.def_csetf((SubLObject)queues.$sym132$LP_QUEUE_LOCK, (SubLObject)queues.$sym133$_CSETF_LP_QUEUE_LOCK);
        Structures.def_csetf((SubLObject)queues.$sym134$LP_QUEUE_PRIORITY_QUEUE, (SubLObject)queues.$sym135$_CSETF_LP_QUEUE_PRIORITY_QUEUE);
        Equality.identity((SubLObject)queues.$sym123$LOCKED_P_QUEUE);
        Structures.register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), queues.$dtp_locked_p_queue$.getGlobalValue(), Symbols.symbol_function((SubLObject)queues.$sym138$VISIT_DEFSTRUCT_OBJECT_LOCKED_P_QUEUE_METHOD));
        sunit_external.define_test_category((SubLObject)queues.$str140$Queues_Module_Supercategory, (SubLObject)queues.UNPROVIDED);
        sunit_external.define_test_category((SubLObject)queues.$str141$Priority_Queue_Subcategory, (SubLObject)ConsesLow.list((SubLObject)queues.$str140$Queues_Module_Supercategory));
        sunit_external.define_test_suite((SubLObject)queues.$str142$Priority_Queue_Testing_Suite, (SubLObject)ConsesLow.list((SubLObject)queues.$str141$Priority_Queue_Subcategory), (SubLObject)queues.UNPROVIDED, (SubLObject)queues.UNPROVIDED);
        sunit_external.define_test_category((SubLObject)queues.$str143$Locked_Priority_Queue_Subcategory, (SubLObject)ConsesLow.list((SubLObject)queues.$str140$Queues_Module_Supercategory));
        sunit_external.define_test_suite((SubLObject)queues.$str144$Locked_Priority_Queue_Testing_Sui, (SubLObject)ConsesLow.list((SubLObject)queues.$str143$Locked_Priority_Queue_Subcategory), (SubLObject)queues.UNPROVIDED, (SubLObject)queues.UNPROVIDED);
        return (SubLObject)queues.NIL;
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
        me = (SubLFile)new queues();
        queues.$dtp_queue$ = null;
        queues.$cfasl_wide_opcode_queue$ = null;
        queues.$dtp_priority_queue$ = null;
        queues.$dtp_lazy_priority_queue$ = null;
        queues.$dtp_locked_queue$ = null;
        queues.$dtp_locked_p_queue$ = null;
        $sym0$QUEUE = SubLObjectFactory.makeSymbol("QUEUE");
        $sym1$QUEUE_P = SubLObjectFactory.makeSymbol("QUEUE-P");
        $list2 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NUM"), (SubLObject)SubLObjectFactory.makeSymbol("ELEMENTS"), (SubLObject)SubLObjectFactory.makeSymbol("LAST"));
        $list3 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("NUM"), (SubLObject)SubLObjectFactory.makeKeyword("ELEMENTS"), (SubLObject)SubLObjectFactory.makeKeyword("LAST"));
        $list4 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("Q-NUM"), (SubLObject)SubLObjectFactory.makeSymbol("Q-ELEMENTS"), (SubLObject)SubLObjectFactory.makeSymbol("Q-LAST"));
        $list5 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("_CSETF-Q-NUM"), (SubLObject)SubLObjectFactory.makeSymbol("_CSETF-Q-ELEMENTS"), (SubLObject)SubLObjectFactory.makeSymbol("_CSETF-Q-LAST"));
        $sym6$PRINT_QUEUE = SubLObjectFactory.makeSymbol("PRINT-QUEUE");
        $sym7$QUEUE_PRINT_FUNCTION_TRAMPOLINE = SubLObjectFactory.makeSymbol("QUEUE-PRINT-FUNCTION-TRAMPOLINE");
        $list8 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("OPTIMIZE-FUNCALL"), (SubLObject)SubLObjectFactory.makeSymbol("QUEUE-P"));
        $sym9$Q_NUM = SubLObjectFactory.makeSymbol("Q-NUM");
        $sym10$_CSETF_Q_NUM = SubLObjectFactory.makeSymbol("_CSETF-Q-NUM");
        $sym11$Q_ELEMENTS = SubLObjectFactory.makeSymbol("Q-ELEMENTS");
        $sym12$_CSETF_Q_ELEMENTS = SubLObjectFactory.makeSymbol("_CSETF-Q-ELEMENTS");
        $sym13$Q_LAST = SubLObjectFactory.makeSymbol("Q-LAST");
        $sym14$_CSETF_Q_LAST = SubLObjectFactory.makeSymbol("_CSETF-Q-LAST");
        $kw15$NUM = SubLObjectFactory.makeKeyword("NUM");
        $kw16$ELEMENTS = SubLObjectFactory.makeKeyword("ELEMENTS");
        $kw17$LAST = SubLObjectFactory.makeKeyword("LAST");
        $str18$Invalid_slot__S_for_construction_ = SubLObjectFactory.makeString("Invalid slot ~S for construction function");
        $kw19$BEGIN = SubLObjectFactory.makeKeyword("BEGIN");
        $sym20$MAKE_QUEUE = SubLObjectFactory.makeSymbol("MAKE-QUEUE");
        $kw21$SLOT = SubLObjectFactory.makeKeyword("SLOT");
        $kw22$END = SubLObjectFactory.makeKeyword("END");
        $sym23$VISIT_DEFSTRUCT_OBJECT_QUEUE_METHOD = SubLObjectFactory.makeSymbol("VISIT-DEFSTRUCT-OBJECT-QUEUE-METHOD");
        $str24$size_ = SubLObjectFactory.makeString("size=");
        $list25 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ITEM-VAR"), (SubLObject)SubLObjectFactory.makeSymbol("QUEUE"), (SubLObject)SubLObjectFactory.makeSymbol("&KEY"), (SubLObject)SubLObjectFactory.makeSymbol("DONE")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $list26 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("DONE"));
        $kw27$ALLOW_OTHER_KEYS = SubLObjectFactory.makeKeyword("ALLOW-OTHER-KEYS");
        $kw28$DONE = SubLObjectFactory.makeKeyword("DONE");
        $sym29$DO_LIST = SubLObjectFactory.makeSymbol("DO-LIST");
        $sym30$DO_QUEUE_ELEMENTS_QUEUE_ELEMENTS = SubLObjectFactory.makeSymbol("DO-QUEUE-ELEMENTS-QUEUE-ELEMENTS");
        $sym31$DO_QUEUE_ELEMENTS = SubLObjectFactory.makeSymbol("DO-QUEUE-ELEMENTS");
        $sym32$Q = SubLObjectFactory.makeUninternedSymbol("Q");
        $sym33$DONE_VAR = SubLObjectFactory.makeUninternedSymbol("DONE-VAR");
        $sym34$CLET = SubLObjectFactory.makeSymbol("CLET");
        $sym35$COR = SubLObjectFactory.makeSymbol("COR");
        $sym36$QUEUE_EMPTY_P = SubLObjectFactory.makeSymbol("QUEUE-EMPTY-P");
        $sym37$WHILE = SubLObjectFactory.makeSymbol("WHILE");
        $sym38$CNOT = SubLObjectFactory.makeSymbol("CNOT");
        $sym39$DEQUEUE = SubLObjectFactory.makeSymbol("DEQUEUE");
        $sym40$CSETQ = SubLObjectFactory.makeSymbol("CSETQ");
        $str41$__Queue_length____a = SubLObjectFactory.makeString("~%Queue length : ~a");
        $str42$__Queue_contents__ = SubLObjectFactory.makeString("~%Queue contents :");
        $str43$___s = SubLObjectFactory.makeString("~%~s");
        $int44$131 = SubLObjectFactory.makeInteger(131);
        $sym45$CFASL_INPUT_QUEUE = SubLObjectFactory.makeSymbol("CFASL-INPUT-QUEUE");
        $sym46$CFASL_OUTPUT_OBJECT_QUEUE_METHOD = SubLObjectFactory.makeSymbol("CFASL-OUTPUT-OBJECT-QUEUE-METHOD");
        $str47$We_promised_to_write__A_elements_ = SubLObjectFactory.makeString("We promised to write ~A elements but wrote ~A.");
        $sym48$PRIORITY_QUEUE = SubLObjectFactory.makeSymbol("PRIORITY-QUEUE");
        $sym49$PRIORITY_QUEUE_P = SubLObjectFactory.makeSymbol("PRIORITY-QUEUE-P");
        $list50 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NUM"), (SubLObject)SubLObjectFactory.makeSymbol("MAX-SIZE"), (SubLObject)SubLObjectFactory.makeSymbol("RANK-FUNC"), (SubLObject)SubLObjectFactory.makeSymbol("COMP-FUNC"), (SubLObject)SubLObjectFactory.makeSymbol("TREE"));
        $list51 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("NUM"), (SubLObject)SubLObjectFactory.makeKeyword("MAX-SIZE"), (SubLObject)SubLObjectFactory.makeKeyword("RANK-FUNC"), (SubLObject)SubLObjectFactory.makeKeyword("COMP-FUNC"), (SubLObject)SubLObjectFactory.makeKeyword("TREE"));
        $list52 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("P-QUEUE-NUM"), (SubLObject)SubLObjectFactory.makeSymbol("P-QUEUE-MAX-SIZE"), (SubLObject)SubLObjectFactory.makeSymbol("P-QUEUE-RANK-FUNC"), (SubLObject)SubLObjectFactory.makeSymbol("P-QUEUE-COMP-FUNC"), (SubLObject)SubLObjectFactory.makeSymbol("P-QUEUE-TREE"));
        $list53 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("_CSETF-P-QUEUE-NUM"), (SubLObject)SubLObjectFactory.makeSymbol("_CSETF-P-QUEUE-MAX-SIZE"), (SubLObject)SubLObjectFactory.makeSymbol("_CSETF-P-QUEUE-RANK-FUNC"), (SubLObject)SubLObjectFactory.makeSymbol("_CSETF-P-QUEUE-COMP-FUNC"), (SubLObject)SubLObjectFactory.makeSymbol("_CSETF-P-QUEUE-TREE"));
        $sym54$PRINT_P_QUEUE = SubLObjectFactory.makeSymbol("PRINT-P-QUEUE");
        $sym55$PRIORITY_QUEUE_PRINT_FUNCTION_TRAMPOLINE = SubLObjectFactory.makeSymbol("PRIORITY-QUEUE-PRINT-FUNCTION-TRAMPOLINE");
        $list56 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("OPTIMIZE-FUNCALL"), (SubLObject)SubLObjectFactory.makeSymbol("PRIORITY-QUEUE-P"));
        $sym57$P_QUEUE_NUM = SubLObjectFactory.makeSymbol("P-QUEUE-NUM");
        $sym58$_CSETF_P_QUEUE_NUM = SubLObjectFactory.makeSymbol("_CSETF-P-QUEUE-NUM");
        $sym59$P_QUEUE_MAX_SIZE = SubLObjectFactory.makeSymbol("P-QUEUE-MAX-SIZE");
        $sym60$_CSETF_P_QUEUE_MAX_SIZE = SubLObjectFactory.makeSymbol("_CSETF-P-QUEUE-MAX-SIZE");
        $sym61$P_QUEUE_RANK_FUNC = SubLObjectFactory.makeSymbol("P-QUEUE-RANK-FUNC");
        $sym62$_CSETF_P_QUEUE_RANK_FUNC = SubLObjectFactory.makeSymbol("_CSETF-P-QUEUE-RANK-FUNC");
        $sym63$P_QUEUE_COMP_FUNC = SubLObjectFactory.makeSymbol("P-QUEUE-COMP-FUNC");
        $sym64$_CSETF_P_QUEUE_COMP_FUNC = SubLObjectFactory.makeSymbol("_CSETF-P-QUEUE-COMP-FUNC");
        $sym65$P_QUEUE_TREE = SubLObjectFactory.makeSymbol("P-QUEUE-TREE");
        $sym66$_CSETF_P_QUEUE_TREE = SubLObjectFactory.makeSymbol("_CSETF-P-QUEUE-TREE");
        $kw67$MAX_SIZE = SubLObjectFactory.makeKeyword("MAX-SIZE");
        $kw68$RANK_FUNC = SubLObjectFactory.makeKeyword("RANK-FUNC");
        $kw69$COMP_FUNC = SubLObjectFactory.makeKeyword("COMP-FUNC");
        $kw70$TREE = SubLObjectFactory.makeKeyword("TREE");
        $sym71$MAKE_PRIORITY_QUEUE = SubLObjectFactory.makeSymbol("MAKE-PRIORITY-QUEUE");
        $sym72$VISIT_DEFSTRUCT_OBJECT_PRIORITY_QUEUE_METHOD = SubLObjectFactory.makeSymbol("VISIT-DEFSTRUCT-OBJECT-PRIORITY-QUEUE-METHOD");
        $sym73$_ = SubLObjectFactory.makeSymbol("<");
        $sym74$PQ_COLLISION_ENTER = SubLObjectFactory.makeSymbol("PQ-COLLISION-ENTER");
        $sym75$PQ_COLLISION_REMOVE = SubLObjectFactory.makeSymbol("PQ-COLLISION-REMOVE");
        $sym76$PQ_COLLISION_EMPTY = SubLObjectFactory.makeSymbol("PQ-COLLISION-EMPTY");
        $list77 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ITEM-VAR"), (SubLObject)SubLObjectFactory.makeSymbol("PRIORITY-QUEUE"), (SubLObject)SubLObjectFactory.makeSymbol("&KEY"), (SubLObject)SubLObjectFactory.makeSymbol("DONE")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $sym78$KEY_VAR = SubLObjectFactory.makeUninternedSymbol("KEY-VAR");
        $sym79$COLLISIONS_VAR = SubLObjectFactory.makeUninternedSymbol("COLLISIONS-VAR");
        $sym80$DO_BTREE_INDEX = SubLObjectFactory.makeSymbol("DO-BTREE-INDEX");
        $sym81$DO_PRIORITY_QUEUE_ELEMENTS_BTREE = SubLObjectFactory.makeSymbol("DO-PRIORITY-QUEUE-ELEMENTS-BTREE");
        $sym82$IGNORE = SubLObjectFactory.makeSymbol("IGNORE");
        $sym83$DO_PRIORITY_QUEUE_ELEMENTS = SubLObjectFactory.makeSymbol("DO-PRIORITY-QUEUE-ELEMENTS");
        $sym84$LAZY_PRIORITY_QUEUE = SubLObjectFactory.makeSymbol("LAZY-PRIORITY-QUEUE");
        $sym85$LAZY_PRIORITY_QUEUE_P = SubLObjectFactory.makeSymbol("LAZY-PRIORITY-QUEUE-P");
        $list86 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ORDERED-ITEMS"), (SubLObject)SubLObjectFactory.makeSymbol("NEW-ITEMS"));
        $list87 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("ORDERED-ITEMS"), (SubLObject)SubLObjectFactory.makeKeyword("NEW-ITEMS"));
        $list88 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("LAZY-P-QUEUE-ORDERED-ITEMS"), (SubLObject)SubLObjectFactory.makeSymbol("LAZY-P-QUEUE-NEW-ITEMS"));
        $list89 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("_CSETF-LAZY-P-QUEUE-ORDERED-ITEMS"), (SubLObject)SubLObjectFactory.makeSymbol("_CSETF-LAZY-P-QUEUE-NEW-ITEMS"));
        $sym90$PRINT_LAZY_P_QUEUE = SubLObjectFactory.makeSymbol("PRINT-LAZY-P-QUEUE");
        $sym91$LAZY_PRIORITY_QUEUE_PRINT_FUNCTION_TRAMPOLINE = SubLObjectFactory.makeSymbol("LAZY-PRIORITY-QUEUE-PRINT-FUNCTION-TRAMPOLINE");
        $list92 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("OPTIMIZE-FUNCALL"), (SubLObject)SubLObjectFactory.makeSymbol("LAZY-PRIORITY-QUEUE-P"));
        $sym93$LAZY_P_QUEUE_ORDERED_ITEMS = SubLObjectFactory.makeSymbol("LAZY-P-QUEUE-ORDERED-ITEMS");
        $sym94$_CSETF_LAZY_P_QUEUE_ORDERED_ITEMS = SubLObjectFactory.makeSymbol("_CSETF-LAZY-P-QUEUE-ORDERED-ITEMS");
        $sym95$LAZY_P_QUEUE_NEW_ITEMS = SubLObjectFactory.makeSymbol("LAZY-P-QUEUE-NEW-ITEMS");
        $sym96$_CSETF_LAZY_P_QUEUE_NEW_ITEMS = SubLObjectFactory.makeSymbol("_CSETF-LAZY-P-QUEUE-NEW-ITEMS");
        $kw97$ORDERED_ITEMS = SubLObjectFactory.makeKeyword("ORDERED-ITEMS");
        $kw98$NEW_ITEMS = SubLObjectFactory.makeKeyword("NEW-ITEMS");
        $sym99$MAKE_LAZY_PRIORITY_QUEUE = SubLObjectFactory.makeSymbol("MAKE-LAZY-PRIORITY-QUEUE");
        $sym100$VISIT_DEFSTRUCT_OBJECT_LAZY_PRIORITY_QUEUE_METHOD = SubLObjectFactory.makeSymbol("VISIT-DEFSTRUCT-OBJECT-LAZY-PRIORITY-QUEUE-METHOD");
        $str101$___S_new_ = SubLObjectFactory.makeString(" (~S new)");
        $sym102$_ = SubLObjectFactory.makeSymbol(">");
        $list103 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ITEM-VAR"), (SubLObject)SubLObjectFactory.makeSymbol("LPQ"), (SubLObject)SubLObjectFactory.makeSymbol("&KEY"), (SubLObject)SubLObjectFactory.makeSymbol("DONE")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $sym104$LAZY_PRIORITY_QUEUE_ELEMENTS = SubLObjectFactory.makeSymbol("LAZY-PRIORITY-QUEUE-ELEMENTS");
        $sym105$LOCKED_QUEUE = SubLObjectFactory.makeSymbol("LOCKED-QUEUE");
        $sym106$LOCKED_QUEUE_P = SubLObjectFactory.makeSymbol("LOCKED-QUEUE-P");
        $list107 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("LOCK"), (SubLObject)SubLObjectFactory.makeSymbol("QUEUE"));
        $list108 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("LOCK"), (SubLObject)SubLObjectFactory.makeKeyword("QUEUE"));
        $list109 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("LOCKED-QUEUE-LOCK"), (SubLObject)SubLObjectFactory.makeSymbol("LOCKED-QUEUE-QUEUE"));
        $list110 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("_CSETF-LOCKED-QUEUE-LOCK"), (SubLObject)SubLObjectFactory.makeSymbol("_CSETF-LOCKED-QUEUE-QUEUE"));
        $sym111$DEFAULT_STRUCT_PRINT_FUNCTION = SubLObjectFactory.makeSymbol("DEFAULT-STRUCT-PRINT-FUNCTION");
        $sym112$LOCKED_QUEUE_PRINT_FUNCTION_TRAMPOLINE = SubLObjectFactory.makeSymbol("LOCKED-QUEUE-PRINT-FUNCTION-TRAMPOLINE");
        $list113 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("OPTIMIZE-FUNCALL"), (SubLObject)SubLObjectFactory.makeSymbol("LOCKED-QUEUE-P"));
        $sym114$LOCKED_QUEUE_LOCK = SubLObjectFactory.makeSymbol("LOCKED-QUEUE-LOCK");
        $sym115$_CSETF_LOCKED_QUEUE_LOCK = SubLObjectFactory.makeSymbol("_CSETF-LOCKED-QUEUE-LOCK");
        $sym116$LOCKED_QUEUE_QUEUE = SubLObjectFactory.makeSymbol("LOCKED-QUEUE-QUEUE");
        $sym117$_CSETF_LOCKED_QUEUE_QUEUE = SubLObjectFactory.makeSymbol("_CSETF-LOCKED-QUEUE-QUEUE");
        $kw118$LOCK = SubLObjectFactory.makeKeyword("LOCK");
        $kw119$QUEUE = SubLObjectFactory.makeKeyword("QUEUE");
        $sym120$MAKE_LOCKED_QUEUE = SubLObjectFactory.makeSymbol("MAKE-LOCKED-QUEUE");
        $sym121$VISIT_DEFSTRUCT_OBJECT_LOCKED_QUEUE_METHOD = SubLObjectFactory.makeSymbol("VISIT-DEFSTRUCT-OBJECT-LOCKED-QUEUE-METHOD");
        $str122$Queue_Lock = SubLObjectFactory.makeString("Queue Lock");
        $sym123$LOCKED_P_QUEUE = SubLObjectFactory.makeSymbol("LOCKED-P-QUEUE");
        $sym124$LOCKED_P_QUEUE_P = SubLObjectFactory.makeSymbol("LOCKED-P-QUEUE-P");
        $list125 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("LOCK"), (SubLObject)SubLObjectFactory.makeSymbol("PRIORITY-QUEUE"));
        $list126 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("LOCK"), (SubLObject)SubLObjectFactory.makeKeyword("PRIORITY-QUEUE"));
        $list127 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("LP-QUEUE-LOCK"), (SubLObject)SubLObjectFactory.makeSymbol("LP-QUEUE-PRIORITY-QUEUE"));
        $list128 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("_CSETF-LP-QUEUE-LOCK"), (SubLObject)SubLObjectFactory.makeSymbol("_CSETF-LP-QUEUE-PRIORITY-QUEUE"));
        $sym129$PRINT_LP_QUEUE = SubLObjectFactory.makeSymbol("PRINT-LP-QUEUE");
        $sym130$LOCKED_P_QUEUE_PRINT_FUNCTION_TRAMPOLINE = SubLObjectFactory.makeSymbol("LOCKED-P-QUEUE-PRINT-FUNCTION-TRAMPOLINE");
        $list131 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("OPTIMIZE-FUNCALL"), (SubLObject)SubLObjectFactory.makeSymbol("LOCKED-P-QUEUE-P"));
        $sym132$LP_QUEUE_LOCK = SubLObjectFactory.makeSymbol("LP-QUEUE-LOCK");
        $sym133$_CSETF_LP_QUEUE_LOCK = SubLObjectFactory.makeSymbol("_CSETF-LP-QUEUE-LOCK");
        $sym134$LP_QUEUE_PRIORITY_QUEUE = SubLObjectFactory.makeSymbol("LP-QUEUE-PRIORITY-QUEUE");
        $sym135$_CSETF_LP_QUEUE_PRIORITY_QUEUE = SubLObjectFactory.makeSymbol("_CSETF-LP-QUEUE-PRIORITY-QUEUE");
        $kw136$PRIORITY_QUEUE = SubLObjectFactory.makeKeyword("PRIORITY-QUEUE");
        $sym137$MAKE_LOCKED_P_QUEUE = SubLObjectFactory.makeSymbol("MAKE-LOCKED-P-QUEUE");
        $sym138$VISIT_DEFSTRUCT_OBJECT_LOCKED_P_QUEUE_METHOD = SubLObjectFactory.makeSymbol("VISIT-DEFSTRUCT-OBJECT-LOCKED-P-QUEUE-METHOD");
        $str139$_tree_ = SubLObjectFactory.makeString(" tree=");
        $str140$Queues_Module_Supercategory = SubLObjectFactory.makeString("Queues Module Supercategory");
        $str141$Priority_Queue_Subcategory = SubLObjectFactory.makeString("Priority Queue Subcategory");
        $str142$Priority_Queue_Testing_Suite = SubLObjectFactory.makeString("Priority Queue Testing Suite");
        $str143$Locked_Priority_Queue_Subcategory = SubLObjectFactory.makeString("Locked Priority Queue Subcategory");
        $str144$Locked_Priority_Queue_Testing_Sui = SubLObjectFactory.makeString("Locked Priority Queue Testing Suite");
    }
    
    public static final class $queue_native extends SubLStructNative
    {
        public SubLObject $num;
        public SubLObject $elements;
        public SubLObject $last;
        private static final SubLStructDeclNative structDecl;
        
        public $queue_native() {
            this.$num = (SubLObject)CommonSymbols.NIL;
            this.$elements = (SubLObject)CommonSymbols.NIL;
            this.$last = (SubLObject)CommonSymbols.NIL;
        }
        
        @Override
		public SubLStructDecl getStructDecl() {
            return (SubLStructDecl)$queue_native.structDecl;
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
            structDecl = Structures.makeStructDeclNative((Class)$queue_native.class, queues.$sym0$QUEUE, queues.$sym1$QUEUE_P, queues.$list2, queues.$list3, new String[] { "$num", "$elements", "$last" }, queues.$list4, queues.$list5, queues.$sym6$PRINT_QUEUE);
        }
    }
    
    public static final class $queue_p$UnaryFunction extends UnaryFunction
    {
        public $queue_p$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("QUEUE-P"));
        }
        
        @Override
		public SubLObject processItem(final SubLObject arg1) {
            return queues.queue_p(arg1);
        }
    }
    
    public static final class $priority_queue_native extends SubLStructNative
    {
        public SubLObject $num;
        public SubLObject $max_size;
        public SubLObject $rank_func;
        public SubLObject $comp_func;
        public SubLObject $tree;
        private static final SubLStructDeclNative structDecl;
        
        public $priority_queue_native() {
            this.$num = (SubLObject)CommonSymbols.NIL;
            this.$max_size = (SubLObject)CommonSymbols.NIL;
            this.$rank_func = (SubLObject)CommonSymbols.NIL;
            this.$comp_func = (SubLObject)CommonSymbols.NIL;
            this.$tree = (SubLObject)CommonSymbols.NIL;
        }
        
        @Override
		public SubLStructDecl getStructDecl() {
            return (SubLStructDecl)$priority_queue_native.structDecl;
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
            structDecl = Structures.makeStructDeclNative((Class)$priority_queue_native.class, queues.$sym48$PRIORITY_QUEUE, queues.$sym49$PRIORITY_QUEUE_P, queues.$list50, queues.$list51, new String[] { "$num", "$max_size", "$rank_func", "$comp_func", "$tree" }, queues.$list52, queues.$list53, queues.$sym54$PRINT_P_QUEUE);
        }
    }
    
    public static final class $priority_queue_p$UnaryFunction extends UnaryFunction
    {
        public $priority_queue_p$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("PRIORITY-QUEUE-P"));
        }
        
        @Override
		public SubLObject processItem(final SubLObject arg1) {
            return queues.priority_queue_p(arg1);
        }
    }
    
    public static final class $pq_collision_enter$BinaryFunction extends BinaryFunction
    {
        public $pq_collision_enter$BinaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("PQ-COLLISION-ENTER"));
        }
        
        @Override
		public SubLObject processItem(final SubLObject arg1, final SubLObject arg2) {
            return queues.pq_collision_enter(arg1, arg2);
        }
    }
    
    public static final class $pq_collision_remove$BinaryFunction extends BinaryFunction
    {
        public $pq_collision_remove$BinaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("PQ-COLLISION-REMOVE"));
        }
        
        @Override
		public SubLObject processItem(final SubLObject arg1, final SubLObject arg2) {
            return queues.pq_collision_remove(arg1, arg2);
        }
    }
    
    public static final class $pq_collision_empty$UnaryFunction extends UnaryFunction
    {
        public $pq_collision_empty$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("PQ-COLLISION-EMPTY"));
        }
        
        @Override
		public SubLObject processItem(final SubLObject arg1) {
            return queues.pq_collision_empty(arg1);
        }
    }
    
    public static final class $lazy_priority_queue_native extends SubLStructNative
    {
        public SubLObject $ordered_items;
        public SubLObject $new_items;
        private static final SubLStructDeclNative structDecl;
        
        public $lazy_priority_queue_native() {
            this.$ordered_items = (SubLObject)CommonSymbols.NIL;
            this.$new_items = (SubLObject)CommonSymbols.NIL;
        }
        
        @Override
		public SubLStructDecl getStructDecl() {
            return (SubLStructDecl)$lazy_priority_queue_native.structDecl;
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
            structDecl = Structures.makeStructDeclNative((Class)$lazy_priority_queue_native.class, queues.$sym84$LAZY_PRIORITY_QUEUE, queues.$sym85$LAZY_PRIORITY_QUEUE_P, queues.$list86, queues.$list87, new String[] { "$ordered_items", "$new_items" }, queues.$list88, queues.$list89, queues.$sym90$PRINT_LAZY_P_QUEUE);
        }
    }
    
    public static final class $lazy_priority_queue_p$UnaryFunction extends UnaryFunction
    {
        public $lazy_priority_queue_p$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("LAZY-PRIORITY-QUEUE-P"));
        }
        
        @Override
		public SubLObject processItem(final SubLObject arg1) {
            return queues.lazy_priority_queue_p(arg1);
        }
    }
    
    public static final class $locked_queue_native extends SubLStructNative
    {
        public SubLObject $lock;
        public SubLObject $queue;
        private static final SubLStructDeclNative structDecl;
        
        public $locked_queue_native() {
            this.$lock = (SubLObject)CommonSymbols.NIL;
            this.$queue = (SubLObject)CommonSymbols.NIL;
        }
        
        @Override
		public SubLStructDecl getStructDecl() {
            return (SubLStructDecl)$locked_queue_native.structDecl;
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
            structDecl = Structures.makeStructDeclNative((Class)$locked_queue_native.class, queues.$sym105$LOCKED_QUEUE, queues.$sym106$LOCKED_QUEUE_P, queues.$list107, queues.$list108, new String[] { "$lock", "$queue" }, queues.$list109, queues.$list110, queues.$sym111$DEFAULT_STRUCT_PRINT_FUNCTION);
        }
    }
    
    public static final class $locked_queue_p$UnaryFunction extends UnaryFunction
    {
        public $locked_queue_p$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("LOCKED-QUEUE-P"));
        }
        
        @Override
		public SubLObject processItem(final SubLObject arg1) {
            return queues.locked_queue_p(arg1);
        }
    }
    
    public static final class $locked_p_queue_native extends SubLStructNative
    {
        public SubLObject $lock;
        public SubLObject $priority_queue;
        private static final SubLStructDeclNative structDecl;
        
        public $locked_p_queue_native() {
            this.$lock = (SubLObject)CommonSymbols.NIL;
            this.$priority_queue = (SubLObject)CommonSymbols.NIL;
        }
        
        @Override
		public SubLStructDecl getStructDecl() {
            return (SubLStructDecl)$locked_p_queue_native.structDecl;
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
            structDecl = Structures.makeStructDeclNative((Class)$locked_p_queue_native.class, queues.$sym123$LOCKED_P_QUEUE, queues.$sym124$LOCKED_P_QUEUE_P, queues.$list125, queues.$list126, new String[] { "$lock", "$priority_queue" }, queues.$list127, queues.$list128, queues.$sym129$PRINT_LP_QUEUE);
        }
    }
    
    public static final class $locked_p_queue_p$UnaryFunction extends UnaryFunction
    {
        public $locked_p_queue_p$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("LOCKED-P-QUEUE-P"));
        }
        
        @Override
		public SubLObject processItem(final SubLObject arg1) {
            return queues.locked_p_queue_p(arg1);
        }
    }
}

/*

	Total time: 508 ms
	
*/