package com.cyc.cycjava.cycl;


import com.cyc.cycjava.cycl.matrix_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.StreamsLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

import static com.cyc.cycjava.cycl.matrix_utilities.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.NIL;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.ONE_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.T;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.UNPROVIDED;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.ZERO_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.*;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high.*;
import static com.cyc.tool.subl.util.SubLFiles.*;
import static com.cyc.tool.subl.util.SubLTranslatedFile.*;


public final class matrix_utilities extends SubLTranslatedFile {
    public static final SubLFile me = new matrix_utilities();

    public static final String myName = "com.cyc.cycjava.cycl.matrix_utilities";

    public static final String myFingerPrint = "f3cb86c084b70ca6be5ca0252a85902baac50a0c30b2b24a22403d6f1da1465d";

    // Internal Constants
    public static final SubLSymbol MATRIX_P = makeSymbol("MATRIX-P");

    public static final SubLString $str1$__ = makeString("~%");

    public static final SubLString $str2$__ = makeString("| ");

    public static final SubLString $$$___ = makeString("   ");

    public static final SubLString $str4$___ = makeString("|~%");



    public static final SubLString $str6$Row_index__A_is_out_of_bounds = makeString("Row-index ~A is out of bounds");

    public static final SubLString $str7$Column_index__A_is_out_of_bounds = makeString("Column-index ~A is out of bounds");

    public static final SubLString $str8$In_method_swap_rows__index__A_out = makeString("In method swap-rows: index ~A out of bounds");

    public static final SubLSymbol MATRIX_OF_INTEGER_OR_FRACTION_P = makeSymbol("MATRIX-OF-INTEGER-OR-FRACTION-P");

    public static final SubLSymbol TRIANGULAR_MATRIX_OF_INTEGER_OR_FRACTION_P = makeSymbol("TRIANGULAR-MATRIX-OF-INTEGER-OR-FRACTION-P");

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

    public static SubLObject matrix_p(final SubLObject v_object) {
        return matrix_of_integer_or_fraction_p(v_object);
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

    public static SubLObject new_matrix(final SubLObject list_of_lists) {
        assert NIL != matrix_p(list_of_lists) : "matrix_utilities.matrix_p(list_of_lists) " + "CommonSymbols.NIL != matrix_utilities.matrix_p(list_of_lists) " + list_of_lists;
        return list_of_lists;
    }

    public static SubLObject print_matrix(final SubLObject matrix, SubLObject stream) {
        if (stream == UNPROVIDED) {
            stream = StreamsLow.$standard_output$.getDynamicValue();
        }
        assert NIL != matrix_p(matrix) : "matrix_utilities.matrix_p(matrix) " + "CommonSymbols.NIL != matrix_utilities.matrix_p(matrix) " + matrix;
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

    public static SubLObject copy_matrix(final SubLObject matrix) {
        assert NIL != matrix_p(matrix) : "matrix_utilities.matrix_p(matrix) " + "CommonSymbols.NIL != matrix_utilities.matrix_p(matrix) " + matrix;
        return copy_tree(matrix);
    }

    public static SubLObject matrix_row_count(final SubLObject matrix) {
        assert NIL != matrix_p(matrix) : "matrix_utilities.matrix_p(matrix) " + "CommonSymbols.NIL != matrix_utilities.matrix_p(matrix) " + matrix;
        return length(matrix);
    }

    public static SubLObject matrix_column_count(final SubLObject matrix) {
        assert NIL != matrix_p(matrix) : "matrix_utilities.matrix_p(matrix) " + "CommonSymbols.NIL != matrix_utilities.matrix_p(matrix) " + matrix;
        return length(matrix.first());
    }

    public static SubLObject matrix_ij(final SubLObject matrix, final SubLObject i, final SubLObject j) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != matrix_p(matrix) : "matrix_utilities.matrix_p(matrix) " + "CommonSymbols.NIL != matrix_utilities.matrix_p(matrix) " + matrix;
        assert NIL != subl_promotions.non_negative_integer_p(i) : "subl_promotions.non_negative_integer_p(i) " + "CommonSymbols.NIL != subl_promotions.non_negative_integer_p(i) " + i;
        assert NIL != subl_promotions.non_negative_integer_p(j) : "subl_promotions.non_negative_integer_p(j) " + "CommonSymbols.NIL != subl_promotions.non_negative_integer_p(j) " + j;
        if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (!i.numL(matrix_row_count(matrix)))) {
            Errors.error($str6$Row_index__A_is_out_of_bounds, i);
        }
        if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (!j.numL(matrix_column_count(matrix)))) {
            Errors.error($str7$Column_index__A_is_out_of_bounds, j);
        }
        return nth(j, nth(i, matrix));
    }

    public static SubLObject swap_rows(final SubLObject matrix, final SubLObject row1, final SubLObject row2) {
        return swap_rows_internal(matrix, row1, row2, NIL);
    }

    public static SubLObject nswap_rows(final SubLObject matrix, final SubLObject row1, final SubLObject row2) {
        return swap_rows_internal(matrix, row1, row2, T);
    }

    public static SubLObject swap_rows_internal(final SubLObject matrix, final SubLObject row1, final SubLObject row2, final SubLObject destructiveP) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != matrix_p(matrix) : "matrix_utilities.matrix_p(matrix) " + "CommonSymbols.NIL != matrix_utilities.matrix_p(matrix) " + matrix;
        assert NIL != subl_promotions.non_negative_integer_p(row1) : "subl_promotions.non_negative_integer_p(row1) " + "CommonSymbols.NIL != subl_promotions.non_negative_integer_p(row1) " + row1;
        assert NIL != subl_promotions.non_negative_integer_p(row2) : "subl_promotions.non_negative_integer_p(row2) " + "CommonSymbols.NIL != subl_promotions.non_negative_integer_p(row2) " + row2;
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

    public static SubLObject solve_triangular_matrix(final SubLObject matrix) {
        assert NIL != matrix_of_integer_or_fraction_p(matrix) : "matrix_utilities.matrix_of_integer_or_fraction_p(matrix) " + "CommonSymbols.NIL != matrix_utilities.matrix_of_integer_or_fraction_p(matrix) " + matrix;
        final SubLObject clean_matrix = remove_allzero_rows(matrix);
        assert NIL != triangular_matrix_of_integer_or_fraction_p(clean_matrix) : "matrix_utilities.triangular_matrix_of_integer_or_fraction_p(clean_matrix) " + "CommonSymbols.NIL != matrix_utilities.triangular_matrix_of_integer_or_fraction_p(clean_matrix) " + clean_matrix;
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

    public static SubLObject remove_extraneous_zeroes(SubLObject row) {
        while (NIL != fraction_utilities.fractionE(ZERO_INTEGER, row.first())) {
            row = row.rest();
        } 
        return row;
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

    public static SubLObject gaussian_elimination(final SubLObject matrix) {
        assert NIL != matrix_of_integer_or_fraction_p(matrix) : "matrix_utilities.matrix_of_integer_or_fraction_p(matrix) " + "CommonSymbols.NIL != matrix_utilities.matrix_of_integer_or_fraction_p(matrix) " + matrix;
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

    public static SubLObject declare_matrix_utilities_file() {
        declareFunction(me, "matrix_of_integer_or_fraction_p", "MATRIX-OF-INTEGER-OR-FRACTION-P", 1, 0, false);
        declareFunction(me, "matrix_p", "MATRIX-P", 1, 0, false);
        declareFunction(me, "triangular_matrix_of_integer_or_fraction_p", "TRIANGULAR-MATRIX-OF-INTEGER-OR-FRACTION-P", 1, 0, false);
        declareFunction(me, "new_matrix", "NEW-MATRIX", 1, 0, false);
        declareFunction(me, "print_matrix", "PRINT-MATRIX", 1, 1, false);
        declareFunction(me, "copy_matrix", "COPY-MATRIX", 1, 0, false);
        declareFunction(me, "matrix_row_count", "MATRIX-ROW-COUNT", 1, 0, false);
        declareFunction(me, "matrix_column_count", "MATRIX-COLUMN-COUNT", 1, 0, false);
        declareFunction(me, "matrix_ij", "MATRIX-IJ", 3, 0, false);
        declareFunction(me, "swap_rows", "SWAP-ROWS", 3, 0, false);
        declareFunction(me, "nswap_rows", "NSWAP-ROWS", 3, 0, false);
        declareFunction(me, "swap_rows_internal", "SWAP-ROWS-INTERNAL", 4, 0, false);
        declareFunction(me, "solve_triangular_matrix", "SOLVE-TRIANGULAR-MATRIX", 1, 0, false);
        declareFunction(me, "remove_allzero_rows", "REMOVE-ALLZERO-ROWS", 1, 0, false);
        declareFunction(me, "allzero_row_p", "ALLZERO-ROW-P", 1, 0, false);
        declareFunction(me, "remove_extraneous_zeroes", "REMOVE-EXTRANEOUS-ZEROES", 1, 0, false);
        declareFunction(me, "solve_row", "SOLVE-ROW", 2, 0, false);
        declareFunction(me, "gaussian_elimination", "GAUSSIAN-ELIMINATION", 1, 0, false);
        return NIL;
    }

    public static SubLObject init_matrix_utilities_file() {
        return NIL;
    }

    public static SubLObject setup_matrix_utilities_file() {
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
}

/**
 * Total time: 86 ms
 */
