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



import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_0;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_E;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_b;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_backslash;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_colon;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_hash;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_hyphen;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_lparen;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_o;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_period;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_quotation;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_quote;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_r;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_rparen;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_space;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_vertical;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_x;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.both_case_p;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.charE;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.digit_char;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.upper_case_p;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.bind;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.currentBinding;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.rebind;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions.print_function;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.hash_table_count;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.hash_table_size;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.hash_table_test;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.abs;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.add;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.float_sign;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.infinity_p;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.min;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.multiply;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.not_a_number_p;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.subtract;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.truncate;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Packages.$package$;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Packages.find_symbol;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Packages.package_name;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow.format;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow.write;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.find;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.length;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures.register_method;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.symbol_function;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.symbol_name;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.symbol_package;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.$is_thread_performing_cleanupP$;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.$dtp_bignum$;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.$dtp_character$;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.$dtp_cons$;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.$dtp_fixnum$;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.$dtp_float$;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.$dtp_function$;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.$dtp_hash_table$;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.$dtp_string$;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.$dtp_symbol$;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.$dtp_vector$;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.getValuesAsVector;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.restoreValuesFromVector;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors.aref;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors.make_vector;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors.set_aref;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeBoolean;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeInteger;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeKeyword;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeString;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeSymbol;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.cadr;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high.$print_array$;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high.$print_base$;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high.$print_case$;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high.$print_escape$;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high.$print_object_method_table$;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high.$print_pretty$;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high.$print_radix$;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high.$print_readably$;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high.circular_reference_p;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high.princ;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high.print_not_readable;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader.single_escape_syntaxp;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader.symbol_escapep;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.close;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.get_output_stream_string;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.make_private_string_output_stream;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.write_char;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.write_string;
import static com.cyc.tool.subl.util.SubLFiles.declareFunction;
import static com.cyc.tool.subl.util.SubLFiles.defvar;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Guids;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Strings;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLNil;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


public class print_functions extends SubLTranslatedFile {
    public static SubLObject declare_print_functions_file() {
        declareFunction("print_integer_internal", "PRINT-INTEGER-INTERNAL", 3, 0, false);
        declareFunction("print_bignum_internal", "PRINT-BIGNUM-INTERNAL", 5, 0, false);
        declareFunction("print_integer", "PRINT-INTEGER", 2, 0, false);
        declareFunction("print_object_bignum_method", "PRINT-OBJECT-BIGNUM-METHOD", 2, 0, false);
        declareFunction("print_object_fixnum_method", "PRINT-OBJECT-FIXNUM-METHOD", 2, 0, false);
        declareFunction("print_flonum", "PRINT-FLONUM", 2, 0, false);
        declareFunction("print_object_float_method", "PRINT-OBJECT-FLOAT-METHOD", 2, 0, false);
        declareFunction("print_character", "PRINT-CHARACTER", 2, 0, false);
        declareFunction("print_object_character_method", "PRINT-OBJECT-CHARACTER-METHOD", 2, 0, false);
        declareFunction("print_symbol_package_portion", "PRINT-SYMBOL-PACKAGE-PORTION", 2, 0, false);
        declareFunction("escape_vertical_bars", "ESCAPE-VERTICAL-BARS", 1, 0, false);
        declareFunction("print_symbol", "PRINT-SYMBOL", 2, 0, false);
        declareFunction("print_object_symbol_method", "PRINT-OBJECT-SYMBOL-METHOD", 2, 0, false);
        declareFunction("print_string", "PRINT-STRING", 2, 0, false);
        declareFunction("print_object_string_method", "PRINT-OBJECT-STRING-METHOD", 2, 0, false);
        declareFunction("print_cons_cells", "PRINT-CONS-CELLS", 2, 0, false);
        declareFunction("print_object_cons_method", "PRINT-OBJECT-CONS-METHOD", 2, 0, false);
        declareFunction("print_vector", "PRINT-VECTOR", 2, 0, false);
        declareFunction("print_object_vector_method", "PRINT-OBJECT-VECTOR-METHOD", 2, 0, false);
        declareFunction("print_hashtable", "PRINT-HASHTABLE", 2, 0, false);
        declareFunction("print_object_hash_table_method", "PRINT-OBJECT-HASH-TABLE-METHOD", 2, 0, false);
        declareFunction("print_object_function_method", "PRINT-OBJECT-FUNCTION-METHOD", 2, 0, false);
        declareFunction("write_guid_string", "WRITE-GUID-STRING", 2, 0, false);
        declareFunction("print_guid_internal", "PRINT-GUID-INTERNAL", 2, 0, false);
        declareFunction("print_object_guid_method", "PRINT-OBJECT-GUID-METHOD", 2, 0, false);
        return SubLNil.NIL;
    }

    public static SubLObject escape_vertical_bars(SubLObject string) {
        if (SubLNil.NIL == find(CHAR_vertical, string, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED))
            return string;

        SubLObject result = SubLNil.NIL;
        SubLObject stream = SubLNil.NIL;
        try {
            stream = make_private_string_output_stream();
            SubLObject cdotimes_end_var;
            SubLObject i;
            SubLObject curr;
            for (cdotimes_end_var = length(string), i = SubLNil.NIL, i = ZERO_INTEGER; i.numL(cdotimes_end_var); i = add(i, ONE_INTEGER)) {
                curr = Strings.sublisp_char(string, i);
                if (SubLNil.NIL != charE(curr, CHAR_vertical))
                    write_char(CHAR_backslash, stream);

                write_char(curr, stream);
            }
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

    public static SubLObject init_print_functions_file() {
        defvar("*MAX-FIXNUM-BASE-POWER*", make_vector($int$37, UNPROVIDED));
        defvar("*MAX-FIXNUM-POWER-LESS-ONE*", make_vector($int$37, UNPROVIDED));
        return SubLNil.NIL;
    }

    public static SubLObject print_bignum_internal(SubLObject bignum, SubLObject stream, SubLObject radix, SubLObject divisor, SubLObject power_less_one) {
        SubLThread thread = SubLProcess.currentSubLThread();
        thread.resetMultipleValues();
        SubLObject quotient = truncate(bignum, divisor);
        SubLObject remainder = thread.secondMultipleValue();
        thread.resetMultipleValues();
        if (quotient.isFixnum())
            print_integer_internal(quotient, stream, radix);
        else
            print_bignum_internal(quotient, stream, radix, divisor, power_less_one);

        SubLObject num_zeros = SubLNil.NIL;
        SubLObject base_power = SubLNil.NIL;
        num_zeros = power_less_one;
        for (base_power = radix; !base_power.numG(remainder); base_power = multiply(base_power, radix))
            num_zeros = subtract(num_zeros, ONE_INTEGER);

        SubLObject i;
        for (i = SubLNil.NIL, i = ZERO_INTEGER; i.numL(num_zeros); i = add(i, ONE_INTEGER))
            write_char(CHAR_0, stream);

        print_integer_internal(remainder, stream, radix);
        return SubLNil.NIL;
    }

    public static SubLObject print_character(SubLObject character, SubLObject stream) {
        SubLThread thread = SubLProcess.currentSubLThread();
        if (SubLNil.NIL != $print_escape$.getDynamicValue(thread)) {
            write_char(CHAR_hash, stream);
            write_char(CHAR_backslash, stream);
            write_string(character_names.character_names(character).first(), stream, UNPROVIDED, UNPROVIDED);
        } else
            write_char(character, stream);

        return character;
    }

    public static SubLObject print_cons_cells(SubLObject cons, SubLObject stream) {
        SubLThread thread = SubLProcess.currentSubLThread();
        if ((SubLNil.NIL == $print_readably$.getDynamicValue(thread)) && $print_level$.getDynamicValue(thread).eql(ZERO_INTEGER))
            write_char(CHAR_hash, stream);
        else {
            SubLObject _prev_bind_0 = $print_level$.currentBinding(thread);
            try {
                $print_level$.bind(SubLNil.NIL != $print_level$.getDynamicValue(thread) ? subtract($print_level$.getDynamicValue(thread), ONE_INTEGER) : SubLNil.NIL, thread);
                SubLObject done = SubLNil.NIL;
                SubLObject count = ONE_INTEGER;
                SubLObject first = cons.first();
                SubLObject tail = cons.rest();
                if ((((SubLNil.NIL != $print_pretty$.getDynamicValue(thread)) && first.eql(QUOTE)) && tail.isCons()) && (SubLNil.NIL == tail.rest())) {
                    write_char(CHAR_quote, stream);
                    write(cadr(cons), new SubLObject[]{ $STREAM, stream });
                } else {
                    write_char(CHAR_lparen, stream);
                    write(first, new SubLObject[]{ $STREAM, stream });
                    while ((!tail.isAtom()) && (SubLNil.NIL == done))
                        if (SubLNil.NIL != circular_reference_p(tail, stream)) {
                            write_string($str18$___, stream, UNPROVIDED, UNPROVIDED);
                            write(tail, new SubLObject[]{ $STREAM, stream });
                            done = T;
                        } else
                            if (((SubLNil.NIL == $print_readably$.getDynamicValue(thread)) && (SubLNil.NIL != $print_length$.getDynamicValue(thread))) && count.numGE($print_length$.getDynamicValue(thread))) {
                                write_string($str19$____, stream, UNPROVIDED, UNPROVIDED);
                                done = T;
                            } else {
                                write_char(CHAR_space, stream);
                                write(tail.first(), new SubLObject[]{ $STREAM, stream });
                                tail = tail.rest();
                                count = add(count, ONE_INTEGER);
                            }


                    if (!tail.isList()) {
                        write_string($str18$___, stream, UNPROVIDED, UNPROVIDED);
                        write(tail, new SubLObject[]{ $STREAM, stream });
                    }
                    write_char(CHAR_rparen, stream);
                }
            } finally {
                $print_level$.rebind(_prev_bind_0, thread);
            }
        }
        return cons;
    }

    public static SubLObject print_flonum(SubLObject flonum, SubLObject stream) {
        SubLThread thread = SubLProcess.currentSubLThread();
        if (float_sign(flonum, UNPROVIDED).isNegative())
            write_char(CHAR_hyphen, stream);

        if (SubLNil.NIL != infinity_p(flonum))
            write_string($$$Inf, stream, UNPROVIDED, UNPROVIDED);
        else
            if (SubLNil.NIL != not_a_number_p(flonum))
                write_string($$$NaN, stream, UNPROVIDED, UNPROVIDED);
            else {
                thread.resetMultipleValues();
                SubLObject digits = math_utilities.flonum_digit_list(flonum);
                SubLObject scale = thread.secondMultipleValue();
                thread.resetMultipleValues();
                if (scale.numGE($int$_2) && scale.numL(EIGHT_INTEGER)) {
                    if (scale.isPositive()) {
                        SubLObject i;
                        SubLObject digit;
                        for (i = SubLNil.NIL, i = ZERO_INTEGER; i.numL(scale); i = add(i, ONE_INTEGER)) {
                            digit = digits.first();
                            write_char(SubLNil.NIL != digit ? digit_char(digit) : CHAR_0, stream);
                            digits = digits.rest();
                        }
                        write_char(CHAR_period, stream);
                    } else {
                        write_char(CHAR_0, stream);
                        write_char(CHAR_period, stream);
                        SubLObject cdotimes_end_var;
                        SubLObject j;
                        for (cdotimes_end_var = abs(scale), j = SubLNil.NIL, j = ZERO_INTEGER; j.numL(cdotimes_end_var); j = add(j, ONE_INTEGER))
                            write_char(CHAR_0, stream);

                    }
                    if (SubLNil.NIL != digits) {
                        SubLObject cdolist_list_var = digits;
                        SubLObject digit = SubLNil.NIL;
                        digit = cdolist_list_var.first();
                        while (SubLNil.NIL != cdolist_list_var) {
                            write_char(digit_char(digit), stream);
                            cdolist_list_var = cdolist_list_var.rest();
                            digit = cdolist_list_var.first();
                        } 
                    } else
                        write_char(CHAR_0, stream);

                } else {
                    write_char(SubLNil.NIL != digits ? digit_char(digits.first()) : CHAR_0, stream);
                    write_char(CHAR_period, stream);
                    if (SubLNil.NIL != digits.rest()) {
                        SubLObject cdolist_list_var = digits.rest();
                        SubLObject digit = SubLNil.NIL;
                        digit = cdolist_list_var.first();
                        while (SubLNil.NIL != cdolist_list_var) {
                            write_char(digit_char(digit), stream);
                            cdolist_list_var = cdolist_list_var.rest();
                            digit = cdolist_list_var.first();
                        } 
                    } else
                        write_char(CHAR_0, stream);

                    write_char(CHAR_E, stream);
                    SubLObject _prev_bind_0 = $print_base$.currentBinding(thread);
                    try {
                        $print_base$.bind(TEN_INTEGER, thread);
                        princ(subtract(scale, ONE_INTEGER), stream);
                    } finally {
                        $print_base$.rebind(_prev_bind_0, thread);
                    }
                }
            }

        return flonum;
    }

    public static SubLObject print_guid_internal(SubLObject object, SubLObject stream) {
        SubLThread thread = SubLProcess.currentSubLThread();
        if (SubLNil.NIL != $print_escape$.getDynamicValue(thread)) {
            write_string($str27$_G, stream, UNPROVIDED, UNPROVIDED);
            write_char(CHAR_quotation, stream);
            write_guid_string(object, stream);
            write_char(CHAR_quotation, stream);
        } else
            write_guid_string(object, stream);

        return object;
    }

    public static SubLObject print_hashtable(SubLObject hash_table, SubLObject stream) {
        SubLThread thread = SubLProcess.currentSubLThread();
        if (SubLNil.NIL != $print_readably$.getDynamicValue(thread))
            print_not_readable(hash_table, stream);
        else {
            print_macros.print_unreadable_object_preamble(stream, hash_table, T, T);
            format(stream, $str24$TEST__A__D__D, new SubLObject[]{ hash_table_test(hash_table), hash_table_count(hash_table), hash_table_size(hash_table) });
            print_macros.print_unreadable_object_postamble(stream, hash_table, T, T);
        }
        return hash_table;
    }

    public static SubLObject print_integer(SubLObject integer, SubLObject stream) {
        SubLThread thread = SubLProcess.currentSubLThread();
        if ((SubLNil.NIL != $print_radix$.getDynamicValue(thread)) && (!$print_base$.getDynamicValue(thread).numE(TEN_INTEGER))) {
            write_char(CHAR_hash, stream);
            SubLObject pcase_var = $print_base$.getDynamicValue(thread);
            if (pcase_var.eql(TWO_INTEGER))
                write_char(CHAR_b, stream);
            else
                if (pcase_var.eql(EIGHT_INTEGER))
                    write_char(CHAR_o, stream);
                else
                    if (pcase_var.eql(SIXTEEN_INTEGER))
                        write_char(CHAR_x, stream);
                    else {
                        SubLObject radix = $print_base$.getDynamicValue(thread);
                        SubLObject _prev_bind_0 = $print_base$.currentBinding(thread);
                        SubLObject _prev_bind_2 = $print_radix$.currentBinding(thread);
                        try {
                            $print_base$.bind(TEN_INTEGER, thread);
                            $print_radix$.bind(SubLNil.NIL, thread);
                            print_integer_internal(radix, stream, $print_base$.getDynamicValue(thread));
                            write_char(CHAR_r, stream);
                        } finally {
                            $print_radix$.rebind(_prev_bind_2, thread);
                            $print_base$.rebind(_prev_bind_0, thread);
                        }
                    }


        }
        if (integer.isNegative())
            write_char(CHAR_hyphen, stream);

        if (integer.isInteger() && (!integer.isFixnum()))
            print_bignum_internal(abs(integer), stream, $print_base$.getDynamicValue(thread), aref($max_fixnum_base_power$.getDynamicValue(thread), $print_base$.getDynamicValue(thread)), aref($max_fixnum_power_less_one$.getDynamicValue(thread), $print_base$.getDynamicValue(thread)));
        else
            print_integer_internal(abs(integer), stream, $print_base$.getDynamicValue(thread));

        if ((SubLNil.NIL != $print_radix$.getDynamicValue(thread)) && $print_base$.getDynamicValue(thread).numE(TEN_INTEGER))
            write_char(CHAR_period, stream);

        return integer;
    }

    public static SubLObject print_integer_internal(SubLObject integer, SubLObject stream, SubLObject print_base) {
        SubLThread thread = SubLProcess.currentSubLThread();
        thread.resetMultipleValues();
        SubLObject quotient = truncate(integer, print_base);
        SubLObject remainder = thread.secondMultipleValue();
        thread.resetMultipleValues();
        if (!quotient.isZero())
            print_integer_internal(quotient, stream, print_base);

        write_char(digit_char(remainder), stream);
        return integer;
    }

    public static SubLObject print_object_bignum_method(SubLObject bignum, SubLObject stream) {
        print_integer(bignum, stream);
        return bignum;
    }

    public static SubLObject print_object_character_method(SubLObject character, SubLObject stream) {
        print_character(character, stream);
        return character;
    }

    public static SubLObject print_object_cons_method(SubLObject cons, SubLObject stream) {
        print_cons_cells(cons, stream);
        return cons;
    }

    public static SubLObject print_object_fixnum_method(SubLObject fixnum, SubLObject stream) {
        print_integer(fixnum, stream);
        return fixnum;
    }

    public static SubLObject print_object_float_method(SubLObject flonum, SubLObject stream) {
        print_flonum(flonum, stream);
        return flonum;
    }

    public static SubLObject print_object_function_method(SubLObject function, SubLObject stream) {
        print_function(function, stream);
        return function;
    }

    public static SubLObject print_object_guid_method(SubLObject guid, SubLObject stream) {
        print_guid_internal(guid, stream);
        return guid;
    }

    public static SubLObject print_object_hash_table_method(SubLObject hash_table, SubLObject stream) {
        print_hashtable(hash_table, stream);
        return hash_table;
    }

    public static SubLObject print_object_string_method(SubLObject string, SubLObject stream) {
        print_string(string, stream);
        return string;
    }

    public static SubLObject print_object_symbol_method(SubLObject symbol, SubLObject stream) {
        print_symbol(symbol, stream);
        return symbol;
    }

    public static SubLObject print_object_vector_method(SubLObject vector, SubLObject stream) {
        print_vector(vector, stream);
        return vector;
    }

    public static SubLObject print_string(SubLObject string, SubLObject stream) {
        SubLThread thread = SubLProcess.currentSubLThread();
        if (SubLNil.NIL != $print_escape$.getDynamicValue(thread)) {
            write_char(CHAR_quotation, stream);
            SubLObject cdotimes_end_var;
            SubLObject i;
            SubLObject ch;
            for (cdotimes_end_var = length(string), i = SubLNil.NIL, i = ZERO_INTEGER; i.numL(cdotimes_end_var); i = add(i, ONE_INTEGER)) {
                ch = Strings.sublisp_char(string, i);
                if ((SubLNil.NIL != charE(ch, CHAR_quotation)) || (SubLNil.NIL != single_escape_syntaxp(ch)))
                    write_char(CHAR_backslash, stream);

                write_char(ch, stream);
            }
            write_char(CHAR_quotation, stream);
        } else
            write_string(string, stream, UNPROVIDED, UNPROVIDED);

        return string;
    }

    public static SubLObject print_symbol(SubLObject symbol, SubLObject stream) {
        SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject name = symbol_name(symbol);
        if (SubLNil.NIL != $print_escape$.getDynamicValue(thread))
            print_symbol_package_portion(symbol, stream);

        if ((SubLNil.NIL != $print_escape$.getDynamicValue(thread)) || (SubLNil.NIL != $print_readably$.getDynamicValue(thread))) {
            if (SubLNil.NIL != symbol_escapep(symbol)) {
                write_char(CHAR_vertical, stream);
                write_string(escape_vertical_bars(name), stream, UNPROVIDED, UNPROVIDED);
                write_char(CHAR_vertical, stream);
            } else
                write_string(escape_vertical_bars(name), stream, UNPROVIDED, UNPROVIDED);

        } else
            if ($print_case$.getDynamicValue(thread) == $CAPITALIZE)
                write_string(escape_vertical_bars(Strings.string_capitalize(name, UNPROVIDED, UNPROVIDED)), stream, UNPROVIDED, UNPROVIDED);
            else {
                SubLObject upper = SubLNil.NIL;
                SubLObject lower = SubLNil.NIL;
                SubLObject cdotimes_end_var;
                SubLObject i;
                SubLObject ch;
                for (cdotimes_end_var = length(name), i = SubLNil.NIL, i = ZERO_INTEGER; i.numL(cdotimes_end_var); i = add(i, ONE_INTEGER)) {
                    ch = Strings.sublisp_char(name, i);
                    if (SubLNil.NIL != both_case_p(ch))
                        if (SubLNil.NIL != upper_case_p(ch))
                            upper = T;
                        else
                            lower = T;


                }
                name = escape_vertical_bars(Strings.string_upcase(name, UNPROVIDED, UNPROVIDED));
                SubLObject pcase_var = $print_case$.getDynamicValue(thread);
                if (pcase_var.eql($UPCASE))
                    write_string(SubLNil.NIL != lower ? Strings.string_upcase(name, UNPROVIDED, UNPROVIDED) : name, stream, UNPROVIDED, UNPROVIDED);
                else
                    if (pcase_var.eql($DOWNCASE))
                        write_string(SubLNil.NIL != upper ? Strings.string_downcase(name, UNPROVIDED, UNPROVIDED) : name, stream, UNPROVIDED, UNPROVIDED);


            }

        return symbol;
    }

    public static SubLObject print_symbol_package_portion(SubLObject symbol, SubLObject stream) {
        SubLThread thread = SubLProcess.currentSubLThread();
        if (symbol.isKeyword())
            write_char(CHAR_colon, stream);
        else {
            thread.resetMultipleValues();
            SubLObject symb = find_symbol(symbol_name(symbol), $package$.getDynamicValue(thread));
            SubLObject state = thread.secondMultipleValue();
            thread.resetMultipleValues();
            if ((SubLNil.NIL == state) || (!symb.eql(symbol))) {
                SubLObject v_package = symbol_package(symbol);
                if (!v_package.isPackage())
                    write_string($str9$__, stream, UNPROVIDED, UNPROVIDED);
                else {
                    thread.resetMultipleValues();
                    SubLObject sym = find_symbol(symbol_name(symbol), v_package);
                    SubLObject tag = thread.secondMultipleValue();
                    thread.resetMultipleValues();
                    write_string(package_name(v_package), stream, UNPROVIDED, UNPROVIDED);
                    write_char(CHAR_colon, stream);
                    if (tag == $INTERNAL)
                        write_char(CHAR_colon, stream);

                }
            }
        }
        return symbol;
    }

    public static SubLObject print_vector(SubLObject vector, SubLObject stream) {
        SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject length = length(vector);
        if (SubLNil.NIL != $print_readably$.getDynamicValue(thread)) {
            write_char(CHAR_hash, stream);
            write_char(CHAR_lparen, stream);
            if (length.isPositive()) {
                write(aref(vector, ZERO_INTEGER), new SubLObject[]{ $STREAM, stream });
                SubLObject cdotimes_end_var;
                SubLObject i;
                for (cdotimes_end_var = subtract(length, ONE_INTEGER), i = SubLNil.NIL, i = ZERO_INTEGER; i.numL(cdotimes_end_var); i = add(i, ONE_INTEGER)) {
                    write_char(CHAR_space, stream);
                    write(aref(vector, add(i, ONE_INTEGER)), new SubLObject[]{ $STREAM, stream });
                }
            }
            write_char(CHAR_rparen, stream);
        } else
            if (SubLNil.NIL != $print_array$.getDynamicValue(thread)) {
                write_char(CHAR_hash, stream);
                if (!$print_level$.getDynamicValue(thread).eql(ZERO_INTEGER)) {
                    write_char(CHAR_lparen, stream);
                    SubLObject actual = (SubLNil.NIL != $print_length$.getDynamicValue(thread)) ? min($print_length$.getDynamicValue(thread), length) : length;
                    SubLObject _prev_bind_0 = $print_level$.currentBinding(thread);
                    try {
                        $print_level$.bind(SubLNil.NIL != $print_level$.getDynamicValue(thread) ? subtract($print_level$.getDynamicValue(thread), ONE_INTEGER) : SubLNil.NIL, thread);
                        SubLObject j;
                        for (j = SubLNil.NIL, j = ZERO_INTEGER; j.numL(actual); j = add(j, ONE_INTEGER)) {
                            if (!j.isZero())
                                write_char(CHAR_space, stream);

                            write(aref(vector, j), new SubLObject[]{ $STREAM, stream });
                        }
                        if (actual.numL(length)) {
                            if (actual.isPositive())
                                write_char(CHAR_space, stream);

                            write_string($str21$___, stream, UNPROVIDED, UNPROVIDED);
                        }
                    } finally {
                        $print_level$.rebind(_prev_bind_0, thread);
                    }
                    write_char(CHAR_rparen, stream);
                }
            } else
                if (SubLNil.NIL != $print_readably$.getDynamicValue(thread))
                    print_not_readable(vector, stream);
                else {
                    print_macros.print_unreadable_object_preamble(stream, vector, T, T);
                    format(stream, $str22$_D, length);
                    print_macros.print_unreadable_object_postamble(stream, vector, T, T);
                }


        return vector;
    }

    public static SubLObject setup_print_functions_file() {
        SubLObject radix;
        SubLObject final_power_less_one;
        SubLObject final_divisor;
        SubLObject done;
        SubLObject power_less_one;
        SubLObject divisor;
        SubLObject new_divisor;
        for (radix = SubLNil.NIL, radix = TWO_INTEGER; !radix.numG($int$36); radix = add(radix, ONE_INTEGER)) {
            final_power_less_one = MINUS_ONE_INTEGER;
            final_divisor = ONE_INTEGER;
            done = SubLNil.NIL;
            power_less_one = SubLNil.NIL;
            divisor = SubLNil.NIL;
            new_divisor = SubLNil.NIL;
            power_less_one = MINUS_ONE_INTEGER;
            divisor = ONE_INTEGER;
            new_divisor = radix;
            while (SubLNil.NIL == done) {
                done = makeBoolean(!new_divisor.isFixnum());
                if (SubLNil.NIL != done) {
                    final_divisor = divisor;
                    final_power_less_one = power_less_one;
                }
                power_less_one = add(power_less_one, ONE_INTEGER);
                divisor = new_divisor;
                new_divisor = multiply(new_divisor, radix);
            } 
            set_aref($max_fixnum_base_power$.getDynamicValue(), radix, final_divisor);
            set_aref($max_fixnum_power_less_one$.getDynamicValue(), radix, final_power_less_one);
        }
        register_method($print_object_method_table$.getGlobalValue(), $dtp_bignum$.getGlobalValue(), symbol_function(PRINT_OBJECT_BIGNUM_METHOD));
        register_method($print_object_method_table$.getGlobalValue(), $dtp_fixnum$.getGlobalValue(), symbol_function(PRINT_OBJECT_FIXNUM_METHOD));
        register_method($print_object_method_table$.getGlobalValue(), $dtp_float$.getGlobalValue(), symbol_function(PRINT_OBJECT_FLOAT_METHOD));
        register_method($print_object_method_table$.getGlobalValue(), $dtp_character$.getGlobalValue(), symbol_function(PRINT_OBJECT_CHARACTER_METHOD));
        register_method($print_object_method_table$.getGlobalValue(), $dtp_symbol$.getGlobalValue(), symbol_function(PRINT_OBJECT_SYMBOL_METHOD));
        register_method($print_object_method_table$.getGlobalValue(), $dtp_string$.getGlobalValue(), symbol_function(PRINT_OBJECT_STRING_METHOD));
        register_method($print_object_method_table$.getGlobalValue(), $dtp_cons$.getGlobalValue(), symbol_function(PRINT_OBJECT_CONS_METHOD));
        register_method($print_object_method_table$.getGlobalValue(), $dtp_vector$.getGlobalValue(), symbol_function(PRINT_OBJECT_VECTOR_METHOD));
        register_method($print_object_method_table$.getGlobalValue(), $dtp_hash_table$.getGlobalValue(), symbol_function(PRINT_OBJECT_HASH_TABLE_METHOD));
        register_method($print_object_method_table$.getGlobalValue(), $dtp_function$.getGlobalValue(), symbol_function(PRINT_OBJECT_FUNCTION_METHOD));
        register_method($print_object_method_table$.getGlobalValue(), Guids.$dtp_guid$.getGlobalValue(), symbol_function(PRINT_OBJECT_GUID_METHOD));
        return SubLNil.NIL;
    }

    public static SubLObject write_guid_string(SubLObject guid, SubLObject stream) {
        write_string(Guids.guid_to_string(guid), stream, UNPROVIDED, UNPROVIDED);
        return SubLNil.NIL;
    }

    public static final SubLFile me = new print_functions();

    public static final String myName = "com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_functions";

    // defvar
    // Used for storing the value of the maximum power of a radix that is still
    //a fixnum i.e. (FLOOR (LOG MOST-POSITIVE-FIXNUM RADIX)).
    private static final SubLSymbol $max_fixnum_base_power$ = makeSymbol("*MAX-FIXNUM-BASE-POWER*");

    // defvar
    // Used for storing the value of the integer such that a radix raised to one
    //plus that power is the corresponding entry in *max-fixnum-base-power*.
    private static final SubLSymbol $max_fixnum_power_less_one$ = makeSymbol("*MAX-FIXNUM-POWER-LESS-ONE*");

    private static final SubLInteger $int$37 = makeInteger(37);

    private static final SubLInteger $int$36 = makeInteger(36);

    public static final SubLSymbol PRINT_OBJECT_BIGNUM_METHOD = makeSymbol("PRINT-OBJECT-BIGNUM-METHOD");

    public static final SubLSymbol PRINT_OBJECT_FIXNUM_METHOD = makeSymbol("PRINT-OBJECT-FIXNUM-METHOD");

    public static final SubLString $$$Inf = makeString("Inf");

    public static final SubLString $$$NaN = makeString("NaN");



    public static final SubLSymbol PRINT_OBJECT_FLOAT_METHOD = makeSymbol("PRINT-OBJECT-FLOAT-METHOD");

    public static final SubLSymbol PRINT_OBJECT_CHARACTER_METHOD = makeSymbol("PRINT-OBJECT-CHARACTER-METHOD");

    public static final SubLString $str9$__ = makeString("#:");



    public static final SubLSymbol $CAPITALIZE = makeKeyword("CAPITALIZE");





    public static final SubLSymbol PRINT_OBJECT_SYMBOL_METHOD = makeSymbol("PRINT-OBJECT-SYMBOL-METHOD");

    public static final SubLSymbol PRINT_OBJECT_STRING_METHOD = makeSymbol("PRINT-OBJECT-STRING-METHOD");





    public static final SubLString $str18$___ = makeString(" . ");

    public static final SubLString $str19$____ = makeString(" ...");

    public static final SubLSymbol PRINT_OBJECT_CONS_METHOD = makeSymbol("PRINT-OBJECT-CONS-METHOD");

    public static final SubLString $str21$___ = makeString("...");

    private static final SubLString $str22$_D = makeString("~D");

    private static final SubLSymbol PRINT_OBJECT_VECTOR_METHOD = makeSymbol("PRINT-OBJECT-VECTOR-METHOD");

    private static final SubLString $str24$TEST__A__D__D = makeString("TEST ~A ~D/~D");

    private static final SubLSymbol PRINT_OBJECT_HASH_TABLE_METHOD = makeSymbol("PRINT-OBJECT-HASH-TABLE-METHOD");

    private static final SubLSymbol PRINT_OBJECT_FUNCTION_METHOD = makeSymbol("PRINT-OBJECT-FUNCTION-METHOD");

    private static final SubLString $str27$_G = makeString("#G");

    private static final SubLSymbol PRINT_OBJECT_GUID_METHOD = makeSymbol("PRINT-OBJECT-GUID-METHOD");

    static {
































    }

    @Override
    public void declareFunctions() {
        declare_print_functions_file();
    }

    @Override
    public void initializeVariables() {
        init_print_functions_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_print_functions_file();
    }
}

