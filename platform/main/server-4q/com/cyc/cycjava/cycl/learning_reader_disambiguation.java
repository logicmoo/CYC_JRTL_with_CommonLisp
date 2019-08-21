/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 */
package com.cyc.cycjava.cycl;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_A;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_asterisk;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_space;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.alpha_char_p;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.char_code;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.code_char;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.append;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.cons;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.listS;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.make_list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.nth;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.set_nth;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.bind;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.currentBinding;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.rebind;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality.eq;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality.eql;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Eval.eval;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions.apply;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions.funcall;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.abs;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.add;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.ceiling;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.divide;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.expt;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.floor;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.integerDivide;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.log;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.multiply;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.numG;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.numL;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.subtract;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Packages.intern;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow.format;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.cconcatenate;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.delete;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.delete_duplicates;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.find;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.find_if;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.length;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.nreverse;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.remove;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.remove_if;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.subseq;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.boundp;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.fboundp;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.symbol_function;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.symbol_name;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.$is_thread_performing_cleanupP$;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.current_process;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.sleep;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time.get_internal_real_time;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time.get_universal_time;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.arg2;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.multiple_value_list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.nth_value_step_1;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.nth_value_step_2;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.resetMultipleValues;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.values;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeBoolean;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeDouble;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeInteger;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeKeyword;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeString;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeSymbol;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeUninternedSymbol;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.cdestructuring_bind_error;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.destructuring_bind_must_consp;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.destructuring_bind_must_listp;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.property_list_member;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.butlast;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.cadr;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.copy_list;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.copy_tree;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.getf;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.intersection;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.member;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.putf;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.second;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.third;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high.princ;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader.bq_cons;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader.read_ignoring_errors;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.close;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.force_output;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.get_output_stream_string;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.make_private_string_output_stream;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.terpri;
import static com.cyc.tool.subl.util.SubLFiles.declareFunction;
import static com.cyc.tool.subl.util.SubLFiles.declareMacro;
import static com.cyc.tool.subl.util.SubLFiles.deflexical;
import static com.cyc.tool.subl.util.SubLFiles.defparameter;

import com.cyc.cycjava.cycl.inference.ask_utilities;
import com.cyc.cycjava.cycl.inference.harness.inference_kernel;
import com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_conceptually_related;
import com.cyc.cycjava.cycl.sbhl.sbhl_graphs;
import com.cyc.cycjava.cycl.sbhl.sbhl_link_vars;
import com.cyc.cycjava.cycl.sbhl.sbhl_links;
import com.cyc.cycjava.cycl.sbhl.sbhl_macros;
import com.cyc.cycjava.cycl.sbhl.sbhl_marking_utilities;
import com.cyc.cycjava.cycl.sbhl.sbhl_marking_vars;
import com.cyc.cycjava.cycl.sbhl.sbhl_module_utilities;
import com.cyc.cycjava.cycl.sbhl.sbhl_module_vars;
import com.cyc.cycjava.cycl.sbhl.sbhl_paranoia;
import com.cyc.cycjava.cycl.sbhl.sbhl_search_utilities;
import com.cyc.cycjava.cycl.sbhl.sbhl_search_vars;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Filesys;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.StreamsLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Strings;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLFloat;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.compatibility;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.random;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.time_high;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTrampolineFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 *  module:      LEARNING-READER-DISAMBIGUATION
 *  source file: /cyc/top/cycl/learning-reader-disambiguation.lisp
 *  created:     2019/07/03 17:39:00
 */
public final class learning_reader_disambiguation extends SubLTranslatedFile implements V02 {
    // // Constructor
    private learning_reader_disambiguation() {
    }

    public static final SubLFile me = new learning_reader_disambiguation();


    // // Definitions
    // defparameter
    private static final SubLSymbol $l2r_document$ = makeSymbol("*L2R-DOCUMENT*");

    public static final SubLObject l2r_document() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            return $l2r_document$.getDynamicValue(thread);
        }
    }

    /**
     * ALIST-P mapping parameter to (min initial max granularity values) tuples
     */
    // deflexical
    private static final SubLSymbol $topic_struct_tweakable_parameters$ = makeSymbol("*TOPIC-STRUCT-TWEAKABLE-PARAMETERS*");

    public static final SubLObject def_topic_struct_tweakable_parameter(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject name = NIL;
            SubLObject min = NIL;
            SubLObject initial = NIL;
            SubLObject max = NIL;
            SubLObject granularity = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt0);
            name = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt0);
            min = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt0);
            initial = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt0);
            max = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt0);
            granularity = current.first();
            current = current.rest();
            {
                SubLObject doc_string = (current.isCons()) ? ((SubLObject) (current.first())) : NIL;
                destructuring_bind_must_listp(current, datum, $list_alt0);
                current = current.rest();
                if (NIL == current) {
                    {
                        SubLObject getter_name = intern(format_nil.format_nil_a(string_utilities.trim_sides(symbol_name(name), CHAR_asterisk)), UNPROVIDED);
                        return list(PROGN, list(DEFPARAMETER_PRIVATE, name, initial, doc_string), list(DEFINE_PRIVATE, getter_name, NIL, list(RET, list(TOPIC_STRUCT_PARAMETER_VALUE, list(QUOTE, name)))), list(REGISTER_TWEAKABLE_PARAMETER, list(QUOTE, name), min, initial, max, granularity));
                    }
                } else {
                    cdestructuring_bind_error(datum, $list_alt0);
                }
            }
        }
        return NIL;
    }

    public static final SubLObject register_tweakable_parameter(SubLObject name, SubLObject min, SubLObject initial, SubLObject max, SubLObject granularity) {
        {
            SubLObject info = list(min, initial, max, granularity);
            $topic_struct_tweakable_parameters$.setGlobalValue(list_utilities.alist_enter($topic_struct_tweakable_parameters$.getGlobalValue(), name, info, UNPROVIDED));
            return info;
        }
    }

    public static final SubLObject update_tweakable_parameter_initial_value(SubLObject parameter, SubLObject value) {
        {
            SubLObject existing = list_utilities.alist_lookup_without_values($topic_struct_tweakable_parameters$.getGlobalValue(), parameter, UNPROVIDED, UNPROVIDED);
            if (NIL != existing) {
                set_nth(ONE_INTEGER, existing, value);
            }
            return existing;
        }
    }

    public static final SubLObject tweakable_parameter_granularity(SubLObject parameter) {
        return nth(THREE_INTEGER, list_utilities.alist_lookup($topic_struct_tweakable_parameters$.getGlobalValue(), parameter, UNPROVIDED, UNPROVIDED));
    }

    public static final SubLObject tweakable_parameter_step_size(SubLObject parameter) {
        {
            SubLObject data = list_utilities.alist_lookup_without_values($topic_struct_tweakable_parameters$.getGlobalValue(), parameter, UNPROVIDED, UNPROVIDED);
            SubLObject datum = data;
            SubLObject current = datum;
            SubLObject min = NIL;
            SubLObject initial = NIL;
            SubLObject max = NIL;
            SubLObject granularity = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt9);
            min = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt9);
            initial = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt9);
            max = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt9);
            granularity = current.first();
            current = current.rest();
            {
                SubLObject values = (current.isCons()) ? ((SubLObject) (current.first())) : NIL;
                destructuring_bind_must_listp(current, datum, $list_alt9);
                current = current.rest();
                if (NIL == current) {
                    return divide(subtract(max, min), granularity);
                } else {
                    cdestructuring_bind_error(datum, $list_alt9);
                }
            }
        }
        return NIL;
    }

    public static final SubLObject tweakable_parameter_random_value(SubLObject parameter) {
        {
            SubLObject n = tweakable_parameter_random_value_num(parameter);
            return values(tweakable_parameter_nth_value(parameter, n), n);
        }
    }

    public static final SubLObject tweakable_parameter_random_value_num(SubLObject parameter) {
        {
            SubLObject data = list_utilities.alist_lookup_without_values($topic_struct_tweakable_parameters$.getGlobalValue(), parameter, UNPROVIDED, UNPROVIDED);
            SubLObject datum = data;
            SubLObject current = datum;
            SubLObject min = NIL;
            SubLObject initial = NIL;
            SubLObject max = NIL;
            SubLObject granularity = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt9);
            min = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt9);
            initial = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt9);
            max = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt9);
            granularity = current.first();
            current = current.rest();
            {
                SubLObject values = (current.isCons()) ? ((SubLObject) (current.first())) : NIL;
                destructuring_bind_must_listp(current, datum, $list_alt9);
                current = current.rest();
                if (NIL == current) {
                    {
                        SubLObject n = random.random(number_utilities.f_1X(granularity));
                        return n;
                    }
                } else {
                    cdestructuring_bind_error(datum, $list_alt9);
                }
            }
        }
        return NIL;
    }

    public static final SubLObject tweakable_parameter_nth_value(SubLObject parameter, SubLObject n) {
        {
            SubLObject data = list_utilities.alist_lookup_without_values($topic_struct_tweakable_parameters$.getGlobalValue(), parameter, UNPROVIDED, UNPROVIDED);
            SubLObject datum = data;
            SubLObject current = datum;
            SubLObject min = NIL;
            SubLObject initial = NIL;
            SubLObject max = NIL;
            SubLObject granularity = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt9);
            min = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt9);
            initial = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt9);
            max = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt9);
            granularity = current.first();
            current = current.rest();
            {
                SubLObject values = (current.isCons()) ? ((SubLObject) (current.first())) : NIL;
                destructuring_bind_must_listp(current, datum, $list_alt9);
                current = current.rest();
                if (NIL == current) {
                    if (NIL == values) {
                        values = compute_tweakable_values(min, max, granularity);
                        list_utilities.nadd_to_end(values, data);
                    }
                    return nth(n, values);
                } else {
                    cdestructuring_bind_error(datum, $list_alt9);
                }
            }
        }
        return NIL;
    }

    public static final SubLObject compute_tweakable_values(SubLObject min, SubLObject max, SubLObject granularity) {
        {
            SubLObject values = NIL;
            SubLObject cdotimes_end_var = number_utilities.f_1X(granularity);
            SubLObject n = NIL;
            for (n = ZERO_INTEGER; n.numL(cdotimes_end_var); n = add(n, ONE_INTEGER)) {
                values = cons(tweakable_parameter_nth_value_internal(min, max, granularity, n), values);
            }
            return nreverse(values);
        }
    }

    /**
     *
     *
     * @return NUMBERP; between MIN and MAX, inclusive.
    If N=0, return MIN. If N=GRANULARITY, return MAX.
     */
    public static final SubLObject tweakable_parameter_nth_value_internal(SubLObject min, SubLObject max, SubLObject granularity, SubLObject n) {
        SubLTrampolineFile.checkType(n, NON_NEGATIVE_INTEGER_P);
        SubLTrampolineFile.checkType(granularity, POSITIVE_INTEGER_P);
        if (n.eql(ZERO_INTEGER)) {
            return min;
        } else
            if (n.eql(granularity)) {
                return max;
            } else
                if (n.numG(granularity)) {
                    Errors.error($str_alt12$_S_exceeds_granularity__S, n, granularity);
                } else {
                    {
                        SubLObject step_size = divide(subtract(max, min), granularity);
                        SubLObject significant_digits = number_utilities.f_1X(floor(log(granularity, TEN_INTEGER), UNPROVIDED));
                        return number_utilities.significant_digits(add(min, multiply(n, step_size)), significant_digits);
                    }
                }


        return NIL;
    }

    public static final SubLObject tweakable_parameter_current_value_num(SubLObject parameter) {
        return tweakable_parameter_value_num(parameter, topic_struct_parameter_value(parameter, UNPROVIDED));
    }

    public static final SubLObject tweakable_parameter_value_num(SubLObject parameter, SubLObject value) {
        {
            SubLObject data = list_utilities.alist_lookup_without_values($topic_struct_tweakable_parameters$.getGlobalValue(), parameter, UNPROVIDED, UNPROVIDED);
            SubLObject datum = data;
            SubLObject current = datum;
            SubLObject min = NIL;
            SubLObject initial = NIL;
            SubLObject max = NIL;
            SubLObject granularity = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt9);
            min = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt9);
            initial = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt9);
            max = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt9);
            granularity = current.first();
            current = current.rest();
            {
                SubLObject values = (current.isCons()) ? ((SubLObject) (current.first())) : NIL;
                destructuring_bind_must_listp(current, datum, $list_alt9);
                current = current.rest();
                if (NIL == current) {
                    return tweakable_parameter_value_num_internal(min, max, granularity, value);
                } else {
                    cdestructuring_bind_error(datum, $list_alt9);
                }
            }
        }
        return NIL;
    }



    public static final SubLObject clear_tweakable_parameter_value_num_internal() {
        {
            SubLObject cs = $tweakable_parameter_value_num_internal_caching_state$.getGlobalValue();
            if (NIL != cs) {
                memoization_state.caching_state_clear(cs);
            }
        }
        return NIL;
    }

    public static final SubLObject remove_tweakable_parameter_value_num_internal(SubLObject min, SubLObject max, SubLObject granularity, SubLObject value) {
        return memoization_state.caching_state_remove_function_results_with_args($tweakable_parameter_value_num_internal_caching_state$.getGlobalValue(), list(min, max, granularity, value), UNPROVIDED, UNPROVIDED);
    }

    /**
     *
     *
     * @return NON-NEGATIVE-INTEGER-P; the value-num corresponding to VALUE.
     */
    public static final SubLObject tweakable_parameter_value_num_internal_internal(SubLObject min, SubLObject max, SubLObject granularity, SubLObject value) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            SubLTrampolineFile.checkType(value, NUMBERP);
            SubLTrampolineFile.checkType(granularity, POSITIVE_INTEGER_P);
            if (value.eql(min)) {
                return ZERO_INTEGER;
            } else
                if (value.eql(max)) {
                    return granularity;
                } else
                    if (value.numG(max)) {
                        Errors.error($str_alt15$_S_exceeds_max_value__S, value, max);
                    } else
                        if (value.numL(min)) {
                            Errors.error($str_alt16$_S_under_min_value__S, value, min);
                        } else {
                            {
                                SubLObject significant_digits = number_utilities.f_1X(floor(log(granularity, TEN_INTEGER), UNPROVIDED));
                                SubLObject step_size = divide(subtract(max, min), granularity);
                                SubLObject delta = subtract(value, min);
                                SubLObject steps = number_utilities.significant_digits(divide(delta, step_size), significant_digits);
                                SubLObject sanity_check = tweakable_parameter_nth_value_internal(min, max, granularity, steps);
                                if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                                    if (NIL == tweakable_parameter_value_E(value, sanity_check, step_size)) {
                                        Errors.error($str_alt17$Tweakable_parameter_value_discrep, sanity_check, value);
                                    }
                                }
                                return steps;
                            }
                        }



            return NIL;
        }
    }

    public static final SubLObject tweakable_parameter_value_num_internal(SubLObject min, SubLObject max, SubLObject granularity, SubLObject value) {
        {
            SubLObject caching_state = $tweakable_parameter_value_num_internal_caching_state$.getGlobalValue();
            if (NIL == caching_state) {
                caching_state = memoization_state.create_global_caching_state_for_name(TWEAKABLE_PARAMETER_VALUE_NUM_INTERNAL, $tweakable_parameter_value_num_internal_caching_state$, NIL, EQL, FOUR_INTEGER, ZERO_INTEGER);
            }
            {
                SubLObject sxhash = memoization_state.sxhash_calc_4(min, max, granularity, value);
                SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
                if (collisions != $kw19$_MEMOIZED_ITEM_NOT_FOUND_) {
                    {
                        SubLObject cdolist_list_var = collisions;
                        SubLObject collision = NIL;
                        for (collision = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , collision = cdolist_list_var.first()) {
                            {
                                SubLObject cached_args = collision.first();
                                SubLObject results2 = second(collision);
                                if (min.eql(cached_args.first())) {
                                    cached_args = cached_args.rest();
                                    if (max.eql(cached_args.first())) {
                                        cached_args = cached_args.rest();
                                        if (granularity.eql(cached_args.first())) {
                                            cached_args = cached_args.rest();
                                            if (((NIL != cached_args) && (NIL == cached_args.rest())) && value.eql(cached_args.first())) {
                                                return memoization_state.caching_results(results2);
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                {
                    SubLObject results = arg2(resetMultipleValues(), multiple_value_list(tweakable_parameter_value_num_internal_internal(min, max, granularity, value)));
                    memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results, list(min, max, granularity, value));
                    return memoization_state.caching_results(results);
                }
            }
        }
    }

    public static final SubLObject tweakable_parameter_value_E(SubLObject value1, SubLObject value2, SubLObject step_size) {
        return numL(abs(subtract(value1, value2)), divide(step_size, TWO_INTEGER));
    }

    // defparameter
    private static final SubLSymbol $l2r_base_value$ = makeSymbol("*L2R-BASE-VALUE*");

    public static final SubLObject l2r_base_value() {
        return topic_struct_parameter_value($sym21$_L2R_BASE_VALUE_, UNPROVIDED);
    }

    // defparameter
    private static final SubLSymbol $l2r_intra_sentence_degradation_base$ = makeSymbol("*L2R-INTRA-SENTENCE-DEGRADATION-BASE*");

    public static final SubLObject l2r_intra_sentence_degradation_base() {
        return topic_struct_parameter_value($sym23$_L2R_INTRA_SENTENCE_DEGRADATION_BASE_, UNPROVIDED);
    }

    // defparameter
    private static final SubLSymbol $l2r_inter_sentence_degradation_base$ = makeSymbol("*L2R-INTER-SENTENCE-DEGRADATION-BASE*");

    public static final SubLObject l2r_inter_sentence_degradation_base() {
        return topic_struct_parameter_value($sym26$_L2R_INTER_SENTENCE_DEGRADATION_BASE_, UNPROVIDED);
    }

    /**
     * Don't reward collections more general than this for having their specs or instances mentioned.
     */
    // defparameter
    private static final SubLSymbol $topic_struct_isaXgenls_generality_cutoff$ = makeSymbol("*TOPIC-STRUCT-ISA/GENLS-GENERALITY-CUTOFF*");

    public static final SubLObject topic_struct_isaXgenls_generality_cutoff() {
        return topic_struct_parameter_value($sym28$_TOPIC_STRUCT_ISA_GENLS_GENERALITY_CUTOFF_, UNPROVIDED);
    }



    public static final SubLObject word_weight_cutoff() {
        return topic_struct_parameter_value($word_weight_cutoff$, UNPROVIDED);
    }

    // defparameter
    private static final SubLSymbol $topic_struct_check_conceptually_relatedP$ = makeSymbol("*TOPIC-STRUCT-CHECK-CONCEPTUALLY-RELATED?*");

    public static final SubLObject topic_struct_check_conceptually_relatedP() {
        return topic_struct_parameter_value($sym34$_TOPIC_STRUCT_CHECK_CONCEPTUALLY_RELATED__, UNPROVIDED);
    }



    public static final SubLObject topic_struct_conceptually_related_max_word_distance() {
        return topic_struct_parameter_value($topic_struct_conceptually_related_max_word_distance$, UNPROVIDED);
    }



    public static final SubLObject topic_struct_conceptually_related_max_sentence_distance() {
        return topic_struct_parameter_value($topic_struct_conceptually_related_max_sentence_distance$, UNPROVIDED);
    }

    /**
     * How many cookies do we award for each compositional parse a term is in?
     */
    // defparameter
    private static final SubLSymbol $l2r_compositional_contribution_base_weight$ = makeSymbol("*L2R-COMPOSITIONAL-CONTRIBUTION-BASE-WEIGHT*");

    public static final SubLObject l2r_compositional_contribution_base_weight() {
        return topic_struct_parameter_value($sym38$_L2R_COMPOSITIONAL_CONTRIBUTION_BASE_WEIGHT_, UNPROVIDED);
    }

    /**
     * How many additional cookies do we award for each true sentential parse a term is in?
     */
    // defparameter
    private static final SubLSymbol $l2r_sentence_truth_bonus$ = makeSymbol("*L2R-SENTENCE-TRUTH-BONUS*");

    public static final SubLObject l2r_sentence_truth_bonus() {
        return topic_struct_parameter_value($sym40$_L2R_SENTENCE_TRUTH_BONUS_, UNPROVIDED);
    }



    public static final SubLObject sentential_contribution_good_score() {
        return topic_struct_parameter_value($sentential_contribution_good_score$, UNPROVIDED);
    }



    public static final SubLObject sentential_contribution_maybe_score() {
        return topic_struct_parameter_value($sentential_contribution_maybe_score$, UNPROVIDED);
    }



    public static final SubLObject sentential_contribution_bad_score() {
        return topic_struct_parameter_value($sentential_contribution_bad_score$, UNPROVIDED);
    }



    public static final SubLObject multi_strategy_bonus() {
        return topic_struct_parameter_value($multi_strategy_bonus$, UNPROVIDED);
    }



    public static final SubLObject cookie_jar_iterativity() {
        return topic_struct_parameter_value($cookie_jar_iterativity$, UNPROVIDED);
    }



    public static final SubLObject with_topic_struct_parameter_value_map(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject map = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt47);
            map = current.first();
            current = current.rest();
            {
                SubLObject body = current;
                return listS(CLET, list(list($topic_struct_parameter_value_map$, map)), append(body, NIL));
            }
        }
    }

    public static final SubLObject topic_struct_parameter_value(SubLObject parameter, SubLObject map) {
        if (map == UNPROVIDED) {
            map = $topic_struct_parameter_value_map$.getDynamicValue();
        }
        SubLTrampolineFile.checkType(parameter, SYMBOLP);
        if ((NIL != map) && (NIL != list_utilities.alist_p(map))) {
            {
                SubLObject mapped_value = list_utilities.alist_lookup_without_values(map, parameter, UNPROVIDED, UNPROVIDED);
                if (NIL != mapped_value) {
                    return mapped_value;
                }
            }
        } else
            if (NIL != dictionary.dictionary_p(map)) {
                {
                    SubLObject mapped_value_nums = dictionary.dictionary_lookup_without_values(map, parameter, UNPROVIDED);
                    if (NIL != mapped_value_nums) {
                        return tweakable_parameter_nth_value(parameter, mapped_value_nums.first());
                    }
                }
            } else
                if (NIL != optimized_strategy_form_p(map)) {
                    {
                        SubLObject mapped_value = topic_struct_parameter_value_from_optimized_strategy_form(parameter, map);
                        if (NIL != mapped_value) {
                            return mapped_value;
                        }
                    }
                }


        {
            SubLObject stored_data = list_utilities.alist_lookup($topic_struct_tweakable_parameters$.getGlobalValue(), parameter, UNPROVIDED, UNPROVIDED);
            if (NIL != stored_data) {
                return second(stored_data);
            }
        }
        Errors.error($str_alt51$_S_is_not_a_known_tweakable_param, parameter);
        return NIL;
    }

    // defparameter
    private static final SubLSymbol $parameter_being_tweaked$ = makeSymbol("*PARAMETER-BEING-TWEAKED*");

    // defparameter
    private static final SubLSymbol $parameter_being_tweaked_last_good_value$ = makeSymbol("*PARAMETER-BEING-TWEAKED-LAST-GOOD-VALUE*");

    /**
     * Record of latest recall and precision for each document in the training data
     */
    // defparameter
    private static final SubLSymbol $training_data_stats$ = makeSymbol("*TRAINING-DATA-STATS*");

    public static final SubLObject optimize_tweakable_parameters(SubLObject training_pairs) {
        if (training_pairs == UNPROVIDED) {
            training_pairs = tweakable_parameter_training_pairs();
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject _prev_bind_0 = $training_data_stats$.currentBinding(thread);
                try {
                    $training_data_stats$.bind(make_list(length(training_pairs), $NONE), thread);
                    {
                        SubLObject v_dictionary = dictionary.new_dictionary(UNPROVIDED, UNPROVIDED);
                        SubLObject random_seedP = NIL;
                        {
                            SubLObject cdolist_list_var = $topic_struct_tweakable_parameters$.getGlobalValue();
                            SubLObject cons = NIL;
                            for (cons = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , cons = cdolist_list_var.first()) {
                                {
                                    SubLObject datum = cons;
                                    SubLObject current = datum;
                                    SubLObject parameter = NIL;
                                    SubLObject value = NIL;
                                    destructuring_bind_must_consp(current, datum, $list_alt53);
                                    parameter = current.first();
                                    current = current.rest();
                                    value = current;
                                    dictionary.dictionary_enter(v_dictionary, parameter, list(NIL != random_seedP ? ((SubLObject) (tweakable_parameter_random_value_num(parameter))) : tweakable_parameter_current_value_num(parameter)));
                                }
                            }
                        }
                        {
                            SubLObject total = dictionary.dictionary_length(v_dictionary);
                            SubLObject best_score = apply(symbol_function(TOPIC_STRUCT_SCORE_FROM_RECALL_AND_PRECISION), arg2(thread.resetMultipleValues(), multiple_value_list(evaluate_training_data(training_pairs, v_dictionary))));
                            SubLObject total_positions = apply(symbol_function($sym55$_), Mapping.mapcar(DICTIONARY_LENGTH, Mapping.mapcar(symbol_function(SECOND), training_pairs)));
                            SubLObject improved_params = NIL;
                            SubLObject last_param_improved = NIL;
                            SubLObject checks_done = ZERO_INTEGER;
                            SubLObject total_time = ZERO_INTEGER;
                            SubLObject pass_num = ZERO_INTEGER;
                            SubLObject doneP = NIL;
                            while (NIL == doneP) {
                                {
                                    SubLObject improvedP = NIL;
                                    SubLObject sofar = ZERO_INTEGER;
                                    SubLObject this_time = NIL;
                                    SubLObject time_var = get_internal_real_time();
                                    {
                                        SubLObject _prev_bind_0_1 = utilities_macros.$last_percent_progress_index$.currentBinding(thread);
                                        SubLObject _prev_bind_1 = utilities_macros.$last_percent_progress_prediction$.currentBinding(thread);
                                        SubLObject _prev_bind_2 = utilities_macros.$within_noting_percent_progress$.currentBinding(thread);
                                        SubLObject _prev_bind_3 = utilities_macros.$percent_progress_start_time$.currentBinding(thread);
                                        try {
                                            utilities_macros.$last_percent_progress_index$.bind(ZERO_INTEGER, thread);
                                            utilities_macros.$last_percent_progress_prediction$.bind(NIL, thread);
                                            utilities_macros.$within_noting_percent_progress$.bind(T, thread);
                                            utilities_macros.$percent_progress_start_time$.bind(get_universal_time(), thread);
                                            utilities_macros.noting_percent_progress_preamble(format(NIL, $str_alt58$Starting_Optimization_pass__A__be, pass_num, best_score));
                                            {
                                                SubLObject rest = NIL;
                                                for (rest = $topic_struct_tweakable_parameters$.getGlobalValue(); !((NIL != doneP) || (NIL == rest)); rest = rest.rest()) {
                                                    {
                                                        SubLObject cons = rest.first();
                                                        SubLObject datum = cons;
                                                        SubLObject current = datum;
                                                        SubLObject parameter = NIL;
                                                        SubLObject value = NIL;
                                                        destructuring_bind_must_consp(current, datum, $list_alt53);
                                                        parameter = current.first();
                                                        current = current.rest();
                                                        value = current;
                                                        if (parameter == last_param_improved) {
                                                            doneP = T;
                                                        } else {
                                                            {
                                                                SubLObject _prev_bind_0_2 = $parameter_being_tweaked$.currentBinding(thread);
                                                                SubLObject _prev_bind_1_3 = $parameter_being_tweaked_last_good_value$.currentBinding(thread);
                                                                try {
                                                                    $parameter_being_tweaked$.bind(parameter, thread);
                                                                    $parameter_being_tweaked_last_good_value$.bind(topic_struct_parameter_value(parameter, v_dictionary), thread);
                                                                    thread.resetMultipleValues();
                                                                    {
                                                                        SubLObject new_best_score = optimize_tweakable_parameter(parameter, v_dictionary, training_pairs, best_score);
                                                                        SubLObject this_checks_done = thread.secondMultipleValue();
                                                                        thread.resetMultipleValues();
                                                                        checks_done = add(checks_done, this_checks_done);
                                                                        if (new_best_score.numG(best_score)) {
                                                                            improvedP = T;
                                                                            last_param_improved = parameter;
                                                                            {
                                                                                SubLObject item_var = parameter;
                                                                                if (NIL == member(item_var, improved_params, symbol_function(EQL), symbol_function(IDENTITY))) {
                                                                                    improved_params = cons(item_var, improved_params);
                                                                                }
                                                                            }
                                                                            best_score = new_best_score;
                                                                        }
                                                                    }
                                                                } finally {
                                                                    $parameter_being_tweaked_last_good_value$.rebind(_prev_bind_1_3, thread);
                                                                    $parameter_being_tweaked$.rebind(_prev_bind_0_2, thread);
                                                                }
                                                            }
                                                        }
                                                        sofar = add(sofar, ONE_INTEGER);
                                                        utilities_macros.note_percent_progress(sofar, total);
                                                    }
                                                }
                                            }
                                            utilities_macros.noting_percent_progress_postamble();
                                        } finally {
                                            utilities_macros.$percent_progress_start_time$.rebind(_prev_bind_3, thread);
                                            utilities_macros.$within_noting_percent_progress$.rebind(_prev_bind_2, thread);
                                            utilities_macros.$last_percent_progress_prediction$.rebind(_prev_bind_1, thread);
                                            utilities_macros.$last_percent_progress_index$.rebind(_prev_bind_0_1, thread);
                                        }
                                    }
                                    this_time = divide(subtract(get_internal_real_time(), time_var), time_high.$internal_time_units_per_second$.getGlobalValue());
                                    total_time = add(total_time, this_time);
                                    format(T, $str_alt59$_____D_positions_rescored____D_sw, new SubLObject[]{ multiply(checks_done, total_positions), checks_done, total_time, multiply($int$1000, divide(divide(total_time, checks_done), total_positions)), multiply($int$100, best_score) });
                                    if (NIL == improvedP) {
                                        doneP = T;
                                    }
                                }
                                pass_num = add(pass_num, ONE_INTEGER);
                            } 
                            format(T, $str_alt61$__Final_score____5F___Recall_weig, multiply($int$100, best_score), topic_struct_recall_weight());
                            {
                                SubLObject cdolist_list_var = improved_params;
                                SubLObject parameter = NIL;
                                for (parameter = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , parameter = cdolist_list_var.first()) {
                                    {
                                        SubLObject value_num_stack = dictionary.dictionary_lookup_without_values(v_dictionary, parameter, UNPROVIDED);
                                        SubLObject new_value = tweakable_parameter_nth_value(parameter, value_num_stack.first());
                                        SubLObject old_value = topic_struct_parameter_value(parameter, UNPROVIDED);
                                        if (NIL == tweakable_parameter_value_E(new_value, old_value, tweakable_parameter_step_size(parameter))) {
                                            format(T, $str_alt62$___S___S_____S__, new SubLObject[]{ parameter, old_value, new_value });
                                        }
                                    }
                                }
                            }
                        }
                        dictionary.clear_dictionary(v_dictionary);
                    }
                } finally {
                    $training_data_stats$.rebind(_prev_bind_0, thread);
                }
            }
            return NIL;
        }
    }

    public static final SubLObject optimize_tweakable_parameter(SubLObject parameter, SubLObject v_dictionary, SubLObject training_pairs, SubLObject best_score) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                if (NIL == list_utilities.same_length_p(training_pairs, $training_data_stats$.getDynamicValue(thread))) {
                    Errors.error($str_alt63$_TRAINING_DATA_STATS__is__S, $training_data_stats$.getDynamicValue(thread));
                }
            }
            {
                SubLObject value_num_stack = dictionary.dictionary_lookup_without_values(v_dictionary, parameter, UNPROVIDED);
                SubLObject current_value_num = value_num_stack.first();
                SubLObject improvedP = NIL;
                SubLObject checks_done = ZERO_INTEGER;
                SubLObject cdolist_list_var = tweak_topic_struct_parameter(parameter, current_value_num, UNPROVIDED);
                SubLObject new_value_num = NIL;
                for (new_value_num = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , new_value_num = cdolist_list_var.first()) {
                    {
                        SubLObject revert_value_num_stack = dictionary.dictionary_lookup_without_values(v_dictionary, parameter, UNPROVIDED);
                        dictionary.dictionary_enter(v_dictionary, parameter, cons(new_value_num, value_num_stack));
                        thread.resetMultipleValues();
                        {
                            SubLObject recall = evaluate_training_data(training_pairs, v_dictionary);
                            SubLObject precision = thread.secondMultipleValue();
                            thread.resetMultipleValues();
                            {
                                SubLObject new_score = topic_struct_score_from_recall_and_precision(recall, precision);
                                checks_done = add(checks_done, cookie_jar_iterativity());
                                if (new_score.numG(best_score)) {
                                    best_score = new_score;
                                    improvedP = T;
                                    format(T, $str_alt64$__Tweaked__S_from_value__S_to_val, new SubLObject[]{ parameter, current_value_num, new_value_num, tweakable_parameter_granularity(parameter), multiply($int$100, best_score), multiply($int$100, recall), multiply($int$100, precision) });
                                } else {
                                    dictionary.dictionary_enter(v_dictionary, parameter, revert_value_num_stack);
                                }
                            }
                        }
                    }
                }
                if (NIL != list_utilities.lengthG(value_num_stack, ONE_INTEGER, UNPROVIDED)) {
                    {
                        SubLObject revert_value_num_stack = dictionary.dictionary_lookup_without_values(v_dictionary, parameter, UNPROVIDED);
                        dictionary.dictionary_enter(v_dictionary, parameter, value_num_stack.rest());
                        thread.resetMultipleValues();
                        {
                            SubLObject recall = evaluate_training_data(training_pairs, v_dictionary);
                            SubLObject precision = thread.secondMultipleValue();
                            thread.resetMultipleValues();
                            {
                                SubLObject new_score = topic_struct_score_from_recall_and_precision(recall, precision);
                                checks_done = add(checks_done, ONE_INTEGER);
                                if (new_score.numG(best_score)) {
                                    best_score = new_score;
                                    improvedP = T;
                                    format(T, $str_alt65$__Tweaked__S_from_value__S_back_t, new SubLObject[]{ parameter, current_value_num, second(value_num_stack), tweakable_parameter_granularity(parameter) });
                                } else {
                                    dictionary.dictionary_enter(v_dictionary, parameter, revert_value_num_stack);
                                }
                            }
                        }
                    }
                }
                return values(best_score, checks_done);
            }
        }
    }

    // defparameter
    private static final SubLSymbol $tweaking_iterations$ = makeSymbol("*TWEAKING-ITERATIONS*");

    // defparameter
    private static final SubLSymbol $random_tweaks$ = makeSymbol("*RANDOM-TWEAKS*");

    /**
     *
     *
     * @return LISTP; of new value nums to try for PARAMETER
     */
    public static final SubLObject tweak_topic_struct_parameter(SubLObject parameter, SubLObject current_value_num, SubLObject iterations) {
        if (iterations == UNPROVIDED) {
            iterations = $tweaking_iterations$.getDynamicValue();
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject value_nums = NIL;
                SubLObject random_values = $random_tweaks$.getDynamicValue(thread);
                SubLObject granularity = tweakable_parameter_granularity(parameter);
                if (!current_value_num.eql(granularity)) {
                    value_nums = cons(ceiling(number_utilities.average(list(current_value_num, granularity), UNPROVIDED), UNPROVIDED), value_nums);
                }
                if (!current_value_num.eql(ZERO_INTEGER)) {
                    value_nums = cons(integerDivide(current_value_num, TWO_INTEGER), value_nums);
                }
                {
                    SubLObject i = NIL;
                    for (i = ZERO_INTEGER; i.numL(random_values); i = add(i, ONE_INTEGER)) {
                        value_nums = cons(tweakable_parameter_random_value_num(parameter), value_nums);
                    }
                }
                value_nums = delete(current_value_num, delete_duplicates(value_nums, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                if (iterations.numG(ONE_INTEGER)) {
                    {
                        SubLObject cdolist_list_var = copy_list(value_nums);
                        SubLObject value_num = NIL;
                        for (value_num = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , value_num = cdolist_list_var.first()) {
                            {
                                SubLObject cdolist_list_var_4 = tweak_topic_struct_parameter(parameter, value_num, number_utilities.f_1_(iterations));
                                SubLObject new_value_num = NIL;
                                for (new_value_num = cdolist_list_var_4.first(); NIL != cdolist_list_var_4; cdolist_list_var_4 = cdolist_list_var_4.rest() , new_value_num = cdolist_list_var_4.first()) {
                                    {
                                        SubLObject item_var = new_value_num;
                                        if (NIL == member(item_var, value_nums, symbol_function(EQL), symbol_function(IDENTITY))) {
                                            value_nums = cons(item_var, value_nums);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                return value_nums;
            }
        }
    }

    /**
     * LISTP of (TOPIC-STRUCT COOKIE-JAR SENTENTIAL-RESULTS) tuples
     */
    // deflexical
    private static final SubLSymbol $topic_struct_saved_out_data_files$ = makeSymbol("*TOPIC-STRUCT-SAVED-OUT-DATA-FILES*");



    public static final SubLObject tweakable_parameter_training_pairs() {
        return $tweakable_parameter_training_pairs$.getGlobalValue();
    }

    public static final SubLObject load_or_reload_tweakable_parameter_training_pairs() {
        {
            SubLObject new_pairs = NIL;
            SubLObject cdolist_list_var = $topic_struct_saved_out_data_files$.getGlobalValue();
            SubLObject v_set = NIL;
            for (v_set = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , v_set = cdolist_list_var.first()) {
                {
                    SubLObject datum = v_set;
                    SubLObject current = datum;
                    SubLObject topic_struct_file = NIL;
                    SubLObject cookie_jar_file = NIL;
                    SubLObject sentence_results_file = NIL;
                    destructuring_bind_must_consp(current, datum, $list_alt68);
                    topic_struct_file = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt68);
                    cookie_jar_file = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt68);
                    sentence_results_file = current.first();
                    current = current.rest();
                    if (NIL == current) {
                        {
                            SubLObject topic_struct = cfasl_utilities.cfasl_load(topic_struct_file);
                            SubLObject cookie_jar = cfasl_utilities.cfasl_load(cookie_jar_file);
                            SubLObject sentence_results = cfasl_utilities.cfasl_load(sentence_results_file);
                            if ((NIL != topic_struct) && (NIL != cookie_jar)) {
                                if (NIL != sentence_results) {
                                    update_cookie_jar_for_sentence_level_results(cookie_jar, topic_struct, sentence_results, UNPROVIDED, UNPROVIDED);
                                }
                                new_pairs = cons(list(topic_struct, cookie_jar), new_pairs);
                            }
                        }
                    } else {
                        cdestructuring_bind_error(datum, $list_alt68);
                    }
                }
            }
            $tweakable_parameter_training_pairs$.setGlobalValue(nreverse(new_pairs));
        }
        return length($tweakable_parameter_training_pairs$.getGlobalValue());
    }

    public static final SubLObject training_data_show_percent_processed(SubLObject training_pairs) {
        if (training_pairs == UNPROVIDED) {
            training_pairs = tweakable_parameter_training_pairs();
        }
        {
            SubLObject cdolist_list_var = training_pairs;
            SubLObject pair = NIL;
            for (pair = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , pair = cdolist_list_var.first()) {
                {
                    SubLObject datum = pair;
                    SubLObject current = datum;
                    SubLObject topic_struct = NIL;
                    SubLObject cookie_jar = NIL;
                    destructuring_bind_must_consp(current, datum, $list_alt69);
                    topic_struct = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt69);
                    cookie_jar = current.first();
                    current = current.rest();
                    if (NIL == current) {
                        {
                            SubLObject total = count_topic_struct_ambiguous_words(topic_struct, UNPROVIDED);
                            SubLObject processed = dictionary.dictionary_length(cookie_jar);
                            format(T, $str_alt70$____3F___, multiply($int$100, divide(processed, total)));
                        }
                    } else {
                        cdestructuring_bind_error(datum, $list_alt69);
                    }
                }
            }
        }
        return NIL;
    }

    public static final SubLObject evaluate_training_data(SubLObject training_pairs, SubLObject map) {
        if (training_pairs == UNPROVIDED) {
            training_pairs = tweakable_parameter_training_pairs();
        }
        if (map == UNPROVIDED) {
            map = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            SubLTrampolineFile.checkType(training_pairs, PROPER_LIST_P);
            {
                SubLObject num_correct = ZERO_INTEGER;
                SubLObject total = ZERO_INTEGER;
                SubLObject total_number_of_guesses = ZERO_INTEGER;
                SubLObject total_number_of_right_guesses = ZERO_INTEGER;
                SubLObject alist = (NIL != dictionary.dictionary_p(map)) ? ((SubLObject) (tweakable_parameter_dictionary_to_alist(map))) : map;
                SubLObject list_var = NIL;
                SubLObject pair = NIL;
                SubLObject document_number = NIL;
                for (list_var = training_pairs, pair = list_var.first(), document_number = ZERO_INTEGER; NIL != list_var; list_var = list_var.rest() , pair = list_var.first() , document_number = add(ONE_INTEGER, document_number)) {
                    {
                        SubLObject datum = pair;
                        SubLObject current = datum;
                        SubLObject topic_struct = NIL;
                        SubLObject cookie_jar = NIL;
                        destructuring_bind_must_consp(current, datum, $list_alt69);
                        topic_struct = current.first();
                        current = current.rest();
                        destructuring_bind_must_consp(current, datum, $list_alt69);
                        cookie_jar = current.first();
                        current = current.rest();
                        if (NIL == current) {
                            thread.resetMultipleValues();
                            {
                                SubLObject this_num_correct = evaluate_cookie_jar(cookie_jar, topic_struct, alist);
                                SubLObject ambiguous_word_count = thread.secondMultipleValue();
                                SubLObject number_of_right_guesses = thread.thirdMultipleValue();
                                SubLObject number_of_guesses = thread.fourthMultipleValue();
                                thread.resetMultipleValues();
                                {
                                    SubLObject old_stats = nth(document_number, $training_data_stats$.getDynamicValue(thread));
                                    SubLObject old_statsP = list_utilities.doubletonP(old_stats);
                                    SubLObject old_document_recall = (NIL != old_statsP) ? ((SubLObject) (old_stats.first())) : NIL;
                                    SubLObject old_document_precision = (NIL != old_statsP) ? ((SubLObject) (second(old_stats))) : NIL;
                                    SubLObject document_recall = compute_recall(this_num_correct, ambiguous_word_count);
                                    SubLObject document_precision = compute_precision(number_of_right_guesses, number_of_guesses);
                                    SubLObject old_score = (NIL != old_statsP) ? ((SubLObject) (topic_struct_score_from_recall_and_precision(old_document_recall, old_document_precision))) : NIL;
                                    SubLObject new_score = topic_struct_score_from_recall_and_precision(document_recall, document_precision);
                                    if (old_score.isNumber() && (!old_score.eql(new_score))) {
                                        Errors.warn($str_alt72$_A__Tweaking__S_from__S_to__S___c, new SubLObject[]{ old_score.numG(new_score) ? ((SubLObject) ($$$BOO)) : $$$YAY, $parameter_being_tweaked$.getDynamicValue(thread), $parameter_being_tweaked_last_good_value$.getDynamicValue(thread), topic_struct_parameter_value($parameter_being_tweaked$.getDynamicValue(thread), alist), document_number, old_score.numG(new_score) ? ((SubLObject) ($$$decline)) : $$$increase, multiply($int$100, old_score), multiply($int$100, new_score), this_num_correct, ambiguous_word_count, number_of_right_guesses, number_of_guesses });
                                    }
                                    set_nth(document_number, $training_data_stats$.getDynamicValue(thread), list(document_recall, document_precision));
                                    num_correct = add(num_correct, this_num_correct);
                                    total = add(total, ambiguous_word_count);
                                    total_number_of_right_guesses = add(total_number_of_right_guesses, number_of_right_guesses);
                                    total_number_of_guesses = add(total_number_of_guesses, number_of_guesses);
                                }
                            }
                        } else {
                            cdestructuring_bind_error(datum, $list_alt69);
                        }
                    }
                }
                {
                    SubLObject recall = compute_recall(num_correct, total);
                    SubLObject precision = compute_precision(total_number_of_right_guesses, total_number_of_guesses);
                    return values(recall, precision);
                }
            }
        }
    }

    public static final SubLObject compute_precision(SubLObject number_of_right_guesses, SubLObject number_of_guesses) {
        return number_of_guesses.isPositive() ? ((SubLObject) (divide(number_of_right_guesses, number_of_guesses))) : ZERO_INTEGER;
    }

    public static final SubLObject compute_recall(SubLObject number_returned, SubLObject number_available) {
        return number_available.isPositive() ? ((SubLObject) (divide(number_returned, number_available))) : ZERO_INTEGER;
    }

    public static final SubLObject topic_struct_score_from_recall_and_precision(SubLObject recall, SubLObject precision) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                if (!(((recall.numLE(ONE_INTEGER) && recall.numGE(ZERO_INTEGER)) && precision.numLE(ONE_INTEGER)) && precision.numGE(ZERO_INTEGER))) {
                    Errors.error($str_alt77$Bad_recall_and_or_precision_value, recall, precision);
                }
            }
            return add(multiply(recall, topic_struct_recall_weight()), multiply(precision, topic_struct_precision_weight()));
        }
    }

    /**
     * How much do we value recall relative to precision?
     */
    // defparameter
    private static final SubLSymbol $topic_struct_recall_weight$ = makeSymbol("*TOPIC-STRUCT-RECALL-WEIGHT*");

    public static final SubLObject topic_struct_recall_weight() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            return $topic_struct_recall_weight$.getDynamicValue(thread);
        }
    }

    public static final SubLObject topic_struct_precision_weight() {
        return subtract(ONE_INTEGER, topic_struct_recall_weight());
    }

    public static final SubLObject tweakable_parameter_dictionary_to_alist(SubLObject v_dictionary) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject alist = NIL;
                SubLObject iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(v_dictionary));
                while (NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state)) {
                    thread.resetMultipleValues();
                    {
                        SubLObject parameter = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                        SubLObject mapped_value_nums = thread.secondMultipleValue();
                        thread.resetMultipleValues();
                        if (NIL != mapped_value_nums) {
                            alist = list_utilities.alist_enter(alist, parameter, tweakable_parameter_nth_value(parameter, mapped_value_nums.first()), UNPROVIDED);
                        }
                        iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state);
                    }
                } 
                dictionary_contents.do_dictionary_contents_finalize(iteration_state);
                return alist;
            }
        }
    }

    public static final SubLObject sibling_cookie_score(SubLObject type, SubLObject data, SubLObject map) {
        if (map == UNPROVIDED) {
            map = $topic_struct_parameter_value_map$.getDynamicValue();
        }
        {
            SubLObject score = ZERO_INTEGER;
            SubLObject unhelpful_count = ZERO_INTEGER;
            SubLObject cdolist_list_var = data;
            SubLObject plist = NIL;
            for (plist = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , plist = cdolist_list_var.first()) {
                {
                    SubLObject sibling_score = sibling_plist_score(type, plist, map);
                    if (sibling_score.isZero()) {
                        unhelpful_count = add(unhelpful_count, ONE_INTEGER);
                    } else {
                        score = add(score, sibling_score);
                    }
                }
            }
            return score;
        }
    }

    public static final SubLObject sibling_plist_score(SubLObject type, SubLObject plist, SubLObject map) {
        if (map == UNPROVIDED) {
            map = $topic_struct_parameter_value_map$.getDynamicValue();
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject score = ZERO_INTEGER;
                {
                    SubLObject _prev_bind_0 = $topic_struct_parameter_value_map$.currentBinding(thread);
                    try {
                        $topic_struct_parameter_value_map$.bind(map, thread);
                        if (NIL != use_topic_struct_sibling_type_for_scoringP(type)) {
                            {
                                SubLObject word_position = getf(plist, $FOCAL_POSITION, UNPROVIDED);
                                SubLObject position = getf(plist, $SUPPORTER_POSITION, UNPROVIDED);
                                SubLObject this_score = getf(plist, $RAW_SCORE, UNPROVIDED);
                                SubLObject proximity_factor = topic_struct_proximity_factor(word_position, position, l2r_base_value(), l2r_intra_sentence_degradation_base(), l2r_inter_sentence_degradation_base());
                                score = multiply(proximity_factor, this_score);
                            }
                        }
                    } finally {
                        $topic_struct_parameter_value_map$.rebind(_prev_bind_0, thread);
                    }
                }
                return score;
            }
        }
    }

    public static final SubLObject use_topic_struct_sibling_type_for_scoringP(SubLObject type) {
        {
            SubLObject parameter = topic_struct_sibling_collection_parameter(type);
            return makeBoolean((NIL != list_utilities.alist_has_keyP($topic_struct_tweakable_parameters$.getGlobalValue(), parameter, UNPROVIDED)) && topic_struct_parameter_value(parameter, UNPROVIDED).isPositive());
        }
    }

    /**
     * Inverse percent of cookies at POSITION in COOKIE-JAR alloted to DENOT.
     */
    public static final SubLObject cookie_jar_ambiguity_factor_for_denot_at_position(SubLObject denot, SubLObject position, SubLObject cookie_jar) {
        if (cookie_jar == UNPROVIDED) {
            cookie_jar = current_cookie_jar();
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject cookie_pack = dictionary.dictionary_lookup_without_values(cookie_jar, position, UNPROVIDED);
                SubLObject total_score = ZERO_INTEGER;
                SubLObject this_denot_score = ZERO_INTEGER;
                if (NIL == dictionary.dictionary_p(cookie_pack)) {
                    return ONE_INTEGER;
                }
                {
                    SubLObject iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(cookie_pack));
                    while (NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state)) {
                        thread.resetMultipleValues();
                        {
                            SubLObject some_denot = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                            SubLObject cookies = thread.secondMultipleValue();
                            thread.resetMultipleValues();
                            {
                                SubLObject this_score = topic_struct_score_from_cookies(cookies);
                                if (denot.equal(some_denot)) {
                                    this_denot_score = this_score;
                                }
                                total_score = add(total_score, this_score);
                            }
                            iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state);
                        }
                    } 
                    dictionary_contents.do_dictionary_contents_finalize(iteration_state);
                }
                if (total_score.isZero()) {
                    return dictionary.dictionary_length(cookie_pack);
                }
                return number_utilities.potentially_infinite_number_divided_by(total_score, this_denot_score);
            }
        }
    }

    public static final SubLObject find_denot_in_document_or_topic_struct(SubLObject denot) {
        if (NIL != el_utilities.el_list_p(topic_struct())) {
            return topic_struct_find_denot(denot, topic_struct());
        } else
            if (NIL != cycl_grammar.cycl_denotational_term_p(l2r_document())) {
                return l2r_document_contains_denotP(l2r_document(), denot);
            } else {
                return NIL;
            }

    }

    public static final SubLObject topic_struct_proximity_factor(SubLObject pos1, SubLObject pos2, SubLObject max, SubLObject intra_degradation_base, SubLObject inter_degradation_base) {
        {
            SubLObject factor = max;
            SubLObject countdown = length(pos1);
            SubLObject differentP = NIL;
            if (NIL == differentP) {
                {
                    SubLObject i1 = NIL;
                    SubLObject i1_5 = NIL;
                    SubLObject i2 = NIL;
                    SubLObject i2_6 = NIL;
                    for (i1 = pos1, i1_5 = i1.first(), i2 = pos2, i2_6 = i2.first(); !((NIL != differentP) || ((NIL == i2) && (NIL == i1))); i1 = i1.rest() , i1_5 = i1.first() , i2 = i2.rest() , i2_6 = i2.first()) {
                        countdown = subtract(countdown, ONE_INTEGER);
                        {
                            SubLObject delta = peg_local_position_distance(i1_5, i2_6);
                            if (!delta.isZero()) {
                                differentP = T;
                                {
                                    SubLObject base = (countdown.isZero()) ? ((SubLObject) (intra_degradation_base)) : inter_degradation_base;
                                    factor = multiply(factor, expt(base, delta));
                                }
                            }
                        }
                    }
                }
            }
            return factor;
        }
    }

    public static final SubLObject peg_local_position_distance(SubLObject local_position_1, SubLObject local_position_2) {
        {
            SubLObject local_position_1_start = peg_local_position_start(local_position_1);
            SubLObject local_position_1_end = peg_local_position_end(local_position_1);
            SubLObject local_position_2_start = peg_local_position_start(local_position_2);
            SubLObject local_position_2_end = peg_local_position_end(local_position_2);
            if (local_position_2_start.numG(local_position_1_end)) {
                return subtract(local_position_2_start, local_position_1_end);
            } else
                if (local_position_1_start.numG(local_position_2_end)) {
                    return subtract(local_position_1_start, local_position_2_end);
                } else {
                    return ZERO_INTEGER;
                }

        }
    }

    public static final SubLObject peg_local_position_start(SubLObject local_position) {
        return local_position.isList() ? ((SubLObject) (local_position.first())) : local_position;
    }

    public static final SubLObject peg_local_position_end(SubLObject local_position) {
        return local_position.isList() ? ((SubLObject) (second(local_position))) : local_position;
    }

    public static final SubLObject sibling_score_wrt_nearest_isa_of_type_internal_internal(SubLObject term1, SubLObject term2, SubLObject type) {
        {
            SubLObject common = intersection(relevant_min_isas_of_type_memoized(term1, type, UNPROVIDED), relevant_min_isas_of_type_memoized(term2, type, UNPROVIDED), symbol_function(EQUAL), UNPROVIDED);
            SubLObject scored = NIL;
            SubLObject score = ZERO_INTEGER;
            SubLObject cdolist_list_var = common;
            SubLObject v_term = NIL;
            for (v_term = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , v_term = cdolist_list_var.first()) {
                if (!cardinality_estimates.generality_estimate(v_term).numG(topic_struct_isaXgenls_generality_cutoff())) {
                    score = add(score, ONE_INTEGER);
                    scored = cons(v_term, scored);
                }
                if (NIL != find_denot_in_document_or_topic_struct(v_term)) {
                    score = add(score, ONE_INTEGER);
                    scored = cons(v_term, scored);
                }
            }
            if ((NIL != topic_struct_verboseP()) && (NIL != scored)) {
                format(T, $str_alt83$___S_and__S_share_common__S_____S, new SubLObject[]{ term1, term2, type, scored });
            }
            return values(score, scored);
        }
    }

    public static final SubLObject sibling_score_wrt_nearest_isa_of_type_internal(SubLObject term1, SubLObject term2, SubLObject type) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
                SubLObject caching_state = NIL;
                if (NIL == v_memoization_state) {
                    return sibling_score_wrt_nearest_isa_of_type_internal_internal(term1, term2, type);
                }
                caching_state = memoization_state.memoization_state_lookup(v_memoization_state, SIBLING_SCORE_WRT_NEAREST_ISA_OF_TYPE_INTERNAL, UNPROVIDED);
                if (NIL == caching_state) {
                    caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), SIBLING_SCORE_WRT_NEAREST_ISA_OF_TYPE_INTERNAL, THREE_INTEGER, NIL, EQ, UNPROVIDED);
                    memoization_state.memoization_state_put(v_memoization_state, SIBLING_SCORE_WRT_NEAREST_ISA_OF_TYPE_INTERNAL, caching_state);
                }
                {
                    SubLObject sxhash = memoization_state.sxhash_calc_3(term1, term2, type);
                    SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
                    if (collisions != $kw19$_MEMOIZED_ITEM_NOT_FOUND_) {
                        {
                            SubLObject cdolist_list_var = collisions;
                            SubLObject collision = NIL;
                            for (collision = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , collision = cdolist_list_var.first()) {
                                {
                                    SubLObject cached_args = collision.first();
                                    SubLObject results2 = second(collision);
                                    if (term1 == cached_args.first()) {
                                        cached_args = cached_args.rest();
                                        if (term2 == cached_args.first()) {
                                            cached_args = cached_args.rest();
                                            if (((NIL != cached_args) && (NIL == cached_args.rest())) && (type == cached_args.first())) {
                                                return memoization_state.caching_results(results2);
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                    {
                        SubLObject results = arg2(thread.resetMultipleValues(), multiple_value_list(sibling_score_wrt_nearest_isa_of_type_internal_internal(term1, term2, type)));
                        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results, list(term1, term2, type));
                        return memoization_state.caching_results(results);
                    }
                }
            }
        }
    }

    public static final SubLObject relevant_min_isas_of_type_memoized_internal(SubLObject v_term, SubLObject type, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = mt_relevance_macros.$mt$.getDynamicValue();
        }
        {
            SubLObject ans = NIL;
            SubLObject time = NIL;
            SubLObject time_var = get_internal_real_time();
            {
                SubLObject all_min_isas = isa.min_isas_of_type(v_term, type, mt, UNPROVIDED);
                ans = remove_if($sym85$IRRELEVANT_MIN_ISA_, all_min_isas, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            }
            time = divide(subtract(get_internal_real_time(), time_var), time_high.$internal_time_units_per_second$.getGlobalValue());
            if ((NIL != topic_struct_verboseP()) && time.numG(ONE_INTEGER)) {
                format(T, $str_alt86$__Spent__S_seconds_finding_releva, new SubLObject[]{ time, type, v_term });
            }
            return ans;
        }
    }

    public static final SubLObject relevant_min_isas_of_type_memoized(SubLObject v_term, SubLObject type, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = mt_relevance_macros.$mt$.getDynamicValue();
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
                SubLObject caching_state = NIL;
                if (NIL == v_memoization_state) {
                    return relevant_min_isas_of_type_memoized_internal(v_term, type, mt);
                }
                caching_state = memoization_state.memoization_state_lookup(v_memoization_state, RELEVANT_MIN_ISAS_OF_TYPE_MEMOIZED, UNPROVIDED);
                if (NIL == caching_state) {
                    caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), RELEVANT_MIN_ISAS_OF_TYPE_MEMOIZED, THREE_INTEGER, NIL, EQUAL, UNPROVIDED);
                    memoization_state.memoization_state_put(v_memoization_state, RELEVANT_MIN_ISAS_OF_TYPE_MEMOIZED, caching_state);
                }
                {
                    SubLObject sxhash = memoization_state.sxhash_calc_3(v_term, type, mt);
                    SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
                    if (collisions != $kw19$_MEMOIZED_ITEM_NOT_FOUND_) {
                        {
                            SubLObject cdolist_list_var = collisions;
                            SubLObject collision = NIL;
                            for (collision = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , collision = cdolist_list_var.first()) {
                                {
                                    SubLObject cached_args = collision.first();
                                    SubLObject results2 = second(collision);
                                    if (v_term.equal(cached_args.first())) {
                                        cached_args = cached_args.rest();
                                        if (type.equal(cached_args.first())) {
                                            cached_args = cached_args.rest();
                                            if (((NIL != cached_args) && (NIL == cached_args.rest())) && mt.equal(cached_args.first())) {
                                                return memoization_state.caching_results(results2);
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                    {
                        SubLObject results = arg2(thread.resetMultipleValues(), multiple_value_list(relevant_min_isas_of_type_memoized_internal(v_term, type, mt)));
                        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results, list(v_term, type, mt));
                        return memoization_state.caching_results(results);
                    }
                }
            }
        }
    }

    public static final SubLObject irrelevant_min_isaP(SubLObject v_term) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            return rkf_relevance_utilities.rkf_irrelevant_term(v_term, mt_relevance_macros.$mt$.getDynamicValue(thread));
        }
    }

    public static final SubLObject isa_count_cookie_score(SubLObject data, SubLObject map) {
        if (map == UNPROVIDED) {
            map = $topic_struct_parameter_value_map$.getDynamicValue();
        }
        {
            SubLObject score = ZERO_INTEGER;
            SubLObject cdolist_list_var = data;
            SubLObject plist = NIL;
            for (plist = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , plist = cdolist_list_var.first()) {
                score = add(score, isa_count_plist_score(plist, map));
            }
            return score;
        }
    }

    public static final SubLObject isa_count_plist_score(SubLObject plist, SubLObject map) {
        if (map == UNPROVIDED) {
            map = $topic_struct_parameter_value_map$.getDynamicValue();
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject score = ZERO_INTEGER;
                {
                    SubLObject _prev_bind_0 = $topic_struct_parameter_value_map$.currentBinding(thread);
                    try {
                        $topic_struct_parameter_value_map$.bind(map, thread);
                        if (!((NIL != getf(plist, $kw87$SUPPORTER_MORE_GENERAL_, UNPROVIDED)) && getf(plist, $TERM_GENERALITY, UNPROVIDED).numG(topic_struct_isaXgenls_generality_cutoff()))) {
                            {
                                SubLObject word_position = getf(plist, $FOCAL_POSITION, UNPROVIDED);
                                SubLObject position = getf(plist, $SUPPORTER_POSITION, UNPROVIDED);
                                SubLObject proximity_factor = topic_struct_proximity_factor(word_position, position, l2r_base_value(), l2r_intra_sentence_degradation_base(), l2r_inter_sentence_degradation_base());
                                SubLObject word_weight = proximity_factor;
                                if (!word_weight.numL(word_weight_cutoff())) {
                                    {
                                        SubLObject denot = getf(plist, $SUPPORTER, UNPROVIDED);
                                        SubLObject generality_estimate = getf(plist, $SUPPORTER_GENERALITY, UNPROVIDED);
                                        score = denot_weight(denot, word_weight, generality_estimate);
                                    }
                                }
                            }
                        }
                    } finally {
                        $topic_struct_parameter_value_map$.rebind(_prev_bind_0, thread);
                    }
                }
                return score;
            }
        }
    }

    public static final SubLObject cookie_data_supporter(SubLObject data) {
        return getf(data, $SUPPORTER, UNPROVIDED);
    }

    public static final SubLObject cookie_data_score(SubLObject data) {
        return getf(data, $SCORE, UNPROVIDED);
    }

    public static final SubLObject genl_count_cookie_score(SubLObject data, SubLObject map) {
        if (map == UNPROVIDED) {
            map = $topic_struct_parameter_value_map$.getDynamicValue();
        }
        {
            SubLObject score = ZERO_INTEGER;
            SubLObject cdolist_list_var = data;
            SubLObject plist = NIL;
            for (plist = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , plist = cdolist_list_var.first()) {
                score = add(score, genl_count_plist_score(plist, map));
            }
            return score;
        }
    }

    public static final SubLObject genl_count_plist_score(SubLObject plist, SubLObject map) {
        if (map == UNPROVIDED) {
            map = $topic_struct_parameter_value_map$.getDynamicValue();
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject score = ZERO_INTEGER;
                {
                    SubLObject _prev_bind_0 = $topic_struct_parameter_value_map$.currentBinding(thread);
                    try {
                        $topic_struct_parameter_value_map$.bind(map, thread);
                        {
                            SubLObject word_position = getf(plist, $FOCAL_POSITION, UNPROVIDED);
                            SubLObject position = getf(plist, $SUPPORTER_POSITION, UNPROVIDED);
                            SubLObject proximity_factor = topic_struct_proximity_factor(word_position, position, l2r_base_value(), l2r_intra_sentence_degradation_base(), l2r_inter_sentence_degradation_base());
                            SubLObject word_weight = proximity_factor;
                            if (!word_weight.numL(word_weight_cutoff())) {
                                {
                                    SubLObject denot = getf(plist, $SUPPORTER, UNPROVIDED);
                                    SubLObject generality_estimate = getf(plist, $SUPPORTER_GENERALITY, UNPROVIDED);
                                    score = denot_weight(denot, word_weight, generality_estimate);
                                }
                            }
                        }
                    } finally {
                        $topic_struct_parameter_value_map$.rebind(_prev_bind_0, thread);
                    }
                }
                return score;
            }
        }
    }



    public static final SubLObject generality_degradation_base() {
        return topic_struct_parameter_value($generality_degradation_base$, UNPROVIDED);
    }

    public static final SubLObject denot_weight(SubLObject denot, SubLObject word_weight, SubLObject generality_estimate) {
        if (generality_estimate == UNPROVIDED) {
            generality_estimate = NIL;
        }
        if (NIL == generality_estimate) {
            generality_estimate = cardinality_estimates.generality_estimate(denot);
        }
        {
            SubLObject base = generality_degradation_base();
            SubLObject generality_factor = (generality_estimate.numL(base)) ? ((SubLObject) (ONE_INTEGER)) : log(generality_estimate, base);
            SubLObject denot_weight = divide(word_weight, generality_factor);
            return denot_weight;
        }
    }

    public static final SubLObject conceptually_related_cookie_score(SubLObject data, SubLObject map) {
        if (map == UNPROVIDED) {
            map = $topic_struct_parameter_value_map$.getDynamicValue();
        }
        {
            SubLObject score = ZERO_INTEGER;
            SubLObject cdolist_list_var = data;
            SubLObject plist = NIL;
            for (plist = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , plist = cdolist_list_var.first()) {
                score = add(score, conceptually_related_plist_score(plist, map));
            }
            return score;
        }
    }

    public static final SubLObject conceptually_related_plist_score(SubLObject plist, SubLObject map) {
        if (map == UNPROVIDED) {
            map = $topic_struct_parameter_value_map$.getDynamicValue();
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject score = ZERO_INTEGER;
                {
                    SubLObject _prev_bind_0 = $topic_struct_parameter_value_map$.currentBinding(thread);
                    try {
                        $topic_struct_parameter_value_map$.bind(map, thread);
                        {
                            SubLObject word_position = getf(plist, $FOCAL_POSITION, UNPROVIDED);
                            SubLObject position = getf(plist, $SUPPORTER_POSITION, UNPROVIDED);
                            SubLObject path = butlast(position, UNPROVIDED);
                            SubLObject index = list_utilities.last_one(position);
                            SubLObject sentence_num = list_utilities.last_one(path);
                            SubLObject word_path = butlast(word_position, UNPROVIDED);
                            SubLObject word_index = list_utilities.last_one(word_position);
                            SubLObject sentence_index = list_utilities.last_one(word_path);
                            SubLObject sentence_distance = abs(subtract(sentence_num, sentence_index));
                            SubLObject word_distance = abs(subtract(index, word_index));
                            if ((sentence_distance.numLE(topic_struct_conceptually_related_max_sentence_distance()) && word_distance.numG(ZERO_INTEGER)) && word_distance.numLE(topic_struct_conceptually_related_max_word_distance())) {
                                {
                                    SubLObject proximity_factor = topic_struct_proximity_factor(word_position, position, l2r_base_value(), l2r_intra_sentence_degradation_base(), l2r_inter_sentence_degradation_base());
                                    SubLObject word_weight = proximity_factor;
                                    if (!word_weight.numL(word_weight_cutoff())) {
                                        {
                                            SubLObject denot = getf(plist, $SUPPORTER, UNPROVIDED);
                                            SubLObject generality_estimate = getf(plist, $SUPPORTER_GENERALITY, UNPROVIDED);
                                            score = add(score, denot_weight(denot, word_weight, generality_estimate));
                                        }
                                    }
                                }
                            }
                        }
                    } finally {
                        $topic_struct_parameter_value_map$.rebind(_prev_bind_0, thread);
                    }
                }
                return score;
            }
        }
    }

    public static final SubLObject topic_struct_conceptually_relatedP_internal(SubLObject source, SubLObject target, SubLObject mt) {
        return removal_modules_conceptually_related.conceptually_relatedP(source, target, mt, NIL);
    }

    public static final SubLObject topic_struct_conceptually_relatedP(SubLObject source, SubLObject target, SubLObject mt) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
                SubLObject caching_state = NIL;
                if (NIL == v_memoization_state) {
                    return topic_struct_conceptually_relatedP_internal(source, target, mt);
                }
                caching_state = memoization_state.memoization_state_lookup(v_memoization_state, $sym93$TOPIC_STRUCT_CONCEPTUALLY_RELATED_, UNPROVIDED);
                if (NIL == caching_state) {
                    caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), $sym93$TOPIC_STRUCT_CONCEPTUALLY_RELATED_, THREE_INTEGER, NIL, EQUAL, UNPROVIDED);
                    memoization_state.memoization_state_put(v_memoization_state, $sym93$TOPIC_STRUCT_CONCEPTUALLY_RELATED_, caching_state);
                }
                {
                    SubLObject sxhash = memoization_state.sxhash_calc_3(source, target, mt);
                    SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
                    if (collisions != $kw19$_MEMOIZED_ITEM_NOT_FOUND_) {
                        {
                            SubLObject cdolist_list_var = collisions;
                            SubLObject collision = NIL;
                            for (collision = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , collision = cdolist_list_var.first()) {
                                {
                                    SubLObject cached_args = collision.first();
                                    SubLObject results2 = second(collision);
                                    if (source.equal(cached_args.first())) {
                                        cached_args = cached_args.rest();
                                        if (target.equal(cached_args.first())) {
                                            cached_args = cached_args.rest();
                                            if (((NIL != cached_args) && (NIL == cached_args.rest())) && mt.equal(cached_args.first())) {
                                                return memoization_state.caching_results(results2);
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                    {
                        SubLObject results = arg2(thread.resetMultipleValues(), multiple_value_list(topic_struct_conceptually_relatedP_internal(source, target, mt)));
                        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results, list(source, target, mt));
                        return memoization_state.caching_results(results);
                    }
                }
            }
        }
    }

    public static final SubLObject topic_struct_word_compositional_contributor_score(SubLObject topic_struct, SubLObject word_position, SubLObject v_term) {
        {
            SubLObject word_path = butlast(word_position, UNPROVIDED);
            SubLObject word_index = list_utilities.last_one(word_position);
            SubLObject sentence_string = topic_struct_bunge_sentence_string(topic_struct, word_path);
            return topic_struct_string_compositional_contributor_score(sentence_string, v_term, word_index);
        }
    }

    public static final SubLObject topic_struct_bunge_sentence_string(SubLObject topic_struct, SubLObject sentence_path) {
        {
            SubLObject sentence = topic_struct_sentence_from_position(topic_struct, sentence_path);
            SubLObject sentence_string = NIL;
            SubLTrampolineFile.checkType(sentence, TOPIC_STRUCT_SENTENCE_P);
            {
                SubLObject stream = NIL;
                try {
                    stream = make_private_string_output_stream();
                    {
                        SubLObject cdolist_list_var = cycl_utilities.nat_args(sentence, UNPROVIDED);
                        SubLObject word = NIL;
                        for (word = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , word = cdolist_list_var.first()) {
                            princ(topic_struct_word_string(word), stream);
                            princ(CHAR_space, stream);
                        }
                    }
                    sentence_string = get_output_stream_string(stream);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            close(stream, UNPROVIDED);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            }
            return string_utilities.remove_last_char(sentence_string, UNPROVIDED);
        }
    }

    public static final SubLObject topic_struct_string_compositional_contributor_score(SubLObject string, SubLObject denot, SubLObject index) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            SubLTrampolineFile.checkType(string, STRINGP);
            {
                SubLObject data = NIL;
                SubLObject tokenization_fudge_factor = FIVE_INTEGER;
                SubLObject harvest = NIL;
                {
                    SubLObject _prev_bind_0 = parsing_vars.$psp_return_mode$.currentBinding(thread);
                    SubLObject _prev_bind_1 = parsing_vars.$psp_reformulateP$.currentBinding(thread);
                    SubLObject _prev_bind_2 = parsing_vars.$npp_use_nl_tagsP$.currentBinding(thread);
                    try {
                        parsing_vars.$psp_return_mode$.bind($BEST_ONLY, thread);
                        parsing_vars.$psp_reformulateP$.bind(NIL, thread);
                        parsing_vars.$npp_use_nl_tagsP$.bind(T, thread);
                        {
                            SubLObject time = NIL;
                            SubLObject time_var = get_internal_real_time();
                            harvest = psp_main.ps_harvest_phrases(string, $$NLPhrase, T);
                            time = divide(subtract(get_internal_real_time(), time_var), time_high.$internal_time_units_per_second$.getGlobalValue());
                            if (time.numG(ONE_INTEGER)) {
                                Errors.warn($str_alt98$Spent__S_seconds_harvesting_phras, time, string);
                            }
                        }
                    } finally {
                        parsing_vars.$npp_use_nl_tagsP$.rebind(_prev_bind_2, thread);
                        parsing_vars.$psp_reformulateP$.rebind(_prev_bind_1, thread);
                        parsing_vars.$psp_return_mode$.rebind(_prev_bind_0, thread);
                    }
                }
                {
                    SubLObject cdolist_list_var = harvest;
                    SubLObject result = NIL;
                    for (result = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , result = cdolist_list_var.first()) {
                        {
                            SubLObject datum = result;
                            SubLObject current = datum;
                            SubLObject tokens = NIL;
                            SubLObject parses = NIL;
                            destructuring_bind_must_consp(current, datum, $list_alt99);
                            tokens = current.first();
                            current = current.rest();
                            destructuring_bind_must_consp(current, datum, $list_alt99);
                            parses = current.first();
                            current = current.rest();
                            if (NIL == current) {
                                {
                                    SubLObject start_index = tokens.first();
                                    SubLObject start_fudge = subtract(start_index, index);
                                    SubLObject end_index = list_utilities.last_one(tokens);
                                    SubLObject end_fudge = subtract(index, end_index);
                                    SubLObject max_fudge = number_utilities.maximum(list(start_fudge, end_fudge), UNPROVIDED);
                                    SubLObject reformulation_time = ZERO_INTEGER;
                                    SubLObject max_reformulation_time = $int$30;
                                    SubLObject reformulation_count = ZERO_INTEGER;
                                    SubLObject verboseP = topic_struct_verboseP();
                                    SubLObject this_time = NIL;
                                    if (max_fudge.numLE(tokenization_fudge_factor)) {
                                        {
                                            SubLObject cdolist_list_var_7 = parses;
                                            SubLObject parse = NIL;
                                            for (parse = cdolist_list_var_7.first(); NIL != cdolist_list_var_7; cdolist_list_var_7 = cdolist_list_var_7.rest() , parse = cdolist_list_var_7.first()) {
                                                if (!((NIL != constant_handles.constant_p(parse)) || (NIL != cycl_utilities.expression_find_if(KEYWORDP, parse, UNPROVIDED, UNPROVIDED)))) {
                                                    if (NIL != cycl_utilities.expression_find(denot, parse, T, symbol_function(EQUAL), UNPROVIDED)) {
                                                        {
                                                            SubLObject original_underspecifiedP = cycl_utilities.expression_find_if(UNDERSPECIFIED_PRED_P, parse, UNPROVIDED, UNPROVIDED);
                                                            SubLObject reformulated = NIL;
                                                            SubLObject timed_outP = NIL;
                                                            if (NIL != original_underspecifiedP) {
                                                                {
                                                                    SubLObject time_var = get_internal_real_time();
                                                                    thread.resetMultipleValues();
                                                                    {
                                                                        SubLObject reformulated_8 = nl_reformulator.nl_reformulate(parse, max_reformulation_time);
                                                                        SubLObject timed_outP_9 = thread.secondMultipleValue();
                                                                        thread.resetMultipleValues();
                                                                        reformulated = reformulated_8;
                                                                        timed_outP = timed_outP_9;
                                                                    }
                                                                    this_time = divide(subtract(get_internal_real_time(), time_var), time_high.$internal_time_units_per_second$.getGlobalValue());
                                                                }
                                                            } else {
                                                                reformulated = parse;
                                                            }
                                                            if ((NIL != timed_outP) && (NIL != verboseP)) {
                                                                Errors.warn($str_alt103$Timed_out_trying_to_reformulate__, parse, reformulated);
                                                            }
                                                            if (NIL != original_underspecifiedP) {
                                                                reformulation_time = add(reformulation_time, this_time);
                                                                reformulation_count = add(reformulation_count, ONE_INTEGER);
                                                            }
                                                            if (!((NIL != original_underspecifiedP) && (NIL != cycl_utilities.expression_find_if(UNDERSPECIFIED_PRED_P, reformulated, UNPROVIDED, UNPROVIDED)))) {
                                                                {
                                                                    SubLObject stripped = parsing_utilities.strip_nl_tags(parse, UNPROVIDED);
                                                                    SubLObject stripped_reformulated = parsing_utilities.strip_nl_tags(reformulated, UNPROVIDED);
                                                                    if (NIL != verboseP) {
                                                                        Errors.warn($str_alt104$Good_parse_____S, stripped);
                                                                    }
                                                                    data = cons(list($SUPPORTER, stripped_reformulated, $FUDGE_FACTOR, max_fudge), data);
                                                                    if (NIL != verboseP) {
                                                                        Errors.warn($str_alt106$_S_is_used_in____S___A_Fudge_fact, new SubLObject[]{ denot, stripped, stripped.equal(stripped_reformulated) ? ((SubLObject) (string_utilities.$empty_string$.getGlobalValue())) : cconcatenate($$$Reformulated_to, new SubLObject[]{ format_nil.$format_nil_percent$.getGlobalValue(), $str_alt108$_, format_nil.format_nil_s_no_copy(stripped_reformulated), format_nil.$format_nil_percent$.getGlobalValue() }), max_fudge.numG(ZERO_INTEGER) ? ((SubLObject) (max_fudge)) : ZERO_INTEGER });
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                        if (reformulation_time.numG(ONE_INTEGER)) {
                                            Errors.warn($str_alt109$Spent__S_seconds_reformulating__S, reformulation_time, reformulation_count, string);
                                        }
                                    }
                                }
                            } else {
                                cdestructuring_bind_error(datum, $list_alt99);
                            }
                        }
                    }
                }
                return values(compositional_contribution_cookie_score(data, UNPROVIDED), data);
            }
        }
    }

    public static final SubLObject compositional_contribution_cookie_score(SubLObject data, SubLObject map) {
        if (map == UNPROVIDED) {
            map = $topic_struct_parameter_value_map$.getDynamicValue();
        }
        {
            SubLObject score = ZERO_INTEGER;
            SubLObject cdolist_list_var = data;
            SubLObject plist = NIL;
            for (plist = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , plist = cdolist_list_var.first()) {
                score = add(score, compositional_contribution_plist_score(plist, map));
            }
            return score;
        }
    }

    public static final SubLObject compositional_contribution_plist_score(SubLObject plist, SubLObject map) {
        if (map == UNPROVIDED) {
            map = $topic_struct_parameter_value_map$.getDynamicValue();
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject score = ZERO_INTEGER;
                {
                    SubLObject _prev_bind_0 = $topic_struct_parameter_value_map$.currentBinding(thread);
                    try {
                        $topic_struct_parameter_value_map$.bind(map, thread);
                        {
                            SubLObject word_position = getf(plist, $FOCAL_POSITION, UNPROVIDED);
                            SubLObject position = getf(plist, $SUPPORTER_POSITION, UNPROVIDED);
                            SubLObject bonus = getf(plist, $SENTENCE_TRUTH_BONUS, ZERO_INTEGER);
                            SubLObject max = add(l2r_compositional_contribution_base_weight(), bonus);
                            SubLObject proximity_factor = topic_struct_proximity_factor(word_position, position, max, l2r_intra_sentence_degradation_base(), l2r_inter_sentence_degradation_base());
                            score = proximity_factor;
                        }
                    } finally {
                        $topic_struct_parameter_value_map$.rebind(_prev_bind_0, thread);
                    }
                }
                return score;
            }
        }
    }

    /**
     * evaluation defn for #$StrategyScoreForHypothesesFn, the primary entry point to this code.
     */
    public static final SubLObject strategy_score_for_sihms_defn(SubLObject osf_mt, SubLObject sihm1, SubLObject sihm2) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject error_message = NIL;
                SubLObject score = NIL;
                try {
                    {
                        SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
                        try {
                            Errors.$error_handler$.bind(CATCH_ERROR_MESSAGE_HANDLER, thread);
                            try {
                                {
                                    SubLObject strategy = optimized_strategy_form_strategy(osf_mt);
                                    SubLObject strategy_scoring_method = disambiguation_scoring_method_for_strategy(strategy);
                                    if (NIL == fboundp(strategy_scoring_method)) {
                                        Errors.warn($str_alt112$Couldn_t_find_a_valid_scoring_met, osf_mt);
                                        relation_evaluation.throw_unevaluatable();
                                    }
                                    score = funcall(strategy_scoring_method, osf_mt, sihm1, sihm2);
                                    if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                                        if (!score.isNumber()) {
                                            Errors.error($str_alt113$Couldn_t_get_a_valid_score_for__S, strategy_scoring_method, sihm1, sihm2);
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
                    error_message = Errors.handleThrowable(ccatch_env_var, subl_macro_promotions.$catch_error_message_target$.getGlobalValue());
                }
                if (error_message.isString()) {
                    Errors.warn(cconcatenate($str_alt114$Error_in_STRATEGY_SCORE_FOR_SIHMS, error_message));
                    relation_evaluation.throw_unevaluatable();
                }
                return score;
            }
        }
    }

    // deflexical
    private static final SubLSymbol $disambiguation_scoring_methods_for_strategies$ = makeSymbol("*DISAMBIGUATION-SCORING-METHODS-FOR-STRATEGIES*");

    public static final SubLObject disambiguation_scoring_method_for_strategy(SubLObject strategy) {
        SubLTrampolineFile.checkType(strategy, FORT_P);
        {
            SubLObject el_strategy = cycl_utilities.hl_to_el(strategy);
            SubLObject method = NIL;
            SubLObject rest = NIL;
            for (rest = $disambiguation_scoring_methods_for_strategies$.getGlobalValue(); !((NIL != method) || (NIL == rest)); rest = rest.rest()) {
                {
                    SubLObject cons = rest.first();
                    SubLObject datum = cons;
                    SubLObject current = datum;
                    SubLObject pattern = NIL;
                    SubLObject this_method = NIL;
                    destructuring_bind_must_consp(current, datum, $list_alt118);
                    pattern = current.first();
                    current = current.rest();
                    this_method = current;
                    if (NIL != formula_pattern_match.formula_matches_pattern(el_strategy, pattern)) {
                        method = this_method;
                    }
                }
            }
            return method;
        }
    }

    public static final SubLObject relative_ambiguity_score_from_sihms(SubLObject osf_mt, SubLObject sihm1, SubLObject sihm2) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject peg = nth_value_step_2(nth_value_step_1(ZERO_INTEGER), peg_and_cycl_from_sihm(sihm1));
                SubLObject ambiguity_level = length(lexical_peg_denots(peg));
                SubLObject ans = NIL;
                {
                    SubLObject _prev_bind_0 = $topic_struct_parameter_value_map$.currentBinding(thread);
                    try {
                        $topic_struct_parameter_value_map$.bind(osf_mt, thread);
                        ans = divide(l2r_base_value(), ambiguity_level);
                    } finally {
                        $topic_struct_parameter_value_map$.rebind(_prev_bind_0, thread);
                    }
                }
                return ans;
            }
        }
    }

    public static final SubLObject presupposition_ambiguity_score_from_sihms(SubLObject osf_mt, SubLObject sihm1, SubLObject sihm2) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject peg = nth_value_step_2(nth_value_step_1(ZERO_INTEGER), peg_and_cycl_from_sihm(sihm1));
                SubLObject ambiguity_level = number_utilities.f_1X(length(presupposition_sihm_competitors(sihm1, peg)));
                SubLObject ans = NIL;
                {
                    SubLObject _prev_bind_0 = $topic_struct_parameter_value_map$.currentBinding(thread);
                    try {
                        $topic_struct_parameter_value_map$.bind(osf_mt, thread);
                        ans = divide(l2r_base_value(), ambiguity_level);
                    } finally {
                        $topic_struct_parameter_value_map$.rebind(_prev_bind_0, thread);
                    }
                }
                return ans;
            }
        }
    }

    public static final SubLObject presupposition_sihm_competitors(SubLObject sihm, SubLObject peg) {
        return backward.removal_ask_variable($COMPETITOR, listS($$contradictoryMt, sihm, $list_alt121), narts_high.find_nart(list($$ContentModelForPegFn, peg)), UNPROVIDED, UNPROVIDED);
    }

    public static final SubLObject ncr_reliability_score_from_sihms(SubLObject osf_mt, SubLObject sihm1, SubLObject sihm2) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject ncr = ncr_from_sihm(sihm1);
                SubLObject ncr_precision = (NIL != ncr) ? ((SubLObject) (l2r_ncr_precision_score(ncr))) : NIL;
                SubLObject ans = ZERO_INTEGER;
                if (ncr_precision.isNumber()) {
                    {
                        SubLObject _prev_bind_0 = $topic_struct_parameter_value_map$.currentBinding(thread);
                        try {
                            $topic_struct_parameter_value_map$.bind(osf_mt, thread);
                            ans = multiply(l2r_base_value(), ncr_precision);
                        } finally {
                            $topic_struct_parameter_value_map$.rebind(_prev_bind_0, thread);
                        }
                    }
                }
                return ans;
            }
        }
    }

    public static final SubLObject ncr_from_sihm(SubLObject sihm) {
        return kb_mapping_utilities.fpred_value_in_any_mt(sihm, $$ncRuleSpawnsHypotheses, TWO_INTEGER, ONE_INTEGER, $TRUE);
    }

    public static final SubLObject l2r_ncr_precision_score(SubLObject ncr) {
        return candidate_nc_utilities.default_aggregate_cnc_score_wrt_yahoo(ncr, UNPROVIDED);
    }

    public static final SubLObject presupposition_score_from_sihms(SubLObject osf_mt, SubLObject sihm1, SubLObject sihm2) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject ans = NIL;
                {
                    SubLObject _prev_bind_0 = $topic_struct_parameter_value_map$.currentBinding(thread);
                    try {
                        $topic_struct_parameter_value_map$.bind(osf_mt, thread);
                        ans = sihm_truth_bonus(sihm2);
                    } finally {
                        $topic_struct_parameter_value_map$.rebind(_prev_bind_0, thread);
                    }
                }
                return ans;
            }
        }
    }

    public static final SubLObject type_behavior_capable_score_from_sihms(SubLObject osf_mt, SubLObject sihm1, SubLObject sihm2) {
        return l2r_base_score_from_map(osf_mt);
    }

    public static final SubLObject validated_hypothesis_score_from_sihms(SubLObject osf_mt, SubLObject sihm1, SubLObject sihm2) {
        return l2r_base_score_from_map(osf_mt);
    }

    public static final SubLObject synonym_score_from_sihms(SubLObject osf_mt, SubLObject sihm1, SubLObject sihm2) {
        return l2r_base_score_from_map(osf_mt);
    }

    public static final SubLObject l2r_base_score_from_map(SubLObject map) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject ans = NIL;
                {
                    SubLObject _prev_bind_0 = $topic_struct_parameter_value_map$.currentBinding(thread);
                    try {
                        $topic_struct_parameter_value_map$.bind(map, thread);
                        ans = l2r_base_value();
                    } finally {
                        $topic_struct_parameter_value_map$.rebind(_prev_bind_0, thread);
                    }
                }
                return ans;
            }
        }
    }

    public static final SubLObject isa_score_from_sihms(SubLObject osf_mt, SubLObject sihm1, SubLObject sihm2) {
        {
            SubLObject plist = isa_plist_from_sihms(sihm1, sihm2);
            return isa_count_plist_score(plist, osf_mt);
        }
    }

    public static final SubLObject genl_score_from_sihms(SubLObject osf_mt, SubLObject sihm1, SubLObject sihm2) {
        {
            SubLObject plist = genl_plist_from_sihms(sihm1, sihm2);
            return genl_count_plist_score(plist, osf_mt);
        }
    }

    public static final SubLObject conceptually_related_score_from_sihms(SubLObject osf_mt, SubLObject sihm1, SubLObject sihm2) {
        {
            SubLObject plist = conceptually_related_plist_from_sihms(sihm1, sihm2);
            return conceptually_related_plist_score(plist, osf_mt);
        }
    }

    public static final SubLObject term_formulas_score_from_sihms(SubLObject osf_mt, SubLObject sihm1, SubLObject sihm2) {
        {
            SubLObject plist = term_formulas_plist_from_sihms(sihm1, sihm2);
            return compositional_contribution_plist_score(plist, osf_mt);
        }
    }

    public static final SubLObject sibling_score_from_sihms(SubLObject osf_mt, SubLObject sihm1, SubLObject sihm2) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject strategy = optimized_strategy_form_strategy(osf_mt);
                SubLObject binary_pred = cycl_utilities.nat_arg1(strategy, UNPROVIDED);
                thread.resetMultipleValues();
                {
                    SubLObject success = formula_pattern_match.formula_matches_pattern(binary_pred, $list_alt125);
                    SubLObject v_bindings = thread.secondMultipleValue();
                    thread.resetMultipleValues();
                    if (NIL != success) {
                        {
                            SubLObject type = list_utilities.alist_lookup_without_values(v_bindings, TYPE, UNPROVIDED, UNPROVIDED);
                            SubLObject plist = sibling_plist_from_sihms(sihm1, sihm2, type);
                            SubLObject score = sibling_plist_score(type, plist, osf_mt);
                            return score;
                        }
                    }
                }
            }
            return NIL;
        }
    }

    public static final SubLObject isa_plist_from_sihms(SubLObject instance_sihm, SubLObject isa_sihm) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            thread.resetMultipleValues();
            {
                SubLObject supporter_peg = peg_and_cycl_from_sihm(isa_sihm);
                SubLObject supporter = thread.secondMultipleValue();
                thread.resetMultipleValues();
                thread.resetMultipleValues();
                {
                    SubLObject peg = peg_and_cycl_from_sihm(instance_sihm);
                    SubLObject v_term = thread.secondMultipleValue();
                    thread.resetMultipleValues();
                    return list(new SubLObject[]{ $SUPPORTER, supporter, $SUPPORTER_GENERALITY, cardinality_estimates.generality_estimate(supporter), $TERM_GENERALITY, cardinality_estimates.generality_estimate(v_term), $kw87$SUPPORTER_MORE_GENERAL_, T, $AMBIGUITY_FACTOR, length(lexical_peg_denots(peg)), $FOCAL_POSITION, peg_position(peg), $SUPPORTER_POSITION, peg_position(supporter_peg) });
                }
            }
        }
    }

    public static final SubLObject genl_plist_from_sihms(SubLObject spec_sihm, SubLObject genl_sihm) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            thread.resetMultipleValues();
            {
                SubLObject supporter_peg = peg_and_cycl_from_sihm(genl_sihm);
                SubLObject supporter = thread.secondMultipleValue();
                thread.resetMultipleValues();
                thread.resetMultipleValues();
                {
                    SubLObject peg = peg_and_cycl_from_sihm(spec_sihm);
                    SubLObject v_term = thread.secondMultipleValue();
                    thread.resetMultipleValues();
                    return list(new SubLObject[]{ $SUPPORTER, supporter, $SUPPORTER_GENERALITY, cardinality_estimates.generality_estimate(supporter), $AMBIGUITY_FACTOR, length(lexical_peg_denots(peg)), $FOCAL_POSITION, peg_position(peg), $SUPPORTER_POSITION, peg_position(supporter_peg) });
                }
            }
        }
    }

    public static final SubLObject conceptually_related_plist_from_sihms(SubLObject focal_sihm, SubLObject supporter_sihm) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            thread.resetMultipleValues();
            {
                SubLObject supporter_peg = peg_and_cycl_from_sihm(supporter_sihm);
                SubLObject supporter = thread.secondMultipleValue();
                thread.resetMultipleValues();
                thread.resetMultipleValues();
                {
                    SubLObject peg = peg_and_cycl_from_sihm(focal_sihm);
                    SubLObject v_term = thread.secondMultipleValue();
                    thread.resetMultipleValues();
                    return list(new SubLObject[]{ $SUPPORTER, supporter, $SUPPORTER_GENERALITY, cardinality_estimates.generality_estimate(supporter), $AMBIGUITY_FACTOR, length(lexical_peg_denots(peg)), $FOCAL_POSITION, peg_position(peg), $SUPPORTER_POSITION, peg_position(supporter_peg) });
                }
            }
        }
    }

    public static final SubLObject sibling_plist_from_sihms(SubLObject focal_sihm, SubLObject supporter_sihm, SubLObject type) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            thread.resetMultipleValues();
            {
                SubLObject supporter_peg = peg_and_cycl_from_sihm(supporter_sihm);
                SubLObject supporter = thread.secondMultipleValue();
                thread.resetMultipleValues();
                thread.resetMultipleValues();
                {
                    SubLObject peg = peg_and_cycl_from_sihm(focal_sihm);
                    SubLObject v_term = thread.secondMultipleValue();
                    thread.resetMultipleValues();
                    thread.resetMultipleValues();
                    {
                        SubLObject this_score = sibling_score_wrt_nearest_isa_of_type_internal(supporter, v_term, type);
                        SubLObject common_isas = thread.secondMultipleValue();
                        thread.resetMultipleValues();
                        {
                            SubLObject plist = NIL;
                            {
                                SubLObject _prev_bind_0 = $l2r_document$.currentBinding(thread);
                                try {
                                    $l2r_document$.bind(peg_l2r_document(peg), thread);
                                    plist = list(new SubLObject[]{ $SUPPORTER, supporter, $RAW_SCORE, this_score, $COMMON_ISAS, common_isas, $AMBIGUITY_FACTOR, length(lexical_peg_denots(peg)), $FOCAL_POSITION, peg_position(peg), $SUPPORTER_POSITION, peg_position(supporter_peg) });
                                } finally {
                                    $l2r_document$.rebind(_prev_bind_0, thread);
                                }
                            }
                            return plist;
                        }
                    }
                }
            }
        }
    }

    public static final SubLObject term_formulas_plist_from_sihms(SubLObject small_sihm, SubLObject big_sihm) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject supporter_peg = nth_value_step_2(nth_value_step_1(ZERO_INTEGER), peg_and_cycl_from_sihm(big_sihm));
                thread.resetMultipleValues();
                {
                    SubLObject peg = peg_and_cycl_from_sihm(small_sihm);
                    SubLObject v_term = thread.secondMultipleValue();
                    thread.resetMultipleValues();
                    return list($AMBIGUITY_FACTOR, length(lexical_peg_denots(peg)), $FOCAL_POSITION, peg_position(peg), $SENTENCE_TRUTH_BONUS, sihm_truth_bonus(big_sihm), $SUPPORTER_POSITION, peg_position(supporter_peg));
                }
            }
        }
    }

    public static final SubLObject sihm_truth_bonus(SubLObject sihm) {
        return NIL != isa.isa_in_any_mtP(sihm, $const129$ContentHypothesisMicrotheory_Cont) ? ((SubLObject) (l2r_sentence_truth_bonus())) : ZERO_INTEGER;
    }

    public static final SubLObject optimized_strategy_form_p(SubLObject v_object) {
        return makeBoolean((NIL != fort_types_interface.microtheory_p(v_object)) && (cycl_utilities.nat_functor(v_object) == $$OptimizedStrategyFormFn));
    }

    public static final SubLObject topic_struct_parameter_value_from_optimized_strategy_form(SubLObject parameter, SubLObject osf_mt) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject strategy = optimized_strategy_form_strategy(osf_mt);
                SubLObject parameter_pred = subl_identifier.cyc_entity_from_sublid(parameter, $const131$DisambiguationScoringStrategyPara);
                SubLObject value = NIL;
                if ((NIL != forts.fort_p(parameter_pred)) && (NIL != kb_indexing_datastructures.indexed_term_p(strategy))) {
                    {
                        SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                        SubLObject _prev_bind_1 = mt_relevance_macros.$mt$.currentBinding(thread);
                        try {
                            mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EQ, thread);
                            mt_relevance_macros.$mt$.bind(osf_mt, thread);
                            value = kb_mapping_utilities.fpred_value(strategy, parameter_pred, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                        } finally {
                            mt_relevance_macros.$mt$.rebind(_prev_bind_1, thread);
                            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
                        }
                    }
                }
                return value;
            }
        }
    }

    public static final SubLObject optimized_strategy_form_strategy(SubLObject osf_mt) {
        return kb_mapping_utilities.fpred_value_in_any_mt(osf_mt, $$optimizedStrategyForm, TWO_INTEGER, ONE_INTEGER, UNPROVIDED);
    }

    public static final SubLObject peg_and_cycl_from_sihm(SubLObject sihm) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject peg = NIL;
                SubLObject cycl = NIL;
                {
                    SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                    SubLObject _prev_bind_1 = mt_relevance_macros.$mt$.currentBinding(thread);
                    try {
                        mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
                        mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
                        {
                            SubLObject pred_var = $$mtFocalContent;
                            if (NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(sihm, ONE_INTEGER, pred_var)) {
                                {
                                    SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(sihm, ONE_INTEGER, pred_var);
                                    SubLObject done_var = cycl;
                                    SubLObject token_var = NIL;
                                    while (NIL == done_var) {
                                        {
                                            SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                                            SubLObject valid = makeBoolean(token_var != final_index_spec);
                                            if (NIL != valid) {
                                                {
                                                    SubLObject final_index_iterator = NIL;
                                                    try {
                                                        final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, $TRUE, NIL);
                                                        {
                                                            SubLObject done_var_10 = cycl;
                                                            SubLObject token_var_11 = NIL;
                                                            while (NIL == done_var_10) {
                                                                {
                                                                    SubLObject gaf = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_11);
                                                                    SubLObject valid_12 = makeBoolean(token_var_11 != gaf);
                                                                    if (NIL != valid_12) {
                                                                        thread.resetMultipleValues();
                                                                        {
                                                                            SubLObject success = formula_pattern_match.formula_matches_pattern(assertions_high.gaf_arg2(gaf), $list_alt138);
                                                                            SubLObject v_bindings = thread.secondMultipleValue();
                                                                            thread.resetMultipleValues();
                                                                            if (NIL != success) {
                                                                                {
                                                                                    SubLObject this_cycl = list_utilities.alist_lookup_without_values(v_bindings, THIS_CYCL, UNPROVIDED, UNPROVIDED);
                                                                                    SubLObject this_peg = list_utilities.alist_lookup_without_values(v_bindings, THIS_PEG, UNPROVIDED, UNPROVIDED);
                                                                                    peg = this_peg;
                                                                                    cycl = this_cycl;
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                    done_var_10 = makeBoolean((NIL == valid_12) || (NIL != cycl));
                                                                }
                                                            } 
                                                        }
                                                    } finally {
                                                        {
                                                            SubLObject _prev_bind_0_13 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                            try {
                                                                $is_thread_performing_cleanupP$.bind(T, thread);
                                                                if (NIL != final_index_iterator) {
                                                                    kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                                                }
                                                            } finally {
                                                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0_13, thread);
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                            done_var = makeBoolean((NIL == valid) || (NIL != cycl));
                                        }
                                    } 
                                }
                            }
                        }
                    } finally {
                        mt_relevance_macros.$mt$.rebind(_prev_bind_1, thread);
                        mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
                    }
                }
                if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                    if (NIL == peg) {
                        Errors.error($str_alt141$Couldn_t_find_peg_for__S, sihm);
                    }
                }
                if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                    if (NIL == cycl) {
                        Errors.error($str_alt142$Couldn_t_find_cycl_for__S, sihm);
                    }
                }
                return values(peg, cycl);
            }
        }
    }

    public static final SubLObject document_from_sihm(SubLObject sihm) {
        {
            SubLObject peg = peg_and_cycl_from_sihm(sihm);
            return NIL != peg ? ((SubLObject) (peg_l2r_document(peg))) : NIL;
        }
    }

    public static final SubLObject peg_l2r_document(SubLObject peg) {
        return ask_utilities.query_variable($sym143$_DOCUMENT, listS($$and, list($$structureContainsCIS, $sym146$_AIS, peg), $list_alt147), $$InferencePSC, $list_alt149).first();
    }

    public static final SubLObject l2r_document_contains_denotP(SubLObject v_document, SubLObject denot) {
        return list_utilities.sublisp_boolean(inference_kernel.new_cyc_query(list($$and, $list_alt150, list($$candidatePegInterpretations_CycL, $sym152$_PEG, denot), listS($$correspondingAIS, v_document, $list_alt154)), $$InferencePSC, $list_alt155));
    }

    public static final SubLObject lexical_peg_denots(SubLObject peg) {
        return kb_mapping_utilities.pred_values_in_any_mt(peg, $$pegInterpretation_CycL, ONE_INTEGER, TWO_INTEGER, $TRUE);
    }

    /**
     *
     *
     * @return LISTP; of integers, except the last element, which may be a list of two integers,
    indicating the position of PEG within its containing superstructure.
     */
    public static final SubLObject peg_position(SubLObject peg) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            SubLTrampolineFile.checkType(peg, FORT_P);
            {
                SubLObject position = peg_position_from_covered_node(peg);
                if (NIL == position) {
                    position = peg_position_from_sub_pegs(peg);
                }
                if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                    if (NIL == position) {
                        Errors.error($str_alt157$Couldn_t_find_position_for__S, peg);
                    }
                }
                return position;
            }
        }
    }

    public static final SubLObject peg_position_from_covered_node(SubLObject peg) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject position = NIL;
                {
                    SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                    SubLObject _prev_bind_1 = mt_relevance_macros.$mt$.currentBinding(thread);
                    try {
                        mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
                        mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
                        {
                            SubLObject covered_node = NIL;
                            SubLObject pred_var = $$nodeCoveredByPeg;
                            if (NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(peg, TWO_INTEGER, pred_var)) {
                                {
                                    SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(peg, TWO_INTEGER, pred_var);
                                    SubLObject done_var = position;
                                    SubLObject token_var = NIL;
                                    while (NIL == done_var) {
                                        {
                                            SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                                            SubLObject valid = makeBoolean(token_var != final_index_spec);
                                            if (NIL != valid) {
                                                {
                                                    SubLObject final_index_iterator = NIL;
                                                    try {
                                                        final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, $TRUE, NIL);
                                                        {
                                                            SubLObject done_var_14 = position;
                                                            SubLObject token_var_15 = NIL;
                                                            while (NIL == done_var_14) {
                                                                {
                                                                    SubLObject assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_15);
                                                                    SubLObject valid_16 = makeBoolean(token_var_15 != assertion);
                                                                    if (NIL != valid_16) {
                                                                        covered_node = assertions_high.gaf_arg(assertion, ONE_INTEGER);
                                                                        position = syntactic_node_position(covered_node);
                                                                    }
                                                                    done_var_14 = makeBoolean((NIL == valid_16) || (NIL != position));
                                                                }
                                                            } 
                                                        }
                                                    } finally {
                                                        {
                                                            SubLObject _prev_bind_0_17 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                            try {
                                                                $is_thread_performing_cleanupP$.bind(T, thread);
                                                                if (NIL != final_index_iterator) {
                                                                    kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                                                }
                                                            } finally {
                                                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0_17, thread);
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                            done_var = makeBoolean((NIL == valid) || (NIL != position));
                                        }
                                    } 
                                }
                            }
                        }
                    } finally {
                        mt_relevance_macros.$mt$.rebind(_prev_bind_1, thread);
                        mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
                    }
                }
                return position;
            }
        }
    }

    public static final SubLObject peg_position_from_sub_pegs(SubLObject peg) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject sub_peg_positions = NIL;
                {
                    SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                    SubLObject _prev_bind_1 = mt_relevance_macros.$mt$.currentBinding(thread);
                    try {
                        mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
                        mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
                        {
                            SubLObject sub_peg = NIL;
                            SubLObject pred_var = $$properSubExpressions;
                            if (NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(peg, ONE_INTEGER, pred_var)) {
                                {
                                    SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(peg, ONE_INTEGER, pred_var);
                                    SubLObject done_var = NIL;
                                    SubLObject token_var = NIL;
                                    while (NIL == done_var) {
                                        {
                                            SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                                            SubLObject valid = makeBoolean(token_var != final_index_spec);
                                            if (NIL != valid) {
                                                {
                                                    SubLObject final_index_iterator = NIL;
                                                    try {
                                                        final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, $TRUE, NIL);
                                                        {
                                                            SubLObject done_var_18 = NIL;
                                                            SubLObject token_var_19 = NIL;
                                                            while (NIL == done_var_18) {
                                                                {
                                                                    SubLObject assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_19);
                                                                    SubLObject valid_20 = makeBoolean(token_var_19 != assertion);
                                                                    if (NIL != valid_20) {
                                                                        sub_peg = assertions_high.gaf_arg(assertion, TWO_INTEGER);
                                                                        sub_peg_positions = cons(peg_position(sub_peg), sub_peg_positions);
                                                                    }
                                                                    done_var_18 = makeBoolean(NIL == valid_20);
                                                                }
                                                            } 
                                                        }
                                                    } finally {
                                                        {
                                                            SubLObject _prev_bind_0_21 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                            try {
                                                                $is_thread_performing_cleanupP$.bind(T, thread);
                                                                if (NIL != final_index_iterator) {
                                                                    kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                                                }
                                                            } finally {
                                                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0_21, thread);
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                            done_var = makeBoolean(NIL == valid);
                                        }
                                    } 
                                }
                            }
                        }
                    } finally {
                        mt_relevance_macros.$mt$.rebind(_prev_bind_1, thread);
                        mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
                    }
                }
                return NIL != sub_peg_positions ? ((SubLObject) (peg_position_from_sub_peg_positions(sub_peg_positions))) : NIL;
            }
        }
    }

    public static final SubLObject peg_position_from_sub_peg_positions(SubLObject sub_peg_positions) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject path = butlast(sub_peg_positions.first(), UNPROVIDED);
                SubLObject start = NIL;
                SubLObject end = NIL;
                SubLObject cdolist_list_var = sub_peg_positions;
                SubLObject position = NIL;
                for (position = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , position = cdolist_list_var.first()) {
                    {
                        SubLObject local_position = list_utilities.last_one(position);
                        SubLObject this_start = peg_local_position_start(local_position);
                        SubLObject this_end = peg_local_position_end(local_position);
                        if ((NIL == start) || this_start.numL(start)) {
                            start = this_start;
                        }
                        if ((NIL == end) || this_end.numG(end)) {
                            end = this_end;
                        }
                    }
                }
                if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                    if (!((NIL != start) && (NIL != end))) {
                        Errors.error($str_alt160$Couldn_t_determine_start_and_end_, sub_peg_positions);
                    }
                }
                return list_utilities.add_to_end(start.eql(end) ? ((SubLObject) (start)) : list(start, end), path);
            }
        }
    }

    /**
     *
     *
     * @return LISTP; of integers, indicating the position of NODE within its containing superstructure.
     */
    public static final SubLObject syntactic_node_position(SubLObject node) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject position = NIL;
                SubLObject start_position = NIL;
                SubLObject end_position = NIL;
                {
                    SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                    SubLObject _prev_bind_1 = mt_relevance_macros.$mt$.currentBinding(thread);
                    try {
                        mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
                        mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
                        {
                            SubLObject pred = $$syntacticNodeInitialToken;
                            if (NIL == start_position) {
                                {
                                    SubLObject node_var = pred;
                                    SubLObject deck_type = (false) ? ((SubLObject) ($STACK)) : $QUEUE;
                                    SubLObject recur_deck = deck.create_deck(deck_type);
                                    SubLObject node_and_predicate_mode = NIL;
                                    {
                                        SubLObject _prev_bind_0_22 = sbhl_marking_vars.$sbhl_space$.currentBinding(thread);
                                        try {
                                            sbhl_marking_vars.$sbhl_space$.bind(sbhl_marking_vars.get_sbhl_marking_space(), thread);
                                            {
                                                SubLObject tv_var = $$True_JustificationTruth;
                                                {
                                                    SubLObject _prev_bind_0_23 = sbhl_search_vars.$sbhl_tv$.currentBinding(thread);
                                                    SubLObject _prev_bind_1_24 = sbhl_search_vars.$relevant_sbhl_tv_function$.currentBinding(thread);
                                                    try {
                                                        sbhl_search_vars.$sbhl_tv$.bind(NIL != tv_var ? ((SubLObject) (tv_var)) : sbhl_search_vars.get_sbhl_true_tv(), thread);
                                                        sbhl_search_vars.$relevant_sbhl_tv_function$.bind(NIL != tv_var ? ((SubLObject) (RELEVANT_SBHL_TV_IS_GENERAL_TV)) : sbhl_search_vars.$relevant_sbhl_tv_function$.getDynamicValue(thread), thread);
                                                        if (NIL != tv_var) {
                                                            if (NIL != sbhl_paranoia.sbhl_object_type_checking_p()) {
                                                                if (NIL == sbhl_search_vars.sbhl_true_tv_p(tv_var)) {
                                                                    {
                                                                        SubLObject pcase_var = sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread);
                                                                        if (pcase_var.eql($ERROR)) {
                                                                            sbhl_paranoia.sbhl_error(ONE_INTEGER, $str_alt168$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                                        } else
                                                                            if (pcase_var.eql($CERROR)) {
                                                                                sbhl_paranoia.sbhl_cerror(ONE_INTEGER, $$$continue_anyway, $str_alt168$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                                            } else
                                                                                if (pcase_var.eql($WARN)) {
                                                                                    Errors.warn($str_alt168$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P);
                                                                                } else {
                                                                                    Errors.warn($str_alt173$_A_is_not_a_valid__sbhl_type_erro, sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread));
                                                                                    Errors.cerror($$$continue_anyway, $str_alt168$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P);
                                                                                }


                                                                    }
                                                                }
                                                            }
                                                        }
                                                        {
                                                            SubLObject _prev_bind_0_25 = sbhl_search_vars.$sbhl_search_module$.currentBinding(thread);
                                                            SubLObject _prev_bind_1_26 = sbhl_search_vars.$sbhl_search_module_type$.currentBinding(thread);
                                                            SubLObject _prev_bind_2 = sbhl_search_vars.$sbhl_add_node_to_result_test$.currentBinding(thread);
                                                            SubLObject _prev_bind_3 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                                            SubLObject _prev_bind_4 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                                                            try {
                                                                sbhl_search_vars.$sbhl_search_module$.bind(sbhl_module_vars.get_sbhl_module($$genlPreds), thread);
                                                                sbhl_search_vars.$sbhl_search_module_type$.bind(sbhl_module_utilities.get_sbhl_module_type(sbhl_module_vars.get_sbhl_module($$genlPreds)), thread);
                                                                sbhl_search_vars.$sbhl_add_node_to_result_test$.bind(sbhl_module_utilities.get_sbhl_add_node_to_result_test(sbhl_module_vars.get_sbhl_module($$genlPreds)), thread);
                                                                sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL, thread);
                                                                sbhl_module_vars.$sbhl_module$.bind(sbhl_module_vars.get_sbhl_module($$genlPreds), thread);
                                                                if ((NIL != sbhl_paranoia.suspend_sbhl_type_checkingP()) || (NIL != sbhl_module_utilities.apply_sbhl_module_type_test(pred, sbhl_module_vars.get_sbhl_module(UNPROVIDED)))) {
                                                                    {
                                                                        SubLObject _prev_bind_0_27 = sbhl_search_vars.$sbhl_search_direction$.currentBinding(thread);
                                                                        SubLObject _prev_bind_1_28 = sbhl_link_vars.$sbhl_link_direction$.currentBinding(thread);
                                                                        SubLObject _prev_bind_2_29 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                                                        try {
                                                                            sbhl_search_vars.$sbhl_search_direction$.bind(sbhl_search_vars.get_sbhl_backward_search_direction(), thread);
                                                                            sbhl_link_vars.$sbhl_link_direction$.bind(sbhl_module_utilities.sbhl_search_direction_to_link_direction(sbhl_search_vars.get_sbhl_backward_search_direction(), sbhl_module_vars.get_sbhl_module($$genlPreds)), thread);
                                                                            sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL, thread);
                                                                            sbhl_marking_utilities.sbhl_mark_node_marked(node_var, UNPROVIDED);
                                                                            node_and_predicate_mode = list(pred, sbhl_search_vars.genl_inverse_mode_p());
                                                                            while ((NIL != node_and_predicate_mode) && (NIL == start_position)) {
                                                                                {
                                                                                    SubLObject node_var_30 = node_and_predicate_mode.first();
                                                                                    SubLObject predicate_mode = second(node_and_predicate_mode);
                                                                                    SubLObject spec_pred = node_var_30;
                                                                                    {
                                                                                        SubLObject _prev_bind_0_31 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                                                                        try {
                                                                                            sbhl_search_vars.$genl_inverse_mode_p$.bind(predicate_mode, thread);
                                                                                            if (NIL != sbhl_search_utilities.apply_sbhl_add_node_test(sbhl_search_vars.get_sbhl_search_add_node_test(), node_var_30)) {
                                                                                                {
                                                                                                    SubLObject pred_var = spec_pred;
                                                                                                    if (NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(node, ONE_INTEGER, pred_var)) {
                                                                                                        {
                                                                                                            SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(node, ONE_INTEGER, pred_var);
                                                                                                            SubLObject done_var = start_position;
                                                                                                            SubLObject token_var = NIL;
                                                                                                            while (NIL == done_var) {
                                                                                                                {
                                                                                                                    SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                                                                                                                    SubLObject valid = makeBoolean(token_var != final_index_spec);
                                                                                                                    if (NIL != valid) {
                                                                                                                        {
                                                                                                                            SubLObject final_index_iterator = NIL;
                                                                                                                            try {
                                                                                                                                final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, NIL, NIL);
                                                                                                                                {
                                                                                                                                    SubLObject done_var_32 = start_position;
                                                                                                                                    SubLObject token_var_33 = NIL;
                                                                                                                                    while (NIL == done_var_32) {
                                                                                                                                        {
                                                                                                                                            SubLObject gaf = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_33);
                                                                                                                                            SubLObject valid_34 = makeBoolean(token_var_33 != gaf);
                                                                                                                                            if (NIL != valid_34) {
                                                                                                                                                {
                                                                                                                                                    SubLObject covered_token = assertions_high.gaf_arg2(gaf);
                                                                                                                                                    start_position = token_position(covered_token);
                                                                                                                                                }
                                                                                                                                            }
                                                                                                                                            done_var_32 = makeBoolean((NIL == valid_34) || (NIL != start_position));
                                                                                                                                        }
                                                                                                                                    } 
                                                                                                                                }
                                                                                                                            } finally {
                                                                                                                                {
                                                                                                                                    SubLObject _prev_bind_0_35 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                                                                                                    try {
                                                                                                                                        $is_thread_performing_cleanupP$.bind(T, thread);
                                                                                                                                        if (NIL != final_index_iterator) {
                                                                                                                                            kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                                                                                                                        }
                                                                                                                                    } finally {
                                                                                                                                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0_35, thread);
                                                                                                                                    }
                                                                                                                                }
                                                                                                                            }
                                                                                                                        }
                                                                                                                    }
                                                                                                                    done_var = makeBoolean((NIL == valid) || (NIL != start_position));
                                                                                                                }
                                                                                                            } 
                                                                                                        }
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                            {
                                                                                                SubLObject accessible_modules = sbhl_macros.get_sbhl_accessible_modules(sbhl_module_vars.get_sbhl_module($$genlPreds));
                                                                                                SubLObject rest = NIL;
                                                                                                for (rest = accessible_modules; !((NIL != start_position) || (NIL == rest)); rest = rest.rest()) {
                                                                                                    {
                                                                                                        SubLObject module_var = rest.first();
                                                                                                        {
                                                                                                            SubLObject _prev_bind_0_36 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                                                                                                            SubLObject _prev_bind_1_37 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                                                                                            try {
                                                                                                                sbhl_module_vars.$sbhl_module$.bind(module_var, thread);
                                                                                                                sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL != sbhl_search_vars.flip_genl_inverse_modeP(UNPROVIDED, UNPROVIDED) ? ((SubLObject) (makeBoolean(NIL == sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread)))) : sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread), thread);
                                                                                                                {
                                                                                                                    SubLObject node_38 = function_terms.naut_to_nart(node_var_30);
                                                                                                                    if (NIL != sbhl_link_vars.sbhl_node_object_p(node_38)) {
                                                                                                                        {
                                                                                                                            SubLObject d_link = sbhl_graphs.get_sbhl_graph_link(node_38, sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                                                                                            if (NIL != d_link) {
                                                                                                                                {
                                                                                                                                    SubLObject mt_links = sbhl_links.get_sbhl_mt_links(d_link, sbhl_link_vars.get_sbhl_link_direction(), sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                                                                                                    if (NIL != mt_links) {
                                                                                                                                        {
                                                                                                                                            SubLObject iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(mt_links));
                                                                                                                                            while (!((NIL != start_position) || (NIL != dictionary_contents.do_dictionary_contents_doneP(iteration_state)))) {
                                                                                                                                                thread.resetMultipleValues();
                                                                                                                                                {
                                                                                                                                                    SubLObject mt = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                                                                                                                                                    SubLObject tv_links = thread.secondMultipleValue();
                                                                                                                                                    thread.resetMultipleValues();
                                                                                                                                                    if (NIL != mt_relevance_macros.relevant_mtP(mt)) {
                                                                                                                                                        {
                                                                                                                                                            SubLObject _prev_bind_0_39 = sbhl_link_vars.$sbhl_link_mt$.currentBinding(thread);
                                                                                                                                                            try {
                                                                                                                                                                sbhl_link_vars.$sbhl_link_mt$.bind(mt, thread);
                                                                                                                                                                {
                                                                                                                                                                    SubLObject iteration_state_40 = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(tv_links));
                                                                                                                                                                    while (!((NIL != start_position) || (NIL != dictionary_contents.do_dictionary_contents_doneP(iteration_state_40)))) {
                                                                                                                                                                        thread.resetMultipleValues();
                                                                                                                                                                        {
                                                                                                                                                                            SubLObject tv = dictionary_contents.do_dictionary_contents_key_value(iteration_state_40);
                                                                                                                                                                            SubLObject link_nodes = thread.secondMultipleValue();
                                                                                                                                                                            thread.resetMultipleValues();
                                                                                                                                                                            if (NIL != sbhl_search_vars.relevant_sbhl_tvP(tv)) {
                                                                                                                                                                                {
                                                                                                                                                                                    SubLObject _prev_bind_0_41 = sbhl_link_vars.$sbhl_link_tv$.currentBinding(thread);
                                                                                                                                                                                    try {
                                                                                                                                                                                        sbhl_link_vars.$sbhl_link_tv$.bind(tv, thread);
                                                                                                                                                                                        {
                                                                                                                                                                                            SubLObject new_list = (NIL != sbhl_link_vars.sbhl_randomize_lists_p()) ? ((SubLObject) (list_utilities.randomize_list(link_nodes))) : link_nodes;
                                                                                                                                                                                            SubLObject rest_42 = NIL;
                                                                                                                                                                                            for (rest_42 = new_list; !((NIL != start_position) || (NIL == rest_42)); rest_42 = rest_42.rest()) {
                                                                                                                                                                                                {
                                                                                                                                                                                                    SubLObject node_vars_link_node = rest_42.first();
                                                                                                                                                                                                    if (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node, UNPROVIDED)) {
                                                                                                                                                                                                        sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node, UNPROVIDED);
                                                                                                                                                                                                        deck.deck_push(list(node_vars_link_node, sbhl_search_vars.genl_inverse_mode_p()), recur_deck);
                                                                                                                                                                                                    }
                                                                                                                                                                                                }
                                                                                                                                                                                            }
                                                                                                                                                                                        }
                                                                                                                                                                                    } finally {
                                                                                                                                                                                        sbhl_link_vars.$sbhl_link_tv$.rebind(_prev_bind_0_41, thread);
                                                                                                                                                                                    }
                                                                                                                                                                                }
                                                                                                                                                                            }
                                                                                                                                                                            iteration_state_40 = dictionary_contents.do_dictionary_contents_next(iteration_state_40);
                                                                                                                                                                        }
                                                                                                                                                                    } 
                                                                                                                                                                    dictionary_contents.do_dictionary_contents_finalize(iteration_state_40);
                                                                                                                                                                }
                                                                                                                                                            } finally {
                                                                                                                                                                sbhl_link_vars.$sbhl_link_mt$.rebind(_prev_bind_0_39, thread);
                                                                                                                                                            }
                                                                                                                                                        }
                                                                                                                                                    }
                                                                                                                                                    iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state);
                                                                                                                                                }
                                                                                                                                            } 
                                                                                                                                            dictionary_contents.do_dictionary_contents_finalize(iteration_state);
                                                                                                                                        }
                                                                                                                                    }
                                                                                                                                }
                                                                                                                            } else {
                                                                                                                                sbhl_paranoia.sbhl_error(FIVE_INTEGER, $str_alt175$attempting_to_bind_direction_link, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                                                                                            }
                                                                                                                        }
                                                                                                                    } else
                                                                                                                        if (NIL != obsolete.cnat_p(node_38, UNPROVIDED)) {
                                                                                                                            {
                                                                                                                                SubLObject new_list = (NIL != sbhl_link_vars.sbhl_randomize_lists_p()) ? ((SubLObject) (list_utilities.randomize_list(sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module(UNPROVIDED))))) : sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                                                                                                SubLObject rest_43 = NIL;
                                                                                                                                for (rest_43 = new_list; !((NIL != start_position) || (NIL == rest_43)); rest_43 = rest_43.rest()) {
                                                                                                                                    {
                                                                                                                                        SubLObject generating_fn = rest_43.first();
                                                                                                                                        {
                                                                                                                                            SubLObject _prev_bind_0_44 = sbhl_link_vars.$sbhl_link_generator$.currentBinding(thread);
                                                                                                                                            try {
                                                                                                                                                sbhl_link_vars.$sbhl_link_generator$.bind(generating_fn, thread);
                                                                                                                                                {
                                                                                                                                                    SubLObject link_nodes = funcall(generating_fn, node_38);
                                                                                                                                                    SubLObject new_list_45 = (NIL != sbhl_link_vars.sbhl_randomize_lists_p()) ? ((SubLObject) (list_utilities.randomize_list(link_nodes))) : link_nodes;
                                                                                                                                                    SubLObject rest_46 = NIL;
                                                                                                                                                    for (rest_46 = new_list_45; !((NIL != start_position) || (NIL == rest_46)); rest_46 = rest_46.rest()) {
                                                                                                                                                        {
                                                                                                                                                            SubLObject node_vars_link_node = rest_46.first();
                                                                                                                                                            if (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node, UNPROVIDED)) {
                                                                                                                                                                sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node, UNPROVIDED);
                                                                                                                                                                deck.deck_push(list(node_vars_link_node, sbhl_search_vars.genl_inverse_mode_p()), recur_deck);
                                                                                                                                                            }
                                                                                                                                                        }
                                                                                                                                                    }
                                                                                                                                                }
                                                                                                                                            } finally {
                                                                                                                                                sbhl_link_vars.$sbhl_link_generator$.rebind(_prev_bind_0_44, thread);
                                                                                                                                            }
                                                                                                                                        }
                                                                                                                                    }
                                                                                                                                }
                                                                                                                            }
                                                                                                                        }

                                                                                                                }
                                                                                                            } finally {
                                                                                                                sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_1_37, thread);
                                                                                                                sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_0_36, thread);
                                                                                                            }
                                                                                                        }
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                        } finally {
                                                                                            sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_0_31, thread);
                                                                                        }
                                                                                    }
                                                                                }
                                                                                node_and_predicate_mode = deck.deck_pop(recur_deck);
                                                                            } 
                                                                        } finally {
                                                                            sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_2_29, thread);
                                                                            sbhl_link_vars.$sbhl_link_direction$.rebind(_prev_bind_1_28, thread);
                                                                            sbhl_search_vars.$sbhl_search_direction$.rebind(_prev_bind_0_27, thread);
                                                                        }
                                                                    }
                                                                } else {
                                                                    sbhl_paranoia.sbhl_warn(TWO_INTEGER, $str_alt176$Node__a_does_not_pass_sbhl_type_t, pred, sbhl_module_utilities.get_sbhl_type_test(sbhl_module_vars.get_sbhl_module(UNPROVIDED)), UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                                }
                                                            } finally {
                                                                sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_4, thread);
                                                                sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_3, thread);
                                                                sbhl_search_vars.$sbhl_add_node_to_result_test$.rebind(_prev_bind_2, thread);
                                                                sbhl_search_vars.$sbhl_search_module_type$.rebind(_prev_bind_1_26, thread);
                                                                sbhl_search_vars.$sbhl_search_module$.rebind(_prev_bind_0_25, thread);
                                                            }
                                                        }
                                                    } finally {
                                                        sbhl_search_vars.$relevant_sbhl_tv_function$.rebind(_prev_bind_1_24, thread);
                                                        sbhl_search_vars.$sbhl_tv$.rebind(_prev_bind_0_23, thread);
                                                    }
                                                }
                                                sbhl_marking_vars.free_sbhl_marking_space(sbhl_marking_vars.$sbhl_space$.getDynamicValue(thread));
                                            }
                                        } finally {
                                            sbhl_marking_vars.$sbhl_space$.rebind(_prev_bind_0_22, thread);
                                        }
                                    }
                                }
                            }
                        }
                        {
                            SubLObject pred = $$syntacticNodeFinalToken;
                            if (NIL == end_position) {
                                {
                                    SubLObject node_var = pred;
                                    SubLObject deck_type = (false) ? ((SubLObject) ($STACK)) : $QUEUE;
                                    SubLObject recur_deck = deck.create_deck(deck_type);
                                    SubLObject node_and_predicate_mode = NIL;
                                    {
                                        SubLObject _prev_bind_0_47 = sbhl_marking_vars.$sbhl_space$.currentBinding(thread);
                                        try {
                                            sbhl_marking_vars.$sbhl_space$.bind(sbhl_marking_vars.get_sbhl_marking_space(), thread);
                                            {
                                                SubLObject tv_var = $$True_JustificationTruth;
                                                {
                                                    SubLObject _prev_bind_0_48 = sbhl_search_vars.$sbhl_tv$.currentBinding(thread);
                                                    SubLObject _prev_bind_1_49 = sbhl_search_vars.$relevant_sbhl_tv_function$.currentBinding(thread);
                                                    try {
                                                        sbhl_search_vars.$sbhl_tv$.bind(NIL != tv_var ? ((SubLObject) (tv_var)) : sbhl_search_vars.get_sbhl_true_tv(), thread);
                                                        sbhl_search_vars.$relevant_sbhl_tv_function$.bind(NIL != tv_var ? ((SubLObject) (RELEVANT_SBHL_TV_IS_GENERAL_TV)) : sbhl_search_vars.$relevant_sbhl_tv_function$.getDynamicValue(thread), thread);
                                                        if (NIL != tv_var) {
                                                            if (NIL != sbhl_paranoia.sbhl_object_type_checking_p()) {
                                                                if (NIL == sbhl_search_vars.sbhl_true_tv_p(tv_var)) {
                                                                    {
                                                                        SubLObject pcase_var = sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread);
                                                                        if (pcase_var.eql($ERROR)) {
                                                                            sbhl_paranoia.sbhl_error(ONE_INTEGER, $str_alt168$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                                        } else
                                                                            if (pcase_var.eql($CERROR)) {
                                                                                sbhl_paranoia.sbhl_cerror(ONE_INTEGER, $$$continue_anyway, $str_alt168$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                                            } else
                                                                                if (pcase_var.eql($WARN)) {
                                                                                    Errors.warn($str_alt168$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P);
                                                                                } else {
                                                                                    Errors.warn($str_alt173$_A_is_not_a_valid__sbhl_type_erro, sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread));
                                                                                    Errors.cerror($$$continue_anyway, $str_alt168$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P);
                                                                                }


                                                                    }
                                                                }
                                                            }
                                                        }
                                                        {
                                                            SubLObject _prev_bind_0_50 = sbhl_search_vars.$sbhl_search_module$.currentBinding(thread);
                                                            SubLObject _prev_bind_1_51 = sbhl_search_vars.$sbhl_search_module_type$.currentBinding(thread);
                                                            SubLObject _prev_bind_2 = sbhl_search_vars.$sbhl_add_node_to_result_test$.currentBinding(thread);
                                                            SubLObject _prev_bind_3 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                                            SubLObject _prev_bind_4 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                                                            try {
                                                                sbhl_search_vars.$sbhl_search_module$.bind(sbhl_module_vars.get_sbhl_module($$genlPreds), thread);
                                                                sbhl_search_vars.$sbhl_search_module_type$.bind(sbhl_module_utilities.get_sbhl_module_type(sbhl_module_vars.get_sbhl_module($$genlPreds)), thread);
                                                                sbhl_search_vars.$sbhl_add_node_to_result_test$.bind(sbhl_module_utilities.get_sbhl_add_node_to_result_test(sbhl_module_vars.get_sbhl_module($$genlPreds)), thread);
                                                                sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL, thread);
                                                                sbhl_module_vars.$sbhl_module$.bind(sbhl_module_vars.get_sbhl_module($$genlPreds), thread);
                                                                if ((NIL != sbhl_paranoia.suspend_sbhl_type_checkingP()) || (NIL != sbhl_module_utilities.apply_sbhl_module_type_test(pred, sbhl_module_vars.get_sbhl_module(UNPROVIDED)))) {
                                                                    {
                                                                        SubLObject _prev_bind_0_52 = sbhl_search_vars.$sbhl_search_direction$.currentBinding(thread);
                                                                        SubLObject _prev_bind_1_53 = sbhl_link_vars.$sbhl_link_direction$.currentBinding(thread);
                                                                        SubLObject _prev_bind_2_54 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                                                        try {
                                                                            sbhl_search_vars.$sbhl_search_direction$.bind(sbhl_search_vars.get_sbhl_backward_search_direction(), thread);
                                                                            sbhl_link_vars.$sbhl_link_direction$.bind(sbhl_module_utilities.sbhl_search_direction_to_link_direction(sbhl_search_vars.get_sbhl_backward_search_direction(), sbhl_module_vars.get_sbhl_module($$genlPreds)), thread);
                                                                            sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL, thread);
                                                                            sbhl_marking_utilities.sbhl_mark_node_marked(node_var, UNPROVIDED);
                                                                            node_and_predicate_mode = list(pred, sbhl_search_vars.genl_inverse_mode_p());
                                                                            while ((NIL != node_and_predicate_mode) && (NIL == end_position)) {
                                                                                {
                                                                                    SubLObject node_var_55 = node_and_predicate_mode.first();
                                                                                    SubLObject predicate_mode = second(node_and_predicate_mode);
                                                                                    SubLObject spec_pred = node_var_55;
                                                                                    {
                                                                                        SubLObject _prev_bind_0_56 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                                                                        try {
                                                                                            sbhl_search_vars.$genl_inverse_mode_p$.bind(predicate_mode, thread);
                                                                                            if (NIL != sbhl_search_utilities.apply_sbhl_add_node_test(sbhl_search_vars.get_sbhl_search_add_node_test(), node_var_55)) {
                                                                                                {
                                                                                                    SubLObject pred_var = spec_pred;
                                                                                                    if (NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(node, ONE_INTEGER, pred_var)) {
                                                                                                        {
                                                                                                            SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(node, ONE_INTEGER, pred_var);
                                                                                                            SubLObject done_var = end_position;
                                                                                                            SubLObject token_var = NIL;
                                                                                                            while (NIL == done_var) {
                                                                                                                {
                                                                                                                    SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                                                                                                                    SubLObject valid = makeBoolean(token_var != final_index_spec);
                                                                                                                    if (NIL != valid) {
                                                                                                                        {
                                                                                                                            SubLObject final_index_iterator = NIL;
                                                                                                                            try {
                                                                                                                                final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, NIL, NIL);
                                                                                                                                {
                                                                                                                                    SubLObject done_var_57 = end_position;
                                                                                                                                    SubLObject token_var_58 = NIL;
                                                                                                                                    while (NIL == done_var_57) {
                                                                                                                                        {
                                                                                                                                            SubLObject gaf = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_58);
                                                                                                                                            SubLObject valid_59 = makeBoolean(token_var_58 != gaf);
                                                                                                                                            if (NIL != valid_59) {
                                                                                                                                                {
                                                                                                                                                    SubLObject covered_token = assertions_high.gaf_arg2(gaf);
                                                                                                                                                    end_position = token_position(covered_token);
                                                                                                                                                }
                                                                                                                                            }
                                                                                                                                            done_var_57 = makeBoolean((NIL == valid_59) || (NIL != end_position));
                                                                                                                                        }
                                                                                                                                    } 
                                                                                                                                }
                                                                                                                            } finally {
                                                                                                                                {
                                                                                                                                    SubLObject _prev_bind_0_60 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                                                                                                    try {
                                                                                                                                        $is_thread_performing_cleanupP$.bind(T, thread);
                                                                                                                                        if (NIL != final_index_iterator) {
                                                                                                                                            kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                                                                                                                        }
                                                                                                                                    } finally {
                                                                                                                                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0_60, thread);
                                                                                                                                    }
                                                                                                                                }
                                                                                                                            }
                                                                                                                        }
                                                                                                                    }
                                                                                                                    done_var = makeBoolean((NIL == valid) || (NIL != end_position));
                                                                                                                }
                                                                                                            } 
                                                                                                        }
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                            {
                                                                                                SubLObject accessible_modules = sbhl_macros.get_sbhl_accessible_modules(sbhl_module_vars.get_sbhl_module($$genlPreds));
                                                                                                SubLObject rest = NIL;
                                                                                                for (rest = accessible_modules; !((NIL != end_position) || (NIL == rest)); rest = rest.rest()) {
                                                                                                    {
                                                                                                        SubLObject module_var = rest.first();
                                                                                                        {
                                                                                                            SubLObject _prev_bind_0_61 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                                                                                                            SubLObject _prev_bind_1_62 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                                                                                            try {
                                                                                                                sbhl_module_vars.$sbhl_module$.bind(module_var, thread);
                                                                                                                sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL != sbhl_search_vars.flip_genl_inverse_modeP(UNPROVIDED, UNPROVIDED) ? ((SubLObject) (makeBoolean(NIL == sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread)))) : sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread), thread);
                                                                                                                {
                                                                                                                    SubLObject node_63 = function_terms.naut_to_nart(node_var_55);
                                                                                                                    if (NIL != sbhl_link_vars.sbhl_node_object_p(node_63)) {
                                                                                                                        {
                                                                                                                            SubLObject d_link = sbhl_graphs.get_sbhl_graph_link(node_63, sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                                                                                            if (NIL != d_link) {
                                                                                                                                {
                                                                                                                                    SubLObject mt_links = sbhl_links.get_sbhl_mt_links(d_link, sbhl_link_vars.get_sbhl_link_direction(), sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                                                                                                    if (NIL != mt_links) {
                                                                                                                                        {
                                                                                                                                            SubLObject iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(mt_links));
                                                                                                                                            while (!((NIL != end_position) || (NIL != dictionary_contents.do_dictionary_contents_doneP(iteration_state)))) {
                                                                                                                                                thread.resetMultipleValues();
                                                                                                                                                {
                                                                                                                                                    SubLObject mt = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                                                                                                                                                    SubLObject tv_links = thread.secondMultipleValue();
                                                                                                                                                    thread.resetMultipleValues();
                                                                                                                                                    if (NIL != mt_relevance_macros.relevant_mtP(mt)) {
                                                                                                                                                        {
                                                                                                                                                            SubLObject _prev_bind_0_64 = sbhl_link_vars.$sbhl_link_mt$.currentBinding(thread);
                                                                                                                                                            try {
                                                                                                                                                                sbhl_link_vars.$sbhl_link_mt$.bind(mt, thread);
                                                                                                                                                                {
                                                                                                                                                                    SubLObject iteration_state_65 = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(tv_links));
                                                                                                                                                                    while (!((NIL != end_position) || (NIL != dictionary_contents.do_dictionary_contents_doneP(iteration_state_65)))) {
                                                                                                                                                                        thread.resetMultipleValues();
                                                                                                                                                                        {
                                                                                                                                                                            SubLObject tv = dictionary_contents.do_dictionary_contents_key_value(iteration_state_65);
                                                                                                                                                                            SubLObject link_nodes = thread.secondMultipleValue();
                                                                                                                                                                            thread.resetMultipleValues();
                                                                                                                                                                            if (NIL != sbhl_search_vars.relevant_sbhl_tvP(tv)) {
                                                                                                                                                                                {
                                                                                                                                                                                    SubLObject _prev_bind_0_66 = sbhl_link_vars.$sbhl_link_tv$.currentBinding(thread);
                                                                                                                                                                                    try {
                                                                                                                                                                                        sbhl_link_vars.$sbhl_link_tv$.bind(tv, thread);
                                                                                                                                                                                        {
                                                                                                                                                                                            SubLObject new_list = (NIL != sbhl_link_vars.sbhl_randomize_lists_p()) ? ((SubLObject) (list_utilities.randomize_list(link_nodes))) : link_nodes;
                                                                                                                                                                                            SubLObject rest_67 = NIL;
                                                                                                                                                                                            for (rest_67 = new_list; !((NIL != end_position) || (NIL == rest_67)); rest_67 = rest_67.rest()) {
                                                                                                                                                                                                {
                                                                                                                                                                                                    SubLObject node_vars_link_node = rest_67.first();
                                                                                                                                                                                                    if (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node, UNPROVIDED)) {
                                                                                                                                                                                                        sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node, UNPROVIDED);
                                                                                                                                                                                                        deck.deck_push(list(node_vars_link_node, sbhl_search_vars.genl_inverse_mode_p()), recur_deck);
                                                                                                                                                                                                    }
                                                                                                                                                                                                }
                                                                                                                                                                                            }
                                                                                                                                                                                        }
                                                                                                                                                                                    } finally {
                                                                                                                                                                                        sbhl_link_vars.$sbhl_link_tv$.rebind(_prev_bind_0_66, thread);
                                                                                                                                                                                    }
                                                                                                                                                                                }
                                                                                                                                                                            }
                                                                                                                                                                            iteration_state_65 = dictionary_contents.do_dictionary_contents_next(iteration_state_65);
                                                                                                                                                                        }
                                                                                                                                                                    } 
                                                                                                                                                                    dictionary_contents.do_dictionary_contents_finalize(iteration_state_65);
                                                                                                                                                                }
                                                                                                                                                            } finally {
                                                                                                                                                                sbhl_link_vars.$sbhl_link_mt$.rebind(_prev_bind_0_64, thread);
                                                                                                                                                            }
                                                                                                                                                        }
                                                                                                                                                    }
                                                                                                                                                    iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state);
                                                                                                                                                }
                                                                                                                                            } 
                                                                                                                                            dictionary_contents.do_dictionary_contents_finalize(iteration_state);
                                                                                                                                        }
                                                                                                                                    }
                                                                                                                                }
                                                                                                                            } else {
                                                                                                                                sbhl_paranoia.sbhl_error(FIVE_INTEGER, $str_alt175$attempting_to_bind_direction_link, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                                                                                            }
                                                                                                                        }
                                                                                                                    } else
                                                                                                                        if (NIL != obsolete.cnat_p(node_63, UNPROVIDED)) {
                                                                                                                            {
                                                                                                                                SubLObject new_list = (NIL != sbhl_link_vars.sbhl_randomize_lists_p()) ? ((SubLObject) (list_utilities.randomize_list(sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module(UNPROVIDED))))) : sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                                                                                                SubLObject rest_68 = NIL;
                                                                                                                                for (rest_68 = new_list; !((NIL != end_position) || (NIL == rest_68)); rest_68 = rest_68.rest()) {
                                                                                                                                    {
                                                                                                                                        SubLObject generating_fn = rest_68.first();
                                                                                                                                        {
                                                                                                                                            SubLObject _prev_bind_0_69 = sbhl_link_vars.$sbhl_link_generator$.currentBinding(thread);
                                                                                                                                            try {
                                                                                                                                                sbhl_link_vars.$sbhl_link_generator$.bind(generating_fn, thread);
                                                                                                                                                {
                                                                                                                                                    SubLObject link_nodes = funcall(generating_fn, node_63);
                                                                                                                                                    SubLObject new_list_70 = (NIL != sbhl_link_vars.sbhl_randomize_lists_p()) ? ((SubLObject) (list_utilities.randomize_list(link_nodes))) : link_nodes;
                                                                                                                                                    SubLObject rest_71 = NIL;
                                                                                                                                                    for (rest_71 = new_list_70; !((NIL != end_position) || (NIL == rest_71)); rest_71 = rest_71.rest()) {
                                                                                                                                                        {
                                                                                                                                                            SubLObject node_vars_link_node = rest_71.first();
                                                                                                                                                            if (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node, UNPROVIDED)) {
                                                                                                                                                                sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node, UNPROVIDED);
                                                                                                                                                                deck.deck_push(list(node_vars_link_node, sbhl_search_vars.genl_inverse_mode_p()), recur_deck);
                                                                                                                                                            }
                                                                                                                                                        }
                                                                                                                                                    }
                                                                                                                                                }
                                                                                                                                            } finally {
                                                                                                                                                sbhl_link_vars.$sbhl_link_generator$.rebind(_prev_bind_0_69, thread);
                                                                                                                                            }
                                                                                                                                        }
                                                                                                                                    }
                                                                                                                                }
                                                                                                                            }
                                                                                                                        }

                                                                                                                }
                                                                                                            } finally {
                                                                                                                sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_1_62, thread);
                                                                                                                sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_0_61, thread);
                                                                                                            }
                                                                                                        }
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                        } finally {
                                                                                            sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_0_56, thread);
                                                                                        }
                                                                                    }
                                                                                }
                                                                                node_and_predicate_mode = deck.deck_pop(recur_deck);
                                                                            } 
                                                                        } finally {
                                                                            sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_2_54, thread);
                                                                            sbhl_link_vars.$sbhl_link_direction$.rebind(_prev_bind_1_53, thread);
                                                                            sbhl_search_vars.$sbhl_search_direction$.rebind(_prev_bind_0_52, thread);
                                                                        }
                                                                    }
                                                                } else {
                                                                    sbhl_paranoia.sbhl_warn(TWO_INTEGER, $str_alt176$Node__a_does_not_pass_sbhl_type_t, pred, sbhl_module_utilities.get_sbhl_type_test(sbhl_module_vars.get_sbhl_module(UNPROVIDED)), UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                                }
                                                            } finally {
                                                                sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_4, thread);
                                                                sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_3, thread);
                                                                sbhl_search_vars.$sbhl_add_node_to_result_test$.rebind(_prev_bind_2, thread);
                                                                sbhl_search_vars.$sbhl_search_module_type$.rebind(_prev_bind_1_51, thread);
                                                                sbhl_search_vars.$sbhl_search_module$.rebind(_prev_bind_0_50, thread);
                                                            }
                                                        }
                                                    } finally {
                                                        sbhl_search_vars.$relevant_sbhl_tv_function$.rebind(_prev_bind_1_49, thread);
                                                        sbhl_search_vars.$sbhl_tv$.rebind(_prev_bind_0_48, thread);
                                                    }
                                                }
                                                sbhl_marking_vars.free_sbhl_marking_space(sbhl_marking_vars.$sbhl_space$.getDynamicValue(thread));
                                            }
                                        } finally {
                                            sbhl_marking_vars.$sbhl_space$.rebind(_prev_bind_0_47, thread);
                                        }
                                    }
                                }
                            }
                        }
                    } finally {
                        mt_relevance_macros.$mt$.rebind(_prev_bind_1, thread);
                        mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
                    }
                }
                if (start_position.equal(end_position)) {
                    position = start_position;
                } else
                    if (NIL == start_position) {
                        position = end_position;
                    } else
                        if (NIL == end_position) {
                            position = start_position;
                        } else {
                            position = list_utilities.add_to_end(list(list_utilities.last_one(start_position), list_utilities.last_one(end_position)), butlast(start_position, UNPROVIDED));
                        }


                if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                    if (NIL == position) {
                        Errors.error($str_alt157$Couldn_t_find_position_for__S, node);
                    }
                }
                return position;
            }
        }
    }

    public static final SubLObject token_position(SubLObject token) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject position = NIL;
                {
                    SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                    SubLObject _prev_bind_1 = mt_relevance_macros.$mt$.currentBinding(thread);
                    try {
                        mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
                        mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
                        {
                            SubLObject token_number = parsing_utilities.token_number(token);
                            SubLObject tokenization = parsing_utilities.token_tokenization(token);
                            SubLObject sentence = parsing_utilities.tokenization_peg(tokenization);
                            SubLObject sentence_position = sentence_peg_position(sentence);
                            if (NIL != sentence_position) {
                                position = list_utilities.add_to_end(token_number, sentence_position);
                            }
                        }
                    } finally {
                        mt_relevance_macros.$mt$.rebind(_prev_bind_1, thread);
                        mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
                    }
                }
                if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                    if (NIL == position) {
                        Errors.error($str_alt157$Couldn_t_find_position_for__S, token);
                    }
                }
                return position;
            }
        }
    }

    public static final SubLObject sentence_peg_position(SubLObject sentence) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject position = NIL;
                {
                    SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                    SubLObject _prev_bind_1 = mt_relevance_macros.$mt$.currentBinding(thread);
                    try {
                        mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
                        mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
                        {
                            SubLObject pred_var = $const178$nthOccurrenceOfStructureTypeInStr;
                            if (NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(sentence, ONE_INTEGER, pred_var)) {
                                {
                                    SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(sentence, ONE_INTEGER, pred_var);
                                    SubLObject done_var = position;
                                    SubLObject token_var = NIL;
                                    while (NIL == done_var) {
                                        {
                                            SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                                            SubLObject valid = makeBoolean(token_var != final_index_spec);
                                            if (NIL != valid) {
                                                {
                                                    SubLObject final_index_iterator = NIL;
                                                    try {
                                                        final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, $TRUE, NIL);
                                                        {
                                                            SubLObject done_var_72 = position;
                                                            SubLObject token_var_73 = NIL;
                                                            while (NIL == done_var_72) {
                                                                {
                                                                    SubLObject gaf = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_73);
                                                                    SubLObject valid_74 = makeBoolean(token_var_73 != gaf);
                                                                    if (NIL != valid_74) {
                                                                        thread.resetMultipleValues();
                                                                        {
                                                                            SubLObject success = formula_pattern_match.formula_matches_pattern(assertions_high.gaf_formula(gaf), $list_alt179);
                                                                            SubLObject v_bindings = thread.secondMultipleValue();
                                                                            thread.resetMultipleValues();
                                                                            if (NIL != success) {
                                                                                {
                                                                                    SubLObject paragraph = list_utilities.alist_lookup_without_values(v_bindings, PARAGRAPH, UNPROVIDED, UNPROVIDED);
                                                                                    SubLObject sentence_number = list_utilities.alist_lookup_without_values(v_bindings, SENTENCE_NUMBER, UNPROVIDED, UNPROVIDED);
                                                                                    position = list(sentence_number);
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                    done_var_72 = makeBoolean((NIL == valid_74) || (NIL != position));
                                                                }
                                                            } 
                                                        }
                                                    } finally {
                                                        {
                                                            SubLObject _prev_bind_0_75 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                            try {
                                                                $is_thread_performing_cleanupP$.bind(T, thread);
                                                                if (NIL != final_index_iterator) {
                                                                    kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                                                }
                                                            } finally {
                                                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0_75, thread);
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                            done_var = makeBoolean((NIL == valid) || (NIL != position));
                                        }
                                    } 
                                }
                            }
                        }
                    } finally {
                        mt_relevance_macros.$mt$.rebind(_prev_bind_1, thread);
                        mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
                    }
                }
                if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                    if (NIL == position) {
                        Errors.error($str_alt157$Couldn_t_find_position_for__S, sentence);
                    }
                }
                return position;
            }
        }
    }

    // defparameter
    private static final SubLSymbol $topic_struct_verboseP$ = makeSymbol("*TOPIC-STRUCT-VERBOSE?*");

    public static final SubLObject topic_struct_verboseP() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            return list_utilities.sublisp_boolean($topic_struct_verboseP$.getDynamicValue(thread));
        }
    }



    public static final SubLObject topic_struct() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            return $topic_struct$.getDynamicValue(thread);
        }
    }

    public static final SubLObject with_topic_struct(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            destructuring_bind_must_consp(current, datum, $list_alt182);
            {
                SubLObject temp = current.rest();
                current = current.first();
                {
                    SubLObject topic_struct = NIL;
                    destructuring_bind_must_consp(current, datum, $list_alt182);
                    topic_struct = current.first();
                    current = current.rest();
                    if (NIL == current) {
                        current = temp;
                        {
                            SubLObject body = current;
                            return listS(CLET, list(list($topic_struct$, topic_struct)), append(body, NIL));
                        }
                    } else {
                        cdestructuring_bind_error(datum, $list_alt182);
                    }
                }
            }
        }
        return NIL;
    }

    public static final SubLObject do_topic_struct_words(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            destructuring_bind_must_consp(current, datum, $list_alt184);
            {
                SubLObject temp = current.rest();
                current = current.first();
                {
                    SubLObject word = NIL;
                    SubLObject position = NIL;
                    SubLObject topic_struct = NIL;
                    destructuring_bind_must_consp(current, datum, $list_alt184);
                    word = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt184);
                    position = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt184);
                    topic_struct = current.first();
                    current = current.rest();
                    {
                        SubLObject allow_other_keys_p = NIL;
                        SubLObject rest = current;
                        SubLObject bad = NIL;
                        SubLObject current_76 = NIL;
                        for (; NIL != rest;) {
                            destructuring_bind_must_consp(rest, datum, $list_alt184);
                            current_76 = rest.first();
                            rest = rest.rest();
                            destructuring_bind_must_consp(rest, datum, $list_alt184);
                            if (NIL == member(current_76, $list_alt185, UNPROVIDED, UNPROVIDED)) {
                                bad = T;
                            }
                            if (current_76 == $ALLOW_OTHER_KEYS) {
                                allow_other_keys_p = rest.first();
                            }
                            rest = rest.rest();
                        }
                        if ((NIL != bad) && (NIL == allow_other_keys_p)) {
                            cdestructuring_bind_error(datum, $list_alt184);
                        }
                        {
                            SubLObject doneP_tail = property_list_member($DONE_, current);
                            SubLObject doneP = (NIL != doneP_tail) ? ((SubLObject) (cadr(doneP_tail))) : NIL;
                            SubLObject progress_message_tail = property_list_member($PROGRESS_MESSAGE, current);
                            SubLObject progress_message = (NIL != progress_message_tail) ? ((SubLObject) (cadr(progress_message_tail))) : NIL;
                            current = temp;
                            {
                                SubLObject body = current;
                                SubLObject done_count = $sym189$DONE_COUNT;
                                SubLObject word_count = $sym190$WORD_COUNT;
                                return list(CLET, list(bq_cons(done_count, $list_alt191), list(word_count, list(FWHEN, progress_message, list(COUNT_TOPIC_STRUCT_WORDS, topic_struct))), list($sym194$_SILENT_PROGRESS__, list(COR, $sym194$_SILENT_PROGRESS__, list(NULL, progress_message)))), list(NOTING_PERCENT_PROGRESS, progress_message, list(PIF, list(TOPIC_STRUCT_DOCUMENT_P, topic_struct), list(DO_DOCUMENT_TOPIC_STRUCT_WORDS, list(word, position, topic_struct), listS(PUNLESS, doneP, append(body, NIL)), list(CINC, done_count), list(PIF, progress_message, list(NOTE_PERCENT_PROGRESS, done_count, word_count), list(IGNORE, word_count))), list(DO_PARAGRAPH_TOPIC_STRUCT_WORDS, list(word, position, topic_struct), listS(PUNLESS, doneP, append(body, NIL)), list(CINC, done_count), list(PIF, progress_message, list(NOTE_PERCENT_PROGRESS, done_count, word_count), list(IGNORE, word_count))))));
                            }
                        }
                    }
                }
            }
        }
    }

    public static final SubLObject topic_struct_document_p(SubLObject topic_struct) {
        return eq(topic_struct.first(), $DOCUMENT);
    }

    public static final SubLObject document_topic_struct_paragraph_structs(SubLObject topic_struct) {
        return topic_struct.rest();
    }

    public static final SubLObject make_annotated_document_topic_struct(SubLObject paragraph_texts, SubLObject mt) {
        return make_document_topic_struct(paragraph_texts, mt, T);
    }

    public static final SubLObject make_document_topic_struct(SubLObject paragraph_texts, SubLObject mt, SubLObject annotatedP) {
        if (annotatedP == UNPROVIDED) {
            annotatedP = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject paragraph_structs = NIL;
                SubLObject state = memoization_state.possibly_new_memoization_state();
                SubLObject local_state = state;
                {
                    SubLObject _prev_bind_0 = memoization_state.$memoization_state$.currentBinding(thread);
                    try {
                        memoization_state.$memoization_state$.bind(local_state, thread);
                        {
                            SubLObject original_memoization_process = memoization_state.aquireMemoStateLock(local_state);
                            try {
                                {
                                    SubLObject list_var = paragraph_texts;
                                    utilities_macros.$progress_note$.setDynamicValue($str_alt208$Making_document_topic_structure__, thread);
                                    utilities_macros.$progress_start_time$.setDynamicValue(get_universal_time(), thread);
                                    utilities_macros.$progress_total$.setDynamicValue(length(list_var), thread);
                                    utilities_macros.$progress_sofar$.setDynamicValue(ZERO_INTEGER, thread);
                                    {
                                        SubLObject _prev_bind_0_77 = utilities_macros.$last_percent_progress_index$.currentBinding(thread);
                                        SubLObject _prev_bind_1 = utilities_macros.$last_percent_progress_prediction$.currentBinding(thread);
                                        SubLObject _prev_bind_2 = utilities_macros.$within_noting_percent_progress$.currentBinding(thread);
                                        SubLObject _prev_bind_3 = utilities_macros.$percent_progress_start_time$.currentBinding(thread);
                                        try {
                                            utilities_macros.$last_percent_progress_index$.bind(ZERO_INTEGER, thread);
                                            utilities_macros.$last_percent_progress_prediction$.bind(NIL, thread);
                                            utilities_macros.$within_noting_percent_progress$.bind(T, thread);
                                            utilities_macros.$percent_progress_start_time$.bind(get_universal_time(), thread);
                                            utilities_macros.noting_percent_progress_preamble(utilities_macros.$progress_note$.getDynamicValue(thread));
                                            {
                                                SubLObject csome_list_var = list_var;
                                                SubLObject paragraph_text = NIL;
                                                for (paragraph_text = csome_list_var.first(); NIL != csome_list_var; csome_list_var = csome_list_var.rest() , paragraph_text = csome_list_var.first()) {
                                                    utilities_macros.note_percent_progress(utilities_macros.$progress_sofar$.getDynamicValue(thread), utilities_macros.$progress_total$.getDynamicValue(thread));
                                                    utilities_macros.$progress_sofar$.setDynamicValue(add(utilities_macros.$progress_sofar$.getDynamicValue(thread), ONE_INTEGER), thread);
                                                    paragraph_structs = cons(copy_tree(topic_struct_for_test_text(paragraph_text, mt, annotatedP)), paragraph_structs);
                                                }
                                            }
                                            utilities_macros.noting_percent_progress_postamble();
                                        } finally {
                                            utilities_macros.$percent_progress_start_time$.rebind(_prev_bind_3, thread);
                                            utilities_macros.$within_noting_percent_progress$.rebind(_prev_bind_2, thread);
                                            utilities_macros.$last_percent_progress_prediction$.rebind(_prev_bind_1, thread);
                                            utilities_macros.$last_percent_progress_index$.rebind(_prev_bind_0_77, thread);
                                        }
                                    }
                                }
                            } finally {
                                {
                                    SubLObject _prev_bind_0_78 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                    try {
                                        $is_thread_performing_cleanupP$.bind(T, thread);
                                        if ((NIL != local_state) && (NIL == original_memoization_process)) {
                                            memoization_state.memoization_state_set_current_process_internal(local_state, NIL);
                                        }
                                    } finally {
                                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0_78, thread);
                                    }
                                }
                            }
                        }
                    } finally {
                        memoization_state.$memoization_state$.rebind(_prev_bind_0, thread);
                    }
                }
                return cons($DOCUMENT, nreverse(paragraph_structs));
            }
        }
    }

    public static final SubLObject do_document_topic_struct_words(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            destructuring_bind_must_consp(current, datum, $list_alt209);
            {
                SubLObject temp = current.rest();
                current = current.first();
                {
                    SubLObject word = NIL;
                    SubLObject position = NIL;
                    SubLObject topic_struct = NIL;
                    destructuring_bind_must_consp(current, datum, $list_alt209);
                    word = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt209);
                    position = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt209);
                    topic_struct = current.first();
                    current = current.rest();
                    if (NIL == current) {
                        current = temp;
                        {
                            SubLObject body = current;
                            SubLObject paragraph_num = $sym210$PARAGRAPH_NUM;
                            SubLObject paragraph_topic_struct = $sym211$PARAGRAPH_TOPIC_STRUCT;
                            SubLObject subposition = $sym212$SUBPOSITION;
                            return list(CDOLIST_NUMBERED, list(paragraph_topic_struct, paragraph_num, list(DOCUMENT_TOPIC_STRUCT_PARAGRAPH_STRUCTS, topic_struct)), list(DO_PARAGRAPH_TOPIC_STRUCT_WORDS, list(word, subposition, paragraph_topic_struct), listS(CLET, list(list(position, list(CONS, paragraph_num, subposition))), append(body, NIL))));
                        }
                    } else {
                        cdestructuring_bind_error(datum, $list_alt209);
                    }
                }
            }
        }
        return NIL;
    }

    public static final SubLObject do_paragraph_topic_struct_words(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            destructuring_bind_must_consp(current, datum, $list_alt209);
            {
                SubLObject temp = current.rest();
                current = current.first();
                {
                    SubLObject word = NIL;
                    SubLObject position = NIL;
                    SubLObject topic_struct = NIL;
                    destructuring_bind_must_consp(current, datum, $list_alt209);
                    word = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt209);
                    position = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt209);
                    topic_struct = current.first();
                    current = current.rest();
                    if (NIL == current) {
                        current = temp;
                        {
                            SubLObject body = current;
                            SubLObject sentence = $sym216$SENTENCE;
                            SubLObject sentence_num = $sym217$SENTENCE_NUM;
                            SubLObject word_num = $sym218$WORD_NUM;
                            return list(CDOLIST_NUMBERED, list(sentence, sentence_num, list(EL_LIST_ITEMS, topic_struct)), list(CDOLIST_NUMBERED, list(word, word_num, list(EL_LIST_ITEMS, sentence)), listS(CLET, list(list(position, list(LIST, sentence_num, word_num))), append(body, NIL))));
                        }
                    } else {
                        cdestructuring_bind_error(datum, $list_alt209);
                    }
                }
            }
        }
        return NIL;
    }

    public static final SubLObject do_topic_struct_word_denots(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            destructuring_bind_must_consp(current, datum, $list_alt221);
            {
                SubLObject temp = current.rest();
                current = current.first();
                {
                    SubLObject denot = NIL;
                    SubLObject word = NIL;
                    destructuring_bind_must_consp(current, datum, $list_alt221);
                    denot = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt221);
                    word = current.first();
                    current = current.rest();
                    {
                        SubLObject allow_other_keys_p = NIL;
                        SubLObject rest = current;
                        SubLObject bad = NIL;
                        SubLObject current_79 = NIL;
                        for (; NIL != rest;) {
                            destructuring_bind_must_consp(rest, datum, $list_alt221);
                            current_79 = rest.first();
                            rest = rest.rest();
                            destructuring_bind_must_consp(rest, datum, $list_alt221);
                            if (NIL == member(current_79, $list_alt222, UNPROVIDED, UNPROVIDED)) {
                                bad = T;
                            }
                            if (current_79 == $ALLOW_OTHER_KEYS) {
                                allow_other_keys_p = rest.first();
                            }
                            rest = rest.rest();
                        }
                        if ((NIL != bad) && (NIL == allow_other_keys_p)) {
                            cdestructuring_bind_error(datum, $list_alt221);
                        }
                        {
                            SubLObject doneP_tail = property_list_member($DONE_, current);
                            SubLObject doneP = (NIL != doneP_tail) ? ((SubLObject) (cadr(doneP_tail))) : NIL;
                            current = temp;
                            {
                                SubLObject body = current;
                                return listS(CSOME, list(denot, list(TOPIC_STRUCT_WORD_DENOTS, word), doneP), append(body, NIL));
                            }
                        }
                    }
                }
            }
        }
    }

    public static final SubLObject count_topic_struct_words(SubLObject topic_struct) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject count = ZERO_INTEGER;
                SubLObject done_count = ZERO_INTEGER;
                SubLObject word_count = NIL;
                {
                    SubLObject _prev_bind_0 = utilities_macros.$silent_progressP$.currentBinding(thread);
                    SubLObject _prev_bind_1 = utilities_macros.$last_percent_progress_index$.currentBinding(thread);
                    SubLObject _prev_bind_2 = utilities_macros.$last_percent_progress_prediction$.currentBinding(thread);
                    SubLObject _prev_bind_3 = utilities_macros.$within_noting_percent_progress$.currentBinding(thread);
                    SubLObject _prev_bind_4 = utilities_macros.$percent_progress_start_time$.currentBinding(thread);
                    try {
                        utilities_macros.$silent_progressP$.bind(makeBoolean((NIL != utilities_macros.$silent_progressP$.getDynamicValue(thread)) || true), thread);
                        utilities_macros.$last_percent_progress_index$.bind(ZERO_INTEGER, thread);
                        utilities_macros.$last_percent_progress_prediction$.bind(NIL, thread);
                        utilities_macros.$within_noting_percent_progress$.bind(T, thread);
                        utilities_macros.$percent_progress_start_time$.bind(get_universal_time(), thread);
                        utilities_macros.noting_percent_progress_preamble(NIL);
                        if (NIL != topic_struct_document_p(topic_struct)) {
                            {
                                SubLObject list_var = NIL;
                                SubLObject paragraph_topic_struct = NIL;
                                SubLObject paragraph_num = NIL;
                                for (list_var = document_topic_struct_paragraph_structs(topic_struct), paragraph_topic_struct = list_var.first(), paragraph_num = ZERO_INTEGER; NIL != list_var; list_var = list_var.rest() , paragraph_topic_struct = list_var.first() , paragraph_num = add(ONE_INTEGER, paragraph_num)) {
                                    {
                                        SubLObject list_var_80 = NIL;
                                        SubLObject sentence = NIL;
                                        SubLObject sentence_num = NIL;
                                        for (list_var_80 = el_utilities.el_list_items(paragraph_topic_struct), sentence = list_var_80.first(), sentence_num = ZERO_INTEGER; NIL != list_var_80; list_var_80 = list_var_80.rest() , sentence = list_var_80.first() , sentence_num = add(ONE_INTEGER, sentence_num)) {
                                            {
                                                SubLObject list_var_81 = NIL;
                                                SubLObject word = NIL;
                                                SubLObject word_num = NIL;
                                                for (list_var_81 = el_utilities.el_list_items(sentence), word = list_var_81.first(), word_num = ZERO_INTEGER; NIL != list_var_81; list_var_81 = list_var_81.rest() , word = list_var_81.first() , word_num = add(ONE_INTEGER, word_num)) {
                                                    {
                                                        SubLObject subposition = list(sentence_num, word_num);
                                                        SubLObject position = cons(paragraph_num, subposition);
                                                        count = add(count, ONE_INTEGER);
                                                        done_count = add(done_count, ONE_INTEGER);
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        } else {
                            {
                                SubLObject list_var = NIL;
                                SubLObject sentence = NIL;
                                SubLObject sentence_num = NIL;
                                for (list_var = el_utilities.el_list_items(topic_struct), sentence = list_var.first(), sentence_num = ZERO_INTEGER; NIL != list_var; list_var = list_var.rest() , sentence = list_var.first() , sentence_num = add(ONE_INTEGER, sentence_num)) {
                                    {
                                        SubLObject list_var_82 = NIL;
                                        SubLObject word = NIL;
                                        SubLObject word_num = NIL;
                                        for (list_var_82 = el_utilities.el_list_items(sentence), word = list_var_82.first(), word_num = ZERO_INTEGER; NIL != list_var_82; list_var_82 = list_var_82.rest() , word = list_var_82.first() , word_num = add(ONE_INTEGER, word_num)) {
                                            {
                                                SubLObject position = list(sentence_num, word_num);
                                                count = add(count, ONE_INTEGER);
                                                done_count = add(done_count, ONE_INTEGER);
                                            }
                                        }
                                    }
                                }
                            }
                        }
                        utilities_macros.noting_percent_progress_postamble();
                    } finally {
                        utilities_macros.$percent_progress_start_time$.rebind(_prev_bind_4, thread);
                        utilities_macros.$within_noting_percent_progress$.rebind(_prev_bind_3, thread);
                        utilities_macros.$last_percent_progress_prediction$.rebind(_prev_bind_2, thread);
                        utilities_macros.$last_percent_progress_index$.rebind(_prev_bind_1, thread);
                        utilities_macros.$silent_progressP$.rebind(_prev_bind_0, thread);
                    }
                }
                return count;
            }
        }
    }

    public static final SubLObject count_topic_struct_ambiguous_words(SubLObject topic_struct, SubLObject require_correct_presentP) {
        if (require_correct_presentP == UNPROVIDED) {
            require_correct_presentP = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject count = ZERO_INTEGER;
                SubLObject done_count = ZERO_INTEGER;
                SubLObject word_count = NIL;
                {
                    SubLObject _prev_bind_0 = utilities_macros.$silent_progressP$.currentBinding(thread);
                    SubLObject _prev_bind_1 = utilities_macros.$last_percent_progress_index$.currentBinding(thread);
                    SubLObject _prev_bind_2 = utilities_macros.$last_percent_progress_prediction$.currentBinding(thread);
                    SubLObject _prev_bind_3 = utilities_macros.$within_noting_percent_progress$.currentBinding(thread);
                    SubLObject _prev_bind_4 = utilities_macros.$percent_progress_start_time$.currentBinding(thread);
                    try {
                        utilities_macros.$silent_progressP$.bind(makeBoolean((NIL != utilities_macros.$silent_progressP$.getDynamicValue(thread)) || true), thread);
                        utilities_macros.$last_percent_progress_index$.bind(ZERO_INTEGER, thread);
                        utilities_macros.$last_percent_progress_prediction$.bind(NIL, thread);
                        utilities_macros.$within_noting_percent_progress$.bind(T, thread);
                        utilities_macros.$percent_progress_start_time$.bind(get_universal_time(), thread);
                        utilities_macros.noting_percent_progress_preamble(NIL);
                        if (NIL != topic_struct_document_p(topic_struct)) {
                            {
                                SubLObject list_var = NIL;
                                SubLObject paragraph_topic_struct = NIL;
                                SubLObject paragraph_num = NIL;
                                for (list_var = document_topic_struct_paragraph_structs(topic_struct), paragraph_topic_struct = list_var.first(), paragraph_num = ZERO_INTEGER; NIL != list_var; list_var = list_var.rest() , paragraph_topic_struct = list_var.first() , paragraph_num = add(ONE_INTEGER, paragraph_num)) {
                                    {
                                        SubLObject list_var_83 = NIL;
                                        SubLObject sentence = NIL;
                                        SubLObject sentence_num = NIL;
                                        for (list_var_83 = el_utilities.el_list_items(paragraph_topic_struct), sentence = list_var_83.first(), sentence_num = ZERO_INTEGER; NIL != list_var_83; list_var_83 = list_var_83.rest() , sentence = list_var_83.first() , sentence_num = add(ONE_INTEGER, sentence_num)) {
                                            {
                                                SubLObject list_var_84 = NIL;
                                                SubLObject word = NIL;
                                                SubLObject word_num = NIL;
                                                for (list_var_84 = el_utilities.el_list_items(sentence), word = list_var_84.first(), word_num = ZERO_INTEGER; NIL != list_var_84; list_var_84 = list_var_84.rest() , word = list_var_84.first() , word_num = add(ONE_INTEGER, word_num)) {
                                                    {
                                                        SubLObject subposition = list(sentence_num, word_num);
                                                        SubLObject position = cons(paragraph_num, subposition);
                                                        if (NIL != topic_struct_word_ambiguous_p(word, require_correct_presentP)) {
                                                            count = add(count, ONE_INTEGER);
                                                        }
                                                        done_count = add(done_count, ONE_INTEGER);
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        } else {
                            {
                                SubLObject list_var = NIL;
                                SubLObject sentence = NIL;
                                SubLObject sentence_num = NIL;
                                for (list_var = el_utilities.el_list_items(topic_struct), sentence = list_var.first(), sentence_num = ZERO_INTEGER; NIL != list_var; list_var = list_var.rest() , sentence = list_var.first() , sentence_num = add(ONE_INTEGER, sentence_num)) {
                                    {
                                        SubLObject list_var_85 = NIL;
                                        SubLObject word = NIL;
                                        SubLObject word_num = NIL;
                                        for (list_var_85 = el_utilities.el_list_items(sentence), word = list_var_85.first(), word_num = ZERO_INTEGER; NIL != list_var_85; list_var_85 = list_var_85.rest() , word = list_var_85.first() , word_num = add(ONE_INTEGER, word_num)) {
                                            {
                                                SubLObject position = list(sentence_num, word_num);
                                                if (NIL != topic_struct_word_ambiguous_p(word, require_correct_presentP)) {
                                                    count = add(count, ONE_INTEGER);
                                                }
                                                done_count = add(done_count, ONE_INTEGER);
                                            }
                                        }
                                    }
                                }
                            }
                        }
                        utilities_macros.noting_percent_progress_postamble();
                    } finally {
                        utilities_macros.$percent_progress_start_time$.rebind(_prev_bind_4, thread);
                        utilities_macros.$within_noting_percent_progress$.rebind(_prev_bind_3, thread);
                        utilities_macros.$last_percent_progress_prediction$.rebind(_prev_bind_2, thread);
                        utilities_macros.$last_percent_progress_index$.rebind(_prev_bind_1, thread);
                        utilities_macros.$silent_progressP$.rebind(_prev_bind_0, thread);
                    }
                }
                return count;
            }
        }
    }

    public static final SubLObject topic_struct_word_ambiguous_p(SubLObject word, SubLObject require_correct_presentP) {
        if (require_correct_presentP == UNPROVIDED) {
            require_correct_presentP = NIL;
        }
        return makeBoolean((((NIL != list_utilities.lengthG(topic_struct_word_denots(word), ONE_INTEGER, UNPROVIDED)) && (NIL == list_utilities.tree_find_if($sym225$INVALID_CONSTANT_, topic_struct_word_denots(word), UNPROVIDED))) && (NIL == list_utilities.tree_find_if(INVALID_NART_P, topic_struct_word_denots(word), UNPROVIDED))) && ((NIL == require_correct_presentP) || (NIL != topic_struct_word_correct_denots(word))));
    }

    public static final SubLObject invalid_nart_p(SubLObject v_object) {
        return makeBoolean((NIL != nart_handles.nart_p(v_object)) && (NIL == nart_handles.valid_nartP(v_object, NIL)));
    }

    public static final SubLObject topic_struct_find_denot(SubLObject v_term, SubLObject topic_struct) {
        if (topic_struct == UNPROVIDED) {
            topic_struct = $topic_struct$.getDynamicValue();
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject foundP = NIL;
                if (NIL != el_utilities.el_list_p(topic_struct)) {
                    {
                        SubLObject done_count = ZERO_INTEGER;
                        SubLObject word_count = NIL;
                        {
                            SubLObject _prev_bind_0 = utilities_macros.$silent_progressP$.currentBinding(thread);
                            SubLObject _prev_bind_1 = utilities_macros.$last_percent_progress_index$.currentBinding(thread);
                            SubLObject _prev_bind_2 = utilities_macros.$last_percent_progress_prediction$.currentBinding(thread);
                            SubLObject _prev_bind_3 = utilities_macros.$within_noting_percent_progress$.currentBinding(thread);
                            SubLObject _prev_bind_4 = utilities_macros.$percent_progress_start_time$.currentBinding(thread);
                            try {
                                utilities_macros.$silent_progressP$.bind(makeBoolean((NIL != utilities_macros.$silent_progressP$.getDynamicValue(thread)) || true), thread);
                                utilities_macros.$last_percent_progress_index$.bind(ZERO_INTEGER, thread);
                                utilities_macros.$last_percent_progress_prediction$.bind(NIL, thread);
                                utilities_macros.$within_noting_percent_progress$.bind(T, thread);
                                utilities_macros.$percent_progress_start_time$.bind(get_universal_time(), thread);
                                utilities_macros.noting_percent_progress_preamble(NIL);
                                if (NIL != topic_struct_document_p(topic_struct)) {
                                    {
                                        SubLObject list_var = NIL;
                                        SubLObject paragraph_topic_struct = NIL;
                                        SubLObject paragraph_num = NIL;
                                        for (list_var = document_topic_struct_paragraph_structs(topic_struct), paragraph_topic_struct = list_var.first(), paragraph_num = ZERO_INTEGER; NIL != list_var; list_var = list_var.rest() , paragraph_topic_struct = list_var.first() , paragraph_num = add(ONE_INTEGER, paragraph_num)) {
                                            {
                                                SubLObject list_var_86 = NIL;
                                                SubLObject sentence = NIL;
                                                SubLObject sentence_num = NIL;
                                                for (list_var_86 = el_utilities.el_list_items(paragraph_topic_struct), sentence = list_var_86.first(), sentence_num = ZERO_INTEGER; NIL != list_var_86; list_var_86 = list_var_86.rest() , sentence = list_var_86.first() , sentence_num = add(ONE_INTEGER, sentence_num)) {
                                                    {
                                                        SubLObject list_var_87 = NIL;
                                                        SubLObject word = NIL;
                                                        SubLObject word_num = NIL;
                                                        for (list_var_87 = el_utilities.el_list_items(sentence), word = list_var_87.first(), word_num = ZERO_INTEGER; NIL != list_var_87; list_var_87 = list_var_87.rest() , word = list_var_87.first() , word_num = add(ONE_INTEGER, word_num)) {
                                                            {
                                                                SubLObject subposition = list(sentence_num, word_num);
                                                                SubLObject position = cons(paragraph_num, subposition);
                                                                if (NIL == foundP) {
                                                                    if (NIL == foundP) {
                                                                        {
                                                                            SubLObject csome_list_var = topic_struct_word_denots(word);
                                                                            SubLObject denot = NIL;
                                                                            for (denot = csome_list_var.first(); !((NIL != foundP) || (NIL == csome_list_var)); csome_list_var = csome_list_var.rest() , denot = csome_list_var.first()) {
                                                                                if (v_term.equal(denot)) {
                                                                                    foundP = T;
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                                done_count = add(done_count, ONE_INTEGER);
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                } else {
                                    {
                                        SubLObject list_var = NIL;
                                        SubLObject sentence = NIL;
                                        SubLObject sentence_num = NIL;
                                        for (list_var = el_utilities.el_list_items(topic_struct), sentence = list_var.first(), sentence_num = ZERO_INTEGER; NIL != list_var; list_var = list_var.rest() , sentence = list_var.first() , sentence_num = add(ONE_INTEGER, sentence_num)) {
                                            {
                                                SubLObject list_var_88 = NIL;
                                                SubLObject word = NIL;
                                                SubLObject word_num = NIL;
                                                for (list_var_88 = el_utilities.el_list_items(sentence), word = list_var_88.first(), word_num = ZERO_INTEGER; NIL != list_var_88; list_var_88 = list_var_88.rest() , word = list_var_88.first() , word_num = add(ONE_INTEGER, word_num)) {
                                                    {
                                                        SubLObject position = list(sentence_num, word_num);
                                                        if (NIL == foundP) {
                                                            if (NIL == foundP) {
                                                                {
                                                                    SubLObject csome_list_var = topic_struct_word_denots(word);
                                                                    SubLObject denot = NIL;
                                                                    for (denot = csome_list_var.first(); !((NIL != foundP) || (NIL == csome_list_var)); csome_list_var = csome_list_var.rest() , denot = csome_list_var.first()) {
                                                                        if (v_term.equal(denot)) {
                                                                            foundP = T;
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                        done_count = add(done_count, ONE_INTEGER);
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                                utilities_macros.noting_percent_progress_postamble();
                            } finally {
                                utilities_macros.$percent_progress_start_time$.rebind(_prev_bind_4, thread);
                                utilities_macros.$within_noting_percent_progress$.rebind(_prev_bind_3, thread);
                                utilities_macros.$last_percent_progress_prediction$.rebind(_prev_bind_2, thread);
                                utilities_macros.$last_percent_progress_index$.rebind(_prev_bind_1, thread);
                                utilities_macros.$silent_progressP$.rebind(_prev_bind_0, thread);
                            }
                        }
                    }
                }
                return foundP;
            }
        }
    }

    public static final SubLObject topic_struct_sentence_p(SubLObject v_object) {
        return makeBoolean((NIL != el_utilities.el_list_p(v_object)) && (NIL == list_utilities.find_if_not(TOPIC_STRUCT_WORD_P, el_utilities.el_list_items(v_object), UNPROVIDED, UNPROVIDED, UNPROVIDED)));
    }

    public static final SubLObject topic_struct_word_p(SubLObject v_object) {
        return formula_pattern_match.formula_matches_pattern(v_object, $list_alt228);
    }

    public static final SubLObject topic_struct_tag_p(SubLObject v_object) {
        return makeBoolean((NIL == v_object) || (NIL != parsing_utilities.cycl_penntag_p(v_object)));
    }

    public static final SubLObject topic_struct_word_string(SubLObject word) {
        return cycl_utilities.nat_arg1(word, UNPROVIDED);
    }

    public static final SubLObject topic_struct_position_correct_denots(SubLObject topic_struct, SubLObject position) {
        {
            SubLObject word = topic_struct_word_from_position(topic_struct, position);
            SubLObject el_set = (NIL != el_utilities.formula_arityGE(word, FOUR_INTEGER, UNPROVIDED)) ? ((SubLObject) (cycl_utilities.nat_arg4(word, UNPROVIDED))) : NIL;
            return NIL != narts_high.naut_p(el_set) ? ((SubLObject) (cycl_utilities.nat_args(el_set, UNPROVIDED))) : NIL;
        }
    }

    public static final SubLObject topic_struct_word_correct_denots(SubLObject word) {
        {
            SubLObject el_set = (NIL != el_utilities.formula_arityGE(word, FOUR_INTEGER, UNPROVIDED)) ? ((SubLObject) (cycl_utilities.nat_arg4(word, UNPROVIDED))) : NIL;
            return NIL != narts_high.naut_p(el_set) ? ((SubLObject) (cycl_utilities.nat_args(el_set, UNPROVIDED))) : NIL;
        }
    }

    public static final SubLObject topic_struct_word_string_in_context(SubLObject topic_struct, SubLObject position, SubLObject leading, SubLObject following) {
        if (leading == UNPROVIDED) {
            leading = TWO_INTEGER;
        }
        if (following == UNPROVIDED) {
            following = TWO_INTEGER;
        }
        {
            SubLObject word = topic_struct_word_from_position(topic_struct, position);
            SubLObject leading_context = topic_struct_leading_context(topic_struct, position, leading);
            SubLObject following_context = topic_struct_following_context(topic_struct, position, following);
            return cconcatenate(leading_context, new SubLObject[]{ Strings.string_upcase(topic_struct_word_string(word), UNPROVIDED, UNPROVIDED), following_context });
        }
    }

    public static final SubLObject topic_struct_sentence_from_position(SubLObject topic_struct, SubLObject position) {
        if (NIL != topic_struct_document_p(topic_struct)) {
            {
                SubLObject datum = position;
                SubLObject current = datum;
                SubLObject paragraph_num = NIL;
                SubLObject position_in_paragraph = NIL;
                destructuring_bind_must_consp(current, datum, $list_alt230);
                paragraph_num = current.first();
                current = current.rest();
                position_in_paragraph = current;
                return topic_struct_sentence_from_position(nth(paragraph_num, document_topic_struct_paragraph_structs(topic_struct)), position_in_paragraph);
            }
        } else {
            return list_utilities.get_nested_nth(topic_struct, Mapping.mapcar($sym231$1_, position), UNPROVIDED);
        }
    }

    public static final SubLObject topic_struct_word_from_position(SubLObject topic_struct, SubLObject position) {
        if (NIL != topic_struct_document_p(topic_struct)) {
            {
                SubLObject datum = position;
                SubLObject current = datum;
                SubLObject paragraph_num = NIL;
                SubLObject position_in_paragraph = NIL;
                destructuring_bind_must_consp(current, datum, $list_alt230);
                paragraph_num = current.first();
                current = current.rest();
                position_in_paragraph = current;
                return topic_struct_word_from_position(nth(paragraph_num, document_topic_struct_paragraph_structs(topic_struct)), position_in_paragraph);
            }
        } else {
            return list_utilities.get_nested_nth(topic_struct, Mapping.mapcar($sym231$1_, position), UNPROVIDED);
        }
    }

    public static final SubLObject topic_struct_leading_context(SubLObject topic_struct, SubLObject position, SubLObject max) {
        {
            SubLObject working_position = copy_list(position);
            SubLObject stop_index = list_utilities.last_one(working_position);
            SubLObject curr_index = subtract(stop_index, max);
            SubLObject prefix = (curr_index.numL(stop_index)) ? ((SubLObject) (curr_index.numLE(ZERO_INTEGER) ? ((SubLObject) ($str_alt232$_)) : $str_alt233$_____)) : string_utilities.$empty_string$.getGlobalValue();
            SubLObject ans = NIL;
            SubLObject stream = NIL;
            try {
                stream = make_private_string_output_stream();
                while (curr_index.numL(stop_index)) {
                    if (!curr_index.numL(ZERO_INTEGER)) {
                        working_position = list_utilities.nreplace_last(working_position, curr_index);
                        {
                            SubLObject word = topic_struct_word_from_position(topic_struct, working_position);
                            SubLObject word_string = topic_struct_word_string(word);
                            format(stream, $str_alt234$_A_, word_string);
                        }
                    }
                    curr_index = add(curr_index, ONE_INTEGER);
                } 
                ans = get_output_stream_string(stream);
            } finally {
                {
                    SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                    try {
                        bind($is_thread_performing_cleanupP$, T);
                        close(stream, UNPROVIDED);
                    } finally {
                        rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                    }
                }
            }
            if (NIL == string_utilities.empty_string_p(ans)) {
                ans = cconcatenate(prefix, new SubLObject[]{ string_utilities.string_first_n(number_utilities.f_1_(length(ans)), ans), $str_alt235$__ });
            }
            return ans;
        }
    }

    public static final SubLObject topic_struct_following_context(SubLObject topic_struct, SubLObject position, SubLObject max) {
        {
            SubLObject working_position = copy_list(position);
            SubLObject target_index = list_utilities.last_one(working_position);
            SubLObject curr_index = number_utilities.f_1X(target_index);
            SubLObject stop_index = add(max, target_index);
            SubLObject hit_endP = NIL;
            SubLObject ans = NIL;
            SubLObject stream = NIL;
            try {
                stream = make_private_string_output_stream();
                while ((NIL == hit_endP) && curr_index.numLE(stop_index)) {
                    working_position = list_utilities.nreplace_last(working_position, curr_index);
                    {
                        SubLObject word = topic_struct_word_from_position(topic_struct, working_position);
                        if (NIL != word) {
                            {
                                SubLObject word_string = topic_struct_word_string(word);
                                format(stream, $str_alt234$_A_, word_string);
                            }
                        } else {
                            hit_endP = T;
                        }
                    }
                    curr_index = add(curr_index, ONE_INTEGER);
                } 
                ans = get_output_stream_string(stream);
            } finally {
                {
                    SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                    try {
                        bind($is_thread_performing_cleanupP$, T);
                        close(stream, UNPROVIDED);
                    } finally {
                        rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                    }
                }
            }
            if (NIL == string_utilities.empty_string_p(ans)) {
                {
                    SubLObject suffix = (NIL != hit_endP) ? ((SubLObject) ($str_alt236$_)) : $str_alt237$____;
                    ans = cconcatenate($str_alt238$__, new SubLObject[]{ string_utilities.string_first_n(number_utilities.f_1_(length(ans)), ans), suffix });
                }
            }
            return ans;
        }
    }

    public static final SubLObject topic_struct_word_denots(SubLObject word) {
        {
            SubLObject el_set = cycl_utilities.nat_arg3(word, UNPROVIDED);
            return NIL != el_utilities.el_non_empty_set_p(el_set) ? ((SubLObject) (cycl_utilities.nat_args(el_set, UNPROVIDED))) : NIL;
        }
    }

    /**
     *
     *
     * @return DICTIONARY-P; Mapping denots of other words in TOPIC-STRUCT that are genls or specs of TERM to scores.
     */
    public static final SubLObject topic_struct_genls(SubLObject topic_struct, SubLObject word_position, SubLObject v_term) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject v_genls = NIL;
                if ((NIL != term.el_fort_p(v_term)) && (NIL != fort_types_interface.collection_p(v_term))) {
                    {
                        SubLObject use_specsP = numL(cardinality_estimates.generality_estimate(v_term), topic_struct_isaXgenls_generality_cutoff());
                        SubLObject state = memoization_state.possibly_new_memoization_state();
                        SubLObject local_state = state;
                        {
                            SubLObject _prev_bind_0 = memoization_state.$memoization_state$.currentBinding(thread);
                            try {
                                memoization_state.$memoization_state$.bind(local_state, thread);
                                {
                                    final SubLObject original_memoization_process = memoization_state.aquireMemoStateLock(local_state);
                                    try {
                                        {
                                            SubLObject done_count = ZERO_INTEGER;
                                            SubLObject word_count = NIL;
                                            {
                                                SubLObject _prev_bind_0_89 = utilities_macros.$silent_progressP$.currentBinding(thread);
                                                SubLObject _prev_bind_1 = utilities_macros.$last_percent_progress_index$.currentBinding(thread);
                                                SubLObject _prev_bind_2 = utilities_macros.$last_percent_progress_prediction$.currentBinding(thread);
                                                SubLObject _prev_bind_3 = utilities_macros.$within_noting_percent_progress$.currentBinding(thread);
                                                SubLObject _prev_bind_4 = utilities_macros.$percent_progress_start_time$.currentBinding(thread);
                                                try {
                                                    utilities_macros.$silent_progressP$.bind(makeBoolean((NIL != utilities_macros.$silent_progressP$.getDynamicValue(thread)) || true), thread);
                                                    utilities_macros.$last_percent_progress_index$.bind(ZERO_INTEGER, thread);
                                                    utilities_macros.$last_percent_progress_prediction$.bind(NIL, thread);
                                                    utilities_macros.$within_noting_percent_progress$.bind(T, thread);
                                                    utilities_macros.$percent_progress_start_time$.bind(get_universal_time(), thread);
                                                    utilities_macros.noting_percent_progress_preamble(NIL);
                                                    if (NIL != topic_struct_document_p(topic_struct)) {
                                                        {
                                                            SubLObject list_var = NIL;
                                                            SubLObject paragraph_topic_struct = NIL;
                                                            SubLObject paragraph_num = NIL;
                                                            for (list_var = document_topic_struct_paragraph_structs(topic_struct), paragraph_topic_struct = list_var.first(), paragraph_num = ZERO_INTEGER; NIL != list_var; list_var = list_var.rest() , paragraph_topic_struct = list_var.first() , paragraph_num = add(ONE_INTEGER, paragraph_num)) {
                                                                {
                                                                    SubLObject list_var_90 = NIL;
                                                                    SubLObject sentence = NIL;
                                                                    SubLObject sentence_num = NIL;
                                                                    for (list_var_90 = el_utilities.el_list_items(paragraph_topic_struct), sentence = list_var_90.first(), sentence_num = ZERO_INTEGER; NIL != list_var_90; list_var_90 = list_var_90.rest() , sentence = list_var_90.first() , sentence_num = add(ONE_INTEGER, sentence_num)) {
                                                                        {
                                                                            SubLObject list_var_91 = NIL;
                                                                            SubLObject word = NIL;
                                                                            SubLObject word_num = NIL;
                                                                            for (list_var_91 = el_utilities.el_list_items(sentence), word = list_var_91.first(), word_num = ZERO_INTEGER; NIL != list_var_91; list_var_91 = list_var_91.rest() , word = list_var_91.first() , word_num = add(ONE_INTEGER, word_num)) {
                                                                                {
                                                                                    SubLObject subposition = list(sentence_num, word_num);
                                                                                    SubLObject position = cons(paragraph_num, subposition);
                                                                                    if (!(position.equal(word_position) || (NIL == topic_struct_word_denots(word)))) {
                                                                                        {
                                                                                            SubLObject ambiguity_factor = length(topic_struct_word_denots(word));
                                                                                            SubLObject csome_list_var = topic_struct_word_denots(word);
                                                                                            SubLObject denot = NIL;
                                                                                            for (denot = csome_list_var.first(); NIL != csome_list_var; csome_list_var = csome_list_var.rest() , denot = csome_list_var.first()) {
                                                                                                if (((!v_term.equal(denot)) && (NIL != term.el_fort_p(denot))) && ((NIL != genls.genlP(v_term, denot, UNPROVIDED, UNPROVIDED)) || ((NIL != use_specsP) && (NIL != genls.genlP(denot, v_term, UNPROVIDED, UNPROVIDED))))) {
                                                                                                    {
                                                                                                        SubLObject generality_estimate = cardinality_estimates.generality_estimate(denot);
                                                                                                        SubLObject plist = list(new SubLObject[]{ $SUPPORTER, denot, $SUPPORTER_GENERALITY, generality_estimate, $AMBIGUITY_FACTOR, ambiguity_factor, $FOCAL_POSITION, word_position, $SUPPORTER_POSITION, position });
                                                                                                        SubLObject score = genl_count_plist_score(plist, UNPROVIDED);
                                                                                                        plist = putf(plist, $SCORE, score);
                                                                                                        v_genls = cons(plist, v_genls);
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                    done_count = add(done_count, ONE_INTEGER);
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    } else {
                                                        {
                                                            SubLObject list_var = NIL;
                                                            SubLObject sentence = NIL;
                                                            SubLObject sentence_num = NIL;
                                                            for (list_var = el_utilities.el_list_items(topic_struct), sentence = list_var.first(), sentence_num = ZERO_INTEGER; NIL != list_var; list_var = list_var.rest() , sentence = list_var.first() , sentence_num = add(ONE_INTEGER, sentence_num)) {
                                                                {
                                                                    SubLObject list_var_92 = NIL;
                                                                    SubLObject word = NIL;
                                                                    SubLObject word_num = NIL;
                                                                    for (list_var_92 = el_utilities.el_list_items(sentence), word = list_var_92.first(), word_num = ZERO_INTEGER; NIL != list_var_92; list_var_92 = list_var_92.rest() , word = list_var_92.first() , word_num = add(ONE_INTEGER, word_num)) {
                                                                        {
                                                                            SubLObject position = list(sentence_num, word_num);
                                                                            if (!(position.equal(word_position) || (NIL == topic_struct_word_denots(word)))) {
                                                                                {
                                                                                    SubLObject ambiguity_factor = length(topic_struct_word_denots(word));
                                                                                    SubLObject csome_list_var = topic_struct_word_denots(word);
                                                                                    SubLObject denot = NIL;
                                                                                    for (denot = csome_list_var.first(); NIL != csome_list_var; csome_list_var = csome_list_var.rest() , denot = csome_list_var.first()) {
                                                                                        if (((!v_term.equal(denot)) && (NIL != term.el_fort_p(denot))) && ((NIL != genls.genlP(v_term, denot, UNPROVIDED, UNPROVIDED)) || ((NIL != use_specsP) && (NIL != genls.genlP(denot, v_term, UNPROVIDED, UNPROVIDED))))) {
                                                                                            {
                                                                                                SubLObject generality_estimate = cardinality_estimates.generality_estimate(denot);
                                                                                                SubLObject plist = list(new SubLObject[]{ $SUPPORTER, denot, $SUPPORTER_GENERALITY, generality_estimate, $AMBIGUITY_FACTOR, ambiguity_factor, $FOCAL_POSITION, word_position, $SUPPORTER_POSITION, position });
                                                                                                SubLObject score = genl_count_plist_score(plist, UNPROVIDED);
                                                                                                plist = putf(plist, $SCORE, score);
                                                                                                v_genls = cons(plist, v_genls);
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                }
                                                                            }
                                                                            done_count = add(done_count, ONE_INTEGER);
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                    utilities_macros.noting_percent_progress_postamble();
                                                } finally {
                                                    utilities_macros.$percent_progress_start_time$.rebind(_prev_bind_4, thread);
                                                    utilities_macros.$within_noting_percent_progress$.rebind(_prev_bind_3, thread);
                                                    utilities_macros.$last_percent_progress_prediction$.rebind(_prev_bind_2, thread);
                                                    utilities_macros.$last_percent_progress_index$.rebind(_prev_bind_1, thread);
                                                    utilities_macros.$silent_progressP$.rebind(_prev_bind_0_89, thread);
                                                }
                                            }
                                        }
                                    } finally {
                                        {
                                            SubLObject _prev_bind_0_93 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                            try {
                                                $is_thread_performing_cleanupP$.bind(T, thread);
                                                if ((NIL != local_state) && (NIL == original_memoization_process)) {
                                                    memoization_state.memoization_state_set_current_process_internal(local_state, NIL);
                                                }
                                            } finally {
                                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0_93, thread);
                                            }
                                        }
                                    }
                                }
                            } finally {
                                memoization_state.$memoization_state$.rebind(_prev_bind_0, thread);
                            }
                        }
                    }
                    if ((NIL != topic_struct_verboseP()) && (NIL != list_utilities.lengthG(v_genls, ZERO_INTEGER, UNPROVIDED))) {
                        format(T, $str_alt239$___S_is_a_spec_or_genl_of_each_of, v_term, delete_duplicates(Mapping.mapcar(COOKIE_DATA_SUPPORTER, v_genls), symbol_function(EQUAL), UNPROVIDED, UNPROVIDED, UNPROVIDED));
                    }
                }
                return v_genls;
            }
        }
    }

    /**
     *
     *
     * @return NON-NEGATIVE-INTEGER-P; Score based on terms in TOPIC-STRUCT not in WORD-POSITION
    that share a nearest common isa of type TYPE with TERM.
     */
    public static final SubLObject sibling_score_wrt_nearest_isa_of_type(SubLObject topic_struct, SubLObject word_position, SubLObject v_term, SubLObject type) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject sibling_score = ZERO_INTEGER;
                SubLObject focal_word = topic_struct_word_from_position(topic_struct, word_position);
                SubLObject data = NIL;
                SubLObject state = memoization_state.possibly_new_memoization_state();
                SubLObject local_state = state;
                {
                    SubLObject _prev_bind_0 = memoization_state.$memoization_state$.currentBinding(thread);
                    try {
                        memoization_state.$memoization_state$.bind(local_state, thread);
                        {
                            SubLObject original_memoization_process = memoization_state.aquireMemoStateLock(local_state);
                            try {
                                {
                                    SubLObject _prev_bind_0_94 = $topic_struct$.currentBinding(thread);
                                    try {
                                        $topic_struct$.bind(topic_struct, thread);
                                        {
                                            SubLObject done_count = ZERO_INTEGER;
                                            SubLObject word_count = NIL;
                                            {
                                                SubLObject _prev_bind_0_95 = utilities_macros.$silent_progressP$.currentBinding(thread);
                                                SubLObject _prev_bind_1 = utilities_macros.$last_percent_progress_index$.currentBinding(thread);
                                                SubLObject _prev_bind_2 = utilities_macros.$last_percent_progress_prediction$.currentBinding(thread);
                                                SubLObject _prev_bind_3 = utilities_macros.$within_noting_percent_progress$.currentBinding(thread);
                                                SubLObject _prev_bind_4 = utilities_macros.$percent_progress_start_time$.currentBinding(thread);
                                                try {
                                                    utilities_macros.$silent_progressP$.bind(makeBoolean((NIL != utilities_macros.$silent_progressP$.getDynamicValue(thread)) || true), thread);
                                                    utilities_macros.$last_percent_progress_index$.bind(ZERO_INTEGER, thread);
                                                    utilities_macros.$last_percent_progress_prediction$.bind(NIL, thread);
                                                    utilities_macros.$within_noting_percent_progress$.bind(T, thread);
                                                    utilities_macros.$percent_progress_start_time$.bind(get_universal_time(), thread);
                                                    utilities_macros.noting_percent_progress_preamble(NIL);
                                                    if (NIL != topic_struct_document_p(topic_struct)) {
                                                        {
                                                            SubLObject list_var = NIL;
                                                            SubLObject paragraph_topic_struct = NIL;
                                                            SubLObject paragraph_num = NIL;
                                                            for (list_var = document_topic_struct_paragraph_structs(topic_struct), paragraph_topic_struct = list_var.first(), paragraph_num = ZERO_INTEGER; NIL != list_var; list_var = list_var.rest() , paragraph_topic_struct = list_var.first() , paragraph_num = add(ONE_INTEGER, paragraph_num)) {
                                                                {
                                                                    SubLObject list_var_96 = NIL;
                                                                    SubLObject sentence = NIL;
                                                                    SubLObject sentence_num = NIL;
                                                                    for (list_var_96 = el_utilities.el_list_items(paragraph_topic_struct), sentence = list_var_96.first(), sentence_num = ZERO_INTEGER; NIL != list_var_96; list_var_96 = list_var_96.rest() , sentence = list_var_96.first() , sentence_num = add(ONE_INTEGER, sentence_num)) {
                                                                        {
                                                                            SubLObject list_var_97 = NIL;
                                                                            SubLObject word = NIL;
                                                                            SubLObject word_num = NIL;
                                                                            for (list_var_97 = el_utilities.el_list_items(sentence), word = list_var_97.first(), word_num = ZERO_INTEGER; NIL != list_var_97; list_var_97 = list_var_97.rest() , word = list_var_97.first() , word_num = add(ONE_INTEGER, word_num)) {
                                                                                {
                                                                                    SubLObject subposition = list(sentence_num, word_num);
                                                                                    SubLObject position = cons(paragraph_num, subposition);
                                                                                    if (!word.equal(focal_word)) {
                                                                                        {
                                                                                            SubLObject ambiguity_factor = length(topic_struct_word_denots(word));
                                                                                            SubLObject csome_list_var = topic_struct_word_denots(word);
                                                                                            SubLObject denot = NIL;
                                                                                            for (denot = csome_list_var.first(); NIL != csome_list_var; csome_list_var = csome_list_var.rest() , denot = csome_list_var.first()) {
                                                                                                if (!(denot.equal(v_term) || (NIL != member(denot, data, symbol_function(EQUAL), symbol_function(FIRST))))) {
                                                                                                    thread.resetMultipleValues();
                                                                                                    {
                                                                                                        SubLObject this_score = sibling_score_wrt_nearest_isa_of_type_internal(denot, v_term, type);
                                                                                                        SubLObject common_isas = thread.secondMultipleValue();
                                                                                                        thread.resetMultipleValues();
                                                                                                        if (this_score.isPositive()) {
                                                                                                            {
                                                                                                                SubLObject plist = list(new SubLObject[]{ $SUPPORTER, denot, $RAW_SCORE, this_score, $AMBIGUITY_FACTOR, ambiguity_factor, $FOCAL_POSITION, word_position, $SUPPORTER_POSITION, position, $COMMON_ISAS, common_isas });
                                                                                                                SubLObject plist_score = sibling_plist_score(type, plist, UNPROVIDED);
                                                                                                                sibling_score = add(sibling_score, plist_score);
                                                                                                                data = cons(plist, data);
                                                                                                            }
                                                                                                        }
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                    done_count = add(done_count, ONE_INTEGER);
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    } else {
                                                        {
                                                            SubLObject list_var = NIL;
                                                            SubLObject sentence = NIL;
                                                            SubLObject sentence_num = NIL;
                                                            for (list_var = el_utilities.el_list_items(topic_struct), sentence = list_var.first(), sentence_num = ZERO_INTEGER; NIL != list_var; list_var = list_var.rest() , sentence = list_var.first() , sentence_num = add(ONE_INTEGER, sentence_num)) {
                                                                {
                                                                    SubLObject list_var_98 = NIL;
                                                                    SubLObject word = NIL;
                                                                    SubLObject word_num = NIL;
                                                                    for (list_var_98 = el_utilities.el_list_items(sentence), word = list_var_98.first(), word_num = ZERO_INTEGER; NIL != list_var_98; list_var_98 = list_var_98.rest() , word = list_var_98.first() , word_num = add(ONE_INTEGER, word_num)) {
                                                                        {
                                                                            SubLObject position = list(sentence_num, word_num);
                                                                            if (!word.equal(focal_word)) {
                                                                                {
                                                                                    SubLObject ambiguity_factor = length(topic_struct_word_denots(word));
                                                                                    SubLObject csome_list_var = topic_struct_word_denots(word);
                                                                                    SubLObject denot = NIL;
                                                                                    for (denot = csome_list_var.first(); NIL != csome_list_var; csome_list_var = csome_list_var.rest() , denot = csome_list_var.first()) {
                                                                                        if (!(denot.equal(v_term) || (NIL != member(denot, data, symbol_function(EQUAL), symbol_function(FIRST))))) {
                                                                                            thread.resetMultipleValues();
                                                                                            {
                                                                                                SubLObject this_score = sibling_score_wrt_nearest_isa_of_type_internal(denot, v_term, type);
                                                                                                SubLObject common_isas = thread.secondMultipleValue();
                                                                                                thread.resetMultipleValues();
                                                                                                if (this_score.isPositive()) {
                                                                                                    {
                                                                                                        SubLObject plist = list(new SubLObject[]{ $SUPPORTER, denot, $RAW_SCORE, this_score, $AMBIGUITY_FACTOR, ambiguity_factor, $FOCAL_POSITION, word_position, $SUPPORTER_POSITION, position, $COMMON_ISAS, common_isas });
                                                                                                        SubLObject plist_score = sibling_plist_score(type, plist, UNPROVIDED);
                                                                                                        sibling_score = add(sibling_score, plist_score);
                                                                                                        data = cons(plist, data);
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                }
                                                                            }
                                                                            done_count = add(done_count, ONE_INTEGER);
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                    utilities_macros.noting_percent_progress_postamble();
                                                } finally {
                                                    utilities_macros.$percent_progress_start_time$.rebind(_prev_bind_4, thread);
                                                    utilities_macros.$within_noting_percent_progress$.rebind(_prev_bind_3, thread);
                                                    utilities_macros.$last_percent_progress_prediction$.rebind(_prev_bind_2, thread);
                                                    utilities_macros.$last_percent_progress_index$.rebind(_prev_bind_1, thread);
                                                    utilities_macros.$silent_progressP$.rebind(_prev_bind_0_95, thread);
                                                }
                                            }
                                        }
                                    } finally {
                                        $topic_struct$.rebind(_prev_bind_0_94, thread);
                                    }
                                }
                            } finally {
                                {
                                    SubLObject _prev_bind_0_99 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                    try {
                                        $is_thread_performing_cleanupP$.bind(T, thread);
                                        if ((NIL != local_state) && (NIL == original_memoization_process)) {
                                            memoization_state.memoization_state_set_current_process_internal(local_state, NIL);
                                        }
                                    } finally {
                                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0_99, thread);
                                    }
                                }
                            }
                        }
                    } finally {
                        memoization_state.$memoization_state$.rebind(_prev_bind_0, thread);
                    }
                }
                return values(sibling_score, data);
            }
        }
    }

    /**
     *
     *
     * @return LISTP; Denots of other words in TOPIC-STRUCT that are isas of TERM.
     */
    public static final SubLObject topic_struct_isas(SubLObject topic_struct, SubLObject word_position, SubLObject v_term) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject isas = NIL;
                if (NIL != term.el_fort_p(v_term)) {
                    {
                        SubLObject term_is_collectionP = fort_types_interface.collection_p(v_term);
                        SubLObject generality_estimate = cardinality_estimates.generality_estimate(v_term);
                        SubLObject state = memoization_state.possibly_new_memoization_state();
                        SubLObject local_state = state;
                        {
                            SubLObject _prev_bind_0 = memoization_state.$memoization_state$.currentBinding(thread);
                            try {
                                memoization_state.$memoization_state$.bind(local_state, thread);
                                {
                                    final SubLObject original_memoization_process = memoization_state.aquireMemoStateLock(local_state);
                                    try {
                                        {
                                            SubLObject done_count = ZERO_INTEGER;
                                            SubLObject word_count = NIL;
                                            {
                                                SubLObject _prev_bind_0_100 = utilities_macros.$silent_progressP$.currentBinding(thread);
                                                SubLObject _prev_bind_1 = utilities_macros.$last_percent_progress_index$.currentBinding(thread);
                                                SubLObject _prev_bind_2 = utilities_macros.$last_percent_progress_prediction$.currentBinding(thread);
                                                SubLObject _prev_bind_3 = utilities_macros.$within_noting_percent_progress$.currentBinding(thread);
                                                SubLObject _prev_bind_4 = utilities_macros.$percent_progress_start_time$.currentBinding(thread);
                                                try {
                                                    utilities_macros.$silent_progressP$.bind(makeBoolean((NIL != utilities_macros.$silent_progressP$.getDynamicValue(thread)) || true), thread);
                                                    utilities_macros.$last_percent_progress_index$.bind(ZERO_INTEGER, thread);
                                                    utilities_macros.$last_percent_progress_prediction$.bind(NIL, thread);
                                                    utilities_macros.$within_noting_percent_progress$.bind(T, thread);
                                                    utilities_macros.$percent_progress_start_time$.bind(get_universal_time(), thread);
                                                    utilities_macros.noting_percent_progress_preamble(NIL);
                                                    if (NIL != topic_struct_document_p(topic_struct)) {
                                                        {
                                                            SubLObject list_var = NIL;
                                                            SubLObject paragraph_topic_struct = NIL;
                                                            SubLObject paragraph_num = NIL;
                                                            for (list_var = document_topic_struct_paragraph_structs(topic_struct), paragraph_topic_struct = list_var.first(), paragraph_num = ZERO_INTEGER; NIL != list_var; list_var = list_var.rest() , paragraph_topic_struct = list_var.first() , paragraph_num = add(ONE_INTEGER, paragraph_num)) {
                                                                {
                                                                    SubLObject list_var_101 = NIL;
                                                                    SubLObject sentence = NIL;
                                                                    SubLObject sentence_num = NIL;
                                                                    for (list_var_101 = el_utilities.el_list_items(paragraph_topic_struct), sentence = list_var_101.first(), sentence_num = ZERO_INTEGER; NIL != list_var_101; list_var_101 = list_var_101.rest() , sentence = list_var_101.first() , sentence_num = add(ONE_INTEGER, sentence_num)) {
                                                                        {
                                                                            SubLObject list_var_102 = NIL;
                                                                            SubLObject word = NIL;
                                                                            SubLObject word_num = NIL;
                                                                            for (list_var_102 = el_utilities.el_list_items(sentence), word = list_var_102.first(), word_num = ZERO_INTEGER; NIL != list_var_102; list_var_102 = list_var_102.rest() , word = list_var_102.first() , word_num = add(ONE_INTEGER, word_num)) {
                                                                                {
                                                                                    SubLObject subposition = list(sentence_num, word_num);
                                                                                    SubLObject position = cons(paragraph_num, subposition);
                                                                                    if (!(position.equal(word_position) || (NIL == topic_struct_word_denots(word)))) {
                                                                                        {
                                                                                            SubLObject ambiguity_factor = length(topic_struct_word_denots(word));
                                                                                            SubLObject csome_list_var = topic_struct_word_denots(word);
                                                                                            SubLObject denot = NIL;
                                                                                            for (denot = csome_list_var.first(); NIL != csome_list_var; csome_list_var = csome_list_var.rest() , denot = csome_list_var.first()) {
                                                                                                {
                                                                                                    SubLObject upward_matchP = makeBoolean((NIL != term.el_fort_p(denot)) && (NIL != isa.isaP(v_term, denot, UNPROVIDED, UNPROVIDED)));
                                                                                                    SubLObject downward_matchP = makeBoolean(((NIL == upward_matchP) && (NIL != term_is_collectionP)) && (NIL != isa.isaP(denot, v_term, UNPROVIDED, UNPROVIDED)));
                                                                                                    if ((NIL != upward_matchP) || (NIL != downward_matchP)) {
                                                                                                        {
                                                                                                            SubLObject supporter_generality = cardinality_estimates.generality_estimate(denot);
                                                                                                            SubLObject plist = list(new SubLObject[]{ $SUPPORTER, denot, $SUPPORTER_GENERALITY, supporter_generality, $TERM_GENERALITY, generality_estimate, $kw87$SUPPORTER_MORE_GENERAL_, downward_matchP, $AMBIGUITY_FACTOR, ambiguity_factor, $FOCAL_POSITION, word_position, $SUPPORTER_POSITION, position });
                                                                                                            SubLObject score = isa_count_plist_score(plist, UNPROVIDED);
                                                                                                            plist = putf(plist, $SCORE, score);
                                                                                                            isas = cons(plist, isas);
                                                                                                        }
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                    done_count = add(done_count, ONE_INTEGER);
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    } else {
                                                        {
                                                            SubLObject list_var = NIL;
                                                            SubLObject sentence = NIL;
                                                            SubLObject sentence_num = NIL;
                                                            for (list_var = el_utilities.el_list_items(topic_struct), sentence = list_var.first(), sentence_num = ZERO_INTEGER; NIL != list_var; list_var = list_var.rest() , sentence = list_var.first() , sentence_num = add(ONE_INTEGER, sentence_num)) {
                                                                {
                                                                    SubLObject list_var_103 = NIL;
                                                                    SubLObject word = NIL;
                                                                    SubLObject word_num = NIL;
                                                                    for (list_var_103 = el_utilities.el_list_items(sentence), word = list_var_103.first(), word_num = ZERO_INTEGER; NIL != list_var_103; list_var_103 = list_var_103.rest() , word = list_var_103.first() , word_num = add(ONE_INTEGER, word_num)) {
                                                                        {
                                                                            SubLObject position = list(sentence_num, word_num);
                                                                            if (!(position.equal(word_position) || (NIL == topic_struct_word_denots(word)))) {
                                                                                {
                                                                                    SubLObject ambiguity_factor = length(topic_struct_word_denots(word));
                                                                                    SubLObject csome_list_var = topic_struct_word_denots(word);
                                                                                    SubLObject denot = NIL;
                                                                                    for (denot = csome_list_var.first(); NIL != csome_list_var; csome_list_var = csome_list_var.rest() , denot = csome_list_var.first()) {
                                                                                        {
                                                                                            SubLObject upward_matchP = makeBoolean((NIL != term.el_fort_p(denot)) && (NIL != isa.isaP(v_term, denot, UNPROVIDED, UNPROVIDED)));
                                                                                            SubLObject downward_matchP = makeBoolean(((NIL == upward_matchP) && (NIL != term_is_collectionP)) && (NIL != isa.isaP(denot, v_term, UNPROVIDED, UNPROVIDED)));
                                                                                            if ((NIL != upward_matchP) || (NIL != downward_matchP)) {
                                                                                                {
                                                                                                    SubLObject supporter_generality = cardinality_estimates.generality_estimate(denot);
                                                                                                    SubLObject plist = list(new SubLObject[]{ $SUPPORTER, denot, $SUPPORTER_GENERALITY, supporter_generality, $TERM_GENERALITY, generality_estimate, $kw87$SUPPORTER_MORE_GENERAL_, downward_matchP, $AMBIGUITY_FACTOR, ambiguity_factor, $FOCAL_POSITION, word_position, $SUPPORTER_POSITION, position });
                                                                                                    SubLObject score = isa_count_plist_score(plist, UNPROVIDED);
                                                                                                    plist = putf(plist, $SCORE, score);
                                                                                                    isas = cons(plist, isas);
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                }
                                                                            }
                                                                            done_count = add(done_count, ONE_INTEGER);
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                    utilities_macros.noting_percent_progress_postamble();
                                                } finally {
                                                    utilities_macros.$percent_progress_start_time$.rebind(_prev_bind_4, thread);
                                                    utilities_macros.$within_noting_percent_progress$.rebind(_prev_bind_3, thread);
                                                    utilities_macros.$last_percent_progress_prediction$.rebind(_prev_bind_2, thread);
                                                    utilities_macros.$last_percent_progress_index$.rebind(_prev_bind_1, thread);
                                                    utilities_macros.$silent_progressP$.rebind(_prev_bind_0_100, thread);
                                                }
                                            }
                                        }
                                    } finally {
                                        {
                                            SubLObject _prev_bind_0_104 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                            try {
                                                $is_thread_performing_cleanupP$.bind(T, thread);
                                                if ((NIL != local_state) && (NIL == original_memoization_process)) {
                                                    memoization_state.memoization_state_set_current_process_internal(local_state, NIL);
                                                }
                                            } finally {
                                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0_104, thread);
                                            }
                                        }
                                    }
                                }
                            } finally {
                                memoization_state.$memoization_state$.rebind(_prev_bind_0, thread);
                            }
                        }
                    }
                    if ((NIL != topic_struct_verboseP()) && (NIL != list_utilities.lengthG(isas, ZERO_INTEGER, UNPROVIDED))) {
                        format(T, $str_alt242$___S_is_all_of____S__, v_term, delete_duplicates(Mapping.mapcar(COOKIE_DATA_SUPPORTER, isas), symbol_function(EQUAL), UNPROVIDED, UNPROVIDED, UNPROVIDED));
                    }
                }
                return isas;
            }
        }
    }

    /**
     *
     *
     * @return LISTP; of denots from other words in TOPIC-STRUCT that are conceptually related to TERM.
     */
    public static final SubLObject topic_struct_conceptually_related_denots(SubLObject topic_struct, SubLObject word_position, SubLObject v_term) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject data = NIL;
                SubLObject word_path = butlast(word_position, UNPROVIDED);
                SubLObject word_index = list_utilities.last_one(word_position);
                SubLObject sentence_index = list_utilities.last_one(word_path);
                SubLObject verboseP = topic_struct_verboseP();
                SubLObject time = ZERO_INTEGER;
                if (topic_struct_check_conceptually_relatedP().isPositive() && (NIL != forts.fort_p(v_term))) {
                    if (NIL != verboseP) {
                        Errors.warn($str_alt243$Looking_for_denots_conceptually_r, v_term, topic_struct_word_from_position(topic_struct, word_position));
                    }
                    {
                        SubLObject time_var = get_internal_real_time();
                        {
                            SubLObject state = memoization_state.possibly_new_memoization_state();
                            SubLObject local_state = state;
                            {
                                SubLObject _prev_bind_0 = memoization_state.$memoization_state$.currentBinding(thread);
                                try {
                                    memoization_state.$memoization_state$.bind(local_state, thread);
                                    {
                                        final SubLObject original_memoization_process = memoization_state.aquireMemoStateLock(local_state);
                                        try {
                                            {
                                                SubLObject done_count = ZERO_INTEGER;
                                                SubLObject word_count = NIL;
                                                {
                                                    SubLObject _prev_bind_0_105 = utilities_macros.$silent_progressP$.currentBinding(thread);
                                                    SubLObject _prev_bind_1 = utilities_macros.$last_percent_progress_index$.currentBinding(thread);
                                                    SubLObject _prev_bind_2 = utilities_macros.$last_percent_progress_prediction$.currentBinding(thread);
                                                    SubLObject _prev_bind_3 = utilities_macros.$within_noting_percent_progress$.currentBinding(thread);
                                                    SubLObject _prev_bind_4 = utilities_macros.$percent_progress_start_time$.currentBinding(thread);
                                                    try {
                                                        utilities_macros.$silent_progressP$.bind(makeBoolean((NIL != utilities_macros.$silent_progressP$.getDynamicValue(thread)) || true), thread);
                                                        utilities_macros.$last_percent_progress_index$.bind(ZERO_INTEGER, thread);
                                                        utilities_macros.$last_percent_progress_prediction$.bind(NIL, thread);
                                                        utilities_macros.$within_noting_percent_progress$.bind(T, thread);
                                                        utilities_macros.$percent_progress_start_time$.bind(get_universal_time(), thread);
                                                        utilities_macros.noting_percent_progress_preamble(NIL);
                                                        if (NIL != topic_struct_document_p(topic_struct)) {
                                                            {
                                                                SubLObject list_var = NIL;
                                                                SubLObject paragraph_topic_struct = NIL;
                                                                SubLObject paragraph_num = NIL;
                                                                for (list_var = document_topic_struct_paragraph_structs(topic_struct), paragraph_topic_struct = list_var.first(), paragraph_num = ZERO_INTEGER; NIL != list_var; list_var = list_var.rest() , paragraph_topic_struct = list_var.first() , paragraph_num = add(ONE_INTEGER, paragraph_num)) {
                                                                    {
                                                                        SubLObject list_var_106 = NIL;
                                                                        SubLObject sentence = NIL;
                                                                        SubLObject sentence_num = NIL;
                                                                        for (list_var_106 = el_utilities.el_list_items(paragraph_topic_struct), sentence = list_var_106.first(), sentence_num = ZERO_INTEGER; NIL != list_var_106; list_var_106 = list_var_106.rest() , sentence = list_var_106.first() , sentence_num = add(ONE_INTEGER, sentence_num)) {
                                                                            {
                                                                                SubLObject list_var_107 = NIL;
                                                                                SubLObject word = NIL;
                                                                                SubLObject word_num = NIL;
                                                                                for (list_var_107 = el_utilities.el_list_items(sentence), word = list_var_107.first(), word_num = ZERO_INTEGER; NIL != list_var_107; list_var_107 = list_var_107.rest() , word = list_var_107.first() , word_num = add(ONE_INTEGER, word_num)) {
                                                                                    {
                                                                                        SubLObject subposition = list(sentence_num, word_num);
                                                                                        SubLObject position = cons(paragraph_num, subposition);
                                                                                        SubLObject path = butlast(position, UNPROVIDED);
                                                                                        SubLObject index = list_utilities.last_one(position);
                                                                                        SubLObject sentence_num_108 = list_utilities.last_one(path);
                                                                                        SubLObject sentence_distance = abs(subtract(sentence_num_108, sentence_index));
                                                                                        SubLObject word_distance = abs(subtract(index, word_index));
                                                                                        SubLObject ambiguity_factor = length(topic_struct_word_denots(word));
                                                                                        SubLObject concepts = NIL;
                                                                                        if ((sentence_distance.numLE(topic_struct_conceptually_related_max_sentence_distance()) && word_distance.numG(ZERO_INTEGER)) && word_distance.numLE(topic_struct_conceptually_related_max_word_distance())) {
                                                                                            {
                                                                                                SubLObject cdolist_list_var = topic_struct_word_denots(word);
                                                                                                SubLObject denot = NIL;
                                                                                                for (denot = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , denot = cdolist_list_var.first()) {
                                                                                                    if ((((NIL != forts.fort_p(denot)) && (!v_term.eql(denot))) && (NIL == subl_promotions.memberP(denot, concepts, symbol_function(EQL), UNPROVIDED))) && ((NIL != topic_struct_conceptually_relatedP(v_term, denot, mt_relevance_macros.$mt$.getDynamicValue(thread))) || (NIL != topic_struct_conceptually_relatedP(denot, v_term, mt_relevance_macros.$mt$.getDynamicValue(thread))))) {
                                                                                                        {
                                                                                                            SubLObject generality_estimate = cardinality_estimates.generality_estimate(denot);
                                                                                                            data = cons(list(new SubLObject[]{ $SUPPORTER, denot, $SUPPORTER_GENERALITY, generality_estimate, $AMBIGUITY_FACTOR, ambiguity_factor, $FOCAL_POSITION, word_position, $SUPPORTER_POSITION, position }), data);
                                                                                                            if (NIL != verboseP) {
                                                                                                                format(T, $str_alt244$___S_is_conceptually_related_to__, new SubLObject[]{ v_term, denot, word });
                                                                                                            }
                                                                                                        }
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                        done_count = add(done_count, ONE_INTEGER);
                                                                                    }
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        } else {
                                                            {
                                                                SubLObject list_var = NIL;
                                                                SubLObject sentence = NIL;
                                                                SubLObject sentence_num = NIL;
                                                                for (list_var = el_utilities.el_list_items(topic_struct), sentence = list_var.first(), sentence_num = ZERO_INTEGER; NIL != list_var; list_var = list_var.rest() , sentence = list_var.first() , sentence_num = add(ONE_INTEGER, sentence_num)) {
                                                                    {
                                                                        SubLObject list_var_109 = NIL;
                                                                        SubLObject word = NIL;
                                                                        SubLObject word_num = NIL;
                                                                        for (list_var_109 = el_utilities.el_list_items(sentence), word = list_var_109.first(), word_num = ZERO_INTEGER; NIL != list_var_109; list_var_109 = list_var_109.rest() , word = list_var_109.first() , word_num = add(ONE_INTEGER, word_num)) {
                                                                            {
                                                                                SubLObject position = list(sentence_num, word_num);
                                                                                SubLObject path = butlast(position, UNPROVIDED);
                                                                                SubLObject index = list_utilities.last_one(position);
                                                                                SubLObject sentence_num_110 = list_utilities.last_one(path);
                                                                                SubLObject sentence_distance = abs(subtract(sentence_num_110, sentence_index));
                                                                                SubLObject word_distance = abs(subtract(index, word_index));
                                                                                SubLObject ambiguity_factor = length(topic_struct_word_denots(word));
                                                                                SubLObject concepts = NIL;
                                                                                if ((sentence_distance.numLE(topic_struct_conceptually_related_max_sentence_distance()) && word_distance.numG(ZERO_INTEGER)) && word_distance.numLE(topic_struct_conceptually_related_max_word_distance())) {
                                                                                    {
                                                                                        SubLObject cdolist_list_var = topic_struct_word_denots(word);
                                                                                        SubLObject denot = NIL;
                                                                                        for (denot = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , denot = cdolist_list_var.first()) {
                                                                                            if ((((NIL != forts.fort_p(denot)) && (!v_term.eql(denot))) && (NIL == subl_promotions.memberP(denot, concepts, symbol_function(EQL), UNPROVIDED))) && ((NIL != topic_struct_conceptually_relatedP(v_term, denot, mt_relevance_macros.$mt$.getDynamicValue(thread))) || (NIL != topic_struct_conceptually_relatedP(denot, v_term, mt_relevance_macros.$mt$.getDynamicValue(thread))))) {
                                                                                                {
                                                                                                    SubLObject generality_estimate = cardinality_estimates.generality_estimate(denot);
                                                                                                    data = cons(list(new SubLObject[]{ $SUPPORTER, denot, $SUPPORTER_GENERALITY, generality_estimate, $AMBIGUITY_FACTOR, ambiguity_factor, $FOCAL_POSITION, word_position, $SUPPORTER_POSITION, position }), data);
                                                                                                    if (NIL != verboseP) {
                                                                                                        format(T, $str_alt244$___S_is_conceptually_related_to__, new SubLObject[]{ v_term, denot, word });
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                }
                                                                                done_count = add(done_count, ONE_INTEGER);
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                        utilities_macros.noting_percent_progress_postamble();
                                                    } finally {
                                                        utilities_macros.$percent_progress_start_time$.rebind(_prev_bind_4, thread);
                                                        utilities_macros.$within_noting_percent_progress$.rebind(_prev_bind_3, thread);
                                                        utilities_macros.$last_percent_progress_prediction$.rebind(_prev_bind_2, thread);
                                                        utilities_macros.$last_percent_progress_index$.rebind(_prev_bind_1, thread);
                                                        utilities_macros.$silent_progressP$.rebind(_prev_bind_0_105, thread);
                                                    }
                                                }
                                            }
                                        } finally {
                                            {
                                                SubLObject _prev_bind_0_111 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                try {
                                                    $is_thread_performing_cleanupP$.bind(T, thread);
                                                    if ((NIL != local_state) && (NIL == original_memoization_process)) {
                                                        memoization_state.memoization_state_set_current_process_internal(local_state, NIL);
                                                    }
                                                } finally {
                                                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_111, thread);
                                                }
                                            }
                                        }
                                    }
                                } finally {
                                    memoization_state.$memoization_state$.rebind(_prev_bind_0, thread);
                                }
                            }
                        }
                        time = divide(subtract(get_internal_real_time(), time_var), time_high.$internal_time_units_per_second$.getGlobalValue());
                    }
                    if (NIL != verboseP) {
                        Errors.warn($str_alt245$Spent__S_seconds_searching_for_de, time, v_term);
                    }
                }
                return data;
            }
        }
    }

    public static final SubLObject annotate_topic_struct_from_file(SubLObject file, SubLObject ambiguous_word_number) {
        if (ambiguous_word_number == UNPROVIDED) {
            ambiguous_word_number = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                if (NIL == Filesys.probe_file(file)) {
                    Errors.error($str_alt246$Couldn_t_find_file____S, file);
                }
            }
            {
                SubLObject doneP = NIL;
                SubLObject struct = cfasl_utilities.cfasl_load(file);
                SubLObject sofar = ZERO_INTEGER;
                SubLObject total = count_topic_struct_ambiguous_words(struct, UNPROVIDED);
                SubLObject previous_choices = dictionary.new_dictionary(symbol_function(EQUAL), UNPROVIDED);
                SubLObject done_count = ZERO_INTEGER;
                SubLObject word_count = NIL;
                {
                    SubLObject _prev_bind_0 = utilities_macros.$silent_progressP$.currentBinding(thread);
                    SubLObject _prev_bind_1 = utilities_macros.$last_percent_progress_index$.currentBinding(thread);
                    SubLObject _prev_bind_2 = utilities_macros.$last_percent_progress_prediction$.currentBinding(thread);
                    SubLObject _prev_bind_3 = utilities_macros.$within_noting_percent_progress$.currentBinding(thread);
                    SubLObject _prev_bind_4 = utilities_macros.$percent_progress_start_time$.currentBinding(thread);
                    try {
                        utilities_macros.$silent_progressP$.bind(makeBoolean((NIL != utilities_macros.$silent_progressP$.getDynamicValue(thread)) || true), thread);
                        utilities_macros.$last_percent_progress_index$.bind(ZERO_INTEGER, thread);
                        utilities_macros.$last_percent_progress_prediction$.bind(NIL, thread);
                        utilities_macros.$within_noting_percent_progress$.bind(T, thread);
                        utilities_macros.$percent_progress_start_time$.bind(get_universal_time(), thread);
                        utilities_macros.noting_percent_progress_preamble(NIL);
                        if (NIL != topic_struct_document_p(struct)) {
                            {
                                SubLObject list_var = NIL;
                                SubLObject paragraph_topic_struct = NIL;
                                SubLObject paragraph_num = NIL;
                                for (list_var = document_topic_struct_paragraph_structs(struct), paragraph_topic_struct = list_var.first(), paragraph_num = ZERO_INTEGER; NIL != list_var; list_var = list_var.rest() , paragraph_topic_struct = list_var.first() , paragraph_num = add(ONE_INTEGER, paragraph_num)) {
                                    {
                                        SubLObject list_var_112 = NIL;
                                        SubLObject sentence = NIL;
                                        SubLObject sentence_num = NIL;
                                        for (list_var_112 = el_utilities.el_list_items(paragraph_topic_struct), sentence = list_var_112.first(), sentence_num = ZERO_INTEGER; NIL != list_var_112; list_var_112 = list_var_112.rest() , sentence = list_var_112.first() , sentence_num = add(ONE_INTEGER, sentence_num)) {
                                            {
                                                SubLObject list_var_113 = NIL;
                                                SubLObject word = NIL;
                                                SubLObject word_num = NIL;
                                                for (list_var_113 = el_utilities.el_list_items(sentence), word = list_var_113.first(), word_num = ZERO_INTEGER; NIL != list_var_113; list_var_113 = list_var_113.rest() , word = list_var_113.first() , word_num = add(ONE_INTEGER, word_num)) {
                                                    {
                                                        SubLObject subposition = list(sentence_num, word_num);
                                                        SubLObject position = cons(paragraph_num, subposition);
                                                        if (NIL == doneP) {
                                                            if (NIL != topic_struct_word_ambiguous_p(word, UNPROVIDED)) {
                                                                sofar = add(sofar, ONE_INTEGER);
                                                                if ((NIL == ambiguous_word_number) || sofar.eql(ambiguous_word_number)) {
                                                                    {
                                                                        SubLObject instruction = (NIL != ambiguous_word_number) ? ((SubLObject) ($REDO)) : nth(FIVE_INTEGER, word);
                                                                        SubLObject pcase_var = instruction;
                                                                        if (pcase_var.eql($VERIFY) || pcase_var.eql($ANNOTATE)) {
                                                                            thread.resetMultipleValues();
                                                                            {
                                                                                SubLObject revised_word = verify_topic_struct_word(word, struct, position, previous_choices, sofar, total);
                                                                                SubLObject quitP = thread.secondMultipleValue();
                                                                                thread.resetMultipleValues();
                                                                                if (NIL != quitP) {
                                                                                    doneP = T;
                                                                                }
                                                                            }
                                                                        } else
                                                                            if (pcase_var.eql($REDO_ME)) {
                                                                                thread.resetMultipleValues();
                                                                                {
                                                                                    SubLObject revised_word = redo_topic_struct_word(word, struct, position, previous_choices, sofar, total);
                                                                                    SubLObject quitP = thread.secondMultipleValue();
                                                                                    thread.resetMultipleValues();
                                                                                    if (NIL != quitP) {
                                                                                        doneP = T;
                                                                                    }
                                                                                }
                                                                            }

                                                                    }
                                                                }
                                                                remember_topic_struct_choice(word, previous_choices);
                                                                save_topic_struct_to_file(struct, file);
                                                            }
                                                        }
                                                        done_count = add(done_count, ONE_INTEGER);
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        } else {
                            {
                                SubLObject list_var = NIL;
                                SubLObject sentence = NIL;
                                SubLObject sentence_num = NIL;
                                for (list_var = el_utilities.el_list_items(struct), sentence = list_var.first(), sentence_num = ZERO_INTEGER; NIL != list_var; list_var = list_var.rest() , sentence = list_var.first() , sentence_num = add(ONE_INTEGER, sentence_num)) {
                                    {
                                        SubLObject list_var_114 = NIL;
                                        SubLObject word = NIL;
                                        SubLObject word_num = NIL;
                                        for (list_var_114 = el_utilities.el_list_items(sentence), word = list_var_114.first(), word_num = ZERO_INTEGER; NIL != list_var_114; list_var_114 = list_var_114.rest() , word = list_var_114.first() , word_num = add(ONE_INTEGER, word_num)) {
                                            {
                                                SubLObject position = list(sentence_num, word_num);
                                                if (NIL == doneP) {
                                                    if (NIL != topic_struct_word_ambiguous_p(word, UNPROVIDED)) {
                                                        sofar = add(sofar, ONE_INTEGER);
                                                        if ((NIL == ambiguous_word_number) || sofar.eql(ambiguous_word_number)) {
                                                            {
                                                                SubLObject instruction = (NIL != ambiguous_word_number) ? ((SubLObject) ($REDO)) : nth(FIVE_INTEGER, word);
                                                                SubLObject pcase_var = instruction;
                                                                if (pcase_var.eql($VERIFY) || pcase_var.eql($ANNOTATE)) {
                                                                    thread.resetMultipleValues();
                                                                    {
                                                                        SubLObject revised_word = verify_topic_struct_word(word, struct, position, previous_choices, sofar, total);
                                                                        SubLObject quitP = thread.secondMultipleValue();
                                                                        thread.resetMultipleValues();
                                                                        if (NIL != quitP) {
                                                                            doneP = T;
                                                                        }
                                                                    }
                                                                } else
                                                                    if (pcase_var.eql($REDO_ME)) {
                                                                        thread.resetMultipleValues();
                                                                        {
                                                                            SubLObject revised_word = redo_topic_struct_word(word, struct, position, previous_choices, sofar, total);
                                                                            SubLObject quitP = thread.secondMultipleValue();
                                                                            thread.resetMultipleValues();
                                                                            if (NIL != quitP) {
                                                                                doneP = T;
                                                                            }
                                                                        }
                                                                    }

                                                            }
                                                        }
                                                        remember_topic_struct_choice(word, previous_choices);
                                                        save_topic_struct_to_file(struct, file);
                                                    }
                                                }
                                                done_count = add(done_count, ONE_INTEGER);
                                            }
                                        }
                                    }
                                }
                            }
                        }
                        utilities_macros.noting_percent_progress_postamble();
                    } finally {
                        utilities_macros.$percent_progress_start_time$.rebind(_prev_bind_4, thread);
                        utilities_macros.$within_noting_percent_progress$.rebind(_prev_bind_3, thread);
                        utilities_macros.$last_percent_progress_prediction$.rebind(_prev_bind_2, thread);
                        utilities_macros.$last_percent_progress_index$.rebind(_prev_bind_1, thread);
                        utilities_macros.$silent_progressP$.rebind(_prev_bind_0, thread);
                    }
                }
                dictionary.clear_dictionary(previous_choices);
            }
            return file;
        }
    }

    /**
     * Remember in DICTIONARY the choice made for WORD.
     */
    public static final SubLObject remember_topic_struct_choice(SubLObject word, SubLObject v_dictionary) {
        dictionary.dictionary_enter(v_dictionary, subseq(word, ONE_INTEGER, THREE_INTEGER), subseq(word, THREE_INTEGER, FIVE_INTEGER));
        return v_dictionary;
    }

    /**
     * Look in DICTIONARY for the previous choice made for WORD.
     */
    public static final SubLObject retrieve_previous_topic_struct_choice(SubLObject word, SubLObject v_dictionary) {
        {
            SubLObject entry = dictionary.dictionary_lookup_without_values(v_dictionary, subseq(word, ONE_INTEGER, THREE_INTEGER), UNPROVIDED);
            SubLObject ans = NIL;
            if ((NIL != entry) && (NIL != list_utilities.sets_equalP(entry.first(), nth(THREE_INTEGER, word), UNPROVIDED))) {
                ans = second(entry);
            }
            return ans;
        }
    }

    public static final SubLObject copy_topic_struct_files_to_subdirectory(SubLObject directory, SubLObject subdirectory_name) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject subdirectory = file_utilities.relative_filename(directory, subdirectory_name, UNPROVIDED);
                if (NIL == Filesys.directory_p(subdirectory)) {
                    Filesys.make_directory(subdirectory, UNPROVIDED, UNPROVIDED);
                }
                SubLTrampolineFile.checkType(directory, DIRECTORY_P);
                {
                    SubLObject directory_contents_var = Filesys.directory(directory, T);
                    SubLObject progress_message_var = NIL;
                    {
                        SubLObject _prev_bind_0 = utilities_macros.$silent_progressP$.currentBinding(thread);
                        try {
                            utilities_macros.$silent_progressP$.bind(makeBoolean(!progress_message_var.isString()), thread);
                            {
                                SubLObject list_var = directory_contents_var;
                                utilities_macros.$progress_note$.setDynamicValue(progress_message_var, thread);
                                utilities_macros.$progress_start_time$.setDynamicValue(get_universal_time(), thread);
                                utilities_macros.$progress_total$.setDynamicValue(length(list_var), thread);
                                utilities_macros.$progress_sofar$.setDynamicValue(ZERO_INTEGER, thread);
                                {
                                    SubLObject _prev_bind_0_115 = utilities_macros.$last_percent_progress_index$.currentBinding(thread);
                                    SubLObject _prev_bind_1 = utilities_macros.$last_percent_progress_prediction$.currentBinding(thread);
                                    SubLObject _prev_bind_2 = utilities_macros.$within_noting_percent_progress$.currentBinding(thread);
                                    SubLObject _prev_bind_3 = utilities_macros.$percent_progress_start_time$.currentBinding(thread);
                                    try {
                                        utilities_macros.$last_percent_progress_index$.bind(ZERO_INTEGER, thread);
                                        utilities_macros.$last_percent_progress_prediction$.bind(NIL, thread);
                                        utilities_macros.$within_noting_percent_progress$.bind(T, thread);
                                        utilities_macros.$percent_progress_start_time$.bind(get_universal_time(), thread);
                                        utilities_macros.noting_percent_progress_preamble(utilities_macros.$progress_note$.getDynamicValue(thread));
                                        {
                                            SubLObject csome_list_var = list_var;
                                            SubLObject file = NIL;
                                            for (file = csome_list_var.first(); NIL != csome_list_var; csome_list_var = csome_list_var.rest() , file = csome_list_var.first()) {
                                                utilities_macros.note_percent_progress(utilities_macros.$progress_sofar$.getDynamicValue(thread), utilities_macros.$progress_total$.getDynamicValue(thread));
                                                utilities_macros.$progress_sofar$.setDynamicValue(add(utilities_macros.$progress_sofar$.getDynamicValue(thread), ONE_INTEGER), thread);
                                                if (NIL != string_utilities.ends_with(file, $str_alt252$_topic_struct_cfasl, UNPROVIDED)) {
                                                    {
                                                        SubLObject local_name = nth_value_step_2(nth_value_step_1(ONE_INTEGER), file_utilities.deconstruct_path(file));
                                                        SubLObject destination = file_utilities.relative_filename(subdirectory, local_name, UNPROVIDED);
                                                        if (NIL == Filesys.probe_file(destination)) {
                                                            {
                                                                SubLObject struct = cfasl_utilities.cfasl_load(file);
                                                                prepare_topic_struct_for_annotation(struct);
                                                                save_topic_struct_to_file(struct, destination);
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                        utilities_macros.noting_percent_progress_postamble();
                                    } finally {
                                        utilities_macros.$percent_progress_start_time$.rebind(_prev_bind_3, thread);
                                        utilities_macros.$within_noting_percent_progress$.rebind(_prev_bind_2, thread);
                                        utilities_macros.$last_percent_progress_prediction$.rebind(_prev_bind_1, thread);
                                        utilities_macros.$last_percent_progress_index$.rebind(_prev_bind_0_115, thread);
                                    }
                                }
                            }
                        } finally {
                            utilities_macros.$silent_progressP$.rebind(_prev_bind_0, thread);
                        }
                    }
                }
                return subdirectory;
            }
        }
    }

    public static final SubLObject prepare_topic_struct_for_annotation(SubLObject struct) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject done_count = ZERO_INTEGER;
                SubLObject word_count = NIL;
                {
                    SubLObject _prev_bind_0 = utilities_macros.$silent_progressP$.currentBinding(thread);
                    SubLObject _prev_bind_1 = utilities_macros.$last_percent_progress_index$.currentBinding(thread);
                    SubLObject _prev_bind_2 = utilities_macros.$last_percent_progress_prediction$.currentBinding(thread);
                    SubLObject _prev_bind_3 = utilities_macros.$within_noting_percent_progress$.currentBinding(thread);
                    SubLObject _prev_bind_4 = utilities_macros.$percent_progress_start_time$.currentBinding(thread);
                    try {
                        utilities_macros.$silent_progressP$.bind(makeBoolean((NIL != utilities_macros.$silent_progressP$.getDynamicValue(thread)) || true), thread);
                        utilities_macros.$last_percent_progress_index$.bind(ZERO_INTEGER, thread);
                        utilities_macros.$last_percent_progress_prediction$.bind(NIL, thread);
                        utilities_macros.$within_noting_percent_progress$.bind(T, thread);
                        utilities_macros.$percent_progress_start_time$.bind(get_universal_time(), thread);
                        utilities_macros.noting_percent_progress_preamble(NIL);
                        if (NIL != topic_struct_document_p(struct)) {
                            {
                                SubLObject list_var = NIL;
                                SubLObject paragraph_topic_struct = NIL;
                                SubLObject paragraph_num = NIL;
                                for (list_var = document_topic_struct_paragraph_structs(struct), paragraph_topic_struct = list_var.first(), paragraph_num = ZERO_INTEGER; NIL != list_var; list_var = list_var.rest() , paragraph_topic_struct = list_var.first() , paragraph_num = add(ONE_INTEGER, paragraph_num)) {
                                    {
                                        SubLObject list_var_116 = NIL;
                                        SubLObject sentence = NIL;
                                        SubLObject sentence_num = NIL;
                                        for (list_var_116 = el_utilities.el_list_items(paragraph_topic_struct), sentence = list_var_116.first(), sentence_num = ZERO_INTEGER; NIL != list_var_116; list_var_116 = list_var_116.rest() , sentence = list_var_116.first() , sentence_num = add(ONE_INTEGER, sentence_num)) {
                                            {
                                                SubLObject list_var_117 = NIL;
                                                SubLObject word = NIL;
                                                SubLObject word_num = NIL;
                                                for (list_var_117 = el_utilities.el_list_items(sentence), word = list_var_117.first(), word_num = ZERO_INTEGER; NIL != list_var_117; list_var_117 = list_var_117.rest() , word = list_var_117.first() , word_num = add(ONE_INTEGER, word_num)) {
                                                    {
                                                        SubLObject subposition = list(sentence_num, word_num);
                                                        SubLObject position = cons(paragraph_num, subposition);
                                                        if (NIL != topic_struct_word_ambiguous_p(word, UNPROVIDED)) {
                                                            if (NIL != list_utilities.lengthE(word, FIVE_INTEGER, UNPROVIDED)) {
                                                                list_utilities.nadd_to_end($ANNOTATE, word);
                                                            } else
                                                                if (nth(FIVE_INTEGER, word) == $ANNOTATE) {
                                                                } else {
                                                                    set_nth(FIVE_INTEGER, word, $ANNOTATE);
                                                                }

                                                        }
                                                        done_count = add(done_count, ONE_INTEGER);
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        } else {
                            {
                                SubLObject list_var = NIL;
                                SubLObject sentence = NIL;
                                SubLObject sentence_num = NIL;
                                for (list_var = el_utilities.el_list_items(struct), sentence = list_var.first(), sentence_num = ZERO_INTEGER; NIL != list_var; list_var = list_var.rest() , sentence = list_var.first() , sentence_num = add(ONE_INTEGER, sentence_num)) {
                                    {
                                        SubLObject list_var_118 = NIL;
                                        SubLObject word = NIL;
                                        SubLObject word_num = NIL;
                                        for (list_var_118 = el_utilities.el_list_items(sentence), word = list_var_118.first(), word_num = ZERO_INTEGER; NIL != list_var_118; list_var_118 = list_var_118.rest() , word = list_var_118.first() , word_num = add(ONE_INTEGER, word_num)) {
                                            {
                                                SubLObject position = list(sentence_num, word_num);
                                                if (NIL != topic_struct_word_ambiguous_p(word, UNPROVIDED)) {
                                                    if (NIL != list_utilities.lengthE(word, FIVE_INTEGER, UNPROVIDED)) {
                                                        list_utilities.nadd_to_end($ANNOTATE, word);
                                                    } else
                                                        if (nth(FIVE_INTEGER, word) == $ANNOTATE) {
                                                        } else {
                                                            set_nth(FIVE_INTEGER, word, $ANNOTATE);
                                                        }

                                                }
                                                done_count = add(done_count, ONE_INTEGER);
                                            }
                                        }
                                    }
                                }
                            }
                        }
                        utilities_macros.noting_percent_progress_postamble();
                    } finally {
                        utilities_macros.$percent_progress_start_time$.rebind(_prev_bind_4, thread);
                        utilities_macros.$within_noting_percent_progress$.rebind(_prev_bind_3, thread);
                        utilities_macros.$last_percent_progress_prediction$.rebind(_prev_bind_2, thread);
                        utilities_macros.$last_percent_progress_index$.rebind(_prev_bind_1, thread);
                        utilities_macros.$silent_progressP$.rebind(_prev_bind_0, thread);
                    }
                }
            }
            return $PREPARED;
        }
    }

    public static final SubLObject save_topic_struct_to_file(SubLObject struct, SubLObject file) {
        cfasl_utilities.cfasl_save_externalized(struct, file);
        return file;
    }

    public static final SubLObject verify_topic_struct_word(SubLObject word, SubLObject topic_struct, SubLObject position, SubLObject previous_choices, SubLObject sofar, SubLObject total) {
        return verify_topic_struct_word_internal(word, topic_struct, position, NIL, previous_choices, sofar, total, UNPROVIDED);
    }

    public static final SubLObject redo_topic_struct_word(SubLObject word, SubLObject topic_struct, SubLObject position, SubLObject previous_choices, SubLObject sofar, SubLObject total) {
        return verify_topic_struct_word_internal(word, topic_struct, position, T, previous_choices, sofar, total, UNPROVIDED);
    }

    public static final SubLObject verify_topic_struct_word_internal(SubLObject word, SubLObject topic_struct, SubLObject position, SubLObject force_redoP, SubLObject previous_choices, SubLObject sofar, SubLObject total, SubLObject display_commentsP) {
        if (display_commentsP == UNPROVIDED) {
            display_commentsP = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject previous_choice = retrieve_previous_topic_struct_choice(word, previous_choices);
                SubLObject candidates = nth(THREE_INTEGER, word);
                print_topic_struct_annotator_prompt(sofar, total, force_redoP, previous_choice, word, topic_struct, position, candidates, display_commentsP);
                {
                    SubLObject response = read_ignoring_errors(StreamsLow.$standard_input$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED);
                    return process_topic_struct_annotator_response(response, word, topic_struct, position, force_redoP, previous_choices, previous_choice, sofar, total, candidates);
                }
            }
        }
    }

    public static final SubLObject print_topic_struct_annotator_prompt(SubLObject sofar, SubLObject total, SubLObject force_redoP, SubLObject previous_choice, SubLObject word, SubLObject topic_struct, SubLObject position, SubLObject candidates, SubLObject display_commentsP) {
        {
            SubLObject string = topic_struct_word_string_in_context(topic_struct, position, TEN_INTEGER, TEN_INTEGER);
            SubLObject existing = nth(FOUR_INTEGER, word);
            SubLObject suggest_previous_choiceP = makeBoolean((NIL != previous_choice) && (!previous_choice.equal(existing)));
            format(T, $str_alt254$__________________S_of__S________, new SubLObject[]{ sofar, total, NIL != force_redoP ? ((SubLObject) ($$$Redo)) : $$$Verify, topic_struct_word_string_in_context(topic_struct, position, ZERO_INTEGER, ZERO_INTEGER), string });
            if ((NIL != find_if(INDEXED_TERM_P, cycl_utilities.formula_args(candidates, UNPROVIDED), UNPROVIDED, UNPROVIDED, UNPROVIDED)) && (NIL != display_commentsP)) {
                format(T, $str_alt258$__COMMENTS___);
            }
            {
                SubLObject n = ZERO_INTEGER;
                SubLObject args = cycl_utilities.formula_args(candidates, $IGNORE);
                SubLObject cdolist_list_var = args;
                SubLObject candidate = NIL;
                for (candidate = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , candidate = cdolist_list_var.first()) {
                    n = add(n, ONE_INTEGER);
                    {
                        SubLObject this_candidate_is_suggested_previous_choiceP = makeBoolean((NIL != suggest_previous_choiceP) && previous_choice.equal(list($$TheSet, candidate)));
                        format(T, $str_alt261$___A__A___S, new SubLObject[]{ NIL != this_candidate_is_suggested_previous_choiceP ? ((SubLObject) (CHAR_asterisk)) : CHAR_space, code_char(number_utilities.f_1_(add(n, char_code(CHAR_A)))), candidate });
                        if (NIL != this_candidate_is_suggested_previous_choiceP) {
                            suggest_previous_choiceP = NIL;
                        }
                    }
                    if ((NIL != display_commentsP) && (NIL != kb_indexing_datastructures.indexed_term_p(candidate))) {
                        {
                            SubLObject cdolist_list_var_119 = kb_mapping_utilities.pred_values_in_any_mt(candidate, $$comment, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                            SubLObject comment = NIL;
                            for (comment = cdolist_list_var_119.first(); NIL != cdolist_list_var_119; cdolist_list_var_119 = cdolist_list_var_119.rest() , comment = cdolist_list_var_119.first()) {
                                format(T, $str_alt262$___S, comment);
                            }
                        }
                    }
                }
            }
            format(T, $str_alt264$___A____3___none___A____1___skip_, new SubLObject[]{ NIL != suggest_previous_choiceP ? ((SubLObject) (cconcatenate(format_nil.$format_nil_percent$.getGlobalValue(), new SubLObject[]{ $str_alt265$__4__SUGGESTION__, format_nil.format_nil_s_no_copy(previous_choice), $str_alt108$_ }))) : string_utilities.$empty_string$.getGlobalValue(), (NIL != force_redoP) || (NIL == cycl_utilities.formula_args(existing, UNPROVIDED)) ? ((SubLObject) (string_utilities.$empty_string$.getGlobalValue())) : cconcatenate(format_nil.$format_nil_percent$.getGlobalValue(), new SubLObject[]{ $str_alt266$__2__EXISTING__, format_nil.format_nil_s_no_copy(existing) }), (NIL == display_commentsP) && (NIL != find_if(INDEXED_TERM_P, cycl_utilities.formula_args(candidates, UNPROVIDED), UNPROVIDED, UNPROVIDED, UNPROVIDED)) ? ((SubLObject) (cconcatenate(format_nil.$format_nil_percent$.getGlobalValue(), $str_alt267$______display_comments_))) : string_utilities.$empty_string$.getGlobalValue() });
            force_output(UNPROVIDED);
        }
        return NIL;
    }

    public static final SubLObject process_topic_struct_annotator_response(SubLObject response, SubLObject word, SubLObject topic_struct, SubLObject position, SubLObject force_redoP, SubLObject previous_choices, SubLObject previous_choice, SubLObject sofar, SubLObject total, SubLObject candidates) {
        if ($sym268$_.eql(response)) {
            return verify_topic_struct_word_internal(word, topic_struct, position, force_redoP, previous_choices, sofar, total, T);
        } else
            if (ZERO_INTEGER.equal(response)) {
                return values(word, T);
            } else
                if (ONE_INTEGER.equal(response)) {
                    return values(word, NIL);
                } else
                    if (TWO_INTEGER.equal(response) && (NIL == force_redoP)) {
                        list_utilities.delete_nth(FIVE_INTEGER, word);
                        return values(word, NIL);
                    } else
                        if (THREE_INTEGER.equal(response)) {
                            list_utilities.delete_nth(FIVE_INTEGER, word);
                            list_utilities.nreplace_nth(FOUR_INTEGER, $list_alt269, word);
                            return values(word, NIL);
                        } else
                            if (FOUR_INTEGER.equal(response)) {
                                list_utilities.delete_nth(FIVE_INTEGER, word);
                                list_utilities.nreplace_nth(FOUR_INTEGER, previous_choice, word);
                                return values(word, NIL);
                            } else
                                if (NIL != formula_pattern_match.formula_matches_pattern(response, $list_alt270)) {
                                    list_utilities.delete_nth(FIVE_INTEGER, word);
                                    list_utilities.nreplace_nth(FOUR_INTEGER, narts_high.nart_substitute(response), word);
                                    return values(word, NIL);
                                } else
                                    if ((response.isSymbol() && (NIL != list_utilities.lengthE(symbol_name(response), ONE_INTEGER, UNPROVIDED))) && (NIL != alpha_char_p(string_utilities.first_char(symbol_name(response))))) {
                                        {
                                            SubLObject n = subtract(char_code(string_utilities.first_char(symbol_name(response))), char_code(CHAR_A));
                                            if ((NIL != subl_promotions.non_negative_integer_p(n)) && (NIL != list_utilities.lengthG(candidates, n, UNPROVIDED))) {
                                                {
                                                    SubLObject choice = nth(n, cycl_utilities.formula_args(candidates, UNPROVIDED));
                                                    format(T, $str_alt271$Confirmed_answer___S, choice);
                                                    list_utilities.delete_nth(FIVE_INTEGER, word);
                                                    list_utilities.nreplace_nth(FOUR_INTEGER, list($$TheSet, choice), word);
                                                    return values(word, NIL);
                                                }
                                            } else {
                                                Errors.warn($str_alt272$Couldn_t_interpret_response___S, response);
                                                return verify_topic_struct_word_internal(word, topic_struct, position, force_redoP, previous_choices, sofar, total, UNPROVIDED);
                                            }
                                        }
                                    } else
                                        if (NIL != cycl_grammar.cycl_term_p(response)) {
                                            list_utilities.delete_nth(FIVE_INTEGER, word);
                                            list_utilities.nreplace_nth(FOUR_INTEGER, list($$TheSet, narts_high.nart_substitute(response)), word);
                                            return values(word, NIL);
                                        } else {
                                            Errors.warn($str_alt272$Couldn_t_interpret_response___S, response);
                                            return verify_topic_struct_word_internal(word, topic_struct, position, force_redoP, previous_choices, sofar, total, UNPROVIDED);
                                        }








    }

    public static final SubLObject url_for_denotation(SubLObject v_term) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject relative_url = NIL;
                if (NIL != forts.fort_p(v_term)) {
                    relative_url = cconcatenate(cb_utilities.$cb_default_fort_handler$.getDynamicValue(thread), new SubLObject[]{ $str_alt274$_, cb_utilities.cb_fort_identifier(v_term) });
                } else
                    if (NIL != narts_high.naut_p(v_term)) {
                        relative_url = cconcatenate(cb_utilities.$cb_default_naut_handler$.getDynamicValue(thread), new SubLObject[]{ $str_alt274$_, cb_utilities.cb_naut_identifier(v_term) });
                    }

                if (NIL != relative_url) {
                    return cconcatenate(http_kernel.http_server_cgi_base_url(), new SubLObject[]{ $str_alt275$cg_, relative_url });
                } else {
                    return NIL;
                }
            }
        }
    }

    public static final SubLObject record_topic_struct_meanings(SubLObject topic_struct, SubLObject v_dictionary) {
        if (v_dictionary == UNPROVIDED) {
            v_dictionary = dictionary.new_dictionary(symbol_function(EQUAL), UNPROVIDED);
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject done_count = ZERO_INTEGER;
                SubLObject word_count = NIL;
                {
                    SubLObject _prev_bind_0 = utilities_macros.$silent_progressP$.currentBinding(thread);
                    SubLObject _prev_bind_1 = utilities_macros.$last_percent_progress_index$.currentBinding(thread);
                    SubLObject _prev_bind_2 = utilities_macros.$last_percent_progress_prediction$.currentBinding(thread);
                    SubLObject _prev_bind_3 = utilities_macros.$within_noting_percent_progress$.currentBinding(thread);
                    SubLObject _prev_bind_4 = utilities_macros.$percent_progress_start_time$.currentBinding(thread);
                    try {
                        utilities_macros.$silent_progressP$.bind(makeBoolean((NIL != utilities_macros.$silent_progressP$.getDynamicValue(thread)) || true), thread);
                        utilities_macros.$last_percent_progress_index$.bind(ZERO_INTEGER, thread);
                        utilities_macros.$last_percent_progress_prediction$.bind(NIL, thread);
                        utilities_macros.$within_noting_percent_progress$.bind(T, thread);
                        utilities_macros.$percent_progress_start_time$.bind(get_universal_time(), thread);
                        utilities_macros.noting_percent_progress_preamble(NIL);
                        if (NIL != topic_struct_document_p(topic_struct)) {
                            {
                                SubLObject list_var = NIL;
                                SubLObject paragraph_topic_struct = NIL;
                                SubLObject paragraph_num = NIL;
                                for (list_var = document_topic_struct_paragraph_structs(topic_struct), paragraph_topic_struct = list_var.first(), paragraph_num = ZERO_INTEGER; NIL != list_var; list_var = list_var.rest() , paragraph_topic_struct = list_var.first() , paragraph_num = add(ONE_INTEGER, paragraph_num)) {
                                    {
                                        SubLObject list_var_120 = NIL;
                                        SubLObject sentence = NIL;
                                        SubLObject sentence_num = NIL;
                                        for (list_var_120 = el_utilities.el_list_items(paragraph_topic_struct), sentence = list_var_120.first(), sentence_num = ZERO_INTEGER; NIL != list_var_120; list_var_120 = list_var_120.rest() , sentence = list_var_120.first() , sentence_num = add(ONE_INTEGER, sentence_num)) {
                                            {
                                                SubLObject list_var_121 = NIL;
                                                SubLObject word = NIL;
                                                SubLObject word_num = NIL;
                                                for (list_var_121 = el_utilities.el_list_items(sentence), word = list_var_121.first(), word_num = ZERO_INTEGER; NIL != list_var_121; list_var_121 = list_var_121.rest() , word = list_var_121.first() , word_num = add(ONE_INTEGER, word_num)) {
                                                    {
                                                        SubLObject subposition = list(sentence_num, word_num);
                                                        SubLObject position = cons(paragraph_num, subposition);
                                                        if (NIL != topic_struct_word_ambiguous_p(word, UNPROVIDED)) {
                                                            record_word_meanings(word, v_dictionary);
                                                        }
                                                        done_count = add(done_count, ONE_INTEGER);
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        } else {
                            {
                                SubLObject list_var = NIL;
                                SubLObject sentence = NIL;
                                SubLObject sentence_num = NIL;
                                for (list_var = el_utilities.el_list_items(topic_struct), sentence = list_var.first(), sentence_num = ZERO_INTEGER; NIL != list_var; list_var = list_var.rest() , sentence = list_var.first() , sentence_num = add(ONE_INTEGER, sentence_num)) {
                                    {
                                        SubLObject list_var_122 = NIL;
                                        SubLObject word = NIL;
                                        SubLObject word_num = NIL;
                                        for (list_var_122 = el_utilities.el_list_items(sentence), word = list_var_122.first(), word_num = ZERO_INTEGER; NIL != list_var_122; list_var_122 = list_var_122.rest() , word = list_var_122.first() , word_num = add(ONE_INTEGER, word_num)) {
                                            {
                                                SubLObject position = list(sentence_num, word_num);
                                                if (NIL != topic_struct_word_ambiguous_p(word, UNPROVIDED)) {
                                                    record_word_meanings(word, v_dictionary);
                                                }
                                                done_count = add(done_count, ONE_INTEGER);
                                            }
                                        }
                                    }
                                }
                            }
                        }
                        utilities_macros.noting_percent_progress_postamble();
                    } finally {
                        utilities_macros.$percent_progress_start_time$.rebind(_prev_bind_4, thread);
                        utilities_macros.$within_noting_percent_progress$.rebind(_prev_bind_3, thread);
                        utilities_macros.$last_percent_progress_prediction$.rebind(_prev_bind_2, thread);
                        utilities_macros.$last_percent_progress_index$.rebind(_prev_bind_1, thread);
                        utilities_macros.$silent_progressP$.rebind(_prev_bind_0, thread);
                    }
                }
            }
            return v_dictionary;
        }
    }

    public static final SubLObject record_word_meanings(SubLObject topic_struct_word, SubLObject v_dictionary) {
        {
            SubLObject string = topic_struct_word_string(topic_struct_word);
            SubLObject word_denot_counts = dictionary.dictionary_lookup(v_dictionary, string, NIL);
            SubLObject cdolist_list_var = topic_struct_word_correct_denots(topic_struct_word);
            SubLObject denot = NIL;
            for (denot = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , denot = cdolist_list_var.first()) {
                word_denot_counts = list_utilities.alist_enter(word_denot_counts, denot, number_utilities.f_1X(list_utilities.alist_lookup(word_denot_counts, denot, symbol_function(EQUAL), ZERO_INTEGER)), symbol_function(EQUAL));
            }
            dictionary.dictionary_enter(v_dictionary, string, word_denot_counts);
            return word_denot_counts;
        }
    }

    public static final SubLObject most_common_word_senses(SubLObject string, SubLObject v_dictionary) {
        {
            SubLObject data = dictionary.dictionary_lookup(v_dictionary, string, UNPROVIDED);
            return NIL != data ? ((SubLObject) (Mapping.mapcar(CAR, list_utilities.remove_subsumed_items(data, symbol_function($sym277$_), symbol_function(CDR))))) : NIL;
        }
    }

    public static final SubLObject topic_struct_baseline_from_most_common_word_senses(SubLObject topic_struct, SubLObject stats) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject total = ZERO_INTEGER;
                SubLObject correct = ZERO_INTEGER;
                SubLObject done_count = ZERO_INTEGER;
                SubLObject word_count = NIL;
                {
                    SubLObject _prev_bind_0 = utilities_macros.$silent_progressP$.currentBinding(thread);
                    SubLObject _prev_bind_1 = utilities_macros.$last_percent_progress_index$.currentBinding(thread);
                    SubLObject _prev_bind_2 = utilities_macros.$last_percent_progress_prediction$.currentBinding(thread);
                    SubLObject _prev_bind_3 = utilities_macros.$within_noting_percent_progress$.currentBinding(thread);
                    SubLObject _prev_bind_4 = utilities_macros.$percent_progress_start_time$.currentBinding(thread);
                    try {
                        utilities_macros.$silent_progressP$.bind(makeBoolean((NIL != utilities_macros.$silent_progressP$.getDynamicValue(thread)) || true), thread);
                        utilities_macros.$last_percent_progress_index$.bind(ZERO_INTEGER, thread);
                        utilities_macros.$last_percent_progress_prediction$.bind(NIL, thread);
                        utilities_macros.$within_noting_percent_progress$.bind(T, thread);
                        utilities_macros.$percent_progress_start_time$.bind(get_universal_time(), thread);
                        utilities_macros.noting_percent_progress_preamble(NIL);
                        if (NIL != topic_struct_document_p(topic_struct)) {
                            {
                                SubLObject list_var = NIL;
                                SubLObject paragraph_topic_struct = NIL;
                                SubLObject paragraph_num = NIL;
                                for (list_var = document_topic_struct_paragraph_structs(topic_struct), paragraph_topic_struct = list_var.first(), paragraph_num = ZERO_INTEGER; NIL != list_var; list_var = list_var.rest() , paragraph_topic_struct = list_var.first() , paragraph_num = add(ONE_INTEGER, paragraph_num)) {
                                    {
                                        SubLObject list_var_123 = NIL;
                                        SubLObject sentence = NIL;
                                        SubLObject sentence_num = NIL;
                                        for (list_var_123 = el_utilities.el_list_items(paragraph_topic_struct), sentence = list_var_123.first(), sentence_num = ZERO_INTEGER; NIL != list_var_123; list_var_123 = list_var_123.rest() , sentence = list_var_123.first() , sentence_num = add(ONE_INTEGER, sentence_num)) {
                                            {
                                                SubLObject list_var_124 = NIL;
                                                SubLObject word = NIL;
                                                SubLObject word_num = NIL;
                                                for (list_var_124 = el_utilities.el_list_items(sentence), word = list_var_124.first(), word_num = ZERO_INTEGER; NIL != list_var_124; list_var_124 = list_var_124.rest() , word = list_var_124.first() , word_num = add(ONE_INTEGER, word_num)) {
                                                    {
                                                        SubLObject subposition = list(sentence_num, word_num);
                                                        SubLObject position = cons(paragraph_num, subposition);
                                                        if ((NIL != topic_struct_word_ambiguous_p(word, UNPROVIDED)) && (NIL != topic_struct_word_correct_denots(word))) {
                                                            {
                                                                SubLObject string = topic_struct_word_string(word);
                                                                SubLObject most_common_word_senses = most_common_word_senses(string, stats);
                                                                SubLObject correct_denots = topic_struct_word_correct_denots(word);
                                                                SubLObject guess = list_utilities.random_element(most_common_word_senses);
                                                                SubLObject correctP = subl_promotions.memberP(guess, correct_denots, symbol_function(EQUAL), UNPROVIDED);
                                                                if (NIL != correctP) {
                                                                    correct = add(correct, ONE_INTEGER);
                                                                }
                                                            }
                                                            total = add(total, ONE_INTEGER);
                                                        }
                                                        done_count = add(done_count, ONE_INTEGER);
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        } else {
                            {
                                SubLObject list_var = NIL;
                                SubLObject sentence = NIL;
                                SubLObject sentence_num = NIL;
                                for (list_var = el_utilities.el_list_items(topic_struct), sentence = list_var.first(), sentence_num = ZERO_INTEGER; NIL != list_var; list_var = list_var.rest() , sentence = list_var.first() , sentence_num = add(ONE_INTEGER, sentence_num)) {
                                    {
                                        SubLObject list_var_125 = NIL;
                                        SubLObject word = NIL;
                                        SubLObject word_num = NIL;
                                        for (list_var_125 = el_utilities.el_list_items(sentence), word = list_var_125.first(), word_num = ZERO_INTEGER; NIL != list_var_125; list_var_125 = list_var_125.rest() , word = list_var_125.first() , word_num = add(ONE_INTEGER, word_num)) {
                                            {
                                                SubLObject position = list(sentence_num, word_num);
                                                if ((NIL != topic_struct_word_ambiguous_p(word, UNPROVIDED)) && (NIL != topic_struct_word_correct_denots(word))) {
                                                    {
                                                        SubLObject string = topic_struct_word_string(word);
                                                        SubLObject most_common_word_senses = most_common_word_senses(string, stats);
                                                        SubLObject correct_denots = topic_struct_word_correct_denots(word);
                                                        SubLObject guess = list_utilities.random_element(most_common_word_senses);
                                                        SubLObject correctP = subl_promotions.memberP(guess, correct_denots, symbol_function(EQUAL), UNPROVIDED);
                                                        if (NIL != correctP) {
                                                            correct = add(correct, ONE_INTEGER);
                                                        }
                                                    }
                                                    total = add(total, ONE_INTEGER);
                                                }
                                                done_count = add(done_count, ONE_INTEGER);
                                            }
                                        }
                                    }
                                }
                            }
                        }
                        utilities_macros.noting_percent_progress_postamble();
                    } finally {
                        utilities_macros.$percent_progress_start_time$.rebind(_prev_bind_4, thread);
                        utilities_macros.$within_noting_percent_progress$.rebind(_prev_bind_3, thread);
                        utilities_macros.$last_percent_progress_prediction$.rebind(_prev_bind_2, thread);
                        utilities_macros.$last_percent_progress_index$.rebind(_prev_bind_1, thread);
                        utilities_macros.$silent_progressP$.rebind(_prev_bind_0, thread);
                    }
                }
                return values(correct, total, number_utilities.significant_digits(multiply($int$100, divide(correct, total)), THREE_INTEGER));
            }
        }
    }

    // deflexical
    private static final SubLSymbol $topic_struct_test_texts$ = makeSymbol("*TOPIC-STRUCT-TEST-TEXTS*");

    public static final SubLObject topic_struct_lexicon() {
        {
            SubLObject lexicon = topic_struct_lexicon_memoized();
            if (NIL == abstract_lexicon.abstract_lexicon_p(lexicon)) {
                memoization_state.clear_current_memoization(TOPIC_STRUCT_LEXICON_MEMOIZED);
                lexicon = topic_struct_lexicon_memoized();
            }
            return lexicon;
        }
    }

    public static final SubLObject topic_struct_lexicon_memoized_internal() {
        {
            SubLObject lexicon = object.new_class_instance(TERM_LEXICON);
            methods.funcall_instance_method_with_1_args(lexicon, SET_EQUALITY, symbol_function(EQUALP));
            methods.funcall_instance_method_with_1_args(lexicon, ALLOW_PREDICATE, $$preferredNameString);
            methods.funcall_instance_method_with_1_args(lexicon, ALLOW_PREDICATE, $$familyName);
            return lexicon;
        }
    }

    public static final SubLObject topic_struct_lexicon_memoized() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
                SubLObject caching_state = NIL;
                if (NIL == v_memoization_state) {
                    return topic_struct_lexicon_memoized_internal();
                }
                caching_state = memoization_state.memoization_state_lookup(v_memoization_state, TOPIC_STRUCT_LEXICON_MEMOIZED, UNPROVIDED);
                if (NIL == caching_state) {
                    caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), TOPIC_STRUCT_LEXICON_MEMOIZED, ZERO_INTEGER, NIL, EQL, UNPROVIDED);
                    memoization_state.memoization_state_put(v_memoization_state, TOPIC_STRUCT_LEXICON_MEMOIZED, caching_state);
                }
                {
                    SubLObject results = memoization_state.caching_state_get_zero_arg_results(caching_state, UNPROVIDED);
                    if (results == $kw19$_MEMOIZED_ITEM_NOT_FOUND_) {
                        results = arg2(thread.resetMultipleValues(), multiple_value_list(topic_struct_lexicon_memoized_internal()));
                        memoization_state.caching_state_set_zero_arg_results(caching_state, results, UNPROVIDED);
                    }
                    return memoization_state.caching_results(results);
                }
            }
        }
    }



    public static final SubLObject clear_topic_struct_for_test_text() {
        {
            SubLObject cs = $topic_struct_for_test_text_caching_state$.getGlobalValue();
            if (NIL != cs) {
                memoization_state.caching_state_clear(cs);
            }
        }
        return NIL;
    }

    public static final SubLObject remove_topic_struct_for_test_text(SubLObject text, SubLObject mt, SubLObject annotatedP) {
        if (annotatedP == UNPROVIDED) {
            annotatedP = NIL;
        }
        return memoization_state.caching_state_remove_function_results_with_args($topic_struct_for_test_text_caching_state$.getGlobalValue(), list(text, mt, annotatedP), UNPROVIDED, UNPROVIDED);
    }

    public static final SubLObject topic_struct_for_test_text_internal(SubLObject text, SubLObject mt, SubLObject annotatedP) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject ans = NIL;
                SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(mt);
                {
                    SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
                    SubLObject _prev_bind_1 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                    SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
                    SubLObject _prev_bind_3 = concept_tagger.$default_sentence_string_lexicon$.currentBinding(thread);
                    try {
                        mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
                        mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
                        mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
                        concept_tagger.$default_sentence_string_lexicon$.bind(topic_struct_lexicon(), thread);
                        ans = relation_evaluation.cyc_evaluate(list($$TextTopicStructureFn, text));
                    } finally {
                        concept_tagger.$default_sentence_string_lexicon$.rebind(_prev_bind_3, thread);
                        mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_2, thread);
                        mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_1, thread);
                        mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
                    }
                }
                if ((NIL != annotatedP) && el_utilities.el_list_length(ans).numG(ZERO_INTEGER)) {
                    annotate_topic_struct(ans);
                }
                return ans;
            }
        }
    }

    public static final SubLObject topic_struct_for_test_text(SubLObject text, SubLObject mt, SubLObject annotatedP) {
        if (annotatedP == UNPROVIDED) {
            annotatedP = NIL;
        }
        {
            SubLObject caching_state = $topic_struct_for_test_text_caching_state$.getGlobalValue();
            if (NIL == caching_state) {
                caching_state = memoization_state.create_global_caching_state_for_name(TOPIC_STRUCT_FOR_TEST_TEXT, $topic_struct_for_test_text_caching_state$, NIL, EQUAL, THREE_INTEGER, ZERO_INTEGER);
            }
            {
                SubLObject sxhash = memoization_state.sxhash_calc_3(text, mt, annotatedP);
                SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
                if (collisions != $kw19$_MEMOIZED_ITEM_NOT_FOUND_) {
                    {
                        SubLObject cdolist_list_var = collisions;
                        SubLObject collision = NIL;
                        for (collision = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , collision = cdolist_list_var.first()) {
                            {
                                SubLObject cached_args = collision.first();
                                SubLObject results2 = second(collision);
                                if (text.equal(cached_args.first())) {
                                    cached_args = cached_args.rest();
                                    if (mt.equal(cached_args.first())) {
                                        cached_args = cached_args.rest();
                                        if (((NIL != cached_args) && (NIL == cached_args.rest())) && annotatedP.equal(cached_args.first())) {
                                            return memoization_state.caching_results(results2);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                {
                    SubLObject results = arg2(resetMultipleValues(), multiple_value_list(topic_struct_for_test_text_internal(text, mt, annotatedP)));
                    memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results, list(text, mt, annotatedP));
                    return memoization_state.caching_results(results);
                }
            }
        }
    }

    public static final SubLObject annotate_topic_struct(SubLObject topic_struct) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject done_count = ZERO_INTEGER;
                SubLObject word_count = NIL;
                {
                    SubLObject _prev_bind_0 = utilities_macros.$silent_progressP$.currentBinding(thread);
                    SubLObject _prev_bind_1 = utilities_macros.$last_percent_progress_index$.currentBinding(thread);
                    SubLObject _prev_bind_2 = utilities_macros.$last_percent_progress_prediction$.currentBinding(thread);
                    SubLObject _prev_bind_3 = utilities_macros.$within_noting_percent_progress$.currentBinding(thread);
                    SubLObject _prev_bind_4 = utilities_macros.$percent_progress_start_time$.currentBinding(thread);
                    try {
                        utilities_macros.$silent_progressP$.bind(makeBoolean((NIL != utilities_macros.$silent_progressP$.getDynamicValue(thread)) || true), thread);
                        utilities_macros.$last_percent_progress_index$.bind(ZERO_INTEGER, thread);
                        utilities_macros.$last_percent_progress_prediction$.bind(NIL, thread);
                        utilities_macros.$within_noting_percent_progress$.bind(T, thread);
                        utilities_macros.$percent_progress_start_time$.bind(get_universal_time(), thread);
                        utilities_macros.noting_percent_progress_preamble(NIL);
                        if (NIL != topic_struct_document_p(topic_struct)) {
                            {
                                SubLObject list_var = NIL;
                                SubLObject paragraph_topic_struct = NIL;
                                SubLObject paragraph_num = NIL;
                                for (list_var = document_topic_struct_paragraph_structs(topic_struct), paragraph_topic_struct = list_var.first(), paragraph_num = ZERO_INTEGER; NIL != list_var; list_var = list_var.rest() , paragraph_topic_struct = list_var.first() , paragraph_num = add(ONE_INTEGER, paragraph_num)) {
                                    {
                                        SubLObject list_var_126 = NIL;
                                        SubLObject sentence = NIL;
                                        SubLObject sentence_num = NIL;
                                        for (list_var_126 = el_utilities.el_list_items(paragraph_topic_struct), sentence = list_var_126.first(), sentence_num = ZERO_INTEGER; NIL != list_var_126; list_var_126 = list_var_126.rest() , sentence = list_var_126.first() , sentence_num = add(ONE_INTEGER, sentence_num)) {
                                            {
                                                SubLObject list_var_127 = NIL;
                                                SubLObject word = NIL;
                                                SubLObject word_num = NIL;
                                                for (list_var_127 = el_utilities.el_list_items(sentence), word = list_var_127.first(), word_num = ZERO_INTEGER; NIL != list_var_127; list_var_127 = list_var_127.rest() , word = list_var_127.first() , word_num = add(ONE_INTEGER, word_num)) {
                                                    {
                                                        SubLObject subposition = list(sentence_num, word_num);
                                                        SubLObject position = cons(paragraph_num, subposition);
                                                        annotate_topic_struct_word(word);
                                                        done_count = add(done_count, ONE_INTEGER);
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        } else {
                            {
                                SubLObject list_var = NIL;
                                SubLObject sentence = NIL;
                                SubLObject sentence_num = NIL;
                                for (list_var = el_utilities.el_list_items(topic_struct), sentence = list_var.first(), sentence_num = ZERO_INTEGER; NIL != list_var; list_var = list_var.rest() , sentence = list_var.first() , sentence_num = add(ONE_INTEGER, sentence_num)) {
                                    {
                                        SubLObject list_var_128 = NIL;
                                        SubLObject word = NIL;
                                        SubLObject word_num = NIL;
                                        for (list_var_128 = el_utilities.el_list_items(sentence), word = list_var_128.first(), word_num = ZERO_INTEGER; NIL != list_var_128; list_var_128 = list_var_128.rest() , word = list_var_128.first() , word_num = add(ONE_INTEGER, word_num)) {
                                            {
                                                SubLObject position = list(sentence_num, word_num);
                                                annotate_topic_struct_word(word);
                                                done_count = add(done_count, ONE_INTEGER);
                                            }
                                        }
                                    }
                                }
                            }
                        }
                        utilities_macros.noting_percent_progress_postamble();
                    } finally {
                        utilities_macros.$percent_progress_start_time$.rebind(_prev_bind_4, thread);
                        utilities_macros.$within_noting_percent_progress$.rebind(_prev_bind_3, thread);
                        utilities_macros.$last_percent_progress_prediction$.rebind(_prev_bind_2, thread);
                        utilities_macros.$last_percent_progress_index$.rebind(_prev_bind_1, thread);
                        utilities_macros.$silent_progressP$.rebind(_prev_bind_0, thread);
                    }
                }
            }
            return topic_struct;
        }
    }

    public static final SubLObject annotate_topic_struct_word(SubLObject word) {
        SubLTrampolineFile.checkType(word, NON_EMPTY_LIST_P);
        return list_utilities.nadd_to_end($list_alt269, word);
    }

    // deflexical
    private static final SubLSymbol $topic_struct_test_paragraphs_directory$ = makeSymbol("*TOPIC-STRUCT-TEST-PARAGRAPHS-DIRECTORY*");

    // deflexical
    private static final SubLSymbol $topic_struct_test_results_directory$ = makeSymbol("*TOPIC-STRUCT-TEST-RESULTS-DIRECTORY*");

    public static final SubLObject topic_struct_results_directory(SubLObject text_directory) {
        if (text_directory == UNPROVIDED) {
            text_directory = $topic_struct_test_paragraphs_directory$.getGlobalValue();
        }
        {
            SubLObject base_directory = file_utilities.make_path_absolute_relative_to(text_directory, $str_alt292$___process_output_files_);
            SubLObject base = $$$results;
            SubLObject doneP = NIL;
            SubLObject name = NIL;
            if (NIL == doneP) {
                {
                    SubLObject ext = NIL;
                    for (ext = ONE_INTEGER; NIL == doneP; ext = number_utilities.f_1X(ext)) {
                        name = format(NIL, $str_alt294$_A__3__0D_, base, ext);
                        if (NIL == Filesys.directory_p(file_utilities.relative_filename(base_directory, name, UNPROVIDED))) {
                            doneP = T;
                        }
                    }
                }
            }
            return file_utilities.relative_filename(base_directory, name, UNPROVIDED);
        }
    }

    // deflexical
    private static final SubLSymbol $topic_struct_sibling_collections$ = makeSymbol("*TOPIC-STRUCT-SIBLING-COLLECTIONS*");

    public static final SubLObject topic_struct_sibling_collection_parameter(SubLObject col) {
        {
            SubLObject parameter_name = cconcatenate($str_alt296$_TOPIC_STRUCT_USE_, new SubLObject[]{ format_nil.format_nil_a_no_copy(Strings.string_upcase(constants_high.constant_name(col), UNPROVIDED, UNPROVIDED)), $str_alt297$__ });
            return intern(parameter_name, UNPROVIDED);
        }
    }

    public static final SubLObject test_topic_struct_document_files(SubLObject text_directory, SubLObject mt, SubLObject results_directory) {
        if (text_directory == UNPROVIDED) {
            text_directory = $topic_struct_test_paragraphs_directory$.getGlobalValue();
        }
        if (mt == UNPROVIDED) {
            mt = $$InferencePSC;
        }
        if (results_directory == UNPROVIDED) {
            results_directory = topic_struct_results_directory(text_directory);
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            SubLTrampolineFile.checkType(text_directory, DIRECTORY_P);
            {
                SubLObject directory_contents_var = Filesys.directory(text_directory, T);
                SubLObject progress_message_var = cconcatenate($str_alt299$Testing_document_texts_in_, new SubLObject[]{ format_nil.format_nil_s_no_copy(text_directory), $str_alt300$_, format_nil.$format_nil_percent$.getGlobalValue(), $str_alt301$_Output_files_will_be_placed_in_, format_nil.format_nil_s_no_copy(results_directory), $str_alt300$_ });
                {
                    SubLObject _prev_bind_0 = utilities_macros.$silent_progressP$.currentBinding(thread);
                    try {
                        utilities_macros.$silent_progressP$.bind(makeBoolean(!progress_message_var.isString()), thread);
                        {
                            SubLObject list_var = directory_contents_var;
                            utilities_macros.$progress_note$.setDynamicValue(progress_message_var, thread);
                            utilities_macros.$progress_start_time$.setDynamicValue(get_universal_time(), thread);
                            utilities_macros.$progress_total$.setDynamicValue(length(list_var), thread);
                            utilities_macros.$progress_sofar$.setDynamicValue(ZERO_INTEGER, thread);
                            {
                                SubLObject _prev_bind_0_129 = utilities_macros.$last_percent_progress_index$.currentBinding(thread);
                                SubLObject _prev_bind_1 = utilities_macros.$last_percent_progress_prediction$.currentBinding(thread);
                                SubLObject _prev_bind_2 = utilities_macros.$within_noting_percent_progress$.currentBinding(thread);
                                SubLObject _prev_bind_3 = utilities_macros.$percent_progress_start_time$.currentBinding(thread);
                                try {
                                    utilities_macros.$last_percent_progress_index$.bind(ZERO_INTEGER, thread);
                                    utilities_macros.$last_percent_progress_prediction$.bind(NIL, thread);
                                    utilities_macros.$within_noting_percent_progress$.bind(T, thread);
                                    utilities_macros.$percent_progress_start_time$.bind(get_universal_time(), thread);
                                    utilities_macros.noting_percent_progress_preamble(utilities_macros.$progress_note$.getDynamicValue(thread));
                                    {
                                        SubLObject csome_list_var = list_var;
                                        SubLObject file = NIL;
                                        for (file = csome_list_var.first(); NIL != csome_list_var; csome_list_var = csome_list_var.rest() , file = csome_list_var.first()) {
                                            utilities_macros.note_percent_progress(utilities_macros.$progress_sofar$.getDynamicValue(thread), utilities_macros.$progress_total$.getDynamicValue(thread));
                                            utilities_macros.$progress_sofar$.setDynamicValue(add(utilities_macros.$progress_sofar$.getDynamicValue(thread), ONE_INTEGER), thread);
                                            test_topic_struct_document_file(file, mt, results_directory, UNPROVIDED, UNPROVIDED);
                                        }
                                    }
                                    utilities_macros.noting_percent_progress_postamble();
                                } finally {
                                    utilities_macros.$percent_progress_start_time$.rebind(_prev_bind_3, thread);
                                    utilities_macros.$within_noting_percent_progress$.rebind(_prev_bind_2, thread);
                                    utilities_macros.$last_percent_progress_prediction$.rebind(_prev_bind_1, thread);
                                    utilities_macros.$last_percent_progress_index$.rebind(_prev_bind_0_129, thread);
                                }
                            }
                        }
                    } finally {
                        utilities_macros.$silent_progressP$.rebind(_prev_bind_0, thread);
                    }
                }
            }
            return NIL;
        }
    }

    public static final SubLObject test_topic_struct_document_file(SubLObject file, SubLObject mt, SubLObject results_directory, SubLObject max_parses, SubLObject max_time) {
        if (mt == UNPROVIDED) {
            mt = $$InferencePSC;
        }
        if (results_directory == UNPROVIDED) {
            results_directory = file_utilities.cyc_home_subdirectory(NIL);
        }
        if (max_parses == UNPROVIDED) {
            max_parses = TEN_INTEGER;
        }
        if (max_time == UNPROVIDED) {
            max_time = $int$30;
        }
        {
            SubLObject paragraph_texts = learning_reader.read_topic_struct_paragraphs_from_file(file);
            SubLObject document_struct = make_document_topic_struct(paragraph_texts, mt, UNPROVIDED);
            learning_reader.parse_and_partition_paragraph_texts(paragraph_texts, results_directory, mt, max_parses, max_time);
            return apply_all_topic_struct_strategies(document_struct, mt, results_directory, UNPROVIDED);
        }
    }

    public static final SubLObject store_annotated_topic_struct_from_file(SubLObject file, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = $$InferencePSC;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject paragraph_texts = learning_reader.read_topic_struct_paragraphs_from_file(file);
                SubLObject document_struct = make_annotated_document_topic_struct(paragraph_texts, mt);
                thread.resetMultipleValues();
                {
                    SubLObject path = file_utilities.deconstruct_path(file);
                    SubLObject local_name = thread.secondMultipleValue();
                    thread.resetMultipleValues();
                    {
                        SubLObject new_local_name = cconcatenate(string_utilities.post_remove(local_name, $str_alt302$_lisp, symbol_function(EQUAL)), $str_alt252$_topic_struct_cfasl);
                        SubLObject kb_string = string_utilities.replace_substring(operation_communication.kb_version_string(), $str_alt300$_, $str_alt303$_);
                        SubLObject new_path = list_utilities.add_to_end(kb_string, path);
                        SubLObject new_directory = file_utilities.reconstruct_path(new_path, string_utilities.$empty_string$.getGlobalValue(), UNPROVIDED);
                        SubLObject output_cfasl_filename = file_utilities.reconstruct_path(new_path, new_local_name, UNPROVIDED);
                        if (NIL == Filesys.directory_p(new_directory)) {
                            Filesys.make_directory(new_directory, UNPROVIDED, UNPROVIDED);
                        }
                        cfasl_utilities.cfasl_save_externalized(document_struct, output_cfasl_filename);
                        return output_cfasl_filename;
                    }
                }
            }
        }
    }

    /**
     * Iterate over *TOPIC-STRUCT-TEST-TEXTS*, applying all strategies to each and reporting the results.
     */
    public static final SubLObject test_all_topic_struct_texts(SubLObject mt, SubLObject results_directory) {
        if (mt == UNPROVIDED) {
            mt = $$InferencePSC;
        }
        if (results_directory == UNPROVIDED) {
            results_directory = file_utilities.cyc_home_subdirectory(NIL);
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject state = memoization_state.possibly_new_memoization_state();
                SubLObject local_state = state;
                {
                    SubLObject _prev_bind_0 = memoization_state.$memoization_state$.currentBinding(thread);
                    try {
                        memoization_state.$memoization_state$.bind(local_state, thread);
                        {
                            SubLObject original_memoization_process = memoization_state.aquireMemoStateLock(local_state);
                            try {
                                {
                                    SubLObject cdolist_list_var = $topic_struct_test_texts$.getGlobalValue();
                                    SubLObject text = NIL;
                                    for (text = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , text = cdolist_list_var.first()) {
                                        {
                                            SubLObject topic_struct = topic_struct_for_test_text(text, mt, UNPROVIDED);
                                            apply_all_topic_struct_strategies(copy_tree(topic_struct), mt, results_directory, UNPROVIDED);
                                        }
                                    }
                                }
                            } finally {
                                {
                                    SubLObject _prev_bind_0_130 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                    try {
                                        $is_thread_performing_cleanupP$.bind(T, thread);
                                        if ((NIL != local_state) && (NIL == original_memoization_process)) {
                                            memoization_state.memoization_state_set_current_process_internal(local_state, NIL);
                                        }
                                    } finally {
                                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0_130, thread);
                                    }
                                }
                            }
                        }
                    } finally {
                        memoization_state.$memoization_state$.rebind(_prev_bind_0, thread);
                    }
                }
            }
            return NIL;
        }
    }

    // defparameter
    private static final SubLSymbol $topic_struct_sbhl_spaces$ = makeSymbol("*TOPIC-STRUCT-SBHL-SPACES*");

    /**
     * Apply all strategies to TOPIC-STRUCT, and report the results.
     */
    public static final SubLObject apply_all_topic_struct_strategies(SubLObject topic_struct, SubLObject mt, SubLObject results_directory, SubLObject cookie_jar) {
        if (mt == UNPROVIDED) {
            mt = $$InferencePSC;
        }
        if (results_directory == UNPROVIDED) {
            results_directory = file_utilities.cyc_home_subdirectory(NIL);
        }
        if (cookie_jar == UNPROVIDED) {
            cookie_jar = dictionary.new_dictionary(symbol_function(EQUAL), UNPROVIDED);
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == Filesys.directory_p(results_directory)) {
                file_utilities.make_directory_recursive(results_directory, NIL, $$$775);
            }
            {
                SubLObject max_wait_time = $int$30;
                SubLObject wait_time = ZERO_INTEGER;
                while (!(wait_time.numGE(max_wait_time) || (NIL != Filesys.directory_p(results_directory)))) {
                    wait_time = add(wait_time, ONE_INTEGER);
                    sleep(ONE_INTEGER);
                } 
                if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                    if (NIL == Filesys.directory_p(results_directory)) {
                        Errors.error($str_alt305$Couldn_t_create_directory_in__S_s, wait_time, results_directory);
                    }
                }
            }
            cfasl_utilities.cfasl_save_externalized(topic_struct, file_utilities.relative_filename(results_directory, $str_alt306$topic_struct_cfasl, UNPROVIDED));
            {
                SubLObject ambiguous_position_count = count_topic_struct_ambiguous_words(topic_struct, UNPROVIDED);
                SubLObject partial_cookie_jar_file = file_utilities.relative_filename(results_directory, $str_alt307$cookie_jar_partial_cfasl, UNPROVIDED);
                SubLObject state = memoization_state.possibly_new_memoization_state();
                SubLObject local_state = state;
                {
                    SubLObject _prev_bind_0 = memoization_state.$memoization_state$.currentBinding(thread);
                    try {
                        memoization_state.$memoization_state$.bind(local_state, thread);
                        {
                            SubLObject original_memoization_process = memoization_state.aquireMemoStateLock(local_state);
                            try {
                                {
                                    SubLObject already_resourcing_p = sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.getDynamicValue(thread);
                                    {
                                        SubLObject _prev_bind_0_131 = sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.currentBinding(thread);
                                        SubLObject _prev_bind_1 = sbhl_marking_vars.$resourced_sbhl_marking_spaces$.currentBinding(thread);
                                        SubLObject _prev_bind_2 = sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.currentBinding(thread);
                                        try {
                                            sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.bind(sbhl_marking_vars.determine_resource_limit(already_resourcing_p, $topic_struct_sbhl_spaces$.getDynamicValue(thread)), thread);
                                            sbhl_marking_vars.$resourced_sbhl_marking_spaces$.bind(sbhl_marking_vars.possibly_new_marking_resource(already_resourcing_p), thread);
                                            sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.bind(T, thread);
                                            {
                                                SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(mt);
                                                {
                                                    SubLObject _prev_bind_0_132 = mt_relevance_macros.$mt$.currentBinding(thread);
                                                    SubLObject _prev_bind_1_133 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                                                    SubLObject _prev_bind_2_134 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
                                                    SubLObject _prev_bind_3 = $topic_struct$.currentBinding(thread);
                                                    try {
                                                        mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
                                                        mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
                                                        mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
                                                        $topic_struct$.bind(topic_struct, thread);
                                                        {
                                                            SubLObject done_count = ZERO_INTEGER;
                                                            SubLObject word_count = (true) ? ((SubLObject) (count_topic_struct_words(topic_struct))) : NIL;
                                                            {
                                                                SubLObject _prev_bind_0_135 = utilities_macros.$silent_progressP$.currentBinding(thread);
                                                                SubLObject _prev_bind_1_136 = utilities_macros.$last_percent_progress_index$.currentBinding(thread);
                                                                SubLObject _prev_bind_2_137 = utilities_macros.$last_percent_progress_prediction$.currentBinding(thread);
                                                                SubLObject _prev_bind_3_138 = utilities_macros.$within_noting_percent_progress$.currentBinding(thread);
                                                                SubLObject _prev_bind_4 = utilities_macros.$percent_progress_start_time$.currentBinding(thread);
                                                                try {
                                                                    utilities_macros.$silent_progressP$.bind(makeBoolean((NIL != utilities_macros.$silent_progressP$.getDynamicValue(thread)) || false), thread);
                                                                    utilities_macros.$last_percent_progress_index$.bind(ZERO_INTEGER, thread);
                                                                    utilities_macros.$last_percent_progress_prediction$.bind(NIL, thread);
                                                                    utilities_macros.$within_noting_percent_progress$.bind(T, thread);
                                                                    utilities_macros.$percent_progress_start_time$.bind(get_universal_time(), thread);
                                                                    utilities_macros.noting_percent_progress_preamble($str_alt308$Applying_all_strategies___);
                                                                    if (NIL != topic_struct_document_p(topic_struct)) {
                                                                        {
                                                                            SubLObject list_var = NIL;
                                                                            SubLObject paragraph_topic_struct = NIL;
                                                                            SubLObject paragraph_num = NIL;
                                                                            for (list_var = document_topic_struct_paragraph_structs(topic_struct), paragraph_topic_struct = list_var.first(), paragraph_num = ZERO_INTEGER; NIL != list_var; list_var = list_var.rest() , paragraph_topic_struct = list_var.first() , paragraph_num = add(ONE_INTEGER, paragraph_num)) {
                                                                                {
                                                                                    SubLObject list_var_139 = NIL;
                                                                                    SubLObject sentence = NIL;
                                                                                    SubLObject sentence_num = NIL;
                                                                                    for (list_var_139 = el_utilities.el_list_items(paragraph_topic_struct), sentence = list_var_139.first(), sentence_num = ZERO_INTEGER; NIL != list_var_139; list_var_139 = list_var_139.rest() , sentence = list_var_139.first() , sentence_num = add(ONE_INTEGER, sentence_num)) {
                                                                                        {
                                                                                            SubLObject list_var_140 = NIL;
                                                                                            SubLObject word = NIL;
                                                                                            SubLObject word_num = NIL;
                                                                                            for (list_var_140 = el_utilities.el_list_items(sentence), word = list_var_140.first(), word_num = ZERO_INTEGER; NIL != list_var_140; list_var_140 = list_var_140.rest() , word = list_var_140.first() , word_num = add(ONE_INTEGER, word_num)) {
                                                                                                {
                                                                                                    SubLObject subposition = list(sentence_num, word_num);
                                                                                                    SubLObject position = cons(paragraph_num, subposition);
                                                                                                    if ((NIL != topic_struct_word_ambiguous_p(word, NIL)) && (NIL == dictionary.dictionary_lookup(cookie_jar, position, UNPROVIDED))) {
                                                                                                        {
                                                                                                            SubLObject cookie_pack = dictionary.new_dictionary(symbol_function(EQUAL), UNPROVIDED);
                                                                                                            SubLObject verboseP = topic_struct_verboseP();
                                                                                                            if (NIL != verboseP) {
                                                                                                                format(T, $str_alt309$_________A__________S_of__S___, new SubLObject[]{ topic_struct_word_string_in_context(topic_struct, position, TWO_INTEGER, TWO_INTEGER), dictionary.dictionary_length(cookie_jar), ambiguous_position_count });
                                                                                                            }
                                                                                                            {
                                                                                                                SubLObject csome_list_var = topic_struct_word_denots(word);
                                                                                                                SubLObject denot = NIL;
                                                                                                                for (denot = csome_list_var.first(); NIL != csome_list_var; csome_list_var = csome_list_var.rest() , denot = csome_list_var.first()) {
                                                                                                                    dictionary.dictionary_enter(cookie_pack, denot, NIL);
                                                                                                                    {
                                                                                                                        SubLObject cdolist_list_var = $topic_struct_sibling_collections$.getGlobalValue();
                                                                                                                        SubLObject col = NIL;
                                                                                                                        for (col = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , col = cdolist_list_var.first()) {
                                                                                                                            thread.resetMultipleValues();
                                                                                                                            {
                                                                                                                                SubLObject score = sibling_score_wrt_nearest_isa_of_type(topic_struct, position, denot, col);
                                                                                                                                SubLObject data = thread.secondMultipleValue();
                                                                                                                                thread.resetMultipleValues();
                                                                                                                                if (score.isPositive()) {
                                                                                                                                    dictionary_utilities.dictionary_push(cookie_pack, denot, make_topic_struct_cookie(list($SIBLING, col), score, data));
                                                                                                                                }
                                                                                                                            }
                                                                                                                        }
                                                                                                                    }
                                                                                                                    {
                                                                                                                        SubLObject weighted_isas = topic_struct_isas(topic_struct, position, denot);
                                                                                                                        SubLObject score = ZERO_INTEGER;
                                                                                                                        SubLObject cdolist_list_var = weighted_isas;
                                                                                                                        SubLObject data = NIL;
                                                                                                                        for (data = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , data = cdolist_list_var.first()) {
                                                                                                                            score = add(score, cookie_data_score(data));
                                                                                                                        }
                                                                                                                        if (score.isPositive()) {
                                                                                                                            dictionary_utilities.dictionary_push(cookie_pack, denot, make_topic_struct_cookie($ISA_COUNT, score, weighted_isas));
                                                                                                                        }
                                                                                                                    }
                                                                                                                    {
                                                                                                                        SubLObject weighted_genls = topic_struct_genls(topic_struct, position, denot);
                                                                                                                        SubLObject score = ZERO_INTEGER;
                                                                                                                        SubLObject cdolist_list_var = weighted_genls;
                                                                                                                        SubLObject data = NIL;
                                                                                                                        for (data = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , data = cdolist_list_var.first()) {
                                                                                                                            score = add(score, cookie_data_score(data));
                                                                                                                        }
                                                                                                                        if (score.isPositive()) {
                                                                                                                            dictionary_utilities.dictionary_push(cookie_pack, denot, make_topic_struct_cookie($GENL_COUNT, score, weighted_genls));
                                                                                                                        }
                                                                                                                    }
                                                                                                                    {
                                                                                                                        SubLObject previous_count = topic_struct_cookie_score_for_denot(denot, cookie_pack);
                                                                                                                        SubLObject cr_terms = topic_struct_conceptually_related_denots(topic_struct, position, denot);
                                                                                                                        SubLObject cr_count = length(cr_terms);
                                                                                                                        if (cr_count.isPositive()) {
                                                                                                                            if (NIL != verboseP) {
                                                                                                                                Errors.warn($str_alt313$conceptuallyRelated__Increasing_c, denot, previous_count, add(previous_count, cr_count));
                                                                                                                            }
                                                                                                                            dictionary_utilities.dictionary_push(cookie_pack, denot, make_topic_struct_cookie($CONCEPTUALLY_RELATED, cr_count, cr_terms));
                                                                                                                        }
                                                                                                                    }
                                                                                                                    {
                                                                                                                        SubLObject previous_count = topic_struct_cookie_score_for_denot(denot, cookie_pack);
                                                                                                                        if (NIL != verboseP) {
                                                                                                                            Errors.warn($str_alt315$Checking_compositional_contributi, denot);
                                                                                                                        }
                                                                                                                        thread.resetMultipleValues();
                                                                                                                        {
                                                                                                                            SubLObject comp_score = topic_struct_word_compositional_contributor_score(topic_struct, position, denot);
                                                                                                                            SubLObject comp_parses = thread.secondMultipleValue();
                                                                                                                            thread.resetMultipleValues();
                                                                                                                            if (comp_score.isPositive()) {
                                                                                                                                if (NIL != verboseP) {
                                                                                                                                    Errors.warn($str_alt316$compositional_contribution__Incre, denot, previous_count, add(previous_count, comp_score));
                                                                                                                                }
                                                                                                                                dictionary_utilities.dictionary_push(cookie_pack, denot, make_topic_struct_cookie($COMPOSITIONAL_CONTRIBUTION, comp_score, comp_parses));
                                                                                                                            }
                                                                                                                        }
                                                                                                                    }
                                                                                                                    update_cookie_pack_multi_strategy_score_for_denot(cookie_pack, denot);
                                                                                                                }
                                                                                                            }
                                                                                                            dictionary.dictionary_enter(cookie_jar, position, cookie_pack);
                                                                                                            cfasl_utilities.cfasl_save_externalized(cookie_jar, partial_cookie_jar_file);
                                                                                                        }
                                                                                                    }
                                                                                                    done_count = add(done_count, ONE_INTEGER);
                                                                                                    if (true) {
                                                                                                        utilities_macros.note_percent_progress(done_count, word_count);
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                }
                                                                            }
                                                                        }
                                                                    } else {
                                                                        {
                                                                            SubLObject list_var = NIL;
                                                                            SubLObject sentence = NIL;
                                                                            SubLObject sentence_num = NIL;
                                                                            for (list_var = el_utilities.el_list_items(topic_struct), sentence = list_var.first(), sentence_num = ZERO_INTEGER; NIL != list_var; list_var = list_var.rest() , sentence = list_var.first() , sentence_num = add(ONE_INTEGER, sentence_num)) {
                                                                                {
                                                                                    SubLObject list_var_141 = NIL;
                                                                                    SubLObject word = NIL;
                                                                                    SubLObject word_num = NIL;
                                                                                    for (list_var_141 = el_utilities.el_list_items(sentence), word = list_var_141.first(), word_num = ZERO_INTEGER; NIL != list_var_141; list_var_141 = list_var_141.rest() , word = list_var_141.first() , word_num = add(ONE_INTEGER, word_num)) {
                                                                                        {
                                                                                            SubLObject position = list(sentence_num, word_num);
                                                                                            if ((NIL != topic_struct_word_ambiguous_p(word, NIL)) && (NIL == dictionary.dictionary_lookup(cookie_jar, position, UNPROVIDED))) {
                                                                                                {
                                                                                                    SubLObject cookie_pack = dictionary.new_dictionary(symbol_function(EQUAL), UNPROVIDED);
                                                                                                    SubLObject verboseP = topic_struct_verboseP();
                                                                                                    if (NIL != verboseP) {
                                                                                                        format(T, $str_alt309$_________A__________S_of__S___, new SubLObject[]{ topic_struct_word_string_in_context(topic_struct, position, TWO_INTEGER, TWO_INTEGER), dictionary.dictionary_length(cookie_jar), ambiguous_position_count });
                                                                                                    }
                                                                                                    {
                                                                                                        SubLObject csome_list_var = topic_struct_word_denots(word);
                                                                                                        SubLObject denot = NIL;
                                                                                                        for (denot = csome_list_var.first(); NIL != csome_list_var; csome_list_var = csome_list_var.rest() , denot = csome_list_var.first()) {
                                                                                                            dictionary.dictionary_enter(cookie_pack, denot, NIL);
                                                                                                            {
                                                                                                                SubLObject cdolist_list_var = $topic_struct_sibling_collections$.getGlobalValue();
                                                                                                                SubLObject col = NIL;
                                                                                                                for (col = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , col = cdolist_list_var.first()) {
                                                                                                                    thread.resetMultipleValues();
                                                                                                                    {
                                                                                                                        SubLObject score = sibling_score_wrt_nearest_isa_of_type(topic_struct, position, denot, col);
                                                                                                                        SubLObject data = thread.secondMultipleValue();
                                                                                                                        thread.resetMultipleValues();
                                                                                                                        if (score.isPositive()) {
                                                                                                                            dictionary_utilities.dictionary_push(cookie_pack, denot, make_topic_struct_cookie(list($SIBLING, col), score, data));
                                                                                                                        }
                                                                                                                    }
                                                                                                                }
                                                                                                            }
                                                                                                            {
                                                                                                                SubLObject weighted_isas = topic_struct_isas(topic_struct, position, denot);
                                                                                                                SubLObject score = ZERO_INTEGER;
                                                                                                                SubLObject cdolist_list_var = weighted_isas;
                                                                                                                SubLObject data = NIL;
                                                                                                                for (data = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , data = cdolist_list_var.first()) {
                                                                                                                    score = add(score, cookie_data_score(data));
                                                                                                                }
                                                                                                                if (score.isPositive()) {
                                                                                                                    dictionary_utilities.dictionary_push(cookie_pack, denot, make_topic_struct_cookie($ISA_COUNT, score, weighted_isas));
                                                                                                                }
                                                                                                            }
                                                                                                            {
                                                                                                                SubLObject weighted_genls = topic_struct_genls(topic_struct, position, denot);
                                                                                                                SubLObject score = ZERO_INTEGER;
                                                                                                                SubLObject cdolist_list_var = weighted_genls;
                                                                                                                SubLObject data = NIL;
                                                                                                                for (data = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , data = cdolist_list_var.first()) {
                                                                                                                    score = add(score, cookie_data_score(data));
                                                                                                                }
                                                                                                                if (score.isPositive()) {
                                                                                                                    dictionary_utilities.dictionary_push(cookie_pack, denot, make_topic_struct_cookie($GENL_COUNT, score, weighted_genls));
                                                                                                                }
                                                                                                            }
                                                                                                            {
                                                                                                                SubLObject previous_count = topic_struct_cookie_score_for_denot(denot, cookie_pack);
                                                                                                                SubLObject cr_terms = topic_struct_conceptually_related_denots(topic_struct, position, denot);
                                                                                                                SubLObject cr_count = length(cr_terms);
                                                                                                                if (cr_count.isPositive()) {
                                                                                                                    if (NIL != verboseP) {
                                                                                                                        Errors.warn($str_alt313$conceptuallyRelated__Increasing_c, denot, previous_count, add(previous_count, cr_count));
                                                                                                                    }
                                                                                                                    dictionary_utilities.dictionary_push(cookie_pack, denot, make_topic_struct_cookie($CONCEPTUALLY_RELATED, cr_count, cr_terms));
                                                                                                                }
                                                                                                            }
                                                                                                            {
                                                                                                                SubLObject previous_count = topic_struct_cookie_score_for_denot(denot, cookie_pack);
                                                                                                                if (NIL != verboseP) {
                                                                                                                    Errors.warn($str_alt315$Checking_compositional_contributi, denot);
                                                                                                                }
                                                                                                                thread.resetMultipleValues();
                                                                                                                {
                                                                                                                    SubLObject comp_score = topic_struct_word_compositional_contributor_score(topic_struct, position, denot);
                                                                                                                    SubLObject comp_parses = thread.secondMultipleValue();
                                                                                                                    thread.resetMultipleValues();
                                                                                                                    if (comp_score.isPositive()) {
                                                                                                                        if (NIL != verboseP) {
                                                                                                                            Errors.warn($str_alt316$compositional_contribution__Incre, denot, previous_count, add(previous_count, comp_score));
                                                                                                                        }
                                                                                                                        dictionary_utilities.dictionary_push(cookie_pack, denot, make_topic_struct_cookie($COMPOSITIONAL_CONTRIBUTION, comp_score, comp_parses));
                                                                                                                    }
                                                                                                                }
                                                                                                            }
                                                                                                            update_cookie_pack_multi_strategy_score_for_denot(cookie_pack, denot);
                                                                                                        }
                                                                                                    }
                                                                                                    dictionary.dictionary_enter(cookie_jar, position, cookie_pack);
                                                                                                    cfasl_utilities.cfasl_save_externalized(cookie_jar, partial_cookie_jar_file);
                                                                                                }
                                                                                            }
                                                                                            done_count = add(done_count, ONE_INTEGER);
                                                                                            if (true) {
                                                                                                utilities_macros.note_percent_progress(done_count, word_count);
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                    utilities_macros.noting_percent_progress_postamble();
                                                                } finally {
                                                                    utilities_macros.$percent_progress_start_time$.rebind(_prev_bind_4, thread);
                                                                    utilities_macros.$within_noting_percent_progress$.rebind(_prev_bind_3_138, thread);
                                                                    utilities_macros.$last_percent_progress_prediction$.rebind(_prev_bind_2_137, thread);
                                                                    utilities_macros.$last_percent_progress_index$.rebind(_prev_bind_1_136, thread);
                                                                    utilities_macros.$silent_progressP$.rebind(_prev_bind_0_135, thread);
                                                                }
                                                            }
                                                        }
                                                    } finally {
                                                        $topic_struct$.rebind(_prev_bind_3, thread);
                                                        mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_2_134, thread);
                                                        mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_1_133, thread);
                                                        mt_relevance_macros.$mt$.rebind(_prev_bind_0_132, thread);
                                                    }
                                                }
                                            }
                                        } finally {
                                            sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.rebind(_prev_bind_2, thread);
                                            sbhl_marking_vars.$resourced_sbhl_marking_spaces$.rebind(_prev_bind_1, thread);
                                            sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.rebind(_prev_bind_0_131, thread);
                                        }
                                    }
                                }
                            } finally {
                                {
                                    SubLObject _prev_bind_0_142 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                    try {
                                        $is_thread_performing_cleanupP$.bind(T, thread);
                                        if ((NIL != local_state) && (NIL == original_memoization_process)) {
                                            memoization_state.memoization_state_set_current_process_internal(local_state, NIL);
                                        }
                                    } finally {
                                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0_142, thread);
                                    }
                                }
                            }
                        }
                    } finally {
                        memoization_state.$memoization_state$.rebind(_prev_bind_0, thread);
                    }
                }
                cfasl_utilities.cfasl_save_externalized(cookie_jar, file_utilities.relative_filename(results_directory, $str_alt318$cookie_jar_cfasl, UNPROVIDED));
                if (NIL != Filesys.probe_file(partial_cookie_jar_file)) {
                    Filesys.delete_file(partial_cookie_jar_file);
                }
                describe_cookie_jar(cookie_jar, topic_struct, results_directory);
                return cookie_jar;
            }
        }
    }

    public static final SubLObject compute_cookie_score(SubLObject strategy, SubLObject data, SubLObject rescoring_map) {
        if (rescoring_map == UNPROVIDED) {
            rescoring_map = $topic_struct_parameter_value_map$.getDynamicValue();
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject pcase_var = strategy;
                if (pcase_var.eql($COMPOSITIONAL_CONTRIBUTION)) {
                    return compositional_contribution_cookie_score(data, rescoring_map);
                } else
                    if (pcase_var.eql($MULTI_STRATEGY_BONUS)) {
                        return multi_strategy_bonus_cookie_score(data, rescoring_map);
                    } else
                        if (pcase_var.eql($GENL_COUNT)) {
                            return genl_count_cookie_score(data, rescoring_map);
                        } else
                            if (pcase_var.eql($ISA_COUNT)) {
                                return isa_count_cookie_score(data, rescoring_map);
                            } else
                                if (pcase_var.eql($CONCEPTUALLY_RELATED)) {
                                    return conceptually_related_cookie_score(data, rescoring_map);
                                } else
                                    if (pcase_var.eql($SENTENTIAL_CONTRIBUTION)) {
                                        return sentential_contribution_cookie_score(data, rescoring_map);
                                    } else {
                                        thread.resetMultipleValues();
                                        {
                                            SubLObject success = pattern_match.tree_matches_pattern(strategy, $list_alt321);
                                            SubLObject v_bindings = thread.secondMultipleValue();
                                            thread.resetMultipleValues();
                                            if (NIL != success) {
                                                {
                                                    SubLObject sibling_type = list_utilities.alist_lookup_without_values(v_bindings, SIBLING_TYPE, UNPROVIDED, UNPROVIDED);
                                                    return sibling_cookie_score(sibling_type, data, rescoring_map);
                                                }
                                            }
                                        }
                                        Errors.error($str_alt323$Couldn_t_assign_a_cookie_score_fo, strategy);
                                    }





            }
            return NIL;
        }
    }

    /**
     *
     *
     * @return DICTIONARY-P; (Copy of) COOKIE-PACK rescored according to RESCORING-MAP
     */
    public static final SubLObject rescore_cookie_pack(SubLObject cookie_pack, SubLObject rescoring_map, SubLObject copyP) {
        if (rescoring_map == UNPROVIDED) {
            rescoring_map = $topic_struct_parameter_value_map$.getDynamicValue();
        }
        if (copyP == UNPROVIDED) {
            copyP = T;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject new_cookie_pack = (NIL != copyP) ? ((SubLObject) (dictionary.new_dictionary(symbol_function(EQUAL), UNPROVIDED))) : cookie_pack;
                SubLObject iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(cookie_pack));
                while (NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state)) {
                    thread.resetMultipleValues();
                    {
                        SubLObject denot = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                        SubLObject cookies = thread.secondMultipleValue();
                        thread.resetMultipleValues();
                        dictionary.dictionary_enter(new_cookie_pack, denot, rescore_cookies(cookies, rescoring_map));
                        iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state);
                    }
                } 
                dictionary_contents.do_dictionary_contents_finalize(iteration_state);
                return new_cookie_pack;
            }
        }
    }

    /**
     *
     *
     * @return LISTP; Copy of COOKIES rescored according to RESCORING-MAP
     */
    public static final SubLObject rescore_cookies(SubLObject cookies, SubLObject rescoring_map) {
        if (rescoring_map == UNPROVIDED) {
            rescoring_map = $topic_struct_parameter_value_map$.getDynamicValue();
        }
        {
            SubLObject new_cookies = NIL;
            SubLObject cdolist_list_var = cookies;
            SubLObject cookie = NIL;
            for (cookie = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , cookie = cdolist_list_var.first()) {
                new_cookies = cons(rescore_cookie(cookie, rescoring_map), new_cookies);
            }
            return nreverse(new_cookies);
        }
    }

    public static final SubLObject rescore_cookie(SubLObject cookie, SubLObject rescoring_map) {
        if (rescoring_map == UNPROVIDED) {
            rescoring_map = $topic_struct_parameter_value_map$.getDynamicValue();
        }
        {
            SubLObject datum = cookie;
            SubLObject current = datum;
            SubLObject strategy = NIL;
            SubLObject old_score = NIL;
            SubLObject data = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt324);
            strategy = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt324);
            old_score = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt324);
            data = current.first();
            current = current.rest();
            if (NIL == current) {
                {
                    SubLObject new_score = compute_cookie_score(strategy, data, rescoring_map);
                    return make_topic_struct_cookie(strategy, new_score, data);
                }
            } else {
                cdestructuring_bind_error(datum, $list_alt324);
            }
        }
        return NIL;
    }

    public static final SubLObject update_cookie_pack_multi_strategy_score_for_denot(SubLObject cookie_pack, SubLObject denot) {
        {
            SubLObject cookies = dictionary.dictionary_lookup(cookie_pack, denot, UNPROVIDED);
            SubLObject regular_cookies = remove($MULTI_STRATEGY_BONUS, cookies, symbol_function(EQL), FIRST, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            SubLObject strategies = Mapping.mapcar(FIRST, regular_cookies);
            SubLObject score = multi_strategy_bonus_cookie_score(strategies, UNPROVIDED);
            if (NIL != list_utilities.duplicatesP(strategies, UNPROVIDED, UNPROVIDED)) {
                Errors.sublisp_break($str_alt325$Duplicate_strategies_in_cookies_f, new SubLObject[]{ denot, regular_cookies });
            }
            if (score.isPositive()) {
                {
                    SubLObject bonus_cookie = make_topic_struct_cookie($MULTI_STRATEGY_BONUS, score, strategies);
                    dictionary.dictionary_enter(cookie_pack, denot, cons(bonus_cookie, regular_cookies));
                }
            }
            return score;
        }
    }

    public static final SubLObject multi_strategy_bonus_cookie_score(SubLObject data, SubLObject map) {
        if (map == UNPROVIDED) {
            map = $topic_struct_parameter_value_map$.getDynamicValue();
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject score = NIL;
                {
                    SubLObject _prev_bind_0 = $topic_struct_parameter_value_map$.currentBinding(thread);
                    try {
                        $topic_struct_parameter_value_map$.bind(map, thread);
                        score = multiply(number_utilities.f_1_(length(data)), multi_strategy_bonus());
                    } finally {
                        $topic_struct_parameter_value_map$.rebind(_prev_bind_0, thread);
                    }
                }
                return score;
            }
        }
    }

    public static final SubLObject topic_struct_cookie_p(SubLObject v_object) {
        return makeBoolean(v_object.isList() && (NIL != list_utilities.lengthE(v_object, THREE_INTEGER, UNPROVIDED)));
    }

    public static final SubLObject make_topic_struct_cookie(SubLObject strategy, SubLObject score, SubLObject data) {
        if (data == UNPROVIDED) {
            data = NIL;
        }
        return list(strategy, score, data);
    }

    public static final SubLObject topic_struct_cookie_score_for_denot(SubLObject denot, SubLObject cookie_pack) {
        return topic_struct_score_from_cookies(dictionary.dictionary_lookup(cookie_pack, denot, NIL));
    }

    public static final SubLObject topic_struct_score_from_cookies(SubLObject cookies) {
        {
            SubLObject score = ZERO_INTEGER;
            SubLObject cdolist_list_var = cookies;
            SubLObject cookie = NIL;
            for (cookie = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , cookie = cdolist_list_var.first()) {
                score = add(score, cookie_score(cookie));
            }
            return score;
        }
    }

    public static final SubLObject cookie_strategy(SubLObject cookie) {
        SubLTrampolineFile.checkType(cookie, TOPIC_STRUCT_COOKIE_P);
        return cookie.first();
    }

    public static final SubLObject cookie_score(SubLObject cookie) {
        SubLTrampolineFile.checkType(cookie, TOPIC_STRUCT_COOKIE_P);
        return second(cookie);
    }

    public static final SubLObject cookie_data(SubLObject cookie) {
        SubLTrampolineFile.checkType(cookie, TOPIC_STRUCT_COOKIE_P);
        return third(cookie);
    }

    public static final SubLObject cookie_score_G(SubLObject cookies1, SubLObject cookies2) {
        return numG(topic_struct_score_from_cookies(cookies1), topic_struct_score_from_cookies(cookies2));
    }

    public static final SubLObject topic_struct_test_results_file_name(SubLObject topic_struct, SubLObject directory) {
        if (directory == UNPROVIDED) {
            directory = file_utilities.cyc_home_subdirectory(NIL);
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject name_min_length = TEN_INTEGER;
                SubLObject name = string_utilities.$empty_string$.getGlobalValue();
                SubLObject doneP = NIL;
                SubLObject done_count = ZERO_INTEGER;
                SubLObject word_count = NIL;
                {
                    SubLObject _prev_bind_0 = utilities_macros.$silent_progressP$.currentBinding(thread);
                    SubLObject _prev_bind_1 = utilities_macros.$last_percent_progress_index$.currentBinding(thread);
                    SubLObject _prev_bind_2 = utilities_macros.$last_percent_progress_prediction$.currentBinding(thread);
                    SubLObject _prev_bind_3 = utilities_macros.$within_noting_percent_progress$.currentBinding(thread);
                    SubLObject _prev_bind_4 = utilities_macros.$percent_progress_start_time$.currentBinding(thread);
                    try {
                        utilities_macros.$silent_progressP$.bind(makeBoolean((NIL != utilities_macros.$silent_progressP$.getDynamicValue(thread)) || true), thread);
                        utilities_macros.$last_percent_progress_index$.bind(ZERO_INTEGER, thread);
                        utilities_macros.$last_percent_progress_prediction$.bind(NIL, thread);
                        utilities_macros.$within_noting_percent_progress$.bind(T, thread);
                        utilities_macros.$percent_progress_start_time$.bind(get_universal_time(), thread);
                        utilities_macros.noting_percent_progress_preamble(NIL);
                        if (NIL != topic_struct_document_p(topic_struct)) {
                            {
                                SubLObject list_var = NIL;
                                SubLObject paragraph_topic_struct = NIL;
                                SubLObject paragraph_num = NIL;
                                for (list_var = document_topic_struct_paragraph_structs(topic_struct), paragraph_topic_struct = list_var.first(), paragraph_num = ZERO_INTEGER; NIL != list_var; list_var = list_var.rest() , paragraph_topic_struct = list_var.first() , paragraph_num = add(ONE_INTEGER, paragraph_num)) {
                                    {
                                        SubLObject list_var_143 = NIL;
                                        SubLObject sentence = NIL;
                                        SubLObject sentence_num = NIL;
                                        for (list_var_143 = el_utilities.el_list_items(paragraph_topic_struct), sentence = list_var_143.first(), sentence_num = ZERO_INTEGER; NIL != list_var_143; list_var_143 = list_var_143.rest() , sentence = list_var_143.first() , sentence_num = add(ONE_INTEGER, sentence_num)) {
                                            {
                                                SubLObject list_var_144 = NIL;
                                                SubLObject word = NIL;
                                                SubLObject word_num = NIL;
                                                for (list_var_144 = el_utilities.el_list_items(sentence), word = list_var_144.first(), word_num = ZERO_INTEGER; NIL != list_var_144; list_var_144 = list_var_144.rest() , word = list_var_144.first() , word_num = add(ONE_INTEGER, word_num)) {
                                                    {
                                                        SubLObject subposition = list(sentence_num, word_num);
                                                        SubLObject position = cons(paragraph_num, subposition);
                                                        if (NIL == doneP) {
                                                            if (NIL != list_utilities.lengthL(name, name_min_length, UNPROVIDED)) {
                                                                name = cconcatenate(name, Strings.string_downcase(list_utilities.remove_if_not(ALPHANUMERICP, topic_struct_word_string(word), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED), UNPROVIDED, UNPROVIDED));
                                                            } else
                                                                if (NIL == Filesys.probe_file(file_utilities.relative_filename(directory, name, UNPROVIDED))) {
                                                                    doneP = T;
                                                                } else {
                                                                    {
                                                                        SubLObject base = name;
                                                                        SubLObject doneP_145 = NIL;
                                                                        if (NIL == doneP_145) {
                                                                            {
                                                                                SubLObject ext = NIL;
                                                                                for (ext = ONE_INTEGER; NIL == doneP_145; ext = number_utilities.f_1X(ext)) {
                                                                                    name = format(NIL, $str_alt328$_A__3__0D, base, ext);
                                                                                    if (NIL == Filesys.probe_file(file_utilities.relative_filename(directory, name, UNPROVIDED))) {
                                                                                        doneP_145 = T;
                                                                                    }
                                                                                }
                                                                            }
                                                                        }
                                                                        doneP_145 = T;
                                                                    }
                                                                }

                                                        }
                                                        done_count = add(done_count, ONE_INTEGER);
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        } else {
                            {
                                SubLObject list_var = NIL;
                                SubLObject sentence = NIL;
                                SubLObject sentence_num = NIL;
                                for (list_var = el_utilities.el_list_items(topic_struct), sentence = list_var.first(), sentence_num = ZERO_INTEGER; NIL != list_var; list_var = list_var.rest() , sentence = list_var.first() , sentence_num = add(ONE_INTEGER, sentence_num)) {
                                    {
                                        SubLObject list_var_146 = NIL;
                                        SubLObject word = NIL;
                                        SubLObject word_num = NIL;
                                        for (list_var_146 = el_utilities.el_list_items(sentence), word = list_var_146.first(), word_num = ZERO_INTEGER; NIL != list_var_146; list_var_146 = list_var_146.rest() , word = list_var_146.first() , word_num = add(ONE_INTEGER, word_num)) {
                                            {
                                                SubLObject position = list(sentence_num, word_num);
                                                if (NIL == doneP) {
                                                    if (NIL != list_utilities.lengthL(name, name_min_length, UNPROVIDED)) {
                                                        name = cconcatenate(name, Strings.string_downcase(list_utilities.remove_if_not(ALPHANUMERICP, topic_struct_word_string(word), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED), UNPROVIDED, UNPROVIDED));
                                                    } else
                                                        if (NIL == Filesys.probe_file(file_utilities.relative_filename(directory, name, UNPROVIDED))) {
                                                            doneP = T;
                                                        } else {
                                                            {
                                                                SubLObject base = name;
                                                                SubLObject doneP_147 = NIL;
                                                                if (NIL == doneP_147) {
                                                                    {
                                                                        SubLObject ext = NIL;
                                                                        for (ext = ONE_INTEGER; NIL == doneP_147; ext = number_utilities.f_1X(ext)) {
                                                                            name = format(NIL, $str_alt328$_A__3__0D, base, ext);
                                                                            if (NIL == Filesys.probe_file(file_utilities.relative_filename(directory, name, UNPROVIDED))) {
                                                                                doneP_147 = T;
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                                doneP_147 = T;
                                                            }
                                                        }

                                                }
                                                done_count = add(done_count, ONE_INTEGER);
                                            }
                                        }
                                    }
                                }
                            }
                        }
                        utilities_macros.noting_percent_progress_postamble();
                    } finally {
                        utilities_macros.$percent_progress_start_time$.rebind(_prev_bind_4, thread);
                        utilities_macros.$within_noting_percent_progress$.rebind(_prev_bind_3, thread);
                        utilities_macros.$last_percent_progress_prediction$.rebind(_prev_bind_2, thread);
                        utilities_macros.$last_percent_progress_index$.rebind(_prev_bind_1, thread);
                        utilities_macros.$silent_progressP$.rebind(_prev_bind_0, thread);
                    }
                }
                return name;
            }
        }
    }

    // deflexical
    private static final SubLSymbol $topic_struct_output_initial_column_headers$ = makeSymbol("*TOPIC-STRUCT-OUTPUT-INITIAL-COLUMN-HEADERS*");

    // deflexical
    private static final SubLSymbol $topic_struct_output_result_category_column_headers$ = makeSymbol("*TOPIC-STRUCT-OUTPUT-RESULT-CATEGORY-COLUMN-HEADERS*");



    public static final SubLObject clear_topic_struct_output_column_headers() {
        {
            SubLObject cs = $topic_struct_output_column_headers_caching_state$.getGlobalValue();
            if (NIL != cs) {
                memoization_state.caching_state_clear(cs);
            }
        }
        return NIL;
    }

    public static final SubLObject remove_topic_struct_output_column_headers() {
        return memoization_state.caching_state_remove_function_results_with_args($topic_struct_output_column_headers_caching_state$.getGlobalValue(), list(EMPTY_SUBL_OBJECT_ARRAY), UNPROVIDED, UNPROVIDED);
    }

    public static final SubLObject topic_struct_output_column_headers_internal() {
        return append($topic_struct_output_initial_column_headers$.getGlobalValue(), $topic_struct_output_result_category_column_headers$.getGlobalValue());
    }

    public static final SubLObject topic_struct_output_column_headers() {
        {
            SubLObject caching_state = $topic_struct_output_column_headers_caching_state$.getGlobalValue();
            if (NIL == caching_state) {
                caching_state = memoization_state.create_global_caching_state_for_name(TOPIC_STRUCT_OUTPUT_COLUMN_HEADERS, $topic_struct_output_column_headers_caching_state$, NIL, EQL, ZERO_INTEGER, ZERO_INTEGER);
            }
            {
                SubLObject results = memoization_state.caching_state_get_zero_arg_results(caching_state, UNPROVIDED);
                if (results == $kw19$_MEMOIZED_ITEM_NOT_FOUND_) {
                    results = arg2(resetMultipleValues(), multiple_value_list(topic_struct_output_column_headers_internal()));
                    memoization_state.caching_state_set_zero_arg_results(caching_state, results, UNPROVIDED);
                }
                return memoization_state.caching_results(results);
            }
        }
    }

    public static final SubLObject categorize_topic_struct_result(SubLObject high_scorer_count, SubLObject high_score, SubLObject correct_presentP, SubLObject got_it_rightP) {
        {
            SubLObject scores = NIL;
            if (!ONE_INTEGER.eql(high_scorer_count)) {
                if (NIL == correct_presentP) {
                    scores = list_utilities.alist_enter(scores, $WINNER_NO_CORRECT, ONE_INTEGER, UNPROVIDED);
                } else
                    if (NIL == got_it_rightP) {
                        scores = list_utilities.alist_enter(scores, $WINNER_INCORRECT, ONE_INTEGER, UNPROVIDED);
                    } else {
                        {
                            SubLObject chance_right = divide(ONE_INTEGER, high_scorer_count);
                            SubLObject chance_wrong = subtract(ONE_INTEGER, chance_right);
                            scores = list_utilities.alist_enter(scores, $WINNER_CORRECT, chance_right, UNPROVIDED);
                            scores = list_utilities.alist_enter(scores, $WINNER_INCORRECT, chance_wrong, UNPROVIDED);
                        }
                    }

                Errors.warn($str_alt336$Result_of_random_pick_simulation_, scores);
            }
            if (high_score.isZero()) {
                scores = list_utilities.alist_enter(scores, NIL != correct_presentP ? ((SubLObject) ($NO_COOKIES_CORRECT)) : $NO_COOKIES_NO_CORRECT, ONE_INTEGER, UNPROVIDED);
            } else
                if (high_scorer_count.numG(ONE_INTEGER)) {
                    scores = list_utilities.alist_enter(scores, NIL != correct_presentP ? ((SubLObject) (NIL != got_it_rightP ? ((SubLObject) ($TIE_CORRECT)) : $TIE_INCORRECT)) : $TIE_NO_CORRECT, ONE_INTEGER, UNPROVIDED);
                } else {
                    scores = list_utilities.alist_enter(scores, NIL != correct_presentP ? ((SubLObject) (NIL != got_it_rightP ? ((SubLObject) ($WINNER_CORRECT)) : $WINNER_INCORRECT)) : $WINNER_NO_CORRECT, ONE_INTEGER, UNPROVIDED);
                }

            return scores;
        }
    }

    // deflexical
    private static final SubLSymbol $topic_struct_results_file_delimiter$ = makeSymbol("*TOPIC-STRUCT-RESULTS-FILE-DELIMITER*");

    public static final SubLObject output_topic_struct_results_header(SubLObject results_stream) {
        {
            SubLObject total = length(topic_struct_output_column_headers());
            SubLObject current_num = ONE_INTEGER;
            SubLObject cdolist_list_var = topic_struct_output_column_headers();
            SubLObject cons = NIL;
            for (cons = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , cons = cdolist_list_var.first()) {
                {
                    SubLObject datum = cons;
                    SubLObject current = datum;
                    SubLObject key = NIL;
                    SubLObject label = NIL;
                    destructuring_bind_must_consp(current, datum, $list_alt343);
                    key = current.first();
                    current = current.rest();
                    label = current;
                    princ(label, results_stream);
                    if (current_num.eql(total)) {
                        terpri(results_stream);
                    } else {
                        princ($topic_struct_results_file_delimiter$.getGlobalValue(), results_stream);
                    }
                    current_num = add(current_num, ONE_INTEGER);
                }
            }
        }
        return NIL;
    }

    public static final SubLObject describe_cookie_jar(SubLObject cookie_jar, SubLObject topic_struct, SubLObject results_directory) {
        if (results_directory == UNPROVIDED) {
            results_directory = file_utilities.cyc_home_subdirectory(NIL);
        }
        {
            SubLObject ambiguous_position_count = ZERO_INTEGER;
            SubLObject partial_disambiguation_count = ZERO_INTEGER;
            SubLObject clear_winner_count = ZERO_INTEGER;
            SubLObject results_file = file_utilities.relative_filename(results_directory, topic_struct_test_results_file_name(topic_struct, results_directory), UNPROVIDED);
            SubLObject results_file_delimiter = $topic_struct_results_file_delimiter$.getGlobalValue();
            if (NIL == Filesys.directory_p(results_directory)) {
                file_utilities.make_directory_recursive(results_directory, NIL, $$$775);
            }
            Errors.warn($str_alt344$Logging_results_to__S, results_file);
            {
                SubLObject stream = NIL;
                try {
                    stream = compatibility.open_text(results_file, $OUTPUT, NIL);
                    if (!stream.isStream()) {
                        Errors.error($str_alt346$Unable_to_open__S, results_file);
                    }
                    {
                        SubLObject results_stream = stream;
                        SubLObject cdolist_list_var = dictionary_utilities.sort_dictionary_by_keys(cookie_jar, $sym358$TOPIC_STRUCT_POSITION__);
                        SubLObject cons = NIL;
                        for (cons = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , cons = cdolist_list_var.first()) {
                            {
                                SubLObject datum = cons;
                                SubLObject current = datum;
                                SubLObject position = NIL;
                                SubLObject cookie_pack = NIL;
                                destructuring_bind_must_consp(current, datum, $list_alt347);
                                position = current.first();
                                current = current.rest();
                                cookie_pack = current;
                                ambiguous_position_count = add(ambiguous_position_count, ONE_INTEGER);
                                {
                                    SubLObject string = topic_struct_word_string_in_context(topic_struct, position, TWO_INTEGER, TWO_INTEGER);
                                    SubLObject high_score = ZERO_INTEGER;
                                    SubLObject previous_score = NIL;
                                    SubLObject previous_rank = NIL;
                                    SubLObject correct_denots = topic_struct_position_correct_denots(topic_struct, position);
                                    SubLObject correct_presentP = NIL;
                                    SubLObject got_it_rightP = NIL;
                                    SubLObject high_scorer_count = ZERO_INTEGER;
                                    SubLObject candidate_count = dictionary.dictionary_length(cookie_pack);
                                    SubLObject total = ZERO_INTEGER;
                                    format(T, $str_alt348$_____________A______________, string);
                                    output_topic_struct_results_header(results_stream);
                                    {
                                        SubLObject cdolist_list_var_148 = dictionary_utilities.sort_dictionary_by_values(cookie_pack, $sym356$COOKIE_SCORE__);
                                        SubLObject cons_149 = NIL;
                                        for (cons_149 = cdolist_list_var_148.first(); NIL != cdolist_list_var_148; cdolist_list_var_148 = cdolist_list_var_148.rest() , cons_149 = cdolist_list_var_148.first()) {
                                            {
                                                SubLObject datum_150 = cons_149;
                                                SubLObject current_151 = datum_150;
                                                SubLObject denot = NIL;
                                                SubLObject cookies = NIL;
                                                destructuring_bind_must_consp(current_151, datum_150, $list_alt349);
                                                denot = current_151.first();
                                                current_151 = current_151.rest();
                                                cookies = current_151;
                                                total = add(total, ONE_INTEGER);
                                                {
                                                    SubLObject score = topic_struct_score_from_cookies(cookies);
                                                    SubLObject last_oneP = eql(total, candidate_count);
                                                    SubLObject correctP = subl_promotions.memberP(denot, correct_denots, symbol_function(EQUAL), UNPROVIDED);
                                                    SubLObject rank = (score.eql(previous_score)) ? ((SubLObject) (previous_rank)) : total;
                                                    if (score.numG(high_score)) {
                                                        high_score = score;
                                                        high_scorer_count = ONE_INTEGER;
                                                    } else
                                                        if (score.numE(high_score)) {
                                                            high_scorer_count = add(high_scorer_count, ONE_INTEGER);
                                                        }

                                                    format(T, $str_alt350$___S____3F__, denot, score);
                                                    format(results_stream, $str_alt351$_A_A_A_A__3F, new SubLObject[]{ string, results_file_delimiter, denot, results_file_delimiter, score });
                                                    if (NIL != correctP) {
                                                        correct_presentP = T;
                                                        if (score.numE(high_score)) {
                                                            got_it_rightP = T;
                                                        }
                                                    }
                                                    {
                                                        SubLObject winnerP = makeBoolean(score.numE(high_score) && high_score.numG(ZERO_INTEGER));
                                                        format(results_stream, $str_alt352$_A_A, results_file_delimiter, NIL != winnerP ? ((SubLObject) ($$$Winner)) : string_utilities.$empty_string$.getGlobalValue());
                                                    }
                                                    format(results_stream, $str_alt352$_A_A, results_file_delimiter, NIL != correctP ? ((SubLObject) ($$$Correct)) : string_utilities.$empty_string$.getGlobalValue());
                                                    format(results_stream, $str_alt352$_A_A, results_file_delimiter, NIL != correctP ? ((SubLObject) (rank)) : string_utilities.$empty_string$.getGlobalValue());
                                                    if (NIL == last_oneP) {
                                                        terpri(results_stream);
                                                    }
                                                    {
                                                        SubLObject cdolist_list_var_152 = cookies;
                                                        SubLObject cookie = NIL;
                                                        for (cookie = cdolist_list_var_152.first(); NIL != cdolist_list_var_152; cdolist_list_var_152 = cdolist_list_var_152.rest() , cookie = cdolist_list_var_152.first()) {
                                                            format(T, $str_alt355$____S__, cookie);
                                                        }
                                                    }
                                                    previous_score = score;
                                                    previous_rank = rank;
                                                }
                                            }
                                        }
                                    }
                                    format(results_stream, $str_alt352$_A_A, results_file_delimiter, NIL != correct_presentP ? ((SubLObject) (total)) : string_utilities.$empty_string$.getGlobalValue());
                                    format(results_stream, $str_alt352$_A_A, results_file_delimiter, string_utilities.$empty_string$.getGlobalValue());
                                    {
                                        SubLObject result_type_scores = categorize_topic_struct_result(high_scorer_count, high_score, correct_presentP, got_it_rightP);
                                        SubLObject cdolist_list_var_153 = $topic_struct_output_result_category_column_headers$.getGlobalValue();
                                        SubLObject cons_154 = NIL;
                                        for (cons_154 = cdolist_list_var_153.first(); NIL != cdolist_list_var_153; cdolist_list_var_153 = cdolist_list_var_153.rest() , cons_154 = cdolist_list_var_153.first()) {
                                            {
                                                SubLObject datum_155 = cons_154;
                                                SubLObject current_156 = datum_155;
                                                SubLObject result_type = NIL;
                                                SubLObject value = NIL;
                                                destructuring_bind_must_consp(current_156, datum_155, $list_alt357);
                                                result_type = current_156.first();
                                                current_156 = current_156.rest();
                                                value = current_156;
                                                {
                                                    SubLObject this_type_score = list_utilities.alist_lookup_without_values(result_type_scores, result_type, symbol_function(EQL), string_utilities.$empty_string$.getGlobalValue());
                                                    format(results_stream, $str_alt352$_A_A, results_file_delimiter, this_type_score);
                                                }
                                            }
                                        }
                                    }
                                    terpri(results_stream);
                                    if (high_scorer_count.eql(ONE_INTEGER)) {
                                        clear_winner_count = add(clear_winner_count, ONE_INTEGER);
                                    } else
                                        if (high_scorer_count.numL(total)) {
                                            partial_disambiguation_count = add(partial_disambiguation_count, ONE_INTEGER);
                                        }

                                }
                            }
                        }
                    }
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            if (stream.isStream()) {
                                close(stream, UNPROVIDED);
                            }
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            }
            format(T, $str_alt359$__Of__S_ambiguous_positions___S_c, new SubLObject[]{ ambiguous_position_count, clear_winner_count, partial_disambiguation_count });
        }
        return cookie_jar;
    }

    public static final SubLObject topic_struct_position_L(SubLObject pos1, SubLObject pos2) {
        {
            SubLObject ans = NIL;
            SubLObject doneP = NIL;
            if (NIL == doneP) {
                {
                    SubLObject i1 = NIL;
                    SubLObject i1_157 = NIL;
                    SubLObject i2 = NIL;
                    SubLObject i2_158 = NIL;
                    for (i1 = pos1, i1_157 = i1.first(), i2 = pos2, i2_158 = i2.first(); !((NIL != doneP) || ((NIL == i2) && (NIL == i1))); i1 = i1.rest() , i1_157 = i1.first() , i2 = i2.rest() , i2_158 = i2.first()) {
                        if (i1_157.numL(i2_158)) {
                            ans = T;
                            doneP = T;
                        } else
                            if (i1_157.numG(i2_158)) {
                                doneP = T;
                            }

                    }
                }
            }
            return ans;
        }
    }

    public static final SubLObject update_cookie_jar_for_sentence_level_results(SubLObject cookie_jar, SubLObject topic_struct, SubLObject sentence_level_results, SubLObject verboseP, SubLObject params) {
        if (verboseP == UNPROVIDED) {
            verboseP = NIL;
        }
        if (params == UNPROVIDED) {
            params = $DEFAULT;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(cookie_jar));
                while (NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state)) {
                    thread.resetMultipleValues();
                    {
                        SubLObject position = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                        SubLObject cookie_pack = thread.secondMultipleValue();
                        thread.resetMultipleValues();
                        {
                            SubLObject sentence_position = butlast(position, UNPROVIDED);
                            SubLObject sentence_results = dictionary.dictionary_lookup(sentence_level_results, sentence_position, UNPROVIDED);
                            SubLObject initial_scores = NIL;
                            SubLObject revised_scores = NIL;
                            SubLObject changedP = NIL;
                            SubLObject iteration_state_159 = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(cookie_pack));
                            while (NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state_159)) {
                                thread.resetMultipleValues();
                                {
                                    SubLObject denot = dictionary_contents.do_dictionary_contents_key_value(iteration_state_159);
                                    SubLObject cookies = thread.secondMultipleValue();
                                    thread.resetMultipleValues();
                                    {
                                        SubLObject previous_count = topic_struct_score_from_cookies(cookies);
                                        SubLObject new_count = previous_count;
                                        initial_scores = list_utilities.alist_enter(initial_scores, denot, previous_count, UNPROVIDED);
                                        thread.resetMultipleValues();
                                        {
                                            SubLObject sent_score = topic_struct_denot_sentential_contribution_score(denot, sentence_results, params);
                                            SubLObject sent_parses = thread.secondMultipleValue();
                                            thread.resetMultipleValues();
                                            if (!sent_score.isZero()) {
                                                new_count = add(previous_count, sent_score);
                                                changedP = T;
                                                dictionary_utilities.dictionary_push(cookie_pack, denot, make_topic_struct_cookie($SENTENTIAL_CONTRIBUTION, sent_score, sent_parses));
                                                update_cookie_pack_multi_strategy_score_for_denot(cookie_pack, denot);
                                            }
                                        }
                                        revised_scores = list_utilities.alist_enter(revised_scores, denot, new_count, UNPROVIDED);
                                    }
                                    iteration_state_159 = dictionary_contents.do_dictionary_contents_next(iteration_state_159);
                                }
                            } 
                            dictionary_contents.do_dictionary_contents_finalize(iteration_state_159);
                            if ((NIL != verboseP) && (NIL != changedP)) {
                                {
                                    SubLObject string = topic_struct_word_string_in_context(topic_struct, position, TWO_INTEGER, TWO_INTEGER);
                                    Errors.warn($str_alt361$Scores_changed_for__S, string);
                                    format(T, $str_alt362$__Sentence_results_____S, sentence_results);
                                    {
                                        SubLObject cdolist_list_var = list_utilities.sort_alist_by_values(initial_scores, symbol_function($sym277$_));
                                        SubLObject pair = NIL;
                                        for (pair = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , pair = cdolist_list_var.first()) {
                                            format(T, $str_alt363$___S_____S__, pair.first(), pair.rest());
                                        }
                                    }
                                    format(T, $str_alt364$_________________________________);
                                    {
                                        SubLObject cdolist_list_var = list_utilities.sort_alist_by_values(revised_scores, symbol_function($sym277$_));
                                        SubLObject pair = NIL;
                                        for (pair = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , pair = cdolist_list_var.first()) {
                                            format(T, $str_alt363$___S_____S__, pair.first(), pair.rest());
                                        }
                                    }
                                }
                            }
                        }
                        iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state);
                    }
                } 
                dictionary_contents.do_dictionary_contents_finalize(iteration_state);
            }
            return cookie_jar;
        }
    }

    public static final SubLObject sentential_contribution_cookie_score(SubLObject labeled_parses, SubLObject map) {
        if (map == UNPROVIDED) {
            map = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject score = ZERO_INTEGER;
                {
                    SubLObject _prev_bind_0 = $topic_struct_parameter_value_map$.currentBinding(thread);
                    try {
                        $topic_struct_parameter_value_map$.bind(map, thread);
                        {
                            SubLObject cdolist_list_var = labeled_parses;
                            SubLObject labeled_parse = NIL;
                            for (labeled_parse = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , labeled_parse = cdolist_list_var.first()) {
                                {
                                    SubLObject pcase_var = labeled_parse.first();
                                    if (pcase_var.eql($GOOD)) {
                                        score = add(score, sentential_contribution_good_score());
                                    } else
                                        if (pcase_var.eql($MAYBE)) {
                                            score = add(score, sentential_contribution_maybe_score());
                                        } else
                                            if (pcase_var.eql($BAD)) {
                                                score = add(score, sentential_contribution_bad_score());
                                            }


                                }
                            }
                        }
                    } finally {
                        $topic_struct_parameter_value_map$.rebind(_prev_bind_0, thread);
                    }
                }
                return score;
            }
        }
    }

    /**
     * Cookies for good, consistent, and bad sentence-level (partial) parses a term appears in
     */
    // defparameter
    private static final SubLSymbol $sentential_contribution_values$ = makeSymbol("*SENTENTIAL-CONTRIBUTION-VALUES*");

    public static final SubLObject sentential_contribution_values(SubLObject params) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            return $DEFAULT == params ? ((SubLObject) ($sentential_contribution_values$.getDynamicValue(thread))) : params;
        }
    }

    public static final SubLObject topic_struct_denot_sentential_contribution_score(SubLObject found_denot, SubLObject sentence_results, SubLObject params) {
        if (params == UNPROVIDED) {
            params = $DEFAULT;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject labeled_parses = NIL;
                SubLObject denot = found_denot;
                SubLObject datum = sentence_results;
                SubLObject current = datum;
                SubLObject good_tail = property_list_member($GOOD, current);
                SubLObject good = (NIL != good_tail) ? ((SubLObject) (cadr(good_tail))) : NIL;
                SubLObject maybe_tail = property_list_member($MAYBE, current);
                SubLObject maybe = (NIL != maybe_tail) ? ((SubLObject) (cadr(maybe_tail))) : NIL;
                SubLObject bad_tail = property_list_member($BAD, current);
                SubLObject bad = (NIL != bad_tail) ? ((SubLObject) (cadr(bad_tail))) : NIL;
                {
                    SubLObject _prev_bind_0 = cycl_utilities.$opaque_arg_function$.currentBinding(thread);
                    try {
                        cycl_utilities.$opaque_arg_function$.bind(FALSE, thread);
                        {
                            SubLObject good_with_denot = NIL;
                            SubLObject cdolist_list_var = good;
                            SubLObject good_parse = NIL;
                            for (good_parse = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , good_parse = cdolist_list_var.first()) {
                                if ((!good_parse.equal(listS($$isa, denot, $list_alt371))) && (NIL != cycl_utilities.expression_find(denot, good_parse, $sym372$NAT_SMART_TERM__, UNPROVIDED, UNPROVIDED))) {
                                    good_with_denot = cons(good_parse, good_with_denot);
                                }
                            }
                            if (NIL != good_with_denot) {
                                labeled_parses = cons(list($GOOD, good_with_denot), labeled_parses);
                            }
                        }
                        {
                            SubLObject maybe_with_denot = NIL;
                            SubLObject cdolist_list_var = maybe;
                            SubLObject maybe_parse = NIL;
                            for (maybe_parse = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , maybe_parse = cdolist_list_var.first()) {
                                if (NIL != cycl_utilities.expression_find(denot, maybe_parse, $sym372$NAT_SMART_TERM__, UNPROVIDED, UNPROVIDED)) {
                                    maybe_with_denot = cons(maybe_parse, maybe_with_denot);
                                }
                            }
                            if (NIL != maybe_with_denot) {
                                labeled_parses = cons(list($MAYBE, maybe_with_denot), labeled_parses);
                            }
                        }
                        {
                            SubLObject bad_with_denot = NIL;
                            SubLObject cdolist_list_var = bad;
                            SubLObject bad_parse = NIL;
                            for (bad_parse = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , bad_parse = cdolist_list_var.first()) {
                                if (NIL != cycl_utilities.expression_find(denot, bad_parse, $sym372$NAT_SMART_TERM__, UNPROVIDED, UNPROVIDED)) {
                                    bad_with_denot = cons(bad_parse, bad_with_denot);
                                }
                            }
                            if (NIL != bad_with_denot) {
                                labeled_parses = cons(list($BAD, bad_with_denot), labeled_parses);
                            }
                        }
                    } finally {
                        cycl_utilities.$opaque_arg_function$.rebind(_prev_bind_0, thread);
                    }
                }
                {
                    SubLObject score = NIL;
                    SubLObject datum_160 = sentential_contribution_values(params);
                    SubLObject current_161 = datum_160;
                    SubLObject good_cookies = NIL;
                    SubLObject maybe_cookies = NIL;
                    SubLObject bad_cookies = NIL;
                    destructuring_bind_must_consp(current_161, datum_160, $list_alt373);
                    good_cookies = current_161.first();
                    current_161 = current_161.rest();
                    destructuring_bind_must_consp(current_161, datum_160, $list_alt373);
                    maybe_cookies = current_161.first();
                    current_161 = current_161.rest();
                    destructuring_bind_must_consp(current_161, datum_160, $list_alt373);
                    bad_cookies = current_161.first();
                    current_161 = current_161.rest();
                    if (NIL == current_161) {
                        {
                            SubLObject map = list(bq_cons($sentential_contribution_good_score$, good_cookies), bq_cons($sentential_contribution_maybe_score$, maybe_cookies), bq_cons($sentential_contribution_bad_score$, bad_cookies));
                            score = sentential_contribution_cookie_score(labeled_parses, map);
                        }
                    } else {
                        cdestructuring_bind_error(datum_160, $list_alt373);
                    }
                    return values(score, labeled_parses);
                }
            }
        }
    }

    public static final SubLObject nat_smart_term_E(SubLObject term1, SubLObject term2) {
        return makeBoolean((term1.equal(term2) || ((NIL != nart_handles.nart_p(term1)) && term2.equal(narts_high.nart_hl_formula(term1)))) || ((NIL != nart_handles.nart_p(term2)) && term1.equal(narts_high.nart_hl_formula(term2))));
    }



    public static final SubLObject clear_round_param_value() {
        {
            SubLObject cs = $round_param_value_caching_state$.getGlobalValue();
            if (NIL != cs) {
                memoization_state.caching_state_clear(cs);
            }
        }
        return NIL;
    }

    public static final SubLObject remove_round_param_value(SubLObject value, SubLObject delta) {
        if (delta == UNPROVIDED) {
            delta = $float$0_1;
        }
        return memoization_state.caching_state_remove_function_results_with_args($round_param_value_caching_state$.getGlobalValue(), list(value, delta), UNPROVIDED, UNPROVIDED);
    }

    public static final SubLObject round_param_value_internal(SubLObject value, SubLObject delta) {
        {
            SubLObject sig = number_utilities.significant_digits(value, THREE_INTEGER);
            return abs(sig).numL(delta) ? ((SubLObject) (ZERO_INTEGER)) : sig;
        }
    }

    public static final SubLObject round_param_value(SubLObject value, SubLObject delta) {
        if (delta == UNPROVIDED) {
            delta = $float$0_1;
        }
        {
            SubLObject caching_state = $round_param_value_caching_state$.getGlobalValue();
            if (NIL == caching_state) {
                caching_state = memoization_state.create_global_caching_state_for_name(ROUND_PARAM_VALUE, $round_param_value_caching_state$, NIL, EQL, TWO_INTEGER, ZERO_INTEGER);
            }
            {
                SubLObject sxhash = memoization_state.sxhash_calc_2(value, delta);
                SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
                if (collisions != $kw19$_MEMOIZED_ITEM_NOT_FOUND_) {
                    {
                        SubLObject cdolist_list_var = collisions;
                        SubLObject collision = NIL;
                        for (collision = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , collision = cdolist_list_var.first()) {
                            {
                                SubLObject cached_args = collision.first();
                                SubLObject results2 = second(collision);
                                if (value.eql(cached_args.first())) {
                                    cached_args = cached_args.rest();
                                    if (((NIL != cached_args) && (NIL == cached_args.rest())) && delta.eql(cached_args.first())) {
                                        return memoization_state.caching_results(results2);
                                    }
                                }
                            }
                        }
                    }
                }
                {
                    SubLObject results = arg2(resetMultipleValues(), multiple_value_list(round_param_value_internal(value, delta)));
                    memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results, list(value, delta));
                    return memoization_state.caching_results(results);
                }
            }
        }
    }

    public static final SubLObject copy_cookie_jar(SubLObject cookie_jar) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject copy = dictionary.new_dictionary(symbol_function(EQUAL), UNPROVIDED);
                SubLObject iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(cookie_jar));
                while (NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state)) {
                    thread.resetMultipleValues();
                    {
                        SubLObject position = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                        SubLObject cookie_pack = thread.secondMultipleValue();
                        thread.resetMultipleValues();
                        dictionary.dictionary_enter(copy, position, dictionary_utilities.copy_dictionary(cookie_pack));
                        iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state);
                    }
                } 
                dictionary_contents.do_dictionary_contents_finalize(iteration_state);
                return copy;
            }
        }
    }

    // defparameter
    private static final SubLSymbol $use_cookie_weights_recursivelyP$ = makeSymbol("*USE-COOKIE-WEIGHTS-RECURSIVELY?*");

    public static final SubLObject use_cookie_weights_recursivelyP() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            return makeBoolean((NIL != $use_cookie_weights_recursivelyP$.getDynamicValue(thread)) && (NIL != dictionary.dictionary_p(current_cookie_jar())));
        }
    }

    // defparameter
    private static final SubLSymbol $cookie_jar$ = makeSymbol("*COOKIE-JAR*");

    public static final SubLObject current_cookie_jar() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            return $cookie_jar$.getDynamicValue(thread);
        }
    }

    // defparameter
    private static final SubLSymbol $cookie_jar_allow_none_of_the_aboveP$ = makeSymbol("*COOKIE-JAR-ALLOW-NONE-OF-THE-ABOVE?*");

    public static final SubLObject evaluate_cookie_jar(SubLObject original_cookie_jar, SubLObject topic_struct, SubLObject rescoring_map) {
        if (rescoring_map == UNPROVIDED) {
            rescoring_map = $topic_struct_parameter_value_map$.getDynamicValue();
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject allow_none_of_the_aboveP = $cookie_jar_allow_none_of_the_aboveP$.getDynamicValue(thread);
                SubLObject ambiguous_position_count = count_topic_struct_ambiguous_words(topic_struct, makeBoolean(NIL == allow_none_of_the_aboveP));
                SubLObject winner_count = ZERO_INTEGER;
                SubLObject verboseP = eql($cookie_jar_iterativity$, $parameter_being_tweaked$.getDynamicValue(thread));
                SubLObject cookie_jar = copy_cookie_jar(original_cookie_jar);
                SubLObject number_of_guesses = ZERO_INTEGER;
                SubLObject number_of_right_guesses = ZERO_INTEGER;
                {
                    SubLObject _prev_bind_0 = $use_cookie_weights_recursivelyP$.currentBinding(thread);
                    SubLObject _prev_bind_1 = $cookie_jar$.currentBinding(thread);
                    SubLObject _prev_bind_2 = $topic_struct_parameter_value_map$.currentBinding(thread);
                    try {
                        $use_cookie_weights_recursivelyP$.bind(NIL, thread);
                        $cookie_jar$.bind(cookie_jar, thread);
                        $topic_struct_parameter_value_map$.bind(rescoring_map, thread);
                        {
                            SubLObject cdotimes_end_var = cookie_jar_iterativity();
                            SubLObject pass_count = NIL;
                            for (pass_count = ZERO_INTEGER; pass_count.numL(cdotimes_end_var); pass_count = add(pass_count, ONE_INTEGER)) {
                                {
                                    SubLObject winner_count_this_pass = ZERO_INTEGER;
                                    number_of_guesses = ZERO_INTEGER;
                                    number_of_right_guesses = ZERO_INTEGER;
                                    {
                                        SubLObject cdolist_list_var = dictionary_utilities.sort_dictionary_by_keys(cookie_jar, $sym358$TOPIC_STRUCT_POSITION__);
                                        SubLObject cons = NIL;
                                        for (cons = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , cons = cdolist_list_var.first()) {
                                            {
                                                SubLObject datum = cons;
                                                SubLObject current = datum;
                                                SubLObject position = NIL;
                                                SubLObject cookie_pack = NIL;
                                                destructuring_bind_must_consp(current, datum, $list_alt347);
                                                position = current.first();
                                                current = current.rest();
                                                cookie_pack = current;
                                                if (NIL != topic_struct_word_ambiguous_p(topic_struct_word_from_position(topic_struct, position), makeBoolean(NIL == allow_none_of_the_aboveP))) {
                                                    {
                                                        SubLObject correct_denots = topic_struct_position_correct_denots(topic_struct, position);
                                                        SubLObject got_it_right_beforeP = cookie_pack_correctP(cookie_pack, correct_denots);
                                                        SubLObject old_cookie_pack = (NIL != got_it_right_beforeP) ? ((SubLObject) (dictionary_utilities.copy_dictionary(cookie_pack))) : NIL;
                                                        SubLObject old_high_scorers = cookie_pack_high_scorers(cookie_pack);
                                                        SubLObject scored_cookie_pack = rescore_cookie_pack(cookie_pack, rescoring_map, NIL);
                                                        SubLObject got_it_right_afterP = cookie_pack_correctP(scored_cookie_pack, correct_denots);
                                                        SubLObject guesses = cookie_pack_high_scorers(scored_cookie_pack);
                                                        SubLObject guessed_none_of_the_aboveP = makeBoolean((NIL != allow_none_of_the_aboveP) && (NIL == guesses));
                                                        SubLObject guess_count = (NIL != guessed_none_of_the_aboveP) ? ((SubLObject) (ONE_INTEGER)) : length(guesses);
                                                        SubLObject right_guess_count = ((NIL != guessed_none_of_the_aboveP) && (NIL == correct_denots)) ? ((SubLObject) (ONE_INTEGER)) : length(intersection(guesses, correct_denots, symbol_function(EQUAL), UNPROVIDED));
                                                        number_of_guesses = add(number_of_guesses, guess_count);
                                                        number_of_right_guesses = add(number_of_right_guesses, right_guess_count);
                                                        if (right_guess_count.numG(NIL != got_it_right_afterP ? ((SubLObject) (ONE_INTEGER)) : ZERO_INTEGER)) {
                                                            Errors.sublisp_break($str_alt377$Recording__S_right_guesses___S___, new SubLObject[]{ right_guess_count, intersection(guesses, correct_denots, symbol_function(EQUAL), UNPROVIDED), got_it_right_afterP });
                                                        }
                                                        if (NIL == got_it_right_afterP) {
                                                            if (NIL != list_utilities.intersectP(cookie_pack_high_scorers(scored_cookie_pack), correct_denots, symbol_function(EQUAL), UNPROVIDED)) {
                                                                Errors.sublisp_break($str_alt378$Problem_with_position__S, new SubLObject[]{ position });
                                                            }
                                                        }
                                                        if (NIL != got_it_right_afterP) {
                                                            winner_count_this_pass = add(winner_count_this_pass, ONE_INTEGER);
                                                        }
                                                        if (!((NIL == verboseP) || (got_it_right_beforeP == got_it_right_afterP))) {
                                                            cookie_jar_regression_warn(topic_struct, position, got_it_right_afterP, scored_cookie_pack, old_cookie_pack, old_high_scorers, correct_denots);
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                    if (NIL != verboseP) {
                                        cookie_jar_iteration_print_results(winner_count, winner_count_this_pass, ambiguous_position_count, pass_count);
                                    }
                                    winner_count = winner_count_this_pass;
                                }
                                $use_cookie_weights_recursivelyP$.setDynamicValue(T, thread);
                            }
                        }
                    } finally {
                        $topic_struct_parameter_value_map$.rebind(_prev_bind_2, thread);
                        $cookie_jar$.rebind(_prev_bind_1, thread);
                        $use_cookie_weights_recursivelyP$.rebind(_prev_bind_0, thread);
                    }
                }
                if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                    if (!winner_count.eql(number_of_right_guesses)) {
                        Errors.error($str_alt379$Recall_number__S_vs__precision_nu, winner_count, number_of_right_guesses);
                    }
                }
                return values(winner_count, ambiguous_position_count, number_of_right_guesses, number_of_guesses);
            }
        }
    }

    public static final SubLObject cookie_jar_regression_warn(SubLObject topic_struct, SubLObject position, SubLObject got_it_right_afterP, SubLObject scored_cookie_pack, SubLObject old_cookie_pack, SubLObject old_high_scorers, SubLObject correct_denots) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            Errors.warn($str_alt380$_S___A__Rescoring_caused_us_to_pr, new SubLObject[]{ topic_struct_word_string_in_context(topic_struct, position, TWO_INTEGER, TWO_INTEGER), NIL != got_it_right_afterP ? ((SubLObject) ($$$YAY)) : $$$BOO, cookie_pack_high_scorers(scored_cookie_pack), old_high_scorers });
            if (NIL == got_it_right_afterP) {
                {
                    SubLObject iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(scored_cookie_pack));
                    while (NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state)) {
                        thread.resetMultipleValues();
                        {
                            SubLObject denot = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                            SubLObject cookies = thread.secondMultipleValue();
                            thread.resetMultipleValues();
                            if (NIL != subl_promotions.memberP(denot, correct_denots, symbol_function(EQUAL), UNPROVIDED)) {
                                {
                                    SubLObject old_cookies = dictionary.dictionary_lookup(old_cookie_pack, denot, UNPROVIDED);
                                    SubLObject cdolist_list_var = cookies;
                                    SubLObject cookie = NIL;
                                    for (cookie = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , cookie = cdolist_list_var.first()) {
                                        {
                                            SubLObject score_after = cookie_score(cookie);
                                            SubLObject strategy = cookie_strategy(cookie);
                                            SubLObject old_cookie = find(strategy, old_cookies, symbol_function(EQUAL), COOKIE_STRATEGY, UNPROVIDED, UNPROVIDED);
                                            SubLObject old_score = cookie_score(old_cookie);
                                            if (score_after.numL(old_score)) {
                                                Errors.warn($str_alt382$_S_score_for__S_declined_from___3, new SubLObject[]{ strategy, denot, old_score, score_after });
                                                if (NIL != pattern_match.tree_matches_pattern(strategy, $list_alt383)) {
                                                    {
                                                        SubLObject punished = NIL;
                                                        SubLObject cdolist_list_var_162 = cookie_data(cookie);
                                                        SubLObject plist = NIL;
                                                        for (plist = cdolist_list_var_162.first(); NIL != cdolist_list_var_162; cdolist_list_var_162 = cdolist_list_var_162.rest() , plist = cdolist_list_var_162.first()) {
                                                            {
                                                                SubLObject supporter = getf(plist, $SUPPORTER, UNPROVIDED);
                                                                SubLObject supporter_position = getf(plist, $SUPPORTER_POSITION, UNPROVIDED);
                                                                SubLObject ambiguity_factor = cookie_jar_ambiguity_factor_for_denot_at_position(supporter, supporter_position, UNPROVIDED);
                                                                SubLObject unweighted = length(topic_struct_word_denots(topic_struct_word_from_position(topic_struct, supporter_position)));
                                                                if (NIL == supporter) {
                                                                    Errors.sublisp_break($str_alt384$Couldn_t_find_supporter_data_in__, new SubLObject[]{ cookie });
                                                                }
                                                                if (NIL != number_utilities.potentially_infinite_number_G(ambiguity_factor, unweighted)) {
                                                                    {
                                                                        SubLObject item_var = supporter;
                                                                        if (NIL == member(item_var, punished, symbol_function(EQUAL), symbol_function(IDENTITY))) {
                                                                            punished = cons(item_var, punished);
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                        if (NIL != punished) {
                                                            Errors.warn($str_alt385$The_following_supporters__weighte);
                                                            format_nil.print_one_per_line(punished, UNPROVIDED);
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                            iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state);
                        }
                    } 
                    dictionary_contents.do_dictionary_contents_finalize(iteration_state);
                }
            }
            return NIL;
        }
    }

    public static final SubLObject cookie_jar_iteration_print_results(SubLObject winner_count, SubLObject winner_count_this_pass, SubLObject ambiguous_position_count, SubLObject pass_count) {
        if (winner_count_this_pass.numG(winner_count)) {
            if (pass_count.isPositive()) {
                format(T, $str_alt386$__Pass__S__recall_improved_from__, new SubLObject[]{ pass_count, multiply($int$100, compute_recall(winner_count, ambiguous_position_count)), multiply($int$100, compute_recall(winner_count_this_pass, ambiguous_position_count)) });
                force_output(UNPROVIDED);
            }
        } else
            if (winner_count_this_pass.numL(winner_count)) {
                if (pass_count.isPositive()) {
                    format(T, $str_alt387$__Pass__S__recall_declined_from__, new SubLObject[]{ pass_count, multiply($int$100, compute_recall(winner_count, ambiguous_position_count)), multiply($int$100, compute_recall(winner_count_this_pass, ambiguous_position_count)) });
                    force_output(UNPROVIDED);
                }
            } else {
                if (pass_count.isPositive()) {
                    format(T, $str_alt388$__Pass__S__recall_stayed_at___3F_, pass_count, multiply($int$100, compute_recall(winner_count_this_pass, ambiguous_position_count)));
                    force_output(UNPROVIDED);
                }
            }

        return winner_count;
    }



    public static final SubLObject cookie_score_tolerance() {
        return topic_struct_parameter_value($cookie_score_tolerance$, UNPROVIDED);
    }

    public static final SubLObject cookie_pack_correctP(SubLObject cookie_pack, SubLObject correct_denots) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject best_score_for_correct_denot = NIL;
                SubLObject high_score = ZERO_INTEGER;
                SubLObject iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(cookie_pack));
                while (NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state)) {
                    thread.resetMultipleValues();
                    {
                        SubLObject denot = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                        SubLObject cookies = thread.secondMultipleValue();
                        thread.resetMultipleValues();
                        {
                            SubLObject score = topic_struct_score_from_cookies(cookies);
                            if (((NIL == best_score_for_correct_denot) || score.numG(best_score_for_correct_denot)) && (NIL != subl_promotions.memberP(denot, correct_denots, symbol_function(EQUAL), UNPROVIDED))) {
                                best_score_for_correct_denot = score;
                            }
                            if (score.numG(high_score)) {
                                high_score = score;
                            }
                        }
                        iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state);
                    }
                } 
                dictionary_contents.do_dictionary_contents_finalize(iteration_state);
                return makeBoolean(((NIL == correct_denots) && high_score.numL(minimum_correct_cookie_score())) || ((NIL != best_score_for_correct_denot) && (NIL != cookie_score_high_enoughP(best_score_for_correct_denot, high_score))));
            }
        }
    }



    public static final SubLObject minimum_correct_cookie_score() {
        return topic_struct_parameter_value($minimum_correct_cookie_score$, UNPROVIDED);
    }

    public static final SubLObject cookie_score_high_enoughP(SubLObject score, SubLObject high_score) {
        return makeBoolean(score.numGE(minimum_correct_cookie_score()) && subtract(high_score, score).numLE(multiply(high_score, cookie_score_tolerance())));
    }

    public static final SubLObject cookie_pack_high_scorer_count(SubLObject cookie_pack) {
        return length(cookie_pack_high_scorers(cookie_pack));
    }

    public static final SubLObject cookie_pack_high_scorers(SubLObject cookie_pack) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject high_scorers = NIL;
                SubLObject high_score = ZERO_INTEGER;
                {
                    SubLObject iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(cookie_pack));
                    while (NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state)) {
                        thread.resetMultipleValues();
                        {
                            SubLObject key = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                            SubLObject cookies = thread.secondMultipleValue();
                            thread.resetMultipleValues();
                            {
                                SubLObject score = topic_struct_score_from_cookies(cookies);
                                if (score.numG(high_score)) {
                                    high_score = score;
                                }
                            }
                            iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state);
                        }
                    } 
                    dictionary_contents.do_dictionary_contents_finalize(iteration_state);
                }
                {
                    SubLObject iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(cookie_pack));
                    while (NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state)) {
                        thread.resetMultipleValues();
                        {
                            SubLObject denot = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                            SubLObject cookies = thread.secondMultipleValue();
                            thread.resetMultipleValues();
                            {
                                SubLObject score = topic_struct_score_from_cookies(cookies);
                                if (NIL != cookie_score_high_enoughP(score, high_score)) {
                                    high_scorers = cons(denot, high_scorers);
                                }
                            }
                            iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state);
                        }
                    } 
                    dictionary_contents.do_dictionary_contents_finalize(iteration_state);
                }
                return high_scorers;
            }
        }
    }

    public static final SubLObject declare_learning_reader_disambiguation_file() {
        declareFunction("l2r_document", "L2R-DOCUMENT", 0, 0, false);
        declareMacro("def_topic_struct_tweakable_parameter", "DEF-TOPIC-STRUCT-TWEAKABLE-PARAMETER");
        declareFunction("register_tweakable_parameter", "REGISTER-TWEAKABLE-PARAMETER", 5, 0, false);
        declareFunction("update_tweakable_parameter_initial_value", "UPDATE-TWEAKABLE-PARAMETER-INITIAL-VALUE", 2, 0, false);
        declareFunction("tweakable_parameter_granularity", "TWEAKABLE-PARAMETER-GRANULARITY", 1, 0, false);
        declareFunction("tweakable_parameter_step_size", "TWEAKABLE-PARAMETER-STEP-SIZE", 1, 0, false);
        declareFunction("tweakable_parameter_random_value", "TWEAKABLE-PARAMETER-RANDOM-VALUE", 1, 0, false);
        declareFunction("tweakable_parameter_random_value_num", "TWEAKABLE-PARAMETER-RANDOM-VALUE-NUM", 1, 0, false);
        declareFunction("tweakable_parameter_nth_value", "TWEAKABLE-PARAMETER-NTH-VALUE", 2, 0, false);
        declareFunction("compute_tweakable_values", "COMPUTE-TWEAKABLE-VALUES", 3, 0, false);
        declareFunction("tweakable_parameter_nth_value_internal", "TWEAKABLE-PARAMETER-NTH-VALUE-INTERNAL", 4, 0, false);
        declareFunction("tweakable_parameter_current_value_num", "TWEAKABLE-PARAMETER-CURRENT-VALUE-NUM", 1, 0, false);
        declareFunction("tweakable_parameter_value_num", "TWEAKABLE-PARAMETER-VALUE-NUM", 2, 0, false);
        declareFunction("clear_tweakable_parameter_value_num_internal", "CLEAR-TWEAKABLE-PARAMETER-VALUE-NUM-INTERNAL", 0, 0, false);
        declareFunction("remove_tweakable_parameter_value_num_internal", "REMOVE-TWEAKABLE-PARAMETER-VALUE-NUM-INTERNAL", 4, 0, false);
        declareFunction("tweakable_parameter_value_num_internal_internal", "TWEAKABLE-PARAMETER-VALUE-NUM-INTERNAL-INTERNAL", 4, 0, false);
        declareFunction("tweakable_parameter_value_num_internal", "TWEAKABLE-PARAMETER-VALUE-NUM-INTERNAL", 4, 0, false);
        declareFunction("tweakable_parameter_value_E", "TWEAKABLE-PARAMETER-VALUE-=", 3, 0, false);
        declareFunction("l2r_base_value", "L2R-BASE-VALUE", 0, 0, false);
        declareFunction("l2r_intra_sentence_degradation_base", "L2R-INTRA-SENTENCE-DEGRADATION-BASE", 0, 0, false);
        declareFunction("l2r_inter_sentence_degradation_base", "L2R-INTER-SENTENCE-DEGRADATION-BASE", 0, 0, false);
        declareFunction("topic_struct_isaXgenls_generality_cutoff", "TOPIC-STRUCT-ISA/GENLS-GENERALITY-CUTOFF", 0, 0, false);
        declareFunction("word_weight_cutoff", "WORD-WEIGHT-CUTOFF", 0, 0, false);
        declareFunction("topic_struct_check_conceptually_relatedP", "TOPIC-STRUCT-CHECK-CONCEPTUALLY-RELATED?", 0, 0, false);
        declareFunction("topic_struct_conceptually_related_max_word_distance", "TOPIC-STRUCT-CONCEPTUALLY-RELATED-MAX-WORD-DISTANCE", 0, 0, false);
        declareFunction("topic_struct_conceptually_related_max_sentence_distance", "TOPIC-STRUCT-CONCEPTUALLY-RELATED-MAX-SENTENCE-DISTANCE", 0, 0, false);
        declareFunction("l2r_compositional_contribution_base_weight", "L2R-COMPOSITIONAL-CONTRIBUTION-BASE-WEIGHT", 0, 0, false);
        declareFunction("l2r_sentence_truth_bonus", "L2R-SENTENCE-TRUTH-BONUS", 0, 0, false);
        declareFunction("sentential_contribution_good_score", "SENTENTIAL-CONTRIBUTION-GOOD-SCORE", 0, 0, false);
        declareFunction("sentential_contribution_maybe_score", "SENTENTIAL-CONTRIBUTION-MAYBE-SCORE", 0, 0, false);
        declareFunction("sentential_contribution_bad_score", "SENTENTIAL-CONTRIBUTION-BAD-SCORE", 0, 0, false);
        declareFunction("multi_strategy_bonus", "MULTI-STRATEGY-BONUS", 0, 0, false);
        declareFunction("cookie_jar_iterativity", "COOKIE-JAR-ITERATIVITY", 0, 0, false);
        declareMacro("with_topic_struct_parameter_value_map", "WITH-TOPIC-STRUCT-PARAMETER-VALUE-MAP");
        declareFunction("topic_struct_parameter_value", "TOPIC-STRUCT-PARAMETER-VALUE", 1, 1, false);
        declareFunction("optimize_tweakable_parameters", "OPTIMIZE-TWEAKABLE-PARAMETERS", 0, 1, false);
        declareFunction("optimize_tweakable_parameter", "OPTIMIZE-TWEAKABLE-PARAMETER", 4, 0, false);
        declareFunction("tweak_topic_struct_parameter", "TWEAK-TOPIC-STRUCT-PARAMETER", 2, 1, false);
        declareFunction("tweakable_parameter_training_pairs", "TWEAKABLE-PARAMETER-TRAINING-PAIRS", 0, 0, false);
        declareFunction("load_or_reload_tweakable_parameter_training_pairs", "LOAD-OR-RELOAD-TWEAKABLE-PARAMETER-TRAINING-PAIRS", 0, 0, false);
        declareFunction("training_data_show_percent_processed", "TRAINING-DATA-SHOW-PERCENT-PROCESSED", 0, 1, false);
        declareFunction("evaluate_training_data", "EVALUATE-TRAINING-DATA", 0, 2, false);
        declareFunction("compute_precision", "COMPUTE-PRECISION", 2, 0, false);
        declareFunction("compute_recall", "COMPUTE-RECALL", 2, 0, false);
        declareFunction("topic_struct_score_from_recall_and_precision", "TOPIC-STRUCT-SCORE-FROM-RECALL-AND-PRECISION", 2, 0, false);
        declareFunction("topic_struct_recall_weight", "TOPIC-STRUCT-RECALL-WEIGHT", 0, 0, false);
        declareFunction("topic_struct_precision_weight", "TOPIC-STRUCT-PRECISION-WEIGHT", 0, 0, false);
        declareFunction("tweakable_parameter_dictionary_to_alist", "TWEAKABLE-PARAMETER-DICTIONARY-TO-ALIST", 1, 0, false);
        declareFunction("sibling_cookie_score", "SIBLING-COOKIE-SCORE", 2, 1, false);
        declareFunction("sibling_plist_score", "SIBLING-PLIST-SCORE", 2, 1, false);
        declareFunction("use_topic_struct_sibling_type_for_scoringP", "USE-TOPIC-STRUCT-SIBLING-TYPE-FOR-SCORING?", 1, 0, false);
        declareFunction("cookie_jar_ambiguity_factor_for_denot_at_position", "COOKIE-JAR-AMBIGUITY-FACTOR-FOR-DENOT-AT-POSITION", 2, 1, false);
        declareFunction("find_denot_in_document_or_topic_struct", "FIND-DENOT-IN-DOCUMENT-OR-TOPIC-STRUCT", 1, 0, false);
        declareFunction("topic_struct_proximity_factor", "TOPIC-STRUCT-PROXIMITY-FACTOR", 5, 0, false);
        declareFunction("peg_local_position_distance", "PEG-LOCAL-POSITION-DISTANCE", 2, 0, false);
        declareFunction("peg_local_position_start", "PEG-LOCAL-POSITION-START", 1, 0, false);
        declareFunction("peg_local_position_end", "PEG-LOCAL-POSITION-END", 1, 0, false);
        declareFunction("sibling_score_wrt_nearest_isa_of_type_internal_internal", "SIBLING-SCORE-WRT-NEAREST-ISA-OF-TYPE-INTERNAL-INTERNAL", 3, 0, false);
        declareFunction("sibling_score_wrt_nearest_isa_of_type_internal", "SIBLING-SCORE-WRT-NEAREST-ISA-OF-TYPE-INTERNAL", 3, 0, false);
        declareFunction("relevant_min_isas_of_type_memoized_internal", "RELEVANT-MIN-ISAS-OF-TYPE-MEMOIZED-INTERNAL", 2, 1, false);
        declareFunction("relevant_min_isas_of_type_memoized", "RELEVANT-MIN-ISAS-OF-TYPE-MEMOIZED", 2, 1, false);
        declareFunction("irrelevant_min_isaP", "IRRELEVANT-MIN-ISA?", 1, 0, false);
        declareFunction("isa_count_cookie_score", "ISA-COUNT-COOKIE-SCORE", 1, 1, false);
        declareFunction("isa_count_plist_score", "ISA-COUNT-PLIST-SCORE", 1, 1, false);
        declareFunction("cookie_data_supporter", "COOKIE-DATA-SUPPORTER", 1, 0, false);
        declareFunction("cookie_data_score", "COOKIE-DATA-SCORE", 1, 0, false);
        declareFunction("genl_count_cookie_score", "GENL-COUNT-COOKIE-SCORE", 1, 1, false);
        declareFunction("genl_count_plist_score", "GENL-COUNT-PLIST-SCORE", 1, 1, false);
        declareFunction("generality_degradation_base", "GENERALITY-DEGRADATION-BASE", 0, 0, false);
        declareFunction("denot_weight", "DENOT-WEIGHT", 2, 1, false);
        declareFunction("conceptually_related_cookie_score", "CONCEPTUALLY-RELATED-COOKIE-SCORE", 1, 1, false);
        declareFunction("conceptually_related_plist_score", "CONCEPTUALLY-RELATED-PLIST-SCORE", 1, 1, false);
        declareFunction("topic_struct_conceptually_relatedP_internal", "TOPIC-STRUCT-CONCEPTUALLY-RELATED?-INTERNAL", 3, 0, false);
        declareFunction("topic_struct_conceptually_relatedP", "TOPIC-STRUCT-CONCEPTUALLY-RELATED?", 3, 0, false);
        declareFunction("topic_struct_word_compositional_contributor_score", "TOPIC-STRUCT-WORD-COMPOSITIONAL-CONTRIBUTOR-SCORE", 3, 0, false);
        declareFunction("topic_struct_bunge_sentence_string", "TOPIC-STRUCT-BUNGE-SENTENCE-STRING", 2, 0, false);
        declareFunction("topic_struct_string_compositional_contributor_score", "TOPIC-STRUCT-STRING-COMPOSITIONAL-CONTRIBUTOR-SCORE", 3, 0, false);
        declareFunction("compositional_contribution_cookie_score", "COMPOSITIONAL-CONTRIBUTION-COOKIE-SCORE", 1, 1, false);
        declareFunction("compositional_contribution_plist_score", "COMPOSITIONAL-CONTRIBUTION-PLIST-SCORE", 1, 1, false);
        declareFunction("strategy_score_for_sihms_defn", "STRATEGY-SCORE-FOR-SIHMS-DEFN", 3, 0, false);
        declareFunction("disambiguation_scoring_method_for_strategy", "DISAMBIGUATION-SCORING-METHOD-FOR-STRATEGY", 1, 0, false);
        declareFunction("relative_ambiguity_score_from_sihms", "RELATIVE-AMBIGUITY-SCORE-FROM-SIHMS", 3, 0, false);
        declareFunction("presupposition_ambiguity_score_from_sihms", "PRESUPPOSITION-AMBIGUITY-SCORE-FROM-SIHMS", 3, 0, false);
        declareFunction("presupposition_sihm_competitors", "PRESUPPOSITION-SIHM-COMPETITORS", 2, 0, false);
        declareFunction("ncr_reliability_score_from_sihms", "NCR-RELIABILITY-SCORE-FROM-SIHMS", 3, 0, false);
        declareFunction("ncr_from_sihm", "NCR-FROM-SIHM", 1, 0, false);
        declareFunction("l2r_ncr_precision_score", "L2R-NCR-PRECISION-SCORE", 1, 0, false);
        declareFunction("presupposition_score_from_sihms", "PRESUPPOSITION-SCORE-FROM-SIHMS", 3, 0, false);
        declareFunction("type_behavior_capable_score_from_sihms", "TYPE-BEHAVIOR-CAPABLE-SCORE-FROM-SIHMS", 3, 0, false);
        declareFunction("validated_hypothesis_score_from_sihms", "VALIDATED-HYPOTHESIS-SCORE-FROM-SIHMS", 3, 0, false);
        declareFunction("synonym_score_from_sihms", "SYNONYM-SCORE-FROM-SIHMS", 3, 0, false);
        declareFunction("l2r_base_score_from_map", "L2R-BASE-SCORE-FROM-MAP", 1, 0, false);
        declareFunction("isa_score_from_sihms", "ISA-SCORE-FROM-SIHMS", 3, 0, false);
        declareFunction("genl_score_from_sihms", "GENL-SCORE-FROM-SIHMS", 3, 0, false);
        declareFunction("conceptually_related_score_from_sihms", "CONCEPTUALLY-RELATED-SCORE-FROM-SIHMS", 3, 0, false);
        declareFunction("term_formulas_score_from_sihms", "TERM-FORMULAS-SCORE-FROM-SIHMS", 3, 0, false);
        declareFunction("sibling_score_from_sihms", "SIBLING-SCORE-FROM-SIHMS", 3, 0, false);
        declareFunction("isa_plist_from_sihms", "ISA-PLIST-FROM-SIHMS", 2, 0, false);
        declareFunction("genl_plist_from_sihms", "GENL-PLIST-FROM-SIHMS", 2, 0, false);
        declareFunction("conceptually_related_plist_from_sihms", "CONCEPTUALLY-RELATED-PLIST-FROM-SIHMS", 2, 0, false);
        declareFunction("sibling_plist_from_sihms", "SIBLING-PLIST-FROM-SIHMS", 3, 0, false);
        declareFunction("term_formulas_plist_from_sihms", "TERM-FORMULAS-PLIST-FROM-SIHMS", 2, 0, false);
        declareFunction("sihm_truth_bonus", "SIHM-TRUTH-BONUS", 1, 0, false);
        declareFunction("optimized_strategy_form_p", "OPTIMIZED-STRATEGY-FORM-P", 1, 0, false);
        declareFunction("topic_struct_parameter_value_from_optimized_strategy_form", "TOPIC-STRUCT-PARAMETER-VALUE-FROM-OPTIMIZED-STRATEGY-FORM", 2, 0, false);
        declareFunction("optimized_strategy_form_strategy", "OPTIMIZED-STRATEGY-FORM-STRATEGY", 1, 0, false);
        declareFunction("peg_and_cycl_from_sihm", "PEG-AND-CYCL-FROM-SIHM", 1, 0, false);
        declareFunction("document_from_sihm", "DOCUMENT-FROM-SIHM", 1, 0, false);
        declareFunction("peg_l2r_document", "PEG-L2R-DOCUMENT", 1, 0, false);
        declareFunction("l2r_document_contains_denotP", "L2R-DOCUMENT-CONTAINS-DENOT?", 2, 0, false);
        declareFunction("lexical_peg_denots", "LEXICAL-PEG-DENOTS", 1, 0, false);
        declareFunction("peg_position", "PEG-POSITION", 1, 0, false);
        declareFunction("peg_position_from_covered_node", "PEG-POSITION-FROM-COVERED-NODE", 1, 0, false);
        declareFunction("peg_position_from_sub_pegs", "PEG-POSITION-FROM-SUB-PEGS", 1, 0, false);
        declareFunction("peg_position_from_sub_peg_positions", "PEG-POSITION-FROM-SUB-PEG-POSITIONS", 1, 0, false);
        declareFunction("syntactic_node_position", "SYNTACTIC-NODE-POSITION", 1, 0, false);
        declareFunction("token_position", "TOKEN-POSITION", 1, 0, false);
        declareFunction("sentence_peg_position", "SENTENCE-PEG-POSITION", 1, 0, false);
        declareFunction("topic_struct_verboseP", "TOPIC-STRUCT-VERBOSE?", 0, 0, false);
        declareFunction("topic_struct", "TOPIC-STRUCT", 0, 0, false);
        declareMacro("with_topic_struct", "WITH-TOPIC-STRUCT");
        declareMacro("do_topic_struct_words", "DO-TOPIC-STRUCT-WORDS");
        declareFunction("topic_struct_document_p", "TOPIC-STRUCT-DOCUMENT-P", 1, 0, false);
        declareFunction("document_topic_struct_paragraph_structs", "DOCUMENT-TOPIC-STRUCT-PARAGRAPH-STRUCTS", 1, 0, false);
        declareFunction("make_annotated_document_topic_struct", "MAKE-ANNOTATED-DOCUMENT-TOPIC-STRUCT", 2, 0, false);
        declareFunction("make_document_topic_struct", "MAKE-DOCUMENT-TOPIC-STRUCT", 2, 1, false);
        declareMacro("do_document_topic_struct_words", "DO-DOCUMENT-TOPIC-STRUCT-WORDS");
        declareMacro("do_paragraph_topic_struct_words", "DO-PARAGRAPH-TOPIC-STRUCT-WORDS");
        declareMacro("do_topic_struct_word_denots", "DO-TOPIC-STRUCT-WORD-DENOTS");
        declareFunction("count_topic_struct_words", "COUNT-TOPIC-STRUCT-WORDS", 1, 0, false);
        declareFunction("count_topic_struct_ambiguous_words", "COUNT-TOPIC-STRUCT-AMBIGUOUS-WORDS", 1, 1, false);
        declareFunction("topic_struct_word_ambiguous_p", "TOPIC-STRUCT-WORD-AMBIGUOUS-P", 1, 1, false);
        declareFunction("invalid_nart_p", "INVALID-NART-P", 1, 0, false);
        declareFunction("topic_struct_find_denot", "TOPIC-STRUCT-FIND-DENOT", 1, 1, false);
        declareFunction("topic_struct_sentence_p", "TOPIC-STRUCT-SENTENCE-P", 1, 0, false);
        declareFunction("topic_struct_word_p", "TOPIC-STRUCT-WORD-P", 1, 0, false);
        declareFunction("topic_struct_tag_p", "TOPIC-STRUCT-TAG-P", 1, 0, false);
        declareFunction("topic_struct_word_string", "TOPIC-STRUCT-WORD-STRING", 1, 0, false);
        declareFunction("topic_struct_position_correct_denots", "TOPIC-STRUCT-POSITION-CORRECT-DENOTS", 2, 0, false);
        declareFunction("topic_struct_word_correct_denots", "TOPIC-STRUCT-WORD-CORRECT-DENOTS", 1, 0, false);
        declareFunction("topic_struct_word_string_in_context", "TOPIC-STRUCT-WORD-STRING-IN-CONTEXT", 2, 2, false);
        declareFunction("topic_struct_sentence_from_position", "TOPIC-STRUCT-SENTENCE-FROM-POSITION", 2, 0, false);
        declareFunction("topic_struct_word_from_position", "TOPIC-STRUCT-WORD-FROM-POSITION", 2, 0, false);
        declareFunction("topic_struct_leading_context", "TOPIC-STRUCT-LEADING-CONTEXT", 3, 0, false);
        declareFunction("topic_struct_following_context", "TOPIC-STRUCT-FOLLOWING-CONTEXT", 3, 0, false);
        declareFunction("topic_struct_word_denots", "TOPIC-STRUCT-WORD-DENOTS", 1, 0, false);
        declareFunction("topic_struct_genls", "TOPIC-STRUCT-GENLS", 3, 0, false);
        declareFunction("sibling_score_wrt_nearest_isa_of_type", "SIBLING-SCORE-WRT-NEAREST-ISA-OF-TYPE", 4, 0, false);
        declareFunction("topic_struct_isas", "TOPIC-STRUCT-ISAS", 3, 0, false);
        declareFunction("topic_struct_conceptually_related_denots", "TOPIC-STRUCT-CONCEPTUALLY-RELATED-DENOTS", 3, 0, false);
        declareFunction("annotate_topic_struct_from_file", "ANNOTATE-TOPIC-STRUCT-FROM-FILE", 1, 1, false);
        declareFunction("remember_topic_struct_choice", "REMEMBER-TOPIC-STRUCT-CHOICE", 2, 0, false);
        declareFunction("retrieve_previous_topic_struct_choice", "RETRIEVE-PREVIOUS-TOPIC-STRUCT-CHOICE", 2, 0, false);
        declareFunction("copy_topic_struct_files_to_subdirectory", "COPY-TOPIC-STRUCT-FILES-TO-SUBDIRECTORY", 2, 0, false);
        declareFunction("prepare_topic_struct_for_annotation", "PREPARE-TOPIC-STRUCT-FOR-ANNOTATION", 1, 0, false);
        declareFunction("save_topic_struct_to_file", "SAVE-TOPIC-STRUCT-TO-FILE", 2, 0, false);
        declareFunction("verify_topic_struct_word", "VERIFY-TOPIC-STRUCT-WORD", 6, 0, false);
        declareFunction("redo_topic_struct_word", "REDO-TOPIC-STRUCT-WORD", 6, 0, false);
        declareFunction("verify_topic_struct_word_internal", "VERIFY-TOPIC-STRUCT-WORD-INTERNAL", 7, 1, false);
        declareFunction("print_topic_struct_annotator_prompt", "PRINT-TOPIC-STRUCT-ANNOTATOR-PROMPT", 9, 0, false);
        declareFunction("process_topic_struct_annotator_response", "PROCESS-TOPIC-STRUCT-ANNOTATOR-RESPONSE", 10, 0, false);
        declareFunction("url_for_denotation", "URL-FOR-DENOTATION", 1, 0, false);
        declareFunction("record_topic_struct_meanings", "RECORD-TOPIC-STRUCT-MEANINGS", 1, 1, false);
        declareFunction("record_word_meanings", "RECORD-WORD-MEANINGS", 2, 0, false);
        declareFunction("most_common_word_senses", "MOST-COMMON-WORD-SENSES", 2, 0, false);
        declareFunction("topic_struct_baseline_from_most_common_word_senses", "TOPIC-STRUCT-BASELINE-FROM-MOST-COMMON-WORD-SENSES", 2, 0, false);
        declareFunction("topic_struct_lexicon", "TOPIC-STRUCT-LEXICON", 0, 0, false);
        declareFunction("topic_struct_lexicon_memoized_internal", "TOPIC-STRUCT-LEXICON-MEMOIZED-INTERNAL", 0, 0, false);
        declareFunction("topic_struct_lexicon_memoized", "TOPIC-STRUCT-LEXICON-MEMOIZED", 0, 0, false);
        declareFunction("clear_topic_struct_for_test_text", "CLEAR-TOPIC-STRUCT-FOR-TEST-TEXT", 0, 0, false);
        declareFunction("remove_topic_struct_for_test_text", "REMOVE-TOPIC-STRUCT-FOR-TEST-TEXT", 2, 1, false);
        declareFunction("topic_struct_for_test_text_internal", "TOPIC-STRUCT-FOR-TEST-TEXT-INTERNAL", 3, 0, false);
        declareFunction("topic_struct_for_test_text", "TOPIC-STRUCT-FOR-TEST-TEXT", 2, 1, false);
        declareFunction("annotate_topic_struct", "ANNOTATE-TOPIC-STRUCT", 1, 0, false);
        declareFunction("annotate_topic_struct_word", "ANNOTATE-TOPIC-STRUCT-WORD", 1, 0, false);
        declareFunction("topic_struct_results_directory", "TOPIC-STRUCT-RESULTS-DIRECTORY", 0, 1, false);
        declareFunction("topic_struct_sibling_collection_parameter", "TOPIC-STRUCT-SIBLING-COLLECTION-PARAMETER", 1, 0, false);
        declareFunction("test_topic_struct_document_files", "TEST-TOPIC-STRUCT-DOCUMENT-FILES", 0, 3, false);
        declareFunction("test_topic_struct_document_file", "TEST-TOPIC-STRUCT-DOCUMENT-FILE", 1, 4, false);
        declareFunction("store_annotated_topic_struct_from_file", "STORE-ANNOTATED-TOPIC-STRUCT-FROM-FILE", 1, 1, false);
        declareFunction("test_all_topic_struct_texts", "TEST-ALL-TOPIC-STRUCT-TEXTS", 0, 2, false);
        declareFunction("apply_all_topic_struct_strategies", "APPLY-ALL-TOPIC-STRUCT-STRATEGIES", 1, 3, false);
        declareFunction("compute_cookie_score", "COMPUTE-COOKIE-SCORE", 2, 1, false);
        declareFunction("rescore_cookie_pack", "RESCORE-COOKIE-PACK", 1, 2, false);
        declareFunction("rescore_cookies", "RESCORE-COOKIES", 1, 1, false);
        declareFunction("rescore_cookie", "RESCORE-COOKIE", 1, 1, false);
        declareFunction("update_cookie_pack_multi_strategy_score_for_denot", "UPDATE-COOKIE-PACK-MULTI-STRATEGY-SCORE-FOR-DENOT", 2, 0, false);
        declareFunction("multi_strategy_bonus_cookie_score", "MULTI-STRATEGY-BONUS-COOKIE-SCORE", 1, 1, false);
        declareFunction("topic_struct_cookie_p", "TOPIC-STRUCT-COOKIE-P", 1, 0, false);
        declareFunction("make_topic_struct_cookie", "MAKE-TOPIC-STRUCT-COOKIE", 2, 1, false);
        declareFunction("topic_struct_cookie_score_for_denot", "TOPIC-STRUCT-COOKIE-SCORE-FOR-DENOT", 2, 0, false);
        declareFunction("topic_struct_score_from_cookies", "TOPIC-STRUCT-SCORE-FROM-COOKIES", 1, 0, false);
        declareFunction("cookie_strategy", "COOKIE-STRATEGY", 1, 0, false);
        declareFunction("cookie_score", "COOKIE-SCORE", 1, 0, false);
        declareFunction("cookie_data", "COOKIE-DATA", 1, 0, false);
        declareFunction("cookie_score_G", "COOKIE-SCORE->", 2, 0, false);
        declareFunction("topic_struct_test_results_file_name", "TOPIC-STRUCT-TEST-RESULTS-FILE-NAME", 1, 1, false);
        declareFunction("clear_topic_struct_output_column_headers", "CLEAR-TOPIC-STRUCT-OUTPUT-COLUMN-HEADERS", 0, 0, false);
        declareFunction("remove_topic_struct_output_column_headers", "REMOVE-TOPIC-STRUCT-OUTPUT-COLUMN-HEADERS", 0, 0, false);
        declareFunction("topic_struct_output_column_headers_internal", "TOPIC-STRUCT-OUTPUT-COLUMN-HEADERS-INTERNAL", 0, 0, false);
        declareFunction("topic_struct_output_column_headers", "TOPIC-STRUCT-OUTPUT-COLUMN-HEADERS", 0, 0, false);
        declareFunction("categorize_topic_struct_result", "CATEGORIZE-TOPIC-STRUCT-RESULT", 4, 0, false);
        declareFunction("output_topic_struct_results_header", "OUTPUT-TOPIC-STRUCT-RESULTS-HEADER", 1, 0, false);
        declareFunction("describe_cookie_jar", "DESCRIBE-COOKIE-JAR", 2, 1, false);
        declareFunction("topic_struct_position_L", "TOPIC-STRUCT-POSITION-<", 2, 0, false);
        declareFunction("update_cookie_jar_for_sentence_level_results", "UPDATE-COOKIE-JAR-FOR-SENTENCE-LEVEL-RESULTS", 3, 2, false);
        declareFunction("sentential_contribution_cookie_score", "SENTENTIAL-CONTRIBUTION-COOKIE-SCORE", 1, 1, false);
        declareFunction("sentential_contribution_values", "SENTENTIAL-CONTRIBUTION-VALUES", 1, 0, false);
        declareFunction("topic_struct_denot_sentential_contribution_score", "TOPIC-STRUCT-DENOT-SENTENTIAL-CONTRIBUTION-SCORE", 2, 1, false);
        declareFunction("nat_smart_term_E", "NAT-SMART-TERM-=", 2, 0, false);
        declareFunction("clear_round_param_value", "CLEAR-ROUND-PARAM-VALUE", 0, 0, false);
        declareFunction("remove_round_param_value", "REMOVE-ROUND-PARAM-VALUE", 1, 1, false);
        declareFunction("round_param_value_internal", "ROUND-PARAM-VALUE-INTERNAL", 2, 0, false);
        declareFunction("round_param_value", "ROUND-PARAM-VALUE", 1, 1, false);
        declareFunction("copy_cookie_jar", "COPY-COOKIE-JAR", 1, 0, false);
        declareFunction("use_cookie_weights_recursivelyP", "USE-COOKIE-WEIGHTS-RECURSIVELY?", 0, 0, false);
        declareFunction("current_cookie_jar", "CURRENT-COOKIE-JAR", 0, 0, false);
        declareFunction("evaluate_cookie_jar", "EVALUATE-COOKIE-JAR", 2, 1, false);
        declareFunction("cookie_jar_regression_warn", "COOKIE-JAR-REGRESSION-WARN", 7, 0, false);
        declareFunction("cookie_jar_iteration_print_results", "COOKIE-JAR-ITERATION-PRINT-RESULTS", 4, 0, false);
        declareFunction("cookie_score_tolerance", "COOKIE-SCORE-TOLERANCE", 0, 0, false);
        declareFunction("cookie_pack_correctP", "COOKIE-PACK-CORRECT?", 2, 0, false);
        declareFunction("minimum_correct_cookie_score", "MINIMUM-CORRECT-COOKIE-SCORE", 0, 0, false);
        declareFunction("cookie_score_high_enoughP", "COOKIE-SCORE-HIGH-ENOUGH?", 2, 0, false);
        declareFunction("cookie_pack_high_scorer_count", "COOKIE-PACK-HIGH-SCORER-COUNT", 1, 0, false);
        declareFunction("cookie_pack_high_scorers", "COOKIE-PACK-HIGH-SCORERS", 1, 0, false);
        return NIL;
    }

    public static final SubLObject init_learning_reader_disambiguation_file() {
        defparameter("*L2R-DOCUMENT*", NIL);
        deflexical("*TOPIC-STRUCT-TWEAKABLE-PARAMETERS*", NIL);
        deflexical("*TWEAKABLE-PARAMETER-VALUE-NUM-INTERNAL-CACHING-STATE*", NIL);
        defparameter("*L2R-BASE-VALUE*", $float$0_4);
        defparameter("*L2R-INTRA-SENTENCE-DEGRADATION-BASE*", $float$0_75);
        defparameter("*L2R-INTER-SENTENCE-DEGRADATION-BASE*", $float$0_98);
        defparameter("*TOPIC-STRUCT-ISA/GENLS-GENERALITY-CUTOFF*", $int$600000);
        defparameter("*WORD-WEIGHT-CUTOFF*", $float$0_025);
        defparameter("*TOPIC-STRUCT-CHECK-CONCEPTUALLY-RELATED?*", ONE_INTEGER);
        defparameter("*TOPIC-STRUCT-CONCEPTUALLY-RELATED-MAX-WORD-DISTANCE*", $int$25);
        defparameter("*TOPIC-STRUCT-CONCEPTUALLY-RELATED-MAX-SENTENCE-DISTANCE*", ZERO_INTEGER);
        defparameter("*L2R-COMPOSITIONAL-CONTRIBUTION-BASE-WEIGHT*", TWO_INTEGER);
        defparameter("*L2R-SENTENCE-TRUTH-BONUS*", TWO_INTEGER);
        defparameter("*SENTENTIAL-CONTRIBUTION-GOOD-SCORE*", ONE_INTEGER);
        defparameter("*SENTENTIAL-CONTRIBUTION-MAYBE-SCORE*", $float$0_98);
        defparameter("*SENTENTIAL-CONTRIBUTION-BAD-SCORE*", MINUS_ONE_INTEGER);
        defparameter("*MULTI-STRATEGY-BONUS*", $float$0_36);
        defparameter("*COOKIE-JAR-ITERATIVITY*", ONE_INTEGER);
        defparameter("*TOPIC-STRUCT-PARAMETER-VALUE-MAP*", NIL);
        defparameter("*PARAMETER-BEING-TWEAKED*", NIL);
        defparameter("*PARAMETER-BEING-TWEAKED-LAST-GOOD-VALUE*", NIL);
        defparameter("*TRAINING-DATA-STATS*", NIL);
        defparameter("*TWEAKING-ITERATIONS*", ONE_INTEGER);
        defparameter("*RANDOM-TWEAKS*", ONE_INTEGER);
        deflexical("*TOPIC-STRUCT-SAVED-OUT-DATA-FILES*", $list_alt66);
        deflexical("*TWEAKABLE-PARAMETER-TRAINING-PAIRS*", NIL != boundp($tweakable_parameter_training_pairs$) ? ((SubLObject) ($tweakable_parameter_training_pairs$.getGlobalValue())) : NIL);
        defparameter("*TOPIC-STRUCT-RECALL-WEIGHT*", $float$0_5);
        defparameter("*GENERALITY-DEGRADATION-BASE*", TWO_INTEGER);
        deflexical("*DISAMBIGUATION-SCORING-METHODS-FOR-STRATEGIES*", $list_alt116);
        defparameter("*TOPIC-STRUCT-VERBOSE?*", T);
        defparameter("*TOPIC-STRUCT*", NIL);
        deflexical("*TOPIC-STRUCT-TEST-TEXTS*", $list_alt279);
        deflexical("*TOPIC-STRUCT-FOR-TEST-TEXT-CACHING-STATE*", NIL);
        deflexical("*TOPIC-STRUCT-TEST-PARAGRAPHS-DIRECTORY*", $str_alt290$_cyc_projects_reading_learning_oe);
        deflexical("*TOPIC-STRUCT-TEST-RESULTS-DIRECTORY*", $str_alt291$_cyc_projects_reading_learning_oe);
        deflexical("*TOPIC-STRUCT-SIBLING-COLLECTIONS*", $list_alt295);
        defparameter("*TOPIC-STRUCT-SBHL-SPACES*", TEN_INTEGER);
        deflexical("*TOPIC-STRUCT-OUTPUT-INITIAL-COLUMN-HEADERS*", $list_alt329);
        deflexical("*TOPIC-STRUCT-OUTPUT-RESULT-CATEGORY-COLUMN-HEADERS*", $list_alt330);
        deflexical("*TOPIC-STRUCT-OUTPUT-COLUMN-HEADERS-CACHING-STATE*", NIL);
        deflexical("*TOPIC-STRUCT-RESULTS-FILE-DELIMITER*", $str_alt342$___);
        defparameter("*SENTENTIAL-CONTRIBUTION-VALUES*", $list_alt368);
        deflexical("*ROUND-PARAM-VALUE-CACHING-STATE*", NIL);
        defparameter("*USE-COOKIE-WEIGHTS-RECURSIVELY?*", NIL);
        defparameter("*COOKIE-JAR*", NIL);
        defparameter("*COOKIE-JAR-ALLOW-NONE-OF-THE-ABOVE?*", T);
        defparameter("*COOKIE-SCORE-TOLERANCE*", $float$0_1);
        defparameter("*MINIMUM-CORRECT-COOKIE-SCORE*", ONE_INTEGER);
        return NIL;
    }

    public static final SubLObject setup_learning_reader_disambiguation_file() {
                access_macros.register_macro_helper(REGISTER_TWEAKABLE_PARAMETER, DEF_TOPIC_STRUCT_TWEAKABLE_PARAMETER);
        memoization_state.note_globally_cached_function(TWEAKABLE_PARAMETER_VALUE_NUM_INTERNAL);
        register_tweakable_parameter($sym21$_L2R_BASE_VALUE_, ZERO_INTEGER, $float$0_4, TWO_INTEGER, TWENTY_INTEGER);
        register_tweakable_parameter($sym23$_L2R_INTRA_SENTENCE_DEGRADATION_BASE_, ZERO_INTEGER, $float$0_75, ONE_INTEGER, $int$100);
        register_tweakable_parameter($sym26$_L2R_INTER_SENTENCE_DEGRADATION_BASE_, ZERO_INTEGER, $float$0_98, ONE_INTEGER, $int$100);
        register_tweakable_parameter($sym28$_TOPIC_STRUCT_ISA_GENLS_GENERALITY_CUTOFF_, ZERO_INTEGER, $int$600000, $int$10000000, $int$100);
        register_tweakable_parameter($word_weight_cutoff$, ZERO_INTEGER, $float$0_025, $float$0_05, $int$50);
        register_tweakable_parameter($sym34$_TOPIC_STRUCT_CHECK_CONCEPTUALLY_RELATED__, ZERO_INTEGER, ONE_INTEGER, ONE_INTEGER, ONE_INTEGER);
        register_tweakable_parameter($topic_struct_conceptually_related_max_word_distance$, ZERO_INTEGER, $int$25, $int$100, TWENTY_INTEGER);
        register_tweakable_parameter($topic_struct_conceptually_related_max_sentence_distance$, ZERO_INTEGER, ZERO_INTEGER, TEN_INTEGER, TEN_INTEGER);
        register_tweakable_parameter($sym38$_L2R_COMPOSITIONAL_CONTRIBUTION_BASE_WEIGHT_, MINUS_ONE_INTEGER, TWO_INTEGER, SEVEN_INTEGER, $int$40);
        register_tweakable_parameter($sym40$_L2R_SENTENCE_TRUTH_BONUS_, MINUS_ONE_INTEGER, TWO_INTEGER, SEVEN_INTEGER, TWO_INTEGER);
        register_tweakable_parameter($sentential_contribution_good_score$, MINUS_ONE_INTEGER, ONE_INTEGER, ONE_INTEGER, $int$100);
        register_tweakable_parameter($sentential_contribution_maybe_score$, MINUS_ONE_INTEGER, $float$0_98, ONE_INTEGER, $int$100);
        register_tweakable_parameter($sentential_contribution_bad_score$, MINUS_ONE_INTEGER, MINUS_ONE_INTEGER, ONE_INTEGER, $int$100);
        register_tweakable_parameter($multi_strategy_bonus$, ZERO_INTEGER, $float$0_36, TWO_INTEGER, $int$100);
        register_tweakable_parameter($cookie_jar_iterativity$, ONE_INTEGER, ONE_INTEGER, FIVE_INTEGER, FOUR_INTEGER);
        subl_macro_promotions.declare_defglobal($tweakable_parameter_training_pairs$);
        memoization_state.note_memoized_function(SIBLING_SCORE_WRT_NEAREST_ISA_OF_TYPE_INTERNAL);
        memoization_state.note_memoized_function(RELEVANT_MIN_ISAS_OF_TYPE_MEMOIZED);
        register_tweakable_parameter($generality_degradation_base$, TWO_INTEGER, TWO_INTEGER, TEN_INTEGER, EIGHT_INTEGER);
        memoization_state.note_memoized_function($sym93$TOPIC_STRUCT_CONCEPTUALLY_RELATED_);
        utilities_macros.register_kb_function(STRATEGY_SCORE_FOR_SIHMS_DEFN);
        utilities_macros.note_funcall_helper_function(TOPIC_STRUCT_TAG_P);
        access_macros.register_external_symbol(URL_FOR_DENOTATION);
        memoization_state.note_memoized_function(TOPIC_STRUCT_LEXICON_MEMOIZED);
        memoization_state.note_globally_cached_function(TOPIC_STRUCT_FOR_TEST_TEXT);
        {
            SubLObject cdolist_list_var = $topic_struct_sibling_collections$.getGlobalValue();
            SubLObject col = NIL;
            for (col = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , col = cdolist_list_var.first()) {
                {
                    SubLObject parameter = topic_struct_sibling_collection_parameter(col);
                    eval(listS(DEF_TOPIC_STRUCT_TWEAKABLE_PARAMETER, parameter, $list_alt298));
                }
            }
        }
        memoization_state.note_globally_cached_function(TOPIC_STRUCT_OUTPUT_COLUMN_HEADERS);
        memoization_state.note_globally_cached_function(ROUND_PARAM_VALUE);
        register_tweakable_parameter($cookie_score_tolerance$, ZERO_INTEGER, $float$0_1, $float$0_5, $int$50);
        register_tweakable_parameter($minimum_correct_cookie_score$, ZERO_INTEGER, ONE_INTEGER, TEN_INTEGER, $int$100);
        return NIL;
    }

    // // Internal Constants
    static private final SubLList $list_alt0 = list(makeSymbol("NAME"), makeSymbol("MIN"), makeSymbol("INITIAL"), makeSymbol("MAX"), makeSymbol("GRANULARITY"), makeSymbol("&OPTIONAL"), makeSymbol("DOC-STRING"));



    private static final SubLSymbol DEFPARAMETER_PRIVATE = makeSymbol("DEFPARAMETER-PRIVATE");





    private static final SubLSymbol TOPIC_STRUCT_PARAMETER_VALUE = makeSymbol("TOPIC-STRUCT-PARAMETER-VALUE");



    private static final SubLSymbol REGISTER_TWEAKABLE_PARAMETER = makeSymbol("REGISTER-TWEAKABLE-PARAMETER");

    private static final SubLSymbol DEF_TOPIC_STRUCT_TWEAKABLE_PARAMETER = makeSymbol("DEF-TOPIC-STRUCT-TWEAKABLE-PARAMETER");

    static private final SubLList $list_alt9 = list(makeSymbol("MIN"), makeSymbol("INITIAL"), makeSymbol("MAX"), makeSymbol("GRANULARITY"), makeSymbol("&OPTIONAL"), makeSymbol("VALUES"));





    static private final SubLString $str_alt12$_S_exceeds_granularity__S = makeString("~S exceeds granularity ~S");

    private static final SubLSymbol TWEAKABLE_PARAMETER_VALUE_NUM_INTERNAL = makeSymbol("TWEAKABLE-PARAMETER-VALUE-NUM-INTERNAL");



    static private final SubLString $str_alt15$_S_exceeds_max_value__S = makeString("~S exceeds max value ~S");

    static private final SubLString $str_alt16$_S_under_min_value__S = makeString("~S under min value ~S");

    static private final SubLString $str_alt17$Tweakable_parameter_value_discrep = makeString("Tweakable parameter value discrepancy: ~S vs. ~S");

    public static final SubLSymbol $tweakable_parameter_value_num_internal_caching_state$ = makeSymbol("*TWEAKABLE-PARAMETER-VALUE-NUM-INTERNAL-CACHING-STATE*");

    public static final SubLSymbol $kw19$_MEMOIZED_ITEM_NOT_FOUND_ = makeKeyword("&MEMOIZED-ITEM-NOT-FOUND&");

    public static final SubLFloat $float$0_4 = makeDouble(0.4);

    static private final SubLSymbol $sym21$_L2R_BASE_VALUE_ = makeSymbol("*L2R-BASE-VALUE*");

    public static final SubLFloat $float$0_75 = makeDouble(0.75);

    static private final SubLSymbol $sym23$_L2R_INTRA_SENTENCE_DEGRADATION_BASE_ = makeSymbol("*L2R-INTRA-SENTENCE-DEGRADATION-BASE*");



    public static final SubLFloat $float$0_98 = makeDouble(0.98);

    static private final SubLSymbol $sym26$_L2R_INTER_SENTENCE_DEGRADATION_BASE_ = makeSymbol("*L2R-INTER-SENTENCE-DEGRADATION-BASE*");

    public static final SubLInteger $int$600000 = makeInteger(600000);

    static private final SubLSymbol $sym28$_TOPIC_STRUCT_ISA_GENLS_GENERALITY_CUTOFF_ = makeSymbol("*TOPIC-STRUCT-ISA/GENLS-GENERALITY-CUTOFF*");

    public static final SubLInteger $int$10000000 = makeInteger(10000000);

    public static final SubLFloat $float$0_025 = makeDouble(0.025);

    public static final SubLSymbol $word_weight_cutoff$ = makeSymbol("*WORD-WEIGHT-CUTOFF*");

    public static final SubLFloat $float$0_05 = makeDouble(0.05);

    public static final SubLInteger $int$50 = makeInteger(50);

    static private final SubLSymbol $sym34$_TOPIC_STRUCT_CHECK_CONCEPTUALLY_RELATED__ = makeSymbol("*TOPIC-STRUCT-CHECK-CONCEPTUALLY-RELATED?*");

    public static final SubLInteger $int$25 = makeInteger(25);

    public static final SubLSymbol $topic_struct_conceptually_related_max_word_distance$ = makeSymbol("*TOPIC-STRUCT-CONCEPTUALLY-RELATED-MAX-WORD-DISTANCE*");

    public static final SubLSymbol $topic_struct_conceptually_related_max_sentence_distance$ = makeSymbol("*TOPIC-STRUCT-CONCEPTUALLY-RELATED-MAX-SENTENCE-DISTANCE*");

    static private final SubLSymbol $sym38$_L2R_COMPOSITIONAL_CONTRIBUTION_BASE_WEIGHT_ = makeSymbol("*L2R-COMPOSITIONAL-CONTRIBUTION-BASE-WEIGHT*");

    public static final SubLInteger $int$40 = makeInteger(40);

    static private final SubLSymbol $sym40$_L2R_SENTENCE_TRUTH_BONUS_ = makeSymbol("*L2R-SENTENCE-TRUTH-BONUS*");

    public static final SubLSymbol $sentential_contribution_good_score$ = makeSymbol("*SENTENTIAL-CONTRIBUTION-GOOD-SCORE*");

    public static final SubLSymbol $sentential_contribution_maybe_score$ = makeSymbol("*SENTENTIAL-CONTRIBUTION-MAYBE-SCORE*");

    public static final SubLSymbol $sentential_contribution_bad_score$ = makeSymbol("*SENTENTIAL-CONTRIBUTION-BAD-SCORE*");

    public static final SubLFloat $float$0_36 = makeDouble(0.36);

    public static final SubLSymbol $multi_strategy_bonus$ = makeSymbol("*MULTI-STRATEGY-BONUS*");

    public static final SubLSymbol $cookie_jar_iterativity$ = makeSymbol("*COOKIE-JAR-ITERATIVITY*");

    static private final SubLList $list_alt47 = list(makeSymbol("MAP"), makeSymbol("&BODY"), makeSymbol("BODY"));



    public static final SubLSymbol $topic_struct_parameter_value_map$ = makeSymbol("*TOPIC-STRUCT-PARAMETER-VALUE-MAP*");



    static private final SubLString $str_alt51$_S_is_not_a_known_tweakable_param = makeString("~S is not a known tweakable parameter");



    static private final SubLList $list_alt53 = cons(makeSymbol("PARAMETER"), makeUninternedSymbol("VALUE"));

    private static final SubLSymbol TOPIC_STRUCT_SCORE_FROM_RECALL_AND_PRECISION = makeSymbol("TOPIC-STRUCT-SCORE-FROM-RECALL-AND-PRECISION");

    static private final SubLSymbol $sym55$_ = makeSymbol("+");

    private static final SubLSymbol DICTIONARY_LENGTH = makeSymbol("DICTIONARY-LENGTH");



    static private final SubLString $str_alt58$Starting_Optimization_pass__A__be = makeString("Starting Optimization pass ~A. best score so far: ~,3F...");

    static private final SubLString $str_alt59$_____D_positions_rescored____D_sw = makeString("~& ~:D positions rescored (~:D sweeps done) in ~,3F seconds.~% Average: ~,3F milliseconds per position.~%best score: ~,5F%");



    static private final SubLString $str_alt61$__Final_score____5F___Recall_weig = makeString("~&Final score: ~,5F% (Recall weight: ~,2F)~%");

    static private final SubLString $str_alt62$___S___S_____S__ = makeString("~&~S: ~S -> ~S~%");

    static private final SubLString $str_alt63$_TRAINING_DATA_STATS__is__S = makeString("*TRAINING-DATA-STATS* is ~S");

    static private final SubLString $str_alt64$__Tweaked__S_from_value__S_to_val = makeString("~&Tweaked ~S from value ~S to value ~S (of ~S)~% New best score: ~,3F% (Recall: ~,3F%, Precision: ~,3F%)~%");

    static private final SubLString $str_alt65$__Tweaked__S_from_value__S_back_t = makeString("~&Tweaked ~S from value ~S back to value ~S (of ~S)~%");

    static private final SubLList $list_alt66 = list(list(makeString("/cyc/projects/reading-learning/oe/process_output_files/results-total/angola-gollum-20051209-1709/topic-struct.cfasl"), makeString("/cyc/projects/reading-learning/oe/process_output_files/results-total/angola-gollum-20051209-1709/cookie-jar.cfasl"), makeString("/cyc/projects/reading-learning/oe/process_output_files/best-sentence-parsing-results/cyc8-angola-3/results-dictionary.cfasl")), list(makeString("/cyc/projects/reading-learning/oe/process_output_files/results-total/biology-gollum-20051207-1438/topic-struct.cfasl"), makeString("/cyc/projects/reading-learning/oe/process_output_files/results-total/biology-gollum-20051207-1438/cookie-jar.cfasl"), makeString("/cyc/projects/reading-learning/oe/process_output_files/best-sentence-parsing-results/cyc8-biology-2/results-dictionary.cfasl")), list(makeString("/cyc/projects/reading-learning/oe/process_output_files/results-total/backgammon-cyc8-20051206-0917/topic-struct.cfasl"), makeString("/cyc/projects/reading-learning/oe/process_output_files/results-total/backgammon-cyc8-20051206-0917/cookie-jar.cfasl"), makeString("/cyc/projects/reading-learning/oe/process_output_files/best-sentence-parsing-results/cyc8-backgammon-2/results-dictionary.cfasl")), list(makeString("/cyc/projects/reading-learning/oe/process_output_files/results-total/jefferson-gollum-20051209-0748/topic-struct.cfasl"), makeString("/cyc/projects/reading-learning/oe/process_output_files/results-total/jefferson-gollum-20051209-0748/cookie-jar.cfasl"), makeString("/cyc/projects/reading-learning/oe/process_output_files/best-sentence-parsing-results/gollum-jefferson-1/results-dictionary.cfasl")));

    public static final SubLSymbol $tweakable_parameter_training_pairs$ = makeSymbol("*TWEAKABLE-PARAMETER-TRAINING-PAIRS*");

    static private final SubLList $list_alt68 = list(makeSymbol("TOPIC-STRUCT-FILE"), makeSymbol("COOKIE-JAR-FILE"), makeSymbol("SENTENCE-RESULTS-FILE"));

    static private final SubLList $list_alt69 = list(makeSymbol("TOPIC-STRUCT"), makeSymbol("COOKIE-JAR"));

    static private final SubLString $str_alt70$____3F___ = makeString("~&~,3F%~%");



    static private final SubLString $str_alt72$_A__Tweaking__S_from__S_to__S___c = makeString("~A: Tweaking ~S from ~S to ~S~% caused score for document ~S to ~A from ~,3F% to ~,3F%~%  (R: ~S of ~S answers returned) (P: ~S of ~S guesses correct)");

    static private final SubLString $$$BOO = makeString("BOO");

    static private final SubLString $$$YAY = makeString("YAY");

    static private final SubLString $$$decline = makeString("decline");

    static private final SubLString $$$increase = makeString("increase");

    static private final SubLString $str_alt77$Bad_recall_and_or_precision_value = makeString("Bad recall and/or precision values: ~S ~S");

    public static final SubLFloat $float$0_5 = makeDouble(0.5);

    private static final SubLSymbol $FOCAL_POSITION = makeKeyword("FOCAL-POSITION");

    private static final SubLSymbol $SUPPORTER_POSITION = makeKeyword("SUPPORTER-POSITION");

    private static final SubLSymbol $RAW_SCORE = makeKeyword("RAW-SCORE");

    private static final SubLSymbol SIBLING_SCORE_WRT_NEAREST_ISA_OF_TYPE_INTERNAL = makeSymbol("SIBLING-SCORE-WRT-NEAREST-ISA-OF-TYPE-INTERNAL");

    static private final SubLString $str_alt83$___S_and__S_share_common__S_____S = makeString("~&~S and ~S share common ~S:~% ~S~%");

    private static final SubLSymbol RELEVANT_MIN_ISAS_OF_TYPE_MEMOIZED = makeSymbol("RELEVANT-MIN-ISAS-OF-TYPE-MEMOIZED");

    static private final SubLSymbol $sym85$IRRELEVANT_MIN_ISA_ = makeSymbol("IRRELEVANT-MIN-ISA?");

    static private final SubLString $str_alt86$__Spent__S_seconds_finding_releva = makeString("~&Spent ~S seconds finding relevant ~S min-isas of ~S");

    public static final SubLSymbol $kw87$SUPPORTER_MORE_GENERAL_ = makeKeyword("SUPPORTER-MORE-GENERAL?");

    private static final SubLSymbol $TERM_GENERALITY = makeKeyword("TERM-GENERALITY");

    private static final SubLSymbol $SUPPORTER = makeKeyword("SUPPORTER");

    private static final SubLSymbol $SUPPORTER_GENERALITY = makeKeyword("SUPPORTER-GENERALITY");



    public static final SubLSymbol $generality_degradation_base$ = makeSymbol("*GENERALITY-DEGRADATION-BASE*");

    static private final SubLSymbol $sym93$TOPIC_STRUCT_CONCEPTUALLY_RELATED_ = makeSymbol("TOPIC-STRUCT-CONCEPTUALLY-RELATED?");

    private static final SubLSymbol TOPIC_STRUCT_SENTENCE_P = makeSymbol("TOPIC-STRUCT-SENTENCE-P");





    public static final SubLObject $$NLPhrase = constant_handles.reader_make_constant_shell(makeString("NLPhrase"));

    static private final SubLString $str_alt98$Spent__S_seconds_harvesting_phras = makeString("Spent ~S seconds harvesting phrases in~% ~S");

    static private final SubLList $list_alt99 = list(makeSymbol("TOKENS"), makeSymbol("PARSES"));

    public static final SubLInteger $int$30 = makeInteger(30);



    private static final SubLSymbol UNDERSPECIFIED_PRED_P = makeSymbol("UNDERSPECIFIED-PRED-P");

    static private final SubLString $str_alt103$Timed_out_trying_to_reformulate__ = makeString("Timed out trying to reformulate~% ~S~% Result:~% ~S");

    static private final SubLString $str_alt104$Good_parse_____S = makeString("Good parse:~% ~S");

    private static final SubLSymbol $FUDGE_FACTOR = makeKeyword("FUDGE-FACTOR");

    static private final SubLString $str_alt106$_S_is_used_in____S___A_Fudge_fact = makeString("~S is used in~% ~S~%~A Fudge factor: ~S");

    static private final SubLString $$$Reformulated_to = makeString("Reformulated to");

    static private final SubLString $str_alt108$_ = makeString(" ");

    static private final SubLString $str_alt109$Spent__S_seconds_reformulating__S = makeString("Spent ~S seconds reformulating ~S parses harvested from ~S~% ~S");

    private static final SubLSymbol $SENTENCE_TRUTH_BONUS = makeKeyword("SENTENCE-TRUTH-BONUS");



    static private final SubLString $str_alt112$Couldn_t_find_a_valid_scoring_met = makeString("Couldn't find a valid scoring method for ~S");

    static private final SubLString $str_alt113$Couldn_t_get_a_valid_score_for__S = makeString("Couldn't get a valid score for ~S~% ~S~% ~S");

    static private final SubLString $str_alt114$Error_in_STRATEGY_SCORE_FOR_SIHMS = makeString("Error in STRATEGY-SCORE-FOR-SIHMS-DEFN: ");

    private static final SubLSymbol STRATEGY_SCORE_FOR_SIHMS_DEFN = makeSymbol("STRATEGY-SCORE-FOR-SIHMS-DEFN");

    static private final SubLList $list_alt116 = list(new SubLObject[]{ cons(list(constant_handles.reader_make_constant_shell(makeString("SymmetricDisambiguationStrategyForBinaryPredFn")), constant_handles.reader_make_constant_shell(makeString("conceptuallyRelated"))), makeSymbol("CONCEPTUALLY-RELATED-SCORE-FROM-SIHMS")), cons(list(constant_handles.reader_make_constant_shell(makeString("SymmetricDisambiguationStrategyForBinaryPredFn")), constant_handles.reader_make_constant_shell(makeString("termFormulas"))), makeSymbol("TERM-FORMULAS-SCORE-FROM-SIHMS")), cons(constant_handles.reader_make_constant_shell(makeString("ValidatedHypothesis-Strategy")), makeSymbol("VALIDATED-HYPOTHESIS-SCORE-FROM-SIHMS")), cons(list(constant_handles.reader_make_constant_shell(makeString("SymmetricDisambiguationStrategyForBinaryPredFn")), constant_handles.reader_make_constant_shell(makeString("isa"))), makeSymbol("ISA-SCORE-FROM-SIHMS")), cons(list(constant_handles.reader_make_constant_shell(makeString("HypothesisLevelStrategyForPredAndArgsFn")), constant_handles.reader_make_constant_shell(makeString("sihmsMutuallySupportive-ConceptReferredToInDistinctWays")), list(constant_handles.reader_make_constant_shell(makeString("TheSet")), ONE_INTEGER, TWO_INTEGER)), makeSymbol("SYNONYM-SCORE-FROM-SIHMS")), cons(list(constant_handles.reader_make_constant_shell(makeString("HypothesisLevelStrategyForPredAndArgsFn")), constant_handles.reader_make_constant_shell(makeString("sihmPresuppositionSupportForHypothesisMt")), list(constant_handles.reader_make_constant_shell(makeString("TheSet")), ONE_INTEGER, TWO_INTEGER)), makeSymbol("PRESUPPOSITION-SCORE-FROM-SIHMS")), cons(list(constant_handles.reader_make_constant_shell(makeString("SymmetricDisambiguationStrategyForBinaryPredFn")), list(constant_handles.reader_make_constant_shell(makeString("Kappa")), list(makeSymbol("?ARG1"), makeSymbol("?ARG2")), list(constant_handles.reader_make_constant_shell(makeString("siblingsWithRespectToType")), makeSymbol("?ARG1"), makeSymbol("?ARG2"), makeKeyword("ANYTHING")))), makeSymbol("SIBLING-SCORE-FROM-SIHMS")), cons(list(makeKeyword("OR"), constant_handles.reader_make_constant_shell(makeString("TypeBehaviorCapable-DisambiguationScoringStrategy")), list(constant_handles.reader_make_constant_shell(makeString("SymmetricDisambiguationStrategyForBinaryPredFn")), list(constant_handles.reader_make_constant_shell(makeString("Kappa")), list(makeSymbol("?ARG1"), makeSymbol("?ARG2")), list(constant_handles.reader_make_constant_shell(makeString("thereExists")), makeSymbol("?X"), list(list(constant_handles.reader_make_constant_shell(makeString("TypeCapableFn")), constant_handles.reader_make_constant_shell(makeString("behaviorCapable"))), makeSymbol("?ARG1"), makeSymbol("?ARG2"), makeSymbol("?X")))))), makeSymbol("TYPE-BEHAVIOR-CAPABLE-SCORE-FROM-SIHMS")), cons(list(constant_handles.reader_make_constant_shell(makeString("SymmetricDisambiguationStrategyForBinaryPredFn")), list(constant_handles.reader_make_constant_shell(makeString("Kappa")), list(makeSymbol("?SPEC"), makeSymbol("?GENL")), list(constant_handles.reader_make_constant_shell(makeString("and")), list(constant_handles.reader_make_constant_shell(makeString("genls")), makeSymbol("?SPEC"), makeSymbol("?GENL")), list(constant_handles.reader_make_constant_shell(makeString("different")), makeSymbol("?GENL"), makeSymbol("?SPEC"))))), makeSymbol("GENL-SCORE-FROM-SIHMS")), cons(constant_handles.reader_make_constant_shell(makeString("RelativeAmbiguity-DisambiguationScoringStrategy")), makeSymbol("RELATIVE-AMBIGUITY-SCORE-FROM-SIHMS")), cons(constant_handles.reader_make_constant_shell(makeString("RewardReliableNCRs-DisambiguationScoringStrategy")), makeSymbol("NCR-RELIABILITY-SCORE-FROM-SIHMS")) });



    static private final SubLList $list_alt118 = cons(makeSymbol("PATTERN"), makeSymbol("THIS-METHOD"));

    private static final SubLSymbol $COMPETITOR = makeKeyword("COMPETITOR");

    public static final SubLObject $$contradictoryMt = constant_handles.reader_make_constant_shell(makeString("contradictoryMt"));

    static private final SubLList $list_alt121 = list(makeKeyword("COMPETITOR"));

    public static final SubLObject $$ContentModelForPegFn = constant_handles.reader_make_constant_shell(makeString("ContentModelForPegFn"));

    public static final SubLObject $$ncRuleSpawnsHypotheses = constant_handles.reader_make_constant_shell(makeString("ncRuleSpawnsHypotheses"));



    static private final SubLList $list_alt125 = list(constant_handles.reader_make_constant_shell(makeString("Kappa")), list(makeSymbol("?ARG1"), makeSymbol("?ARG2")), list(constant_handles.reader_make_constant_shell(makeString("siblingsWithRespectToType")), makeSymbol("?ARG1"), makeSymbol("?ARG2"), list($BIND, makeSymbol("TYPE"))));



    private static final SubLSymbol $AMBIGUITY_FACTOR = makeKeyword("AMBIGUITY-FACTOR");

    private static final SubLSymbol $COMMON_ISAS = makeKeyword("COMMON-ISAS");

    public static final SubLObject $const129$ContentHypothesisMicrotheory_Cont = constant_handles.reader_make_constant_shell(makeString("ContentHypothesisMicrotheory-ContentValidatedInInference"));

    public static final SubLObject $$OptimizedStrategyFormFn = constant_handles.reader_make_constant_shell(makeString("OptimizedStrategyFormFn"));

    public static final SubLObject $const131$DisambiguationScoringStrategyPara = constant_handles.reader_make_constant_shell(makeString("DisambiguationScoringStrategyParameter"));



    public static final SubLObject $$optimizedStrategyForm = constant_handles.reader_make_constant_shell(makeString("optimizedStrategyForm"));



    public static final SubLObject $$EverythingPSC = constant_handles.reader_make_constant_shell(makeString("EverythingPSC"));

    public static final SubLObject $$mtFocalContent = constant_handles.reader_make_constant_shell(makeString("mtFocalContent"));



    static private final SubLList $list_alt138 = list(list(makeKeyword("OR"), constant_handles.reader_make_constant_shell(makeString("pegInterpretation-CycL")), constant_handles.reader_make_constant_shell(makeString("presupposedContents-CycL"))), list($BIND, makeSymbol("THIS-PEG")), list($BIND, makeSymbol("THIS-CYCL")));

    private static final SubLSymbol THIS_CYCL = makeSymbol("THIS-CYCL");

    private static final SubLSymbol THIS_PEG = makeSymbol("THIS-PEG");

    static private final SubLString $str_alt141$Couldn_t_find_peg_for__S = makeString("Couldn't find peg for ~S");

    static private final SubLString $str_alt142$Couldn_t_find_cycl_for__S = makeString("Couldn't find cycl for ~S");

    static private final SubLSymbol $sym143$_DOCUMENT = makeSymbol("?DOCUMENT");

    public static final SubLObject $$and = constant_handles.reader_make_constant_shell(makeString("and"));

    public static final SubLObject $$structureContainsCIS = constant_handles.reader_make_constant_shell(makeString("structureContainsCIS"));

    static private final SubLSymbol $sym146$_AIS = makeSymbol("?AIS");

    static private final SubLList $list_alt147 = list(list(constant_handles.reader_make_constant_shell(makeString("correspondingAIS")), makeSymbol("?DOCUMENT"), makeSymbol("?AIS")), list(constant_handles.reader_make_constant_shell(makeString("isa")), makeSymbol("?DOCUMENT"), constant_handles.reader_make_constant_shell(makeString("LearnByReadingDocument"))));

    public static final SubLObject $$InferencePSC = constant_handles.reader_make_constant_shell(makeString("InferencePSC"));

    static private final SubLList $list_alt149 = list(makeKeyword("ANSWER-LANGUAGE"), makeKeyword("HL"), makeKeyword("MAX-NUMBER"), ONE_INTEGER);

    static private final SubLList $list_alt150 = list(constant_handles.reader_make_constant_shell(makeString("structureContainsCIS")), makeSymbol("?AIS"), makeSymbol("?PEG"));

    public static final SubLObject $$candidatePegInterpretations_CycL = constant_handles.reader_make_constant_shell(makeString("candidatePegInterpretations-CycL"));

    static private final SubLSymbol $sym152$_PEG = makeSymbol("?PEG");

    public static final SubLObject $$correspondingAIS = constant_handles.reader_make_constant_shell(makeString("correspondingAIS"));

    static private final SubLList $list_alt154 = list(makeSymbol("?AIS"));

    static private final SubLList $list_alt155 = list(makeKeyword("MAX-NUMBER"), ONE_INTEGER, makeKeyword("ANSWER-LANGUAGE"), makeKeyword("HL"));

    public static final SubLObject $$pegInterpretation_CycL = constant_handles.reader_make_constant_shell(makeString("pegInterpretation-CycL"));

    static private final SubLString $str_alt157$Couldn_t_find_position_for__S = makeString("Couldn't find position for ~S");

    public static final SubLObject $$nodeCoveredByPeg = constant_handles.reader_make_constant_shell(makeString("nodeCoveredByPeg"));

    public static final SubLObject $$properSubExpressions = constant_handles.reader_make_constant_shell(makeString("properSubExpressions"));

    static private final SubLString $str_alt160$Couldn_t_determine_start_and_end_ = makeString("Couldn't determine start and end points from ~S");

    public static final SubLObject $$syntacticNodeInitialToken = constant_handles.reader_make_constant_shell(makeString("syntacticNodeInitialToken"));







    public static final SubLObject $$True_JustificationTruth = constant_handles.reader_make_constant_shell(makeString("True-JustificationTruth"));





    static private final SubLString $str_alt168$_A_is_not_a__A = makeString("~A is not a ~A");





    static private final SubLString $$$continue_anyway = makeString("continue anyway");



    static private final SubLString $str_alt173$_A_is_not_a_valid__sbhl_type_erro = makeString("~A is not a valid *sbhl-type-error-action* value");

    public static final SubLObject $$genlPreds = constant_handles.reader_make_constant_shell(makeString("genlPreds"));

    static private final SubLString $str_alt175$attempting_to_bind_direction_link = makeString("attempting to bind direction link variable, to NIL. macro body not executed.");

    static private final SubLString $str_alt176$Node__a_does_not_pass_sbhl_type_t = makeString("Node ~a does not pass sbhl-type-test ~a~%");

    public static final SubLObject $$syntacticNodeFinalToken = constant_handles.reader_make_constant_shell(makeString("syntacticNodeFinalToken"));

    public static final SubLObject $const178$nthOccurrenceOfStructureTypeInStr = constant_handles.reader_make_constant_shell(makeString("nthOccurrenceOfStructureTypeInStructure"));

    static private final SubLList $list_alt179 = list(makeKeyword("ANYTHING"), makeKeyword("ANYTHING"), list($BIND, makeSymbol("SENTENCE-NUMBER")), constant_handles.reader_make_constant_shell(makeString("NLSentence")), list($BIND, makeSymbol("PARAGRAPH")));





    static private final SubLList $list_alt182 = list(list(makeSymbol("TOPIC-STRUCT")), makeSymbol("&BODY"), makeSymbol("BODY"));

    public static final SubLSymbol $topic_struct$ = makeSymbol("*TOPIC-STRUCT*");

    static private final SubLList $list_alt184 = list(list(makeSymbol("WORD"), makeSymbol("POSITION"), makeSymbol("TOPIC-STRUCT"), makeSymbol("&KEY"), makeSymbol("DONE?"), makeSymbol("PROGRESS-MESSAGE")), makeSymbol("&BODY"), makeSymbol("BODY"));

    static private final SubLList $list_alt185 = list(makeKeyword("DONE?"), makeKeyword("PROGRESS-MESSAGE"));

    private static final SubLSymbol $ALLOW_OTHER_KEYS = makeKeyword("ALLOW-OTHER-KEYS");





    static private final SubLSymbol $sym189$DONE_COUNT = makeUninternedSymbol("DONE-COUNT");

    static private final SubLSymbol $sym190$WORD_COUNT = makeUninternedSymbol("WORD-COUNT");

    static private final SubLList $list_alt191 = list(ZERO_INTEGER);



    private static final SubLSymbol COUNT_TOPIC_STRUCT_WORDS = makeSymbol("COUNT-TOPIC-STRUCT-WORDS");

    static private final SubLSymbol $sym194$_SILENT_PROGRESS__ = makeSymbol("*SILENT-PROGRESS?*");









    private static final SubLSymbol TOPIC_STRUCT_DOCUMENT_P = makeSymbol("TOPIC-STRUCT-DOCUMENT-P");

    private static final SubLSymbol DO_DOCUMENT_TOPIC_STRUCT_WORDS = makeSymbol("DO-DOCUMENT-TOPIC-STRUCT-WORDS");









    private static final SubLSymbol DO_PARAGRAPH_TOPIC_STRUCT_WORDS = makeSymbol("DO-PARAGRAPH-TOPIC-STRUCT-WORDS");



    static private final SubLString $str_alt207$Invalid_attempt_to_reuse_memoizat = makeString("Invalid attempt to reuse memoization state in multiple threads simultaneously.");

    static private final SubLString $str_alt208$Making_document_topic_structure__ = makeString("Making document topic structure...");

    static private final SubLList $list_alt209 = list(list(makeSymbol("WORD"), makeSymbol("POSITION"), makeSymbol("TOPIC-STRUCT")), makeSymbol("&BODY"), makeSymbol("BODY"));

    static private final SubLSymbol $sym210$PARAGRAPH_NUM = makeUninternedSymbol("PARAGRAPH-NUM");

    static private final SubLSymbol $sym211$PARAGRAPH_TOPIC_STRUCT = makeUninternedSymbol("PARAGRAPH-TOPIC-STRUCT");

    static private final SubLSymbol $sym212$SUBPOSITION = makeUninternedSymbol("SUBPOSITION");



    private static final SubLSymbol DOCUMENT_TOPIC_STRUCT_PARAGRAPH_STRUCTS = makeSymbol("DOCUMENT-TOPIC-STRUCT-PARAGRAPH-STRUCTS");



    static private final SubLSymbol $sym216$SENTENCE = makeUninternedSymbol("SENTENCE");

    static private final SubLSymbol $sym217$SENTENCE_NUM = makeUninternedSymbol("SENTENCE-NUM");

    static private final SubLSymbol $sym218$WORD_NUM = makeUninternedSymbol("WORD-NUM");





    static private final SubLList $list_alt221 = list(list(makeSymbol("DENOT"), makeSymbol("WORD"), makeSymbol("&KEY"), makeSymbol("DONE?")), makeSymbol("&BODY"), makeSymbol("BODY"));

    static private final SubLList $list_alt222 = list(makeKeyword("DONE?"));



    private static final SubLSymbol TOPIC_STRUCT_WORD_DENOTS = makeSymbol("TOPIC-STRUCT-WORD-DENOTS");

    static private final SubLSymbol $sym225$INVALID_CONSTANT_ = makeSymbol("INVALID-CONSTANT?");

    private static final SubLSymbol INVALID_NART_P = makeSymbol("INVALID-NART-P");

    private static final SubLSymbol TOPIC_STRUCT_WORD_P = makeSymbol("TOPIC-STRUCT-WORD-P");

    static private final SubLList $list_alt228 = list(makeKeyword("OR"), list(constant_handles.reader_make_constant_shell(makeString("TheList")), makeKeyword("STRING"), list($TEST, makeSymbol("TOPIC-STRUCT-TAG-P")), makeKeyword("FULLY-BOUND")), list(constant_handles.reader_make_constant_shell(makeString("TheList")), makeKeyword("STRING"), list($TEST, makeSymbol("TOPIC-STRUCT-TAG-P")), makeKeyword("FULLY-BOUND"), makeKeyword("FULLY-BOUND")), list(constant_handles.reader_make_constant_shell(makeString("TheList")), makeKeyword("STRING"), list($TEST, makeSymbol("TOPIC-STRUCT-TAG-P")), makeKeyword("FULLY-BOUND"), makeKeyword("FULLY-BOUND"), list(makeKeyword("OR"), makeKeyword("VERIFY"), makeKeyword("REDO-ME"))));

    private static final SubLSymbol TOPIC_STRUCT_TAG_P = makeSymbol("TOPIC-STRUCT-TAG-P");

    static private final SubLList $list_alt230 = cons(makeSymbol("PARAGRAPH-NUM"), makeSymbol("POSITION-IN-PARAGRAPH"));

    static private final SubLSymbol $sym231$1_ = makeSymbol("1+");

    static private final SubLString $str_alt232$_ = makeString("(");

    static private final SubLString $str_alt233$_____ = makeString("(... ");

    static private final SubLString $str_alt234$_A_ = makeString("~A ");

    static private final SubLString $str_alt235$__ = makeString(") ");

    static private final SubLString $str_alt236$_ = makeString(")");

    static private final SubLString $str_alt237$____ = makeString("...)");

    static private final SubLString $str_alt238$__ = makeString(" (");

    static private final SubLString $str_alt239$___S_is_a_spec_or_genl_of_each_of = makeString("~&~S is a spec or genl of each of~% ~S~%");

    private static final SubLSymbol COOKIE_DATA_SUPPORTER = makeSymbol("COOKIE-DATA-SUPPORTER");



    static private final SubLString $str_alt242$___S_is_all_of____S__ = makeString("~&~S is all of~% ~S~%");

    static private final SubLString $str_alt243$Looking_for_denots_conceptually_r = makeString("Looking for denots conceptually related to ~S~% in ~S");

    static private final SubLString $str_alt244$___S_is_conceptually_related_to__ = makeString("~&~S is conceptually related to ~S~% in ~S~%");

    static private final SubLString $str_alt245$Spent__S_seconds_searching_for_de = makeString("Spent ~S seconds searching for denots conceptually related to ~S");

    static private final SubLString $str_alt246$Couldn_t_find_file____S = makeString("Couldn't find file~% ~S");



    private static final SubLSymbol $ANNOTATE = makeKeyword("ANNOTATE");

    private static final SubLSymbol $REDO_ME = makeKeyword("REDO-ME");



    static private final SubLString $str_alt252$_topic_struct_cfasl = makeString("-topic-struct.cfasl");



    static private final SubLString $str_alt254$__________________S_of__S________ = makeString("~%~%------------ ~S of ~S------------------~%~A: ~A~%Context: ~S~%");

    static private final SubLString $$$Redo = makeString("Redo");

    static private final SubLString $$$Verify = makeString("Verify");



    static private final SubLString $str_alt258$__COMMENTS___ = makeString("~&COMMENTS:~%");



    public static final SubLObject $$TheSet = constant_handles.reader_make_constant_shell(makeString("TheSet"));

    static private final SubLString $str_alt261$___A__A___S = makeString("~&~A[~A] ~S");

    static private final SubLString $str_alt262$___S = makeString(": ~S");

    public static final SubLObject $$comment = constant_handles.reader_make_constant_shell(makeString("comment"));

    static private final SubLString $str_alt264$___A____3___none___A____1___skip_ = makeString("~&~A~% [3] <none> ~A~% [1] <skip> ~% [0] <quit>~A ~%~%");

    static private final SubLString $str_alt265$__4__SUGGESTION__ = makeString(" [4] SUGGESTION: ");

    static private final SubLString $str_alt266$__2__EXISTING__ = makeString(" [2] EXISTING: ");

    static private final SubLString $str_alt267$______display_comments_ = makeString(" [?] <display comments>");

    static private final SubLSymbol $sym268$_ = makeSymbol("?");

    static private final SubLList $list_alt269 = list(constant_handles.reader_make_constant_shell(makeString("TheSet")));

    static private final SubLList $list_alt270 = cons(constant_handles.reader_make_constant_shell(makeString("TheSet")), makeKeyword("ANYTHING"));

    static private final SubLString $str_alt271$Confirmed_answer___S = makeString("Confirmed answer: ~S");

    static private final SubLString $str_alt272$Couldn_t_interpret_response___S = makeString("Couldn't interpret response: ~S");

    private static final SubLSymbol URL_FOR_DENOTATION = makeSymbol("URL-FOR-DENOTATION");

    static private final SubLString $str_alt274$_ = makeString("&");

    static private final SubLString $str_alt275$cg_ = makeString("cg?");



    static private final SubLSymbol $sym277$_ = makeSymbol(">");



    static private final SubLList $list_alt279 = list(new SubLObject[]{ makeString("Leonardo da Vinci (April 15, 1452 ? May 2, 1519) was an Italian Renaissance architect, musician, anatomist, inventor, engineer, sculptor, geometer, and painter. He has been described as the archetype of the Renaissance man and as a universal genius. Leonardo is famous for his masterly paintings, such as The Last Supper and Mona Lisa. He is also known for designing many inventions that anticipated modern technology, although few of these designs were constructed in his lifetime. In addition, he helped advance the study of anatomy, astronomy, and civil engineering."), makeString("The Commonwealth of Australia is a country in the Southern Hemisphere comprising the world's smallest continent and a number of islands in the Southern, Indian and Pacific Oceans. Australia's neighbouring countries are Indonesia, East Timor and Papua New Guinea to the north, the Solomon Islands, Vanuatu and New Caledonia to the north-east, and New Zealand to the south-east. The continent of Australia has been inhabited for over 40,000 years by Indigenous Australians. After sporadic visits by fishermen from the north, and by European explorers and merchants from the 17th century onwards, the eastern half of the continent was claimed by the British in 1770, and officially settled as the penal colony of New South Wales on 26 January 1788. As the population grew and new areas were explored, another five largely self-governing Crown Colonies were successively established over the course of the 19th century.  On 1 January 1901, the six colonies federated and the Commonwealth of Australia was formed. Since federation, Australia has maintained a stable liberal democratic political system and remains a Commonwealth Realm. The current population of around 20.4 million is concentrated mainly in the large coastal cities of Sydney, Melbourne, Brisbane, Perth and Adelaide."), makeString("Backgammon is a board game for two players. Each player has fifteen pieces (checkers or men) which move between twenty-four triangles (points) according to the roll of two dice. The objective of the game is to be first to bear off, that is, to move all fifteen checkers off the board. Backgammon is the oldest known recorded game. Traditionally, it was believed to have originated in ancient Egypt, Sumeria, or Mesopotamia in the Persian empire (present-day Iran, Iraq, and Syria). However, more recent conclusive evidence indicates that the game originated on the eastern borders of Iran, near Afghanistan. The Iranian chancellor and thinker of the Sassanid Empire Bozorgmehr is said to have created the ancient version of the game. In English, the word backgammon is believed to be derived from back plus the Middle English word gamen (game)."), makeString("Biology is the study, or science, of life. It is concerned with the characteristics and behaviors of organisms, how species and individuals come into existence, and the interactions they have with each other and with the environment. Biology encompasses a broad spectrum of academic fields that are often viewed as independent disciplines. Together, they study life over a wide range of scales."), makeString("Biology is the study, or science, of life. It is concerned with the characteristics and behaviors of organisms, how species and individuals come into existence, and the interactions they have with each other and with the environment. Biology encompasses a broad spectrum of academic fields that are often viewed as independent disciplines. Together, they study life over a wide range of scales. Life is studied at the atomic and molecular scale in molecular biology, biochemistry, and molecular genetics. At the level of the cell, it is studied in cell biology, and at multicellular scales, it is examined in physiology, anatomy, and histology. Developmental biology studies life at the level of the development or ontogeny of an individual organism. Moving up the scale towards more than one organism, genetics considers how heredity works between parent and offspring. Ethology considers group behavior of more than one individual. Population genetics looks at the level of an entire population, and systematics considers the multi-species scale of lineages. Interdependent populations and their habitats are examined in ecology and evolutionary biology. A speculative new field is astrobiology (or xenobiology) which examines the possibility of life beyond the Earth."), makeString("Chemistry is the science of matter that deals with the composition, structure, and properties of substances and with the transformations that they undergo. In the study of matter, chemistry also investigates its interactions with energy and itself (see physics, biology). Because of the diversity of matter, which is mostly in the form of atoms, chemists often study how atoms of different chemical elements interact to form molecules and how molecules interact with each other."), makeString("Chemistry  is the science of matter that deals with the composition, structure, and properties of substances and with the transformations that they undergo. In the study of matter, chemistry also investigates its interactions with energy and itself (see physics, biology). Because of the diversity of matter, which is mostly in the form of atoms, chemists often study how atoms of different chemical elements interact to form molecules and how molecules interact with each other.Chemistry is a large field encompassing many subdisciplines that often overlap with significant portions of other sciences. The fundamental component of chemistry is that it involves matter in some way (this explains its broad reach). It may involve the interaction of matter with non-material phenomenon, such as energy for example. More central to chemistry is the interaction of matter with matter such as in the classic chemical reaction where chemical bonds are broken and made, forming new molecules.  Matter, such as the chair you are sitting in or the air you breathe, is known today to consist of molecules. Each molecule consists of small bits of matter known as atoms that are connected together through chemical bonds. Each atom consists of smaller bits of matter known as subatomic particles. The structure of the world we commonly experience and the properties of the matter we commonly interact with are determined by the nature of this matter on the chemical level. Steel is hard because of how the atoms are bound together. Wood will burn because it can react with oxygen in a chemical reaction. Water is a liquid at room temperature because of how each molecule of water interacts with its neighbors. In fact, you are a thinking, sentient being because of an on-going series of chemical reactions and other chemical interactions. You can see this text because of how light interacts with molecules called proteins in the back of your eye."), makeString("Charles Robert Darwin (12 February 1809 - 19 April 1882) was a British naturalist who achieved lasting fame as originator of the theory of evolution through natural selection. He developed his interest in natural history while studying first medicine, then theology, at university. Darwin's five-year voyage on HMS Beagle brought him eminence as a geologist and fame as a popular author. His biological observations led him to study transmutation of species and develop his theory of natural selection in 1838. Fully aware of the likely reaction, he confided only in close friends and researched to meet anticipated objections, but in 1858 the information that Alfred Russel Wallace now had a similar theory forced early joint publication of Darwin's theory."), makeString("The Beatles were a British pop and rock group from Liverpool. They are widely regarded as the most important and successful musical group of all time, having achieved broad popular success, critical acclaim and cultural influence. The group shattered many sales records and charted more than 50 top 40 hit singles, including 20 #1's in the USA alone. Dubbed The Fab Four, the Beatles were John Lennon (1940 - 1980), Paul McCartney (born 1942), George Harrison (1943 - 2001), and Ringo Starr (born Richard Starkey in 1940). Lennon and McCartney were the principal songwriters, with Harrison making a significant contribution, particularly in the band's later years. George Martin produced most of the Beatles' recordings."), makeString("Thomas Jefferson (April 13 (April 2 O.S.), 1743 ? July 4, 1826) was the third (1801?1809) President of the United States, second (1797?1801) Vice President, first (1789?1795) United States Secretary of State, and an American statesman, ambassador to France, political philosopher, revolutionary, agriculturalist, horticulturist, land owner, architect, etymologist,archaeologist, slaveowner, author, inventor, lawyer and founder of the University of Virginia. He was also the founder and leader of the Democratic-Republican Party, and the first President from that party. The Jeffersonian Republicans, as they were often called, dominated American politics for over a quarter-century."), makeString("Titanic is a 1997 dramatic movie released by Paramount Pictures and 20th Century Fox. The bulk of the plot is set aboard the ill-fated RMS Titanic during her maiden voyage in 1912. The movie won 11 Academy Awards on March 23, 1998 including best picture of 1997. As of 2005, Titanic has the highest box office take in movie history. The 1997 film should not be confused with the Titanic movie made in 1953. Two Dvd Special Editions (2 discs and 4 discs), with deleted scenes and documentaries around the movie have been released on October 25th 2005.") });

    private static final SubLSymbol TOPIC_STRUCT_LEXICON_MEMOIZED = makeSymbol("TOPIC-STRUCT-LEXICON-MEMOIZED");



    private static final SubLSymbol SET_EQUALITY = makeSymbol("SET-EQUALITY");



    public static final SubLObject $$preferredNameString = constant_handles.reader_make_constant_shell(makeString("preferredNameString"));

    public static final SubLObject $$familyName = constant_handles.reader_make_constant_shell(makeString("familyName"));

    private static final SubLSymbol TOPIC_STRUCT_FOR_TEST_TEXT = makeSymbol("TOPIC-STRUCT-FOR-TEST-TEXT");

    public static final SubLObject $$TextTopicStructureFn = constant_handles.reader_make_constant_shell(makeString("TextTopicStructureFn"));

    public static final SubLSymbol $topic_struct_for_test_text_caching_state$ = makeSymbol("*TOPIC-STRUCT-FOR-TEST-TEXT-CACHING-STATE*");

    private static final SubLSymbol NON_EMPTY_LIST_P = makeSymbol("NON-EMPTY-LIST-P");

    static private final SubLString $str_alt290$_cyc_projects_reading_learning_oe = makeString("/cyc/projects/reading-learning/oe/text_paragraphs/");

    static private final SubLString $str_alt291$_cyc_projects_reading_learning_oe = makeString("/cyc/projects/reading-learning/oe/process_output_files/");

    static private final SubLString $str_alt292$___process_output_files_ = makeString("../process_output_files/");

    static private final SubLString $$$results = makeString("results");

    static private final SubLString $str_alt294$_A__3__0D_ = makeString("~A-~3,'0D/");

    static private final SubLList $list_alt295 = list(constant_handles.reader_make_constant_shell(makeString("QAClarifyingCollectionType")), constant_handles.reader_make_constant_shell(makeString("KEClarifyingCollectionType")), constant_handles.reader_make_constant_shell(makeString("ConventionalClassificationType")), constant_handles.reader_make_constant_shell(makeString("FacetInstanceCollection")), constant_handles.reader_make_constant_shell(makeString("Collection")), constant_handles.reader_make_constant_shell(makeString("CycVocabularyTopic")));

    static private final SubLString $str_alt296$_TOPIC_STRUCT_USE_ = makeString("*TOPIC-STRUCT-USE-");

    static private final SubLString $str_alt297$__ = makeString("?*");

    static private final SubLList $list_alt298 = list(ZERO_INTEGER, ONE_INTEGER, ONE_INTEGER, ONE_INTEGER);

    static private final SubLString $str_alt299$Testing_document_texts_in_ = makeString("Testing document texts in ");

    static private final SubLString $str_alt300$_ = makeString(".");

    static private final SubLString $str_alt301$_Output_files_will_be_placed_in_ = makeString(" Output files will be placed in ");

    static private final SubLString $str_alt302$_lisp = makeString(".lisp");

    static private final SubLString $str_alt303$_ = makeString("-");

    static private final SubLString $$$775 = makeString("775");

    static private final SubLString $str_alt305$Couldn_t_create_directory_in__S_s = makeString("Couldn't create directory in ~S seconds:~% ~S");

    static private final SubLString $str_alt306$topic_struct_cfasl = makeString("topic-struct.cfasl");

    static private final SubLString $str_alt307$cookie_jar_partial_cfasl = makeString("cookie-jar-partial.cfasl");

    static private final SubLString $str_alt308$Applying_all_strategies___ = makeString("Applying all strategies...");

    static private final SubLString $str_alt309$_________A__________S_of__S___ = makeString("~&----- ~A ------ (~S of ~S)~%");

    private static final SubLSymbol $SIBLING = makeKeyword("SIBLING");

    private static final SubLSymbol $ISA_COUNT = makeKeyword("ISA-COUNT");

    private static final SubLSymbol $GENL_COUNT = makeKeyword("GENL-COUNT");

    static private final SubLString $str_alt313$conceptuallyRelated__Increasing_c = makeString("conceptuallyRelated: Increasing cookies for ~S from ~,3F to ~,3F");



    static private final SubLString $str_alt315$Checking_compositional_contributi = makeString("Checking compositional contribution of ~S");

    static private final SubLString $str_alt316$compositional_contribution__Incre = makeString("compositional contribution: Increasing cookies for ~S from ~,3F to ~,3F");

    private static final SubLSymbol $COMPOSITIONAL_CONTRIBUTION = makeKeyword("COMPOSITIONAL-CONTRIBUTION");

    static private final SubLString $str_alt318$cookie_jar_cfasl = makeString("cookie-jar.cfasl");

    private static final SubLSymbol $MULTI_STRATEGY_BONUS = makeKeyword("MULTI-STRATEGY-BONUS");

    private static final SubLSymbol $SENTENTIAL_CONTRIBUTION = makeKeyword("SENTENTIAL-CONTRIBUTION");

    static private final SubLList $list_alt321 = list(makeKeyword("SIBLING"), list($BIND, makeSymbol("SIBLING-TYPE")));

    private static final SubLSymbol SIBLING_TYPE = makeSymbol("SIBLING-TYPE");

    static private final SubLString $str_alt323$Couldn_t_assign_a_cookie_score_fo = makeString("Couldn't assign a cookie score for ~S");

    static private final SubLList $list_alt324 = list(makeSymbol("STRATEGY"), makeSymbol("OLD-SCORE"), makeSymbol("DATA"));

    static private final SubLString $str_alt325$Duplicate_strategies_in_cookies_f = makeString("Duplicate strategies in cookies for ~S:~% ~S");

    private static final SubLSymbol TOPIC_STRUCT_COOKIE_P = makeSymbol("TOPIC-STRUCT-COOKIE-P");



    static private final SubLString $str_alt328$_A__3__0D = makeString("~A-~3,'0D");

    static private final SubLList $list_alt329 = list(cons(makeKeyword("PHRASE"), makeString("Phrase")), cons(makeKeyword("DENOT"), makeString("Concept")), cons(makeKeyword("SCORE"), makeString("Cookies")), cons(makeKeyword("WINNER?"), makeString("Winner")), cons(makeKeyword("CORRECT?"), makeString("Correct")), cons(makeKeyword("RANK-OF-CORRECT"), makeString("Rank")), cons(makeKeyword("PARSE-COUNT"), makeString("Size")), cons(makeKeyword("PROBLEMATIC?"), makeString("Problematic?")));

    static private final SubLList $list_alt330 = list(cons(makeKeyword("WINNER-CORRECT"), makeString("Winner - Correct")), cons(makeKeyword("WINNER-INCORRECT"), makeString("Winner - Incorrect")), cons(makeKeyword("WINNER-NO-CORRECT"), makeString("Winner - No Correct")), cons(makeKeyword("TIE-CORRECT"), makeString("Tie - Correct")), cons(makeKeyword("TIE-INCORRECT"), makeString("Tie - Incorrect")), cons(makeKeyword("TIE-NO-CORRECT"), makeString("Tie - No Correct")), cons(makeKeyword("NO-COOKIES-CORRECT"), makeString("No Cookies - Correct")), cons(makeKeyword("NO-COOKIES-NO-CORRECT"), makeString("No Cookies - No Correct")));

    private static final SubLSymbol TOPIC_STRUCT_OUTPUT_COLUMN_HEADERS = makeSymbol("TOPIC-STRUCT-OUTPUT-COLUMN-HEADERS");

    public static final SubLSymbol $topic_struct_output_column_headers_caching_state$ = makeSymbol("*TOPIC-STRUCT-OUTPUT-COLUMN-HEADERS-CACHING-STATE*");

    private static final SubLSymbol $WINNER_NO_CORRECT = makeKeyword("WINNER-NO-CORRECT");

    private static final SubLSymbol $WINNER_INCORRECT = makeKeyword("WINNER-INCORRECT");

    private static final SubLSymbol $WINNER_CORRECT = makeKeyword("WINNER-CORRECT");

    static private final SubLString $str_alt336$Result_of_random_pick_simulation_ = makeString("Result of random-pick simulation: ~%~S");

    private static final SubLSymbol $NO_COOKIES_CORRECT = makeKeyword("NO-COOKIES-CORRECT");

    private static final SubLSymbol $NO_COOKIES_NO_CORRECT = makeKeyword("NO-COOKIES-NO-CORRECT");

    private static final SubLSymbol $TIE_CORRECT = makeKeyword("TIE-CORRECT");

    private static final SubLSymbol $TIE_INCORRECT = makeKeyword("TIE-INCORRECT");

    private static final SubLSymbol $TIE_NO_CORRECT = makeKeyword("TIE-NO-CORRECT");

    static private final SubLString $str_alt342$___ = makeString(" ! ");

    static private final SubLList $list_alt343 = cons(makeUninternedSymbol("KEY"), makeSymbol("LABEL"));

    static private final SubLString $str_alt344$Logging_results_to__S = makeString("Logging results to ~S");



    static private final SubLString $str_alt346$Unable_to_open__S = makeString("Unable to open ~S");

    static private final SubLList $list_alt347 = cons(makeSymbol("POSITION"), makeSymbol("COOKIE-PACK"));

    static private final SubLString $str_alt348$_____________A______________ = makeString("~&--------- ~A -----------~%");

    static private final SubLList $list_alt349 = cons(makeSymbol("DENOT"), makeSymbol("COOKIES"));

    static private final SubLString $str_alt350$___S____3F__ = makeString("~&~S: ~,3F~%");

    static private final SubLString $str_alt351$_A_A_A_A__3F = makeString("~A~A~A~A~,3F");

    static private final SubLString $str_alt352$_A_A = makeString("~A~A");

    static private final SubLString $$$Winner = makeString("Winner");

    static private final SubLString $$$Correct = makeString("Correct");

    static private final SubLString $str_alt355$____S__ = makeString("~& ~S~%");

    static private final SubLSymbol $sym356$COOKIE_SCORE__ = makeSymbol("COOKIE-SCORE->");

    static private final SubLList $list_alt357 = cons(makeSymbol("RESULT-TYPE"), makeUninternedSymbol("VALUE"));

    static private final SubLSymbol $sym358$TOPIC_STRUCT_POSITION__ = makeSymbol("TOPIC-STRUCT-POSITION-<");

    static private final SubLString $str_alt359$__Of__S_ambiguous_positions___S_c = makeString("~&Of ~S ambiguous positions, ~S clear winners and ~S partials.~%");



    static private final SubLString $str_alt361$Scores_changed_for__S = makeString("Scores changed for ~S");

    static private final SubLString $str_alt362$__Sentence_results_____S = makeString("~&Sentence results:~% ~S");

    static private final SubLString $str_alt363$___S_____S__ = makeString("~&~S -> ~S~%");

    static private final SubLString $str_alt364$_________________________________ = makeString("~&-------------------------------~%");







    static private final SubLList $list_alt368 = list(ONE_INTEGER, makeDouble(0.2), MINUS_ONE_INTEGER);



    public static final SubLObject $$isa = constant_handles.reader_make_constant_shell(makeString("isa"));

    static private final SubLList $list_alt371 = list(constant_handles.reader_make_constant_shell(makeString("Thing")));

    static private final SubLSymbol $sym372$NAT_SMART_TERM__ = makeSymbol("NAT-SMART-TERM-=");

    static private final SubLList $list_alt373 = list(makeSymbol("GOOD-COOKIES"), makeSymbol("MAYBE-COOKIES"), makeSymbol("BAD-COOKIES"));

    public static final SubLFloat $float$0_1 = makeDouble(0.1);

    private static final SubLSymbol ROUND_PARAM_VALUE = makeSymbol("ROUND-PARAM-VALUE");

    public static final SubLSymbol $round_param_value_caching_state$ = makeSymbol("*ROUND-PARAM-VALUE-CACHING-STATE*");

    static private final SubLString $str_alt377$Recording__S_right_guesses___S___ = makeString("Recording ~S right guesses: ~S~% Got it right? ~S");

    static private final SubLString $str_alt378$Problem_with_position__S = makeString("Problem with position ~S");

    static private final SubLString $str_alt379$Recall_number__S_vs__precision_nu = makeString("Recall number ~S vs. precision number ~S");

    static private final SubLString $str_alt380$_S___A__Rescoring_caused_us_to_pr = makeString("~S~%~A: Rescoring caused us to prefer:~% ~S over ~S");

    private static final SubLSymbol COOKIE_STRATEGY = makeSymbol("COOKIE-STRATEGY");

    static private final SubLString $str_alt382$_S_score_for__S_declined_from___3 = makeString("~S score for ~S declined from ~,3F to ~,3F");

    static private final SubLList $list_alt383 = list(makeKeyword("OR"), makeKeyword("ISA-COUNT"), makeKeyword("GENL-COUNT"), makeKeyword("CONCEPTUALLY-RELATED"), list(makeKeyword("SIBLING"), makeKeyword("ANYTHING")));

    static private final SubLString $str_alt384$Couldn_t_find_supporter_data_in__ = makeString("Couldn't find supporter data in ~S");

    static private final SubLString $str_alt385$The_following_supporters__weighte = makeString("The following supporters' weighted ambiguity factor is greater than their unweighted factor:");

    static private final SubLString $str_alt386$__Pass__S__recall_improved_from__ = makeString("~&Pass ~S: recall improved from ~,3F% to ~,3F%~%");

    static private final SubLString $str_alt387$__Pass__S__recall_declined_from__ = makeString("~&Pass ~S: recall declined from ~,3F% to ~,3F%~%");

    static private final SubLString $str_alt388$__Pass__S__recall_stayed_at___3F_ = makeString("~&Pass ~S: recall stayed at ~,3F%~%");

    public static final SubLSymbol $cookie_score_tolerance$ = makeSymbol("*COOKIE-SCORE-TOLERANCE*");

    public static final SubLSymbol $minimum_correct_cookie_score$ = makeSymbol("*MINIMUM-CORRECT-COOKIE-SCORE*");

    // // Initializers
    @Override
    public void declareFunctions() {
        declare_learning_reader_disambiguation_file();
    }

    @Override
    public void initializeVariables() {
        init_learning_reader_disambiguation_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_learning_reader_disambiguation_file();
    }
}

