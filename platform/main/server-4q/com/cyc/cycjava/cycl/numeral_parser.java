/**
 *
 */
/**
 * //
 */
/**
 *
 */
/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 */
package com.cyc.cycjava.cycl;


import static com.cyc.cycjava.cycl.constant_handles.reader_make_constant_shell;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_hyphen;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_period;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.charE;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.char_equal;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.cons;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.listS;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions.apply;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.gethash;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.make_hash_table;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.sethash;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.add;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.divide;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.expt;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.max;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.minus;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.multiply;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.subtract;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow.format;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.delete_if;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.elt;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.length;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.remove;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.remove_if;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.symbol_function;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.keywordp;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.sequencep;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.stringp;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.arg2;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.multiple_value_list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.resetMultipleValues;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors.aref;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeBoolean;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeDouble;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeInteger;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeKeyword;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeString;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeSymbol;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.destructuring_bind_must_consp;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.adjoin;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.assoc;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.copy_tree;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.member;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.second;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.third;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high.prin1_to_string;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader.bq_cons;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader.read_from_string_ignoring_errors;
import static com.cyc.tool.subl.util.SubLFiles.declareFunction;
import static com.cyc.tool.subl.util.SubLFiles.deflexical;
import static com.cyc.tool.subl.util.SubLFiles.defparameter;

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
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.util.SubLFiles.LispMethod;
import com.cyc.tool.subl.util.SubLTrampolineFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 * module:      NUMERAL-PARSER
 * source file: /cyc/top/cycl/numeral-parser.lisp
 * created:     2019/07/03 17:38:24
 */
public final class numeral_parser extends SubLTranslatedFile implements V12 {
    public static final SubLObject test_numeral_parser() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject total = ZERO_INTEGER;
                SubLObject succeeded = ZERO_INTEGER;
                SubLObject cdolist_list_var = $numeral_parser_test_cases$.getDynamicValue(thread);
                SubLObject test = NIL;
                for (test = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , test = cdolist_list_var.first()) {
                    total = add(total, ONE_INTEGER);
                    {
                        SubLObject datum = test;
                        SubLObject current = datum;
                        SubLObject string = NIL;
                        SubLObject interval = NIL;
                        destructuring_bind_must_consp(current, datum, $list_alt240);
                        string = current.first();
                        current = current.rest();
                        interval = current;
                        {
                            SubLObject upcased_string = Strings.string_upcase(string, UNPROVIDED, UNPROVIDED);
                            SubLObject successP = makeBoolean((NIL != com.cyc.cycjava.cycl.numeral_parser.do_one_numeral_parser_test(string, interval, T)) && (NIL != com.cyc.cycjava.cycl.numeral_parser.do_one_numeral_parser_test(upcased_string, interval, NIL)));
                            if (NIL != successP) {
                                succeeded = add(succeeded, ONE_INTEGER);
                            }
                        }
                    }
                }
                format(T, $str_alt241$___D_of__D_tests_succeeded___, succeeded, total);
            }
            return NIL;
        }
    }

    /**
     *
     *
     * @param STRING
    		stringp
     * 		
     * @return boolean; an interval corresponding to STRING if there is one
    and nil otherwise
     */
    @LispMethod(comment = "@param STRING\n\t\tstringp\r\n\t\t\r\n@return boolean; an interval corresponding to STRING if there is one\r\nand nil otherwise")
    public static final SubLObject string_to_interval_internal(SubLObject string) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            SubLTrampolineFile.checkType(string, STRINGP);
            {
                SubLObject ans = NIL;
                SubLObject ignore_errors_tag = NIL;
                try {
                    {
                        SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
                        try {
                            Errors.$error_handler$.bind(symbol_function(IGNORE_ERRORS_HANDLER), thread);
                            try {
                                {
                                    SubLObject standardized_number_string = com.cyc.cycjava.cycl.numeral_parser.standardize_number_string(string, UNPROVIDED);
                                    SubLObject tokens = document.string_wordify(standardized_number_string, UNPROVIDED);
                                    SubLObject english_parse = finite_state_cascade_parser.fscp_parse($english_interval_parser$.getDynamicValue(thread), tokens);
                                    ans = com.cyc.cycjava.cycl.numeral_parser.numeric_interval_term_from_fscp_result(english_parse);
                                    if (NIL == ans) {
                                        {
                                            SubLObject digit_parse = finite_state_cascade_parser.fscp_parse($digit_interval_parser$.getDynamicValue(thread), tokens);
                                            ans = com.cyc.cycjava.cycl.numeral_parser.numeric_interval_term_from_fscp_result(digit_parse);
                                        }
                                    }
                                }
                            } catch (Throwable catch_var) {
                                Errors.handleThrowable(catch_var, NIL);
                            }
                        } finally {
                            Errors.$error_handler$.rebind(_prev_bind_0, thread);
                        }
                    }
                } catch (Throwable ccatch_env_var) {
                    ignore_errors_tag = Errors.handleThrowable(ccatch_env_var, $IGNORE_ERRORS_TARGET);
                }
                return ans;
            }
        }
    }

    public static final SubLObject remove_string_to_interval(SubLObject string) {
        return memoization_state.caching_state_remove_function_results_with_args($string_to_interval_caching_state$.getGlobalValue(), list(string), UNPROVIDED, UNPROVIDED);
    }

    public static final SubLObject do_one_numeral_parser_test(SubLObject string, SubLObject interval, SubLObject case_sensitiveP) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject successP = NIL;
                {
                    SubLObject _prev_bind_0 = parsing_vars.$numeral_parser_case_sensitiveP$.currentBinding(thread);
                    try {
                        parsing_vars.$numeral_parser_case_sensitiveP$.bind(case_sensitiveP, thread);
                        {
                            SubLObject result = com.cyc.cycjava.cycl.numeral_parser.string_to_interval(string);
                            if (result.equalp(interval)) {
                                successP = T;
                            } else {
                                if ((result.isNumber() && interval.isNumber()) && result.numE(interval)) {
                                    successP = T;
                                } else {
                                    Errors.warn($str_alt242$_S___parsed_to__S___instead_of__S, string, result, interval);
                                }
                            }
                        }
                    } finally {
                        parsing_vars.$numeral_parser_case_sensitiveP$.rebind(_prev_bind_0, thread);
                    }
                }
                return successP;
            }
        }
    }

    public static final SubLObject clear_string_to_interval() {
        {
            SubLObject cs = $string_to_interval_caching_state$.getGlobalValue();
            if (NIL != cs) {
                memoization_state.caching_state_clear(cs);
            }
        }
        return NIL;
    }

    public static final SubLSymbol $string_to_interval_caching_state$ = makeSymbol("*STRING-TO-INTERVAL-CACHING-STATE*");

    // defparameter
    @LispMethod(comment = "defparameter")
    private static final SubLSymbol $numeral_parser_test_cases$ = makeSymbol("*NUMERAL-PARSER-TEST-CASES*");

    /**
     *
     *
     * @param STRING
    string
     * 		
     * @param NUMBER-TYPE
     * 		keyword; the type of number expected (e.g. :american, :european,...), since that affects
     * 		the punctuation that might be contained in the number
     * @unknown this function should be much more complicated, doing different things if given different styles of numbers
    (e.g. European numbers where commas are used like American decimal points), and it should also be more careful
    about removing commas for American numbers (it should only remove them when they are immediately between digits).
    However, in the interest of execution speed, that won't be implemented until there is a need to do so.
     */
    @LispMethod(comment = "@param STRING\nstring\r\n\t\t\r\n@param NUMBER-TYPE\r\n\t\tkeyword; the type of number expected (e.g. :american, :european,...), since that affects\r\n\t\tthe punctuation that might be contained in the number\r\n@unknown this function should be much more complicated, doing different things if given different styles of numbers\r\n(e.g. European numbers where commas are used like American decimal points), and it should also be more careful\r\nabout removing commas for American numbers (it should only remove them when they are immediately between digits).\r\nHowever, in the interest of execution speed, that won\'t be implemented until there is a need to do so.")
    public static final SubLObject standardize_number_string_alt(SubLObject string, SubLObject number_type) {
        if (number_type == UNPROVIDED) {
            number_type = $AMERICAN;
        }
        return string_utilities.remove_substring(string, $str_alt14$_);
    }

    /**
     *
     *
     * @param STRING
    string
     * 		
     * @param NUMBER-TYPE
     * 		keyword; the type of number expected (e.g. :american, :european,...), since that affects
     * 		the punctuation that might be contained in the number
     * @unknown this function should be much more complicated, doing different things if given different styles of numbers
    (e.g. European numbers where commas are used like American decimal points), and it should also be more careful
    about removing commas for American numbers (it should only remove them when they are immediately between digits).
    However, in the interest of execution speed, that won't be implemented until there is a need to do so.
     */
    @LispMethod(comment = "@param STRING\nstring\r\n\t\t\r\n@param NUMBER-TYPE\r\n\t\tkeyword; the type of number expected (e.g. :american, :european,...), since that affects\r\n\t\tthe punctuation that might be contained in the number\r\n@unknown this function should be much more complicated, doing different things if given different styles of numbers\r\n(e.g. European numbers where commas are used like American decimal points), and it should also be more careful\r\nabout removing commas for American numbers (it should only remove them when they are immediately between digits).\r\nHowever, in the interest of execution speed, that won\'t be implemented until there is a need to do so.")
    public static SubLObject standardize_number_string(final SubLObject string, SubLObject number_type) {
        if (number_type == UNPROVIDED) {
            number_type = $AMERICAN;
        }
        return string_utilities.remove_substring(string, $str14$_);
    }

    /**
     *
     *
     * @return hashtable; a hashtable mapping atomic English number strings to numbers
     */
    @LispMethod(comment = "@return hashtable; a hashtable mapping atomic English number strings to numbers")
    public static final SubLObject initialize_number_values_alt() {
        {
            SubLObject number_values = make_hash_table($int$100, symbol_function(EQUALP), UNPROVIDED);
            SubLObject tables = list(new SubLObject[]{ $null$.getGlobalValue(), $a$.getGlobalValue(), $digits$.getGlobalValue(), $teens$.getGlobalValue(), $fuzzies$.getGlobalValue(), $atomic_tens$.getGlobalValue(), $onedozen$.getGlobalValue(), $onehundred$.getGlobalValue(), $onethousand$.getGlobalValue(), $onemillion$.getGlobalValue(), $onebillion$.getGlobalValue(), $onetrillion$.getGlobalValue(), $irregular_denominators$.getGlobalValue() });
            SubLObject cdolist_list_var = tables;
            SubLObject table = NIL;
            for (table = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , table = cdolist_list_var.first()) {
                {
                    SubLObject cdolist_list_var_1 = table;
                    SubLObject entry = NIL;
                    for (entry = cdolist_list_var_1.first(); NIL != cdolist_list_var_1; cdolist_list_var_1 = cdolist_list_var_1.rest() , entry = cdolist_list_var_1.first()) {
                        sethash(entry.first(), number_values, entry.rest());
                    }
                }
            }
            return number_values;
        }
    }

    /**
     *
     *
     * @return hashtable; a hashtable mapping atomic English number strings to numbers
     */
    @LispMethod(comment = "@return hashtable; a hashtable mapping atomic English number strings to numbers")
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

    /**
     *
     *
     * @return boolean; the number corresponding to STRING if there is one, nil otherwise
     */
    @LispMethod(comment = "@return boolean; the number corresponding to STRING if there is one, nil otherwise")
    public static final SubLObject number_value_alt(SubLObject string) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL != string_utilities.empty_string_p(string)) {
                return NIL;
            }
            {
                SubLObject v_object = read_from_string_ignoring_errors(string, NIL, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                if (v_object.isNumber()) {
                    return v_object;
                } else {
                    {
                        SubLObject lookup_string = (NIL != parsing_vars.$numeral_parser_case_sensitiveP$.getDynamicValue(thread)) ? ((SubLObject) (string)) : Strings.string_downcase(string, UNPROVIDED, UNPROVIDED);
                        return gethash(lookup_string, $number_values$.getDynamicValue(thread), gethash(string_utilities.strip_trailer(lookup_string, $$$s), $number_values$.getDynamicValue(thread), gethash(string_utilities.strip_trailer(lookup_string, $$$th), $number_values$.getDynamicValue(thread), gethash(string_utilities.strip_trailer(lookup_string, $$$ths), $number_values$.getDynamicValue(thread), UNPROVIDED))));
                    }
                }
            }
        }
    }

    /**
     *
     *
     * @return boolean; the number corresponding to STRING if there is one, nil otherwise
     */
    @LispMethod(comment = "@return boolean; the number corresponding to STRING if there is one, nil otherwise")
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

    public static final SubLObject number_string_signP_alt(SubLObject word) {
        return number_utilities.number_string_p(document.sign_string(word));
    }

    public static SubLObject number_string_signP(final SubLObject word) {
        return number_utilities.number_string_p(document.sign_string(word));
    }

    /**
     *
     *
     * @param STRING
     * 		string; a hyphenated string
     * @return boolean; the number corresponding to STRING if there is one, nil otherwise
     */
    @LispMethod(comment = "@param STRING\r\n\t\tstring; a hyphenated string\r\n@return boolean; the number corresponding to STRING if there is one, nil otherwise")
    public static final SubLObject hyphenated_number_value_alt(SubLObject string) {
        {
            SubLObject components = string_utilities.split_string(string, $list_alt19);
            return com.cyc.cycjava.cycl.numeral_parser.combine_number_values(com.cyc.cycjava.cycl.numeral_parser.number_value(components.first()), $PLUS, com.cyc.cycjava.cycl.numeral_parser.number_value(second(components)));
        }
    }

    /**
     *
     *
     * @param STRING
     * 		string; a hyphenated string
     * @return boolean; the number corresponding to STRING if there is one, nil otherwise
     */
    @LispMethod(comment = "@param STRING\r\n\t\tstring; a hyphenated string\r\n@return boolean; the number corresponding to STRING if there is one, nil otherwise")
    public static SubLObject hyphenated_number_value(final SubLObject string) {
        final SubLObject components = string_utilities.split_string(string, $list19);
        return combine_number_values(number_value(components.first()), $PLUS, number_value(second(components)));
    }

    /**
     *
     *
     * @return boolean; the number resulting from combining VAL1 and VAL2 according to TYPE
    if there is one, nil otherwise.
     * @unknown baxter
     */
    @LispMethod(comment = "@return boolean; the number resulting from combining VAL1 and VAL2 according to TYPE\r\nif there is one, nil otherwise.\r\n@unknown baxter")
    public static final SubLObject combine_number_values_alt(SubLObject val1, SubLObject type, SubLObject val2) {
        SubLTrampolineFile.checkType(type, KEYWORDP);
        {
            SubLObject raw_value = (val1.isNumber() && val2.isNumber()) ? ((SubLObject) (com.cyc.cycjava.cycl.numeral_parser.combine_non_cycl_number_values(val1, type, val2))) : com.cyc.cycjava.cycl.numeral_parser.combine_cycl_number_values(val1, type, val2);
            return (type == $TIMES) && (NIL != number_utilities.extended_potentially_infinite_number_p(raw_value)) ? ((SubLObject) (number_utilities.significant_digits(raw_value, com.cyc.cycjava.cycl.numeral_parser.numeral_parser_max_significant_digits(val1, val2)))) : raw_value;
        }
    }

    /**
     *
     *
     * @return boolean; the number resulting from combining VAL1 and VAL2 according to TYPE
    if there is one, nil otherwise.
     * @unknown baxter
     */
    @LispMethod(comment = "@return boolean; the number resulting from combining VAL1 and VAL2 according to TYPE\r\nif there is one, nil otherwise.\r\n@unknown baxter")
    public static SubLObject combine_number_values(final SubLObject val1, final SubLObject type, final SubLObject val2) {
        assert NIL != keywordp(type) : "! keywordp(type) " + ("Types.keywordp(type) " + "CommonSymbols.NIL != Types.keywordp(type) ") + type;
        final SubLObject raw_value = (val1.isNumber() && val2.isNumber()) ? combine_non_cycl_number_values(val1, type, val2) : combine_cycl_number_values(val1, type, val2);
        return (type == $TIMES) && (NIL != number_utilities.extended_potentially_infinite_number_p(raw_value)) ? number_utilities.significant_digits(raw_value, numeral_parser_max_significant_digits(val1, val2)) : raw_value;
    }

    public static final SubLObject numeral_parser_max_significant_digits_alt(SubLObject val1, SubLObject val2) {
        {
            SubLObject sd1 = com.cyc.cycjava.cycl.numeral_parser.numeral_parser_significant_digits(val1);
            SubLObject sd2 = com.cyc.cycjava.cycl.numeral_parser.numeral_parser_significant_digits(val2);
            return max(sd1, sd2);
        }
    }

    public static SubLObject numeral_parser_max_significant_digits(final SubLObject val1, final SubLObject val2) {
        final SubLObject sd1 = numeral_parser_significant_digits(val1);
        final SubLObject sd2 = numeral_parser_significant_digits(val2);
        return max(sd1, sd2);
    }

    /**
     * Estimate how many significant digits VAL has.
     */
    @LispMethod(comment = "Estimate how many significant digits VAL has.")
    public static final SubLObject numeral_parser_significant_digits_alt(SubLObject val) {
        {
            SubLObject string = remove(CHAR_period, prin1_to_string(val), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            SubLObject suffix_start = list_utilities.position_if_not(DIGIT_CHAR_P, string, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            return NIL != suffix_start ? ((SubLObject) (suffix_start)) : length(string);
        }
    }

    @LispMethod(comment = "Estimate how many significant digits VAL has.")
    public static SubLObject numeral_parser_significant_digits(final SubLObject val) {
        final SubLObject string = remove(CHAR_period, prin1_to_string(val), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        final SubLObject suffix_start = list_utilities.position_if_not(DIGIT_CHAR_P, string, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        return NIL != suffix_start ? suffix_start : length(string);
    }/**
     * Estimate how many significant digits VAL has.
     */


    /**
     *
     *
     * @return CYCL or NIL; the result of combining two number values according to TYPE.
    This function works on any CycL number-denoting expressions.
     * @unknown baxter
     */
    @LispMethod(comment = "@return CYCL or NIL; the result of combining two number values according to TYPE.\r\nThis function works on any CycL number-denoting expressions.\r\n@unknown baxter")
    public static final SubLObject combine_cycl_number_values_alt(SubLObject val1, SubLObject type, SubLObject val2) {
        {
            SubLObject raw_value = NIL;
            SubLObject pcase_var = type;
            if (pcase_var.eql($PLUS)) {
                raw_value = list($$PlusFn, val1, val2);
            } else {
                if (pcase_var.eql($TIMES)) {
                    raw_value = list($$TimesFn, val1, val2);
                } else {
                    if (pcase_var.eql($DIVIDEDBY)) {
                        raw_value = list($$QuotientFn, val1, val2);
                    } else {
                        if (pcase_var.eql($TOTHE)) {
                            raw_value = list($$ExponentFn, val1, val2);
                        }
                    }
                }
            }
            return simplifier.simplify_number_expression(raw_value);
        }
    }

    /**
     *
     *
     * @return CYCL or NIL; the result of combining two number values according to TYPE.
    This function works on any CycL number-denoting expressions.
     * @unknown baxter
     */
    @LispMethod(comment = "@return CYCL or NIL; the result of combining two number values according to TYPE.\r\nThis function works on any CycL number-denoting expressions.\r\n@unknown baxter")
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

    /**
     *
     *
     * @return NUMBERP or NIL; the result of combining two NUMBERP values according to TYPE.
     * @unknown baxter
     */
    @LispMethod(comment = "@return NUMBERP or NIL; the result of combining two NUMBERP values according to TYPE.\r\n@unknown baxter")
    public static final SubLObject combine_non_cycl_number_values_alt(SubLObject val1, SubLObject type, SubLObject val2) {
        {
            SubLObject pcase_var = type;
            if (pcase_var.eql($PLUS)) {
                return add(val1, val2);
            } else {
                if (pcase_var.eql($TIMES)) {
                    return multiply(val1, val2);
                } else {
                    if (pcase_var.eql($DIVIDEDBY)) {
                        return divide(val1, val2);
                    } else {
                        if (pcase_var.eql($TOTHE)) {
                            return expt(val1, val2);
                        }
                    }
                }
            }
        }
        return NIL;
    }

    /**
     *
     *
     * @return NUMBERP or NIL; the result of combining two NUMBERP values according to TYPE.
     * @unknown baxter
     */
    @LispMethod(comment = "@return NUMBERP or NIL; the result of combining two NUMBERP values according to TYPE.\r\n@unknown baxter")
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

    public static final SubLObject numeral_parser_stringE_alt(SubLObject string1, SubLObject string2) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            return NIL != parsing_vars.$numeral_parser_case_sensitiveP$.getDynamicValue(thread) ? ((SubLObject) (Strings.stringE(string1, string2, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED))) : Strings.string_equal(string1, string2, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        }
    }

    public static SubLObject numeral_parser_stringE(final SubLObject string1, final SubLObject string2) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return NIL != parsing_vars.$numeral_parser_case_sensitiveP$.getDynamicValue(thread) ? cycl_string.cycl_stringE(string1, string2) : cycl_string.cycl_string_equal(string1, string2);
    }

    public static final SubLObject numeral_parser_charE_alt(SubLObject char1, SubLObject char2) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            return NIL != parsing_vars.$numeral_parser_case_sensitiveP$.getDynamicValue(thread) ? ((SubLObject) (charE(char1, char2))) : char_equal(char1, char2);
        }
    }

    public static SubLObject numeral_parser_charE(final SubLObject char1, final SubLObject char2) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return NIL != parsing_vars.$numeral_parser_case_sensitiveP$.getDynamicValue(thread) ? charE(char1, char2) : char_equal(char1, char2);
    }

    public static final SubLObject zero_literalP_alt(SubLObject v_object) {
        return makeBoolean((NIL != document.sign_p(v_object)) && (NIL != com.cyc.cycjava.cycl.numeral_parser.numeral_parser_stringE(document.sign_string(v_object), $$$zero)));
    }

    public static SubLObject zero_literalP(final SubLObject v_object) {
        return makeBoolean((NIL != document.sign_p(v_object)) && (NIL != numeral_parser_stringE(document.sign_string(v_object), $$$zero)));
    }

    public static final SubLObject indefinite_signP_alt(SubLObject v_object) {
        return makeBoolean((NIL != document.sign_p(v_object)) && (NIL != member($INDEFINITE, document.sign_category(v_object), UNPROVIDED, UNPROVIDED)));
    }

    public static SubLObject indefinite_signP(final SubLObject v_object) {
        return makeBoolean((NIL != document.sign_p(v_object)) && (NIL != member($INDEFINITE, document.sign_category(v_object), UNPROVIDED, UNPROVIDED)));
    }

    public static final SubLObject atomic_ten_signP_alt(SubLObject v_object) {
        return makeBoolean((NIL != document.sign_p(v_object)) && (NIL != assoc(document.sign_string(v_object), $atomic_tens$.getGlobalValue(), symbol_function($sym32$NUMERAL_PARSER_STRING_), UNPROVIDED)));
    }

    public static SubLObject atomic_ten_signP(final SubLObject v_object) {
        return makeBoolean((NIL != document.sign_p(v_object)) && (NIL != assoc(document.sign_string(v_object), $atomic_tens$.getGlobalValue(), symbol_function($sym32$NUMERAL_PARSER_STRING_), UNPROVIDED)));
    }

    public static final SubLObject digit_signP_alt(SubLObject v_object) {
        return makeBoolean((NIL != document.sign_p(v_object)) && (NIL != assoc(document.sign_string(v_object), $digits$.getGlobalValue(), symbol_function($sym32$NUMERAL_PARSER_STRING_), UNPROVIDED)));
    }

    public static SubLObject digit_signP(final SubLObject v_object) {
        return makeBoolean((NIL != document.sign_p(v_object)) && (NIL != assoc(document.sign_string(v_object), $digits$.getGlobalValue(), symbol_function($sym32$NUMERAL_PARSER_STRING_), UNPROVIDED)));
    }

    public static final SubLObject deci_signP_alt(SubLObject v_object) {
        return makeBoolean((NIL != document.sign_p(v_object)) && (NIL != assoc(document.sign_string(v_object), $digits$.getGlobalValue(), symbol_function($sym32$NUMERAL_PARSER_STRING_), UNPROVIDED)));
    }

    public static SubLObject deci_signP(final SubLObject v_object) {
        return makeBoolean((NIL != document.sign_p(v_object)) && (NIL != assoc(document.sign_string(v_object), $digits$.getGlobalValue(), symbol_function($sym32$NUMERAL_PARSER_STRING_), UNPROVIDED)));
    }

    public static final SubLObject hyphen_signP_alt(SubLObject v_object) {
        return makeBoolean((NIL != document.sign_p(v_object)) && document.sign_string(v_object).equal($str_alt33$_));
    }

    public static SubLObject hyphen_signP(final SubLObject v_object) {
        return makeBoolean((NIL != document.sign_p(v_object)) && document.sign_string(v_object).equal($str33$_));
    }

    public static final SubLObject teen_signP_alt(SubLObject v_object) {
        return makeBoolean((NIL != document.sign_p(v_object)) && (NIL != assoc(document.sign_string(v_object), $teens$.getGlobalValue(), symbol_function($sym32$NUMERAL_PARSER_STRING_), UNPROVIDED)));
    }

    public static SubLObject teen_signP(final SubLObject v_object) {
        return makeBoolean((NIL != document.sign_p(v_object)) && (NIL != assoc(document.sign_string(v_object), $teens$.getGlobalValue(), symbol_function($sym32$NUMERAL_PARSER_STRING_), UNPROVIDED)));
    }

    /**
     *
     *
     * @unknown baxter
     */
    @LispMethod(comment = "@unknown baxter")
    public static final SubLObject fuzzy_signP_alt(SubLObject v_object) {
        return makeBoolean((NIL != document.sign_p(v_object)) && ((NIL != assoc(document.sign_string(v_object), $fuzzies$.getGlobalValue(), symbol_function($sym32$NUMERAL_PARSER_STRING_), UNPROVIDED)) || (NIL != member($FUZZY, document.sign_category(v_object), UNPROVIDED, UNPROVIDED))));
    }

    /**
     *
     *
     * @unknown baxter
     */
    @LispMethod(comment = "@unknown baxter")
    public static SubLObject fuzzy_signP(final SubLObject v_object) {
        return makeBoolean((NIL != document.sign_p(v_object)) && ((NIL != assoc(document.sign_string(v_object), $fuzzies$.getGlobalValue(), symbol_function($sym32$NUMERAL_PARSER_STRING_), UNPROVIDED)) || (NIL != member($FUZZY, document.sign_category(v_object), UNPROVIDED, UNPROVIDED))));
    }

    public static final SubLObject non_atomic_ten_signP_alt(SubLObject v_object) {
        return makeBoolean((NIL != document.sign_p(v_object)) && (NIL != member($NON_ATOMIC_TEN, document.sign_category(v_object), UNPROVIDED, UNPROVIDED)));
    }

    public static SubLObject non_atomic_ten_signP(final SubLObject v_object) {
        return makeBoolean((NIL != document.sign_p(v_object)) && (NIL != member($NON_ATOMIC_TEN, document.sign_category(v_object), UNPROVIDED, UNPROVIDED)));
    }

    public static final SubLObject hyphenated_non_atomic_ten_signP_alt(SubLObject v_object) {
        if (NIL != document.sign_p(v_object)) {
            {
                SubLObject components = string_utilities.split_string(document.sign_string(v_object), $list_alt19);
                return makeBoolean((length(components).numE(TWO_INTEGER) && (NIL != assoc(components.first(), $atomic_tens$.getGlobalValue(), symbol_function($sym32$NUMERAL_PARSER_STRING_), UNPROVIDED))) && (NIL != assoc(second(components), $digits$.getGlobalValue(), symbol_function($sym32$NUMERAL_PARSER_STRING_), UNPROVIDED)));
            }
        } else {
            return NIL;
        }
    }

    public static SubLObject hyphenated_non_atomic_ten_signP(final SubLObject v_object) {
        if (NIL != document.sign_p(v_object)) {
            final SubLObject components = string_utilities.split_string(document.sign_string(v_object), $list19);
            return makeBoolean((length(components).numE(TWO_INTEGER) && (NIL != assoc(components.first(), $atomic_tens$.getGlobalValue(), symbol_function($sym32$NUMERAL_PARSER_STRING_), UNPROVIDED))) && (NIL != assoc(second(components), $digits$.getGlobalValue(), symbol_function($sym32$NUMERAL_PARSER_STRING_), UNPROVIDED)));
        }
        return NIL;
    }

    public static final SubLObject cent_signP_alt(SubLObject v_object) {
        return makeBoolean((NIL != document.sign_p(v_object)) && (NIL != member($CENT, document.sign_category(v_object), UNPROVIDED, UNPROVIDED)));
    }

    public static SubLObject cent_signP(final SubLObject v_object) {
        return makeBoolean((NIL != document.sign_p(v_object)) && (NIL != member($CENT, document.sign_category(v_object), UNPROVIDED, UNPROVIDED)));
    }

    public static final SubLObject kilo_signP_alt(SubLObject v_object) {
        return makeBoolean((NIL != document.sign_p(v_object)) && (NIL != member($KILO, document.sign_category(v_object), UNPROVIDED, UNPROVIDED)));
    }

    public static SubLObject kilo_signP(final SubLObject v_object) {
        return makeBoolean((NIL != document.sign_p(v_object)) && (NIL != member($KILO, document.sign_category(v_object), UNPROVIDED, UNPROVIDED)));
    }

    public static final SubLObject fraction_signP_alt(SubLObject v_object) {
        return makeBoolean((NIL != document.sign_p(v_object)) && (NIL != member($FRACTION, document.sign_category(v_object), UNPROVIDED, UNPROVIDED)));
    }

    public static SubLObject fraction_signP(final SubLObject v_object) {
        return makeBoolean((NIL != document.sign_p(v_object)) && (NIL != member($FRACTION, document.sign_category(v_object), UNPROVIDED, UNPROVIDED)));
    }

    public static final SubLObject float_signP_alt(SubLObject v_object) {
        return makeBoolean((NIL != document.sign_p(v_object)) && (NIL != member($FLOAT, document.sign_category(v_object), UNPROVIDED, UNPROVIDED)));
    }

    public static SubLObject float_signP(final SubLObject v_object) {
        return makeBoolean((NIL != document.sign_p(v_object)) && (NIL != member($FLOAT, document.sign_category(v_object), UNPROVIDED, UNPROVIDED)));
    }

    public static final SubLObject number_signP_alt(SubLObject v_object) {
        return makeBoolean((NIL != document.sign_p(v_object)) && (NIL != member($NUMBER, document.sign_category(v_object), UNPROVIDED, UNPROVIDED)));
    }

    public static SubLObject number_signP(final SubLObject v_object) {
        return makeBoolean((NIL != document.sign_p(v_object)) && (NIL != member($NUMBER, document.sign_category(v_object), UNPROVIDED, UNPROVIDED)));
    }

    public static final SubLObject interval_signP_alt(SubLObject v_object) {
        return makeBoolean((NIL != document.sign_p(v_object)) && (NIL != member($INTERVAL, document.sign_category(v_object), UNPROVIDED, UNPROVIDED)));
    }

    public static SubLObject interval_signP(final SubLObject v_object) {
        return makeBoolean((NIL != document.sign_p(v_object)) && (NIL != member($INTERVAL, document.sign_category(v_object), UNPROVIDED, UNPROVIDED)));
    }

    public static final SubLObject proper_interval_signP_alt(SubLObject v_object) {
        return makeBoolean((NIL != document.sign_p(v_object)) && (NIL != member($PROPER_INTERVAL, document.sign_category(v_object), UNPROVIDED, UNPROVIDED)));
    }

    public static SubLObject proper_interval_signP(final SubLObject v_object) {
        return makeBoolean((NIL != document.sign_p(v_object)) && (NIL != member($PROPER_INTERVAL, document.sign_category(v_object), UNPROVIDED, UNPROVIDED)));
    }

    public static final SubLObject milli_signP_alt(SubLObject v_object) {
        return makeBoolean((NIL != document.sign_p(v_object)) && (NIL != member($MILLI, document.sign_category(v_object), UNPROVIDED, UNPROVIDED)));
    }

    public static SubLObject milli_signP(final SubLObject v_object) {
        return makeBoolean((NIL != document.sign_p(v_object)) && (NIL != member($MILLI, document.sign_category(v_object), UNPROVIDED, UNPROVIDED)));
    }

    public static final SubLObject billi_signP_alt(SubLObject v_object) {
        return makeBoolean((NIL != document.sign_p(v_object)) && (NIL != member($BILLI, document.sign_category(v_object), UNPROVIDED, UNPROVIDED)));
    }

    public static SubLObject billi_signP(final SubLObject v_object) {
        return makeBoolean((NIL != document.sign_p(v_object)) && (NIL != member($BILLI, document.sign_category(v_object), UNPROVIDED, UNPROVIDED)));
    }

    public static final SubLObject trilli_signP_alt(SubLObject v_object) {
        return makeBoolean((NIL != document.sign_p(v_object)) && (NIL != member($TRILLI, document.sign_category(v_object), UNPROVIDED, UNPROVIDED)));
    }

    public static SubLObject trilli_signP(final SubLObject v_object) {
        return makeBoolean((NIL != document.sign_p(v_object)) && (NIL != member($TRILLI, document.sign_category(v_object), UNPROVIDED, UNPROVIDED)));
    }

    public static final SubLObject integer_signP_alt(SubLObject v_object) {
        return makeBoolean((NIL != document.sign_p(v_object)) && (NIL != member($INTEGER, document.sign_category(v_object), UNPROVIDED, UNPROVIDED)));
    }

    public static SubLObject integer_signP(final SubLObject v_object) {
        return makeBoolean((NIL != document.sign_p(v_object)) && (NIL != member($INTEGER, document.sign_category(v_object), UNPROVIDED, UNPROVIDED)));
    }

    /**
     *
     *
     * @unknown baxter
     */
    @LispMethod(comment = "@unknown baxter")
    public static final SubLObject extended_dozen_signP_alt(SubLObject v_object) {
        return makeBoolean((NIL != document.sign_p(v_object)) && (NIL != member($EXTENDED_DOZEN, document.sign_category(v_object), UNPROVIDED, UNPROVIDED)));
    }

    /**
     *
     *
     * @unknown baxter
     */
    @LispMethod(comment = "@unknown baxter")
    public static SubLObject extended_dozen_signP(final SubLObject v_object) {
        return makeBoolean((NIL != document.sign_p(v_object)) && (NIL != member($EXTENDED_DOZEN, document.sign_category(v_object), UNPROVIDED, UNPROVIDED)));
    }

    /**
     *
     *
     * @unknown baxter
     */
    @LispMethod(comment = "@unknown baxter")
    public static final SubLObject standard_dozen_signP_alt(SubLObject v_object) {
        return makeBoolean((NIL != document.sign_p(v_object)) && (NIL != member($STANDARD_DOZEN, document.sign_category(v_object), UNPROVIDED, UNPROVIDED)));
    }

    /**
     *
     *
     * @unknown baxter
     */
    @LispMethod(comment = "@unknown baxter")
    public static SubLObject standard_dozen_signP(final SubLObject v_object) {
        return makeBoolean((NIL != document.sign_p(v_object)) && (NIL != member($STANDARD_DOZEN, document.sign_category(v_object), UNPROVIDED, UNPROVIDED)));
    }

    public static final SubLObject extended_hundred_signP_alt(SubLObject v_object) {
        return makeBoolean((NIL != document.sign_p(v_object)) && (NIL != member($EXTENDED_HUNDRED, document.sign_category(v_object), UNPROVIDED, UNPROVIDED)));
    }

    public static SubLObject extended_hundred_signP(final SubLObject v_object) {
        return makeBoolean((NIL != document.sign_p(v_object)) && (NIL != member($EXTENDED_HUNDRED, document.sign_category(v_object), UNPROVIDED, UNPROVIDED)));
    }

    public static final SubLObject standard_hundred_signP_alt(SubLObject v_object) {
        return makeBoolean((NIL != document.sign_p(v_object)) && (NIL != member($STANDARD_HUNDRED, document.sign_category(v_object), UNPROVIDED, UNPROVIDED)));
    }

    public static SubLObject standard_hundred_signP(final SubLObject v_object) {
        return makeBoolean((NIL != document.sign_p(v_object)) && (NIL != member($STANDARD_HUNDRED, document.sign_category(v_object), UNPROVIDED, UNPROVIDED)));
    }

    public static final SubLObject thousand_signP_alt(SubLObject v_object) {
        return makeBoolean((NIL != document.sign_p(v_object)) && (NIL != member($THOUSAND, document.sign_category(v_object), UNPROVIDED, UNPROVIDED)));
    }

    public static SubLObject thousand_signP(final SubLObject v_object) {
        return makeBoolean((NIL != document.sign_p(v_object)) && (NIL != member($THOUSAND, document.sign_category(v_object), UNPROVIDED, UNPROVIDED)));
    }

    public static final SubLObject million_signP_alt(SubLObject v_object) {
        return makeBoolean((NIL != document.sign_p(v_object)) && (NIL != member($MILLION, document.sign_category(v_object), UNPROVIDED, UNPROVIDED)));
    }

    public static SubLObject million_signP(final SubLObject v_object) {
        return makeBoolean((NIL != document.sign_p(v_object)) && (NIL != member($MILLION, document.sign_category(v_object), UNPROVIDED, UNPROVIDED)));
    }

    public static final SubLObject billion_signP_alt(SubLObject v_object) {
        return makeBoolean((NIL != document.sign_p(v_object)) && (NIL != member($BILLION, document.sign_category(v_object), UNPROVIDED, UNPROVIDED)));
    }

    public static SubLObject billion_signP(final SubLObject v_object) {
        return makeBoolean((NIL != document.sign_p(v_object)) && (NIL != member($BILLION, document.sign_category(v_object), UNPROVIDED, UNPROVIDED)));
    }

    public static final SubLObject trillion_signP_alt(SubLObject v_object) {
        return makeBoolean((NIL != document.sign_p(v_object)) && (NIL != member($TRILLION, document.sign_category(v_object), UNPROVIDED, UNPROVIDED)));
    }

    public static SubLObject trillion_signP(final SubLObject v_object) {
        return makeBoolean((NIL != document.sign_p(v_object)) && (NIL != member($TRILLION, document.sign_category(v_object), UNPROVIDED, UNPROVIDED)));
    }

    public static final SubLObject and_literalP_alt(SubLObject v_object) {
        return makeBoolean((NIL != document.sign_p(v_object)) && (NIL != com.cyc.cycjava.cycl.numeral_parser.numeral_parser_stringE(document.sign_string(v_object), $$$and)));
    }

    public static SubLObject and_literalP(final SubLObject v_object) {
        return makeBoolean((NIL != document.sign_p(v_object)) && (NIL != numeral_parser_stringE(document.sign_string(v_object), $$$and)));
    }

    public static final SubLObject indefinite_literalP_alt(SubLObject v_object) {
        return makeBoolean((NIL != document.sign_p(v_object)) && (NIL != assoc(document.sign_string(v_object), $a$.getGlobalValue(), symbol_function($sym32$NUMERAL_PARSER_STRING_), UNPROVIDED)));
    }

    public static SubLObject indefinite_literalP(final SubLObject v_object) {
        return makeBoolean((NIL != document.sign_p(v_object)) && (NIL != assoc(document.sign_string(v_object), $a$.getGlobalValue(), symbol_function($sym32$NUMERAL_PARSER_STRING_), UNPROVIDED)));
    }

    /**
     *
     *
     * @unknown baxter
     */
    @LispMethod(comment = "@unknown baxter")
    public static final SubLObject dozen_literalP_alt(SubLObject v_object) {
        return makeBoolean((NIL != document.sign_p(v_object)) && (NIL != com.cyc.cycjava.cycl.numeral_parser.numeral_parser_stringE(document.sign_string(v_object), $$$dozen)));
    }

    /**
     *
     *
     * @unknown baxter
     */
    @LispMethod(comment = "@unknown baxter")
    public static SubLObject dozen_literalP(final SubLObject v_object) {
        return makeBoolean((NIL != document.sign_p(v_object)) && (NIL != numeral_parser_stringE(document.sign_string(v_object), $$$dozen)));
    }

    /**
     *
     *
     * @unknown baxter
     */
    @LispMethod(comment = "@unknown baxter")
    public static final SubLObject few_literalP_alt(SubLObject v_object) {
        return makeBoolean((NIL != document.sign_p(v_object)) && (NIL != com.cyc.cycjava.cycl.numeral_parser.numeral_parser_stringE(document.sign_string(v_object), $$$few)));
    }

    /**
     *
     *
     * @unknown baxter
     */
    @LispMethod(comment = "@unknown baxter")
    public static SubLObject few_literalP(final SubLObject v_object) {
        return makeBoolean((NIL != document.sign_p(v_object)) && (NIL != numeral_parser_stringE(document.sign_string(v_object), $$$few)));
    }

    public static final SubLObject hundred_literalP_alt(SubLObject v_object) {
        return makeBoolean((NIL != document.sign_p(v_object)) && (NIL != com.cyc.cycjava.cycl.numeral_parser.numeral_parser_stringE(document.sign_string(v_object), $$$hundred)));
    }

    public static SubLObject hundred_literalP(final SubLObject v_object) {
        return makeBoolean((NIL != document.sign_p(v_object)) && (NIL != numeral_parser_stringE(document.sign_string(v_object), $$$hundred)));
    }

    public static final SubLObject thousand_literalP_alt(SubLObject v_object) {
        return makeBoolean((NIL != document.sign_p(v_object)) && (NIL != com.cyc.cycjava.cycl.numeral_parser.numeral_parser_stringE(document.sign_string(v_object), $$$thousand)));
    }

    public static SubLObject thousand_literalP(final SubLObject v_object) {
        return makeBoolean((NIL != document.sign_p(v_object)) && (NIL != numeral_parser_stringE(document.sign_string(v_object), $$$thousand)));
    }

    public static final SubLObject million_literalP_alt(SubLObject v_object) {
        return makeBoolean((NIL != document.sign_p(v_object)) && (NIL != com.cyc.cycjava.cycl.numeral_parser.numeral_parser_stringE(document.sign_string(v_object), $$$million)));
    }

    public static SubLObject million_literalP(final SubLObject v_object) {
        return makeBoolean((NIL != document.sign_p(v_object)) && (NIL != numeral_parser_stringE(document.sign_string(v_object), $$$million)));
    }

    public static final SubLObject millions_literalP_alt(SubLObject v_object) {
        return makeBoolean((NIL != document.sign_p(v_object)) && (NIL != com.cyc.cycjava.cycl.numeral_parser.numeral_parser_stringE(document.sign_string(v_object), $$$millions)));
    }

    public static SubLObject millions_literalP(final SubLObject v_object) {
        return makeBoolean((NIL != document.sign_p(v_object)) && (NIL != numeral_parser_stringE(document.sign_string(v_object), $$$millions)));
    }

    public static final SubLObject billions_literalP_alt(SubLObject v_object) {
        return makeBoolean((NIL != document.sign_p(v_object)) && (NIL != com.cyc.cycjava.cycl.numeral_parser.numeral_parser_stringE(document.sign_string(v_object), $$$billions)));
    }

    public static SubLObject billions_literalP(final SubLObject v_object) {
        return makeBoolean((NIL != document.sign_p(v_object)) && (NIL != numeral_parser_stringE(document.sign_string(v_object), $$$billions)));
    }

    public static final SubLObject billion_literalP_alt(SubLObject v_object) {
        return makeBoolean((NIL != document.sign_p(v_object)) && (NIL != com.cyc.cycjava.cycl.numeral_parser.numeral_parser_stringE(document.sign_string(v_object), $$$billion)));
    }

    public static SubLObject billion_literalP(final SubLObject v_object) {
        return makeBoolean((NIL != document.sign_p(v_object)) && (NIL != numeral_parser_stringE(document.sign_string(v_object), $$$billion)));
    }

    public static final SubLObject trillions_literalP_alt(SubLObject v_object) {
        return makeBoolean((NIL != document.sign_p(v_object)) && (NIL != com.cyc.cycjava.cycl.numeral_parser.numeral_parser_stringE(document.sign_string(v_object), $$$trillions)));
    }

    public static SubLObject trillions_literalP(final SubLObject v_object) {
        return makeBoolean((NIL != document.sign_p(v_object)) && (NIL != numeral_parser_stringE(document.sign_string(v_object), $$$trillions)));
    }

    public static final SubLObject trillion_literalP_alt(SubLObject v_object) {
        return makeBoolean((NIL != document.sign_p(v_object)) && (NIL != com.cyc.cycjava.cycl.numeral_parser.numeral_parser_stringE(document.sign_string(v_object), $$$trillion)));
    }

    public static SubLObject trillion_literalP(final SubLObject v_object) {
        return makeBoolean((NIL != document.sign_p(v_object)) && (NIL != numeral_parser_stringE(document.sign_string(v_object), $$$trillion)));
    }

    public static final SubLObject first_literalP_alt(SubLObject v_object) {
        return makeBoolean((NIL != document.sign_p(v_object)) && (NIL != com.cyc.cycjava.cycl.numeral_parser.numeral_parser_stringE(document.sign_string(v_object), $$$first)));
    }

    public static SubLObject first_literalP(final SubLObject v_object) {
        return makeBoolean((NIL != document.sign_p(v_object)) && (NIL != numeral_parser_stringE(document.sign_string(v_object), $$$first)));
    }

    public static final SubLObject second_literalP_alt(SubLObject v_object) {
        return makeBoolean((NIL != document.sign_p(v_object)) && (NIL != com.cyc.cycjava.cycl.numeral_parser.numeral_parser_stringE(document.sign_string(v_object), $$$second)));
    }

    public static SubLObject second_literalP(final SubLObject v_object) {
        return makeBoolean((NIL != document.sign_p(v_object)) && (NIL != numeral_parser_stringE(document.sign_string(v_object), $$$second)));
    }

    public static final SubLObject seconds_literalP_alt(SubLObject v_object) {
        return makeBoolean((NIL != document.sign_p(v_object)) && (NIL != com.cyc.cycjava.cycl.numeral_parser.numeral_parser_stringE(document.sign_string(v_object), $$$seconds)));
    }

    public static SubLObject seconds_literalP(final SubLObject v_object) {
        return makeBoolean((NIL != document.sign_p(v_object)) && (NIL != numeral_parser_stringE(document.sign_string(v_object), $$$seconds)));
    }

    public static final SubLObject atomic_denominator_literalP_alt(SubLObject v_object) {
        return makeBoolean((((((NIL != document.sign_p(v_object)) && (NIL == com.cyc.cycjava.cycl.numeral_parser.first_literalP(v_object))) && (NIL == com.cyc.cycjava.cycl.numeral_parser.second_literalP(v_object))) && (NIL == com.cyc.cycjava.cycl.numeral_parser.seconds_literalP(v_object))) && ((((NIL != com.cyc.cycjava.cycl.numeral_parser.numeral_parser_stringE(document.sign_string(v_object), $$$halves)) || (NIL != assoc(string_utilities.post_remove(document.sign_string(v_object), $$$s, $sym70$NUMERAL_PARSER_CHAR_), $irregular_denominators$.getGlobalValue(), symbol_function($sym32$NUMERAL_PARSER_STRING_), UNPROVIDED))) || (NIL != string_utilities.ends_with(document.sign_string(v_object), $$$th, UNPROVIDED))) || (NIL != string_utilities.ends_with(document.sign_string(v_object), $$$ths, UNPROVIDED)))) && (NIL != com.cyc.cycjava.cycl.numeral_parser.number_value(document.sign_string(v_object))));
    }

    public static SubLObject atomic_denominator_literalP(final SubLObject v_object) {
        return makeBoolean((((((NIL != document.sign_p(v_object)) && (NIL == first_literalP(v_object))) && (NIL == second_literalP(v_object))) && (NIL == seconds_literalP(v_object))) && ((((NIL != numeral_parser_stringE(document.sign_string(v_object), $$$halves)) || (NIL != assoc(string_utilities.post_remove(document.sign_string(v_object), $$$s, $sym70$NUMERAL_PARSER_CHAR_), $irregular_denominators$.getGlobalValue(), symbol_function($sym32$NUMERAL_PARSER_STRING_), UNPROVIDED))) || (NIL != string_utilities.ends_with(document.sign_string(v_object), $$$th, UNPROVIDED))) || (NIL != string_utilities.ends_with(document.sign_string(v_object), $$$ths, UNPROVIDED)))) && (NIL != number_value(document.sign_string(v_object))));
    }

    public static final SubLObject denominator_literalP_alt(SubLObject v_object) {
        return makeBoolean(((NIL != document.sign_p(v_object)) && ((((NIL != com.cyc.cycjava.cycl.numeral_parser.numeral_parser_stringE(document.sign_string(v_object), $$$halves)) || (NIL != assoc(string_utilities.post_remove(document.sign_string(v_object), $$$s, $sym70$NUMERAL_PARSER_CHAR_), $irregular_denominators$.getGlobalValue(), symbol_function($sym32$NUMERAL_PARSER_STRING_), UNPROVIDED))) || (NIL != string_utilities.ends_with(document.sign_string(v_object), $$$th, UNPROVIDED))) || (NIL != string_utilities.ends_with(document.sign_string(v_object), $$$ths, UNPROVIDED)))) && (NIL != com.cyc.cycjava.cycl.numeral_parser.number_value(document.sign_string(v_object))));
    }

    public static SubLObject denominator_literalP(final SubLObject v_object) {
        return makeBoolean(((NIL != document.sign_p(v_object)) && ((((NIL != numeral_parser_stringE(document.sign_string(v_object), $$$halves)) || (NIL != assoc(string_utilities.post_remove(document.sign_string(v_object), $$$s, $sym70$NUMERAL_PARSER_CHAR_), $irregular_denominators$.getGlobalValue(), symbol_function($sym32$NUMERAL_PARSER_STRING_), UNPROVIDED))) || (NIL != string_utilities.ends_with(document.sign_string(v_object), $$$th, UNPROVIDED))) || (NIL != string_utilities.ends_with(document.sign_string(v_object), $$$ths, UNPROVIDED)))) && (NIL != number_value(document.sign_string(v_object))));
    }

    public static final SubLObject denominator_signP_alt(SubLObject v_object) {
        return makeBoolean((NIL != document.sign_p(v_object)) && (NIL != member($DENOMINATOR, document.sign_category(v_object), UNPROVIDED, UNPROVIDED)));
    }

    public static SubLObject denominator_signP(final SubLObject v_object) {
        return makeBoolean((NIL != document.sign_p(v_object)) && (NIL != member($DENOMINATOR, document.sign_category(v_object), UNPROVIDED, UNPROVIDED)));
    }

    public static final SubLObject half_signP_alt(SubLObject v_object) {
        return makeBoolean((NIL != document.sign_p(v_object)) && (NIL != com.cyc.cycjava.cycl.numeral_parser.numeral_parser_stringE(document.sign_string(v_object), $$$half)));
    }

    public static SubLObject half_signP(final SubLObject v_object) {
        return makeBoolean((NIL != document.sign_p(v_object)) && (NIL != numeral_parser_stringE(document.sign_string(v_object), $$$half)));
    }

    public static final SubLObject minus_literalP_alt(SubLObject v_object) {
        return makeBoolean((NIL != document.sign_p(v_object)) && (((NIL != com.cyc.cycjava.cycl.numeral_parser.numeral_parser_stringE(document.sign_string(v_object), $$$minus)) || (NIL != com.cyc.cycjava.cycl.numeral_parser.numeral_parser_stringE(document.sign_string(v_object), $$$negative))) || (NIL != com.cyc.cycjava.cycl.numeral_parser.minus_signP(v_object))));
    }

    public static SubLObject minus_literalP(final SubLObject v_object) {
        return makeBoolean((NIL != document.sign_p(v_object)) && (((NIL != numeral_parser_stringE(document.sign_string(v_object), $$$minus)) || (NIL != numeral_parser_stringE(document.sign_string(v_object), $$$negative))) || (NIL != minus_signP(v_object))));
    }

    public static final SubLObject to_literalP_alt(SubLObject v_object) {
        return makeBoolean((NIL != document.sign_p(v_object)) && ((NIL != com.cyc.cycjava.cycl.numeral_parser.numeral_parser_stringE(document.sign_string(v_object), $$$to)) || (NIL != com.cyc.cycjava.cycl.numeral_parser.numeral_parser_stringE(document.sign_string(v_object), $str_alt33$_))));
    }

    public static SubLObject to_literalP(final SubLObject v_object) {
        return makeBoolean((NIL != document.sign_p(v_object)) && ((NIL != numeral_parser_stringE(document.sign_string(v_object), $$$to)) || (NIL != numeral_parser_stringE(document.sign_string(v_object), $str33$_))));
    }

    public static final SubLObject from_literalP_alt(SubLObject v_object) {
        return makeBoolean((NIL != document.sign_p(v_object)) && (NIL != com.cyc.cycjava.cycl.numeral_parser.numeral_parser_stringE(document.sign_string(v_object), $$$from)));
    }

    public static SubLObject from_literalP(final SubLObject v_object) {
        return makeBoolean((NIL != document.sign_p(v_object)) && (NIL != numeral_parser_stringE(document.sign_string(v_object), $$$from)));
    }

    public static final SubLObject between_literalP_alt(SubLObject v_object) {
        return makeBoolean((NIL != document.sign_p(v_object)) && (NIL != com.cyc.cycjava.cycl.numeral_parser.numeral_parser_stringE(document.sign_string(v_object), $$$between)));
    }

    public static SubLObject between_literalP(final SubLObject v_object) {
        return makeBoolean((NIL != document.sign_p(v_object)) && (NIL != numeral_parser_stringE(document.sign_string(v_object), $$$between)));
    }

    public static final SubLObject mult_signP_alt(SubLObject v_object) {
        return makeBoolean((NIL != document.sign_p(v_object)) && (NIL != member($MULT, document.sign_category(v_object), UNPROVIDED, UNPROVIDED)));
    }

    public static SubLObject mult_signP(final SubLObject v_object) {
        return makeBoolean((NIL != document.sign_p(v_object)) && (NIL != member($MULT, document.sign_category(v_object), UNPROVIDED, UNPROVIDED)));
    }

    public static final SubLObject expt_operator_signP_alt(SubLObject v_object) {
        return makeBoolean((NIL != document.sign_p(v_object)) && (NIL != member($EXPT, document.sign_category(v_object), UNPROVIDED, UNPROVIDED)));
    }

    public static SubLObject expt_operator_signP(final SubLObject v_object) {
        return makeBoolean((NIL != document.sign_p(v_object)) && (NIL != member($EXPT, document.sign_category(v_object), UNPROVIDED, UNPROVIDED)));
    }

    public static final SubLObject exponentiation_signP_alt(SubLObject v_object) {
        return makeBoolean((NIL != document.sign_p(v_object)) && (NIL != member($EXPONENTIATION, document.sign_category(v_object), UNPROVIDED, UNPROVIDED)));
    }

    public static SubLObject exponentiation_signP(final SubLObject v_object) {
        return makeBoolean((NIL != document.sign_p(v_object)) && (NIL != member($EXPONENTIATION, document.sign_category(v_object), UNPROVIDED, UNPROVIDED)));
    }

    public static final SubLObject minus_signP_alt(SubLObject v_object) {
        return makeBoolean((NIL != document.sign_p(v_object)) && (NIL != Strings.stringE(document.sign_string(v_object), $str_alt33$_, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED)));
    }

    public static SubLObject minus_signP(final SubLObject v_object) {
        return makeBoolean((NIL != document.sign_p(v_object)) && (NIL != Strings.stringE(document.sign_string(v_object), $str33$_, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED)));
    }

    public static final SubLObject plus_signP_alt(SubLObject v_object) {
        return makeBoolean((NIL != document.sign_p(v_object)) && (NIL != Strings.stringE(document.sign_string(v_object), $str_alt81$_, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED)));
    }

    public static SubLObject plus_signP(final SubLObject v_object) {
        return makeBoolean((NIL != document.sign_p(v_object)) && (NIL != Strings.stringE(document.sign_string(v_object), $str81$_, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED)));
    }

    public static final SubLObject build_denominator_alt(SubLObject fst) {
        {
            SubLObject output = finite_state_transducer.fst_output(fst);
            if (NIL == output) {
                Errors.error($str_alt82$Can_t_build_a_denominator_out_of_);
            } else {
                if (NIL != list_utilities.singletonP(output)) {
                    {
                        SubLObject word = output.first();
                        document.word_update(word, list($CATEGORY, adjoin($DENOMINATOR, document.word_category(word), UNPROVIDED, UNPROVIDED), $INFO, com.cyc.cycjava.cycl.numeral_parser.number_value(document.word_string(word))));
                        return word;
                    }
                } else {
                    {
                        SubLObject phrase = document.new_phrase(UNPROVIDED);
                        SubLObject numeric_value = ZERO_INTEGER;
                        SubLObject cdolist_list_var = output;
                        SubLObject dtr = NIL;
                        for (dtr = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , dtr = cdolist_list_var.first()) {
                            {
                                SubLObject dtr_info = document.sign_info(dtr);
                                numeric_value = com.cyc.cycjava.cycl.numeral_parser.combine_number_values(numeric_value, $PLUS, NIL != dtr_info ? ((SubLObject) (dtr_info)) : com.cyc.cycjava.cycl.numeral_parser.number_value(document.sign_string(dtr)));
                            }
                        }
                        document.phrase_update(phrase, list($CATEGORY, adjoin($DENOMINATOR, document.phrase_category(phrase), UNPROVIDED, UNPROVIDED), $STRING, string_utilities.bunge(Mapping.mapcar(symbol_function(SIGN_STRING), finite_state_transducer.fst_output(fst)), UNPROVIDED), $CONSTITUENTS, apply(symbol_function(VECTOR), finite_state_transducer.fst_output(fst)), $INFO, numeric_value));
                        return phrase;
                    }
                }
            }
        }
        return NIL;
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

    public static final SubLObject build_zero_alt(SubLObject fst) {
        {
            SubLObject word = finite_state_transducer.fst_output(fst).first();
            document.word_update(word, list($CATEGORY, adjoin($ZERO, document.word_category(word), UNPROVIDED, UNPROVIDED), $INFO, com.cyc.cycjava.cycl.numeral_parser.number_value(document.word_string(word))));
            return word;
        }
    }

    public static SubLObject build_zero(final SubLObject fst) {
        final SubLObject word = finite_state_transducer.fst_output(fst).first();
        document.word_update(word, list($CATEGORY, adjoin($ZERO, document.word_category(word), UNPROVIDED, UNPROVIDED), $INFO, number_value(document.word_string(word))));
        return word;
    }

    public static final SubLObject build_indefinite_alt(SubLObject fst) {
        {
            SubLObject word = finite_state_transducer.fst_output(fst).first();
            document.word_update(word, list($CATEGORY, adjoin($INDEFINITE, document.word_category(word), UNPROVIDED, UNPROVIDED), $INFO, com.cyc.cycjava.cycl.numeral_parser.number_value(document.word_string(word))));
            return word;
        }
    }

    public static SubLObject build_indefinite(final SubLObject fst) {
        final SubLObject word = finite_state_transducer.fst_output(fst).first();
        document.word_update(word, list($CATEGORY, adjoin($INDEFINITE, document.word_category(word), UNPROVIDED, UNPROVIDED), $INFO, number_value(document.word_string(word))));
        return word;
    }

    public static final SubLObject build_deci_alt(SubLObject fst) {
        {
            SubLObject word = finite_state_transducer.fst_output(fst).first();
            document.word_update(word, list($CATEGORY, adjoin($DECI, document.word_category(word), UNPROVIDED, UNPROVIDED), $INFO, com.cyc.cycjava.cycl.numeral_parser.number_value(document.word_string(word))));
            return word;
        }
    }

    public static SubLObject build_deci(final SubLObject fst) {
        final SubLObject word = finite_state_transducer.fst_output(fst).first();
        document.word_update(word, list($CATEGORY, adjoin($DECI, document.word_category(word), UNPROVIDED, UNPROVIDED), $INFO, number_value(document.word_string(word))));
        return word;
    }

    public static final SubLObject build_teen_alt(SubLObject fst) {
        {
            SubLObject word = finite_state_transducer.fst_output(fst).first();
            document.word_update(word, list($CATEGORY, adjoin($TEEN, document.word_category(word), UNPROVIDED, UNPROVIDED), $INFO, com.cyc.cycjava.cycl.numeral_parser.number_value(document.word_string(word))));
            return word;
        }
    }

    public static SubLObject build_teen(final SubLObject fst) {
        final SubLObject word = finite_state_transducer.fst_output(fst).first();
        document.word_update(word, list($CATEGORY, adjoin($TEEN, document.word_category(word), UNPROVIDED, UNPROVIDED), $INFO, number_value(document.word_string(word))));
        return word;
    }

    /**
     *
     *
     * @unknown baxter
     */
    @LispMethod(comment = "@unknown baxter")
    public static final SubLObject build_fuzzy_alt(SubLObject fst) {
        {
            SubLObject word = finite_state_transducer.fst_output(fst).first();
            document.word_update(word, list($CATEGORY, adjoin($FUZZY, document.word_category(word), UNPROVIDED, UNPROVIDED), $INFO, com.cyc.cycjava.cycl.numeral_parser.number_value(document.word_string(word))));
            return word;
        }
    }

    /**
     *
     *
     * @unknown baxter
     */
    @LispMethod(comment = "@unknown baxter")
    public static SubLObject build_fuzzy(final SubLObject fst) {
        final SubLObject word = finite_state_transducer.fst_output(fst).first();
        document.word_update(word, list($CATEGORY, adjoin($FUZZY, document.word_category(word), UNPROVIDED, UNPROVIDED), $INFO, number_value(document.word_string(word))));
        return word;
    }

    public static final SubLObject build_atomic_ten_alt(SubLObject fst) {
        {
            SubLObject word = finite_state_transducer.fst_output(fst).first();
            document.word_update(word, list($CATEGORY, adjoin($ATOMIC_TEN, document.word_category(word), UNPROVIDED, UNPROVIDED), $INFO, com.cyc.cycjava.cycl.numeral_parser.number_value(document.word_string(word))));
            return word;
        }
    }

    public static SubLObject build_atomic_ten(final SubLObject fst) {
        final SubLObject word = finite_state_transducer.fst_output(fst).first();
        document.word_update(word, list($CATEGORY, adjoin($ATOMIC_TEN, document.word_category(word), UNPROVIDED, UNPROVIDED), $INFO, number_value(document.word_string(word))));
        return word;
    }

    public static final SubLObject build_hyphenated_non_atomic_ten_alt(SubLObject fst) {
        {
            SubLObject word = finite_state_transducer.fst_output(fst).first();
            document.word_update(word, list($CATEGORY, adjoin($NON_ATOMIC_TEN, document.word_category(word), UNPROVIDED, UNPROVIDED), $INFO, com.cyc.cycjava.cycl.numeral_parser.hyphenated_number_value(document.word_string(word))));
            return word;
        }
    }

    public static SubLObject build_hyphenated_non_atomic_ten(final SubLObject fst) {
        final SubLObject word = finite_state_transducer.fst_output(fst).first();
        document.word_update(word, list($CATEGORY, adjoin($NON_ATOMIC_TEN, document.word_category(word), UNPROVIDED, UNPROVIDED), $INFO, hyphenated_number_value(document.word_string(word))));
        return word;
    }

    public static final SubLObject build_non_atomic_ten_alt(SubLObject fst) {
        {
            SubLObject phrase = document.new_phrase(UNPROVIDED);
            SubLObject normalized_output = remove_if(symbol_function($sym114$HYPHEN_SIGN_), finite_state_transducer.fst_output(fst), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            document.phrase_update(phrase, list($CATEGORY, list($NON_ATOMIC_TEN), $STRING, string_utilities.bunge(Mapping.mapcar(symbol_function(SIGN_STRING), finite_state_transducer.fst_output(fst)), UNPROVIDED), $CONSTITUENTS, apply(symbol_function(VECTOR), finite_state_transducer.fst_output(fst)), $INFO, com.cyc.cycjava.cycl.numeral_parser.combine_number_values(document.sign_info(normalized_output.first()), $PLUS, document.sign_info(second(normalized_output)))));
            return phrase;
        }
    }

    public static SubLObject build_non_atomic_ten(final SubLObject fst) {
        final SubLObject phrase = document.new_phrase(UNPROVIDED);
        final SubLObject normalized_output = remove_if(symbol_function($sym114$HYPHEN_SIGN_), finite_state_transducer.fst_output(fst), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        document.phrase_update(phrase, list($CATEGORY, list($NON_ATOMIC_TEN), $STRING, string_utilities.bunge(Mapping.mapcar(symbol_function(SIGN_STRING), finite_state_transducer.fst_output(fst)), UNPROVIDED), $CONSTITUENTS, apply(symbol_function(VECTOR), finite_state_transducer.fst_output(fst)), $INFO, combine_number_values(document.sign_info(normalized_output.first()), $PLUS, document.sign_info(second(normalized_output)))));
        return phrase;
    }

    public static final SubLObject build_cent_alt(SubLObject fst) {
        {
            SubLObject sign = finite_state_transducer.fst_output(fst).first();
            document.sign_update(sign, list($CATEGORY, adjoin($CENT, document.sign_category(sign), UNPROVIDED, UNPROVIDED)));
            return sign;
        }
    }

    public static SubLObject build_cent(final SubLObject fst) {
        final SubLObject sign = finite_state_transducer.fst_output(fst).first();
        document.sign_update(sign, list($CATEGORY, adjoin($CENT, document.sign_category(sign), UNPROVIDED, UNPROVIDED)));
        return sign;
    }

    public static final SubLObject build_standard_hundred_alt(SubLObject fst) {
        {
            SubLObject phrase = document.new_phrase(UNPROVIDED);
            SubLObject normalized_output = remove_if(symbol_function($sym121$AND_LITERAL_), finite_state_transducer.fst_output(fst), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            document.phrase_update(phrase, list($CATEGORY, adjoin($STANDARD_HUNDRED, document.phrase_category(phrase), UNPROVIDED, UNPROVIDED), $STRING, string_utilities.bunge(Mapping.mapcar(symbol_function(SIGN_STRING), finite_state_transducer.fst_output(fst)), UNPROVIDED), $CONSTITUENTS, apply(symbol_function(VECTOR), finite_state_transducer.fst_output(fst)), $INFO, com.cyc.cycjava.cycl.numeral_parser.combine_number_values(com.cyc.cycjava.cycl.numeral_parser.combine_number_values(document.sign_info(normalized_output.first()), $TIMES, $int$100), $PLUS, NIL != document.sign_p(third(normalized_output)) ? ((SubLObject) (document.sign_info(third(normalized_output)))) : ZERO_INTEGER)));
            return phrase;
        }
    }

    public static SubLObject build_standard_hundred(final SubLObject fst) {
        final SubLObject phrase = document.new_phrase(UNPROVIDED);
        final SubLObject normalized_output = remove_if(symbol_function($sym121$AND_LITERAL_), finite_state_transducer.fst_output(fst), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        document.phrase_update(phrase, list($CATEGORY, adjoin($STANDARD_HUNDRED, document.phrase_category(phrase), UNPROVIDED, UNPROVIDED), $STRING, string_utilities.bunge(Mapping.mapcar(symbol_function(SIGN_STRING), finite_state_transducer.fst_output(fst)), UNPROVIDED), $CONSTITUENTS, apply(symbol_function(VECTOR), finite_state_transducer.fst_output(fst)), $INFO, combine_number_values(combine_number_values(document.sign_info(normalized_output.first()), $TIMES, $int$100), $PLUS, NIL != document.sign_p(third(normalized_output)) ? document.sign_info(third(normalized_output)) : ZERO_INTEGER)));
        return phrase;
    }

    /**
     *
     *
     * @unknown baxter
     */
    @LispMethod(comment = "@unknown baxter")
    public static final SubLObject build_a_few_alt(SubLObject fst) {
        {
            SubLObject phrase = document.new_phrase(UNPROVIDED);
            document.phrase_update(phrase, list($CATEGORY, adjoin($FUZZY, document.phrase_category(phrase), UNPROVIDED, UNPROVIDED), $STRING, string_utilities.bunge(Mapping.mapcar(symbol_function(SIGN_STRING), finite_state_transducer.fst_output(fst)), UNPROVIDED), $CONSTITUENTS, apply(symbol_function(VECTOR), finite_state_transducer.fst_output(fst)), $INFO, $$AFew_Quant));
            return phrase;
        }
    }

    /**
     *
     *
     * @unknown baxter
     */
    @LispMethod(comment = "@unknown baxter")
    public static SubLObject build_a_few(final SubLObject fst) {
        final SubLObject phrase = document.new_phrase(UNPROVIDED);
        document.phrase_update(phrase, list($CATEGORY, adjoin($FUZZY, document.phrase_category(phrase), UNPROVIDED, UNPROVIDED), $STRING, string_utilities.bunge(Mapping.mapcar(symbol_function(SIGN_STRING), finite_state_transducer.fst_output(fst)), UNPROVIDED), $CONSTITUENTS, apply(symbol_function(VECTOR), finite_state_transducer.fst_output(fst)), $INFO, $$AFew_Quant));
        return phrase;
    }

    public static final SubLObject build_extended_hundred_alt(SubLObject fst) {
        {
            SubLObject phrase = document.new_phrase(UNPROVIDED);
            SubLObject normalized_output = remove_if(symbol_function($sym121$AND_LITERAL_), finite_state_transducer.fst_output(fst), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            document.phrase_update(phrase, list($CATEGORY, adjoin($EXTENDED_HUNDRED, document.phrase_category(phrase), UNPROVIDED, UNPROVIDED), $STRING, string_utilities.bunge(Mapping.mapcar(symbol_function(SIGN_STRING), finite_state_transducer.fst_output(fst)), UNPROVIDED), $CONSTITUENTS, apply(symbol_function(VECTOR), finite_state_transducer.fst_output(fst)), $INFO, com.cyc.cycjava.cycl.numeral_parser.combine_number_values(com.cyc.cycjava.cycl.numeral_parser.combine_number_values(document.sign_info(normalized_output.first()), $TIMES, $int$100), $PLUS, NIL != document.sign_p(third(normalized_output)) ? ((SubLObject) (document.sign_info(third(normalized_output)))) : ZERO_INTEGER)));
            return phrase;
        }
    }

    public static SubLObject build_extended_hundred(final SubLObject fst) {
        final SubLObject phrase = document.new_phrase(UNPROVIDED);
        final SubLObject normalized_output = remove_if(symbol_function($sym121$AND_LITERAL_), finite_state_transducer.fst_output(fst), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        document.phrase_update(phrase, list($CATEGORY, adjoin($EXTENDED_HUNDRED, document.phrase_category(phrase), UNPROVIDED, UNPROVIDED), $STRING, string_utilities.bunge(Mapping.mapcar(symbol_function(SIGN_STRING), finite_state_transducer.fst_output(fst)), UNPROVIDED), $CONSTITUENTS, apply(symbol_function(VECTOR), finite_state_transducer.fst_output(fst)), $INFO, combine_number_values(combine_number_values(document.sign_info(normalized_output.first()), $TIMES, $int$100), $PLUS, NIL != document.sign_p(third(normalized_output)) ? document.sign_info(third(normalized_output)) : ZERO_INTEGER)));
        return phrase;
    }

    /**
     *
     *
     * @unknown baxter
     */
    @LispMethod(comment = "@unknown baxter")
    public static final SubLObject build_standard_dozen_alt(SubLObject fst) {
        {
            SubLObject phrase = document.new_phrase(UNPROVIDED);
            SubLObject normalized_output = remove_if(symbol_function($sym121$AND_LITERAL_), finite_state_transducer.fst_output(fst), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            document.phrase_update(phrase, list($CATEGORY, adjoin($STANDARD_DOZEN, document.phrase_category(phrase), UNPROVIDED, UNPROVIDED), $STRING, string_utilities.bunge(Mapping.mapcar(symbol_function(SIGN_STRING), finite_state_transducer.fst_output(fst)), UNPROVIDED), $CONSTITUENTS, apply(symbol_function(VECTOR), finite_state_transducer.fst_output(fst)), $INFO, com.cyc.cycjava.cycl.numeral_parser.combine_number_values(com.cyc.cycjava.cycl.numeral_parser.combine_number_values(document.sign_info(normalized_output.first()), $TIMES, TWELVE_INTEGER), $PLUS, NIL != document.sign_p(third(normalized_output)) ? ((SubLObject) (document.sign_info(third(normalized_output)))) : ZERO_INTEGER)));
            return phrase;
        }
    }

    /**
     *
     *
     * @unknown baxter
     */
    @LispMethod(comment = "@unknown baxter")
    public static SubLObject build_standard_dozen(final SubLObject fst) {
        final SubLObject phrase = document.new_phrase(UNPROVIDED);
        final SubLObject normalized_output = remove_if(symbol_function($sym121$AND_LITERAL_), finite_state_transducer.fst_output(fst), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        document.phrase_update(phrase, list($CATEGORY, adjoin($STANDARD_DOZEN, document.phrase_category(phrase), UNPROVIDED, UNPROVIDED), $STRING, string_utilities.bunge(Mapping.mapcar(symbol_function(SIGN_STRING), finite_state_transducer.fst_output(fst)), UNPROVIDED), $CONSTITUENTS, apply(symbol_function(VECTOR), finite_state_transducer.fst_output(fst)), $INFO, combine_number_values(combine_number_values(document.sign_info(normalized_output.first()), $TIMES, TWELVE_INTEGER), $PLUS, NIL != document.sign_p(third(normalized_output)) ? document.sign_info(third(normalized_output)) : ZERO_INTEGER)));
        return phrase;
    }

    /**
     *
     *
     * @unknown baxter
     */
    @LispMethod(comment = "@unknown baxter")
    public static final SubLObject build_extended_dozen_alt(SubLObject fst) {
        {
            SubLObject phrase = document.new_phrase(UNPROVIDED);
            SubLObject normalized_output = remove_if(symbol_function($sym121$AND_LITERAL_), finite_state_transducer.fst_output(fst), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            document.phrase_update(phrase, list($CATEGORY, adjoin($EXTENDED_DOZEN, document.phrase_category(phrase), UNPROVIDED, UNPROVIDED), $STRING, string_utilities.bunge(Mapping.mapcar(symbol_function(SIGN_STRING), finite_state_transducer.fst_output(fst)), UNPROVIDED), $CONSTITUENTS, apply(symbol_function(VECTOR), finite_state_transducer.fst_output(fst)), $INFO, com.cyc.cycjava.cycl.numeral_parser.combine_number_values(com.cyc.cycjava.cycl.numeral_parser.combine_number_values(document.sign_info(normalized_output.first()), $TIMES, TWELVE_INTEGER), $PLUS, NIL != document.sign_p(third(normalized_output)) ? ((SubLObject) (document.sign_info(third(normalized_output)))) : ZERO_INTEGER)));
            return phrase;
        }
    }

    /**
     *
     *
     * @unknown baxter
     */
    @LispMethod(comment = "@unknown baxter")
    public static SubLObject build_extended_dozen(final SubLObject fst) {
        final SubLObject phrase = document.new_phrase(UNPROVIDED);
        final SubLObject normalized_output = remove_if(symbol_function($sym121$AND_LITERAL_), finite_state_transducer.fst_output(fst), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        document.phrase_update(phrase, list($CATEGORY, adjoin($EXTENDED_DOZEN, document.phrase_category(phrase), UNPROVIDED, UNPROVIDED), $STRING, string_utilities.bunge(Mapping.mapcar(symbol_function(SIGN_STRING), finite_state_transducer.fst_output(fst)), UNPROVIDED), $CONSTITUENTS, apply(symbol_function(VECTOR), finite_state_transducer.fst_output(fst)), $INFO, combine_number_values(combine_number_values(document.sign_info(normalized_output.first()), $TIMES, TWELVE_INTEGER), $PLUS, NIL != document.sign_p(third(normalized_output)) ? document.sign_info(third(normalized_output)) : ZERO_INTEGER)));
        return phrase;
    }

    public static final SubLObject build_kilo_alt(SubLObject fst) {
        {
            SubLObject sign = finite_state_transducer.fst_output(fst).first();
            document.sign_update(sign, list($CATEGORY, adjoin($KILO, document.sign_category(sign), UNPROVIDED, UNPROVIDED)));
            return sign;
        }
    }

    public static SubLObject build_kilo(final SubLObject fst) {
        final SubLObject sign = finite_state_transducer.fst_output(fst).first();
        document.sign_update(sign, list($CATEGORY, adjoin($KILO, document.sign_category(sign), UNPROVIDED, UNPROVIDED)));
        return sign;
    }

    public static final SubLObject build_thousand_alt(SubLObject fst) {
        {
            SubLObject phrase = document.new_phrase(UNPROVIDED);
            SubLObject normalized_output = remove_if(symbol_function($sym121$AND_LITERAL_), finite_state_transducer.fst_output(fst), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            document.phrase_update(phrase, list($CATEGORY, adjoin($THOUSAND, document.phrase_category(phrase), UNPROVIDED, UNPROVIDED), $STRING, string_utilities.bunge(Mapping.mapcar(symbol_function(SIGN_STRING), finite_state_transducer.fst_output(fst)), UNPROVIDED), $CONSTITUENTS, apply(symbol_function(VECTOR), finite_state_transducer.fst_output(fst)), $INFO, com.cyc.cycjava.cycl.numeral_parser.combine_number_values(com.cyc.cycjava.cycl.numeral_parser.combine_number_values(document.sign_info(normalized_output.first()), $TIMES, $int$1000), $PLUS, NIL != document.sign_p(third(normalized_output)) ? ((SubLObject) (document.sign_info(third(normalized_output)))) : ZERO_INTEGER)));
            return phrase;
        }
    }

    public static SubLObject build_thousand(final SubLObject fst) {
        final SubLObject phrase = document.new_phrase(UNPROVIDED);
        final SubLObject normalized_output = remove_if(symbol_function($sym121$AND_LITERAL_), finite_state_transducer.fst_output(fst), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        document.phrase_update(phrase, list($CATEGORY, adjoin($THOUSAND, document.phrase_category(phrase), UNPROVIDED, UNPROVIDED), $STRING, string_utilities.bunge(Mapping.mapcar(symbol_function(SIGN_STRING), finite_state_transducer.fst_output(fst)), UNPROVIDED), $CONSTITUENTS, apply(symbol_function(VECTOR), finite_state_transducer.fst_output(fst)), $INFO, combine_number_values(combine_number_values(document.sign_info(normalized_output.first()), $TIMES, $int$1000), $PLUS, NIL != document.sign_p(third(normalized_output)) ? document.sign_info(third(normalized_output)) : ZERO_INTEGER)));
        return phrase;
    }

    public static final SubLObject build_milli_alt(SubLObject fst) {
        {
            SubLObject sign = finite_state_transducer.fst_output(fst).first();
            document.sign_update(sign, list($CATEGORY, adjoin($MILLI, document.sign_category(sign), UNPROVIDED, UNPROVIDED)));
            return sign;
        }
    }

    public static SubLObject build_milli(final SubLObject fst) {
        final SubLObject sign = finite_state_transducer.fst_output(fst).first();
        document.sign_update(sign, list($CATEGORY, adjoin($MILLI, document.sign_category(sign), UNPROVIDED, UNPROVIDED)));
        return sign;
    }

    public static final SubLObject build_million_alt(SubLObject fst) {
        {
            SubLObject phrase = document.new_phrase(UNPROVIDED);
            SubLObject normalized_output = remove_if(symbol_function($sym121$AND_LITERAL_), finite_state_transducer.fst_output(fst), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            document.phrase_update(phrase, list($CATEGORY, adjoin($MILLION, document.phrase_category(phrase), UNPROVIDED, UNPROVIDED), $STRING, string_utilities.bunge(Mapping.mapcar(symbol_function(SIGN_STRING), finite_state_transducer.fst_output(fst)), UNPROVIDED), $CONSTITUENTS, apply(symbol_function(VECTOR), finite_state_transducer.fst_output(fst)), $INFO, com.cyc.cycjava.cycl.numeral_parser.combine_number_values(com.cyc.cycjava.cycl.numeral_parser.combine_number_values(document.sign_info(normalized_output.first()), $TIMES, $int$1000000), $PLUS, NIL != document.sign_p(third(normalized_output)) ? ((SubLObject) (document.sign_info(third(normalized_output)))) : ZERO_INTEGER)));
            return phrase;
        }
    }

    public static SubLObject build_million(final SubLObject fst) {
        final SubLObject phrase = document.new_phrase(UNPROVIDED);
        final SubLObject normalized_output = remove_if(symbol_function($sym121$AND_LITERAL_), finite_state_transducer.fst_output(fst), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        document.phrase_update(phrase, list($CATEGORY, adjoin($MILLION, document.phrase_category(phrase), UNPROVIDED, UNPROVIDED), $STRING, string_utilities.bunge(Mapping.mapcar(symbol_function(SIGN_STRING), finite_state_transducer.fst_output(fst)), UNPROVIDED), $CONSTITUENTS, apply(symbol_function(VECTOR), finite_state_transducer.fst_output(fst)), $INFO, combine_number_values(combine_number_values(document.sign_info(normalized_output.first()), $TIMES, $int$1000000), $PLUS, NIL != document.sign_p(third(normalized_output)) ? document.sign_info(third(normalized_output)) : ZERO_INTEGER)));
        return phrase;
    }

    public static final SubLObject build_billi_alt(SubLObject fst) {
        {
            SubLObject sign = finite_state_transducer.fst_output(fst).first();
            document.sign_update(sign, list($CATEGORY, adjoin($BILLI, document.sign_category(sign), UNPROVIDED, UNPROVIDED)));
            return sign;
        }
    }

    public static SubLObject build_billi(final SubLObject fst) {
        final SubLObject sign = finite_state_transducer.fst_output(fst).first();
        document.sign_update(sign, list($CATEGORY, adjoin($BILLI, document.sign_category(sign), UNPROVIDED, UNPROVIDED)));
        return sign;
    }

    public static final SubLObject build_billion_alt(SubLObject fst) {
        {
            SubLObject phrase = document.new_phrase(UNPROVIDED);
            SubLObject normalized_output = remove_if(symbol_function($sym121$AND_LITERAL_), finite_state_transducer.fst_output(fst), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            document.phrase_update(phrase, list($CATEGORY, adjoin($BILLION, document.phrase_category(phrase), UNPROVIDED, UNPROVIDED), $STRING, string_utilities.bunge(Mapping.mapcar(symbol_function(SIGN_STRING), finite_state_transducer.fst_output(fst)), UNPROVIDED), $CONSTITUENTS, apply(symbol_function(VECTOR), finite_state_transducer.fst_output(fst)), $INFO, com.cyc.cycjava.cycl.numeral_parser.combine_number_values(com.cyc.cycjava.cycl.numeral_parser.combine_number_values(document.sign_info(normalized_output.first()), $TIMES, $int$1000000000), $PLUS, NIL != document.sign_p(third(normalized_output)) ? ((SubLObject) (document.sign_info(third(normalized_output)))) : ZERO_INTEGER)));
            return phrase;
        }
    }

    public static SubLObject build_billion(final SubLObject fst) {
        final SubLObject phrase = document.new_phrase(UNPROVIDED);
        final SubLObject normalized_output = remove_if(symbol_function($sym121$AND_LITERAL_), finite_state_transducer.fst_output(fst), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        document.phrase_update(phrase, list($CATEGORY, adjoin($BILLION, document.phrase_category(phrase), UNPROVIDED, UNPROVIDED), $STRING, string_utilities.bunge(Mapping.mapcar(symbol_function(SIGN_STRING), finite_state_transducer.fst_output(fst)), UNPROVIDED), $CONSTITUENTS, apply(symbol_function(VECTOR), finite_state_transducer.fst_output(fst)), $INFO, combine_number_values(combine_number_values(document.sign_info(normalized_output.first()), $TIMES, $int$1000000000), $PLUS, NIL != document.sign_p(third(normalized_output)) ? document.sign_info(third(normalized_output)) : ZERO_INTEGER)));
        return phrase;
    }

    public static final SubLObject build_trilli_alt(SubLObject fst) {
        {
            SubLObject sign = finite_state_transducer.fst_output(fst).first();
            document.sign_update(sign, list($CATEGORY, adjoin($TRILLI, document.sign_category(sign), UNPROVIDED, UNPROVIDED)));
            return sign;
        }
    }

    public static SubLObject build_trilli(final SubLObject fst) {
        final SubLObject sign = finite_state_transducer.fst_output(fst).first();
        document.sign_update(sign, list($CATEGORY, adjoin($TRILLI, document.sign_category(sign), UNPROVIDED, UNPROVIDED)));
        return sign;
    }

    public static final SubLObject build_trillion_alt(SubLObject fst) {
        {
            SubLObject phrase = document.new_phrase(UNPROVIDED);
            SubLObject normalized_output = remove_if(symbol_function($sym121$AND_LITERAL_), finite_state_transducer.fst_output(fst), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            document.phrase_update(phrase, list($CATEGORY, adjoin($TRILLION, document.phrase_category(phrase), UNPROVIDED, UNPROVIDED), $STRING, string_utilities.bunge(Mapping.mapcar(symbol_function(SIGN_STRING), finite_state_transducer.fst_output(fst)), UNPROVIDED), $CONSTITUENTS, apply(symbol_function(VECTOR), finite_state_transducer.fst_output(fst)), $INFO, com.cyc.cycjava.cycl.numeral_parser.combine_number_values(com.cyc.cycjava.cycl.numeral_parser.combine_number_values(document.sign_info(normalized_output.first()), $TIMES, $int$1000000000000), $PLUS, NIL != document.sign_p(third(normalized_output)) ? ((SubLObject) (document.sign_info(third(normalized_output)))) : ZERO_INTEGER)));
            return phrase;
        }
    }

    public static SubLObject build_trillion(final SubLObject fst) {
        final SubLObject phrase = document.new_phrase(UNPROVIDED);
        final SubLObject normalized_output = remove_if(symbol_function($sym121$AND_LITERAL_), finite_state_transducer.fst_output(fst), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        document.phrase_update(phrase, list($CATEGORY, adjoin($TRILLION, document.phrase_category(phrase), UNPROVIDED, UNPROVIDED), $STRING, string_utilities.bunge(Mapping.mapcar(symbol_function(SIGN_STRING), finite_state_transducer.fst_output(fst)), UNPROVIDED), $CONSTITUENTS, apply(symbol_function(VECTOR), finite_state_transducer.fst_output(fst)), $INFO, combine_number_values(combine_number_values(document.sign_info(normalized_output.first()), $TIMES, $int$1000000000000), $PLUS, NIL != document.sign_p(third(normalized_output)) ? document.sign_info(third(normalized_output)) : ZERO_INTEGER)));
        return phrase;
    }

    public static final SubLObject build_integer_alt(SubLObject fst) {
        {
            SubLObject sign = finite_state_transducer.fst_output(fst).first();
            document.sign_update(sign, list($CATEGORY, adjoin($INTEGER, document.sign_category(sign), UNPROVIDED, UNPROVIDED)));
            return sign;
        }
    }

    public static SubLObject build_integer(final SubLObject fst) {
        final SubLObject sign = finite_state_transducer.fst_output(fst).first();
        document.sign_update(sign, list($CATEGORY, adjoin($INTEGER, document.sign_category(sign), UNPROVIDED, UNPROVIDED)));
        return sign;
    }

    public static final SubLObject build_number_alt(SubLObject fst) {
        {
            SubLObject sign = finite_state_transducer.fst_output(fst).first();
            document.sign_update(sign, list($CATEGORY, adjoin($NUMBER, document.sign_category(sign), UNPROVIDED, UNPROVIDED)));
            return sign;
        }
    }

    public static SubLObject build_number(final SubLObject fst) {
        final SubLObject sign = finite_state_transducer.fst_output(fst).first();
        document.sign_update(sign, list($CATEGORY, adjoin($NUMBER, document.sign_category(sign), UNPROVIDED, UNPROVIDED)));
        return sign;
    }

    public static final SubLObject build_fraction_alt(SubLObject fst) {
        {
            SubLObject phrase = document.new_phrase(UNPROVIDED);
            document.phrase_update(phrase, list($CATEGORY, adjoin($FRACTION, document.phrase_category(phrase), UNPROVIDED, UNPROVIDED), $STRING, string_utilities.bunge(Mapping.mapcar(symbol_function(SIGN_STRING), finite_state_transducer.fst_output(fst)), UNPROVIDED), $CONSTITUENTS, apply(symbol_function(VECTOR), finite_state_transducer.fst_output(fst)), $INFO, com.cyc.cycjava.cycl.numeral_parser.combine_number_values(document.sign_info(finite_state_transducer.fst_output(fst).first()), $DIVIDEDBY, document.sign_info(second(finite_state_transducer.fst_output(fst))))));
            return phrase;
        }
    }

    public static SubLObject build_fraction(final SubLObject fst) {
        final SubLObject phrase = document.new_phrase(UNPROVIDED);
        document.phrase_update(phrase, list($CATEGORY, adjoin($FRACTION, document.phrase_category(phrase), UNPROVIDED, UNPROVIDED), $STRING, string_utilities.bunge(Mapping.mapcar(symbol_function(SIGN_STRING), finite_state_transducer.fst_output(fst)), UNPROVIDED), $CONSTITUENTS, apply(symbol_function(VECTOR), finite_state_transducer.fst_output(fst)), $INFO, combine_number_values(document.sign_info(finite_state_transducer.fst_output(fst).first()), $DIVIDEDBY, document.sign_info(second(finite_state_transducer.fst_output(fst))))));
        return phrase;
    }

    public static final SubLObject build_half_alt(SubLObject fst) {
        {
            SubLObject sign = finite_state_transducer.fst_output(fst).first();
            document.sign_update(sign, list($CATEGORY, adjoin($NUMBER, document.sign_category(sign), UNPROVIDED, UNPROVIDED), $INFO, $float$0_5));
            return sign;
        }
    }

    public static SubLObject build_half(final SubLObject fst) {
        final SubLObject sign = finite_state_transducer.fst_output(fst).first();
        document.sign_update(sign, list($CATEGORY, adjoin($NUMBER, document.sign_category(sign), UNPROVIDED, UNPROVIDED), $INFO, $float$0_5));
        return sign;
    }

    public static final SubLObject build_float_alt(SubLObject fst) {
        {
            SubLObject output = finite_state_transducer.fst_output(fst);
            SubLObject phrase = document.new_phrase(UNPROVIDED);
            document.phrase_update(phrase, list($CATEGORY, adjoin($FLOAT, document.phrase_category(phrase), UNPROVIDED, UNPROVIDED), $STRING, string_utilities.bunge(Mapping.mapcar(symbol_function(SIGN_STRING), output), UNPROVIDED), $CONSTITUENTS, apply(symbol_function(VECTOR), output), $INFO, com.cyc.cycjava.cycl.numeral_parser.combine_number_values(document.sign_info(output.first()), $PLUS, document.sign_info(third(output)))));
            return phrase;
        }
    }

    public static SubLObject build_float(final SubLObject fst) {
        final SubLObject output = finite_state_transducer.fst_output(fst);
        final SubLObject phrase = document.new_phrase(UNPROVIDED);
        document.phrase_update(phrase, list($CATEGORY, adjoin($FLOAT, document.phrase_category(phrase), UNPROVIDED, UNPROVIDED), $STRING, string_utilities.bunge(Mapping.mapcar(symbol_function(SIGN_STRING), output), UNPROVIDED), $CONSTITUENTS, apply(symbol_function(VECTOR), output), $INFO, combine_number_values(document.sign_info(output.first()), $PLUS, document.sign_info(third(output)))));
        return phrase;
    }

    public static final SubLObject build_negative_number_alt(SubLObject fst) {
        {
            SubLObject phrase = document.new_phrase(UNPROVIDED);
            document.phrase_update(phrase, list($CATEGORY, adjoin($NUMBER, document.phrase_category(phrase), UNPROVIDED, UNPROVIDED), $STRING, string_utilities.bunge(Mapping.mapcar(symbol_function(SIGN_STRING), finite_state_transducer.fst_output(fst)), UNPROVIDED), $CONSTITUENTS, apply(symbol_function(VECTOR), finite_state_transducer.fst_output(fst)), $INFO, minus(document.sign_info(second(finite_state_transducer.fst_output(fst))))));
            return phrase;
        }
    }

    public static SubLObject build_negative_number(final SubLObject fst) {
        final SubLObject phrase = document.new_phrase(UNPROVIDED);
        document.phrase_update(phrase, list($CATEGORY, adjoin($NUMBER, document.phrase_category(phrase), UNPROVIDED, UNPROVIDED), $STRING, string_utilities.bunge(Mapping.mapcar(symbol_function(SIGN_STRING), finite_state_transducer.fst_output(fst)), UNPROVIDED), $CONSTITUENTS, apply(symbol_function(VECTOR), finite_state_transducer.fst_output(fst)), $INFO, minus(document.sign_info(second(finite_state_transducer.fst_output(fst))))));
        return phrase;
    }

    public static final SubLObject build_proper_interval_alt(SubLObject fst) {
        {
            SubLObject phrase = document.new_phrase(UNPROVIDED);
            document.phrase_update(phrase, list($CATEGORY, adjoin($PROPER_INTERVAL, document.phrase_category(phrase), UNPROVIDED, UNPROVIDED), $STRING, string_utilities.bunge(Mapping.mapcar(symbol_function(SIGN_STRING), finite_state_transducer.fst_output(fst)), UNPROVIDED), $CONSTITUENTS, apply(symbol_function(VECTOR), finite_state_transducer.fst_output(fst)), $INFO, cons($$Unity, Sort.sort(delete_if(symbol_function(NULL), Mapping.mapcar(symbol_function(SIGN_INFO), finite_state_transducer.fst_output(fst)), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED), symbol_function($sym184$_), UNPROVIDED))));
            return phrase;
        }
    }

    public static SubLObject build_proper_interval(final SubLObject fst) {
        final SubLObject phrase = document.new_phrase(UNPROVIDED);
        document.phrase_update(phrase, list($CATEGORY, adjoin($PROPER_INTERVAL, document.phrase_category(phrase), UNPROVIDED, UNPROVIDED), $STRING, string_utilities.bunge(Mapping.mapcar(symbol_function(SIGN_STRING), finite_state_transducer.fst_output(fst)), UNPROVIDED), $CONSTITUENTS, apply(symbol_function(VECTOR), finite_state_transducer.fst_output(fst)), $INFO, cons($$Unity, Sort.sort(delete_if(symbol_function(NULL), Mapping.mapcar(symbol_function(SIGN_INFO), finite_state_transducer.fst_output(fst)), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED), symbol_function($sym184$_), UNPROVIDED))));
        return phrase;
    }

    public static final SubLObject build_interval_alt(SubLObject fst) {
        {
            SubLObject sign = finite_state_transducer.fst_output(fst).first();
            document.sign_update(sign, list($CATEGORY, adjoin($INTERVAL, document.sign_category(sign), UNPROVIDED, UNPROVIDED)));
            return sign;
        }
    }

    public static SubLObject build_interval(final SubLObject fst) {
        final SubLObject sign = finite_state_transducer.fst_output(fst).first();
        document.sign_update(sign, list($CATEGORY, adjoin($INTERVAL, document.sign_category(sign), UNPROVIDED, UNPROVIDED)));
        return sign;
    }

    /**
     *
     *
     * @param SEQUENCE
    sequencep
     * 		
     * @return sequence; a version of SEQUENCE that has possibly been destructively
    modified by tagging certain lexical items with their category
     */
    @LispMethod(comment = "@param SEQUENCE\nsequencep\r\n\t\t\r\n@return sequence; a version of SEQUENCE that has possibly been destructively\r\nmodified by tagging certain lexical items with their category")
    public static final SubLObject lex_numerals_alt(SubLObject sequence) {
        SubLTrampolineFile.checkType(sequence, SEQUENCEP);
        {
            SubLObject vector_var = sequence;
            SubLObject backwardP_var = NIL;
            SubLObject length = length(vector_var);
            SubLObject v_iteration = NIL;
            for (v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = add(v_iteration, ONE_INTEGER)) {
                {
                    SubLObject element_num = (NIL != backwardP_var) ? ((SubLObject) (subtract(length, v_iteration, ONE_INTEGER))) : v_iteration;
                    SubLObject word = aref(vector_var, element_num);
                    if (NIL != number_utilities.number_string_p(document.word_string(word))) {
                        document.word_update(word, list($CATEGORY, list($NUMBER), $INFO, number_utilities.number_string_value(document.word_string(word))));
                    } else {
                        if (NIL != Strings.stringE(document.word_string(word), $str_alt197$_, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED)) {
                            document.word_update(word, list($CATEGORY, list($MULT)));
                        } else {
                            if (NIL != Strings.stringE(document.word_string(word), $str_alt198$_, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED)) {
                                document.word_update(word, list($CATEGORY, list($EXPT)));
                            }
                        }
                    }
                }
            }
        }
        return sequence;
    }

    /**
     *
     *
     * @param SEQUENCE
    sequencep
     * 		
     * @return sequence; a version of SEQUENCE that has possibly been destructively
    modified by tagging certain lexical items with their category
     */
    @LispMethod(comment = "@param SEQUENCE\nsequencep\r\n\t\t\r\n@return sequence; a version of SEQUENCE that has possibly been destructively\r\nmodified by tagging certain lexical items with their category")
    public static SubLObject lex_numerals(final SubLObject sequence) {
        assert NIL != sequencep(sequence) : "! sequencep(sequence) " + ("Types.sequencep(sequence) " + "CommonSymbols.NIL != Types.sequencep(sequence) ") + sequence;
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

    public static final SubLObject build_exponentiation_phrase_alt(SubLObject fst) {
        {
            SubLObject phrase = document.new_phrase(UNPROVIDED);
            document.phrase_update(phrase, list($CATEGORY, list($EXPONENTIATION), $STRING, string_utilities.bunge(Mapping.mapcar(symbol_function(SIGN_STRING), finite_state_transducer.fst_output(fst)), UNPROVIDED), $CONSTITUENTS, apply(symbol_function(VECTOR), finite_state_transducer.fst_output(fst)), $INFO, com.cyc.cycjava.cycl.numeral_parser.combine_number_values(document.sign_info(finite_state_transducer.fst_output(fst).first()), $TOTHE, document.sign_info(third(finite_state_transducer.fst_output(fst))))));
            return phrase;
        }
    }

    public static SubLObject build_exponentiation_phrase(final SubLObject fst) {
        final SubLObject phrase = document.new_phrase(UNPROVIDED);
        document.phrase_update(phrase, list($CATEGORY, list($EXPONENTIATION), $STRING, string_utilities.bunge(Mapping.mapcar(symbol_function(SIGN_STRING), finite_state_transducer.fst_output(fst)), UNPROVIDED), $CONSTITUENTS, apply(symbol_function(VECTOR), finite_state_transducer.fst_output(fst)), $INFO, combine_number_values(document.sign_info(finite_state_transducer.fst_output(fst).first()), $TOTHE, document.sign_info(third(finite_state_transducer.fst_output(fst))))));
        return phrase;
    }

    public static final SubLObject build_multiplication_phrase_alt(SubLObject fst) {
        {
            SubLObject phrase = document.new_phrase(UNPROVIDED);
            document.phrase_update(phrase, list($CATEGORY, list($NUMBER), $STRING, string_utilities.bunge(Mapping.mapcar(symbol_function(SIGN_STRING), finite_state_transducer.fst_output(fst)), UNPROVIDED), $CONSTITUENTS, apply(symbol_function(VECTOR), finite_state_transducer.fst_output(fst)), $INFO, com.cyc.cycjava.cycl.numeral_parser.combine_number_values(document.sign_info(finite_state_transducer.fst_output(fst).first()), $TIMES, document.sign_info(third(finite_state_transducer.fst_output(fst))))));
            return phrase;
        }
    }

    public static SubLObject build_multiplication_phrase(final SubLObject fst) {
        final SubLObject phrase = document.new_phrase(UNPROVIDED);
        document.phrase_update(phrase, list($CATEGORY, list($NUMBER), $STRING, string_utilities.bunge(Mapping.mapcar(symbol_function(SIGN_STRING), finite_state_transducer.fst_output(fst)), UNPROVIDED), $CONSTITUENTS, apply(symbol_function(VECTOR), finite_state_transducer.fst_output(fst)), $INFO, combine_number_values(document.sign_info(finite_state_transducer.fst_output(fst).first()), $TIMES, document.sign_info(third(finite_state_transducer.fst_output(fst))))));
        return phrase;
    }

    public static final SubLObject string_to_interval_alt(SubLObject string) {
        {
            SubLObject caching_state = $string_to_interval_caching_state$.getGlobalValue();
            if (NIL == caching_state) {
                caching_state = memoization_state.create_global_caching_state_for_name(STRING_TO_INTERVAL, $string_to_interval_caching_state$, $int$256, EQUAL, ONE_INTEGER, ZERO_INTEGER);
            }
            {
                SubLObject results = memoization_state.caching_state_lookup(caching_state, string, $kw212$_MEMOIZED_ITEM_NOT_FOUND_);
                if (results == $kw212$_MEMOIZED_ITEM_NOT_FOUND_) {
                    results = arg2(resetMultipleValues(), multiple_value_list(com.cyc.cycjava.cycl.numeral_parser.string_to_interval_internal(string)));
                    memoization_state.caching_state_put(caching_state, string, results, UNPROVIDED);
                }
                return memoization_state.caching_results(results);
            }
        }
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
        assert NIL != stringp(string) : "! stringp(string) " + ("Types.stringp(string) " + "CommonSymbols.NIL != Types.stringp(string) ") + string;
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

    public static final SubLObject numeric_interval_term_from_fscp_result_alt(SubLObject fscp_result) {
        if (NIL != list_utilities.lengthE(fscp_result, ONE_INTEGER, UNPROVIDED)) {
            {
                SubLObject first_fscp_result = elt(fscp_result, ZERO_INTEGER);
                return (NIL != document.sign_info(first_fscp_result)) && (NIL != com.cyc.cycjava.cycl.numeral_parser.interval_signP(first_fscp_result)) ? ((SubLObject) (document.sign_info(first_fscp_result))) : NIL;
            }
        }
        return NIL;
    }

    public static SubLObject numeric_interval_term_from_fscp_result(final SubLObject fscp_result) {
        if (NIL != list_utilities.lengthE(fscp_result, ONE_INTEGER, UNPROVIDED)) {
            final SubLObject first_fscp_result = elt(fscp_result, ZERO_INTEGER);
            return (NIL != document.sign_info(first_fscp_result)) && (NIL != interval_signP(first_fscp_result)) ? document.sign_info(first_fscp_result) : NIL;
        }
        return NIL;
    }

    /**
     *
     *
     * @param STRING
    stringp
     * 		
     * @return boolean; non-nil if STRING can be interpreted as a number
    and nil otherwise
     */
    @LispMethod(comment = "@param STRING\nstringp\r\n\t\t\r\n@return boolean; non-nil if STRING can be interpreted as a number\r\nand nil otherwise")
    public static final SubLObject interval_stringP_alt(SubLObject string) {
        SubLTrampolineFile.checkType(string, STRINGP);
        return com.cyc.cycjava.cycl.numeral_parser.string_to_interval(string);
    }

    /**
     *
     *
     * @param STRING
    stringp
     * 		
     * @return boolean; non-nil if STRING can be interpreted as a number
    and nil otherwise
     */
    @LispMethod(comment = "@param STRING\nstringp\r\n\t\t\r\n@return boolean; non-nil if STRING can be interpreted as a number\r\nand nil otherwise")
    public static SubLObject interval_stringP(final SubLObject string) {
        assert NIL != stringp(string) : "! stringp(string) " + ("Types.stringp(string) " + "CommonSymbols.NIL != Types.stringp(string) ") + string;
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

    public static final SubLObject declare_numeral_parser_file_alt() {
        declareFunction("standardize_number_string", "STANDARDIZE-NUMBER-STRING", 1, 1, false);
        declareFunction("initialize_number_values", "INITIALIZE-NUMBER-VALUES", 0, 0, false);
        declareFunction("number_value", "NUMBER-VALUE", 1, 0, false);
        declareFunction("number_string_signP", "NUMBER-STRING-SIGN?", 1, 0, false);
        declareFunction("hyphenated_number_value", "HYPHENATED-NUMBER-VALUE", 1, 0, false);
        declareFunction("combine_number_values", "COMBINE-NUMBER-VALUES", 3, 0, false);
        declareFunction("numeral_parser_max_significant_digits", "NUMERAL-PARSER-MAX-SIGNIFICANT-DIGITS", 2, 0, false);
        declareFunction("numeral_parser_significant_digits", "NUMERAL-PARSER-SIGNIFICANT-DIGITS", 1, 0, false);
        declareFunction("combine_cycl_number_values", "COMBINE-CYCL-NUMBER-VALUES", 3, 0, false);
        declareFunction("combine_non_cycl_number_values", "COMBINE-NON-CYCL-NUMBER-VALUES", 3, 0, false);
        declareFunction("numeral_parser_stringE", "NUMERAL-PARSER-STRING=", 2, 0, false);
        new com.cyc.cycjava.cycl.numeral_parser.$numeral_parser_stringE$BinaryFunction();
        declareFunction("numeral_parser_charE", "NUMERAL-PARSER-CHAR=", 2, 0, false);
        declareFunction("zero_literalP", "ZERO-LITERAL?", 1, 0, false);
        declareFunction("indefinite_signP", "INDEFINITE-SIGN?", 1, 0, false);
        declareFunction("atomic_ten_signP", "ATOMIC-TEN-SIGN?", 1, 0, false);
        declareFunction("digit_signP", "DIGIT-SIGN?", 1, 0, false);
        declareFunction("deci_signP", "DECI-SIGN?", 1, 0, false);
        declareFunction("hyphen_signP", "HYPHEN-SIGN?", 1, 0, false);
        declareFunction("teen_signP", "TEEN-SIGN?", 1, 0, false);
        declareFunction("fuzzy_signP", "FUZZY-SIGN?", 1, 0, false);
        declareFunction("non_atomic_ten_signP", "NON-ATOMIC-TEN-SIGN?", 1, 0, false);
        declareFunction("hyphenated_non_atomic_ten_signP", "HYPHENATED-NON-ATOMIC-TEN-SIGN?", 1, 0, false);
        declareFunction("cent_signP", "CENT-SIGN?", 1, 0, false);
        declareFunction("kilo_signP", "KILO-SIGN?", 1, 0, false);
        declareFunction("fraction_signP", "FRACTION-SIGN?", 1, 0, false);
        declareFunction("float_signP", "FLOAT-SIGN?", 1, 0, false);
        declareFunction("number_signP", "NUMBER-SIGN?", 1, 0, false);
        declareFunction("interval_signP", "INTERVAL-SIGN?", 1, 0, false);
        declareFunction("proper_interval_signP", "PROPER-INTERVAL-SIGN?", 1, 0, false);
        declareFunction("milli_signP", "MILLI-SIGN?", 1, 0, false);
        declareFunction("billi_signP", "BILLI-SIGN?", 1, 0, false);
        declareFunction("trilli_signP", "TRILLI-SIGN?", 1, 0, false);
        declareFunction("integer_signP", "INTEGER-SIGN?", 1, 0, false);
        declareFunction("extended_dozen_signP", "EXTENDED-DOZEN-SIGN?", 1, 0, false);
        declareFunction("standard_dozen_signP", "STANDARD-DOZEN-SIGN?", 1, 0, false);
        declareFunction("extended_hundred_signP", "EXTENDED-HUNDRED-SIGN?", 1, 0, false);
        declareFunction("standard_hundred_signP", "STANDARD-HUNDRED-SIGN?", 1, 0, false);
        declareFunction("thousand_signP", "THOUSAND-SIGN?", 1, 0, false);
        declareFunction("million_signP", "MILLION-SIGN?", 1, 0, false);
        declareFunction("billion_signP", "BILLION-SIGN?", 1, 0, false);
        declareFunction("trillion_signP", "TRILLION-SIGN?", 1, 0, false);
        declareFunction("and_literalP", "AND-LITERAL?", 1, 0, false);
        declareFunction("indefinite_literalP", "INDEFINITE-LITERAL?", 1, 0, false);
        declareFunction("dozen_literalP", "DOZEN-LITERAL?", 1, 0, false);
        declareFunction("few_literalP", "FEW-LITERAL?", 1, 0, false);
        declareFunction("hundred_literalP", "HUNDRED-LITERAL?", 1, 0, false);
        declareFunction("thousand_literalP", "THOUSAND-LITERAL?", 1, 0, false);
        declareFunction("million_literalP", "MILLION-LITERAL?", 1, 0, false);
        declareFunction("millions_literalP", "MILLIONS-LITERAL?", 1, 0, false);
        declareFunction("billions_literalP", "BILLIONS-LITERAL?", 1, 0, false);
        declareFunction("billion_literalP", "BILLION-LITERAL?", 1, 0, false);
        declareFunction("trillions_literalP", "TRILLIONS-LITERAL?", 1, 0, false);
        declareFunction("trillion_literalP", "TRILLION-LITERAL?", 1, 0, false);
        declareFunction("first_literalP", "FIRST-LITERAL?", 1, 0, false);
        declareFunction("second_literalP", "SECOND-LITERAL?", 1, 0, false);
        declareFunction("seconds_literalP", "SECONDS-LITERAL?", 1, 0, false);
        declareFunction("atomic_denominator_literalP", "ATOMIC-DENOMINATOR-LITERAL?", 1, 0, false);
        declareFunction("denominator_literalP", "DENOMINATOR-LITERAL?", 1, 0, false);
        declareFunction("denominator_signP", "DENOMINATOR-SIGN?", 1, 0, false);
        declareFunction("half_signP", "HALF-SIGN?", 1, 0, false);
        declareFunction("minus_literalP", "MINUS-LITERAL?", 1, 0, false);
        declareFunction("to_literalP", "TO-LITERAL?", 1, 0, false);
        declareFunction("from_literalP", "FROM-LITERAL?", 1, 0, false);
        declareFunction("between_literalP", "BETWEEN-LITERAL?", 1, 0, false);
        declareFunction("mult_signP", "MULT-SIGN?", 1, 0, false);
        declareFunction("expt_operator_signP", "EXPT-OPERATOR-SIGN?", 1, 0, false);
        declareFunction("exponentiation_signP", "EXPONENTIATION-SIGN?", 1, 0, false);
        declareFunction("minus_signP", "MINUS-SIGN?", 1, 0, false);
        declareFunction("plus_signP", "PLUS-SIGN?", 1, 0, false);
        declareFunction("build_denominator", "BUILD-DENOMINATOR", 1, 0, false);
        declareFunction("build_zero", "BUILD-ZERO", 1, 0, false);
        declareFunction("build_indefinite", "BUILD-INDEFINITE", 1, 0, false);
        declareFunction("build_deci", "BUILD-DECI", 1, 0, false);
        declareFunction("build_teen", "BUILD-TEEN", 1, 0, false);
        declareFunction("build_fuzzy", "BUILD-FUZZY", 1, 0, false);
        declareFunction("build_atomic_ten", "BUILD-ATOMIC-TEN", 1, 0, false);
        declareFunction("build_hyphenated_non_atomic_ten", "BUILD-HYPHENATED-NON-ATOMIC-TEN", 1, 0, false);
        declareFunction("build_non_atomic_ten", "BUILD-NON-ATOMIC-TEN", 1, 0, false);
        declareFunction("build_cent", "BUILD-CENT", 1, 0, false);
        declareFunction("build_standard_hundred", "BUILD-STANDARD-HUNDRED", 1, 0, false);
        declareFunction("build_a_few", "BUILD-A-FEW", 1, 0, false);
        declareFunction("build_extended_hundred", "BUILD-EXTENDED-HUNDRED", 1, 0, false);
        declareFunction("build_standard_dozen", "BUILD-STANDARD-DOZEN", 1, 0, false);
        declareFunction("build_extended_dozen", "BUILD-EXTENDED-DOZEN", 1, 0, false);
        declareFunction("build_kilo", "BUILD-KILO", 1, 0, false);
        declareFunction("build_thousand", "BUILD-THOUSAND", 1, 0, false);
        declareFunction("build_milli", "BUILD-MILLI", 1, 0, false);
        declareFunction("build_million", "BUILD-MILLION", 1, 0, false);
        declareFunction("build_billi", "BUILD-BILLI", 1, 0, false);
        declareFunction("build_billion", "BUILD-BILLION", 1, 0, false);
        declareFunction("build_trilli", "BUILD-TRILLI", 1, 0, false);
        declareFunction("build_trillion", "BUILD-TRILLION", 1, 0, false);
        declareFunction("build_integer", "BUILD-INTEGER", 1, 0, false);
        declareFunction("build_number", "BUILD-NUMBER", 1, 0, false);
        declareFunction("build_fraction", "BUILD-FRACTION", 1, 0, false);
        declareFunction("build_half", "BUILD-HALF", 1, 0, false);
        declareFunction("build_float", "BUILD-FLOAT", 1, 0, false);
        declareFunction("build_negative_number", "BUILD-NEGATIVE-NUMBER", 1, 0, false);
        declareFunction("build_proper_interval", "BUILD-PROPER-INTERVAL", 1, 0, false);
        declareFunction("build_interval", "BUILD-INTERVAL", 1, 0, false);
        declareFunction("lex_numerals", "LEX-NUMERALS", 1, 0, false);
        declareFunction("build_exponentiation_phrase", "BUILD-EXPONENTIATION-PHRASE", 1, 0, false);
        declareFunction("build_multiplication_phrase", "BUILD-MULTIPLICATION-PHRASE", 1, 0, false);
        declareFunction("clear_string_to_interval", "CLEAR-STRING-TO-INTERVAL", 0, 0, false);
        declareFunction("remove_string_to_interval", "REMOVE-STRING-TO-INTERVAL", 1, 0, false);
        declareFunction("string_to_interval_internal", "STRING-TO-INTERVAL-INTERNAL", 1, 0, false);
        declareFunction("string_to_interval", "STRING-TO-INTERVAL", 1, 0, false);
        declareFunction("numeric_interval_term_from_fscp_result", "NUMERIC-INTERVAL-TERM-FROM-FSCP-RESULT", 1, 0, false);
        declareFunction("interval_stringP", "INTERVAL-STRING?", 1, 0, false);
        declareFunction("test_numeral_parser", "TEST-NUMERAL-PARSER", 0, 0, false);
        declareFunction("do_one_numeral_parser_test", "DO-ONE-NUMERAL-PARSER-TEST", 3, 0, false);
        return NIL;
    }

    public static SubLObject declare_numeral_parser_file() {
        if (SubLFiles.USE_V1) {
            declareFunction("standardize_number_string", "STANDARDIZE-NUMBER-STRING", 1, 1, false);
            declareFunction("initialize_number_values", "INITIALIZE-NUMBER-VALUES", 0, 0, false);
            declareFunction("number_value", "NUMBER-VALUE", 1, 0, false);
            declareFunction("number_string_signP", "NUMBER-STRING-SIGN?", 1, 0, false);
            declareFunction("hyphenated_number_value", "HYPHENATED-NUMBER-VALUE", 1, 0, false);
            declareFunction("combine_number_values", "COMBINE-NUMBER-VALUES", 3, 0, false);
            declareFunction("numeral_parser_max_significant_digits", "NUMERAL-PARSER-MAX-SIGNIFICANT-DIGITS", 2, 0, false);
            declareFunction("numeral_parser_significant_digits", "NUMERAL-PARSER-SIGNIFICANT-DIGITS", 1, 0, false);
            declareFunction("combine_cycl_number_values", "COMBINE-CYCL-NUMBER-VALUES", 3, 0, false);
            declareFunction("combine_non_cycl_number_values", "COMBINE-NON-CYCL-NUMBER-VALUES", 3, 0, false);
            declareFunction("numeral_parser_stringE", "NUMERAL-PARSER-STRING=", 2, 0, false);
            new numeral_parser.$numeral_parser_stringE$BinaryFunction();
            declareFunction("numeral_parser_charE", "NUMERAL-PARSER-CHAR=", 2, 0, false);
            declareFunction("zero_literalP", "ZERO-LITERAL?", 1, 0, false);
            declareFunction("indefinite_signP", "INDEFINITE-SIGN?", 1, 0, false);
            declareFunction("atomic_ten_signP", "ATOMIC-TEN-SIGN?", 1, 0, false);
            declareFunction("digit_signP", "DIGIT-SIGN?", 1, 0, false);
            declareFunction("deci_signP", "DECI-SIGN?", 1, 0, false);
            declareFunction("hyphen_signP", "HYPHEN-SIGN?", 1, 0, false);
            declareFunction("teen_signP", "TEEN-SIGN?", 1, 0, false);
            declareFunction("fuzzy_signP", "FUZZY-SIGN?", 1, 0, false);
            declareFunction("non_atomic_ten_signP", "NON-ATOMIC-TEN-SIGN?", 1, 0, false);
            declareFunction("hyphenated_non_atomic_ten_signP", "HYPHENATED-NON-ATOMIC-TEN-SIGN?", 1, 0, false);
            declareFunction("cent_signP", "CENT-SIGN?", 1, 0, false);
            declareFunction("kilo_signP", "KILO-SIGN?", 1, 0, false);
            declareFunction("fraction_signP", "FRACTION-SIGN?", 1, 0, false);
            declareFunction("float_signP", "FLOAT-SIGN?", 1, 0, false);
            declareFunction("number_signP", "NUMBER-SIGN?", 1, 0, false);
            declareFunction("interval_signP", "INTERVAL-SIGN?", 1, 0, false);
            declareFunction("proper_interval_signP", "PROPER-INTERVAL-SIGN?", 1, 0, false);
            declareFunction("milli_signP", "MILLI-SIGN?", 1, 0, false);
            declareFunction("billi_signP", "BILLI-SIGN?", 1, 0, false);
            declareFunction("trilli_signP", "TRILLI-SIGN?", 1, 0, false);
            declareFunction("integer_signP", "INTEGER-SIGN?", 1, 0, false);
            declareFunction("extended_dozen_signP", "EXTENDED-DOZEN-SIGN?", 1, 0, false);
            declareFunction("standard_dozen_signP", "STANDARD-DOZEN-SIGN?", 1, 0, false);
            declareFunction("extended_hundred_signP", "EXTENDED-HUNDRED-SIGN?", 1, 0, false);
            declareFunction("standard_hundred_signP", "STANDARD-HUNDRED-SIGN?", 1, 0, false);
            declareFunction("thousand_signP", "THOUSAND-SIGN?", 1, 0, false);
            declareFunction("million_signP", "MILLION-SIGN?", 1, 0, false);
            declareFunction("billion_signP", "BILLION-SIGN?", 1, 0, false);
            declareFunction("trillion_signP", "TRILLION-SIGN?", 1, 0, false);
            declareFunction("and_literalP", "AND-LITERAL?", 1, 0, false);
            declareFunction("indefinite_literalP", "INDEFINITE-LITERAL?", 1, 0, false);
            declareFunction("dozen_literalP", "DOZEN-LITERAL?", 1, 0, false);
            declareFunction("few_literalP", "FEW-LITERAL?", 1, 0, false);
            declareFunction("hundred_literalP", "HUNDRED-LITERAL?", 1, 0, false);
            declareFunction("thousand_literalP", "THOUSAND-LITERAL?", 1, 0, false);
            declareFunction("million_literalP", "MILLION-LITERAL?", 1, 0, false);
            declareFunction("millions_literalP", "MILLIONS-LITERAL?", 1, 0, false);
            declareFunction("billions_literalP", "BILLIONS-LITERAL?", 1, 0, false);
            declareFunction("billion_literalP", "BILLION-LITERAL?", 1, 0, false);
            declareFunction("trillions_literalP", "TRILLIONS-LITERAL?", 1, 0, false);
            declareFunction("trillion_literalP", "TRILLION-LITERAL?", 1, 0, false);
            declareFunction("first_literalP", "FIRST-LITERAL?", 1, 0, false);
            declareFunction("second_literalP", "SECOND-LITERAL?", 1, 0, false);
            declareFunction("seconds_literalP", "SECONDS-LITERAL?", 1, 0, false);
            declareFunction("atomic_denominator_literalP", "ATOMIC-DENOMINATOR-LITERAL?", 1, 0, false);
            declareFunction("denominator_literalP", "DENOMINATOR-LITERAL?", 1, 0, false);
            declareFunction("denominator_signP", "DENOMINATOR-SIGN?", 1, 0, false);
            declareFunction("half_signP", "HALF-SIGN?", 1, 0, false);
            declareFunction("minus_literalP", "MINUS-LITERAL?", 1, 0, false);
            declareFunction("to_literalP", "TO-LITERAL?", 1, 0, false);
            declareFunction("from_literalP", "FROM-LITERAL?", 1, 0, false);
            declareFunction("between_literalP", "BETWEEN-LITERAL?", 1, 0, false);
            declareFunction("mult_signP", "MULT-SIGN?", 1, 0, false);
            declareFunction("expt_operator_signP", "EXPT-OPERATOR-SIGN?", 1, 0, false);
            declareFunction("exponentiation_signP", "EXPONENTIATION-SIGN?", 1, 0, false);
            declareFunction("minus_signP", "MINUS-SIGN?", 1, 0, false);
            declareFunction("plus_signP", "PLUS-SIGN?", 1, 0, false);
            declareFunction("build_denominator", "BUILD-DENOMINATOR", 1, 0, false);
            declareFunction("build_zero", "BUILD-ZERO", 1, 0, false);
            declareFunction("build_indefinite", "BUILD-INDEFINITE", 1, 0, false);
            declareFunction("build_deci", "BUILD-DECI", 1, 0, false);
            declareFunction("build_teen", "BUILD-TEEN", 1, 0, false);
            declareFunction("build_fuzzy", "BUILD-FUZZY", 1, 0, false);
            declareFunction("build_atomic_ten", "BUILD-ATOMIC-TEN", 1, 0, false);
            declareFunction("build_hyphenated_non_atomic_ten", "BUILD-HYPHENATED-NON-ATOMIC-TEN", 1, 0, false);
            declareFunction("build_non_atomic_ten", "BUILD-NON-ATOMIC-TEN", 1, 0, false);
            declareFunction("build_cent", "BUILD-CENT", 1, 0, false);
            declareFunction("build_standard_hundred", "BUILD-STANDARD-HUNDRED", 1, 0, false);
            declareFunction("build_a_few", "BUILD-A-FEW", 1, 0, false);
            declareFunction("build_extended_hundred", "BUILD-EXTENDED-HUNDRED", 1, 0, false);
            declareFunction("build_standard_dozen", "BUILD-STANDARD-DOZEN", 1, 0, false);
            declareFunction("build_extended_dozen", "BUILD-EXTENDED-DOZEN", 1, 0, false);
            declareFunction("build_kilo", "BUILD-KILO", 1, 0, false);
            declareFunction("build_thousand", "BUILD-THOUSAND", 1, 0, false);
            declareFunction("build_milli", "BUILD-MILLI", 1, 0, false);
            declareFunction("build_million", "BUILD-MILLION", 1, 0, false);
            declareFunction("build_billi", "BUILD-BILLI", 1, 0, false);
            declareFunction("build_billion", "BUILD-BILLION", 1, 0, false);
            declareFunction("build_trilli", "BUILD-TRILLI", 1, 0, false);
            declareFunction("build_trillion", "BUILD-TRILLION", 1, 0, false);
            declareFunction("build_integer", "BUILD-INTEGER", 1, 0, false);
            declareFunction("build_number", "BUILD-NUMBER", 1, 0, false);
            declareFunction("build_fraction", "BUILD-FRACTION", 1, 0, false);
            declareFunction("build_half", "BUILD-HALF", 1, 0, false);
            declareFunction("build_float", "BUILD-FLOAT", 1, 0, false);
            declareFunction("build_negative_number", "BUILD-NEGATIVE-NUMBER", 1, 0, false);
            declareFunction("build_proper_interval", "BUILD-PROPER-INTERVAL", 1, 0, false);
            declareFunction("build_interval", "BUILD-INTERVAL", 1, 0, false);
            declareFunction("lex_numerals", "LEX-NUMERALS", 1, 0, false);
            declareFunction("build_exponentiation_phrase", "BUILD-EXPONENTIATION-PHRASE", 1, 0, false);
            declareFunction("build_multiplication_phrase", "BUILD-MULTIPLICATION-PHRASE", 1, 0, false);
            declareFunction("string_to_interval", "STRING-TO-INTERVAL", 1, 0, false);
            declareFunction("clear_string_to_interval_cached", "CLEAR-STRING-TO-INTERVAL-CACHED", 0, 0, false);
            declareFunction("remove_string_to_interval_cached", "REMOVE-STRING-TO-INTERVAL-CACHED", 1, 0, false);
            declareFunction("string_to_interval_cached_internal", "STRING-TO-INTERVAL-CACHED-INTERNAL", 1, 0, false);
            declareFunction("string_to_interval_cached", "STRING-TO-INTERVAL-CACHED", 1, 0, false);
            declareFunction("numeric_interval_term_from_fscp_result", "NUMERIC-INTERVAL-TERM-FROM-FSCP-RESULT", 1, 0, false);
            declareFunction("interval_stringP", "INTERVAL-STRING?", 1, 0, false);
        }
        if (SubLFiles.USE_V2) {
            declareFunction("clear_string_to_interval", "CLEAR-STRING-TO-INTERVAL", 0, 0, false);
            declareFunction("remove_string_to_interval", "REMOVE-STRING-TO-INTERVAL", 1, 0, false);
            declareFunction("string_to_interval_internal", "STRING-TO-INTERVAL-INTERNAL", 1, 0, false);
            declareFunction("test_numeral_parser", "TEST-NUMERAL-PARSER", 0, 0, false);
            declareFunction("do_one_numeral_parser_test", "DO-ONE-NUMERAL-PARSER-TEST", 3, 0, false);
        }
        return NIL;
    }

    public static SubLObject declare_numeral_parser_file_Previous() {
        declareFunction("standardize_number_string", "STANDARDIZE-NUMBER-STRING", 1, 1, false);
        declareFunction("initialize_number_values", "INITIALIZE-NUMBER-VALUES", 0, 0, false);
        declareFunction("number_value", "NUMBER-VALUE", 1, 0, false);
        declareFunction("number_string_signP", "NUMBER-STRING-SIGN?", 1, 0, false);
        declareFunction("hyphenated_number_value", "HYPHENATED-NUMBER-VALUE", 1, 0, false);
        declareFunction("combine_number_values", "COMBINE-NUMBER-VALUES", 3, 0, false);
        declareFunction("numeral_parser_max_significant_digits", "NUMERAL-PARSER-MAX-SIGNIFICANT-DIGITS", 2, 0, false);
        declareFunction("numeral_parser_significant_digits", "NUMERAL-PARSER-SIGNIFICANT-DIGITS", 1, 0, false);
        declareFunction("combine_cycl_number_values", "COMBINE-CYCL-NUMBER-VALUES", 3, 0, false);
        declareFunction("combine_non_cycl_number_values", "COMBINE-NON-CYCL-NUMBER-VALUES", 3, 0, false);
        declareFunction("numeral_parser_stringE", "NUMERAL-PARSER-STRING=", 2, 0, false);
        new numeral_parser.$numeral_parser_stringE$BinaryFunction();
        declareFunction("numeral_parser_charE", "NUMERAL-PARSER-CHAR=", 2, 0, false);
        declareFunction("zero_literalP", "ZERO-LITERAL?", 1, 0, false);
        declareFunction("indefinite_signP", "INDEFINITE-SIGN?", 1, 0, false);
        declareFunction("atomic_ten_signP", "ATOMIC-TEN-SIGN?", 1, 0, false);
        declareFunction("digit_signP", "DIGIT-SIGN?", 1, 0, false);
        declareFunction("deci_signP", "DECI-SIGN?", 1, 0, false);
        declareFunction("hyphen_signP", "HYPHEN-SIGN?", 1, 0, false);
        declareFunction("teen_signP", "TEEN-SIGN?", 1, 0, false);
        declareFunction("fuzzy_signP", "FUZZY-SIGN?", 1, 0, false);
        declareFunction("non_atomic_ten_signP", "NON-ATOMIC-TEN-SIGN?", 1, 0, false);
        declareFunction("hyphenated_non_atomic_ten_signP", "HYPHENATED-NON-ATOMIC-TEN-SIGN?", 1, 0, false);
        declareFunction("cent_signP", "CENT-SIGN?", 1, 0, false);
        declareFunction("kilo_signP", "KILO-SIGN?", 1, 0, false);
        declareFunction("fraction_signP", "FRACTION-SIGN?", 1, 0, false);
        declareFunction("float_signP", "FLOAT-SIGN?", 1, 0, false);
        declareFunction("number_signP", "NUMBER-SIGN?", 1, 0, false);
        declareFunction("interval_signP", "INTERVAL-SIGN?", 1, 0, false);
        declareFunction("proper_interval_signP", "PROPER-INTERVAL-SIGN?", 1, 0, false);
        declareFunction("milli_signP", "MILLI-SIGN?", 1, 0, false);
        declareFunction("billi_signP", "BILLI-SIGN?", 1, 0, false);
        declareFunction("trilli_signP", "TRILLI-SIGN?", 1, 0, false);
        declareFunction("integer_signP", "INTEGER-SIGN?", 1, 0, false);
        declareFunction("extended_dozen_signP", "EXTENDED-DOZEN-SIGN?", 1, 0, false);
        declareFunction("standard_dozen_signP", "STANDARD-DOZEN-SIGN?", 1, 0, false);
        declareFunction("extended_hundred_signP", "EXTENDED-HUNDRED-SIGN?", 1, 0, false);
        declareFunction("standard_hundred_signP", "STANDARD-HUNDRED-SIGN?", 1, 0, false);
        declareFunction("thousand_signP", "THOUSAND-SIGN?", 1, 0, false);
        declareFunction("million_signP", "MILLION-SIGN?", 1, 0, false);
        declareFunction("billion_signP", "BILLION-SIGN?", 1, 0, false);
        declareFunction("trillion_signP", "TRILLION-SIGN?", 1, 0, false);
        declareFunction("and_literalP", "AND-LITERAL?", 1, 0, false);
        declareFunction("indefinite_literalP", "INDEFINITE-LITERAL?", 1, 0, false);
        declareFunction("dozen_literalP", "DOZEN-LITERAL?", 1, 0, false);
        declareFunction("few_literalP", "FEW-LITERAL?", 1, 0, false);
        declareFunction("hundred_literalP", "HUNDRED-LITERAL?", 1, 0, false);
        declareFunction("thousand_literalP", "THOUSAND-LITERAL?", 1, 0, false);
        declareFunction("million_literalP", "MILLION-LITERAL?", 1, 0, false);
        declareFunction("millions_literalP", "MILLIONS-LITERAL?", 1, 0, false);
        declareFunction("billions_literalP", "BILLIONS-LITERAL?", 1, 0, false);
        declareFunction("billion_literalP", "BILLION-LITERAL?", 1, 0, false);
        declareFunction("trillions_literalP", "TRILLIONS-LITERAL?", 1, 0, false);
        declareFunction("trillion_literalP", "TRILLION-LITERAL?", 1, 0, false);
        declareFunction("first_literalP", "FIRST-LITERAL?", 1, 0, false);
        declareFunction("second_literalP", "SECOND-LITERAL?", 1, 0, false);
        declareFunction("seconds_literalP", "SECONDS-LITERAL?", 1, 0, false);
        declareFunction("atomic_denominator_literalP", "ATOMIC-DENOMINATOR-LITERAL?", 1, 0, false);
        declareFunction("denominator_literalP", "DENOMINATOR-LITERAL?", 1, 0, false);
        declareFunction("denominator_signP", "DENOMINATOR-SIGN?", 1, 0, false);
        declareFunction("half_signP", "HALF-SIGN?", 1, 0, false);
        declareFunction("minus_literalP", "MINUS-LITERAL?", 1, 0, false);
        declareFunction("to_literalP", "TO-LITERAL?", 1, 0, false);
        declareFunction("from_literalP", "FROM-LITERAL?", 1, 0, false);
        declareFunction("between_literalP", "BETWEEN-LITERAL?", 1, 0, false);
        declareFunction("mult_signP", "MULT-SIGN?", 1, 0, false);
        declareFunction("expt_operator_signP", "EXPT-OPERATOR-SIGN?", 1, 0, false);
        declareFunction("exponentiation_signP", "EXPONENTIATION-SIGN?", 1, 0, false);
        declareFunction("minus_signP", "MINUS-SIGN?", 1, 0, false);
        declareFunction("plus_signP", "PLUS-SIGN?", 1, 0, false);
        declareFunction("build_denominator", "BUILD-DENOMINATOR", 1, 0, false);
        declareFunction("build_zero", "BUILD-ZERO", 1, 0, false);
        declareFunction("build_indefinite", "BUILD-INDEFINITE", 1, 0, false);
        declareFunction("build_deci", "BUILD-DECI", 1, 0, false);
        declareFunction("build_teen", "BUILD-TEEN", 1, 0, false);
        declareFunction("build_fuzzy", "BUILD-FUZZY", 1, 0, false);
        declareFunction("build_atomic_ten", "BUILD-ATOMIC-TEN", 1, 0, false);
        declareFunction("build_hyphenated_non_atomic_ten", "BUILD-HYPHENATED-NON-ATOMIC-TEN", 1, 0, false);
        declareFunction("build_non_atomic_ten", "BUILD-NON-ATOMIC-TEN", 1, 0, false);
        declareFunction("build_cent", "BUILD-CENT", 1, 0, false);
        declareFunction("build_standard_hundred", "BUILD-STANDARD-HUNDRED", 1, 0, false);
        declareFunction("build_a_few", "BUILD-A-FEW", 1, 0, false);
        declareFunction("build_extended_hundred", "BUILD-EXTENDED-HUNDRED", 1, 0, false);
        declareFunction("build_standard_dozen", "BUILD-STANDARD-DOZEN", 1, 0, false);
        declareFunction("build_extended_dozen", "BUILD-EXTENDED-DOZEN", 1, 0, false);
        declareFunction("build_kilo", "BUILD-KILO", 1, 0, false);
        declareFunction("build_thousand", "BUILD-THOUSAND", 1, 0, false);
        declareFunction("build_milli", "BUILD-MILLI", 1, 0, false);
        declareFunction("build_million", "BUILD-MILLION", 1, 0, false);
        declareFunction("build_billi", "BUILD-BILLI", 1, 0, false);
        declareFunction("build_billion", "BUILD-BILLION", 1, 0, false);
        declareFunction("build_trilli", "BUILD-TRILLI", 1, 0, false);
        declareFunction("build_trillion", "BUILD-TRILLION", 1, 0, false);
        declareFunction("build_integer", "BUILD-INTEGER", 1, 0, false);
        declareFunction("build_number", "BUILD-NUMBER", 1, 0, false);
        declareFunction("build_fraction", "BUILD-FRACTION", 1, 0, false);
        declareFunction("build_half", "BUILD-HALF", 1, 0, false);
        declareFunction("build_float", "BUILD-FLOAT", 1, 0, false);
        declareFunction("build_negative_number", "BUILD-NEGATIVE-NUMBER", 1, 0, false);
        declareFunction("build_proper_interval", "BUILD-PROPER-INTERVAL", 1, 0, false);
        declareFunction("build_interval", "BUILD-INTERVAL", 1, 0, false);
        declareFunction("lex_numerals", "LEX-NUMERALS", 1, 0, false);
        declareFunction("build_exponentiation_phrase", "BUILD-EXPONENTIATION-PHRASE", 1, 0, false);
        declareFunction("build_multiplication_phrase", "BUILD-MULTIPLICATION-PHRASE", 1, 0, false);
        declareFunction("string_to_interval", "STRING-TO-INTERVAL", 1, 0, false);
        declareFunction("clear_string_to_interval_cached", "CLEAR-STRING-TO-INTERVAL-CACHED", 0, 0, false);
        declareFunction("remove_string_to_interval_cached", "REMOVE-STRING-TO-INTERVAL-CACHED", 1, 0, false);
        declareFunction("string_to_interval_cached_internal", "STRING-TO-INTERVAL-CACHED-INTERNAL", 1, 0, false);
        declareFunction("string_to_interval_cached", "STRING-TO-INTERVAL-CACHED", 1, 0, false);
        declareFunction("numeric_interval_term_from_fscp_result", "NUMERIC-INTERVAL-TERM-FROM-FSCP-RESULT", 1, 0, false);
        declareFunction("interval_stringP", "INTERVAL-STRING?", 1, 0, false);
        return NIL;
    }

    public static final SubLObject init_numeral_parser_file_alt() {
        deflexical("*NULL*", $list_alt0);
        deflexical("*A*", $list_alt1);
        deflexical("*DIGITS*", $list_alt2);
        deflexical("*TEENS*", $list_alt3);
        deflexical("*FUZZIES*", $list_alt4);
        deflexical("*ATOMIC-TENS*", $list_alt5);
        deflexical("*ONEDOZEN*", $list_alt6);
        deflexical("*ONEHUNDRED*", $list_alt7);
        deflexical("*ONETHOUSAND*", $list_alt8);
        deflexical("*ONEMILLION*", $list_alt9);
        deflexical("*ONEBILLION*", $list_alt10);
        deflexical("*ONETRILLION*", $list_alt11);
        deflexical("*IRREGULAR-DENOMINATORS*", $list_alt12);
        defparameter("*NUMBER-VALUES*", com.cyc.cycjava.cycl.numeral_parser.initialize_number_values());
        defparameter("*DENOMINATOR*", finite_state_transducer.new_finite_state_transducer(ZERO_INTEGER, $list_alt89, list(listS(ZERO_INTEGER, symbol_function($sym90$ATOMIC_DENOMINATOR_LITERAL_), $list_alt91), listS(ZERO_INTEGER, symbol_function($sym92$ATOMIC_TEN_SIGN_), $list_alt93), listS(TWO_INTEGER, symbol_function($sym94$DENOMINATOR_LITERAL_), $list_alt91)), symbol_function(BUILD_DENOMINATOR)));
        defparameter("*ZERO*", finite_state_transducer.new_finite_state_transducer(ZERO_INTEGER, $list_alt89, list(listS(ZERO_INTEGER, symbol_function($sym97$ZERO_LITERAL_), $list_alt91)), symbol_function(BUILD_ZERO)));
        defparameter("*INDEFINITE*", finite_state_transducer.new_finite_state_transducer(ZERO_INTEGER, $list_alt89, list(listS(ZERO_INTEGER, symbol_function($sym99$INDEFINITE_LITERAL_), $list_alt91)), symbol_function(BUILD_INDEFINITE)));
        defparameter("*DECI*", finite_state_transducer.new_finite_state_transducer(ZERO_INTEGER, $list_alt89, list(listS(ZERO_INTEGER, symbol_function($sym102$DIGIT_SIGN_), $list_alt91), listS(ZERO_INTEGER, symbol_function($sym103$NUMBER_STRING_SIGN_), $list_alt91)), symbol_function(BUILD_DECI)));
        defparameter("*TEEN*", finite_state_transducer.new_finite_state_transducer(ZERO_INTEGER, $list_alt89, list(listS(ZERO_INTEGER, symbol_function($sym106$TEEN_SIGN_), $list_alt91)), symbol_function(BUILD_TEEN)));
        defparameter("*FUZZY*", finite_state_transducer.new_finite_state_transducer(ZERO_INTEGER, $list_alt89, list(listS(ZERO_INTEGER, symbol_function($sym108$FUZZY_SIGN_), $list_alt91)), symbol_function(BUILD_FUZZY)));
        defparameter("*ATOMIC-TEN*", finite_state_transducer.new_finite_state_transducer(ZERO_INTEGER, $list_alt89, list(listS(ZERO_INTEGER, symbol_function($sym92$ATOMIC_TEN_SIGN_), $list_alt91)), symbol_function(BUILD_ATOMIC_TEN)));
        defparameter("*HYPHENATED-NON-ATOMIC-TEN*", finite_state_transducer.new_finite_state_transducer(ZERO_INTEGER, $list_alt89, list(listS(ZERO_INTEGER, symbol_function($sym112$HYPHENATED_NON_ATOMIC_TEN_SIGN_), $list_alt91)), symbol_function(BUILD_HYPHENATED_NON_ATOMIC_TEN)));
        defparameter("*NON-ATOMIC-TEN*", finite_state_transducer.new_finite_state_transducer(ZERO_INTEGER, $list_alt115, list(listS(ZERO_INTEGER, symbol_function($sym92$ATOMIC_TEN_SIGN_), $list_alt91), listS(ONE_INTEGER, symbol_function($sym116$DECI_SIGN_), $list_alt93), listS(ONE_INTEGER, symbol_function($sym114$HYPHEN_SIGN_), $list_alt117), listS(THREE_INTEGER, symbol_function($sym116$DECI_SIGN_), $list_alt93)), symbol_function(BUILD_NON_ATOMIC_TEN)));
        defparameter("*CENT*", finite_state_transducer.new_finite_state_transducer(ZERO_INTEGER, $list_alt89, list(listS(ZERO_INTEGER, symbol_function($sym116$DECI_SIGN_), $list_alt91), listS(ZERO_INTEGER, symbol_function($sym106$TEEN_SIGN_), $list_alt91), listS(ZERO_INTEGER, symbol_function($sym108$FUZZY_SIGN_), $list_alt91), listS(ZERO_INTEGER, symbol_function($sym92$ATOMIC_TEN_SIGN_), $list_alt91), listS(ZERO_INTEGER, symbol_function($sym119$NON_ATOMIC_TEN_SIGN_), $list_alt91), listS(ZERO_INTEGER, symbol_function($sym103$NUMBER_STRING_SIGN_), $list_alt91)), symbol_function(BUILD_CENT)));
        defparameter("*STANDARD-HUNDRED*", finite_state_transducer.new_finite_state_transducer(ZERO_INTEGER, $list_alt115, list(new SubLObject[]{ listS(ZERO_INTEGER, symbol_function($sym116$DECI_SIGN_), $list_alt91), listS(ZERO_INTEGER, symbol_function($sym122$INDEFINITE_SIGN_), $list_alt91), listS(ONE_INTEGER, symbol_function($sym123$HUNDRED_LITERAL_), $list_alt117), listS(THREE_INTEGER, symbol_function($sym124$CENT_SIGN_), $list_alt93), listS(THREE_INTEGER, symbol_function(SIGN_P), $list_alt126), $list_alt127, listS(FOUR_INTEGER, symbol_function($sym124$CENT_SIGN_), $list_alt128), listS(FOUR_INTEGER, symbol_function($sym129$FRACTION_SIGN_), $list_alt128), listS(SIX_INTEGER, symbol_function(SIGN_P), $list_alt93) }), symbol_function(BUILD_STANDARD_HUNDRED)));
        defparameter("*A-FEW*", finite_state_transducer.new_finite_state_transducer(ZERO_INTEGER, $list_alt115, list(listS(ZERO_INTEGER, symbol_function($sym122$INDEFINITE_SIGN_), $list_alt91), listS(ONE_INTEGER, symbol_function($sym132$FEW_LITERAL_), $list_alt93)), symbol_function(BUILD_A_FEW)));
        defparameter("*EXTENDED-HUNDRED*", finite_state_transducer.new_finite_state_transducer(ZERO_INTEGER, $list_alt115, list(new SubLObject[]{ listS(ZERO_INTEGER, symbol_function($sym124$CENT_SIGN_), $list_alt91), listS(ZERO_INTEGER, symbol_function($sym122$INDEFINITE_SIGN_), $list_alt91), listS(ONE_INTEGER, symbol_function($sym123$HUNDRED_LITERAL_), $list_alt117), listS(THREE_INTEGER, symbol_function($sym124$CENT_SIGN_), $list_alt93), listS(THREE_INTEGER, symbol_function(SIGN_P), $list_alt126), $list_alt127, listS(FOUR_INTEGER, symbol_function($sym124$CENT_SIGN_), $list_alt128), listS(FOUR_INTEGER, symbol_function(SIGN_P), $list_alt134), listS(SIX_INTEGER, symbol_function($sym124$CENT_SIGN_), $list_alt93) }), symbol_function(BUILD_EXTENDED_HUNDRED)));
        defparameter("*STANDARD-DOZEN*", finite_state_transducer.new_finite_state_transducer(ZERO_INTEGER, $list_alt115, list(listS(ZERO_INTEGER, symbol_function($sym116$DECI_SIGN_), $list_alt91), listS(ZERO_INTEGER, symbol_function($sym122$INDEFINITE_SIGN_), $list_alt91), listS(ONE_INTEGER, symbol_function($sym136$DOZEN_LITERAL_), $list_alt93)), symbol_function(BUILD_STANDARD_DOZEN)));
        defparameter("*EXTENDED-DOZEN*", finite_state_transducer.new_finite_state_transducer(ZERO_INTEGER, $list_alt115, list(listS(ZERO_INTEGER, symbol_function($sym124$CENT_SIGN_), $list_alt91), listS(ZERO_INTEGER, symbol_function($sym122$INDEFINITE_SIGN_), $list_alt91), listS(ONE_INTEGER, symbol_function($sym136$DOZEN_LITERAL_), $list_alt93)), symbol_function(BUILD_EXTENDED_DOZEN)));
        defparameter("*KILO*", finite_state_transducer.new_finite_state_transducer(ZERO_INTEGER, $list_alt89, list(listS(ZERO_INTEGER, symbol_function($sym124$CENT_SIGN_), $list_alt91), listS(ZERO_INTEGER, symbol_function($sym139$STANDARD_HUNDRED_SIGN_), $list_alt91), listS(ZERO_INTEGER, symbol_function($sym140$EXTENDED_HUNDRED_SIGN_), $list_alt91), listS(ZERO_INTEGER, symbol_function($sym141$FLOAT_SIGN_), $list_alt91), listS(ZERO_INTEGER, symbol_function($sym103$NUMBER_STRING_SIGN_), $list_alt91)), symbol_function(BUILD_KILO)));
        defparameter("*THOUSAND*", finite_state_transducer.new_finite_state_transducer(ZERO_INTEGER, $list_alt115, list(new SubLObject[]{ listS(ZERO_INTEGER, symbol_function($sym144$KILO_SIGN_), $list_alt91), listS(ZERO_INTEGER, symbol_function($sym122$INDEFINITE_SIGN_), $list_alt91), listS(ONE_INTEGER, symbol_function($sym145$THOUSAND_LITERAL_), $list_alt117), listS(THREE_INTEGER, symbol_function($sym144$KILO_SIGN_), $list_alt93), listS(THREE_INTEGER, symbol_function(SIGN_P), $list_alt126), $list_alt127, listS(FOUR_INTEGER, symbol_function($sym124$CENT_SIGN_), $list_alt128), listS(FOUR_INTEGER, symbol_function(SIGN_P), $list_alt134), listS(SIX_INTEGER, symbol_function($sym124$CENT_SIGN_), $list_alt93) }), symbol_function(BUILD_THOUSAND)));
        defparameter("*MILLI*", finite_state_transducer.new_finite_state_transducer(ZERO_INTEGER, $list_alt89, list(listS(ZERO_INTEGER, symbol_function($sym144$KILO_SIGN_), $list_alt91), listS(ZERO_INTEGER, symbol_function($sym147$THOUSAND_SIGN_), $list_alt91), listS(ZERO_INTEGER, symbol_function($sym103$NUMBER_STRING_SIGN_), $list_alt91)), symbol_function(BUILD_MILLI)));
        defparameter("*MILLION*", finite_state_transducer.new_finite_state_transducer(ZERO_INTEGER, $list_alt115, list(new SubLObject[]{ listS(ZERO_INTEGER, symbol_function($sym150$MILLI_SIGN_), $list_alt91), listS(ZERO_INTEGER, symbol_function($sym122$INDEFINITE_SIGN_), $list_alt91), listS(ONE_INTEGER, symbol_function($sym151$MILLION_LITERAL_), $list_alt117), listS(THREE_INTEGER, symbol_function($sym150$MILLI_SIGN_), $list_alt93), listS(THREE_INTEGER, symbol_function(SIGN_P), $list_alt126), $list_alt127, listS(FOUR_INTEGER, symbol_function($sym124$CENT_SIGN_), $list_alt128), listS(FOUR_INTEGER, symbol_function(SIGN_P), $list_alt134), listS(SIX_INTEGER, symbol_function($sym124$CENT_SIGN_), $list_alt93) }), symbol_function(BUILD_MILLION)));
        defparameter("*BILLI*", finite_state_transducer.new_finite_state_transducer(ZERO_INTEGER, $list_alt89, list(listS(ZERO_INTEGER, symbol_function($sym150$MILLI_SIGN_), $list_alt91), listS(ZERO_INTEGER, symbol_function($sym153$MILLION_SIGN_), $list_alt91), listS(ZERO_INTEGER, symbol_function($sym103$NUMBER_STRING_SIGN_), $list_alt91)), symbol_function(BUILD_BILLI)));
        defparameter("*BILLION*", finite_state_transducer.new_finite_state_transducer(ZERO_INTEGER, $list_alt115, list(new SubLObject[]{ listS(ZERO_INTEGER, symbol_function($sym156$BILLI_SIGN_), $list_alt91), listS(ZERO_INTEGER, symbol_function($sym122$INDEFINITE_SIGN_), $list_alt91), listS(ONE_INTEGER, symbol_function($sym157$BILLION_LITERAL_), $list_alt117), listS(THREE_INTEGER, symbol_function($sym156$BILLI_SIGN_), $list_alt93), listS(THREE_INTEGER, symbol_function(SIGN_P), $list_alt126), $list_alt127, listS(FOUR_INTEGER, symbol_function($sym124$CENT_SIGN_), $list_alt128), listS(FOUR_INTEGER, symbol_function(SIGN_P), $list_alt134), listS(SIX_INTEGER, symbol_function($sym124$CENT_SIGN_), $list_alt93) }), symbol_function(BUILD_BILLION)));
        defparameter("*TRILLI*", finite_state_transducer.new_finite_state_transducer(ZERO_INTEGER, $list_alt89, list(listS(ZERO_INTEGER, symbol_function($sym156$BILLI_SIGN_), $list_alt91), listS(ZERO_INTEGER, symbol_function($sym159$BILLION_SIGN_), $list_alt91), listS(ZERO_INTEGER, symbol_function($sym103$NUMBER_STRING_SIGN_), $list_alt91)), symbol_function(BUILD_TRILLI)));
        defparameter("*TRILLION*", finite_state_transducer.new_finite_state_transducer(ZERO_INTEGER, $list_alt115, list(new SubLObject[]{ listS(ZERO_INTEGER, symbol_function($sym162$TRILLI_SIGN_), $list_alt91), listS(ZERO_INTEGER, symbol_function($sym122$INDEFINITE_SIGN_), $list_alt91), listS(ONE_INTEGER, symbol_function($sym163$TRILLION_LITERAL_), $list_alt117), listS(THREE_INTEGER, symbol_function($sym162$TRILLI_SIGN_), $list_alt93), listS(THREE_INTEGER, symbol_function(SIGN_P), $list_alt126), $list_alt127, listS(FOUR_INTEGER, symbol_function($sym124$CENT_SIGN_), $list_alt128), listS(FOUR_INTEGER, symbol_function(SIGN_P), $list_alt134), listS(SIX_INTEGER, symbol_function($sym124$CENT_SIGN_), $list_alt93) }), symbol_function(BUILD_TRILLION)));
        defparameter("*INTEGER*", finite_state_transducer.new_finite_state_transducer(ZERO_INTEGER, $list_alt89, list(listS(ZERO_INTEGER, symbol_function($sym162$TRILLI_SIGN_), $list_alt91), listS(ZERO_INTEGER, symbol_function($sym165$TRILLION_SIGN_), $list_alt91)), symbol_function(BUILD_INTEGER)));
        defparameter("*NUMBER*", finite_state_transducer.new_finite_state_transducer(ZERO_INTEGER, $list_alt89, list(listS(ZERO_INTEGER, symbol_function($sym167$INTEGER_SIGN_), $list_alt91), listS(ZERO_INTEGER, symbol_function($sym141$FLOAT_SIGN_), $list_alt91), listS(ZERO_INTEGER, symbol_function($sym103$NUMBER_STRING_SIGN_), $list_alt91), listS(ZERO_INTEGER, symbol_function($sym129$FRACTION_SIGN_), $list_alt91), listS(ZERO_INTEGER, symbol_function($sym168$STANDARD_DOZEN_SIGN_), $list_alt91), listS(ZERO_INTEGER, symbol_function($sym169$EXTENDED_DOZEN_SIGN_), $list_alt91)), symbol_function(BUILD_NUMBER)));
        defparameter("*FRACTION*", finite_state_transducer.new_finite_state_transducer(ZERO_INTEGER, $list_alt115, list(listS(ZERO_INTEGER, symbol_function($sym171$NUMBER_SIGN_), $list_alt91), listS(ZERO_INTEGER, symbol_function($sym122$INDEFINITE_SIGN_), $list_alt91), listS(ONE_INTEGER, symbol_function($sym90$ATOMIC_DENOMINATOR_LITERAL_), $list_alt93), listS(ONE_INTEGER, symbol_function($sym172$DENOMINATOR_SIGN_), $list_alt93)), symbol_function(BUILD_FRACTION)));
        defparameter("*HALF*", finite_state_transducer.new_finite_state_transducer(ZERO_INTEGER, $list_alt89, list(listS(ZERO_INTEGER, symbol_function($sym175$HALF_SIGN_), $list_alt91)), symbol_function(BUILD_HALF)));
        defparameter("*FLOAT*", finite_state_transducer.new_finite_state_transducer(ZERO_INTEGER, $list_alt177, list(listS(ZERO_INTEGER, symbol_function($sym167$INTEGER_SIGN_), $list_alt91), listS(ONE_INTEGER, symbol_function($sym121$AND_LITERAL_), $list_alt93), listS(TWO_INTEGER, symbol_function($sym129$FRACTION_SIGN_), $list_alt117)), symbol_function(BUILD_FLOAT)));
        defparameter("*NEGATIVE-NUMBER-STRING*", finite_state_transducer.new_finite_state_transducer(ZERO_INTEGER, $list_alt115, list(listS(ZERO_INTEGER, symbol_function($sym179$MINUS_LITERAL_), $list_alt91), listS(ONE_INTEGER, symbol_function($sym171$NUMBER_SIGN_), $list_alt93)), symbol_function(BUILD_NEGATIVE_NUMBER)));
        defparameter("*PROPER-INTERVAL*", finite_state_transducer.new_finite_state_transducer(ZERO_INTEGER, $list_alt185, list(new SubLObject[]{ listS(ZERO_INTEGER, symbol_function($sym171$NUMBER_SIGN_), $list_alt93), listS(ZERO_INTEGER, symbol_function($sym129$FRACTION_SIGN_), $list_alt93), listS(ZERO_INTEGER, symbol_function($sym186$FROM_LITERAL_), $list_alt91), listS(ZERO_INTEGER, symbol_function($sym187$BETWEEN_LITERAL_), $list_alt188), listS(ONE_INTEGER, symbol_function($sym171$NUMBER_SIGN_), $list_alt93), listS(TWO_INTEGER, symbol_function($sym189$TO_LITERAL_), $list_alt117), listS(THREE_INTEGER, symbol_function($sym171$NUMBER_SIGN_), $list_alt190), listS(THREE_INTEGER, symbol_function($sym129$FRACTION_SIGN_), $list_alt190), listS(FIVE_INTEGER, symbol_function($sym171$NUMBER_SIGN_), $list_alt191), listS(FIVE_INTEGER, symbol_function($sym129$FRACTION_SIGN_), $list_alt191), listS(SIX_INTEGER, symbol_function($sym121$AND_LITERAL_), $list_alt192), listS(SEVEN_INTEGER, symbol_function($sym171$NUMBER_SIGN_), $list_alt190), listS(SEVEN_INTEGER, symbol_function($sym129$FRACTION_SIGN_), $list_alt190) }), symbol_function(BUILD_PROPER_INTERVAL)));
        defparameter("*INTERVAL*", finite_state_transducer.new_finite_state_transducer(ZERO_INTEGER, $list_alt89, list(listS(ZERO_INTEGER, symbol_function($sym194$PROPER_INTERVAL_SIGN_), $list_alt91), listS(ZERO_INTEGER, symbol_function($sym171$NUMBER_SIGN_), $list_alt91)), symbol_function(BUILD_INTERVAL)));
        defparameter("*ENGLISH-INTERVAL-PARSER*", finite_state_cascade_parser.new_finite_state_cascade_parser(list(new SubLObject[]{ $zero$.getDynamicValue(), $indefinite$.getDynamicValue(), $deci$.getDynamicValue(), $teen$.getDynamicValue(), $fuzzy$.getDynamicValue(), $a_few$.getDynamicValue(), $atomic_ten$.getDynamicValue(), $hyphenated_non_atomic_ten$.getDynamicValue(), $denominator$.getDynamicValue(), $non_atomic_ten$.getDynamicValue(), $cent$.getDynamicValue(), $standard_hundred$.getDynamicValue(), $extended_hundred$.getDynamicValue(), $standard_dozen$.getDynamicValue(), $extended_dozen$.getDynamicValue(), $kilo$.getDynamicValue(), $thousand$.getDynamicValue(), $milli$.getDynamicValue(), $million$.getDynamicValue(), $billi$.getDynamicValue(), $billion$.getDynamicValue(), $trilli$.getDynamicValue(), $trillion$.getDynamicValue(), $integer$.getDynamicValue(), $number$.getDynamicValue(), $fraction$.getDynamicValue(), $half$.getDynamicValue(), $proper_interval$.getDynamicValue(), $float$.getDynamicValue(), $kilo$.getDynamicValue(), $thousand$.getDynamicValue(), $milli$.getDynamicValue(), $million$.getDynamicValue(), $billi$.getDynamicValue(), $billion$.getDynamicValue(), $trilli$.getDynamicValue(), $trillion$.getDynamicValue(), $integer$.getDynamicValue(), $number$.getDynamicValue(), $negative_number_string$.getDynamicValue(), $proper_interval$.getDynamicValue(), $interval$.getDynamicValue() }), UNPROVIDED));
        defparameter("*NEGATIVE-NUMBER*", finite_state_transducer.new_finite_state_transducer(ZERO_INTEGER, $list_alt115, list(listS(ZERO_INTEGER, symbol_function($sym199$MINUS_SIGN_), $list_alt91), listS(ONE_INTEGER, symbol_function($sym171$NUMBER_SIGN_), $list_alt93)), symbol_function(BUILD_NEGATIVE_NUMBER)));
        defparameter("*EXPONENTIATION*", finite_state_transducer.new_finite_state_transducer(ZERO_INTEGER, $list_alt115, list(listS(ZERO_INTEGER, symbol_function($sym171$NUMBER_SIGN_), $list_alt91), listS(ONE_INTEGER, symbol_function($sym200$EXPT_OPERATOR_SIGN_), $list_alt117), listS(THREE_INTEGER, symbol_function($sym171$NUMBER_SIGN_), $list_alt93)), symbol_function(BUILD_EXPONENTIATION_PHRASE)));
        defparameter("*MULTIPLICATION*", finite_state_transducer.new_finite_state_transducer(ZERO_INTEGER, $list_alt115, list(listS(ZERO_INTEGER, symbol_function($sym171$NUMBER_SIGN_), $list_alt91), listS(ONE_INTEGER, symbol_function($sym202$MULT_SIGN_), $list_alt117), listS(THREE_INTEGER, symbol_function($sym203$EXPONENTIATION_SIGN_), $list_alt93)), symbol_function(BUILD_MULTIPLICATION_PHRASE)));
        defparameter("*DIGIT-INTERVAL-PARSER*", finite_state_cascade_parser.new_finite_state_cascade_parser(list($negative_number$.getDynamicValue(), $exponentiation$.getDynamicValue(), $multiplication$.getDynamicValue(), $interval$.getDynamicValue()), LEX_NUMERALS));
        deflexical("*STRING-TO-INTERVAL-CACHING-STATE*", NIL);
        defparameter("*NUMERAL-PARSER-TEST-CASES*", listS($list_alt213, new SubLObject[]{ $list_alt214, $list_alt215, $list_alt216, $list_alt217, $list_alt218, $list_alt219, $list_alt220, $list_alt221, $list_alt222, $list_alt223, $list_alt224, $list_alt225, $list_alt226, $list_alt227, $list_alt228, bq_cons($$$two_thirds, divide(TWO_INTEGER, THREE_INTEGER)), $list_alt230, $list_alt231, $list_alt232, $list_alt233, listS($str_alt234$between_two_hundred_and_two_third, $$Unity, divide(TWO_INTEGER, THREE_INTEGER), $list_alt235), $list_alt236, bq_cons($$$one_twenty_second, divide(ONE_INTEGER, $int$22)), $list_alt239 }));
        return NIL;
    }

    public static SubLObject init_numeral_parser_file() {
        if (SubLFiles.USE_V1) {
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
        }
        if (SubLFiles.USE_V2) {
            deflexical("*STRING-TO-INTERVAL-CACHING-STATE*", NIL);
            defparameter("*NUMERAL-PARSER-TEST-CASES*", listS($list_alt213, new SubLObject[]{ $list_alt214, $list_alt215, $list_alt216, $list_alt217, $list_alt218, $list_alt219, $list_alt220, $list_alt221, $list_alt222, $list_alt223, $list_alt224, $list_alt225, $list_alt226, $list_alt227, $list_alt228, bq_cons($$$two_thirds, divide(TWO_INTEGER, THREE_INTEGER)), $list_alt230, $list_alt231, $list_alt232, $list_alt233, listS($str_alt234$between_two_hundred_and_two_third, $$Unity, divide(TWO_INTEGER, THREE_INTEGER), $list_alt235), $list_alt236, bq_cons($$$one_twenty_second, divide(ONE_INTEGER, $int$22)), $list_alt239 }));
        }
        return NIL;
    }

    public static SubLObject init_numeral_parser_file_Previous() {
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

    public static final SubLObject setup_numeral_parser_file_alt() {
        memoization_state.note_globally_cached_function(STRING_TO_INTERVAL);
        return NIL;
    }

    public static SubLObject setup_numeral_parser_file() {
        if (SubLFiles.USE_V1) {
            memoization_state.note_globally_cached_function(STRING_TO_INTERVAL_CACHED);
        }
        if (SubLFiles.USE_V2) {
            memoization_state.note_globally_cached_function(STRING_TO_INTERVAL);
        }
        return NIL;
    }

    public static SubLObject setup_numeral_parser_file_Previous() {
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



    // deflexical
    // Definitions
    @LispMethod(comment = "deflexical")
    private static final SubLSymbol $null$ = makeSymbol("*NULL*");

    // deflexical
    @LispMethod(comment = "deflexical")
    private static final SubLSymbol $a$ = makeSymbol("*A*");

    // deflexical
    @LispMethod(comment = "deflexical")
    private static final SubLSymbol $digits$ = makeSymbol("*DIGITS*");

    // deflexical
    @LispMethod(comment = "deflexical")
    private static final SubLSymbol $teens$ = makeSymbol("*TEENS*");

    // deflexical
    /**
     * Words that denote fuzzy numbers, which need to be represented in CycL
     *
     * @unknown baxter
     */
    @LispMethod(comment = "Words that denote fuzzy numbers, which need to be represented in CycL\r\n\r\n@unknown baxter\ndeflexical")
    private static final SubLSymbol $fuzzies$ = makeSymbol("*FUZZIES*");

    // deflexical
    @LispMethod(comment = "deflexical")
    private static final SubLSymbol $atomic_tens$ = makeSymbol("*ATOMIC-TENS*");

    // deflexical
    /**
     *
     *
     * @unknown baxter
     */
    @LispMethod(comment = "@unknown baxter\ndeflexical")
    private static final SubLSymbol $onedozen$ = makeSymbol("*ONEDOZEN*");

    // deflexical
    @LispMethod(comment = "deflexical")
    private static final SubLSymbol $onehundred$ = makeSymbol("*ONEHUNDRED*");

    // deflexical
    @LispMethod(comment = "deflexical")
    private static final SubLSymbol $onethousand$ = makeSymbol("*ONETHOUSAND*");

    // deflexical
    @LispMethod(comment = "deflexical")
    private static final SubLSymbol $onemillion$ = makeSymbol("*ONEMILLION*");

    // deflexical
    @LispMethod(comment = "deflexical")
    private static final SubLSymbol $onebillion$ = makeSymbol("*ONEBILLION*");

    // deflexical
    @LispMethod(comment = "deflexical")
    private static final SubLSymbol $onetrillion$ = makeSymbol("*ONETRILLION*");

    // deflexical
    /**
     * all denominators that can't be built by simply appending a th(s) to the base
     * form
     */
    @LispMethod(comment = "all denominators that can\'t be built by simply appending a th(s) to the base\r\nform\ndeflexical\nall denominators that can\'t be built by simply appending a th(s) to the base\nform")
    private static final SubLSymbol $irregular_denominators$ = makeSymbol("*IRREGULAR-DENOMINATORS*");

    // defparameter
    // a hashtable mapping atomic English number strings to numbers
    /**
     * a hashtable mapping atomic English number strings to numbers
     */
    @LispMethod(comment = "a hashtable mapping atomic English number strings to numbers\ndefparameter")
    private static final SubLSymbol $number_values$ = makeSymbol("*NUMBER-VALUES*");

    // defparameter
    @LispMethod(comment = "defparameter")
    private static final SubLSymbol $denominator$ = makeSymbol("*DENOMINATOR*");

    // defparameter
    @LispMethod(comment = "defparameter")
    private static final SubLSymbol $zero$ = makeSymbol("*ZERO*");

    // defparameter
    @LispMethod(comment = "defparameter")
    private static final SubLSymbol $indefinite$ = makeSymbol("*INDEFINITE*");

    // defparameter
    @LispMethod(comment = "defparameter")
    private static final SubLSymbol $deci$ = makeSymbol("*DECI*");

    // defparameter
    @LispMethod(comment = "defparameter")
    private static final SubLSymbol $teen$ = makeSymbol("*TEEN*");

    // defparameter
    /**
     *
     *
     * @unknown baxter
     */
    @LispMethod(comment = "@unknown baxter\ndefparameter")
    private static final SubLSymbol $fuzzy$ = makeSymbol("*FUZZY*");

    // defparameter
    @LispMethod(comment = "defparameter")
    private static final SubLSymbol $atomic_ten$ = makeSymbol("*ATOMIC-TEN*");

    // defparameter
    @LispMethod(comment = "defparameter")
    private static final SubLSymbol $hyphenated_non_atomic_ten$ = makeSymbol("*HYPHENATED-NON-ATOMIC-TEN*");

    // defparameter
    @LispMethod(comment = "defparameter")
    private static final SubLSymbol $non_atomic_ten$ = makeSymbol("*NON-ATOMIC-TEN*");

    // defparameter
    @LispMethod(comment = "defparameter")
    private static final SubLSymbol $cent$ = makeSymbol("*CENT*");

    // defparameter
    @LispMethod(comment = "defparameter")
    private static final SubLSymbol $standard_hundred$ = makeSymbol("*STANDARD-HUNDRED*");

    // defparameter
    /**
     *
     *
     * @unknown baxter
     */
    @LispMethod(comment = "@unknown baxter\ndefparameter")
    private static final SubLSymbol $a_few$ = makeSymbol("*A-FEW*");

    // defparameter
    @LispMethod(comment = "defparameter")
    private static final SubLSymbol $extended_hundred$ = makeSymbol("*EXTENDED-HUNDRED*");

    // defparameter
    /**
     *
     *
     * @unknown baxter
     */
    @LispMethod(comment = "@unknown baxter\ndefparameter")
    private static final SubLSymbol $standard_dozen$ = makeSymbol("*STANDARD-DOZEN*");

    // defparameter
    /**
     *
     *
     * @unknown baxter
     */
    @LispMethod(comment = "@unknown baxter\ndefparameter")
    private static final SubLSymbol $extended_dozen$ = makeSymbol("*EXTENDED-DOZEN*");

    // defparameter
    @LispMethod(comment = "defparameter")
    private static final SubLSymbol $kilo$ = makeSymbol("*KILO*");

    // defparameter
    @LispMethod(comment = "defparameter")
    private static final SubLSymbol $thousand$ = makeSymbol("*THOUSAND*");

    // defparameter
    @LispMethod(comment = "defparameter")
    private static final SubLSymbol $milli$ = makeSymbol("*MILLI*");

    // defparameter
    @LispMethod(comment = "defparameter")
    private static final SubLSymbol $million$ = makeSymbol("*MILLION*");

    // defparameter
    @LispMethod(comment = "defparameter")
    private static final SubLSymbol $billi$ = makeSymbol("*BILLI*");

    // defparameter
    @LispMethod(comment = "defparameter")
    private static final SubLSymbol $billion$ = makeSymbol("*BILLION*");

    // defparameter
    @LispMethod(comment = "defparameter")
    private static final SubLSymbol $trilli$ = makeSymbol("*TRILLI*");

    // defparameter
    @LispMethod(comment = "defparameter")
    private static final SubLSymbol $trillion$ = makeSymbol("*TRILLION*");

    // defparameter
    @LispMethod(comment = "defparameter")
    private static final SubLSymbol $integer$ = makeSymbol("*INTEGER*");

    // defparameter
    @LispMethod(comment = "defparameter")
    private static final SubLSymbol $number$ = makeSymbol("*NUMBER*");

    // defparameter
    @LispMethod(comment = "defparameter")
    private static final SubLSymbol $fraction$ = makeSymbol("*FRACTION*");

    // defparameter
    @LispMethod(comment = "defparameter")
    private static final SubLSymbol $half$ = makeSymbol("*HALF*");

    // defparameter
    @LispMethod(comment = "defparameter")
    private static final SubLSymbol $float$ = makeSymbol("*FLOAT*");

    // defparameter
    @LispMethod(comment = "defparameter")
    private static final SubLSymbol $negative_number_string$ = makeSymbol("*NEGATIVE-NUMBER-STRING*");

    // defparameter
    @LispMethod(comment = "defparameter")
    public static final SubLSymbol $proper_interval$ = makeSymbol("*PROPER-INTERVAL*");

    // defparameter
    @LispMethod(comment = "defparameter")
    private static final SubLSymbol $interval$ = makeSymbol("*INTERVAL*");

    // defparameter
    @LispMethod(comment = "defparameter")
    public static final SubLSymbol $english_interval_parser$ = makeSymbol("*ENGLISH-INTERVAL-PARSER*");

    // defparameter
    @LispMethod(comment = "defparameter")
    private static final SubLSymbol $negative_number$ = makeSymbol("*NEGATIVE-NUMBER*");

    // defparameter
    @LispMethod(comment = "defparameter")
    private static final SubLSymbol $exponentiation$ = makeSymbol("*EXPONENTIATION*");

    // defparameter
    @LispMethod(comment = "defparameter")
    private static final SubLSymbol $multiplication$ = makeSymbol("*MULTIPLICATION*");

    // defparameter
    @LispMethod(comment = "defparameter")
    public static final SubLSymbol $digit_interval_parser$ = makeSymbol("*DIGIT-INTERVAL-PARSER*");

    // Internal Constants
    @LispMethod(comment = "Internal Constants")
    static private final SubLList $list0 = list(cons(makeString("zero"), ZERO_INTEGER));

    static private final SubLList $list1 = list(cons(makeString("a"), ONE_INTEGER));

    static private final SubLList $list2 = list(new SubLObject[]{ cons(makeString("one"), ONE_INTEGER), cons(makeString("two"), TWO_INTEGER), cons(makeString("three"), THREE_INTEGER), cons(makeString("four"), FOUR_INTEGER), cons(makeString("five"), FIVE_INTEGER), cons(makeString("six"), SIX_INTEGER), cons(makeString("seven"), SEVEN_INTEGER), cons(makeString("eight"), EIGHT_INTEGER), cons(makeString("nine"), NINE_INTEGER) });

    static private final SubLList $list3 = list(new SubLObject[]{ cons(makeString("ten"), TEN_INTEGER), cons(makeString("eleven"), ELEVEN_INTEGER), cons(makeString("twelve"), TWELVE_INTEGER), cons(makeString("thirteen"), THIRTEEN_INTEGER), cons(makeString("fourteen"), FOURTEEN_INTEGER), cons(makeString("fifteen"), FIFTEEN_INTEGER), cons(makeString("sixteen"), SIXTEEN_INTEGER), cons(makeString("seventeen"), SEVENTEEN_INTEGER), cons(makeString("eighteen"), EIGHTEEN_INTEGER), cons(makeString("nineteen"), NINETEEN_INTEGER) });

    static private final SubLList $list4 = list(cons(makeString("several"), reader_make_constant_shell("Several-Quant")));

    static private final SubLList $list5 = list(cons(makeString("twenty"), TWENTY_INTEGER), cons(makeString("thirty"), makeInteger(30)), cons(makeString("forty"), makeInteger(40)), cons(makeString("fifty"), makeInteger(50)), cons(makeString("sixty"), makeInteger(60)), cons(makeString("seventy"), makeInteger(70)), cons(makeString("eighty"), makeInteger(80)), cons(makeString("ninety"), makeInteger(90)));

    static private final SubLList $list6 = list(cons(makeString("dozen"), TWELVE_INTEGER));

    static private final SubLList $list7 = list(cons(makeString("hundred"), makeInteger(100)));

    static private final SubLList $list8 = list(cons(makeString("thousand"), makeInteger(1000)));

    static private final SubLList $list9 = list(cons(makeString("million"), makeInteger(0xf4240)));

    static private final SubLList $list10 = list(cons(makeString("billion"), makeInteger(0x3b9aca00)));

    static private final SubLList $list11 = list(cons(makeString("trillion"), makeInteger("1000000000000")));

    static private final SubLList $list12 = list(new SubLObject[]{ cons(makeString("first"), ONE_INTEGER), cons(makeString("second"), TWO_INTEGER), cons(makeString("half"), TWO_INTEGER), cons(makeString("halves"), TWO_INTEGER), cons(makeString("third"), THREE_INTEGER), cons(makeString("quarter"), FOUR_INTEGER), cons(makeString("fifth"), FIVE_INTEGER), cons(makeString("eighth"), EIGHT_INTEGER), cons(makeString("twelfth"), TWELVE_INTEGER), cons(makeString("twelvth"), TWELVE_INTEGER), cons(makeString("twentieth"), TWENTY_INTEGER), cons(makeString("thirtieth"), makeInteger(30)), cons(makeString("fortieth"), makeInteger(40)), cons(makeString("fiftieth"), makeInteger(50)), cons(makeString("sixtieth"), makeInteger(60)), cons(makeString("seventieth"), makeInteger(70)), cons(makeString("eightieth"), makeInteger(80)), cons(makeString("ninetieth"), makeInteger(90)) });

    static private final SubLString $str14$_ = makeString(",");

    static private final SubLString $$$s = makeString("s");

    static private final SubLString $$$th = makeString("th");

    static private final SubLString $$$ths = makeString("ths");

    static private final SubLList $list19 = list(CHAR_hyphen);









    static private final SubLString $$$zero = makeString("zero");

    static private final SubLSymbol $sym32$NUMERAL_PARSER_STRING_ = makeSymbol("NUMERAL-PARSER-STRING=");

    static private final SubLString $str33$_ = makeString("-");

    private static final SubLSymbol $NON_ATOMIC_TEN = makeKeyword("NON-ATOMIC-TEN");

    static private final SubLString $$$and = makeString("and");

    static private final SubLString $$$dozen = makeString("dozen");

    static private final SubLString $$$few = makeString("few");

    static private final SubLString $$$hundred = makeString("hundred");

    static private final SubLString $$$thousand = makeString("thousand");

    static private final SubLString $$$million = makeString("million");

    static private final SubLString $$$millions = makeString("millions");

    static private final SubLString $$$billions = makeString("billions");

    static private final SubLString $$$billion = makeString("billion");

    static private final SubLString $$$trillions = makeString("trillions");

    static private final SubLString $$$trillion = makeString("trillion");

    static private final SubLString $$$first = makeString("first");

    static private final SubLString $$$second = makeString("second");

    static private final SubLString $$$seconds = makeString("seconds");

    static private final SubLString $$$halves = makeString("halves");

    static private final SubLSymbol $sym70$NUMERAL_PARSER_CHAR_ = makeSymbol("NUMERAL-PARSER-CHAR=");

    static private final SubLString $$$half = makeString("half");

    static private final SubLString $$$minus = makeString("minus");

    static private final SubLString $$$negative = makeString("negative");

    static private final SubLString $$$to = makeString("to");

    static private final SubLString $$$from = makeString("from");

    static private final SubLString $$$between = makeString("between");

    static private final SubLString $str81$_ = makeString("+");

    static private final SubLString $str82$Can_t_build_a_denominator_out_of_ = makeString("Can't build a denominator out of nothing!");

    private static final SubLSymbol SIGN_STRING = makeSymbol("SIGN-STRING");

    static private final SubLList $list89 = list(ONE_INTEGER);

    static private final SubLSymbol $sym90$ATOMIC_DENOMINATOR_LITERAL_ = makeSymbol("ATOMIC-DENOMINATOR-LITERAL?");

    static private final SubLList $list91 = list(list($EMIT), ONE_INTEGER);

    static private final SubLSymbol $sym92$ATOMIC_TEN_SIGN_ = makeSymbol("ATOMIC-TEN-SIGN?");

    static private final SubLList $list93 = list(list($EMIT), TWO_INTEGER);

    static private final SubLSymbol $sym94$DENOMINATOR_LITERAL_ = makeSymbol("DENOMINATOR-LITERAL?");

    private static final SubLSymbol BUILD_DENOMINATOR = makeSymbol("BUILD-DENOMINATOR");

    static private final SubLSymbol $sym97$ZERO_LITERAL_ = makeSymbol("ZERO-LITERAL?");

    private static final SubLSymbol BUILD_ZERO = makeSymbol("BUILD-ZERO");

    static private final SubLSymbol $sym99$INDEFINITE_LITERAL_ = makeSymbol("INDEFINITE-LITERAL?");

    private static final SubLSymbol BUILD_INDEFINITE = makeSymbol("BUILD-INDEFINITE");

    static private final SubLSymbol $sym102$DIGIT_SIGN_ = makeSymbol("DIGIT-SIGN?");

    static private final SubLSymbol $sym103$NUMBER_STRING_SIGN_ = makeSymbol("NUMBER-STRING-SIGN?");

    private static final SubLSymbol BUILD_DECI = makeSymbol("BUILD-DECI");

    static private final SubLSymbol $sym106$TEEN_SIGN_ = makeSymbol("TEEN-SIGN?");

    private static final SubLSymbol BUILD_TEEN = makeSymbol("BUILD-TEEN");

    static private final SubLSymbol $sym108$FUZZY_SIGN_ = makeSymbol("FUZZY-SIGN?");

    private static final SubLSymbol BUILD_FUZZY = makeSymbol("BUILD-FUZZY");

    private static final SubLSymbol BUILD_ATOMIC_TEN = makeSymbol("BUILD-ATOMIC-TEN");

    static private final SubLSymbol $sym112$HYPHENATED_NON_ATOMIC_TEN_SIGN_ = makeSymbol("HYPHENATED-NON-ATOMIC-TEN-SIGN?");

    private static final SubLSymbol BUILD_HYPHENATED_NON_ATOMIC_TEN = makeSymbol("BUILD-HYPHENATED-NON-ATOMIC-TEN");

    static private final SubLSymbol $sym114$HYPHEN_SIGN_ = makeSymbol("HYPHEN-SIGN?");

    static private final SubLList $list115 = list(TWO_INTEGER);

    static private final SubLSymbol $sym116$DECI_SIGN_ = makeSymbol("DECI-SIGN?");

    static private final SubLList $list117 = list(list($EMIT), THREE_INTEGER);

    private static final SubLSymbol BUILD_NON_ATOMIC_TEN = makeSymbol("BUILD-NON-ATOMIC-TEN");

    static private final SubLSymbol $sym119$NON_ATOMIC_TEN_SIGN_ = makeSymbol("NON-ATOMIC-TEN-SIGN?");

    private static final SubLSymbol BUILD_CENT = makeSymbol("BUILD-CENT");

    static private final SubLSymbol $sym121$AND_LITERAL_ = makeSymbol("AND-LITERAL?");

    static private final SubLSymbol $sym122$INDEFINITE_SIGN_ = makeSymbol("INDEFINITE-SIGN?");

    static private final SubLSymbol $sym123$HUNDRED_LITERAL_ = makeSymbol("HUNDRED-LITERAL?");

    static private final SubLSymbol $sym124$CENT_SIGN_ = makeSymbol("CENT-SIGN?");

    private static final SubLSymbol SIGN_P = makeSymbol("SIGN-P");

    static private final SubLList $list126 = list(list(makeKeyword("REMEMBER"), makeKeyword("BACKUP")), TWO_INTEGER);

    static private final SubLList $list127 = list(THREE_INTEGER, makeKeyword("END"), NIL, TWO_INTEGER);

    static private final SubLList $list128 = list(list(makeKeyword("BACKUP")), FIVE_INTEGER);

    static private final SubLSymbol $sym129$FRACTION_SIGN_ = makeSymbol("FRACTION-SIGN?");

    private static final SubLSymbol BUILD_STANDARD_HUNDRED = makeSymbol("BUILD-STANDARD-HUNDRED");

    private static final SubLObject $$AFew_Quant = reader_make_constant_shell("AFew-Quant");

    static private final SubLSymbol $sym132$FEW_LITERAL_ = makeSymbol("FEW-LITERAL?");

    private static final SubLSymbol BUILD_A_FEW = makeSymbol("BUILD-A-FEW");

    static private final SubLList $list134 = list(list(makeKeyword("BACKUP")), TWO_INTEGER);

    private static final SubLSymbol BUILD_EXTENDED_HUNDRED = makeSymbol("BUILD-EXTENDED-HUNDRED");

    static private final SubLSymbol $sym136$DOZEN_LITERAL_ = makeSymbol("DOZEN-LITERAL?");

    private static final SubLSymbol BUILD_STANDARD_DOZEN = makeSymbol("BUILD-STANDARD-DOZEN");

    private static final SubLSymbol BUILD_EXTENDED_DOZEN = makeSymbol("BUILD-EXTENDED-DOZEN");

    // Internal Constants
    @LispMethod(comment = "Internal Constants")
    static private final SubLList $list_alt0 = list(cons(makeString("zero"), ZERO_INTEGER));

    static private final SubLSymbol $sym139$STANDARD_HUNDRED_SIGN_ = makeSymbol("STANDARD-HUNDRED-SIGN?");

    static private final SubLSymbol $sym140$EXTENDED_HUNDRED_SIGN_ = makeSymbol("EXTENDED-HUNDRED-SIGN?");

    static private final SubLList $list_alt1 = list(cons(makeString("a"), ONE_INTEGER));

    static private final SubLList $list_alt2 = list(new SubLObject[]{ cons(makeString("one"), ONE_INTEGER), cons(makeString("two"), TWO_INTEGER), cons(makeString("three"), THREE_INTEGER), cons(makeString("four"), FOUR_INTEGER), cons(makeString("five"), FIVE_INTEGER), cons(makeString("six"), SIX_INTEGER), cons(makeString("seven"), SEVEN_INTEGER), cons(makeString("eight"), EIGHT_INTEGER), cons(makeString("nine"), NINE_INTEGER) });

    static private final SubLSymbol $sym141$FLOAT_SIGN_ = makeSymbol("FLOAT-SIGN?");

    private static final SubLSymbol BUILD_KILO = makeSymbol("BUILD-KILO");

    static private final SubLSymbol $sym144$KILO_SIGN_ = makeSymbol("KILO-SIGN?");

    static private final SubLSymbol $sym145$THOUSAND_LITERAL_ = makeSymbol("THOUSAND-LITERAL?");

    private static final SubLSymbol BUILD_THOUSAND = makeSymbol("BUILD-THOUSAND");

    static private final SubLList $list_alt3 = list(new SubLObject[]{ cons(makeString("ten"), TEN_INTEGER), cons(makeString("eleven"), ELEVEN_INTEGER), cons(makeString("twelve"), TWELVE_INTEGER), cons(makeString("thirteen"), THIRTEEN_INTEGER), cons(makeString("fourteen"), FOURTEEN_INTEGER), cons(makeString("fifteen"), FIFTEEN_INTEGER), cons(makeString("sixteen"), SIXTEEN_INTEGER), cons(makeString("seventeen"), SEVENTEEN_INTEGER), cons(makeString("eighteen"), EIGHTEEN_INTEGER), cons(makeString("nineteen"), NINETEEN_INTEGER) });

    static private final SubLSymbol $sym147$THOUSAND_SIGN_ = makeSymbol("THOUSAND-SIGN?");

    private static final SubLSymbol BUILD_MILLI = makeSymbol("BUILD-MILLI");

    private static final SubLInteger $int$1000000 = makeInteger(0xf4240);

    static private final SubLSymbol $sym150$MILLI_SIGN_ = makeSymbol("MILLI-SIGN?");

    static private final SubLSymbol $sym151$MILLION_LITERAL_ = makeSymbol("MILLION-LITERAL?");

    private static final SubLSymbol BUILD_MILLION = makeSymbol("BUILD-MILLION");

    static private final SubLSymbol $sym153$MILLION_SIGN_ = makeSymbol("MILLION-SIGN?");

    static private final SubLList $list_alt4 = list(cons(makeString("several"), reader_make_constant_shell("Several-Quant")));

    private static final SubLSymbol BUILD_BILLI = makeSymbol("BUILD-BILLI");

    static private final SubLList $list_alt5 = list(cons(makeString("twenty"), TWENTY_INTEGER), cons(makeString("thirty"), makeInteger(30)), cons(makeString("forty"), makeInteger(40)), cons(makeString("fifty"), makeInteger(50)), cons(makeString("sixty"), makeInteger(60)), cons(makeString("seventy"), makeInteger(70)), cons(makeString("eighty"), makeInteger(80)), cons(makeString("ninety"), makeInteger(90)));

    private static final SubLInteger $int$1000000000 = makeInteger(0x3b9aca00);

    static private final SubLSymbol $sym156$BILLI_SIGN_ = makeSymbol("BILLI-SIGN?");

    static private final SubLSymbol $sym157$BILLION_LITERAL_ = makeSymbol("BILLION-LITERAL?");

    private static final SubLSymbol BUILD_BILLION = makeSymbol("BUILD-BILLION");

    static private final SubLSymbol $sym159$BILLION_SIGN_ = makeSymbol("BILLION-SIGN?");

    static private final SubLList $list_alt6 = list(cons(makeString("dozen"), TWELVE_INTEGER));

    private static final SubLSymbol BUILD_TRILLI = makeSymbol("BUILD-TRILLI");

    static private final SubLList $list_alt7 = list(cons(makeString("hundred"), makeInteger(100)));

    private static final SubLInteger $int$1000000000000 = makeInteger("1000000000000");

    static private final SubLList $list_alt8 = list(cons(makeString("thousand"), makeInteger(1000)));

    static private final SubLSymbol $sym162$TRILLI_SIGN_ = makeSymbol("TRILLI-SIGN?");

    static private final SubLList $list_alt9 = list(cons(makeString("million"), makeInteger(1000000)));

    static private final SubLSymbol $sym163$TRILLION_LITERAL_ = makeSymbol("TRILLION-LITERAL?");

    private static final SubLSymbol BUILD_TRILLION = makeSymbol("BUILD-TRILLION");

    static private final SubLList $list_alt10 = list(cons(makeString("billion"), makeInteger("1000000000")));

    static private final SubLSymbol $sym165$TRILLION_SIGN_ = makeSymbol("TRILLION-SIGN?");

    static private final SubLList $list_alt11 = list(cons(makeString("trillion"), makeInteger("1000000000000")));

    private static final SubLSymbol BUILD_INTEGER = makeSymbol("BUILD-INTEGER");

    static private final SubLList $list_alt12 = list(new SubLObject[]{ cons(makeString("first"), ONE_INTEGER), cons(makeString("second"), TWO_INTEGER), cons(makeString("half"), TWO_INTEGER), cons(makeString("halves"), TWO_INTEGER), cons(makeString("third"), THREE_INTEGER), cons(makeString("quarter"), FOUR_INTEGER), cons(makeString("fifth"), FIVE_INTEGER), cons(makeString("eighth"), EIGHT_INTEGER), cons(makeString("twelfth"), TWELVE_INTEGER), cons(makeString("twelvth"), TWELVE_INTEGER), cons(makeString("twentieth"), TWENTY_INTEGER), cons(makeString("thirtieth"), makeInteger(30)), cons(makeString("fortieth"), makeInteger(40)), cons(makeString("fiftieth"), makeInteger(50)), cons(makeString("sixtieth"), makeInteger(60)), cons(makeString("seventieth"), makeInteger(70)), cons(makeString("eightieth"), makeInteger(80)), cons(makeString("ninetieth"), makeInteger(90)) });

    static private final SubLSymbol $sym167$INTEGER_SIGN_ = makeSymbol("INTEGER-SIGN?");

    static private final SubLSymbol $sym168$STANDARD_DOZEN_SIGN_ = makeSymbol("STANDARD-DOZEN-SIGN?");

    static private final SubLSymbol $sym169$EXTENDED_DOZEN_SIGN_ = makeSymbol("EXTENDED-DOZEN-SIGN?");

    private static final SubLSymbol BUILD_NUMBER = makeSymbol("BUILD-NUMBER");

    static private final SubLSymbol $sym171$NUMBER_SIGN_ = makeSymbol("NUMBER-SIGN?");

    static private final SubLSymbol $sym172$DENOMINATOR_SIGN_ = makeSymbol("DENOMINATOR-SIGN?");

    private static final SubLSymbol BUILD_FRACTION = makeSymbol("BUILD-FRACTION");

    private static final SubLFloat $float$0_5 = makeDouble(0.5);

    static private final SubLSymbol $sym175$HALF_SIGN_ = makeSymbol("HALF-SIGN?");

    private static final SubLSymbol BUILD_HALF = makeSymbol("BUILD-HALF");

    static private final SubLString $str_alt14$_ = makeString(",");

    static private final SubLList $list177 = list(THREE_INTEGER);

    private static final SubLSymbol BUILD_FLOAT = makeSymbol("BUILD-FLOAT");

    static private final SubLSymbol $sym179$MINUS_LITERAL_ = makeSymbol("MINUS-LITERAL?");

    static private final SubLList $list_alt19 = list(CHAR_hyphen);

    private static final SubLSymbol BUILD_NEGATIVE_NUMBER = makeSymbol("BUILD-NEGATIVE-NUMBER");



    private static final SubLSymbol SIGN_INFO = makeSymbol("SIGN-INFO");

    static private final SubLSymbol $sym184$_ = makeSymbol("<");

    static private final SubLList $list185 = list(FOUR_INTEGER);

    static private final SubLSymbol $sym186$FROM_LITERAL_ = makeSymbol("FROM-LITERAL?");

    static private final SubLSymbol $sym187$BETWEEN_LITERAL_ = makeSymbol("BETWEEN-LITERAL?");

    static private final SubLList $list188 = list(list($EMIT), FIVE_INTEGER);

    static private final SubLSymbol $sym189$TO_LITERAL_ = makeSymbol("TO-LITERAL?");

    static private final SubLString $str_alt33$_ = makeString("-");

    static private final SubLList $list190 = list(list($EMIT), FOUR_INTEGER);

    static private final SubLList $list191 = list(list($EMIT), SIX_INTEGER);

    static private final SubLList $list192 = list(list($EMIT), SEVEN_INTEGER);

    private static final SubLSymbol BUILD_PROPER_INTERVAL = makeSymbol("BUILD-PROPER-INTERVAL");

    static private final SubLSymbol $sym194$PROPER_INTERVAL_SIGN_ = makeSymbol("PROPER-INTERVAL-SIGN?");

    private static final SubLSymbol BUILD_INTERVAL = makeSymbol("BUILD-INTERVAL");

    static private final SubLString $str197$_ = makeString("*");

    static private final SubLString $str198$_ = makeString("^");

    static private final SubLSymbol $sym199$MINUS_SIGN_ = makeSymbol("MINUS-SIGN?");

    static private final SubLSymbol $sym200$EXPT_OPERATOR_SIGN_ = makeSymbol("EXPT-OPERATOR-SIGN?");

    private static final SubLSymbol BUILD_EXPONENTIATION_PHRASE = makeSymbol("BUILD-EXPONENTIATION-PHRASE");

    static private final SubLSymbol $sym202$MULT_SIGN_ = makeSymbol("MULT-SIGN?");

    static private final SubLSymbol $sym203$EXPONENTIATION_SIGN_ = makeSymbol("EXPONENTIATION-SIGN?");

    private static final SubLSymbol BUILD_MULTIPLICATION_PHRASE = makeSymbol("BUILD-MULTIPLICATION-PHRASE");

    private static final SubLSymbol LEX_NUMERALS = makeSymbol("LEX-NUMERALS");

    private static final SubLSymbol STRING_TO_INTERVAL_CACHED = makeSymbol("STRING-TO-INTERVAL-CACHED");

    private static final SubLSymbol $IGNORE_ERRORS_TARGET = makeKeyword("IGNORE-ERRORS-TARGET");

    private static final SubLSymbol IGNORE_ERRORS_HANDLER = makeSymbol("IGNORE-ERRORS-HANDLER", "SUBLISP");

    private static final SubLSymbol $string_to_interval_cached_caching_state$ = makeSymbol("*STRING-TO-INTERVAL-CACHED-CACHING-STATE*");

    static private final SubLString $str_alt81$_ = makeString("+");

    static private final SubLString $str_alt82$Can_t_build_a_denominator_out_of_ = makeString("Can't build a denominator out of nothing!");

    static private final SubLList $list_alt89 = list(ONE_INTEGER);

    static private final SubLList $list_alt91 = list(list($EMIT), ONE_INTEGER);

    static private final SubLList $list_alt93 = list(list($EMIT), TWO_INTEGER);

    static private final SubLList $list_alt115 = list(TWO_INTEGER);

    static private final SubLList $list_alt117 = list(list($EMIT), THREE_INTEGER);

    static private final SubLList $list_alt126 = list(list(makeKeyword("REMEMBER"), makeKeyword("BACKUP")), TWO_INTEGER);

    static private final SubLList $list_alt127 = list(THREE_INTEGER, makeKeyword("END"), NIL, TWO_INTEGER);

    static private final SubLList $list_alt128 = list(list(makeKeyword("BACKUP")), FIVE_INTEGER);

    static private final SubLList $list_alt134 = list(list(makeKeyword("BACKUP")), TWO_INTEGER);

    static private final SubLList $list_alt177 = list(THREE_INTEGER);

    static private final SubLList $list_alt185 = list(FOUR_INTEGER);

    static private final SubLList $list_alt188 = list(list($EMIT), FIVE_INTEGER);

    static private final SubLList $list_alt190 = list(list($EMIT), FOUR_INTEGER);

    static private final SubLList $list_alt191 = list(list($EMIT), SIX_INTEGER);

    static private final SubLList $list_alt192 = list(list($EMIT), SEVEN_INTEGER);

    static private final SubLString $str_alt197$_ = makeString("*");

    static private final SubLString $str_alt198$_ = makeString("^");

    private static final SubLSymbol STRING_TO_INTERVAL = makeSymbol("STRING-TO-INTERVAL");

    public static final SubLSymbol $kw212$_MEMOIZED_ITEM_NOT_FOUND_ = makeKeyword("&MEMOIZED-ITEM-NOT-FOUND&");

    static private final SubLList $list_alt213 = cons(makeString("two"), TWO_INTEGER);

    static private final SubLList $list_alt214 = cons(makeString("2"), TWO_INTEGER);

    static private final SubLList $list_alt215 = cons(makeString("a hundred"), makeInteger(100));

    static private final SubLList $list_alt216 = cons(makeString("28.7"), makeDouble(28.7));

    static private final SubLList $list_alt217 = cons(makeString("28,000.75"), makeDouble(28000.75));

    static private final SubLList $list_alt218 = cons(makeString("four hundred"), makeInteger(400));

    static private final SubLList $list_alt219 = cons(makeString("a dozen"), TWELVE_INTEGER);

    static private final SubLList $list_alt220 = list(makeString("a few thousand"), reader_make_constant_shell("TimesFn"), reader_make_constant_shell("AFew-Quant"), makeInteger(1000));

    static private final SubLList $list_alt221 = cons(makeString("fifteen hundred"), makeInteger(1500));

    static private final SubLList $list_alt222 = cons(makeString("five thousand"), makeInteger(5000));

    static private final SubLList $list_alt223 = cons(makeString("sixty thousand"), makeInteger(60000));

    static private final SubLList $list_alt224 = cons(makeString("seven hundred thousand"), makeInteger(700000));

    static private final SubLList $list_alt225 = cons(makeString("eight million"), makeInteger(8000000));

    static private final SubLList $list_alt226 = cons(makeString("one hundred twenty-two"), makeInteger(122));

    static private final SubLList $list_alt227 = cons(makeString("sixty million one"), makeInteger(60000001));

    static private final SubLList $list_alt228 = cons(makeString("four trillion"), makeDouble(4.0E12));

    static private final SubLString $$$two_thirds = makeString("two thirds");

    static private final SubLList $list_alt230 = list(makeString("several hundred"), reader_make_constant_shell("TimesFn"), reader_make_constant_shell("Several-Quant"), makeInteger(100));

    static private final SubLList $list_alt231 = list(makeString("between 3 and 5"), reader_make_constant_shell("Unity"), THREE_INTEGER, FIVE_INTEGER);

    static private final SubLList $list_alt232 = list(makeString("between three and five hundred"), reader_make_constant_shell("Unity"), THREE_INTEGER, makeInteger(500));

    static private final SubLList $list_alt233 = list(makeString("between three and 500"), reader_make_constant_shell("Unity"), THREE_INTEGER, makeInteger(500));

    static private final SubLString $str_alt234$between_two_hundred_and_two_third = makeString("between two hundred and two thirds");

    static private final SubLList $list_alt235 = list(makeInteger(200));

    static private final SubLList $list_alt236 = cons(makeString("one fifth"), makeDouble(0.2));

    static private final SubLString $$$one_twenty_second = makeString("one twenty second");



    static private final SubLList $list_alt239 = list(list(makeString("one second")), list(makeString("5 seconds")), list(makeString("second")), cons(makeString("-5"), makeInteger(-5)), cons(makeString("negative 7.3"), makeDouble(-7.3)), cons(makeString("+43"), makeInteger(43)), list(makeString("3 to 7"), reader_make_constant_shell("Unity"), THREE_INTEGER, SEVEN_INTEGER), list(makeString("3 - 7"), reader_make_constant_shell("Unity"), THREE_INTEGER, SEVEN_INTEGER));

    static private final SubLList $list_alt240 = cons(makeSymbol("STRING"), makeSymbol("INTERVAL"));

    static private final SubLString $str_alt241$___D_of__D_tests_succeeded___ = makeString("~%~D of ~D tests succeeded.~%");

    static private final SubLString $str_alt242$_S___parsed_to__S___instead_of__S = makeString("~S~% parsed to ~S~% instead of ~S~%");
}

