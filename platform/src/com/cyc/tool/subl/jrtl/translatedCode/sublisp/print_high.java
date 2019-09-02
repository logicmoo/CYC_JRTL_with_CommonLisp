/**
 *
 */
/**
 * For LarKC
 */
/**
 *
 */
package com.cyc.tool.subl.jrtl.translatedCode.sublisp;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.*;


import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_newline;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_space;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.append;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.cons;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.listS;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.rplacd;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.bind;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.currentBinding;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.rebind;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions.funcall;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions.print_function;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.gethash;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.sethash;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.add;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow.format;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures.method_func;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.make_symbol;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.$is_thread_performing_cleanupP$;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.type_of;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.getValuesAsVector;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.restoreValuesFromVector;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors.make_vector;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeBoolean;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeKeyword;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeString;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeSymbol;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.cdestructuring_bind_error;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.destructuring_bind_must_consp;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.property_list_member;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.assoc;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.cadr;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.member;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader.bq_cons;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.close;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.get_output_stream_string;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.make_private_string_output_stream;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.write_char;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.write_string;
import static com.cyc.tool.subl.util.SubLFiles.declareFunction;
import static com.cyc.tool.subl.util.SubLFiles.declareMacro;
import static com.cyc.tool.subl.util.SubLFiles.deflexical;
import static com.cyc.tool.subl.util.SubLFiles.defparameter;
import static com.cyc.tool.subl.util.SubLFiles.defvarCheckCL;

import org.armedbear.lisp.LispObject;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.StreamsLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLNil;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public class print_high extends SubLTranslatedFile {
    public static SubLObject circular_reference_p(SubLObject object, SubLObject stream) {
	SubLThread thread = SubLProcess.currentSubLThread();
	if ((SubLNil.NIL != $print_circle$.getDynamicValue(thread)) && (SubLNil.NIL == read_print_eq(object))) {
	    SubLObject info = assoc(stream, $print_circularities$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED).rest();
	    if (SubLNil.NIL != info) {
		SubLObject current;
		SubLObject datum = current = info;
		SubLObject table = SubLNil.NIL;
		SubLObject counter = SubLNil.NIL;
		destructuring_bind_must_consp(current, datum, $list30);
		table = current.first();
		current = counter = current.rest();
		SubLObject state = gethash(object, table, UNPROVIDED);
		if ((state == REFERENCED) || state.isNumber())
		    return T;

		if (state == DETECTED) {
		    sethash(object, table, REFERENCED);
		    return T;
		}
		if (SubLNil.NIL == counter)
		    sethash(object, table, DETECTED);

	    }
	}
	return SubLNil.NIL;
    }

    public static SubLObject declare_print_high_file() {
	declareFunction("read_print_eq", "READ-PRINT-EQ", 1, 0, false);
	declareFunction("print_error", "PRINT-ERROR", 2, 0, false);
	declareMacro("with_printer_state", "WITH-PRINTER-STATE");
	declareFunction("handle_circularity", "HANDLE-CIRCULARITY", 2, 0, false);
	declareFunction("circular_reference_p", "CIRCULAR-REFERENCE-P", 2, 0, false);
	declareFunction("print_object", "PRINT-OBJECT", 2, 0, false);
	declareFunction("print_object_wrapper", "PRINT-OBJECT-WRAPPER", 2, 0, false);
	declareFunction("really_write", "REALLY-WRITE", 2, 0, false);
	declareFunction("prin1", "PRIN1", 1, 1, false);
	declareFunction("print", "PRINT", 1, 1, false);
	declareFunction("princ", "PRINC", 1, 1, false);
	declareFunction("really_write_to_string", "REALLY-WRITE-TO-STRING", 2, 0, false);
	declareFunction("prin1_to_string", "PRIN1-TO-STRING", 1, 0, false);
	declareFunction("princ_to_string", "PRINC-TO-STRING", 1, 0, false);
	declareFunction("print_not_readable", "PRINT-NOT-READABLE", 2, 0, false);
	return SubLNil.NIL;
    }

    public static SubLObject handle_circularity(SubLObject object, SubLObject stream) {
	SubLThread thread = SubLProcess.currentSubLThread();
	SubLObject info = assoc(stream, $print_circularities$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED).rest();
	if (SubLNil.NIL != info) {
	    SubLObject current;
	    SubLObject datum = current = info;
	    SubLObject table = SubLNil.NIL;
	    SubLObject counter = SubLNil.NIL;
	    destructuring_bind_must_consp(current, datum, $list30);
	    table = current.first();
	    current = counter = current.rest();
	    if (SubLNil.NIL == counter)
		return SubLNil.NIL;

	    SubLObject state = gethash(object, table, UNPROVIDED);
	    if (state == REFERENCED) {
		counter = add(counter, ONE_INTEGER);
		rplacd(info, counter);
		format(stream, $str32$__D_, counter);
	    } else if (state.isNumber()) {
		format(stream, $str33$__D__, state);
		return SubLNil.NIL;
	    }

	}
	print_object(object, stream);
	return SubLNil.NIL;
    }

    public static SubLObject init_print_high_file() {
	defvarCheckCL("*PRINT-ARRAY*", T);
	defvarCheckCL("*PRINT-BASE*", TEN_INTEGER);
	defvarCheckCL("*PRINT-CASE*", $UPCASE);
	defvarCheckCL("*PRINT-CIRCLE*", SubLNil.NIL);
	defvarCheckCL("*PRINT-ESCAPE*", T);
	defvarCheckCL("*PRINT-GENSYM*", T);
	defvarCheckCL("*PRINT-LENGTH*", SubLNil.NIL);
	defvarCheckCL("*PRINT-LEVEL*", SubLNil.NIL);
	defvarCheckCL("*PRINT-LINES*", SubLNil.NIL);
	defvarCheckCL("*PRINT-MISER-WIDTH*", SubLNil.NIL);
	defvarCheckCL("*PRINT-PPRINT-DISPATCH*", SubLNil.NIL);
	defvarCheckCL("*PRINT-PRETTY*", T);
	defvarCheckCL("*PRINT-RADIX*", SubLNil.NIL);
	defvarCheckCL("*PRINT-READABLY*", SubLNil.NIL);
	defvarCheckCL("*PRINT-RIGHT-MARGIN*", SubLNil.NIL);
	defvarCheckCL("*PRINT-ERROR*", SubLNil.NIL);
	defvarCheckCL("*PRINT-CIRCULARITIES*", SubLNil.NIL);
	defparameter("*PRINT-CIRCLE-TABLE-SIZE*", $int$64);
	deflexical("*PRINT-OBJECT-METHOD-TABLE*", make_vector($int$256, SubLNil.NIL));
	return SubLNil.NIL;
    }

    public static SubLObject prin1(SubLObject object, SubLObject stream) {
	if (stream == UNPROVIDED)
	    stream = StreamsLow.$standard_output$.getDynamicValue();

	SubLThread thread = SubLProcess.currentSubLThread();
	SubLObject _prev_bind_0 = $print_escape$.currentBinding(thread);
	try {
	    $print_escape$.bind(T, thread);
	    print_object_wrapper(object, stream);
	} finally {
	    $print_escape$.rebind(_prev_bind_0, thread);
	}
	return object;
    }

    public static SubLObject prin1_to_string(SubLObject object) {
	SubLObject result = SubLNil.NIL;
	SubLObject stream = SubLNil.NIL;
	try {
	    stream = make_private_string_output_stream();
	    prin1(object, stream);
	    result = get_output_stream_string(stream);
	} finally {
	    SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
	    try {
		bind($is_thread_performing_cleanupP$, T);
		SubLObject _values = getValuesAsVector();
		close(stream, UNPROVIDED);
		restoreValuesFromVector(_values);
	    } finally {
		rebind($is_thread_performing_cleanupP$, _prev_bind_0);
	    }
	}
	return result;
    }

    public static SubLObject princ(SubLObject object, SubLObject stream) {
	if (stream == UNPROVIDED)
	    stream = StreamsLow.$standard_output$.getDynamicValue();

	SubLThread thread = SubLProcess.currentSubLThread();
	SubLObject _prev_bind_0 = $print_escape$.currentBinding(thread);
	SubLObject _prev_bind_2 = $print_readably$.currentBinding(thread);
	try {
	    $print_escape$.bind(SubLNil.NIL, thread);
	    $print_readably$.bind(SubLNil.NIL, thread);
	    if (object.isString())
		write_string(object, stream, UNPROVIDED, UNPROVIDED);
	    else if (object.isChar())
		write_char(object, stream);
	    else
		print_object_wrapper(object, stream);

	} finally {
	    $print_readably$.rebind(_prev_bind_2, thread);
	    $print_escape$.rebind(_prev_bind_0, thread);
	}
	return object;
    }

    public static SubLObject princ_to_string(SubLObject object) {
	SubLObject result = SubLNil.NIL;
	SubLObject stream = SubLNil.NIL;
	try {
	    stream = make_private_string_output_stream();
	    princ(object, stream);
	    result = get_output_stream_string(stream);
	} finally {
	    SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
	    try {
		bind($is_thread_performing_cleanupP$, T);
		SubLObject _values = getValuesAsVector();
		close(stream, UNPROVIDED);
		restoreValuesFromVector(_values);
	    } finally {
		rebind($is_thread_performing_cleanupP$, _prev_bind_0);
	    }
	}
	return result;
    }

    public static SubLObject print(SubLObject object, SubLObject stream) {
	if (stream == UNPROVIDED)
	    stream = StreamsLow.$standard_output$.getDynamicValue();

	write_char(CHAR_newline, stream);
	prin1(object, stream);
	write_char(CHAR_space, stream);
	return object;
    }

    public static SubLObject print_error(SubLObject object, SubLObject stream) {
	format(stream, $str2$__Error_printing__S_, type_of(object));
	return SubLNil.NIL;
    }

    public static SubLObject print_not_readable(SubLObject object, SubLObject stream) {
	SubLThread thread = SubLProcess.currentSubLThread();
	SubLObject _prev_bind_0 = $print_readably$.currentBinding(thread);
	try {
	    $print_readably$.bind(SubLNil.NIL, thread);
	    if (object instanceof LispObject) {
		try {
		    String string = ((LispObject) (object)).printObject();
		    write_string(makeString(string), stream, UNPROVIDED, UNPROVIDED);
		    return SubLNil.NIL;
		} catch (Throwable t) {
		    t.printStackTrace();
		}
	    }
	    Errors.error($str54$_S_cannot_be_printed_readably_, object);
	} finally {
	    $print_readably$.rebind(_prev_bind_0, thread);
	}
	return SubLNil.NIL;
    }

    public static SubLObject print_object(SubLObject object, SubLObject stream) {
	SubLThread thread = SubLProcess.currentSubLThread();
	SubLObject method_function = method_func(object, $print_object_method_table$.getGlobalValue());
	if (SubLNil.NIL != method_function)
	    return funcall(method_function, object, stream);

	if (SubLNil.NIL != $print_readably$.getDynamicValue(thread))
	    print_not_readable(object, stream);
	else {
	    print_macros.print_unreadable_object_preamble(stream, object, T, SubLNil.NIL);
	    print_macros.print_unreadable_object_postamble(stream, object, T, T);
	}
	return object;
    }

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
	    print_function(object, stream);
	else if (object.isDouble())
	    print_functions.print_flonum(object, stream);
	else
	    print_object(object, stream);

	return object;
    }

    public static SubLObject read_print_eq(SubLObject object) {
	return makeBoolean((object.isSymbol() || object.isFixnum()) || object.isChar());
    }

    public static SubLObject really_write(SubLObject object, SubLObject keys) {
	SubLThread thread = SubLProcess.currentSubLThread();
	SubLObject allow_other_keys_p = SubLNil.NIL;
	SubLObject rest = keys;
	SubLObject bad = SubLNil.NIL;
	SubLObject current_$2 = SubLNil.NIL;
	while (SubLNil.NIL != rest) {
	    destructuring_bind_must_consp(rest, keys, $list36);
	    current_$2 = rest.first();
	    rest = rest.rest();
	    destructuring_bind_must_consp(rest, keys, $list36);
	    if (SubLNil.NIL == member(current_$2, $list37, UNPROVIDED, UNPROVIDED))
		bad = T;

	    if (current_$2 == $ALLOW_OTHER_KEYS)
		allow_other_keys_p = rest.first();

	    rest = rest.rest();
	}
	if ((SubLNil.NIL != bad) && (SubLNil.NIL == allow_other_keys_p))
	    cdestructuring_bind_error(keys, $list36);

	SubLObject stream_tail = property_list_member($STREAM, keys);
	SubLObject stream = (SubLNil.NIL != stream_tail) ? cadr(stream_tail) : StreamsLow.$standard_output$.getDynamicValue(thread);
	SubLObject print_arrayX_tail = property_list_member($ARRAY, keys);
	SubLObject _prev_bind_0 = $print_array$.currentBinding(thread);
	try {
	    $print_array$.bind(SubLNil.NIL != print_arrayX_tail ? cadr(print_arrayX_tail) : $print_array$.getDynamicValue(thread), thread);
	    SubLObject print_baseX_tail = property_list_member($BASE, keys);
	    SubLObject _prev_bind_0_$3 = $print_base$.currentBinding(thread);
	    try {
		$print_base$.bind(SubLNil.NIL != print_baseX_tail ? cadr(print_baseX_tail) : $print_base$.getDynamicValue(thread), thread);
		SubLObject print_caseX_tail = property_list_member($CASE, keys);
		SubLObject _prev_bind_0_$4 = $print_case$.currentBinding(thread);
		try {
		    $print_case$.bind(SubLNil.NIL != print_caseX_tail ? cadr(print_caseX_tail) : $print_case$.getDynamicValue(thread), thread);
		    SubLObject print_circleX_tail = property_list_member($CIRCLE, keys);
		    SubLObject _prev_bind_0_$5 = $print_circle$.currentBinding(thread);
		    try {
			$print_circle$.bind(SubLNil.NIL != print_circleX_tail ? cadr(print_circleX_tail) : $print_circle$.getDynamicValue(thread), thread);
			SubLObject print_escapeX_tail = property_list_member($ESCAPE, keys);
			SubLObject _prev_bind_0_$6 = $print_escape$.currentBinding(thread);
			try {
			    $print_escape$.bind(SubLNil.NIL != print_escapeX_tail ? cadr(print_escapeX_tail) : $print_escape$.getDynamicValue(thread), thread);
			    SubLObject print_gensymX_tail = property_list_member($GENSYM, keys);
			    SubLObject _prev_bind_0_$7 = $print_gensym$.currentBinding(thread);
			    try {
				$print_gensym$.bind(SubLNil.NIL != print_gensymX_tail ? cadr(print_gensymX_tail) : $print_gensym$.getDynamicValue(thread), thread);
				SubLObject print_lengthX_tail = property_list_member($LENGTH, keys);
				SubLObject _prev_bind_0_$8 = $print_length$.currentBinding(thread);
				try {
				    $print_length$.bind(SubLNil.NIL != print_lengthX_tail ? cadr(print_lengthX_tail) : $print_length$.getDynamicValue(thread), thread);
				    SubLObject print_levelX_tail = property_list_member($LEVEL, keys);
				    SubLObject _prev_bind_0_$9 = $print_level$.currentBinding(thread);
				    try {
					$print_level$.bind(SubLNil.NIL != print_levelX_tail ? cadr(print_levelX_tail) : $print_level$.getDynamicValue(thread), thread);
					SubLObject print_linesX_tail = property_list_member($LINES, keys);
					SubLObject _prev_bind_0_$10 = $print_lines$.currentBinding(thread);
					try {
					    $print_lines$.bind(SubLNil.NIL != print_linesX_tail ? cadr(print_linesX_tail) : $print_lines$.getDynamicValue(thread), thread);
					    SubLObject print_miser_widthX_tail = property_list_member($MISER_WIDTH, keys);
					    SubLObject _prev_bind_0_$11 = $print_miser_width$.currentBinding(thread);
					    try {
						$print_miser_width$.bind(SubLNil.NIL != print_miser_widthX_tail ? cadr(print_miser_widthX_tail) : $print_miser_width$.getDynamicValue(thread), thread);
						SubLObject print_pprint_dispatchX_tail = property_list_member($PPRINT_DISPATCH, keys);
						SubLObject _prev_bind_0_$12 = $print_pprint_dispatch$.currentBinding(thread);
						try {
						    $print_pprint_dispatch$.bind(SubLNil.NIL != print_pprint_dispatchX_tail ? cadr(print_pprint_dispatchX_tail) : $print_pprint_dispatch$.getDynamicValue(thread), thread);
						    SubLObject print_prettyX_tail = property_list_member($PRETTY, keys);
						    SubLObject _prev_bind_0_$13 = $print_pretty$.currentBinding(thread);
						    try {
							$print_pretty$.bind(SubLNil.NIL != print_prettyX_tail ? cadr(print_prettyX_tail) : $print_pretty$.getDynamicValue(thread), thread);
							SubLObject print_radixX_tail = property_list_member($RADIX, keys);
							SubLObject _prev_bind_0_$14 = $print_radix$.currentBinding(thread);
							try {
							    $print_radix$.bind(SubLNil.NIL != print_radixX_tail ? cadr(print_radixX_tail) : $print_radix$.getDynamicValue(thread), thread);
							    SubLObject print_readablyX_tail = property_list_member($READABLY, keys);
							    SubLObject _prev_bind_0_$15 = $print_readably$.currentBinding(thread);
							    try {
								$print_readably$.bind(SubLNil.NIL != print_readablyX_tail ? cadr(print_readablyX_tail) : $print_readably$.getDynamicValue(thread), thread);
								SubLObject print_right_marginX_tail = property_list_member($RIGHT_MARGIN, keys);
								SubLObject _prev_bind_0_$16 = $print_right_margin$.currentBinding(thread);
								try {
								    $print_right_margin$.bind(SubLNil.NIL != print_right_marginX_tail ? cadr(print_right_marginX_tail) : $print_right_margin$.getDynamicValue(thread), thread);
								    print_object_wrapper(object, stream);
								} finally {
								    $print_right_margin$.rebind(_prev_bind_0_$16, thread);
								}
							    } finally {
								$print_readably$.rebind(_prev_bind_0_$15, thread);
							    }
							} finally {
							    $print_radix$.rebind(_prev_bind_0_$14, thread);
							}
						    } finally {
							$print_pretty$.rebind(_prev_bind_0_$13, thread);
						    }
						} finally {
						    $print_pprint_dispatch$.rebind(_prev_bind_0_$12, thread);
						}
					    } finally {
						$print_miser_width$.rebind(_prev_bind_0_$11, thread);
					    }
					} finally {
					    $print_lines$.rebind(_prev_bind_0_$10, thread);
					}
				    } finally {
					$print_level$.rebind(_prev_bind_0_$9, thread);
				    }
				} finally {
				    $print_length$.rebind(_prev_bind_0_$8, thread);
				}
			    } finally {
				$print_gensym$.rebind(_prev_bind_0_$7, thread);
			    }
			} finally {
			    $print_escape$.rebind(_prev_bind_0_$6, thread);
			}
		    } finally {
			$print_circle$.rebind(_prev_bind_0_$5, thread);
		    }
		} finally {
		    $print_case$.rebind(_prev_bind_0_$4, thread);
		}
	    } finally {
		$print_base$.rebind(_prev_bind_0_$3, thread);
	    }
	} finally {
	    $print_array$.rebind(_prev_bind_0, thread);
	}
	return object;
    }

    public static SubLObject really_write_to_string(SubLObject object, SubLObject keys) {
	SubLObject result = SubLNil.NIL;
	SubLObject key_set = SubLNil.NIL;
	SubLObject stream = SubLNil.NIL;
	try {
	    stream = make_private_string_output_stream();
	    key_set = cons(stream, keys);
	    key_set = cons($STREAM, key_set);
	    really_write(object, key_set);
	    result = get_output_stream_string(stream);
	} finally {
	    SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
	    try {
		bind($is_thread_performing_cleanupP$, T);
		SubLObject _values = getValuesAsVector();
		close(stream, UNPROVIDED);
		restoreValuesFromVector(_values);
	    } finally {
		rebind($is_thread_performing_cleanupP$, _prev_bind_0);
	    }
	}
	return result;
    }

    public static SubLObject setup_print_high_file() {
	return SubLNil.NIL;
    }

    public static SubLObject with_printer_state(SubLObject macroform, SubLObject environment) {
	SubLObject current;
	SubLObject datum = current = macroform.rest();
	destructuring_bind_must_consp(current, datum, $list3);
	SubLObject temp = current.rest();
	current = current.first();
	SubLObject stream_var = SubLNil.NIL;
	destructuring_bind_must_consp(current, datum, $list3);
	stream_var = current.first();
	current = current.rest();
	SubLObject allow_other_keys_p = SubLNil.NIL;
	SubLObject rest = current;
	SubLObject bad = SubLNil.NIL;
	SubLObject current_$1 = SubLNil.NIL;
	while (SubLNil.NIL != rest) {
	    destructuring_bind_must_consp(rest, datum, $list3);
	    current_$1 = rest.first();
	    rest = rest.rest();
	    destructuring_bind_must_consp(rest, datum, $list3);
	    if (SubLNil.NIL == member(current_$1, $list4, UNPROVIDED, UNPROVIDED))
		bad = T;

	    if (current_$1 == $ALLOW_OTHER_KEYS)
		allow_other_keys_p = rest.first();

	    rest = rest.rest();
	}
	if ((SubLNil.NIL != bad) && (SubLNil.NIL == allow_other_keys_p))
	    cdestructuring_bind_error(datum, $list3);

	SubLObject newp_tail = property_list_member($NEWP, current);
	SubLObject newp = (SubLNil.NIL != newp_tail) ? cadr(newp_tail) : SubLNil.NIL;
	SubLObject body;
	current = body = temp;
	SubLObject temp_stream = make_symbol($str7$TEMP_STREAM);
	SubLObject saved_stream = make_symbol($str8$SAVED_STREAM);
	SubLObject table = make_symbol($$$TABLE);
	SubLObject info = make_symbol($$$INFO);
	return list(PROGN, list(CSETF, stream_var, list(OUTPUT_STREAM_DESIGNATOR_STREAM, stream_var)),
		list(PIF, $print_circle$,
			list(CLET, list(list(info, list(CDR, listS(ASSOC, stream_var, $list19)))),
				list(PIF, list(CAND, info, list(CNOT, newp)), bq_cons(PROGN, append(body, SubLNil.NIL)),
					list(CLET, list(bq_cons(table, $list22), list(saved_stream, stream_var), bq_cons(temp_stream, $list23)),
						list(CLET, list(list($print_circularities$, listS(CONS, list(LIST, temp_stream, table), $list19))), list(CUNWIND_PROTECT, listS(PROGN, list(CSETF, stream_var, temp_stream), append(body, SubLNil.NIL)), list(CSETF, stream_var, saved_stream))),
						listS(CLET, list(list($print_circularities$, listS(CONS, listS($sym28$LIST_, stream_var, table, $list29), $list19))), append(body, SubLNil.NIL))))),
			bq_cons(PROGN, append(body, SubLNil.NIL))));
    }

    public static final SubLFile me = new print_high();

    public static final String myName = "com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high";

    // defvarCheckCL
    // Definitions
    public static final SubLSymbol $print_array$ = makeSymbol("*PRINT-ARRAY*");

    // defvarCheckCL
    public static final SubLSymbol $print_base$ = makeSymbol("*PRINT-BASE*");

    // defvarCheckCL
    public static final SubLSymbol $print_case$ = makeSymbol("*PRINT-CASE*");

    // defvarCheckCL
    public static final SubLSymbol $print_escape$ = makeSymbol("*PRINT-ESCAPE*");

    // defvarCheckCL
    public static final SubLSymbol $print_gensym$ = makeSymbol("*PRINT-GENSYM*");

    // defvarCheckCL
    public static final SubLSymbol $print_lines$ = makeSymbol("*PRINT-LINES*");

    // defvarCheckCL
    public static final SubLSymbol $print_miser_width$ = makeSymbol("*PRINT-MISER-WIDTH*");

    // defvarCheckCL
    public static final SubLSymbol $print_pprint_dispatch$ = makeSymbol("*PRINT-PPRINT-DISPATCH*");

    // defvarCheckCL
    public static final SubLSymbol $print_pretty$ = makeSymbol("*PRINT-PRETTY*");

    // defvarCheckCL
    public static final SubLSymbol $print_radix$ = makeSymbol("*PRINT-RADIX*");

    // defvarCheckCL
    public static final SubLSymbol $print_readably$ = makeSymbol("*PRINT-READABLY*");

    // defvarCheckCL
    public static final SubLSymbol $print_right_margin$ = makeSymbol("*PRINT-RIGHT-MARGIN*");

    // defvarCheckCL
    private static final SubLSymbol $print_error$ = makeSymbol("*PRINT-ERROR*");

    // defparameter
    private static final SubLSymbol $print_circle_table_size$ = makeSymbol("*PRINT-CIRCLE-TABLE-SIZE*");

    // deflexical
    public static final SubLSymbol $print_object_method_table$ = makeSymbol("*PRINT-OBJECT-METHOD-TABLE*");

    public static final SubLString $str2$__Error_printing__S_ = makeString("#<Error printing ~S>");

    public static final SubLList $list3 = list(list(makeSymbol("STREAM-VAR"), makeSymbol("&KEY"), makeSymbol("NEWP")), makeSymbol("&BODY"), makeSymbol("BODY"));

    public static final SubLList $list4 = list(makeKeyword("NEWP"));

    public static final SubLSymbol $ALLOW_OTHER_KEYS = makeKeyword("ALLOW-OTHER-KEYS");

    public static final SubLSymbol $NEWP = makeKeyword("NEWP");

    public static final SubLString $str7$TEMP_STREAM = makeString("TEMP-STREAM");

    public static final SubLString $str8$SAVED_STREAM = makeString("SAVED-STREAM");

    public static final SubLString $$$TABLE = makeString("TABLE");

    public static final SubLString $$$INFO = makeString("INFO");

    public static final SubLSymbol OUTPUT_STREAM_DESIGNATOR_STREAM = makeSymbol("OUTPUT-STREAM-DESIGNATOR-STREAM");

    public static final SubLSymbol $print_circle$ = makeSymbol("*PRINT-CIRCLE*");

    public static final SubLList $list19 = list(makeSymbol("*PRINT-CIRCULARITIES*"));

    public static final SubLList $list22 = list(list(makeSymbol("MAKE-HASH-TABLE"), makeSymbol("*PRINT-CIRCLE-TABLE-SIZE*"), list(makeSymbol("FUNCTION"), EQ)));

    public static final SubLList $list23 = list(list(makeSymbol("MAKE-BROADCAST-STREAM"), SubLNil.NIL));

    public static final SubLSymbol $print_circularities$ = makeSymbol("*PRINT-CIRCULARITIES*");

    public static final SubLSymbol $sym28$LIST_ = makeSymbol("LIST*");

    public static final SubLList $list29 = list(ZERO_INTEGER);

    public static final SubLList $list30 = cons(makeSymbol("TABLE"), makeSymbol("COUNTER"));

    public static final SubLSymbol REFERENCED = makeSymbol("REFERENCED");

    public static final SubLString $str32$__D_ = makeString("#~D=");

    public static final SubLString $str33$__D__ = makeString("#~D# ");

    public static final SubLSymbol DETECTED = makeSymbol("DETECTED");

    private static final SubLList $list36 = list(new SubLObject[] { makeSymbol("&KEY"), list(makeSymbol("STREAM"), makeSymbol("*STANDARD-OUTPUT*")), list(list(makeKeyword("ARRAY"), makeSymbol("*PRINT-ARRAY*")), makeSymbol("*PRINT-ARRAY*")),
	    list(list(makeKeyword("BASE"), makeSymbol("*PRINT-BASE*")), makeSymbol("*PRINT-BASE*")), list(list(makeKeyword("CASE"), makeSymbol("*PRINT-CASE*")), makeSymbol("*PRINT-CASE*")), list(list(makeKeyword("CIRCLE"), makeSymbol("*PRINT-CIRCLE*")), makeSymbol("*PRINT-CIRCLE*")),
	    list(list(makeKeyword("ESCAPE"), makeSymbol("*PRINT-ESCAPE*")), makeSymbol("*PRINT-ESCAPE*")), list(list(makeKeyword("GENSYM"), makeSymbol("*PRINT-GENSYM*")), makeSymbol("*PRINT-GENSYM*")), list(list(makeKeyword("LENGTH"), makeSymbol("*PRINT-LENGTH*")), makeSymbol("*PRINT-LENGTH*")),
	    list(list(makeKeyword("LEVEL"), makeSymbol("*PRINT-LEVEL*")), makeSymbol("*PRINT-LEVEL*")), list(list(makeKeyword("LINES"), makeSymbol("*PRINT-LINES*")), makeSymbol("*PRINT-LINES*")),
	    list(list(makeKeyword("MISER-WIDTH"), makeSymbol("*PRINT-MISER-WIDTH*")), makeSymbol("*PRINT-MISER-WIDTH*")), list(list(makeKeyword("PPRINT-DISPATCH"), makeSymbol("*PRINT-PPRINT-DISPATCH*")), makeSymbol("*PRINT-PPRINT-DISPATCH*")),
	    list(list(makeKeyword("PRETTY"), makeSymbol("*PRINT-PRETTY*")), makeSymbol("*PRINT-PRETTY*")), list(list(makeKeyword("RADIX"), makeSymbol("*PRINT-RADIX*")), makeSymbol("*PRINT-RADIX*")), list(list(makeKeyword("READABLY"), makeSymbol("*PRINT-READABLY*")), makeSymbol("*PRINT-READABLY*")),
	    list(list(makeKeyword("RIGHT-MARGIN"), makeSymbol("*PRINT-RIGHT-MARGIN*")), makeSymbol("*PRINT-RIGHT-MARGIN*")) });

    private static final SubLList $list37 = list(new SubLObject[] { makeKeyword("STREAM"), makeKeyword("ARRAY"), makeKeyword("BASE"), makeKeyword("CASE"), makeKeyword("CIRCLE"), makeKeyword("ESCAPE"), makeKeyword("GENSYM"), makeKeyword("LENGTH"), makeKeyword("LEVEL"), makeKeyword("LINES"),
	    makeKeyword("MISER-WIDTH"), makeKeyword("PPRINT-DISPATCH"), makeKeyword("PRETTY"), makeKeyword("RADIX"), makeKeyword("READABLY"), makeKeyword("RIGHT-MARGIN") });

    private static final SubLSymbol $ARRAY = makeKeyword("ARRAY");

    private static final SubLSymbol $CIRCLE = makeKeyword("CIRCLE");

    private static final SubLSymbol $ESCAPE = makeKeyword("ESCAPE");

    private static final SubLSymbol $GENSYM = makeKeyword("GENSYM");

    private static final SubLSymbol $LEVEL = makeKeyword("LEVEL");

    private static final SubLSymbol $LINES = makeKeyword("LINES");

    private static final SubLSymbol $MISER_WIDTH = makeKeyword("MISER-WIDTH");

    private static final SubLSymbol $PPRINT_DISPATCH = makeKeyword("PPRINT-DISPATCH");

    private static final SubLSymbol $PRETTY = makeKeyword("PRETTY");

    private static final SubLSymbol $RADIX = makeKeyword("RADIX");

    private static final SubLSymbol $READABLY = makeKeyword("READABLY");

    private static final SubLSymbol $RIGHT_MARGIN = makeKeyword("RIGHT-MARGIN");

    private static final SubLString $str54$_S_cannot_be_printed_readably_ = makeString("~S cannot be printed readably.");

    static {

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
