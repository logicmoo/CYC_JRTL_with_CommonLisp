/**
 *
 */
/**
 * //
 */
/**
 *
 */
package com.cyc.cycjava.cycl;


import static com.cyc.cycjava.cycl.constant_handles.reader_make_constant_shell;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions.apply;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.symbol_function;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors.aref;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high.prin1_to_string;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader.read_from_string_ignoring_errors;
import static com.cyc.tool.subl.util.SubLFiles.*;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.BinaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sort;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Strings;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLFloat;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


public final class numeral_parser extends SubLTranslatedFile {
    public static SubLObject standardize_number_string(final SubLObject string, SubLObject number_type) {
        if (number_type == UNPROVIDED) {
            number_type = $AMERICAN;
        }
        return string_utilities.remove_substring(string, $str14$_);
    }

    public static SubLObject initialize_number_values() {
        final SubLObject number_values = make_hash_table($int$100, symbol_function(EQUALP), UNPROVIDED);
        SubLObject cdolist_list_var;
        final SubLObject tables = cdolist_list_var = list(new SubLObject[]{ $null$.getGlobalValue(), $a$.getGlobalValue(), $digits$.getGlobalValue(), $teens$.getGlobalValue(), $fuzzies$.getGlobalValue(), $atomic_tens$.getGlobalValue(), $onedozen$.getGlobalValue(), $onehundred$.getGlobalValue(), $onethousand$.getGlobalValue(), $onemillion$.getGlobalValue(), $onebillion$.getGlobalValue(), $onetrillion$.getGlobalValue(), $irregular_denominators$.getGlobalValue() });
        SubLObject table = NIL;
        table = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject cdolist_list_var_$1 = table;
            SubLObject entry = NIL;
            entry = cdolist_list_var_$1.first();
            while (NIL != cdolist_list_var_$1) {
                sethash(entry.first(), number_values, entry.rest());
                cdolist_list_var_$1 = cdolist_list_var_$1.rest();
                entry = cdolist_list_var_$1.first();
            } 
            cdolist_list_var = cdolist_list_var.rest();
            table = cdolist_list_var.first();
        } 
        return number_values;
    }

    public static SubLObject number_value(final SubLObject string) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != string_utilities.empty_string_p(string)) {
            return NIL;
        }
        final SubLObject v_object = read_from_string_ignoring_errors(string, NIL, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        if (v_object.isNumber()) {
            return v_object;
        }
        final SubLObject lookup_string = (NIL != parsing_vars.$numeral_parser_case_sensitiveP$.getDynamicValue(thread)) ? string : Strings.string_downcase(string, UNPROVIDED, UNPROVIDED);
        return gethash(lookup_string, $number_values$.getDynamicValue(thread), gethash(string_utilities.strip_trailer(lookup_string, $$$s), $number_values$.getDynamicValue(thread), gethash(string_utilities.strip_trailer(lookup_string, $$$th), $number_values$.getDynamicValue(thread), gethash(string_utilities.strip_trailer(lookup_string, $$$ths), $number_values$.getDynamicValue(thread), UNPROVIDED))));
    }

    public static SubLObject number_string_signP(final SubLObject word) {
        return number_utilities.number_string_p(document.sign_string(word));
    }

    public static SubLObject hyphenated_number_value(final SubLObject string) {
        final SubLObject components = string_utilities.split_string(string, $list19);
        return combine_number_values(number_value(components.first()), $PLUS, number_value(second(components)));
    }

    public static SubLObject combine_number_values(final SubLObject val1, final SubLObject type, final SubLObject val2) {
        assert NIL != keywordp(type) : "Types.keywordp(type) " + "CommonSymbols.NIL != Types.keywordp(type) " + type;
        final SubLObject raw_value = (val1.isNumber() && val2.isNumber()) ? combine_non_cycl_number_values(val1, type, val2) : combine_cycl_number_values(val1, type, val2);
        return (type == $TIMES) && (NIL != number_utilities.extended_potentially_infinite_number_p(raw_value)) ? number_utilities.significant_digits(raw_value, numeral_parser_max_significant_digits(val1, val2)) : raw_value;
    }

    public static SubLObject numeral_parser_max_significant_digits(final SubLObject val1, final SubLObject val2) {
        final SubLObject sd1 = numeral_parser_significant_digits(val1);
        final SubLObject sd2 = numeral_parser_significant_digits(val2);
        return max(sd1, sd2);
    }

    public static SubLObject numeral_parser_significant_digits(final SubLObject val) {
        final SubLObject string = remove(CHAR_period, prin1_to_string(val), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        final SubLObject suffix_start = list_utilities.position_if_not(DIGIT_CHAR_P, string, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        return NIL != suffix_start ? suffix_start : length(string);
    }

    public static SubLObject combine_cycl_number_values(final SubLObject val1, final SubLObject type, final SubLObject val2) {
        SubLObject raw_value = NIL;
        if (type.eql($PLUS)) {
            raw_value = list($$PlusFn, val1, val2);
        } else
            if (type.eql($TIMES)) {
                raw_value = list($$TimesFn, val1, val2);
            } else
                if (type.eql($DIVIDEDBY)) {
                    raw_value = list($$QuotientFn, val1, val2);
                } else
                    if (type.eql($TOTHE)) {
                        raw_value = list($$ExponentFn, val1, val2);
                    }



        return simplifier.simplify_number_expression(raw_value);
    }

    public static SubLObject combine_non_cycl_number_values(final SubLObject val1, final SubLObject type, final SubLObject val2) {
        if (type.eql($PLUS)) {
            return add(val1, val2);
        }
        if (type.eql($TIMES)) {
            return multiply(val1, val2);
        }
        if (type.eql($DIVIDEDBY)) {
            return divide(val1, val2);
        }
        if (type.eql($TOTHE)) {
            return expt(val1, val2);
        }
        return NIL;
    }

    public static SubLObject numeral_parser_stringE(final SubLObject string1, final SubLObject string2) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return NIL != parsing_vars.$numeral_parser_case_sensitiveP$.getDynamicValue(thread) ? cycl_string.cycl_stringE(string1, string2) : cycl_string.cycl_string_equal(string1, string2);
    }

    public static SubLObject numeral_parser_charE(final SubLObject char1, final SubLObject char2) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return NIL != parsing_vars.$numeral_parser_case_sensitiveP$.getDynamicValue(thread) ? charE(char1, char2) : char_equal(char1, char2);
    }

    public static SubLObject zero_literalP(final SubLObject v_object) {
        return makeBoolean((NIL != document.sign_p(v_object)) && (NIL != numeral_parser_stringE(document.sign_string(v_object), $$$zero)));
    }

    public static SubLObject indefinite_signP(final SubLObject v_object) {
        return makeBoolean((NIL != document.sign_p(v_object)) && (NIL != member($INDEFINITE, document.sign_category(v_object), UNPROVIDED, UNPROVIDED)));
    }

    public static SubLObject atomic_ten_signP(final SubLObject v_object) {
        return makeBoolean((NIL != document.sign_p(v_object)) && (NIL != assoc(document.sign_string(v_object), $atomic_tens$.getGlobalValue(), symbol_function($sym32$NUMERAL_PARSER_STRING_), UNPROVIDED)));
    }

    public static SubLObject digit_signP(final SubLObject v_object) {
        return makeBoolean((NIL != document.sign_p(v_object)) && (NIL != assoc(document.sign_string(v_object), $digits$.getGlobalValue(), symbol_function($sym32$NUMERAL_PARSER_STRING_), UNPROVIDED)));
    }

    public static SubLObject deci_signP(final SubLObject v_object) {
        return makeBoolean((NIL != document.sign_p(v_object)) && (NIL != assoc(document.sign_string(v_object), $digits$.getGlobalValue(), symbol_function($sym32$NUMERAL_PARSER_STRING_), UNPROVIDED)));
    }

    public static SubLObject hyphen_signP(final SubLObject v_object) {
        return makeBoolean((NIL != document.sign_p(v_object)) && document.sign_string(v_object).equal($str33$_));
    }

    public static SubLObject teen_signP(final SubLObject v_object) {
        return makeBoolean((NIL != document.sign_p(v_object)) && (NIL != assoc(document.sign_string(v_object), $teens$.getGlobalValue(), symbol_function($sym32$NUMERAL_PARSER_STRING_), UNPROVIDED)));
    }

    public static SubLObject fuzzy_signP(final SubLObject v_object) {
        return makeBoolean((NIL != document.sign_p(v_object)) && ((NIL != assoc(document.sign_string(v_object), $fuzzies$.getGlobalValue(), symbol_function($sym32$NUMERAL_PARSER_STRING_), UNPROVIDED)) || (NIL != member($FUZZY, document.sign_category(v_object), UNPROVIDED, UNPROVIDED))));
    }

    public static SubLObject non_atomic_ten_signP(final SubLObject v_object) {
        return makeBoolean((NIL != document.sign_p(v_object)) && (NIL != member($NON_ATOMIC_TEN, document.sign_category(v_object), UNPROVIDED, UNPROVIDED)));
    }

    public static SubLObject hyphenated_non_atomic_ten_signP(final SubLObject v_object) {
        if (NIL != document.sign_p(v_object)) {
            final SubLObject components = string_utilities.split_string(document.sign_string(v_object), $list19);
            return makeBoolean((length(components).numE(TWO_INTEGER) && (NIL != assoc(components.first(), $atomic_tens$.getGlobalValue(), symbol_function($sym32$NUMERAL_PARSER_STRING_), UNPROVIDED))) && (NIL != assoc(second(components), $digits$.getGlobalValue(), symbol_function($sym32$NUMERAL_PARSER_STRING_), UNPROVIDED)));
        }
        return NIL;
    }

    public static SubLObject cent_signP(final SubLObject v_object) {
        return makeBoolean((NIL != document.sign_p(v_object)) && (NIL != member($CENT, document.sign_category(v_object), UNPROVIDED, UNPROVIDED)));
    }

    public static SubLObject kilo_signP(final SubLObject v_object) {
        return makeBoolean((NIL != document.sign_p(v_object)) && (NIL != member($KILO, document.sign_category(v_object), UNPROVIDED, UNPROVIDED)));
    }

    public static SubLObject fraction_signP(final SubLObject v_object) {
        return makeBoolean((NIL != document.sign_p(v_object)) && (NIL != member($FRACTION, document.sign_category(v_object), UNPROVIDED, UNPROVIDED)));
    }

    public static SubLObject float_signP(final SubLObject v_object) {
        return makeBoolean((NIL != document.sign_p(v_object)) && (NIL != member($FLOAT, document.sign_category(v_object), UNPROVIDED, UNPROVIDED)));
    }

    public static SubLObject number_signP(final SubLObject v_object) {
        return makeBoolean((NIL != document.sign_p(v_object)) && (NIL != member($NUMBER, document.sign_category(v_object), UNPROVIDED, UNPROVIDED)));
    }

    public static SubLObject interval_signP(final SubLObject v_object) {
        return makeBoolean((NIL != document.sign_p(v_object)) && (NIL != member($INTERVAL, document.sign_category(v_object), UNPROVIDED, UNPROVIDED)));
    }

    public static SubLObject proper_interval_signP(final SubLObject v_object) {
        return makeBoolean((NIL != document.sign_p(v_object)) && (NIL != member($PROPER_INTERVAL, document.sign_category(v_object), UNPROVIDED, UNPROVIDED)));
    }

    public static SubLObject milli_signP(final SubLObject v_object) {
        return makeBoolean((NIL != document.sign_p(v_object)) && (NIL != member($MILLI, document.sign_category(v_object), UNPROVIDED, UNPROVIDED)));
    }

    public static SubLObject billi_signP(final SubLObject v_object) {
        return makeBoolean((NIL != document.sign_p(v_object)) && (NIL != member($BILLI, document.sign_category(v_object), UNPROVIDED, UNPROVIDED)));
    }

    public static SubLObject trilli_signP(final SubLObject v_object) {
        return makeBoolean((NIL != document.sign_p(v_object)) && (NIL != member($TRILLI, document.sign_category(v_object), UNPROVIDED, UNPROVIDED)));
    }

    public static SubLObject integer_signP(final SubLObject v_object) {
        return makeBoolean((NIL != document.sign_p(v_object)) && (NIL != member($INTEGER, document.sign_category(v_object), UNPROVIDED, UNPROVIDED)));
    }

    public static SubLObject extended_dozen_signP(final SubLObject v_object) {
        return makeBoolean((NIL != document.sign_p(v_object)) && (NIL != member($EXTENDED_DOZEN, document.sign_category(v_object), UNPROVIDED, UNPROVIDED)));
    }

    public static SubLObject standard_dozen_signP(final SubLObject v_object) {
        return makeBoolean((NIL != document.sign_p(v_object)) && (NIL != member($STANDARD_DOZEN, document.sign_category(v_object), UNPROVIDED, UNPROVIDED)));
    }

    public static SubLObject extended_hundred_signP(final SubLObject v_object) {
        return makeBoolean((NIL != document.sign_p(v_object)) && (NIL != member($EXTENDED_HUNDRED, document.sign_category(v_object), UNPROVIDED, UNPROVIDED)));
    }

    public static SubLObject standard_hundred_signP(final SubLObject v_object) {
        return makeBoolean((NIL != document.sign_p(v_object)) && (NIL != member($STANDARD_HUNDRED, document.sign_category(v_object), UNPROVIDED, UNPROVIDED)));
    }

    public static SubLObject thousand_signP(final SubLObject v_object) {
        return makeBoolean((NIL != document.sign_p(v_object)) && (NIL != member($THOUSAND, document.sign_category(v_object), UNPROVIDED, UNPROVIDED)));
    }

    public static SubLObject million_signP(final SubLObject v_object) {
        return makeBoolean((NIL != document.sign_p(v_object)) && (NIL != member($MILLION, document.sign_category(v_object), UNPROVIDED, UNPROVIDED)));
    }

    public static SubLObject billion_signP(final SubLObject v_object) {
        return makeBoolean((NIL != document.sign_p(v_object)) && (NIL != member($BILLION, document.sign_category(v_object), UNPROVIDED, UNPROVIDED)));
    }

    public static SubLObject trillion_signP(final SubLObject v_object) {
        return makeBoolean((NIL != document.sign_p(v_object)) && (NIL != member($TRILLION, document.sign_category(v_object), UNPROVIDED, UNPROVIDED)));
    }

    public static SubLObject and_literalP(final SubLObject v_object) {
        return makeBoolean((NIL != document.sign_p(v_object)) && (NIL != numeral_parser_stringE(document.sign_string(v_object), $$$and)));
    }

    public static SubLObject indefinite_literalP(final SubLObject v_object) {
        return makeBoolean((NIL != document.sign_p(v_object)) && (NIL != assoc(document.sign_string(v_object), $a$.getGlobalValue(), symbol_function($sym32$NUMERAL_PARSER_STRING_), UNPROVIDED)));
    }

    public static SubLObject dozen_literalP(final SubLObject v_object) {
        return makeBoolean((NIL != document.sign_p(v_object)) && (NIL != numeral_parser_stringE(document.sign_string(v_object), $$$dozen)));
    }

    public static SubLObject few_literalP(final SubLObject v_object) {
        return makeBoolean((NIL != document.sign_p(v_object)) && (NIL != numeral_parser_stringE(document.sign_string(v_object), $$$few)));
    }

    public static SubLObject hundred_literalP(final SubLObject v_object) {
        return makeBoolean((NIL != document.sign_p(v_object)) && (NIL != numeral_parser_stringE(document.sign_string(v_object), $$$hundred)));
    }

    public static SubLObject thousand_literalP(final SubLObject v_object) {
        return makeBoolean((NIL != document.sign_p(v_object)) && (NIL != numeral_parser_stringE(document.sign_string(v_object), $$$thousand)));
    }

    public static SubLObject million_literalP(final SubLObject v_object) {
        return makeBoolean((NIL != document.sign_p(v_object)) && (NIL != numeral_parser_stringE(document.sign_string(v_object), $$$million)));
    }

    public static SubLObject millions_literalP(final SubLObject v_object) {
        return makeBoolean((NIL != document.sign_p(v_object)) && (NIL != numeral_parser_stringE(document.sign_string(v_object), $$$millions)));
    }

    public static SubLObject billions_literalP(final SubLObject v_object) {
        return makeBoolean((NIL != document.sign_p(v_object)) && (NIL != numeral_parser_stringE(document.sign_string(v_object), $$$billions)));
    }

    public static SubLObject billion_literalP(final SubLObject v_object) {
        return makeBoolean((NIL != document.sign_p(v_object)) && (NIL != numeral_parser_stringE(document.sign_string(v_object), $$$billion)));
    }

    public static SubLObject trillions_literalP(final SubLObject v_object) {
        return makeBoolean((NIL != document.sign_p(v_object)) && (NIL != numeral_parser_stringE(document.sign_string(v_object), $$$trillions)));
    }

    public static SubLObject trillion_literalP(final SubLObject v_object) {
        return makeBoolean((NIL != document.sign_p(v_object)) && (NIL != numeral_parser_stringE(document.sign_string(v_object), $$$trillion)));
    }

    public static SubLObject first_literalP(final SubLObject v_object) {
        return makeBoolean((NIL != document.sign_p(v_object)) && (NIL != numeral_parser_stringE(document.sign_string(v_object), $$$first)));
    }

    public static SubLObject second_literalP(final SubLObject v_object) {
        return makeBoolean((NIL != document.sign_p(v_object)) && (NIL != numeral_parser_stringE(document.sign_string(v_object), $$$second)));
    }

    public static SubLObject seconds_literalP(final SubLObject v_object) {
        return makeBoolean((NIL != document.sign_p(v_object)) && (NIL != numeral_parser_stringE(document.sign_string(v_object), $$$seconds)));
    }

    public static SubLObject atomic_denominator_literalP(final SubLObject v_object) {
        return makeBoolean((((((NIL != document.sign_p(v_object)) && (NIL == first_literalP(v_object))) && (NIL == second_literalP(v_object))) && (NIL == seconds_literalP(v_object))) && ((((NIL != numeral_parser_stringE(document.sign_string(v_object), $$$halves)) || (NIL != assoc(string_utilities.post_remove(document.sign_string(v_object), $$$s, $sym70$NUMERAL_PARSER_CHAR_), $irregular_denominators$.getGlobalValue(), symbol_function($sym32$NUMERAL_PARSER_STRING_), UNPROVIDED))) || (NIL != string_utilities.ends_with(document.sign_string(v_object), $$$th, UNPROVIDED))) || (NIL != string_utilities.ends_with(document.sign_string(v_object), $$$ths, UNPROVIDED)))) && (NIL != number_value(document.sign_string(v_object))));
    }

    public static SubLObject denominator_literalP(final SubLObject v_object) {
        return makeBoolean(((NIL != document.sign_p(v_object)) && ((((NIL != numeral_parser_stringE(document.sign_string(v_object), $$$halves)) || (NIL != assoc(string_utilities.post_remove(document.sign_string(v_object), $$$s, $sym70$NUMERAL_PARSER_CHAR_), $irregular_denominators$.getGlobalValue(), symbol_function($sym32$NUMERAL_PARSER_STRING_), UNPROVIDED))) || (NIL != string_utilities.ends_with(document.sign_string(v_object), $$$th, UNPROVIDED))) || (NIL != string_utilities.ends_with(document.sign_string(v_object), $$$ths, UNPROVIDED)))) && (NIL != number_value(document.sign_string(v_object))));
    }

    public static SubLObject denominator_signP(final SubLObject v_object) {
        return makeBoolean((NIL != document.sign_p(v_object)) && (NIL != member($DENOMINATOR, document.sign_category(v_object), UNPROVIDED, UNPROVIDED)));
    }

    public static SubLObject half_signP(final SubLObject v_object) {
        return makeBoolean((NIL != document.sign_p(v_object)) && (NIL != numeral_parser_stringE(document.sign_string(v_object), $$$half)));
    }

    public static SubLObject minus_literalP(final SubLObject v_object) {
        return makeBoolean((NIL != document.sign_p(v_object)) && (((NIL != numeral_parser_stringE(document.sign_string(v_object), $$$minus)) || (NIL != numeral_parser_stringE(document.sign_string(v_object), $$$negative))) || (NIL != minus_signP(v_object))));
    }

    public static SubLObject to_literalP(final SubLObject v_object) {
        return makeBoolean((NIL != document.sign_p(v_object)) && ((NIL != numeral_parser_stringE(document.sign_string(v_object), $$$to)) || (NIL != numeral_parser_stringE(document.sign_string(v_object), $str33$_))));
    }

    public static SubLObject from_literalP(final SubLObject v_object) {
        return makeBoolean((NIL != document.sign_p(v_object)) && (NIL != numeral_parser_stringE(document.sign_string(v_object), $$$from)));
    }

    public static SubLObject between_literalP(final SubLObject v_object) {
        return makeBoolean((NIL != document.sign_p(v_object)) && (NIL != numeral_parser_stringE(document.sign_string(v_object), $$$between)));
    }

    public static SubLObject mult_signP(final SubLObject v_object) {
        return makeBoolean((NIL != document.sign_p(v_object)) && (NIL != member($MULT, document.sign_category(v_object), UNPROVIDED, UNPROVIDED)));
    }

    public static SubLObject expt_operator_signP(final SubLObject v_object) {
        return makeBoolean((NIL != document.sign_p(v_object)) && (NIL != member($EXPT, document.sign_category(v_object), UNPROVIDED, UNPROVIDED)));
    }

    public static SubLObject exponentiation_signP(final SubLObject v_object) {
        return makeBoolean((NIL != document.sign_p(v_object)) && (NIL != member($EXPONENTIATION, document.sign_category(v_object), UNPROVIDED, UNPROVIDED)));
    }

    public static SubLObject minus_signP(final SubLObject v_object) {
        return makeBoolean((NIL != document.sign_p(v_object)) && (NIL != Strings.stringE(document.sign_string(v_object), $str33$_, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED)));
    }

    public static SubLObject plus_signP(final SubLObject v_object) {
        return makeBoolean((NIL != document.sign_p(v_object)) && (NIL != Strings.stringE(document.sign_string(v_object), $str81$_, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED)));
    }

    public static SubLObject build_denominator(final SubLObject fst) {
        final SubLObject output = finite_state_transducer.fst_output(fst);
        if (NIL == output) {
            Errors.error($str82$Can_t_build_a_denominator_out_of_);
            return NIL;
        }
        if (NIL != list_utilities.singletonP(output)) {
            final SubLObject word = output.first();
            document.word_update(word, list($CATEGORY, adjoin($DENOMINATOR, document.word_category(word), UNPROVIDED, UNPROVIDED), $INFO, number_value(document.word_string(word))));
            return word;
        }
        final SubLObject phrase = document.new_phrase(UNPROVIDED);
        SubLObject numeric_value = ZERO_INTEGER;
        SubLObject cdolist_list_var = output;
        SubLObject dtr = NIL;
        dtr = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject dtr_info = document.sign_info(dtr);
            numeric_value = combine_number_values(numeric_value, $PLUS, NIL != dtr_info ? dtr_info : number_value(document.sign_string(dtr)));
            cdolist_list_var = cdolist_list_var.rest();
            dtr = cdolist_list_var.first();
        } 
        document.phrase_update(phrase, list($CATEGORY, adjoin($DENOMINATOR, document.phrase_category(phrase), UNPROVIDED, UNPROVIDED), $STRING, string_utilities.bunge(Mapping.mapcar(symbol_function(SIGN_STRING), finite_state_transducer.fst_output(fst)), UNPROVIDED), $CONSTITUENTS, apply(symbol_function(VECTOR), finite_state_transducer.fst_output(fst)), $INFO, numeric_value));
        return phrase;
    }

    public static SubLObject build_zero(final SubLObject fst) {
        final SubLObject word = finite_state_transducer.fst_output(fst).first();
        document.word_update(word, list($CATEGORY, adjoin($ZERO, document.word_category(word), UNPROVIDED, UNPROVIDED), $INFO, number_value(document.word_string(word))));
        return word;
    }

    public static SubLObject build_indefinite(final SubLObject fst) {
        final SubLObject word = finite_state_transducer.fst_output(fst).first();
        document.word_update(word, list($CATEGORY, adjoin($INDEFINITE, document.word_category(word), UNPROVIDED, UNPROVIDED), $INFO, number_value(document.word_string(word))));
        return word;
    }

    public static SubLObject build_deci(final SubLObject fst) {
        final SubLObject word = finite_state_transducer.fst_output(fst).first();
        document.word_update(word, list($CATEGORY, adjoin($DECI, document.word_category(word), UNPROVIDED, UNPROVIDED), $INFO, number_value(document.word_string(word))));
        return word;
    }

    public static SubLObject build_teen(final SubLObject fst) {
        final SubLObject word = finite_state_transducer.fst_output(fst).first();
        document.word_update(word, list($CATEGORY, adjoin($TEEN, document.word_category(word), UNPROVIDED, UNPROVIDED), $INFO, number_value(document.word_string(word))));
        return word;
    }

    public static SubLObject build_fuzzy(final SubLObject fst) {
        final SubLObject word = finite_state_transducer.fst_output(fst).first();
        document.word_update(word, list($CATEGORY, adjoin($FUZZY, document.word_category(word), UNPROVIDED, UNPROVIDED), $INFO, number_value(document.word_string(word))));
        return word;
    }

    public static SubLObject build_atomic_ten(final SubLObject fst) {
        final SubLObject word = finite_state_transducer.fst_output(fst).first();
        document.word_update(word, list($CATEGORY, adjoin($ATOMIC_TEN, document.word_category(word), UNPROVIDED, UNPROVIDED), $INFO, number_value(document.word_string(word))));
        return word;
    }

    public static SubLObject build_hyphenated_non_atomic_ten(final SubLObject fst) {
        final SubLObject word = finite_state_transducer.fst_output(fst).first();
        document.word_update(word, list($CATEGORY, adjoin($NON_ATOMIC_TEN, document.word_category(word), UNPROVIDED, UNPROVIDED), $INFO, hyphenated_number_value(document.word_string(word))));
        return word;
    }

    public static SubLObject build_non_atomic_ten(final SubLObject fst) {
        final SubLObject phrase = document.new_phrase(UNPROVIDED);
        final SubLObject normalized_output = remove_if(symbol_function($sym114$HYPHEN_SIGN_), finite_state_transducer.fst_output(fst), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        document.phrase_update(phrase, list($CATEGORY, list($NON_ATOMIC_TEN), $STRING, string_utilities.bunge(Mapping.mapcar(symbol_function(SIGN_STRING), finite_state_transducer.fst_output(fst)), UNPROVIDED), $CONSTITUENTS, apply(symbol_function(VECTOR), finite_state_transducer.fst_output(fst)), $INFO, combine_number_values(document.sign_info(normalized_output.first()), $PLUS, document.sign_info(second(normalized_output)))));
        return phrase;
    }

    public static SubLObject build_cent(final SubLObject fst) {
        final SubLObject sign = finite_state_transducer.fst_output(fst).first();
        document.sign_update(sign, list($CATEGORY, adjoin($CENT, document.sign_category(sign), UNPROVIDED, UNPROVIDED)));
        return sign;
    }

    public static SubLObject build_standard_hundred(final SubLObject fst) {
        final SubLObject phrase = document.new_phrase(UNPROVIDED);
        final SubLObject normalized_output = remove_if(symbol_function($sym121$AND_LITERAL_), finite_state_transducer.fst_output(fst), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        document.phrase_update(phrase, list($CATEGORY, adjoin($STANDARD_HUNDRED, document.phrase_category(phrase), UNPROVIDED, UNPROVIDED), $STRING, string_utilities.bunge(Mapping.mapcar(symbol_function(SIGN_STRING), finite_state_transducer.fst_output(fst)), UNPROVIDED), $CONSTITUENTS, apply(symbol_function(VECTOR), finite_state_transducer.fst_output(fst)), $INFO, combine_number_values(combine_number_values(document.sign_info(normalized_output.first()), $TIMES, $int$100), $PLUS, NIL != document.sign_p(third(normalized_output)) ? document.sign_info(third(normalized_output)) : ZERO_INTEGER)));
        return phrase;
    }

    public static SubLObject build_a_few(final SubLObject fst) {
        final SubLObject phrase = document.new_phrase(UNPROVIDED);
        document.phrase_update(phrase, list($CATEGORY, adjoin($FUZZY, document.phrase_category(phrase), UNPROVIDED, UNPROVIDED), $STRING, string_utilities.bunge(Mapping.mapcar(symbol_function(SIGN_STRING), finite_state_transducer.fst_output(fst)), UNPROVIDED), $CONSTITUENTS, apply(symbol_function(VECTOR), finite_state_transducer.fst_output(fst)), $INFO, $$AFew_Quant));
        return phrase;
    }

    public static SubLObject build_extended_hundred(final SubLObject fst) {
        final SubLObject phrase = document.new_phrase(UNPROVIDED);
        final SubLObject normalized_output = remove_if(symbol_function($sym121$AND_LITERAL_), finite_state_transducer.fst_output(fst), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        document.phrase_update(phrase, list($CATEGORY, adjoin($EXTENDED_HUNDRED, document.phrase_category(phrase), UNPROVIDED, UNPROVIDED), $STRING, string_utilities.bunge(Mapping.mapcar(symbol_function(SIGN_STRING), finite_state_transducer.fst_output(fst)), UNPROVIDED), $CONSTITUENTS, apply(symbol_function(VECTOR), finite_state_transducer.fst_output(fst)), $INFO, combine_number_values(combine_number_values(document.sign_info(normalized_output.first()), $TIMES, $int$100), $PLUS, NIL != document.sign_p(third(normalized_output)) ? document.sign_info(third(normalized_output)) : ZERO_INTEGER)));
        return phrase;
    }

    public static SubLObject build_standard_dozen(final SubLObject fst) {
        final SubLObject phrase = document.new_phrase(UNPROVIDED);
        final SubLObject normalized_output = remove_if(symbol_function($sym121$AND_LITERAL_), finite_state_transducer.fst_output(fst), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        document.phrase_update(phrase, list($CATEGORY, adjoin($STANDARD_DOZEN, document.phrase_category(phrase), UNPROVIDED, UNPROVIDED), $STRING, string_utilities.bunge(Mapping.mapcar(symbol_function(SIGN_STRING), finite_state_transducer.fst_output(fst)), UNPROVIDED), $CONSTITUENTS, apply(symbol_function(VECTOR), finite_state_transducer.fst_output(fst)), $INFO, combine_number_values(combine_number_values(document.sign_info(normalized_output.first()), $TIMES, TWELVE_INTEGER), $PLUS, NIL != document.sign_p(third(normalized_output)) ? document.sign_info(third(normalized_output)) : ZERO_INTEGER)));
        return phrase;
    }

    public static SubLObject build_extended_dozen(final SubLObject fst) {
        final SubLObject phrase = document.new_phrase(UNPROVIDED);
        final SubLObject normalized_output = remove_if(symbol_function($sym121$AND_LITERAL_), finite_state_transducer.fst_output(fst), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        document.phrase_update(phrase, list($CATEGORY, adjoin($EXTENDED_DOZEN, document.phrase_category(phrase), UNPROVIDED, UNPROVIDED), $STRING, string_utilities.bunge(Mapping.mapcar(symbol_function(SIGN_STRING), finite_state_transducer.fst_output(fst)), UNPROVIDED), $CONSTITUENTS, apply(symbol_function(VECTOR), finite_state_transducer.fst_output(fst)), $INFO, combine_number_values(combine_number_values(document.sign_info(normalized_output.first()), $TIMES, TWELVE_INTEGER), $PLUS, NIL != document.sign_p(third(normalized_output)) ? document.sign_info(third(normalized_output)) : ZERO_INTEGER)));
        return phrase;
    }

    public static SubLObject build_kilo(final SubLObject fst) {
        final SubLObject sign = finite_state_transducer.fst_output(fst).first();
        document.sign_update(sign, list($CATEGORY, adjoin($KILO, document.sign_category(sign), UNPROVIDED, UNPROVIDED)));
        return sign;
    }

    public static SubLObject build_thousand(final SubLObject fst) {
        final SubLObject phrase = document.new_phrase(UNPROVIDED);
        final SubLObject normalized_output = remove_if(symbol_function($sym121$AND_LITERAL_), finite_state_transducer.fst_output(fst), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        document.phrase_update(phrase, list($CATEGORY, adjoin($THOUSAND, document.phrase_category(phrase), UNPROVIDED, UNPROVIDED), $STRING, string_utilities.bunge(Mapping.mapcar(symbol_function(SIGN_STRING), finite_state_transducer.fst_output(fst)), UNPROVIDED), $CONSTITUENTS, apply(symbol_function(VECTOR), finite_state_transducer.fst_output(fst)), $INFO, combine_number_values(combine_number_values(document.sign_info(normalized_output.first()), $TIMES, $int$1000), $PLUS, NIL != document.sign_p(third(normalized_output)) ? document.sign_info(third(normalized_output)) : ZERO_INTEGER)));
        return phrase;
    }

    public static SubLObject build_milli(final SubLObject fst) {
        final SubLObject sign = finite_state_transducer.fst_output(fst).first();
        document.sign_update(sign, list($CATEGORY, adjoin($MILLI, document.sign_category(sign), UNPROVIDED, UNPROVIDED)));
        return sign;
    }

    public static SubLObject build_million(final SubLObject fst) {
        final SubLObject phrase = document.new_phrase(UNPROVIDED);
        final SubLObject normalized_output = remove_if(symbol_function($sym121$AND_LITERAL_), finite_state_transducer.fst_output(fst), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        document.phrase_update(phrase, list($CATEGORY, adjoin($MILLION, document.phrase_category(phrase), UNPROVIDED, UNPROVIDED), $STRING, string_utilities.bunge(Mapping.mapcar(symbol_function(SIGN_STRING), finite_state_transducer.fst_output(fst)), UNPROVIDED), $CONSTITUENTS, apply(symbol_function(VECTOR), finite_state_transducer.fst_output(fst)), $INFO, combine_number_values(combine_number_values(document.sign_info(normalized_output.first()), $TIMES, $int$1000000), $PLUS, NIL != document.sign_p(third(normalized_output)) ? document.sign_info(third(normalized_output)) : ZERO_INTEGER)));
        return phrase;
    }

    public static SubLObject build_billi(final SubLObject fst) {
        final SubLObject sign = finite_state_transducer.fst_output(fst).first();
        document.sign_update(sign, list($CATEGORY, adjoin($BILLI, document.sign_category(sign), UNPROVIDED, UNPROVIDED)));
        return sign;
    }

    public static SubLObject build_billion(final SubLObject fst) {
        final SubLObject phrase = document.new_phrase(UNPROVIDED);
        final SubLObject normalized_output = remove_if(symbol_function($sym121$AND_LITERAL_), finite_state_transducer.fst_output(fst), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        document.phrase_update(phrase, list($CATEGORY, adjoin($BILLION, document.phrase_category(phrase), UNPROVIDED, UNPROVIDED), $STRING, string_utilities.bunge(Mapping.mapcar(symbol_function(SIGN_STRING), finite_state_transducer.fst_output(fst)), UNPROVIDED), $CONSTITUENTS, apply(symbol_function(VECTOR), finite_state_transducer.fst_output(fst)), $INFO, combine_number_values(combine_number_values(document.sign_info(normalized_output.first()), $TIMES, $int$1000000000), $PLUS, NIL != document.sign_p(third(normalized_output)) ? document.sign_info(third(normalized_output)) : ZERO_INTEGER)));
        return phrase;
    }

    public static SubLObject build_trilli(final SubLObject fst) {
        final SubLObject sign = finite_state_transducer.fst_output(fst).first();
        document.sign_update(sign, list($CATEGORY, adjoin($TRILLI, document.sign_category(sign), UNPROVIDED, UNPROVIDED)));
        return sign;
    }

    public static SubLObject build_trillion(final SubLObject fst) {
        final SubLObject phrase = document.new_phrase(UNPROVIDED);
        final SubLObject normalized_output = remove_if(symbol_function($sym121$AND_LITERAL_), finite_state_transducer.fst_output(fst), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        document.phrase_update(phrase, list($CATEGORY, adjoin($TRILLION, document.phrase_category(phrase), UNPROVIDED, UNPROVIDED), $STRING, string_utilities.bunge(Mapping.mapcar(symbol_function(SIGN_STRING), finite_state_transducer.fst_output(fst)), UNPROVIDED), $CONSTITUENTS, apply(symbol_function(VECTOR), finite_state_transducer.fst_output(fst)), $INFO, combine_number_values(combine_number_values(document.sign_info(normalized_output.first()), $TIMES, $int$1000000000000), $PLUS, NIL != document.sign_p(third(normalized_output)) ? document.sign_info(third(normalized_output)) : ZERO_INTEGER)));
        return phrase;
    }

    public static SubLObject build_integer(final SubLObject fst) {
        final SubLObject sign = finite_state_transducer.fst_output(fst).first();
        document.sign_update(sign, list($CATEGORY, adjoin($INTEGER, document.sign_category(sign), UNPROVIDED, UNPROVIDED)));
        return sign;
    }

    public static SubLObject build_number(final SubLObject fst) {
        final SubLObject sign = finite_state_transducer.fst_output(fst).first();
        document.sign_update(sign, list($CATEGORY, adjoin($NUMBER, document.sign_category(sign), UNPROVIDED, UNPROVIDED)));
        return sign;
    }

    public static SubLObject build_fraction(final SubLObject fst) {
        final SubLObject phrase = document.new_phrase(UNPROVIDED);
        document.phrase_update(phrase, list($CATEGORY, adjoin($FRACTION, document.phrase_category(phrase), UNPROVIDED, UNPROVIDED), $STRING, string_utilities.bunge(Mapping.mapcar(symbol_function(SIGN_STRING), finite_state_transducer.fst_output(fst)), UNPROVIDED), $CONSTITUENTS, apply(symbol_function(VECTOR), finite_state_transducer.fst_output(fst)), $INFO, combine_number_values(document.sign_info(finite_state_transducer.fst_output(fst).first()), $DIVIDEDBY, document.sign_info(second(finite_state_transducer.fst_output(fst))))));
        return phrase;
    }

    public static SubLObject build_half(final SubLObject fst) {
        final SubLObject sign = finite_state_transducer.fst_output(fst).first();
        document.sign_update(sign, list($CATEGORY, adjoin($NUMBER, document.sign_category(sign), UNPROVIDED, UNPROVIDED), $INFO, $float$0_5));
        return sign;
    }

    public static SubLObject build_float(final SubLObject fst) {
        final SubLObject output = finite_state_transducer.fst_output(fst);
        final SubLObject phrase = document.new_phrase(UNPROVIDED);
        document.phrase_update(phrase, list($CATEGORY, adjoin($FLOAT, document.phrase_category(phrase), UNPROVIDED, UNPROVIDED), $STRING, string_utilities.bunge(Mapping.mapcar(symbol_function(SIGN_STRING), output), UNPROVIDED), $CONSTITUENTS, apply(symbol_function(VECTOR), output), $INFO, combine_number_values(document.sign_info(output.first()), $PLUS, document.sign_info(third(output)))));
        return phrase;
    }

    public static SubLObject build_negative_number(final SubLObject fst) {
        final SubLObject phrase = document.new_phrase(UNPROVIDED);
        document.phrase_update(phrase, list($CATEGORY, adjoin($NUMBER, document.phrase_category(phrase), UNPROVIDED, UNPROVIDED), $STRING, string_utilities.bunge(Mapping.mapcar(symbol_function(SIGN_STRING), finite_state_transducer.fst_output(fst)), UNPROVIDED), $CONSTITUENTS, apply(symbol_function(VECTOR), finite_state_transducer.fst_output(fst)), $INFO, minus(document.sign_info(second(finite_state_transducer.fst_output(fst))))));
        return phrase;
    }

    public static SubLObject build_proper_interval(final SubLObject fst) {
        final SubLObject phrase = document.new_phrase(UNPROVIDED);
        document.phrase_update(phrase, list($CATEGORY, adjoin($PROPER_INTERVAL, document.phrase_category(phrase), UNPROVIDED, UNPROVIDED), $STRING, string_utilities.bunge(Mapping.mapcar(symbol_function(SIGN_STRING), finite_state_transducer.fst_output(fst)), UNPROVIDED), $CONSTITUENTS, apply(symbol_function(VECTOR), finite_state_transducer.fst_output(fst)), $INFO, cons($$Unity, Sort.sort(delete_if(symbol_function(NULL), Mapping.mapcar(symbol_function(SIGN_INFO), finite_state_transducer.fst_output(fst)), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED), symbol_function($sym184$_), UNPROVIDED))));
        return phrase;
    }

    public static SubLObject build_interval(final SubLObject fst) {
        final SubLObject sign = finite_state_transducer.fst_output(fst).first();
        document.sign_update(sign, list($CATEGORY, adjoin($INTERVAL, document.sign_category(sign), UNPROVIDED, UNPROVIDED)));
        return sign;
    }

    public static SubLObject lex_numerals(final SubLObject sequence) {
        assert NIL != sequencep(sequence) : "Types.sequencep(sequence) " + "CommonSymbols.NIL != Types.sequencep(sequence) " + sequence;
        final SubLObject backwardP_var = NIL;
        SubLObject length;
        SubLObject v_iteration;
        SubLObject element_num;
        SubLObject word;
        for (length = length(sequence), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = add(v_iteration, ONE_INTEGER)) {
            element_num = (NIL != backwardP_var) ? subtract(length, v_iteration, ONE_INTEGER) : v_iteration;
            word = aref(sequence, element_num);
            if (NIL != number_utilities.number_string_p(document.word_string(word))) {
                document.word_update(word, list($CATEGORY, list($NUMBER), $INFO, number_utilities.number_string_value(document.word_string(word))));
            } else
                if (NIL != Strings.stringE(document.word_string(word), $str197$_, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED)) {
                    document.word_update(word, list($CATEGORY, list($MULT)));
                } else
                    if (NIL != Strings.stringE(document.word_string(word), $str198$_, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED)) {
                        document.word_update(word, list($CATEGORY, list($EXPT)));
                    }


        }
        return sequence;
    }

    public static SubLObject build_exponentiation_phrase(final SubLObject fst) {
        final SubLObject phrase = document.new_phrase(UNPROVIDED);
        document.phrase_update(phrase, list($CATEGORY, list($EXPONENTIATION), $STRING, string_utilities.bunge(Mapping.mapcar(symbol_function(SIGN_STRING), finite_state_transducer.fst_output(fst)), UNPROVIDED), $CONSTITUENTS, apply(symbol_function(VECTOR), finite_state_transducer.fst_output(fst)), $INFO, combine_number_values(document.sign_info(finite_state_transducer.fst_output(fst).first()), $TOTHE, document.sign_info(third(finite_state_transducer.fst_output(fst))))));
        return phrase;
    }

    public static SubLObject build_multiplication_phrase(final SubLObject fst) {
        final SubLObject phrase = document.new_phrase(UNPROVIDED);
        document.phrase_update(phrase, list($CATEGORY, list($NUMBER), $STRING, string_utilities.bunge(Mapping.mapcar(symbol_function(SIGN_STRING), finite_state_transducer.fst_output(fst)), UNPROVIDED), $CONSTITUENTS, apply(symbol_function(VECTOR), finite_state_transducer.fst_output(fst)), $INFO, combine_number_values(document.sign_info(finite_state_transducer.fst_output(fst).first()), $TIMES, document.sign_info(third(finite_state_transducer.fst_output(fst))))));
        return phrase;
    }

    public static SubLObject string_to_interval(final SubLObject string) {
        return copy_tree(string_to_interval_cached(string));
    }

    public static SubLObject clear_string_to_interval_cached() {
        final SubLObject cs = $string_to_interval_cached_caching_state$.getGlobalValue();
        if (NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return NIL;
    }

    public static SubLObject remove_string_to_interval_cached(final SubLObject string) {
        return memoization_state.caching_state_remove_function_results_with_args($string_to_interval_cached_caching_state$.getGlobalValue(), list(string), UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject string_to_interval_cached_internal(final SubLObject string) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != stringp(string) : "Types.stringp(string) " + "CommonSymbols.NIL != Types.stringp(string) " + string;
        SubLObject ans = NIL;
        SubLObject ignore_errors_tag = NIL;
        try {
            thread.throwStack.push($IGNORE_ERRORS_TARGET);
            final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
            try {
                Errors.$error_handler$.bind(symbol_function(IGNORE_ERRORS_HANDLER), thread);
                try {
                    final SubLObject standardized_number_string = standardize_number_string(string, UNPROVIDED);
                    final SubLObject tokens = document.string_wordify(standardized_number_string, UNPROVIDED);
                    final SubLObject english_parse = finite_state_cascade_parser.fscp_parse($english_interval_parser$.getDynamicValue(thread), tokens);
                    ans = numeric_interval_term_from_fscp_result(english_parse);
                    if (NIL == ans) {
                        final SubLObject digit_parse = finite_state_cascade_parser.fscp_parse($digit_interval_parser$.getDynamicValue(thread), tokens);
                        ans = numeric_interval_term_from_fscp_result(digit_parse);
                    }
                } catch (final Throwable catch_var) {
                    Errors.handleThrowable(catch_var, NIL);
                }
            } finally {
                Errors.$error_handler$.rebind(_prev_bind_0, thread);
            }
        } catch (final Throwable ccatch_env_var) {
            ignore_errors_tag = Errors.handleThrowable(ccatch_env_var, $IGNORE_ERRORS_TARGET);
        } finally {
            thread.throwStack.pop();
        }
        return ans;
    }

    public static SubLObject string_to_interval_cached(final SubLObject string) {
        SubLObject caching_state = $string_to_interval_cached_caching_state$.getGlobalValue();
        if (NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name(STRING_TO_INTERVAL_CACHED, $string_to_interval_cached_caching_state$, $int$256, EQUAL, ONE_INTEGER, ZERO_INTEGER);
        }
        SubLObject results = memoization_state.caching_state_lookup(caching_state, string, memoization_state.$memoized_item_not_found$.getGlobalValue());
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = arg2(resetMultipleValues(), multiple_value_list(string_to_interval_cached_internal(string)));
            memoization_state.caching_state_put(caching_state, string, results, UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }

    public static SubLObject numeric_interval_term_from_fscp_result(final SubLObject fscp_result) {
        if (NIL != list_utilities.lengthE(fscp_result, ONE_INTEGER, UNPROVIDED)) {
            final SubLObject first_fscp_result = elt(fscp_result, ZERO_INTEGER);
            return (NIL != document.sign_info(first_fscp_result)) && (NIL != interval_signP(first_fscp_result)) ? document.sign_info(first_fscp_result) : NIL;
        }
        return NIL;
    }

    public static SubLObject interval_stringP(final SubLObject string) {
        assert NIL != stringp(string) : "Types.stringp(string) " + "CommonSymbols.NIL != Types.stringp(string) " + string;
        return string_to_interval(string);
    }

    public static final class $numeral_parser_stringE$BinaryFunction extends BinaryFunction {
        public $numeral_parser_stringE$BinaryFunction() {
            super(extractFunctionNamed("NUMERAL-PARSER-STRING="));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1, final SubLObject arg2) {
            return numeral_parser_stringE(arg1, arg2);
        }
    }

    public static SubLObject declare_numeral_parser_file() {
        declareFunction(me, "standardize_number_string", "STANDARDIZE-NUMBER-STRING", 1, 1, false);
        declareFunction(me, "initialize_number_values", "INITIALIZE-NUMBER-VALUES", 0, 0, false);
        declareFunction(me, "number_value", "NUMBER-VALUE", 1, 0, false);
        declareFunction(me, "number_string_signP", "NUMBER-STRING-SIGN?", 1, 0, false);
        declareFunction(me, "hyphenated_number_value", "HYPHENATED-NUMBER-VALUE", 1, 0, false);
        declareFunction(me, "combine_number_values", "COMBINE-NUMBER-VALUES", 3, 0, false);
        declareFunction(me, "numeral_parser_max_significant_digits", "NUMERAL-PARSER-MAX-SIGNIFICANT-DIGITS", 2, 0, false);
        declareFunction(me, "numeral_parser_significant_digits", "NUMERAL-PARSER-SIGNIFICANT-DIGITS", 1, 0, false);
        declareFunction(me, "combine_cycl_number_values", "COMBINE-CYCL-NUMBER-VALUES", 3, 0, false);
        declareFunction(me, "combine_non_cycl_number_values", "COMBINE-NON-CYCL-NUMBER-VALUES", 3, 0, false);
        declareFunction(me, "numeral_parser_stringE", "NUMERAL-PARSER-STRING=", 2, 0, false);
        new numeral_parser.$numeral_parser_stringE$BinaryFunction();
        declareFunction(me, "numeral_parser_charE", "NUMERAL-PARSER-CHAR=", 2, 0, false);
        declareFunction(me, "zero_literalP", "ZERO-LITERAL?", 1, 0, false);
        declareFunction(me, "indefinite_signP", "INDEFINITE-SIGN?", 1, 0, false);
        declareFunction(me, "atomic_ten_signP", "ATOMIC-TEN-SIGN?", 1, 0, false);
        declareFunction(me, "digit_signP", "DIGIT-SIGN?", 1, 0, false);
        declareFunction(me, "deci_signP", "DECI-SIGN?", 1, 0, false);
        declareFunction(me, "hyphen_signP", "HYPHEN-SIGN?", 1, 0, false);
        declareFunction(me, "teen_signP", "TEEN-SIGN?", 1, 0, false);
        declareFunction(me, "fuzzy_signP", "FUZZY-SIGN?", 1, 0, false);
        declareFunction(me, "non_atomic_ten_signP", "NON-ATOMIC-TEN-SIGN?", 1, 0, false);
        declareFunction(me, "hyphenated_non_atomic_ten_signP", "HYPHENATED-NON-ATOMIC-TEN-SIGN?", 1, 0, false);
        declareFunction(me, "cent_signP", "CENT-SIGN?", 1, 0, false);
        declareFunction(me, "kilo_signP", "KILO-SIGN?", 1, 0, false);
        declareFunction(me, "fraction_signP", "FRACTION-SIGN?", 1, 0, false);
        declareFunction(me, "float_signP", "FLOAT-SIGN?", 1, 0, false);
        declareFunction(me, "number_signP", "NUMBER-SIGN?", 1, 0, false);
        declareFunction(me, "interval_signP", "INTERVAL-SIGN?", 1, 0, false);
        declareFunction(me, "proper_interval_signP", "PROPER-INTERVAL-SIGN?", 1, 0, false);
        declareFunction(me, "milli_signP", "MILLI-SIGN?", 1, 0, false);
        declareFunction(me, "billi_signP", "BILLI-SIGN?", 1, 0, false);
        declareFunction(me, "trilli_signP", "TRILLI-SIGN?", 1, 0, false);
        declareFunction(me, "integer_signP", "INTEGER-SIGN?", 1, 0, false);
        declareFunction(me, "extended_dozen_signP", "EXTENDED-DOZEN-SIGN?", 1, 0, false);
        declareFunction(me, "standard_dozen_signP", "STANDARD-DOZEN-SIGN?", 1, 0, false);
        declareFunction(me, "extended_hundred_signP", "EXTENDED-HUNDRED-SIGN?", 1, 0, false);
        declareFunction(me, "standard_hundred_signP", "STANDARD-HUNDRED-SIGN?", 1, 0, false);
        declareFunction(me, "thousand_signP", "THOUSAND-SIGN?", 1, 0, false);
        declareFunction(me, "million_signP", "MILLION-SIGN?", 1, 0, false);
        declareFunction(me, "billion_signP", "BILLION-SIGN?", 1, 0, false);
        declareFunction(me, "trillion_signP", "TRILLION-SIGN?", 1, 0, false);
        declareFunction(me, "and_literalP", "AND-LITERAL?", 1, 0, false);
        declareFunction(me, "indefinite_literalP", "INDEFINITE-LITERAL?", 1, 0, false);
        declareFunction(me, "dozen_literalP", "DOZEN-LITERAL?", 1, 0, false);
        declareFunction(me, "few_literalP", "FEW-LITERAL?", 1, 0, false);
        declareFunction(me, "hundred_literalP", "HUNDRED-LITERAL?", 1, 0, false);
        declareFunction(me, "thousand_literalP", "THOUSAND-LITERAL?", 1, 0, false);
        declareFunction(me, "million_literalP", "MILLION-LITERAL?", 1, 0, false);
        declareFunction(me, "millions_literalP", "MILLIONS-LITERAL?", 1, 0, false);
        declareFunction(me, "billions_literalP", "BILLIONS-LITERAL?", 1, 0, false);
        declareFunction(me, "billion_literalP", "BILLION-LITERAL?", 1, 0, false);
        declareFunction(me, "trillions_literalP", "TRILLIONS-LITERAL?", 1, 0, false);
        declareFunction(me, "trillion_literalP", "TRILLION-LITERAL?", 1, 0, false);
        declareFunction(me, "first_literalP", "FIRST-LITERAL?", 1, 0, false);
        declareFunction(me, "second_literalP", "SECOND-LITERAL?", 1, 0, false);
        declareFunction(me, "seconds_literalP", "SECONDS-LITERAL?", 1, 0, false);
        declareFunction(me, "atomic_denominator_literalP", "ATOMIC-DENOMINATOR-LITERAL?", 1, 0, false);
        declareFunction(me, "denominator_literalP", "DENOMINATOR-LITERAL?", 1, 0, false);
        declareFunction(me, "denominator_signP", "DENOMINATOR-SIGN?", 1, 0, false);
        declareFunction(me, "half_signP", "HALF-SIGN?", 1, 0, false);
        declareFunction(me, "minus_literalP", "MINUS-LITERAL?", 1, 0, false);
        declareFunction(me, "to_literalP", "TO-LITERAL?", 1, 0, false);
        declareFunction(me, "from_literalP", "FROM-LITERAL?", 1, 0, false);
        declareFunction(me, "between_literalP", "BETWEEN-LITERAL?", 1, 0, false);
        declareFunction(me, "mult_signP", "MULT-SIGN?", 1, 0, false);
        declareFunction(me, "expt_operator_signP", "EXPT-OPERATOR-SIGN?", 1, 0, false);
        declareFunction(me, "exponentiation_signP", "EXPONENTIATION-SIGN?", 1, 0, false);
        declareFunction(me, "minus_signP", "MINUS-SIGN?", 1, 0, false);
        declareFunction(me, "plus_signP", "PLUS-SIGN?", 1, 0, false);
        declareFunction(me, "build_denominator", "BUILD-DENOMINATOR", 1, 0, false);
        declareFunction(me, "build_zero", "BUILD-ZERO", 1, 0, false);
        declareFunction(me, "build_indefinite", "BUILD-INDEFINITE", 1, 0, false);
        declareFunction(me, "build_deci", "BUILD-DECI", 1, 0, false);
        declareFunction(me, "build_teen", "BUILD-TEEN", 1, 0, false);
        declareFunction(me, "build_fuzzy", "BUILD-FUZZY", 1, 0, false);
        declareFunction(me, "build_atomic_ten", "BUILD-ATOMIC-TEN", 1, 0, false);
        declareFunction(me, "build_hyphenated_non_atomic_ten", "BUILD-HYPHENATED-NON-ATOMIC-TEN", 1, 0, false);
        declareFunction(me, "build_non_atomic_ten", "BUILD-NON-ATOMIC-TEN", 1, 0, false);
        declareFunction(me, "build_cent", "BUILD-CENT", 1, 0, false);
        declareFunction(me, "build_standard_hundred", "BUILD-STANDARD-HUNDRED", 1, 0, false);
        declareFunction(me, "build_a_few", "BUILD-A-FEW", 1, 0, false);
        declareFunction(me, "build_extended_hundred", "BUILD-EXTENDED-HUNDRED", 1, 0, false);
        declareFunction(me, "build_standard_dozen", "BUILD-STANDARD-DOZEN", 1, 0, false);
        declareFunction(me, "build_extended_dozen", "BUILD-EXTENDED-DOZEN", 1, 0, false);
        declareFunction(me, "build_kilo", "BUILD-KILO", 1, 0, false);
        declareFunction(me, "build_thousand", "BUILD-THOUSAND", 1, 0, false);
        declareFunction(me, "build_milli", "BUILD-MILLI", 1, 0, false);
        declareFunction(me, "build_million", "BUILD-MILLION", 1, 0, false);
        declareFunction(me, "build_billi", "BUILD-BILLI", 1, 0, false);
        declareFunction(me, "build_billion", "BUILD-BILLION", 1, 0, false);
        declareFunction(me, "build_trilli", "BUILD-TRILLI", 1, 0, false);
        declareFunction(me, "build_trillion", "BUILD-TRILLION", 1, 0, false);
        declareFunction(me, "build_integer", "BUILD-INTEGER", 1, 0, false);
        declareFunction(me, "build_number", "BUILD-NUMBER", 1, 0, false);
        declareFunction(me, "build_fraction", "BUILD-FRACTION", 1, 0, false);
        declareFunction(me, "build_half", "BUILD-HALF", 1, 0, false);
        declareFunction(me, "build_float", "BUILD-FLOAT", 1, 0, false);
        declareFunction(me, "build_negative_number", "BUILD-NEGATIVE-NUMBER", 1, 0, false);
        declareFunction(me, "build_proper_interval", "BUILD-PROPER-INTERVAL", 1, 0, false);
        declareFunction(me, "build_interval", "BUILD-INTERVAL", 1, 0, false);
        declareFunction(me, "lex_numerals", "LEX-NUMERALS", 1, 0, false);
        declareFunction(me, "build_exponentiation_phrase", "BUILD-EXPONENTIATION-PHRASE", 1, 0, false);
        declareFunction(me, "build_multiplication_phrase", "BUILD-MULTIPLICATION-PHRASE", 1, 0, false);
        declareFunction(me, "string_to_interval", "STRING-TO-INTERVAL", 1, 0, false);
        declareFunction(me, "clear_string_to_interval_cached", "CLEAR-STRING-TO-INTERVAL-CACHED", 0, 0, false);
        declareFunction(me, "remove_string_to_interval_cached", "REMOVE-STRING-TO-INTERVAL-CACHED", 1, 0, false);
        declareFunction(me, "string_to_interval_cached_internal", "STRING-TO-INTERVAL-CACHED-INTERNAL", 1, 0, false);
        declareFunction(me, "string_to_interval_cached", "STRING-TO-INTERVAL-CACHED", 1, 0, false);
        declareFunction(me, "numeric_interval_term_from_fscp_result", "NUMERIC-INTERVAL-TERM-FROM-FSCP-RESULT", 1, 0, false);
        declareFunction(me, "interval_stringP", "INTERVAL-STRING?", 1, 0, false);
        return NIL;
    }

    public static SubLObject init_numeral_parser_file() {
        deflexical("*NULL*", $list0);
        deflexical("*A*", $list1);
        deflexical("*DIGITS*", $list2);
        deflexical("*TEENS*", $list3);
        deflexical("*FUZZIES*", $list4);
        deflexical("*ATOMIC-TENS*", $list5);
        deflexical("*ONEDOZEN*", $list6);
        deflexical("*ONEHUNDRED*", $list7);
        deflexical("*ONETHOUSAND*", $list8);
        deflexical("*ONEMILLION*", $list9);
        deflexical("*ONEBILLION*", $list10);
        deflexical("*ONETRILLION*", $list11);
        deflexical("*IRREGULAR-DENOMINATORS*", $list12);
        defparameter("*NUMBER-VALUES*", initialize_number_values());
        defparameter("*DENOMINATOR*", finite_state_transducer.new_finite_state_transducer(ZERO_INTEGER, $list89, list(listS(ZERO_INTEGER, symbol_function($sym90$ATOMIC_DENOMINATOR_LITERAL_), $list91), listS(ZERO_INTEGER, symbol_function($sym92$ATOMIC_TEN_SIGN_), $list93), listS(TWO_INTEGER, symbol_function($sym94$DENOMINATOR_LITERAL_), $list91)), symbol_function(BUILD_DENOMINATOR)));
        defparameter("*ZERO*", finite_state_transducer.new_finite_state_transducer(ZERO_INTEGER, $list89, list(listS(ZERO_INTEGER, symbol_function($sym97$ZERO_LITERAL_), $list91)), symbol_function(BUILD_ZERO)));
        defparameter("*INDEFINITE*", finite_state_transducer.new_finite_state_transducer(ZERO_INTEGER, $list89, list(listS(ZERO_INTEGER, symbol_function($sym99$INDEFINITE_LITERAL_), $list91)), symbol_function(BUILD_INDEFINITE)));
        defparameter("*DECI*", finite_state_transducer.new_finite_state_transducer(ZERO_INTEGER, $list89, list(listS(ZERO_INTEGER, symbol_function($sym102$DIGIT_SIGN_), $list91), listS(ZERO_INTEGER, symbol_function($sym103$NUMBER_STRING_SIGN_), $list91)), symbol_function(BUILD_DECI)));
        defparameter("*TEEN*", finite_state_transducer.new_finite_state_transducer(ZERO_INTEGER, $list89, list(listS(ZERO_INTEGER, symbol_function($sym106$TEEN_SIGN_), $list91)), symbol_function(BUILD_TEEN)));
        defparameter("*FUZZY*", finite_state_transducer.new_finite_state_transducer(ZERO_INTEGER, $list89, list(listS(ZERO_INTEGER, symbol_function($sym108$FUZZY_SIGN_), $list91)), symbol_function(BUILD_FUZZY)));
        defparameter("*ATOMIC-TEN*", finite_state_transducer.new_finite_state_transducer(ZERO_INTEGER, $list89, list(listS(ZERO_INTEGER, symbol_function($sym92$ATOMIC_TEN_SIGN_), $list91)), symbol_function(BUILD_ATOMIC_TEN)));
        defparameter("*HYPHENATED-NON-ATOMIC-TEN*", finite_state_transducer.new_finite_state_transducer(ZERO_INTEGER, $list89, list(listS(ZERO_INTEGER, symbol_function($sym112$HYPHENATED_NON_ATOMIC_TEN_SIGN_), $list91)), symbol_function(BUILD_HYPHENATED_NON_ATOMIC_TEN)));
        defparameter("*NON-ATOMIC-TEN*", finite_state_transducer.new_finite_state_transducer(ZERO_INTEGER, $list115, list(listS(ZERO_INTEGER, symbol_function($sym92$ATOMIC_TEN_SIGN_), $list91), listS(ONE_INTEGER, symbol_function($sym116$DECI_SIGN_), $list93), listS(ONE_INTEGER, symbol_function($sym114$HYPHEN_SIGN_), $list117), listS(THREE_INTEGER, symbol_function($sym116$DECI_SIGN_), $list93)), symbol_function(BUILD_NON_ATOMIC_TEN)));
        defparameter("*CENT*", finite_state_transducer.new_finite_state_transducer(ZERO_INTEGER, $list89, list(listS(ZERO_INTEGER, symbol_function($sym116$DECI_SIGN_), $list91), listS(ZERO_INTEGER, symbol_function($sym106$TEEN_SIGN_), $list91), listS(ZERO_INTEGER, symbol_function($sym108$FUZZY_SIGN_), $list91), listS(ZERO_INTEGER, symbol_function($sym92$ATOMIC_TEN_SIGN_), $list91), listS(ZERO_INTEGER, symbol_function($sym119$NON_ATOMIC_TEN_SIGN_), $list91), listS(ZERO_INTEGER, symbol_function($sym103$NUMBER_STRING_SIGN_), $list91)), symbol_function(BUILD_CENT)));
        defparameter("*STANDARD-HUNDRED*", finite_state_transducer.new_finite_state_transducer(ZERO_INTEGER, $list115, list(new SubLObject[]{ listS(ZERO_INTEGER, symbol_function($sym116$DECI_SIGN_), $list91), listS(ZERO_INTEGER, symbol_function($sym122$INDEFINITE_SIGN_), $list91), listS(ONE_INTEGER, symbol_function($sym123$HUNDRED_LITERAL_), $list117), listS(THREE_INTEGER, symbol_function($sym124$CENT_SIGN_), $list93), listS(THREE_INTEGER, symbol_function(SIGN_P), $list126), $list127, listS(FOUR_INTEGER, symbol_function($sym124$CENT_SIGN_), $list128), listS(FOUR_INTEGER, symbol_function($sym129$FRACTION_SIGN_), $list128), listS(SIX_INTEGER, symbol_function(SIGN_P), $list93) }), symbol_function(BUILD_STANDARD_HUNDRED)));
        defparameter("*A-FEW*", finite_state_transducer.new_finite_state_transducer(ZERO_INTEGER, $list115, list(listS(ZERO_INTEGER, symbol_function($sym122$INDEFINITE_SIGN_), $list91), listS(ONE_INTEGER, symbol_function($sym132$FEW_LITERAL_), $list93)), symbol_function(BUILD_A_FEW)));
        defparameter("*EXTENDED-HUNDRED*", finite_state_transducer.new_finite_state_transducer(ZERO_INTEGER, $list115, list(new SubLObject[]{ listS(ZERO_INTEGER, symbol_function($sym124$CENT_SIGN_), $list91), listS(ZERO_INTEGER, symbol_function($sym122$INDEFINITE_SIGN_), $list91), listS(ONE_INTEGER, symbol_function($sym123$HUNDRED_LITERAL_), $list117), listS(THREE_INTEGER, symbol_function($sym124$CENT_SIGN_), $list93), listS(THREE_INTEGER, symbol_function(SIGN_P), $list126), $list127, listS(FOUR_INTEGER, symbol_function($sym124$CENT_SIGN_), $list128), listS(FOUR_INTEGER, symbol_function(SIGN_P), $list134), listS(SIX_INTEGER, symbol_function($sym124$CENT_SIGN_), $list93) }), symbol_function(BUILD_EXTENDED_HUNDRED)));
        defparameter("*STANDARD-DOZEN*", finite_state_transducer.new_finite_state_transducer(ZERO_INTEGER, $list115, list(listS(ZERO_INTEGER, symbol_function($sym116$DECI_SIGN_), $list91), listS(ZERO_INTEGER, symbol_function($sym122$INDEFINITE_SIGN_), $list91), listS(ONE_INTEGER, symbol_function($sym136$DOZEN_LITERAL_), $list93)), symbol_function(BUILD_STANDARD_DOZEN)));
        defparameter("*EXTENDED-DOZEN*", finite_state_transducer.new_finite_state_transducer(ZERO_INTEGER, $list115, list(listS(ZERO_INTEGER, symbol_function($sym124$CENT_SIGN_), $list91), listS(ZERO_INTEGER, symbol_function($sym122$INDEFINITE_SIGN_), $list91), listS(ONE_INTEGER, symbol_function($sym136$DOZEN_LITERAL_), $list93)), symbol_function(BUILD_EXTENDED_DOZEN)));
        defparameter("*KILO*", finite_state_transducer.new_finite_state_transducer(ZERO_INTEGER, $list89, list(listS(ZERO_INTEGER, symbol_function($sym124$CENT_SIGN_), $list91), listS(ZERO_INTEGER, symbol_function($sym139$STANDARD_HUNDRED_SIGN_), $list91), listS(ZERO_INTEGER, symbol_function($sym140$EXTENDED_HUNDRED_SIGN_), $list91), listS(ZERO_INTEGER, symbol_function($sym141$FLOAT_SIGN_), $list91), listS(ZERO_INTEGER, symbol_function($sym103$NUMBER_STRING_SIGN_), $list91)), symbol_function(BUILD_KILO)));
        defparameter("*THOUSAND*", finite_state_transducer.new_finite_state_transducer(ZERO_INTEGER, $list115, list(new SubLObject[]{ listS(ZERO_INTEGER, symbol_function($sym144$KILO_SIGN_), $list91), listS(ZERO_INTEGER, symbol_function($sym122$INDEFINITE_SIGN_), $list91), listS(ONE_INTEGER, symbol_function($sym145$THOUSAND_LITERAL_), $list117), listS(THREE_INTEGER, symbol_function($sym144$KILO_SIGN_), $list93), listS(THREE_INTEGER, symbol_function(SIGN_P), $list126), $list127, listS(FOUR_INTEGER, symbol_function($sym124$CENT_SIGN_), $list128), listS(FOUR_INTEGER, symbol_function(SIGN_P), $list134), listS(SIX_INTEGER, symbol_function($sym124$CENT_SIGN_), $list93) }), symbol_function(BUILD_THOUSAND)));
        defparameter("*MILLI*", finite_state_transducer.new_finite_state_transducer(ZERO_INTEGER, $list89, list(listS(ZERO_INTEGER, symbol_function($sym144$KILO_SIGN_), $list91), listS(ZERO_INTEGER, symbol_function($sym147$THOUSAND_SIGN_), $list91), listS(ZERO_INTEGER, symbol_function($sym103$NUMBER_STRING_SIGN_), $list91)), symbol_function(BUILD_MILLI)));
        defparameter("*MILLION*", finite_state_transducer.new_finite_state_transducer(ZERO_INTEGER, $list115, list(new SubLObject[]{ listS(ZERO_INTEGER, symbol_function($sym150$MILLI_SIGN_), $list91), listS(ZERO_INTEGER, symbol_function($sym122$INDEFINITE_SIGN_), $list91), listS(ONE_INTEGER, symbol_function($sym151$MILLION_LITERAL_), $list117), listS(THREE_INTEGER, symbol_function($sym150$MILLI_SIGN_), $list93), listS(THREE_INTEGER, symbol_function(SIGN_P), $list126), $list127, listS(FOUR_INTEGER, symbol_function($sym124$CENT_SIGN_), $list128), listS(FOUR_INTEGER, symbol_function(SIGN_P), $list134), listS(SIX_INTEGER, symbol_function($sym124$CENT_SIGN_), $list93) }), symbol_function(BUILD_MILLION)));
        defparameter("*BILLI*", finite_state_transducer.new_finite_state_transducer(ZERO_INTEGER, $list89, list(listS(ZERO_INTEGER, symbol_function($sym150$MILLI_SIGN_), $list91), listS(ZERO_INTEGER, symbol_function($sym153$MILLION_SIGN_), $list91), listS(ZERO_INTEGER, symbol_function($sym103$NUMBER_STRING_SIGN_), $list91)), symbol_function(BUILD_BILLI)));
        defparameter("*BILLION*", finite_state_transducer.new_finite_state_transducer(ZERO_INTEGER, $list115, list(new SubLObject[]{ listS(ZERO_INTEGER, symbol_function($sym156$BILLI_SIGN_), $list91), listS(ZERO_INTEGER, symbol_function($sym122$INDEFINITE_SIGN_), $list91), listS(ONE_INTEGER, symbol_function($sym157$BILLION_LITERAL_), $list117), listS(THREE_INTEGER, symbol_function($sym156$BILLI_SIGN_), $list93), listS(THREE_INTEGER, symbol_function(SIGN_P), $list126), $list127, listS(FOUR_INTEGER, symbol_function($sym124$CENT_SIGN_), $list128), listS(FOUR_INTEGER, symbol_function(SIGN_P), $list134), listS(SIX_INTEGER, symbol_function($sym124$CENT_SIGN_), $list93) }), symbol_function(BUILD_BILLION)));
        defparameter("*TRILLI*", finite_state_transducer.new_finite_state_transducer(ZERO_INTEGER, $list89, list(listS(ZERO_INTEGER, symbol_function($sym156$BILLI_SIGN_), $list91), listS(ZERO_INTEGER, symbol_function($sym159$BILLION_SIGN_), $list91), listS(ZERO_INTEGER, symbol_function($sym103$NUMBER_STRING_SIGN_), $list91)), symbol_function(BUILD_TRILLI)));
        defparameter("*TRILLION*", finite_state_transducer.new_finite_state_transducer(ZERO_INTEGER, $list115, list(new SubLObject[]{ listS(ZERO_INTEGER, symbol_function($sym162$TRILLI_SIGN_), $list91), listS(ZERO_INTEGER, symbol_function($sym122$INDEFINITE_SIGN_), $list91), listS(ONE_INTEGER, symbol_function($sym163$TRILLION_LITERAL_), $list117), listS(THREE_INTEGER, symbol_function($sym162$TRILLI_SIGN_), $list93), listS(THREE_INTEGER, symbol_function(SIGN_P), $list126), $list127, listS(FOUR_INTEGER, symbol_function($sym124$CENT_SIGN_), $list128), listS(FOUR_INTEGER, symbol_function(SIGN_P), $list134), listS(SIX_INTEGER, symbol_function($sym124$CENT_SIGN_), $list93) }), symbol_function(BUILD_TRILLION)));
        defparameter("*INTEGER*", finite_state_transducer.new_finite_state_transducer(ZERO_INTEGER, $list89, list(listS(ZERO_INTEGER, symbol_function($sym162$TRILLI_SIGN_), $list91), listS(ZERO_INTEGER, symbol_function($sym165$TRILLION_SIGN_), $list91)), symbol_function(BUILD_INTEGER)));
        defparameter("*NUMBER*", finite_state_transducer.new_finite_state_transducer(ZERO_INTEGER, $list89, list(listS(ZERO_INTEGER, symbol_function($sym167$INTEGER_SIGN_), $list91), listS(ZERO_INTEGER, symbol_function($sym141$FLOAT_SIGN_), $list91), listS(ZERO_INTEGER, symbol_function($sym103$NUMBER_STRING_SIGN_), $list91), listS(ZERO_INTEGER, symbol_function($sym129$FRACTION_SIGN_), $list91), listS(ZERO_INTEGER, symbol_function($sym168$STANDARD_DOZEN_SIGN_), $list91), listS(ZERO_INTEGER, symbol_function($sym169$EXTENDED_DOZEN_SIGN_), $list91)), symbol_function(BUILD_NUMBER)));
        defparameter("*FRACTION*", finite_state_transducer.new_finite_state_transducer(ZERO_INTEGER, $list115, list(listS(ZERO_INTEGER, symbol_function($sym171$NUMBER_SIGN_), $list91), listS(ZERO_INTEGER, symbol_function($sym122$INDEFINITE_SIGN_), $list91), listS(ONE_INTEGER, symbol_function($sym90$ATOMIC_DENOMINATOR_LITERAL_), $list93), listS(ONE_INTEGER, symbol_function($sym172$DENOMINATOR_SIGN_), $list93)), symbol_function(BUILD_FRACTION)));
        defparameter("*HALF*", finite_state_transducer.new_finite_state_transducer(ZERO_INTEGER, $list89, list(listS(ZERO_INTEGER, symbol_function($sym175$HALF_SIGN_), $list91)), symbol_function(BUILD_HALF)));
        defparameter("*FLOAT*", finite_state_transducer.new_finite_state_transducer(ZERO_INTEGER, $list177, list(listS(ZERO_INTEGER, symbol_function($sym167$INTEGER_SIGN_), $list91), listS(ONE_INTEGER, symbol_function($sym121$AND_LITERAL_), $list93), listS(TWO_INTEGER, symbol_function($sym129$FRACTION_SIGN_), $list117)), symbol_function(BUILD_FLOAT)));
        defparameter("*NEGATIVE-NUMBER-STRING*", finite_state_transducer.new_finite_state_transducer(ZERO_INTEGER, $list115, list(listS(ZERO_INTEGER, symbol_function($sym179$MINUS_LITERAL_), $list91), listS(ONE_INTEGER, symbol_function($sym171$NUMBER_SIGN_), $list93)), symbol_function(BUILD_NEGATIVE_NUMBER)));
        defparameter("*PROPER-INTERVAL*", finite_state_transducer.new_finite_state_transducer(ZERO_INTEGER, $list185, list(new SubLObject[]{ listS(ZERO_INTEGER, symbol_function($sym171$NUMBER_SIGN_), $list93), listS(ZERO_INTEGER, symbol_function($sym129$FRACTION_SIGN_), $list93), listS(ZERO_INTEGER, symbol_function($sym186$FROM_LITERAL_), $list91), listS(ZERO_INTEGER, symbol_function($sym187$BETWEEN_LITERAL_), $list188), listS(ONE_INTEGER, symbol_function($sym171$NUMBER_SIGN_), $list93), listS(TWO_INTEGER, symbol_function($sym189$TO_LITERAL_), $list117), listS(THREE_INTEGER, symbol_function($sym171$NUMBER_SIGN_), $list190), listS(THREE_INTEGER, symbol_function($sym129$FRACTION_SIGN_), $list190), listS(FIVE_INTEGER, symbol_function($sym171$NUMBER_SIGN_), $list191), listS(FIVE_INTEGER, symbol_function($sym129$FRACTION_SIGN_), $list191), listS(SIX_INTEGER, symbol_function($sym121$AND_LITERAL_), $list192), listS(SEVEN_INTEGER, symbol_function($sym171$NUMBER_SIGN_), $list190), listS(SEVEN_INTEGER, symbol_function($sym129$FRACTION_SIGN_), $list190) }), symbol_function(BUILD_PROPER_INTERVAL)));
        defparameter("*INTERVAL*", finite_state_transducer.new_finite_state_transducer(ZERO_INTEGER, $list89, list(listS(ZERO_INTEGER, symbol_function($sym194$PROPER_INTERVAL_SIGN_), $list91), listS(ZERO_INTEGER, symbol_function($sym171$NUMBER_SIGN_), $list91)), symbol_function(BUILD_INTERVAL)));
        defparameter("*ENGLISH-INTERVAL-PARSER*", finite_state_cascade_parser.new_finite_state_cascade_parser(list(new SubLObject[]{ $zero$.getDynamicValue(), $indefinite$.getDynamicValue(), $deci$.getDynamicValue(), $teen$.getDynamicValue(), $fuzzy$.getDynamicValue(), $a_few$.getDynamicValue(), $atomic_ten$.getDynamicValue(), $hyphenated_non_atomic_ten$.getDynamicValue(), $denominator$.getDynamicValue(), $non_atomic_ten$.getDynamicValue(), $cent$.getDynamicValue(), $standard_hundred$.getDynamicValue(), $extended_hundred$.getDynamicValue(), $standard_dozen$.getDynamicValue(), $extended_dozen$.getDynamicValue(), $kilo$.getDynamicValue(), $thousand$.getDynamicValue(), $milli$.getDynamicValue(), $million$.getDynamicValue(), $billi$.getDynamicValue(), $billion$.getDynamicValue(), $trilli$.getDynamicValue(), $trillion$.getDynamicValue(), $integer$.getDynamicValue(), $number$.getDynamicValue(), $fraction$.getDynamicValue(), $half$.getDynamicValue(), $proper_interval$.getDynamicValue(), $float$.getDynamicValue(), $kilo$.getDynamicValue(), $thousand$.getDynamicValue(), $milli$.getDynamicValue(), $million$.getDynamicValue(), $billi$.getDynamicValue(), $billion$.getDynamicValue(), $trilli$.getDynamicValue(), $trillion$.getDynamicValue(), $integer$.getDynamicValue(), $number$.getDynamicValue(), $negative_number_string$.getDynamicValue(), $proper_interval$.getDynamicValue(), $interval$.getDynamicValue() }), UNPROVIDED));
        defparameter("*NEGATIVE-NUMBER*", finite_state_transducer.new_finite_state_transducer(ZERO_INTEGER, $list115, list(listS(ZERO_INTEGER, symbol_function($sym199$MINUS_SIGN_), $list91), listS(ONE_INTEGER, symbol_function($sym171$NUMBER_SIGN_), $list93)), symbol_function(BUILD_NEGATIVE_NUMBER)));
        defparameter("*EXPONENTIATION*", finite_state_transducer.new_finite_state_transducer(ZERO_INTEGER, $list115, list(listS(ZERO_INTEGER, symbol_function($sym171$NUMBER_SIGN_), $list91), listS(ONE_INTEGER, symbol_function($sym200$EXPT_OPERATOR_SIGN_), $list117), listS(THREE_INTEGER, symbol_function($sym171$NUMBER_SIGN_), $list93)), symbol_function(BUILD_EXPONENTIATION_PHRASE)));
        defparameter("*MULTIPLICATION*", finite_state_transducer.new_finite_state_transducer(ZERO_INTEGER, $list115, list(listS(ZERO_INTEGER, symbol_function($sym171$NUMBER_SIGN_), $list91), listS(ONE_INTEGER, symbol_function($sym202$MULT_SIGN_), $list117), listS(THREE_INTEGER, symbol_function($sym203$EXPONENTIATION_SIGN_), $list93)), symbol_function(BUILD_MULTIPLICATION_PHRASE)));
        defparameter("*DIGIT-INTERVAL-PARSER*", finite_state_cascade_parser.new_finite_state_cascade_parser(list($negative_number$.getDynamicValue(), $exponentiation$.getDynamicValue(), $multiplication$.getDynamicValue(), $interval$.getDynamicValue()), LEX_NUMERALS));
        deflexical("*STRING-TO-INTERVAL-CACHED-CACHING-STATE*", NIL);
        return NIL;
    }

    public static SubLObject setup_numeral_parser_file() {
        memoization_state.note_globally_cached_function(STRING_TO_INTERVAL_CACHED);
        return NIL;
    }

    @Override
    public void declareFunctions() {
        declare_numeral_parser_file();
    }

    @Override
    public void initializeVariables() {
        init_numeral_parser_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_numeral_parser_file();
    }

    public static final SubLFile me = new numeral_parser();

    public static final String myName = "com.cyc.cycjava.cycl.numeral_parser";

    public static final String myFingerPrint = "51ab259000ee60d1c803f220566e9bce56b798e2dabc14202a1184857d3b8503";

    // deflexical
    // Definitions
    private static final SubLSymbol $null$ = makeSymbol("*NULL*");

    // deflexical
    private static final SubLSymbol $a$ = makeSymbol("*A*");

    // deflexical
    private static final SubLSymbol $digits$ = makeSymbol("*DIGITS*");

    // deflexical
    private static final SubLSymbol $teens$ = makeSymbol("*TEENS*");

    // deflexical
    /**
     * Words that denote fuzzy numbers, which need to be represented in CycL
     *
     * @unknown baxter
     */
    private static final SubLSymbol $fuzzies$ = makeSymbol("*FUZZIES*");

    // deflexical
    private static final SubLSymbol $atomic_tens$ = makeSymbol("*ATOMIC-TENS*");

    // deflexical
    private static final SubLSymbol $onedozen$ = makeSymbol("*ONEDOZEN*");

    // deflexical
    private static final SubLSymbol $onehundred$ = makeSymbol("*ONEHUNDRED*");

    // deflexical
    private static final SubLSymbol $onethousand$ = makeSymbol("*ONETHOUSAND*");

    // deflexical
    private static final SubLSymbol $onemillion$ = makeSymbol("*ONEMILLION*");

    // deflexical
    private static final SubLSymbol $onebillion$ = makeSymbol("*ONEBILLION*");

    // deflexical
    private static final SubLSymbol $onetrillion$ = makeSymbol("*ONETRILLION*");

    // deflexical
    /**
     * all denominators that can't be built by simply appending a th(s) to the base
     * form
     */
    private static final SubLSymbol $irregular_denominators$ = makeSymbol("*IRREGULAR-DENOMINATORS*");

    // defparameter
    // a hashtable mapping atomic English number strings to numbers
    private static final SubLSymbol $number_values$ = makeSymbol("*NUMBER-VALUES*");

    // defparameter
    private static final SubLSymbol $denominator$ = makeSymbol("*DENOMINATOR*");

    // defparameter
    private static final SubLSymbol $zero$ = makeSymbol("*ZERO*");

    // defparameter
    private static final SubLSymbol $indefinite$ = makeSymbol("*INDEFINITE*");

    // defparameter
    private static final SubLSymbol $deci$ = makeSymbol("*DECI*");

    // defparameter
    private static final SubLSymbol $teen$ = makeSymbol("*TEEN*");

    // defparameter
    private static final SubLSymbol $fuzzy$ = makeSymbol("*FUZZY*");

    // defparameter
    private static final SubLSymbol $atomic_ten$ = makeSymbol("*ATOMIC-TEN*");

    // defparameter
    private static final SubLSymbol $hyphenated_non_atomic_ten$ = makeSymbol("*HYPHENATED-NON-ATOMIC-TEN*");

    // defparameter
    private static final SubLSymbol $non_atomic_ten$ = makeSymbol("*NON-ATOMIC-TEN*");

    // defparameter
    private static final SubLSymbol $cent$ = makeSymbol("*CENT*");

    // defparameter
    private static final SubLSymbol $standard_hundred$ = makeSymbol("*STANDARD-HUNDRED*");

    // defparameter
    private static final SubLSymbol $a_few$ = makeSymbol("*A-FEW*");

    // defparameter
    private static final SubLSymbol $extended_hundred$ = makeSymbol("*EXTENDED-HUNDRED*");

    // defparameter
    private static final SubLSymbol $standard_dozen$ = makeSymbol("*STANDARD-DOZEN*");

    // defparameter
    private static final SubLSymbol $extended_dozen$ = makeSymbol("*EXTENDED-DOZEN*");

    // defparameter
    private static final SubLSymbol $kilo$ = makeSymbol("*KILO*");

    // defparameter
    private static final SubLSymbol $thousand$ = makeSymbol("*THOUSAND*");

    // defparameter
    private static final SubLSymbol $milli$ = makeSymbol("*MILLI*");

    // defparameter
    private static final SubLSymbol $million$ = makeSymbol("*MILLION*");

    // defparameter
    private static final SubLSymbol $billi$ = makeSymbol("*BILLI*");

    // defparameter
    private static final SubLSymbol $billion$ = makeSymbol("*BILLION*");

    // defparameter
    private static final SubLSymbol $trilli$ = makeSymbol("*TRILLI*");

    // defparameter
    private static final SubLSymbol $trillion$ = makeSymbol("*TRILLION*");

    // defparameter
    private static final SubLSymbol $integer$ = makeSymbol("*INTEGER*");

    // defparameter
    private static final SubLSymbol $number$ = makeSymbol("*NUMBER*");

    // defparameter
    private static final SubLSymbol $fraction$ = makeSymbol("*FRACTION*");

    // defparameter
    private static final SubLSymbol $half$ = makeSymbol("*HALF*");

    // defparameter
    private static final SubLSymbol $float$ = makeSymbol("*FLOAT*");

    // defparameter
    private static final SubLSymbol $negative_number_string$ = makeSymbol("*NEGATIVE-NUMBER-STRING*");

    // defparameter
    public static final SubLSymbol $proper_interval$ = makeSymbol("*PROPER-INTERVAL*");

    // defparameter
    private static final SubLSymbol $interval$ = makeSymbol("*INTERVAL*");

    // defparameter
    public static final SubLSymbol $english_interval_parser$ = makeSymbol("*ENGLISH-INTERVAL-PARSER*");

    // defparameter
    private static final SubLSymbol $negative_number$ = makeSymbol("*NEGATIVE-NUMBER*");

    // defparameter
    private static final SubLSymbol $exponentiation$ = makeSymbol("*EXPONENTIATION*");

    // defparameter
    private static final SubLSymbol $multiplication$ = makeSymbol("*MULTIPLICATION*");

    // defparameter
    public static final SubLSymbol $digit_interval_parser$ = makeSymbol("*DIGIT-INTERVAL-PARSER*");



    // Internal Constants
    public static final SubLList $list0 = list(cons(makeString("zero"), ZERO_INTEGER));

    public static final SubLList $list1 = list(cons(makeString("a"), ONE_INTEGER));

    public static final SubLList $list2 = list(new SubLObject[]{ cons(makeString("one"), ONE_INTEGER), cons(makeString("two"), TWO_INTEGER), cons(makeString("three"), THREE_INTEGER), cons(makeString("four"), FOUR_INTEGER), cons(makeString("five"), FIVE_INTEGER), cons(makeString("six"), SIX_INTEGER), cons(makeString("seven"), SEVEN_INTEGER), cons(makeString("eight"), EIGHT_INTEGER), cons(makeString("nine"), NINE_INTEGER) });

    public static final SubLList $list3 = list(new SubLObject[]{ cons(makeString("ten"), TEN_INTEGER), cons(makeString("eleven"), ELEVEN_INTEGER), cons(makeString("twelve"), TWELVE_INTEGER), cons(makeString("thirteen"), THIRTEEN_INTEGER), cons(makeString("fourteen"), FOURTEEN_INTEGER), cons(makeString("fifteen"), FIFTEEN_INTEGER), cons(makeString("sixteen"), SIXTEEN_INTEGER), cons(makeString("seventeen"), SEVENTEEN_INTEGER), cons(makeString("eighteen"), EIGHTEEN_INTEGER), cons(makeString("nineteen"), NINETEEN_INTEGER) });

    public static final SubLList $list4 = list(cons(makeString("several"), reader_make_constant_shell(makeString("Several-Quant"))));

    public static final SubLList $list5 = list(cons(makeString("twenty"), TWENTY_INTEGER), cons(makeString("thirty"), makeInteger(30)), cons(makeString("forty"), makeInteger(40)), cons(makeString("fifty"), makeInteger(50)), cons(makeString("sixty"), makeInteger(60)), cons(makeString("seventy"), makeInteger(70)), cons(makeString("eighty"), makeInteger(80)), cons(makeString("ninety"), makeInteger(90)));

    public static final SubLList $list6 = list(cons(makeString("dozen"), TWELVE_INTEGER));

    public static final SubLList $list7 = list(cons(makeString("hundred"), makeInteger(100)));

    public static final SubLList $list8 = list(cons(makeString("thousand"), makeInteger(1000)));

    public static final SubLList $list9 = list(cons(makeString("million"), makeInteger(0xf4240)));

    public static final SubLList $list10 = list(cons(makeString("billion"), makeInteger(0x3b9aca00)));

    public static final SubLList $list11 = list(cons(makeString("trillion"), makeInteger("1000000000000")));

    public static final SubLList $list12 = list(new SubLObject[]{ cons(makeString("first"), ONE_INTEGER), cons(makeString("second"), TWO_INTEGER), cons(makeString("half"), TWO_INTEGER), cons(makeString("halves"), TWO_INTEGER), cons(makeString("third"), THREE_INTEGER), cons(makeString("quarter"), FOUR_INTEGER), cons(makeString("fifth"), FIVE_INTEGER), cons(makeString("eighth"), EIGHT_INTEGER), cons(makeString("twelfth"), TWELVE_INTEGER), cons(makeString("twelvth"), TWELVE_INTEGER), cons(makeString("twentieth"), TWENTY_INTEGER), cons(makeString("thirtieth"), makeInteger(30)), cons(makeString("fortieth"), makeInteger(40)), cons(makeString("fiftieth"), makeInteger(50)), cons(makeString("sixtieth"), makeInteger(60)), cons(makeString("seventieth"), makeInteger(70)), cons(makeString("eightieth"), makeInteger(80)), cons(makeString("ninetieth"), makeInteger(90)) });



    public static final SubLString $str14$_ = makeString(",");



    public static final SubLString $$$s = makeString("s");

    public static final SubLString $$$th = makeString("th");

    public static final SubLString $$$ths = makeString("ths");

    public static final SubLList $list19 = list(CHAR_hyphen);









    private static final SubLObject $$PlusFn = reader_make_constant_shell(makeString("PlusFn"));

    private static final SubLObject $$TimesFn = reader_make_constant_shell(makeString("TimesFn"));



    private static final SubLObject $$QuotientFn = reader_make_constant_shell(makeString("QuotientFn"));



    private static final SubLObject $$ExponentFn = reader_make_constant_shell(makeString("ExponentFn"));

    public static final SubLString $$$zero = makeString("zero");



    public static final SubLSymbol $sym32$NUMERAL_PARSER_STRING_ = makeSymbol("NUMERAL-PARSER-STRING=");

    public static final SubLString $str33$_ = makeString("-");



    private static final SubLSymbol $NON_ATOMIC_TEN = makeKeyword("NON-ATOMIC-TEN");







































    public static final SubLString $$$and = makeString("and");

    public static final SubLString $$$dozen = makeString("dozen");

    public static final SubLString $$$few = makeString("few");

    public static final SubLString $$$hundred = makeString("hundred");

    public static final SubLString $$$thousand = makeString("thousand");

    public static final SubLString $$$million = makeString("million");

    public static final SubLString $$$millions = makeString("millions");

    public static final SubLString $$$billions = makeString("billions");

    public static final SubLString $$$billion = makeString("billion");

    public static final SubLString $$$trillions = makeString("trillions");

    public static final SubLString $$$trillion = makeString("trillion");

    public static final SubLString $$$first = makeString("first");

    public static final SubLString $$$second = makeString("second");

    public static final SubLString $$$seconds = makeString("seconds");

    public static final SubLString $$$halves = makeString("halves");

    public static final SubLSymbol $sym70$NUMERAL_PARSER_CHAR_ = makeSymbol("NUMERAL-PARSER-CHAR=");



    public static final SubLString $$$half = makeString("half");

    public static final SubLString $$$minus = makeString("minus");

    public static final SubLString $$$negative = makeString("negative");

    public static final SubLString $$$to = makeString("to");

    public static final SubLString $$$from = makeString("from");

    public static final SubLString $$$between = makeString("between");







    public static final SubLString $str81$_ = makeString("+");

    public static final SubLString $str82$Can_t_build_a_denominator_out_of_ = makeString("Can't build a denominator out of nothing!");







    public static final SubLSymbol SIGN_STRING = makeSymbol("SIGN-STRING");





    public static final SubLList $list89 = list(ONE_INTEGER);

    public static final SubLSymbol $sym90$ATOMIC_DENOMINATOR_LITERAL_ = makeSymbol("ATOMIC-DENOMINATOR-LITERAL?");

    public static final SubLList $list91 = list(list(makeKeyword("EMIT")), ONE_INTEGER);

    public static final SubLSymbol $sym92$ATOMIC_TEN_SIGN_ = makeSymbol("ATOMIC-TEN-SIGN?");

    public static final SubLList $list93 = list(list(makeKeyword("EMIT")), TWO_INTEGER);

    public static final SubLSymbol $sym94$DENOMINATOR_LITERAL_ = makeSymbol("DENOMINATOR-LITERAL?");

    public static final SubLSymbol BUILD_DENOMINATOR = makeSymbol("BUILD-DENOMINATOR");



    public static final SubLSymbol $sym97$ZERO_LITERAL_ = makeSymbol("ZERO-LITERAL?");

    public static final SubLSymbol BUILD_ZERO = makeSymbol("BUILD-ZERO");

    public static final SubLSymbol $sym99$INDEFINITE_LITERAL_ = makeSymbol("INDEFINITE-LITERAL?");

    public static final SubLSymbol BUILD_INDEFINITE = makeSymbol("BUILD-INDEFINITE");



    public static final SubLSymbol $sym102$DIGIT_SIGN_ = makeSymbol("DIGIT-SIGN?");

    public static final SubLSymbol $sym103$NUMBER_STRING_SIGN_ = makeSymbol("NUMBER-STRING-SIGN?");

    public static final SubLSymbol BUILD_DECI = makeSymbol("BUILD-DECI");



    public static final SubLSymbol $sym106$TEEN_SIGN_ = makeSymbol("TEEN-SIGN?");

    public static final SubLSymbol BUILD_TEEN = makeSymbol("BUILD-TEEN");

    public static final SubLSymbol $sym108$FUZZY_SIGN_ = makeSymbol("FUZZY-SIGN?");

    public static final SubLSymbol BUILD_FUZZY = makeSymbol("BUILD-FUZZY");



    public static final SubLSymbol BUILD_ATOMIC_TEN = makeSymbol("BUILD-ATOMIC-TEN");

    public static final SubLSymbol $sym112$HYPHENATED_NON_ATOMIC_TEN_SIGN_ = makeSymbol("HYPHENATED-NON-ATOMIC-TEN-SIGN?");

    public static final SubLSymbol BUILD_HYPHENATED_NON_ATOMIC_TEN = makeSymbol("BUILD-HYPHENATED-NON-ATOMIC-TEN");

    public static final SubLSymbol $sym114$HYPHEN_SIGN_ = makeSymbol("HYPHEN-SIGN?");

    public static final SubLList $list115 = list(TWO_INTEGER);

    public static final SubLSymbol $sym116$DECI_SIGN_ = makeSymbol("DECI-SIGN?");

    public static final SubLList $list117 = list(list(makeKeyword("EMIT")), THREE_INTEGER);

    public static final SubLSymbol BUILD_NON_ATOMIC_TEN = makeSymbol("BUILD-NON-ATOMIC-TEN");

    public static final SubLSymbol $sym119$NON_ATOMIC_TEN_SIGN_ = makeSymbol("NON-ATOMIC-TEN-SIGN?");

    public static final SubLSymbol BUILD_CENT = makeSymbol("BUILD-CENT");

    public static final SubLSymbol $sym121$AND_LITERAL_ = makeSymbol("AND-LITERAL?");

    public static final SubLSymbol $sym122$INDEFINITE_SIGN_ = makeSymbol("INDEFINITE-SIGN?");

    public static final SubLSymbol $sym123$HUNDRED_LITERAL_ = makeSymbol("HUNDRED-LITERAL?");

    public static final SubLSymbol $sym124$CENT_SIGN_ = makeSymbol("CENT-SIGN?");

    public static final SubLSymbol SIGN_P = makeSymbol("SIGN-P");

    public static final SubLList $list126 = list(list(makeKeyword("REMEMBER"), makeKeyword("BACKUP")), TWO_INTEGER);

    public static final SubLList $list127 = list(THREE_INTEGER, makeKeyword("END"), NIL, TWO_INTEGER);

    public static final SubLList $list128 = list(list(makeKeyword("BACKUP")), FIVE_INTEGER);

    public static final SubLSymbol $sym129$FRACTION_SIGN_ = makeSymbol("FRACTION-SIGN?");

    public static final SubLSymbol BUILD_STANDARD_HUNDRED = makeSymbol("BUILD-STANDARD-HUNDRED");

    private static final SubLObject $$AFew_Quant = reader_make_constant_shell(makeString("AFew-Quant"));

    public static final SubLSymbol $sym132$FEW_LITERAL_ = makeSymbol("FEW-LITERAL?");

    public static final SubLSymbol BUILD_A_FEW = makeSymbol("BUILD-A-FEW");

    public static final SubLList $list134 = list(list(makeKeyword("BACKUP")), TWO_INTEGER);

    public static final SubLSymbol BUILD_EXTENDED_HUNDRED = makeSymbol("BUILD-EXTENDED-HUNDRED");

    public static final SubLSymbol $sym136$DOZEN_LITERAL_ = makeSymbol("DOZEN-LITERAL?");

    public static final SubLSymbol BUILD_STANDARD_DOZEN = makeSymbol("BUILD-STANDARD-DOZEN");

    public static final SubLSymbol BUILD_EXTENDED_DOZEN = makeSymbol("BUILD-EXTENDED-DOZEN");

    public static final SubLSymbol $sym139$STANDARD_HUNDRED_SIGN_ = makeSymbol("STANDARD-HUNDRED-SIGN?");

    public static final SubLSymbol $sym140$EXTENDED_HUNDRED_SIGN_ = makeSymbol("EXTENDED-HUNDRED-SIGN?");

    public static final SubLSymbol $sym141$FLOAT_SIGN_ = makeSymbol("FLOAT-SIGN?");

    public static final SubLSymbol BUILD_KILO = makeSymbol("BUILD-KILO");



    public static final SubLSymbol $sym144$KILO_SIGN_ = makeSymbol("KILO-SIGN?");

    public static final SubLSymbol $sym145$THOUSAND_LITERAL_ = makeSymbol("THOUSAND-LITERAL?");

    public static final SubLSymbol BUILD_THOUSAND = makeSymbol("BUILD-THOUSAND");

    public static final SubLSymbol $sym147$THOUSAND_SIGN_ = makeSymbol("THOUSAND-SIGN?");

    public static final SubLSymbol BUILD_MILLI = makeSymbol("BUILD-MILLI");

    private static final SubLInteger $int$1000000 = makeInteger(0xf4240);

    public static final SubLSymbol $sym150$MILLI_SIGN_ = makeSymbol("MILLI-SIGN?");

    public static final SubLSymbol $sym151$MILLION_LITERAL_ = makeSymbol("MILLION-LITERAL?");

    public static final SubLSymbol BUILD_MILLION = makeSymbol("BUILD-MILLION");

    public static final SubLSymbol $sym153$MILLION_SIGN_ = makeSymbol("MILLION-SIGN?");

    public static final SubLSymbol BUILD_BILLI = makeSymbol("BUILD-BILLI");

    private static final SubLInteger $int$1000000000 = makeInteger(0x3b9aca00);

    public static final SubLSymbol $sym156$BILLI_SIGN_ = makeSymbol("BILLI-SIGN?");

    public static final SubLSymbol $sym157$BILLION_LITERAL_ = makeSymbol("BILLION-LITERAL?");

    public static final SubLSymbol BUILD_BILLION = makeSymbol("BUILD-BILLION");

    public static final SubLSymbol $sym159$BILLION_SIGN_ = makeSymbol("BILLION-SIGN?");

    public static final SubLSymbol BUILD_TRILLI = makeSymbol("BUILD-TRILLI");

    private static final SubLInteger $int$1000000000000 = makeInteger("1000000000000");

    public static final SubLSymbol $sym162$TRILLI_SIGN_ = makeSymbol("TRILLI-SIGN?");

    public static final SubLSymbol $sym163$TRILLION_LITERAL_ = makeSymbol("TRILLION-LITERAL?");

    public static final SubLSymbol BUILD_TRILLION = makeSymbol("BUILD-TRILLION");

    public static final SubLSymbol $sym165$TRILLION_SIGN_ = makeSymbol("TRILLION-SIGN?");

    public static final SubLSymbol BUILD_INTEGER = makeSymbol("BUILD-INTEGER");

    public static final SubLSymbol $sym167$INTEGER_SIGN_ = makeSymbol("INTEGER-SIGN?");

    public static final SubLSymbol $sym168$STANDARD_DOZEN_SIGN_ = makeSymbol("STANDARD-DOZEN-SIGN?");

    public static final SubLSymbol $sym169$EXTENDED_DOZEN_SIGN_ = makeSymbol("EXTENDED-DOZEN-SIGN?");

    public static final SubLSymbol BUILD_NUMBER = makeSymbol("BUILD-NUMBER");

    public static final SubLSymbol $sym171$NUMBER_SIGN_ = makeSymbol("NUMBER-SIGN?");

    public static final SubLSymbol $sym172$DENOMINATOR_SIGN_ = makeSymbol("DENOMINATOR-SIGN?");

    public static final SubLSymbol BUILD_FRACTION = makeSymbol("BUILD-FRACTION");

    private static final SubLFloat $float$0_5 = makeDouble(0.5);

    public static final SubLSymbol $sym175$HALF_SIGN_ = makeSymbol("HALF-SIGN?");

    public static final SubLSymbol BUILD_HALF = makeSymbol("BUILD-HALF");

    public static final SubLList $list177 = list(THREE_INTEGER);

    public static final SubLSymbol BUILD_FLOAT = makeSymbol("BUILD-FLOAT");

    public static final SubLSymbol $sym179$MINUS_LITERAL_ = makeSymbol("MINUS-LITERAL?");

    public static final SubLSymbol BUILD_NEGATIVE_NUMBER = makeSymbol("BUILD-NEGATIVE-NUMBER");

    private static final SubLObject $$Unity = reader_make_constant_shell(makeString("Unity"));



    public static final SubLSymbol SIGN_INFO = makeSymbol("SIGN-INFO");

    public static final SubLSymbol $sym184$_ = makeSymbol("<");

    public static final SubLList $list185 = list(FOUR_INTEGER);

    public static final SubLSymbol $sym186$FROM_LITERAL_ = makeSymbol("FROM-LITERAL?");

    public static final SubLSymbol $sym187$BETWEEN_LITERAL_ = makeSymbol("BETWEEN-LITERAL?");

    public static final SubLList $list188 = list(list(makeKeyword("EMIT")), FIVE_INTEGER);

    public static final SubLSymbol $sym189$TO_LITERAL_ = makeSymbol("TO-LITERAL?");

    public static final SubLList $list190 = list(list(makeKeyword("EMIT")), FOUR_INTEGER);

    public static final SubLList $list191 = list(list(makeKeyword("EMIT")), SIX_INTEGER);

    public static final SubLList $list192 = list(list(makeKeyword("EMIT")), SEVEN_INTEGER);

    public static final SubLSymbol BUILD_PROPER_INTERVAL = makeSymbol("BUILD-PROPER-INTERVAL");

    public static final SubLSymbol $sym194$PROPER_INTERVAL_SIGN_ = makeSymbol("PROPER-INTERVAL-SIGN?");

    public static final SubLSymbol BUILD_INTERVAL = makeSymbol("BUILD-INTERVAL");



    public static final SubLString $str197$_ = makeString("*");

    public static final SubLString $str198$_ = makeString("^");

    public static final SubLSymbol $sym199$MINUS_SIGN_ = makeSymbol("MINUS-SIGN?");

    public static final SubLSymbol $sym200$EXPT_OPERATOR_SIGN_ = makeSymbol("EXPT-OPERATOR-SIGN?");

    public static final SubLSymbol BUILD_EXPONENTIATION_PHRASE = makeSymbol("BUILD-EXPONENTIATION-PHRASE");

    public static final SubLSymbol $sym202$MULT_SIGN_ = makeSymbol("MULT-SIGN?");

    public static final SubLSymbol $sym203$EXPONENTIATION_SIGN_ = makeSymbol("EXPONENTIATION-SIGN?");

    public static final SubLSymbol BUILD_MULTIPLICATION_PHRASE = makeSymbol("BUILD-MULTIPLICATION-PHRASE");

    public static final SubLSymbol LEX_NUMERALS = makeSymbol("LEX-NUMERALS");

    private static final SubLSymbol STRING_TO_INTERVAL_CACHED = makeSymbol("STRING-TO-INTERVAL-CACHED");



    private static final SubLSymbol $IGNORE_ERRORS_TARGET = makeKeyword("IGNORE-ERRORS-TARGET");

    public static final SubLSymbol IGNORE_ERRORS_HANDLER = makeSymbol("IGNORE-ERRORS-HANDLER", "SUBLISP");

    private static final SubLSymbol $string_to_interval_cached_caching_state$ = makeSymbol("*STRING-TO-INTERVAL-CACHED-CACHING-STATE*");



    // static final boolean assertionsDisabledInClass =
    // !com/cyc/cycjava/cycl/desiredAssertionStatus();
    
}

