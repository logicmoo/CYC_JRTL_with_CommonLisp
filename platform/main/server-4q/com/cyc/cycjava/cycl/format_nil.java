package com.cyc.cycjava.cycl;


import static com.cyc.cycjava.cycl.access_macros.register_macro_helper;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions.funcall;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Packages.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow.format;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.values;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader.bq_cons;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.force_output;
import static com.cyc.tool.subl.util.SubLFiles.*;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.StreamsLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Strings;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


public final class format_nil extends SubLTranslatedFile {
    public static final SubLFile me = new format_nil();

    public static final String myName = "com.cyc.cycjava.cycl.format_nil";

    public static final String myFingerPrint = "3430c26f2e1621fd1cd84a0ba5a8d8c2b25ca528b4d0a0602c74d99bb9ef3f77";





    // Internal Constants
    public static final SubLList $list0 = list(makeSymbol("FORMAT-CONTROL"), makeSymbol("&REST"), makeSymbol("FORMAT-ARGUMENTS"));





    public static final SubLString $$$0123456789 = makeString("0123456789");

    public static final SubLSymbol FORMAT_NIL_A = makeSymbol("FORMAT-NIL-A");



    public static final SubLSymbol FORMAT_NIL_A_NO_COPY = makeSymbol("FORMAT-NIL-A-NO-COPY");

    public static final SubLSymbol FORMAT_NIL_S = makeSymbol("FORMAT-NIL-S");

    public static final SubLSymbol FORMAT_NIL_S_NO_COPY = makeSymbol("FORMAT-NIL-S-NO-COPY");

    public static final SubLSymbol FORMAT_NIL_D = makeSymbol("FORMAT-NIL-D");



    public static final SubLSymbol FORMAT_NIL_D_NO_COPY = makeSymbol("FORMAT-NIL-D-NO-COPY");

    public static final SubLString $str12$_ = makeString("\n");

    public static final SubLSymbol FORMAT_NIL_PERCENT = makeSymbol("FORMAT-NIL-PERCENT");

    public static final SubLString $str14$_ = makeString("~");

    public static final SubLSymbol FORMAT_NIL_TILDE = makeSymbol("FORMAT-NIL-TILDE");

    public static final SubLString $str16$ASD__ = makeString("ASD%~");



    public static final SubLSymbol $format_nil_percent$ = makeSymbol("*FORMAT-NIL-PERCENT*");

    public static final SubLList $list19 = list(makeSymbol("FORMAT-NIL-PERCENT"));

    public static final SubLSymbol $format_nil_tilde$ = makeSymbol("*FORMAT-NIL-TILDE*");

    public static final SubLList $list21 = list(makeSymbol("FORMAT-NIL-TILDE"));

    public static final SubLSymbol COPY_SEQ = makeSymbol("COPY-SEQ");

    public static final SubLList $list23 = list(makeSymbol("OPERATOR"), makeSymbol("ARG"));



    public static final SubLList $list25 = cons(makeSymbol("NEXT-CONTROL"), makeSymbol("REST-CONTROL"));

    public static final SubLString $str26$_A = makeString("~A");

    public static final SubLString $str27$_S = makeString("~S");

    public static final SubLString $str28$_D = makeString("~D");

    public static final SubLString $str29$__ = makeString("~%");

    public static final SubLString $str30$__ = makeString("~~");



    public static final SubLString $str32$ = makeString("");

    public static final SubLString $str33$___A = makeString("~%~A");

    public static SubLObject format_nil(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject format_control = NIL;
        destructuring_bind_must_consp(current, datum, $list0);
        format_control = current.first();
        final SubLObject format_arguments;
        current = format_arguments = current.rest();
        if (NIL != format_nil_control_validator(format_control)) {
            return format_nil_internal(format_control, format_arguments);
        }
        return listS(FORMAT, NIL, format_control, append(format_arguments, NIL));
    }

    public static SubLObject princ_integer_to_string(final SubLObject integer) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != integerp(integer) : "Types.integerp(integer) " + "CommonSymbols.NIL != Types.integerp(integer) " + integer;
        if (integer.isBignum() || (!TEN_INTEGER.eql($print_base$.getDynamicValue(thread)))) {
            return princ_to_string(integer);
        }
        final SubLObject string_length = add(integer.isNegative() ? ONE_INTEGER : ZERO_INTEGER, integer_decimal_length(integer));
        SubLObject string = Strings.make_string(string_length, UNPROVIDED);
        SubLObject magnitude = abs(integer);
        final SubLObject digits = $$$0123456789;
        SubLObject digit = NIL;
        SubLObject index = ZERO_INTEGER;
        while (!magnitude.numL(TEN_INTEGER)) {
            digit = mod(magnitude, TEN_INTEGER);
            magnitude = integerDivide(magnitude, TEN_INTEGER);
            Strings.set_char(string, index, Strings.sublisp_char(digits, digit));
            index = add(index, ONE_INTEGER);
        } 
        Strings.set_char(string, index, Strings.sublisp_char(digits, magnitude));
        index = add(index, ONE_INTEGER);
        if (integer.isNegative()) {
            Strings.set_char(string, index, CHAR_hyphen);
        }
        string = nreverse(string);
        return string;
    }

    public static SubLObject format_nil_a(final SubLObject v_object) {
        if (v_object.isSymbol()) {
            return copy_seq(symbol_name(v_object));
        }
        if (v_object.isString()) {
            return copy_seq(v_object);
        }
        if (v_object.isInteger()) {
            return princ_integer_to_string(v_object);
        }
        return princ_to_string(v_object);
    }

    public static SubLObject format_nil_a_no_copy(final SubLObject v_object) {
        if (v_object.isSymbol()) {
            return symbol_name(v_object);
        }
        if (v_object.isString()) {
            return v_object;
        }
        if (v_object.isInteger()) {
            return princ_integer_to_string(v_object);
        }
        return princ_to_string(v_object);
    }

    public static SubLObject format_nil_s(final SubLObject v_object) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if ((v_object.isSymbol() && $package$.getDynamicValue(thread).eql(symbol_package(v_object))) && v_object.eql(find_symbol(symbol_name(v_object), $package$.getDynamicValue(thread)))) {
            return format_nil_a(v_object);
        }
        if (v_object.isNumber()) {
            return format_nil_a(v_object);
        }
        return prin1_to_string(v_object);
    }

    public static SubLObject format_nil_s_no_copy(final SubLObject v_object) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if ((v_object.isSymbol() && $package$.getDynamicValue(thread).eql(symbol_package(v_object))) && v_object.eql(find_symbol(symbol_name(v_object), $package$.getDynamicValue(thread)))) {
            return format_nil_a_no_copy(v_object);
        }
        if (v_object.isNumber()) {
            return format_nil_a_no_copy(v_object);
        }
        return prin1_to_string(v_object);
    }

    public static SubLObject format_nil_d(final SubLObject v_object) {
        assert NIL != numberp(v_object) : "Types.numberp error :" + v_object;
        return format_nil_a(v_object);
    }

    public static SubLObject format_nil_d_no_copy(final SubLObject v_object) {
        assert NIL != numberp(v_object) : "Types.numberp error :" + v_object;
        return format_nil_a_no_copy(v_object);
    }

    public static SubLObject format_nil_percent() {
        return copy_seq($format_nil_percent$.getGlobalValue());
    }

    public static SubLObject format_nil_tilde() {
        return copy_seq($format_nil_tilde$.getGlobalValue());
    }

    public static SubLObject format_nil_internal(final SubLObject format_control, final SubLObject format_arguments) {
        return format_nil_simplify(format_nil_expand(format_nil_control_split(format_control), format_arguments));
    }

    public static SubLObject format_nil_control_validator(final SubLObject format_control) {
        if (!format_control.isString()) {
            return NIL;
        }
        final SubLObject length = length(format_control);
        SubLObject next_start;
        SubLObject next_control;
        SubLObject control_type_pos;
        SubLObject control_type;
        for (next_start = NIL, next_control = NIL, next_start = ZERO_INTEGER, next_control = position(CHAR_tilde, format_control, symbol_function(EQL), symbol_function(IDENTITY), next_start, NIL); NIL != next_control; next_control = position(CHAR_tilde, format_control, symbol_function(EQL), symbol_function(IDENTITY), next_start, NIL)) {
            control_type_pos = add(ONE_INTEGER, next_control);
            if (!control_type_pos.numL(length)) {
                return NIL;
            }
            control_type = Strings.sublisp_char(format_control, control_type_pos);
            if (NIL == find(control_type, $str16$ASD__, symbol_function(CHAR_EQUAL), UNPROVIDED, UNPROVIDED, UNPROVIDED)) {
                return NIL;
            }
            next_start = add(next_control, TWO_INTEGER);
        }
        return T;
    }

    public static SubLObject format_nil_simplify(final SubLObject expansion) {
        if (NIL == expansion.rest()) {
            final SubLObject item = expansion.first();
            if (item.isAtom()) {
                if (item == $format_nil_percent$) {
                    return $list19;
                }
                if (item == $format_nil_tilde$) {
                    return $list21;
                }
                if (item.isString()) {
                    return list(COPY_SEQ, item);
                }
            } else {
                SubLObject current;
                final SubLObject datum = current = item;
                SubLObject operator = NIL;
                SubLObject arg = NIL;
                destructuring_bind_must_consp(current, datum, $list23);
                operator = current.first();
                current = current.rest();
                destructuring_bind_must_consp(current, datum, $list23);
                arg = current.first();
                current = current.rest();
                if (NIL == current) {
                    if (operator == FORMAT_NIL_A_NO_COPY) {
                        return list(FORMAT_NIL_A, arg);
                    }
                    if (operator == FORMAT_NIL_S_NO_COPY) {
                        return list(FORMAT_NIL_S, arg);
                    }
                    if (operator == FORMAT_NIL_D_NO_COPY) {
                        return list(FORMAT_NIL_D, arg);
                    }
                } else {
                    cdestructuring_bind_error(datum, $list23);
                }
            }
        }
        return bq_cons(CCONCATENATE, append(expansion, NIL));
    }

    public static SubLObject format_nil_expand(final SubLObject format_controls, final SubLObject format_arguments) {
        if (NIL == format_controls) {
            return NIL;
        }
        SubLObject next_control = NIL;
        SubLObject rest_control = NIL;
        destructuring_bind_must_consp(format_controls, format_controls, $list25);
        next_control = format_controls.first();
        final SubLObject current = rest_control = format_controls.rest();
        final SubLObject next_argument = format_arguments.first();
        final SubLObject rest_arguments = format_arguments.rest();
        if ($str26$_A.equalp(next_control)) {
            return cons(list(FORMAT_NIL_A_NO_COPY, next_argument), format_nil_expand(rest_control, rest_arguments));
        }
        if ($str27$_S.equalp(next_control)) {
            return cons(list(FORMAT_NIL_S_NO_COPY, next_argument), format_nil_expand(rest_control, rest_arguments));
        }
        if ($str28$_D.equalp(next_control)) {
            return cons(list(FORMAT_NIL_D_NO_COPY, next_argument), format_nil_expand(rest_control, rest_arguments));
        }
        if ($str29$__.equalp(next_control)) {
            return cons($format_nil_percent$, format_nil_expand(rest_control, format_arguments));
        }
        if ($str30$__.equalp(next_control)) {
            return cons($format_nil_tilde$, format_nil_expand(rest_control, format_arguments));
        }
        return cons(next_control, format_nil_expand(rest_control, format_arguments));
    }

    public static SubLObject format_nil_control_split(final SubLObject format_control) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != stringp(format_control) : "Types.stringp(format_control) " + "CommonSymbols.NIL != Types.stringp(format_control) " + format_control;
        if (format_control.equal($str32$)) {
            return NIL;
        }
        thread.resetMultipleValues();
        final SubLObject next_control = format_nil_control_split_internal(format_control);
        final SubLObject rest_control = thread.secondMultipleValue();
        thread.resetMultipleValues();
        return cons(next_control, format_nil_control_split(rest_control));
    }

    public static SubLObject format_nil_control_split_internal(final SubLObject format_control) {
        final SubLObject position = position(CHAR_tilde, format_control, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        if (NIL == position) {
            return values(format_control, $str32$);
        }
        if (ZERO_INTEGER.numE(position)) {
            return values(subseq(format_control, ZERO_INTEGER, TWO_INTEGER), subseq(format_control, TWO_INTEGER, NIL));
        }
        return values(subseq(format_control, ZERO_INTEGER, position), subseq(format_control, position, NIL));
    }

    public static SubLObject integer_decimal_length(final SubLObject integer) {
        assert NIL != integerp(integer) : "Types.integerp(integer) " + "CommonSymbols.NIL != Types.integerp(integer) " + integer;
        SubLObject magnitude = abs(integer);
        SubLObject length = ONE_INTEGER;
        while (!magnitude.numL(TEN_INTEGER)) {
            length = add(length, ONE_INTEGER);
            magnitude = integerDivide(magnitude, TEN_INTEGER);
        } 
        return length;
    }

    public static SubLObject format_one_per_line(final SubLObject objects, SubLObject stream) {
        if (stream == UNPROVIDED) {
            stream = StreamsLow.$standard_output$.getDynamicValue();
        }
        SubLObject cdolist_list_var = objects;
        SubLObject obj = NIL;
        obj = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            format(stream, $str33$___A, obj);
            cdolist_list_var = cdolist_list_var.rest();
            obj = cdolist_list_var.first();
        } 
        force_output(stream);
        return NIL;
    }

    public static SubLObject print_one_per_line(final SubLObject objects, SubLObject stream) {
        if (stream == UNPROVIDED) {
            stream = StreamsLow.$standard_output$.getDynamicValue();
        }
        return print_one_aspect_per_line(objects, symbol_function(IDENTITY), stream);
    }

    public static SubLObject p1(final SubLObject objects, SubLObject stream) {
        if (stream == UNPROVIDED) {
            stream = StreamsLow.$standard_output$.getDynamicValue();
        }
        return print_one_per_line(objects, stream);
    }

    public static SubLObject print_one_aspect_per_line(final SubLObject objects, final SubLObject key, SubLObject stream) {
        if (stream == UNPROVIDED) {
            stream = StreamsLow.$standard_output$.getDynamicValue();
        }
        SubLObject cdolist_list_var = objects;
        SubLObject obj = NIL;
        obj = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            print(funcall(key, obj), stream);
            cdolist_list_var = cdolist_list_var.rest();
            obj = cdolist_list_var.first();
        } 
        return NIL;
    }

    public static SubLObject force_format(final SubLObject stream, final SubLObject control_string, SubLObject arg1, SubLObject arg2, SubLObject arg3, SubLObject arg4, SubLObject arg5, SubLObject arg6, SubLObject arg7, SubLObject arg8) {
        if (arg1 == UNPROVIDED) {
            arg1 = NIL;
        }
        if (arg2 == UNPROVIDED) {
            arg2 = NIL;
        }
        if (arg3 == UNPROVIDED) {
            arg3 = NIL;
        }
        if (arg4 == UNPROVIDED) {
            arg4 = NIL;
        }
        if (arg5 == UNPROVIDED) {
            arg5 = NIL;
        }
        if (arg6 == UNPROVIDED) {
            arg6 = NIL;
        }
        if (arg7 == UNPROVIDED) {
            arg7 = NIL;
        }
        if (arg8 == UNPROVIDED) {
            arg8 = NIL;
        }
        final SubLObject result = format(stream, control_string, new SubLObject[]{ arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8 });
        force_output(stream);
        return result;
    }

    public static SubLObject declare_format_nil_file() {
        declareMacro(me, "format_nil", "FORMAT-NIL");
        declareFunction(me, "princ_integer_to_string", "PRINC-INTEGER-TO-STRING", 1, 0, false);
        declareFunction(me, "format_nil_a", "FORMAT-NIL-A", 1, 0, false);
        declareFunction(me, "format_nil_a_no_copy", "FORMAT-NIL-A-NO-COPY", 1, 0, false);
        declareFunction(me, "format_nil_s", "FORMAT-NIL-S", 1, 0, false);
        declareFunction(me, "format_nil_s_no_copy", "FORMAT-NIL-S-NO-COPY", 1, 0, false);
        declareFunction(me, "format_nil_d", "FORMAT-NIL-D", 1, 0, false);
        declareFunction(me, "format_nil_d_no_copy", "FORMAT-NIL-D-NO-COPY", 1, 0, false);
        declareFunction(me, "format_nil_percent", "FORMAT-NIL-PERCENT", 0, 0, false);
        declareFunction(me, "format_nil_tilde", "FORMAT-NIL-TILDE", 0, 0, false);
        declareFunction(me, "format_nil_internal", "FORMAT-NIL-INTERNAL", 2, 0, false);
        declareFunction(me, "format_nil_control_validator", "FORMAT-NIL-CONTROL-VALIDATOR", 1, 0, false);
        declareFunction(me, "format_nil_simplify", "FORMAT-NIL-SIMPLIFY", 1, 0, false);
        declareFunction(me, "format_nil_expand", "FORMAT-NIL-EXPAND", 2, 0, false);
        declareFunction(me, "format_nil_control_split", "FORMAT-NIL-CONTROL-SPLIT", 1, 0, false);
        declareFunction(me, "format_nil_control_split_internal", "FORMAT-NIL-CONTROL-SPLIT-INTERNAL", 1, 0, false);
        declareFunction(me, "integer_decimal_length", "INTEGER-DECIMAL-LENGTH", 1, 0, false);
        declareFunction(me, "format_one_per_line", "FORMAT-ONE-PER-LINE", 1, 1, false);
        declareFunction(me, "print_one_per_line", "PRINT-ONE-PER-LINE", 1, 1, false);
        declareFunction(me, "p1", "P1", 1, 1, false);
        declareFunction(me, "print_one_aspect_per_line", "PRINT-ONE-ASPECT-PER-LINE", 2, 1, false);
        declareFunction(me, "force_format", "FORCE-FORMAT", 2, 8, false);
        return NIL;
    }

    public static SubLObject init_format_nil_file() {
        defconstant("*FORMAT-NIL-PERCENT*", $str12$_);
        defconstant("*FORMAT-NIL-TILDE*", $str14$_);
        return NIL;
    }

    public static SubLObject setup_format_nil_file() {
        register_macro_helper(FORMAT_NIL_A, FORMAT_NIL);
        register_macro_helper(FORMAT_NIL_A_NO_COPY, FORMAT_NIL);
        register_macro_helper(FORMAT_NIL_S, FORMAT_NIL);
        register_macro_helper(FORMAT_NIL_S_NO_COPY, FORMAT_NIL);
        register_macro_helper(FORMAT_NIL_D, FORMAT_NIL);
        register_macro_helper(FORMAT_NIL_D_NO_COPY, FORMAT_NIL);
        register_macro_helper(FORMAT_NIL_PERCENT, FORMAT_NIL);
        register_macro_helper(FORMAT_NIL_TILDE, FORMAT_NIL);
        return NIL;
    }

    @Override
    public void declareFunctions() {
        declare_format_nil_file();
    }

    @Override
    public void initializeVariables() {
        init_format_nil_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_format_nil_file();
    }

    
}

/**
 * Total time: 131 ms
 */
