package com.cyc.cycjava.cycl;


import com.cyc.cycjava.cycl.utilities_macros;
import com.cyc.cycjava.cycl.vector_utilities;
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
import com.cyc.tool.subl.util.SubLTrampolineFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

import static com.cyc.cycjava.cycl.access_macros.*;
import static com.cyc.cycjava.cycl.cyc_testing.generic_testing.*;
import static com.cyc.cycjava.cycl.utilities_macros.*;
import static com.cyc.cycjava.cycl.vector_utilities.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_A;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_comma;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_equal;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_newline;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_space;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.EQL;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.FIVE_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.FOUR_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.IDENTITY;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.MINUS_ONE_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.NIL;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.ONE_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.SEVEN_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.SIXTEEN_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.SIX_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.T;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.THREE_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.TWO_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.UNPROVIDED;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.ZERO_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.$is_thread_performing_cleanupP$;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors.*;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high.$print_readably$;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.*;
import static com.cyc.tool.subl.util.SubLFiles.*;
import static com.cyc.tool.subl.util.SubLTranslatedFile.*;


public final class vector_utilities extends SubLTranslatedFile {
    public static final SubLFile me = new vector_utilities();

    public static final String myName = "com.cyc.cycjava.cycl.vector_utilities";

    public static final String myFingerPrint = "c7ff162ca119e0df0c49244291f78e9a3c02a92695b428731e0de2c94bdfa846";









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



    public static SubLObject vector_elements(final SubLObject vector, SubLObject start_index) {
        if (start_index == UNPROVIDED) {
            start_index = ZERO_INTEGER;
        }
        assert NIL != vectorp(vector) : "Types.vectorp(vector) " + "CommonSymbols.NIL != Types.vectorp(vector) " + vector;
        assert NIL != integerp(start_index) : "Types.integerp(start_index) " + "CommonSymbols.NIL != Types.integerp(start_index) " + start_index;
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
        assert NIL != list_utilities.proper_list_p(proper_list) : "list_utilities.proper_list_p(proper_list) " + "CommonSymbols.NIL != list_utilities.proper_list_p(proper_list) " + proper_list;
        return apply(symbol_function(VECTOR), proper_list);
    }

    public static SubLObject copy_vector(final SubLObject vector) {
        assert NIL != vectorp(vector) : "Types.vectorp(vector) " + "CommonSymbols.NIL != Types.vectorp(vector) " + vector;
        return copy_seq(vector);
    }

    public static SubLObject first_aref(final SubLObject vector) {
        return aref(vector, ZERO_INTEGER);
    }

    public static SubLObject last_aref(final SubLObject vector) {
        return aref(vector, subtract(length(vector), ONE_INTEGER));
    }

    public static SubLObject num_vector(final SubLObject length) {
        final SubLObject vec = make_vector(length, UNPROVIDED);
        SubLObject i;
        for (i = NIL, i = ZERO_INTEGER; i.numL(length); i = add(i, ONE_INTEGER)) {
            set_aref(vec, i, i);
        }
        return vec;
    }

    public static SubLObject extend_vector(final SubLObject vector, final SubLObject delta, SubLObject initial_value) {
        if (initial_value == UNPROVIDED) {
            initial_value = NIL;
        }
        final SubLObject old_length = length(vector);
        final SubLObject new_vector = make_vector(add(old_length, delta), initial_value);
        replace(new_vector, vector, ZERO_INTEGER, old_length, ZERO_INTEGER, old_length);
        return new_vector;
    }

    public static SubLObject extend_vector_to(final SubLObject vector, final SubLObject new_length, SubLObject initial_value) {
        if (initial_value == UNPROVIDED) {
            initial_value = NIL;
        }
        final SubLObject old_length = length(vector);
        final SubLObject new_vector = make_vector(new_length, initial_value);
        replace(new_vector, vector, ZERO_INTEGER, old_length, ZERO_INTEGER, old_length);
        return new_vector;
    }

    public static SubLObject grow_vector(final SubLObject vector, SubLObject initial_value, SubLObject multiple) {
        if (initial_value == UNPROVIDED) {
            initial_value = NIL;
        }
        if (multiple == UNPROVIDED) {
            multiple = TWO_INTEGER;
        }
        assert NIL != vectorp(vector) : "Types.vectorp(vector) " + "CommonSymbols.NIL != Types.vectorp(vector) " + vector;
        final SubLObject old_length = length(vector);
        final SubLObject new_vector = make_vector(multiply(old_length, multiple), initial_value);
        replace(new_vector, vector, ZERO_INTEGER, old_length, ZERO_INTEGER, old_length);
        return new_vector;
    }

    public static SubLObject reset_vector(final SubLObject vector, SubLObject element) {
        if (element == UNPROVIDED) {
            element = NIL;
        }
        return fill(vector, element, UNPROVIDED, UNPROVIDED);
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

    public static SubLObject vector_nreplace_subsequence(final SubLObject v_new, final SubLObject old, SubLObject vector, SubLObject test, SubLObject key) {
        if (test == UNPROVIDED) {
            test = symbol_function(EQL);
        }
        if (key == UNPROVIDED) {
            key = symbol_function(IDENTITY);
        }
        assert NIL != vectorp(v_new) : "Types.vectorp(v_new) " + "CommonSymbols.NIL != Types.vectorp(v_new) " + v_new;
        assert NIL != vectorp(old) : "Types.vectorp(old) " + "CommonSymbols.NIL != Types.vectorp(old) " + old;
        assert NIL != vectorp(vector) : "Types.vectorp(vector) " + "CommonSymbols.NIL != Types.vectorp(vector) " + vector;
        for (SubLObject pos = search(old, vector, test, key, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED); NIL != pos; pos = search(vector, old, test, key, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED)) {
            vector = vector_nreplace_subsequence_int(v_new, pos, length(old), vector);
        }
        return vector;
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
        assert NIL != sequencep(sequence) : "Types.sequencep(sequence) " + "CommonSymbols.NIL != Types.sequencep(sequence) " + sequence;
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
        assert NIL != list_utilities.proper_list_p(list) : "list_utilities.proper_list_p(list) " + "CommonSymbols.NIL != list_utilities.proper_list_p(list) " + list;
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
        assert NIL != sequencep(sequence) : "Types.sequencep(sequence) " + "CommonSymbols.NIL != Types.sequencep(sequence) " + sequence;
        assert NIL != subl_promotions.non_negative_integer_p(n) : "subl_promotions.non_negative_integer_p(n) " + "CommonSymbols.NIL != subl_promotions.non_negative_integer_p(n) " + n;
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

    public static SubLObject make_ndim_array(final SubLObject dim_x, final SubLObject dim_y) {
        final SubLObject base_vector = make_vector(dim_x, UNPROVIDED);
        SubLObject i;
        for (i = NIL, i = ZERO_INTEGER; i.numL(dim_x); i = add(i, ONE_INTEGER)) {
            set_aref(base_vector, i, make_vector(dim_y, UNPROVIDED));
        }
        return base_vector;
    }

    public static SubLObject aref_ndim(final SubLObject base_vector, final SubLObject x, final SubLObject y) {
        return aref(aref(base_vector, x), y);
    }

    public static SubLObject set_aref_ndim(final SubLObject base_vector, final SubLObject x, final SubLObject y, final SubLObject value) {
        return set_aref(aref(base_vector, x), y, value);
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

    public static SubLObject new_byte_vector_from_file(final SubLObject filename) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != stringp(filename) : "Types.stringp(filename) " + "CommonSymbols.NIL != Types.stringp(filename) " + filename;
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

    public static SubLObject byte_vector_to_hex_char_string(final SubLObject byte_vector) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != byte_vector_p(byte_vector) : "vector_utilities.byte_vector_p(byte_vector) " + "CommonSymbols.NIL != vector_utilities.byte_vector_p(byte_vector) " + byte_vector;
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

    public static SubLObject byte_vector_to_string(final SubLObject byte_vector) {
        assert NIL != byte_vector_p(byte_vector) : "vector_utilities.byte_vector_p(byte_vector) " + "CommonSymbols.NIL != vector_utilities.byte_vector_p(byte_vector) " + byte_vector;
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

    public static SubLObject hex_char_string_to_byte_vector(final SubLObject hex_char_string) {
        assert NIL != string_utilities.hex_char_string_p(hex_char_string) : "string_utilities.hex_char_string_p(hex_char_string) " + "CommonSymbols.NIL != string_utilities.hex_char_string_p(hex_char_string) " + hex_char_string;
        final SubLObject string_length = length(hex_char_string);
        assert NIL != evenp(string_length) : "Numbers.evenp(string_length) " + "CommonSymbols.NIL != Numbers.evenp(string_length) " + string_length;
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

    public static SubLObject byte_to_hex_chars(final SubLObject v_byte) {
        final SubLObject high_nybble = integerDivide(v_byte, SIXTEEN_INTEGER);
        final SubLObject low_nybble = mod(v_byte, SIXTEEN_INTEGER);
        return values(string_utilities.hex_char(high_nybble), string_utilities.hex_char(low_nybble));
    }

    public static SubLObject hex_chars_to_byte(final SubLObject high_char, final SubLObject low_char) {
        final SubLObject high_nybble = string_utilities.hex_char_value(high_char);
        final SubLObject low_nybble = string_utilities.hex_char_value(low_char);
        return add(multiply(SIXTEEN_INTEGER, high_nybble), low_nybble);
    }

    public static SubLObject byte_vector_to_64_bit_char_string(final SubLObject byte_vector) {
        assert NIL != byte_vector_p(byte_vector) : "vector_utilities.byte_vector_p(byte_vector) " + "CommonSymbols.NIL != vector_utilities.byte_vector_p(byte_vector) " + byte_vector;
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

    public static SubLObject f_64_bit_char_string_to_byte_vector(final SubLObject v_64_bit_string) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != string_utilities.f_64_bit_string_p(v_64_bit_string) : "string_utilities.f_64_bit_string_p(v_64_bit_string) " + "CommonSymbols.NIL != string_utilities.f_64_bit_string_p(v_64_bit_string) " + v_64_bit_string;
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

    public static SubLObject f_64_bit_string_tuples_length(final SubLObject v_64_bit_string) {
        assert NIL != stringp(v_64_bit_string) : "Types.stringp(v_64_bit_string) " + "CommonSymbols.NIL != Types.stringp(v_64_bit_string) " + v_64_bit_string;
        final SubLObject string_length = length(v_64_bit_string);
        return ceiling(string_length, FOUR_INTEGER);
    }

    public static SubLObject f_64_bit_string_byte_vector_length(final SubLObject v_64_bit_string) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != stringp(v_64_bit_string) : "Types.stringp(v_64_bit_string) " + "CommonSymbols.NIL != Types.stringp(v_64_bit_string) " + v_64_bit_string;
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

    public static SubLObject declare_vector_utilities_file() {
        declareFunction(me, "vector_elements", "VECTOR-ELEMENTS", 1, 1, false);
        declareFunction(me, "list_to_vector", "LIST-TO-VECTOR", 1, 0, false);
        declareFunction(me, "copy_vector", "COPY-VECTOR", 1, 0, false);
        declareFunction(me, "first_aref", "FIRST-AREF", 1, 0, false);
        declareFunction(me, "last_aref", "LAST-AREF", 1, 0, false);
        declareFunction(me, "num_vector", "NUM-VECTOR", 1, 0, false);
        declareFunction(me, "extend_vector", "EXTEND-VECTOR", 2, 1, false);
        declareFunction(me, "extend_vector_to", "EXTEND-VECTOR-TO", 2, 1, false);
        declareFunction(me, "grow_vector", "GROW-VECTOR", 1, 2, false);
        declareFunction(me, "reset_vector", "RESET-VECTOR", 1, 1, false);
        declareFunction(me, "clear_vector", "CLEAR-VECTOR", 1, 1, false);
        declareFunction(me, "percolate_vector", "PERCOLATE-VECTOR", 2, 0, false);
        declareFunction(me, "vector_nreplace_subsequence", "VECTOR-NREPLACE-SUBSEQUENCE", 3, 2, false);
        declareFunction(me, "vector_nreplace_subsequence_int", "VECTOR-NREPLACE-SUBSEQUENCE-INT", 4, 0, false);
        declareFunction(me, "print_vector_readably", "PRINT-VECTOR-READABLY", 1, 1, false);
        declareFunction(me, "print_vector_as_delimited_line", "PRINT-VECTOR-AS-DELIMITED-LINE", 1, 2, false);
        declareFunction(me, "max_element", "MAX-ELEMENT", 1, 0, false);
        declareFunction(me, "min_element", "MIN-ELEMENT", 1, 0, false);
        declareFunction(me, "extremal_element", "EXTREMAL-ELEMENT", 2, 0, false);
        declareFunction(me, "random_elt", "RANDOM-ELT", 1, 1, false);
        declareFunction(me, "sample_list", "SAMPLE-LIST", 1, 3, false);
        declareFunction(me, "sample_sequence", "SAMPLE-SEQUENCE", 1, 3, false);
        declareFunction(me, "make_ndim_array", "MAKE-NDIM-ARRAY", 2, 0, false);
        declareFunction(me, "aref_ndim", "AREF-NDIM", 3, 0, false);
        declareFunction(me, "set_aref_ndim", "SET-AREF-NDIM", 4, 0, false);
        declareFunction(me, "f_2d_array_elements", "2D-ARRAY-ELEMENTS", 1, 0, false);
        declareFunction(me, "f_3d_array_elements", "3D-ARRAY-ELEMENTS", 1, 0, false);
        declareFunction(me, "byte_vector_p", "BYTE-VECTOR-P", 1, 0, false);
        declareFunction(me, "new_byte_vector_from_file", "NEW-BYTE-VECTOR-FROM-FILE", 1, 0, false);
        declareFunction(me, "byte_vector_to_hex_char_string", "BYTE-VECTOR-TO-HEX-CHAR-STRING", 1, 0, false);
        declareFunction(me, "byte_vector_to_formatted_hex_char_string", "BYTE-VECTOR-TO-FORMATTED-HEX-CHAR-STRING", 1, 0, false);
        declareFunction(me, "byte_vector_to_string", "BYTE-VECTOR-TO-STRING", 1, 0, false);
        declareFunction(me, "hex_char_string_to_byte_vector", "HEX-CHAR-STRING-TO-BYTE-VECTOR", 1, 0, false);
        declareFunction(me, "byte_to_hex_chars", "BYTE-TO-HEX-CHARS", 1, 0, false);
        declareFunction(me, "hex_chars_to_byte", "HEX-CHARS-TO-BYTE", 2, 0, false);
        declareFunction(me, "byte_vector_to_64_bit_char_string", "BYTE-VECTOR-TO-64-BIT-CHAR-STRING", 1, 0, false);
        declareFunction(me, "write_bytes_as_64_bit_chars", "WRITE-BYTES-AS-64-BIT-CHARS", 4, 0, false);
        declareFunction(me, "bytes_to_64_bit_chars", "BYTES-TO-64-BIT-CHARS", 3, 0, false);
        declareFunction(me, "f_64_bit_chars_to_bytes", "64-BIT-CHARS-TO-BYTES", 4, 0, false);
        declareFunction(me, "f_64_bit_char_string_to_byte_vector", "64-BIT-CHAR-STRING-TO-BYTE-VECTOR", 1, 0, false);
        declareFunction(me, "f_64_bit_string_tuples_length", "64-BIT-STRING-TUPLES-LENGTH", 1, 0, false);
        declareFunction(me, "f_64_bit_string_byte_vector_length", "64-BIT-STRING-BYTE-VECTOR-LENGTH", 1, 0, false);
        declareFunction(me, "binary_search_vector_subrange_wXduplicates", "BINARY-SEARCH-VECTOR-SUBRANGE-W/DUPLICATES", 5, 3, false);
        declareFunction(me, "test_binary_search_vector_subrange_wXduplicate_structures", "TEST-BINARY-SEARCH-VECTOR-SUBRANGE-W/DUPLICATE-STRUCTURES", 6, 0, false);
        declareFunction(me, "test_binary_search_vector_subrange_wXduplicates", "TEST-BINARY-SEARCH-VECTOR-SUBRANGE-W/DUPLICATES", 5, 0, false);
        declareFunction(me, "binary_search_vector_subrange", "BINARY-SEARCH-VECTOR-SUBRANGE", 5, 3, false);
        declareFunction(me, "binary_search_vector_range", "BINARY-SEARCH-VECTOR-RANGE", 3, 3, false);
        declareFunction(me, "binary_search_vector", "BINARY-SEARCH-VECTOR", 3, 3, false);
        declareFunction(me, "binary_search_vector_int", "BINARY-SEARCH-VECTOR-INT", 8, 0, false);
        declareFunction(me, "test_bytes_to_64_bit_chars_once", "TEST-BYTES-TO-64-BIT-CHARS-ONCE", 3, 0, false);
        declareFunction(me, "test_64_bit_chars_to_bytes_once", "TEST-64-BIT-CHARS-TO-BYTES-ONCE", 4, 0, false);
        declareFunction(me, "test_bytes_to_64_bit_chars", "TEST-BYTES-TO-64-BIT-CHARS", 0, 1, false);
        declareFunction(me, "test_64_bit_chars_to_bytes", "TEST-64-BIT-CHARS-TO-BYTES", 0, 1, false);
        return NIL;
    }

    public static SubLObject init_vector_utilities_file() {
        return NIL;
    }

    public static SubLObject setup_vector_utilities_file() {
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

    static {








































    }
}

/**
 * Total time: 426 ms
 */
