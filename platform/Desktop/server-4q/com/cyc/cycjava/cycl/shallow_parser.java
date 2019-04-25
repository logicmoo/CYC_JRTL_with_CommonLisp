package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.cycjava.cycl.quirk.external_interfaces;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLFloat;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class shallow_parser extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.shallow_parser";
    public static final String myFingerPrint = "a67cb851272e4a2a8c6ce91f0e0f4f92092f72d26693b092c9c3052536965054";
    private static final SubLSymbol $sym0$SHALLOW_PARSER;
    private static final SubLSymbol $sym1$OBJECT;
    private static final SubLList $list2;
    private static final SubLSymbol $sym3$TIME;
    private static final SubLSymbol $sym4$ERROR_HANDLING;
    private static final SubLSymbol $sym5$INSTANCE_COUNT;
    private static final SubLSymbol $sym6$SUBLOOP_RESERVED_INITIALIZE_SHALLOW_PARSER_CLASS;
    private static final SubLSymbol $sym7$ISOLATED_P;
    private static final SubLSymbol $sym8$INSTANCE_NUMBER;
    private static final SubLSymbol $sym9$SUBLOOP_RESERVED_INITIALIZE_SHALLOW_PARSER_INSTANCE;
    private static final SubLSymbol $sym10$INITIALIZE;
    private static final SubLList $list11;
    private static final SubLList $list12;
    private static final SubLSymbol $sym13$OUTER_CATCH_FOR_SHALLOW_PARSER_METHOD;
    private static final SubLSymbol $kw14$THROW;
    private static final SubLSymbol $sym15$SHALLOW_PARSER_INITIALIZE_METHOD;
    private static final SubLList $list16;
    private static final SubLString $str17$Invalid_error_handling_tag__a;
    private static final SubLString $str18$Invalid_timeout__a;
    private static final SubLFloat $float19$3_4028232e37;
    private static final SubLSymbol $sym20$PARSE;
    private static final SubLList $list21;
    private static final SubLList $list22;
    private static final SubLList $list23;
    private static final SubLSymbol $sym24$OUTER_CATCH_FOR_SHALLOW_PARSER_METHOD;
    private static final SubLSymbol $sym25$CATCH_ERROR_MESSAGE_HANDLER;
    private static final SubLString $str26$Shallow_Parser_timed_out_after__a;
    private static final SubLSymbol $sym27$NEW_PARSE_TREE;
    private static final SubLSymbol $sym28$SHALLOW_PARSER_PARSE_METHOD;
    private static final SubLSymbol $sym29$HANDLE_ERROR;
    private static final SubLList $list30;
    private static final SubLList $list31;
    private static final SubLList $list32;
    private static final SubLSymbol $sym33$OUTER_CATCH_FOR_SHALLOW_PARSER_METHOD;
    private static final SubLSymbol $kw34$WARN;
    private static final SubLSymbol $sym35$SHALLOW_PARSER_HANDLE_ERROR_METHOD;
    
    @SubLTranslatedFile.SubL(source = "cycl/shallow-parser.lisp", position = 925L)
    public static SubLObject get_shallow_parser_time(final SubLObject v_shallow_parser) {
        return classes.subloop_get_access_protected_instance_slot(v_shallow_parser, (SubLObject)shallow_parser.TWO_INTEGER, (SubLObject)shallow_parser.$sym3$TIME);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/shallow-parser.lisp", position = 925L)
    public static SubLObject set_shallow_parser_time(final SubLObject v_shallow_parser, final SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(v_shallow_parser, value, (SubLObject)shallow_parser.TWO_INTEGER, (SubLObject)shallow_parser.$sym3$TIME);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/shallow-parser.lisp", position = 925L)
    public static SubLObject get_shallow_parser_error_handling(final SubLObject v_shallow_parser) {
        return classes.subloop_get_access_protected_instance_slot(v_shallow_parser, (SubLObject)shallow_parser.ONE_INTEGER, (SubLObject)shallow_parser.$sym4$ERROR_HANDLING);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/shallow-parser.lisp", position = 925L)
    public static SubLObject set_shallow_parser_error_handling(final SubLObject v_shallow_parser, final SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(v_shallow_parser, value, (SubLObject)shallow_parser.ONE_INTEGER, (SubLObject)shallow_parser.$sym4$ERROR_HANDLING);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/shallow-parser.lisp", position = 925L)
    public static SubLObject subloop_reserved_initialize_shallow_parser_class(final SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, (SubLObject)shallow_parser.$sym1$OBJECT, (SubLObject)shallow_parser.$sym5$INSTANCE_COUNT, (SubLObject)shallow_parser.ZERO_INTEGER);
        return (SubLObject)shallow_parser.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/shallow-parser.lisp", position = 925L)
    public static SubLObject subloop_reserved_initialize_shallow_parser_instance(final SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, (SubLObject)shallow_parser.$sym1$OBJECT, (SubLObject)shallow_parser.$sym7$ISOLATED_P, (SubLObject)shallow_parser.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)shallow_parser.$sym1$OBJECT, (SubLObject)shallow_parser.$sym8$INSTANCE_NUMBER, (SubLObject)shallow_parser.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)shallow_parser.$sym0$SHALLOW_PARSER, (SubLObject)shallow_parser.$sym4$ERROR_HANDLING, (SubLObject)shallow_parser.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)shallow_parser.$sym0$SHALLOW_PARSER, (SubLObject)shallow_parser.$sym3$TIME, (SubLObject)shallow_parser.NIL);
        return (SubLObject)shallow_parser.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/shallow-parser.lisp", position = 925L)
    public static SubLObject shallow_parser_p(final SubLObject v_shallow_parser) {
        return classes.subloop_instanceof_class(v_shallow_parser, (SubLObject)shallow_parser.$sym0$SHALLOW_PARSER);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/shallow-parser.lisp", position = 1143L)
    public static SubLObject shallow_parser_initialize_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_shallow_parser_method = (SubLObject)shallow_parser.NIL;
        SubLObject time = get_shallow_parser_time(self);
        SubLObject error_handling = get_shallow_parser_error_handling(self);
        try {
            thread.throwStack.push(shallow_parser.$sym13$OUTER_CATCH_FOR_SHALLOW_PARSER_METHOD);
            try {
                object.object_initialize_method(self);
                error_handling = (SubLObject)shallow_parser.$kw14$THROW;
                time = (SubLObject)shallow_parser.FIVE_INTEGER;
                Dynamic.sublisp_throw((SubLObject)shallow_parser.$sym13$OUTER_CATCH_FOR_SHALLOW_PARSER_METHOD, self);
            }
            finally {
                final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)shallow_parser.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    set_shallow_parser_time(self, time);
                    set_shallow_parser_error_handling(self, error_handling);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        }
        catch (Throwable ccatch_env_var) {
            catch_var_for_shallow_parser_method = Errors.handleThrowable(ccatch_env_var, (SubLObject)shallow_parser.$sym13$OUTER_CATCH_FOR_SHALLOW_PARSER_METHOD);
        }
        finally {
            thread.throwStack.pop();
        }
        return catch_var_for_shallow_parser_method;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/shallow-parser.lisp", position = 1291L)
    public static SubLObject new_shallow_parser(SubLObject error_handling, SubLObject timeout) {
        if (error_handling == shallow_parser.UNPROVIDED) {
            error_handling = (SubLObject)shallow_parser.$kw14$THROW;
        }
        if (timeout == shallow_parser.UNPROVIDED) {
            timeout = (SubLObject)shallow_parser.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (shallow_parser.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && shallow_parser.NIL == conses_high.member(error_handling, (SubLObject)shallow_parser.$list16, (SubLObject)shallow_parser.UNPROVIDED, (SubLObject)shallow_parser.UNPROVIDED)) {
            Errors.error((SubLObject)shallow_parser.$str17$Invalid_error_handling_tag__a, error_handling);
        }
        if (shallow_parser.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && shallow_parser.NIL == subl_promotions.non_negative_integer_p(timeout) && shallow_parser.NIL != timeout) {
            Errors.error((SubLObject)shallow_parser.$str18$Invalid_timeout__a, timeout);
        }
        final SubLObject v_parser = object.new_class_instance((SubLObject)shallow_parser.$sym0$SHALLOW_PARSER);
        set_shallow_parser_error_handling(v_parser, error_handling);
        if (shallow_parser.NIL == timeout) {
            set_shallow_parser_time(v_parser, (SubLObject)shallow_parser.$float19$3_4028232e37);
        }
        else {
            set_shallow_parser_time(v_parser, timeout);
        }
        return v_parser;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/shallow-parser.lisp", position = 2056L)
    public static SubLObject shallow_parser_parse_method(final SubLObject self, final SubLObject text) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_shallow_parser_method = (SubLObject)shallow_parser.NIL;
        final SubLObject time = get_shallow_parser_time(self);
        try {
            thread.throwStack.push(shallow_parser.$sym24$OUTER_CATCH_FOR_SHALLOW_PARSER_METHOD);
            try {
                SubLObject parses = (SubLObject)shallow_parser.NIL;
                SubLObject error = (SubLObject)shallow_parser.NIL;
                SubLObject timeoutP = (SubLObject)shallow_parser.NIL;
                try {
                    thread.throwStack.push(subl_macro_promotions.$catch_error_message_target$.getGlobalValue());
                    final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
                    try {
                        Errors.$error_handler$.bind((SubLObject)shallow_parser.$sym25$CATCH_ERROR_MESSAGE_HANDLER, thread);
                        try {
                            final SubLObject tag = subl_macro_promotions.with_timeout_make_tag();
                            try {
                                thread.throwStack.push(tag);
                                final SubLObject _prev_bind_0_$1 = subl_macro_promotions.$within_with_timeout$.currentBinding(thread);
                                try {
                                    subl_macro_promotions.$within_with_timeout$.bind((SubLObject)shallow_parser.T, thread);
                                    SubLObject timer = (SubLObject)shallow_parser.NIL;
                                    try {
                                        final SubLObject _prev_bind_0_$2 = subl_macro_promotions.$with_timeout_nesting_depth$.currentBinding(thread);
                                        try {
                                            subl_macro_promotions.$with_timeout_nesting_depth$.bind(Numbers.add((SubLObject)shallow_parser.ONE_INTEGER, subl_macro_promotions.$with_timeout_nesting_depth$.getDynamicValue(thread)), thread);
                                            timer = subl_macro_promotions.with_timeout_start_timer(time, tag);
                                            parses = external_interfaces.shallow_parse(text, (SubLObject)shallow_parser.UNPROVIDED, (SubLObject)shallow_parser.UNPROVIDED, (SubLObject)shallow_parser.UNPROVIDED, (SubLObject)shallow_parser.UNPROVIDED);
                                        }
                                        finally {
                                            subl_macro_promotions.$with_timeout_nesting_depth$.rebind(_prev_bind_0_$2, thread);
                                        }
                                    }
                                    finally {
                                        final SubLObject _prev_bind_0_$3 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                        try {
                                            Threads.$is_thread_performing_cleanupP$.bind((SubLObject)shallow_parser.T, thread);
                                            final SubLObject _values = Values.getValuesAsVector();
                                            subl_macro_promotions.with_timeout_stop_timer(timer);
                                            Values.restoreValuesFromVector(_values);
                                        }
                                        finally {
                                            Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$3, thread);
                                        }
                                    }
                                }
                                finally {
                                    subl_macro_promotions.$within_with_timeout$.rebind(_prev_bind_0_$1, thread);
                                }
                            }
                            catch (Throwable ccatch_env_var) {
                                timeoutP = Errors.handleThrowable(ccatch_env_var, tag);
                            }
                            finally {
                                thread.throwStack.pop();
                            }
                            if (shallow_parser.NIL != timeoutP) {
                                Errors.error((SubLObject)shallow_parser.$str26$Shallow_Parser_timed_out_after__a, time);
                            }
                        }
                        catch (Throwable catch_var) {
                            Errors.handleThrowable(catch_var, (SubLObject)shallow_parser.NIL);
                        }
                    }
                    finally {
                        Errors.$error_handler$.rebind(_prev_bind_0, thread);
                    }
                }
                catch (Throwable ccatch_env_var2) {
                    error = Errors.handleThrowable(ccatch_env_var2, subl_macro_promotions.$catch_error_message_target$.getGlobalValue());
                }
                finally {
                    thread.throwStack.pop();
                }
                if (shallow_parser.NIL != error) {
                    shallow_parser_handle_error_method(self, error);
                }
                Dynamic.sublisp_throw((SubLObject)shallow_parser.$sym24$OUTER_CATCH_FOR_SHALLOW_PARSER_METHOD, Mapping.mapcar((SubLObject)shallow_parser.$sym27$NEW_PARSE_TREE, parses));
            }
            finally {
                final SubLObject _prev_bind_2 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)shallow_parser.T, thread);
                    final SubLObject _values2 = Values.getValuesAsVector();
                    set_shallow_parser_time(self, time);
                    Values.restoreValuesFromVector(_values2);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_2, thread);
                }
            }
        }
        catch (Throwable ccatch_env_var3) {
            catch_var_for_shallow_parser_method = Errors.handleThrowable(ccatch_env_var3, (SubLObject)shallow_parser.$sym24$OUTER_CATCH_FOR_SHALLOW_PARSER_METHOD);
        }
        finally {
            thread.throwStack.pop();
        }
        return catch_var_for_shallow_parser_method;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/shallow-parser.lisp", position = 2554L)
    public static SubLObject shallow_parser_handle_error_method(final SubLObject self, final SubLObject error) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_shallow_parser_method = (SubLObject)shallow_parser.NIL;
        final SubLObject error_handling = get_shallow_parser_error_handling(self);
        try {
            thread.throwStack.push(shallow_parser.$sym33$OUTER_CATCH_FOR_SHALLOW_PARSER_METHOD);
            try {
                final SubLObject pcase_var = error_handling;
                if (pcase_var.eql((SubLObject)shallow_parser.$kw14$THROW)) {
                    Errors.error(error);
                }
                else if (pcase_var.eql((SubLObject)shallow_parser.$kw34$WARN)) {
                    Errors.warn(error);
                }
            }
            finally {
                final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)shallow_parser.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    set_shallow_parser_error_handling(self, error_handling);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        }
        catch (Throwable ccatch_env_var) {
            catch_var_for_shallow_parser_method = Errors.handleThrowable(ccatch_env_var, (SubLObject)shallow_parser.$sym33$OUTER_CATCH_FOR_SHALLOW_PARSER_METHOD);
        }
        finally {
            thread.throwStack.pop();
        }
        return catch_var_for_shallow_parser_method;
    }
    
    public static SubLObject declare_shallow_parser_file() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.shallow_parser", "get_shallow_parser_time", "GET-SHALLOW-PARSER-TIME", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.shallow_parser", "set_shallow_parser_time", "SET-SHALLOW-PARSER-TIME", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.shallow_parser", "get_shallow_parser_error_handling", "GET-SHALLOW-PARSER-ERROR-HANDLING", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.shallow_parser", "set_shallow_parser_error_handling", "SET-SHALLOW-PARSER-ERROR-HANDLING", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.shallow_parser", "subloop_reserved_initialize_shallow_parser_class", "SUBLOOP-RESERVED-INITIALIZE-SHALLOW-PARSER-CLASS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.shallow_parser", "subloop_reserved_initialize_shallow_parser_instance", "SUBLOOP-RESERVED-INITIALIZE-SHALLOW-PARSER-INSTANCE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.shallow_parser", "shallow_parser_p", "SHALLOW-PARSER-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.shallow_parser", "shallow_parser_initialize_method", "SHALLOW-PARSER-INITIALIZE-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.shallow_parser", "new_shallow_parser", "NEW-SHALLOW-PARSER", 0, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.shallow_parser", "shallow_parser_parse_method", "SHALLOW-PARSER-PARSE-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.shallow_parser", "shallow_parser_handle_error_method", "SHALLOW-PARSER-HANDLE-ERROR-METHOD", 2, 0, false);
        return (SubLObject)shallow_parser.NIL;
    }
    
    public static SubLObject init_shallow_parser_file() {
        return (SubLObject)shallow_parser.NIL;
    }
    
    public static SubLObject setup_shallow_parser_file() {
        classes.subloop_new_class((SubLObject)shallow_parser.$sym0$SHALLOW_PARSER, (SubLObject)shallow_parser.$sym1$OBJECT, (SubLObject)shallow_parser.NIL, (SubLObject)shallow_parser.NIL, (SubLObject)shallow_parser.$list2);
        classes.class_set_implements_slot_listeners((SubLObject)shallow_parser.$sym0$SHALLOW_PARSER, (SubLObject)shallow_parser.NIL);
        classes.subloop_note_class_initialization_function((SubLObject)shallow_parser.$sym0$SHALLOW_PARSER, (SubLObject)shallow_parser.$sym6$SUBLOOP_RESERVED_INITIALIZE_SHALLOW_PARSER_CLASS);
        classes.subloop_note_instance_initialization_function((SubLObject)shallow_parser.$sym0$SHALLOW_PARSER, (SubLObject)shallow_parser.$sym9$SUBLOOP_RESERVED_INITIALIZE_SHALLOW_PARSER_INSTANCE);
        subloop_reserved_initialize_shallow_parser_class((SubLObject)shallow_parser.$sym0$SHALLOW_PARSER);
        methods.methods_incorporate_instance_method((SubLObject)shallow_parser.$sym10$INITIALIZE, (SubLObject)shallow_parser.$sym0$SHALLOW_PARSER, (SubLObject)shallow_parser.$list11, (SubLObject)shallow_parser.NIL, (SubLObject)shallow_parser.$list12);
        methods.subloop_register_instance_method((SubLObject)shallow_parser.$sym0$SHALLOW_PARSER, (SubLObject)shallow_parser.$sym10$INITIALIZE, (SubLObject)shallow_parser.$sym15$SHALLOW_PARSER_INITIALIZE_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)shallow_parser.$sym20$PARSE, (SubLObject)shallow_parser.$sym0$SHALLOW_PARSER, (SubLObject)shallow_parser.$list21, (SubLObject)shallow_parser.$list22, (SubLObject)shallow_parser.$list23);
        methods.subloop_register_instance_method((SubLObject)shallow_parser.$sym0$SHALLOW_PARSER, (SubLObject)shallow_parser.$sym20$PARSE, (SubLObject)shallow_parser.$sym28$SHALLOW_PARSER_PARSE_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)shallow_parser.$sym29$HANDLE_ERROR, (SubLObject)shallow_parser.$sym0$SHALLOW_PARSER, (SubLObject)shallow_parser.$list30, (SubLObject)shallow_parser.$list31, (SubLObject)shallow_parser.$list32);
        methods.subloop_register_instance_method((SubLObject)shallow_parser.$sym0$SHALLOW_PARSER, (SubLObject)shallow_parser.$sym29$HANDLE_ERROR, (SubLObject)shallow_parser.$sym35$SHALLOW_PARSER_HANDLE_ERROR_METHOD);
        return (SubLObject)shallow_parser.NIL;
    }
    
    @Override
	public void declareFunctions() {
        declare_shallow_parser_file();
    }
    
    @Override
	public void initializeVariables() {
        init_shallow_parser_file();
    }
    
    @Override
	public void runTopLevelForms() {
        setup_shallow_parser_file();
    }
    
    static {
        me = (SubLFile)new shallow_parser();
        $sym0$SHALLOW_PARSER = SubLObjectFactory.makeSymbol("SHALLOW-PARSER");
        $sym1$OBJECT = SubLObjectFactory.makeSymbol("OBJECT");
        $list2 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ERROR-HANDLING"), (SubLObject)SubLObjectFactory.makeKeyword("INSTANCE"), (SubLObject)SubLObjectFactory.makeKeyword("PRIVATE")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TIME"), (SubLObject)SubLObjectFactory.makeKeyword("INSTANCE"), (SubLObject)SubLObjectFactory.makeKeyword("PRIVATE")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("PARSE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TEXT")), (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("HANDLE-ERROR"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ERROR")), (SubLObject)SubLObjectFactory.makeKeyword("PRIVATE")));
        $sym3$TIME = SubLObjectFactory.makeSymbol("TIME");
        $sym4$ERROR_HANDLING = SubLObjectFactory.makeSymbol("ERROR-HANDLING");
        $sym5$INSTANCE_COUNT = SubLObjectFactory.makeSymbol("INSTANCE-COUNT");
        $sym6$SUBLOOP_RESERVED_INITIALIZE_SHALLOW_PARSER_CLASS = SubLObjectFactory.makeSymbol("SUBLOOP-RESERVED-INITIALIZE-SHALLOW-PARSER-CLASS");
        $sym7$ISOLATED_P = SubLObjectFactory.makeSymbol("ISOLATED-P");
        $sym8$INSTANCE_NUMBER = SubLObjectFactory.makeSymbol("INSTANCE-NUMBER");
        $sym9$SUBLOOP_RESERVED_INITIALIZE_SHALLOW_PARSER_INSTANCE = SubLObjectFactory.makeSymbol("SUBLOOP-RESERVED-INITIALIZE-SHALLOW-PARSER-INSTANCE");
        $sym10$INITIALIZE = SubLObjectFactory.makeSymbol("INITIALIZE");
        $list11 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("PROTECTED"));
        $list12 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("INITIALIZE"), (SubLObject)SubLObjectFactory.makeSymbol("SUPER")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("ERROR-HANDLING"), (SubLObject)SubLObjectFactory.makeKeyword("THROW")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("TIME"), (SubLObject)shallow_parser.FIVE_INTEGER), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("SELF")));
        $sym13$OUTER_CATCH_FOR_SHALLOW_PARSER_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-SHALLOW-PARSER-METHOD");
        $kw14$THROW = SubLObjectFactory.makeKeyword("THROW");
        $sym15$SHALLOW_PARSER_INITIALIZE_METHOD = SubLObjectFactory.makeSymbol("SHALLOW-PARSER-INITIALIZE-METHOD");
        $list16 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("THROW"), (SubLObject)SubLObjectFactory.makeKeyword("WARN"), (SubLObject)SubLObjectFactory.makeKeyword("IGNORE"));
        $str17$Invalid_error_handling_tag__a = SubLObjectFactory.makeString("Invalid error-handling tag ~a");
        $str18$Invalid_timeout__a = SubLObjectFactory.makeString("Invalid timeout ~a");
        $float19$3_4028232e37 = (SubLFloat)SubLObjectFactory.makeDouble(3.4028232E37);
        $sym20$PARSE = SubLObjectFactory.makeSymbol("PARSE");
        $list21 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("PUBLIC"));
        $list22 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TEXT"));
        $list23 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("@param TEXT stringp; one or more English sentences\n   @return listp; a list of shallow parses for TEXT, one for each sentence"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PARSES"), (SubLObject)SubLObjectFactory.makeSymbol("ERROR"), (SubLObject)SubLObjectFactory.makeSymbol("TIMEOUT?")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CATCH-ERROR-MESSAGE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ERROR")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("WITH-TIMEOUT"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TIME"), (SubLObject)SubLObjectFactory.makeSymbol("TIMEOUT?")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("PARSES"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SHALLOW-PARSE"), (SubLObject)SubLObjectFactory.makeSymbol("TEXT")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PWHEN"), (SubLObject)SubLObjectFactory.makeSymbol("TIMEOUT?"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ERROR"), (SubLObject)SubLObjectFactory.makeString("Shallow Parser timed out after ~a seconds"), (SubLObject)SubLObjectFactory.makeSymbol("TIME")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PWHEN"), (SubLObject)SubLObjectFactory.makeSymbol("ERROR"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("HANDLE-ERROR"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)SubLObjectFactory.makeSymbol("ERROR"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("MAPCAR"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("NEW-PARSE-TREE")), (SubLObject)SubLObjectFactory.makeSymbol("PARSES")))));
        $sym24$OUTER_CATCH_FOR_SHALLOW_PARSER_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-SHALLOW-PARSER-METHOD");
        $sym25$CATCH_ERROR_MESSAGE_HANDLER = SubLObjectFactory.makeSymbol("CATCH-ERROR-MESSAGE-HANDLER");
        $str26$Shallow_Parser_timed_out_after__a = SubLObjectFactory.makeString("Shallow Parser timed out after ~a seconds");
        $sym27$NEW_PARSE_TREE = SubLObjectFactory.makeSymbol("NEW-PARSE-TREE");
        $sym28$SHALLOW_PARSER_PARSE_METHOD = SubLObjectFactory.makeSymbol("SHALLOW-PARSER-PARSE-METHOD");
        $sym29$HANDLE_ERROR = SubLObjectFactory.makeSymbol("HANDLE-ERROR");
        $list30 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("PRIVATE"));
        $list31 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ERROR"));
        $list32 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PCASE"), (SubLObject)SubLObjectFactory.makeSymbol("ERROR-HANDLING"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("THROW"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ERROR"), (SubLObject)SubLObjectFactory.makeSymbol("ERROR"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("WARN"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("WARN"), (SubLObject)SubLObjectFactory.makeSymbol("ERROR")))));
        $sym33$OUTER_CATCH_FOR_SHALLOW_PARSER_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-SHALLOW-PARSER-METHOD");
        $kw34$WARN = SubLObjectFactory.makeKeyword("WARN");
        $sym35$SHALLOW_PARSER_HANDLE_ERROR_METHOD = SubLObjectFactory.makeSymbol("SHALLOW-PARSER-HANDLE-ERROR-METHOD");
    }
}

/*

	Total time: 118 ms
	
*/