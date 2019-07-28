package com.cyc.cycjava.cycl;


import com.cyc.cycjava.cycl.sort_variants;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Strings;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

import static com.cyc.cycjava.cycl.sort_variants.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.EQ;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.EQL;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.IDENTITY;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.NIL;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.ONE_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.T;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.TWO_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.UNPROVIDED;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.ZERO_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors.*;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.*;
import static com.cyc.tool.subl.util.SubLFiles.*;
import static com.cyc.tool.subl.util.SubLTranslatedFile.*;


public final class sort_variants extends SubLTranslatedFile {
    public static final SubLFile me = new sort_variants();

    public static final String myName = "com.cyc.cycjava.cycl.sort_variants";

    public static final String myFingerPrint = "28d0e7ab55a1654ad41e911f3a0d0f25f18d48a6d7213693d1f251250d812e2b";

    // deflexical
    private static final SubLSymbol $quick_sort_recursion_limit$ = makeSymbol("*QUICK-SORT-RECURSION-LIMIT*");

    private static final SubLList $list0 = list(makeSymbol("KEY"), makeSymbol("OBJECT"));





    private static final SubLList $list3 = list(list(makeSymbol("FUNCTION"), IDENTITY));

    private static final SubLList $list4 = list(list(makeSymbol("QUOTE"), IDENTITY));









    private static final SubLSymbol $REVERSE_ORDERED = makeKeyword("REVERSE-ORDERED");

    private static final SubLSymbol $NOT_ORDERABLE = makeKeyword("NOT-ORDERABLE");

    private static final SubLSymbol $ALMOST_ORDERED = makeKeyword("ALMOST-ORDERED");

    private static final SubLSymbol $ALMOST_REVERSE_ORDERED = makeKeyword("ALMOST-REVERSE-ORDERED");





    private static final SubLList $list15 = list(makeSymbol("FIRST"), makeSymbol("SECOND"));

    private static final SubLList $list16 = cons(makeSymbol("FIRST-ITEM"), makeSymbol("REST-ITEMS"));

    private static final SubLString $str17$_S_is_not_a_sequence = makeString("~S is not a sequence");

    private static final SubLString $str18$NIL_is_not_a_sequence_that_can_be = makeString("NIL is not a sequence that can be modified");



    public static SubLObject funcall_key(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject key = NIL;
        SubLObject v_object = NIL;
        destructuring_bind_must_consp(current, datum, $list0);
        key = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list0);
        v_object = current.first();
        current = current.rest();
        if (NIL == current) {
            return list(FIF, list(COR, listS(EQ, key, $list3), listS(EQ, key, $list4)), v_object, list(FUNCALL, key, v_object));
        }
        cdestructuring_bind_error(datum, $list0);
        return NIL;
    }

    public static SubLObject sort_new(final SubLObject sequence, final SubLObject predicate, SubLObject key) {
        if (key == UNPROVIDED) {
            key = symbol_function(IDENTITY);
        }
        assert NIL != sequencep(sequence) : "Types.sequencep(sequence) " + "CommonSymbols.NIL != Types.sequencep(sequence) " + sequence;
        assert NIL != function_spec_p(predicate) : "Types.function_spec_p(predicate) " + "CommonSymbols.NIL != Types.function_spec_p(predicate) " + predicate;
        assert NIL != function_spec_p(key) : "Types.function_spec_p(key) " + "CommonSymbols.NIL != Types.function_spec_p(key) " + key;
        return sort_new_internal(sequence, predicate, key, NIL, NIL);
    }

    public static SubLObject nsort_new(final SubLObject sequence, final SubLObject predicate, SubLObject key) {
        if (key == UNPROVIDED) {
            key = symbol_function(IDENTITY);
        }
        assert NIL != sequencep(sequence) : "Types.sequencep(sequence) " + "CommonSymbols.NIL != Types.sequencep(sequence) " + sequence;
        assert NIL != function_spec_p(predicate) : "Types.function_spec_p(predicate) " + "CommonSymbols.NIL != Types.function_spec_p(predicate) " + predicate;
        assert NIL != function_spec_p(key) : "Types.function_spec_p(key) " + "CommonSymbols.NIL != Types.function_spec_p(key) " + key;
        return sort_new_internal(sequence, predicate, key, NIL, T);
    }

    public static SubLObject stable_sort_new(final SubLObject sequence, final SubLObject predicate, SubLObject key) {
        if (key == UNPROVIDED) {
            key = symbol_function(IDENTITY);
        }
        assert NIL != sequencep(sequence) : "Types.sequencep(sequence) " + "CommonSymbols.NIL != Types.sequencep(sequence) " + sequence;
        assert NIL != function_spec_p(predicate) : "Types.function_spec_p(predicate) " + "CommonSymbols.NIL != Types.function_spec_p(predicate) " + predicate;
        assert NIL != function_spec_p(key) : "Types.function_spec_p(key) " + "CommonSymbols.NIL != Types.function_spec_p(key) " + key;
        return sort_new_internal(sequence, predicate, key, T, NIL);
    }

    public static SubLObject nstable_sort_new(final SubLObject sequence, final SubLObject predicate, SubLObject key) {
        if (key == UNPROVIDED) {
            key = symbol_function(IDENTITY);
        }
        assert NIL != sequencep(sequence) : "Types.sequencep(sequence) " + "CommonSymbols.NIL != Types.sequencep(sequence) " + sequence;
        assert NIL != function_spec_p(predicate) : "Types.function_spec_p(predicate) " + "CommonSymbols.NIL != Types.function_spec_p(predicate) " + predicate;
        assert NIL != function_spec_p(key) : "Types.function_spec_p(key) " + "CommonSymbols.NIL != Types.function_spec_p(key) " + key;
        return sort_new_internal(sequence, predicate, key, T, T);
    }

    public static SubLObject sequence_order_status(final SubLObject sequence, final SubLObject predicate, SubLObject key) {
        if (key == UNPROVIDED) {
            key = symbol_function(IDENTITY);
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != sequencep(sequence) : "Types.sequencep(sequence) " + "CommonSymbols.NIL != Types.sequencep(sequence) " + sequence;
        assert NIL != function_spec_p(predicate) : "Types.function_spec_p(predicate) " + "CommonSymbols.NIL != Types.function_spec_p(predicate) " + predicate;
        assert NIL != function_spec_p(key) : "Types.function_spec_p(key) " + "CommonSymbols.NIL != Types.function_spec_p(key) " + key;
        thread.resetMultipleValues();
        final SubLObject ordered = compute_sequence_order_status(sequence, predicate, key);
        final SubLObject equivalent = thread.secondMultipleValue();
        final SubLObject reversed = thread.thirdMultipleValue();
        thread.resetMultipleValues();
        if ((ordered.isZero() && equivalent.isZero()) && reversed.isZero()) {
            return $ORDERED;
        }
        if (equivalent.isZero() && reversed.isZero()) {
            return $ORDERED;
        }
        if (ordered.isZero() && equivalent.isZero()) {
            return $REVERSE_ORDERED;
        }
        if (ordered.isZero() && reversed.isZero()) {
            return $NOT_ORDERABLE;
        }
        if (ordered.numGE(number_utilities.f_2X(add(equivalent, reversed)))) {
            return $ALMOST_ORDERED;
        }
        if (reversed.numGE(number_utilities.f_2X(add(equivalent, ordered)))) {
            return $ALMOST_REVERSE_ORDERED;
        }
        return $UNORDERED;
    }

    public static SubLObject compute_sequence_order_status(final SubLObject sequence, final SubLObject predicate, SubLObject key) {
        if (key == UNPROVIDED) {
            key = symbol_function(IDENTITY);
        }
        SubLObject ordered = ZERO_INTEGER;
        SubLObject equivalent = ZERO_INTEGER;
        SubLObject reversed = ZERO_INTEGER;
        SubLObject key_last = NIL;
        for (SubLObject sequence_var = sequence, end_index = (sequence_var.isList()) ? NIL : length(sequence_var), num = ZERO_INTEGER, sequence_doneP = subl_macros.do_sequence_index_doneP(num, end_index, sequence_var); NIL == sequence_doneP; sequence_doneP = subl_macros.do_sequence_index_doneP(num, end_index, sequence_var)) {
            final SubLObject next_element = subl_macros.do_sequence_index_valueP(num, sequence_var);
            final SubLObject key_next = (key.eql(symbol_function(IDENTITY)) || (key == IDENTITY)) ? next_element : funcall(key, next_element);
            if (!num.isZero()) {
                if (NIL != funcall(predicate, key_last, key_next)) {
                    ordered = add(ordered, ONE_INTEGER);
                } else
                    if (NIL != funcall(predicate, key_next, key_last)) {
                        reversed = add(reversed, ONE_INTEGER);
                    } else {
                        equivalent = add(equivalent, ONE_INTEGER);
                    }

            }
            key_last = key_next;
            sequence_var = subl_macros.do_sequence_index_update(sequence_var);
            num = add(num, ONE_INTEGER);
        }
        return values(ordered, equivalent, reversed);
    }

    public static SubLObject sort_new_internal(SubLObject sequence, final SubLObject predicate, final SubLObject key, final SubLObject stable_p, SubLObject destructive_p) {
        final SubLObject pcase_var;
        SubLObject sort_status = pcase_var = sequence_order_status(sequence, predicate, key);
        if (pcase_var.eql($ORDERED)) {
            if (NIL != destructive_p) {
                return sequence;
            }
            return copy_sequence(sequence);
        } else
            if (pcase_var.eql($REVERSE_ORDERED)) {
                if (NIL != destructive_p) {
                    return nreverse(sequence);
                }
                return reverse(sequence);
            } else {
                if (!pcase_var.eql($NOT_ORDERABLE)) {
                    if (pcase_var.eql($ALMOST_REVERSE_ORDERED) && (NIL == stable_p)) {
                        if (NIL != destructive_p) {
                            sequence = nreverse(sequence);
                        } else {
                            sequence = reverse(sequence);
                        }
                        destructive_p = T;
                        sort_status = $ALMOST_ORDERED;
                    }
                    if (NIL == destructive_p) {
                        sequence = copy_sequence(sequence);
                    }
                    return sort_new_internal_guts(sequence, predicate, key, sort_status, stable_p);
                }
                if (NIL != destructive_p) {
                    return sequence;
                }
                return copy_sequence(sequence);
            }

    }

    public static SubLObject sort_new_internal_guts(final SubLObject sequence, final SubLObject predicate, final SubLObject key, final SubLObject sort_status, final SubLObject stable_p) {
        final SubLObject length = length(sequence);
        if (($UNORDERED == sort_status) || length.numL($quick_sort_recursion_limit$.getGlobalValue())) {
            if (sequence.isList()) {
                return quick_sort_list(sequence, predicate, key);
            }
            if (NIL != stable_p) {
                return merge_sort_vector(sequence, predicate, key);
            }
            return quick_sort_vector(sequence, predicate, key);
        } else {
            if (sequence.isList()) {
                return merge_sort_list(sequence, predicate, key);
            }
            return merge_sort_vector(sequence, predicate, key);
        }
    }

    public static SubLObject merge_sort_list(final SubLObject list, final SubLObject predicate, SubLObject key) {
        if (key == UNPROVIDED) {
            key = symbol_function(IDENTITY);
        }
        final SubLObject length = length(list);
        final SubLObject depth = integer_length(length);
        final SubLObject width = f_2expt(number_utilities.f_1_(depth));
        return merge_sort_list_recursive(depth, width, list, predicate, key);
    }

    public static SubLObject merge_sort_list_recursive(final SubLObject depth, final SubLObject width, final SubLObject list, final SubLObject predicate, final SubLObject key) {
        SubLObject v_answer = NIL;
        if (depth.isZero()) {
            v_answer = list;
        } else {
            SubLObject last_of_list_front = nthcdr(number_utilities.f_1_(width), list);
            SubLObject list_back = last_of_list_front.rest();
            final SubLObject recursive_depth = number_utilities.f_1_(depth);
            final SubLObject recursive_width = integerDivide(width, TWO_INTEGER);
            if ((NIL == last_of_list_front) || (NIL == list_back)) {
                v_answer = merge_sort_list_recursive(recursive_depth, recursive_width, list, predicate, key);
            } else {
                rplacd(last_of_list_front, NIL);
                final SubLObject list_front = merge_sort_list_recursive(recursive_depth, recursive_width, list, predicate, key);
                list_back = merge_sort_list_recursive(recursive_depth, recursive_width, list_back, predicate, key);
                last_of_list_front = last(list_front, UNPROVIDED);
                final SubLObject key_front_last = (key.eql(symbol_function(IDENTITY)) || (key == IDENTITY)) ? last_of_list_front.first() : funcall(key, last_of_list_front.first());
                final SubLObject key_back_first = (key.eql(symbol_function(IDENTITY)) || (key == IDENTITY)) ? list_back.first() : funcall(key, list_back.first());
                if (NIL == funcall(predicate, key_back_first, key_front_last)) {
                    v_answer = merge_sort_list_splice(list_front, last_of_list_front, list_back);
                } else {
                    v_answer = merge_sort_list_merge(list_front, list_back, predicate, key);
                }
            }
        }
        return v_answer;
    }

    public static SubLObject merge_sort_list_splice(final SubLObject list_front, final SubLObject last_of_list_front, final SubLObject list_back) {
        rplacd(last_of_list_front, list_back);
        return list_front;
    }

    public static SubLObject merge_sort_list_merge(final SubLObject list_front, final SubLObject list_back, final SubLObject predicate, final SubLObject key) {
        SubLObject rest_front = list_front;
        SubLObject rest_back = list_back;
        SubLObject key_front = (key.eql(symbol_function(IDENTITY)) || (key == IDENTITY)) ? rest_front.first() : funcall(key, rest_front.first());
        SubLObject key_back = (key.eql(symbol_function(IDENTITY)) || (key == IDENTITY)) ? rest_back.first() : funcall(key, rest_back.first());
        SubLObject answer_last = NIL;
        SubLObject v_answer = NIL;
        while ((NIL != rest_front) && (NIL != rest_back)) {
            if (NIL != funcall(predicate, key_back, key_front)) {
                if (NIL != answer_last) {
                    rplacd(answer_last, rest_back);
                    answer_last = answer_last.rest();
                } else {
                    v_answer = answer_last = rest_back;
                }
                rest_back = rest_back.rest();
                if (NIL == rest_back) {
                    continue;
                }
                key_back = (key.eql(symbol_function(IDENTITY)) || (key == IDENTITY)) ? rest_back.first() : funcall(key, rest_back.first());
            } else {
                if (NIL != answer_last) {
                    rplacd(answer_last, rest_front);
                    answer_last = answer_last.rest();
                } else {
                    v_answer = answer_last = rest_front;
                }
                rest_front = rest_front.rest();
                if (NIL == rest_front) {
                    continue;
                }
                key_front = (key.eql(symbol_function(IDENTITY)) || (key == IDENTITY)) ? rest_front.first() : funcall(key, rest_front.first());
            }
        } 
        if (NIL != rest_front) {
            rplacd(answer_last, rest_front);
        } else {
            rplacd(answer_last, rest_back);
        }
        return v_answer;
    }

    public static SubLObject merge_sort_vector(final SubLObject vector, final SubLObject predicate, SubLObject key) {
        if (key == UNPROVIDED) {
            key = symbol_function(IDENTITY);
        }
        merge_sort_vector_recursive(ZERO_INTEGER, length(vector), copy_sequence(vector), vector, predicate, key);
        return vector;
    }

    public static SubLObject merge_sort_vector_recursive(final SubLObject left_start, final SubLObject right_end, final SubLObject scratch_vector, final SubLObject vector, final SubLObject predicate, final SubLObject key) {
        final SubLObject length = subtract(right_end, left_start);
        if (!ZERO_INTEGER.numE(length)) {
            if (!ONE_INTEGER.numE(length)) {
                if (TWO_INTEGER.numE(length)) {
                    final SubLObject second_index = number_utilities.f_1X(left_start);
                    final SubLObject first = elt(vector, left_start);
                    final SubLObject second = elt(vector, second_index);
                    if (NIL == funcall(predicate, key.eql(symbol_function(IDENTITY)) || (key == IDENTITY) ? first : funcall(key, first), key.eql(symbol_function(IDENTITY)) || (key == IDENTITY) ? second : funcall(key, second))) {
                        sequence_swap(vector, left_start, second_index);
                    }
                } else {
                    final SubLObject before_end;
                    final SubLObject after_start = before_end = integerDivide(add(left_start, right_end), TWO_INTEGER);
                    merge_sort_vector_recursive(left_start, before_end, scratch_vector, vector, predicate, key);
                    merge_sort_vector_recursive(after_start, right_end, scratch_vector, vector, predicate, key);
                    merge_sort_vector_merge(left_start, before_end, after_start, right_end, scratch_vector, vector, predicate, key);
                }
            }
        }
        return NIL;
    }

    public static SubLObject merge_sort_vector_merge(final SubLObject before_start, final SubLObject before_end, final SubLObject after_start, final SubLObject after_end, final SubLObject scratch_vector, final SubLObject vector, final SubLObject predicate, final SubLObject key) {
        replace(scratch_vector, vector, before_start, before_end, before_start, before_end);
        replace(scratch_vector, vector, after_start, after_end, after_start, after_end);
        SubLObject before_index = before_start;
        SubLObject after_index = after_start;
        SubLObject merge_index = before_start;
        SubLObject elt_before = elt(scratch_vector, before_index);
        SubLObject elt_after = elt(scratch_vector, after_index);
        SubLObject key_before = (key.eql(symbol_function(IDENTITY)) || (key == IDENTITY)) ? elt_before : funcall(key, elt_before);
        SubLObject key_after = (key.eql(symbol_function(IDENTITY)) || (key == IDENTITY)) ? elt_after : funcall(key, elt_after);
        while ((!before_index.numE(before_end)) && (!after_index.numE(after_end))) {
            if (NIL != funcall(predicate, key_before, key_after)) {
                csetf_elt(vector, merge_index, elt_before);
                before_index = add(before_index, ONE_INTEGER);
                if (!before_index.numE(before_end)) {
                    elt_before = elt(scratch_vector, before_index);
                    key_before = (key.eql(symbol_function(IDENTITY)) || (key == IDENTITY)) ? elt_before : funcall(key, elt_before);
                }
            } else {
                csetf_elt(vector, merge_index, elt_after);
                after_index = add(after_index, ONE_INTEGER);
                if (!after_index.numE(after_end)) {
                    elt_after = elt(scratch_vector, after_index);
                    key_after = (key.eql(symbol_function(IDENTITY)) || (key == IDENTITY)) ? elt_after : funcall(key, elt_after);
                }
            }
            merge_index = add(merge_index, ONE_INTEGER);
        } 
        if (before_index.numE(before_end)) {
            replace(vector, scratch_vector, merge_index, after_end, after_index, after_end);
        } else {
            replace(vector, scratch_vector, merge_index, after_end, before_index, before_end);
        }
        return NIL;
    }

    public static SubLObject quick_sort_list(final SubLObject list, final SubLObject predicate, SubLObject key) {
        if (key == UNPROVIDED) {
            key = symbol_function(IDENTITY);
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject v_answer = NIL;
        if ((NIL == list) || (NIL != list_utilities.singletonP(list))) {
            v_answer = list;
        } else
            if (NIL != list_utilities.doubletonP(list)) {
                SubLObject first = NIL;
                SubLObject second = NIL;
                destructuring_bind_must_consp(list, list, $list15);
                first = list.first();
                SubLObject current = list.rest();
                destructuring_bind_must_consp(current, list, $list15);
                second = current.first();
                current = current.rest();
                if (NIL == current) {
                    if (NIL == funcall(predicate, key.eql(symbol_function(IDENTITY)) || (key == IDENTITY) ? first : funcall(key, first), key.eql(symbol_function(IDENTITY)) || (key == IDENTITY) ? second : funcall(key, second))) {
                        sequence_swap(list, ZERO_INTEGER, ONE_INTEGER);
                    }
                } else {
                    cdestructuring_bind_error(list, $list15);
                }
                v_answer = list;
            } else {
                thread.resetMultipleValues();
                final SubLObject pivot_item = quick_sort_list_pivot_item(list, predicate, key);
                final SubLObject pivot_found = thread.secondMultipleValue();
                thread.resetMultipleValues();
                if (NIL == pivot_found) {
                    v_answer = list;
                } else {
                    thread.resetMultipleValues();
                    SubLObject before_pivot = quick_sort_list_partition(pivot_item, list, predicate, key);
                    SubLObject after_pivot = thread.secondMultipleValue();
                    thread.resetMultipleValues();
                    before_pivot = quick_sort_list(before_pivot, predicate, key);
                    after_pivot = quick_sort_list(after_pivot, predicate, key);
                    v_answer = nconc(before_pivot, after_pivot);
                }
            }

        return v_answer;
    }

    public static SubLObject quick_sort_list_pivot_item(final SubLObject list, final SubLObject predicate, SubLObject key) {
        if (key == UNPROVIDED) {
            key = symbol_function(IDENTITY);
        }
        SubLObject pivot_item = NIL;
        SubLObject pivot_found = NIL;
        SubLObject first_item = NIL;
        SubLObject rest_items = NIL;
        destructuring_bind_must_consp(list, list, $list16);
        first_item = list.first();
        final SubLObject current = rest_items = list.rest();
        final SubLObject key_first = (key.eql(symbol_function(IDENTITY)) || (key == IDENTITY)) ? first_item : funcall(key, first_item);
        if (NIL == pivot_found) {
            SubLObject csome_list_var = rest_items;
            SubLObject rest_item = NIL;
            rest_item = csome_list_var.first();
            while ((NIL == pivot_found) && (NIL != csome_list_var)) {
                final SubLObject key_rest = (key.eql(symbol_function(IDENTITY)) || (key == IDENTITY)) ? rest_item : funcall(key, rest_item);
                if (NIL != funcall(predicate, key_first, key_rest)) {
                    pivot_found = T;
                    pivot_item = first_item;
                } else
                    if (NIL != funcall(predicate, key_rest, key_first)) {
                        pivot_found = T;
                        pivot_item = rest_item;
                    }

                csome_list_var = csome_list_var.rest();
                rest_item = csome_list_var.first();
            } 
        }
        return values(pivot_item, pivot_found);
    }

    public static SubLObject quick_sort_list_partition(final SubLObject pivot_item, final SubLObject list, final SubLObject predicate, SubLObject key) {
        if (key == UNPROVIDED) {
            key = symbol_function(IDENTITY);
        }
        return nsplit_by_item(pivot_item, list, predicate, key);
    }

    public static SubLObject quick_sort_vector(final SubLObject vector, final SubLObject predicate, SubLObject key) {
        if (key == UNPROVIDED) {
            key = symbol_function(IDENTITY);
        }
        quick_sort_vector_recursive(ZERO_INTEGER, length(vector), vector, predicate, key);
        return vector;
    }

    public static SubLObject quick_sort_vector_recursive(final SubLObject left_start, final SubLObject right_end, final SubLObject vector, final SubLObject predicate, final SubLObject key) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject length = subtract(right_end, left_start);
        if (!ZERO_INTEGER.numE(length)) {
            if (!ONE_INTEGER.numE(length)) {
                if (TWO_INTEGER.numE(length)) {
                    final SubLObject second_index = number_utilities.f_1X(left_start);
                    final SubLObject first = elt(vector, left_start);
                    final SubLObject second = elt(vector, second_index);
                    if (NIL == funcall(predicate, key.eql(symbol_function(IDENTITY)) || (key == IDENTITY) ? first : funcall(key, first), key.eql(symbol_function(IDENTITY)) || (key == IDENTITY) ? second : funcall(key, second))) {
                        sequence_swap(vector, left_start, second_index);
                    }
                } else {
                    thread.resetMultipleValues();
                    final SubLObject pivot_item = quick_sort_vector_pivot_item(left_start, right_end, vector, predicate, key);
                    final SubLObject pivot_found = thread.secondMultipleValue();
                    thread.resetMultipleValues();
                    if (NIL != pivot_found) {
                        final SubLObject before_end;
                        final SubLObject after_start = before_end = quick_sort_vector_partition(left_start, right_end, pivot_item, vector, predicate, key);
                        quick_sort_vector_recursive(left_start, before_end, vector, predicate, key);
                        quick_sort_vector_recursive(after_start, right_end, vector, predicate, key);
                    }
                }
            }
        }
        return NIL;
    }

    public static SubLObject quick_sort_vector_pivot_item(final SubLObject left_start, final SubLObject right_end, final SubLObject vector, final SubLObject predicate, final SubLObject key) {
        SubLObject pivot_item = NIL;
        SubLObject pivot_found = NIL;
        final SubLObject first_item = elt(vector, left_start);
        final SubLObject key_first = (key.eql(symbol_function(IDENTITY)) || (key == IDENTITY)) ? first_item : funcall(key, first_item);
        SubLObject rest_index;
        SubLObject rest_item;
        SubLObject key_rest;
        for (rest_index = NIL, rest_index = number_utilities.f_1X(left_start); (NIL == pivot_found) && (!rest_index.numE(right_end)); rest_index = number_utilities.f_1X(rest_index)) {
            rest_item = elt(vector, rest_index);
            key_rest = (key.eql(symbol_function(IDENTITY)) || (key == IDENTITY)) ? rest_item : funcall(key, rest_item);
            if (NIL != funcall(predicate, key_first, key_rest)) {
                pivot_found = T;
                pivot_item = first_item;
            } else
                if (NIL != funcall(predicate, key_rest, key_first)) {
                    pivot_found = T;
                    pivot_item = rest_item;
                }

        }
        return values(pivot_item, pivot_found);
    }

    public static SubLObject quick_sort_vector_partition(final SubLObject left_start, final SubLObject right_end, final SubLObject pivot_item, final SubLObject vector, final SubLObject predicate, final SubLObject key) {
        SubLObject left_index = left_start;
        SubLObject right_index = number_utilities.f_1_(right_end);
        if (right_index.numG(left_index)) {
            final SubLObject key_pivot = (key.eql(symbol_function(IDENTITY)) || (key == IDENTITY)) ? pivot_item : funcall(key, pivot_item);
            SubLObject left_item = elt(vector, left_index);
            SubLObject right_item = elt(vector, right_index);
            SubLObject key_left = (key.eql(symbol_function(IDENTITY)) || (key == IDENTITY)) ? left_item : funcall(key, left_item);
            SubLObject key_right = (key.eql(symbol_function(IDENTITY)) || (key == IDENTITY)) ? right_item : funcall(key, right_item);
            while (right_index.numG(left_index)) {
                while (right_index.numG(left_index) && (NIL == funcall(predicate, key_pivot, key_left))) {
                    left_index = add(left_index, ONE_INTEGER);
                    if (right_index.numG(left_index)) {
                        left_item = elt(vector, left_index);
                        key_left = (key.eql(symbol_function(IDENTITY)) || (key == IDENTITY)) ? left_item : funcall(key, left_item);
                    }
                } 
                while (right_index.numG(left_index) && (NIL != funcall(predicate, key_pivot, key_right))) {
                    right_index = subtract(right_index, ONE_INTEGER);
                    if (right_index.numG(left_index)) {
                        right_item = elt(vector, right_index);
                        key_right = (key.eql(symbol_function(IDENTITY)) || (key == IDENTITY)) ? right_item : funcall(key, right_item);
                    }
                } 
                if (right_index.numG(left_index)) {
                    sequence_swap(vector, left_index, right_index);
                    left_index = add(left_index, ONE_INTEGER);
                    right_index = subtract(right_index, ONE_INTEGER);
                    if (!right_index.numG(left_index)) {
                        continue;
                    }
                    left_item = elt(vector, left_index);
                    key_left = (key.eql(symbol_function(IDENTITY)) || (key == IDENTITY)) ? left_item : funcall(key, left_item);
                    right_item = elt(vector, right_index);
                    key_right = (key.eql(symbol_function(IDENTITY)) || (key == IDENTITY)) ? right_item : funcall(key, right_item);
                }
            } 
        }
        return left_index;
    }

    public static SubLObject f_2expt(final SubLObject power) {
        return expt(TWO_INTEGER, power);
    }

    public static SubLObject copy_sequence(final SubLObject sequence) {
        if (sequence.isList()) {
            return copy_list(sequence);
        }
        if (sequence.isVector()) {
            return vector_utilities.copy_vector(sequence);
        }
        if (sequence.isString()) {
            return string_utilities.copy_string(sequence);
        }
        return Errors.error($str17$_S_is_not_a_sequence, sequence);
    }

    public static SubLObject sequence_swap(final SubLObject sequence, final SubLObject index1, final SubLObject index2) {
        final SubLObject element1 = elt(sequence, index1);
        final SubLObject element2 = elt(sequence, index2);
        csetf_elt(sequence, index2, element1);
        csetf_elt(sequence, index1, element2);
        return sequence;
    }

    public static SubLObject csetf_elt(final SubLObject sequence, final SubLObject index, final SubLObject value) {
        if (sequence.isVector()) {
            set_aref(sequence, index, value);
        } else
            if (sequence.isString()) {
                Strings.set_char(sequence, index, value);
            } else
                if (sequence.isCons()) {
                    set_nth(index, sequence, value);
                } else
                    if (NIL == sequence) {
                        Errors.error($str18$NIL_is_not_a_sequence_that_can_be);
                    } else {
                        Errors.error($str17$_S_is_not_a_sequence, sequence);
                    }



        return sequence;
    }

    public static SubLObject split_by_item(final SubLObject item, final SubLObject list, SubLObject test, SubLObject key) {
        if (test == UNPROVIDED) {
            test = symbol_function(EQL);
        }
        if (key == UNPROVIDED) {
            key = symbol_function(IDENTITY);
        }
        final SubLObject key_item = (key.eql(symbol_function(IDENTITY)) || (key == IDENTITY)) ? item : funcall(key, item);
        final SubLObject success_count = count(key_item, list, test, key, UNPROVIDED, UNPROVIDED);
        SubLObject success_rest;
        final SubLObject success_list = success_rest = make_list(success_count, UNPROVIDED);
        final SubLObject failure_count = subtract(length(list), success_count);
        SubLObject failure_rest;
        final SubLObject failure_list = failure_rest = make_list(failure_count, UNPROVIDED);
        SubLObject cdolist_list_var = list;
        SubLObject next_item = NIL;
        next_item = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject key_next = (key.eql(symbol_function(IDENTITY)) || (key == IDENTITY)) ? next_item : funcall(key, next_item);
            if (NIL != funcall(test, key_item, key_next)) {
                rplaca(success_rest, next_item);
                success_rest = success_rest.rest();
            } else {
                rplaca(failure_rest, next_item);
                failure_rest = failure_rest.rest();
            }
            cdolist_list_var = cdolist_list_var.rest();
            next_item = cdolist_list_var.first();
        } 
        return values(failure_list, success_list);
    }

    public static SubLObject nsplit_by_item(final SubLObject item, final SubLObject list, SubLObject test, SubLObject key) {
        if (test == UNPROVIDED) {
            test = symbol_function(EQL);
        }
        if (key == UNPROVIDED) {
            key = symbol_function(IDENTITY);
        }
        assert NIL != listp(list) : "Types.listp(list) " + "CommonSymbols.NIL != Types.listp(list) " + list;
        assert NIL != function_spec_p(test) : "Types.function_spec_p(test) " + "CommonSymbols.NIL != Types.function_spec_p(test) " + test;
        assert NIL != function_spec_p(key) : "Types.function_spec_p(key) " + "CommonSymbols.NIL != Types.function_spec_p(key) " + key;
        final SubLObject key_item = (key.eql(symbol_function(IDENTITY)) || (key == IDENTITY)) ? item : funcall(key, item);
        SubLObject success_list = NIL;
        SubLObject success_rest = NIL;
        SubLObject failure_list = NIL;
        SubLObject failure_rest = NIL;
        SubLObject next_cons;
        SubLObject next_cdr;
        SubLObject next_item;
        SubLObject key_next;
        for (next_cons = NIL, next_cdr = NIL, next_cons = list, next_cdr = list.rest(); NIL != next_cons; next_cons = next_cdr , next_cdr = next_cdr.rest()) {
            rplacd(next_cons, NIL);
            next_item = next_cons.first();
            key_next = (key.eql(symbol_function(IDENTITY)) || (key == IDENTITY)) ? next_item : funcall(key, next_item);
            if (NIL != funcall(test, key_item, key_next)) {
                if (NIL != success_list) {
                    rplacd(success_rest, next_cons);
                } else {
                    success_list = next_cons;
                }
                success_rest = next_cons;
            } else {
                if (NIL != failure_list) {
                    rplacd(failure_rest, next_cons);
                } else {
                    failure_list = next_cons;
                }
                failure_rest = next_cons;
            }
        }
        return values(failure_list, success_list);
    }

    public static SubLObject declare_sort_variants_file() {
        declareMacro(me, "funcall_key", "FUNCALL-KEY");
        declareFunction(me, "sort_new", "SORT-NEW", 2, 1, false);
        declareFunction(me, "nsort_new", "NSORT-NEW", 2, 1, false);
        declareFunction(me, "stable_sort_new", "STABLE-SORT-NEW", 2, 1, false);
        declareFunction(me, "nstable_sort_new", "NSTABLE-SORT-NEW", 2, 1, false);
        declareFunction(me, "sequence_order_status", "SEQUENCE-ORDER-STATUS", 2, 1, false);
        declareFunction(me, "compute_sequence_order_status", "COMPUTE-SEQUENCE-ORDER-STATUS", 2, 1, false);
        declareFunction(me, "sort_new_internal", "SORT-NEW-INTERNAL", 5, 0, false);
        declareFunction(me, "sort_new_internal_guts", "SORT-NEW-INTERNAL-GUTS", 5, 0, false);
        declareFunction(me, "merge_sort_list", "MERGE-SORT-LIST", 2, 1, false);
        declareFunction(me, "merge_sort_list_recursive", "MERGE-SORT-LIST-RECURSIVE", 5, 0, false);
        declareFunction(me, "merge_sort_list_splice", "MERGE-SORT-LIST-SPLICE", 3, 0, false);
        declareFunction(me, "merge_sort_list_merge", "MERGE-SORT-LIST-MERGE", 4, 0, false);
        declareFunction(me, "merge_sort_vector", "MERGE-SORT-VECTOR", 2, 1, false);
        declareFunction(me, "merge_sort_vector_recursive", "MERGE-SORT-VECTOR-RECURSIVE", 6, 0, false);
        declareFunction(me, "merge_sort_vector_merge", "MERGE-SORT-VECTOR-MERGE", 8, 0, false);
        declareFunction(me, "quick_sort_list", "QUICK-SORT-LIST", 2, 1, false);
        declareFunction(me, "quick_sort_list_pivot_item", "QUICK-SORT-LIST-PIVOT-ITEM", 2, 1, false);
        declareFunction(me, "quick_sort_list_partition", "QUICK-SORT-LIST-PARTITION", 3, 1, false);
        declareFunction(me, "quick_sort_vector", "QUICK-SORT-VECTOR", 2, 1, false);
        declareFunction(me, "quick_sort_vector_recursive", "QUICK-SORT-VECTOR-RECURSIVE", 5, 0, false);
        declareFunction(me, "quick_sort_vector_pivot_item", "QUICK-SORT-VECTOR-PIVOT-ITEM", 5, 0, false);
        declareFunction(me, "quick_sort_vector_partition", "QUICK-SORT-VECTOR-PARTITION", 6, 0, false);
        declareFunction(me, "f_2expt", "2EXPT", 1, 0, false);
        declareFunction(me, "copy_sequence", "COPY-SEQUENCE", 1, 0, false);
        declareFunction(me, "sequence_swap", "SEQUENCE-SWAP", 3, 0, false);
        declareFunction(me, "csetf_elt", "CSETF-ELT", 3, 0, false);
        declareFunction(me, "split_by_item", "SPLIT-BY-ITEM", 2, 2, false);
        declareFunction(me, "nsplit_by_item", "NSPLIT-BY-ITEM", 2, 2, false);
        return NIL;
    }

    public static SubLObject init_sort_variants_file() {
        deflexical("*QUICK-SORT-RECURSION-LIMIT*", $int$256);
        return NIL;
    }

    public static SubLObject setup_sort_variants_file() {
        return NIL;
    }

    @Override
    public void declareFunctions() {
        declare_sort_variants_file();
    }

    @Override
    public void initializeVariables() {
        init_sort_variants_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_sort_variants_file();
    }

    static {






















    }
}

/**
 * Total time: 194 ms
 */
