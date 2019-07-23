//
// For LarKC
//
package com.cyc.tool.subl.jrtl.translatedCode.sublisp;

import org.armedbear.lisp.LispObject;

import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.format.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Environment.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Eval.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Locks.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Packages.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors.*;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.StreamsLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLNil;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public class print_high extends SubLTranslatedFile {
    @SubL(source = "sublisp/print-high.lisp", position = 5851L)
    public static SubLObject circular_reference_p(SubLObject object, SubLObject stream) {
	SubLThread thread = SubLProcess.currentSubLThread();
	if (SubLNil.NIL != print_high.$print_circle$.getDynamicValue(thread) && SubLNil.NIL == read_print_eq(object)) {
	    SubLObject info = conses_high.assoc(stream, print_high.$print_circularities$.getDynamicValue(thread), CommonSymbols.UNPROVIDED, CommonSymbols.UNPROVIDED).rest();
	    if (SubLNil.NIL != info) {
		SubLObject current;
		SubLObject datum = current = info;
		SubLObject table = SubLNil.NIL;
		SubLObject counter = SubLNil.NIL;
		cdestructuring_bind.destructuring_bind_must_consp(current, datum, print_high.$list30);
		table = current.first();
		current = counter = current.rest();
		SubLObject state = Hashtables.gethash(object, table, CommonSymbols.UNPROVIDED);
		if (state == print_high.$sym31$REFERENCED || state.isNumber())
		    return CommonSymbols.T;
		if (state == print_high.$sym34$DETECTED) {
		    Hashtables.sethash(object, table, print_high.$sym31$REFERENCED);
		    return CommonSymbols.T;
		}
		if (SubLNil.NIL == counter)
		    Hashtables.sethash(object, table, print_high.$sym34$DETECTED);
	    }
	}
	return SubLNil.NIL;
    }

    public static SubLObject declare_print_high_file() {
	SubLFiles.declareFunction("com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high", "read_print_eq", "READ-PRINT-EQ", 1, 0, false);
	SubLFiles.declareFunction("com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high", "print_error", "PRINT-ERROR", 2, 0, false);
	SubLFiles.declareMacro("com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high", "with_printer_state", "WITH-PRINTER-STATE");
	SubLFiles.declareFunction("com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high", "handle_circularity", "HANDLE-CIRCULARITY", 2, 0, false);
	SubLFiles.declareFunction("com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high", "circular_reference_p", "CIRCULAR-REFERENCE-P", 2, 0, false);
	SubLFiles.declareFunction("com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high", "print_object", "PRINT-OBJECT", 2, 0, false);
	SubLFiles.declareFunction("com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high", "print_object_wrapper", "PRINT-OBJECT-WRAPPER", 2, 0, false);
	SubLFiles.declareFunction("com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high", "really_write", "REALLY-WRITE", 2, 0, false);
	SubLFiles.declareFunction("com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high", "prin1", "PRIN1", 1, 1, false);
	SubLFiles.declareFunction("com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high", "print", "PRINT", 1, 1, false);
	SubLFiles.declareFunction("com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high", "princ", "PRINC", 1, 1, false);
	SubLFiles.declareFunction("com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high", "really_write_to_string", "REALLY-WRITE-TO-STRING", 2, 0, false);
	SubLFiles.declareFunction("com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high", "prin1_to_string", "PRIN1-TO-STRING", 1, 0, false);
	SubLFiles.declareFunction("com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high", "princ_to_string", "PRINC-TO-STRING", 1, 0, false);
	SubLFiles.declareFunction("com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high", "print_not_readable", "PRINT-NOT-READABLE", 2, 0, false);
	return SubLNil.NIL;
    }

    @SubL(source = "sublisp/print-high.lisp", position = 4858L)
    public static SubLObject handle_circularity(SubLObject object, SubLObject stream) {
	SubLThread thread = SubLProcess.currentSubLThread();
	SubLObject info = conses_high.assoc(stream, print_high.$print_circularities$.getDynamicValue(thread), CommonSymbols.UNPROVIDED, CommonSymbols.UNPROVIDED).rest();
	if (SubLNil.NIL != info) {
	    SubLObject current;
	    SubLObject datum = current = info;
	    SubLObject table = SubLNil.NIL;
	    SubLObject counter = SubLNil.NIL;
	    cdestructuring_bind.destructuring_bind_must_consp(current, datum, print_high.$list30);
	    table = current.first();
	    current = counter = current.rest();
	    if (SubLNil.NIL == counter)
		return SubLNil.NIL;
	    SubLObject state = Hashtables.gethash(object, table, CommonSymbols.UNPROVIDED);
	    if (state == print_high.$sym31$REFERENCED) {
		counter = Numbers.add(counter, CommonSymbols.ONE_INTEGER);
		ConsesLow.rplacd(info, counter);
		PrintLow.format(stream, print_high.$str32$__D_, counter);
	    } else if (state.isNumber()) {
		PrintLow.format(stream, print_high.$str33$__D__, state);
		return SubLNil.NIL;
	    }
	}
	print_object(object, stream);
	return SubLNil.NIL;
    }

    public static SubLObject init_print_high_file() {
	print_high.$print_array$ = SubLFiles.defvarCheckCL("*PRINT-ARRAY*", CommonSymbols.T);
	print_high.$print_base$ = SubLFiles.defvarCheckCL("*PRINT-BASE*", CommonSymbols.TEN_INTEGER);
	print_high.$print_case$ = SubLFiles.defvarCheckCL("*PRINT-CASE*", print_high.$kw0$UPCASE);
	print_high.$print_circle$ = SubLFiles.defvarCheckCL("*PRINT-CIRCLE*", SubLNil.NIL);
	print_high.$print_escape$ = SubLFiles.defvarCheckCL("*PRINT-ESCAPE*", CommonSymbols.T);
	print_high.$print_gensym$ = SubLFiles.defvarCheckCL("*PRINT-GENSYM*", CommonSymbols.T);
	print_high.$print_length$ = SubLFiles.defvarCheckCL("*PRINT-LENGTH*", SubLNil.NIL);
	print_high.$print_level$ = SubLFiles.defvarCheckCL("*PRINT-LEVEL*", SubLNil.NIL);
	print_high.$print_lines$ = SubLFiles.defvarCheckCL("*PRINT-LINES*", SubLNil.NIL);
	print_high.$print_miser_width$ = SubLFiles.defvarCheckCL("*PRINT-MISER-WIDTH*", SubLNil.NIL);
	print_high.$print_pprint_dispatch$ = SubLFiles.defvarCheckCL("*PRINT-PPRINT-DISPATCH*", SubLNil.NIL);
	print_high.$print_pretty$ = SubLFiles.defvarCheckCL("*PRINT-PRETTY*", CommonSymbols.T);
	print_high.$print_radix$ = SubLFiles.defvarCheckCL("*PRINT-RADIX*", SubLNil.NIL);
	print_high.$print_readably$ = SubLFiles.defvarCheckCL("*PRINT-READABLY*", SubLNil.NIL);
	print_high.$print_right_margin$ = SubLFiles.defvarCheckCL("*PRINT-RIGHT-MARGIN*", SubLNil.NIL);
	print_high.$print_error$ = SubLFiles.defvarCheckCL("*PRINT-ERROR*", SubLNil.NIL);
	print_high.$print_circularities$ = SubLFiles.defvarCheckCL("*PRINT-CIRCULARITIES*", SubLNil.NIL);
	print_high.$print_circle_table_size$ = SubLFiles.defparameter("*PRINT-CIRCLE-TABLE-SIZE*", print_high.$int$64);
	print_high.$print_object_method_table$ = SubLFiles.deflexical("*PRINT-OBJECT-METHOD-TABLE*", Vectors.make_vector(print_high.$int$256, SubLNil.NIL));
	return SubLNil.NIL;
    }

    @SubL(source = "sublisp/print-high.lisp", position = 9070L)
    public static SubLObject prin1(SubLObject object, SubLObject stream) {
	if (stream == CommonSymbols.UNPROVIDED)
	    stream = StreamsLow.$standard_output$.getDynamicValue();
	SubLThread thread = SubLProcess.currentSubLThread();
	SubLObject _prev_bind_0 = print_high.$print_escape$.currentBinding(thread);
	try {
	    print_high.$print_escape$.bind(CommonSymbols.T, thread);
	    print_object_wrapper(object, stream);
	} finally {
	    print_high.$print_escape$.rebind(_prev_bind_0, thread);
	}
	return object;
    }

    @SubL(source = "sublisp/print-high.lisp", position = 10123L)
    public static SubLObject prin1_to_string(SubLObject object) {
	SubLObject result = SubLNil.NIL;
	SubLObject stream = SubLNil.NIL;
	try {
	    stream = streams_high.make_private_string_output_stream();
	    prin1(object, stream);
	    result = streams_high.get_output_stream_string(stream);
	} finally {
	    SubLObject _prev_bind_0 = Dynamic.currentBinding(Threads.$is_thread_performing_cleanupP$);
	    try {
		Dynamic.bind(Threads.$is_thread_performing_cleanupP$, CommonSymbols.T);
		SubLObject _values = Values.getValuesAsVector();
		streams_high.close(stream, CommonSymbols.UNPROVIDED);
		Values.restoreValuesFromVector(_values);
	    } finally {
		Dynamic.rebind(Threads.$is_thread_performing_cleanupP$, _prev_bind_0);
	    }
	}
	return result;
    }

    @SubL(source = "sublisp/print-high.lisp", position = 9383L)
    public static SubLObject princ(SubLObject object, SubLObject stream) {
	if (stream == CommonSymbols.UNPROVIDED)
	    stream = StreamsLow.$standard_output$.getDynamicValue();
	SubLThread thread = SubLProcess.currentSubLThread();
	SubLObject _prev_bind_0 = print_high.$print_escape$.currentBinding(thread);
	SubLObject _prev_bind_2 = print_high.$print_readably$.currentBinding(thread);
	try {
	    print_high.$print_escape$.bind(SubLNil.NIL, thread);
	    print_high.$print_readably$.bind(SubLNil.NIL, thread);
	    if (object.isString())
		streams_high.write_string(object, stream, CommonSymbols.UNPROVIDED, CommonSymbols.UNPROVIDED);
	    else if (object.isChar())
		streams_high.write_char(object, stream);
	    else
		print_object_wrapper(object, stream);
	} finally {
	    print_high.$print_readably$.rebind(_prev_bind_2, thread);
	    print_high.$print_escape$.rebind(_prev_bind_0, thread);
	}
	return object;
    }

    @SubL(source = "sublisp/print-high.lisp", position = 10266L)
    public static SubLObject princ_to_string(SubLObject object) {
	SubLObject result = SubLNil.NIL;
	SubLObject stream = SubLNil.NIL;
	try {
	    stream = streams_high.make_private_string_output_stream();
	    princ(object, stream);
	    result = streams_high.get_output_stream_string(stream);
	} finally {
	    SubLObject _prev_bind_0 = Dynamic.currentBinding(Threads.$is_thread_performing_cleanupP$);
	    try {
		Dynamic.bind(Threads.$is_thread_performing_cleanupP$, CommonSymbols.T);
		SubLObject _values = Values.getValuesAsVector();
		streams_high.close(stream, CommonSymbols.UNPROVIDED);
		Values.restoreValuesFromVector(_values);
	    } finally {
		Dynamic.rebind(Threads.$is_thread_performing_cleanupP$, _prev_bind_0);
	    }
	}
	return result;
    }

    @SubL(source = "sublisp/print-high.lisp", position = 9219L)
    public static SubLObject print(SubLObject object, SubLObject stream) {
	if (stream == CommonSymbols.UNPROVIDED)
	    stream = StreamsLow.$standard_output$.getDynamicValue();
	streams_high.write_char(Characters.CHAR_newline, stream);
	prin1(object, stream);
	streams_high.write_char(Characters.CHAR_space, stream);
	return object;
    }

    @SubL(source = "sublisp/print-high.lisp", position = 3588L)
    public static SubLObject print_error(SubLObject object, SubLObject stream) {
	PrintLow.format(stream, print_high.$str2$__Error_printing__S_, Types.type_of(object));
	return SubLNil.NIL;
    }

    @SubL(source = "sublisp/print-high.lisp", position = 10409L)
    public static SubLObject print_not_readable(SubLObject object, SubLObject stream) {
	SubLThread thread = SubLProcess.currentSubLThread();
	SubLObject _prev_bind_0 = print_high.$print_readably$.currentBinding(thread);
	try {
	    print_high.$print_readably$.bind(SubLNil.NIL, thread);
	    if (object instanceof LispObject) {
		try {
		    String string = (((LispObject) object).printObject());
		    streams_high.write_string(SubLObjectFactory.makeString(string), stream, CommonSymbols.UNPROVIDED, CommonSymbols.UNPROVIDED);
		    return SubLNil.NIL;
		} catch (Throwable t) {
		    t.printStackTrace();
		}
	    }
	    Errors.error(print_high.$str54$_S_cannot_be_printed_readably_, object);
	} finally {
	    print_high.$print_readably$.rebind(_prev_bind_0, thread);
	}
	return SubLNil.NIL;
    }

    @SubL(source = "sublisp/print-high.lisp", position = 6793L)
    public static SubLObject print_object(SubLObject object, SubLObject stream) {
	SubLThread thread = SubLProcess.currentSubLThread();
	SubLObject method_function = Structures.method_func(object, print_high.$print_object_method_table$.getGlobalValue());
	if (SubLNil.NIL != method_function)
	    return Functions.funcall(method_function, object, stream);

	if (SubLNil.NIL != print_high.$print_readably$.getDynamicValue(thread))
	    print_not_readable(object, stream);
	else {
	    print_macros.print_unreadable_object_preamble(stream, object, CommonSymbols.T, SubLNil.NIL);
	    print_macros.print_unreadable_object_postamble(stream, object, CommonSymbols.T, CommonSymbols.T);
	}
	return object;
    }

    @SubL(source = "sublisp/print-high.lisp", position = 6978L)
    public static SubLObject print_object_wrapper(SubLObject object, SubLObject stream) {
	if (object.isString())
	    print_functions.print_string(object, stream);
	else if (object.isChar())
	    print_functions.print_character(object, stream);
	else if (object.isSymbol())
	    print_functions.print_symbol(object, stream);
	else if (object.isCons())
	    print_functions.print_cons_cells(object, stream);
	else if (object.isInteger())
	    print_functions.print_integer(object, stream);
	else if (object.isVector())
	    print_functions.print_vector(object, stream);
	else if (object.isHashtable())
	    print_functions.print_hashtable(object, stream);
	else if (object.isFunction())
	    Functions.print_function(object, stream);
	else if (object.isDouble())
	    print_functions.print_flonum(object, stream);
	else
	    print_object(object, stream);
	return object;
    }

    @SubL(source = "sublisp/print-high.lisp", position = 3331L)
    public static SubLObject read_print_eq(SubLObject object) {
	return SubLObjectFactory.makeBoolean(object.isSymbol() || object.isFixnum() || object.isChar());
    }

    @SubL(source = "sublisp/print-high.lisp", position = 7842L)
    public static SubLObject really_write(SubLObject object, SubLObject keys) {
	SubLThread thread = SubLProcess.currentSubLThread();
	SubLObject allow_other_keys_p = SubLNil.NIL;
	SubLObject rest = keys;
	SubLObject bad = SubLNil.NIL;
	SubLObject current_$2 = SubLNil.NIL;
	while (SubLNil.NIL != rest) {
	    cdestructuring_bind.destructuring_bind_must_consp(rest, keys, print_high.$list36);
	    current_$2 = rest.first();
	    rest = rest.rest();
	    cdestructuring_bind.destructuring_bind_must_consp(rest, keys, print_high.$list36);
	    if (SubLNil.NIL == conses_high.member(current_$2, print_high.$list37, CommonSymbols.UNPROVIDED, CommonSymbols.UNPROVIDED))
		bad = CommonSymbols.T;
	    if (current_$2 == print_high.$kw5$ALLOW_OTHER_KEYS)
		allow_other_keys_p = rest.first();
	    rest = rest.rest();
	}
	if (SubLNil.NIL != bad && SubLNil.NIL == allow_other_keys_p)
	    cdestructuring_bind.cdestructuring_bind_error(keys, print_high.$list36);
	SubLObject stream_tail = cdestructuring_bind.property_list_member(print_high.$kw38$STREAM, keys);
	SubLObject stream = SubLNil.NIL != stream_tail ? conses_high.cadr(stream_tail) : StreamsLow.$standard_output$.getDynamicValue(thread);
	SubLObject print_arrayX_tail = cdestructuring_bind.property_list_member(print_high.$kw39$ARRAY, keys);
	SubLObject _prev_bind_0 = print_high.$print_array$.currentBinding(thread);
	try {
	    print_high.$print_array$.bind(SubLNil.NIL != print_arrayX_tail ? conses_high.cadr(print_arrayX_tail) : print_high.$print_array$.getDynamicValue(thread), thread);
	    SubLObject print_baseX_tail = cdestructuring_bind.property_list_member(print_high.$kw40$BASE, keys);
	    SubLObject _prev_bind_0_$3 = print_high.$print_base$.currentBinding(thread);
	    try {
		print_high.$print_base$.bind(SubLNil.NIL != print_baseX_tail ? conses_high.cadr(print_baseX_tail) : print_high.$print_base$.getDynamicValue(thread), thread);
		SubLObject print_caseX_tail = cdestructuring_bind.property_list_member(print_high.$kw41$CASE, keys);
		SubLObject _prev_bind_0_$4 = print_high.$print_case$.currentBinding(thread);
		try {
		    print_high.$print_case$.bind(SubLNil.NIL != print_caseX_tail ? conses_high.cadr(print_caseX_tail) : print_high.$print_case$.getDynamicValue(thread), thread);
		    SubLObject print_circleX_tail = cdestructuring_bind.property_list_member(print_high.$kw42$CIRCLE, keys);
		    SubLObject _prev_bind_0_$5 = print_high.$print_circle$.currentBinding(thread);
		    try {
			print_high.$print_circle$.bind(SubLNil.NIL != print_circleX_tail ? conses_high.cadr(print_circleX_tail) : print_high.$print_circle$.getDynamicValue(thread), thread);
			SubLObject print_escapeX_tail = cdestructuring_bind.property_list_member(print_high.$kw43$ESCAPE, keys);
			SubLObject _prev_bind_0_$6 = print_high.$print_escape$.currentBinding(thread);
			try {
			    print_high.$print_escape$.bind(SubLNil.NIL != print_escapeX_tail ? conses_high.cadr(print_escapeX_tail) : print_high.$print_escape$.getDynamicValue(thread), thread);
			    SubLObject print_gensymX_tail = cdestructuring_bind.property_list_member(print_high.$kw44$GENSYM, keys);
			    SubLObject _prev_bind_0_$7 = print_high.$print_gensym$.currentBinding(thread);
			    try {
				print_high.$print_gensym$.bind(SubLNil.NIL != print_gensymX_tail ? conses_high.cadr(print_gensymX_tail) : print_high.$print_gensym$.getDynamicValue(thread), thread);
				SubLObject print_lengthX_tail = cdestructuring_bind.property_list_member(print_high.$kw45$LENGTH, keys);
				SubLObject _prev_bind_0_$8 = print_high.$print_length$.currentBinding(thread);
				try {
				    print_high.$print_length$.bind(SubLNil.NIL != print_lengthX_tail ? conses_high.cadr(print_lengthX_tail) : print_high.$print_length$.getDynamicValue(thread), thread);
				    SubLObject print_levelX_tail = cdestructuring_bind.property_list_member(print_high.$kw46$LEVEL, keys);
				    SubLObject _prev_bind_0_$9 = print_high.$print_level$.currentBinding(thread);
				    try {
					print_high.$print_level$.bind(SubLNil.NIL != print_levelX_tail ? conses_high.cadr(print_levelX_tail) : print_high.$print_level$.getDynamicValue(thread), thread);
					SubLObject print_linesX_tail = cdestructuring_bind.property_list_member(print_high.$kw47$LINES, keys);
					SubLObject _prev_bind_0_$10 = print_high.$print_lines$.currentBinding(thread);
					try {
					    print_high.$print_lines$.bind(SubLNil.NIL != print_linesX_tail ? conses_high.cadr(print_linesX_tail) : print_high.$print_lines$.getDynamicValue(thread), thread);
					    SubLObject print_miser_widthX_tail = cdestructuring_bind.property_list_member(print_high.$kw48$MISER_WIDTH, keys);
					    SubLObject _prev_bind_0_$11 = print_high.$print_miser_width$.currentBinding(thread);
					    try {
						print_high.$print_miser_width$.bind(SubLNil.NIL != print_miser_widthX_tail ? conses_high.cadr(print_miser_widthX_tail) : print_high.$print_miser_width$.getDynamicValue(thread), thread);
						SubLObject print_pprint_dispatchX_tail = cdestructuring_bind.property_list_member(print_high.$kw49$PPRINT_DISPATCH, keys);
						SubLObject _prev_bind_0_$12 = print_high.$print_pprint_dispatch$.currentBinding(thread);
						try {
						    print_high.$print_pprint_dispatch$.bind(SubLNil.NIL != print_pprint_dispatchX_tail ? conses_high.cadr(print_pprint_dispatchX_tail) : print_high.$print_pprint_dispatch$.getDynamicValue(thread), thread);
						    SubLObject print_prettyX_tail = cdestructuring_bind.property_list_member(print_high.$kw50$PRETTY, keys);
						    SubLObject _prev_bind_0_$13 = print_high.$print_pretty$.currentBinding(thread);
						    try {
							print_high.$print_pretty$.bind(SubLNil.NIL != print_prettyX_tail ? conses_high.cadr(print_prettyX_tail) : print_high.$print_pretty$.getDynamicValue(thread), thread);
							SubLObject print_radixX_tail = cdestructuring_bind.property_list_member(print_high.$kw51$RADIX, keys);
							SubLObject _prev_bind_0_$14 = print_high.$print_radix$.currentBinding(thread);
							try {
							    print_high.$print_radix$.bind(SubLNil.NIL != print_radixX_tail ? conses_high.cadr(print_radixX_tail) : print_high.$print_radix$.getDynamicValue(thread), thread);
							    SubLObject print_readablyX_tail = cdestructuring_bind.property_list_member(print_high.$kw52$READABLY, keys);
							    SubLObject _prev_bind_0_$15 = print_high.$print_readably$.currentBinding(thread);
							    try {
								print_high.$print_readably$.bind(SubLNil.NIL != print_readablyX_tail ? conses_high.cadr(print_readablyX_tail) : print_high.$print_readably$.getDynamicValue(thread), thread);
								SubLObject print_right_marginX_tail = cdestructuring_bind.property_list_member(print_high.$kw53$RIGHT_MARGIN, keys);
								SubLObject _prev_bind_0_$16 = print_high.$print_right_margin$.currentBinding(thread);
								try {
								    print_high.$print_right_margin$.bind(SubLNil.NIL != print_right_marginX_tail ? conses_high.cadr(print_right_marginX_tail) : print_high.$print_right_margin$.getDynamicValue(thread), thread);
								    print_object_wrapper(object, stream);
								} finally {
								    print_high.$print_right_margin$.rebind(_prev_bind_0_$16, thread);
								}
							    } finally {
								print_high.$print_readably$.rebind(_prev_bind_0_$15, thread);
							    }
							} finally {
							    print_high.$print_radix$.rebind(_prev_bind_0_$14, thread);
							}
						    } finally {
							print_high.$print_pretty$.rebind(_prev_bind_0_$13, thread);
						    }
						} finally {
						    print_high.$print_pprint_dispatch$.rebind(_prev_bind_0_$12, thread);
						}
					    } finally {
						print_high.$print_miser_width$.rebind(_prev_bind_0_$11, thread);
					    }
					} finally {
					    print_high.$print_lines$.rebind(_prev_bind_0_$10, thread);
					}
				    } finally {
					print_high.$print_level$.rebind(_prev_bind_0_$9, thread);
				    }
				} finally {
				    print_high.$print_length$.rebind(_prev_bind_0_$8, thread);
				}
			    } finally {
				print_high.$print_gensym$.rebind(_prev_bind_0_$7, thread);
			    }
			} finally {
			    print_high.$print_escape$.rebind(_prev_bind_0_$6, thread);
			}
		    } finally {
			print_high.$print_circle$.rebind(_prev_bind_0_$5, thread);
		    }
		} finally {
		    print_high.$print_case$.rebind(_prev_bind_0_$4, thread);
		}
	    } finally {
		print_high.$print_base$.rebind(_prev_bind_0_$3, thread);
	    }
	} finally {
	    print_high.$print_array$.rebind(_prev_bind_0, thread);
	}
	return object;
    }

    @SubL(source = "sublisp/print-high.lisp", position = 9798L)
    public static SubLObject really_write_to_string(SubLObject object, SubLObject keys) {
	SubLObject result = SubLNil.NIL;
	SubLObject key_set = SubLNil.NIL;
	SubLObject stream = SubLNil.NIL;
	try {
	    stream = streams_high.make_private_string_output_stream();
	    key_set = ConsesLow.cons(stream, keys);
	    key_set = ConsesLow.cons(print_high.$kw38$STREAM, key_set);
	    really_write(object, key_set);
	    result = streams_high.get_output_stream_string(stream);
	} finally {
	    SubLObject _prev_bind_0 = Dynamic.currentBinding(Threads.$is_thread_performing_cleanupP$);
	    try {
		Dynamic.bind(Threads.$is_thread_performing_cleanupP$, CommonSymbols.T);
		SubLObject _values = Values.getValuesAsVector();
		streams_high.close(stream, CommonSymbols.UNPROVIDED);
		Values.restoreValuesFromVector(_values);
	    } finally {
		Dynamic.rebind(Threads.$is_thread_performing_cleanupP$, _prev_bind_0);
	    }
	}
	return result;
    }

    public static SubLObject setup_print_high_file() {
	return SubLNil.NIL;
    }

    @SubL(source = "sublisp/print-high.lisp", position = 3696L)
    public static SubLObject with_printer_state(SubLObject macroform, SubLObject environment) {
	SubLObject current;
	SubLObject datum = current = macroform.rest();
	cdestructuring_bind.destructuring_bind_must_consp(current, datum, print_high.$list3);
	SubLObject temp = current.rest();
	current = current.first();
	SubLObject stream_var = SubLNil.NIL;
	cdestructuring_bind.destructuring_bind_must_consp(current, datum, print_high.$list3);
	stream_var = current.first();
	current = current.rest();
	SubLObject allow_other_keys_p = SubLNil.NIL;
	SubLObject rest = current;
	SubLObject bad = SubLNil.NIL;
	SubLObject current_$1 = SubLNil.NIL;
	while (SubLNil.NIL != rest) {
	    cdestructuring_bind.destructuring_bind_must_consp(rest, datum, print_high.$list3);
	    current_$1 = rest.first();
	    rest = rest.rest();
	    cdestructuring_bind.destructuring_bind_must_consp(rest, datum, print_high.$list3);
	    if (SubLNil.NIL == conses_high.member(current_$1, print_high.$list4, CommonSymbols.UNPROVIDED, CommonSymbols.UNPROVIDED))
		bad = CommonSymbols.T;
	    if (current_$1 == print_high.$kw5$ALLOW_OTHER_KEYS)
		allow_other_keys_p = rest.first();
	    rest = rest.rest();
	}
	if (SubLNil.NIL != bad && SubLNil.NIL == allow_other_keys_p)
	    cdestructuring_bind.cdestructuring_bind_error(datum, print_high.$list3);
	SubLObject newp_tail = cdestructuring_bind.property_list_member(print_high.$kw6$NEWP, current);
	SubLObject newp = SubLNil.NIL != newp_tail ? conses_high.cadr(newp_tail) : SubLNil.NIL;
	SubLObject body;
	current = body = temp;
	SubLObject temp_stream = Symbols.make_symbol(print_high.$str7$TEMP_STREAM);
	SubLObject saved_stream = Symbols.make_symbol(print_high.$str8$SAVED_STREAM);
	SubLObject table = Symbols.make_symbol(print_high.$str9$TABLE);
	SubLObject info = Symbols.make_symbol(print_high.$str10$INFO);
	return ConsesLow.list(print_high.$sym11$PROGN, ConsesLow.list(print_high.$sym12$CSETF, stream_var, ConsesLow.list(print_high.$sym13$OUTPUT_STREAM_DESIGNATOR_STREAM, stream_var)),
		ConsesLow.list(print_high.$sym14$PIF, print_high.$sym15$_PRINT_CIRCLE_, ConsesLow.list(print_high.$sym16$CLET, ConsesLow.list(ConsesLow.list(info, ConsesLow.list(print_high.$sym17$CDR, ConsesLow.listS(print_high.$sym18$ASSOC, stream_var, print_high.$list19)))),
			ConsesLow.list(print_high.$sym14$PIF, ConsesLow.list(print_high.$sym20$CAND, info, ConsesLow.list(print_high.$sym21$CNOT, newp)), reader.bq_cons(print_high.$sym11$PROGN, ConsesLow.append(body, SubLNil.NIL)),
				ConsesLow.list(print_high.$sym16$CLET, ConsesLow.list(reader.bq_cons(table, print_high.$list22), ConsesLow.list(saved_stream, stream_var), reader.bq_cons(temp_stream, print_high.$list23)),
					ConsesLow.list(print_high.$sym16$CLET, ConsesLow.list(ConsesLow.list(print_high.$sym24$_PRINT_CIRCULARITIES_, ConsesLow.listS(print_high.$sym25$CONS, ConsesLow.list(print_high.$sym26$LIST, temp_stream, table), print_high.$list19))),
						ConsesLow.list(print_high.$sym27$CUNWIND_PROTECT, ConsesLow.listS(print_high.$sym11$PROGN, ConsesLow.list(print_high.$sym12$CSETF, stream_var, temp_stream), ConsesLow.append(body, SubLNil.NIL)),
							ConsesLow.list(print_high.$sym12$CSETF, stream_var, saved_stream))),
					ConsesLow.listS(print_high.$sym16$CLET, ConsesLow.list(ConsesLow.list(print_high.$sym24$_PRINT_CIRCULARITIES_, ConsesLow.listS(print_high.$sym25$CONS, ConsesLow.listS(print_high.$sym28$LIST_, stream_var, table, print_high.$list29), print_high.$list19))),
						ConsesLow.append(body, SubLNil.NIL))))),
			reader.bq_cons(print_high.$sym11$PROGN, ConsesLow.append(body, SubLNil.NIL))));
    }

    public static SubLFile me;
    public static String myName = "com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high";
    @SubL(source = "sublisp/print-high.lisp", position = 570L)
    public static SubLSymbol $print_array$;
    @SubL(source = "sublisp/print-high.lisp", position = 1786L)
    public static SubLSymbol $print_base$;
    @SubL(source = "sublisp/print-high.lisp", position = 1812L)
    public static SubLSymbol $print_case$;
    @SubL(source = "sublisp/print-high.lisp", position = 1842L)
    public static SubLSymbol $print_circle$;
    @SubL(source = "sublisp/print-high.lisp", position = 1870L)
    public static SubLSymbol $print_escape$;
    @SubL(source = "sublisp/print-high.lisp", position = 1896L)
    public static SubLSymbol $print_gensym$;
    @SubL(source = "sublisp/print-high.lisp", position = 1922L)
    public static SubLSymbol $print_length$;
    @SubL(source = "sublisp/print-high.lisp", position = 1950L)
    public static SubLSymbol $print_level$;
    @SubL(source = "sublisp/print-high.lisp", position = 1977L)
    public static SubLSymbol $print_lines$;
    @SubL(source = "sublisp/print-high.lisp", position = 2004L)
    public static SubLSymbol $print_miser_width$;
    @SubL(source = "sublisp/print-high.lisp", position = 2037L)
    public static SubLSymbol $print_pprint_dispatch$;
    @SubL(source = "sublisp/print-high.lisp", position = 2074L)
    public static SubLSymbol $print_pretty$;
    @SubL(source = "sublisp/print-high.lisp", position = 2100L)
    public static SubLSymbol $print_radix$;
    @SubL(source = "sublisp/print-high.lisp", position = 2127L)
    public static SubLSymbol $print_readably$;
    @SubL(source = "sublisp/print-high.lisp", position = 2157L)
    public static SubLSymbol $print_right_margin$;
    @SubL(source = "sublisp/print-high.lisp", position = 2191L)
    private static SubLSymbol $print_error$;
    @SubL(source = "sublisp/print-high.lisp", position = 2272L)
    private static SubLSymbol $print_circularities$;
    @SubL(source = "sublisp/print-high.lisp", position = 3286L)
    private static SubLSymbol $print_circle_table_size$;
    @SubL(source = "sublisp/print-high.lisp", position = 6793L)
    public static SubLSymbol $print_object_method_table$;
    private static SubLSymbol $kw0$UPCASE;
    private static SubLInteger $int$64;
    private static SubLString $str2$__Error_printing__S_;
    private static SubLList $list3;
    private static SubLList $list4;
    private static SubLSymbol $kw5$ALLOW_OTHER_KEYS;
    private static SubLSymbol $kw6$NEWP;
    private static SubLString $str7$TEMP_STREAM;
    private static SubLString $str8$SAVED_STREAM;
    private static SubLString $str9$TABLE;
    private static SubLString $str10$INFO;
    private static SubLSymbol $sym11$PROGN;
    private static SubLSymbol $sym12$CSETF;
    private static SubLSymbol $sym13$OUTPUT_STREAM_DESIGNATOR_STREAM;
    private static SubLSymbol $sym14$PIF;
    private static SubLSymbol $sym15$_PRINT_CIRCLE_;
    private static SubLSymbol $sym16$CLET;
    private static SubLSymbol $sym17$CDR;
    private static SubLSymbol $sym18$ASSOC;
    private static SubLList $list19;
    private static SubLSymbol $sym20$CAND;
    private static SubLSymbol $sym21$CNOT;
    private static SubLList $list22;
    private static SubLList $list23;
    private static SubLSymbol $sym24$_PRINT_CIRCULARITIES_;
    private static SubLSymbol $sym25$CONS;
    private static SubLSymbol $sym26$LIST;
    private static SubLSymbol $sym27$CUNWIND_PROTECT;
    private static SubLSymbol $sym28$LIST_;
    private static SubLList $list29;
    private static SubLList $list30;
    private static SubLSymbol $sym31$REFERENCED;
    private static SubLString $str32$__D_;
    private static SubLString $str33$__D__;
    private static SubLSymbol $sym34$DETECTED;
    private static SubLInteger $int$256;
    private static SubLList $list36;
    private static SubLList $list37;
    private static SubLSymbol $kw38$STREAM;
    private static SubLSymbol $kw39$ARRAY;
    private static SubLSymbol $kw40$BASE;
    private static SubLSymbol $kw41$CASE;
    private static SubLSymbol $kw42$CIRCLE;
    private static SubLSymbol $kw43$ESCAPE;
    private static SubLSymbol $kw44$GENSYM;
    private static SubLSymbol $kw45$LENGTH;
    private static SubLSymbol $kw46$LEVEL;
    private static SubLSymbol $kw47$LINES;
    private static SubLSymbol $kw48$MISER_WIDTH;
    private static SubLSymbol $kw49$PPRINT_DISPATCH;
    private static SubLSymbol $kw50$PRETTY;
    private static SubLSymbol $kw51$RADIX;
    private static SubLSymbol $kw52$READABLY;
    private static SubLSymbol $kw53$RIGHT_MARGIN;
    private static SubLString $str54$_S_cannot_be_printed_readably_;
    static {
	me = new print_high();
	print_high.$print_array$ = null;
	print_high.$print_base$ = null;
	print_high.$print_case$ = null;
	print_high.$print_circle$ = null;
	print_high.$print_escape$ = null;
	print_high.$print_gensym$ = null;
	print_high.$print_length$ = null;
	print_high.$print_level$ = null;
	print_high.$print_lines$ = null;
	print_high.$print_miser_width$ = null;
	print_high.$print_pprint_dispatch$ = null;
	print_high.$print_pretty$ = null;
	print_high.$print_radix$ = null;
	print_high.$print_readably$ = null;
	print_high.$print_right_margin$ = null;
	print_high.$print_error$ = null;
	print_high.$print_circularities$ = null;
	print_high.$print_circle_table_size$ = null;
	print_high.$print_object_method_table$ = null;
	$kw0$UPCASE = SubLObjectFactory.makeKeyword("UPCASE");
	$int$64 = SubLObjectFactory.makeInteger(64);
	$str2$__Error_printing__S_ = SubLObjectFactory.makeString("#<Error printing ~S>");
	$list3 = ConsesLow.list(ConsesLow.list(SubLObjectFactory.makeSymbol("STREAM-VAR"), SubLObjectFactory.makeSymbol("&KEY"), SubLObjectFactory.makeSymbol("NEWP")), SubLObjectFactory.makeSymbol("&BODY"), SubLObjectFactory.makeSymbol("BODY"));
	$list4 = ConsesLow.list(SubLObjectFactory.makeKeyword("NEWP"));
	$kw5$ALLOW_OTHER_KEYS = SubLObjectFactory.makeKeyword("ALLOW-OTHER-KEYS");
	$kw6$NEWP = SubLObjectFactory.makeKeyword("NEWP");
	$str7$TEMP_STREAM = SubLObjectFactory.makeString("TEMP-STREAM");
	$str8$SAVED_STREAM = SubLObjectFactory.makeString("SAVED-STREAM");
	$str9$TABLE = SubLObjectFactory.makeString("TABLE");
	$str10$INFO = SubLObjectFactory.makeString("INFO");
	$sym11$PROGN = SubLObjectFactory.makeSymbol("PROGN");
	$sym12$CSETF = SubLObjectFactory.makeSymbol("CSETF");
	$sym13$OUTPUT_STREAM_DESIGNATOR_STREAM = SubLObjectFactory.makeSymbol("OUTPUT-STREAM-DESIGNATOR-STREAM");
	$sym14$PIF = SubLObjectFactory.makeSymbol("PIF");
	$sym15$_PRINT_CIRCLE_ = SubLObjectFactory.makeSymbol("*PRINT-CIRCLE*");
	$sym16$CLET = SubLObjectFactory.makeSymbol("CLET");
	$sym17$CDR = SubLObjectFactory.makeSymbol("CDR");
	$sym18$ASSOC = SubLObjectFactory.makeSymbol("ASSOC");
	$list19 = ConsesLow.list(SubLObjectFactory.makeSymbol("*PRINT-CIRCULARITIES*"));
	$sym20$CAND = SubLObjectFactory.makeSymbol("CAND");
	$sym21$CNOT = SubLObjectFactory.makeSymbol("CNOT");
	$list22 = ConsesLow.list(ConsesLow.list(SubLObjectFactory.makeSymbol("MAKE-HASH-TABLE"), SubLObjectFactory.makeSymbol("*PRINT-CIRCLE-TABLE-SIZE*"), ConsesLow.list(SubLObjectFactory.makeSymbol("FUNCTION"), CommonSymbols.EQ)));
	$list23 = ConsesLow.list(ConsesLow.list(SubLObjectFactory.makeSymbol("MAKE-BROADCAST-STREAM"), SubLNil.NIL));
	$sym24$_PRINT_CIRCULARITIES_ = SubLObjectFactory.makeSymbol("*PRINT-CIRCULARITIES*");
	$sym25$CONS = SubLObjectFactory.makeSymbol("CONS");
	$sym26$LIST = SubLObjectFactory.makeSymbol("LIST");
	$sym27$CUNWIND_PROTECT = SubLObjectFactory.makeSymbol("CUNWIND-PROTECT");
	$sym28$LIST_ = SubLObjectFactory.makeSymbol("LIST*");
	$list29 = ConsesLow.list(CommonSymbols.ZERO_INTEGER);
	$list30 = ConsesLow.cons(SubLObjectFactory.makeSymbol("TABLE"), SubLObjectFactory.makeSymbol("COUNTER"));
	$sym31$REFERENCED = SubLObjectFactory.makeSymbol("REFERENCED");
	$str32$__D_ = SubLObjectFactory.makeString("#~D=");
	$str33$__D__ = SubLObjectFactory.makeString("#~D# ");
	$sym34$DETECTED = SubLObjectFactory.makeSymbol("DETECTED");
	$int$256 = SubLObjectFactory.makeInteger(256);
	$list36 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeSymbol("&KEY"), ConsesLow.list(SubLObjectFactory.makeSymbol("STREAM"), SubLObjectFactory.makeSymbol("*STANDARD-OUTPUT*")),
		ConsesLow.list(ConsesLow.list(SubLObjectFactory.makeKeyword("ARRAY"), SubLObjectFactory.makeSymbol("*PRINT-ARRAY*")), SubLObjectFactory.makeSymbol("*PRINT-ARRAY*")),
		ConsesLow.list(ConsesLow.list(SubLObjectFactory.makeKeyword("BASE"), SubLObjectFactory.makeSymbol("*PRINT-BASE*")), SubLObjectFactory.makeSymbol("*PRINT-BASE*")),
		ConsesLow.list(ConsesLow.list(SubLObjectFactory.makeKeyword("CASE"), SubLObjectFactory.makeSymbol("*PRINT-CASE*")), SubLObjectFactory.makeSymbol("*PRINT-CASE*")),
		ConsesLow.list(ConsesLow.list(SubLObjectFactory.makeKeyword("CIRCLE"), SubLObjectFactory.makeSymbol("*PRINT-CIRCLE*")), SubLObjectFactory.makeSymbol("*PRINT-CIRCLE*")),
		ConsesLow.list(ConsesLow.list(SubLObjectFactory.makeKeyword("ESCAPE"), SubLObjectFactory.makeSymbol("*PRINT-ESCAPE*")), SubLObjectFactory.makeSymbol("*PRINT-ESCAPE*")),
		ConsesLow.list(ConsesLow.list(SubLObjectFactory.makeKeyword("GENSYM"), SubLObjectFactory.makeSymbol("*PRINT-GENSYM*")), SubLObjectFactory.makeSymbol("*PRINT-GENSYM*")),
		ConsesLow.list(ConsesLow.list(SubLObjectFactory.makeKeyword("LENGTH"), SubLObjectFactory.makeSymbol("*PRINT-LENGTH*")), SubLObjectFactory.makeSymbol("*PRINT-LENGTH*")),
		ConsesLow.list(ConsesLow.list(SubLObjectFactory.makeKeyword("LEVEL"), SubLObjectFactory.makeSymbol("*PRINT-LEVEL*")), SubLObjectFactory.makeSymbol("*PRINT-LEVEL*")),
		ConsesLow.list(ConsesLow.list(SubLObjectFactory.makeKeyword("LINES"), SubLObjectFactory.makeSymbol("*PRINT-LINES*")), SubLObjectFactory.makeSymbol("*PRINT-LINES*")),
		ConsesLow.list(ConsesLow.list(SubLObjectFactory.makeKeyword("MISER-WIDTH"), SubLObjectFactory.makeSymbol("*PRINT-MISER-WIDTH*")), SubLObjectFactory.makeSymbol("*PRINT-MISER-WIDTH*")),
		ConsesLow.list(ConsesLow.list(SubLObjectFactory.makeKeyword("PPRINT-DISPATCH"), SubLObjectFactory.makeSymbol("*PRINT-PPRINT-DISPATCH*")), SubLObjectFactory.makeSymbol("*PRINT-PPRINT-DISPATCH*")),
		ConsesLow.list(ConsesLow.list(SubLObjectFactory.makeKeyword("PRETTY"), SubLObjectFactory.makeSymbol("*PRINT-PRETTY*")), SubLObjectFactory.makeSymbol("*PRINT-PRETTY*")),
		ConsesLow.list(ConsesLow.list(SubLObjectFactory.makeKeyword("RADIX"), SubLObjectFactory.makeSymbol("*PRINT-RADIX*")), SubLObjectFactory.makeSymbol("*PRINT-RADIX*")),
		ConsesLow.list(ConsesLow.list(SubLObjectFactory.makeKeyword("READABLY"), SubLObjectFactory.makeSymbol("*PRINT-READABLY*")), SubLObjectFactory.makeSymbol("*PRINT-READABLY*")),
		ConsesLow.list(ConsesLow.list(SubLObjectFactory.makeKeyword("RIGHT-MARGIN"), SubLObjectFactory.makeSymbol("*PRINT-RIGHT-MARGIN*")), SubLObjectFactory.makeSymbol("*PRINT-RIGHT-MARGIN*")) });
	$list37 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("STREAM"), SubLObjectFactory.makeKeyword("ARRAY"), SubLObjectFactory.makeKeyword("BASE"), SubLObjectFactory.makeKeyword("CASE"), SubLObjectFactory.makeKeyword("CIRCLE"), SubLObjectFactory.makeKeyword("ESCAPE"),
		SubLObjectFactory.makeKeyword("GENSYM"), SubLObjectFactory.makeKeyword("LENGTH"), SubLObjectFactory.makeKeyword("LEVEL"), SubLObjectFactory.makeKeyword("LINES"), SubLObjectFactory.makeKeyword("MISER-WIDTH"), SubLObjectFactory.makeKeyword("PPRINT-DISPATCH"),
		SubLObjectFactory.makeKeyword("PRETTY"), SubLObjectFactory.makeKeyword("RADIX"), SubLObjectFactory.makeKeyword("READABLY"), SubLObjectFactory.makeKeyword("RIGHT-MARGIN") });
	$kw38$STREAM = SubLObjectFactory.makeKeyword("STREAM");
	$kw39$ARRAY = SubLObjectFactory.makeKeyword("ARRAY");
	$kw40$BASE = SubLObjectFactory.makeKeyword("BASE");
	$kw41$CASE = SubLObjectFactory.makeKeyword("CASE");
	$kw42$CIRCLE = SubLObjectFactory.makeKeyword("CIRCLE");
	$kw43$ESCAPE = SubLObjectFactory.makeKeyword("ESCAPE");
	$kw44$GENSYM = SubLObjectFactory.makeKeyword("GENSYM");
	$kw45$LENGTH = SubLObjectFactory.makeKeyword("LENGTH");
	$kw46$LEVEL = SubLObjectFactory.makeKeyword("LEVEL");
	$kw47$LINES = SubLObjectFactory.makeKeyword("LINES");
	$kw48$MISER_WIDTH = SubLObjectFactory.makeKeyword("MISER-WIDTH");
	$kw49$PPRINT_DISPATCH = SubLObjectFactory.makeKeyword("PPRINT-DISPATCH");
	$kw50$PRETTY = SubLObjectFactory.makeKeyword("PRETTY");
	$kw51$RADIX = SubLObjectFactory.makeKeyword("RADIX");
	$kw52$READABLY = SubLObjectFactory.makeKeyword("READABLY");
	$kw53$RIGHT_MARGIN = SubLObjectFactory.makeKeyword("RIGHT-MARGIN");
	$str54$_S_cannot_be_printed_readably_ = SubLObjectFactory.makeString("~S cannot be printed readably.");
    }

    @Override
    public void declareFunctions() {
	declare_print_high_file();
    }

    @Override
    public void initializeVariables() {
	init_print_high_file();
    }

    @Override
    public void runTopLevelForms() {
	setup_print_high_file();
    }
}
