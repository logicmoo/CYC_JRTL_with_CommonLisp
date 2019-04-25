package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Packages;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class methods extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.methods";
    public static final String myFingerPrint = "53b4844d01e9bbdde0a4bed450d7ab9f07ccfc3b82f667dfec297e43a712783c";
    @SubLTranslatedFile.SubL(source = "cycl/methods.lisp", position = 2591L)
    public static SubLSymbol $methods_insert_trace_code_p$;
    @SubLTranslatedFile.SubL(source = "cycl/methods.lisp", position = 2645L)
    public static SubLSymbol $methods_block_tracing$;
    @SubLTranslatedFile.SubL(source = "cycl/methods.lisp", position = 2698L)
    private static SubLSymbol $methods_tracing_format_strings_vector_size$;
    @SubLTranslatedFile.SubL(source = "cycl/methods.lisp", position = 2768L)
    private static SubLSymbol $methods_tracing_format_strings$;
    @SubLTranslatedFile.SubL(source = "cycl/methods.lisp", position = 2881L)
    public static SubLSymbol $methods_trace_depth$;
    @SubLTranslatedFile.SubL(source = "cycl/methods.lisp", position = 6171L)
    private static SubLSymbol $methods_protection_levels$;
    @SubLTranslatedFile.SubL(source = "cycl/methods.lisp", position = 6992L)
    private static SubLSymbol $methods_scope_levels$;
    @SubLTranslatedFile.SubL(source = "cycl/methods.lisp", position = 7196L)
    private static SubLSymbol $valid_method_listener_types$;
    @SubLTranslatedFile.SubL(source = "cycl/methods.lisp", position = 7294L)
    private static SubLSymbol $methods_scope_special_forms$;
    @SubLTranslatedFile.SubL(source = "cycl/methods.lisp", position = 15555L)
    public static SubLSymbol $report_default_method_callsP$;
    private static final SubLString $str0$__S__S__;
    private static final SubLString $str1$_S;
    private static final SubLString $str2$__S;
    private static final SubLString $str3$_;
    private static final SubLString $str4$_S___enter__;
    private static final SubLString $str5$_S___exit____S__S______S;
    private static final SubLString $str6$__;
    private static final SubLSymbol $sym7$_OPTIONAL;
    private static final SubLSymbol $sym8$PUNLESS;
    private static final SubLSymbol $sym9$_METHODS_BLOCK_TRACING_;
    private static final SubLSymbol $sym10$CUNWIND_PROTECT;
    private static final SubLSymbol $sym11$PROGN;
    private static final SubLList $list12;
    private static final SubLList $list13;
    private static final SubLList $list14;
    private static final SubLSymbol $sym15$FORMAT;
    private static final SubLSymbol $sym16$_STANDARD_OUTPUT_;
    private static final SubLSymbol $sym17$_METHODS_TRACE_DEPTH_;
    private static final SubLSymbol $sym18$QUOTE;
    private static final SubLList $list19;
    private static final SubLList $list20;
    private static final SubLList $list21;
    private static final SubLList $list22;
    private static final SubLList $list23;
    private static final SubLList $list24;
    private static final SubLList $list25;
    private static final SubLList $list26;
    private static final SubLSymbol $sym27$METHOD_LISTENER_TYPE;
    private static final SubLString $str28$_S___S_is_not_a_member_of_the__S_;
    private static final SubLSymbol $sym29$ENCODE_METHOD_LISTENER_TYPE;
    private static final SubLString $str30$_S___S_is_not_a_valid_encoding_of;
    private static final SubLSymbol $sym31$DECODE_METHOD_LISTENER_TYPE;
    private static final SubLString $str32$_S___S_was_expected_to_be_a_membe;
    private static final SubLSymbol $sym33$METHOD_LISTENER_TYPE_P;
    private static final SubLList $list34;
    private static final SubLSymbol $kw35$PRIVATE;
    private static final SubLSymbol $kw36$PROTECTED;
    private static final SubLSymbol $kw37$PUBLIC;
    private static final SubLSymbol $kw38$FILE_SCOPE;
    private static final SubLSymbol $kw39$SYSTEM_SCOPE;
    private static final SubLSymbol $kw40$GLOBAL_SCOPE;
    private static final SubLSymbol $kw41$AUTO_UPDATE;
    private static final SubLSymbol $kw42$NO_MEMBER_VARIABLES;
    private static final SubLSymbol $kw43$READ_ONLY;
    private static final SubLSymbol $kw44$BEFORE_LISTENERS;
    private static final SubLSymbol $kw45$AFTER_LISTENERS;
    private static final SubLSymbol $kw46$INSTANTIATE_TEMPLATE;
    private static final SubLSymbol $kw47$DEFAULT;
    private static final SubLString $str48$_;
    private static final SubLString $str49$_METHOD;
    private static final SubLString $str50$_S___S_is_not_a_valid_method_spec;
    private static final SubLString $str51$_S___S_is_not_a_valid_method_name;
    private static final SubLString $str52$_S__While_defining_method__S___S_;
    private static final SubLList $list53;
    private static final SubLSymbol $sym54$DEF_INSTANCE_METHOD;
    private static final SubLList $list55;
    private static final SubLSymbol $sym56$METHODS_INCORPORATE_INSTANCE_METHOD;
    private static final SubLSymbol $sym57$SUBLOOP_REGISTER_INSTANCE_METHOD;
    private static final SubLSymbol $sym58$PWHEN;
    private static final SubLSymbol $sym59$_REPORT_DEFAULT_METHOD_CALLS__;
    private static final SubLSymbol $sym60$WARN;
    private static final SubLString $str61$Default_method_call__a_on_class__;
    private static final SubLString $str62$DEF_INSTANCE_METHOD___S_is_not_th;
    private static final SubLSymbol $sym63$DEF_CLASS_METHOD;
    private static final SubLSymbol $sym64$METHODS_INCORPORATE_CLASS_METHOD;
    private static final SubLSymbol $sym65$SUBLOOP_REGISTER_CLASS_METHOD;
    private static final SubLString $str66$DEF_CLASS_METHOD___S_is_not_the_n;
    private static final SubLString $str67$FUNCALL_CLASS_METHOD___S_is_not_a;
    private static final SubLString $str68$FUNCALL_CLASS_METHOD___S_is_not_a;
    private static final SubLString $str69$FUNCALL_CLASS_SUPER_METHOD___S_is;
    private static final SubLString $str70$FUNCALL_CLASS_SUPER_METHOD___S_is;
    private static final SubLSymbol $kw71$TARGET_NOT_A_CLASS;
    private static final SubLSymbol $kw72$INVALID_METHOD_NAME;
    private static final SubLSymbol $kw73$UNDECLARED_METHOD;
    private static final SubLSymbol $kw74$ACCESS_LEVEL_CONFLICT;
    private static final SubLSymbol $kw75$UNDEFINED_METHOD;
    private static final SubLString $str76$__FUNCALL_INSTANCE_METHOD__either;
    private static final SubLString $str77$__FUNCALL_CLASS_OR_INSTANCE_METHO;
    private static final SubLString $str78$FUNCALL_CLASS_OR_INSTANCE_METHOD_;
    private static final SubLSymbol $kw79$TARGET_NOT_AN_INSTANCE;
    private static final SubLString $str80$RESOLVE_METHOD___S_is_not_a_defin;
    private static final SubLString $str81$RESOLVE_METHOD___S_is_not_a_defin;
    private static final SubLList $list82;
    private static final SubLList $list83;
    private static final SubLSymbol $sym84$FUNCALL_INSTANCE_METHOD;
    private static final SubLSymbol $sym85$FUNCALL_INSTANCE_SUPER_METHOD;
    private static final SubLSymbol $sym86$SELF;
    private static final SubLSymbol $sym87$INLINE_METHOD;
    private static final SubLSymbol $sym88$SUPER;
    private static final SubLSymbol $sym89$INLINE_SUPER_METHOD;
    private static final SubLSymbol $sym90$CSETQ;
    private static final SubLSymbol $sym91$CMULTIPLE_VALUE_SETQ;
    private static final SubLList $list92;
    private static final SubLSymbol $sym93$CPOP;
    private static final SubLList $list94;
    private static final SubLList $list95;
    private static final SubLSymbol $sym96$RET;
    private static final SubLSymbol $sym97$THROW;
    private static final SubLSymbol $sym98$LIST;
    private static final SubLString $str99$OUTER_CATCH_FOR_;
    private static final SubLString $str100$METHOD;
    private static final SubLString $str101$CATCH_VAR_FOR_;
    private static final SubLString $str102$LISTED_ARGS;
    private static final SubLSymbol $sym103$CLET;
    private static final SubLList $list104;
    private static final SubLSymbol $sym105$CCATCH;
    private static final SubLSymbol $sym106$METHOD_LISTENERS_INVOKE_BEFORE_LISTENERS;
    private static final SubLSymbol $sym107$METHOD_LISTENERS_INVOKE_AFTER_LISTENERS;
    private static final SubLSymbol $sym108$DEFINE_PUBLIC;
    private static final SubLList $list109;
    private static final SubLSymbol $sym110$DEFINE_PRIVATE;
    private static final SubLSymbol $sym111$DEFINE_PROTECTED;
    private static final SubLList $list112;
    
    @SubLTranslatedFile.SubL(source = "cycl/methods.lisp", position = 2930L)
    public static SubLObject methods_generate_format_string_for_tracing(final SubLObject args) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject arg_count = Sequences.length(args);
        SubLObject existing_string = (SubLObject)methods.NIL;
        if (arg_count.numL(methods.$methods_tracing_format_strings_vector_size$.getGlobalValue())) {
            existing_string = Vectors.aref(methods.$methods_tracing_format_strings$.getDynamicValue(thread), arg_count);
            if (methods.NIL != existing_string) {
                return existing_string;
            }
        }
        existing_string = (SubLObject)methods.$str0$__S__S__;
        if (arg_count.numG((SubLObject)methods.ZERO_INTEGER)) {
            existing_string = Sequences.cconcatenate(existing_string, (SubLObject)methods.$str1$_S);
            if (arg_count.numG((SubLObject)methods.ONE_INTEGER)) {
                SubLObject cdotimes_end_var;
                SubLObject i;
                for (cdotimes_end_var = Numbers.subtract(arg_count, (SubLObject)methods.ONE_INTEGER), i = (SubLObject)methods.NIL, i = (SubLObject)methods.ZERO_INTEGER; i.numL(cdotimes_end_var); i = Numbers.add(i, (SubLObject)methods.ONE_INTEGER)) {
                    existing_string = Sequences.cconcatenate(existing_string, (SubLObject)methods.$str2$__S);
                }
            }
        }
        existing_string = Sequences.cconcatenate(existing_string, (SubLObject)methods.$str3$_);
        if (arg_count.numL(methods.$methods_tracing_format_strings_vector_size$.getGlobalValue())) {
            Vectors.set_aref(methods.$methods_tracing_format_strings$.getDynamicValue(thread), arg_count, existing_string);
        }
        return existing_string;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/methods.lisp", position = 3771L)
    public static SubLObject methods_generate_method_enter_format_string(final SubLObject args) {
        final SubLObject format_string = methods_generate_format_string_for_tracing(args);
        return Sequences.cconcatenate((SubLObject)methods.$str4$_S___enter__, format_string);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/methods.lisp", position = 3981L)
    public static SubLObject methods_generate_method_exit_format_string() {
        return (SubLObject)methods.$str5$_S___exit____S__S______S;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/methods.lisp", position = 4080L)
    public static SubLObject methods_tracing_tab(final SubLObject stream, final SubLObject depth) {
        SubLObject i;
        for (i = (SubLObject)methods.NIL, i = (SubLObject)methods.ZERO_INTEGER; i.numL(depth); i = Numbers.add(i, (SubLObject)methods.ONE_INTEGER)) {
            PrintLow.format(stream, (SubLObject)methods.$str6$__);
        }
        return depth;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/methods.lisp", position = 4197L)
    public static SubLObject methods_filter_option_words_from_lambda_list(final SubLObject lambda_list) {
        SubLObject vars = (SubLObject)methods.NIL;
        SubLObject cdolist_list_var = lambda_list;
        SubLObject param = (SubLObject)methods.NIL;
        param = cdolist_list_var.first();
        while (methods.NIL != cdolist_list_var) {
            if (param != methods.$sym7$_OPTIONAL) {
                if (param.isSymbol()) {
                    vars = (SubLObject)ConsesLow.cons(param, vars);
                }
                else if (param.isCons() && param.first().isSymbol()) {
                    vars = (SubLObject)ConsesLow.cons(param.first(), vars);
                }
            }
            cdolist_list_var = cdolist_list_var.rest();
            param = cdolist_list_var.first();
        }
        return Sequences.nreverse(vars);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/methods.lisp", position = 4529L)
    public static SubLObject expand_methods_insert_tracing_enter_code(final SubLObject method_name, final SubLObject instance, final SubLObject args) {
        final SubLObject filtered_args = methods_filter_option_words_from_lambda_list(args);
        final SubLObject enter_string = methods_generate_method_enter_format_string(filtered_args);
        return (SubLObject)ConsesLow.listS((SubLObject)methods.$sym8$PUNLESS, (SubLObject)methods.$sym9$_METHODS_BLOCK_TRACING_, (SubLObject)ConsesLow.listS((SubLObject)methods.$sym10$CUNWIND_PROTECT, (SubLObject)ConsesLow.list((SubLObject)methods.$sym11$PROGN, (SubLObject)methods.$list12, (SubLObject)methods.$list13, (SubLObject)methods.$list14, (SubLObject)ConsesLow.listS((SubLObject)methods.$sym15$FORMAT, new SubLObject[] { methods.$sym16$_STANDARD_OUTPUT_, enter_string, methods.$sym17$_METHODS_TRACE_DEPTH_, ConsesLow.list((SubLObject)methods.$sym18$QUOTE, method_name), instance, ConsesLow.append(filtered_args, (SubLObject)methods.NIL) })), (SubLObject)methods.$list19), (SubLObject)methods.$list20);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/methods.lisp", position = 5179L)
    public static SubLObject methods_insert_tracing_enter_code(final SubLObject macroform, final SubLObject environment) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject method_name = (SubLObject)methods.NIL;
        SubLObject instance = (SubLObject)methods.NIL;
        SubLObject args = (SubLObject)methods.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)methods.$list21);
        method_name = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)methods.$list21);
        instance = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)methods.$list21);
        args = current.first();
        current = current.rest();
        if (methods.NIL != current) {
            cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)methods.$list21);
            return (SubLObject)methods.NIL;
        }
        if (methods.NIL != methods.$methods_insert_trace_code_p$.getDynamicValue(thread)) {
            return expand_methods_insert_tracing_enter_code(method_name, instance, args);
        }
        return (SubLObject)ConsesLow.list((SubLObject)methods.$sym11$PROGN);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/methods.lisp", position = 5400L)
    public static SubLObject expand_methods_insert_tracing_exit_code(final SubLObject method_name, final SubLObject instance, final SubLObject result) {
        final SubLObject exit_string = methods_generate_method_exit_format_string();
        return (SubLObject)ConsesLow.list((SubLObject)methods.$sym8$PUNLESS, (SubLObject)methods.$sym9$_METHODS_BLOCK_TRACING_, (SubLObject)methods.$list22, (SubLObject)ConsesLow.listS((SubLObject)methods.$sym10$CUNWIND_PROTECT, (SubLObject)ConsesLow.list((SubLObject)methods.$sym11$PROGN, (SubLObject)methods.$list12, (SubLObject)methods.$list13, (SubLObject)methods.$list14, (SubLObject)ConsesLow.list((SubLObject)methods.$sym15$FORMAT, (SubLObject)methods.$sym16$_STANDARD_OUTPUT_, exit_string, (SubLObject)methods.$sym17$_METHODS_TRACE_DEPTH_, (SubLObject)ConsesLow.list((SubLObject)methods.$sym18$QUOTE, method_name), instance, result)), (SubLObject)methods.$list19));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/methods.lisp", position = 5948L)
    public static SubLObject methods_insert_tracing_exit_code(final SubLObject macroform, final SubLObject environment) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject method_name = (SubLObject)methods.NIL;
        SubLObject instance = (SubLObject)methods.NIL;
        SubLObject result = (SubLObject)methods.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)methods.$list23);
        method_name = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)methods.$list23);
        instance = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)methods.$list23);
        result = current.first();
        current = current.rest();
        if (methods.NIL != current) {
            cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)methods.$list23);
            return (SubLObject)methods.NIL;
        }
        if (methods.NIL != methods.$methods_insert_trace_code_p$.getDynamicValue(thread)) {
            return expand_methods_insert_tracing_exit_code(method_name, instance, result);
        }
        return (SubLObject)ConsesLow.list((SubLObject)methods.$sym11$PROGN);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/methods.lisp", position = 6872L)
    public static SubLObject methods_protection_level_p(final SubLObject v_object) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return (SubLObject)((methods.NIL != conses_high.member(v_object, methods.$methods_protection_levels$.getDynamicValue(thread), (SubLObject)methods.UNPROVIDED, (SubLObject)methods.UNPROVIDED)) ? methods.T : methods.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/methods.lisp", position = 7086L)
    public static SubLObject methods_scope_level_p(final SubLObject v_object) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return (SubLObject)((methods.NIL != conses_high.member(v_object, methods.$methods_scope_levels$.getDynamicValue(thread), (SubLObject)methods.UNPROVIDED, (SubLObject)methods.UNPROVIDED)) ? methods.T : methods.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/methods.lisp", position = 7196L)
    public static SubLObject valid_method_listener_types() {
        return methods.$valid_method_listener_types$.getGlobalValue();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/methods.lisp", position = 7196L)
    public static SubLObject method_listener_type_p(final SubLObject v_object) {
        return (SubLObject)((methods.NIL != conses_high.member(v_object, methods.$valid_method_listener_types$.getGlobalValue(), (SubLObject)methods.UNPROVIDED, (SubLObject)methods.UNPROVIDED)) ? methods.T : methods.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/methods.lisp", position = 7196L)
    public static SubLObject encode_method_listener_type(final SubLObject value) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject pos = Sequences.position(value, methods.$valid_method_listener_types$.getGlobalValue(), (SubLObject)methods.UNPROVIDED, (SubLObject)methods.UNPROVIDED, (SubLObject)methods.UNPROVIDED, (SubLObject)methods.UNPROVIDED);
        if (methods.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && methods.NIL == pos) {
            Errors.error((SubLObject)methods.$str28$_S___S_is_not_a_member_of_the__S_, (SubLObject)methods.$sym29$ENCODE_METHOD_LISTENER_TYPE, value, (SubLObject)methods.$sym27$METHOD_LISTENER_TYPE);
        }
        return pos;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/methods.lisp", position = 7196L)
    public static SubLObject decode_method_listener_type(final SubLObject value) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject element = ConsesLow.nth(value, methods.$valid_method_listener_types$.getGlobalValue());
        if (methods.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && methods.NIL == element) {
            Errors.error((SubLObject)methods.$str30$_S___S_is_not_a_valid_encoding_of, (SubLObject)methods.$sym31$DECODE_METHOD_LISTENER_TYPE, value, (SubLObject)methods.$sym27$METHOD_LISTENER_TYPE);
        }
        return element;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/methods.lisp", position = 7196L)
    public static SubLObject method_listener_type_less_p(final SubLObject value1, final SubLObject value2) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (methods.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && methods.NIL == method_listener_type_p(value1)) {
            Errors.error((SubLObject)methods.$str32$_S___S_was_expected_to_be_a_membe, (SubLObject)methods.$sym33$METHOD_LISTENER_TYPE_P, value1, (SubLObject)methods.$sym27$METHOD_LISTENER_TYPE);
        }
        if (methods.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && methods.NIL == method_listener_type_p(value2)) {
            Errors.error((SubLObject)methods.$str32$_S___S_was_expected_to_be_a_membe, (SubLObject)methods.$sym33$METHOD_LISTENER_TYPE_P, value2, (SubLObject)methods.$sym27$METHOD_LISTENER_TYPE);
        }
        SubLObject cdolist_list_var = methods.$valid_method_listener_types$.getGlobalValue();
        SubLObject value3 = (SubLObject)methods.NIL;
        value3 = cdolist_list_var.first();
        while (methods.NIL != cdolist_list_var) {
            if (value3.eql(value1)) {
                return (SubLObject)SubLObjectFactory.makeBoolean(!value3.eql(value2));
            }
            if (value3.eql(value2)) {
                return (SubLObject)methods.NIL;
            }
            cdolist_list_var = cdolist_list_var.rest();
            value3 = cdolist_list_var.first();
        }
        return (SubLObject)methods.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/methods.lisp", position = 7196L)
    public static SubLObject method_listener_type_greater_p(final SubLObject value1, final SubLObject value2) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (methods.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && methods.NIL == method_listener_type_p(value1)) {
            Errors.error((SubLObject)methods.$str32$_S___S_was_expected_to_be_a_membe, (SubLObject)methods.$sym33$METHOD_LISTENER_TYPE_P, value1, (SubLObject)methods.$sym27$METHOD_LISTENER_TYPE);
        }
        if (methods.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && methods.NIL == method_listener_type_p(value2)) {
            Errors.error((SubLObject)methods.$str32$_S___S_was_expected_to_be_a_membe, (SubLObject)methods.$sym33$METHOD_LISTENER_TYPE_P, value2, (SubLObject)methods.$sym27$METHOD_LISTENER_TYPE);
        }
        SubLObject cdolist_list_var = methods.$valid_method_listener_types$.getGlobalValue();
        SubLObject value3 = (SubLObject)methods.NIL;
        value3 = cdolist_list_var.first();
        while (methods.NIL != cdolist_list_var) {
            if (value3.eql(value2)) {
                return (SubLObject)SubLObjectFactory.makeBoolean(!value3.eql(value1));
            }
            if (value3.eql(value1)) {
                return (SubLObject)methods.NIL;
            }
            cdolist_list_var = cdolist_list_var.rest();
            value3 = cdolist_list_var.first();
        }
        return (SubLObject)methods.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/methods.lisp", position = 7401L)
    public static SubLObject methods_special_form_given_scope_level(final SubLObject scope_level) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject scopes = methods.$methods_scope_levels$.getDynamicValue(thread);
        SubLObject specials = methods.$methods_scope_special_forms$.getDynamicValue(thread);
        SubLObject scope = (SubLObject)methods.NIL;
        while (methods.NIL != scopes && methods.NIL != specials) {
            scope = scopes.first();
            if (scope.eql(scope_level)) {
                return specials.first();
            }
            scopes = scopes.rest();
            specials = specials.rest();
        }
        return (SubLObject)methods.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/methods.lisp", position = 7773L)
    public static SubLObject method_assoc(final SubLObject method_name, final SubLObject method_list) {
        SubLObject cdolist_list_var = method_list;
        SubLObject method = (SubLObject)methods.NIL;
        method = cdolist_list_var.first();
        while (methods.NIL != cdolist_list_var) {
            if (subloop_structures.method_name(method).eql(method_name)) {
                return method;
            }
            cdolist_list_var = cdolist_list_var.rest();
            method = cdolist_list_var.first();
        }
        return (SubLObject)methods.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/methods.lisp", position = 7940L)
    public static SubLObject method_shadowed_assoc(final SubLObject method_name, final SubLObject method_list) {
        SubLObject count = (SubLObject)methods.ZERO_INTEGER;
        SubLObject cdolist_list_var = method_list;
        SubLObject method = (SubLObject)methods.NIL;
        method = cdolist_list_var.first();
        while (methods.NIL != cdolist_list_var) {
            if (subloop_structures.method_name(method).eql(method_name)) {
                if (count.numE((SubLObject)methods.ONE_INTEGER)) {
                    return method;
                }
                count = Numbers.add(count, (SubLObject)methods.ONE_INTEGER);
            }
            cdolist_list_var = cdolist_list_var.rest();
            method = cdolist_list_var.first();
        }
        return (SubLObject)methods.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/methods.lisp", position = 8181L)
    public static SubLObject method_class_assoc(final SubLObject method_name, final SubLObject class_name, final SubLObject method_list) {
        SubLObject cdolist_list_var = method_list;
        SubLObject method = (SubLObject)methods.NIL;
        method = cdolist_list_var.first();
        while (methods.NIL != cdolist_list_var) {
            if (subloop_structures.method_name(method).eql(method_name) && subloop_structures.method_class_name(method).eql(class_name)) {
                return method;
            }
            cdolist_list_var = cdolist_list_var.rest();
            method = cdolist_list_var.first();
        }
        return (SubLObject)methods.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/methods.lisp", position = 8424L)
    public static SubLObject method_class_shadowed_assoc(final SubLObject method_name, final SubLObject class_name, final SubLObject method_list) {
        SubLObject count = (SubLObject)methods.ZERO_INTEGER;
        SubLObject cdolist_list_var = method_list;
        SubLObject method = (SubLObject)methods.NIL;
        method = cdolist_list_var.first();
        while (methods.NIL != cdolist_list_var) {
            if (subloop_structures.method_name(method).eql(method_name) && subloop_structures.method_class_name(method).eql(class_name)) {
                if (count.numE((SubLObject)methods.ONE_INTEGER)) {
                    return method;
                }
                count = Numbers.add(count, (SubLObject)methods.ONE_INTEGER);
            }
            cdolist_list_var = cdolist_list_var.rest();
            method = cdolist_list_var.first();
        }
        return (SubLObject)methods.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/methods.lisp", position = 8737L)
    public static SubLObject methods_protection_level_of_method_decl(final SubLObject v_properties) {
        if (!v_properties.isCons()) {
            return (SubLObject)methods.NIL;
        }
        if (methods.NIL != conses_high.member((SubLObject)methods.$kw35$PRIVATE, v_properties, (SubLObject)methods.UNPROVIDED, (SubLObject)methods.UNPROVIDED)) {
            return (SubLObject)methods.$kw35$PRIVATE;
        }
        if (methods.NIL != conses_high.member((SubLObject)methods.$kw36$PROTECTED, v_properties, (SubLObject)methods.UNPROVIDED, (SubLObject)methods.UNPROVIDED)) {
            return (SubLObject)methods.$kw36$PROTECTED;
        }
        if (methods.NIL != conses_high.member((SubLObject)methods.$kw37$PUBLIC, v_properties, (SubLObject)methods.UNPROVIDED, (SubLObject)methods.UNPROVIDED)) {
            return (SubLObject)methods.$kw37$PUBLIC;
        }
        return (SubLObject)methods.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/methods.lisp", position = 9057L)
    public static SubLObject methods_scope_level_of_method_decl(final SubLObject v_properties) {
        if (!v_properties.isCons()) {
            return (SubLObject)methods.NIL;
        }
        if (methods.NIL != conses_high.member((SubLObject)methods.$kw38$FILE_SCOPE, v_properties, (SubLObject)methods.UNPROVIDED, (SubLObject)methods.UNPROVIDED)) {
            return (SubLObject)methods.$kw38$FILE_SCOPE;
        }
        if (methods.NIL != conses_high.member((SubLObject)methods.$kw39$SYSTEM_SCOPE, v_properties, (SubLObject)methods.UNPROVIDED, (SubLObject)methods.UNPROVIDED)) {
            return (SubLObject)methods.$kw39$SYSTEM_SCOPE;
        }
        if (methods.NIL != conses_high.member((SubLObject)methods.$kw40$GLOBAL_SCOPE, v_properties, (SubLObject)methods.UNPROVIDED, (SubLObject)methods.UNPROVIDED)) {
            return (SubLObject)methods.$kw40$GLOBAL_SCOPE;
        }
        return (SubLObject)methods.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/methods.lisp", position = 9396L)
    public static SubLObject methods_update_type_of_method_decl(final SubLObject v_properties) {
        if (!v_properties.isCons()) {
            return (SubLObject)methods.NIL;
        }
        if (methods.NIL != conses_high.member((SubLObject)methods.$kw41$AUTO_UPDATE, v_properties, (SubLObject)methods.UNPROVIDED, (SubLObject)methods.UNPROVIDED)) {
            return (SubLObject)methods.$kw41$AUTO_UPDATE;
        }
        if (methods.NIL != conses_high.member((SubLObject)methods.$kw42$NO_MEMBER_VARIABLES, v_properties, (SubLObject)methods.UNPROVIDED, (SubLObject)methods.UNPROVIDED)) {
            return (SubLObject)methods.$kw42$NO_MEMBER_VARIABLES;
        }
        if (methods.NIL != conses_high.member((SubLObject)methods.$kw43$READ_ONLY, v_properties, (SubLObject)methods.UNPROVIDED, (SubLObject)methods.UNPROVIDED)) {
            return (SubLObject)methods.$kw43$READ_ONLY;
        }
        return (SubLObject)methods.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/methods.lisp", position = 9745L)
    public static SubLObject methods_before_listeners_p(final SubLObject v_properties) {
        return (SubLObject)SubLObjectFactory.makeBoolean(v_properties.isCons() && methods.NIL != conses_high.member((SubLObject)methods.$kw44$BEFORE_LISTENERS, v_properties, (SubLObject)methods.UNPROVIDED, (SubLObject)methods.UNPROVIDED));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/methods.lisp", position = 9877L)
    public static SubLObject methods_after_listeners_p(final SubLObject v_properties) {
        return (SubLObject)SubLObjectFactory.makeBoolean(v_properties.isCons() && methods.NIL != conses_high.member((SubLObject)methods.$kw45$AFTER_LISTENERS, v_properties, (SubLObject)methods.UNPROVIDED, (SubLObject)methods.UNPROVIDED));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/methods.lisp", position = 10007L)
    public static SubLObject method_instantiate_template_p(final SubLObject v_properties) {
        return (SubLObject)((methods.NIL != conses_high.member((SubLObject)methods.$kw46$INSTANTIATE_TEMPLATE, v_properties, (SubLObject)methods.UNPROVIDED, (SubLObject)methods.UNPROVIDED)) ? methods.T : methods.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/methods.lisp", position = 10132L)
    public static SubLObject new_method(final SubLObject new_name, final SubLObject new_class_name, final SubLObject new_lambda_list) {
        final SubLObject method;
        final SubLObject new_method = method = subloop_structures.make_method((SubLObject)methods.UNPROVIDED);
        SubLObject name = subloop_structures.method_name(method);
        SubLObject class_name = subloop_structures.method_class_name(method);
        SubLObject lambda_list = subloop_structures.method_lambda_list(method);
        SubLObject body = subloop_structures.method_body(method);
        SubLObject protection = subloop_structures.method_protection(method);
        SubLObject scope = subloop_structures.method_scope(method);
        SubLObject update_type = subloop_structures.method_update_type(method);
        SubLObject function_name = subloop_structures.method_function_name(method);
        SubLObject function_def = subloop_structures.method_function_def(method);
        try {
            name = new_name;
            class_name = new_class_name;
            lambda_list = conses_high.copy_tree(new_lambda_list);
            body = (SubLObject)methods.NIL;
            protection = (SubLObject)methods.$kw37$PUBLIC;
            scope = (SubLObject)methods.$kw40$GLOBAL_SCOPE;
            update_type = (SubLObject)methods.$kw47$DEFAULT;
            function_name = Packages.intern(Sequences.cconcatenate(Symbols.symbol_name(class_name), new SubLObject[] { methods.$str48$_, Symbols.symbol_name(new_name), methods.$str49$_METHOD }), (SubLObject)methods.UNPROVIDED);
            function_def = (SubLObject)methods.NIL;
        }
        finally {
            final SubLObject _prev_bind_0 = Dynamic.currentBinding(Threads.$is_thread_performing_cleanupP$);
            try {
                Dynamic.bind(Threads.$is_thread_performing_cleanupP$, (SubLObject)methods.T);
                final SubLObject _values = Values.getValuesAsVector();
                subloop_structures._csetf_method_name(method, name);
                subloop_structures._csetf_method_class_name(method, class_name);
                subloop_structures._csetf_method_lambda_list(method, lambda_list);
                subloop_structures._csetf_method_body(method, body);
                subloop_structures._csetf_method_protection(method, protection);
                subloop_structures._csetf_method_scope(method, scope);
                subloop_structures._csetf_method_update_type(method, update_type);
                subloop_structures._csetf_method_function_name(method, function_name);
                subloop_structures._csetf_method_function_def(method, function_def);
                Values.restoreValuesFromVector(_values);
            }
            finally {
                Dynamic.rebind(Threads.$is_thread_performing_cleanupP$, _prev_bind_0);
            }
        }
        return new_method;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/methods.lisp", position = 10626L)
    public static SubLObject methods_intern_method(final SubLObject new_name, final SubLObject new_class_name, final SubLObject new_lambda_list, final SubLObject v_properties, final SubLObject table) {
        final SubLObject new_protection_level = methods_protection_level_of_method_decl(v_properties);
        final SubLObject new_scope_level = methods_scope_level_of_method_decl(v_properties);
        final SubLObject new_update_type = methods_update_type_of_method_decl(v_properties);
        final SubLObject new_instantiate_template_p = method_instantiate_template_p(v_properties);
        SubLObject cdolist_list_var = table;
        SubLObject method = (SubLObject)methods.NIL;
        method = cdolist_list_var.first();
        while (methods.NIL != cdolist_list_var) {
            final SubLObject method_$1 = method;
            final SubLObject name = subloop_structures.method_name(method_$1);
            final SubLObject class_name = subloop_structures.method_class_name(method_$1);
            if (new_name.eql(name) && new_class_name.eql(class_name)) {
                subloop_structures._csetf_method_lambda_list(method, new_lambda_list);
                if (methods.NIL != new_protection_level) {
                    subloop_structures._csetf_method_protection(method, new_protection_level);
                }
                if (methods.NIL != new_scope_level) {
                    subloop_structures._csetf_method_scope(method, new_scope_level);
                }
                if (methods.NIL != new_update_type) {
                    subloop_structures._csetf_method_update_type(method, new_update_type);
                }
                subloop_structures._csetf_method_instantiate_template(method, new_instantiate_template_p);
                return Values.values(table, method);
            }
            cdolist_list_var = cdolist_list_var.rest();
            method = cdolist_list_var.first();
        }
        final SubLObject method2 = new_method(new_name, new_class_name, new_lambda_list);
        subloop_structures._csetf_method_protection(method2, (SubLObject)((methods.NIL != new_protection_level) ? new_protection_level : methods.$kw37$PUBLIC));
        subloop_structures._csetf_method_scope(method2, (SubLObject)((methods.NIL != new_scope_level) ? new_scope_level : methods.$kw40$GLOBAL_SCOPE));
        subloop_structures._csetf_method_update_type(method2, (SubLObject)((methods.NIL != new_update_type) ? new_update_type : methods.$kw47$DEFAULT));
        subloop_structures._csetf_method_instantiate_template(method2, new_instantiate_template_p);
        return Values.values((SubLObject)ConsesLow.cons(method2, table), method2);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/methods.lisp", position = 12488L)
    public static SubLObject method_set_function_definition(final SubLObject method_name, final SubLObject class_name, final SubLObject function_definition, final SubLObject v_methods) {
        final SubLObject method = method_class_assoc(method_name, class_name, v_methods);
        if (methods.NIL != method) {
            final SubLObject function_name = (SubLObject)((function_definition.isCons() && function_definition.rest().isCons()) ? conses_high.cadr(function_definition) : methods.NIL);
            if (methods.NIL != function_name) {
                subloop_structures._csetf_method_function_name(method, function_name);
            }
            subloop_structures._csetf_method_function_def(method, function_definition);
            return method;
        }
        return (SubLObject)methods.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/methods.lisp", position = 13006L)
    public static SubLObject methods_check_method_spec(final SubLObject defining_form, final SubLObject method_spec) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (methods.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && !method_spec.isCons()) {
            Errors.error((SubLObject)methods.$str50$_S___S_is_not_a_valid_method_spec, defining_form, method_spec);
        }
        if (methods.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && (methods.NIL == method_spec.first() || !method_spec.first().isSymbol())) {
            Errors.error((SubLObject)methods.$str51$_S___S_is_not_a_valid_method_name, defining_form, method_spec.first());
        }
        if (methods.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && !method_spec.rest().isCons()) {
            Errors.error((SubLObject)methods.$str50$_S___S_is_not_a_valid_method_spec, defining_form, method_spec);
        }
        if (methods.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && (methods.NIL == conses_high.cadr(method_spec) || !conses_high.cadr(method_spec).isSymbol())) {
            Errors.error((SubLObject)methods.$str52$_S__While_defining_method__S___S_, defining_form, method_spec.first(), conses_high.cadr(method_spec));
        }
        if (methods.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && !conses_high.cddr(method_spec).isList()) {
            Errors.error((SubLObject)methods.$str50$_S___S_is_not_a_valid_method_spec, defining_form, method_spec);
        }
        return (SubLObject)methods.T;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/methods.lisp", position = 14202L)
    public static SubLObject def_instance_method(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject method_spec = (SubLObject)methods.NIL;
        SubLObject lambda_list = (SubLObject)methods.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)methods.$list53);
        method_spec = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)methods.$list53);
        lambda_list = current.first();
        final SubLObject body;
        current = (body = current.rest());
        methods_check_method_spec((SubLObject)methods.$sym54$DEF_INSTANCE_METHOD, method_spec);
        SubLObject current_$3;
        final SubLObject datum_$2 = current_$3 = method_spec;
        SubLObject method_name = (SubLObject)methods.NIL;
        SubLObject class_name = (SubLObject)methods.NIL;
        SubLObject method_properties = (SubLObject)methods.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current_$3, datum_$2, (SubLObject)methods.$list55);
        method_name = current_$3.first();
        current_$3 = current_$3.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current_$3, datum_$2, (SubLObject)methods.$list55);
        class_name = current_$3.first();
        current_$3 = (method_properties = current_$3.rest());
        methods_incorporate_instance_method(method_name, class_name, method_properties, lambda_list, body);
        final SubLObject method_def = methods_retrieve_instance_method_definition(method_name, class_name);
        final SubLObject function_name = conses_high.cadr(method_def);
        return (SubLObject)ConsesLow.list((SubLObject)methods.$sym11$PROGN, (SubLObject)ConsesLow.list((SubLObject)methods.$sym56$METHODS_INCORPORATE_INSTANCE_METHOD, (SubLObject)ConsesLow.list((SubLObject)methods.$sym18$QUOTE, method_name), (SubLObject)ConsesLow.list((SubLObject)methods.$sym18$QUOTE, class_name), (SubLObject)ConsesLow.list((SubLObject)methods.$sym18$QUOTE, method_properties), (SubLObject)ConsesLow.list((SubLObject)methods.$sym18$QUOTE, lambda_list), (SubLObject)ConsesLow.list((SubLObject)methods.$sym18$QUOTE, body)), ConsesLow.append((SubLObject)ConsesLow.list(method_def.first(), function_name), conses_high.cddr(method_def)), (SubLObject)ConsesLow.list((SubLObject)methods.$sym57$SUBLOOP_REGISTER_INSTANCE_METHOD, (SubLObject)ConsesLow.list((SubLObject)methods.$sym18$QUOTE, class_name), (SubLObject)ConsesLow.list((SubLObject)methods.$sym18$QUOTE, method_name), (SubLObject)ConsesLow.list((SubLObject)methods.$sym18$QUOTE, function_name)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/methods.lisp", position = 15175L)
    public static SubLObject subloop_register_instance_method(final SubLObject class_name, final SubLObject method_name, final SubLObject function_name) {
        final SubLObject v_class_$4;
        final SubLObject v_class = v_class_$4 = classes.classes_retrieve_class(class_name);
        final SubLObject instance_method_decls = subloop_structures.class_instance_method_decls(v_class_$4);
        final SubLObject method = method_assoc(method_name, instance_method_decls);
        subloop_structures._csetf_method_function_name(method, function_name);
        return (SubLObject)methods.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/methods.lisp", position = 15613L)
    public static SubLObject def_default_instance_method(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject method_spec = (SubLObject)methods.NIL;
        SubLObject lambda_list = (SubLObject)methods.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)methods.$list53);
        method_spec = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)methods.$list53);
        lambda_list = current.first();
        final SubLObject body;
        current = (body = current.rest());
        return (SubLObject)ConsesLow.listS((SubLObject)methods.$sym54$DEF_INSTANCE_METHOD, method_spec, lambda_list, body.first(), (SubLObject)ConsesLow.list((SubLObject)methods.$sym58$PWHEN, (SubLObject)methods.$sym59$_REPORT_DEFAULT_METHOD_CALLS__, (SubLObject)ConsesLow.list((SubLObject)methods.$sym60$WARN, (SubLObject)methods.$str61$Default_method_call__a_on_class__, (SubLObject)ConsesLow.list((SubLObject)methods.$sym18$QUOTE, method_spec.first()), (SubLObject)ConsesLow.list((SubLObject)methods.$sym18$QUOTE, conses_high.second(method_spec)))), ConsesLow.append(body.rest(), (SubLObject)methods.NIL));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/methods.lisp", position = 15938L)
    public static SubLObject methods_retrieve_instance_method_definition(final SubLObject method_name, final SubLObject class_name) {
        final SubLObject v_class = classes.classes_retrieve_class(class_name);
        SubLObject result = (SubLObject)methods.NIL;
        if (methods.NIL != subloop_structures.class_p(v_class)) {
            final SubLObject v_class_$5 = v_class;
            final SubLObject instance_method_decls = subloop_structures.class_instance_method_decls(v_class_$5);
            final SubLObject method = method_assoc(method_name, instance_method_decls);
            if (methods.NIL != method) {
                result = subloop_structures.method_function_def(method);
            }
        }
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/methods.lisp", position = 16344L)
    public static SubLObject methods_incorporate_instance_method(final SubLObject method_name, final SubLObject class_name, final SubLObject method_properties, final SubLObject lambda_list, final SubLObject body) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_class = classes.classes_retrieve_class(class_name);
        SubLObject result = (SubLObject)methods.NIL;
        if (methods.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && methods.NIL == subloop_structures.class_p(v_class)) {
            Errors.error((SubLObject)methods.$str62$DEF_INSTANCE_METHOD___S_is_not_th, class_name);
        }
        if (methods.NIL != methods_update_instance_method_decl(method_name, class_name, method_properties, lambda_list, body)) {
            result = methods_compile_method_access_alists(class_name);
        }
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/methods.lisp", position = 16872L)
    public static SubLObject methods_update_instance_method_decl(final SubLObject method_name, final SubLObject class_name, final SubLObject method_properties, final SubLObject lambda_list, final SubLObject body) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_class = classes.classes_retrieve_class(class_name);
        if (methods.NIL != subloop_structures.class_p(v_class)) {
            final SubLObject v_class_$6 = v_class;
            SubLObject instance_method_decls = subloop_structures.class_instance_method_decls(v_class_$6);
            try {
                thread.resetMultipleValues();
                final SubLObject new_decls = methods_intern_method(method_name, class_name, lambda_list, method_properties, instance_method_decls);
                final SubLObject method = thread.secondMultipleValue();
                thread.resetMultipleValues();
                instance_method_decls = new_decls;
                subloop_structures._csetf_method_body(method, body);
                methods_generate_instance_function_definition(method, method_properties, body);
            }
            finally {
                final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)methods.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    subloop_structures._csetf_class_instance_method_decls(v_class_$6, instance_method_decls);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
            return method_name;
        }
        return (SubLObject)methods.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/methods.lisp", position = 17462L)
    public static SubLObject def_class_method(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject method_spec = (SubLObject)methods.NIL;
        SubLObject lambda_list = (SubLObject)methods.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)methods.$list53);
        method_spec = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)methods.$list53);
        lambda_list = current.first();
        final SubLObject body;
        current = (body = current.rest());
        methods_check_method_spec((SubLObject)methods.$sym63$DEF_CLASS_METHOD, method_spec);
        SubLObject current_$8;
        final SubLObject datum_$7 = current_$8 = method_spec;
        SubLObject method_name = (SubLObject)methods.NIL;
        SubLObject class_name = (SubLObject)methods.NIL;
        SubLObject method_properties = (SubLObject)methods.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current_$8, datum_$7, (SubLObject)methods.$list55);
        method_name = current_$8.first();
        current_$8 = current_$8.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current_$8, datum_$7, (SubLObject)methods.$list55);
        class_name = current_$8.first();
        current_$8 = (method_properties = current_$8.rest());
        methods_incorporate_class_method(method_name, class_name, method_properties, lambda_list, body);
        final SubLObject method_def = methods_retrieve_class_method_definition(method_name, class_name);
        final SubLObject function_name = conses_high.cadr(method_def);
        return (SubLObject)ConsesLow.list((SubLObject)methods.$sym11$PROGN, (SubLObject)ConsesLow.list((SubLObject)methods.$sym64$METHODS_INCORPORATE_CLASS_METHOD, (SubLObject)ConsesLow.list((SubLObject)methods.$sym18$QUOTE, method_name), (SubLObject)ConsesLow.list((SubLObject)methods.$sym18$QUOTE, class_name), (SubLObject)ConsesLow.list((SubLObject)methods.$sym18$QUOTE, method_properties), (SubLObject)ConsesLow.list((SubLObject)methods.$sym18$QUOTE, lambda_list), (SubLObject)ConsesLow.list((SubLObject)methods.$sym18$QUOTE, body)), ConsesLow.append((SubLObject)ConsesLow.list(method_def.first(), function_name), conses_high.cddr(method_def)), (SubLObject)ConsesLow.list((SubLObject)methods.$sym65$SUBLOOP_REGISTER_CLASS_METHOD, (SubLObject)ConsesLow.list((SubLObject)methods.$sym18$QUOTE, class_name), (SubLObject)ConsesLow.list((SubLObject)methods.$sym18$QUOTE, method_name), (SubLObject)ConsesLow.list((SubLObject)methods.$sym18$QUOTE, function_name)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/methods.lisp", position = 18416L)
    public static SubLObject subloop_register_class_method(final SubLObject class_name, final SubLObject method_name, final SubLObject function_name) {
        final SubLObject v_class_$9;
        final SubLObject v_class = v_class_$9 = classes.classes_retrieve_class(class_name);
        final SubLObject class_method_decls = subloop_structures.class_class_method_decls(v_class_$9);
        final SubLObject method = method_assoc(method_name, class_method_decls);
        subloop_structures._csetf_method_function_name(method, function_name);
        return (SubLObject)methods.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/methods.lisp", position = 18787L)
    public static SubLObject methods_retrieve_class_method_definition(final SubLObject method_name, final SubLObject class_name) {
        final SubLObject v_class = classes.classes_retrieve_class(class_name);
        if (methods.NIL != subloop_structures.class_p(v_class)) {
            final SubLObject v_class_$10 = v_class;
            final SubLObject class_method_decls = subloop_structures.class_class_method_decls(v_class_$10);
            final SubLObject method = method_assoc(method_name, class_method_decls);
            if (methods.NIL != method) {
                return subloop_structures.method_function_def(method);
            }
        }
        return (SubLObject)methods.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/methods.lisp", position = 19118L)
    public static SubLObject methods_incorporate_class_method(final SubLObject method_name, final SubLObject class_name, final SubLObject method_properties, final SubLObject lambda_list, final SubLObject body) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_class = classes.classes_retrieve_class(class_name);
        SubLObject result = (SubLObject)methods.NIL;
        if (methods.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && methods.NIL == subloop_structures.class_p(v_class)) {
            Errors.error((SubLObject)methods.$str66$DEF_CLASS_METHOD___S_is_not_the_n, class_name);
        }
        if (methods.NIL != methods_update_class_method_decl(method_name, class_name, method_properties, lambda_list, body)) {
            result = methods_compile_method_access_alists(class_name);
        }
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/methods.lisp", position = 19629L)
    public static SubLObject methods_update_class_method_decl(final SubLObject method_name, final SubLObject class_name, final SubLObject method_properties, final SubLObject lambda_list, final SubLObject body) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_class = classes.classes_retrieve_class(class_name);
        if (methods.NIL != subloop_structures.class_p(v_class)) {
            final SubLObject v_class_$11 = v_class;
            SubLObject class_method_decls = subloop_structures.class_class_method_decls(v_class_$11);
            try {
                thread.resetMultipleValues();
                final SubLObject new_decls = methods_intern_method(method_name, class_name, lambda_list, method_properties, class_method_decls);
                final SubLObject method = thread.secondMultipleValue();
                thread.resetMultipleValues();
                class_method_decls = new_decls;
                subloop_structures._csetf_method_body(method, body);
                methods_generate_instance_function_definition(method, method_properties, body);
            }
            finally {
                final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)methods.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    subloop_structures._csetf_class_class_method_decls(v_class_$11, class_method_decls);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
            return method_name;
        }
        return (SubLObject)methods.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/methods.lisp", position = 20210L)
    public static SubLObject methods_method_name_given_method_decl(final SubLObject method_decl) {
        return method_decl.first();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/methods.lisp", position = 20325L)
    public static SubLObject methods_function_name_given_method_decl(final SubLObject method_decl) {
        return conses_high.cadr(method_decl);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/methods.lisp", position = 20443L)
    public static SubLObject methods_function_def_given_method_decl(final SubLObject method_decl) {
        return conses_high.cddr(method_decl);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/methods.lisp", position = 20560L)
    public static SubLObject methods_set_function_def_of_method_decl(final SubLObject method_decl, final SubLObject function_def) {
        ConsesLow.rplacd(method_decl.rest(), conses_high.copy_tree(function_def));
        return function_def;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/methods.lisp", position = 20739L)
    public static SubLObject methods_add_method_decl(final SubLObject method_decl, final SubLObject method_dcls) {
        return (SubLObject)ConsesLow.cons(method_decl, method_dcls);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/methods.lisp", position = 20865L)
    public static SubLObject methods_retrieve_method_decl(final SubLObject method_name, final SubLObject method_decls) {
        return conses_high.assoc(method_name, method_decls, (SubLObject)methods.UNPROVIDED, (SubLObject)methods.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/methods.lisp", position = 20999L)
    public static SubLObject methods_compile_method_access_alists(final SubLObject class_name_or_class) {
        final SubLObject v_class = class_name_or_class.isSymbol() ? classes.classes_retrieve_class(class_name_or_class) : class_name_or_class;
        if (methods.NIL != subloop_structures.class_p(v_class)) {
            methods_compile_class_method_access_alist(v_class);
            methods_compile_instance_method_access_alist(v_class);
            return v_class;
        }
        return (SubLObject)methods.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/methods.lisp", position = 21387L)
    public static SubLObject methods_compile_class_method_access_alist_upwards(final SubLObject class_name_or_class, SubLObject recompile_parent) {
        if (recompile_parent == methods.UNPROVIDED) {
            recompile_parent = (SubLObject)methods.NIL;
        }
        final SubLObject v_class = class_name_or_class.isSymbol() ? classes.classes_retrieve_class(class_name_or_class) : class_name_or_class;
        if (methods.NIL != subloop_structures.class_p(v_class)) {
            SubLObject super_class_compiled_class_method_access_alist = (SubLObject)methods.NIL;
            final SubLObject v_class_$12 = v_class;
            final SubLObject parent = subloop_structures.class_parent(v_class_$12);
            final SubLObject class_method_decls = subloop_structures.class_class_method_decls(v_class_$12);
            SubLObject compiled_class_method_access_alist = subloop_structures.class_compiled_class_method_access_alist(v_class_$12);
            try {
                if (methods.NIL != parent) {
                    final SubLObject parent_class = classes.classes_retrieve_class(parent);
                    if (methods.NIL != parent_class) {
                        if (methods.NIL != recompile_parent) {
                            methods_compile_class_method_access_alist_upwards(parent_class, recompile_parent);
                        }
                        super_class_compiled_class_method_access_alist = subloop_structures.class_compiled_class_method_access_alist(parent_class);
                    }
                }
                compiled_class_method_access_alist = super_class_compiled_class_method_access_alist;
                SubLObject cdolist_list_var = class_method_decls;
                SubLObject method = (SubLObject)methods.NIL;
                method = cdolist_list_var.first();
                while (methods.NIL != cdolist_list_var) {
                    compiled_class_method_access_alist = (SubLObject)ConsesLow.cons(method, compiled_class_method_access_alist);
                    cdolist_list_var = cdolist_list_var.rest();
                    method = cdolist_list_var.first();
                }
            }
            finally {
                final SubLObject _prev_bind_0 = Dynamic.currentBinding(Threads.$is_thread_performing_cleanupP$);
                try {
                    Dynamic.bind(Threads.$is_thread_performing_cleanupP$, (SubLObject)methods.T);
                    final SubLObject _values = Values.getValuesAsVector();
                    subloop_structures._csetf_class_parent(v_class_$12, parent);
                    subloop_structures._csetf_class_class_method_decls(v_class_$12, class_method_decls);
                    subloop_structures._csetf_class_compiled_class_method_access_alist(v_class_$12, compiled_class_method_access_alist);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Dynamic.rebind(Threads.$is_thread_performing_cleanupP$, _prev_bind_0);
                }
            }
            return v_class;
        }
        return (SubLObject)methods.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/methods.lisp", position = 22338L)
    public static SubLObject methods_compile_class_method_access_alist(final SubLObject class_name_or_class) {
        final SubLObject v_class = class_name_or_class.isSymbol() ? classes.classes_retrieve_class(class_name_or_class) : class_name_or_class;
        if (methods.NIL != subloop_structures.class_p(v_class)) {
            final SubLObject v_class_$13 = v_class;
            final SubLObject subclasses = subloop_structures.class_subclasses(v_class_$13);
            methods_compile_class_method_access_alist_upwards(class_name_or_class, (SubLObject)methods.NIL);
            SubLObject cdolist_list_var = subclasses;
            SubLObject subclass = (SubLObject)methods.NIL;
            subclass = cdolist_list_var.first();
            while (methods.NIL != cdolist_list_var) {
                methods_compile_class_method_access_alist(subclass);
                cdolist_list_var = cdolist_list_var.rest();
                subclass = cdolist_list_var.first();
            }
            return v_class;
        }
        return v_class;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/methods.lisp", position = 22807L)
    public static SubLObject methods_compile_instance_method_access_alist_upwards(final SubLObject class_name_or_class, SubLObject recompile_parent) {
        if (recompile_parent == methods.UNPROVIDED) {
            recompile_parent = (SubLObject)methods.NIL;
        }
        final SubLObject v_class = class_name_or_class.isSymbol() ? classes.classes_retrieve_class(class_name_or_class) : class_name_or_class;
        if (methods.NIL != subloop_structures.class_p(v_class)) {
            SubLObject super_class_compiled_instance_method_access_alist = (SubLObject)methods.NIL;
            final SubLObject v_class_$14 = v_class;
            final SubLObject parent = subloop_structures.class_parent(v_class_$14);
            final SubLObject instance_method_decls = subloop_structures.class_instance_method_decls(v_class_$14);
            SubLObject compiled_instance_method_access_alist = subloop_structures.class_compiled_instance_method_access_alist(v_class_$14);
            SubLObject tablified_instance_methods = subloop_structures.class_tablified_instance_methods(v_class_$14);
            try {
                if (methods.NIL != parent) {
                    final SubLObject parent_class = classes.classes_retrieve_class(parent);
                    if (methods.NIL != parent_class) {
                        if (methods.NIL != recompile_parent) {
                            methods_compile_instance_method_access_alist_upwards(parent_class, recompile_parent);
                        }
                        super_class_compiled_instance_method_access_alist = subloop_structures.class_compiled_instance_method_access_alist(parent_class);
                    }
                }
                compiled_instance_method_access_alist = super_class_compiled_instance_method_access_alist;
                SubLObject cdolist_list_var = instance_method_decls;
                SubLObject method = (SubLObject)methods.NIL;
                method = cdolist_list_var.first();
                while (methods.NIL != cdolist_list_var) {
                    compiled_instance_method_access_alist = (SubLObject)ConsesLow.cons(method, compiled_instance_method_access_alist);
                    cdolist_list_var = cdolist_list_var.rest();
                    method = cdolist_list_var.first();
                }
                tablified_instance_methods = subloop_structures.tablify_method_list(compiled_instance_method_access_alist);
            }
            finally {
                final SubLObject _prev_bind_0 = Dynamic.currentBinding(Threads.$is_thread_performing_cleanupP$);
                try {
                    Dynamic.bind(Threads.$is_thread_performing_cleanupP$, (SubLObject)methods.T);
                    final SubLObject _values = Values.getValuesAsVector();
                    subloop_structures._csetf_class_parent(v_class_$14, parent);
                    subloop_structures._csetf_class_instance_method_decls(v_class_$14, instance_method_decls);
                    subloop_structures._csetf_class_compiled_instance_method_access_alist(v_class_$14, compiled_instance_method_access_alist);
                    subloop_structures._csetf_class_tablified_instance_methods(v_class_$14, tablified_instance_methods);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Dynamic.rebind(Threads.$is_thread_performing_cleanupP$, _prev_bind_0);
                }
            }
            return v_class;
        }
        return (SubLObject)methods.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/methods.lisp", position = 23890L)
    public static SubLObject methods_compile_instance_method_access_alist(final SubLObject class_name_or_class) {
        final SubLObject v_class = class_name_or_class.isSymbol() ? classes.classes_retrieve_class(class_name_or_class) : class_name_or_class;
        if (methods.NIL != subloop_structures.class_p(v_class)) {
            final SubLObject v_class_$15 = v_class;
            final SubLObject subclasses = subloop_structures.class_subclasses(v_class_$15);
            methods_compile_instance_method_access_alist_upwards(class_name_or_class, (SubLObject)methods.NIL);
            SubLObject cdolist_list_var = subclasses;
            SubLObject subclass = (SubLObject)methods.NIL;
            subclass = cdolist_list_var.first();
            while (methods.NIL != cdolist_list_var) {
                methods_compile_instance_method_access_alist(subclass);
                cdolist_list_var = cdolist_list_var.rest();
                subclass = cdolist_list_var.first();
            }
            return v_class;
        }
        return v_class;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/methods.lisp", position = 24368L)
    public static SubLObject funcall_class_method_with_0_args(final SubLObject class_name_or_class, final SubLObject method_name) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_class = class_name_or_class.isSymbol() ? classes.classes_retrieve_class(class_name_or_class) : ((methods.NIL != subloop_structures.instance_p(class_name_or_class)) ? subloop_structures.instance_class(class_name_or_class) : class_name_or_class);
        if (methods.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && methods.NIL == subloop_structures.class_p(v_class)) {
            Errors.error((SubLObject)methods.$str67$FUNCALL_CLASS_METHOD___S_is_not_a, class_name_or_class);
        }
        if (methods.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && (methods.NIL == method_name || !method_name.isSymbol())) {
            Errors.error((SubLObject)methods.$str68$FUNCALL_CLASS_METHOD___S_is_not_a, method_name, subloop_structures.class_name(v_class));
        }
        final SubLObject method = method_assoc(method_name, subloop_structures.class_compiled_class_method_access_alist(v_class));
        if (methods.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && methods.NIL == method) {
            Errors.error(classes_utilities.$classes_utilities_undefined_class_method_message$.getGlobalValue(), method_name, v_class);
        }
        if (methods.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && methods.NIL == instances.instances_access_check_method(v_class, method)) {
            Errors.error(classes_utilities.$classes_utilities_illegal_access_message$.getGlobalValue(), method_name, subloop_structures.class_name(v_class));
        }
        return Functions.funcall(subloop_structures.method_function_name(method), v_class);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/methods.lisp", position = 24368L)
    public static SubLObject funcall_class_method_with_1_args(final SubLObject class_name_or_class, final SubLObject method_name, final SubLObject arg0) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_class = class_name_or_class.isSymbol() ? classes.classes_retrieve_class(class_name_or_class) : ((methods.NIL != subloop_structures.instance_p(class_name_or_class)) ? subloop_structures.instance_class(class_name_or_class) : class_name_or_class);
        if (methods.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && methods.NIL == subloop_structures.class_p(v_class)) {
            Errors.error((SubLObject)methods.$str67$FUNCALL_CLASS_METHOD___S_is_not_a, class_name_or_class);
        }
        if (methods.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && (methods.NIL == method_name || !method_name.isSymbol())) {
            Errors.error((SubLObject)methods.$str68$FUNCALL_CLASS_METHOD___S_is_not_a, method_name, subloop_structures.class_name(v_class));
        }
        final SubLObject method = method_assoc(method_name, subloop_structures.class_compiled_class_method_access_alist(v_class));
        if (methods.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && methods.NIL == method) {
            Errors.error(classes_utilities.$classes_utilities_undefined_class_method_message$.getGlobalValue(), method_name, v_class);
        }
        if (methods.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && methods.NIL == instances.instances_access_check_method(v_class, method)) {
            Errors.error(classes_utilities.$classes_utilities_illegal_access_message$.getGlobalValue(), method_name, subloop_structures.class_name(v_class));
        }
        return Functions.funcall(subloop_structures.method_function_name(method), v_class, arg0);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/methods.lisp", position = 24368L)
    public static SubLObject funcall_class_method_with_2_args(final SubLObject class_name_or_class, final SubLObject method_name, final SubLObject arg0, final SubLObject arg1) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_class = class_name_or_class.isSymbol() ? classes.classes_retrieve_class(class_name_or_class) : ((methods.NIL != subloop_structures.instance_p(class_name_or_class)) ? subloop_structures.instance_class(class_name_or_class) : class_name_or_class);
        if (methods.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && methods.NIL == subloop_structures.class_p(v_class)) {
            Errors.error((SubLObject)methods.$str67$FUNCALL_CLASS_METHOD___S_is_not_a, class_name_or_class);
        }
        if (methods.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && (methods.NIL == method_name || !method_name.isSymbol())) {
            Errors.error((SubLObject)methods.$str68$FUNCALL_CLASS_METHOD___S_is_not_a, method_name, subloop_structures.class_name(v_class));
        }
        final SubLObject method = method_assoc(method_name, subloop_structures.class_compiled_class_method_access_alist(v_class));
        if (methods.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && methods.NIL == method) {
            Errors.error(classes_utilities.$classes_utilities_undefined_class_method_message$.getGlobalValue(), method_name, v_class);
        }
        if (methods.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && methods.NIL == instances.instances_access_check_method(v_class, method)) {
            Errors.error(classes_utilities.$classes_utilities_illegal_access_message$.getGlobalValue(), method_name, subloop_structures.class_name(v_class));
        }
        return Functions.funcall(subloop_structures.method_function_name(method), v_class, arg0, arg1);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/methods.lisp", position = 24368L)
    public static SubLObject funcall_class_method_with_3_args(final SubLObject class_name_or_class, final SubLObject method_name, final SubLObject arg0, final SubLObject arg1, final SubLObject arg2) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_class = class_name_or_class.isSymbol() ? classes.classes_retrieve_class(class_name_or_class) : ((methods.NIL != subloop_structures.instance_p(class_name_or_class)) ? subloop_structures.instance_class(class_name_or_class) : class_name_or_class);
        if (methods.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && methods.NIL == subloop_structures.class_p(v_class)) {
            Errors.error((SubLObject)methods.$str67$FUNCALL_CLASS_METHOD___S_is_not_a, class_name_or_class);
        }
        if (methods.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && (methods.NIL == method_name || !method_name.isSymbol())) {
            Errors.error((SubLObject)methods.$str68$FUNCALL_CLASS_METHOD___S_is_not_a, method_name, subloop_structures.class_name(v_class));
        }
        final SubLObject method = method_assoc(method_name, subloop_structures.class_compiled_class_method_access_alist(v_class));
        if (methods.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && methods.NIL == method) {
            Errors.error(classes_utilities.$classes_utilities_undefined_class_method_message$.getGlobalValue(), method_name, v_class);
        }
        if (methods.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && methods.NIL == instances.instances_access_check_method(v_class, method)) {
            Errors.error(classes_utilities.$classes_utilities_illegal_access_message$.getGlobalValue(), method_name, subloop_structures.class_name(v_class));
        }
        return Functions.funcall(subloop_structures.method_function_name(method), v_class, arg0, arg1, arg2);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/methods.lisp", position = 24368L)
    public static SubLObject funcall_class_method_with_4_args(final SubLObject class_name_or_class, final SubLObject method_name, final SubLObject arg0, final SubLObject arg1, final SubLObject arg2, final SubLObject arg3) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_class = class_name_or_class.isSymbol() ? classes.classes_retrieve_class(class_name_or_class) : ((methods.NIL != subloop_structures.instance_p(class_name_or_class)) ? subloop_structures.instance_class(class_name_or_class) : class_name_or_class);
        if (methods.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && methods.NIL == subloop_structures.class_p(v_class)) {
            Errors.error((SubLObject)methods.$str67$FUNCALL_CLASS_METHOD___S_is_not_a, class_name_or_class);
        }
        if (methods.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && (methods.NIL == method_name || !method_name.isSymbol())) {
            Errors.error((SubLObject)methods.$str68$FUNCALL_CLASS_METHOD___S_is_not_a, method_name, subloop_structures.class_name(v_class));
        }
        final SubLObject method = method_assoc(method_name, subloop_structures.class_compiled_class_method_access_alist(v_class));
        if (methods.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && methods.NIL == method) {
            Errors.error(classes_utilities.$classes_utilities_undefined_class_method_message$.getGlobalValue(), method_name, v_class);
        }
        if (methods.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && methods.NIL == instances.instances_access_check_method(v_class, method)) {
            Errors.error(classes_utilities.$classes_utilities_illegal_access_message$.getGlobalValue(), method_name, subloop_structures.class_name(v_class));
        }
        return Functions.funcall(subloop_structures.method_function_name(method), v_class, arg0, arg1, arg2, arg3);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/methods.lisp", position = 24368L)
    public static SubLObject funcall_class_method_with_5_args(final SubLObject class_name_or_class, final SubLObject method_name, final SubLObject arg0, final SubLObject arg1, final SubLObject arg2, final SubLObject arg3, final SubLObject arg4) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_class = class_name_or_class.isSymbol() ? classes.classes_retrieve_class(class_name_or_class) : ((methods.NIL != subloop_structures.instance_p(class_name_or_class)) ? subloop_structures.instance_class(class_name_or_class) : class_name_or_class);
        if (methods.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && methods.NIL == subloop_structures.class_p(v_class)) {
            Errors.error((SubLObject)methods.$str67$FUNCALL_CLASS_METHOD___S_is_not_a, class_name_or_class);
        }
        if (methods.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && (methods.NIL == method_name || !method_name.isSymbol())) {
            Errors.error((SubLObject)methods.$str68$FUNCALL_CLASS_METHOD___S_is_not_a, method_name, subloop_structures.class_name(v_class));
        }
        final SubLObject method = method_assoc(method_name, subloop_structures.class_compiled_class_method_access_alist(v_class));
        if (methods.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && methods.NIL == method) {
            Errors.error(classes_utilities.$classes_utilities_undefined_class_method_message$.getGlobalValue(), method_name, v_class);
        }
        if (methods.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && methods.NIL == instances.instances_access_check_method(v_class, method)) {
            Errors.error(classes_utilities.$classes_utilities_illegal_access_message$.getGlobalValue(), method_name, subloop_structures.class_name(v_class));
        }
        return Functions.funcall(subloop_structures.method_function_name(method), v_class, arg0, arg1, arg2, arg3, arg4);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/methods.lisp", position = 24368L)
    public static SubLObject funcall_class_method_with_6_args(final SubLObject class_name_or_class, final SubLObject method_name, final SubLObject arg0, final SubLObject arg1, final SubLObject arg2, final SubLObject arg3, final SubLObject arg4, final SubLObject arg5) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_class = class_name_or_class.isSymbol() ? classes.classes_retrieve_class(class_name_or_class) : ((methods.NIL != subloop_structures.instance_p(class_name_or_class)) ? subloop_structures.instance_class(class_name_or_class) : class_name_or_class);
        if (methods.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && methods.NIL == subloop_structures.class_p(v_class)) {
            Errors.error((SubLObject)methods.$str67$FUNCALL_CLASS_METHOD___S_is_not_a, class_name_or_class);
        }
        if (methods.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && (methods.NIL == method_name || !method_name.isSymbol())) {
            Errors.error((SubLObject)methods.$str68$FUNCALL_CLASS_METHOD___S_is_not_a, method_name, subloop_structures.class_name(v_class));
        }
        final SubLObject method = method_assoc(method_name, subloop_structures.class_compiled_class_method_access_alist(v_class));
        if (methods.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && methods.NIL == method) {
            Errors.error(classes_utilities.$classes_utilities_undefined_class_method_message$.getGlobalValue(), method_name, v_class);
        }
        if (methods.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && methods.NIL == instances.instances_access_check_method(v_class, method)) {
            Errors.error(classes_utilities.$classes_utilities_illegal_access_message$.getGlobalValue(), method_name, subloop_structures.class_name(v_class));
        }
        return Functions.funcall(subloop_structures.method_function_name(method), new SubLObject[] { v_class, arg0, arg1, arg2, arg3, arg4, arg5 });
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/methods.lisp", position = 24368L)
    public static SubLObject funcall_class_method_with_7_args(final SubLObject class_name_or_class, final SubLObject method_name, final SubLObject arg0, final SubLObject arg1, final SubLObject arg2, final SubLObject arg3, final SubLObject arg4, final SubLObject arg5, final SubLObject arg6) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_class = class_name_or_class.isSymbol() ? classes.classes_retrieve_class(class_name_or_class) : ((methods.NIL != subloop_structures.instance_p(class_name_or_class)) ? subloop_structures.instance_class(class_name_or_class) : class_name_or_class);
        if (methods.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && methods.NIL == subloop_structures.class_p(v_class)) {
            Errors.error((SubLObject)methods.$str67$FUNCALL_CLASS_METHOD___S_is_not_a, class_name_or_class);
        }
        if (methods.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && (methods.NIL == method_name || !method_name.isSymbol())) {
            Errors.error((SubLObject)methods.$str68$FUNCALL_CLASS_METHOD___S_is_not_a, method_name, subloop_structures.class_name(v_class));
        }
        final SubLObject method = method_assoc(method_name, subloop_structures.class_compiled_class_method_access_alist(v_class));
        if (methods.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && methods.NIL == method) {
            Errors.error(classes_utilities.$classes_utilities_undefined_class_method_message$.getGlobalValue(), method_name, v_class);
        }
        if (methods.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && methods.NIL == instances.instances_access_check_method(v_class, method)) {
            Errors.error(classes_utilities.$classes_utilities_illegal_access_message$.getGlobalValue(), method_name, subloop_structures.class_name(v_class));
        }
        return Functions.funcall(subloop_structures.method_function_name(method), new SubLObject[] { v_class, arg0, arg1, arg2, arg3, arg4, arg5, arg6 });
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/methods.lisp", position = 24368L)
    public static SubLObject funcall_class_method_with_8_args(final SubLObject class_name_or_class, final SubLObject method_name, final SubLObject arg0, final SubLObject arg1, final SubLObject arg2, final SubLObject arg3, final SubLObject arg4, final SubLObject arg5, final SubLObject arg6, final SubLObject arg7) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_class = class_name_or_class.isSymbol() ? classes.classes_retrieve_class(class_name_or_class) : ((methods.NIL != subloop_structures.instance_p(class_name_or_class)) ? subloop_structures.instance_class(class_name_or_class) : class_name_or_class);
        if (methods.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && methods.NIL == subloop_structures.class_p(v_class)) {
            Errors.error((SubLObject)methods.$str67$FUNCALL_CLASS_METHOD___S_is_not_a, class_name_or_class);
        }
        if (methods.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && (methods.NIL == method_name || !method_name.isSymbol())) {
            Errors.error((SubLObject)methods.$str68$FUNCALL_CLASS_METHOD___S_is_not_a, method_name, subloop_structures.class_name(v_class));
        }
        final SubLObject method = method_assoc(method_name, subloop_structures.class_compiled_class_method_access_alist(v_class));
        if (methods.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && methods.NIL == method) {
            Errors.error(classes_utilities.$classes_utilities_undefined_class_method_message$.getGlobalValue(), method_name, v_class);
        }
        if (methods.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && methods.NIL == instances.instances_access_check_method(v_class, method)) {
            Errors.error(classes_utilities.$classes_utilities_illegal_access_message$.getGlobalValue(), method_name, subloop_structures.class_name(v_class));
        }
        return Functions.funcall(subloop_structures.method_function_name(method), new SubLObject[] { v_class, arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7 });
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/methods.lisp", position = 24368L)
    public static SubLObject funcall_class_method_with_9_args(final SubLObject class_name_or_class, final SubLObject method_name, final SubLObject arg0, final SubLObject arg1, final SubLObject arg2, final SubLObject arg3, final SubLObject arg4, final SubLObject arg5, final SubLObject arg6, final SubLObject arg7, final SubLObject arg8) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_class = class_name_or_class.isSymbol() ? classes.classes_retrieve_class(class_name_or_class) : ((methods.NIL != subloop_structures.instance_p(class_name_or_class)) ? subloop_structures.instance_class(class_name_or_class) : class_name_or_class);
        if (methods.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && methods.NIL == subloop_structures.class_p(v_class)) {
            Errors.error((SubLObject)methods.$str67$FUNCALL_CLASS_METHOD___S_is_not_a, class_name_or_class);
        }
        if (methods.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && (methods.NIL == method_name || !method_name.isSymbol())) {
            Errors.error((SubLObject)methods.$str68$FUNCALL_CLASS_METHOD___S_is_not_a, method_name, subloop_structures.class_name(v_class));
        }
        final SubLObject method = method_assoc(method_name, subloop_structures.class_compiled_class_method_access_alist(v_class));
        if (methods.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && methods.NIL == method) {
            Errors.error(classes_utilities.$classes_utilities_undefined_class_method_message$.getGlobalValue(), method_name, v_class);
        }
        if (methods.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && methods.NIL == instances.instances_access_check_method(v_class, method)) {
            Errors.error(classes_utilities.$classes_utilities_illegal_access_message$.getGlobalValue(), method_name, subloop_structures.class_name(v_class));
        }
        return Functions.funcall(subloop_structures.method_function_name(method), new SubLObject[] { v_class, arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8 });
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/methods.lisp", position = 24368L)
    public static SubLObject funcall_class_method_with_10_args(final SubLObject class_name_or_class, final SubLObject method_name, final SubLObject arg0, final SubLObject arg1, final SubLObject arg2, final SubLObject arg3, final SubLObject arg4, final SubLObject arg5, final SubLObject arg6, final SubLObject arg7, final SubLObject arg8, final SubLObject arg9) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_class = class_name_or_class.isSymbol() ? classes.classes_retrieve_class(class_name_or_class) : ((methods.NIL != subloop_structures.instance_p(class_name_or_class)) ? subloop_structures.instance_class(class_name_or_class) : class_name_or_class);
        if (methods.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && methods.NIL == subloop_structures.class_p(v_class)) {
            Errors.error((SubLObject)methods.$str67$FUNCALL_CLASS_METHOD___S_is_not_a, class_name_or_class);
        }
        if (methods.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && (methods.NIL == method_name || !method_name.isSymbol())) {
            Errors.error((SubLObject)methods.$str68$FUNCALL_CLASS_METHOD___S_is_not_a, method_name, subloop_structures.class_name(v_class));
        }
        final SubLObject method = method_assoc(method_name, subloop_structures.class_compiled_class_method_access_alist(v_class));
        if (methods.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && methods.NIL == method) {
            Errors.error(classes_utilities.$classes_utilities_undefined_class_method_message$.getGlobalValue(), method_name, v_class);
        }
        if (methods.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && methods.NIL == instances.instances_access_check_method(v_class, method)) {
            Errors.error(classes_utilities.$classes_utilities_illegal_access_message$.getGlobalValue(), method_name, subloop_structures.class_name(v_class));
        }
        return Functions.funcall(subloop_structures.method_function_name(method), new SubLObject[] { v_class, arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9 });
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/methods.lisp", position = 24368L)
    public static SubLObject funcall_class_method_with_11_args(final SubLObject class_name_or_class, final SubLObject method_name, final SubLObject arg0, final SubLObject arg1, final SubLObject arg2, final SubLObject arg3, final SubLObject arg4, final SubLObject arg5, final SubLObject arg6, final SubLObject arg7, final SubLObject arg8, final SubLObject arg9, final SubLObject arg10) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_class = class_name_or_class.isSymbol() ? classes.classes_retrieve_class(class_name_or_class) : ((methods.NIL != subloop_structures.instance_p(class_name_or_class)) ? subloop_structures.instance_class(class_name_or_class) : class_name_or_class);
        if (methods.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && methods.NIL == subloop_structures.class_p(v_class)) {
            Errors.error((SubLObject)methods.$str67$FUNCALL_CLASS_METHOD___S_is_not_a, class_name_or_class);
        }
        if (methods.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && (methods.NIL == method_name || !method_name.isSymbol())) {
            Errors.error((SubLObject)methods.$str68$FUNCALL_CLASS_METHOD___S_is_not_a, method_name, subloop_structures.class_name(v_class));
        }
        final SubLObject method = method_assoc(method_name, subloop_structures.class_compiled_class_method_access_alist(v_class));
        if (methods.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && methods.NIL == method) {
            Errors.error(classes_utilities.$classes_utilities_undefined_class_method_message$.getGlobalValue(), method_name, v_class);
        }
        if (methods.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && methods.NIL == instances.instances_access_check_method(v_class, method)) {
            Errors.error(classes_utilities.$classes_utilities_illegal_access_message$.getGlobalValue(), method_name, subloop_structures.class_name(v_class));
        }
        return Functions.funcall(subloop_structures.method_function_name(method), new SubLObject[] { v_class, arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10 });
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/methods.lisp", position = 24368L)
    public static SubLObject funcall_class_method_with_12_args(final SubLObject class_name_or_class, final SubLObject method_name, final SubLObject arg0, final SubLObject arg1, final SubLObject arg2, final SubLObject arg3, final SubLObject arg4, final SubLObject arg5, final SubLObject arg6, final SubLObject arg7, final SubLObject arg8, final SubLObject arg9, final SubLObject arg10, final SubLObject arg11) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_class = class_name_or_class.isSymbol() ? classes.classes_retrieve_class(class_name_or_class) : ((methods.NIL != subloop_structures.instance_p(class_name_or_class)) ? subloop_structures.instance_class(class_name_or_class) : class_name_or_class);
        if (methods.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && methods.NIL == subloop_structures.class_p(v_class)) {
            Errors.error((SubLObject)methods.$str67$FUNCALL_CLASS_METHOD___S_is_not_a, class_name_or_class);
        }
        if (methods.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && (methods.NIL == method_name || !method_name.isSymbol())) {
            Errors.error((SubLObject)methods.$str68$FUNCALL_CLASS_METHOD___S_is_not_a, method_name, subloop_structures.class_name(v_class));
        }
        final SubLObject method = method_assoc(method_name, subloop_structures.class_compiled_class_method_access_alist(v_class));
        if (methods.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && methods.NIL == method) {
            Errors.error(classes_utilities.$classes_utilities_undefined_class_method_message$.getGlobalValue(), method_name, v_class);
        }
        if (methods.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && methods.NIL == instances.instances_access_check_method(v_class, method)) {
            Errors.error(classes_utilities.$classes_utilities_illegal_access_message$.getGlobalValue(), method_name, subloop_structures.class_name(v_class));
        }
        return Functions.funcall(subloop_structures.method_function_name(method), new SubLObject[] { v_class, arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10, arg11 });
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/methods.lisp", position = 24368L)
    public static SubLObject funcall_class_method_with_13_args(final SubLObject class_name_or_class, final SubLObject method_name, final SubLObject arg0, final SubLObject arg1, final SubLObject arg2, final SubLObject arg3, final SubLObject arg4, final SubLObject arg5, final SubLObject arg6, final SubLObject arg7, final SubLObject arg8, final SubLObject arg9, final SubLObject arg10, final SubLObject arg11, final SubLObject arg12) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_class = class_name_or_class.isSymbol() ? classes.classes_retrieve_class(class_name_or_class) : ((methods.NIL != subloop_structures.instance_p(class_name_or_class)) ? subloop_structures.instance_class(class_name_or_class) : class_name_or_class);
        if (methods.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && methods.NIL == subloop_structures.class_p(v_class)) {
            Errors.error((SubLObject)methods.$str67$FUNCALL_CLASS_METHOD___S_is_not_a, class_name_or_class);
        }
        if (methods.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && (methods.NIL == method_name || !method_name.isSymbol())) {
            Errors.error((SubLObject)methods.$str68$FUNCALL_CLASS_METHOD___S_is_not_a, method_name, subloop_structures.class_name(v_class));
        }
        final SubLObject method = method_assoc(method_name, subloop_structures.class_compiled_class_method_access_alist(v_class));
        if (methods.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && methods.NIL == method) {
            Errors.error(classes_utilities.$classes_utilities_undefined_class_method_message$.getGlobalValue(), method_name, v_class);
        }
        if (methods.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && methods.NIL == instances.instances_access_check_method(v_class, method)) {
            Errors.error(classes_utilities.$classes_utilities_illegal_access_message$.getGlobalValue(), method_name, subloop_structures.class_name(v_class));
        }
        return Functions.funcall(subloop_structures.method_function_name(method), new SubLObject[] { v_class, arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10, arg11, arg12 });
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/methods.lisp", position = 24368L)
    public static SubLObject funcall_class_method_with_14_args(final SubLObject class_name_or_class, final SubLObject method_name, final SubLObject arg0, final SubLObject arg1, final SubLObject arg2, final SubLObject arg3, final SubLObject arg4, final SubLObject arg5, final SubLObject arg6, final SubLObject arg7, final SubLObject arg8, final SubLObject arg9, final SubLObject arg10, final SubLObject arg11, final SubLObject arg12, final SubLObject arg13) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_class = class_name_or_class.isSymbol() ? classes.classes_retrieve_class(class_name_or_class) : ((methods.NIL != subloop_structures.instance_p(class_name_or_class)) ? subloop_structures.instance_class(class_name_or_class) : class_name_or_class);
        if (methods.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && methods.NIL == subloop_structures.class_p(v_class)) {
            Errors.error((SubLObject)methods.$str67$FUNCALL_CLASS_METHOD___S_is_not_a, class_name_or_class);
        }
        if (methods.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && (methods.NIL == method_name || !method_name.isSymbol())) {
            Errors.error((SubLObject)methods.$str68$FUNCALL_CLASS_METHOD___S_is_not_a, method_name, subloop_structures.class_name(v_class));
        }
        final SubLObject method = method_assoc(method_name, subloop_structures.class_compiled_class_method_access_alist(v_class));
        if (methods.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && methods.NIL == method) {
            Errors.error(classes_utilities.$classes_utilities_undefined_class_method_message$.getGlobalValue(), method_name, v_class);
        }
        if (methods.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && methods.NIL == instances.instances_access_check_method(v_class, method)) {
            Errors.error(classes_utilities.$classes_utilities_illegal_access_message$.getGlobalValue(), method_name, subloop_structures.class_name(v_class));
        }
        return Functions.funcall(subloop_structures.method_function_name(method), new SubLObject[] { v_class, arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10, arg11, arg12, arg13 });
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/methods.lisp", position = 24368L)
    public static SubLObject funcall_class_method_with_15_args(final SubLObject class_name_or_class, final SubLObject method_name, final SubLObject arg0, final SubLObject arg1, final SubLObject arg2, final SubLObject arg3, final SubLObject arg4, final SubLObject arg5, final SubLObject arg6, final SubLObject arg7, final SubLObject arg8, final SubLObject arg9, final SubLObject arg10, final SubLObject arg11, final SubLObject arg12, final SubLObject arg13, final SubLObject arg14) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_class = class_name_or_class.isSymbol() ? classes.classes_retrieve_class(class_name_or_class) : ((methods.NIL != subloop_structures.instance_p(class_name_or_class)) ? subloop_structures.instance_class(class_name_or_class) : class_name_or_class);
        if (methods.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && methods.NIL == subloop_structures.class_p(v_class)) {
            Errors.error((SubLObject)methods.$str67$FUNCALL_CLASS_METHOD___S_is_not_a, class_name_or_class);
        }
        if (methods.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && (methods.NIL == method_name || !method_name.isSymbol())) {
            Errors.error((SubLObject)methods.$str68$FUNCALL_CLASS_METHOD___S_is_not_a, method_name, subloop_structures.class_name(v_class));
        }
        final SubLObject method = method_assoc(method_name, subloop_structures.class_compiled_class_method_access_alist(v_class));
        if (methods.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && methods.NIL == method) {
            Errors.error(classes_utilities.$classes_utilities_undefined_class_method_message$.getGlobalValue(), method_name, v_class);
        }
        if (methods.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && methods.NIL == instances.instances_access_check_method(v_class, method)) {
            Errors.error(classes_utilities.$classes_utilities_illegal_access_message$.getGlobalValue(), method_name, subloop_structures.class_name(v_class));
        }
        return Functions.funcall(subloop_structures.method_function_name(method), new SubLObject[] { v_class, arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10, arg11, arg12, arg13, arg14 });
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/methods.lisp", position = 24368L)
    public static SubLObject funcall_class_method_with_16_args(final SubLObject class_name_or_class, final SubLObject method_name, final SubLObject arg0, final SubLObject arg1, final SubLObject arg2, final SubLObject arg3, final SubLObject arg4, final SubLObject arg5, final SubLObject arg6, final SubLObject arg7, final SubLObject arg8, final SubLObject arg9, final SubLObject arg10, final SubLObject arg11, final SubLObject arg12, final SubLObject arg13, final SubLObject arg14, final SubLObject arg15) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_class = class_name_or_class.isSymbol() ? classes.classes_retrieve_class(class_name_or_class) : ((methods.NIL != subloop_structures.instance_p(class_name_or_class)) ? subloop_structures.instance_class(class_name_or_class) : class_name_or_class);
        if (methods.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && methods.NIL == subloop_structures.class_p(v_class)) {
            Errors.error((SubLObject)methods.$str67$FUNCALL_CLASS_METHOD___S_is_not_a, class_name_or_class);
        }
        if (methods.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && (methods.NIL == method_name || !method_name.isSymbol())) {
            Errors.error((SubLObject)methods.$str68$FUNCALL_CLASS_METHOD___S_is_not_a, method_name, subloop_structures.class_name(v_class));
        }
        final SubLObject method = method_assoc(method_name, subloop_structures.class_compiled_class_method_access_alist(v_class));
        if (methods.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && methods.NIL == method) {
            Errors.error(classes_utilities.$classes_utilities_undefined_class_method_message$.getGlobalValue(), method_name, v_class);
        }
        if (methods.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && methods.NIL == instances.instances_access_check_method(v_class, method)) {
            Errors.error(classes_utilities.$classes_utilities_illegal_access_message$.getGlobalValue(), method_name, subloop_structures.class_name(v_class));
        }
        return Functions.funcall(subloop_structures.method_function_name(method), new SubLObject[] { v_class, arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10, arg11, arg12, arg13, arg14, arg15 });
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/methods.lisp", position = 24368L)
    public static SubLObject funcall_class_method_with_17_args(final SubLObject class_name_or_class, final SubLObject method_name, final SubLObject arg0, final SubLObject arg1, final SubLObject arg2, final SubLObject arg3, final SubLObject arg4, final SubLObject arg5, final SubLObject arg6, final SubLObject arg7, final SubLObject arg8, final SubLObject arg9, final SubLObject arg10, final SubLObject arg11, final SubLObject arg12, final SubLObject arg13, final SubLObject arg14, final SubLObject arg15, final SubLObject arg16) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_class = class_name_or_class.isSymbol() ? classes.classes_retrieve_class(class_name_or_class) : ((methods.NIL != subloop_structures.instance_p(class_name_or_class)) ? subloop_structures.instance_class(class_name_or_class) : class_name_or_class);
        if (methods.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && methods.NIL == subloop_structures.class_p(v_class)) {
            Errors.error((SubLObject)methods.$str67$FUNCALL_CLASS_METHOD___S_is_not_a, class_name_or_class);
        }
        if (methods.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && (methods.NIL == method_name || !method_name.isSymbol())) {
            Errors.error((SubLObject)methods.$str68$FUNCALL_CLASS_METHOD___S_is_not_a, method_name, subloop_structures.class_name(v_class));
        }
        final SubLObject method = method_assoc(method_name, subloop_structures.class_compiled_class_method_access_alist(v_class));
        if (methods.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && methods.NIL == method) {
            Errors.error(classes_utilities.$classes_utilities_undefined_class_method_message$.getGlobalValue(), method_name, v_class);
        }
        if (methods.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && methods.NIL == instances.instances_access_check_method(v_class, method)) {
            Errors.error(classes_utilities.$classes_utilities_illegal_access_message$.getGlobalValue(), method_name, subloop_structures.class_name(v_class));
        }
        return Functions.funcall(subloop_structures.method_function_name(method), new SubLObject[] { v_class, arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10, arg11, arg12, arg13, arg14, arg15, arg16 });
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/methods.lisp", position = 24368L)
    public static SubLObject funcall_class_method_with_18_args(final SubLObject class_name_or_class, final SubLObject method_name, final SubLObject arg0, final SubLObject arg1, final SubLObject arg2, final SubLObject arg3, final SubLObject arg4, final SubLObject arg5, final SubLObject arg6, final SubLObject arg7, final SubLObject arg8, final SubLObject arg9, final SubLObject arg10, final SubLObject arg11, final SubLObject arg12, final SubLObject arg13, final SubLObject arg14, final SubLObject arg15, final SubLObject arg16, final SubLObject arg17) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_class = class_name_or_class.isSymbol() ? classes.classes_retrieve_class(class_name_or_class) : ((methods.NIL != subloop_structures.instance_p(class_name_or_class)) ? subloop_structures.instance_class(class_name_or_class) : class_name_or_class);
        if (methods.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && methods.NIL == subloop_structures.class_p(v_class)) {
            Errors.error((SubLObject)methods.$str67$FUNCALL_CLASS_METHOD___S_is_not_a, class_name_or_class);
        }
        if (methods.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && (methods.NIL == method_name || !method_name.isSymbol())) {
            Errors.error((SubLObject)methods.$str68$FUNCALL_CLASS_METHOD___S_is_not_a, method_name, subloop_structures.class_name(v_class));
        }
        final SubLObject method = method_assoc(method_name, subloop_structures.class_compiled_class_method_access_alist(v_class));
        if (methods.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && methods.NIL == method) {
            Errors.error(classes_utilities.$classes_utilities_undefined_class_method_message$.getGlobalValue(), method_name, v_class);
        }
        if (methods.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && methods.NIL == instances.instances_access_check_method(v_class, method)) {
            Errors.error(classes_utilities.$classes_utilities_illegal_access_message$.getGlobalValue(), method_name, subloop_structures.class_name(v_class));
        }
        return Functions.funcall(subloop_structures.method_function_name(method), new SubLObject[] { v_class, arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10, arg11, arg12, arg13, arg14, arg15, arg16, arg17 });
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/methods.lisp", position = 24368L)
    public static SubLObject funcall_class_method_with_19_args(final SubLObject class_name_or_class, final SubLObject method_name, final SubLObject arg0, final SubLObject arg1, final SubLObject arg2, final SubLObject arg3, final SubLObject arg4, final SubLObject arg5, final SubLObject arg6, final SubLObject arg7, final SubLObject arg8, final SubLObject arg9, final SubLObject arg10, final SubLObject arg11, final SubLObject arg12, final SubLObject arg13, final SubLObject arg14, final SubLObject arg15, final SubLObject arg16, final SubLObject arg17, final SubLObject arg18) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_class = class_name_or_class.isSymbol() ? classes.classes_retrieve_class(class_name_or_class) : ((methods.NIL != subloop_structures.instance_p(class_name_or_class)) ? subloop_structures.instance_class(class_name_or_class) : class_name_or_class);
        if (methods.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && methods.NIL == subloop_structures.class_p(v_class)) {
            Errors.error((SubLObject)methods.$str67$FUNCALL_CLASS_METHOD___S_is_not_a, class_name_or_class);
        }
        if (methods.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && (methods.NIL == method_name || !method_name.isSymbol())) {
            Errors.error((SubLObject)methods.$str68$FUNCALL_CLASS_METHOD___S_is_not_a, method_name, subloop_structures.class_name(v_class));
        }
        final SubLObject method = method_assoc(method_name, subloop_structures.class_compiled_class_method_access_alist(v_class));
        if (methods.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && methods.NIL == method) {
            Errors.error(classes_utilities.$classes_utilities_undefined_class_method_message$.getGlobalValue(), method_name, v_class);
        }
        if (methods.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && methods.NIL == instances.instances_access_check_method(v_class, method)) {
            Errors.error(classes_utilities.$classes_utilities_illegal_access_message$.getGlobalValue(), method_name, subloop_structures.class_name(v_class));
        }
        return Functions.funcall(subloop_structures.method_function_name(method), new SubLObject[] { v_class, arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10, arg11, arg12, arg13, arg14, arg15, arg16, arg17, arg18 });
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/methods.lisp", position = 24368L)
    public static SubLObject funcall_class_method_with_20_args(final SubLObject class_name_or_class, final SubLObject method_name, final SubLObject arg0, final SubLObject arg1, final SubLObject arg2, final SubLObject arg3, final SubLObject arg4, final SubLObject arg5, final SubLObject arg6, final SubLObject arg7, final SubLObject arg8, final SubLObject arg9, final SubLObject arg10, final SubLObject arg11, final SubLObject arg12, final SubLObject arg13, final SubLObject arg14, final SubLObject arg15, final SubLObject arg16, final SubLObject arg17, final SubLObject arg18, final SubLObject arg19) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_class = class_name_or_class.isSymbol() ? classes.classes_retrieve_class(class_name_or_class) : ((methods.NIL != subloop_structures.instance_p(class_name_or_class)) ? subloop_structures.instance_class(class_name_or_class) : class_name_or_class);
        if (methods.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && methods.NIL == subloop_structures.class_p(v_class)) {
            Errors.error((SubLObject)methods.$str67$FUNCALL_CLASS_METHOD___S_is_not_a, class_name_or_class);
        }
        if (methods.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && (methods.NIL == method_name || !method_name.isSymbol())) {
            Errors.error((SubLObject)methods.$str68$FUNCALL_CLASS_METHOD___S_is_not_a, method_name, subloop_structures.class_name(v_class));
        }
        final SubLObject method = method_assoc(method_name, subloop_structures.class_compiled_class_method_access_alist(v_class));
        if (methods.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && methods.NIL == method) {
            Errors.error(classes_utilities.$classes_utilities_undefined_class_method_message$.getGlobalValue(), method_name, v_class);
        }
        if (methods.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && methods.NIL == instances.instances_access_check_method(v_class, method)) {
            Errors.error(classes_utilities.$classes_utilities_illegal_access_message$.getGlobalValue(), method_name, subloop_structures.class_name(v_class));
        }
        return Functions.funcall(subloop_structures.method_function_name(method), new SubLObject[] { v_class, arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10, arg11, arg12, arg13, arg14, arg15, arg16, arg17, arg18, arg19 });
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/methods.lisp", position = 25018L)
    public static SubLObject funcall_class_super_method_with_0_args(final SubLObject class_name_or_class, final SubLObject method_name) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_class = class_name_or_class.isSymbol() ? classes.classes_retrieve_class(class_name_or_class) : ((methods.NIL != subloop_structures.instance_p(class_name_or_class)) ? subloop_structures.instance_class(class_name_or_class) : class_name_or_class);
        if (methods.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && methods.NIL == subloop_structures.class_p(v_class)) {
            Errors.error((SubLObject)methods.$str69$FUNCALL_CLASS_SUPER_METHOD___S_is, class_name_or_class);
        }
        if (methods.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && (methods.NIL == method_name || !method_name.isSymbol())) {
            Errors.error((SubLObject)methods.$str70$FUNCALL_CLASS_SUPER_METHOD___S_is, method_name, subloop_structures.class_name(v_class));
        }
        final SubLObject method = method_shadowed_assoc(method_name, subloop_structures.class_compiled_class_method_access_alist(v_class));
        if (methods.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && methods.NIL == method) {
            Errors.error(classes_utilities.$classes_utilities_undefined_class_super_method_message$.getGlobalValue(), method_name, v_class);
        }
        if (methods.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && methods.NIL == instances.instances_access_check_method(v_class, method)) {
            Errors.error(classes_utilities.$classes_utilities_illegal_access_message$.getGlobalValue(), method_name, subloop_structures.class_name(v_class));
        }
        return Functions.funcall(subloop_structures.method_function_name(method), v_class);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/methods.lisp", position = 25018L)
    public static SubLObject funcall_class_super_method_with_1_args(final SubLObject class_name_or_class, final SubLObject method_name, final SubLObject arg0) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_class = class_name_or_class.isSymbol() ? classes.classes_retrieve_class(class_name_or_class) : ((methods.NIL != subloop_structures.instance_p(class_name_or_class)) ? subloop_structures.instance_class(class_name_or_class) : class_name_or_class);
        if (methods.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && methods.NIL == subloop_structures.class_p(v_class)) {
            Errors.error((SubLObject)methods.$str69$FUNCALL_CLASS_SUPER_METHOD___S_is, class_name_or_class);
        }
        if (methods.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && (methods.NIL == method_name || !method_name.isSymbol())) {
            Errors.error((SubLObject)methods.$str70$FUNCALL_CLASS_SUPER_METHOD___S_is, method_name, subloop_structures.class_name(v_class));
        }
        final SubLObject method = method_shadowed_assoc(method_name, subloop_structures.class_compiled_class_method_access_alist(v_class));
        if (methods.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && methods.NIL == method) {
            Errors.error(classes_utilities.$classes_utilities_undefined_class_super_method_message$.getGlobalValue(), method_name, v_class);
        }
        if (methods.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && methods.NIL == instances.instances_access_check_method(v_class, method)) {
            Errors.error(classes_utilities.$classes_utilities_illegal_access_message$.getGlobalValue(), method_name, subloop_structures.class_name(v_class));
        }
        return Functions.funcall(subloop_structures.method_function_name(method), v_class, arg0);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/methods.lisp", position = 25018L)
    public static SubLObject funcall_class_super_method_with_2_args(final SubLObject class_name_or_class, final SubLObject method_name, final SubLObject arg0, final SubLObject arg1) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_class = class_name_or_class.isSymbol() ? classes.classes_retrieve_class(class_name_or_class) : ((methods.NIL != subloop_structures.instance_p(class_name_or_class)) ? subloop_structures.instance_class(class_name_or_class) : class_name_or_class);
        if (methods.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && methods.NIL == subloop_structures.class_p(v_class)) {
            Errors.error((SubLObject)methods.$str69$FUNCALL_CLASS_SUPER_METHOD___S_is, class_name_or_class);
        }
        if (methods.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && (methods.NIL == method_name || !method_name.isSymbol())) {
            Errors.error((SubLObject)methods.$str70$FUNCALL_CLASS_SUPER_METHOD___S_is, method_name, subloop_structures.class_name(v_class));
        }
        final SubLObject method = method_shadowed_assoc(method_name, subloop_structures.class_compiled_class_method_access_alist(v_class));
        if (methods.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && methods.NIL == method) {
            Errors.error(classes_utilities.$classes_utilities_undefined_class_super_method_message$.getGlobalValue(), method_name, v_class);
        }
        if (methods.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && methods.NIL == instances.instances_access_check_method(v_class, method)) {
            Errors.error(classes_utilities.$classes_utilities_illegal_access_message$.getGlobalValue(), method_name, subloop_structures.class_name(v_class));
        }
        return Functions.funcall(subloop_structures.method_function_name(method), v_class, arg0, arg1);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/methods.lisp", position = 25018L)
    public static SubLObject funcall_class_super_method_with_3_args(final SubLObject class_name_or_class, final SubLObject method_name, final SubLObject arg0, final SubLObject arg1, final SubLObject arg2) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_class = class_name_or_class.isSymbol() ? classes.classes_retrieve_class(class_name_or_class) : ((methods.NIL != subloop_structures.instance_p(class_name_or_class)) ? subloop_structures.instance_class(class_name_or_class) : class_name_or_class);
        if (methods.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && methods.NIL == subloop_structures.class_p(v_class)) {
            Errors.error((SubLObject)methods.$str69$FUNCALL_CLASS_SUPER_METHOD___S_is, class_name_or_class);
        }
        if (methods.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && (methods.NIL == method_name || !method_name.isSymbol())) {
            Errors.error((SubLObject)methods.$str70$FUNCALL_CLASS_SUPER_METHOD___S_is, method_name, subloop_structures.class_name(v_class));
        }
        final SubLObject method = method_shadowed_assoc(method_name, subloop_structures.class_compiled_class_method_access_alist(v_class));
        if (methods.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && methods.NIL == method) {
            Errors.error(classes_utilities.$classes_utilities_undefined_class_super_method_message$.getGlobalValue(), method_name, v_class);
        }
        if (methods.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && methods.NIL == instances.instances_access_check_method(v_class, method)) {
            Errors.error(classes_utilities.$classes_utilities_illegal_access_message$.getGlobalValue(), method_name, subloop_structures.class_name(v_class));
        }
        return Functions.funcall(subloop_structures.method_function_name(method), v_class, arg0, arg1, arg2);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/methods.lisp", position = 25018L)
    public static SubLObject funcall_class_super_method_with_4_args(final SubLObject class_name_or_class, final SubLObject method_name, final SubLObject arg0, final SubLObject arg1, final SubLObject arg2, final SubLObject arg3) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_class = class_name_or_class.isSymbol() ? classes.classes_retrieve_class(class_name_or_class) : ((methods.NIL != subloop_structures.instance_p(class_name_or_class)) ? subloop_structures.instance_class(class_name_or_class) : class_name_or_class);
        if (methods.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && methods.NIL == subloop_structures.class_p(v_class)) {
            Errors.error((SubLObject)methods.$str69$FUNCALL_CLASS_SUPER_METHOD___S_is, class_name_or_class);
        }
        if (methods.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && (methods.NIL == method_name || !method_name.isSymbol())) {
            Errors.error((SubLObject)methods.$str70$FUNCALL_CLASS_SUPER_METHOD___S_is, method_name, subloop_structures.class_name(v_class));
        }
        final SubLObject method = method_shadowed_assoc(method_name, subloop_structures.class_compiled_class_method_access_alist(v_class));
        if (methods.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && methods.NIL == method) {
            Errors.error(classes_utilities.$classes_utilities_undefined_class_super_method_message$.getGlobalValue(), method_name, v_class);
        }
        if (methods.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && methods.NIL == instances.instances_access_check_method(v_class, method)) {
            Errors.error(classes_utilities.$classes_utilities_illegal_access_message$.getGlobalValue(), method_name, subloop_structures.class_name(v_class));
        }
        return Functions.funcall(subloop_structures.method_function_name(method), v_class, arg0, arg1, arg2, arg3);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/methods.lisp", position = 25018L)
    public static SubLObject funcall_class_super_method_with_5_args(final SubLObject class_name_or_class, final SubLObject method_name, final SubLObject arg0, final SubLObject arg1, final SubLObject arg2, final SubLObject arg3, final SubLObject arg4) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_class = class_name_or_class.isSymbol() ? classes.classes_retrieve_class(class_name_or_class) : ((methods.NIL != subloop_structures.instance_p(class_name_or_class)) ? subloop_structures.instance_class(class_name_or_class) : class_name_or_class);
        if (methods.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && methods.NIL == subloop_structures.class_p(v_class)) {
            Errors.error((SubLObject)methods.$str69$FUNCALL_CLASS_SUPER_METHOD___S_is, class_name_or_class);
        }
        if (methods.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && (methods.NIL == method_name || !method_name.isSymbol())) {
            Errors.error((SubLObject)methods.$str70$FUNCALL_CLASS_SUPER_METHOD___S_is, method_name, subloop_structures.class_name(v_class));
        }
        final SubLObject method = method_shadowed_assoc(method_name, subloop_structures.class_compiled_class_method_access_alist(v_class));
        if (methods.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && methods.NIL == method) {
            Errors.error(classes_utilities.$classes_utilities_undefined_class_super_method_message$.getGlobalValue(), method_name, v_class);
        }
        if (methods.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && methods.NIL == instances.instances_access_check_method(v_class, method)) {
            Errors.error(classes_utilities.$classes_utilities_illegal_access_message$.getGlobalValue(), method_name, subloop_structures.class_name(v_class));
        }
        return Functions.funcall(subloop_structures.method_function_name(method), v_class, arg0, arg1, arg2, arg3, arg4);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/methods.lisp", position = 25018L)
    public static SubLObject funcall_class_super_method_with_6_args(final SubLObject class_name_or_class, final SubLObject method_name, final SubLObject arg0, final SubLObject arg1, final SubLObject arg2, final SubLObject arg3, final SubLObject arg4, final SubLObject arg5) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_class = class_name_or_class.isSymbol() ? classes.classes_retrieve_class(class_name_or_class) : ((methods.NIL != subloop_structures.instance_p(class_name_or_class)) ? subloop_structures.instance_class(class_name_or_class) : class_name_or_class);
        if (methods.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && methods.NIL == subloop_structures.class_p(v_class)) {
            Errors.error((SubLObject)methods.$str69$FUNCALL_CLASS_SUPER_METHOD___S_is, class_name_or_class);
        }
        if (methods.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && (methods.NIL == method_name || !method_name.isSymbol())) {
            Errors.error((SubLObject)methods.$str70$FUNCALL_CLASS_SUPER_METHOD___S_is, method_name, subloop_structures.class_name(v_class));
        }
        final SubLObject method = method_shadowed_assoc(method_name, subloop_structures.class_compiled_class_method_access_alist(v_class));
        if (methods.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && methods.NIL == method) {
            Errors.error(classes_utilities.$classes_utilities_undefined_class_super_method_message$.getGlobalValue(), method_name, v_class);
        }
        if (methods.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && methods.NIL == instances.instances_access_check_method(v_class, method)) {
            Errors.error(classes_utilities.$classes_utilities_illegal_access_message$.getGlobalValue(), method_name, subloop_structures.class_name(v_class));
        }
        return Functions.funcall(subloop_structures.method_function_name(method), new SubLObject[] { v_class, arg0, arg1, arg2, arg3, arg4, arg5 });
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/methods.lisp", position = 25018L)
    public static SubLObject funcall_class_super_method_with_7_args(final SubLObject class_name_or_class, final SubLObject method_name, final SubLObject arg0, final SubLObject arg1, final SubLObject arg2, final SubLObject arg3, final SubLObject arg4, final SubLObject arg5, final SubLObject arg6) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_class = class_name_or_class.isSymbol() ? classes.classes_retrieve_class(class_name_or_class) : ((methods.NIL != subloop_structures.instance_p(class_name_or_class)) ? subloop_structures.instance_class(class_name_or_class) : class_name_or_class);
        if (methods.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && methods.NIL == subloop_structures.class_p(v_class)) {
            Errors.error((SubLObject)methods.$str69$FUNCALL_CLASS_SUPER_METHOD___S_is, class_name_or_class);
        }
        if (methods.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && (methods.NIL == method_name || !method_name.isSymbol())) {
            Errors.error((SubLObject)methods.$str70$FUNCALL_CLASS_SUPER_METHOD___S_is, method_name, subloop_structures.class_name(v_class));
        }
        final SubLObject method = method_shadowed_assoc(method_name, subloop_structures.class_compiled_class_method_access_alist(v_class));
        if (methods.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && methods.NIL == method) {
            Errors.error(classes_utilities.$classes_utilities_undefined_class_super_method_message$.getGlobalValue(), method_name, v_class);
        }
        if (methods.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && methods.NIL == instances.instances_access_check_method(v_class, method)) {
            Errors.error(classes_utilities.$classes_utilities_illegal_access_message$.getGlobalValue(), method_name, subloop_structures.class_name(v_class));
        }
        return Functions.funcall(subloop_structures.method_function_name(method), new SubLObject[] { v_class, arg0, arg1, arg2, arg3, arg4, arg5, arg6 });
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/methods.lisp", position = 25018L)
    public static SubLObject funcall_class_super_method_with_8_args(final SubLObject class_name_or_class, final SubLObject method_name, final SubLObject arg0, final SubLObject arg1, final SubLObject arg2, final SubLObject arg3, final SubLObject arg4, final SubLObject arg5, final SubLObject arg6, final SubLObject arg7) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_class = class_name_or_class.isSymbol() ? classes.classes_retrieve_class(class_name_or_class) : ((methods.NIL != subloop_structures.instance_p(class_name_or_class)) ? subloop_structures.instance_class(class_name_or_class) : class_name_or_class);
        if (methods.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && methods.NIL == subloop_structures.class_p(v_class)) {
            Errors.error((SubLObject)methods.$str69$FUNCALL_CLASS_SUPER_METHOD___S_is, class_name_or_class);
        }
        if (methods.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && (methods.NIL == method_name || !method_name.isSymbol())) {
            Errors.error((SubLObject)methods.$str70$FUNCALL_CLASS_SUPER_METHOD___S_is, method_name, subloop_structures.class_name(v_class));
        }
        final SubLObject method = method_shadowed_assoc(method_name, subloop_structures.class_compiled_class_method_access_alist(v_class));
        if (methods.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && methods.NIL == method) {
            Errors.error(classes_utilities.$classes_utilities_undefined_class_super_method_message$.getGlobalValue(), method_name, v_class);
        }
        if (methods.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && methods.NIL == instances.instances_access_check_method(v_class, method)) {
            Errors.error(classes_utilities.$classes_utilities_illegal_access_message$.getGlobalValue(), method_name, subloop_structures.class_name(v_class));
        }
        return Functions.funcall(subloop_structures.method_function_name(method), new SubLObject[] { v_class, arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7 });
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/methods.lisp", position = 25018L)
    public static SubLObject funcall_class_super_method_with_9_args(final SubLObject class_name_or_class, final SubLObject method_name, final SubLObject arg0, final SubLObject arg1, final SubLObject arg2, final SubLObject arg3, final SubLObject arg4, final SubLObject arg5, final SubLObject arg6, final SubLObject arg7, final SubLObject arg8) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_class = class_name_or_class.isSymbol() ? classes.classes_retrieve_class(class_name_or_class) : ((methods.NIL != subloop_structures.instance_p(class_name_or_class)) ? subloop_structures.instance_class(class_name_or_class) : class_name_or_class);
        if (methods.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && methods.NIL == subloop_structures.class_p(v_class)) {
            Errors.error((SubLObject)methods.$str69$FUNCALL_CLASS_SUPER_METHOD___S_is, class_name_or_class);
        }
        if (methods.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && (methods.NIL == method_name || !method_name.isSymbol())) {
            Errors.error((SubLObject)methods.$str70$FUNCALL_CLASS_SUPER_METHOD___S_is, method_name, subloop_structures.class_name(v_class));
        }
        final SubLObject method = method_shadowed_assoc(method_name, subloop_structures.class_compiled_class_method_access_alist(v_class));
        if (methods.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && methods.NIL == method) {
            Errors.error(classes_utilities.$classes_utilities_undefined_class_super_method_message$.getGlobalValue(), method_name, v_class);
        }
        if (methods.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && methods.NIL == instances.instances_access_check_method(v_class, method)) {
            Errors.error(classes_utilities.$classes_utilities_illegal_access_message$.getGlobalValue(), method_name, subloop_structures.class_name(v_class));
        }
        return Functions.funcall(subloop_structures.method_function_name(method), new SubLObject[] { v_class, arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8 });
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/methods.lisp", position = 25018L)
    public static SubLObject funcall_class_super_method_with_10_args(final SubLObject class_name_or_class, final SubLObject method_name, final SubLObject arg0, final SubLObject arg1, final SubLObject arg2, final SubLObject arg3, final SubLObject arg4, final SubLObject arg5, final SubLObject arg6, final SubLObject arg7, final SubLObject arg8, final SubLObject arg9) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_class = class_name_or_class.isSymbol() ? classes.classes_retrieve_class(class_name_or_class) : ((methods.NIL != subloop_structures.instance_p(class_name_or_class)) ? subloop_structures.instance_class(class_name_or_class) : class_name_or_class);
        if (methods.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && methods.NIL == subloop_structures.class_p(v_class)) {
            Errors.error((SubLObject)methods.$str69$FUNCALL_CLASS_SUPER_METHOD___S_is, class_name_or_class);
        }
        if (methods.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && (methods.NIL == method_name || !method_name.isSymbol())) {
            Errors.error((SubLObject)methods.$str70$FUNCALL_CLASS_SUPER_METHOD___S_is, method_name, subloop_structures.class_name(v_class));
        }
        final SubLObject method = method_shadowed_assoc(method_name, subloop_structures.class_compiled_class_method_access_alist(v_class));
        if (methods.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && methods.NIL == method) {
            Errors.error(classes_utilities.$classes_utilities_undefined_class_super_method_message$.getGlobalValue(), method_name, v_class);
        }
        if (methods.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && methods.NIL == instances.instances_access_check_method(v_class, method)) {
            Errors.error(classes_utilities.$classes_utilities_illegal_access_message$.getGlobalValue(), method_name, subloop_structures.class_name(v_class));
        }
        return Functions.funcall(subloop_structures.method_function_name(method), new SubLObject[] { v_class, arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9 });
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/methods.lisp", position = 25018L)
    public static SubLObject funcall_class_super_method_with_11_args(final SubLObject class_name_or_class, final SubLObject method_name, final SubLObject arg0, final SubLObject arg1, final SubLObject arg2, final SubLObject arg3, final SubLObject arg4, final SubLObject arg5, final SubLObject arg6, final SubLObject arg7, final SubLObject arg8, final SubLObject arg9, final SubLObject arg10) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_class = class_name_or_class.isSymbol() ? classes.classes_retrieve_class(class_name_or_class) : ((methods.NIL != subloop_structures.instance_p(class_name_or_class)) ? subloop_structures.instance_class(class_name_or_class) : class_name_or_class);
        if (methods.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && methods.NIL == subloop_structures.class_p(v_class)) {
            Errors.error((SubLObject)methods.$str69$FUNCALL_CLASS_SUPER_METHOD___S_is, class_name_or_class);
        }
        if (methods.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && (methods.NIL == method_name || !method_name.isSymbol())) {
            Errors.error((SubLObject)methods.$str70$FUNCALL_CLASS_SUPER_METHOD___S_is, method_name, subloop_structures.class_name(v_class));
        }
        final SubLObject method = method_shadowed_assoc(method_name, subloop_structures.class_compiled_class_method_access_alist(v_class));
        if (methods.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && methods.NIL == method) {
            Errors.error(classes_utilities.$classes_utilities_undefined_class_super_method_message$.getGlobalValue(), method_name, v_class);
        }
        if (methods.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && methods.NIL == instances.instances_access_check_method(v_class, method)) {
            Errors.error(classes_utilities.$classes_utilities_illegal_access_message$.getGlobalValue(), method_name, subloop_structures.class_name(v_class));
        }
        return Functions.funcall(subloop_structures.method_function_name(method), new SubLObject[] { v_class, arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10 });
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/methods.lisp", position = 25018L)
    public static SubLObject funcall_class_super_method_with_12_args(final SubLObject class_name_or_class, final SubLObject method_name, final SubLObject arg0, final SubLObject arg1, final SubLObject arg2, final SubLObject arg3, final SubLObject arg4, final SubLObject arg5, final SubLObject arg6, final SubLObject arg7, final SubLObject arg8, final SubLObject arg9, final SubLObject arg10, final SubLObject arg11) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_class = class_name_or_class.isSymbol() ? classes.classes_retrieve_class(class_name_or_class) : ((methods.NIL != subloop_structures.instance_p(class_name_or_class)) ? subloop_structures.instance_class(class_name_or_class) : class_name_or_class);
        if (methods.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && methods.NIL == subloop_structures.class_p(v_class)) {
            Errors.error((SubLObject)methods.$str69$FUNCALL_CLASS_SUPER_METHOD___S_is, class_name_or_class);
        }
        if (methods.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && (methods.NIL == method_name || !method_name.isSymbol())) {
            Errors.error((SubLObject)methods.$str70$FUNCALL_CLASS_SUPER_METHOD___S_is, method_name, subloop_structures.class_name(v_class));
        }
        final SubLObject method = method_shadowed_assoc(method_name, subloop_structures.class_compiled_class_method_access_alist(v_class));
        if (methods.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && methods.NIL == method) {
            Errors.error(classes_utilities.$classes_utilities_undefined_class_super_method_message$.getGlobalValue(), method_name, v_class);
        }
        if (methods.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && methods.NIL == instances.instances_access_check_method(v_class, method)) {
            Errors.error(classes_utilities.$classes_utilities_illegal_access_message$.getGlobalValue(), method_name, subloop_structures.class_name(v_class));
        }
        return Functions.funcall(subloop_structures.method_function_name(method), new SubLObject[] { v_class, arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10, arg11 });
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/methods.lisp", position = 25018L)
    public static SubLObject funcall_class_super_method_with_13_args(final SubLObject class_name_or_class, final SubLObject method_name, final SubLObject arg0, final SubLObject arg1, final SubLObject arg2, final SubLObject arg3, final SubLObject arg4, final SubLObject arg5, final SubLObject arg6, final SubLObject arg7, final SubLObject arg8, final SubLObject arg9, final SubLObject arg10, final SubLObject arg11, final SubLObject arg12) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_class = class_name_or_class.isSymbol() ? classes.classes_retrieve_class(class_name_or_class) : ((methods.NIL != subloop_structures.instance_p(class_name_or_class)) ? subloop_structures.instance_class(class_name_or_class) : class_name_or_class);
        if (methods.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && methods.NIL == subloop_structures.class_p(v_class)) {
            Errors.error((SubLObject)methods.$str69$FUNCALL_CLASS_SUPER_METHOD___S_is, class_name_or_class);
        }
        if (methods.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && (methods.NIL == method_name || !method_name.isSymbol())) {
            Errors.error((SubLObject)methods.$str70$FUNCALL_CLASS_SUPER_METHOD___S_is, method_name, subloop_structures.class_name(v_class));
        }
        final SubLObject method = method_shadowed_assoc(method_name, subloop_structures.class_compiled_class_method_access_alist(v_class));
        if (methods.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && methods.NIL == method) {
            Errors.error(classes_utilities.$classes_utilities_undefined_class_super_method_message$.getGlobalValue(), method_name, v_class);
        }
        if (methods.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && methods.NIL == instances.instances_access_check_method(v_class, method)) {
            Errors.error(classes_utilities.$classes_utilities_illegal_access_message$.getGlobalValue(), method_name, subloop_structures.class_name(v_class));
        }
        return Functions.funcall(subloop_structures.method_function_name(method), new SubLObject[] { v_class, arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10, arg11, arg12 });
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/methods.lisp", position = 25018L)
    public static SubLObject funcall_class_super_method_with_14_args(final SubLObject class_name_or_class, final SubLObject method_name, final SubLObject arg0, final SubLObject arg1, final SubLObject arg2, final SubLObject arg3, final SubLObject arg4, final SubLObject arg5, final SubLObject arg6, final SubLObject arg7, final SubLObject arg8, final SubLObject arg9, final SubLObject arg10, final SubLObject arg11, final SubLObject arg12, final SubLObject arg13) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_class = class_name_or_class.isSymbol() ? classes.classes_retrieve_class(class_name_or_class) : ((methods.NIL != subloop_structures.instance_p(class_name_or_class)) ? subloop_structures.instance_class(class_name_or_class) : class_name_or_class);
        if (methods.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && methods.NIL == subloop_structures.class_p(v_class)) {
            Errors.error((SubLObject)methods.$str69$FUNCALL_CLASS_SUPER_METHOD___S_is, class_name_or_class);
        }
        if (methods.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && (methods.NIL == method_name || !method_name.isSymbol())) {
            Errors.error((SubLObject)methods.$str70$FUNCALL_CLASS_SUPER_METHOD___S_is, method_name, subloop_structures.class_name(v_class));
        }
        final SubLObject method = method_shadowed_assoc(method_name, subloop_structures.class_compiled_class_method_access_alist(v_class));
        if (methods.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && methods.NIL == method) {
            Errors.error(classes_utilities.$classes_utilities_undefined_class_super_method_message$.getGlobalValue(), method_name, v_class);
        }
        if (methods.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && methods.NIL == instances.instances_access_check_method(v_class, method)) {
            Errors.error(classes_utilities.$classes_utilities_illegal_access_message$.getGlobalValue(), method_name, subloop_structures.class_name(v_class));
        }
        return Functions.funcall(subloop_structures.method_function_name(method), new SubLObject[] { v_class, arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10, arg11, arg12, arg13 });
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/methods.lisp", position = 25018L)
    public static SubLObject funcall_class_super_method_with_15_args(final SubLObject class_name_or_class, final SubLObject method_name, final SubLObject arg0, final SubLObject arg1, final SubLObject arg2, final SubLObject arg3, final SubLObject arg4, final SubLObject arg5, final SubLObject arg6, final SubLObject arg7, final SubLObject arg8, final SubLObject arg9, final SubLObject arg10, final SubLObject arg11, final SubLObject arg12, final SubLObject arg13, final SubLObject arg14) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_class = class_name_or_class.isSymbol() ? classes.classes_retrieve_class(class_name_or_class) : ((methods.NIL != subloop_structures.instance_p(class_name_or_class)) ? subloop_structures.instance_class(class_name_or_class) : class_name_or_class);
        if (methods.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && methods.NIL == subloop_structures.class_p(v_class)) {
            Errors.error((SubLObject)methods.$str69$FUNCALL_CLASS_SUPER_METHOD___S_is, class_name_or_class);
        }
        if (methods.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && (methods.NIL == method_name || !method_name.isSymbol())) {
            Errors.error((SubLObject)methods.$str70$FUNCALL_CLASS_SUPER_METHOD___S_is, method_name, subloop_structures.class_name(v_class));
        }
        final SubLObject method = method_shadowed_assoc(method_name, subloop_structures.class_compiled_class_method_access_alist(v_class));
        if (methods.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && methods.NIL == method) {
            Errors.error(classes_utilities.$classes_utilities_undefined_class_super_method_message$.getGlobalValue(), method_name, v_class);
        }
        if (methods.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && methods.NIL == instances.instances_access_check_method(v_class, method)) {
            Errors.error(classes_utilities.$classes_utilities_illegal_access_message$.getGlobalValue(), method_name, subloop_structures.class_name(v_class));
        }
        return Functions.funcall(subloop_structures.method_function_name(method), new SubLObject[] { v_class, arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10, arg11, arg12, arg13, arg14 });
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/methods.lisp", position = 25018L)
    public static SubLObject funcall_class_super_method_with_16_args(final SubLObject class_name_or_class, final SubLObject method_name, final SubLObject arg0, final SubLObject arg1, final SubLObject arg2, final SubLObject arg3, final SubLObject arg4, final SubLObject arg5, final SubLObject arg6, final SubLObject arg7, final SubLObject arg8, final SubLObject arg9, final SubLObject arg10, final SubLObject arg11, final SubLObject arg12, final SubLObject arg13, final SubLObject arg14, final SubLObject arg15) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_class = class_name_or_class.isSymbol() ? classes.classes_retrieve_class(class_name_or_class) : ((methods.NIL != subloop_structures.instance_p(class_name_or_class)) ? subloop_structures.instance_class(class_name_or_class) : class_name_or_class);
        if (methods.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && methods.NIL == subloop_structures.class_p(v_class)) {
            Errors.error((SubLObject)methods.$str69$FUNCALL_CLASS_SUPER_METHOD___S_is, class_name_or_class);
        }
        if (methods.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && (methods.NIL == method_name || !method_name.isSymbol())) {
            Errors.error((SubLObject)methods.$str70$FUNCALL_CLASS_SUPER_METHOD___S_is, method_name, subloop_structures.class_name(v_class));
        }
        final SubLObject method = method_shadowed_assoc(method_name, subloop_structures.class_compiled_class_method_access_alist(v_class));
        if (methods.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && methods.NIL == method) {
            Errors.error(classes_utilities.$classes_utilities_undefined_class_super_method_message$.getGlobalValue(), method_name, v_class);
        }
        if (methods.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && methods.NIL == instances.instances_access_check_method(v_class, method)) {
            Errors.error(classes_utilities.$classes_utilities_illegal_access_message$.getGlobalValue(), method_name, subloop_structures.class_name(v_class));
        }
        return Functions.funcall(subloop_structures.method_function_name(method), new SubLObject[] { v_class, arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10, arg11, arg12, arg13, arg14, arg15 });
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/methods.lisp", position = 25018L)
    public static SubLObject funcall_class_super_method_with_17_args(final SubLObject class_name_or_class, final SubLObject method_name, final SubLObject arg0, final SubLObject arg1, final SubLObject arg2, final SubLObject arg3, final SubLObject arg4, final SubLObject arg5, final SubLObject arg6, final SubLObject arg7, final SubLObject arg8, final SubLObject arg9, final SubLObject arg10, final SubLObject arg11, final SubLObject arg12, final SubLObject arg13, final SubLObject arg14, final SubLObject arg15, final SubLObject arg16) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_class = class_name_or_class.isSymbol() ? classes.classes_retrieve_class(class_name_or_class) : ((methods.NIL != subloop_structures.instance_p(class_name_or_class)) ? subloop_structures.instance_class(class_name_or_class) : class_name_or_class);
        if (methods.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && methods.NIL == subloop_structures.class_p(v_class)) {
            Errors.error((SubLObject)methods.$str69$FUNCALL_CLASS_SUPER_METHOD___S_is, class_name_or_class);
        }
        if (methods.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && (methods.NIL == method_name || !method_name.isSymbol())) {
            Errors.error((SubLObject)methods.$str70$FUNCALL_CLASS_SUPER_METHOD___S_is, method_name, subloop_structures.class_name(v_class));
        }
        final SubLObject method = method_shadowed_assoc(method_name, subloop_structures.class_compiled_class_method_access_alist(v_class));
        if (methods.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && methods.NIL == method) {
            Errors.error(classes_utilities.$classes_utilities_undefined_class_super_method_message$.getGlobalValue(), method_name, v_class);
        }
        if (methods.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && methods.NIL == instances.instances_access_check_method(v_class, method)) {
            Errors.error(classes_utilities.$classes_utilities_illegal_access_message$.getGlobalValue(), method_name, subloop_structures.class_name(v_class));
        }
        return Functions.funcall(subloop_structures.method_function_name(method), new SubLObject[] { v_class, arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10, arg11, arg12, arg13, arg14, arg15, arg16 });
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/methods.lisp", position = 25018L)
    public static SubLObject funcall_class_super_method_with_18_args(final SubLObject class_name_or_class, final SubLObject method_name, final SubLObject arg0, final SubLObject arg1, final SubLObject arg2, final SubLObject arg3, final SubLObject arg4, final SubLObject arg5, final SubLObject arg6, final SubLObject arg7, final SubLObject arg8, final SubLObject arg9, final SubLObject arg10, final SubLObject arg11, final SubLObject arg12, final SubLObject arg13, final SubLObject arg14, final SubLObject arg15, final SubLObject arg16, final SubLObject arg17) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_class = class_name_or_class.isSymbol() ? classes.classes_retrieve_class(class_name_or_class) : ((methods.NIL != subloop_structures.instance_p(class_name_or_class)) ? subloop_structures.instance_class(class_name_or_class) : class_name_or_class);
        if (methods.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && methods.NIL == subloop_structures.class_p(v_class)) {
            Errors.error((SubLObject)methods.$str69$FUNCALL_CLASS_SUPER_METHOD___S_is, class_name_or_class);
        }
        if (methods.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && (methods.NIL == method_name || !method_name.isSymbol())) {
            Errors.error((SubLObject)methods.$str70$FUNCALL_CLASS_SUPER_METHOD___S_is, method_name, subloop_structures.class_name(v_class));
        }
        final SubLObject method = method_shadowed_assoc(method_name, subloop_structures.class_compiled_class_method_access_alist(v_class));
        if (methods.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && methods.NIL == method) {
            Errors.error(classes_utilities.$classes_utilities_undefined_class_super_method_message$.getGlobalValue(), method_name, v_class);
        }
        if (methods.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && methods.NIL == instances.instances_access_check_method(v_class, method)) {
            Errors.error(classes_utilities.$classes_utilities_illegal_access_message$.getGlobalValue(), method_name, subloop_structures.class_name(v_class));
        }
        return Functions.funcall(subloop_structures.method_function_name(method), new SubLObject[] { v_class, arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10, arg11, arg12, arg13, arg14, arg15, arg16, arg17 });
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/methods.lisp", position = 25018L)
    public static SubLObject funcall_class_super_method_with_19_args(final SubLObject class_name_or_class, final SubLObject method_name, final SubLObject arg0, final SubLObject arg1, final SubLObject arg2, final SubLObject arg3, final SubLObject arg4, final SubLObject arg5, final SubLObject arg6, final SubLObject arg7, final SubLObject arg8, final SubLObject arg9, final SubLObject arg10, final SubLObject arg11, final SubLObject arg12, final SubLObject arg13, final SubLObject arg14, final SubLObject arg15, final SubLObject arg16, final SubLObject arg17, final SubLObject arg18) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_class = class_name_or_class.isSymbol() ? classes.classes_retrieve_class(class_name_or_class) : ((methods.NIL != subloop_structures.instance_p(class_name_or_class)) ? subloop_structures.instance_class(class_name_or_class) : class_name_or_class);
        if (methods.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && methods.NIL == subloop_structures.class_p(v_class)) {
            Errors.error((SubLObject)methods.$str69$FUNCALL_CLASS_SUPER_METHOD___S_is, class_name_or_class);
        }
        if (methods.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && (methods.NIL == method_name || !method_name.isSymbol())) {
            Errors.error((SubLObject)methods.$str70$FUNCALL_CLASS_SUPER_METHOD___S_is, method_name, subloop_structures.class_name(v_class));
        }
        final SubLObject method = method_shadowed_assoc(method_name, subloop_structures.class_compiled_class_method_access_alist(v_class));
        if (methods.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && methods.NIL == method) {
            Errors.error(classes_utilities.$classes_utilities_undefined_class_super_method_message$.getGlobalValue(), method_name, v_class);
        }
        if (methods.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && methods.NIL == instances.instances_access_check_method(v_class, method)) {
            Errors.error(classes_utilities.$classes_utilities_illegal_access_message$.getGlobalValue(), method_name, subloop_structures.class_name(v_class));
        }
        return Functions.funcall(subloop_structures.method_function_name(method), new SubLObject[] { v_class, arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10, arg11, arg12, arg13, arg14, arg15, arg16, arg17, arg18 });
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/methods.lisp", position = 25018L)
    public static SubLObject funcall_class_super_method_with_20_args(final SubLObject class_name_or_class, final SubLObject method_name, final SubLObject arg0, final SubLObject arg1, final SubLObject arg2, final SubLObject arg3, final SubLObject arg4, final SubLObject arg5, final SubLObject arg6, final SubLObject arg7, final SubLObject arg8, final SubLObject arg9, final SubLObject arg10, final SubLObject arg11, final SubLObject arg12, final SubLObject arg13, final SubLObject arg14, final SubLObject arg15, final SubLObject arg16, final SubLObject arg17, final SubLObject arg18, final SubLObject arg19) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_class = class_name_or_class.isSymbol() ? classes.classes_retrieve_class(class_name_or_class) : ((methods.NIL != subloop_structures.instance_p(class_name_or_class)) ? subloop_structures.instance_class(class_name_or_class) : class_name_or_class);
        if (methods.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && methods.NIL == subloop_structures.class_p(v_class)) {
            Errors.error((SubLObject)methods.$str69$FUNCALL_CLASS_SUPER_METHOD___S_is, class_name_or_class);
        }
        if (methods.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && (methods.NIL == method_name || !method_name.isSymbol())) {
            Errors.error((SubLObject)methods.$str70$FUNCALL_CLASS_SUPER_METHOD___S_is, method_name, subloop_structures.class_name(v_class));
        }
        final SubLObject method = method_shadowed_assoc(method_name, subloop_structures.class_compiled_class_method_access_alist(v_class));
        if (methods.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && methods.NIL == method) {
            Errors.error(classes_utilities.$classes_utilities_undefined_class_super_method_message$.getGlobalValue(), method_name, v_class);
        }
        if (methods.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && methods.NIL == instances.instances_access_check_method(v_class, method)) {
            Errors.error(classes_utilities.$classes_utilities_illegal_access_message$.getGlobalValue(), method_name, subloop_structures.class_name(v_class));
        }
        return Functions.funcall(subloop_structures.method_function_name(method), new SubLObject[] { v_class, arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10, arg11, arg12, arg13, arg14, arg15, arg16, arg17, arg18, arg19 });
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/methods.lisp", position = 25734L)
    public static SubLObject safe_funcall_class_method_with_0_args(final SubLObject class_name_or_class, final SubLObject method_name) {
        final SubLObject v_class = class_name_or_class.isSymbol() ? classes.classes_retrieve_class(class_name_or_class) : ((methods.NIL != subloop_structures.instance_p(class_name_or_class)) ? subloop_structures.instance_class(class_name_or_class) : class_name_or_class);
        if (methods.NIL == subloop_structures.class_p(v_class)) {
            return Values.values((SubLObject)methods.NIL, (SubLObject)methods.$kw71$TARGET_NOT_A_CLASS);
        }
        if (methods.NIL == method_name || !method_name.isSymbol()) {
            return Values.values((SubLObject)methods.NIL, (SubLObject)methods.$kw72$INVALID_METHOD_NAME);
        }
        final SubLObject method = method_assoc(method_name, subloop_structures.class_compiled_class_method_access_alist(v_class));
        if (methods.NIL == method) {
            return Values.values((SubLObject)methods.NIL, (SubLObject)methods.$kw73$UNDECLARED_METHOD);
        }
        if (methods.NIL == instances.instances_access_check_method(v_class, method)) {
            return Values.values((SubLObject)methods.NIL, (SubLObject)methods.$kw74$ACCESS_LEVEL_CONFLICT);
        }
        final SubLObject function_ref = subloop_structures.method_function_name(method);
        if (methods.NIL == Symbols.fboundp(function_ref)) {
            return Values.values((SubLObject)methods.NIL, (SubLObject)methods.$kw75$UNDEFINED_METHOD);
        }
        return Values.values(Functions.funcall(function_ref, v_class), (SubLObject)methods.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/methods.lisp", position = 25734L)
    public static SubLObject safe_funcall_class_method_with_1_args(final SubLObject class_name_or_class, final SubLObject method_name, final SubLObject arg0) {
        final SubLObject v_class = class_name_or_class.isSymbol() ? classes.classes_retrieve_class(class_name_or_class) : ((methods.NIL != subloop_structures.instance_p(class_name_or_class)) ? subloop_structures.instance_class(class_name_or_class) : class_name_or_class);
        if (methods.NIL == subloop_structures.class_p(v_class)) {
            return Values.values((SubLObject)methods.NIL, (SubLObject)methods.$kw71$TARGET_NOT_A_CLASS);
        }
        if (methods.NIL == method_name || !method_name.isSymbol()) {
            return Values.values((SubLObject)methods.NIL, (SubLObject)methods.$kw72$INVALID_METHOD_NAME);
        }
        final SubLObject method = method_assoc(method_name, subloop_structures.class_compiled_class_method_access_alist(v_class));
        if (methods.NIL == method) {
            return Values.values((SubLObject)methods.NIL, (SubLObject)methods.$kw73$UNDECLARED_METHOD);
        }
        if (methods.NIL == instances.instances_access_check_method(v_class, method)) {
            return Values.values((SubLObject)methods.NIL, (SubLObject)methods.$kw74$ACCESS_LEVEL_CONFLICT);
        }
        final SubLObject function_ref = subloop_structures.method_function_name(method);
        if (methods.NIL == Symbols.fboundp(function_ref)) {
            return Values.values((SubLObject)methods.NIL, (SubLObject)methods.$kw75$UNDEFINED_METHOD);
        }
        return Values.values(Functions.funcall(function_ref, v_class, arg0), (SubLObject)methods.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/methods.lisp", position = 25734L)
    public static SubLObject safe_funcall_class_method_with_2_args(final SubLObject class_name_or_class, final SubLObject method_name, final SubLObject arg0, final SubLObject arg1) {
        final SubLObject v_class = class_name_or_class.isSymbol() ? classes.classes_retrieve_class(class_name_or_class) : ((methods.NIL != subloop_structures.instance_p(class_name_or_class)) ? subloop_structures.instance_class(class_name_or_class) : class_name_or_class);
        if (methods.NIL == subloop_structures.class_p(v_class)) {
            return Values.values((SubLObject)methods.NIL, (SubLObject)methods.$kw71$TARGET_NOT_A_CLASS);
        }
        if (methods.NIL == method_name || !method_name.isSymbol()) {
            return Values.values((SubLObject)methods.NIL, (SubLObject)methods.$kw72$INVALID_METHOD_NAME);
        }
        final SubLObject method = method_assoc(method_name, subloop_structures.class_compiled_class_method_access_alist(v_class));
        if (methods.NIL == method) {
            return Values.values((SubLObject)methods.NIL, (SubLObject)methods.$kw73$UNDECLARED_METHOD);
        }
        if (methods.NIL == instances.instances_access_check_method(v_class, method)) {
            return Values.values((SubLObject)methods.NIL, (SubLObject)methods.$kw74$ACCESS_LEVEL_CONFLICT);
        }
        final SubLObject function_ref = subloop_structures.method_function_name(method);
        if (methods.NIL == Symbols.fboundp(function_ref)) {
            return Values.values((SubLObject)methods.NIL, (SubLObject)methods.$kw75$UNDEFINED_METHOD);
        }
        return Values.values(Functions.funcall(function_ref, v_class, arg0, arg1), (SubLObject)methods.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/methods.lisp", position = 25734L)
    public static SubLObject safe_funcall_class_method_with_3_args(final SubLObject class_name_or_class, final SubLObject method_name, final SubLObject arg0, final SubLObject arg1, final SubLObject arg2) {
        final SubLObject v_class = class_name_or_class.isSymbol() ? classes.classes_retrieve_class(class_name_or_class) : ((methods.NIL != subloop_structures.instance_p(class_name_or_class)) ? subloop_structures.instance_class(class_name_or_class) : class_name_or_class);
        if (methods.NIL == subloop_structures.class_p(v_class)) {
            return Values.values((SubLObject)methods.NIL, (SubLObject)methods.$kw71$TARGET_NOT_A_CLASS);
        }
        if (methods.NIL == method_name || !method_name.isSymbol()) {
            return Values.values((SubLObject)methods.NIL, (SubLObject)methods.$kw72$INVALID_METHOD_NAME);
        }
        final SubLObject method = method_assoc(method_name, subloop_structures.class_compiled_class_method_access_alist(v_class));
        if (methods.NIL == method) {
            return Values.values((SubLObject)methods.NIL, (SubLObject)methods.$kw73$UNDECLARED_METHOD);
        }
        if (methods.NIL == instances.instances_access_check_method(v_class, method)) {
            return Values.values((SubLObject)methods.NIL, (SubLObject)methods.$kw74$ACCESS_LEVEL_CONFLICT);
        }
        final SubLObject function_ref = subloop_structures.method_function_name(method);
        if (methods.NIL == Symbols.fboundp(function_ref)) {
            return Values.values((SubLObject)methods.NIL, (SubLObject)methods.$kw75$UNDEFINED_METHOD);
        }
        return Values.values(Functions.funcall(function_ref, v_class, arg0, arg1, arg2), (SubLObject)methods.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/methods.lisp", position = 25734L)
    public static SubLObject safe_funcall_class_method_with_4_args(final SubLObject class_name_or_class, final SubLObject method_name, final SubLObject arg0, final SubLObject arg1, final SubLObject arg2, final SubLObject arg3) {
        final SubLObject v_class = class_name_or_class.isSymbol() ? classes.classes_retrieve_class(class_name_or_class) : ((methods.NIL != subloop_structures.instance_p(class_name_or_class)) ? subloop_structures.instance_class(class_name_or_class) : class_name_or_class);
        if (methods.NIL == subloop_structures.class_p(v_class)) {
            return Values.values((SubLObject)methods.NIL, (SubLObject)methods.$kw71$TARGET_NOT_A_CLASS);
        }
        if (methods.NIL == method_name || !method_name.isSymbol()) {
            return Values.values((SubLObject)methods.NIL, (SubLObject)methods.$kw72$INVALID_METHOD_NAME);
        }
        final SubLObject method = method_assoc(method_name, subloop_structures.class_compiled_class_method_access_alist(v_class));
        if (methods.NIL == method) {
            return Values.values((SubLObject)methods.NIL, (SubLObject)methods.$kw73$UNDECLARED_METHOD);
        }
        if (methods.NIL == instances.instances_access_check_method(v_class, method)) {
            return Values.values((SubLObject)methods.NIL, (SubLObject)methods.$kw74$ACCESS_LEVEL_CONFLICT);
        }
        final SubLObject function_ref = subloop_structures.method_function_name(method);
        if (methods.NIL == Symbols.fboundp(function_ref)) {
            return Values.values((SubLObject)methods.NIL, (SubLObject)methods.$kw75$UNDEFINED_METHOD);
        }
        return Values.values(Functions.funcall(function_ref, v_class, arg0, arg1, arg2, arg3), (SubLObject)methods.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/methods.lisp", position = 25734L)
    public static SubLObject safe_funcall_class_method_with_5_args(final SubLObject class_name_or_class, final SubLObject method_name, final SubLObject arg0, final SubLObject arg1, final SubLObject arg2, final SubLObject arg3, final SubLObject arg4) {
        final SubLObject v_class = class_name_or_class.isSymbol() ? classes.classes_retrieve_class(class_name_or_class) : ((methods.NIL != subloop_structures.instance_p(class_name_or_class)) ? subloop_structures.instance_class(class_name_or_class) : class_name_or_class);
        if (methods.NIL == subloop_structures.class_p(v_class)) {
            return Values.values((SubLObject)methods.NIL, (SubLObject)methods.$kw71$TARGET_NOT_A_CLASS);
        }
        if (methods.NIL == method_name || !method_name.isSymbol()) {
            return Values.values((SubLObject)methods.NIL, (SubLObject)methods.$kw72$INVALID_METHOD_NAME);
        }
        final SubLObject method = method_assoc(method_name, subloop_structures.class_compiled_class_method_access_alist(v_class));
        if (methods.NIL == method) {
            return Values.values((SubLObject)methods.NIL, (SubLObject)methods.$kw73$UNDECLARED_METHOD);
        }
        if (methods.NIL == instances.instances_access_check_method(v_class, method)) {
            return Values.values((SubLObject)methods.NIL, (SubLObject)methods.$kw74$ACCESS_LEVEL_CONFLICT);
        }
        final SubLObject function_ref = subloop_structures.method_function_name(method);
        if (methods.NIL == Symbols.fboundp(function_ref)) {
            return Values.values((SubLObject)methods.NIL, (SubLObject)methods.$kw75$UNDEFINED_METHOD);
        }
        return Values.values(Functions.funcall(function_ref, v_class, arg0, arg1, arg2, arg3, arg4), (SubLObject)methods.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/methods.lisp", position = 25734L)
    public static SubLObject safe_funcall_class_method_with_6_args(final SubLObject class_name_or_class, final SubLObject method_name, final SubLObject arg0, final SubLObject arg1, final SubLObject arg2, final SubLObject arg3, final SubLObject arg4, final SubLObject arg5) {
        final SubLObject v_class = class_name_or_class.isSymbol() ? classes.classes_retrieve_class(class_name_or_class) : ((methods.NIL != subloop_structures.instance_p(class_name_or_class)) ? subloop_structures.instance_class(class_name_or_class) : class_name_or_class);
        if (methods.NIL == subloop_structures.class_p(v_class)) {
            return Values.values((SubLObject)methods.NIL, (SubLObject)methods.$kw71$TARGET_NOT_A_CLASS);
        }
        if (methods.NIL == method_name || !method_name.isSymbol()) {
            return Values.values((SubLObject)methods.NIL, (SubLObject)methods.$kw72$INVALID_METHOD_NAME);
        }
        final SubLObject method = method_assoc(method_name, subloop_structures.class_compiled_class_method_access_alist(v_class));
        if (methods.NIL == method) {
            return Values.values((SubLObject)methods.NIL, (SubLObject)methods.$kw73$UNDECLARED_METHOD);
        }
        if (methods.NIL == instances.instances_access_check_method(v_class, method)) {
            return Values.values((SubLObject)methods.NIL, (SubLObject)methods.$kw74$ACCESS_LEVEL_CONFLICT);
        }
        final SubLObject function_ref = subloop_structures.method_function_name(method);
        if (methods.NIL == Symbols.fboundp(function_ref)) {
            return Values.values((SubLObject)methods.NIL, (SubLObject)methods.$kw75$UNDEFINED_METHOD);
        }
        return Values.values(Functions.funcall(function_ref, new SubLObject[] { v_class, arg0, arg1, arg2, arg3, arg4, arg5 }), (SubLObject)methods.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/methods.lisp", position = 25734L)
    public static SubLObject safe_funcall_class_method_with_7_args(final SubLObject class_name_or_class, final SubLObject method_name, final SubLObject arg0, final SubLObject arg1, final SubLObject arg2, final SubLObject arg3, final SubLObject arg4, final SubLObject arg5, final SubLObject arg6) {
        final SubLObject v_class = class_name_or_class.isSymbol() ? classes.classes_retrieve_class(class_name_or_class) : ((methods.NIL != subloop_structures.instance_p(class_name_or_class)) ? subloop_structures.instance_class(class_name_or_class) : class_name_or_class);
        if (methods.NIL == subloop_structures.class_p(v_class)) {
            return Values.values((SubLObject)methods.NIL, (SubLObject)methods.$kw71$TARGET_NOT_A_CLASS);
        }
        if (methods.NIL == method_name || !method_name.isSymbol()) {
            return Values.values((SubLObject)methods.NIL, (SubLObject)methods.$kw72$INVALID_METHOD_NAME);
        }
        final SubLObject method = method_assoc(method_name, subloop_structures.class_compiled_class_method_access_alist(v_class));
        if (methods.NIL == method) {
            return Values.values((SubLObject)methods.NIL, (SubLObject)methods.$kw73$UNDECLARED_METHOD);
        }
        if (methods.NIL == instances.instances_access_check_method(v_class, method)) {
            return Values.values((SubLObject)methods.NIL, (SubLObject)methods.$kw74$ACCESS_LEVEL_CONFLICT);
        }
        final SubLObject function_ref = subloop_structures.method_function_name(method);
        if (methods.NIL == Symbols.fboundp(function_ref)) {
            return Values.values((SubLObject)methods.NIL, (SubLObject)methods.$kw75$UNDEFINED_METHOD);
        }
        return Values.values(Functions.funcall(function_ref, new SubLObject[] { v_class, arg0, arg1, arg2, arg3, arg4, arg5, arg6 }), (SubLObject)methods.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/methods.lisp", position = 25734L)
    public static SubLObject safe_funcall_class_method_with_8_args(final SubLObject class_name_or_class, final SubLObject method_name, final SubLObject arg0, final SubLObject arg1, final SubLObject arg2, final SubLObject arg3, final SubLObject arg4, final SubLObject arg5, final SubLObject arg6, final SubLObject arg7) {
        final SubLObject v_class = class_name_or_class.isSymbol() ? classes.classes_retrieve_class(class_name_or_class) : ((methods.NIL != subloop_structures.instance_p(class_name_or_class)) ? subloop_structures.instance_class(class_name_or_class) : class_name_or_class);
        if (methods.NIL == subloop_structures.class_p(v_class)) {
            return Values.values((SubLObject)methods.NIL, (SubLObject)methods.$kw71$TARGET_NOT_A_CLASS);
        }
        if (methods.NIL == method_name || !method_name.isSymbol()) {
            return Values.values((SubLObject)methods.NIL, (SubLObject)methods.$kw72$INVALID_METHOD_NAME);
        }
        final SubLObject method = method_assoc(method_name, subloop_structures.class_compiled_class_method_access_alist(v_class));
        if (methods.NIL == method) {
            return Values.values((SubLObject)methods.NIL, (SubLObject)methods.$kw73$UNDECLARED_METHOD);
        }
        if (methods.NIL == instances.instances_access_check_method(v_class, method)) {
            return Values.values((SubLObject)methods.NIL, (SubLObject)methods.$kw74$ACCESS_LEVEL_CONFLICT);
        }
        final SubLObject function_ref = subloop_structures.method_function_name(method);
        if (methods.NIL == Symbols.fboundp(function_ref)) {
            return Values.values((SubLObject)methods.NIL, (SubLObject)methods.$kw75$UNDEFINED_METHOD);
        }
        return Values.values(Functions.funcall(function_ref, new SubLObject[] { v_class, arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7 }), (SubLObject)methods.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/methods.lisp", position = 25734L)
    public static SubLObject safe_funcall_class_method_with_9_args(final SubLObject class_name_or_class, final SubLObject method_name, final SubLObject arg0, final SubLObject arg1, final SubLObject arg2, final SubLObject arg3, final SubLObject arg4, final SubLObject arg5, final SubLObject arg6, final SubLObject arg7, final SubLObject arg8) {
        final SubLObject v_class = class_name_or_class.isSymbol() ? classes.classes_retrieve_class(class_name_or_class) : ((methods.NIL != subloop_structures.instance_p(class_name_or_class)) ? subloop_structures.instance_class(class_name_or_class) : class_name_or_class);
        if (methods.NIL == subloop_structures.class_p(v_class)) {
            return Values.values((SubLObject)methods.NIL, (SubLObject)methods.$kw71$TARGET_NOT_A_CLASS);
        }
        if (methods.NIL == method_name || !method_name.isSymbol()) {
            return Values.values((SubLObject)methods.NIL, (SubLObject)methods.$kw72$INVALID_METHOD_NAME);
        }
        final SubLObject method = method_assoc(method_name, subloop_structures.class_compiled_class_method_access_alist(v_class));
        if (methods.NIL == method) {
            return Values.values((SubLObject)methods.NIL, (SubLObject)methods.$kw73$UNDECLARED_METHOD);
        }
        if (methods.NIL == instances.instances_access_check_method(v_class, method)) {
            return Values.values((SubLObject)methods.NIL, (SubLObject)methods.$kw74$ACCESS_LEVEL_CONFLICT);
        }
        final SubLObject function_ref = subloop_structures.method_function_name(method);
        if (methods.NIL == Symbols.fboundp(function_ref)) {
            return Values.values((SubLObject)methods.NIL, (SubLObject)methods.$kw75$UNDEFINED_METHOD);
        }
        return Values.values(Functions.funcall(function_ref, new SubLObject[] { v_class, arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8 }), (SubLObject)methods.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/methods.lisp", position = 25734L)
    public static SubLObject safe_funcall_class_method_with_10_args(final SubLObject class_name_or_class, final SubLObject method_name, final SubLObject arg0, final SubLObject arg1, final SubLObject arg2, final SubLObject arg3, final SubLObject arg4, final SubLObject arg5, final SubLObject arg6, final SubLObject arg7, final SubLObject arg8, final SubLObject arg9) {
        final SubLObject v_class = class_name_or_class.isSymbol() ? classes.classes_retrieve_class(class_name_or_class) : ((methods.NIL != subloop_structures.instance_p(class_name_or_class)) ? subloop_structures.instance_class(class_name_or_class) : class_name_or_class);
        if (methods.NIL == subloop_structures.class_p(v_class)) {
            return Values.values((SubLObject)methods.NIL, (SubLObject)methods.$kw71$TARGET_NOT_A_CLASS);
        }
        if (methods.NIL == method_name || !method_name.isSymbol()) {
            return Values.values((SubLObject)methods.NIL, (SubLObject)methods.$kw72$INVALID_METHOD_NAME);
        }
        final SubLObject method = method_assoc(method_name, subloop_structures.class_compiled_class_method_access_alist(v_class));
        if (methods.NIL == method) {
            return Values.values((SubLObject)methods.NIL, (SubLObject)methods.$kw73$UNDECLARED_METHOD);
        }
        if (methods.NIL == instances.instances_access_check_method(v_class, method)) {
            return Values.values((SubLObject)methods.NIL, (SubLObject)methods.$kw74$ACCESS_LEVEL_CONFLICT);
        }
        final SubLObject function_ref = subloop_structures.method_function_name(method);
        if (methods.NIL == Symbols.fboundp(function_ref)) {
            return Values.values((SubLObject)methods.NIL, (SubLObject)methods.$kw75$UNDEFINED_METHOD);
        }
        return Values.values(Functions.funcall(function_ref, new SubLObject[] { v_class, arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9 }), (SubLObject)methods.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/methods.lisp", position = 25734L)
    public static SubLObject safe_funcall_class_method_with_11_args(final SubLObject class_name_or_class, final SubLObject method_name, final SubLObject arg0, final SubLObject arg1, final SubLObject arg2, final SubLObject arg3, final SubLObject arg4, final SubLObject arg5, final SubLObject arg6, final SubLObject arg7, final SubLObject arg8, final SubLObject arg9, final SubLObject arg10) {
        final SubLObject v_class = class_name_or_class.isSymbol() ? classes.classes_retrieve_class(class_name_or_class) : ((methods.NIL != subloop_structures.instance_p(class_name_or_class)) ? subloop_structures.instance_class(class_name_or_class) : class_name_or_class);
        if (methods.NIL == subloop_structures.class_p(v_class)) {
            return Values.values((SubLObject)methods.NIL, (SubLObject)methods.$kw71$TARGET_NOT_A_CLASS);
        }
        if (methods.NIL == method_name || !method_name.isSymbol()) {
            return Values.values((SubLObject)methods.NIL, (SubLObject)methods.$kw72$INVALID_METHOD_NAME);
        }
        final SubLObject method = method_assoc(method_name, subloop_structures.class_compiled_class_method_access_alist(v_class));
        if (methods.NIL == method) {
            return Values.values((SubLObject)methods.NIL, (SubLObject)methods.$kw73$UNDECLARED_METHOD);
        }
        if (methods.NIL == instances.instances_access_check_method(v_class, method)) {
            return Values.values((SubLObject)methods.NIL, (SubLObject)methods.$kw74$ACCESS_LEVEL_CONFLICT);
        }
        final SubLObject function_ref = subloop_structures.method_function_name(method);
        if (methods.NIL == Symbols.fboundp(function_ref)) {
            return Values.values((SubLObject)methods.NIL, (SubLObject)methods.$kw75$UNDEFINED_METHOD);
        }
        return Values.values(Functions.funcall(function_ref, new SubLObject[] { v_class, arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10 }), (SubLObject)methods.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/methods.lisp", position = 25734L)
    public static SubLObject safe_funcall_class_method_with_12_args(final SubLObject class_name_or_class, final SubLObject method_name, final SubLObject arg0, final SubLObject arg1, final SubLObject arg2, final SubLObject arg3, final SubLObject arg4, final SubLObject arg5, final SubLObject arg6, final SubLObject arg7, final SubLObject arg8, final SubLObject arg9, final SubLObject arg10, final SubLObject arg11) {
        final SubLObject v_class = class_name_or_class.isSymbol() ? classes.classes_retrieve_class(class_name_or_class) : ((methods.NIL != subloop_structures.instance_p(class_name_or_class)) ? subloop_structures.instance_class(class_name_or_class) : class_name_or_class);
        if (methods.NIL == subloop_structures.class_p(v_class)) {
            return Values.values((SubLObject)methods.NIL, (SubLObject)methods.$kw71$TARGET_NOT_A_CLASS);
        }
        if (methods.NIL == method_name || !method_name.isSymbol()) {
            return Values.values((SubLObject)methods.NIL, (SubLObject)methods.$kw72$INVALID_METHOD_NAME);
        }
        final SubLObject method = method_assoc(method_name, subloop_structures.class_compiled_class_method_access_alist(v_class));
        if (methods.NIL == method) {
            return Values.values((SubLObject)methods.NIL, (SubLObject)methods.$kw73$UNDECLARED_METHOD);
        }
        if (methods.NIL == instances.instances_access_check_method(v_class, method)) {
            return Values.values((SubLObject)methods.NIL, (SubLObject)methods.$kw74$ACCESS_LEVEL_CONFLICT);
        }
        final SubLObject function_ref = subloop_structures.method_function_name(method);
        if (methods.NIL == Symbols.fboundp(function_ref)) {
            return Values.values((SubLObject)methods.NIL, (SubLObject)methods.$kw75$UNDEFINED_METHOD);
        }
        return Values.values(Functions.funcall(function_ref, new SubLObject[] { v_class, arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10, arg11 }), (SubLObject)methods.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/methods.lisp", position = 25734L)
    public static SubLObject safe_funcall_class_method_with_13_args(final SubLObject class_name_or_class, final SubLObject method_name, final SubLObject arg0, final SubLObject arg1, final SubLObject arg2, final SubLObject arg3, final SubLObject arg4, final SubLObject arg5, final SubLObject arg6, final SubLObject arg7, final SubLObject arg8, final SubLObject arg9, final SubLObject arg10, final SubLObject arg11, final SubLObject arg12) {
        final SubLObject v_class = class_name_or_class.isSymbol() ? classes.classes_retrieve_class(class_name_or_class) : ((methods.NIL != subloop_structures.instance_p(class_name_or_class)) ? subloop_structures.instance_class(class_name_or_class) : class_name_or_class);
        if (methods.NIL == subloop_structures.class_p(v_class)) {
            return Values.values((SubLObject)methods.NIL, (SubLObject)methods.$kw71$TARGET_NOT_A_CLASS);
        }
        if (methods.NIL == method_name || !method_name.isSymbol()) {
            return Values.values((SubLObject)methods.NIL, (SubLObject)methods.$kw72$INVALID_METHOD_NAME);
        }
        final SubLObject method = method_assoc(method_name, subloop_structures.class_compiled_class_method_access_alist(v_class));
        if (methods.NIL == method) {
            return Values.values((SubLObject)methods.NIL, (SubLObject)methods.$kw73$UNDECLARED_METHOD);
        }
        if (methods.NIL == instances.instances_access_check_method(v_class, method)) {
            return Values.values((SubLObject)methods.NIL, (SubLObject)methods.$kw74$ACCESS_LEVEL_CONFLICT);
        }
        final SubLObject function_ref = subloop_structures.method_function_name(method);
        if (methods.NIL == Symbols.fboundp(function_ref)) {
            return Values.values((SubLObject)methods.NIL, (SubLObject)methods.$kw75$UNDEFINED_METHOD);
        }
        return Values.values(Functions.funcall(function_ref, new SubLObject[] { v_class, arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10, arg11, arg12 }), (SubLObject)methods.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/methods.lisp", position = 25734L)
    public static SubLObject safe_funcall_class_method_with_14_args(final SubLObject class_name_or_class, final SubLObject method_name, final SubLObject arg0, final SubLObject arg1, final SubLObject arg2, final SubLObject arg3, final SubLObject arg4, final SubLObject arg5, final SubLObject arg6, final SubLObject arg7, final SubLObject arg8, final SubLObject arg9, final SubLObject arg10, final SubLObject arg11, final SubLObject arg12, final SubLObject arg13) {
        final SubLObject v_class = class_name_or_class.isSymbol() ? classes.classes_retrieve_class(class_name_or_class) : ((methods.NIL != subloop_structures.instance_p(class_name_or_class)) ? subloop_structures.instance_class(class_name_or_class) : class_name_or_class);
        if (methods.NIL == subloop_structures.class_p(v_class)) {
            return Values.values((SubLObject)methods.NIL, (SubLObject)methods.$kw71$TARGET_NOT_A_CLASS);
        }
        if (methods.NIL == method_name || !method_name.isSymbol()) {
            return Values.values((SubLObject)methods.NIL, (SubLObject)methods.$kw72$INVALID_METHOD_NAME);
        }
        final SubLObject method = method_assoc(method_name, subloop_structures.class_compiled_class_method_access_alist(v_class));
        if (methods.NIL == method) {
            return Values.values((SubLObject)methods.NIL, (SubLObject)methods.$kw73$UNDECLARED_METHOD);
        }
        if (methods.NIL == instances.instances_access_check_method(v_class, method)) {
            return Values.values((SubLObject)methods.NIL, (SubLObject)methods.$kw74$ACCESS_LEVEL_CONFLICT);
        }
        final SubLObject function_ref = subloop_structures.method_function_name(method);
        if (methods.NIL == Symbols.fboundp(function_ref)) {
            return Values.values((SubLObject)methods.NIL, (SubLObject)methods.$kw75$UNDEFINED_METHOD);
        }
        return Values.values(Functions.funcall(function_ref, new SubLObject[] { v_class, arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10, arg11, arg12, arg13 }), (SubLObject)methods.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/methods.lisp", position = 25734L)
    public static SubLObject safe_funcall_class_method_with_15_args(final SubLObject class_name_or_class, final SubLObject method_name, final SubLObject arg0, final SubLObject arg1, final SubLObject arg2, final SubLObject arg3, final SubLObject arg4, final SubLObject arg5, final SubLObject arg6, final SubLObject arg7, final SubLObject arg8, final SubLObject arg9, final SubLObject arg10, final SubLObject arg11, final SubLObject arg12, final SubLObject arg13, final SubLObject arg14) {
        final SubLObject v_class = class_name_or_class.isSymbol() ? classes.classes_retrieve_class(class_name_or_class) : ((methods.NIL != subloop_structures.instance_p(class_name_or_class)) ? subloop_structures.instance_class(class_name_or_class) : class_name_or_class);
        if (methods.NIL == subloop_structures.class_p(v_class)) {
            return Values.values((SubLObject)methods.NIL, (SubLObject)methods.$kw71$TARGET_NOT_A_CLASS);
        }
        if (methods.NIL == method_name || !method_name.isSymbol()) {
            return Values.values((SubLObject)methods.NIL, (SubLObject)methods.$kw72$INVALID_METHOD_NAME);
        }
        final SubLObject method = method_assoc(method_name, subloop_structures.class_compiled_class_method_access_alist(v_class));
        if (methods.NIL == method) {
            return Values.values((SubLObject)methods.NIL, (SubLObject)methods.$kw73$UNDECLARED_METHOD);
        }
        if (methods.NIL == instances.instances_access_check_method(v_class, method)) {
            return Values.values((SubLObject)methods.NIL, (SubLObject)methods.$kw74$ACCESS_LEVEL_CONFLICT);
        }
        final SubLObject function_ref = subloop_structures.method_function_name(method);
        if (methods.NIL == Symbols.fboundp(function_ref)) {
            return Values.values((SubLObject)methods.NIL, (SubLObject)methods.$kw75$UNDEFINED_METHOD);
        }
        return Values.values(Functions.funcall(function_ref, new SubLObject[] { v_class, arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10, arg11, arg12, arg13, arg14 }), (SubLObject)methods.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/methods.lisp", position = 25734L)
    public static SubLObject safe_funcall_class_method_with_16_args(final SubLObject class_name_or_class, final SubLObject method_name, final SubLObject arg0, final SubLObject arg1, final SubLObject arg2, final SubLObject arg3, final SubLObject arg4, final SubLObject arg5, final SubLObject arg6, final SubLObject arg7, final SubLObject arg8, final SubLObject arg9, final SubLObject arg10, final SubLObject arg11, final SubLObject arg12, final SubLObject arg13, final SubLObject arg14, final SubLObject arg15) {
        final SubLObject v_class = class_name_or_class.isSymbol() ? classes.classes_retrieve_class(class_name_or_class) : ((methods.NIL != subloop_structures.instance_p(class_name_or_class)) ? subloop_structures.instance_class(class_name_or_class) : class_name_or_class);
        if (methods.NIL == subloop_structures.class_p(v_class)) {
            return Values.values((SubLObject)methods.NIL, (SubLObject)methods.$kw71$TARGET_NOT_A_CLASS);
        }
        if (methods.NIL == method_name || !method_name.isSymbol()) {
            return Values.values((SubLObject)methods.NIL, (SubLObject)methods.$kw72$INVALID_METHOD_NAME);
        }
        final SubLObject method = method_assoc(method_name, subloop_structures.class_compiled_class_method_access_alist(v_class));
        if (methods.NIL == method) {
            return Values.values((SubLObject)methods.NIL, (SubLObject)methods.$kw73$UNDECLARED_METHOD);
        }
        if (methods.NIL == instances.instances_access_check_method(v_class, method)) {
            return Values.values((SubLObject)methods.NIL, (SubLObject)methods.$kw74$ACCESS_LEVEL_CONFLICT);
        }
        final SubLObject function_ref = subloop_structures.method_function_name(method);
        if (methods.NIL == Symbols.fboundp(function_ref)) {
            return Values.values((SubLObject)methods.NIL, (SubLObject)methods.$kw75$UNDEFINED_METHOD);
        }
        return Values.values(Functions.funcall(function_ref, new SubLObject[] { v_class, arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10, arg11, arg12, arg13, arg14, arg15 }), (SubLObject)methods.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/methods.lisp", position = 25734L)
    public static SubLObject safe_funcall_class_method_with_17_args(final SubLObject class_name_or_class, final SubLObject method_name, final SubLObject arg0, final SubLObject arg1, final SubLObject arg2, final SubLObject arg3, final SubLObject arg4, final SubLObject arg5, final SubLObject arg6, final SubLObject arg7, final SubLObject arg8, final SubLObject arg9, final SubLObject arg10, final SubLObject arg11, final SubLObject arg12, final SubLObject arg13, final SubLObject arg14, final SubLObject arg15, final SubLObject arg16) {
        final SubLObject v_class = class_name_or_class.isSymbol() ? classes.classes_retrieve_class(class_name_or_class) : ((methods.NIL != subloop_structures.instance_p(class_name_or_class)) ? subloop_structures.instance_class(class_name_or_class) : class_name_or_class);
        if (methods.NIL == subloop_structures.class_p(v_class)) {
            return Values.values((SubLObject)methods.NIL, (SubLObject)methods.$kw71$TARGET_NOT_A_CLASS);
        }
        if (methods.NIL == method_name || !method_name.isSymbol()) {
            return Values.values((SubLObject)methods.NIL, (SubLObject)methods.$kw72$INVALID_METHOD_NAME);
        }
        final SubLObject method = method_assoc(method_name, subloop_structures.class_compiled_class_method_access_alist(v_class));
        if (methods.NIL == method) {
            return Values.values((SubLObject)methods.NIL, (SubLObject)methods.$kw73$UNDECLARED_METHOD);
        }
        if (methods.NIL == instances.instances_access_check_method(v_class, method)) {
            return Values.values((SubLObject)methods.NIL, (SubLObject)methods.$kw74$ACCESS_LEVEL_CONFLICT);
        }
        final SubLObject function_ref = subloop_structures.method_function_name(method);
        if (methods.NIL == Symbols.fboundp(function_ref)) {
            return Values.values((SubLObject)methods.NIL, (SubLObject)methods.$kw75$UNDEFINED_METHOD);
        }
        return Values.values(Functions.funcall(function_ref, new SubLObject[] { v_class, arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10, arg11, arg12, arg13, arg14, arg15, arg16 }), (SubLObject)methods.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/methods.lisp", position = 25734L)
    public static SubLObject safe_funcall_class_method_with_18_args(final SubLObject class_name_or_class, final SubLObject method_name, final SubLObject arg0, final SubLObject arg1, final SubLObject arg2, final SubLObject arg3, final SubLObject arg4, final SubLObject arg5, final SubLObject arg6, final SubLObject arg7, final SubLObject arg8, final SubLObject arg9, final SubLObject arg10, final SubLObject arg11, final SubLObject arg12, final SubLObject arg13, final SubLObject arg14, final SubLObject arg15, final SubLObject arg16, final SubLObject arg17) {
        final SubLObject v_class = class_name_or_class.isSymbol() ? classes.classes_retrieve_class(class_name_or_class) : ((methods.NIL != subloop_structures.instance_p(class_name_or_class)) ? subloop_structures.instance_class(class_name_or_class) : class_name_or_class);
        if (methods.NIL == subloop_structures.class_p(v_class)) {
            return Values.values((SubLObject)methods.NIL, (SubLObject)methods.$kw71$TARGET_NOT_A_CLASS);
        }
        if (methods.NIL == method_name || !method_name.isSymbol()) {
            return Values.values((SubLObject)methods.NIL, (SubLObject)methods.$kw72$INVALID_METHOD_NAME);
        }
        final SubLObject method = method_assoc(method_name, subloop_structures.class_compiled_class_method_access_alist(v_class));
        if (methods.NIL == method) {
            return Values.values((SubLObject)methods.NIL, (SubLObject)methods.$kw73$UNDECLARED_METHOD);
        }
        if (methods.NIL == instances.instances_access_check_method(v_class, method)) {
            return Values.values((SubLObject)methods.NIL, (SubLObject)methods.$kw74$ACCESS_LEVEL_CONFLICT);
        }
        final SubLObject function_ref = subloop_structures.method_function_name(method);
        if (methods.NIL == Symbols.fboundp(function_ref)) {
            return Values.values((SubLObject)methods.NIL, (SubLObject)methods.$kw75$UNDEFINED_METHOD);
        }
        return Values.values(Functions.funcall(function_ref, new SubLObject[] { v_class, arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10, arg11, arg12, arg13, arg14, arg15, arg16, arg17 }), (SubLObject)methods.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/methods.lisp", position = 25734L)
    public static SubLObject safe_funcall_class_method_with_19_args(final SubLObject class_name_or_class, final SubLObject method_name, final SubLObject arg0, final SubLObject arg1, final SubLObject arg2, final SubLObject arg3, final SubLObject arg4, final SubLObject arg5, final SubLObject arg6, final SubLObject arg7, final SubLObject arg8, final SubLObject arg9, final SubLObject arg10, final SubLObject arg11, final SubLObject arg12, final SubLObject arg13, final SubLObject arg14, final SubLObject arg15, final SubLObject arg16, final SubLObject arg17, final SubLObject arg18) {
        final SubLObject v_class = class_name_or_class.isSymbol() ? classes.classes_retrieve_class(class_name_or_class) : ((methods.NIL != subloop_structures.instance_p(class_name_or_class)) ? subloop_structures.instance_class(class_name_or_class) : class_name_or_class);
        if (methods.NIL == subloop_structures.class_p(v_class)) {
            return Values.values((SubLObject)methods.NIL, (SubLObject)methods.$kw71$TARGET_NOT_A_CLASS);
        }
        if (methods.NIL == method_name || !method_name.isSymbol()) {
            return Values.values((SubLObject)methods.NIL, (SubLObject)methods.$kw72$INVALID_METHOD_NAME);
        }
        final SubLObject method = method_assoc(method_name, subloop_structures.class_compiled_class_method_access_alist(v_class));
        if (methods.NIL == method) {
            return Values.values((SubLObject)methods.NIL, (SubLObject)methods.$kw73$UNDECLARED_METHOD);
        }
        if (methods.NIL == instances.instances_access_check_method(v_class, method)) {
            return Values.values((SubLObject)methods.NIL, (SubLObject)methods.$kw74$ACCESS_LEVEL_CONFLICT);
        }
        final SubLObject function_ref = subloop_structures.method_function_name(method);
        if (methods.NIL == Symbols.fboundp(function_ref)) {
            return Values.values((SubLObject)methods.NIL, (SubLObject)methods.$kw75$UNDEFINED_METHOD);
        }
        return Values.values(Functions.funcall(function_ref, new SubLObject[] { v_class, arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10, arg11, arg12, arg13, arg14, arg15, arg16, arg17, arg18 }), (SubLObject)methods.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/methods.lisp", position = 25734L)
    public static SubLObject safe_funcall_class_method_with_20_args(final SubLObject class_name_or_class, final SubLObject method_name, final SubLObject arg0, final SubLObject arg1, final SubLObject arg2, final SubLObject arg3, final SubLObject arg4, final SubLObject arg5, final SubLObject arg6, final SubLObject arg7, final SubLObject arg8, final SubLObject arg9, final SubLObject arg10, final SubLObject arg11, final SubLObject arg12, final SubLObject arg13, final SubLObject arg14, final SubLObject arg15, final SubLObject arg16, final SubLObject arg17, final SubLObject arg18, final SubLObject arg19) {
        final SubLObject v_class = class_name_or_class.isSymbol() ? classes.classes_retrieve_class(class_name_or_class) : ((methods.NIL != subloop_structures.instance_p(class_name_or_class)) ? subloop_structures.instance_class(class_name_or_class) : class_name_or_class);
        if (methods.NIL == subloop_structures.class_p(v_class)) {
            return Values.values((SubLObject)methods.NIL, (SubLObject)methods.$kw71$TARGET_NOT_A_CLASS);
        }
        if (methods.NIL == method_name || !method_name.isSymbol()) {
            return Values.values((SubLObject)methods.NIL, (SubLObject)methods.$kw72$INVALID_METHOD_NAME);
        }
        final SubLObject method = method_assoc(method_name, subloop_structures.class_compiled_class_method_access_alist(v_class));
        if (methods.NIL == method) {
            return Values.values((SubLObject)methods.NIL, (SubLObject)methods.$kw73$UNDECLARED_METHOD);
        }
        if (methods.NIL == instances.instances_access_check_method(v_class, method)) {
            return Values.values((SubLObject)methods.NIL, (SubLObject)methods.$kw74$ACCESS_LEVEL_CONFLICT);
        }
        final SubLObject function_ref = subloop_structures.method_function_name(method);
        if (methods.NIL == Symbols.fboundp(function_ref)) {
            return Values.values((SubLObject)methods.NIL, (SubLObject)methods.$kw75$UNDEFINED_METHOD);
        }
        return Values.values(Functions.funcall(function_ref, new SubLObject[] { v_class, arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10, arg11, arg12, arg13, arg14, arg15, arg16, arg17, arg18, arg19 }), (SubLObject)methods.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/methods.lisp", position = 26431L)
    public static SubLObject safe_funcall_class_super_method_with_0_args(final SubLObject class_name_or_class, final SubLObject method_name) {
        final SubLObject v_class = class_name_or_class.isSymbol() ? classes.classes_retrieve_class(class_name_or_class) : ((methods.NIL != subloop_structures.instance_p(class_name_or_class)) ? subloop_structures.instance_class(class_name_or_class) : class_name_or_class);
        if (methods.NIL == subloop_structures.class_p(v_class)) {
            return Values.values((SubLObject)methods.NIL, (SubLObject)methods.$kw71$TARGET_NOT_A_CLASS);
        }
        if (methods.NIL == method_name || !method_name.isSymbol()) {
            return Values.values((SubLObject)methods.NIL, (SubLObject)methods.$kw72$INVALID_METHOD_NAME);
        }
        final SubLObject method = method_shadowed_assoc(method_name, subloop_structures.class_compiled_class_method_access_alist(v_class));
        if (methods.NIL == method) {
            return Values.values((SubLObject)methods.NIL, (SubLObject)methods.$kw73$UNDECLARED_METHOD);
        }
        if (methods.NIL == instances.instances_access_check_method(v_class, method)) {
            return Values.values((SubLObject)methods.NIL, (SubLObject)methods.$kw74$ACCESS_LEVEL_CONFLICT);
        }
        final SubLObject function_ref = subloop_structures.method_function_name(method);
        if (methods.NIL == Symbols.fboundp(function_ref)) {
            return Values.values((SubLObject)methods.NIL, (SubLObject)methods.$kw75$UNDEFINED_METHOD);
        }
        return Values.values(Functions.funcall(function_ref, v_class), (SubLObject)methods.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/methods.lisp", position = 26431L)
    public static SubLObject safe_funcall_class_super_method_with_1_args(final SubLObject class_name_or_class, final SubLObject method_name, final SubLObject arg0) {
        final SubLObject v_class = class_name_or_class.isSymbol() ? classes.classes_retrieve_class(class_name_or_class) : ((methods.NIL != subloop_structures.instance_p(class_name_or_class)) ? subloop_structures.instance_class(class_name_or_class) : class_name_or_class);
        if (methods.NIL == subloop_structures.class_p(v_class)) {
            return Values.values((SubLObject)methods.NIL, (SubLObject)methods.$kw71$TARGET_NOT_A_CLASS);
        }
        if (methods.NIL == method_name || !method_name.isSymbol()) {
            return Values.values((SubLObject)methods.NIL, (SubLObject)methods.$kw72$INVALID_METHOD_NAME);
        }
        final SubLObject method = method_shadowed_assoc(method_name, subloop_structures.class_compiled_class_method_access_alist(v_class));
        if (methods.NIL == method) {
            return Values.values((SubLObject)methods.NIL, (SubLObject)methods.$kw73$UNDECLARED_METHOD);
        }
        if (methods.NIL == instances.instances_access_check_method(v_class, method)) {
            return Values.values((SubLObject)methods.NIL, (SubLObject)methods.$kw74$ACCESS_LEVEL_CONFLICT);
        }
        final SubLObject function_ref = subloop_structures.method_function_name(method);
        if (methods.NIL == Symbols.fboundp(function_ref)) {
            return Values.values((SubLObject)methods.NIL, (SubLObject)methods.$kw75$UNDEFINED_METHOD);
        }
        return Values.values(Functions.funcall(function_ref, v_class, arg0), (SubLObject)methods.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/methods.lisp", position = 26431L)
    public static SubLObject safe_funcall_class_super_method_with_2_args(final SubLObject class_name_or_class, final SubLObject method_name, final SubLObject arg0, final SubLObject arg1) {
        final SubLObject v_class = class_name_or_class.isSymbol() ? classes.classes_retrieve_class(class_name_or_class) : ((methods.NIL != subloop_structures.instance_p(class_name_or_class)) ? subloop_structures.instance_class(class_name_or_class) : class_name_or_class);
        if (methods.NIL == subloop_structures.class_p(v_class)) {
            return Values.values((SubLObject)methods.NIL, (SubLObject)methods.$kw71$TARGET_NOT_A_CLASS);
        }
        if (methods.NIL == method_name || !method_name.isSymbol()) {
            return Values.values((SubLObject)methods.NIL, (SubLObject)methods.$kw72$INVALID_METHOD_NAME);
        }
        final SubLObject method = method_shadowed_assoc(method_name, subloop_structures.class_compiled_class_method_access_alist(v_class));
        if (methods.NIL == method) {
            return Values.values((SubLObject)methods.NIL, (SubLObject)methods.$kw73$UNDECLARED_METHOD);
        }
        if (methods.NIL == instances.instances_access_check_method(v_class, method)) {
            return Values.values((SubLObject)methods.NIL, (SubLObject)methods.$kw74$ACCESS_LEVEL_CONFLICT);
        }
        final SubLObject function_ref = subloop_structures.method_function_name(method);
        if (methods.NIL == Symbols.fboundp(function_ref)) {
            return Values.values((SubLObject)methods.NIL, (SubLObject)methods.$kw75$UNDEFINED_METHOD);
        }
        return Values.values(Functions.funcall(function_ref, v_class, arg0, arg1), (SubLObject)methods.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/methods.lisp", position = 26431L)
    public static SubLObject safe_funcall_class_super_method_with_3_args(final SubLObject class_name_or_class, final SubLObject method_name, final SubLObject arg0, final SubLObject arg1, final SubLObject arg2) {
        final SubLObject v_class = class_name_or_class.isSymbol() ? classes.classes_retrieve_class(class_name_or_class) : ((methods.NIL != subloop_structures.instance_p(class_name_or_class)) ? subloop_structures.instance_class(class_name_or_class) : class_name_or_class);
        if (methods.NIL == subloop_structures.class_p(v_class)) {
            return Values.values((SubLObject)methods.NIL, (SubLObject)methods.$kw71$TARGET_NOT_A_CLASS);
        }
        if (methods.NIL == method_name || !method_name.isSymbol()) {
            return Values.values((SubLObject)methods.NIL, (SubLObject)methods.$kw72$INVALID_METHOD_NAME);
        }
        final SubLObject method = method_shadowed_assoc(method_name, subloop_structures.class_compiled_class_method_access_alist(v_class));
        if (methods.NIL == method) {
            return Values.values((SubLObject)methods.NIL, (SubLObject)methods.$kw73$UNDECLARED_METHOD);
        }
        if (methods.NIL == instances.instances_access_check_method(v_class, method)) {
            return Values.values((SubLObject)methods.NIL, (SubLObject)methods.$kw74$ACCESS_LEVEL_CONFLICT);
        }
        final SubLObject function_ref = subloop_structures.method_function_name(method);
        if (methods.NIL == Symbols.fboundp(function_ref)) {
            return Values.values((SubLObject)methods.NIL, (SubLObject)methods.$kw75$UNDEFINED_METHOD);
        }
        return Values.values(Functions.funcall(function_ref, v_class, arg0, arg1, arg2), (SubLObject)methods.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/methods.lisp", position = 26431L)
    public static SubLObject safe_funcall_class_super_method_with_4_args(final SubLObject class_name_or_class, final SubLObject method_name, final SubLObject arg0, final SubLObject arg1, final SubLObject arg2, final SubLObject arg3) {
        final SubLObject v_class = class_name_or_class.isSymbol() ? classes.classes_retrieve_class(class_name_or_class) : ((methods.NIL != subloop_structures.instance_p(class_name_or_class)) ? subloop_structures.instance_class(class_name_or_class) : class_name_or_class);
        if (methods.NIL == subloop_structures.class_p(v_class)) {
            return Values.values((SubLObject)methods.NIL, (SubLObject)methods.$kw71$TARGET_NOT_A_CLASS);
        }
        if (methods.NIL == method_name || !method_name.isSymbol()) {
            return Values.values((SubLObject)methods.NIL, (SubLObject)methods.$kw72$INVALID_METHOD_NAME);
        }
        final SubLObject method = method_shadowed_assoc(method_name, subloop_structures.class_compiled_class_method_access_alist(v_class));
        if (methods.NIL == method) {
            return Values.values((SubLObject)methods.NIL, (SubLObject)methods.$kw73$UNDECLARED_METHOD);
        }
        if (methods.NIL == instances.instances_access_check_method(v_class, method)) {
            return Values.values((SubLObject)methods.NIL, (SubLObject)methods.$kw74$ACCESS_LEVEL_CONFLICT);
        }
        final SubLObject function_ref = subloop_structures.method_function_name(method);
        if (methods.NIL == Symbols.fboundp(function_ref)) {
            return Values.values((SubLObject)methods.NIL, (SubLObject)methods.$kw75$UNDEFINED_METHOD);
        }
        return Values.values(Functions.funcall(function_ref, v_class, arg0, arg1, arg2, arg3), (SubLObject)methods.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/methods.lisp", position = 26431L)
    public static SubLObject safe_funcall_class_super_method_with_5_args(final SubLObject class_name_or_class, final SubLObject method_name, final SubLObject arg0, final SubLObject arg1, final SubLObject arg2, final SubLObject arg3, final SubLObject arg4) {
        final SubLObject v_class = class_name_or_class.isSymbol() ? classes.classes_retrieve_class(class_name_or_class) : ((methods.NIL != subloop_structures.instance_p(class_name_or_class)) ? subloop_structures.instance_class(class_name_or_class) : class_name_or_class);
        if (methods.NIL == subloop_structures.class_p(v_class)) {
            return Values.values((SubLObject)methods.NIL, (SubLObject)methods.$kw71$TARGET_NOT_A_CLASS);
        }
        if (methods.NIL == method_name || !method_name.isSymbol()) {
            return Values.values((SubLObject)methods.NIL, (SubLObject)methods.$kw72$INVALID_METHOD_NAME);
        }
        final SubLObject method = method_shadowed_assoc(method_name, subloop_structures.class_compiled_class_method_access_alist(v_class));
        if (methods.NIL == method) {
            return Values.values((SubLObject)methods.NIL, (SubLObject)methods.$kw73$UNDECLARED_METHOD);
        }
        if (methods.NIL == instances.instances_access_check_method(v_class, method)) {
            return Values.values((SubLObject)methods.NIL, (SubLObject)methods.$kw74$ACCESS_LEVEL_CONFLICT);
        }
        final SubLObject function_ref = subloop_structures.method_function_name(method);
        if (methods.NIL == Symbols.fboundp(function_ref)) {
            return Values.values((SubLObject)methods.NIL, (SubLObject)methods.$kw75$UNDEFINED_METHOD);
        }
        return Values.values(Functions.funcall(function_ref, v_class, arg0, arg1, arg2, arg3, arg4), (SubLObject)methods.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/methods.lisp", position = 26431L)
    public static SubLObject safe_funcall_class_super_method_with_6_args(final SubLObject class_name_or_class, final SubLObject method_name, final SubLObject arg0, final SubLObject arg1, final SubLObject arg2, final SubLObject arg3, final SubLObject arg4, final SubLObject arg5) {
        final SubLObject v_class = class_name_or_class.isSymbol() ? classes.classes_retrieve_class(class_name_or_class) : ((methods.NIL != subloop_structures.instance_p(class_name_or_class)) ? subloop_structures.instance_class(class_name_or_class) : class_name_or_class);
        if (methods.NIL == subloop_structures.class_p(v_class)) {
            return Values.values((SubLObject)methods.NIL, (SubLObject)methods.$kw71$TARGET_NOT_A_CLASS);
        }
        if (methods.NIL == method_name || !method_name.isSymbol()) {
            return Values.values((SubLObject)methods.NIL, (SubLObject)methods.$kw72$INVALID_METHOD_NAME);
        }
        final SubLObject method = method_shadowed_assoc(method_name, subloop_structures.class_compiled_class_method_access_alist(v_class));
        if (methods.NIL == method) {
            return Values.values((SubLObject)methods.NIL, (SubLObject)methods.$kw73$UNDECLARED_METHOD);
        }
        if (methods.NIL == instances.instances_access_check_method(v_class, method)) {
            return Values.values((SubLObject)methods.NIL, (SubLObject)methods.$kw74$ACCESS_LEVEL_CONFLICT);
        }
        final SubLObject function_ref = subloop_structures.method_function_name(method);
        if (methods.NIL == Symbols.fboundp(function_ref)) {
            return Values.values((SubLObject)methods.NIL, (SubLObject)methods.$kw75$UNDEFINED_METHOD);
        }
        return Values.values(Functions.funcall(function_ref, new SubLObject[] { v_class, arg0, arg1, arg2, arg3, arg4, arg5 }), (SubLObject)methods.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/methods.lisp", position = 26431L)
    public static SubLObject safe_funcall_class_super_method_with_7_args(final SubLObject class_name_or_class, final SubLObject method_name, final SubLObject arg0, final SubLObject arg1, final SubLObject arg2, final SubLObject arg3, final SubLObject arg4, final SubLObject arg5, final SubLObject arg6) {
        final SubLObject v_class = class_name_or_class.isSymbol() ? classes.classes_retrieve_class(class_name_or_class) : ((methods.NIL != subloop_structures.instance_p(class_name_or_class)) ? subloop_structures.instance_class(class_name_or_class) : class_name_or_class);
        if (methods.NIL == subloop_structures.class_p(v_class)) {
            return Values.values((SubLObject)methods.NIL, (SubLObject)methods.$kw71$TARGET_NOT_A_CLASS);
        }
        if (methods.NIL == method_name || !method_name.isSymbol()) {
            return Values.values((SubLObject)methods.NIL, (SubLObject)methods.$kw72$INVALID_METHOD_NAME);
        }
        final SubLObject method = method_shadowed_assoc(method_name, subloop_structures.class_compiled_class_method_access_alist(v_class));
        if (methods.NIL == method) {
            return Values.values((SubLObject)methods.NIL, (SubLObject)methods.$kw73$UNDECLARED_METHOD);
        }
        if (methods.NIL == instances.instances_access_check_method(v_class, method)) {
            return Values.values((SubLObject)methods.NIL, (SubLObject)methods.$kw74$ACCESS_LEVEL_CONFLICT);
        }
        final SubLObject function_ref = subloop_structures.method_function_name(method);
        if (methods.NIL == Symbols.fboundp(function_ref)) {
            return Values.values((SubLObject)methods.NIL, (SubLObject)methods.$kw75$UNDEFINED_METHOD);
        }
        return Values.values(Functions.funcall(function_ref, new SubLObject[] { v_class, arg0, arg1, arg2, arg3, arg4, arg5, arg6 }), (SubLObject)methods.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/methods.lisp", position = 26431L)
    public static SubLObject safe_funcall_class_super_method_with_8_args(final SubLObject class_name_or_class, final SubLObject method_name, final SubLObject arg0, final SubLObject arg1, final SubLObject arg2, final SubLObject arg3, final SubLObject arg4, final SubLObject arg5, final SubLObject arg6, final SubLObject arg7) {
        final SubLObject v_class = class_name_or_class.isSymbol() ? classes.classes_retrieve_class(class_name_or_class) : ((methods.NIL != subloop_structures.instance_p(class_name_or_class)) ? subloop_structures.instance_class(class_name_or_class) : class_name_or_class);
        if (methods.NIL == subloop_structures.class_p(v_class)) {
            return Values.values((SubLObject)methods.NIL, (SubLObject)methods.$kw71$TARGET_NOT_A_CLASS);
        }
        if (methods.NIL == method_name || !method_name.isSymbol()) {
            return Values.values((SubLObject)methods.NIL, (SubLObject)methods.$kw72$INVALID_METHOD_NAME);
        }
        final SubLObject method = method_shadowed_assoc(method_name, subloop_structures.class_compiled_class_method_access_alist(v_class));
        if (methods.NIL == method) {
            return Values.values((SubLObject)methods.NIL, (SubLObject)methods.$kw73$UNDECLARED_METHOD);
        }
        if (methods.NIL == instances.instances_access_check_method(v_class, method)) {
            return Values.values((SubLObject)methods.NIL, (SubLObject)methods.$kw74$ACCESS_LEVEL_CONFLICT);
        }
        final SubLObject function_ref = subloop_structures.method_function_name(method);
        if (methods.NIL == Symbols.fboundp(function_ref)) {
            return Values.values((SubLObject)methods.NIL, (SubLObject)methods.$kw75$UNDEFINED_METHOD);
        }
        return Values.values(Functions.funcall(function_ref, new SubLObject[] { v_class, arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7 }), (SubLObject)methods.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/methods.lisp", position = 26431L)
    public static SubLObject safe_funcall_class_super_method_with_9_args(final SubLObject class_name_or_class, final SubLObject method_name, final SubLObject arg0, final SubLObject arg1, final SubLObject arg2, final SubLObject arg3, final SubLObject arg4, final SubLObject arg5, final SubLObject arg6, final SubLObject arg7, final SubLObject arg8) {
        final SubLObject v_class = class_name_or_class.isSymbol() ? classes.classes_retrieve_class(class_name_or_class) : ((methods.NIL != subloop_structures.instance_p(class_name_or_class)) ? subloop_structures.instance_class(class_name_or_class) : class_name_or_class);
        if (methods.NIL == subloop_structures.class_p(v_class)) {
            return Values.values((SubLObject)methods.NIL, (SubLObject)methods.$kw71$TARGET_NOT_A_CLASS);
        }
        if (methods.NIL == method_name || !method_name.isSymbol()) {
            return Values.values((SubLObject)methods.NIL, (SubLObject)methods.$kw72$INVALID_METHOD_NAME);
        }
        final SubLObject method = method_shadowed_assoc(method_name, subloop_structures.class_compiled_class_method_access_alist(v_class));
        if (methods.NIL == method) {
            return Values.values((SubLObject)methods.NIL, (SubLObject)methods.$kw73$UNDECLARED_METHOD);
        }
        if (methods.NIL == instances.instances_access_check_method(v_class, method)) {
            return Values.values((SubLObject)methods.NIL, (SubLObject)methods.$kw74$ACCESS_LEVEL_CONFLICT);
        }
        final SubLObject function_ref = subloop_structures.method_function_name(method);
        if (methods.NIL == Symbols.fboundp(function_ref)) {
            return Values.values((SubLObject)methods.NIL, (SubLObject)methods.$kw75$UNDEFINED_METHOD);
        }
        return Values.values(Functions.funcall(function_ref, new SubLObject[] { v_class, arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8 }), (SubLObject)methods.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/methods.lisp", position = 26431L)
    public static SubLObject safe_funcall_class_super_method_with_10_args(final SubLObject class_name_or_class, final SubLObject method_name, final SubLObject arg0, final SubLObject arg1, final SubLObject arg2, final SubLObject arg3, final SubLObject arg4, final SubLObject arg5, final SubLObject arg6, final SubLObject arg7, final SubLObject arg8, final SubLObject arg9) {
        final SubLObject v_class = class_name_or_class.isSymbol() ? classes.classes_retrieve_class(class_name_or_class) : ((methods.NIL != subloop_structures.instance_p(class_name_or_class)) ? subloop_structures.instance_class(class_name_or_class) : class_name_or_class);
        if (methods.NIL == subloop_structures.class_p(v_class)) {
            return Values.values((SubLObject)methods.NIL, (SubLObject)methods.$kw71$TARGET_NOT_A_CLASS);
        }
        if (methods.NIL == method_name || !method_name.isSymbol()) {
            return Values.values((SubLObject)methods.NIL, (SubLObject)methods.$kw72$INVALID_METHOD_NAME);
        }
        final SubLObject method = method_shadowed_assoc(method_name, subloop_structures.class_compiled_class_method_access_alist(v_class));
        if (methods.NIL == method) {
            return Values.values((SubLObject)methods.NIL, (SubLObject)methods.$kw73$UNDECLARED_METHOD);
        }
        if (methods.NIL == instances.instances_access_check_method(v_class, method)) {
            return Values.values((SubLObject)methods.NIL, (SubLObject)methods.$kw74$ACCESS_LEVEL_CONFLICT);
        }
        final SubLObject function_ref = subloop_structures.method_function_name(method);
        if (methods.NIL == Symbols.fboundp(function_ref)) {
            return Values.values((SubLObject)methods.NIL, (SubLObject)methods.$kw75$UNDEFINED_METHOD);
        }
        return Values.values(Functions.funcall(function_ref, new SubLObject[] { v_class, arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9 }), (SubLObject)methods.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/methods.lisp", position = 26431L)
    public static SubLObject safe_funcall_class_super_method_with_11_args(final SubLObject class_name_or_class, final SubLObject method_name, final SubLObject arg0, final SubLObject arg1, final SubLObject arg2, final SubLObject arg3, final SubLObject arg4, final SubLObject arg5, final SubLObject arg6, final SubLObject arg7, final SubLObject arg8, final SubLObject arg9, final SubLObject arg10) {
        final SubLObject v_class = class_name_or_class.isSymbol() ? classes.classes_retrieve_class(class_name_or_class) : ((methods.NIL != subloop_structures.instance_p(class_name_or_class)) ? subloop_structures.instance_class(class_name_or_class) : class_name_or_class);
        if (methods.NIL == subloop_structures.class_p(v_class)) {
            return Values.values((SubLObject)methods.NIL, (SubLObject)methods.$kw71$TARGET_NOT_A_CLASS);
        }
        if (methods.NIL == method_name || !method_name.isSymbol()) {
            return Values.values((SubLObject)methods.NIL, (SubLObject)methods.$kw72$INVALID_METHOD_NAME);
        }
        final SubLObject method = method_shadowed_assoc(method_name, subloop_structures.class_compiled_class_method_access_alist(v_class));
        if (methods.NIL == method) {
            return Values.values((SubLObject)methods.NIL, (SubLObject)methods.$kw73$UNDECLARED_METHOD);
        }
        if (methods.NIL == instances.instances_access_check_method(v_class, method)) {
            return Values.values((SubLObject)methods.NIL, (SubLObject)methods.$kw74$ACCESS_LEVEL_CONFLICT);
        }
        final SubLObject function_ref = subloop_structures.method_function_name(method);
        if (methods.NIL == Symbols.fboundp(function_ref)) {
            return Values.values((SubLObject)methods.NIL, (SubLObject)methods.$kw75$UNDEFINED_METHOD);
        }
        return Values.values(Functions.funcall(function_ref, new SubLObject[] { v_class, arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10 }), (SubLObject)methods.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/methods.lisp", position = 26431L)
    public static SubLObject safe_funcall_class_super_method_with_12_args(final SubLObject class_name_or_class, final SubLObject method_name, final SubLObject arg0, final SubLObject arg1, final SubLObject arg2, final SubLObject arg3, final SubLObject arg4, final SubLObject arg5, final SubLObject arg6, final SubLObject arg7, final SubLObject arg8, final SubLObject arg9, final SubLObject arg10, final SubLObject arg11) {
        final SubLObject v_class = class_name_or_class.isSymbol() ? classes.classes_retrieve_class(class_name_or_class) : ((methods.NIL != subloop_structures.instance_p(class_name_or_class)) ? subloop_structures.instance_class(class_name_or_class) : class_name_or_class);
        if (methods.NIL == subloop_structures.class_p(v_class)) {
            return Values.values((SubLObject)methods.NIL, (SubLObject)methods.$kw71$TARGET_NOT_A_CLASS);
        }
        if (methods.NIL == method_name || !method_name.isSymbol()) {
            return Values.values((SubLObject)methods.NIL, (SubLObject)methods.$kw72$INVALID_METHOD_NAME);
        }
        final SubLObject method = method_shadowed_assoc(method_name, subloop_structures.class_compiled_class_method_access_alist(v_class));
        if (methods.NIL == method) {
            return Values.values((SubLObject)methods.NIL, (SubLObject)methods.$kw73$UNDECLARED_METHOD);
        }
        if (methods.NIL == instances.instances_access_check_method(v_class, method)) {
            return Values.values((SubLObject)methods.NIL, (SubLObject)methods.$kw74$ACCESS_LEVEL_CONFLICT);
        }
        final SubLObject function_ref = subloop_structures.method_function_name(method);
        if (methods.NIL == Symbols.fboundp(function_ref)) {
            return Values.values((SubLObject)methods.NIL, (SubLObject)methods.$kw75$UNDEFINED_METHOD);
        }
        return Values.values(Functions.funcall(function_ref, new SubLObject[] { v_class, arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10, arg11 }), (SubLObject)methods.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/methods.lisp", position = 26431L)
    public static SubLObject safe_funcall_class_super_method_with_13_args(final SubLObject class_name_or_class, final SubLObject method_name, final SubLObject arg0, final SubLObject arg1, final SubLObject arg2, final SubLObject arg3, final SubLObject arg4, final SubLObject arg5, final SubLObject arg6, final SubLObject arg7, final SubLObject arg8, final SubLObject arg9, final SubLObject arg10, final SubLObject arg11, final SubLObject arg12) {
        final SubLObject v_class = class_name_or_class.isSymbol() ? classes.classes_retrieve_class(class_name_or_class) : ((methods.NIL != subloop_structures.instance_p(class_name_or_class)) ? subloop_structures.instance_class(class_name_or_class) : class_name_or_class);
        if (methods.NIL == subloop_structures.class_p(v_class)) {
            return Values.values((SubLObject)methods.NIL, (SubLObject)methods.$kw71$TARGET_NOT_A_CLASS);
        }
        if (methods.NIL == method_name || !method_name.isSymbol()) {
            return Values.values((SubLObject)methods.NIL, (SubLObject)methods.$kw72$INVALID_METHOD_NAME);
        }
        final SubLObject method = method_shadowed_assoc(method_name, subloop_structures.class_compiled_class_method_access_alist(v_class));
        if (methods.NIL == method) {
            return Values.values((SubLObject)methods.NIL, (SubLObject)methods.$kw73$UNDECLARED_METHOD);
        }
        if (methods.NIL == instances.instances_access_check_method(v_class, method)) {
            return Values.values((SubLObject)methods.NIL, (SubLObject)methods.$kw74$ACCESS_LEVEL_CONFLICT);
        }
        final SubLObject function_ref = subloop_structures.method_function_name(method);
        if (methods.NIL == Symbols.fboundp(function_ref)) {
            return Values.values((SubLObject)methods.NIL, (SubLObject)methods.$kw75$UNDEFINED_METHOD);
        }
        return Values.values(Functions.funcall(function_ref, new SubLObject[] { v_class, arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10, arg11, arg12 }), (SubLObject)methods.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/methods.lisp", position = 26431L)
    public static SubLObject safe_funcall_class_super_method_with_14_args(final SubLObject class_name_or_class, final SubLObject method_name, final SubLObject arg0, final SubLObject arg1, final SubLObject arg2, final SubLObject arg3, final SubLObject arg4, final SubLObject arg5, final SubLObject arg6, final SubLObject arg7, final SubLObject arg8, final SubLObject arg9, final SubLObject arg10, final SubLObject arg11, final SubLObject arg12, final SubLObject arg13) {
        final SubLObject v_class = class_name_or_class.isSymbol() ? classes.classes_retrieve_class(class_name_or_class) : ((methods.NIL != subloop_structures.instance_p(class_name_or_class)) ? subloop_structures.instance_class(class_name_or_class) : class_name_or_class);
        if (methods.NIL == subloop_structures.class_p(v_class)) {
            return Values.values((SubLObject)methods.NIL, (SubLObject)methods.$kw71$TARGET_NOT_A_CLASS);
        }
        if (methods.NIL == method_name || !method_name.isSymbol()) {
            return Values.values((SubLObject)methods.NIL, (SubLObject)methods.$kw72$INVALID_METHOD_NAME);
        }
        final SubLObject method = method_shadowed_assoc(method_name, subloop_structures.class_compiled_class_method_access_alist(v_class));
        if (methods.NIL == method) {
            return Values.values((SubLObject)methods.NIL, (SubLObject)methods.$kw73$UNDECLARED_METHOD);
        }
        if (methods.NIL == instances.instances_access_check_method(v_class, method)) {
            return Values.values((SubLObject)methods.NIL, (SubLObject)methods.$kw74$ACCESS_LEVEL_CONFLICT);
        }
        final SubLObject function_ref = subloop_structures.method_function_name(method);
        if (methods.NIL == Symbols.fboundp(function_ref)) {
            return Values.values((SubLObject)methods.NIL, (SubLObject)methods.$kw75$UNDEFINED_METHOD);
        }
        return Values.values(Functions.funcall(function_ref, new SubLObject[] { v_class, arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10, arg11, arg12, arg13 }), (SubLObject)methods.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/methods.lisp", position = 26431L)
    public static SubLObject safe_funcall_class_super_method_with_15_args(final SubLObject class_name_or_class, final SubLObject method_name, final SubLObject arg0, final SubLObject arg1, final SubLObject arg2, final SubLObject arg3, final SubLObject arg4, final SubLObject arg5, final SubLObject arg6, final SubLObject arg7, final SubLObject arg8, final SubLObject arg9, final SubLObject arg10, final SubLObject arg11, final SubLObject arg12, final SubLObject arg13, final SubLObject arg14) {
        final SubLObject v_class = class_name_or_class.isSymbol() ? classes.classes_retrieve_class(class_name_or_class) : ((methods.NIL != subloop_structures.instance_p(class_name_or_class)) ? subloop_structures.instance_class(class_name_or_class) : class_name_or_class);
        if (methods.NIL == subloop_structures.class_p(v_class)) {
            return Values.values((SubLObject)methods.NIL, (SubLObject)methods.$kw71$TARGET_NOT_A_CLASS);
        }
        if (methods.NIL == method_name || !method_name.isSymbol()) {
            return Values.values((SubLObject)methods.NIL, (SubLObject)methods.$kw72$INVALID_METHOD_NAME);
        }
        final SubLObject method = method_shadowed_assoc(method_name, subloop_structures.class_compiled_class_method_access_alist(v_class));
        if (methods.NIL == method) {
            return Values.values((SubLObject)methods.NIL, (SubLObject)methods.$kw73$UNDECLARED_METHOD);
        }
        if (methods.NIL == instances.instances_access_check_method(v_class, method)) {
            return Values.values((SubLObject)methods.NIL, (SubLObject)methods.$kw74$ACCESS_LEVEL_CONFLICT);
        }
        final SubLObject function_ref = subloop_structures.method_function_name(method);
        if (methods.NIL == Symbols.fboundp(function_ref)) {
            return Values.values((SubLObject)methods.NIL, (SubLObject)methods.$kw75$UNDEFINED_METHOD);
        }
        return Values.values(Functions.funcall(function_ref, new SubLObject[] { v_class, arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10, arg11, arg12, arg13, arg14 }), (SubLObject)methods.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/methods.lisp", position = 26431L)
    public static SubLObject safe_funcall_class_super_method_with_16_args(final SubLObject class_name_or_class, final SubLObject method_name, final SubLObject arg0, final SubLObject arg1, final SubLObject arg2, final SubLObject arg3, final SubLObject arg4, final SubLObject arg5, final SubLObject arg6, final SubLObject arg7, final SubLObject arg8, final SubLObject arg9, final SubLObject arg10, final SubLObject arg11, final SubLObject arg12, final SubLObject arg13, final SubLObject arg14, final SubLObject arg15) {
        final SubLObject v_class = class_name_or_class.isSymbol() ? classes.classes_retrieve_class(class_name_or_class) : ((methods.NIL != subloop_structures.instance_p(class_name_or_class)) ? subloop_structures.instance_class(class_name_or_class) : class_name_or_class);
        if (methods.NIL == subloop_structures.class_p(v_class)) {
            return Values.values((SubLObject)methods.NIL, (SubLObject)methods.$kw71$TARGET_NOT_A_CLASS);
        }
        if (methods.NIL == method_name || !method_name.isSymbol()) {
            return Values.values((SubLObject)methods.NIL, (SubLObject)methods.$kw72$INVALID_METHOD_NAME);
        }
        final SubLObject method = method_shadowed_assoc(method_name, subloop_structures.class_compiled_class_method_access_alist(v_class));
        if (methods.NIL == method) {
            return Values.values((SubLObject)methods.NIL, (SubLObject)methods.$kw73$UNDECLARED_METHOD);
        }
        if (methods.NIL == instances.instances_access_check_method(v_class, method)) {
            return Values.values((SubLObject)methods.NIL, (SubLObject)methods.$kw74$ACCESS_LEVEL_CONFLICT);
        }
        final SubLObject function_ref = subloop_structures.method_function_name(method);
        if (methods.NIL == Symbols.fboundp(function_ref)) {
            return Values.values((SubLObject)methods.NIL, (SubLObject)methods.$kw75$UNDEFINED_METHOD);
        }
        return Values.values(Functions.funcall(function_ref, new SubLObject[] { v_class, arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10, arg11, arg12, arg13, arg14, arg15 }), (SubLObject)methods.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/methods.lisp", position = 26431L)
    public static SubLObject safe_funcall_class_super_method_with_17_args(final SubLObject class_name_or_class, final SubLObject method_name, final SubLObject arg0, final SubLObject arg1, final SubLObject arg2, final SubLObject arg3, final SubLObject arg4, final SubLObject arg5, final SubLObject arg6, final SubLObject arg7, final SubLObject arg8, final SubLObject arg9, final SubLObject arg10, final SubLObject arg11, final SubLObject arg12, final SubLObject arg13, final SubLObject arg14, final SubLObject arg15, final SubLObject arg16) {
        final SubLObject v_class = class_name_or_class.isSymbol() ? classes.classes_retrieve_class(class_name_or_class) : ((methods.NIL != subloop_structures.instance_p(class_name_or_class)) ? subloop_structures.instance_class(class_name_or_class) : class_name_or_class);
        if (methods.NIL == subloop_structures.class_p(v_class)) {
            return Values.values((SubLObject)methods.NIL, (SubLObject)methods.$kw71$TARGET_NOT_A_CLASS);
        }
        if (methods.NIL == method_name || !method_name.isSymbol()) {
            return Values.values((SubLObject)methods.NIL, (SubLObject)methods.$kw72$INVALID_METHOD_NAME);
        }
        final SubLObject method = method_shadowed_assoc(method_name, subloop_structures.class_compiled_class_method_access_alist(v_class));
        if (methods.NIL == method) {
            return Values.values((SubLObject)methods.NIL, (SubLObject)methods.$kw73$UNDECLARED_METHOD);
        }
        if (methods.NIL == instances.instances_access_check_method(v_class, method)) {
            return Values.values((SubLObject)methods.NIL, (SubLObject)methods.$kw74$ACCESS_LEVEL_CONFLICT);
        }
        final SubLObject function_ref = subloop_structures.method_function_name(method);
        if (methods.NIL == Symbols.fboundp(function_ref)) {
            return Values.values((SubLObject)methods.NIL, (SubLObject)methods.$kw75$UNDEFINED_METHOD);
        }
        return Values.values(Functions.funcall(function_ref, new SubLObject[] { v_class, arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10, arg11, arg12, arg13, arg14, arg15, arg16 }), (SubLObject)methods.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/methods.lisp", position = 26431L)
    public static SubLObject safe_funcall_class_super_method_with_18_args(final SubLObject class_name_or_class, final SubLObject method_name, final SubLObject arg0, final SubLObject arg1, final SubLObject arg2, final SubLObject arg3, final SubLObject arg4, final SubLObject arg5, final SubLObject arg6, final SubLObject arg7, final SubLObject arg8, final SubLObject arg9, final SubLObject arg10, final SubLObject arg11, final SubLObject arg12, final SubLObject arg13, final SubLObject arg14, final SubLObject arg15, final SubLObject arg16, final SubLObject arg17) {
        final SubLObject v_class = class_name_or_class.isSymbol() ? classes.classes_retrieve_class(class_name_or_class) : ((methods.NIL != subloop_structures.instance_p(class_name_or_class)) ? subloop_structures.instance_class(class_name_or_class) : class_name_or_class);
        if (methods.NIL == subloop_structures.class_p(v_class)) {
            return Values.values((SubLObject)methods.NIL, (SubLObject)methods.$kw71$TARGET_NOT_A_CLASS);
        }
        if (methods.NIL == method_name || !method_name.isSymbol()) {
            return Values.values((SubLObject)methods.NIL, (SubLObject)methods.$kw72$INVALID_METHOD_NAME);
        }
        final SubLObject method = method_shadowed_assoc(method_name, subloop_structures.class_compiled_class_method_access_alist(v_class));
        if (methods.NIL == method) {
            return Values.values((SubLObject)methods.NIL, (SubLObject)methods.$kw73$UNDECLARED_METHOD);
        }
        if (methods.NIL == instances.instances_access_check_method(v_class, method)) {
            return Values.values((SubLObject)methods.NIL, (SubLObject)methods.$kw74$ACCESS_LEVEL_CONFLICT);
        }
        final SubLObject function_ref = subloop_structures.method_function_name(method);
        if (methods.NIL == Symbols.fboundp(function_ref)) {
            return Values.values((SubLObject)methods.NIL, (SubLObject)methods.$kw75$UNDEFINED_METHOD);
        }
        return Values.values(Functions.funcall(function_ref, new SubLObject[] { v_class, arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10, arg11, arg12, arg13, arg14, arg15, arg16, arg17 }), (SubLObject)methods.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/methods.lisp", position = 26431L)
    public static SubLObject safe_funcall_class_super_method_with_19_args(final SubLObject class_name_or_class, final SubLObject method_name, final SubLObject arg0, final SubLObject arg1, final SubLObject arg2, final SubLObject arg3, final SubLObject arg4, final SubLObject arg5, final SubLObject arg6, final SubLObject arg7, final SubLObject arg8, final SubLObject arg9, final SubLObject arg10, final SubLObject arg11, final SubLObject arg12, final SubLObject arg13, final SubLObject arg14, final SubLObject arg15, final SubLObject arg16, final SubLObject arg17, final SubLObject arg18) {
        final SubLObject v_class = class_name_or_class.isSymbol() ? classes.classes_retrieve_class(class_name_or_class) : ((methods.NIL != subloop_structures.instance_p(class_name_or_class)) ? subloop_structures.instance_class(class_name_or_class) : class_name_or_class);
        if (methods.NIL == subloop_structures.class_p(v_class)) {
            return Values.values((SubLObject)methods.NIL, (SubLObject)methods.$kw71$TARGET_NOT_A_CLASS);
        }
        if (methods.NIL == method_name || !method_name.isSymbol()) {
            return Values.values((SubLObject)methods.NIL, (SubLObject)methods.$kw72$INVALID_METHOD_NAME);
        }
        final SubLObject method = method_shadowed_assoc(method_name, subloop_structures.class_compiled_class_method_access_alist(v_class));
        if (methods.NIL == method) {
            return Values.values((SubLObject)methods.NIL, (SubLObject)methods.$kw73$UNDECLARED_METHOD);
        }
        if (methods.NIL == instances.instances_access_check_method(v_class, method)) {
            return Values.values((SubLObject)methods.NIL, (SubLObject)methods.$kw74$ACCESS_LEVEL_CONFLICT);
        }
        final SubLObject function_ref = subloop_structures.method_function_name(method);
        if (methods.NIL == Symbols.fboundp(function_ref)) {
            return Values.values((SubLObject)methods.NIL, (SubLObject)methods.$kw75$UNDEFINED_METHOD);
        }
        return Values.values(Functions.funcall(function_ref, new SubLObject[] { v_class, arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10, arg11, arg12, arg13, arg14, arg15, arg16, arg17, arg18 }), (SubLObject)methods.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/methods.lisp", position = 26431L)
    public static SubLObject safe_funcall_class_super_method_with_20_args(final SubLObject class_name_or_class, final SubLObject method_name, final SubLObject arg0, final SubLObject arg1, final SubLObject arg2, final SubLObject arg3, final SubLObject arg4, final SubLObject arg5, final SubLObject arg6, final SubLObject arg7, final SubLObject arg8, final SubLObject arg9, final SubLObject arg10, final SubLObject arg11, final SubLObject arg12, final SubLObject arg13, final SubLObject arg14, final SubLObject arg15, final SubLObject arg16, final SubLObject arg17, final SubLObject arg18, final SubLObject arg19) {
        final SubLObject v_class = class_name_or_class.isSymbol() ? classes.classes_retrieve_class(class_name_or_class) : ((methods.NIL != subloop_structures.instance_p(class_name_or_class)) ? subloop_structures.instance_class(class_name_or_class) : class_name_or_class);
        if (methods.NIL == subloop_structures.class_p(v_class)) {
            return Values.values((SubLObject)methods.NIL, (SubLObject)methods.$kw71$TARGET_NOT_A_CLASS);
        }
        if (methods.NIL == method_name || !method_name.isSymbol()) {
            return Values.values((SubLObject)methods.NIL, (SubLObject)methods.$kw72$INVALID_METHOD_NAME);
        }
        final SubLObject method = method_shadowed_assoc(method_name, subloop_structures.class_compiled_class_method_access_alist(v_class));
        if (methods.NIL == method) {
            return Values.values((SubLObject)methods.NIL, (SubLObject)methods.$kw73$UNDECLARED_METHOD);
        }
        if (methods.NIL == instances.instances_access_check_method(v_class, method)) {
            return Values.values((SubLObject)methods.NIL, (SubLObject)methods.$kw74$ACCESS_LEVEL_CONFLICT);
        }
        final SubLObject function_ref = subloop_structures.method_function_name(method);
        if (methods.NIL == Symbols.fboundp(function_ref)) {
            return Values.values((SubLObject)methods.NIL, (SubLObject)methods.$kw75$UNDEFINED_METHOD);
        }
        return Values.values(Functions.funcall(function_ref, new SubLObject[] { v_class, arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10, arg11, arg12, arg13, arg14, arg15, arg16, arg17, arg18, arg19 }), (SubLObject)methods.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/methods.lisp", position = 27212L)
    public static SubLObject funcall_instance_method_with_0_args(final SubLObject instance, final SubLObject method_name) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (methods.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && (methods.NIL == subloop_structures.instance_p(instance) || !method_name.isSymbol())) {
            Errors.error((SubLObject)methods.$str76$__FUNCALL_INSTANCE_METHOD__either, instance, method_name);
        }
        final SubLObject v_class = subloop_structures.instance_class(instance);
        final SubLObject method = Hashtables.gethash(method_name, subloop_structures.class_tablified_instance_methods(v_class), (SubLObject)methods.UNPROVIDED);
        if (methods.NIL != method) {
            if (methods.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && methods.NIL == instances.instances_access_check_method(v_class, method)) {
                Errors.error(classes_utilities.$classes_utilities_illegal_access_message$.getGlobalValue(), method_name, subloop_structures.class_name(v_class));
            }
            return Functions.funcall(subloop_structures.method_function_name(method), instance);
        }
        return funcall_class_method_with_0_args(v_class, method_name);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/methods.lisp", position = 27212L)
    public static SubLObject funcall_instance_method_with_1_args(final SubLObject instance, final SubLObject method_name, final SubLObject arg0) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (methods.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && (methods.NIL == subloop_structures.instance_p(instance) || !method_name.isSymbol())) {
            Errors.error((SubLObject)methods.$str76$__FUNCALL_INSTANCE_METHOD__either, instance, method_name);
        }
        final SubLObject v_class = subloop_structures.instance_class(instance);
        final SubLObject method = Hashtables.gethash(method_name, subloop_structures.class_tablified_instance_methods(v_class), (SubLObject)methods.UNPROVIDED);
        if (methods.NIL != method) {
            if (methods.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && methods.NIL == instances.instances_access_check_method(v_class, method)) {
                Errors.error(classes_utilities.$classes_utilities_illegal_access_message$.getGlobalValue(), method_name, subloop_structures.class_name(v_class));
            }
            return Functions.funcall(subloop_structures.method_function_name(method), instance, arg0);
        }
        return funcall_class_method_with_1_args(v_class, method_name, arg0);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/methods.lisp", position = 27212L)
    public static SubLObject funcall_instance_method_with_2_args(final SubLObject instance, final SubLObject method_name, final SubLObject arg0, final SubLObject arg1) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (methods.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && (methods.NIL == subloop_structures.instance_p(instance) || !method_name.isSymbol())) {
            Errors.error((SubLObject)methods.$str76$__FUNCALL_INSTANCE_METHOD__either, instance, method_name);
        }
        final SubLObject v_class = subloop_structures.instance_class(instance);
        final SubLObject method = Hashtables.gethash(method_name, subloop_structures.class_tablified_instance_methods(v_class), (SubLObject)methods.UNPROVIDED);
        if (methods.NIL != method) {
            if (methods.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && methods.NIL == instances.instances_access_check_method(v_class, method)) {
                Errors.error(classes_utilities.$classes_utilities_illegal_access_message$.getGlobalValue(), method_name, subloop_structures.class_name(v_class));
            }
            return Functions.funcall(subloop_structures.method_function_name(method), instance, arg0, arg1);
        }
        return funcall_class_method_with_2_args(v_class, method_name, arg0, arg1);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/methods.lisp", position = 27212L)
    public static SubLObject funcall_instance_method_with_3_args(final SubLObject instance, final SubLObject method_name, final SubLObject arg0, final SubLObject arg1, final SubLObject arg2) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (methods.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && (methods.NIL == subloop_structures.instance_p(instance) || !method_name.isSymbol())) {
            Errors.error((SubLObject)methods.$str76$__FUNCALL_INSTANCE_METHOD__either, instance, method_name);
        }
        final SubLObject v_class = subloop_structures.instance_class(instance);
        final SubLObject method = Hashtables.gethash(method_name, subloop_structures.class_tablified_instance_methods(v_class), (SubLObject)methods.UNPROVIDED);
        if (methods.NIL != method) {
            if (methods.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && methods.NIL == instances.instances_access_check_method(v_class, method)) {
                Errors.error(classes_utilities.$classes_utilities_illegal_access_message$.getGlobalValue(), method_name, subloop_structures.class_name(v_class));
            }
            return Functions.funcall(subloop_structures.method_function_name(method), instance, arg0, arg1, arg2);
        }
        return funcall_class_method_with_3_args(v_class, method_name, arg0, arg1, arg2);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/methods.lisp", position = 27212L)
    public static SubLObject funcall_instance_method_with_4_args(final SubLObject instance, final SubLObject method_name, final SubLObject arg0, final SubLObject arg1, final SubLObject arg2, final SubLObject arg3) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (methods.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && (methods.NIL == subloop_structures.instance_p(instance) || !method_name.isSymbol())) {
            Errors.error((SubLObject)methods.$str76$__FUNCALL_INSTANCE_METHOD__either, instance, method_name);
        }
        final SubLObject v_class = subloop_structures.instance_class(instance);
        final SubLObject method = Hashtables.gethash(method_name, subloop_structures.class_tablified_instance_methods(v_class), (SubLObject)methods.UNPROVIDED);
        if (methods.NIL != method) {
            if (methods.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && methods.NIL == instances.instances_access_check_method(v_class, method)) {
                Errors.error(classes_utilities.$classes_utilities_illegal_access_message$.getGlobalValue(), method_name, subloop_structures.class_name(v_class));
            }
            return Functions.funcall(subloop_structures.method_function_name(method), instance, arg0, arg1, arg2, arg3);
        }
        return funcall_class_method_with_4_args(v_class, method_name, arg0, arg1, arg2, arg3);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/methods.lisp", position = 27212L)
    public static SubLObject funcall_instance_method_with_5_args(final SubLObject instance, final SubLObject method_name, final SubLObject arg0, final SubLObject arg1, final SubLObject arg2, final SubLObject arg3, final SubLObject arg4) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (methods.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && (methods.NIL == subloop_structures.instance_p(instance) || !method_name.isSymbol())) {
            Errors.error((SubLObject)methods.$str76$__FUNCALL_INSTANCE_METHOD__either, instance, method_name);
        }
        final SubLObject v_class = subloop_structures.instance_class(instance);
        final SubLObject method = Hashtables.gethash(method_name, subloop_structures.class_tablified_instance_methods(v_class), (SubLObject)methods.UNPROVIDED);
        if (methods.NIL != method) {
            if (methods.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && methods.NIL == instances.instances_access_check_method(v_class, method)) {
                Errors.error(classes_utilities.$classes_utilities_illegal_access_message$.getGlobalValue(), method_name, subloop_structures.class_name(v_class));
            }
            return Functions.funcall(subloop_structures.method_function_name(method), instance, arg0, arg1, arg2, arg3, arg4);
        }
        return funcall_class_method_with_5_args(v_class, method_name, arg0, arg1, arg2, arg3, arg4);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/methods.lisp", position = 27212L)
    public static SubLObject funcall_instance_method_with_6_args(final SubLObject instance, final SubLObject method_name, final SubLObject arg0, final SubLObject arg1, final SubLObject arg2, final SubLObject arg3, final SubLObject arg4, final SubLObject arg5) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (methods.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && (methods.NIL == subloop_structures.instance_p(instance) || !method_name.isSymbol())) {
            Errors.error((SubLObject)methods.$str76$__FUNCALL_INSTANCE_METHOD__either, instance, method_name);
        }
        final SubLObject v_class = subloop_structures.instance_class(instance);
        final SubLObject method = Hashtables.gethash(method_name, subloop_structures.class_tablified_instance_methods(v_class), (SubLObject)methods.UNPROVIDED);
        if (methods.NIL != method) {
            if (methods.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && methods.NIL == instances.instances_access_check_method(v_class, method)) {
                Errors.error(classes_utilities.$classes_utilities_illegal_access_message$.getGlobalValue(), method_name, subloop_structures.class_name(v_class));
            }
            return Functions.funcall(subloop_structures.method_function_name(method), new SubLObject[] { instance, arg0, arg1, arg2, arg3, arg4, arg5 });
        }
        return funcall_class_method_with_6_args(v_class, method_name, arg0, arg1, arg2, arg3, arg4, arg5);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/methods.lisp", position = 27212L)
    public static SubLObject funcall_instance_method_with_7_args(final SubLObject instance, final SubLObject method_name, final SubLObject arg0, final SubLObject arg1, final SubLObject arg2, final SubLObject arg3, final SubLObject arg4, final SubLObject arg5, final SubLObject arg6) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (methods.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && (methods.NIL == subloop_structures.instance_p(instance) || !method_name.isSymbol())) {
            Errors.error((SubLObject)methods.$str76$__FUNCALL_INSTANCE_METHOD__either, instance, method_name);
        }
        final SubLObject v_class = subloop_structures.instance_class(instance);
        final SubLObject method = Hashtables.gethash(method_name, subloop_structures.class_tablified_instance_methods(v_class), (SubLObject)methods.UNPROVIDED);
        if (methods.NIL != method) {
            if (methods.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && methods.NIL == instances.instances_access_check_method(v_class, method)) {
                Errors.error(classes_utilities.$classes_utilities_illegal_access_message$.getGlobalValue(), method_name, subloop_structures.class_name(v_class));
            }
            return Functions.funcall(subloop_structures.method_function_name(method), new SubLObject[] { instance, arg0, arg1, arg2, arg3, arg4, arg5, arg6 });
        }
        return funcall_class_method_with_7_args(v_class, method_name, arg0, arg1, arg2, arg3, arg4, arg5, arg6);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/methods.lisp", position = 27212L)
    public static SubLObject funcall_instance_method_with_8_args(final SubLObject instance, final SubLObject method_name, final SubLObject arg0, final SubLObject arg1, final SubLObject arg2, final SubLObject arg3, final SubLObject arg4, final SubLObject arg5, final SubLObject arg6, final SubLObject arg7) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (methods.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && (methods.NIL == subloop_structures.instance_p(instance) || !method_name.isSymbol())) {
            Errors.error((SubLObject)methods.$str76$__FUNCALL_INSTANCE_METHOD__either, instance, method_name);
        }
        final SubLObject v_class = subloop_structures.instance_class(instance);
        final SubLObject method = Hashtables.gethash(method_name, subloop_structures.class_tablified_instance_methods(v_class), (SubLObject)methods.UNPROVIDED);
        if (methods.NIL != method) {
            if (methods.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && methods.NIL == instances.instances_access_check_method(v_class, method)) {
                Errors.error(classes_utilities.$classes_utilities_illegal_access_message$.getGlobalValue(), method_name, subloop_structures.class_name(v_class));
            }
            return Functions.funcall(subloop_structures.method_function_name(method), new SubLObject[] { instance, arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7 });
        }
        return funcall_class_method_with_8_args(v_class, method_name, arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/methods.lisp", position = 27212L)
    public static SubLObject funcall_instance_method_with_9_args(final SubLObject instance, final SubLObject method_name, final SubLObject arg0, final SubLObject arg1, final SubLObject arg2, final SubLObject arg3, final SubLObject arg4, final SubLObject arg5, final SubLObject arg6, final SubLObject arg7, final SubLObject arg8) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (methods.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && (methods.NIL == subloop_structures.instance_p(instance) || !method_name.isSymbol())) {
            Errors.error((SubLObject)methods.$str76$__FUNCALL_INSTANCE_METHOD__either, instance, method_name);
        }
        final SubLObject v_class = subloop_structures.instance_class(instance);
        final SubLObject method = Hashtables.gethash(method_name, subloop_structures.class_tablified_instance_methods(v_class), (SubLObject)methods.UNPROVIDED);
        if (methods.NIL != method) {
            if (methods.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && methods.NIL == instances.instances_access_check_method(v_class, method)) {
                Errors.error(classes_utilities.$classes_utilities_illegal_access_message$.getGlobalValue(), method_name, subloop_structures.class_name(v_class));
            }
            return Functions.funcall(subloop_structures.method_function_name(method), new SubLObject[] { instance, arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8 });
        }
        return funcall_class_method_with_9_args(v_class, method_name, arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/methods.lisp", position = 27212L)
    public static SubLObject funcall_instance_method_with_10_args(final SubLObject instance, final SubLObject method_name, final SubLObject arg0, final SubLObject arg1, final SubLObject arg2, final SubLObject arg3, final SubLObject arg4, final SubLObject arg5, final SubLObject arg6, final SubLObject arg7, final SubLObject arg8, final SubLObject arg9) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (methods.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && (methods.NIL == subloop_structures.instance_p(instance) || !method_name.isSymbol())) {
            Errors.error((SubLObject)methods.$str76$__FUNCALL_INSTANCE_METHOD__either, instance, method_name);
        }
        final SubLObject v_class = subloop_structures.instance_class(instance);
        final SubLObject method = Hashtables.gethash(method_name, subloop_structures.class_tablified_instance_methods(v_class), (SubLObject)methods.UNPROVIDED);
        if (methods.NIL != method) {
            if (methods.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && methods.NIL == instances.instances_access_check_method(v_class, method)) {
                Errors.error(classes_utilities.$classes_utilities_illegal_access_message$.getGlobalValue(), method_name, subloop_structures.class_name(v_class));
            }
            return Functions.funcall(subloop_structures.method_function_name(method), new SubLObject[] { instance, arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9 });
        }
        return funcall_class_method_with_10_args(v_class, method_name, arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/methods.lisp", position = 27212L)
    public static SubLObject funcall_instance_method_with_11_args(final SubLObject instance, final SubLObject method_name, final SubLObject arg0, final SubLObject arg1, final SubLObject arg2, final SubLObject arg3, final SubLObject arg4, final SubLObject arg5, final SubLObject arg6, final SubLObject arg7, final SubLObject arg8, final SubLObject arg9, final SubLObject arg10) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (methods.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && (methods.NIL == subloop_structures.instance_p(instance) || !method_name.isSymbol())) {
            Errors.error((SubLObject)methods.$str76$__FUNCALL_INSTANCE_METHOD__either, instance, method_name);
        }
        final SubLObject v_class = subloop_structures.instance_class(instance);
        final SubLObject method = Hashtables.gethash(method_name, subloop_structures.class_tablified_instance_methods(v_class), (SubLObject)methods.UNPROVIDED);
        if (methods.NIL != method) {
            if (methods.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && methods.NIL == instances.instances_access_check_method(v_class, method)) {
                Errors.error(classes_utilities.$classes_utilities_illegal_access_message$.getGlobalValue(), method_name, subloop_structures.class_name(v_class));
            }
            return Functions.funcall(subloop_structures.method_function_name(method), new SubLObject[] { instance, arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10 });
        }
        return funcall_class_method_with_11_args(v_class, method_name, arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/methods.lisp", position = 27212L)
    public static SubLObject funcall_instance_method_with_12_args(final SubLObject instance, final SubLObject method_name, final SubLObject arg0, final SubLObject arg1, final SubLObject arg2, final SubLObject arg3, final SubLObject arg4, final SubLObject arg5, final SubLObject arg6, final SubLObject arg7, final SubLObject arg8, final SubLObject arg9, final SubLObject arg10, final SubLObject arg11) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (methods.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && (methods.NIL == subloop_structures.instance_p(instance) || !method_name.isSymbol())) {
            Errors.error((SubLObject)methods.$str76$__FUNCALL_INSTANCE_METHOD__either, instance, method_name);
        }
        final SubLObject v_class = subloop_structures.instance_class(instance);
        final SubLObject method = Hashtables.gethash(method_name, subloop_structures.class_tablified_instance_methods(v_class), (SubLObject)methods.UNPROVIDED);
        if (methods.NIL != method) {
            if (methods.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && methods.NIL == instances.instances_access_check_method(v_class, method)) {
                Errors.error(classes_utilities.$classes_utilities_illegal_access_message$.getGlobalValue(), method_name, subloop_structures.class_name(v_class));
            }
            return Functions.funcall(subloop_structures.method_function_name(method), new SubLObject[] { instance, arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10, arg11 });
        }
        return funcall_class_method_with_12_args(v_class, method_name, arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10, arg11);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/methods.lisp", position = 27212L)
    public static SubLObject funcall_instance_method_with_13_args(final SubLObject instance, final SubLObject method_name, final SubLObject arg0, final SubLObject arg1, final SubLObject arg2, final SubLObject arg3, final SubLObject arg4, final SubLObject arg5, final SubLObject arg6, final SubLObject arg7, final SubLObject arg8, final SubLObject arg9, final SubLObject arg10, final SubLObject arg11, final SubLObject arg12) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (methods.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && (methods.NIL == subloop_structures.instance_p(instance) || !method_name.isSymbol())) {
            Errors.error((SubLObject)methods.$str76$__FUNCALL_INSTANCE_METHOD__either, instance, method_name);
        }
        final SubLObject v_class = subloop_structures.instance_class(instance);
        final SubLObject method = Hashtables.gethash(method_name, subloop_structures.class_tablified_instance_methods(v_class), (SubLObject)methods.UNPROVIDED);
        if (methods.NIL != method) {
            if (methods.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && methods.NIL == instances.instances_access_check_method(v_class, method)) {
                Errors.error(classes_utilities.$classes_utilities_illegal_access_message$.getGlobalValue(), method_name, subloop_structures.class_name(v_class));
            }
            return Functions.funcall(subloop_structures.method_function_name(method), new SubLObject[] { instance, arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10, arg11, arg12 });
        }
        return funcall_class_method_with_13_args(v_class, method_name, arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10, arg11, arg12);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/methods.lisp", position = 27212L)
    public static SubLObject funcall_instance_method_with_14_args(final SubLObject instance, final SubLObject method_name, final SubLObject arg0, final SubLObject arg1, final SubLObject arg2, final SubLObject arg3, final SubLObject arg4, final SubLObject arg5, final SubLObject arg6, final SubLObject arg7, final SubLObject arg8, final SubLObject arg9, final SubLObject arg10, final SubLObject arg11, final SubLObject arg12, final SubLObject arg13) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (methods.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && (methods.NIL == subloop_structures.instance_p(instance) || !method_name.isSymbol())) {
            Errors.error((SubLObject)methods.$str76$__FUNCALL_INSTANCE_METHOD__either, instance, method_name);
        }
        final SubLObject v_class = subloop_structures.instance_class(instance);
        final SubLObject method = Hashtables.gethash(method_name, subloop_structures.class_tablified_instance_methods(v_class), (SubLObject)methods.UNPROVIDED);
        if (methods.NIL != method) {
            if (methods.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && methods.NIL == instances.instances_access_check_method(v_class, method)) {
                Errors.error(classes_utilities.$classes_utilities_illegal_access_message$.getGlobalValue(), method_name, subloop_structures.class_name(v_class));
            }
            return Functions.funcall(subloop_structures.method_function_name(method), new SubLObject[] { instance, arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10, arg11, arg12, arg13 });
        }
        return funcall_class_method_with_14_args(v_class, method_name, arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10, arg11, arg12, arg13);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/methods.lisp", position = 27212L)
    public static SubLObject funcall_instance_method_with_15_args(final SubLObject instance, final SubLObject method_name, final SubLObject arg0, final SubLObject arg1, final SubLObject arg2, final SubLObject arg3, final SubLObject arg4, final SubLObject arg5, final SubLObject arg6, final SubLObject arg7, final SubLObject arg8, final SubLObject arg9, final SubLObject arg10, final SubLObject arg11, final SubLObject arg12, final SubLObject arg13, final SubLObject arg14) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (methods.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && (methods.NIL == subloop_structures.instance_p(instance) || !method_name.isSymbol())) {
            Errors.error((SubLObject)methods.$str76$__FUNCALL_INSTANCE_METHOD__either, instance, method_name);
        }
        final SubLObject v_class = subloop_structures.instance_class(instance);
        final SubLObject method = Hashtables.gethash(method_name, subloop_structures.class_tablified_instance_methods(v_class), (SubLObject)methods.UNPROVIDED);
        if (methods.NIL != method) {
            if (methods.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && methods.NIL == instances.instances_access_check_method(v_class, method)) {
                Errors.error(classes_utilities.$classes_utilities_illegal_access_message$.getGlobalValue(), method_name, subloop_structures.class_name(v_class));
            }
            return Functions.funcall(subloop_structures.method_function_name(method), new SubLObject[] { instance, arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10, arg11, arg12, arg13, arg14 });
        }
        return funcall_class_method_with_15_args(v_class, method_name, arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10, arg11, arg12, arg13, arg14);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/methods.lisp", position = 27212L)
    public static SubLObject funcall_instance_method_with_16_args(final SubLObject instance, final SubLObject method_name, final SubLObject arg0, final SubLObject arg1, final SubLObject arg2, final SubLObject arg3, final SubLObject arg4, final SubLObject arg5, final SubLObject arg6, final SubLObject arg7, final SubLObject arg8, final SubLObject arg9, final SubLObject arg10, final SubLObject arg11, final SubLObject arg12, final SubLObject arg13, final SubLObject arg14, final SubLObject arg15) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (methods.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && (methods.NIL == subloop_structures.instance_p(instance) || !method_name.isSymbol())) {
            Errors.error((SubLObject)methods.$str76$__FUNCALL_INSTANCE_METHOD__either, instance, method_name);
        }
        final SubLObject v_class = subloop_structures.instance_class(instance);
        final SubLObject method = Hashtables.gethash(method_name, subloop_structures.class_tablified_instance_methods(v_class), (SubLObject)methods.UNPROVIDED);
        if (methods.NIL != method) {
            if (methods.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && methods.NIL == instances.instances_access_check_method(v_class, method)) {
                Errors.error(classes_utilities.$classes_utilities_illegal_access_message$.getGlobalValue(), method_name, subloop_structures.class_name(v_class));
            }
            return Functions.funcall(subloop_structures.method_function_name(method), new SubLObject[] { instance, arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10, arg11, arg12, arg13, arg14, arg15 });
        }
        return funcall_class_method_with_16_args(v_class, method_name, arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10, arg11, arg12, arg13, arg14, arg15);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/methods.lisp", position = 27212L)
    public static SubLObject funcall_instance_method_with_17_args(final SubLObject instance, final SubLObject method_name, final SubLObject arg0, final SubLObject arg1, final SubLObject arg2, final SubLObject arg3, final SubLObject arg4, final SubLObject arg5, final SubLObject arg6, final SubLObject arg7, final SubLObject arg8, final SubLObject arg9, final SubLObject arg10, final SubLObject arg11, final SubLObject arg12, final SubLObject arg13, final SubLObject arg14, final SubLObject arg15, final SubLObject arg16) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (methods.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && (methods.NIL == subloop_structures.instance_p(instance) || !method_name.isSymbol())) {
            Errors.error((SubLObject)methods.$str76$__FUNCALL_INSTANCE_METHOD__either, instance, method_name);
        }
        final SubLObject v_class = subloop_structures.instance_class(instance);
        final SubLObject method = Hashtables.gethash(method_name, subloop_structures.class_tablified_instance_methods(v_class), (SubLObject)methods.UNPROVIDED);
        if (methods.NIL != method) {
            if (methods.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && methods.NIL == instances.instances_access_check_method(v_class, method)) {
                Errors.error(classes_utilities.$classes_utilities_illegal_access_message$.getGlobalValue(), method_name, subloop_structures.class_name(v_class));
            }
            return Functions.funcall(subloop_structures.method_function_name(method), new SubLObject[] { instance, arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10, arg11, arg12, arg13, arg14, arg15, arg16 });
        }
        return funcall_class_method_with_17_args(v_class, method_name, arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10, arg11, arg12, arg13, arg14, arg15, arg16);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/methods.lisp", position = 27212L)
    public static SubLObject funcall_instance_method_with_18_args(final SubLObject instance, final SubLObject method_name, final SubLObject arg0, final SubLObject arg1, final SubLObject arg2, final SubLObject arg3, final SubLObject arg4, final SubLObject arg5, final SubLObject arg6, final SubLObject arg7, final SubLObject arg8, final SubLObject arg9, final SubLObject arg10, final SubLObject arg11, final SubLObject arg12, final SubLObject arg13, final SubLObject arg14, final SubLObject arg15, final SubLObject arg16, final SubLObject arg17) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (methods.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && (methods.NIL == subloop_structures.instance_p(instance) || !method_name.isSymbol())) {
            Errors.error((SubLObject)methods.$str76$__FUNCALL_INSTANCE_METHOD__either, instance, method_name);
        }
        final SubLObject v_class = subloop_structures.instance_class(instance);
        final SubLObject method = Hashtables.gethash(method_name, subloop_structures.class_tablified_instance_methods(v_class), (SubLObject)methods.UNPROVIDED);
        if (methods.NIL != method) {
            if (methods.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && methods.NIL == instances.instances_access_check_method(v_class, method)) {
                Errors.error(classes_utilities.$classes_utilities_illegal_access_message$.getGlobalValue(), method_name, subloop_structures.class_name(v_class));
            }
            return Functions.funcall(subloop_structures.method_function_name(method), new SubLObject[] { instance, arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10, arg11, arg12, arg13, arg14, arg15, arg16, arg17 });
        }
        return funcall_class_method_with_18_args(v_class, method_name, arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10, arg11, arg12, arg13, arg14, arg15, arg16, arg17);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/methods.lisp", position = 27212L)
    public static SubLObject funcall_instance_method_with_19_args(final SubLObject instance, final SubLObject method_name, final SubLObject arg0, final SubLObject arg1, final SubLObject arg2, final SubLObject arg3, final SubLObject arg4, final SubLObject arg5, final SubLObject arg6, final SubLObject arg7, final SubLObject arg8, final SubLObject arg9, final SubLObject arg10, final SubLObject arg11, final SubLObject arg12, final SubLObject arg13, final SubLObject arg14, final SubLObject arg15, final SubLObject arg16, final SubLObject arg17, final SubLObject arg18) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (methods.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && (methods.NIL == subloop_structures.instance_p(instance) || !method_name.isSymbol())) {
            Errors.error((SubLObject)methods.$str76$__FUNCALL_INSTANCE_METHOD__either, instance, method_name);
        }
        final SubLObject v_class = subloop_structures.instance_class(instance);
        final SubLObject method = Hashtables.gethash(method_name, subloop_structures.class_tablified_instance_methods(v_class), (SubLObject)methods.UNPROVIDED);
        if (methods.NIL != method) {
            if (methods.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && methods.NIL == instances.instances_access_check_method(v_class, method)) {
                Errors.error(classes_utilities.$classes_utilities_illegal_access_message$.getGlobalValue(), method_name, subloop_structures.class_name(v_class));
            }
            return Functions.funcall(subloop_structures.method_function_name(method), new SubLObject[] { instance, arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10, arg11, arg12, arg13, arg14, arg15, arg16, arg17, arg18 });
        }
        return funcall_class_method_with_19_args(v_class, method_name, arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10, arg11, arg12, arg13, arg14, arg15, arg16, arg17, arg18);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/methods.lisp", position = 27212L)
    public static SubLObject funcall_instance_method_with_20_args(final SubLObject instance, final SubLObject method_name, final SubLObject arg0, final SubLObject arg1, final SubLObject arg2, final SubLObject arg3, final SubLObject arg4, final SubLObject arg5, final SubLObject arg6, final SubLObject arg7, final SubLObject arg8, final SubLObject arg9, final SubLObject arg10, final SubLObject arg11, final SubLObject arg12, final SubLObject arg13, final SubLObject arg14, final SubLObject arg15, final SubLObject arg16, final SubLObject arg17, final SubLObject arg18, final SubLObject arg19) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (methods.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && (methods.NIL == subloop_structures.instance_p(instance) || !method_name.isSymbol())) {
            Errors.error((SubLObject)methods.$str76$__FUNCALL_INSTANCE_METHOD__either, instance, method_name);
        }
        final SubLObject v_class = subloop_structures.instance_class(instance);
        final SubLObject method = Hashtables.gethash(method_name, subloop_structures.class_tablified_instance_methods(v_class), (SubLObject)methods.UNPROVIDED);
        if (methods.NIL != method) {
            if (methods.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && methods.NIL == instances.instances_access_check_method(v_class, method)) {
                Errors.error(classes_utilities.$classes_utilities_illegal_access_message$.getGlobalValue(), method_name, subloop_structures.class_name(v_class));
            }
            return Functions.funcall(subloop_structures.method_function_name(method), new SubLObject[] { instance, arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10, arg11, arg12, arg13, arg14, arg15, arg16, arg17, arg18, arg19 });
        }
        return funcall_class_method_with_20_args(v_class, method_name, arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10, arg11, arg12, arg13, arg14, arg15, arg16, arg17, arg18, arg19);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/methods.lisp", position = 27953L)
    public static SubLObject funcall_instance_super_method_with_0_args(final SubLObject instance, final SubLObject method_name) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (methods.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && (methods.NIL == subloop_structures.instance_p(instance) || !method_name.isSymbol())) {
            Errors.error((SubLObject)methods.$str76$__FUNCALL_INSTANCE_METHOD__either, instance, method_name);
        }
        final SubLObject v_class = subloop_structures.instance_class(instance);
        final SubLObject method = method_shadowed_assoc(method_name, subloop_structures.class_compiled_instance_method_access_alist(v_class));
        if (methods.NIL != method) {
            if (methods.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && methods.NIL == instances.instances_access_check_method(v_class, method)) {
                Errors.error(classes_utilities.$classes_utilities_illegal_access_message$.getGlobalValue(), method_name, subloop_structures.class_name(v_class));
            }
            return Functions.funcall(subloop_structures.method_function_name(method), instance);
        }
        return funcall_class_super_method_with_0_args(v_class, method_name);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/methods.lisp", position = 27953L)
    public static SubLObject funcall_instance_super_method_with_1_args(final SubLObject instance, final SubLObject method_name, final SubLObject arg0) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (methods.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && (methods.NIL == subloop_structures.instance_p(instance) || !method_name.isSymbol())) {
            Errors.error((SubLObject)methods.$str76$__FUNCALL_INSTANCE_METHOD__either, instance, method_name);
        }
        final SubLObject v_class = subloop_structures.instance_class(instance);
        final SubLObject method = method_shadowed_assoc(method_name, subloop_structures.class_compiled_instance_method_access_alist(v_class));
        if (methods.NIL != method) {
            if (methods.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && methods.NIL == instances.instances_access_check_method(v_class, method)) {
                Errors.error(classes_utilities.$classes_utilities_illegal_access_message$.getGlobalValue(), method_name, subloop_structures.class_name(v_class));
            }
            return Functions.funcall(subloop_structures.method_function_name(method), instance, arg0);
        }
        return funcall_class_super_method_with_1_args(v_class, method_name, arg0);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/methods.lisp", position = 27953L)
    public static SubLObject funcall_instance_super_method_with_2_args(final SubLObject instance, final SubLObject method_name, final SubLObject arg0, final SubLObject arg1) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (methods.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && (methods.NIL == subloop_structures.instance_p(instance) || !method_name.isSymbol())) {
            Errors.error((SubLObject)methods.$str76$__FUNCALL_INSTANCE_METHOD__either, instance, method_name);
        }
        final SubLObject v_class = subloop_structures.instance_class(instance);
        final SubLObject method = method_shadowed_assoc(method_name, subloop_structures.class_compiled_instance_method_access_alist(v_class));
        if (methods.NIL != method) {
            if (methods.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && methods.NIL == instances.instances_access_check_method(v_class, method)) {
                Errors.error(classes_utilities.$classes_utilities_illegal_access_message$.getGlobalValue(), method_name, subloop_structures.class_name(v_class));
            }
            return Functions.funcall(subloop_structures.method_function_name(method), instance, arg0, arg1);
        }
        return funcall_class_super_method_with_2_args(v_class, method_name, arg0, arg1);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/methods.lisp", position = 27953L)
    public static SubLObject funcall_instance_super_method_with_3_args(final SubLObject instance, final SubLObject method_name, final SubLObject arg0, final SubLObject arg1, final SubLObject arg2) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (methods.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && (methods.NIL == subloop_structures.instance_p(instance) || !method_name.isSymbol())) {
            Errors.error((SubLObject)methods.$str76$__FUNCALL_INSTANCE_METHOD__either, instance, method_name);
        }
        final SubLObject v_class = subloop_structures.instance_class(instance);
        final SubLObject method = method_shadowed_assoc(method_name, subloop_structures.class_compiled_instance_method_access_alist(v_class));
        if (methods.NIL != method) {
            if (methods.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && methods.NIL == instances.instances_access_check_method(v_class, method)) {
                Errors.error(classes_utilities.$classes_utilities_illegal_access_message$.getGlobalValue(), method_name, subloop_structures.class_name(v_class));
            }
            return Functions.funcall(subloop_structures.method_function_name(method), instance, arg0, arg1, arg2);
        }
        return funcall_class_super_method_with_3_args(v_class, method_name, arg0, arg1, arg2);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/methods.lisp", position = 27953L)
    public static SubLObject funcall_instance_super_method_with_4_args(final SubLObject instance, final SubLObject method_name, final SubLObject arg0, final SubLObject arg1, final SubLObject arg2, final SubLObject arg3) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (methods.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && (methods.NIL == subloop_structures.instance_p(instance) || !method_name.isSymbol())) {
            Errors.error((SubLObject)methods.$str76$__FUNCALL_INSTANCE_METHOD__either, instance, method_name);
        }
        final SubLObject v_class = subloop_structures.instance_class(instance);
        final SubLObject method = method_shadowed_assoc(method_name, subloop_structures.class_compiled_instance_method_access_alist(v_class));
        if (methods.NIL != method) {
            if (methods.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && methods.NIL == instances.instances_access_check_method(v_class, method)) {
                Errors.error(classes_utilities.$classes_utilities_illegal_access_message$.getGlobalValue(), method_name, subloop_structures.class_name(v_class));
            }
            return Functions.funcall(subloop_structures.method_function_name(method), instance, arg0, arg1, arg2, arg3);
        }
        return funcall_class_super_method_with_4_args(v_class, method_name, arg0, arg1, arg2, arg3);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/methods.lisp", position = 27953L)
    public static SubLObject funcall_instance_super_method_with_5_args(final SubLObject instance, final SubLObject method_name, final SubLObject arg0, final SubLObject arg1, final SubLObject arg2, final SubLObject arg3, final SubLObject arg4) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (methods.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && (methods.NIL == subloop_structures.instance_p(instance) || !method_name.isSymbol())) {
            Errors.error((SubLObject)methods.$str76$__FUNCALL_INSTANCE_METHOD__either, instance, method_name);
        }
        final SubLObject v_class = subloop_structures.instance_class(instance);
        final SubLObject method = method_shadowed_assoc(method_name, subloop_structures.class_compiled_instance_method_access_alist(v_class));
        if (methods.NIL != method) {
            if (methods.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && methods.NIL == instances.instances_access_check_method(v_class, method)) {
                Errors.error(classes_utilities.$classes_utilities_illegal_access_message$.getGlobalValue(), method_name, subloop_structures.class_name(v_class));
            }
            return Functions.funcall(subloop_structures.method_function_name(method), instance, arg0, arg1, arg2, arg3, arg4);
        }
        return funcall_class_super_method_with_5_args(v_class, method_name, arg0, arg1, arg2, arg3, arg4);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/methods.lisp", position = 27953L)
    public static SubLObject funcall_instance_super_method_with_6_args(final SubLObject instance, final SubLObject method_name, final SubLObject arg0, final SubLObject arg1, final SubLObject arg2, final SubLObject arg3, final SubLObject arg4, final SubLObject arg5) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (methods.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && (methods.NIL == subloop_structures.instance_p(instance) || !method_name.isSymbol())) {
            Errors.error((SubLObject)methods.$str76$__FUNCALL_INSTANCE_METHOD__either, instance, method_name);
        }
        final SubLObject v_class = subloop_structures.instance_class(instance);
        final SubLObject method = method_shadowed_assoc(method_name, subloop_structures.class_compiled_instance_method_access_alist(v_class));
        if (methods.NIL != method) {
            if (methods.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && methods.NIL == instances.instances_access_check_method(v_class, method)) {
                Errors.error(classes_utilities.$classes_utilities_illegal_access_message$.getGlobalValue(), method_name, subloop_structures.class_name(v_class));
            }
            return Functions.funcall(subloop_structures.method_function_name(method), new SubLObject[] { instance, arg0, arg1, arg2, arg3, arg4, arg5 });
        }
        return funcall_class_super_method_with_6_args(v_class, method_name, arg0, arg1, arg2, arg3, arg4, arg5);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/methods.lisp", position = 27953L)
    public static SubLObject funcall_instance_super_method_with_7_args(final SubLObject instance, final SubLObject method_name, final SubLObject arg0, final SubLObject arg1, final SubLObject arg2, final SubLObject arg3, final SubLObject arg4, final SubLObject arg5, final SubLObject arg6) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (methods.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && (methods.NIL == subloop_structures.instance_p(instance) || !method_name.isSymbol())) {
            Errors.error((SubLObject)methods.$str76$__FUNCALL_INSTANCE_METHOD__either, instance, method_name);
        }
        final SubLObject v_class = subloop_structures.instance_class(instance);
        final SubLObject method = method_shadowed_assoc(method_name, subloop_structures.class_compiled_instance_method_access_alist(v_class));
        if (methods.NIL != method) {
            if (methods.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && methods.NIL == instances.instances_access_check_method(v_class, method)) {
                Errors.error(classes_utilities.$classes_utilities_illegal_access_message$.getGlobalValue(), method_name, subloop_structures.class_name(v_class));
            }
            return Functions.funcall(subloop_structures.method_function_name(method), new SubLObject[] { instance, arg0, arg1, arg2, arg3, arg4, arg5, arg6 });
        }
        return funcall_class_super_method_with_7_args(v_class, method_name, arg0, arg1, arg2, arg3, arg4, arg5, arg6);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/methods.lisp", position = 27953L)
    public static SubLObject funcall_instance_super_method_with_8_args(final SubLObject instance, final SubLObject method_name, final SubLObject arg0, final SubLObject arg1, final SubLObject arg2, final SubLObject arg3, final SubLObject arg4, final SubLObject arg5, final SubLObject arg6, final SubLObject arg7) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (methods.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && (methods.NIL == subloop_structures.instance_p(instance) || !method_name.isSymbol())) {
            Errors.error((SubLObject)methods.$str76$__FUNCALL_INSTANCE_METHOD__either, instance, method_name);
        }
        final SubLObject v_class = subloop_structures.instance_class(instance);
        final SubLObject method = method_shadowed_assoc(method_name, subloop_structures.class_compiled_instance_method_access_alist(v_class));
        if (methods.NIL != method) {
            if (methods.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && methods.NIL == instances.instances_access_check_method(v_class, method)) {
                Errors.error(classes_utilities.$classes_utilities_illegal_access_message$.getGlobalValue(), method_name, subloop_structures.class_name(v_class));
            }
            return Functions.funcall(subloop_structures.method_function_name(method), new SubLObject[] { instance, arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7 });
        }
        return funcall_class_super_method_with_8_args(v_class, method_name, arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/methods.lisp", position = 27953L)
    public static SubLObject funcall_instance_super_method_with_9_args(final SubLObject instance, final SubLObject method_name, final SubLObject arg0, final SubLObject arg1, final SubLObject arg2, final SubLObject arg3, final SubLObject arg4, final SubLObject arg5, final SubLObject arg6, final SubLObject arg7, final SubLObject arg8) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (methods.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && (methods.NIL == subloop_structures.instance_p(instance) || !method_name.isSymbol())) {
            Errors.error((SubLObject)methods.$str76$__FUNCALL_INSTANCE_METHOD__either, instance, method_name);
        }
        final SubLObject v_class = subloop_structures.instance_class(instance);
        final SubLObject method = method_shadowed_assoc(method_name, subloop_structures.class_compiled_instance_method_access_alist(v_class));
        if (methods.NIL != method) {
            if (methods.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && methods.NIL == instances.instances_access_check_method(v_class, method)) {
                Errors.error(classes_utilities.$classes_utilities_illegal_access_message$.getGlobalValue(), method_name, subloop_structures.class_name(v_class));
            }
            return Functions.funcall(subloop_structures.method_function_name(method), new SubLObject[] { instance, arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8 });
        }
        return funcall_class_super_method_with_9_args(v_class, method_name, arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/methods.lisp", position = 27953L)
    public static SubLObject funcall_instance_super_method_with_10_args(final SubLObject instance, final SubLObject method_name, final SubLObject arg0, final SubLObject arg1, final SubLObject arg2, final SubLObject arg3, final SubLObject arg4, final SubLObject arg5, final SubLObject arg6, final SubLObject arg7, final SubLObject arg8, final SubLObject arg9) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (methods.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && (methods.NIL == subloop_structures.instance_p(instance) || !method_name.isSymbol())) {
            Errors.error((SubLObject)methods.$str76$__FUNCALL_INSTANCE_METHOD__either, instance, method_name);
        }
        final SubLObject v_class = subloop_structures.instance_class(instance);
        final SubLObject method = method_shadowed_assoc(method_name, subloop_structures.class_compiled_instance_method_access_alist(v_class));
        if (methods.NIL != method) {
            if (methods.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && methods.NIL == instances.instances_access_check_method(v_class, method)) {
                Errors.error(classes_utilities.$classes_utilities_illegal_access_message$.getGlobalValue(), method_name, subloop_structures.class_name(v_class));
            }
            return Functions.funcall(subloop_structures.method_function_name(method), new SubLObject[] { instance, arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9 });
        }
        return funcall_class_super_method_with_10_args(v_class, method_name, arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/methods.lisp", position = 27953L)
    public static SubLObject funcall_instance_super_method_with_11_args(final SubLObject instance, final SubLObject method_name, final SubLObject arg0, final SubLObject arg1, final SubLObject arg2, final SubLObject arg3, final SubLObject arg4, final SubLObject arg5, final SubLObject arg6, final SubLObject arg7, final SubLObject arg8, final SubLObject arg9, final SubLObject arg10) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (methods.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && (methods.NIL == subloop_structures.instance_p(instance) || !method_name.isSymbol())) {
            Errors.error((SubLObject)methods.$str76$__FUNCALL_INSTANCE_METHOD__either, instance, method_name);
        }
        final SubLObject v_class = subloop_structures.instance_class(instance);
        final SubLObject method = method_shadowed_assoc(method_name, subloop_structures.class_compiled_instance_method_access_alist(v_class));
        if (methods.NIL != method) {
            if (methods.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && methods.NIL == instances.instances_access_check_method(v_class, method)) {
                Errors.error(classes_utilities.$classes_utilities_illegal_access_message$.getGlobalValue(), method_name, subloop_structures.class_name(v_class));
            }
            return Functions.funcall(subloop_structures.method_function_name(method), new SubLObject[] { instance, arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10 });
        }
        return funcall_class_super_method_with_11_args(v_class, method_name, arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/methods.lisp", position = 27953L)
    public static SubLObject funcall_instance_super_method_with_12_args(final SubLObject instance, final SubLObject method_name, final SubLObject arg0, final SubLObject arg1, final SubLObject arg2, final SubLObject arg3, final SubLObject arg4, final SubLObject arg5, final SubLObject arg6, final SubLObject arg7, final SubLObject arg8, final SubLObject arg9, final SubLObject arg10, final SubLObject arg11) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (methods.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && (methods.NIL == subloop_structures.instance_p(instance) || !method_name.isSymbol())) {
            Errors.error((SubLObject)methods.$str76$__FUNCALL_INSTANCE_METHOD__either, instance, method_name);
        }
        final SubLObject v_class = subloop_structures.instance_class(instance);
        final SubLObject method = method_shadowed_assoc(method_name, subloop_structures.class_compiled_instance_method_access_alist(v_class));
        if (methods.NIL != method) {
            if (methods.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && methods.NIL == instances.instances_access_check_method(v_class, method)) {
                Errors.error(classes_utilities.$classes_utilities_illegal_access_message$.getGlobalValue(), method_name, subloop_structures.class_name(v_class));
            }
            return Functions.funcall(subloop_structures.method_function_name(method), new SubLObject[] { instance, arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10, arg11 });
        }
        return funcall_class_super_method_with_12_args(v_class, method_name, arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10, arg11);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/methods.lisp", position = 27953L)
    public static SubLObject funcall_instance_super_method_with_13_args(final SubLObject instance, final SubLObject method_name, final SubLObject arg0, final SubLObject arg1, final SubLObject arg2, final SubLObject arg3, final SubLObject arg4, final SubLObject arg5, final SubLObject arg6, final SubLObject arg7, final SubLObject arg8, final SubLObject arg9, final SubLObject arg10, final SubLObject arg11, final SubLObject arg12) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (methods.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && (methods.NIL == subloop_structures.instance_p(instance) || !method_name.isSymbol())) {
            Errors.error((SubLObject)methods.$str76$__FUNCALL_INSTANCE_METHOD__either, instance, method_name);
        }
        final SubLObject v_class = subloop_structures.instance_class(instance);
        final SubLObject method = method_shadowed_assoc(method_name, subloop_structures.class_compiled_instance_method_access_alist(v_class));
        if (methods.NIL != method) {
            if (methods.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && methods.NIL == instances.instances_access_check_method(v_class, method)) {
                Errors.error(classes_utilities.$classes_utilities_illegal_access_message$.getGlobalValue(), method_name, subloop_structures.class_name(v_class));
            }
            return Functions.funcall(subloop_structures.method_function_name(method), new SubLObject[] { instance, arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10, arg11, arg12 });
        }
        return funcall_class_super_method_with_13_args(v_class, method_name, arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10, arg11, arg12);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/methods.lisp", position = 27953L)
    public static SubLObject funcall_instance_super_method_with_14_args(final SubLObject instance, final SubLObject method_name, final SubLObject arg0, final SubLObject arg1, final SubLObject arg2, final SubLObject arg3, final SubLObject arg4, final SubLObject arg5, final SubLObject arg6, final SubLObject arg7, final SubLObject arg8, final SubLObject arg9, final SubLObject arg10, final SubLObject arg11, final SubLObject arg12, final SubLObject arg13) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (methods.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && (methods.NIL == subloop_structures.instance_p(instance) || !method_name.isSymbol())) {
            Errors.error((SubLObject)methods.$str76$__FUNCALL_INSTANCE_METHOD__either, instance, method_name);
        }
        final SubLObject v_class = subloop_structures.instance_class(instance);
        final SubLObject method = method_shadowed_assoc(method_name, subloop_structures.class_compiled_instance_method_access_alist(v_class));
        if (methods.NIL != method) {
            if (methods.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && methods.NIL == instances.instances_access_check_method(v_class, method)) {
                Errors.error(classes_utilities.$classes_utilities_illegal_access_message$.getGlobalValue(), method_name, subloop_structures.class_name(v_class));
            }
            return Functions.funcall(subloop_structures.method_function_name(method), new SubLObject[] { instance, arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10, arg11, arg12, arg13 });
        }
        return funcall_class_super_method_with_14_args(v_class, method_name, arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10, arg11, arg12, arg13);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/methods.lisp", position = 27953L)
    public static SubLObject funcall_instance_super_method_with_15_args(final SubLObject instance, final SubLObject method_name, final SubLObject arg0, final SubLObject arg1, final SubLObject arg2, final SubLObject arg3, final SubLObject arg4, final SubLObject arg5, final SubLObject arg6, final SubLObject arg7, final SubLObject arg8, final SubLObject arg9, final SubLObject arg10, final SubLObject arg11, final SubLObject arg12, final SubLObject arg13, final SubLObject arg14) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (methods.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && (methods.NIL == subloop_structures.instance_p(instance) || !method_name.isSymbol())) {
            Errors.error((SubLObject)methods.$str76$__FUNCALL_INSTANCE_METHOD__either, instance, method_name);
        }
        final SubLObject v_class = subloop_structures.instance_class(instance);
        final SubLObject method = method_shadowed_assoc(method_name, subloop_structures.class_compiled_instance_method_access_alist(v_class));
        if (methods.NIL != method) {
            if (methods.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && methods.NIL == instances.instances_access_check_method(v_class, method)) {
                Errors.error(classes_utilities.$classes_utilities_illegal_access_message$.getGlobalValue(), method_name, subloop_structures.class_name(v_class));
            }
            return Functions.funcall(subloop_structures.method_function_name(method), new SubLObject[] { instance, arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10, arg11, arg12, arg13, arg14 });
        }
        return funcall_class_super_method_with_15_args(v_class, method_name, arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10, arg11, arg12, arg13, arg14);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/methods.lisp", position = 27953L)
    public static SubLObject funcall_instance_super_method_with_16_args(final SubLObject instance, final SubLObject method_name, final SubLObject arg0, final SubLObject arg1, final SubLObject arg2, final SubLObject arg3, final SubLObject arg4, final SubLObject arg5, final SubLObject arg6, final SubLObject arg7, final SubLObject arg8, final SubLObject arg9, final SubLObject arg10, final SubLObject arg11, final SubLObject arg12, final SubLObject arg13, final SubLObject arg14, final SubLObject arg15) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (methods.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && (methods.NIL == subloop_structures.instance_p(instance) || !method_name.isSymbol())) {
            Errors.error((SubLObject)methods.$str76$__FUNCALL_INSTANCE_METHOD__either, instance, method_name);
        }
        final SubLObject v_class = subloop_structures.instance_class(instance);
        final SubLObject method = method_shadowed_assoc(method_name, subloop_structures.class_compiled_instance_method_access_alist(v_class));
        if (methods.NIL != method) {
            if (methods.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && methods.NIL == instances.instances_access_check_method(v_class, method)) {
                Errors.error(classes_utilities.$classes_utilities_illegal_access_message$.getGlobalValue(), method_name, subloop_structures.class_name(v_class));
            }
            return Functions.funcall(subloop_structures.method_function_name(method), new SubLObject[] { instance, arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10, arg11, arg12, arg13, arg14, arg15 });
        }
        return funcall_class_super_method_with_16_args(v_class, method_name, arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10, arg11, arg12, arg13, arg14, arg15);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/methods.lisp", position = 27953L)
    public static SubLObject funcall_instance_super_method_with_17_args(final SubLObject instance, final SubLObject method_name, final SubLObject arg0, final SubLObject arg1, final SubLObject arg2, final SubLObject arg3, final SubLObject arg4, final SubLObject arg5, final SubLObject arg6, final SubLObject arg7, final SubLObject arg8, final SubLObject arg9, final SubLObject arg10, final SubLObject arg11, final SubLObject arg12, final SubLObject arg13, final SubLObject arg14, final SubLObject arg15, final SubLObject arg16) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (methods.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && (methods.NIL == subloop_structures.instance_p(instance) || !method_name.isSymbol())) {
            Errors.error((SubLObject)methods.$str76$__FUNCALL_INSTANCE_METHOD__either, instance, method_name);
        }
        final SubLObject v_class = subloop_structures.instance_class(instance);
        final SubLObject method = method_shadowed_assoc(method_name, subloop_structures.class_compiled_instance_method_access_alist(v_class));
        if (methods.NIL != method) {
            if (methods.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && methods.NIL == instances.instances_access_check_method(v_class, method)) {
                Errors.error(classes_utilities.$classes_utilities_illegal_access_message$.getGlobalValue(), method_name, subloop_structures.class_name(v_class));
            }
            return Functions.funcall(subloop_structures.method_function_name(method), new SubLObject[] { instance, arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10, arg11, arg12, arg13, arg14, arg15, arg16 });
        }
        return funcall_class_super_method_with_17_args(v_class, method_name, arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10, arg11, arg12, arg13, arg14, arg15, arg16);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/methods.lisp", position = 27953L)
    public static SubLObject funcall_instance_super_method_with_18_args(final SubLObject instance, final SubLObject method_name, final SubLObject arg0, final SubLObject arg1, final SubLObject arg2, final SubLObject arg3, final SubLObject arg4, final SubLObject arg5, final SubLObject arg6, final SubLObject arg7, final SubLObject arg8, final SubLObject arg9, final SubLObject arg10, final SubLObject arg11, final SubLObject arg12, final SubLObject arg13, final SubLObject arg14, final SubLObject arg15, final SubLObject arg16, final SubLObject arg17) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (methods.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && (methods.NIL == subloop_structures.instance_p(instance) || !method_name.isSymbol())) {
            Errors.error((SubLObject)methods.$str76$__FUNCALL_INSTANCE_METHOD__either, instance, method_name);
        }
        final SubLObject v_class = subloop_structures.instance_class(instance);
        final SubLObject method = method_shadowed_assoc(method_name, subloop_structures.class_compiled_instance_method_access_alist(v_class));
        if (methods.NIL != method) {
            if (methods.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && methods.NIL == instances.instances_access_check_method(v_class, method)) {
                Errors.error(classes_utilities.$classes_utilities_illegal_access_message$.getGlobalValue(), method_name, subloop_structures.class_name(v_class));
            }
            return Functions.funcall(subloop_structures.method_function_name(method), new SubLObject[] { instance, arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10, arg11, arg12, arg13, arg14, arg15, arg16, arg17 });
        }
        return funcall_class_super_method_with_18_args(v_class, method_name, arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10, arg11, arg12, arg13, arg14, arg15, arg16, arg17);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/methods.lisp", position = 27953L)
    public static SubLObject funcall_instance_super_method_with_19_args(final SubLObject instance, final SubLObject method_name, final SubLObject arg0, final SubLObject arg1, final SubLObject arg2, final SubLObject arg3, final SubLObject arg4, final SubLObject arg5, final SubLObject arg6, final SubLObject arg7, final SubLObject arg8, final SubLObject arg9, final SubLObject arg10, final SubLObject arg11, final SubLObject arg12, final SubLObject arg13, final SubLObject arg14, final SubLObject arg15, final SubLObject arg16, final SubLObject arg17, final SubLObject arg18) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (methods.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && (methods.NIL == subloop_structures.instance_p(instance) || !method_name.isSymbol())) {
            Errors.error((SubLObject)methods.$str76$__FUNCALL_INSTANCE_METHOD__either, instance, method_name);
        }
        final SubLObject v_class = subloop_structures.instance_class(instance);
        final SubLObject method = method_shadowed_assoc(method_name, subloop_structures.class_compiled_instance_method_access_alist(v_class));
        if (methods.NIL != method) {
            if (methods.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && methods.NIL == instances.instances_access_check_method(v_class, method)) {
                Errors.error(classes_utilities.$classes_utilities_illegal_access_message$.getGlobalValue(), method_name, subloop_structures.class_name(v_class));
            }
            return Functions.funcall(subloop_structures.method_function_name(method), new SubLObject[] { instance, arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10, arg11, arg12, arg13, arg14, arg15, arg16, arg17, arg18 });
        }
        return funcall_class_super_method_with_19_args(v_class, method_name, arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10, arg11, arg12, arg13, arg14, arg15, arg16, arg17, arg18);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/methods.lisp", position = 27953L)
    public static SubLObject funcall_instance_super_method_with_20_args(final SubLObject instance, final SubLObject method_name, final SubLObject arg0, final SubLObject arg1, final SubLObject arg2, final SubLObject arg3, final SubLObject arg4, final SubLObject arg5, final SubLObject arg6, final SubLObject arg7, final SubLObject arg8, final SubLObject arg9, final SubLObject arg10, final SubLObject arg11, final SubLObject arg12, final SubLObject arg13, final SubLObject arg14, final SubLObject arg15, final SubLObject arg16, final SubLObject arg17, final SubLObject arg18, final SubLObject arg19) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (methods.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && (methods.NIL == subloop_structures.instance_p(instance) || !method_name.isSymbol())) {
            Errors.error((SubLObject)methods.$str76$__FUNCALL_INSTANCE_METHOD__either, instance, method_name);
        }
        final SubLObject v_class = subloop_structures.instance_class(instance);
        final SubLObject method = method_shadowed_assoc(method_name, subloop_structures.class_compiled_instance_method_access_alist(v_class));
        if (methods.NIL != method) {
            if (methods.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && methods.NIL == instances.instances_access_check_method(v_class, method)) {
                Errors.error(classes_utilities.$classes_utilities_illegal_access_message$.getGlobalValue(), method_name, subloop_structures.class_name(v_class));
            }
            return Functions.funcall(subloop_structures.method_function_name(method), new SubLObject[] { instance, arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10, arg11, arg12, arg13, arg14, arg15, arg16, arg17, arg18, arg19 });
        }
        return funcall_class_super_method_with_20_args(v_class, method_name, arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10, arg11, arg12, arg13, arg14, arg15, arg16, arg17, arg18, arg19);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/methods.lisp", position = 28763L)
    public static SubLObject funcall_class_or_instance_method_with_0_args(final SubLObject class_or_instance, final SubLObject method_name) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (methods.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && (methods.NIL == method_name || !method_name.isSymbol())) {
            Errors.error((SubLObject)methods.$str77$__FUNCALL_CLASS_OR_INSTANCE_METHO, method_name);
        }
        if (methods.NIL == subloop_structures.instance_p(class_or_instance)) {
            final SubLObject v_class = (methods.NIL != subloop_structures.class_p(class_or_instance)) ? class_or_instance : classes.classes_retrieve_class(class_or_instance);
            final SubLObject method = (SubLObject)((methods.NIL != v_class) ? method_assoc(method_name, subloop_structures.class_compiled_class_method_access_alist(v_class)) : methods.NIL);
            if (methods.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && methods.NIL == v_class) {
                Errors.error((SubLObject)methods.$str78$FUNCALL_CLASS_OR_INSTANCE_METHOD_, v_class);
            }
            if (methods.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && methods.NIL == method) {
                Errors.error(classes_utilities.$classes_utilities_undefined_class_method_message$.getGlobalValue(), method_name, v_class);
            }
            if (methods.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && methods.NIL == instances.instances_access_check_method(v_class, method)) {
                Errors.error(classes_utilities.$classes_utilities_illegal_access_message$.getGlobalValue(), method_name, subloop_structures.class_name(v_class));
            }
            return Functions.funcall(subloop_structures.method_function_name(method), v_class);
        }
        final SubLObject v_class = subloop_structures.instance_class(class_or_instance);
        final SubLObject method = Hashtables.gethash(method_name, subloop_structures.class_tablified_instance_methods(v_class), (SubLObject)methods.UNPROVIDED);
        if (methods.NIL != method) {
            if (methods.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && methods.NIL == instances.instances_access_check_method(v_class, method)) {
                Errors.error(classes_utilities.$classes_utilities_illegal_access_message$.getGlobalValue(), method_name, subloop_structures.class_name(v_class));
            }
            return Functions.funcall(subloop_structures.method_function_name(method), class_or_instance);
        }
        Errors.error((SubLObject)methods.$str77$__FUNCALL_CLASS_OR_INSTANCE_METHO, method_name);
        return (SubLObject)methods.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/methods.lisp", position = 28763L)
    public static SubLObject funcall_class_or_instance_method_with_1_args(final SubLObject class_or_instance, final SubLObject method_name, final SubLObject arg0) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (methods.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && (methods.NIL == method_name || !method_name.isSymbol())) {
            Errors.error((SubLObject)methods.$str77$__FUNCALL_CLASS_OR_INSTANCE_METHO, method_name);
        }
        if (methods.NIL == subloop_structures.instance_p(class_or_instance)) {
            final SubLObject v_class = (methods.NIL != subloop_structures.class_p(class_or_instance)) ? class_or_instance : classes.classes_retrieve_class(class_or_instance);
            final SubLObject method = (SubLObject)((methods.NIL != v_class) ? method_assoc(method_name, subloop_structures.class_compiled_class_method_access_alist(v_class)) : methods.NIL);
            if (methods.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && methods.NIL == v_class) {
                Errors.error((SubLObject)methods.$str78$FUNCALL_CLASS_OR_INSTANCE_METHOD_, v_class);
            }
            if (methods.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && methods.NIL == method) {
                Errors.error(classes_utilities.$classes_utilities_undefined_class_method_message$.getGlobalValue(), method_name, v_class);
            }
            if (methods.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && methods.NIL == instances.instances_access_check_method(v_class, method)) {
                Errors.error(classes_utilities.$classes_utilities_illegal_access_message$.getGlobalValue(), method_name, subloop_structures.class_name(v_class));
            }
            return Functions.funcall(subloop_structures.method_function_name(method), v_class, arg0);
        }
        final SubLObject v_class = subloop_structures.instance_class(class_or_instance);
        final SubLObject method = Hashtables.gethash(method_name, subloop_structures.class_tablified_instance_methods(v_class), (SubLObject)methods.UNPROVIDED);
        if (methods.NIL != method) {
            if (methods.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && methods.NIL == instances.instances_access_check_method(v_class, method)) {
                Errors.error(classes_utilities.$classes_utilities_illegal_access_message$.getGlobalValue(), method_name, subloop_structures.class_name(v_class));
            }
            return Functions.funcall(subloop_structures.method_function_name(method), class_or_instance, arg0);
        }
        Errors.error((SubLObject)methods.$str77$__FUNCALL_CLASS_OR_INSTANCE_METHO, method_name);
        return (SubLObject)methods.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/methods.lisp", position = 28763L)
    public static SubLObject funcall_class_or_instance_method_with_2_args(final SubLObject class_or_instance, final SubLObject method_name, final SubLObject arg0, final SubLObject arg1) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (methods.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && (methods.NIL == method_name || !method_name.isSymbol())) {
            Errors.error((SubLObject)methods.$str77$__FUNCALL_CLASS_OR_INSTANCE_METHO, method_name);
        }
        if (methods.NIL == subloop_structures.instance_p(class_or_instance)) {
            final SubLObject v_class = (methods.NIL != subloop_structures.class_p(class_or_instance)) ? class_or_instance : classes.classes_retrieve_class(class_or_instance);
            final SubLObject method = (SubLObject)((methods.NIL != v_class) ? method_assoc(method_name, subloop_structures.class_compiled_class_method_access_alist(v_class)) : methods.NIL);
            if (methods.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && methods.NIL == v_class) {
                Errors.error((SubLObject)methods.$str78$FUNCALL_CLASS_OR_INSTANCE_METHOD_, v_class);
            }
            if (methods.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && methods.NIL == method) {
                Errors.error(classes_utilities.$classes_utilities_undefined_class_method_message$.getGlobalValue(), method_name, v_class);
            }
            if (methods.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && methods.NIL == instances.instances_access_check_method(v_class, method)) {
                Errors.error(classes_utilities.$classes_utilities_illegal_access_message$.getGlobalValue(), method_name, subloop_structures.class_name(v_class));
            }
            return Functions.funcall(subloop_structures.method_function_name(method), v_class, arg0, arg1);
        }
        final SubLObject v_class = subloop_structures.instance_class(class_or_instance);
        final SubLObject method = Hashtables.gethash(method_name, subloop_structures.class_tablified_instance_methods(v_class), (SubLObject)methods.UNPROVIDED);
        if (methods.NIL != method) {
            if (methods.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && methods.NIL == instances.instances_access_check_method(v_class, method)) {
                Errors.error(classes_utilities.$classes_utilities_illegal_access_message$.getGlobalValue(), method_name, subloop_structures.class_name(v_class));
            }
            return Functions.funcall(subloop_structures.method_function_name(method), class_or_instance, arg0, arg1);
        }
        Errors.error((SubLObject)methods.$str77$__FUNCALL_CLASS_OR_INSTANCE_METHO, method_name);
        return (SubLObject)methods.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/methods.lisp", position = 28763L)
    public static SubLObject funcall_class_or_instance_method_with_3_args(final SubLObject class_or_instance, final SubLObject method_name, final SubLObject arg0, final SubLObject arg1, final SubLObject arg2) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (methods.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && (methods.NIL == method_name || !method_name.isSymbol())) {
            Errors.error((SubLObject)methods.$str77$__FUNCALL_CLASS_OR_INSTANCE_METHO, method_name);
        }
        if (methods.NIL == subloop_structures.instance_p(class_or_instance)) {
            final SubLObject v_class = (methods.NIL != subloop_structures.class_p(class_or_instance)) ? class_or_instance : classes.classes_retrieve_class(class_or_instance);
            final SubLObject method = (SubLObject)((methods.NIL != v_class) ? method_assoc(method_name, subloop_structures.class_compiled_class_method_access_alist(v_class)) : methods.NIL);
            if (methods.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && methods.NIL == v_class) {
                Errors.error((SubLObject)methods.$str78$FUNCALL_CLASS_OR_INSTANCE_METHOD_, v_class);
            }
            if (methods.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && methods.NIL == method) {
                Errors.error(classes_utilities.$classes_utilities_undefined_class_method_message$.getGlobalValue(), method_name, v_class);
            }
            if (methods.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && methods.NIL == instances.instances_access_check_method(v_class, method)) {
                Errors.error(classes_utilities.$classes_utilities_illegal_access_message$.getGlobalValue(), method_name, subloop_structures.class_name(v_class));
            }
            return Functions.funcall(subloop_structures.method_function_name(method), v_class, arg0, arg1, arg2);
        }
        final SubLObject v_class = subloop_structures.instance_class(class_or_instance);
        final SubLObject method = Hashtables.gethash(method_name, subloop_structures.class_tablified_instance_methods(v_class), (SubLObject)methods.UNPROVIDED);
        if (methods.NIL != method) {
            if (methods.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && methods.NIL == instances.instances_access_check_method(v_class, method)) {
                Errors.error(classes_utilities.$classes_utilities_illegal_access_message$.getGlobalValue(), method_name, subloop_structures.class_name(v_class));
            }
            return Functions.funcall(subloop_structures.method_function_name(method), class_or_instance, arg0, arg1, arg2);
        }
        Errors.error((SubLObject)methods.$str77$__FUNCALL_CLASS_OR_INSTANCE_METHO, method_name);
        return (SubLObject)methods.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/methods.lisp", position = 28763L)
    public static SubLObject funcall_class_or_instance_method_with_4_args(final SubLObject class_or_instance, final SubLObject method_name, final SubLObject arg0, final SubLObject arg1, final SubLObject arg2, final SubLObject arg3) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (methods.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && (methods.NIL == method_name || !method_name.isSymbol())) {
            Errors.error((SubLObject)methods.$str77$__FUNCALL_CLASS_OR_INSTANCE_METHO, method_name);
        }
        if (methods.NIL == subloop_structures.instance_p(class_or_instance)) {
            final SubLObject v_class = (methods.NIL != subloop_structures.class_p(class_or_instance)) ? class_or_instance : classes.classes_retrieve_class(class_or_instance);
            final SubLObject method = (SubLObject)((methods.NIL != v_class) ? method_assoc(method_name, subloop_structures.class_compiled_class_method_access_alist(v_class)) : methods.NIL);
            if (methods.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && methods.NIL == v_class) {
                Errors.error((SubLObject)methods.$str78$FUNCALL_CLASS_OR_INSTANCE_METHOD_, v_class);
            }
            if (methods.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && methods.NIL == method) {
                Errors.error(classes_utilities.$classes_utilities_undefined_class_method_message$.getGlobalValue(), method_name, v_class);
            }
            if (methods.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && methods.NIL == instances.instances_access_check_method(v_class, method)) {
                Errors.error(classes_utilities.$classes_utilities_illegal_access_message$.getGlobalValue(), method_name, subloop_structures.class_name(v_class));
            }
            return Functions.funcall(subloop_structures.method_function_name(method), v_class, arg0, arg1, arg2, arg3);
        }
        final SubLObject v_class = subloop_structures.instance_class(class_or_instance);
        final SubLObject method = Hashtables.gethash(method_name, subloop_structures.class_tablified_instance_methods(v_class), (SubLObject)methods.UNPROVIDED);
        if (methods.NIL != method) {
            if (methods.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && methods.NIL == instances.instances_access_check_method(v_class, method)) {
                Errors.error(classes_utilities.$classes_utilities_illegal_access_message$.getGlobalValue(), method_name, subloop_structures.class_name(v_class));
            }
            return Functions.funcall(subloop_structures.method_function_name(method), class_or_instance, arg0, arg1, arg2, arg3);
        }
        Errors.error((SubLObject)methods.$str77$__FUNCALL_CLASS_OR_INSTANCE_METHO, method_name);
        return (SubLObject)methods.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/methods.lisp", position = 28763L)
    public static SubLObject funcall_class_or_instance_method_with_5_args(final SubLObject class_or_instance, final SubLObject method_name, final SubLObject arg0, final SubLObject arg1, final SubLObject arg2, final SubLObject arg3, final SubLObject arg4) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (methods.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && (methods.NIL == method_name || !method_name.isSymbol())) {
            Errors.error((SubLObject)methods.$str77$__FUNCALL_CLASS_OR_INSTANCE_METHO, method_name);
        }
        if (methods.NIL == subloop_structures.instance_p(class_or_instance)) {
            final SubLObject v_class = (methods.NIL != subloop_structures.class_p(class_or_instance)) ? class_or_instance : classes.classes_retrieve_class(class_or_instance);
            final SubLObject method = (SubLObject)((methods.NIL != v_class) ? method_assoc(method_name, subloop_structures.class_compiled_class_method_access_alist(v_class)) : methods.NIL);
            if (methods.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && methods.NIL == v_class) {
                Errors.error((SubLObject)methods.$str78$FUNCALL_CLASS_OR_INSTANCE_METHOD_, v_class);
            }
            if (methods.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && methods.NIL == method) {
                Errors.error(classes_utilities.$classes_utilities_undefined_class_method_message$.getGlobalValue(), method_name, v_class);
            }
            if (methods.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && methods.NIL == instances.instances_access_check_method(v_class, method)) {
                Errors.error(classes_utilities.$classes_utilities_illegal_access_message$.getGlobalValue(), method_name, subloop_structures.class_name(v_class));
            }
            return Functions.funcall(subloop_structures.method_function_name(method), v_class, arg0, arg1, arg2, arg3, arg4);
        }
        final SubLObject v_class = subloop_structures.instance_class(class_or_instance);
        final SubLObject method = Hashtables.gethash(method_name, subloop_structures.class_tablified_instance_methods(v_class), (SubLObject)methods.UNPROVIDED);
        if (methods.NIL != method) {
            if (methods.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && methods.NIL == instances.instances_access_check_method(v_class, method)) {
                Errors.error(classes_utilities.$classes_utilities_illegal_access_message$.getGlobalValue(), method_name, subloop_structures.class_name(v_class));
            }
            return Functions.funcall(subloop_structures.method_function_name(method), class_or_instance, arg0, arg1, arg2, arg3, arg4);
        }
        Errors.error((SubLObject)methods.$str77$__FUNCALL_CLASS_OR_INSTANCE_METHO, method_name);
        return (SubLObject)methods.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/methods.lisp", position = 28763L)
    public static SubLObject funcall_class_or_instance_method_with_6_args(final SubLObject class_or_instance, final SubLObject method_name, final SubLObject arg0, final SubLObject arg1, final SubLObject arg2, final SubLObject arg3, final SubLObject arg4, final SubLObject arg5) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (methods.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && (methods.NIL == method_name || !method_name.isSymbol())) {
            Errors.error((SubLObject)methods.$str77$__FUNCALL_CLASS_OR_INSTANCE_METHO, method_name);
        }
        if (methods.NIL == subloop_structures.instance_p(class_or_instance)) {
            final SubLObject v_class = (methods.NIL != subloop_structures.class_p(class_or_instance)) ? class_or_instance : classes.classes_retrieve_class(class_or_instance);
            final SubLObject method = (SubLObject)((methods.NIL != v_class) ? method_assoc(method_name, subloop_structures.class_compiled_class_method_access_alist(v_class)) : methods.NIL);
            if (methods.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && methods.NIL == v_class) {
                Errors.error((SubLObject)methods.$str78$FUNCALL_CLASS_OR_INSTANCE_METHOD_, v_class);
            }
            if (methods.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && methods.NIL == method) {
                Errors.error(classes_utilities.$classes_utilities_undefined_class_method_message$.getGlobalValue(), method_name, v_class);
            }
            if (methods.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && methods.NIL == instances.instances_access_check_method(v_class, method)) {
                Errors.error(classes_utilities.$classes_utilities_illegal_access_message$.getGlobalValue(), method_name, subloop_structures.class_name(v_class));
            }
            return Functions.funcall(subloop_structures.method_function_name(method), new SubLObject[] { v_class, arg0, arg1, arg2, arg3, arg4, arg5 });
        }
        final SubLObject v_class = subloop_structures.instance_class(class_or_instance);
        final SubLObject method = Hashtables.gethash(method_name, subloop_structures.class_tablified_instance_methods(v_class), (SubLObject)methods.UNPROVIDED);
        if (methods.NIL != method) {
            if (methods.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && methods.NIL == instances.instances_access_check_method(v_class, method)) {
                Errors.error(classes_utilities.$classes_utilities_illegal_access_message$.getGlobalValue(), method_name, subloop_structures.class_name(v_class));
            }
            return Functions.funcall(subloop_structures.method_function_name(method), new SubLObject[] { class_or_instance, arg0, arg1, arg2, arg3, arg4, arg5 });
        }
        Errors.error((SubLObject)methods.$str77$__FUNCALL_CLASS_OR_INSTANCE_METHO, method_name);
        return (SubLObject)methods.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/methods.lisp", position = 28763L)
    public static SubLObject funcall_class_or_instance_method_with_7_args(final SubLObject class_or_instance, final SubLObject method_name, final SubLObject arg0, final SubLObject arg1, final SubLObject arg2, final SubLObject arg3, final SubLObject arg4, final SubLObject arg5, final SubLObject arg6) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (methods.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && (methods.NIL == method_name || !method_name.isSymbol())) {
            Errors.error((SubLObject)methods.$str77$__FUNCALL_CLASS_OR_INSTANCE_METHO, method_name);
        }
        if (methods.NIL == subloop_structures.instance_p(class_or_instance)) {
            final SubLObject v_class = (methods.NIL != subloop_structures.class_p(class_or_instance)) ? class_or_instance : classes.classes_retrieve_class(class_or_instance);
            final SubLObject method = (SubLObject)((methods.NIL != v_class) ? method_assoc(method_name, subloop_structures.class_compiled_class_method_access_alist(v_class)) : methods.NIL);
            if (methods.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && methods.NIL == v_class) {
                Errors.error((SubLObject)methods.$str78$FUNCALL_CLASS_OR_INSTANCE_METHOD_, v_class);
            }
            if (methods.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && methods.NIL == method) {
                Errors.error(classes_utilities.$classes_utilities_undefined_class_method_message$.getGlobalValue(), method_name, v_class);
            }
            if (methods.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && methods.NIL == instances.instances_access_check_method(v_class, method)) {
                Errors.error(classes_utilities.$classes_utilities_illegal_access_message$.getGlobalValue(), method_name, subloop_structures.class_name(v_class));
            }
            return Functions.funcall(subloop_structures.method_function_name(method), new SubLObject[] { v_class, arg0, arg1, arg2, arg3, arg4, arg5, arg6 });
        }
        final SubLObject v_class = subloop_structures.instance_class(class_or_instance);
        final SubLObject method = Hashtables.gethash(method_name, subloop_structures.class_tablified_instance_methods(v_class), (SubLObject)methods.UNPROVIDED);
        if (methods.NIL != method) {
            if (methods.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && methods.NIL == instances.instances_access_check_method(v_class, method)) {
                Errors.error(classes_utilities.$classes_utilities_illegal_access_message$.getGlobalValue(), method_name, subloop_structures.class_name(v_class));
            }
            return Functions.funcall(subloop_structures.method_function_name(method), new SubLObject[] { class_or_instance, arg0, arg1, arg2, arg3, arg4, arg5, arg6 });
        }
        Errors.error((SubLObject)methods.$str77$__FUNCALL_CLASS_OR_INSTANCE_METHO, method_name);
        return (SubLObject)methods.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/methods.lisp", position = 28763L)
    public static SubLObject funcall_class_or_instance_method_with_8_args(final SubLObject class_or_instance, final SubLObject method_name, final SubLObject arg0, final SubLObject arg1, final SubLObject arg2, final SubLObject arg3, final SubLObject arg4, final SubLObject arg5, final SubLObject arg6, final SubLObject arg7) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (methods.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && (methods.NIL == method_name || !method_name.isSymbol())) {
            Errors.error((SubLObject)methods.$str77$__FUNCALL_CLASS_OR_INSTANCE_METHO, method_name);
        }
        if (methods.NIL == subloop_structures.instance_p(class_or_instance)) {
            final SubLObject v_class = (methods.NIL != subloop_structures.class_p(class_or_instance)) ? class_or_instance : classes.classes_retrieve_class(class_or_instance);
            final SubLObject method = (SubLObject)((methods.NIL != v_class) ? method_assoc(method_name, subloop_structures.class_compiled_class_method_access_alist(v_class)) : methods.NIL);
            if (methods.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && methods.NIL == v_class) {
                Errors.error((SubLObject)methods.$str78$FUNCALL_CLASS_OR_INSTANCE_METHOD_, v_class);
            }
            if (methods.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && methods.NIL == method) {
                Errors.error(classes_utilities.$classes_utilities_undefined_class_method_message$.getGlobalValue(), method_name, v_class);
            }
            if (methods.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && methods.NIL == instances.instances_access_check_method(v_class, method)) {
                Errors.error(classes_utilities.$classes_utilities_illegal_access_message$.getGlobalValue(), method_name, subloop_structures.class_name(v_class));
            }
            return Functions.funcall(subloop_structures.method_function_name(method), new SubLObject[] { v_class, arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7 });
        }
        final SubLObject v_class = subloop_structures.instance_class(class_or_instance);
        final SubLObject method = Hashtables.gethash(method_name, subloop_structures.class_tablified_instance_methods(v_class), (SubLObject)methods.UNPROVIDED);
        if (methods.NIL != method) {
            if (methods.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && methods.NIL == instances.instances_access_check_method(v_class, method)) {
                Errors.error(classes_utilities.$classes_utilities_illegal_access_message$.getGlobalValue(), method_name, subloop_structures.class_name(v_class));
            }
            return Functions.funcall(subloop_structures.method_function_name(method), new SubLObject[] { class_or_instance, arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7 });
        }
        Errors.error((SubLObject)methods.$str77$__FUNCALL_CLASS_OR_INSTANCE_METHO, method_name);
        return (SubLObject)methods.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/methods.lisp", position = 28763L)
    public static SubLObject funcall_class_or_instance_method_with_9_args(final SubLObject class_or_instance, final SubLObject method_name, final SubLObject arg0, final SubLObject arg1, final SubLObject arg2, final SubLObject arg3, final SubLObject arg4, final SubLObject arg5, final SubLObject arg6, final SubLObject arg7, final SubLObject arg8) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (methods.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && (methods.NIL == method_name || !method_name.isSymbol())) {
            Errors.error((SubLObject)methods.$str77$__FUNCALL_CLASS_OR_INSTANCE_METHO, method_name);
        }
        if (methods.NIL == subloop_structures.instance_p(class_or_instance)) {
            final SubLObject v_class = (methods.NIL != subloop_structures.class_p(class_or_instance)) ? class_or_instance : classes.classes_retrieve_class(class_or_instance);
            final SubLObject method = (SubLObject)((methods.NIL != v_class) ? method_assoc(method_name, subloop_structures.class_compiled_class_method_access_alist(v_class)) : methods.NIL);
            if (methods.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && methods.NIL == v_class) {
                Errors.error((SubLObject)methods.$str78$FUNCALL_CLASS_OR_INSTANCE_METHOD_, v_class);
            }
            if (methods.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && methods.NIL == method) {
                Errors.error(classes_utilities.$classes_utilities_undefined_class_method_message$.getGlobalValue(), method_name, v_class);
            }
            if (methods.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && methods.NIL == instances.instances_access_check_method(v_class, method)) {
                Errors.error(classes_utilities.$classes_utilities_illegal_access_message$.getGlobalValue(), method_name, subloop_structures.class_name(v_class));
            }
            return Functions.funcall(subloop_structures.method_function_name(method), new SubLObject[] { v_class, arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8 });
        }
        final SubLObject v_class = subloop_structures.instance_class(class_or_instance);
        final SubLObject method = Hashtables.gethash(method_name, subloop_structures.class_tablified_instance_methods(v_class), (SubLObject)methods.UNPROVIDED);
        if (methods.NIL != method) {
            if (methods.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && methods.NIL == instances.instances_access_check_method(v_class, method)) {
                Errors.error(classes_utilities.$classes_utilities_illegal_access_message$.getGlobalValue(), method_name, subloop_structures.class_name(v_class));
            }
            return Functions.funcall(subloop_structures.method_function_name(method), new SubLObject[] { class_or_instance, arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8 });
        }
        Errors.error((SubLObject)methods.$str77$__FUNCALL_CLASS_OR_INSTANCE_METHO, method_name);
        return (SubLObject)methods.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/methods.lisp", position = 28763L)
    public static SubLObject funcall_class_or_instance_method_with_10_args(final SubLObject class_or_instance, final SubLObject method_name, final SubLObject arg0, final SubLObject arg1, final SubLObject arg2, final SubLObject arg3, final SubLObject arg4, final SubLObject arg5, final SubLObject arg6, final SubLObject arg7, final SubLObject arg8, final SubLObject arg9) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (methods.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && (methods.NIL == method_name || !method_name.isSymbol())) {
            Errors.error((SubLObject)methods.$str77$__FUNCALL_CLASS_OR_INSTANCE_METHO, method_name);
        }
        if (methods.NIL == subloop_structures.instance_p(class_or_instance)) {
            final SubLObject v_class = (methods.NIL != subloop_structures.class_p(class_or_instance)) ? class_or_instance : classes.classes_retrieve_class(class_or_instance);
            final SubLObject method = (SubLObject)((methods.NIL != v_class) ? method_assoc(method_name, subloop_structures.class_compiled_class_method_access_alist(v_class)) : methods.NIL);
            if (methods.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && methods.NIL == v_class) {
                Errors.error((SubLObject)methods.$str78$FUNCALL_CLASS_OR_INSTANCE_METHOD_, v_class);
            }
            if (methods.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && methods.NIL == method) {
                Errors.error(classes_utilities.$classes_utilities_undefined_class_method_message$.getGlobalValue(), method_name, v_class);
            }
            if (methods.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && methods.NIL == instances.instances_access_check_method(v_class, method)) {
                Errors.error(classes_utilities.$classes_utilities_illegal_access_message$.getGlobalValue(), method_name, subloop_structures.class_name(v_class));
            }
            return Functions.funcall(subloop_structures.method_function_name(method), new SubLObject[] { v_class, arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9 });
        }
        final SubLObject v_class = subloop_structures.instance_class(class_or_instance);
        final SubLObject method = Hashtables.gethash(method_name, subloop_structures.class_tablified_instance_methods(v_class), (SubLObject)methods.UNPROVIDED);
        if (methods.NIL != method) {
            if (methods.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && methods.NIL == instances.instances_access_check_method(v_class, method)) {
                Errors.error(classes_utilities.$classes_utilities_illegal_access_message$.getGlobalValue(), method_name, subloop_structures.class_name(v_class));
            }
            return Functions.funcall(subloop_structures.method_function_name(method), new SubLObject[] { class_or_instance, arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9 });
        }
        Errors.error((SubLObject)methods.$str77$__FUNCALL_CLASS_OR_INSTANCE_METHO, method_name);
        return (SubLObject)methods.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/methods.lisp", position = 28763L)
    public static SubLObject funcall_class_or_instance_method_with_11_args(final SubLObject class_or_instance, final SubLObject method_name, final SubLObject arg0, final SubLObject arg1, final SubLObject arg2, final SubLObject arg3, final SubLObject arg4, final SubLObject arg5, final SubLObject arg6, final SubLObject arg7, final SubLObject arg8, final SubLObject arg9, final SubLObject arg10) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (methods.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && (methods.NIL == method_name || !method_name.isSymbol())) {
            Errors.error((SubLObject)methods.$str77$__FUNCALL_CLASS_OR_INSTANCE_METHO, method_name);
        }
        if (methods.NIL == subloop_structures.instance_p(class_or_instance)) {
            final SubLObject v_class = (methods.NIL != subloop_structures.class_p(class_or_instance)) ? class_or_instance : classes.classes_retrieve_class(class_or_instance);
            final SubLObject method = (SubLObject)((methods.NIL != v_class) ? method_assoc(method_name, subloop_structures.class_compiled_class_method_access_alist(v_class)) : methods.NIL);
            if (methods.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && methods.NIL == v_class) {
                Errors.error((SubLObject)methods.$str78$FUNCALL_CLASS_OR_INSTANCE_METHOD_, v_class);
            }
            if (methods.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && methods.NIL == method) {
                Errors.error(classes_utilities.$classes_utilities_undefined_class_method_message$.getGlobalValue(), method_name, v_class);
            }
            if (methods.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && methods.NIL == instances.instances_access_check_method(v_class, method)) {
                Errors.error(classes_utilities.$classes_utilities_illegal_access_message$.getGlobalValue(), method_name, subloop_structures.class_name(v_class));
            }
            return Functions.funcall(subloop_structures.method_function_name(method), new SubLObject[] { v_class, arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10 });
        }
        final SubLObject v_class = subloop_structures.instance_class(class_or_instance);
        final SubLObject method = Hashtables.gethash(method_name, subloop_structures.class_tablified_instance_methods(v_class), (SubLObject)methods.UNPROVIDED);
        if (methods.NIL != method) {
            if (methods.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && methods.NIL == instances.instances_access_check_method(v_class, method)) {
                Errors.error(classes_utilities.$classes_utilities_illegal_access_message$.getGlobalValue(), method_name, subloop_structures.class_name(v_class));
            }
            return Functions.funcall(subloop_structures.method_function_name(method), new SubLObject[] { class_or_instance, arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10 });
        }
        Errors.error((SubLObject)methods.$str77$__FUNCALL_CLASS_OR_INSTANCE_METHO, method_name);
        return (SubLObject)methods.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/methods.lisp", position = 28763L)
    public static SubLObject funcall_class_or_instance_method_with_12_args(final SubLObject class_or_instance, final SubLObject method_name, final SubLObject arg0, final SubLObject arg1, final SubLObject arg2, final SubLObject arg3, final SubLObject arg4, final SubLObject arg5, final SubLObject arg6, final SubLObject arg7, final SubLObject arg8, final SubLObject arg9, final SubLObject arg10, final SubLObject arg11) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (methods.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && (methods.NIL == method_name || !method_name.isSymbol())) {
            Errors.error((SubLObject)methods.$str77$__FUNCALL_CLASS_OR_INSTANCE_METHO, method_name);
        }
        if (methods.NIL == subloop_structures.instance_p(class_or_instance)) {
            final SubLObject v_class = (methods.NIL != subloop_structures.class_p(class_or_instance)) ? class_or_instance : classes.classes_retrieve_class(class_or_instance);
            final SubLObject method = (SubLObject)((methods.NIL != v_class) ? method_assoc(method_name, subloop_structures.class_compiled_class_method_access_alist(v_class)) : methods.NIL);
            if (methods.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && methods.NIL == v_class) {
                Errors.error((SubLObject)methods.$str78$FUNCALL_CLASS_OR_INSTANCE_METHOD_, v_class);
            }
            if (methods.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && methods.NIL == method) {
                Errors.error(classes_utilities.$classes_utilities_undefined_class_method_message$.getGlobalValue(), method_name, v_class);
            }
            if (methods.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && methods.NIL == instances.instances_access_check_method(v_class, method)) {
                Errors.error(classes_utilities.$classes_utilities_illegal_access_message$.getGlobalValue(), method_name, subloop_structures.class_name(v_class));
            }
            return Functions.funcall(subloop_structures.method_function_name(method), new SubLObject[] { v_class, arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10, arg11 });
        }
        final SubLObject v_class = subloop_structures.instance_class(class_or_instance);
        final SubLObject method = Hashtables.gethash(method_name, subloop_structures.class_tablified_instance_methods(v_class), (SubLObject)methods.UNPROVIDED);
        if (methods.NIL != method) {
            if (methods.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && methods.NIL == instances.instances_access_check_method(v_class, method)) {
                Errors.error(classes_utilities.$classes_utilities_illegal_access_message$.getGlobalValue(), method_name, subloop_structures.class_name(v_class));
            }
            return Functions.funcall(subloop_structures.method_function_name(method), new SubLObject[] { class_or_instance, arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10, arg11 });
        }
        Errors.error((SubLObject)methods.$str77$__FUNCALL_CLASS_OR_INSTANCE_METHO, method_name);
        return (SubLObject)methods.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/methods.lisp", position = 28763L)
    public static SubLObject funcall_class_or_instance_method_with_13_args(final SubLObject class_or_instance, final SubLObject method_name, final SubLObject arg0, final SubLObject arg1, final SubLObject arg2, final SubLObject arg3, final SubLObject arg4, final SubLObject arg5, final SubLObject arg6, final SubLObject arg7, final SubLObject arg8, final SubLObject arg9, final SubLObject arg10, final SubLObject arg11, final SubLObject arg12) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (methods.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && (methods.NIL == method_name || !method_name.isSymbol())) {
            Errors.error((SubLObject)methods.$str77$__FUNCALL_CLASS_OR_INSTANCE_METHO, method_name);
        }
        if (methods.NIL == subloop_structures.instance_p(class_or_instance)) {
            final SubLObject v_class = (methods.NIL != subloop_structures.class_p(class_or_instance)) ? class_or_instance : classes.classes_retrieve_class(class_or_instance);
            final SubLObject method = (SubLObject)((methods.NIL != v_class) ? method_assoc(method_name, subloop_structures.class_compiled_class_method_access_alist(v_class)) : methods.NIL);
            if (methods.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && methods.NIL == v_class) {
                Errors.error((SubLObject)methods.$str78$FUNCALL_CLASS_OR_INSTANCE_METHOD_, v_class);
            }
            if (methods.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && methods.NIL == method) {
                Errors.error(classes_utilities.$classes_utilities_undefined_class_method_message$.getGlobalValue(), method_name, v_class);
            }
            if (methods.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && methods.NIL == instances.instances_access_check_method(v_class, method)) {
                Errors.error(classes_utilities.$classes_utilities_illegal_access_message$.getGlobalValue(), method_name, subloop_structures.class_name(v_class));
            }
            return Functions.funcall(subloop_structures.method_function_name(method), new SubLObject[] { v_class, arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10, arg11, arg12 });
        }
        final SubLObject v_class = subloop_structures.instance_class(class_or_instance);
        final SubLObject method = Hashtables.gethash(method_name, subloop_structures.class_tablified_instance_methods(v_class), (SubLObject)methods.UNPROVIDED);
        if (methods.NIL != method) {
            if (methods.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && methods.NIL == instances.instances_access_check_method(v_class, method)) {
                Errors.error(classes_utilities.$classes_utilities_illegal_access_message$.getGlobalValue(), method_name, subloop_structures.class_name(v_class));
            }
            return Functions.funcall(subloop_structures.method_function_name(method), new SubLObject[] { class_or_instance, arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10, arg11, arg12 });
        }
        Errors.error((SubLObject)methods.$str77$__FUNCALL_CLASS_OR_INSTANCE_METHO, method_name);
        return (SubLObject)methods.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/methods.lisp", position = 28763L)
    public static SubLObject funcall_class_or_instance_method_with_14_args(final SubLObject class_or_instance, final SubLObject method_name, final SubLObject arg0, final SubLObject arg1, final SubLObject arg2, final SubLObject arg3, final SubLObject arg4, final SubLObject arg5, final SubLObject arg6, final SubLObject arg7, final SubLObject arg8, final SubLObject arg9, final SubLObject arg10, final SubLObject arg11, final SubLObject arg12, final SubLObject arg13) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (methods.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && (methods.NIL == method_name || !method_name.isSymbol())) {
            Errors.error((SubLObject)methods.$str77$__FUNCALL_CLASS_OR_INSTANCE_METHO, method_name);
        }
        if (methods.NIL == subloop_structures.instance_p(class_or_instance)) {
            final SubLObject v_class = (methods.NIL != subloop_structures.class_p(class_or_instance)) ? class_or_instance : classes.classes_retrieve_class(class_or_instance);
            final SubLObject method = (SubLObject)((methods.NIL != v_class) ? method_assoc(method_name, subloop_structures.class_compiled_class_method_access_alist(v_class)) : methods.NIL);
            if (methods.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && methods.NIL == v_class) {
                Errors.error((SubLObject)methods.$str78$FUNCALL_CLASS_OR_INSTANCE_METHOD_, v_class);
            }
            if (methods.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && methods.NIL == method) {
                Errors.error(classes_utilities.$classes_utilities_undefined_class_method_message$.getGlobalValue(), method_name, v_class);
            }
            if (methods.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && methods.NIL == instances.instances_access_check_method(v_class, method)) {
                Errors.error(classes_utilities.$classes_utilities_illegal_access_message$.getGlobalValue(), method_name, subloop_structures.class_name(v_class));
            }
            return Functions.funcall(subloop_structures.method_function_name(method), new SubLObject[] { v_class, arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10, arg11, arg12, arg13 });
        }
        final SubLObject v_class = subloop_structures.instance_class(class_or_instance);
        final SubLObject method = Hashtables.gethash(method_name, subloop_structures.class_tablified_instance_methods(v_class), (SubLObject)methods.UNPROVIDED);
        if (methods.NIL != method) {
            if (methods.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && methods.NIL == instances.instances_access_check_method(v_class, method)) {
                Errors.error(classes_utilities.$classes_utilities_illegal_access_message$.getGlobalValue(), method_name, subloop_structures.class_name(v_class));
            }
            return Functions.funcall(subloop_structures.method_function_name(method), new SubLObject[] { class_or_instance, arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10, arg11, arg12, arg13 });
        }
        Errors.error((SubLObject)methods.$str77$__FUNCALL_CLASS_OR_INSTANCE_METHO, method_name);
        return (SubLObject)methods.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/methods.lisp", position = 28763L)
    public static SubLObject funcall_class_or_instance_method_with_15_args(final SubLObject class_or_instance, final SubLObject method_name, final SubLObject arg0, final SubLObject arg1, final SubLObject arg2, final SubLObject arg3, final SubLObject arg4, final SubLObject arg5, final SubLObject arg6, final SubLObject arg7, final SubLObject arg8, final SubLObject arg9, final SubLObject arg10, final SubLObject arg11, final SubLObject arg12, final SubLObject arg13, final SubLObject arg14) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (methods.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && (methods.NIL == method_name || !method_name.isSymbol())) {
            Errors.error((SubLObject)methods.$str77$__FUNCALL_CLASS_OR_INSTANCE_METHO, method_name);
        }
        if (methods.NIL == subloop_structures.instance_p(class_or_instance)) {
            final SubLObject v_class = (methods.NIL != subloop_structures.class_p(class_or_instance)) ? class_or_instance : classes.classes_retrieve_class(class_or_instance);
            final SubLObject method = (SubLObject)((methods.NIL != v_class) ? method_assoc(method_name, subloop_structures.class_compiled_class_method_access_alist(v_class)) : methods.NIL);
            if (methods.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && methods.NIL == v_class) {
                Errors.error((SubLObject)methods.$str78$FUNCALL_CLASS_OR_INSTANCE_METHOD_, v_class);
            }
            if (methods.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && methods.NIL == method) {
                Errors.error(classes_utilities.$classes_utilities_undefined_class_method_message$.getGlobalValue(), method_name, v_class);
            }
            if (methods.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && methods.NIL == instances.instances_access_check_method(v_class, method)) {
                Errors.error(classes_utilities.$classes_utilities_illegal_access_message$.getGlobalValue(), method_name, subloop_structures.class_name(v_class));
            }
            return Functions.funcall(subloop_structures.method_function_name(method), new SubLObject[] { v_class, arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10, arg11, arg12, arg13, arg14 });
        }
        final SubLObject v_class = subloop_structures.instance_class(class_or_instance);
        final SubLObject method = Hashtables.gethash(method_name, subloop_structures.class_tablified_instance_methods(v_class), (SubLObject)methods.UNPROVIDED);
        if (methods.NIL != method) {
            if (methods.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && methods.NIL == instances.instances_access_check_method(v_class, method)) {
                Errors.error(classes_utilities.$classes_utilities_illegal_access_message$.getGlobalValue(), method_name, subloop_structures.class_name(v_class));
            }
            return Functions.funcall(subloop_structures.method_function_name(method), new SubLObject[] { class_or_instance, arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10, arg11, arg12, arg13, arg14 });
        }
        Errors.error((SubLObject)methods.$str77$__FUNCALL_CLASS_OR_INSTANCE_METHO, method_name);
        return (SubLObject)methods.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/methods.lisp", position = 28763L)
    public static SubLObject funcall_class_or_instance_method_with_16_args(final SubLObject class_or_instance, final SubLObject method_name, final SubLObject arg0, final SubLObject arg1, final SubLObject arg2, final SubLObject arg3, final SubLObject arg4, final SubLObject arg5, final SubLObject arg6, final SubLObject arg7, final SubLObject arg8, final SubLObject arg9, final SubLObject arg10, final SubLObject arg11, final SubLObject arg12, final SubLObject arg13, final SubLObject arg14, final SubLObject arg15) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (methods.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && (methods.NIL == method_name || !method_name.isSymbol())) {
            Errors.error((SubLObject)methods.$str77$__FUNCALL_CLASS_OR_INSTANCE_METHO, method_name);
        }
        if (methods.NIL == subloop_structures.instance_p(class_or_instance)) {
            final SubLObject v_class = (methods.NIL != subloop_structures.class_p(class_or_instance)) ? class_or_instance : classes.classes_retrieve_class(class_or_instance);
            final SubLObject method = (SubLObject)((methods.NIL != v_class) ? method_assoc(method_name, subloop_structures.class_compiled_class_method_access_alist(v_class)) : methods.NIL);
            if (methods.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && methods.NIL == v_class) {
                Errors.error((SubLObject)methods.$str78$FUNCALL_CLASS_OR_INSTANCE_METHOD_, v_class);
            }
            if (methods.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && methods.NIL == method) {
                Errors.error(classes_utilities.$classes_utilities_undefined_class_method_message$.getGlobalValue(), method_name, v_class);
            }
            if (methods.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && methods.NIL == instances.instances_access_check_method(v_class, method)) {
                Errors.error(classes_utilities.$classes_utilities_illegal_access_message$.getGlobalValue(), method_name, subloop_structures.class_name(v_class));
            }
            return Functions.funcall(subloop_structures.method_function_name(method), new SubLObject[] { v_class, arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10, arg11, arg12, arg13, arg14, arg15 });
        }
        final SubLObject v_class = subloop_structures.instance_class(class_or_instance);
        final SubLObject method = Hashtables.gethash(method_name, subloop_structures.class_tablified_instance_methods(v_class), (SubLObject)methods.UNPROVIDED);
        if (methods.NIL != method) {
            if (methods.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && methods.NIL == instances.instances_access_check_method(v_class, method)) {
                Errors.error(classes_utilities.$classes_utilities_illegal_access_message$.getGlobalValue(), method_name, subloop_structures.class_name(v_class));
            }
            return Functions.funcall(subloop_structures.method_function_name(method), new SubLObject[] { class_or_instance, arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10, arg11, arg12, arg13, arg14, arg15 });
        }
        Errors.error((SubLObject)methods.$str77$__FUNCALL_CLASS_OR_INSTANCE_METHO, method_name);
        return (SubLObject)methods.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/methods.lisp", position = 28763L)
    public static SubLObject funcall_class_or_instance_method_with_17_args(final SubLObject class_or_instance, final SubLObject method_name, final SubLObject arg0, final SubLObject arg1, final SubLObject arg2, final SubLObject arg3, final SubLObject arg4, final SubLObject arg5, final SubLObject arg6, final SubLObject arg7, final SubLObject arg8, final SubLObject arg9, final SubLObject arg10, final SubLObject arg11, final SubLObject arg12, final SubLObject arg13, final SubLObject arg14, final SubLObject arg15, final SubLObject arg16) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (methods.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && (methods.NIL == method_name || !method_name.isSymbol())) {
            Errors.error((SubLObject)methods.$str77$__FUNCALL_CLASS_OR_INSTANCE_METHO, method_name);
        }
        if (methods.NIL == subloop_structures.instance_p(class_or_instance)) {
            final SubLObject v_class = (methods.NIL != subloop_structures.class_p(class_or_instance)) ? class_or_instance : classes.classes_retrieve_class(class_or_instance);
            final SubLObject method = (SubLObject)((methods.NIL != v_class) ? method_assoc(method_name, subloop_structures.class_compiled_class_method_access_alist(v_class)) : methods.NIL);
            if (methods.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && methods.NIL == v_class) {
                Errors.error((SubLObject)methods.$str78$FUNCALL_CLASS_OR_INSTANCE_METHOD_, v_class);
            }
            if (methods.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && methods.NIL == method) {
                Errors.error(classes_utilities.$classes_utilities_undefined_class_method_message$.getGlobalValue(), method_name, v_class);
            }
            if (methods.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && methods.NIL == instances.instances_access_check_method(v_class, method)) {
                Errors.error(classes_utilities.$classes_utilities_illegal_access_message$.getGlobalValue(), method_name, subloop_structures.class_name(v_class));
            }
            return Functions.funcall(subloop_structures.method_function_name(method), new SubLObject[] { v_class, arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10, arg11, arg12, arg13, arg14, arg15, arg16 });
        }
        final SubLObject v_class = subloop_structures.instance_class(class_or_instance);
        final SubLObject method = Hashtables.gethash(method_name, subloop_structures.class_tablified_instance_methods(v_class), (SubLObject)methods.UNPROVIDED);
        if (methods.NIL != method) {
            if (methods.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && methods.NIL == instances.instances_access_check_method(v_class, method)) {
                Errors.error(classes_utilities.$classes_utilities_illegal_access_message$.getGlobalValue(), method_name, subloop_structures.class_name(v_class));
            }
            return Functions.funcall(subloop_structures.method_function_name(method), new SubLObject[] { class_or_instance, arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10, arg11, arg12, arg13, arg14, arg15, arg16 });
        }
        Errors.error((SubLObject)methods.$str77$__FUNCALL_CLASS_OR_INSTANCE_METHO, method_name);
        return (SubLObject)methods.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/methods.lisp", position = 28763L)
    public static SubLObject funcall_class_or_instance_method_with_18_args(final SubLObject class_or_instance, final SubLObject method_name, final SubLObject arg0, final SubLObject arg1, final SubLObject arg2, final SubLObject arg3, final SubLObject arg4, final SubLObject arg5, final SubLObject arg6, final SubLObject arg7, final SubLObject arg8, final SubLObject arg9, final SubLObject arg10, final SubLObject arg11, final SubLObject arg12, final SubLObject arg13, final SubLObject arg14, final SubLObject arg15, final SubLObject arg16, final SubLObject arg17) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (methods.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && (methods.NIL == method_name || !method_name.isSymbol())) {
            Errors.error((SubLObject)methods.$str77$__FUNCALL_CLASS_OR_INSTANCE_METHO, method_name);
        }
        if (methods.NIL == subloop_structures.instance_p(class_or_instance)) {
            final SubLObject v_class = (methods.NIL != subloop_structures.class_p(class_or_instance)) ? class_or_instance : classes.classes_retrieve_class(class_or_instance);
            final SubLObject method = (SubLObject)((methods.NIL != v_class) ? method_assoc(method_name, subloop_structures.class_compiled_class_method_access_alist(v_class)) : methods.NIL);
            if (methods.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && methods.NIL == v_class) {
                Errors.error((SubLObject)methods.$str78$FUNCALL_CLASS_OR_INSTANCE_METHOD_, v_class);
            }
            if (methods.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && methods.NIL == method) {
                Errors.error(classes_utilities.$classes_utilities_undefined_class_method_message$.getGlobalValue(), method_name, v_class);
            }
            if (methods.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && methods.NIL == instances.instances_access_check_method(v_class, method)) {
                Errors.error(classes_utilities.$classes_utilities_illegal_access_message$.getGlobalValue(), method_name, subloop_structures.class_name(v_class));
            }
            return Functions.funcall(subloop_structures.method_function_name(method), new SubLObject[] { v_class, arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10, arg11, arg12, arg13, arg14, arg15, arg16, arg17 });
        }
        final SubLObject v_class = subloop_structures.instance_class(class_or_instance);
        final SubLObject method = Hashtables.gethash(method_name, subloop_structures.class_tablified_instance_methods(v_class), (SubLObject)methods.UNPROVIDED);
        if (methods.NIL != method) {
            if (methods.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && methods.NIL == instances.instances_access_check_method(v_class, method)) {
                Errors.error(classes_utilities.$classes_utilities_illegal_access_message$.getGlobalValue(), method_name, subloop_structures.class_name(v_class));
            }
            return Functions.funcall(subloop_structures.method_function_name(method), new SubLObject[] { class_or_instance, arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10, arg11, arg12, arg13, arg14, arg15, arg16, arg17 });
        }
        Errors.error((SubLObject)methods.$str77$__FUNCALL_CLASS_OR_INSTANCE_METHO, method_name);
        return (SubLObject)methods.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/methods.lisp", position = 28763L)
    public static SubLObject funcall_class_or_instance_method_with_19_args(final SubLObject class_or_instance, final SubLObject method_name, final SubLObject arg0, final SubLObject arg1, final SubLObject arg2, final SubLObject arg3, final SubLObject arg4, final SubLObject arg5, final SubLObject arg6, final SubLObject arg7, final SubLObject arg8, final SubLObject arg9, final SubLObject arg10, final SubLObject arg11, final SubLObject arg12, final SubLObject arg13, final SubLObject arg14, final SubLObject arg15, final SubLObject arg16, final SubLObject arg17, final SubLObject arg18) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (methods.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && (methods.NIL == method_name || !method_name.isSymbol())) {
            Errors.error((SubLObject)methods.$str77$__FUNCALL_CLASS_OR_INSTANCE_METHO, method_name);
        }
        if (methods.NIL == subloop_structures.instance_p(class_or_instance)) {
            final SubLObject v_class = (methods.NIL != subloop_structures.class_p(class_or_instance)) ? class_or_instance : classes.classes_retrieve_class(class_or_instance);
            final SubLObject method = (SubLObject)((methods.NIL != v_class) ? method_assoc(method_name, subloop_structures.class_compiled_class_method_access_alist(v_class)) : methods.NIL);
            if (methods.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && methods.NIL == v_class) {
                Errors.error((SubLObject)methods.$str78$FUNCALL_CLASS_OR_INSTANCE_METHOD_, v_class);
            }
            if (methods.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && methods.NIL == method) {
                Errors.error(classes_utilities.$classes_utilities_undefined_class_method_message$.getGlobalValue(), method_name, v_class);
            }
            if (methods.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && methods.NIL == instances.instances_access_check_method(v_class, method)) {
                Errors.error(classes_utilities.$classes_utilities_illegal_access_message$.getGlobalValue(), method_name, subloop_structures.class_name(v_class));
            }
            return Functions.funcall(subloop_structures.method_function_name(method), new SubLObject[] { v_class, arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10, arg11, arg12, arg13, arg14, arg15, arg16, arg17, arg18 });
        }
        final SubLObject v_class = subloop_structures.instance_class(class_or_instance);
        final SubLObject method = Hashtables.gethash(method_name, subloop_structures.class_tablified_instance_methods(v_class), (SubLObject)methods.UNPROVIDED);
        if (methods.NIL != method) {
            if (methods.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && methods.NIL == instances.instances_access_check_method(v_class, method)) {
                Errors.error(classes_utilities.$classes_utilities_illegal_access_message$.getGlobalValue(), method_name, subloop_structures.class_name(v_class));
            }
            return Functions.funcall(subloop_structures.method_function_name(method), new SubLObject[] { class_or_instance, arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10, arg11, arg12, arg13, arg14, arg15, arg16, arg17, arg18 });
        }
        Errors.error((SubLObject)methods.$str77$__FUNCALL_CLASS_OR_INSTANCE_METHO, method_name);
        return (SubLObject)methods.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/methods.lisp", position = 28763L)
    public static SubLObject funcall_class_or_instance_method_with_20_args(final SubLObject class_or_instance, final SubLObject method_name, final SubLObject arg0, final SubLObject arg1, final SubLObject arg2, final SubLObject arg3, final SubLObject arg4, final SubLObject arg5, final SubLObject arg6, final SubLObject arg7, final SubLObject arg8, final SubLObject arg9, final SubLObject arg10, final SubLObject arg11, final SubLObject arg12, final SubLObject arg13, final SubLObject arg14, final SubLObject arg15, final SubLObject arg16, final SubLObject arg17, final SubLObject arg18, final SubLObject arg19) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (methods.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && (methods.NIL == method_name || !method_name.isSymbol())) {
            Errors.error((SubLObject)methods.$str77$__FUNCALL_CLASS_OR_INSTANCE_METHO, method_name);
        }
        if (methods.NIL == subloop_structures.instance_p(class_or_instance)) {
            final SubLObject v_class = (methods.NIL != subloop_structures.class_p(class_or_instance)) ? class_or_instance : classes.classes_retrieve_class(class_or_instance);
            final SubLObject method = (SubLObject)((methods.NIL != v_class) ? method_assoc(method_name, subloop_structures.class_compiled_class_method_access_alist(v_class)) : methods.NIL);
            if (methods.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && methods.NIL == v_class) {
                Errors.error((SubLObject)methods.$str78$FUNCALL_CLASS_OR_INSTANCE_METHOD_, v_class);
            }
            if (methods.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && methods.NIL == method) {
                Errors.error(classes_utilities.$classes_utilities_undefined_class_method_message$.getGlobalValue(), method_name, v_class);
            }
            if (methods.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && methods.NIL == instances.instances_access_check_method(v_class, method)) {
                Errors.error(classes_utilities.$classes_utilities_illegal_access_message$.getGlobalValue(), method_name, subloop_structures.class_name(v_class));
            }
            return Functions.funcall(subloop_structures.method_function_name(method), new SubLObject[] { v_class, arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10, arg11, arg12, arg13, arg14, arg15, arg16, arg17, arg18, arg19 });
        }
        final SubLObject v_class = subloop_structures.instance_class(class_or_instance);
        final SubLObject method = Hashtables.gethash(method_name, subloop_structures.class_tablified_instance_methods(v_class), (SubLObject)methods.UNPROVIDED);
        if (methods.NIL != method) {
            if (methods.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && methods.NIL == instances.instances_access_check_method(v_class, method)) {
                Errors.error(classes_utilities.$classes_utilities_illegal_access_message$.getGlobalValue(), method_name, subloop_structures.class_name(v_class));
            }
            return Functions.funcall(subloop_structures.method_function_name(method), new SubLObject[] { class_or_instance, arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10, arg11, arg12, arg13, arg14, arg15, arg16, arg17, arg18, arg19 });
        }
        Errors.error((SubLObject)methods.$str77$__FUNCALL_CLASS_OR_INSTANCE_METHO, method_name);
        return (SubLObject)methods.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/methods.lisp", position = 28868L)
    public static SubLObject safe_funcall_instance_method_with_0_args(final SubLObject instance, final SubLObject method_name) {
        if (methods.NIL == subloop_structures.instance_p(instance)) {
            return Values.values((SubLObject)methods.NIL, (SubLObject)methods.$kw79$TARGET_NOT_AN_INSTANCE);
        }
        if (methods.NIL == method_name || !method_name.isSymbol()) {
            return Values.values((SubLObject)methods.NIL, (SubLObject)methods.$kw72$INVALID_METHOD_NAME);
        }
        final SubLObject v_class = subloop_structures.instance_class(instance);
        final SubLObject method = Hashtables.gethash(method_name, subloop_structures.class_tablified_instance_methods(v_class), (SubLObject)methods.UNPROVIDED);
        if (methods.NIL == method) {
            return safe_funcall_class_method_with_0_args(v_class, method_name);
        }
        if (methods.NIL == instances.instances_access_check_method(v_class, method)) {
            return Values.values((SubLObject)methods.NIL, (SubLObject)methods.$kw74$ACCESS_LEVEL_CONFLICT);
        }
        final SubLObject function_ref = subloop_structures.method_function_name(method);
        if (methods.NIL == Symbols.fboundp(function_ref)) {
            return Values.values((SubLObject)methods.NIL, (SubLObject)methods.$kw75$UNDEFINED_METHOD);
        }
        return Values.values(Functions.funcall(function_ref, instance), (SubLObject)methods.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/methods.lisp", position = 28868L)
    public static SubLObject safe_funcall_instance_method_with_1_args(final SubLObject instance, final SubLObject method_name, final SubLObject arg0) {
        if (methods.NIL == subloop_structures.instance_p(instance)) {
            return Values.values((SubLObject)methods.NIL, (SubLObject)methods.$kw79$TARGET_NOT_AN_INSTANCE);
        }
        if (methods.NIL == method_name || !method_name.isSymbol()) {
            return Values.values((SubLObject)methods.NIL, (SubLObject)methods.$kw72$INVALID_METHOD_NAME);
        }
        final SubLObject v_class = subloop_structures.instance_class(instance);
        final SubLObject method = Hashtables.gethash(method_name, subloop_structures.class_tablified_instance_methods(v_class), (SubLObject)methods.UNPROVIDED);
        if (methods.NIL == method) {
            return safe_funcall_class_method_with_1_args(v_class, method_name, arg0);
        }
        if (methods.NIL == instances.instances_access_check_method(v_class, method)) {
            return Values.values((SubLObject)methods.NIL, (SubLObject)methods.$kw74$ACCESS_LEVEL_CONFLICT);
        }
        final SubLObject function_ref = subloop_structures.method_function_name(method);
        if (methods.NIL == Symbols.fboundp(function_ref)) {
            return Values.values((SubLObject)methods.NIL, (SubLObject)methods.$kw75$UNDEFINED_METHOD);
        }
        return Values.values(Functions.funcall(function_ref, instance, arg0), (SubLObject)methods.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/methods.lisp", position = 28868L)
    public static SubLObject safe_funcall_instance_method_with_2_args(final SubLObject instance, final SubLObject method_name, final SubLObject arg0, final SubLObject arg1) {
        if (methods.NIL == subloop_structures.instance_p(instance)) {
            return Values.values((SubLObject)methods.NIL, (SubLObject)methods.$kw79$TARGET_NOT_AN_INSTANCE);
        }
        if (methods.NIL == method_name || !method_name.isSymbol()) {
            return Values.values((SubLObject)methods.NIL, (SubLObject)methods.$kw72$INVALID_METHOD_NAME);
        }
        final SubLObject v_class = subloop_structures.instance_class(instance);
        final SubLObject method = Hashtables.gethash(method_name, subloop_structures.class_tablified_instance_methods(v_class), (SubLObject)methods.UNPROVIDED);
        if (methods.NIL == method) {
            return safe_funcall_class_method_with_2_args(v_class, method_name, arg0, arg1);
        }
        if (methods.NIL == instances.instances_access_check_method(v_class, method)) {
            return Values.values((SubLObject)methods.NIL, (SubLObject)methods.$kw74$ACCESS_LEVEL_CONFLICT);
        }
        final SubLObject function_ref = subloop_structures.method_function_name(method);
        if (methods.NIL == Symbols.fboundp(function_ref)) {
            return Values.values((SubLObject)methods.NIL, (SubLObject)methods.$kw75$UNDEFINED_METHOD);
        }
        return Values.values(Functions.funcall(function_ref, instance, arg0, arg1), (SubLObject)methods.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/methods.lisp", position = 28868L)
    public static SubLObject safe_funcall_instance_method_with_3_args(final SubLObject instance, final SubLObject method_name, final SubLObject arg0, final SubLObject arg1, final SubLObject arg2) {
        if (methods.NIL == subloop_structures.instance_p(instance)) {
            return Values.values((SubLObject)methods.NIL, (SubLObject)methods.$kw79$TARGET_NOT_AN_INSTANCE);
        }
        if (methods.NIL == method_name || !method_name.isSymbol()) {
            return Values.values((SubLObject)methods.NIL, (SubLObject)methods.$kw72$INVALID_METHOD_NAME);
        }
        final SubLObject v_class = subloop_structures.instance_class(instance);
        final SubLObject method = Hashtables.gethash(method_name, subloop_structures.class_tablified_instance_methods(v_class), (SubLObject)methods.UNPROVIDED);
        if (methods.NIL == method) {
            return safe_funcall_class_method_with_3_args(v_class, method_name, arg0, arg1, arg2);
        }
        if (methods.NIL == instances.instances_access_check_method(v_class, method)) {
            return Values.values((SubLObject)methods.NIL, (SubLObject)methods.$kw74$ACCESS_LEVEL_CONFLICT);
        }
        final SubLObject function_ref = subloop_structures.method_function_name(method);
        if (methods.NIL == Symbols.fboundp(function_ref)) {
            return Values.values((SubLObject)methods.NIL, (SubLObject)methods.$kw75$UNDEFINED_METHOD);
        }
        return Values.values(Functions.funcall(function_ref, instance, arg0, arg1, arg2), (SubLObject)methods.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/methods.lisp", position = 28868L)
    public static SubLObject safe_funcall_instance_method_with_4_args(final SubLObject instance, final SubLObject method_name, final SubLObject arg0, final SubLObject arg1, final SubLObject arg2, final SubLObject arg3) {
        if (methods.NIL == subloop_structures.instance_p(instance)) {
            return Values.values((SubLObject)methods.NIL, (SubLObject)methods.$kw79$TARGET_NOT_AN_INSTANCE);
        }
        if (methods.NIL == method_name || !method_name.isSymbol()) {
            return Values.values((SubLObject)methods.NIL, (SubLObject)methods.$kw72$INVALID_METHOD_NAME);
        }
        final SubLObject v_class = subloop_structures.instance_class(instance);
        final SubLObject method = Hashtables.gethash(method_name, subloop_structures.class_tablified_instance_methods(v_class), (SubLObject)methods.UNPROVIDED);
        if (methods.NIL == method) {
            return safe_funcall_class_method_with_4_args(v_class, method_name, arg0, arg1, arg2, arg3);
        }
        if (methods.NIL == instances.instances_access_check_method(v_class, method)) {
            return Values.values((SubLObject)methods.NIL, (SubLObject)methods.$kw74$ACCESS_LEVEL_CONFLICT);
        }
        final SubLObject function_ref = subloop_structures.method_function_name(method);
        if (methods.NIL == Symbols.fboundp(function_ref)) {
            return Values.values((SubLObject)methods.NIL, (SubLObject)methods.$kw75$UNDEFINED_METHOD);
        }
        return Values.values(Functions.funcall(function_ref, instance, arg0, arg1, arg2, arg3), (SubLObject)methods.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/methods.lisp", position = 28868L)
    public static SubLObject safe_funcall_instance_method_with_5_args(final SubLObject instance, final SubLObject method_name, final SubLObject arg0, final SubLObject arg1, final SubLObject arg2, final SubLObject arg3, final SubLObject arg4) {
        if (methods.NIL == subloop_structures.instance_p(instance)) {
            return Values.values((SubLObject)methods.NIL, (SubLObject)methods.$kw79$TARGET_NOT_AN_INSTANCE);
        }
        if (methods.NIL == method_name || !method_name.isSymbol()) {
            return Values.values((SubLObject)methods.NIL, (SubLObject)methods.$kw72$INVALID_METHOD_NAME);
        }
        final SubLObject v_class = subloop_structures.instance_class(instance);
        final SubLObject method = Hashtables.gethash(method_name, subloop_structures.class_tablified_instance_methods(v_class), (SubLObject)methods.UNPROVIDED);
        if (methods.NIL == method) {
            return safe_funcall_class_method_with_5_args(v_class, method_name, arg0, arg1, arg2, arg3, arg4);
        }
        if (methods.NIL == instances.instances_access_check_method(v_class, method)) {
            return Values.values((SubLObject)methods.NIL, (SubLObject)methods.$kw74$ACCESS_LEVEL_CONFLICT);
        }
        final SubLObject function_ref = subloop_structures.method_function_name(method);
        if (methods.NIL == Symbols.fboundp(function_ref)) {
            return Values.values((SubLObject)methods.NIL, (SubLObject)methods.$kw75$UNDEFINED_METHOD);
        }
        return Values.values(Functions.funcall(function_ref, instance, arg0, arg1, arg2, arg3, arg4), (SubLObject)methods.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/methods.lisp", position = 28868L)
    public static SubLObject safe_funcall_instance_method_with_6_args(final SubLObject instance, final SubLObject method_name, final SubLObject arg0, final SubLObject arg1, final SubLObject arg2, final SubLObject arg3, final SubLObject arg4, final SubLObject arg5) {
        if (methods.NIL == subloop_structures.instance_p(instance)) {
            return Values.values((SubLObject)methods.NIL, (SubLObject)methods.$kw79$TARGET_NOT_AN_INSTANCE);
        }
        if (methods.NIL == method_name || !method_name.isSymbol()) {
            return Values.values((SubLObject)methods.NIL, (SubLObject)methods.$kw72$INVALID_METHOD_NAME);
        }
        final SubLObject v_class = subloop_structures.instance_class(instance);
        final SubLObject method = Hashtables.gethash(method_name, subloop_structures.class_tablified_instance_methods(v_class), (SubLObject)methods.UNPROVIDED);
        if (methods.NIL == method) {
            return safe_funcall_class_method_with_6_args(v_class, method_name, arg0, arg1, arg2, arg3, arg4, arg5);
        }
        if (methods.NIL == instances.instances_access_check_method(v_class, method)) {
            return Values.values((SubLObject)methods.NIL, (SubLObject)methods.$kw74$ACCESS_LEVEL_CONFLICT);
        }
        final SubLObject function_ref = subloop_structures.method_function_name(method);
        if (methods.NIL == Symbols.fboundp(function_ref)) {
            return Values.values((SubLObject)methods.NIL, (SubLObject)methods.$kw75$UNDEFINED_METHOD);
        }
        return Values.values(Functions.funcall(function_ref, new SubLObject[] { instance, arg0, arg1, arg2, arg3, arg4, arg5 }), (SubLObject)methods.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/methods.lisp", position = 28868L)
    public static SubLObject safe_funcall_instance_method_with_7_args(final SubLObject instance, final SubLObject method_name, final SubLObject arg0, final SubLObject arg1, final SubLObject arg2, final SubLObject arg3, final SubLObject arg4, final SubLObject arg5, final SubLObject arg6) {
        if (methods.NIL == subloop_structures.instance_p(instance)) {
            return Values.values((SubLObject)methods.NIL, (SubLObject)methods.$kw79$TARGET_NOT_AN_INSTANCE);
        }
        if (methods.NIL == method_name || !method_name.isSymbol()) {
            return Values.values((SubLObject)methods.NIL, (SubLObject)methods.$kw72$INVALID_METHOD_NAME);
        }
        final SubLObject v_class = subloop_structures.instance_class(instance);
        final SubLObject method = Hashtables.gethash(method_name, subloop_structures.class_tablified_instance_methods(v_class), (SubLObject)methods.UNPROVIDED);
        if (methods.NIL == method) {
            return safe_funcall_class_method_with_7_args(v_class, method_name, arg0, arg1, arg2, arg3, arg4, arg5, arg6);
        }
        if (methods.NIL == instances.instances_access_check_method(v_class, method)) {
            return Values.values((SubLObject)methods.NIL, (SubLObject)methods.$kw74$ACCESS_LEVEL_CONFLICT);
        }
        final SubLObject function_ref = subloop_structures.method_function_name(method);
        if (methods.NIL == Symbols.fboundp(function_ref)) {
            return Values.values((SubLObject)methods.NIL, (SubLObject)methods.$kw75$UNDEFINED_METHOD);
        }
        return Values.values(Functions.funcall(function_ref, new SubLObject[] { instance, arg0, arg1, arg2, arg3, arg4, arg5, arg6 }), (SubLObject)methods.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/methods.lisp", position = 28868L)
    public static SubLObject safe_funcall_instance_method_with_8_args(final SubLObject instance, final SubLObject method_name, final SubLObject arg0, final SubLObject arg1, final SubLObject arg2, final SubLObject arg3, final SubLObject arg4, final SubLObject arg5, final SubLObject arg6, final SubLObject arg7) {
        if (methods.NIL == subloop_structures.instance_p(instance)) {
            return Values.values((SubLObject)methods.NIL, (SubLObject)methods.$kw79$TARGET_NOT_AN_INSTANCE);
        }
        if (methods.NIL == method_name || !method_name.isSymbol()) {
            return Values.values((SubLObject)methods.NIL, (SubLObject)methods.$kw72$INVALID_METHOD_NAME);
        }
        final SubLObject v_class = subloop_structures.instance_class(instance);
        final SubLObject method = Hashtables.gethash(method_name, subloop_structures.class_tablified_instance_methods(v_class), (SubLObject)methods.UNPROVIDED);
        if (methods.NIL == method) {
            return safe_funcall_class_method_with_8_args(v_class, method_name, arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7);
        }
        if (methods.NIL == instances.instances_access_check_method(v_class, method)) {
            return Values.values((SubLObject)methods.NIL, (SubLObject)methods.$kw74$ACCESS_LEVEL_CONFLICT);
        }
        final SubLObject function_ref = subloop_structures.method_function_name(method);
        if (methods.NIL == Symbols.fboundp(function_ref)) {
            return Values.values((SubLObject)methods.NIL, (SubLObject)methods.$kw75$UNDEFINED_METHOD);
        }
        return Values.values(Functions.funcall(function_ref, new SubLObject[] { instance, arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7 }), (SubLObject)methods.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/methods.lisp", position = 28868L)
    public static SubLObject safe_funcall_instance_method_with_9_args(final SubLObject instance, final SubLObject method_name, final SubLObject arg0, final SubLObject arg1, final SubLObject arg2, final SubLObject arg3, final SubLObject arg4, final SubLObject arg5, final SubLObject arg6, final SubLObject arg7, final SubLObject arg8) {
        if (methods.NIL == subloop_structures.instance_p(instance)) {
            return Values.values((SubLObject)methods.NIL, (SubLObject)methods.$kw79$TARGET_NOT_AN_INSTANCE);
        }
        if (methods.NIL == method_name || !method_name.isSymbol()) {
            return Values.values((SubLObject)methods.NIL, (SubLObject)methods.$kw72$INVALID_METHOD_NAME);
        }
        final SubLObject v_class = subloop_structures.instance_class(instance);
        final SubLObject method = Hashtables.gethash(method_name, subloop_structures.class_tablified_instance_methods(v_class), (SubLObject)methods.UNPROVIDED);
        if (methods.NIL == method) {
            return safe_funcall_class_method_with_9_args(v_class, method_name, arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
        }
        if (methods.NIL == instances.instances_access_check_method(v_class, method)) {
            return Values.values((SubLObject)methods.NIL, (SubLObject)methods.$kw74$ACCESS_LEVEL_CONFLICT);
        }
        final SubLObject function_ref = subloop_structures.method_function_name(method);
        if (methods.NIL == Symbols.fboundp(function_ref)) {
            return Values.values((SubLObject)methods.NIL, (SubLObject)methods.$kw75$UNDEFINED_METHOD);
        }
        return Values.values(Functions.funcall(function_ref, new SubLObject[] { instance, arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8 }), (SubLObject)methods.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/methods.lisp", position = 28868L)
    public static SubLObject safe_funcall_instance_method_with_10_args(final SubLObject instance, final SubLObject method_name, final SubLObject arg0, final SubLObject arg1, final SubLObject arg2, final SubLObject arg3, final SubLObject arg4, final SubLObject arg5, final SubLObject arg6, final SubLObject arg7, final SubLObject arg8, final SubLObject arg9) {
        if (methods.NIL == subloop_structures.instance_p(instance)) {
            return Values.values((SubLObject)methods.NIL, (SubLObject)methods.$kw79$TARGET_NOT_AN_INSTANCE);
        }
        if (methods.NIL == method_name || !method_name.isSymbol()) {
            return Values.values((SubLObject)methods.NIL, (SubLObject)methods.$kw72$INVALID_METHOD_NAME);
        }
        final SubLObject v_class = subloop_structures.instance_class(instance);
        final SubLObject method = Hashtables.gethash(method_name, subloop_structures.class_tablified_instance_methods(v_class), (SubLObject)methods.UNPROVIDED);
        if (methods.NIL == method) {
            return safe_funcall_class_method_with_10_args(v_class, method_name, arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9);
        }
        if (methods.NIL == instances.instances_access_check_method(v_class, method)) {
            return Values.values((SubLObject)methods.NIL, (SubLObject)methods.$kw74$ACCESS_LEVEL_CONFLICT);
        }
        final SubLObject function_ref = subloop_structures.method_function_name(method);
        if (methods.NIL == Symbols.fboundp(function_ref)) {
            return Values.values((SubLObject)methods.NIL, (SubLObject)methods.$kw75$UNDEFINED_METHOD);
        }
        return Values.values(Functions.funcall(function_ref, new SubLObject[] { instance, arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9 }), (SubLObject)methods.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/methods.lisp", position = 28868L)
    public static SubLObject safe_funcall_instance_method_with_11_args(final SubLObject instance, final SubLObject method_name, final SubLObject arg0, final SubLObject arg1, final SubLObject arg2, final SubLObject arg3, final SubLObject arg4, final SubLObject arg5, final SubLObject arg6, final SubLObject arg7, final SubLObject arg8, final SubLObject arg9, final SubLObject arg10) {
        if (methods.NIL == subloop_structures.instance_p(instance)) {
            return Values.values((SubLObject)methods.NIL, (SubLObject)methods.$kw79$TARGET_NOT_AN_INSTANCE);
        }
        if (methods.NIL == method_name || !method_name.isSymbol()) {
            return Values.values((SubLObject)methods.NIL, (SubLObject)methods.$kw72$INVALID_METHOD_NAME);
        }
        final SubLObject v_class = subloop_structures.instance_class(instance);
        final SubLObject method = Hashtables.gethash(method_name, subloop_structures.class_tablified_instance_methods(v_class), (SubLObject)methods.UNPROVIDED);
        if (methods.NIL == method) {
            return safe_funcall_class_method_with_11_args(v_class, method_name, arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10);
        }
        if (methods.NIL == instances.instances_access_check_method(v_class, method)) {
            return Values.values((SubLObject)methods.NIL, (SubLObject)methods.$kw74$ACCESS_LEVEL_CONFLICT);
        }
        final SubLObject function_ref = subloop_structures.method_function_name(method);
        if (methods.NIL == Symbols.fboundp(function_ref)) {
            return Values.values((SubLObject)methods.NIL, (SubLObject)methods.$kw75$UNDEFINED_METHOD);
        }
        return Values.values(Functions.funcall(function_ref, new SubLObject[] { instance, arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10 }), (SubLObject)methods.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/methods.lisp", position = 28868L)
    public static SubLObject safe_funcall_instance_method_with_12_args(final SubLObject instance, final SubLObject method_name, final SubLObject arg0, final SubLObject arg1, final SubLObject arg2, final SubLObject arg3, final SubLObject arg4, final SubLObject arg5, final SubLObject arg6, final SubLObject arg7, final SubLObject arg8, final SubLObject arg9, final SubLObject arg10, final SubLObject arg11) {
        if (methods.NIL == subloop_structures.instance_p(instance)) {
            return Values.values((SubLObject)methods.NIL, (SubLObject)methods.$kw79$TARGET_NOT_AN_INSTANCE);
        }
        if (methods.NIL == method_name || !method_name.isSymbol()) {
            return Values.values((SubLObject)methods.NIL, (SubLObject)methods.$kw72$INVALID_METHOD_NAME);
        }
        final SubLObject v_class = subloop_structures.instance_class(instance);
        final SubLObject method = Hashtables.gethash(method_name, subloop_structures.class_tablified_instance_methods(v_class), (SubLObject)methods.UNPROVIDED);
        if (methods.NIL == method) {
            return safe_funcall_class_method_with_12_args(v_class, method_name, arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10, arg11);
        }
        if (methods.NIL == instances.instances_access_check_method(v_class, method)) {
            return Values.values((SubLObject)methods.NIL, (SubLObject)methods.$kw74$ACCESS_LEVEL_CONFLICT);
        }
        final SubLObject function_ref = subloop_structures.method_function_name(method);
        if (methods.NIL == Symbols.fboundp(function_ref)) {
            return Values.values((SubLObject)methods.NIL, (SubLObject)methods.$kw75$UNDEFINED_METHOD);
        }
        return Values.values(Functions.funcall(function_ref, new SubLObject[] { instance, arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10, arg11 }), (SubLObject)methods.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/methods.lisp", position = 28868L)
    public static SubLObject safe_funcall_instance_method_with_13_args(final SubLObject instance, final SubLObject method_name, final SubLObject arg0, final SubLObject arg1, final SubLObject arg2, final SubLObject arg3, final SubLObject arg4, final SubLObject arg5, final SubLObject arg6, final SubLObject arg7, final SubLObject arg8, final SubLObject arg9, final SubLObject arg10, final SubLObject arg11, final SubLObject arg12) {
        if (methods.NIL == subloop_structures.instance_p(instance)) {
            return Values.values((SubLObject)methods.NIL, (SubLObject)methods.$kw79$TARGET_NOT_AN_INSTANCE);
        }
        if (methods.NIL == method_name || !method_name.isSymbol()) {
            return Values.values((SubLObject)methods.NIL, (SubLObject)methods.$kw72$INVALID_METHOD_NAME);
        }
        final SubLObject v_class = subloop_structures.instance_class(instance);
        final SubLObject method = Hashtables.gethash(method_name, subloop_structures.class_tablified_instance_methods(v_class), (SubLObject)methods.UNPROVIDED);
        if (methods.NIL == method) {
            return safe_funcall_class_method_with_13_args(v_class, method_name, arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10, arg11, arg12);
        }
        if (methods.NIL == instances.instances_access_check_method(v_class, method)) {
            return Values.values((SubLObject)methods.NIL, (SubLObject)methods.$kw74$ACCESS_LEVEL_CONFLICT);
        }
        final SubLObject function_ref = subloop_structures.method_function_name(method);
        if (methods.NIL == Symbols.fboundp(function_ref)) {
            return Values.values((SubLObject)methods.NIL, (SubLObject)methods.$kw75$UNDEFINED_METHOD);
        }
        return Values.values(Functions.funcall(function_ref, new SubLObject[] { instance, arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10, arg11, arg12 }), (SubLObject)methods.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/methods.lisp", position = 28868L)
    public static SubLObject safe_funcall_instance_method_with_14_args(final SubLObject instance, final SubLObject method_name, final SubLObject arg0, final SubLObject arg1, final SubLObject arg2, final SubLObject arg3, final SubLObject arg4, final SubLObject arg5, final SubLObject arg6, final SubLObject arg7, final SubLObject arg8, final SubLObject arg9, final SubLObject arg10, final SubLObject arg11, final SubLObject arg12, final SubLObject arg13) {
        if (methods.NIL == subloop_structures.instance_p(instance)) {
            return Values.values((SubLObject)methods.NIL, (SubLObject)methods.$kw79$TARGET_NOT_AN_INSTANCE);
        }
        if (methods.NIL == method_name || !method_name.isSymbol()) {
            return Values.values((SubLObject)methods.NIL, (SubLObject)methods.$kw72$INVALID_METHOD_NAME);
        }
        final SubLObject v_class = subloop_structures.instance_class(instance);
        final SubLObject method = Hashtables.gethash(method_name, subloop_structures.class_tablified_instance_methods(v_class), (SubLObject)methods.UNPROVIDED);
        if (methods.NIL == method) {
            return safe_funcall_class_method_with_14_args(v_class, method_name, arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10, arg11, arg12, arg13);
        }
        if (methods.NIL == instances.instances_access_check_method(v_class, method)) {
            return Values.values((SubLObject)methods.NIL, (SubLObject)methods.$kw74$ACCESS_LEVEL_CONFLICT);
        }
        final SubLObject function_ref = subloop_structures.method_function_name(method);
        if (methods.NIL == Symbols.fboundp(function_ref)) {
            return Values.values((SubLObject)methods.NIL, (SubLObject)methods.$kw75$UNDEFINED_METHOD);
        }
        return Values.values(Functions.funcall(function_ref, new SubLObject[] { instance, arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10, arg11, arg12, arg13 }), (SubLObject)methods.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/methods.lisp", position = 28868L)
    public static SubLObject safe_funcall_instance_method_with_15_args(final SubLObject instance, final SubLObject method_name, final SubLObject arg0, final SubLObject arg1, final SubLObject arg2, final SubLObject arg3, final SubLObject arg4, final SubLObject arg5, final SubLObject arg6, final SubLObject arg7, final SubLObject arg8, final SubLObject arg9, final SubLObject arg10, final SubLObject arg11, final SubLObject arg12, final SubLObject arg13, final SubLObject arg14) {
        if (methods.NIL == subloop_structures.instance_p(instance)) {
            return Values.values((SubLObject)methods.NIL, (SubLObject)methods.$kw79$TARGET_NOT_AN_INSTANCE);
        }
        if (methods.NIL == method_name || !method_name.isSymbol()) {
            return Values.values((SubLObject)methods.NIL, (SubLObject)methods.$kw72$INVALID_METHOD_NAME);
        }
        final SubLObject v_class = subloop_structures.instance_class(instance);
        final SubLObject method = Hashtables.gethash(method_name, subloop_structures.class_tablified_instance_methods(v_class), (SubLObject)methods.UNPROVIDED);
        if (methods.NIL == method) {
            return safe_funcall_class_method_with_15_args(v_class, method_name, arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10, arg11, arg12, arg13, arg14);
        }
        if (methods.NIL == instances.instances_access_check_method(v_class, method)) {
            return Values.values((SubLObject)methods.NIL, (SubLObject)methods.$kw74$ACCESS_LEVEL_CONFLICT);
        }
        final SubLObject function_ref = subloop_structures.method_function_name(method);
        if (methods.NIL == Symbols.fboundp(function_ref)) {
            return Values.values((SubLObject)methods.NIL, (SubLObject)methods.$kw75$UNDEFINED_METHOD);
        }
        return Values.values(Functions.funcall(function_ref, new SubLObject[] { instance, arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10, arg11, arg12, arg13, arg14 }), (SubLObject)methods.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/methods.lisp", position = 28868L)
    public static SubLObject safe_funcall_instance_method_with_16_args(final SubLObject instance, final SubLObject method_name, final SubLObject arg0, final SubLObject arg1, final SubLObject arg2, final SubLObject arg3, final SubLObject arg4, final SubLObject arg5, final SubLObject arg6, final SubLObject arg7, final SubLObject arg8, final SubLObject arg9, final SubLObject arg10, final SubLObject arg11, final SubLObject arg12, final SubLObject arg13, final SubLObject arg14, final SubLObject arg15) {
        if (methods.NIL == subloop_structures.instance_p(instance)) {
            return Values.values((SubLObject)methods.NIL, (SubLObject)methods.$kw79$TARGET_NOT_AN_INSTANCE);
        }
        if (methods.NIL == method_name || !method_name.isSymbol()) {
            return Values.values((SubLObject)methods.NIL, (SubLObject)methods.$kw72$INVALID_METHOD_NAME);
        }
        final SubLObject v_class = subloop_structures.instance_class(instance);
        final SubLObject method = Hashtables.gethash(method_name, subloop_structures.class_tablified_instance_methods(v_class), (SubLObject)methods.UNPROVIDED);
        if (methods.NIL == method) {
            return safe_funcall_class_method_with_16_args(v_class, method_name, arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10, arg11, arg12, arg13, arg14, arg15);
        }
        if (methods.NIL == instances.instances_access_check_method(v_class, method)) {
            return Values.values((SubLObject)methods.NIL, (SubLObject)methods.$kw74$ACCESS_LEVEL_CONFLICT);
        }
        final SubLObject function_ref = subloop_structures.method_function_name(method);
        if (methods.NIL == Symbols.fboundp(function_ref)) {
            return Values.values((SubLObject)methods.NIL, (SubLObject)methods.$kw75$UNDEFINED_METHOD);
        }
        return Values.values(Functions.funcall(function_ref, new SubLObject[] { instance, arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10, arg11, arg12, arg13, arg14, arg15 }), (SubLObject)methods.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/methods.lisp", position = 28868L)
    public static SubLObject safe_funcall_instance_method_with_17_args(final SubLObject instance, final SubLObject method_name, final SubLObject arg0, final SubLObject arg1, final SubLObject arg2, final SubLObject arg3, final SubLObject arg4, final SubLObject arg5, final SubLObject arg6, final SubLObject arg7, final SubLObject arg8, final SubLObject arg9, final SubLObject arg10, final SubLObject arg11, final SubLObject arg12, final SubLObject arg13, final SubLObject arg14, final SubLObject arg15, final SubLObject arg16) {
        if (methods.NIL == subloop_structures.instance_p(instance)) {
            return Values.values((SubLObject)methods.NIL, (SubLObject)methods.$kw79$TARGET_NOT_AN_INSTANCE);
        }
        if (methods.NIL == method_name || !method_name.isSymbol()) {
            return Values.values((SubLObject)methods.NIL, (SubLObject)methods.$kw72$INVALID_METHOD_NAME);
        }
        final SubLObject v_class = subloop_structures.instance_class(instance);
        final SubLObject method = Hashtables.gethash(method_name, subloop_structures.class_tablified_instance_methods(v_class), (SubLObject)methods.UNPROVIDED);
        if (methods.NIL == method) {
            return safe_funcall_class_method_with_17_args(v_class, method_name, arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10, arg11, arg12, arg13, arg14, arg15, arg16);
        }
        if (methods.NIL == instances.instances_access_check_method(v_class, method)) {
            return Values.values((SubLObject)methods.NIL, (SubLObject)methods.$kw74$ACCESS_LEVEL_CONFLICT);
        }
        final SubLObject function_ref = subloop_structures.method_function_name(method);
        if (methods.NIL == Symbols.fboundp(function_ref)) {
            return Values.values((SubLObject)methods.NIL, (SubLObject)methods.$kw75$UNDEFINED_METHOD);
        }
        return Values.values(Functions.funcall(function_ref, new SubLObject[] { instance, arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10, arg11, arg12, arg13, arg14, arg15, arg16 }), (SubLObject)methods.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/methods.lisp", position = 28868L)
    public static SubLObject safe_funcall_instance_method_with_18_args(final SubLObject instance, final SubLObject method_name, final SubLObject arg0, final SubLObject arg1, final SubLObject arg2, final SubLObject arg3, final SubLObject arg4, final SubLObject arg5, final SubLObject arg6, final SubLObject arg7, final SubLObject arg8, final SubLObject arg9, final SubLObject arg10, final SubLObject arg11, final SubLObject arg12, final SubLObject arg13, final SubLObject arg14, final SubLObject arg15, final SubLObject arg16, final SubLObject arg17) {
        if (methods.NIL == subloop_structures.instance_p(instance)) {
            return Values.values((SubLObject)methods.NIL, (SubLObject)methods.$kw79$TARGET_NOT_AN_INSTANCE);
        }
        if (methods.NIL == method_name || !method_name.isSymbol()) {
            return Values.values((SubLObject)methods.NIL, (SubLObject)methods.$kw72$INVALID_METHOD_NAME);
        }
        final SubLObject v_class = subloop_structures.instance_class(instance);
        final SubLObject method = Hashtables.gethash(method_name, subloop_structures.class_tablified_instance_methods(v_class), (SubLObject)methods.UNPROVIDED);
        if (methods.NIL == method) {
            return safe_funcall_class_method_with_18_args(v_class, method_name, arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10, arg11, arg12, arg13, arg14, arg15, arg16, arg17);
        }
        if (methods.NIL == instances.instances_access_check_method(v_class, method)) {
            return Values.values((SubLObject)methods.NIL, (SubLObject)methods.$kw74$ACCESS_LEVEL_CONFLICT);
        }
        final SubLObject function_ref = subloop_structures.method_function_name(method);
        if (methods.NIL == Symbols.fboundp(function_ref)) {
            return Values.values((SubLObject)methods.NIL, (SubLObject)methods.$kw75$UNDEFINED_METHOD);
        }
        return Values.values(Functions.funcall(function_ref, new SubLObject[] { instance, arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10, arg11, arg12, arg13, arg14, arg15, arg16, arg17 }), (SubLObject)methods.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/methods.lisp", position = 28868L)
    public static SubLObject safe_funcall_instance_method_with_19_args(final SubLObject instance, final SubLObject method_name, final SubLObject arg0, final SubLObject arg1, final SubLObject arg2, final SubLObject arg3, final SubLObject arg4, final SubLObject arg5, final SubLObject arg6, final SubLObject arg7, final SubLObject arg8, final SubLObject arg9, final SubLObject arg10, final SubLObject arg11, final SubLObject arg12, final SubLObject arg13, final SubLObject arg14, final SubLObject arg15, final SubLObject arg16, final SubLObject arg17, final SubLObject arg18) {
        if (methods.NIL == subloop_structures.instance_p(instance)) {
            return Values.values((SubLObject)methods.NIL, (SubLObject)methods.$kw79$TARGET_NOT_AN_INSTANCE);
        }
        if (methods.NIL == method_name || !method_name.isSymbol()) {
            return Values.values((SubLObject)methods.NIL, (SubLObject)methods.$kw72$INVALID_METHOD_NAME);
        }
        final SubLObject v_class = subloop_structures.instance_class(instance);
        final SubLObject method = Hashtables.gethash(method_name, subloop_structures.class_tablified_instance_methods(v_class), (SubLObject)methods.UNPROVIDED);
        if (methods.NIL == method) {
            return safe_funcall_class_method_with_19_args(v_class, method_name, arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10, arg11, arg12, arg13, arg14, arg15, arg16, arg17, arg18);
        }
        if (methods.NIL == instances.instances_access_check_method(v_class, method)) {
            return Values.values((SubLObject)methods.NIL, (SubLObject)methods.$kw74$ACCESS_LEVEL_CONFLICT);
        }
        final SubLObject function_ref = subloop_structures.method_function_name(method);
        if (methods.NIL == Symbols.fboundp(function_ref)) {
            return Values.values((SubLObject)methods.NIL, (SubLObject)methods.$kw75$UNDEFINED_METHOD);
        }
        return Values.values(Functions.funcall(function_ref, new SubLObject[] { instance, arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10, arg11, arg12, arg13, arg14, arg15, arg16, arg17, arg18 }), (SubLObject)methods.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/methods.lisp", position = 28868L)
    public static SubLObject safe_funcall_instance_method_with_20_args(final SubLObject instance, final SubLObject method_name, final SubLObject arg0, final SubLObject arg1, final SubLObject arg2, final SubLObject arg3, final SubLObject arg4, final SubLObject arg5, final SubLObject arg6, final SubLObject arg7, final SubLObject arg8, final SubLObject arg9, final SubLObject arg10, final SubLObject arg11, final SubLObject arg12, final SubLObject arg13, final SubLObject arg14, final SubLObject arg15, final SubLObject arg16, final SubLObject arg17, final SubLObject arg18, final SubLObject arg19) {
        if (methods.NIL == subloop_structures.instance_p(instance)) {
            return Values.values((SubLObject)methods.NIL, (SubLObject)methods.$kw79$TARGET_NOT_AN_INSTANCE);
        }
        if (methods.NIL == method_name || !method_name.isSymbol()) {
            return Values.values((SubLObject)methods.NIL, (SubLObject)methods.$kw72$INVALID_METHOD_NAME);
        }
        final SubLObject v_class = subloop_structures.instance_class(instance);
        final SubLObject method = Hashtables.gethash(method_name, subloop_structures.class_tablified_instance_methods(v_class), (SubLObject)methods.UNPROVIDED);
        if (methods.NIL == method) {
            return safe_funcall_class_method_with_20_args(v_class, method_name, arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10, arg11, arg12, arg13, arg14, arg15, arg16, arg17, arg18, arg19);
        }
        if (methods.NIL == instances.instances_access_check_method(v_class, method)) {
            return Values.values((SubLObject)methods.NIL, (SubLObject)methods.$kw74$ACCESS_LEVEL_CONFLICT);
        }
        final SubLObject function_ref = subloop_structures.method_function_name(method);
        if (methods.NIL == Symbols.fboundp(function_ref)) {
            return Values.values((SubLObject)methods.NIL, (SubLObject)methods.$kw75$UNDEFINED_METHOD);
        }
        return Values.values(Functions.funcall(function_ref, new SubLObject[] { instance, arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10, arg11, arg12, arg13, arg14, arg15, arg16, arg17, arg18, arg19 }), (SubLObject)methods.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/methods.lisp", position = 29658L)
    public static SubLObject safe_funcall_instance_super_method_with_0_args(final SubLObject instance, final SubLObject method_name) {
        if (methods.NIL == subloop_structures.instance_p(instance)) {
            return Values.values((SubLObject)methods.NIL, (SubLObject)methods.$kw79$TARGET_NOT_AN_INSTANCE);
        }
        if (!method_name.isSymbol()) {
            return Values.values((SubLObject)methods.NIL, (SubLObject)methods.$kw72$INVALID_METHOD_NAME);
        }
        final SubLObject v_class = subloop_structures.instance_class(instance);
        final SubLObject method = method_shadowed_assoc(method_name, subloop_structures.class_compiled_instance_method_access_alist(v_class));
        if (methods.NIL == method) {
            return safe_funcall_class_super_method_with_0_args(v_class, method_name);
        }
        if (methods.NIL == instances.instances_access_check_method(v_class, method)) {
            return Values.values((SubLObject)methods.NIL, (SubLObject)methods.$kw74$ACCESS_LEVEL_CONFLICT);
        }
        final SubLObject function_ref = subloop_structures.method_function_name(method);
        if (methods.NIL == Symbols.fboundp(function_ref)) {
            return Values.values((SubLObject)methods.NIL, (SubLObject)methods.$kw75$UNDEFINED_METHOD);
        }
        return Values.values(Functions.funcall(function_ref, instance), (SubLObject)methods.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/methods.lisp", position = 29658L)
    public static SubLObject safe_funcall_instance_super_method_with_1_args(final SubLObject instance, final SubLObject method_name, final SubLObject arg0) {
        if (methods.NIL == subloop_structures.instance_p(instance)) {
            return Values.values((SubLObject)methods.NIL, (SubLObject)methods.$kw79$TARGET_NOT_AN_INSTANCE);
        }
        if (!method_name.isSymbol()) {
            return Values.values((SubLObject)methods.NIL, (SubLObject)methods.$kw72$INVALID_METHOD_NAME);
        }
        final SubLObject v_class = subloop_structures.instance_class(instance);
        final SubLObject method = method_shadowed_assoc(method_name, subloop_structures.class_compiled_instance_method_access_alist(v_class));
        if (methods.NIL == method) {
            return safe_funcall_class_super_method_with_1_args(v_class, method_name, arg0);
        }
        if (methods.NIL == instances.instances_access_check_method(v_class, method)) {
            return Values.values((SubLObject)methods.NIL, (SubLObject)methods.$kw74$ACCESS_LEVEL_CONFLICT);
        }
        final SubLObject function_ref = subloop_structures.method_function_name(method);
        if (methods.NIL == Symbols.fboundp(function_ref)) {
            return Values.values((SubLObject)methods.NIL, (SubLObject)methods.$kw75$UNDEFINED_METHOD);
        }
        return Values.values(Functions.funcall(function_ref, instance, arg0), (SubLObject)methods.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/methods.lisp", position = 29658L)
    public static SubLObject safe_funcall_instance_super_method_with_2_args(final SubLObject instance, final SubLObject method_name, final SubLObject arg0, final SubLObject arg1) {
        if (methods.NIL == subloop_structures.instance_p(instance)) {
            return Values.values((SubLObject)methods.NIL, (SubLObject)methods.$kw79$TARGET_NOT_AN_INSTANCE);
        }
        if (!method_name.isSymbol()) {
            return Values.values((SubLObject)methods.NIL, (SubLObject)methods.$kw72$INVALID_METHOD_NAME);
        }
        final SubLObject v_class = subloop_structures.instance_class(instance);
        final SubLObject method = method_shadowed_assoc(method_name, subloop_structures.class_compiled_instance_method_access_alist(v_class));
        if (methods.NIL == method) {
            return safe_funcall_class_super_method_with_2_args(v_class, method_name, arg0, arg1);
        }
        if (methods.NIL == instances.instances_access_check_method(v_class, method)) {
            return Values.values((SubLObject)methods.NIL, (SubLObject)methods.$kw74$ACCESS_LEVEL_CONFLICT);
        }
        final SubLObject function_ref = subloop_structures.method_function_name(method);
        if (methods.NIL == Symbols.fboundp(function_ref)) {
            return Values.values((SubLObject)methods.NIL, (SubLObject)methods.$kw75$UNDEFINED_METHOD);
        }
        return Values.values(Functions.funcall(function_ref, instance, arg0, arg1), (SubLObject)methods.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/methods.lisp", position = 29658L)
    public static SubLObject safe_funcall_instance_super_method_with_3_args(final SubLObject instance, final SubLObject method_name, final SubLObject arg0, final SubLObject arg1, final SubLObject arg2) {
        if (methods.NIL == subloop_structures.instance_p(instance)) {
            return Values.values((SubLObject)methods.NIL, (SubLObject)methods.$kw79$TARGET_NOT_AN_INSTANCE);
        }
        if (!method_name.isSymbol()) {
            return Values.values((SubLObject)methods.NIL, (SubLObject)methods.$kw72$INVALID_METHOD_NAME);
        }
        final SubLObject v_class = subloop_structures.instance_class(instance);
        final SubLObject method = method_shadowed_assoc(method_name, subloop_structures.class_compiled_instance_method_access_alist(v_class));
        if (methods.NIL == method) {
            return safe_funcall_class_super_method_with_3_args(v_class, method_name, arg0, arg1, arg2);
        }
        if (methods.NIL == instances.instances_access_check_method(v_class, method)) {
            return Values.values((SubLObject)methods.NIL, (SubLObject)methods.$kw74$ACCESS_LEVEL_CONFLICT);
        }
        final SubLObject function_ref = subloop_structures.method_function_name(method);
        if (methods.NIL == Symbols.fboundp(function_ref)) {
            return Values.values((SubLObject)methods.NIL, (SubLObject)methods.$kw75$UNDEFINED_METHOD);
        }
        return Values.values(Functions.funcall(function_ref, instance, arg0, arg1, arg2), (SubLObject)methods.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/methods.lisp", position = 29658L)
    public static SubLObject safe_funcall_instance_super_method_with_4_args(final SubLObject instance, final SubLObject method_name, final SubLObject arg0, final SubLObject arg1, final SubLObject arg2, final SubLObject arg3) {
        if (methods.NIL == subloop_structures.instance_p(instance)) {
            return Values.values((SubLObject)methods.NIL, (SubLObject)methods.$kw79$TARGET_NOT_AN_INSTANCE);
        }
        if (!method_name.isSymbol()) {
            return Values.values((SubLObject)methods.NIL, (SubLObject)methods.$kw72$INVALID_METHOD_NAME);
        }
        final SubLObject v_class = subloop_structures.instance_class(instance);
        final SubLObject method = method_shadowed_assoc(method_name, subloop_structures.class_compiled_instance_method_access_alist(v_class));
        if (methods.NIL == method) {
            return safe_funcall_class_super_method_with_4_args(v_class, method_name, arg0, arg1, arg2, arg3);
        }
        if (methods.NIL == instances.instances_access_check_method(v_class, method)) {
            return Values.values((SubLObject)methods.NIL, (SubLObject)methods.$kw74$ACCESS_LEVEL_CONFLICT);
        }
        final SubLObject function_ref = subloop_structures.method_function_name(method);
        if (methods.NIL == Symbols.fboundp(function_ref)) {
            return Values.values((SubLObject)methods.NIL, (SubLObject)methods.$kw75$UNDEFINED_METHOD);
        }
        return Values.values(Functions.funcall(function_ref, instance, arg0, arg1, arg2, arg3), (SubLObject)methods.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/methods.lisp", position = 29658L)
    public static SubLObject safe_funcall_instance_super_method_with_5_args(final SubLObject instance, final SubLObject method_name, final SubLObject arg0, final SubLObject arg1, final SubLObject arg2, final SubLObject arg3, final SubLObject arg4) {
        if (methods.NIL == subloop_structures.instance_p(instance)) {
            return Values.values((SubLObject)methods.NIL, (SubLObject)methods.$kw79$TARGET_NOT_AN_INSTANCE);
        }
        if (!method_name.isSymbol()) {
            return Values.values((SubLObject)methods.NIL, (SubLObject)methods.$kw72$INVALID_METHOD_NAME);
        }
        final SubLObject v_class = subloop_structures.instance_class(instance);
        final SubLObject method = method_shadowed_assoc(method_name, subloop_structures.class_compiled_instance_method_access_alist(v_class));
        if (methods.NIL == method) {
            return safe_funcall_class_super_method_with_5_args(v_class, method_name, arg0, arg1, arg2, arg3, arg4);
        }
        if (methods.NIL == instances.instances_access_check_method(v_class, method)) {
            return Values.values((SubLObject)methods.NIL, (SubLObject)methods.$kw74$ACCESS_LEVEL_CONFLICT);
        }
        final SubLObject function_ref = subloop_structures.method_function_name(method);
        if (methods.NIL == Symbols.fboundp(function_ref)) {
            return Values.values((SubLObject)methods.NIL, (SubLObject)methods.$kw75$UNDEFINED_METHOD);
        }
        return Values.values(Functions.funcall(function_ref, instance, arg0, arg1, arg2, arg3, arg4), (SubLObject)methods.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/methods.lisp", position = 29658L)
    public static SubLObject safe_funcall_instance_super_method_with_6_args(final SubLObject instance, final SubLObject method_name, final SubLObject arg0, final SubLObject arg1, final SubLObject arg2, final SubLObject arg3, final SubLObject arg4, final SubLObject arg5) {
        if (methods.NIL == subloop_structures.instance_p(instance)) {
            return Values.values((SubLObject)methods.NIL, (SubLObject)methods.$kw79$TARGET_NOT_AN_INSTANCE);
        }
        if (!method_name.isSymbol()) {
            return Values.values((SubLObject)methods.NIL, (SubLObject)methods.$kw72$INVALID_METHOD_NAME);
        }
        final SubLObject v_class = subloop_structures.instance_class(instance);
        final SubLObject method = method_shadowed_assoc(method_name, subloop_structures.class_compiled_instance_method_access_alist(v_class));
        if (methods.NIL == method) {
            return safe_funcall_class_super_method_with_6_args(v_class, method_name, arg0, arg1, arg2, arg3, arg4, arg5);
        }
        if (methods.NIL == instances.instances_access_check_method(v_class, method)) {
            return Values.values((SubLObject)methods.NIL, (SubLObject)methods.$kw74$ACCESS_LEVEL_CONFLICT);
        }
        final SubLObject function_ref = subloop_structures.method_function_name(method);
        if (methods.NIL == Symbols.fboundp(function_ref)) {
            return Values.values((SubLObject)methods.NIL, (SubLObject)methods.$kw75$UNDEFINED_METHOD);
        }
        return Values.values(Functions.funcall(function_ref, new SubLObject[] { instance, arg0, arg1, arg2, arg3, arg4, arg5 }), (SubLObject)methods.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/methods.lisp", position = 29658L)
    public static SubLObject safe_funcall_instance_super_method_with_7_args(final SubLObject instance, final SubLObject method_name, final SubLObject arg0, final SubLObject arg1, final SubLObject arg2, final SubLObject arg3, final SubLObject arg4, final SubLObject arg5, final SubLObject arg6) {
        if (methods.NIL == subloop_structures.instance_p(instance)) {
            return Values.values((SubLObject)methods.NIL, (SubLObject)methods.$kw79$TARGET_NOT_AN_INSTANCE);
        }
        if (!method_name.isSymbol()) {
            return Values.values((SubLObject)methods.NIL, (SubLObject)methods.$kw72$INVALID_METHOD_NAME);
        }
        final SubLObject v_class = subloop_structures.instance_class(instance);
        final SubLObject method = method_shadowed_assoc(method_name, subloop_structures.class_compiled_instance_method_access_alist(v_class));
        if (methods.NIL == method) {
            return safe_funcall_class_super_method_with_7_args(v_class, method_name, arg0, arg1, arg2, arg3, arg4, arg5, arg6);
        }
        if (methods.NIL == instances.instances_access_check_method(v_class, method)) {
            return Values.values((SubLObject)methods.NIL, (SubLObject)methods.$kw74$ACCESS_LEVEL_CONFLICT);
        }
        final SubLObject function_ref = subloop_structures.method_function_name(method);
        if (methods.NIL == Symbols.fboundp(function_ref)) {
            return Values.values((SubLObject)methods.NIL, (SubLObject)methods.$kw75$UNDEFINED_METHOD);
        }
        return Values.values(Functions.funcall(function_ref, new SubLObject[] { instance, arg0, arg1, arg2, arg3, arg4, arg5, arg6 }), (SubLObject)methods.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/methods.lisp", position = 29658L)
    public static SubLObject safe_funcall_instance_super_method_with_8_args(final SubLObject instance, final SubLObject method_name, final SubLObject arg0, final SubLObject arg1, final SubLObject arg2, final SubLObject arg3, final SubLObject arg4, final SubLObject arg5, final SubLObject arg6, final SubLObject arg7) {
        if (methods.NIL == subloop_structures.instance_p(instance)) {
            return Values.values((SubLObject)methods.NIL, (SubLObject)methods.$kw79$TARGET_NOT_AN_INSTANCE);
        }
        if (!method_name.isSymbol()) {
            return Values.values((SubLObject)methods.NIL, (SubLObject)methods.$kw72$INVALID_METHOD_NAME);
        }
        final SubLObject v_class = subloop_structures.instance_class(instance);
        final SubLObject method = method_shadowed_assoc(method_name, subloop_structures.class_compiled_instance_method_access_alist(v_class));
        if (methods.NIL == method) {
            return safe_funcall_class_super_method_with_8_args(v_class, method_name, arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7);
        }
        if (methods.NIL == instances.instances_access_check_method(v_class, method)) {
            return Values.values((SubLObject)methods.NIL, (SubLObject)methods.$kw74$ACCESS_LEVEL_CONFLICT);
        }
        final SubLObject function_ref = subloop_structures.method_function_name(method);
        if (methods.NIL == Symbols.fboundp(function_ref)) {
            return Values.values((SubLObject)methods.NIL, (SubLObject)methods.$kw75$UNDEFINED_METHOD);
        }
        return Values.values(Functions.funcall(function_ref, new SubLObject[] { instance, arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7 }), (SubLObject)methods.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/methods.lisp", position = 29658L)
    public static SubLObject safe_funcall_instance_super_method_with_9_args(final SubLObject instance, final SubLObject method_name, final SubLObject arg0, final SubLObject arg1, final SubLObject arg2, final SubLObject arg3, final SubLObject arg4, final SubLObject arg5, final SubLObject arg6, final SubLObject arg7, final SubLObject arg8) {
        if (methods.NIL == subloop_structures.instance_p(instance)) {
            return Values.values((SubLObject)methods.NIL, (SubLObject)methods.$kw79$TARGET_NOT_AN_INSTANCE);
        }
        if (!method_name.isSymbol()) {
            return Values.values((SubLObject)methods.NIL, (SubLObject)methods.$kw72$INVALID_METHOD_NAME);
        }
        final SubLObject v_class = subloop_structures.instance_class(instance);
        final SubLObject method = method_shadowed_assoc(method_name, subloop_structures.class_compiled_instance_method_access_alist(v_class));
        if (methods.NIL == method) {
            return safe_funcall_class_super_method_with_9_args(v_class, method_name, arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
        }
        if (methods.NIL == instances.instances_access_check_method(v_class, method)) {
            return Values.values((SubLObject)methods.NIL, (SubLObject)methods.$kw74$ACCESS_LEVEL_CONFLICT);
        }
        final SubLObject function_ref = subloop_structures.method_function_name(method);
        if (methods.NIL == Symbols.fboundp(function_ref)) {
            return Values.values((SubLObject)methods.NIL, (SubLObject)methods.$kw75$UNDEFINED_METHOD);
        }
        return Values.values(Functions.funcall(function_ref, new SubLObject[] { instance, arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8 }), (SubLObject)methods.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/methods.lisp", position = 29658L)
    public static SubLObject safe_funcall_instance_super_method_with_10_args(final SubLObject instance, final SubLObject method_name, final SubLObject arg0, final SubLObject arg1, final SubLObject arg2, final SubLObject arg3, final SubLObject arg4, final SubLObject arg5, final SubLObject arg6, final SubLObject arg7, final SubLObject arg8, final SubLObject arg9) {
        if (methods.NIL == subloop_structures.instance_p(instance)) {
            return Values.values((SubLObject)methods.NIL, (SubLObject)methods.$kw79$TARGET_NOT_AN_INSTANCE);
        }
        if (!method_name.isSymbol()) {
            return Values.values((SubLObject)methods.NIL, (SubLObject)methods.$kw72$INVALID_METHOD_NAME);
        }
        final SubLObject v_class = subloop_structures.instance_class(instance);
        final SubLObject method = method_shadowed_assoc(method_name, subloop_structures.class_compiled_instance_method_access_alist(v_class));
        if (methods.NIL == method) {
            return safe_funcall_class_super_method_with_10_args(v_class, method_name, arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9);
        }
        if (methods.NIL == instances.instances_access_check_method(v_class, method)) {
            return Values.values((SubLObject)methods.NIL, (SubLObject)methods.$kw74$ACCESS_LEVEL_CONFLICT);
        }
        final SubLObject function_ref = subloop_structures.method_function_name(method);
        if (methods.NIL == Symbols.fboundp(function_ref)) {
            return Values.values((SubLObject)methods.NIL, (SubLObject)methods.$kw75$UNDEFINED_METHOD);
        }
        return Values.values(Functions.funcall(function_ref, new SubLObject[] { instance, arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9 }), (SubLObject)methods.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/methods.lisp", position = 29658L)
    public static SubLObject safe_funcall_instance_super_method_with_11_args(final SubLObject instance, final SubLObject method_name, final SubLObject arg0, final SubLObject arg1, final SubLObject arg2, final SubLObject arg3, final SubLObject arg4, final SubLObject arg5, final SubLObject arg6, final SubLObject arg7, final SubLObject arg8, final SubLObject arg9, final SubLObject arg10) {
        if (methods.NIL == subloop_structures.instance_p(instance)) {
            return Values.values((SubLObject)methods.NIL, (SubLObject)methods.$kw79$TARGET_NOT_AN_INSTANCE);
        }
        if (!method_name.isSymbol()) {
            return Values.values((SubLObject)methods.NIL, (SubLObject)methods.$kw72$INVALID_METHOD_NAME);
        }
        final SubLObject v_class = subloop_structures.instance_class(instance);
        final SubLObject method = method_shadowed_assoc(method_name, subloop_structures.class_compiled_instance_method_access_alist(v_class));
        if (methods.NIL == method) {
            return safe_funcall_class_super_method_with_11_args(v_class, method_name, arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10);
        }
        if (methods.NIL == instances.instances_access_check_method(v_class, method)) {
            return Values.values((SubLObject)methods.NIL, (SubLObject)methods.$kw74$ACCESS_LEVEL_CONFLICT);
        }
        final SubLObject function_ref = subloop_structures.method_function_name(method);
        if (methods.NIL == Symbols.fboundp(function_ref)) {
            return Values.values((SubLObject)methods.NIL, (SubLObject)methods.$kw75$UNDEFINED_METHOD);
        }
        return Values.values(Functions.funcall(function_ref, new SubLObject[] { instance, arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10 }), (SubLObject)methods.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/methods.lisp", position = 29658L)
    public static SubLObject safe_funcall_instance_super_method_with_12_args(final SubLObject instance, final SubLObject method_name, final SubLObject arg0, final SubLObject arg1, final SubLObject arg2, final SubLObject arg3, final SubLObject arg4, final SubLObject arg5, final SubLObject arg6, final SubLObject arg7, final SubLObject arg8, final SubLObject arg9, final SubLObject arg10, final SubLObject arg11) {
        if (methods.NIL == subloop_structures.instance_p(instance)) {
            return Values.values((SubLObject)methods.NIL, (SubLObject)methods.$kw79$TARGET_NOT_AN_INSTANCE);
        }
        if (!method_name.isSymbol()) {
            return Values.values((SubLObject)methods.NIL, (SubLObject)methods.$kw72$INVALID_METHOD_NAME);
        }
        final SubLObject v_class = subloop_structures.instance_class(instance);
        final SubLObject method = method_shadowed_assoc(method_name, subloop_structures.class_compiled_instance_method_access_alist(v_class));
        if (methods.NIL == method) {
            return safe_funcall_class_super_method_with_12_args(v_class, method_name, arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10, arg11);
        }
        if (methods.NIL == instances.instances_access_check_method(v_class, method)) {
            return Values.values((SubLObject)methods.NIL, (SubLObject)methods.$kw74$ACCESS_LEVEL_CONFLICT);
        }
        final SubLObject function_ref = subloop_structures.method_function_name(method);
        if (methods.NIL == Symbols.fboundp(function_ref)) {
            return Values.values((SubLObject)methods.NIL, (SubLObject)methods.$kw75$UNDEFINED_METHOD);
        }
        return Values.values(Functions.funcall(function_ref, new SubLObject[] { instance, arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10, arg11 }), (SubLObject)methods.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/methods.lisp", position = 29658L)
    public static SubLObject safe_funcall_instance_super_method_with_13_args(final SubLObject instance, final SubLObject method_name, final SubLObject arg0, final SubLObject arg1, final SubLObject arg2, final SubLObject arg3, final SubLObject arg4, final SubLObject arg5, final SubLObject arg6, final SubLObject arg7, final SubLObject arg8, final SubLObject arg9, final SubLObject arg10, final SubLObject arg11, final SubLObject arg12) {
        if (methods.NIL == subloop_structures.instance_p(instance)) {
            return Values.values((SubLObject)methods.NIL, (SubLObject)methods.$kw79$TARGET_NOT_AN_INSTANCE);
        }
        if (!method_name.isSymbol()) {
            return Values.values((SubLObject)methods.NIL, (SubLObject)methods.$kw72$INVALID_METHOD_NAME);
        }
        final SubLObject v_class = subloop_structures.instance_class(instance);
        final SubLObject method = method_shadowed_assoc(method_name, subloop_structures.class_compiled_instance_method_access_alist(v_class));
        if (methods.NIL == method) {
            return safe_funcall_class_super_method_with_13_args(v_class, method_name, arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10, arg11, arg12);
        }
        if (methods.NIL == instances.instances_access_check_method(v_class, method)) {
            return Values.values((SubLObject)methods.NIL, (SubLObject)methods.$kw74$ACCESS_LEVEL_CONFLICT);
        }
        final SubLObject function_ref = subloop_structures.method_function_name(method);
        if (methods.NIL == Symbols.fboundp(function_ref)) {
            return Values.values((SubLObject)methods.NIL, (SubLObject)methods.$kw75$UNDEFINED_METHOD);
        }
        return Values.values(Functions.funcall(function_ref, new SubLObject[] { instance, arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10, arg11, arg12 }), (SubLObject)methods.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/methods.lisp", position = 29658L)
    public static SubLObject safe_funcall_instance_super_method_with_14_args(final SubLObject instance, final SubLObject method_name, final SubLObject arg0, final SubLObject arg1, final SubLObject arg2, final SubLObject arg3, final SubLObject arg4, final SubLObject arg5, final SubLObject arg6, final SubLObject arg7, final SubLObject arg8, final SubLObject arg9, final SubLObject arg10, final SubLObject arg11, final SubLObject arg12, final SubLObject arg13) {
        if (methods.NIL == subloop_structures.instance_p(instance)) {
            return Values.values((SubLObject)methods.NIL, (SubLObject)methods.$kw79$TARGET_NOT_AN_INSTANCE);
        }
        if (!method_name.isSymbol()) {
            return Values.values((SubLObject)methods.NIL, (SubLObject)methods.$kw72$INVALID_METHOD_NAME);
        }
        final SubLObject v_class = subloop_structures.instance_class(instance);
        final SubLObject method = method_shadowed_assoc(method_name, subloop_structures.class_compiled_instance_method_access_alist(v_class));
        if (methods.NIL == method) {
            return safe_funcall_class_super_method_with_14_args(v_class, method_name, arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10, arg11, arg12, arg13);
        }
        if (methods.NIL == instances.instances_access_check_method(v_class, method)) {
            return Values.values((SubLObject)methods.NIL, (SubLObject)methods.$kw74$ACCESS_LEVEL_CONFLICT);
        }
        final SubLObject function_ref = subloop_structures.method_function_name(method);
        if (methods.NIL == Symbols.fboundp(function_ref)) {
            return Values.values((SubLObject)methods.NIL, (SubLObject)methods.$kw75$UNDEFINED_METHOD);
        }
        return Values.values(Functions.funcall(function_ref, new SubLObject[] { instance, arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10, arg11, arg12, arg13 }), (SubLObject)methods.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/methods.lisp", position = 29658L)
    public static SubLObject safe_funcall_instance_super_method_with_15_args(final SubLObject instance, final SubLObject method_name, final SubLObject arg0, final SubLObject arg1, final SubLObject arg2, final SubLObject arg3, final SubLObject arg4, final SubLObject arg5, final SubLObject arg6, final SubLObject arg7, final SubLObject arg8, final SubLObject arg9, final SubLObject arg10, final SubLObject arg11, final SubLObject arg12, final SubLObject arg13, final SubLObject arg14) {
        if (methods.NIL == subloop_structures.instance_p(instance)) {
            return Values.values((SubLObject)methods.NIL, (SubLObject)methods.$kw79$TARGET_NOT_AN_INSTANCE);
        }
        if (!method_name.isSymbol()) {
            return Values.values((SubLObject)methods.NIL, (SubLObject)methods.$kw72$INVALID_METHOD_NAME);
        }
        final SubLObject v_class = subloop_structures.instance_class(instance);
        final SubLObject method = method_shadowed_assoc(method_name, subloop_structures.class_compiled_instance_method_access_alist(v_class));
        if (methods.NIL == method) {
            return safe_funcall_class_super_method_with_15_args(v_class, method_name, arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10, arg11, arg12, arg13, arg14);
        }
        if (methods.NIL == instances.instances_access_check_method(v_class, method)) {
            return Values.values((SubLObject)methods.NIL, (SubLObject)methods.$kw74$ACCESS_LEVEL_CONFLICT);
        }
        final SubLObject function_ref = subloop_structures.method_function_name(method);
        if (methods.NIL == Symbols.fboundp(function_ref)) {
            return Values.values((SubLObject)methods.NIL, (SubLObject)methods.$kw75$UNDEFINED_METHOD);
        }
        return Values.values(Functions.funcall(function_ref, new SubLObject[] { instance, arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10, arg11, arg12, arg13, arg14 }), (SubLObject)methods.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/methods.lisp", position = 29658L)
    public static SubLObject safe_funcall_instance_super_method_with_16_args(final SubLObject instance, final SubLObject method_name, final SubLObject arg0, final SubLObject arg1, final SubLObject arg2, final SubLObject arg3, final SubLObject arg4, final SubLObject arg5, final SubLObject arg6, final SubLObject arg7, final SubLObject arg8, final SubLObject arg9, final SubLObject arg10, final SubLObject arg11, final SubLObject arg12, final SubLObject arg13, final SubLObject arg14, final SubLObject arg15) {
        if (methods.NIL == subloop_structures.instance_p(instance)) {
            return Values.values((SubLObject)methods.NIL, (SubLObject)methods.$kw79$TARGET_NOT_AN_INSTANCE);
        }
        if (!method_name.isSymbol()) {
            return Values.values((SubLObject)methods.NIL, (SubLObject)methods.$kw72$INVALID_METHOD_NAME);
        }
        final SubLObject v_class = subloop_structures.instance_class(instance);
        final SubLObject method = method_shadowed_assoc(method_name, subloop_structures.class_compiled_instance_method_access_alist(v_class));
        if (methods.NIL == method) {
            return safe_funcall_class_super_method_with_16_args(v_class, method_name, arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10, arg11, arg12, arg13, arg14, arg15);
        }
        if (methods.NIL == instances.instances_access_check_method(v_class, method)) {
            return Values.values((SubLObject)methods.NIL, (SubLObject)methods.$kw74$ACCESS_LEVEL_CONFLICT);
        }
        final SubLObject function_ref = subloop_structures.method_function_name(method);
        if (methods.NIL == Symbols.fboundp(function_ref)) {
            return Values.values((SubLObject)methods.NIL, (SubLObject)methods.$kw75$UNDEFINED_METHOD);
        }
        return Values.values(Functions.funcall(function_ref, new SubLObject[] { instance, arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10, arg11, arg12, arg13, arg14, arg15 }), (SubLObject)methods.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/methods.lisp", position = 29658L)
    public static SubLObject safe_funcall_instance_super_method_with_17_args(final SubLObject instance, final SubLObject method_name, final SubLObject arg0, final SubLObject arg1, final SubLObject arg2, final SubLObject arg3, final SubLObject arg4, final SubLObject arg5, final SubLObject arg6, final SubLObject arg7, final SubLObject arg8, final SubLObject arg9, final SubLObject arg10, final SubLObject arg11, final SubLObject arg12, final SubLObject arg13, final SubLObject arg14, final SubLObject arg15, final SubLObject arg16) {
        if (methods.NIL == subloop_structures.instance_p(instance)) {
            return Values.values((SubLObject)methods.NIL, (SubLObject)methods.$kw79$TARGET_NOT_AN_INSTANCE);
        }
        if (!method_name.isSymbol()) {
            return Values.values((SubLObject)methods.NIL, (SubLObject)methods.$kw72$INVALID_METHOD_NAME);
        }
        final SubLObject v_class = subloop_structures.instance_class(instance);
        final SubLObject method = method_shadowed_assoc(method_name, subloop_structures.class_compiled_instance_method_access_alist(v_class));
        if (methods.NIL == method) {
            return safe_funcall_class_super_method_with_17_args(v_class, method_name, arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10, arg11, arg12, arg13, arg14, arg15, arg16);
        }
        if (methods.NIL == instances.instances_access_check_method(v_class, method)) {
            return Values.values((SubLObject)methods.NIL, (SubLObject)methods.$kw74$ACCESS_LEVEL_CONFLICT);
        }
        final SubLObject function_ref = subloop_structures.method_function_name(method);
        if (methods.NIL == Symbols.fboundp(function_ref)) {
            return Values.values((SubLObject)methods.NIL, (SubLObject)methods.$kw75$UNDEFINED_METHOD);
        }
        return Values.values(Functions.funcall(function_ref, new SubLObject[] { instance, arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10, arg11, arg12, arg13, arg14, arg15, arg16 }), (SubLObject)methods.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/methods.lisp", position = 29658L)
    public static SubLObject safe_funcall_instance_super_method_with_18_args(final SubLObject instance, final SubLObject method_name, final SubLObject arg0, final SubLObject arg1, final SubLObject arg2, final SubLObject arg3, final SubLObject arg4, final SubLObject arg5, final SubLObject arg6, final SubLObject arg7, final SubLObject arg8, final SubLObject arg9, final SubLObject arg10, final SubLObject arg11, final SubLObject arg12, final SubLObject arg13, final SubLObject arg14, final SubLObject arg15, final SubLObject arg16, final SubLObject arg17) {
        if (methods.NIL == subloop_structures.instance_p(instance)) {
            return Values.values((SubLObject)methods.NIL, (SubLObject)methods.$kw79$TARGET_NOT_AN_INSTANCE);
        }
        if (!method_name.isSymbol()) {
            return Values.values((SubLObject)methods.NIL, (SubLObject)methods.$kw72$INVALID_METHOD_NAME);
        }
        final SubLObject v_class = subloop_structures.instance_class(instance);
        final SubLObject method = method_shadowed_assoc(method_name, subloop_structures.class_compiled_instance_method_access_alist(v_class));
        if (methods.NIL == method) {
            return safe_funcall_class_super_method_with_18_args(v_class, method_name, arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10, arg11, arg12, arg13, arg14, arg15, arg16, arg17);
        }
        if (methods.NIL == instances.instances_access_check_method(v_class, method)) {
            return Values.values((SubLObject)methods.NIL, (SubLObject)methods.$kw74$ACCESS_LEVEL_CONFLICT);
        }
        final SubLObject function_ref = subloop_structures.method_function_name(method);
        if (methods.NIL == Symbols.fboundp(function_ref)) {
            return Values.values((SubLObject)methods.NIL, (SubLObject)methods.$kw75$UNDEFINED_METHOD);
        }
        return Values.values(Functions.funcall(function_ref, new SubLObject[] { instance, arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10, arg11, arg12, arg13, arg14, arg15, arg16, arg17 }), (SubLObject)methods.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/methods.lisp", position = 29658L)
    public static SubLObject safe_funcall_instance_super_method_with_19_args(final SubLObject instance, final SubLObject method_name, final SubLObject arg0, final SubLObject arg1, final SubLObject arg2, final SubLObject arg3, final SubLObject arg4, final SubLObject arg5, final SubLObject arg6, final SubLObject arg7, final SubLObject arg8, final SubLObject arg9, final SubLObject arg10, final SubLObject arg11, final SubLObject arg12, final SubLObject arg13, final SubLObject arg14, final SubLObject arg15, final SubLObject arg16, final SubLObject arg17, final SubLObject arg18) {
        if (methods.NIL == subloop_structures.instance_p(instance)) {
            return Values.values((SubLObject)methods.NIL, (SubLObject)methods.$kw79$TARGET_NOT_AN_INSTANCE);
        }
        if (!method_name.isSymbol()) {
            return Values.values((SubLObject)methods.NIL, (SubLObject)methods.$kw72$INVALID_METHOD_NAME);
        }
        final SubLObject v_class = subloop_structures.instance_class(instance);
        final SubLObject method = method_shadowed_assoc(method_name, subloop_structures.class_compiled_instance_method_access_alist(v_class));
        if (methods.NIL == method) {
            return safe_funcall_class_super_method_with_19_args(v_class, method_name, arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10, arg11, arg12, arg13, arg14, arg15, arg16, arg17, arg18);
        }
        if (methods.NIL == instances.instances_access_check_method(v_class, method)) {
            return Values.values((SubLObject)methods.NIL, (SubLObject)methods.$kw74$ACCESS_LEVEL_CONFLICT);
        }
        final SubLObject function_ref = subloop_structures.method_function_name(method);
        if (methods.NIL == Symbols.fboundp(function_ref)) {
            return Values.values((SubLObject)methods.NIL, (SubLObject)methods.$kw75$UNDEFINED_METHOD);
        }
        return Values.values(Functions.funcall(function_ref, new SubLObject[] { instance, arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10, arg11, arg12, arg13, arg14, arg15, arg16, arg17, arg18 }), (SubLObject)methods.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/methods.lisp", position = 29658L)
    public static SubLObject safe_funcall_instance_super_method_with_20_args(final SubLObject instance, final SubLObject method_name, final SubLObject arg0, final SubLObject arg1, final SubLObject arg2, final SubLObject arg3, final SubLObject arg4, final SubLObject arg5, final SubLObject arg6, final SubLObject arg7, final SubLObject arg8, final SubLObject arg9, final SubLObject arg10, final SubLObject arg11, final SubLObject arg12, final SubLObject arg13, final SubLObject arg14, final SubLObject arg15, final SubLObject arg16, final SubLObject arg17, final SubLObject arg18, final SubLObject arg19) {
        if (methods.NIL == subloop_structures.instance_p(instance)) {
            return Values.values((SubLObject)methods.NIL, (SubLObject)methods.$kw79$TARGET_NOT_AN_INSTANCE);
        }
        if (!method_name.isSymbol()) {
            return Values.values((SubLObject)methods.NIL, (SubLObject)methods.$kw72$INVALID_METHOD_NAME);
        }
        final SubLObject v_class = subloop_structures.instance_class(instance);
        final SubLObject method = method_shadowed_assoc(method_name, subloop_structures.class_compiled_instance_method_access_alist(v_class));
        if (methods.NIL == method) {
            return safe_funcall_class_super_method_with_20_args(v_class, method_name, arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10, arg11, arg12, arg13, arg14, arg15, arg16, arg17, arg18, arg19);
        }
        if (methods.NIL == instances.instances_access_check_method(v_class, method)) {
            return Values.values((SubLObject)methods.NIL, (SubLObject)methods.$kw74$ACCESS_LEVEL_CONFLICT);
        }
        final SubLObject function_ref = subloop_structures.method_function_name(method);
        if (methods.NIL == Symbols.fboundp(function_ref)) {
            return Values.values((SubLObject)methods.NIL, (SubLObject)methods.$kw75$UNDEFINED_METHOD);
        }
        return Values.values(Functions.funcall(function_ref, new SubLObject[] { instance, arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10, arg11, arg12, arg13, arg14, arg15, arg16, arg17, arg18, arg19 }), (SubLObject)methods.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/methods.lisp", position = 30538L)
    public static SubLObject safe_funcall_class_or_instance_method_with_0_args(final SubLObject class_or_instance, final SubLObject method_name) {
        if (methods.NIL == method_name || !method_name.isSymbol()) {
            return Values.values((SubLObject)methods.NIL, (SubLObject)methods.$kw72$INVALID_METHOD_NAME);
        }
        if (methods.NIL != subloop_structures.instance_p(class_or_instance)) {
            final SubLObject v_class = subloop_structures.instance_class(class_or_instance);
            final SubLObject method = Hashtables.gethash(method_name, subloop_structures.class_tablified_instance_methods(v_class), (SubLObject)methods.UNPROVIDED);
            if (methods.NIL == method) {
                return Values.values((SubLObject)methods.NIL, (SubLObject)methods.$kw73$UNDECLARED_METHOD);
            }
            if (methods.NIL == instances.instances_access_check_method(v_class, method)) {
                return Values.values((SubLObject)methods.NIL, (SubLObject)methods.$kw74$ACCESS_LEVEL_CONFLICT);
            }
            final SubLObject function_ref = subloop_structures.method_function_name(method);
            if (methods.NIL == Symbols.fboundp(function_ref)) {
                return Values.values((SubLObject)methods.NIL, (SubLObject)methods.$kw75$UNDEFINED_METHOD);
            }
            return Values.values(Functions.funcall(function_ref, class_or_instance), (SubLObject)methods.NIL);
        }
        else {
            final SubLObject v_class = (methods.NIL != subloop_structures.class_p(class_or_instance)) ? class_or_instance : classes.classes_retrieve_class(class_or_instance);
            final SubLObject method = (SubLObject)((methods.NIL != v_class) ? method_assoc(method_name, subloop_structures.class_compiled_class_method_access_alist(v_class)) : methods.NIL);
            if (methods.NIL == subloop_structures.class_p(v_class)) {
                return Values.values((SubLObject)methods.NIL, (SubLObject)methods.$kw71$TARGET_NOT_A_CLASS);
            }
            if (methods.NIL == method) {
                Values.values((SubLObject)methods.NIL, (SubLObject)methods.$kw73$UNDECLARED_METHOD);
            }
            if (methods.NIL == instances.instances_access_check_method(v_class, method)) {
                Values.values((SubLObject)methods.NIL, (SubLObject)methods.$kw74$ACCESS_LEVEL_CONFLICT);
            }
            final SubLObject function_ref = subloop_structures.method_function_name(method);
            if (methods.NIL == Symbols.fboundp(function_ref)) {
                return Values.values((SubLObject)methods.NIL, (SubLObject)methods.$kw75$UNDEFINED_METHOD);
            }
            return Values.values(Functions.funcall(function_ref, v_class), (SubLObject)methods.NIL);
        }
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/methods.lisp", position = 30538L)
    public static SubLObject safe_funcall_class_or_instance_method_with_1_args(final SubLObject class_or_instance, final SubLObject method_name, final SubLObject arg0) {
        if (methods.NIL == method_name || !method_name.isSymbol()) {
            return Values.values((SubLObject)methods.NIL, (SubLObject)methods.$kw72$INVALID_METHOD_NAME);
        }
        if (methods.NIL != subloop_structures.instance_p(class_or_instance)) {
            final SubLObject v_class = subloop_structures.instance_class(class_or_instance);
            final SubLObject method = Hashtables.gethash(method_name, subloop_structures.class_tablified_instance_methods(v_class), (SubLObject)methods.UNPROVIDED);
            if (methods.NIL == method) {
                return Values.values((SubLObject)methods.NIL, (SubLObject)methods.$kw73$UNDECLARED_METHOD);
            }
            if (methods.NIL == instances.instances_access_check_method(v_class, method)) {
                return Values.values((SubLObject)methods.NIL, (SubLObject)methods.$kw74$ACCESS_LEVEL_CONFLICT);
            }
            final SubLObject function_ref = subloop_structures.method_function_name(method);
            if (methods.NIL == Symbols.fboundp(function_ref)) {
                return Values.values((SubLObject)methods.NIL, (SubLObject)methods.$kw75$UNDEFINED_METHOD);
            }
            return Values.values(Functions.funcall(function_ref, class_or_instance, arg0), (SubLObject)methods.NIL);
        }
        else {
            final SubLObject v_class = (methods.NIL != subloop_structures.class_p(class_or_instance)) ? class_or_instance : classes.classes_retrieve_class(class_or_instance);
            final SubLObject method = (SubLObject)((methods.NIL != v_class) ? method_assoc(method_name, subloop_structures.class_compiled_class_method_access_alist(v_class)) : methods.NIL);
            if (methods.NIL == subloop_structures.class_p(v_class)) {
                return Values.values((SubLObject)methods.NIL, (SubLObject)methods.$kw71$TARGET_NOT_A_CLASS);
            }
            if (methods.NIL == method) {
                Values.values((SubLObject)methods.NIL, (SubLObject)methods.$kw73$UNDECLARED_METHOD);
            }
            if (methods.NIL == instances.instances_access_check_method(v_class, method)) {
                Values.values((SubLObject)methods.NIL, (SubLObject)methods.$kw74$ACCESS_LEVEL_CONFLICT);
            }
            final SubLObject function_ref = subloop_structures.method_function_name(method);
            if (methods.NIL == Symbols.fboundp(function_ref)) {
                return Values.values((SubLObject)methods.NIL, (SubLObject)methods.$kw75$UNDEFINED_METHOD);
            }
            return Values.values(Functions.funcall(function_ref, v_class, arg0), (SubLObject)methods.NIL);
        }
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/methods.lisp", position = 30538L)
    public static SubLObject safe_funcall_class_or_instance_method_with_2_args(final SubLObject class_or_instance, final SubLObject method_name, final SubLObject arg0, final SubLObject arg1) {
        if (methods.NIL == method_name || !method_name.isSymbol()) {
            return Values.values((SubLObject)methods.NIL, (SubLObject)methods.$kw72$INVALID_METHOD_NAME);
        }
        if (methods.NIL != subloop_structures.instance_p(class_or_instance)) {
            final SubLObject v_class = subloop_structures.instance_class(class_or_instance);
            final SubLObject method = Hashtables.gethash(method_name, subloop_structures.class_tablified_instance_methods(v_class), (SubLObject)methods.UNPROVIDED);
            if (methods.NIL == method) {
                return Values.values((SubLObject)methods.NIL, (SubLObject)methods.$kw73$UNDECLARED_METHOD);
            }
            if (methods.NIL == instances.instances_access_check_method(v_class, method)) {
                return Values.values((SubLObject)methods.NIL, (SubLObject)methods.$kw74$ACCESS_LEVEL_CONFLICT);
            }
            final SubLObject function_ref = subloop_structures.method_function_name(method);
            if (methods.NIL == Symbols.fboundp(function_ref)) {
                return Values.values((SubLObject)methods.NIL, (SubLObject)methods.$kw75$UNDEFINED_METHOD);
            }
            return Values.values(Functions.funcall(function_ref, class_or_instance, arg0, arg1), (SubLObject)methods.NIL);
        }
        else {
            final SubLObject v_class = (methods.NIL != subloop_structures.class_p(class_or_instance)) ? class_or_instance : classes.classes_retrieve_class(class_or_instance);
            final SubLObject method = (SubLObject)((methods.NIL != v_class) ? method_assoc(method_name, subloop_structures.class_compiled_class_method_access_alist(v_class)) : methods.NIL);
            if (methods.NIL == subloop_structures.class_p(v_class)) {
                return Values.values((SubLObject)methods.NIL, (SubLObject)methods.$kw71$TARGET_NOT_A_CLASS);
            }
            if (methods.NIL == method) {
                Values.values((SubLObject)methods.NIL, (SubLObject)methods.$kw73$UNDECLARED_METHOD);
            }
            if (methods.NIL == instances.instances_access_check_method(v_class, method)) {
                Values.values((SubLObject)methods.NIL, (SubLObject)methods.$kw74$ACCESS_LEVEL_CONFLICT);
            }
            final SubLObject function_ref = subloop_structures.method_function_name(method);
            if (methods.NIL == Symbols.fboundp(function_ref)) {
                return Values.values((SubLObject)methods.NIL, (SubLObject)methods.$kw75$UNDEFINED_METHOD);
            }
            return Values.values(Functions.funcall(function_ref, v_class, arg0, arg1), (SubLObject)methods.NIL);
        }
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/methods.lisp", position = 30538L)
    public static SubLObject safe_funcall_class_or_instance_method_with_3_args(final SubLObject class_or_instance, final SubLObject method_name, final SubLObject arg0, final SubLObject arg1, final SubLObject arg2) {
        if (methods.NIL == method_name || !method_name.isSymbol()) {
            return Values.values((SubLObject)methods.NIL, (SubLObject)methods.$kw72$INVALID_METHOD_NAME);
        }
        if (methods.NIL != subloop_structures.instance_p(class_or_instance)) {
            final SubLObject v_class = subloop_structures.instance_class(class_or_instance);
            final SubLObject method = Hashtables.gethash(method_name, subloop_structures.class_tablified_instance_methods(v_class), (SubLObject)methods.UNPROVIDED);
            if (methods.NIL == method) {
                return Values.values((SubLObject)methods.NIL, (SubLObject)methods.$kw73$UNDECLARED_METHOD);
            }
            if (methods.NIL == instances.instances_access_check_method(v_class, method)) {
                return Values.values((SubLObject)methods.NIL, (SubLObject)methods.$kw74$ACCESS_LEVEL_CONFLICT);
            }
            final SubLObject function_ref = subloop_structures.method_function_name(method);
            if (methods.NIL == Symbols.fboundp(function_ref)) {
                return Values.values((SubLObject)methods.NIL, (SubLObject)methods.$kw75$UNDEFINED_METHOD);
            }
            return Values.values(Functions.funcall(function_ref, class_or_instance, arg0, arg1, arg2), (SubLObject)methods.NIL);
        }
        else {
            final SubLObject v_class = (methods.NIL != subloop_structures.class_p(class_or_instance)) ? class_or_instance : classes.classes_retrieve_class(class_or_instance);
            final SubLObject method = (SubLObject)((methods.NIL != v_class) ? method_assoc(method_name, subloop_structures.class_compiled_class_method_access_alist(v_class)) : methods.NIL);
            if (methods.NIL == subloop_structures.class_p(v_class)) {
                return Values.values((SubLObject)methods.NIL, (SubLObject)methods.$kw71$TARGET_NOT_A_CLASS);
            }
            if (methods.NIL == method) {
                Values.values((SubLObject)methods.NIL, (SubLObject)methods.$kw73$UNDECLARED_METHOD);
            }
            if (methods.NIL == instances.instances_access_check_method(v_class, method)) {
                Values.values((SubLObject)methods.NIL, (SubLObject)methods.$kw74$ACCESS_LEVEL_CONFLICT);
            }
            final SubLObject function_ref = subloop_structures.method_function_name(method);
            if (methods.NIL == Symbols.fboundp(function_ref)) {
                return Values.values((SubLObject)methods.NIL, (SubLObject)methods.$kw75$UNDEFINED_METHOD);
            }
            return Values.values(Functions.funcall(function_ref, v_class, arg0, arg1, arg2), (SubLObject)methods.NIL);
        }
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/methods.lisp", position = 30538L)
    public static SubLObject safe_funcall_class_or_instance_method_with_4_args(final SubLObject class_or_instance, final SubLObject method_name, final SubLObject arg0, final SubLObject arg1, final SubLObject arg2, final SubLObject arg3) {
        if (methods.NIL == method_name || !method_name.isSymbol()) {
            return Values.values((SubLObject)methods.NIL, (SubLObject)methods.$kw72$INVALID_METHOD_NAME);
        }
        if (methods.NIL != subloop_structures.instance_p(class_or_instance)) {
            final SubLObject v_class = subloop_structures.instance_class(class_or_instance);
            final SubLObject method = Hashtables.gethash(method_name, subloop_structures.class_tablified_instance_methods(v_class), (SubLObject)methods.UNPROVIDED);
            if (methods.NIL == method) {
                return Values.values((SubLObject)methods.NIL, (SubLObject)methods.$kw73$UNDECLARED_METHOD);
            }
            if (methods.NIL == instances.instances_access_check_method(v_class, method)) {
                return Values.values((SubLObject)methods.NIL, (SubLObject)methods.$kw74$ACCESS_LEVEL_CONFLICT);
            }
            final SubLObject function_ref = subloop_structures.method_function_name(method);
            if (methods.NIL == Symbols.fboundp(function_ref)) {
                return Values.values((SubLObject)methods.NIL, (SubLObject)methods.$kw75$UNDEFINED_METHOD);
            }
            return Values.values(Functions.funcall(function_ref, class_or_instance, arg0, arg1, arg2, arg3), (SubLObject)methods.NIL);
        }
        else {
            final SubLObject v_class = (methods.NIL != subloop_structures.class_p(class_or_instance)) ? class_or_instance : classes.classes_retrieve_class(class_or_instance);
            final SubLObject method = (SubLObject)((methods.NIL != v_class) ? method_assoc(method_name, subloop_structures.class_compiled_class_method_access_alist(v_class)) : methods.NIL);
            if (methods.NIL == subloop_structures.class_p(v_class)) {
                return Values.values((SubLObject)methods.NIL, (SubLObject)methods.$kw71$TARGET_NOT_A_CLASS);
            }
            if (methods.NIL == method) {
                Values.values((SubLObject)methods.NIL, (SubLObject)methods.$kw73$UNDECLARED_METHOD);
            }
            if (methods.NIL == instances.instances_access_check_method(v_class, method)) {
                Values.values((SubLObject)methods.NIL, (SubLObject)methods.$kw74$ACCESS_LEVEL_CONFLICT);
            }
            final SubLObject function_ref = subloop_structures.method_function_name(method);
            if (methods.NIL == Symbols.fboundp(function_ref)) {
                return Values.values((SubLObject)methods.NIL, (SubLObject)methods.$kw75$UNDEFINED_METHOD);
            }
            return Values.values(Functions.funcall(function_ref, v_class, arg0, arg1, arg2, arg3), (SubLObject)methods.NIL);
        }
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/methods.lisp", position = 30538L)
    public static SubLObject safe_funcall_class_or_instance_method_with_5_args(final SubLObject class_or_instance, final SubLObject method_name, final SubLObject arg0, final SubLObject arg1, final SubLObject arg2, final SubLObject arg3, final SubLObject arg4) {
        if (methods.NIL == method_name || !method_name.isSymbol()) {
            return Values.values((SubLObject)methods.NIL, (SubLObject)methods.$kw72$INVALID_METHOD_NAME);
        }
        if (methods.NIL != subloop_structures.instance_p(class_or_instance)) {
            final SubLObject v_class = subloop_structures.instance_class(class_or_instance);
            final SubLObject method = Hashtables.gethash(method_name, subloop_structures.class_tablified_instance_methods(v_class), (SubLObject)methods.UNPROVIDED);
            if (methods.NIL == method) {
                return Values.values((SubLObject)methods.NIL, (SubLObject)methods.$kw73$UNDECLARED_METHOD);
            }
            if (methods.NIL == instances.instances_access_check_method(v_class, method)) {
                return Values.values((SubLObject)methods.NIL, (SubLObject)methods.$kw74$ACCESS_LEVEL_CONFLICT);
            }
            final SubLObject function_ref = subloop_structures.method_function_name(method);
            if (methods.NIL == Symbols.fboundp(function_ref)) {
                return Values.values((SubLObject)methods.NIL, (SubLObject)methods.$kw75$UNDEFINED_METHOD);
            }
            return Values.values(Functions.funcall(function_ref, class_or_instance, arg0, arg1, arg2, arg3, arg4), (SubLObject)methods.NIL);
        }
        else {
            final SubLObject v_class = (methods.NIL != subloop_structures.class_p(class_or_instance)) ? class_or_instance : classes.classes_retrieve_class(class_or_instance);
            final SubLObject method = (SubLObject)((methods.NIL != v_class) ? method_assoc(method_name, subloop_structures.class_compiled_class_method_access_alist(v_class)) : methods.NIL);
            if (methods.NIL == subloop_structures.class_p(v_class)) {
                return Values.values((SubLObject)methods.NIL, (SubLObject)methods.$kw71$TARGET_NOT_A_CLASS);
            }
            if (methods.NIL == method) {
                Values.values((SubLObject)methods.NIL, (SubLObject)methods.$kw73$UNDECLARED_METHOD);
            }
            if (methods.NIL == instances.instances_access_check_method(v_class, method)) {
                Values.values((SubLObject)methods.NIL, (SubLObject)methods.$kw74$ACCESS_LEVEL_CONFLICT);
            }
            final SubLObject function_ref = subloop_structures.method_function_name(method);
            if (methods.NIL == Symbols.fboundp(function_ref)) {
                return Values.values((SubLObject)methods.NIL, (SubLObject)methods.$kw75$UNDEFINED_METHOD);
            }
            return Values.values(Functions.funcall(function_ref, v_class, arg0, arg1, arg2, arg3, arg4), (SubLObject)methods.NIL);
        }
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/methods.lisp", position = 30538L)
    public static SubLObject safe_funcall_class_or_instance_method_with_6_args(final SubLObject class_or_instance, final SubLObject method_name, final SubLObject arg0, final SubLObject arg1, final SubLObject arg2, final SubLObject arg3, final SubLObject arg4, final SubLObject arg5) {
        if (methods.NIL == method_name || !method_name.isSymbol()) {
            return Values.values((SubLObject)methods.NIL, (SubLObject)methods.$kw72$INVALID_METHOD_NAME);
        }
        if (methods.NIL != subloop_structures.instance_p(class_or_instance)) {
            final SubLObject v_class = subloop_structures.instance_class(class_or_instance);
            final SubLObject method = Hashtables.gethash(method_name, subloop_structures.class_tablified_instance_methods(v_class), (SubLObject)methods.UNPROVIDED);
            if (methods.NIL == method) {
                return Values.values((SubLObject)methods.NIL, (SubLObject)methods.$kw73$UNDECLARED_METHOD);
            }
            if (methods.NIL == instances.instances_access_check_method(v_class, method)) {
                return Values.values((SubLObject)methods.NIL, (SubLObject)methods.$kw74$ACCESS_LEVEL_CONFLICT);
            }
            final SubLObject function_ref = subloop_structures.method_function_name(method);
            if (methods.NIL == Symbols.fboundp(function_ref)) {
                return Values.values((SubLObject)methods.NIL, (SubLObject)methods.$kw75$UNDEFINED_METHOD);
            }
            return Values.values(Functions.funcall(function_ref, new SubLObject[] { class_or_instance, arg0, arg1, arg2, arg3, arg4, arg5 }), (SubLObject)methods.NIL);
        }
        else {
            final SubLObject v_class = (methods.NIL != subloop_structures.class_p(class_or_instance)) ? class_or_instance : classes.classes_retrieve_class(class_or_instance);
            final SubLObject method = (SubLObject)((methods.NIL != v_class) ? method_assoc(method_name, subloop_structures.class_compiled_class_method_access_alist(v_class)) : methods.NIL);
            if (methods.NIL == subloop_structures.class_p(v_class)) {
                return Values.values((SubLObject)methods.NIL, (SubLObject)methods.$kw71$TARGET_NOT_A_CLASS);
            }
            if (methods.NIL == method) {
                Values.values((SubLObject)methods.NIL, (SubLObject)methods.$kw73$UNDECLARED_METHOD);
            }
            if (methods.NIL == instances.instances_access_check_method(v_class, method)) {
                Values.values((SubLObject)methods.NIL, (SubLObject)methods.$kw74$ACCESS_LEVEL_CONFLICT);
            }
            final SubLObject function_ref = subloop_structures.method_function_name(method);
            if (methods.NIL == Symbols.fboundp(function_ref)) {
                return Values.values((SubLObject)methods.NIL, (SubLObject)methods.$kw75$UNDEFINED_METHOD);
            }
            return Values.values(Functions.funcall(function_ref, new SubLObject[] { v_class, arg0, arg1, arg2, arg3, arg4, arg5 }), (SubLObject)methods.NIL);
        }
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/methods.lisp", position = 30538L)
    public static SubLObject safe_funcall_class_or_instance_method_with_7_args(final SubLObject class_or_instance, final SubLObject method_name, final SubLObject arg0, final SubLObject arg1, final SubLObject arg2, final SubLObject arg3, final SubLObject arg4, final SubLObject arg5, final SubLObject arg6) {
        if (methods.NIL == method_name || !method_name.isSymbol()) {
            return Values.values((SubLObject)methods.NIL, (SubLObject)methods.$kw72$INVALID_METHOD_NAME);
        }
        if (methods.NIL != subloop_structures.instance_p(class_or_instance)) {
            final SubLObject v_class = subloop_structures.instance_class(class_or_instance);
            final SubLObject method = Hashtables.gethash(method_name, subloop_structures.class_tablified_instance_methods(v_class), (SubLObject)methods.UNPROVIDED);
            if (methods.NIL == method) {
                return Values.values((SubLObject)methods.NIL, (SubLObject)methods.$kw73$UNDECLARED_METHOD);
            }
            if (methods.NIL == instances.instances_access_check_method(v_class, method)) {
                return Values.values((SubLObject)methods.NIL, (SubLObject)methods.$kw74$ACCESS_LEVEL_CONFLICT);
            }
            final SubLObject function_ref = subloop_structures.method_function_name(method);
            if (methods.NIL == Symbols.fboundp(function_ref)) {
                return Values.values((SubLObject)methods.NIL, (SubLObject)methods.$kw75$UNDEFINED_METHOD);
            }
            return Values.values(Functions.funcall(function_ref, new SubLObject[] { class_or_instance, arg0, arg1, arg2, arg3, arg4, arg5, arg6 }), (SubLObject)methods.NIL);
        }
        else {
            final SubLObject v_class = (methods.NIL != subloop_structures.class_p(class_or_instance)) ? class_or_instance : classes.classes_retrieve_class(class_or_instance);
            final SubLObject method = (SubLObject)((methods.NIL != v_class) ? method_assoc(method_name, subloop_structures.class_compiled_class_method_access_alist(v_class)) : methods.NIL);
            if (methods.NIL == subloop_structures.class_p(v_class)) {
                return Values.values((SubLObject)methods.NIL, (SubLObject)methods.$kw71$TARGET_NOT_A_CLASS);
            }
            if (methods.NIL == method) {
                Values.values((SubLObject)methods.NIL, (SubLObject)methods.$kw73$UNDECLARED_METHOD);
            }
            if (methods.NIL == instances.instances_access_check_method(v_class, method)) {
                Values.values((SubLObject)methods.NIL, (SubLObject)methods.$kw74$ACCESS_LEVEL_CONFLICT);
            }
            final SubLObject function_ref = subloop_structures.method_function_name(method);
            if (methods.NIL == Symbols.fboundp(function_ref)) {
                return Values.values((SubLObject)methods.NIL, (SubLObject)methods.$kw75$UNDEFINED_METHOD);
            }
            return Values.values(Functions.funcall(function_ref, new SubLObject[] { v_class, arg0, arg1, arg2, arg3, arg4, arg5, arg6 }), (SubLObject)methods.NIL);
        }
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/methods.lisp", position = 30538L)
    public static SubLObject safe_funcall_class_or_instance_method_with_8_args(final SubLObject class_or_instance, final SubLObject method_name, final SubLObject arg0, final SubLObject arg1, final SubLObject arg2, final SubLObject arg3, final SubLObject arg4, final SubLObject arg5, final SubLObject arg6, final SubLObject arg7) {
        if (methods.NIL == method_name || !method_name.isSymbol()) {
            return Values.values((SubLObject)methods.NIL, (SubLObject)methods.$kw72$INVALID_METHOD_NAME);
        }
        if (methods.NIL != subloop_structures.instance_p(class_or_instance)) {
            final SubLObject v_class = subloop_structures.instance_class(class_or_instance);
            final SubLObject method = Hashtables.gethash(method_name, subloop_structures.class_tablified_instance_methods(v_class), (SubLObject)methods.UNPROVIDED);
            if (methods.NIL == method) {
                return Values.values((SubLObject)methods.NIL, (SubLObject)methods.$kw73$UNDECLARED_METHOD);
            }
            if (methods.NIL == instances.instances_access_check_method(v_class, method)) {
                return Values.values((SubLObject)methods.NIL, (SubLObject)methods.$kw74$ACCESS_LEVEL_CONFLICT);
            }
            final SubLObject function_ref = subloop_structures.method_function_name(method);
            if (methods.NIL == Symbols.fboundp(function_ref)) {
                return Values.values((SubLObject)methods.NIL, (SubLObject)methods.$kw75$UNDEFINED_METHOD);
            }
            return Values.values(Functions.funcall(function_ref, new SubLObject[] { class_or_instance, arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7 }), (SubLObject)methods.NIL);
        }
        else {
            final SubLObject v_class = (methods.NIL != subloop_structures.class_p(class_or_instance)) ? class_or_instance : classes.classes_retrieve_class(class_or_instance);
            final SubLObject method = (SubLObject)((methods.NIL != v_class) ? method_assoc(method_name, subloop_structures.class_compiled_class_method_access_alist(v_class)) : methods.NIL);
            if (methods.NIL == subloop_structures.class_p(v_class)) {
                return Values.values((SubLObject)methods.NIL, (SubLObject)methods.$kw71$TARGET_NOT_A_CLASS);
            }
            if (methods.NIL == method) {
                Values.values((SubLObject)methods.NIL, (SubLObject)methods.$kw73$UNDECLARED_METHOD);
            }
            if (methods.NIL == instances.instances_access_check_method(v_class, method)) {
                Values.values((SubLObject)methods.NIL, (SubLObject)methods.$kw74$ACCESS_LEVEL_CONFLICT);
            }
            final SubLObject function_ref = subloop_structures.method_function_name(method);
            if (methods.NIL == Symbols.fboundp(function_ref)) {
                return Values.values((SubLObject)methods.NIL, (SubLObject)methods.$kw75$UNDEFINED_METHOD);
            }
            return Values.values(Functions.funcall(function_ref, new SubLObject[] { v_class, arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7 }), (SubLObject)methods.NIL);
        }
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/methods.lisp", position = 30538L)
    public static SubLObject safe_funcall_class_or_instance_method_with_9_args(final SubLObject class_or_instance, final SubLObject method_name, final SubLObject arg0, final SubLObject arg1, final SubLObject arg2, final SubLObject arg3, final SubLObject arg4, final SubLObject arg5, final SubLObject arg6, final SubLObject arg7, final SubLObject arg8) {
        if (methods.NIL == method_name || !method_name.isSymbol()) {
            return Values.values((SubLObject)methods.NIL, (SubLObject)methods.$kw72$INVALID_METHOD_NAME);
        }
        if (methods.NIL != subloop_structures.instance_p(class_or_instance)) {
            final SubLObject v_class = subloop_structures.instance_class(class_or_instance);
            final SubLObject method = Hashtables.gethash(method_name, subloop_structures.class_tablified_instance_methods(v_class), (SubLObject)methods.UNPROVIDED);
            if (methods.NIL == method) {
                return Values.values((SubLObject)methods.NIL, (SubLObject)methods.$kw73$UNDECLARED_METHOD);
            }
            if (methods.NIL == instances.instances_access_check_method(v_class, method)) {
                return Values.values((SubLObject)methods.NIL, (SubLObject)methods.$kw74$ACCESS_LEVEL_CONFLICT);
            }
            final SubLObject function_ref = subloop_structures.method_function_name(method);
            if (methods.NIL == Symbols.fboundp(function_ref)) {
                return Values.values((SubLObject)methods.NIL, (SubLObject)methods.$kw75$UNDEFINED_METHOD);
            }
            return Values.values(Functions.funcall(function_ref, new SubLObject[] { class_or_instance, arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8 }), (SubLObject)methods.NIL);
        }
        else {
            final SubLObject v_class = (methods.NIL != subloop_structures.class_p(class_or_instance)) ? class_or_instance : classes.classes_retrieve_class(class_or_instance);
            final SubLObject method = (SubLObject)((methods.NIL != v_class) ? method_assoc(method_name, subloop_structures.class_compiled_class_method_access_alist(v_class)) : methods.NIL);
            if (methods.NIL == subloop_structures.class_p(v_class)) {
                return Values.values((SubLObject)methods.NIL, (SubLObject)methods.$kw71$TARGET_NOT_A_CLASS);
            }
            if (methods.NIL == method) {
                Values.values((SubLObject)methods.NIL, (SubLObject)methods.$kw73$UNDECLARED_METHOD);
            }
            if (methods.NIL == instances.instances_access_check_method(v_class, method)) {
                Values.values((SubLObject)methods.NIL, (SubLObject)methods.$kw74$ACCESS_LEVEL_CONFLICT);
            }
            final SubLObject function_ref = subloop_structures.method_function_name(method);
            if (methods.NIL == Symbols.fboundp(function_ref)) {
                return Values.values((SubLObject)methods.NIL, (SubLObject)methods.$kw75$UNDEFINED_METHOD);
            }
            return Values.values(Functions.funcall(function_ref, new SubLObject[] { v_class, arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8 }), (SubLObject)methods.NIL);
        }
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/methods.lisp", position = 30538L)
    public static SubLObject safe_funcall_class_or_instance_method_with_10_args(final SubLObject class_or_instance, final SubLObject method_name, final SubLObject arg0, final SubLObject arg1, final SubLObject arg2, final SubLObject arg3, final SubLObject arg4, final SubLObject arg5, final SubLObject arg6, final SubLObject arg7, final SubLObject arg8, final SubLObject arg9) {
        if (methods.NIL == method_name || !method_name.isSymbol()) {
            return Values.values((SubLObject)methods.NIL, (SubLObject)methods.$kw72$INVALID_METHOD_NAME);
        }
        if (methods.NIL != subloop_structures.instance_p(class_or_instance)) {
            final SubLObject v_class = subloop_structures.instance_class(class_or_instance);
            final SubLObject method = Hashtables.gethash(method_name, subloop_structures.class_tablified_instance_methods(v_class), (SubLObject)methods.UNPROVIDED);
            if (methods.NIL == method) {
                return Values.values((SubLObject)methods.NIL, (SubLObject)methods.$kw73$UNDECLARED_METHOD);
            }
            if (methods.NIL == instances.instances_access_check_method(v_class, method)) {
                return Values.values((SubLObject)methods.NIL, (SubLObject)methods.$kw74$ACCESS_LEVEL_CONFLICT);
            }
            final SubLObject function_ref = subloop_structures.method_function_name(method);
            if (methods.NIL == Symbols.fboundp(function_ref)) {
                return Values.values((SubLObject)methods.NIL, (SubLObject)methods.$kw75$UNDEFINED_METHOD);
            }
            return Values.values(Functions.funcall(function_ref, new SubLObject[] { class_or_instance, arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9 }), (SubLObject)methods.NIL);
        }
        else {
            final SubLObject v_class = (methods.NIL != subloop_structures.class_p(class_or_instance)) ? class_or_instance : classes.classes_retrieve_class(class_or_instance);
            final SubLObject method = (SubLObject)((methods.NIL != v_class) ? method_assoc(method_name, subloop_structures.class_compiled_class_method_access_alist(v_class)) : methods.NIL);
            if (methods.NIL == subloop_structures.class_p(v_class)) {
                return Values.values((SubLObject)methods.NIL, (SubLObject)methods.$kw71$TARGET_NOT_A_CLASS);
            }
            if (methods.NIL == method) {
                Values.values((SubLObject)methods.NIL, (SubLObject)methods.$kw73$UNDECLARED_METHOD);
            }
            if (methods.NIL == instances.instances_access_check_method(v_class, method)) {
                Values.values((SubLObject)methods.NIL, (SubLObject)methods.$kw74$ACCESS_LEVEL_CONFLICT);
            }
            final SubLObject function_ref = subloop_structures.method_function_name(method);
            if (methods.NIL == Symbols.fboundp(function_ref)) {
                return Values.values((SubLObject)methods.NIL, (SubLObject)methods.$kw75$UNDEFINED_METHOD);
            }
            return Values.values(Functions.funcall(function_ref, new SubLObject[] { v_class, arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9 }), (SubLObject)methods.NIL);
        }
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/methods.lisp", position = 30538L)
    public static SubLObject safe_funcall_class_or_instance_method_with_11_args(final SubLObject class_or_instance, final SubLObject method_name, final SubLObject arg0, final SubLObject arg1, final SubLObject arg2, final SubLObject arg3, final SubLObject arg4, final SubLObject arg5, final SubLObject arg6, final SubLObject arg7, final SubLObject arg8, final SubLObject arg9, final SubLObject arg10) {
        if (methods.NIL == method_name || !method_name.isSymbol()) {
            return Values.values((SubLObject)methods.NIL, (SubLObject)methods.$kw72$INVALID_METHOD_NAME);
        }
        if (methods.NIL != subloop_structures.instance_p(class_or_instance)) {
            final SubLObject v_class = subloop_structures.instance_class(class_or_instance);
            final SubLObject method = Hashtables.gethash(method_name, subloop_structures.class_tablified_instance_methods(v_class), (SubLObject)methods.UNPROVIDED);
            if (methods.NIL == method) {
                return Values.values((SubLObject)methods.NIL, (SubLObject)methods.$kw73$UNDECLARED_METHOD);
            }
            if (methods.NIL == instances.instances_access_check_method(v_class, method)) {
                return Values.values((SubLObject)methods.NIL, (SubLObject)methods.$kw74$ACCESS_LEVEL_CONFLICT);
            }
            final SubLObject function_ref = subloop_structures.method_function_name(method);
            if (methods.NIL == Symbols.fboundp(function_ref)) {
                return Values.values((SubLObject)methods.NIL, (SubLObject)methods.$kw75$UNDEFINED_METHOD);
            }
            return Values.values(Functions.funcall(function_ref, new SubLObject[] { class_or_instance, arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10 }), (SubLObject)methods.NIL);
        }
        else {
            final SubLObject v_class = (methods.NIL != subloop_structures.class_p(class_or_instance)) ? class_or_instance : classes.classes_retrieve_class(class_or_instance);
            final SubLObject method = (SubLObject)((methods.NIL != v_class) ? method_assoc(method_name, subloop_structures.class_compiled_class_method_access_alist(v_class)) : methods.NIL);
            if (methods.NIL == subloop_structures.class_p(v_class)) {
                return Values.values((SubLObject)methods.NIL, (SubLObject)methods.$kw71$TARGET_NOT_A_CLASS);
            }
            if (methods.NIL == method) {
                Values.values((SubLObject)methods.NIL, (SubLObject)methods.$kw73$UNDECLARED_METHOD);
            }
            if (methods.NIL == instances.instances_access_check_method(v_class, method)) {
                Values.values((SubLObject)methods.NIL, (SubLObject)methods.$kw74$ACCESS_LEVEL_CONFLICT);
            }
            final SubLObject function_ref = subloop_structures.method_function_name(method);
            if (methods.NIL == Symbols.fboundp(function_ref)) {
                return Values.values((SubLObject)methods.NIL, (SubLObject)methods.$kw75$UNDEFINED_METHOD);
            }
            return Values.values(Functions.funcall(function_ref, new SubLObject[] { v_class, arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10 }), (SubLObject)methods.NIL);
        }
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/methods.lisp", position = 30538L)
    public static SubLObject safe_funcall_class_or_instance_method_with_12_args(final SubLObject class_or_instance, final SubLObject method_name, final SubLObject arg0, final SubLObject arg1, final SubLObject arg2, final SubLObject arg3, final SubLObject arg4, final SubLObject arg5, final SubLObject arg6, final SubLObject arg7, final SubLObject arg8, final SubLObject arg9, final SubLObject arg10, final SubLObject arg11) {
        if (methods.NIL == method_name || !method_name.isSymbol()) {
            return Values.values((SubLObject)methods.NIL, (SubLObject)methods.$kw72$INVALID_METHOD_NAME);
        }
        if (methods.NIL != subloop_structures.instance_p(class_or_instance)) {
            final SubLObject v_class = subloop_structures.instance_class(class_or_instance);
            final SubLObject method = Hashtables.gethash(method_name, subloop_structures.class_tablified_instance_methods(v_class), (SubLObject)methods.UNPROVIDED);
            if (methods.NIL == method) {
                return Values.values((SubLObject)methods.NIL, (SubLObject)methods.$kw73$UNDECLARED_METHOD);
            }
            if (methods.NIL == instances.instances_access_check_method(v_class, method)) {
                return Values.values((SubLObject)methods.NIL, (SubLObject)methods.$kw74$ACCESS_LEVEL_CONFLICT);
            }
            final SubLObject function_ref = subloop_structures.method_function_name(method);
            if (methods.NIL == Symbols.fboundp(function_ref)) {
                return Values.values((SubLObject)methods.NIL, (SubLObject)methods.$kw75$UNDEFINED_METHOD);
            }
            return Values.values(Functions.funcall(function_ref, new SubLObject[] { class_or_instance, arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10, arg11 }), (SubLObject)methods.NIL);
        }
        else {
            final SubLObject v_class = (methods.NIL != subloop_structures.class_p(class_or_instance)) ? class_or_instance : classes.classes_retrieve_class(class_or_instance);
            final SubLObject method = (SubLObject)((methods.NIL != v_class) ? method_assoc(method_name, subloop_structures.class_compiled_class_method_access_alist(v_class)) : methods.NIL);
            if (methods.NIL == subloop_structures.class_p(v_class)) {
                return Values.values((SubLObject)methods.NIL, (SubLObject)methods.$kw71$TARGET_NOT_A_CLASS);
            }
            if (methods.NIL == method) {
                Values.values((SubLObject)methods.NIL, (SubLObject)methods.$kw73$UNDECLARED_METHOD);
            }
            if (methods.NIL == instances.instances_access_check_method(v_class, method)) {
                Values.values((SubLObject)methods.NIL, (SubLObject)methods.$kw74$ACCESS_LEVEL_CONFLICT);
            }
            final SubLObject function_ref = subloop_structures.method_function_name(method);
            if (methods.NIL == Symbols.fboundp(function_ref)) {
                return Values.values((SubLObject)methods.NIL, (SubLObject)methods.$kw75$UNDEFINED_METHOD);
            }
            return Values.values(Functions.funcall(function_ref, new SubLObject[] { v_class, arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10, arg11 }), (SubLObject)methods.NIL);
        }
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/methods.lisp", position = 30538L)
    public static SubLObject safe_funcall_class_or_instance_method_with_13_args(final SubLObject class_or_instance, final SubLObject method_name, final SubLObject arg0, final SubLObject arg1, final SubLObject arg2, final SubLObject arg3, final SubLObject arg4, final SubLObject arg5, final SubLObject arg6, final SubLObject arg7, final SubLObject arg8, final SubLObject arg9, final SubLObject arg10, final SubLObject arg11, final SubLObject arg12) {
        if (methods.NIL == method_name || !method_name.isSymbol()) {
            return Values.values((SubLObject)methods.NIL, (SubLObject)methods.$kw72$INVALID_METHOD_NAME);
        }
        if (methods.NIL != subloop_structures.instance_p(class_or_instance)) {
            final SubLObject v_class = subloop_structures.instance_class(class_or_instance);
            final SubLObject method = Hashtables.gethash(method_name, subloop_structures.class_tablified_instance_methods(v_class), (SubLObject)methods.UNPROVIDED);
            if (methods.NIL == method) {
                return Values.values((SubLObject)methods.NIL, (SubLObject)methods.$kw73$UNDECLARED_METHOD);
            }
            if (methods.NIL == instances.instances_access_check_method(v_class, method)) {
                return Values.values((SubLObject)methods.NIL, (SubLObject)methods.$kw74$ACCESS_LEVEL_CONFLICT);
            }
            final SubLObject function_ref = subloop_structures.method_function_name(method);
            if (methods.NIL == Symbols.fboundp(function_ref)) {
                return Values.values((SubLObject)methods.NIL, (SubLObject)methods.$kw75$UNDEFINED_METHOD);
            }
            return Values.values(Functions.funcall(function_ref, new SubLObject[] { class_or_instance, arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10, arg11, arg12 }), (SubLObject)methods.NIL);
        }
        else {
            final SubLObject v_class = (methods.NIL != subloop_structures.class_p(class_or_instance)) ? class_or_instance : classes.classes_retrieve_class(class_or_instance);
            final SubLObject method = (SubLObject)((methods.NIL != v_class) ? method_assoc(method_name, subloop_structures.class_compiled_class_method_access_alist(v_class)) : methods.NIL);
            if (methods.NIL == subloop_structures.class_p(v_class)) {
                return Values.values((SubLObject)methods.NIL, (SubLObject)methods.$kw71$TARGET_NOT_A_CLASS);
            }
            if (methods.NIL == method) {
                Values.values((SubLObject)methods.NIL, (SubLObject)methods.$kw73$UNDECLARED_METHOD);
            }
            if (methods.NIL == instances.instances_access_check_method(v_class, method)) {
                Values.values((SubLObject)methods.NIL, (SubLObject)methods.$kw74$ACCESS_LEVEL_CONFLICT);
            }
            final SubLObject function_ref = subloop_structures.method_function_name(method);
            if (methods.NIL == Symbols.fboundp(function_ref)) {
                return Values.values((SubLObject)methods.NIL, (SubLObject)methods.$kw75$UNDEFINED_METHOD);
            }
            return Values.values(Functions.funcall(function_ref, new SubLObject[] { v_class, arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10, arg11, arg12 }), (SubLObject)methods.NIL);
        }
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/methods.lisp", position = 30538L)
    public static SubLObject safe_funcall_class_or_instance_method_with_14_args(final SubLObject class_or_instance, final SubLObject method_name, final SubLObject arg0, final SubLObject arg1, final SubLObject arg2, final SubLObject arg3, final SubLObject arg4, final SubLObject arg5, final SubLObject arg6, final SubLObject arg7, final SubLObject arg8, final SubLObject arg9, final SubLObject arg10, final SubLObject arg11, final SubLObject arg12, final SubLObject arg13) {
        if (methods.NIL == method_name || !method_name.isSymbol()) {
            return Values.values((SubLObject)methods.NIL, (SubLObject)methods.$kw72$INVALID_METHOD_NAME);
        }
        if (methods.NIL != subloop_structures.instance_p(class_or_instance)) {
            final SubLObject v_class = subloop_structures.instance_class(class_or_instance);
            final SubLObject method = Hashtables.gethash(method_name, subloop_structures.class_tablified_instance_methods(v_class), (SubLObject)methods.UNPROVIDED);
            if (methods.NIL == method) {
                return Values.values((SubLObject)methods.NIL, (SubLObject)methods.$kw73$UNDECLARED_METHOD);
            }
            if (methods.NIL == instances.instances_access_check_method(v_class, method)) {
                return Values.values((SubLObject)methods.NIL, (SubLObject)methods.$kw74$ACCESS_LEVEL_CONFLICT);
            }
            final SubLObject function_ref = subloop_structures.method_function_name(method);
            if (methods.NIL == Symbols.fboundp(function_ref)) {
                return Values.values((SubLObject)methods.NIL, (SubLObject)methods.$kw75$UNDEFINED_METHOD);
            }
            return Values.values(Functions.funcall(function_ref, new SubLObject[] { class_or_instance, arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10, arg11, arg12, arg13 }), (SubLObject)methods.NIL);
        }
        else {
            final SubLObject v_class = (methods.NIL != subloop_structures.class_p(class_or_instance)) ? class_or_instance : classes.classes_retrieve_class(class_or_instance);
            final SubLObject method = (SubLObject)((methods.NIL != v_class) ? method_assoc(method_name, subloop_structures.class_compiled_class_method_access_alist(v_class)) : methods.NIL);
            if (methods.NIL == subloop_structures.class_p(v_class)) {
                return Values.values((SubLObject)methods.NIL, (SubLObject)methods.$kw71$TARGET_NOT_A_CLASS);
            }
            if (methods.NIL == method) {
                Values.values((SubLObject)methods.NIL, (SubLObject)methods.$kw73$UNDECLARED_METHOD);
            }
            if (methods.NIL == instances.instances_access_check_method(v_class, method)) {
                Values.values((SubLObject)methods.NIL, (SubLObject)methods.$kw74$ACCESS_LEVEL_CONFLICT);
            }
            final SubLObject function_ref = subloop_structures.method_function_name(method);
            if (methods.NIL == Symbols.fboundp(function_ref)) {
                return Values.values((SubLObject)methods.NIL, (SubLObject)methods.$kw75$UNDEFINED_METHOD);
            }
            return Values.values(Functions.funcall(function_ref, new SubLObject[] { v_class, arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10, arg11, arg12, arg13 }), (SubLObject)methods.NIL);
        }
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/methods.lisp", position = 30538L)
    public static SubLObject safe_funcall_class_or_instance_method_with_15_args(final SubLObject class_or_instance, final SubLObject method_name, final SubLObject arg0, final SubLObject arg1, final SubLObject arg2, final SubLObject arg3, final SubLObject arg4, final SubLObject arg5, final SubLObject arg6, final SubLObject arg7, final SubLObject arg8, final SubLObject arg9, final SubLObject arg10, final SubLObject arg11, final SubLObject arg12, final SubLObject arg13, final SubLObject arg14) {
        if (methods.NIL == method_name || !method_name.isSymbol()) {
            return Values.values((SubLObject)methods.NIL, (SubLObject)methods.$kw72$INVALID_METHOD_NAME);
        }
        if (methods.NIL != subloop_structures.instance_p(class_or_instance)) {
            final SubLObject v_class = subloop_structures.instance_class(class_or_instance);
            final SubLObject method = Hashtables.gethash(method_name, subloop_structures.class_tablified_instance_methods(v_class), (SubLObject)methods.UNPROVIDED);
            if (methods.NIL == method) {
                return Values.values((SubLObject)methods.NIL, (SubLObject)methods.$kw73$UNDECLARED_METHOD);
            }
            if (methods.NIL == instances.instances_access_check_method(v_class, method)) {
                return Values.values((SubLObject)methods.NIL, (SubLObject)methods.$kw74$ACCESS_LEVEL_CONFLICT);
            }
            final SubLObject function_ref = subloop_structures.method_function_name(method);
            if (methods.NIL == Symbols.fboundp(function_ref)) {
                return Values.values((SubLObject)methods.NIL, (SubLObject)methods.$kw75$UNDEFINED_METHOD);
            }
            return Values.values(Functions.funcall(function_ref, new SubLObject[] { class_or_instance, arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10, arg11, arg12, arg13, arg14 }), (SubLObject)methods.NIL);
        }
        else {
            final SubLObject v_class = (methods.NIL != subloop_structures.class_p(class_or_instance)) ? class_or_instance : classes.classes_retrieve_class(class_or_instance);
            final SubLObject method = (SubLObject)((methods.NIL != v_class) ? method_assoc(method_name, subloop_structures.class_compiled_class_method_access_alist(v_class)) : methods.NIL);
            if (methods.NIL == subloop_structures.class_p(v_class)) {
                return Values.values((SubLObject)methods.NIL, (SubLObject)methods.$kw71$TARGET_NOT_A_CLASS);
            }
            if (methods.NIL == method) {
                Values.values((SubLObject)methods.NIL, (SubLObject)methods.$kw73$UNDECLARED_METHOD);
            }
            if (methods.NIL == instances.instances_access_check_method(v_class, method)) {
                Values.values((SubLObject)methods.NIL, (SubLObject)methods.$kw74$ACCESS_LEVEL_CONFLICT);
            }
            final SubLObject function_ref = subloop_structures.method_function_name(method);
            if (methods.NIL == Symbols.fboundp(function_ref)) {
                return Values.values((SubLObject)methods.NIL, (SubLObject)methods.$kw75$UNDEFINED_METHOD);
            }
            return Values.values(Functions.funcall(function_ref, new SubLObject[] { v_class, arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10, arg11, arg12, arg13, arg14 }), (SubLObject)methods.NIL);
        }
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/methods.lisp", position = 30538L)
    public static SubLObject safe_funcall_class_or_instance_method_with_16_args(final SubLObject class_or_instance, final SubLObject method_name, final SubLObject arg0, final SubLObject arg1, final SubLObject arg2, final SubLObject arg3, final SubLObject arg4, final SubLObject arg5, final SubLObject arg6, final SubLObject arg7, final SubLObject arg8, final SubLObject arg9, final SubLObject arg10, final SubLObject arg11, final SubLObject arg12, final SubLObject arg13, final SubLObject arg14, final SubLObject arg15) {
        if (methods.NIL == method_name || !method_name.isSymbol()) {
            return Values.values((SubLObject)methods.NIL, (SubLObject)methods.$kw72$INVALID_METHOD_NAME);
        }
        if (methods.NIL != subloop_structures.instance_p(class_or_instance)) {
            final SubLObject v_class = subloop_structures.instance_class(class_or_instance);
            final SubLObject method = Hashtables.gethash(method_name, subloop_structures.class_tablified_instance_methods(v_class), (SubLObject)methods.UNPROVIDED);
            if (methods.NIL == method) {
                return Values.values((SubLObject)methods.NIL, (SubLObject)methods.$kw73$UNDECLARED_METHOD);
            }
            if (methods.NIL == instances.instances_access_check_method(v_class, method)) {
                return Values.values((SubLObject)methods.NIL, (SubLObject)methods.$kw74$ACCESS_LEVEL_CONFLICT);
            }
            final SubLObject function_ref = subloop_structures.method_function_name(method);
            if (methods.NIL == Symbols.fboundp(function_ref)) {
                return Values.values((SubLObject)methods.NIL, (SubLObject)methods.$kw75$UNDEFINED_METHOD);
            }
            return Values.values(Functions.funcall(function_ref, new SubLObject[] { class_or_instance, arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10, arg11, arg12, arg13, arg14, arg15 }), (SubLObject)methods.NIL);
        }
        else {
            final SubLObject v_class = (methods.NIL != subloop_structures.class_p(class_or_instance)) ? class_or_instance : classes.classes_retrieve_class(class_or_instance);
            final SubLObject method = (SubLObject)((methods.NIL != v_class) ? method_assoc(method_name, subloop_structures.class_compiled_class_method_access_alist(v_class)) : methods.NIL);
            if (methods.NIL == subloop_structures.class_p(v_class)) {
                return Values.values((SubLObject)methods.NIL, (SubLObject)methods.$kw71$TARGET_NOT_A_CLASS);
            }
            if (methods.NIL == method) {
                Values.values((SubLObject)methods.NIL, (SubLObject)methods.$kw73$UNDECLARED_METHOD);
            }
            if (methods.NIL == instances.instances_access_check_method(v_class, method)) {
                Values.values((SubLObject)methods.NIL, (SubLObject)methods.$kw74$ACCESS_LEVEL_CONFLICT);
            }
            final SubLObject function_ref = subloop_structures.method_function_name(method);
            if (methods.NIL == Symbols.fboundp(function_ref)) {
                return Values.values((SubLObject)methods.NIL, (SubLObject)methods.$kw75$UNDEFINED_METHOD);
            }
            return Values.values(Functions.funcall(function_ref, new SubLObject[] { v_class, arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10, arg11, arg12, arg13, arg14, arg15 }), (SubLObject)methods.NIL);
        }
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/methods.lisp", position = 30538L)
    public static SubLObject safe_funcall_class_or_instance_method_with_17_args(final SubLObject class_or_instance, final SubLObject method_name, final SubLObject arg0, final SubLObject arg1, final SubLObject arg2, final SubLObject arg3, final SubLObject arg4, final SubLObject arg5, final SubLObject arg6, final SubLObject arg7, final SubLObject arg8, final SubLObject arg9, final SubLObject arg10, final SubLObject arg11, final SubLObject arg12, final SubLObject arg13, final SubLObject arg14, final SubLObject arg15, final SubLObject arg16) {
        if (methods.NIL == method_name || !method_name.isSymbol()) {
            return Values.values((SubLObject)methods.NIL, (SubLObject)methods.$kw72$INVALID_METHOD_NAME);
        }
        if (methods.NIL != subloop_structures.instance_p(class_or_instance)) {
            final SubLObject v_class = subloop_structures.instance_class(class_or_instance);
            final SubLObject method = Hashtables.gethash(method_name, subloop_structures.class_tablified_instance_methods(v_class), (SubLObject)methods.UNPROVIDED);
            if (methods.NIL == method) {
                return Values.values((SubLObject)methods.NIL, (SubLObject)methods.$kw73$UNDECLARED_METHOD);
            }
            if (methods.NIL == instances.instances_access_check_method(v_class, method)) {
                return Values.values((SubLObject)methods.NIL, (SubLObject)methods.$kw74$ACCESS_LEVEL_CONFLICT);
            }
            final SubLObject function_ref = subloop_structures.method_function_name(method);
            if (methods.NIL == Symbols.fboundp(function_ref)) {
                return Values.values((SubLObject)methods.NIL, (SubLObject)methods.$kw75$UNDEFINED_METHOD);
            }
            return Values.values(Functions.funcall(function_ref, new SubLObject[] { class_or_instance, arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10, arg11, arg12, arg13, arg14, arg15, arg16 }), (SubLObject)methods.NIL);
        }
        else {
            final SubLObject v_class = (methods.NIL != subloop_structures.class_p(class_or_instance)) ? class_or_instance : classes.classes_retrieve_class(class_or_instance);
            final SubLObject method = (SubLObject)((methods.NIL != v_class) ? method_assoc(method_name, subloop_structures.class_compiled_class_method_access_alist(v_class)) : methods.NIL);
            if (methods.NIL == subloop_structures.class_p(v_class)) {
                return Values.values((SubLObject)methods.NIL, (SubLObject)methods.$kw71$TARGET_NOT_A_CLASS);
            }
            if (methods.NIL == method) {
                Values.values((SubLObject)methods.NIL, (SubLObject)methods.$kw73$UNDECLARED_METHOD);
            }
            if (methods.NIL == instances.instances_access_check_method(v_class, method)) {
                Values.values((SubLObject)methods.NIL, (SubLObject)methods.$kw74$ACCESS_LEVEL_CONFLICT);
            }
            final SubLObject function_ref = subloop_structures.method_function_name(method);
            if (methods.NIL == Symbols.fboundp(function_ref)) {
                return Values.values((SubLObject)methods.NIL, (SubLObject)methods.$kw75$UNDEFINED_METHOD);
            }
            return Values.values(Functions.funcall(function_ref, new SubLObject[] { v_class, arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10, arg11, arg12, arg13, arg14, arg15, arg16 }), (SubLObject)methods.NIL);
        }
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/methods.lisp", position = 30538L)
    public static SubLObject safe_funcall_class_or_instance_method_with_18_args(final SubLObject class_or_instance, final SubLObject method_name, final SubLObject arg0, final SubLObject arg1, final SubLObject arg2, final SubLObject arg3, final SubLObject arg4, final SubLObject arg5, final SubLObject arg6, final SubLObject arg7, final SubLObject arg8, final SubLObject arg9, final SubLObject arg10, final SubLObject arg11, final SubLObject arg12, final SubLObject arg13, final SubLObject arg14, final SubLObject arg15, final SubLObject arg16, final SubLObject arg17) {
        if (methods.NIL == method_name || !method_name.isSymbol()) {
            return Values.values((SubLObject)methods.NIL, (SubLObject)methods.$kw72$INVALID_METHOD_NAME);
        }
        if (methods.NIL != subloop_structures.instance_p(class_or_instance)) {
            final SubLObject v_class = subloop_structures.instance_class(class_or_instance);
            final SubLObject method = Hashtables.gethash(method_name, subloop_structures.class_tablified_instance_methods(v_class), (SubLObject)methods.UNPROVIDED);
            if (methods.NIL == method) {
                return Values.values((SubLObject)methods.NIL, (SubLObject)methods.$kw73$UNDECLARED_METHOD);
            }
            if (methods.NIL == instances.instances_access_check_method(v_class, method)) {
                return Values.values((SubLObject)methods.NIL, (SubLObject)methods.$kw74$ACCESS_LEVEL_CONFLICT);
            }
            final SubLObject function_ref = subloop_structures.method_function_name(method);
            if (methods.NIL == Symbols.fboundp(function_ref)) {
                return Values.values((SubLObject)methods.NIL, (SubLObject)methods.$kw75$UNDEFINED_METHOD);
            }
            return Values.values(Functions.funcall(function_ref, new SubLObject[] { class_or_instance, arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10, arg11, arg12, arg13, arg14, arg15, arg16, arg17 }), (SubLObject)methods.NIL);
        }
        else {
            final SubLObject v_class = (methods.NIL != subloop_structures.class_p(class_or_instance)) ? class_or_instance : classes.classes_retrieve_class(class_or_instance);
            final SubLObject method = (SubLObject)((methods.NIL != v_class) ? method_assoc(method_name, subloop_structures.class_compiled_class_method_access_alist(v_class)) : methods.NIL);
            if (methods.NIL == subloop_structures.class_p(v_class)) {
                return Values.values((SubLObject)methods.NIL, (SubLObject)methods.$kw71$TARGET_NOT_A_CLASS);
            }
            if (methods.NIL == method) {
                Values.values((SubLObject)methods.NIL, (SubLObject)methods.$kw73$UNDECLARED_METHOD);
            }
            if (methods.NIL == instances.instances_access_check_method(v_class, method)) {
                Values.values((SubLObject)methods.NIL, (SubLObject)methods.$kw74$ACCESS_LEVEL_CONFLICT);
            }
            final SubLObject function_ref = subloop_structures.method_function_name(method);
            if (methods.NIL == Symbols.fboundp(function_ref)) {
                return Values.values((SubLObject)methods.NIL, (SubLObject)methods.$kw75$UNDEFINED_METHOD);
            }
            return Values.values(Functions.funcall(function_ref, new SubLObject[] { v_class, arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10, arg11, arg12, arg13, arg14, arg15, arg16, arg17 }), (SubLObject)methods.NIL);
        }
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/methods.lisp", position = 30538L)
    public static SubLObject safe_funcall_class_or_instance_method_with_19_args(final SubLObject class_or_instance, final SubLObject method_name, final SubLObject arg0, final SubLObject arg1, final SubLObject arg2, final SubLObject arg3, final SubLObject arg4, final SubLObject arg5, final SubLObject arg6, final SubLObject arg7, final SubLObject arg8, final SubLObject arg9, final SubLObject arg10, final SubLObject arg11, final SubLObject arg12, final SubLObject arg13, final SubLObject arg14, final SubLObject arg15, final SubLObject arg16, final SubLObject arg17, final SubLObject arg18) {
        if (methods.NIL == method_name || !method_name.isSymbol()) {
            return Values.values((SubLObject)methods.NIL, (SubLObject)methods.$kw72$INVALID_METHOD_NAME);
        }
        if (methods.NIL != subloop_structures.instance_p(class_or_instance)) {
            final SubLObject v_class = subloop_structures.instance_class(class_or_instance);
            final SubLObject method = Hashtables.gethash(method_name, subloop_structures.class_tablified_instance_methods(v_class), (SubLObject)methods.UNPROVIDED);
            if (methods.NIL == method) {
                return Values.values((SubLObject)methods.NIL, (SubLObject)methods.$kw73$UNDECLARED_METHOD);
            }
            if (methods.NIL == instances.instances_access_check_method(v_class, method)) {
                return Values.values((SubLObject)methods.NIL, (SubLObject)methods.$kw74$ACCESS_LEVEL_CONFLICT);
            }
            final SubLObject function_ref = subloop_structures.method_function_name(method);
            if (methods.NIL == Symbols.fboundp(function_ref)) {
                return Values.values((SubLObject)methods.NIL, (SubLObject)methods.$kw75$UNDEFINED_METHOD);
            }
            return Values.values(Functions.funcall(function_ref, new SubLObject[] { class_or_instance, arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10, arg11, arg12, arg13, arg14, arg15, arg16, arg17, arg18 }), (SubLObject)methods.NIL);
        }
        else {
            final SubLObject v_class = (methods.NIL != subloop_structures.class_p(class_or_instance)) ? class_or_instance : classes.classes_retrieve_class(class_or_instance);
            final SubLObject method = (SubLObject)((methods.NIL != v_class) ? method_assoc(method_name, subloop_structures.class_compiled_class_method_access_alist(v_class)) : methods.NIL);
            if (methods.NIL == subloop_structures.class_p(v_class)) {
                return Values.values((SubLObject)methods.NIL, (SubLObject)methods.$kw71$TARGET_NOT_A_CLASS);
            }
            if (methods.NIL == method) {
                Values.values((SubLObject)methods.NIL, (SubLObject)methods.$kw73$UNDECLARED_METHOD);
            }
            if (methods.NIL == instances.instances_access_check_method(v_class, method)) {
                Values.values((SubLObject)methods.NIL, (SubLObject)methods.$kw74$ACCESS_LEVEL_CONFLICT);
            }
            final SubLObject function_ref = subloop_structures.method_function_name(method);
            if (methods.NIL == Symbols.fboundp(function_ref)) {
                return Values.values((SubLObject)methods.NIL, (SubLObject)methods.$kw75$UNDEFINED_METHOD);
            }
            return Values.values(Functions.funcall(function_ref, new SubLObject[] { v_class, arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10, arg11, arg12, arg13, arg14, arg15, arg16, arg17, arg18 }), (SubLObject)methods.NIL);
        }
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/methods.lisp", position = 30538L)
    public static SubLObject safe_funcall_class_or_instance_method_with_20_args(final SubLObject class_or_instance, final SubLObject method_name, final SubLObject arg0, final SubLObject arg1, final SubLObject arg2, final SubLObject arg3, final SubLObject arg4, final SubLObject arg5, final SubLObject arg6, final SubLObject arg7, final SubLObject arg8, final SubLObject arg9, final SubLObject arg10, final SubLObject arg11, final SubLObject arg12, final SubLObject arg13, final SubLObject arg14, final SubLObject arg15, final SubLObject arg16, final SubLObject arg17, final SubLObject arg18, final SubLObject arg19) {
        if (methods.NIL == method_name || !method_name.isSymbol()) {
            return Values.values((SubLObject)methods.NIL, (SubLObject)methods.$kw72$INVALID_METHOD_NAME);
        }
        if (methods.NIL != subloop_structures.instance_p(class_or_instance)) {
            final SubLObject v_class = subloop_structures.instance_class(class_or_instance);
            final SubLObject method = Hashtables.gethash(method_name, subloop_structures.class_tablified_instance_methods(v_class), (SubLObject)methods.UNPROVIDED);
            if (methods.NIL == method) {
                return Values.values((SubLObject)methods.NIL, (SubLObject)methods.$kw73$UNDECLARED_METHOD);
            }
            if (methods.NIL == instances.instances_access_check_method(v_class, method)) {
                return Values.values((SubLObject)methods.NIL, (SubLObject)methods.$kw74$ACCESS_LEVEL_CONFLICT);
            }
            final SubLObject function_ref = subloop_structures.method_function_name(method);
            if (methods.NIL == Symbols.fboundp(function_ref)) {
                return Values.values((SubLObject)methods.NIL, (SubLObject)methods.$kw75$UNDEFINED_METHOD);
            }
            return Values.values(Functions.funcall(function_ref, new SubLObject[] { class_or_instance, arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10, arg11, arg12, arg13, arg14, arg15, arg16, arg17, arg18, arg19 }), (SubLObject)methods.NIL);
        }
        else {
            final SubLObject v_class = (methods.NIL != subloop_structures.class_p(class_or_instance)) ? class_or_instance : classes.classes_retrieve_class(class_or_instance);
            final SubLObject method = (SubLObject)((methods.NIL != v_class) ? method_assoc(method_name, subloop_structures.class_compiled_class_method_access_alist(v_class)) : methods.NIL);
            if (methods.NIL == subloop_structures.class_p(v_class)) {
                return Values.values((SubLObject)methods.NIL, (SubLObject)methods.$kw71$TARGET_NOT_A_CLASS);
            }
            if (methods.NIL == method) {
                Values.values((SubLObject)methods.NIL, (SubLObject)methods.$kw73$UNDECLARED_METHOD);
            }
            if (methods.NIL == instances.instances_access_check_method(v_class, method)) {
                Values.values((SubLObject)methods.NIL, (SubLObject)methods.$kw74$ACCESS_LEVEL_CONFLICT);
            }
            final SubLObject function_ref = subloop_structures.method_function_name(method);
            if (methods.NIL == Symbols.fboundp(function_ref)) {
                return Values.values((SubLObject)methods.NIL, (SubLObject)methods.$kw75$UNDEFINED_METHOD);
            }
            return Values.values(Functions.funcall(function_ref, new SubLObject[] { v_class, arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10, arg11, arg12, arg13, arg14, arg15, arg16, arg17, arg18, arg19 }), (SubLObject)methods.NIL);
        }
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/methods.lisp", position = 30653L)
    public static SubLObject resolve_method(final SubLObject method_name, final SubLObject class_name) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_class = classes.classes_retrieve_class(class_name);
        if (methods.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && methods.NIL == v_class) {
            Errors.error((SubLObject)methods.$str80$RESOLVE_METHOD___S_is_not_a_defin, class_name);
        }
        final SubLObject v_class_$16 = v_class;
        final SubLObject compiled_class_method_access_alist = subloop_structures.class_compiled_class_method_access_alist(v_class_$16);
        final SubLObject tablified_instance_methods = subloop_structures.class_tablified_instance_methods(v_class_$16);
        SubLObject method = Hashtables.gethash(method_name, tablified_instance_methods, (SubLObject)methods.UNPROVIDED);
        if (methods.NIL == method) {
            method = method_assoc(method_name, compiled_class_method_access_alist);
        }
        if (methods.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && methods.NIL == method) {
            Errors.error((SubLObject)methods.$str81$RESOLVE_METHOD___S_is_not_a_defin, method_name, class_name);
        }
        return subloop_structures.method_function_name(method);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/methods.lisp", position = 31195L)
    public static SubLObject quote_method(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)methods.$list82);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject method_name = (SubLObject)methods.NIL;
        SubLObject class_name = (SubLObject)methods.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)methods.$list82);
        method_name = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)methods.$list82);
        class_name = current.first();
        current = current.rest();
        if (methods.NIL == current) {
            current = temp;
            if (methods.NIL == current) {
                return (SubLObject)ConsesLow.list((SubLObject)methods.$sym18$QUOTE, resolve_method(method_name, class_name));
            }
            cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)methods.$list82);
        }
        else {
            cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)methods.$list82);
        }
        return (SubLObject)methods.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/methods.lisp", position = 31298L)
    public static SubLObject fquote_method(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)methods.$list82);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject method_name = (SubLObject)methods.NIL;
        SubLObject class_name = (SubLObject)methods.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)methods.$list82);
        method_name = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)methods.$list82);
        class_name = current.first();
        current = current.rest();
        if (methods.NIL == current) {
            current = temp;
            if (methods.NIL == current) {
                final SubLObject resolved_method = resolve_method(method_name, class_name);
                if (resolved_method.isFunction()) {
                    return (SubLObject)ConsesLow.list((SubLObject)methods.$sym18$QUOTE, Symbols.symbol_function(resolved_method));
                }
                return (SubLObject)ConsesLow.list((SubLObject)methods.$sym18$QUOTE, resolved_method);
            }
            else {
                cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)methods.$list82);
            }
        }
        else {
            cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)methods.$list82);
        }
        return (SubLObject)methods.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/methods.lisp", position = 31530L)
    public static SubLObject method_name_to_function_name(final SubLObject method_name, final SubLObject class_name) {
        final SubLObject v_class = classes.classes_retrieve_class(class_name);
        if (methods.NIL == subloop_structures.class_p(v_class)) {
            return (SubLObject)methods.NIL;
        }
        SubLObject method = Hashtables.gethash(method_name, subloop_structures.class_tablified_instance_methods(v_class), (SubLObject)methods.UNPROVIDED);
        if (methods.NIL != method) {
            return subloop_structures.method_function_name(method);
        }
        method = method_assoc(method_name, subloop_structures.class_compiled_class_method_access_alist(v_class));
        if (methods.NIL != method) {
            return subloop_structures.method_function_name(method);
        }
        return (SubLObject)methods.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/methods.lisp", position = 32037L)
    public static SubLObject inline_method(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)methods.$list83);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject method_name = (SubLObject)methods.NIL;
        SubLObject class_name = (SubLObject)methods.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)methods.$list83);
        method_name = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)methods.$list83);
        class_name = current.first();
        current = current.rest();
        if (methods.NIL != current) {
            cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)methods.$list83);
            return (SubLObject)methods.NIL;
        }
        current = temp;
        SubLObject class_or_instance = (SubLObject)methods.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)methods.$list83);
        class_or_instance = current.first();
        final SubLObject args;
        current = (args = current.rest());
        final SubLObject v_class = classes.classes_retrieve_class(class_name);
        if (methods.NIL == subloop_structures.class_p(v_class)) {
            return (SubLObject)ConsesLow.listS((SubLObject)methods.$sym84$FUNCALL_INSTANCE_METHOD, class_or_instance, (SubLObject)ConsesLow.list((SubLObject)methods.$sym18$QUOTE, method_name), args);
        }
        SubLObject method = Hashtables.gethash(method_name, subloop_structures.class_tablified_instance_methods(v_class), (SubLObject)methods.UNPROVIDED);
        if (methods.NIL != method) {
            return (SubLObject)ConsesLow.listS(subloop_structures.method_function_name(method), class_or_instance, args);
        }
        method = method_assoc(method_name, subloop_structures.class_compiled_class_method_access_alist(v_class));
        if (methods.NIL != method) {
            return (SubLObject)ConsesLow.listS(subloop_structures.method_function_name(method), class_or_instance, args);
        }
        return (SubLObject)ConsesLow.listS((SubLObject)methods.$sym84$FUNCALL_INSTANCE_METHOD, class_or_instance, (SubLObject)ConsesLow.list((SubLObject)methods.$sym18$QUOTE, method_name), args);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/methods.lisp", position = 32729L)
    public static SubLObject inline_super_method(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)methods.$list83);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject method_name = (SubLObject)methods.NIL;
        SubLObject class_name = (SubLObject)methods.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)methods.$list83);
        method_name = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)methods.$list83);
        class_name = current.first();
        current = current.rest();
        if (methods.NIL != current) {
            cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)methods.$list83);
            return (SubLObject)methods.NIL;
        }
        current = temp;
        SubLObject class_or_instance = (SubLObject)methods.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)methods.$list83);
        class_or_instance = current.first();
        final SubLObject args;
        current = (args = current.rest());
        final SubLObject v_class = classes.classes_retrieve_class(class_name);
        if (methods.NIL == subloop_structures.class_p(v_class)) {
            return (SubLObject)ConsesLow.listS((SubLObject)methods.$sym85$FUNCALL_INSTANCE_SUPER_METHOD, class_or_instance, (SubLObject)ConsesLow.list((SubLObject)methods.$sym18$QUOTE, method_name), args);
        }
        SubLObject method = method_shadowed_assoc(method_name, subloop_structures.class_compiled_instance_method_access_alist(v_class));
        if (methods.NIL != method) {
            return (SubLObject)ConsesLow.listS(subloop_structures.method_function_name(method), class_or_instance, args);
        }
        method = method_shadowed_assoc(method_name, subloop_structures.class_compiled_class_method_access_alist(v_class));
        if (methods.NIL != method) {
            return (SubLObject)ConsesLow.listS(subloop_structures.method_function_name(method), class_or_instance, args);
        }
        return (SubLObject)ConsesLow.listS((SubLObject)methods.$sym85$FUNCALL_INSTANCE_SUPER_METHOD, class_or_instance, (SubLObject)ConsesLow.list((SubLObject)methods.$sym18$QUOTE, method_name), args);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/methods.lisp", position = 33486L)
    public static SubLObject methods_inline_method_calls_internal(final SubLObject body, final SubLObject v_class, final SubLObject class_name, final SubLObject method_list, SubLObject inside_backquote) {
        if (inside_backquote == methods.UNPROVIDED) {
            inside_backquote = (SubLObject)methods.NIL;
        }
        if (methods.NIL == body) {
            return (SubLObject)methods.NIL;
        }
        if (body.isAtom()) {
            return body;
        }
        if (body.first().isSymbol()) {
            if (!body.rest().isCons()) {
                return body;
            }
            if (body.first() == methods.$sym18$QUOTE) {
                return body;
            }
            final SubLObject method = method_assoc(body.first(), method_list);
            if (methods.NIL == method) {
                return (SubLObject)ConsesLow.cons(body.first(), methods_inline_method_calls_internal(body.rest(), v_class, class_name, method_list, (SubLObject)methods.UNPROVIDED));
            }
            final SubLObject first_arg = conses_high.cadr(body);
            final SubLObject args = conses_high.cddr(body);
            if (first_arg == methods.$sym86$SELF) {
                SubLObject transformed_args = (SubLObject)methods.NIL;
                SubLObject cdolist_list_var = args;
                SubLObject arg = (SubLObject)methods.NIL;
                arg = cdolist_list_var.first();
                while (methods.NIL != cdolist_list_var) {
                    transformed_args = (SubLObject)ConsesLow.cons(methods_inline_method_calls_internal(arg, v_class, class_name, method_list, (SubLObject)methods.UNPROVIDED), transformed_args);
                    cdolist_list_var = cdolist_list_var.rest();
                    arg = cdolist_list_var.first();
                }
                return (SubLObject)ConsesLow.listS((SubLObject)methods.$sym87$INLINE_METHOD, (SubLObject)ConsesLow.list(body.first(), class_name), (SubLObject)methods.$sym86$SELF, Sequences.nreverse(transformed_args));
            }
            if (first_arg == methods.$sym88$SUPER) {
                SubLObject transformed_args = (SubLObject)methods.NIL;
                SubLObject cdolist_list_var = args;
                SubLObject arg = (SubLObject)methods.NIL;
                arg = cdolist_list_var.first();
                while (methods.NIL != cdolist_list_var) {
                    transformed_args = (SubLObject)ConsesLow.cons(methods_inline_method_calls_internal(arg, v_class, class_name, method_list, (SubLObject)methods.UNPROVIDED), transformed_args);
                    cdolist_list_var = cdolist_list_var.rest();
                    arg = cdolist_list_var.first();
                }
                return (SubLObject)ConsesLow.listS((SubLObject)methods.$sym89$INLINE_SUPER_METHOD, (SubLObject)ConsesLow.list(body.first(), class_name), (SubLObject)methods.$sym86$SELF, Sequences.nreverse(transformed_args));
            }
            return (SubLObject)ConsesLow.cons(body.first(), methods_inline_method_calls_internal(body.rest(), v_class, class_name, method_list, (SubLObject)methods.UNPROVIDED));
        }
        else {
            if (body.first().isAtom()) {
                return (SubLObject)ConsesLow.cons(body.first(), methods_inline_method_calls_internal(body.rest(), v_class, class_name, method_list, (SubLObject)methods.UNPROVIDED));
            }
            return (SubLObject)ConsesLow.cons(methods_inline_method_calls_internal(body.first(), v_class, class_name, method_list, (SubLObject)methods.UNPROVIDED), methods_inline_method_calls_internal(body.rest(), v_class, class_name, method_list, (SubLObject)methods.UNPROVIDED));
        }
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/methods.lisp", position = 38136L)
    public static SubLObject methods_inline_method_calls(final SubLObject body, final SubLObject class_name_or_class) {
        final SubLObject v_class = class_name_or_class.isSymbol() ? classes.classes_retrieve_class(class_name_or_class) : class_name_or_class;
        if (methods.NIL != subloop_structures.class_p(v_class)) {
            final SubLObject class_name = subloop_structures.class_name(v_class);
            return methods_inline_method_calls_internal(methods_inline_method_calls_internal(body, v_class, class_name, instances.instances_filter_methods_per_access(v_class, subloop_structures.class_compiled_class_method_access_alist(v_class)), (SubLObject)methods.UNPROVIDED), v_class, class_name, instances.instances_filter_methods_per_access(v_class, subloop_structures.class_compiled_instance_method_access_alist(v_class)), (SubLObject)methods.UNPROVIDED);
        }
        return body;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/methods.lisp", position = 38784L)
    public static SubLObject methods_transform_setq_for_auto_update_private(final SubLObject setq_form, final SubLObject v_class) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject setq_pairs = setq_form.rest();
        SubLObject new_forms = (SubLObject)methods.NIL;
        SubLObject transformed = (SubLObject)methods.NIL;
        SubLObject remainder;
        SubLObject var;
        SubLObject form;
        SubLObject getter;
        SubLObject setter;
        for (remainder = (SubLObject)methods.NIL, remainder = setq_pairs; methods.NIL != remainder; remainder = conses_high.cddr(remainder)) {
            var = remainder.first();
            form = conses_high.cadr(remainder);
            thread.resetMultipleValues();
            getter = slots.get_instance_slot_accessors(v_class, var);
            setter = thread.secondMultipleValue();
            thread.resetMultipleValues();
            if (methods.NIL != setter) {
                transformed = (SubLObject)methods.T;
                new_forms = (SubLObject)ConsesLow.cons(conses_high.copy_list((SubLObject)ConsesLow.list((SubLObject)methods.$sym90$CSETQ, var, methods_transform_setqs_for_auto_update_private(form, v_class))), new_forms);
                new_forms = (SubLObject)ConsesLow.cons(conses_high.copy_list((SubLObject)ConsesLow.list(setter, (SubLObject)methods.$sym86$SELF, var)), new_forms);
            }
            else {
                new_forms = (SubLObject)ConsesLow.cons(conses_high.copy_list((SubLObject)ConsesLow.list((SubLObject)methods.$sym90$CSETQ, var, form)), new_forms);
            }
        }
        if (methods.NIL != transformed) {
            return (SubLObject)ConsesLow.cons((SubLObject)methods.$sym11$PROGN, Sequences.nreverse(new_forms));
        }
        return setq_form;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/methods.lisp", position = 39470L)
    public static SubLObject methods_transform_cinc_or_cdec_for_auto_update_private(final SubLObject setq_form, final SubLObject v_class) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (!setq_form.isCons() || !setq_form.rest().isCons()) {
            return setq_form;
        }
        final SubLObject var = conses_high.cadr(setq_form);
        final SubLObject other_forms = methods_transform_setqs_for_auto_update_private(conses_high.cddr(setq_form), v_class);
        thread.resetMultipleValues();
        final SubLObject getter = slots.get_instance_slot_accessors(v_class, var);
        final SubLObject setter = thread.secondMultipleValue();
        thread.resetMultipleValues();
        if (methods.NIL != setter) {
            return conses_high.copy_list((SubLObject)ConsesLow.list((SubLObject)methods.$sym11$PROGN, (SubLObject)ConsesLow.listS(setq_form.first(), var, other_forms), (SubLObject)ConsesLow.list(setter, (SubLObject)methods.$sym86$SELF, var)));
        }
        return setq_form;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/methods.lisp", position = 40010L)
    public static SubLObject methods_transform_cpop_for_auto_update_private(final SubLObject setq_form, final SubLObject v_class) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (!setq_form.isCons() || !setq_form.rest().isCons()) {
            return setq_form;
        }
        final SubLObject var = conses_high.cadr(setq_form);
        thread.resetMultipleValues();
        final SubLObject getter = slots.get_instance_slot_accessors(v_class, var);
        final SubLObject setter = thread.secondMultipleValue();
        thread.resetMultipleValues();
        if (methods.NIL != setter) {
            return conses_high.copy_list((SubLObject)ConsesLow.list((SubLObject)methods.$sym11$PROGN, setq_form, (SubLObject)ConsesLow.list(setter, (SubLObject)methods.$sym86$SELF, var)));
        }
        return setq_form;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/methods.lisp", position = 40413L)
    public static SubLObject methods_transform_cpush_or_cpushnew_for_auto_update_private(final SubLObject setq_form, final SubLObject v_class) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (!setq_form.isCons() || !setq_form.rest().isCons() || !conses_high.cddr(setq_form).isCons()) {
            return setq_form;
        }
        final SubLObject item = methods_transform_setqs_for_auto_update_private(conses_high.cadr(setq_form), v_class);
        final SubLObject var = conses_high.cddr(setq_form).first();
        final SubLObject rest = conses_high.cddr(setq_form).rest();
        thread.resetMultipleValues();
        final SubLObject getter = slots.get_instance_slot_accessors(v_class, var);
        final SubLObject setter = thread.secondMultipleValue();
        thread.resetMultipleValues();
        if (methods.NIL != setter) {
            return conses_high.copy_list((SubLObject)ConsesLow.list((SubLObject)methods.$sym11$PROGN, (SubLObject)ConsesLow.listS(setq_form.first(), item, var, rest), (SubLObject)ConsesLow.list(setter, (SubLObject)methods.$sym86$SELF, var)));
        }
        return setq_form;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/methods.lisp", position = 41021L)
    public static SubLObject methods_transform_cmultiple_value_setq_for_auto_update_private(final SubLObject setq_form, final SubLObject v_class) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (!setq_form.isCons() || methods.NIL == Types.sublisp_true(setq_form.first()) || !setq_form.rest().isCons() || !setq_form.rest().first().isCons() || !setq_form.rest().rest().isCons() || methods.NIL == Types.sublisp_true(setq_form.rest().rest().first()) || !setq_form.rest().rest().rest().isList()) {
            return setq_form;
        }
        final SubLObject var_list = conses_high.cadr(setq_form);
        final SubLObject form = methods_transform_setqs_for_auto_update_private(conses_high.cddr(setq_form).first(), v_class);
        final SubLObject body = methods_transform_setqs_for_auto_update_private(conses_high.cddr(setq_form).rest(), v_class);
        SubLObject update_forms = (SubLObject)methods.NIL;
        SubLObject cdolist_list_var = var_list;
        SubLObject var = (SubLObject)methods.NIL;
        var = cdolist_list_var.first();
        while (methods.NIL != cdolist_list_var) {
            thread.resetMultipleValues();
            final SubLObject getter = slots.get_instance_slot_accessors(v_class, var);
            final SubLObject setter = thread.secondMultipleValue();
            thread.resetMultipleValues();
            if (methods.NIL != setter) {
                update_forms = (SubLObject)ConsesLow.cons(conses_high.copy_list((SubLObject)ConsesLow.list(setter, (SubLObject)methods.$sym86$SELF, var)), update_forms);
            }
            cdolist_list_var = cdolist_list_var.rest();
            var = cdolist_list_var.first();
        }
        if (methods.NIL != update_forms) {
            return conses_high.copy_list((SubLObject)ConsesLow.listS((SubLObject)methods.$sym91$CMULTIPLE_VALUE_SETQ, var_list, form, ConsesLow.append(Sequences.nreverse(update_forms), body, (SubLObject)methods.NIL)));
        }
        return conses_high.copy_list((SubLObject)ConsesLow.listS((SubLObject)methods.$sym91$CMULTIPLE_VALUE_SETQ, var_list, form, ConsesLow.append(body, (SubLObject)methods.NIL)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/methods.lisp", position = 41888L)
    public static SubLObject methods_transform_setqs_for_auto_update_private(final SubLObject body, final SubLObject v_class) {
        if (methods.NIL == body) {
            return (SubLObject)methods.NIL;
        }
        if (!body.isCons()) {
            return body;
        }
        final SubLObject first_element = body.first();
        final SubLObject rest_of_body = body.rest();
        if (methods.NIL != conses_high.member(first_element, (SubLObject)methods.$list92, (SubLObject)methods.UNPROVIDED, (SubLObject)methods.UNPROVIDED)) {
            return methods_transform_setq_for_auto_update_private(body, v_class);
        }
        if (first_element == methods.$sym93$CPOP) {
            return methods_transform_cpop_for_auto_update_private(body, v_class);
        }
        if (methods.NIL != conses_high.member(first_element, (SubLObject)methods.$list94, (SubLObject)methods.UNPROVIDED, (SubLObject)methods.UNPROVIDED)) {
            return methods_transform_cinc_or_cdec_for_auto_update_private(body, v_class);
        }
        if (methods.NIL != conses_high.member(first_element, (SubLObject)methods.$list95, (SubLObject)methods.UNPROVIDED, (SubLObject)methods.UNPROVIDED)) {
            return methods_transform_cpush_or_cpushnew_for_auto_update_private(body, v_class);
        }
        if (first_element == methods.$sym91$CMULTIPLE_VALUE_SETQ) {
            return methods_transform_cmultiple_value_setq_for_auto_update_private(body, v_class);
        }
        return (SubLObject)ConsesLow.cons(methods_transform_setqs_for_auto_update_private(first_element, v_class), methods_transform_setqs_for_auto_update_private(rest_of_body, v_class));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/methods.lisp", position = 42897L)
    public static SubLObject methods_transform_setqs_for_auto_update(final SubLObject body, final SubLObject class_name_or_class) {
        final SubLObject v_class = class_name_or_class.isSymbol() ? classes.classes_retrieve_class(class_name_or_class) : class_name_or_class;
        if (methods.NIL != subloop_structures.class_p(v_class)) {
            return methods_transform_setqs_for_auto_update_private(body, v_class);
        }
        return body;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/methods.lisp", position = 43234L)
    public static SubLObject methods_substitute_ret_forms_with_throw_to_tag(final SubLObject body, final SubLObject tag, SubLObject inside_backquote) {
        if (inside_backquote == methods.UNPROVIDED) {
            inside_backquote = (SubLObject)methods.NIL;
        }
        if (methods.NIL == body) {
            return (SubLObject)methods.NIL;
        }
        if (body.isAtom()) {
            return body;
        }
        if (body.first() == methods.$sym18$QUOTE) {
            return conses_high.copy_tree(body);
        }
        if (body.first() != methods.$sym96$RET) {
            return (SubLObject)ConsesLow.cons(methods_substitute_ret_forms_with_throw_to_tag(body.first(), tag, (SubLObject)methods.UNPROVIDED), methods_substitute_ret_forms_with_throw_to_tag(body.rest(), tag, (SubLObject)methods.UNPROVIDED));
        }
        if (body.rest().isCons()) {
            return (SubLObject)ConsesLow.list((SubLObject)methods.$sym97$THROW, (SubLObject)ConsesLow.list((SubLObject)methods.$sym18$QUOTE, tag), methods_substitute_ret_forms_with_throw_to_tag(conses_high.cadr(body), tag, (SubLObject)methods.UNPROVIDED));
        }
        return (SubLObject)ConsesLow.list((SubLObject)methods.$sym97$THROW, (SubLObject)ConsesLow.list((SubLObject)methods.$sym18$QUOTE, tag), (SubLObject)methods.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/methods.lisp", position = 45104L)
    public static SubLObject methods_lambda_list_to_listed_arg_value_expression(final SubLObject lambda_list) {
        return (SubLObject)ConsesLow.cons((SubLObject)methods.$sym98$LIST, methods_filter_option_words_from_lambda_list(lambda_list));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/methods.lisp", position = 45269L)
    public static SubLObject generate_instance_variable_bindings_for_instance(final SubLObject var, final SubLObject class_name, final SubLObject method_name, final SubLObject lambda_list, final SubLObject method_properties, final SubLObject instance_variables, final SubLObject body, SubLObject read_only) {
        if (read_only == methods.UNPROVIDED) {
            read_only = (SubLObject)methods.T;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject var_bindings = (SubLObject)methods.NIL;
        final SubLObject v_class = classes.classes_retrieve_class(class_name);
        SubLObject update_expressions = (SubLObject)methods.NIL;
        final SubLObject preprocessed_conc_name = Sequences.cconcatenate(Symbols.symbol_name(class_name), (SubLObject)methods.$str48$_);
        final SubLObject catch_tag = Symbols.make_symbol(Sequences.cconcatenate((SubLObject)methods.$str99$OUTER_CATCH_FOR_, new SubLObject[] { preprocessed_conc_name, methods.$str100$METHOD }));
        final SubLObject catch_var = Symbols.make_symbol(Sequences.cconcatenate((SubLObject)methods.$str101$CATCH_VAR_FOR_, new SubLObject[] { preprocessed_conc_name, methods.$str100$METHOD }));
        final SubLObject listed_args_var = Symbols.make_symbol((SubLObject)methods.$str102$LISTED_ARGS);
        SubLObject preprocessed_body = methods_inline_method_calls(body, class_name);
        final SubLObject before_listeners_p = classes.classes_before_listeners_p(method_properties);
        final SubLObject after_listeners_p = classes.classes_after_listeners_p(method_properties);
        SubLObject variable = (SubLObject)methods.NIL;
        SubLObject explicit_getter = (SubLObject)methods.NIL;
        SubLObject explicit_setter = (SubLObject)methods.NIL;
        if (methods.NIL != classes.classes_no_member_variables_p(method_properties) && methods.NIL == methods.$methods_insert_trace_code_p$.getDynamicValue(thread)) {
            return reader.bq_cons((SubLObject)methods.$sym11$PROGN, preprocessed_body);
        }
        if (methods.NIL != classes.classes_auto_update_p(method_properties)) {
            preprocessed_body = methods_transform_setqs_for_auto_update(preprocessed_body, class_name);
            read_only = (SubLObject)methods.T;
        }
        if (methods.NIL != classes.classes_read_only_p(method_properties)) {
            read_only = (SubLObject)methods.T;
        }
        SubLObject cdolist_list_var = instance_variables;
        SubLObject instance_variable_form = (SubLObject)methods.NIL;
        instance_variable_form = cdolist_list_var.first();
        while (methods.NIL != cdolist_list_var) {
            if (instance_variable_form.isCons()) {
                variable = instance_variable_form.first();
                explicit_getter = conses_high.cadr(instance_variable_form);
                explicit_setter = conses_high.cddr(instance_variable_form).first();
            }
            else {
                variable = instance_variable_form;
                thread.resetMultipleValues();
                final SubLObject explicit_getter_$17 = slots.get_instance_slot_accessors(v_class, variable);
                final SubLObject explicit_setter_$18 = thread.secondMultipleValue();
                thread.resetMultipleValues();
                explicit_getter = explicit_getter_$17;
                explicit_setter = explicit_setter_$18;
            }
            if (methods.NIL != utilities_macros.unquoted_symbol_in_tree_p(variable, preprocessed_body)) {
                var_bindings = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(variable, (SubLObject)ConsesLow.list(explicit_getter, var)), var_bindings);
                if (methods.NIL == read_only) {
                    update_expressions = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(explicit_setter, var, variable), update_expressions);
                }
            }
            cdolist_list_var = cdolist_list_var.rest();
            instance_variable_form = cdolist_list_var.first();
        }
        if (methods.NIL != var_bindings || methods.NIL != methods.$methods_insert_trace_code_p$.getDynamicValue(thread)) {
            if (methods.NIL == read_only || methods.NIL != methods.$methods_insert_trace_code_p$.getDynamicValue(thread)) {
                return (SubLObject)ConsesLow.listS((SubLObject)methods.$sym103$CLET, reader.bq_cons(reader.bq_cons(catch_var, (SubLObject)methods.$list104), ConsesLow.append((SubLObject)((methods.NIL != before_listeners_p || methods.NIL != after_listeners_p) ? ConsesLow.list((SubLObject)ConsesLow.list(listed_args_var, (SubLObject)((methods.NIL != lambda_list) ? methods_lambda_list_to_listed_arg_value_expression(lambda_list) : methods.NIL))) : methods.NIL), Sequences.reverse(var_bindings))), (SubLObject)ConsesLow.list((SubLObject)methods.$sym105$CCATCH, (SubLObject)ConsesLow.list((SubLObject)methods.$sym18$QUOTE, catch_tag), catch_var, (SubLObject)ConsesLow.listS((SubLObject)methods.$sym10$CUNWIND_PROTECT, reader.bq_cons((SubLObject)methods.$sym11$PROGN, ConsesLow.append((SubLObject)((methods.NIL != before_listeners_p) ? ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)methods.$sym106$METHOD_LISTENERS_INVOKE_BEFORE_LISTENERS, (SubLObject)ConsesLow.list((SubLObject)methods.$sym18$QUOTE, method_name), var, listed_args_var)) : methods.NIL), methods_substitute_ret_forms_with_throw_to_tag(preprocessed_body, catch_tag, (SubLObject)methods.UNPROVIDED))), ConsesLow.append((SubLObject)((methods.NIL != methods.$methods_insert_trace_code_p$.getDynamicValue(thread)) ? ConsesLow.list(expand_methods_insert_tracing_exit_code(method_name, (SubLObject)methods.$sym86$SELF, catch_var)) : methods.NIL), (SubLObject)((methods.NIL != read_only) ? methods.NIL : Sequences.reverse(update_expressions)), (SubLObject)methods.NIL))), ConsesLow.append((SubLObject)((methods.NIL != after_listeners_p) ? ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)methods.$sym107$METHOD_LISTENERS_INVOKE_AFTER_LISTENERS, (SubLObject)ConsesLow.list((SubLObject)methods.$sym18$QUOTE, method_name), var, listed_args_var, catch_var)) : methods.NIL), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)methods.$sym96$RET, catch_var))));
            }
            if (methods.NIL != after_listeners_p) {
                if (methods.NIL != before_listeners_p) {
                    return (SubLObject)ConsesLow.list((SubLObject)methods.$sym103$CLET, (SubLObject)ConsesLow.listS(reader.bq_cons(catch_var, (SubLObject)methods.$list104), (SubLObject)ConsesLow.list(listed_args_var, (SubLObject)((methods.NIL != lambda_list) ? methods_lambda_list_to_listed_arg_value_expression(lambda_list) : methods.NIL)), Sequences.reverse(var_bindings)), (SubLObject)ConsesLow.listS((SubLObject)methods.$sym105$CCATCH, (SubLObject)ConsesLow.list((SubLObject)methods.$sym18$QUOTE, catch_tag), catch_var, (SubLObject)ConsesLow.list((SubLObject)methods.$sym106$METHOD_LISTENERS_INVOKE_BEFORE_LISTENERS, (SubLObject)ConsesLow.list((SubLObject)methods.$sym18$QUOTE, method_name), var, listed_args_var), methods_substitute_ret_forms_with_throw_to_tag(preprocessed_body, catch_tag, (SubLObject)methods.UNPROVIDED)), (SubLObject)ConsesLow.list((SubLObject)methods.$sym107$METHOD_LISTENERS_INVOKE_AFTER_LISTENERS, (SubLObject)ConsesLow.list((SubLObject)methods.$sym18$QUOTE, method_name), var, listed_args_var, catch_var), (SubLObject)ConsesLow.list((SubLObject)methods.$sym96$RET, catch_var));
                }
                return (SubLObject)ConsesLow.list((SubLObject)methods.$sym103$CLET, (SubLObject)ConsesLow.listS(reader.bq_cons(catch_var, (SubLObject)methods.$list104), (SubLObject)ConsesLow.list(listed_args_var, (SubLObject)((methods.NIL != lambda_list) ? methods_lambda_list_to_listed_arg_value_expression(lambda_list) : methods.NIL)), Sequences.reverse(var_bindings)), (SubLObject)ConsesLow.listS((SubLObject)methods.$sym105$CCATCH, (SubLObject)ConsesLow.list((SubLObject)methods.$sym18$QUOTE, catch_tag), catch_var, methods_substitute_ret_forms_with_throw_to_tag(preprocessed_body, catch_tag, (SubLObject)methods.UNPROVIDED)), (SubLObject)ConsesLow.list((SubLObject)methods.$sym107$METHOD_LISTENERS_INVOKE_AFTER_LISTENERS, (SubLObject)ConsesLow.list((SubLObject)methods.$sym18$QUOTE, method_name), var, listed_args_var, catch_var), (SubLObject)ConsesLow.list((SubLObject)methods.$sym96$RET, catch_var));
            }
            else {
                if (methods.NIL != before_listeners_p) {
                    return (SubLObject)ConsesLow.listS((SubLObject)methods.$sym103$CLET, reader.bq_cons((SubLObject)ConsesLow.list(listed_args_var, (SubLObject)((methods.NIL != lambda_list) ? methods_lambda_list_to_listed_arg_value_expression(lambda_list) : methods.NIL)), Sequences.reverse(var_bindings)), (SubLObject)ConsesLow.list((SubLObject)methods.$sym106$METHOD_LISTENERS_INVOKE_BEFORE_LISTENERS, (SubLObject)ConsesLow.list((SubLObject)methods.$sym18$QUOTE, method_name), var, listed_args_var), preprocessed_body);
                }
                return (SubLObject)ConsesLow.listS((SubLObject)methods.$sym103$CLET, Sequences.reverse(var_bindings), preprocessed_body);
            }
        }
        else if (methods.NIL != after_listeners_p) {
            if (methods.NIL != before_listeners_p) {
                return (SubLObject)ConsesLow.list((SubLObject)methods.$sym103$CLET, (SubLObject)ConsesLow.listS(reader.bq_cons(catch_var, (SubLObject)methods.$list104), (SubLObject)ConsesLow.list(listed_args_var, (SubLObject)((methods.NIL != lambda_list) ? methods_lambda_list_to_listed_arg_value_expression(lambda_list) : methods.NIL)), Sequences.reverse(var_bindings)), (SubLObject)ConsesLow.listS((SubLObject)methods.$sym105$CCATCH, (SubLObject)ConsesLow.list((SubLObject)methods.$sym18$QUOTE, catch_tag), catch_var, (SubLObject)ConsesLow.list((SubLObject)methods.$sym106$METHOD_LISTENERS_INVOKE_BEFORE_LISTENERS, (SubLObject)ConsesLow.list((SubLObject)methods.$sym18$QUOTE, method_name), var, listed_args_var), methods_substitute_ret_forms_with_throw_to_tag(preprocessed_body, catch_tag, (SubLObject)methods.UNPROVIDED)), (SubLObject)ConsesLow.list((SubLObject)methods.$sym107$METHOD_LISTENERS_INVOKE_AFTER_LISTENERS, (SubLObject)ConsesLow.list((SubLObject)methods.$sym18$QUOTE, method_name), var, listed_args_var, catch_var), (SubLObject)ConsesLow.list((SubLObject)methods.$sym96$RET, catch_var));
            }
            return reader.bq_cons((SubLObject)methods.$sym11$PROGN, preprocessed_body);
        }
        else {
            if (methods.NIL != before_listeners_p) {
                return (SubLObject)ConsesLow.listS((SubLObject)methods.$sym103$CLET, reader.bq_cons((SubLObject)ConsesLow.list(listed_args_var, (SubLObject)((methods.NIL != lambda_list) ? methods_lambda_list_to_listed_arg_value_expression(lambda_list) : methods.NIL)), Sequences.reverse(var_bindings)), (SubLObject)ConsesLow.list((SubLObject)methods.$sym106$METHOD_LISTENERS_INVOKE_BEFORE_LISTENERS, (SubLObject)ConsesLow.list((SubLObject)methods.$sym18$QUOTE, method_name), var, listed_args_var), preprocessed_body);
            }
            return reader.bq_cons((SubLObject)methods.$sym11$PROGN, preprocessed_body);
        }
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/methods.lisp", position = 51425L)
    public static SubLObject methods_create_instance_method_decl(final SubLObject method_name, final SubLObject class_name, final SubLObject method_properties, final SubLObject lambda_list, final SubLObject body) {
        final SubLObject function_name = Packages.intern(Sequences.cconcatenate(Symbols.symbol_name(class_name), new SubLObject[] { methods.$str48$_, Symbols.symbol_name(method_name), methods.$str49$_METHOD }), (SubLObject)methods.UNPROVIDED);
        final SubLObject new_body = generate_instance_variable_bindings_for_instance((SubLObject)methods.$sym86$SELF, class_name, method_name, lambda_list, method_properties, instances.instances_filter_slots_per_access(classes.classes_retrieve_class(class_name), classes.classes_all_slots(class_name, (SubLObject)methods.UNPROVIDED)), body, (SubLObject)methods.NIL);
        final SubLObject self_in_bodyP = (SubLObject)SubLObjectFactory.makeBoolean(methods.NIL != utilities_macros.unquoted_symbol_in_tree_p((SubLObject)methods.$sym86$SELF, new_body) || methods.NIL != utilities_macros.unquoted_symbol_in_tree_p((SubLObject)methods.$sym88$SUPER, new_body));
        final SubLObject function_def = conses_high.copy_tree((SubLObject)ConsesLow.listS((SubLObject)methods.$sym108$DEFINE_PUBLIC, function_name, reader.bq_cons((SubLObject)methods.$sym86$SELF, lambda_list), ConsesLow.append((SubLObject)((methods.NIL != self_in_bodyP) ? methods.NIL : conses_high.copy_tree((SubLObject)methods.$list109)), (SubLObject)ConsesLow.list(new_body))));
        return (SubLObject)ConsesLow.listS(method_name, function_name, function_def);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/methods.lisp", position = 52265L)
    public static SubLObject methods_generate_instance_function_definition(final SubLObject method, final SubLObject method_properties, final SubLObject method_body) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (methods.NIL != subloop_structures.method_p(method)) {
            final SubLObject name = subloop_structures.method_name(method);
            final SubLObject class_name = subloop_structures.method_class_name(method);
            final SubLObject lambda_list = subloop_structures.method_lambda_list(method);
            final SubLObject scope = subloop_structures.method_scope(method);
            final SubLObject function_name = subloop_structures.method_function_name(method);
            SubLObject function_def = subloop_structures.method_function_def(method);
            try {
                SubLObject preprocessed_body = method_body;
                SubLObject documentation_string = (SubLObject)methods.NIL;
                if (method_body.isCons() && method_body.first().isString()) {
                    preprocessed_body = method_body.rest();
                    documentation_string = method_body.first();
                }
                final SubLObject new_body = generate_instance_variable_bindings_for_instance((SubLObject)methods.$sym86$SELF, class_name, name, lambda_list, method_properties, instances.instances_filter_slots_per_access(classes.classes_retrieve_class(class_name), classes.classes_all_slots(class_name, (SubLObject)methods.UNPROVIDED)), preprocessed_body, (SubLObject)methods.NIL);
                final SubLObject self_in_bodyP = (SubLObject)SubLObjectFactory.makeBoolean(methods.NIL != utilities_macros.unquoted_symbol_in_tree_p((SubLObject)methods.$sym86$SELF, new_body) || methods.NIL != utilities_macros.unquoted_symbol_in_tree_p((SubLObject)methods.$sym88$SUPER, new_body));
                SubLObject special_form = (SubLObject)methods.$sym108$DEFINE_PUBLIC;
                final SubLObject pcase_var = scope;
                if (pcase_var.eql((SubLObject)methods.$kw38$FILE_SCOPE)) {
                    special_form = (SubLObject)methods.$sym110$DEFINE_PRIVATE;
                }
                else if (pcase_var.eql((SubLObject)methods.$kw39$SYSTEM_SCOPE)) {
                    special_form = (SubLObject)methods.$sym111$DEFINE_PROTECTED;
                }
                else if (pcase_var.eql((SubLObject)methods.$kw40$GLOBAL_SCOPE)) {
                    special_form = (SubLObject)methods.$sym108$DEFINE_PUBLIC;
                }
                function_def = (SubLObject)ConsesLow.listS(special_form, function_name, reader.bq_cons((SubLObject)methods.$sym86$SELF, lambda_list), ConsesLow.append((SubLObject)((methods.NIL != documentation_string) ? ConsesLow.list(documentation_string) : methods.NIL), (SubLObject)((methods.NIL != methods.$methods_insert_trace_code_p$.getDynamicValue(thread)) ? ConsesLow.list(expand_methods_insert_tracing_enter_code(name, (SubLObject)methods.$sym86$SELF, lambda_list)) : methods.NIL), (SubLObject)((methods.NIL != self_in_bodyP) ? methods.NIL : conses_high.copy_tree((SubLObject)methods.$list109)), (SubLObject)ConsesLow.list(new_body)));
            }
            finally {
                final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)methods.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    subloop_structures._csetf_method_name(method, name);
                    subloop_structures._csetf_method_class_name(method, class_name);
                    subloop_structures._csetf_method_lambda_list(method, lambda_list);
                    subloop_structures._csetf_method_scope(method, scope);
                    subloop_structures._csetf_method_function_name(method, function_name);
                    subloop_structures._csetf_method_function_def(method, function_def);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
            return method;
        }
        return (SubLObject)methods.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/methods.lisp", position = 53694L)
    public static SubLObject methods_create_class_method_decl(final SubLObject method_name, final SubLObject class_name, final SubLObject method_properties, final SubLObject lambda_list, final SubLObject body) {
        final SubLObject function_name = Packages.intern(Sequences.cconcatenate(Symbols.symbol_name(class_name), new SubLObject[] { methods.$str48$_, Symbols.symbol_name(method_name), methods.$str49$_METHOD }), (SubLObject)methods.UNPROVIDED);
        final SubLObject new_body = generate_instance_variable_bindings_for_instance((SubLObject)methods.$sym86$SELF, class_name, method_name, lambda_list, method_properties, instances.instances_filter_slots_per_access(classes.classes_retrieve_class(class_name), classes.classes_all_class_slots(class_name, (SubLObject)methods.UNPROVIDED)), body, (SubLObject)methods.NIL);
        final SubLObject function_def = conses_high.copy_tree((SubLObject)ConsesLow.list((SubLObject)methods.$sym108$DEFINE_PUBLIC, function_name, reader.bq_cons((SubLObject)methods.$sym86$SELF, lambda_list), (SubLObject)methods.$list112, new_body));
        return (SubLObject)ConsesLow.listS(method_name, function_name, function_def);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/methods.lisp", position = 54434L)
    public static SubLObject methods_generate_class_function_definition(final SubLObject method, final SubLObject method_properties, final SubLObject method_body) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (methods.NIL != subloop_structures.method_p(method)) {
            final SubLObject name = subloop_structures.method_name(method);
            final SubLObject class_name = subloop_structures.method_class_name(method);
            final SubLObject lambda_list = subloop_structures.method_lambda_list(method);
            final SubLObject scope = subloop_structures.method_scope(method);
            final SubLObject function_name = subloop_structures.method_function_name(method);
            SubLObject function_def = subloop_structures.method_function_def(method);
            try {
                SubLObject preprocessed_body = method_body;
                SubLObject documentation_string = (SubLObject)methods.NIL;
                if (method_body.isCons() && method_body.first().isString()) {
                    preprocessed_body = method_body.rest();
                    documentation_string = method_body.first();
                }
                final SubLObject new_body = generate_instance_variable_bindings_for_instance((SubLObject)methods.$sym86$SELF, class_name, name, lambda_list, method_properties, instances.instances_filter_slots_per_access(classes.classes_retrieve_class(class_name), classes.classes_all_class_slots(class_name, (SubLObject)methods.UNPROVIDED)), preprocessed_body, (SubLObject)methods.NIL);
                SubLObject special_form = (SubLObject)methods.$sym108$DEFINE_PUBLIC;
                final SubLObject pcase_var = scope;
                if (pcase_var.eql((SubLObject)methods.$kw38$FILE_SCOPE)) {
                    special_form = (SubLObject)methods.$sym110$DEFINE_PRIVATE;
                }
                else if (pcase_var.eql((SubLObject)methods.$kw39$SYSTEM_SCOPE)) {
                    special_form = (SubLObject)methods.$sym111$DEFINE_PROTECTED;
                }
                else if (pcase_var.eql((SubLObject)methods.$kw40$GLOBAL_SCOPE)) {
                    special_form = (SubLObject)methods.$sym108$DEFINE_PUBLIC;
                }
                function_def = conses_high.copy_tree((SubLObject)ConsesLow.listS(special_form, function_name, reader.bq_cons((SubLObject)methods.$sym86$SELF, lambda_list), ConsesLow.append((SubLObject)((methods.NIL != documentation_string) ? ConsesLow.list(documentation_string) : methods.NIL), (SubLObject)((methods.NIL != methods.$methods_insert_trace_code_p$.getDynamicValue(thread)) ? ConsesLow.list(expand_methods_insert_tracing_enter_code(name, (SubLObject)methods.$sym86$SELF, lambda_list)) : methods.NIL), (SubLObject)ConsesLow.list((SubLObject)methods.$list112, new_body))));
            }
            finally {
                final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)methods.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    subloop_structures._csetf_method_name(method, name);
                    subloop_structures._csetf_method_class_name(method, class_name);
                    subloop_structures._csetf_method_lambda_list(method, lambda_list);
                    subloop_structures._csetf_method_scope(method, scope);
                    subloop_structures._csetf_method_function_name(method, function_name);
                    subloop_structures._csetf_method_function_def(method, function_def);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
            return method;
        }
        return (SubLObject)methods.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/methods.lisp", position = 55801L)
    public static SubLObject methods_get_method(final SubLObject v_class, final SubLObject method_name) {
        if (methods.NIL != subloop_structures.class_p(v_class)) {
            final SubLObject compiled_instance_method_access_alist = subloop_structures.class_compiled_instance_method_access_alist(v_class);
            final SubLObject compiled_class_method_access_alist = subloop_structures.class_compiled_class_method_access_alist(v_class);
            SubLObject method = method_assoc(method_name, compiled_instance_method_access_alist);
            if (methods.NIL != method) {
                return method;
            }
            method = method_assoc(method_name, compiled_class_method_access_alist);
            if (methods.NIL != method) {
                return method;
            }
        }
        return (SubLObject)methods.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/methods.lisp", position = 56176L)
    public static SubLObject methods_get_all_method_names(final SubLObject class_or_instance) {
        final SubLObject v_class = (SubLObject)((methods.NIL != subloop_structures.class_p(class_or_instance)) ? class_or_instance : ((methods.NIL != subloop_structures.instance_p(class_or_instance)) ? subloop_structures.instance_class(class_or_instance) : methods.NIL));
        if (methods.NIL != v_class) {
            SubLObject collected_methods = (SubLObject)methods.NIL;
            final SubLObject v_class_$22 = v_class;
            final SubLObject compiled_instance_method_access_alist = subloop_structures.class_compiled_instance_method_access_alist(v_class_$22);
            SubLObject cdolist_list_var;
            final SubLObject compiled_class_method_access_alist = cdolist_list_var = subloop_structures.class_compiled_class_method_access_alist(v_class_$22);
            SubLObject method = (SubLObject)methods.NIL;
            method = cdolist_list_var.first();
            while (methods.NIL != cdolist_list_var) {
                final SubLObject item_var = subloop_structures.method_name(method);
                if (methods.NIL == conses_high.member(item_var, collected_methods, Symbols.symbol_function((SubLObject)methods.EQL), Symbols.symbol_function((SubLObject)methods.IDENTITY))) {
                    collected_methods = (SubLObject)ConsesLow.cons(item_var, collected_methods);
                }
                cdolist_list_var = cdolist_list_var.rest();
                method = cdolist_list_var.first();
            }
            cdolist_list_var = compiled_instance_method_access_alist;
            method = (SubLObject)methods.NIL;
            method = cdolist_list_var.first();
            while (methods.NIL != cdolist_list_var) {
                final SubLObject item_var = subloop_structures.method_name(method);
                if (methods.NIL == conses_high.member(item_var, collected_methods, Symbols.symbol_function((SubLObject)methods.EQL), Symbols.symbol_function((SubLObject)methods.IDENTITY))) {
                    collected_methods = (SubLObject)ConsesLow.cons(item_var, collected_methods);
                }
                cdolist_list_var = cdolist_list_var.rest();
                method = cdolist_list_var.first();
            }
            return Sequences.nreverse(collected_methods);
        }
        return (SubLObject)methods.NIL;
    }
    
    public static SubLObject declare_methods_file() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.methods", "methods_generate_format_string_for_tracing", "METHODS-GENERATE-FORMAT-STRING-FOR-TRACING", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.methods", "methods_generate_method_enter_format_string", "METHODS-GENERATE-METHOD-ENTER-FORMAT-STRING", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.methods", "methods_generate_method_exit_format_string", "METHODS-GENERATE-METHOD-EXIT-FORMAT-STRING", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.methods", "methods_tracing_tab", "METHODS-TRACING-TAB", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.methods", "methods_filter_option_words_from_lambda_list", "METHODS-FILTER-OPTION-WORDS-FROM-LAMBDA-LIST", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.methods", "expand_methods_insert_tracing_enter_code", "EXPAND-METHODS-INSERT-TRACING-ENTER-CODE", 3, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.methods", "methods_insert_tracing_enter_code", "METHODS-INSERT-TRACING-ENTER-CODE");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.methods", "expand_methods_insert_tracing_exit_code", "EXPAND-METHODS-INSERT-TRACING-EXIT-CODE", 3, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.methods", "methods_insert_tracing_exit_code", "METHODS-INSERT-TRACING-EXIT-CODE");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.methods", "methods_protection_level_p", "METHODS-PROTECTION-LEVEL-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.methods", "methods_scope_level_p", "METHODS-SCOPE-LEVEL-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.methods", "valid_method_listener_types", "VALID-METHOD-LISTENER-TYPES", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.methods", "method_listener_type_p", "METHOD-LISTENER-TYPE-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.methods", "encode_method_listener_type", "ENCODE-METHOD-LISTENER-TYPE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.methods", "decode_method_listener_type", "DECODE-METHOD-LISTENER-TYPE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.methods", "method_listener_type_less_p", "METHOD-LISTENER-TYPE-LESS-P", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.methods", "method_listener_type_greater_p", "METHOD-LISTENER-TYPE-GREATER-P", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.methods", "methods_special_form_given_scope_level", "METHODS-SPECIAL-FORM-GIVEN-SCOPE-LEVEL", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.methods", "method_assoc", "METHOD-ASSOC", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.methods", "method_shadowed_assoc", "METHOD-SHADOWED-ASSOC", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.methods", "method_class_assoc", "METHOD-CLASS-ASSOC", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.methods", "method_class_shadowed_assoc", "METHOD-CLASS-SHADOWED-ASSOC", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.methods", "methods_protection_level_of_method_decl", "METHODS-PROTECTION-LEVEL-OF-METHOD-DECL", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.methods", "methods_scope_level_of_method_decl", "METHODS-SCOPE-LEVEL-OF-METHOD-DECL", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.methods", "methods_update_type_of_method_decl", "METHODS-UPDATE-TYPE-OF-METHOD-DECL", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.methods", "methods_before_listeners_p", "METHODS-BEFORE-LISTENERS-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.methods", "methods_after_listeners_p", "METHODS-AFTER-LISTENERS-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.methods", "method_instantiate_template_p", "METHOD-INSTANTIATE-TEMPLATE-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.methods", "new_method", "NEW-METHOD", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.methods", "methods_intern_method", "METHODS-INTERN-METHOD", 5, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.methods", "method_set_function_definition", "METHOD-SET-FUNCTION-DEFINITION", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.methods", "methods_check_method_spec", "METHODS-CHECK-METHOD-SPEC", 2, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.methods", "def_instance_method", "DEF-INSTANCE-METHOD");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.methods", "subloop_register_instance_method", "SUBLOOP-REGISTER-INSTANCE-METHOD", 3, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.methods", "def_default_instance_method", "DEF-DEFAULT-INSTANCE-METHOD");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.methods", "methods_retrieve_instance_method_definition", "METHODS-RETRIEVE-INSTANCE-METHOD-DEFINITION", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.methods", "methods_incorporate_instance_method", "METHODS-INCORPORATE-INSTANCE-METHOD", 5, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.methods", "methods_update_instance_method_decl", "METHODS-UPDATE-INSTANCE-METHOD-DECL", 5, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.methods", "def_class_method", "DEF-CLASS-METHOD");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.methods", "subloop_register_class_method", "SUBLOOP-REGISTER-CLASS-METHOD", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.methods", "methods_retrieve_class_method_definition", "METHODS-RETRIEVE-CLASS-METHOD-DEFINITION", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.methods", "methods_incorporate_class_method", "METHODS-INCORPORATE-CLASS-METHOD", 5, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.methods", "methods_update_class_method_decl", "METHODS-UPDATE-CLASS-METHOD-DECL", 5, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.methods", "methods_method_name_given_method_decl", "METHODS-METHOD-NAME-GIVEN-METHOD-DECL", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.methods", "methods_function_name_given_method_decl", "METHODS-FUNCTION-NAME-GIVEN-METHOD-DECL", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.methods", "methods_function_def_given_method_decl", "METHODS-FUNCTION-DEF-GIVEN-METHOD-DECL", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.methods", "methods_set_function_def_of_method_decl", "METHODS-SET-FUNCTION-DEF-OF-METHOD-DECL", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.methods", "methods_add_method_decl", "METHODS-ADD-METHOD-DECL", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.methods", "methods_retrieve_method_decl", "METHODS-RETRIEVE-METHOD-DECL", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.methods", "methods_compile_method_access_alists", "METHODS-COMPILE-METHOD-ACCESS-ALISTS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.methods", "methods_compile_class_method_access_alist_upwards", "METHODS-COMPILE-CLASS-METHOD-ACCESS-ALIST-UPWARDS", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.methods", "methods_compile_class_method_access_alist", "METHODS-COMPILE-CLASS-METHOD-ACCESS-ALIST", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.methods", "methods_compile_instance_method_access_alist_upwards", "METHODS-COMPILE-INSTANCE-METHOD-ACCESS-ALIST-UPWARDS", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.methods", "methods_compile_instance_method_access_alist", "METHODS-COMPILE-INSTANCE-METHOD-ACCESS-ALIST", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.methods", "funcall_class_method_with_0_args", "FUNCALL-CLASS-METHOD-WITH-0-ARGS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.methods", "funcall_class_method_with_1_args", "FUNCALL-CLASS-METHOD-WITH-1-ARGS", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.methods", "funcall_class_method_with_2_args", "FUNCALL-CLASS-METHOD-WITH-2-ARGS", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.methods", "funcall_class_method_with_3_args", "FUNCALL-CLASS-METHOD-WITH-3-ARGS", 5, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.methods", "funcall_class_method_with_4_args", "FUNCALL-CLASS-METHOD-WITH-4-ARGS", 6, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.methods", "funcall_class_method_with_5_args", "FUNCALL-CLASS-METHOD-WITH-5-ARGS", 7, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.methods", "funcall_class_method_with_6_args", "FUNCALL-CLASS-METHOD-WITH-6-ARGS", 8, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.methods", "funcall_class_method_with_7_args", "FUNCALL-CLASS-METHOD-WITH-7-ARGS", 9, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.methods", "funcall_class_method_with_8_args", "FUNCALL-CLASS-METHOD-WITH-8-ARGS", 10, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.methods", "funcall_class_method_with_9_args", "FUNCALL-CLASS-METHOD-WITH-9-ARGS", 11, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.methods", "funcall_class_method_with_10_args", "FUNCALL-CLASS-METHOD-WITH-10-ARGS", 12, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.methods", "funcall_class_method_with_11_args", "FUNCALL-CLASS-METHOD-WITH-11-ARGS", 13, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.methods", "funcall_class_method_with_12_args", "FUNCALL-CLASS-METHOD-WITH-12-ARGS", 14, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.methods", "funcall_class_method_with_13_args", "FUNCALL-CLASS-METHOD-WITH-13-ARGS", 15, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.methods", "funcall_class_method_with_14_args", "FUNCALL-CLASS-METHOD-WITH-14-ARGS", 16, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.methods", "funcall_class_method_with_15_args", "FUNCALL-CLASS-METHOD-WITH-15-ARGS", 17, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.methods", "funcall_class_method_with_16_args", "FUNCALL-CLASS-METHOD-WITH-16-ARGS", 18, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.methods", "funcall_class_method_with_17_args", "FUNCALL-CLASS-METHOD-WITH-17-ARGS", 19, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.methods", "funcall_class_method_with_18_args", "FUNCALL-CLASS-METHOD-WITH-18-ARGS", 20, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.methods", "funcall_class_method_with_19_args", "FUNCALL-CLASS-METHOD-WITH-19-ARGS", 21, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.methods", "funcall_class_method_with_20_args", "FUNCALL-CLASS-METHOD-WITH-20-ARGS", 22, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.methods", "funcall_class_super_method_with_0_args", "FUNCALL-CLASS-SUPER-METHOD-WITH-0-ARGS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.methods", "funcall_class_super_method_with_1_args", "FUNCALL-CLASS-SUPER-METHOD-WITH-1-ARGS", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.methods", "funcall_class_super_method_with_2_args", "FUNCALL-CLASS-SUPER-METHOD-WITH-2-ARGS", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.methods", "funcall_class_super_method_with_3_args", "FUNCALL-CLASS-SUPER-METHOD-WITH-3-ARGS", 5, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.methods", "funcall_class_super_method_with_4_args", "FUNCALL-CLASS-SUPER-METHOD-WITH-4-ARGS", 6, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.methods", "funcall_class_super_method_with_5_args", "FUNCALL-CLASS-SUPER-METHOD-WITH-5-ARGS", 7, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.methods", "funcall_class_super_method_with_6_args", "FUNCALL-CLASS-SUPER-METHOD-WITH-6-ARGS", 8, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.methods", "funcall_class_super_method_with_7_args", "FUNCALL-CLASS-SUPER-METHOD-WITH-7-ARGS", 9, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.methods", "funcall_class_super_method_with_8_args", "FUNCALL-CLASS-SUPER-METHOD-WITH-8-ARGS", 10, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.methods", "funcall_class_super_method_with_9_args", "FUNCALL-CLASS-SUPER-METHOD-WITH-9-ARGS", 11, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.methods", "funcall_class_super_method_with_10_args", "FUNCALL-CLASS-SUPER-METHOD-WITH-10-ARGS", 12, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.methods", "funcall_class_super_method_with_11_args", "FUNCALL-CLASS-SUPER-METHOD-WITH-11-ARGS", 13, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.methods", "funcall_class_super_method_with_12_args", "FUNCALL-CLASS-SUPER-METHOD-WITH-12-ARGS", 14, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.methods", "funcall_class_super_method_with_13_args", "FUNCALL-CLASS-SUPER-METHOD-WITH-13-ARGS", 15, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.methods", "funcall_class_super_method_with_14_args", "FUNCALL-CLASS-SUPER-METHOD-WITH-14-ARGS", 16, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.methods", "funcall_class_super_method_with_15_args", "FUNCALL-CLASS-SUPER-METHOD-WITH-15-ARGS", 17, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.methods", "funcall_class_super_method_with_16_args", "FUNCALL-CLASS-SUPER-METHOD-WITH-16-ARGS", 18, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.methods", "funcall_class_super_method_with_17_args", "FUNCALL-CLASS-SUPER-METHOD-WITH-17-ARGS", 19, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.methods", "funcall_class_super_method_with_18_args", "FUNCALL-CLASS-SUPER-METHOD-WITH-18-ARGS", 20, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.methods", "funcall_class_super_method_with_19_args", "FUNCALL-CLASS-SUPER-METHOD-WITH-19-ARGS", 21, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.methods", "funcall_class_super_method_with_20_args", "FUNCALL-CLASS-SUPER-METHOD-WITH-20-ARGS", 22, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.methods", "safe_funcall_class_method_with_0_args", "SAFE-FUNCALL-CLASS-METHOD-WITH-0-ARGS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.methods", "safe_funcall_class_method_with_1_args", "SAFE-FUNCALL-CLASS-METHOD-WITH-1-ARGS", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.methods", "safe_funcall_class_method_with_2_args", "SAFE-FUNCALL-CLASS-METHOD-WITH-2-ARGS", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.methods", "safe_funcall_class_method_with_3_args", "SAFE-FUNCALL-CLASS-METHOD-WITH-3-ARGS", 5, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.methods", "safe_funcall_class_method_with_4_args", "SAFE-FUNCALL-CLASS-METHOD-WITH-4-ARGS", 6, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.methods", "safe_funcall_class_method_with_5_args", "SAFE-FUNCALL-CLASS-METHOD-WITH-5-ARGS", 7, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.methods", "safe_funcall_class_method_with_6_args", "SAFE-FUNCALL-CLASS-METHOD-WITH-6-ARGS", 8, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.methods", "safe_funcall_class_method_with_7_args", "SAFE-FUNCALL-CLASS-METHOD-WITH-7-ARGS", 9, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.methods", "safe_funcall_class_method_with_8_args", "SAFE-FUNCALL-CLASS-METHOD-WITH-8-ARGS", 10, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.methods", "safe_funcall_class_method_with_9_args", "SAFE-FUNCALL-CLASS-METHOD-WITH-9-ARGS", 11, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.methods", "safe_funcall_class_method_with_10_args", "SAFE-FUNCALL-CLASS-METHOD-WITH-10-ARGS", 12, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.methods", "safe_funcall_class_method_with_11_args", "SAFE-FUNCALL-CLASS-METHOD-WITH-11-ARGS", 13, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.methods", "safe_funcall_class_method_with_12_args", "SAFE-FUNCALL-CLASS-METHOD-WITH-12-ARGS", 14, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.methods", "safe_funcall_class_method_with_13_args", "SAFE-FUNCALL-CLASS-METHOD-WITH-13-ARGS", 15, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.methods", "safe_funcall_class_method_with_14_args", "SAFE-FUNCALL-CLASS-METHOD-WITH-14-ARGS", 16, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.methods", "safe_funcall_class_method_with_15_args", "SAFE-FUNCALL-CLASS-METHOD-WITH-15-ARGS", 17, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.methods", "safe_funcall_class_method_with_16_args", "SAFE-FUNCALL-CLASS-METHOD-WITH-16-ARGS", 18, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.methods", "safe_funcall_class_method_with_17_args", "SAFE-FUNCALL-CLASS-METHOD-WITH-17-ARGS", 19, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.methods", "safe_funcall_class_method_with_18_args", "SAFE-FUNCALL-CLASS-METHOD-WITH-18-ARGS", 20, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.methods", "safe_funcall_class_method_with_19_args", "SAFE-FUNCALL-CLASS-METHOD-WITH-19-ARGS", 21, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.methods", "safe_funcall_class_method_with_20_args", "SAFE-FUNCALL-CLASS-METHOD-WITH-20-ARGS", 22, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.methods", "safe_funcall_class_super_method_with_0_args", "SAFE-FUNCALL-CLASS-SUPER-METHOD-WITH-0-ARGS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.methods", "safe_funcall_class_super_method_with_1_args", "SAFE-FUNCALL-CLASS-SUPER-METHOD-WITH-1-ARGS", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.methods", "safe_funcall_class_super_method_with_2_args", "SAFE-FUNCALL-CLASS-SUPER-METHOD-WITH-2-ARGS", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.methods", "safe_funcall_class_super_method_with_3_args", "SAFE-FUNCALL-CLASS-SUPER-METHOD-WITH-3-ARGS", 5, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.methods", "safe_funcall_class_super_method_with_4_args", "SAFE-FUNCALL-CLASS-SUPER-METHOD-WITH-4-ARGS", 6, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.methods", "safe_funcall_class_super_method_with_5_args", "SAFE-FUNCALL-CLASS-SUPER-METHOD-WITH-5-ARGS", 7, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.methods", "safe_funcall_class_super_method_with_6_args", "SAFE-FUNCALL-CLASS-SUPER-METHOD-WITH-6-ARGS", 8, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.methods", "safe_funcall_class_super_method_with_7_args", "SAFE-FUNCALL-CLASS-SUPER-METHOD-WITH-7-ARGS", 9, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.methods", "safe_funcall_class_super_method_with_8_args", "SAFE-FUNCALL-CLASS-SUPER-METHOD-WITH-8-ARGS", 10, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.methods", "safe_funcall_class_super_method_with_9_args", "SAFE-FUNCALL-CLASS-SUPER-METHOD-WITH-9-ARGS", 11, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.methods", "safe_funcall_class_super_method_with_10_args", "SAFE-FUNCALL-CLASS-SUPER-METHOD-WITH-10-ARGS", 12, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.methods", "safe_funcall_class_super_method_with_11_args", "SAFE-FUNCALL-CLASS-SUPER-METHOD-WITH-11-ARGS", 13, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.methods", "safe_funcall_class_super_method_with_12_args", "SAFE-FUNCALL-CLASS-SUPER-METHOD-WITH-12-ARGS", 14, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.methods", "safe_funcall_class_super_method_with_13_args", "SAFE-FUNCALL-CLASS-SUPER-METHOD-WITH-13-ARGS", 15, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.methods", "safe_funcall_class_super_method_with_14_args", "SAFE-FUNCALL-CLASS-SUPER-METHOD-WITH-14-ARGS", 16, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.methods", "safe_funcall_class_super_method_with_15_args", "SAFE-FUNCALL-CLASS-SUPER-METHOD-WITH-15-ARGS", 17, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.methods", "safe_funcall_class_super_method_with_16_args", "SAFE-FUNCALL-CLASS-SUPER-METHOD-WITH-16-ARGS", 18, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.methods", "safe_funcall_class_super_method_with_17_args", "SAFE-FUNCALL-CLASS-SUPER-METHOD-WITH-17-ARGS", 19, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.methods", "safe_funcall_class_super_method_with_18_args", "SAFE-FUNCALL-CLASS-SUPER-METHOD-WITH-18-ARGS", 20, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.methods", "safe_funcall_class_super_method_with_19_args", "SAFE-FUNCALL-CLASS-SUPER-METHOD-WITH-19-ARGS", 21, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.methods", "safe_funcall_class_super_method_with_20_args", "SAFE-FUNCALL-CLASS-SUPER-METHOD-WITH-20-ARGS", 22, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.methods", "funcall_instance_method_with_0_args", "FUNCALL-INSTANCE-METHOD-WITH-0-ARGS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.methods", "funcall_instance_method_with_1_args", "FUNCALL-INSTANCE-METHOD-WITH-1-ARGS", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.methods", "funcall_instance_method_with_2_args", "FUNCALL-INSTANCE-METHOD-WITH-2-ARGS", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.methods", "funcall_instance_method_with_3_args", "FUNCALL-INSTANCE-METHOD-WITH-3-ARGS", 5, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.methods", "funcall_instance_method_with_4_args", "FUNCALL-INSTANCE-METHOD-WITH-4-ARGS", 6, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.methods", "funcall_instance_method_with_5_args", "FUNCALL-INSTANCE-METHOD-WITH-5-ARGS", 7, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.methods", "funcall_instance_method_with_6_args", "FUNCALL-INSTANCE-METHOD-WITH-6-ARGS", 8, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.methods", "funcall_instance_method_with_7_args", "FUNCALL-INSTANCE-METHOD-WITH-7-ARGS", 9, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.methods", "funcall_instance_method_with_8_args", "FUNCALL-INSTANCE-METHOD-WITH-8-ARGS", 10, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.methods", "funcall_instance_method_with_9_args", "FUNCALL-INSTANCE-METHOD-WITH-9-ARGS", 11, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.methods", "funcall_instance_method_with_10_args", "FUNCALL-INSTANCE-METHOD-WITH-10-ARGS", 12, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.methods", "funcall_instance_method_with_11_args", "FUNCALL-INSTANCE-METHOD-WITH-11-ARGS", 13, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.methods", "funcall_instance_method_with_12_args", "FUNCALL-INSTANCE-METHOD-WITH-12-ARGS", 14, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.methods", "funcall_instance_method_with_13_args", "FUNCALL-INSTANCE-METHOD-WITH-13-ARGS", 15, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.methods", "funcall_instance_method_with_14_args", "FUNCALL-INSTANCE-METHOD-WITH-14-ARGS", 16, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.methods", "funcall_instance_method_with_15_args", "FUNCALL-INSTANCE-METHOD-WITH-15-ARGS", 17, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.methods", "funcall_instance_method_with_16_args", "FUNCALL-INSTANCE-METHOD-WITH-16-ARGS", 18, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.methods", "funcall_instance_method_with_17_args", "FUNCALL-INSTANCE-METHOD-WITH-17-ARGS", 19, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.methods", "funcall_instance_method_with_18_args", "FUNCALL-INSTANCE-METHOD-WITH-18-ARGS", 20, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.methods", "funcall_instance_method_with_19_args", "FUNCALL-INSTANCE-METHOD-WITH-19-ARGS", 21, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.methods", "funcall_instance_method_with_20_args", "FUNCALL-INSTANCE-METHOD-WITH-20-ARGS", 22, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.methods", "funcall_instance_super_method_with_0_args", "FUNCALL-INSTANCE-SUPER-METHOD-WITH-0-ARGS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.methods", "funcall_instance_super_method_with_1_args", "FUNCALL-INSTANCE-SUPER-METHOD-WITH-1-ARGS", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.methods", "funcall_instance_super_method_with_2_args", "FUNCALL-INSTANCE-SUPER-METHOD-WITH-2-ARGS", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.methods", "funcall_instance_super_method_with_3_args", "FUNCALL-INSTANCE-SUPER-METHOD-WITH-3-ARGS", 5, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.methods", "funcall_instance_super_method_with_4_args", "FUNCALL-INSTANCE-SUPER-METHOD-WITH-4-ARGS", 6, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.methods", "funcall_instance_super_method_with_5_args", "FUNCALL-INSTANCE-SUPER-METHOD-WITH-5-ARGS", 7, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.methods", "funcall_instance_super_method_with_6_args", "FUNCALL-INSTANCE-SUPER-METHOD-WITH-6-ARGS", 8, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.methods", "funcall_instance_super_method_with_7_args", "FUNCALL-INSTANCE-SUPER-METHOD-WITH-7-ARGS", 9, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.methods", "funcall_instance_super_method_with_8_args", "FUNCALL-INSTANCE-SUPER-METHOD-WITH-8-ARGS", 10, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.methods", "funcall_instance_super_method_with_9_args", "FUNCALL-INSTANCE-SUPER-METHOD-WITH-9-ARGS", 11, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.methods", "funcall_instance_super_method_with_10_args", "FUNCALL-INSTANCE-SUPER-METHOD-WITH-10-ARGS", 12, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.methods", "funcall_instance_super_method_with_11_args", "FUNCALL-INSTANCE-SUPER-METHOD-WITH-11-ARGS", 13, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.methods", "funcall_instance_super_method_with_12_args", "FUNCALL-INSTANCE-SUPER-METHOD-WITH-12-ARGS", 14, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.methods", "funcall_instance_super_method_with_13_args", "FUNCALL-INSTANCE-SUPER-METHOD-WITH-13-ARGS", 15, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.methods", "funcall_instance_super_method_with_14_args", "FUNCALL-INSTANCE-SUPER-METHOD-WITH-14-ARGS", 16, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.methods", "funcall_instance_super_method_with_15_args", "FUNCALL-INSTANCE-SUPER-METHOD-WITH-15-ARGS", 17, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.methods", "funcall_instance_super_method_with_16_args", "FUNCALL-INSTANCE-SUPER-METHOD-WITH-16-ARGS", 18, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.methods", "funcall_instance_super_method_with_17_args", "FUNCALL-INSTANCE-SUPER-METHOD-WITH-17-ARGS", 19, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.methods", "funcall_instance_super_method_with_18_args", "FUNCALL-INSTANCE-SUPER-METHOD-WITH-18-ARGS", 20, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.methods", "funcall_instance_super_method_with_19_args", "FUNCALL-INSTANCE-SUPER-METHOD-WITH-19-ARGS", 21, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.methods", "funcall_instance_super_method_with_20_args", "FUNCALL-INSTANCE-SUPER-METHOD-WITH-20-ARGS", 22, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.methods", "funcall_class_or_instance_method_with_0_args", "FUNCALL-CLASS-OR-INSTANCE-METHOD-WITH-0-ARGS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.methods", "funcall_class_or_instance_method_with_1_args", "FUNCALL-CLASS-OR-INSTANCE-METHOD-WITH-1-ARGS", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.methods", "funcall_class_or_instance_method_with_2_args", "FUNCALL-CLASS-OR-INSTANCE-METHOD-WITH-2-ARGS", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.methods", "funcall_class_or_instance_method_with_3_args", "FUNCALL-CLASS-OR-INSTANCE-METHOD-WITH-3-ARGS", 5, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.methods", "funcall_class_or_instance_method_with_4_args", "FUNCALL-CLASS-OR-INSTANCE-METHOD-WITH-4-ARGS", 6, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.methods", "funcall_class_or_instance_method_with_5_args", "FUNCALL-CLASS-OR-INSTANCE-METHOD-WITH-5-ARGS", 7, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.methods", "funcall_class_or_instance_method_with_6_args", "FUNCALL-CLASS-OR-INSTANCE-METHOD-WITH-6-ARGS", 8, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.methods", "funcall_class_or_instance_method_with_7_args", "FUNCALL-CLASS-OR-INSTANCE-METHOD-WITH-7-ARGS", 9, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.methods", "funcall_class_or_instance_method_with_8_args", "FUNCALL-CLASS-OR-INSTANCE-METHOD-WITH-8-ARGS", 10, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.methods", "funcall_class_or_instance_method_with_9_args", "FUNCALL-CLASS-OR-INSTANCE-METHOD-WITH-9-ARGS", 11, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.methods", "funcall_class_or_instance_method_with_10_args", "FUNCALL-CLASS-OR-INSTANCE-METHOD-WITH-10-ARGS", 12, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.methods", "funcall_class_or_instance_method_with_11_args", "FUNCALL-CLASS-OR-INSTANCE-METHOD-WITH-11-ARGS", 13, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.methods", "funcall_class_or_instance_method_with_12_args", "FUNCALL-CLASS-OR-INSTANCE-METHOD-WITH-12-ARGS", 14, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.methods", "funcall_class_or_instance_method_with_13_args", "FUNCALL-CLASS-OR-INSTANCE-METHOD-WITH-13-ARGS", 15, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.methods", "funcall_class_or_instance_method_with_14_args", "FUNCALL-CLASS-OR-INSTANCE-METHOD-WITH-14-ARGS", 16, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.methods", "funcall_class_or_instance_method_with_15_args", "FUNCALL-CLASS-OR-INSTANCE-METHOD-WITH-15-ARGS", 17, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.methods", "funcall_class_or_instance_method_with_16_args", "FUNCALL-CLASS-OR-INSTANCE-METHOD-WITH-16-ARGS", 18, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.methods", "funcall_class_or_instance_method_with_17_args", "FUNCALL-CLASS-OR-INSTANCE-METHOD-WITH-17-ARGS", 19, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.methods", "funcall_class_or_instance_method_with_18_args", "FUNCALL-CLASS-OR-INSTANCE-METHOD-WITH-18-ARGS", 20, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.methods", "funcall_class_or_instance_method_with_19_args", "FUNCALL-CLASS-OR-INSTANCE-METHOD-WITH-19-ARGS", 21, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.methods", "funcall_class_or_instance_method_with_20_args", "FUNCALL-CLASS-OR-INSTANCE-METHOD-WITH-20-ARGS", 22, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.methods", "safe_funcall_instance_method_with_0_args", "SAFE-FUNCALL-INSTANCE-METHOD-WITH-0-ARGS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.methods", "safe_funcall_instance_method_with_1_args", "SAFE-FUNCALL-INSTANCE-METHOD-WITH-1-ARGS", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.methods", "safe_funcall_instance_method_with_2_args", "SAFE-FUNCALL-INSTANCE-METHOD-WITH-2-ARGS", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.methods", "safe_funcall_instance_method_with_3_args", "SAFE-FUNCALL-INSTANCE-METHOD-WITH-3-ARGS", 5, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.methods", "safe_funcall_instance_method_with_4_args", "SAFE-FUNCALL-INSTANCE-METHOD-WITH-4-ARGS", 6, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.methods", "safe_funcall_instance_method_with_5_args", "SAFE-FUNCALL-INSTANCE-METHOD-WITH-5-ARGS", 7, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.methods", "safe_funcall_instance_method_with_6_args", "SAFE-FUNCALL-INSTANCE-METHOD-WITH-6-ARGS", 8, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.methods", "safe_funcall_instance_method_with_7_args", "SAFE-FUNCALL-INSTANCE-METHOD-WITH-7-ARGS", 9, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.methods", "safe_funcall_instance_method_with_8_args", "SAFE-FUNCALL-INSTANCE-METHOD-WITH-8-ARGS", 10, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.methods", "safe_funcall_instance_method_with_9_args", "SAFE-FUNCALL-INSTANCE-METHOD-WITH-9-ARGS", 11, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.methods", "safe_funcall_instance_method_with_10_args", "SAFE-FUNCALL-INSTANCE-METHOD-WITH-10-ARGS", 12, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.methods", "safe_funcall_instance_method_with_11_args", "SAFE-FUNCALL-INSTANCE-METHOD-WITH-11-ARGS", 13, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.methods", "safe_funcall_instance_method_with_12_args", "SAFE-FUNCALL-INSTANCE-METHOD-WITH-12-ARGS", 14, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.methods", "safe_funcall_instance_method_with_13_args", "SAFE-FUNCALL-INSTANCE-METHOD-WITH-13-ARGS", 15, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.methods", "safe_funcall_instance_method_with_14_args", "SAFE-FUNCALL-INSTANCE-METHOD-WITH-14-ARGS", 16, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.methods", "safe_funcall_instance_method_with_15_args", "SAFE-FUNCALL-INSTANCE-METHOD-WITH-15-ARGS", 17, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.methods", "safe_funcall_instance_method_with_16_args", "SAFE-FUNCALL-INSTANCE-METHOD-WITH-16-ARGS", 18, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.methods", "safe_funcall_instance_method_with_17_args", "SAFE-FUNCALL-INSTANCE-METHOD-WITH-17-ARGS", 19, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.methods", "safe_funcall_instance_method_with_18_args", "SAFE-FUNCALL-INSTANCE-METHOD-WITH-18-ARGS", 20, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.methods", "safe_funcall_instance_method_with_19_args", "SAFE-FUNCALL-INSTANCE-METHOD-WITH-19-ARGS", 21, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.methods", "safe_funcall_instance_method_with_20_args", "SAFE-FUNCALL-INSTANCE-METHOD-WITH-20-ARGS", 22, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.methods", "safe_funcall_instance_super_method_with_0_args", "SAFE-FUNCALL-INSTANCE-SUPER-METHOD-WITH-0-ARGS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.methods", "safe_funcall_instance_super_method_with_1_args", "SAFE-FUNCALL-INSTANCE-SUPER-METHOD-WITH-1-ARGS", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.methods", "safe_funcall_instance_super_method_with_2_args", "SAFE-FUNCALL-INSTANCE-SUPER-METHOD-WITH-2-ARGS", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.methods", "safe_funcall_instance_super_method_with_3_args", "SAFE-FUNCALL-INSTANCE-SUPER-METHOD-WITH-3-ARGS", 5, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.methods", "safe_funcall_instance_super_method_with_4_args", "SAFE-FUNCALL-INSTANCE-SUPER-METHOD-WITH-4-ARGS", 6, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.methods", "safe_funcall_instance_super_method_with_5_args", "SAFE-FUNCALL-INSTANCE-SUPER-METHOD-WITH-5-ARGS", 7, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.methods", "safe_funcall_instance_super_method_with_6_args", "SAFE-FUNCALL-INSTANCE-SUPER-METHOD-WITH-6-ARGS", 8, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.methods", "safe_funcall_instance_super_method_with_7_args", "SAFE-FUNCALL-INSTANCE-SUPER-METHOD-WITH-7-ARGS", 9, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.methods", "safe_funcall_instance_super_method_with_8_args", "SAFE-FUNCALL-INSTANCE-SUPER-METHOD-WITH-8-ARGS", 10, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.methods", "safe_funcall_instance_super_method_with_9_args", "SAFE-FUNCALL-INSTANCE-SUPER-METHOD-WITH-9-ARGS", 11, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.methods", "safe_funcall_instance_super_method_with_10_args", "SAFE-FUNCALL-INSTANCE-SUPER-METHOD-WITH-10-ARGS", 12, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.methods", "safe_funcall_instance_super_method_with_11_args", "SAFE-FUNCALL-INSTANCE-SUPER-METHOD-WITH-11-ARGS", 13, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.methods", "safe_funcall_instance_super_method_with_12_args", "SAFE-FUNCALL-INSTANCE-SUPER-METHOD-WITH-12-ARGS", 14, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.methods", "safe_funcall_instance_super_method_with_13_args", "SAFE-FUNCALL-INSTANCE-SUPER-METHOD-WITH-13-ARGS", 15, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.methods", "safe_funcall_instance_super_method_with_14_args", "SAFE-FUNCALL-INSTANCE-SUPER-METHOD-WITH-14-ARGS", 16, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.methods", "safe_funcall_instance_super_method_with_15_args", "SAFE-FUNCALL-INSTANCE-SUPER-METHOD-WITH-15-ARGS", 17, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.methods", "safe_funcall_instance_super_method_with_16_args", "SAFE-FUNCALL-INSTANCE-SUPER-METHOD-WITH-16-ARGS", 18, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.methods", "safe_funcall_instance_super_method_with_17_args", "SAFE-FUNCALL-INSTANCE-SUPER-METHOD-WITH-17-ARGS", 19, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.methods", "safe_funcall_instance_super_method_with_18_args", "SAFE-FUNCALL-INSTANCE-SUPER-METHOD-WITH-18-ARGS", 20, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.methods", "safe_funcall_instance_super_method_with_19_args", "SAFE-FUNCALL-INSTANCE-SUPER-METHOD-WITH-19-ARGS", 21, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.methods", "safe_funcall_instance_super_method_with_20_args", "SAFE-FUNCALL-INSTANCE-SUPER-METHOD-WITH-20-ARGS", 22, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.methods", "safe_funcall_class_or_instance_method_with_0_args", "SAFE-FUNCALL-CLASS-OR-INSTANCE-METHOD-WITH-0-ARGS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.methods", "safe_funcall_class_or_instance_method_with_1_args", "SAFE-FUNCALL-CLASS-OR-INSTANCE-METHOD-WITH-1-ARGS", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.methods", "safe_funcall_class_or_instance_method_with_2_args", "SAFE-FUNCALL-CLASS-OR-INSTANCE-METHOD-WITH-2-ARGS", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.methods", "safe_funcall_class_or_instance_method_with_3_args", "SAFE-FUNCALL-CLASS-OR-INSTANCE-METHOD-WITH-3-ARGS", 5, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.methods", "safe_funcall_class_or_instance_method_with_4_args", "SAFE-FUNCALL-CLASS-OR-INSTANCE-METHOD-WITH-4-ARGS", 6, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.methods", "safe_funcall_class_or_instance_method_with_5_args", "SAFE-FUNCALL-CLASS-OR-INSTANCE-METHOD-WITH-5-ARGS", 7, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.methods", "safe_funcall_class_or_instance_method_with_6_args", "SAFE-FUNCALL-CLASS-OR-INSTANCE-METHOD-WITH-6-ARGS", 8, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.methods", "safe_funcall_class_or_instance_method_with_7_args", "SAFE-FUNCALL-CLASS-OR-INSTANCE-METHOD-WITH-7-ARGS", 9, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.methods", "safe_funcall_class_or_instance_method_with_8_args", "SAFE-FUNCALL-CLASS-OR-INSTANCE-METHOD-WITH-8-ARGS", 10, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.methods", "safe_funcall_class_or_instance_method_with_9_args", "SAFE-FUNCALL-CLASS-OR-INSTANCE-METHOD-WITH-9-ARGS", 11, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.methods", "safe_funcall_class_or_instance_method_with_10_args", "SAFE-FUNCALL-CLASS-OR-INSTANCE-METHOD-WITH-10-ARGS", 12, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.methods", "safe_funcall_class_or_instance_method_with_11_args", "SAFE-FUNCALL-CLASS-OR-INSTANCE-METHOD-WITH-11-ARGS", 13, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.methods", "safe_funcall_class_or_instance_method_with_12_args", "SAFE-FUNCALL-CLASS-OR-INSTANCE-METHOD-WITH-12-ARGS", 14, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.methods", "safe_funcall_class_or_instance_method_with_13_args", "SAFE-FUNCALL-CLASS-OR-INSTANCE-METHOD-WITH-13-ARGS", 15, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.methods", "safe_funcall_class_or_instance_method_with_14_args", "SAFE-FUNCALL-CLASS-OR-INSTANCE-METHOD-WITH-14-ARGS", 16, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.methods", "safe_funcall_class_or_instance_method_with_15_args", "SAFE-FUNCALL-CLASS-OR-INSTANCE-METHOD-WITH-15-ARGS", 17, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.methods", "safe_funcall_class_or_instance_method_with_16_args", "SAFE-FUNCALL-CLASS-OR-INSTANCE-METHOD-WITH-16-ARGS", 18, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.methods", "safe_funcall_class_or_instance_method_with_17_args", "SAFE-FUNCALL-CLASS-OR-INSTANCE-METHOD-WITH-17-ARGS", 19, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.methods", "safe_funcall_class_or_instance_method_with_18_args", "SAFE-FUNCALL-CLASS-OR-INSTANCE-METHOD-WITH-18-ARGS", 20, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.methods", "safe_funcall_class_or_instance_method_with_19_args", "SAFE-FUNCALL-CLASS-OR-INSTANCE-METHOD-WITH-19-ARGS", 21, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.methods", "safe_funcall_class_or_instance_method_with_20_args", "SAFE-FUNCALL-CLASS-OR-INSTANCE-METHOD-WITH-20-ARGS", 22, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.methods", "resolve_method", "RESOLVE-METHOD", 2, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.methods", "quote_method", "QUOTE-METHOD");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.methods", "fquote_method", "FQUOTE-METHOD");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.methods", "method_name_to_function_name", "METHOD-NAME-TO-FUNCTION-NAME", 2, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.methods", "inline_method", "INLINE-METHOD");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.methods", "inline_super_method", "INLINE-SUPER-METHOD");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.methods", "methods_inline_method_calls_internal", "METHODS-INLINE-METHOD-CALLS-INTERNAL", 4, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.methods", "methods_inline_method_calls", "METHODS-INLINE-METHOD-CALLS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.methods", "methods_transform_setq_for_auto_update_private", "METHODS-TRANSFORM-SETQ-FOR-AUTO-UPDATE-PRIVATE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.methods", "methods_transform_cinc_or_cdec_for_auto_update_private", "METHODS-TRANSFORM-CINC-OR-CDEC-FOR-AUTO-UPDATE-PRIVATE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.methods", "methods_transform_cpop_for_auto_update_private", "METHODS-TRANSFORM-CPOP-FOR-AUTO-UPDATE-PRIVATE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.methods", "methods_transform_cpush_or_cpushnew_for_auto_update_private", "METHODS-TRANSFORM-CPUSH-OR-CPUSHNEW-FOR-AUTO-UPDATE-PRIVATE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.methods", "methods_transform_cmultiple_value_setq_for_auto_update_private", "METHODS-TRANSFORM-CMULTIPLE-VALUE-SETQ-FOR-AUTO-UPDATE-PRIVATE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.methods", "methods_transform_setqs_for_auto_update_private", "METHODS-TRANSFORM-SETQS-FOR-AUTO-UPDATE-PRIVATE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.methods", "methods_transform_setqs_for_auto_update", "METHODS-TRANSFORM-SETQS-FOR-AUTO-UPDATE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.methods", "methods_substitute_ret_forms_with_throw_to_tag", "METHODS-SUBSTITUTE-RET-FORMS-WITH-THROW-TO-TAG", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.methods", "methods_lambda_list_to_listed_arg_value_expression", "METHODS-LAMBDA-LIST-TO-LISTED-ARG-VALUE-EXPRESSION", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.methods", "generate_instance_variable_bindings_for_instance", "GENERATE-INSTANCE-VARIABLE-BINDINGS-FOR-INSTANCE", 7, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.methods", "methods_create_instance_method_decl", "METHODS-CREATE-INSTANCE-METHOD-DECL", 5, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.methods", "methods_generate_instance_function_definition", "METHODS-GENERATE-INSTANCE-FUNCTION-DEFINITION", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.methods", "methods_create_class_method_decl", "METHODS-CREATE-CLASS-METHOD-DECL", 5, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.methods", "methods_generate_class_function_definition", "METHODS-GENERATE-CLASS-FUNCTION-DEFINITION", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.methods", "methods_get_method", "METHODS-GET-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.methods", "methods_get_all_method_names", "METHODS-GET-ALL-METHOD-NAMES", 1, 0, false);
        return (SubLObject)methods.NIL;
    }
    
    public static SubLObject init_methods_file() {
        methods.$methods_insert_trace_code_p$ = SubLFiles.defvar("*METHODS-INSERT-TRACE-CODE-P*", (SubLObject)methods.NIL);
        methods.$methods_block_tracing$ = SubLFiles.defparameter("*METHODS-BLOCK-TRACING*", (SubLObject)methods.NIL);
        methods.$methods_tracing_format_strings_vector_size$ = SubLFiles.defconstant("*METHODS-TRACING-FORMAT-STRINGS-VECTOR-SIZE*", (SubLObject)methods.ELEVEN_INTEGER);
        methods.$methods_tracing_format_strings$ = SubLFiles.defvar("*METHODS-TRACING-FORMAT-STRINGS*", Vectors.make_vector(methods.$methods_tracing_format_strings_vector_size$.getGlobalValue(), (SubLObject)methods.UNPROVIDED));
        methods.$methods_trace_depth$ = SubLFiles.defparameter("*METHODS-TRACE-DEPTH*", (SubLObject)methods.ZERO_INTEGER);
        methods.$methods_protection_levels$ = SubLFiles.defparameter("*METHODS-PROTECTION-LEVELS*", (SubLObject)methods.$list24);
        methods.$methods_scope_levels$ = SubLFiles.defparameter("*METHODS-SCOPE-LEVELS*", (SubLObject)methods.$list25);
        methods.$valid_method_listener_types$ = SubLFiles.defconstant("*VALID-METHOD-LISTENER-TYPES*", (SubLObject)methods.$list26);
        methods.$methods_scope_special_forms$ = SubLFiles.defparameter("*METHODS-SCOPE-SPECIAL-FORMS*", (SubLObject)methods.$list34);
        methods.$report_default_method_callsP$ = SubLFiles.defparameter("*REPORT-DEFAULT-METHOD-CALLS?*", (SubLObject)methods.NIL);
        return (SubLObject)methods.NIL;
    }
    
    public static SubLObject setup_methods_file() {
        enumerations.enumerations_incorporate_definition((SubLObject)methods.$sym27$METHOD_LISTENER_TYPE, (SubLObject)methods.$list26);
        access_macros.register_macro_helper((SubLObject)methods.$sym57$SUBLOOP_REGISTER_INSTANCE_METHOD, (SubLObject)methods.$sym54$DEF_INSTANCE_METHOD);
        access_macros.register_macro_helper((SubLObject)methods.$sym65$SUBLOOP_REGISTER_CLASS_METHOD, (SubLObject)methods.$sym63$DEF_CLASS_METHOD);
        return (SubLObject)methods.NIL;
    }
    
    @Override
	public void declareFunctions() {
        declare_methods_file();
    }
    
    @Override
	public void initializeVariables() {
        init_methods_file();
    }
    
    @Override
	public void runTopLevelForms() {
        setup_methods_file();
    }
    
    static {
        me = (SubLFile)new methods();
        methods.$methods_insert_trace_code_p$ = null;
        methods.$methods_block_tracing$ = null;
        methods.$methods_tracing_format_strings_vector_size$ = null;
        methods.$methods_tracing_format_strings$ = null;
        methods.$methods_trace_depth$ = null;
        methods.$methods_protection_levels$ = null;
        methods.$methods_scope_levels$ = null;
        methods.$valid_method_listener_types$ = null;
        methods.$methods_scope_special_forms$ = null;
        methods.$report_default_method_callsP$ = null;
        $str0$__S__S__ = SubLObjectFactory.makeString("(~S ~S)(");
        $str1$_S = SubLObjectFactory.makeString("~S");
        $str2$__S = SubLObjectFactory.makeString(" ~S");
        $str3$_ = SubLObjectFactory.makeString(")");
        $str4$_S___enter__ = SubLObjectFactory.makeString("~S: <enter> ");
        $str5$_S___exit____S__S______S = SubLObjectFactory.makeString("~S: <exit> (~S ~S) -> ~S");
        $str6$__ = SubLObjectFactory.makeString("  ");
        $sym7$_OPTIONAL = SubLObjectFactory.makeSymbol("&OPTIONAL");
        $sym8$PUNLESS = SubLObjectFactory.makeSymbol("PUNLESS");
        $sym9$_METHODS_BLOCK_TRACING_ = SubLObjectFactory.makeSymbol("*METHODS-BLOCK-TRACING*");
        $sym10$CUNWIND_PROTECT = SubLObjectFactory.makeSymbol("CUNWIND-PROTECT");
        $sym11$PROGN = SubLObjectFactory.makeSymbol("PROGN");
        $list12 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("*METHODS-BLOCK-TRACING*"), (SubLObject)methods.T);
        $list13 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TERPRI"), (SubLObject)SubLObjectFactory.makeSymbol("*STANDARD-OUTPUT*"));
        $list14 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("METHODS-TRACING-TAB"), (SubLObject)SubLObjectFactory.makeSymbol("*STANDARD-OUTPUT*"), (SubLObject)SubLObjectFactory.makeSymbol("*METHODS-TRACE-DEPTH*"));
        $sym15$FORMAT = SubLObjectFactory.makeSymbol("FORMAT");
        $sym16$_STANDARD_OUTPUT_ = SubLObjectFactory.makeSymbol("*STANDARD-OUTPUT*");
        $sym17$_METHODS_TRACE_DEPTH_ = SubLObjectFactory.makeSymbol("*METHODS-TRACE-DEPTH*");
        $sym18$QUOTE = SubLObjectFactory.makeSymbol("QUOTE");
        $list19 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("*METHODS-BLOCK-TRACING*"), (SubLObject)methods.NIL));
        $list20 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CINC"), (SubLObject)SubLObjectFactory.makeSymbol("*METHODS-TRACE-DEPTH*")));
        $list21 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("METHOD-NAME"), (SubLObject)SubLObjectFactory.makeSymbol("INSTANCE"), (SubLObject)SubLObjectFactory.makeSymbol("ARGS"));
        $list22 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CDEC"), (SubLObject)SubLObjectFactory.makeSymbol("*METHODS-TRACE-DEPTH*"));
        $list23 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("METHOD-NAME"), (SubLObject)SubLObjectFactory.makeSymbol("INSTANCE"), (SubLObject)SubLObjectFactory.makeSymbol("RESULT"));
        $list24 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("PRIVATE"), (SubLObject)SubLObjectFactory.makeKeyword("PROTECTED"), (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC"));
        $list25 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("FILE-SCOPE"), (SubLObject)SubLObjectFactory.makeKeyword("SYSTEM-SCOPE"), (SubLObject)SubLObjectFactory.makeKeyword("GLOBAL-SCOPE"));
        $list26 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("BEFORE-LISTENERS"), (SubLObject)SubLObjectFactory.makeKeyword("AFTER-LISTENERS"));
        $sym27$METHOD_LISTENER_TYPE = SubLObjectFactory.makeSymbol("METHOD-LISTENER-TYPE");
        $str28$_S___S_is_not_a_member_of_the__S_ = SubLObjectFactory.makeString("~S: ~S is not a member of the ~S enumeration.");
        $sym29$ENCODE_METHOD_LISTENER_TYPE = SubLObjectFactory.makeSymbol("ENCODE-METHOD-LISTENER-TYPE");
        $str30$_S___S_is_not_a_valid_encoding_of = SubLObjectFactory.makeString("~S: ~S is not a valid encoding of the ~S enumeration.");
        $sym31$DECODE_METHOD_LISTENER_TYPE = SubLObjectFactory.makeSymbol("DECODE-METHOD-LISTENER-TYPE");
        $str32$_S___S_was_expected_to_be_a_membe = SubLObjectFactory.makeString("~S: ~S was expected to be a member of the enumeration ~S.");
        $sym33$METHOD_LISTENER_TYPE_P = SubLObjectFactory.makeSymbol("METHOD-LISTENER-TYPE-P");
        $list34 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEFINE-PRIVATE"), (SubLObject)SubLObjectFactory.makeSymbol("DEFINE-PROTECTED"), (SubLObject)SubLObjectFactory.makeSymbol("DEFINE-PUBLIC"));
        $kw35$PRIVATE = SubLObjectFactory.makeKeyword("PRIVATE");
        $kw36$PROTECTED = SubLObjectFactory.makeKeyword("PROTECTED");
        $kw37$PUBLIC = SubLObjectFactory.makeKeyword("PUBLIC");
        $kw38$FILE_SCOPE = SubLObjectFactory.makeKeyword("FILE-SCOPE");
        $kw39$SYSTEM_SCOPE = SubLObjectFactory.makeKeyword("SYSTEM-SCOPE");
        $kw40$GLOBAL_SCOPE = SubLObjectFactory.makeKeyword("GLOBAL-SCOPE");
        $kw41$AUTO_UPDATE = SubLObjectFactory.makeKeyword("AUTO-UPDATE");
        $kw42$NO_MEMBER_VARIABLES = SubLObjectFactory.makeKeyword("NO-MEMBER-VARIABLES");
        $kw43$READ_ONLY = SubLObjectFactory.makeKeyword("READ-ONLY");
        $kw44$BEFORE_LISTENERS = SubLObjectFactory.makeKeyword("BEFORE-LISTENERS");
        $kw45$AFTER_LISTENERS = SubLObjectFactory.makeKeyword("AFTER-LISTENERS");
        $kw46$INSTANTIATE_TEMPLATE = SubLObjectFactory.makeKeyword("INSTANTIATE-TEMPLATE");
        $kw47$DEFAULT = SubLObjectFactory.makeKeyword("DEFAULT");
        $str48$_ = SubLObjectFactory.makeString("-");
        $str49$_METHOD = SubLObjectFactory.makeString("-METHOD");
        $str50$_S___S_is_not_a_valid_method_spec = SubLObjectFactory.makeString("~S: ~S is not a valid method specification.~%~\n     A valid method specification matches the pattern (<method name> <class name> . <method properties>).");
        $str51$_S___S_is_not_a_valid_method_name = SubLObjectFactory.makeString("~S: ~S is not a valid method name.  Only a non-null symbol is a valid method name.");
        $str52$_S__While_defining_method__S___S_ = SubLObjectFactory.makeString("~S: While defining method ~S, ~S is not a valid class name.  Only a non-null symbol is a valid class name.");
        $list53 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("METHOD-SPEC"), (SubLObject)SubLObjectFactory.makeSymbol("LAMBDA-LIST"), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $sym54$DEF_INSTANCE_METHOD = SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD");
        $list55 = ConsesLow.listS((SubLObject)SubLObjectFactory.makeSymbol("METHOD-NAME"), (SubLObject)SubLObjectFactory.makeSymbol("CLASS-NAME"), (SubLObject)SubLObjectFactory.makeSymbol("METHOD-PROPERTIES"));
        $sym56$METHODS_INCORPORATE_INSTANCE_METHOD = SubLObjectFactory.makeSymbol("METHODS-INCORPORATE-INSTANCE-METHOD");
        $sym57$SUBLOOP_REGISTER_INSTANCE_METHOD = SubLObjectFactory.makeSymbol("SUBLOOP-REGISTER-INSTANCE-METHOD");
        $sym58$PWHEN = SubLObjectFactory.makeSymbol("PWHEN");
        $sym59$_REPORT_DEFAULT_METHOD_CALLS__ = SubLObjectFactory.makeSymbol("*REPORT-DEFAULT-METHOD-CALLS?*");
        $sym60$WARN = SubLObjectFactory.makeSymbol("WARN");
        $str61$Default_method_call__a_on_class__ = SubLObjectFactory.makeString("Default method call ~a on class ~a");
        $str62$DEF_INSTANCE_METHOD___S_is_not_th = SubLObjectFactory.makeString("DEF-INSTANCE-METHOD: ~S is not the name of a class.");
        $sym63$DEF_CLASS_METHOD = SubLObjectFactory.makeSymbol("DEF-CLASS-METHOD");
        $sym64$METHODS_INCORPORATE_CLASS_METHOD = SubLObjectFactory.makeSymbol("METHODS-INCORPORATE-CLASS-METHOD");
        $sym65$SUBLOOP_REGISTER_CLASS_METHOD = SubLObjectFactory.makeSymbol("SUBLOOP-REGISTER-CLASS-METHOD");
        $str66$DEF_CLASS_METHOD___S_is_not_the_n = SubLObjectFactory.makeString("DEF-CLASS-METHOD: ~S is not the name of a class.");
        $str67$FUNCALL_CLASS_METHOD___S_is_not_a = SubLObjectFactory.makeString("FUNCALL-CLASS-METHOD: ~S is not a defined class.");
        $str68$FUNCALL_CLASS_METHOD___S_is_not_a = SubLObjectFactory.makeString("FUNCALL-CLASS-METHOD: ~S is not a method of class ~S.");
        $str69$FUNCALL_CLASS_SUPER_METHOD___S_is = SubLObjectFactory.makeString("FUNCALL-CLASS-SUPER-METHOD: ~S is not a defined class.");
        $str70$FUNCALL_CLASS_SUPER_METHOD___S_is = SubLObjectFactory.makeString("FUNCALL-CLASS-SUPER-METHOD: ~S is not a method of class ~S.");
        $kw71$TARGET_NOT_A_CLASS = SubLObjectFactory.makeKeyword("TARGET-NOT-A-CLASS");
        $kw72$INVALID_METHOD_NAME = SubLObjectFactory.makeKeyword("INVALID-METHOD-NAME");
        $kw73$UNDECLARED_METHOD = SubLObjectFactory.makeKeyword("UNDECLARED-METHOD");
        $kw74$ACCESS_LEVEL_CONFLICT = SubLObjectFactory.makeKeyword("ACCESS-LEVEL-CONFLICT");
        $kw75$UNDEFINED_METHOD = SubLObjectFactory.makeKeyword("UNDEFINED-METHOD");
        $str76$__FUNCALL_INSTANCE_METHOD__either = SubLObjectFactory.makeString("~%FUNCALL-INSTANCE-METHOD: either instance ~S or method ~S are invalid.");
        $str77$__FUNCALL_CLASS_OR_INSTANCE_METHO = SubLObjectFactory.makeString("~%FUNCALL-CLASS-OR-INSTANCE-METHOD: Method ~S is invalid.");
        $str78$FUNCALL_CLASS_OR_INSTANCE_METHOD_ = SubLObjectFactory.makeString("FUNCALL-CLASS-OR-INSTANCE-METHOD: ~S is not a valid class.");
        $kw79$TARGET_NOT_AN_INSTANCE = SubLObjectFactory.makeKeyword("TARGET-NOT-AN-INSTANCE");
        $str80$RESOLVE_METHOD___S_is_not_a_defin = SubLObjectFactory.makeString("RESOLVE-METHOD: ~S is not a defined class.");
        $str81$RESOLVE_METHOD___S_is_not_a_defin = SubLObjectFactory.makeString("RESOLVE-METHOD: ~S is not a defined method of class ~S.");
        $list82 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("METHOD-NAME"), (SubLObject)SubLObjectFactory.makeSymbol("CLASS-NAME")));
        $list83 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("METHOD-NAME"), (SubLObject)SubLObjectFactory.makeSymbol("CLASS-NAME")), (SubLObject)SubLObjectFactory.makeSymbol("CLASS-OR-INSTANCE"), (SubLObject)SubLObjectFactory.makeSymbol("&REST"), (SubLObject)SubLObjectFactory.makeSymbol("ARGS"));
        $sym84$FUNCALL_INSTANCE_METHOD = SubLObjectFactory.makeSymbol("FUNCALL-INSTANCE-METHOD");
        $sym85$FUNCALL_INSTANCE_SUPER_METHOD = SubLObjectFactory.makeSymbol("FUNCALL-INSTANCE-SUPER-METHOD");
        $sym86$SELF = SubLObjectFactory.makeSymbol("SELF");
        $sym87$INLINE_METHOD = SubLObjectFactory.makeSymbol("INLINE-METHOD");
        $sym88$SUPER = SubLObjectFactory.makeSymbol("SUPER");
        $sym89$INLINE_SUPER_METHOD = SubLObjectFactory.makeSymbol("INLINE-SUPER-METHOD");
        $sym90$CSETQ = SubLObjectFactory.makeSymbol("CSETQ");
        $sym91$CMULTIPLE_VALUE_SETQ = SubLObjectFactory.makeSymbol("CMULTIPLE-VALUE-SETQ");
        $list92 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("CSETF"));
        $sym93$CPOP = SubLObjectFactory.makeSymbol("CPOP");
        $list94 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CINC"), (SubLObject)SubLObjectFactory.makeSymbol("CDEC"));
        $list95 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CPUSH"), (SubLObject)SubLObjectFactory.makeSymbol("CPUSHNEW"));
        $sym96$RET = SubLObjectFactory.makeSymbol("RET");
        $sym97$THROW = SubLObjectFactory.makeSymbol("THROW");
        $sym98$LIST = SubLObjectFactory.makeSymbol("LIST");
        $str99$OUTER_CATCH_FOR_ = SubLObjectFactory.makeString("OUTER-CATCH-FOR-");
        $str100$METHOD = SubLObjectFactory.makeString("METHOD");
        $str101$CATCH_VAR_FOR_ = SubLObjectFactory.makeString("CATCH-VAR-FOR-");
        $str102$LISTED_ARGS = SubLObjectFactory.makeString("LISTED-ARGS");
        $sym103$CLET = SubLObjectFactory.makeSymbol("CLET");
        $list104 = ConsesLow.list((SubLObject)methods.NIL);
        $sym105$CCATCH = SubLObjectFactory.makeSymbol("CCATCH");
        $sym106$METHOD_LISTENERS_INVOKE_BEFORE_LISTENERS = SubLObjectFactory.makeSymbol("METHOD-LISTENERS-INVOKE-BEFORE-LISTENERS");
        $sym107$METHOD_LISTENERS_INVOKE_AFTER_LISTENERS = SubLObjectFactory.makeSymbol("METHOD-LISTENERS-INVOKE-AFTER-LISTENERS");
        $sym108$DEFINE_PUBLIC = SubLObjectFactory.makeSymbol("DEFINE-PUBLIC");
        $list109 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("IGNORE"), (SubLObject)SubLObjectFactory.makeSymbol("SELF")));
        $sym110$DEFINE_PRIVATE = SubLObjectFactory.makeSymbol("DEFINE-PRIVATE");
        $sym111$DEFINE_PROTECTED = SubLObjectFactory.makeSymbol("DEFINE-PROTECTED");
        $list112 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PWHEN"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("INSTANCE-P"), (SubLObject)SubLObjectFactory.makeSymbol("SELF")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("INSTANCE-CLASS"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"))));
    }
}

/*

	Total time: 1740 ms
	
*/