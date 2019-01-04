package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.bytes;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class subloop_processes extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.subloop_processes";
    public static final String myFingerPrint = "e32cc7706d0aa095621e86dddf209d69e4606b4b79dee6d5c7ccc497ee6aa9b2";
    @SubLTranslatedFile.SubL(source = "cycl/subloop-processes.lisp", position = 849L)
    private static SubLSymbol $valid_subloop_process_status_types$;
    private static final SubLList $list0;
    private static final SubLSymbol $sym1$SUBLOOP_PROCESS_STATUS_TYPE;
    private static final SubLString $str2$_S___S_is_not_a_member_of_the__S_;
    private static final SubLSymbol $sym3$ENCODE_SUBLOOP_PROCESS_STATUS_TYPE;
    private static final SubLString $str4$_S___S_is_not_a_valid_encoding_of;
    private static final SubLSymbol $sym5$DECODE_SUBLOOP_PROCESS_STATUS_TYPE;
    private static final SubLString $str6$_S___S_was_expected_to_be_a_membe;
    private static final SubLSymbol $sym7$SUBLOOP_PROCESS_STATUS_TYPE_P;
    private static final SubLSymbol $sym8$SUBLOOP_PROCESS;
    private static final SubLList $list9;
    private static final SubLSymbol $sym10$BASIC_SUBLOOP_PROCESS;
    private static final SubLSymbol $sym11$OBJECT;
    private static final SubLList $list12;
    private static final SubLList $list13;
    private static final SubLSymbol $sym14$OWNER;
    private static final SubLSymbol $sym15$INSTANCE_COUNT;
    private static final SubLSymbol $sym16$SUBLOOP_RESERVED_INITIALIZE_BASIC_SUBLOOP_PROCESS_CLASS;
    private static final SubLSymbol $sym17$ISOLATED_P;
    private static final SubLSymbol $sym18$INSTANCE_NUMBER;
    private static final SubLSymbol $sym19$NAME;
    private static final SubLSymbol $sym20$PRIORITY;
    private static final SubLSymbol $sym21$STATUS;
    private static final SubLSymbol $sym22$SUBLOOP_RESERVED_INITIALIZE_BASIC_SUBLOOP_PROCESS_INSTANCE;
    private static final SubLSymbol $sym23$INITIALIZE;
    private static final SubLList $list24;
    private static final SubLList $list25;
    private static final SubLSymbol $sym26$OUTER_CATCH_FOR_BASIC_SUBLOOP_PROCESS_METHOD;
    private static final SubLSymbol $kw27$UNKNOWN;
    private static final SubLSymbol $sym28$BASIC_SUBLOOP_PROCESS_INITIALIZE_METHOD;
    private static final SubLSymbol $sym29$PRINT;
    private static final SubLList $list30;
    private static final SubLList $list31;
    private static final SubLList $list32;
    private static final SubLSymbol $sym33$OUTER_CATCH_FOR_BASIC_SUBLOOP_PROCESS_METHOD;
    private static final SubLString $str34$__BASIC_SUBLOOP_PROCESS___S___S_;
    private static final SubLSymbol $sym35$BASIC_SUBLOOP_PROCESS_PRINT_METHOD;
    private static final SubLSymbol $sym36$GET_NAME;
    private static final SubLList $list37;
    private static final SubLList $list38;
    private static final SubLSymbol $sym39$BASIC_SUBLOOP_PROCESS_GET_NAME_METHOD;
    private static final SubLSymbol $sym40$SET_NAME;
    private static final SubLList $list41;
    private static final SubLList $list42;
    private static final SubLSymbol $sym43$OUTER_CATCH_FOR_BASIC_SUBLOOP_PROCESS_METHOD;
    private static final SubLString $str44$_SET_NAME__S____S_is_not_a_valid_;
    private static final SubLSymbol $sym45$BASIC_SUBLOOP_PROCESS_SET_NAME_METHOD;
    private static final SubLSymbol $sym46$GET_PRIORITY;
    private static final SubLList $list47;
    private static final SubLSymbol $sym48$BASIC_SUBLOOP_PROCESS_GET_PRIORITY_METHOD;
    private static final SubLSymbol $sym49$SET_PRIORITY;
    private static final SubLList $list50;
    private static final SubLList $list51;
    private static final SubLSymbol $sym52$OUTER_CATCH_FOR_BASIC_SUBLOOP_PROCESS_METHOD;
    private static final SubLString $str53$_SET_PRIORITY__S____S_is_not_a_va;
    private static final SubLSymbol $sym54$BASIC_SUBLOOP_PROCESS_SET_PRIORITY_METHOD;
    private static final SubLSymbol $sym55$GET_STATUS;
    private static final SubLList $list56;
    private static final SubLSymbol $sym57$BASIC_SUBLOOP_PROCESS_GET_STATUS_METHOD;
    private static final SubLSymbol $sym58$RUN;
    private static final SubLList $list59;
    private static final SubLList $list60;
    private static final SubLSymbol $kw61$ERROR;
    private static final SubLSymbol $kw62$ACTIVE;
    private static final SubLSymbol $sym63$RUN_INTERNAL;
    private static final SubLSymbol $kw64$TERMINATED;
    private static final SubLSymbol $kw65$KILLED;
    private static final SubLSymbol $kw66$DEAD;
    private static final SubLSymbol $kw67$SUSPENDED;
    private static final SubLSymbol $sym68$BASIC_SUBLOOP_PROCESS_RUN_METHOD;
    private static final SubLList $list69;
    private static final SubLList $list70;
    private static final SubLSymbol $sym71$BASIC_SUBLOOP_PROCESS_RUN_INTERNAL_METHOD;
    private static final SubLSymbol $sym72$SUSPEND;
    private static final SubLList $list73;
    private static final SubLSymbol $sym74$BASIC_SUBLOOP_PROCESS_SUSPEND_METHOD;
    private static final SubLSymbol $sym75$KILL;
    private static final SubLList $list76;
    private static final SubLSymbol $sym77$BASIC_SUBLOOP_PROCESS_KILL_METHOD;
    private static final SubLSymbol $sym78$GET_OWNER;
    private static final SubLList $list79;
    private static final SubLSymbol $sym80$BASIC_SUBLOOP_PROCESS_GET_OWNER_METHOD;
    private static final SubLSymbol $sym81$SET_OWNER;
    private static final SubLList $list82;
    private static final SubLList $list83;
    private static final SubLSymbol $sym84$OUTER_CATCH_FOR_BASIC_SUBLOOP_PROCESS_METHOD;
    private static final SubLString $str85$_SET_OWNER__S____S_is_not_an_inst;
    private static final SubLSymbol $sym86$BASIC_SUBLOOP_PROCESS_SET_OWNER_METHOD;
    private static final SubLSymbol $sym87$NOTHING_TO_DO_;
    private static final SubLSymbol $sym88$BASIC_SUBLOOP_PROCESS_NOTHING_TO_DO__METHOD;
    private static final SubLSymbol $sym89$ENQUEUE_NOTIFY;
    private static final SubLList $list90;
    private static final SubLList $list91;
    private static final SubLSymbol $sym92$BASIC_SUBLOOP_PROCESS_ENQUEUE_NOTIFY_METHOD;
    private static final SubLSymbol $sym93$DEQUEUE_NOTIFY;
    private static final SubLList $list94;
    private static final SubLSymbol $sym95$BASIC_SUBLOOP_PROCESS_DEQUEUE_NOTIFY_METHOD;
    private static final SubLSymbol $sym96$REMOVE_NOTIFY;
    private static final SubLList $list97;
    private static final SubLSymbol $sym98$BASIC_SUBLOOP_PROCESS_REMOVE_NOTIFY_METHOD;
    private static final SubLSymbol $sym99$MULTI_TASK_SCHEDULER;
    private static final SubLList $list100;
    private static final SubLSymbol $sym101$BASIC_MULTI_TASK_SCHEDULER;
    private static final SubLList $list102;
    private static final SubLList $list103;
    private static final SubLSymbol $sym104$PROCESS_QUEUE;
    private static final SubLSymbol $sym105$TRANSFER_QUEUE;
    private static final SubLSymbol $sym106$TRACE_P;
    private static final SubLInteger $int107$4098;
    private static final SubLSymbol $sym108$HALTED_P;
    private static final SubLInteger $int109$4097;
    private static final SubLSymbol $sym110$SUBLOOP_RESERVED_INITIALIZE_BASIC_MULTI_TASK_SCHEDULER_CLASS;
    private static final SubLSymbol $sym111$SUBLOOP_RESERVED_INITIALIZE_BASIC_MULTI_TASK_SCHEDULER_INSTANCE;
    private static final SubLList $list112;
    private static final SubLSymbol $sym113$OUTER_CATCH_FOR_BASIC_MULTI_TASK_SCHEDULER_METHOD;
    private static final SubLSymbol $sym114$BASIC_DOUBLY_LINKED_QUEUE;
    private static final SubLSymbol $sym115$BASIC_MULTI_TASK_SCHEDULER_INITIALIZE_METHOD;
    private static final SubLSymbol $sym116$HALT;
    private static final SubLList $list117;
    private static final SubLSymbol $sym118$OUTER_CATCH_FOR_BASIC_MULTI_TASK_SCHEDULER_METHOD;
    private static final SubLSymbol $sym119$BASIC_MULTI_TASK_SCHEDULER_HALT_METHOD;
    private static final SubLSymbol $sym120$START;
    private static final SubLList $list121;
    private static final SubLSymbol $sym122$OUTER_CATCH_FOR_BASIC_MULTI_TASK_SCHEDULER_METHOD;
    private static final SubLSymbol $sym123$BASIC_MULTI_TASK_SCHEDULER_START_METHOD;
    private static final SubLSymbol $sym124$ADD_TASK;
    private static final SubLList $list125;
    private static final SubLList $list126;
    private static final SubLSymbol $sym127$OUTER_CATCH_FOR_BASIC_MULTI_TASK_SCHEDULER_METHOD;
    private static final SubLString $str128$_ADD_TASK__S____S_is_not_a_SubLOO;
    private static final SubLSymbol $sym129$BASIC_MULTI_TASK_SCHEDULER_ADD_TASK_METHOD;
    private static final SubLSymbol $sym130$KILL_TASK;
    private static final SubLList $list131;
    private static final SubLString $str132$_KILL_TASK__S____S_is_not_a_SubLO;
    private static final SubLSymbol $sym133$BASIC_MULTI_TASK_SCHEDULER_KILL_TASK_METHOD;
    private static final SubLSymbol $sym134$KILL_TASK_BY_NAME;
    private static final SubLList $list135;
    private static final SubLList $list136;
    private static final SubLSymbol $sym137$BASIC_MULTI_TASK_SCHEDULER_KILL_TASK_BY_NAME_METHOD;
    private static final SubLSymbol $sym138$INTERRUPT_TASK;
    private static final SubLList $list139;
    private static final SubLString $str140$_INTERRUPT_TASK__S____S_is_not_a_;
    private static final SubLSymbol $sym141$BASIC_MULTI_TASK_SCHEDULER_INTERRUPT_TASK_METHOD;
    private static final SubLSymbol $sym142$INTERRUPT_TASK_BY_NAME;
    private static final SubLList $list143;
    private static final SubLSymbol $sym144$BASIC_MULTI_TASK_SCHEDULER_INTERRUPT_TASK_BY_NAME_METHOD;
    private static final SubLSymbol $sym145$GET_ALL_TASKS;
    private static final SubLList $list146;
    private static final SubLSymbol $sym147$BASIC_MULTI_TASK_SCHEDULER_GET_ALL_TASKS_METHOD;
    private static final SubLSymbol $sym148$KILL_ALL_TASKS;
    private static final SubLList $list149;
    private static final SubLSymbol $sym150$BASIC_MULTI_TASK_SCHEDULER_KILL_ALL_TASKS_METHOD;
    private static final SubLList $list151;
    private static final SubLList $list152;
    private static final SubLString $str153$_RUN__S____S_is_not_a_valid_expir;
    private static final SubLSymbol $sym154$PERFORM_TRACE;
    private static final SubLList $list155;
    private static final SubLSymbol $sym156$ON_NOTHING_TO_DO;
    private static final SubLSymbol $sym157$BASIC_MULTI_TASK_SCHEDULER_RUN_METHOD;
    private static final SubLSymbol $sym158$GET_TRACE_MODE;
    private static final SubLList $list159;
    private static final SubLSymbol $sym160$BASIC_MULTI_TASK_SCHEDULER_GET_TRACE_MODE_METHOD;
    private static final SubLSymbol $sym161$SET_TRACE_MODE;
    private static final SubLList $list162;
    private static final SubLList $list163;
    private static final SubLSymbol $sym164$OUTER_CATCH_FOR_BASIC_MULTI_TASK_SCHEDULER_METHOD;
    private static final SubLSymbol $sym165$BASIC_MULTI_TASK_SCHEDULER_SET_TRACE_MODE_METHOD;
    private static final SubLList $list166;
    private static final SubLList $list167;
    private static final SubLSymbol $sym168$BASIC_MULTI_TASK_SCHEDULER_PERFORM_TRACE_METHOD;
    private static final SubLList $list169;
    private static final SubLSymbol $sym170$OUTER_CATCH_FOR_BASIC_MULTI_TASK_SCHEDULER_METHOD;
    private static final SubLSymbol $sym171$BASIC_MULTI_TASK_SCHEDULER_NOTHING_TO_DO__METHOD;
    private static final SubLSymbol $sym172$BASIC_MULTI_TASK_SCHEDULER_ON_NOTHING_TO_DO_METHOD;
    
    @SubLTranslatedFile.SubL(source = "cycl/subloop-processes.lisp", position = 849L)
    public static SubLObject valid_subloop_process_status_types() {
        return subloop_processes.$valid_subloop_process_status_types$.getGlobalValue();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subloop-processes.lisp", position = 849L)
    public static SubLObject subloop_process_status_type_p(final SubLObject v_object) {
        return (SubLObject)((subloop_processes.NIL != conses_high.member(v_object, subloop_processes.$valid_subloop_process_status_types$.getGlobalValue(), (SubLObject)subloop_processes.UNPROVIDED, (SubLObject)subloop_processes.UNPROVIDED)) ? subloop_processes.T : subloop_processes.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subloop-processes.lisp", position = 849L)
    public static SubLObject encode_subloop_process_status_type(final SubLObject value) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject pos = Sequences.position(value, subloop_processes.$valid_subloop_process_status_types$.getGlobalValue(), (SubLObject)subloop_processes.UNPROVIDED, (SubLObject)subloop_processes.UNPROVIDED, (SubLObject)subloop_processes.UNPROVIDED, (SubLObject)subloop_processes.UNPROVIDED);
        if (subloop_processes.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && subloop_processes.NIL == pos) {
            Errors.error((SubLObject)subloop_processes.$str2$_S___S_is_not_a_member_of_the__S_, (SubLObject)subloop_processes.$sym3$ENCODE_SUBLOOP_PROCESS_STATUS_TYPE, value, (SubLObject)subloop_processes.$sym1$SUBLOOP_PROCESS_STATUS_TYPE);
        }
        return pos;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subloop-processes.lisp", position = 849L)
    public static SubLObject decode_subloop_process_status_type(final SubLObject value) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject element = ConsesLow.nth(value, subloop_processes.$valid_subloop_process_status_types$.getGlobalValue());
        if (subloop_processes.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && subloop_processes.NIL == element) {
            Errors.error((SubLObject)subloop_processes.$str4$_S___S_is_not_a_valid_encoding_of, (SubLObject)subloop_processes.$sym5$DECODE_SUBLOOP_PROCESS_STATUS_TYPE, value, (SubLObject)subloop_processes.$sym1$SUBLOOP_PROCESS_STATUS_TYPE);
        }
        return element;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subloop-processes.lisp", position = 849L)
    public static SubLObject subloop_process_status_type_less_p(final SubLObject value1, final SubLObject value2) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (subloop_processes.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && subloop_processes.NIL == subloop_process_status_type_p(value1)) {
            Errors.error((SubLObject)subloop_processes.$str6$_S___S_was_expected_to_be_a_membe, (SubLObject)subloop_processes.$sym7$SUBLOOP_PROCESS_STATUS_TYPE_P, value1, (SubLObject)subloop_processes.$sym1$SUBLOOP_PROCESS_STATUS_TYPE);
        }
        if (subloop_processes.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && subloop_processes.NIL == subloop_process_status_type_p(value2)) {
            Errors.error((SubLObject)subloop_processes.$str6$_S___S_was_expected_to_be_a_membe, (SubLObject)subloop_processes.$sym7$SUBLOOP_PROCESS_STATUS_TYPE_P, value2, (SubLObject)subloop_processes.$sym1$SUBLOOP_PROCESS_STATUS_TYPE);
        }
        SubLObject cdolist_list_var = subloop_processes.$valid_subloop_process_status_types$.getGlobalValue();
        SubLObject value3 = (SubLObject)subloop_processes.NIL;
        value3 = cdolist_list_var.first();
        while (subloop_processes.NIL != cdolist_list_var) {
            if (value3.eql(value1)) {
                return (SubLObject)SubLObjectFactory.makeBoolean(!value3.eql(value2));
            }
            if (value3.eql(value2)) {
                return (SubLObject)subloop_processes.NIL;
            }
            cdolist_list_var = cdolist_list_var.rest();
            value3 = cdolist_list_var.first();
        }
        return (SubLObject)subloop_processes.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subloop-processes.lisp", position = 849L)
    public static SubLObject subloop_process_status_type_greater_p(final SubLObject value1, final SubLObject value2) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (subloop_processes.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && subloop_processes.NIL == subloop_process_status_type_p(value1)) {
            Errors.error((SubLObject)subloop_processes.$str6$_S___S_was_expected_to_be_a_membe, (SubLObject)subloop_processes.$sym7$SUBLOOP_PROCESS_STATUS_TYPE_P, value1, (SubLObject)subloop_processes.$sym1$SUBLOOP_PROCESS_STATUS_TYPE);
        }
        if (subloop_processes.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && subloop_processes.NIL == subloop_process_status_type_p(value2)) {
            Errors.error((SubLObject)subloop_processes.$str6$_S___S_was_expected_to_be_a_membe, (SubLObject)subloop_processes.$sym7$SUBLOOP_PROCESS_STATUS_TYPE_P, value2, (SubLObject)subloop_processes.$sym1$SUBLOOP_PROCESS_STATUS_TYPE);
        }
        SubLObject cdolist_list_var = subloop_processes.$valid_subloop_process_status_types$.getGlobalValue();
        SubLObject value3 = (SubLObject)subloop_processes.NIL;
        value3 = cdolist_list_var.first();
        while (subloop_processes.NIL != cdolist_list_var) {
            if (value3.eql(value2)) {
                return (SubLObject)SubLObjectFactory.makeBoolean(!value3.eql(value1));
            }
            if (value3.eql(value1)) {
                return (SubLObject)subloop_processes.NIL;
            }
            cdolist_list_var = cdolist_list_var.rest();
            value3 = cdolist_list_var.first();
        }
        return (SubLObject)subloop_processes.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subloop-processes.lisp", position = 942L)
    public static SubLObject subloop_process_p(final SubLObject subloop_process) {
        return interfaces.subloop_instanceof_interface(subloop_process, (SubLObject)subloop_processes.$sym8$SUBLOOP_PROCESS);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subloop-processes.lisp", position = 1556L)
    public static SubLObject get_basic_subloop_process_owner(final SubLObject basic_subloop_process) {
        return classes.subloop_get_access_protected_instance_slot(basic_subloop_process, (SubLObject)subloop_processes.FOUR_INTEGER, (SubLObject)subloop_processes.$sym14$OWNER);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subloop-processes.lisp", position = 1556L)
    public static SubLObject set_basic_subloop_process_owner(final SubLObject basic_subloop_process, final SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(basic_subloop_process, value, (SubLObject)subloop_processes.FOUR_INTEGER, (SubLObject)subloop_processes.$sym14$OWNER);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subloop-processes.lisp", position = 1556L)
    public static SubLObject get_basic_subloop_process_status(final SubLObject basic_subloop_process) {
        return classes.subloop_get_instance_slot(basic_subloop_process, (SubLObject)subloop_processes.THREE_INTEGER);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subloop-processes.lisp", position = 1556L)
    public static SubLObject set_basic_subloop_process_status(final SubLObject basic_subloop_process, final SubLObject value) {
        return classes.subloop_set_instance_slot(basic_subloop_process, value, (SubLObject)subloop_processes.THREE_INTEGER);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subloop-processes.lisp", position = 1556L)
    public static SubLObject get_basic_subloop_process_priority(final SubLObject basic_subloop_process) {
        return classes.subloop_get_instance_slot(basic_subloop_process, (SubLObject)subloop_processes.TWO_INTEGER);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subloop-processes.lisp", position = 1556L)
    public static SubLObject set_basic_subloop_process_priority(final SubLObject basic_subloop_process, final SubLObject value) {
        return classes.subloop_set_instance_slot(basic_subloop_process, value, (SubLObject)subloop_processes.TWO_INTEGER);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subloop-processes.lisp", position = 1556L)
    public static SubLObject get_basic_subloop_process_name(final SubLObject basic_subloop_process) {
        return classes.subloop_get_instance_slot(basic_subloop_process, (SubLObject)subloop_processes.ONE_INTEGER);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subloop-processes.lisp", position = 1556L)
    public static SubLObject set_basic_subloop_process_name(final SubLObject basic_subloop_process, final SubLObject value) {
        return classes.subloop_set_instance_slot(basic_subloop_process, value, (SubLObject)subloop_processes.ONE_INTEGER);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subloop-processes.lisp", position = 1556L)
    public static SubLObject subloop_reserved_initialize_basic_subloop_process_class(final SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, (SubLObject)subloop_processes.$sym11$OBJECT, (SubLObject)subloop_processes.$sym15$INSTANCE_COUNT, (SubLObject)subloop_processes.ZERO_INTEGER);
        return (SubLObject)subloop_processes.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subloop-processes.lisp", position = 1556L)
    public static SubLObject subloop_reserved_initialize_basic_subloop_process_instance(final SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, (SubLObject)subloop_processes.$sym11$OBJECT, (SubLObject)subloop_processes.$sym17$ISOLATED_P, (SubLObject)subloop_processes.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)subloop_processes.$sym11$OBJECT, (SubLObject)subloop_processes.$sym18$INSTANCE_NUMBER, (SubLObject)subloop_processes.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)subloop_processes.$sym10$BASIC_SUBLOOP_PROCESS, (SubLObject)subloop_processes.$sym19$NAME, (SubLObject)subloop_processes.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)subloop_processes.$sym10$BASIC_SUBLOOP_PROCESS, (SubLObject)subloop_processes.$sym20$PRIORITY, (SubLObject)subloop_processes.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)subloop_processes.$sym10$BASIC_SUBLOOP_PROCESS, (SubLObject)subloop_processes.$sym21$STATUS, (SubLObject)subloop_processes.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)subloop_processes.$sym10$BASIC_SUBLOOP_PROCESS, (SubLObject)subloop_processes.$sym14$OWNER, (SubLObject)subloop_processes.NIL);
        return (SubLObject)subloop_processes.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subloop-processes.lisp", position = 1556L)
    public static SubLObject basic_subloop_process_p(final SubLObject basic_subloop_process) {
        return classes.subloop_instanceof_class(basic_subloop_process, (SubLObject)subloop_processes.$sym10$BASIC_SUBLOOP_PROCESS);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subloop-processes.lisp", position = 2749L)
    public static SubLObject basic_subloop_process_initialize_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_basic_subloop_process_method = (SubLObject)subloop_processes.NIL;
        SubLObject status = get_basic_subloop_process_status(self);
        SubLObject priority = get_basic_subloop_process_priority(self);
        SubLObject name = get_basic_subloop_process_name(self);
        try {
            thread.throwStack.push(subloop_processes.$sym26$OUTER_CATCH_FOR_BASIC_SUBLOOP_PROCESS_METHOD);
            try {
                object.object_initialize_method(self);
                name = (SubLObject)subloop_processes.NIL;
                priority = (SubLObject)subloop_processes.ZERO_INTEGER;
                status = (SubLObject)subloop_processes.$kw27$UNKNOWN;
                Dynamic.sublisp_throw((SubLObject)subloop_processes.$sym26$OUTER_CATCH_FOR_BASIC_SUBLOOP_PROCESS_METHOD, self);
            }
            finally {
                final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)subloop_processes.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    set_basic_subloop_process_status(self, status);
                    set_basic_subloop_process_priority(self, priority);
                    set_basic_subloop_process_name(self, name);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        }
        catch (Throwable ccatch_env_var) {
            catch_var_for_basic_subloop_process_method = Errors.handleThrowable(ccatch_env_var, (SubLObject)subloop_processes.$sym26$OUTER_CATCH_FOR_BASIC_SUBLOOP_PROCESS_METHOD);
        }
        finally {
            thread.throwStack.pop();
        }
        return catch_var_for_basic_subloop_process_method;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subloop-processes.lisp", position = 2921L)
    public static SubLObject basic_subloop_process_print_method(final SubLObject self, final SubLObject stream, final SubLObject depth) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_basic_subloop_process_method = (SubLObject)subloop_processes.NIL;
        final SubLObject status = get_basic_subloop_process_status(self);
        final SubLObject name = get_basic_subloop_process_name(self);
        try {
            thread.throwStack.push(subloop_processes.$sym33$OUTER_CATCH_FOR_BASIC_SUBLOOP_PROCESS_METHOD);
            try {
                PrintLow.format(stream, (SubLObject)subloop_processes.$str34$__BASIC_SUBLOOP_PROCESS___S___S_, name, status);
                Dynamic.sublisp_throw((SubLObject)subloop_processes.$sym33$OUTER_CATCH_FOR_BASIC_SUBLOOP_PROCESS_METHOD, self);
            }
            finally {
                final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)subloop_processes.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    set_basic_subloop_process_status(self, status);
                    set_basic_subloop_process_name(self, name);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        }
        catch (Throwable ccatch_env_var) {
            catch_var_for_basic_subloop_process_method = Errors.handleThrowable(ccatch_env_var, (SubLObject)subloop_processes.$sym33$OUTER_CATCH_FOR_BASIC_SUBLOOP_PROCESS_METHOD);
        }
        finally {
            thread.throwStack.pop();
        }
        return catch_var_for_basic_subloop_process_method;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subloop-processes.lisp", position = 3092L)
    public static SubLObject basic_subloop_process_get_name_method(final SubLObject self) {
        final SubLObject name = get_basic_subloop_process_name(self);
        return name;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subloop-processes.lisp", position = 3183L)
    public static SubLObject basic_subloop_process_set_name_method(final SubLObject self, final SubLObject new_name) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_basic_subloop_process_method = (SubLObject)subloop_processes.NIL;
        SubLObject name = get_basic_subloop_process_name(self);
        try {
            thread.throwStack.push(subloop_processes.$sym43$OUTER_CATCH_FOR_BASIC_SUBLOOP_PROCESS_METHOD);
            try {
                if (subloop_processes.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && subloop_processes.NIL != new_name && !new_name.isString()) {
                    Errors.error((SubLObject)subloop_processes.$str44$_SET_NAME__S____S_is_not_a_valid_, self, new_name);
                }
                name = new_name;
                Dynamic.sublisp_throw((SubLObject)subloop_processes.$sym43$OUTER_CATCH_FOR_BASIC_SUBLOOP_PROCESS_METHOD, new_name);
            }
            finally {
                final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)subloop_processes.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    set_basic_subloop_process_name(self, name);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        }
        catch (Throwable ccatch_env_var) {
            catch_var_for_basic_subloop_process_method = Errors.handleThrowable(ccatch_env_var, (SubLObject)subloop_processes.$sym43$OUTER_CATCH_FOR_BASIC_SUBLOOP_PROCESS_METHOD);
        }
        finally {
            thread.throwStack.pop();
        }
        return catch_var_for_basic_subloop_process_method;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subloop-processes.lisp", position = 3443L)
    public static SubLObject basic_subloop_process_get_priority_method(final SubLObject self) {
        final SubLObject priority = get_basic_subloop_process_priority(self);
        return priority;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subloop-processes.lisp", position = 3542L)
    public static SubLObject basic_subloop_process_set_priority_method(final SubLObject self, final SubLObject new_priority) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_basic_subloop_process_method = (SubLObject)subloop_processes.NIL;
        SubLObject priority = get_basic_subloop_process_priority(self);
        try {
            thread.throwStack.push(subloop_processes.$sym52$OUTER_CATCH_FOR_BASIC_SUBLOOP_PROCESS_METHOD);
            try {
                if (subloop_processes.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && (!new_priority.isInteger() || !new_priority.numGE((SubLObject)subloop_processes.ZERO_INTEGER))) {
                    Errors.error((SubLObject)subloop_processes.$str53$_SET_PRIORITY__S____S_is_not_a_va, self, new_priority);
                }
                priority = new_priority;
                Dynamic.sublisp_throw((SubLObject)subloop_processes.$sym52$OUTER_CATCH_FOR_BASIC_SUBLOOP_PROCESS_METHOD, new_priority);
            }
            finally {
                final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)subloop_processes.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    set_basic_subloop_process_priority(self, priority);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        }
        catch (Throwable ccatch_env_var) {
            catch_var_for_basic_subloop_process_method = Errors.handleThrowable(ccatch_env_var, (SubLObject)subloop_processes.$sym52$OUTER_CATCH_FOR_BASIC_SUBLOOP_PROCESS_METHOD);
        }
        finally {
            thread.throwStack.pop();
        }
        return catch_var_for_basic_subloop_process_method;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subloop-processes.lisp", position = 3851L)
    public static SubLObject basic_subloop_process_get_status_method(final SubLObject self) {
        final SubLObject status = get_basic_subloop_process_status(self);
        return status;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subloop-processes.lisp", position = 3946L)
    public static SubLObject basic_subloop_process_run_method(final SubLObject self) {
        SubLObject result = (SubLObject)subloop_processes.$kw61$ERROR;
        try {
            set_basic_subloop_process_status(self, (SubLObject)subloop_processes.$kw62$ACTIVE);
            result = methods.funcall_instance_method_with_0_args(self, (SubLObject)subloop_processes.$sym63$RUN_INTERNAL);
            if (result == subloop_processes.$kw64$TERMINATED || result == subloop_processes.$kw65$KILLED || result == subloop_processes.$kw61$ERROR) {
                set_basic_subloop_process_status(self, (SubLObject)subloop_processes.$kw66$DEAD);
            }
            else {
                set_basic_subloop_process_status(self, (SubLObject)subloop_processes.$kw67$SUSPENDED);
            }
        }
        finally {
            final SubLObject _prev_bind_0 = Dynamic.currentBinding(Threads.$is_thread_performing_cleanupP$);
            try {
                Dynamic.bind(Threads.$is_thread_performing_cleanupP$, (SubLObject)subloop_processes.T);
                final SubLObject _values = Values.getValuesAsVector();
                set_basic_subloop_process_status(self, (SubLObject)subloop_processes.$kw61$ERROR);
                Values.restoreValuesFromVector(_values);
            }
            finally {
                Dynamic.rebind(Threads.$is_thread_performing_cleanupP$, _prev_bind_0);
            }
        }
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subloop-processes.lisp", position = 4530L)
    public static SubLObject basic_subloop_process_run_internal_method(final SubLObject self) {
        return (SubLObject)subloop_processes.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subloop-processes.lisp", position = 4655L)
    public static SubLObject basic_subloop_process_suspend_method(final SubLObject self) {
        final SubLObject pcase_var;
        final SubLObject status = pcase_var = get_basic_subloop_process_status(self);
        if (pcase_var.eql((SubLObject)subloop_processes.$kw66$DEAD)) {
            return status;
        }
        set_basic_subloop_process_status(self, (SubLObject)subloop_processes.$kw67$SUSPENDED);
        final SubLObject owner = get_basic_subloop_process_owner(self);
        if (subloop_processes.NIL != owner) {
            subloop_queues.basic_doubly_linked_queue_remove_method(owner, self);
        }
        return (SubLObject)subloop_processes.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subloop-processes.lisp", position = 5163L)
    public static SubLObject basic_subloop_process_kill_method(final SubLObject self) {
        set_basic_subloop_process_status(self, (SubLObject)subloop_processes.$kw65$KILLED);
        return (SubLObject)subloop_processes.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subloop-processes.lisp", position = 5381L)
    public static SubLObject basic_subloop_process_get_owner_method(final SubLObject self) {
        final SubLObject owner = get_basic_subloop_process_owner(self);
        return owner;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subloop-processes.lisp", position = 5474L)
    public static SubLObject basic_subloop_process_set_owner_method(final SubLObject self, final SubLObject new_scheduler) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_basic_subloop_process_method = (SubLObject)subloop_processes.NIL;
        SubLObject owner = get_basic_subloop_process_owner(self);
        try {
            thread.throwStack.push(subloop_processes.$sym84$OUTER_CATCH_FOR_BASIC_SUBLOOP_PROCESS_METHOD);
            try {
                if (subloop_processes.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && subloop_processes.NIL != new_scheduler && subloop_processes.NIL == multi_task_scheduler_p(new_scheduler)) {
                    Errors.error((SubLObject)subloop_processes.$str85$_SET_OWNER__S____S_is_not_an_inst, self, new_scheduler);
                }
                owner = new_scheduler;
                Dynamic.sublisp_throw((SubLObject)subloop_processes.$sym84$OUTER_CATCH_FOR_BASIC_SUBLOOP_PROCESS_METHOD, new_scheduler);
            }
            finally {
                final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)subloop_processes.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    set_basic_subloop_process_owner(self, owner);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        }
        catch (Throwable ccatch_env_var) {
            catch_var_for_basic_subloop_process_method = Errors.handleThrowable(ccatch_env_var, (SubLObject)subloop_processes.$sym84$OUTER_CATCH_FOR_BASIC_SUBLOOP_PROCESS_METHOD);
        }
        finally {
            thread.throwStack.pop();
        }
        return catch_var_for_basic_subloop_process_method;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subloop-processes.lisp", position = 5780L)
    public static SubLObject basic_subloop_process_nothing_to_doP_method(final SubLObject self) {
        return (SubLObject)subloop_processes.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subloop-processes.lisp", position = 5883L)
    public static SubLObject basic_subloop_process_enqueue_notify_method(final SubLObject self, final SubLObject queue) {
        return (SubLObject)subloop_processes.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subloop-processes.lisp", position = 6011L)
    public static SubLObject basic_subloop_process_dequeue_notify_method(final SubLObject self, final SubLObject queue) {
        final SubLObject status = get_basic_subloop_process_status(self);
        if (status == subloop_processes.$kw66$DEAD) {
            return (SubLObject)subloop_processes.NIL;
        }
        final SubLObject result = basic_subloop_process_run_method(self);
        if (result == subloop_processes.$kw64$TERMINATED || result == subloop_processes.$kw65$KILLED || result == subloop_processes.$kw61$ERROR) {
            basic_subloop_process_kill_method(self);
        }
        return (SubLObject)subloop_processes.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subloop-processes.lisp", position = 6446L)
    public static SubLObject basic_subloop_process_remove_notify_method(final SubLObject self, final SubLObject queue) {
        basic_subloop_process_kill_method(self);
        return (SubLObject)subloop_processes.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subloop-processes.lisp", position = 6566L)
    public static SubLObject multi_task_scheduler_p(final SubLObject multi_task_scheduler) {
        return interfaces.subloop_instanceof_interface(multi_task_scheduler, (SubLObject)subloop_processes.$sym99$MULTI_TASK_SCHEDULER);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subloop-processes.lisp", position = 7359L)
    public static SubLObject get_basic_multi_task_scheduler_process_queue(final SubLObject basic_multi_task_scheduler) {
        return classes.subloop_get_access_protected_instance_slot(basic_multi_task_scheduler, (SubLObject)subloop_processes.TWO_INTEGER, (SubLObject)subloop_processes.$sym104$PROCESS_QUEUE);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subloop-processes.lisp", position = 7359L)
    public static SubLObject set_basic_multi_task_scheduler_process_queue(final SubLObject basic_multi_task_scheduler, final SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(basic_multi_task_scheduler, value, (SubLObject)subloop_processes.TWO_INTEGER, (SubLObject)subloop_processes.$sym104$PROCESS_QUEUE);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subloop-processes.lisp", position = 7359L)
    public static SubLObject get_basic_multi_task_scheduler_transfer_queue(final SubLObject basic_multi_task_scheduler) {
        return classes.subloop_get_access_protected_instance_slot(basic_multi_task_scheduler, (SubLObject)subloop_processes.ONE_INTEGER, (SubLObject)subloop_processes.$sym105$TRANSFER_QUEUE);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subloop-processes.lisp", position = 7359L)
    public static SubLObject set_basic_multi_task_scheduler_transfer_queue(final SubLObject basic_multi_task_scheduler, final SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(basic_multi_task_scheduler, value, (SubLObject)subloop_processes.ONE_INTEGER, (SubLObject)subloop_processes.$sym105$TRANSFER_QUEUE);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subloop-processes.lisp", position = 7359L)
    public static SubLObject get_basic_multi_task_scheduler_trace_p(final SubLObject basic_multi_task_scheduler) {
        final SubLObject v_class = subloop_structures.instance_class(basic_multi_task_scheduler);
        final SubLObject slot = slots.slot_assoc((SubLObject)subloop_processes.$sym106$TRACE_P, subloop_structures.class_compiled_instance_boolean_slot_access_alist(v_class));
        instances.instances_access_check_instance_slot(v_class, basic_multi_task_scheduler, slot);
        return classes.ldb_test((SubLObject)subloop_processes.$int107$4098, subloop_structures.instance_boolean_slots(basic_multi_task_scheduler));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subloop-processes.lisp", position = 7359L)
    public static SubLObject set_basic_multi_task_scheduler_trace_p(final SubLObject basic_multi_task_scheduler, final SubLObject value) {
        final SubLObject v_class = subloop_structures.instance_class(basic_multi_task_scheduler);
        final SubLObject slot = slots.slot_assoc((SubLObject)subloop_processes.$sym106$TRACE_P, subloop_structures.class_compiled_instance_boolean_slot_access_alist(v_class));
        instances.instances_access_check_instance_slot(v_class, basic_multi_task_scheduler, slot);
        subloop_structures._csetf_instance_boolean_slots(basic_multi_task_scheduler, bytes.dpb((SubLObject)((subloop_processes.NIL != value) ? subloop_processes.ONE_INTEGER : subloop_processes.ZERO_INTEGER), (SubLObject)subloop_processes.$int107$4098, subloop_structures.instance_boolean_slots(basic_multi_task_scheduler)));
        return value;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subloop-processes.lisp", position = 7359L)
    public static SubLObject get_basic_multi_task_scheduler_halted_p(final SubLObject basic_multi_task_scheduler) {
        final SubLObject v_class = subloop_structures.instance_class(basic_multi_task_scheduler);
        final SubLObject slot = slots.slot_assoc((SubLObject)subloop_processes.$sym108$HALTED_P, subloop_structures.class_compiled_instance_boolean_slot_access_alist(v_class));
        instances.instances_access_check_instance_slot(v_class, basic_multi_task_scheduler, slot);
        return classes.ldb_test((SubLObject)subloop_processes.$int109$4097, subloop_structures.instance_boolean_slots(basic_multi_task_scheduler));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subloop-processes.lisp", position = 7359L)
    public static SubLObject set_basic_multi_task_scheduler_halted_p(final SubLObject basic_multi_task_scheduler, final SubLObject value) {
        final SubLObject v_class = subloop_structures.instance_class(basic_multi_task_scheduler);
        final SubLObject slot = slots.slot_assoc((SubLObject)subloop_processes.$sym108$HALTED_P, subloop_structures.class_compiled_instance_boolean_slot_access_alist(v_class));
        instances.instances_access_check_instance_slot(v_class, basic_multi_task_scheduler, slot);
        subloop_structures._csetf_instance_boolean_slots(basic_multi_task_scheduler, bytes.dpb((SubLObject)((subloop_processes.NIL != value) ? subloop_processes.ONE_INTEGER : subloop_processes.ZERO_INTEGER), (SubLObject)subloop_processes.$int109$4097, subloop_structures.instance_boolean_slots(basic_multi_task_scheduler)));
        return value;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subloop-processes.lisp", position = 7359L)
    public static SubLObject subloop_reserved_initialize_basic_multi_task_scheduler_class(final SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, (SubLObject)subloop_processes.$sym11$OBJECT, (SubLObject)subloop_processes.$sym15$INSTANCE_COUNT, (SubLObject)subloop_processes.ZERO_INTEGER);
        return (SubLObject)subloop_processes.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subloop-processes.lisp", position = 7359L)
    public static SubLObject subloop_reserved_initialize_basic_multi_task_scheduler_instance(final SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, (SubLObject)subloop_processes.$sym11$OBJECT, (SubLObject)subloop_processes.$sym17$ISOLATED_P, (SubLObject)subloop_processes.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)subloop_processes.$sym101$BASIC_MULTI_TASK_SCHEDULER, (SubLObject)subloop_processes.$sym108$HALTED_P, (SubLObject)subloop_processes.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)subloop_processes.$sym101$BASIC_MULTI_TASK_SCHEDULER, (SubLObject)subloop_processes.$sym106$TRACE_P, (SubLObject)subloop_processes.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)subloop_processes.$sym11$OBJECT, (SubLObject)subloop_processes.$sym18$INSTANCE_NUMBER, (SubLObject)subloop_processes.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)subloop_processes.$sym101$BASIC_MULTI_TASK_SCHEDULER, (SubLObject)subloop_processes.$sym105$TRANSFER_QUEUE, (SubLObject)subloop_processes.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)subloop_processes.$sym101$BASIC_MULTI_TASK_SCHEDULER, (SubLObject)subloop_processes.$sym104$PROCESS_QUEUE, (SubLObject)subloop_processes.NIL);
        return (SubLObject)subloop_processes.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subloop-processes.lisp", position = 7359L)
    public static SubLObject basic_multi_task_scheduler_p(final SubLObject basic_multi_task_scheduler) {
        return classes.subloop_instanceof_class(basic_multi_task_scheduler, (SubLObject)subloop_processes.$sym101$BASIC_MULTI_TASK_SCHEDULER);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subloop-processes.lisp", position = 8576L)
    public static SubLObject basic_multi_task_scheduler_initialize_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_basic_multi_task_scheduler_method = (SubLObject)subloop_processes.NIL;
        SubLObject process_queue = get_basic_multi_task_scheduler_process_queue(self);
        SubLObject transfer_queue = get_basic_multi_task_scheduler_transfer_queue(self);
        SubLObject trace_p = get_basic_multi_task_scheduler_trace_p(self);
        SubLObject halted_p = get_basic_multi_task_scheduler_halted_p(self);
        try {
            thread.throwStack.push(subloop_processes.$sym113$OUTER_CATCH_FOR_BASIC_MULTI_TASK_SCHEDULER_METHOD);
            try {
                object.object_initialize_method(self);
                transfer_queue = object.new_class_instance((SubLObject)subloop_processes.$sym114$BASIC_DOUBLY_LINKED_QUEUE);
                subloop_queues.basic_doubly_linked_queue_set_passive_method(transfer_queue, (SubLObject)subloop_processes.T);
                process_queue = object.new_class_instance((SubLObject)subloop_processes.$sym114$BASIC_DOUBLY_LINKED_QUEUE);
                halted_p = (SubLObject)subloop_processes.T;
                trace_p = (SubLObject)subloop_processes.NIL;
                Dynamic.sublisp_throw((SubLObject)subloop_processes.$sym113$OUTER_CATCH_FOR_BASIC_MULTI_TASK_SCHEDULER_METHOD, (SubLObject)subloop_processes.NIL);
            }
            finally {
                final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)subloop_processes.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    set_basic_multi_task_scheduler_process_queue(self, process_queue);
                    set_basic_multi_task_scheduler_transfer_queue(self, transfer_queue);
                    set_basic_multi_task_scheduler_trace_p(self, trace_p);
                    set_basic_multi_task_scheduler_halted_p(self, halted_p);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        }
        catch (Throwable ccatch_env_var) {
            catch_var_for_basic_multi_task_scheduler_method = Errors.handleThrowable(ccatch_env_var, (SubLObject)subloop_processes.$sym113$OUTER_CATCH_FOR_BASIC_MULTI_TASK_SCHEDULER_METHOD);
        }
        finally {
            thread.throwStack.pop();
        }
        return catch_var_for_basic_multi_task_scheduler_method;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subloop-processes.lisp", position = 8949L)
    public static SubLObject basic_multi_task_scheduler_halt_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_basic_multi_task_scheduler_method = (SubLObject)subloop_processes.NIL;
        SubLObject halted_p = get_basic_multi_task_scheduler_halted_p(self);
        try {
            thread.throwStack.push(subloop_processes.$sym118$OUTER_CATCH_FOR_BASIC_MULTI_TASK_SCHEDULER_METHOD);
            try {
                halted_p = (SubLObject)subloop_processes.T;
                Dynamic.sublisp_throw((SubLObject)subloop_processes.$sym118$OUTER_CATCH_FOR_BASIC_MULTI_TASK_SCHEDULER_METHOD, (SubLObject)subloop_processes.T);
            }
            finally {
                final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)subloop_processes.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    set_basic_multi_task_scheduler_halted_p(self, halted_p);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        }
        catch (Throwable ccatch_env_var) {
            catch_var_for_basic_multi_task_scheduler_method = Errors.handleThrowable(ccatch_env_var, (SubLObject)subloop_processes.$sym118$OUTER_CATCH_FOR_BASIC_MULTI_TASK_SCHEDULER_METHOD);
        }
        finally {
            thread.throwStack.pop();
        }
        return catch_var_for_basic_multi_task_scheduler_method;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subloop-processes.lisp", position = 9048L)
    public static SubLObject basic_multi_task_scheduler_start_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_basic_multi_task_scheduler_method = (SubLObject)subloop_processes.NIL;
        SubLObject halted_p = get_basic_multi_task_scheduler_halted_p(self);
        try {
            thread.throwStack.push(subloop_processes.$sym122$OUTER_CATCH_FOR_BASIC_MULTI_TASK_SCHEDULER_METHOD);
            try {
                halted_p = (SubLObject)subloop_processes.NIL;
                basic_multi_task_scheduler_run_method(self, (SubLObject)subloop_processes.UNPROVIDED);
                Dynamic.sublisp_throw((SubLObject)subloop_processes.$sym122$OUTER_CATCH_FOR_BASIC_MULTI_TASK_SCHEDULER_METHOD, (SubLObject)subloop_processes.T);
            }
            finally {
                final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)subloop_processes.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    set_basic_multi_task_scheduler_halted_p(self, halted_p);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        }
        catch (Throwable ccatch_env_var) {
            catch_var_for_basic_multi_task_scheduler_method = Errors.handleThrowable(ccatch_env_var, (SubLObject)subloop_processes.$sym122$OUTER_CATCH_FOR_BASIC_MULTI_TASK_SCHEDULER_METHOD);
        }
        finally {
            thread.throwStack.pop();
        }
        return catch_var_for_basic_multi_task_scheduler_method;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subloop-processes.lisp", position = 9163L)
    public static SubLObject basic_multi_task_scheduler_add_task_method(final SubLObject self, final SubLObject subloop_process) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_basic_multi_task_scheduler_method = (SubLObject)subloop_processes.NIL;
        final SubLObject process_queue = get_basic_multi_task_scheduler_process_queue(self);
        try {
            thread.throwStack.push(subloop_processes.$sym127$OUTER_CATCH_FOR_BASIC_MULTI_TASK_SCHEDULER_METHOD);
            try {
                if (subloop_processes.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && subloop_processes.NIL == subloop_process_p(subloop_process)) {
                    Errors.error((SubLObject)subloop_processes.$str128$_ADD_TASK__S____S_is_not_a_SubLOO, self, subloop_process);
                }
                subloop_queues.basic_doubly_linked_queue_enqueue_method(process_queue, subloop_process);
                Dynamic.sublisp_throw((SubLObject)subloop_processes.$sym127$OUTER_CATCH_FOR_BASIC_MULTI_TASK_SCHEDULER_METHOD, subloop_process);
            }
            finally {
                final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)subloop_processes.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    set_basic_multi_task_scheduler_process_queue(self, process_queue);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        }
        catch (Throwable ccatch_env_var) {
            catch_var_for_basic_multi_task_scheduler_method = Errors.handleThrowable(ccatch_env_var, (SubLObject)subloop_processes.$sym127$OUTER_CATCH_FOR_BASIC_MULTI_TASK_SCHEDULER_METHOD);
        }
        finally {
            thread.throwStack.pop();
        }
        return catch_var_for_basic_multi_task_scheduler_method;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subloop-processes.lisp", position = 9478L)
    public static SubLObject basic_multi_task_scheduler_kill_task_method(final SubLObject self, final SubLObject subloop_process) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject process_queue = get_basic_multi_task_scheduler_process_queue(self);
        final SubLObject transfer_queue = get_basic_multi_task_scheduler_transfer_queue(self);
        if (subloop_processes.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && subloop_processes.NIL == subloop_process_p(subloop_process)) {
            Errors.error((SubLObject)subloop_processes.$str132$_KILL_TASK__S____S_is_not_a_SubLO, self, subloop_process);
        }
        if (subloop_processes.NIL != subloop_queues.basic_doubly_linked_queue_enqueued_p_method(process_queue, subloop_process)) {
            subloop_queues.basic_doubly_linked_queue_remove_method(process_queue, subloop_process);
            return subloop_process;
        }
        subloop_queues.basic_doubly_linked_queue_remove_method(transfer_queue, subloop_process);
        return (SubLObject)subloop_processes.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subloop-processes.lisp", position = 10000L)
    public static SubLObject basic_multi_task_scheduler_kill_task_by_name_method(final SubLObject self, final SubLObject subloop_process_name) {
        final SubLObject process_queue = get_basic_multi_task_scheduler_process_queue(self);
        final SubLObject transfer_queue = get_basic_multi_task_scheduler_transfer_queue(self);
        final SubLObject key = methods.resolve_method((SubLObject)subloop_processes.$sym36$GET_NAME, (SubLObject)subloop_processes.$sym10$BASIC_SUBLOOP_PROCESS);
        SubLObject task = subloop_queues.basic_doubly_linked_queue_find_method(process_queue, subloop_process_name, Symbols.symbol_function((SubLObject)subloop_processes.EQUAL), key);
        if (subloop_processes.NIL != task) {
            subloop_queues.basic_doubly_linked_queue_remove_method(process_queue, subloop_process_name);
            return task;
        }
        task = subloop_queues.basic_doubly_linked_queue_find_method(transfer_queue, subloop_process_name, Symbols.symbol_function((SubLObject)subloop_processes.EQUAL), key);
        if (subloop_processes.NIL != task) {
            subloop_queues.basic_doubly_linked_queue_remove_method(transfer_queue, task);
            return task;
        }
        return (SubLObject)subloop_processes.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subloop-processes.lisp", position = 10665L)
    public static SubLObject basic_multi_task_scheduler_interrupt_task_method(final SubLObject self, final SubLObject subloop_process) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject process_queue = get_basic_multi_task_scheduler_process_queue(self);
        final SubLObject transfer_queue = get_basic_multi_task_scheduler_transfer_queue(self);
        if (subloop_processes.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && subloop_processes.NIL == subloop_process_p(subloop_process)) {
            Errors.error((SubLObject)subloop_processes.$str140$_INTERRUPT_TASK__S____S_is_not_a_, self, subloop_process);
        }
        if (subloop_processes.NIL != subloop_queues.basic_doubly_linked_queue_enqueued_p_method(process_queue, subloop_process)) {
            subloop_queues.basic_doubly_linked_queue_remove_method(process_queue, subloop_process);
            subloop_queues.basic_doubly_linked_queue_enqueue_method(transfer_queue, subloop_process);
            return subloop_process;
        }
        return (SubLObject)subloop_processes.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subloop-processes.lisp", position = 11200L)
    public static SubLObject basic_multi_task_scheduler_interrupt_task_by_name_method(final SubLObject self, final SubLObject subloop_process_name) {
        final SubLObject process_queue = get_basic_multi_task_scheduler_process_queue(self);
        final SubLObject transfer_queue = get_basic_multi_task_scheduler_transfer_queue(self);
        final SubLObject key = methods.resolve_method((SubLObject)subloop_processes.$sym36$GET_NAME, (SubLObject)subloop_processes.$sym10$BASIC_SUBLOOP_PROCESS);
        final SubLObject task = subloop_queues.basic_doubly_linked_queue_find_method(process_queue, subloop_process_name, Symbols.symbol_function((SubLObject)subloop_processes.EQUAL), key);
        if (subloop_processes.NIL != task) {
            subloop_queues.basic_doubly_linked_queue_remove_method(process_queue, task);
            subloop_queues.basic_doubly_linked_queue_enqueue_method(transfer_queue, task);
            return task;
        }
        return (SubLObject)subloop_processes.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subloop-processes.lisp", position = 11702L)
    public static SubLObject basic_multi_task_scheduler_get_all_tasks_method(final SubLObject self) {
        final SubLObject process_queue = get_basic_multi_task_scheduler_process_queue(self);
        final SubLObject transfer_queue = get_basic_multi_task_scheduler_transfer_queue(self);
        return ConsesLow.nconc(subloop_queues.basic_doubly_linked_queue_get_contents_method(process_queue), subloop_queues.basic_doubly_linked_queue_get_contents_method(transfer_queue));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subloop-processes.lisp", position = 11956L)
    public static SubLObject basic_multi_task_scheduler_kill_all_tasks_method(final SubLObject self) {
        SubLObject cdolist_list_var;
        final SubLObject all_tasks = cdolist_list_var = basic_multi_task_scheduler_get_all_tasks_method(self);
        SubLObject task = (SubLObject)subloop_processes.NIL;
        task = cdolist_list_var.first();
        while (subloop_processes.NIL != cdolist_list_var) {
            basic_multi_task_scheduler_kill_task_method(self, task);
            cdolist_list_var = cdolist_list_var.rest();
            task = cdolist_list_var.first();
        }
        return (SubLObject)subloop_processes.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subloop-processes.lisp", position = 12160L)
    public static SubLObject basic_multi_task_scheduler_run_method(final SubLObject self, SubLObject expiration_delta) {
        if (expiration_delta == subloop_processes.UNPROVIDED) {
            expiration_delta = (SubLObject)subloop_processes.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (subloop_processes.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && subloop_processes.NIL != expiration_delta && !expiration_delta.isInteger() && !expiration_delta.numGE((SubLObject)subloop_processes.ZERO_INTEGER)) {
            Errors.error((SubLObject)subloop_processes.$str153$_RUN__S____S_is_not_a_valid_expir, self, expiration_delta);
        }
        set_basic_multi_task_scheduler_halted_p(self, (SubLObject)subloop_processes.NIL);
        final SubLObject transfer_queue = get_basic_multi_task_scheduler_transfer_queue(self);
        final SubLObject process_queue = get_basic_multi_task_scheduler_process_queue(self);
        SubLObject current_process = (SubLObject)subloop_processes.NIL;
        if (subloop_processes.NIL != expiration_delta) {
            final SubLObject start_time = Time.get_universal_time();
            final SubLObject stop_time = Numbers.add(start_time, expiration_delta);
            set_basic_multi_task_scheduler_halted_p(self, Numbers.numGE(stop_time, Time.get_universal_time()));
            while (subloop_processes.NIL == get_basic_multi_task_scheduler_halted_p(self) && subloop_processes.NIL == subloop_queues.basic_doubly_linked_queue_empty_p_method(process_queue)) {
                current_process = subloop_queues.basic_doubly_linked_queue_dequeue_method(process_queue);
                if (subloop_processes.NIL != get_basic_multi_task_scheduler_trace_p(self)) {
                    methods.funcall_instance_method_with_1_args(self, (SubLObject)subloop_processes.$sym154$PERFORM_TRACE, current_process);
                }
                if (subloop_processes.NIL == conses_high.member(get_basic_subloop_process_status(current_process), (SubLObject)subloop_processes.$list155, (SubLObject)subloop_processes.UNPROVIDED, (SubLObject)subloop_processes.UNPROVIDED)) {
                    subloop_queues.basic_doubly_linked_queue_enqueue_method(process_queue, current_process);
                }
                set_basic_multi_task_scheduler_halted_p(self, Numbers.numGE(stop_time, Time.get_universal_time()));
                if (subloop_processes.NIL != basic_multi_task_scheduler_nothing_to_doP_method(self)) {
                    methods.funcall_instance_method_with_0_args(self, (SubLObject)subloop_processes.$sym156$ON_NOTHING_TO_DO);
                }
            }
        }
        else {
            while (subloop_processes.NIL == get_basic_multi_task_scheduler_halted_p(self) && subloop_processes.NIL == subloop_queues.basic_doubly_linked_queue_empty_p_method(process_queue)) {
                current_process = subloop_queues.basic_doubly_linked_queue_dequeue_method(process_queue);
                if (subloop_processes.NIL != get_basic_multi_task_scheduler_trace_p(self)) {
                    methods.funcall_instance_method_with_1_args(self, (SubLObject)subloop_processes.$sym154$PERFORM_TRACE, current_process);
                }
                if (subloop_processes.NIL == conses_high.member(get_basic_subloop_process_status(current_process), (SubLObject)subloop_processes.$list155, (SubLObject)subloop_processes.UNPROVIDED, (SubLObject)subloop_processes.UNPROVIDED)) {
                    subloop_queues.basic_doubly_linked_queue_enqueue_method(process_queue, current_process);
                }
                if (subloop_processes.NIL != basic_multi_task_scheduler_nothing_to_doP_method(self)) {
                    methods.funcall_instance_method_with_0_args(self, (SubLObject)subloop_processes.$sym156$ON_NOTHING_TO_DO);
                }
            }
        }
        return (SubLObject)subloop_processes.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subloop-processes.lisp", position = 14582L)
    public static SubLObject basic_multi_task_scheduler_get_trace_mode_method(final SubLObject self) {
        final SubLObject trace_p = get_basic_multi_task_scheduler_trace_p(self);
        return trace_p;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subloop-processes.lisp", position = 14687L)
    public static SubLObject basic_multi_task_scheduler_set_trace_mode_method(final SubLObject self, final SubLObject new_trace_mode) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_basic_multi_task_scheduler_method = (SubLObject)subloop_processes.NIL;
        SubLObject trace_p = get_basic_multi_task_scheduler_trace_p(self);
        try {
            thread.throwStack.push(subloop_processes.$sym164$OUTER_CATCH_FOR_BASIC_MULTI_TASK_SCHEDULER_METHOD);
            try {
                trace_p = new_trace_mode;
                Dynamic.sublisp_throw((SubLObject)subloop_processes.$sym164$OUTER_CATCH_FOR_BASIC_MULTI_TASK_SCHEDULER_METHOD, new_trace_mode);
            }
            finally {
                final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)subloop_processes.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    set_basic_multi_task_scheduler_trace_p(self, trace_p);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        }
        catch (Throwable ccatch_env_var) {
            catch_var_for_basic_multi_task_scheduler_method = Errors.handleThrowable(ccatch_env_var, (SubLObject)subloop_processes.$sym164$OUTER_CATCH_FOR_BASIC_MULTI_TASK_SCHEDULER_METHOD);
        }
        finally {
            thread.throwStack.pop();
        }
        return catch_var_for_basic_multi_task_scheduler_method;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subloop-processes.lisp", position = 14835L)
    public static SubLObject basic_multi_task_scheduler_perform_trace_method(final SubLObject self, final SubLObject process) {
        return (SubLObject)subloop_processes.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subloop-processes.lisp", position = 15001L)
    public static SubLObject basic_multi_task_scheduler_nothing_to_doP_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_basic_multi_task_scheduler_method = (SubLObject)subloop_processes.NIL;
        final SubLObject process_queue = get_basic_multi_task_scheduler_process_queue(self);
        try {
            thread.throwStack.push(subloop_processes.$sym170$OUTER_CATCH_FOR_BASIC_MULTI_TASK_SCHEDULER_METHOD);
            try {
                SubLObject cdolist_list_var;
                final SubLObject queue_contents = cdolist_list_var = subloop_queues.basic_doubly_linked_queue_get_contents_method(process_queue);
                SubLObject process = (SubLObject)subloop_processes.NIL;
                process = cdolist_list_var.first();
                while (subloop_processes.NIL != cdolist_list_var) {
                    if (subloop_processes.NIL == methods.funcall_instance_method_with_0_args(process, (SubLObject)subloop_processes.$sym87$NOTHING_TO_DO_)) {
                        Dynamic.sublisp_throw((SubLObject)subloop_processes.$sym170$OUTER_CATCH_FOR_BASIC_MULTI_TASK_SCHEDULER_METHOD, (SubLObject)subloop_processes.NIL);
                    }
                    cdolist_list_var = cdolist_list_var.rest();
                    process = cdolist_list_var.first();
                }
                Dynamic.sublisp_throw((SubLObject)subloop_processes.$sym170$OUTER_CATCH_FOR_BASIC_MULTI_TASK_SCHEDULER_METHOD, (SubLObject)subloop_processes.T);
            }
            finally {
                final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)subloop_processes.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    set_basic_multi_task_scheduler_process_queue(self, process_queue);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        }
        catch (Throwable ccatch_env_var) {
            catch_var_for_basic_multi_task_scheduler_method = Errors.handleThrowable(ccatch_env_var, (SubLObject)subloop_processes.$sym170$OUTER_CATCH_FOR_BASIC_MULTI_TASK_SCHEDULER_METHOD);
        }
        finally {
            thread.throwStack.pop();
        }
        return catch_var_for_basic_multi_task_scheduler_method;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subloop-processes.lisp", position = 15308L)
    public static SubLObject basic_multi_task_scheduler_on_nothing_to_do_method(final SubLObject self) {
        return (SubLObject)subloop_processes.NIL;
    }
    
    public static SubLObject declare_subloop_processes_file() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subloop_processes", "valid_subloop_process_status_types", "VALID-SUBLOOP-PROCESS-STATUS-TYPES", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subloop_processes", "subloop_process_status_type_p", "SUBLOOP-PROCESS-STATUS-TYPE-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subloop_processes", "encode_subloop_process_status_type", "ENCODE-SUBLOOP-PROCESS-STATUS-TYPE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subloop_processes", "decode_subloop_process_status_type", "DECODE-SUBLOOP-PROCESS-STATUS-TYPE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subloop_processes", "subloop_process_status_type_less_p", "SUBLOOP-PROCESS-STATUS-TYPE-LESS-P", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subloop_processes", "subloop_process_status_type_greater_p", "SUBLOOP-PROCESS-STATUS-TYPE-GREATER-P", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subloop_processes", "subloop_process_p", "SUBLOOP-PROCESS-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subloop_processes", "get_basic_subloop_process_owner", "GET-BASIC-SUBLOOP-PROCESS-OWNER", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subloop_processes", "set_basic_subloop_process_owner", "SET-BASIC-SUBLOOP-PROCESS-OWNER", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subloop_processes", "get_basic_subloop_process_status", "GET-BASIC-SUBLOOP-PROCESS-STATUS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subloop_processes", "set_basic_subloop_process_status", "SET-BASIC-SUBLOOP-PROCESS-STATUS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subloop_processes", "get_basic_subloop_process_priority", "GET-BASIC-SUBLOOP-PROCESS-PRIORITY", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subloop_processes", "set_basic_subloop_process_priority", "SET-BASIC-SUBLOOP-PROCESS-PRIORITY", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subloop_processes", "get_basic_subloop_process_name", "GET-BASIC-SUBLOOP-PROCESS-NAME", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subloop_processes", "set_basic_subloop_process_name", "SET-BASIC-SUBLOOP-PROCESS-NAME", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subloop_processes", "subloop_reserved_initialize_basic_subloop_process_class", "SUBLOOP-RESERVED-INITIALIZE-BASIC-SUBLOOP-PROCESS-CLASS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subloop_processes", "subloop_reserved_initialize_basic_subloop_process_instance", "SUBLOOP-RESERVED-INITIALIZE-BASIC-SUBLOOP-PROCESS-INSTANCE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subloop_processes", "basic_subloop_process_p", "BASIC-SUBLOOP-PROCESS-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subloop_processes", "basic_subloop_process_initialize_method", "BASIC-SUBLOOP-PROCESS-INITIALIZE-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subloop_processes", "basic_subloop_process_print_method", "BASIC-SUBLOOP-PROCESS-PRINT-METHOD", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subloop_processes", "basic_subloop_process_get_name_method", "BASIC-SUBLOOP-PROCESS-GET-NAME-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subloop_processes", "basic_subloop_process_set_name_method", "BASIC-SUBLOOP-PROCESS-SET-NAME-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subloop_processes", "basic_subloop_process_get_priority_method", "BASIC-SUBLOOP-PROCESS-GET-PRIORITY-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subloop_processes", "basic_subloop_process_set_priority_method", "BASIC-SUBLOOP-PROCESS-SET-PRIORITY-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subloop_processes", "basic_subloop_process_get_status_method", "BASIC-SUBLOOP-PROCESS-GET-STATUS-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subloop_processes", "basic_subloop_process_run_method", "BASIC-SUBLOOP-PROCESS-RUN-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subloop_processes", "basic_subloop_process_run_internal_method", "BASIC-SUBLOOP-PROCESS-RUN-INTERNAL-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subloop_processes", "basic_subloop_process_suspend_method", "BASIC-SUBLOOP-PROCESS-SUSPEND-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subloop_processes", "basic_subloop_process_kill_method", "BASIC-SUBLOOP-PROCESS-KILL-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subloop_processes", "basic_subloop_process_get_owner_method", "BASIC-SUBLOOP-PROCESS-GET-OWNER-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subloop_processes", "basic_subloop_process_set_owner_method", "BASIC-SUBLOOP-PROCESS-SET-OWNER-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subloop_processes", "basic_subloop_process_nothing_to_doP_method", "BASIC-SUBLOOP-PROCESS-NOTHING-TO-DO?-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subloop_processes", "basic_subloop_process_enqueue_notify_method", "BASIC-SUBLOOP-PROCESS-ENQUEUE-NOTIFY-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subloop_processes", "basic_subloop_process_dequeue_notify_method", "BASIC-SUBLOOP-PROCESS-DEQUEUE-NOTIFY-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subloop_processes", "basic_subloop_process_remove_notify_method", "BASIC-SUBLOOP-PROCESS-REMOVE-NOTIFY-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subloop_processes", "multi_task_scheduler_p", "MULTI-TASK-SCHEDULER-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subloop_processes", "get_basic_multi_task_scheduler_process_queue", "GET-BASIC-MULTI-TASK-SCHEDULER-PROCESS-QUEUE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subloop_processes", "set_basic_multi_task_scheduler_process_queue", "SET-BASIC-MULTI-TASK-SCHEDULER-PROCESS-QUEUE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subloop_processes", "get_basic_multi_task_scheduler_transfer_queue", "GET-BASIC-MULTI-TASK-SCHEDULER-TRANSFER-QUEUE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subloop_processes", "set_basic_multi_task_scheduler_transfer_queue", "SET-BASIC-MULTI-TASK-SCHEDULER-TRANSFER-QUEUE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subloop_processes", "get_basic_multi_task_scheduler_trace_p", "GET-BASIC-MULTI-TASK-SCHEDULER-TRACE-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subloop_processes", "set_basic_multi_task_scheduler_trace_p", "SET-BASIC-MULTI-TASK-SCHEDULER-TRACE-P", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subloop_processes", "get_basic_multi_task_scheduler_halted_p", "GET-BASIC-MULTI-TASK-SCHEDULER-HALTED-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subloop_processes", "set_basic_multi_task_scheduler_halted_p", "SET-BASIC-MULTI-TASK-SCHEDULER-HALTED-P", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subloop_processes", "subloop_reserved_initialize_basic_multi_task_scheduler_class", "SUBLOOP-RESERVED-INITIALIZE-BASIC-MULTI-TASK-SCHEDULER-CLASS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subloop_processes", "subloop_reserved_initialize_basic_multi_task_scheduler_instance", "SUBLOOP-RESERVED-INITIALIZE-BASIC-MULTI-TASK-SCHEDULER-INSTANCE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subloop_processes", "basic_multi_task_scheduler_p", "BASIC-MULTI-TASK-SCHEDULER-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subloop_processes", "basic_multi_task_scheduler_initialize_method", "BASIC-MULTI-TASK-SCHEDULER-INITIALIZE-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subloop_processes", "basic_multi_task_scheduler_halt_method", "BASIC-MULTI-TASK-SCHEDULER-HALT-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subloop_processes", "basic_multi_task_scheduler_start_method", "BASIC-MULTI-TASK-SCHEDULER-START-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subloop_processes", "basic_multi_task_scheduler_add_task_method", "BASIC-MULTI-TASK-SCHEDULER-ADD-TASK-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subloop_processes", "basic_multi_task_scheduler_kill_task_method", "BASIC-MULTI-TASK-SCHEDULER-KILL-TASK-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subloop_processes", "basic_multi_task_scheduler_kill_task_by_name_method", "BASIC-MULTI-TASK-SCHEDULER-KILL-TASK-BY-NAME-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subloop_processes", "basic_multi_task_scheduler_interrupt_task_method", "BASIC-MULTI-TASK-SCHEDULER-INTERRUPT-TASK-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subloop_processes", "basic_multi_task_scheduler_interrupt_task_by_name_method", "BASIC-MULTI-TASK-SCHEDULER-INTERRUPT-TASK-BY-NAME-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subloop_processes", "basic_multi_task_scheduler_get_all_tasks_method", "BASIC-MULTI-TASK-SCHEDULER-GET-ALL-TASKS-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subloop_processes", "basic_multi_task_scheduler_kill_all_tasks_method", "BASIC-MULTI-TASK-SCHEDULER-KILL-ALL-TASKS-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subloop_processes", "basic_multi_task_scheduler_run_method", "BASIC-MULTI-TASK-SCHEDULER-RUN-METHOD", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subloop_processes", "basic_multi_task_scheduler_get_trace_mode_method", "BASIC-MULTI-TASK-SCHEDULER-GET-TRACE-MODE-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subloop_processes", "basic_multi_task_scheduler_set_trace_mode_method", "BASIC-MULTI-TASK-SCHEDULER-SET-TRACE-MODE-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subloop_processes", "basic_multi_task_scheduler_perform_trace_method", "BASIC-MULTI-TASK-SCHEDULER-PERFORM-TRACE-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subloop_processes", "basic_multi_task_scheduler_nothing_to_doP_method", "BASIC-MULTI-TASK-SCHEDULER-NOTHING-TO-DO?-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subloop_processes", "basic_multi_task_scheduler_on_nothing_to_do_method", "BASIC-MULTI-TASK-SCHEDULER-ON-NOTHING-TO-DO-METHOD", 1, 0, false);
        return (SubLObject)subloop_processes.NIL;
    }
    
    public static SubLObject init_subloop_processes_file() {
        subloop_processes.$valid_subloop_process_status_types$ = SubLFiles.defconstant("*VALID-SUBLOOP-PROCESS-STATUS-TYPES*", (SubLObject)subloop_processes.$list0);
        return (SubLObject)subloop_processes.NIL;
    }
    
    public static SubLObject setup_subloop_processes_file() {
        enumerations.enumerations_incorporate_definition((SubLObject)subloop_processes.$sym1$SUBLOOP_PROCESS_STATUS_TYPE, (SubLObject)subloop_processes.$list0);
        interfaces.new_interface((SubLObject)subloop_processes.$sym8$SUBLOOP_PROCESS, (SubLObject)subloop_processes.NIL, (SubLObject)subloop_processes.NIL, (SubLObject)subloop_processes.$list9);
        classes.subloop_new_class((SubLObject)subloop_processes.$sym10$BASIC_SUBLOOP_PROCESS, (SubLObject)subloop_processes.$sym11$OBJECT, (SubLObject)subloop_processes.$list12, (SubLObject)subloop_processes.NIL, (SubLObject)subloop_processes.$list13);
        classes.class_set_implements_slot_listeners((SubLObject)subloop_processes.$sym10$BASIC_SUBLOOP_PROCESS, (SubLObject)subloop_processes.NIL);
        classes.subloop_note_class_initialization_function((SubLObject)subloop_processes.$sym10$BASIC_SUBLOOP_PROCESS, (SubLObject)subloop_processes.$sym16$SUBLOOP_RESERVED_INITIALIZE_BASIC_SUBLOOP_PROCESS_CLASS);
        classes.subloop_note_instance_initialization_function((SubLObject)subloop_processes.$sym10$BASIC_SUBLOOP_PROCESS, (SubLObject)subloop_processes.$sym22$SUBLOOP_RESERVED_INITIALIZE_BASIC_SUBLOOP_PROCESS_INSTANCE);
        subloop_reserved_initialize_basic_subloop_process_class((SubLObject)subloop_processes.$sym10$BASIC_SUBLOOP_PROCESS);
        methods.methods_incorporate_instance_method((SubLObject)subloop_processes.$sym23$INITIALIZE, (SubLObject)subloop_processes.$sym10$BASIC_SUBLOOP_PROCESS, (SubLObject)subloop_processes.$list24, (SubLObject)subloop_processes.NIL, (SubLObject)subloop_processes.$list25);
        methods.subloop_register_instance_method((SubLObject)subloop_processes.$sym10$BASIC_SUBLOOP_PROCESS, (SubLObject)subloop_processes.$sym23$INITIALIZE, (SubLObject)subloop_processes.$sym28$BASIC_SUBLOOP_PROCESS_INITIALIZE_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)subloop_processes.$sym29$PRINT, (SubLObject)subloop_processes.$sym10$BASIC_SUBLOOP_PROCESS, (SubLObject)subloop_processes.$list30, (SubLObject)subloop_processes.$list31, (SubLObject)subloop_processes.$list32);
        methods.subloop_register_instance_method((SubLObject)subloop_processes.$sym10$BASIC_SUBLOOP_PROCESS, (SubLObject)subloop_processes.$sym29$PRINT, (SubLObject)subloop_processes.$sym35$BASIC_SUBLOOP_PROCESS_PRINT_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)subloop_processes.$sym36$GET_NAME, (SubLObject)subloop_processes.$sym10$BASIC_SUBLOOP_PROCESS, (SubLObject)subloop_processes.$list37, (SubLObject)subloop_processes.NIL, (SubLObject)subloop_processes.$list38);
        methods.subloop_register_instance_method((SubLObject)subloop_processes.$sym10$BASIC_SUBLOOP_PROCESS, (SubLObject)subloop_processes.$sym36$GET_NAME, (SubLObject)subloop_processes.$sym39$BASIC_SUBLOOP_PROCESS_GET_NAME_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)subloop_processes.$sym40$SET_NAME, (SubLObject)subloop_processes.$sym10$BASIC_SUBLOOP_PROCESS, (SubLObject)subloop_processes.$list30, (SubLObject)subloop_processes.$list41, (SubLObject)subloop_processes.$list42);
        methods.subloop_register_instance_method((SubLObject)subloop_processes.$sym10$BASIC_SUBLOOP_PROCESS, (SubLObject)subloop_processes.$sym40$SET_NAME, (SubLObject)subloop_processes.$sym45$BASIC_SUBLOOP_PROCESS_SET_NAME_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)subloop_processes.$sym46$GET_PRIORITY, (SubLObject)subloop_processes.$sym10$BASIC_SUBLOOP_PROCESS, (SubLObject)subloop_processes.$list37, (SubLObject)subloop_processes.NIL, (SubLObject)subloop_processes.$list47);
        methods.subloop_register_instance_method((SubLObject)subloop_processes.$sym10$BASIC_SUBLOOP_PROCESS, (SubLObject)subloop_processes.$sym46$GET_PRIORITY, (SubLObject)subloop_processes.$sym48$BASIC_SUBLOOP_PROCESS_GET_PRIORITY_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)subloop_processes.$sym49$SET_PRIORITY, (SubLObject)subloop_processes.$sym10$BASIC_SUBLOOP_PROCESS, (SubLObject)subloop_processes.$list30, (SubLObject)subloop_processes.$list50, (SubLObject)subloop_processes.$list51);
        methods.subloop_register_instance_method((SubLObject)subloop_processes.$sym10$BASIC_SUBLOOP_PROCESS, (SubLObject)subloop_processes.$sym49$SET_PRIORITY, (SubLObject)subloop_processes.$sym54$BASIC_SUBLOOP_PROCESS_SET_PRIORITY_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)subloop_processes.$sym55$GET_STATUS, (SubLObject)subloop_processes.$sym10$BASIC_SUBLOOP_PROCESS, (SubLObject)subloop_processes.$list37, (SubLObject)subloop_processes.NIL, (SubLObject)subloop_processes.$list56);
        methods.subloop_register_instance_method((SubLObject)subloop_processes.$sym10$BASIC_SUBLOOP_PROCESS, (SubLObject)subloop_processes.$sym55$GET_STATUS, (SubLObject)subloop_processes.$sym57$BASIC_SUBLOOP_PROCESS_GET_STATUS_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)subloop_processes.$sym58$RUN, (SubLObject)subloop_processes.$sym10$BASIC_SUBLOOP_PROCESS, (SubLObject)subloop_processes.$list59, (SubLObject)subloop_processes.NIL, (SubLObject)subloop_processes.$list60);
        methods.subloop_register_instance_method((SubLObject)subloop_processes.$sym10$BASIC_SUBLOOP_PROCESS, (SubLObject)subloop_processes.$sym58$RUN, (SubLObject)subloop_processes.$sym68$BASIC_SUBLOOP_PROCESS_RUN_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)subloop_processes.$sym63$RUN_INTERNAL, (SubLObject)subloop_processes.$sym10$BASIC_SUBLOOP_PROCESS, (SubLObject)subloop_processes.$list69, (SubLObject)subloop_processes.NIL, (SubLObject)subloop_processes.$list70);
        methods.subloop_register_instance_method((SubLObject)subloop_processes.$sym10$BASIC_SUBLOOP_PROCESS, (SubLObject)subloop_processes.$sym63$RUN_INTERNAL, (SubLObject)subloop_processes.$sym71$BASIC_SUBLOOP_PROCESS_RUN_INTERNAL_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)subloop_processes.$sym72$SUSPEND, (SubLObject)subloop_processes.$sym10$BASIC_SUBLOOP_PROCESS, (SubLObject)subloop_processes.$list59, (SubLObject)subloop_processes.NIL, (SubLObject)subloop_processes.$list73);
        methods.subloop_register_instance_method((SubLObject)subloop_processes.$sym10$BASIC_SUBLOOP_PROCESS, (SubLObject)subloop_processes.$sym72$SUSPEND, (SubLObject)subloop_processes.$sym74$BASIC_SUBLOOP_PROCESS_SUSPEND_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)subloop_processes.$sym75$KILL, (SubLObject)subloop_processes.$sym10$BASIC_SUBLOOP_PROCESS, (SubLObject)subloop_processes.$list59, (SubLObject)subloop_processes.NIL, (SubLObject)subloop_processes.$list76);
        methods.subloop_register_instance_method((SubLObject)subloop_processes.$sym10$BASIC_SUBLOOP_PROCESS, (SubLObject)subloop_processes.$sym75$KILL, (SubLObject)subloop_processes.$sym77$BASIC_SUBLOOP_PROCESS_KILL_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)subloop_processes.$sym78$GET_OWNER, (SubLObject)subloop_processes.$sym10$BASIC_SUBLOOP_PROCESS, (SubLObject)subloop_processes.$list37, (SubLObject)subloop_processes.NIL, (SubLObject)subloop_processes.$list79);
        methods.subloop_register_instance_method((SubLObject)subloop_processes.$sym10$BASIC_SUBLOOP_PROCESS, (SubLObject)subloop_processes.$sym78$GET_OWNER, (SubLObject)subloop_processes.$sym80$BASIC_SUBLOOP_PROCESS_GET_OWNER_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)subloop_processes.$sym81$SET_OWNER, (SubLObject)subloop_processes.$sym10$BASIC_SUBLOOP_PROCESS, (SubLObject)subloop_processes.$list30, (SubLObject)subloop_processes.$list82, (SubLObject)subloop_processes.$list83);
        methods.subloop_register_instance_method((SubLObject)subloop_processes.$sym10$BASIC_SUBLOOP_PROCESS, (SubLObject)subloop_processes.$sym81$SET_OWNER, (SubLObject)subloop_processes.$sym86$BASIC_SUBLOOP_PROCESS_SET_OWNER_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)subloop_processes.$sym87$NOTHING_TO_DO_, (SubLObject)subloop_processes.$sym10$BASIC_SUBLOOP_PROCESS, (SubLObject)subloop_processes.$list30, (SubLObject)subloop_processes.NIL, (SubLObject)subloop_processes.$list70);
        methods.subloop_register_instance_method((SubLObject)subloop_processes.$sym10$BASIC_SUBLOOP_PROCESS, (SubLObject)subloop_processes.$sym87$NOTHING_TO_DO_, (SubLObject)subloop_processes.$sym88$BASIC_SUBLOOP_PROCESS_NOTHING_TO_DO__METHOD);
        methods.methods_incorporate_instance_method((SubLObject)subloop_processes.$sym89$ENQUEUE_NOTIFY, (SubLObject)subloop_processes.$sym10$BASIC_SUBLOOP_PROCESS, (SubLObject)subloop_processes.$list59, (SubLObject)subloop_processes.$list90, (SubLObject)subloop_processes.$list91);
        methods.subloop_register_instance_method((SubLObject)subloop_processes.$sym10$BASIC_SUBLOOP_PROCESS, (SubLObject)subloop_processes.$sym89$ENQUEUE_NOTIFY, (SubLObject)subloop_processes.$sym92$BASIC_SUBLOOP_PROCESS_ENQUEUE_NOTIFY_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)subloop_processes.$sym93$DEQUEUE_NOTIFY, (SubLObject)subloop_processes.$sym10$BASIC_SUBLOOP_PROCESS, (SubLObject)subloop_processes.$list59, (SubLObject)subloop_processes.$list90, (SubLObject)subloop_processes.$list94);
        methods.subloop_register_instance_method((SubLObject)subloop_processes.$sym10$BASIC_SUBLOOP_PROCESS, (SubLObject)subloop_processes.$sym93$DEQUEUE_NOTIFY, (SubLObject)subloop_processes.$sym95$BASIC_SUBLOOP_PROCESS_DEQUEUE_NOTIFY_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)subloop_processes.$sym96$REMOVE_NOTIFY, (SubLObject)subloop_processes.$sym10$BASIC_SUBLOOP_PROCESS, (SubLObject)subloop_processes.$list30, (SubLObject)subloop_processes.$list90, (SubLObject)subloop_processes.$list97);
        methods.subloop_register_instance_method((SubLObject)subloop_processes.$sym10$BASIC_SUBLOOP_PROCESS, (SubLObject)subloop_processes.$sym96$REMOVE_NOTIFY, (SubLObject)subloop_processes.$sym98$BASIC_SUBLOOP_PROCESS_REMOVE_NOTIFY_METHOD);
        interfaces.new_interface((SubLObject)subloop_processes.$sym99$MULTI_TASK_SCHEDULER, (SubLObject)subloop_processes.NIL, (SubLObject)subloop_processes.NIL, (SubLObject)subloop_processes.$list100);
        classes.subloop_new_class((SubLObject)subloop_processes.$sym101$BASIC_MULTI_TASK_SCHEDULER, (SubLObject)subloop_processes.$sym11$OBJECT, (SubLObject)subloop_processes.$list102, (SubLObject)subloop_processes.NIL, (SubLObject)subloop_processes.$list103);
        classes.class_set_implements_slot_listeners((SubLObject)subloop_processes.$sym101$BASIC_MULTI_TASK_SCHEDULER, (SubLObject)subloop_processes.NIL);
        classes.subloop_note_class_initialization_function((SubLObject)subloop_processes.$sym101$BASIC_MULTI_TASK_SCHEDULER, (SubLObject)subloop_processes.$sym110$SUBLOOP_RESERVED_INITIALIZE_BASIC_MULTI_TASK_SCHEDULER_CLASS);
        classes.subloop_note_instance_initialization_function((SubLObject)subloop_processes.$sym101$BASIC_MULTI_TASK_SCHEDULER, (SubLObject)subloop_processes.$sym111$SUBLOOP_RESERVED_INITIALIZE_BASIC_MULTI_TASK_SCHEDULER_INSTANCE);
        subloop_reserved_initialize_basic_multi_task_scheduler_class((SubLObject)subloop_processes.$sym101$BASIC_MULTI_TASK_SCHEDULER);
        methods.methods_incorporate_instance_method((SubLObject)subloop_processes.$sym23$INITIALIZE, (SubLObject)subloop_processes.$sym101$BASIC_MULTI_TASK_SCHEDULER, (SubLObject)subloop_processes.$list24, (SubLObject)subloop_processes.NIL, (SubLObject)subloop_processes.$list112);
        methods.subloop_register_instance_method((SubLObject)subloop_processes.$sym101$BASIC_MULTI_TASK_SCHEDULER, (SubLObject)subloop_processes.$sym23$INITIALIZE, (SubLObject)subloop_processes.$sym115$BASIC_MULTI_TASK_SCHEDULER_INITIALIZE_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)subloop_processes.$sym116$HALT, (SubLObject)subloop_processes.$sym101$BASIC_MULTI_TASK_SCHEDULER, (SubLObject)subloop_processes.$list30, (SubLObject)subloop_processes.NIL, (SubLObject)subloop_processes.$list117);
        methods.subloop_register_instance_method((SubLObject)subloop_processes.$sym101$BASIC_MULTI_TASK_SCHEDULER, (SubLObject)subloop_processes.$sym116$HALT, (SubLObject)subloop_processes.$sym119$BASIC_MULTI_TASK_SCHEDULER_HALT_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)subloop_processes.$sym120$START, (SubLObject)subloop_processes.$sym101$BASIC_MULTI_TASK_SCHEDULER, (SubLObject)subloop_processes.$list30, (SubLObject)subloop_processes.NIL, (SubLObject)subloop_processes.$list121);
        methods.subloop_register_instance_method((SubLObject)subloop_processes.$sym101$BASIC_MULTI_TASK_SCHEDULER, (SubLObject)subloop_processes.$sym120$START, (SubLObject)subloop_processes.$sym123$BASIC_MULTI_TASK_SCHEDULER_START_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)subloop_processes.$sym124$ADD_TASK, (SubLObject)subloop_processes.$sym101$BASIC_MULTI_TASK_SCHEDULER, (SubLObject)subloop_processes.$list30, (SubLObject)subloop_processes.$list125, (SubLObject)subloop_processes.$list126);
        methods.subloop_register_instance_method((SubLObject)subloop_processes.$sym101$BASIC_MULTI_TASK_SCHEDULER, (SubLObject)subloop_processes.$sym124$ADD_TASK, (SubLObject)subloop_processes.$sym129$BASIC_MULTI_TASK_SCHEDULER_ADD_TASK_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)subloop_processes.$sym130$KILL_TASK, (SubLObject)subloop_processes.$sym101$BASIC_MULTI_TASK_SCHEDULER, (SubLObject)subloop_processes.$list37, (SubLObject)subloop_processes.$list125, (SubLObject)subloop_processes.$list131);
        methods.subloop_register_instance_method((SubLObject)subloop_processes.$sym101$BASIC_MULTI_TASK_SCHEDULER, (SubLObject)subloop_processes.$sym130$KILL_TASK, (SubLObject)subloop_processes.$sym133$BASIC_MULTI_TASK_SCHEDULER_KILL_TASK_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)subloop_processes.$sym134$KILL_TASK_BY_NAME, (SubLObject)subloop_processes.$sym101$BASIC_MULTI_TASK_SCHEDULER, (SubLObject)subloop_processes.$list37, (SubLObject)subloop_processes.$list135, (SubLObject)subloop_processes.$list136);
        methods.subloop_register_instance_method((SubLObject)subloop_processes.$sym101$BASIC_MULTI_TASK_SCHEDULER, (SubLObject)subloop_processes.$sym134$KILL_TASK_BY_NAME, (SubLObject)subloop_processes.$sym137$BASIC_MULTI_TASK_SCHEDULER_KILL_TASK_BY_NAME_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)subloop_processes.$sym138$INTERRUPT_TASK, (SubLObject)subloop_processes.$sym101$BASIC_MULTI_TASK_SCHEDULER, (SubLObject)subloop_processes.$list37, (SubLObject)subloop_processes.$list125, (SubLObject)subloop_processes.$list139);
        methods.subloop_register_instance_method((SubLObject)subloop_processes.$sym101$BASIC_MULTI_TASK_SCHEDULER, (SubLObject)subloop_processes.$sym138$INTERRUPT_TASK, (SubLObject)subloop_processes.$sym141$BASIC_MULTI_TASK_SCHEDULER_INTERRUPT_TASK_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)subloop_processes.$sym142$INTERRUPT_TASK_BY_NAME, (SubLObject)subloop_processes.$sym101$BASIC_MULTI_TASK_SCHEDULER, (SubLObject)subloop_processes.$list37, (SubLObject)subloop_processes.$list135, (SubLObject)subloop_processes.$list143);
        methods.subloop_register_instance_method((SubLObject)subloop_processes.$sym101$BASIC_MULTI_TASK_SCHEDULER, (SubLObject)subloop_processes.$sym142$INTERRUPT_TASK_BY_NAME, (SubLObject)subloop_processes.$sym144$BASIC_MULTI_TASK_SCHEDULER_INTERRUPT_TASK_BY_NAME_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)subloop_processes.$sym145$GET_ALL_TASKS, (SubLObject)subloop_processes.$sym101$BASIC_MULTI_TASK_SCHEDULER, (SubLObject)subloop_processes.$list37, (SubLObject)subloop_processes.NIL, (SubLObject)subloop_processes.$list146);
        methods.subloop_register_instance_method((SubLObject)subloop_processes.$sym101$BASIC_MULTI_TASK_SCHEDULER, (SubLObject)subloop_processes.$sym145$GET_ALL_TASKS, (SubLObject)subloop_processes.$sym147$BASIC_MULTI_TASK_SCHEDULER_GET_ALL_TASKS_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)subloop_processes.$sym148$KILL_ALL_TASKS, (SubLObject)subloop_processes.$sym101$BASIC_MULTI_TASK_SCHEDULER, (SubLObject)subloop_processes.$list37, (SubLObject)subloop_processes.NIL, (SubLObject)subloop_processes.$list149);
        methods.subloop_register_instance_method((SubLObject)subloop_processes.$sym101$BASIC_MULTI_TASK_SCHEDULER, (SubLObject)subloop_processes.$sym148$KILL_ALL_TASKS, (SubLObject)subloop_processes.$sym150$BASIC_MULTI_TASK_SCHEDULER_KILL_ALL_TASKS_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)subloop_processes.$sym58$RUN, (SubLObject)subloop_processes.$sym101$BASIC_MULTI_TASK_SCHEDULER, (SubLObject)subloop_processes.$list59, (SubLObject)subloop_processes.$list151, (SubLObject)subloop_processes.$list152);
        methods.subloop_register_instance_method((SubLObject)subloop_processes.$sym101$BASIC_MULTI_TASK_SCHEDULER, (SubLObject)subloop_processes.$sym58$RUN, (SubLObject)subloop_processes.$sym157$BASIC_MULTI_TASK_SCHEDULER_RUN_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)subloop_processes.$sym158$GET_TRACE_MODE, (SubLObject)subloop_processes.$sym101$BASIC_MULTI_TASK_SCHEDULER, (SubLObject)subloop_processes.$list37, (SubLObject)subloop_processes.NIL, (SubLObject)subloop_processes.$list159);
        methods.subloop_register_instance_method((SubLObject)subloop_processes.$sym101$BASIC_MULTI_TASK_SCHEDULER, (SubLObject)subloop_processes.$sym158$GET_TRACE_MODE, (SubLObject)subloop_processes.$sym160$BASIC_MULTI_TASK_SCHEDULER_GET_TRACE_MODE_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)subloop_processes.$sym161$SET_TRACE_MODE, (SubLObject)subloop_processes.$sym101$BASIC_MULTI_TASK_SCHEDULER, (SubLObject)subloop_processes.$list30, (SubLObject)subloop_processes.$list162, (SubLObject)subloop_processes.$list163);
        methods.subloop_register_instance_method((SubLObject)subloop_processes.$sym101$BASIC_MULTI_TASK_SCHEDULER, (SubLObject)subloop_processes.$sym161$SET_TRACE_MODE, (SubLObject)subloop_processes.$sym165$BASIC_MULTI_TASK_SCHEDULER_SET_TRACE_MODE_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)subloop_processes.$sym154$PERFORM_TRACE, (SubLObject)subloop_processes.$sym101$BASIC_MULTI_TASK_SCHEDULER, (SubLObject)subloop_processes.$list30, (SubLObject)subloop_processes.$list166, (SubLObject)subloop_processes.$list167);
        methods.subloop_register_instance_method((SubLObject)subloop_processes.$sym101$BASIC_MULTI_TASK_SCHEDULER, (SubLObject)subloop_processes.$sym154$PERFORM_TRACE, (SubLObject)subloop_processes.$sym168$BASIC_MULTI_TASK_SCHEDULER_PERFORM_TRACE_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)subloop_processes.$sym87$NOTHING_TO_DO_, (SubLObject)subloop_processes.$sym101$BASIC_MULTI_TASK_SCHEDULER, (SubLObject)subloop_processes.$list30, (SubLObject)subloop_processes.NIL, (SubLObject)subloop_processes.$list169);
        methods.subloop_register_instance_method((SubLObject)subloop_processes.$sym101$BASIC_MULTI_TASK_SCHEDULER, (SubLObject)subloop_processes.$sym87$NOTHING_TO_DO_, (SubLObject)subloop_processes.$sym171$BASIC_MULTI_TASK_SCHEDULER_NOTHING_TO_DO__METHOD);
        methods.methods_incorporate_instance_method((SubLObject)subloop_processes.$sym156$ON_NOTHING_TO_DO, (SubLObject)subloop_processes.$sym101$BASIC_MULTI_TASK_SCHEDULER, (SubLObject)subloop_processes.$list30, (SubLObject)subloop_processes.NIL, (SubLObject)subloop_processes.$list70);
        methods.subloop_register_instance_method((SubLObject)subloop_processes.$sym101$BASIC_MULTI_TASK_SCHEDULER, (SubLObject)subloop_processes.$sym156$ON_NOTHING_TO_DO, (SubLObject)subloop_processes.$sym172$BASIC_MULTI_TASK_SCHEDULER_ON_NOTHING_TO_DO_METHOD);
        return (SubLObject)subloop_processes.NIL;
    }
    
    public void declareFunctions() {
        declare_subloop_processes_file();
    }
    
    public void initializeVariables() {
        init_subloop_processes_file();
    }
    
    public void runTopLevelForms() {
        setup_subloop_processes_file();
    }
    
    static {
        me = (SubLFile)new subloop_processes();
        subloop_processes.$valid_subloop_process_status_types$ = null;
        $list0 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("UNKNOWN"), (SubLObject)SubLObjectFactory.makeKeyword("ACTIVE"), (SubLObject)SubLObjectFactory.makeKeyword("SUSPENDED"), (SubLObject)SubLObjectFactory.makeKeyword("DEAD"));
        $sym1$SUBLOOP_PROCESS_STATUS_TYPE = SubLObjectFactory.makeSymbol("SUBLOOP-PROCESS-STATUS-TYPE");
        $str2$_S___S_is_not_a_member_of_the__S_ = SubLObjectFactory.makeString("~S: ~S is not a member of the ~S enumeration.");
        $sym3$ENCODE_SUBLOOP_PROCESS_STATUS_TYPE = SubLObjectFactory.makeSymbol("ENCODE-SUBLOOP-PROCESS-STATUS-TYPE");
        $str4$_S___S_is_not_a_valid_encoding_of = SubLObjectFactory.makeString("~S: ~S is not a valid encoding of the ~S enumeration.");
        $sym5$DECODE_SUBLOOP_PROCESS_STATUS_TYPE = SubLObjectFactory.makeSymbol("DECODE-SUBLOOP-PROCESS-STATUS-TYPE");
        $str6$_S___S_was_expected_to_be_a_membe = SubLObjectFactory.makeString("~S: ~S was expected to be a member of the enumeration ~S.");
        $sym7$SUBLOOP_PROCESS_STATUS_TYPE_P = SubLObjectFactory.makeSymbol("SUBLOOP-PROCESS-STATUS-TYPE-P");
        $sym8$SUBLOOP_PROCESS = SubLObjectFactory.makeSymbol("SUBLOOP-PROCESS");
        $list9 = ConsesLow.list(new SubLObject[] { ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("GET-NAME"), (SubLObject)subloop_processes.NIL, (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("SET-NAME"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NEW-NAME")), (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("GET-PRIORITY"), (SubLObject)subloop_processes.NIL, (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("SET-PRIORITY"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NEW-PRIORITY")), (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("GET-STATUS"), (SubLObject)subloop_processes.NIL, (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("RUN"), (SubLObject)subloop_processes.NIL, (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("RUN-INTERNAL"), (SubLObject)subloop_processes.NIL, (SubLObject)SubLObjectFactory.makeKeyword("PROTECTED")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("SUSPEND"), (SubLObject)subloop_processes.NIL, (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("KILL"), (SubLObject)subloop_processes.NIL, (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("GET-OWNER"), (SubLObject)subloop_processes.NIL, (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("SET-OWNER"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NEW-SCHEDULER")), (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("NOTHING-TO-DO?"), (SubLObject)subloop_processes.NIL, (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")) });
        $sym10$BASIC_SUBLOOP_PROCESS = SubLObjectFactory.makeSymbol("BASIC-SUBLOOP-PROCESS");
        $sym11$OBJECT = SubLObjectFactory.makeSymbol("OBJECT");
        $list12 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SUBLOOP-PROCESS"), (SubLObject)SubLObjectFactory.makeSymbol("QUEUE-ELEMENT-INTERFACE"));
        $list13 = ConsesLow.list(new SubLObject[] { ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NAME"), (SubLObject)SubLObjectFactory.makeKeyword("INSTANCE"), (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PRIORITY"), (SubLObject)SubLObjectFactory.makeKeyword("INSTANCE"), (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("STATUS"), (SubLObject)SubLObjectFactory.makeKeyword("INSTANCE"), (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("OWNER"), (SubLObject)SubLObjectFactory.makeKeyword("INSTANCE"), (SubLObject)SubLObjectFactory.makeKeyword("PROTECTED")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("INITIALIZE"), (SubLObject)subloop_processes.NIL, (SubLObject)SubLObjectFactory.makeKeyword("PROTECTED")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("PRINT"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("STREAM"), (SubLObject)SubLObjectFactory.makeSymbol("DEPTH")), (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("GET-NAME"), (SubLObject)subloop_processes.NIL, (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("SET-NAME"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NEW-NAME")), (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("GET-PRIORITY"), (SubLObject)subloop_processes.NIL, (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("SET-PRIORITY"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NEW-PRIORITY")), (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("GET-STATUS"), (SubLObject)subloop_processes.NIL, (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("RUN"), (SubLObject)subloop_processes.NIL, (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("RUN-INTERNAL"), (SubLObject)subloop_processes.NIL, (SubLObject)SubLObjectFactory.makeKeyword("PROTECTED")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("SUSPEND"), (SubLObject)subloop_processes.NIL, (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("KILL"), (SubLObject)subloop_processes.NIL, (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("GET-OWNER"), (SubLObject)subloop_processes.NIL, (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("SET-OWNER"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NEW-SCHEDULER")), (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("NOTHING-TO-DO?"), (SubLObject)subloop_processes.NIL, (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("ENQUEUE-NOTIFY"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUEUE")), (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("DEQUEUE-NOTIFY"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUEUE")), (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("REMOVE-NOTIFY"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUEUE")), (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")) });
        $sym14$OWNER = SubLObjectFactory.makeSymbol("OWNER");
        $sym15$INSTANCE_COUNT = SubLObjectFactory.makeSymbol("INSTANCE-COUNT");
        $sym16$SUBLOOP_RESERVED_INITIALIZE_BASIC_SUBLOOP_PROCESS_CLASS = SubLObjectFactory.makeSymbol("SUBLOOP-RESERVED-INITIALIZE-BASIC-SUBLOOP-PROCESS-CLASS");
        $sym17$ISOLATED_P = SubLObjectFactory.makeSymbol("ISOLATED-P");
        $sym18$INSTANCE_NUMBER = SubLObjectFactory.makeSymbol("INSTANCE-NUMBER");
        $sym19$NAME = SubLObjectFactory.makeSymbol("NAME");
        $sym20$PRIORITY = SubLObjectFactory.makeSymbol("PRIORITY");
        $sym21$STATUS = SubLObjectFactory.makeSymbol("STATUS");
        $sym22$SUBLOOP_RESERVED_INITIALIZE_BASIC_SUBLOOP_PROCESS_INSTANCE = SubLObjectFactory.makeSymbol("SUBLOOP-RESERVED-INITIALIZE-BASIC-SUBLOOP-PROCESS-INSTANCE");
        $sym23$INITIALIZE = SubLObjectFactory.makeSymbol("INITIALIZE");
        $list24 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("PROTECTED"));
        $list25 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("INITIALIZE"), (SubLObject)SubLObjectFactory.makeSymbol("SUPER")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("NAME"), (SubLObject)subloop_processes.NIL), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("PRIORITY"), (SubLObject)subloop_processes.ZERO_INTEGER), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("STATUS"), (SubLObject)SubLObjectFactory.makeKeyword("UNKNOWN")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("SELF")));
        $sym26$OUTER_CATCH_FOR_BASIC_SUBLOOP_PROCESS_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-BASIC-SUBLOOP-PROCESS-METHOD");
        $kw27$UNKNOWN = SubLObjectFactory.makeKeyword("UNKNOWN");
        $sym28$BASIC_SUBLOOP_PROCESS_INITIALIZE_METHOD = SubLObjectFactory.makeSymbol("BASIC-SUBLOOP-PROCESS-INITIALIZE-METHOD");
        $sym29$PRINT = SubLObjectFactory.makeSymbol("PRINT");
        $list30 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("PUBLIC"));
        $list31 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("STREAM"), (SubLObject)SubLObjectFactory.makeSymbol("DEPTH"));
        $list32 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("IGNORE"), (SubLObject)SubLObjectFactory.makeSymbol("DEPTH")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FORMAT"), (SubLObject)SubLObjectFactory.makeSymbol("STREAM"), (SubLObject)SubLObjectFactory.makeString("#<BASIC-SUBLOOP-PROCESS: ~S, ~S>"), (SubLObject)SubLObjectFactory.makeSymbol("NAME"), (SubLObject)SubLObjectFactory.makeSymbol("STATUS")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("SELF")));
        $sym33$OUTER_CATCH_FOR_BASIC_SUBLOOP_PROCESS_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-BASIC-SUBLOOP-PROCESS-METHOD");
        $str34$__BASIC_SUBLOOP_PROCESS___S___S_ = SubLObjectFactory.makeString("#<BASIC-SUBLOOP-PROCESS: ~S, ~S>");
        $sym35$BASIC_SUBLOOP_PROCESS_PRINT_METHOD = SubLObjectFactory.makeSymbol("BASIC-SUBLOOP-PROCESS-PRINT-METHOD");
        $sym36$GET_NAME = SubLObjectFactory.makeSymbol("GET-NAME");
        $list37 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("READ-ONLY"), (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC"));
        $list38 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("NAME")));
        $sym39$BASIC_SUBLOOP_PROCESS_GET_NAME_METHOD = SubLObjectFactory.makeSymbol("BASIC-SUBLOOP-PROCESS-GET-NAME-METHOD");
        $sym40$SET_NAME = SubLObjectFactory.makeSymbol("SET-NAME");
        $list41 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NEW-NAME"));
        $list42 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("MUST"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("COR"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NULL"), (SubLObject)SubLObjectFactory.makeSymbol("NEW-NAME")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("STRINGP"), (SubLObject)SubLObjectFactory.makeSymbol("NEW-NAME"))), (SubLObject)SubLObjectFactory.makeString("(SET-NAME ~S): ~S is not a valid name.  A string or NIL was expected."), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)SubLObjectFactory.makeSymbol("NEW-NAME")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("NAME"), (SubLObject)SubLObjectFactory.makeSymbol("NEW-NAME")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("NEW-NAME")));
        $sym43$OUTER_CATCH_FOR_BASIC_SUBLOOP_PROCESS_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-BASIC-SUBLOOP-PROCESS-METHOD");
        $str44$_SET_NAME__S____S_is_not_a_valid_ = SubLObjectFactory.makeString("(SET-NAME ~S): ~S is not a valid name.  A string or NIL was expected.");
        $sym45$BASIC_SUBLOOP_PROCESS_SET_NAME_METHOD = SubLObjectFactory.makeSymbol("BASIC-SUBLOOP-PROCESS-SET-NAME-METHOD");
        $sym46$GET_PRIORITY = SubLObjectFactory.makeSymbol("GET-PRIORITY");
        $list47 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("PRIORITY")));
        $sym48$BASIC_SUBLOOP_PROCESS_GET_PRIORITY_METHOD = SubLObjectFactory.makeSymbol("BASIC-SUBLOOP-PROCESS-GET-PRIORITY-METHOD");
        $sym49$SET_PRIORITY = SubLObjectFactory.makeSymbol("SET-PRIORITY");
        $list50 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NEW-PRIORITY"));
        $list51 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("MUST"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CAND"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("INTEGERP"), (SubLObject)SubLObjectFactory.makeSymbol("NEW-PRIORITY")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol(">="), (SubLObject)SubLObjectFactory.makeSymbol("NEW-PRIORITY"), (SubLObject)subloop_processes.ZERO_INTEGER)), (SubLObject)SubLObjectFactory.makeString("(SET-PRIORITY ~S): ~S is not a valid priority.  A non negative integer was expected."), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)SubLObjectFactory.makeSymbol("NEW-PRIORITY")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("PRIORITY"), (SubLObject)SubLObjectFactory.makeSymbol("NEW-PRIORITY")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("NEW-PRIORITY")));
        $sym52$OUTER_CATCH_FOR_BASIC_SUBLOOP_PROCESS_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-BASIC-SUBLOOP-PROCESS-METHOD");
        $str53$_SET_PRIORITY__S____S_is_not_a_va = SubLObjectFactory.makeString("(SET-PRIORITY ~S): ~S is not a valid priority.  A non negative integer was expected.");
        $sym54$BASIC_SUBLOOP_PROCESS_SET_PRIORITY_METHOD = SubLObjectFactory.makeSymbol("BASIC-SUBLOOP-PROCESS-SET-PRIORITY-METHOD");
        $sym55$GET_STATUS = SubLObjectFactory.makeSymbol("GET-STATUS");
        $list56 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("STATUS")));
        $sym57$BASIC_SUBLOOP_PROCESS_GET_STATUS_METHOD = SubLObjectFactory.makeSymbol("BASIC-SUBLOOP-PROCESS-GET-STATUS-METHOD");
        $sym58$RUN = SubLObjectFactory.makeSymbol("RUN");
        $list59 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("NO-MEMBER-VARIABLES"), (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC"));
        $list60 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RESULT"), (SubLObject)SubLObjectFactory.makeKeyword("ERROR"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CUNWIND-PROTECT"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PROGN"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("INLINE-SET-SLOT"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("STATUS"), (SubLObject)SubLObjectFactory.makeSymbol("BASIC-SUBLOOP-PROCESS")), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)SubLObjectFactory.makeKeyword("ACTIVE")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("RESULT"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FUNCALL-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("RUN-INTERNAL")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PIF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("COR"), (SubLObject)ConsesLow.list((SubLObject)subloop_processes.EQ, (SubLObject)SubLObjectFactory.makeSymbol("RESULT"), (SubLObject)SubLObjectFactory.makeKeyword("TERMINATED")), (SubLObject)ConsesLow.list((SubLObject)subloop_processes.EQ, (SubLObject)SubLObjectFactory.makeSymbol("RESULT"), (SubLObject)SubLObjectFactory.makeKeyword("KILLED")), (SubLObject)ConsesLow.list((SubLObject)subloop_processes.EQ, (SubLObject)SubLObjectFactory.makeSymbol("RESULT"), (SubLObject)SubLObjectFactory.makeKeyword("ERROR"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("INLINE-SET-SLOT"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("STATUS"), (SubLObject)SubLObjectFactory.makeSymbol("BASIC-SUBLOOP-PROCESS")), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)SubLObjectFactory.makeKeyword("DEAD")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("INLINE-SET-SLOT"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("STATUS"), (SubLObject)SubLObjectFactory.makeSymbol("BASIC-SUBLOOP-PROCESS")), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)SubLObjectFactory.makeKeyword("SUSPENDED")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("INLINE-SET-SLOT"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("STATUS"), (SubLObject)SubLObjectFactory.makeSymbol("BASIC-SUBLOOP-PROCESS")), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)SubLObjectFactory.makeKeyword("ERROR"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("RESULT"))));
        $kw61$ERROR = SubLObjectFactory.makeKeyword("ERROR");
        $kw62$ACTIVE = SubLObjectFactory.makeKeyword("ACTIVE");
        $sym63$RUN_INTERNAL = SubLObjectFactory.makeSymbol("RUN-INTERNAL");
        $kw64$TERMINATED = SubLObjectFactory.makeKeyword("TERMINATED");
        $kw65$KILLED = SubLObjectFactory.makeKeyword("KILLED");
        $kw66$DEAD = SubLObjectFactory.makeKeyword("DEAD");
        $kw67$SUSPENDED = SubLObjectFactory.makeKeyword("SUSPENDED");
        $sym68$BASIC_SUBLOOP_PROCESS_RUN_METHOD = SubLObjectFactory.makeSymbol("BASIC-SUBLOOP-PROCESS-RUN-METHOD");
        $list69 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("NO-MEMBER-VARIABLES"), (SubLObject)SubLObjectFactory.makeKeyword("PROTECTED"));
        $list70 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)subloop_processes.NIL));
        $sym71$BASIC_SUBLOOP_PROCESS_RUN_INTERNAL_METHOD = SubLObjectFactory.makeSymbol("BASIC-SUBLOOP-PROCESS-RUN-INTERNAL-METHOD");
        $sym72$SUSPEND = SubLObjectFactory.makeSymbol("SUSPEND");
        $list73 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("STATUS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("INLINE-GET-SLOT"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("STATUS"), (SubLObject)SubLObjectFactory.makeSymbol("BASIC-SUBLOOP-PROCESS")), (SubLObject)SubLObjectFactory.makeSymbol("SELF")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PCASE"), (SubLObject)SubLObjectFactory.makeSymbol("STATUS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("DEAD"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("STATUS"))))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("INLINE-SET-SLOT"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("STATUS"), (SubLObject)SubLObjectFactory.makeSymbol("BASIC-SUBLOOP-PROCESS")), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)SubLObjectFactory.makeKeyword("SUSPENDED")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("OWNER"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("INLINE-GET-SLOT"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("OWNER"), (SubLObject)SubLObjectFactory.makeSymbol("BASIC-SUBLOOP-PROCESS")), (SubLObject)SubLObjectFactory.makeSymbol("SELF")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PWHEN"), (SubLObject)SubLObjectFactory.makeSymbol("OWNER"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("INLINE-METHOD"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("REMOVE"), (SubLObject)SubLObjectFactory.makeSymbol("BASIC-DOUBLY-LINKED-QUEUE")), (SubLObject)SubLObjectFactory.makeSymbol("OWNER"), (SubLObject)SubLObjectFactory.makeSymbol("SELF")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)subloop_processes.NIL));
        $sym74$BASIC_SUBLOOP_PROCESS_SUSPEND_METHOD = SubLObjectFactory.makeSymbol("BASIC-SUBLOOP-PROCESS-SUSPEND-METHOD");
        $sym75$KILL = SubLObjectFactory.makeSymbol("KILL");
        $list76 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("INLINE-SET-SLOT"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("STATUS"), (SubLObject)SubLObjectFactory.makeSymbol("BASIC-SUBLOOP-PROCESS")), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)SubLObjectFactory.makeKeyword("KILLED")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)subloop_processes.NIL));
        $sym77$BASIC_SUBLOOP_PROCESS_KILL_METHOD = SubLObjectFactory.makeSymbol("BASIC-SUBLOOP-PROCESS-KILL-METHOD");
        $sym78$GET_OWNER = SubLObjectFactory.makeSymbol("GET-OWNER");
        $list79 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("OWNER")));
        $sym80$BASIC_SUBLOOP_PROCESS_GET_OWNER_METHOD = SubLObjectFactory.makeSymbol("BASIC-SUBLOOP-PROCESS-GET-OWNER-METHOD");
        $sym81$SET_OWNER = SubLObjectFactory.makeSymbol("SET-OWNER");
        $list82 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NEW-SCHEDULER"));
        $list83 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("MUST"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("COR"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NULL"), (SubLObject)SubLObjectFactory.makeSymbol("NEW-SCHEDULER")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("MULTI-TASK-SCHEDULER-P"), (SubLObject)SubLObjectFactory.makeSymbol("NEW-SCHEDULER"))), (SubLObject)SubLObjectFactory.makeString("(SET-OWNER ~S): ~S is not an instance of MULTI-TASK-SCHEDULER."), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)SubLObjectFactory.makeSymbol("NEW-SCHEDULER")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("OWNER"), (SubLObject)SubLObjectFactory.makeSymbol("NEW-SCHEDULER")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("NEW-SCHEDULER")));
        $sym84$OUTER_CATCH_FOR_BASIC_SUBLOOP_PROCESS_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-BASIC-SUBLOOP-PROCESS-METHOD");
        $str85$_SET_OWNER__S____S_is_not_an_inst = SubLObjectFactory.makeString("(SET-OWNER ~S): ~S is not an instance of MULTI-TASK-SCHEDULER.");
        $sym86$BASIC_SUBLOOP_PROCESS_SET_OWNER_METHOD = SubLObjectFactory.makeSymbol("BASIC-SUBLOOP-PROCESS-SET-OWNER-METHOD");
        $sym87$NOTHING_TO_DO_ = SubLObjectFactory.makeSymbol("NOTHING-TO-DO?");
        $sym88$BASIC_SUBLOOP_PROCESS_NOTHING_TO_DO__METHOD = SubLObjectFactory.makeSymbol("BASIC-SUBLOOP-PROCESS-NOTHING-TO-DO?-METHOD");
        $sym89$ENQUEUE_NOTIFY = SubLObjectFactory.makeSymbol("ENQUEUE-NOTIFY");
        $list90 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUEUE"));
        $list91 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("IGNORE"), (SubLObject)SubLObjectFactory.makeSymbol("QUEUE")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)subloop_processes.NIL));
        $sym92$BASIC_SUBLOOP_PROCESS_ENQUEUE_NOTIFY_METHOD = SubLObjectFactory.makeSymbol("BASIC-SUBLOOP-PROCESS-ENQUEUE-NOTIFY-METHOD");
        $sym93$DEQUEUE_NOTIFY = SubLObjectFactory.makeSymbol("DEQUEUE-NOTIFY");
        $list94 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("IGNORE"), (SubLObject)SubLObjectFactory.makeSymbol("QUEUE")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("STATUS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("INLINE-GET-SLOT"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("STATUS"), (SubLObject)SubLObjectFactory.makeSymbol("BASIC-SUBLOOP-PROCESS")), (SubLObject)SubLObjectFactory.makeSymbol("SELF")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PWHEN"), (SubLObject)ConsesLow.list((SubLObject)subloop_processes.EQ, (SubLObject)SubLObjectFactory.makeSymbol("STATUS"), (SubLObject)SubLObjectFactory.makeKeyword("DEAD")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)subloop_processes.NIL))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RESULT"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RUN"), (SubLObject)SubLObjectFactory.makeSymbol("SELF")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PWHEN"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("COR"), (SubLObject)ConsesLow.list((SubLObject)subloop_processes.EQ, (SubLObject)SubLObjectFactory.makeSymbol("RESULT"), (SubLObject)SubLObjectFactory.makeKeyword("TERMINATED")), (SubLObject)ConsesLow.list((SubLObject)subloop_processes.EQ, (SubLObject)SubLObjectFactory.makeSymbol("RESULT"), (SubLObject)SubLObjectFactory.makeKeyword("KILLED")), (SubLObject)ConsesLow.list((SubLObject)subloop_processes.EQ, (SubLObject)SubLObjectFactory.makeSymbol("RESULT"), (SubLObject)SubLObjectFactory.makeKeyword("ERROR"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("KILL"), (SubLObject)SubLObjectFactory.makeSymbol("SELF")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)subloop_processes.NIL));
        $sym95$BASIC_SUBLOOP_PROCESS_DEQUEUE_NOTIFY_METHOD = SubLObjectFactory.makeSymbol("BASIC-SUBLOOP-PROCESS-DEQUEUE-NOTIFY-METHOD");
        $sym96$REMOVE_NOTIFY = SubLObjectFactory.makeSymbol("REMOVE-NOTIFY");
        $list97 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("IGNORE"), (SubLObject)SubLObjectFactory.makeSymbol("QUEUE")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("KILL"), (SubLObject)SubLObjectFactory.makeSymbol("SELF")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)subloop_processes.NIL));
        $sym98$BASIC_SUBLOOP_PROCESS_REMOVE_NOTIFY_METHOD = SubLObjectFactory.makeSymbol("BASIC-SUBLOOP-PROCESS-REMOVE-NOTIFY-METHOD");
        $sym99$MULTI_TASK_SCHEDULER = SubLObjectFactory.makeSymbol("MULTI-TASK-SCHEDULER");
        $list100 = ConsesLow.list(new SubLObject[] { ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("ADD-TASK"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SUBLOOP-PROCESS")), (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("KILL-TASK"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SUBLOOP-PROCESS")), (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("KILL-TASK-BY-NAME"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SUBLOOP-PROCESS-NAME")), (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("INTERRUPT-TASK"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SUBLOOP-PROCESS")), (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("INTERRUPT-TASK-BY-NAME"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SUBLOOP-PROCESS-NAME")), (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("GET-ALL-TASKS"), (SubLObject)subloop_processes.NIL, (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("KILL-ALL-TASKS"), (SubLObject)subloop_processes.NIL, (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("RUN"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("&OPTIONAL"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("EXPIRATION-DELTA"), (SubLObject)subloop_processes.NIL)), (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("GET-TRACE-MODE"), (SubLObject)subloop_processes.NIL, (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("SET-TRACE-MODE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NEW-TRACE-MODE")), (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("PERFORM-TRACE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PROCESS")), (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("NOTHING-TO-DO?"), (SubLObject)subloop_processes.NIL, (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")) });
        $sym101$BASIC_MULTI_TASK_SCHEDULER = SubLObjectFactory.makeSymbol("BASIC-MULTI-TASK-SCHEDULER");
        $list102 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("MULTI-TASK-SCHEDULER"));
        $list103 = ConsesLow.list(new SubLObject[] { ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TRANSFER-QUEUE"), (SubLObject)SubLObjectFactory.makeKeyword("INSTANCE"), (SubLObject)SubLObjectFactory.makeKeyword("PROTECTED")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PROCESS-QUEUE"), (SubLObject)SubLObjectFactory.makeKeyword("INSTANCE"), (SubLObject)SubLObjectFactory.makeKeyword("PROTECTED")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("HALTED-P"), (SubLObject)SubLObjectFactory.makeKeyword("BOOLEAN"), (SubLObject)SubLObjectFactory.makeKeyword("INSTANCE"), (SubLObject)SubLObjectFactory.makeKeyword("PROTECTED")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TRACE-P"), (SubLObject)SubLObjectFactory.makeKeyword("BOOLEAN"), (SubLObject)SubLObjectFactory.makeKeyword("INSTANCE"), (SubLObject)SubLObjectFactory.makeKeyword("PROTECTED")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("INITIALIZE"), (SubLObject)subloop_processes.NIL, (SubLObject)SubLObjectFactory.makeKeyword("PROTECTED")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("HALT"), (SubLObject)subloop_processes.NIL, (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("START"), (SubLObject)subloop_processes.NIL, (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("ADD-TASK"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SUBLOOP-PROCESS")), (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("KILL-TASK"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SUBLOOP-PROCESS")), (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("KILL-TASK-BY-NAME"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SUBLOOP-PROCESS-NAME")), (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("INTERRUPT-TASK"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SUBLOOP-PROCESS")), (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("INTERRUPT-TASK-BY-NAME"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SUBLOOP-PROCESS-NAME")), (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("GET-ALL-TASKS"), (SubLObject)subloop_processes.NIL, (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("KILL-ALL-TASKS"), (SubLObject)subloop_processes.NIL, (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("RUN"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("&OPTIONAL"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("EXPIRATION-DELTA"), (SubLObject)subloop_processes.NIL)), (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("GET-TRACE-MODE"), (SubLObject)subloop_processes.NIL, (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("SET-TRACE-MODE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NEW-TRACE-MODE")), (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("PERFORM-TRACE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PROCESS")), (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("NOTHING-TO-DO?"), (SubLObject)subloop_processes.NIL, (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("ON-NOTHING-TO-DO"), (SubLObject)subloop_processes.NIL, (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")) });
        $sym104$PROCESS_QUEUE = SubLObjectFactory.makeSymbol("PROCESS-QUEUE");
        $sym105$TRANSFER_QUEUE = SubLObjectFactory.makeSymbol("TRANSFER-QUEUE");
        $sym106$TRACE_P = SubLObjectFactory.makeSymbol("TRACE-P");
        $int107$4098 = SubLObjectFactory.makeInteger(4098);
        $sym108$HALTED_P = SubLObjectFactory.makeSymbol("HALTED-P");
        $int109$4097 = SubLObjectFactory.makeInteger(4097);
        $sym110$SUBLOOP_RESERVED_INITIALIZE_BASIC_MULTI_TASK_SCHEDULER_CLASS = SubLObjectFactory.makeSymbol("SUBLOOP-RESERVED-INITIALIZE-BASIC-MULTI-TASK-SCHEDULER-CLASS");
        $sym111$SUBLOOP_RESERVED_INITIALIZE_BASIC_MULTI_TASK_SCHEDULER_INSTANCE = SubLObjectFactory.makeSymbol("SUBLOOP-RESERVED-INITIALIZE-BASIC-MULTI-TASK-SCHEDULER-INSTANCE");
        $list112 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("INITIALIZE"), (SubLObject)SubLObjectFactory.makeSymbol("SUPER")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("TRANSFER-QUEUE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NEW-CLASS-INSTANCE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("BASIC-DOUBLY-LINKED-QUEUE")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("INLINE-METHOD"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SET-PASSIVE"), (SubLObject)SubLObjectFactory.makeSymbol("BASIC-DOUBLY-LINKED-QUEUE")), (SubLObject)SubLObjectFactory.makeSymbol("TRANSFER-QUEUE"), (SubLObject)subloop_processes.T), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("PROCESS-QUEUE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NEW-CLASS-INSTANCE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("BASIC-DOUBLY-LINKED-QUEUE")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("HALTED-P"), (SubLObject)subloop_processes.T), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("TRACE-P"), (SubLObject)subloop_processes.NIL), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)subloop_processes.NIL));
        $sym113$OUTER_CATCH_FOR_BASIC_MULTI_TASK_SCHEDULER_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-BASIC-MULTI-TASK-SCHEDULER-METHOD");
        $sym114$BASIC_DOUBLY_LINKED_QUEUE = SubLObjectFactory.makeSymbol("BASIC-DOUBLY-LINKED-QUEUE");
        $sym115$BASIC_MULTI_TASK_SCHEDULER_INITIALIZE_METHOD = SubLObjectFactory.makeSymbol("BASIC-MULTI-TASK-SCHEDULER-INITIALIZE-METHOD");
        $sym116$HALT = SubLObjectFactory.makeSymbol("HALT");
        $list117 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("HALTED-P"), (SubLObject)subloop_processes.T), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)subloop_processes.T));
        $sym118$OUTER_CATCH_FOR_BASIC_MULTI_TASK_SCHEDULER_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-BASIC-MULTI-TASK-SCHEDULER-METHOD");
        $sym119$BASIC_MULTI_TASK_SCHEDULER_HALT_METHOD = SubLObjectFactory.makeSymbol("BASIC-MULTI-TASK-SCHEDULER-HALT-METHOD");
        $sym120$START = SubLObjectFactory.makeSymbol("START");
        $list121 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("HALTED-P"), (SubLObject)subloop_processes.NIL), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RUN"), (SubLObject)SubLObjectFactory.makeSymbol("SELF")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)subloop_processes.T));
        $sym122$OUTER_CATCH_FOR_BASIC_MULTI_TASK_SCHEDULER_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-BASIC-MULTI-TASK-SCHEDULER-METHOD");
        $sym123$BASIC_MULTI_TASK_SCHEDULER_START_METHOD = SubLObjectFactory.makeSymbol("BASIC-MULTI-TASK-SCHEDULER-START-METHOD");
        $sym124$ADD_TASK = SubLObjectFactory.makeSymbol("ADD-TASK");
        $list125 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SUBLOOP-PROCESS"));
        $list126 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("MUST"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SUBLOOP-PROCESS-P"), (SubLObject)SubLObjectFactory.makeSymbol("SUBLOOP-PROCESS")), (SubLObject)SubLObjectFactory.makeString("(ADD-TASK ~S): ~S is not a SubLOOP process."), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)SubLObjectFactory.makeSymbol("SUBLOOP-PROCESS")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("INLINE-METHOD"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ENQUEUE"), (SubLObject)SubLObjectFactory.makeSymbol("BASIC-DOUBLY-LINKED-QUEUE")), (SubLObject)SubLObjectFactory.makeSymbol("PROCESS-QUEUE"), (SubLObject)SubLObjectFactory.makeSymbol("SUBLOOP-PROCESS")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("SUBLOOP-PROCESS")));
        $sym127$OUTER_CATCH_FOR_BASIC_MULTI_TASK_SCHEDULER_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-BASIC-MULTI-TASK-SCHEDULER-METHOD");
        $str128$_ADD_TASK__S____S_is_not_a_SubLOO = SubLObjectFactory.makeString("(ADD-TASK ~S): ~S is not a SubLOOP process.");
        $sym129$BASIC_MULTI_TASK_SCHEDULER_ADD_TASK_METHOD = SubLObjectFactory.makeSymbol("BASIC-MULTI-TASK-SCHEDULER-ADD-TASK-METHOD");
        $sym130$KILL_TASK = SubLObjectFactory.makeSymbol("KILL-TASK");
        $list131 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("MUST"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SUBLOOP-PROCESS-P"), (SubLObject)SubLObjectFactory.makeSymbol("SUBLOOP-PROCESS")), (SubLObject)SubLObjectFactory.makeString("(KILL-TASK ~S): ~S is not a SubLOOP process."), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)SubLObjectFactory.makeSymbol("SUBLOOP-PROCESS")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PWHEN"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("INLINE-METHOD"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ENQUEUED-P"), (SubLObject)SubLObjectFactory.makeSymbol("BASIC-DOUBLY-LINKED-QUEUE")), (SubLObject)SubLObjectFactory.makeSymbol("PROCESS-QUEUE"), (SubLObject)SubLObjectFactory.makeSymbol("SUBLOOP-PROCESS")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("INLINE-METHOD"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("REMOVE"), (SubLObject)SubLObjectFactory.makeSymbol("BASIC-DOUBLY-LINKED-QUEUE")), (SubLObject)SubLObjectFactory.makeSymbol("PROCESS-QUEUE"), (SubLObject)SubLObjectFactory.makeSymbol("SUBLOOP-PROCESS")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("SUBLOOP-PROCESS"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("INLINE-METHOD"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("REMOVE"), (SubLObject)SubLObjectFactory.makeSymbol("BASIC-DOUBLY-LINKED-QUEUE")), (SubLObject)SubLObjectFactory.makeSymbol("TRANSFER-QUEUE"), (SubLObject)SubLObjectFactory.makeSymbol("SUBLOOP-PROCESS")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)subloop_processes.NIL));
        $str132$_KILL_TASK__S____S_is_not_a_SubLO = SubLObjectFactory.makeString("(KILL-TASK ~S): ~S is not a SubLOOP process.");
        $sym133$BASIC_MULTI_TASK_SCHEDULER_KILL_TASK_METHOD = SubLObjectFactory.makeSymbol("BASIC-MULTI-TASK-SCHEDULER-KILL-TASK-METHOD");
        $sym134$KILL_TASK_BY_NAME = SubLObjectFactory.makeSymbol("KILL-TASK-BY-NAME");
        $list135 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SUBLOOP-PROCESS-NAME"));
        $list136 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("KEY"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RESOLVE-METHOD"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("GET-NAME")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("BASIC-SUBLOOP-PROCESS")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TASK"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("INLINE-METHOD"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIND"), (SubLObject)SubLObjectFactory.makeSymbol("BASIC-DOUBLY-LINKED-QUEUE")), (SubLObject)SubLObjectFactory.makeSymbol("PROCESS-QUEUE"), (SubLObject)SubLObjectFactory.makeSymbol("SUBLOOP-PROCESS-NAME"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FUNCTION"), (SubLObject)subloop_processes.EQUAL), (SubLObject)SubLObjectFactory.makeSymbol("KEY")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PWHEN"), (SubLObject)SubLObjectFactory.makeSymbol("TASK"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("INLINE-METHOD"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("REMOVE"), (SubLObject)SubLObjectFactory.makeSymbol("BASIC-DOUBLY-LINKED-QUEUE")), (SubLObject)SubLObjectFactory.makeSymbol("PROCESS-QUEUE"), (SubLObject)SubLObjectFactory.makeSymbol("SUBLOOP-PROCESS-NAME")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("TASK"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("TASK"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("INLINE-METHOD"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIND"), (SubLObject)SubLObjectFactory.makeSymbol("BASIC-DOUBLY-LINKED-QUEUE")), (SubLObject)SubLObjectFactory.makeSymbol("TRANSFER-QUEUE"), (SubLObject)SubLObjectFactory.makeSymbol("SUBLOOP-PROCESS-NAME"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FUNCTION"), (SubLObject)subloop_processes.EQUAL), (SubLObject)SubLObjectFactory.makeSymbol("KEY"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PWHEN"), (SubLObject)SubLObjectFactory.makeSymbol("TASK"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("INLINE-METHOD"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("REMOVE"), (SubLObject)SubLObjectFactory.makeSymbol("BASIC-DOUBLY-LINKED-QUEUE")), (SubLObject)SubLObjectFactory.makeSymbol("TRANSFER-QUEUE"), (SubLObject)SubLObjectFactory.makeSymbol("TASK")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("TASK"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)subloop_processes.NIL)));
        $sym137$BASIC_MULTI_TASK_SCHEDULER_KILL_TASK_BY_NAME_METHOD = SubLObjectFactory.makeSymbol("BASIC-MULTI-TASK-SCHEDULER-KILL-TASK-BY-NAME-METHOD");
        $sym138$INTERRUPT_TASK = SubLObjectFactory.makeSymbol("INTERRUPT-TASK");
        $list139 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("MUST"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SUBLOOP-PROCESS-P"), (SubLObject)SubLObjectFactory.makeSymbol("SUBLOOP-PROCESS")), (SubLObject)SubLObjectFactory.makeString("(INTERRUPT-TASK ~S): ~S is not a SubLOOP process."), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)SubLObjectFactory.makeSymbol("SUBLOOP-PROCESS")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PWHEN"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("INLINE-METHOD"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ENQUEUED-P"), (SubLObject)SubLObjectFactory.makeSymbol("BASIC-DOUBLY-LINKED-QUEUE")), (SubLObject)SubLObjectFactory.makeSymbol("PROCESS-QUEUE"), (SubLObject)SubLObjectFactory.makeSymbol("SUBLOOP-PROCESS")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("INLINE-METHOD"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("REMOVE"), (SubLObject)SubLObjectFactory.makeSymbol("BASIC-DOUBLY-LINKED-QUEUE")), (SubLObject)SubLObjectFactory.makeSymbol("PROCESS-QUEUE"), (SubLObject)SubLObjectFactory.makeSymbol("SUBLOOP-PROCESS")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("INLINE-METHOD"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ENQUEUE"), (SubLObject)SubLObjectFactory.makeSymbol("BASIC-DOUBLY-LINKED-QUEUE")), (SubLObject)SubLObjectFactory.makeSymbol("TRANSFER-QUEUE"), (SubLObject)SubLObjectFactory.makeSymbol("SUBLOOP-PROCESS")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("SUBLOOP-PROCESS"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)subloop_processes.NIL));
        $str140$_INTERRUPT_TASK__S____S_is_not_a_ = SubLObjectFactory.makeString("(INTERRUPT-TASK ~S): ~S is not a SubLOOP process.");
        $sym141$BASIC_MULTI_TASK_SCHEDULER_INTERRUPT_TASK_METHOD = SubLObjectFactory.makeSymbol("BASIC-MULTI-TASK-SCHEDULER-INTERRUPT-TASK-METHOD");
        $sym142$INTERRUPT_TASK_BY_NAME = SubLObjectFactory.makeSymbol("INTERRUPT-TASK-BY-NAME");
        $list143 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("KEY"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RESOLVE-METHOD"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("GET-NAME")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("BASIC-SUBLOOP-PROCESS")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TASK"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("INLINE-METHOD"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIND"), (SubLObject)SubLObjectFactory.makeSymbol("BASIC-DOUBLY-LINKED-QUEUE")), (SubLObject)SubLObjectFactory.makeSymbol("PROCESS-QUEUE"), (SubLObject)SubLObjectFactory.makeSymbol("SUBLOOP-PROCESS-NAME"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FUNCTION"), (SubLObject)subloop_processes.EQUAL), (SubLObject)SubLObjectFactory.makeSymbol("KEY")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PWHEN"), (SubLObject)SubLObjectFactory.makeSymbol("TASK"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("INLINE-METHOD"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("REMOVE"), (SubLObject)SubLObjectFactory.makeSymbol("BASIC-DOUBLY-LINKED-QUEUE")), (SubLObject)SubLObjectFactory.makeSymbol("PROCESS-QUEUE"), (SubLObject)SubLObjectFactory.makeSymbol("TASK")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("INLINE-METHOD"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ENQUEUE"), (SubLObject)SubLObjectFactory.makeSymbol("BASIC-DOUBLY-LINKED-QUEUE")), (SubLObject)SubLObjectFactory.makeSymbol("TRANSFER-QUEUE"), (SubLObject)SubLObjectFactory.makeSymbol("TASK")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("TASK"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)subloop_processes.NIL)));
        $sym144$BASIC_MULTI_TASK_SCHEDULER_INTERRUPT_TASK_BY_NAME_METHOD = SubLObjectFactory.makeSymbol("BASIC-MULTI-TASK-SCHEDULER-INTERRUPT-TASK-BY-NAME-METHOD");
        $sym145$GET_ALL_TASKS = SubLObjectFactory.makeSymbol("GET-ALL-TASKS");
        $list146 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NCONC"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("INLINE-METHOD"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("GET-CONTENTS"), (SubLObject)SubLObjectFactory.makeSymbol("BASIC-DOUBLY-LINKED-QUEUE")), (SubLObject)SubLObjectFactory.makeSymbol("PROCESS-QUEUE")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("INLINE-METHOD"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("GET-CONTENTS"), (SubLObject)SubLObjectFactory.makeSymbol("BASIC-DOUBLY-LINKED-QUEUE")), (SubLObject)SubLObjectFactory.makeSymbol("TRANSFER-QUEUE")))));
        $sym147$BASIC_MULTI_TASK_SCHEDULER_GET_ALL_TASKS_METHOD = SubLObjectFactory.makeSymbol("BASIC-MULTI-TASK-SCHEDULER-GET-ALL-TASKS-METHOD");
        $sym148$KILL_ALL_TASKS = SubLObjectFactory.makeSymbol("KILL-ALL-TASKS");
        $list149 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ALL-TASKS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("GET-ALL-TASKS"), (SubLObject)SubLObjectFactory.makeSymbol("SELF")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CDOLIST"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TASK"), (SubLObject)SubLObjectFactory.makeSymbol("ALL-TASKS")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("KILL-TASK"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)SubLObjectFactory.makeSymbol("TASK")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)subloop_processes.NIL));
        $sym150$BASIC_MULTI_TASK_SCHEDULER_KILL_ALL_TASKS_METHOD = SubLObjectFactory.makeSymbol("BASIC-MULTI-TASK-SCHEDULER-KILL-ALL-TASKS-METHOD");
        $list151 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("&OPTIONAL"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("EXPIRATION-DELTA"), (SubLObject)subloop_processes.NIL));
        $list152 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("MUST"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("COR"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NULL"), (SubLObject)SubLObjectFactory.makeSymbol("EXPIRATION-DELTA")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CAND"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("INTEGERP"), (SubLObject)SubLObjectFactory.makeSymbol("EXPIRATION-DELTA"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol(">="), (SubLObject)SubLObjectFactory.makeSymbol("EXPIRATION-DELTA"), (SubLObject)subloop_processes.ZERO_INTEGER)), (SubLObject)SubLObjectFactory.makeString("(RUN ~S): ~S is not a valid expiration-delta.  NIL or a non negative integer was expected."), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)SubLObjectFactory.makeSymbol("EXPIRATION-DELTA")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("INLINE-SET-SLOT"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("HALTED-P"), (SubLObject)SubLObjectFactory.makeSymbol("BASIC-MULTI-TASK-SCHEDULER")), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)subloop_processes.NIL), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TRANSFER-QUEUE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("INLINE-GET-SLOT"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TRANSFER-QUEUE"), (SubLObject)SubLObjectFactory.makeSymbol("BASIC-MULTI-TASK-SCHEDULER")), (SubLObject)SubLObjectFactory.makeSymbol("SELF"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PROCESS-QUEUE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("INLINE-GET-SLOT"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PROCESS-QUEUE"), (SubLObject)SubLObjectFactory.makeSymbol("BASIC-MULTI-TASK-SCHEDULER")), (SubLObject)SubLObjectFactory.makeSymbol("SELF"))), (SubLObject)SubLObjectFactory.makeSymbol("CURRENT-PROCESS")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("IGNORE"), (SubLObject)SubLObjectFactory.makeSymbol("TRANSFER-QUEUE")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PIF"), (SubLObject)SubLObjectFactory.makeSymbol("EXPIRATION-DELTA"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("START-TIME"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("GET-UNIVERSAL-TIME"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("STOP-TIME"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("+"), (SubLObject)SubLObjectFactory.makeSymbol("START-TIME"), (SubLObject)SubLObjectFactory.makeSymbol("EXPIRATION-DELTA")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("INLINE-SET-SLOT"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("HALTED-P"), (SubLObject)SubLObjectFactory.makeSymbol("BASIC-MULTI-TASK-SCHEDULER")), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol(">="), (SubLObject)SubLObjectFactory.makeSymbol("STOP-TIME"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("GET-UNIVERSAL-TIME")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("WHILE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CAND"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CNOT"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("INLINE-GET-SLOT"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("HALTED-P"), (SubLObject)SubLObjectFactory.makeSymbol("BASIC-MULTI-TASK-SCHEDULER")), (SubLObject)SubLObjectFactory.makeSymbol("SELF"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CNOT"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("INLINE-METHOD"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("EMPTY-P"), (SubLObject)SubLObjectFactory.makeSymbol("BASIC-DOUBLY-LINKED-QUEUE")), (SubLObject)SubLObjectFactory.makeSymbol("PROCESS-QUEUE")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("CURRENT-PROCESS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("INLINE-METHOD"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEQUEUE"), (SubLObject)SubLObjectFactory.makeSymbol("BASIC-DOUBLY-LINKED-QUEUE")), (SubLObject)SubLObjectFactory.makeSymbol("PROCESS-QUEUE"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PWHEN"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("INLINE-GET-SLOT"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TRACE-P"), (SubLObject)SubLObjectFactory.makeSymbol("BASIC-MULTI-TASK-SCHEDULER")), (SubLObject)SubLObjectFactory.makeSymbol("SELF")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FUNCALL-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("PERFORM-TRACE")), (SubLObject)SubLObjectFactory.makeSymbol("CURRENT-PROCESS"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PUNLESS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("MEMBER"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("INLINE-GET-SLOT"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("STATUS"), (SubLObject)SubLObjectFactory.makeSymbol("BASIC-SUBLOOP-PROCESS")), (SubLObject)SubLObjectFactory.makeSymbol("CURRENT-PROCESS")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("DEAD"), (SubLObject)SubLObjectFactory.makeKeyword("KILLED"), (SubLObject)SubLObjectFactory.makeKeyword("TERMINATED")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("INLINE-METHOD"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ENQUEUE"), (SubLObject)SubLObjectFactory.makeSymbol("BASIC-DOUBLY-LINKED-QUEUE")), (SubLObject)SubLObjectFactory.makeSymbol("PROCESS-QUEUE"), (SubLObject)SubLObjectFactory.makeSymbol("CURRENT-PROCESS"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("INLINE-SET-SLOT"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("HALTED-P"), (SubLObject)SubLObjectFactory.makeSymbol("BASIC-MULTI-TASK-SCHEDULER")), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol(">="), (SubLObject)SubLObjectFactory.makeSymbol("STOP-TIME"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("GET-UNIVERSAL-TIME")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PWHEN"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NOTHING-TO-DO?"), (SubLObject)SubLObjectFactory.makeSymbol("SELF")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FUNCALL-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("ON-NOTHING-TO-DO")))))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("WHILE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CAND"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CNOT"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("INLINE-GET-SLOT"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("HALTED-P"), (SubLObject)SubLObjectFactory.makeSymbol("BASIC-MULTI-TASK-SCHEDULER")), (SubLObject)SubLObjectFactory.makeSymbol("SELF"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CNOT"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("INLINE-METHOD"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("EMPTY-P"), (SubLObject)SubLObjectFactory.makeSymbol("BASIC-DOUBLY-LINKED-QUEUE")), (SubLObject)SubLObjectFactory.makeSymbol("PROCESS-QUEUE")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("CURRENT-PROCESS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("INLINE-METHOD"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEQUEUE"), (SubLObject)SubLObjectFactory.makeSymbol("BASIC-DOUBLY-LINKED-QUEUE")), (SubLObject)SubLObjectFactory.makeSymbol("PROCESS-QUEUE"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PWHEN"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("INLINE-GET-SLOT"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TRACE-P"), (SubLObject)SubLObjectFactory.makeSymbol("BASIC-MULTI-TASK-SCHEDULER")), (SubLObject)SubLObjectFactory.makeSymbol("SELF")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FUNCALL-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("PERFORM-TRACE")), (SubLObject)SubLObjectFactory.makeSymbol("CURRENT-PROCESS"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PUNLESS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("MEMBER"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("INLINE-GET-SLOT"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("STATUS"), (SubLObject)SubLObjectFactory.makeSymbol("BASIC-SUBLOOP-PROCESS")), (SubLObject)SubLObjectFactory.makeSymbol("CURRENT-PROCESS")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("DEAD"), (SubLObject)SubLObjectFactory.makeKeyword("KILLED"), (SubLObject)SubLObjectFactory.makeKeyword("TERMINATED")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("INLINE-METHOD"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ENQUEUE"), (SubLObject)SubLObjectFactory.makeSymbol("BASIC-DOUBLY-LINKED-QUEUE")), (SubLObject)SubLObjectFactory.makeSymbol("PROCESS-QUEUE"), (SubLObject)SubLObjectFactory.makeSymbol("CURRENT-PROCESS"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PWHEN"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NOTHING-TO-DO?"), (SubLObject)SubLObjectFactory.makeSymbol("SELF")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FUNCALL-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("ON-NOTHING-TO-DO"))))))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)subloop_processes.NIL));
        $str153$_RUN__S____S_is_not_a_valid_expir = SubLObjectFactory.makeString("(RUN ~S): ~S is not a valid expiration-delta.  NIL or a non negative integer was expected.");
        $sym154$PERFORM_TRACE = SubLObjectFactory.makeSymbol("PERFORM-TRACE");
        $list155 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("DEAD"), (SubLObject)SubLObjectFactory.makeKeyword("KILLED"), (SubLObject)SubLObjectFactory.makeKeyword("TERMINATED"));
        $sym156$ON_NOTHING_TO_DO = SubLObjectFactory.makeSymbol("ON-NOTHING-TO-DO");
        $sym157$BASIC_MULTI_TASK_SCHEDULER_RUN_METHOD = SubLObjectFactory.makeSymbol("BASIC-MULTI-TASK-SCHEDULER-RUN-METHOD");
        $sym158$GET_TRACE_MODE = SubLObjectFactory.makeSymbol("GET-TRACE-MODE");
        $list159 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("TRACE-P")));
        $sym160$BASIC_MULTI_TASK_SCHEDULER_GET_TRACE_MODE_METHOD = SubLObjectFactory.makeSymbol("BASIC-MULTI-TASK-SCHEDULER-GET-TRACE-MODE-METHOD");
        $sym161$SET_TRACE_MODE = SubLObjectFactory.makeSymbol("SET-TRACE-MODE");
        $list162 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NEW-TRACE-MODE"));
        $list163 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("TRACE-P"), (SubLObject)SubLObjectFactory.makeSymbol("NEW-TRACE-MODE")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("NEW-TRACE-MODE")));
        $sym164$OUTER_CATCH_FOR_BASIC_MULTI_TASK_SCHEDULER_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-BASIC-MULTI-TASK-SCHEDULER-METHOD");
        $sym165$BASIC_MULTI_TASK_SCHEDULER_SET_TRACE_MODE_METHOD = SubLObjectFactory.makeSymbol("BASIC-MULTI-TASK-SCHEDULER-SET-TRACE-MODE-METHOD");
        $list166 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PROCESS"));
        $list167 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("IGNORE"), (SubLObject)SubLObjectFactory.makeSymbol("PROCESS")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)subloop_processes.NIL));
        $sym168$BASIC_MULTI_TASK_SCHEDULER_PERFORM_TRACE_METHOD = SubLObjectFactory.makeSymbol("BASIC-MULTI-TASK-SCHEDULER-PERFORM-TRACE-METHOD");
        $list169 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUEUE-CONTENTS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("INLINE-METHOD"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("GET-CONTENTS"), (SubLObject)SubLObjectFactory.makeSymbol("BASIC-DOUBLY-LINKED-QUEUE")), (SubLObject)SubLObjectFactory.makeSymbol("PROCESS-QUEUE")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CDOLIST"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PROCESS"), (SubLObject)SubLObjectFactory.makeSymbol("QUEUE-CONTENTS")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PUNLESS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FUNCALL-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("PROCESS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("NOTHING-TO-DO?"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)subloop_processes.NIL))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)subloop_processes.T)));
        $sym170$OUTER_CATCH_FOR_BASIC_MULTI_TASK_SCHEDULER_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-BASIC-MULTI-TASK-SCHEDULER-METHOD");
        $sym171$BASIC_MULTI_TASK_SCHEDULER_NOTHING_TO_DO__METHOD = SubLObjectFactory.makeSymbol("BASIC-MULTI-TASK-SCHEDULER-NOTHING-TO-DO?-METHOD");
        $sym172$BASIC_MULTI_TASK_SCHEDULER_ON_NOTHING_TO_DO_METHOD = SubLObjectFactory.makeSymbol("BASIC-MULTI-TASK-SCHEDULER-ON-NOTHING-TO-DO-METHOD");
    }
}

/*

	Total time: 566 ms
	
*/