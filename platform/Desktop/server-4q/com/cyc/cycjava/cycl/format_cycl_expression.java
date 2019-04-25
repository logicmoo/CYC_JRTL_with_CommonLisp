package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.cycjava.cycl.cyc_testing.generic_testing;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.StreamsLow;
import com.cyc.cycjava.cycl.owl.owlification;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class format_cycl_expression extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.format_cycl_expression";
    public static final String myFingerPrint = "fbc878f5940ca3ed6c5bc3629c937a3a201b2e066bc35c293f44aa051a54c615";
    @SubLTranslatedFile.SubL(source = "cycl/format-cycl-expression.lisp", position = 2949L)
    public static SubLSymbol $format_cycl_expression_newline_method$;
    @SubLTranslatedFile.SubL(source = "cycl/format-cycl-expression.lisp", position = 3037L)
    public static SubLSymbol $format_cycl_expression_indent_method$;
    @SubLTranslatedFile.SubL(source = "cycl/format-cycl-expression.lisp", position = 3698L)
    public static SubLSymbol $format_cycl_expression_atom_method_table$;
    @SubLTranslatedFile.SubL(source = "cycl/format-cycl-expression.lisp", position = 3945L)
    public static SubLSymbol $format_cycl_expression_constant_method$;
    @SubLTranslatedFile.SubL(source = "cycl/format-cycl-expression.lisp", position = 4310L)
    public static SubLSymbol $format_cycl_expression_nat_method$;
    @SubLTranslatedFile.SubL(source = "cycl/format-cycl-expression.lisp", position = 4766L)
    public static SubLSymbol $format_cycl_expression_assertion_method$;
    private static final SubLSymbol $sym0$GET_PRETTY_FORMATTED_STRING;
    private static final SubLString $str1$_;
    private static final SubLString $str2$_;
    private static final SubLString $str3$___;
    private static final SubLString $str4$_;
    private static final SubLSymbol $sym5$TERPRI;
    private static final SubLSymbol $sym6$FORMAT_CYCL_EXPRESSION_DEFAULT_INDENT;
    private static final SubLInteger $int7$256;
    private static final SubLSymbol $sym8$FORMAT_CYCL_EXPRESSION_ATOM_CONSTANT_METHOD;
    private static final SubLSymbol $sym9$FORMAT_CYCL_EXPRESSION_ATOM_NART_METHOD;
    private static final SubLSymbol $sym10$FORMAT_CYCL_EXPRESSION_ATOM_ASSERTION_METHOD;
    private static final SubLSymbol $kw11$TEST;
    private static final SubLSymbol $kw12$OWNER;
    private static final SubLSymbol $kw13$CLASSES;
    private static final SubLSymbol $kw14$KB;
    private static final SubLSymbol $kw15$FULL;
    private static final SubLSymbol $kw16$WORKING_;
    private static final SubLList $list17;
    
    @SubLTranslatedFile.SubL(source = "cycl/format-cycl-expression.lisp", position = 1050L)
    public static SubLObject get_pretty_formatted_string(final SubLObject obj, SubLObject include_constant_reader_prefix, SubLObject wrap_lines) {
        if (include_constant_reader_prefix == format_cycl_expression.UNPROVIDED) {
            include_constant_reader_prefix = (SubLObject)format_cycl_expression.NIL;
        }
        if (wrap_lines == format_cycl_expression.UNPROVIDED) {
            wrap_lines = (SubLObject)format_cycl_expression.NIL;
        }
        final SubLObject depth = (SubLObject)((format_cycl_expression.NIL != wrap_lines) ? format_cycl_expression.ZERO_INTEGER : format_cycl_expression.NIL);
        SubLObject s = format_cycl_expression_to_string(obj, depth);
        if (format_cycl_expression.NIL == include_constant_reader_prefix) {
            s = owlification.strip_hl_artifacts(s);
        }
        s = string_utilities.left_trim_whitespace(s);
        return s;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/format-cycl-expression.lisp", position = 1512L)
    public static SubLObject format_cycl_expression(final SubLObject expression, SubLObject stream, SubLObject depth) {
        if (stream == format_cycl_expression.UNPROVIDED) {
            stream = StreamsLow.$standard_output$.getDynamicValue();
        }
        if (depth == format_cycl_expression.UNPROVIDED) {
            depth = (SubLObject)format_cycl_expression.ZERO_INTEGER;
        }
        return format_cycl_expression_recursive(expression, stream, depth);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/format-cycl-expression.lisp", position = 1866L)
    public static SubLObject format_cycl_expression_to_string(final SubLObject expression, SubLObject depth) {
        if (depth == format_cycl_expression.UNPROVIDED) {
            depth = (SubLObject)format_cycl_expression.ZERO_INTEGER;
        }
        SubLObject result = (SubLObject)format_cycl_expression.NIL;
        SubLObject stream = (SubLObject)format_cycl_expression.NIL;
        try {
            stream = streams_high.make_private_string_output_stream();
            format_cycl_expression(expression, stream, depth);
            result = streams_high.get_output_stream_string(stream);
        }
        finally {
            final SubLObject _prev_bind_0 = Dynamic.currentBinding(Threads.$is_thread_performing_cleanupP$);
            try {
                Dynamic.bind(Threads.$is_thread_performing_cleanupP$, (SubLObject)format_cycl_expression.T);
                final SubLObject _values = Values.getValuesAsVector();
                streams_high.close(stream, (SubLObject)format_cycl_expression.UNPROVIDED);
                Values.restoreValuesFromVector(_values);
            }
            finally {
                Dynamic.rebind(Threads.$is_thread_performing_cleanupP$, _prev_bind_0);
            }
        }
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/format-cycl-expression.lisp", position = 2245L)
    public static SubLObject format_cycl_expression_recursive(final SubLObject expression, final SubLObject stream, final SubLObject depth) {
        if (expression.isAtom()) {
            format_cycl_expression_atom(expression, stream, depth);
        }
        else {
            format_cycl_expression_indent(stream, depth);
            print_high.princ((SubLObject)format_cycl_expression.$str1$_, stream);
            format_cycl_expression_recursive(expression.first(), stream, (SubLObject)format_cycl_expression.NIL);
            SubLObject rest;
            for (rest = (SubLObject)format_cycl_expression.NIL, rest = expression.rest(); rest.isCons(); rest = rest.rest()) {
                print_high.princ((SubLObject)format_cycl_expression.$str2$_, stream);
                format_cycl_expression_recursive(rest.first(), stream, (SubLObject)(depth.isInteger() ? Numbers.add(depth, (SubLObject)format_cycl_expression.ONE_INTEGER) : format_cycl_expression.NIL));
            }
            if (format_cycl_expression.NIL != rest) {
                print_high.princ((SubLObject)format_cycl_expression.$str3$___, stream);
                format_cycl_expression_recursive(rest, stream, (SubLObject)(depth.isInteger() ? Numbers.add(depth, (SubLObject)format_cycl_expression.ONE_INTEGER) : format_cycl_expression.NIL));
            }
            print_high.princ((SubLObject)format_cycl_expression.$str4$_, stream);
        }
        return expression;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/format-cycl-expression.lisp", position = 3141L)
    public static SubLObject format_cycl_expression_default_indent(final SubLObject stream, final SubLObject depth) {
        return string_utilities.indent(stream, Numbers.multiply((SubLObject)format_cycl_expression.TWO_INTEGER, depth));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/format-cycl-expression.lisp", position = 3248L)
    public static SubLObject format_cycl_expression_indent(final SubLObject stream, final SubLObject depth) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (depth.isInteger()) {
            Functions.funcall(format_cycl_expression.$format_cycl_expression_newline_method$.getDynamicValue(thread), stream);
            if (depth.numG((SubLObject)format_cycl_expression.ZERO_INTEGER)) {
                Functions.funcall(format_cycl_expression.$format_cycl_expression_indent_method$.getDynamicValue(thread), stream, depth);
            }
        }
        return (SubLObject)format_cycl_expression.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/format-cycl-expression.lisp", position = 3698L)
    public static SubLObject format_cycl_expression_atom(final SubLObject v_object, final SubLObject stream, final SubLObject depth) {
        final SubLObject method_function = Structures.method_func(v_object, format_cycl_expression.$format_cycl_expression_atom_method_table$.getGlobalValue());
        if (format_cycl_expression.NIL != method_function) {
            return Functions.funcall(method_function, v_object, stream, depth);
        }
        return format_cycl_expression_default(v_object, stream, depth);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/format-cycl-expression.lisp", position = 3826L)
    public static SubLObject format_cycl_expression_default(final SubLObject v_object, final SubLObject stream, final SubLObject depth) {
        return print_high.prin1(v_object, stream);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/format-cycl-expression.lisp", position = 4030L)
    public static SubLObject format_cycl_expression_atom_constant_method(final SubLObject v_object, final SubLObject stream, final SubLObject depth) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (format_cycl_expression.NIL != format_cycl_expression.$format_cycl_expression_constant_method$.getDynamicValue(thread)) {
            Functions.funcall(format_cycl_expression.$format_cycl_expression_constant_method$.getDynamicValue(thread), v_object, stream, depth);
        }
        else {
            format_cycl_expression_default(v_object, stream, depth);
        }
        return v_object;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/format-cycl-expression.lisp", position = 4385L)
    public static SubLObject format_cycl_expression_atom_nart_method(final SubLObject v_object, final SubLObject stream, final SubLObject depth) {
        return format_cycl_expression_nat(v_object, stream, depth);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/format-cycl-expression.lisp", position = 4516L)
    public static SubLObject format_cycl_expression_nat(final SubLObject v_object, final SubLObject stream, final SubLObject depth) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (format_cycl_expression.NIL != format_cycl_expression.$format_cycl_expression_nat_method$.getDynamicValue(thread)) {
            Functions.funcall(format_cycl_expression.$format_cycl_expression_nat_method$.getDynamicValue(thread), v_object, stream, depth);
            return (SubLObject)format_cycl_expression.NIL;
        }
        return format_cycl_expression_default(v_object, stream, depth);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/format-cycl-expression.lisp", position = 4853L)
    public static SubLObject format_cycl_expression_atom_assertion_method(final SubLObject v_object, final SubLObject stream, final SubLObject depth) {
        return format_cycl_expression_assertion(v_object, stream, depth);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/format-cycl-expression.lisp", position = 4995L)
    public static SubLObject format_cycl_expression_assertion(final SubLObject v_object, final SubLObject stream, final SubLObject depth) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (format_cycl_expression.NIL != format_cycl_expression.$format_cycl_expression_assertion_method$.getDynamicValue(thread)) {
            Functions.funcall(format_cycl_expression.$format_cycl_expression_assertion_method$.getDynamicValue(thread), v_object, stream, depth);
            return (SubLObject)format_cycl_expression.NIL;
        }
        return format_cycl_expression_default(v_object, stream, depth);
    }
    
    public static SubLObject declare_format_cycl_expression_file() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.format_cycl_expression", "get_pretty_formatted_string", "GET-PRETTY-FORMATTED-STRING", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.format_cycl_expression", "format_cycl_expression", "FORMAT-CYCL-EXPRESSION", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.format_cycl_expression", "format_cycl_expression_to_string", "FORMAT-CYCL-EXPRESSION-TO-STRING", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.format_cycl_expression", "format_cycl_expression_recursive", "FORMAT-CYCL-EXPRESSION-RECURSIVE", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.format_cycl_expression", "format_cycl_expression_default_indent", "FORMAT-CYCL-EXPRESSION-DEFAULT-INDENT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.format_cycl_expression", "format_cycl_expression_indent", "FORMAT-CYCL-EXPRESSION-INDENT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.format_cycl_expression", "format_cycl_expression_atom", "FORMAT-CYCL-EXPRESSION-ATOM", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.format_cycl_expression", "format_cycl_expression_default", "FORMAT-CYCL-EXPRESSION-DEFAULT", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.format_cycl_expression", "format_cycl_expression_atom_constant_method", "FORMAT-CYCL-EXPRESSION-ATOM-CONSTANT-METHOD", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.format_cycl_expression", "format_cycl_expression_atom_nart_method", "FORMAT-CYCL-EXPRESSION-ATOM-NART-METHOD", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.format_cycl_expression", "format_cycl_expression_nat", "FORMAT-CYCL-EXPRESSION-NAT", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.format_cycl_expression", "format_cycl_expression_atom_assertion_method", "FORMAT-CYCL-EXPRESSION-ATOM-ASSERTION-METHOD", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.format_cycl_expression", "format_cycl_expression_assertion", "FORMAT-CYCL-EXPRESSION-ASSERTION", 3, 0, false);
        return (SubLObject)format_cycl_expression.NIL;
    }
    
    public static SubLObject init_format_cycl_expression_file() {
        format_cycl_expression.$format_cycl_expression_newline_method$ = SubLFiles.defparameter("*FORMAT-CYCL-EXPRESSION-NEWLINE-METHOD*", (SubLObject)format_cycl_expression.$sym5$TERPRI);
        format_cycl_expression.$format_cycl_expression_indent_method$ = SubLFiles.defparameter("*FORMAT-CYCL-EXPRESSION-INDENT-METHOD*", (SubLObject)format_cycl_expression.$sym6$FORMAT_CYCL_EXPRESSION_DEFAULT_INDENT);
        format_cycl_expression.$format_cycl_expression_atom_method_table$ = SubLFiles.deflexical("*FORMAT-CYCL-EXPRESSION-ATOM-METHOD-TABLE*", Vectors.make_vector((SubLObject)format_cycl_expression.$int7$256, (SubLObject)format_cycl_expression.NIL));
        format_cycl_expression.$format_cycl_expression_constant_method$ = SubLFiles.defparameter("*FORMAT-CYCL-EXPRESSION-CONSTANT-METHOD*", (SubLObject)format_cycl_expression.NIL);
        format_cycl_expression.$format_cycl_expression_nat_method$ = SubLFiles.defparameter("*FORMAT-CYCL-EXPRESSION-NAT-METHOD*", (SubLObject)format_cycl_expression.NIL);
        format_cycl_expression.$format_cycl_expression_assertion_method$ = SubLFiles.defparameter("*FORMAT-CYCL-EXPRESSION-ASSERTION-METHOD*", (SubLObject)format_cycl_expression.NIL);
        return (SubLObject)format_cycl_expression.NIL;
    }
    
    public static SubLObject setup_format_cycl_expression_file() {
        access_macros.register_external_symbol((SubLObject)format_cycl_expression.$sym0$GET_PRETTY_FORMATTED_STRING);
        Structures.register_method(format_cycl_expression.$format_cycl_expression_atom_method_table$.getGlobalValue(), constant_handles.$dtp_constant$.getGlobalValue(), Symbols.symbol_function((SubLObject)format_cycl_expression.$sym8$FORMAT_CYCL_EXPRESSION_ATOM_CONSTANT_METHOD));
        Structures.register_method(format_cycl_expression.$format_cycl_expression_atom_method_table$.getGlobalValue(), nart_handles.$dtp_nart$.getGlobalValue(), Symbols.symbol_function((SubLObject)format_cycl_expression.$sym9$FORMAT_CYCL_EXPRESSION_ATOM_NART_METHOD));
        Structures.register_method(format_cycl_expression.$format_cycl_expression_atom_method_table$.getGlobalValue(), assertion_handles.$dtp_assertion$.getGlobalValue(), Symbols.symbol_function((SubLObject)format_cycl_expression.$sym10$FORMAT_CYCL_EXPRESSION_ATOM_ASSERTION_METHOD));
        generic_testing.define_test_case_table_int((SubLObject)format_cycl_expression.$sym0$GET_PRETTY_FORMATTED_STRING, (SubLObject)ConsesLow.list(new SubLObject[] { format_cycl_expression.$kw11$TEST, format_cycl_expression.NIL, format_cycl_expression.$kw12$OWNER, format_cycl_expression.NIL, format_cycl_expression.$kw13$CLASSES, format_cycl_expression.NIL, format_cycl_expression.$kw14$KB, format_cycl_expression.$kw15$FULL, format_cycl_expression.$kw16$WORKING_, format_cycl_expression.T }), (SubLObject)format_cycl_expression.$list17);
        return (SubLObject)format_cycl_expression.NIL;
    }
    
    @Override
	public void declareFunctions() {
        declare_format_cycl_expression_file();
    }
    
    @Override
	public void initializeVariables() {
        init_format_cycl_expression_file();
    }
    
    @Override
	public void runTopLevelForms() {
        setup_format_cycl_expression_file();
    }
    
    static {
        me = (SubLFile)new format_cycl_expression();
        format_cycl_expression.$format_cycl_expression_newline_method$ = null;
        format_cycl_expression.$format_cycl_expression_indent_method$ = null;
        format_cycl_expression.$format_cycl_expression_atom_method_table$ = null;
        format_cycl_expression.$format_cycl_expression_constant_method$ = null;
        format_cycl_expression.$format_cycl_expression_nat_method$ = null;
        format_cycl_expression.$format_cycl_expression_assertion_method$ = null;
        $sym0$GET_PRETTY_FORMATTED_STRING = SubLObjectFactory.makeSymbol("GET-PRETTY-FORMATTED-STRING");
        $str1$_ = SubLObjectFactory.makeString("(");
        $str2$_ = SubLObjectFactory.makeString(" ");
        $str3$___ = SubLObjectFactory.makeString(" . ");
        $str4$_ = SubLObjectFactory.makeString(")");
        $sym5$TERPRI = SubLObjectFactory.makeSymbol("TERPRI");
        $sym6$FORMAT_CYCL_EXPRESSION_DEFAULT_INDENT = SubLObjectFactory.makeSymbol("FORMAT-CYCL-EXPRESSION-DEFAULT-INDENT");
        $int7$256 = SubLObjectFactory.makeInteger(256);
        $sym8$FORMAT_CYCL_EXPRESSION_ATOM_CONSTANT_METHOD = SubLObjectFactory.makeSymbol("FORMAT-CYCL-EXPRESSION-ATOM-CONSTANT-METHOD");
        $sym9$FORMAT_CYCL_EXPRESSION_ATOM_NART_METHOD = SubLObjectFactory.makeSymbol("FORMAT-CYCL-EXPRESSION-ATOM-NART-METHOD");
        $sym10$FORMAT_CYCL_EXPRESSION_ATOM_ASSERTION_METHOD = SubLObjectFactory.makeSymbol("FORMAT-CYCL-EXPRESSION-ATOM-ASSERTION-METHOD");
        $kw11$TEST = SubLObjectFactory.makeKeyword("TEST");
        $kw12$OWNER = SubLObjectFactory.makeKeyword("OWNER");
        $kw13$CLASSES = SubLObjectFactory.makeKeyword("CLASSES");
        $kw14$KB = SubLObjectFactory.makeKeyword("KB");
        $kw15$FULL = SubLObjectFactory.makeKeyword("FULL");
        $kw16$WORKING_ = SubLObjectFactory.makeKeyword("WORKING?");
        $list17 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("implies")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("isa")), (SubLObject)SubLObjectFactory.makeSymbol("?X"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Cat"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("likesAsFriend")), (SubLObject)SubLObjectFactory.makeSymbol("?X"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("DaveS")))), (SubLObject)format_cycl_expression.T, (SubLObject)format_cycl_expression.T), (SubLObject)SubLObjectFactory.makeString("(#$implies \n  (#$isa ?X #$Cat) \n  (#$likesAsFriend ?X #$DaveS))")), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("implies")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("isa")), (SubLObject)SubLObjectFactory.makeSymbol("?X"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Cat"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("likesAsFriend")), (SubLObject)SubLObjectFactory.makeSymbol("?X"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("DaveS")))), (SubLObject)format_cycl_expression.T, (SubLObject)format_cycl_expression.NIL), (SubLObject)SubLObjectFactory.makeString("(#$implies (#$isa ?X #$Cat) (#$likesAsFriend ?X #$DaveS))")), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("implies")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("isa")), (SubLObject)SubLObjectFactory.makeSymbol("?X"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Cat"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("likesAsFriend")), (SubLObject)SubLObjectFactory.makeSymbol("?X"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("DaveS")))), (SubLObject)format_cycl_expression.NIL, (SubLObject)format_cycl_expression.T), (SubLObject)SubLObjectFactory.makeString("(implies \n  (isa ?X Cat) \n  (likesAsFriend ?X DaveS))")), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("implies")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("isa")), (SubLObject)SubLObjectFactory.makeSymbol("?X"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Cat"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("likesAsFriend")), (SubLObject)SubLObjectFactory.makeSymbol("?X"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("DaveS")))), (SubLObject)format_cycl_expression.NIL, (SubLObject)format_cycl_expression.NIL), (SubLObject)SubLObjectFactory.makeString("(implies (isa ?X Cat) (likesAsFriend ?X DaveS))")));
    }
}

/*

	Total time: 134 ms
	
*/