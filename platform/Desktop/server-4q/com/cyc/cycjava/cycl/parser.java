package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.StreamsLow;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_macros;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class parser extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.parser";
    public static final String myFingerPrint = "19781d685a5ff35cd3b0a22b8f498b743cfe5310a061d21f74578d4ef5347369";
    @SubLTranslatedFile.SubL(source = "cycl/parser.lisp", position = 873L)
    public static SubLSymbol $default_parser_timeout$;
    @SubLTranslatedFile.SubL(source = "cycl/parser.lisp", position = 2647L)
    private static SubLSymbol $charniak_parser_host$;
    @SubLTranslatedFile.SubL(source = "cycl/parser.lisp", position = 3000L)
    private static SubLSymbol $charniak_available$;
    @SubLTranslatedFile.SubL(source = "cycl/parser.lisp", position = 5798L)
    private static SubLSymbol $charniak_parse_caching_state$;
    @SubLTranslatedFile.SubL(source = "cycl/parser.lisp", position = 7415L)
    private static SubLSymbol $stanford_parser_host$;
    @SubLTranslatedFile.SubL(source = "cycl/parser.lisp", position = 7673L)
    private static SubLSymbol $stanford_parser_port$;
    @SubLTranslatedFile.SubL(source = "cycl/parser.lisp", position = 7833L)
    private static SubLSymbol $stanford_parser$;
    @SubLTranslatedFile.SubL(source = "cycl/parser.lisp", position = 8142L)
    private static SubLSymbol $stanford_available$;
    @SubLTranslatedFile.SubL(source = "cycl/parser.lisp", position = 9997L)
    private static SubLSymbol $stanford_parse_caching_state$;
    @SubLTranslatedFile.SubL(source = "cycl/parser.lisp", position = 10724L)
    public static SubLSymbol $aux_word_strings$;
    @SubLTranslatedFile.SubL(source = "cycl/parser.lisp", position = 10974L)
    private static SubLSymbol $link_parser_program_name$;
    @SubLTranslatedFile.SubL(source = "cycl/parser.lisp", position = 11244L)
    private static SubLSymbol $link_parser_program_redfilename$;
    @SubLTranslatedFile.SubL(source = "cycl/parser.lisp", position = 11470L)
    private static SubLSymbol $link_parser_program_inputfile$;
    @SubLTranslatedFile.SubL(source = "cycl/parser.lisp", position = 11631L)
    private static SubLSymbol $link_parser_program_outputfile$;
    @SubLTranslatedFile.SubL(source = "cycl/parser.lisp", position = 11795L)
    private static SubLSymbol $link_server_allow_local_start$;
    @SubLTranslatedFile.SubL(source = "cycl/parser.lisp", position = 12011L)
    private static SubLSymbol $link_parser_server_os_process_name$;
    @SubLTranslatedFile.SubL(source = "cycl/parser.lisp", position = 12091L)
    private static SubLSymbol $link_parser_server_proxy_process_name$;
    private static final SubLInteger $int0$10000;
    private static final SubLSymbol $sym1$PARSER;
    private static final SubLSymbol $sym2$OBJECT;
    private static final SubLList $list3;
    private static final SubLSymbol $sym4$TIMEOUT;
    private static final SubLSymbol $sym5$ERROR_HANDLING;
    private static final SubLSymbol $sym6$INSTANCE_COUNT;
    private static final SubLSymbol $sym7$SUBLOOP_RESERVED_INITIALIZE_PARSER_CLASS;
    private static final SubLSymbol $sym8$ISOLATED_P;
    private static final SubLSymbol $sym9$INSTANCE_NUMBER;
    private static final SubLSymbol $sym10$SUBLOOP_RESERVED_INITIALIZE_PARSER_INSTANCE;
    private static final SubLSymbol $sym11$INITIALIZE;
    private static final SubLList $list12;
    private static final SubLList $list13;
    private static final SubLSymbol $sym14$OUTER_CATCH_FOR_PARSER_METHOD;
    private static final SubLSymbol $kw15$THROW;
    private static final SubLInteger $int16$90;
    private static final SubLSymbol $sym17$PARSER_INITIALIZE_METHOD;
    private static final SubLSymbol $sym18$PRINT;
    private static final SubLList $list19;
    private static final SubLList $list20;
    private static final SubLList $list21;
    private static final SubLSymbol $sym22$OUTER_CATCH_FOR_PARSER_METHOD;
    private static final SubLSymbol $sym23$INSTANCE_P;
    private static final SubLString $str24$__A;
    private static final SubLString $str25$_Error_handling___S_;
    private static final SubLSymbol $sym26$PARSER_PRINT_METHOD;
    private static final SubLSymbol $kw27$ERROR_HANDLING;
    private static final SubLSymbol $kw28$TIMEOUT;
    private static final SubLList $list29;
    private static final SubLString $str30$Invalid_error_handling_tag__a;
    private static final SubLString $str31$Invalid_timeout__a;
    private static final SubLSymbol $sym32$HANDLE_ERROR;
    private static final SubLList $list33;
    private static final SubLList $list34;
    private static final SubLSymbol $sym35$OUTER_CATCH_FOR_PARSER_METHOD;
    private static final SubLSymbol $kw36$WARN;
    private static final SubLSymbol $sym37$PARSER_HANDLE_ERROR_METHOD;
    private static final SubLList $list38;
    private static final SubLSymbol $sym39$_CHARNIAK_PARSER_HOST_;
    private static final SubLString $str40$charniakparser_cyc_com;
    private static final SubLSymbol $kw41$PARAMETER;
    private static final SubLSymbol $sym42$CHARNIAK_PARSER;
    private static final SubLList $list43;
    private static final SubLSymbol $sym44$SUBLOOP_RESERVED_INITIALIZE_CHARNIAK_PARSER_CLASS;
    private static final SubLSymbol $sym45$SUBLOOP_RESERVED_INITIALIZE_CHARNIAK_PARSER_INSTANCE;
    private static final SubLSymbol $kw46$UNTESTED;
    private static final SubLSymbol $sym47$CATCH_ERROR_MESSAGE_HANDLER;
    private static final SubLString $str48$Dogs_sleep;
    private static final SubLList $list49;
    private static final SubLSymbol $sym50$PARSE_MULTIPLE;
    private static final SubLList $list51;
    private static final SubLList $list52;
    private static final SubLSymbol $sym53$PARSE_TREE_CONTEXT;
    private static final SubLSymbol $sym54$OUTER_CATCH_FOR_CHARNIAK_PARSER_METHOD;
    private static final SubLString $str55$Charniak_Parser_timed_out_after__;
    private static final SubLSymbol $sym56$CHARNIAK_PARSER_PARSE_MULTIPLE_METHOD;
    private static final SubLList $list57;
    private static final SubLSymbol $sym58$PARSE;
    private static final SubLList $list59;
    private static final SubLSymbol $sym60$STRINGP;
    private static final SubLSymbol $sym61$PARSE_TREE_CONTEXT_P;
    private static final SubLSymbol $sym62$CHARNIAK_PARSER_PARSE_METHOD;
    private static final SubLString $str63$_charniak_cgi;
    private static final SubLSymbol $kw64$POST;
    private static final SubLSymbol $sym65$CHARNIAK_PARSE;
    private static final SubLString $str66$text;
    private static final SubLString $str67$server;
    private static final SubLSymbol $sym68$_CHARNIAK_PARSE_CACHING_STATE_;
    private static final SubLInteger $int69$500;
    private static final SubLList $list70;
    private static final SubLSymbol $kw71$DT;
    private static final SubLSymbol $kw72$WHNP;
    private static final SubLSymbol $kw73$WP;
    private static final SubLSymbol $kw74$WDT;
    private static final SubLList $list75;
    private static final SubLSymbol $sym76$_STANFORD_PARSER_HOST_;
    private static final SubLString $str77$stanfordparser_cyc_com;
    private static final SubLList $list78;
    private static final SubLSymbol $sym79$_STANFORD_PARSER_PORT_;
    private static final SubLInteger $int80$8888;
    private static final SubLSymbol $sym81$STANFORD_PARSER;
    private static final SubLSymbol $sym82$SUBLOOP_RESERVED_INITIALIZE_STANFORD_PARSER_CLASS;
    private static final SubLSymbol $sym83$SUBLOOP_RESERVED_INITIALIZE_STANFORD_PARSER_INSTANCE;
    private static final SubLList $list84;
    private static final SubLList $list85;
    private static final SubLSymbol $sym86$OUTER_CATCH_FOR_STANFORD_PARSER_METHOD;
    private static final SubLString $str87$Stanford_Parser_timed_out_after__;
    private static final SubLSymbol $sym88$STANFORD_PARSER_PARSE_METHOD;
    private static final SubLSymbol $sym89$STANFORD_PARSE;
    private static final SubLSymbol $kw90$PRIVATE;
    private static final SubLSymbol $sym91$_STANFORD_PARSE_CACHING_STATE_;
    private static final SubLSymbol $kw92$AUX;
    private static final SubLList $list93;
    private static final SubLList $list94;
    private static final SubLSymbol $sym95$_LINK_PARSER_PROGRAM_NAME_;
    private static final SubLString $str96$_cyc_top_data_link_server;
    private static final SubLSymbol $kw97$LEXICAL;
    private static final SubLList $list98;
    private static final SubLSymbol $sym99$_LINK_PARSER_PROGRAM_REDFILENAME_;
    private static final SubLString $str100$_cyc_top_repository_red_external_;
    private static final SubLList $list101;
    private static final SubLSymbol $sym102$_LINK_PARSER_PROGRAM_INPUTFILE_;
    private static final SubLString $str103$_dev_null;
    private static final SubLList $list104;
    private static final SubLSymbol $sym105$_LINK_PARSER_PROGRAM_OUTPUTFILE_;
    private static final SubLList $list106;
    private static final SubLSymbol $sym107$_LINK_SERVER_ALLOW_LOCAL_START_;
    private static final SubLString $str108$Link_Parser_Server;
    private static final SubLString $str109$Process_for_;
    private static final SubLString $str110$_r;
    private static final SubLSymbol $sym111$LAUNCH_LINK_PARSER_PROGRAM_LOCALLY;
    private static final SubLSymbol $sym112$LINK_PARSER;
    private static final SubLList $list113;
    private static final SubLSymbol $sym114$OPTIONS;
    private static final SubLSymbol $sym115$SUBLOOP_RESERVED_INITIALIZE_LINK_PARSER_CLASS;
    private static final SubLSymbol $sym116$SUBLOOP_RESERVED_INITIALIZE_LINK_PARSER_INSTANCE;
    private static final SubLList $list117;
    private static final SubLSymbol $sym118$LINK_PARSER_INITIALIZE_METHOD;
    private static final SubLSymbol $sym119$NEW_LINK_PARSER;
    private static final SubLSymbol $kw120$PUBLIC;
    private static final SubLString $str121$localhost;
    private static final SubLList $list122;
    private static final SubLSymbol $sym123$OUTER_CATCH_FOR_LINK_PARSER_METHOD;
    private static final SubLSymbol $kw124$CONTEXT;
    private static final SubLSymbol $kw125$OPTIONS;
    private static final SubLSymbol $kw126$LEXICON;
    private static final SubLString $str127$Link_Parser_timed_out_after__a_se;
    private static final SubLSymbol $sym128$LINK_PARSER_PARSE_METHOD;
    
    
    @SubLTranslatedFile.SubL(source = "cycl/parser.lisp", position = 988L)
    public static SubLObject get_parser_timeout(final SubLObject v_parser) {
        return classes.subloop_get_access_protected_instance_slot(v_parser, (SubLObject)parser.TWO_INTEGER, (SubLObject)parser.$sym4$TIMEOUT);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/parser.lisp", position = 988L)
    public static SubLObject set_parser_timeout(final SubLObject v_parser, final SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(v_parser, value, (SubLObject)parser.TWO_INTEGER, (SubLObject)parser.$sym4$TIMEOUT);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/parser.lisp", position = 988L)
    public static SubLObject get_parser_error_handling(final SubLObject v_parser) {
        return classes.subloop_get_access_protected_instance_slot(v_parser, (SubLObject)parser.ONE_INTEGER, (SubLObject)parser.$sym5$ERROR_HANDLING);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/parser.lisp", position = 988L)
    public static SubLObject set_parser_error_handling(final SubLObject v_parser, final SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(v_parser, value, (SubLObject)parser.ONE_INTEGER, (SubLObject)parser.$sym5$ERROR_HANDLING);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/parser.lisp", position = 988L)
    public static SubLObject subloop_reserved_initialize_parser_class(final SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, (SubLObject)parser.$sym2$OBJECT, (SubLObject)parser.$sym6$INSTANCE_COUNT, (SubLObject)parser.ZERO_INTEGER);
        return (SubLObject)parser.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/parser.lisp", position = 988L)
    public static SubLObject subloop_reserved_initialize_parser_instance(final SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, (SubLObject)parser.$sym2$OBJECT, (SubLObject)parser.$sym8$ISOLATED_P, (SubLObject)parser.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)parser.$sym2$OBJECT, (SubLObject)parser.$sym9$INSTANCE_NUMBER, (SubLObject)parser.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)parser.$sym1$PARSER, (SubLObject)parser.$sym5$ERROR_HANDLING, (SubLObject)parser.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)parser.$sym1$PARSER, (SubLObject)parser.$sym4$TIMEOUT, (SubLObject)parser.NIL);
        return (SubLObject)parser.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/parser.lisp", position = 988L)
    public static SubLObject parser_p(final SubLObject v_parser) {
        return classes.subloop_instanceof_class(v_parser, (SubLObject)parser.$sym1$PARSER);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/parser.lisp", position = 1339L)
    public static SubLObject parser_initialize_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_parser_method = (SubLObject)parser.NIL;
        SubLObject timeout = get_parser_timeout(self);
        SubLObject error_handling = get_parser_error_handling(self);
        try {
            thread.throwStack.push(parser.$sym14$OUTER_CATCH_FOR_PARSER_METHOD);
            try {
                object.object_initialize_method(self);
                error_handling = (SubLObject)parser.$kw15$THROW;
                timeout = (SubLObject)parser.$int16$90;
                Dynamic.sublisp_throw((SubLObject)parser.$sym14$OUTER_CATCH_FOR_PARSER_METHOD, self);
            }
            finally {
                final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)parser.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    set_parser_timeout(self, timeout);
                    set_parser_error_handling(self, error_handling);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        }
        catch (Throwable ccatch_env_var) {
            catch_var_for_parser_method = Errors.handleThrowable(ccatch_env_var, (SubLObject)parser.$sym14$OUTER_CATCH_FOR_PARSER_METHOD);
        }
        finally {
            thread.throwStack.pop();
        }
        return catch_var_for_parser_method;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/parser.lisp", position = 1483L)
    public static SubLObject parser_print_method(final SubLObject self, final SubLObject stream, final SubLObject depth) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_parser_method = (SubLObject)parser.NIL;
        final SubLObject error_handling = get_parser_error_handling(self);
        try {
            thread.throwStack.push(parser.$sym22$OUTER_CATCH_FOR_PARSER_METHOD);
            try {
                assert parser.NIL != subloop_structures.instance_p(self) : self;
                if (parser.NIL != print_high.$print_readably$.getDynamicValue(thread)) {
                    print_high.print_not_readable(self, stream);
                }
                else {
                    print_macros.print_unreadable_object_preamble(stream, self, (SubLObject)parser.NIL, (SubLObject)parser.NIL);
                    print_high.princ(subloop_structures.class_name(subloop_structures.instance_class(self)), stream);
                    streams_high.write_char((SubLObject)Characters.CHAR_space, stream);
                    PrintLow.format(stream, (SubLObject)parser.$str25$_Error_handling___S_, error_handling);
                    print_macros.print_unreadable_object_postamble(stream, self, (SubLObject)parser.T, (SubLObject)parser.T);
                }
                Dynamic.sublisp_throw((SubLObject)parser.$sym22$OUTER_CATCH_FOR_PARSER_METHOD, (SubLObject)parser.NIL);
            }
            finally {
                final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)parser.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    set_parser_error_handling(self, error_handling);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        }
        catch (Throwable ccatch_env_var) {
            catch_var_for_parser_method = Errors.handleThrowable(ccatch_env_var, (SubLObject)parser.$sym22$OUTER_CATCH_FOR_PARSER_METHOD);
        }
        finally {
            thread.throwStack.pop();
        }
        return catch_var_for_parser_method;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/parser.lisp", position = 1694L)
    public static SubLObject new_parser(final SubLObject v_class, SubLObject v_properties) {
        if (v_properties == parser.UNPROVIDED) {
            v_properties = (SubLObject)parser.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject error_handling = conses_high.getf(v_properties, (SubLObject)parser.$kw27$ERROR_HANDLING, (SubLObject)parser.$kw15$THROW);
        SubLObject timeout = conses_high.getf(v_properties, (SubLObject)parser.$kw28$TIMEOUT, parser.$default_parser_timeout$.getDynamicValue(thread));
        if (parser.NIL == timeout) {
            timeout = parser.$default_parser_timeout$.getDynamicValue(thread);
        }
        if (parser.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && parser.NIL == conses_high.member(error_handling, (SubLObject)parser.$list29, (SubLObject)parser.UNPROVIDED, (SubLObject)parser.UNPROVIDED)) {
            Errors.error((SubLObject)parser.$str30$Invalid_error_handling_tag__a, error_handling);
        }
        if (parser.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && parser.NIL == subl_promotions.non_negative_integer_p(timeout)) {
            Errors.error((SubLObject)parser.$str31$Invalid_timeout__a, timeout);
        }
        final SubLObject v_parser = object.new_class_instance(v_class);
        set_parser_error_handling(v_parser, error_handling);
        set_parser_timeout(v_parser, timeout);
        return v_parser;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/parser.lisp", position = 2506L)
    public static SubLObject parser_handle_error_method(final SubLObject self, final SubLObject error) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_parser_method = (SubLObject)parser.NIL;
        final SubLObject error_handling = get_parser_error_handling(self);
        try {
            thread.throwStack.push(parser.$sym35$OUTER_CATCH_FOR_PARSER_METHOD);
            try {
                final SubLObject pcase_var = error_handling;
                if (pcase_var.eql((SubLObject)parser.$kw15$THROW)) {
                    Errors.error(error);
                }
                else if (pcase_var.eql((SubLObject)parser.$kw36$WARN)) {
                    Errors.warn(error);
                }
            }
            finally {
                final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)parser.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    set_parser_error_handling(self, error_handling);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        }
        catch (Throwable ccatch_env_var) {
            catch_var_for_parser_method = Errors.handleThrowable(ccatch_env_var, (SubLObject)parser.$sym35$OUTER_CATCH_FOR_PARSER_METHOD);
        }
        finally {
            thread.throwStack.pop();
        }
        return catch_var_for_parser_method;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/parser.lisp", position = 2905L)
    public static SubLObject subloop_reserved_initialize_charniak_parser_class(final SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, (SubLObject)parser.$sym2$OBJECT, (SubLObject)parser.$sym6$INSTANCE_COUNT, (SubLObject)parser.ZERO_INTEGER);
        return (SubLObject)parser.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/parser.lisp", position = 2905L)
    public static SubLObject subloop_reserved_initialize_charniak_parser_instance(final SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, (SubLObject)parser.$sym2$OBJECT, (SubLObject)parser.$sym8$ISOLATED_P, (SubLObject)parser.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)parser.$sym2$OBJECT, (SubLObject)parser.$sym9$INSTANCE_NUMBER, (SubLObject)parser.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)parser.$sym1$PARSER, (SubLObject)parser.$sym5$ERROR_HANDLING, (SubLObject)parser.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)parser.$sym1$PARSER, (SubLObject)parser.$sym4$TIMEOUT, (SubLObject)parser.NIL);
        return (SubLObject)parser.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/parser.lisp", position = 2905L)
    public static SubLObject charniak_parser_p(final SubLObject charniak_parser) {
        return classes.subloop_instanceof_class(charniak_parser, (SubLObject)parser.$sym42$CHARNIAK_PARSER);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/parser.lisp", position = 3121L)
    public static SubLObject charniak_parser_availableP(SubLObject force_check) {
        if (force_check == parser.UNPROVIDED) {
            force_check = (SubLObject)parser.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (parser.NIL != force_check || parser.$charniak_available$.getGlobalValue() == parser.$kw46$UNTESTED) {
            SubLObject error = (SubLObject)parser.NIL;
            try {
                thread.throwStack.push(subl_macro_promotions.$catch_error_message_target$.getGlobalValue());
                final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
                try {
                    Errors.$error_handler$.bind((SubLObject)parser.$sym47$CATCH_ERROR_MESSAGE_HANDLER, thread);
                    try {
                        parser.$charniak_available$.setGlobalValue(Equality.equalp(charniak_parse((SubLObject)parser.$str48$Dogs_sleep, (SubLObject)parser.UNPROVIDED, (SubLObject)parser.UNPROVIDED, (SubLObject)parser.UNPROVIDED, (SubLObject)parser.UNPROVIDED, (SubLObject)parser.UNPROVIDED), (SubLObject)parser.$list49));
                    }
                    catch (Throwable catch_var) {
                        Errors.handleThrowable(catch_var, (SubLObject)parser.NIL);
                    }
                }
                finally {
                    Errors.$error_handler$.rebind(_prev_bind_0, thread);
                }
            }
            catch (Throwable ccatch_env_var) {
                error = Errors.handleThrowable(ccatch_env_var, subl_macro_promotions.$catch_error_message_target$.getGlobalValue());
            }
            finally {
                thread.throwStack.pop();
            }
            if (parser.NIL != error) {
                parser.$charniak_available$.setGlobalValue((SubLObject)parser.NIL);
            }
        }
        return parser.$charniak_available$.getGlobalValue();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/parser.lisp", position = 3660L)
    public static SubLObject force_charniak_parser_availableP() {
        return charniak_parser_availableP((SubLObject)parser.T);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/parser.lisp", position = 3842L)
    public static SubLObject new_charniak_parser(SubLObject error_handling, SubLObject timeout) {
        if (error_handling == parser.UNPROVIDED) {
            error_handling = (SubLObject)parser.$kw15$THROW;
        }
        if (timeout == parser.UNPROVIDED) {
            timeout = parser.$default_parser_timeout$.getDynamicValue();
        }
        return new_parser((SubLObject)parser.$sym42$CHARNIAK_PARSER, (SubLObject)ConsesLow.list((SubLObject)parser.$kw27$ERROR_HANDLING, error_handling, (SubLObject)parser.$kw28$TIMEOUT, timeout));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/parser.lisp", position = 4267L)
    public static SubLObject charniak_parser_parse_multiple_method(final SubLObject self, final SubLObject text, SubLObject lexicon, SubLObject v_context) {
        if (lexicon == parser.UNPROVIDED) {
            lexicon = (SubLObject)parser.NIL;
        }
        if (v_context == parser.UNPROVIDED) {
            v_context = object.new_class_instance((SubLObject)parser.$sym53$PARSE_TREE_CONTEXT);
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_charniak_parser_method = (SubLObject)parser.NIL;
        final SubLObject timeout = get_parser_timeout(self);
        try {
            thread.throwStack.push(parser.$sym54$OUTER_CATCH_FOR_CHARNIAK_PARSER_METHOD);
            try {
                SubLObject parses = (SubLObject)parser.NIL;
                SubLObject error = (SubLObject)parser.NIL;
                SubLObject timeoutP = (SubLObject)parser.NIL;
                SubLObject trees = (SubLObject)parser.NIL;
                try {
                    thread.throwStack.push(subl_macro_promotions.$catch_error_message_target$.getGlobalValue());
                    final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
                    try {
                        Errors.$error_handler$.bind((SubLObject)parser.$sym47$CATCH_ERROR_MESSAGE_HANDLER, thread);
                        try {
                            final SubLObject tag = subl_macro_promotions.with_timeout_make_tag();
                            try {
                                thread.throwStack.push(tag);
                                final SubLObject _prev_bind_0_$2 = subl_macro_promotions.$within_with_timeout$.currentBinding(thread);
                                try {
                                    subl_macro_promotions.$within_with_timeout$.bind((SubLObject)parser.T, thread);
                                    SubLObject timer = (SubLObject)parser.NIL;
                                    try {
                                        final SubLObject _prev_bind_0_$3 = subl_macro_promotions.$with_timeout_nesting_depth$.currentBinding(thread);
                                        try {
                                            subl_macro_promotions.$with_timeout_nesting_depth$.bind(Numbers.add((SubLObject)parser.ONE_INTEGER, subl_macro_promotions.$with_timeout_nesting_depth$.getDynamicValue(thread)), thread);
                                            timer = subl_macro_promotions.with_timeout_start_timer(timeout, tag);
                                            parses = charniak_parse(text, (SubLObject)parser.UNPROVIDED, (SubLObject)parser.UNPROVIDED, (SubLObject)parser.UNPROVIDED, (SubLObject)parser.UNPROVIDED, (SubLObject)parser.UNPROVIDED);
                                            if (parser.NIL != timeoutP) {
                                                Errors.error((SubLObject)parser.$str55$Charniak_Parser_timed_out_after__, timeout);
                                            }
                                        }
                                        finally {
                                            subl_macro_promotions.$with_timeout_nesting_depth$.rebind(_prev_bind_0_$3, thread);
                                        }
                                    }
                                    finally {
                                        final SubLObject _prev_bind_0_$4 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                        try {
                                            Threads.$is_thread_performing_cleanupP$.bind((SubLObject)parser.T, thread);
                                            final SubLObject _values = Values.getValuesAsVector();
                                            subl_macro_promotions.with_timeout_stop_timer(timer);
                                            Values.restoreValuesFromVector(_values);
                                        }
                                        finally {
                                            Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$4, thread);
                                        }
                                    }
                                }
                                finally {
                                    subl_macro_promotions.$within_with_timeout$.rebind(_prev_bind_0_$2, thread);
                                }
                            }
                            catch (Throwable ccatch_env_var) {
                                timeoutP = Errors.handleThrowable(ccatch_env_var, tag);
                            }
                            finally {
                                thread.throwStack.pop();
                            }
                            if (parser.NIL != error) {
                                parser_handle_error_method(self, error);
                            }
                        }
                        catch (Throwable catch_var) {
                            Errors.handleThrowable(catch_var, (SubLObject)parser.NIL);
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
                SubLObject cdolist_list_var = parses;
                SubLObject parse_expression = (SubLObject)parser.NIL;
                parse_expression = cdolist_list_var.first();
                while (parser.NIL != cdolist_list_var) {
                    trees = (SubLObject)ConsesLow.cons(parse_tree.new_parse_tree(retag(strip_shell(parse_expression)), lexicon, v_context), trees);
                    cdolist_list_var = cdolist_list_var.rest();
                    parse_expression = cdolist_list_var.first();
                }
                Dynamic.sublisp_throw((SubLObject)parser.$sym54$OUTER_CATCH_FOR_CHARNIAK_PARSER_METHOD, Sequences.nreverse(trees));
            }
            finally {
                final SubLObject _prev_bind_2 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)parser.T, thread);
                    final SubLObject _values2 = Values.getValuesAsVector();
                    set_parser_timeout(self, timeout);
                    Values.restoreValuesFromVector(_values2);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_2, thread);
                }
            }
        }
        catch (Throwable ccatch_env_var3) {
            catch_var_for_charniak_parser_method = Errors.handleThrowable(ccatch_env_var3, (SubLObject)parser.$sym54$OUTER_CATCH_FOR_CHARNIAK_PARSER_METHOD);
        }
        finally {
            thread.throwStack.pop();
        }
        return catch_var_for_charniak_parser_method;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/parser.lisp", position = 5025L)
    public static SubLObject strip_shell(final SubLObject parse_expression) {
        return (parser.NIL != conses_high.member(parse_expression.first(), (SubLObject)parser.$list57, (SubLObject)parser.EQ, (SubLObject)parser.UNPROVIDED)) ? conses_high.second(parse_expression) : parse_expression;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/parser.lisp", position = 5275L)
    public static SubLObject charniak_parser_parse_method(final SubLObject self, final SubLObject text, SubLObject lexicon, SubLObject v_context) {
        if (lexicon == parser.UNPROVIDED) {
            lexicon = (SubLObject)parser.NIL;
        }
        if (v_context == parser.UNPROVIDED) {
            v_context = object.new_class_instance((SubLObject)parser.$sym53$PARSE_TREE_CONTEXT);
        }
        assert parser.NIL != Types.stringp(text) : text;
        if (parser.NIL != v_context && !parser.assertionsDisabledInClass && parser.NIL == context.parse_tree_context_p(v_context)) {
            throw new AssertionError(v_context);
        }
        final SubLObject parse = methods.funcall_instance_method_with_3_args(self, (SubLObject)parser.$sym50$PARSE_MULTIPLE, Sequences.substitute((SubLObject)Characters.CHAR_space, (SubLObject)Characters.CHAR_newline, text, (SubLObject)parser.UNPROVIDED, (SubLObject)parser.UNPROVIDED, (SubLObject)parser.UNPROVIDED, (SubLObject)parser.UNPROVIDED, (SubLObject)parser.UNPROVIDED), lexicon, v_context).first();
        if (parser.NIL != parse) {
            parse_tree.set_parse_tree_mother(parse, (SubLObject)parser.NIL);
        }
        return parse;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/parser.lisp", position = 5798L)
    public static SubLObject clear_charniak_parse() {
        final SubLObject cs = parser.$charniak_parse_caching_state$.getGlobalValue();
        if (parser.NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return (SubLObject)parser.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/parser.lisp", position = 5798L)
    public static SubLObject remove_charniak_parse(final SubLObject query, SubLObject server, SubLObject path, SubLObject host, SubLObject port, SubLObject method) {
        if (server == parser.UNPROVIDED) {
            server = parser.$charniak_parser_host$.getDynamicValue();
        }
        if (path == parser.UNPROVIDED) {
            path = Sequences.cconcatenate(web_utilities.$cgi_path$.getDynamicValue(), (SubLObject)parser.$str63$_charniak_cgi);
        }
        if (host == parser.UNPROVIDED) {
            host = web_utilities.$cgi_host$.getDynamicValue();
        }
        if (port == parser.UNPROVIDED) {
            port = web_utilities.$cgi_port$.getDynamicValue();
        }
        if (method == parser.UNPROVIDED) {
            method = (SubLObject)parser.$kw64$POST;
        }
        return memoization_state.caching_state_remove_function_results_with_args(parser.$charniak_parse_caching_state$.getGlobalValue(), (SubLObject)ConsesLow.list(query, server, path, host, port, method), (SubLObject)parser.UNPROVIDED, (SubLObject)parser.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/parser.lisp", position = 5798L)
    public static SubLObject charniak_parse_internal(final SubLObject query, final SubLObject server, final SubLObject path, final SubLObject host, final SubLObject port, final SubLObject method) {
        return reader.read_from_string(web_utilities.http_retrieve((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)parser.$str66$text, query), (SubLObject)ConsesLow.list((SubLObject)parser.$str67$server, server)), path, host, port, method, (SubLObject)parser.UNPROVIDED, (SubLObject)parser.UNPROVIDED, (SubLObject)parser.UNPROVIDED, (SubLObject)parser.UNPROVIDED), (SubLObject)parser.UNPROVIDED, (SubLObject)parser.UNPROVIDED, (SubLObject)parser.UNPROVIDED, (SubLObject)parser.UNPROVIDED, (SubLObject)parser.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/parser.lisp", position = 5798L)
    public static SubLObject charniak_parse(final SubLObject query, SubLObject server, SubLObject path, SubLObject host, SubLObject port, SubLObject method) {
        if (server == parser.UNPROVIDED) {
            server = parser.$charniak_parser_host$.getDynamicValue();
        }
        if (path == parser.UNPROVIDED) {
            path = Sequences.cconcatenate(web_utilities.$cgi_path$.getDynamicValue(), (SubLObject)parser.$str63$_charniak_cgi);
        }
        if (host == parser.UNPROVIDED) {
            host = web_utilities.$cgi_host$.getDynamicValue();
        }
        if (port == parser.UNPROVIDED) {
            port = web_utilities.$cgi_port$.getDynamicValue();
        }
        if (method == parser.UNPROVIDED) {
            method = (SubLObject)parser.$kw64$POST;
        }
        SubLObject caching_state = parser.$charniak_parse_caching_state$.getGlobalValue();
        if (parser.NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name((SubLObject)parser.$sym65$CHARNIAK_PARSE, (SubLObject)parser.$sym68$_CHARNIAK_PARSE_CACHING_STATE_, (SubLObject)parser.$int69$500, (SubLObject)parser.EQUAL, (SubLObject)parser.SIX_INTEGER, (SubLObject)parser.ZERO_INTEGER);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_6(query, server, path, host, port, method);
        final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, (SubLObject)parser.UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = (SubLObject)parser.NIL;
            collision = cdolist_list_var.first();
            while (parser.NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                final SubLObject results2 = conses_high.second(collision);
                if (query.equal(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (server.equal(cached_args.first())) {
                        cached_args = cached_args.rest();
                        if (path.equal(cached_args.first())) {
                            cached_args = cached_args.rest();
                            if (host.equal(cached_args.first())) {
                                cached_args = cached_args.rest();
                                if (port.equal(cached_args.first())) {
                                    cached_args = cached_args.rest();
                                    if (parser.NIL != cached_args && parser.NIL == cached_args.rest() && method.equal(cached_args.first())) {
                                        return memoization_state.caching_results(results2);
                                    }
                                }
                            }
                        }
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            }
        }
        final SubLObject results3 = Values.arg2(Values.resetMultipleValues(), (SubLObject)Values.multiple_value_list(charniak_parse_internal(query, server, path, host, port, method)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, (SubLObject)ConsesLow.list(query, server, path, host, port, method));
        return memoization_state.caching_results(results3);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/parser.lisp", position = 6690L)
    public static SubLObject retag(final SubLObject tree) {
        if (parser.NIL != word_tree.word_expression_p(tree)) {
            if (parser.NIL != subl_promotions.memberP(word_tree.word_expression_string(tree), (SubLObject)parser.$list70, (SubLObject)parser.EQUALP, (SubLObject)parser.UNPROVIDED)) {
                ConsesLow.rplaca(tree, (SubLObject)parser.$kw71$DT);
            }
        }
        else if (parser.NIL != word_tree.phrase_expression_p(tree)) {
            if (word_tree.parse_expression_category(tree).eql((SubLObject)parser.$kw72$WHNP) && Sequences.length(word_tree.phrase_expression_daughters(tree)).numG((SubLObject)parser.ONE_INTEGER) && word_tree.parse_expression_category(word_tree.phrase_expression_daughters(tree).first()).eql((SubLObject)parser.$kw73$WP)) {
                ConsesLow.rplaca(word_tree.phrase_expression_daughters(tree).first(), (SubLObject)parser.$kw74$WDT);
            }
            SubLObject cdolist_list_var = word_tree.phrase_expression_daughters(tree);
            SubLObject daughter = (SubLObject)parser.NIL;
            daughter = cdolist_list_var.first();
            while (parser.NIL != cdolist_list_var) {
                retag(daughter);
                cdolist_list_var = cdolist_list_var.rest();
                daughter = cdolist_list_var.first();
            }
        }
        return tree;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/parser.lisp", position = 7879L)
    public static SubLObject get_stanford_parser() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (parser.NIL == stanford_parser_p(parser.$stanford_parser$.getDynamicValue(thread))) {
            parser.$stanford_parser$.setDynamicValue(new_stanford_parser((SubLObject)parser.UNPROVIDED, (SubLObject)parser.UNPROVIDED), thread);
        }
        return parser.$stanford_parser$.getDynamicValue(thread);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/parser.lisp", position = 8047L)
    public static SubLObject subloop_reserved_initialize_stanford_parser_class(final SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, (SubLObject)parser.$sym2$OBJECT, (SubLObject)parser.$sym6$INSTANCE_COUNT, (SubLObject)parser.ZERO_INTEGER);
        return (SubLObject)parser.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/parser.lisp", position = 8047L)
    public static SubLObject subloop_reserved_initialize_stanford_parser_instance(final SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, (SubLObject)parser.$sym2$OBJECT, (SubLObject)parser.$sym8$ISOLATED_P, (SubLObject)parser.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)parser.$sym2$OBJECT, (SubLObject)parser.$sym9$INSTANCE_NUMBER, (SubLObject)parser.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)parser.$sym1$PARSER, (SubLObject)parser.$sym5$ERROR_HANDLING, (SubLObject)parser.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)parser.$sym1$PARSER, (SubLObject)parser.$sym4$TIMEOUT, (SubLObject)parser.NIL);
        return (SubLObject)parser.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/parser.lisp", position = 8047L)
    public static SubLObject stanford_parser_p(final SubLObject stanford_parser) {
        return classes.subloop_instanceof_class(stanford_parser, (SubLObject)parser.$sym81$STANFORD_PARSER);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/parser.lisp", position = 8263L)
    public static SubLObject stanford_parser_availableP(SubLObject force_check) {
        if (force_check == parser.UNPROVIDED) {
            force_check = (SubLObject)parser.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (parser.NIL != force_check || parser.$stanford_available$.getGlobalValue() == parser.$kw46$UNTESTED) {
            SubLObject error = (SubLObject)parser.NIL;
            try {
                thread.throwStack.push(subl_macro_promotions.$catch_error_message_target$.getGlobalValue());
                final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
                try {
                    Errors.$error_handler$.bind((SubLObject)parser.$sym47$CATCH_ERROR_MESSAGE_HANDLER, thread);
                    try {
                        parser.$stanford_available$.setGlobalValue(Equality.equalp(stanford_parse((SubLObject)parser.$str48$Dogs_sleep, (SubLObject)parser.UNPROVIDED, (SubLObject)parser.UNPROVIDED), (SubLObject)parser.$list84));
                    }
                    catch (Throwable catch_var) {
                        Errors.handleThrowable(catch_var, (SubLObject)parser.NIL);
                    }
                }
                finally {
                    Errors.$error_handler$.rebind(_prev_bind_0, thread);
                }
            }
            catch (Throwable ccatch_env_var) {
                error = Errors.handleThrowable(ccatch_env_var, subl_macro_promotions.$catch_error_message_target$.getGlobalValue());
            }
            finally {
                thread.throwStack.pop();
            }
            if (parser.NIL != error) {
                parser.$stanford_available$.setGlobalValue((SubLObject)parser.NIL);
            }
        }
        return parser.$stanford_available$.getGlobalValue();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/parser.lisp", position = 8802L)
    public static SubLObject force_stanford_parser_availableP() {
        return stanford_parser_availableP((SubLObject)parser.T);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/parser.lisp", position = 8984L)
    public static SubLObject new_stanford_parser(SubLObject error_handling, SubLObject timeout) {
        if (error_handling == parser.UNPROVIDED) {
            error_handling = (SubLObject)parser.$kw15$THROW;
        }
        if (timeout == parser.UNPROVIDED) {
            timeout = parser.$default_parser_timeout$.getDynamicValue();
        }
        return new_parser((SubLObject)parser.$sym81$STANFORD_PARSER, (SubLObject)ConsesLow.list((SubLObject)parser.$kw27$ERROR_HANDLING, error_handling, (SubLObject)parser.$kw28$TIMEOUT, timeout));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/parser.lisp", position = 9398L)
    public static SubLObject stanford_parser_parse_method(final SubLObject self, final SubLObject text, SubLObject lexicon, SubLObject v_context) {
        if (lexicon == parser.UNPROVIDED) {
            lexicon = (SubLObject)parser.NIL;
        }
        if (v_context == parser.UNPROVIDED) {
            v_context = object.new_class_instance((SubLObject)parser.$sym53$PARSE_TREE_CONTEXT);
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_stanford_parser_method = (SubLObject)parser.NIL;
        final SubLObject timeout = get_parser_timeout(self);
        try {
            thread.throwStack.push(parser.$sym86$OUTER_CATCH_FOR_STANFORD_PARSER_METHOD);
            try {
                SubLObject parse = (SubLObject)parser.NIL;
                SubLObject error = (SubLObject)parser.NIL;
                SubLObject timeoutP = (SubLObject)parser.NIL;
                try {
                    thread.throwStack.push(subl_macro_promotions.$catch_error_message_target$.getGlobalValue());
                    final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
                    try {
                        Errors.$error_handler$.bind((SubLObject)parser.$sym47$CATCH_ERROR_MESSAGE_HANDLER, thread);
                        try {
                            final SubLObject tag = subl_macro_promotions.with_timeout_make_tag();
                            try {
                                thread.throwStack.push(tag);
                                final SubLObject _prev_bind_0_$5 = subl_macro_promotions.$within_with_timeout$.currentBinding(thread);
                                try {
                                    subl_macro_promotions.$within_with_timeout$.bind((SubLObject)parser.T, thread);
                                    SubLObject timer = (SubLObject)parser.NIL;
                                    try {
                                        final SubLObject _prev_bind_0_$6 = subl_macro_promotions.$with_timeout_nesting_depth$.currentBinding(thread);
                                        try {
                                            subl_macro_promotions.$with_timeout_nesting_depth$.bind(Numbers.add((SubLObject)parser.ONE_INTEGER, subl_macro_promotions.$with_timeout_nesting_depth$.getDynamicValue(thread)), thread);
                                            timer = subl_macro_promotions.with_timeout_start_timer(timeout, tag);
                                            parse = stanford_parse(text, (SubLObject)parser.UNPROVIDED, (SubLObject)parser.UNPROVIDED);
                                            if (parser.NIL != timeoutP) {
                                                Errors.error((SubLObject)parser.$str87$Stanford_Parser_timed_out_after__, timeout);
                                            }
                                        }
                                        finally {
                                            subl_macro_promotions.$with_timeout_nesting_depth$.rebind(_prev_bind_0_$6, thread);
                                        }
                                    }
                                    finally {
                                        final SubLObject _prev_bind_0_$7 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                        try {
                                            Threads.$is_thread_performing_cleanupP$.bind((SubLObject)parser.T, thread);
                                            final SubLObject _values = Values.getValuesAsVector();
                                            subl_macro_promotions.with_timeout_stop_timer(timer);
                                            Values.restoreValuesFromVector(_values);
                                        }
                                        finally {
                                            Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$7, thread);
                                        }
                                    }
                                }
                                finally {
                                    subl_macro_promotions.$within_with_timeout$.rebind(_prev_bind_0_$5, thread);
                                }
                            }
                            catch (Throwable ccatch_env_var) {
                                timeoutP = Errors.handleThrowable(ccatch_env_var, tag);
                            }
                            finally {
                                thread.throwStack.pop();
                            }
                            if (parser.NIL != error) {
                                parser_handle_error_method(self, error);
                            }
                        }
                        catch (Throwable catch_var) {
                            Errors.handleThrowable(catch_var, (SubLObject)parser.NIL);
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
                Dynamic.sublisp_throw((SubLObject)parser.$sym86$OUTER_CATCH_FOR_STANFORD_PARSER_METHOD, (SubLObject)((parser.NIL != parse) ? parse_tree.new_parse_tree(strip_shell(parse), lexicon, v_context) : parser.NIL));
            }
            finally {
                final SubLObject _prev_bind_2 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)parser.T, thread);
                    final SubLObject _values2 = Values.getValuesAsVector();
                    set_parser_timeout(self, timeout);
                    Values.restoreValuesFromVector(_values2);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_2, thread);
                }
            }
        }
        catch (Throwable ccatch_env_var3) {
            catch_var_for_stanford_parser_method = Errors.handleThrowable(ccatch_env_var3, (SubLObject)parser.$sym86$OUTER_CATCH_FOR_STANFORD_PARSER_METHOD);
        }
        finally {
            thread.throwStack.pop();
        }
        return catch_var_for_stanford_parser_method;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/parser.lisp", position = 9997L)
    public static SubLObject clear_stanford_parse() {
        final SubLObject cs = parser.$stanford_parse_caching_state$.getGlobalValue();
        if (parser.NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return (SubLObject)parser.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/parser.lisp", position = 9997L)
    public static SubLObject remove_stanford_parse(final SubLObject string, SubLObject server, SubLObject port) {
        if (server == parser.UNPROVIDED) {
            server = parser.$stanford_parser_host$.getDynamicValue();
        }
        if (port == parser.UNPROVIDED) {
            port = parser.$stanford_parser_port$.getDynamicValue();
        }
        return memoization_state.caching_state_remove_function_results_with_args(parser.$stanford_parse_caching_state$.getGlobalValue(), (SubLObject)ConsesLow.list(string, server, port), (SubLObject)parser.UNPROVIDED, (SubLObject)parser.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/parser.lisp", position = 9997L)
    public static SubLObject stanford_parse_internal(final SubLObject string, final SubLObject server, final SubLObject port) {
        final SubLObject s = subl_promotions.open_tcp_stream_with_timeout(server, port, (SubLObject)parser.NIL, (SubLObject)parser.$kw90$PRIVATE);
        SubLObject parse = (SubLObject)parser.NIL;
        try {
            print_high.princ(Sequences.substitute((SubLObject)Characters.CHAR_space, (SubLObject)Characters.CHAR_newline, string, (SubLObject)parser.UNPROVIDED, (SubLObject)parser.UNPROVIDED, (SubLObject)parser.UNPROVIDED, (SubLObject)parser.UNPROVIDED, (SubLObject)parser.UNPROVIDED), s);
            streams_high.terpri(s);
            streams_high.finish_output(s);
            parse = reader.read(s, (SubLObject)parser.NIL, (SubLObject)parser.NIL, (SubLObject)parser.UNPROVIDED);
        }
        finally {
            final SubLObject _prev_bind_0 = Dynamic.currentBinding(Threads.$is_thread_performing_cleanupP$);
            try {
                Dynamic.bind(Threads.$is_thread_performing_cleanupP$, (SubLObject)parser.T);
                final SubLObject _values = Values.getValuesAsVector();
                streams_high.close(s, (SubLObject)parser.UNPROVIDED);
                Values.restoreValuesFromVector(_values);
            }
            finally {
                Dynamic.rebind(Threads.$is_thread_performing_cleanupP$, _prev_bind_0);
            }
        }
        if (parse.isString()) {
            Errors.error(parse);
        }
        return auxify(parse);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/parser.lisp", position = 9997L)
    public static SubLObject stanford_parse(final SubLObject string, SubLObject server, SubLObject port) {
        if (server == parser.UNPROVIDED) {
            server = parser.$stanford_parser_host$.getDynamicValue();
        }
        if (port == parser.UNPROVIDED) {
            port = parser.$stanford_parser_port$.getDynamicValue();
        }
        SubLObject caching_state = parser.$stanford_parse_caching_state$.getGlobalValue();
        if (parser.NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name((SubLObject)parser.$sym89$STANFORD_PARSE, (SubLObject)parser.$sym91$_STANFORD_PARSE_CACHING_STATE_, (SubLObject)parser.$int69$500, (SubLObject)parser.EQUAL, (SubLObject)parser.THREE_INTEGER, (SubLObject)parser.ZERO_INTEGER);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_3(string, server, port);
        final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, (SubLObject)parser.UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = (SubLObject)parser.NIL;
            collision = cdolist_list_var.first();
            while (parser.NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                final SubLObject results2 = conses_high.second(collision);
                if (string.equal(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (server.equal(cached_args.first())) {
                        cached_args = cached_args.rest();
                        if (parser.NIL != cached_args && parser.NIL == cached_args.rest() && port.equal(cached_args.first())) {
                            return memoization_state.caching_results(results2);
                        }
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            }
        }
        final SubLObject results3 = Values.arg2(Values.resetMultipleValues(), (SubLObject)Values.multiple_value_list(stanford_parse_internal(string, server, port)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, (SubLObject)ConsesLow.list(string, server, port));
        return memoization_state.caching_results(results3);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/parser.lisp", position = 10524L)
    public static SubLObject auxify(final SubLObject tree) {
        if (parser.NIL != word_tree.word_expression_p(tree)) {
            if (parser.NIL != aux_word_p(conses_high.second(tree))) {
                ConsesLow.rplaca(tree, (SubLObject)parser.$kw92$AUX);
            }
        }
        else {
            SubLObject cdolist_list_var = tree.rest();
            SubLObject daughter = (SubLObject)parser.NIL;
            daughter = cdolist_list_var.first();
            while (parser.NIL != cdolist_list_var) {
                auxify(daughter);
                cdolist_list_var = cdolist_list_var.rest();
                daughter = cdolist_list_var.first();
            }
        }
        return tree;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/parser.lisp", position = 10885L)
    public static SubLObject aux_word_p(final SubLObject string) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return conses_high.member(string, parser.$aux_word_strings$.getDynamicValue(thread), (SubLObject)parser.EQUALP, (SubLObject)parser.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/parser.lisp", position = 12224L)
    public static SubLObject get_link_parser_program_arglist() {
        return (SubLObject)ConsesLow.list((SubLObject)parser.$str110$_r, parser.$link_parser_program_redfilename$.getGlobalValue());
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/parser.lisp", position = 12331L)
    public static SubLObject launch_link_parser_program_locally(SubLObject auto_restartP) {
        if (auto_restartP == parser.UNPROVIDED) {
            auto_restartP = (SubLObject)parser.T;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject program = parser.$link_parser_program_name$.getGlobalValue();
        final SubLObject args = get_link_parser_program_arglist();
        final SubLObject source_file = parser.$link_parser_program_inputfile$.getGlobalValue();
        final SubLObject target_file = parser.$link_parser_program_outputfile$.getGlobalValue();
        SubLObject successP = (SubLObject)parser.NIL;
        SubLObject os_process = (SubLObject)parser.NIL;
        for (SubLObject doneP = (SubLObject)parser.NIL; parser.NIL == doneP; doneP = (SubLObject)SubLObjectFactory.makeBoolean(parser.NIL == auto_restartP)) {
            try {
                os_process = os_process_utilities.make_os_process(parser.$link_parser_server_os_process_name$.getGlobalValue(), program, args, source_file, target_file, StreamsLow.$standard_output$.getDynamicValue(thread));
                os_process_utilities.wait_until_os_process_finished(os_process);
            }
            finally {
                final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)parser.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    if (parser.NIL != os_process) {
                        os_process_utilities.destroy_os_process(os_process);
                    }
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
            if (parser.NIL != os_process) {
                successP = os_process_utilities.os_process_exit_code(os_process);
            }
        }
        return successP;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/parser.lisp", position = 13287L)
    public static SubLObject launch_link_parser_program_locally_in_process(SubLObject auto_restartP) {
        if (auto_restartP == parser.UNPROVIDED) {
            auto_restartP = (SubLObject)parser.T;
        }
        return subl_promotions.make_process_with_args(parser.$link_parser_server_proxy_process_name$.getGlobalValue(), (SubLObject)parser.$sym111$LAUNCH_LINK_PARSER_PROGRAM_LOCALLY, (SubLObject)ConsesLow.list(auto_restartP));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/parser.lisp", position = 13536L)
    public static SubLObject get_link_parser_options(final SubLObject link_parser) {
        return classes.subloop_get_access_protected_instance_slot(link_parser, (SubLObject)parser.THREE_INTEGER, (SubLObject)parser.$sym114$OPTIONS);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/parser.lisp", position = 13536L)
    public static SubLObject set_link_parser_options(final SubLObject link_parser, final SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(link_parser, value, (SubLObject)parser.THREE_INTEGER, (SubLObject)parser.$sym114$OPTIONS);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/parser.lisp", position = 13536L)
    public static SubLObject subloop_reserved_initialize_link_parser_class(final SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, (SubLObject)parser.$sym2$OBJECT, (SubLObject)parser.$sym6$INSTANCE_COUNT, (SubLObject)parser.ZERO_INTEGER);
        return (SubLObject)parser.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/parser.lisp", position = 13536L)
    public static SubLObject subloop_reserved_initialize_link_parser_instance(final SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, (SubLObject)parser.$sym2$OBJECT, (SubLObject)parser.$sym8$ISOLATED_P, (SubLObject)parser.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)parser.$sym2$OBJECT, (SubLObject)parser.$sym9$INSTANCE_NUMBER, (SubLObject)parser.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)parser.$sym1$PARSER, (SubLObject)parser.$sym5$ERROR_HANDLING, (SubLObject)parser.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)parser.$sym1$PARSER, (SubLObject)parser.$sym4$TIMEOUT, (SubLObject)parser.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)parser.$sym112$LINK_PARSER, (SubLObject)parser.$sym114$OPTIONS, (SubLObject)parser.NIL);
        return (SubLObject)parser.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/parser.lisp", position = 13536L)
    public static SubLObject link_parser_p(final SubLObject link_parser) {
        return classes.subloop_instanceof_class(link_parser, (SubLObject)parser.$sym112$LINK_PARSER);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/parser.lisp", position = 13703L)
    public static SubLObject link_parser_initialize_method(final SubLObject self) {
        parser_initialize_method(self);
        linkage.ensure_linkage_initialized();
        return self;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/parser.lisp", position = 13830L)
    public static SubLObject new_link_parser(SubLObject options, SubLObject error_handling, SubLObject timeout) {
        if (options == parser.UNPROVIDED) {
            options = linkage.$link_parse_options$.getDynamicValue();
        }
        if (error_handling == parser.UNPROVIDED) {
            error_handling = (SubLObject)parser.$kw15$THROW;
        }
        if (timeout == parser.UNPROVIDED) {
            timeout = parser.$default_parser_timeout$.getDynamicValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        thread.resetMultipleValues();
        final SubLObject host = ensure_link_server_running();
        final SubLObject port = thread.secondMultipleValue();
        thread.resetMultipleValues();
        if (parser.NIL != host && parser.NIL != port) {
            linkage.$link_parser$.setDynamicValue(host, thread);
            linkage.$link_port$.setDynamicValue(port, thread);
            final SubLObject v_parser = new_parser((SubLObject)parser.$sym112$LINK_PARSER, (SubLObject)ConsesLow.list((SubLObject)parser.$kw27$ERROR_HANDLING, error_handling, (SubLObject)parser.$kw28$TIMEOUT, timeout));
            instances.set_slot(v_parser, (SubLObject)parser.$sym114$OPTIONS, options);
            return v_parser;
        }
        return (SubLObject)parser.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/parser.lisp", position = 14509L)
    public static SubLObject listening_socketP(final SubLObject host, final SubLObject port) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject error = (SubLObject)parser.NIL;
        try {
            thread.throwStack.push(subl_macro_promotions.$catch_error_message_target$.getGlobalValue());
            final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
            try {
                Errors.$error_handler$.bind((SubLObject)parser.$sym47$CATCH_ERROR_MESSAGE_HANDLER, thread);
                try {
                    SubLObject stream = (SubLObject)parser.NIL;
                    try {
                        stream = subl_promotions.open_tcp_stream_with_timeout(host, port, (SubLObject)parser.NIL, (SubLObject)parser.$kw120$PUBLIC);
                        if (parser.NIL != subl_macro_promotions.validate_tcp_connection(stream, host, port)) {}
                    }
                    finally {
                        final SubLObject _prev_bind_0_$8 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                        try {
                            Threads.$is_thread_performing_cleanupP$.bind((SubLObject)parser.T, thread);
                            final SubLObject _values = Values.getValuesAsVector();
                            if (parser.NIL != stream) {
                                streams_high.close(stream, (SubLObject)parser.UNPROVIDED);
                            }
                            Values.restoreValuesFromVector(_values);
                        }
                        finally {
                            Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$8, thread);
                        }
                    }
                }
                catch (Throwable catch_var) {
                    Errors.handleThrowable(catch_var, (SubLObject)parser.NIL);
                }
            }
            finally {
                Errors.$error_handler$.rebind(_prev_bind_0, thread);
            }
        }
        catch (Throwable ccatch_env_var) {
            error = Errors.handleThrowable(ccatch_env_var, subl_macro_promotions.$catch_error_message_target$.getGlobalValue());
        }
        finally {
            thread.throwStack.pop();
        }
        return (SubLObject)SubLObjectFactory.makeBoolean(parser.NIL == error);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/parser.lisp", position = 14814L)
    public static SubLObject ensure_link_server_running() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject host = linkage.$link_parser$.getDynamicValue(thread);
        SubLObject port = linkage.$link_port$.getDynamicValue(thread);
        SubLObject timed_outP = (SubLObject)parser.NIL;
        if (parser.NIL == linkage.link_ping(host, port, (SubLObject)parser.UNPROVIDED)) {
            if (parser.NIL != linkage.link_ping((SubLObject)parser.$str121$localhost, linkage.$link_port$.getDynamicValue(thread), (SubLObject)parser.UNPROVIDED)) {
                host = (SubLObject)parser.$str121$localhost;
                port = linkage.$link_port$.getDynamicValue(thread);
            }
            else if (parser.NIL == parser.$link_server_allow_local_start$.getGlobalValue() || parser.NIL != listening_socketP((SubLObject)parser.$str121$localhost, linkage.$link_port$.getDynamicValue(thread))) {
                host = (SubLObject)parser.NIL;
                port = (SubLObject)parser.NIL;
            }
            else {
                host = (SubLObject)parser.$str121$localhost;
                port = linkage.$link_port$.getDynamicValue(thread);
                launch_link_parser_program_locally_in_process((SubLObject)parser.T);
                final SubLObject tag = subl_macro_promotions.with_timeout_make_tag();
                try {
                    thread.throwStack.push(tag);
                    final SubLObject _prev_bind_0 = subl_macro_promotions.$within_with_timeout$.currentBinding(thread);
                    try {
                        subl_macro_promotions.$within_with_timeout$.bind((SubLObject)parser.T, thread);
                        SubLObject timer = (SubLObject)parser.NIL;
                        try {
                            final SubLObject _prev_bind_0_$9 = subl_macro_promotions.$with_timeout_nesting_depth$.currentBinding(thread);
                            try {
                                subl_macro_promotions.$with_timeout_nesting_depth$.bind(Numbers.add((SubLObject)parser.ONE_INTEGER, subl_macro_promotions.$with_timeout_nesting_depth$.getDynamicValue(thread)), thread);
                                timer = subl_macro_promotions.with_timeout_start_timer((SubLObject)parser.TEN_INTEGER, tag);
                                while (parser.NIL == linkage.link_ping(host, port, (SubLObject)parser.UNPROVIDED)) {
                                    Threads.sleep((SubLObject)parser.ONE_INTEGER);
                                }
                            }
                            finally {
                                subl_macro_promotions.$with_timeout_nesting_depth$.rebind(_prev_bind_0_$9, thread);
                            }
                        }
                        finally {
                            final SubLObject _prev_bind_0_$10 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)parser.T, thread);
                                final SubLObject _values = Values.getValuesAsVector();
                                subl_macro_promotions.with_timeout_stop_timer(timer);
                                Values.restoreValuesFromVector(_values);
                            }
                            finally {
                                Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$10, thread);
                            }
                        }
                    }
                    finally {
                        subl_macro_promotions.$within_with_timeout$.rebind(_prev_bind_0, thread);
                    }
                }
                catch (Throwable ccatch_env_var) {
                    timed_outP = Errors.handleThrowable(ccatch_env_var, tag);
                }
                finally {
                    thread.throwStack.pop();
                }
                if (parser.NIL != timed_outP) {
                    host = (SubLObject)parser.NIL;
                    port = (SubLObject)parser.NIL;
                }
            }
        }
        return Values.values(host, port);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/parser.lisp", position = 15591L)
    public static SubLObject link_parser_parse_method(final SubLObject self, final SubLObject text, SubLObject lexicon, SubLObject v_context) {
        if (lexicon == parser.UNPROVIDED) {
            lexicon = (SubLObject)parser.NIL;
        }
        if (v_context == parser.UNPROVIDED) {
            v_context = object.new_class_instance((SubLObject)parser.$sym53$PARSE_TREE_CONTEXT);
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_link_parser_method = (SubLObject)parser.NIL;
        final SubLObject options = get_link_parser_options(self);
        final SubLObject timeout = get_parser_timeout(self);
        try {
            thread.throwStack.push(parser.$sym123$OUTER_CATCH_FOR_LINK_PARSER_METHOD);
            try {
                SubLObject v_linkage = (SubLObject)parser.NIL;
                SubLObject error = (SubLObject)parser.NIL;
                SubLObject timeoutP = (SubLObject)parser.NIL;
                try {
                    thread.throwStack.push(subl_macro_promotions.$catch_error_message_target$.getGlobalValue());
                    final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
                    try {
                        Errors.$error_handler$.bind((SubLObject)parser.$sym47$CATCH_ERROR_MESSAGE_HANDLER, thread);
                        try {
                            final SubLObject tag = subl_macro_promotions.with_timeout_make_tag();
                            try {
                                thread.throwStack.push(tag);
                                final SubLObject _prev_bind_0_$11 = subl_macro_promotions.$within_with_timeout$.currentBinding(thread);
                                try {
                                    subl_macro_promotions.$within_with_timeout$.bind((SubLObject)parser.T, thread);
                                    SubLObject timer = (SubLObject)parser.NIL;
                                    try {
                                        final SubLObject _prev_bind_0_$12 = subl_macro_promotions.$with_timeout_nesting_depth$.currentBinding(thread);
                                        try {
                                            subl_macro_promotions.$with_timeout_nesting_depth$.bind(Numbers.add((SubLObject)parser.ONE_INTEGER, subl_macro_promotions.$with_timeout_nesting_depth$.getDynamicValue(thread)), thread);
                                            timer = subl_macro_promotions.with_timeout_start_timer(timeout, tag);
                                            v_linkage = linkage.new_linkage(text, (SubLObject)ConsesLow.list((SubLObject)parser.$kw124$CONTEXT, v_context, (SubLObject)parser.$kw125$OPTIONS, options, (SubLObject)parser.$kw126$LEXICON, lexicon));
                                            if (parser.NIL != timeoutP) {
                                                Errors.error((SubLObject)parser.$str127$Link_Parser_timed_out_after__a_se, timeout);
                                            }
                                        }
                                        finally {
                                            subl_macro_promotions.$with_timeout_nesting_depth$.rebind(_prev_bind_0_$12, thread);
                                        }
                                    }
                                    finally {
                                        final SubLObject _prev_bind_0_$13 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                        try {
                                            Threads.$is_thread_performing_cleanupP$.bind((SubLObject)parser.T, thread);
                                            final SubLObject _values = Values.getValuesAsVector();
                                            subl_macro_promotions.with_timeout_stop_timer(timer);
                                            Values.restoreValuesFromVector(_values);
                                        }
                                        finally {
                                            Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$13, thread);
                                        }
                                    }
                                }
                                finally {
                                    subl_macro_promotions.$within_with_timeout$.rebind(_prev_bind_0_$11, thread);
                                }
                            }
                            catch (Throwable ccatch_env_var) {
                                timeoutP = Errors.handleThrowable(ccatch_env_var, tag);
                            }
                            finally {
                                thread.throwStack.pop();
                            }
                            if (parser.NIL != error) {
                                parser_handle_error_method(self, error);
                            }
                        }
                        catch (Throwable catch_var) {
                            Errors.handleThrowable(catch_var, (SubLObject)parser.NIL);
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
                Dynamic.sublisp_throw((SubLObject)parser.$sym123$OUTER_CATCH_FOR_LINK_PARSER_METHOD, v_linkage);
            }
            finally {
                final SubLObject _prev_bind_2 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)parser.T, thread);
                    final SubLObject _values2 = Values.getValuesAsVector();
                    set_link_parser_options(self, options);
                    set_parser_timeout(self, timeout);
                    Values.restoreValuesFromVector(_values2);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_2, thread);
                }
            }
        }
        catch (Throwable ccatch_env_var3) {
            catch_var_for_link_parser_method = Errors.handleThrowable(ccatch_env_var3, (SubLObject)parser.$sym123$OUTER_CATCH_FOR_LINK_PARSER_METHOD);
        }
        finally {
            thread.throwStack.pop();
        }
        return catch_var_for_link_parser_method;
    }
    
    public static SubLObject declare_parser_file() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.parser", "get_parser_timeout", "GET-PARSER-TIMEOUT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.parser", "set_parser_timeout", "SET-PARSER-TIMEOUT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.parser", "get_parser_error_handling", "GET-PARSER-ERROR-HANDLING", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.parser", "set_parser_error_handling", "SET-PARSER-ERROR-HANDLING", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.parser", "subloop_reserved_initialize_parser_class", "SUBLOOP-RESERVED-INITIALIZE-PARSER-CLASS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.parser", "subloop_reserved_initialize_parser_instance", "SUBLOOP-RESERVED-INITIALIZE-PARSER-INSTANCE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.parser", "parser_p", "PARSER-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.parser", "parser_initialize_method", "PARSER-INITIALIZE-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.parser", "parser_print_method", "PARSER-PRINT-METHOD", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.parser", "new_parser", "NEW-PARSER", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.parser", "parser_handle_error_method", "PARSER-HANDLE-ERROR-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.parser", "subloop_reserved_initialize_charniak_parser_class", "SUBLOOP-RESERVED-INITIALIZE-CHARNIAK-PARSER-CLASS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.parser", "subloop_reserved_initialize_charniak_parser_instance", "SUBLOOP-RESERVED-INITIALIZE-CHARNIAK-PARSER-INSTANCE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.parser", "charniak_parser_p", "CHARNIAK-PARSER-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.parser", "charniak_parser_availableP", "CHARNIAK-PARSER-AVAILABLE?", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.parser", "force_charniak_parser_availableP", "FORCE-CHARNIAK-PARSER-AVAILABLE?", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.parser", "new_charniak_parser", "NEW-CHARNIAK-PARSER", 0, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.parser", "charniak_parser_parse_multiple_method", "CHARNIAK-PARSER-PARSE-MULTIPLE-METHOD", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.parser", "strip_shell", "STRIP-SHELL", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.parser", "charniak_parser_parse_method", "CHARNIAK-PARSER-PARSE-METHOD", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.parser", "clear_charniak_parse", "CLEAR-CHARNIAK-PARSE", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.parser", "remove_charniak_parse", "REMOVE-CHARNIAK-PARSE", 1, 5, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.parser", "charniak_parse_internal", "CHARNIAK-PARSE-INTERNAL", 6, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.parser", "charniak_parse", "CHARNIAK-PARSE", 1, 5, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.parser", "retag", "RETAG", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.parser", "get_stanford_parser", "GET-STANFORD-PARSER", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.parser", "subloop_reserved_initialize_stanford_parser_class", "SUBLOOP-RESERVED-INITIALIZE-STANFORD-PARSER-CLASS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.parser", "subloop_reserved_initialize_stanford_parser_instance", "SUBLOOP-RESERVED-INITIALIZE-STANFORD-PARSER-INSTANCE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.parser", "stanford_parser_p", "STANFORD-PARSER-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.parser", "stanford_parser_availableP", "STANFORD-PARSER-AVAILABLE?", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.parser", "force_stanford_parser_availableP", "FORCE-STANFORD-PARSER-AVAILABLE?", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.parser", "new_stanford_parser", "NEW-STANFORD-PARSER", 0, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.parser", "stanford_parser_parse_method", "STANFORD-PARSER-PARSE-METHOD", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.parser", "clear_stanford_parse", "CLEAR-STANFORD-PARSE", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.parser", "remove_stanford_parse", "REMOVE-STANFORD-PARSE", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.parser", "stanford_parse_internal", "STANFORD-PARSE-INTERNAL", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.parser", "stanford_parse", "STANFORD-PARSE", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.parser", "auxify", "AUXIFY", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.parser", "aux_word_p", "AUX-WORD-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.parser", "get_link_parser_program_arglist", "GET-LINK-PARSER-PROGRAM-ARGLIST", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.parser", "launch_link_parser_program_locally", "LAUNCH-LINK-PARSER-PROGRAM-LOCALLY", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.parser", "launch_link_parser_program_locally_in_process", "LAUNCH-LINK-PARSER-PROGRAM-LOCALLY-IN-PROCESS", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.parser", "get_link_parser_options", "GET-LINK-PARSER-OPTIONS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.parser", "set_link_parser_options", "SET-LINK-PARSER-OPTIONS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.parser", "subloop_reserved_initialize_link_parser_class", "SUBLOOP-RESERVED-INITIALIZE-LINK-PARSER-CLASS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.parser", "subloop_reserved_initialize_link_parser_instance", "SUBLOOP-RESERVED-INITIALIZE-LINK-PARSER-INSTANCE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.parser", "link_parser_p", "LINK-PARSER-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.parser", "link_parser_initialize_method", "LINK-PARSER-INITIALIZE-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.parser", "new_link_parser", "NEW-LINK-PARSER", 0, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.parser", "listening_socketP", "LISTENING-SOCKET?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.parser", "ensure_link_server_running", "ENSURE-LINK-SERVER-RUNNING", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.parser", "link_parser_parse_method", "LINK-PARSER-PARSE-METHOD", 2, 2, false);
        return (SubLObject)parser.NIL;
    }
    
    public static SubLObject init_parser_file() {
        parser.$default_parser_timeout$ = SubLFiles.defparameter("*DEFAULT-PARSER-TIMEOUT*", (SubLObject)parser.$int0$10000);
        parser.$charniak_parser_host$ = SubLFiles.defparameter("*CHARNIAK-PARSER-HOST*", red_infrastructure_macros.red_def_helper((SubLObject)(parser.$list38.isSymbol() ? Symbols.symbol_value((SubLObject)parser.$list38) : parser.$list38), (SubLObject)parser.$sym39$_CHARNIAK_PARSER_HOST_, (SubLObject)(parser.$str40$charniakparser_cyc_com.isSymbol() ? Symbols.symbol_value((SubLObject)parser.$str40$charniakparser_cyc_com) : parser.$str40$charniakparser_cyc_com), (SubLObject)parser.$kw41$PARAMETER, (SubLObject)parser.UNPROVIDED));
        parser.$charniak_available$ = SubLFiles.deflexical("*CHARNIAK-AVAILABLE*", (SubLObject)parser.$kw46$UNTESTED);
        parser.$charniak_parse_caching_state$ = SubLFiles.deflexical("*CHARNIAK-PARSE-CACHING-STATE*", (SubLObject)parser.NIL);
        parser.$stanford_parser_host$ = SubLFiles.defparameter("*STANFORD-PARSER-HOST*", red_infrastructure_macros.red_def_helper((SubLObject)(parser.$list75.isSymbol() ? Symbols.symbol_value((SubLObject)parser.$list75) : parser.$list75), (SubLObject)parser.$sym76$_STANFORD_PARSER_HOST_, (SubLObject)(parser.$str77$stanfordparser_cyc_com.isSymbol() ? Symbols.symbol_value((SubLObject)parser.$str77$stanfordparser_cyc_com) : parser.$str77$stanfordparser_cyc_com), (SubLObject)parser.$kw41$PARAMETER, (SubLObject)parser.UNPROVIDED));
        parser.$stanford_parser_port$ = SubLFiles.defparameter("*STANFORD-PARSER-PORT*", red_infrastructure_macros.red_def_helper((SubLObject)(parser.$list78.isSymbol() ? Symbols.symbol_value((SubLObject)parser.$list78) : parser.$list78), (SubLObject)parser.$sym79$_STANFORD_PARSER_PORT_, (SubLObject)(parser.$int80$8888.isSymbol() ? Symbols.symbol_value((SubLObject)parser.$int80$8888) : parser.$int80$8888), (SubLObject)parser.$kw41$PARAMETER, (SubLObject)parser.UNPROVIDED));
        parser.$stanford_parser$ = SubLFiles.defparameter("*STANFORD-PARSER*", (SubLObject)parser.NIL);
        parser.$stanford_available$ = SubLFiles.deflexical("*STANFORD-AVAILABLE*", (SubLObject)parser.$kw46$UNTESTED);
        parser.$stanford_parse_caching_state$ = SubLFiles.deflexical("*STANFORD-PARSE-CACHING-STATE*", (SubLObject)parser.NIL);
        parser.$aux_word_strings$ = SubLFiles.defparameter("*AUX-WORD-STRINGS*", (SubLObject)parser.$list93);
        parser.$link_parser_program_name$ = SubLFiles.deflexical("*LINK-PARSER-PROGRAM-NAME*", red_infrastructure_macros.red_def_helper((SubLObject)(parser.$list94.isSymbol() ? Symbols.symbol_value((SubLObject)parser.$list94) : parser.$list94), (SubLObject)parser.$sym95$_LINK_PARSER_PROGRAM_NAME_, (SubLObject)(parser.$str96$_cyc_top_data_link_server.isSymbol() ? Symbols.symbol_value((SubLObject)parser.$str96$_cyc_top_data_link_server) : parser.$str96$_cyc_top_data_link_server), (SubLObject)parser.$kw97$LEXICAL, (SubLObject)parser.UNPROVIDED));
        parser.$link_parser_program_redfilename$ = SubLFiles.deflexical("*LINK-PARSER-PROGRAM-REDFILENAME*", red_infrastructure_macros.red_def_helper((SubLObject)(parser.$list98.isSymbol() ? Symbols.symbol_value((SubLObject)parser.$list98) : parser.$list98), (SubLObject)parser.$sym99$_LINK_PARSER_PROGRAM_REDFILENAME_, (SubLObject)(parser.$str100$_cyc_top_repository_red_external_.isSymbol() ? Symbols.symbol_value((SubLObject)parser.$str100$_cyc_top_repository_red_external_) : parser.$str100$_cyc_top_repository_red_external_), (SubLObject)parser.$kw97$LEXICAL, (SubLObject)parser.UNPROVIDED));
        parser.$link_parser_program_inputfile$ = SubLFiles.deflexical("*LINK-PARSER-PROGRAM-INPUTFILE*", red_infrastructure_macros.red_def_helper((SubLObject)(parser.$list101.isSymbol() ? Symbols.symbol_value((SubLObject)parser.$list101) : parser.$list101), (SubLObject)parser.$sym102$_LINK_PARSER_PROGRAM_INPUTFILE_, (SubLObject)(parser.$str103$_dev_null.isSymbol() ? Symbols.symbol_value((SubLObject)parser.$str103$_dev_null) : parser.$str103$_dev_null), (SubLObject)parser.$kw97$LEXICAL, (SubLObject)parser.UNPROVIDED));
        parser.$link_parser_program_outputfile$ = SubLFiles.deflexical("*LINK-PARSER-PROGRAM-OUTPUTFILE*", red_infrastructure_macros.red_def_helper((SubLObject)(parser.$list104.isSymbol() ? Symbols.symbol_value((SubLObject)parser.$list104) : parser.$list104), (SubLObject)parser.$sym105$_LINK_PARSER_PROGRAM_OUTPUTFILE_, (SubLObject)(parser.$str103$_dev_null.isSymbol() ? Symbols.symbol_value((SubLObject)parser.$str103$_dev_null) : parser.$str103$_dev_null), (SubLObject)parser.$kw97$LEXICAL, (SubLObject)parser.UNPROVIDED));
        parser.$link_server_allow_local_start$ = SubLFiles.deflexical("*LINK-SERVER-ALLOW-LOCAL-START*", red_infrastructure_macros.red_def_helper((SubLObject)(parser.$list106.isSymbol() ? Symbols.symbol_value((SubLObject)parser.$list106) : parser.$list106), (SubLObject)parser.$sym107$_LINK_SERVER_ALLOW_LOCAL_START_, (SubLObject)(parser.NIL.isSymbol() ? Symbols.symbol_value((SubLObject)parser.NIL) : parser.NIL), (SubLObject)parser.$kw97$LEXICAL, (SubLObject)parser.UNPROVIDED));
        parser.$link_parser_server_os_process_name$ = SubLFiles.deflexical("*LINK-PARSER-SERVER-OS-PROCESS-NAME*", (SubLObject)parser.$str108$Link_Parser_Server);
        parser.$link_parser_server_proxy_process_name$ = SubLFiles.deflexical("*LINK-PARSER-SERVER-PROXY-PROCESS-NAME*", Sequences.cconcatenate((SubLObject)parser.$str109$Process_for_, parser.$link_parser_server_os_process_name$.getGlobalValue()));
        return (SubLObject)parser.NIL;
    }
    
    public static SubLObject setup_parser_file() {
        classes.subloop_new_class((SubLObject)parser.$sym1$PARSER, (SubLObject)parser.$sym2$OBJECT, (SubLObject)parser.NIL, (SubLObject)parser.T, (SubLObject)parser.$list3);
        classes.class_set_implements_slot_listeners((SubLObject)parser.$sym1$PARSER, (SubLObject)parser.NIL);
        classes.subloop_note_class_initialization_function((SubLObject)parser.$sym1$PARSER, (SubLObject)parser.$sym7$SUBLOOP_RESERVED_INITIALIZE_PARSER_CLASS);
        classes.subloop_note_instance_initialization_function((SubLObject)parser.$sym1$PARSER, (SubLObject)parser.$sym10$SUBLOOP_RESERVED_INITIALIZE_PARSER_INSTANCE);
        subloop_reserved_initialize_parser_class((SubLObject)parser.$sym1$PARSER);
        methods.methods_incorporate_instance_method((SubLObject)parser.$sym11$INITIALIZE, (SubLObject)parser.$sym1$PARSER, (SubLObject)parser.$list12, (SubLObject)parser.NIL, (SubLObject)parser.$list13);
        methods.subloop_register_instance_method((SubLObject)parser.$sym1$PARSER, (SubLObject)parser.$sym11$INITIALIZE, (SubLObject)parser.$sym17$PARSER_INITIALIZE_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)parser.$sym18$PRINT, (SubLObject)parser.$sym1$PARSER, (SubLObject)parser.$list19, (SubLObject)parser.$list20, (SubLObject)parser.$list21);
        methods.subloop_register_instance_method((SubLObject)parser.$sym1$PARSER, (SubLObject)parser.$sym18$PRINT, (SubLObject)parser.$sym26$PARSER_PRINT_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)parser.$sym32$HANDLE_ERROR, (SubLObject)parser.$sym1$PARSER, (SubLObject)parser.$list12, (SubLObject)parser.$list33, (SubLObject)parser.$list34);
        methods.subloop_register_instance_method((SubLObject)parser.$sym1$PARSER, (SubLObject)parser.$sym32$HANDLE_ERROR, (SubLObject)parser.$sym37$PARSER_HANDLE_ERROR_METHOD);
        classes.subloop_new_class((SubLObject)parser.$sym42$CHARNIAK_PARSER, (SubLObject)parser.$sym1$PARSER, (SubLObject)parser.NIL, (SubLObject)parser.NIL, (SubLObject)parser.$list43);
        classes.class_set_implements_slot_listeners((SubLObject)parser.$sym42$CHARNIAK_PARSER, (SubLObject)parser.NIL);
        classes.subloop_note_class_initialization_function((SubLObject)parser.$sym42$CHARNIAK_PARSER, (SubLObject)parser.$sym44$SUBLOOP_RESERVED_INITIALIZE_CHARNIAK_PARSER_CLASS);
        classes.subloop_note_instance_initialization_function((SubLObject)parser.$sym42$CHARNIAK_PARSER, (SubLObject)parser.$sym45$SUBLOOP_RESERVED_INITIALIZE_CHARNIAK_PARSER_INSTANCE);
        subloop_reserved_initialize_charniak_parser_class((SubLObject)parser.$sym42$CHARNIAK_PARSER);
        methods.methods_incorporate_instance_method((SubLObject)parser.$sym50$PARSE_MULTIPLE, (SubLObject)parser.$sym42$CHARNIAK_PARSER, (SubLObject)parser.$list19, (SubLObject)parser.$list51, (SubLObject)parser.$list52);
        methods.subloop_register_instance_method((SubLObject)parser.$sym42$CHARNIAK_PARSER, (SubLObject)parser.$sym50$PARSE_MULTIPLE, (SubLObject)parser.$sym56$CHARNIAK_PARSER_PARSE_MULTIPLE_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)parser.$sym58$PARSE, (SubLObject)parser.$sym42$CHARNIAK_PARSER, (SubLObject)parser.$list19, (SubLObject)parser.$list51, (SubLObject)parser.$list59);
        methods.subloop_register_instance_method((SubLObject)parser.$sym42$CHARNIAK_PARSER, (SubLObject)parser.$sym58$PARSE, (SubLObject)parser.$sym62$CHARNIAK_PARSER_PARSE_METHOD);
        memoization_state.note_globally_cached_function((SubLObject)parser.$sym65$CHARNIAK_PARSE);
        classes.subloop_new_class((SubLObject)parser.$sym81$STANFORD_PARSER, (SubLObject)parser.$sym1$PARSER, (SubLObject)parser.NIL, (SubLObject)parser.NIL, (SubLObject)parser.$list43);
        classes.class_set_implements_slot_listeners((SubLObject)parser.$sym81$STANFORD_PARSER, (SubLObject)parser.NIL);
        classes.subloop_note_class_initialization_function((SubLObject)parser.$sym81$STANFORD_PARSER, (SubLObject)parser.$sym82$SUBLOOP_RESERVED_INITIALIZE_STANFORD_PARSER_CLASS);
        classes.subloop_note_instance_initialization_function((SubLObject)parser.$sym81$STANFORD_PARSER, (SubLObject)parser.$sym83$SUBLOOP_RESERVED_INITIALIZE_STANFORD_PARSER_INSTANCE);
        subloop_reserved_initialize_stanford_parser_class((SubLObject)parser.$sym81$STANFORD_PARSER);
        methods.methods_incorporate_instance_method((SubLObject)parser.$sym58$PARSE, (SubLObject)parser.$sym81$STANFORD_PARSER, (SubLObject)parser.$list19, (SubLObject)parser.$list51, (SubLObject)parser.$list85);
        methods.subloop_register_instance_method((SubLObject)parser.$sym81$STANFORD_PARSER, (SubLObject)parser.$sym58$PARSE, (SubLObject)parser.$sym88$STANFORD_PARSER_PARSE_METHOD);
        memoization_state.note_globally_cached_function((SubLObject)parser.$sym89$STANFORD_PARSE);
        classes.subloop_new_class((SubLObject)parser.$sym112$LINK_PARSER, (SubLObject)parser.$sym1$PARSER, (SubLObject)parser.NIL, (SubLObject)parser.NIL, (SubLObject)parser.$list113);
        classes.class_set_implements_slot_listeners((SubLObject)parser.$sym112$LINK_PARSER, (SubLObject)parser.NIL);
        classes.subloop_note_class_initialization_function((SubLObject)parser.$sym112$LINK_PARSER, (SubLObject)parser.$sym115$SUBLOOP_RESERVED_INITIALIZE_LINK_PARSER_CLASS);
        classes.subloop_note_instance_initialization_function((SubLObject)parser.$sym112$LINK_PARSER, (SubLObject)parser.$sym116$SUBLOOP_RESERVED_INITIALIZE_LINK_PARSER_INSTANCE);
        subloop_reserved_initialize_link_parser_class((SubLObject)parser.$sym112$LINK_PARSER);
        methods.methods_incorporate_instance_method((SubLObject)parser.$sym11$INITIALIZE, (SubLObject)parser.$sym112$LINK_PARSER, (SubLObject)parser.$list12, (SubLObject)parser.NIL, (SubLObject)parser.$list117);
        methods.subloop_register_instance_method((SubLObject)parser.$sym112$LINK_PARSER, (SubLObject)parser.$sym11$INITIALIZE, (SubLObject)parser.$sym118$LINK_PARSER_INITIALIZE_METHOD);
        access_macros.register_external_symbol((SubLObject)parser.$sym119$NEW_LINK_PARSER);
        methods.methods_incorporate_instance_method((SubLObject)parser.$sym58$PARSE, (SubLObject)parser.$sym112$LINK_PARSER, (SubLObject)parser.$list19, (SubLObject)parser.$list51, (SubLObject)parser.$list122);
        methods.subloop_register_instance_method((SubLObject)parser.$sym112$LINK_PARSER, (SubLObject)parser.$sym58$PARSE, (SubLObject)parser.$sym128$LINK_PARSER_PARSE_METHOD);
        return (SubLObject)parser.NIL;
    }
    
    @Override
	public void declareFunctions() {
        declare_parser_file();
    }
    
    @Override
	public void initializeVariables() {
        init_parser_file();
    }
    
    @Override
	public void runTopLevelForms() {
        setup_parser_file();
    }
    
    static {
        me = (SubLFile)new parser();
        parser.$default_parser_timeout$ = null;
        parser.$charniak_parser_host$ = null;
        parser.$charniak_available$ = null;
        parser.$charniak_parse_caching_state$ = null;
        parser.$stanford_parser_host$ = null;
        parser.$stanford_parser_port$ = null;
        parser.$stanford_parser$ = null;
        parser.$stanford_available$ = null;
        parser.$stanford_parse_caching_state$ = null;
        parser.$aux_word_strings$ = null;
        parser.$link_parser_program_name$ = null;
        parser.$link_parser_program_redfilename$ = null;
        parser.$link_parser_program_inputfile$ = null;
        parser.$link_parser_program_outputfile$ = null;
        parser.$link_server_allow_local_start$ = null;
        parser.$link_parser_server_os_process_name$ = null;
        parser.$link_parser_server_proxy_process_name$ = null;
        $int0$10000 = SubLObjectFactory.makeInteger(10000);
        $sym1$PARSER = SubLObjectFactory.makeSymbol("PARSER");
        $sym2$OBJECT = SubLObjectFactory.makeSymbol("OBJECT");
        $list3 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ERROR-HANDLING"), (SubLObject)SubLObjectFactory.makeKeyword("INSTANCE"), (SubLObject)SubLObjectFactory.makeKeyword("PROTECTED")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TIMEOUT"), (SubLObject)SubLObjectFactory.makeKeyword("INSTANCE"), (SubLObject)SubLObjectFactory.makeKeyword("PROTECTED")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("PRINT"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("STREAM"), (SubLObject)SubLObjectFactory.makeSymbol("DEPTH")), (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("PARSE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TEXT"), (SubLObject)SubLObjectFactory.makeSymbol("&OPTIONAL"), (SubLObject)SubLObjectFactory.makeSymbol("LEXICON"), (SubLObject)SubLObjectFactory.makeSymbol("CONTEXT")), (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("HANDLE-ERROR"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ERROR")), (SubLObject)SubLObjectFactory.makeKeyword("PRIVATE")));
        $sym4$TIMEOUT = SubLObjectFactory.makeSymbol("TIMEOUT");
        $sym5$ERROR_HANDLING = SubLObjectFactory.makeSymbol("ERROR-HANDLING");
        $sym6$INSTANCE_COUNT = SubLObjectFactory.makeSymbol("INSTANCE-COUNT");
        $sym7$SUBLOOP_RESERVED_INITIALIZE_PARSER_CLASS = SubLObjectFactory.makeSymbol("SUBLOOP-RESERVED-INITIALIZE-PARSER-CLASS");
        $sym8$ISOLATED_P = SubLObjectFactory.makeSymbol("ISOLATED-P");
        $sym9$INSTANCE_NUMBER = SubLObjectFactory.makeSymbol("INSTANCE-NUMBER");
        $sym10$SUBLOOP_RESERVED_INITIALIZE_PARSER_INSTANCE = SubLObjectFactory.makeSymbol("SUBLOOP-RESERVED-INITIALIZE-PARSER-INSTANCE");
        $sym11$INITIALIZE = SubLObjectFactory.makeSymbol("INITIALIZE");
        $list12 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("PROTECTED"));
        $list13 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("INITIALIZE"), (SubLObject)SubLObjectFactory.makeSymbol("SUPER")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("ERROR-HANDLING"), (SubLObject)SubLObjectFactory.makeKeyword("THROW")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("TIMEOUT"), (SubLObject)SubLObjectFactory.makeInteger(90)), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("SELF")));
        $sym14$OUTER_CATCH_FOR_PARSER_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-PARSER-METHOD");
        $kw15$THROW = SubLObjectFactory.makeKeyword("THROW");
        $int16$90 = SubLObjectFactory.makeInteger(90);
        $sym17$PARSER_INITIALIZE_METHOD = SubLObjectFactory.makeSymbol("PARSER-INITIALIZE-METHOD");
        $sym18$PRINT = SubLObjectFactory.makeSymbol("PRINT");
        $list19 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("PUBLIC"));
        $list20 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("STREAM"), (SubLObject)SubLObjectFactory.makeSymbol("DEPTH"));
        $list21 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("IGNORE"), (SubLObject)SubLObjectFactory.makeSymbol("DEPTH")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PRINT-CLASS-INSTANCE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)SubLObjectFactory.makeSymbol("STREAM"), (SubLObject)SubLObjectFactory.makeKeyword("NUMBER"), (SubLObject)parser.NIL, (SubLObject)SubLObjectFactory.makeKeyword("IDENTITY"), (SubLObject)parser.T), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FORMAT"), (SubLObject)SubLObjectFactory.makeSymbol("STREAM"), (SubLObject)SubLObjectFactory.makeString("(Error handling: ~S)"), (SubLObject)SubLObjectFactory.makeSymbol("ERROR-HANDLING"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)parser.NIL));
        $sym22$OUTER_CATCH_FOR_PARSER_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-PARSER-METHOD");
        $sym23$INSTANCE_P = SubLObjectFactory.makeSymbol("INSTANCE-P");
        $str24$__A = SubLObjectFactory.makeString("-~A");
        $str25$_Error_handling___S_ = SubLObjectFactory.makeString("(Error handling: ~S)");
        $sym26$PARSER_PRINT_METHOD = SubLObjectFactory.makeSymbol("PARSER-PRINT-METHOD");
        $kw27$ERROR_HANDLING = SubLObjectFactory.makeKeyword("ERROR-HANDLING");
        $kw28$TIMEOUT = SubLObjectFactory.makeKeyword("TIMEOUT");
        $list29 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("THROW"), (SubLObject)SubLObjectFactory.makeKeyword("WARN"), (SubLObject)SubLObjectFactory.makeKeyword("IGNORE"));
        $str30$Invalid_error_handling_tag__a = SubLObjectFactory.makeString("Invalid error-handling tag ~a");
        $str31$Invalid_timeout__a = SubLObjectFactory.makeString("Invalid timeout ~a");
        $sym32$HANDLE_ERROR = SubLObjectFactory.makeSymbol("HANDLE-ERROR");
        $list33 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ERROR"));
        $list34 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PCASE"), (SubLObject)SubLObjectFactory.makeSymbol("ERROR-HANDLING"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("THROW"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ERROR"), (SubLObject)SubLObjectFactory.makeSymbol("ERROR"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("WARN"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("WARN"), (SubLObject)SubLObjectFactory.makeSymbol("ERROR")))));
        $sym35$OUTER_CATCH_FOR_PARSER_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-PARSER-METHOD");
        $kw36$WARN = SubLObjectFactory.makeKeyword("WARN");
        $sym37$PARSER_HANDLE_ERROR_METHOD = SubLObjectFactory.makeSymbol("PARSER-HANDLE-ERROR-METHOD");
        $list38 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("external.charniak.parser.host"));
        $sym39$_CHARNIAK_PARSER_HOST_ = SubLObjectFactory.makeSymbol("*CHARNIAK-PARSER-HOST*");
        $str40$charniakparser_cyc_com = SubLObjectFactory.makeString("charniakparser.cyc.com");
        $kw41$PARAMETER = SubLObjectFactory.makeKeyword("PARAMETER");
        $sym42$CHARNIAK_PARSER = SubLObjectFactory.makeSymbol("CHARNIAK-PARSER");
        $list43 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("PARSE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TEXT")), (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")));
        $sym44$SUBLOOP_RESERVED_INITIALIZE_CHARNIAK_PARSER_CLASS = SubLObjectFactory.makeSymbol("SUBLOOP-RESERVED-INITIALIZE-CHARNIAK-PARSER-CLASS");
        $sym45$SUBLOOP_RESERVED_INITIALIZE_CHARNIAK_PARSER_INSTANCE = SubLObjectFactory.makeSymbol("SUBLOOP-RESERVED-INITIALIZE-CHARNIAK-PARSER-INSTANCE");
        $kw46$UNTESTED = SubLObjectFactory.makeKeyword("UNTESTED");
        $sym47$CATCH_ERROR_MESSAGE_HANDLER = SubLObjectFactory.makeSymbol("CATCH-ERROR-MESSAGE-HANDLER");
        $str48$Dogs_sleep = SubLObjectFactory.makeString("Dogs sleep");
        $list49 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("S1"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("S"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("NP"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("NNS"), (SubLObject)SubLObjectFactory.makeString("Dogs"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VP"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VBP"), (SubLObject)SubLObjectFactory.makeString("sleep"))))));
        $sym50$PARSE_MULTIPLE = SubLObjectFactory.makeSymbol("PARSE-MULTIPLE");
        $list51 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TEXT"), (SubLObject)SubLObjectFactory.makeSymbol("&OPTIONAL"), (SubLObject)SubLObjectFactory.makeSymbol("LEXICON"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CONTEXT"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NEW-CLASS-INSTANCE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("PARSE-TREE-CONTEXT")))));
        $list52 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("@param TEXT stringp; one or more English sentences, one per line\n   @return listp; the list of most likely parses for TEXT, one for each \n     sentence/line"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PARSES"), (SubLObject)SubLObjectFactory.makeSymbol("ERROR"), (SubLObject)SubLObjectFactory.makeSymbol("TIMEOUT?"), (SubLObject)SubLObjectFactory.makeSymbol("TREES")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CATCH-ERROR-MESSAGE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ERROR")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("WITH-TIMEOUT"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TIMEOUT"), (SubLObject)SubLObjectFactory.makeSymbol("TIMEOUT?")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("PARSES"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CHARNIAK-PARSE"), (SubLObject)SubLObjectFactory.makeSymbol("TEXT"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PWHEN"), (SubLObject)SubLObjectFactory.makeSymbol("TIMEOUT?"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ERROR"), (SubLObject)SubLObjectFactory.makeString("Charniak Parser timed out after ~a seconds"), (SubLObject)SubLObjectFactory.makeSymbol("TIMEOUT")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PWHEN"), (SubLObject)SubLObjectFactory.makeSymbol("ERROR"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("HANDLE-ERROR"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)SubLObjectFactory.makeSymbol("ERROR")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CDOLIST"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PARSE-EXPRESSION"), (SubLObject)SubLObjectFactory.makeSymbol("PARSES")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CPUSH"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NEW-PARSE-TREE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RETAG"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("STRIP-SHELL"), (SubLObject)SubLObjectFactory.makeSymbol("PARSE-EXPRESSION"))), (SubLObject)SubLObjectFactory.makeSymbol("LEXICON"), (SubLObject)SubLObjectFactory.makeSymbol("CONTEXT")), (SubLObject)SubLObjectFactory.makeSymbol("TREES"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NREVERSE"), (SubLObject)SubLObjectFactory.makeSymbol("TREES")))));
        $sym53$PARSE_TREE_CONTEXT = SubLObjectFactory.makeSymbol("PARSE-TREE-CONTEXT");
        $sym54$OUTER_CATCH_FOR_CHARNIAK_PARSER_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-CHARNIAK-PARSER-METHOD");
        $str55$Charniak_Parser_timed_out_after__ = SubLObjectFactory.makeString("Charniak Parser timed out after ~a seconds");
        $sym56$CHARNIAK_PARSER_PARSE_MULTIPLE_METHOD = SubLObjectFactory.makeSymbol("CHARNIAK-PARSER-PARSE-MULTIPLE-METHOD");
        $list57 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("S1"), (SubLObject)SubLObjectFactory.makeKeyword("ROOT"));
        $sym58$PARSE = SubLObjectFactory.makeSymbol("PARSE");
        $list59 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("@param TEXT stringp; a single English sentence\n   @return parse-tree-p; the most likely parse of TEXT"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CHECK-TYPE"), (SubLObject)SubLObjectFactory.makeSymbol("TEXT"), (SubLObject)SubLObjectFactory.makeSymbol("STRINGP")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CHECK-TYPE-IF-PRESENT"), (SubLObject)SubLObjectFactory.makeSymbol("CONTEXT"), (SubLObject)SubLObjectFactory.makeSymbol("PARSE-TREE-CONTEXT-P")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PARSE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIRST"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("PARSE-MULTIPLE")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SUBSTITUTE"), (SubLObject)Characters.CHAR_space, (SubLObject)Characters.CHAR_newline, (SubLObject)SubLObjectFactory.makeSymbol("TEXT")), (SubLObject)SubLObjectFactory.makeSymbol("LEXICON"), (SubLObject)SubLObjectFactory.makeSymbol("CONTEXT"))))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PWHEN"), (SubLObject)SubLObjectFactory.makeSymbol("PARSE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SET-PARSE-TREE-MOTHER"), (SubLObject)SubLObjectFactory.makeSymbol("PARSE"), (SubLObject)parser.NIL)), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("PARSE"))));
        $sym60$STRINGP = SubLObjectFactory.makeSymbol("STRINGP");
        $sym61$PARSE_TREE_CONTEXT_P = SubLObjectFactory.makeSymbol("PARSE-TREE-CONTEXT-P");
        $sym62$CHARNIAK_PARSER_PARSE_METHOD = SubLObjectFactory.makeSymbol("CHARNIAK-PARSER-PARSE-METHOD");
        $str63$_charniak_cgi = SubLObjectFactory.makeString("/charniak.cgi");
        $kw64$POST = SubLObjectFactory.makeKeyword("POST");
        $sym65$CHARNIAK_PARSE = SubLObjectFactory.makeSymbol("CHARNIAK-PARSE");
        $str66$text = SubLObjectFactory.makeString("text");
        $str67$server = SubLObjectFactory.makeString("server");
        $sym68$_CHARNIAK_PARSE_CACHING_STATE_ = SubLObjectFactory.makeSymbol("*CHARNIAK-PARSE-CACHING-STATE*");
        $int69$500 = SubLObjectFactory.makeInteger(500);
        $list70 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("many"), (SubLObject)SubLObjectFactory.makeString("most"));
        $kw71$DT = SubLObjectFactory.makeKeyword("DT");
        $kw72$WHNP = SubLObjectFactory.makeKeyword("WHNP");
        $kw73$WP = SubLObjectFactory.makeKeyword("WP");
        $kw74$WDT = SubLObjectFactory.makeKeyword("WDT");
        $list75 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("external.stanford.parser.host"));
        $sym76$_STANFORD_PARSER_HOST_ = SubLObjectFactory.makeSymbol("*STANFORD-PARSER-HOST*");
        $str77$stanfordparser_cyc_com = SubLObjectFactory.makeString("stanfordparser.cyc.com");
        $list78 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("external.stanford.parser.port"));
        $sym79$_STANFORD_PARSER_PORT_ = SubLObjectFactory.makeSymbol("*STANFORD-PARSER-PORT*");
        $int80$8888 = SubLObjectFactory.makeInteger(8888);
        $sym81$STANFORD_PARSER = SubLObjectFactory.makeSymbol("STANFORD-PARSER");
        $sym82$SUBLOOP_RESERVED_INITIALIZE_STANFORD_PARSER_CLASS = SubLObjectFactory.makeSymbol("SUBLOOP-RESERVED-INITIALIZE-STANFORD-PARSER-CLASS");
        $sym83$SUBLOOP_RESERVED_INITIALIZE_STANFORD_PARSER_INSTANCE = SubLObjectFactory.makeSymbol("SUBLOOP-RESERVED-INITIALIZE-STANFORD-PARSER-INSTANCE");
        $list84 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("ROOT"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("S"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("NP"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("NNS"), (SubLObject)SubLObjectFactory.makeString("Dogs"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VP"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VBP"), (SubLObject)SubLObjectFactory.makeString("sleep")))));
        $list85 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("@param TEXT stringp; a single English sentence\n   @return parse-tree-p; the most likely parse of TEXT"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PARSE"), (SubLObject)SubLObjectFactory.makeSymbol("ERROR"), (SubLObject)SubLObjectFactory.makeSymbol("TIMEOUT?")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CATCH-ERROR-MESSAGE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ERROR")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("WITH-TIMEOUT"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TIMEOUT"), (SubLObject)SubLObjectFactory.makeSymbol("TIMEOUT?")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("PARSE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("STANFORD-PARSE"), (SubLObject)SubLObjectFactory.makeSymbol("TEXT"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PWHEN"), (SubLObject)SubLObjectFactory.makeSymbol("TIMEOUT?"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ERROR"), (SubLObject)SubLObjectFactory.makeString("Stanford Parser timed out after ~a seconds "), (SubLObject)SubLObjectFactory.makeSymbol("TIMEOUT")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PWHEN"), (SubLObject)SubLObjectFactory.makeSymbol("ERROR"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("HANDLE-ERROR"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)SubLObjectFactory.makeSymbol("ERROR")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FWHEN"), (SubLObject)SubLObjectFactory.makeSymbol("PARSE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NEW-PARSE-TREE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("STRIP-SHELL"), (SubLObject)SubLObjectFactory.makeSymbol("PARSE")), (SubLObject)SubLObjectFactory.makeSymbol("LEXICON"), (SubLObject)SubLObjectFactory.makeSymbol("CONTEXT"))))));
        $sym86$OUTER_CATCH_FOR_STANFORD_PARSER_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-STANFORD-PARSER-METHOD");
        $str87$Stanford_Parser_timed_out_after__ = SubLObjectFactory.makeString("Stanford Parser timed out after ~a seconds ");
        $sym88$STANFORD_PARSER_PARSE_METHOD = SubLObjectFactory.makeSymbol("STANFORD-PARSER-PARSE-METHOD");
        $sym89$STANFORD_PARSE = SubLObjectFactory.makeSymbol("STANFORD-PARSE");
        $kw90$PRIVATE = SubLObjectFactory.makeKeyword("PRIVATE");
        $sym91$_STANFORD_PARSE_CACHING_STATE_ = SubLObjectFactory.makeSymbol("*STANFORD-PARSE-CACHING-STATE*");
        $kw92$AUX = SubLObjectFactory.makeKeyword("AUX");
        $list93 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeString("be"), SubLObjectFactory.makeString("am"), SubLObjectFactory.makeString("are"), SubLObjectFactory.makeString("is"), SubLObjectFactory.makeString("was"), SubLObjectFactory.makeString("were"), SubLObjectFactory.makeString("been"), SubLObjectFactory.makeString("'m"), SubLObjectFactory.makeString("do"), SubLObjectFactory.makeString("does"), SubLObjectFactory.makeString("did"), SubLObjectFactory.makeString("done"), SubLObjectFactory.makeString("have"), SubLObjectFactory.makeString("has"), SubLObjectFactory.makeString("had"), SubLObjectFactory.makeString("'ve") });
        $list94 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("external.link-parser.program.name"));
        $sym95$_LINK_PARSER_PROGRAM_NAME_ = SubLObjectFactory.makeSymbol("*LINK-PARSER-PROGRAM-NAME*");
        $str96$_cyc_top_data_link_server = SubLObjectFactory.makeString("/cyc/top/data/link_server");
        $kw97$LEXICAL = SubLObjectFactory.makeKeyword("LEXICAL");
        $list98 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("external.link-parser.program.redfilename"));
        $sym99$_LINK_PARSER_PROGRAM_REDFILENAME_ = SubLObjectFactory.makeSymbol("*LINK-PARSER-PROGRAM-REDFILENAME*");
        $str100$_cyc_top_repository_red_external_ = SubLObjectFactory.makeString("/cyc/top/repository/red/external.redbin");
        $list101 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("external.link-parser.program.inputfile"));
        $sym102$_LINK_PARSER_PROGRAM_INPUTFILE_ = SubLObjectFactory.makeSymbol("*LINK-PARSER-PROGRAM-INPUTFILE*");
        $str103$_dev_null = SubLObjectFactory.makeString("/dev/null");
        $list104 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("external.link-parser.program.outputfile"));
        $sym105$_LINK_PARSER_PROGRAM_OUTPUTFILE_ = SubLObjectFactory.makeSymbol("*LINK-PARSER-PROGRAM-OUTPUTFILE*");
        $list106 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("external.link-parser.allow-local-start"));
        $sym107$_LINK_SERVER_ALLOW_LOCAL_START_ = SubLObjectFactory.makeSymbol("*LINK-SERVER-ALLOW-LOCAL-START*");
        $str108$Link_Parser_Server = SubLObjectFactory.makeString("Link Parser Server");
        $str109$Process_for_ = SubLObjectFactory.makeString("Process for ");
        $str110$_r = SubLObjectFactory.makeString("-r");
        $sym111$LAUNCH_LINK_PARSER_PROGRAM_LOCALLY = SubLObjectFactory.makeSymbol("LAUNCH-LINK-PARSER-PROGRAM-LOCALLY");
        $sym112$LINK_PARSER = SubLObjectFactory.makeSymbol("LINK-PARSER");
        $list113 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("OPTIONS"), (SubLObject)SubLObjectFactory.makeKeyword("INSTANCE"), (SubLObject)SubLObjectFactory.makeKeyword("PRIVATE")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("PARSE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TEXT")), (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")));
        $sym114$OPTIONS = SubLObjectFactory.makeSymbol("OPTIONS");
        $sym115$SUBLOOP_RESERVED_INITIALIZE_LINK_PARSER_CLASS = SubLObjectFactory.makeSymbol("SUBLOOP-RESERVED-INITIALIZE-LINK-PARSER-CLASS");
        $sym116$SUBLOOP_RESERVED_INITIALIZE_LINK_PARSER_INSTANCE = SubLObjectFactory.makeSymbol("SUBLOOP-RESERVED-INITIALIZE-LINK-PARSER-INSTANCE");
        $list117 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("INITIALIZE"), (SubLObject)SubLObjectFactory.makeSymbol("SUPER")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ENSURE-LINKAGE-INITIALIZED")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("SELF")));
        $sym118$LINK_PARSER_INITIALIZE_METHOD = SubLObjectFactory.makeSymbol("LINK-PARSER-INITIALIZE-METHOD");
        $sym119$NEW_LINK_PARSER = SubLObjectFactory.makeSymbol("NEW-LINK-PARSER");
        $kw120$PUBLIC = SubLObjectFactory.makeKeyword("PUBLIC");
        $str121$localhost = SubLObjectFactory.makeString("localhost");
        $list122 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("@param TEXT stringp; a single English sentence\n   @return linkage-p; the most likely linkage for TEXT"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("LINKAGE"), (SubLObject)SubLObjectFactory.makeSymbol("ERROR"), (SubLObject)SubLObjectFactory.makeSymbol("TIMEOUT?")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CATCH-ERROR-MESSAGE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ERROR")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("WITH-TIMEOUT"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TIMEOUT"), (SubLObject)SubLObjectFactory.makeSymbol("TIMEOUT?")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("LINKAGE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NEW-LINKAGE"), (SubLObject)SubLObjectFactory.makeSymbol("TEXT"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("LIST"), (SubLObject)SubLObjectFactory.makeKeyword("CONTEXT"), (SubLObject)SubLObjectFactory.makeSymbol("CONTEXT"), (SubLObject)SubLObjectFactory.makeKeyword("OPTIONS"), (SubLObject)SubLObjectFactory.makeSymbol("OPTIONS"), (SubLObject)SubLObjectFactory.makeKeyword("LEXICON"), (SubLObject)SubLObjectFactory.makeSymbol("LEXICON")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PWHEN"), (SubLObject)SubLObjectFactory.makeSymbol("TIMEOUT?"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ERROR"), (SubLObject)SubLObjectFactory.makeString("Link Parser timed out after ~a seconds"), (SubLObject)SubLObjectFactory.makeSymbol("TIMEOUT")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PWHEN"), (SubLObject)SubLObjectFactory.makeSymbol("ERROR"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("HANDLE-ERROR"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)SubLObjectFactory.makeSymbol("ERROR")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("LINKAGE"))));
        $sym123$OUTER_CATCH_FOR_LINK_PARSER_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-LINK-PARSER-METHOD");
        $kw124$CONTEXT = SubLObjectFactory.makeKeyword("CONTEXT");
        $kw125$OPTIONS = SubLObjectFactory.makeKeyword("OPTIONS");
        $kw126$LEXICON = SubLObjectFactory.makeKeyword("LEXICON");
        $str127$Link_Parser_timed_out_after__a_se = SubLObjectFactory.makeString("Link Parser timed out after ~a seconds");
        $sym128$LINK_PARSER_PARSE_METHOD = SubLObjectFactory.makeSymbol("LINK-PARSER-PARSE-METHOD");
    }
}

/*

	Total time: 600 ms
	 synthetic 
*/