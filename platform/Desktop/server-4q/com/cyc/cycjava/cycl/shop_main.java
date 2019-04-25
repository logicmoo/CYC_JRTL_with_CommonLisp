package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.cycjava.cycl.sbhl.sbhl_links;
import com.cyc.cycjava.cycl.sbhl.sbhl_graphs;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.cycjava.cycl.sbhl.sbhl_macros;
import com.cyc.cycjava.cycl.sbhl.sbhl_marking_utilities;
import com.cyc.cycjava.cycl.sbhl.sbhl_link_vars;
import com.cyc.cycjava.cycl.sbhl.sbhl_module_utilities;
import com.cyc.cycjava.cycl.sbhl.sbhl_module_vars;
import com.cyc.cycjava.cycl.sbhl.sbhl_paranoia;
import com.cyc.cycjava.cycl.sbhl.sbhl_search_vars;
import com.cyc.cycjava.cycl.sbhl.sbhl_marking_vars;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class shop_main extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.shop_main";
    public static final String myFingerPrint = "3e580fdae342dc282c9661fdbf9c0ed772d195305c2ea2aac2009e5d6ed2fcb0";
    @SubLTranslatedFile.SubL(source = "cycl/shop-main.lisp", position = 1701L)
    private static SubLSymbol $new_method_pred$;
    @SubLTranslatedFile.SubL(source = "cycl/shop-main.lisp", position = 1746L)
    public static SubLSymbol $shop_simple_action_definition_predicates$;
    @SubLTranslatedFile.SubL(source = "cycl/shop-main.lisp", position = 1888L)
    public static SubLSymbol $shop_complex_action_definition_predicates$;
    @SubLTranslatedFile.SubL(source = "cycl/shop-main.lisp", position = 2022L)
    public static SubLSymbol $shop_domain_definition_predicates$;
    @SubLTranslatedFile.SubL(source = "cycl/shop-main.lisp", position = 2186L)
    public static SubLSymbol $shop_domain_definition_collections$;
    @SubLTranslatedFile.SubL(source = "cycl/shop-main.lisp", position = 2277L)
    private static SubLSymbol $planner_core_constants$;
    @SubLTranslatedFile.SubL(source = "cycl/shop-main.lisp", position = 2875L)
    public static SubLSymbol $shop$;
    private static final SubLList $list0;
    private static final SubLList $list1;
    private static final SubLList $list2;
    private static final SubLSymbol $sym3$VALID_CONSTANT_;
    private static final SubLSymbol $sym4$_SHOP_;
    private static final SubLSymbol $sym5$SHOP_PLANNER;
    private static final SubLList $list6;
    private static final SubLSymbol $sym7$SHOP_PLAN_DISPLAYER_FACTORY;
    private static final SubLSymbol $sym8$OBJECT;
    private static final SubLList $list9;
    private static final SubLSymbol $sym10$INSTANCE_COUNT;
    private static final SubLSymbol $sym11$SUBLOOP_RESERVED_INITIALIZE_SHOP_PLAN_DISPLAYER_FACTORY_CLASS;
    private static final SubLSymbol $sym12$ISOLATED_P;
    private static final SubLSymbol $sym13$INSTANCE_NUMBER;
    private static final SubLSymbol $sym14$SUBLOOP_RESERVED_INITIALIZE_SHOP_PLAN_DISPLAYER_FACTORY_INSTANCE;
    private static final SubLSymbol $sym15$SHOP;
    private static final SubLList $list16;
    private static final SubLList $list17;
    private static final SubLSymbol $sym18$SUBLOOP_RESERVED_INITIALIZE_SHOP_CLASS;
    private static final SubLSymbol $sym19$DISPLAYER_FACTORY;
    private static final SubLSymbol $sym20$DOMAIN_TABLE;
    private static final SubLSymbol $sym21$PROBLEM_TABLE;
    private static final SubLSymbol $sym22$THREADS;
    private static final SubLSymbol $sym23$SUBLOOP_RESERVED_INITIALIZE_SHOP_INSTANCE;
    private static final SubLSymbol $sym24$INITIALIZE;
    private static final SubLList $list25;
    private static final SubLList $list26;
    private static final SubLSymbol $sym27$OUTER_CATCH_FOR_SHOP_METHOD;
    private static final SubLSymbol $sym28$SHOP_INITIALIZE_METHOD;
    private static final SubLSymbol $sym29$GET_DOMAIN;
    private static final SubLList $list30;
    private static final SubLList $list31;
    private static final SubLSymbol $sym32$OUTER_CATCH_FOR_SHOP_METHOD;
    private static final SubLSymbol $sym33$SHOP_GET_DOMAIN_METHOD;
    private static final SubLSymbol $sym34$GET_PROBLEM;
    private static final SubLList $list35;
    private static final SubLList $list36;
    private static final SubLSymbol $sym37$OUTER_CATCH_FOR_SHOP_METHOD;
    private static final SubLString $str38$No_planning_problem_of_the_name__;
    private static final SubLSymbol $sym39$SHOP_GET_PROBLEM_METHOD;
    private static final SubLSymbol $sym40$MAKE_NEW_THREAD;
    private static final SubLList $list41;
    private static final SubLSymbol $sym42$OUTER_CATCH_FOR_SHOP_METHOD;
    private static final SubLSymbol $sym43$SHOP_BASIC_PLANNER_THREAD;
    private static final SubLSymbol $sym44$PLANNER;
    private static final SubLSymbol $sym45$SHOP_MAKE_NEW_THREAD_METHOD;
    private static final SubLSymbol $sym46$MAKE_PROBLEM;
    private static final SubLList $list47;
    private static final SubLList $list48;
    private static final SubLSymbol $sym49$OUTER_CATCH_FOR_SHOP_METHOD;
    private static final SubLSymbol $sym50$SHOP_BASIC_PROBLEM;
    private static final SubLSymbol $sym51$SHOP_BASIC_WORLD_STATE;
    private static final SubLSymbol $sym52$MAKE_STATEBODY;
    private static final SubLSymbol $sym53$SHOP_MAKE_PROBLEM_METHOD;
    private static final SubLSymbol $sym54$CLEANUP_THREADS;
    private static final SubLList $list55;
    private static final SubLSymbol $sym56$OUTER_CATCH_FOR_SHOP_METHOD;
    private static final SubLSymbol $sym57$SHOP_CLEANUP_THREADS_METHOD;
    private static final SubLSymbol $sym58$GATHER_INITIAL_STATE;
    private static final SubLList $list59;
    private static final SubLList $list60;
    private static final SubLList $list61;
    private static final SubLSymbol $kw62$BREADTH;
    private static final SubLSymbol $kw63$QUEUE;
    private static final SubLSymbol $kw64$STACK;
    private static final SubLSymbol $sym65$RELEVANT_SBHL_TV_IS_GENERAL_TV;
    private static final SubLSymbol $kw66$ERROR;
    private static final SubLString $str67$_A_is_not_a__A;
    private static final SubLSymbol $sym68$SBHL_TRUE_TV_P;
    private static final SubLSymbol $kw69$CERROR;
    private static final SubLString $str70$continue_anyway;
    private static final SubLSymbol $kw71$WARN;
    private static final SubLString $str72$_A_is_not_a_valid__sbhl_type_erro;
    private static final SubLObject $const73$genlMt;
    private static final SubLObject $const74$PlanDynamicSituationMicrotheory;
    private static final SubLString $str75$_A_is_neither_SET_P_nor_LISTP_;
    private static final SubLString $str76$attempting_to_bind_direction_link;
    private static final SubLString $str77$Node__a_does_not_pass_sbhl_type_t;
    private static final SubLSymbol $sym78$ASSERTION_HL_FORMULA;
    private static final SubLSymbol $sym79$APPEND;
    private static final SubLSymbol $sym80$GATHER_MT_INDEX;
    private static final SubLSymbol $sym81$SHOP_GATHER_INITIAL_STATE_METHOD;
    private static final SubLSymbol $sym82$MAKE_PROBLEM_FROM_MT;
    private static final SubLList $list83;
    private static final SubLList $list84;
    private static final SubLString $str85$STOP;
    private static final SubLString $str86$Microtheory__s_is_empty;
    private static final SubLSymbol $sym87$SHOP_MAKE_PROBLEM_FROM_MT_METHOD;
    private static final SubLSymbol $sym88$MAKE_DOMAIN_FROM_MT;
    private static final SubLList $list89;
    private static final SubLList $list90;
    private static final SubLSymbol $sym91$OUTER_CATCH_FOR_SHOP_METHOD;
    private static final SubLSymbol $sym92$SHOP_CYC_DOMAIN;
    private static final SubLSymbol $sym93$SHOP_MAKE_DOMAIN_FROM_MT_METHOD;
    private static final SubLSymbol $sym94$HLMT_P;
    private static final SubLSymbol $sym95$DO_FI_ASKS_;
    private static final SubLSymbol $sym96$NUM_BACKCHAINS;
    private static final SubLSymbol $kw97$ALL;
    private static final SubLObject $const98$preconditionForMethod;
    private static final SubLObject $const99$methodForAction;
    private static final SubLObject $const100$preconditionFor_Props;
    private static final SubLObject $const101$effectOfAction_Props;
    private static final SubLObject $const102$sufficientFor_Props;
    private static final SubLObject $const103$effectOfActionIf_Props;
    private static final SubLSymbol $sym104$SHOP_FIND_PLANS;
    private static final SubLList $list105;
    private static final SubLString $str106$Returns_a_list_of_plan_datastruct;
    private static final SubLList $list107;
    private static final SubLSymbol $sym108$SHOP_PLAN_P;
    private static final SubLList $list109;
    private static final SubLString $str110$Returns_T_iff_OBJECT_is_a_SHOP_pl;
    private static final SubLList $list111;
    private static final SubLSymbol $sym112$PRIMITIVE_FORM;
    private static final SubLSymbol $sym113$SHOP_PLAN_SIMPLE_ACTIONS;
    private static final SubLList $list114;
    private static final SubLString $str115$Returns_list_of_simple_action_sen;
    private static final SubLList $list116;
    private static final SubLSymbol $sym117$VARIABLE_MANAGER;
    private static final SubLSymbol $sym118$GOAL_TASK;
    private static final SubLSymbol $sym119$FORMULA;
    private static final SubLSymbol $sym120$RECOVER_EL;
    private static final SubLSymbol $sym121$SHOP_PLAN_GOAL;
    private static final SubLString $str122$Returns_the_task_that_has_PLAN_as;
    
    @SubLTranslatedFile.SubL(source = "cycl/shop-main.lisp", position = 2523L)
    public static SubLObject initialize_planner_kb_feature() {
        if (shop_main.NIL != list_utilities.every_in_list((SubLObject)shop_main.$sym3$VALID_CONSTANT_, shop_main.$planner_core_constants$.getGlobalValue(), (SubLObject)shop_main.UNPROVIDED)) {
            kb_control_vars.set_planner_kb_loaded();
        }
        else {
            kb_control_vars.unset_planner_kb_loaded();
        }
        return kb_control_vars.planner_kb_loaded_p();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/shop-main.lisp", position = 3084L)
    public static SubLObject shop_planner_p(final SubLObject shop_planner) {
        return interfaces.subloop_instanceof_interface(shop_planner, (SubLObject)shop_main.$sym5$SHOP_PLANNER);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/shop-main.lisp", position = 3455L)
    public static SubLObject subloop_reserved_initialize_shop_plan_displayer_factory_class(final SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, (SubLObject)shop_main.$sym8$OBJECT, (SubLObject)shop_main.$sym10$INSTANCE_COUNT, (SubLObject)shop_main.ZERO_INTEGER);
        return (SubLObject)shop_main.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/shop-main.lisp", position = 3455L)
    public static SubLObject subloop_reserved_initialize_shop_plan_displayer_factory_instance(final SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, (SubLObject)shop_main.$sym8$OBJECT, (SubLObject)shop_main.$sym12$ISOLATED_P, (SubLObject)shop_main.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)shop_main.$sym8$OBJECT, (SubLObject)shop_main.$sym13$INSTANCE_NUMBER, (SubLObject)shop_main.NIL);
        return (SubLObject)shop_main.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/shop-main.lisp", position = 3455L)
    public static SubLObject shop_plan_displayer_factory_p(final SubLObject shop_plan_displayer_factory) {
        return classes.subloop_instanceof_class(shop_plan_displayer_factory, (SubLObject)shop_main.$sym7$SHOP_PLAN_DISPLAYER_FACTORY);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/shop-main.lisp", position = 4018L)
    public static SubLObject get_shop_threads(final SubLObject shop) {
        return classes.subloop_get_instance_slot(shop, (SubLObject)shop_main.FOUR_INTEGER);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/shop-main.lisp", position = 4018L)
    public static SubLObject set_shop_threads(final SubLObject shop, final SubLObject value) {
        return classes.subloop_set_instance_slot(shop, value, (SubLObject)shop_main.FOUR_INTEGER);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/shop-main.lisp", position = 4018L)
    public static SubLObject get_shop_problem_table(final SubLObject shop) {
        return classes.subloop_get_instance_slot(shop, (SubLObject)shop_main.THREE_INTEGER);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/shop-main.lisp", position = 4018L)
    public static SubLObject set_shop_problem_table(final SubLObject shop, final SubLObject value) {
        return classes.subloop_set_instance_slot(shop, value, (SubLObject)shop_main.THREE_INTEGER);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/shop-main.lisp", position = 4018L)
    public static SubLObject get_shop_domain_table(final SubLObject shop) {
        return classes.subloop_get_instance_slot(shop, (SubLObject)shop_main.TWO_INTEGER);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/shop-main.lisp", position = 4018L)
    public static SubLObject set_shop_domain_table(final SubLObject shop, final SubLObject value) {
        return classes.subloop_set_instance_slot(shop, value, (SubLObject)shop_main.TWO_INTEGER);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/shop-main.lisp", position = 4018L)
    public static SubLObject get_shop_displayer_factory(final SubLObject shop) {
        return classes.subloop_get_instance_slot(shop, (SubLObject)shop_main.ONE_INTEGER);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/shop-main.lisp", position = 4018L)
    public static SubLObject set_shop_displayer_factory(final SubLObject shop, final SubLObject value) {
        return classes.subloop_set_instance_slot(shop, value, (SubLObject)shop_main.ONE_INTEGER);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/shop-main.lisp", position = 4018L)
    public static SubLObject subloop_reserved_initialize_shop_class(final SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, (SubLObject)shop_main.$sym8$OBJECT, (SubLObject)shop_main.$sym10$INSTANCE_COUNT, (SubLObject)shop_main.ZERO_INTEGER);
        return (SubLObject)shop_main.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/shop-main.lisp", position = 4018L)
    public static SubLObject subloop_reserved_initialize_shop_instance(final SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, (SubLObject)shop_main.$sym8$OBJECT, (SubLObject)shop_main.$sym12$ISOLATED_P, (SubLObject)shop_main.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)shop_main.$sym8$OBJECT, (SubLObject)shop_main.$sym13$INSTANCE_NUMBER, (SubLObject)shop_main.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)shop_main.$sym15$SHOP, (SubLObject)shop_main.$sym19$DISPLAYER_FACTORY, (SubLObject)shop_main.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)shop_main.$sym15$SHOP, (SubLObject)shop_main.$sym20$DOMAIN_TABLE, (SubLObject)shop_main.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)shop_main.$sym15$SHOP, (SubLObject)shop_main.$sym21$PROBLEM_TABLE, (SubLObject)shop_main.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)shop_main.$sym15$SHOP, (SubLObject)shop_main.$sym22$THREADS, (SubLObject)shop_main.NIL);
        return (SubLObject)shop_main.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/shop-main.lisp", position = 4018L)
    public static SubLObject shop_p(final SubLObject shop) {
        return classes.subloop_instanceof_class(shop, (SubLObject)shop_main.$sym15$SHOP);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/shop-main.lisp", position = 4465L)
    public static SubLObject shop_initialize_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_shop_method = (SubLObject)shop_main.NIL;
        SubLObject problem_table = get_shop_problem_table(self);
        SubLObject domain_table = get_shop_domain_table(self);
        SubLObject displayer_factory = get_shop_displayer_factory(self);
        try {
            thread.throwStack.push(shop_main.$sym27$OUTER_CATCH_FOR_SHOP_METHOD);
            try {
                object.object_initialize_method(self);
                domain_table = Hashtables.make_hash_table((SubLObject)shop_main.TEN_INTEGER, (SubLObject)shop_main.UNPROVIDED, (SubLObject)shop_main.UNPROVIDED);
                problem_table = Hashtables.make_hash_table((SubLObject)shop_main.TEN_INTEGER, (SubLObject)shop_main.UNPROVIDED, (SubLObject)shop_main.UNPROVIDED);
                displayer_factory = (SubLObject)shop_main.NIL;
                Dynamic.sublisp_throw((SubLObject)shop_main.$sym27$OUTER_CATCH_FOR_SHOP_METHOD, self);
            }
            finally {
                final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)shop_main.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    set_shop_problem_table(self, problem_table);
                    set_shop_domain_table(self, domain_table);
                    set_shop_displayer_factory(self, displayer_factory);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        }
        catch (Throwable ccatch_env_var) {
            catch_var_for_shop_method = Errors.handleThrowable(ccatch_env_var, (SubLObject)shop_main.$sym27$OUTER_CATCH_FOR_SHOP_METHOD);
        }
        finally {
            thread.throwStack.pop();
        }
        return catch_var_for_shop_method;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/shop-main.lisp", position = 4689L)
    public static SubLObject shop_get_domain_method(final SubLObject self, final SubLObject domain_name) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_shop_method = (SubLObject)shop_main.NIL;
        final SubLObject domain_table = get_shop_domain_table(self);
        try {
            thread.throwStack.push(shop_main.$sym32$OUTER_CATCH_FOR_SHOP_METHOD);
            try {
                Dynamic.sublisp_throw((SubLObject)shop_main.$sym32$OUTER_CATCH_FOR_SHOP_METHOD, Hashtables.gethash(domain_name, domain_table, (SubLObject)shop_main.UNPROVIDED));
            }
            finally {
                final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)shop_main.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    set_shop_domain_table(self, domain_table);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        }
        catch (Throwable ccatch_env_var) {
            catch_var_for_shop_method = Errors.handleThrowable(ccatch_env_var, (SubLObject)shop_main.$sym32$OUTER_CATCH_FOR_SHOP_METHOD);
        }
        finally {
            thread.throwStack.pop();
        }
        return catch_var_for_shop_method;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/shop-main.lisp", position = 4811L)
    public static SubLObject shop_get_problem_method(final SubLObject self, final SubLObject problem_name) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_shop_method = (SubLObject)shop_main.NIL;
        final SubLObject problem_table = get_shop_problem_table(self);
        try {
            thread.throwStack.push(shop_main.$sym37$OUTER_CATCH_FOR_SHOP_METHOD);
            try {
                final SubLObject prob = Hashtables.gethash(problem_name, problem_table, (SubLObject)shop_main.UNPROVIDED);
                if (shop_main.NIL == prob) {
                    Errors.cerror((SubLObject)shop_main.$str38$No_planning_problem_of_the_name__, problem_name);
                }
                Dynamic.sublisp_throw((SubLObject)shop_main.$sym37$OUTER_CATCH_FOR_SHOP_METHOD, prob);
            }
            finally {
                final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)shop_main.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    set_shop_problem_table(self, problem_table);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        }
        catch (Throwable ccatch_env_var) {
            catch_var_for_shop_method = Errors.handleThrowable(ccatch_env_var, (SubLObject)shop_main.$sym37$OUTER_CATCH_FOR_SHOP_METHOD);
        }
        finally {
            thread.throwStack.pop();
        }
        return catch_var_for_shop_method;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/shop-main.lisp", position = 5051L)
    public static SubLObject shop_make_new_thread_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_shop_method = (SubLObject)shop_main.NIL;
        SubLObject threads = get_shop_threads(self);
        try {
            thread.throwStack.push(shop_main.$sym42$OUTER_CATCH_FOR_SHOP_METHOD);
            try {
                final SubLObject new_thread = object.object_new_method((SubLObject)shop_main.$sym43$SHOP_BASIC_PLANNER_THREAD);
                if (conses_high.list_length(threads).numGE((SubLObject)shop_main.TWENTY_INTEGER)) {
                    shop_cleanup_threads_method(self);
                }
                threads = (SubLObject)ConsesLow.cons(new_thread, threads);
                instances.set_slot(new_thread, (SubLObject)shop_main.$sym44$PLANNER, self);
                Dynamic.sublisp_throw((SubLObject)shop_main.$sym42$OUTER_CATCH_FOR_SHOP_METHOD, new_thread);
            }
            finally {
                final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)shop_main.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    set_shop_threads(self, threads);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        }
        catch (Throwable ccatch_env_var) {
            catch_var_for_shop_method = Errors.handleThrowable(ccatch_env_var, (SubLObject)shop_main.$sym42$OUTER_CATCH_FOR_SHOP_METHOD);
        }
        finally {
            thread.throwStack.pop();
        }
        return catch_var_for_shop_method;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/shop-main.lisp", position = 5401L)
    public static SubLObject shop_make_problem_method(final SubLObject self, final SubLObject problem_name, final SubLObject domain_name, final SubLObject state, final SubLObject tasks, final SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_shop_method = (SubLObject)shop_main.NIL;
        final SubLObject problem_table = get_shop_problem_table(self);
        try {
            thread.throwStack.push(shop_main.$sym49$OUTER_CATCH_FOR_SHOP_METHOD);
            try {
                SubLObject domain = (SubLObject)shop_main.NIL;
                SubLObject new_problem = (SubLObject)shop_main.NIL;
                SubLObject new_statebody = (SubLObject)shop_main.NIL;
                new_problem = object.object_new_method((SubLObject)shop_main.$sym50$SHOP_BASIC_PROBLEM);
                new_statebody = object.object_new_method((SubLObject)shop_main.$sym51$SHOP_BASIC_WORLD_STATE);
                domain = shop_get_domain_method(self, domain_name);
                methods.funcall_instance_method_with_1_args(new_statebody, (SubLObject)shop_main.$sym52$MAKE_STATEBODY, state);
                shop_datastructures.shop_basic_problem_initialize_problem_method(new_problem, problem_name, domain, new_statebody, tasks, mt);
                Hashtables.sethash(problem_name, problem_table, new_problem);
                Dynamic.sublisp_throw((SubLObject)shop_main.$sym49$OUTER_CATCH_FOR_SHOP_METHOD, new_problem);
            }
            finally {
                final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)shop_main.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    set_shop_problem_table(self, problem_table);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        }
        catch (Throwable ccatch_env_var) {
            catch_var_for_shop_method = Errors.handleThrowable(ccatch_env_var, (SubLObject)shop_main.$sym49$OUTER_CATCH_FOR_SHOP_METHOD);
        }
        finally {
            thread.throwStack.pop();
        }
        return catch_var_for_shop_method;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/shop-main.lisp", position = 6062L)
    public static SubLObject shop_cleanup_threads_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_shop_method = (SubLObject)shop_main.NIL;
        SubLObject threads = get_shop_threads(self);
        try {
            thread.throwStack.push(shop_main.$sym56$OUTER_CATCH_FOR_SHOP_METHOD);
            try {
                threads = (SubLObject)shop_main.NIL;
                Dynamic.sublisp_throw((SubLObject)shop_main.$sym56$OUTER_CATCH_FOR_SHOP_METHOD, (SubLObject)shop_main.NIL);
            }
            finally {
                final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)shop_main.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    set_shop_threads(self, threads);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        }
        catch (Throwable ccatch_env_var) {
            catch_var_for_shop_method = Errors.handleThrowable(ccatch_env_var, (SubLObject)shop_main.$sym56$OUTER_CATCH_FOR_SHOP_METHOD);
        }
        finally {
            thread.throwStack.pop();
        }
        return catch_var_for_shop_method;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/shop-main.lisp", position = 6263L)
    public static SubLObject shop_gather_initial_state_method(final SubLObject self, final SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject init_mts = (SubLObject)shop_main.NIL;
        SubLObject node_var = mt;
        final SubLObject deck_type = (SubLObject)shop_main.$kw64$STACK;
        final SubLObject recur_deck = deck.create_deck(deck_type);
        final SubLObject _prev_bind_0 = sbhl_marking_vars.$sbhl_space$.currentBinding(thread);
        try {
            sbhl_marking_vars.$sbhl_space$.bind(sbhl_marking_vars.get_sbhl_marking_space(), thread);
            try {
                final SubLObject tv_var = (SubLObject)shop_main.NIL;
                final SubLObject _prev_bind_0_$1 = sbhl_search_vars.$sbhl_tv$.currentBinding(thread);
                final SubLObject _prev_bind_2 = sbhl_search_vars.$relevant_sbhl_tv_function$.currentBinding(thread);
                try {
                    sbhl_search_vars.$sbhl_tv$.bind((shop_main.NIL != tv_var) ? tv_var : sbhl_search_vars.get_sbhl_true_tv(), thread);
                    sbhl_search_vars.$relevant_sbhl_tv_function$.bind((SubLObject)((shop_main.NIL != tv_var) ? shop_main.$sym65$RELEVANT_SBHL_TV_IS_GENERAL_TV : sbhl_search_vars.$relevant_sbhl_tv_function$.getDynamicValue(thread)), thread);
                    if (shop_main.NIL != tv_var && shop_main.NIL != sbhl_paranoia.sbhl_object_type_checking_p() && shop_main.NIL == sbhl_search_vars.sbhl_true_tv_p(tv_var)) {
                        final SubLObject pcase_var = sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread);
                        if (pcase_var.eql((SubLObject)shop_main.$kw66$ERROR)) {
                            sbhl_paranoia.sbhl_error((SubLObject)shop_main.ONE_INTEGER, (SubLObject)shop_main.$str67$_A_is_not_a__A, tv_var, (SubLObject)shop_main.$sym68$SBHL_TRUE_TV_P, (SubLObject)shop_main.UNPROVIDED, (SubLObject)shop_main.UNPROVIDED, (SubLObject)shop_main.UNPROVIDED);
                        }
                        else if (pcase_var.eql((SubLObject)shop_main.$kw69$CERROR)) {
                            sbhl_paranoia.sbhl_cerror((SubLObject)shop_main.ONE_INTEGER, (SubLObject)shop_main.$str70$continue_anyway, (SubLObject)shop_main.$str67$_A_is_not_a__A, tv_var, (SubLObject)shop_main.$sym68$SBHL_TRUE_TV_P, (SubLObject)shop_main.UNPROVIDED, (SubLObject)shop_main.UNPROVIDED, (SubLObject)shop_main.UNPROVIDED);
                        }
                        else if (pcase_var.eql((SubLObject)shop_main.$kw71$WARN)) {
                            Errors.warn((SubLObject)shop_main.$str67$_A_is_not_a__A, tv_var, (SubLObject)shop_main.$sym68$SBHL_TRUE_TV_P);
                        }
                        else {
                            Errors.warn((SubLObject)shop_main.$str72$_A_is_not_a_valid__sbhl_type_erro, sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread));
                            Errors.cerror((SubLObject)shop_main.$str70$continue_anyway, (SubLObject)shop_main.$str67$_A_is_not_a__A, tv_var, (SubLObject)shop_main.$sym68$SBHL_TRUE_TV_P);
                        }
                    }
                    final SubLObject _prev_bind_0_$2 = sbhl_search_vars.$sbhl_search_module$.currentBinding(thread);
                    final SubLObject _prev_bind_1_$3 = sbhl_search_vars.$sbhl_search_module_type$.currentBinding(thread);
                    final SubLObject _prev_bind_3 = sbhl_search_vars.$sbhl_add_node_to_result_test$.currentBinding(thread);
                    final SubLObject _prev_bind_4 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                    final SubLObject _prev_bind_5 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                    try {
                        sbhl_search_vars.$sbhl_search_module$.bind(sbhl_module_vars.get_sbhl_module(shop_main.$const73$genlMt), thread);
                        sbhl_search_vars.$sbhl_search_module_type$.bind(sbhl_module_utilities.get_sbhl_module_type(sbhl_module_vars.get_sbhl_module(shop_main.$const73$genlMt)), thread);
                        sbhl_search_vars.$sbhl_add_node_to_result_test$.bind(sbhl_module_utilities.get_sbhl_add_node_to_result_test(sbhl_module_vars.get_sbhl_module(shop_main.$const73$genlMt)), thread);
                        sbhl_search_vars.$genl_inverse_mode_p$.bind((SubLObject)shop_main.NIL, thread);
                        sbhl_module_vars.$sbhl_module$.bind(sbhl_module_vars.get_sbhl_module(shop_main.$const73$genlMt), thread);
                        if (shop_main.NIL != sbhl_paranoia.suspend_sbhl_type_checkingP() || shop_main.NIL != sbhl_module_utilities.apply_sbhl_module_type_test(mt, sbhl_module_vars.get_sbhl_module((SubLObject)shop_main.UNPROVIDED))) {
                            final SubLObject _prev_bind_0_$3 = sbhl_search_vars.$sbhl_search_direction$.currentBinding(thread);
                            final SubLObject _prev_bind_1_$4 = sbhl_link_vars.$sbhl_link_direction$.currentBinding(thread);
                            final SubLObject _prev_bind_2_$6 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                            try {
                                sbhl_search_vars.$sbhl_search_direction$.bind(sbhl_search_vars.get_sbhl_forward_search_direction(), thread);
                                sbhl_link_vars.$sbhl_link_direction$.bind(sbhl_module_utilities.sbhl_search_direction_to_link_direction(sbhl_search_vars.get_sbhl_forward_search_direction(), sbhl_module_vars.get_sbhl_module(shop_main.$const73$genlMt)), thread);
                                sbhl_search_vars.$genl_inverse_mode_p$.bind((SubLObject)shop_main.NIL, thread);
                                sbhl_marking_utilities.sbhl_mark_node_marked(node_var, (SubLObject)shop_main.UNPROVIDED);
                                while (shop_main.NIL != node_var) {
                                    final SubLObject genl_mt = node_var;
                                    if (shop_main.NIL == subl_promotions.memberP(genl_mt, init_mts, (SubLObject)shop_main.UNPROVIDED, (SubLObject)shop_main.UNPROVIDED) && shop_main.NIL != isa.isaP(genl_mt, shop_main.$const74$PlanDynamicSituationMicrotheory, (SubLObject)shop_main.UNPROVIDED, (SubLObject)shop_main.UNPROVIDED)) {
                                        init_mts = (SubLObject)ConsesLow.cons(genl_mt, init_mts);
                                    }
                                    SubLObject cdolist_list_var;
                                    final SubLObject accessible_modules = cdolist_list_var = sbhl_macros.get_sbhl_accessible_modules(sbhl_module_vars.get_sbhl_module(shop_main.$const73$genlMt));
                                    SubLObject module_var = (SubLObject)shop_main.NIL;
                                    module_var = cdolist_list_var.first();
                                    while (shop_main.NIL != cdolist_list_var) {
                                        final SubLObject _prev_bind_0_$4 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                                        final SubLObject _prev_bind_1_$5 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                        try {
                                            sbhl_module_vars.$sbhl_module$.bind(module_var, thread);
                                            sbhl_search_vars.$genl_inverse_mode_p$.bind((SubLObject)((shop_main.NIL != sbhl_search_vars.flip_genl_inverse_modeP((SubLObject)shop_main.UNPROVIDED, (SubLObject)shop_main.UNPROVIDED)) ? SubLObjectFactory.makeBoolean(shop_main.NIL == sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread)) : sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread)), thread);
                                            final SubLObject node = function_terms.naut_to_nart(node_var);
                                            if (shop_main.NIL != sbhl_link_vars.sbhl_node_object_p(node)) {
                                                final SubLObject d_link = sbhl_graphs.get_sbhl_graph_link(node, sbhl_module_vars.get_sbhl_module((SubLObject)shop_main.UNPROVIDED));
                                                if (shop_main.NIL != d_link) {
                                                    final SubLObject mt_links = sbhl_links.get_sbhl_mt_links(d_link, sbhl_link_vars.get_sbhl_link_direction(), sbhl_module_vars.get_sbhl_module((SubLObject)shop_main.UNPROVIDED));
                                                    if (shop_main.NIL != mt_links) {
                                                        SubLObject iteration_state;
                                                        for (iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(mt_links)); shop_main.NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
                                                            thread.resetMultipleValues();
                                                            final SubLObject mt_$9 = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                                                            final SubLObject tv_links = thread.secondMultipleValue();
                                                            thread.resetMultipleValues();
                                                            if (shop_main.NIL != mt_relevance_macros.relevant_mtP(mt_$9)) {
                                                                final SubLObject _prev_bind_0_$5 = sbhl_link_vars.$sbhl_link_mt$.currentBinding(thread);
                                                                try {
                                                                    sbhl_link_vars.$sbhl_link_mt$.bind(mt_$9, thread);
                                                                    SubLObject iteration_state_$11;
                                                                    for (iteration_state_$11 = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(tv_links)); shop_main.NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state_$11); iteration_state_$11 = dictionary_contents.do_dictionary_contents_next(iteration_state_$11)) {
                                                                        thread.resetMultipleValues();
                                                                        final SubLObject tv = dictionary_contents.do_dictionary_contents_key_value(iteration_state_$11);
                                                                        final SubLObject link_nodes = thread.secondMultipleValue();
                                                                        thread.resetMultipleValues();
                                                                        if (shop_main.NIL != sbhl_search_vars.relevant_sbhl_tvP(tv)) {
                                                                            final SubLObject _prev_bind_0_$6 = sbhl_link_vars.$sbhl_link_tv$.currentBinding(thread);
                                                                            try {
                                                                                sbhl_link_vars.$sbhl_link_tv$.bind(tv, thread);
                                                                                final SubLObject sol = link_nodes;
                                                                                if (shop_main.NIL != set.set_p(sol)) {
                                                                                    final SubLObject set_contents_var = set.do_set_internal(sol);
                                                                                    SubLObject basis_object;
                                                                                    SubLObject state;
                                                                                    SubLObject node_vars_link_node;
                                                                                    for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = (SubLObject)shop_main.NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); shop_main.NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
                                                                                        node_vars_link_node = set_contents.do_set_contents_next(basis_object, state);
                                                                                        if (shop_main.NIL != set_contents.do_set_contents_element_validP(state, node_vars_link_node) && shop_main.NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node, (SubLObject)shop_main.UNPROVIDED)) {
                                                                                            sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node, (SubLObject)shop_main.UNPROVIDED);
                                                                                            deck.deck_push(node_vars_link_node, recur_deck);
                                                                                        }
                                                                                    }
                                                                                }
                                                                                else if (sol.isList()) {
                                                                                    SubLObject csome_list_var = sol;
                                                                                    SubLObject node_vars_link_node2 = (SubLObject)shop_main.NIL;
                                                                                    node_vars_link_node2 = csome_list_var.first();
                                                                                    while (shop_main.NIL != csome_list_var) {
                                                                                        if (shop_main.NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node2, (SubLObject)shop_main.UNPROVIDED)) {
                                                                                            sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node2, (SubLObject)shop_main.UNPROVIDED);
                                                                                            deck.deck_push(node_vars_link_node2, recur_deck);
                                                                                        }
                                                                                        csome_list_var = csome_list_var.rest();
                                                                                        node_vars_link_node2 = csome_list_var.first();
                                                                                    }
                                                                                }
                                                                                else {
                                                                                    Errors.error((SubLObject)shop_main.$str75$_A_is_neither_SET_P_nor_LISTP_, sol);
                                                                                }
                                                                            }
                                                                            finally {
                                                                                sbhl_link_vars.$sbhl_link_tv$.rebind(_prev_bind_0_$6, thread);
                                                                            }
                                                                        }
                                                                    }
                                                                    dictionary_contents.do_dictionary_contents_finalize(iteration_state_$11);
                                                                }
                                                                finally {
                                                                    sbhl_link_vars.$sbhl_link_mt$.rebind(_prev_bind_0_$5, thread);
                                                                }
                                                            }
                                                        }
                                                        dictionary_contents.do_dictionary_contents_finalize(iteration_state);
                                                    }
                                                }
                                                else {
                                                    sbhl_paranoia.sbhl_error((SubLObject)shop_main.FIVE_INTEGER, (SubLObject)shop_main.$str76$attempting_to_bind_direction_link, (SubLObject)shop_main.UNPROVIDED, (SubLObject)shop_main.UNPROVIDED, (SubLObject)shop_main.UNPROVIDED, (SubLObject)shop_main.UNPROVIDED, (SubLObject)shop_main.UNPROVIDED);
                                                }
                                            }
                                            else if (shop_main.NIL != obsolete.cnat_p(node, (SubLObject)shop_main.UNPROVIDED)) {
                                                SubLObject cdolist_list_var_$13;
                                                final SubLObject new_list = cdolist_list_var_$13 = ((shop_main.NIL != sbhl_link_vars.sbhl_randomize_lists_p()) ? list_utilities.randomize_list(sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module((SubLObject)shop_main.UNPROVIDED))) : sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module((SubLObject)shop_main.UNPROVIDED)));
                                                SubLObject generating_fn = (SubLObject)shop_main.NIL;
                                                generating_fn = cdolist_list_var_$13.first();
                                                while (shop_main.NIL != cdolist_list_var_$13) {
                                                    final SubLObject _prev_bind_0_$7 = sbhl_link_vars.$sbhl_link_generator$.currentBinding(thread);
                                                    try {
                                                        sbhl_link_vars.$sbhl_link_generator$.bind(generating_fn, thread);
                                                        final SubLObject sol2;
                                                        final SubLObject link_nodes2 = sol2 = Functions.funcall(generating_fn, node);
                                                        if (shop_main.NIL != set.set_p(sol2)) {
                                                            final SubLObject set_contents_var2 = set.do_set_internal(sol2);
                                                            SubLObject basis_object2;
                                                            SubLObject state2;
                                                            SubLObject node_vars_link_node3;
                                                            for (basis_object2 = set_contents.do_set_contents_basis_object(set_contents_var2), state2 = (SubLObject)shop_main.NIL, state2 = set_contents.do_set_contents_initial_state(basis_object2, set_contents_var2); shop_main.NIL == set_contents.do_set_contents_doneP(basis_object2, state2); state2 = set_contents.do_set_contents_update_state(state2)) {
                                                                node_vars_link_node3 = set_contents.do_set_contents_next(basis_object2, state2);
                                                                if (shop_main.NIL != set_contents.do_set_contents_element_validP(state2, node_vars_link_node3) && shop_main.NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node3, (SubLObject)shop_main.UNPROVIDED)) {
                                                                    sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node3, (SubLObject)shop_main.UNPROVIDED);
                                                                    deck.deck_push(node_vars_link_node3, recur_deck);
                                                                }
                                                            }
                                                        }
                                                        else if (sol2.isList()) {
                                                            SubLObject csome_list_var2 = sol2;
                                                            SubLObject node_vars_link_node4 = (SubLObject)shop_main.NIL;
                                                            node_vars_link_node4 = csome_list_var2.first();
                                                            while (shop_main.NIL != csome_list_var2) {
                                                                if (shop_main.NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node4, (SubLObject)shop_main.UNPROVIDED)) {
                                                                    sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node4, (SubLObject)shop_main.UNPROVIDED);
                                                                    deck.deck_push(node_vars_link_node4, recur_deck);
                                                                }
                                                                csome_list_var2 = csome_list_var2.rest();
                                                                node_vars_link_node4 = csome_list_var2.first();
                                                            }
                                                        }
                                                        else {
                                                            Errors.error((SubLObject)shop_main.$str75$_A_is_neither_SET_P_nor_LISTP_, sol2);
                                                        }
                                                    }
                                                    finally {
                                                        sbhl_link_vars.$sbhl_link_generator$.rebind(_prev_bind_0_$7, thread);
                                                    }
                                                    cdolist_list_var_$13 = cdolist_list_var_$13.rest();
                                                    generating_fn = cdolist_list_var_$13.first();
                                                }
                                            }
                                        }
                                        finally {
                                            sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_1_$5, thread);
                                            sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_0_$4, thread);
                                        }
                                        cdolist_list_var = cdolist_list_var.rest();
                                        module_var = cdolist_list_var.first();
                                    }
                                    node_var = deck.deck_pop(recur_deck);
                                }
                            }
                            finally {
                                sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_2_$6, thread);
                                sbhl_link_vars.$sbhl_link_direction$.rebind(_prev_bind_1_$4, thread);
                                sbhl_search_vars.$sbhl_search_direction$.rebind(_prev_bind_0_$3, thread);
                            }
                        }
                        else {
                            sbhl_paranoia.sbhl_warn((SubLObject)shop_main.TWO_INTEGER, (SubLObject)shop_main.$str77$Node__a_does_not_pass_sbhl_type_t, mt, sbhl_module_utilities.get_sbhl_type_test(sbhl_module_vars.get_sbhl_module((SubLObject)shop_main.UNPROVIDED)), (SubLObject)shop_main.UNPROVIDED, (SubLObject)shop_main.UNPROVIDED, (SubLObject)shop_main.UNPROVIDED);
                        }
                    }
                    finally {
                        sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_5, thread);
                        sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_4, thread);
                        sbhl_search_vars.$sbhl_add_node_to_result_test$.rebind(_prev_bind_3, thread);
                        sbhl_search_vars.$sbhl_search_module_type$.rebind(_prev_bind_1_$3, thread);
                        sbhl_search_vars.$sbhl_search_module$.rebind(_prev_bind_0_$2, thread);
                    }
                }
                finally {
                    sbhl_search_vars.$relevant_sbhl_tv_function$.rebind(_prev_bind_2, thread);
                    sbhl_search_vars.$sbhl_tv$.rebind(_prev_bind_0_$1, thread);
                }
            }
            finally {
                final SubLObject _prev_bind_0_$8 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)shop_main.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    sbhl_marking_vars.free_sbhl_marking_space(sbhl_marking_vars.$sbhl_space$.getDynamicValue(thread));
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$8, thread);
                }
            }
        }
        finally {
            sbhl_marking_vars.$sbhl_space$.rebind(_prev_bind_0, thread);
        }
        return Mapping.mapcar((SubLObject)shop_main.$sym78$ASSERTION_HL_FORMULA, Functions.apply((SubLObject)shop_main.$sym79$APPEND, Mapping.mapcar((SubLObject)shop_main.$sym80$GATHER_MT_INDEX, init_mts)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/shop-main.lisp", position = 6622L)
    public static SubLObject shop_make_problem_from_mt_method(final SubLObject self, final SubLObject domain_symbol, final SubLObject mt) {
        SubLObject cyc_tasks = (SubLObject)shop_main.NIL;
        final SubLObject initial_state = shop_gather_initial_state_method(self, mt);
        SubLObject new_problem = (SubLObject)shop_main.NIL;
        cyc_tasks = Mapping.mapcar((SubLObject)shop_main.$sym78$ASSERTION_HL_FORMULA, kb_mapping.gather_mt_index(mt));
        if (shop_main.NIL == cyc_tasks) {
            Errors.cerror((SubLObject)shop_main.$str85$STOP, (SubLObject)shop_main.$str86$Microtheory__s_is_empty, mt);
            return (SubLObject)shop_main.NIL;
        }
        new_problem = shop_make_problem_method(self, mt, domain_symbol, initial_state, cyc_tasks, mt);
        return new_problem;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/shop-main.lisp", position = 7270L)
    public static SubLObject shop_make_domain_from_mt_method(final SubLObject self, final SubLObject domain_mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_shop_method = (SubLObject)shop_main.NIL;
        final SubLObject domain_table = get_shop_domain_table(self);
        try {
            thread.throwStack.push(shop_main.$sym91$OUTER_CATCH_FOR_SHOP_METHOD);
            try {
                final SubLObject domain = object.object_new_method((SubLObject)shop_main.$sym92$SHOP_CYC_DOMAIN);
                shop_domain.shop_cyc_domain_process_plan_assertions_method(domain, domain_mt);
                Hashtables.sethash(domain_mt, domain_table, domain);
                Dynamic.sublisp_throw((SubLObject)shop_main.$sym91$OUTER_CATCH_FOR_SHOP_METHOD, domain);
            }
            finally {
                final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)shop_main.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    set_shop_domain_table(self, domain_table);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        }
        catch (Throwable ccatch_env_var) {
            catch_var_for_shop_method = Errors.handleThrowable(ccatch_env_var, (SubLObject)shop_main.$sym91$OUTER_CATCH_FOR_SHOP_METHOD);
        }
        finally {
            thread.throwStack.pop();
        }
        return catch_var_for_shop_method;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/shop-main.lisp", position = 7712L)
    public static SubLObject shop_find_plans_int(final SubLObject task, final SubLObject mt, final SubLObject verbose, final SubLObject number, final SubLObject time, final SubLObject depth, final SubLObject backchain) {
        if (shop_main.NIL == shop_main.$shop$.getGlobalValue()) {
            shop_main.$shop$.setGlobalValue(object.object_new_method((SubLObject)shop_main.$sym15$SHOP));
        }
        assert shop_main.NIL != hlmt.hlmt_p(mt) : mt;
        final SubLObject planner_thread = shop_make_new_thread_method(shop_main.$shop$.getGlobalValue());
        if (shop_main.NIL != backchain) {
            instances.set_slot(planner_thread, (SubLObject)shop_main.$sym95$DO_FI_ASKS_, (SubLObject)shop_main.T);
            instances.set_slot(planner_thread, (SubLObject)shop_main.$sym96$NUM_BACKCHAINS, backchain);
        }
        shop_make_domain_from_mt_method(shop_main.$shop$.getGlobalValue(), mt);
        shop_basic_planner_thread.shop_basic_planner_thread_find_plans_method(planner_thread, task, mt, (SubLObject)shop_main.$kw97$ALL, verbose, number, time, depth);
        return shop_basic_planner_thread.shop_basic_planner_thread_cycl_plans_method(planner_thread);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/shop-main.lisp", position = 8482L)
    public static SubLObject shop_planning_assertionP(final SubLObject assertion) {
        if (shop_main.NIL != assertions_high.gaf_assertionP(assertion)) {
            return Equality.eq(assertions_high.gaf_predicate(assertion), shop_main.$const98$preconditionForMethod);
        }
        if (shop_main.NIL != assertions_high.assertion_mentions_term(assertion, shop_main.$const99$methodForAction)) {
            return (SubLObject)shop_main.T;
        }
        if (shop_main.NIL != assertions_high.assertion_mentions_term(assertion, shop_main.$const100$preconditionFor_Props)) {
            return (SubLObject)shop_main.T;
        }
        if (shop_main.NIL != assertions_high.assertion_mentions_term(assertion, shop_main.$const101$effectOfAction_Props)) {
            return (SubLObject)shop_main.T;
        }
        if (shop_main.NIL != assertions_high.assertion_mentions_term(assertion, shop_main.$const102$sufficientFor_Props)) {
            return (SubLObject)shop_main.T;
        }
        if (shop_main.NIL != assertions_high.assertion_mentions_term(assertion, shop_main.$const103$effectOfActionIf_Props)) {
            return (SubLObject)shop_main.T;
        }
        return (SubLObject)shop_main.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/shop-main.lisp", position = 9166L)
    public static SubLObject shop_find_plans(final SubLObject task, final SubLObject mt, SubLObject verbose, SubLObject number, SubLObject time, SubLObject depth, SubLObject backchain) {
        if (verbose == shop_main.UNPROVIDED) {
            verbose = (SubLObject)shop_main.ZERO_INTEGER;
        }
        if (number == shop_main.UNPROVIDED) {
            number = (SubLObject)shop_main.NIL;
        }
        if (time == shop_main.UNPROVIDED) {
            time = (SubLObject)shop_main.NIL;
        }
        if (depth == shop_main.UNPROVIDED) {
            depth = (SubLObject)shop_main.NIL;
        }
        if (backchain == shop_main.UNPROVIDED) {
            backchain = (SubLObject)shop_main.NIL;
        }
        return shop_find_plans_int(task, mt, verbose, number, time, depth, backchain);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/shop-main.lisp", position = 10390L)
    public static SubLObject shop_plan_p(final SubLObject v_object) {
        return shop_basic_plan.shop_basic_plan_p(v_object);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/shop-main.lisp", position = 10628L)
    public static SubLObject shop_plan_simple_actions(final SubLObject plan) {
        enforceType(plan, shop_main.$sym108$SHOP_PLAN_P);
        assert shop_main.NIL != shop_plan_p(plan) : plan;
        return methods.funcall_instance_method_with_0_args(plan, (SubLObject)shop_main.$sym112$PRIMITIVE_FORM);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/shop-main.lisp", position = 11040L)
    public static SubLObject shop_plan_goal(final SubLObject plan) {
        enforceType(plan, shop_main.$sym108$SHOP_PLAN_P);
        assert shop_main.NIL != shop_plan_p(plan) : plan;
        final SubLObject var_manager = instances.get_slot(plan, (SubLObject)shop_main.$sym117$VARIABLE_MANAGER);
        final SubLObject task_struc = methods.funcall_instance_method_with_0_args(plan, (SubLObject)shop_main.$sym118$GOAL_TASK);
        final SubLObject task_pl_form = methods.funcall_instance_method_with_0_args(task_struc, (SubLObject)shop_main.$sym119$FORMULA);
        final SubLObject task_el_form = methods.funcall_instance_method_with_1_args(var_manager, (SubLObject)shop_main.$sym120$RECOVER_EL, task_pl_form);
        return task_el_form;
    }
    
    public static SubLObject declare_shop_main_file() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.shop_main", "initialize_planner_kb_feature", "INITIALIZE-PLANNER-KB-FEATURE", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.shop_main", "shop_planner_p", "SHOP-PLANNER-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.shop_main", "subloop_reserved_initialize_shop_plan_displayer_factory_class", "SUBLOOP-RESERVED-INITIALIZE-SHOP-PLAN-DISPLAYER-FACTORY-CLASS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.shop_main", "subloop_reserved_initialize_shop_plan_displayer_factory_instance", "SUBLOOP-RESERVED-INITIALIZE-SHOP-PLAN-DISPLAYER-FACTORY-INSTANCE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.shop_main", "shop_plan_displayer_factory_p", "SHOP-PLAN-DISPLAYER-FACTORY-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.shop_main", "get_shop_threads", "GET-SHOP-THREADS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.shop_main", "set_shop_threads", "SET-SHOP-THREADS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.shop_main", "get_shop_problem_table", "GET-SHOP-PROBLEM-TABLE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.shop_main", "set_shop_problem_table", "SET-SHOP-PROBLEM-TABLE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.shop_main", "get_shop_domain_table", "GET-SHOP-DOMAIN-TABLE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.shop_main", "set_shop_domain_table", "SET-SHOP-DOMAIN-TABLE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.shop_main", "get_shop_displayer_factory", "GET-SHOP-DISPLAYER-FACTORY", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.shop_main", "set_shop_displayer_factory", "SET-SHOP-DISPLAYER-FACTORY", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.shop_main", "subloop_reserved_initialize_shop_class", "SUBLOOP-RESERVED-INITIALIZE-SHOP-CLASS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.shop_main", "subloop_reserved_initialize_shop_instance", "SUBLOOP-RESERVED-INITIALIZE-SHOP-INSTANCE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.shop_main", "shop_p", "SHOP-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.shop_main", "shop_initialize_method", "SHOP-INITIALIZE-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.shop_main", "shop_get_domain_method", "SHOP-GET-DOMAIN-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.shop_main", "shop_get_problem_method", "SHOP-GET-PROBLEM-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.shop_main", "shop_make_new_thread_method", "SHOP-MAKE-NEW-THREAD-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.shop_main", "shop_make_problem_method", "SHOP-MAKE-PROBLEM-METHOD", 6, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.shop_main", "shop_cleanup_threads_method", "SHOP-CLEANUP-THREADS-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.shop_main", "shop_gather_initial_state_method", "SHOP-GATHER-INITIAL-STATE-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.shop_main", "shop_make_problem_from_mt_method", "SHOP-MAKE-PROBLEM-FROM-MT-METHOD", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.shop_main", "shop_make_domain_from_mt_method", "SHOP-MAKE-DOMAIN-FROM-MT-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.shop_main", "shop_find_plans_int", "SHOP-FIND-PLANS-INT", 7, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.shop_main", "shop_planning_assertionP", "SHOP-PLANNING-ASSERTION?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.shop_main", "shop_find_plans", "SHOP-FIND-PLANS", 2, 5, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.shop_main", "shop_plan_p", "SHOP-PLAN-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.shop_main", "shop_plan_simple_actions", "SHOP-PLAN-SIMPLE-ACTIONS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.shop_main", "shop_plan_goal", "SHOP-PLAN-GOAL", 1, 0, false);
        return (SubLObject)shop_main.NIL;
    }
    
    public static SubLObject init_shop_main_file() {
        shop_main.$new_method_pred$ = SubLFiles.deflexical("*NEW-METHOD-PRED*", (SubLObject)shop_main.NIL);
        shop_main.$shop_simple_action_definition_predicates$ = SubLFiles.deflexical("*SHOP-SIMPLE-ACTION-DEFINITION-PREDICATES*", (SubLObject)shop_main.$list0);
        shop_main.$shop_complex_action_definition_predicates$ = SubLFiles.deflexical("*SHOP-COMPLEX-ACTION-DEFINITION-PREDICATES*", (SubLObject)shop_main.$list1);
        shop_main.$shop_domain_definition_predicates$ = SubLFiles.deflexical("*SHOP-DOMAIN-DEFINITION-PREDICATES*", conses_high.union(shop_main.$shop_simple_action_definition_predicates$.getGlobalValue(), shop_main.$shop_complex_action_definition_predicates$.getGlobalValue(), (SubLObject)shop_main.UNPROVIDED, (SubLObject)shop_main.UNPROVIDED));
        shop_main.$shop_domain_definition_collections$ = SubLFiles.deflexical("*SHOP-DOMAIN-DEFINITION-COLLECTIONS*", (SubLObject)shop_main.$list2);
        shop_main.$planner_core_constants$ = SubLFiles.deflexical("*PLANNER-CORE-CONSTANTS*", ConsesLow.append(shop_main.$shop_domain_definition_predicates$.getGlobalValue(), shop_main.$shop_domain_definition_collections$.getGlobalValue()));
        shop_main.$shop$ = SubLFiles.deflexical("*SHOP*", (SubLObject)(maybeDefault((SubLObject)shop_main.$sym4$_SHOP_, shop_main.$shop$, shop_main.NIL)));
        return (SubLObject)shop_main.NIL;
    }
    
    public static SubLObject setup_shop_main_file() {
        subl_macro_promotions.declare_defglobal((SubLObject)shop_main.$sym4$_SHOP_);
        interfaces.new_interface((SubLObject)shop_main.$sym5$SHOP_PLANNER, (SubLObject)shop_main.NIL, (SubLObject)shop_main.NIL, (SubLObject)shop_main.$list6);
        classes.subloop_new_class((SubLObject)shop_main.$sym7$SHOP_PLAN_DISPLAYER_FACTORY, (SubLObject)shop_main.$sym8$OBJECT, (SubLObject)shop_main.NIL, (SubLObject)shop_main.NIL, (SubLObject)shop_main.$list9);
        classes.class_set_implements_slot_listeners((SubLObject)shop_main.$sym7$SHOP_PLAN_DISPLAYER_FACTORY, (SubLObject)shop_main.NIL);
        classes.subloop_note_class_initialization_function((SubLObject)shop_main.$sym7$SHOP_PLAN_DISPLAYER_FACTORY, (SubLObject)shop_main.$sym11$SUBLOOP_RESERVED_INITIALIZE_SHOP_PLAN_DISPLAYER_FACTORY_CLASS);
        classes.subloop_note_instance_initialization_function((SubLObject)shop_main.$sym7$SHOP_PLAN_DISPLAYER_FACTORY, (SubLObject)shop_main.$sym14$SUBLOOP_RESERVED_INITIALIZE_SHOP_PLAN_DISPLAYER_FACTORY_INSTANCE);
        subloop_reserved_initialize_shop_plan_displayer_factory_class((SubLObject)shop_main.$sym7$SHOP_PLAN_DISPLAYER_FACTORY);
        classes.subloop_new_class((SubLObject)shop_main.$sym15$SHOP, (SubLObject)shop_main.$sym8$OBJECT, (SubLObject)shop_main.$list16, (SubLObject)shop_main.NIL, (SubLObject)shop_main.$list17);
        classes.class_set_implements_slot_listeners((SubLObject)shop_main.$sym15$SHOP, (SubLObject)shop_main.NIL);
        classes.subloop_note_class_initialization_function((SubLObject)shop_main.$sym15$SHOP, (SubLObject)shop_main.$sym18$SUBLOOP_RESERVED_INITIALIZE_SHOP_CLASS);
        classes.subloop_note_instance_initialization_function((SubLObject)shop_main.$sym15$SHOP, (SubLObject)shop_main.$sym23$SUBLOOP_RESERVED_INITIALIZE_SHOP_INSTANCE);
        subloop_reserved_initialize_shop_class((SubLObject)shop_main.$sym15$SHOP);
        methods.methods_incorporate_instance_method((SubLObject)shop_main.$sym24$INITIALIZE, (SubLObject)shop_main.$sym15$SHOP, (SubLObject)shop_main.$list25, (SubLObject)shop_main.NIL, (SubLObject)shop_main.$list26);
        methods.subloop_register_instance_method((SubLObject)shop_main.$sym15$SHOP, (SubLObject)shop_main.$sym24$INITIALIZE, (SubLObject)shop_main.$sym28$SHOP_INITIALIZE_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)shop_main.$sym29$GET_DOMAIN, (SubLObject)shop_main.$sym15$SHOP, (SubLObject)shop_main.$list25, (SubLObject)shop_main.$list30, (SubLObject)shop_main.$list31);
        methods.subloop_register_instance_method((SubLObject)shop_main.$sym15$SHOP, (SubLObject)shop_main.$sym29$GET_DOMAIN, (SubLObject)shop_main.$sym33$SHOP_GET_DOMAIN_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)shop_main.$sym34$GET_PROBLEM, (SubLObject)shop_main.$sym15$SHOP, (SubLObject)shop_main.$list25, (SubLObject)shop_main.$list35, (SubLObject)shop_main.$list36);
        methods.subloop_register_instance_method((SubLObject)shop_main.$sym15$SHOP, (SubLObject)shop_main.$sym34$GET_PROBLEM, (SubLObject)shop_main.$sym39$SHOP_GET_PROBLEM_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)shop_main.$sym40$MAKE_NEW_THREAD, (SubLObject)shop_main.$sym15$SHOP, (SubLObject)shop_main.$list25, (SubLObject)shop_main.NIL, (SubLObject)shop_main.$list41);
        methods.subloop_register_instance_method((SubLObject)shop_main.$sym15$SHOP, (SubLObject)shop_main.$sym40$MAKE_NEW_THREAD, (SubLObject)shop_main.$sym45$SHOP_MAKE_NEW_THREAD_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)shop_main.$sym46$MAKE_PROBLEM, (SubLObject)shop_main.$sym15$SHOP, (SubLObject)shop_main.$list25, (SubLObject)shop_main.$list47, (SubLObject)shop_main.$list48);
        methods.subloop_register_instance_method((SubLObject)shop_main.$sym15$SHOP, (SubLObject)shop_main.$sym46$MAKE_PROBLEM, (SubLObject)shop_main.$sym53$SHOP_MAKE_PROBLEM_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)shop_main.$sym54$CLEANUP_THREADS, (SubLObject)shop_main.$sym15$SHOP, (SubLObject)shop_main.$list25, (SubLObject)shop_main.NIL, (SubLObject)shop_main.$list55);
        methods.subloop_register_instance_method((SubLObject)shop_main.$sym15$SHOP, (SubLObject)shop_main.$sym54$CLEANUP_THREADS, (SubLObject)shop_main.$sym57$SHOP_CLEANUP_THREADS_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)shop_main.$sym58$GATHER_INITIAL_STATE, (SubLObject)shop_main.$sym15$SHOP, (SubLObject)shop_main.$list59, (SubLObject)shop_main.$list60, (SubLObject)shop_main.$list61);
        methods.subloop_register_instance_method((SubLObject)shop_main.$sym15$SHOP, (SubLObject)shop_main.$sym58$GATHER_INITIAL_STATE, (SubLObject)shop_main.$sym81$SHOP_GATHER_INITIAL_STATE_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)shop_main.$sym82$MAKE_PROBLEM_FROM_MT, (SubLObject)shop_main.$sym15$SHOP, (SubLObject)shop_main.$list25, (SubLObject)shop_main.$list83, (SubLObject)shop_main.$list84);
        methods.subloop_register_instance_method((SubLObject)shop_main.$sym15$SHOP, (SubLObject)shop_main.$sym82$MAKE_PROBLEM_FROM_MT, (SubLObject)shop_main.$sym87$SHOP_MAKE_PROBLEM_FROM_MT_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)shop_main.$sym88$MAKE_DOMAIN_FROM_MT, (SubLObject)shop_main.$sym15$SHOP, (SubLObject)shop_main.$list25, (SubLObject)shop_main.$list89, (SubLObject)shop_main.$list90);
        methods.subloop_register_instance_method((SubLObject)shop_main.$sym15$SHOP, (SubLObject)shop_main.$sym88$MAKE_DOMAIN_FROM_MT, (SubLObject)shop_main.$sym93$SHOP_MAKE_DOMAIN_FROM_MT_METHOD);
        utilities_macros.register_cyc_api_function((SubLObject)shop_main.$sym104$SHOP_FIND_PLANS, (SubLObject)shop_main.$list105, (SubLObject)shop_main.$str106$Returns_a_list_of_plan_datastruct, (SubLObject)shop_main.NIL, (SubLObject)shop_main.$list107);
        utilities_macros.register_cyc_api_function((SubLObject)shop_main.$sym108$SHOP_PLAN_P, (SubLObject)shop_main.$list109, (SubLObject)shop_main.$str110$Returns_T_iff_OBJECT_is_a_SHOP_pl, (SubLObject)shop_main.NIL, (SubLObject)shop_main.$list111);
        utilities_macros.register_cyc_api_function((SubLObject)shop_main.$sym113$SHOP_PLAN_SIMPLE_ACTIONS, (SubLObject)shop_main.$list114, (SubLObject)shop_main.$str115$Returns_list_of_simple_action_sen, (SubLObject)shop_main.$list116, (SubLObject)shop_main.$list107);
        utilities_macros.register_cyc_api_function((SubLObject)shop_main.$sym121$SHOP_PLAN_GOAL, (SubLObject)shop_main.$list114, (SubLObject)shop_main.$str122$Returns_the_task_that_has_PLAN_as, (SubLObject)shop_main.$list116, (SubLObject)shop_main.$list107);
        return (SubLObject)shop_main.NIL;
    }
    
    @Override
	public void declareFunctions() {
        declare_shop_main_file();
    }
    
    @Override
	public void initializeVariables() {
        init_shop_main_file();
    }
    
    @Override
	public void runTopLevelForms() {
        setup_shop_main_file();
    }
    
    static {
        me = (SubLFile)new shop_main();
        shop_main.$new_method_pred$ = null;
        shop_main.$shop_simple_action_definition_predicates$ = null;
        shop_main.$shop_complex_action_definition_predicates$ = null;
        shop_main.$shop_domain_definition_predicates$ = null;
        shop_main.$shop_domain_definition_collections$ = null;
        shop_main.$planner_core_constants$ = null;
        shop_main.$shop$ = null;
        $list0 = ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("preconditionFor-Props")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("effectOfAction-Props")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("effectOfActionIf-Props")));
        $list1 = ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("methodForAction")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("sufficientFor-Props")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("preconditionForMethod")));
        $list2 = ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SimpleSituationPredicate")));
        $sym3$VALID_CONSTANT_ = SubLObjectFactory.makeSymbol("VALID-CONSTANT?");
        $sym4$_SHOP_ = SubLObjectFactory.makeSymbol("*SHOP*");
        $sym5$SHOP_PLANNER = SubLObjectFactory.makeSymbol("SHOP-PLANNER");
        $list6 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("MAKE-NEW-THREAD"), (SubLObject)shop_main.NIL, (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("MAKE-PROBLEM-FROM-MT"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DOMAIN"), (SubLObject)SubLObjectFactory.makeSymbol("MT")), (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("MAKE-DOMAIN-FROM-MT"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("MT")), (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("GET-PROBLEM"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NAME")), (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("GET-DOMAIN"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NAME")), (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")));
        $sym7$SHOP_PLAN_DISPLAYER_FACTORY = SubLObjectFactory.makeSymbol("SHOP-PLAN-DISPLAYER-FACTORY");
        $sym8$OBJECT = SubLObjectFactory.makeSymbol("OBJECT");
        $list9 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-CLASS-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("CREATE-PLAN-DISPLAYER"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PLAN")), (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-CLASS-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("CREATE-TASK-DISPLAYER"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TASK")), (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")));
        $sym10$INSTANCE_COUNT = SubLObjectFactory.makeSymbol("INSTANCE-COUNT");
        $sym11$SUBLOOP_RESERVED_INITIALIZE_SHOP_PLAN_DISPLAYER_FACTORY_CLASS = SubLObjectFactory.makeSymbol("SUBLOOP-RESERVED-INITIALIZE-SHOP-PLAN-DISPLAYER-FACTORY-CLASS");
        $sym12$ISOLATED_P = SubLObjectFactory.makeSymbol("ISOLATED-P");
        $sym13$INSTANCE_NUMBER = SubLObjectFactory.makeSymbol("INSTANCE-NUMBER");
        $sym14$SUBLOOP_RESERVED_INITIALIZE_SHOP_PLAN_DISPLAYER_FACTORY_INSTANCE = SubLObjectFactory.makeSymbol("SUBLOOP-RESERVED-INITIALIZE-SHOP-PLAN-DISPLAYER-FACTORY-INSTANCE");
        $sym15$SHOP = SubLObjectFactory.makeSymbol("SHOP");
        $list16 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SHOP-PLANNER"));
        $list17 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DISPLAYER-FACTORY"), (SubLObject)SubLObjectFactory.makeKeyword("INSTANCE"), (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DOMAIN-TABLE"), (SubLObject)SubLObjectFactory.makeKeyword("INSTANCE"), (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PROBLEM-TABLE"), (SubLObject)SubLObjectFactory.makeKeyword("INSTANCE"), (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("THREADS"), (SubLObject)SubLObjectFactory.makeKeyword("INSTANCE"), (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("CLEANUP-THREADS"), (SubLObject)shop_main.NIL, (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("GATHER-INITIAL-STATE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("MT")), (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")));
        $sym18$SUBLOOP_RESERVED_INITIALIZE_SHOP_CLASS = SubLObjectFactory.makeSymbol("SUBLOOP-RESERVED-INITIALIZE-SHOP-CLASS");
        $sym19$DISPLAYER_FACTORY = SubLObjectFactory.makeSymbol("DISPLAYER-FACTORY");
        $sym20$DOMAIN_TABLE = SubLObjectFactory.makeSymbol("DOMAIN-TABLE");
        $sym21$PROBLEM_TABLE = SubLObjectFactory.makeSymbol("PROBLEM-TABLE");
        $sym22$THREADS = SubLObjectFactory.makeSymbol("THREADS");
        $sym23$SUBLOOP_RESERVED_INITIALIZE_SHOP_INSTANCE = SubLObjectFactory.makeSymbol("SUBLOOP-RESERVED-INITIALIZE-SHOP-INSTANCE");
        $sym24$INITIALIZE = SubLObjectFactory.makeSymbol("INITIALIZE");
        $list25 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("PUBLIC"));
        $list26 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("INITIALIZE"), (SubLObject)SubLObjectFactory.makeSymbol("SUPER")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("DOMAIN-TABLE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("MAKE-HASH-TABLE"), (SubLObject)shop_main.TEN_INTEGER)), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("PROBLEM-TABLE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("MAKE-HASH-TABLE"), (SubLObject)shop_main.TEN_INTEGER)), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("DISPLAYER-FACTORY"), (SubLObject)shop_main.NIL), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("SELF")));
        $sym27$OUTER_CATCH_FOR_SHOP_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-SHOP-METHOD");
        $sym28$SHOP_INITIALIZE_METHOD = SubLObjectFactory.makeSymbol("SHOP-INITIALIZE-METHOD");
        $sym29$GET_DOMAIN = SubLObjectFactory.makeSymbol("GET-DOMAIN");
        $list30 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DOMAIN-NAME"));
        $list31 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("GETHASH"), (SubLObject)SubLObjectFactory.makeSymbol("DOMAIN-NAME"), (SubLObject)SubLObjectFactory.makeSymbol("DOMAIN-TABLE"))));
        $sym32$OUTER_CATCH_FOR_SHOP_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-SHOP-METHOD");
        $sym33$SHOP_GET_DOMAIN_METHOD = SubLObjectFactory.makeSymbol("SHOP-GET-DOMAIN-METHOD");
        $sym34$GET_PROBLEM = SubLObjectFactory.makeSymbol("GET-PROBLEM");
        $list35 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PROBLEM-NAME"));
        $list36 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PROB"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("GETHASH"), (SubLObject)SubLObjectFactory.makeSymbol("PROBLEM-NAME"), (SubLObject)SubLObjectFactory.makeSymbol("PROBLEM-TABLE")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PWHEN"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NULL"), (SubLObject)SubLObjectFactory.makeSymbol("PROB")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CERROR"), (SubLObject)SubLObjectFactory.makeString("No planning problem of the name ~s"), (SubLObject)SubLObjectFactory.makeSymbol("PROBLEM-NAME"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("PROB"))));
        $sym37$OUTER_CATCH_FOR_SHOP_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-SHOP-METHOD");
        $str38$No_planning_problem_of_the_name__ = SubLObjectFactory.makeString("No planning problem of the name ~s");
        $sym39$SHOP_GET_PROBLEM_METHOD = SubLObjectFactory.makeSymbol("SHOP-GET-PROBLEM-METHOD");
        $sym40$MAKE_NEW_THREAD = SubLObjectFactory.makeSymbol("MAKE-NEW-THREAD");
        $list41 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NEW-THREAD"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("INLINE-METHOD"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NEW"), (SubLObject)SubLObjectFactory.makeSymbol("SHOP-BASIC-PLANNER-THREAD")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("SHOP-BASIC-PLANNER-THREAD"))))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PWHEN"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol(">="), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("LIST-LENGTH"), (SubLObject)SubLObjectFactory.makeSymbol("THREADS")), (SubLObject)shop_main.TWENTY_INTEGER), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLEANUP-THREADS"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CPUSH"), (SubLObject)SubLObjectFactory.makeSymbol("NEW-THREAD"), (SubLObject)SubLObjectFactory.makeSymbol("THREADS")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SET-SLOT"), (SubLObject)SubLObjectFactory.makeSymbol("NEW-THREAD"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("PLANNER")), (SubLObject)SubLObjectFactory.makeSymbol("SELF")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("NEW-THREAD"))));
        $sym42$OUTER_CATCH_FOR_SHOP_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-SHOP-METHOD");
        $sym43$SHOP_BASIC_PLANNER_THREAD = SubLObjectFactory.makeSymbol("SHOP-BASIC-PLANNER-THREAD");
        $sym44$PLANNER = SubLObjectFactory.makeSymbol("PLANNER");
        $sym45$SHOP_MAKE_NEW_THREAD_METHOD = SubLObjectFactory.makeSymbol("SHOP-MAKE-NEW-THREAD-METHOD");
        $sym46$MAKE_PROBLEM = SubLObjectFactory.makeSymbol("MAKE-PROBLEM");
        $list47 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PROBLEM-NAME"), (SubLObject)SubLObjectFactory.makeSymbol("DOMAIN-NAME"), (SubLObject)SubLObjectFactory.makeSymbol("STATE"), (SubLObject)SubLObjectFactory.makeSymbol("TASKS"), (SubLObject)SubLObjectFactory.makeSymbol("MT"));
        $list48 = ConsesLow.list((SubLObject)ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeSymbol("CLET"), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DOMAIN"), (SubLObject)SubLObjectFactory.makeSymbol("NEW-PROBLEM"), (SubLObject)SubLObjectFactory.makeSymbol("NEW-STATEBODY")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("NEW-PROBLEM"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("INLINE-METHOD"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NEW"), (SubLObject)SubLObjectFactory.makeSymbol("SHOP-BASIC-PROBLEM")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("SHOP-BASIC-PROBLEM")))), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("NEW-STATEBODY"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("INLINE-METHOD"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NEW"), (SubLObject)SubLObjectFactory.makeSymbol("SHOP-BASIC-WORLD-STATE")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("SHOP-BASIC-WORLD-STATE")))), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("DOMAIN"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("GET-DOMAIN"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)SubLObjectFactory.makeSymbol("DOMAIN-NAME"))), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("INLINE-METHOD"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("MAKE-STATEBODY"), (SubLObject)SubLObjectFactory.makeSymbol("SHOP-BASIC-WORLD-STATE")), (SubLObject)SubLObjectFactory.makeSymbol("NEW-STATEBODY"), (SubLObject)SubLObjectFactory.makeSymbol("STATE")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("INLINE-METHOD"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("INITIALIZE-PROBLEM"), (SubLObject)SubLObjectFactory.makeSymbol("SHOP-BASIC-PROBLEM")), (SubLObject)SubLObjectFactory.makeSymbol("NEW-PROBLEM"), (SubLObject)SubLObjectFactory.makeSymbol("PROBLEM-NAME"), (SubLObject)SubLObjectFactory.makeSymbol("DOMAIN"), (SubLObject)SubLObjectFactory.makeSymbol("NEW-STATEBODY"), (SubLObject)SubLObjectFactory.makeSymbol("TASKS"), (SubLObject)SubLObjectFactory.makeSymbol("MT")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("GETHASH"), (SubLObject)SubLObjectFactory.makeSymbol("PROBLEM-NAME"), (SubLObject)SubLObjectFactory.makeSymbol("PROBLEM-TABLE")), (SubLObject)SubLObjectFactory.makeSymbol("NEW-PROBLEM")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("NEW-PROBLEM")) }));
        $sym49$OUTER_CATCH_FOR_SHOP_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-SHOP-METHOD");
        $sym50$SHOP_BASIC_PROBLEM = SubLObjectFactory.makeSymbol("SHOP-BASIC-PROBLEM");
        $sym51$SHOP_BASIC_WORLD_STATE = SubLObjectFactory.makeSymbol("SHOP-BASIC-WORLD-STATE");
        $sym52$MAKE_STATEBODY = SubLObjectFactory.makeSymbol("MAKE-STATEBODY");
        $sym53$SHOP_MAKE_PROBLEM_METHOD = SubLObjectFactory.makeSymbol("SHOP-MAKE-PROBLEM-METHOD");
        $sym54$CLEANUP_THREADS = SubLObjectFactory.makeSymbol("CLEANUP-THREADS");
        $list55 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("THREADS"), (SubLObject)shop_main.NIL), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)shop_main.NIL));
        $sym56$OUTER_CATCH_FOR_SHOP_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-SHOP-METHOD");
        $sym57$SHOP_CLEANUP_THREADS_METHOD = SubLObjectFactory.makeSymbol("SHOP-CLEANUP-THREADS-METHOD");
        $sym58$GATHER_INITIAL_STATE = SubLObjectFactory.makeSymbol("GATHER-INITIAL-STATE");
        $list59 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("PRIVATE"));
        $list60 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("MT"));
        $list61 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("INIT-MTS"), (SubLObject)shop_main.NIL)), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DO-ALL-GENL-MTS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("GENL-MT"), (SubLObject)SubLObjectFactory.makeSymbol("MT")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PWHEN"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CAND"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CNOT"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("MEMBER?"), (SubLObject)SubLObjectFactory.makeSymbol("GENL-MT"), (SubLObject)SubLObjectFactory.makeSymbol("INIT-MTS"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ISA?"), (SubLObject)SubLObjectFactory.makeSymbol("GENL-MT"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("PlanDynamicSituationMicrotheory")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CPUSH"), (SubLObject)SubLObjectFactory.makeSymbol("GENL-MT"), (SubLObject)SubLObjectFactory.makeSymbol("INIT-MTS")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("MAPCAR"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("ASSERTION-HL-FORMULA")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("APPLY"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("APPEND")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("MAPCAR"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("GATHER-MT-INDEX")), (SubLObject)SubLObjectFactory.makeSymbol("INIT-MTS")))))));
        $kw62$BREADTH = SubLObjectFactory.makeKeyword("BREADTH");
        $kw63$QUEUE = SubLObjectFactory.makeKeyword("QUEUE");
        $kw64$STACK = SubLObjectFactory.makeKeyword("STACK");
        $sym65$RELEVANT_SBHL_TV_IS_GENERAL_TV = SubLObjectFactory.makeSymbol("RELEVANT-SBHL-TV-IS-GENERAL-TV");
        $kw66$ERROR = SubLObjectFactory.makeKeyword("ERROR");
        $str67$_A_is_not_a__A = SubLObjectFactory.makeString("~A is not a ~A");
        $sym68$SBHL_TRUE_TV_P = SubLObjectFactory.makeSymbol("SBHL-TRUE-TV-P");
        $kw69$CERROR = SubLObjectFactory.makeKeyword("CERROR");
        $str70$continue_anyway = SubLObjectFactory.makeString("continue anyway");
        $kw71$WARN = SubLObjectFactory.makeKeyword("WARN");
        $str72$_A_is_not_a_valid__sbhl_type_erro = SubLObjectFactory.makeString("~A is not a valid *sbhl-type-error-action* value");
        $const73$genlMt = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("genlMt"));
        $const74$PlanDynamicSituationMicrotheory = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("PlanDynamicSituationMicrotheory"));
        $str75$_A_is_neither_SET_P_nor_LISTP_ = SubLObjectFactory.makeString("~A is neither SET-P nor LISTP.");
        $str76$attempting_to_bind_direction_link = SubLObjectFactory.makeString("attempting to bind direction link variable, to NIL. macro body not executed.");
        $str77$Node__a_does_not_pass_sbhl_type_t = SubLObjectFactory.makeString("Node ~a does not pass sbhl-type-test ~a~%");
        $sym78$ASSERTION_HL_FORMULA = SubLObjectFactory.makeSymbol("ASSERTION-HL-FORMULA");
        $sym79$APPEND = SubLObjectFactory.makeSymbol("APPEND");
        $sym80$GATHER_MT_INDEX = SubLObjectFactory.makeSymbol("GATHER-MT-INDEX");
        $sym81$SHOP_GATHER_INITIAL_STATE_METHOD = SubLObjectFactory.makeSymbol("SHOP-GATHER-INITIAL-STATE-METHOD");
        $sym82$MAKE_PROBLEM_FROM_MT = SubLObjectFactory.makeSymbol("MAKE-PROBLEM-FROM-MT");
        $list83 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DOMAIN-SYMBOL"), (SubLObject)SubLObjectFactory.makeSymbol("MT"));
        $list84 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("Creates a planning problem object for the planner from \n   the information in PROBLEM-MT, that has planning domain \n   DOMAIN-NAME."), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CYC-TASKS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PROBLEM-NAME"), (SubLObject)SubLObjectFactory.makeSymbol("MT")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("INITIAL-STATE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("GATHER-INITIAL-STATE"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)SubLObjectFactory.makeSymbol("MT"))), (SubLObject)SubLObjectFactory.makeSymbol("NEW-PROBLEM")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("CYC-TASKS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("MAPCAR"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("ASSERTION-HL-FORMULA")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("GATHER-MT-INDEX"), (SubLObject)SubLObjectFactory.makeSymbol("MT")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PUNLESS"), (SubLObject)SubLObjectFactory.makeSymbol("CYC-TASKS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CERROR"), (SubLObject)SubLObjectFactory.makeString("STOP"), (SubLObject)SubLObjectFactory.makeString("Microtheory ~s is empty"), (SubLObject)SubLObjectFactory.makeSymbol("MT")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)shop_main.NIL)), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("NEW-PROBLEM"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("MAKE-PROBLEM"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)SubLObjectFactory.makeSymbol("PROBLEM-NAME"), (SubLObject)SubLObjectFactory.makeSymbol("DOMAIN-SYMBOL"), (SubLObject)SubLObjectFactory.makeSymbol("INITIAL-STATE"), (SubLObject)SubLObjectFactory.makeSymbol("CYC-TASKS"), (SubLObject)SubLObjectFactory.makeSymbol("MT"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("NEW-PROBLEM"))));
        $str85$STOP = SubLObjectFactory.makeString("STOP");
        $str86$Microtheory__s_is_empty = SubLObjectFactory.makeString("Microtheory ~s is empty");
        $sym87$SHOP_MAKE_PROBLEM_FROM_MT_METHOD = SubLObjectFactory.makeSymbol("SHOP-MAKE-PROBLEM-FROM-MT-METHOD");
        $sym88$MAKE_DOMAIN_FROM_MT = SubLObjectFactory.makeSymbol("MAKE-DOMAIN-FROM-MT");
        $list89 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DOMAIN-MT"));
        $list90 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("Creates a planning domain structure for the planner from \n   the information in DOMAIN-MT.\n   @param DOMAIN-MT hlmt-p\n   @return shop-domain-p"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DOMAIN"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("INLINE-METHOD"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NEW"), (SubLObject)SubLObjectFactory.makeSymbol("SHOP-CYC-DOMAIN")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("SHOP-CYC-DOMAIN"))))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("INLINE-METHOD"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PROCESS-PLAN-ASSERTIONS"), (SubLObject)SubLObjectFactory.makeSymbol("SHOP-CYC-DOMAIN")), (SubLObject)SubLObjectFactory.makeSymbol("DOMAIN"), (SubLObject)SubLObjectFactory.makeSymbol("DOMAIN-MT")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("GETHASH"), (SubLObject)SubLObjectFactory.makeSymbol("DOMAIN-MT"), (SubLObject)SubLObjectFactory.makeSymbol("DOMAIN-TABLE")), (SubLObject)SubLObjectFactory.makeSymbol("DOMAIN")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("DOMAIN"))));
        $sym91$OUTER_CATCH_FOR_SHOP_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-SHOP-METHOD");
        $sym92$SHOP_CYC_DOMAIN = SubLObjectFactory.makeSymbol("SHOP-CYC-DOMAIN");
        $sym93$SHOP_MAKE_DOMAIN_FROM_MT_METHOD = SubLObjectFactory.makeSymbol("SHOP-MAKE-DOMAIN-FROM-MT-METHOD");
        $sym94$HLMT_P = SubLObjectFactory.makeSymbol("HLMT-P");
        $sym95$DO_FI_ASKS_ = SubLObjectFactory.makeSymbol("DO-FI-ASKS?");
        $sym96$NUM_BACKCHAINS = SubLObjectFactory.makeSymbol("NUM-BACKCHAINS");
        $kw97$ALL = SubLObjectFactory.makeKeyword("ALL");
        $const98$preconditionForMethod = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("preconditionForMethod"));
        $const99$methodForAction = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("methodForAction"));
        $const100$preconditionFor_Props = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("preconditionFor-Props"));
        $const101$effectOfAction_Props = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("effectOfAction-Props"));
        $const102$sufficientFor_Props = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("sufficientFor-Props"));
        $const103$effectOfActionIf_Props = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("effectOfActionIf-Props"));
        $sym104$SHOP_FIND_PLANS = SubLObjectFactory.makeSymbol("SHOP-FIND-PLANS");
        $list105 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TASK"), (SubLObject)SubLObjectFactory.makeSymbol("MT"), (SubLObject)SubLObjectFactory.makeSymbol("&OPTIONAL"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("VERBOSE"), (SubLObject)shop_main.ZERO_INTEGER), (SubLObject)SubLObjectFactory.makeSymbol("NUMBER"), (SubLObject)SubLObjectFactory.makeSymbol("TIME"), (SubLObject)SubLObjectFactory.makeSymbol("DEPTH"), (SubLObject)SubLObjectFactory.makeSymbol("BACKCHAIN"));
        $str106$Returns_a_list_of_plan_datastruct = SubLObjectFactory.makeString("Returns a list of plan datastructures for TASK in the context of MT.\n   TASK is a formula with an instance of #$ActionPredicate as its first argument. \n   MT is a microtheory.\n   VERBOSE is an integer between 0 and 9, that controls how much logging information\n   shop should send to standard output.\n   NUMBER is the maximum number of plans to return.\n   TIME is the maximum amount of time allocated to the planner.\n   DEPTH is the maximum depth the planner can reach searching for plans.\n   BACKCHAIN is the maximum number of backchains allowed when querying the KB when matching\n   rule conditions.");
        $list107 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("LISTP"));
        $sym108$SHOP_PLAN_P = SubLObjectFactory.makeSymbol("SHOP-PLAN-P");
        $list109 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("OBJECT"));
        $str110$Returns_T_iff_OBJECT_is_a_SHOP_pl = SubLObjectFactory.makeString("Returns T iff OBJECT is a SHOP plan datastructure.");
        $list111 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("BOOLEANP"));
        $sym112$PRIMITIVE_FORM = SubLObjectFactory.makeSymbol("PRIMITIVE-FORM");
        $sym113$SHOP_PLAN_SIMPLE_ACTIONS = SubLObjectFactory.makeSymbol("SHOP-PLAN-SIMPLE-ACTIONS");
        $list114 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PLAN"));
        $str115$Returns_list_of_simple_action_sen = SubLObjectFactory.makeString("Returns list of simple action sentences for PLAN.\n   A return value of NIL means that PLAN is trivial\n   (i.e. the original task for the plan is already achieved.");
        $list116 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PLAN"), (SubLObject)SubLObjectFactory.makeSymbol("SHOP-PLAN-P")));
        $sym117$VARIABLE_MANAGER = SubLObjectFactory.makeSymbol("VARIABLE-MANAGER");
        $sym118$GOAL_TASK = SubLObjectFactory.makeSymbol("GOAL-TASK");
        $sym119$FORMULA = SubLObjectFactory.makeSymbol("FORMULA");
        $sym120$RECOVER_EL = SubLObjectFactory.makeSymbol("RECOVER-EL");
        $sym121$SHOP_PLAN_GOAL = SubLObjectFactory.makeSymbol("SHOP-PLAN-GOAL");
        $str122$Returns_the_task_that_has_PLAN_as = SubLObjectFactory.makeString("Returns the task that has PLAN as a solution.");
    }
}

/*

	Total time: 582 ms
	
*/