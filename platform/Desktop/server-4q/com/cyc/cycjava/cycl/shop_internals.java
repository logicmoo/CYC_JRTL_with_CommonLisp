package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Strings;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Packages;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class shop_internals extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.shop_internals";
    public static final String myFingerPrint = "a83b6c727ec29e1e8c8612e4ba76cdf7df05a2a76259c9a4c22688293159e72a";
    @SubLTranslatedFile.SubL(source = "cycl/shop-internals.lisp", position = 1157L)
    public static SubLSymbol $shop_verbose_keys$;
    @SubLTranslatedFile.SubL(source = "cycl/shop-internals.lisp", position = 1482L)
    public static SubLSymbol $shop_gc$;
    @SubLTranslatedFile.SubL(source = "cycl/shop-internals.lisp", position = 1566L)
    private static SubLSymbol $shop_verbose_target$;
    private static final SubLList $list0;
    private static final SubLSymbol $kw1$STDOUT;
    private static final SubLList $list2;
    private static final SubLList $list3;
    private static final SubLList $list4;
    private static final SubLSymbol $sym5$SET_SLOT;
    private static final SubLSymbol $sym6$1_;
    private static final SubLSymbol $sym7$GET_SLOT;
    private static final SubLSymbol $sym8$PROCESS_TIMER;
    private static final SubLList $list9;
    private static final SubLSymbol $sym10$STATISTIC_MANAGER;
    private static final SubLSymbol $sym11$OBJECT;
    private static final SubLList $list12;
    private static final SubLList $list13;
    private static final SubLSymbol $sym14$LAST_CALL_REAL_TIME;
    private static final SubLSymbol $sym15$LAST_CALL_RUN_TIME;
    private static final SubLSymbol $sym16$END_REAL_TIME;
    private static final SubLSymbol $sym17$END_RUN_TIME;
    private static final SubLSymbol $sym18$START_REAL_TIME;
    private static final SubLSymbol $sym19$START_RUN_TIME;
    private static final SubLSymbol $sym20$TIMING_;
    private static final SubLSymbol $sym21$INSTANCE_COUNT;
    private static final SubLSymbol $sym22$SUBLOOP_RESERVED_INITIALIZE_STATISTIC_MANAGER_CLASS;
    private static final SubLSymbol $sym23$ISOLATED_P;
    private static final SubLSymbol $sym24$INSTANCE_NUMBER;
    private static final SubLSymbol $sym25$SUBLOOP_RESERVED_INITIALIZE_STATISTIC_MANAGER_INSTANCE;
    private static final SubLSymbol $sym26$INITIALIZE;
    private static final SubLList $list27;
    private static final SubLList $list28;
    private static final SubLSymbol $sym29$STATISTIC_MANAGER_INITIALIZE_METHOD;
    private static final SubLSymbol $sym30$GET_RUN_TIME;
    private static final SubLList $list31;
    private static final SubLList $list32;
    private static final SubLSymbol $sym33$STATISTIC_MANAGER_GET_RUN_TIME_METHOD;
    private static final SubLSymbol $sym34$GET_REAL_TIME;
    private static final SubLList $list35;
    private static final SubLSymbol $sym36$STATISTIC_MANAGER_GET_REAL_TIME_METHOD;
    private static final SubLSymbol $sym37$RESET_LAST_CALL_TIME;
    private static final SubLList $list38;
    private static final SubLSymbol $sym39$OUTER_CATCH_FOR_STATISTIC_MANAGER_METHOD;
    private static final SubLSymbol $sym40$STATISTIC_MANAGER_RESET_LAST_CALL_TIME_METHOD;
    private static final SubLSymbol $sym41$START_TIMING;
    private static final SubLList $list42;
    private static final SubLList $list43;
    private static final SubLSymbol $sym44$OUTER_CATCH_FOR_STATISTIC_MANAGER_METHOD;
    private static final SubLSymbol $sym45$STATISTIC_MANAGER_START_TIMING_METHOD;
    private static final SubLSymbol $sym46$RESUME_TIMING;
    private static final SubLList $list47;
    private static final SubLSymbol $sym48$OUTER_CATCH_FOR_STATISTIC_MANAGER_METHOD;
    private static final SubLSymbol $sym49$STATISTIC_MANAGER_RESUME_TIMING_METHOD;
    private static final SubLSymbol $sym50$STOP_TIMING;
    private static final SubLList $list51;
    private static final SubLSymbol $sym52$OUTER_CATCH_FOR_STATISTIC_MANAGER_METHOD;
    private static final SubLSymbol $sym53$STATISTIC_MANAGER_STOP_TIMING_METHOD;
    private static final SubLSymbol $sym54$IS_TIMING_;
    private static final SubLList $list55;
    private static final SubLSymbol $sym56$OUTER_CATCH_FOR_STATISTIC_MANAGER_METHOD;
    private static final SubLSymbol $sym57$STATISTIC_MANAGER_IS_TIMING__METHOD;
    private static final SubLSymbol $sym58$ELAPSED_REAL_TIME;
    private static final SubLList $list59;
    private static final SubLSymbol $sym60$OUTER_CATCH_FOR_STATISTIC_MANAGER_METHOD;
    private static final SubLSymbol $sym61$STATISTIC_MANAGER_ELAPSED_REAL_TIME_METHOD;
    private static final SubLSymbol $sym62$ELAPSED_RUN_TIME;
    private static final SubLList $list63;
    private static final SubLSymbol $sym64$OUTER_CATCH_FOR_STATISTIC_MANAGER_METHOD;
    private static final SubLSymbol $sym65$STATISTIC_MANAGER_ELAPSED_RUN_TIME_METHOD;
    private static final SubLSymbol $sym66$RESET_TIMING;
    private static final SubLList $list67;
    private static final SubLSymbol $sym68$OUTER_CATCH_FOR_STATISTIC_MANAGER_METHOD;
    private static final SubLSymbol $sym69$STATISTIC_MANAGER_RESET_TIMING_METHOD;
    private static final SubLSymbol $sym70$ELAPSED_REAL_TIME_SINCE_LAST_CALL;
    private static final SubLList $list71;
    private static final SubLSymbol $sym72$OUTER_CATCH_FOR_STATISTIC_MANAGER_METHOD;
    private static final SubLSymbol $sym73$STATISTIC_MANAGER_ELAPSED_REAL_TIME_SINCE_LAST_CALL_METHOD;
    private static final SubLSymbol $sym74$ELAPSED_RUN_TIME_SINCE_LAST_CALL;
    private static final SubLList $list75;
    private static final SubLSymbol $sym76$OUTER_CATCH_FOR_STATISTIC_MANAGER_METHOD;
    private static final SubLSymbol $sym77$STATISTIC_MANAGER_ELAPSED_RUN_TIME_SINCE_LAST_CALL_METHOD;
    private static final SubLSymbol $sym78$SHOP_STATISTIC_MANAGER;
    private static final SubLList $list79;
    private static final SubLSymbol $sym80$SUBLOOP_RESERVED_INITIALIZE_SHOP_STATISTIC_MANAGER_CLASS;
    private static final SubLSymbol $sym81$METHOD_COUNTER;
    private static final SubLSymbol $sym82$INFERENCE_COUNTER;
    private static final SubLSymbol $sym83$FI_ASK_COUNTER;
    private static final SubLSymbol $sym84$PLAN_STATE_ASK_COUNTER;
    private static final SubLSymbol $sym85$PLAN_COUNTER;
    private static final SubLSymbol $sym86$PLANS;
    private static final SubLSymbol $sym87$SUBLOOP_RESERVED_INITIALIZE_SHOP_STATISTIC_MANAGER_INSTANCE;
    private static final SubLList $list88;
    private static final SubLSymbol $sym89$SHOP_STATISTIC_MANAGER_INITIALIZE_METHOD;
    private static final SubLSymbol $sym90$RESET_COUNTERS;
    private static final SubLList $list91;
    private static final SubLSymbol $sym92$OUTER_CATCH_FOR_SHOP_STATISTIC_MANAGER_METHOD;
    private static final SubLSymbol $sym93$SHOP_STATISTIC_MANAGER_RESET_COUNTERS_METHOD;
    private static final SubLSymbol $sym94$ADD_FI_ASK;
    private static final SubLList $list95;
    private static final SubLList $list96;
    private static final SubLSymbol $sym97$SHOP_STATISTIC_MANAGER_ADD_FI_ASK_METHOD;
    private static final SubLSymbol $sym98$ADD_PLAN_STATE_ASK;
    private static final SubLList $list99;
    private static final SubLSymbol $sym100$SHOP_STATISTIC_MANAGER_ADD_PLAN_STATE_ASK_METHOD;
    private static final SubLSymbol $sym101$ADD_EXPANSION;
    private static final SubLList $list102;
    private static final SubLSymbol $sym103$SHOP_STATISTIC_MANAGER_ADD_EXPANSION_METHOD;
    private static final SubLSymbol $sym104$ADD_INFERENCE;
    private static final SubLList $list105;
    private static final SubLSymbol $sym106$SHOP_STATISTIC_MANAGER_ADD_INFERENCE_METHOD;
    private static final SubLSymbol $sym107$ADD_PLAN;
    private static final SubLList $list108;
    private static final SubLList $list109;
    private static final SubLSymbol $sym110$SHOP_STATISTIC_MANAGER_ADD_PLAN_METHOD;
    private static final SubLSymbol $sym111$NUMBER_OF_INFERENCES;
    private static final SubLList $list112;
    private static final SubLSymbol $sym113$OUTER_CATCH_FOR_SHOP_STATISTIC_MANAGER_METHOD;
    private static final SubLSymbol $sym114$SHOP_STATISTIC_MANAGER_NUMBER_OF_INFERENCES_METHOD;
    private static final SubLSymbol $sym115$NUMBER_OF_METHODS;
    private static final SubLList $list116;
    private static final SubLSymbol $sym117$OUTER_CATCH_FOR_SHOP_STATISTIC_MANAGER_METHOD;
    private static final SubLSymbol $sym118$SHOP_STATISTIC_MANAGER_NUMBER_OF_METHODS_METHOD;
    private static final SubLSymbol $sym119$NUMBER_OF_EXPANSIONS;
    private static final SubLSymbol $sym120$OUTER_CATCH_FOR_SHOP_STATISTIC_MANAGER_METHOD;
    private static final SubLSymbol $sym121$SHOP_STATISTIC_MANAGER_NUMBER_OF_EXPANSIONS_METHOD;
    private static final SubLSymbol $sym122$NUMBER_OF_PLANS;
    private static final SubLList $list123;
    private static final SubLSymbol $sym124$OUTER_CATCH_FOR_SHOP_STATISTIC_MANAGER_METHOD;
    private static final SubLSymbol $sym125$SHOP_STATISTIC_MANAGER_NUMBER_OF_PLANS_METHOD;
    private static final SubLSymbol $sym126$NUMBER_OF_FI_ASKS;
    private static final SubLList $list127;
    private static final SubLSymbol $sym128$OUTER_CATCH_FOR_SHOP_STATISTIC_MANAGER_METHOD;
    private static final SubLSymbol $sym129$SHOP_STATISTIC_MANAGER_NUMBER_OF_FI_ASKS_METHOD;
    private static final SubLSymbol $sym130$NUMBER_OF_PLAN_STATE_ASKS;
    private static final SubLList $list131;
    private static final SubLSymbol $sym132$OUTER_CATCH_FOR_SHOP_STATISTIC_MANAGER_METHOD;
    private static final SubLSymbol $sym133$SHOP_STATISTIC_MANAGER_NUMBER_OF_PLAN_STATE_ASKS_METHOD;
    private static final SubLSymbol $sym134$SHOP_VARIABLE_MANAGER;
    private static final SubLList $list135;
    private static final SubLSymbol $sym136$VARIABLE_COUNTER;
    private static final SubLSymbol $sym137$VARIABLE_PREFIX;
    private static final SubLSymbol $sym138$SUBLOOP_RESERVED_INITIALIZE_SHOP_VARIABLE_MANAGER_CLASS;
    private static final SubLSymbol $sym139$VARIABLE_ASSOC_TABLE;
    private static final SubLSymbol $sym140$SUBLOOP_RESERVED_INITIALIZE_SHOP_VARIABLE_MANAGER_INSTANCE;
    private static final SubLList $list141;
    private static final SubLList $list142;
    private static final SubLString $str143$_PV_;
    private static final SubLInteger $int144$100;
    private static final SubLSymbol $sym145$SHOP_VARIABLE_MANAGER_INITIALIZE_METHOD;
    private static final SubLSymbol $sym146$GENERATE_VARIABLE;
    private static final SubLList $list147;
    private static final SubLSymbol $sym148$OUTER_CATCH_FOR_SHOP_VARIABLE_MANAGER_METHOD;
    private static final SubLString $str149$CYC;
    private static final SubLSymbol $sym150$SHOP_VARIABLE_MANAGER_GENERATE_VARIABLE_METHOD;
    private static final SubLSymbol $sym151$GENERATE_BINDING_PAIR;
    private static final SubLList $list152;
    private static final SubLList $list153;
    private static final SubLSymbol $sym154$OUTER_CATCH_FOR_SHOP_VARIABLE_MANAGER_METHOD;
    private static final SubLSymbol $sym155$SHOP_VARIABLE_MANAGER_GENERATE_BINDING_PAIR_METHOD;
    private static final SubLSymbol $sym156$GENERATE_BINDING_LIST;
    private static final SubLList $list157;
    private static final SubLList $list158;
    private static final SubLSymbol $sym159$SHOP_VARIABLE_MANAGER_GENERATE_BINDING_LIST_METHOD;
    private static final SubLSymbol $sym160$RECOVER_EL_VARIABLE;
    private static final SubLList $list161;
    private static final SubLList $list162;
    private static final SubLSymbol $sym163$OUTER_CATCH_FOR_SHOP_VARIABLE_MANAGER_METHOD;
    private static final SubLString $str164$VARIABLE_ERROR;
    private static final SubLString $str165$_s_is_not_a_known_variable_to__s_;
    private static final SubLSymbol $sym166$SHOP_VARIABLE_MANAGER_RECOVER_EL_VARIABLE_METHOD;
    private static final SubLSymbol $sym167$GATHER_EL_VARIABLES;
    private static final SubLList $list168;
    private static final SubLList $list169;
    private static final SubLSymbol $sym170$SHOP_VARIABLEP;
    private static final SubLSymbol $sym171$SHOP_VARIABLE_MANAGER_GATHER_EL_VARIABLES_METHOD;
    private static final SubLSymbol $sym172$MANAGED_VARIABLE_;
    private static final SubLList $list173;
    private static final SubLList $list174;
    private static final SubLSymbol $sym175$OUTER_CATCH_FOR_SHOP_VARIABLE_MANAGER_METHOD;
    private static final SubLSymbol $sym176$SHOP_VARIABLE_MANAGER_MANAGED_VARIABLE__METHOD;
    private static final SubLSymbol $sym177$GENERATED_VARIABLE_;
    private static final SubLList $list178;
    private static final SubLSymbol $sym179$OUTER_CATCH_FOR_SHOP_VARIABLE_MANAGER_METHOD;
    private static final SubLString $str180$;
    private static final SubLSymbol $sym181$SHOP_VARIABLE_MANAGER_GENERATED_VARIABLE__METHOD;
    private static final SubLSymbol $sym182$GENERATED_VARIABLES_BOUND;
    private static final SubLList $list183;
    private static final SubLList $list184;
    private static final SubLSymbol $sym185$SHOP_VARIABLE_MANAGER_GENERATED_VARIABLES_BOUND_METHOD;
    private static final SubLSymbol $sym186$REPLACE_VARIABLES;
    private static final SubLList $list187;
    private static final SubLSymbol $sym188$SHOP_VARIABLE_MANAGER_REPLACE_VARIABLES_METHOD;
    private static final SubLSymbol $sym189$RECOVER_EL;
    private static final SubLList $list190;
    private static final SubLList $list191;
    private static final SubLSymbol $sym192$SHOP_VARIABLE_MANAGER_RECOVER_EL_METHOD;
    private static final SubLObject $const193$argIsa;
    private static final SubLSymbol $sym194$RELEVANT_MT_IS_GENL_MT;
    private static final SubLObject $const195$argGenl;
    
    @SubLTranslatedFile.SubL(source = "cycl/shop-internals.lisp", position = 1885L)
    public static SubLObject lispify_cyc_bindings(final SubLObject cyc_bindings_list) {
        SubLObject shop_bindings = (SubLObject)shop_internals.NIL;
        SubLObject cdolist_list_var = cyc_bindings_list;
        SubLObject cyc_binding = (SubLObject)shop_internals.NIL;
        cyc_binding = cdolist_list_var.first();
        while (shop_internals.NIL != cdolist_list_var) {
            if (cyc_binding.eql((SubLObject)shop_internals.$list2)) {
                shop_bindings = (SubLObject)ConsesLow.cons((SubLObject)shop_internals.$list3, shop_bindings);
            }
            else {
                shop_bindings = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.cons(cyc_binding.first(), cyc_binding.rest()), shop_bindings);
            }
            cdolist_list_var = cdolist_list_var.rest();
            cyc_binding = cdolist_list_var.first();
        }
        return shop_bindings;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/shop-internals.lisp", position = 2257L)
    public static SubLObject shop_translate_plan(final SubLObject plan) {
        final SubLObject plan_length = Sequences.length(plan);
        SubLObject cyc_assertions = (SubLObject)shop_internals.NIL;
        SubLObject formula = (SubLObject)shop_internals.NIL;
        SubLObject cyc_assertion = (SubLObject)shop_internals.NIL;
        SubLObject index;
        SubLObject cdolist_list_var;
        SubLObject v_term;
        for (index = (SubLObject)shop_internals.NIL, index = (SubLObject)shop_internals.ZERO_INTEGER; !index.numGE(plan_length); index = Numbers.add(index, (SubLObject)shop_internals.ONE_INTEGER)) {
            formula = ConsesLow.nth(index, plan);
            cyc_assertion = (SubLObject)shop_internals.NIL;
            cdolist_list_var = formula;
            v_term = (SubLObject)shop_internals.NIL;
            v_term = cdolist_list_var.first();
            while (shop_internals.NIL != cdolist_list_var) {
                if (shop_internals.NIL == v_term) {
                    return (SubLObject)shop_internals.NIL;
                }
                cyc_assertion = (SubLObject)ConsesLow.cons(v_term, cyc_assertion);
                cdolist_list_var = cdolist_list_var.rest();
                v_term = cdolist_list_var.first();
            }
            cyc_assertion = Sequences.reverse(cyc_assertion);
            cyc_assertions = (SubLObject)ConsesLow.cons(cyc_assertion, cyc_assertions);
        }
        Sequences.reverse(cyc_assertions);
        return Sequences.reverse(cyc_assertions);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/shop-internals.lisp", position = 2778L)
    public static SubLObject inc_slot(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject v_object = (SubLObject)shop_internals.NIL;
        SubLObject slot = (SubLObject)shop_internals.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)shop_internals.$list4);
        v_object = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)shop_internals.$list4);
        slot = current.first();
        current = current.rest();
        if (shop_internals.NIL == current) {
            return (SubLObject)ConsesLow.list((SubLObject)shop_internals.$sym5$SET_SLOT, v_object, slot, (SubLObject)ConsesLow.list((SubLObject)shop_internals.$sym6$1_, (SubLObject)ConsesLow.list((SubLObject)shop_internals.$sym7$GET_SLOT, v_object, slot)));
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)shop_internals.$list4);
        return (SubLObject)shop_internals.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/shop-internals.lisp", position = 2885L)
    public static SubLObject process_timer_p(final SubLObject process_timer) {
        return interfaces.subloop_instanceof_interface(process_timer, (SubLObject)shop_internals.$sym8$PROCESS_TIMER);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/shop-internals.lisp", position = 3620L)
    public static SubLObject get_statistic_manager_last_call_real_time(final SubLObject statistic_manager) {
        return classes.subloop_get_access_protected_instance_slot(statistic_manager, (SubLObject)shop_internals.SEVEN_INTEGER, (SubLObject)shop_internals.$sym14$LAST_CALL_REAL_TIME);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/shop-internals.lisp", position = 3620L)
    public static SubLObject set_statistic_manager_last_call_real_time(final SubLObject statistic_manager, final SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(statistic_manager, value, (SubLObject)shop_internals.SEVEN_INTEGER, (SubLObject)shop_internals.$sym14$LAST_CALL_REAL_TIME);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/shop-internals.lisp", position = 3620L)
    public static SubLObject get_statistic_manager_last_call_run_time(final SubLObject statistic_manager) {
        return classes.subloop_get_access_protected_instance_slot(statistic_manager, (SubLObject)shop_internals.SIX_INTEGER, (SubLObject)shop_internals.$sym15$LAST_CALL_RUN_TIME);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/shop-internals.lisp", position = 3620L)
    public static SubLObject set_statistic_manager_last_call_run_time(final SubLObject statistic_manager, final SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(statistic_manager, value, (SubLObject)shop_internals.SIX_INTEGER, (SubLObject)shop_internals.$sym15$LAST_CALL_RUN_TIME);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/shop-internals.lisp", position = 3620L)
    public static SubLObject get_statistic_manager_end_real_time(final SubLObject statistic_manager) {
        return classes.subloop_get_access_protected_instance_slot(statistic_manager, (SubLObject)shop_internals.FIVE_INTEGER, (SubLObject)shop_internals.$sym16$END_REAL_TIME);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/shop-internals.lisp", position = 3620L)
    public static SubLObject set_statistic_manager_end_real_time(final SubLObject statistic_manager, final SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(statistic_manager, value, (SubLObject)shop_internals.FIVE_INTEGER, (SubLObject)shop_internals.$sym16$END_REAL_TIME);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/shop-internals.lisp", position = 3620L)
    public static SubLObject get_statistic_manager_end_run_time(final SubLObject statistic_manager) {
        return classes.subloop_get_access_protected_instance_slot(statistic_manager, (SubLObject)shop_internals.FOUR_INTEGER, (SubLObject)shop_internals.$sym17$END_RUN_TIME);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/shop-internals.lisp", position = 3620L)
    public static SubLObject set_statistic_manager_end_run_time(final SubLObject statistic_manager, final SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(statistic_manager, value, (SubLObject)shop_internals.FOUR_INTEGER, (SubLObject)shop_internals.$sym17$END_RUN_TIME);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/shop-internals.lisp", position = 3620L)
    public static SubLObject get_statistic_manager_start_real_time(final SubLObject statistic_manager) {
        return classes.subloop_get_access_protected_instance_slot(statistic_manager, (SubLObject)shop_internals.THREE_INTEGER, (SubLObject)shop_internals.$sym18$START_REAL_TIME);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/shop-internals.lisp", position = 3620L)
    public static SubLObject set_statistic_manager_start_real_time(final SubLObject statistic_manager, final SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(statistic_manager, value, (SubLObject)shop_internals.THREE_INTEGER, (SubLObject)shop_internals.$sym18$START_REAL_TIME);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/shop-internals.lisp", position = 3620L)
    public static SubLObject get_statistic_manager_start_run_time(final SubLObject statistic_manager) {
        return classes.subloop_get_access_protected_instance_slot(statistic_manager, (SubLObject)shop_internals.TWO_INTEGER, (SubLObject)shop_internals.$sym19$START_RUN_TIME);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/shop-internals.lisp", position = 3620L)
    public static SubLObject set_statistic_manager_start_run_time(final SubLObject statistic_manager, final SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(statistic_manager, value, (SubLObject)shop_internals.TWO_INTEGER, (SubLObject)shop_internals.$sym19$START_RUN_TIME);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/shop-internals.lisp", position = 3620L)
    public static SubLObject get_statistic_manager_timingP(final SubLObject statistic_manager) {
        return classes.subloop_get_access_protected_instance_slot(statistic_manager, (SubLObject)shop_internals.ONE_INTEGER, (SubLObject)shop_internals.$sym20$TIMING_);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/shop-internals.lisp", position = 3620L)
    public static SubLObject set_statistic_manager_timingP(final SubLObject statistic_manager, final SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(statistic_manager, value, (SubLObject)shop_internals.ONE_INTEGER, (SubLObject)shop_internals.$sym20$TIMING_);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/shop-internals.lisp", position = 3620L)
    public static SubLObject subloop_reserved_initialize_statistic_manager_class(final SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, (SubLObject)shop_internals.$sym11$OBJECT, (SubLObject)shop_internals.$sym21$INSTANCE_COUNT, (SubLObject)shop_internals.ZERO_INTEGER);
        return (SubLObject)shop_internals.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/shop-internals.lisp", position = 3620L)
    public static SubLObject subloop_reserved_initialize_statistic_manager_instance(final SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, (SubLObject)shop_internals.$sym11$OBJECT, (SubLObject)shop_internals.$sym23$ISOLATED_P, (SubLObject)shop_internals.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)shop_internals.$sym11$OBJECT, (SubLObject)shop_internals.$sym24$INSTANCE_NUMBER, (SubLObject)shop_internals.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)shop_internals.$sym10$STATISTIC_MANAGER, (SubLObject)shop_internals.$sym20$TIMING_, (SubLObject)shop_internals.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)shop_internals.$sym10$STATISTIC_MANAGER, (SubLObject)shop_internals.$sym19$START_RUN_TIME, (SubLObject)shop_internals.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)shop_internals.$sym10$STATISTIC_MANAGER, (SubLObject)shop_internals.$sym18$START_REAL_TIME, (SubLObject)shop_internals.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)shop_internals.$sym10$STATISTIC_MANAGER, (SubLObject)shop_internals.$sym17$END_RUN_TIME, (SubLObject)shop_internals.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)shop_internals.$sym10$STATISTIC_MANAGER, (SubLObject)shop_internals.$sym16$END_REAL_TIME, (SubLObject)shop_internals.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)shop_internals.$sym10$STATISTIC_MANAGER, (SubLObject)shop_internals.$sym15$LAST_CALL_RUN_TIME, (SubLObject)shop_internals.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)shop_internals.$sym10$STATISTIC_MANAGER, (SubLObject)shop_internals.$sym14$LAST_CALL_REAL_TIME, (SubLObject)shop_internals.NIL);
        return (SubLObject)shop_internals.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/shop-internals.lisp", position = 3620L)
    public static SubLObject statistic_manager_p(final SubLObject statistic_manager) {
        return classes.subloop_instanceof_class(statistic_manager, (SubLObject)shop_internals.$sym10$STATISTIC_MANAGER);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/shop-internals.lisp", position = 4321L)
    public static SubLObject statistic_manager_initialize_method(final SubLObject self) {
        object.object_initialize_method(self);
        statistic_manager_reset_timing_method(self);
        return self;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/shop-internals.lisp", position = 4445L)
    public static SubLObject statistic_manager_get_run_time_method(final SubLObject self) {
        return Time.get_internal_run_time();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/shop-internals.lisp", position = 4545L)
    public static SubLObject statistic_manager_get_real_time_method(final SubLObject self) {
        return Time.get_internal_real_time();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/shop-internals.lisp", position = 4647L)
    public static SubLObject statistic_manager_reset_last_call_time_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_statistic_manager_method = (SubLObject)shop_internals.NIL;
        SubLObject last_call_real_time = get_statistic_manager_last_call_real_time(self);
        SubLObject last_call_run_time = get_statistic_manager_last_call_run_time(self);
        try {
            thread.throwStack.push(shop_internals.$sym39$OUTER_CATCH_FOR_STATISTIC_MANAGER_METHOD);
            try {
                last_call_run_time = statistic_manager_get_run_time_method(self);
                last_call_real_time = statistic_manager_get_real_time_method(self);
                Dynamic.sublisp_throw((SubLObject)shop_internals.$sym39$OUTER_CATCH_FOR_STATISTIC_MANAGER_METHOD, (SubLObject)shop_internals.NIL);
            }
            finally {
                final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)shop_internals.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    set_statistic_manager_last_call_real_time(self, last_call_real_time);
                    set_statistic_manager_last_call_run_time(self, last_call_run_time);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        }
        catch (Throwable ccatch_env_var) {
            catch_var_for_statistic_manager_method = Errors.handleThrowable(ccatch_env_var, (SubLObject)shop_internals.$sym39$OUTER_CATCH_FOR_STATISTIC_MANAGER_METHOD);
        }
        finally {
            thread.throwStack.pop();
        }
        return catch_var_for_statistic_manager_method;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/shop-internals.lisp", position = 4836L)
    public static SubLObject statistic_manager_start_timing_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_statistic_manager_method = (SubLObject)shop_internals.NIL;
        SubLObject start_real_time = get_statistic_manager_start_real_time(self);
        SubLObject start_run_time = get_statistic_manager_start_run_time(self);
        SubLObject timingP = get_statistic_manager_timingP(self);
        try {
            thread.throwStack.push(shop_internals.$sym44$OUTER_CATCH_FOR_STATISTIC_MANAGER_METHOD);
            try {
                start_run_time = statistic_manager_get_run_time_method(self);
                start_real_time = statistic_manager_get_real_time_method(self);
                statistic_manager_reset_last_call_time_method(self);
                timingP = (SubLObject)shop_internals.T;
                Dynamic.sublisp_throw((SubLObject)shop_internals.$sym44$OUTER_CATCH_FOR_STATISTIC_MANAGER_METHOD, (SubLObject)shop_internals.NIL);
            }
            finally {
                final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)shop_internals.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    set_statistic_manager_start_real_time(self, start_real_time);
                    set_statistic_manager_start_run_time(self, start_run_time);
                    set_statistic_manager_timingP(self, timingP);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        }
        catch (Throwable ccatch_env_var) {
            catch_var_for_statistic_manager_method = Errors.handleThrowable(ccatch_env_var, (SubLObject)shop_internals.$sym44$OUTER_CATCH_FOR_STATISTIC_MANAGER_METHOD);
        }
        finally {
            thread.throwStack.pop();
        }
        return catch_var_for_statistic_manager_method;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/shop-internals.lisp", position = 5059L)
    public static SubLObject statistic_manager_resume_timing_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_statistic_manager_method = (SubLObject)shop_internals.NIL;
        SubLObject timingP = get_statistic_manager_timingP(self);
        try {
            thread.throwStack.push(shop_internals.$sym48$OUTER_CATCH_FOR_STATISTIC_MANAGER_METHOD);
            try {
                statistic_manager_reset_last_call_time_method(self);
                timingP = (SubLObject)shop_internals.T;
                Dynamic.sublisp_throw((SubLObject)shop_internals.$sym48$OUTER_CATCH_FOR_STATISTIC_MANAGER_METHOD, (SubLObject)shop_internals.NIL);
            }
            finally {
                final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)shop_internals.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    set_statistic_manager_timingP(self, timingP);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        }
        catch (Throwable ccatch_env_var) {
            catch_var_for_statistic_manager_method = Errors.handleThrowable(ccatch_env_var, (SubLObject)shop_internals.$sym48$OUTER_CATCH_FOR_STATISTIC_MANAGER_METHOD);
        }
        finally {
            thread.throwStack.pop();
        }
        return catch_var_for_statistic_manager_method;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/shop-internals.lisp", position = 5189L)
    public static SubLObject statistic_manager_stop_timing_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_statistic_manager_method = (SubLObject)shop_internals.NIL;
        SubLObject end_real_time = get_statistic_manager_end_real_time(self);
        SubLObject end_run_time = get_statistic_manager_end_run_time(self);
        SubLObject timingP = get_statistic_manager_timingP(self);
        try {
            thread.throwStack.push(shop_internals.$sym52$OUTER_CATCH_FOR_STATISTIC_MANAGER_METHOD);
            try {
                end_run_time = statistic_manager_get_run_time_method(self);
                end_real_time = statistic_manager_get_real_time_method(self);
                timingP = (SubLObject)shop_internals.NIL;
                Dynamic.sublisp_throw((SubLObject)shop_internals.$sym52$OUTER_CATCH_FOR_STATISTIC_MANAGER_METHOD, (SubLObject)shop_internals.NIL);
            }
            finally {
                final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)shop_internals.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    set_statistic_manager_end_real_time(self, end_real_time);
                    set_statistic_manager_end_run_time(self, end_run_time);
                    set_statistic_manager_timingP(self, timingP);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        }
        catch (Throwable ccatch_env_var) {
            catch_var_for_statistic_manager_method = Errors.handleThrowable(ccatch_env_var, (SubLObject)shop_internals.$sym52$OUTER_CATCH_FOR_STATISTIC_MANAGER_METHOD);
        }
        finally {
            thread.throwStack.pop();
        }
        return catch_var_for_statistic_manager_method;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/shop-internals.lisp", position = 5377L)
    public static SubLObject statistic_manager_is_timingP_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_statistic_manager_method = (SubLObject)shop_internals.NIL;
        final SubLObject timingP = get_statistic_manager_timingP(self);
        try {
            thread.throwStack.push(shop_internals.$sym56$OUTER_CATCH_FOR_STATISTIC_MANAGER_METHOD);
            try {
                Dynamic.sublisp_throw((SubLObject)shop_internals.$sym56$OUTER_CATCH_FOR_STATISTIC_MANAGER_METHOD, timingP);
            }
            finally {
                final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)shop_internals.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    set_statistic_manager_timingP(self, timingP);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        }
        catch (Throwable ccatch_env_var) {
            catch_var_for_statistic_manager_method = Errors.handleThrowable(ccatch_env_var, (SubLObject)shop_internals.$sym56$OUTER_CATCH_FOR_STATISTIC_MANAGER_METHOD);
        }
        finally {
            thread.throwStack.pop();
        }
        return catch_var_for_statistic_manager_method;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/shop-internals.lisp", position = 5458L)
    public static SubLObject statistic_manager_elapsed_real_time_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_statistic_manager_method = (SubLObject)shop_internals.NIL;
        final SubLObject end_real_time = get_statistic_manager_end_real_time(self);
        final SubLObject start_real_time = get_statistic_manager_start_real_time(self);
        final SubLObject timingP = get_statistic_manager_timingP(self);
        try {
            thread.throwStack.push(shop_internals.$sym60$OUTER_CATCH_FOR_STATISTIC_MANAGER_METHOD);
            try {
                if (shop_internals.NIL != timingP) {
                    Dynamic.sublisp_throw((SubLObject)shop_internals.$sym60$OUTER_CATCH_FOR_STATISTIC_MANAGER_METHOD, Numbers.subtract(statistic_manager_get_real_time_method(self), start_real_time));
                }
                else {
                    Dynamic.sublisp_throw((SubLObject)shop_internals.$sym60$OUTER_CATCH_FOR_STATISTIC_MANAGER_METHOD, Numbers.subtract(end_real_time, start_real_time));
                }
            }
            finally {
                final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)shop_internals.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    set_statistic_manager_end_real_time(self, end_real_time);
                    set_statistic_manager_start_real_time(self, start_real_time);
                    set_statistic_manager_timingP(self, timingP);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        }
        catch (Throwable ccatch_env_var) {
            catch_var_for_statistic_manager_method = Errors.handleThrowable(ccatch_env_var, (SubLObject)shop_internals.$sym60$OUTER_CATCH_FOR_STATISTIC_MANAGER_METHOD);
        }
        finally {
            thread.throwStack.pop();
        }
        return catch_var_for_statistic_manager_method;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/shop-internals.lisp", position = 5648L)
    public static SubLObject statistic_manager_elapsed_run_time_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_statistic_manager_method = (SubLObject)shop_internals.NIL;
        final SubLObject end_run_time = get_statistic_manager_end_run_time(self);
        final SubLObject start_run_time = get_statistic_manager_start_run_time(self);
        final SubLObject timingP = get_statistic_manager_timingP(self);
        try {
            thread.throwStack.push(shop_internals.$sym64$OUTER_CATCH_FOR_STATISTIC_MANAGER_METHOD);
            try {
                if (shop_internals.NIL != timingP) {
                    Dynamic.sublisp_throw((SubLObject)shop_internals.$sym64$OUTER_CATCH_FOR_STATISTIC_MANAGER_METHOD, Numbers.subtract(statistic_manager_get_run_time_method(self), start_run_time));
                }
                else {
                    Dynamic.sublisp_throw((SubLObject)shop_internals.$sym64$OUTER_CATCH_FOR_STATISTIC_MANAGER_METHOD, Numbers.subtract(end_run_time, start_run_time));
                }
            }
            finally {
                final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)shop_internals.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    set_statistic_manager_end_run_time(self, end_run_time);
                    set_statistic_manager_start_run_time(self, start_run_time);
                    set_statistic_manager_timingP(self, timingP);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        }
        catch (Throwable ccatch_env_var) {
            catch_var_for_statistic_manager_method = Errors.handleThrowable(ccatch_env_var, (SubLObject)shop_internals.$sym64$OUTER_CATCH_FOR_STATISTIC_MANAGER_METHOD);
        }
        finally {
            thread.throwStack.pop();
        }
        return catch_var_for_statistic_manager_method;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/shop-internals.lisp", position = 5832L)
    public static SubLObject statistic_manager_reset_timing_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_statistic_manager_method = (SubLObject)shop_internals.NIL;
        SubLObject last_call_real_time = get_statistic_manager_last_call_real_time(self);
        SubLObject last_call_run_time = get_statistic_manager_last_call_run_time(self);
        SubLObject end_real_time = get_statistic_manager_end_real_time(self);
        SubLObject end_run_time = get_statistic_manager_end_run_time(self);
        SubLObject start_real_time = get_statistic_manager_start_real_time(self);
        SubLObject start_run_time = get_statistic_manager_start_run_time(self);
        SubLObject timingP = get_statistic_manager_timingP(self);
        try {
            thread.throwStack.push(shop_internals.$sym68$OUTER_CATCH_FOR_STATISTIC_MANAGER_METHOD);
            try {
                timingP = (SubLObject)shop_internals.NIL;
                start_real_time = (SubLObject)shop_internals.ZERO_INTEGER;
                end_real_time = (SubLObject)shop_internals.ZERO_INTEGER;
                start_run_time = (SubLObject)shop_internals.ZERO_INTEGER;
                end_run_time = (SubLObject)shop_internals.ZERO_INTEGER;
                last_call_run_time = (SubLObject)shop_internals.ZERO_INTEGER;
                last_call_real_time = (SubLObject)shop_internals.ZERO_INTEGER;
                Dynamic.sublisp_throw((SubLObject)shop_internals.$sym68$OUTER_CATCH_FOR_STATISTIC_MANAGER_METHOD, (SubLObject)shop_internals.NIL);
            }
            finally {
                final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)shop_internals.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    set_statistic_manager_last_call_real_time(self, last_call_real_time);
                    set_statistic_manager_last_call_run_time(self, last_call_run_time);
                    set_statistic_manager_end_real_time(self, end_real_time);
                    set_statistic_manager_end_run_time(self, end_run_time);
                    set_statistic_manager_start_real_time(self, start_real_time);
                    set_statistic_manager_start_run_time(self, start_run_time);
                    set_statistic_manager_timingP(self, timingP);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        }
        catch (Throwable ccatch_env_var) {
            catch_var_for_statistic_manager_method = Errors.handleThrowable(ccatch_env_var, (SubLObject)shop_internals.$sym68$OUTER_CATCH_FOR_STATISTIC_MANAGER_METHOD);
        }
        finally {
            thread.throwStack.pop();
        }
        return catch_var_for_statistic_manager_method;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/shop-internals.lisp", position = 6103L)
    public static SubLObject statistic_manager_elapsed_real_time_since_last_call_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_statistic_manager_method = (SubLObject)shop_internals.NIL;
        final SubLObject last_call_real_time = get_statistic_manager_last_call_real_time(self);
        final SubLObject end_real_time = get_statistic_manager_end_real_time(self);
        final SubLObject timingP = get_statistic_manager_timingP(self);
        try {
            thread.throwStack.push(shop_internals.$sym72$OUTER_CATCH_FOR_STATISTIC_MANAGER_METHOD);
            try {
                if (shop_internals.NIL != timingP) {
                    final SubLObject elapsed_time = Numbers.subtract(statistic_manager_get_real_time_method(self), last_call_real_time);
                    statistic_manager_reset_last_call_time_method(self);
                    Dynamic.sublisp_throw((SubLObject)shop_internals.$sym72$OUTER_CATCH_FOR_STATISTIC_MANAGER_METHOD, elapsed_time);
                }
                else {
                    final SubLObject elapsed_time = Numbers.subtract(end_real_time, last_call_real_time);
                    Dynamic.sublisp_throw((SubLObject)shop_internals.$sym72$OUTER_CATCH_FOR_STATISTIC_MANAGER_METHOD, elapsed_time);
                }
            }
            finally {
                final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)shop_internals.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    set_statistic_manager_last_call_real_time(self, last_call_real_time);
                    set_statistic_manager_end_real_time(self, end_real_time);
                    set_statistic_manager_timingP(self, timingP);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        }
        catch (Throwable ccatch_env_var) {
            catch_var_for_statistic_manager_method = Errors.handleThrowable(ccatch_env_var, (SubLObject)shop_internals.$sym72$OUTER_CATCH_FOR_STATISTIC_MANAGER_METHOD);
        }
        finally {
            thread.throwStack.pop();
        }
        return catch_var_for_statistic_manager_method;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/shop-internals.lisp", position = 6424L)
    public static SubLObject statistic_manager_elapsed_run_time_since_last_call_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_statistic_manager_method = (SubLObject)shop_internals.NIL;
        final SubLObject last_call_run_time = get_statistic_manager_last_call_run_time(self);
        final SubLObject end_run_time = get_statistic_manager_end_run_time(self);
        final SubLObject timingP = get_statistic_manager_timingP(self);
        try {
            thread.throwStack.push(shop_internals.$sym76$OUTER_CATCH_FOR_STATISTIC_MANAGER_METHOD);
            try {
                if (shop_internals.NIL != timingP) {
                    final SubLObject elapsed_time = Numbers.subtract(statistic_manager_get_run_time_method(self), last_call_run_time);
                    statistic_manager_reset_last_call_time_method(self);
                    Dynamic.sublisp_throw((SubLObject)shop_internals.$sym76$OUTER_CATCH_FOR_STATISTIC_MANAGER_METHOD, elapsed_time);
                }
                else {
                    final SubLObject elapsed_time = Numbers.subtract(end_run_time, last_call_run_time);
                    Dynamic.sublisp_throw((SubLObject)shop_internals.$sym76$OUTER_CATCH_FOR_STATISTIC_MANAGER_METHOD, elapsed_time);
                }
            }
            finally {
                final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)shop_internals.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    set_statistic_manager_last_call_run_time(self, last_call_run_time);
                    set_statistic_manager_end_run_time(self, end_run_time);
                    set_statistic_manager_timingP(self, timingP);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        }
        catch (Throwable ccatch_env_var) {
            catch_var_for_statistic_manager_method = Errors.handleThrowable(ccatch_env_var, (SubLObject)shop_internals.$sym76$OUTER_CATCH_FOR_STATISTIC_MANAGER_METHOD);
        }
        finally {
            thread.throwStack.pop();
        }
        return catch_var_for_statistic_manager_method;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/shop-internals.lisp", position = 6742L)
    public static SubLObject get_shop_statistic_manager_plans(final SubLObject shop_statistic_manager) {
        return classes.subloop_get_instance_slot(shop_statistic_manager, (SubLObject)shop_internals.THIRTEEN_INTEGER);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/shop-internals.lisp", position = 6742L)
    public static SubLObject set_shop_statistic_manager_plans(final SubLObject shop_statistic_manager, final SubLObject value) {
        return classes.subloop_set_instance_slot(shop_statistic_manager, value, (SubLObject)shop_internals.THIRTEEN_INTEGER);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/shop-internals.lisp", position = 6742L)
    public static SubLObject get_shop_statistic_manager_plan_counter(final SubLObject shop_statistic_manager) {
        return classes.subloop_get_instance_slot(shop_statistic_manager, (SubLObject)shop_internals.TWELVE_INTEGER);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/shop-internals.lisp", position = 6742L)
    public static SubLObject set_shop_statistic_manager_plan_counter(final SubLObject shop_statistic_manager, final SubLObject value) {
        return classes.subloop_set_instance_slot(shop_statistic_manager, value, (SubLObject)shop_internals.TWELVE_INTEGER);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/shop-internals.lisp", position = 6742L)
    public static SubLObject get_shop_statistic_manager_plan_state_ask_counter(final SubLObject shop_statistic_manager) {
        return classes.subloop_get_instance_slot(shop_statistic_manager, (SubLObject)shop_internals.ELEVEN_INTEGER);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/shop-internals.lisp", position = 6742L)
    public static SubLObject set_shop_statistic_manager_plan_state_ask_counter(final SubLObject shop_statistic_manager, final SubLObject value) {
        return classes.subloop_set_instance_slot(shop_statistic_manager, value, (SubLObject)shop_internals.ELEVEN_INTEGER);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/shop-internals.lisp", position = 6742L)
    public static SubLObject get_shop_statistic_manager_fi_ask_counter(final SubLObject shop_statistic_manager) {
        return classes.subloop_get_instance_slot(shop_statistic_manager, (SubLObject)shop_internals.TEN_INTEGER);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/shop-internals.lisp", position = 6742L)
    public static SubLObject set_shop_statistic_manager_fi_ask_counter(final SubLObject shop_statistic_manager, final SubLObject value) {
        return classes.subloop_set_instance_slot(shop_statistic_manager, value, (SubLObject)shop_internals.TEN_INTEGER);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/shop-internals.lisp", position = 6742L)
    public static SubLObject get_shop_statistic_manager_inference_counter(final SubLObject shop_statistic_manager) {
        return classes.subloop_get_instance_slot(shop_statistic_manager, (SubLObject)shop_internals.NINE_INTEGER);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/shop-internals.lisp", position = 6742L)
    public static SubLObject set_shop_statistic_manager_inference_counter(final SubLObject shop_statistic_manager, final SubLObject value) {
        return classes.subloop_set_instance_slot(shop_statistic_manager, value, (SubLObject)shop_internals.NINE_INTEGER);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/shop-internals.lisp", position = 6742L)
    public static SubLObject get_shop_statistic_manager_method_counter(final SubLObject shop_statistic_manager) {
        return classes.subloop_get_instance_slot(shop_statistic_manager, (SubLObject)shop_internals.EIGHT_INTEGER);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/shop-internals.lisp", position = 6742L)
    public static SubLObject set_shop_statistic_manager_method_counter(final SubLObject shop_statistic_manager, final SubLObject value) {
        return classes.subloop_set_instance_slot(shop_statistic_manager, value, (SubLObject)shop_internals.EIGHT_INTEGER);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/shop-internals.lisp", position = 6742L)
    public static SubLObject subloop_reserved_initialize_shop_statistic_manager_class(final SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, (SubLObject)shop_internals.$sym11$OBJECT, (SubLObject)shop_internals.$sym21$INSTANCE_COUNT, (SubLObject)shop_internals.ZERO_INTEGER);
        return (SubLObject)shop_internals.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/shop-internals.lisp", position = 6742L)
    public static SubLObject subloop_reserved_initialize_shop_statistic_manager_instance(final SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, (SubLObject)shop_internals.$sym11$OBJECT, (SubLObject)shop_internals.$sym23$ISOLATED_P, (SubLObject)shop_internals.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)shop_internals.$sym11$OBJECT, (SubLObject)shop_internals.$sym24$INSTANCE_NUMBER, (SubLObject)shop_internals.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)shop_internals.$sym10$STATISTIC_MANAGER, (SubLObject)shop_internals.$sym20$TIMING_, (SubLObject)shop_internals.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)shop_internals.$sym10$STATISTIC_MANAGER, (SubLObject)shop_internals.$sym19$START_RUN_TIME, (SubLObject)shop_internals.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)shop_internals.$sym10$STATISTIC_MANAGER, (SubLObject)shop_internals.$sym18$START_REAL_TIME, (SubLObject)shop_internals.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)shop_internals.$sym10$STATISTIC_MANAGER, (SubLObject)shop_internals.$sym17$END_RUN_TIME, (SubLObject)shop_internals.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)shop_internals.$sym10$STATISTIC_MANAGER, (SubLObject)shop_internals.$sym16$END_REAL_TIME, (SubLObject)shop_internals.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)shop_internals.$sym10$STATISTIC_MANAGER, (SubLObject)shop_internals.$sym15$LAST_CALL_RUN_TIME, (SubLObject)shop_internals.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)shop_internals.$sym10$STATISTIC_MANAGER, (SubLObject)shop_internals.$sym14$LAST_CALL_REAL_TIME, (SubLObject)shop_internals.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)shop_internals.$sym78$SHOP_STATISTIC_MANAGER, (SubLObject)shop_internals.$sym81$METHOD_COUNTER, (SubLObject)shop_internals.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)shop_internals.$sym78$SHOP_STATISTIC_MANAGER, (SubLObject)shop_internals.$sym82$INFERENCE_COUNTER, (SubLObject)shop_internals.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)shop_internals.$sym78$SHOP_STATISTIC_MANAGER, (SubLObject)shop_internals.$sym83$FI_ASK_COUNTER, (SubLObject)shop_internals.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)shop_internals.$sym78$SHOP_STATISTIC_MANAGER, (SubLObject)shop_internals.$sym84$PLAN_STATE_ASK_COUNTER, (SubLObject)shop_internals.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)shop_internals.$sym78$SHOP_STATISTIC_MANAGER, (SubLObject)shop_internals.$sym85$PLAN_COUNTER, (SubLObject)shop_internals.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)shop_internals.$sym78$SHOP_STATISTIC_MANAGER, (SubLObject)shop_internals.$sym86$PLANS, (SubLObject)shop_internals.NIL);
        return (SubLObject)shop_internals.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/shop-internals.lisp", position = 6742L)
    public static SubLObject shop_statistic_manager_p(final SubLObject shop_statistic_manager) {
        return classes.subloop_instanceof_class(shop_statistic_manager, (SubLObject)shop_internals.$sym78$SHOP_STATISTIC_MANAGER);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/shop-internals.lisp", position = 7450L)
    public static SubLObject shop_statistic_manager_initialize_method(final SubLObject self) {
        statistic_manager_initialize_method(self);
        shop_statistic_manager_reset_counters_method(self);
        return self;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/shop-internals.lisp", position = 7582L)
    public static SubLObject shop_statistic_manager_reset_counters_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_shop_statistic_manager_method = (SubLObject)shop_internals.NIL;
        SubLObject plans = get_shop_statistic_manager_plans(self);
        SubLObject plan_counter = get_shop_statistic_manager_plan_counter(self);
        SubLObject plan_state_ask_counter = get_shop_statistic_manager_plan_state_ask_counter(self);
        SubLObject fi_ask_counter = get_shop_statistic_manager_fi_ask_counter(self);
        SubLObject inference_counter = get_shop_statistic_manager_inference_counter(self);
        SubLObject method_counter = get_shop_statistic_manager_method_counter(self);
        try {
            thread.throwStack.push(shop_internals.$sym92$OUTER_CATCH_FOR_SHOP_STATISTIC_MANAGER_METHOD);
            try {
                method_counter = (SubLObject)shop_internals.ZERO_INTEGER;
                inference_counter = (SubLObject)shop_internals.ZERO_INTEGER;
                fi_ask_counter = (SubLObject)shop_internals.ZERO_INTEGER;
                plan_state_ask_counter = (SubLObject)shop_internals.ZERO_INTEGER;
                plan_counter = (SubLObject)shop_internals.ZERO_INTEGER;
                plans = (SubLObject)shop_internals.NIL;
                Dynamic.sublisp_throw((SubLObject)shop_internals.$sym92$OUTER_CATCH_FOR_SHOP_STATISTIC_MANAGER_METHOD, (SubLObject)shop_internals.NIL);
            }
            finally {
                final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)shop_internals.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    set_shop_statistic_manager_plans(self, plans);
                    set_shop_statistic_manager_plan_counter(self, plan_counter);
                    set_shop_statistic_manager_plan_state_ask_counter(self, plan_state_ask_counter);
                    set_shop_statistic_manager_fi_ask_counter(self, fi_ask_counter);
                    set_shop_statistic_manager_inference_counter(self, inference_counter);
                    set_shop_statistic_manager_method_counter(self, method_counter);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        }
        catch (Throwable ccatch_env_var) {
            catch_var_for_shop_statistic_manager_method = Errors.handleThrowable(ccatch_env_var, (SubLObject)shop_internals.$sym92$OUTER_CATCH_FOR_SHOP_STATISTIC_MANAGER_METHOD);
        }
        finally {
            thread.throwStack.pop();
        }
        return catch_var_for_shop_statistic_manager_method;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/shop-internals.lisp", position = 7833L)
    public static SubLObject shop_statistic_manager_add_fi_ask_method(final SubLObject self) {
        return instances.set_slot(self, (SubLObject)shop_internals.$sym83$FI_ASK_COUNTER, Numbers.add(instances.get_slot(self, (SubLObject)shop_internals.$sym83$FI_ASK_COUNTER), (SubLObject)shop_internals.ONE_INTEGER));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/shop-internals.lisp", position = 8002L)
    public static SubLObject shop_statistic_manager_add_plan_state_ask_method(final SubLObject self) {
        return instances.set_slot(self, (SubLObject)shop_internals.$sym84$PLAN_STATE_ASK_COUNTER, Numbers.add(instances.get_slot(self, (SubLObject)shop_internals.$sym84$PLAN_STATE_ASK_COUNTER), (SubLObject)shop_internals.ONE_INTEGER));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/shop-internals.lisp", position = 8196L)
    public static SubLObject shop_statistic_manager_add_expansion_method(final SubLObject self) {
        return instances.set_slot(self, (SubLObject)shop_internals.$sym81$METHOD_COUNTER, Numbers.add(instances.get_slot(self, (SubLObject)shop_internals.$sym81$METHOD_COUNTER), (SubLObject)shop_internals.ONE_INTEGER));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/shop-internals.lisp", position = 8369L)
    public static SubLObject shop_statistic_manager_add_inference_method(final SubLObject self) {
        return instances.set_slot(self, (SubLObject)shop_internals.$sym82$INFERENCE_COUNTER, Numbers.add(instances.get_slot(self, (SubLObject)shop_internals.$sym82$INFERENCE_COUNTER), (SubLObject)shop_internals.ONE_INTEGER));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/shop-internals.lisp", position = 8548L)
    public static SubLObject shop_statistic_manager_add_plan_method(final SubLObject self, final SubLObject plan) {
        instances.set_slot(self, (SubLObject)shop_internals.$sym86$PLANS, (SubLObject)ConsesLow.cons(plan, instances.get_slot(self, (SubLObject)shop_internals.$sym86$PLANS)));
        return instances.set_slot(self, (SubLObject)shop_internals.$sym85$PLAN_COUNTER, Numbers.add(instances.get_slot(self, (SubLObject)shop_internals.$sym85$PLAN_COUNTER), (SubLObject)shop_internals.ONE_INTEGER));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/shop-internals.lisp", position = 8776L)
    public static SubLObject shop_statistic_manager_number_of_inferences_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_shop_statistic_manager_method = (SubLObject)shop_internals.NIL;
        final SubLObject inference_counter = get_shop_statistic_manager_inference_counter(self);
        try {
            thread.throwStack.push(shop_internals.$sym113$OUTER_CATCH_FOR_SHOP_STATISTIC_MANAGER_METHOD);
            try {
                Dynamic.sublisp_throw((SubLObject)shop_internals.$sym113$OUTER_CATCH_FOR_SHOP_STATISTIC_MANAGER_METHOD, inference_counter);
            }
            finally {
                final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)shop_internals.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    set_shop_statistic_manager_inference_counter(self, inference_counter);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        }
        catch (Throwable ccatch_env_var) {
            catch_var_for_shop_statistic_manager_method = Errors.handleThrowable(ccatch_env_var, (SubLObject)shop_internals.$sym113$OUTER_CATCH_FOR_SHOP_STATISTIC_MANAGER_METHOD);
        }
        finally {
            thread.throwStack.pop();
        }
        return catch_var_for_shop_statistic_manager_method;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/shop-internals.lisp", position = 8883L)
    public static SubLObject shop_statistic_manager_number_of_methods_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_shop_statistic_manager_method = (SubLObject)shop_internals.NIL;
        final SubLObject method_counter = get_shop_statistic_manager_method_counter(self);
        try {
            thread.throwStack.push(shop_internals.$sym117$OUTER_CATCH_FOR_SHOP_STATISTIC_MANAGER_METHOD);
            try {
                Dynamic.sublisp_throw((SubLObject)shop_internals.$sym117$OUTER_CATCH_FOR_SHOP_STATISTIC_MANAGER_METHOD, method_counter);
            }
            finally {
                final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)shop_internals.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    set_shop_statistic_manager_method_counter(self, method_counter);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        }
        catch (Throwable ccatch_env_var) {
            catch_var_for_shop_statistic_manager_method = Errors.handleThrowable(ccatch_env_var, (SubLObject)shop_internals.$sym117$OUTER_CATCH_FOR_SHOP_STATISTIC_MANAGER_METHOD);
        }
        finally {
            thread.throwStack.pop();
        }
        return catch_var_for_shop_statistic_manager_method;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/shop-internals.lisp", position = 8983L)
    public static SubLObject shop_statistic_manager_number_of_expansions_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_shop_statistic_manager_method = (SubLObject)shop_internals.NIL;
        final SubLObject method_counter = get_shop_statistic_manager_method_counter(self);
        try {
            thread.throwStack.push(shop_internals.$sym120$OUTER_CATCH_FOR_SHOP_STATISTIC_MANAGER_METHOD);
            try {
                Dynamic.sublisp_throw((SubLObject)shop_internals.$sym120$OUTER_CATCH_FOR_SHOP_STATISTIC_MANAGER_METHOD, method_counter);
            }
            finally {
                final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)shop_internals.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    set_shop_statistic_manager_method_counter(self, method_counter);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        }
        catch (Throwable ccatch_env_var) {
            catch_var_for_shop_statistic_manager_method = Errors.handleThrowable(ccatch_env_var, (SubLObject)shop_internals.$sym120$OUTER_CATCH_FOR_SHOP_STATISTIC_MANAGER_METHOD);
        }
        finally {
            thread.throwStack.pop();
        }
        return catch_var_for_shop_statistic_manager_method;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/shop-internals.lisp", position = 9086L)
    public static SubLObject shop_statistic_manager_number_of_plans_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_shop_statistic_manager_method = (SubLObject)shop_internals.NIL;
        final SubLObject plan_counter = get_shop_statistic_manager_plan_counter(self);
        try {
            thread.throwStack.push(shop_internals.$sym124$OUTER_CATCH_FOR_SHOP_STATISTIC_MANAGER_METHOD);
            try {
                Dynamic.sublisp_throw((SubLObject)shop_internals.$sym124$OUTER_CATCH_FOR_SHOP_STATISTIC_MANAGER_METHOD, plan_counter);
            }
            finally {
                final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)shop_internals.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    set_shop_statistic_manager_plan_counter(self, plan_counter);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        }
        catch (Throwable ccatch_env_var) {
            catch_var_for_shop_statistic_manager_method = Errors.handleThrowable(ccatch_env_var, (SubLObject)shop_internals.$sym124$OUTER_CATCH_FOR_SHOP_STATISTIC_MANAGER_METHOD);
        }
        finally {
            thread.throwStack.pop();
        }
        return catch_var_for_shop_statistic_manager_method;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/shop-internals.lisp", position = 9182L)
    public static SubLObject shop_statistic_manager_number_of_fi_asks_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_shop_statistic_manager_method = (SubLObject)shop_internals.NIL;
        final SubLObject fi_ask_counter = get_shop_statistic_manager_fi_ask_counter(self);
        try {
            thread.throwStack.push(shop_internals.$sym128$OUTER_CATCH_FOR_SHOP_STATISTIC_MANAGER_METHOD);
            try {
                Dynamic.sublisp_throw((SubLObject)shop_internals.$sym128$OUTER_CATCH_FOR_SHOP_STATISTIC_MANAGER_METHOD, fi_ask_counter);
            }
            finally {
                final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)shop_internals.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    set_shop_statistic_manager_fi_ask_counter(self, fi_ask_counter);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        }
        catch (Throwable ccatch_env_var) {
            catch_var_for_shop_statistic_manager_method = Errors.handleThrowable(ccatch_env_var, (SubLObject)shop_internals.$sym128$OUTER_CATCH_FOR_SHOP_STATISTIC_MANAGER_METHOD);
        }
        finally {
            thread.throwStack.pop();
        }
        return catch_var_for_shop_statistic_manager_method;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/shop-internals.lisp", position = 9282L)
    public static SubLObject shop_statistic_manager_number_of_plan_state_asks_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_shop_statistic_manager_method = (SubLObject)shop_internals.NIL;
        final SubLObject plan_state_ask_counter = get_shop_statistic_manager_plan_state_ask_counter(self);
        try {
            thread.throwStack.push(shop_internals.$sym132$OUTER_CATCH_FOR_SHOP_STATISTIC_MANAGER_METHOD);
            try {
                Dynamic.sublisp_throw((SubLObject)shop_internals.$sym132$OUTER_CATCH_FOR_SHOP_STATISTIC_MANAGER_METHOD, plan_state_ask_counter);
            }
            finally {
                final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)shop_internals.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    set_shop_statistic_manager_plan_state_ask_counter(self, plan_state_ask_counter);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        }
        catch (Throwable ccatch_env_var) {
            catch_var_for_shop_statistic_manager_method = Errors.handleThrowable(ccatch_env_var, (SubLObject)shop_internals.$sym132$OUTER_CATCH_FOR_SHOP_STATISTIC_MANAGER_METHOD);
        }
        finally {
            thread.throwStack.pop();
        }
        return catch_var_for_shop_statistic_manager_method;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/shop-internals.lisp", position = 9398L)
    public static SubLObject get_shop_variable_manager_variable_assoc_table(final SubLObject shop_variable_manager) {
        return classes.subloop_get_instance_slot(shop_variable_manager, (SubLObject)shop_internals.ONE_INTEGER);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/shop-internals.lisp", position = 9398L)
    public static SubLObject set_shop_variable_manager_variable_assoc_table(final SubLObject shop_variable_manager, final SubLObject value) {
        return classes.subloop_set_instance_slot(shop_variable_manager, value, (SubLObject)shop_internals.ONE_INTEGER);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/shop-internals.lisp", position = 9398L)
    public static SubLObject get_shop_variable_manager_variable_prefix(final SubLObject shop_variable_manager) {
        final SubLObject v_class = (SubLObject)(shop_variable_manager.isSymbol() ? classes.classes_retrieve_class(shop_variable_manager) : ((shop_internals.NIL != subloop_structures.class_p(shop_variable_manager)) ? shop_variable_manager : ((shop_internals.NIL != subloop_structures.instance_p(shop_variable_manager)) ? subloop_structures.instance_class(shop_variable_manager) : shop_internals.NIL)));
        if (shop_internals.NIL != v_class) {
            return Vectors.aref(subloop_structures.class_any_slots(v_class), (SubLObject)shop_internals.TWO_INTEGER);
        }
        return (SubLObject)shop_internals.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/shop-internals.lisp", position = 9398L)
    public static SubLObject set_shop_variable_manager_variable_prefix(final SubLObject shop_variable_manager, final SubLObject value) {
        final SubLObject v_class = (SubLObject)(shop_variable_manager.isSymbol() ? classes.classes_retrieve_class(shop_variable_manager) : ((shop_internals.NIL != subloop_structures.class_p(shop_variable_manager)) ? shop_variable_manager : ((shop_internals.NIL != subloop_structures.instance_p(shop_variable_manager)) ? subloop_structures.instance_class(shop_variable_manager) : shop_internals.NIL)));
        if (shop_internals.NIL != v_class) {
            return Vectors.set_aref(subloop_structures.class_any_slots(v_class), (SubLObject)shop_internals.TWO_INTEGER, value);
        }
        return (SubLObject)shop_internals.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/shop-internals.lisp", position = 9398L)
    public static SubLObject get_shop_variable_manager_variable_counter(final SubLObject shop_variable_manager) {
        final SubLObject v_class = (SubLObject)(shop_variable_manager.isSymbol() ? classes.classes_retrieve_class(shop_variable_manager) : ((shop_internals.NIL != subloop_structures.class_p(shop_variable_manager)) ? shop_variable_manager : ((shop_internals.NIL != subloop_structures.instance_p(shop_variable_manager)) ? subloop_structures.instance_class(shop_variable_manager) : shop_internals.NIL)));
        if (shop_internals.NIL != v_class) {
            return Vectors.aref(subloop_structures.class_any_slots(v_class), (SubLObject)shop_internals.ONE_INTEGER);
        }
        return (SubLObject)shop_internals.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/shop-internals.lisp", position = 9398L)
    public static SubLObject set_shop_variable_manager_variable_counter(final SubLObject shop_variable_manager, final SubLObject value) {
        final SubLObject v_class = (SubLObject)(shop_variable_manager.isSymbol() ? classes.classes_retrieve_class(shop_variable_manager) : ((shop_internals.NIL != subloop_structures.class_p(shop_variable_manager)) ? shop_variable_manager : ((shop_internals.NIL != subloop_structures.instance_p(shop_variable_manager)) ? subloop_structures.instance_class(shop_variable_manager) : shop_internals.NIL)));
        if (shop_internals.NIL != v_class) {
            return Vectors.set_aref(subloop_structures.class_any_slots(v_class), (SubLObject)shop_internals.ONE_INTEGER, value);
        }
        return (SubLObject)shop_internals.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/shop-internals.lisp", position = 9398L)
    public static SubLObject subloop_reserved_initialize_shop_variable_manager_class(final SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, (SubLObject)shop_internals.$sym11$OBJECT, (SubLObject)shop_internals.$sym21$INSTANCE_COUNT, (SubLObject)shop_internals.ZERO_INTEGER);
        classes.subloop_initialize_slot(new_instance, (SubLObject)shop_internals.$sym134$SHOP_VARIABLE_MANAGER, (SubLObject)shop_internals.$sym136$VARIABLE_COUNTER, (SubLObject)shop_internals.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)shop_internals.$sym134$SHOP_VARIABLE_MANAGER, (SubLObject)shop_internals.$sym137$VARIABLE_PREFIX, (SubLObject)shop_internals.NIL);
        return (SubLObject)shop_internals.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/shop-internals.lisp", position = 9398L)
    public static SubLObject subloop_reserved_initialize_shop_variable_manager_instance(final SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, (SubLObject)shop_internals.$sym11$OBJECT, (SubLObject)shop_internals.$sym23$ISOLATED_P, (SubLObject)shop_internals.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)shop_internals.$sym11$OBJECT, (SubLObject)shop_internals.$sym24$INSTANCE_NUMBER, (SubLObject)shop_internals.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)shop_internals.$sym134$SHOP_VARIABLE_MANAGER, (SubLObject)shop_internals.$sym139$VARIABLE_ASSOC_TABLE, (SubLObject)shop_internals.NIL);
        return (SubLObject)shop_internals.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/shop-internals.lisp", position = 9398L)
    public static SubLObject shop_variable_manager_p(final SubLObject shop_variable_manager) {
        return classes.subloop_instanceof_class(shop_variable_manager, (SubLObject)shop_internals.$sym134$SHOP_VARIABLE_MANAGER);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/shop-internals.lisp", position = 10204L)
    public static SubLObject shop_variable_manager_initialize_method(final SubLObject self) {
        object.object_initialize_method(self);
        instances.set_slot(self, (SubLObject)shop_internals.$sym137$VARIABLE_PREFIX, (SubLObject)shop_internals.$str143$_PV_);
        if (shop_internals.NIL == instances.get_slot(self, (SubLObject)shop_internals.$sym139$VARIABLE_ASSOC_TABLE)) {
            instances.set_slot(self, (SubLObject)shop_internals.$sym136$VARIABLE_COUNTER, (SubLObject)shop_internals.ZERO_INTEGER);
            instances.set_slot(self, (SubLObject)shop_internals.$sym139$VARIABLE_ASSOC_TABLE, Hashtables.make_hash_table((SubLObject)shop_internals.$int144$100, (SubLObject)shop_internals.UNPROVIDED, (SubLObject)shop_internals.UNPROVIDED));
        }
        return self;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/shop-internals.lisp", position = 10533L)
    public static SubLObject shop_variable_manager_generate_variable_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_shop_variable_manager_method = (SubLObject)shop_internals.NIL;
        final SubLObject variable_prefix = get_shop_variable_manager_variable_prefix(self);
        SubLObject variable_counter = get_shop_variable_manager_variable_counter(self);
        try {
            thread.throwStack.push(shop_internals.$sym148$OUTER_CATCH_FOR_SHOP_VARIABLE_MANAGER_METHOD);
            try {
                final SubLObject var_name = Sequences.cconcatenate(variable_prefix, PrintLow.write_to_string(variable_counter, shop_internals.EMPTY_SUBL_OBJECT_ARRAY));
                final SubLObject var_symbol = Packages.intern(var_name, Packages.find_package((SubLObject)shop_internals.$str149$CYC));
                variable_counter = Numbers.add(variable_counter, (SubLObject)shop_internals.ONE_INTEGER);
                Dynamic.sublisp_throw((SubLObject)shop_internals.$sym148$OUTER_CATCH_FOR_SHOP_VARIABLE_MANAGER_METHOD, var_symbol);
            }
            finally {
                final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)shop_internals.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    set_shop_variable_manager_variable_prefix(self, variable_prefix);
                    set_shop_variable_manager_variable_counter(self, variable_counter);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        }
        catch (Throwable ccatch_env_var) {
            catch_var_for_shop_variable_manager_method = Errors.handleThrowable(ccatch_env_var, (SubLObject)shop_internals.$sym148$OUTER_CATCH_FOR_SHOP_VARIABLE_MANAGER_METHOD);
        }
        finally {
            thread.throwStack.pop();
        }
        return catch_var_for_shop_variable_manager_method;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/shop-internals.lisp", position = 10859L)
    public static SubLObject shop_variable_manager_generate_binding_pair_method(final SubLObject self, final SubLObject old_var) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_shop_variable_manager_method = (SubLObject)shop_internals.NIL;
        final SubLObject variable_assoc_table = get_shop_variable_manager_variable_assoc_table(self);
        try {
            thread.throwStack.push(shop_internals.$sym154$OUTER_CATCH_FOR_SHOP_VARIABLE_MANAGER_METHOD);
            try {
                final SubLObject new_var = shop_variable_manager_generate_variable_method(self);
                Hashtables.sethash(new_var, variable_assoc_table, old_var);
                Dynamic.sublisp_throw((SubLObject)shop_internals.$sym154$OUTER_CATCH_FOR_SHOP_VARIABLE_MANAGER_METHOD, (SubLObject)ConsesLow.cons(old_var, new_var));
            }
            finally {
                final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)shop_internals.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    set_shop_variable_manager_variable_assoc_table(self, variable_assoc_table);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        }
        catch (Throwable ccatch_env_var) {
            catch_var_for_shop_variable_manager_method = Errors.handleThrowable(ccatch_env_var, (SubLObject)shop_internals.$sym154$OUTER_CATCH_FOR_SHOP_VARIABLE_MANAGER_METHOD);
        }
        finally {
            thread.throwStack.pop();
        }
        return catch_var_for_shop_variable_manager_method;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/shop-internals.lisp", position = 11267L)
    public static SubLObject shop_variable_manager_generate_binding_list_method(final SubLObject self, final SubLObject old_var_list) {
        SubLObject blist = (SubLObject)shop_internals.NIL;
        SubLObject cdolist_list_var = old_var_list;
        SubLObject old_var = (SubLObject)shop_internals.NIL;
        old_var = cdolist_list_var.first();
        while (shop_internals.NIL != cdolist_list_var) {
            blist = (SubLObject)ConsesLow.cons(shop_variable_manager_generate_binding_pair_method(self, old_var), blist);
            cdolist_list_var = cdolist_list_var.rest();
            old_var = cdolist_list_var.first();
        }
        return blist;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/shop-internals.lisp", position = 11616L)
    public static SubLObject shop_variable_manager_recover_el_variable_method(final SubLObject self, final SubLObject hl_var) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_shop_variable_manager_method = (SubLObject)shop_internals.NIL;
        final SubLObject variable_assoc_table = get_shop_variable_manager_variable_assoc_table(self);
        try {
            thread.throwStack.push(shop_internals.$sym163$OUTER_CATCH_FOR_SHOP_VARIABLE_MANAGER_METHOD);
            try {
                final SubLObject el_var = Hashtables.gethash(hl_var, variable_assoc_table, (SubLObject)shop_internals.UNPROVIDED);
                if (shop_internals.NIL != el_var) {
                    Dynamic.sublisp_throw((SubLObject)shop_internals.$sym163$OUTER_CATCH_FOR_SHOP_VARIABLE_MANAGER_METHOD, el_var);
                }
                Errors.cerror((SubLObject)shop_internals.$str164$VARIABLE_ERROR, (SubLObject)shop_internals.$str165$_s_is_not_a_known_variable_to__s_, hl_var, self);
                Dynamic.sublisp_throw((SubLObject)shop_internals.$sym163$OUTER_CATCH_FOR_SHOP_VARIABLE_MANAGER_METHOD, (SubLObject)shop_internals.NIL);
            }
            finally {
                final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)shop_internals.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    set_shop_variable_manager_variable_assoc_table(self, variable_assoc_table);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        }
        catch (Throwable ccatch_env_var) {
            catch_var_for_shop_variable_manager_method = Errors.handleThrowable(ccatch_env_var, (SubLObject)shop_internals.$sym163$OUTER_CATCH_FOR_SHOP_VARIABLE_MANAGER_METHOD);
        }
        finally {
            thread.throwStack.pop();
        }
        return catch_var_for_shop_variable_manager_method;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/shop-internals.lisp", position = 12053L)
    public static SubLObject shop_variable_manager_gather_el_variables_method(final SubLObject self, final SubLObject form, final SubLObject mbinding) {
        SubLObject unbound_vars = (SubLObject)shop_internals.NIL;
        SubLObject cdolist_list_var = list_utilities.tree_gather(form, Symbols.symbol_function((SubLObject)shop_internals.$sym170$SHOP_VARIABLEP), (SubLObject)shop_internals.UNPROVIDED, (SubLObject)shop_internals.UNPROVIDED, (SubLObject)shop_internals.UNPROVIDED);
        SubLObject cur_var = (SubLObject)shop_internals.NIL;
        cur_var = cdolist_list_var.first();
        while (shop_internals.NIL != cdolist_list_var) {
            if (shop_internals.NIL == shop_variable_manager_generated_variableP_method((SubLObject)shop_internals.$sym134$SHOP_VARIABLE_MANAGER, cur_var) && shop_internals.NIL != multibindings.free_variable_in_multibindingP(cur_var, mbinding)) {
                unbound_vars = (SubLObject)ConsesLow.cons(cur_var, unbound_vars);
            }
            cdolist_list_var = cdolist_list_var.rest();
            cur_var = cdolist_list_var.first();
        }
        return Sequences.reverse(unbound_vars);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/shop-internals.lisp", position = 12721L)
    public static SubLObject shop_variable_manager_managed_variableP_method(final SubLObject self, final SubLObject var) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_shop_variable_manager_method = (SubLObject)shop_internals.NIL;
        final SubLObject variable_assoc_table = get_shop_variable_manager_variable_assoc_table(self);
        try {
            thread.throwStack.push(shop_internals.$sym175$OUTER_CATCH_FOR_SHOP_VARIABLE_MANAGER_METHOD);
            try {
                Dynamic.sublisp_throw((SubLObject)shop_internals.$sym175$OUTER_CATCH_FOR_SHOP_VARIABLE_MANAGER_METHOD, (SubLObject)((shop_internals.NIL != Hashtables.gethash(var, variable_assoc_table, (SubLObject)shop_internals.UNPROVIDED)) ? shop_internals.T : shop_internals.NIL));
            }
            finally {
                final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)shop_internals.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    set_shop_variable_manager_variable_assoc_table(self, variable_assoc_table);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        }
        catch (Throwable ccatch_env_var) {
            catch_var_for_shop_variable_manager_method = Errors.handleThrowable(ccatch_env_var, (SubLObject)shop_internals.$sym175$OUTER_CATCH_FOR_SHOP_VARIABLE_MANAGER_METHOD);
        }
        finally {
            thread.throwStack.pop();
        }
        return catch_var_for_shop_variable_manager_method;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/shop-internals.lisp", position = 12874L)
    public static SubLObject shop_variable_manager_generated_variableP_method(final SubLObject self, final SubLObject var) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_shop_variable_manager_method = (SubLObject)shop_internals.NIL;
        final SubLObject variable_prefix = get_shop_variable_manager_variable_prefix(self);
        try {
            thread.throwStack.push(shop_internals.$sym179$OUTER_CATCH_FOR_SHOP_VARIABLE_MANAGER_METHOD);
            try {
                if (!var.isSymbol()) {
                    Dynamic.sublisp_throw((SubLObject)shop_internals.$sym179$OUTER_CATCH_FOR_SHOP_VARIABLE_MANAGER_METHOD, (SubLObject)shop_internals.NIL);
                }
                if (shop_internals.NIL != variables.variable_p(var)) {
                    Dynamic.sublisp_throw((SubLObject)shop_internals.$sym179$OUTER_CATCH_FOR_SHOP_VARIABLE_MANAGER_METHOD, (SubLObject)shop_internals.NIL);
                }
                final SubLObject var_name = Symbols.symbol_name(var);
                final SubLObject min_length = Sequences.length(variable_prefix);
                final SubLObject var_prefix = (SubLObject)(Sequences.length(var_name).numGE(min_length) ? string_utilities.substring(Symbols.symbol_name(var), (SubLObject)shop_internals.ZERO_INTEGER, Sequences.length(variable_prefix)) : shop_internals.$str180$);
                if (shop_internals.NIL != Strings.stringE(var_prefix, variable_prefix, (SubLObject)shop_internals.UNPROVIDED, (SubLObject)shop_internals.UNPROVIDED, (SubLObject)shop_internals.UNPROVIDED, (SubLObject)shop_internals.UNPROVIDED)) {
                    Dynamic.sublisp_throw((SubLObject)shop_internals.$sym179$OUTER_CATCH_FOR_SHOP_VARIABLE_MANAGER_METHOD, (SubLObject)shop_internals.T);
                }
                else {
                    Dynamic.sublisp_throw((SubLObject)shop_internals.$sym179$OUTER_CATCH_FOR_SHOP_VARIABLE_MANAGER_METHOD, (SubLObject)shop_internals.NIL);
                }
            }
            finally {
                final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)shop_internals.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    set_shop_variable_manager_variable_prefix(self, variable_prefix);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        }
        catch (Throwable ccatch_env_var) {
            catch_var_for_shop_variable_manager_method = Errors.handleThrowable(ccatch_env_var, (SubLObject)shop_internals.$sym179$OUTER_CATCH_FOR_SHOP_VARIABLE_MANAGER_METHOD);
        }
        finally {
            thread.throwStack.pop();
        }
        return catch_var_for_shop_variable_manager_method;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/shop-internals.lisp", position = 13514L)
    public static SubLObject shop_variable_manager_generated_variables_bound_method(final SubLObject self, final SubLObject binding) {
        SubLObject bpairs = (SubLObject)shop_internals.NIL;
        SubLObject cdolist_list_var = binding;
        SubLObject cur_pair = (SubLObject)shop_internals.NIL;
        cur_pair = cdolist_list_var.first();
        while (shop_internals.NIL != cdolist_list_var) {
            if (shop_internals.NIL != shop_variable_manager_generated_variableP_method((SubLObject)shop_internals.$sym134$SHOP_VARIABLE_MANAGER, cur_pair.first())) {
                bpairs = (SubLObject)ConsesLow.cons(cur_pair, bpairs);
            }
            cdolist_list_var = cdolist_list_var.rest();
            cur_pair = cdolist_list_var.first();
        }
        return bpairs;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/shop-internals.lisp", position = 13862L)
    public static SubLObject shop_variable_manager_replace_variables_method(final SubLObject self, final SubLObject form, final SubLObject mbinding) {
        final SubLObject old_vars = shop_variable_manager_gather_el_variables_method(self, form, mbinding);
        final SubLObject blist = shop_variable_manager_generate_binding_list_method(self, old_vars);
        return conses_high.sublis(blist, form, (SubLObject)shop_internals.UNPROVIDED, (SubLObject)shop_internals.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/shop-internals.lisp", position = 14361L)
    public static SubLObject shop_variable_manager_recover_el_method(final SubLObject self, final SubLObject tree) {
        final SubLObject hl_vars = list_utilities.tree_gather(tree, Symbols.symbol_function((SubLObject)shop_internals.$sym170$SHOP_VARIABLEP), (SubLObject)shop_internals.UNPROVIDED, (SubLObject)shop_internals.UNPROVIDED, (SubLObject)shop_internals.UNPROVIDED);
        SubLObject new_tree = conses_high.copy_tree(tree);
        SubLObject cdolist_list_var = hl_vars;
        SubLObject cur_var = (SubLObject)shop_internals.NIL;
        cur_var = cdolist_list_var.first();
        while (shop_internals.NIL != cdolist_list_var) {
            if (shop_internals.NIL != shop_variable_manager_managed_variableP_method(self, cur_var)) {
                new_tree = conses_high.nsubst(shop_variable_manager_recover_el_variable_method(self, cur_var), cur_var, new_tree, (SubLObject)shop_internals.UNPROVIDED, (SubLObject)shop_internals.UNPROVIDED);
            }
            cdolist_list_var = cdolist_list_var.rest();
            cur_var = cdolist_list_var.first();
        }
        return new_tree;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/shop-internals.lisp", position = 14809L)
    public static SubLObject shop_arg_isa_for_pred(final SubLObject pred, final SubLObject pos, final SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject assertions = (SubLObject)shop_internals.NIL;
        SubLObject cols = (SubLObject)shop_internals.NIL;
        final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(mt);
        final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
        try {
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
            mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
            assertions = kb_mapping.gather_gaf_arg_index(pred, (SubLObject)shop_internals.ONE_INTEGER, shop_internals.$const193$argIsa, (SubLObject)shop_internals.UNPROVIDED, (SubLObject)shop_internals.UNPROVIDED);
        }
        finally {
            mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
        }
        SubLObject cdolist_list_var = assertions;
        SubLObject cur_assertion = (SubLObject)shop_internals.NIL;
        cur_assertion = cdolist_list_var.first();
        while (shop_internals.NIL != cdolist_list_var) {
            if (assertions_high.gaf_arg2(cur_assertion).eql(pos)) {
                cols = (SubLObject)ConsesLow.cons(assertions_high.gaf_arg3(cur_assertion), cols);
            }
            cdolist_list_var = cdolist_list_var.rest();
            cur_assertion = cdolist_list_var.first();
        }
        return genls.min_cols(cols, mt, (SubLObject)shop_internals.UNPROVIDED).first();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/shop-internals.lisp", position = 15438L)
    public static SubLObject shop_arg_genl_for_pred(final SubLObject pred, final SubLObject pos, final SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject assertions = (SubLObject)shop_internals.NIL;
        SubLObject cols = (SubLObject)shop_internals.NIL;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind((SubLObject)shop_internals.$sym194$RELEVANT_MT_IS_GENL_MT, thread);
            mt_relevance_macros.$mt$.bind(mt, thread);
            assertions = kb_mapping.gather_gaf_arg_index(pred, (SubLObject)shop_internals.ONE_INTEGER, shop_internals.$const195$argGenl, (SubLObject)shop_internals.UNPROVIDED, (SubLObject)shop_internals.UNPROVIDED);
        }
        finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        SubLObject cdolist_list_var = assertions;
        SubLObject cur_assertion = (SubLObject)shop_internals.NIL;
        cur_assertion = cdolist_list_var.first();
        while (shop_internals.NIL != cdolist_list_var) {
            if (assertions_high.gaf_arg2(cur_assertion).eql(pos)) {
                cols = (SubLObject)ConsesLow.cons(assertions_high.gaf_arg3(cur_assertion), cols);
            }
            cdolist_list_var = cdolist_list_var.rest();
            cur_assertion = cdolist_list_var.first();
        }
        return genls.min_cols(cols, mt, (SubLObject)shop_internals.UNPROVIDED).first();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/shop-internals.lisp", position = 16000L)
    public static SubLObject shop_initial_extent_for_position(final SubLObject pred, final SubLObject pos, final SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject arg_isa = shop_arg_isa_for_pred(pred, pos, mt);
        final SubLObject arg_genls = shop_arg_genl_for_pred(pred, pos, mt);
        SubLObject extent = (SubLObject)shop_internals.NIL;
        final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(mt);
        final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
        try {
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
            mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
            if (shop_internals.NIL != arg_genls) {
                extent = keyhash_utilities.fast_intersection(isa.all_fort_instances(arg_isa, (SubLObject)shop_internals.UNPROVIDED, (SubLObject)shop_internals.UNPROVIDED), genls.all_specs(arg_genls, (SubLObject)shop_internals.UNPROVIDED, (SubLObject)shop_internals.UNPROVIDED), (SubLObject)shop_internals.UNPROVIDED, (SubLObject)shop_internals.UNPROVIDED, (SubLObject)shop_internals.UNPROVIDED);
            }
            else {
                extent = isa.all_fort_instances(arg_isa, (SubLObject)shop_internals.UNPROVIDED, (SubLObject)shop_internals.UNPROVIDED);
            }
        }
        finally {
            mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
        }
        return extent;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/shop-internals.lisp", position = 16410L)
    public static SubLObject shop_initial_multibinding_for_task(final SubLObject task, final SubLObject mt) {
        final SubLObject free_variables = el_utilities.sentence_free_variables(task, (SubLObject)shop_internals.UNPROVIDED, (SubLObject)shop_internals.UNPROVIDED, (SubLObject)shop_internals.UNPROVIDED);
        final SubLObject predicate = el_utilities.literal_predicate(task, (SubLObject)shop_internals.UNPROVIDED);
        final SubLObject mbinding = multibindings.create_mb();
        SubLObject cdolist_list_var = free_variables;
        SubLObject cur_var = (SubLObject)shop_internals.NIL;
        cur_var = cdolist_list_var.first();
        while (shop_internals.NIL != cdolist_list_var) {
            final SubLObject position = Sequences.position(cur_var, task, (SubLObject)shop_internals.UNPROVIDED, (SubLObject)shop_internals.UNPROVIDED, (SubLObject)shop_internals.UNPROVIDED, (SubLObject)shop_internals.UNPROVIDED);
            final SubLObject initial_extent = shop_initial_extent_for_position(predicate, position, mt);
            final SubLObject initial_items = multibindings.mb_make_entry_with_null_supports(initial_extent);
            if (shop_internals.NIL != initial_extent) {
                multibindings.set_mb_var_entry(mbinding, cur_var, initial_items);
            }
            cdolist_list_var = cdolist_list_var.rest();
            cur_var = cdolist_list_var.first();
        }
        return mbinding;
    }
    
    public static SubLObject declare_shop_internals_file() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.shop_internals", "lispify_cyc_bindings", "LISPIFY-CYC-BINDINGS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.shop_internals", "shop_translate_plan", "SHOP-TRANSLATE-PLAN", 1, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.shop_internals", "inc_slot", "INC-SLOT");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.shop_internals", "process_timer_p", "PROCESS-TIMER-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.shop_internals", "get_statistic_manager_last_call_real_time", "GET-STATISTIC-MANAGER-LAST-CALL-REAL-TIME", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.shop_internals", "set_statistic_manager_last_call_real_time", "SET-STATISTIC-MANAGER-LAST-CALL-REAL-TIME", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.shop_internals", "get_statistic_manager_last_call_run_time", "GET-STATISTIC-MANAGER-LAST-CALL-RUN-TIME", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.shop_internals", "set_statistic_manager_last_call_run_time", "SET-STATISTIC-MANAGER-LAST-CALL-RUN-TIME", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.shop_internals", "get_statistic_manager_end_real_time", "GET-STATISTIC-MANAGER-END-REAL-TIME", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.shop_internals", "set_statistic_manager_end_real_time", "SET-STATISTIC-MANAGER-END-REAL-TIME", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.shop_internals", "get_statistic_manager_end_run_time", "GET-STATISTIC-MANAGER-END-RUN-TIME", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.shop_internals", "set_statistic_manager_end_run_time", "SET-STATISTIC-MANAGER-END-RUN-TIME", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.shop_internals", "get_statistic_manager_start_real_time", "GET-STATISTIC-MANAGER-START-REAL-TIME", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.shop_internals", "set_statistic_manager_start_real_time", "SET-STATISTIC-MANAGER-START-REAL-TIME", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.shop_internals", "get_statistic_manager_start_run_time", "GET-STATISTIC-MANAGER-START-RUN-TIME", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.shop_internals", "set_statistic_manager_start_run_time", "SET-STATISTIC-MANAGER-START-RUN-TIME", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.shop_internals", "get_statistic_manager_timingP", "GET-STATISTIC-MANAGER-TIMING?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.shop_internals", "set_statistic_manager_timingP", "SET-STATISTIC-MANAGER-TIMING?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.shop_internals", "subloop_reserved_initialize_statistic_manager_class", "SUBLOOP-RESERVED-INITIALIZE-STATISTIC-MANAGER-CLASS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.shop_internals", "subloop_reserved_initialize_statistic_manager_instance", "SUBLOOP-RESERVED-INITIALIZE-STATISTIC-MANAGER-INSTANCE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.shop_internals", "statistic_manager_p", "STATISTIC-MANAGER-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.shop_internals", "statistic_manager_initialize_method", "STATISTIC-MANAGER-INITIALIZE-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.shop_internals", "statistic_manager_get_run_time_method", "STATISTIC-MANAGER-GET-RUN-TIME-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.shop_internals", "statistic_manager_get_real_time_method", "STATISTIC-MANAGER-GET-REAL-TIME-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.shop_internals", "statistic_manager_reset_last_call_time_method", "STATISTIC-MANAGER-RESET-LAST-CALL-TIME-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.shop_internals", "statistic_manager_start_timing_method", "STATISTIC-MANAGER-START-TIMING-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.shop_internals", "statistic_manager_resume_timing_method", "STATISTIC-MANAGER-RESUME-TIMING-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.shop_internals", "statistic_manager_stop_timing_method", "STATISTIC-MANAGER-STOP-TIMING-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.shop_internals", "statistic_manager_is_timingP_method", "STATISTIC-MANAGER-IS-TIMING?-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.shop_internals", "statistic_manager_elapsed_real_time_method", "STATISTIC-MANAGER-ELAPSED-REAL-TIME-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.shop_internals", "statistic_manager_elapsed_run_time_method", "STATISTIC-MANAGER-ELAPSED-RUN-TIME-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.shop_internals", "statistic_manager_reset_timing_method", "STATISTIC-MANAGER-RESET-TIMING-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.shop_internals", "statistic_manager_elapsed_real_time_since_last_call_method", "STATISTIC-MANAGER-ELAPSED-REAL-TIME-SINCE-LAST-CALL-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.shop_internals", "statistic_manager_elapsed_run_time_since_last_call_method", "STATISTIC-MANAGER-ELAPSED-RUN-TIME-SINCE-LAST-CALL-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.shop_internals", "get_shop_statistic_manager_plans", "GET-SHOP-STATISTIC-MANAGER-PLANS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.shop_internals", "set_shop_statistic_manager_plans", "SET-SHOP-STATISTIC-MANAGER-PLANS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.shop_internals", "get_shop_statistic_manager_plan_counter", "GET-SHOP-STATISTIC-MANAGER-PLAN-COUNTER", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.shop_internals", "set_shop_statistic_manager_plan_counter", "SET-SHOP-STATISTIC-MANAGER-PLAN-COUNTER", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.shop_internals", "get_shop_statistic_manager_plan_state_ask_counter", "GET-SHOP-STATISTIC-MANAGER-PLAN-STATE-ASK-COUNTER", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.shop_internals", "set_shop_statistic_manager_plan_state_ask_counter", "SET-SHOP-STATISTIC-MANAGER-PLAN-STATE-ASK-COUNTER", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.shop_internals", "get_shop_statistic_manager_fi_ask_counter", "GET-SHOP-STATISTIC-MANAGER-FI-ASK-COUNTER", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.shop_internals", "set_shop_statistic_manager_fi_ask_counter", "SET-SHOP-STATISTIC-MANAGER-FI-ASK-COUNTER", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.shop_internals", "get_shop_statistic_manager_inference_counter", "GET-SHOP-STATISTIC-MANAGER-INFERENCE-COUNTER", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.shop_internals", "set_shop_statistic_manager_inference_counter", "SET-SHOP-STATISTIC-MANAGER-INFERENCE-COUNTER", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.shop_internals", "get_shop_statistic_manager_method_counter", "GET-SHOP-STATISTIC-MANAGER-METHOD-COUNTER", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.shop_internals", "set_shop_statistic_manager_method_counter", "SET-SHOP-STATISTIC-MANAGER-METHOD-COUNTER", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.shop_internals", "subloop_reserved_initialize_shop_statistic_manager_class", "SUBLOOP-RESERVED-INITIALIZE-SHOP-STATISTIC-MANAGER-CLASS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.shop_internals", "subloop_reserved_initialize_shop_statistic_manager_instance", "SUBLOOP-RESERVED-INITIALIZE-SHOP-STATISTIC-MANAGER-INSTANCE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.shop_internals", "shop_statistic_manager_p", "SHOP-STATISTIC-MANAGER-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.shop_internals", "shop_statistic_manager_initialize_method", "SHOP-STATISTIC-MANAGER-INITIALIZE-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.shop_internals", "shop_statistic_manager_reset_counters_method", "SHOP-STATISTIC-MANAGER-RESET-COUNTERS-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.shop_internals", "shop_statistic_manager_add_fi_ask_method", "SHOP-STATISTIC-MANAGER-ADD-FI-ASK-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.shop_internals", "shop_statistic_manager_add_plan_state_ask_method", "SHOP-STATISTIC-MANAGER-ADD-PLAN-STATE-ASK-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.shop_internals", "shop_statistic_manager_add_expansion_method", "SHOP-STATISTIC-MANAGER-ADD-EXPANSION-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.shop_internals", "shop_statistic_manager_add_inference_method", "SHOP-STATISTIC-MANAGER-ADD-INFERENCE-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.shop_internals", "shop_statistic_manager_add_plan_method", "SHOP-STATISTIC-MANAGER-ADD-PLAN-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.shop_internals", "shop_statistic_manager_number_of_inferences_method", "SHOP-STATISTIC-MANAGER-NUMBER-OF-INFERENCES-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.shop_internals", "shop_statistic_manager_number_of_methods_method", "SHOP-STATISTIC-MANAGER-NUMBER-OF-METHODS-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.shop_internals", "shop_statistic_manager_number_of_expansions_method", "SHOP-STATISTIC-MANAGER-NUMBER-OF-EXPANSIONS-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.shop_internals", "shop_statistic_manager_number_of_plans_method", "SHOP-STATISTIC-MANAGER-NUMBER-OF-PLANS-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.shop_internals", "shop_statistic_manager_number_of_fi_asks_method", "SHOP-STATISTIC-MANAGER-NUMBER-OF-FI-ASKS-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.shop_internals", "shop_statistic_manager_number_of_plan_state_asks_method", "SHOP-STATISTIC-MANAGER-NUMBER-OF-PLAN-STATE-ASKS-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.shop_internals", "get_shop_variable_manager_variable_assoc_table", "GET-SHOP-VARIABLE-MANAGER-VARIABLE-ASSOC-TABLE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.shop_internals", "set_shop_variable_manager_variable_assoc_table", "SET-SHOP-VARIABLE-MANAGER-VARIABLE-ASSOC-TABLE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.shop_internals", "get_shop_variable_manager_variable_prefix", "GET-SHOP-VARIABLE-MANAGER-VARIABLE-PREFIX", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.shop_internals", "set_shop_variable_manager_variable_prefix", "SET-SHOP-VARIABLE-MANAGER-VARIABLE-PREFIX", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.shop_internals", "get_shop_variable_manager_variable_counter", "GET-SHOP-VARIABLE-MANAGER-VARIABLE-COUNTER", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.shop_internals", "set_shop_variable_manager_variable_counter", "SET-SHOP-VARIABLE-MANAGER-VARIABLE-COUNTER", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.shop_internals", "subloop_reserved_initialize_shop_variable_manager_class", "SUBLOOP-RESERVED-INITIALIZE-SHOP-VARIABLE-MANAGER-CLASS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.shop_internals", "subloop_reserved_initialize_shop_variable_manager_instance", "SUBLOOP-RESERVED-INITIALIZE-SHOP-VARIABLE-MANAGER-INSTANCE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.shop_internals", "shop_variable_manager_p", "SHOP-VARIABLE-MANAGER-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.shop_internals", "shop_variable_manager_initialize_method", "SHOP-VARIABLE-MANAGER-INITIALIZE-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.shop_internals", "shop_variable_manager_generate_variable_method", "SHOP-VARIABLE-MANAGER-GENERATE-VARIABLE-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.shop_internals", "shop_variable_manager_generate_binding_pair_method", "SHOP-VARIABLE-MANAGER-GENERATE-BINDING-PAIR-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.shop_internals", "shop_variable_manager_generate_binding_list_method", "SHOP-VARIABLE-MANAGER-GENERATE-BINDING-LIST-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.shop_internals", "shop_variable_manager_recover_el_variable_method", "SHOP-VARIABLE-MANAGER-RECOVER-EL-VARIABLE-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.shop_internals", "shop_variable_manager_gather_el_variables_method", "SHOP-VARIABLE-MANAGER-GATHER-EL-VARIABLES-METHOD", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.shop_internals", "shop_variable_manager_managed_variableP_method", "SHOP-VARIABLE-MANAGER-MANAGED-VARIABLE?-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.shop_internals", "shop_variable_manager_generated_variableP_method", "SHOP-VARIABLE-MANAGER-GENERATED-VARIABLE?-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.shop_internals", "shop_variable_manager_generated_variables_bound_method", "SHOP-VARIABLE-MANAGER-GENERATED-VARIABLES-BOUND-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.shop_internals", "shop_variable_manager_replace_variables_method", "SHOP-VARIABLE-MANAGER-REPLACE-VARIABLES-METHOD", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.shop_internals", "shop_variable_manager_recover_el_method", "SHOP-VARIABLE-MANAGER-RECOVER-EL-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.shop_internals", "shop_arg_isa_for_pred", "SHOP-ARG-ISA-FOR-PRED", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.shop_internals", "shop_arg_genl_for_pred", "SHOP-ARG-GENL-FOR-PRED", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.shop_internals", "shop_initial_extent_for_position", "SHOP-INITIAL-EXTENT-FOR-POSITION", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.shop_internals", "shop_initial_multibinding_for_task", "SHOP-INITIAL-MULTIBINDING-FOR-TASK", 2, 0, false);
        return (SubLObject)shop_internals.NIL;
    }
    
    public static SubLObject init_shop_internals_file() {
        shop_internals.$shop_verbose_keys$ = SubLFiles.defparameter("*SHOP-VERBOSE-KEYS*", (SubLObject)shop_internals.$list0);
        shop_internals.$shop_gc$ = SubLFiles.defparameter("*SHOP-GC*", (SubLObject)shop_internals.NIL);
        shop_internals.$shop_verbose_target$ = SubLFiles.defparameter("*SHOP-VERBOSE-TARGET*", (SubLObject)shop_internals.$kw1$STDOUT);
        return (SubLObject)shop_internals.NIL;
    }
    
    public static SubLObject setup_shop_internals_file() {
        interfaces.new_interface((SubLObject)shop_internals.$sym8$PROCESS_TIMER, (SubLObject)shop_internals.NIL, (SubLObject)shop_internals.NIL, (SubLObject)shop_internals.$list9);
        classes.subloop_new_class((SubLObject)shop_internals.$sym10$STATISTIC_MANAGER, (SubLObject)shop_internals.$sym11$OBJECT, (SubLObject)shop_internals.$list12, (SubLObject)shop_internals.NIL, (SubLObject)shop_internals.$list13);
        classes.class_set_implements_slot_listeners((SubLObject)shop_internals.$sym10$STATISTIC_MANAGER, (SubLObject)shop_internals.NIL);
        classes.subloop_note_class_initialization_function((SubLObject)shop_internals.$sym10$STATISTIC_MANAGER, (SubLObject)shop_internals.$sym22$SUBLOOP_RESERVED_INITIALIZE_STATISTIC_MANAGER_CLASS);
        classes.subloop_note_instance_initialization_function((SubLObject)shop_internals.$sym10$STATISTIC_MANAGER, (SubLObject)shop_internals.$sym25$SUBLOOP_RESERVED_INITIALIZE_STATISTIC_MANAGER_INSTANCE);
        subloop_reserved_initialize_statistic_manager_class((SubLObject)shop_internals.$sym10$STATISTIC_MANAGER);
        methods.methods_incorporate_instance_method((SubLObject)shop_internals.$sym26$INITIALIZE, (SubLObject)shop_internals.$sym10$STATISTIC_MANAGER, (SubLObject)shop_internals.$list27, (SubLObject)shop_internals.NIL, (SubLObject)shop_internals.$list28);
        methods.subloop_register_instance_method((SubLObject)shop_internals.$sym10$STATISTIC_MANAGER, (SubLObject)shop_internals.$sym26$INITIALIZE, (SubLObject)shop_internals.$sym29$STATISTIC_MANAGER_INITIALIZE_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)shop_internals.$sym30$GET_RUN_TIME, (SubLObject)shop_internals.$sym10$STATISTIC_MANAGER, (SubLObject)shop_internals.$list31, (SubLObject)shop_internals.NIL, (SubLObject)shop_internals.$list32);
        methods.subloop_register_instance_method((SubLObject)shop_internals.$sym10$STATISTIC_MANAGER, (SubLObject)shop_internals.$sym30$GET_RUN_TIME, (SubLObject)shop_internals.$sym33$STATISTIC_MANAGER_GET_RUN_TIME_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)shop_internals.$sym34$GET_REAL_TIME, (SubLObject)shop_internals.$sym10$STATISTIC_MANAGER, (SubLObject)shop_internals.$list31, (SubLObject)shop_internals.NIL, (SubLObject)shop_internals.$list35);
        methods.subloop_register_instance_method((SubLObject)shop_internals.$sym10$STATISTIC_MANAGER, (SubLObject)shop_internals.$sym34$GET_REAL_TIME, (SubLObject)shop_internals.$sym36$STATISTIC_MANAGER_GET_REAL_TIME_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)shop_internals.$sym37$RESET_LAST_CALL_TIME, (SubLObject)shop_internals.$sym10$STATISTIC_MANAGER, (SubLObject)shop_internals.$list31, (SubLObject)shop_internals.NIL, (SubLObject)shop_internals.$list38);
        methods.subloop_register_instance_method((SubLObject)shop_internals.$sym10$STATISTIC_MANAGER, (SubLObject)shop_internals.$sym37$RESET_LAST_CALL_TIME, (SubLObject)shop_internals.$sym40$STATISTIC_MANAGER_RESET_LAST_CALL_TIME_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)shop_internals.$sym41$START_TIMING, (SubLObject)shop_internals.$sym10$STATISTIC_MANAGER, (SubLObject)shop_internals.$list42, (SubLObject)shop_internals.NIL, (SubLObject)shop_internals.$list43);
        methods.subloop_register_instance_method((SubLObject)shop_internals.$sym10$STATISTIC_MANAGER, (SubLObject)shop_internals.$sym41$START_TIMING, (SubLObject)shop_internals.$sym45$STATISTIC_MANAGER_START_TIMING_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)shop_internals.$sym46$RESUME_TIMING, (SubLObject)shop_internals.$sym10$STATISTIC_MANAGER, (SubLObject)shop_internals.$list42, (SubLObject)shop_internals.NIL, (SubLObject)shop_internals.$list47);
        methods.subloop_register_instance_method((SubLObject)shop_internals.$sym10$STATISTIC_MANAGER, (SubLObject)shop_internals.$sym46$RESUME_TIMING, (SubLObject)shop_internals.$sym49$STATISTIC_MANAGER_RESUME_TIMING_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)shop_internals.$sym50$STOP_TIMING, (SubLObject)shop_internals.$sym10$STATISTIC_MANAGER, (SubLObject)shop_internals.$list42, (SubLObject)shop_internals.NIL, (SubLObject)shop_internals.$list51);
        methods.subloop_register_instance_method((SubLObject)shop_internals.$sym10$STATISTIC_MANAGER, (SubLObject)shop_internals.$sym50$STOP_TIMING, (SubLObject)shop_internals.$sym53$STATISTIC_MANAGER_STOP_TIMING_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)shop_internals.$sym54$IS_TIMING_, (SubLObject)shop_internals.$sym10$STATISTIC_MANAGER, (SubLObject)shop_internals.$list42, (SubLObject)shop_internals.NIL, (SubLObject)shop_internals.$list55);
        methods.subloop_register_instance_method((SubLObject)shop_internals.$sym10$STATISTIC_MANAGER, (SubLObject)shop_internals.$sym54$IS_TIMING_, (SubLObject)shop_internals.$sym57$STATISTIC_MANAGER_IS_TIMING__METHOD);
        methods.methods_incorporate_instance_method((SubLObject)shop_internals.$sym58$ELAPSED_REAL_TIME, (SubLObject)shop_internals.$sym10$STATISTIC_MANAGER, (SubLObject)shop_internals.$list42, (SubLObject)shop_internals.NIL, (SubLObject)shop_internals.$list59);
        methods.subloop_register_instance_method((SubLObject)shop_internals.$sym10$STATISTIC_MANAGER, (SubLObject)shop_internals.$sym58$ELAPSED_REAL_TIME, (SubLObject)shop_internals.$sym61$STATISTIC_MANAGER_ELAPSED_REAL_TIME_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)shop_internals.$sym62$ELAPSED_RUN_TIME, (SubLObject)shop_internals.$sym10$STATISTIC_MANAGER, (SubLObject)shop_internals.$list42, (SubLObject)shop_internals.NIL, (SubLObject)shop_internals.$list63);
        methods.subloop_register_instance_method((SubLObject)shop_internals.$sym10$STATISTIC_MANAGER, (SubLObject)shop_internals.$sym62$ELAPSED_RUN_TIME, (SubLObject)shop_internals.$sym65$STATISTIC_MANAGER_ELAPSED_RUN_TIME_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)shop_internals.$sym66$RESET_TIMING, (SubLObject)shop_internals.$sym10$STATISTIC_MANAGER, (SubLObject)shop_internals.$list42, (SubLObject)shop_internals.NIL, (SubLObject)shop_internals.$list67);
        methods.subloop_register_instance_method((SubLObject)shop_internals.$sym10$STATISTIC_MANAGER, (SubLObject)shop_internals.$sym66$RESET_TIMING, (SubLObject)shop_internals.$sym69$STATISTIC_MANAGER_RESET_TIMING_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)shop_internals.$sym70$ELAPSED_REAL_TIME_SINCE_LAST_CALL, (SubLObject)shop_internals.$sym10$STATISTIC_MANAGER, (SubLObject)shop_internals.$list42, (SubLObject)shop_internals.NIL, (SubLObject)shop_internals.$list71);
        methods.subloop_register_instance_method((SubLObject)shop_internals.$sym10$STATISTIC_MANAGER, (SubLObject)shop_internals.$sym70$ELAPSED_REAL_TIME_SINCE_LAST_CALL, (SubLObject)shop_internals.$sym73$STATISTIC_MANAGER_ELAPSED_REAL_TIME_SINCE_LAST_CALL_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)shop_internals.$sym74$ELAPSED_RUN_TIME_SINCE_LAST_CALL, (SubLObject)shop_internals.$sym10$STATISTIC_MANAGER, (SubLObject)shop_internals.$list42, (SubLObject)shop_internals.NIL, (SubLObject)shop_internals.$list75);
        methods.subloop_register_instance_method((SubLObject)shop_internals.$sym10$STATISTIC_MANAGER, (SubLObject)shop_internals.$sym74$ELAPSED_RUN_TIME_SINCE_LAST_CALL, (SubLObject)shop_internals.$sym77$STATISTIC_MANAGER_ELAPSED_RUN_TIME_SINCE_LAST_CALL_METHOD);
        classes.subloop_new_class((SubLObject)shop_internals.$sym78$SHOP_STATISTIC_MANAGER, (SubLObject)shop_internals.$sym10$STATISTIC_MANAGER, (SubLObject)shop_internals.NIL, (SubLObject)shop_internals.NIL, (SubLObject)shop_internals.$list79);
        classes.class_set_implements_slot_listeners((SubLObject)shop_internals.$sym78$SHOP_STATISTIC_MANAGER, (SubLObject)shop_internals.NIL);
        classes.subloop_note_class_initialization_function((SubLObject)shop_internals.$sym78$SHOP_STATISTIC_MANAGER, (SubLObject)shop_internals.$sym80$SUBLOOP_RESERVED_INITIALIZE_SHOP_STATISTIC_MANAGER_CLASS);
        classes.subloop_note_instance_initialization_function((SubLObject)shop_internals.$sym78$SHOP_STATISTIC_MANAGER, (SubLObject)shop_internals.$sym87$SUBLOOP_RESERVED_INITIALIZE_SHOP_STATISTIC_MANAGER_INSTANCE);
        subloop_reserved_initialize_shop_statistic_manager_class((SubLObject)shop_internals.$sym78$SHOP_STATISTIC_MANAGER);
        methods.methods_incorporate_instance_method((SubLObject)shop_internals.$sym26$INITIALIZE, (SubLObject)shop_internals.$sym78$SHOP_STATISTIC_MANAGER, (SubLObject)shop_internals.$list27, (SubLObject)shop_internals.NIL, (SubLObject)shop_internals.$list88);
        methods.subloop_register_instance_method((SubLObject)shop_internals.$sym78$SHOP_STATISTIC_MANAGER, (SubLObject)shop_internals.$sym26$INITIALIZE, (SubLObject)shop_internals.$sym89$SHOP_STATISTIC_MANAGER_INITIALIZE_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)shop_internals.$sym90$RESET_COUNTERS, (SubLObject)shop_internals.$sym78$SHOP_STATISTIC_MANAGER, (SubLObject)shop_internals.$list42, (SubLObject)shop_internals.NIL, (SubLObject)shop_internals.$list91);
        methods.subloop_register_instance_method((SubLObject)shop_internals.$sym78$SHOP_STATISTIC_MANAGER, (SubLObject)shop_internals.$sym90$RESET_COUNTERS, (SubLObject)shop_internals.$sym93$SHOP_STATISTIC_MANAGER_RESET_COUNTERS_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)shop_internals.$sym94$ADD_FI_ASK, (SubLObject)shop_internals.$sym78$SHOP_STATISTIC_MANAGER, (SubLObject)shop_internals.$list95, (SubLObject)shop_internals.NIL, (SubLObject)shop_internals.$list96);
        methods.subloop_register_instance_method((SubLObject)shop_internals.$sym78$SHOP_STATISTIC_MANAGER, (SubLObject)shop_internals.$sym94$ADD_FI_ASK, (SubLObject)shop_internals.$sym97$SHOP_STATISTIC_MANAGER_ADD_FI_ASK_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)shop_internals.$sym98$ADD_PLAN_STATE_ASK, (SubLObject)shop_internals.$sym78$SHOP_STATISTIC_MANAGER, (SubLObject)shop_internals.$list95, (SubLObject)shop_internals.NIL, (SubLObject)shop_internals.$list99);
        methods.subloop_register_instance_method((SubLObject)shop_internals.$sym78$SHOP_STATISTIC_MANAGER, (SubLObject)shop_internals.$sym98$ADD_PLAN_STATE_ASK, (SubLObject)shop_internals.$sym100$SHOP_STATISTIC_MANAGER_ADD_PLAN_STATE_ASK_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)shop_internals.$sym101$ADD_EXPANSION, (SubLObject)shop_internals.$sym78$SHOP_STATISTIC_MANAGER, (SubLObject)shop_internals.$list95, (SubLObject)shop_internals.NIL, (SubLObject)shop_internals.$list102);
        methods.subloop_register_instance_method((SubLObject)shop_internals.$sym78$SHOP_STATISTIC_MANAGER, (SubLObject)shop_internals.$sym101$ADD_EXPANSION, (SubLObject)shop_internals.$sym103$SHOP_STATISTIC_MANAGER_ADD_EXPANSION_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)shop_internals.$sym104$ADD_INFERENCE, (SubLObject)shop_internals.$sym78$SHOP_STATISTIC_MANAGER, (SubLObject)shop_internals.$list95, (SubLObject)shop_internals.NIL, (SubLObject)shop_internals.$list105);
        methods.subloop_register_instance_method((SubLObject)shop_internals.$sym78$SHOP_STATISTIC_MANAGER, (SubLObject)shop_internals.$sym104$ADD_INFERENCE, (SubLObject)shop_internals.$sym106$SHOP_STATISTIC_MANAGER_ADD_INFERENCE_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)shop_internals.$sym107$ADD_PLAN, (SubLObject)shop_internals.$sym78$SHOP_STATISTIC_MANAGER, (SubLObject)shop_internals.$list95, (SubLObject)shop_internals.$list108, (SubLObject)shop_internals.$list109);
        methods.subloop_register_instance_method((SubLObject)shop_internals.$sym78$SHOP_STATISTIC_MANAGER, (SubLObject)shop_internals.$sym107$ADD_PLAN, (SubLObject)shop_internals.$sym110$SHOP_STATISTIC_MANAGER_ADD_PLAN_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)shop_internals.$sym111$NUMBER_OF_INFERENCES, (SubLObject)shop_internals.$sym78$SHOP_STATISTIC_MANAGER, (SubLObject)shop_internals.$list42, (SubLObject)shop_internals.NIL, (SubLObject)shop_internals.$list112);
        methods.subloop_register_instance_method((SubLObject)shop_internals.$sym78$SHOP_STATISTIC_MANAGER, (SubLObject)shop_internals.$sym111$NUMBER_OF_INFERENCES, (SubLObject)shop_internals.$sym114$SHOP_STATISTIC_MANAGER_NUMBER_OF_INFERENCES_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)shop_internals.$sym115$NUMBER_OF_METHODS, (SubLObject)shop_internals.$sym78$SHOP_STATISTIC_MANAGER, (SubLObject)shop_internals.$list42, (SubLObject)shop_internals.NIL, (SubLObject)shop_internals.$list116);
        methods.subloop_register_instance_method((SubLObject)shop_internals.$sym78$SHOP_STATISTIC_MANAGER, (SubLObject)shop_internals.$sym115$NUMBER_OF_METHODS, (SubLObject)shop_internals.$sym118$SHOP_STATISTIC_MANAGER_NUMBER_OF_METHODS_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)shop_internals.$sym119$NUMBER_OF_EXPANSIONS, (SubLObject)shop_internals.$sym78$SHOP_STATISTIC_MANAGER, (SubLObject)shop_internals.$list42, (SubLObject)shop_internals.NIL, (SubLObject)shop_internals.$list116);
        methods.subloop_register_instance_method((SubLObject)shop_internals.$sym78$SHOP_STATISTIC_MANAGER, (SubLObject)shop_internals.$sym119$NUMBER_OF_EXPANSIONS, (SubLObject)shop_internals.$sym121$SHOP_STATISTIC_MANAGER_NUMBER_OF_EXPANSIONS_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)shop_internals.$sym122$NUMBER_OF_PLANS, (SubLObject)shop_internals.$sym78$SHOP_STATISTIC_MANAGER, (SubLObject)shop_internals.$list42, (SubLObject)shop_internals.NIL, (SubLObject)shop_internals.$list123);
        methods.subloop_register_instance_method((SubLObject)shop_internals.$sym78$SHOP_STATISTIC_MANAGER, (SubLObject)shop_internals.$sym122$NUMBER_OF_PLANS, (SubLObject)shop_internals.$sym125$SHOP_STATISTIC_MANAGER_NUMBER_OF_PLANS_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)shop_internals.$sym126$NUMBER_OF_FI_ASKS, (SubLObject)shop_internals.$sym78$SHOP_STATISTIC_MANAGER, (SubLObject)shop_internals.$list42, (SubLObject)shop_internals.NIL, (SubLObject)shop_internals.$list127);
        methods.subloop_register_instance_method((SubLObject)shop_internals.$sym78$SHOP_STATISTIC_MANAGER, (SubLObject)shop_internals.$sym126$NUMBER_OF_FI_ASKS, (SubLObject)shop_internals.$sym129$SHOP_STATISTIC_MANAGER_NUMBER_OF_FI_ASKS_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)shop_internals.$sym130$NUMBER_OF_PLAN_STATE_ASKS, (SubLObject)shop_internals.$sym78$SHOP_STATISTIC_MANAGER, (SubLObject)shop_internals.$list42, (SubLObject)shop_internals.NIL, (SubLObject)shop_internals.$list131);
        methods.subloop_register_instance_method((SubLObject)shop_internals.$sym78$SHOP_STATISTIC_MANAGER, (SubLObject)shop_internals.$sym130$NUMBER_OF_PLAN_STATE_ASKS, (SubLObject)shop_internals.$sym133$SHOP_STATISTIC_MANAGER_NUMBER_OF_PLAN_STATE_ASKS_METHOD);
        classes.subloop_new_class((SubLObject)shop_internals.$sym134$SHOP_VARIABLE_MANAGER, (SubLObject)shop_internals.$sym11$OBJECT, (SubLObject)shop_internals.NIL, (SubLObject)shop_internals.NIL, (SubLObject)shop_internals.$list135);
        classes.class_set_implements_slot_listeners((SubLObject)shop_internals.$sym134$SHOP_VARIABLE_MANAGER, (SubLObject)shop_internals.NIL);
        classes.subloop_note_class_initialization_function((SubLObject)shop_internals.$sym134$SHOP_VARIABLE_MANAGER, (SubLObject)shop_internals.$sym138$SUBLOOP_RESERVED_INITIALIZE_SHOP_VARIABLE_MANAGER_CLASS);
        classes.subloop_note_instance_initialization_function((SubLObject)shop_internals.$sym134$SHOP_VARIABLE_MANAGER, (SubLObject)shop_internals.$sym140$SUBLOOP_RESERVED_INITIALIZE_SHOP_VARIABLE_MANAGER_INSTANCE);
        subloop_reserved_initialize_shop_variable_manager_class((SubLObject)shop_internals.$sym134$SHOP_VARIABLE_MANAGER);
        methods.methods_incorporate_instance_method((SubLObject)shop_internals.$sym26$INITIALIZE, (SubLObject)shop_internals.$sym134$SHOP_VARIABLE_MANAGER, (SubLObject)shop_internals.$list141, (SubLObject)shop_internals.NIL, (SubLObject)shop_internals.$list142);
        methods.subloop_register_instance_method((SubLObject)shop_internals.$sym134$SHOP_VARIABLE_MANAGER, (SubLObject)shop_internals.$sym26$INITIALIZE, (SubLObject)shop_internals.$sym145$SHOP_VARIABLE_MANAGER_INITIALIZE_METHOD);
        methods.methods_incorporate_class_method((SubLObject)shop_internals.$sym146$GENERATE_VARIABLE, (SubLObject)shop_internals.$sym134$SHOP_VARIABLE_MANAGER, (SubLObject)shop_internals.$list31, (SubLObject)shop_internals.NIL, (SubLObject)shop_internals.$list147);
        methods.subloop_register_class_method((SubLObject)shop_internals.$sym134$SHOP_VARIABLE_MANAGER, (SubLObject)shop_internals.$sym146$GENERATE_VARIABLE, (SubLObject)shop_internals.$sym150$SHOP_VARIABLE_MANAGER_GENERATE_VARIABLE_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)shop_internals.$sym151$GENERATE_BINDING_PAIR, (SubLObject)shop_internals.$sym134$SHOP_VARIABLE_MANAGER, (SubLObject)shop_internals.$list42, (SubLObject)shop_internals.$list152, (SubLObject)shop_internals.$list153);
        methods.subloop_register_instance_method((SubLObject)shop_internals.$sym134$SHOP_VARIABLE_MANAGER, (SubLObject)shop_internals.$sym151$GENERATE_BINDING_PAIR, (SubLObject)shop_internals.$sym155$SHOP_VARIABLE_MANAGER_GENERATE_BINDING_PAIR_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)shop_internals.$sym156$GENERATE_BINDING_LIST, (SubLObject)shop_internals.$sym134$SHOP_VARIABLE_MANAGER, (SubLObject)shop_internals.$list42, (SubLObject)shop_internals.$list157, (SubLObject)shop_internals.$list158);
        methods.subloop_register_instance_method((SubLObject)shop_internals.$sym134$SHOP_VARIABLE_MANAGER, (SubLObject)shop_internals.$sym156$GENERATE_BINDING_LIST, (SubLObject)shop_internals.$sym159$SHOP_VARIABLE_MANAGER_GENERATE_BINDING_LIST_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)shop_internals.$sym160$RECOVER_EL_VARIABLE, (SubLObject)shop_internals.$sym134$SHOP_VARIABLE_MANAGER, (SubLObject)shop_internals.$list42, (SubLObject)shop_internals.$list161, (SubLObject)shop_internals.$list162);
        methods.subloop_register_instance_method((SubLObject)shop_internals.$sym134$SHOP_VARIABLE_MANAGER, (SubLObject)shop_internals.$sym160$RECOVER_EL_VARIABLE, (SubLObject)shop_internals.$sym166$SHOP_VARIABLE_MANAGER_RECOVER_EL_VARIABLE_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)shop_internals.$sym167$GATHER_EL_VARIABLES, (SubLObject)shop_internals.$sym134$SHOP_VARIABLE_MANAGER, (SubLObject)shop_internals.$list42, (SubLObject)shop_internals.$list168, (SubLObject)shop_internals.$list169);
        methods.subloop_register_instance_method((SubLObject)shop_internals.$sym134$SHOP_VARIABLE_MANAGER, (SubLObject)shop_internals.$sym167$GATHER_EL_VARIABLES, (SubLObject)shop_internals.$sym171$SHOP_VARIABLE_MANAGER_GATHER_EL_VARIABLES_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)shop_internals.$sym172$MANAGED_VARIABLE_, (SubLObject)shop_internals.$sym134$SHOP_VARIABLE_MANAGER, (SubLObject)shop_internals.$list31, (SubLObject)shop_internals.$list173, (SubLObject)shop_internals.$list174);
        methods.subloop_register_instance_method((SubLObject)shop_internals.$sym134$SHOP_VARIABLE_MANAGER, (SubLObject)shop_internals.$sym172$MANAGED_VARIABLE_, (SubLObject)shop_internals.$sym176$SHOP_VARIABLE_MANAGER_MANAGED_VARIABLE__METHOD);
        methods.methods_incorporate_class_method((SubLObject)shop_internals.$sym177$GENERATED_VARIABLE_, (SubLObject)shop_internals.$sym134$SHOP_VARIABLE_MANAGER, (SubLObject)shop_internals.$list42, (SubLObject)shop_internals.$list173, (SubLObject)shop_internals.$list178);
        methods.subloop_register_class_method((SubLObject)shop_internals.$sym134$SHOP_VARIABLE_MANAGER, (SubLObject)shop_internals.$sym177$GENERATED_VARIABLE_, (SubLObject)shop_internals.$sym181$SHOP_VARIABLE_MANAGER_GENERATED_VARIABLE__METHOD);
        methods.methods_incorporate_class_method((SubLObject)shop_internals.$sym182$GENERATED_VARIABLES_BOUND, (SubLObject)shop_internals.$sym134$SHOP_VARIABLE_MANAGER, (SubLObject)shop_internals.$list42, (SubLObject)shop_internals.$list183, (SubLObject)shop_internals.$list184);
        methods.subloop_register_class_method((SubLObject)shop_internals.$sym134$SHOP_VARIABLE_MANAGER, (SubLObject)shop_internals.$sym182$GENERATED_VARIABLES_BOUND, (SubLObject)shop_internals.$sym185$SHOP_VARIABLE_MANAGER_GENERATED_VARIABLES_BOUND_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)shop_internals.$sym186$REPLACE_VARIABLES, (SubLObject)shop_internals.$sym134$SHOP_VARIABLE_MANAGER, (SubLObject)shop_internals.$list42, (SubLObject)shop_internals.$list168, (SubLObject)shop_internals.$list187);
        methods.subloop_register_instance_method((SubLObject)shop_internals.$sym134$SHOP_VARIABLE_MANAGER, (SubLObject)shop_internals.$sym186$REPLACE_VARIABLES, (SubLObject)shop_internals.$sym188$SHOP_VARIABLE_MANAGER_REPLACE_VARIABLES_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)shop_internals.$sym189$RECOVER_EL, (SubLObject)shop_internals.$sym134$SHOP_VARIABLE_MANAGER, (SubLObject)shop_internals.$list42, (SubLObject)shop_internals.$list190, (SubLObject)shop_internals.$list191);
        methods.subloop_register_instance_method((SubLObject)shop_internals.$sym134$SHOP_VARIABLE_MANAGER, (SubLObject)shop_internals.$sym189$RECOVER_EL, (SubLObject)shop_internals.$sym192$SHOP_VARIABLE_MANAGER_RECOVER_EL_METHOD);
        return (SubLObject)shop_internals.NIL;
    }
    
    public void declareFunctions() {
        declare_shop_internals_file();
    }
    
    public void initializeVariables() {
        init_shop_internals_file();
    }
    
    public void runTopLevelForms() {
        setup_shop_internals_file();
    }
    
    static {
        me = (SubLFile)new shop_internals();
        shop_internals.$shop_verbose_keys$ = null;
        shop_internals.$shop_gc$ = null;
        shop_internals.$shop_verbose_target$ = null;
        $list0 = ConsesLow.list(new SubLObject[] { ConsesLow.cons((SubLObject)SubLObjectFactory.makeKeyword("CUTOFFS"), (SubLObject)shop_internals.ONE_INTEGER), ConsesLow.cons((SubLObject)SubLObjectFactory.makeKeyword("TASKS"), (SubLObject)shop_internals.TWO_INTEGER), ConsesLow.cons((SubLObject)SubLObjectFactory.makeKeyword("OPERATORS"), (SubLObject)shop_internals.THREE_INTEGER), ConsesLow.cons((SubLObject)SubLObjectFactory.makeKeyword("STATES"), (SubLObject)shop_internals.FOUR_INTEGER), ConsesLow.cons((SubLObject)SubLObjectFactory.makeKeyword("METHODS"), (SubLObject)shop_internals.FIVE_INTEGER), ConsesLow.cons((SubLObject)SubLObjectFactory.makeKeyword("PLANNER-RULES"), (SubLObject)SubLObjectFactory.makeDouble(5.5)), ConsesLow.cons((SubLObject)SubLObjectFactory.makeKeyword("MBIND-CUTOFFS"), (SubLObject)shop_internals.SIX_INTEGER), ConsesLow.cons((SubLObject)SubLObjectFactory.makeKeyword("GOALS"), (SubLObject)shop_internals.SEVEN_INTEGER), ConsesLow.cons((SubLObject)SubLObjectFactory.makeKeyword("CYC-QUERY"), (SubLObject)shop_internals.EIGHT_INTEGER), ConsesLow.cons((SubLObject)SubLObjectFactory.makeKeyword("ALL"), (SubLObject)shop_internals.NINE_INTEGER) });
        $kw1$STDOUT = SubLObjectFactory.makeKeyword("STDOUT");
        $list2 = ConsesLow.list((SubLObject)ConsesLow.cons((SubLObject)shop_internals.T, (SubLObject)shop_internals.T));
        $list3 = ConsesLow.list((SubLObject)shop_internals.NIL);
        $list4 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("OBJECT"), (SubLObject)SubLObjectFactory.makeSymbol("SLOT"));
        $sym5$SET_SLOT = SubLObjectFactory.makeSymbol("SET-SLOT");
        $sym6$1_ = SubLObjectFactory.makeSymbol("1+");
        $sym7$GET_SLOT = SubLObjectFactory.makeSymbol("GET-SLOT");
        $sym8$PROCESS_TIMER = SubLObjectFactory.makeSymbol("PROCESS-TIMER");
        $list9 = ConsesLow.list(new SubLObject[] { ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("START-TIMING"), (SubLObject)shop_internals.NIL, (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("RESET-TIMING"), (SubLObject)shop_internals.NIL, (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("STOP-TIMING"), (SubLObject)shop_internals.NIL, (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("RESUME-TIMING"), (SubLObject)shop_internals.NIL, (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("ELAPSED-REAL-TIME"), (SubLObject)shop_internals.NIL, (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("ELAPSED-RUN-TIME"), (SubLObject)shop_internals.NIL, (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("ELAPSED-REAL-TIME-SINCE-LAST-CALL"), (SubLObject)shop_internals.NIL, (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("ELAPSED-RUN-TIME-SINCE-LAST-CALL"), (SubLObject)shop_internals.NIL, (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("IS-TIMING?"), (SubLObject)shop_internals.NIL, (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")) });
        $sym10$STATISTIC_MANAGER = SubLObjectFactory.makeSymbol("STATISTIC-MANAGER");
        $sym11$OBJECT = SubLObjectFactory.makeSymbol("OBJECT");
        $list12 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PROCESS-TIMER"));
        $list13 = ConsesLow.list(new SubLObject[] { ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TIMING?"), (SubLObject)SubLObjectFactory.makeKeyword("INSTANCE"), (SubLObject)SubLObjectFactory.makeKeyword("PROTECTED")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("START-RUN-TIME"), (SubLObject)SubLObjectFactory.makeKeyword("INSTANCE"), (SubLObject)SubLObjectFactory.makeKeyword("PROTECTED")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("START-REAL-TIME"), (SubLObject)SubLObjectFactory.makeKeyword("INSTANCE"), (SubLObject)SubLObjectFactory.makeKeyword("PROTECTED")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("END-RUN-TIME"), (SubLObject)SubLObjectFactory.makeKeyword("INSTANCE"), (SubLObject)SubLObjectFactory.makeKeyword("PROTECTED")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("END-REAL-TIME"), (SubLObject)SubLObjectFactory.makeKeyword("INSTANCE"), (SubLObject)SubLObjectFactory.makeKeyword("PROTECTED")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("LAST-CALL-RUN-TIME"), (SubLObject)SubLObjectFactory.makeKeyword("INSTANCE"), (SubLObject)SubLObjectFactory.makeKeyword("PROTECTED")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("LAST-CALL-REAL-TIME"), (SubLObject)SubLObjectFactory.makeKeyword("INSTANCE"), (SubLObject)SubLObjectFactory.makeKeyword("PROTECTED")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("RESET-LAST-CALL-TIME"), (SubLObject)shop_internals.NIL, (SubLObject)SubLObjectFactory.makeKeyword("PRIVATE")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("GET-RUN-TIME"), (SubLObject)shop_internals.NIL, (SubLObject)SubLObjectFactory.makeKeyword("PRIVATE")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("GET-REAL-TIME"), (SubLObject)shop_internals.NIL, (SubLObject)SubLObjectFactory.makeKeyword("PRIVATE")) });
        $sym14$LAST_CALL_REAL_TIME = SubLObjectFactory.makeSymbol("LAST-CALL-REAL-TIME");
        $sym15$LAST_CALL_RUN_TIME = SubLObjectFactory.makeSymbol("LAST-CALL-RUN-TIME");
        $sym16$END_REAL_TIME = SubLObjectFactory.makeSymbol("END-REAL-TIME");
        $sym17$END_RUN_TIME = SubLObjectFactory.makeSymbol("END-RUN-TIME");
        $sym18$START_REAL_TIME = SubLObjectFactory.makeSymbol("START-REAL-TIME");
        $sym19$START_RUN_TIME = SubLObjectFactory.makeSymbol("START-RUN-TIME");
        $sym20$TIMING_ = SubLObjectFactory.makeSymbol("TIMING?");
        $sym21$INSTANCE_COUNT = SubLObjectFactory.makeSymbol("INSTANCE-COUNT");
        $sym22$SUBLOOP_RESERVED_INITIALIZE_STATISTIC_MANAGER_CLASS = SubLObjectFactory.makeSymbol("SUBLOOP-RESERVED-INITIALIZE-STATISTIC-MANAGER-CLASS");
        $sym23$ISOLATED_P = SubLObjectFactory.makeSymbol("ISOLATED-P");
        $sym24$INSTANCE_NUMBER = SubLObjectFactory.makeSymbol("INSTANCE-NUMBER");
        $sym25$SUBLOOP_RESERVED_INITIALIZE_STATISTIC_MANAGER_INSTANCE = SubLObjectFactory.makeSymbol("SUBLOOP-RESERVED-INITIALIZE-STATISTIC-MANAGER-INSTANCE");
        $sym26$INITIALIZE = SubLObjectFactory.makeSymbol("INITIALIZE");
        $list27 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("PROTECTED"));
        $list28 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("INITIALIZE"), (SubLObject)SubLObjectFactory.makeSymbol("SUPER")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RESET-TIMING"), (SubLObject)SubLObjectFactory.makeSymbol("SELF")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("SELF")));
        $sym29$STATISTIC_MANAGER_INITIALIZE_METHOD = SubLObjectFactory.makeSymbol("STATISTIC-MANAGER-INITIALIZE-METHOD");
        $sym30$GET_RUN_TIME = SubLObjectFactory.makeSymbol("GET-RUN-TIME");
        $list31 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("PRIVATE"));
        $list32 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("GET-INTERNAL-RUN-TIME"))));
        $sym33$STATISTIC_MANAGER_GET_RUN_TIME_METHOD = SubLObjectFactory.makeSymbol("STATISTIC-MANAGER-GET-RUN-TIME-METHOD");
        $sym34$GET_REAL_TIME = SubLObjectFactory.makeSymbol("GET-REAL-TIME");
        $list35 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("GET-INTERNAL-REAL-TIME"))));
        $sym36$STATISTIC_MANAGER_GET_REAL_TIME_METHOD = SubLObjectFactory.makeSymbol("STATISTIC-MANAGER-GET-REAL-TIME-METHOD");
        $sym37$RESET_LAST_CALL_TIME = SubLObjectFactory.makeSymbol("RESET-LAST-CALL-TIME");
        $list38 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("LAST-CALL-RUN-TIME"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("GET-RUN-TIME"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("LAST-CALL-REAL-TIME"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("GET-REAL-TIME"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)shop_internals.NIL));
        $sym39$OUTER_CATCH_FOR_STATISTIC_MANAGER_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-STATISTIC-MANAGER-METHOD");
        $sym40$STATISTIC_MANAGER_RESET_LAST_CALL_TIME_METHOD = SubLObjectFactory.makeSymbol("STATISTIC-MANAGER-RESET-LAST-CALL-TIME-METHOD");
        $sym41$START_TIMING = SubLObjectFactory.makeSymbol("START-TIMING");
        $list42 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("PUBLIC"));
        $list43 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("START-RUN-TIME"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("GET-RUN-TIME"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("START-REAL-TIME"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("GET-REAL-TIME"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RESET-LAST-CALL-TIME"), (SubLObject)SubLObjectFactory.makeSymbol("SELF")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("TIMING?"), (SubLObject)shop_internals.T), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)shop_internals.NIL));
        $sym44$OUTER_CATCH_FOR_STATISTIC_MANAGER_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-STATISTIC-MANAGER-METHOD");
        $sym45$STATISTIC_MANAGER_START_TIMING_METHOD = SubLObjectFactory.makeSymbol("STATISTIC-MANAGER-START-TIMING-METHOD");
        $sym46$RESUME_TIMING = SubLObjectFactory.makeSymbol("RESUME-TIMING");
        $list47 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RESET-LAST-CALL-TIME"), (SubLObject)SubLObjectFactory.makeSymbol("SELF")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("TIMING?"), (SubLObject)shop_internals.T), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)shop_internals.NIL));
        $sym48$OUTER_CATCH_FOR_STATISTIC_MANAGER_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-STATISTIC-MANAGER-METHOD");
        $sym49$STATISTIC_MANAGER_RESUME_TIMING_METHOD = SubLObjectFactory.makeSymbol("STATISTIC-MANAGER-RESUME-TIMING-METHOD");
        $sym50$STOP_TIMING = SubLObjectFactory.makeSymbol("STOP-TIMING");
        $list51 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("END-RUN-TIME"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("GET-RUN-TIME"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("END-REAL-TIME"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("GET-REAL-TIME"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("TIMING?"), (SubLObject)shop_internals.NIL), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)shop_internals.NIL));
        $sym52$OUTER_CATCH_FOR_STATISTIC_MANAGER_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-STATISTIC-MANAGER-METHOD");
        $sym53$STATISTIC_MANAGER_STOP_TIMING_METHOD = SubLObjectFactory.makeSymbol("STATISTIC-MANAGER-STOP-TIMING-METHOD");
        $sym54$IS_TIMING_ = SubLObjectFactory.makeSymbol("IS-TIMING?");
        $list55 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("TIMING?")));
        $sym56$OUTER_CATCH_FOR_STATISTIC_MANAGER_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-STATISTIC-MANAGER-METHOD");
        $sym57$STATISTIC_MANAGER_IS_TIMING__METHOD = SubLObjectFactory.makeSymbol("STATISTIC-MANAGER-IS-TIMING?-METHOD");
        $sym58$ELAPSED_REAL_TIME = SubLObjectFactory.makeSymbol("ELAPSED-REAL-TIME");
        $list59 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PIF"), (SubLObject)SubLObjectFactory.makeSymbol("TIMING?"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("-"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("GET-REAL-TIME"), (SubLObject)SubLObjectFactory.makeSymbol("SELF")), (SubLObject)SubLObjectFactory.makeSymbol("START-REAL-TIME"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("-"), (SubLObject)SubLObjectFactory.makeSymbol("END-REAL-TIME"), (SubLObject)SubLObjectFactory.makeSymbol("START-REAL-TIME")))));
        $sym60$OUTER_CATCH_FOR_STATISTIC_MANAGER_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-STATISTIC-MANAGER-METHOD");
        $sym61$STATISTIC_MANAGER_ELAPSED_REAL_TIME_METHOD = SubLObjectFactory.makeSymbol("STATISTIC-MANAGER-ELAPSED-REAL-TIME-METHOD");
        $sym62$ELAPSED_RUN_TIME = SubLObjectFactory.makeSymbol("ELAPSED-RUN-TIME");
        $list63 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PIF"), (SubLObject)SubLObjectFactory.makeSymbol("TIMING?"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("-"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("GET-RUN-TIME"), (SubLObject)SubLObjectFactory.makeSymbol("SELF")), (SubLObject)SubLObjectFactory.makeSymbol("START-RUN-TIME"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("-"), (SubLObject)SubLObjectFactory.makeSymbol("END-RUN-TIME"), (SubLObject)SubLObjectFactory.makeSymbol("START-RUN-TIME")))));
        $sym64$OUTER_CATCH_FOR_STATISTIC_MANAGER_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-STATISTIC-MANAGER-METHOD");
        $sym65$STATISTIC_MANAGER_ELAPSED_RUN_TIME_METHOD = SubLObjectFactory.makeSymbol("STATISTIC-MANAGER-ELAPSED-RUN-TIME-METHOD");
        $sym66$RESET_TIMING = SubLObjectFactory.makeSymbol("RESET-TIMING");
        $list67 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("TIMING?"), (SubLObject)shop_internals.NIL), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("START-REAL-TIME"), (SubLObject)shop_internals.ZERO_INTEGER), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("END-REAL-TIME"), (SubLObject)shop_internals.ZERO_INTEGER), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("START-RUN-TIME"), (SubLObject)shop_internals.ZERO_INTEGER), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("END-RUN-TIME"), (SubLObject)shop_internals.ZERO_INTEGER), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("LAST-CALL-RUN-TIME"), (SubLObject)shop_internals.ZERO_INTEGER), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("LAST-CALL-REAL-TIME"), (SubLObject)shop_internals.ZERO_INTEGER), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)shop_internals.NIL));
        $sym68$OUTER_CATCH_FOR_STATISTIC_MANAGER_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-STATISTIC-MANAGER-METHOD");
        $sym69$STATISTIC_MANAGER_RESET_TIMING_METHOD = SubLObjectFactory.makeSymbol("STATISTIC-MANAGER-RESET-TIMING-METHOD");
        $sym70$ELAPSED_REAL_TIME_SINCE_LAST_CALL = SubLObjectFactory.makeSymbol("ELAPSED-REAL-TIME-SINCE-LAST-CALL");
        $list71 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PIF"), (SubLObject)SubLObjectFactory.makeSymbol("TIMING?"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ELAPSED-TIME"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("-"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("GET-REAL-TIME"), (SubLObject)SubLObjectFactory.makeSymbol("SELF")), (SubLObject)SubLObjectFactory.makeSymbol("LAST-CALL-REAL-TIME")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RESET-LAST-CALL-TIME"), (SubLObject)SubLObjectFactory.makeSymbol("SELF")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("ELAPSED-TIME"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ELAPSED-TIME"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("-"), (SubLObject)SubLObjectFactory.makeSymbol("END-REAL-TIME"), (SubLObject)SubLObjectFactory.makeSymbol("LAST-CALL-REAL-TIME")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("ELAPSED-TIME")))));
        $sym72$OUTER_CATCH_FOR_STATISTIC_MANAGER_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-STATISTIC-MANAGER-METHOD");
        $sym73$STATISTIC_MANAGER_ELAPSED_REAL_TIME_SINCE_LAST_CALL_METHOD = SubLObjectFactory.makeSymbol("STATISTIC-MANAGER-ELAPSED-REAL-TIME-SINCE-LAST-CALL-METHOD");
        $sym74$ELAPSED_RUN_TIME_SINCE_LAST_CALL = SubLObjectFactory.makeSymbol("ELAPSED-RUN-TIME-SINCE-LAST-CALL");
        $list75 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PIF"), (SubLObject)SubLObjectFactory.makeSymbol("TIMING?"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ELAPSED-TIME"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("-"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("GET-RUN-TIME"), (SubLObject)SubLObjectFactory.makeSymbol("SELF")), (SubLObject)SubLObjectFactory.makeSymbol("LAST-CALL-RUN-TIME")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RESET-LAST-CALL-TIME"), (SubLObject)SubLObjectFactory.makeSymbol("SELF")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("ELAPSED-TIME"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ELAPSED-TIME"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("-"), (SubLObject)SubLObjectFactory.makeSymbol("END-RUN-TIME"), (SubLObject)SubLObjectFactory.makeSymbol("LAST-CALL-RUN-TIME")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("ELAPSED-TIME")))));
        $sym76$OUTER_CATCH_FOR_STATISTIC_MANAGER_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-STATISTIC-MANAGER-METHOD");
        $sym77$STATISTIC_MANAGER_ELAPSED_RUN_TIME_SINCE_LAST_CALL_METHOD = SubLObjectFactory.makeSymbol("STATISTIC-MANAGER-ELAPSED-RUN-TIME-SINCE-LAST-CALL-METHOD");
        $sym78$SHOP_STATISTIC_MANAGER = SubLObjectFactory.makeSymbol("SHOP-STATISTIC-MANAGER");
        $list79 = ConsesLow.list(new SubLObject[] { ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("METHOD-COUNTER"), (SubLObject)SubLObjectFactory.makeKeyword("INSTANCE"), (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("INFERENCE-COUNTER"), (SubLObject)SubLObjectFactory.makeKeyword("INSTANCE"), (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FI-ASK-COUNTER"), (SubLObject)SubLObjectFactory.makeKeyword("INSTANCE"), (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PLAN-STATE-ASK-COUNTER"), (SubLObject)SubLObjectFactory.makeKeyword("INSTANCE"), (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PLAN-COUNTER"), (SubLObject)SubLObjectFactory.makeKeyword("INSTANCE"), (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PLANS"), (SubLObject)SubLObjectFactory.makeKeyword("INSTANCE"), (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("INITIALIZE"), (SubLObject)shop_internals.NIL, (SubLObject)SubLObjectFactory.makeKeyword("PROTECTED")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("RESET-COUNTERS"), (SubLObject)shop_internals.NIL, (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("ADD-EXPANSION"), (SubLObject)shop_internals.NIL, (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("ADD-INFERENCE"), (SubLObject)shop_internals.NIL, (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("ADD-PLAN"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PLAN")), (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("NUMBER-OF-INFERENCES"), (SubLObject)shop_internals.NIL, (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("NUMBER-OF-EXPANSIONS"), (SubLObject)shop_internals.NIL, (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("NUMBER-OF-PLANS"), (SubLObject)shop_internals.NIL, (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")) });
        $sym80$SUBLOOP_RESERVED_INITIALIZE_SHOP_STATISTIC_MANAGER_CLASS = SubLObjectFactory.makeSymbol("SUBLOOP-RESERVED-INITIALIZE-SHOP-STATISTIC-MANAGER-CLASS");
        $sym81$METHOD_COUNTER = SubLObjectFactory.makeSymbol("METHOD-COUNTER");
        $sym82$INFERENCE_COUNTER = SubLObjectFactory.makeSymbol("INFERENCE-COUNTER");
        $sym83$FI_ASK_COUNTER = SubLObjectFactory.makeSymbol("FI-ASK-COUNTER");
        $sym84$PLAN_STATE_ASK_COUNTER = SubLObjectFactory.makeSymbol("PLAN-STATE-ASK-COUNTER");
        $sym85$PLAN_COUNTER = SubLObjectFactory.makeSymbol("PLAN-COUNTER");
        $sym86$PLANS = SubLObjectFactory.makeSymbol("PLANS");
        $sym87$SUBLOOP_RESERVED_INITIALIZE_SHOP_STATISTIC_MANAGER_INSTANCE = SubLObjectFactory.makeSymbol("SUBLOOP-RESERVED-INITIALIZE-SHOP-STATISTIC-MANAGER-INSTANCE");
        $list88 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("INITIALIZE"), (SubLObject)SubLObjectFactory.makeSymbol("SUPER")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RESET-COUNTERS"), (SubLObject)SubLObjectFactory.makeSymbol("SELF")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("SELF")));
        $sym89$SHOP_STATISTIC_MANAGER_INITIALIZE_METHOD = SubLObjectFactory.makeSymbol("SHOP-STATISTIC-MANAGER-INITIALIZE-METHOD");
        $sym90$RESET_COUNTERS = SubLObjectFactory.makeSymbol("RESET-COUNTERS");
        $list91 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("METHOD-COUNTER"), (SubLObject)shop_internals.ZERO_INTEGER), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("INFERENCE-COUNTER"), (SubLObject)shop_internals.ZERO_INTEGER), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("FI-ASK-COUNTER"), (SubLObject)shop_internals.ZERO_INTEGER), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("PLAN-STATE-ASK-COUNTER"), (SubLObject)shop_internals.ZERO_INTEGER), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("PLAN-COUNTER"), (SubLObject)shop_internals.ZERO_INTEGER), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("PLANS"), (SubLObject)shop_internals.NIL), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)shop_internals.NIL));
        $sym92$OUTER_CATCH_FOR_SHOP_STATISTIC_MANAGER_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-SHOP-STATISTIC-MANAGER-METHOD");
        $sym93$SHOP_STATISTIC_MANAGER_RESET_COUNTERS_METHOD = SubLObjectFactory.makeSymbol("SHOP-STATISTIC-MANAGER-RESET-COUNTERS-METHOD");
        $sym94$ADD_FI_ASK = SubLObjectFactory.makeSymbol("ADD-FI-ASK");
        $list95 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("NO-MEMBER-VARIABLES"), (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC"));
        $list96 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SET-SLOT"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("FI-ASK-COUNTER")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("+"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("GET-SLOT"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("FI-ASK-COUNTER"))), (SubLObject)shop_internals.ONE_INTEGER))));
        $sym97$SHOP_STATISTIC_MANAGER_ADD_FI_ASK_METHOD = SubLObjectFactory.makeSymbol("SHOP-STATISTIC-MANAGER-ADD-FI-ASK-METHOD");
        $sym98$ADD_PLAN_STATE_ASK = SubLObjectFactory.makeSymbol("ADD-PLAN-STATE-ASK");
        $list99 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SET-SLOT"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("PLAN-STATE-ASK-COUNTER")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("+"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("GET-SLOT"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("PLAN-STATE-ASK-COUNTER"))), (SubLObject)shop_internals.ONE_INTEGER))));
        $sym100$SHOP_STATISTIC_MANAGER_ADD_PLAN_STATE_ASK_METHOD = SubLObjectFactory.makeSymbol("SHOP-STATISTIC-MANAGER-ADD-PLAN-STATE-ASK-METHOD");
        $sym101$ADD_EXPANSION = SubLObjectFactory.makeSymbol("ADD-EXPANSION");
        $list102 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SET-SLOT"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("METHOD-COUNTER")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("+"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("GET-SLOT"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("METHOD-COUNTER"))), (SubLObject)shop_internals.ONE_INTEGER))));
        $sym103$SHOP_STATISTIC_MANAGER_ADD_EXPANSION_METHOD = SubLObjectFactory.makeSymbol("SHOP-STATISTIC-MANAGER-ADD-EXPANSION-METHOD");
        $sym104$ADD_INFERENCE = SubLObjectFactory.makeSymbol("ADD-INFERENCE");
        $list105 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SET-SLOT"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("INFERENCE-COUNTER")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("+"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("GET-SLOT"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("INFERENCE-COUNTER"))), (SubLObject)shop_internals.ONE_INTEGER))));
        $sym106$SHOP_STATISTIC_MANAGER_ADD_INFERENCE_METHOD = SubLObjectFactory.makeSymbol("SHOP-STATISTIC-MANAGER-ADD-INFERENCE-METHOD");
        $sym107$ADD_PLAN = SubLObjectFactory.makeSymbol("ADD-PLAN");
        $list108 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PLAN"));
        $list109 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SET-SLOT"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("PLANS")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CONS"), (SubLObject)SubLObjectFactory.makeSymbol("PLAN"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("GET-SLOT"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("PLANS"))))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SET-SLOT"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("PLAN-COUNTER")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("+"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("GET-SLOT"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("PLAN-COUNTER"))), (SubLObject)shop_internals.ONE_INTEGER))));
        $sym110$SHOP_STATISTIC_MANAGER_ADD_PLAN_METHOD = SubLObjectFactory.makeSymbol("SHOP-STATISTIC-MANAGER-ADD-PLAN-METHOD");
        $sym111$NUMBER_OF_INFERENCES = SubLObjectFactory.makeSymbol("NUMBER-OF-INFERENCES");
        $list112 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("INFERENCE-COUNTER")));
        $sym113$OUTER_CATCH_FOR_SHOP_STATISTIC_MANAGER_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-SHOP-STATISTIC-MANAGER-METHOD");
        $sym114$SHOP_STATISTIC_MANAGER_NUMBER_OF_INFERENCES_METHOD = SubLObjectFactory.makeSymbol("SHOP-STATISTIC-MANAGER-NUMBER-OF-INFERENCES-METHOD");
        $sym115$NUMBER_OF_METHODS = SubLObjectFactory.makeSymbol("NUMBER-OF-METHODS");
        $list116 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("METHOD-COUNTER")));
        $sym117$OUTER_CATCH_FOR_SHOP_STATISTIC_MANAGER_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-SHOP-STATISTIC-MANAGER-METHOD");
        $sym118$SHOP_STATISTIC_MANAGER_NUMBER_OF_METHODS_METHOD = SubLObjectFactory.makeSymbol("SHOP-STATISTIC-MANAGER-NUMBER-OF-METHODS-METHOD");
        $sym119$NUMBER_OF_EXPANSIONS = SubLObjectFactory.makeSymbol("NUMBER-OF-EXPANSIONS");
        $sym120$OUTER_CATCH_FOR_SHOP_STATISTIC_MANAGER_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-SHOP-STATISTIC-MANAGER-METHOD");
        $sym121$SHOP_STATISTIC_MANAGER_NUMBER_OF_EXPANSIONS_METHOD = SubLObjectFactory.makeSymbol("SHOP-STATISTIC-MANAGER-NUMBER-OF-EXPANSIONS-METHOD");
        $sym122$NUMBER_OF_PLANS = SubLObjectFactory.makeSymbol("NUMBER-OF-PLANS");
        $list123 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("PLAN-COUNTER")));
        $sym124$OUTER_CATCH_FOR_SHOP_STATISTIC_MANAGER_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-SHOP-STATISTIC-MANAGER-METHOD");
        $sym125$SHOP_STATISTIC_MANAGER_NUMBER_OF_PLANS_METHOD = SubLObjectFactory.makeSymbol("SHOP-STATISTIC-MANAGER-NUMBER-OF-PLANS-METHOD");
        $sym126$NUMBER_OF_FI_ASKS = SubLObjectFactory.makeSymbol("NUMBER-OF-FI-ASKS");
        $list127 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("FI-ASK-COUNTER")));
        $sym128$OUTER_CATCH_FOR_SHOP_STATISTIC_MANAGER_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-SHOP-STATISTIC-MANAGER-METHOD");
        $sym129$SHOP_STATISTIC_MANAGER_NUMBER_OF_FI_ASKS_METHOD = SubLObjectFactory.makeSymbol("SHOP-STATISTIC-MANAGER-NUMBER-OF-FI-ASKS-METHOD");
        $sym130$NUMBER_OF_PLAN_STATE_ASKS = SubLObjectFactory.makeSymbol("NUMBER-OF-PLAN-STATE-ASKS");
        $list131 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("PLAN-STATE-ASK-COUNTER")));
        $sym132$OUTER_CATCH_FOR_SHOP_STATISTIC_MANAGER_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-SHOP-STATISTIC-MANAGER-METHOD");
        $sym133$SHOP_STATISTIC_MANAGER_NUMBER_OF_PLAN_STATE_ASKS_METHOD = SubLObjectFactory.makeSymbol("SHOP-STATISTIC-MANAGER-NUMBER-OF-PLAN-STATE-ASKS-METHOD");
        $sym134$SHOP_VARIABLE_MANAGER = SubLObjectFactory.makeSymbol("SHOP-VARIABLE-MANAGER");
        $list135 = ConsesLow.list(new SubLObject[] { ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("VARIABLE-ASSOC-TABLE"), (SubLObject)SubLObjectFactory.makeKeyword("INSTANCE"), (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("VARIABLE-COUNTER"), (SubLObject)SubLObjectFactory.makeKeyword("CLASS"), (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("VARIABLE-PREFIX"), (SubLObject)SubLObjectFactory.makeKeyword("CLASS"), (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("INITIALIZE"), (SubLObject)shop_internals.NIL, (SubLObject)SubLObjectFactory.makeKeyword("PROTECTED")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-CLASS-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("GENERATE-VARIABLE"), (SubLObject)shop_internals.NIL, (SubLObject)SubLObjectFactory.makeKeyword("PRIVATE")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-CLASS-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("GENERATED-VARIABLE?"), (SubLObject)shop_internals.NIL, (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("GENERATE-BINDING-PAIR"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("OLD-VAR")), (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("RECOVER-EL-VARIABLE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("HL-VAR")), (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("GATHER-EL-VARIABLES"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FORM"), (SubLObject)SubLObjectFactory.makeSymbol("MBINDING")), (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("MANAGED-VARIABLE?"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("VAR")), (SubLObject)SubLObjectFactory.makeKeyword("PRIVATE")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("REPLACE-VARIABLES"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FORM"), (SubLObject)SubLObjectFactory.makeSymbol("MBINDING")), (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")) });
        $sym136$VARIABLE_COUNTER = SubLObjectFactory.makeSymbol("VARIABLE-COUNTER");
        $sym137$VARIABLE_PREFIX = SubLObjectFactory.makeSymbol("VARIABLE-PREFIX");
        $sym138$SUBLOOP_RESERVED_INITIALIZE_SHOP_VARIABLE_MANAGER_CLASS = SubLObjectFactory.makeSymbol("SUBLOOP-RESERVED-INITIALIZE-SHOP-VARIABLE-MANAGER-CLASS");
        $sym139$VARIABLE_ASSOC_TABLE = SubLObjectFactory.makeSymbol("VARIABLE-ASSOC-TABLE");
        $sym140$SUBLOOP_RESERVED_INITIALIZE_SHOP_VARIABLE_MANAGER_INSTANCE = SubLObjectFactory.makeSymbol("SUBLOOP-RESERVED-INITIALIZE-SHOP-VARIABLE-MANAGER-INSTANCE");
        $list141 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("PROTECTED"), (SubLObject)SubLObjectFactory.makeKeyword("NO-MEMBER-VARIABLES"));
        $list142 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("INITIALIZE"), (SubLObject)SubLObjectFactory.makeSymbol("SUPER")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SET-SLOT"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("VARIABLE-PREFIX")), (SubLObject)SubLObjectFactory.makeString("?PV-")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PWHEN"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NULL"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("GET-SLOT"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("VARIABLE-ASSOC-TABLE")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SET-SLOT"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("VARIABLE-COUNTER")), (SubLObject)shop_internals.ZERO_INTEGER), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SET-SLOT"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("VARIABLE-ASSOC-TABLE")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("MAKE-HASH-TABLE"), (SubLObject)SubLObjectFactory.makeInteger(100)))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("SELF")));
        $str143$_PV_ = SubLObjectFactory.makeString("?PV-");
        $int144$100 = SubLObjectFactory.makeInteger(100);
        $sym145$SHOP_VARIABLE_MANAGER_INITIALIZE_METHOD = SubLObjectFactory.makeSymbol("SHOP-VARIABLE-MANAGER-INITIALIZE-METHOD");
        $sym146$GENERATE_VARIABLE = SubLObjectFactory.makeSymbol("GENERATE-VARIABLE");
        $list147 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("@return shop-variablep; a previously unused variable"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("VAR-NAME"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CCONCATENATE"), (SubLObject)SubLObjectFactory.makeSymbol("VARIABLE-PREFIX"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("WRITE-TO-STRING"), (SubLObject)SubLObjectFactory.makeSymbol("VARIABLE-COUNTER")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("VAR-SYMBOL"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("INTERN"), (SubLObject)SubLObjectFactory.makeSymbol("VAR-NAME"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIND-PACKAGE"), (SubLObject)SubLObjectFactory.makeString("CYC"))))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CINC"), (SubLObject)SubLObjectFactory.makeSymbol("VARIABLE-COUNTER")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("VAR-SYMBOL"))));
        $sym148$OUTER_CATCH_FOR_SHOP_VARIABLE_MANAGER_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-SHOP-VARIABLE-MANAGER-METHOD");
        $str149$CYC = SubLObjectFactory.makeString("CYC");
        $sym150$SHOP_VARIABLE_MANAGER_GENERATE_VARIABLE_METHOD = SubLObjectFactory.makeSymbol("SHOP-VARIABLE-MANAGER-GENERATE-VARIABLE-METHOD");
        $sym151$GENERATE_BINDING_PAIR = SubLObjectFactory.makeSymbol("GENERATE-BINDING-PAIR");
        $list152 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("OLD-VAR"));
        $list153 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("Returns a binding pair that maps OLD-VAR to a new, previously unused variable.\n  @param   OLD-VAR  shop-variablep; variable to be replaced.\n  @return consp ; (OLD-VAR . NEW-VAR)"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NEW-VAR"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("GENERATE-VARIABLE"), (SubLObject)SubLObjectFactory.makeSymbol("SELF")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("GETHASH"), (SubLObject)SubLObjectFactory.makeSymbol("NEW-VAR"), (SubLObject)SubLObjectFactory.makeSymbol("VARIABLE-ASSOC-TABLE")), (SubLObject)SubLObjectFactory.makeSymbol("OLD-VAR")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CONS"), (SubLObject)SubLObjectFactory.makeSymbol("OLD-VAR"), (SubLObject)SubLObjectFactory.makeSymbol("NEW-VAR")))));
        $sym154$OUTER_CATCH_FOR_SHOP_VARIABLE_MANAGER_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-SHOP-VARIABLE-MANAGER-METHOD");
        $sym155$SHOP_VARIABLE_MANAGER_GENERATE_BINDING_PAIR_METHOD = SubLObjectFactory.makeSymbol("SHOP-VARIABLE-MANAGER-GENERATE-BINDING-PAIR-METHOD");
        $sym156$GENERATE_BINDING_LIST = SubLObjectFactory.makeSymbol("GENERATE-BINDING-LIST");
        $list157 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("OLD-VAR-LIST"));
        $list158 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("@param OLD-VAR-LIST consp; the list of variables to be replaced.\n   @return consp ; the list of variable bindings."), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("BLIST"), (SubLObject)shop_internals.NIL)), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CDOLIST"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("OLD-VAR"), (SubLObject)SubLObjectFactory.makeSymbol("OLD-VAR-LIST")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CPUSH"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("GENERATE-BINDING-PAIR"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)SubLObjectFactory.makeSymbol("OLD-VAR")), (SubLObject)SubLObjectFactory.makeSymbol("BLIST"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("BLIST"))));
        $sym159$SHOP_VARIABLE_MANAGER_GENERATE_BINDING_LIST_METHOD = SubLObjectFactory.makeSymbol("SHOP-VARIABLE-MANAGER-GENERATE-BINDING-LIST-METHOD");
        $sym160$RECOVER_EL_VARIABLE = SubLObjectFactory.makeSymbol("RECOVER-EL-VARIABLE");
        $list161 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("HL-VAR"));
        $list162 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("@param    HL-VAR shop-variablep; a variable managed by SELF\n   @return  shop-variablep; the original, and usually more user-friendly name for the variable."), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("EL-VAR"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("GETHASH"), (SubLObject)SubLObjectFactory.makeSymbol("HL-VAR"), (SubLObject)SubLObjectFactory.makeSymbol("VARIABLE-ASSOC-TABLE")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PWHEN"), (SubLObject)SubLObjectFactory.makeSymbol("EL-VAR"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("EL-VAR"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CERROR"), (SubLObject)SubLObjectFactory.makeString("VARIABLE ERROR"), (SubLObject)SubLObjectFactory.makeString("~s is not a known variable to ~s~%"), (SubLObject)SubLObjectFactory.makeSymbol("HL-VAR"), (SubLObject)SubLObjectFactory.makeSymbol("SELF")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)shop_internals.NIL)));
        $sym163$OUTER_CATCH_FOR_SHOP_VARIABLE_MANAGER_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-SHOP-VARIABLE-MANAGER-METHOD");
        $str164$VARIABLE_ERROR = SubLObjectFactory.makeString("VARIABLE ERROR");
        $str165$_s_is_not_a_known_variable_to__s_ = SubLObjectFactory.makeString("~s is not a known variable to ~s~%");
        $sym166$SHOP_VARIABLE_MANAGER_RECOVER_EL_VARIABLE_METHOD = SubLObjectFactory.makeSymbol("SHOP-VARIABLE-MANAGER-RECOVER-EL-VARIABLE-METHOD");
        $sym167$GATHER_EL_VARIABLES = SubLObjectFactory.makeSymbol("GATHER-EL-VARIABLES");
        $list168 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FORM"), (SubLObject)SubLObjectFactory.makeSymbol("MBINDING"));
        $list169 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("Finds all the variables in FORM unbound by MBINDING\n   @param  FORM      consp ;the formula with variables \n   @param  MBINDING  multibinding-p ;mbinding that binds some of the variables.\n   @return consp ;list of all unbound variables."), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("UNBOUND-VARS"), (SubLObject)shop_internals.NIL)), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CDOLIST"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CUR-VAR"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TREE-GATHER"), (SubLObject)SubLObjectFactory.makeSymbol("FORM"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FUNCTION"), (SubLObject)SubLObjectFactory.makeSymbol("SHOP-VARIABLEP")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PUNLESS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("INLINE-METHOD"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("GENERATED-VARIABLE?"), (SubLObject)SubLObjectFactory.makeSymbol("SHOP-VARIABLE-MANAGER")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("SHOP-VARIABLE-MANAGER")), (SubLObject)SubLObjectFactory.makeSymbol("CUR-VAR")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PWHEN"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FREE-VARIABLE-IN-MULTIBINDING?"), (SubLObject)SubLObjectFactory.makeSymbol("CUR-VAR"), (SubLObject)SubLObjectFactory.makeSymbol("MBINDING")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CPUSH"), (SubLObject)SubLObjectFactory.makeSymbol("CUR-VAR"), (SubLObject)SubLObjectFactory.makeSymbol("UNBOUND-VARS"))))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("REVERSE"), (SubLObject)SubLObjectFactory.makeSymbol("UNBOUND-VARS")))));
        $sym170$SHOP_VARIABLEP = SubLObjectFactory.makeSymbol("SHOP-VARIABLEP");
        $sym171$SHOP_VARIABLE_MANAGER_GATHER_EL_VARIABLES_METHOD = SubLObjectFactory.makeSymbol("SHOP-VARIABLE-MANAGER-GATHER-EL-VARIABLES-METHOD");
        $sym172$MANAGED_VARIABLE_ = SubLObjectFactory.makeSymbol("MANAGED-VARIABLE?");
        $list173 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("VAR"));
        $list174 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("GETHASH"), (SubLObject)SubLObjectFactory.makeSymbol("VAR"), (SubLObject)SubLObjectFactory.makeSymbol("VARIABLE-ASSOC-TABLE")), (SubLObject)shop_internals.T, (SubLObject)shop_internals.NIL)));
        $sym175$OUTER_CATCH_FOR_SHOP_VARIABLE_MANAGER_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-SHOP-VARIABLE-MANAGER-METHOD");
        $sym176$SHOP_VARIABLE_MANAGER_MANAGED_VARIABLE__METHOD = SubLObjectFactory.makeSymbol("SHOP-VARIABLE-MANAGER-MANAGED-VARIABLE?-METHOD");
        $sym177$GENERATED_VARIABLE_ = SubLObjectFactory.makeSymbol("GENERATED-VARIABLE?");
        $list178 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("@param VAR shop-variablep\n   @return booleanp\n   returns T if VAR could have been generated by an instance of\n   SHOP-VARIABLE-MANAGER, and NIL otherwise.\n   (check-type var shop-variablep)"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PUNLESS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SYMBOLP"), (SubLObject)SubLObjectFactory.makeSymbol("VAR")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)shop_internals.NIL)), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PWHEN"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("VARIABLE-P"), (SubLObject)SubLObjectFactory.makeSymbol("VAR")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)shop_internals.NIL)), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("VAR-NAME"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SYMBOL-NAME"), (SubLObject)SubLObjectFactory.makeSymbol("VAR"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("MIN-LENGTH"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("LENGTH"), (SubLObject)SubLObjectFactory.makeSymbol("VARIABLE-PREFIX"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("VAR-PREFIX"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol(">="), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("LENGTH"), (SubLObject)SubLObjectFactory.makeSymbol("VAR-NAME")), (SubLObject)SubLObjectFactory.makeSymbol("MIN-LENGTH")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SUBSTRING"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SYMBOL-NAME"), (SubLObject)SubLObjectFactory.makeSymbol("VAR")), (SubLObject)shop_internals.ZERO_INTEGER, (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("LENGTH"), (SubLObject)SubLObjectFactory.makeSymbol("VARIABLE-PREFIX"))), (SubLObject)SubLObjectFactory.makeString("")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PIF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("STRING="), (SubLObject)SubLObjectFactory.makeSymbol("VAR-PREFIX"), (SubLObject)SubLObjectFactory.makeSymbol("VARIABLE-PREFIX")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)shop_internals.T), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)shop_internals.NIL))));
        $sym179$OUTER_CATCH_FOR_SHOP_VARIABLE_MANAGER_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-SHOP-VARIABLE-MANAGER-METHOD");
        $str180$ = SubLObjectFactory.makeString("");
        $sym181$SHOP_VARIABLE_MANAGER_GENERATED_VARIABLE__METHOD = SubLObjectFactory.makeSymbol("SHOP-VARIABLE-MANAGER-GENERATED-VARIABLE?-METHOD");
        $sym182$GENERATED_VARIABLES_BOUND = SubLObjectFactory.makeSymbol("GENERATED-VARIABLES-BOUND");
        $list183 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("BINDING"));
        $list184 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("@param BINDING listp\n   @return listp"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("BPAIRS"), (SubLObject)shop_internals.NIL)), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CDOLIST"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CUR-PAIR"), (SubLObject)SubLObjectFactory.makeSymbol("BINDING")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PWHEN"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("INLINE-METHOD"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("GENERATED-VARIABLE?"), (SubLObject)SubLObjectFactory.makeSymbol("SHOP-VARIABLE-MANAGER")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("SHOP-VARIABLE-MANAGER")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIRST"), (SubLObject)SubLObjectFactory.makeSymbol("CUR-PAIR"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CPUSH"), (SubLObject)SubLObjectFactory.makeSymbol("CUR-PAIR"), (SubLObject)SubLObjectFactory.makeSymbol("BPAIRS")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("BPAIRS"))));
        $sym185$SHOP_VARIABLE_MANAGER_GENERATED_VARIABLES_BOUND_METHOD = SubLObjectFactory.makeSymbol("SHOP-VARIABLE-MANAGER-GENERATED-VARIABLES-BOUND-METHOD");
        $sym186$REPLACE_VARIABLES = SubLObjectFactory.makeSymbol("REPLACE-VARIABLES");
        $list187 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("replaces all variables in FORM that are currently not bound by \n   MBINDING. \n   @param    FORM      hl-formula-p        ;formula with vars to replace\n   @param    MBINDING  multibinding-p      ;multibinding that applies to FORM's vars\n   @return  consp"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("OLD-VARS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("GATHER-EL-VARIABLES"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)SubLObjectFactory.makeSymbol("FORM"), (SubLObject)SubLObjectFactory.makeSymbol("MBINDING"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("BLIST"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("GENERATE-BINDING-LIST"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)SubLObjectFactory.makeSymbol("OLD-VARS")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SUBLIS"), (SubLObject)SubLObjectFactory.makeSymbol("BLIST"), (SubLObject)SubLObjectFactory.makeSymbol("FORM")))));
        $sym188$SHOP_VARIABLE_MANAGER_REPLACE_VARIABLES_METHOD = SubLObjectFactory.makeSymbol("SHOP-VARIABLE-MANAGER-REPLACE-VARIABLES-METHOD");
        $sym189$RECOVER_EL = SubLObjectFactory.makeSymbol("RECOVER-EL");
        $list190 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TREE"));
        $list191 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("@param TREE listp\n   Return the TREE, will all managed variables replaced with\n   their el labels."), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("HL-VARS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TREE-GATHER"), (SubLObject)SubLObjectFactory.makeSymbol("TREE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FUNCTION"), (SubLObject)SubLObjectFactory.makeSymbol("SHOP-VARIABLEP")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NEW-TREE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("COPY-TREE"), (SubLObject)SubLObjectFactory.makeSymbol("TREE")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CDOLIST"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CUR-VAR"), (SubLObject)SubLObjectFactory.makeSymbol("HL-VARS")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PWHEN"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("MANAGED-VARIABLE?"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)SubLObjectFactory.makeSymbol("CUR-VAR")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("NEW-TREE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NSUBST"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RECOVER-EL-VARIABLE"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)SubLObjectFactory.makeSymbol("CUR-VAR")), (SubLObject)SubLObjectFactory.makeSymbol("CUR-VAR"), (SubLObject)SubLObjectFactory.makeSymbol("NEW-TREE"))))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("NEW-TREE"))));
        $sym192$SHOP_VARIABLE_MANAGER_RECOVER_EL_METHOD = SubLObjectFactory.makeSymbol("SHOP-VARIABLE-MANAGER-RECOVER-EL-METHOD");
        $const193$argIsa = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("argIsa"));
        $sym194$RELEVANT_MT_IS_GENL_MT = SubLObjectFactory.makeSymbol("RELEVANT-MT-IS-GENL-MT");
        $const195$argGenl = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("argGenl"));
    }
}

/*

	Total time: 732 ms
	
*/