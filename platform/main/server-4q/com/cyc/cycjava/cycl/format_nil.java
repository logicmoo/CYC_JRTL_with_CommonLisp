/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 */
package com.cyc.cycjava.cycl;


import static com.cyc.cycjava.cycl.access_macros.register_macro_helper;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_hyphen;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_tilde;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.append;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.cons;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.listS;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions.funcall;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.abs;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.add;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.integerDivide;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.mod;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Packages.$package$;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Packages.find_symbol;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow.format;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.copy_seq;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.find;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.length;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.nreverse;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.position;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.subseq;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.symbol_function;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.symbol_name;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.symbol_package;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.integerp;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.numberp;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.stringp;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.values;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeString;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeSymbol;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.cdestructuring_bind_error;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.destructuring_bind_must_consp;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high.$print_base$;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high.prin1_to_string;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high.princ_to_string;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high.print;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader.bq_cons;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.force_output;
import static com.cyc.tool.subl.util.SubLFiles.declareFunction;
import static com.cyc.tool.subl.util.SubLFiles.declareMacro;
import static com.cyc.tool.subl.util.SubLFiles.defconstant;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.StreamsLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Strings;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLFiles.LispMethod;
import com.cyc.tool.subl.util.SubLTrampolineFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 * module:      FORMAT-NIL
 * source file: /cyc/top/cycl/format-nil.lisp
 * created:     2019/07/03 17:37:05
 */
public final class format_nil extends SubLTranslatedFile implements V12 {
    static private final SubLString $str_alt32$ = makeString("");

    public static final SubLFile me = new format_nil();

 public static final String myName = "com.cyc.cycjava.cycl.format_nil";


    // Internal Constants
    @LispMethod(comment = "Internal Constants")
    static private final SubLList $list0 = list(makeSymbol("FORMAT-CONTROL"), makeSymbol("&REST"), makeSymbol("FORMAT-ARGUMENTS"));

    static private final SubLString $$$0123456789 = makeString("0123456789");

    private static final SubLSymbol FORMAT_NIL_A = makeSymbol("FORMAT-NIL-A");

    private static final SubLSymbol FORMAT_NIL_A_NO_COPY = makeSymbol("FORMAT-NIL-A-NO-COPY");

    private static final SubLSymbol FORMAT_NIL_S = makeSymbol("FORMAT-NIL-S");

    private static final SubLSymbol FORMAT_NIL_S_NO_COPY = makeSymbol("FORMAT-NIL-S-NO-COPY");

    private static final SubLSymbol FORMAT_NIL_D = makeSymbol("FORMAT-NIL-D");

    private static final SubLSymbol FORMAT_NIL_D_NO_COPY = makeSymbol("FORMAT-NIL-D-NO-COPY");

    static private final SubLString $str12$_ = makeString("\n");

    private static final SubLSymbol FORMAT_NIL_PERCENT = makeSymbol("FORMAT-NIL-PERCENT");

    static private final SubLString $str14$_ = makeString("~");

    private static final SubLSymbol FORMAT_NIL_TILDE = makeSymbol("FORMAT-NIL-TILDE");

    static private final SubLString $str16$ASD__ = makeString("ASD%~");

    public static final SubLSymbol $format_nil_percent$ = makeSymbol("*FORMAT-NIL-PERCENT*");

    static private final SubLList $list19 = list(makeSymbol("FORMAT-NIL-PERCENT"));

    public static final SubLSymbol $format_nil_tilde$ = makeSymbol("*FORMAT-NIL-TILDE*");

    static private final SubLList $list21 = list(makeSymbol("FORMAT-NIL-TILDE"));

    private static final SubLSymbol COPY_SEQ = makeSymbol("COPY-SEQ");

    static private final SubLList $list23 = list(makeSymbol("OPERATOR"), makeSymbol("ARG"));

    static private final SubLList $list25 = cons(makeSymbol("NEXT-CONTROL"), makeSymbol("REST-CONTROL"));

    static private final SubLString $str26$_A = makeString("~A");

    static private final SubLString $str27$_S = makeString("~S");

    static private final SubLString $str28$_D = makeString("~D");

    static private final SubLString $str29$__ = makeString("~%");

    static private final SubLString $str30$__ = makeString("~~");

    static private final SubLString $str32$ = makeString("");

    static private final SubLString $str33$___A = makeString("~%~A");

    // Definitions
    /**
     * An optimized version of (FORMAT NIL FORMAT-CONTROL . FORMAT-ARGUMENTS).
     */
    @LispMethod(comment = "An optimized version of (FORMAT NIL FORMAT-CONTROL . FORMAT-ARGUMENTS).")
    public static final SubLObject format_nil_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject format_control = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt0);
            format_control = current.first();
            current = current.rest();
            {
                SubLObject format_arguments = current;
                if (NIL != com.cyc.cycjava.cycl.format_nil.format_nil_control_validator(format_control)) {
                    return com.cyc.cycjava.cycl.format_nil.format_nil_internal(format_control, format_arguments);
                } else {
                    return listS(FORMAT, NIL, format_control, append(format_arguments, NIL));
                }
            }
        }
    }

    // Definitions
    /**
     * An optimized version of (FORMAT NIL FORMAT-CONTROL . FORMAT-ARGUMENTS).
     */
    @LispMethod(comment = "An optimized version of (FORMAT NIL FORMAT-CONTROL . FORMAT-ARGUMENTS).")
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

    /**
     * Return a string representation of INTEGER
     */
    @LispMethod(comment = "Return a string representation of INTEGER")
    public static final SubLObject princ_integer_to_string_alt(SubLObject integer) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            SubLTrampolineFile.checkType(integer, INTEGERP);
            if (integer.isBignum() || (!TEN_INTEGER.eql($print_base$.getDynamicValue(thread)))) {
                return princ_to_string(integer);
            }
            {
                SubLObject string_length = add(integer.isNegative() ? ((SubLObject) (ONE_INTEGER)) : ZERO_INTEGER, com.cyc.cycjava.cycl.format_nil.integer_decimal_length(integer));
                SubLObject string = Strings.make_string(string_length, UNPROVIDED);
                SubLObject magnitude = abs(integer);
                SubLObject digits = $$$0123456789;
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
        }
    }

    /**
     * Return a string representation of INTEGER
     */
    @LispMethod(comment = "Return a string representation of INTEGER")
    public static SubLObject princ_integer_to_string(final SubLObject integer) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != integerp(integer) : "! integerp(integer) " + ("Types.integerp(integer) " + "CommonSymbols.NIL != Types.integerp(integer) ") + integer;
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

    public static final SubLObject format_nil_a_alt(SubLObject v_object) {
        if (v_object.isSymbol()) {
            return copy_seq(symbol_name(v_object));
        } else {
            if (v_object.isString()) {
                return copy_seq(v_object);
            } else {
                if (v_object.isInteger()) {
                    return com.cyc.cycjava.cycl.format_nil.princ_integer_to_string(v_object);
                } else {
                    return princ_to_string(v_object);
                }
            }
        }
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

    public static final SubLObject format_nil_a_no_copy_alt(SubLObject v_object) {
        if (v_object.isSymbol()) {
            return symbol_name(v_object);
        } else {
            if (v_object.isString()) {
                return v_object;
            } else {
                if (v_object.isInteger()) {
                    return com.cyc.cycjava.cycl.format_nil.princ_integer_to_string(v_object);
                } else {
                    return princ_to_string(v_object);
                }
            }
        }
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

    public static final SubLObject format_nil_s_alt(SubLObject v_object) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if ((v_object.isSymbol() && ($package$.getDynamicValue(thread) == symbol_package(v_object))) && (v_object == find_symbol(symbol_name(v_object), $package$.getDynamicValue(thread)))) {
                return com.cyc.cycjava.cycl.format_nil.format_nil_a(v_object);
            } else {
                if (v_object.isNumber()) {
                    return com.cyc.cycjava.cycl.format_nil.format_nil_a(v_object);
                } else {
                    return prin1_to_string(v_object);
                }
            }
        }
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

    public static final SubLObject format_nil_s_no_copy_alt(SubLObject v_object) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if ((v_object.isSymbol() && ($package$.getDynamicValue(thread) == symbol_package(v_object))) && (v_object == find_symbol(symbol_name(v_object), $package$.getDynamicValue(thread)))) {
                return com.cyc.cycjava.cycl.format_nil.format_nil_a_no_copy(v_object);
            } else {
                if (v_object.isNumber()) {
                    return com.cyc.cycjava.cycl.format_nil.format_nil_a_no_copy(v_object);
                } else {
                    return prin1_to_string(v_object);
                }
            }
        }
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

    public static final SubLObject format_nil_d_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, NUMBERP);
        return com.cyc.cycjava.cycl.format_nil.format_nil_a(v_object);
    }

    public static SubLObject format_nil_d(final SubLObject v_object) {
        assert NIL != numberp(v_object) : "! numberp(v_object) " + "Types.numberp error :" + v_object;
        return format_nil_a(v_object);
    }

    public static final SubLObject format_nil_d_no_copy_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, NUMBERP);
        return com.cyc.cycjava.cycl.format_nil.format_nil_a_no_copy(v_object);
    }

    public static SubLObject format_nil_d_no_copy(final SubLObject v_object) {
        assert NIL != numberp(v_object) : "! numberp(v_object) " + "Types.numberp error :" + v_object;
        return format_nil_a_no_copy(v_object);
    }

    public static final SubLObject format_nil_percent_alt() {
        return copy_seq($format_nil_percent$.getGlobalValue());
    }

    public static SubLObject format_nil_percent() {
        return copy_seq($format_nil_percent$.getGlobalValue());
    }

    public static final SubLObject format_nil_tilde_alt() {
        return copy_seq($format_nil_tilde$.getGlobalValue());
    }

    public static SubLObject format_nil_tilde() {
        return copy_seq($format_nil_tilde$.getGlobalValue());
    }

    /**
     * Perform the FORMAT-NIL optimization on FORMAT-CONTROL for FORMAT-ARGUMENTS)
     */
    @LispMethod(comment = "Perform the FORMAT-NIL optimization on FORMAT-CONTROL for FORMAT-ARGUMENTS)")
    public static final SubLObject format_nil_internal_alt(SubLObject format_control, SubLObject format_arguments) {
        return com.cyc.cycjava.cycl.format_nil.format_nil_simplify(com.cyc.cycjava.cycl.format_nil.format_nil_expand(com.cyc.cycjava.cycl.format_nil.format_nil_control_split(format_control), format_arguments));
    }

    /**
     * Perform the FORMAT-NIL optimization on FORMAT-CONTROL for FORMAT-ARGUMENTS)
     */
    @LispMethod(comment = "Perform the FORMAT-NIL optimization on FORMAT-CONTROL for FORMAT-ARGUMENTS)")
    public static SubLObject format_nil_internal(final SubLObject format_control, final SubLObject format_arguments) {
        return format_nil_simplify(format_nil_expand(format_nil_control_split(format_control), format_arguments));
    }

    /**
     * Return T iff FORMAT-CONTROL is can be special-cased by FORMAT-NIL
     */
    @LispMethod(comment = "Return T iff FORMAT-CONTROL is can be special-cased by FORMAT-NIL")
    public static final SubLObject format_nil_control_validator_alt(SubLObject format_control) {
        if (!format_control.isString()) {
            return NIL;
        }
        {
            SubLObject length = length(format_control);
            SubLObject next_start = NIL;
            SubLObject next_control = NIL;
            for (next_start = ZERO_INTEGER, next_control = position(CHAR_tilde, format_control, symbol_function(EQL), symbol_function(IDENTITY), next_start, NIL); NIL != next_control; next_start = add(next_control, TWO_INTEGER) , next_control = position(CHAR_tilde, format_control, symbol_function(EQL), symbol_function(IDENTITY), next_start, NIL)) {
                {
                    SubLObject control_type_pos = add(ONE_INTEGER, next_control);
                    if (!control_type_pos.numL(length)) {
                        return NIL;
                    }
                    {
                        SubLObject control_type = Strings.sublisp_char(format_control, control_type_pos);
                        if (NIL == find(control_type, $str_alt16$ASD__, symbol_function(CHAR_EQUAL), UNPROVIDED, UNPROVIDED, UNPROVIDED)) {
                            return NIL;
                        }
                    }
                }
            }
            return T;
        }
    }

    /**
     * Return T iff FORMAT-CONTROL is can be special-cased by FORMAT-NIL
     */
    @LispMethod(comment = "Return T iff FORMAT-CONTROL is can be special-cased by FORMAT-NIL")
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

    /**
     * Simplify the EXPANSION returned by FORMAT-NIL-EXPAND.
     */
    @LispMethod(comment = "Simplify the EXPANSION returned by FORMAT-NIL-EXPAND.")
    public static final SubLObject format_nil_simplify_alt(SubLObject expansion) {
        if (NIL == expansion.rest()) {
            {
                SubLObject item = expansion.first();
                if (item.isAtom()) {
                    if (item == $format_nil_percent$) {
                        return $list_alt19;
                    } else {
                        if (item == $format_nil_tilde$) {
                            return $list_alt21;
                        } else {
                            if (item.isString()) {
                                return list(COPY_SEQ, item);
                            }
                        }
                    }
                } else {
                    {
                        SubLObject datum = item;
                        SubLObject current = datum;
                        SubLObject operator = NIL;
                        SubLObject arg = NIL;
                        destructuring_bind_must_consp(current, datum, $list_alt23);
                        operator = current.first();
                        current = current.rest();
                        destructuring_bind_must_consp(current, datum, $list_alt23);
                        arg = current.first();
                        current = current.rest();
                        if (NIL == current) {
                            if (operator == FORMAT_NIL_A_NO_COPY) {
                                return list(FORMAT_NIL_A, arg);
                            } else {
                                if (operator == FORMAT_NIL_S_NO_COPY) {
                                    return list(FORMAT_NIL_S, arg);
                                } else {
                                    if (operator == FORMAT_NIL_D_NO_COPY) {
                                        return list(FORMAT_NIL_D, arg);
                                    }
                                }
                            }
                        } else {
                            cdestructuring_bind_error(datum, $list_alt23);
                        }
                    }
                }
            }
        }
        return bq_cons(CCONCATENATE, append(expansion, NIL));
    }

    /**
     * Simplify the EXPANSION returned by FORMAT-NIL-EXPAND.
     */
    @LispMethod(comment = "Simplify the EXPANSION returned by FORMAT-NIL-EXPAND.")
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

    /**
     * Use FORMAT-CONTROLS to return a list of transformed FORMAT-ARGUMENTS
     * suitable for CCONCATENATE.
     */
    @LispMethod(comment = "Use FORMAT-CONTROLS to return a list of transformed FORMAT-ARGUMENTS\r\nsuitable for CCONCATENATE.\nUse FORMAT-CONTROLS to return a list of transformed FORMAT-ARGUMENTS\nsuitable for CCONCATENATE.")
    public static final SubLObject format_nil_expand_alt(SubLObject format_controls, SubLObject format_arguments) {
        if (NIL == format_controls) {
            return NIL;
        } else {
            {
                SubLObject datum = format_controls;
                SubLObject current = datum;
                SubLObject next_control = NIL;
                SubLObject rest_control = NIL;
                destructuring_bind_must_consp(current, datum, $list_alt25);
                next_control = current.first();
                current = current.rest();
                rest_control = current;
                {
                    SubLObject next_argument = format_arguments.first();
                    SubLObject rest_arguments = format_arguments.rest();
                    if ($str_alt26$_A.equalp(next_control)) {
                        return cons(list(FORMAT_NIL_A_NO_COPY, next_argument), com.cyc.cycjava.cycl.format_nil.format_nil_expand(rest_control, rest_arguments));
                    } else {
                        if ($str_alt27$_S.equalp(next_control)) {
                            return cons(list(FORMAT_NIL_S_NO_COPY, next_argument), com.cyc.cycjava.cycl.format_nil.format_nil_expand(rest_control, rest_arguments));
                        } else {
                            if ($str_alt28$_D.equalp(next_control)) {
                                return cons(list(FORMAT_NIL_D_NO_COPY, next_argument), com.cyc.cycjava.cycl.format_nil.format_nil_expand(rest_control, rest_arguments));
                            } else {
                                if ($str_alt29$__.equalp(next_control)) {
                                    return cons($format_nil_percent$, com.cyc.cycjava.cycl.format_nil.format_nil_expand(rest_control, format_arguments));
                                } else {
                                    if ($str_alt30$__.equalp(next_control)) {
                                        return cons($format_nil_tilde$, com.cyc.cycjava.cycl.format_nil.format_nil_expand(rest_control, format_arguments));
                                    } else {
                                        return cons(next_control, com.cyc.cycjava.cycl.format_nil.format_nil_expand(rest_control, format_arguments));
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    /**
     * Use FORMAT-CONTROLS to return a list of transformed FORMAT-ARGUMENTS
     * suitable for CCONCATENATE.
     */
    @LispMethod(comment = "Use FORMAT-CONTROLS to return a list of transformed FORMAT-ARGUMENTS\r\nsuitable for CCONCATENATE.\nUse FORMAT-CONTROLS to return a list of transformed FORMAT-ARGUMENTS\nsuitable for CCONCATENATE.")
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

    /**
     * Split FORMAT-CONTROL into a list of control escapes and verbatim strings.
     */
    @LispMethod(comment = "Split FORMAT-CONTROL into a list of control escapes and verbatim strings.")
    public static final SubLObject format_nil_control_split_alt(SubLObject format_control) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            SubLTrampolineFile.checkType(format_control, STRINGP);
            if (format_control.equal($str_alt32$)) {
                return NIL;
            } else {
                thread.resetMultipleValues();
                {
                    SubLObject next_control = com.cyc.cycjava.cycl.format_nil.format_nil_control_split_internal(format_control);
                    SubLObject rest_control = thread.secondMultipleValue();
                    thread.resetMultipleValues();
                    return cons(next_control, com.cyc.cycjava.cycl.format_nil.format_nil_control_split(rest_control));
                }
            }
        }
    }

    /**
     * Split FORMAT-CONTROL into a list of control escapes and verbatim strings.
     */
    @LispMethod(comment = "Split FORMAT-CONTROL into a list of control escapes and verbatim strings.")
    public static SubLObject format_nil_control_split(final SubLObject format_control) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != stringp(format_control) : "! stringp(format_control) " + ("Types.stringp(format_control) " + "CommonSymbols.NIL != Types.stringp(format_control) ") + format_control;
        if (format_control.equal($str32$)) {
            return NIL;
        }
        thread.resetMultipleValues();
        final SubLObject next_control = format_nil_control_split_internal(format_control);
        final SubLObject rest_control = thread.secondMultipleValue();
        thread.resetMultipleValues();
        return cons(next_control, format_nil_control_split(rest_control));
    }

    public static final SubLObject format_nil_control_split_internal_alt(SubLObject format_control) {
        {
            SubLObject position = position(CHAR_tilde, format_control, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            if (NIL == position) {
                return values(format_control, $str_alt32$);
            } else {
                if (ZERO_INTEGER.numE(position)) {
                    return values(subseq(format_control, ZERO_INTEGER, TWO_INTEGER), subseq(format_control, TWO_INTEGER, NIL));
                } else {
                    return values(subseq(format_control, ZERO_INTEGER, position), subseq(format_control, position, NIL));
                }
            }
        }
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

    /**
     * Return the number of digits needed to express INTEGER in base 10.
     */
    @LispMethod(comment = "Return the number of digits needed to express INTEGER in base 10.")
    public static final SubLObject integer_decimal_length_alt(SubLObject integer) {
        SubLTrampolineFile.checkType(integer, INTEGERP);
        {
            SubLObject magnitude = abs(integer);
            SubLObject length = ONE_INTEGER;
            while (!magnitude.numL(TEN_INTEGER)) {
                length = add(length, ONE_INTEGER);
                magnitude = integerDivide(magnitude, TEN_INTEGER);
            } 
            return length;
        }
    }

    @LispMethod(comment = "Return the number of digits needed to express INTEGER in base 10.")
    public static SubLObject integer_decimal_length(final SubLObject integer) {
        assert NIL != integerp(integer) : "! integerp(integer) " + ("Types.integerp(integer) " + "CommonSymbols.NIL != Types.integerp(integer) ") + integer;
        SubLObject magnitude = abs(integer);
        SubLObject length = ONE_INTEGER;
        while (!magnitude.numL(TEN_INTEGER)) {
            length = add(length, ONE_INTEGER);
            magnitude = integerDivide(magnitude, TEN_INTEGER);
        } 
        return length;
    }/**
     * Return the number of digits needed to express INTEGER in base 10.
     */


    /**
     *
     *
     * @param OBJECTS
     * 		listp ; a list.
     * 		formats each object in OBJECTS, one per line.
     * @unknown billj
     */
    @LispMethod(comment = "@param OBJECTS\r\n\t\tlistp ; a list.\r\n\t\tformats each object in OBJECTS, one per line.\r\n@unknown billj")
    public static final SubLObject format_one_per_line_alt(SubLObject objects, SubLObject stream) {
        if (stream == UNPROVIDED) {
            stream = StreamsLow.$standard_output$.getDynamicValue();
        }
        {
            SubLObject cdolist_list_var = objects;
            SubLObject obj = NIL;
            for (obj = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , obj = cdolist_list_var.first()) {
                format(stream, $str_alt33$___A, obj);
            }
        }
        force_output(stream);
        return NIL;
    }

    /**
     *
     *
     * @param OBJECTS
     * 		listp ; a list.
     * 		formats each object in OBJECTS, one per line.
     * @unknown billj
     */
    @LispMethod(comment = "@param OBJECTS\r\n\t\tlistp ; a list.\r\n\t\tformats each object in OBJECTS, one per line.\r\n@unknown billj")
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

    /**
     *
     *
     * @param OBJECTS
     * 		listp ; a list.
     * 		prints each object in OBJECTS, one per line.
     * @unknown pace
     */
    @LispMethod(comment = "@param OBJECTS\r\n\t\tlistp ; a list.\r\n\t\tprints each object in OBJECTS, one per line.\r\n@unknown pace")
    public static final SubLObject print_one_per_line_alt(SubLObject objects, SubLObject stream) {
        if (stream == UNPROVIDED) {
            stream = StreamsLow.$standard_output$.getDynamicValue();
        }
        return com.cyc.cycjava.cycl.format_nil.print_one_aspect_per_line(objects, symbol_function(IDENTITY), stream);
    }

    /**
     *
     *
     * @param OBJECTS
     * 		listp ; a list.
     * 		prints each object in OBJECTS, one per line.
     * @unknown pace
     */
    @LispMethod(comment = "@param OBJECTS\r\n\t\tlistp ; a list.\r\n\t\tprints each object in OBJECTS, one per line.\r\n@unknown pace")
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

    /**
     *
     *
     * @param OBJECTS
     * 		listp ; a list.
     * 		prints an aspect of each object in OBJECTS, one per line.
     * 		The aspect is given by applying key to each object
     * @unknown rck
     */
    @LispMethod(comment = "@param OBJECTS\r\n\t\tlistp ; a list.\r\n\t\tprints an aspect of each object in OBJECTS, one per line.\r\n\t\tThe aspect is given by applying key to each object\r\n@unknown rck")
    public static final SubLObject print_one_aspect_per_line_alt(SubLObject objects, SubLObject key, SubLObject stream) {
        if (stream == UNPROVIDED) {
            stream = StreamsLow.$standard_output$.getDynamicValue();
        }
        {
            SubLObject cdolist_list_var = objects;
            SubLObject obj = NIL;
            for (obj = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , obj = cdolist_list_var.first()) {
                print(funcall(key, obj), stream);
            }
        }
        return NIL;
    }

    /**
     *
     *
     * @param OBJECTS
     * 		listp ; a list.
     * 		prints an aspect of each object in OBJECTS, one per line.
     * 		The aspect is given by applying key to each object
     * @unknown rck
     */
    @LispMethod(comment = "@param OBJECTS\r\n\t\tlistp ; a list.\r\n\t\tprints an aspect of each object in OBJECTS, one per line.\r\n\t\tThe aspect is given by applying key to each object\r\n@unknown rck")
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

    /**
     * Like @xref FORMAT but also does a FORCE-OUTPUT afterwards.
     */
    @LispMethod(comment = "Like @xref FORMAT but also does a FORCE-OUTPUT afterwards.")
    public static final SubLObject force_format_alt(SubLObject stream, SubLObject control_string, SubLObject arg1, SubLObject arg2, SubLObject arg3, SubLObject arg4, SubLObject arg5, SubLObject arg6, SubLObject arg7, SubLObject arg8) {
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
        {
            SubLObject result = format(stream, control_string, new SubLObject[]{ arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8 });
            force_output(stream);
            return result;
        }
    }

    /**
     * Like @xref FORMAT but also does a FORCE-OUTPUT afterwards.
     */
    @LispMethod(comment = "Like @xref FORMAT but also does a FORCE-OUTPUT afterwards.")
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
        declareMacro("format_nil", "FORMAT-NIL");
        declareFunction("princ_integer_to_string", "PRINC-INTEGER-TO-STRING", 1, 0, false);
        declareFunction("format_nil_a", "FORMAT-NIL-A", 1, 0, false);
        declareFunction("format_nil_a_no_copy", "FORMAT-NIL-A-NO-COPY", 1, 0, false);
        declareFunction("format_nil_s", "FORMAT-NIL-S", 1, 0, false);
        declareFunction("format_nil_s_no_copy", "FORMAT-NIL-S-NO-COPY", 1, 0, false);
        declareFunction("format_nil_d", "FORMAT-NIL-D", 1, 0, false);
        declareFunction("format_nil_d_no_copy", "FORMAT-NIL-D-NO-COPY", 1, 0, false);
        declareFunction("format_nil_percent", "FORMAT-NIL-PERCENT", 0, 0, false);
        declareFunction("format_nil_tilde", "FORMAT-NIL-TILDE", 0, 0, false);
        declareFunction("format_nil_internal", "FORMAT-NIL-INTERNAL", 2, 0, false);
        declareFunction("format_nil_control_validator", "FORMAT-NIL-CONTROL-VALIDATOR", 1, 0, false);
        declareFunction("format_nil_simplify", "FORMAT-NIL-SIMPLIFY", 1, 0, false);
        declareFunction("format_nil_expand", "FORMAT-NIL-EXPAND", 2, 0, false);
        declareFunction("format_nil_control_split", "FORMAT-NIL-CONTROL-SPLIT", 1, 0, false);
        declareFunction("format_nil_control_split_internal", "FORMAT-NIL-CONTROL-SPLIT-INTERNAL", 1, 0, false);
        declareFunction("integer_decimal_length", "INTEGER-DECIMAL-LENGTH", 1, 0, false);
        declareFunction("format_one_per_line", "FORMAT-ONE-PER-LINE", 1, 1, false);
        declareFunction("print_one_per_line", "PRINT-ONE-PER-LINE", 1, 1, false);
        declareFunction("p1", "P1", 1, 1, false);
        declareFunction("print_one_aspect_per_line", "PRINT-ONE-ASPECT-PER-LINE", 2, 1, false);
        declareFunction("force_format", "FORCE-FORMAT", 2, 8, false);
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

    static {
    }

    // Internal Constants
    @LispMethod(comment = "Internal Constants")
    static private final SubLList $list_alt0 = list(makeSymbol("FORMAT-CONTROL"), makeSymbol("&REST"), makeSymbol("FORMAT-ARGUMENTS"));

    static private final SubLString $str_alt12$_ = makeString("\n");

    static private final SubLString $str_alt14$_ = makeString("~");

    static private final SubLString $str_alt16$ASD__ = makeString("ASD%~");

    static private final SubLList $list_alt19 = list(makeSymbol("FORMAT-NIL-PERCENT"));

    static private final SubLList $list_alt21 = list(makeSymbol("FORMAT-NIL-TILDE"));

    static private final SubLList $list_alt23 = list(makeSymbol("OPERATOR"), makeSymbol("ARG"));

    static private final SubLList $list_alt25 = cons(makeSymbol("NEXT-CONTROL"), makeSymbol("REST-CONTROL"));

    static private final SubLString $str_alt26$_A = makeString("~A");

    static private final SubLString $str_alt27$_S = makeString("~S");

    static private final SubLString $str_alt28$_D = makeString("~D");

    static private final SubLString $str_alt29$__ = makeString("~%");

    static private final SubLString $str_alt30$__ = makeString("~~");

    static private final SubLString $str_alt33$___A = makeString("~%~A");
}

/**
 * Total time: 131 ms
 */
