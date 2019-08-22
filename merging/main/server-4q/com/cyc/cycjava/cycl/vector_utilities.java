/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 */
package com.cyc.cycjava.cycl;


import static com.cyc.cycjava.cycl.access_macros.define_obsolete_register;
import static com.cyc.cycjava.cycl.cyc_testing.generic_testing.define_test_case_table_int;
import static com.cyc.cycjava.cycl.list_utilities.lengthE;
import static com.cyc.cycjava.cycl.string_utilities.f_64_bit_char;
import static com.cyc.cycjava.cycl.string_utilities.f_64_bit_char_value;
import static com.cyc.cycjava.cycl.string_utilities.hex_char;
import static com.cyc.cycjava.cycl.string_utilities.hex_char_value;
import static com.cyc.cycjava.cycl.utilities_macros.$last_percent_progress_index$;
import static com.cyc.cycjava.cycl.utilities_macros.$last_percent_progress_prediction$;
import static com.cyc.cycjava.cycl.utilities_macros.$percent_progress_start_time$;
import static com.cyc.cycjava.cycl.utilities_macros.$progress_note$;
import static com.cyc.cycjava.cycl.utilities_macros.$progress_sofar$;
import static com.cyc.cycjava.cycl.utilities_macros.$progress_start_time$;
import static com.cyc.cycjava.cycl.utilities_macros.$progress_total$;
import static com.cyc.cycjava.cycl.utilities_macros.$within_noting_percent_progress$;
import static com.cyc.cycjava.cycl.utilities_macros.note_percent_progress;
import static com.cyc.cycjava.cycl.utilities_macros.noting_percent_progress_postamble;
import static com.cyc.cycjava.cycl.utilities_macros.noting_percent_progress_preamble;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_A;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_comma;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_equal;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_newline;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_space;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.charE;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.code_char;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.cons;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.make_list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.rplaca;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.bind;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.currentBinding;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.rebind;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions.apply;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions.funcall;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.add;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.ash;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.ceiling;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.evenp;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.floor;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.integerDivide;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.mod;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.multiply;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.subtract;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.copy_seq;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.elt;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.fill;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.length;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.replace;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.search;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.symbol_function;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.$is_thread_performing_cleanupP$;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time.get_universal_time;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.integerp;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.sequencep;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.stringp;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.vectorp;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.arg2;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.getValuesAsVector;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.multiple_value_list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.resetMultipleValues;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.restoreValuesFromVector;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.values;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors.aref;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors.make_vector;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors.set_aref;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors.vector;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeBoolean;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeDouble;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeInteger;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeString;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeSymbol;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high.$print_readably$;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high.prin1;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high.princ;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.close;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.file_length;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.get_output_stream_string;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.make_private_string_output_stream;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.read_byte;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.write_char;
import static com.cyc.tool.subl.util.SubLFiles.declareFunction;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Strings;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.bytes;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.compatibility;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.random;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.stream_macros;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.util.SubLFiles.LispMethod;
import com.cyc.tool.subl.util.SubLTrampolineFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 * module:      VECTOR-UTILITIES
 * source file: /cyc/top/cycl/vector-utilities.lisp
 * created:     2019/07/03 17:37:11
 */
public final class vector_utilities extends SubLTranslatedFile implements V12 {
    public static final SubLFile me = new vector_utilities();

 public static final String myName = "com.cyc.cycjava.cycl.vector_utilities";


    private static final SubLSymbol CLEAR_VECTOR = makeSymbol("CLEAR-VECTOR");

    private static final SubLList $list5 = list(makeSymbol("RESET-VECTOR"));

    private static final SubLInteger $int$500 = makeInteger(500);

    private static final SubLInteger $int$100000 = makeInteger(100000);

    private static final SubLString $str14$Unable_to_open__S = makeString("Unable to open ~S");

    private static final SubLSymbol BYTE_VECTOR_P = makeSymbol("BYTE-VECTOR-P");

    private static final SubLString $str17$Did_not_fill_up_all_the_expected_ = makeString("Did not fill up all the expected characters of the hex string: ~s != ~s~%");

    private static final SubLSymbol HEX_CHAR_STRING_P = makeSymbol("HEX-CHAR-STRING-P");

    private static final SubLSymbol EVENP = makeSymbol("EVENP");

    private static final SubLSymbol $sym20$64_BIT_STRING_P = makeSymbol("64-BIT-STRING-P");

    private static final SubLSymbol $sym21$64_BIT_STRING_TUPLES_LENGTH = makeSymbol("64-BIT-STRING-TUPLES-LENGTH");

    private static final SubLList $list28 = list(list(list(makeString("")), ZERO_INTEGER), list(list(makeString("AA")), ONE_INTEGER), list(list(makeString("AAA")), ONE_INTEGER), list(list(makeString("AA==")), ONE_INTEGER), list(list(makeString("AAA=")), ONE_INTEGER), list(list(makeString("AAAA")), ONE_INTEGER), list(list(makeString("AAAAAA")), TWO_INTEGER), list(list(makeString("AAAAAA==")), TWO_INTEGER));

    private static final SubLSymbol $sym29$64_BIT_STRING_BYTE_VECTOR_LENGTH = makeSymbol("64-BIT-STRING-BYTE-VECTOR-LENGTH");

    private static final SubLList $list30 = list(list(list(makeString("")), ZERO_INTEGER), list(list(makeString("AA")), ONE_INTEGER), list(list(makeString("AA==")), ONE_INTEGER), list(list(makeString("AAA")), TWO_INTEGER), list(list(makeString("AAA=")), TWO_INTEGER), list(list(makeString("AAAA")), THREE_INTEGER), list(list(makeString("AAAAAA")), FOUR_INTEGER), list(list(makeString("AAAAAA==")), FOUR_INTEGER));

    private static final SubLSymbol $sym31$TEST_BINARY_SEARCH_VECTOR_SUBRANGE_W_DUPLICATES = makeSymbol("TEST-BINARY-SEARCH-VECTOR-SUBRANGE-W/DUPLICATES");

    private static final SubLList $list32 = list(list(list(ZERO_INTEGER, vector(new SubLObject[]{ ONE_INTEGER, TWO_INTEGER, THREE_INTEGER, THREE_INTEGER, THREE_INTEGER, FOUR_INTEGER }), ZERO_INTEGER, SIX_INTEGER, makeSymbol("<")), list(MINUS_ONE_INTEGER, ZERO_INTEGER, NIL)), list(list(ONE_INTEGER, vector(new SubLObject[]{ ONE_INTEGER, TWO_INTEGER, THREE_INTEGER, THREE_INTEGER, THREE_INTEGER, FOUR_INTEGER }), ZERO_INTEGER, SIX_INTEGER, makeSymbol("<")), list(ZERO_INTEGER, ZERO_INTEGER, T)), list(list(makeDouble(1.2), vector(new SubLObject[]{ ONE_INTEGER, TWO_INTEGER, THREE_INTEGER, THREE_INTEGER, THREE_INTEGER, FOUR_INTEGER }), ZERO_INTEGER, SIX_INTEGER, makeSymbol("<")), list(ZERO_INTEGER, ONE_INTEGER, NIL)), list(list(TWO_INTEGER, vector(new SubLObject[]{ ONE_INTEGER, TWO_INTEGER, THREE_INTEGER, THREE_INTEGER, THREE_INTEGER, FOUR_INTEGER }), ZERO_INTEGER, SIX_INTEGER, makeSymbol("<")), list(ONE_INTEGER, ONE_INTEGER, T)), list(list(THREE_INTEGER, vector(new SubLObject[]{ ONE_INTEGER, TWO_INTEGER, THREE_INTEGER, THREE_INTEGER, THREE_INTEGER, FOUR_INTEGER }), ZERO_INTEGER, SIX_INTEGER, makeSymbol("<")), list(TWO_INTEGER, FOUR_INTEGER, T)), list(list(FOUR_INTEGER, vector(new SubLObject[]{ ONE_INTEGER, TWO_INTEGER, THREE_INTEGER, THREE_INTEGER, THREE_INTEGER, FOUR_INTEGER }), ZERO_INTEGER, SIX_INTEGER, makeSymbol("<")), list(FIVE_INTEGER, FIVE_INTEGER, T)), list(list(FIVE_INTEGER, vector(new SubLObject[]{ ONE_INTEGER, TWO_INTEGER, THREE_INTEGER, THREE_INTEGER, THREE_INTEGER, FOUR_INTEGER }), ZERO_INTEGER, SIX_INTEGER, makeSymbol("<")), list(SIX_INTEGER, SEVEN_INTEGER, NIL)));

    private static final SubLSymbol $sym33$TEST_BINARY_SEARCH_VECTOR_SUBRANGE_W_DUPLICATE_STRUCTURES = makeSymbol("TEST-BINARY-SEARCH-VECTOR-SUBRANGE-W/DUPLICATE-STRUCTURES");

    private static final SubLList $list34 = list(list(list(ZERO_INTEGER, vector(new SubLObject[]{ list(ONE_INTEGER), list(TWO_INTEGER), list(THREE_INTEGER), list(THREE_INTEGER), list(THREE_INTEGER), list(FOUR_INTEGER) }), ZERO_INTEGER, SIX_INTEGER, makeSymbol("<"), makeSymbol("FIRST")), list(MINUS_ONE_INTEGER, ZERO_INTEGER, NIL)), list(list(ONE_INTEGER, vector(new SubLObject[]{ list(ONE_INTEGER), list(TWO_INTEGER), list(THREE_INTEGER), list(THREE_INTEGER), list(THREE_INTEGER), list(FOUR_INTEGER) }), ZERO_INTEGER, SIX_INTEGER, makeSymbol("<"), makeSymbol("FIRST")), list(ZERO_INTEGER, ZERO_INTEGER, T)), list(list(TWO_INTEGER, vector(new SubLObject[]{ list(ONE_INTEGER), list(TWO_INTEGER), list(THREE_INTEGER), list(THREE_INTEGER), list(THREE_INTEGER), list(FOUR_INTEGER) }), ZERO_INTEGER, SIX_INTEGER, makeSymbol("<"), makeSymbol("FIRST")), list(ONE_INTEGER, ONE_INTEGER, T)), list(list(makeDouble(2.6), vector(new SubLObject[]{ list(ONE_INTEGER), list(TWO_INTEGER), list(THREE_INTEGER), list(THREE_INTEGER), list(THREE_INTEGER), list(FOUR_INTEGER) }), ZERO_INTEGER, SIX_INTEGER, makeSymbol("<"), makeSymbol("FIRST")), list(ONE_INTEGER, TWO_INTEGER, NIL)), list(list(THREE_INTEGER, vector(new SubLObject[]{ list(ONE_INTEGER), list(TWO_INTEGER), list(THREE_INTEGER), list(THREE_INTEGER), list(THREE_INTEGER), list(FOUR_INTEGER) }), ZERO_INTEGER, SIX_INTEGER, makeSymbol("<"), makeSymbol("FIRST")), list(TWO_INTEGER, FOUR_INTEGER, T)));

    private static final SubLString $str35$Failure_on__S__S__S = makeString("Failure on ~S ~S ~S");

    private static final SubLString $str36$Failure_on__S__S__S__S = makeString("Failure on ~S ~S ~S ~S");

    private static final SubLString $$$cdotimes = makeString("cdotimes");

    // Definitions
    /**
     * Convert VECTOR to a list of its elements.
     */
    @LispMethod(comment = "Convert VECTOR to a list of its elements.")
    public static final SubLObject vector_elements_alt(SubLObject vector, SubLObject start_index) {
        if (start_index == UNPROVIDED) {
            start_index = ZERO_INTEGER;
        }
        SubLTrampolineFile.checkType(vector, VECTORP);
        SubLTrampolineFile.checkType(start_index, INTEGERP);
        {
            SubLObject length = subtract(length(vector), start_index);
            SubLObject list = make_list(length, UNPROVIDED);
            SubLObject index = start_index;
            SubLObject rest = NIL;
            for (rest = list; NIL != rest; rest = rest.rest()) {
                rplaca(rest, aref(vector, index));
                index = add(index, ONE_INTEGER);
            }
            return list;
        }
    }

    // Definitions
    /**
     * Convert VECTOR to a list of its elements.
     */
    @LispMethod(comment = "Convert VECTOR to a list of its elements.")
    public static SubLObject vector_elements(final SubLObject vector, SubLObject start_index) {
        if (start_index == UNPROVIDED) {
            start_index = ZERO_INTEGER;
        }
        assert NIL != vectorp(vector) : "! vectorp(vector) " + ("Types.vectorp(vector) " + "CommonSymbols.NIL != Types.vectorp(vector) ") + vector;
        assert NIL != integerp(start_index) : "! integerp(start_index) " + ("Types.integerp(start_index) " + "CommonSymbols.NIL != Types.integerp(start_index) ") + start_index;
        final SubLObject length = subtract(length(vector), start_index);
        final SubLObject list = make_list(length, UNPROVIDED);
        SubLObject index = start_index;
        SubLObject rest;
        for (rest = NIL, rest = list; NIL != rest; rest = rest.rest()) {
            rplaca(rest, aref(vector, index));
            index = add(index, ONE_INTEGER);
        }
        return list;
    }

    public static SubLObject list_to_vector(final SubLObject proper_list) {
        assert NIL != list_utilities.proper_list_p(proper_list) : "! list_utilities.proper_list_p(proper_list) " + ("list_utilities.proper_list_p(proper_list) " + "CommonSymbols.NIL != list_utilities.proper_list_p(proper_list) ") + proper_list;
        return apply(symbol_function(VECTOR), proper_list);
    }

    public static final SubLObject copy_vector_alt(SubLObject vector) {
        SubLTrampolineFile.checkType(vector, VECTORP);
        return copy_seq(vector);
    }

    public static SubLObject copy_vector(final SubLObject vector) {
        assert NIL != vectorp(vector) : "! vectorp(vector) " + ("Types.vectorp(vector) " + "CommonSymbols.NIL != Types.vectorp(vector) ") + vector;
        return copy_seq(vector);
    }

    public static final SubLObject first_aref_alt(SubLObject vector) {
        return aref(vector, ZERO_INTEGER);
    }

    public static SubLObject first_aref(final SubLObject vector) {
        return aref(vector, ZERO_INTEGER);
    }

    public static final SubLObject last_aref_alt(SubLObject vector) {
        return aref(vector, subtract(length(vector), ONE_INTEGER));
    }

    public static SubLObject last_aref(final SubLObject vector) {
        return aref(vector, subtract(length(vector), ONE_INTEGER));
    }

    /**
     *
     *
     * @return vector; a vector of length LENGTH containing the numbers 0 to LENGTH-1.
     */
    @LispMethod(comment = "@return vector; a vector of length LENGTH containing the numbers 0 to LENGTH-1.")
    public static final SubLObject num_vector_alt(SubLObject length) {
        {
            SubLObject vec = make_vector(length, UNPROVIDED);
            SubLObject i = NIL;
            for (i = ZERO_INTEGER; i.numL(length); i = add(i, ONE_INTEGER)) {
                set_aref(vec, i, i);
            }
            return vec;
        }
    }

    /**
     *
     *
     * @return vector; a vector of length LENGTH containing the numbers 0 to LENGTH-1.
     */
    @LispMethod(comment = "@return vector; a vector of length LENGTH containing the numbers 0 to LENGTH-1.")
    public static SubLObject num_vector(final SubLObject length) {
        final SubLObject vec = make_vector(length, UNPROVIDED);
        SubLObject i;
        for (i = NIL, i = ZERO_INTEGER; i.numL(length); i = add(i, ONE_INTEGER)) {
            set_aref(vec, i, i);
        }
        return vec;
    }

    /**
     * Extend VECTOR by DELTA, filling the new entries at the end with INITIAL-VALUE
     */
    @LispMethod(comment = "Extend VECTOR by DELTA, filling the new entries at the end with INITIAL-VALUE")
    public static final SubLObject extend_vector_alt(SubLObject vector, SubLObject delta, SubLObject initial_value) {
        if (initial_value == UNPROVIDED) {
            initial_value = NIL;
        }
        {
            SubLObject old_length = length(vector);
            SubLObject new_vector = make_vector(add(old_length, delta), initial_value);
            replace(new_vector, vector, ZERO_INTEGER, old_length, ZERO_INTEGER, old_length);
            return new_vector;
        }
    }

    /**
     * Extend VECTOR by DELTA, filling the new entries at the end with INITIAL-VALUE
     */
    @LispMethod(comment = "Extend VECTOR by DELTA, filling the new entries at the end with INITIAL-VALUE")
    public static SubLObject extend_vector(final SubLObject vector, final SubLObject delta, SubLObject initial_value) {
        if (initial_value == UNPROVIDED) {
            initial_value = NIL;
        }
        final SubLObject old_length = length(vector);
        final SubLObject new_vector = make_vector(add(old_length, delta), initial_value);
        replace(new_vector, vector, ZERO_INTEGER, old_length, ZERO_INTEGER, old_length);
        return new_vector;
    }

    /**
     * Extend VECTOR to be NEW-LENGTH elements long, filling the new entries at the end with INITIAL-VALUE
     */
    @LispMethod(comment = "Extend VECTOR to be NEW-LENGTH elements long, filling the new entries at the end with INITIAL-VALUE")
    public static final SubLObject extend_vector_to_alt(SubLObject vector, SubLObject new_length, SubLObject initial_value) {
        if (initial_value == UNPROVIDED) {
            initial_value = NIL;
        }
        {
            SubLObject old_length = length(vector);
            SubLObject new_vector = make_vector(new_length, initial_value);
            replace(new_vector, vector, ZERO_INTEGER, old_length, ZERO_INTEGER, old_length);
            return new_vector;
        }
    }

    /**
     * Extend VECTOR to be NEW-LENGTH elements long, filling the new entries at the end with INITIAL-VALUE
     */
    @LispMethod(comment = "Extend VECTOR to be NEW-LENGTH elements long, filling the new entries at the end with INITIAL-VALUE")
    public static SubLObject extend_vector_to(final SubLObject vector, final SubLObject new_length, SubLObject initial_value) {
        if (initial_value == UNPROVIDED) {
            initial_value = NIL;
        }
        final SubLObject old_length = length(vector);
        final SubLObject new_vector = make_vector(new_length, initial_value);
        replace(new_vector, vector, ZERO_INTEGER, old_length, ZERO_INTEGER, old_length);
        return new_vector;
    }

    /**
     * Grow VECTOR by MULTIPLE, filling the new entries at the end with INITIAL-VALUE
     */
    @LispMethod(comment = "Grow VECTOR by MULTIPLE, filling the new entries at the end with INITIAL-VALUE")
    public static final SubLObject grow_vector_alt(SubLObject vector, SubLObject initial_value, SubLObject multiple) {
        if (initial_value == UNPROVIDED) {
            initial_value = NIL;
        }
        if (multiple == UNPROVIDED) {
            multiple = TWO_INTEGER;
        }
        SubLTrampolineFile.checkType(vector, VECTORP);
        {
            SubLObject old_length = length(vector);
            SubLObject new_vector = make_vector(multiply(old_length, multiple), initial_value);
            replace(new_vector, vector, ZERO_INTEGER, old_length, ZERO_INTEGER, old_length);
            return new_vector;
        }
    }

    /**
     * Grow VECTOR by MULTIPLE, filling the new entries at the end with INITIAL-VALUE
     */
    @LispMethod(comment = "Grow VECTOR by MULTIPLE, filling the new entries at the end with INITIAL-VALUE")
    public static SubLObject grow_vector(final SubLObject vector, SubLObject initial_value, SubLObject multiple) {
        if (initial_value == UNPROVIDED) {
            initial_value = NIL;
        }
        if (multiple == UNPROVIDED) {
            multiple = TWO_INTEGER;
        }
        assert NIL != vectorp(vector) : "! vectorp(vector) " + ("Types.vectorp(vector) " + "CommonSymbols.NIL != Types.vectorp(vector) ") + vector;
        final SubLObject old_length = length(vector);
        final SubLObject new_vector = make_vector(multiply(old_length, multiple), initial_value);
        replace(new_vector, vector, ZERO_INTEGER, old_length, ZERO_INTEGER, old_length);
        return new_vector;
    }

    /**
     * Set every item in VECTOR to ELEMENT
     */
    @LispMethod(comment = "Set every item in VECTOR to ELEMENT")
    public static final SubLObject reset_vector_alt(SubLObject vector, SubLObject element) {
        if (element == UNPROVIDED) {
            element = NIL;
        }
        return fill(vector, element, UNPROVIDED, UNPROVIDED);
    }

    /**
     * Set every item in VECTOR to ELEMENT
     */
    @LispMethod(comment = "Set every item in VECTOR to ELEMENT")
    public static SubLObject reset_vector(final SubLObject vector, SubLObject element) {
        if (element == UNPROVIDED) {
            element = NIL;
        }
        return fill(vector, element, UNPROVIDED, UNPROVIDED);
    }

    public static final SubLObject clear_vector_alt(SubLObject vector, SubLObject fill_obj) {
        if (fill_obj == UNPROVIDED) {
            fill_obj = NIL;
        }
        {
            SubLObject len = length(vector);
            SubLObject i = NIL;
            for (i = ZERO_INTEGER; i.numL(len); i = add(i, ONE_INTEGER)) {
                set_aref(vector, i, fill_obj);
            }
        }
        return vector;
    }

    public static SubLObject clear_vector(final SubLObject vector, SubLObject fill_obj) {
        if (fill_obj == UNPROVIDED) {
            fill_obj = NIL;
        }
        SubLObject len;
        SubLObject i;
        for (len = length(vector), i = NIL, i = ZERO_INTEGER; i.numL(len); i = add(i, ONE_INTEGER)) {
            set_aref(vector, i, fill_obj);
        }
        return vector;
    }

    /**
     * Bump every item in VECTOR up one position.
     * Insert ITEM in position 0.
     * Drop the last item into the ether.
     */
    @LispMethod(comment = "Bump every item in VECTOR up one position.\r\nInsert ITEM in position 0.\r\nDrop the last item into the ether.\nBump every item in VECTOR up one position.\nInsert ITEM in position 0.\nDrop the last item into the ether.")
    public static final SubLObject percolate_vector_alt(SubLObject vector, SubLObject item) {
        {
            SubLObject back = item;
            SubLObject temp = NIL;
            SubLObject cdotimes_end_var = length(vector);
            SubLObject i = NIL;
            for (i = ZERO_INTEGER; i.numL(cdotimes_end_var); i = add(i, ONE_INTEGER)) {
                temp = aref(vector, i);
                set_aref(vector, i, back);
                back = temp;
            }
            return vector;
        }
    }

    /**
     * Bump every item in VECTOR up one position.
     * Insert ITEM in position 0.
     * Drop the last item into the ether.
     */
    @LispMethod(comment = "Bump every item in VECTOR up one position.\r\nInsert ITEM in position 0.\r\nDrop the last item into the ether.\nBump every item in VECTOR up one position.\nInsert ITEM in position 0.\nDrop the last item into the ether.")
    public static SubLObject percolate_vector(final SubLObject vector, final SubLObject item) {
        SubLObject back = item;
        SubLObject temp = NIL;
        SubLObject cdotimes_end_var;
        SubLObject i;
        for (cdotimes_end_var = length(vector), i = NIL, i = ZERO_INTEGER; i.numL(cdotimes_end_var); i = add(i, ONE_INTEGER)) {
            temp = aref(vector, i);
            set_aref(vector, i, back);
            back = temp;
        }
        return vector;
    }

    /**
     * Replace all occurrences of OLD with NEW in VECTOR.
     *
     * @unknown -- Destructively modifies VECTOR iff it contains OLD.
     */
    @LispMethod(comment = "Replace all occurrences of OLD with NEW in VECTOR.\r\n\r\n@unknown -- Destructively modifies VECTOR iff it contains OLD.")
    public static final SubLObject vector_nreplace_subsequence_alt(SubLObject v_new, SubLObject old, SubLObject vector, SubLObject test, SubLObject key) {
        if (test == UNPROVIDED) {
            test = symbol_function(EQL);
        }
        if (key == UNPROVIDED) {
            key = symbol_function(IDENTITY);
        }
        SubLTrampolineFile.checkType(v_new, VECTORP);
        SubLTrampolineFile.checkType(old, VECTORP);
        SubLTrampolineFile.checkType(vector, VECTORP);
        {
            SubLObject pos = search(old, vector, test, key, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            while (NIL != pos) {
                vector = com.cyc.cycjava.cycl.vector_utilities.vector_nreplace_subsequence_int(v_new, pos, length(old), vector);
                pos = search(vector, old, test, key, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            } 
            return vector;
        }
    }

    /**
     * Replace all occurrences of OLD with NEW in VECTOR.
     *
     * @unknown -- Destructively modifies VECTOR iff it contains OLD.
     */
    @LispMethod(comment = "Replace all occurrences of OLD with NEW in VECTOR.\r\n\r\n@unknown -- Destructively modifies VECTOR iff it contains OLD.")
    public static SubLObject vector_nreplace_subsequence(final SubLObject v_new, final SubLObject old, SubLObject vector, SubLObject test, SubLObject key) {
        if (test == UNPROVIDED) {
            test = symbol_function(EQL);
        }
        if (key == UNPROVIDED) {
            key = symbol_function(IDENTITY);
        }
        assert NIL != vectorp(v_new) : "! vectorp(v_new) " + ("Types.vectorp(v_new) " + "CommonSymbols.NIL != Types.vectorp(v_new) ") + v_new;
        assert NIL != vectorp(old) : "! vectorp(old) " + ("Types.vectorp(old) " + "CommonSymbols.NIL != Types.vectorp(old) ") + old;
        assert NIL != vectorp(vector) : "! vectorp(vector) " + ("Types.vectorp(vector) " + "CommonSymbols.NIL != Types.vectorp(vector) ") + vector;
        for (SubLObject pos = search(old, vector, test, key, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED); NIL != pos; pos = search(vector, old, test, key, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED)) {
            vector = vector_nreplace_subsequence_int(v_new, pos, length(old), vector);
        }
        return vector;
    }

    public static final SubLObject vector_nreplace_subsequence_int_alt(SubLObject v_new, SubLObject pos, SubLObject old_length, SubLObject vector) {
        if (NIL != lengthE(v_new, old_length, UNPROVIDED)) {
            replace(vector, v_new, pos, add(pos, old_length), UNPROVIDED, UNPROVIDED);
            return vector;
        } else {
            {
                SubLObject new_vector = make_vector(add(length(vector), subtract(length(v_new), old_length)), UNPROVIDED);
                replace(new_vector, vector, ZERO_INTEGER, pos, UNPROVIDED, UNPROVIDED);
                replace(new_vector, v_new, pos, add(pos, length(v_new)), UNPROVIDED, UNPROVIDED);
                replace(new_vector, vector, add(pos, length(v_new)), NIL, add(pos, old_length), UNPROVIDED);
                return new_vector;
            }
        }
    }

    public static SubLObject vector_nreplace_subsequence_int(final SubLObject v_new, final SubLObject pos, final SubLObject old_length, final SubLObject vector) {
        if (NIL != list_utilities.lengthE(v_new, old_length, UNPROVIDED)) {
            replace(vector, v_new, pos, add(pos, old_length), UNPROVIDED, UNPROVIDED);
            return vector;
        }
        final SubLObject new_vector = make_vector(add(length(vector), subtract(length(v_new), old_length)), UNPROVIDED);
        replace(new_vector, vector, ZERO_INTEGER, pos, UNPROVIDED, UNPROVIDED);
        replace(new_vector, v_new, pos, add(pos, length(v_new)), UNPROVIDED, UNPROVIDED);
        replace(new_vector, vector, add(pos, length(v_new)), NIL, add(pos, old_length), UNPROVIDED);
        return new_vector;
    }

    public static final SubLObject print_vector_readably_alt(SubLObject vector, SubLObject stream) {
        if (stream == UNPROVIDED) {
            stream = T;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject _prev_bind_0 = $print_readably$.currentBinding(thread);
                try {
                    $print_readably$.bind(T, thread);
                    prin1(vector, stream);
                } finally {
                    $print_readably$.rebind(_prev_bind_0, thread);
                }
            }
            return vector;
        }
    }

    public static SubLObject print_vector_readably(final SubLObject vector, SubLObject stream) {
        if (stream == UNPROVIDED) {
            stream = T;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject _prev_bind_0 = $print_readably$.currentBinding(thread);
        try {
            $print_readably$.bind(T, thread);
            prin1(vector, stream);
        } finally {
            $print_readably$.rebind(_prev_bind_0, thread);
        }
        return vector;
    }

    /**
     * Print vector as a delimited line (for example, a line in a CSV file).
     */
    @LispMethod(comment = "Print vector as a delimited line (for example, a line in a CSV file).")
    public static final SubLObject print_vector_as_delimited_line_alt(SubLObject vector, SubLObject delimiter, SubLObject stream) {
        if (delimiter == UNPROVIDED) {
            delimiter = CHAR_comma;
        }
        if (stream == UNPROVIDED) {
            stream = T;
        }
        {
            SubLObject vector_var = vector;
            SubLObject backwardP_var = NIL;
            SubLObject length = length(vector_var);
            SubLObject v_iteration = NIL;
            for (v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = add(v_iteration, ONE_INTEGER)) {
                {
                    SubLObject i = (NIL != backwardP_var) ? ((SubLObject) (subtract(length, v_iteration, ONE_INTEGER))) : v_iteration;
                    SubLObject value = aref(vector_var, i);
                    if (!i.numE(ZERO_INTEGER)) {
                        princ(delimiter, stream);
                    }
                    prin1(value, stream);
                }
            }
        }
        return vector;
    }

    /**
     * Print vector as a delimited line (for example, a line in a CSV file).
     */
    @LispMethod(comment = "Print vector as a delimited line (for example, a line in a CSV file).")
    public static SubLObject print_vector_as_delimited_line(final SubLObject vector, SubLObject delimiter, SubLObject stream) {
        if (delimiter == UNPROVIDED) {
            delimiter = CHAR_comma;
        }
        if (stream == UNPROVIDED) {
            stream = T;
        }
        final SubLObject backwardP_var = NIL;
        SubLObject length;
        SubLObject v_iteration;
        SubLObject i;
        SubLObject value;
        for (length = length(vector), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = add(v_iteration, ONE_INTEGER)) {
            i = (NIL != backwardP_var) ? subtract(length, v_iteration, ONE_INTEGER) : v_iteration;
            value = aref(vector, i);
            if (!i.numE(ZERO_INTEGER)) {
                princ(delimiter, stream);
            }
            prin1(value, stream);
        }
        return vector;
    }

    public static final SubLObject max_element_alt(SubLObject vector) {
        {
            SubLObject max = NIL;
            SubLObject vector_var = vector;
            SubLObject backwardP_var = NIL;
            SubLObject length = length(vector_var);
            SubLObject v_iteration = NIL;
            for (v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = add(v_iteration, ONE_INTEGER)) {
                {
                    SubLObject element_num = (NIL != backwardP_var) ? ((SubLObject) (subtract(length, v_iteration, ONE_INTEGER))) : v_iteration;
                    SubLObject value = aref(vector_var, element_num);
                    if ((NIL == max) || value.numG(max)) {
                        max = value;
                    }
                }
            }
            return max;
        }
    }

    public static SubLObject max_element(final SubLObject vector) {
        SubLObject max = NIL;
        final SubLObject backwardP_var = NIL;
        SubLObject length;
        SubLObject v_iteration;
        SubLObject element_num;
        SubLObject value;
        for (length = length(vector), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = add(v_iteration, ONE_INTEGER)) {
            element_num = (NIL != backwardP_var) ? subtract(length, v_iteration, ONE_INTEGER) : v_iteration;
            value = aref(vector, element_num);
            if ((NIL == max) || value.numG(max)) {
                max = value;
            }
        }
        return max;
    }

    public static final SubLObject min_element_alt(SubLObject vector) {
        {
            SubLObject min = NIL;
            SubLObject vector_var = vector;
            SubLObject backwardP_var = NIL;
            SubLObject length = length(vector_var);
            SubLObject v_iteration = NIL;
            for (v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = add(v_iteration, ONE_INTEGER)) {
                {
                    SubLObject element_num = (NIL != backwardP_var) ? ((SubLObject) (subtract(length, v_iteration, ONE_INTEGER))) : v_iteration;
                    SubLObject value = aref(vector_var, element_num);
                    if ((NIL == min) || value.numL(min)) {
                        min = value;
                    }
                }
            }
            return min;
        }
    }

    public static SubLObject min_element(final SubLObject vector) {
        SubLObject min = NIL;
        final SubLObject backwardP_var = NIL;
        SubLObject length;
        SubLObject v_iteration;
        SubLObject element_num;
        SubLObject value;
        for (length = length(vector), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = add(v_iteration, ONE_INTEGER)) {
            element_num = (NIL != backwardP_var) ? subtract(length, v_iteration, ONE_INTEGER) : v_iteration;
            value = aref(vector, element_num);
            if ((NIL == min) || value.numL(min)) {
                min = value;
            }
        }
        return min;
    }

    public static final SubLObject extremal_element_alt(SubLObject vector, SubLObject key) {
        {
            SubLObject extremal = NIL;
            SubLObject vector_var = vector;
            SubLObject backwardP_var = NIL;
            SubLObject length = length(vector_var);
            SubLObject v_iteration = NIL;
            for (v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = add(v_iteration, ONE_INTEGER)) {
                {
                    SubLObject element_num = (NIL != backwardP_var) ? ((SubLObject) (subtract(length, v_iteration, ONE_INTEGER))) : v_iteration;
                    SubLObject value = aref(vector_var, element_num);
                    if ((NIL == extremal) || (NIL != funcall(key, value, extremal))) {
                        extremal = value;
                    }
                }
            }
            return extremal;
        }
    }

    public static SubLObject extremal_element(final SubLObject vector, final SubLObject key) {
        SubLObject extremal = NIL;
        final SubLObject backwardP_var = NIL;
        SubLObject length;
        SubLObject v_iteration;
        SubLObject element_num;
        SubLObject value;
        for (length = length(vector), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = add(v_iteration, ONE_INTEGER)) {
            element_num = (NIL != backwardP_var) ? subtract(length, v_iteration, ONE_INTEGER) : v_iteration;
            value = aref(vector, element_num);
            if ((NIL == extremal) || (NIL != funcall(key, value, extremal))) {
                extremal = value;
            }
        }
        return extremal;
    }

    public static SubLObject random_elt(final SubLObject sequence, SubLObject test) {
        if (test == UNPROVIDED) {
            test = symbol_function(TRUE);
        }
        assert NIL != sequencep(sequence) : "! sequencep(sequence) " + ("Types.sequencep(sequence) " + "CommonSymbols.NIL != Types.sequencep(sequence) ") + sequence;
        final SubLObject length = length(sequence);
        SubLTrampolineFile.enforceType(length, POSITIVE_INTEGER_P);
        SubLObject witness = NIL;
        for (SubLObject foundP = NIL; NIL == foundP; foundP = funcall(test, witness)) {
            final SubLObject index = random.random(length);
            witness = elt(sequence, index);
        }
        return witness;
    }

    public static SubLObject sample_list(final SubLObject list, SubLObject n, SubLObject allow_repeatsP, SubLObject test) {
        if (n == UNPROVIDED) {
            n = $int$500;
        }
        if (allow_repeatsP == UNPROVIDED) {
            allow_repeatsP = NIL;
        }
        if (test == UNPROVIDED) {
            test = symbol_function(TRUE);
        }
        assert NIL != list_utilities.proper_list_p(list) : "! list_utilities.proper_list_p(list) " + ("list_utilities.proper_list_p(list) " + "CommonSymbols.NIL != list_utilities.proper_list_p(list) ") + list;
        return sample_sequence(list, n, allow_repeatsP, test);
    }

    public static SubLObject sample_sequence(final SubLObject sequence, SubLObject n, SubLObject allow_repeatsP, SubLObject test) {
        if (n == UNPROVIDED) {
            n = $int$500;
        }
        if (allow_repeatsP == UNPROVIDED) {
            allow_repeatsP = NIL;
        }
        if (test == UNPROVIDED) {
            test = symbol_function(TRUE);
        }
        assert NIL != sequencep(sequence) : "! sequencep(sequence) " + ("Types.sequencep(sequence) " + "CommonSymbols.NIL != Types.sequencep(sequence) ") + sequence;
        assert NIL != subl_promotions.non_negative_integer_p(n) : "! subl_promotions.non_negative_integer_p(n) " + ("subl_promotions.non_negative_integer_p(n) " + "CommonSymbols.NIL != subl_promotions.non_negative_integer_p(n) ") + n;
        SubLObject sample_sequence = sequence;
        SubLObject sampled_items = NIL;
        if (sequence.isList() && multiply(n, length(sequence)).numGE($int$100000)) {
            sample_sequence = apply(symbol_function(VECTOR), sequence);
        }
        if (NIL != allow_repeatsP) {
            SubLObject i;
            for (i = NIL, i = ZERO_INTEGER; i.numL(n); i = add(i, ONE_INTEGER)) {
                sampled_items = cons(random_elt(sample_sequence, test), sampled_items);
            }
        } else {
            SubLObject sampled_set;
            for (sampled_set = set_contents.new_set_contents(n, symbol_function(EQL)); set_contents.set_contents_size(sampled_set).numL(n); sampled_set = set_contents.set_contents_add(random_elt(sample_sequence, test), sampled_set, symbol_function(EQL))) {
            }
            sampled_items = set_contents.set_contents_element_list(sampled_set);
        }
        if (sequence.isVector()) {
            sampled_items = apply(symbol_function(VECTOR), sampled_items);
        }
        return sampled_items;
    }

    /**
     * Returns array of length dim-X with dim-Y dimensions
     */
    @LispMethod(comment = "Returns array of length dim-X with dim-Y dimensions")
    public static final SubLObject make_ndim_array_alt(SubLObject dim_x, SubLObject dim_y) {
        {
            SubLObject base_vector = make_vector(dim_x, UNPROVIDED);
            SubLObject i = NIL;
            for (i = ZERO_INTEGER; i.numL(dim_x); i = add(i, ONE_INTEGER)) {
                set_aref(base_vector, i, make_vector(dim_y, UNPROVIDED));
            }
            return base_vector;
        }
    }

    /**
     * Returns array of length dim-X with dim-Y dimensions
     */
    @LispMethod(comment = "Returns array of length dim-X with dim-Y dimensions")
    public static SubLObject make_ndim_array(final SubLObject dim_x, final SubLObject dim_y) {
        final SubLObject base_vector = make_vector(dim_x, UNPROVIDED);
        SubLObject i;
        for (i = NIL, i = ZERO_INTEGER; i.numL(dim_x); i = add(i, ONE_INTEGER)) {
            set_aref(base_vector, i, make_vector(dim_y, UNPROVIDED));
        }
        return base_vector;
    }

    /**
     * Accessor for arrays made using make-NDim-array
     */
    @LispMethod(comment = "Accessor for arrays made using make-NDim-array")
    public static final SubLObject aref_ndim_alt(SubLObject base_vector, SubLObject x, SubLObject y) {
        return aref(aref(base_vector, x), y);
    }

    /**
     * Accessor for arrays made using make-NDim-array
     */
    @LispMethod(comment = "Accessor for arrays made using make-NDim-array")
    public static SubLObject aref_ndim(final SubLObject base_vector, final SubLObject x, final SubLObject y) {
        return aref(aref(base_vector, x), y);
    }

    /**
     * Set function for arrays made using make-NDim-array
     */
    @LispMethod(comment = "Set function for arrays made using make-NDim-array")
    public static final SubLObject set_aref_ndim_alt(SubLObject base_vector, SubLObject x, SubLObject y, SubLObject value) {
        return set_aref(aref(base_vector, x), y, value);
    }

    /**
     * Set function for arrays made using make-NDim-array
     */
    @LispMethod(comment = "Set function for arrays made using make-NDim-array")
    public static SubLObject set_aref_ndim(final SubLObject base_vector, final SubLObject x, final SubLObject y, final SubLObject value) {
        return set_aref(aref(base_vector, x), y, value);
    }

    public static final SubLObject f_2d_array_elements_alt(SubLObject v_2d_array) {
        {
            SubLObject elements = NIL;
            SubLObject vector_var = v_2d_array;
            SubLObject backwardP_var = NIL;
            SubLObject length = length(vector_var);
            SubLObject v_iteration = NIL;
            for (v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = add(v_iteration, ONE_INTEGER)) {
                {
                    SubLObject element_num = (NIL != backwardP_var) ? ((SubLObject) (subtract(length, v_iteration, ONE_INTEGER))) : v_iteration;
                    SubLObject subarray = aref(vector_var, element_num);
                    SubLObject items_var = subarray;
                    if (items_var.isVector()) {
                        {
                            SubLObject vector_var_1 = subarray;
                            SubLObject backwardP_var_2 = NIL;
                            SubLObject length_3 = length(vector_var_1);
                            SubLObject v_iteration_4 = NIL;
                            for (v_iteration_4 = ZERO_INTEGER; v_iteration_4.numL(length_3); v_iteration_4 = add(v_iteration_4, ONE_INTEGER)) {
                                {
                                    SubLObject element_num_5 = (NIL != backwardP_var_2) ? ((SubLObject) (subtract(length_3, v_iteration_4, ONE_INTEGER))) : v_iteration_4;
                                    SubLObject item = aref(vector_var_1, element_num_5);
                                    elements = cons(item, elements);
                                }
                            }
                        }
                    } else {
                        {
                            SubLObject cdolist_list_var = subarray;
                            SubLObject item = NIL;
                            for (item = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , item = cdolist_list_var.first()) {
                                elements = cons(item, elements);
                            }
                        }
                    }
                }
            }
            return elements;
        }
    }

    public static SubLObject f_2d_array_elements(final SubLObject v_2d_array) {
        SubLObject elements = NIL;
        final SubLObject backwardP_var = NIL;
        SubLObject length;
        SubLObject v_iteration;
        SubLObject element_num;
        SubLObject items_var;
        SubLObject subarray;
        SubLObject vector_var_$1;
        SubLObject backwardP_var_$2;
        SubLObject length_$3;
        SubLObject v_iteration_$4;
        SubLObject element_num_$5;
        SubLObject item;
        SubLObject cdolist_list_var;
        SubLObject item2;
        for (length = length(v_2d_array), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = add(v_iteration, ONE_INTEGER)) {
            element_num = (NIL != backwardP_var) ? subtract(length, v_iteration, ONE_INTEGER) : v_iteration;
            subarray = items_var = aref(v_2d_array, element_num);
            if (items_var.isVector()) {
                vector_var_$1 = items_var;
                backwardP_var_$2 = NIL;
                for (length_$3 = length(vector_var_$1), v_iteration_$4 = NIL, v_iteration_$4 = ZERO_INTEGER; v_iteration_$4.numL(length_$3); v_iteration_$4 = add(v_iteration_$4, ONE_INTEGER)) {
                    element_num_$5 = (NIL != backwardP_var_$2) ? subtract(length_$3, v_iteration_$4, ONE_INTEGER) : v_iteration_$4;
                    item = aref(vector_var_$1, element_num_$5);
                    elements = cons(item, elements);
                }
            } else {
                cdolist_list_var = items_var;
                item2 = NIL;
                item2 = cdolist_list_var.first();
                while (NIL != cdolist_list_var) {
                    elements = cons(item2, elements);
                    cdolist_list_var = cdolist_list_var.rest();
                    item2 = cdolist_list_var.first();
                } 
            }
        }
        return elements;
    }

    public static final SubLObject f_3d_array_elements_alt(SubLObject v_3d_array) {
        {
            SubLObject elements = NIL;
            SubLObject vector_var = v_3d_array;
            SubLObject backwardP_var = NIL;
            SubLObject length = length(vector_var);
            SubLObject v_iteration = NIL;
            for (v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = add(v_iteration, ONE_INTEGER)) {
                {
                    SubLObject element_num = (NIL != backwardP_var) ? ((SubLObject) (subtract(length, v_iteration, ONE_INTEGER))) : v_iteration;
                    SubLObject v_2d_array = aref(vector_var, element_num);
                    SubLObject vector_var_6 = v_2d_array;
                    SubLObject backwardP_var_7 = NIL;
                    SubLObject length_8 = length(vector_var_6);
                    SubLObject v_iteration_9 = NIL;
                    for (v_iteration_9 = ZERO_INTEGER; v_iteration_9.numL(length_8); v_iteration_9 = add(v_iteration_9, ONE_INTEGER)) {
                        {
                            SubLObject element_num_10 = (NIL != backwardP_var_7) ? ((SubLObject) (subtract(length_8, v_iteration_9, ONE_INTEGER))) : v_iteration_9;
                            SubLObject array = aref(vector_var_6, element_num_10);
                            SubLObject items_var = array;
                            if (items_var.isVector()) {
                                {
                                    SubLObject vector_var_11 = array;
                                    SubLObject backwardP_var_12 = NIL;
                                    SubLObject length_13 = length(vector_var_11);
                                    SubLObject v_iteration_14 = NIL;
                                    for (v_iteration_14 = ZERO_INTEGER; v_iteration_14.numL(length_13); v_iteration_14 = add(v_iteration_14, ONE_INTEGER)) {
                                        {
                                            SubLObject element_num_15 = (NIL != backwardP_var_12) ? ((SubLObject) (subtract(length_13, v_iteration_14, ONE_INTEGER))) : v_iteration_14;
                                            SubLObject item = aref(vector_var_11, element_num_15);
                                            elements = cons(item, elements);
                                        }
                                    }
                                }
                            } else {
                                {
                                    SubLObject cdolist_list_var = array;
                                    SubLObject item = NIL;
                                    for (item = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , item = cdolist_list_var.first()) {
                                        elements = cons(item, elements);
                                    }
                                }
                            }
                        }
                    }
                }
            }
            return elements;
        }
    }

    public static SubLObject f_3d_array_elements(final SubLObject v_3d_array) {
        SubLObject elements = NIL;
        final SubLObject backwardP_var = NIL;
        SubLObject length;
        SubLObject v_iteration;
        SubLObject element_num;
        SubLObject vector_var_$6;
        SubLObject v_2d_array;
        SubLObject backwardP_var_$7;
        SubLObject length_$8;
        SubLObject v_iteration_$9;
        SubLObject element_num_$10;
        SubLObject items_var;
        SubLObject array;
        SubLObject vector_var_$7;
        SubLObject backwardP_var_$8;
        SubLObject length_$9;
        SubLObject v_iteration_$10;
        SubLObject element_num_$11;
        SubLObject item;
        SubLObject cdolist_list_var;
        SubLObject item2;
        for (length = length(v_3d_array), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = add(v_iteration, ONE_INTEGER)) {
            element_num = (NIL != backwardP_var) ? subtract(length, v_iteration, ONE_INTEGER) : v_iteration;
            v_2d_array = vector_var_$6 = aref(v_3d_array, element_num);
            backwardP_var_$7 = NIL;
            for (length_$8 = length(vector_var_$6), v_iteration_$9 = NIL, v_iteration_$9 = ZERO_INTEGER; v_iteration_$9.numL(length_$8); v_iteration_$9 = add(v_iteration_$9, ONE_INTEGER)) {
                element_num_$10 = (NIL != backwardP_var_$7) ? subtract(length_$8, v_iteration_$9, ONE_INTEGER) : v_iteration_$9;
                array = items_var = aref(vector_var_$6, element_num_$10);
                if (items_var.isVector()) {
                    vector_var_$7 = items_var;
                    backwardP_var_$8 = NIL;
                    for (length_$9 = length(vector_var_$7), v_iteration_$10 = NIL, v_iteration_$10 = ZERO_INTEGER; v_iteration_$10.numL(length_$9); v_iteration_$10 = add(v_iteration_$10, ONE_INTEGER)) {
                        element_num_$11 = (NIL != backwardP_var_$8) ? subtract(length_$9, v_iteration_$10, ONE_INTEGER) : v_iteration_$10;
                        item = aref(vector_var_$7, element_num_$11);
                        elements = cons(item, elements);
                    }
                } else {
                    cdolist_list_var = items_var;
                    item2 = NIL;
                    item2 = cdolist_list_var.first();
                    while (NIL != cdolist_list_var) {
                        elements = cons(item2, elements);
                        cdolist_list_var = cdolist_list_var.rest();
                        item2 = cdolist_list_var.first();
                    } 
                }
            }
        }
        return elements;
    }

    /**
     * Return T iff OBJECT is a vector of bytes.
     */
    @LispMethod(comment = "Return T iff OBJECT is a vector of bytes.")
    public static final SubLObject byte_vector_p_alt(SubLObject v_object) {
        if (v_object.isVector()) {
            {
                SubLObject vector_var = v_object;
                SubLObject backwardP_var = NIL;
                SubLObject length = length(vector_var);
                SubLObject v_iteration = NIL;
                for (v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = add(v_iteration, ONE_INTEGER)) {
                    {
                        SubLObject element_num = (NIL != backwardP_var) ? ((SubLObject) (subtract(length, v_iteration, ONE_INTEGER))) : v_iteration;
                        SubLObject item = aref(vector_var, element_num);
                        if (NIL == number_utilities.bytep(item)) {
                            return NIL;
                        }
                    }
                }
            }
            return T;
        }
        return NIL;
    }

    /**
     * Return T iff OBJECT is a vector of bytes.
     */
    @LispMethod(comment = "Return T iff OBJECT is a vector of bytes.")
    public static SubLObject byte_vector_p(final SubLObject v_object) {
        if (v_object.isVector()) {
            final SubLObject backwardP_var = NIL;
            SubLObject length;
            SubLObject v_iteration;
            SubLObject element_num;
            SubLObject item;
            for (length = length(v_object), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = add(v_iteration, ONE_INTEGER)) {
                element_num = (NIL != backwardP_var) ? subtract(length, v_iteration, ONE_INTEGER) : v_iteration;
                item = aref(v_object, element_num);
                if (NIL == number_utilities.bytep(item)) {
                    return NIL;
                }
            }
            return T;
        }
        return NIL;
    }

    /**
     * Return a byte vector consisting of the entire contents of FILENAME
     */
    @LispMethod(comment = "Return a byte vector consisting of the entire contents of FILENAME")
    public static final SubLObject new_byte_vector_from_file_alt(SubLObject filename) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            SubLTrampolineFile.checkType(filename, STRINGP);
            {
                SubLObject byte_vector = NIL;
                SubLObject stream = NIL;
                try {
                    {
                        SubLObject _prev_bind_0 = stream_macros.$stream_requires_locking$.currentBinding(thread);
                        try {
                            stream_macros.$stream_requires_locking$.bind(NIL, thread);
                            stream = compatibility.open_binary(filename, $INPUT, NIL);
                        } finally {
                            stream_macros.$stream_requires_locking$.rebind(_prev_bind_0, thread);
                        }
                    }
                    if (!stream.isStream()) {
                        Errors.error($str_alt6$Unable_to_open__S, filename);
                    }
                    {
                        SubLObject stream_16 = stream;
                        SubLObject length = file_length(stream_16);
                        byte_vector = make_vector(length, UNPROVIDED);
                        {
                            SubLObject i = NIL;
                            for (i = ZERO_INTEGER; i.numL(length); i = add(i, ONE_INTEGER)) {
                                set_aref(byte_vector, i, read_byte(stream_16, T, UNPROVIDED));
                            }
                        }
                    }
                } finally {
                    {
                        SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                        try {
                            $is_thread_performing_cleanupP$.bind(T, thread);
                            if (stream.isStream()) {
                                close(stream, UNPROVIDED);
                            }
                        } finally {
                            $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                        }
                    }
                }
                return byte_vector;
            }
        }
    }

    /**
     * Return a byte vector consisting of the entire contents of FILENAME
     */
    @LispMethod(comment = "Return a byte vector consisting of the entire contents of FILENAME")
    public static SubLObject new_byte_vector_from_file(final SubLObject filename) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != stringp(filename) : "! stringp(filename) " + ("Types.stringp(filename) " + "CommonSymbols.NIL != Types.stringp(filename) ") + filename;
        SubLObject byte_vector = NIL;
        SubLObject stream = NIL;
        try {
            final SubLObject _prev_bind_0 = stream_macros.$stream_requires_locking$.currentBinding(thread);
            try {
                stream_macros.$stream_requires_locking$.bind(NIL, thread);
                stream = compatibility.open_binary(filename, $INPUT);
            } finally {
                stream_macros.$stream_requires_locking$.rebind(_prev_bind_0, thread);
            }
            if (!stream.isStream()) {
                Errors.error($str14$Unable_to_open__S, filename);
            }
            final SubLObject stream_$16 = stream;
            final SubLObject length = file_length(stream_$16);
            byte_vector = make_vector(length, UNPROVIDED);
            SubLObject i;
            for (i = NIL, i = ZERO_INTEGER; i.numL(length); i = add(i, ONE_INTEGER)) {
                set_aref(byte_vector, i, read_byte(stream_$16, T, UNPROVIDED));
            }
        } finally {
            final SubLObject _prev_bind_2 = $is_thread_performing_cleanupP$.currentBinding(thread);
            try {
                $is_thread_performing_cleanupP$.bind(T, thread);
                final SubLObject _values = getValuesAsVector();
                if (stream.isStream()) {
                    close(stream, UNPROVIDED);
                }
                restoreValuesFromVector(_values);
            } finally {
                $is_thread_performing_cleanupP$.rebind(_prev_bind_2, thread);
            }
        }
        return byte_vector;
    }

    /**
     * Convert BYTE-VECTOR into a string satisfying hex-char-string-p
     */
    @LispMethod(comment = "Convert BYTE-VECTOR into a string satisfying hex-char-string-p")
    public static final SubLObject byte_vector_to_hex_char_string_alt(SubLObject byte_vector) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            SubLTrampolineFile.checkType(byte_vector, BYTE_VECTOR_P);
            {
                SubLObject hex_char_string = NIL;
                SubLObject stream = NIL;
                try {
                    stream = make_private_string_output_stream();
                    {
                        SubLObject vector_var = byte_vector;
                        SubLObject backwardP_var = NIL;
                        SubLObject length = length(vector_var);
                        SubLObject v_iteration = NIL;
                        for (v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = add(v_iteration, ONE_INTEGER)) {
                            {
                                SubLObject element_num = (NIL != backwardP_var) ? ((SubLObject) (subtract(length, v_iteration, ONE_INTEGER))) : v_iteration;
                                SubLObject v_byte = aref(vector_var, element_num);
                                thread.resetMultipleValues();
                                {
                                    SubLObject high_char = com.cyc.cycjava.cycl.vector_utilities.byte_to_hex_chars(v_byte);
                                    SubLObject low_char = thread.secondMultipleValue();
                                    thread.resetMultipleValues();
                                    write_char(high_char, stream);
                                    write_char(low_char, stream);
                                }
                            }
                        }
                    }
                    hex_char_string = get_output_stream_string(stream);
                } finally {
                    {
                        SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                        try {
                            $is_thread_performing_cleanupP$.bind(T, thread);
                            close(stream, UNPROVIDED);
                        } finally {
                            $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                        }
                    }
                }
                return hex_char_string;
            }
        }
    }

    /**
     * Convert BYTE-VECTOR into a string satisfying hex-char-string-p
     */
    @LispMethod(comment = "Convert BYTE-VECTOR into a string satisfying hex-char-string-p")
    public static SubLObject byte_vector_to_hex_char_string(final SubLObject byte_vector) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != byte_vector_p(byte_vector) : "! vector_utilities.byte_vector_p(byte_vector) " + ("vector_utilities.byte_vector_p(byte_vector) " + "CommonSymbols.NIL != vector_utilities.byte_vector_p(byte_vector) ") + byte_vector;
        SubLObject hex_char_string = NIL;
        SubLObject stream = NIL;
        try {
            stream = make_private_string_output_stream();
            final SubLObject backwardP_var = NIL;
            SubLObject length;
            SubLObject v_iteration;
            SubLObject element_num;
            SubLObject v_byte;
            SubLObject high_char;
            SubLObject low_char;
            for (length = length(byte_vector), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = add(v_iteration, ONE_INTEGER)) {
                element_num = (NIL != backwardP_var) ? subtract(length, v_iteration, ONE_INTEGER) : v_iteration;
                v_byte = aref(byte_vector, element_num);
                thread.resetMultipleValues();
                high_char = byte_to_hex_chars(v_byte);
                low_char = thread.secondMultipleValue();
                thread.resetMultipleValues();
                write_char(high_char, stream);
                write_char(low_char, stream);
            }
            hex_char_string = get_output_stream_string(stream);
        } finally {
            final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
            try {
                $is_thread_performing_cleanupP$.bind(T, thread);
                final SubLObject _values = getValuesAsVector();
                close(stream, UNPROVIDED);
                restoreValuesFromVector(_values);
            } finally {
                $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
            }
        }
        return hex_char_string;
    }

    /**
     * Like @xref byte-vector-to-hex-char-string, but outputs a newline every 32 bytes and a space every 4 bytes.
     * Starts with a newline, but does not add a trailing space or newline if the length of BYTE-VECTOR is
     * evenly divisible by 4 or 32.
     */
    @LispMethod(comment = "Like @xref byte-vector-to-hex-char-string, but outputs a newline every 32 bytes and a space every 4 bytes.\r\nStarts with a newline, but does not add a trailing space or newline if the length of BYTE-VECTOR is\r\nevenly divisible by 4 or 32.\nLike @xref byte-vector-to-hex-char-string, but outputs a newline every 32 bytes and a space every 4 bytes.\nStarts with a newline, but does not add a trailing space or newline if the length of BYTE-VECTOR is\nevenly divisible by 4 or 32.")
    public static final SubLObject byte_vector_to_formatted_hex_char_string_alt(SubLObject byte_vector) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject byte_vector_length = length(byte_vector);
                SubLObject hex_string_length = add(ONE_INTEGER, number_utilities.f_2X(byte_vector_length), floor(number_utilities.f_1_(byte_vector_length), FOUR_INTEGER));
                SubLObject hex_string = Strings.make_string(hex_string_length, UNPROVIDED);
                SubLObject j = ZERO_INTEGER;
                SubLObject vector_var = byte_vector;
                SubLObject backwardP_var = NIL;
                SubLObject length = length(vector_var);
                SubLObject v_iteration = NIL;
                for (v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = add(v_iteration, ONE_INTEGER)) {
                    {
                        SubLObject i = (NIL != backwardP_var) ? ((SubLObject) (subtract(length, v_iteration, ONE_INTEGER))) : v_iteration;
                        SubLObject v_byte = aref(vector_var, i);
                        if (mod(i, $int$32).isZero()) {
                            set_aref(hex_string, j, CHAR_newline);
                            j = add(j, ONE_INTEGER);
                        } else {
                            if (mod(i, FOUR_INTEGER).isZero()) {
                                set_aref(hex_string, j, CHAR_space);
                                j = add(j, ONE_INTEGER);
                            }
                        }
                        thread.resetMultipleValues();
                        {
                            SubLObject high_char = com.cyc.cycjava.cycl.vector_utilities.byte_to_hex_chars(v_byte);
                            SubLObject low_char = thread.secondMultipleValue();
                            thread.resetMultipleValues();
                            set_aref(hex_string, j, high_char);
                            j = add(j, ONE_INTEGER);
                            set_aref(hex_string, j, low_char);
                            j = add(j, ONE_INTEGER);
                        }
                    }
                }
                if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                    if (!j.numE(hex_string_length)) {
                        Errors.error($str_alt9$Did_not_fill_up_all_the_expected_, j, hex_string_length);
                    }
                }
                return hex_string;
            }
        }
    }

    /**
     * Like @xref byte-vector-to-hex-char-string, but outputs a newline every 32 bytes and a space every 4 bytes.
     * Starts with a newline, but does not add a trailing space or newline if the length of BYTE-VECTOR is
     * evenly divisible by 4 or 32.
     */
    @LispMethod(comment = "Like @xref byte-vector-to-hex-char-string, but outputs a newline every 32 bytes and a space every 4 bytes.\r\nStarts with a newline, but does not add a trailing space or newline if the length of BYTE-VECTOR is\r\nevenly divisible by 4 or 32.\nLike @xref byte-vector-to-hex-char-string, but outputs a newline every 32 bytes and a space every 4 bytes.\nStarts with a newline, but does not add a trailing space or newline if the length of BYTE-VECTOR is\nevenly divisible by 4 or 32.")
    public static SubLObject byte_vector_to_formatted_hex_char_string(final SubLObject byte_vector) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject byte_vector_length = length(byte_vector);
        final SubLObject hex_string_length = add(ONE_INTEGER, number_utilities.f_2X(byte_vector_length), floor(number_utilities.f_1_(byte_vector_length), FOUR_INTEGER));
        final SubLObject hex_string = Strings.make_string(hex_string_length, UNPROVIDED);
        SubLObject j = ZERO_INTEGER;
        final SubLObject backwardP_var = NIL;
        SubLObject length;
        SubLObject v_iteration;
        SubLObject i;
        SubLObject v_byte;
        SubLObject high_char;
        SubLObject low_char;
        for (length = length(byte_vector), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = add(v_iteration, ONE_INTEGER)) {
            i = (NIL != backwardP_var) ? subtract(length, v_iteration, ONE_INTEGER) : v_iteration;
            v_byte = aref(byte_vector, i);
            if (mod(i, $int$32).isZero()) {
                set_aref(hex_string, j, CHAR_newline);
                j = add(j, ONE_INTEGER);
            } else
                if (mod(i, FOUR_INTEGER).isZero()) {
                    set_aref(hex_string, j, CHAR_space);
                    j = add(j, ONE_INTEGER);
                }

            thread.resetMultipleValues();
            high_char = byte_to_hex_chars(v_byte);
            low_char = thread.secondMultipleValue();
            thread.resetMultipleValues();
            set_aref(hex_string, j, high_char);
            j = add(j, ONE_INTEGER);
            set_aref(hex_string, j, low_char);
            j = add(j, ONE_INTEGER);
        }
        if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (!j.numE(hex_string_length))) {
            Errors.error($str17$Did_not_fill_up_all_the_expected_, j, hex_string_length);
        }
        return hex_string;
    }

    /**
     * Interprets BYTE-VECTOR as a string, converting each byte to the
     * corresponding character via code-char.
     *
     * @unknown pace
     */
    @LispMethod(comment = "Interprets BYTE-VECTOR as a string, converting each byte to the\r\ncorresponding character via code-char.\r\n\r\n@unknown pace\nInterprets BYTE-VECTOR as a string, converting each byte to the\ncorresponding character via code-char.")
    public static final SubLObject byte_vector_to_string_alt(SubLObject byte_vector) {
        SubLTrampolineFile.checkType(byte_vector, BYTE_VECTOR_P);
        {
            SubLObject length = length(byte_vector);
            SubLObject string = Strings.make_string(length, UNPROVIDED);
            SubLObject vector_var = byte_vector;
            SubLObject backwardP_var = NIL;
            SubLObject length_17 = length(vector_var);
            SubLObject v_iteration = NIL;
            for (v_iteration = ZERO_INTEGER; v_iteration.numL(length_17); v_iteration = add(v_iteration, ONE_INTEGER)) {
                {
                    SubLObject index = (NIL != backwardP_var) ? ((SubLObject) (subtract(length_17, v_iteration, ONE_INTEGER))) : v_iteration;
                    SubLObject v_byte = aref(vector_var, index);
                    Strings.set_char(string, index, code_char(v_byte));
                }
            }
            return string;
        }
    }

    /**
     * Interprets BYTE-VECTOR as a string, converting each byte to the
     * corresponding character via code-char.
     *
     * @unknown pace
     */
    @LispMethod(comment = "Interprets BYTE-VECTOR as a string, converting each byte to the\r\ncorresponding character via code-char.\r\n\r\n@unknown pace\nInterprets BYTE-VECTOR as a string, converting each byte to the\ncorresponding character via code-char.")
    public static SubLObject byte_vector_to_string(final SubLObject byte_vector) {
        assert NIL != byte_vector_p(byte_vector) : "! vector_utilities.byte_vector_p(byte_vector) " + ("vector_utilities.byte_vector_p(byte_vector) " + "CommonSymbols.NIL != vector_utilities.byte_vector_p(byte_vector) ") + byte_vector;
        final SubLObject length = length(byte_vector);
        final SubLObject string = Strings.make_string(length, UNPROVIDED);
        final SubLObject backwardP_var = NIL;
        SubLObject length_$17;
        SubLObject v_iteration;
        SubLObject index;
        SubLObject v_byte;
        for (length_$17 = length(byte_vector), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL(length_$17); v_iteration = add(v_iteration, ONE_INTEGER)) {
            index = (NIL != backwardP_var) ? subtract(length_$17, v_iteration, ONE_INTEGER) : v_iteration;
            v_byte = aref(byte_vector, index);
            Strings.set_char(string, index, code_char(v_byte));
        }
        return string;
    }

    /**
     * Convert HEX-CHAR-STRING into a vector satisfying byte-vector-p
     */
    @LispMethod(comment = "Convert HEX-CHAR-STRING into a vector satisfying byte-vector-p")
    public static final SubLObject hex_char_string_to_byte_vector_alt(SubLObject hex_char_string) {
        SubLTrampolineFile.checkType(hex_char_string, HEX_CHAR_STRING_P);
        {
            SubLObject string_length = length(hex_char_string);
            SubLTrampolineFile.checkType(string_length, EVENP);
            {
                SubLObject byte_vector_length = integerDivide(string_length, TWO_INTEGER);
                SubLObject byte_vector = make_vector(byte_vector_length, UNPROVIDED);
                SubLObject i = NIL;
                for (i = ZERO_INTEGER; i.numL(byte_vector_length); i = add(i, ONE_INTEGER)) {
                    {
                        SubLObject string_index = multiply(TWO_INTEGER, i);
                        SubLObject high_char = Strings.sublisp_char(hex_char_string, string_index);
                        SubLObject low_char = Strings.sublisp_char(hex_char_string, add(ONE_INTEGER, string_index));
                        SubLObject v_byte = com.cyc.cycjava.cycl.vector_utilities.hex_chars_to_byte(high_char, low_char);
                        set_aref(byte_vector, i, v_byte);
                    }
                }
                return byte_vector;
            }
        }
    }

    /**
     * Convert HEX-CHAR-STRING into a vector satisfying byte-vector-p
     */
    @LispMethod(comment = "Convert HEX-CHAR-STRING into a vector satisfying byte-vector-p")
    public static SubLObject hex_char_string_to_byte_vector(final SubLObject hex_char_string) {
        assert NIL != string_utilities.hex_char_string_p(hex_char_string) : "! string_utilities.hex_char_string_p(hex_char_string) " + ("string_utilities.hex_char_string_p(hex_char_string) " + "CommonSymbols.NIL != string_utilities.hex_char_string_p(hex_char_string) ") + hex_char_string;
        final SubLObject string_length = length(hex_char_string);
        assert NIL != evenp(string_length) : "! Numbers.evenp(string_length) " + ("Numbers.evenp(string_length) " + "CommonSymbols.NIL != Numbers.evenp(string_length) ") + string_length;
        final SubLObject byte_vector_length = integerDivide(string_length, TWO_INTEGER);
        final SubLObject byte_vector = make_vector(byte_vector_length, UNPROVIDED);
        SubLObject i;
        SubLObject string_index;
        SubLObject high_char;
        SubLObject low_char;
        SubLObject v_byte;
        for (i = NIL, i = ZERO_INTEGER; i.numL(byte_vector_length); i = add(i, ONE_INTEGER)) {
            string_index = multiply(TWO_INTEGER, i);
            high_char = Strings.sublisp_char(hex_char_string, string_index);
            low_char = Strings.sublisp_char(hex_char_string, add(ONE_INTEGER, string_index));
            v_byte = hex_chars_to_byte(high_char, low_char);
            set_aref(byte_vector, i, v_byte);
        }
        return byte_vector;
    }

    public static final SubLObject byte_to_hex_chars_alt(SubLObject v_byte) {
        {
            SubLObject high_nybble = integerDivide(v_byte, SIXTEEN_INTEGER);
            SubLObject low_nybble = mod(v_byte, SIXTEEN_INTEGER);
            return values(hex_char(high_nybble), hex_char(low_nybble));
        }
    }

    public static SubLObject byte_to_hex_chars(final SubLObject v_byte) {
        final SubLObject high_nybble = integerDivide(v_byte, SIXTEEN_INTEGER);
        final SubLObject low_nybble = mod(v_byte, SIXTEEN_INTEGER);
        return values(string_utilities.hex_char(high_nybble), string_utilities.hex_char(low_nybble));
    }

    public static final SubLObject hex_chars_to_byte_alt(SubLObject high_char, SubLObject low_char) {
        {
            SubLObject high_nybble = hex_char_value(high_char);
            SubLObject low_nybble = hex_char_value(low_char);
            return add(multiply(SIXTEEN_INTEGER, high_nybble), low_nybble);
        }
    }

    public static SubLObject hex_chars_to_byte(final SubLObject high_char, final SubLObject low_char) {
        final SubLObject high_nybble = string_utilities.hex_char_value(high_char);
        final SubLObject low_nybble = string_utilities.hex_char_value(low_char);
        return add(multiply(SIXTEEN_INTEGER, high_nybble), low_nybble);
    }

    public static final SubLObject byte_vector_to_64_bit_char_string_alt(SubLObject byte_vector) {
        SubLTrampolineFile.checkType(byte_vector, BYTE_VECTOR_P);
        {
            SubLObject i = ZERO_INTEGER;
            SubLObject v_64_bit_char_string = NIL;
            SubLObject high_byte = NIL;
            SubLObject middle_byte = NIL;
            SubLObject stream = NIL;
            try {
                stream = make_private_string_output_stream();
                {
                    SubLObject vector_var = byte_vector;
                    SubLObject backwardP_var = NIL;
                    SubLObject length = length(vector_var);
                    SubLObject v_iteration = NIL;
                    for (v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = add(v_iteration, ONE_INTEGER)) {
                        {
                            SubLObject element_num = (NIL != backwardP_var) ? ((SubLObject) (subtract(length, v_iteration, ONE_INTEGER))) : v_iteration;
                            SubLObject v_byte = aref(vector_var, element_num);
                            SubLObject pcase_var = i;
                            if (pcase_var.eql(ZERO_INTEGER)) {
                                high_byte = v_byte;
                            } else {
                                if (pcase_var.eql(ONE_INTEGER)) {
                                    middle_byte = v_byte;
                                } else {
                                    if (pcase_var.eql(TWO_INTEGER)) {
                                        {
                                            SubLObject low_byte = v_byte;
                                            com.cyc.cycjava.cycl.vector_utilities.write_bytes_as_64_bit_chars(high_byte, middle_byte, low_byte, stream);
                                        }
                                        i = MINUS_ONE_INTEGER;
                                    }
                                }
                            }
                            i = add(i, ONE_INTEGER);
                        }
                    }
                }
                {
                    SubLObject pcase_var = i;
                    if (pcase_var.eql(ZERO_INTEGER)) {
                    } else {
                        if (pcase_var.eql(ONE_INTEGER)) {
                            middle_byte = NIL;
                            {
                                SubLObject low_byte = NIL;
                                com.cyc.cycjava.cycl.vector_utilities.write_bytes_as_64_bit_chars(high_byte, middle_byte, low_byte, stream);
                            }
                        } else {
                            if (pcase_var.eql(TWO_INTEGER)) {
                                {
                                    SubLObject low_byte = NIL;
                                    com.cyc.cycjava.cycl.vector_utilities.write_bytes_as_64_bit_chars(high_byte, middle_byte, low_byte, stream);
                                }
                            }
                        }
                    }
                }
                v_64_bit_char_string = get_output_stream_string(stream);
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
            return v_64_bit_char_string;
        }
    }

    public static SubLObject byte_vector_to_64_bit_char_string(final SubLObject byte_vector) {
        assert NIL != byte_vector_p(byte_vector) : "! vector_utilities.byte_vector_p(byte_vector) " + ("vector_utilities.byte_vector_p(byte_vector) " + "CommonSymbols.NIL != vector_utilities.byte_vector_p(byte_vector) ") + byte_vector;
        SubLObject i = ZERO_INTEGER;
        SubLObject v_64_bit_char_string = NIL;
        SubLObject high_byte = NIL;
        SubLObject middle_byte = NIL;
        SubLObject stream = NIL;
        try {
            stream = make_private_string_output_stream();
            final SubLObject backwardP_var = NIL;
            SubLObject length;
            SubLObject v_iteration;
            SubLObject element_num;
            SubLObject v_byte;
            SubLObject pcase_var;
            SubLObject low_byte;
            for (length = length(byte_vector), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = add(v_iteration, ONE_INTEGER)) {
                element_num = (NIL != backwardP_var) ? subtract(length, v_iteration, ONE_INTEGER) : v_iteration;
                v_byte = aref(byte_vector, element_num);
                pcase_var = i;
                if (pcase_var.eql(ZERO_INTEGER)) {
                    high_byte = v_byte;
                } else
                    if (pcase_var.eql(ONE_INTEGER)) {
                        middle_byte = v_byte;
                    } else
                        if (pcase_var.eql(TWO_INTEGER)) {
                            low_byte = v_byte;
                            write_bytes_as_64_bit_chars(high_byte, middle_byte, low_byte, stream);
                            i = MINUS_ONE_INTEGER;
                        }


                i = add(i, ONE_INTEGER);
            }
            final SubLObject pcase_var2 = i;
            if (!pcase_var2.eql(ZERO_INTEGER)) {
                if (pcase_var2.eql(ONE_INTEGER)) {
                    middle_byte = NIL;
                    final SubLObject low_byte2 = NIL;
                    write_bytes_as_64_bit_chars(high_byte, middle_byte, low_byte2, stream);
                } else
                    if (pcase_var2.eql(TWO_INTEGER)) {
                        final SubLObject low_byte2 = NIL;
                        write_bytes_as_64_bit_chars(high_byte, middle_byte, low_byte2, stream);
                    }

            }
            v_64_bit_char_string = get_output_stream_string(stream);
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
        return v_64_bit_char_string;
    }

    public static final SubLObject write_bytes_as_64_bit_chars_alt(SubLObject high_byte, SubLObject middle_byte, SubLObject low_byte, SubLObject stream) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            thread.resetMultipleValues();
            {
                SubLObject highest_char = com.cyc.cycjava.cycl.vector_utilities.bytes_to_64_bit_chars(high_byte, middle_byte, low_byte);
                SubLObject high_char = thread.secondMultipleValue();
                SubLObject low_char = thread.thirdMultipleValue();
                SubLObject lowest_char = thread.fourthMultipleValue();
                thread.resetMultipleValues();
                write_char(highest_char, stream);
                write_char(high_char, stream);
                if (NIL != low_char) {
                    write_char(low_char, stream);
                }
                if (NIL != lowest_char) {
                    write_char(lowest_char, stream);
                }
            }
            return stream;
        }
    }

    public static SubLObject write_bytes_as_64_bit_chars(final SubLObject high_byte, final SubLObject middle_byte, final SubLObject low_byte, final SubLObject stream) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        thread.resetMultipleValues();
        final SubLObject highest_char = bytes_to_64_bit_chars(high_byte, middle_byte, low_byte);
        final SubLObject high_char = thread.secondMultipleValue();
        final SubLObject low_char = thread.thirdMultipleValue();
        final SubLObject lowest_char = thread.fourthMultipleValue();
        thread.resetMultipleValues();
        write_char(highest_char, stream);
        write_char(high_char, stream);
        if (NIL != low_char) {
            write_char(low_char, stream);
        }
        if (NIL != lowest_char) {
            write_char(lowest_char, stream);
        }
        return stream;
    }

    /**
     * Three bytes (2^8 * 2^8 * 2^8) turn into four 64-bit characters (2^6 + 2^6 + 2^6 + 2^6), since 8*3 = 6*4
     * with special handling for NILs
     */
    @LispMethod(comment = "Three bytes (2^8 * 2^8 * 2^8) turn into four 64-bit characters (2^6 + 2^6 + 2^6 + 2^6), since 8*3 = 6*4\r\nwith special handling for NILs\nThree bytes (2^8 * 2^8 * 2^8) turn into four 64-bit characters (2^6 + 2^6 + 2^6 + 2^6), since 8*3 = 6*4\nwith special handling for NILs")
    public static final SubLObject bytes_to_64_bit_chars_alt(SubLObject high_byte, SubLObject middle_byte, SubLObject low_byte) {
        {
            SubLObject nil_count = ZERO_INTEGER;
            if (NIL == low_byte) {
                low_byte = ZERO_INTEGER;
                nil_count = add(nil_count, ONE_INTEGER);
            }
            if (NIL == middle_byte) {
                middle_byte = ZERO_INTEGER;
                nil_count = add(nil_count, ONE_INTEGER);
            }
            {
                SubLObject aaaaaa = bytes.ldb(bytes.sublisp_byte(SIX_INTEGER, TWO_INTEGER), high_byte);
                SubLObject bb = bytes.ldb(bytes.sublisp_byte(TWO_INTEGER, ZERO_INTEGER), high_byte);
                SubLObject bbbb = bytes.ldb(bytes.sublisp_byte(FOUR_INTEGER, FOUR_INTEGER), middle_byte);
                SubLObject cccc = bytes.ldb(bytes.sublisp_byte(FOUR_INTEGER, ZERO_INTEGER), middle_byte);
                SubLObject cc = bytes.ldb(bytes.sublisp_byte(TWO_INTEGER, SIX_INTEGER), low_byte);
                SubLObject dddddd = bytes.ldb(bytes.sublisp_byte(SIX_INTEGER, ZERO_INTEGER), low_byte);
                SubLObject bbbbbb = add(ash(bb, FOUR_INTEGER), bbbb);
                SubLObject cccccc = add(ash(cccc, TWO_INTEGER), cc);
                SubLObject highest_char = f_64_bit_char(aaaaaa);
                SubLObject high_char = f_64_bit_char(bbbbbb);
                SubLObject low_char = f_64_bit_char(cccccc);
                SubLObject lowest_char = f_64_bit_char(dddddd);
                if (nil_count.numG(ZERO_INTEGER)) {
                    lowest_char = NIL;
                    if (nil_count.numG(ONE_INTEGER)) {
                        low_char = NIL;
                    }
                }
                return values(highest_char, high_char, low_char, lowest_char);
            }
        }
    }

    @LispMethod(comment = "Three bytes (2^8 * 2^8 * 2^8) turn into four 64-bit characters (2^6 + 2^6 + 2^6 + 2^6), since 8*3 = 6*4\r\nwith special handling for NILs\nThree bytes (2^8 * 2^8 * 2^8) turn into four 64-bit characters (2^6 + 2^6 + 2^6 + 2^6), since 8*3 = 6*4\nwith special handling for NILs")
    public static SubLObject bytes_to_64_bit_chars(final SubLObject high_byte, SubLObject middle_byte, SubLObject low_byte) {
        SubLObject nil_count = ZERO_INTEGER;
        if (NIL == low_byte) {
            low_byte = ZERO_INTEGER;
            nil_count = add(nil_count, ONE_INTEGER);
        }
        if (NIL == middle_byte) {
            middle_byte = ZERO_INTEGER;
            nil_count = add(nil_count, ONE_INTEGER);
        }
        final SubLObject aaaaaa = bytes.ldb(bytes.sublisp_byte(SIX_INTEGER, TWO_INTEGER), high_byte);
        final SubLObject bb = bytes.ldb(bytes.sublisp_byte(TWO_INTEGER, ZERO_INTEGER), high_byte);
        final SubLObject bbbb = bytes.ldb(bytes.sublisp_byte(FOUR_INTEGER, FOUR_INTEGER), middle_byte);
        final SubLObject cccc = bytes.ldb(bytes.sublisp_byte(FOUR_INTEGER, ZERO_INTEGER), middle_byte);
        final SubLObject cc = bytes.ldb(bytes.sublisp_byte(TWO_INTEGER, SIX_INTEGER), low_byte);
        final SubLObject dddddd = bytes.ldb(bytes.sublisp_byte(SIX_INTEGER, ZERO_INTEGER), low_byte);
        final SubLObject bbbbbb = add(ash(bb, FOUR_INTEGER), bbbb);
        final SubLObject cccccc = add(ash(cccc, TWO_INTEGER), cc);
        final SubLObject highest_char = string_utilities.f_64_bit_char(aaaaaa);
        final SubLObject high_char = string_utilities.f_64_bit_char(bbbbbb);
        SubLObject low_char = string_utilities.f_64_bit_char(cccccc);
        SubLObject lowest_char = string_utilities.f_64_bit_char(dddddd);
        if (nil_count.numG(ZERO_INTEGER)) {
            lowest_char = NIL;
            if (nil_count.numG(ONE_INTEGER)) {
                low_char = NIL;
            }
        }
        return values(highest_char, high_char, low_char, lowest_char);
    }

    /**
     * Four 64-bit characters turn into three bytes (6*4 = 8*3)
     * with special handling for NILs
     */
    @LispMethod(comment = "Four 64-bit characters turn into three bytes (6*4 = 8*3)\r\nwith special handling for NILs\nFour 64-bit characters turn into three bytes (6*4 = 8*3)\nwith special handling for NILs")
    public static final SubLObject f_64_bit_chars_to_bytes_alt(SubLObject highest_char, SubLObject high_char, SubLObject low_char, SubLObject lowest_char) {
        {
            SubLObject nil_count = ZERO_INTEGER;
            if ((NIL == lowest_char) || (NIL != charE(CHAR_equal, lowest_char))) {
                lowest_char = CHAR_A;
                nil_count = add(nil_count, ONE_INTEGER);
            }
            if ((NIL == low_char) || (NIL != charE(CHAR_equal, low_char))) {
                low_char = CHAR_A;
                nil_count = add(nil_count, ONE_INTEGER);
            }
            {
                SubLObject aaaaaa = f_64_bit_char_value(highest_char);
                SubLObject bbbbbb = f_64_bit_char_value(high_char);
                SubLObject cccccc = f_64_bit_char_value(low_char);
                SubLObject dddddd = f_64_bit_char_value(lowest_char);
                SubLObject bb = bytes.ldb(bytes.sublisp_byte(TWO_INTEGER, FOUR_INTEGER), bbbbbb);
                SubLObject bbbb = bytes.ldb(bytes.sublisp_byte(FOUR_INTEGER, ZERO_INTEGER), bbbbbb);
                SubLObject cccc = bytes.ldb(bytes.sublisp_byte(FOUR_INTEGER, TWO_INTEGER), cccccc);
                SubLObject cc = bytes.ldb(bytes.sublisp_byte(TWO_INTEGER, ZERO_INTEGER), cccccc);
                SubLObject high_byte = add(ash(aaaaaa, TWO_INTEGER), bb);
                SubLObject middle_byte = add(ash(bbbb, FOUR_INTEGER), cccc);
                SubLObject low_byte = add(ash(cc, SIX_INTEGER), dddddd);
                if (nil_count.numG(ZERO_INTEGER)) {
                    low_byte = NIL;
                    if (nil_count.numG(ONE_INTEGER)) {
                        middle_byte = NIL;
                    }
                }
                return values(high_byte, middle_byte, low_byte);
            }
        }
    }

    @LispMethod(comment = "Four 64-bit characters turn into three bytes (6*4 = 8*3)\r\nwith special handling for NILs\nFour 64-bit characters turn into three bytes (6*4 = 8*3)\nwith special handling for NILs")
    public static SubLObject f_64_bit_chars_to_bytes(final SubLObject highest_char, final SubLObject high_char, SubLObject low_char, SubLObject lowest_char) {
        SubLObject nil_count = ZERO_INTEGER;
        if ((NIL == lowest_char) || (NIL != charE(CHAR_equal, lowest_char))) {
            lowest_char = CHAR_A;
            nil_count = add(nil_count, ONE_INTEGER);
        }
        if ((NIL == low_char) || (NIL != charE(CHAR_equal, low_char))) {
            low_char = CHAR_A;
            nil_count = add(nil_count, ONE_INTEGER);
        }
        final SubLObject aaaaaa = string_utilities.f_64_bit_char_value(highest_char);
        final SubLObject bbbbbb = string_utilities.f_64_bit_char_value(high_char);
        final SubLObject cccccc = string_utilities.f_64_bit_char_value(low_char);
        final SubLObject dddddd = string_utilities.f_64_bit_char_value(lowest_char);
        final SubLObject bb = bytes.ldb(bytes.sublisp_byte(TWO_INTEGER, FOUR_INTEGER), bbbbbb);
        final SubLObject bbbb = bytes.ldb(bytes.sublisp_byte(FOUR_INTEGER, ZERO_INTEGER), bbbbbb);
        final SubLObject cccc = bytes.ldb(bytes.sublisp_byte(FOUR_INTEGER, TWO_INTEGER), cccccc);
        final SubLObject cc = bytes.ldb(bytes.sublisp_byte(TWO_INTEGER, ZERO_INTEGER), cccccc);
        final SubLObject high_byte = add(ash(aaaaaa, TWO_INTEGER), bb);
        SubLObject middle_byte = add(ash(bbbb, FOUR_INTEGER), cccc);
        SubLObject low_byte = add(ash(cc, SIX_INTEGER), dddddd);
        if (nil_count.numG(ZERO_INTEGER)) {
            low_byte = NIL;
            if (nil_count.numG(ONE_INTEGER)) {
                middle_byte = NIL;
            }
        }
        return values(high_byte, middle_byte, low_byte);
    }

    /**
     * Convert 64-BIT-STRING into a vector satisfying byte-vector-p
     */
    @LispMethod(comment = "Convert 64-BIT-STRING into a vector satisfying byte-vector-p")
    public static final SubLObject f_64_bit_char_string_to_byte_vector_alt(SubLObject v_64_bit_string) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            SubLTrampolineFile.checkType(v_64_bit_string, $sym12$64_BIT_STRING_P);
            {
                SubLObject string_length = length(v_64_bit_string);
                SubLObject tuples_length = com.cyc.cycjava.cycl.vector_utilities.f_64_bit_string_tuples_length(v_64_bit_string);
                SubLObject vector_length = com.cyc.cycjava.cycl.vector_utilities.f_64_bit_string_byte_vector_length(v_64_bit_string);
                SubLObject byte_vector = make_vector(vector_length, UNPROVIDED);
                SubLObject string_index = ZERO_INTEGER;
                SubLObject vector_index = ZERO_INTEGER;
                SubLObject highest_char = NIL;
                SubLObject high_char = NIL;
                SubLObject low_char = NIL;
                SubLObject lowest_char = NIL;
                SubLObject i = NIL;
                for (i = ZERO_INTEGER; i.numL(tuples_length); i = add(i, ONE_INTEGER)) {
                    highest_char = Strings.sublisp_char(v_64_bit_string, string_index);
                    string_index = add(string_index, ONE_INTEGER);
                    high_char = Strings.sublisp_char(v_64_bit_string, string_index);
                    string_index = add(string_index, ONE_INTEGER);
                    low_char = (string_index.numL(string_length)) ? ((SubLObject) (Strings.sublisp_char(v_64_bit_string, string_index))) : NIL;
                    string_index = add(string_index, ONE_INTEGER);
                    lowest_char = (string_index.numL(string_length)) ? ((SubLObject) (Strings.sublisp_char(v_64_bit_string, string_index))) : NIL;
                    string_index = add(string_index, ONE_INTEGER);
                    thread.resetMultipleValues();
                    {
                        SubLObject high_byte = com.cyc.cycjava.cycl.vector_utilities.f_64_bit_chars_to_bytes(highest_char, high_char, low_char, lowest_char);
                        SubLObject middle_byte = thread.secondMultipleValue();
                        SubLObject low_byte = thread.thirdMultipleValue();
                        thread.resetMultipleValues();
                        set_aref(byte_vector, vector_index, high_byte);
                        vector_index = add(vector_index, ONE_INTEGER);
                        if (NIL != middle_byte) {
                            set_aref(byte_vector, vector_index, middle_byte);
                            vector_index = add(vector_index, ONE_INTEGER);
                        }
                        if (NIL != low_byte) {
                            set_aref(byte_vector, vector_index, low_byte);
                            vector_index = add(vector_index, ONE_INTEGER);
                        }
                    }
                }
                return byte_vector;
            }
        }
    }

    @LispMethod(comment = "Convert 64-BIT-STRING into a vector satisfying byte-vector-p")
    public static SubLObject f_64_bit_char_string_to_byte_vector(final SubLObject v_64_bit_string) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != string_utilities.f_64_bit_string_p(v_64_bit_string) : "! string_utilities.f_64_bit_string_p(v_64_bit_string) " + ("string_utilities.f_64_bit_string_p(v_64_bit_string) " + "CommonSymbols.NIL != string_utilities.f_64_bit_string_p(v_64_bit_string) ") + v_64_bit_string;
        final SubLObject string_length = length(v_64_bit_string);
        final SubLObject tuples_length = f_64_bit_string_tuples_length(v_64_bit_string);
        final SubLObject vector_length = f_64_bit_string_byte_vector_length(v_64_bit_string);
        final SubLObject byte_vector = make_vector(vector_length, UNPROVIDED);
        SubLObject string_index = ZERO_INTEGER;
        SubLObject vector_index = ZERO_INTEGER;
        SubLObject highest_char = NIL;
        SubLObject high_char = NIL;
        SubLObject low_char = NIL;
        SubLObject lowest_char = NIL;
        SubLObject i;
        SubLObject high_byte;
        SubLObject middle_byte;
        SubLObject low_byte;
        for (i = NIL, i = ZERO_INTEGER; i.numL(tuples_length); i = add(i, ONE_INTEGER)) {
            highest_char = Strings.sublisp_char(v_64_bit_string, string_index);
            string_index = add(string_index, ONE_INTEGER);
            high_char = Strings.sublisp_char(v_64_bit_string, string_index);
            string_index = add(string_index, ONE_INTEGER);
            low_char = (string_index.numL(string_length)) ? Strings.sublisp_char(v_64_bit_string, string_index) : NIL;
            string_index = add(string_index, ONE_INTEGER);
            lowest_char = (string_index.numL(string_length)) ? Strings.sublisp_char(v_64_bit_string, string_index) : NIL;
            string_index = add(string_index, ONE_INTEGER);
            thread.resetMultipleValues();
            high_byte = f_64_bit_chars_to_bytes(highest_char, high_char, low_char, lowest_char);
            middle_byte = thread.secondMultipleValue();
            low_byte = thread.thirdMultipleValue();
            thread.resetMultipleValues();
            set_aref(byte_vector, vector_index, high_byte);
            vector_index = add(vector_index, ONE_INTEGER);
            if (NIL != middle_byte) {
                set_aref(byte_vector, vector_index, middle_byte);
                vector_index = add(vector_index, ONE_INTEGER);
            }
            if (NIL != low_byte) {
                set_aref(byte_vector, vector_index, low_byte);
                vector_index = add(vector_index, ONE_INTEGER);
            }
        }
        return byte_vector;
    }

    public static final SubLObject f_64_bit_string_tuples_length_alt(SubLObject v_64_bit_string) {
        SubLTrampolineFile.checkType(v_64_bit_string, STRINGP);
        {
            SubLObject string_length = length(v_64_bit_string);
            return ceiling(string_length, FOUR_INTEGER);
        }
    }

    public static SubLObject f_64_bit_string_tuples_length(final SubLObject v_64_bit_string) {
        assert NIL != stringp(v_64_bit_string) : "! stringp(v_64_bit_string) " + ("Types.stringp(v_64_bit_string) " + "CommonSymbols.NIL != Types.stringp(v_64_bit_string) ") + v_64_bit_string;
        final SubLObject string_length = length(v_64_bit_string);
        return ceiling(string_length, FOUR_INTEGER);
    }

    public static final SubLObject f_64_bit_string_byte_vector_length_alt(SubLObject v_64_bit_string) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            SubLTrampolineFile.checkType(v_64_bit_string, STRINGP);
            {
                SubLObject string_length = length(v_64_bit_string);
                if (string_length.isZero()) {
                    return ZERO_INTEGER;
                }
                thread.resetMultipleValues();
                {
                    SubLObject tuples_length = com.cyc.cycjava.cycl.vector_utilities.f_64_bit_string_tuples_length(v_64_bit_string);
                    SubLObject excess = thread.secondMultipleValue();
                    thread.resetMultipleValues();
                    {
                        SubLObject vector_length = multiply(THREE_INTEGER, number_utilities.f_1_(tuples_length));
                        if (!excess.isZero()) {
                            vector_length = add(vector_length, add(excess, THREE_INTEGER));
                        } else {
                            if (NIL == charE(CHAR_equal, Strings.sublisp_char(v_64_bit_string, subtract(string_length, ONE_INTEGER)))) {
                                vector_length = add(vector_length, THREE_INTEGER);
                            } else {
                                if (NIL == charE(CHAR_equal, Strings.sublisp_char(v_64_bit_string, subtract(string_length, TWO_INTEGER)))) {
                                    vector_length = add(vector_length, TWO_INTEGER);
                                } else {
                                    vector_length = add(vector_length, ONE_INTEGER);
                                }
                            }
                        }
                        return vector_length;
                    }
                }
            }
        }
    }

    public static SubLObject f_64_bit_string_byte_vector_length(final SubLObject v_64_bit_string) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != stringp(v_64_bit_string) : "! stringp(v_64_bit_string) " + ("Types.stringp(v_64_bit_string) " + "CommonSymbols.NIL != Types.stringp(v_64_bit_string) ") + v_64_bit_string;
        final SubLObject string_length = length(v_64_bit_string);
        if (string_length.isZero()) {
            return ZERO_INTEGER;
        }
        thread.resetMultipleValues();
        final SubLObject tuples_length = f_64_bit_string_tuples_length(v_64_bit_string);
        final SubLObject excess = thread.secondMultipleValue();
        thread.resetMultipleValues();
        SubLObject vector_length = multiply(THREE_INTEGER, number_utilities.f_1_(tuples_length));
        if (!excess.isZero()) {
            vector_length = add(vector_length, add(excess, THREE_INTEGER));
        } else
            if (NIL == charE(CHAR_equal, Strings.sublisp_char(v_64_bit_string, subtract(string_length, ONE_INTEGER)))) {
                vector_length = add(vector_length, THREE_INTEGER);
            } else
                if (NIL == charE(CHAR_equal, Strings.sublisp_char(v_64_bit_string, subtract(string_length, TWO_INTEGER)))) {
                    vector_length = add(vector_length, TWO_INTEGER);
                } else {
                    vector_length = add(vector_length, ONE_INTEGER);
                }


        return vector_length;
    }

    public static SubLObject binary_search_vector_subrange_wXduplicates(final SubLObject item, final SubLObject vector, final SubLObject start, final SubLObject end, final SubLObject compare, SubLObject test, SubLObject key, SubLObject deleted_test) {
        if (test == UNPROVIDED) {
            test = symbol_function(EQL);
        }
        if (key == UNPROVIDED) {
            key = symbol_function(IDENTITY);
        }
        if (deleted_test == UNPROVIDED) {
            deleted_test = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        thread.resetMultipleValues();
        SubLObject low = binary_search_vector_subrange(item, vector, start, end, compare, test, key, deleted_test);
        SubLObject high = thread.secondMultipleValue();
        thread.resetMultipleValues();
        if (low.numE(high)) {
            final SubLObject exemplar = funcall(key, aref(vector, low));
            for (SubLObject doneP = makeBoolean(!low.isPositive()); NIL == doneP; doneP = makeBoolean((NIL != doneP) || (!low.isPositive()))) {
                final SubLObject lower = subtract(low, ONE_INTEGER);
                final SubLObject candidate = funcall(key, aref(vector, lower));
                if (NIL != funcall(test, exemplar, candidate)) {
                    low = lower;
                } else {
                    doneP = T;
                }
            }
            for (SubLObject last = subtract(end, ONE_INTEGER), doneP = makeBoolean(!high.numL(last)); NIL == doneP; doneP = makeBoolean((NIL != doneP) || (!high.numL(last)))) {
                final SubLObject higher = add(high, ONE_INTEGER);
                final SubLObject candidate2 = funcall(key, aref(vector, higher));
                if (NIL != funcall(test, exemplar, candidate2)) {
                    high = higher;
                } else {
                    doneP = T;
                }
            }
            return values(low, high, T);
        }
        if (low.numE(end)) {
            return values(low, high, NIL);
        }
        final SubLObject low_elt = funcall(key, aref(vector, low));
        if (NIL != funcall(compare, item, low_elt)) {
            return values(subtract(low, ONE_INTEGER), subtract(high, ONE_INTEGER), NIL);
        }
        return values(low, high, NIL);
    }

    public static SubLObject test_binary_search_vector_subrange_wXduplicate_structures(final SubLObject item, final SubLObject vector, final SubLObject start, final SubLObject end, final SubLObject compare, final SubLObject key) {
        return arg2(resetMultipleValues(), multiple_value_list(binary_search_vector_subrange_wXduplicates(item, vector, start, end, compare, EQL, key, UNPROVIDED)));
    }

    public static SubLObject test_binary_search_vector_subrange_wXduplicates(final SubLObject item, final SubLObject vector, final SubLObject start, final SubLObject end, final SubLObject compare) {
        return arg2(resetMultipleValues(), multiple_value_list(binary_search_vector_subrange_wXduplicates(item, vector, start, end, compare, UNPROVIDED, UNPROVIDED, UNPROVIDED)));
    }

    public static SubLObject binary_search_vector_subrange(final SubLObject item, final SubLObject vector, final SubLObject start, final SubLObject end, final SubLObject compare, SubLObject test, SubLObject key, SubLObject deleted_test) {
        if (test == UNPROVIDED) {
            test = symbol_function(EQL);
        }
        if (key == UNPROVIDED) {
            key = symbol_function(IDENTITY);
        }
        if (deleted_test == UNPROVIDED) {
            deleted_test = NIL;
        }
        return binary_search_vector_int(item, vector, start, end, compare, test, key, deleted_test);
    }

    /**
     * Return two values, the indices bracketing where ITEM should be in VECTOR.
     * If the values are equal, ITEM is at that position.
     */
    @LispMethod(comment = "Return two values, the indices bracketing where ITEM should be in VECTOR.\r\nIf the values are equal, ITEM is at that position.\nReturn two values, the indices bracketing where ITEM should be in VECTOR.\nIf the values are equal, ITEM is at that position.")
    public static final SubLObject binary_search_vector_range_alt(SubLObject item, SubLObject vector, SubLObject compare, SubLObject test, SubLObject key, SubLObject deleted_test) {
        if (test == UNPROVIDED) {
            test = symbol_function(EQL);
        }
        if (key == UNPROVIDED) {
            key = symbol_function(IDENTITY);
        }
        if (deleted_test == UNPROVIDED) {
            deleted_test = NIL;
        }
        return com.cyc.cycjava.cycl.vector_utilities.binary_search_vector_int(item, vector, ZERO_INTEGER, length(vector), compare, test, key, deleted_test);
    }

    /**
     * Return two values, the indices bracketing where ITEM should be in VECTOR.
     * If the values are equal, ITEM is at that position.
     */
    @LispMethod(comment = "Return two values, the indices bracketing where ITEM should be in VECTOR.\r\nIf the values are equal, ITEM is at that position.\nReturn two values, the indices bracketing where ITEM should be in VECTOR.\nIf the values are equal, ITEM is at that position.")
    public static SubLObject binary_search_vector_range(final SubLObject item, final SubLObject vector, final SubLObject compare, SubLObject test, SubLObject key, SubLObject deleted_test) {
        if (test == UNPROVIDED) {
            test = symbol_function(EQL);
        }
        if (key == UNPROVIDED) {
            key = symbol_function(IDENTITY);
        }
        if (deleted_test == UNPROVIDED) {
            deleted_test = NIL;
        }
        return binary_search_vector_int(item, vector, ZERO_INTEGER, length(vector), compare, test, key, deleted_test);
    }

    /**
     * Return position of ITEM in VECTOR, or NIL if not present.
     */
    @LispMethod(comment = "Return position of ITEM in VECTOR, or NIL if not present.")
    public static final SubLObject binary_search_vector_alt(SubLObject item, SubLObject vector, SubLObject compare, SubLObject test, SubLObject key, SubLObject deleted_test) {
        if (test == UNPROVIDED) {
            test = symbol_function(EQL);
        }
        if (key == UNPROVIDED) {
            key = symbol_function(IDENTITY);
        }
        if (deleted_test == UNPROVIDED) {
            deleted_test = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            thread.resetMultipleValues();
            {
                SubLObject low = com.cyc.cycjava.cycl.vector_utilities.binary_search_vector_int(item, vector, ZERO_INTEGER, length(vector), compare, test, key, deleted_test);
                SubLObject high = thread.secondMultipleValue();
                thread.resetMultipleValues();
                if (low.numE(high)) {
                    return low;
                } else {
                    return NIL;
                }
            }
        }
    }

    /**
     * Return position of ITEM in VECTOR, or NIL if not present.
     */
    @LispMethod(comment = "Return position of ITEM in VECTOR, or NIL if not present.")
    public static SubLObject binary_search_vector(final SubLObject item, final SubLObject vector, final SubLObject compare, SubLObject test, SubLObject key, SubLObject deleted_test) {
        if (test == UNPROVIDED) {
            test = symbol_function(EQL);
        }
        if (key == UNPROVIDED) {
            key = symbol_function(IDENTITY);
        }
        if (deleted_test == UNPROVIDED) {
            deleted_test = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        thread.resetMultipleValues();
        final SubLObject low = binary_search_vector_int(item, vector, ZERO_INTEGER, length(vector), compare, test, key, deleted_test);
        final SubLObject high = thread.secondMultipleValue();
        thread.resetMultipleValues();
        if (low.numE(high)) {
            return low;
        }
        return NIL;
    }

    public static final SubLObject binary_search_vector_int_alt(SubLObject item, SubLObject vector, SubLObject start, SubLObject end, SubLObject compare, SubLObject test, SubLObject key, SubLObject deleted_test) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            while (true) {
                if (start.numE(end)) {
                    return values(start, add(end, ONE_INTEGER));
                } else {
                    if (start.numL(end)) {
                        {
                            SubLObject mid = integerDivide(add(start, end), TWO_INTEGER);
                            SubLObject elt = aref(vector, mid);
                            if ((NIL == deleted_test) || (NIL == funcall(deleted_test, elt))) {
                                {
                                    SubLObject value = funcall(key, elt);
                                    if (NIL != funcall(test, item, value)) {
                                        return values(mid, mid);
                                    } else {
                                        if (NIL != funcall(compare, item, value)) {
                                            end = mid;
                                        } else {
                                            start = add(mid, ONE_INTEGER);
                                        }
                                    }
                                }
                            } else {
                                thread.resetMultipleValues();
                                {
                                    SubLObject low = com.cyc.cycjava.cycl.vector_utilities.binary_search_vector_int(item, vector, start, mid, compare, test, key, deleted_test);
                                    SubLObject high = thread.secondMultipleValue();
                                    thread.resetMultipleValues();
                                    if (low.numE(high)) {
                                        return values(low, high);
                                    }
                                }
                                return com.cyc.cycjava.cycl.vector_utilities.binary_search_vector_int(item, vector, add(mid, ONE_INTEGER), end, compare, test, key, deleted_test);
                            }
                        }
                    } else {
                        return values(end, start);
                    }
                }
            } 
        }
    }

    public static SubLObject binary_search_vector_int(final SubLObject item, final SubLObject vector, SubLObject start, SubLObject end, final SubLObject compare, final SubLObject test, final SubLObject key, final SubLObject deleted_test) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        while (!start.numE(end)) {
            if (!start.numL(end)) {
                return values(end, start);
            }
            final SubLObject mid = integerDivide(add(start, end), TWO_INTEGER);
            final SubLObject elt = aref(vector, mid);
            if ((NIL == deleted_test) || (NIL == funcall(deleted_test, elt))) {
                final SubLObject value = funcall(key, elt);
                if (NIL != funcall(test, item, value)) {
                    return values(mid, mid);
                }
                if (NIL != funcall(compare, item, value)) {
                    end = mid;
                } else {
                    start = add(mid, ONE_INTEGER);
                }
            } else {
                thread.resetMultipleValues();
                final SubLObject low = binary_search_vector_int(item, vector, start, mid, compare, test, key, deleted_test);
                final SubLObject high = thread.secondMultipleValue();
                thread.resetMultipleValues();
                if (low.numE(high)) {
                    return values(low, high);
                }
                return binary_search_vector_int(item, vector, add(mid, ONE_INTEGER), end, compare, test, key, deleted_test);
            }
        } 
        return values(start, add(end, ONE_INTEGER));
    }

    public static final SubLObject test_bytes_to_64_bit_chars_once_alt(SubLObject high_byte, SubLObject middle_byte, SubLObject low_byte) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            thread.resetMultipleValues();
            {
                SubLObject highest_char = com.cyc.cycjava.cycl.vector_utilities.bytes_to_64_bit_chars(high_byte, middle_byte, low_byte);
                SubLObject high_char = thread.secondMultipleValue();
                SubLObject low_char = thread.thirdMultipleValue();
                SubLObject lowest_char = thread.fourthMultipleValue();
                thread.resetMultipleValues();
                thread.resetMultipleValues();
                {
                    SubLObject new_high_byte = com.cyc.cycjava.cycl.vector_utilities.f_64_bit_chars_to_bytes(highest_char, high_char, low_char, lowest_char);
                    SubLObject new_middle_byte = thread.secondMultipleValue();
                    SubLObject new_low_byte = thread.thirdMultipleValue();
                    thread.resetMultipleValues();
                    if (((high_byte == new_high_byte) && (middle_byte == new_middle_byte)) && (low_byte == new_low_byte)) {
                        return T;
                    }
                    return Errors.error($str_alt24$Failure_on__S__S__S, high_byte, middle_byte, low_byte);
                }
            }
        }
    }

    public static SubLObject test_bytes_to_64_bit_chars_once(final SubLObject high_byte, final SubLObject middle_byte, final SubLObject low_byte) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        thread.resetMultipleValues();
        final SubLObject highest_char = bytes_to_64_bit_chars(high_byte, middle_byte, low_byte);
        final SubLObject high_char = thread.secondMultipleValue();
        final SubLObject low_char = thread.thirdMultipleValue();
        final SubLObject lowest_char = thread.fourthMultipleValue();
        thread.resetMultipleValues();
        thread.resetMultipleValues();
        final SubLObject new_high_byte = f_64_bit_chars_to_bytes(highest_char, high_char, low_char, lowest_char);
        final SubLObject new_middle_byte = thread.secondMultipleValue();
        final SubLObject new_low_byte = thread.thirdMultipleValue();
        thread.resetMultipleValues();
        if ((high_byte.eql(new_high_byte) && middle_byte.eql(new_middle_byte)) && low_byte.eql(new_low_byte)) {
            return T;
        }
        return Errors.error($str35$Failure_on__S__S__S, high_byte, middle_byte, low_byte);
    }

    public static final SubLObject test_64_bit_chars_to_bytes_once_alt(SubLObject highest_char, SubLObject high_char, SubLObject low_char, SubLObject lowest_char) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            thread.resetMultipleValues();
            {
                SubLObject high_byte = com.cyc.cycjava.cycl.vector_utilities.f_64_bit_chars_to_bytes(highest_char, high_char, low_char, lowest_char);
                SubLObject middle_byte = thread.secondMultipleValue();
                SubLObject low_byte = thread.thirdMultipleValue();
                thread.resetMultipleValues();
                thread.resetMultipleValues();
                {
                    SubLObject new_highest_char = com.cyc.cycjava.cycl.vector_utilities.bytes_to_64_bit_chars(high_byte, middle_byte, low_byte);
                    SubLObject new_high_char = thread.secondMultipleValue();
                    SubLObject new_low_char = thread.thirdMultipleValue();
                    SubLObject new_lowest_char = thread.fourthMultipleValue();
                    thread.resetMultipleValues();
                    if ((((NIL != charE(highest_char, new_highest_char)) && (NIL != charE(high_char, new_high_char))) && (NIL != charE(low_char, new_low_char))) && (NIL != charE(lowest_char, new_lowest_char))) {
                        return T;
                    }
                    return Errors.error($str_alt25$Failure_on__S__S__S__S, new SubLObject[]{ highest_char, high_char, low_char, lowest_char });
                }
            }
        }
    }

    public static SubLObject test_64_bit_chars_to_bytes_once(final SubLObject highest_char, final SubLObject high_char, final SubLObject low_char, final SubLObject lowest_char) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        thread.resetMultipleValues();
        final SubLObject high_byte = f_64_bit_chars_to_bytes(highest_char, high_char, low_char, lowest_char);
        final SubLObject middle_byte = thread.secondMultipleValue();
        final SubLObject low_byte = thread.thirdMultipleValue();
        thread.resetMultipleValues();
        thread.resetMultipleValues();
        final SubLObject new_highest_char = bytes_to_64_bit_chars(high_byte, middle_byte, low_byte);
        final SubLObject new_high_char = thread.secondMultipleValue();
        final SubLObject new_low_char = thread.thirdMultipleValue();
        final SubLObject new_lowest_char = thread.fourthMultipleValue();
        thread.resetMultipleValues();
        if ((((NIL != charE(highest_char, new_highest_char)) && (NIL != charE(high_char, new_high_char))) && (NIL != charE(low_char, new_low_char))) && (NIL != charE(lowest_char, new_lowest_char))) {
            return T;
        }
        return Errors.error($str36$Failure_on__S__S__S__S, new SubLObject[]{ highest_char, high_char, low_char, lowest_char });
    }

    public static final SubLObject test_bytes_to_64_bit_chars_alt(SubLObject n) {
        if (n == UNPROVIDED) {
            n = $int$100000;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            $progress_note$.setDynamicValue($$$cdotimes, thread);
            $progress_start_time$.setDynamicValue(get_universal_time(), thread);
            $progress_total$.setDynamicValue(n, thread);
            $progress_sofar$.setDynamicValue(ZERO_INTEGER, thread);
            {
                SubLObject _prev_bind_0 = $last_percent_progress_index$.currentBinding(thread);
                SubLObject _prev_bind_1 = $last_percent_progress_prediction$.currentBinding(thread);
                SubLObject _prev_bind_2 = $within_noting_percent_progress$.currentBinding(thread);
                SubLObject _prev_bind_3 = $percent_progress_start_time$.currentBinding(thread);
                try {
                    $last_percent_progress_index$.bind(ZERO_INTEGER, thread);
                    $last_percent_progress_prediction$.bind(NIL, thread);
                    $within_noting_percent_progress$.bind(T, thread);
                    $percent_progress_start_time$.bind(get_universal_time(), thread);
                    noting_percent_progress_preamble($progress_note$.getDynamicValue(thread));
                    {
                        SubLObject i = NIL;
                        for (i = ZERO_INTEGER; i.numL($progress_total$.getDynamicValue(thread)); i = add(i, ONE_INTEGER)) {
                            note_percent_progress($progress_sofar$.getDynamicValue(thread), $progress_total$.getDynamicValue(thread));
                            $progress_sofar$.setDynamicValue(add($progress_sofar$.getDynamicValue(thread), ONE_INTEGER), thread);
                            {
                                SubLObject nil_count = random.random(THREE_INTEGER);
                                SubLObject high_byte = random.random($int$256);
                                SubLObject middle_byte = (nil_count.numG(ONE_INTEGER)) ? ((SubLObject) (NIL)) : random.random($int$256);
                                SubLObject low_byte = (nil_count.numG(ZERO_INTEGER)) ? ((SubLObject) (NIL)) : random.random($int$256);
                                com.cyc.cycjava.cycl.vector_utilities.test_bytes_to_64_bit_chars_once(high_byte, middle_byte, low_byte);
                            }
                        }
                    }
                    noting_percent_progress_postamble();
                } finally {
                    $percent_progress_start_time$.rebind(_prev_bind_3, thread);
                    $within_noting_percent_progress$.rebind(_prev_bind_2, thread);
                    $last_percent_progress_prediction$.rebind(_prev_bind_1, thread);
                    $last_percent_progress_index$.rebind(_prev_bind_0, thread);
                }
            }
            return T;
        }
    }

    public static SubLObject test_bytes_to_64_bit_chars(SubLObject n) {
        if (n == UNPROVIDED) {
            n = $int$100000;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject _prev_bind_0 = $progress_note$.currentBinding(thread);
        final SubLObject _prev_bind_2 = $progress_start_time$.currentBinding(thread);
        final SubLObject _prev_bind_3 = $progress_total$.currentBinding(thread);
        final SubLObject _prev_bind_4 = $progress_sofar$.currentBinding(thread);
        final SubLObject _prev_bind_5 = $last_percent_progress_index$.currentBinding(thread);
        final SubLObject _prev_bind_6 = $last_percent_progress_prediction$.currentBinding(thread);
        final SubLObject _prev_bind_7 = $within_noting_percent_progress$.currentBinding(thread);
        final SubLObject _prev_bind_8 = $percent_progress_start_time$.currentBinding(thread);
        try {
            $progress_note$.bind($$$cdotimes, thread);
            $progress_start_time$.bind(get_universal_time(), thread);
            $progress_total$.bind(n, thread);
            $progress_sofar$.bind(ZERO_INTEGER, thread);
            $last_percent_progress_index$.bind(ZERO_INTEGER, thread);
            $last_percent_progress_prediction$.bind(NIL, thread);
            $within_noting_percent_progress$.bind(T, thread);
            $percent_progress_start_time$.bind(get_universal_time(), thread);
            try {
                noting_percent_progress_preamble($progress_note$.getDynamicValue(thread));
                SubLObject i;
                SubLObject nil_count;
                SubLObject high_byte;
                SubLObject middle_byte;
                SubLObject low_byte;
                for (i = NIL, i = ZERO_INTEGER; i.numL($progress_total$.getDynamicValue(thread)); i = add(i, ONE_INTEGER)) {
                    nil_count = random.random(THREE_INTEGER);
                    high_byte = random.random($int$256);
                    middle_byte = (nil_count.numG(ONE_INTEGER)) ? NIL : random.random($int$256);
                    low_byte = (nil_count.numG(ZERO_INTEGER)) ? NIL : random.random($int$256);
                    test_bytes_to_64_bit_chars_once(high_byte, middle_byte, low_byte);
                    $progress_sofar$.setDynamicValue(add($progress_sofar$.getDynamicValue(thread), ONE_INTEGER), thread);
                    note_percent_progress($progress_sofar$.getDynamicValue(thread), $progress_total$.getDynamicValue(thread));
                }
            } finally {
                final SubLObject _prev_bind_0_$18 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    noting_percent_progress_postamble();
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$18, thread);
                }
            }
        } finally {
            $percent_progress_start_time$.rebind(_prev_bind_8, thread);
            $within_noting_percent_progress$.rebind(_prev_bind_7, thread);
            $last_percent_progress_prediction$.rebind(_prev_bind_6, thread);
            $last_percent_progress_index$.rebind(_prev_bind_5, thread);
            $progress_sofar$.rebind(_prev_bind_4, thread);
            $progress_total$.rebind(_prev_bind_3, thread);
            $progress_start_time$.rebind(_prev_bind_2, thread);
            $progress_note$.rebind(_prev_bind_0, thread);
        }
        return T;
    }

    public static final SubLObject test_64_bit_chars_to_bytes_alt(SubLObject n) {
        if (n == UNPROVIDED) {
            n = $int$100000;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            $progress_note$.setDynamicValue($$$cdotimes, thread);
            $progress_start_time$.setDynamicValue(get_universal_time(), thread);
            $progress_total$.setDynamicValue(n, thread);
            $progress_sofar$.setDynamicValue(ZERO_INTEGER, thread);
            {
                SubLObject _prev_bind_0 = $last_percent_progress_index$.currentBinding(thread);
                SubLObject _prev_bind_1 = $last_percent_progress_prediction$.currentBinding(thread);
                SubLObject _prev_bind_2 = $within_noting_percent_progress$.currentBinding(thread);
                SubLObject _prev_bind_3 = $percent_progress_start_time$.currentBinding(thread);
                try {
                    $last_percent_progress_index$.bind(ZERO_INTEGER, thread);
                    $last_percent_progress_prediction$.bind(NIL, thread);
                    $within_noting_percent_progress$.bind(T, thread);
                    $percent_progress_start_time$.bind(get_universal_time(), thread);
                    noting_percent_progress_preamble($progress_note$.getDynamicValue(thread));
                    {
                        SubLObject i = NIL;
                        for (i = ZERO_INTEGER; i.numL($progress_total$.getDynamicValue(thread)); i = add(i, ONE_INTEGER)) {
                            note_percent_progress($progress_sofar$.getDynamicValue(thread), $progress_total$.getDynamicValue(thread));
                            $progress_sofar$.setDynamicValue(add($progress_sofar$.getDynamicValue(thread), ONE_INTEGER), thread);
                            {
                                SubLObject nil_count = random.random(THREE_INTEGER);
                                SubLObject high_byte = random.random($int$256);
                                SubLObject middle_byte = (nil_count.numG(ONE_INTEGER)) ? ((SubLObject) (NIL)) : random.random($int$256);
                                SubLObject low_byte = (nil_count.numG(ZERO_INTEGER)) ? ((SubLObject) (NIL)) : random.random($int$256);
                                thread.resetMultipleValues();
                                {
                                    SubLObject highest_char = com.cyc.cycjava.cycl.vector_utilities.bytes_to_64_bit_chars(high_byte, middle_byte, low_byte);
                                    SubLObject high_char = thread.secondMultipleValue();
                                    SubLObject low_char = thread.thirdMultipleValue();
                                    SubLObject lowest_char = thread.fourthMultipleValue();
                                    thread.resetMultipleValues();
                                    com.cyc.cycjava.cycl.vector_utilities.test_64_bit_chars_to_bytes_once(highest_char, high_char, low_char, lowest_char);
                                }
                            }
                        }
                    }
                    noting_percent_progress_postamble();
                } finally {
                    $percent_progress_start_time$.rebind(_prev_bind_3, thread);
                    $within_noting_percent_progress$.rebind(_prev_bind_2, thread);
                    $last_percent_progress_prediction$.rebind(_prev_bind_1, thread);
                    $last_percent_progress_index$.rebind(_prev_bind_0, thread);
                }
            }
            return T;
        }
    }

    public static SubLObject test_64_bit_chars_to_bytes(SubLObject n) {
        if (n == UNPROVIDED) {
            n = $int$100000;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject _prev_bind_0 = $progress_note$.currentBinding(thread);
        final SubLObject _prev_bind_2 = $progress_start_time$.currentBinding(thread);
        final SubLObject _prev_bind_3 = $progress_total$.currentBinding(thread);
        final SubLObject _prev_bind_4 = $progress_sofar$.currentBinding(thread);
        final SubLObject _prev_bind_5 = $last_percent_progress_index$.currentBinding(thread);
        final SubLObject _prev_bind_6 = $last_percent_progress_prediction$.currentBinding(thread);
        final SubLObject _prev_bind_7 = $within_noting_percent_progress$.currentBinding(thread);
        final SubLObject _prev_bind_8 = $percent_progress_start_time$.currentBinding(thread);
        try {
            $progress_note$.bind($$$cdotimes, thread);
            $progress_start_time$.bind(get_universal_time(), thread);
            $progress_total$.bind(n, thread);
            $progress_sofar$.bind(ZERO_INTEGER, thread);
            $last_percent_progress_index$.bind(ZERO_INTEGER, thread);
            $last_percent_progress_prediction$.bind(NIL, thread);
            $within_noting_percent_progress$.bind(T, thread);
            $percent_progress_start_time$.bind(get_universal_time(), thread);
            try {
                noting_percent_progress_preamble($progress_note$.getDynamicValue(thread));
                SubLObject i;
                SubLObject nil_count;
                SubLObject high_byte;
                SubLObject middle_byte;
                SubLObject low_byte;
                SubLObject highest_char;
                SubLObject high_char;
                SubLObject low_char;
                SubLObject lowest_char;
                for (i = NIL, i = ZERO_INTEGER; i.numL($progress_total$.getDynamicValue(thread)); i = add(i, ONE_INTEGER)) {
                    nil_count = random.random(THREE_INTEGER);
                    high_byte = random.random($int$256);
                    middle_byte = (nil_count.numG(ONE_INTEGER)) ? NIL : random.random($int$256);
                    low_byte = (nil_count.numG(ZERO_INTEGER)) ? NIL : random.random($int$256);
                    thread.resetMultipleValues();
                    highest_char = bytes_to_64_bit_chars(high_byte, middle_byte, low_byte);
                    high_char = thread.secondMultipleValue();
                    low_char = thread.thirdMultipleValue();
                    lowest_char = thread.fourthMultipleValue();
                    thread.resetMultipleValues();
                    test_64_bit_chars_to_bytes_once(highest_char, high_char, low_char, lowest_char);
                    $progress_sofar$.setDynamicValue(add($progress_sofar$.getDynamicValue(thread), ONE_INTEGER), thread);
                    note_percent_progress($progress_sofar$.getDynamicValue(thread), $progress_total$.getDynamicValue(thread));
                }
            } finally {
                final SubLObject _prev_bind_0_$19 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    noting_percent_progress_postamble();
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$19, thread);
                }
            }
        } finally {
            $percent_progress_start_time$.rebind(_prev_bind_8, thread);
            $within_noting_percent_progress$.rebind(_prev_bind_7, thread);
            $last_percent_progress_prediction$.rebind(_prev_bind_6, thread);
            $last_percent_progress_index$.rebind(_prev_bind_5, thread);
            $progress_sofar$.rebind(_prev_bind_4, thread);
            $progress_total$.rebind(_prev_bind_3, thread);
            $progress_start_time$.rebind(_prev_bind_2, thread);
            $progress_note$.rebind(_prev_bind_0, thread);
        }
        return T;
    }

    static private final SubLList $list_alt3 = list(makeSymbol("RESET-VECTOR"));

    static private final SubLString $str_alt6$Unable_to_open__S = makeString("Unable to open ~S");

    static private final SubLString $str_alt9$Did_not_fill_up_all_the_expected_ = makeString("Did not fill up all the expected characters of the hex string: ~s != ~s~%");

    static private final SubLSymbol $sym12$64_BIT_STRING_P = makeSymbol("64-BIT-STRING-P");

    static private final SubLSymbol $sym13$64_BIT_STRING_TUPLES_LENGTH = makeSymbol("64-BIT-STRING-TUPLES-LENGTH");

    static private final SubLString $$$goolsbey = makeString("goolsbey");

    static private final SubLList $list_alt21 = list(list(list(makeString("")), ZERO_INTEGER), list(list(makeString("AA")), ONE_INTEGER), list(list(makeString("AAA")), ONE_INTEGER), list(list(makeString("AA==")), ONE_INTEGER), list(list(makeString("AAA=")), ONE_INTEGER), list(list(makeString("AAAA")), ONE_INTEGER), list(list(makeString("AAAAAA")), TWO_INTEGER), list(list(makeString("AAAAAA==")), TWO_INTEGER));

    public static SubLObject declare_vector_utilities_file() {
        declareFunction("vector_elements", "VECTOR-ELEMENTS", 1, 1, false);
        declareFunction("list_to_vector", "LIST-TO-VECTOR", 1, 0, false);
        declareFunction("copy_vector", "COPY-VECTOR", 1, 0, false);
        declareFunction("first_aref", "FIRST-AREF", 1, 0, false);
        declareFunction("last_aref", "LAST-AREF", 1, 0, false);
        declareFunction("num_vector", "NUM-VECTOR", 1, 0, false);
        declareFunction("extend_vector", "EXTEND-VECTOR", 2, 1, false);
        declareFunction("extend_vector_to", "EXTEND-VECTOR-TO", 2, 1, false);
        declareFunction("grow_vector", "GROW-VECTOR", 1, 2, false);
        declareFunction("reset_vector", "RESET-VECTOR", 1, 1, false);
        declareFunction("clear_vector", "CLEAR-VECTOR", 1, 1, false);
        declareFunction("percolate_vector", "PERCOLATE-VECTOR", 2, 0, false);
        declareFunction("vector_nreplace_subsequence", "VECTOR-NREPLACE-SUBSEQUENCE", 3, 2, false);
        declareFunction("vector_nreplace_subsequence_int", "VECTOR-NREPLACE-SUBSEQUENCE-INT", 4, 0, false);
        declareFunction("print_vector_readably", "PRINT-VECTOR-READABLY", 1, 1, false);
        declareFunction("print_vector_as_delimited_line", "PRINT-VECTOR-AS-DELIMITED-LINE", 1, 2, false);
        declareFunction("max_element", "MAX-ELEMENT", 1, 0, false);
        declareFunction("min_element", "MIN-ELEMENT", 1, 0, false);
        declareFunction("extremal_element", "EXTREMAL-ELEMENT", 2, 0, false);
        declareFunction("random_elt", "RANDOM-ELT", 1, 1, false);
        declareFunction("sample_list", "SAMPLE-LIST", 1, 3, false);
        declareFunction("sample_sequence", "SAMPLE-SEQUENCE", 1, 3, false);
        declareFunction("make_ndim_array", "MAKE-NDIM-ARRAY", 2, 0, false);
        declareFunction("aref_ndim", "AREF-NDIM", 3, 0, false);
        declareFunction("set_aref_ndim", "SET-AREF-NDIM", 4, 0, false);
        declareFunction("f_2d_array_elements", "2D-ARRAY-ELEMENTS", 1, 0, false);
        declareFunction("f_3d_array_elements", "3D-ARRAY-ELEMENTS", 1, 0, false);
        declareFunction("byte_vector_p", "BYTE-VECTOR-P", 1, 0, false);
        declareFunction("new_byte_vector_from_file", "NEW-BYTE-VECTOR-FROM-FILE", 1, 0, false);
        declareFunction("byte_vector_to_hex_char_string", "BYTE-VECTOR-TO-HEX-CHAR-STRING", 1, 0, false);
        declareFunction("byte_vector_to_formatted_hex_char_string", "BYTE-VECTOR-TO-FORMATTED-HEX-CHAR-STRING", 1, 0, false);
        declareFunction("byte_vector_to_string", "BYTE-VECTOR-TO-STRING", 1, 0, false);
        declareFunction("hex_char_string_to_byte_vector", "HEX-CHAR-STRING-TO-BYTE-VECTOR", 1, 0, false);
        declareFunction("byte_to_hex_chars", "BYTE-TO-HEX-CHARS", 1, 0, false);
        declareFunction("hex_chars_to_byte", "HEX-CHARS-TO-BYTE", 2, 0, false);
        declareFunction("byte_vector_to_64_bit_char_string", "BYTE-VECTOR-TO-64-BIT-CHAR-STRING", 1, 0, false);
        declareFunction("write_bytes_as_64_bit_chars", "WRITE-BYTES-AS-64-BIT-CHARS", 4, 0, false);
        declareFunction("bytes_to_64_bit_chars", "BYTES-TO-64-BIT-CHARS", 3, 0, false);
        declareFunction("f_64_bit_chars_to_bytes", "64-BIT-CHARS-TO-BYTES", 4, 0, false);
        declareFunction("f_64_bit_char_string_to_byte_vector", "64-BIT-CHAR-STRING-TO-BYTE-VECTOR", 1, 0, false);
        declareFunction("f_64_bit_string_tuples_length", "64-BIT-STRING-TUPLES-LENGTH", 1, 0, false);
        declareFunction("f_64_bit_string_byte_vector_length", "64-BIT-STRING-BYTE-VECTOR-LENGTH", 1, 0, false);
        declareFunction("binary_search_vector_subrange_wXduplicates", "BINARY-SEARCH-VECTOR-SUBRANGE-W/DUPLICATES", 5, 3, false);
        declareFunction("test_binary_search_vector_subrange_wXduplicate_structures", "TEST-BINARY-SEARCH-VECTOR-SUBRANGE-W/DUPLICATE-STRUCTURES", 6, 0, false);
        declareFunction("test_binary_search_vector_subrange_wXduplicates", "TEST-BINARY-SEARCH-VECTOR-SUBRANGE-W/DUPLICATES", 5, 0, false);
        declareFunction("binary_search_vector_subrange", "BINARY-SEARCH-VECTOR-SUBRANGE", 5, 3, false);
        declareFunction("binary_search_vector_range", "BINARY-SEARCH-VECTOR-RANGE", 3, 3, false);
        declareFunction("binary_search_vector", "BINARY-SEARCH-VECTOR", 3, 3, false);
        declareFunction("binary_search_vector_int", "BINARY-SEARCH-VECTOR-INT", 8, 0, false);
        declareFunction("test_bytes_to_64_bit_chars_once", "TEST-BYTES-TO-64-BIT-CHARS-ONCE", 3, 0, false);
        declareFunction("test_64_bit_chars_to_bytes_once", "TEST-64-BIT-CHARS-TO-BYTES-ONCE", 4, 0, false);
        declareFunction("test_bytes_to_64_bit_chars", "TEST-BYTES-TO-64-BIT-CHARS", 0, 1, false);
        declareFunction("test_64_bit_chars_to_bytes", "TEST-64-BIT-CHARS-TO-BYTES", 0, 1, false);
        return NIL;
    }

    static private final SubLSymbol $sym22$64_BIT_STRING_BYTE_VECTOR_LENGTH = makeSymbol("64-BIT-STRING-BYTE-VECTOR-LENGTH");

    static private final SubLList $list_alt23 = list(list(list(makeString("")), ZERO_INTEGER), list(list(makeString("AA")), ONE_INTEGER), list(list(makeString("AA==")), ONE_INTEGER), list(list(makeString("AAA")), TWO_INTEGER), list(list(makeString("AAA=")), TWO_INTEGER), list(list(makeString("AAAA")), THREE_INTEGER), list(list(makeString("AAAAAA")), FOUR_INTEGER), list(list(makeString("AAAAAA==")), FOUR_INTEGER));

    static private final SubLString $str_alt24$Failure_on__S__S__S = makeString("Failure on ~S ~S ~S");

    static private final SubLString $str_alt25$Failure_on__S__S__S__S = makeString("Failure on ~S ~S ~S ~S");

    public static SubLObject init_vector_utilities_file() {
        return NIL;
    }

    public static final SubLObject setup_vector_utilities_file_alt() {
        define_obsolete_register(CLEAR_VECTOR, $list_alt3);
        define_test_case_table_int($sym13$64_BIT_STRING_TUPLES_LENGTH, list(new SubLObject[]{ $TEST, NIL, $OWNER, $$$goolsbey, $CLASSES, NIL, $KB, $TINY, $WORKING_, T }), $list_alt21);
        define_test_case_table_int($sym22$64_BIT_STRING_BYTE_VECTOR_LENGTH, list(new SubLObject[]{ $TEST, NIL, $OWNER, $$$goolsbey, $CLASSES, NIL, $KB, $TINY, $WORKING_, T }), $list_alt23);
        return NIL;
    }

    public static SubLObject setup_vector_utilities_file() {
        if (SubLFiles.USE_V1) {
            define_obsolete_register(CLEAR_VECTOR, $list5);
            define_test_case_table_int($sym21$64_BIT_STRING_TUPLES_LENGTH, list(new SubLObject[]{ $TEST, NIL, $OWNER, NIL, $CLASSES, NIL, $KB, $TINY, $WORKING_, T }), $list28);
            define_test_case_table_int($sym29$64_BIT_STRING_BYTE_VECTOR_LENGTH, list(new SubLObject[]{ $TEST, NIL, $OWNER, NIL, $CLASSES, NIL, $KB, $TINY, $WORKING_, T }), $list30);
            define_test_case_table_int($sym31$TEST_BINARY_SEARCH_VECTOR_SUBRANGE_W_DUPLICATES, list(new SubLObject[]{ $TEST, NIL, $OWNER, NIL, $CLASSES, NIL, $KB, $TINY, $WORKING_, T }), $list32);
            define_test_case_table_int($sym33$TEST_BINARY_SEARCH_VECTOR_SUBRANGE_W_DUPLICATE_STRUCTURES, list(new SubLObject[]{ $TEST, NIL, $OWNER, NIL, $CLASSES, NIL, $KB, $TINY, $WORKING_, T }), $list34);
        }
        if (SubLFiles.USE_V2) {
            define_obsolete_register(CLEAR_VECTOR, $list_alt3);
            define_test_case_table_int($sym13$64_BIT_STRING_TUPLES_LENGTH, list(new SubLObject[]{ $TEST, NIL, $OWNER, $$$goolsbey, $CLASSES, NIL, $KB, $TINY, $WORKING_, T }), $list_alt21);
            define_test_case_table_int($sym22$64_BIT_STRING_BYTE_VECTOR_LENGTH, list(new SubLObject[]{ $TEST, NIL, $OWNER, $$$goolsbey, $CLASSES, NIL, $KB, $TINY, $WORKING_, T }), $list_alt23);
        }
        return NIL;
    }

    public static SubLObject setup_vector_utilities_file_Previous() {
        define_obsolete_register(CLEAR_VECTOR, $list5);
        define_test_case_table_int($sym21$64_BIT_STRING_TUPLES_LENGTH, list(new SubLObject[]{ $TEST, NIL, $OWNER, NIL, $CLASSES, NIL, $KB, $TINY, $WORKING_, T }), $list28);
        define_test_case_table_int($sym29$64_BIT_STRING_BYTE_VECTOR_LENGTH, list(new SubLObject[]{ $TEST, NIL, $OWNER, NIL, $CLASSES, NIL, $KB, $TINY, $WORKING_, T }), $list30);
        define_test_case_table_int($sym31$TEST_BINARY_SEARCH_VECTOR_SUBRANGE_W_DUPLICATES, list(new SubLObject[]{ $TEST, NIL, $OWNER, NIL, $CLASSES, NIL, $KB, $TINY, $WORKING_, T }), $list32);
        define_test_case_table_int($sym33$TEST_BINARY_SEARCH_VECTOR_SUBRANGE_W_DUPLICATE_STRUCTURES, list(new SubLObject[]{ $TEST, NIL, $OWNER, NIL, $CLASSES, NIL, $KB, $TINY, $WORKING_, T }), $list34);
        return NIL;
    }

    @Override
    public void declareFunctions() {
        declare_vector_utilities_file();
    }

    @Override
    public void initializeVariables() {
        init_vector_utilities_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_vector_utilities_file();
    }

    
}

/**
 * Total time: 426 ms
 */
