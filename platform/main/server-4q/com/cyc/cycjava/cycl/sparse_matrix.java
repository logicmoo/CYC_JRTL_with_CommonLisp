/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 */
package com.cyc.cycjava.cycl;


import static com.cyc.cycjava.cycl.subl_promotions.memberP;
import static com.cyc.cycjava.cycl.subl_promotions.positive_integer_p;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.append;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.cons;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.listS;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality.identity;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions.funcall;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.clrhash;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.getEntryKey;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.getEntrySetIterator;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.getEntryValue;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.gethash;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.hash_table_count;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.hash_table_test;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.iteratorHasNext;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.iteratorNextEntry;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.make_hash_table;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.releaseEntrySetIterator;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.remhash;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.sethash;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.abs;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.add;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.divide;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.sqrt;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.subtract;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.zerop;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.nreverse;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures.def_csetf;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures.makeStructDeclNative;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures.register_method;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.symbol_function;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.floatp;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.numberp;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.values;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeDouble;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeInteger;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeKeyword;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeString;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeSymbol;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.cdestructuring_bind_error;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.destructuring_bind_must_consp;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.cadr;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.cddr;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high.$print_object_method_table$;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high.princ;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.terpri;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.write_string;
import static com.cyc.tool.subl.util.SubLFiles.declareFunction;
import static com.cyc.tool.subl.util.SubLFiles.declareMacro;
import static com.cyc.tool.subl.util.SubLFiles.defconstant;
import static com.cyc.tool.subl.util.SubLFiles.deflexical;

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
import com.cyc.tool.subl.util.SubLFiles.LispMethod;
import com.cyc.tool.subl.util.SubLTrampolineFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 * module:      SPARSE-MATRIX
 * source file: /cyc/top/cycl/sparse-matrix.lisp
 * created:     2019/07/03 17:37:16
 */
public final class sparse_matrix extends SubLTranslatedFile implements V12 {
    public static final SubLFile me = new sparse_matrix();

 public static final String myName = "com.cyc.cycjava.cycl.sparse_matrix";


    // defconstant
    @LispMethod(comment = "defconstant")
    public static final SubLSymbol $dtp_sparse_matrix$ = makeSymbol("*DTP-SPARSE-MATRIX*");

    // deflexical
    @LispMethod(comment = "deflexical")
    public static final SubLSymbol $default_smatrix_epsilon$ = makeSymbol("*DEFAULT-SMATRIX-EPSILON*");

    // Internal Constants
    @LispMethod(comment = "Internal Constants")
    private static final SubLSymbol SPARSE_MATRIX = makeSymbol("SPARSE-MATRIX");

    private static final SubLSymbol SPARSE_MATRIX_P = makeSymbol("SPARSE-MATRIX-P");

    static private final SubLList $list2 = list(makeSymbol("ROWS"), makeSymbol("COLUMNS"));

    static private final SubLList $list3 = list($ROWS, makeKeyword("COLUMNS"));

    static private final SubLList $list4 = list(makeSymbol("SMATRIX-ROWS"), makeSymbol("SMATRIX-COLUMNS"));

    static private final SubLList $list5 = list(makeSymbol("_CSETF-SMATRIX-ROWS"), makeSymbol("_CSETF-SMATRIX-COLUMNS"));

    private static final SubLSymbol SMATRIX_PRINT = makeSymbol("SMATRIX-PRINT");

    private static final SubLSymbol SPARSE_MATRIX_PRINT_FUNCTION_TRAMPOLINE = makeSymbol("SPARSE-MATRIX-PRINT-FUNCTION-TRAMPOLINE");

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

    public static final SubLObject sparse_matrix_print_function_trampoline_alt(SubLObject v_object, SubLObject stream) {
        smatrix_print(v_object, stream, ZERO_INTEGER);
        return NIL;
    }

    public static SubLObject sparse_matrix_print_function_trampoline(final SubLObject v_object, final SubLObject stream) {
        smatrix_print(v_object, stream, ZERO_INTEGER);
        return NIL;
    }

    public static final SubLObject sparse_matrix_p_alt(SubLObject v_object) {
        return v_object.getClass() == com.cyc.cycjava.cycl.sparse_matrix.$sparse_matrix_native.class ? ((SubLObject) (T)) : NIL;
    }

    public static SubLObject sparse_matrix_p(final SubLObject v_object) {
        return v_object.getClass() == com.cyc.cycjava.cycl.sparse_matrix.$sparse_matrix_native.class ? T : NIL;
    }

    public static final SubLObject smatrix_rows_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, SPARSE_MATRIX_P);
        return v_object.getField2();
    }

    public static SubLObject smatrix_rows(final SubLObject v_object) {
        assert NIL != sparse_matrix_p(v_object) : "! sparse_matrix.sparse_matrix_p(v_object) " + "sparse_matrix.sparse_matrix_p error :" + v_object;
        return v_object.getField2();
    }

    public static final SubLObject smatrix_columns_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, SPARSE_MATRIX_P);
        return v_object.getField3();
    }

    public static SubLObject smatrix_columns(final SubLObject v_object) {
        assert NIL != sparse_matrix_p(v_object) : "! sparse_matrix.sparse_matrix_p(v_object) " + "sparse_matrix.sparse_matrix_p error :" + v_object;
        return v_object.getField3();
    }

    public static final SubLObject _csetf_smatrix_rows_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, SPARSE_MATRIX_P);
        return v_object.setField2(value);
    }

    public static SubLObject _csetf_smatrix_rows(final SubLObject v_object, final SubLObject value) {
        assert NIL != sparse_matrix_p(v_object) : "! sparse_matrix.sparse_matrix_p(v_object) " + "sparse_matrix.sparse_matrix_p error :" + v_object;
        return v_object.setField2(value);
    }

    public static final SubLObject _csetf_smatrix_columns_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, SPARSE_MATRIX_P);
        return v_object.setField3(value);
    }

    public static SubLObject _csetf_smatrix_columns(final SubLObject v_object, final SubLObject value) {
        assert NIL != sparse_matrix_p(v_object) : "! sparse_matrix.sparse_matrix_p(v_object) " + "sparse_matrix.sparse_matrix_p error :" + v_object;
        return v_object.setField3(value);
    }

    public static final SubLObject make_sparse_matrix_alt(SubLObject arglist) {
        if (arglist == UNPROVIDED) {
            arglist = NIL;
        }
        {
            SubLObject v_new = new com.cyc.cycjava.cycl.sparse_matrix.$sparse_matrix_native();
            SubLObject next = NIL;
            for (next = arglist; NIL != next; next = cddr(next)) {
                {
                    SubLObject current_arg = next.first();
                    SubLObject current_value = cadr(next);
                    SubLObject pcase_var = current_arg;
                    if (pcase_var.eql($ROWS)) {
                        _csetf_smatrix_rows(v_new, current_value);
                    } else {
                        if (pcase_var.eql($COLUMNS)) {
                            _csetf_smatrix_columns(v_new, current_value);
                        } else {
                            Errors.error($str_alt14$Invalid_slot__S_for_construction_, current_arg);
                        }
                    }
                }
            }
            return v_new;
        }
    }

    public static SubLObject make_sparse_matrix(SubLObject arglist) {
        if (arglist == UNPROVIDED) {
            arglist = NIL;
        }
        final SubLObject v_new = new com.cyc.cycjava.cycl.sparse_matrix.$sparse_matrix_native();
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

    /**
     *
     *
     * @param TESTFN
     * 		valid-hash-test-p; the test function used to compare row and
     * 		column names
     * @param SIZE
     * 		positive-integer-p; the initial number of rows allocated
     * @return sparse-matrix-p; a new empty sparse matrix with test function TESTFN
    and initial size SIZE
     */
    @LispMethod(comment = "@param TESTFN\r\n\t\tvalid-hash-test-p; the test function used to compare row and\r\n\t\tcolumn names\r\n@param SIZE\r\n\t\tpositive-integer-p; the initial number of rows allocated\r\n@return sparse-matrix-p; a new empty sparse matrix with test function TESTFN\r\nand initial size SIZE")
    public static final SubLObject new_sparse_matrix_alt(SubLObject testfn, SubLObject size) {
        if (testfn == UNPROVIDED) {
            testfn = EQL;
        }
        if (size == UNPROVIDED) {
            size = $int$100;
        }
        SubLTrampolineFile.checkType(size, POSITIVE_INTEGER_P);
        SubLTrampolineFile.checkType(testfn, VALID_HASH_TEST_P);
        {
            SubLObject matrix = make_sparse_matrix(UNPROVIDED);
            _csetf_smatrix_rows(matrix, make_hash_table(size, testfn, UNPROVIDED));
            _csetf_smatrix_columns(matrix, make_hash_table(size, testfn, UNPROVIDED));
            return matrix;
        }
    }

    /**
     *
     *
     * @param TESTFN
     * 		valid-hash-test-p; the test function used to compare row and
     * 		column names
     * @param SIZE
     * 		positive-integer-p; the initial number of rows allocated
     * @return sparse-matrix-p; a new empty sparse matrix with test function TESTFN
    and initial size SIZE
     */
    @LispMethod(comment = "@param TESTFN\r\n\t\tvalid-hash-test-p; the test function used to compare row and\r\n\t\tcolumn names\r\n@param SIZE\r\n\t\tpositive-integer-p; the initial number of rows allocated\r\n@return sparse-matrix-p; a new empty sparse matrix with test function TESTFN\r\nand initial size SIZE")
    public static SubLObject new_sparse_matrix(SubLObject testfn, SubLObject size) {
        if (testfn == UNPROVIDED) {
            testfn = EQL;
        }
        if (size == UNPROVIDED) {
            size = $int$100;
        }
        assert NIL != subl_promotions.positive_integer_p(size) : "! subl_promotions.positive_integer_p(size) " + ("subl_promotions.positive_integer_p(size) " + "CommonSymbols.NIL != subl_promotions.positive_integer_p(size) ") + size;
        assert NIL != hash_table_utilities.valid_hash_test_p(testfn) : "! hash_table_utilities.valid_hash_test_p(testfn) " + ("hash_table_utilities.valid_hash_test_p(testfn) " + "CommonSymbols.NIL != hash_table_utilities.valid_hash_test_p(testfn) ") + testfn;
        final SubLObject matrix = make_sparse_matrix(UNPROVIDED);
        _csetf_smatrix_rows(matrix, make_hash_table(size, testfn, UNPROVIDED));
        _csetf_smatrix_columns(matrix, make_hash_table(size, testfn, UNPROVIDED));
        return matrix;
    }

    /**
     *
     *
     * @param MATRIX
    sparse-matrix-p;
     * 		
     * @return valid-hash-test-p; the test function of MATRIX
     */
    @LispMethod(comment = "@param MATRIX\nsparse-matrix-p;\r\n\t\t\r\n@return valid-hash-test-p; the test function of MATRIX")
    public static final SubLObject smatrix_test_alt(SubLObject matrix) {
        SubLTrampolineFile.checkType(matrix, SPARSE_MATRIX_P);
        return hash_table_test(smatrix_rows(matrix));
    }

    /**
     *
     *
     * @param MATRIX
    sparse-matrix-p;
     * 		
     * @return valid-hash-test-p; the test function of MATRIX
     */
    @LispMethod(comment = "@param MATRIX\nsparse-matrix-p;\r\n\t\t\r\n@return valid-hash-test-p; the test function of MATRIX")
    public static SubLObject smatrix_test(final SubLObject matrix) {
        assert NIL != sparse_matrix_p(matrix) : "! sparse_matrix.sparse_matrix_p(matrix) " + ("sparse_matrix.sparse_matrix_p(matrix) " + "CommonSymbols.NIL != sparse_matrix.sparse_matrix_p(matrix) ") + matrix;
        return hash_table_test(smatrix_rows(matrix));
    }

    /**
     * Pretty-prints MATRIX to STREAM, ignoring DEPTH
     */
    @LispMethod(comment = "Pretty-prints MATRIX to STREAM, ignoring DEPTH")
    public static final SubLObject smatrix_print_alt(SubLObject matrix, SubLObject stream, SubLObject depth) {
        write_string($str_alt18$__SPARSE_MATRIX_, stream, UNPROVIDED, UNPROVIDED);
        terpri(stream);
        {
            SubLObject cdohash_table = smatrix_rows(matrix);
            SubLObject row = NIL;
            SubLObject vector = NIL;
            {
                final Iterator cdohash_iterator = getEntrySetIterator(cdohash_table);
                try {
                    while (iteratorHasNext(cdohash_iterator)) {
                        final Map.Entry cdohash_entry = iteratorNextEntry(cdohash_iterator);
                        row = getEntryKey(cdohash_entry);
                        vector = getEntryValue(cdohash_entry);
                        princ(row, stream);
                        write_string($str_alt19$_, stream, UNPROVIDED, UNPROVIDED);
                        sparse_vector.svector_print(vector, stream, ZERO_INTEGER);
                        terpri(stream);
                    } 
                } finally {
                    releaseEntrySetIterator(cdohash_iterator);
                }
            }
        }
        write_string($str_alt20$_, stream, UNPROVIDED, UNPROVIDED);
        return matrix;
    }

    /**
     * Pretty-prints MATRIX to STREAM, ignoring DEPTH
     */
    @LispMethod(comment = "Pretty-prints MATRIX to STREAM, ignoring DEPTH")
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

    /**
     *
     *
     * @param MATRIX
    sparse-matrix-p
     * 		
     * @return boolean; t if MATRIX is an empty matrix, nil otherwise
     */
    @LispMethod(comment = "@param MATRIX\nsparse-matrix-p\r\n\t\t\r\n@return boolean; t if MATRIX is an empty matrix, nil otherwise")
    public static final SubLObject zero_smatrix_p_alt(SubLObject matrix) {
        SubLTrampolineFile.checkType(matrix, SPARSE_MATRIX_P);
        return zerop(hash_table_count(smatrix_rows(matrix)));
    }

    /**
     *
     *
     * @param MATRIX
    sparse-matrix-p
     * 		
     * @return boolean; t if MATRIX is an empty matrix, nil otherwise
     */
    @LispMethod(comment = "@param MATRIX\nsparse-matrix-p\r\n\t\t\r\n@return boolean; t if MATRIX is an empty matrix, nil otherwise")
    public static SubLObject zero_smatrix_p(final SubLObject matrix) {
        assert NIL != sparse_matrix_p(matrix) : "! sparse_matrix.sparse_matrix_p(matrix) " + ("sparse_matrix.sparse_matrix_p(matrix) " + "CommonSymbols.NIL != sparse_matrix.sparse_matrix_p(matrix) ") + matrix;
        return zerop(hash_table_count(smatrix_rows(matrix)));
    }

    /**
     *
     *
     * @param MATRIX
    sparse-matrix-p
     * 		
     * @return sparse-matrix-p; a deep copy of MATRIX
     */
    @LispMethod(comment = "@param MATRIX\nsparse-matrix-p\r\n\t\t\r\n@return sparse-matrix-p; a deep copy of MATRIX")
    public static final SubLObject smatrix_copy_alt(SubLObject matrix) {
        SubLTrampolineFile.checkType(matrix, SPARSE_MATRIX_P);
        {
            SubLObject copy = new_sparse_matrix(UNPROVIDED, UNPROVIDED);
            SubLObject cdohash_table = smatrix_rows(matrix);
            SubLObject row = NIL;
            SubLObject vector = NIL;
            {
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
            }
            return copy;
        }
    }

    /**
     *
     *
     * @param MATRIX
    sparse-matrix-p
     * 		
     * @return sparse-matrix-p; a deep copy of MATRIX
     */
    @LispMethod(comment = "@param MATRIX\nsparse-matrix-p\r\n\t\t\r\n@return sparse-matrix-p; a deep copy of MATRIX")
    public static SubLObject smatrix_copy(final SubLObject matrix) {
        assert NIL != sparse_matrix_p(matrix) : "! sparse_matrix.sparse_matrix_p(matrix) " + ("sparse_matrix.sparse_matrix_p(matrix) " + "CommonSymbols.NIL != sparse_matrix.sparse_matrix_p(matrix) ") + matrix;
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

    /**
     * Destructively set row ROW of MATRIX to VECTOR
     *
     * @param MATRIX
    sparse-matrix-p
     * 		
     * @param ROW
    object
     * 		
     * @param VECTOR
    sparse-vector-p
     * 		
     * @return sparse-matrix-p; a destructively modified version of MATRIX
     */
    @LispMethod(comment = "Destructively set row ROW of MATRIX to VECTOR\r\n\r\n@param MATRIX\nsparse-matrix-p\r\n\t\t\r\n@param ROW\nobject\r\n\t\t\r\n@param VECTOR\nsparse-vector-p\r\n\t\t\r\n@return sparse-matrix-p; a destructively modified version of MATRIX")
    public static final SubLObject smatrix_set_row_alt(SubLObject matrix, SubLObject row, SubLObject vector) {
        SubLTrampolineFile.checkType(matrix, SPARSE_MATRIX_P);
        SubLTrampolineFile.checkType(row, VALID_MATRIX_ROW_P);
        SubLTrampolineFile.checkType(vector, SPARSE_VECTOR_P);
        if (!smatrix_test(matrix).eql(sparse_vector.svector_test(vector))) {
            Errors.error($str_alt23$non_equal_matrix_and_vector_test_);
        }
        if (NIL == sparse_vector.zero_svector_p(vector)) {
            sethash(row, smatrix_rows(matrix), vector);
            smatrix_clear_columns(matrix);
        }
        return matrix;
    }

    /**
     * Destructively set row ROW of MATRIX to VECTOR
     *
     * @param MATRIX
    		sparse-matrix-p
     * 		
     * @param ROW
    		object
     * 		
     * @param VECTOR
    		sparse-vector-p
     * 		
     * @return sparse-matrix-p; a destructively modified version of MATRIX
     */
    @LispMethod(comment = "Destructively set row ROW of MATRIX to VECTOR\r\n\r\n@param MATRIX\n\t\tsparse-matrix-p\r\n\t\t\r\n@param ROW\n\t\tobject\r\n\t\t\r\n@param VECTOR\n\t\tsparse-vector-p\r\n\t\t\r\n@return sparse-matrix-p; a destructively modified version of MATRIX")
    public static SubLObject smatrix_set_row(final SubLObject matrix, final SubLObject row, final SubLObject vector) {
        assert NIL != sparse_matrix_p(matrix) : "! sparse_matrix.sparse_matrix_p(matrix) " + ("sparse_matrix.sparse_matrix_p(matrix) " + "CommonSymbols.NIL != sparse_matrix.sparse_matrix_p(matrix) ") + matrix;
        assert NIL != valid_matrix_row_p(row) : "! sparse_matrix.valid_matrix_row_p(row) " + ("sparse_matrix.valid_matrix_row_p(row) " + "CommonSymbols.NIL != sparse_matrix.valid_matrix_row_p(row) ") + row;
        assert NIL != sparse_vector.sparse_vector_p(vector) : "! sparse_vector.sparse_vector_p(vector) " + ("sparse_vector.sparse_vector_p(vector) " + "CommonSymbols.NIL != sparse_vector.sparse_vector_p(vector) ") + vector;
        if (!smatrix_test(matrix).eql(sparse_vector.svector_test(vector))) {
            Errors.error($str29$non_equal_matrix_and_vector_test_);
        }
        if (NIL == sparse_vector.zero_svector_p(vector)) {
            sethash(row, smatrix_rows(matrix), vector);
            smatrix_clear_columns(matrix);
        }
        return matrix;
    }

    /**
     * Destructively sets position ROW, COLUMN in MATRIX to VALUE
     *
     * @param MATRIX
    sparse-matrix-p
     * 		
     * @param ROW
    object
     * 		
     * @param COLUMN
    object
     * 		
     * @param value
    numberp
     * 		
     */
    @LispMethod(comment = "Destructively sets position ROW, COLUMN in MATRIX to VALUE\r\n\r\n@param MATRIX\nsparse-matrix-p\r\n\t\t\r\n@param ROW\nobject\r\n\t\t\r\n@param COLUMN\nobject\r\n\t\t\r\n@param value\nnumberp")
    public static final SubLObject smatrix_set_alt(SubLObject matrix, SubLObject row, SubLObject column, SubLObject value) {
        SubLTrampolineFile.checkType(matrix, SPARSE_MATRIX_P);
        SubLTrampolineFile.checkType(row, VALID_MATRIX_ROW_P);
        SubLTrampolineFile.checkType(column, VALID_MATRIX_COLUMN_P);
        SubLTrampolineFile.checkType(value, NUMBERP);
        {
            SubLObject vector = gethash(row, smatrix_rows(matrix), UNPROVIDED);
            if (NIL == vector) {
                vector = sparse_vector.new_sparse_vector(smatrix_test(matrix), UNPROVIDED);
                sethash(row, smatrix_rows(matrix), vector);
            }
            return sparse_vector.svector_set(vector, column, value);
        }
    }

    @LispMethod(comment = "Destructively sets position ROW, COLUMN in MATRIX to VALUE\r\n\r\n@param MATRIX\n\t\tsparse-matrix-p\r\n\t\t\r\n@param ROW\n\t\tobject\r\n\t\t\r\n@param COLUMN\n\t\tobject\r\n\t\t\r\n@param value\n\t\tnumberp")
    public static SubLObject smatrix_set(final SubLObject matrix, final SubLObject row, final SubLObject column, final SubLObject value) {
        assert NIL != sparse_matrix_p(matrix) : "! sparse_matrix.sparse_matrix_p(matrix) " + ("sparse_matrix.sparse_matrix_p(matrix) " + "CommonSymbols.NIL != sparse_matrix.sparse_matrix_p(matrix) ") + matrix;
        assert NIL != valid_matrix_row_p(row) : "! sparse_matrix.valid_matrix_row_p(row) " + ("sparse_matrix.valid_matrix_row_p(row) " + "CommonSymbols.NIL != sparse_matrix.valid_matrix_row_p(row) ") + row;
        assert NIL != valid_matrix_column_p(column) : "! sparse_matrix.valid_matrix_column_p(column) " + ("sparse_matrix.valid_matrix_column_p(column) " + "CommonSymbols.NIL != sparse_matrix.valid_matrix_column_p(column) ") + column;
        assert NIL != numberp(value) : "! numberp(value) " + ("Types.numberp(value) " + "CommonSymbols.NIL != Types.numberp(value) ") + value;
        SubLObject vector = gethash(row, smatrix_rows(matrix), UNPROVIDED);
        if (NIL == vector) {
            vector = sparse_vector.new_sparse_vector(smatrix_test(matrix), UNPROVIDED);
            sethash(row, smatrix_rows(matrix), vector);
        }
        return sparse_vector.svector_set(vector, column, value);
    }

    /**
     *
     *
     * @param MATRIX
    sparse-matrix-p
     * 		
     * @param ROW
    object
     * 		
     * @param COLUMN
    object
     * 		
     * @return numberp; the number at ROW, COLUMN in MATRIX
     */
    @LispMethod(comment = "@param MATRIX\nsparse-matrix-p\r\n\t\t\r\n@param ROW\nobject\r\n\t\t\r\n@param COLUMN\nobject\r\n\t\t\r\n@return numberp; the number at ROW, COLUMN in MATRIX")
    public static final SubLObject smatrix_get_alt(SubLObject matrix, SubLObject row, SubLObject column) {
        SubLTrampolineFile.checkType(matrix, SPARSE_MATRIX_P);
        SubLTrampolineFile.checkType(row, VALID_MATRIX_ROW_P);
        SubLTrampolineFile.checkType(column, VALID_MATRIX_COLUMN_P);
        return sparse_vector.svector_get(gethash(row, smatrix_rows(matrix), UNPROVIDED), column);
    }

    /**
     *
     *
     * @param MATRIX
    sparse-matrix-p
     * 		
     * @param ROW
    object
     * 		
     * @param COLUMN
    object
     * 		
     * @return numberp; the number at ROW, COLUMN in MATRIX
     */
    @LispMethod(comment = "@param MATRIX\nsparse-matrix-p\r\n\t\t\r\n@param ROW\nobject\r\n\t\t\r\n@param COLUMN\nobject\r\n\t\t\r\n@return numberp; the number at ROW, COLUMN in MATRIX")
    public static SubLObject smatrix_get(final SubLObject matrix, final SubLObject row, final SubLObject column) {
        assert NIL != sparse_matrix_p(matrix) : "! sparse_matrix.sparse_matrix_p(matrix) " + ("sparse_matrix.sparse_matrix_p(matrix) " + "CommonSymbols.NIL != sparse_matrix.sparse_matrix_p(matrix) ") + matrix;
        assert NIL != valid_matrix_row_p(row) : "! sparse_matrix.valid_matrix_row_p(row) " + ("sparse_matrix.valid_matrix_row_p(row) " + "CommonSymbols.NIL != sparse_matrix.valid_matrix_row_p(row) ") + row;
        assert NIL != valid_matrix_column_p(column) : "! sparse_matrix.valid_matrix_column_p(column) " + ("sparse_matrix.valid_matrix_column_p(column) " + "CommonSymbols.NIL != sparse_matrix.valid_matrix_column_p(column) ") + column;
        return sparse_vector.svector_get(gethash(row, smatrix_rows(matrix), UNPROVIDED), column);
    }

    /**
     *
     *
     * @param MATRIX1
    sparse-matrix-p
     * 		
     * @param MATRIX2
    sparse-matrix-p
     * 		
     * @return sparse-matrix-p; the result of destructively adding MATRIX2 to MATRIX1
     * @unknown MATRIX1 is destructively modified
     */
    @LispMethod(comment = "@param MATRIX1\nsparse-matrix-p\r\n\t\t\r\n@param MATRIX2\nsparse-matrix-p\r\n\t\t\r\n@return sparse-matrix-p; the result of destructively adding MATRIX2 to MATRIX1\r\n@unknown MATRIX1 is destructively modified")
    public static final SubLObject smatrix_add_alt(SubLObject matrix1, SubLObject matrix2) {
        SubLTrampolineFile.checkType(matrix1, SPARSE_MATRIX_P);
        SubLTrampolineFile.checkType(matrix2, SPARSE_MATRIX_P);
        smatrix_clear_columns(matrix1);
        {
            SubLObject vector2 = NIL;
            SubLObject cdohash_table = smatrix_rows(matrix1);
            SubLObject row = NIL;
            SubLObject vector1 = NIL;
            {
                final Iterator cdohash_iterator = getEntrySetIterator(cdohash_table);
                try {
                    while (iteratorHasNext(cdohash_iterator)) {
                        final Map.Entry cdohash_entry = iteratorNextEntry(cdohash_iterator);
                        row = getEntryKey(cdohash_entry);
                        vector1 = getEntryValue(cdohash_entry);
                        vector2 = gethash(row, smatrix_rows(matrix2), UNPROVIDED);
                        if (NIL != vector2) {
                            sparse_vector.svector_add(vector1, vector2);
                        }
                    } 
                } finally {
                    releaseEntrySetIterator(cdohash_iterator);
                }
            }
        }
        return matrix1;
    }

    /**
     *
     *
     * @param MATRIX1
    sparse-matrix-p
     * 		
     * @param MATRIX2
    sparse-matrix-p
     * 		
     * @return sparse-matrix-p; the result of destructively adding MATRIX2 to MATRIX1
     * @unknown MATRIX1 is destructively modified
     */
    @LispMethod(comment = "@param MATRIX1\nsparse-matrix-p\r\n\t\t\r\n@param MATRIX2\nsparse-matrix-p\r\n\t\t\r\n@return sparse-matrix-p; the result of destructively adding MATRIX2 to MATRIX1\r\n@unknown MATRIX1 is destructively modified")
    public static SubLObject smatrix_add(final SubLObject matrix1, final SubLObject matrix2) {
        assert NIL != sparse_matrix_p(matrix1) : "! sparse_matrix.sparse_matrix_p(matrix1) " + ("sparse_matrix.sparse_matrix_p(matrix1) " + "CommonSymbols.NIL != sparse_matrix.sparse_matrix_p(matrix1) ") + matrix1;
        assert NIL != sparse_matrix_p(matrix2) : "! sparse_matrix.sparse_matrix_p(matrix2) " + ("sparse_matrix.sparse_matrix_p(matrix2) " + "CommonSymbols.NIL != sparse_matrix.sparse_matrix_p(matrix2) ") + matrix2;
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

    /**
     *
     *
     * @param MATRIX
    sparse-matrix-p
     * 		
     * @param SCALAR
    numberp
     * 		
     * @return sparse-matrix-p; the scalar product of MATRIX and SCALAR
     */
    @LispMethod(comment = "@param MATRIX\nsparse-matrix-p\r\n\t\t\r\n@param SCALAR\nnumberp\r\n\t\t\r\n@return sparse-matrix-p; the scalar product of MATRIX and SCALAR")
    public static final SubLObject smatrix_scalar_product_alt(SubLObject matrix, SubLObject scalar) {
        SubLTrampolineFile.checkType(matrix, SPARSE_MATRIX_P);
        SubLTrampolineFile.checkType(scalar, NUMBERP);
        smatrix_clear_columns(matrix);
        {
            SubLObject cdohash_table = smatrix_rows(matrix);
            SubLObject row = NIL;
            SubLObject vector = NIL;
            {
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
            }
        }
        return matrix;
    }

    /**
     *
     *
     * @param MATRIX
    sparse-matrix-p
     * 		
     * @param SCALAR
    numberp
     * 		
     * @return sparse-matrix-p; the scalar product of MATRIX and SCALAR
     */
    @LispMethod(comment = "@param MATRIX\nsparse-matrix-p\r\n\t\t\r\n@param SCALAR\nnumberp\r\n\t\t\r\n@return sparse-matrix-p; the scalar product of MATRIX and SCALAR")
    public static SubLObject smatrix_scalar_product(final SubLObject matrix, final SubLObject scalar) {
        assert NIL != sparse_matrix_p(matrix) : "! sparse_matrix.sparse_matrix_p(matrix) " + ("sparse_matrix.sparse_matrix_p(matrix) " + "CommonSymbols.NIL != sparse_matrix.sparse_matrix_p(matrix) ") + matrix;
        assert NIL != numberp(scalar) : "! numberp(scalar) " + ("Types.numberp(scalar) " + "CommonSymbols.NIL != Types.numberp(scalar) ") + scalar;
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

    /**
     *
     *
     * @param MATRIX
    sparse-matrix-p
     * 		
     * @param VECTOR
    sparse-vector-p
     * 		
     * @return sparse-vector-p; the vector product of MATRIX and VECTOR
     */
    @LispMethod(comment = "@param MATRIX\nsparse-matrix-p\r\n\t\t\r\n@param VECTOR\nsparse-vector-p\r\n\t\t\r\n@return sparse-vector-p; the vector product of MATRIX and VECTOR")
    public static final SubLObject smatrix_vector_product_alt(SubLObject matrix, SubLObject vector) {
        SubLTrampolineFile.checkType(matrix, SPARSE_MATRIX_P);
        SubLTrampolineFile.checkType(vector, SPARSE_VECTOR_P);
        {
            SubLObject product = sparse_vector.new_sparse_vector(smatrix_test(matrix), UNPROVIDED);
            SubLObject cdohash_table = smatrix_rows(matrix);
            SubLObject row_name = NIL;
            SubLObject row = NIL;
            {
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
            }
            return product;
        }
    }

    /**
     *
     *
     * @param MATRIX
    sparse-matrix-p
     * 		
     * @param VECTOR
    sparse-vector-p
     * 		
     * @return sparse-vector-p; the vector product of MATRIX and VECTOR
     */
    @LispMethod(comment = "@param MATRIX\nsparse-matrix-p\r\n\t\t\r\n@param VECTOR\nsparse-vector-p\r\n\t\t\r\n@return sparse-vector-p; the vector product of MATRIX and VECTOR")
    public static SubLObject smatrix_vector_product(final SubLObject matrix, final SubLObject vector) {
        assert NIL != sparse_matrix_p(matrix) : "! sparse_matrix.sparse_matrix_p(matrix) " + ("sparse_matrix.sparse_matrix_p(matrix) " + "CommonSymbols.NIL != sparse_matrix.sparse_matrix_p(matrix) ") + matrix;
        assert NIL != sparse_vector.sparse_vector_p(vector) : "! sparse_vector.sparse_vector_p(vector) " + ("sparse_vector.sparse_vector_p(vector) " + "CommonSymbols.NIL != sparse_vector.sparse_vector_p(vector) ") + vector;
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

    /**
     *
     *
     * @param MATRIX1
    sparse-matrix-p
     * 		
     * @param MATRIX2
    sparse-matrix-p
     * 		
     * @return sparse-matrix-p; the product of MATRIX1 and MATRIX2
     */
    @LispMethod(comment = "@param MATRIX1\nsparse-matrix-p\r\n\t\t\r\n@param MATRIX2\nsparse-matrix-p\r\n\t\t\r\n@return sparse-matrix-p; the product of MATRIX1 and MATRIX2")
    public static final SubLObject smatrix_matrix_product_alt(SubLObject matrix1, SubLObject matrix2) {
        SubLTrampolineFile.checkType(matrix1, SPARSE_MATRIX_P);
        SubLTrampolineFile.checkType(matrix2, SPARSE_MATRIX_P);
        {
            SubLObject matrix = new_sparse_matrix(UNPROVIDED, UNPROVIDED);
            smatrix_ensure_columns(matrix2);
            {
                SubLObject cdohash_table = smatrix_rows(matrix1);
                SubLObject row = NIL;
                SubLObject row_vector = NIL;
                {
                    final Iterator cdohash_iterator = getEntrySetIterator(cdohash_table);
                    try {
                        while (iteratorHasNext(cdohash_iterator)) {
                            final Map.Entry cdohash_entry = iteratorNextEntry(cdohash_iterator);
                            row = getEntryKey(cdohash_entry);
                            row_vector = getEntryValue(cdohash_entry);
                            {
                                SubLObject new_row = sparse_vector.new_sparse_vector(smatrix_test(matrix1), UNPROVIDED);
                                SubLObject cdohash_table_1 = smatrix_columns(matrix2);
                                SubLObject column = NIL;
                                SubLObject column_vector = NIL;
                                {
                                    final Iterator cdohash_iterator_2 = getEntrySetIterator(cdohash_table_1);
                                    try {
                                        while (iteratorHasNext(cdohash_iterator_2)) {
                                            final Map.Entry cdohash_entry_3 = iteratorNextEntry(cdohash_iterator_2);
                                            column = getEntryKey(cdohash_entry_3);
                                            column_vector = getEntryValue(cdohash_entry_3);
                                            sparse_vector.svector_set(new_row, column, sparse_vector.svector_scalar_product(row_vector, column_vector));
                                        } 
                                    } finally {
                                        releaseEntrySetIterator(cdohash_iterator_2);
                                    }
                                }
                                smatrix_set_row(matrix, row, new_row);
                            }
                        } 
                    } finally {
                        releaseEntrySetIterator(cdohash_iterator);
                    }
                }
            }
            return matrix;
        }
    }

    /**
     *
     *
     * @param MATRIX1
    sparse-matrix-p
     * 		
     * @param MATRIX2
    sparse-matrix-p
     * 		
     * @return sparse-matrix-p; the product of MATRIX1 and MATRIX2
     */
    @LispMethod(comment = "@param MATRIX1\nsparse-matrix-p\r\n\t\t\r\n@param MATRIX2\nsparse-matrix-p\r\n\t\t\r\n@return sparse-matrix-p; the product of MATRIX1 and MATRIX2")
    public static SubLObject smatrix_matrix_product(final SubLObject matrix1, final SubLObject matrix2) {
        assert NIL != sparse_matrix_p(matrix1) : "! sparse_matrix.sparse_matrix_p(matrix1) " + ("sparse_matrix.sparse_matrix_p(matrix1) " + "CommonSymbols.NIL != sparse_matrix.sparse_matrix_p(matrix1) ") + matrix1;
        assert NIL != sparse_matrix_p(matrix2) : "! sparse_matrix.sparse_matrix_p(matrix2) " + ("sparse_matrix.sparse_matrix_p(matrix2) " + "CommonSymbols.NIL != sparse_matrix.sparse_matrix_p(matrix2) ") + matrix2;
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

    /**
     *
     *
     * @param MATRIX
    sparse-matrix-p
     * 		
     * @return sparse-matrix-p; the transpose of MATRIX
     */
    @LispMethod(comment = "@param MATRIX\nsparse-matrix-p\r\n\t\t\r\n@return sparse-matrix-p; the transpose of MATRIX")
    public static final SubLObject smatrix_transpose_alt(SubLObject matrix) {
        SubLTrampolineFile.checkType(matrix, SPARSE_MATRIX_P);
        smatrix_ensure_columns(matrix);
        {
            SubLObject temp = NIL;
            temp = smatrix_rows(matrix);
            _csetf_smatrix_rows(matrix, smatrix_columns(matrix));
            _csetf_smatrix_columns(matrix, temp);
        }
        return matrix;
    }

    /**
     *
     *
     * @param MATRIX
    sparse-matrix-p
     * 		
     * @return sparse-matrix-p; the transpose of MATRIX
     */
    @LispMethod(comment = "@param MATRIX\nsparse-matrix-p\r\n\t\t\r\n@return sparse-matrix-p; the transpose of MATRIX")
    public static SubLObject smatrix_transpose(final SubLObject matrix) {
        assert NIL != sparse_matrix_p(matrix) : "! sparse_matrix.sparse_matrix_p(matrix) " + ("sparse_matrix.sparse_matrix_p(matrix) " + "CommonSymbols.NIL != sparse_matrix.sparse_matrix_p(matrix) ") + matrix;
        smatrix_ensure_columns(matrix);
        SubLObject temp = NIL;
        temp = smatrix_rows(matrix);
        _csetf_smatrix_rows(matrix, smatrix_columns(matrix));
        _csetf_smatrix_columns(matrix, temp);
        return matrix;
    }

    /**
     *
     *
     * @param MATRIX
    sparse-matrix-p
     * 		
     * @return sparse-matrix-p; the inverse of MATRIX
     */
    @LispMethod(comment = "@param MATRIX\nsparse-matrix-p\r\n\t\t\r\n@return sparse-matrix-p; the inverse of MATRIX")
    public static final SubLObject smatrix_inverse_alt(SubLObject matrix) {
        SubLTrampolineFile.checkType(matrix, SPARSE_MATRIX_P);
        return smatrix_scalar_product(matrix, MINUS_ONE_INTEGER);
    }

    /**
     *
     *
     * @param MATRIX
    sparse-matrix-p
     * 		
     * @return sparse-matrix-p; the inverse of MATRIX
     */
    @LispMethod(comment = "@param MATRIX\nsparse-matrix-p\r\n\t\t\r\n@return sparse-matrix-p; the inverse of MATRIX")
    public static SubLObject smatrix_inverse(final SubLObject matrix) {
        assert NIL != sparse_matrix_p(matrix) : "! sparse_matrix.sparse_matrix_p(matrix) " + ("sparse_matrix.sparse_matrix_p(matrix) " + "CommonSymbols.NIL != sparse_matrix.sparse_matrix_p(matrix) ") + matrix;
        return smatrix_scalar_product(matrix, MINUS_ONE_INTEGER);
    }

    /**
     *
     *
     * @param MATRIX
    sparse-matrix-p
     * 		
     * @return integerp; the sum norm of MATRIX
     */
    @LispMethod(comment = "@param MATRIX\nsparse-matrix-p\r\n\t\t\r\n@return integerp; the sum norm of MATRIX")
    public static final SubLObject smatrix_sum_norm_alt(SubLObject matrix) {
        SubLTrampolineFile.checkType(matrix, SPARSE_MATRIX_P);
        smatrix_ensure_columns(matrix);
        {
            SubLObject norm = ZERO_INTEGER;
            SubLObject vector_norm = NIL;
            SubLObject cdohash_table = smatrix_columns(matrix);
            SubLObject column = NIL;
            SubLObject vector = NIL;
            {
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
            }
            return norm;
        }
    }

    /**
     *
     *
     * @param MATRIX
    sparse-matrix-p
     * 		
     * @return integerp; the sum norm of MATRIX
     */
    @LispMethod(comment = "@param MATRIX\nsparse-matrix-p\r\n\t\t\r\n@return integerp; the sum norm of MATRIX")
    public static SubLObject smatrix_sum_norm(final SubLObject matrix) {
        assert NIL != sparse_matrix_p(matrix) : "! sparse_matrix.sparse_matrix_p(matrix) " + ("sparse_matrix.sparse_matrix_p(matrix) " + "CommonSymbols.NIL != sparse_matrix.sparse_matrix_p(matrix) ") + matrix;
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

    /**
     *
     *
     * @param MATRIX
    sparse-matrix-p
     * 		
     * @return integerp; the max norm of MATRIX
     */
    @LispMethod(comment = "@param MATRIX\nsparse-matrix-p\r\n\t\t\r\n@return integerp; the max norm of MATRIX")
    public static final SubLObject smatrix_max_norm_alt(SubLObject matrix) {
        SubLTrampolineFile.checkType(matrix, SPARSE_MATRIX_P);
        {
            SubLObject norm = ZERO_INTEGER;
            SubLObject vector_norm = NIL;
            SubLObject cdohash_table = smatrix_rows(matrix);
            SubLObject row = NIL;
            SubLObject vector = NIL;
            {
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
            }
            return norm;
        }
    }

    /**
     *
     *
     * @param MATRIX
    sparse-matrix-p
     * 		
     * @return integerp; the max norm of MATRIX
     */
    @LispMethod(comment = "@param MATRIX\nsparse-matrix-p\r\n\t\t\r\n@return integerp; the max norm of MATRIX")
    public static SubLObject smatrix_max_norm(final SubLObject matrix) {
        assert NIL != sparse_matrix_p(matrix) : "! sparse_matrix.sparse_matrix_p(matrix) " + ("sparse_matrix.sparse_matrix_p(matrix) " + "CommonSymbols.NIL != sparse_matrix.sparse_matrix_p(matrix) ") + matrix;
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

    /**
     *
     *
     * @param MATRIX
    sparse-matrix-p
     * 		
     * @param N
     * 		positive-integer-p; the number of eigenpairs to return
     * @param EPSILON
     * 		floatp; the difference indicating when two numbers
     * 		are considered to be equal by the iterative methods. Increasing this
     * 		value will result in faster computation with less accuracy
     * @return listp; the first N eigenpairs of MATRIX, as a list of conses
     */
    @LispMethod(comment = "@param MATRIX\nsparse-matrix-p\r\n\t\t\r\n@param N\r\n\t\tpositive-integer-p; the number of eigenpairs to return\r\n@param EPSILON\r\n\t\tfloatp; the difference indicating when two numbers\r\n\t\tare considered to be equal by the iterative methods. Increasing this\r\n\t\tvalue will result in faster computation with less accuracy\r\n@return listp; the first N eigenpairs of MATRIX, as a list of conses")
    public static final SubLObject smatrix_eigenpairs_alt(SubLObject matrix, SubLObject n, SubLObject epsilon) {
        if (n == UNPROVIDED) {
            n = hash_table_count(smatrix_rows(matrix));
        }
        if (epsilon == UNPROVIDED) {
            epsilon = $float$0_01;
        }
        SubLTrampolineFile.checkType(matrix, SPARSE_MATRIX_P);
        SubLTrampolineFile.checkType(n, NON_NEGATIVE_INTEGER_P);
        SubLTrampolineFile.checkType(epsilon, FLOATP);
        {
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
    }

    /**
     *
     *
     * @param MATRIX
    sparse-matrix-p
     * 		
     * @param N
     * 		positive-integer-p; the number of eigenpairs to return
     * @param EPSILON
     * 		floatp; the difference indicating when two numbers
     * 		are considered to be equal by the iterative methods. Increasing this
     * 		value will result in faster computation with less accuracy
     * @return listp; the first N eigenpairs of MATRIX, as a list of conses
     */
    @LispMethod(comment = "@param MATRIX\nsparse-matrix-p\r\n\t\t\r\n@param N\r\n\t\tpositive-integer-p; the number of eigenpairs to return\r\n@param EPSILON\r\n\t\tfloatp; the difference indicating when two numbers\r\n\t\tare considered to be equal by the iterative methods. Increasing this\r\n\t\tvalue will result in faster computation with less accuracy\r\n@return listp; the first N eigenpairs of MATRIX, as a list of conses")
    public static SubLObject smatrix_eigenpairs(final SubLObject matrix, SubLObject n, SubLObject epsilon) {
        if (n == UNPROVIDED) {
            n = hash_table_count(smatrix_rows(matrix));
        }
        if (epsilon == UNPROVIDED) {
            epsilon = $default_smatrix_epsilon$.getGlobalValue();
        }
        assert NIL != sparse_matrix_p(matrix) : "! sparse_matrix.sparse_matrix_p(matrix) " + ("sparse_matrix.sparse_matrix_p(matrix) " + "CommonSymbols.NIL != sparse_matrix.sparse_matrix_p(matrix) ") + matrix;
        assert NIL != subl_promotions.non_negative_integer_p(n) : "! subl_promotions.non_negative_integer_p(n) " + ("subl_promotions.non_negative_integer_p(n) " + "CommonSymbols.NIL != subl_promotions.non_negative_integer_p(n) ") + n;
        assert NIL != floatp(epsilon) : "! floatp(epsilon) " + ("Types.floatp(epsilon) " + "CommonSymbols.NIL != Types.floatp(epsilon) ") + epsilon;
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

    /**
     *
     *
     * @param MATRIX
    sparse-matrix-p;
     * 		
     * @return sparse-matrix-p sparse-matrix-p sparse-matrix-p; the singular value decomposition of MATRIX.
    That is, the product of the three returned matrices will yield MATRIX, modulo rounding errors
     */
    @LispMethod(comment = "@param MATRIX\nsparse-matrix-p;\r\n\t\t\r\n@return sparse-matrix-p sparse-matrix-p sparse-matrix-p; the singular value decomposition of MATRIX.\r\nThat is, the product of the three returned matrices will yield MATRIX, modulo rounding errors")
    public static final SubLObject smatrix_svd_alt(SubLObject matrix) {
        SubLTrampolineFile.checkType(matrix, SPARSE_MATRIX_P);
        {
            SubLObject mtm = smatrix_matrix_product(smatrix_transpose(smatrix_copy(matrix)), matrix);
            SubLObject u = new_sparse_matrix(smatrix_test(matrix), UNPROVIDED);
            SubLObject uprime = new_sparse_matrix(smatrix_test(matrix), UNPROVIDED);
            SubLObject d = new_sparse_matrix(smatrix_test(matrix), UNPROVIDED);
            SubLObject s = NIL;
            SubLObject i = ONE_INTEGER;
            SubLObject cdolist_list_var = smatrix_eigenpairs(mtm, UNPROVIDED, UNPROVIDED);
            SubLObject eigenpair = NIL;
            for (eigenpair = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , eigenpair = cdolist_list_var.first()) {
                smatrix_set_row(u, i, eigenpair.first());
                s = sqrt(abs(eigenpair.rest()));
                smatrix_set_row(uprime, i, sparse_vector.svector_scale(smatrix_vector_product(matrix, eigenpair.first()), divide(ONE_INTEGER, s)));
                smatrix_set(d, i, i, s);
                i = add(i, ONE_INTEGER);
            }
            smatrix_transpose(uprime);
            return values(uprime, d, u);
        }
    }

    /**
     *
     *
     * @param MATRIX
    sparse-matrix-p;
     * 		
     * @return sparse-matrix-p sparse-matrix-p sparse-matrix-p; the singular value decomposition of MATRIX.
    That is, the product of the three returned matrices will yield MATRIX, modulo rounding errors
     */
    @LispMethod(comment = "@param MATRIX\nsparse-matrix-p;\r\n\t\t\r\n@return sparse-matrix-p sparse-matrix-p sparse-matrix-p; the singular value decomposition of MATRIX.\r\nThat is, the product of the three returned matrices will yield MATRIX, modulo rounding errors")
    public static SubLObject smatrix_svd(final SubLObject matrix) {
        assert NIL != sparse_matrix_p(matrix) : "! sparse_matrix.sparse_matrix_p(matrix) " + ("sparse_matrix.sparse_matrix_p(matrix) " + "CommonSymbols.NIL != sparse_matrix.sparse_matrix_p(matrix) ") + matrix;
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

    /**
     * Executes BODY with ROW and VALUE successively bound to each row name and
     * its associated row vector of MATRIX
     */
    @LispMethod(comment = "Executes BODY with ROW and VALUE successively bound to each row name and\r\nits associated row vector of MATRIX\nExecutes BODY with ROW and VALUE successively bound to each row name and\nits associated row vector of MATRIX")
    public static final SubLObject do_smatrix_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            destructuring_bind_must_consp(current, datum, $list_alt29);
            {
                SubLObject temp = current.rest();
                current = current.first();
                {
                    SubLObject row = NIL;
                    SubLObject value = NIL;
                    SubLObject matrix = NIL;
                    destructuring_bind_must_consp(current, datum, $list_alt29);
                    row = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt29);
                    value = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt29);
                    matrix = current.first();
                    current = current.rest();
                    if (NIL == current) {
                        current = temp;
                        {
                            SubLObject body = current;
                            return listS(CDOHASH, list(row, value, list(SMATRIX_ROWS, matrix)), append(body, NIL));
                        }
                    } else {
                        cdestructuring_bind_error(datum, $list_alt29);
                    }
                }
            }
        }
        return NIL;
    }

    /**
     * Executes BODY with ROW and VALUE successively bound to each row name and
     * its associated row vector of MATRIX
     */
    @LispMethod(comment = "Executes BODY with ROW and VALUE successively bound to each row name and\r\nits associated row vector of MATRIX\nExecutes BODY with ROW and VALUE successively bound to each row name and\nits associated row vector of MATRIX")
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

    /**
     *
     *
     * @param MATRIX
    sparse-matrix-p;
     * 		
     * @param EPSILON
     * 		floatp; the difference indicating when two numbers
     * 		are considered to be equal by the iterative methods. Increasing this
     * 		value will result in faster computation with less accuracy
     * @return consp; the dominant eigen pair of MATRIX
     */
    @LispMethod(comment = "@param MATRIX\nsparse-matrix-p;\r\n\t\t\r\n@param EPSILON\r\n\t\tfloatp; the difference indicating when two numbers\r\n\t\tare considered to be equal by the iterative methods. Increasing this\r\n\t\tvalue will result in faster computation with less accuracy\r\n@return consp; the dominant eigen pair of MATRIX")
    public static final SubLObject smatrix_dominant_eigenpair_alt(SubLObject matrix, SubLObject epsilon) {
        if (epsilon == UNPROVIDED) {
            epsilon = $float$9_999999999999999e_25;
        }
        SubLTrampolineFile.checkType(matrix, SPARSE_MATRIX_P);
        {
            SubLObject init_vector = sparse_vector.new_sparse_vector(smatrix_test(matrix), UNPROVIDED);
            SubLObject eigenvalue = ZERO_INTEGER;
            SubLObject eigenvector = sparse_vector.new_sparse_vector(smatrix_test(matrix), UNPROVIDED);
            SubLObject max_iteration = add(hash_table_count(smatrix_rows(matrix)), $int$100);
            SubLObject cdolist_list_var = smatrix_nonzero_columns(matrix);
            SubLObject column = NIL;
            for (column = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , column = cdolist_list_var.first()) {
                sparse_vector.svector_set(init_vector, column, number_utilities.f_1X(random.random(TEN_INTEGER)));
            }
            {
                SubLObject i = NIL;
                SubLObject old_vector = NIL;
                SubLObject new_vector = NIL;
                SubLObject old_growth = NIL;
                SubLObject new_growth = NIL;
                SubLObject growth_rate = NIL;
                for (i = ZERO_INTEGER, old_vector = init_vector, new_vector = smatrix_vector_product(matrix, old_vector), old_growth = ZERO_INTEGER, new_growth = raleigh_quotient(new_vector, old_vector), growth_rate = abs(subtract(new_growth, old_growth)); !(growth_rate.numL(epsilon) || i.numG(max_iteration)); i = number_utilities.f_1X(i) , old_vector = new_vector , new_vector = smatrix_vector_product(matrix, old_vector) , old_growth = new_growth , new_growth = raleigh_quotient(new_vector, old_vector) , growth_rate = abs(subtract(new_growth, old_growth))) {
                    eigenvalue = new_growth;
                    eigenvector = new_vector;
                }
            }
            return cons(eigenvector, eigenvalue);
        }
    }

    /**
     *
     *
     * @param MATRIX
    sparse-matrix-p;
     * 		
     * @param EPSILON
     * 		floatp; the difference indicating when two numbers
     * 		are considered to be equal by the iterative methods. Increasing this
     * 		value will result in faster computation with less accuracy
     * @return consp; the dominant eigen pair of MATRIX
     */
    @LispMethod(comment = "@param MATRIX\nsparse-matrix-p;\r\n\t\t\r\n@param EPSILON\r\n\t\tfloatp; the difference indicating when two numbers\r\n\t\tare considered to be equal by the iterative methods. Increasing this\r\n\t\tvalue will result in faster computation with less accuracy\r\n@return consp; the dominant eigen pair of MATRIX")
    public static SubLObject smatrix_dominant_eigenpair(final SubLObject matrix, SubLObject epsilon) {
        if (epsilon == UNPROVIDED) {
            epsilon = $default_smatrix_epsilon$.getGlobalValue();
        }
        assert NIL != sparse_matrix_p(matrix) : "! sparse_matrix.sparse_matrix_p(matrix) " + ("sparse_matrix.sparse_matrix_p(matrix) " + "CommonSymbols.NIL != sparse_matrix.sparse_matrix_p(matrix) ") + matrix;
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

    public static final SubLObject svector_star_alt(SubLObject vector1, SubLObject vector2) {
        SubLTrampolineFile.checkType(vector1, SPARSE_VECTOR_P);
        SubLTrampolineFile.checkType(vector2, SPARSE_VECTOR_P);
        {
            SubLObject matrix = new_sparse_matrix(sparse_vector.svector_test(vector1), UNPROVIDED);
            SubLObject cdohash_table = sparse_vector.svector_dimensions(vector1);
            SubLObject dim = NIL;
            SubLObject value = NIL;
            {
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
            }
            return matrix;
        }
    }

    public static SubLObject svector_star(final SubLObject vector1, final SubLObject vector2) {
        assert NIL != sparse_vector.sparse_vector_p(vector1) : "! sparse_vector.sparse_vector_p(vector1) " + ("sparse_vector.sparse_vector_p(vector1) " + "CommonSymbols.NIL != sparse_vector.sparse_vector_p(vector1) ") + vector1;
        assert NIL != sparse_vector.sparse_vector_p(vector2) : "! sparse_vector.sparse_vector_p(vector2) " + ("sparse_vector.sparse_vector_p(vector2) " + "CommonSymbols.NIL != sparse_vector.sparse_vector_p(vector2) ") + vector2;
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

    public static final SubLObject smatrix_deflation_alt(SubLObject matrix, SubLObject eigenvalue, SubLObject eigenvector) {
        SubLTrampolineFile.checkType(matrix, SPARSE_MATRIX_P);
        SubLTrampolineFile.checkType(eigenvalue, NUMBERP);
        SubLTrampolineFile.checkType(eigenvector, SPARSE_VECTOR_P);
        return smatrix_add(matrix, smatrix_inverse(svector_star(sparse_vector.svector_scale(sparse_vector.svector_copy(eigenvector), eigenvalue), eigenvector)));
    }

    public static SubLObject smatrix_deflation(final SubLObject matrix, final SubLObject eigenvalue, final SubLObject eigenvector) {
        assert NIL != sparse_matrix_p(matrix) : "! sparse_matrix.sparse_matrix_p(matrix) " + ("sparse_matrix.sparse_matrix_p(matrix) " + "CommonSymbols.NIL != sparse_matrix.sparse_matrix_p(matrix) ") + matrix;
        assert NIL != numberp(eigenvalue) : "! numberp(eigenvalue) " + ("Types.numberp(eigenvalue) " + "CommonSymbols.NIL != Types.numberp(eigenvalue) ") + eigenvalue;
        assert NIL != sparse_vector.sparse_vector_p(eigenvector) : "! sparse_vector.sparse_vector_p(eigenvector) " + ("sparse_vector.sparse_vector_p(eigenvector) " + "CommonSymbols.NIL != sparse_vector.sparse_vector_p(eigenvector) ") + eigenvector;
        return smatrix_add(matrix, smatrix_inverse(svector_star(sparse_vector.svector_scale(sparse_vector.svector_copy(eigenvector), eigenvalue), eigenvector)));
    }

    public static final SubLObject sum_quotient_alt(SubLObject new_vector, SubLObject old_vector) {
        return divide(sparse_vector.svector_max_norm(new_vector), sparse_vector.svector_max_norm(old_vector));
    }

    public static SubLObject sum_quotient(final SubLObject new_vector, final SubLObject old_vector) {
        return divide(sparse_vector.svector_max_norm(new_vector), sparse_vector.svector_max_norm(old_vector));
    }

    public static final SubLObject raleigh_quotient_alt(SubLObject new_vector, SubLObject old_vector) {
        {
            SubLObject nominator = sparse_vector.svector_scalar_product(old_vector, new_vector);
            SubLObject denominator = sparse_vector.svector_scalar_product(old_vector, old_vector);
            if (nominator.numE(denominator)) {
                return ONE_INTEGER;
            }
            if (denominator.isZero()) {
                return $float$3_4028232e_38;
            }
            return divide(nominator, denominator);
        }
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

    public static final SubLObject smatrix_nonzero_columns_alt(SubLObject matrix) {
        smatrix_ensure_columns(matrix);
        {
            SubLObject keys = NIL;
            SubLObject cdohash_table = smatrix_columns(matrix);
            SubLObject column = NIL;
            SubLObject vector = NIL;
            {
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
            }
            return keys;
        }
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

    public static final SubLObject valid_matrix_row_p_alt(SubLObject v_object) {
        return v_object;
    }

    public static SubLObject valid_matrix_row_p(final SubLObject v_object) {
        return v_object;
    }

    public static final SubLObject valid_matrix_column_p_alt(SubLObject v_object) {
        return v_object;
    }

    public static SubLObject valid_matrix_column_p(final SubLObject v_object) {
        return v_object;
    }

    public static final SubLObject smatrix_clear_columns_alt(SubLObject matrix) {
        return clrhash(smatrix_columns(matrix));
    }

    public static SubLObject smatrix_clear_columns(final SubLObject matrix) {
        return clrhash(smatrix_columns(matrix));
    }

    public static final SubLObject smatrix_compute_columns_alt(SubLObject matrix) {
        {
            SubLObject cdohash_table = smatrix_rows(matrix);
            SubLObject row = NIL;
            SubLObject vector = NIL;
            {
                final Iterator cdohash_iterator = getEntrySetIterator(cdohash_table);
                try {
                    while (iteratorHasNext(cdohash_iterator)) {
                        final Map.Entry cdohash_entry = iteratorNextEntry(cdohash_iterator);
                        row = getEntryKey(cdohash_entry);
                        vector = getEntryValue(cdohash_entry);
                        {
                            SubLObject cdohash_table_4 = sparse_vector.svector_dimensions(vector);
                            SubLObject column = NIL;
                            SubLObject value = NIL;
                            {
                                final Iterator cdohash_iterator_5 = getEntrySetIterator(cdohash_table_4);
                                try {
                                    while (iteratorHasNext(cdohash_iterator_5)) {
                                        final Map.Entry cdohash_entry_6 = iteratorNextEntry(cdohash_iterator_5);
                                        column = getEntryKey(cdohash_entry_6);
                                        value = getEntryValue(cdohash_entry_6);
                                        smatrix_get_column(matrix, column);
                                    } 
                                } finally {
                                    releaseEntrySetIterator(cdohash_iterator_5);
                                }
                            }
                        }
                    } 
                } finally {
                    releaseEntrySetIterator(cdohash_iterator);
                }
            }
        }
        return matrix;
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

    public static final SubLObject smatrix_get_column_alt(SubLObject matrix, SubLObject column) {
        SubLTrampolineFile.checkType(matrix, SPARSE_MATRIX_P);
        SubLTrampolineFile.checkType(column, VALID_MATRIX_COLUMN_P);
        {
            SubLObject vector = gethash(column, smatrix_columns(matrix), UNPROVIDED);
            SubLObject value = NIL;
            if (NIL == vector) {
                vector = sparse_vector.new_sparse_vector(smatrix_test(matrix), UNPROVIDED);
                {
                    SubLObject cdohash_table = smatrix_rows(matrix);
                    SubLObject row = NIL;
                    SubLObject row_vector = NIL;
                    {
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
                }
            }
            sethash(column, smatrix_columns(matrix), vector);
            return vector;
        }
    }

    public static SubLObject smatrix_get_column(final SubLObject matrix, final SubLObject column) {
        assert NIL != sparse_matrix_p(matrix) : "! sparse_matrix.sparse_matrix_p(matrix) " + ("sparse_matrix.sparse_matrix_p(matrix) " + "CommonSymbols.NIL != sparse_matrix.sparse_matrix_p(matrix) ") + matrix;
        assert NIL != valid_matrix_column_p(column) : "! sparse_matrix.valid_matrix_column_p(column) " + ("sparse_matrix.valid_matrix_column_p(column) " + "CommonSymbols.NIL != sparse_matrix.valid_matrix_column_p(column) ") + column;
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

    public static final SubLObject smatrix_ensure_columns_alt(SubLObject matrix) {
        if (NIL == positive_integer_p(hash_table_count(smatrix_columns(matrix)))) {
            _csetf_smatrix_columns(matrix, make_hash_table($int$50, smatrix_test(matrix), UNPROVIDED));
            smatrix_compute_columns(matrix);
        }
        return matrix;
    }

    public static SubLObject smatrix_ensure_columns(final SubLObject matrix) {
        if (NIL == subl_promotions.positive_integer_p(hash_table_count(smatrix_columns(matrix)))) {
            _csetf_smatrix_columns(matrix, make_hash_table($int$50, smatrix_test(matrix), UNPROVIDED));
            smatrix_compute_columns(matrix);
        }
        return matrix;
    }

    /**
     * Destructively removes all rows except for those in KEEP from MATRIX
     */
    @LispMethod(comment = "Destructively removes all rows except for those in KEEP from MATRIX")
    public static final SubLObject smatrix_reduce_alt(SubLObject matrix, SubLObject keep) {
        smatrix_clear_columns(matrix);
        {
            SubLObject rows = smatrix_rows(matrix);
            SubLObject row = NIL;
            SubLObject vector = NIL;
            {
                final Iterator cdohash_iterator = getEntrySetIterator(rows);
                try {
                    while (iteratorHasNext(cdohash_iterator)) {
                        final Map.Entry cdohash_entry = iteratorNextEntry(cdohash_iterator);
                        row = getEntryKey(cdohash_entry);
                        vector = getEntryValue(cdohash_entry);
                        if (NIL == memberP(row, keep, smatrix_test(matrix), UNPROVIDED)) {
                            remhash(row, rows);
                        }
                    } 
                } finally {
                    releaseEntrySetIterator(cdohash_iterator);
                }
            }
            return matrix;
        }
    }

    @LispMethod(comment = "Destructively removes all rows except for those in KEEP from MATRIX")
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
    }/**
     * Destructively removes all rows except for those in KEEP from MATRIX
     */


    public static SubLObject declare_sparse_matrix_file() {
        declareFunction("sparse_matrix_print_function_trampoline", "SPARSE-MATRIX-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        declareFunction("sparse_matrix_p", "SPARSE-MATRIX-P", 1, 0, false);
        new sparse_matrix.$sparse_matrix_p$UnaryFunction();
        declareFunction("smatrix_rows", "SMATRIX-ROWS", 1, 0, false);
        declareFunction("smatrix_columns", "SMATRIX-COLUMNS", 1, 0, false);
        declareFunction("_csetf_smatrix_rows", "_CSETF-SMATRIX-ROWS", 2, 0, false);
        declareFunction("_csetf_smatrix_columns", "_CSETF-SMATRIX-COLUMNS", 2, 0, false);
        declareFunction("make_sparse_matrix", "MAKE-SPARSE-MATRIX", 0, 1, false);
        declareFunction("visit_defstruct_sparse_matrix", "VISIT-DEFSTRUCT-SPARSE-MATRIX", 2, 0, false);
        declareFunction("visit_defstruct_object_sparse_matrix_method", "VISIT-DEFSTRUCT-OBJECT-SPARSE-MATRIX-METHOD", 2, 0, false);
        declareFunction("new_sparse_matrix", "NEW-SPARSE-MATRIX", 0, 2, false);
        declareFunction("smatrix_test", "SMATRIX-TEST", 1, 0, false);
        declareFunction("smatrix_print", "SMATRIX-PRINT", 3, 0, false);
        declareFunction("zero_smatrix_p", "ZERO-SMATRIX-P", 1, 0, false);
        declareFunction("smatrix_copy", "SMATRIX-COPY", 1, 0, false);
        declareFunction("smatrix_set_row", "SMATRIX-SET-ROW", 3, 0, false);
        declareFunction("smatrix_set", "SMATRIX-SET", 4, 0, false);
        declareFunction("smatrix_get", "SMATRIX-GET", 3, 0, false);
        declareFunction("smatrix_add", "SMATRIX-ADD", 2, 0, false);
        declareFunction("smatrix_scalar_product", "SMATRIX-SCALAR-PRODUCT", 2, 0, false);
        declareFunction("smatrix_vector_product", "SMATRIX-VECTOR-PRODUCT", 2, 0, false);
        declareFunction("smatrix_matrix_product", "SMATRIX-MATRIX-PRODUCT", 2, 0, false);
        declareFunction("smatrix_transpose", "SMATRIX-TRANSPOSE", 1, 0, false);
        declareFunction("smatrix_inverse", "SMATRIX-INVERSE", 1, 0, false);
        declareFunction("smatrix_sum_norm", "SMATRIX-SUM-NORM", 1, 0, false);
        declareFunction("smatrix_max_norm", "SMATRIX-MAX-NORM", 1, 0, false);
        declareFunction("smatrix_eigenpairs", "SMATRIX-EIGENPAIRS", 1, 2, false);
        declareFunction("smatrix_svd", "SMATRIX-SVD", 1, 0, false);
        declareMacro("do_smatrix", "DO-SMATRIX");
        declareFunction("smatrix_dominant_eigenpair", "SMATRIX-DOMINANT-EIGENPAIR", 1, 1, false);
        declareFunction("svector_star", "SVECTOR-STAR", 2, 0, false);
        declareFunction("smatrix_deflation", "SMATRIX-DEFLATION", 3, 0, false);
        declareFunction("sum_quotient", "SUM-QUOTIENT", 2, 0, false);
        declareFunction("raleigh_quotient", "RALEIGH-QUOTIENT", 2, 0, false);
        declareFunction("smatrix_nonzero_columns", "SMATRIX-NONZERO-COLUMNS", 1, 0, false);
        declareFunction("valid_matrix_row_p", "VALID-MATRIX-ROW-P", 1, 0, false);
        declareFunction("valid_matrix_column_p", "VALID-MATRIX-COLUMN-P", 1, 0, false);
        declareFunction("smatrix_clear_columns", "SMATRIX-CLEAR-COLUMNS", 1, 0, false);
        declareFunction("smatrix_compute_columns", "SMATRIX-COMPUTE-COLUMNS", 1, 0, false);
        declareFunction("smatrix_get_column", "SMATRIX-GET-COLUMN", 2, 0, false);
        declareFunction("smatrix_ensure_columns", "SMATRIX-ENSURE-COLUMNS", 1, 0, false);
        declareFunction("smatrix_reduce", "SMATRIX-REDUCE", 2, 0, false);
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

    static {
    }

    public static final class $sparse_matrix_native extends SubLStructNative {
        public SubLObject $rows;

        public SubLObject $columns;

        private static final SubLStructDeclNative structDecl;

        public $sparse_matrix_native() {
            sparse_matrix.$sparse_matrix_native.this.$rows = Lisp.NIL;
            sparse_matrix.$sparse_matrix_native.this.$columns = Lisp.NIL;
        }

        @Override
        public SubLStructDecl getStructDecl() {
            return structDecl;
        }

        @Override
        public SubLObject getField2() {
            return sparse_matrix.$sparse_matrix_native.this.$rows;
        }

        @Override
        public SubLObject getField3() {
            return sparse_matrix.$sparse_matrix_native.this.$columns;
        }

        @Override
        public SubLObject setField2(final SubLObject value) {
            return sparse_matrix.$sparse_matrix_native.this.$rows = value;
        }

        @Override
        public SubLObject setField3(final SubLObject value) {
            return sparse_matrix.$sparse_matrix_native.this.$columns = value;
        }

        static {
            structDecl = makeStructDeclNative(com.cyc.cycjava.cycl.sparse_matrix.$sparse_matrix_native.class, SPARSE_MATRIX, SPARSE_MATRIX_P, $list2, $list3, new String[]{ "$rows", "$columns" }, $list4, $list5, SMATRIX_PRINT);
        }
    }

    static private final SubLList $list_alt2 = list(makeSymbol("ROWS"), makeSymbol("COLUMNS"));

    static private final SubLList $list_alt3 = list($ROWS, makeKeyword("COLUMNS"));

    static private final SubLList $list_alt4 = list(makeSymbol("SMATRIX-ROWS"), makeSymbol("SMATRIX-COLUMNS"));

    public static final class $sparse_matrix_p$UnaryFunction extends UnaryFunction {
        public $sparse_matrix_p$UnaryFunction() {
            super(extractFunctionNamed("SPARSE-MATRIX-P"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1) {
            return sparse_matrix_p(arg1);
        }
    }

    static private final SubLList $list_alt5 = list(makeSymbol("_CSETF-SMATRIX-ROWS"), makeSymbol("_CSETF-SMATRIX-COLUMNS"));

    static private final SubLString $str_alt14$Invalid_slot__S_for_construction_ = makeString("Invalid slot ~S for construction function");

    static private final SubLString $str_alt18$__SPARSE_MATRIX_ = makeString("#<SPARSE-MATRIX ");

    static private final SubLString $str_alt19$_ = makeString("|");

    static private final SubLString $str_alt20$_ = makeString(">");

    static private final SubLString $str_alt23$non_equal_matrix_and_vector_test_ = makeString("non-equal matrix and vector test functions");

    static private final SubLList $list_alt29 = list(list(makeSymbol("ROW"), makeSymbol("VALUE"), makeSymbol("MATRIX")), makeSymbol("&BODY"), makeSymbol("BODY"));

    public static final SubLFloat $float$9_999999999999999e_25 = makeDouble(1.0E-24);

    public static final SubLFloat $float$3_4028232e_38 = makeDouble(3.4028232E38);
}

/**
 * Total time: 332 ms
 */
