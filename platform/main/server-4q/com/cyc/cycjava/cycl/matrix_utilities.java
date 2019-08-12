/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 */
package com.cyc.cycjava.cycl;


import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.*;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high.*;
import static com.cyc.tool.subl.util.SubLFiles.*;

import org.logicmoo.system.BeanShellCntrl;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.StreamsLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTrampolineFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 * module:      MATRIX-UTILITIES
 * source file: /cyc/top/cycl/matrix-utilities.lisp
 * created:     2019/07/03 17:37:12
 */
public final class matrix_utilities extends SubLTranslatedFile implements V12 {
    public static final SubLObject subloop_reserved_initialize_matrix_kitchen_sink_test_case_instance(SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, ISOLATED_P, NIL);
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_NUMBER, NIL);
        classes.subloop_initialize_slot(new_instance, TEST_CASE, RESULT, NIL);
        classes.subloop_initialize_slot(new_instance, TEST_CASE, TEST_METHOD, NIL);
        return NIL;
    }

    public static final SubLObject subloop_reserved_initialize_matrix_kitchen_sink_test_case_class(SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_COUNT, ZERO_INTEGER);
        classes.subloop_initialize_slot(new_instance, TEST_CASE, MODULE, NIL);
        classes.subloop_initialize_slot(new_instance, TEST_CASE, CATEGORIES, NIL);
        classes.subloop_initialize_slot(new_instance, TEST_CASE, SUITES, NIL);
        classes.subloop_initialize_slot(new_instance, TEST_CASE, TEST_METHODS, NIL);
        classes.subloop_initialize_slot(new_instance, TEST_CASE, ENABLED, NIL);
        classes.subloop_initialize_slot(new_instance, TEST_CASE, LOCK, NIL);
        return NIL;
    }

    public static final SubLObject matrix_kitchen_sink_test_case_p(SubLObject matrix_kitchen_sink_test_case) {
        return classes.subloop_instanceof_class(matrix_kitchen_sink_test_case, MATRIX_KITCHEN_SINK_TEST_CASE);
    }

    public static final SubLFile me = new matrix_utilities();

 public static final String myName = "com.cyc.cycjava.cycl.matrix_utilities";


    // Internal Constants
    @LispMethod(comment = "Internal Constants")
    private static final SubLSymbol MATRIX_P = makeSymbol("MATRIX-P");

    static private final SubLString $str1$__ = makeString("~%");

    static private final SubLString $str2$__ = makeString("| ");

    static private final SubLString $$$___ = makeString("   ");

    static private final SubLString $str4$___ = makeString("|~%");

    static private final SubLString $str6$Row_index__A_is_out_of_bounds = makeString("Row-index ~A is out of bounds");

    static private final SubLString $str7$Column_index__A_is_out_of_bounds = makeString("Column-index ~A is out of bounds");

    static private final SubLString $str8$In_method_swap_rows__index__A_out = makeString("In method swap-rows: index ~A out of bounds");

    private static final SubLSymbol MATRIX_OF_INTEGER_OR_FRACTION_P = makeSymbol("MATRIX-OF-INTEGER-OR-FRACTION-P");

    private static final SubLSymbol TRIANGULAR_MATRIX_OF_INTEGER_OR_FRACTION_P = makeSymbol("TRIANGULAR-MATRIX-OF-INTEGER-OR-FRACTION-P");

    // Definitions
    /**
     * A matrix-of-integer-or-fraction is a listp of listp's (of uniform length) of integer-or-fraction-p's
     */
    @LispMethod(comment = "A matrix-of-integer-or-fraction is a listp of listp\'s (of uniform length) of integer-or-fraction-p\'s")
    public static final SubLObject matrix_of_integer_or_fraction_p_alt(SubLObject v_object) {
        if (NIL != list_utilities.non_dotted_list_p(v_object)) {
            {
                SubLObject first_row = v_object.first();
                if (NIL != fraction_utilities.list_of_integer_or_fraction_p(first_row)) {
                    {
                        SubLObject num_cols = length(first_row);
                        SubLObject cdolist_list_var = v_object.rest();
                        SubLObject row = NIL;
                        for (row = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , row = cdolist_list_var.first()) {
                            if (NIL == fraction_utilities.list_of_integer_or_fraction_p(row)) {
                                return NIL;
                            }
                            if (NIL == list_utilities.lengthE(row, num_cols, UNPROVIDED)) {
                                return NIL;
                            }
                        }
                        return T;
                    }
                }
                return NIL;
            }
        }
        return NIL;
    }

    // Definitions
    /**
     * A matrix-of-integer-or-fraction is a listp of listp's (of uniform length) of integer-or-fraction-p's
     */
    @LispMethod(comment = "A matrix-of-integer-or-fraction is a listp of listp\'s (of uniform length) of integer-or-fraction-p\'s")
    public static SubLObject matrix_of_integer_or_fraction_p(final SubLObject v_object) {
        if (NIL == list_utilities.non_dotted_list_p(v_object)) {
            return NIL;
        }
        final SubLObject first_row = v_object.first();
        if (NIL != fraction_utilities.list_of_integer_or_fraction_p(first_row)) {
            final SubLObject num_cols = length(first_row);
            SubLObject cdolist_list_var = v_object.rest();
            SubLObject row = NIL;
            row = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                if (NIL == fraction_utilities.list_of_integer_or_fraction_p(row)) {
                    return NIL;
                }
                if (NIL == list_utilities.lengthE(row, num_cols, UNPROVIDED)) {
                    return NIL;
                }
                cdolist_list_var = cdolist_list_var.rest();
                row = cdolist_list_var.first();
            } 
            return T;
        }
        return NIL;
    }

    public static final SubLObject matrix_p_alt(SubLObject v_object) {
        return com.cyc.cycjava.cycl.matrix_utilities.matrix_of_integer_or_fraction_p(v_object);
    }

    public static SubLObject matrix_p(final SubLObject v_object) {
        return matrix_of_integer_or_fraction_p(v_object);
    }

    public static final SubLObject triangular_matrix_of_integer_or_fraction_p_alt(SubLObject v_object) {
        if (NIL != com.cyc.cycjava.cycl.matrix_utilities.matrix_of_integer_or_fraction_p(v_object)) {
            {
                SubLObject num_rows = com.cyc.cycjava.cycl.matrix_utilities.matrix_row_count(v_object);
                SubLObject num_cols = com.cyc.cycjava.cycl.matrix_utilities.matrix_column_count(v_object);
                if (!num_cols.numE(add(num_rows, ONE_INTEGER))) {
                    return NIL;
                }
                {
                    SubLObject list_var = NIL;
                    SubLObject row = NIL;
                    SubLObject index = NIL;
                    for (list_var = v_object, row = list_var.first(), index = ZERO_INTEGER; NIL != list_var; list_var = list_var.rest() , row = list_var.first() , index = add(ONE_INTEGER, index)) {
                        {
                            SubLObject index_prime = NIL;
                            for (index_prime = ZERO_INTEGER; index_prime.numL(index); index_prime = add(index_prime, ONE_INTEGER)) {
                                if (NIL == fraction_utilities.fractionE(ZERO_INTEGER, nth(index_prime, row))) {
                                    return NIL;
                                }
                            }
                        }
                        if (NIL != fraction_utilities.fractionE(ZERO_INTEGER, nth(index, row))) {
                            return NIL;
                        }
                    }
                }
            }
            return T;
        }
        return NIL;
    }

    public static SubLObject triangular_matrix_of_integer_or_fraction_p(final SubLObject v_object) {
        if (NIL == matrix_of_integer_or_fraction_p(v_object)) {
            return NIL;
        }
        final SubLObject num_rows = matrix_row_count(v_object);
        final SubLObject num_cols = matrix_column_count(v_object);
        if (!num_cols.numE(add(num_rows, ONE_INTEGER))) {
            return NIL;
        }
        SubLObject list_var = NIL;
        SubLObject row = NIL;
        SubLObject index = NIL;
        list_var = v_object;
        row = list_var.first();
        for (index = ZERO_INTEGER; NIL != list_var; list_var = list_var.rest() , row = list_var.first() , index = add(ONE_INTEGER, index)) {
            SubLObject index_prime;
            for (index_prime = NIL, index_prime = ZERO_INTEGER; index_prime.numL(index); index_prime = add(index_prime, ONE_INTEGER)) {
                if (NIL == fraction_utilities.fractionE(ZERO_INTEGER, nth(index_prime, row))) {
                    return NIL;
                }
            }
            if (NIL != fraction_utilities.fractionE(ZERO_INTEGER, nth(index, row))) {
                return NIL;
            }
        }
        return T;
    }

    public static final SubLObject new_matrix_alt(SubLObject list_of_lists) {
        SubLTrampolineFile.checkType(list_of_lists, MATRIX_P);
        return list_of_lists;
    }

    public static SubLObject new_matrix(final SubLObject list_of_lists) {
        assert NIL != matrix_p(list_of_lists) : "! matrix_utilities.matrix_p(list_of_lists) " + ("matrix_utilities.matrix_p(list_of_lists) " + "CommonSymbols.NIL != matrix_utilities.matrix_p(list_of_lists) ") + list_of_lists;
        return list_of_lists;
    }

    /**
     * Prints MATRIX to STREAM in a human-readable form, sort of.
     */
    @LispMethod(comment = "Prints MATRIX to STREAM in a human-readable form, sort of.")
    public static final SubLObject print_matrix_alt(SubLObject matrix, SubLObject stream) {
        if (stream == UNPROVIDED) {
            stream = StreamsLow.$standard_output$.getDynamicValue();
        }
        SubLTrampolineFile.checkType(matrix, MATRIX_P);
        format(stream, $str_alt1$__);
        {
            SubLObject cdolist_list_var = matrix;
            SubLObject row = NIL;
            for (row = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , row = cdolist_list_var.first()) {
                princ($str_alt2$__, stream);
                {
                    SubLObject cdolist_list_var_1 = row;
                    SubLObject value = NIL;
                    for (value = cdolist_list_var_1.first(); NIL != cdolist_list_var_1; cdolist_list_var_1 = cdolist_list_var_1.rest() , value = cdolist_list_var_1.first()) {
                        princ(value, stream);
                        princ($str_alt3$___, stream);
                    }
                }
                format(stream, $str_alt4$___);
            }
        }
        return NIL;
    }

    /**
     * Prints MATRIX to STREAM in a human-readable form, sort of.
     */
    @LispMethod(comment = "Prints MATRIX to STREAM in a human-readable form, sort of.")
    public static SubLObject print_matrix(final SubLObject matrix, SubLObject stream) {
        if (stream == UNPROVIDED) {
            stream = StreamsLow.$standard_output$.getDynamicValue();
        }
        assert NIL != matrix_p(matrix) : "! matrix_utilities.matrix_p(matrix) " + ("matrix_utilities.matrix_p(matrix) " + "CommonSymbols.NIL != matrix_utilities.matrix_p(matrix) ") + matrix;
        format(stream, $str1$__);
        SubLObject cdolist_list_var = matrix;
        SubLObject row = NIL;
        row = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            princ($str2$__, stream);
            SubLObject cdolist_list_var_$1 = row;
            SubLObject value = NIL;
            value = cdolist_list_var_$1.first();
            while (NIL != cdolist_list_var_$1) {
                princ(value, stream);
                princ($$$___, stream);
                cdolist_list_var_$1 = cdolist_list_var_$1.rest();
                value = cdolist_list_var_$1.first();
            } 
            format(stream, $str4$___);
            cdolist_list_var = cdolist_list_var.rest();
            row = cdolist_list_var.first();
        } 
        return NIL;
    }

    public static final SubLObject copy_matrix_alt(SubLObject matrix) {
        SubLTrampolineFile.checkType(matrix, MATRIX_P);
        return copy_tree(matrix);
    }

    public static SubLObject copy_matrix(final SubLObject matrix) {
        assert NIL != matrix_p(matrix) : "! matrix_utilities.matrix_p(matrix) " + ("matrix_utilities.matrix_p(matrix) " + "CommonSymbols.NIL != matrix_utilities.matrix_p(matrix) ") + matrix;
        return copy_tree(matrix);
    }

    /**
     *
     *
     * @param MATRIX;
    matrix-p
     * 		
     * @return integerp; the number of rows in MATRIX
     */
    @LispMethod(comment = "@param MATRIX;\nmatrix-p\r\n\t\t\r\n@return integerp; the number of rows in MATRIX")
    public static final SubLObject matrix_row_count_alt(SubLObject matrix) {
        SubLTrampolineFile.checkType(matrix, MATRIX_P);
        return length(matrix);
    }

    /**
     *
     *
     * @param MATRIX;
    matrix-p
     * 		
     * @return integerp; the number of rows in MATRIX
     */
    @LispMethod(comment = "@param MATRIX;\nmatrix-p\r\n\t\t\r\n@return integerp; the number of rows in MATRIX")
    public static SubLObject matrix_row_count(final SubLObject matrix) {
        assert NIL != matrix_p(matrix) : "! matrix_utilities.matrix_p(matrix) " + ("matrix_utilities.matrix_p(matrix) " + "CommonSymbols.NIL != matrix_utilities.matrix_p(matrix) ") + matrix;
        return length(matrix);
    }

    /**
     *
     *
     * @param MATRIX;
    matrix-p
     * 		
     * @return integerp; the number of columns in MATRIX
     */
    @LispMethod(comment = "@param MATRIX;\nmatrix-p\r\n\t\t\r\n@return integerp; the number of columns in MATRIX")
    public static final SubLObject matrix_column_count_alt(SubLObject matrix) {
        SubLTrampolineFile.checkType(matrix, MATRIX_P);
        return length(matrix.first());
    }

    /**
     *
     *
     * @param MATRIX;
    matrix-p
     * 		
     * @return integerp; the number of columns in MATRIX
     */
    @LispMethod(comment = "@param MATRIX;\nmatrix-p\r\n\t\t\r\n@return integerp; the number of columns in MATRIX")
    public static SubLObject matrix_column_count(final SubLObject matrix) {
        assert NIL != matrix_p(matrix) : "! matrix_utilities.matrix_p(matrix) " + ("matrix_utilities.matrix_p(matrix) " + "CommonSymbols.NIL != matrix_utilities.matrix_p(matrix) ") + matrix;
        return length(matrix.first());
    }

    /**
     *
     *
     * @param MATRIX;
    matrix-p
     * 		
     * @param I
     * 		; non-negative-integer-p less than (matrix-row-count MATRIX)
     * @param J
     * 		; non-negative-integer-p less than (matrix-column-count MATRIX)
     * 		Returns the element at row I, column J of MATRIX
     */
    @LispMethod(comment = "@param MATRIX;\nmatrix-p\r\n\t\t\r\n@param I\r\n\t\t; non-negative-integer-p less than (matrix-row-count MATRIX)\r\n@param J\r\n\t\t; non-negative-integer-p less than (matrix-column-count MATRIX)\r\n\t\tReturns the element at row I, column J of MATRIX")
    public static final SubLObject matrix_ij_alt(SubLObject matrix, SubLObject i, SubLObject j) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            SubLTrampolineFile.checkType(matrix, MATRIX_P);
            SubLTrampolineFile.checkType(i, NON_NEGATIVE_INTEGER_P);
            SubLTrampolineFile.checkType(j, NON_NEGATIVE_INTEGER_P);
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                if (!i.numL(com.cyc.cycjava.cycl.matrix_utilities.matrix_row_count(matrix))) {
                    Errors.error($str_alt6$Row_index__A_is_out_of_bounds, i);
                }
            }
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                if (!j.numL(com.cyc.cycjava.cycl.matrix_utilities.matrix_column_count(matrix))) {
                    Errors.error($str_alt7$Column_index__A_is_out_of_bounds, j);
                }
            }
            return nth(j, nth(i, matrix));
        }
    }

    /**
     *
     *
     * @param MATRIX;
    matrix-p
     * 		
     * @param I
     * 		; non-negative-integer-p less than (matrix-row-count MATRIX)
     * @param J
     * 		; non-negative-integer-p less than (matrix-column-count MATRIX)
     * 		Returns the element at row I, column J of MATRIX
     */
    @LispMethod(comment = "@param MATRIX;\nmatrix-p\r\n\t\t\r\n@param I\r\n\t\t; non-negative-integer-p less than (matrix-row-count MATRIX)\r\n@param J\r\n\t\t; non-negative-integer-p less than (matrix-column-count MATRIX)\r\n\t\tReturns the element at row I, column J of MATRIX")
    public static SubLObject matrix_ij(final SubLObject matrix, final SubLObject i, final SubLObject j) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != matrix_p(matrix) : "! matrix_utilities.matrix_p(matrix) " + ("matrix_utilities.matrix_p(matrix) " + "CommonSymbols.NIL != matrix_utilities.matrix_p(matrix) ") + matrix;
        assert NIL != subl_promotions.non_negative_integer_p(i) : "! subl_promotions.non_negative_integer_p(i) " + ("subl_promotions.non_negative_integer_p(i) " + "CommonSymbols.NIL != subl_promotions.non_negative_integer_p(i) ") + i;
        assert NIL != subl_promotions.non_negative_integer_p(j) : "! subl_promotions.non_negative_integer_p(j) " + ("subl_promotions.non_negative_integer_p(j) " + "CommonSymbols.NIL != subl_promotions.non_negative_integer_p(j) ") + j;
        if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (!i.numL(matrix_row_count(matrix)))) {
            Errors.error($str6$Row_index__A_is_out_of_bounds, i);
        }
        if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (!j.numL(matrix_column_count(matrix)))) {
            Errors.error($str7$Column_index__A_is_out_of_bounds, j);
        }
        return nth(j, nth(i, matrix));
    }

    /**
     *
     *
     * @param MATRIX;
    matrix-p
     * 		
     * @param ROW1;
    non-negative-integer-p
     * 		
     * @param ROW2;
    non-negative-integer-p
     * 		
     * @unknown matrix-p; a copy of MATRIX with the ROW1'th and ROW2'th rows swapped
     */
    @LispMethod(comment = "@param MATRIX;\nmatrix-p\r\n\t\t\r\n@param ROW1;\nnon-negative-integer-p\r\n\t\t\r\n@param ROW2;\nnon-negative-integer-p\r\n\t\t\r\n@unknown matrix-p; a copy of MATRIX with the ROW1\'th and ROW2\'th rows swapped")
    public static final SubLObject swap_rows_alt(SubLObject matrix, SubLObject row1, SubLObject row2) {
        return com.cyc.cycjava.cycl.matrix_utilities.swap_rows_internal(matrix, row1, row2, NIL);
    }

    /**
     *
     *
     * @param MATRIX;
    matrix-p
     * 		
     * @param ROW1;
    non-negative-integer-p
     * 		
     * @param ROW2;
    non-negative-integer-p
     * 		
     * @unknown matrix-p; a copy of MATRIX with the ROW1'th and ROW2'th rows swapped
     */
    @LispMethod(comment = "@param MATRIX;\nmatrix-p\r\n\t\t\r\n@param ROW1;\nnon-negative-integer-p\r\n\t\t\r\n@param ROW2;\nnon-negative-integer-p\r\n\t\t\r\n@unknown matrix-p; a copy of MATRIX with the ROW1\'th and ROW2\'th rows swapped")
    public static SubLObject swap_rows(final SubLObject matrix, final SubLObject row1, final SubLObject row2) {
        return swap_rows_internal(matrix, row1, row2, NIL);
    }

    /**
     *
     *
     * @param MATRIX;
    matrix-p
     * 		
     * @param ROW1;
    non-negative-integer-p
     * 		
     * @param ROW2;
    non-negative-integer-p
     * 		
     * @unknown matrix-p; a modified version of MATRIX with the ROW1'th and ROW2'th rows swapped
     */
    @LispMethod(comment = "@param MATRIX;\nmatrix-p\r\n\t\t\r\n@param ROW1;\nnon-negative-integer-p\r\n\t\t\r\n@param ROW2;\nnon-negative-integer-p\r\n\t\t\r\n@unknown matrix-p; a modified version of MATRIX with the ROW1\'th and ROW2\'th rows swapped")
    public static final SubLObject nswap_rows_alt(SubLObject matrix, SubLObject row1, SubLObject row2) {
        return com.cyc.cycjava.cycl.matrix_utilities.swap_rows_internal(matrix, row1, row2, T);
    }

    /**
     *
     *
     * @param MATRIX;
    matrix-p
     * 		
     * @param ROW1;
    non-negative-integer-p
     * 		
     * @param ROW2;
    non-negative-integer-p
     * 		
     * @unknown matrix-p; a modified version of MATRIX with the ROW1'th and ROW2'th rows swapped
     */
    @LispMethod(comment = "@param MATRIX;\nmatrix-p\r\n\t\t\r\n@param ROW1;\nnon-negative-integer-p\r\n\t\t\r\n@param ROW2;\nnon-negative-integer-p\r\n\t\t\r\n@unknown matrix-p; a modified version of MATRIX with the ROW1\'th and ROW2\'th rows swapped")
    public static SubLObject nswap_rows(final SubLObject matrix, final SubLObject row1, final SubLObject row2) {
        return swap_rows_internal(matrix, row1, row2, T);
    }

    public static final SubLObject swap_rows_internal_alt(SubLObject matrix, SubLObject row1, SubLObject row2, SubLObject destructiveP) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            SubLTrampolineFile.checkType(matrix, MATRIX_P);
            SubLTrampolineFile.checkType(row1, NON_NEGATIVE_INTEGER_P);
            SubLTrampolineFile.checkType(row2, NON_NEGATIVE_INTEGER_P);
            {
                SubLObject num_rows = com.cyc.cycjava.cycl.matrix_utilities.matrix_row_count(matrix);
                if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                    if (!row1.numL(num_rows)) {
                        Errors.error($str_alt8$In_method_swap_rows__index__A_out, row1);
                    }
                }
                if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                    if (!row2.numL(num_rows)) {
                        Errors.error($str_alt8$In_method_swap_rows__index__A_out, row2);
                    }
                }
            }
            {
                SubLObject new_matrix = (NIL != destructiveP) ? ((SubLObject) (matrix)) : com.cyc.cycjava.cycl.matrix_utilities.copy_matrix(matrix);
                set_nth(row1, new_matrix, nth(row2, matrix));
                set_nth(row2, new_matrix, nth(row1, matrix));
                return new_matrix;
            }
        }
    }

    public static SubLObject swap_rows_internal(final SubLObject matrix, final SubLObject row1, final SubLObject row2, final SubLObject destructiveP) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != matrix_p(matrix) : "! matrix_utilities.matrix_p(matrix) " + ("matrix_utilities.matrix_p(matrix) " + "CommonSymbols.NIL != matrix_utilities.matrix_p(matrix) ") + matrix;
        assert NIL != subl_promotions.non_negative_integer_p(row1) : "! subl_promotions.non_negative_integer_p(row1) " + ("subl_promotions.non_negative_integer_p(row1) " + "CommonSymbols.NIL != subl_promotions.non_negative_integer_p(row1) ") + row1;
        assert NIL != subl_promotions.non_negative_integer_p(row2) : "! subl_promotions.non_negative_integer_p(row2) " + ("subl_promotions.non_negative_integer_p(row2) " + "CommonSymbols.NIL != subl_promotions.non_negative_integer_p(row2) ") + row2;
        final SubLObject num_rows = matrix_row_count(matrix);
        if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (!row1.numL(num_rows))) {
            Errors.error($str8$In_method_swap_rows__index__A_out, row1);
        }
        if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (!row2.numL(num_rows))) {
            Errors.error($str8$In_method_swap_rows__index__A_out, row2);
        }
        final SubLObject new_matrix = (NIL != destructiveP) ? matrix : copy_matrix(matrix);
        set_nth(row1, new_matrix, nth(row2, matrix));
        set_nth(row2, new_matrix, nth(row1, matrix));
        return new_matrix;
    }

    /**
     *
     *
     * @param MATRIX;
     * 		triangular-matrix-of-integer-or-fraction-p (allowed to have extraneous all-zero rows)
     * @unknown listp (of length one less than the number of columns in MATRIX) of fraction-p
    Given a triangular matrix MATRIX, returns a list of coefficients that is the solution.
    MATRIX is interpreted as a set of linear equations of the form
    <a1>x1 + <a2>x2 + ... + <an-1>xn-1 = <an>
    where (<a1> <a2> ... <an>) is a row of MATRIX
     */
    @LispMethod(comment = "@param MATRIX;\r\n\t\ttriangular-matrix-of-integer-or-fraction-p (allowed to have extraneous all-zero rows)\r\n@unknown listp (of length one less than the number of columns in MATRIX) of fraction-p\r\nGiven a triangular matrix MATRIX, returns a list of coefficients that is the solution.\r\nMATRIX is interpreted as a set of linear equations of the form\r\n<a1>x1 + <a2>x2 + ... + <an-1>xn-1 = <an>\r\nwhere (<a1> <a2> ... <an>) is a row of MATRIX")
    public static final SubLObject solve_triangular_matrix_alt(SubLObject matrix) {
        SubLTrampolineFile.checkType(matrix, MATRIX_OF_INTEGER_OR_FRACTION_P);
        {
            SubLObject clean_matrix = com.cyc.cycjava.cycl.matrix_utilities.remove_allzero_rows(matrix);
            SubLTrampolineFile.checkType(clean_matrix, TRIANGULAR_MATRIX_OF_INTEGER_OR_FRACTION_P);
            {
                SubLObject reverse_matrix = nreverse(clean_matrix);
                SubLObject solution = NIL;
                SubLObject cdolist_list_var = reverse_matrix;
                SubLObject row = NIL;
                for (row = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , row = cdolist_list_var.first()) {
                    row = com.cyc.cycjava.cycl.matrix_utilities.remove_extraneous_zeroes(row);
                    solution = cons(com.cyc.cycjava.cycl.matrix_utilities.solve_row(row, solution), solution);
                }
                return solution;
            }
        }
    }

    /**
     *
     *
     * @param MATRIX;
     * 		triangular-matrix-of-integer-or-fraction-p (allowed to have extraneous all-zero rows)
     * @unknown listp (of length one less than the number of columns in MATRIX) of fraction-p
    Given a triangular matrix MATRIX, returns a list of coefficients that is the solution.
    MATRIX is interpreted as a set of linear equations of the form
    <a1>x1 + <a2>x2 + ... + <an-1>xn-1 = <an>
    where (<a1> <a2> ... <an>) is a row of MATRIX
     */
    @LispMethod(comment = "@param MATRIX;\r\n\t\ttriangular-matrix-of-integer-or-fraction-p (allowed to have extraneous all-zero rows)\r\n@unknown listp (of length one less than the number of columns in MATRIX) of fraction-p\r\nGiven a triangular matrix MATRIX, returns a list of coefficients that is the solution.\r\nMATRIX is interpreted as a set of linear equations of the form\r\n<a1>x1 + <a2>x2 + ... + <an-1>xn-1 = <an>\r\nwhere (<a1> <a2> ... <an>) is a row of MATRIX")
    public static SubLObject solve_triangular_matrix(final SubLObject matrix) {
        assert NIL != matrix_of_integer_or_fraction_p(matrix) : "! matrix_utilities.matrix_of_integer_or_fraction_p(matrix) " + ("matrix_utilities.matrix_of_integer_or_fraction_p(matrix) " + "CommonSymbols.NIL != matrix_utilities.matrix_of_integer_or_fraction_p(matrix) ") + matrix;
        final SubLObject clean_matrix = remove_allzero_rows(matrix);
        assert NIL != triangular_matrix_of_integer_or_fraction_p(clean_matrix) : "! matrix_utilities.triangular_matrix_of_integer_or_fraction_p(clean_matrix) " + ("matrix_utilities.triangular_matrix_of_integer_or_fraction_p(clean_matrix) " + "CommonSymbols.NIL != matrix_utilities.triangular_matrix_of_integer_or_fraction_p(clean_matrix) ") + clean_matrix;
        final SubLObject reverse_matrix = nreverse(clean_matrix);
        SubLObject solution = NIL;
        SubLObject cdolist_list_var = reverse_matrix;
        SubLObject row = NIL;
        row = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            row = remove_extraneous_zeroes(row);
            solution = cons(solve_row(row, solution), solution);
            cdolist_list_var = cdolist_list_var.rest();
            row = cdolist_list_var.first();
        } 
        return solution;
    }

    public static final SubLObject remove_allzero_rows_alt(SubLObject matrix) {
        {
            SubLObject new_matrix = com.cyc.cycjava.cycl.matrix_utilities.copy_matrix(matrix);
            SubLObject list_var = NIL;
            SubLObject row = NIL;
            SubLObject index = NIL;
            for (list_var = reverse(new_matrix), row = list_var.first(), index = number_utilities.f_1_(length(new_matrix)); NIL != list_var; list_var = list_var.rest() , row = list_var.first() , index = number_utilities.f_1_(index)) {
                if (NIL != com.cyc.cycjava.cycl.matrix_utilities.allzero_row_p(row)) {
                    new_matrix = list_utilities.delete_nth(index, new_matrix);
                }
            }
            return new_matrix;
        }
    }

    public static SubLObject remove_allzero_rows(final SubLObject matrix) {
        SubLObject new_matrix = copy_matrix(matrix);
        SubLObject list_var = NIL;
        SubLObject row = NIL;
        SubLObject index = NIL;
        list_var = reverse(new_matrix);
        row = list_var.first();
        for (index = number_utilities.f_1_(length(new_matrix)); NIL != list_var; list_var = list_var.rest() , row = list_var.first() , index = number_utilities.f_1_(index)) {
            if (NIL != allzero_row_p(row)) {
                new_matrix = list_utilities.delete_nth(index, new_matrix);
            }
        }
        return new_matrix;
    }

    public static final SubLObject allzero_row_p_alt(SubLObject row) {
        {
            SubLObject cdolist_list_var = row;
            SubLObject element = NIL;
            for (element = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , element = cdolist_list_var.first()) {
                if (NIL == fraction_utilities.fractionE(ZERO_INTEGER, element)) {
                    return NIL;
                }
            }
        }
        return T;
    }

    public static SubLObject allzero_row_p(final SubLObject row) {
        SubLObject cdolist_list_var = row;
        SubLObject element = NIL;
        element = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (NIL == fraction_utilities.fractionE(ZERO_INTEGER, element)) {
                return NIL;
            }
            cdolist_list_var = cdolist_list_var.rest();
            element = cdolist_list_var.first();
        } 
        return T;
    }

    public static final SubLObject remove_extraneous_zeroes_alt(SubLObject row) {
        while (NIL != fraction_utilities.fractionE(ZERO_INTEGER, row.first())) {
            row = row.rest();
        } 
        return row;
    }

    public static SubLObject remove_extraneous_zeroes(SubLObject row) {
        while (NIL != fraction_utilities.fractionE(ZERO_INTEGER, row.first())) {
            row = row.rest();
        } 
        return row;
    }

    public static final SubLObject solve_row_alt(SubLObject row, SubLObject partial_solution) {
        {
            SubLObject result = last(row, UNPROVIDED).first();
            SubLObject solved_vars = NIL;
            SubLObject solutions = NIL;
            for (solved_vars = butlast(row, UNPROVIDED).rest(), solutions = partial_solution; NIL != solutions; solved_vars = solved_vars.rest() , solutions = solutions.rest()) {
                result = fraction_utilities.fraction_minus(result, fraction_utilities.fraction_times2(solutions.first(), solved_vars.first()));
            }
            result = fraction_utilities.fraction_divide(result, row.first());
            return result;
        }
    }

    public static SubLObject solve_row(final SubLObject row, final SubLObject partial_solution) {
        SubLObject result = last(row, UNPROVIDED).first();
        SubLObject solved_vars = NIL;
        SubLObject solutions = NIL;
        solved_vars = butlast(row, UNPROVIDED).rest();
        for (solutions = partial_solution; NIL != solutions; solutions = solutions.rest()) {
            result = fraction_utilities.fraction_minus(result, fraction_utilities.fraction_times2(solutions.first(), solved_vars.first()));
            solved_vars = solved_vars.rest();
        }
        result = fraction_utilities.fraction_divide(result, row.first());
        return result;
    }

    /**
     *
     *
     * @param MATRIX;
    matrix-of-integer-or-fraction-p;
     * 		
     * @unknown matrix-of-integer-or-fraction-p; the Gaussian elimination of MATRIX,
    or NIL if there is none.
    Does not modify MATRIX.
     */
    @LispMethod(comment = "@param MATRIX;\nmatrix-of-integer-or-fraction-p;\r\n\t\t\r\n@unknown matrix-of-integer-or-fraction-p; the Gaussian elimination of MATRIX,\r\nor NIL if there is none.\r\nDoes not modify MATRIX.")
    public static final SubLObject gaussian_elimination_alt(SubLObject matrix) {
        SubLTrampolineFile.checkType(matrix, MATRIX_OF_INTEGER_OR_FRACTION_P);
        {
            SubLObject num_rows = com.cyc.cycjava.cycl.matrix_utilities.matrix_row_count(matrix);
            SubLObject num_cols = com.cyc.cycjava.cycl.matrix_utilities.matrix_column_count(matrix);
            SubLObject new_matrix = com.cyc.cycjava.cycl.matrix_utilities.copy_matrix(matrix);
            SubLObject iterations = subtract(min(num_cols, num_rows), ONE_INTEGER);
            SubLObject column = NIL;
            for (column = ZERO_INTEGER; column.numL(iterations); column = add(column, ONE_INTEGER)) {
                {
                    SubLObject baseline = column;
                    while (NIL != fraction_utilities.fractionE(ZERO_INTEGER, com.cyc.cycjava.cycl.matrix_utilities.matrix_ij(new_matrix, baseline, column))) {
                        baseline = number_utilities.f_1X(baseline);
                        if (baseline.numGE(num_rows)) {
                            return NIL;
                        }
                    } 
                    if (baseline.numG(column)) {
                        new_matrix = com.cyc.cycjava.cycl.matrix_utilities.swap_rows(new_matrix, column, baseline);
                    }
                }
                {
                    SubLObject row = NIL;
                    for (row = add(column, ONE_INTEGER); !row.numGE(num_rows); row = add(row, ONE_INTEGER)) {
                        {
                            SubLObject factor = fraction_utilities.fraction_divide(com.cyc.cycjava.cycl.matrix_utilities.matrix_ij(new_matrix, row, column), com.cyc.cycjava.cycl.matrix_utilities.matrix_ij(new_matrix, column, column));
                            SubLObject value = NIL;
                            for (value = ZERO_INTEGER; value.numL(num_cols); value = add(value, ONE_INTEGER)) {
                                set_nth(value, nth(row, new_matrix), fraction_utilities.fraction_minus(com.cyc.cycjava.cycl.matrix_utilities.matrix_ij(new_matrix, row, value), fraction_utilities.fraction_times2(com.cyc.cycjava.cycl.matrix_utilities.matrix_ij(new_matrix, column, value), factor)));
                            }
                        }
                    }
                }
            }
            return new_matrix;
        }
    }

    /**
     *
     *
     * @param MATRIX;
    matrix-of-integer-or-fraction-p;
     * 		
     * @unknown matrix-of-integer-or-fraction-p; the Gaussian elimination of MATRIX,
    or NIL if there is none.
    Does not modify MATRIX.
     */
    @LispMethod(comment = "@param MATRIX;\nmatrix-of-integer-or-fraction-p;\r\n\t\t\r\n@unknown matrix-of-integer-or-fraction-p; the Gaussian elimination of MATRIX,\r\nor NIL if there is none.\r\nDoes not modify MATRIX.")
    public static SubLObject gaussian_elimination(final SubLObject matrix) {
        assert NIL != matrix_of_integer_or_fraction_p(matrix) : "! matrix_utilities.matrix_of_integer_or_fraction_p(matrix) " + ("matrix_utilities.matrix_of_integer_or_fraction_p(matrix) " + "CommonSymbols.NIL != matrix_utilities.matrix_of_integer_or_fraction_p(matrix) ") + matrix;
        final SubLObject num_rows = matrix_row_count(matrix);
        final SubLObject num_cols = matrix_column_count(matrix);
        SubLObject new_matrix = copy_matrix(matrix);
        SubLObject iterations;
        SubLObject column;
        SubLObject baseline;
        SubLObject row;
        SubLObject factor;
        SubLObject value;
        for (iterations = subtract(min(num_cols, num_rows), ONE_INTEGER), column = NIL, column = ZERO_INTEGER; column.numL(iterations); column = add(column, ONE_INTEGER)) {
            baseline = column;
            while (NIL != fraction_utilities.fractionE(ZERO_INTEGER, matrix_ij(new_matrix, baseline, column))) {
                baseline = number_utilities.f_1X(baseline);
                if (baseline.numGE(num_rows)) {
                    return NIL;
                }
            } 
            if (baseline.numG(column)) {
                new_matrix = swap_rows(new_matrix, column, baseline);
            }
            for (row = NIL, row = add(column, ONE_INTEGER); !row.numGE(num_rows); row = add(row, ONE_INTEGER)) {
                factor = fraction_utilities.fraction_divide(matrix_ij(new_matrix, row, column), matrix_ij(new_matrix, column, column));
                for (value = NIL, value = ZERO_INTEGER; value.numL(num_cols); value = add(value, ONE_INTEGER)) {
                    set_nth(value, nth(row, new_matrix), fraction_utilities.fraction_minus(matrix_ij(new_matrix, row, value), fraction_utilities.fraction_times2(matrix_ij(new_matrix, column, value), factor)));
                }
            }
        }
        return new_matrix;
    }

    public static final SubLObject declare_matrix_utilities_file_alt() {
        declareFunction("matrix_of_integer_or_fraction_p", "MATRIX-OF-INTEGER-OR-FRACTION-P", 1, 0, false);
        declareFunction("matrix_p", "MATRIX-P", 1, 0, false);
        declareFunction("triangular_matrix_of_integer_or_fraction_p", "TRIANGULAR-MATRIX-OF-INTEGER-OR-FRACTION-P", 1, 0, false);
        declareFunction("new_matrix", "NEW-MATRIX", 1, 0, false);
        declareFunction("print_matrix", "PRINT-MATRIX", 1, 1, false);
        declareFunction("copy_matrix", "COPY-MATRIX", 1, 0, false);
        declareFunction("matrix_row_count", "MATRIX-ROW-COUNT", 1, 0, false);
        declareFunction("matrix_column_count", "MATRIX-COLUMN-COUNT", 1, 0, false);
        declareFunction("matrix_ij", "MATRIX-IJ", 3, 0, false);
        declareFunction("swap_rows", "SWAP-ROWS", 3, 0, false);
        declareFunction("nswap_rows", "NSWAP-ROWS", 3, 0, false);
        declareFunction("swap_rows_internal", "SWAP-ROWS-INTERNAL", 4, 0, false);
        declareFunction("solve_triangular_matrix", "SOLVE-TRIANGULAR-MATRIX", 1, 0, false);
        declareFunction("remove_allzero_rows", "REMOVE-ALLZERO-ROWS", 1, 0, false);
        declareFunction("allzero_row_p", "ALLZERO-ROW-P", 1, 0, false);
        declareFunction("remove_extraneous_zeroes", "REMOVE-EXTRANEOUS-ZEROES", 1, 0, false);
        declareFunction("solve_row", "SOLVE-ROW", 2, 0, false);
        declareFunction("gaussian_elimination", "GAUSSIAN-ELIMINATION", 1, 0, false);
        declareFunction("subloop_reserved_initialize_matrix_kitchen_sink_test_case_class", "SUBLOOP-RESERVED-INITIALIZE-MATRIX-KITCHEN-SINK-TEST-CASE-CLASS", 1, 0, false);
        declareFunction("subloop_reserved_initialize_matrix_kitchen_sink_test_case_instance", "SUBLOOP-RESERVED-INITIALIZE-MATRIX-KITCHEN-SINK-TEST-CASE-INSTANCE", 1, 0, false);
        declareFunction("matrix_kitchen_sink_test_case_p", "MATRIX-KITCHEN-SINK-TEST-CASE-P", 1, 0, false);
        return NIL;
    }

    public static SubLObject declare_matrix_utilities_file() {
        if (SubLFiles.USE_V1) {
            declareFunction("matrix_of_integer_or_fraction_p", "MATRIX-OF-INTEGER-OR-FRACTION-P", 1, 0, false);
            declareFunction("matrix_p", "MATRIX-P", 1, 0, false);
            declareFunction("triangular_matrix_of_integer_or_fraction_p", "TRIANGULAR-MATRIX-OF-INTEGER-OR-FRACTION-P", 1, 0, false);
            declareFunction("new_matrix", "NEW-MATRIX", 1, 0, false);
            declareFunction("print_matrix", "PRINT-MATRIX", 1, 1, false);
            declareFunction("copy_matrix", "COPY-MATRIX", 1, 0, false);
            declareFunction("matrix_row_count", "MATRIX-ROW-COUNT", 1, 0, false);
            declareFunction("matrix_column_count", "MATRIX-COLUMN-COUNT", 1, 0, false);
            declareFunction("matrix_ij", "MATRIX-IJ", 3, 0, false);
            declareFunction("swap_rows", "SWAP-ROWS", 3, 0, false);
            declareFunction("nswap_rows", "NSWAP-ROWS", 3, 0, false);
            declareFunction("swap_rows_internal", "SWAP-ROWS-INTERNAL", 4, 0, false);
            declareFunction("solve_triangular_matrix", "SOLVE-TRIANGULAR-MATRIX", 1, 0, false);
            declareFunction("remove_allzero_rows", "REMOVE-ALLZERO-ROWS", 1, 0, false);
            declareFunction("allzero_row_p", "ALLZERO-ROW-P", 1, 0, false);
            declareFunction("remove_extraneous_zeroes", "REMOVE-EXTRANEOUS-ZEROES", 1, 0, false);
            declareFunction("solve_row", "SOLVE-ROW", 2, 0, false);
            declareFunction("gaussian_elimination", "GAUSSIAN-ELIMINATION", 1, 0, false);
        }
        if (SubLFiles.USE_V2) {
            declareFunction("subloop_reserved_initialize_matrix_kitchen_sink_test_case_class", "SUBLOOP-RESERVED-INITIALIZE-MATRIX-KITCHEN-SINK-TEST-CASE-CLASS", 1, 0, false);
            declareFunction("subloop_reserved_initialize_matrix_kitchen_sink_test_case_instance", "SUBLOOP-RESERVED-INITIALIZE-MATRIX-KITCHEN-SINK-TEST-CASE-INSTANCE", 1, 0, false);
            declareFunction("matrix_kitchen_sink_test_case_p", "MATRIX-KITCHEN-SINK-TEST-CASE-P", 1, 0, false);
        }
        return NIL;
    }

    public static SubLObject declare_matrix_utilities_file_Previous() {
        declareFunction("matrix_of_integer_or_fraction_p", "MATRIX-OF-INTEGER-OR-FRACTION-P", 1, 0, false);
        declareFunction("matrix_p", "MATRIX-P", 1, 0, false);
        declareFunction("triangular_matrix_of_integer_or_fraction_p", "TRIANGULAR-MATRIX-OF-INTEGER-OR-FRACTION-P", 1, 0, false);
        declareFunction("new_matrix", "NEW-MATRIX", 1, 0, false);
        declareFunction("print_matrix", "PRINT-MATRIX", 1, 1, false);
        declareFunction("copy_matrix", "COPY-MATRIX", 1, 0, false);
        declareFunction("matrix_row_count", "MATRIX-ROW-COUNT", 1, 0, false);
        declareFunction("matrix_column_count", "MATRIX-COLUMN-COUNT", 1, 0, false);
        declareFunction("matrix_ij", "MATRIX-IJ", 3, 0, false);
        declareFunction("swap_rows", "SWAP-ROWS", 3, 0, false);
        declareFunction("nswap_rows", "NSWAP-ROWS", 3, 0, false);
        declareFunction("swap_rows_internal", "SWAP-ROWS-INTERNAL", 4, 0, false);
        declareFunction("solve_triangular_matrix", "SOLVE-TRIANGULAR-MATRIX", 1, 0, false);
        declareFunction("remove_allzero_rows", "REMOVE-ALLZERO-ROWS", 1, 0, false);
        declareFunction("allzero_row_p", "ALLZERO-ROW-P", 1, 0, false);
        declareFunction("remove_extraneous_zeroes", "REMOVE-EXTRANEOUS-ZEROES", 1, 0, false);
        declareFunction("solve_row", "SOLVE-ROW", 2, 0, false);
        declareFunction("gaussian_elimination", "GAUSSIAN-ELIMINATION", 1, 0, false);
        return NIL;
    }

    public static SubLObject init_matrix_utilities_file() {
        return NIL;
    }

    public static final SubLObject setup_matrix_utilities_file_alt() {
        sunit_macros.$current_module_sunit_tests$.setDynamicValue(cons(MATRIX_KITCHEN_SINK_TEST_CASE, sunit_macros.$current_module_sunit_tests$.getDynamicValue()));
        sunit_macros.define_test_case_preamble(MATRIX_KITCHEN_SINK_TEST_CASE);
        classes.subloop_new_class(MATRIX_KITCHEN_SINK_TEST_CASE, TEST_CASE, NIL, NIL, $list_alt13);
        classes.class_set_implements_slot_listeners(MATRIX_KITCHEN_SINK_TEST_CASE, NIL);
        classes.subloop_note_class_initialization_function(MATRIX_KITCHEN_SINK_TEST_CASE, SUBLOOP_RESERVED_INITIALIZE_MATRIX_KITCHEN_SINK_TEST_CASE_CLASS);
        classes.subloop_note_instance_initialization_function(MATRIX_KITCHEN_SINK_TEST_CASE, $sym27$SUBLOOP_RESERVED_INITIALIZE_MATRIX_KITCHEN_SINK_TEST_CASE_INSTANC);
        com.cyc.cycjava.cycl.matrix_utilities.subloop_reserved_initialize_matrix_kitchen_sink_test_case_class(MATRIX_KITCHEN_SINK_TEST_CASE);
        sunit_macros.define_test_case_postamble(MATRIX_KITCHEN_SINK_TEST_CASE, $str_alt28$matrix_utilities, $$$cycl, NIL);
        sunit_macros.def_test_method_register(MATRIX_KITCHEN_SINK_TEST_CASE, MATRIX_PREDICATES_TEST);
        sunit_macros.def_test_method_register(MATRIX_KITCHEN_SINK_TEST_CASE, MATRIX_COUNTS_TEST);
        sunit_macros.def_test_method_register(MATRIX_KITCHEN_SINK_TEST_CASE, MATRIX_IJ_TEST);
        sunit_macros.def_test_method_register(MATRIX_KITCHEN_SINK_TEST_CASE, SWAP_ROWS_TEST);
        sunit_macros.def_test_method_register(MATRIX_KITCHEN_SINK_TEST_CASE, SOLVE_TRIANGULAR_MATRIX_TEST);
        sunit_macros.def_test_method_register(MATRIX_KITCHEN_SINK_TEST_CASE, GAUSSIAN_ELIMINATION_TEST);
        return NIL;
    }

    public static SubLObject setup_matrix_utilities_file() {
        if (SubLFiles.USE_V1) {
        }
        if (SubLFiles.USE_V2) {
            sunit_macros.$current_module_sunit_tests$.setDynamicValue(cons(MATRIX_KITCHEN_SINK_TEST_CASE, sunit_macros.$current_module_sunit_tests$.getDynamicValue()));
            sunit_macros.define_test_case_preamble(MATRIX_KITCHEN_SINK_TEST_CASE);
            classes.subloop_new_class(MATRIX_KITCHEN_SINK_TEST_CASE, TEST_CASE, NIL, NIL, $list_alt13);
            classes.class_set_implements_slot_listeners(MATRIX_KITCHEN_SINK_TEST_CASE, NIL);
            classes.subloop_note_class_initialization_function(MATRIX_KITCHEN_SINK_TEST_CASE, SUBLOOP_RESERVED_INITIALIZE_MATRIX_KITCHEN_SINK_TEST_CASE_CLASS);
            classes.subloop_note_instance_initialization_function(MATRIX_KITCHEN_SINK_TEST_CASE, $sym27$SUBLOOP_RESERVED_INITIALIZE_MATRIX_KITCHEN_SINK_TEST_CASE_INSTANC);
            com.cyc.cycjava.cycl.matrix_utilities.subloop_reserved_initialize_matrix_kitchen_sink_test_case_class(MATRIX_KITCHEN_SINK_TEST_CASE);
            sunit_macros.define_test_case_postamble(MATRIX_KITCHEN_SINK_TEST_CASE, $str_alt28$matrix_utilities, $$$cycl, NIL);
            sunit_macros.def_test_method_register(MATRIX_KITCHEN_SINK_TEST_CASE, MATRIX_PREDICATES_TEST);
            sunit_macros.def_test_method_register(MATRIX_KITCHEN_SINK_TEST_CASE, MATRIX_COUNTS_TEST);
            sunit_macros.def_test_method_register(MATRIX_KITCHEN_SINK_TEST_CASE, MATRIX_IJ_TEST);
            sunit_macros.def_test_method_register(MATRIX_KITCHEN_SINK_TEST_CASE, SWAP_ROWS_TEST);
            sunit_macros.def_test_method_register(MATRIX_KITCHEN_SINK_TEST_CASE, SOLVE_TRIANGULAR_MATRIX_TEST);
            sunit_macros.def_test_method_register(MATRIX_KITCHEN_SINK_TEST_CASE, GAUSSIAN_ELIMINATION_TEST);
        }
        return NIL;
    }

    public static SubLObject setup_matrix_utilities_file_Previous() {
        return NIL;
    }

    @Override
    public void declareFunctions() {
        declare_matrix_utilities_file();
    }

    @Override
    public void initializeVariables() {
        init_matrix_utilities_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_matrix_utilities_file();
    }

    static {
    }

    static private final SubLString $str_alt1$__ = makeString("~%");

    static private final SubLString $str_alt2$__ = makeString("| ");

    static private final SubLString $str_alt3$___ = makeString("   ");

    static private final SubLString $str_alt4$___ = makeString("|~%");

    static private final SubLString $str_alt6$Row_index__A_is_out_of_bounds = makeString("Row-index ~A is out of bounds");

    static private final SubLString $str_alt7$Column_index__A_is_out_of_bounds = makeString("Column-index ~A is out of bounds");

    static private final SubLString $str_alt8$In_method_swap_rows__index__A_out = makeString("In method swap-rows: index ~A out of bounds");

    private static final SubLSymbol MATRIX_KITCHEN_SINK_TEST_CASE = makeSymbol("MATRIX-KITCHEN-SINK-TEST-CASE");

    static private final SubLList $list_alt13 = list(list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SETUP"), NIL, makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("CLEANUP"), NIL, makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("MATRIX-PREDICATES-TEST"), NIL, makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("MATRIX-COUNTS-TEST"), NIL, makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("MATRIX-IJ-TEST"), NIL, makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SWAP-ROWS-TEST"), NIL, makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SOLVE-TRIANGULAR-MATRIX-TEST"), NIL, makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GAUSSIAN-ELIMINATION-TEST"), NIL, makeKeyword("PROTECTED")));

    private static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_MATRIX_KITCHEN_SINK_TEST_CASE_CLASS = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-MATRIX-KITCHEN-SINK-TEST-CASE-CLASS");

    static private final SubLSymbol $sym27$SUBLOOP_RESERVED_INITIALIZE_MATRIX_KITCHEN_SINK_TEST_CASE_INSTANC = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-MATRIX-KITCHEN-SINK-TEST-CASE-INSTANCE");

    static private final SubLString $str_alt28$matrix_utilities = makeString("matrix-utilities");

    static private final SubLString $$$cycl = makeString("cycl");

    private static final SubLSymbol MATRIX_PREDICATES_TEST = makeSymbol("MATRIX-PREDICATES-TEST");

    private static final SubLSymbol MATRIX_COUNTS_TEST = makeSymbol("MATRIX-COUNTS-TEST");

    private static final SubLSymbol MATRIX_IJ_TEST = makeSymbol("MATRIX-IJ-TEST");

    private static final SubLSymbol SWAP_ROWS_TEST = makeSymbol("SWAP-ROWS-TEST");

    private static final SubLSymbol SOLVE_TRIANGULAR_MATRIX_TEST = makeSymbol("SOLVE-TRIANGULAR-MATRIX-TEST");

    private static final SubLSymbol GAUSSIAN_ELIMINATION_TEST = makeSymbol("GAUSSIAN-ELIMINATION-TEST");
}

/**
 * Total time: 86 ms
 */
