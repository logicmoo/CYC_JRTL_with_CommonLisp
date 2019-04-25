package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sort;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.cycjava.cycl.inference.harness.inference_datastructures_inference;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class shop_log extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.shop_log";
    public static final String myFingerPrint = "1aa9deb937db22c6f459d21d40522114c78982359c3d15321118ab2697ecd690";
    @SubLTranslatedFile.SubL(source = "cycl/shop-log.lisp", position = 7088L)
    private static SubLSymbol $shop_log_entry_map$;
    private static final SubLSymbol $sym0$PROCESS_LOG;
    private static final SubLList $list1;
    private static final SubLSymbol $sym2$HTML_PROCESS_LOG;
    private static final SubLList $list3;
    private static final SubLList $list4;
    private static final SubLSymbol $sym5$SHOP_LOG;
    private static final SubLSymbol $sym6$OBJECT;
    private static final SubLList $list7;
    private static final SubLList $list8;
    private static final SubLSymbol $sym9$ISG;
    private static final SubLSymbol $sym10$VERBOSE;
    private static final SubLSymbol $sym11$STREAM;
    private static final SubLSymbol $sym12$LOG;
    private static final SubLSymbol $sym13$INSTANCE_COUNT;
    private static final SubLSymbol $sym14$SUBLOOP_RESERVED_INITIALIZE_SHOP_LOG_CLASS;
    private static final SubLSymbol $sym15$ISOLATED_P;
    private static final SubLSymbol $sym16$INSTANCE_NUMBER;
    private static final SubLSymbol $sym17$SUBLOOP_RESERVED_INITIALIZE_SHOP_LOG_INSTANCE;
    private static final SubLSymbol $sym18$INITIALIZE;
    private static final SubLList $list19;
    private static final SubLList $list20;
    private static final SubLSymbol $sym21$OUTER_CATCH_FOR_SHOP_LOG_METHOD;
    private static final SubLSymbol $sym22$SHOP_LOG_INITIALIZE_METHOD;
    private static final SubLSymbol $sym23$ADD_TO_LOG;
    private static final SubLList $list24;
    private static final SubLList $list25;
    private static final SubLList $list26;
    private static final SubLSymbol $sym27$OUTER_CATCH_FOR_SHOP_LOG_METHOD;
    private static final SubLSymbol $sym28$SHOP_LOG_ADD_TO_LOG_METHOD;
    private static final SubLSymbol $sym29$LOG_NEWLINE;
    private static final SubLList $list30;
    private static final SubLList $list31;
    private static final SubLSymbol $kw32$NEWLINE;
    private static final SubLSymbol $sym33$SHOP_LOG_LOG_NEWLINE_METHOD;
    private static final SubLSymbol $sym34$LOG_ENTRY;
    private static final SubLList $list35;
    private static final SubLSymbol $sym36$SHOP_LOG_LOG_ENTRY_METHOD;
    private static final SubLSymbol $sym37$LOG_PREFORMATTED;
    private static final SubLList $list38;
    private static final SubLSymbol $kw39$PRE;
    private static final SubLSymbol $sym40$SHOP_LOG_LOG_PREFORMATTED_METHOD;
    private static final SubLSymbol $sym41$LOG_FANCY_ENTRY;
    private static final SubLList $list42;
    private static final SubLList $list43;
    private static final SubLSymbol $kw44$FANCY;
    private static final SubLSymbol $sym45$SHOP_LOG_LOG_FANCY_ENTRY_METHOD;
    private static final SubLSymbol $sym46$LOG_HEADING;
    private static final SubLList $list47;
    private static final SubLList $list48;
    private static final SubLSymbol $kw49$HEADING;
    private static final SubLSymbol $sym50$SHOP_LOG_LOG_HEADING_METHOD;
    private static final SubLSymbol $sym51$LOG_PARTIAL_PLAN;
    private static final SubLList $list52;
    private static final SubLSymbol $kw53$PARTIAL_PLAN;
    private static final SubLSymbol $sym54$SHOP_LOG_LOG_PARTIAL_PLAN_METHOD;
    private static final SubLSymbol $sym55$COLOR_LOG_ENTRY;
    private static final SubLList $list56;
    private static final SubLList $list57;
    private static final SubLSymbol $kw58$COLOR;
    private static final SubLSymbol $sym59$SHOP_LOG_COLOR_LOG_ENTRY_METHOD;
    private static final SubLSymbol $sym60$WARNING;
    private static final SubLList $list61;
    private static final SubLSymbol $kw62$RED;
    private static final SubLSymbol $sym63$SHOP_LOG_WARNING_METHOD;
    private static final SubLSymbol $sym64$SUCCESS;
    private static final SubLList $list65;
    private static final SubLSymbol $kw66$DARK_GREEN;
    private static final SubLSymbol $sym67$SHOP_LOG_SUCCESS_METHOD;
    private static final SubLSymbol $sym68$NEW_SECTION;
    private static final SubLList $list69;
    private static final SubLSymbol $kw70$HR;
    private static final SubLSymbol $sym71$SHOP_LOG_NEW_SECTION_METHOD;
    private static final SubLSymbol $sym72$LOG_PLANNER_RULE;
    private static final SubLList $list73;
    private static final SubLList $list74;
    private static final SubLSymbol $kw75$RULE;
    private static final SubLSymbol $sym76$SHOP_LOG_LOG_PLANNER_RULE_METHOD;
    private static final SubLSymbol $sym77$LOG_INFERENCE;
    private static final SubLList $list78;
    private static final SubLList $list79;
    private static final SubLSymbol $sym80$INFERENCE_P;
    private static final SubLSymbol $kw81$INFERENCE;
    private static final SubLSymbol $sym82$SHOP_LOG_LOG_INFERENCE_METHOD;
    private static final SubLSymbol $sym83$LOG_MULTIBINDING;
    private static final SubLList $list84;
    private static final SubLList $list85;
    private static final SubLSymbol $kw86$MBIND;
    private static final SubLSymbol $sym87$SHOP_LOG_LOG_MULTIBINDING_METHOD;
    private static final SubLSymbol $sym88$PLANNER_RULE_LINK;
    private static final SubLList $list89;
    private static final SubLSymbol $sym90$SHOP_LOG_PLANNER_RULE_LINK_METHOD;
    private static final SubLSymbol $sym91$DISPLAY_FANCY_ENTRY;
    private static final SubLList $list92;
    private static final SubLList $list93;
    private static final SubLSymbol $kw94$BOLD;
    private static final SubLSymbol $sym95$SHOP_LOG_DISPLAY_FANCY_ENTRY_METHOD;
    private static final SubLSymbol $sym96$DISPLAY_MULTIBINDING;
    private static final SubLList $list97;
    private static final SubLSymbol $sym98$FIRST;
    private static final SubLSymbol $sym99$STRING_;
    private static final SubLSymbol $sym100$SHOP_VAR_NAME;
    private static final SubLList $list101;
    private static final SubLString $str102$_s____;
    private static final SubLString $str103$__s;
    private static final SubLSymbol $sym104$SHOP_LOG_DISPLAY_MULTIBINDING_METHOD;
    private static final SubLSymbol $sym105$INFERENCE_LINK;
    private static final SubLList $list106;
    private static final SubLList $list107;
    private static final SubLString $str108$_Examine_Inference_;
    private static final SubLString $str109$__returned_bindings___s;
    private static final SubLString $str110$_s;
    private static final SubLSymbol $sym111$SHOP_LOG_INFERENCE_LINK_METHOD;
    private static final SubLSymbol $sym112$DISPLAY_COLOR_ENTRY;
    private static final SubLList $list113;
    private static final SubLList $list114;
    private static final SubLSymbol $sym115$SHOP_LOG_DISPLAY_COLOR_ENTRY_METHOD;
    private static final SubLSymbol $sym116$DISPLAY_PARTIAL_PLAN;
    private static final SubLList $list117;
    private static final SubLSymbol $sym118$SHOP_LOG_DISPLAY_PARTIAL_PLAN_METHOD;
    private static final SubLSymbol $sym119$DISPLAY_SWITCHABLE_PARTIAL_PLAN;
    private static final SubLList $list120;
    private static final SubLSymbol $sym121$OUTER_CATCH_FOR_SHOP_LOG_METHOD;
    private static final SubLString $str122$partial_plan_;
    private static final SubLString $str123$Partial_Plan;
    private static final SubLString $str124$_Show_;
    private static final SubLString $str125$_Hide_;
    private static final SubLSymbol $kw126$INVISIBLE;
    private static final SubLSymbol $kw127$PARAGRAPH;
    private static final SubLSymbol $sym128$SHOP_LOG_DISPLAY_SWITCHABLE_PARTIAL_PLAN_METHOD;
    private static final SubLList $list129;
    private static final SubLSymbol $sym130$DISPLAY_HTML_LOG;
    private static final SubLList $list131;
    private static final SubLSymbol $sym132$OUTER_CATCH_FOR_SHOP_LOG_METHOD;
    private static final SubLString $str133$__;
    private static final SubLSymbol $sym134$SHOP_LOG_DISPLAY_HTML_LOG_METHOD;
    private static final SubLSymbol $sym135$SET_VERBOSITY;
    private static final SubLList $list136;
    private static final SubLList $list137;
    private static final SubLSymbol $sym138$OUTER_CATCH_FOR_SHOP_LOG_METHOD;
    private static final SubLSymbol $sym139$MEMBER;
    private static final SubLString $str140$_s_is_not_a_permissible_value_for;
    private static final SubLSymbol $sym141$SHOP_LOG_SET_VERBOSITY_METHOD;
    
    @SubLTranslatedFile.SubL(source = "cycl/shop-log.lisp", position = 780L)
    public static SubLObject process_log_p(final SubLObject process_log) {
        return interfaces.subloop_instanceof_interface(process_log, (SubLObject)shop_log.$sym0$PROCESS_LOG);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/shop-log.lisp", position = 1106L)
    public static SubLObject html_process_log_p(final SubLObject html_process_log) {
        return interfaces.subloop_instanceof_interface(html_process_log, (SubLObject)shop_log.$sym2$HTML_PROCESS_LOG);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/shop-log.lisp", position = 1402L)
    public static SubLObject get_shop_log_isg(final SubLObject v_shop_log) {
        return classes.subloop_get_access_protected_instance_slot(v_shop_log, (SubLObject)shop_log.FOUR_INTEGER, (SubLObject)shop_log.$sym9$ISG);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/shop-log.lisp", position = 1402L)
    public static SubLObject set_shop_log_isg(final SubLObject v_shop_log, final SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(v_shop_log, value, (SubLObject)shop_log.FOUR_INTEGER, (SubLObject)shop_log.$sym9$ISG);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/shop-log.lisp", position = 1402L)
    public static SubLObject get_shop_log_verbose(final SubLObject v_shop_log) {
        return classes.subloop_get_access_protected_instance_slot(v_shop_log, (SubLObject)shop_log.THREE_INTEGER, (SubLObject)shop_log.$sym10$VERBOSE);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/shop-log.lisp", position = 1402L)
    public static SubLObject set_shop_log_verbose(final SubLObject v_shop_log, final SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(v_shop_log, value, (SubLObject)shop_log.THREE_INTEGER, (SubLObject)shop_log.$sym10$VERBOSE);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/shop-log.lisp", position = 1402L)
    public static SubLObject get_shop_log_stream(final SubLObject v_shop_log) {
        return classes.subloop_get_access_protected_instance_slot(v_shop_log, (SubLObject)shop_log.TWO_INTEGER, (SubLObject)shop_log.$sym11$STREAM);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/shop-log.lisp", position = 1402L)
    public static SubLObject set_shop_log_stream(final SubLObject v_shop_log, final SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(v_shop_log, value, (SubLObject)shop_log.TWO_INTEGER, (SubLObject)shop_log.$sym11$STREAM);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/shop-log.lisp", position = 1402L)
    public static SubLObject get_shop_log_log(final SubLObject v_shop_log) {
        return classes.subloop_get_access_protected_instance_slot(v_shop_log, (SubLObject)shop_log.ONE_INTEGER, (SubLObject)shop_log.$sym12$LOG);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/shop-log.lisp", position = 1402L)
    public static SubLObject set_shop_log_log(final SubLObject v_shop_log, final SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(v_shop_log, value, (SubLObject)shop_log.ONE_INTEGER, (SubLObject)shop_log.$sym12$LOG);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/shop-log.lisp", position = 1402L)
    public static SubLObject subloop_reserved_initialize_shop_log_class(final SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, (SubLObject)shop_log.$sym6$OBJECT, (SubLObject)shop_log.$sym13$INSTANCE_COUNT, (SubLObject)shop_log.ZERO_INTEGER);
        return (SubLObject)shop_log.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/shop-log.lisp", position = 1402L)
    public static SubLObject subloop_reserved_initialize_shop_log_instance(final SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, (SubLObject)shop_log.$sym6$OBJECT, (SubLObject)shop_log.$sym15$ISOLATED_P, (SubLObject)shop_log.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)shop_log.$sym6$OBJECT, (SubLObject)shop_log.$sym16$INSTANCE_NUMBER, (SubLObject)shop_log.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)shop_log.$sym5$SHOP_LOG, (SubLObject)shop_log.$sym12$LOG, (SubLObject)shop_log.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)shop_log.$sym5$SHOP_LOG, (SubLObject)shop_log.$sym11$STREAM, (SubLObject)shop_log.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)shop_log.$sym5$SHOP_LOG, (SubLObject)shop_log.$sym10$VERBOSE, (SubLObject)shop_log.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)shop_log.$sym5$SHOP_LOG, (SubLObject)shop_log.$sym9$ISG, (SubLObject)shop_log.NIL);
        return (SubLObject)shop_log.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/shop-log.lisp", position = 1402L)
    public static SubLObject shop_log_p(final SubLObject v_shop_log) {
        return classes.subloop_instanceof_class(v_shop_log, (SubLObject)shop_log.$sym5$SHOP_LOG);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/shop-log.lisp", position = 2320L)
    public static SubLObject shop_log_initialize_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_shop_log_method = (SubLObject)shop_log.NIL;
        SubLObject isg = get_shop_log_isg(self);
        SubLObject verbose = get_shop_log_verbose(self);
        SubLObject stream = get_shop_log_stream(self);
        SubLObject log = get_shop_log_log(self);
        try {
            thread.throwStack.push(shop_log.$sym21$OUTER_CATCH_FOR_SHOP_LOG_METHOD);
            try {
                object.object_initialize_method(self);
                verbose = (SubLObject)shop_log.ZERO_INTEGER;
                stream = (SubLObject)shop_log.T;
                log = (SubLObject)shop_log.NIL;
                isg = integer_sequence_generator.new_integer_sequence_generator((SubLObject)shop_log.UNPROVIDED, (SubLObject)shop_log.UNPROVIDED, (SubLObject)shop_log.UNPROVIDED);
                Dynamic.sublisp_throw((SubLObject)shop_log.$sym21$OUTER_CATCH_FOR_SHOP_LOG_METHOD, self);
            }
            finally {
                final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)shop_log.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    set_shop_log_isg(self, isg);
                    set_shop_log_verbose(self, verbose);
                    set_shop_log_stream(self, stream);
                    set_shop_log_log(self, log);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        }
        catch (Throwable ccatch_env_var) {
            catch_var_for_shop_log_method = Errors.handleThrowable(ccatch_env_var, (SubLObject)shop_log.$sym21$OUTER_CATCH_FOR_SHOP_LOG_METHOD);
        }
        finally {
            thread.throwStack.pop();
        }
        return catch_var_for_shop_log_method;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/shop-log.lisp", position = 2518L)
    public static SubLObject shop_log_add_to_log_method(final SubLObject self, final SubLObject item) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_shop_log_method = (SubLObject)shop_log.NIL;
        SubLObject log = get_shop_log_log(self);
        try {
            thread.throwStack.push(shop_log.$sym27$OUTER_CATCH_FOR_SHOP_LOG_METHOD);
            try {
                log = (SubLObject)ConsesLow.cons(item, log);
                if (item.isString()) {
                    print_high.princ(item, (SubLObject)shop_log.UNPROVIDED);
                }
                Dynamic.sublisp_throw((SubLObject)shop_log.$sym27$OUTER_CATCH_FOR_SHOP_LOG_METHOD, item);
            }
            finally {
                final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)shop_log.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    set_shop_log_log(self, log);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        }
        catch (Throwable ccatch_env_var) {
            catch_var_for_shop_log_method = Errors.handleThrowable(ccatch_env_var, (SubLObject)shop_log.$sym27$OUTER_CATCH_FOR_SHOP_LOG_METHOD);
        }
        finally {
            thread.throwStack.pop();
        }
        return catch_var_for_shop_log_method;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/shop-log.lisp", position = 2667L)
    public static SubLObject shop_log_log_newline_method(final SubLObject self) {
        return shop_log_add_to_log_method(self, (SubLObject)shop_log.$kw32$NEWLINE);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/shop-log.lisp", position = 2759L)
    public static SubLObject shop_log_log_entry_method(final SubLObject self, final SubLObject item) {
        return shop_log_add_to_log_method(self, item);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/shop-log.lisp", position = 2849L)
    public static SubLObject shop_log_log_preformatted_method(final SubLObject self, final SubLObject item) {
        return shop_log_add_to_log_method(self, (SubLObject)ConsesLow.cons((SubLObject)shop_log.$kw39$PRE, item));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/shop-log.lisp", position = 2958L)
    public static SubLObject shop_log_log_fancy_entry_method(final SubLObject self, final SubLObject entry, final SubLObject mod_list) {
        return shop_log_add_to_log_method(self, (SubLObject)ConsesLow.list((SubLObject)shop_log.$kw44$FANCY, entry, mod_list));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/shop-log.lisp", position = 3088L)
    public static SubLObject shop_log_log_heading_method(final SubLObject self, final SubLObject entry) {
        return shop_log_add_to_log_method(self, (SubLObject)ConsesLow.list((SubLObject)shop_log.$kw49$HEADING, entry));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/shop-log.lisp", position = 3198L)
    public static SubLObject shop_log_log_partial_plan_method(final SubLObject self, final SubLObject entry) {
        return shop_log_add_to_log_method(self, (SubLObject)ConsesLow.list((SubLObject)shop_log.$kw53$PARTIAL_PLAN, entry));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/shop-log.lisp", position = 3318L)
    public static SubLObject shop_log_color_log_entry_method(final SubLObject self, final SubLObject item, final SubLObject color) {
        return shop_log_add_to_log_method(self, (SubLObject)ConsesLow.list((SubLObject)shop_log.$kw58$COLOR, color, item));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/shop-log.lisp", position = 3483L)
    public static SubLObject shop_log_warning_method(final SubLObject self, final SubLObject item) {
        return shop_log_color_log_entry_method(self, item, (SubLObject)shop_log.$kw62$RED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/shop-log.lisp", position = 3620L)
    public static SubLObject shop_log_success_method(final SubLObject self, final SubLObject item) {
        return shop_log_color_log_entry_method(self, item, (SubLObject)shop_log.$kw66$DARK_GREEN);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/shop-log.lisp", position = 3766L)
    public static SubLObject shop_log_new_section_method(final SubLObject self) {
        return shop_log_add_to_log_method(self, (SubLObject)shop_log.$kw70$HR);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/shop-log.lisp", position = 3902L)
    public static SubLObject shop_log_log_planner_rule_method(final SubLObject self, final SubLObject rule) {
        return shop_log_add_to_log_method(self, (SubLObject)ConsesLow.list((SubLObject)shop_log.$kw75$RULE, rule));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/shop-log.lisp", position = 4055L)
    public static SubLObject shop_log_log_inference_method(final SubLObject self, final SubLObject v_bindings, final SubLObject halt_reason, final SubLObject inference) {
        assert shop_log.NIL != inference_datastructures_inference.inference_p(inference) : inference;
        return shop_log_add_to_log_method(self, (SubLObject)ConsesLow.list((SubLObject)shop_log.$kw81$INFERENCE, v_bindings, halt_reason, inference));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/shop-log.lisp", position = 4318L)
    public static SubLObject shop_log_log_multibinding_method(final SubLObject self, final SubLObject mbind) {
        return shop_log_add_to_log_method(self, (SubLObject)ConsesLow.list((SubLObject)shop_log.$kw86$MBIND, mbind));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/shop-log.lisp", position = 4463L)
    public static SubLObject shop_log_planner_rule_link_method(final SubLObject self, final SubLObject entry) {
        final SubLObject rule = conses_high.second(entry);
        final SubLObject ass = shop_datastructures.shop_basic_planner_rule_assertions_method(rule).first();
        if (shop_log.NIL != assertion_handles.assertion_p(ass)) {
            cb_utilities.cb_show_assertion_readably(ass, (SubLObject)shop_log.UNPROVIDED, (SubLObject)shop_log.UNPROVIDED);
        }
        return (SubLObject)shop_log.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/shop-log.lisp", position = 4727L)
    public static SubLObject shop_log_display_fancy_entry_method(final SubLObject self, final SubLObject entry) {
        SubLObject current;
        final SubLObject datum = current = entry.rest();
        SubLObject item = (SubLObject)shop_log.NIL;
        SubLObject mod_list = (SubLObject)shop_log.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)shop_log.$list93);
        item = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)shop_log.$list93);
        mod_list = current.first();
        current = current.rest();
        if (shop_log.NIL == current) {
            if (shop_log.NIL != subl_promotions.memberP((SubLObject)shop_log.$kw94$BOLD, mod_list, (SubLObject)shop_log.UNPROVIDED, (SubLObject)shop_log.UNPROVIDED)) {
                html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
                html_utilities.html_princ(item);
                html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
            }
        }
        else {
            cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)shop_log.$list93);
        }
        return (SubLObject)shop_log.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/shop-log.lisp", position = 4973L)
    public static SubLObject shop_var_name(final SubLObject item) {
        return Symbols.symbol_name(item.first());
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/shop-log.lisp", position = 5047L)
    public static SubLObject shop_log_display_multibinding_method(final SubLObject self, final SubLObject entry) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject mb = conses_high.second(entry);
        final SubLObject alist = (SubLObject)shop_log.NIL;
        SubLObject iteration_state;
        for (iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(multibindings.mb_multi_var_term_map(mb))); shop_log.NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
            thread.resetMultipleValues();
            final SubLObject var = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
            final SubLObject entry_$1 = thread.secondMultipleValue();
            thread.resetMultipleValues();
            final SubLObject values = Mapping.mapcar(Symbols.symbol_function((SubLObject)shop_log.$sym98$FIRST), entry_$1);
            list_utilities.alist_enter(alist, var, values, (SubLObject)shop_log.UNPROVIDED);
        }
        dictionary_contents.do_dictionary_contents_finalize(iteration_state);
        for (iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(multibindings.mb_simple_var_term_map(mb))); shop_log.NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
            thread.resetMultipleValues();
            final SubLObject var = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
            final SubLObject entry_$2 = thread.secondMultipleValue();
            thread.resetMultipleValues();
            final SubLObject values = Mapping.mapcar(Symbols.symbol_function((SubLObject)shop_log.$sym98$FIRST), entry_$2);
            list_utilities.alist_enter(alist, var, values, (SubLObject)shop_log.UNPROVIDED);
        }
        dictionary_contents.do_dictionary_contents_finalize(iteration_state);
        Sort.sort(alist, (SubLObject)shop_log.$sym99$STRING_, (SubLObject)shop_log.$sym100$SHOP_VAR_NAME);
        SubLObject cdolist_list_var = alist;
        SubLObject cons = (SubLObject)shop_log.NIL;
        cons = cdolist_list_var.first();
        while (shop_log.NIL != cdolist_list_var) {
            SubLObject current;
            final SubLObject datum = current = cons;
            SubLObject var2 = (SubLObject)shop_log.NIL;
            SubLObject values2 = (SubLObject)shop_log.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)shop_log.$list101);
            var2 = current.first();
            current = (values2 = current.rest());
            PrintLow.format(html_macros.$html_stream$.getDynamicValue(thread), (SubLObject)shop_log.$str102$_s____, var2);
            SubLObject cdolist_list_var_$3 = values2;
            SubLObject cur_val = (SubLObject)shop_log.NIL;
            cur_val = cdolist_list_var_$3.first();
            while (shop_log.NIL != cdolist_list_var_$3) {
                PrintLow.format(html_macros.$html_stream$.getDynamicValue(thread), (SubLObject)shop_log.$str103$__s, cur_val);
                cdolist_list_var_$3 = cdolist_list_var_$3.rest();
                cur_val = cdolist_list_var_$3.first();
            }
            html_utilities.html_newline((SubLObject)shop_log.UNPROVIDED);
            cdolist_list_var = cdolist_list_var.rest();
            cons = cdolist_list_var.first();
        }
        return (SubLObject)shop_log.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/shop-log.lisp", position = 5453L)
    public static SubLObject shop_log_inference_link_method(final SubLObject self, final SubLObject log_entry) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject current;
        final SubLObject datum = current = log_entry.rest();
        SubLObject v_bindings = (SubLObject)shop_log.NIL;
        SubLObject halt_reason = (SubLObject)shop_log.NIL;
        SubLObject inference = (SubLObject)shop_log.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)shop_log.$list78);
        v_bindings = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)shop_log.$list78);
        halt_reason = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)shop_log.$list78);
        inference = current.first();
        current = current.rest();
        if (shop_log.NIL == current) {
            final SubLObject num_bindings = Sequences.length(v_bindings);
            final SubLObject inference_name = (SubLObject)shop_log.$str108$_Examine_Inference_;
            html_utilities.html_newline((SubLObject)shop_log.TWO_INTEGER);
            PrintLow.format(html_macros.$html_stream$.getDynamicValue(thread), (SubLObject)shop_log.$str109$__returned_bindings___s, num_bindings);
            html_utilities.html_indent((SubLObject)shop_log.TWO_INTEGER);
            html_utilities.html_markup(html_macros.$html_emphasized_head$.getGlobalValue());
            PrintLow.format(html_macros.$html_stream$.getDynamicValue(thread), (SubLObject)shop_log.$str110$_s, halt_reason);
            html_utilities.html_markup(html_macros.$html_emphasized_tail$.getGlobalValue());
            html_utilities.html_newline((SubLObject)shop_log.UNPROVIDED);
            return (SubLObject)shop_log.NIL;
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)shop_log.$list78);
        return (SubLObject)shop_log.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/shop-log.lisp", position = 6071L)
    public static SubLObject shop_log_display_color_entry_method(final SubLObject self, final SubLObject log_entry) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject current;
        final SubLObject datum = current = log_entry.rest();
        SubLObject color = (SubLObject)shop_log.NIL;
        SubLObject entry = (SubLObject)shop_log.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)shop_log.$list114);
        color = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)shop_log.$list114);
        entry = current.first();
        current = current.rest();
        if (shop_log.NIL == current) {
            final SubLObject color_val = color;
            html_utilities.html_markup(html_macros.$html_font_head$.getGlobalValue());
            if (shop_log.NIL != color_val) {
                html_utilities.html_markup(html_macros.$html_font_color$.getGlobalValue());
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)shop_log.UNPROVIDED);
                html_utilities.html_markup(html_utilities.html_color(color_val));
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)shop_log.UNPROVIDED);
            }
            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)shop_log.UNPROVIDED);
            final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
            try {
                html_macros.$html_safe_print$.bind((SubLObject)shop_log.T, thread);
                html_macros.verify_not_within_html_pre();
                html_utilities.html_markup(html_macros.$html_preformatted_head$.getGlobalValue());
                final SubLObject _prev_bind_0_$4 = html_macros.$within_html_pre$.currentBinding(thread);
                try {
                    html_macros.$within_html_pre$.bind((SubLObject)shop_log.T, thread);
                    cb_utilities.cb_form(entry, (SubLObject)shop_log.UNPROVIDED, (SubLObject)shop_log.UNPROVIDED);
                }
                finally {
                    html_macros.$within_html_pre$.rebind(_prev_bind_0_$4, thread);
                }
                html_utilities.html_markup(html_macros.$html_preformatted_tail$.getGlobalValue());
            }
            finally {
                html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
            }
            html_utilities.html_markup(html_macros.$html_font_tail$.getGlobalValue());
        }
        else {
            cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)shop_log.$list114);
        }
        return (SubLObject)shop_log.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/shop-log.lisp", position = 6278L)
    public static SubLObject shop_log_display_partial_plan_method(final SubLObject self, final SubLObject log_entry) {
        SubLObject cdolist_list_var;
        final SubLObject partial_plan = cdolist_list_var = conses_high.second(log_entry);
        SubLObject step = (SubLObject)shop_log.NIL;
        step = cdolist_list_var.first();
        while (shop_log.NIL != cdolist_list_var) {
            cb_utilities.cb_form(step, (SubLObject)shop_log.UNPROVIDED, (SubLObject)shop_log.UNPROVIDED);
            html_utilities.html_newline((SubLObject)shop_log.UNPROVIDED);
            cdolist_list_var = cdolist_list_var.rest();
            step = cdolist_list_var.first();
        }
        return (SubLObject)shop_log.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/shop-log.lisp", position = 6521L)
    public static SubLObject shop_log_display_switchable_partial_plan_method(final SubLObject self, final SubLObject log_entry) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_shop_log_method = (SubLObject)shop_log.NIL;
        final SubLObject isg = get_shop_log_isg(self);
        try {
            thread.throwStack.push(shop_log.$sym121$OUTER_CATCH_FOR_SHOP_LOG_METHOD);
            try {
                final SubLObject id = integer_sequence_generator.integer_sequence_generator_next(isg);
                final SubLObject object_id = Sequences.cconcatenate((SubLObject)shop_log.$str122$partial_plan_, PrintLow.write_to_string(id, shop_log.EMPTY_SUBL_OBJECT_ARRAY));
                html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
                html_utilities.html_princ((SubLObject)shop_log.$str123$Partial_Plan);
                html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                html_utilities.html_indent((SubLObject)shop_log.UNPROVIDED);
                dhtml_macros.dhtml_switch_visibility_links(object_id, (SubLObject)shop_log.$str124$_Show_, (SubLObject)shop_log.$str125$_Hide_);
                html_utilities.html_newline((SubLObject)shop_log.UNPROVIDED);
                dhtml_macros.dhtml_set_switched_visibility(object_id, (SubLObject)shop_log.$kw126$INVISIBLE, (SubLObject)shop_log.$kw127$PARAGRAPH);
                html_utilities.html_markup(html_macros.$html_div_head$.getGlobalValue());
                if (shop_log.NIL != object_id) {
                    html_utilities.html_markup(html_macros.$html_attribute_id$.getGlobalValue());
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)shop_log.UNPROVIDED);
                    html_utilities.html_markup(object_id);
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)shop_log.UNPROVIDED);
                }
                html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)shop_log.UNPROVIDED);
                final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind((SubLObject)shop_log.T, thread);
                    shop_log_display_partial_plan_method(self, log_entry);
                }
                finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
                }
                html_utilities.html_markup(html_macros.$html_div_tail$.getGlobalValue());
                html_utilities.html_source_readability_terpri((SubLObject)shop_log.UNPROVIDED);
                Dynamic.sublisp_throw((SubLObject)shop_log.$sym121$OUTER_CATCH_FOR_SHOP_LOG_METHOD, (SubLObject)shop_log.NIL);
            }
            finally {
                final SubLObject _prev_bind_2 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)shop_log.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    set_shop_log_isg(self, isg);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_2, thread);
                }
            }
        }
        catch (Throwable ccatch_env_var) {
            catch_var_for_shop_log_method = Errors.handleThrowable(ccatch_env_var, (SubLObject)shop_log.$sym121$OUTER_CATCH_FOR_SHOP_LOG_METHOD);
        }
        finally {
            thread.throwStack.pop();
        }
        return catch_var_for_shop_log_method;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/shop-log.lisp", position = 7525L)
    public static SubLObject shop_log_display_html_log_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_shop_log_method = (SubLObject)shop_log.NIL;
        final SubLObject isg = get_shop_log_isg(self);
        final SubLObject log = get_shop_log_log(self);
        try {
            thread.throwStack.push(shop_log.$sym132$OUTER_CATCH_FOR_SHOP_LOG_METHOD);
            try {
                integer_sequence_generator.integer_sequence_generator_reset(instances.get_slot(self, (SubLObject)shop_log.$sym9$ISG));
                SubLObject cdolist_list_var = Sequences.reverse(log);
                SubLObject item = (SubLObject)shop_log.NIL;
                item = cdolist_list_var.first();
                while (shop_log.NIL != cdolist_list_var) {
                    if (item.isKeyword()) {
                        final SubLObject pcase_var = item;
                        if (pcase_var.eql((SubLObject)shop_log.$kw70$HR)) {
                            html_utilities.html_hr((SubLObject)shop_log.UNPROVIDED, (SubLObject)shop_log.UNPROVIDED);
                        }
                        else if (pcase_var.eql((SubLObject)shop_log.$kw32$NEWLINE)) {
                            html_utilities.html_newline((SubLObject)shop_log.UNPROVIDED);
                        }
                    }
                    else if (item.isList()) {
                        final SubLObject pcase_var = item.first();
                        if (pcase_var.eql((SubLObject)shop_log.$kw39$PRE)) {
                            html_macros.verify_not_within_html_pre();
                            html_utilities.html_markup(html_macros.$html_preformatted_head$.getGlobalValue());
                            final SubLObject _prev_bind_0 = html_macros.$within_html_pre$.currentBinding(thread);
                            try {
                                html_macros.$within_html_pre$.bind((SubLObject)shop_log.T, thread);
                                cb_utilities.cb_form(item.rest(), (SubLObject)shop_log.UNPROVIDED, (SubLObject)shop_log.UNPROVIDED);
                            }
                            finally {
                                html_macros.$within_html_pre$.rebind(_prev_bind_0, thread);
                            }
                            html_utilities.html_markup(html_macros.$html_preformatted_tail$.getGlobalValue());
                        }
                        else if (pcase_var.eql((SubLObject)shop_log.$kw49$HEADING)) {
                            html_utilities.html_markup(html_macros.$html_heading_head$.getGlobalValue());
                            html_utilities.html_markup((SubLObject)shop_log.THREE_INTEGER);
                            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)shop_log.UNPROVIDED);
                            html_utilities.html_princ(conses_high.second(item));
                            html_utilities.html_markup(html_macros.$html_heading_tail$.getGlobalValue());
                            html_utilities.html_markup((SubLObject)shop_log.THREE_INTEGER);
                            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)shop_log.UNPROVIDED);
                        }
                        else {
                            final SubLObject method = conses_high.second(conses_high.assoc(item.first(), shop_log.$shop_log_entry_map$.getGlobalValue(), (SubLObject)shop_log.UNPROVIDED, (SubLObject)shop_log.UNPROVIDED));
                            methods.funcall_instance_method_with_1_args(self, method, item);
                        }
                    }
                    else if (item.isString()) {
                        if (shop_log.NIL != string_utilities.substringP((SubLObject)shop_log.$str133$__, item, (SubLObject)shop_log.UNPROVIDED, (SubLObject)shop_log.UNPROVIDED, (SubLObject)shop_log.UNPROVIDED)) {
                            cb_utilities.cb_form(item, (SubLObject)shop_log.UNPROVIDED, (SubLObject)shop_log.UNPROVIDED);
                        }
                        else {
                            html_utilities.html_princ(item);
                        }
                        html_utilities.html_br();
                    }
                    cdolist_list_var = cdolist_list_var.rest();
                    item = cdolist_list_var.first();
                }
                Dynamic.sublisp_throw((SubLObject)shop_log.$sym132$OUTER_CATCH_FOR_SHOP_LOG_METHOD, (SubLObject)shop_log.NIL);
            }
            finally {
                final SubLObject _prev_bind_2 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)shop_log.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    set_shop_log_isg(self, isg);
                    set_shop_log_log(self, log);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_2, thread);
                }
            }
        }
        catch (Throwable ccatch_env_var) {
            catch_var_for_shop_log_method = Errors.handleThrowable(ccatch_env_var, (SubLObject)shop_log.$sym132$OUTER_CATCH_FOR_SHOP_LOG_METHOD);
        }
        finally {
            thread.throwStack.pop();
        }
        return catch_var_for_shop_log_method;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/shop-log.lisp", position = 8193L)
    public static SubLObject shop_log_set_verbosity_method(final SubLObject self, final SubLObject new_verbose) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_shop_log_method = (SubLObject)shop_log.NIL;
        SubLObject verbose = get_shop_log_verbose(self);
        try {
            thread.throwStack.push(shop_log.$sym138$OUTER_CATCH_FOR_SHOP_LOG_METHOD);
            try {
                if (new_verbose.isNumber()) {
                    verbose = new_verbose;
                }
                else if (new_verbose.isKeyword()) {
                    verbose = conses_high.assoc(new_verbose, shop_internals.$shop_verbose_keys$.getDynamicValue(thread), Symbols.symbol_function((SubLObject)shop_log.$sym139$MEMBER), (SubLObject)shop_log.UNPROVIDED).rest();
                }
                else {
                    Errors.cerror((SubLObject)shop_log.$str140$_s_is_not_a_permissible_value_for, new_verbose);
                }
                Dynamic.sublisp_throw((SubLObject)shop_log.$sym138$OUTER_CATCH_FOR_SHOP_LOG_METHOD, (SubLObject)shop_log.NIL);
            }
            finally {
                final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)shop_log.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    set_shop_log_verbose(self, verbose);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        }
        catch (Throwable ccatch_env_var) {
            catch_var_for_shop_log_method = Errors.handleThrowable(ccatch_env_var, (SubLObject)shop_log.$sym138$OUTER_CATCH_FOR_SHOP_LOG_METHOD);
        }
        finally {
            thread.throwStack.pop();
        }
        return catch_var_for_shop_log_method;
    }
    
    public static SubLObject declare_shop_log_file() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.shop_log", "process_log_p", "PROCESS-LOG-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.shop_log", "html_process_log_p", "HTML-PROCESS-LOG-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.shop_log", "get_shop_log_isg", "GET-SHOP-LOG-ISG", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.shop_log", "set_shop_log_isg", "SET-SHOP-LOG-ISG", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.shop_log", "get_shop_log_verbose", "GET-SHOP-LOG-VERBOSE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.shop_log", "set_shop_log_verbose", "SET-SHOP-LOG-VERBOSE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.shop_log", "get_shop_log_stream", "GET-SHOP-LOG-STREAM", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.shop_log", "set_shop_log_stream", "SET-SHOP-LOG-STREAM", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.shop_log", "get_shop_log_log", "GET-SHOP-LOG-LOG", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.shop_log", "set_shop_log_log", "SET-SHOP-LOG-LOG", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.shop_log", "subloop_reserved_initialize_shop_log_class", "SUBLOOP-RESERVED-INITIALIZE-SHOP-LOG-CLASS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.shop_log", "subloop_reserved_initialize_shop_log_instance", "SUBLOOP-RESERVED-INITIALIZE-SHOP-LOG-INSTANCE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.shop_log", "shop_log_p", "SHOP-LOG-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.shop_log", "shop_log_initialize_method", "SHOP-LOG-INITIALIZE-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.shop_log", "shop_log_add_to_log_method", "SHOP-LOG-ADD-TO-LOG-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.shop_log", "shop_log_log_newline_method", "SHOP-LOG-LOG-NEWLINE-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.shop_log", "shop_log_log_entry_method", "SHOP-LOG-LOG-ENTRY-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.shop_log", "shop_log_log_preformatted_method", "SHOP-LOG-LOG-PREFORMATTED-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.shop_log", "shop_log_log_fancy_entry_method", "SHOP-LOG-LOG-FANCY-ENTRY-METHOD", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.shop_log", "shop_log_log_heading_method", "SHOP-LOG-LOG-HEADING-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.shop_log", "shop_log_log_partial_plan_method", "SHOP-LOG-LOG-PARTIAL-PLAN-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.shop_log", "shop_log_color_log_entry_method", "SHOP-LOG-COLOR-LOG-ENTRY-METHOD", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.shop_log", "shop_log_warning_method", "SHOP-LOG-WARNING-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.shop_log", "shop_log_success_method", "SHOP-LOG-SUCCESS-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.shop_log", "shop_log_new_section_method", "SHOP-LOG-NEW-SECTION-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.shop_log", "shop_log_log_planner_rule_method", "SHOP-LOG-LOG-PLANNER-RULE-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.shop_log", "shop_log_log_inference_method", "SHOP-LOG-LOG-INFERENCE-METHOD", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.shop_log", "shop_log_log_multibinding_method", "SHOP-LOG-LOG-MULTIBINDING-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.shop_log", "shop_log_planner_rule_link_method", "SHOP-LOG-PLANNER-RULE-LINK-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.shop_log", "shop_log_display_fancy_entry_method", "SHOP-LOG-DISPLAY-FANCY-ENTRY-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.shop_log", "shop_var_name", "SHOP-VAR-NAME", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.shop_log", "shop_log_display_multibinding_method", "SHOP-LOG-DISPLAY-MULTIBINDING-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.shop_log", "shop_log_inference_link_method", "SHOP-LOG-INFERENCE-LINK-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.shop_log", "shop_log_display_color_entry_method", "SHOP-LOG-DISPLAY-COLOR-ENTRY-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.shop_log", "shop_log_display_partial_plan_method", "SHOP-LOG-DISPLAY-PARTIAL-PLAN-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.shop_log", "shop_log_display_switchable_partial_plan_method", "SHOP-LOG-DISPLAY-SWITCHABLE-PARTIAL-PLAN-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.shop_log", "shop_log_display_html_log_method", "SHOP-LOG-DISPLAY-HTML-LOG-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.shop_log", "shop_log_set_verbosity_method", "SHOP-LOG-SET-VERBOSITY-METHOD", 2, 0, false);
        return (SubLObject)shop_log.NIL;
    }
    
    public static SubLObject init_shop_log_file() {
        shop_log.$shop_log_entry_map$ = SubLFiles.deflexical("*SHOP-LOG-ENTRY-MAP*", (SubLObject)shop_log.$list129);
        return (SubLObject)shop_log.NIL;
    }
    
    public static SubLObject setup_shop_log_file() {
        interfaces.new_interface((SubLObject)shop_log.$sym0$PROCESS_LOG, (SubLObject)shop_log.NIL, (SubLObject)shop_log.NIL, (SubLObject)shop_log.$list1);
        interfaces.new_interface((SubLObject)shop_log.$sym2$HTML_PROCESS_LOG, (SubLObject)shop_log.$sym0$PROCESS_LOG, (SubLObject)shop_log.$list3, (SubLObject)shop_log.$list4);
        classes.subloop_new_class((SubLObject)shop_log.$sym5$SHOP_LOG, (SubLObject)shop_log.$sym6$OBJECT, (SubLObject)shop_log.$list7, (SubLObject)shop_log.NIL, (SubLObject)shop_log.$list8);
        classes.class_set_implements_slot_listeners((SubLObject)shop_log.$sym5$SHOP_LOG, (SubLObject)shop_log.NIL);
        classes.subloop_note_class_initialization_function((SubLObject)shop_log.$sym5$SHOP_LOG, (SubLObject)shop_log.$sym14$SUBLOOP_RESERVED_INITIALIZE_SHOP_LOG_CLASS);
        classes.subloop_note_instance_initialization_function((SubLObject)shop_log.$sym5$SHOP_LOG, (SubLObject)shop_log.$sym17$SUBLOOP_RESERVED_INITIALIZE_SHOP_LOG_INSTANCE);
        subloop_reserved_initialize_shop_log_class((SubLObject)shop_log.$sym5$SHOP_LOG);
        methods.methods_incorporate_instance_method((SubLObject)shop_log.$sym18$INITIALIZE, (SubLObject)shop_log.$sym5$SHOP_LOG, (SubLObject)shop_log.$list19, (SubLObject)shop_log.NIL, (SubLObject)shop_log.$list20);
        methods.subloop_register_instance_method((SubLObject)shop_log.$sym5$SHOP_LOG, (SubLObject)shop_log.$sym18$INITIALIZE, (SubLObject)shop_log.$sym22$SHOP_LOG_INITIALIZE_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)shop_log.$sym23$ADD_TO_LOG, (SubLObject)shop_log.$sym5$SHOP_LOG, (SubLObject)shop_log.$list24, (SubLObject)shop_log.$list25, (SubLObject)shop_log.$list26);
        methods.subloop_register_instance_method((SubLObject)shop_log.$sym5$SHOP_LOG, (SubLObject)shop_log.$sym23$ADD_TO_LOG, (SubLObject)shop_log.$sym28$SHOP_LOG_ADD_TO_LOG_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)shop_log.$sym29$LOG_NEWLINE, (SubLObject)shop_log.$sym5$SHOP_LOG, (SubLObject)shop_log.$list30, (SubLObject)shop_log.NIL, (SubLObject)shop_log.$list31);
        methods.subloop_register_instance_method((SubLObject)shop_log.$sym5$SHOP_LOG, (SubLObject)shop_log.$sym29$LOG_NEWLINE, (SubLObject)shop_log.$sym33$SHOP_LOG_LOG_NEWLINE_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)shop_log.$sym34$LOG_ENTRY, (SubLObject)shop_log.$sym5$SHOP_LOG, (SubLObject)shop_log.$list30, (SubLObject)shop_log.$list25, (SubLObject)shop_log.$list35);
        methods.subloop_register_instance_method((SubLObject)shop_log.$sym5$SHOP_LOG, (SubLObject)shop_log.$sym34$LOG_ENTRY, (SubLObject)shop_log.$sym36$SHOP_LOG_LOG_ENTRY_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)shop_log.$sym37$LOG_PREFORMATTED, (SubLObject)shop_log.$sym5$SHOP_LOG, (SubLObject)shop_log.$list30, (SubLObject)shop_log.$list25, (SubLObject)shop_log.$list38);
        methods.subloop_register_instance_method((SubLObject)shop_log.$sym5$SHOP_LOG, (SubLObject)shop_log.$sym37$LOG_PREFORMATTED, (SubLObject)shop_log.$sym40$SHOP_LOG_LOG_PREFORMATTED_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)shop_log.$sym41$LOG_FANCY_ENTRY, (SubLObject)shop_log.$sym5$SHOP_LOG, (SubLObject)shop_log.$list30, (SubLObject)shop_log.$list42, (SubLObject)shop_log.$list43);
        methods.subloop_register_instance_method((SubLObject)shop_log.$sym5$SHOP_LOG, (SubLObject)shop_log.$sym41$LOG_FANCY_ENTRY, (SubLObject)shop_log.$sym45$SHOP_LOG_LOG_FANCY_ENTRY_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)shop_log.$sym46$LOG_HEADING, (SubLObject)shop_log.$sym5$SHOP_LOG, (SubLObject)shop_log.$list30, (SubLObject)shop_log.$list47, (SubLObject)shop_log.$list48);
        methods.subloop_register_instance_method((SubLObject)shop_log.$sym5$SHOP_LOG, (SubLObject)shop_log.$sym46$LOG_HEADING, (SubLObject)shop_log.$sym50$SHOP_LOG_LOG_HEADING_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)shop_log.$sym51$LOG_PARTIAL_PLAN, (SubLObject)shop_log.$sym5$SHOP_LOG, (SubLObject)shop_log.$list30, (SubLObject)shop_log.$list47, (SubLObject)shop_log.$list52);
        methods.subloop_register_instance_method((SubLObject)shop_log.$sym5$SHOP_LOG, (SubLObject)shop_log.$sym51$LOG_PARTIAL_PLAN, (SubLObject)shop_log.$sym54$SHOP_LOG_LOG_PARTIAL_PLAN_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)shop_log.$sym55$COLOR_LOG_ENTRY, (SubLObject)shop_log.$sym5$SHOP_LOG, (SubLObject)shop_log.$list30, (SubLObject)shop_log.$list56, (SubLObject)shop_log.$list57);
        methods.subloop_register_instance_method((SubLObject)shop_log.$sym5$SHOP_LOG, (SubLObject)shop_log.$sym55$COLOR_LOG_ENTRY, (SubLObject)shop_log.$sym59$SHOP_LOG_COLOR_LOG_ENTRY_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)shop_log.$sym60$WARNING, (SubLObject)shop_log.$sym5$SHOP_LOG, (SubLObject)shop_log.$list30, (SubLObject)shop_log.$list25, (SubLObject)shop_log.$list61);
        methods.subloop_register_instance_method((SubLObject)shop_log.$sym5$SHOP_LOG, (SubLObject)shop_log.$sym60$WARNING, (SubLObject)shop_log.$sym63$SHOP_LOG_WARNING_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)shop_log.$sym64$SUCCESS, (SubLObject)shop_log.$sym5$SHOP_LOG, (SubLObject)shop_log.$list30, (SubLObject)shop_log.$list25, (SubLObject)shop_log.$list65);
        methods.subloop_register_instance_method((SubLObject)shop_log.$sym5$SHOP_LOG, (SubLObject)shop_log.$sym64$SUCCESS, (SubLObject)shop_log.$sym67$SHOP_LOG_SUCCESS_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)shop_log.$sym68$NEW_SECTION, (SubLObject)shop_log.$sym5$SHOP_LOG, (SubLObject)shop_log.$list30, (SubLObject)shop_log.NIL, (SubLObject)shop_log.$list69);
        methods.subloop_register_instance_method((SubLObject)shop_log.$sym5$SHOP_LOG, (SubLObject)shop_log.$sym68$NEW_SECTION, (SubLObject)shop_log.$sym71$SHOP_LOG_NEW_SECTION_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)shop_log.$sym72$LOG_PLANNER_RULE, (SubLObject)shop_log.$sym5$SHOP_LOG, (SubLObject)shop_log.$list30, (SubLObject)shop_log.$list73, (SubLObject)shop_log.$list74);
        methods.subloop_register_instance_method((SubLObject)shop_log.$sym5$SHOP_LOG, (SubLObject)shop_log.$sym72$LOG_PLANNER_RULE, (SubLObject)shop_log.$sym76$SHOP_LOG_LOG_PLANNER_RULE_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)shop_log.$sym77$LOG_INFERENCE, (SubLObject)shop_log.$sym5$SHOP_LOG, (SubLObject)shop_log.$list30, (SubLObject)shop_log.$list78, (SubLObject)shop_log.$list79);
        methods.subloop_register_instance_method((SubLObject)shop_log.$sym5$SHOP_LOG, (SubLObject)shop_log.$sym77$LOG_INFERENCE, (SubLObject)shop_log.$sym82$SHOP_LOG_LOG_INFERENCE_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)shop_log.$sym83$LOG_MULTIBINDING, (SubLObject)shop_log.$sym5$SHOP_LOG, (SubLObject)shop_log.$list30, (SubLObject)shop_log.$list84, (SubLObject)shop_log.$list85);
        methods.subloop_register_instance_method((SubLObject)shop_log.$sym5$SHOP_LOG, (SubLObject)shop_log.$sym83$LOG_MULTIBINDING, (SubLObject)shop_log.$sym87$SHOP_LOG_LOG_MULTIBINDING_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)shop_log.$sym88$PLANNER_RULE_LINK, (SubLObject)shop_log.$sym5$SHOP_LOG, (SubLObject)shop_log.$list24, (SubLObject)shop_log.$list47, (SubLObject)shop_log.$list89);
        methods.subloop_register_instance_method((SubLObject)shop_log.$sym5$SHOP_LOG, (SubLObject)shop_log.$sym88$PLANNER_RULE_LINK, (SubLObject)shop_log.$sym90$SHOP_LOG_PLANNER_RULE_LINK_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)shop_log.$sym91$DISPLAY_FANCY_ENTRY, (SubLObject)shop_log.$sym5$SHOP_LOG, (SubLObject)shop_log.$list24, (SubLObject)shop_log.$list47, (SubLObject)shop_log.$list92);
        methods.subloop_register_instance_method((SubLObject)shop_log.$sym5$SHOP_LOG, (SubLObject)shop_log.$sym91$DISPLAY_FANCY_ENTRY, (SubLObject)shop_log.$sym95$SHOP_LOG_DISPLAY_FANCY_ENTRY_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)shop_log.$sym96$DISPLAY_MULTIBINDING, (SubLObject)shop_log.$sym5$SHOP_LOG, (SubLObject)shop_log.$list24, (SubLObject)shop_log.$list47, (SubLObject)shop_log.$list97);
        methods.subloop_register_instance_method((SubLObject)shop_log.$sym5$SHOP_LOG, (SubLObject)shop_log.$sym96$DISPLAY_MULTIBINDING, (SubLObject)shop_log.$sym104$SHOP_LOG_DISPLAY_MULTIBINDING_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)shop_log.$sym105$INFERENCE_LINK, (SubLObject)shop_log.$sym5$SHOP_LOG, (SubLObject)shop_log.$list24, (SubLObject)shop_log.$list106, (SubLObject)shop_log.$list107);
        methods.subloop_register_instance_method((SubLObject)shop_log.$sym5$SHOP_LOG, (SubLObject)shop_log.$sym105$INFERENCE_LINK, (SubLObject)shop_log.$sym111$SHOP_LOG_INFERENCE_LINK_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)shop_log.$sym112$DISPLAY_COLOR_ENTRY, (SubLObject)shop_log.$sym5$SHOP_LOG, (SubLObject)shop_log.$list24, (SubLObject)shop_log.$list106, (SubLObject)shop_log.$list113);
        methods.subloop_register_instance_method((SubLObject)shop_log.$sym5$SHOP_LOG, (SubLObject)shop_log.$sym112$DISPLAY_COLOR_ENTRY, (SubLObject)shop_log.$sym115$SHOP_LOG_DISPLAY_COLOR_ENTRY_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)shop_log.$sym116$DISPLAY_PARTIAL_PLAN, (SubLObject)shop_log.$sym5$SHOP_LOG, (SubLObject)shop_log.$list24, (SubLObject)shop_log.$list106, (SubLObject)shop_log.$list117);
        methods.subloop_register_instance_method((SubLObject)shop_log.$sym5$SHOP_LOG, (SubLObject)shop_log.$sym116$DISPLAY_PARTIAL_PLAN, (SubLObject)shop_log.$sym118$SHOP_LOG_DISPLAY_PARTIAL_PLAN_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)shop_log.$sym119$DISPLAY_SWITCHABLE_PARTIAL_PLAN, (SubLObject)shop_log.$sym5$SHOP_LOG, (SubLObject)shop_log.$list24, (SubLObject)shop_log.$list106, (SubLObject)shop_log.$list120);
        methods.subloop_register_instance_method((SubLObject)shop_log.$sym5$SHOP_LOG, (SubLObject)shop_log.$sym119$DISPLAY_SWITCHABLE_PARTIAL_PLAN, (SubLObject)shop_log.$sym128$SHOP_LOG_DISPLAY_SWITCHABLE_PARTIAL_PLAN_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)shop_log.$sym130$DISPLAY_HTML_LOG, (SubLObject)shop_log.$sym5$SHOP_LOG, (SubLObject)shop_log.$list30, (SubLObject)shop_log.NIL, (SubLObject)shop_log.$list131);
        methods.subloop_register_instance_method((SubLObject)shop_log.$sym5$SHOP_LOG, (SubLObject)shop_log.$sym130$DISPLAY_HTML_LOG, (SubLObject)shop_log.$sym134$SHOP_LOG_DISPLAY_HTML_LOG_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)shop_log.$sym135$SET_VERBOSITY, (SubLObject)shop_log.$sym5$SHOP_LOG, (SubLObject)shop_log.$list30, (SubLObject)shop_log.$list136, (SubLObject)shop_log.$list137);
        methods.subloop_register_instance_method((SubLObject)shop_log.$sym5$SHOP_LOG, (SubLObject)shop_log.$sym135$SET_VERBOSITY, (SubLObject)shop_log.$sym141$SHOP_LOG_SET_VERBOSITY_METHOD);
        return (SubLObject)shop_log.NIL;
    }
    
    @Override
	public void declareFunctions() {
        declare_shop_log_file();
    }
    
    @Override
	public void initializeVariables() {
        init_shop_log_file();
    }
    
    @Override
	public void runTopLevelForms() {
        setup_shop_log_file();
    }
    
    static {
        me = (SubLFile)new shop_log();
        shop_log.$shop_log_entry_map$ = null;
        $sym0$PROCESS_LOG = SubLObjectFactory.makeSymbol("PROCESS-LOG");
        $list1 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("LOG-ENTRY"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ITEM")), (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("WARNING"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ITEM")), (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("SUCCESS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ITEM")), (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("NEW-SECTION"), (SubLObject)shop_log.NIL, (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("DISPLAY-HTML-LOG"), (SubLObject)shop_log.NIL, (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")));
        $sym2$HTML_PROCESS_LOG = SubLObjectFactory.makeSymbol("HTML-PROCESS-LOG");
        $list3 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("EXTENDS"), (SubLObject)SubLObjectFactory.makeSymbol("PROCESS-LOG"));
        $list4 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("COLOR-LOG-ENTRY"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ITEM"), (SubLObject)SubLObjectFactory.makeSymbol("COLOR")), (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("LOG-FANCY-ENTRY"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ITEM"), (SubLObject)SubLObjectFactory.makeSymbol("MOD-LIST")), (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("LOG-HEADING"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ENTRY")), (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("LOG-PREFORMATTED"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ENTRY")), (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")));
        $sym5$SHOP_LOG = SubLObjectFactory.makeSymbol("SHOP-LOG");
        $sym6$OBJECT = SubLObjectFactory.makeSymbol("OBJECT");
        $list7 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("HTML-PROCESS-LOG"));
        $list8 = ConsesLow.list(new SubLObject[] { ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("LOG"), (SubLObject)SubLObjectFactory.makeKeyword("INSTANCE"), (SubLObject)SubLObjectFactory.makeKeyword("PROTECTED")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("STREAM"), (SubLObject)SubLObjectFactory.makeKeyword("INSTANCE"), (SubLObject)SubLObjectFactory.makeKeyword("PROTECTED")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("VERBOSE"), (SubLObject)SubLObjectFactory.makeKeyword("INSTANCE"), (SubLObject)SubLObjectFactory.makeKeyword("PROTECTED")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ISG"), (SubLObject)SubLObjectFactory.makeKeyword("INSTANCE"), (SubLObject)SubLObjectFactory.makeKeyword("PROTECTED")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("ADD-TO-LOG"), (SubLObject)shop_log.NIL, (SubLObject)SubLObjectFactory.makeKeyword("PRIVATE")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("SET-VERBOSITY"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NEW-VERBOSE")), (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("DISPLAY-FANCY-ENTRY"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("LOG-ENTRY")), (SubLObject)SubLObjectFactory.makeKeyword("PRIVATE")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("DISPLAY-COLOR-ENTRY"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("LOG-ENTRY")), (SubLObject)SubLObjectFactory.makeKeyword("PRIVATE")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("INFERENCE-LINK"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("LOG-ENTRY")), (SubLObject)SubLObjectFactory.makeKeyword("PRIVATE")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("METHOD-LINK"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("LOG-ENTRY")), (SubLObject)SubLObjectFactory.makeKeyword("PRIVATE")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("DISPLAY-PARTIAL-PLAN"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("LOG-ENTRY")), (SubLObject)SubLObjectFactory.makeKeyword("PRIVATE")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("DISPLAY-SWITCHABLE-PARTIAL-PLAN"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("LOG-ENTRY")), (SubLObject)SubLObjectFactory.makeKeyword("PRIVATE")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("LOG-PLANNER-RULE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RULE")), (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("LOG-INFERENCE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("BINDINGS"), (SubLObject)SubLObjectFactory.makeSymbol("RESULTS"), (SubLObject)SubLObjectFactory.makeSymbol("HALT-STATUS"), (SubLObject)SubLObjectFactory.makeSymbol("INFERENCE")), (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("LOG-PARTIAL-PLAN"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ENTRY")), (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")) });
        $sym9$ISG = SubLObjectFactory.makeSymbol("ISG");
        $sym10$VERBOSE = SubLObjectFactory.makeSymbol("VERBOSE");
        $sym11$STREAM = SubLObjectFactory.makeSymbol("STREAM");
        $sym12$LOG = SubLObjectFactory.makeSymbol("LOG");
        $sym13$INSTANCE_COUNT = SubLObjectFactory.makeSymbol("INSTANCE-COUNT");
        $sym14$SUBLOOP_RESERVED_INITIALIZE_SHOP_LOG_CLASS = SubLObjectFactory.makeSymbol("SUBLOOP-RESERVED-INITIALIZE-SHOP-LOG-CLASS");
        $sym15$ISOLATED_P = SubLObjectFactory.makeSymbol("ISOLATED-P");
        $sym16$INSTANCE_NUMBER = SubLObjectFactory.makeSymbol("INSTANCE-NUMBER");
        $sym17$SUBLOOP_RESERVED_INITIALIZE_SHOP_LOG_INSTANCE = SubLObjectFactory.makeSymbol("SUBLOOP-RESERVED-INITIALIZE-SHOP-LOG-INSTANCE");
        $sym18$INITIALIZE = SubLObjectFactory.makeSymbol("INITIALIZE");
        $list19 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("PROTECTED"));
        $list20 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("INITIALIZE"), (SubLObject)SubLObjectFactory.makeSymbol("SUPER")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("VERBOSE"), (SubLObject)shop_log.ZERO_INTEGER), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("STREAM"), (SubLObject)shop_log.T), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("LOG"), (SubLObject)shop_log.NIL), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("ISG"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NEW-INTEGER-SEQUENCE-GENERATOR"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("SELF")));
        $sym21$OUTER_CATCH_FOR_SHOP_LOG_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-SHOP-LOG-METHOD");
        $sym22$SHOP_LOG_INITIALIZE_METHOD = SubLObjectFactory.makeSymbol("SHOP-LOG-INITIALIZE-METHOD");
        $sym23$ADD_TO_LOG = SubLObjectFactory.makeSymbol("ADD-TO-LOG");
        $list24 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("PRIVATE"));
        $list25 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ITEM"));
        $list26 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("LOG"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CONS"), (SubLObject)SubLObjectFactory.makeSymbol("ITEM"), (SubLObject)SubLObjectFactory.makeSymbol("LOG"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PWHEN"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("STRINGP"), (SubLObject)SubLObjectFactory.makeSymbol("ITEM")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PRINC"), (SubLObject)SubLObjectFactory.makeSymbol("ITEM"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("ITEM")));
        $sym27$OUTER_CATCH_FOR_SHOP_LOG_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-SHOP-LOG-METHOD");
        $sym28$SHOP_LOG_ADD_TO_LOG_METHOD = SubLObjectFactory.makeSymbol("SHOP-LOG-ADD-TO-LOG-METHOD");
        $sym29$LOG_NEWLINE = SubLObjectFactory.makeSymbol("LOG-NEWLINE");
        $list30 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("PUBLIC"));
        $list31 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ADD-TO-LOG"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)SubLObjectFactory.makeKeyword("NEWLINE"))));
        $kw32$NEWLINE = SubLObjectFactory.makeKeyword("NEWLINE");
        $sym33$SHOP_LOG_LOG_NEWLINE_METHOD = SubLObjectFactory.makeSymbol("SHOP-LOG-LOG-NEWLINE-METHOD");
        $sym34$LOG_ENTRY = SubLObjectFactory.makeSymbol("LOG-ENTRY");
        $list35 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ADD-TO-LOG"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)SubLObjectFactory.makeSymbol("ITEM"))));
        $sym36$SHOP_LOG_LOG_ENTRY_METHOD = SubLObjectFactory.makeSymbol("SHOP-LOG-LOG-ENTRY-METHOD");
        $sym37$LOG_PREFORMATTED = SubLObjectFactory.makeSymbol("LOG-PREFORMATTED");
        $list38 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ADD-TO-LOG"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CONS"), (SubLObject)SubLObjectFactory.makeKeyword("PRE"), (SubLObject)SubLObjectFactory.makeSymbol("ITEM")))));
        $kw39$PRE = SubLObjectFactory.makeKeyword("PRE");
        $sym40$SHOP_LOG_LOG_PREFORMATTED_METHOD = SubLObjectFactory.makeSymbol("SHOP-LOG-LOG-PREFORMATTED-METHOD");
        $sym41$LOG_FANCY_ENTRY = SubLObjectFactory.makeSymbol("LOG-FANCY-ENTRY");
        $list42 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ENTRY"), (SubLObject)SubLObjectFactory.makeSymbol("MOD-LIST"));
        $list43 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ADD-TO-LOG"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("LIST"), (SubLObject)SubLObjectFactory.makeKeyword("FANCY"), (SubLObject)SubLObjectFactory.makeSymbol("ENTRY"), (SubLObject)SubLObjectFactory.makeSymbol("MOD-LIST")))));
        $kw44$FANCY = SubLObjectFactory.makeKeyword("FANCY");
        $sym45$SHOP_LOG_LOG_FANCY_ENTRY_METHOD = SubLObjectFactory.makeSymbol("SHOP-LOG-LOG-FANCY-ENTRY-METHOD");
        $sym46$LOG_HEADING = SubLObjectFactory.makeSymbol("LOG-HEADING");
        $list47 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ENTRY"));
        $list48 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ADD-TO-LOG"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("LIST"), (SubLObject)SubLObjectFactory.makeKeyword("HEADING"), (SubLObject)SubLObjectFactory.makeSymbol("ENTRY")))));
        $kw49$HEADING = SubLObjectFactory.makeKeyword("HEADING");
        $sym50$SHOP_LOG_LOG_HEADING_METHOD = SubLObjectFactory.makeSymbol("SHOP-LOG-LOG-HEADING-METHOD");
        $sym51$LOG_PARTIAL_PLAN = SubLObjectFactory.makeSymbol("LOG-PARTIAL-PLAN");
        $list52 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ADD-TO-LOG"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("LIST"), (SubLObject)SubLObjectFactory.makeKeyword("PARTIAL-PLAN"), (SubLObject)SubLObjectFactory.makeSymbol("ENTRY")))));
        $kw53$PARTIAL_PLAN = SubLObjectFactory.makeKeyword("PARTIAL-PLAN");
        $sym54$SHOP_LOG_LOG_PARTIAL_PLAN_METHOD = SubLObjectFactory.makeSymbol("SHOP-LOG-LOG-PARTIAL-PLAN-METHOD");
        $sym55$COLOR_LOG_ENTRY = SubLObjectFactory.makeSymbol("COLOR-LOG-ENTRY");
        $list56 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ITEM"), (SubLObject)SubLObjectFactory.makeSymbol("COLOR"));
        $list57 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("Log ITEM so it shows in HTML in COLOR."), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ADD-TO-LOG"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("LIST"), (SubLObject)SubLObjectFactory.makeKeyword("COLOR"), (SubLObject)SubLObjectFactory.makeSymbol("COLOR"), (SubLObject)SubLObjectFactory.makeSymbol("ITEM")))));
        $kw58$COLOR = SubLObjectFactory.makeKeyword("COLOR");
        $sym59$SHOP_LOG_COLOR_LOG_ENTRY_METHOD = SubLObjectFactory.makeSymbol("SHOP-LOG-COLOR-LOG-ENTRY-METHOD");
        $sym60$WARNING = SubLObjectFactory.makeSymbol("WARNING");
        $list61 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("Log item in a warning color (red)"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("COLOR-LOG-ENTRY"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)SubLObjectFactory.makeSymbol("ITEM"), (SubLObject)SubLObjectFactory.makeKeyword("RED"))));
        $kw62$RED = SubLObjectFactory.makeKeyword("RED");
        $sym63$SHOP_LOG_WARNING_METHOD = SubLObjectFactory.makeSymbol("SHOP-LOG-WARNING-METHOD");
        $sym64$SUCCESS = SubLObjectFactory.makeSymbol("SUCCESS");
        $list65 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("Log item in a success color (green)"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("COLOR-LOG-ENTRY"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)SubLObjectFactory.makeSymbol("ITEM"), (SubLObject)SubLObjectFactory.makeKeyword("DARK-GREEN"))));
        $kw66$DARK_GREEN = SubLObjectFactory.makeKeyword("DARK-GREEN");
        $sym67$SHOP_LOG_SUCCESS_METHOD = SubLObjectFactory.makeSymbol("SHOP-LOG-SUCCESS-METHOD");
        $sym68$NEW_SECTION = SubLObjectFactory.makeSymbol("NEW-SECTION");
        $list69 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("Signals a horizontal rule in the log output"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ADD-TO-LOG"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)SubLObjectFactory.makeKeyword("HR"))));
        $kw70$HR = SubLObjectFactory.makeKeyword("HR");
        $sym71$SHOP_LOG_NEW_SECTION_METHOD = SubLObjectFactory.makeSymbol("SHOP-LOG-NEW-SECTION-METHOD");
        $sym72$LOG_PLANNER_RULE = SubLObjectFactory.makeSymbol("LOG-PLANNER-RULE");
        $list73 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RULE"));
        $list74 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("@param RULE shop-basic-planner-rule-p"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ADD-TO-LOG"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("LIST"), (SubLObject)SubLObjectFactory.makeKeyword("RULE"), (SubLObject)SubLObjectFactory.makeSymbol("RULE")))));
        $kw75$RULE = SubLObjectFactory.makeKeyword("RULE");
        $sym76$SHOP_LOG_LOG_PLANNER_RULE_METHOD = SubLObjectFactory.makeSymbol("SHOP-LOG-LOG-PLANNER-RULE-METHOD");
        $sym77$LOG_INFERENCE = SubLObjectFactory.makeSymbol("LOG-INFERENCE");
        $list78 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("BINDINGS"), (SubLObject)SubLObjectFactory.makeSymbol("HALT-REASON"), (SubLObject)SubLObjectFactory.makeSymbol("INFERENCE"));
        $list79 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("@param BINDINGS listp\n   @param INFERENCE inference-p"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CHECK-TYPE"), (SubLObject)SubLObjectFactory.makeSymbol("INFERENCE"), (SubLObject)SubLObjectFactory.makeSymbol("INFERENCE-P")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ADD-TO-LOG"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("LIST"), (SubLObject)SubLObjectFactory.makeKeyword("INFERENCE"), (SubLObject)SubLObjectFactory.makeSymbol("BINDINGS"), (SubLObject)SubLObjectFactory.makeSymbol("HALT-REASON"), (SubLObject)SubLObjectFactory.makeSymbol("INFERENCE")))));
        $sym80$INFERENCE_P = SubLObjectFactory.makeSymbol("INFERENCE-P");
        $kw81$INFERENCE = SubLObjectFactory.makeKeyword("INFERENCE");
        $sym82$SHOP_LOG_LOG_INFERENCE_METHOD = SubLObjectFactory.makeSymbol("SHOP-LOG-LOG-INFERENCE-METHOD");
        $sym83$LOG_MULTIBINDING = SubLObjectFactory.makeSymbol("LOG-MULTIBINDING");
        $list84 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("MBIND"));
        $list85 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("@param RULE multibinding-p"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ADD-TO-LOG"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("LIST"), (SubLObject)SubLObjectFactory.makeKeyword("MBIND"), (SubLObject)SubLObjectFactory.makeSymbol("MBIND")))));
        $kw86$MBIND = SubLObjectFactory.makeKeyword("MBIND");
        $sym87$SHOP_LOG_LOG_MULTIBINDING_METHOD = SubLObjectFactory.makeSymbol("SHOP-LOG-LOG-MULTIBINDING-METHOD");
        $sym88$PLANNER_RULE_LINK = SubLObjectFactory.makeSymbol("PLANNER-RULE-LINK");
        $list89 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RULE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SECOND"), (SubLObject)SubLObjectFactory.makeSymbol("ENTRY"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ASS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIRST"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("INLINE-METHOD"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ASSERTIONS"), (SubLObject)SubLObjectFactory.makeSymbol("SHOP-BASIC-PLANNER-RULE")), (SubLObject)SubLObjectFactory.makeSymbol("RULE"))))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PWHEN"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ASSERTION-P"), (SubLObject)SubLObjectFactory.makeSymbol("ASS")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CB-SHOW-ASSERTION-READABLY"), (SubLObject)SubLObjectFactory.makeSymbol("ASS"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)shop_log.NIL)));
        $sym90$SHOP_LOG_PLANNER_RULE_LINK_METHOD = SubLObjectFactory.makeSymbol("SHOP-LOG-PLANNER-RULE-LINK-METHOD");
        $sym91$DISPLAY_FANCY_ENTRY = SubLObjectFactory.makeSymbol("DISPLAY-FANCY-ENTRY");
        $list92 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("only :bold supported for now"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CDESTRUCTURING-BIND"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ITEM"), (SubLObject)SubLObjectFactory.makeSymbol("MOD-LIST")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("REST"), (SubLObject)SubLObjectFactory.makeSymbol("ENTRY")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PWHEN"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("MEMBER?"), (SubLObject)SubLObjectFactory.makeKeyword("BOLD"), (SubLObject)SubLObjectFactory.makeSymbol("MOD-LIST")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("HTML-STRONG"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("HTML-PRINC"), (SubLObject)SubLObjectFactory.makeSymbol("ITEM"))))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)shop_log.NIL));
        $list93 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ITEM"), (SubLObject)SubLObjectFactory.makeSymbol("MOD-LIST"));
        $kw94$BOLD = SubLObjectFactory.makeKeyword("BOLD");
        $sym95$SHOP_LOG_DISPLAY_FANCY_ENTRY_METHOD = SubLObjectFactory.makeSymbol("SHOP-LOG-DISPLAY-FANCY-ENTRY-METHOD");
        $sym96$DISPLAY_MULTIBINDING = SubLObjectFactory.makeSymbol("DISPLAY-MULTIBINDING");
        $list97 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("MB"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SECOND"), (SubLObject)SubLObjectFactory.makeSymbol("ENTRY"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ALIST"), (SubLObject)shop_log.NIL)), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DO-MBIND"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("VAR"), (SubLObject)SubLObjectFactory.makeSymbol("VALUES"), (SubLObject)SubLObjectFactory.makeSymbol("MB")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ALIST-ENTER"), (SubLObject)SubLObjectFactory.makeSymbol("ALIST"), (SubLObject)SubLObjectFactory.makeSymbol("VAR"), (SubLObject)SubLObjectFactory.makeSymbol("VALUES"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SORT"), (SubLObject)SubLObjectFactory.makeSymbol("ALIST"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("STRING<")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("SHOP-VAR-NAME"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DO-ALIST"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("VAR"), (SubLObject)SubLObjectFactory.makeSymbol("VALUES"), (SubLObject)SubLObjectFactory.makeSymbol("ALIST")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("HTML-FORMAT"), (SubLObject)SubLObjectFactory.makeString("~s -->"), (SubLObject)SubLObjectFactory.makeSymbol("VAR")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CDOLIST"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CUR-VAL"), (SubLObject)SubLObjectFactory.makeSymbol("VALUES")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("HTML-FORMAT"), (SubLObject)SubLObjectFactory.makeString(" ~s"), (SubLObject)SubLObjectFactory.makeSymbol("CUR-VAL"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("HTML-NEWLINE"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)shop_log.NIL)));
        $sym98$FIRST = SubLObjectFactory.makeSymbol("FIRST");
        $sym99$STRING_ = SubLObjectFactory.makeSymbol("STRING<");
        $sym100$SHOP_VAR_NAME = SubLObjectFactory.makeSymbol("SHOP-VAR-NAME");
        $list101 = (SubLList)ConsesLow.cons((SubLObject)SubLObjectFactory.makeSymbol("VAR"), (SubLObject)SubLObjectFactory.makeSymbol("VALUES"));
        $str102$_s____ = SubLObjectFactory.makeString("~s -->");
        $str103$__s = SubLObjectFactory.makeString(" ~s");
        $sym104$SHOP_LOG_DISPLAY_MULTIBINDING_METHOD = SubLObjectFactory.makeSymbol("SHOP-LOG-DISPLAY-MULTIBINDING-METHOD");
        $sym105$INFERENCE_LINK = SubLObjectFactory.makeSymbol("INFERENCE-LINK");
        $list106 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("LOG-ENTRY"));
        $list107 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CDESTRUCTURING-BIND"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("BINDINGS"), (SubLObject)SubLObjectFactory.makeSymbol("HALT-REASON"), (SubLObject)SubLObjectFactory.makeSymbol("INFERENCE")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("REST"), (SubLObject)SubLObjectFactory.makeSymbol("LOG-ENTRY")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NUM-BINDINGS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("LENGTH"), (SubLObject)SubLObjectFactory.makeSymbol("BINDINGS"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("INFERENCE-NAME"), (SubLObject)SubLObjectFactory.makeString("[Examine Inference]"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("HTML-NEWLINE"), (SubLObject)shop_log.TWO_INTEGER), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("HTML-FORMAT"), (SubLObject)SubLObjectFactory.makeString("# returned bindings: ~s"), (SubLObject)SubLObjectFactory.makeSymbol("NUM-BINDINGS")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("HTML-INDENT"), (SubLObject)shop_log.TWO_INTEGER), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("HTML-EM"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("HTML-FORMAT"), (SubLObject)SubLObjectFactory.makeString("~s"), (SubLObject)SubLObjectFactory.makeSymbol("HALT-REASON"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PUNLESS-FEATURE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("OR"), (SubLObject)SubLObjectFactory.makeKeyword("CYC-OPENCYC"), (SubLObject)SubLObjectFactory.makeKeyword("CYC-RESEARCHCYC")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("HTML-INDENT"), (SubLObject)shop_log.TWO_INTEGER), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CB-LINK"), (SubLObject)SubLObjectFactory.makeKeyword("INFERENCE"), (SubLObject)SubLObjectFactory.makeSymbol("INFERENCE"), (SubLObject)shop_log.NIL, (SubLObject)SubLObjectFactory.makeSymbol("INFERENCE-NAME"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("HTML-NEWLINE"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)shop_log.NIL)));
        $str108$_Examine_Inference_ = SubLObjectFactory.makeString("[Examine Inference]");
        $str109$__returned_bindings___s = SubLObjectFactory.makeString("# returned bindings: ~s");
        $str110$_s = SubLObjectFactory.makeString("~s");
        $sym111$SHOP_LOG_INFERENCE_LINK_METHOD = SubLObjectFactory.makeSymbol("SHOP-LOG-INFERENCE-LINK-METHOD");
        $sym112$DISPLAY_COLOR_ENTRY = SubLObjectFactory.makeSymbol("DISPLAY-COLOR-ENTRY");
        $list113 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CDESTRUCTURING-BIND"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("COLOR"), (SubLObject)SubLObjectFactory.makeSymbol("ENTRY")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("REST"), (SubLObject)SubLObjectFactory.makeSymbol("LOG-ENTRY")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("HTML-FONT-COLOR"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("COLOR")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("HTML-PRE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CB-FORM"), (SubLObject)SubLObjectFactory.makeSymbol("ENTRY"))))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)shop_log.NIL));
        $list114 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("COLOR"), (SubLObject)SubLObjectFactory.makeSymbol("ENTRY"));
        $sym115$SHOP_LOG_DISPLAY_COLOR_ENTRY_METHOD = SubLObjectFactory.makeSymbol("SHOP-LOG-DISPLAY-COLOR-ENTRY-METHOD");
        $sym116$DISPLAY_PARTIAL_PLAN = SubLObjectFactory.makeSymbol("DISPLAY-PARTIAL-PLAN");
        $list117 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("Display partial plan cleanly"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PARTIAL-PLAN"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SECOND"), (SubLObject)SubLObjectFactory.makeSymbol("LOG-ENTRY")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CDOLIST"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("STEP"), (SubLObject)SubLObjectFactory.makeSymbol("PARTIAL-PLAN")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CB-FORM"), (SubLObject)SubLObjectFactory.makeSymbol("STEP")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("HTML-NEWLINE")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)shop_log.NIL));
        $sym118$SHOP_LOG_DISPLAY_PARTIAL_PLAN_METHOD = SubLObjectFactory.makeSymbol("SHOP-LOG-DISPLAY-PARTIAL-PLAN-METHOD");
        $sym119$DISPLAY_SWITCHABLE_PARTIAL_PLAN = SubLObjectFactory.makeSymbol("DISPLAY-SWITCHABLE-PARTIAL-PLAN");
        $list120 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ID"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("INTEGER-SEQUENCE-GENERATOR-NEXT"), (SubLObject)SubLObjectFactory.makeSymbol("ISG"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("OBJECT-ID"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CCONCATENATE"), (SubLObject)SubLObjectFactory.makeString("partial-plan-"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("WRITE-TO-STRING"), (SubLObject)SubLObjectFactory.makeSymbol("ID"))))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("HTML-STRONG"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("HTML-PRINC"), (SubLObject)SubLObjectFactory.makeString("Partial Plan"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("HTML-INDENT")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DHTML-SWITCH-VISIBILITY-LINKS"), (SubLObject)SubLObjectFactory.makeSymbol("OBJECT-ID"), (SubLObject)SubLObjectFactory.makeString("[Show]"), (SubLObject)SubLObjectFactory.makeString("[Hide]")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("HTML-NEWLINE")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DHTML-POTENTIALLY-SHOW-SWITCHED"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("OBJECT-ID"), (SubLObject)SubLObjectFactory.makeKeyword("INITIAL-VISIBILITY"), (SubLObject)SubLObjectFactory.makeKeyword("INVISIBLE"), (SubLObject)SubLObjectFactory.makeKeyword("FLOW-TYPE"), (SubLObject)SubLObjectFactory.makeKeyword("PARAGRAPH")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DISPLAY-PARTIAL-PLAN"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)SubLObjectFactory.makeSymbol("LOG-ENTRY")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)shop_log.NIL));
        $sym121$OUTER_CATCH_FOR_SHOP_LOG_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-SHOP-LOG-METHOD");
        $str122$partial_plan_ = SubLObjectFactory.makeString("partial-plan-");
        $str123$Partial_Plan = SubLObjectFactory.makeString("Partial Plan");
        $str124$_Show_ = SubLObjectFactory.makeString("[Show]");
        $str125$_Hide_ = SubLObjectFactory.makeString("[Hide]");
        $kw126$INVISIBLE = SubLObjectFactory.makeKeyword("INVISIBLE");
        $kw127$PARAGRAPH = SubLObjectFactory.makeKeyword("PARAGRAPH");
        $sym128$SHOP_LOG_DISPLAY_SWITCHABLE_PARTIAL_PLAN_METHOD = SubLObjectFactory.makeSymbol("SHOP-LOG-DISPLAY-SWITCHABLE-PARTIAL-PLAN-METHOD");
        $list129 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("COLOR"), (SubLObject)SubLObjectFactory.makeSymbol("DISPLAY-COLOR-ENTRY")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("RULE"), (SubLObject)SubLObjectFactory.makeSymbol("PLANNER-RULE-LINK")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("INFERENCE"), (SubLObject)SubLObjectFactory.makeSymbol("INFERENCE-LINK")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("MBIND"), (SubLObject)SubLObjectFactory.makeSymbol("DISPLAY-MULTIBINDING")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("FANCY"), (SubLObject)SubLObjectFactory.makeSymbol("DISPLAY-FANCY-ENTRY")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("PARTIAL-PLAN"), (SubLObject)SubLObjectFactory.makeSymbol("DISPLAY-SWITCHABLE-PARTIAL-PLAN")));
        $sym130$DISPLAY_HTML_LOG = SubLObjectFactory.makeSymbol("DISPLAY-HTML-LOG");
        $list131 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("INTEGER-SEQUENCE-GENERATOR-RESET"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("GET-SLOT"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("ISG")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CDOLIST"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ITEM"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("REVERSE"), (SubLObject)SubLObjectFactory.makeSymbol("LOG"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PCOND"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("KEYWORDP"), (SubLObject)SubLObjectFactory.makeSymbol("ITEM")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PCASE"), (SubLObject)SubLObjectFactory.makeSymbol("ITEM"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("HR"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("HTML-HR"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("NEWLINE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("HTML-NEWLINE"))))), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("LISTP"), (SubLObject)SubLObjectFactory.makeSymbol("ITEM")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PCASE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIRST"), (SubLObject)SubLObjectFactory.makeSymbol("ITEM")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("PRE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("HTML-PRE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CB-FORM"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CDR"), (SubLObject)SubLObjectFactory.makeSymbol("ITEM"))))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("HEADING"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("HTML-HEADING"), (SubLObject)ConsesLow.list((SubLObject)shop_log.THREE_INTEGER), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("HTML-PRINC"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SECOND"), (SubLObject)SubLObjectFactory.makeSymbol("ITEM"))))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("OTHERWISE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("METHOD"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SECOND"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ASSOC"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIRST"), (SubLObject)SubLObjectFactory.makeSymbol("ITEM")), (SubLObject)SubLObjectFactory.makeSymbol("*SHOP-LOG-ENTRY-MAP*"))))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)SubLObjectFactory.makeSymbol("METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("ITEM")))))), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("STRINGP"), (SubLObject)SubLObjectFactory.makeSymbol("ITEM")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PIF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SUBSTRING?"), (SubLObject)SubLObjectFactory.makeString("#$"), (SubLObject)SubLObjectFactory.makeSymbol("ITEM")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CB-FORM"), (SubLObject)SubLObjectFactory.makeSymbol("ITEM")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("HTML-PRINC"), (SubLObject)SubLObjectFactory.makeSymbol("ITEM"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("HTML-BR"))))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)shop_log.NIL));
        $sym132$OUTER_CATCH_FOR_SHOP_LOG_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-SHOP-LOG-METHOD");
        $str133$__ = SubLObjectFactory.makeString("#$");
        $sym134$SHOP_LOG_DISPLAY_HTML_LOG_METHOD = SubLObjectFactory.makeSymbol("SHOP-LOG-DISPLAY-HTML-LOG-METHOD");
        $sym135$SET_VERBOSITY = SubLObjectFactory.makeSymbol("SET-VERBOSITY");
        $list136 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NEW-VERBOSE"));
        $list137 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PCOND"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NUMBERP"), (SubLObject)SubLObjectFactory.makeSymbol("NEW-VERBOSE")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("VERBOSE"), (SubLObject)SubLObjectFactory.makeSymbol("NEW-VERBOSE"))), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("KEYWORDP"), (SubLObject)SubLObjectFactory.makeSymbol("NEW-VERBOSE")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("VERBOSE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("REST"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ASSOC"), (SubLObject)SubLObjectFactory.makeSymbol("NEW-VERBOSE"), (SubLObject)SubLObjectFactory.makeSymbol("*SHOP-VERBOSE-KEYS*"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FUNCTION"), (SubLObject)SubLObjectFactory.makeSymbol("MEMBER")))))), (SubLObject)ConsesLow.list((SubLObject)shop_log.T, (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CERROR"), (SubLObject)SubLObjectFactory.makeString("~s is not a permissible value for VERBOSE"), (SubLObject)SubLObjectFactory.makeSymbol("NEW-VERBOSE")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)shop_log.NIL));
        $sym138$OUTER_CATCH_FOR_SHOP_LOG_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-SHOP-LOG-METHOD");
        $sym139$MEMBER = SubLObjectFactory.makeSymbol("MEMBER");
        $str140$_s_is_not_a_permissible_value_for = SubLObjectFactory.makeString("~s is not a permissible value for VERBOSE");
        $sym141$SHOP_LOG_SET_VERBOSITY_METHOD = SubLObjectFactory.makeSymbol("SHOP-LOG-SET-VERBOSITY-METHOD");
    }
}

/*

	Total time: 465 ms
	
*/