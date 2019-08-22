package com.cyc.cycjava.cycl;


import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality.identity;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions.funcall;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.nreverse;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.symbol_function;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.values;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.*;
import static com.cyc.tool.subl.util.SubLFiles.*;

import java.util.Iterator;
import java.util.Map;

import org.armedbear.lisp.Lisp;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLSpecialOperatorDeclarations;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDecl;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDeclNative;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.UnaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLStructNative;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLFloat;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.random;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.visitation;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile; 
 public final class sparse_matrix extends SubLTranslatedFile {
    public static final SubLFile me = new sparse_matrix();

    public static final String myName = "com.cyc.cycjava.cycl.sparse_matrix";

    public static final String myFingerPrint = "22ebe476cae6a5880917e009aef71c18c3b1dffd3418601ee2c16f09b0eeaa08";

    // defconstant
    public static final SubLSymbol $dtp_sparse_matrix$ = makeSymbol("*DTP-SPARSE-MATRIX*");

    // deflexical
    public static final SubLSymbol $default_smatrix_epsilon$ = makeSymbol("*DEFAULT-SMATRIX-EPSILON*");

    // Internal Constants
    public static final SubLSymbol SPARSE_MATRIX = makeSymbol("SPARSE-MATRIX");

    public static final SubLSymbol SPARSE_MATRIX_P = makeSymbol("SPARSE-MATRIX-P");

    public static final SubLList $list2 = list(makeSymbol("ROWS"), makeSymbol("COLUMNS"));

    public static final SubLList $list3 = list(makeKeyword("ROWS"), makeKeyword("COLUMNS"));

    public static final SubLList $list4 = list(makeSymbol("SMATRIX-ROWS"), makeSymbol("SMATRIX-COLUMNS"));

    public static final SubLList $list5 = list(makeSymbol("_CSETF-SMATRIX-ROWS"), makeSymbol("_CSETF-SMATRIX-COLUMNS"));

    public static final SubLSymbol SMATRIX_PRINT = makeSymbol("SMATRIX-PRINT");

    public static final SubLSymbol SPARSE_MATRIX_PRINT_FUNCTION_TRAMPOLINE = makeSymbol("SPARSE-MATRIX-PRINT-FUNCTION-TRAMPOLINE");

    private static final SubLList $list8 = list(makeSymbol("OPTIMIZE-FUNCALL"), makeSymbol("SPARSE-MATRIX-P"));

    private static final SubLSymbol SMATRIX_ROWS = makeSymbol("SMATRIX-ROWS");

    private static final SubLSymbol _CSETF_SMATRIX_ROWS = makeSymbol("_CSETF-SMATRIX-ROWS");

    private static final SubLSymbol SMATRIX_COLUMNS = makeSymbol("SMATRIX-COLUMNS");

    private static final SubLSymbol _CSETF_SMATRIX_COLUMNS = makeSymbol("_CSETF-SMATRIX-COLUMNS");





    private static final SubLString $str15$Invalid_slot__S_for_construction_ = makeString("Invalid slot ~S for construction function");



    private static final SubLSymbol MAKE_SPARSE_MATRIX = makeSymbol("MAKE-SPARSE-MATRIX");





    private static final SubLSymbol VISIT_DEFSTRUCT_OBJECT_SPARSE_MATRIX_METHOD = makeSymbol("VISIT-DEFSTRUCT-OBJECT-SPARSE-MATRIX-METHOD");







    private static final SubLString $str24$__SPARSE_MATRIX_ = makeString("#<SPARSE-MATRIX ");

    private static final SubLString $str25$_ = makeString("|");

    private static final SubLString $str26$_ = makeString(">");

    private static final SubLSymbol VALID_MATRIX_ROW_P = makeSymbol("VALID-MATRIX-ROW-P");

    private static final SubLSymbol SPARSE_VECTOR_P = makeSymbol("SPARSE-VECTOR-P");

    private static final SubLString $str29$non_equal_matrix_and_vector_test_ = makeString("non-equal matrix and vector test functions");

    private static final SubLSymbol VALID_MATRIX_COLUMN_P = makeSymbol("VALID-MATRIX-COLUMN-P");



    private static final SubLFloat $float$0_01 = makeDouble(0.01);





    private static final SubLList $list35 = list(list(makeSymbol("ROW"), makeSymbol("VALUE"), makeSymbol("MATRIX")), makeSymbol("&BODY"), makeSymbol("BODY"));



    private static final SubLFloat $float$3_4028232e38 = makeDouble(3.4028232E38);

    private static final SubLInteger $int$50 = makeInteger(50);

    public static SubLObject sparse_matrix_print_function_trampoline(final SubLObject v_object, final SubLObject stream) {
        smatrix_print(v_object, stream, ZERO_INTEGER);
        return NIL;
    }

    public static SubLObject sparse_matrix_p(final SubLObject v_object) {
        return v_object.getJavaClass() ==$sparse_matrix_native.class ? T : NIL;
    }

    public static SubLObject smatrix_rows(final SubLObject v_object) {
        assert NIL != sparse_matrix_p(v_object) : "sparse_matrix.sparse_matrix_p error :" + v_object;
        return v_object.getField2();
    }

    public static SubLObject smatrix_columns(final SubLObject v_object) {
        assert NIL != sparse_matrix_p(v_object) : "sparse_matrix.sparse_matrix_p error :" + v_object;
        return v_object.getField3();
    }

    public static SubLObject _csetf_smatrix_rows(final SubLObject v_object, final SubLObject value) {
        assert NIL != sparse_matrix_p(v_object) : "sparse_matrix.sparse_matrix_p error :" + v_object;
        return v_object.setField2(value);
    }

    public static SubLObject _csetf_smatrix_columns(final SubLObject v_object, final SubLObject value) {
        assert NIL != sparse_matrix_p(v_object) : "sparse_matrix.sparse_matrix_p error :" + v_object;
        return v_object.setField3(value);
    }

    public static SubLObject make_sparse_matrix(SubLObject arglist) {
        if (arglist == UNPROVIDED) {
            arglist = NIL;
        }
        final SubLObject v_new = new $sparse_matrix_native();
        SubLObject next;
        SubLObject current_arg;
        SubLObject current_value;
        SubLObject pcase_var;
        for (next = NIL, next = arglist; NIL != next; next = cddr(next)) {
            current_arg = next.first();
            current_value = cadr(next);
            pcase_var = current_arg;
            if (pcase_var.eql($ROWS)) {
                _csetf_smatrix_rows(v_new, current_value);
            } else
                if (pcase_var.eql($COLUMNS)) {
                    _csetf_smatrix_columns(v_new, current_value);
                } else {
                    Errors.error($str15$Invalid_slot__S_for_construction_, current_arg);
                }

        }
        return v_new;
    }

    public static SubLObject visit_defstruct_sparse_matrix(final SubLObject obj, final SubLObject visitor_fn) {
        funcall(visitor_fn, obj, $BEGIN, MAKE_SPARSE_MATRIX, TWO_INTEGER);
        funcall(visitor_fn, obj, $SLOT, $ROWS, smatrix_rows(obj));
        funcall(visitor_fn, obj, $SLOT, $COLUMNS, smatrix_columns(obj));
        funcall(visitor_fn, obj, $END, MAKE_SPARSE_MATRIX, TWO_INTEGER);
        return obj;
    }

    public static SubLObject visit_defstruct_object_sparse_matrix_method(final SubLObject obj, final SubLObject visitor_fn) {
        return visit_defstruct_sparse_matrix(obj, visitor_fn);
    }

    public static SubLObject new_sparse_matrix(SubLObject testfn, SubLObject size) {
        if (testfn == UNPROVIDED) {
            testfn = EQL;
        }
        if (size == UNPROVIDED) {
            size = $int$100;
        }
        assert NIL != subl_promotions.positive_integer_p(size) : "subl_promotions.positive_integer_p(size) " + "CommonSymbols.NIL != subl_promotions.positive_integer_p(size) " + size;
        assert NIL != hash_table_utilities.valid_hash_test_p(testfn) : "hash_table_utilities.valid_hash_test_p(testfn) " + "CommonSymbols.NIL != hash_table_utilities.valid_hash_test_p(testfn) " + testfn;
        final SubLObject matrix = make_sparse_matrix(UNPROVIDED);
        _csetf_smatrix_rows(matrix, make_hash_table(size, testfn, UNPROVIDED));
        _csetf_smatrix_columns(matrix, make_hash_table(size, testfn, UNPROVIDED));
        return matrix;
    }

    public static SubLObject smatrix_test(final SubLObject matrix) {
        assert NIL != sparse_matrix_p(matrix) : "sparse_matrix.sparse_matrix_p(matrix) " + "CommonSymbols.NIL != sparse_matrix.sparse_matrix_p(matrix) " + matrix;
        return hash_table_test(smatrix_rows(matrix));
    }

    public static SubLObject smatrix_print(final SubLObject matrix, final SubLObject stream, final SubLObject depth) {
        write_string($str24$__SPARSE_MATRIX_, stream, UNPROVIDED, UNPROVIDED);
        terpri(stream);
        final SubLObject cdohash_table = smatrix_rows(matrix);
        SubLObject row = NIL;
        SubLObject vector = NIL;
        final Iterator cdohash_iterator = getEntrySetIterator(cdohash_table);
        try {
            while (iteratorHasNext(cdohash_iterator)) {
                final Map.Entry cdohash_entry = iteratorNextEntry(cdohash_iterator);
                row = getEntryKey(cdohash_entry);
                vector = getEntryValue(cdohash_entry);
                princ(row, stream);
                write_string($str25$_, stream, UNPROVIDED, UNPROVIDED);
                sparse_vector.svector_print(vector, stream, ZERO_INTEGER);
                terpri(stream);
            } 
        } finally {
            releaseEntrySetIterator(cdohash_iterator);
        }
        write_string($str26$_, stream, UNPROVIDED, UNPROVIDED);
        return matrix;
    }

    public static SubLObject zero_smatrix_p(final SubLObject matrix) {
        assert NIL != sparse_matrix_p(matrix) : "sparse_matrix.sparse_matrix_p(matrix) " + "CommonSymbols.NIL != sparse_matrix.sparse_matrix_p(matrix) " + matrix;
        return zerop(hash_table_count(smatrix_rows(matrix)));
    }

    public static SubLObject smatrix_copy(final SubLObject matrix) {
        assert NIL != sparse_matrix_p(matrix) : "sparse_matrix.sparse_matrix_p(matrix) " + "CommonSymbols.NIL != sparse_matrix.sparse_matrix_p(matrix) " + matrix;
        final SubLObject copy = new_sparse_matrix(UNPROVIDED, UNPROVIDED);
        final SubLObject cdohash_table = smatrix_rows(matrix);
        SubLObject row = NIL;
        SubLObject vector = NIL;
        final Iterator cdohash_iterator = getEntrySetIterator(cdohash_table);
        try {
            while (iteratorHasNext(cdohash_iterator)) {
                final Map.Entry cdohash_entry = iteratorNextEntry(cdohash_iterator);
                row = getEntryKey(cdohash_entry);
                vector = getEntryValue(cdohash_entry);
                smatrix_set_row(copy, row, sparse_vector.svector_copy(vector));
            } 
        } finally {
            releaseEntrySetIterator(cdohash_iterator);
        }
        return copy;
    }

    public static SubLObject smatrix_set_row(final SubLObject matrix, final SubLObject row, final SubLObject vector) {
        assert NIL != sparse_matrix_p(matrix) : "sparse_matrix.sparse_matrix_p(matrix) " + "CommonSymbols.NIL != sparse_matrix.sparse_matrix_p(matrix) " + matrix;
        assert NIL != valid_matrix_row_p(row) : "sparse_matrix.valid_matrix_row_p(row) " + "CommonSymbols.NIL != sparse_matrix.valid_matrix_row_p(row) " + row;
        assert NIL != sparse_vector.sparse_vector_p(vector) : "sparse_vector.sparse_vector_p(vector) " + "CommonSymbols.NIL != sparse_vector.sparse_vector_p(vector) " + vector;
        if (!smatrix_test(matrix).eql(sparse_vector.svector_test(vector))) {
            Errors.error($str29$non_equal_matrix_and_vector_test_);
        }
        if (NIL == sparse_vector.zero_svector_p(vector)) {
            sethash(row, smatrix_rows(matrix), vector);
            smatrix_clear_columns(matrix);
        }
        return matrix;
    }

    public static SubLObject smatrix_set(final SubLObject matrix, final SubLObject row, final SubLObject column, final SubLObject value) {
        assert NIL != sparse_matrix_p(matrix) : "sparse_matrix.sparse_matrix_p(matrix) " + "CommonSymbols.NIL != sparse_matrix.sparse_matrix_p(matrix) " + matrix;
        assert NIL != valid_matrix_row_p(row) : "sparse_matrix.valid_matrix_row_p(row) " + "CommonSymbols.NIL != sparse_matrix.valid_matrix_row_p(row) " + row;
        assert NIL != valid_matrix_column_p(column) : "sparse_matrix.valid_matrix_column_p(column) " + "CommonSymbols.NIL != sparse_matrix.valid_matrix_column_p(column) " + column;
        assert NIL != numberp(value) : "Types.numberp(value) " + "CommonSymbols.NIL != Types.numberp(value) " + value;
        SubLObject vector = gethash(row, smatrix_rows(matrix), UNPROVIDED);
        if (NIL == vector) {
            vector = sparse_vector.new_sparse_vector(smatrix_test(matrix), UNPROVIDED);
            sethash(row, smatrix_rows(matrix), vector);
        }
        return sparse_vector.svector_set(vector, column, value);
    }

    public static SubLObject smatrix_get(final SubLObject matrix, final SubLObject row, final SubLObject column) {
        assert NIL != sparse_matrix_p(matrix) : "sparse_matrix.sparse_matrix_p(matrix) " + "CommonSymbols.NIL != sparse_matrix.sparse_matrix_p(matrix) " + matrix;
        assert NIL != valid_matrix_row_p(row) : "sparse_matrix.valid_matrix_row_p(row) " + "CommonSymbols.NIL != sparse_matrix.valid_matrix_row_p(row) " + row;
        assert NIL != valid_matrix_column_p(column) : "sparse_matrix.valid_matrix_column_p(column) " + "CommonSymbols.NIL != sparse_matrix.valid_matrix_column_p(column) " + column;
        return sparse_vector.svector_get(gethash(row, smatrix_rows(matrix), UNPROVIDED), column);
    }

    public static SubLObject smatrix_add(final SubLObject matrix1, final SubLObject matrix2) {
        assert NIL != sparse_matrix_p(matrix1) : "sparse_matrix.sparse_matrix_p(matrix1) " + "CommonSymbols.NIL != sparse_matrix.sparse_matrix_p(matrix1) " + matrix1;
        assert NIL != sparse_matrix_p(matrix2) : "sparse_matrix.sparse_matrix_p(matrix2) " + "CommonSymbols.NIL != sparse_matrix.sparse_matrix_p(matrix2) " + matrix2;
        smatrix_clear_columns(matrix1);
        SubLObject vector2 = NIL;
        final SubLObject cdohash_table = smatrix_rows(matrix1);
        SubLObject row = NIL;
        SubLObject vector3 = NIL;
        final Iterator cdohash_iterator = getEntrySetIterator(cdohash_table);
        try {
            while (iteratorHasNext(cdohash_iterator)) {
                final Map.Entry cdohash_entry = iteratorNextEntry(cdohash_iterator);
                row = getEntryKey(cdohash_entry);
                vector3 = getEntryValue(cdohash_entry);
                vector2 = gethash(row, smatrix_rows(matrix2), UNPROVIDED);
                if (NIL != vector2) {
                    sparse_vector.svector_add(vector3, vector2);
                }
            } 
        } finally {
            releaseEntrySetIterator(cdohash_iterator);
        }
        return matrix1;
    }

    public static SubLObject smatrix_scalar_product(final SubLObject matrix, final SubLObject scalar) {
        assert NIL != sparse_matrix_p(matrix) : "sparse_matrix.sparse_matrix_p(matrix) " + "CommonSymbols.NIL != sparse_matrix.sparse_matrix_p(matrix) " + matrix;
        assert NIL != numberp(scalar) : "Types.numberp(scalar) " + "CommonSymbols.NIL != Types.numberp(scalar) " + scalar;
        smatrix_clear_columns(matrix);
        final SubLObject cdohash_table = smatrix_rows(matrix);
        SubLObject row = NIL;
        SubLObject vector = NIL;
        final Iterator cdohash_iterator = getEntrySetIterator(cdohash_table);
        try {
            while (iteratorHasNext(cdohash_iterator)) {
                final Map.Entry cdohash_entry = iteratorNextEntry(cdohash_iterator);
                row = getEntryKey(cdohash_entry);
                vector = getEntryValue(cdohash_entry);
                sparse_vector.svector_scale(vector, scalar);
            } 
        } finally {
            releaseEntrySetIterator(cdohash_iterator);
        }
        return matrix;
    }

    public static SubLObject smatrix_vector_product(final SubLObject matrix, final SubLObject vector) {
        assert NIL != sparse_matrix_p(matrix) : "sparse_matrix.sparse_matrix_p(matrix) " + "CommonSymbols.NIL != sparse_matrix.sparse_matrix_p(matrix) " + matrix;
        assert NIL != sparse_vector.sparse_vector_p(vector) : "sparse_vector.sparse_vector_p(vector) " + "CommonSymbols.NIL != sparse_vector.sparse_vector_p(vector) " + vector;
        final SubLObject product = sparse_vector.new_sparse_vector(smatrix_test(matrix), UNPROVIDED);
        final SubLObject cdohash_table = smatrix_rows(matrix);
        SubLObject row_name = NIL;
        SubLObject row = NIL;
        final Iterator cdohash_iterator = getEntrySetIterator(cdohash_table);
        try {
            while (iteratorHasNext(cdohash_iterator)) {
                final Map.Entry cdohash_entry = iteratorNextEntry(cdohash_iterator);
                row_name = getEntryKey(cdohash_entry);
                row = getEntryValue(cdohash_entry);
                sparse_vector.svector_set(product, row_name, sparse_vector.svector_scalar_product(row, vector));
            } 
        } finally {
            releaseEntrySetIterator(cdohash_iterator);
        }
        return product;
    }

    public static SubLObject smatrix_matrix_product(final SubLObject matrix1, final SubLObject matrix2) {
        assert NIL != sparse_matrix_p(matrix1) : "sparse_matrix.sparse_matrix_p(matrix1) " + "CommonSymbols.NIL != sparse_matrix.sparse_matrix_p(matrix1) " + matrix1;
        assert NIL != sparse_matrix_p(matrix2) : "sparse_matrix.sparse_matrix_p(matrix2) " + "CommonSymbols.NIL != sparse_matrix.sparse_matrix_p(matrix2) " + matrix2;
        final SubLObject matrix3 = new_sparse_matrix(UNPROVIDED, UNPROVIDED);
        smatrix_ensure_columns(matrix2);
        final SubLObject cdohash_table = smatrix_rows(matrix1);
        SubLObject row = NIL;
        SubLObject row_vector = NIL;
        final Iterator cdohash_iterator = getEntrySetIterator(cdohash_table);
        try {
            while (iteratorHasNext(cdohash_iterator)) {
                final Map.Entry cdohash_entry = iteratorNextEntry(cdohash_iterator);
                row = getEntryKey(cdohash_entry);
                row_vector = getEntryValue(cdohash_entry);
                final SubLObject new_row = sparse_vector.new_sparse_vector(smatrix_test(matrix1), UNPROVIDED);
                final SubLObject cdohash_table_$1 = smatrix_columns(matrix2);
                SubLObject column = NIL;
                SubLObject column_vector = NIL;
                final Iterator cdohash_iterator_$2 = getEntrySetIterator(cdohash_table_$1);
                try {
                    while (iteratorHasNext(cdohash_iterator_$2)) {
                        final Map.Entry cdohash_entry_$3 = iteratorNextEntry(cdohash_iterator_$2);
                        column = getEntryKey(cdohash_entry_$3);
                        column_vector = getEntryValue(cdohash_entry_$3);
                        sparse_vector.svector_set(new_row, column, sparse_vector.svector_scalar_product(row_vector, column_vector));
                    } 
                } finally {
                    releaseEntrySetIterator(cdohash_iterator_$2);
                }
                smatrix_set_row(matrix3, row, new_row);
            } 
        } finally {
            releaseEntrySetIterator(cdohash_iterator);
        }
        return matrix3;
    }

    public static SubLObject smatrix_transpose(final SubLObject matrix) {
        assert NIL != sparse_matrix_p(matrix) : "sparse_matrix.sparse_matrix_p(matrix) " + "CommonSymbols.NIL != sparse_matrix.sparse_matrix_p(matrix) " + matrix;
        smatrix_ensure_columns(matrix);
        SubLObject temp = NIL;
        temp = smatrix_rows(matrix);
        _csetf_smatrix_rows(matrix, smatrix_columns(matrix));
        _csetf_smatrix_columns(matrix, temp);
        return matrix;
    }

    public static SubLObject smatrix_inverse(final SubLObject matrix) {
        assert NIL != sparse_matrix_p(matrix) : "sparse_matrix.sparse_matrix_p(matrix) " + "CommonSymbols.NIL != sparse_matrix.sparse_matrix_p(matrix) " + matrix;
        return smatrix_scalar_product(matrix, MINUS_ONE_INTEGER);
    }

    public static SubLObject smatrix_sum_norm(final SubLObject matrix) {
        assert NIL != sparse_matrix_p(matrix) : "sparse_matrix.sparse_matrix_p(matrix) " + "CommonSymbols.NIL != sparse_matrix.sparse_matrix_p(matrix) " + matrix;
        smatrix_ensure_columns(matrix);
        SubLObject norm = ZERO_INTEGER;
        SubLObject vector_norm = NIL;
        final SubLObject cdohash_table = smatrix_columns(matrix);
        SubLObject column = NIL;
        SubLObject vector = NIL;
        final Iterator cdohash_iterator = getEntrySetIterator(cdohash_table);
        try {
            while (iteratorHasNext(cdohash_iterator)) {
                final Map.Entry cdohash_entry = iteratorNextEntry(cdohash_iterator);
                column = getEntryKey(cdohash_entry);
                vector = getEntryValue(cdohash_entry);
                vector_norm = sparse_vector.svector_sum_norm(vector);
                if (vector_norm.numG(norm)) {
                    norm = vector_norm;
                }
            } 
        } finally {
            releaseEntrySetIterator(cdohash_iterator);
        }
        return norm;
    }

    public static SubLObject smatrix_max_norm(final SubLObject matrix) {
        assert NIL != sparse_matrix_p(matrix) : "sparse_matrix.sparse_matrix_p(matrix) " + "CommonSymbols.NIL != sparse_matrix.sparse_matrix_p(matrix) " + matrix;
        SubLObject norm = ZERO_INTEGER;
        SubLObject vector_norm = NIL;
        final SubLObject cdohash_table = smatrix_rows(matrix);
        SubLObject row = NIL;
        SubLObject vector = NIL;
        final Iterator cdohash_iterator = getEntrySetIterator(cdohash_table);
        try {
            while (iteratorHasNext(cdohash_iterator)) {
                final Map.Entry cdohash_entry = iteratorNextEntry(cdohash_iterator);
                row = getEntryKey(cdohash_entry);
                vector = getEntryValue(cdohash_entry);
                vector_norm = sparse_vector.svector_max_norm(vector);
                if (vector_norm.numG(norm)) {
                    norm = vector_norm;
                }
            } 
        } finally {
            releaseEntrySetIterator(cdohash_iterator);
        }
        return norm;
    }

    public static SubLObject smatrix_eigenpairs(final SubLObject matrix, SubLObject n, SubLObject epsilon) {
        if (n == UNPROVIDED) {
            n = hash_table_count(smatrix_rows(matrix));
        }
        if (epsilon == UNPROVIDED) {
            epsilon = $default_smatrix_epsilon$.getGlobalValue();
        }
        assert NIL != sparse_matrix_p(matrix) : "sparse_matrix.sparse_matrix_p(matrix) " + "CommonSymbols.NIL != sparse_matrix.sparse_matrix_p(matrix) " + matrix;
        assert NIL != subl_promotions.non_negative_integer_p(n) : "subl_promotions.non_negative_integer_p(n) " + "CommonSymbols.NIL != subl_promotions.non_negative_integer_p(n) " + n;
        assert NIL != floatp(epsilon) : "Types.floatp(epsilon) " + "CommonSymbols.NIL != Types.floatp(epsilon) " + epsilon;
        SubLObject eigenpairs = NIL;
        SubLObject i = ONE_INTEGER;
        SubLObject eigenpair = NIL;
        while (!i.numG(n)) {
            eigenpair = smatrix_dominant_eigenpair(matrix, epsilon);
            if (NIL != sparse_vector.svector_normalize(eigenpair.first())) {
                eigenpairs = cons(eigenpair, eigenpairs);
                if (!i.numE(n)) {
                    smatrix_deflation(matrix, eigenpair.rest(), eigenpair.first());
                }
            } else {
                i = n;
            }
            i = add(i, ONE_INTEGER);
        } 
        return nreverse(eigenpairs);
    }

    public static SubLObject smatrix_svd(final SubLObject matrix) {
        assert NIL != sparse_matrix_p(matrix) : "sparse_matrix.sparse_matrix_p(matrix) " + "CommonSymbols.NIL != sparse_matrix.sparse_matrix_p(matrix) " + matrix;
        final SubLObject mtm = smatrix_matrix_product(smatrix_transpose(smatrix_copy(matrix)), matrix);
        final SubLObject u = new_sparse_matrix(smatrix_test(matrix), UNPROVIDED);
        final SubLObject uprime = new_sparse_matrix(smatrix_test(matrix), UNPROVIDED);
        final SubLObject d = new_sparse_matrix(smatrix_test(matrix), UNPROVIDED);
        SubLObject s = NIL;
        SubLObject i = ONE_INTEGER;
        SubLObject cdolist_list_var = smatrix_eigenpairs(mtm, UNPROVIDED, UNPROVIDED);
        SubLObject eigenpair = NIL;
        eigenpair = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            smatrix_set_row(u, i, eigenpair.first());
            s = sqrt(abs(eigenpair.rest()));
            smatrix_set_row(uprime, i, sparse_vector.svector_scale(smatrix_vector_product(matrix, eigenpair.first()), divide(ONE_INTEGER, s)));
            smatrix_set(d, i, i, s);
            i = add(i, ONE_INTEGER);
            cdolist_list_var = cdolist_list_var.rest();
            eigenpair = cdolist_list_var.first();
        } 
        smatrix_transpose(uprime);
        return values(uprime, d, u);
    }

    public static SubLObject do_smatrix(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list35);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject row = NIL;
        SubLObject value = NIL;
        SubLObject matrix = NIL;
        destructuring_bind_must_consp(current, datum, $list35);
        row = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list35);
        value = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list35);
        matrix = current.first();
        current = current.rest();
        if (NIL == current) {
            final SubLObject body;
            current = body = temp;
            return listS(CDOHASH, list(row, value, list(SMATRIX_ROWS, matrix)), append(body, NIL));
        }
        cdestructuring_bind_error(datum, $list35);
        return NIL;
    }

    public static SubLObject smatrix_dominant_eigenpair(final SubLObject matrix, SubLObject epsilon) {
        if (epsilon == UNPROVIDED) {
            epsilon = $default_smatrix_epsilon$.getGlobalValue();
        }
        assert NIL != sparse_matrix_p(matrix) : "sparse_matrix.sparse_matrix_p(matrix) " + "CommonSymbols.NIL != sparse_matrix.sparse_matrix_p(matrix) " + matrix;
        final SubLObject init_vector = sparse_vector.new_sparse_vector(smatrix_test(matrix), UNPROVIDED);
        SubLObject eigenvalue = ZERO_INTEGER;
        SubLObject eigenvector = sparse_vector.new_sparse_vector(smatrix_test(matrix), UNPROVIDED);
        final SubLObject max_iteration = add(hash_table_count(smatrix_rows(matrix)), $int$100);
        SubLObject cdolist_list_var = smatrix_nonzero_columns(matrix);
        SubLObject column = NIL;
        column = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            sparse_vector.svector_set(init_vector, column, number_utilities.f_1X(random.random(TEN_INTEGER)));
            cdolist_list_var = cdolist_list_var.rest();
            column = cdolist_list_var.first();
        } 
        SubLObject i;
        SubLObject old_vector;
        SubLObject new_vector;
        SubLObject old_growth;
        SubLObject new_growth;
        SubLObject growth_rate;
        for (i = NIL, old_vector = NIL, new_vector = NIL, old_growth = NIL, new_growth = NIL, growth_rate = NIL, i = ZERO_INTEGER, old_vector = init_vector, new_vector = smatrix_vector_product(matrix, old_vector), old_growth = ZERO_INTEGER, new_growth = raleigh_quotient(new_vector, old_vector), growth_rate = abs(subtract(new_growth, old_growth)); (!growth_rate.numL(epsilon)) && (!i.numG(max_iteration)); i = number_utilities.f_1X(i) , old_vector = new_vector , new_vector = smatrix_vector_product(matrix, old_vector) , old_growth = new_growth , new_growth = raleigh_quotient(new_vector, old_vector) , growth_rate = abs(subtract(new_growth, old_growth))) {
            eigenvalue = new_growth;
            eigenvector = new_vector;
        }
        return cons(eigenvector, eigenvalue);
    }

    public static SubLObject svector_star(final SubLObject vector1, final SubLObject vector2) {
        assert NIL != sparse_vector.sparse_vector_p(vector1) : "sparse_vector.sparse_vector_p(vector1) " + "CommonSymbols.NIL != sparse_vector.sparse_vector_p(vector1) " + vector1;
        assert NIL != sparse_vector.sparse_vector_p(vector2) : "sparse_vector.sparse_vector_p(vector2) " + "CommonSymbols.NIL != sparse_vector.sparse_vector_p(vector2) " + vector2;
        final SubLObject matrix = new_sparse_matrix(sparse_vector.svector_test(vector1), UNPROVIDED);
        final SubLObject cdohash_table = sparse_vector.svector_dimensions(vector1);
        SubLObject dim = NIL;
        SubLObject value = NIL;
        final Iterator cdohash_iterator = getEntrySetIterator(cdohash_table);
        try {
            while (iteratorHasNext(cdohash_iterator)) {
                final Map.Entry cdohash_entry = iteratorNextEntry(cdohash_iterator);
                dim = getEntryKey(cdohash_entry);
                value = getEntryValue(cdohash_entry);
                smatrix_set_row(matrix, dim, sparse_vector.svector_scale(sparse_vector.svector_copy(vector2), value));
            } 
        } finally {
            releaseEntrySetIterator(cdohash_iterator);
        }
        return matrix;
    }

    public static SubLObject smatrix_deflation(final SubLObject matrix, final SubLObject eigenvalue, final SubLObject eigenvector) {
        assert NIL != sparse_matrix_p(matrix) : "sparse_matrix.sparse_matrix_p(matrix) " + "CommonSymbols.NIL != sparse_matrix.sparse_matrix_p(matrix) " + matrix;
        assert NIL != numberp(eigenvalue) : "Types.numberp(eigenvalue) " + "CommonSymbols.NIL != Types.numberp(eigenvalue) " + eigenvalue;
        assert NIL != sparse_vector.sparse_vector_p(eigenvector) : "sparse_vector.sparse_vector_p(eigenvector) " + "CommonSymbols.NIL != sparse_vector.sparse_vector_p(eigenvector) " + eigenvector;
        return smatrix_add(matrix, smatrix_inverse(svector_star(sparse_vector.svector_scale(sparse_vector.svector_copy(eigenvector), eigenvalue), eigenvector)));
    }

    public static SubLObject sum_quotient(final SubLObject new_vector, final SubLObject old_vector) {
        return divide(sparse_vector.svector_max_norm(new_vector), sparse_vector.svector_max_norm(old_vector));
    }

    public static SubLObject raleigh_quotient(final SubLObject new_vector, final SubLObject old_vector) {
        final SubLObject nominator = sparse_vector.svector_scalar_product(old_vector, new_vector);
        final SubLObject denominator = sparse_vector.svector_scalar_product(old_vector, old_vector);
        if (nominator.numE(denominator)) {
            return ONE_INTEGER;
        }
        if (denominator.isZero()) {
            return $float$3_4028232e38;
        }
        return divide(nominator, denominator);
    }

    public static SubLObject smatrix_nonzero_columns(final SubLObject matrix) {
        smatrix_ensure_columns(matrix);
        SubLObject keys = NIL;
        final SubLObject cdohash_table = smatrix_columns(matrix);
        SubLObject column = NIL;
        SubLObject vector = NIL;
        final Iterator cdohash_iterator = getEntrySetIterator(cdohash_table);
        try {
            while (iteratorHasNext(cdohash_iterator)) {
                final Map.Entry cdohash_entry = iteratorNextEntry(cdohash_iterator);
                column = getEntryKey(cdohash_entry);
                vector = getEntryValue(cdohash_entry);
                keys = cons(column, keys);
            } 
        } finally {
            releaseEntrySetIterator(cdohash_iterator);
        }
        return keys;
    }

    public static SubLObject valid_matrix_row_p(final SubLObject v_object) {
        return v_object;
    }

    public static SubLObject valid_matrix_column_p(final SubLObject v_object) {
        return v_object;
    }

    public static SubLObject smatrix_clear_columns(final SubLObject matrix) {
        return clrhash(smatrix_columns(matrix));
    }

    public static SubLObject smatrix_compute_columns(final SubLObject matrix) {
        final SubLObject cdohash_table = smatrix_rows(matrix);
        SubLObject row = NIL;
        SubLObject vector = NIL;
        final Iterator cdohash_iterator = getEntrySetIterator(cdohash_table);
        try {
            while (iteratorHasNext(cdohash_iterator)) {
                final Map.Entry cdohash_entry = iteratorNextEntry(cdohash_iterator);
                row = getEntryKey(cdohash_entry);
                vector = getEntryValue(cdohash_entry);
                final SubLObject cdohash_table_$4 = sparse_vector.svector_dimensions(vector);
                SubLObject column = NIL;
                SubLObject value = NIL;
                final Iterator cdohash_iterator_$5 = getEntrySetIterator(cdohash_table_$4);
                try {
                    while (iteratorHasNext(cdohash_iterator_$5)) {
                        final Map.Entry cdohash_entry_$6 = iteratorNextEntry(cdohash_iterator_$5);
                        column = getEntryKey(cdohash_entry_$6);
                        value = getEntryValue(cdohash_entry_$6);
                        smatrix_get_column(matrix, column);
                    } 
                } finally {
                    releaseEntrySetIterator(cdohash_iterator_$5);
                }
            } 
        } finally {
            releaseEntrySetIterator(cdohash_iterator);
        }
        return matrix;
    }

    public static SubLObject smatrix_get_column(final SubLObject matrix, final SubLObject column) {
        assert NIL != sparse_matrix_p(matrix) : "sparse_matrix.sparse_matrix_p(matrix) " + "CommonSymbols.NIL != sparse_matrix.sparse_matrix_p(matrix) " + matrix;
        assert NIL != valid_matrix_column_p(column) : "sparse_matrix.valid_matrix_column_p(column) " + "CommonSymbols.NIL != sparse_matrix.valid_matrix_column_p(column) " + column;
        SubLObject vector = gethash(column, smatrix_columns(matrix), UNPROVIDED);
        SubLObject value = NIL;
        if (NIL == vector) {
            vector = sparse_vector.new_sparse_vector(smatrix_test(matrix), UNPROVIDED);
            final SubLObject cdohash_table = smatrix_rows(matrix);
            SubLObject row = NIL;
            SubLObject row_vector = NIL;
            final Iterator cdohash_iterator = getEntrySetIterator(cdohash_table);
            try {
                while (iteratorHasNext(cdohash_iterator)) {
                    final Map.Entry cdohash_entry = iteratorNextEntry(cdohash_iterator);
                    row = getEntryKey(cdohash_entry);
                    row_vector = getEntryValue(cdohash_entry);
                    value = sparse_vector.svector_get(row_vector, column);
                    if (!value.isZero()) {
                        sparse_vector.svector_set(vector, row, sparse_vector.svector_get(row_vector, column));
                    }
                } 
            } finally {
                releaseEntrySetIterator(cdohash_iterator);
            }
        }
        sethash(column, smatrix_columns(matrix), vector);
        return vector;
    }

    public static SubLObject smatrix_ensure_columns(final SubLObject matrix) {
        if (NIL == subl_promotions.positive_integer_p(hash_table_count(smatrix_columns(matrix)))) {
            _csetf_smatrix_columns(matrix, make_hash_table($int$50, smatrix_test(matrix), UNPROVIDED));
            smatrix_compute_columns(matrix);
        }
        return matrix;
    }

    public static SubLObject smatrix_reduce(final SubLObject matrix, final SubLObject keep) {
        smatrix_clear_columns(matrix);
        final SubLObject rows = smatrix_rows(matrix);
        SubLObject row = NIL;
        SubLObject vector = NIL;
        final Iterator cdohash_iterator = getEntrySetIterator(rows);
        try {
            while (iteratorHasNext(cdohash_iterator)) {
                final Map.Entry cdohash_entry = iteratorNextEntry(cdohash_iterator);
                row = getEntryKey(cdohash_entry);
                vector = getEntryValue(cdohash_entry);
                if (NIL == subl_promotions.memberP(row, keep, smatrix_test(matrix), UNPROVIDED)) {
                    remhash(row, rows);
                }
            } 
        } finally {
            releaseEntrySetIterator(cdohash_iterator);
        }
        return matrix;
    }

    public static SubLObject declare_sparse_matrix_file() {
        declareFunction(me, "sparse_matrix_print_function_trampoline", "SPARSE-MATRIX-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        declareFunction(me, "sparse_matrix_p", "SPARSE-MATRIX-P", 1, 0, false);
        new sparse_matrix.$sparse_matrix_p$UnaryFunction();
        declareFunction(me, "smatrix_rows", "SMATRIX-ROWS", 1, 0, false);
        declareFunction(me, "smatrix_columns", "SMATRIX-COLUMNS", 1, 0, false);
        declareFunction(me, "_csetf_smatrix_rows", "_CSETF-SMATRIX-ROWS", 2, 0, false);
        declareFunction(me, "_csetf_smatrix_columns", "_CSETF-SMATRIX-COLUMNS", 2, 0, false);
        declareFunction(me, "make_sparse_matrix", "MAKE-SPARSE-MATRIX", 0, 1, false);
        declareFunction(me, "visit_defstruct_sparse_matrix", "VISIT-DEFSTRUCT-SPARSE-MATRIX", 2, 0, false);
        declareFunction(me, "visit_defstruct_object_sparse_matrix_method", "VISIT-DEFSTRUCT-OBJECT-SPARSE-MATRIX-METHOD", 2, 0, false);
        declareFunction(me, "new_sparse_matrix", "NEW-SPARSE-MATRIX", 0, 2, false);
        declareFunction(me, "smatrix_test", "SMATRIX-TEST", 1, 0, false);
        declareFunction(me, "smatrix_print", "SMATRIX-PRINT", 3, 0, false);
        declareFunction(me, "zero_smatrix_p", "ZERO-SMATRIX-P", 1, 0, false);
        declareFunction(me, "smatrix_copy", "SMATRIX-COPY", 1, 0, false);
        declareFunction(me, "smatrix_set_row", "SMATRIX-SET-ROW", 3, 0, false);
        declareFunction(me, "smatrix_set", "SMATRIX-SET", 4, 0, false);
        declareFunction(me, "smatrix_get", "SMATRIX-GET", 3, 0, false);
        declareFunction(me, "smatrix_add", "SMATRIX-ADD", 2, 0, false);
        declareFunction(me, "smatrix_scalar_product", "SMATRIX-SCALAR-PRODUCT", 2, 0, false);
        declareFunction(me, "smatrix_vector_product", "SMATRIX-VECTOR-PRODUCT", 2, 0, false);
        declareFunction(me, "smatrix_matrix_product", "SMATRIX-MATRIX-PRODUCT", 2, 0, false);
        declareFunction(me, "smatrix_transpose", "SMATRIX-TRANSPOSE", 1, 0, false);
        declareFunction(me, "smatrix_inverse", "SMATRIX-INVERSE", 1, 0, false);
        declareFunction(me, "smatrix_sum_norm", "SMATRIX-SUM-NORM", 1, 0, false);
        declareFunction(me, "smatrix_max_norm", "SMATRIX-MAX-NORM", 1, 0, false);
        declareFunction(me, "smatrix_eigenpairs", "SMATRIX-EIGENPAIRS", 1, 2, false);
        declareFunction(me, "smatrix_svd", "SMATRIX-SVD", 1, 0, false);
        declareMacro(me, "do_smatrix", "DO-SMATRIX");
        declareFunction(me, "smatrix_dominant_eigenpair", "SMATRIX-DOMINANT-EIGENPAIR", 1, 1, false);
        declareFunction(me, "svector_star", "SVECTOR-STAR", 2, 0, false);
        declareFunction(me, "smatrix_deflation", "SMATRIX-DEFLATION", 3, 0, false);
        declareFunction(me, "sum_quotient", "SUM-QUOTIENT", 2, 0, false);
        declareFunction(me, "raleigh_quotient", "RALEIGH-QUOTIENT", 2, 0, false);
        declareFunction(me, "smatrix_nonzero_columns", "SMATRIX-NONZERO-COLUMNS", 1, 0, false);
        declareFunction(me, "valid_matrix_row_p", "VALID-MATRIX-ROW-P", 1, 0, false);
        declareFunction(me, "valid_matrix_column_p", "VALID-MATRIX-COLUMN-P", 1, 0, false);
        declareFunction(me, "smatrix_clear_columns", "SMATRIX-CLEAR-COLUMNS", 1, 0, false);
        declareFunction(me, "smatrix_compute_columns", "SMATRIX-COMPUTE-COLUMNS", 1, 0, false);
        declareFunction(me, "smatrix_get_column", "SMATRIX-GET-COLUMN", 2, 0, false);
        declareFunction(me, "smatrix_ensure_columns", "SMATRIX-ENSURE-COLUMNS", 1, 0, false);
        declareFunction(me, "smatrix_reduce", "SMATRIX-REDUCE", 2, 0, false);
        return NIL;
    }

    public static SubLObject init_sparse_matrix_file() {
        defconstant("*DTP-SPARSE-MATRIX*", SPARSE_MATRIX);
        deflexical("*DEFAULT-SMATRIX-EPSILON*", $float$0_01);
        return NIL;
    }

    public static SubLObject setup_sparse_matrix_file() {
        register_method($print_object_method_table$.getGlobalValue(), $dtp_sparse_matrix$.getGlobalValue(), symbol_function(SPARSE_MATRIX_PRINT_FUNCTION_TRAMPOLINE));
        SubLSpecialOperatorDeclarations.proclaim($list8);
        def_csetf(SMATRIX_ROWS, _CSETF_SMATRIX_ROWS);
        def_csetf(SMATRIX_COLUMNS, _CSETF_SMATRIX_COLUMNS);
        identity(SPARSE_MATRIX);
        register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $dtp_sparse_matrix$.getGlobalValue(), symbol_function(VISIT_DEFSTRUCT_OBJECT_SPARSE_MATRIX_METHOD));
        return NIL;
    }

    @Override
    public void declareFunctions() {
        declare_sparse_matrix_file();
    }

    @Override
    public void initializeVariables() {
        init_sparse_matrix_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_sparse_matrix_file();
    }

    

    public static final class $sparse_matrix_native extends SubLStructNative {
        public SubLObject $rows;

        public SubLObject $columns;

        private static final SubLStructDeclNative structDecl;

        private $sparse_matrix_native() {
            this.$rows = Lisp.NIL;
            this.$columns = Lisp.NIL;
        }

        @Override
        public SubLStructDecl getStructDecl() {
            return structDecl;
        }

        @Override
        public SubLObject getField2() {
            return this.$rows;
        }

        @Override
        public SubLObject getField3() {
            return this.$columns;
        }

        @Override
        public SubLObject setField2(final SubLObject value) {
            return this.$rows = value;
        }

        @Override
        public SubLObject setField3(final SubLObject value) {
            return this.$columns = value;
        }

        static {
            structDecl = makeStructDeclNative($sparse_matrix_native.class, SPARSE_MATRIX, SPARSE_MATRIX_P, $list2, $list3, new String[]{ "$rows", "$columns" }, $list4, $list5, SMATRIX_PRINT);
        }
    }

    public static final class $sparse_matrix_p$UnaryFunction extends UnaryFunction {
        public $sparse_matrix_p$UnaryFunction() {
            super(extractFunctionNamed("SPARSE-MATRIX-P"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1) {
            return sparse_matrix_p(arg1);
        }
    }
}

/**
 * Total time: 332 ms
 */
