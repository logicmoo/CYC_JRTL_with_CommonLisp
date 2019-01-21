package com.cyc.cycjava.cycl;

import com.cyc.cycjava.cycl.cyc_testing.generic_testing;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.bytes;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Strings;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.compatibility;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.stream_macros;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.random;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class vector_utilities extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.vector_utilities";
    public static final String myFingerPrint = "c7ff162ca119e0df0c49244291f78e9a3c02a92695b428731e0de2c94bdfa846";
    private static final SubLSymbol $sym0$VECTORP;
    private static final SubLSymbol $sym1$INTEGERP;
    private static final SubLSymbol $sym2$PROPER_LIST_P;
    private static final SubLSymbol $sym3$VECTOR;
    private static final SubLSymbol $sym4$CLEAR_VECTOR;
    private static final SubLList $list5;
    private static final SubLSymbol $sym6$TRUE;
    private static final SubLSymbol $sym7$SEQUENCEP;
    private static final SubLSymbol $sym8$POSITIVE_INTEGER_P;
    private static final SubLInteger $int9$500;
    private static final SubLSymbol $sym10$NON_NEGATIVE_INTEGER_P;
    private static final SubLInteger $int11$100000;
    private static final SubLSymbol $sym12$STRINGP;
    private static final SubLSymbol $kw13$INPUT;
    private static final SubLString $str14$Unable_to_open__S;
    private static final SubLSymbol $sym15$BYTE_VECTOR_P;
    private static final SubLInteger $int16$32;
    private static final SubLString $str17$Did_not_fill_up_all_the_expected_;
    private static final SubLSymbol $sym18$HEX_CHAR_STRING_P;
    private static final SubLSymbol $sym19$EVENP;
    private static final SubLSymbol $sym20$64_BIT_STRING_P;
    private static final SubLSymbol $sym21$64_BIT_STRING_TUPLES_LENGTH;
    private static final SubLSymbol $kw22$TEST;
    private static final SubLSymbol $kw23$OWNER;
    private static final SubLSymbol $kw24$CLASSES;
    private static final SubLSymbol $kw25$KB;
    private static final SubLSymbol $kw26$TINY;
    private static final SubLSymbol $kw27$WORKING_;
    private static final SubLList $list28;
    private static final SubLSymbol $sym29$64_BIT_STRING_BYTE_VECTOR_LENGTH;
    private static final SubLList $list30;
    private static final SubLSymbol $sym31$TEST_BINARY_SEARCH_VECTOR_SUBRANGE_W_DUPLICATES;
    private static final SubLList $list32;
    private static final SubLSymbol $sym33$TEST_BINARY_SEARCH_VECTOR_SUBRANGE_W_DUPLICATE_STRUCTURES;
    private static final SubLList $list34;
    private static final SubLString $str35$Failure_on__S__S__S;
    private static final SubLString $str36$Failure_on__S__S__S__S;
    private static final SubLString $str37$cdotimes;
    private static final SubLInteger $int38$256;
    
    @SubLTranslatedFile.SubL(source = "cycl/vector-utilities.lisp", position = 777L)
    public static SubLObject vector_elements(final SubLObject vector, SubLObject start_index) {
        if (start_index == vector_utilities.UNPROVIDED) {
            start_index = (SubLObject)vector_utilities.ZERO_INTEGER;
        }
        assert vector_utilities.NIL != Types.vectorp(vector) : vector;
        assert vector_utilities.NIL != Types.integerp(start_index) : start_index;
        final SubLObject length = Numbers.subtract(Sequences.length(vector), start_index);
        final SubLObject list = (SubLObject)ConsesLow.make_list(length, (SubLObject)vector_utilities.UNPROVIDED);
        SubLObject index = start_index;
        SubLObject rest;
        for (rest = (SubLObject)vector_utilities.NIL, rest = list; vector_utilities.NIL != rest; rest = rest.rest()) {
            ConsesLow.rplaca(rest, Vectors.aref(vector, index));
            index = Numbers.add(index, (SubLObject)vector_utilities.ONE_INTEGER);
        }
        return list;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/vector-utilities.lisp", position = 1176L)
    public static SubLObject list_to_vector(final SubLObject proper_list) {
        assert vector_utilities.NIL != list_utilities.proper_list_p(proper_list) : proper_list;
        return Functions.apply(Symbols.symbol_function((SubLObject)vector_utilities.$sym3$VECTOR), proper_list);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/vector-utilities.lisp", position = 1346L)
    public static SubLObject copy_vector(final SubLObject vector) {
        assert vector_utilities.NIL != Types.vectorp(vector) : vector;
        return Sequences.copy_seq(vector);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/vector-utilities.lisp", position = 1433L)
    public static SubLObject first_aref(final SubLObject vector) {
        return Vectors.aref(vector, (SubLObject)vector_utilities.ZERO_INTEGER);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/vector-utilities.lisp", position = 1494L)
    public static SubLObject last_aref(final SubLObject vector) {
        return Vectors.aref(vector, Numbers.subtract(Sequences.length(vector), (SubLObject)vector_utilities.ONE_INTEGER));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/vector-utilities.lisp", position = 1574L)
    public static SubLObject num_vector(final SubLObject length) {
        final SubLObject vec = Vectors.make_vector(length, (SubLObject)vector_utilities.UNPROVIDED);
        SubLObject i;
        for (i = (SubLObject)vector_utilities.NIL, i = (SubLObject)vector_utilities.ZERO_INTEGER; i.numL(length); i = Numbers.add(i, (SubLObject)vector_utilities.ONE_INTEGER)) {
            Vectors.set_aref(vec, i, i);
        }
        return vec;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/vector-utilities.lisp", position = 1795L)
    public static SubLObject extend_vector(final SubLObject vector, final SubLObject delta, SubLObject initial_value) {
        if (initial_value == vector_utilities.UNPROVIDED) {
            initial_value = (SubLObject)vector_utilities.NIL;
        }
        final SubLObject old_length = Sequences.length(vector);
        final SubLObject new_vector = Vectors.make_vector(Numbers.add(old_length, delta), initial_value);
        Sequences.replace(new_vector, vector, (SubLObject)vector_utilities.ZERO_INTEGER, old_length, (SubLObject)vector_utilities.ZERO_INTEGER, old_length);
        return new_vector;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/vector-utilities.lisp", position = 2151L)
    public static SubLObject extend_vector_to(final SubLObject vector, final SubLObject new_length, SubLObject initial_value) {
        if (initial_value == vector_utilities.UNPROVIDED) {
            initial_value = (SubLObject)vector_utilities.NIL;
        }
        final SubLObject old_length = Sequences.length(vector);
        final SubLObject new_vector = Vectors.make_vector(new_length, initial_value);
        Sequences.replace(new_vector, vector, (SubLObject)vector_utilities.ZERO_INTEGER, old_length, (SubLObject)vector_utilities.ZERO_INTEGER, old_length);
        return new_vector;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/vector-utilities.lisp", position = 2527L)
    public static SubLObject grow_vector(final SubLObject vector, SubLObject initial_value, SubLObject multiple) {
        if (initial_value == vector_utilities.UNPROVIDED) {
            initial_value = (SubLObject)vector_utilities.NIL;
        }
        if (multiple == vector_utilities.UNPROVIDED) {
            multiple = (SubLObject)vector_utilities.TWO_INTEGER;
        }
        assert vector_utilities.NIL != Types.vectorp(vector) : vector;
        final SubLObject old_length = Sequences.length(vector);
        final SubLObject new_vector = Vectors.make_vector(Numbers.multiply(old_length, multiple), initial_value);
        Sequences.replace(new_vector, vector, (SubLObject)vector_utilities.ZERO_INTEGER, old_length, (SubLObject)vector_utilities.ZERO_INTEGER, old_length);
        return new_vector;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/vector-utilities.lisp", position = 2922L)
    public static SubLObject reset_vector(final SubLObject vector, SubLObject element) {
        if (element == vector_utilities.UNPROVIDED) {
            element = (SubLObject)vector_utilities.NIL;
        }
        return Sequences.fill(vector, element, (SubLObject)vector_utilities.UNPROVIDED, (SubLObject)vector_utilities.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/vector-utilities.lisp", position = 3042L)
    public static SubLObject clear_vector(final SubLObject vector, SubLObject fill_obj) {
        if (fill_obj == vector_utilities.UNPROVIDED) {
            fill_obj = (SubLObject)vector_utilities.NIL;
        }
        SubLObject len;
        SubLObject i;
        for (len = Sequences.length(vector), i = (SubLObject)vector_utilities.NIL, i = (SubLObject)vector_utilities.ZERO_INTEGER; i.numL(len); i = Numbers.add(i, (SubLObject)vector_utilities.ONE_INTEGER)) {
            Vectors.set_aref(vector, i, fill_obj);
        }
        return vector;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/vector-utilities.lisp", position = 3243L)
    public static SubLObject percolate_vector(final SubLObject vector, final SubLObject item) {
        SubLObject back = item;
        SubLObject temp = (SubLObject)vector_utilities.NIL;
        SubLObject cdotimes_end_var;
        SubLObject i;
        for (cdotimes_end_var = Sequences.length(vector), i = (SubLObject)vector_utilities.NIL, i = (SubLObject)vector_utilities.ZERO_INTEGER; i.numL(cdotimes_end_var); i = Numbers.add(i, (SubLObject)vector_utilities.ONE_INTEGER)) {
            temp = Vectors.aref(vector, i);
            Vectors.set_aref(vector, i, back);
            back = temp;
        }
        return vector;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/vector-utilities.lisp", position = 3577L)
    public static SubLObject vector_nreplace_subsequence(final SubLObject v_new, final SubLObject old, SubLObject vector, SubLObject test, SubLObject key) {
        if (test == vector_utilities.UNPROVIDED) {
            test = Symbols.symbol_function((SubLObject)vector_utilities.EQL);
        }
        if (key == vector_utilities.UNPROVIDED) {
            key = Symbols.symbol_function((SubLObject)vector_utilities.IDENTITY);
        }
        assert vector_utilities.NIL != Types.vectorp(v_new) : v_new;
        assert vector_utilities.NIL != Types.vectorp(old) : old;
        assert vector_utilities.NIL != Types.vectorp(vector) : vector;
        for (SubLObject pos = Sequences.search(old, vector, test, key, (SubLObject)vector_utilities.UNPROVIDED, (SubLObject)vector_utilities.UNPROVIDED, (SubLObject)vector_utilities.UNPROVIDED, (SubLObject)vector_utilities.UNPROVIDED); vector_utilities.NIL != pos; pos = Sequences.search(vector, old, test, key, (SubLObject)vector_utilities.UNPROVIDED, (SubLObject)vector_utilities.UNPROVIDED, (SubLObject)vector_utilities.UNPROVIDED, (SubLObject)vector_utilities.UNPROVIDED)) {
            vector = vector_nreplace_subsequence_int(v_new, pos, Sequences.length(old), vector);
        }
        return vector;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/vector-utilities.lisp", position = 4087L)
    public static SubLObject vector_nreplace_subsequence_int(final SubLObject v_new, final SubLObject pos, final SubLObject old_length, final SubLObject vector) {
        if (vector_utilities.NIL != list_utilities.lengthE(v_new, old_length, (SubLObject)vector_utilities.UNPROVIDED)) {
            Sequences.replace(vector, v_new, pos, Numbers.add(pos, old_length), (SubLObject)vector_utilities.UNPROVIDED, (SubLObject)vector_utilities.UNPROVIDED);
            return vector;
        }
        final SubLObject new_vector = Vectors.make_vector(Numbers.add(Sequences.length(vector), Numbers.subtract(Sequences.length(v_new), old_length)), (SubLObject)vector_utilities.UNPROVIDED);
        Sequences.replace(new_vector, vector, (SubLObject)vector_utilities.ZERO_INTEGER, pos, (SubLObject)vector_utilities.UNPROVIDED, (SubLObject)vector_utilities.UNPROVIDED);
        Sequences.replace(new_vector, v_new, pos, Numbers.add(pos, Sequences.length(v_new)), (SubLObject)vector_utilities.UNPROVIDED, (SubLObject)vector_utilities.UNPROVIDED);
        Sequences.replace(new_vector, vector, Numbers.add(pos, Sequences.length(v_new)), (SubLObject)vector_utilities.NIL, Numbers.add(pos, old_length), (SubLObject)vector_utilities.UNPROVIDED);
        return new_vector;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/vector-utilities.lisp", position = 4544L)
    public static SubLObject print_vector_readably(final SubLObject vector, SubLObject stream) {
        if (stream == vector_utilities.UNPROVIDED) {
            stream = (SubLObject)vector_utilities.T;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject _prev_bind_0 = print_high.$print_readably$.currentBinding(thread);
        try {
            print_high.$print_readably$.bind((SubLObject)vector_utilities.T, thread);
            print_high.prin1(vector, stream);
        }
        finally {
            print_high.$print_readably$.rebind(_prev_bind_0, thread);
        }
        return vector;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/vector-utilities.lisp", position = 4679L)
    public static SubLObject print_vector_as_delimited_line(final SubLObject vector, SubLObject delimiter, SubLObject stream) {
        if (delimiter == vector_utilities.UNPROVIDED) {
            delimiter = (SubLObject)Characters.CHAR_comma;
        }
        if (stream == vector_utilities.UNPROVIDED) {
            stream = (SubLObject)vector_utilities.T;
        }
        final SubLObject backwardP_var = (SubLObject)vector_utilities.NIL;
        SubLObject length;
        SubLObject v_iteration;
        SubLObject i;
        SubLObject value;
        for (length = Sequences.length(vector), v_iteration = (SubLObject)vector_utilities.NIL, v_iteration = (SubLObject)vector_utilities.ZERO_INTEGER; v_iteration.numL(length); v_iteration = Numbers.add(v_iteration, (SubLObject)vector_utilities.ONE_INTEGER)) {
            i = ((vector_utilities.NIL != backwardP_var) ? Numbers.subtract(length, v_iteration, (SubLObject)vector_utilities.ONE_INTEGER) : v_iteration);
            value = Vectors.aref(vector, i);
            if (!i.numE((SubLObject)vector_utilities.ZERO_INTEGER)) {
                print_high.princ(delimiter, stream);
            }
            print_high.prin1(value, stream);
        }
        return vector;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/vector-utilities.lisp", position = 4977L)
    public static SubLObject max_element(final SubLObject vector) {
        SubLObject max = (SubLObject)vector_utilities.NIL;
        final SubLObject backwardP_var = (SubLObject)vector_utilities.NIL;
        SubLObject length;
        SubLObject v_iteration;
        SubLObject element_num;
        SubLObject value;
        for (length = Sequences.length(vector), v_iteration = (SubLObject)vector_utilities.NIL, v_iteration = (SubLObject)vector_utilities.ZERO_INTEGER; v_iteration.numL(length); v_iteration = Numbers.add(v_iteration, (SubLObject)vector_utilities.ONE_INTEGER)) {
            element_num = ((vector_utilities.NIL != backwardP_var) ? Numbers.subtract(length, v_iteration, (SubLObject)vector_utilities.ONE_INTEGER) : v_iteration);
            value = Vectors.aref(vector, element_num);
            if (vector_utilities.NIL == max || value.numG(max)) {
                max = value;
            }
        }
        return max;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/vector-utilities.lisp", position = 5151L)
    public static SubLObject min_element(final SubLObject vector) {
        SubLObject min = (SubLObject)vector_utilities.NIL;
        final SubLObject backwardP_var = (SubLObject)vector_utilities.NIL;
        SubLObject length;
        SubLObject v_iteration;
        SubLObject element_num;
        SubLObject value;
        for (length = Sequences.length(vector), v_iteration = (SubLObject)vector_utilities.NIL, v_iteration = (SubLObject)vector_utilities.ZERO_INTEGER; v_iteration.numL(length); v_iteration = Numbers.add(v_iteration, (SubLObject)vector_utilities.ONE_INTEGER)) {
            element_num = ((vector_utilities.NIL != backwardP_var) ? Numbers.subtract(length, v_iteration, (SubLObject)vector_utilities.ONE_INTEGER) : v_iteration);
            value = Vectors.aref(vector, element_num);
            if (vector_utilities.NIL == min || value.numL(min)) {
                min = value;
            }
        }
        return min;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/vector-utilities.lisp", position = 5317L)
    public static SubLObject extremal_element(final SubLObject vector, final SubLObject key) {
        SubLObject extremal = (SubLObject)vector_utilities.NIL;
        final SubLObject backwardP_var = (SubLObject)vector_utilities.NIL;
        SubLObject length;
        SubLObject v_iteration;
        SubLObject element_num;
        SubLObject value;
        for (length = Sequences.length(vector), v_iteration = (SubLObject)vector_utilities.NIL, v_iteration = (SubLObject)vector_utilities.ZERO_INTEGER; v_iteration.numL(length); v_iteration = Numbers.add(v_iteration, (SubLObject)vector_utilities.ONE_INTEGER)) {
            element_num = ((vector_utilities.NIL != backwardP_var) ? Numbers.subtract(length, v_iteration, (SubLObject)vector_utilities.ONE_INTEGER) : v_iteration);
            value = Vectors.aref(vector, element_num);
            if (vector_utilities.NIL == extremal || vector_utilities.NIL != Functions.funcall(key, value, extremal)) {
                extremal = value;
            }
        }
        return extremal;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/vector-utilities.lisp", position = 5527L)
    public static SubLObject random_elt(final SubLObject sequence, SubLObject test) {
        if (test == vector_utilities.UNPROVIDED) {
            test = Symbols.symbol_function((SubLObject)vector_utilities.$sym6$TRUE);
        }
        assert vector_utilities.NIL != Types.sequencep(sequence) : sequence;
        final SubLObject length = Sequences.length(sequence);
        enforceType(length, vector_utilities.$sym8$POSITIVE_INTEGER_P);
        SubLObject witness = (SubLObject)vector_utilities.NIL;
        for (SubLObject foundP = (SubLObject)vector_utilities.NIL; vector_utilities.NIL == foundP; foundP = Functions.funcall(test, witness)) {
            final SubLObject index = random.random(length);
            witness = Sequences.elt(sequence, index);
        }
        return witness;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/vector-utilities.lisp", position = 6035L)
    public static SubLObject sample_list(final SubLObject list, SubLObject n, SubLObject allow_repeatsP, SubLObject test) {
        if (n == vector_utilities.UNPROVIDED) {
            n = (SubLObject)vector_utilities.$int9$500;
        }
        if (allow_repeatsP == vector_utilities.UNPROVIDED) {
            allow_repeatsP = (SubLObject)vector_utilities.NIL;
        }
        if (test == vector_utilities.UNPROVIDED) {
            test = Symbols.symbol_function((SubLObject)vector_utilities.$sym6$TRUE);
        }
        assert vector_utilities.NIL != list_utilities.proper_list_p(list) : list;
        return sample_sequence(list, n, allow_repeatsP, test);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/vector-utilities.lisp", position = 6344L)
    public static SubLObject sample_sequence(final SubLObject sequence, SubLObject n, SubLObject allow_repeatsP, SubLObject test) {
        if (n == vector_utilities.UNPROVIDED) {
            n = (SubLObject)vector_utilities.$int9$500;
        }
        if (allow_repeatsP == vector_utilities.UNPROVIDED) {
            allow_repeatsP = (SubLObject)vector_utilities.NIL;
        }
        if (test == vector_utilities.UNPROVIDED) {
            test = Symbols.symbol_function((SubLObject)vector_utilities.$sym6$TRUE);
        }
        assert vector_utilities.NIL != Types.sequencep(sequence) : sequence;
        assert vector_utilities.NIL != subl_promotions.non_negative_integer_p(n) : n;
        SubLObject sample_sequence = sequence;
        SubLObject sampled_items = (SubLObject)vector_utilities.NIL;
        if (sequence.isList() && Numbers.multiply(n, Sequences.length(sequence)).numGE((SubLObject)vector_utilities.$int11$100000)) {
            sample_sequence = Functions.apply(Symbols.symbol_function((SubLObject)vector_utilities.$sym3$VECTOR), sequence);
        }
        if (vector_utilities.NIL != allow_repeatsP) {
            SubLObject i;
            for (i = (SubLObject)vector_utilities.NIL, i = (SubLObject)vector_utilities.ZERO_INTEGER; i.numL(n); i = Numbers.add(i, (SubLObject)vector_utilities.ONE_INTEGER)) {
                sampled_items = (SubLObject)ConsesLow.cons(random_elt(sample_sequence, test), sampled_items);
            }
        }
        else {
            SubLObject sampled_set;
            for (sampled_set = set_contents.new_set_contents(n, Symbols.symbol_function((SubLObject)vector_utilities.EQL)); set_contents.set_contents_size(sampled_set).numL(n); sampled_set = set_contents.set_contents_add(random_elt(sample_sequence, test), sampled_set, Symbols.symbol_function((SubLObject)vector_utilities.EQL))) {}
            sampled_items = set_contents.set_contents_element_list(sampled_set);
        }
        if (sequence.isVector()) {
            sampled_items = Functions.apply(Symbols.symbol_function((SubLObject)vector_utilities.$sym3$VECTOR), sampled_items);
        }
        return sampled_items;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/vector-utilities.lisp", position = 7378L)
    public static SubLObject make_ndim_array(final SubLObject dim_x, final SubLObject dim_y) {
        final SubLObject base_vector = Vectors.make_vector(dim_x, (SubLObject)vector_utilities.UNPROVIDED);
        SubLObject i;
        for (i = (SubLObject)vector_utilities.NIL, i = (SubLObject)vector_utilities.ZERO_INTEGER; i.numL(dim_x); i = Numbers.add(i, (SubLObject)vector_utilities.ONE_INTEGER)) {
            Vectors.set_aref(base_vector, i, Vectors.make_vector(dim_y, (SubLObject)vector_utilities.UNPROVIDED));
        }
        return base_vector;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/vector-utilities.lisp", position = 7683L)
    public static SubLObject aref_ndim(final SubLObject base_vector, final SubLObject x, final SubLObject y) {
        return Vectors.aref(Vectors.aref(base_vector, x), y);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/vector-utilities.lisp", position = 7818L)
    public static SubLObject set_aref_ndim(final SubLObject base_vector, final SubLObject x, final SubLObject y, final SubLObject value) {
        return Vectors.set_aref(Vectors.aref(base_vector, x), y, value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/vector-utilities.lisp", position = 7976L)
    public static SubLObject f_2d_array_elements(final SubLObject v_2d_array) {
        SubLObject elements = (SubLObject)vector_utilities.NIL;
        final SubLObject backwardP_var = (SubLObject)vector_utilities.NIL;
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
        for (length = Sequences.length(v_2d_array), v_iteration = (SubLObject)vector_utilities.NIL, v_iteration = (SubLObject)vector_utilities.ZERO_INTEGER; v_iteration.numL(length); v_iteration = Numbers.add(v_iteration, (SubLObject)vector_utilities.ONE_INTEGER)) {
            element_num = ((vector_utilities.NIL != backwardP_var) ? Numbers.subtract(length, v_iteration, (SubLObject)vector_utilities.ONE_INTEGER) : v_iteration);
            subarray = (items_var = Vectors.aref(v_2d_array, element_num));
            if (items_var.isVector()) {
                vector_var_$1 = items_var;
                backwardP_var_$2 = (SubLObject)vector_utilities.NIL;
                for (length_$3 = Sequences.length(vector_var_$1), v_iteration_$4 = (SubLObject)vector_utilities.NIL, v_iteration_$4 = (SubLObject)vector_utilities.ZERO_INTEGER; v_iteration_$4.numL(length_$3); v_iteration_$4 = Numbers.add(v_iteration_$4, (SubLObject)vector_utilities.ONE_INTEGER)) {
                    element_num_$5 = ((vector_utilities.NIL != backwardP_var_$2) ? Numbers.subtract(length_$3, v_iteration_$4, (SubLObject)vector_utilities.ONE_INTEGER) : v_iteration_$4);
                    item = Vectors.aref(vector_var_$1, element_num_$5);
                    elements = (SubLObject)ConsesLow.cons(item, elements);
                }
            }
            else {
                cdolist_list_var = items_var;
                item2 = (SubLObject)vector_utilities.NIL;
                item2 = cdolist_list_var.first();
                while (vector_utilities.NIL != cdolist_list_var) {
                    elements = (SubLObject)ConsesLow.cons(item2, elements);
                    cdolist_list_var = cdolist_list_var.rest();
                    item2 = cdolist_list_var.first();
                }
            }
        }
        return elements;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/vector-utilities.lisp", position = 8138L)
    public static SubLObject f_3d_array_elements(final SubLObject v_3d_array) {
        SubLObject elements = (SubLObject)vector_utilities.NIL;
        final SubLObject backwardP_var = (SubLObject)vector_utilities.NIL;
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
        for (length = Sequences.length(v_3d_array), v_iteration = (SubLObject)vector_utilities.NIL, v_iteration = (SubLObject)vector_utilities.ZERO_INTEGER; v_iteration.numL(length); v_iteration = Numbers.add(v_iteration, (SubLObject)vector_utilities.ONE_INTEGER)) {
            element_num = ((vector_utilities.NIL != backwardP_var) ? Numbers.subtract(length, v_iteration, (SubLObject)vector_utilities.ONE_INTEGER) : v_iteration);
            v_2d_array = (vector_var_$6 = Vectors.aref(v_3d_array, element_num));
            backwardP_var_$7 = (SubLObject)vector_utilities.NIL;
            for (length_$8 = Sequences.length(vector_var_$6), v_iteration_$9 = (SubLObject)vector_utilities.NIL, v_iteration_$9 = (SubLObject)vector_utilities.ZERO_INTEGER; v_iteration_$9.numL(length_$8); v_iteration_$9 = Numbers.add(v_iteration_$9, (SubLObject)vector_utilities.ONE_INTEGER)) {
                element_num_$10 = ((vector_utilities.NIL != backwardP_var_$7) ? Numbers.subtract(length_$8, v_iteration_$9, (SubLObject)vector_utilities.ONE_INTEGER) : v_iteration_$9);
                array = (items_var = Vectors.aref(vector_var_$6, element_num_$10));
                if (items_var.isVector()) {
                    vector_var_$7 = items_var;
                    backwardP_var_$8 = (SubLObject)vector_utilities.NIL;
                    for (length_$9 = Sequences.length(vector_var_$7), v_iteration_$10 = (SubLObject)vector_utilities.NIL, v_iteration_$10 = (SubLObject)vector_utilities.ZERO_INTEGER; v_iteration_$10.numL(length_$9); v_iteration_$10 = Numbers.add(v_iteration_$10, (SubLObject)vector_utilities.ONE_INTEGER)) {
                        element_num_$11 = ((vector_utilities.NIL != backwardP_var_$8) ? Numbers.subtract(length_$9, v_iteration_$10, (SubLObject)vector_utilities.ONE_INTEGER) : v_iteration_$10);
                        item = Vectors.aref(vector_var_$7, element_num_$11);
                        elements = (SubLObject)ConsesLow.cons(item, elements);
                    }
                }
                else {
                    cdolist_list_var = items_var;
                    item2 = (SubLObject)vector_utilities.NIL;
                    item2 = cdolist_list_var.first();
                    while (vector_utilities.NIL != cdolist_list_var) {
                        elements = (SubLObject)ConsesLow.cons(item2, elements);
                        cdolist_list_var = cdolist_list_var.rest();
                        item2 = cdolist_list_var.first();
                    }
                }
            }
        }
        return elements;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/vector-utilities.lisp", position = 8327L)
    public static SubLObject byte_vector_p(final SubLObject v_object) {
        if (v_object.isVector()) {
            final SubLObject backwardP_var = (SubLObject)vector_utilities.NIL;
            SubLObject length;
            SubLObject v_iteration;
            SubLObject element_num;
            SubLObject item;
            for (length = Sequences.length(v_object), v_iteration = (SubLObject)vector_utilities.NIL, v_iteration = (SubLObject)vector_utilities.ZERO_INTEGER; v_iteration.numL(length); v_iteration = Numbers.add(v_iteration, (SubLObject)vector_utilities.ONE_INTEGER)) {
                element_num = ((vector_utilities.NIL != backwardP_var) ? Numbers.subtract(length, v_iteration, (SubLObject)vector_utilities.ONE_INTEGER) : v_iteration);
                item = Vectors.aref(v_object, element_num);
                if (vector_utilities.NIL == number_utilities.bytep(item)) {
                    return (SubLObject)vector_utilities.NIL;
                }
            }
            return (SubLObject)vector_utilities.T;
        }
        return (SubLObject)vector_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/vector-utilities.lisp", position = 8571L)
    public static SubLObject new_byte_vector_from_file(final SubLObject filename) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert vector_utilities.NIL != Types.stringp(filename) : filename;
        SubLObject byte_vector = (SubLObject)vector_utilities.NIL;
        SubLObject stream = (SubLObject)vector_utilities.NIL;
        try {
            final SubLObject _prev_bind_0 = stream_macros.$stream_requires_locking$.currentBinding(thread);
            try {
                stream_macros.$stream_requires_locking$.bind((SubLObject)vector_utilities.NIL, thread);
                stream = compatibility.open_binary(filename, (SubLObject)vector_utilities.$kw13$INPUT);
            }
            finally {
                stream_macros.$stream_requires_locking$.rebind(_prev_bind_0, thread);
            }
            if (!stream.isStream()) {
                Errors.error((SubLObject)vector_utilities.$str14$Unable_to_open__S, filename);
            }
            final SubLObject stream_$16 = stream;
            final SubLObject length = streams_high.file_length(stream_$16);
            byte_vector = Vectors.make_vector(length, (SubLObject)vector_utilities.UNPROVIDED);
            SubLObject i;
            for (i = (SubLObject)vector_utilities.NIL, i = (SubLObject)vector_utilities.ZERO_INTEGER; i.numL(length); i = Numbers.add(i, (SubLObject)vector_utilities.ONE_INTEGER)) {
                Vectors.set_aref(byte_vector, i, streams_high.read_byte(stream_$16, (SubLObject)vector_utilities.T, (SubLObject)vector_utilities.UNPROVIDED));
            }
        }
        finally {
            final SubLObject _prev_bind_2 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
            try {
                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)vector_utilities.T, thread);
                final SubLObject _values = Values.getValuesAsVector();
                if (stream.isStream()) {
                    streams_high.close(stream, (SubLObject)vector_utilities.UNPROVIDED);
                }
                Values.restoreValuesFromVector(_values);
            }
            finally {
                Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_2, thread);
            }
        }
        return byte_vector;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/vector-utilities.lisp", position = 8992L)
    public static SubLObject byte_vector_to_hex_char_string(final SubLObject byte_vector) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert vector_utilities.NIL != byte_vector_p(byte_vector) : byte_vector;
        SubLObject hex_char_string = (SubLObject)vector_utilities.NIL;
        SubLObject stream = (SubLObject)vector_utilities.NIL;
        try {
            stream = streams_high.make_private_string_output_stream();
            final SubLObject backwardP_var = (SubLObject)vector_utilities.NIL;
            SubLObject length;
            SubLObject v_iteration;
            SubLObject element_num;
            SubLObject v_byte;
            SubLObject high_char;
            SubLObject low_char;
            for (length = Sequences.length(byte_vector), v_iteration = (SubLObject)vector_utilities.NIL, v_iteration = (SubLObject)vector_utilities.ZERO_INTEGER; v_iteration.numL(length); v_iteration = Numbers.add(v_iteration, (SubLObject)vector_utilities.ONE_INTEGER)) {
                element_num = ((vector_utilities.NIL != backwardP_var) ? Numbers.subtract(length, v_iteration, (SubLObject)vector_utilities.ONE_INTEGER) : v_iteration);
                v_byte = Vectors.aref(byte_vector, element_num);
                thread.resetMultipleValues();
                high_char = byte_to_hex_chars(v_byte);
                low_char = thread.secondMultipleValue();
                thread.resetMultipleValues();
                streams_high.write_char(high_char, stream);
                streams_high.write_char(low_char, stream);
            }
            hex_char_string = streams_high.get_output_stream_string(stream);
        }
        finally {
            final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
            try {
                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)vector_utilities.T, thread);
                final SubLObject _values = Values.getValuesAsVector();
                streams_high.close(stream, (SubLObject)vector_utilities.UNPROVIDED);
                Values.restoreValuesFromVector(_values);
            }
            finally {
                Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
            }
        }
        return hex_char_string;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/vector-utilities.lisp", position = 9542L)
    public static SubLObject byte_vector_to_formatted_hex_char_string(final SubLObject byte_vector) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject byte_vector_length = Sequences.length(byte_vector);
        final SubLObject hex_string_length = Numbers.add((SubLObject)vector_utilities.ONE_INTEGER, number_utilities.f_2X(byte_vector_length), Numbers.floor(number_utilities.f_1_(byte_vector_length), (SubLObject)vector_utilities.FOUR_INTEGER));
        final SubLObject hex_string = Strings.make_string(hex_string_length, (SubLObject)vector_utilities.UNPROVIDED);
        SubLObject j = (SubLObject)vector_utilities.ZERO_INTEGER;
        final SubLObject backwardP_var = (SubLObject)vector_utilities.NIL;
        SubLObject length;
        SubLObject v_iteration;
        SubLObject i;
        SubLObject v_byte;
        SubLObject high_char;
        SubLObject low_char;
        for (length = Sequences.length(byte_vector), v_iteration = (SubLObject)vector_utilities.NIL, v_iteration = (SubLObject)vector_utilities.ZERO_INTEGER; v_iteration.numL(length); v_iteration = Numbers.add(v_iteration, (SubLObject)vector_utilities.ONE_INTEGER)) {
            i = ((vector_utilities.NIL != backwardP_var) ? Numbers.subtract(length, v_iteration, (SubLObject)vector_utilities.ONE_INTEGER) : v_iteration);
            v_byte = Vectors.aref(byte_vector, i);
            if (Numbers.mod(i, (SubLObject)vector_utilities.$int16$32).isZero()) {
                Vectors.set_aref(hex_string, j, (SubLObject)Characters.CHAR_newline);
                j = Numbers.add(j, (SubLObject)vector_utilities.ONE_INTEGER);
            }
            else if (Numbers.mod(i, (SubLObject)vector_utilities.FOUR_INTEGER).isZero()) {
                Vectors.set_aref(hex_string, j, (SubLObject)Characters.CHAR_space);
                j = Numbers.add(j, (SubLObject)vector_utilities.ONE_INTEGER);
            }
            thread.resetMultipleValues();
            high_char = byte_to_hex_chars(v_byte);
            low_char = thread.secondMultipleValue();
            thread.resetMultipleValues();
            Vectors.set_aref(hex_string, j, high_char);
            j = Numbers.add(j, (SubLObject)vector_utilities.ONE_INTEGER);
            Vectors.set_aref(hex_string, j, low_char);
            j = Numbers.add(j, (SubLObject)vector_utilities.ONE_INTEGER);
        }
        if (vector_utilities.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && !j.numE(hex_string_length)) {
            Errors.error((SubLObject)vector_utilities.$str17$Did_not_fill_up_all_the_expected_, j, hex_string_length);
        }
        return hex_string;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/vector-utilities.lisp", position = 10896L)
    public static SubLObject byte_vector_to_string(final SubLObject byte_vector) {
        assert vector_utilities.NIL != byte_vector_p(byte_vector) : byte_vector;
        final SubLObject length = Sequences.length(byte_vector);
        final SubLObject string = Strings.make_string(length, (SubLObject)vector_utilities.UNPROVIDED);
        final SubLObject backwardP_var = (SubLObject)vector_utilities.NIL;
        SubLObject length_$17;
        SubLObject v_iteration;
        SubLObject index;
        SubLObject v_byte;
        for (length_$17 = Sequences.length(byte_vector), v_iteration = (SubLObject)vector_utilities.NIL, v_iteration = (SubLObject)vector_utilities.ZERO_INTEGER; v_iteration.numL(length_$17); v_iteration = Numbers.add(v_iteration, (SubLObject)vector_utilities.ONE_INTEGER)) {
            index = ((vector_utilities.NIL != backwardP_var) ? Numbers.subtract(length_$17, v_iteration, (SubLObject)vector_utilities.ONE_INTEGER) : v_iteration);
            v_byte = Vectors.aref(byte_vector, index);
            Strings.set_char(string, index, Characters.code_char(v_byte));
        }
        return string;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/vector-utilities.lisp", position = 11297L)
    public static SubLObject hex_char_string_to_byte_vector(final SubLObject hex_char_string) {
        assert vector_utilities.NIL != string_utilities.hex_char_string_p(hex_char_string) : hex_char_string;
        final SubLObject string_length = Sequences.length(hex_char_string);
        assert vector_utilities.NIL != Numbers.evenp(string_length) : string_length;
        final SubLObject byte_vector_length = Numbers.integerDivide(string_length, (SubLObject)vector_utilities.TWO_INTEGER);
        final SubLObject byte_vector = Vectors.make_vector(byte_vector_length, (SubLObject)vector_utilities.UNPROVIDED);
        SubLObject i;
        SubLObject string_index;
        SubLObject high_char;
        SubLObject low_char;
        SubLObject v_byte;
        for (i = (SubLObject)vector_utilities.NIL, i = (SubLObject)vector_utilities.ZERO_INTEGER; i.numL(byte_vector_length); i = Numbers.add(i, (SubLObject)vector_utilities.ONE_INTEGER)) {
            string_index = Numbers.multiply((SubLObject)vector_utilities.TWO_INTEGER, i);
            high_char = Strings.sublisp_char(hex_char_string, string_index);
            low_char = Strings.sublisp_char(hex_char_string, Numbers.add((SubLObject)vector_utilities.ONE_INTEGER, string_index));
            v_byte = hex_chars_to_byte(high_char, low_char);
            Vectors.set_aref(byte_vector, i, v_byte);
        }
        return byte_vector;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/vector-utilities.lisp", position = 12019L)
    public static SubLObject byte_to_hex_chars(final SubLObject v_byte) {
        final SubLObject high_nybble = Numbers.integerDivide(v_byte, (SubLObject)vector_utilities.SIXTEEN_INTEGER);
        final SubLObject low_nybble = Numbers.mod(v_byte, (SubLObject)vector_utilities.SIXTEEN_INTEGER);
        return Values.values(string_utilities.hex_char(high_nybble), string_utilities.hex_char(low_nybble));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/vector-utilities.lisp", position = 12216L)
    public static SubLObject hex_chars_to_byte(final SubLObject high_char, final SubLObject low_char) {
        final SubLObject high_nybble = string_utilities.hex_char_value(high_char);
        final SubLObject low_nybble = string_utilities.hex_char_value(low_char);
        return Numbers.add(Numbers.multiply((SubLObject)vector_utilities.SIXTEEN_INTEGER, high_nybble), low_nybble);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/vector-utilities.lisp", position = 12418L)
    public static SubLObject byte_vector_to_64_bit_char_string(final SubLObject byte_vector) {
        assert vector_utilities.NIL != byte_vector_p(byte_vector) : byte_vector;
        SubLObject i = (SubLObject)vector_utilities.ZERO_INTEGER;
        SubLObject v_64_bit_char_string = (SubLObject)vector_utilities.NIL;
        SubLObject high_byte = (SubLObject)vector_utilities.NIL;
        SubLObject middle_byte = (SubLObject)vector_utilities.NIL;
        SubLObject stream = (SubLObject)vector_utilities.NIL;
        try {
            stream = streams_high.make_private_string_output_stream();
            final SubLObject backwardP_var = (SubLObject)vector_utilities.NIL;
            SubLObject length;
            SubLObject v_iteration;
            SubLObject element_num;
            SubLObject v_byte;
            SubLObject pcase_var;
            SubLObject low_byte;
            for (length = Sequences.length(byte_vector), v_iteration = (SubLObject)vector_utilities.NIL, v_iteration = (SubLObject)vector_utilities.ZERO_INTEGER; v_iteration.numL(length); v_iteration = Numbers.add(v_iteration, (SubLObject)vector_utilities.ONE_INTEGER)) {
                element_num = ((vector_utilities.NIL != backwardP_var) ? Numbers.subtract(length, v_iteration, (SubLObject)vector_utilities.ONE_INTEGER) : v_iteration);
                v_byte = Vectors.aref(byte_vector, element_num);
                pcase_var = i;
                if (pcase_var.eql((SubLObject)vector_utilities.ZERO_INTEGER)) {
                    high_byte = v_byte;
                }
                else if (pcase_var.eql((SubLObject)vector_utilities.ONE_INTEGER)) {
                    middle_byte = v_byte;
                }
                else if (pcase_var.eql((SubLObject)vector_utilities.TWO_INTEGER)) {
                    low_byte = v_byte;
                    write_bytes_as_64_bit_chars(high_byte, middle_byte, low_byte, stream);
                    i = (SubLObject)vector_utilities.MINUS_ONE_INTEGER;
                }
                i = Numbers.add(i, (SubLObject)vector_utilities.ONE_INTEGER);
            }
            final SubLObject pcase_var2 = i;
            if (!pcase_var2.eql((SubLObject)vector_utilities.ZERO_INTEGER)) {
                if (pcase_var2.eql((SubLObject)vector_utilities.ONE_INTEGER)) {
                    middle_byte = (SubLObject)vector_utilities.NIL;
                    final SubLObject low_byte2 = (SubLObject)vector_utilities.NIL;
                    write_bytes_as_64_bit_chars(high_byte, middle_byte, low_byte2, stream);
                }
                else if (pcase_var2.eql((SubLObject)vector_utilities.TWO_INTEGER)) {
                    final SubLObject low_byte2 = (SubLObject)vector_utilities.NIL;
                    write_bytes_as_64_bit_chars(high_byte, middle_byte, low_byte2, stream);
                }
            }
            v_64_bit_char_string = streams_high.get_output_stream_string(stream);
        }
        finally {
            final SubLObject _prev_bind_0 = Dynamic.currentBinding(Threads.$is_thread_performing_cleanupP$);
            try {
                Dynamic.bind(Threads.$is_thread_performing_cleanupP$, (SubLObject)vector_utilities.T);
                final SubLObject _values = Values.getValuesAsVector();
                streams_high.close(stream, (SubLObject)vector_utilities.UNPROVIDED);
                Values.restoreValuesFromVector(_values);
            }
            finally {
                Dynamic.rebind(Threads.$is_thread_performing_cleanupP$, _prev_bind_0);
            }
        }
        return v_64_bit_char_string;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/vector-utilities.lisp", position = 13244L)
    public static SubLObject write_bytes_as_64_bit_chars(final SubLObject high_byte, final SubLObject middle_byte, final SubLObject low_byte, final SubLObject stream) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        thread.resetMultipleValues();
        final SubLObject highest_char = bytes_to_64_bit_chars(high_byte, middle_byte, low_byte);
        final SubLObject high_char = thread.secondMultipleValue();
        final SubLObject low_char = thread.thirdMultipleValue();
        final SubLObject lowest_char = thread.fourthMultipleValue();
        thread.resetMultipleValues();
        streams_high.write_char(highest_char, stream);
        streams_high.write_char(high_char, stream);
        if (vector_utilities.NIL != low_char) {
            streams_high.write_char(low_char, stream);
        }
        if (vector_utilities.NIL != lowest_char) {
            streams_high.write_char(lowest_char, stream);
        }
        return stream;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/vector-utilities.lisp", position = 13663L)
    public static SubLObject bytes_to_64_bit_chars(final SubLObject high_byte, SubLObject middle_byte, SubLObject low_byte) {
        SubLObject nil_count = (SubLObject)vector_utilities.ZERO_INTEGER;
        if (vector_utilities.NIL == low_byte) {
            low_byte = (SubLObject)vector_utilities.ZERO_INTEGER;
            nil_count = Numbers.add(nil_count, (SubLObject)vector_utilities.ONE_INTEGER);
        }
        if (vector_utilities.NIL == middle_byte) {
            middle_byte = (SubLObject)vector_utilities.ZERO_INTEGER;
            nil_count = Numbers.add(nil_count, (SubLObject)vector_utilities.ONE_INTEGER);
        }
        final SubLObject aaaaaa = bytes.ldb(bytes.sublisp_byte((SubLObject)vector_utilities.SIX_INTEGER, (SubLObject)vector_utilities.TWO_INTEGER), high_byte);
        final SubLObject bb = bytes.ldb(bytes.sublisp_byte((SubLObject)vector_utilities.TWO_INTEGER, (SubLObject)vector_utilities.ZERO_INTEGER), high_byte);
        final SubLObject bbbb = bytes.ldb(bytes.sublisp_byte((SubLObject)vector_utilities.FOUR_INTEGER, (SubLObject)vector_utilities.FOUR_INTEGER), middle_byte);
        final SubLObject cccc = bytes.ldb(bytes.sublisp_byte((SubLObject)vector_utilities.FOUR_INTEGER, (SubLObject)vector_utilities.ZERO_INTEGER), middle_byte);
        final SubLObject cc = bytes.ldb(bytes.sublisp_byte((SubLObject)vector_utilities.TWO_INTEGER, (SubLObject)vector_utilities.SIX_INTEGER), low_byte);
        final SubLObject dddddd = bytes.ldb(bytes.sublisp_byte((SubLObject)vector_utilities.SIX_INTEGER, (SubLObject)vector_utilities.ZERO_INTEGER), low_byte);
        final SubLObject bbbbbb = Numbers.add(Numbers.ash(bb, (SubLObject)vector_utilities.FOUR_INTEGER), bbbb);
        final SubLObject cccccc = Numbers.add(Numbers.ash(cccc, (SubLObject)vector_utilities.TWO_INTEGER), cc);
        final SubLObject highest_char = string_utilities.f_64_bit_char(aaaaaa);
        final SubLObject high_char = string_utilities.f_64_bit_char(bbbbbb);
        SubLObject low_char = string_utilities.f_64_bit_char(cccccc);
        SubLObject lowest_char = string_utilities.f_64_bit_char(dddddd);
        if (nil_count.numG((SubLObject)vector_utilities.ZERO_INTEGER)) {
            lowest_char = (SubLObject)vector_utilities.NIL;
            if (nil_count.numG((SubLObject)vector_utilities.ONE_INTEGER)) {
                low_char = (SubLObject)vector_utilities.NIL;
            }
        }
        return Values.values(highest_char, high_char, low_char, lowest_char);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/vector-utilities.lisp", position = 14829L)
    public static SubLObject f_64_bit_chars_to_bytes(final SubLObject highest_char, final SubLObject high_char, SubLObject low_char, SubLObject lowest_char) {
        SubLObject nil_count = (SubLObject)vector_utilities.ZERO_INTEGER;
        if (vector_utilities.NIL == lowest_char || vector_utilities.NIL != Characters.charE((SubLObject)Characters.CHAR_equal, lowest_char)) {
            lowest_char = (SubLObject)Characters.CHAR_A;
            nil_count = Numbers.add(nil_count, (SubLObject)vector_utilities.ONE_INTEGER);
        }
        if (vector_utilities.NIL == low_char || vector_utilities.NIL != Characters.charE((SubLObject)Characters.CHAR_equal, low_char)) {
            low_char = (SubLObject)Characters.CHAR_A;
            nil_count = Numbers.add(nil_count, (SubLObject)vector_utilities.ONE_INTEGER);
        }
        final SubLObject aaaaaa = string_utilities.f_64_bit_char_value(highest_char);
        final SubLObject bbbbbb = string_utilities.f_64_bit_char_value(high_char);
        final SubLObject cccccc = string_utilities.f_64_bit_char_value(low_char);
        final SubLObject dddddd = string_utilities.f_64_bit_char_value(lowest_char);
        final SubLObject bb = bytes.ldb(bytes.sublisp_byte((SubLObject)vector_utilities.TWO_INTEGER, (SubLObject)vector_utilities.FOUR_INTEGER), bbbbbb);
        final SubLObject bbbb = bytes.ldb(bytes.sublisp_byte((SubLObject)vector_utilities.FOUR_INTEGER, (SubLObject)vector_utilities.ZERO_INTEGER), bbbbbb);
        final SubLObject cccc = bytes.ldb(bytes.sublisp_byte((SubLObject)vector_utilities.FOUR_INTEGER, (SubLObject)vector_utilities.TWO_INTEGER), cccccc);
        final SubLObject cc = bytes.ldb(bytes.sublisp_byte((SubLObject)vector_utilities.TWO_INTEGER, (SubLObject)vector_utilities.ZERO_INTEGER), cccccc);
        final SubLObject high_byte = Numbers.add(Numbers.ash(aaaaaa, (SubLObject)vector_utilities.TWO_INTEGER), bb);
        SubLObject middle_byte = Numbers.add(Numbers.ash(bbbb, (SubLObject)vector_utilities.FOUR_INTEGER), cccc);
        SubLObject low_byte = Numbers.add(Numbers.ash(cc, (SubLObject)vector_utilities.SIX_INTEGER), dddddd);
        if (nil_count.numG((SubLObject)vector_utilities.ZERO_INTEGER)) {
            low_byte = (SubLObject)vector_utilities.NIL;
            if (nil_count.numG((SubLObject)vector_utilities.ONE_INTEGER)) {
                middle_byte = (SubLObject)vector_utilities.NIL;
            }
        }
        return Values.values(high_byte, middle_byte, low_byte);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/vector-utilities.lisp", position = 16111L)
    public static SubLObject f_64_bit_char_string_to_byte_vector(final SubLObject v_64_bit_string) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert vector_utilities.NIL != string_utilities.f_64_bit_string_p(v_64_bit_string) : v_64_bit_string;
        final SubLObject string_length = Sequences.length(v_64_bit_string);
        final SubLObject tuples_length = f_64_bit_string_tuples_length(v_64_bit_string);
        final SubLObject vector_length = f_64_bit_string_byte_vector_length(v_64_bit_string);
        final SubLObject byte_vector = Vectors.make_vector(vector_length, (SubLObject)vector_utilities.UNPROVIDED);
        SubLObject string_index = (SubLObject)vector_utilities.ZERO_INTEGER;
        SubLObject vector_index = (SubLObject)vector_utilities.ZERO_INTEGER;
        SubLObject highest_char = (SubLObject)vector_utilities.NIL;
        SubLObject high_char = (SubLObject)vector_utilities.NIL;
        SubLObject low_char = (SubLObject)vector_utilities.NIL;
        SubLObject lowest_char = (SubLObject)vector_utilities.NIL;
        SubLObject i;
        SubLObject high_byte;
        SubLObject middle_byte;
        SubLObject low_byte;
        for (i = (SubLObject)vector_utilities.NIL, i = (SubLObject)vector_utilities.ZERO_INTEGER; i.numL(tuples_length); i = Numbers.add(i, (SubLObject)vector_utilities.ONE_INTEGER)) {
            highest_char = Strings.sublisp_char(v_64_bit_string, string_index);
            string_index = Numbers.add(string_index, (SubLObject)vector_utilities.ONE_INTEGER);
            high_char = Strings.sublisp_char(v_64_bit_string, string_index);
            string_index = Numbers.add(string_index, (SubLObject)vector_utilities.ONE_INTEGER);
            low_char = (SubLObject)(string_index.numL(string_length) ? Strings.sublisp_char(v_64_bit_string, string_index) : vector_utilities.NIL);
            string_index = Numbers.add(string_index, (SubLObject)vector_utilities.ONE_INTEGER);
            lowest_char = (SubLObject)(string_index.numL(string_length) ? Strings.sublisp_char(v_64_bit_string, string_index) : vector_utilities.NIL);
            string_index = Numbers.add(string_index, (SubLObject)vector_utilities.ONE_INTEGER);
            thread.resetMultipleValues();
            high_byte = f_64_bit_chars_to_bytes(highest_char, high_char, low_char, lowest_char);
            middle_byte = thread.secondMultipleValue();
            low_byte = thread.thirdMultipleValue();
            thread.resetMultipleValues();
            Vectors.set_aref(byte_vector, vector_index, high_byte);
            vector_index = Numbers.add(vector_index, (SubLObject)vector_utilities.ONE_INTEGER);
            if (vector_utilities.NIL != middle_byte) {
                Vectors.set_aref(byte_vector, vector_index, middle_byte);
                vector_index = Numbers.add(vector_index, (SubLObject)vector_utilities.ONE_INTEGER);
            }
            if (vector_utilities.NIL != low_byte) {
                Vectors.set_aref(byte_vector, vector_index, low_byte);
                vector_index = Numbers.add(vector_index, (SubLObject)vector_utilities.ONE_INTEGER);
            }
        }
        return byte_vector;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/vector-utilities.lisp", position = 17481L)
    public static SubLObject f_64_bit_string_tuples_length(final SubLObject v_64_bit_string) {
        assert vector_utilities.NIL != Types.stringp(v_64_bit_string) : v_64_bit_string;
        final SubLObject string_length = Sequences.length(v_64_bit_string);
        return Numbers.ceiling(string_length, (SubLObject)vector_utilities.FOUR_INTEGER);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/vector-utilities.lisp", position = 17666L)
    public static SubLObject f_64_bit_string_byte_vector_length(final SubLObject v_64_bit_string) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert vector_utilities.NIL != Types.stringp(v_64_bit_string) : v_64_bit_string;
        final SubLObject string_length = Sequences.length(v_64_bit_string);
        if (string_length.isZero()) {
            return (SubLObject)vector_utilities.ZERO_INTEGER;
        }
        thread.resetMultipleValues();
        final SubLObject tuples_length = f_64_bit_string_tuples_length(v_64_bit_string);
        final SubLObject excess = thread.secondMultipleValue();
        thread.resetMultipleValues();
        SubLObject vector_length = Numbers.multiply((SubLObject)vector_utilities.THREE_INTEGER, number_utilities.f_1_(tuples_length));
        if (!excess.isZero()) {
            vector_length = Numbers.add(vector_length, Numbers.add(excess, (SubLObject)vector_utilities.THREE_INTEGER));
        }
        else if (vector_utilities.NIL == Characters.charE((SubLObject)Characters.CHAR_equal, Strings.sublisp_char(v_64_bit_string, Numbers.subtract(string_length, (SubLObject)vector_utilities.ONE_INTEGER)))) {
            vector_length = Numbers.add(vector_length, (SubLObject)vector_utilities.THREE_INTEGER);
        }
        else if (vector_utilities.NIL == Characters.charE((SubLObject)Characters.CHAR_equal, Strings.sublisp_char(v_64_bit_string, Numbers.subtract(string_length, (SubLObject)vector_utilities.TWO_INTEGER)))) {
            vector_length = Numbers.add(vector_length, (SubLObject)vector_utilities.TWO_INTEGER);
        }
        else {
            vector_length = Numbers.add(vector_length, (SubLObject)vector_utilities.ONE_INTEGER);
        }
        return vector_length;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/vector-utilities.lisp", position = 18807L)
    public static SubLObject binary_search_vector_subrange_wXduplicates(final SubLObject item, final SubLObject vector, final SubLObject start, final SubLObject end, final SubLObject compare, SubLObject test, SubLObject key, SubLObject deleted_test) {
        if (test == vector_utilities.UNPROVIDED) {
            test = Symbols.symbol_function((SubLObject)vector_utilities.EQL);
        }
        if (key == vector_utilities.UNPROVIDED) {
            key = Symbols.symbol_function((SubLObject)vector_utilities.IDENTITY);
        }
        if (deleted_test == vector_utilities.UNPROVIDED) {
            deleted_test = (SubLObject)vector_utilities.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        thread.resetMultipleValues();
        SubLObject low = binary_search_vector_subrange(item, vector, start, end, compare, test, key, deleted_test);
        SubLObject high = thread.secondMultipleValue();
        thread.resetMultipleValues();
        if (low.numE(high)) {
            final SubLObject exemplar = Functions.funcall(key, Vectors.aref(vector, low));
            for (SubLObject doneP = (SubLObject)SubLObjectFactory.makeBoolean(!low.isPositive()); vector_utilities.NIL == doneP; doneP = (SubLObject)SubLObjectFactory.makeBoolean(vector_utilities.NIL != doneP || !low.isPositive())) {
                final SubLObject lower = Numbers.subtract(low, (SubLObject)vector_utilities.ONE_INTEGER);
                final SubLObject candidate = Functions.funcall(key, Vectors.aref(vector, lower));
                if (vector_utilities.NIL != Functions.funcall(test, exemplar, candidate)) {
                    low = lower;
                }
                else {
                    doneP = (SubLObject)vector_utilities.T;
                }
            }
            for (SubLObject last = Numbers.subtract(end, (SubLObject)vector_utilities.ONE_INTEGER), doneP = (SubLObject)SubLObjectFactory.makeBoolean(!high.numL(last)); vector_utilities.NIL == doneP; doneP = (SubLObject)SubLObjectFactory.makeBoolean(vector_utilities.NIL != doneP || !high.numL(last))) {
                final SubLObject higher = Numbers.add(high, (SubLObject)vector_utilities.ONE_INTEGER);
                final SubLObject candidate2 = Functions.funcall(key, Vectors.aref(vector, higher));
                if (vector_utilities.NIL != Functions.funcall(test, exemplar, candidate2)) {
                    high = higher;
                }
                else {
                    doneP = (SubLObject)vector_utilities.T;
                }
            }
            return Values.values(low, high, (SubLObject)vector_utilities.T);
        }
        if (low.numE(end)) {
            return Values.values(low, high, (SubLObject)vector_utilities.NIL);
        }
        final SubLObject low_elt = Functions.funcall(key, Vectors.aref(vector, low));
        if (vector_utilities.NIL != Functions.funcall(compare, item, low_elt)) {
            return Values.values(Numbers.subtract(low, (SubLObject)vector_utilities.ONE_INTEGER), Numbers.subtract(high, (SubLObject)vector_utilities.ONE_INTEGER), (SubLObject)vector_utilities.NIL);
        }
        return Values.values(low, high, (SubLObject)vector_utilities.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/vector-utilities.lisp", position = 21468L)
    public static SubLObject test_binary_search_vector_subrange_wXduplicate_structures(final SubLObject item, final SubLObject vector, final SubLObject start, final SubLObject end, final SubLObject compare, final SubLObject key) {
        return Values.arg2(Values.resetMultipleValues(), (SubLObject)Values.multiple_value_list(binary_search_vector_subrange_wXduplicates(item, vector, start, end, compare, (SubLObject)vector_utilities.EQL, key, (SubLObject)vector_utilities.UNPROVIDED)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/vector-utilities.lisp", position = 21708L)
    public static SubLObject test_binary_search_vector_subrange_wXduplicates(final SubLObject item, final SubLObject vector, final SubLObject start, final SubLObject end, final SubLObject compare) {
        return Values.arg2(Values.resetMultipleValues(), (SubLObject)Values.multiple_value_list(binary_search_vector_subrange_wXduplicates(item, vector, start, end, compare, (SubLObject)vector_utilities.UNPROVIDED, (SubLObject)vector_utilities.UNPROVIDED, (SubLObject)vector_utilities.UNPROVIDED)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/vector-utilities.lisp", position = 21925L)
    public static SubLObject binary_search_vector_subrange(final SubLObject item, final SubLObject vector, final SubLObject start, final SubLObject end, final SubLObject compare, SubLObject test, SubLObject key, SubLObject deleted_test) {
        if (test == vector_utilities.UNPROVIDED) {
            test = Symbols.symbol_function((SubLObject)vector_utilities.EQL);
        }
        if (key == vector_utilities.UNPROVIDED) {
            key = Symbols.symbol_function((SubLObject)vector_utilities.IDENTITY);
        }
        if (deleted_test == vector_utilities.UNPROVIDED) {
            deleted_test = (SubLObject)vector_utilities.NIL;
        }
        return binary_search_vector_int(item, vector, start, end, compare, test, key, deleted_test);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/vector-utilities.lisp", position = 22340L)
    public static SubLObject binary_search_vector_range(final SubLObject item, final SubLObject vector, final SubLObject compare, SubLObject test, SubLObject key, SubLObject deleted_test) {
        if (test == vector_utilities.UNPROVIDED) {
            test = Symbols.symbol_function((SubLObject)vector_utilities.EQL);
        }
        if (key == vector_utilities.UNPROVIDED) {
            key = Symbols.symbol_function((SubLObject)vector_utilities.IDENTITY);
        }
        if (deleted_test == vector_utilities.UNPROVIDED) {
            deleted_test = (SubLObject)vector_utilities.NIL;
        }
        return binary_search_vector_int(item, vector, (SubLObject)vector_utilities.ZERO_INTEGER, Sequences.length(vector), compare, test, key, deleted_test);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/vector-utilities.lisp", position = 22747L)
    public static SubLObject binary_search_vector(final SubLObject item, final SubLObject vector, final SubLObject compare, SubLObject test, SubLObject key, SubLObject deleted_test) {
        if (test == vector_utilities.UNPROVIDED) {
            test = Symbols.symbol_function((SubLObject)vector_utilities.EQL);
        }
        if (key == vector_utilities.UNPROVIDED) {
            key = Symbols.symbol_function((SubLObject)vector_utilities.IDENTITY);
        }
        if (deleted_test == vector_utilities.UNPROVIDED) {
            deleted_test = (SubLObject)vector_utilities.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        thread.resetMultipleValues();
        final SubLObject low = binary_search_vector_int(item, vector, (SubLObject)vector_utilities.ZERO_INTEGER, Sequences.length(vector), compare, test, key, deleted_test);
        final SubLObject high = thread.secondMultipleValue();
        thread.resetMultipleValues();
        if (low.numE(high)) {
            return low;
        }
        return (SubLObject)vector_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/vector-utilities.lisp", position = 23092L)
    public static SubLObject binary_search_vector_int(final SubLObject item, final SubLObject vector, SubLObject start, SubLObject end, final SubLObject compare, final SubLObject test, final SubLObject key, final SubLObject deleted_test) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        while (!start.numE(end)) {
            if (!start.numL(end)) {
                return Values.values(end, start);
            }
            final SubLObject mid = Numbers.integerDivide(Numbers.add(start, end), (SubLObject)vector_utilities.TWO_INTEGER);
            final SubLObject elt = Vectors.aref(vector, mid);
            if (vector_utilities.NIL == deleted_test || vector_utilities.NIL == Functions.funcall(deleted_test, elt)) {
                final SubLObject value = Functions.funcall(key, elt);
                if (vector_utilities.NIL != Functions.funcall(test, item, value)) {
                    return Values.values(mid, mid);
                }
                if (vector_utilities.NIL != Functions.funcall(compare, item, value)) {
                    end = mid;
                }
                else {
                    start = Numbers.add(mid, (SubLObject)vector_utilities.ONE_INTEGER);
                }
            }
            else {
                thread.resetMultipleValues();
                final SubLObject low = binary_search_vector_int(item, vector, start, mid, compare, test, key, deleted_test);
                final SubLObject high = thread.secondMultipleValue();
                thread.resetMultipleValues();
                if (low.numE(high)) {
                    return Values.values(low, high);
                }
                return binary_search_vector_int(item, vector, Numbers.add(mid, (SubLObject)vector_utilities.ONE_INTEGER), end, compare, test, key, deleted_test);
            }
        }
        return Values.values(start, Numbers.add(end, (SubLObject)vector_utilities.ONE_INTEGER));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/vector-utilities.lisp", position = 24038L)
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
        if (high_byte.eql(new_high_byte) && middle_byte.eql(new_middle_byte) && low_byte.eql(new_low_byte)) {
            return (SubLObject)vector_utilities.T;
        }
        return Errors.error((SubLObject)vector_utilities.$str35$Failure_on__S__S__S, high_byte, middle_byte, low_byte);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/vector-utilities.lisp", position = 24038L)
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
        if (vector_utilities.NIL != Characters.charE(highest_char, new_highest_char) && vector_utilities.NIL != Characters.charE(high_char, new_high_char) && vector_utilities.NIL != Characters.charE(low_char, new_low_char) && vector_utilities.NIL != Characters.charE(lowest_char, new_lowest_char)) {
            return (SubLObject)vector_utilities.T;
        }
        return Errors.error((SubLObject)vector_utilities.$str36$Failure_on__S__S__S__S, new SubLObject[] { highest_char, high_char, low_char, lowest_char });
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/vector-utilities.lisp", position = 24038L)
    public static SubLObject test_bytes_to_64_bit_chars(SubLObject n) {
        if (n == vector_utilities.UNPROVIDED) {
            n = (SubLObject)vector_utilities.$int11$100000;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject _prev_bind_0 = utilities_macros.$progress_note$.currentBinding(thread);
        final SubLObject _prev_bind_2 = utilities_macros.$progress_start_time$.currentBinding(thread);
        final SubLObject _prev_bind_3 = utilities_macros.$progress_total$.currentBinding(thread);
        final SubLObject _prev_bind_4 = utilities_macros.$progress_sofar$.currentBinding(thread);
        final SubLObject _prev_bind_5 = utilities_macros.$last_percent_progress_index$.currentBinding(thread);
        final SubLObject _prev_bind_6 = utilities_macros.$last_percent_progress_prediction$.currentBinding(thread);
        final SubLObject _prev_bind_7 = utilities_macros.$within_noting_percent_progress$.currentBinding(thread);
        final SubLObject _prev_bind_8 = utilities_macros.$percent_progress_start_time$.currentBinding(thread);
        try {
            utilities_macros.$progress_note$.bind((SubLObject)vector_utilities.$str37$cdotimes, thread);
            utilities_macros.$progress_start_time$.bind(Time.get_universal_time(), thread);
            utilities_macros.$progress_total$.bind(n, thread);
            utilities_macros.$progress_sofar$.bind((SubLObject)vector_utilities.ZERO_INTEGER, thread);
            utilities_macros.$last_percent_progress_index$.bind((SubLObject)vector_utilities.ZERO_INTEGER, thread);
            utilities_macros.$last_percent_progress_prediction$.bind((SubLObject)vector_utilities.NIL, thread);
            utilities_macros.$within_noting_percent_progress$.bind((SubLObject)vector_utilities.T, thread);
            utilities_macros.$percent_progress_start_time$.bind(Time.get_universal_time(), thread);
            try {
                utilities_macros.noting_percent_progress_preamble(utilities_macros.$progress_note$.getDynamicValue(thread));
                SubLObject i;
                SubLObject nil_count;
                SubLObject high_byte;
                SubLObject middle_byte;
                SubLObject low_byte;
                for (i = (SubLObject)vector_utilities.NIL, i = (SubLObject)vector_utilities.ZERO_INTEGER; i.numL(utilities_macros.$progress_total$.getDynamicValue(thread)); i = Numbers.add(i, (SubLObject)vector_utilities.ONE_INTEGER)) {
                    nil_count = random.random((SubLObject)vector_utilities.THREE_INTEGER);
                    high_byte = random.random((SubLObject)vector_utilities.$int38$256);
                    middle_byte = (SubLObject)(nil_count.numG((SubLObject)vector_utilities.ONE_INTEGER) ? vector_utilities.NIL : random.random((SubLObject)vector_utilities.$int38$256));
                    low_byte = (SubLObject)(nil_count.numG((SubLObject)vector_utilities.ZERO_INTEGER) ? vector_utilities.NIL : random.random((SubLObject)vector_utilities.$int38$256));
                    test_bytes_to_64_bit_chars_once(high_byte, middle_byte, low_byte);
                    utilities_macros.$progress_sofar$.setDynamicValue(Numbers.add(utilities_macros.$progress_sofar$.getDynamicValue(thread), (SubLObject)vector_utilities.ONE_INTEGER), thread);
                    utilities_macros.note_percent_progress(utilities_macros.$progress_sofar$.getDynamicValue(thread), utilities_macros.$progress_total$.getDynamicValue(thread));
                }
            }
            finally {
                final SubLObject _prev_bind_0_$18 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)vector_utilities.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    utilities_macros.noting_percent_progress_postamble();
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$18, thread);
                }
            }
        }
        finally {
            utilities_macros.$percent_progress_start_time$.rebind(_prev_bind_8, thread);
            utilities_macros.$within_noting_percent_progress$.rebind(_prev_bind_7, thread);
            utilities_macros.$last_percent_progress_prediction$.rebind(_prev_bind_6, thread);
            utilities_macros.$last_percent_progress_index$.rebind(_prev_bind_5, thread);
            utilities_macros.$progress_sofar$.rebind(_prev_bind_4, thread);
            utilities_macros.$progress_total$.rebind(_prev_bind_3, thread);
            utilities_macros.$progress_start_time$.rebind(_prev_bind_2, thread);
            utilities_macros.$progress_note$.rebind(_prev_bind_0, thread);
        }
        return (SubLObject)vector_utilities.T;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/vector-utilities.lisp", position = 24038L)
    public static SubLObject test_64_bit_chars_to_bytes(SubLObject n) {
        if (n == vector_utilities.UNPROVIDED) {
            n = (SubLObject)vector_utilities.$int11$100000;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject _prev_bind_0 = utilities_macros.$progress_note$.currentBinding(thread);
        final SubLObject _prev_bind_2 = utilities_macros.$progress_start_time$.currentBinding(thread);
        final SubLObject _prev_bind_3 = utilities_macros.$progress_total$.currentBinding(thread);
        final SubLObject _prev_bind_4 = utilities_macros.$progress_sofar$.currentBinding(thread);
        final SubLObject _prev_bind_5 = utilities_macros.$last_percent_progress_index$.currentBinding(thread);
        final SubLObject _prev_bind_6 = utilities_macros.$last_percent_progress_prediction$.currentBinding(thread);
        final SubLObject _prev_bind_7 = utilities_macros.$within_noting_percent_progress$.currentBinding(thread);
        final SubLObject _prev_bind_8 = utilities_macros.$percent_progress_start_time$.currentBinding(thread);
        try {
            utilities_macros.$progress_note$.bind((SubLObject)vector_utilities.$str37$cdotimes, thread);
            utilities_macros.$progress_start_time$.bind(Time.get_universal_time(), thread);
            utilities_macros.$progress_total$.bind(n, thread);
            utilities_macros.$progress_sofar$.bind((SubLObject)vector_utilities.ZERO_INTEGER, thread);
            utilities_macros.$last_percent_progress_index$.bind((SubLObject)vector_utilities.ZERO_INTEGER, thread);
            utilities_macros.$last_percent_progress_prediction$.bind((SubLObject)vector_utilities.NIL, thread);
            utilities_macros.$within_noting_percent_progress$.bind((SubLObject)vector_utilities.T, thread);
            utilities_macros.$percent_progress_start_time$.bind(Time.get_universal_time(), thread);
            try {
                utilities_macros.noting_percent_progress_preamble(utilities_macros.$progress_note$.getDynamicValue(thread));
                SubLObject i;
                SubLObject nil_count;
                SubLObject high_byte;
                SubLObject middle_byte;
                SubLObject low_byte;
                SubLObject highest_char;
                SubLObject high_char;
                SubLObject low_char;
                SubLObject lowest_char;
                for (i = (SubLObject)vector_utilities.NIL, i = (SubLObject)vector_utilities.ZERO_INTEGER; i.numL(utilities_macros.$progress_total$.getDynamicValue(thread)); i = Numbers.add(i, (SubLObject)vector_utilities.ONE_INTEGER)) {
                    nil_count = random.random((SubLObject)vector_utilities.THREE_INTEGER);
                    high_byte = random.random((SubLObject)vector_utilities.$int38$256);
                    middle_byte = (SubLObject)(nil_count.numG((SubLObject)vector_utilities.ONE_INTEGER) ? vector_utilities.NIL : random.random((SubLObject)vector_utilities.$int38$256));
                    low_byte = (SubLObject)(nil_count.numG((SubLObject)vector_utilities.ZERO_INTEGER) ? vector_utilities.NIL : random.random((SubLObject)vector_utilities.$int38$256));
                    thread.resetMultipleValues();
                    highest_char = bytes_to_64_bit_chars(high_byte, middle_byte, low_byte);
                    high_char = thread.secondMultipleValue();
                    low_char = thread.thirdMultipleValue();
                    lowest_char = thread.fourthMultipleValue();
                    thread.resetMultipleValues();
                    test_64_bit_chars_to_bytes_once(highest_char, high_char, low_char, lowest_char);
                    utilities_macros.$progress_sofar$.setDynamicValue(Numbers.add(utilities_macros.$progress_sofar$.getDynamicValue(thread), (SubLObject)vector_utilities.ONE_INTEGER), thread);
                    utilities_macros.note_percent_progress(utilities_macros.$progress_sofar$.getDynamicValue(thread), utilities_macros.$progress_total$.getDynamicValue(thread));
                }
            }
            finally {
                final SubLObject _prev_bind_0_$19 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)vector_utilities.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    utilities_macros.noting_percent_progress_postamble();
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$19, thread);
                }
            }
        }
        finally {
            utilities_macros.$percent_progress_start_time$.rebind(_prev_bind_8, thread);
            utilities_macros.$within_noting_percent_progress$.rebind(_prev_bind_7, thread);
            utilities_macros.$last_percent_progress_prediction$.rebind(_prev_bind_6, thread);
            utilities_macros.$last_percent_progress_index$.rebind(_prev_bind_5, thread);
            utilities_macros.$progress_sofar$.rebind(_prev_bind_4, thread);
            utilities_macros.$progress_total$.rebind(_prev_bind_3, thread);
            utilities_macros.$progress_start_time$.rebind(_prev_bind_2, thread);
            utilities_macros.$progress_note$.rebind(_prev_bind_0, thread);
        }
        return (SubLObject)vector_utilities.T;
    }
    
    public static SubLObject declare_vector_utilities_file() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.vector_utilities", "vector_elements", "VECTOR-ELEMENTS", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.vector_utilities", "list_to_vector", "LIST-TO-VECTOR", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.vector_utilities", "copy_vector", "COPY-VECTOR", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.vector_utilities", "first_aref", "FIRST-AREF", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.vector_utilities", "last_aref", "LAST-AREF", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.vector_utilities", "num_vector", "NUM-VECTOR", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.vector_utilities", "extend_vector", "EXTEND-VECTOR", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.vector_utilities", "extend_vector_to", "EXTEND-VECTOR-TO", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.vector_utilities", "grow_vector", "GROW-VECTOR", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.vector_utilities", "reset_vector", "RESET-VECTOR", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.vector_utilities", "clear_vector", "CLEAR-VECTOR", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.vector_utilities", "percolate_vector", "PERCOLATE-VECTOR", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.vector_utilities", "vector_nreplace_subsequence", "VECTOR-NREPLACE-SUBSEQUENCE", 3, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.vector_utilities", "vector_nreplace_subsequence_int", "VECTOR-NREPLACE-SUBSEQUENCE-INT", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.vector_utilities", "print_vector_readably", "PRINT-VECTOR-READABLY", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.vector_utilities", "print_vector_as_delimited_line", "PRINT-VECTOR-AS-DELIMITED-LINE", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.vector_utilities", "max_element", "MAX-ELEMENT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.vector_utilities", "min_element", "MIN-ELEMENT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.vector_utilities", "extremal_element", "EXTREMAL-ELEMENT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.vector_utilities", "random_elt", "RANDOM-ELT", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.vector_utilities", "sample_list", "SAMPLE-LIST", 1, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.vector_utilities", "sample_sequence", "SAMPLE-SEQUENCE", 1, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.vector_utilities", "make_ndim_array", "MAKE-NDIM-ARRAY", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.vector_utilities", "aref_ndim", "AREF-NDIM", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.vector_utilities", "set_aref_ndim", "SET-AREF-NDIM", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.vector_utilities", "f_2d_array_elements", "2D-ARRAY-ELEMENTS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.vector_utilities", "f_3d_array_elements", "3D-ARRAY-ELEMENTS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.vector_utilities", "byte_vector_p", "BYTE-VECTOR-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.vector_utilities", "new_byte_vector_from_file", "NEW-BYTE-VECTOR-FROM-FILE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.vector_utilities", "byte_vector_to_hex_char_string", "BYTE-VECTOR-TO-HEX-CHAR-STRING", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.vector_utilities", "byte_vector_to_formatted_hex_char_string", "BYTE-VECTOR-TO-FORMATTED-HEX-CHAR-STRING", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.vector_utilities", "byte_vector_to_string", "BYTE-VECTOR-TO-STRING", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.vector_utilities", "hex_char_string_to_byte_vector", "HEX-CHAR-STRING-TO-BYTE-VECTOR", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.vector_utilities", "byte_to_hex_chars", "BYTE-TO-HEX-CHARS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.vector_utilities", "hex_chars_to_byte", "HEX-CHARS-TO-BYTE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.vector_utilities", "byte_vector_to_64_bit_char_string", "BYTE-VECTOR-TO-64-BIT-CHAR-STRING", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.vector_utilities", "write_bytes_as_64_bit_chars", "WRITE-BYTES-AS-64-BIT-CHARS", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.vector_utilities", "bytes_to_64_bit_chars", "BYTES-TO-64-BIT-CHARS", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.vector_utilities", "f_64_bit_chars_to_bytes", "64-BIT-CHARS-TO-BYTES", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.vector_utilities", "f_64_bit_char_string_to_byte_vector", "64-BIT-CHAR-STRING-TO-BYTE-VECTOR", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.vector_utilities", "f_64_bit_string_tuples_length", "64-BIT-STRING-TUPLES-LENGTH", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.vector_utilities", "f_64_bit_string_byte_vector_length", "64-BIT-STRING-BYTE-VECTOR-LENGTH", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.vector_utilities", "binary_search_vector_subrange_wXduplicates", "BINARY-SEARCH-VECTOR-SUBRANGE-W/DUPLICATES", 5, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.vector_utilities", "test_binary_search_vector_subrange_wXduplicate_structures", "TEST-BINARY-SEARCH-VECTOR-SUBRANGE-W/DUPLICATE-STRUCTURES", 6, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.vector_utilities", "test_binary_search_vector_subrange_wXduplicates", "TEST-BINARY-SEARCH-VECTOR-SUBRANGE-W/DUPLICATES", 5, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.vector_utilities", "binary_search_vector_subrange", "BINARY-SEARCH-VECTOR-SUBRANGE", 5, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.vector_utilities", "binary_search_vector_range", "BINARY-SEARCH-VECTOR-RANGE", 3, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.vector_utilities", "binary_search_vector", "BINARY-SEARCH-VECTOR", 3, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.vector_utilities", "binary_search_vector_int", "BINARY-SEARCH-VECTOR-INT", 8, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.vector_utilities", "test_bytes_to_64_bit_chars_once", "TEST-BYTES-TO-64-BIT-CHARS-ONCE", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.vector_utilities", "test_64_bit_chars_to_bytes_once", "TEST-64-BIT-CHARS-TO-BYTES-ONCE", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.vector_utilities", "test_bytes_to_64_bit_chars", "TEST-BYTES-TO-64-BIT-CHARS", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.vector_utilities", "test_64_bit_chars_to_bytes", "TEST-64-BIT-CHARS-TO-BYTES", 0, 1, false);
        return (SubLObject)vector_utilities.NIL;
    }
    
    public static SubLObject init_vector_utilities_file() {
        return (SubLObject)vector_utilities.NIL;
    }
    
    public static SubLObject setup_vector_utilities_file() {
        access_macros.define_obsolete_register((SubLObject)vector_utilities.$sym4$CLEAR_VECTOR, (SubLObject)vector_utilities.$list5);
        generic_testing.define_test_case_table_int((SubLObject)vector_utilities.$sym21$64_BIT_STRING_TUPLES_LENGTH, (SubLObject)ConsesLow.list(new SubLObject[] { vector_utilities.$kw22$TEST, vector_utilities.NIL, vector_utilities.$kw23$OWNER, vector_utilities.NIL, vector_utilities.$kw24$CLASSES, vector_utilities.NIL, vector_utilities.$kw25$KB, vector_utilities.$kw26$TINY, vector_utilities.$kw27$WORKING_, vector_utilities.T }), (SubLObject)vector_utilities.$list28);
        generic_testing.define_test_case_table_int((SubLObject)vector_utilities.$sym29$64_BIT_STRING_BYTE_VECTOR_LENGTH, (SubLObject)ConsesLow.list(new SubLObject[] { vector_utilities.$kw22$TEST, vector_utilities.NIL, vector_utilities.$kw23$OWNER, vector_utilities.NIL, vector_utilities.$kw24$CLASSES, vector_utilities.NIL, vector_utilities.$kw25$KB, vector_utilities.$kw26$TINY, vector_utilities.$kw27$WORKING_, vector_utilities.T }), (SubLObject)vector_utilities.$list30);
        generic_testing.define_test_case_table_int((SubLObject)vector_utilities.$sym31$TEST_BINARY_SEARCH_VECTOR_SUBRANGE_W_DUPLICATES, (SubLObject)ConsesLow.list(new SubLObject[] { vector_utilities.$kw22$TEST, vector_utilities.NIL, vector_utilities.$kw23$OWNER, vector_utilities.NIL, vector_utilities.$kw24$CLASSES, vector_utilities.NIL, vector_utilities.$kw25$KB, vector_utilities.$kw26$TINY, vector_utilities.$kw27$WORKING_, vector_utilities.T }), (SubLObject)vector_utilities.$list32);
        generic_testing.define_test_case_table_int((SubLObject)vector_utilities.$sym33$TEST_BINARY_SEARCH_VECTOR_SUBRANGE_W_DUPLICATE_STRUCTURES, (SubLObject)ConsesLow.list(new SubLObject[] { vector_utilities.$kw22$TEST, vector_utilities.NIL, vector_utilities.$kw23$OWNER, vector_utilities.NIL, vector_utilities.$kw24$CLASSES, vector_utilities.NIL, vector_utilities.$kw25$KB, vector_utilities.$kw26$TINY, vector_utilities.$kw27$WORKING_, vector_utilities.T }), (SubLObject)vector_utilities.$list34);
        return (SubLObject)vector_utilities.NIL;
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
        me = (SubLFile)new vector_utilities();
        $sym0$VECTORP = SubLObjectFactory.makeSymbol("VECTORP");
        $sym1$INTEGERP = SubLObjectFactory.makeSymbol("INTEGERP");
        $sym2$PROPER_LIST_P = SubLObjectFactory.makeSymbol("PROPER-LIST-P");
        $sym3$VECTOR = SubLObjectFactory.makeSymbol("VECTOR");
        $sym4$CLEAR_VECTOR = SubLObjectFactory.makeSymbol("CLEAR-VECTOR");
        $list5 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RESET-VECTOR"));
        $sym6$TRUE = SubLObjectFactory.makeSymbol("TRUE");
        $sym7$SEQUENCEP = SubLObjectFactory.makeSymbol("SEQUENCEP");
        $sym8$POSITIVE_INTEGER_P = SubLObjectFactory.makeSymbol("POSITIVE-INTEGER-P");
        $int9$500 = SubLObjectFactory.makeInteger(500);
        $sym10$NON_NEGATIVE_INTEGER_P = SubLObjectFactory.makeSymbol("NON-NEGATIVE-INTEGER-P");
        $int11$100000 = SubLObjectFactory.makeInteger(100000);
        $sym12$STRINGP = SubLObjectFactory.makeSymbol("STRINGP");
        $kw13$INPUT = SubLObjectFactory.makeKeyword("INPUT");
        $str14$Unable_to_open__S = SubLObjectFactory.makeString("Unable to open ~S");
        $sym15$BYTE_VECTOR_P = SubLObjectFactory.makeSymbol("BYTE-VECTOR-P");
        $int16$32 = SubLObjectFactory.makeInteger(32);
        $str17$Did_not_fill_up_all_the_expected_ = SubLObjectFactory.makeString("Did not fill up all the expected characters of the hex string: ~s != ~s~%");
        $sym18$HEX_CHAR_STRING_P = SubLObjectFactory.makeSymbol("HEX-CHAR-STRING-P");
        $sym19$EVENP = SubLObjectFactory.makeSymbol("EVENP");
        $sym20$64_BIT_STRING_P = SubLObjectFactory.makeSymbol("64-BIT-STRING-P");
        $sym21$64_BIT_STRING_TUPLES_LENGTH = SubLObjectFactory.makeSymbol("64-BIT-STRING-TUPLES-LENGTH");
        $kw22$TEST = SubLObjectFactory.makeKeyword("TEST");
        $kw23$OWNER = SubLObjectFactory.makeKeyword("OWNER");
        $kw24$CLASSES = SubLObjectFactory.makeKeyword("CLASSES");
        $kw25$KB = SubLObjectFactory.makeKeyword("KB");
        $kw26$TINY = SubLObjectFactory.makeKeyword("TINY");
        $kw27$WORKING_ = SubLObjectFactory.makeKeyword("WORKING?");
        $list28 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("")), (SubLObject)vector_utilities.ZERO_INTEGER), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("AA")), (SubLObject)vector_utilities.ONE_INTEGER), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("AAA")), (SubLObject)vector_utilities.ONE_INTEGER), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("AA==")), (SubLObject)vector_utilities.ONE_INTEGER), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("AAA=")), (SubLObject)vector_utilities.ONE_INTEGER), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("AAAA")), (SubLObject)vector_utilities.ONE_INTEGER), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("AAAAAA")), (SubLObject)vector_utilities.TWO_INTEGER), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("AAAAAA==")), (SubLObject)vector_utilities.TWO_INTEGER));
        $sym29$64_BIT_STRING_BYTE_VECTOR_LENGTH = SubLObjectFactory.makeSymbol("64-BIT-STRING-BYTE-VECTOR-LENGTH");
        $list30 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("")), (SubLObject)vector_utilities.ZERO_INTEGER), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("AA")), (SubLObject)vector_utilities.ONE_INTEGER), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("AA==")), (SubLObject)vector_utilities.ONE_INTEGER), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("AAA")), (SubLObject)vector_utilities.TWO_INTEGER), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("AAA=")), (SubLObject)vector_utilities.TWO_INTEGER), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("AAAA")), (SubLObject)vector_utilities.THREE_INTEGER), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("AAAAAA")), (SubLObject)vector_utilities.FOUR_INTEGER), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("AAAAAA==")), (SubLObject)vector_utilities.FOUR_INTEGER));
        $sym31$TEST_BINARY_SEARCH_VECTOR_SUBRANGE_W_DUPLICATES = SubLObjectFactory.makeSymbol("TEST-BINARY-SEARCH-VECTOR-SUBRANGE-W/DUPLICATES");
        $list32 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)vector_utilities.ZERO_INTEGER, Vectors.vector(new SubLObject[] { vector_utilities.ONE_INTEGER, vector_utilities.TWO_INTEGER, vector_utilities.THREE_INTEGER, vector_utilities.THREE_INTEGER, vector_utilities.THREE_INTEGER, vector_utilities.FOUR_INTEGER }), (SubLObject)vector_utilities.ZERO_INTEGER, (SubLObject)vector_utilities.SIX_INTEGER, (SubLObject)SubLObjectFactory.makeSymbol("<")), (SubLObject)ConsesLow.list((SubLObject)vector_utilities.MINUS_ONE_INTEGER, (SubLObject)vector_utilities.ZERO_INTEGER, (SubLObject)vector_utilities.NIL)), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)vector_utilities.ONE_INTEGER, Vectors.vector(new SubLObject[] { vector_utilities.ONE_INTEGER, vector_utilities.TWO_INTEGER, vector_utilities.THREE_INTEGER, vector_utilities.THREE_INTEGER, vector_utilities.THREE_INTEGER, vector_utilities.FOUR_INTEGER }), (SubLObject)vector_utilities.ZERO_INTEGER, (SubLObject)vector_utilities.SIX_INTEGER, (SubLObject)SubLObjectFactory.makeSymbol("<")), (SubLObject)ConsesLow.list((SubLObject)vector_utilities.ZERO_INTEGER, (SubLObject)vector_utilities.ZERO_INTEGER, (SubLObject)vector_utilities.T)), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeDouble(1.2), Vectors.vector(new SubLObject[] { vector_utilities.ONE_INTEGER, vector_utilities.TWO_INTEGER, vector_utilities.THREE_INTEGER, vector_utilities.THREE_INTEGER, vector_utilities.THREE_INTEGER, vector_utilities.FOUR_INTEGER }), (SubLObject)vector_utilities.ZERO_INTEGER, (SubLObject)vector_utilities.SIX_INTEGER, (SubLObject)SubLObjectFactory.makeSymbol("<")), (SubLObject)ConsesLow.list((SubLObject)vector_utilities.ZERO_INTEGER, (SubLObject)vector_utilities.ONE_INTEGER, (SubLObject)vector_utilities.NIL)), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)vector_utilities.TWO_INTEGER, Vectors.vector(new SubLObject[] { vector_utilities.ONE_INTEGER, vector_utilities.TWO_INTEGER, vector_utilities.THREE_INTEGER, vector_utilities.THREE_INTEGER, vector_utilities.THREE_INTEGER, vector_utilities.FOUR_INTEGER }), (SubLObject)vector_utilities.ZERO_INTEGER, (SubLObject)vector_utilities.SIX_INTEGER, (SubLObject)SubLObjectFactory.makeSymbol("<")), (SubLObject)ConsesLow.list((SubLObject)vector_utilities.ONE_INTEGER, (SubLObject)vector_utilities.ONE_INTEGER, (SubLObject)vector_utilities.T)), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)vector_utilities.THREE_INTEGER, Vectors.vector(new SubLObject[] { vector_utilities.ONE_INTEGER, vector_utilities.TWO_INTEGER, vector_utilities.THREE_INTEGER, vector_utilities.THREE_INTEGER, vector_utilities.THREE_INTEGER, vector_utilities.FOUR_INTEGER }), (SubLObject)vector_utilities.ZERO_INTEGER, (SubLObject)vector_utilities.SIX_INTEGER, (SubLObject)SubLObjectFactory.makeSymbol("<")), (SubLObject)ConsesLow.list((SubLObject)vector_utilities.TWO_INTEGER, (SubLObject)vector_utilities.FOUR_INTEGER, (SubLObject)vector_utilities.T)), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)vector_utilities.FOUR_INTEGER, Vectors.vector(new SubLObject[] { vector_utilities.ONE_INTEGER, vector_utilities.TWO_INTEGER, vector_utilities.THREE_INTEGER, vector_utilities.THREE_INTEGER, vector_utilities.THREE_INTEGER, vector_utilities.FOUR_INTEGER }), (SubLObject)vector_utilities.ZERO_INTEGER, (SubLObject)vector_utilities.SIX_INTEGER, (SubLObject)SubLObjectFactory.makeSymbol("<")), (SubLObject)ConsesLow.list((SubLObject)vector_utilities.FIVE_INTEGER, (SubLObject)vector_utilities.FIVE_INTEGER, (SubLObject)vector_utilities.T)), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)vector_utilities.FIVE_INTEGER, Vectors.vector(new SubLObject[] { vector_utilities.ONE_INTEGER, vector_utilities.TWO_INTEGER, vector_utilities.THREE_INTEGER, vector_utilities.THREE_INTEGER, vector_utilities.THREE_INTEGER, vector_utilities.FOUR_INTEGER }), (SubLObject)vector_utilities.ZERO_INTEGER, (SubLObject)vector_utilities.SIX_INTEGER, (SubLObject)SubLObjectFactory.makeSymbol("<")), (SubLObject)ConsesLow.list((SubLObject)vector_utilities.SIX_INTEGER, (SubLObject)vector_utilities.SEVEN_INTEGER, (SubLObject)vector_utilities.NIL)));
        $sym33$TEST_BINARY_SEARCH_VECTOR_SUBRANGE_W_DUPLICATE_STRUCTURES = SubLObjectFactory.makeSymbol("TEST-BINARY-SEARCH-VECTOR-SUBRANGE-W/DUPLICATE-STRUCTURES");
        $list34 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)vector_utilities.ZERO_INTEGER, Vectors.vector(new SubLObject[] { ConsesLow.list((SubLObject)vector_utilities.ONE_INTEGER), ConsesLow.list((SubLObject)vector_utilities.TWO_INTEGER), ConsesLow.list((SubLObject)vector_utilities.THREE_INTEGER), ConsesLow.list((SubLObject)vector_utilities.THREE_INTEGER), ConsesLow.list((SubLObject)vector_utilities.THREE_INTEGER), ConsesLow.list((SubLObject)vector_utilities.FOUR_INTEGER) }), (SubLObject)vector_utilities.ZERO_INTEGER, (SubLObject)vector_utilities.SIX_INTEGER, (SubLObject)SubLObjectFactory.makeSymbol("<"), (SubLObject)SubLObjectFactory.makeSymbol("FIRST")), (SubLObject)ConsesLow.list((SubLObject)vector_utilities.MINUS_ONE_INTEGER, (SubLObject)vector_utilities.ZERO_INTEGER, (SubLObject)vector_utilities.NIL)), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)vector_utilities.ONE_INTEGER, Vectors.vector(new SubLObject[] { ConsesLow.list((SubLObject)vector_utilities.ONE_INTEGER), ConsesLow.list((SubLObject)vector_utilities.TWO_INTEGER), ConsesLow.list((SubLObject)vector_utilities.THREE_INTEGER), ConsesLow.list((SubLObject)vector_utilities.THREE_INTEGER), ConsesLow.list((SubLObject)vector_utilities.THREE_INTEGER), ConsesLow.list((SubLObject)vector_utilities.FOUR_INTEGER) }), (SubLObject)vector_utilities.ZERO_INTEGER, (SubLObject)vector_utilities.SIX_INTEGER, (SubLObject)SubLObjectFactory.makeSymbol("<"), (SubLObject)SubLObjectFactory.makeSymbol("FIRST")), (SubLObject)ConsesLow.list((SubLObject)vector_utilities.ZERO_INTEGER, (SubLObject)vector_utilities.ZERO_INTEGER, (SubLObject)vector_utilities.T)), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)vector_utilities.TWO_INTEGER, Vectors.vector(new SubLObject[] { ConsesLow.list((SubLObject)vector_utilities.ONE_INTEGER), ConsesLow.list((SubLObject)vector_utilities.TWO_INTEGER), ConsesLow.list((SubLObject)vector_utilities.THREE_INTEGER), ConsesLow.list((SubLObject)vector_utilities.THREE_INTEGER), ConsesLow.list((SubLObject)vector_utilities.THREE_INTEGER), ConsesLow.list((SubLObject)vector_utilities.FOUR_INTEGER) }), (SubLObject)vector_utilities.ZERO_INTEGER, (SubLObject)vector_utilities.SIX_INTEGER, (SubLObject)SubLObjectFactory.makeSymbol("<"), (SubLObject)SubLObjectFactory.makeSymbol("FIRST")), (SubLObject)ConsesLow.list((SubLObject)vector_utilities.ONE_INTEGER, (SubLObject)vector_utilities.ONE_INTEGER, (SubLObject)vector_utilities.T)), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeDouble(2.6), Vectors.vector(new SubLObject[] { ConsesLow.list((SubLObject)vector_utilities.ONE_INTEGER), ConsesLow.list((SubLObject)vector_utilities.TWO_INTEGER), ConsesLow.list((SubLObject)vector_utilities.THREE_INTEGER), ConsesLow.list((SubLObject)vector_utilities.THREE_INTEGER), ConsesLow.list((SubLObject)vector_utilities.THREE_INTEGER), ConsesLow.list((SubLObject)vector_utilities.FOUR_INTEGER) }), (SubLObject)vector_utilities.ZERO_INTEGER, (SubLObject)vector_utilities.SIX_INTEGER, (SubLObject)SubLObjectFactory.makeSymbol("<"), (SubLObject)SubLObjectFactory.makeSymbol("FIRST")), (SubLObject)ConsesLow.list((SubLObject)vector_utilities.ONE_INTEGER, (SubLObject)vector_utilities.TWO_INTEGER, (SubLObject)vector_utilities.NIL)), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)vector_utilities.THREE_INTEGER, Vectors.vector(new SubLObject[] { ConsesLow.list((SubLObject)vector_utilities.ONE_INTEGER), ConsesLow.list((SubLObject)vector_utilities.TWO_INTEGER), ConsesLow.list((SubLObject)vector_utilities.THREE_INTEGER), ConsesLow.list((SubLObject)vector_utilities.THREE_INTEGER), ConsesLow.list((SubLObject)vector_utilities.THREE_INTEGER), ConsesLow.list((SubLObject)vector_utilities.FOUR_INTEGER) }), (SubLObject)vector_utilities.ZERO_INTEGER, (SubLObject)vector_utilities.SIX_INTEGER, (SubLObject)SubLObjectFactory.makeSymbol("<"), (SubLObject)SubLObjectFactory.makeSymbol("FIRST")), (SubLObject)ConsesLow.list((SubLObject)vector_utilities.TWO_INTEGER, (SubLObject)vector_utilities.FOUR_INTEGER, (SubLObject)vector_utilities.T)));
        $str35$Failure_on__S__S__S = SubLObjectFactory.makeString("Failure on ~S ~S ~S");
        $str36$Failure_on__S__S__S__S = SubLObjectFactory.makeString("Failure on ~S ~S ~S ~S");
        $str37$cdotimes = SubLObjectFactory.makeString("cdotimes");
        $int38$256 = SubLObjectFactory.makeInteger(256);
    }
}

/*

	Total time: 426 ms
	
*/