package com.cyc.cycjava.cycl;

import com.cyc.cycjava.cycl.constant_handles;
import com.cyc.cycjava.cycl.format_cycl_expression;
import com.cyc.cycjava.cycl.owl.owlification;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.StreamsLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

import static com.cyc.cycjava.cycl.access_macros.*;
import static com.cyc.cycjava.cycl.constant_handles.*;
import static com.cyc.cycjava.cycl.cyc_testing.generic_testing.*;
import static com.cyc.cycjava.cycl.format_cycl_expression.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.NIL;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.ONE_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.T;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.TWO_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.UNPROVIDED;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.ZERO_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.$is_thread_performing_cleanupP$;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors.*;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.*;
import static com.cyc.tool.subl.util.SubLFiles.*;
import static com.cyc.tool.subl.util.SubLTranslatedFile.*;

public final class format_cycl_expression extends SubLTranslatedFile {
    public static final SubLFile me = new format_cycl_expression();

    public static final String myName = "com.cyc.cycjava.cycl.format_cycl_expression";

    public static final String myFingerPrint = "fbc878f5940ca3ed6c5bc3629c937a3a201b2e066bc35c293f44aa051a54c615";

    // defparameter
    public static final SubLSymbol $format_cycl_expression_newline_method$ = makeSymbol("*FORMAT-CYCL-EXPRESSION-NEWLINE-METHOD*");

    // defparameter
    public static final SubLSymbol $format_cycl_expression_indent_method$ = makeSymbol("*FORMAT-CYCL-EXPRESSION-INDENT-METHOD*");

    // deflexical
    public static final SubLSymbol $format_cycl_expression_atom_method_table$ = makeSymbol("*FORMAT-CYCL-EXPRESSION-ATOM-METHOD-TABLE*");

    // defparameter
    public static final SubLSymbol $format_cycl_expression_constant_method$ = makeSymbol("*FORMAT-CYCL-EXPRESSION-CONSTANT-METHOD*");

    // defparameter
    public static final SubLSymbol $format_cycl_expression_nat_method$ = makeSymbol("*FORMAT-CYCL-EXPRESSION-NAT-METHOD*");

    // defparameter
    public static final SubLSymbol $format_cycl_expression_assertion_method$ = makeSymbol("*FORMAT-CYCL-EXPRESSION-ASSERTION-METHOD*");

    private static final SubLSymbol GET_PRETTY_FORMATTED_STRING = makeSymbol("GET-PRETTY-FORMATTED-STRING");

    private static final SubLString $str1$_ = makeString("(");
    private static final SubLString $str2$_ = makeString(" ");

    private static final SubLString $str3$___ = makeString(" . ");

    private static final SubLString $str4$_ = makeString(")");

    private static final SubLSymbol FORMAT_CYCL_EXPRESSION_DEFAULT_INDENT = makeSymbol("FORMAT-CYCL-EXPRESSION-DEFAULT-INDENT");

    private static final SubLSymbol FORMAT_CYCL_EXPRESSION_ATOM_CONSTANT_METHOD = makeSymbol("FORMAT-CYCL-EXPRESSION-ATOM-CONSTANT-METHOD");

    private static final SubLSymbol FORMAT_CYCL_EXPRESSION_ATOM_NART_METHOD = makeSymbol("FORMAT-CYCL-EXPRESSION-ATOM-NART-METHOD");

    private static final SubLSymbol FORMAT_CYCL_EXPRESSION_ATOM_ASSERTION_METHOD = makeSymbol("FORMAT-CYCL-EXPRESSION-ATOM-ASSERTION-METHOD");

    private static final SubLList $list17 = list(
	    list(list(list(reader_make_constant_shell(makeString("implies")), list(reader_make_constant_shell(makeString("isa")), makeSymbol("?X"), reader_make_constant_shell(makeString("Cat"))),
		    list(reader_make_constant_shell(makeString("likesAsFriend")), makeSymbol("?X"), reader_make_constant_shell(makeString("DaveS")))), T, T), makeString("(#$implies \n  (#$isa ?X #$Cat) \n  (#$likesAsFriend ?X #$DaveS))")),
	    list(list(list(reader_make_constant_shell(makeString("implies")), list(reader_make_constant_shell(makeString("isa")), makeSymbol("?X"), reader_make_constant_shell(makeString("Cat"))),
		    list(reader_make_constant_shell(makeString("likesAsFriend")), makeSymbol("?X"), reader_make_constant_shell(makeString("DaveS")))), T, NIL), makeString("(#$implies (#$isa ?X #$Cat) (#$likesAsFriend ?X #$DaveS))")),
	    list(list(list(reader_make_constant_shell(makeString("implies")), list(reader_make_constant_shell(makeString("isa")), makeSymbol("?X"), reader_make_constant_shell(makeString("Cat"))),
		    list(reader_make_constant_shell(makeString("likesAsFriend")), makeSymbol("?X"), reader_make_constant_shell(makeString("DaveS")))), NIL, T), makeString("(implies \n  (isa ?X Cat) \n  (likesAsFriend ?X DaveS))")),
	    list(list(list(reader_make_constant_shell(makeString("implies")), list(reader_make_constant_shell(makeString("isa")), makeSymbol("?X"), reader_make_constant_shell(makeString("Cat"))),
		    list(reader_make_constant_shell(makeString("likesAsFriend")), makeSymbol("?X"), reader_make_constant_shell(makeString("DaveS")))), NIL, NIL), makeString("(implies (isa ?X Cat) (likesAsFriend ?X DaveS))")));

    public static SubLObject get_pretty_formatted_string(final SubLObject obj, SubLObject include_constant_reader_prefix, SubLObject wrap_lines) {
	if (include_constant_reader_prefix == UNPROVIDED) {
	    include_constant_reader_prefix = NIL;
	}
	if (wrap_lines == UNPROVIDED) {
	    wrap_lines = NIL;
	}
	final SubLObject depth = (NIL != wrap_lines) ? ZERO_INTEGER : NIL;
	SubLObject s = format_cycl_expression_to_string(obj, depth);
	if (NIL == include_constant_reader_prefix) {
	    s = owlification.strip_hl_artifacts(s);
	}
	s = string_utilities.left_trim_whitespace(s);
	return s;
    }

    public static SubLObject format_cycl_expression(final SubLObject expression, SubLObject stream, SubLObject depth) {
	if (stream == UNPROVIDED) {
	    stream = StreamsLow.$standard_output$.getDynamicValue();
	}
	if (depth == UNPROVIDED) {
	    depth = ZERO_INTEGER;
	}
	return format_cycl_expression_recursive(expression, stream, depth);
    }

    public static SubLObject format_cycl_expression_to_string(final SubLObject expression, SubLObject depth) {
	if (depth == UNPROVIDED) {
	    depth = ZERO_INTEGER;
	}
	SubLObject result = NIL;
	SubLObject stream = NIL;
	try {
	    stream = make_private_string_output_stream();
	    format_cycl_expression(expression, stream, depth);
	    result = get_output_stream_string(stream);
	} finally {
	    final SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
	    try {
		bind($is_thread_performing_cleanupP$, T);
		final SubLObject _values = getValuesAsVector();
		close(stream, UNPROVIDED);
		restoreValuesFromVector(_values);
	    } finally {
		rebind($is_thread_performing_cleanupP$, _prev_bind_0);
	    }
	}
	return result;
    }

    public static SubLObject format_cycl_expression_recursive(final SubLObject expression, final SubLObject stream, final SubLObject depth) {
	if (expression.isAtom()) {
	    format_cycl_expression_atom(expression, stream, depth);
	} else {
	    format_cycl_expression_indent(stream, depth);
	    princ($str1$_, stream);
	    format_cycl_expression_recursive(expression.first(), stream, NIL);
	    SubLObject rest;
	    for (rest = NIL, rest = expression.rest(); rest.isCons(); rest = rest.rest()) {
		princ($str2$_, stream);
		format_cycl_expression_recursive(rest.first(), stream, depth.isInteger() ? add(depth, ONE_INTEGER) : NIL);
	    }
	    if (NIL != rest) {
		princ($str3$___, stream);
		format_cycl_expression_recursive(rest, stream, depth.isInteger() ? add(depth, ONE_INTEGER) : NIL);
	    }
	    princ($str4$_, stream);
	}
	return expression;
    }

    public static SubLObject format_cycl_expression_default_indent(final SubLObject stream, final SubLObject depth) {
	return string_utilities.indent(stream, multiply(TWO_INTEGER, depth));
    }

    public static SubLObject format_cycl_expression_indent(final SubLObject stream, final SubLObject depth) {
	final SubLThread thread = SubLProcess.currentSubLThread();
	if (depth.isInteger()) {
	    funcall($format_cycl_expression_newline_method$.getDynamicValue(thread), stream);
	    if (depth.numG(ZERO_INTEGER)) {
		funcall($format_cycl_expression_indent_method$.getDynamicValue(thread), stream, depth);
	    }
	}
	return NIL;
    }

    public static SubLObject format_cycl_expression_atom(final SubLObject v_object, final SubLObject stream, final SubLObject depth) {
	final SubLObject method_function = method_func(v_object, $format_cycl_expression_atom_method_table$.getGlobalValue());
	if (NIL != method_function) {
	    return funcall(method_function, v_object, stream, depth);
	}
	return format_cycl_expression_default(v_object, stream, depth);
    }

    public static SubLObject format_cycl_expression_default(final SubLObject v_object, final SubLObject stream, final SubLObject depth) {
	return prin1(v_object, stream);
    }

    public static SubLObject format_cycl_expression_atom_constant_method(final SubLObject v_object, final SubLObject stream, final SubLObject depth) {
	final SubLThread thread = SubLProcess.currentSubLThread();
	if (NIL != $format_cycl_expression_constant_method$.getDynamicValue(thread)) {
	    funcall($format_cycl_expression_constant_method$.getDynamicValue(thread), v_object, stream, depth);
	} else {
	    format_cycl_expression_default(v_object, stream, depth);
	}
	return v_object;
    }

    public static SubLObject format_cycl_expression_atom_nart_method(final SubLObject v_object, final SubLObject stream, final SubLObject depth) {
	return format_cycl_expression_nat(v_object, stream, depth);
    }

    public static SubLObject format_cycl_expression_nat(final SubLObject v_object, final SubLObject stream, final SubLObject depth) {
	final SubLThread thread = SubLProcess.currentSubLThread();
	if (NIL != $format_cycl_expression_nat_method$.getDynamicValue(thread)) {
	    funcall($format_cycl_expression_nat_method$.getDynamicValue(thread), v_object, stream, depth);
	    return NIL;
	}
	return format_cycl_expression_default(v_object, stream, depth);
    }

    public static SubLObject format_cycl_expression_atom_assertion_method(final SubLObject v_object, final SubLObject stream, final SubLObject depth) {
	return format_cycl_expression_assertion(v_object, stream, depth);
    }

    public static SubLObject format_cycl_expression_assertion(final SubLObject v_object, final SubLObject stream, final SubLObject depth) {
	final SubLThread thread = SubLProcess.currentSubLThread();
	if (NIL != $format_cycl_expression_assertion_method$.getDynamicValue(thread)) {
	    funcall($format_cycl_expression_assertion_method$.getDynamicValue(thread), v_object, stream, depth);
	    return NIL;
	}
	return format_cycl_expression_default(v_object, stream, depth);
    }

    public static SubLObject declare_format_cycl_expression_file() {
	declareFunction(me, "get_pretty_formatted_string", "GET-PRETTY-FORMATTED-STRING", 1, 2, false);
	declareFunction(me, "format_cycl_expression", "FORMAT-CYCL-EXPRESSION", 1, 2, false);
	declareFunction(me, "format_cycl_expression_to_string", "FORMAT-CYCL-EXPRESSION-TO-STRING", 1, 1, false);
	declareFunction(me, "format_cycl_expression_recursive", "FORMAT-CYCL-EXPRESSION-RECURSIVE", 3, 0, false);
	declareFunction(me, "format_cycl_expression_default_indent", "FORMAT-CYCL-EXPRESSION-DEFAULT-INDENT", 2, 0, false);
	declareFunction(me, "format_cycl_expression_indent", "FORMAT-CYCL-EXPRESSION-INDENT", 2, 0, false);
	declareFunction(me, "format_cycl_expression_atom", "FORMAT-CYCL-EXPRESSION-ATOM", 3, 0, false);
	declareFunction(me, "format_cycl_expression_default", "FORMAT-CYCL-EXPRESSION-DEFAULT", 3, 0, false);
	declareFunction(me, "format_cycl_expression_atom_constant_method", "FORMAT-CYCL-EXPRESSION-ATOM-CONSTANT-METHOD", 3, 0, false);
	declareFunction(me, "format_cycl_expression_atom_nart_method", "FORMAT-CYCL-EXPRESSION-ATOM-NART-METHOD", 3, 0, false);
	declareFunction(me, "format_cycl_expression_nat", "FORMAT-CYCL-EXPRESSION-NAT", 3, 0, false);
	declareFunction(me, "format_cycl_expression_atom_assertion_method", "FORMAT-CYCL-EXPRESSION-ATOM-ASSERTION-METHOD", 3, 0, false);
	declareFunction(me, "format_cycl_expression_assertion", "FORMAT-CYCL-EXPRESSION-ASSERTION", 3, 0, false);
	return NIL;
    }

    public static SubLObject init_format_cycl_expression_file() {
	defparameter("*FORMAT-CYCL-EXPRESSION-NEWLINE-METHOD*", TERPRI);
	defparameter("*FORMAT-CYCL-EXPRESSION-INDENT-METHOD*", FORMAT_CYCL_EXPRESSION_DEFAULT_INDENT);
	deflexical("*FORMAT-CYCL-EXPRESSION-ATOM-METHOD-TABLE*", make_vector($int$256, NIL));
	defparameter("*FORMAT-CYCL-EXPRESSION-CONSTANT-METHOD*", NIL);
	defparameter("*FORMAT-CYCL-EXPRESSION-NAT-METHOD*", NIL);
	defparameter("*FORMAT-CYCL-EXPRESSION-ASSERTION-METHOD*", NIL);
	return NIL;
    }

    public static SubLObject setup_format_cycl_expression_file() {
	register_external_symbol(GET_PRETTY_FORMATTED_STRING);
	register_method($format_cycl_expression_atom_method_table$.getGlobalValue(), $dtp_constant$.getGlobalValue(), symbol_function(FORMAT_CYCL_EXPRESSION_ATOM_CONSTANT_METHOD));
	register_method($format_cycl_expression_atom_method_table$.getGlobalValue(), nart_handles.$dtp_nart$.getGlobalValue(), symbol_function(FORMAT_CYCL_EXPRESSION_ATOM_NART_METHOD));
	register_method($format_cycl_expression_atom_method_table$.getGlobalValue(), assertion_handles.$dtp_assertion$.getGlobalValue(), symbol_function(FORMAT_CYCL_EXPRESSION_ATOM_ASSERTION_METHOD));
	define_test_case_table_int(GET_PRETTY_FORMATTED_STRING, list(new SubLObject[] { $TEST, NIL, $OWNER, NIL, $CLASSES, NIL, $KB, $FULL, $WORKING_, T }), $list17);
	return NIL;
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

    }
}

/**
 * Total time: 134 ms
 */
