package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Strings;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class sort_variants extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.sort_variants";
    public static final String myFingerPrint = "28d0e7ab55a1654ad41e911f3a0d0f25f18d48a6d7213693d1f251250d812e2b";
    @SubLTranslatedFile.SubL(source = "cycl/sort-variants.lisp", position = 6695L)
    private static SubLSymbol $quick_sort_recursion_limit$;
    private static final SubLList $list0;
    private static final SubLSymbol $sym1$FIF;
    private static final SubLSymbol $sym2$COR;
    private static final SubLList $list3;
    private static final SubLList $list4;
    private static final SubLSymbol $sym5$FUNCALL;
    private static final SubLSymbol $sym6$SEQUENCEP;
    private static final SubLSymbol $sym7$FUNCTION_SPEC_P;
    private static final SubLSymbol $kw8$ORDERED;
    private static final SubLSymbol $kw9$REVERSE_ORDERED;
    private static final SubLSymbol $kw10$NOT_ORDERABLE;
    private static final SubLSymbol $kw11$ALMOST_ORDERED;
    private static final SubLSymbol $kw12$ALMOST_REVERSE_ORDERED;
    private static final SubLSymbol $kw13$UNORDERED;
    private static final SubLInteger $int14$256;
    private static final SubLList $list15;
    private static final SubLList $list16;
    private static final SubLString $str17$_S_is_not_a_sequence;
    private static final SubLString $str18$NIL_is_not_a_sequence_that_can_be;
    private static final SubLSymbol $sym19$LISTP;
    
    @SubLTranslatedFile.SubL(source = "cycl/sort-variants.lisp", position = 1335L)
    public static SubLObject funcall_key(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject key = (SubLObject)sort_variants.NIL;
        SubLObject v_object = (SubLObject)sort_variants.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sort_variants.$list0);
        key = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sort_variants.$list0);
        v_object = current.first();
        current = current.rest();
        if (sort_variants.NIL == current) {
            return (SubLObject)ConsesLow.list((SubLObject)sort_variants.$sym1$FIF, (SubLObject)ConsesLow.list((SubLObject)sort_variants.$sym2$COR, (SubLObject)ConsesLow.listS((SubLObject)sort_variants.EQ, key, (SubLObject)sort_variants.$list3), (SubLObject)ConsesLow.listS((SubLObject)sort_variants.EQ, key, (SubLObject)sort_variants.$list4)), v_object, (SubLObject)ConsesLow.list((SubLObject)sort_variants.$sym5$FUNCALL, key, v_object));
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)sort_variants.$list0);
        return (SubLObject)sort_variants.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sort-variants.lisp", position = 1659L)
    public static SubLObject sort_new(final SubLObject sequence, final SubLObject predicate, SubLObject key) {
        if (key == sort_variants.UNPROVIDED) {
            key = Symbols.symbol_function((SubLObject)sort_variants.IDENTITY);
        }
        assert sort_variants.NIL != Types.sequencep(sequence) : sequence;
        assert sort_variants.NIL != Types.function_spec_p(predicate) : predicate;
        assert sort_variants.NIL != Types.function_spec_p(key) : key;
        return sort_new_internal(sequence, predicate, key, (SubLObject)sort_variants.NIL, (SubLObject)sort_variants.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sort-variants.lisp", position = 2301L)
    public static SubLObject nsort_new(final SubLObject sequence, final SubLObject predicate, SubLObject key) {
        if (key == sort_variants.UNPROVIDED) {
            key = Symbols.symbol_function((SubLObject)sort_variants.IDENTITY);
        }
        assert sort_variants.NIL != Types.sequencep(sequence) : sequence;
        assert sort_variants.NIL != Types.function_spec_p(predicate) : predicate;
        assert sort_variants.NIL != Types.function_spec_p(key) : key;
        return sort_new_internal(sequence, predicate, key, (SubLObject)sort_variants.NIL, (SubLObject)sort_variants.T);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sort-variants.lisp", position = 2731L)
    public static SubLObject stable_sort_new(final SubLObject sequence, final SubLObject predicate, SubLObject key) {
        if (key == sort_variants.UNPROVIDED) {
            key = Symbols.symbol_function((SubLObject)sort_variants.IDENTITY);
        }
        assert sort_variants.NIL != Types.sequencep(sequence) : sequence;
        assert sort_variants.NIL != Types.function_spec_p(predicate) : predicate;
        assert sort_variants.NIL != Types.function_spec_p(key) : key;
        return sort_new_internal(sequence, predicate, key, (SubLObject)sort_variants.T, (SubLObject)sort_variants.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sort-variants.lisp", position = 3174L)
    public static SubLObject nstable_sort_new(final SubLObject sequence, final SubLObject predicate, SubLObject key) {
        if (key == sort_variants.UNPROVIDED) {
            key = Symbols.symbol_function((SubLObject)sort_variants.IDENTITY);
        }
        assert sort_variants.NIL != Types.sequencep(sequence) : sequence;
        assert sort_variants.NIL != Types.function_spec_p(predicate) : predicate;
        assert sort_variants.NIL != Types.function_spec_p(key) : key;
        return sort_new_internal(sequence, predicate, key, (SubLObject)sort_variants.T, (SubLObject)sort_variants.T);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sort-variants.lisp", position = 3608L)
    public static SubLObject sequence_order_status(final SubLObject sequence, final SubLObject predicate, SubLObject key) {
        if (key == sort_variants.UNPROVIDED) {
            key = Symbols.symbol_function((SubLObject)sort_variants.IDENTITY);
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert sort_variants.NIL != Types.sequencep(sequence) : sequence;
        assert sort_variants.NIL != Types.function_spec_p(predicate) : predicate;
        assert sort_variants.NIL != Types.function_spec_p(key) : key;
        thread.resetMultipleValues();
        final SubLObject ordered = compute_sequence_order_status(sequence, predicate, key);
        final SubLObject equivalent = thread.secondMultipleValue();
        final SubLObject reversed = thread.thirdMultipleValue();
        thread.resetMultipleValues();
        if (ordered.isZero() && equivalent.isZero() && reversed.isZero()) {
            return (SubLObject)sort_variants.$kw8$ORDERED;
        }
        if (equivalent.isZero() && reversed.isZero()) {
            return (SubLObject)sort_variants.$kw8$ORDERED;
        }
        if (ordered.isZero() && equivalent.isZero()) {
            return (SubLObject)sort_variants.$kw9$REVERSE_ORDERED;
        }
        if (ordered.isZero() && reversed.isZero()) {
            return (SubLObject)sort_variants.$kw10$NOT_ORDERABLE;
        }
        if (ordered.numGE(number_utilities.f_2X(Numbers.add(equivalent, reversed)))) {
            return (SubLObject)sort_variants.$kw11$ALMOST_ORDERED;
        }
        if (reversed.numGE(number_utilities.f_2X(Numbers.add(equivalent, ordered)))) {
            return (SubLObject)sort_variants.$kw12$ALMOST_REVERSE_ORDERED;
        }
        return (SubLObject)sort_variants.$kw13$UNORDERED;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sort-variants.lisp", position = 5060L)
    public static SubLObject compute_sequence_order_status(final SubLObject sequence, final SubLObject predicate, SubLObject key) {
        if (key == sort_variants.UNPROVIDED) {
            key = Symbols.symbol_function((SubLObject)sort_variants.IDENTITY);
        }
        SubLObject ordered = (SubLObject)sort_variants.ZERO_INTEGER;
        SubLObject equivalent = (SubLObject)sort_variants.ZERO_INTEGER;
        SubLObject reversed = (SubLObject)sort_variants.ZERO_INTEGER;
        SubLObject key_last = (SubLObject)sort_variants.NIL;
        for (SubLObject sequence_var = sequence, end_index = (SubLObject)(sequence_var.isList() ? sort_variants.NIL : Sequences.length(sequence_var)), num = (SubLObject)sort_variants.ZERO_INTEGER, sequence_doneP = subl_macros.do_sequence_index_doneP(num, end_index, sequence_var); sort_variants.NIL == sequence_doneP; sequence_doneP = subl_macros.do_sequence_index_doneP(num, end_index, sequence_var)) {
            final SubLObject next_element = subl_macros.do_sequence_index_valueP(num, sequence_var);
            final SubLObject key_next = (key.eql(Symbols.symbol_function((SubLObject)sort_variants.IDENTITY)) || key == sort_variants.IDENTITY) ? next_element : Functions.funcall(key, next_element);
            if (!num.isZero()) {
                if (sort_variants.NIL != Functions.funcall(predicate, key_last, key_next)) {
                    ordered = Numbers.add(ordered, (SubLObject)sort_variants.ONE_INTEGER);
                }
                else if (sort_variants.NIL != Functions.funcall(predicate, key_next, key_last)) {
                    reversed = Numbers.add(reversed, (SubLObject)sort_variants.ONE_INTEGER);
                }
                else {
                    equivalent = Numbers.add(equivalent, (SubLObject)sort_variants.ONE_INTEGER);
                }
            }
            key_last = key_next;
            sequence_var = subl_macros.do_sequence_index_update(sequence_var);
            num = Numbers.add(num, (SubLObject)sort_variants.ONE_INTEGER);
        }
        return Values.values(ordered, equivalent, reversed);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sort-variants.lisp", position = 5657L)
    public static SubLObject sort_new_internal(SubLObject sequence, final SubLObject predicate, final SubLObject key, final SubLObject stable_p, SubLObject destructive_p) {
        final SubLObject pcase_var;
        SubLObject sort_status = pcase_var = sequence_order_status(sequence, predicate, key);
        if (pcase_var.eql((SubLObject)sort_variants.$kw8$ORDERED)) {
            if (sort_variants.NIL != destructive_p) {
                return sequence;
            }
            return copy_sequence(sequence);
        }
        else if (pcase_var.eql((SubLObject)sort_variants.$kw9$REVERSE_ORDERED)) {
            if (sort_variants.NIL != destructive_p) {
                return Sequences.nreverse(sequence);
            }
            return Sequences.reverse(sequence);
        }
        else {
            if (!pcase_var.eql((SubLObject)sort_variants.$kw10$NOT_ORDERABLE)) {
                if (pcase_var.eql((SubLObject)sort_variants.$kw12$ALMOST_REVERSE_ORDERED) && sort_variants.NIL == stable_p) {
                    if (sort_variants.NIL != destructive_p) {
                        sequence = Sequences.nreverse(sequence);
                    }
                    else {
                        sequence = Sequences.reverse(sequence);
                    }
                    destructive_p = (SubLObject)sort_variants.T;
                    sort_status = (SubLObject)sort_variants.$kw11$ALMOST_ORDERED;
                }
                if (sort_variants.NIL == destructive_p) {
                    sequence = copy_sequence(sequence);
                }
                return sort_new_internal_guts(sequence, predicate, key, sort_status, stable_p);
            }
            if (sort_variants.NIL != destructive_p) {
                return sequence;
            }
            return copy_sequence(sequence);
        }
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sort-variants.lisp", position = 6750L)
    public static SubLObject sort_new_internal_guts(final SubLObject sequence, final SubLObject predicate, final SubLObject key, final SubLObject sort_status, final SubLObject stable_p) {
        final SubLObject length = Sequences.length(sequence);
        if (sort_variants.$kw13$UNORDERED == sort_status || length.numL(sort_variants.$quick_sort_recursion_limit$.getGlobalValue())) {
            if (sequence.isList()) {
                return quick_sort_list(sequence, predicate, key);
            }
            if (sort_variants.NIL != stable_p) {
                return merge_sort_vector(sequence, predicate, key);
            }
            return quick_sort_vector(sequence, predicate, key);
        }
        else {
            if (sequence.isList()) {
                return merge_sort_list(sequence, predicate, key);
            }
            return merge_sort_vector(sequence, predicate, key);
        }
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sort-variants.lisp", position = 7453L)
    public static SubLObject merge_sort_list(final SubLObject list, final SubLObject predicate, SubLObject key) {
        if (key == sort_variants.UNPROVIDED) {
            key = Symbols.symbol_function((SubLObject)sort_variants.IDENTITY);
        }
        final SubLObject length = Sequences.length(list);
        final SubLObject depth = Numbers.integer_length(length);
        final SubLObject width = f_2expt(number_utilities.f_1_(depth));
        return merge_sort_list_recursive(depth, width, list, predicate, key);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sort-variants.lisp", position = 7759L)
    public static SubLObject merge_sort_list_recursive(final SubLObject depth, final SubLObject width, final SubLObject list, final SubLObject predicate, final SubLObject key) {
        SubLObject v_answer = (SubLObject)sort_variants.NIL;
        if (depth.isZero()) {
            v_answer = list;
        }
        else {
            SubLObject last_of_list_front = conses_high.nthcdr(number_utilities.f_1_(width), list);
            SubLObject list_back = last_of_list_front.rest();
            final SubLObject recursive_depth = number_utilities.f_1_(depth);
            final SubLObject recursive_width = Numbers.integerDivide(width, (SubLObject)sort_variants.TWO_INTEGER);
            if (sort_variants.NIL == last_of_list_front || sort_variants.NIL == list_back) {
                v_answer = merge_sort_list_recursive(recursive_depth, recursive_width, list, predicate, key);
            }
            else {
                ConsesLow.rplacd(last_of_list_front, (SubLObject)sort_variants.NIL);
                final SubLObject list_front = merge_sort_list_recursive(recursive_depth, recursive_width, list, predicate, key);
                list_back = merge_sort_list_recursive(recursive_depth, recursive_width, list_back, predicate, key);
                last_of_list_front = conses_high.last(list_front, (SubLObject)sort_variants.UNPROVIDED);
                final SubLObject key_front_last = (key.eql(Symbols.symbol_function((SubLObject)sort_variants.IDENTITY)) || key == sort_variants.IDENTITY) ? last_of_list_front.first() : Functions.funcall(key, last_of_list_front.first());
                final SubLObject key_back_first = (key.eql(Symbols.symbol_function((SubLObject)sort_variants.IDENTITY)) || key == sort_variants.IDENTITY) ? list_back.first() : Functions.funcall(key, list_back.first());
                if (sort_variants.NIL == Functions.funcall(predicate, key_back_first, key_front_last)) {
                    v_answer = merge_sort_list_splice(list_front, last_of_list_front, list_back);
                }
                else {
                    v_answer = merge_sort_list_merge(list_front, list_back, predicate, key);
                }
            }
        }
        return v_answer;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sort-variants.lisp", position = 9385L)
    public static SubLObject merge_sort_list_splice(final SubLObject list_front, final SubLObject last_of_list_front, final SubLObject list_back) {
        ConsesLow.rplacd(last_of_list_front, list_back);
        return list_front;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sort-variants.lisp", position = 9528L)
    public static SubLObject merge_sort_list_merge(final SubLObject list_front, final SubLObject list_back, final SubLObject predicate, final SubLObject key) {
        SubLObject rest_front = list_front;
        SubLObject rest_back = list_back;
        SubLObject key_front = (key.eql(Symbols.symbol_function((SubLObject)sort_variants.IDENTITY)) || key == sort_variants.IDENTITY) ? rest_front.first() : Functions.funcall(key, rest_front.first());
        SubLObject key_back = (key.eql(Symbols.symbol_function((SubLObject)sort_variants.IDENTITY)) || key == sort_variants.IDENTITY) ? rest_back.first() : Functions.funcall(key, rest_back.first());
        SubLObject answer_last = (SubLObject)sort_variants.NIL;
        SubLObject v_answer = (SubLObject)sort_variants.NIL;
        while (sort_variants.NIL != rest_front && sort_variants.NIL != rest_back) {
            if (sort_variants.NIL != Functions.funcall(predicate, key_back, key_front)) {
                if (sort_variants.NIL != answer_last) {
                    ConsesLow.rplacd(answer_last, rest_back);
                    answer_last = answer_last.rest();
                }
                else {
                    v_answer = (answer_last = rest_back);
                }
                rest_back = rest_back.rest();
                if (sort_variants.NIL == rest_back) {
                    continue;
                }
                key_back = ((key.eql(Symbols.symbol_function((SubLObject)sort_variants.IDENTITY)) || key == sort_variants.IDENTITY) ? rest_back.first() : Functions.funcall(key, rest_back.first()));
            }
            else {
                if (sort_variants.NIL != answer_last) {
                    ConsesLow.rplacd(answer_last, rest_front);
                    answer_last = answer_last.rest();
                }
                else {
                    v_answer = (answer_last = rest_front);
                }
                rest_front = rest_front.rest();
                if (sort_variants.NIL == rest_front) {
                    continue;
                }
                key_front = ((key.eql(Symbols.symbol_function((SubLObject)sort_variants.IDENTITY)) || key == sort_variants.IDENTITY) ? rest_front.first() : Functions.funcall(key, rest_front.first()));
            }
        }
        if (sort_variants.NIL != rest_front) {
            ConsesLow.rplacd(answer_last, rest_front);
        }
        else {
            ConsesLow.rplacd(answer_last, rest_back);
        }
        return v_answer;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sort-variants.lisp", position = 10990L)
    public static SubLObject merge_sort_vector(final SubLObject vector, final SubLObject predicate, SubLObject key) {
        if (key == sort_variants.UNPROVIDED) {
            key = Symbols.symbol_function((SubLObject)sort_variants.IDENTITY);
        }
        merge_sort_vector_recursive((SubLObject)sort_variants.ZERO_INTEGER, Sequences.length(vector), copy_sequence(vector), vector, predicate, key);
        return vector;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sort-variants.lisp", position = 11250L)
    public static SubLObject merge_sort_vector_recursive(final SubLObject left_start, final SubLObject right_end, final SubLObject scratch_vector, final SubLObject vector, final SubLObject predicate, final SubLObject key) {
        final SubLObject length = Numbers.subtract(right_end, left_start);
        if (!sort_variants.ZERO_INTEGER.numE(length)) {
            if (!sort_variants.ONE_INTEGER.numE(length)) {
                if (sort_variants.TWO_INTEGER.numE(length)) {
                    final SubLObject second_index = number_utilities.f_1X(left_start);
                    final SubLObject first = Sequences.elt(vector, left_start);
                    final SubLObject second = Sequences.elt(vector, second_index);
                    if (sort_variants.NIL == Functions.funcall(predicate, (key.eql(Symbols.symbol_function((SubLObject)sort_variants.IDENTITY)) || key == sort_variants.IDENTITY) ? first : Functions.funcall(key, first), (key.eql(Symbols.symbol_function((SubLObject)sort_variants.IDENTITY)) || key == sort_variants.IDENTITY) ? second : Functions.funcall(key, second))) {
                        sequence_swap(vector, left_start, second_index);
                    }
                }
                else {
                    final SubLObject before_end;
                    final SubLObject after_start = before_end = Numbers.integerDivide(Numbers.add(left_start, right_end), (SubLObject)sort_variants.TWO_INTEGER);
                    merge_sort_vector_recursive(left_start, before_end, scratch_vector, vector, predicate, key);
                    merge_sort_vector_recursive(after_start, right_end, scratch_vector, vector, predicate, key);
                    merge_sort_vector_merge(left_start, before_end, after_start, right_end, scratch_vector, vector, predicate, key);
                }
            }
        }
        return (SubLObject)sort_variants.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sort-variants.lisp", position = 12624L)
    public static SubLObject merge_sort_vector_merge(final SubLObject before_start, final SubLObject before_end, final SubLObject after_start, final SubLObject after_end, final SubLObject scratch_vector, final SubLObject vector, final SubLObject predicate, final SubLObject key) {
        Sequences.replace(scratch_vector, vector, before_start, before_end, before_start, before_end);
        Sequences.replace(scratch_vector, vector, after_start, after_end, after_start, after_end);
        SubLObject before_index = before_start;
        SubLObject after_index = after_start;
        SubLObject merge_index = before_start;
        SubLObject elt_before = Sequences.elt(scratch_vector, before_index);
        SubLObject elt_after = Sequences.elt(scratch_vector, after_index);
        SubLObject key_before = (key.eql(Symbols.symbol_function((SubLObject)sort_variants.IDENTITY)) || key == sort_variants.IDENTITY) ? elt_before : Functions.funcall(key, elt_before);
        SubLObject key_after = (key.eql(Symbols.symbol_function((SubLObject)sort_variants.IDENTITY)) || key == sort_variants.IDENTITY) ? elt_after : Functions.funcall(key, elt_after);
        while (!before_index.numE(before_end) && !after_index.numE(after_end)) {
            if (sort_variants.NIL != Functions.funcall(predicate, key_before, key_after)) {
                csetf_elt(vector, merge_index, elt_before);
                before_index = Numbers.add(before_index, (SubLObject)sort_variants.ONE_INTEGER);
                if (!before_index.numE(before_end)) {
                    elt_before = Sequences.elt(scratch_vector, before_index);
                    key_before = ((key.eql(Symbols.symbol_function((SubLObject)sort_variants.IDENTITY)) || key == sort_variants.IDENTITY) ? elt_before : Functions.funcall(key, elt_before));
                }
            }
            else {
                csetf_elt(vector, merge_index, elt_after);
                after_index = Numbers.add(after_index, (SubLObject)sort_variants.ONE_INTEGER);
                if (!after_index.numE(after_end)) {
                    elt_after = Sequences.elt(scratch_vector, after_index);
                    key_after = ((key.eql(Symbols.symbol_function((SubLObject)sort_variants.IDENTITY)) || key == sort_variants.IDENTITY) ? elt_after : Functions.funcall(key, elt_after));
                }
            }
            merge_index = Numbers.add(merge_index, (SubLObject)sort_variants.ONE_INTEGER);
        }
        if (before_index.numE(before_end)) {
            Sequences.replace(vector, scratch_vector, merge_index, after_end, after_index, after_end);
        }
        else {
            Sequences.replace(vector, scratch_vector, merge_index, after_end, before_index, before_end);
        }
        return (SubLObject)sort_variants.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sort-variants.lisp", position = 14279L)
    public static SubLObject quick_sort_list(final SubLObject list, final SubLObject predicate, SubLObject key) {
        if (key == sort_variants.UNPROVIDED) {
            key = Symbols.symbol_function((SubLObject)sort_variants.IDENTITY);
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject v_answer = (SubLObject)sort_variants.NIL;
        if (sort_variants.NIL == list || sort_variants.NIL != list_utilities.singletonP(list)) {
            v_answer = list;
        }
        else if (sort_variants.NIL != list_utilities.doubletonP(list)) {
            SubLObject first = (SubLObject)sort_variants.NIL;
            SubLObject second = (SubLObject)sort_variants.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(list, list, (SubLObject)sort_variants.$list15);
            first = list.first();
            SubLObject current = list.rest();
            cdestructuring_bind.destructuring_bind_must_consp(current, list, (SubLObject)sort_variants.$list15);
            second = current.first();
            current = current.rest();
            if (sort_variants.NIL == current) {
                if (sort_variants.NIL == Functions.funcall(predicate, (key.eql(Symbols.symbol_function((SubLObject)sort_variants.IDENTITY)) || key == sort_variants.IDENTITY) ? first : Functions.funcall(key, first), (key.eql(Symbols.symbol_function((SubLObject)sort_variants.IDENTITY)) || key == sort_variants.IDENTITY) ? second : Functions.funcall(key, second))) {
                    sequence_swap(list, (SubLObject)sort_variants.ZERO_INTEGER, (SubLObject)sort_variants.ONE_INTEGER);
                }
            }
            else {
                cdestructuring_bind.cdestructuring_bind_error(list, (SubLObject)sort_variants.$list15);
            }
            v_answer = list;
        }
        else {
            thread.resetMultipleValues();
            final SubLObject pivot_item = quick_sort_list_pivot_item(list, predicate, key);
            final SubLObject pivot_found = thread.secondMultipleValue();
            thread.resetMultipleValues();
            if (sort_variants.NIL == pivot_found) {
                v_answer = list;
            }
            else {
                thread.resetMultipleValues();
                SubLObject before_pivot = quick_sort_list_partition(pivot_item, list, predicate, key);
                SubLObject after_pivot = thread.secondMultipleValue();
                thread.resetMultipleValues();
                before_pivot = quick_sort_list(before_pivot, predicate, key);
                after_pivot = quick_sort_list(after_pivot, predicate, key);
                v_answer = ConsesLow.nconc(before_pivot, after_pivot);
            }
        }
        return v_answer;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sort-variants.lisp", position = 15772L)
    public static SubLObject quick_sort_list_pivot_item(final SubLObject list, final SubLObject predicate, SubLObject key) {
        if (key == sort_variants.UNPROVIDED) {
            key = Symbols.symbol_function((SubLObject)sort_variants.IDENTITY);
        }
        SubLObject pivot_item = (SubLObject)sort_variants.NIL;
        SubLObject pivot_found = (SubLObject)sort_variants.NIL;
        SubLObject first_item = (SubLObject)sort_variants.NIL;
        SubLObject rest_items = (SubLObject)sort_variants.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(list, list, (SubLObject)sort_variants.$list16);
        first_item = list.first();
        final SubLObject current = rest_items = list.rest();
        final SubLObject key_first = (key.eql(Symbols.symbol_function((SubLObject)sort_variants.IDENTITY)) || key == sort_variants.IDENTITY) ? first_item : Functions.funcall(key, first_item);
        if (sort_variants.NIL == pivot_found) {
            SubLObject csome_list_var = rest_items;
            SubLObject rest_item = (SubLObject)sort_variants.NIL;
            rest_item = csome_list_var.first();
            while (sort_variants.NIL == pivot_found && sort_variants.NIL != csome_list_var) {
                final SubLObject key_rest = (key.eql(Symbols.symbol_function((SubLObject)sort_variants.IDENTITY)) || key == sort_variants.IDENTITY) ? rest_item : Functions.funcall(key, rest_item);
                if (sort_variants.NIL != Functions.funcall(predicate, key_first, key_rest)) {
                    pivot_found = (SubLObject)sort_variants.T;
                    pivot_item = first_item;
                }
                else if (sort_variants.NIL != Functions.funcall(predicate, key_rest, key_first)) {
                    pivot_found = (SubLObject)sort_variants.T;
                    pivot_item = rest_item;
                }
                csome_list_var = csome_list_var.rest();
                rest_item = csome_list_var.first();
            }
        }
        return Values.values(pivot_item, pivot_found);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sort-variants.lisp", position = 16800L)
    public static SubLObject quick_sort_list_partition(final SubLObject pivot_item, final SubLObject list, final SubLObject predicate, SubLObject key) {
        if (key == sort_variants.UNPROVIDED) {
            key = Symbols.symbol_function((SubLObject)sort_variants.IDENTITY);
        }
        return nsplit_by_item(pivot_item, list, predicate, key);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sort-variants.lisp", position = 17232L)
    public static SubLObject quick_sort_vector(final SubLObject vector, final SubLObject predicate, SubLObject key) {
        if (key == sort_variants.UNPROVIDED) {
            key = Symbols.symbol_function((SubLObject)sort_variants.IDENTITY);
        }
        quick_sort_vector_recursive((SubLObject)sort_variants.ZERO_INTEGER, Sequences.length(vector), vector, predicate, key);
        return vector;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sort-variants.lisp", position = 17466L)
    public static SubLObject quick_sort_vector_recursive(final SubLObject left_start, final SubLObject right_end, final SubLObject vector, final SubLObject predicate, final SubLObject key) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject length = Numbers.subtract(right_end, left_start);
        if (!sort_variants.ZERO_INTEGER.numE(length)) {
            if (!sort_variants.ONE_INTEGER.numE(length)) {
                if (sort_variants.TWO_INTEGER.numE(length)) {
                    final SubLObject second_index = number_utilities.f_1X(left_start);
                    final SubLObject first = Sequences.elt(vector, left_start);
                    final SubLObject second = Sequences.elt(vector, second_index);
                    if (sort_variants.NIL == Functions.funcall(predicate, (key.eql(Symbols.symbol_function((SubLObject)sort_variants.IDENTITY)) || key == sort_variants.IDENTITY) ? first : Functions.funcall(key, first), (key.eql(Symbols.symbol_function((SubLObject)sort_variants.IDENTITY)) || key == sort_variants.IDENTITY) ? second : Functions.funcall(key, second))) {
                        sequence_swap(vector, left_start, second_index);
                    }
                }
                else {
                    thread.resetMultipleValues();
                    final SubLObject pivot_item = quick_sort_vector_pivot_item(left_start, right_end, vector, predicate, key);
                    final SubLObject pivot_found = thread.secondMultipleValue();
                    thread.resetMultipleValues();
                    if (sort_variants.NIL != pivot_found) {
                        final SubLObject before_end;
                        final SubLObject after_start = before_end = quick_sort_vector_partition(left_start, right_end, pivot_item, vector, predicate, key);
                        quick_sort_vector_recursive(left_start, before_end, vector, predicate, key);
                        quick_sort_vector_recursive(after_start, right_end, vector, predicate, key);
                    }
                }
            }
        }
        return (SubLObject)sort_variants.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sort-variants.lisp", position = 18989L)
    public static SubLObject quick_sort_vector_pivot_item(final SubLObject left_start, final SubLObject right_end, final SubLObject vector, final SubLObject predicate, final SubLObject key) {
        SubLObject pivot_item = (SubLObject)sort_variants.NIL;
        SubLObject pivot_found = (SubLObject)sort_variants.NIL;
        final SubLObject first_item = Sequences.elt(vector, left_start);
        final SubLObject key_first = (key.eql(Symbols.symbol_function((SubLObject)sort_variants.IDENTITY)) || key == sort_variants.IDENTITY) ? first_item : Functions.funcall(key, first_item);
        SubLObject rest_index;
        SubLObject rest_item;
        SubLObject key_rest;
        for (rest_index = (SubLObject)sort_variants.NIL, rest_index = number_utilities.f_1X(left_start); sort_variants.NIL == pivot_found && !rest_index.numE(right_end); rest_index = number_utilities.f_1X(rest_index)) {
            rest_item = Sequences.elt(vector, rest_index);
            key_rest = ((key.eql(Symbols.symbol_function((SubLObject)sort_variants.IDENTITY)) || key == sort_variants.IDENTITY) ? rest_item : Functions.funcall(key, rest_item));
            if (sort_variants.NIL != Functions.funcall(predicate, key_first, key_rest)) {
                pivot_found = (SubLObject)sort_variants.T;
                pivot_item = first_item;
            }
            else if (sort_variants.NIL != Functions.funcall(predicate, key_rest, key_first)) {
                pivot_found = (SubLObject)sort_variants.T;
                pivot_item = rest_item;
            }
        }
        return Values.values(pivot_item, pivot_found);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sort-variants.lisp", position = 20149L)
    public static SubLObject quick_sort_vector_partition(final SubLObject left_start, final SubLObject right_end, final SubLObject pivot_item, final SubLObject vector, final SubLObject predicate, final SubLObject key) {
        SubLObject left_index = left_start;
        SubLObject right_index = number_utilities.f_1_(right_end);
        if (right_index.numG(left_index)) {
            final SubLObject key_pivot = (key.eql(Symbols.symbol_function((SubLObject)sort_variants.IDENTITY)) || key == sort_variants.IDENTITY) ? pivot_item : Functions.funcall(key, pivot_item);
            SubLObject left_item = Sequences.elt(vector, left_index);
            SubLObject right_item = Sequences.elt(vector, right_index);
            SubLObject key_left = (key.eql(Symbols.symbol_function((SubLObject)sort_variants.IDENTITY)) || key == sort_variants.IDENTITY) ? left_item : Functions.funcall(key, left_item);
            SubLObject key_right = (key.eql(Symbols.symbol_function((SubLObject)sort_variants.IDENTITY)) || key == sort_variants.IDENTITY) ? right_item : Functions.funcall(key, right_item);
            while (right_index.numG(left_index)) {
                while (right_index.numG(left_index) && sort_variants.NIL == Functions.funcall(predicate, key_pivot, key_left)) {
                    left_index = Numbers.add(left_index, (SubLObject)sort_variants.ONE_INTEGER);
                    if (right_index.numG(left_index)) {
                        left_item = Sequences.elt(vector, left_index);
                        key_left = ((key.eql(Symbols.symbol_function((SubLObject)sort_variants.IDENTITY)) || key == sort_variants.IDENTITY) ? left_item : Functions.funcall(key, left_item));
                    }
                }
                while (right_index.numG(left_index) && sort_variants.NIL != Functions.funcall(predicate, key_pivot, key_right)) {
                    right_index = Numbers.subtract(right_index, (SubLObject)sort_variants.ONE_INTEGER);
                    if (right_index.numG(left_index)) {
                        right_item = Sequences.elt(vector, right_index);
                        key_right = ((key.eql(Symbols.symbol_function((SubLObject)sort_variants.IDENTITY)) || key == sort_variants.IDENTITY) ? right_item : Functions.funcall(key, right_item));
                    }
                }
                if (right_index.numG(left_index)) {
                    sequence_swap(vector, left_index, right_index);
                    left_index = Numbers.add(left_index, (SubLObject)sort_variants.ONE_INTEGER);
                    right_index = Numbers.subtract(right_index, (SubLObject)sort_variants.ONE_INTEGER);
                    if (!right_index.numG(left_index)) {
                        continue;
                    }
                    left_item = Sequences.elt(vector, left_index);
                    key_left = ((key.eql(Symbols.symbol_function((SubLObject)sort_variants.IDENTITY)) || key == sort_variants.IDENTITY) ? left_item : Functions.funcall(key, left_item));
                    right_item = Sequences.elt(vector, right_index);
                    key_right = ((key.eql(Symbols.symbol_function((SubLObject)sort_variants.IDENTITY)) || key == sort_variants.IDENTITY) ? right_item : Functions.funcall(key, right_item));
                }
            }
        }
        return left_index;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sort-variants.lisp", position = 22507L)
    public static SubLObject f_2expt(final SubLObject power) {
        return Numbers.expt((SubLObject)sort_variants.TWO_INTEGER, power);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sort-variants.lisp", position = 22735L)
    public static SubLObject copy_sequence(final SubLObject sequence) {
        if (sequence.isList()) {
            return conses_high.copy_list(sequence);
        }
        if (sequence.isVector()) {
            return vector_utilities.copy_vector(sequence);
        }
        if (sequence.isString()) {
            return string_utilities.copy_string(sequence);
        }
        return Errors.error((SubLObject)sort_variants.$str17$_S_is_not_a_sequence, sequence);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sort-variants.lisp", position = 23011L)
    public static SubLObject sequence_swap(final SubLObject sequence, final SubLObject index1, final SubLObject index2) {
        final SubLObject element1 = Sequences.elt(sequence, index1);
        final SubLObject element2 = Sequences.elt(sequence, index2);
        csetf_elt(sequence, index2, element1);
        csetf_elt(sequence, index1, element2);
        return sequence;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sort-variants.lisp", position = 23245L)
    public static SubLObject csetf_elt(final SubLObject sequence, final SubLObject index, final SubLObject value) {
        if (sequence.isVector()) {
            Vectors.set_aref(sequence, index, value);
        }
        else if (sequence.isString()) {
            Strings.set_char(sequence, index, value);
        }
        else if (sequence.isCons()) {
            ConsesLow.set_nth(index, sequence, value);
        }
        else if (sort_variants.NIL == sequence) {
            Errors.error((SubLObject)sort_variants.$str18$NIL_is_not_a_sequence_that_can_be);
        }
        else {
            Errors.error((SubLObject)sort_variants.$str17$_S_is_not_a_sequence, sequence);
        }
        return sequence;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sort-variants.lisp", position = 23692L)
    public static SubLObject split_by_item(final SubLObject item, final SubLObject list, SubLObject test, SubLObject key) {
        if (test == sort_variants.UNPROVIDED) {
            test = Symbols.symbol_function((SubLObject)sort_variants.EQL);
        }
        if (key == sort_variants.UNPROVIDED) {
            key = Symbols.symbol_function((SubLObject)sort_variants.IDENTITY);
        }
        final SubLObject key_item = (key.eql(Symbols.symbol_function((SubLObject)sort_variants.IDENTITY)) || key == sort_variants.IDENTITY) ? item : Functions.funcall(key, item);
        final SubLObject success_count = Sequences.count(key_item, list, test, key, (SubLObject)sort_variants.UNPROVIDED, (SubLObject)sort_variants.UNPROVIDED);
        SubLObject success_rest;
        final SubLObject success_list = success_rest = (SubLObject)ConsesLow.make_list(success_count, (SubLObject)sort_variants.UNPROVIDED);
        final SubLObject failure_count = Numbers.subtract(Sequences.length(list), success_count);
        SubLObject failure_rest;
        final SubLObject failure_list = failure_rest = (SubLObject)ConsesLow.make_list(failure_count, (SubLObject)sort_variants.UNPROVIDED);
        SubLObject cdolist_list_var = list;
        SubLObject next_item = (SubLObject)sort_variants.NIL;
        next_item = cdolist_list_var.first();
        while (sort_variants.NIL != cdolist_list_var) {
            final SubLObject key_next = (key.eql(Symbols.symbol_function((SubLObject)sort_variants.IDENTITY)) || key == sort_variants.IDENTITY) ? next_item : Functions.funcall(key, next_item);
            if (sort_variants.NIL != Functions.funcall(test, key_item, key_next)) {
                ConsesLow.rplaca(success_rest, next_item);
                success_rest = success_rest.rest();
            }
            else {
                ConsesLow.rplaca(failure_rest, next_item);
                failure_rest = failure_rest.rest();
            }
            cdolist_list_var = cdolist_list_var.rest();
            next_item = cdolist_list_var.first();
        }
        return Values.values(failure_list, success_list);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sort-variants.lisp", position = 24572L)
    public static SubLObject nsplit_by_item(final SubLObject item, final SubLObject list, SubLObject test, SubLObject key) {
        if (test == sort_variants.UNPROVIDED) {
            test = Symbols.symbol_function((SubLObject)sort_variants.EQL);
        }
        if (key == sort_variants.UNPROVIDED) {
            key = Symbols.symbol_function((SubLObject)sort_variants.IDENTITY);
        }
        assert sort_variants.NIL != Types.listp(list) : list;
        assert sort_variants.NIL != Types.function_spec_p(test) : test;
        assert sort_variants.NIL != Types.function_spec_p(key) : key;
        final SubLObject key_item = (key.eql(Symbols.symbol_function((SubLObject)sort_variants.IDENTITY)) || key == sort_variants.IDENTITY) ? item : Functions.funcall(key, item);
        SubLObject success_list = (SubLObject)sort_variants.NIL;
        SubLObject success_rest = (SubLObject)sort_variants.NIL;
        SubLObject failure_list = (SubLObject)sort_variants.NIL;
        SubLObject failure_rest = (SubLObject)sort_variants.NIL;
        SubLObject next_cons;
        SubLObject next_cdr;
        SubLObject next_item;
        SubLObject key_next;
        for (next_cons = (SubLObject)sort_variants.NIL, next_cdr = (SubLObject)sort_variants.NIL, next_cons = list, next_cdr = list.rest(); sort_variants.NIL != next_cons; next_cons = next_cdr, next_cdr = next_cdr.rest()) {
            ConsesLow.rplacd(next_cons, (SubLObject)sort_variants.NIL);
            next_item = next_cons.first();
            key_next = ((key.eql(Symbols.symbol_function((SubLObject)sort_variants.IDENTITY)) || key == sort_variants.IDENTITY) ? next_item : Functions.funcall(key, next_item));
            if (sort_variants.NIL != Functions.funcall(test, key_item, key_next)) {
                if (sort_variants.NIL != success_list) {
                    ConsesLow.rplacd(success_rest, next_cons);
                }
                else {
                    success_list = next_cons;
                }
                success_rest = next_cons;
            }
            else {
                if (sort_variants.NIL != failure_list) {
                    ConsesLow.rplacd(failure_rest, next_cons);
                }
                else {
                    failure_list = next_cons;
                }
                failure_rest = next_cons;
            }
        }
        return Values.values(failure_list, success_list);
    }
    
    public static SubLObject declare_sort_variants_file() {
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.sort_variants", "funcall_key", "FUNCALL-KEY");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sort_variants", "sort_new", "SORT-NEW", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sort_variants", "nsort_new", "NSORT-NEW", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sort_variants", "stable_sort_new", "STABLE-SORT-NEW", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sort_variants", "nstable_sort_new", "NSTABLE-SORT-NEW", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sort_variants", "sequence_order_status", "SEQUENCE-ORDER-STATUS", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sort_variants", "compute_sequence_order_status", "COMPUTE-SEQUENCE-ORDER-STATUS", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sort_variants", "sort_new_internal", "SORT-NEW-INTERNAL", 5, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sort_variants", "sort_new_internal_guts", "SORT-NEW-INTERNAL-GUTS", 5, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sort_variants", "merge_sort_list", "MERGE-SORT-LIST", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sort_variants", "merge_sort_list_recursive", "MERGE-SORT-LIST-RECURSIVE", 5, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sort_variants", "merge_sort_list_splice", "MERGE-SORT-LIST-SPLICE", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sort_variants", "merge_sort_list_merge", "MERGE-SORT-LIST-MERGE", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sort_variants", "merge_sort_vector", "MERGE-SORT-VECTOR", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sort_variants", "merge_sort_vector_recursive", "MERGE-SORT-VECTOR-RECURSIVE", 6, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sort_variants", "merge_sort_vector_merge", "MERGE-SORT-VECTOR-MERGE", 8, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sort_variants", "quick_sort_list", "QUICK-SORT-LIST", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sort_variants", "quick_sort_list_pivot_item", "QUICK-SORT-LIST-PIVOT-ITEM", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sort_variants", "quick_sort_list_partition", "QUICK-SORT-LIST-PARTITION", 3, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sort_variants", "quick_sort_vector", "QUICK-SORT-VECTOR", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sort_variants", "quick_sort_vector_recursive", "QUICK-SORT-VECTOR-RECURSIVE", 5, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sort_variants", "quick_sort_vector_pivot_item", "QUICK-SORT-VECTOR-PIVOT-ITEM", 5, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sort_variants", "quick_sort_vector_partition", "QUICK-SORT-VECTOR-PARTITION", 6, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sort_variants", "f_2expt", "2EXPT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sort_variants", "copy_sequence", "COPY-SEQUENCE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sort_variants", "sequence_swap", "SEQUENCE-SWAP", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sort_variants", "csetf_elt", "CSETF-ELT", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sort_variants", "split_by_item", "SPLIT-BY-ITEM", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sort_variants", "nsplit_by_item", "NSPLIT-BY-ITEM", 2, 2, false);
        return (SubLObject)sort_variants.NIL;
    }
    
    public static SubLObject init_sort_variants_file() {
        sort_variants.$quick_sort_recursion_limit$ = SubLFiles.deflexical("*QUICK-SORT-RECURSION-LIMIT*", (SubLObject)sort_variants.$int14$256);
        return (SubLObject)sort_variants.NIL;
    }
    
    public static SubLObject setup_sort_variants_file() {
        return (SubLObject)sort_variants.NIL;
    }
    
    public void declareFunctions() {
        declare_sort_variants_file();
    }
    
    public void initializeVariables() {
        init_sort_variants_file();
    }
    
    public void runTopLevelForms() {
        setup_sort_variants_file();
    }
    
    static {
        me = (SubLFile)new sort_variants();
        sort_variants.$quick_sort_recursion_limit$ = null;
        $list0 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("KEY"), (SubLObject)SubLObjectFactory.makeSymbol("OBJECT"));
        $sym1$FIF = SubLObjectFactory.makeSymbol("FIF");
        $sym2$COR = SubLObjectFactory.makeSymbol("COR");
        $list3 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FUNCTION"), (SubLObject)sort_variants.IDENTITY));
        $list4 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)sort_variants.IDENTITY));
        $sym5$FUNCALL = SubLObjectFactory.makeSymbol("FUNCALL");
        $sym6$SEQUENCEP = SubLObjectFactory.makeSymbol("SEQUENCEP");
        $sym7$FUNCTION_SPEC_P = SubLObjectFactory.makeSymbol("FUNCTION-SPEC-P");
        $kw8$ORDERED = SubLObjectFactory.makeKeyword("ORDERED");
        $kw9$REVERSE_ORDERED = SubLObjectFactory.makeKeyword("REVERSE-ORDERED");
        $kw10$NOT_ORDERABLE = SubLObjectFactory.makeKeyword("NOT-ORDERABLE");
        $kw11$ALMOST_ORDERED = SubLObjectFactory.makeKeyword("ALMOST-ORDERED");
        $kw12$ALMOST_REVERSE_ORDERED = SubLObjectFactory.makeKeyword("ALMOST-REVERSE-ORDERED");
        $kw13$UNORDERED = SubLObjectFactory.makeKeyword("UNORDERED");
        $int14$256 = SubLObjectFactory.makeInteger(256);
        $list15 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIRST"), (SubLObject)SubLObjectFactory.makeSymbol("SECOND"));
        $list16 = (SubLList)ConsesLow.cons((SubLObject)SubLObjectFactory.makeSymbol("FIRST-ITEM"), (SubLObject)SubLObjectFactory.makeSymbol("REST-ITEMS"));
        $str17$_S_is_not_a_sequence = SubLObjectFactory.makeString("~S is not a sequence");
        $str18$NIL_is_not_a_sequence_that_can_be = SubLObjectFactory.makeString("NIL is not a sequence that can be modified");
        $sym19$LISTP = SubLObjectFactory.makeSymbol("LISTP");
    }
}

/*

	Total time: 194 ms
	
*/