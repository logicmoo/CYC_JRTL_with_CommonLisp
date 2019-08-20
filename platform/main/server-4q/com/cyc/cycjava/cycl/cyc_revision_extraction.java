/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 */
package com.cyc.cycjava.cycl;


import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_period;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_space;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.cons;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.bind;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.currentBinding;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.rebind;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.add;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.length;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.nreverse;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.position;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.subseq;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.symbol_function;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.$is_thread_performing_cleanupP$;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.getValuesAsVector;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.restoreValuesFromVector;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high.princ;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader.read_from_string_ignoring_errors;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.close;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.get_output_stream_string;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.make_private_string_output_stream;
import static com.cyc.tool.subl.util.SubLFiles.declareFunction;

import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 * module:      CYC-REVISION-EXTRACTION
 * source file: /cyc/top/cycl/cyc-revision-extraction.lisp
 * created:     2019/07/03 17:37:05
 */
public final class cyc_revision_extraction extends SubLTranslatedFile implements V12 {
    public static final SubLFile me = new cyc_revision_extraction();



    // Definitions
    public static final SubLObject extract_cyc_revision_string_alt(SubLObject raw_revision_string) {
        {
            SubLObject first_space = position(CHAR_space, raw_revision_string, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            if (NIL != first_space) {
                {
                    SubLObject second_space = position(CHAR_space, raw_revision_string, symbol_function(EQL), symbol_function(IDENTITY), add(first_space, ONE_INTEGER), UNPROVIDED);
                    if (NIL != second_space) {
                        return subseq(raw_revision_string, add(first_space, ONE_INTEGER), second_space);
                    }
                }
            }
        }
        return NIL;
    }

    // Definitions
    public static SubLObject extract_cyc_revision_string(final SubLObject raw_revision_string) {
        final SubLObject first_space = position(CHAR_space, raw_revision_string, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        if (NIL != first_space) {
            final SubLObject second_space = position(CHAR_space, raw_revision_string, symbol_function(EQL), symbol_function(IDENTITY), add(first_space, ONE_INTEGER), UNPROVIDED);
            if (NIL != second_space) {
                return subseq(raw_revision_string, add(first_space, ONE_INTEGER), second_space);
            }
        }
        return NIL;
    }

    public static final SubLObject extract_cyc_revision_numbers_alt(SubLObject revision_string, SubLObject system_vesion) {
        if (system_vesion == UNPROVIDED) {
            system_vesion = TEN_INTEGER;
        }
        if (revision_string.isString()) {
            {
                SubLObject start = ZERO_INTEGER;
                SubLObject period = position(CHAR_period, revision_string, symbol_function(EQL), symbol_function(IDENTITY), start, UNPROVIDED);
                SubLObject numbers = NIL;
                for (; start.isInteger();) {
                    {
                        SubLObject integer = read_from_string_ignoring_errors(revision_string, NIL, NIL, start, period);
                        if (NIL != integer) {
                            numbers = cons(integer, numbers);
                        }
                    }
                    if (period.isInteger()) {
                        start = add(period, ONE_INTEGER);
                        period = position(CHAR_period, revision_string, symbol_function(EQL), symbol_function(IDENTITY), start, UNPROVIDED);
                    } else {
                        start = NIL;
                    }
                }
                numbers = nreverse(numbers);
                if (ONE_INTEGER.numE(length(numbers))) {
                    numbers = cons(system_vesion, numbers);
                }
                return numbers;
            }
        }
        return NIL;
    }

    public static SubLObject extract_cyc_revision_numbers(final SubLObject revision_string, SubLObject system_vesion) {
        if (system_vesion == UNPROVIDED) {
            system_vesion = TEN_INTEGER;
        }
        if (revision_string.isString()) {
            SubLObject start = ZERO_INTEGER;
            SubLObject period = position(CHAR_period, revision_string, symbol_function(EQL), symbol_function(IDENTITY), start, UNPROVIDED);
            SubLObject numbers = NIL;
            while (start.isInteger()) {
                final SubLObject integer = read_from_string_ignoring_errors(revision_string, NIL, NIL, start, period);
                if (NIL != integer) {
                    numbers = cons(integer, numbers);
                }
                if (period.isInteger()) {
                    start = add(period, ONE_INTEGER);
                    period = position(CHAR_period, revision_string, symbol_function(EQL), symbol_function(IDENTITY), start, UNPROVIDED);
                } else {
                    start = NIL;
                }
            } 
            numbers = nreverse(numbers);
            if (ONE_INTEGER.numE(length(numbers))) {
                numbers = cons(system_vesion, numbers);
            }
            return numbers;
        }
        return NIL;
    }

    public static final SubLObject construct_cyc_revision_string_from_numbers_alt(SubLObject revision_numbers) {
        {
            SubLObject string = NIL;
            SubLObject s = NIL;
            try {
                s = make_private_string_output_stream();
                {
                    SubLObject first_p = T;
                    SubLObject cdolist_list_var = revision_numbers;
                    SubLObject number = NIL;
                    for (number = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , number = cdolist_list_var.first()) {
                        if (NIL == first_p) {
                            princ(CHAR_period, s);
                        }
                        princ(number, s);
                        first_p = NIL;
                    }
                }
                string = get_output_stream_string(s);
            } finally {
                {
                    SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                    try {
                        bind($is_thread_performing_cleanupP$, T);
                        close(s, UNPROVIDED);
                    } finally {
                        rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                    }
                }
            }
            return string;
        }
    }

    public static SubLObject construct_cyc_revision_string_from_numbers(final SubLObject revision_numbers) {
        SubLObject string = NIL;
        SubLObject s = NIL;
        try {
            s = make_private_string_output_stream();
            SubLObject first_p = T;
            SubLObject cdolist_list_var = revision_numbers;
            SubLObject number = NIL;
            number = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                if (NIL == first_p) {
                    princ(CHAR_period, s);
                }
                princ(number, s);
                first_p = NIL;
                cdolist_list_var = cdolist_list_var.rest();
                number = cdolist_list_var.first();
            } 
            string = get_output_stream_string(s);
        } finally {
            final SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
            try {
                bind($is_thread_performing_cleanupP$, T);
                final SubLObject _values = getValuesAsVector();
                close(s, UNPROVIDED);
                restoreValuesFromVector(_values);
            } finally {
                rebind($is_thread_performing_cleanupP$, _prev_bind_0);
            }
        }
        return string;
    }

    public static SubLObject declare_cyc_revision_extraction_file() {
        declareFunction("extract_cyc_revision_string", "EXTRACT-CYC-REVISION-STRING", 1, 0, false);
        declareFunction("extract_cyc_revision_numbers", "EXTRACT-CYC-REVISION-NUMBERS", 1, 1, false);
        declareFunction("construct_cyc_revision_string_from_numbers", "CONSTRUCT-CYC-REVISION-STRING-FROM-NUMBERS", 1, 0, false);
        return NIL;
    }

    public static SubLObject init_cyc_revision_extraction_file() {
        return NIL;
    }

    public static SubLObject setup_cyc_revision_extraction_file() {
        return NIL;
    }

    @Override
    public void declareFunctions() {
        declare_cyc_revision_extraction_file();
    }

    @Override
    public void initializeVariables() {
        init_cyc_revision_extraction_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_cyc_revision_extraction_file();
    }

    static {
    }
}

/**
 * Total time: 25 ms
 */
