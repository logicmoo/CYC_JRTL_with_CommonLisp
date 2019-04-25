package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class shop_basic_plan extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.shop_basic_plan";
    public static final String myFingerPrint = "77d46e7f84ed2708593f8d6de523d56059434f7a870b5adde08744edcf4bcc20";
    private static final SubLSymbol $sym0$SHOP_TASK;
    private static final SubLList $list1;
    private static final SubLSymbol $sym2$SHOP_BASIC_TASK;
    private static final SubLSymbol $sym3$SHOP_INDEXED_OBJECT;
    private static final SubLList $list4;
    private static final SubLList $list5;
    private static final SubLSymbol $sym6$OBJECT;
    private static final SubLSymbol $sym7$INSTANCE_COUNT;
    private static final SubLSymbol $sym8$INSTANCE_INDEX;
    private static final SubLSymbol $sym9$SUBLOOP_RESERVED_INITIALIZE_SHOP_BASIC_TASK_CLASS;
    private static final SubLSymbol $sym10$ISOLATED_P;
    private static final SubLSymbol $sym11$INSTANCE_NUMBER;
    private static final SubLSymbol $sym12$FORMULA;
    private static final SubLSymbol $sym13$BINDINGS;
    private static final SubLSymbol $sym14$PRECOND;
    private static final SubLSymbol $sym15$TASK_STRUC;
    private static final SubLSymbol $sym16$STATUS;
    private static final SubLSymbol $sym17$SUBLOOP_RESERVED_INITIALIZE_SHOP_BASIC_TASK_INSTANCE;
    private static final SubLSymbol $sym18$STRIP_TASK;
    private static final SubLList $list19;
    private static final SubLSymbol $sym20$OUTER_CATCH_FOR_SHOP_BASIC_TASK_METHOD;
    private static final SubLSymbol $sym21$SHOP_BASIC_TASK_STRIP_TASK_METHOD;
    private static final SubLSymbol $sym22$PRINT;
    private static final SubLList $list23;
    private static final SubLList $list24;
    private static final SubLList $list25;
    private static final SubLSymbol $sym26$OUTER_CATCH_FOR_SHOP_BASIC_TASK_METHOD;
    private static final SubLString $str27$__Task__S__S_;
    private static final SubLString $str28$__Malformed_Instance_;
    private static final SubLSymbol $sym29$SHOP_BASIC_TASK_PRINT_METHOD;
    private static final SubLSymbol $sym30$INIT;
    private static final SubLList $list31;
    private static final SubLList $list32;
    private static final SubLSymbol $sym33$OUTER_CATCH_FOR_SHOP_BASIC_TASK_METHOD;
    private static final SubLSymbol $kw34$PRIMITIVE;
    private static final SubLSymbol $kw35$COMPLEX;
    private static final SubLSymbol $sym36$SHOP_BASIC_TASK_INIT_METHOD;
    private static final SubLSymbol $sym37$PLANNER_RULE;
    private static final SubLList $list38;
    private static final SubLSymbol $sym39$OUTER_CATCH_FOR_SHOP_BASIC_TASK_METHOD;
    private static final SubLSymbol $sym40$SHOP_BASIC_TASK_PLANNER_RULE_METHOD;
    private static final SubLList $list41;
    private static final SubLSymbol $sym42$OUTER_CATCH_FOR_SHOP_BASIC_TASK_METHOD;
    private static final SubLSymbol $sym43$SHOP_BASIC_TASK_FORMULA_METHOD;
    private static final SubLSymbol $sym44$PRECONDITION;
    private static final SubLList $list45;
    private static final SubLSymbol $sym46$OUTER_CATCH_FOR_SHOP_BASIC_TASK_METHOD;
    private static final SubLSymbol $sym47$SHOP_BASIC_TASK_PRECONDITION_METHOD;
    private static final SubLSymbol $sym48$PRIMITIVE_;
    private static final SubLList $list49;
    private static final SubLSymbol $sym50$OUTER_CATCH_FOR_SHOP_BASIC_TASK_METHOD;
    private static final SubLSymbol $sym51$SHOP_BASIC_TASK_PRIMITIVE__METHOD;
    private static final SubLSymbol $sym52$MBINDINGS;
    private static final SubLList $list53;
    private static final SubLSymbol $sym54$OUTER_CATCH_FOR_SHOP_BASIC_TASK_METHOD;
    private static final SubLSymbol $sym55$SHOP_BASIC_TASK_MBINDINGS_METHOD;
    private static final SubLSymbol $sym56$SHOP_PLAN_I;
    private static final SubLList $list57;
    private static final SubLSymbol $sym58$SHOP_BASIC_PLAN;
    private static final SubLList $list59;
    private static final SubLList $list60;
    private static final SubLSymbol $sym61$SUBLOOP_RESERVED_INITIALIZE_SHOP_BASIC_PLAN_CLASS;
    private static final SubLSymbol $sym62$PRE_ORDERING;
    private static final SubLSymbol $sym63$POST_ORDERING;
    private static final SubLSymbol $sym64$TASK_STRUCS;
    private static final SubLSymbol $sym65$SIMPLE_BINDING_LIST;
    private static final SubLSymbol $sym66$TOTAL_COST;
    private static final SubLSymbol $sym67$OPEN_VARIABLES;
    private static final SubLSymbol $sym68$VARIABLE_MANAGER;
    private static final SubLSymbol $sym69$SUBLOOP_RESERVED_INITIALIZE_SHOP_BASIC_PLAN_INSTANCE;
    private static final SubLSymbol $sym70$POPULATE_PLAN;
    private static final SubLList $list71;
    private static final SubLList $list72;
    private static final SubLSymbol $sym73$OUTER_CATCH_FOR_SHOP_BASIC_PLAN_METHOD;
    private static final SubLInteger $int74$50;
    private static final SubLString $str75$tried_to_add_null_entry_to_task_l;
    private static final SubLSymbol $sym76$VAR_MANAGER;
    private static final SubLSymbol $sym77$SHOP_BASIC_PLAN_POPULATE_PLAN_METHOD;
    private static final SubLSymbol $sym78$GROUND_FORMS;
    private static final SubLList $list79;
    private static final SubLSymbol $sym80$OUTER_CATCH_FOR_SHOP_BASIC_PLAN_METHOD;
    private static final SubLSymbol $sym81$SHOP_BASIC_PLAN_GROUND_FORMS_METHOD;
    private static final SubLSymbol $sym82$PRIMITIVE_FORM;
    private static final SubLList $list83;
    private static final SubLSymbol $sym84$OUTER_CATCH_FOR_SHOP_BASIC_PLAN_METHOD;
    private static final SubLSymbol $sym85$SHOP_BASIC_PLAN_PRIMITIVE_FORM_METHOD;
    private static final SubLSymbol $sym86$NON_PRIMITIVE_PRE_ORDERING;
    private static final SubLList $list87;
    private static final SubLSymbol $sym88$OUTER_CATCH_FOR_SHOP_BASIC_PLAN_METHOD;
    private static final SubLSymbol $sym89$SHOP_BASIC_PLAN_NON_PRIMITIVE_PRE_ORDERING_METHOD;
    private static final SubLSymbol $sym90$GOAL_TASK;
    private static final SubLList $list91;
    private static final SubLSymbol $sym92$OUTER_CATCH_FOR_SHOP_BASIC_PLAN_METHOD;
    private static final SubLSymbol $sym93$SHOP_BASIC_PLAN_GOAL_TASK_METHOD;
    private static final SubLList $list94;
    private static final SubLSymbol $sym95$OUTER_CATCH_FOR_SHOP_BASIC_PLAN_METHOD;
    private static final SubLSymbol $sym96$SHOP_BASIC_PLAN_POST_ORDERING_METHOD;
    private static final SubLSymbol $sym97$COST;
    private static final SubLList $list98;
    private static final SubLSymbol $sym99$OUTER_CATCH_FOR_SHOP_BASIC_PLAN_METHOD;
    private static final SubLSymbol $sym100$SHOP_BASIC_PLAN_COST_METHOD;
    private static final SubLList $list101;
    private static final SubLSymbol $sym102$OUTER_CATCH_FOR_SHOP_BASIC_PLAN_METHOD;
    private static final SubLSymbol $sym103$SHOP_BASIC_PLAN_VARIABLE_MANAGER_METHOD;
    private static final SubLSymbol $sym104$MBINDING;
    private static final SubLSymbol $sym105$OUTER_CATCH_FOR_SHOP_BASIC_PLAN_METHOD;
    private static final SubLSymbol $sym106$SHOP_BASIC_PLAN_MBINDING_METHOD;
    private static final SubLSymbol $sym107$GATHER_PLANNER_RULES;
    private static final SubLList $list108;
    private static final SubLSymbol $sym109$OUTER_CATCH_FOR_SHOP_BASIC_PLAN_METHOD;
    private static final SubLSymbol $sym110$SHOP_BASIC_PLAN_GATHER_PLANNER_RULES_METHOD;
    private static final SubLSymbol $sym111$GATHER_PRECONDITIONS;
    private static final SubLList $list112;
    private static final SubLSymbol $sym113$OUTER_CATCH_FOR_SHOP_BASIC_PLAN_METHOD;
    private static final SubLSymbol $sym114$SHOP_BASIC_PLAN_GATHER_PRECONDITIONS_METHOD;
    private static final SubLSymbol $sym115$SINGLE_AGENT_PLAN_;
    private static final SubLList $list116;
    private static final SubLSymbol $sym117$OUTER_CATCH_FOR_SHOP_BASIC_PLAN_METHOD;
    private static final SubLSymbol $sym118$SHOP_BASIC_PLAN_SINGLE_AGENT_PLAN__METHOD;
    private static final SubLSymbol $sym119$SHOP_VARIABLEP;
    private static final SubLList $list120;
    private static final SubLSymbol $sym121$CUR_PRE;
    private static final SubLSymbol $sym122$NEXT;
    private static final SubLSymbol $sym123$STACK;
    private static final SubLSymbol $sym124$CLET;
    private static final SubLList $list125;
    private static final SubLList $list126;
    private static final SubLSymbol $sym127$CDO;
    private static final SubLSymbol $sym128$REST;
    private static final SubLSymbol $sym129$NULL;
    private static final SubLSymbol $sym130$FIRST;
    private static final SubLSymbol $sym131$SECOND;
    private static final SubLSymbol $sym132$WHILE;
    private static final SubLSymbol $sym133$CAND;
    private static final SubLSymbol $sym134$CNOT;
    private static final SubLSymbol $sym135$PPO_TREE_DESCENDANT_;
    private static final SubLSymbol $sym136$CDEC;
    private static final SubLSymbol $sym137$CPOP;
    private static final SubLSymbol $sym138$PWHEN;
    private static final SubLSymbol $sym139$CINC;
    private static final SubLSymbol $sym140$CPUSH;
    
    @SubLTranslatedFile.SubL(source = "cycl/shop-basic-plan.lisp", position = 781L)
    public static SubLObject shop_task_p(final SubLObject shop_task) {
        return interfaces.subloop_instanceof_interface(shop_task, (SubLObject)shop_basic_plan.$sym0$SHOP_TASK);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/shop-basic-plan.lisp", position = 1122L)
    public static SubLObject get_shop_basic_task_status(final SubLObject shop_basic_task) {
        return classes.subloop_get_instance_slot(shop_basic_task, (SubLObject)shop_basic_plan.FIVE_INTEGER);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/shop-basic-plan.lisp", position = 1122L)
    public static SubLObject set_shop_basic_task_status(final SubLObject shop_basic_task, final SubLObject value) {
        return classes.subloop_set_instance_slot(shop_basic_task, value, (SubLObject)shop_basic_plan.FIVE_INTEGER);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/shop-basic-plan.lisp", position = 1122L)
    public static SubLObject get_shop_basic_task_task_struc(final SubLObject shop_basic_task) {
        return classes.subloop_get_instance_slot(shop_basic_task, (SubLObject)shop_basic_plan.FOUR_INTEGER);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/shop-basic-plan.lisp", position = 1122L)
    public static SubLObject set_shop_basic_task_task_struc(final SubLObject shop_basic_task, final SubLObject value) {
        return classes.subloop_set_instance_slot(shop_basic_task, value, (SubLObject)shop_basic_plan.FOUR_INTEGER);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/shop-basic-plan.lisp", position = 1122L)
    public static SubLObject get_shop_basic_task_precond(final SubLObject shop_basic_task) {
        return classes.subloop_get_instance_slot(shop_basic_task, (SubLObject)shop_basic_plan.THREE_INTEGER);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/shop-basic-plan.lisp", position = 1122L)
    public static SubLObject set_shop_basic_task_precond(final SubLObject shop_basic_task, final SubLObject value) {
        return classes.subloop_set_instance_slot(shop_basic_task, value, (SubLObject)shop_basic_plan.THREE_INTEGER);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/shop-basic-plan.lisp", position = 1122L)
    public static SubLObject get_shop_basic_task_bindings(final SubLObject shop_basic_task) {
        return classes.subloop_get_instance_slot(shop_basic_task, (SubLObject)shop_basic_plan.TWO_INTEGER);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/shop-basic-plan.lisp", position = 1122L)
    public static SubLObject set_shop_basic_task_bindings(final SubLObject shop_basic_task, final SubLObject value) {
        return classes.subloop_set_instance_slot(shop_basic_task, value, (SubLObject)shop_basic_plan.TWO_INTEGER);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/shop-basic-plan.lisp", position = 1122L)
    public static SubLObject get_shop_basic_task_formula(final SubLObject shop_basic_task) {
        return classes.subloop_get_instance_slot(shop_basic_task, (SubLObject)shop_basic_plan.ONE_INTEGER);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/shop-basic-plan.lisp", position = 1122L)
    public static SubLObject set_shop_basic_task_formula(final SubLObject shop_basic_task, final SubLObject value) {
        return classes.subloop_set_instance_slot(shop_basic_task, value, (SubLObject)shop_basic_plan.ONE_INTEGER);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/shop-basic-plan.lisp", position = 1122L)
    public static SubLObject subloop_reserved_initialize_shop_basic_task_class(final SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, (SubLObject)shop_basic_plan.$sym6$OBJECT, (SubLObject)shop_basic_plan.$sym7$INSTANCE_COUNT, (SubLObject)shop_basic_plan.ZERO_INTEGER);
        classes.subloop_initialize_slot(new_instance, (SubLObject)shop_basic_plan.$sym3$SHOP_INDEXED_OBJECT, (SubLObject)shop_basic_plan.$sym8$INSTANCE_INDEX, (SubLObject)shop_basic_plan.NIL);
        return (SubLObject)shop_basic_plan.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/shop-basic-plan.lisp", position = 1122L)
    public static SubLObject subloop_reserved_initialize_shop_basic_task_instance(final SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, (SubLObject)shop_basic_plan.$sym6$OBJECT, (SubLObject)shop_basic_plan.$sym10$ISOLATED_P, (SubLObject)shop_basic_plan.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)shop_basic_plan.$sym6$OBJECT, (SubLObject)shop_basic_plan.$sym11$INSTANCE_NUMBER, (SubLObject)shop_basic_plan.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)shop_basic_plan.$sym2$SHOP_BASIC_TASK, (SubLObject)shop_basic_plan.$sym12$FORMULA, (SubLObject)shop_basic_plan.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)shop_basic_plan.$sym2$SHOP_BASIC_TASK, (SubLObject)shop_basic_plan.$sym13$BINDINGS, (SubLObject)shop_basic_plan.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)shop_basic_plan.$sym2$SHOP_BASIC_TASK, (SubLObject)shop_basic_plan.$sym14$PRECOND, (SubLObject)shop_basic_plan.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)shop_basic_plan.$sym2$SHOP_BASIC_TASK, (SubLObject)shop_basic_plan.$sym15$TASK_STRUC, (SubLObject)shop_basic_plan.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)shop_basic_plan.$sym2$SHOP_BASIC_TASK, (SubLObject)shop_basic_plan.$sym16$STATUS, (SubLObject)shop_basic_plan.NIL);
        return (SubLObject)shop_basic_plan.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/shop-basic-plan.lisp", position = 1122L)
    public static SubLObject shop_basic_task_p(final SubLObject shop_basic_task) {
        return classes.subloop_instanceof_class(shop_basic_task, (SubLObject)shop_basic_plan.$sym2$SHOP_BASIC_TASK);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/shop-basic-plan.lisp", position = 1586L)
    public static SubLObject shop_basic_task_strip_task_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_shop_basic_task_method = (SubLObject)shop_basic_plan.NIL;
        final SubLObject formula = get_shop_basic_task_formula(self);
        try {
            thread.throwStack.push(shop_basic_plan.$sym20$OUTER_CATCH_FOR_SHOP_BASIC_TASK_METHOD);
            try {
                instances.set_slot(self, (SubLObject)shop_basic_plan.$sym12$FORMULA, conses_high.second(instances.get_slot(self, (SubLObject)shop_basic_plan.$sym12$FORMULA)));
                Dynamic.sublisp_throw((SubLObject)shop_basic_plan.$sym20$OUTER_CATCH_FOR_SHOP_BASIC_TASK_METHOD, self);
            }
            finally {
                final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)shop_basic_plan.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    set_shop_basic_task_formula(self, formula);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        }
        catch (Throwable ccatch_env_var) {
            catch_var_for_shop_basic_task_method = Errors.handleThrowable(ccatch_env_var, (SubLObject)shop_basic_plan.$sym20$OUTER_CATCH_FOR_SHOP_BASIC_TASK_METHOD);
        }
        finally {
            thread.throwStack.pop();
        }
        return catch_var_for_shop_basic_task_method;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/shop-basic-plan.lisp", position = 1758L)
    public static SubLObject shop_basic_task_print_method(final SubLObject self, final SubLObject stream, final SubLObject depth) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_shop_basic_task_method = (SubLObject)shop_basic_plan.NIL;
        final SubLObject formula = get_shop_basic_task_formula(self);
        final SubLObject instance_number = object.get_object_instance_number(self);
        try {
            thread.throwStack.push(shop_basic_plan.$sym26$OUTER_CATCH_FOR_SHOP_BASIC_TASK_METHOD);
            try {
                if (shop_basic_plan.NIL != subloop_structures.instance_p(self)) {
                    PrintLow.format(stream, (SubLObject)shop_basic_plan.$str27$__Task__S__S_, instance_number, formula);
                }
                else {
                    PrintLow.format(stream, (SubLObject)shop_basic_plan.$str28$__Malformed_Instance_);
                }
                Dynamic.sublisp_throw((SubLObject)shop_basic_plan.$sym26$OUTER_CATCH_FOR_SHOP_BASIC_TASK_METHOD, self);
            }
            finally {
                final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)shop_basic_plan.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    set_shop_basic_task_formula(self, formula);
                    object.set_object_instance_number(self, instance_number);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        }
        catch (Throwable ccatch_env_var) {
            catch_var_for_shop_basic_task_method = Errors.handleThrowable(ccatch_env_var, (SubLObject)shop_basic_plan.$sym26$OUTER_CATCH_FOR_SHOP_BASIC_TASK_METHOD);
        }
        finally {
            thread.throwStack.pop();
        }
        return catch_var_for_shop_basic_task_method;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/shop-basic-plan.lisp", position = 1995L)
    public static SubLObject shop_basic_task_init_method(final SubLObject self, final SubLObject new_task, final SubLObject new_binding, final SubLObject new_precond, final SubLObject new_task_struc) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_shop_basic_task_method = (SubLObject)shop_basic_plan.NIL;
        SubLObject status = get_shop_basic_task_status(self);
        SubLObject task_struc = get_shop_basic_task_task_struc(self);
        SubLObject precond = get_shop_basic_task_precond(self);
        SubLObject v_bindings = get_shop_basic_task_bindings(self);
        SubLObject formula = get_shop_basic_task_formula(self);
        try {
            thread.throwStack.push(shop_basic_plan.$sym33$OUTER_CATCH_FOR_SHOP_BASIC_TASK_METHOD);
            try {
                if (new_task.first() == shop_basic_plan.$kw34$PRIMITIVE) {
                    formula = conses_high.second(new_task);
                    status = (SubLObject)shop_basic_plan.$kw34$PRIMITIVE;
                }
                else {
                    formula = new_task;
                    status = (SubLObject)shop_basic_plan.$kw35$COMPLEX;
                }
                v_bindings = new_binding;
                precond = new_precond;
                task_struc = new_task_struc;
                Dynamic.sublisp_throw((SubLObject)shop_basic_plan.$sym33$OUTER_CATCH_FOR_SHOP_BASIC_TASK_METHOD, self);
            }
            finally {
                final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)shop_basic_plan.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    set_shop_basic_task_status(self, status);
                    set_shop_basic_task_task_struc(self, task_struc);
                    set_shop_basic_task_precond(self, precond);
                    set_shop_basic_task_bindings(self, v_bindings);
                    set_shop_basic_task_formula(self, formula);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        }
        catch (Throwable ccatch_env_var) {
            catch_var_for_shop_basic_task_method = Errors.handleThrowable(ccatch_env_var, (SubLObject)shop_basic_plan.$sym33$OUTER_CATCH_FOR_SHOP_BASIC_TASK_METHOD);
        }
        finally {
            thread.throwStack.pop();
        }
        return catch_var_for_shop_basic_task_method;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/shop-basic-plan.lisp", position = 2563L)
    public static SubLObject shop_basic_task_planner_rule_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_shop_basic_task_method = (SubLObject)shop_basic_plan.NIL;
        final SubLObject task_struc = get_shop_basic_task_task_struc(self);
        try {
            thread.throwStack.push(shop_basic_plan.$sym39$OUTER_CATCH_FOR_SHOP_BASIC_TASK_METHOD);
            try {
                Dynamic.sublisp_throw((SubLObject)shop_basic_plan.$sym39$OUTER_CATCH_FOR_SHOP_BASIC_TASK_METHOD, task_struc);
            }
            finally {
                final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)shop_basic_plan.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    set_shop_basic_task_task_struc(self, task_struc);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        }
        catch (Throwable ccatch_env_var) {
            catch_var_for_shop_basic_task_method = Errors.handleThrowable(ccatch_env_var, (SubLObject)shop_basic_plan.$sym39$OUTER_CATCH_FOR_SHOP_BASIC_TASK_METHOD);
        }
        finally {
            thread.throwStack.pop();
        }
        return catch_var_for_shop_basic_task_method;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/shop-basic-plan.lisp", position = 2680L)
    public static SubLObject shop_basic_task_formula_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_shop_basic_task_method = (SubLObject)shop_basic_plan.NIL;
        final SubLObject formula = get_shop_basic_task_formula(self);
        try {
            thread.throwStack.push(shop_basic_plan.$sym42$OUTER_CATCH_FOR_SHOP_BASIC_TASK_METHOD);
            try {
                Dynamic.sublisp_throw((SubLObject)shop_basic_plan.$sym42$OUTER_CATCH_FOR_SHOP_BASIC_TASK_METHOD, formula);
            }
            finally {
                final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)shop_basic_plan.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    set_shop_basic_task_formula(self, formula);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        }
        catch (Throwable ccatch_env_var) {
            catch_var_for_shop_basic_task_method = Errors.handleThrowable(ccatch_env_var, (SubLObject)shop_basic_plan.$sym42$OUTER_CATCH_FOR_SHOP_BASIC_TASK_METHOD);
        }
        finally {
            thread.throwStack.pop();
        }
        return catch_var_for_shop_basic_task_method;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/shop-basic-plan.lisp", position = 2756L)
    public static SubLObject shop_basic_task_precondition_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_shop_basic_task_method = (SubLObject)shop_basic_plan.NIL;
        final SubLObject precond = get_shop_basic_task_precond(self);
        try {
            thread.throwStack.push(shop_basic_plan.$sym46$OUTER_CATCH_FOR_SHOP_BASIC_TASK_METHOD);
            try {
                Dynamic.sublisp_throw((SubLObject)shop_basic_plan.$sym46$OUTER_CATCH_FOR_SHOP_BASIC_TASK_METHOD, precond);
            }
            finally {
                final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)shop_basic_plan.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    set_shop_basic_task_precond(self, precond);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        }
        catch (Throwable ccatch_env_var) {
            catch_var_for_shop_basic_task_method = Errors.handleThrowable(ccatch_env_var, (SubLObject)shop_basic_plan.$sym46$OUTER_CATCH_FOR_SHOP_BASIC_TASK_METHOD);
        }
        finally {
            thread.throwStack.pop();
        }
        return catch_var_for_shop_basic_task_method;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/shop-basic-plan.lisp", position = 2837L)
    public static SubLObject shop_basic_task_primitiveP_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_shop_basic_task_method = (SubLObject)shop_basic_plan.NIL;
        final SubLObject status = get_shop_basic_task_status(self);
        try {
            thread.throwStack.push(shop_basic_plan.$sym50$OUTER_CATCH_FOR_SHOP_BASIC_TASK_METHOD);
            try {
                Dynamic.sublisp_throw((SubLObject)shop_basic_plan.$sym50$OUTER_CATCH_FOR_SHOP_BASIC_TASK_METHOD, Equality.eq(status, (SubLObject)shop_basic_plan.$kw34$PRIMITIVE));
            }
            finally {
                final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)shop_basic_plan.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    set_shop_basic_task_status(self, status);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        }
        catch (Throwable ccatch_env_var) {
            catch_var_for_shop_basic_task_method = Errors.handleThrowable(ccatch_env_var, (SubLObject)shop_basic_plan.$sym50$OUTER_CATCH_FOR_SHOP_BASIC_TASK_METHOD);
        }
        finally {
            thread.throwStack.pop();
        }
        return catch_var_for_shop_basic_task_method;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/shop-basic-plan.lisp", position = 2931L)
    public static SubLObject shop_basic_task_mbindings_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_shop_basic_task_method = (SubLObject)shop_basic_plan.NIL;
        final SubLObject v_bindings = get_shop_basic_task_bindings(self);
        try {
            thread.throwStack.push(shop_basic_plan.$sym54$OUTER_CATCH_FOR_SHOP_BASIC_TASK_METHOD);
            try {
                Dynamic.sublisp_throw((SubLObject)shop_basic_plan.$sym54$OUTER_CATCH_FOR_SHOP_BASIC_TASK_METHOD, v_bindings);
            }
            finally {
                final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)shop_basic_plan.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    set_shop_basic_task_bindings(self, v_bindings);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        }
        catch (Throwable ccatch_env_var) {
            catch_var_for_shop_basic_task_method = Errors.handleThrowable(ccatch_env_var, (SubLObject)shop_basic_plan.$sym54$OUTER_CATCH_FOR_SHOP_BASIC_TASK_METHOD);
        }
        finally {
            thread.throwStack.pop();
        }
        return catch_var_for_shop_basic_task_method;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/shop-basic-plan.lisp", position = 3010L)
    public static SubLObject shop_plan_i_p(final SubLObject shop_plan_i) {
        return interfaces.subloop_instanceof_interface(shop_plan_i, (SubLObject)shop_basic_plan.$sym56$SHOP_PLAN_I);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/shop-basic-plan.lisp", position = 3693L)
    public static SubLObject get_shop_basic_plan_variable_manager(final SubLObject v_shop_basic_plan) {
        return classes.subloop_get_instance_slot(v_shop_basic_plan, (SubLObject)shop_basic_plan.EIGHT_INTEGER);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/shop-basic-plan.lisp", position = 3693L)
    public static SubLObject set_shop_basic_plan_variable_manager(final SubLObject v_shop_basic_plan, final SubLObject value) {
        return classes.subloop_set_instance_slot(v_shop_basic_plan, value, (SubLObject)shop_basic_plan.EIGHT_INTEGER);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/shop-basic-plan.lisp", position = 3693L)
    public static SubLObject get_shop_basic_plan_open_variables(final SubLObject v_shop_basic_plan) {
        return classes.subloop_get_instance_slot(v_shop_basic_plan, (SubLObject)shop_basic_plan.SEVEN_INTEGER);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/shop-basic-plan.lisp", position = 3693L)
    public static SubLObject set_shop_basic_plan_open_variables(final SubLObject v_shop_basic_plan, final SubLObject value) {
        return classes.subloop_set_instance_slot(v_shop_basic_plan, value, (SubLObject)shop_basic_plan.SEVEN_INTEGER);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/shop-basic-plan.lisp", position = 3693L)
    public static SubLObject get_shop_basic_plan_total_cost(final SubLObject v_shop_basic_plan) {
        return classes.subloop_get_instance_slot(v_shop_basic_plan, (SubLObject)shop_basic_plan.SIX_INTEGER);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/shop-basic-plan.lisp", position = 3693L)
    public static SubLObject set_shop_basic_plan_total_cost(final SubLObject v_shop_basic_plan, final SubLObject value) {
        return classes.subloop_set_instance_slot(v_shop_basic_plan, value, (SubLObject)shop_basic_plan.SIX_INTEGER);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/shop-basic-plan.lisp", position = 3693L)
    public static SubLObject get_shop_basic_plan_simple_binding_list(final SubLObject v_shop_basic_plan) {
        return classes.subloop_get_instance_slot(v_shop_basic_plan, (SubLObject)shop_basic_plan.FIVE_INTEGER);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/shop-basic-plan.lisp", position = 3693L)
    public static SubLObject set_shop_basic_plan_simple_binding_list(final SubLObject v_shop_basic_plan, final SubLObject value) {
        return classes.subloop_set_instance_slot(v_shop_basic_plan, value, (SubLObject)shop_basic_plan.FIVE_INTEGER);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/shop-basic-plan.lisp", position = 3693L)
    public static SubLObject get_shop_basic_plan_bindings(final SubLObject v_shop_basic_plan) {
        return classes.subloop_get_instance_slot(v_shop_basic_plan, (SubLObject)shop_basic_plan.FOUR_INTEGER);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/shop-basic-plan.lisp", position = 3693L)
    public static SubLObject set_shop_basic_plan_bindings(final SubLObject v_shop_basic_plan, final SubLObject value) {
        return classes.subloop_set_instance_slot(v_shop_basic_plan, value, (SubLObject)shop_basic_plan.FOUR_INTEGER);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/shop-basic-plan.lisp", position = 3693L)
    public static SubLObject get_shop_basic_plan_task_strucs(final SubLObject v_shop_basic_plan) {
        return classes.subloop_get_instance_slot(v_shop_basic_plan, (SubLObject)shop_basic_plan.THREE_INTEGER);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/shop-basic-plan.lisp", position = 3693L)
    public static SubLObject set_shop_basic_plan_task_strucs(final SubLObject v_shop_basic_plan, final SubLObject value) {
        return classes.subloop_set_instance_slot(v_shop_basic_plan, value, (SubLObject)shop_basic_plan.THREE_INTEGER);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/shop-basic-plan.lisp", position = 3693L)
    public static SubLObject get_shop_basic_plan_post_ordering(final SubLObject v_shop_basic_plan) {
        return classes.subloop_get_instance_slot(v_shop_basic_plan, (SubLObject)shop_basic_plan.TWO_INTEGER);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/shop-basic-plan.lisp", position = 3693L)
    public static SubLObject set_shop_basic_plan_post_ordering(final SubLObject v_shop_basic_plan, final SubLObject value) {
        return classes.subloop_set_instance_slot(v_shop_basic_plan, value, (SubLObject)shop_basic_plan.TWO_INTEGER);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/shop-basic-plan.lisp", position = 3693L)
    public static SubLObject get_shop_basic_plan_pre_ordering(final SubLObject v_shop_basic_plan) {
        return classes.subloop_get_instance_slot(v_shop_basic_plan, (SubLObject)shop_basic_plan.ONE_INTEGER);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/shop-basic-plan.lisp", position = 3693L)
    public static SubLObject set_shop_basic_plan_pre_ordering(final SubLObject v_shop_basic_plan, final SubLObject value) {
        return classes.subloop_set_instance_slot(v_shop_basic_plan, value, (SubLObject)shop_basic_plan.ONE_INTEGER);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/shop-basic-plan.lisp", position = 3693L)
    public static SubLObject subloop_reserved_initialize_shop_basic_plan_class(final SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, (SubLObject)shop_basic_plan.$sym6$OBJECT, (SubLObject)shop_basic_plan.$sym7$INSTANCE_COUNT, (SubLObject)shop_basic_plan.ZERO_INTEGER);
        return (SubLObject)shop_basic_plan.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/shop-basic-plan.lisp", position = 3693L)
    public static SubLObject subloop_reserved_initialize_shop_basic_plan_instance(final SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, (SubLObject)shop_basic_plan.$sym6$OBJECT, (SubLObject)shop_basic_plan.$sym10$ISOLATED_P, (SubLObject)shop_basic_plan.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)shop_basic_plan.$sym6$OBJECT, (SubLObject)shop_basic_plan.$sym11$INSTANCE_NUMBER, (SubLObject)shop_basic_plan.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)shop_basic_plan.$sym58$SHOP_BASIC_PLAN, (SubLObject)shop_basic_plan.$sym62$PRE_ORDERING, (SubLObject)shop_basic_plan.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)shop_basic_plan.$sym58$SHOP_BASIC_PLAN, (SubLObject)shop_basic_plan.$sym63$POST_ORDERING, (SubLObject)shop_basic_plan.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)shop_basic_plan.$sym58$SHOP_BASIC_PLAN, (SubLObject)shop_basic_plan.$sym64$TASK_STRUCS, (SubLObject)shop_basic_plan.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)shop_basic_plan.$sym58$SHOP_BASIC_PLAN, (SubLObject)shop_basic_plan.$sym13$BINDINGS, (SubLObject)shop_basic_plan.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)shop_basic_plan.$sym58$SHOP_BASIC_PLAN, (SubLObject)shop_basic_plan.$sym65$SIMPLE_BINDING_LIST, (SubLObject)shop_basic_plan.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)shop_basic_plan.$sym58$SHOP_BASIC_PLAN, (SubLObject)shop_basic_plan.$sym66$TOTAL_COST, (SubLObject)shop_basic_plan.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)shop_basic_plan.$sym58$SHOP_BASIC_PLAN, (SubLObject)shop_basic_plan.$sym67$OPEN_VARIABLES, (SubLObject)shop_basic_plan.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)shop_basic_plan.$sym58$SHOP_BASIC_PLAN, (SubLObject)shop_basic_plan.$sym68$VARIABLE_MANAGER, (SubLObject)shop_basic_plan.NIL);
        return (SubLObject)shop_basic_plan.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/shop-basic-plan.lisp", position = 3693L)
    public static SubLObject shop_basic_plan_p(final SubLObject v_shop_basic_plan) {
        return classes.subloop_instanceof_class(v_shop_basic_plan, (SubLObject)shop_basic_plan.$sym58$SHOP_BASIC_PLAN);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/shop-basic-plan.lisp", position = 4362L)
    public static SubLObject shop_basic_plan_populate_plan_method(final SubLObject self, final SubLObject plan_state) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_shop_basic_plan_method = (SubLObject)shop_basic_plan.NIL;
        SubLObject variable_manager = get_shop_basic_plan_variable_manager(self);
        SubLObject open_variables = get_shop_basic_plan_open_variables(self);
        SubLObject total_cost = get_shop_basic_plan_total_cost(self);
        SubLObject simple_binding_list = get_shop_basic_plan_simple_binding_list(self);
        SubLObject v_bindings = get_shop_basic_plan_bindings(self);
        final SubLObject task_strucs = get_shop_basic_plan_task_strucs(self);
        SubLObject post_ordering = get_shop_basic_plan_post_ordering(self);
        SubLObject pre_ordering = get_shop_basic_plan_pre_ordering(self);
        try {
            thread.throwStack.push(shop_basic_plan.$sym73$OUTER_CATCH_FOR_SHOP_BASIC_PLAN_METHOD);
            try {
                SubLObject task_pre_ordering = shop_basic_plan_state.get_shop_basic_plan_state_partial_plan(plan_state);
                SubLObject task_post_ordering = Sequences.reverse(shop_basic_plan_state.get_shop_basic_plan_state_post_ordering(plan_state));
                final SubLObject task_bindings = shop_basic_plan_state.shop_basic_plan_state_mbinding_method(plan_state);
                final SubLObject simple_bindings = multibindings.mbind_simple_binding_list(task_bindings);
                SubLObject task_strucs_$1 = shop_basic_plan_state.shop_basic_plan_state_task_strucs_method(plan_state);
                final SubLObject preconds = shop_basic_plan_state.shop_basic_plan_state_support_lists_method(plan_state);
                SubLObject task_list = (SubLObject)shop_basic_plan.NIL;
                final SubLObject task_assoc = Hashtables.make_hash_table((SubLObject)shop_basic_plan.$int74$50, Symbols.symbol_function((SubLObject)shop_basic_plan.EQ), (SubLObject)shop_basic_plan.UNPROVIDED);
                thread.resetMultipleValues();
                final SubLObject new_task_pre_ordering = shop_process_open_variables(task_pre_ordering, task_bindings, (SubLObject)shop_basic_plan.UNPROVIDED);
                final SubLObject new_open_variables = thread.secondMultipleValue();
                thread.resetMultipleValues();
                thread.resetMultipleValues();
                final SubLObject new_task_post_ordering = shop_process_open_variables(task_post_ordering, task_bindings, new_open_variables);
                final SubLObject new_open_variables_$2 = thread.secondMultipleValue();
                thread.resetMultipleValues();
                task_pre_ordering = new_task_pre_ordering;
                task_post_ordering = new_task_post_ordering;
                open_variables = new_open_variables_$2;
                SubLObject task = (SubLObject)shop_basic_plan.NIL;
                SubLObject task_$3 = (SubLObject)shop_basic_plan.NIL;
                SubLObject precond = (SubLObject)shop_basic_plan.NIL;
                SubLObject precond_$4 = (SubLObject)shop_basic_plan.NIL;
                SubLObject task_struc = (SubLObject)shop_basic_plan.NIL;
                SubLObject task_struc_$5 = (SubLObject)shop_basic_plan.NIL;
                task = task_pre_ordering;
                task_$3 = task.first();
                precond = preconds;
                precond_$4 = precond.first();
                task_struc = task_strucs_$1;
                task_struc_$5 = task_struc.first();
                while (shop_basic_plan.NIL != task_struc || shop_basic_plan.NIL != precond || shop_basic_plan.NIL != task) {
                    final SubLObject new_task_obj = object.object_new_method((SubLObject)shop_basic_plan.$sym2$SHOP_BASIC_TASK);
                    shop_basic_task_init_method(new_task_obj, task_$3, task_bindings, precond_$4, task_struc_$5);
                    Hashtables.sethash(task_$3, task_assoc, new_task_obj);
                    task_list = (SubLObject)ConsesLow.cons(new_task_obj, task_list);
                    task = task.rest();
                    task_$3 = task.first();
                    precond = precond.rest();
                    precond_$4 = precond.first();
                    task_struc = task_struc.rest();
                    task_struc_$5 = task_struc.first();
                }
                pre_ordering = Sequences.reverse(task_list);
                task_list = (SubLObject)shop_basic_plan.NIL;
                SubLObject cdolist_list_var = task_post_ordering;
                SubLObject task2 = (SubLObject)shop_basic_plan.NIL;
                task2 = cdolist_list_var.first();
                while (shop_basic_plan.NIL != cdolist_list_var) {
                    final SubLObject task_entry = Hashtables.gethash(task2, task_assoc, (SubLObject)shop_basic_plan.UNPROVIDED);
                    if (shop_basic_plan.NIL == task_entry) {
                        Errors.warn((SubLObject)shop_basic_plan.$str75$tried_to_add_null_entry_to_task_l, task2);
                    }
                    else {
                        task_list = (SubLObject)ConsesLow.cons(task_entry, task_list);
                    }
                    cdolist_list_var = cdolist_list_var.rest();
                    task2 = cdolist_list_var.first();
                }
                task_strucs_$1 = shop_basic_plan_state.get_shop_basic_plan_state_task_strucs(plan_state);
                post_ordering = Sequences.reverse(task_list);
                v_bindings = task_bindings;
                simple_binding_list = simple_bindings;
                variable_manager = instances.get_slot(shop_basic_plan_state.get_shop_basic_plan_state_planner(plan_state), (SubLObject)shop_basic_plan.$sym76$VAR_MANAGER);
                total_cost = conses_high.list_length(task_pre_ordering);
                Dynamic.sublisp_throw((SubLObject)shop_basic_plan.$sym73$OUTER_CATCH_FOR_SHOP_BASIC_PLAN_METHOD, (SubLObject)shop_basic_plan.NIL);
            }
            finally {
                final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)shop_basic_plan.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    set_shop_basic_plan_variable_manager(self, variable_manager);
                    set_shop_basic_plan_open_variables(self, open_variables);
                    set_shop_basic_plan_total_cost(self, total_cost);
                    set_shop_basic_plan_simple_binding_list(self, simple_binding_list);
                    set_shop_basic_plan_bindings(self, v_bindings);
                    set_shop_basic_plan_task_strucs(self, task_strucs);
                    set_shop_basic_plan_post_ordering(self, post_ordering);
                    set_shop_basic_plan_pre_ordering(self, pre_ordering);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        }
        catch (Throwable ccatch_env_var) {
            catch_var_for_shop_basic_plan_method = Errors.handleThrowable(ccatch_env_var, (SubLObject)shop_basic_plan.$sym73$OUTER_CATCH_FOR_SHOP_BASIC_PLAN_METHOD);
        }
        finally {
            thread.throwStack.pop();
        }
        return catch_var_for_shop_basic_plan_method;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/shop-basic-plan.lisp", position = 6775L)
    public static SubLObject shop_basic_plan_ground_forms_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_shop_basic_plan_method = (SubLObject)shop_basic_plan.NIL;
        final SubLObject open_variables = get_shop_basic_plan_open_variables(self);
        final SubLObject v_bindings = get_shop_basic_plan_bindings(self);
        try {
            thread.throwStack.push(shop_basic_plan.$sym80$OUTER_CATCH_FOR_SHOP_BASIC_PLAN_METHOD);
            try {
                final SubLObject primitive_form = shop_basic_plan_primitive_form_method(self);
                if (shop_basic_plan.NIL == open_variables) {
                    Dynamic.sublisp_throw((SubLObject)shop_basic_plan.$sym80$OUTER_CATCH_FOR_SHOP_BASIC_PLAN_METHOD, (SubLObject)ConsesLow.list(primitive_form));
                }
                else {
                    Dynamic.sublisp_throw((SubLObject)shop_basic_plan.$sym80$OUTER_CATCH_FOR_SHOP_BASIC_PLAN_METHOD, multibindings.apply_multibinding(primitive_form, v_bindings));
                }
            }
            finally {
                final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)shop_basic_plan.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    set_shop_basic_plan_open_variables(self, open_variables);
                    set_shop_basic_plan_bindings(self, v_bindings);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        }
        catch (Throwable ccatch_env_var) {
            catch_var_for_shop_basic_plan_method = Errors.handleThrowable(ccatch_env_var, (SubLObject)shop_basic_plan.$sym80$OUTER_CATCH_FOR_SHOP_BASIC_PLAN_METHOD);
        }
        finally {
            thread.throwStack.pop();
        }
        return catch_var_for_shop_basic_plan_method;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/shop-basic-plan.lisp", position = 7212L)
    public static SubLObject shop_basic_plan_primitive_form_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_shop_basic_plan_method = (SubLObject)shop_basic_plan.NIL;
        final SubLObject post_ordering = get_shop_basic_plan_post_ordering(self);
        final SubLObject pre_ordering = get_shop_basic_plan_pre_ordering(self);
        try {
            thread.throwStack.push(shop_basic_plan.$sym84$OUTER_CATCH_FOR_SHOP_BASIC_PLAN_METHOD);
            try {
                final SubLObject primitive_tasks = ppo_tree_leaves(Sequences.reverse(pre_ordering), post_ordering, Symbols.symbol_function((SubLObject)shop_basic_plan.EQ));
                SubLObject primitive_forms = (SubLObject)shop_basic_plan.NIL;
                SubLObject cdolist_list_var = primitive_tasks;
                SubLObject cur_task = (SubLObject)shop_basic_plan.NIL;
                cur_task = cdolist_list_var.first();
                while (shop_basic_plan.NIL != cdolist_list_var) {
                    primitive_forms = (SubLObject)ConsesLow.cons(shop_basic_task_formula_method(cur_task), primitive_forms);
                    cdolist_list_var = cdolist_list_var.rest();
                    cur_task = cdolist_list_var.first();
                }
                Dynamic.sublisp_throw((SubLObject)shop_basic_plan.$sym84$OUTER_CATCH_FOR_SHOP_BASIC_PLAN_METHOD, Sequences.nreverse(primitive_forms));
            }
            finally {
                final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)shop_basic_plan.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    set_shop_basic_plan_post_ordering(self, post_ordering);
                    set_shop_basic_plan_pre_ordering(self, pre_ordering);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        }
        catch (Throwable ccatch_env_var) {
            catch_var_for_shop_basic_plan_method = Errors.handleThrowable(ccatch_env_var, (SubLObject)shop_basic_plan.$sym84$OUTER_CATCH_FOR_SHOP_BASIC_PLAN_METHOD);
        }
        finally {
            thread.throwStack.pop();
        }
        return catch_var_for_shop_basic_plan_method;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/shop-basic-plan.lisp", position = 7615L)
    public static SubLObject shop_basic_plan_non_primitive_pre_ordering_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_shop_basic_plan_method = (SubLObject)shop_basic_plan.NIL;
        final SubLObject pre_ordering = get_shop_basic_plan_pre_ordering(self);
        try {
            thread.throwStack.push(shop_basic_plan.$sym88$OUTER_CATCH_FOR_SHOP_BASIC_PLAN_METHOD);
            try {
                SubLObject non_primitive_list = (SubLObject)shop_basic_plan.NIL;
                SubLObject cdolist_list_var = pre_ordering;
                SubLObject cur_task = (SubLObject)shop_basic_plan.NIL;
                cur_task = cdolist_list_var.first();
                while (shop_basic_plan.NIL != cdolist_list_var) {
                    if (shop_basic_plan.NIL == shop_basic_task_primitiveP_method(cur_task)) {
                        non_primitive_list = (SubLObject)ConsesLow.cons(cur_task, non_primitive_list);
                    }
                    cdolist_list_var = cdolist_list_var.rest();
                    cur_task = cdolist_list_var.first();
                }
                Dynamic.sublisp_throw((SubLObject)shop_basic_plan.$sym88$OUTER_CATCH_FOR_SHOP_BASIC_PLAN_METHOD, non_primitive_list);
            }
            finally {
                final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)shop_basic_plan.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    set_shop_basic_plan_pre_ordering(self, pre_ordering);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        }
        catch (Throwable ccatch_env_var) {
            catch_var_for_shop_basic_plan_method = Errors.handleThrowable(ccatch_env_var, (SubLObject)shop_basic_plan.$sym88$OUTER_CATCH_FOR_SHOP_BASIC_PLAN_METHOD);
        }
        finally {
            thread.throwStack.pop();
        }
        return catch_var_for_shop_basic_plan_method;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/shop-basic-plan.lisp", position = 7970L)
    public static SubLObject shop_basic_plan_goal_task_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_shop_basic_plan_method = (SubLObject)shop_basic_plan.NIL;
        final SubLObject pre_ordering = get_shop_basic_plan_pre_ordering(self);
        try {
            thread.throwStack.push(shop_basic_plan.$sym92$OUTER_CATCH_FOR_SHOP_BASIC_PLAN_METHOD);
            try {
                Dynamic.sublisp_throw((SubLObject)shop_basic_plan.$sym92$OUTER_CATCH_FOR_SHOP_BASIC_PLAN_METHOD, list_utilities.last_one(pre_ordering));
            }
            finally {
                final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)shop_basic_plan.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    set_shop_basic_plan_pre_ordering(self, pre_ordering);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        }
        catch (Throwable ccatch_env_var) {
            catch_var_for_shop_basic_plan_method = Errors.handleThrowable(ccatch_env_var, (SubLObject)shop_basic_plan.$sym92$OUTER_CATCH_FOR_SHOP_BASIC_PLAN_METHOD);
        }
        finally {
            thread.throwStack.pop();
        }
        return catch_var_for_shop_basic_plan_method;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/shop-basic-plan.lisp", position = 8128L)
    public static SubLObject shop_basic_plan_post_ordering_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_shop_basic_plan_method = (SubLObject)shop_basic_plan.NIL;
        final SubLObject post_ordering = get_shop_basic_plan_post_ordering(self);
        try {
            thread.throwStack.push(shop_basic_plan.$sym95$OUTER_CATCH_FOR_SHOP_BASIC_PLAN_METHOD);
            try {
                Dynamic.sublisp_throw((SubLObject)shop_basic_plan.$sym95$OUTER_CATCH_FOR_SHOP_BASIC_PLAN_METHOD, post_ordering);
            }
            finally {
                final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)shop_basic_plan.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    set_shop_basic_plan_post_ordering(self, post_ordering);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        }
        catch (Throwable ccatch_env_var) {
            catch_var_for_shop_basic_plan_method = Errors.handleThrowable(ccatch_env_var, (SubLObject)shop_basic_plan.$sym95$OUTER_CATCH_FOR_SHOP_BASIC_PLAN_METHOD);
        }
        finally {
            thread.throwStack.pop();
        }
        return catch_var_for_shop_basic_plan_method;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/shop-basic-plan.lisp", position = 8216L)
    public static SubLObject shop_basic_plan_cost_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_shop_basic_plan_method = (SubLObject)shop_basic_plan.NIL;
        final SubLObject total_cost = get_shop_basic_plan_total_cost(self);
        try {
            thread.throwStack.push(shop_basic_plan.$sym99$OUTER_CATCH_FOR_SHOP_BASIC_PLAN_METHOD);
            try {
                Dynamic.sublisp_throw((SubLObject)shop_basic_plan.$sym99$OUTER_CATCH_FOR_SHOP_BASIC_PLAN_METHOD, total_cost);
            }
            finally {
                final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)shop_basic_plan.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    set_shop_basic_plan_total_cost(self, total_cost);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        }
        catch (Throwable ccatch_env_var) {
            catch_var_for_shop_basic_plan_method = Errors.handleThrowable(ccatch_env_var, (SubLObject)shop_basic_plan.$sym99$OUTER_CATCH_FOR_SHOP_BASIC_PLAN_METHOD);
        }
        finally {
            thread.throwStack.pop();
        }
        return catch_var_for_shop_basic_plan_method;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/shop-basic-plan.lisp", position = 8292L)
    public static SubLObject shop_basic_plan_variable_manager_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_shop_basic_plan_method = (SubLObject)shop_basic_plan.NIL;
        final SubLObject variable_manager = get_shop_basic_plan_variable_manager(self);
        try {
            thread.throwStack.push(shop_basic_plan.$sym102$OUTER_CATCH_FOR_SHOP_BASIC_PLAN_METHOD);
            try {
                Dynamic.sublisp_throw((SubLObject)shop_basic_plan.$sym102$OUTER_CATCH_FOR_SHOP_BASIC_PLAN_METHOD, variable_manager);
            }
            finally {
                final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)shop_basic_plan.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    set_shop_basic_plan_variable_manager(self, variable_manager);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        }
        catch (Throwable ccatch_env_var) {
            catch_var_for_shop_basic_plan_method = Errors.handleThrowable(ccatch_env_var, (SubLObject)shop_basic_plan.$sym102$OUTER_CATCH_FOR_SHOP_BASIC_PLAN_METHOD);
        }
        finally {
            thread.throwStack.pop();
        }
        return catch_var_for_shop_basic_plan_method;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/shop-basic-plan.lisp", position = 8386L)
    public static SubLObject shop_basic_plan_mbinding_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_shop_basic_plan_method = (SubLObject)shop_basic_plan.NIL;
        final SubLObject v_bindings = get_shop_basic_plan_bindings(self);
        try {
            thread.throwStack.push(shop_basic_plan.$sym105$OUTER_CATCH_FOR_SHOP_BASIC_PLAN_METHOD);
            try {
                Dynamic.sublisp_throw((SubLObject)shop_basic_plan.$sym105$OUTER_CATCH_FOR_SHOP_BASIC_PLAN_METHOD, v_bindings);
            }
            finally {
                final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)shop_basic_plan.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    set_shop_basic_plan_bindings(self, v_bindings);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        }
        catch (Throwable ccatch_env_var) {
            catch_var_for_shop_basic_plan_method = Errors.handleThrowable(ccatch_env_var, (SubLObject)shop_basic_plan.$sym105$OUTER_CATCH_FOR_SHOP_BASIC_PLAN_METHOD);
        }
        finally {
            thread.throwStack.pop();
        }
        return catch_var_for_shop_basic_plan_method;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/shop-basic-plan.lisp", position = 8464L)
    public static SubLObject shop_basic_plan_gather_planner_rules_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_shop_basic_plan_method = (SubLObject)shop_basic_plan.NIL;
        final SubLObject pre_ordering = get_shop_basic_plan_pre_ordering(self);
        try {
            thread.throwStack.push(shop_basic_plan.$sym109$OUTER_CATCH_FOR_SHOP_BASIC_PLAN_METHOD);
            try {
                SubLObject planner_rules = (SubLObject)shop_basic_plan.NIL;
                SubLObject cdolist_list_var = pre_ordering;
                SubLObject cur_item = (SubLObject)shop_basic_plan.NIL;
                cur_item = cdolist_list_var.first();
                while (shop_basic_plan.NIL != cdolist_list_var) {
                    planner_rules = (SubLObject)ConsesLow.cons(methods.funcall_instance_method_with_0_args(cur_item, (SubLObject)shop_basic_plan.$sym37$PLANNER_RULE), planner_rules);
                    cdolist_list_var = cdolist_list_var.rest();
                    cur_item = cdolist_list_var.first();
                }
                Dynamic.sublisp_throw((SubLObject)shop_basic_plan.$sym109$OUTER_CATCH_FOR_SHOP_BASIC_PLAN_METHOD, planner_rules);
            }
            finally {
                final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)shop_basic_plan.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    set_shop_basic_plan_pre_ordering(self, pre_ordering);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        }
        catch (Throwable ccatch_env_var) {
            catch_var_for_shop_basic_plan_method = Errors.handleThrowable(ccatch_env_var, (SubLObject)shop_basic_plan.$sym109$OUTER_CATCH_FOR_SHOP_BASIC_PLAN_METHOD);
        }
        finally {
            thread.throwStack.pop();
        }
        return catch_var_for_shop_basic_plan_method;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/shop-basic-plan.lisp", position = 8799L)
    public static SubLObject shop_basic_plan_gather_preconditions_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_shop_basic_plan_method = (SubLObject)shop_basic_plan.NIL;
        final SubLObject pre_ordering = get_shop_basic_plan_pre_ordering(self);
        try {
            thread.throwStack.push(shop_basic_plan.$sym113$OUTER_CATCH_FOR_SHOP_BASIC_PLAN_METHOD);
            try {
                SubLObject planner_rules = (SubLObject)shop_basic_plan.NIL;
                SubLObject cdolist_list_var = pre_ordering;
                SubLObject cur_item = (SubLObject)shop_basic_plan.NIL;
                cur_item = cdolist_list_var.first();
                while (shop_basic_plan.NIL != cdolist_list_var) {
                    planner_rules = (SubLObject)ConsesLow.cons(methods.funcall_instance_method_with_0_args(cur_item, (SubLObject)shop_basic_plan.$sym44$PRECONDITION), planner_rules);
                    cdolist_list_var = cdolist_list_var.rest();
                    cur_item = cdolist_list_var.first();
                }
                Dynamic.sublisp_throw((SubLObject)shop_basic_plan.$sym113$OUTER_CATCH_FOR_SHOP_BASIC_PLAN_METHOD, planner_rules);
            }
            finally {
                final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)shop_basic_plan.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    set_shop_basic_plan_pre_ordering(self, pre_ordering);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        }
        catch (Throwable ccatch_env_var) {
            catch_var_for_shop_basic_plan_method = Errors.handleThrowable(ccatch_env_var, (SubLObject)shop_basic_plan.$sym113$OUTER_CATCH_FOR_SHOP_BASIC_PLAN_METHOD);
        }
        finally {
            thread.throwStack.pop();
        }
        return catch_var_for_shop_basic_plan_method;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/shop-basic-plan.lisp", position = 9064L)
    public static SubLObject shop_basic_plan_single_agent_planP_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_shop_basic_plan_method = (SubLObject)shop_basic_plan.NIL;
        final SubLObject simple_binding_list = get_shop_basic_plan_simple_binding_list(self);
        final SubLObject pre_ordering = get_shop_basic_plan_pre_ordering(self);
        try {
            thread.throwStack.push(shop_basic_plan.$sym117$OUTER_CATCH_FOR_SHOP_BASIC_PLAN_METHOD);
            try {
                final SubLObject first_agent = cycl_utilities.formula_arg1(conses_high.sublis(simple_binding_list, methods.funcall_instance_method_with_0_args(pre_ordering.first(), (SubLObject)shop_basic_plan.$sym12$FORMULA), (SubLObject)shop_basic_plan.UNPROVIDED, (SubLObject)shop_basic_plan.UNPROVIDED), (SubLObject)shop_basic_plan.UNPROVIDED);
                SubLObject cdolist_list_var = pre_ordering.rest();
                SubLObject cur_task = (SubLObject)shop_basic_plan.NIL;
                cur_task = cdolist_list_var.first();
                while (shop_basic_plan.NIL != cdolist_list_var) {
                    if (!first_agent.equal(cycl_utilities.formula_arg1(conses_high.sublis(simple_binding_list, methods.funcall_instance_method_with_0_args(cur_task, (SubLObject)shop_basic_plan.$sym12$FORMULA), (SubLObject)shop_basic_plan.UNPROVIDED, (SubLObject)shop_basic_plan.UNPROVIDED), (SubLObject)shop_basic_plan.UNPROVIDED))) {
                        Dynamic.sublisp_throw((SubLObject)shop_basic_plan.$sym117$OUTER_CATCH_FOR_SHOP_BASIC_PLAN_METHOD, (SubLObject)shop_basic_plan.NIL);
                    }
                    cdolist_list_var = cdolist_list_var.rest();
                    cur_task = cdolist_list_var.first();
                }
                Dynamic.sublisp_throw((SubLObject)shop_basic_plan.$sym117$OUTER_CATCH_FOR_SHOP_BASIC_PLAN_METHOD, (SubLObject)shop_basic_plan.T);
            }
            finally {
                final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)shop_basic_plan.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    set_shop_basic_plan_simple_binding_list(self, simple_binding_list);
                    set_shop_basic_plan_pre_ordering(self, pre_ordering);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        }
        catch (Throwable ccatch_env_var) {
            catch_var_for_shop_basic_plan_method = Errors.handleThrowable(ccatch_env_var, (SubLObject)shop_basic_plan.$sym117$OUTER_CATCH_FOR_SHOP_BASIC_PLAN_METHOD);
        }
        finally {
            thread.throwStack.pop();
        }
        return catch_var_for_shop_basic_plan_method;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/shop-basic-plan.lisp", position = 9646L)
    public static SubLObject shop_process_open_variables(final SubLObject v_object, final SubLObject mbinding, SubLObject open_vars) {
        if (open_vars == shop_basic_plan.UNPROVIDED) {
            open_vars = (SubLObject)shop_basic_plan.NIL;
        }
        final SubLObject object_vars = list_utilities.tree_gather(v_object, (SubLObject)shop_basic_plan.$sym119$SHOP_VARIABLEP, (SubLObject)shop_basic_plan.UNPROVIDED, (SubLObject)shop_basic_plan.UNPROVIDED, (SubLObject)shop_basic_plan.UNPROVIDED);
        if (shop_basic_plan.NIL == open_vars) {
            SubLObject cdolist_list_var = object_vars;
            SubLObject cur_var = (SubLObject)shop_basic_plan.NIL;
            cur_var = cdolist_list_var.first();
            while (shop_basic_plan.NIL != cdolist_list_var) {
                if (shop_basic_plan.NIL == multibindings.atomic_binding_in_multibindingP(cur_var, mbinding)) {
                    open_vars = (SubLObject)ConsesLow.cons(cur_var, open_vars);
                }
                cdolist_list_var = cdolist_list_var.rest();
                cur_var = cdolist_list_var.first();
            }
        }
        return Values.values(v_object, open_vars);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/shop-basic-plan.lisp", position = 10463L)
    public static SubLObject ppo_tree_leaves(final SubLObject pre, final SubLObject post, SubLObject test) {
        if (test == shop_basic_plan.UNPROVIDED) {
            test = Symbols.symbol_function((SubLObject)shop_basic_plan.EQ);
        }
        SubLObject leaves = (SubLObject)shop_basic_plan.NIL;
        SubLObject cur_pre;
        SubLObject cur_item;
        SubLObject next_item;
        for (cur_pre = (SubLObject)shop_basic_plan.NIL, cur_pre = pre; shop_basic_plan.NIL != cur_pre; cur_pre = cur_pre.rest()) {
            cur_item = cur_pre.first();
            next_item = conses_high.second(cur_pre);
            if (shop_basic_plan.NIL != list_utilities.singletonP(cur_pre)) {
                leaves = (SubLObject)ConsesLow.cons(cur_item, leaves);
            }
            else if (shop_basic_plan.NIL == ppo_tree_ancestorP(pre, post, cur_item, next_item, test)) {
                leaves = (SubLObject)ConsesLow.cons(cur_item, leaves);
            }
        }
        return Sequences.nreverse(leaves);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/shop-basic-plan.lisp", position = 11289L)
    public static SubLObject ppo_tree_ancestorP(final SubLObject pre, final SubLObject post, final SubLObject item1, final SubLObject item2, SubLObject test) {
        if (test == shop_basic_plan.UNPROVIDED) {
            test = Symbols.symbol_function((SubLObject)shop_basic_plan.EQ);
        }
        return (SubLObject)SubLObjectFactory.makeBoolean(shop_basic_plan.NIL != list_utilities.position_L(item1, item2, pre, test, (SubLObject)shop_basic_plan.UNPROVIDED) && shop_basic_plan.NIL != list_utilities.position_L(item2, item1, post, test, (SubLObject)shop_basic_plan.UNPROVIDED));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/shop-basic-plan.lisp", position = 11657L)
    public static SubLObject ppo_tree_descendantP(final SubLObject pre, final SubLObject post, final SubLObject item1, final SubLObject item2, SubLObject test) {
        if (test == shop_basic_plan.UNPROVIDED) {
            test = Symbols.symbol_function((SubLObject)shop_basic_plan.EQ);
        }
        return ppo_tree_ancestorP(pre, post, item2, item1, test);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/shop-basic-plan.lisp", position = 11995L)
    public static SubLObject do_ppo_tree_depth(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)shop_basic_plan.$list120);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject item = (SubLObject)shop_basic_plan.NIL;
        SubLObject depth = (SubLObject)shop_basic_plan.NIL;
        SubLObject pre = (SubLObject)shop_basic_plan.NIL;
        SubLObject post = (SubLObject)shop_basic_plan.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)shop_basic_plan.$list120);
        item = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)shop_basic_plan.$list120);
        depth = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)shop_basic_plan.$list120);
        pre = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)shop_basic_plan.$list120);
        post = current.first();
        current = current.rest();
        final SubLObject test = current.isCons() ? current.first() : Symbols.symbol_function((SubLObject)shop_basic_plan.EQ);
        cdestructuring_bind.destructuring_bind_must_listp(current, datum, (SubLObject)shop_basic_plan.$list120);
        current = current.rest();
        if (shop_basic_plan.NIL == current) {
            final SubLObject body;
            current = (body = temp);
            final SubLObject cur_pre = (SubLObject)shop_basic_plan.$sym121$CUR_PRE;
            final SubLObject next = (SubLObject)shop_basic_plan.$sym122$NEXT;
            final SubLObject stack = (SubLObject)shop_basic_plan.$sym123$STACK;
            return (SubLObject)ConsesLow.list((SubLObject)shop_basic_plan.$sym124$CLET, (SubLObject)ConsesLow.list(reader.bq_cons(stack, (SubLObject)shop_basic_plan.$list125), reader.bq_cons(depth, (SubLObject)shop_basic_plan.$list126)), (SubLObject)ConsesLow.list((SubLObject)shop_basic_plan.$sym127$CDO, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(cur_pre, pre, (SubLObject)ConsesLow.list((SubLObject)shop_basic_plan.$sym128$REST, cur_pre))), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)shop_basic_plan.$sym129$NULL, cur_pre)), (SubLObject)ConsesLow.listS((SubLObject)shop_basic_plan.$sym124$CLET, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(item, (SubLObject)ConsesLow.list((SubLObject)shop_basic_plan.$sym130$FIRST, cur_pre)), (SubLObject)ConsesLow.list(next, (SubLObject)ConsesLow.list((SubLObject)shop_basic_plan.$sym131$SECOND, cur_pre))), (SubLObject)ConsesLow.list((SubLObject)shop_basic_plan.$sym132$WHILE, (SubLObject)ConsesLow.list((SubLObject)shop_basic_plan.$sym133$CAND, (SubLObject)ConsesLow.list((SubLObject)shop_basic_plan.$sym134$CNOT, (SubLObject)ConsesLow.list((SubLObject)shop_basic_plan.$sym135$PPO_TREE_DESCENDANT_, pre, post, item, (SubLObject)ConsesLow.list((SubLObject)shop_basic_plan.$sym130$FIRST, stack), test)), (SubLObject)ConsesLow.list((SubLObject)shop_basic_plan.$sym134$CNOT, (SubLObject)ConsesLow.list((SubLObject)shop_basic_plan.$sym129$NULL, stack))), (SubLObject)ConsesLow.list((SubLObject)shop_basic_plan.$sym136$CDEC, depth), (SubLObject)ConsesLow.list((SubLObject)shop_basic_plan.$sym137$CPOP, stack)), ConsesLow.append(body, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)shop_basic_plan.$sym138$PWHEN, (SubLObject)ConsesLow.list((SubLObject)shop_basic_plan.$sym135$PPO_TREE_DESCENDANT_, pre, post, next, item, test), (SubLObject)ConsesLow.list((SubLObject)shop_basic_plan.$sym139$CINC, depth), (SubLObject)ConsesLow.list((SubLObject)shop_basic_plan.$sym140$CPUSH, item, stack)))))));
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)shop_basic_plan.$list120);
        return (SubLObject)shop_basic_plan.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/shop-basic-plan.lisp", position = 12633L)
    public static SubLObject shop_plan_compare(final SubLObject plan1, final SubLObject plan2) {
        SubLObject entry1 = (SubLObject)shop_basic_plan.NIL;
        SubLObject entry1_$6 = (SubLObject)shop_basic_plan.NIL;
        SubLObject entry2 = (SubLObject)shop_basic_plan.NIL;
        SubLObject entry2_$7 = (SubLObject)shop_basic_plan.NIL;
        entry1 = get_shop_basic_plan_post_ordering(plan1);
        entry1_$6 = entry1.first();
        entry2 = get_shop_basic_plan_post_ordering(plan2);
        entry2_$7 = entry2.first();
        while (shop_basic_plan.NIL != entry2 || shop_basic_plan.NIL != entry1) {
            final SubLObject sentence1 = methods.funcall_instance_method_with_0_args(entry1_$6, (SubLObject)shop_basic_plan.$sym12$FORMULA);
            final SubLObject sentence2 = methods.funcall_instance_method_with_0_args(entry2_$7, (SubLObject)shop_basic_plan.$sym12$FORMULA);
            if (!sentence1.equal(sentence2)) {
                return (SubLObject)ConsesLow.list(sentence1, sentence2);
            }
            entry1 = entry1.rest();
            entry1_$6 = entry1.first();
            entry2 = entry2.rest();
            entry2_$7 = entry2.first();
        }
        return (SubLObject)shop_basic_plan.T;
    }
    
    public static SubLObject declare_shop_basic_plan_file() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.shop_basic_plan", "shop_task_p", "SHOP-TASK-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.shop_basic_plan", "get_shop_basic_task_status", "GET-SHOP-BASIC-TASK-STATUS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.shop_basic_plan", "set_shop_basic_task_status", "SET-SHOP-BASIC-TASK-STATUS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.shop_basic_plan", "get_shop_basic_task_task_struc", "GET-SHOP-BASIC-TASK-TASK-STRUC", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.shop_basic_plan", "set_shop_basic_task_task_struc", "SET-SHOP-BASIC-TASK-TASK-STRUC", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.shop_basic_plan", "get_shop_basic_task_precond", "GET-SHOP-BASIC-TASK-PRECOND", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.shop_basic_plan", "set_shop_basic_task_precond", "SET-SHOP-BASIC-TASK-PRECOND", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.shop_basic_plan", "get_shop_basic_task_bindings", "GET-SHOP-BASIC-TASK-BINDINGS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.shop_basic_plan", "set_shop_basic_task_bindings", "SET-SHOP-BASIC-TASK-BINDINGS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.shop_basic_plan", "get_shop_basic_task_formula", "GET-SHOP-BASIC-TASK-FORMULA", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.shop_basic_plan", "set_shop_basic_task_formula", "SET-SHOP-BASIC-TASK-FORMULA", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.shop_basic_plan", "subloop_reserved_initialize_shop_basic_task_class", "SUBLOOP-RESERVED-INITIALIZE-SHOP-BASIC-TASK-CLASS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.shop_basic_plan", "subloop_reserved_initialize_shop_basic_task_instance", "SUBLOOP-RESERVED-INITIALIZE-SHOP-BASIC-TASK-INSTANCE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.shop_basic_plan", "shop_basic_task_p", "SHOP-BASIC-TASK-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.shop_basic_plan", "shop_basic_task_strip_task_method", "SHOP-BASIC-TASK-STRIP-TASK-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.shop_basic_plan", "shop_basic_task_print_method", "SHOP-BASIC-TASK-PRINT-METHOD", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.shop_basic_plan", "shop_basic_task_init_method", "SHOP-BASIC-TASK-INIT-METHOD", 5, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.shop_basic_plan", "shop_basic_task_planner_rule_method", "SHOP-BASIC-TASK-PLANNER-RULE-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.shop_basic_plan", "shop_basic_task_formula_method", "SHOP-BASIC-TASK-FORMULA-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.shop_basic_plan", "shop_basic_task_precondition_method", "SHOP-BASIC-TASK-PRECONDITION-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.shop_basic_plan", "shop_basic_task_primitiveP_method", "SHOP-BASIC-TASK-PRIMITIVE?-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.shop_basic_plan", "shop_basic_task_mbindings_method", "SHOP-BASIC-TASK-MBINDINGS-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.shop_basic_plan", "shop_plan_i_p", "SHOP-PLAN-I-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.shop_basic_plan", "get_shop_basic_plan_variable_manager", "GET-SHOP-BASIC-PLAN-VARIABLE-MANAGER", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.shop_basic_plan", "set_shop_basic_plan_variable_manager", "SET-SHOP-BASIC-PLAN-VARIABLE-MANAGER", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.shop_basic_plan", "get_shop_basic_plan_open_variables", "GET-SHOP-BASIC-PLAN-OPEN-VARIABLES", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.shop_basic_plan", "set_shop_basic_plan_open_variables", "SET-SHOP-BASIC-PLAN-OPEN-VARIABLES", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.shop_basic_plan", "get_shop_basic_plan_total_cost", "GET-SHOP-BASIC-PLAN-TOTAL-COST", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.shop_basic_plan", "set_shop_basic_plan_total_cost", "SET-SHOP-BASIC-PLAN-TOTAL-COST", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.shop_basic_plan", "get_shop_basic_plan_simple_binding_list", "GET-SHOP-BASIC-PLAN-SIMPLE-BINDING-LIST", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.shop_basic_plan", "set_shop_basic_plan_simple_binding_list", "SET-SHOP-BASIC-PLAN-SIMPLE-BINDING-LIST", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.shop_basic_plan", "get_shop_basic_plan_bindings", "GET-SHOP-BASIC-PLAN-BINDINGS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.shop_basic_plan", "set_shop_basic_plan_bindings", "SET-SHOP-BASIC-PLAN-BINDINGS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.shop_basic_plan", "get_shop_basic_plan_task_strucs", "GET-SHOP-BASIC-PLAN-TASK-STRUCS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.shop_basic_plan", "set_shop_basic_plan_task_strucs", "SET-SHOP-BASIC-PLAN-TASK-STRUCS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.shop_basic_plan", "get_shop_basic_plan_post_ordering", "GET-SHOP-BASIC-PLAN-POST-ORDERING", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.shop_basic_plan", "set_shop_basic_plan_post_ordering", "SET-SHOP-BASIC-PLAN-POST-ORDERING", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.shop_basic_plan", "get_shop_basic_plan_pre_ordering", "GET-SHOP-BASIC-PLAN-PRE-ORDERING", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.shop_basic_plan", "set_shop_basic_plan_pre_ordering", "SET-SHOP-BASIC-PLAN-PRE-ORDERING", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.shop_basic_plan", "subloop_reserved_initialize_shop_basic_plan_class", "SUBLOOP-RESERVED-INITIALIZE-SHOP-BASIC-PLAN-CLASS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.shop_basic_plan", "subloop_reserved_initialize_shop_basic_plan_instance", "SUBLOOP-RESERVED-INITIALIZE-SHOP-BASIC-PLAN-INSTANCE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.shop_basic_plan", "shop_basic_plan_p", "SHOP-BASIC-PLAN-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.shop_basic_plan", "shop_basic_plan_populate_plan_method", "SHOP-BASIC-PLAN-POPULATE-PLAN-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.shop_basic_plan", "shop_basic_plan_ground_forms_method", "SHOP-BASIC-PLAN-GROUND-FORMS-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.shop_basic_plan", "shop_basic_plan_primitive_form_method", "SHOP-BASIC-PLAN-PRIMITIVE-FORM-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.shop_basic_plan", "shop_basic_plan_non_primitive_pre_ordering_method", "SHOP-BASIC-PLAN-NON-PRIMITIVE-PRE-ORDERING-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.shop_basic_plan", "shop_basic_plan_goal_task_method", "SHOP-BASIC-PLAN-GOAL-TASK-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.shop_basic_plan", "shop_basic_plan_post_ordering_method", "SHOP-BASIC-PLAN-POST-ORDERING-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.shop_basic_plan", "shop_basic_plan_cost_method", "SHOP-BASIC-PLAN-COST-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.shop_basic_plan", "shop_basic_plan_variable_manager_method", "SHOP-BASIC-PLAN-VARIABLE-MANAGER-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.shop_basic_plan", "shop_basic_plan_mbinding_method", "SHOP-BASIC-PLAN-MBINDING-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.shop_basic_plan", "shop_basic_plan_gather_planner_rules_method", "SHOP-BASIC-PLAN-GATHER-PLANNER-RULES-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.shop_basic_plan", "shop_basic_plan_gather_preconditions_method", "SHOP-BASIC-PLAN-GATHER-PRECONDITIONS-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.shop_basic_plan", "shop_basic_plan_single_agent_planP_method", "SHOP-BASIC-PLAN-SINGLE-AGENT-PLAN?-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.shop_basic_plan", "shop_process_open_variables", "SHOP-PROCESS-OPEN-VARIABLES", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.shop_basic_plan", "ppo_tree_leaves", "PPO-TREE-LEAVES", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.shop_basic_plan", "ppo_tree_ancestorP", "PPO-TREE-ANCESTOR?", 4, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.shop_basic_plan", "ppo_tree_descendantP", "PPO-TREE-DESCENDANT?", 4, 1, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.shop_basic_plan", "do_ppo_tree_depth", "DO-PPO-TREE-DEPTH");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.shop_basic_plan", "shop_plan_compare", "SHOP-PLAN-COMPARE", 2, 0, false);
        return (SubLObject)shop_basic_plan.NIL;
    }
    
    public static SubLObject init_shop_basic_plan_file() {
        return (SubLObject)shop_basic_plan.NIL;
    }
    
    public static SubLObject setup_shop_basic_plan_file() {
        interfaces.new_interface((SubLObject)shop_basic_plan.$sym0$SHOP_TASK, (SubLObject)shop_basic_plan.NIL, (SubLObject)shop_basic_plan.NIL, (SubLObject)shop_basic_plan.$list1);
        classes.subloop_new_class((SubLObject)shop_basic_plan.$sym2$SHOP_BASIC_TASK, (SubLObject)shop_basic_plan.$sym3$SHOP_INDEXED_OBJECT, (SubLObject)shop_basic_plan.$list4, (SubLObject)shop_basic_plan.NIL, (SubLObject)shop_basic_plan.$list5);
        classes.class_set_implements_slot_listeners((SubLObject)shop_basic_plan.$sym2$SHOP_BASIC_TASK, (SubLObject)shop_basic_plan.NIL);
        classes.subloop_note_class_initialization_function((SubLObject)shop_basic_plan.$sym2$SHOP_BASIC_TASK, (SubLObject)shop_basic_plan.$sym9$SUBLOOP_RESERVED_INITIALIZE_SHOP_BASIC_TASK_CLASS);
        classes.subloop_note_instance_initialization_function((SubLObject)shop_basic_plan.$sym2$SHOP_BASIC_TASK, (SubLObject)shop_basic_plan.$sym17$SUBLOOP_RESERVED_INITIALIZE_SHOP_BASIC_TASK_INSTANCE);
        subloop_reserved_initialize_shop_basic_task_class((SubLObject)shop_basic_plan.$sym2$SHOP_BASIC_TASK);
        methods.methods_incorporate_instance_method((SubLObject)shop_basic_plan.$sym18$STRIP_TASK, (SubLObject)shop_basic_plan.$sym2$SHOP_BASIC_TASK, (SubLObject)shop_basic_plan.NIL, (SubLObject)shop_basic_plan.NIL, (SubLObject)shop_basic_plan.$list19);
        methods.subloop_register_instance_method((SubLObject)shop_basic_plan.$sym2$SHOP_BASIC_TASK, (SubLObject)shop_basic_plan.$sym18$STRIP_TASK, (SubLObject)shop_basic_plan.$sym21$SHOP_BASIC_TASK_STRIP_TASK_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)shop_basic_plan.$sym22$PRINT, (SubLObject)shop_basic_plan.$sym2$SHOP_BASIC_TASK, (SubLObject)shop_basic_plan.$list23, (SubLObject)shop_basic_plan.$list24, (SubLObject)shop_basic_plan.$list25);
        methods.subloop_register_instance_method((SubLObject)shop_basic_plan.$sym2$SHOP_BASIC_TASK, (SubLObject)shop_basic_plan.$sym22$PRINT, (SubLObject)shop_basic_plan.$sym29$SHOP_BASIC_TASK_PRINT_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)shop_basic_plan.$sym30$INIT, (SubLObject)shop_basic_plan.$sym2$SHOP_BASIC_TASK, (SubLObject)shop_basic_plan.$list23, (SubLObject)shop_basic_plan.$list31, (SubLObject)shop_basic_plan.$list32);
        methods.subloop_register_instance_method((SubLObject)shop_basic_plan.$sym2$SHOP_BASIC_TASK, (SubLObject)shop_basic_plan.$sym30$INIT, (SubLObject)shop_basic_plan.$sym36$SHOP_BASIC_TASK_INIT_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)shop_basic_plan.$sym37$PLANNER_RULE, (SubLObject)shop_basic_plan.$sym2$SHOP_BASIC_TASK, (SubLObject)shop_basic_plan.$list23, (SubLObject)shop_basic_plan.NIL, (SubLObject)shop_basic_plan.$list38);
        methods.subloop_register_instance_method((SubLObject)shop_basic_plan.$sym2$SHOP_BASIC_TASK, (SubLObject)shop_basic_plan.$sym37$PLANNER_RULE, (SubLObject)shop_basic_plan.$sym40$SHOP_BASIC_TASK_PLANNER_RULE_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)shop_basic_plan.$sym12$FORMULA, (SubLObject)shop_basic_plan.$sym2$SHOP_BASIC_TASK, (SubLObject)shop_basic_plan.$list23, (SubLObject)shop_basic_plan.NIL, (SubLObject)shop_basic_plan.$list41);
        methods.subloop_register_instance_method((SubLObject)shop_basic_plan.$sym2$SHOP_BASIC_TASK, (SubLObject)shop_basic_plan.$sym12$FORMULA, (SubLObject)shop_basic_plan.$sym43$SHOP_BASIC_TASK_FORMULA_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)shop_basic_plan.$sym44$PRECONDITION, (SubLObject)shop_basic_plan.$sym2$SHOP_BASIC_TASK, (SubLObject)shop_basic_plan.$list23, (SubLObject)shop_basic_plan.NIL, (SubLObject)shop_basic_plan.$list45);
        methods.subloop_register_instance_method((SubLObject)shop_basic_plan.$sym2$SHOP_BASIC_TASK, (SubLObject)shop_basic_plan.$sym44$PRECONDITION, (SubLObject)shop_basic_plan.$sym47$SHOP_BASIC_TASK_PRECONDITION_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)shop_basic_plan.$sym48$PRIMITIVE_, (SubLObject)shop_basic_plan.$sym2$SHOP_BASIC_TASK, (SubLObject)shop_basic_plan.$list23, (SubLObject)shop_basic_plan.NIL, (SubLObject)shop_basic_plan.$list49);
        methods.subloop_register_instance_method((SubLObject)shop_basic_plan.$sym2$SHOP_BASIC_TASK, (SubLObject)shop_basic_plan.$sym48$PRIMITIVE_, (SubLObject)shop_basic_plan.$sym51$SHOP_BASIC_TASK_PRIMITIVE__METHOD);
        methods.methods_incorporate_instance_method((SubLObject)shop_basic_plan.$sym52$MBINDINGS, (SubLObject)shop_basic_plan.$sym2$SHOP_BASIC_TASK, (SubLObject)shop_basic_plan.$list23, (SubLObject)shop_basic_plan.NIL, (SubLObject)shop_basic_plan.$list53);
        methods.subloop_register_instance_method((SubLObject)shop_basic_plan.$sym2$SHOP_BASIC_TASK, (SubLObject)shop_basic_plan.$sym52$MBINDINGS, (SubLObject)shop_basic_plan.$sym55$SHOP_BASIC_TASK_MBINDINGS_METHOD);
        interfaces.new_interface((SubLObject)shop_basic_plan.$sym56$SHOP_PLAN_I, (SubLObject)shop_basic_plan.NIL, (SubLObject)shop_basic_plan.NIL, (SubLObject)shop_basic_plan.$list57);
        classes.subloop_new_class((SubLObject)shop_basic_plan.$sym58$SHOP_BASIC_PLAN, (SubLObject)shop_basic_plan.$sym6$OBJECT, (SubLObject)shop_basic_plan.$list59, (SubLObject)shop_basic_plan.NIL, (SubLObject)shop_basic_plan.$list60);
        classes.class_set_implements_slot_listeners((SubLObject)shop_basic_plan.$sym58$SHOP_BASIC_PLAN, (SubLObject)shop_basic_plan.NIL);
        classes.subloop_note_class_initialization_function((SubLObject)shop_basic_plan.$sym58$SHOP_BASIC_PLAN, (SubLObject)shop_basic_plan.$sym61$SUBLOOP_RESERVED_INITIALIZE_SHOP_BASIC_PLAN_CLASS);
        classes.subloop_note_instance_initialization_function((SubLObject)shop_basic_plan.$sym58$SHOP_BASIC_PLAN, (SubLObject)shop_basic_plan.$sym69$SUBLOOP_RESERVED_INITIALIZE_SHOP_BASIC_PLAN_INSTANCE);
        subloop_reserved_initialize_shop_basic_plan_class((SubLObject)shop_basic_plan.$sym58$SHOP_BASIC_PLAN);
        methods.methods_incorporate_instance_method((SubLObject)shop_basic_plan.$sym70$POPULATE_PLAN, (SubLObject)shop_basic_plan.$sym58$SHOP_BASIC_PLAN, (SubLObject)shop_basic_plan.$list23, (SubLObject)shop_basic_plan.$list71, (SubLObject)shop_basic_plan.$list72);
        methods.subloop_register_instance_method((SubLObject)shop_basic_plan.$sym58$SHOP_BASIC_PLAN, (SubLObject)shop_basic_plan.$sym70$POPULATE_PLAN, (SubLObject)shop_basic_plan.$sym77$SHOP_BASIC_PLAN_POPULATE_PLAN_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)shop_basic_plan.$sym78$GROUND_FORMS, (SubLObject)shop_basic_plan.$sym58$SHOP_BASIC_PLAN, (SubLObject)shop_basic_plan.$list23, (SubLObject)shop_basic_plan.NIL, (SubLObject)shop_basic_plan.$list79);
        methods.subloop_register_instance_method((SubLObject)shop_basic_plan.$sym58$SHOP_BASIC_PLAN, (SubLObject)shop_basic_plan.$sym78$GROUND_FORMS, (SubLObject)shop_basic_plan.$sym81$SHOP_BASIC_PLAN_GROUND_FORMS_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)shop_basic_plan.$sym82$PRIMITIVE_FORM, (SubLObject)shop_basic_plan.$sym58$SHOP_BASIC_PLAN, (SubLObject)shop_basic_plan.$list23, (SubLObject)shop_basic_plan.NIL, (SubLObject)shop_basic_plan.$list83);
        methods.subloop_register_instance_method((SubLObject)shop_basic_plan.$sym58$SHOP_BASIC_PLAN, (SubLObject)shop_basic_plan.$sym82$PRIMITIVE_FORM, (SubLObject)shop_basic_plan.$sym85$SHOP_BASIC_PLAN_PRIMITIVE_FORM_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)shop_basic_plan.$sym86$NON_PRIMITIVE_PRE_ORDERING, (SubLObject)shop_basic_plan.$sym58$SHOP_BASIC_PLAN, (SubLObject)shop_basic_plan.$list23, (SubLObject)shop_basic_plan.NIL, (SubLObject)shop_basic_plan.$list87);
        methods.subloop_register_instance_method((SubLObject)shop_basic_plan.$sym58$SHOP_BASIC_PLAN, (SubLObject)shop_basic_plan.$sym86$NON_PRIMITIVE_PRE_ORDERING, (SubLObject)shop_basic_plan.$sym89$SHOP_BASIC_PLAN_NON_PRIMITIVE_PRE_ORDERING_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)shop_basic_plan.$sym90$GOAL_TASK, (SubLObject)shop_basic_plan.$sym58$SHOP_BASIC_PLAN, (SubLObject)shop_basic_plan.$list23, (SubLObject)shop_basic_plan.NIL, (SubLObject)shop_basic_plan.$list91);
        methods.subloop_register_instance_method((SubLObject)shop_basic_plan.$sym58$SHOP_BASIC_PLAN, (SubLObject)shop_basic_plan.$sym90$GOAL_TASK, (SubLObject)shop_basic_plan.$sym93$SHOP_BASIC_PLAN_GOAL_TASK_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)shop_basic_plan.$sym63$POST_ORDERING, (SubLObject)shop_basic_plan.$sym58$SHOP_BASIC_PLAN, (SubLObject)shop_basic_plan.$list23, (SubLObject)shop_basic_plan.NIL, (SubLObject)shop_basic_plan.$list94);
        methods.subloop_register_instance_method((SubLObject)shop_basic_plan.$sym58$SHOP_BASIC_PLAN, (SubLObject)shop_basic_plan.$sym63$POST_ORDERING, (SubLObject)shop_basic_plan.$sym96$SHOP_BASIC_PLAN_POST_ORDERING_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)shop_basic_plan.$sym97$COST, (SubLObject)shop_basic_plan.$sym58$SHOP_BASIC_PLAN, (SubLObject)shop_basic_plan.$list23, (SubLObject)shop_basic_plan.NIL, (SubLObject)shop_basic_plan.$list98);
        methods.subloop_register_instance_method((SubLObject)shop_basic_plan.$sym58$SHOP_BASIC_PLAN, (SubLObject)shop_basic_plan.$sym97$COST, (SubLObject)shop_basic_plan.$sym100$SHOP_BASIC_PLAN_COST_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)shop_basic_plan.$sym68$VARIABLE_MANAGER, (SubLObject)shop_basic_plan.$sym58$SHOP_BASIC_PLAN, (SubLObject)shop_basic_plan.$list23, (SubLObject)shop_basic_plan.NIL, (SubLObject)shop_basic_plan.$list101);
        methods.subloop_register_instance_method((SubLObject)shop_basic_plan.$sym58$SHOP_BASIC_PLAN, (SubLObject)shop_basic_plan.$sym68$VARIABLE_MANAGER, (SubLObject)shop_basic_plan.$sym103$SHOP_BASIC_PLAN_VARIABLE_MANAGER_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)shop_basic_plan.$sym104$MBINDING, (SubLObject)shop_basic_plan.$sym58$SHOP_BASIC_PLAN, (SubLObject)shop_basic_plan.$list23, (SubLObject)shop_basic_plan.NIL, (SubLObject)shop_basic_plan.$list53);
        methods.subloop_register_instance_method((SubLObject)shop_basic_plan.$sym58$SHOP_BASIC_PLAN, (SubLObject)shop_basic_plan.$sym104$MBINDING, (SubLObject)shop_basic_plan.$sym106$SHOP_BASIC_PLAN_MBINDING_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)shop_basic_plan.$sym107$GATHER_PLANNER_RULES, (SubLObject)shop_basic_plan.$sym58$SHOP_BASIC_PLAN, (SubLObject)shop_basic_plan.$list23, (SubLObject)shop_basic_plan.NIL, (SubLObject)shop_basic_plan.$list108);
        methods.subloop_register_instance_method((SubLObject)shop_basic_plan.$sym58$SHOP_BASIC_PLAN, (SubLObject)shop_basic_plan.$sym107$GATHER_PLANNER_RULES, (SubLObject)shop_basic_plan.$sym110$SHOP_BASIC_PLAN_GATHER_PLANNER_RULES_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)shop_basic_plan.$sym111$GATHER_PRECONDITIONS, (SubLObject)shop_basic_plan.$sym58$SHOP_BASIC_PLAN, (SubLObject)shop_basic_plan.$list23, (SubLObject)shop_basic_plan.NIL, (SubLObject)shop_basic_plan.$list112);
        methods.subloop_register_instance_method((SubLObject)shop_basic_plan.$sym58$SHOP_BASIC_PLAN, (SubLObject)shop_basic_plan.$sym111$GATHER_PRECONDITIONS, (SubLObject)shop_basic_plan.$sym114$SHOP_BASIC_PLAN_GATHER_PRECONDITIONS_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)shop_basic_plan.$sym115$SINGLE_AGENT_PLAN_, (SubLObject)shop_basic_plan.$sym58$SHOP_BASIC_PLAN, (SubLObject)shop_basic_plan.$list23, (SubLObject)shop_basic_plan.NIL, (SubLObject)shop_basic_plan.$list116);
        methods.subloop_register_instance_method((SubLObject)shop_basic_plan.$sym58$SHOP_BASIC_PLAN, (SubLObject)shop_basic_plan.$sym115$SINGLE_AGENT_PLAN_, (SubLObject)shop_basic_plan.$sym118$SHOP_BASIC_PLAN_SINGLE_AGENT_PLAN__METHOD);
        return (SubLObject)shop_basic_plan.NIL;
    }
    
    @Override
	public void declareFunctions() {
        declare_shop_basic_plan_file();
    }
    
    @Override
	public void initializeVariables() {
        init_shop_basic_plan_file();
    }
    
    @Override
	public void runTopLevelForms() {
        setup_shop_basic_plan_file();
    }
    
    static {
        me = (SubLFile)new shop_basic_plan();
        $sym0$SHOP_TASK = SubLObjectFactory.makeSymbol("SHOP-TASK");
        $list1 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("FORMULA"), (SubLObject)shop_basic_plan.NIL, (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("MBINDINGS"), (SubLObject)shop_basic_plan.NIL, (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("INIT"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TASK"), (SubLObject)SubLObjectFactory.makeSymbol("BINDING"), (SubLObject)SubLObjectFactory.makeSymbol("PRECOND"), (SubLObject)SubLObjectFactory.makeSymbol("TASK-STRUC")), (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("PLANNER-RULE"), (SubLObject)shop_basic_plan.NIL, (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("PRIMITIVE?"), (SubLObject)shop_basic_plan.NIL, (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")));
        $sym2$SHOP_BASIC_TASK = SubLObjectFactory.makeSymbol("SHOP-BASIC-TASK");
        $sym3$SHOP_INDEXED_OBJECT = SubLObjectFactory.makeSymbol("SHOP-INDEXED-OBJECT");
        $list4 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SHOP-TASK"));
        $list5 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FORMULA"), (SubLObject)SubLObjectFactory.makeKeyword("INSTANCE"), (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("BINDINGS"), (SubLObject)SubLObjectFactory.makeKeyword("INSTANCE"), (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PRECOND"), (SubLObject)SubLObjectFactory.makeKeyword("INSTANCE"), (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TASK-STRUC"), (SubLObject)SubLObjectFactory.makeKeyword("INSTANCE"), (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("STATUS"), (SubLObject)SubLObjectFactory.makeKeyword("INSTANCE"), (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")));
        $sym6$OBJECT = SubLObjectFactory.makeSymbol("OBJECT");
        $sym7$INSTANCE_COUNT = SubLObjectFactory.makeSymbol("INSTANCE-COUNT");
        $sym8$INSTANCE_INDEX = SubLObjectFactory.makeSymbol("INSTANCE-INDEX");
        $sym9$SUBLOOP_RESERVED_INITIALIZE_SHOP_BASIC_TASK_CLASS = SubLObjectFactory.makeSymbol("SUBLOOP-RESERVED-INITIALIZE-SHOP-BASIC-TASK-CLASS");
        $sym10$ISOLATED_P = SubLObjectFactory.makeSymbol("ISOLATED-P");
        $sym11$INSTANCE_NUMBER = SubLObjectFactory.makeSymbol("INSTANCE-NUMBER");
        $sym12$FORMULA = SubLObjectFactory.makeSymbol("FORMULA");
        $sym13$BINDINGS = SubLObjectFactory.makeSymbol("BINDINGS");
        $sym14$PRECOND = SubLObjectFactory.makeSymbol("PRECOND");
        $sym15$TASK_STRUC = SubLObjectFactory.makeSymbol("TASK-STRUC");
        $sym16$STATUS = SubLObjectFactory.makeSymbol("STATUS");
        $sym17$SUBLOOP_RESERVED_INITIALIZE_SHOP_BASIC_TASK_INSTANCE = SubLObjectFactory.makeSymbol("SUBLOOP-RESERVED-INITIALIZE-SHOP-BASIC-TASK-INSTANCE");
        $sym18$STRIP_TASK = SubLObjectFactory.makeSymbol("STRIP-TASK");
        $list19 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NEW-TASK"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SET-SLOT"), (SubLObject)SubLObjectFactory.makeSymbol("NEW-TASK"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("FORMULA")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SECOND"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("GET-SLOT"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("FORMULA"))))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("NEW-TASK"))));
        $sym20$OUTER_CATCH_FOR_SHOP_BASIC_TASK_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-SHOP-BASIC-TASK-METHOD");
        $sym21$SHOP_BASIC_TASK_STRIP_TASK_METHOD = SubLObjectFactory.makeSymbol("SHOP-BASIC-TASK-STRIP-TASK-METHOD");
        $sym22$PRINT = SubLObjectFactory.makeSymbol("PRINT");
        $list23 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("PUBLIC"));
        $list24 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("STREAM"), (SubLObject)SubLObjectFactory.makeSymbol("DEPTH"));
        $list25 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("IGNORE"), (SubLObject)SubLObjectFactory.makeSymbol("DEPTH")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PIF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("INSTANCE-P"), (SubLObject)SubLObjectFactory.makeSymbol("SELF")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FORMAT"), (SubLObject)SubLObjectFactory.makeSymbol("STREAM"), (SubLObject)SubLObjectFactory.makeString("#<Task-~S:~S>"), (SubLObject)SubLObjectFactory.makeSymbol("INSTANCE-NUMBER"), (SubLObject)SubLObjectFactory.makeSymbol("FORMULA")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FORMAT"), (SubLObject)SubLObjectFactory.makeSymbol("STREAM"), (SubLObject)SubLObjectFactory.makeString("#<Malformed Instance>"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("SELF")));
        $sym26$OUTER_CATCH_FOR_SHOP_BASIC_TASK_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-SHOP-BASIC-TASK-METHOD");
        $str27$__Task__S__S_ = SubLObjectFactory.makeString("#<Task-~S:~S>");
        $str28$__Malformed_Instance_ = SubLObjectFactory.makeString("#<Malformed Instance>");
        $sym29$SHOP_BASIC_TASK_PRINT_METHOD = SubLObjectFactory.makeSymbol("SHOP-BASIC-TASK-PRINT-METHOD");
        $sym30$INIT = SubLObjectFactory.makeSymbol("INIT");
        $list31 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NEW-TASK"), (SubLObject)SubLObjectFactory.makeSymbol("NEW-BINDING"), (SubLObject)SubLObjectFactory.makeSymbol("NEW-PRECOND"), (SubLObject)SubLObjectFactory.makeSymbol("NEW-TASK-STRUC"));
        $list32 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("@param TASK hl-formula-p\n   @param BINDING multibinding-p\n   @param PRECOND listp\n   @param TASK-STRUC shop-planner-rule-p\n   @return shop-html-task-p"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PIF"), (SubLObject)ConsesLow.list((SubLObject)shop_basic_plan.EQ, (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIRST"), (SubLObject)SubLObjectFactory.makeSymbol("NEW-TASK")), (SubLObject)SubLObjectFactory.makeKeyword("PRIMITIVE")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PROGN"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("FORMULA"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SECOND"), (SubLObject)SubLObjectFactory.makeSymbol("NEW-TASK"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("STATUS"), (SubLObject)SubLObjectFactory.makeKeyword("PRIMITIVE"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PROGN"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("FORMULA"), (SubLObject)SubLObjectFactory.makeSymbol("NEW-TASK")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("STATUS"), (SubLObject)SubLObjectFactory.makeKeyword("COMPLEX")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("BINDINGS"), (SubLObject)SubLObjectFactory.makeSymbol("NEW-BINDING")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("PRECOND"), (SubLObject)SubLObjectFactory.makeSymbol("NEW-PRECOND")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("TASK-STRUC"), (SubLObject)SubLObjectFactory.makeSymbol("NEW-TASK-STRUC")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("SELF")));
        $sym33$OUTER_CATCH_FOR_SHOP_BASIC_TASK_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-SHOP-BASIC-TASK-METHOD");
        $kw34$PRIMITIVE = SubLObjectFactory.makeKeyword("PRIMITIVE");
        $kw35$COMPLEX = SubLObjectFactory.makeKeyword("COMPLEX");
        $sym36$SHOP_BASIC_TASK_INIT_METHOD = SubLObjectFactory.makeSymbol("SHOP-BASIC-TASK-INIT-METHOD");
        $sym37$PLANNER_RULE = SubLObjectFactory.makeSymbol("PLANNER-RULE");
        $list38 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("@return shop-planner-rule-p"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("TASK-STRUC")));
        $sym39$OUTER_CATCH_FOR_SHOP_BASIC_TASK_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-SHOP-BASIC-TASK-METHOD");
        $sym40$SHOP_BASIC_TASK_PLANNER_RULE_METHOD = SubLObjectFactory.makeSymbol("SHOP-BASIC-TASK-PLANNER-RULE-METHOD");
        $list41 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("FORMULA")));
        $sym42$OUTER_CATCH_FOR_SHOP_BASIC_TASK_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-SHOP-BASIC-TASK-METHOD");
        $sym43$SHOP_BASIC_TASK_FORMULA_METHOD = SubLObjectFactory.makeSymbol("SHOP-BASIC-TASK-FORMULA-METHOD");
        $sym44$PRECONDITION = SubLObjectFactory.makeSymbol("PRECONDITION");
        $list45 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("PRECOND")));
        $sym46$OUTER_CATCH_FOR_SHOP_BASIC_TASK_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-SHOP-BASIC-TASK-METHOD");
        $sym47$SHOP_BASIC_TASK_PRECONDITION_METHOD = SubLObjectFactory.makeSymbol("SHOP-BASIC-TASK-PRECONDITION-METHOD");
        $sym48$PRIMITIVE_ = SubLObjectFactory.makeSymbol("PRIMITIVE?");
        $list49 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)ConsesLow.list((SubLObject)shop_basic_plan.EQ, (SubLObject)SubLObjectFactory.makeSymbol("STATUS"), (SubLObject)SubLObjectFactory.makeKeyword("PRIMITIVE"))));
        $sym50$OUTER_CATCH_FOR_SHOP_BASIC_TASK_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-SHOP-BASIC-TASK-METHOD");
        $sym51$SHOP_BASIC_TASK_PRIMITIVE__METHOD = SubLObjectFactory.makeSymbol("SHOP-BASIC-TASK-PRIMITIVE?-METHOD");
        $sym52$MBINDINGS = SubLObjectFactory.makeSymbol("MBINDINGS");
        $list53 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("BINDINGS")));
        $sym54$OUTER_CATCH_FOR_SHOP_BASIC_TASK_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-SHOP-BASIC-TASK-METHOD");
        $sym55$SHOP_BASIC_TASK_MBINDINGS_METHOD = SubLObjectFactory.makeSymbol("SHOP-BASIC-TASK-MBINDINGS-METHOD");
        $sym56$SHOP_PLAN_I = SubLObjectFactory.makeSymbol("SHOP-PLAN-I");
        $list57 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("POST-ORDERING"), (SubLObject)shop_basic_plan.NIL, (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("PRIMITIVE-FORM"), (SubLObject)shop_basic_plan.NIL, (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("GROUND-FORMS"), (SubLObject)shop_basic_plan.NIL, (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("COST"), (SubLObject)shop_basic_plan.NIL, (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("GOAL-TASK"), (SubLObject)shop_basic_plan.NIL, (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("POPULATE-PLAN"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PLAN-STATE")), (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("GATHER-PLANNER-RULES"), (SubLObject)shop_basic_plan.NIL, (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("GATHER-PRECONDITIONS"), (SubLObject)shop_basic_plan.NIL, (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")));
        $sym58$SHOP_BASIC_PLAN = SubLObjectFactory.makeSymbol("SHOP-BASIC-PLAN");
        $list59 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SHOP-PLAN-I"));
        $list60 = ConsesLow.list(new SubLObject[] { ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PRE-ORDERING"), (SubLObject)SubLObjectFactory.makeKeyword("INSTANCE"), (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("POST-ORDERING"), (SubLObject)SubLObjectFactory.makeKeyword("INSTANCE"), (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TASK-STRUCS"), (SubLObject)SubLObjectFactory.makeKeyword("INSTANCE"), (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("BINDINGS"), (SubLObject)SubLObjectFactory.makeKeyword("INSTANCE"), (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SIMPLE-BINDING-LIST"), (SubLObject)SubLObjectFactory.makeKeyword("INSTANCE"), (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TOTAL-COST"), (SubLObject)SubLObjectFactory.makeKeyword("INSTANCE"), (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("OPEN-VARIABLES"), (SubLObject)SubLObjectFactory.makeKeyword("INSTANCE"), (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("VARIABLE-MANAGER"), (SubLObject)SubLObjectFactory.makeKeyword("INSTANCE"), (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("VARIABLE-MANAGER"), (SubLObject)shop_basic_plan.NIL, (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("NON-PRIMITIVE-PRE-ORDERING"), (SubLObject)shop_basic_plan.NIL, (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("SINGLE-AGENT-PLAN?"), (SubLObject)shop_basic_plan.NIL, (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")) });
        $sym61$SUBLOOP_RESERVED_INITIALIZE_SHOP_BASIC_PLAN_CLASS = SubLObjectFactory.makeSymbol("SUBLOOP-RESERVED-INITIALIZE-SHOP-BASIC-PLAN-CLASS");
        $sym62$PRE_ORDERING = SubLObjectFactory.makeSymbol("PRE-ORDERING");
        $sym63$POST_ORDERING = SubLObjectFactory.makeSymbol("POST-ORDERING");
        $sym64$TASK_STRUCS = SubLObjectFactory.makeSymbol("TASK-STRUCS");
        $sym65$SIMPLE_BINDING_LIST = SubLObjectFactory.makeSymbol("SIMPLE-BINDING-LIST");
        $sym66$TOTAL_COST = SubLObjectFactory.makeSymbol("TOTAL-COST");
        $sym67$OPEN_VARIABLES = SubLObjectFactory.makeSymbol("OPEN-VARIABLES");
        $sym68$VARIABLE_MANAGER = SubLObjectFactory.makeSymbol("VARIABLE-MANAGER");
        $sym69$SUBLOOP_RESERVED_INITIALIZE_SHOP_BASIC_PLAN_INSTANCE = SubLObjectFactory.makeSymbol("SUBLOOP-RESERVED-INITIALIZE-SHOP-BASIC-PLAN-INSTANCE");
        $sym70$POPULATE_PLAN = SubLObjectFactory.makeSymbol("POPULATE-PLAN");
        $list71 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PLAN-STATE"));
        $list72 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("@param PLAN-STATE shop-basic-plan-state-p"), (SubLObject)ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeSymbol("CLET"), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TASK-PRE-ORDERING"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("GET-SHOP-BASIC-PLAN-STATE-PARTIAL-PLAN"), (SubLObject)SubLObjectFactory.makeSymbol("PLAN-STATE"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TASK-POST-ORDERING"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("REVERSE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("GET-SHOP-BASIC-PLAN-STATE-POST-ORDERING"), (SubLObject)SubLObjectFactory.makeSymbol("PLAN-STATE")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TASK-BINDINGS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("INLINE-METHOD"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("MBINDING"), (SubLObject)SubLObjectFactory.makeSymbol("SHOP-BASIC-PLAN-STATE")), (SubLObject)SubLObjectFactory.makeSymbol("PLAN-STATE"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SIMPLE-BINDINGS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("MBIND-SIMPLE-BINDING-LIST"), (SubLObject)SubLObjectFactory.makeSymbol("TASK-BINDINGS"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TASK-STRUCS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("INLINE-METHOD"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TASK-STRUCS"), (SubLObject)SubLObjectFactory.makeSymbol("SHOP-BASIC-PLAN-STATE")), (SubLObject)SubLObjectFactory.makeSymbol("PLAN-STATE"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PRECONDS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("INLINE-METHOD"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SUPPORT-LISTS"), (SubLObject)SubLObjectFactory.makeSymbol("SHOP-BASIC-PLAN-STATE")), (SubLObject)SubLObjectFactory.makeSymbol("PLAN-STATE"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TASK-LIST"), (SubLObject)shop_basic_plan.NIL), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TASK-ASSOC"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("MAKE-HASH-TABLE"), (SubLObject)SubLObjectFactory.makeInteger(50), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FUNCTION"), (SubLObject)shop_basic_plan.EQ)))), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CMULTIPLE-VALUE-BIND"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NEW-TASK-PRE-ORDERING"), (SubLObject)SubLObjectFactory.makeSymbol("NEW-OPEN-VARIABLES")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SHOP-PROCESS-OPEN-VARIABLES"), (SubLObject)SubLObjectFactory.makeSymbol("TASK-PRE-ORDERING"), (SubLObject)SubLObjectFactory.makeSymbol("TASK-BINDINGS")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CMULTIPLE-VALUE-BIND"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NEW-TASK-POST-ORDERING"), (SubLObject)SubLObjectFactory.makeSymbol("NEW-OPEN-VARIABLES")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SHOP-PROCESS-OPEN-VARIABLES"), (SubLObject)SubLObjectFactory.makeSymbol("TASK-POST-ORDERING"), (SubLObject)SubLObjectFactory.makeSymbol("TASK-BINDINGS"), (SubLObject)SubLObjectFactory.makeSymbol("NEW-OPEN-VARIABLES")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("TASK-PRE-ORDERING"), (SubLObject)SubLObjectFactory.makeSymbol("NEW-TASK-PRE-ORDERING")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("TASK-POST-ORDERING"), (SubLObject)SubLObjectFactory.makeSymbol("NEW-TASK-POST-ORDERING")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("OPEN-VARIABLES"), (SubLObject)SubLObjectFactory.makeSymbol("NEW-OPEN-VARIABLES")))), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CDOLIST-MULTIPLE"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TASK"), (SubLObject)SubLObjectFactory.makeSymbol("TASK-PRE-ORDERING")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PRECOND"), (SubLObject)SubLObjectFactory.makeSymbol("PRECONDS")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TASK-STRUC"), (SubLObject)SubLObjectFactory.makeSymbol("TASK-STRUCS"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NEW-TASK-OBJ"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("INLINE-METHOD"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NEW"), (SubLObject)SubLObjectFactory.makeSymbol("SHOP-BASIC-TASK")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("SHOP-BASIC-TASK"))))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("INLINE-METHOD"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("INIT"), (SubLObject)SubLObjectFactory.makeSymbol("SHOP-BASIC-TASK")), (SubLObject)SubLObjectFactory.makeSymbol("NEW-TASK-OBJ"), (SubLObject)SubLObjectFactory.makeSymbol("TASK"), (SubLObject)SubLObjectFactory.makeSymbol("TASK-BINDINGS"), (SubLObject)SubLObjectFactory.makeSymbol("PRECOND"), (SubLObject)SubLObjectFactory.makeSymbol("TASK-STRUC")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("GETHASH"), (SubLObject)SubLObjectFactory.makeSymbol("TASK"), (SubLObject)SubLObjectFactory.makeSymbol("TASK-ASSOC")), (SubLObject)SubLObjectFactory.makeSymbol("NEW-TASK-OBJ")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CPUSH"), (SubLObject)SubLObjectFactory.makeSymbol("NEW-TASK-OBJ"), (SubLObject)SubLObjectFactory.makeSymbol("TASK-LIST")))), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("PRE-ORDERING"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("REVERSE"), (SubLObject)SubLObjectFactory.makeSymbol("TASK-LIST"))), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("TASK-LIST"), (SubLObject)shop_basic_plan.NIL), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CDOLIST"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TASK"), (SubLObject)SubLObjectFactory.makeSymbol("TASK-POST-ORDERING")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TASK-ENTRY"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("GETHASH"), (SubLObject)SubLObjectFactory.makeSymbol("TASK"), (SubLObject)SubLObjectFactory.makeSymbol("TASK-ASSOC")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PIF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NULL"), (SubLObject)SubLObjectFactory.makeSymbol("TASK-ENTRY")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("WARN"), (SubLObject)SubLObjectFactory.makeString("tried to add null entry to task-list from task ~a"), (SubLObject)SubLObjectFactory.makeSymbol("TASK")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CPUSH"), (SubLObject)SubLObjectFactory.makeSymbol("TASK-ENTRY"), (SubLObject)SubLObjectFactory.makeSymbol("TASK-LIST"))))), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("TASK-STRUCS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("GET-SHOP-BASIC-PLAN-STATE-TASK-STRUCS"), (SubLObject)SubLObjectFactory.makeSymbol("PLAN-STATE"))), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("POST-ORDERING"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("REVERSE"), (SubLObject)SubLObjectFactory.makeSymbol("TASK-LIST"))), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("BINDINGS"), (SubLObject)SubLObjectFactory.makeSymbol("TASK-BINDINGS")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("SIMPLE-BINDING-LIST"), (SubLObject)SubLObjectFactory.makeSymbol("SIMPLE-BINDINGS")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("VARIABLE-MANAGER"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("GET-SLOT"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("GET-SHOP-BASIC-PLAN-STATE-PLANNER"), (SubLObject)SubLObjectFactory.makeSymbol("PLAN-STATE")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("VAR-MANAGER")))), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("TOTAL-COST"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("LIST-LENGTH"), (SubLObject)SubLObjectFactory.makeSymbol("TASK-PRE-ORDERING"))), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)shop_basic_plan.NIL) }));
        $sym73$OUTER_CATCH_FOR_SHOP_BASIC_PLAN_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-SHOP-BASIC-PLAN-METHOD");
        $int74$50 = SubLObjectFactory.makeInteger(50);
        $str75$tried_to_add_null_entry_to_task_l = SubLObjectFactory.makeString("tried to add null entry to task-list from task ~a");
        $sym76$VAR_MANAGER = SubLObjectFactory.makeSymbol("VAR-MANAGER");
        $sym77$SHOP_BASIC_PLAN_POPULATE_PLAN_METHOD = SubLObjectFactory.makeSymbol("SHOP-BASIC-PLAN-POPULATE-PLAN-METHOD");
        $sym78$GROUND_FORMS = SubLObjectFactory.makeSymbol("GROUND-FORMS");
        $list79 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("@param listp ;; singleton list containing the plan's simple actions, if there are no multibound variables.\n              ;; o/w, the list of plans produced when the multibinding is expanded."), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PRIMITIVE-FORM"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PRIMITIVE-FORM"), (SubLObject)SubLObjectFactory.makeSymbol("SELF")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PIF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NULL"), (SubLObject)SubLObjectFactory.makeSymbol("OPEN-VARIABLES")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("LIST"), (SubLObject)SubLObjectFactory.makeSymbol("PRIMITIVE-FORM"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PROGN"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("APPLY-MULTIBINDING"), (SubLObject)SubLObjectFactory.makeSymbol("PRIMITIVE-FORM"), (SubLObject)SubLObjectFactory.makeSymbol("BINDINGS")))))));
        $sym80$OUTER_CATCH_FOR_SHOP_BASIC_PLAN_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-SHOP-BASIC-PLAN-METHOD");
        $sym81$SHOP_BASIC_PLAN_GROUND_FORMS_METHOD = SubLObjectFactory.makeSymbol("SHOP-BASIC-PLAN-GROUND-FORMS-METHOD");
        $sym82$PRIMITIVE_FORM = SubLObjectFactory.makeSymbol("PRIMITIVE-FORM");
        $list83 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("@return listp ;;The plan's simple actions only, in sequence."), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PRIMITIVE-TASKS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PPO-TREE-LEAVES"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("REVERSE"), (SubLObject)SubLObjectFactory.makeSymbol("PRE-ORDERING")), (SubLObject)SubLObjectFactory.makeSymbol("POST-ORDERING"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FUNCTION"), (SubLObject)shop_basic_plan.EQ))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PRIMITIVE-FORMS"), (SubLObject)shop_basic_plan.NIL)), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CDOLIST"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CUR-TASK"), (SubLObject)SubLObjectFactory.makeSymbol("PRIMITIVE-TASKS")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CPUSH"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("INLINE-METHOD"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FORMULA"), (SubLObject)SubLObjectFactory.makeSymbol("SHOP-BASIC-TASK")), (SubLObject)SubLObjectFactory.makeSymbol("CUR-TASK")), (SubLObject)SubLObjectFactory.makeSymbol("PRIMITIVE-FORMS"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NREVERSE"), (SubLObject)SubLObjectFactory.makeSymbol("PRIMITIVE-FORMS")))));
        $sym84$OUTER_CATCH_FOR_SHOP_BASIC_PLAN_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-SHOP-BASIC-PLAN-METHOD");
        $sym85$SHOP_BASIC_PLAN_PRIMITIVE_FORM_METHOD = SubLObjectFactory.makeSymbol("SHOP-BASIC-PLAN-PRIMITIVE-FORM-METHOD");
        $sym86$NON_PRIMITIVE_PRE_ORDERING = SubLObjectFactory.makeSymbol("NON-PRIMITIVE-PRE-ORDERING");
        $list87 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("@return listp ;; the pre-order of complex tasks in the plan."), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NON-PRIMITIVE-LIST"), (SubLObject)shop_basic_plan.NIL)), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CDOLIST"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CUR-TASK"), (SubLObject)SubLObjectFactory.makeSymbol("PRE-ORDERING")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PUNLESS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("INLINE-METHOD"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PRIMITIVE?"), (SubLObject)SubLObjectFactory.makeSymbol("SHOP-BASIC-TASK")), (SubLObject)SubLObjectFactory.makeSymbol("CUR-TASK")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CPUSH"), (SubLObject)SubLObjectFactory.makeSymbol("CUR-TASK"), (SubLObject)SubLObjectFactory.makeSymbol("NON-PRIMITIVE-LIST")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("NON-PRIMITIVE-LIST"))));
        $sym88$OUTER_CATCH_FOR_SHOP_BASIC_PLAN_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-SHOP-BASIC-PLAN-METHOD");
        $sym89$SHOP_BASIC_PLAN_NON_PRIMITIVE_PRE_ORDERING_METHOD = SubLObjectFactory.makeSymbol("SHOP-BASIC-PLAN-NON-PRIMITIVE-PRE-ORDERING-METHOD");
        $sym90$GOAL_TASK = SubLObjectFactory.makeSymbol("GOAL-TASK");
        $list91 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("@return hl-formula-p ;; the goal for which SELF is a plan."), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("LAST-ONE"), (SubLObject)SubLObjectFactory.makeSymbol("PRE-ORDERING"))));
        $sym92$OUTER_CATCH_FOR_SHOP_BASIC_PLAN_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-SHOP-BASIC-PLAN-METHOD");
        $sym93$SHOP_BASIC_PLAN_GOAL_TASK_METHOD = SubLObjectFactory.makeSymbol("SHOP-BASIC-PLAN-GOAL-TASK-METHOD");
        $list94 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("POST-ORDERING")));
        $sym95$OUTER_CATCH_FOR_SHOP_BASIC_PLAN_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-SHOP-BASIC-PLAN-METHOD");
        $sym96$SHOP_BASIC_PLAN_POST_ORDERING_METHOD = SubLObjectFactory.makeSymbol("SHOP-BASIC-PLAN-POST-ORDERING-METHOD");
        $sym97$COST = SubLObjectFactory.makeSymbol("COST");
        $list98 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("TOTAL-COST")));
        $sym99$OUTER_CATCH_FOR_SHOP_BASIC_PLAN_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-SHOP-BASIC-PLAN-METHOD");
        $sym100$SHOP_BASIC_PLAN_COST_METHOD = SubLObjectFactory.makeSymbol("SHOP-BASIC-PLAN-COST-METHOD");
        $list101 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("VARIABLE-MANAGER")));
        $sym102$OUTER_CATCH_FOR_SHOP_BASIC_PLAN_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-SHOP-BASIC-PLAN-METHOD");
        $sym103$SHOP_BASIC_PLAN_VARIABLE_MANAGER_METHOD = SubLObjectFactory.makeSymbol("SHOP-BASIC-PLAN-VARIABLE-MANAGER-METHOD");
        $sym104$MBINDING = SubLObjectFactory.makeSymbol("MBINDING");
        $sym105$OUTER_CATCH_FOR_SHOP_BASIC_PLAN_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-SHOP-BASIC-PLAN-METHOD");
        $sym106$SHOP_BASIC_PLAN_MBINDING_METHOD = SubLObjectFactory.makeSymbol("SHOP-BASIC-PLAN-MBINDING-METHOD");
        $sym107$GATHER_PLANNER_RULES = SubLObjectFactory.makeSymbol("GATHER-PLANNER-RULES");
        $list108 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("@return lisp ;; of shop-planner-rule-p ;; the planner rules used to derive the plan."), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PLANNER-RULES"), (SubLObject)shop_basic_plan.NIL)), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CDOLIST"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CUR-ITEM"), (SubLObject)SubLObjectFactory.makeSymbol("PRE-ORDERING")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CPUSH"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FUNCALL-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("CUR-ITEM"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("PLANNER-RULE"))), (SubLObject)SubLObjectFactory.makeSymbol("PLANNER-RULES"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("PLANNER-RULES"))));
        $sym109$OUTER_CATCH_FOR_SHOP_BASIC_PLAN_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-SHOP-BASIC-PLAN-METHOD");
        $sym110$SHOP_BASIC_PLAN_GATHER_PLANNER_RULES_METHOD = SubLObjectFactory.makeSymbol("SHOP-BASIC-PLAN-GATHER-PLANNER-RULES-METHOD");
        $sym111$GATHER_PRECONDITIONS = SubLObjectFactory.makeSymbol("GATHER-PRECONDITIONS");
        $list112 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("@return lisp"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PLANNER-RULES"), (SubLObject)shop_basic_plan.NIL)), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CDOLIST"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CUR-ITEM"), (SubLObject)SubLObjectFactory.makeSymbol("PRE-ORDERING")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CPUSH"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FUNCALL-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("CUR-ITEM"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("PRECONDITION"))), (SubLObject)SubLObjectFactory.makeSymbol("PLANNER-RULES"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("PLANNER-RULES"))));
        $sym113$OUTER_CATCH_FOR_SHOP_BASIC_PLAN_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-SHOP-BASIC-PLAN-METHOD");
        $sym114$SHOP_BASIC_PLAN_GATHER_PRECONDITIONS_METHOD = SubLObjectFactory.makeSymbol("SHOP-BASIC-PLAN-GATHER-PRECONDITIONS-METHOD");
        $sym115$SINGLE_AGENT_PLAN_ = SubLObjectFactory.makeSymbol("SINGLE-AGENT-PLAN?");
        $list116 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("@return booleanp ;; t if the only one agent executes every step in the plan.\n   Note: for now we assume the agent is always the first argument of each action sentence."), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIRST-AGENT"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FORMULA-ARG1"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SUBLIS"), (SubLObject)SubLObjectFactory.makeSymbol("SIMPLE-BINDING-LIST"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FUNCALL-INSTANCE-METHOD"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIRST"), (SubLObject)SubLObjectFactory.makeSymbol("PRE-ORDERING")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("FORMULA"))))))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CDOLIST"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CUR-TASK"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("REST"), (SubLObject)SubLObjectFactory.makeSymbol("PRE-ORDERING"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PUNLESS"), (SubLObject)ConsesLow.list((SubLObject)shop_basic_plan.EQUAL, (SubLObject)SubLObjectFactory.makeSymbol("FIRST-AGENT"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FORMULA-ARG1"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SUBLIS"), (SubLObject)SubLObjectFactory.makeSymbol("SIMPLE-BINDING-LIST"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FUNCALL-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("CUR-TASK"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("FORMULA")))))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)shop_basic_plan.NIL))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)shop_basic_plan.T)));
        $sym117$OUTER_CATCH_FOR_SHOP_BASIC_PLAN_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-SHOP-BASIC-PLAN-METHOD");
        $sym118$SHOP_BASIC_PLAN_SINGLE_AGENT_PLAN__METHOD = SubLObjectFactory.makeSymbol("SHOP-BASIC-PLAN-SINGLE-AGENT-PLAN?-METHOD");
        $sym119$SHOP_VARIABLEP = SubLObjectFactory.makeSymbol("SHOP-VARIABLEP");
        $list120 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ITEM"), (SubLObject)SubLObjectFactory.makeSymbol("DEPTH"), (SubLObject)SubLObjectFactory.makeSymbol("PRE"), (SubLObject)SubLObjectFactory.makeSymbol("POST"), (SubLObject)SubLObjectFactory.makeSymbol("&OPTIONAL"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TEST"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FUNCTION"), (SubLObject)shop_basic_plan.EQ))), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $sym121$CUR_PRE = SubLObjectFactory.makeUninternedSymbol("CUR-PRE");
        $sym122$NEXT = SubLObjectFactory.makeUninternedSymbol("NEXT");
        $sym123$STACK = SubLObjectFactory.makeUninternedSymbol("STACK");
        $sym124$CLET = SubLObjectFactory.makeSymbol("CLET");
        $list125 = ConsesLow.list((SubLObject)shop_basic_plan.NIL);
        $list126 = ConsesLow.list((SubLObject)shop_basic_plan.ZERO_INTEGER);
        $sym127$CDO = SubLObjectFactory.makeSymbol("CDO");
        $sym128$REST = SubLObjectFactory.makeSymbol("REST");
        $sym129$NULL = SubLObjectFactory.makeSymbol("NULL");
        $sym130$FIRST = SubLObjectFactory.makeSymbol("FIRST");
        $sym131$SECOND = SubLObjectFactory.makeSymbol("SECOND");
        $sym132$WHILE = SubLObjectFactory.makeSymbol("WHILE");
        $sym133$CAND = SubLObjectFactory.makeSymbol("CAND");
        $sym134$CNOT = SubLObjectFactory.makeSymbol("CNOT");
        $sym135$PPO_TREE_DESCENDANT_ = SubLObjectFactory.makeSymbol("PPO-TREE-DESCENDANT?");
        $sym136$CDEC = SubLObjectFactory.makeSymbol("CDEC");
        $sym137$CPOP = SubLObjectFactory.makeSymbol("CPOP");
        $sym138$PWHEN = SubLObjectFactory.makeSymbol("PWHEN");
        $sym139$CINC = SubLObjectFactory.makeSymbol("CINC");
        $sym140$CPUSH = SubLObjectFactory.makeSymbol("CPUSH");
    }
}

/*

	Total time: 749 ms
	
*/