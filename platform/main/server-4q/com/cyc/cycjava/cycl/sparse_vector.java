/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 */
package com.cyc.cycjava.cycl;


import static com.cyc.cycjava.cycl.cfasl.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.*;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.*;
import static com.cyc.tool.subl.util.SubLFiles.*;

import java.util.Iterator;
import java.util.Map;

import org.armedbear.lisp.Lisp;
import org.logicmoo.system.BeanShellCntrl;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLSpecialOperatorDeclarations;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDecl;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDeclNative;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.UnaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLStructNative;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.visitation;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTrampolineFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 * module:      SPARSE-VECTOR
 * source file: /cyc/top/cycl/sparse-vector.lisp
 * created:     2019/07/03 17:37:16
 */
public final class sparse_vector extends SubLTranslatedFile implements V12 {
    public static final SubLFile me = new sparse_vector();

 public static final String myName = "com.cyc.cycjava.cycl.sparse_vector";


    // defconstant
    @LispMethod(comment = "defconstant")
    public static final SubLSymbol $dtp_sparse_vector$ = makeSymbol("*DTP-SPARSE-VECTOR*");

    // defconstant
    @LispMethod(comment = "defconstant")
    private static final SubLSymbol $cfasl_opcode_sparse_vector$ = makeSymbol("*CFASL-OPCODE-SPARSE-VECTOR*");

    // Internal Constants
    @LispMethod(comment = "Internal Constants")
    private static final SubLSymbol SPARSE_VECTOR = makeSymbol("SPARSE-VECTOR");

    private static final SubLSymbol SPARSE_VECTOR_P = makeSymbol("SPARSE-VECTOR-P");

    static private final SubLList $list2 = list(makeSymbol("MAGNITUDE"), makeSymbol("DIMENSIONS"));

    static private final SubLList $list3 = list(makeKeyword("MAGNITUDE"), makeKeyword("DIMENSIONS"));

    static private final SubLList $list4 = list(makeSymbol("SVECTOR-MAGNITUDE"), makeSymbol("SVECTOR-DIMENSIONS"));

    static private final SubLList $list5 = list(makeSymbol("_CSETF-SVECTOR-MAGNITUDE"), makeSymbol("_CSETF-SVECTOR-DIMENSIONS"));

    private static final SubLSymbol SVECTOR_PRINT = makeSymbol("SVECTOR-PRINT");

    private static final SubLSymbol SPARSE_VECTOR_PRINT_FUNCTION_TRAMPOLINE = makeSymbol("SPARSE-VECTOR-PRINT-FUNCTION-TRAMPOLINE");

    private static final SubLList $list8 = list(makeSymbol("OPTIMIZE-FUNCALL"), makeSymbol("SPARSE-VECTOR-P"));

    private static final SubLSymbol SVECTOR_MAGNITUDE = makeSymbol("SVECTOR-MAGNITUDE");

    private static final SubLSymbol _CSETF_SVECTOR_MAGNITUDE = makeSymbol("_CSETF-SVECTOR-MAGNITUDE");

    private static final SubLSymbol SVECTOR_DIMENSIONS = makeSymbol("SVECTOR-DIMENSIONS");

    private static final SubLSymbol _CSETF_SVECTOR_DIMENSIONS = makeSymbol("_CSETF-SVECTOR-DIMENSIONS");

    private static final SubLString $str15$Invalid_slot__S_for_construction_ = makeString("Invalid slot ~S for construction function");

    private static final SubLSymbol MAKE_SPARSE_VECTOR = makeSymbol("MAKE-SPARSE-VECTOR");

    private static final SubLSymbol VISIT_DEFSTRUCT_OBJECT_SPARSE_VECTOR_METHOD = makeSymbol("VISIT-DEFSTRUCT-OBJECT-SPARSE-VECTOR-METHOD");

    private static final SubLInteger $int$50 = makeInteger(50);

    private static final SubLString $str24$__SVECTOR__ = makeString("#<SVECTOR: ");

    private static final SubLSymbol $DO_HASH_TABLE = makeKeyword("DO-HASH-TABLE");

    private static final SubLString $str26$____ = makeString(" -> ");

    private static final SubLString $str27$__ = makeString(", ");

    private static final SubLString $str28$___ = makeString("...");

    private static final SubLString $str29$_ = makeString(">");

    private static final SubLList $list31 = list(list(makeSymbol("DIMENSION"), makeSymbol("VALUE"), makeSymbol("VECTOR")), makeSymbol("&BODY"), makeSymbol("BODY"));

    private static final SubLSymbol NON_EMPTY_LIST_P = makeSymbol("NON-EMPTY-LIST-P");

    private static final SubLString $str34$_a_is_not_a_sparse_vector_with_te = makeString("~a is not a sparse vector with test ~a");

    private static final SubLString $str35$Non_matching_vector_tests__a_and_ = makeString("Non-matching vector tests ~a and ~a");

    private static final SubLInteger $int$65 = makeInteger(65);

    private static final SubLSymbol CFASL_INPUT_SPARSE_VECTOR = makeSymbol("CFASL-INPUT-SPARSE-VECTOR");

    private static final SubLSymbol CFASL_OUTPUT_OBJECT_SPARSE_VECTOR_METHOD = makeSymbol("CFASL-OUTPUT-OBJECT-SPARSE-VECTOR-METHOD");

    public static final SubLObject sparse_vector_print_function_trampoline_alt(SubLObject v_object, SubLObject stream) {
        svector_print(v_object, stream, ZERO_INTEGER);
        return NIL;
    }

    public static SubLObject sparse_vector_print_function_trampoline(final SubLObject v_object, final SubLObject stream) {
        svector_print(v_object, stream, ZERO_INTEGER);
        return NIL;
    }

    public static final SubLObject sparse_vector_p_alt(SubLObject v_object) {
        return v_object.getClass() == com.cyc.cycjava.cycl.sparse_vector.$sparse_vector_native.class ? ((SubLObject) (T)) : NIL;
    }

    public static SubLObject sparse_vector_p(final SubLObject v_object) {
        return v_object.getClass() == com.cyc.cycjava.cycl.sparse_vector.$sparse_vector_native.class ? T : NIL;
    }

    public static final SubLObject svector_magnitude_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, SPARSE_VECTOR_P);
        return v_object.getField2();
    }

    public static SubLObject svector_magnitude(final SubLObject v_object) {
        assert NIL != sparse_vector_p(v_object) : "! sparse_vector.sparse_vector_p(v_object) " + "sparse_vector.sparse_vector_p error :" + v_object;
        return v_object.getField2();
    }

    public static final SubLObject svector_dimensions_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, SPARSE_VECTOR_P);
        return v_object.getField3();
    }

    public static SubLObject svector_dimensions(final SubLObject v_object) {
        assert NIL != sparse_vector_p(v_object) : "! sparse_vector.sparse_vector_p(v_object) " + "sparse_vector.sparse_vector_p error :" + v_object;
        return v_object.getField3();
    }

    public static final SubLObject _csetf_svector_magnitude_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, SPARSE_VECTOR_P);
        return v_object.setField2(value);
    }

    public static SubLObject _csetf_svector_magnitude(final SubLObject v_object, final SubLObject value) {
        assert NIL != sparse_vector_p(v_object) : "! sparse_vector.sparse_vector_p(v_object) " + "sparse_vector.sparse_vector_p error :" + v_object;
        return v_object.setField2(value);
    }

    public static final SubLObject _csetf_svector_dimensions_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, SPARSE_VECTOR_P);
        return v_object.setField3(value);
    }

    public static SubLObject _csetf_svector_dimensions(final SubLObject v_object, final SubLObject value) {
        assert NIL != sparse_vector_p(v_object) : "! sparse_vector.sparse_vector_p(v_object) " + "sparse_vector.sparse_vector_p error :" + v_object;
        return v_object.setField3(value);
    }

    public static final SubLObject make_sparse_vector_alt(SubLObject arglist) {
        if (arglist == UNPROVIDED) {
            arglist = NIL;
        }
        {
            SubLObject v_new = new com.cyc.cycjava.cycl.sparse_vector.$sparse_vector_native();
            SubLObject next = NIL;
            for (next = arglist; NIL != next; next = cddr(next)) {
                {
                    SubLObject current_arg = next.first();
                    SubLObject current_value = cadr(next);
                    SubLObject pcase_var = current_arg;
                    if (pcase_var.eql($MAGNITUDE)) {
                        _csetf_svector_magnitude(v_new, current_value);
                    } else {
                        if (pcase_var.eql($DIMENSIONS)) {
                            _csetf_svector_dimensions(v_new, current_value);
                        } else {
                            Errors.error($str_alt14$Invalid_slot__S_for_construction_, current_arg);
                        }
                    }
                }
            }
            return v_new;
        }
    }

    public static SubLObject make_sparse_vector(SubLObject arglist) {
        if (arglist == UNPROVIDED) {
            arglist = NIL;
        }
        final SubLObject v_new = new com.cyc.cycjava.cycl.sparse_vector.$sparse_vector_native();
        SubLObject next;
        SubLObject current_arg;
        SubLObject current_value;
        SubLObject pcase_var;
        for (next = NIL, next = arglist; NIL != next; next = cddr(next)) {
            current_arg = next.first();
            current_value = cadr(next);
            pcase_var = current_arg;
            if (pcase_var.eql($MAGNITUDE)) {
                _csetf_svector_magnitude(v_new, current_value);
            } else
                if (pcase_var.eql($DIMENSIONS)) {
                    _csetf_svector_dimensions(v_new, current_value);
                } else {
                    Errors.error($str15$Invalid_slot__S_for_construction_, current_arg);
                }

        }
        return v_new;
    }

    public static SubLObject visit_defstruct_sparse_vector(final SubLObject obj, final SubLObject visitor_fn) {
        funcall(visitor_fn, obj, $BEGIN, MAKE_SPARSE_VECTOR, TWO_INTEGER);
        funcall(visitor_fn, obj, $SLOT, $MAGNITUDE, svector_magnitude(obj));
        funcall(visitor_fn, obj, $SLOT, $DIMENSIONS, svector_dimensions(obj));
        funcall(visitor_fn, obj, $END, MAKE_SPARSE_VECTOR, TWO_INTEGER);
        return obj;
    }

    public static SubLObject visit_defstruct_object_sparse_vector_method(final SubLObject obj, final SubLObject visitor_fn) {
        return visit_defstruct_sparse_vector(obj, visitor_fn);
    }

    /**
     *
     *
     * @return svector; a new vector with the original capacity CAPACITY and test function TEST
     * @param CAPACITY
     * 		the originally allocated number of dimensions
     * @param TEST
     * 		the test function by which dimensions are considered to be equal
     */
    @LispMethod(comment = "@return svector; a new vector with the original capacity CAPACITY and test function TEST\r\n@param CAPACITY\r\n\t\tthe originally allocated number of dimensions\r\n@param TEST\r\n\t\tthe test function by which dimensions are considered to be equal")
    public static final SubLObject new_sparse_vector_alt(SubLObject test, SubLObject capacity) {
        if (test == UNPROVIDED) {
            test = EQL;
        }
        if (capacity == UNPROVIDED) {
            capacity = $int$50;
        }
        SubLTrampolineFile.checkType(test, VALID_HASH_TEST_P);
        SubLTrampolineFile.checkType(capacity, INTEGERP);
        {
            SubLObject vector = make_sparse_vector(UNPROVIDED);
            _csetf_svector_dimensions(vector, make_hash_table(capacity, test, UNPROVIDED));
            return vector;
        }
    }

    /**
     *
     *
     * @return svector; a new vector with the original capacity CAPACITY and test function TEST
     * @param CAPACITY
     * 		the originally allocated number of dimensions
     * @param TEST
     * 		the test function by which dimensions are considered to be equal
     */
    @LispMethod(comment = "@return svector; a new vector with the original capacity CAPACITY and test function TEST\r\n@param CAPACITY\r\n\t\tthe originally allocated number of dimensions\r\n@param TEST\r\n\t\tthe test function by which dimensions are considered to be equal")
    public static SubLObject new_sparse_vector(SubLObject test, SubLObject capacity) {
        if (test == UNPROVIDED) {
            test = EQL;
        }
        if (capacity == UNPROVIDED) {
            capacity = $int$50;
        }
        assert NIL != hash_table_utilities.valid_hash_test_p(test) : "! hash_table_utilities.valid_hash_test_p(test) " + ("hash_table_utilities.valid_hash_test_p(test) " + "CommonSymbols.NIL != hash_table_utilities.valid_hash_test_p(test) ") + test;
        assert NIL != integerp(capacity) : "! integerp(capacity) " + ("Types.integerp(capacity) " + "CommonSymbols.NIL != Types.integerp(capacity) ") + capacity;
        final SubLObject vector = make_sparse_vector(UNPROVIDED);
        _csetf_svector_dimensions(vector, make_hash_table(capacity, test, UNPROVIDED));
        return vector;
    }

    /**
     * Pretty-prints VECTOR to STREAM
     */
    @LispMethod(comment = "Pretty-prints VECTOR to STREAM")
    public static final SubLObject svector_print_alt(SubLObject vector, SubLObject stream, SubLObject depth) {
        write_string($str_alt18$__SVECTOR__, stream, UNPROVIDED, UNPROVIDED);
        {
            SubLObject i = ZERO_INTEGER;
            SubLObject count = hash_table_count(svector_dimensions(vector));
            if (!i.numE(min(count, TEN_INTEGER))) {
                {
                    SubLObject catch_var = NIL;
                    try {
                        {
                            SubLObject cdohash_table = svector_dimensions(vector);
                            SubLObject dimension = NIL;
                            SubLObject value = NIL;
                            {
                                final Iterator cdohash_iterator = getEntrySetIterator(cdohash_table);
                                try {
                                    while (iteratorHasNext(cdohash_iterator)) {
                                        final Map.Entry cdohash_entry = iteratorNextEntry(cdohash_iterator);
                                        dimension = getEntryKey(cdohash_entry);
                                        value = getEntryValue(cdohash_entry);
                                        subl_macros.do_hash_table_done_check(numE(i, min(count, TEN_INTEGER)));
                                        princ(dimension, stream);
                                        write_string($str_alt20$____, stream, UNPROVIDED, UNPROVIDED);
                                        princ(value, stream);
                                        princ($str_alt21$__, stream);
                                        i = add(i, ONE_INTEGER);
                                    } 
                                } finally {
                                    releaseEntrySetIterator(cdohash_iterator);
                                }
                            }
                        }
                    } catch (Throwable ccatch_env_var) {
                        catch_var = Errors.handleThrowable(ccatch_env_var, $DO_HASH_TABLE);
                    }
                }
            }
            if (count.numG(i)) {
                write_string($str_alt22$___, stream, UNPROVIDED, UNPROVIDED);
            }
        }
        write_string($str_alt23$_, stream, UNPROVIDED, UNPROVIDED);
        return vector;
    }

    /**
     * Pretty-prints VECTOR to STREAM
     */
    @LispMethod(comment = "Pretty-prints VECTOR to STREAM")
    public static SubLObject svector_print(final SubLObject vector, final SubLObject stream, final SubLObject depth) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        write_string($str24$__SVECTOR__, stream, UNPROVIDED, UNPROVIDED);
        SubLObject i = ZERO_INTEGER;
        final SubLObject count = hash_table_count(svector_dimensions(vector));
        if (!i.numE(min(count, TEN_INTEGER))) {
            SubLObject catch_var = NIL;
            try {
                thread.throwStack.push($DO_HASH_TABLE);
                final SubLObject cdohash_table = svector_dimensions(vector);
                SubLObject dimension = NIL;
                SubLObject value = NIL;
                final Iterator cdohash_iterator = getEntrySetIterator(cdohash_table);
                try {
                    while (iteratorHasNext(cdohash_iterator)) {
                        final Map.Entry cdohash_entry = iteratorNextEntry(cdohash_iterator);
                        dimension = getEntryKey(cdohash_entry);
                        value = getEntryValue(cdohash_entry);
                        subl_macros.do_hash_table_done_check(numE(i, min(count, TEN_INTEGER)));
                        princ(dimension, stream);
                        write_string($str26$____, stream, UNPROVIDED, UNPROVIDED);
                        princ(value, stream);
                        princ($str27$__, stream);
                        i = add(i, ONE_INTEGER);
                    } 
                } finally {
                    releaseEntrySetIterator(cdohash_iterator);
                }
            } catch (final Throwable ccatch_env_var) {
                catch_var = Errors.handleThrowable(ccatch_env_var, $DO_HASH_TABLE);
            } finally {
                thread.throwStack.pop();
            }
        }
        if (count.numG(i)) {
            write_string($str28$___, stream, UNPROVIDED, UNPROVIDED);
        }
        write_string($str29$_, stream, UNPROVIDED, UNPROVIDED);
        return vector;
    }

    /**
     *
     *
     * @param VECTOR
    sparse-vector-p;
     * 		
     * @return symbol; the test function of VECTOR
     */
    @LispMethod(comment = "@param VECTOR\nsparse-vector-p;\r\n\t\t\r\n@return symbol; the test function of VECTOR")
    public static final SubLObject svector_test_alt(SubLObject vector) {
        SubLTrampolineFile.checkType(vector, SPARSE_VECTOR_P);
        return hash_table_test(svector_dimensions(vector));
    }

    /**
     *
     *
     * @param VECTOR
    sparse-vector-p;
     * 		
     * @return symbol; the test function of VECTOR
     */
    @LispMethod(comment = "@param VECTOR\nsparse-vector-p;\r\n\t\t\r\n@return symbol; the test function of VECTOR")
    public static SubLObject svector_test(final SubLObject vector) {
        assert NIL != sparse_vector_p(vector) : "! sparse_vector.sparse_vector_p(vector) " + ("sparse_vector.sparse_vector_p(vector) " + "CommonSymbols.NIL != sparse_vector.sparse_vector_p(vector) ") + vector;
        return hash_table_test(svector_dimensions(vector));
    }

    /**
     *
     *
     * @param VECTOR
    sparse-vector-p;
     * 		
     * @return non-negative-integerp; the number of non-zero dimensions of VECTOR
     */
    @LispMethod(comment = "@param VECTOR\nsparse-vector-p;\r\n\t\t\r\n@return non-negative-integerp; the number of non-zero dimensions of VECTOR")
    public static final SubLObject svector_cardinality_alt(SubLObject vector) {
        SubLTrampolineFile.checkType(vector, SPARSE_VECTOR_P);
        return hash_table_count(svector_dimensions(vector));
    }

    /**
     *
     *
     * @param VECTOR
    sparse-vector-p;
     * 		
     * @return non-negative-integerp; the number of non-zero dimensions of VECTOR
     */
    @LispMethod(comment = "@param VECTOR\nsparse-vector-p;\r\n\t\t\r\n@return non-negative-integerp; the number of non-zero dimensions of VECTOR")
    public static SubLObject svector_cardinality(final SubLObject vector) {
        assert NIL != sparse_vector_p(vector) : "! sparse_vector.sparse_vector_p(vector) " + ("sparse_vector.sparse_vector_p(vector) " + "CommonSymbols.NIL != sparse_vector.sparse_vector_p(vector) ") + vector;
        return hash_table_count(svector_dimensions(vector));
    }

    /**
     *
     *
     * @param VECTOR
    sparse-vector-p;
     * 		
     * @return sparse-vector-p; a copy of VECTOR
     */
    @LispMethod(comment = "@param VECTOR\nsparse-vector-p;\r\n\t\t\r\n@return sparse-vector-p; a copy of VECTOR")
    public static final SubLObject svector_copy_alt(SubLObject vector) {
        SubLTrampolineFile.checkType(vector, SPARSE_VECTOR_P);
        {
            SubLObject copy = new_sparse_vector(svector_test(vector), UNPROVIDED);
            SubLObject cdohash_table = svector_dimensions(vector);
            SubLObject dim = NIL;
            SubLObject value = NIL;
            {
                final Iterator cdohash_iterator = getEntrySetIterator(cdohash_table);
                try {
                    while (iteratorHasNext(cdohash_iterator)) {
                        final Map.Entry cdohash_entry = iteratorNextEntry(cdohash_iterator);
                        dim = getEntryKey(cdohash_entry);
                        value = getEntryValue(cdohash_entry);
                        svector_set(copy, dim, value);
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
     * @param VECTOR
    sparse-vector-p;
     * 		
     * @return sparse-vector-p; a copy of VECTOR
     */
    @LispMethod(comment = "@param VECTOR\nsparse-vector-p;\r\n\t\t\r\n@return sparse-vector-p; a copy of VECTOR")
    public static SubLObject svector_copy(final SubLObject vector) {
        assert NIL != sparse_vector_p(vector) : "! sparse_vector.sparse_vector_p(vector) " + ("sparse_vector.sparse_vector_p(vector) " + "CommonSymbols.NIL != sparse_vector.sparse_vector_p(vector) ") + vector;
        final SubLObject copy = new_sparse_vector(svector_test(vector), UNPROVIDED);
        final SubLObject cdohash_table = svector_dimensions(vector);
        SubLObject dim = NIL;
        SubLObject value = NIL;
        final Iterator cdohash_iterator = getEntrySetIterator(cdohash_table);
        try {
            while (iteratorHasNext(cdohash_iterator)) {
                final Map.Entry cdohash_entry = iteratorNextEntry(cdohash_iterator);
                dim = getEntryKey(cdohash_entry);
                value = getEntryValue(cdohash_entry);
                svector_set(copy, dim, value);
            } 
        } finally {
            releaseEntrySetIterator(cdohash_iterator);
        }
        return copy;
    }

    /**
     *
     *
     * @param VECTOR
    sparse-vector-p;
     * 		
     * @param DIMENSION
    object;
     * 		
     * @return object; the value of VECTOR at DIMENSION
     */
    @LispMethod(comment = "@param VECTOR\nsparse-vector-p;\r\n\t\t\r\n@param DIMENSION\nobject;\r\n\t\t\r\n@return object; the value of VECTOR at DIMENSION")
    public static final SubLObject svector_get_alt(SubLObject vector, SubLObject dimension) {
        SubLTrampolineFile.checkType(vector, SPARSE_VECTOR_P);
        return gethash(dimension, svector_dimensions(vector), ZERO_INTEGER);
    }

    /**
     *
     *
     * @param VECTOR
    sparse-vector-p;
     * 		
     * @param DIMENSION
    object;
     * 		
     * @return object; the value of VECTOR at DIMENSION
     */
    @LispMethod(comment = "@param VECTOR\nsparse-vector-p;\r\n\t\t\r\n@param DIMENSION\nobject;\r\n\t\t\r\n@return object; the value of VECTOR at DIMENSION")
    public static SubLObject svector_get(final SubLObject vector, final SubLObject dimension) {
        assert NIL != sparse_vector_p(vector) : "! sparse_vector.sparse_vector_p(vector) " + ("sparse_vector.sparse_vector_p(vector) " + "CommonSymbols.NIL != sparse_vector.sparse_vector_p(vector) ") + vector;
        return gethash(dimension, svector_dimensions(vector), ZERO_INTEGER);
    }

    /**
     * Sets the DIMENSIONth dimension of VECTOR to VALUE
     *
     * @param VECTOR
    sparse-vector-p;
     * 		
     * @param DIMENSION
    object
     * 		
     * @param VALUE
    numberp
     * 		
     * @unknown destructively modifies VECTOR
     */
    @LispMethod(comment = "Sets the DIMENSIONth dimension of VECTOR to VALUE\r\n\r\n@param VECTOR\nsparse-vector-p;\r\n\t\t\r\n@param DIMENSION\nobject\r\n\t\t\r\n@param VALUE\nnumberp\r\n\t\t\r\n@unknown destructively modifies VECTOR")
    public static final SubLObject svector_set_alt(SubLObject vector, SubLObject dimension, SubLObject value) {
        SubLTrampolineFile.checkType(vector, SPARSE_VECTOR_P);
        SubLTrampolineFile.checkType(value, NUMBERP);
        if (value.isZero()) {
            remhash(dimension, svector_dimensions(vector));
        } else {
            sethash(dimension, svector_dimensions(vector), value);
        }
        return vector;
    }

    @LispMethod(comment = "Sets the DIMENSIONth dimension of VECTOR to VALUE\r\n\r\n@param VECTOR\n\t\tsparse-vector-p;\r\n\t\t\r\n@param DIMENSION\n\t\tobject\r\n\t\t\r\n@param VALUE\n\t\tnumberp\r\n\t\t\r\n@unknown destructively modifies VECTOR")
    public static SubLObject svector_set(final SubLObject vector, final SubLObject dimension, final SubLObject value) {
        assert NIL != sparse_vector_p(vector) : "! sparse_vector.sparse_vector_p(vector) " + ("sparse_vector.sparse_vector_p(vector) " + "CommonSymbols.NIL != sparse_vector.sparse_vector_p(vector) ") + vector;
        assert NIL != numberp(value) : "! numberp(value) " + ("Types.numberp(value) " + "CommonSymbols.NIL != Types.numberp(value) ") + value;
        if (value.isZero()) {
            remhash(dimension, svector_dimensions(vector));
        } else {
            sethash(dimension, svector_dimensions(vector), value);
        }
        return vector;
    }

    /**
     * Increments VECTOR's DIMENSION by one
     *
     * @param VECTOR
    sparse-vector-p;
     * 		
     * @param DIMENSION
    object
     * 		
     * @unknown destructively modifies VECTOR
     */
    @LispMethod(comment = "Increments VECTOR\'s DIMENSION by one\r\n\r\n@param VECTOR\nsparse-vector-p;\r\n\t\t\r\n@param DIMENSION\nobject\r\n\t\t\r\n@unknown destructively modifies VECTOR")
    public static final SubLObject svector_inc_alt(SubLObject vector, SubLObject dimension) {
        SubLTrampolineFile.checkType(vector, SPARSE_VECTOR_P);
        sethash(dimension, svector_dimensions(vector), add(gethash(dimension, svector_dimensions(vector), ZERO_INTEGER), ONE_INTEGER));
        return vector;
    }

    @LispMethod(comment = "Increments VECTOR\'s DIMENSION by one\r\n\r\n@param VECTOR\n\t\tsparse-vector-p;\r\n\t\t\r\n@param DIMENSION\n\t\tobject\r\n\t\t\r\n@unknown destructively modifies VECTOR")
    public static SubLObject svector_inc(final SubLObject vector, final SubLObject dimension) {
        assert NIL != sparse_vector_p(vector) : "! sparse_vector.sparse_vector_p(vector) " + ("sparse_vector.sparse_vector_p(vector) " + "CommonSymbols.NIL != sparse_vector.sparse_vector_p(vector) ") + vector;
        sethash(dimension, svector_dimensions(vector), add(gethash(dimension, svector_dimensions(vector), ZERO_INTEGER), ONE_INTEGER));
        return vector;
    }

    /**
     * Decrements VECTOR's DIMENSION by one
     *
     * @param VECTOR
    sparse-vector-p;
     * 		
     * @param DIMENSION
    object
     * 		
     * @unknown destructively modifies VECTOR
     */
    @LispMethod(comment = "Decrements VECTOR\'s DIMENSION by one\r\n\r\n@param VECTOR\nsparse-vector-p;\r\n\t\t\r\n@param DIMENSION\nobject\r\n\t\t\r\n@unknown destructively modifies VECTOR")
    public static final SubLObject svector_dec_alt(SubLObject vector, SubLObject dimension) {
        SubLTrampolineFile.checkType(vector, SPARSE_VECTOR_P);
        sethash(dimension, svector_dimensions(vector), subtract(gethash(dimension, svector_dimensions(vector), ZERO_INTEGER), ONE_INTEGER));
        return vector;
    }

    @LispMethod(comment = "Decrements VECTOR\'s DIMENSION by one\r\n\r\n@param VECTOR\n\t\tsparse-vector-p;\r\n\t\t\r\n@param DIMENSION\n\t\tobject\r\n\t\t\r\n@unknown destructively modifies VECTOR")
    public static SubLObject svector_dec(final SubLObject vector, final SubLObject dimension) {
        assert NIL != sparse_vector_p(vector) : "! sparse_vector.sparse_vector_p(vector) " + ("sparse_vector.sparse_vector_p(vector) " + "CommonSymbols.NIL != sparse_vector.sparse_vector_p(vector) ") + vector;
        sethash(dimension, svector_dimensions(vector), subtract(gethash(dimension, svector_dimensions(vector), ZERO_INTEGER), ONE_INTEGER));
        return vector;
    }

    /**
     * Returns the length of VECTOR
     *
     * @param VECTOR
    sparse-vector-p
     * 		
     */
    @LispMethod(comment = "Returns the length of VECTOR\r\n\r\n@param VECTOR\nsparse-vector-p")
    public static final SubLObject svector_length_alt(SubLObject vector) {
        SubLTrampolineFile.checkType(vector, SPARSE_VECTOR_P);
        if (NIL == svector_magnitude(vector)) {
            {
                SubLObject sum = ZERO_INTEGER;
                SubLObject cdohash_table = svector_dimensions(vector);
                SubLObject dimension = NIL;
                SubLObject value = NIL;
                {
                    final Iterator cdohash_iterator = getEntrySetIterator(cdohash_table);
                    try {
                        while (iteratorHasNext(cdohash_iterator)) {
                            final Map.Entry cdohash_entry = iteratorNextEntry(cdohash_iterator);
                            dimension = getEntryKey(cdohash_entry);
                            value = getEntryValue(cdohash_entry);
                            sum = add(sum, number_utilities.square(value));
                        } 
                    } finally {
                        releaseEntrySetIterator(cdohash_iterator);
                    }
                }
                _csetf_svector_magnitude(vector, sqrt(sum));
            }
        }
        return svector_magnitude(vector);
    }

    @LispMethod(comment = "Returns the length of VECTOR\r\n\r\n@param VECTOR\n\t\tsparse-vector-p")
    public static SubLObject svector_length(final SubLObject vector) {
        assert NIL != sparse_vector_p(vector) : "! sparse_vector.sparse_vector_p(vector) " + ("sparse_vector.sparse_vector_p(vector) " + "CommonSymbols.NIL != sparse_vector.sparse_vector_p(vector) ") + vector;
        if (NIL == svector_magnitude(vector)) {
            SubLObject sum = ZERO_INTEGER;
            final SubLObject cdohash_table = svector_dimensions(vector);
            SubLObject dimension = NIL;
            SubLObject value = NIL;
            final Iterator cdohash_iterator = getEntrySetIterator(cdohash_table);
            try {
                while (iteratorHasNext(cdohash_iterator)) {
                    final Map.Entry cdohash_entry = iteratorNextEntry(cdohash_iterator);
                    dimension = getEntryKey(cdohash_entry);
                    value = getEntryValue(cdohash_entry);
                    sum = add(sum, number_utilities.square(value));
                } 
            } finally {
                releaseEntrySetIterator(cdohash_iterator);
            }
            _csetf_svector_magnitude(vector, sqrt(sum));
        }
        return svector_magnitude(vector);
    }

    /**
     * Executes BODY with DIMENSION and VALUE successively bound to each dimension and its
     * value within VECTOR
     */
    @LispMethod(comment = "Executes BODY with DIMENSION and VALUE successively bound to each dimension and its\r\nvalue within VECTOR\nExecutes BODY with DIMENSION and VALUE successively bound to each dimension and its\nvalue within VECTOR")
    public static final SubLObject do_svector_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            destructuring_bind_must_consp(current, datum, $list_alt25);
            {
                SubLObject temp = current.rest();
                current = current.first();
                {
                    SubLObject dimension = NIL;
                    SubLObject value = NIL;
                    SubLObject vector = NIL;
                    destructuring_bind_must_consp(current, datum, $list_alt25);
                    dimension = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt25);
                    value = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt25);
                    vector = current.first();
                    current = current.rest();
                    if (NIL == current) {
                        current = temp;
                        {
                            SubLObject body = current;
                            return listS(CDOHASH, list(dimension, value, list(SVECTOR_DIMENSIONS, vector)), append(body, NIL));
                        }
                    } else {
                        cdestructuring_bind_error(datum, $list_alt25);
                    }
                }
            }
        }
        return NIL;
    }

    @LispMethod(comment = "Executes BODY with DIMENSION and VALUE successively bound to each dimension and its\r\nvalue within VECTOR\nExecutes BODY with DIMENSION and VALUE successively bound to each dimension and its\nvalue within VECTOR")
    public static SubLObject do_svector(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list31);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject dimension = NIL;
        SubLObject value = NIL;
        SubLObject vector = NIL;
        destructuring_bind_must_consp(current, datum, $list31);
        dimension = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list31);
        value = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list31);
        vector = current.first();
        current = current.rest();
        if (NIL == current) {
            final SubLObject body;
            current = body = temp;
            return listS(CDOHASH, list(dimension, value, list(SVECTOR_DIMENSIONS, vector)), append(body, NIL));
        }
        cdestructuring_bind_error(datum, $list31);
        return NIL;
    }

    /**
     *
     *
     * @return boolean; t if VECTOR has a 0 value on every dimension, nil otherwise
     */
    @LispMethod(comment = "@return boolean; t if VECTOR has a 0 value on every dimension, nil otherwise")
    public static final SubLObject zero_svector_p_alt(SubLObject vector) {
        SubLTrampolineFile.checkType(vector, SPARSE_VECTOR_P);
        return zerop(hash_table_count(svector_dimensions(vector)));
    }

    /**
     *
     *
     * @return boolean; t if VECTOR has a 0 value on every dimension, nil otherwise
     */
    @LispMethod(comment = "@return boolean; t if VECTOR has a 0 value on every dimension, nil otherwise")
    public static SubLObject zero_svector_p(final SubLObject vector) {
        assert NIL != sparse_vector_p(vector) : "! sparse_vector.sparse_vector_p(vector) " + ("sparse_vector.sparse_vector_p(vector) " + "CommonSymbols.NIL != sparse_vector.sparse_vector_p(vector) ") + vector;
        return zerop(hash_table_count(svector_dimensions(vector)));
    }

    /**
     *
     *
     * @return numberp; the Euclidean norm of VECTOR
     * @param VECTOR
    sparse-vector-p
     * 		
     */
    @LispMethod(comment = "@return numberp; the Euclidean norm of VECTOR\r\n@param VECTOR\nsparse-vector-p")
    public static final SubLObject svector_euclidean_norm_alt(SubLObject vector) {
        SubLTrampolineFile.checkType(vector, SPARSE_VECTOR_P);
        return svector_length(vector);
    }

    /**
     *
     *
     * @return numberp; the Euclidean norm of VECTOR
     * @param VECTOR
    sparse-vector-p
     * 		
     */
    @LispMethod(comment = "@return numberp; the Euclidean norm of VECTOR\r\n@param VECTOR\nsparse-vector-p")
    public static SubLObject svector_euclidean_norm(final SubLObject vector) {
        assert NIL != sparse_vector_p(vector) : "! sparse_vector.sparse_vector_p(vector) " + ("sparse_vector.sparse_vector_p(vector) " + "CommonSymbols.NIL != sparse_vector.sparse_vector_p(vector) ") + vector;
        return svector_length(vector);
    }

    /**
     *
     *
     * @return numberp; the sum norm of VECTOR
     * @param VECTOR
    sparse-vector-p
     * 		
     */
    @LispMethod(comment = "@return numberp; the sum norm of VECTOR\r\n@param VECTOR\nsparse-vector-p")
    public static final SubLObject svector_sum_norm_alt(SubLObject vector) {
        SubLTrampolineFile.checkType(vector, SPARSE_VECTOR_P);
        {
            SubLObject norm = ZERO_INTEGER;
            SubLObject cdohash_table = svector_dimensions(vector);
            SubLObject dim = NIL;
            SubLObject value = NIL;
            {
                final Iterator cdohash_iterator = getEntrySetIterator(cdohash_table);
                try {
                    while (iteratorHasNext(cdohash_iterator)) {
                        final Map.Entry cdohash_entry = iteratorNextEntry(cdohash_iterator);
                        dim = getEntryKey(cdohash_entry);
                        value = getEntryValue(cdohash_entry);
                        norm = add(norm, value);
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
     * @return numberp; the sum norm of VECTOR
     * @param VECTOR
    sparse-vector-p
     * 		
     */
    @LispMethod(comment = "@return numberp; the sum norm of VECTOR\r\n@param VECTOR\nsparse-vector-p")
    public static SubLObject svector_sum_norm(final SubLObject vector) {
        assert NIL != sparse_vector_p(vector) : "! sparse_vector.sparse_vector_p(vector) " + ("sparse_vector.sparse_vector_p(vector) " + "CommonSymbols.NIL != sparse_vector.sparse_vector_p(vector) ") + vector;
        SubLObject norm = ZERO_INTEGER;
        final SubLObject cdohash_table = svector_dimensions(vector);
        SubLObject dim = NIL;
        SubLObject value = NIL;
        final Iterator cdohash_iterator = getEntrySetIterator(cdohash_table);
        try {
            while (iteratorHasNext(cdohash_iterator)) {
                final Map.Entry cdohash_entry = iteratorNextEntry(cdohash_iterator);
                dim = getEntryKey(cdohash_entry);
                value = getEntryValue(cdohash_entry);
                norm = add(norm, value);
            } 
        } finally {
            releaseEntrySetIterator(cdohash_iterator);
        }
        return norm;
    }

    /**
     *
     *
     * @return numberp; the maximum norm of VECTOR
     * @param VECTOR
    sparse-vector-p
     * 		
     */
    @LispMethod(comment = "@return numberp; the maximum norm of VECTOR\r\n@param VECTOR\nsparse-vector-p")
    public static final SubLObject svector_max_norm_alt(SubLObject vector) {
        SubLTrampolineFile.checkType(vector, SPARSE_VECTOR_P);
        {
            SubLObject max = ZERO_INTEGER;
            SubLObject cdohash_table = svector_dimensions(vector);
            SubLObject dim = NIL;
            SubLObject value = NIL;
            {
                final Iterator cdohash_iterator = getEntrySetIterator(cdohash_table);
                try {
                    while (iteratorHasNext(cdohash_iterator)) {
                        final Map.Entry cdohash_entry = iteratorNextEntry(cdohash_iterator);
                        dim = getEntryKey(cdohash_entry);
                        value = getEntryValue(cdohash_entry);
                        if (value.numG(max)) {
                            max = value;
                        }
                    } 
                } finally {
                    releaseEntrySetIterator(cdohash_iterator);
                }
            }
            return max;
        }
    }

    /**
     *
     *
     * @return numberp; the maximum norm of VECTOR
     * @param VECTOR
    sparse-vector-p
     * 		
     */
    @LispMethod(comment = "@return numberp; the maximum norm of VECTOR\r\n@param VECTOR\nsparse-vector-p")
    public static SubLObject svector_max_norm(final SubLObject vector) {
        assert NIL != sparse_vector_p(vector) : "! sparse_vector.sparse_vector_p(vector) " + ("sparse_vector.sparse_vector_p(vector) " + "CommonSymbols.NIL != sparse_vector.sparse_vector_p(vector) ") + vector;
        SubLObject max = ZERO_INTEGER;
        final SubLObject cdohash_table = svector_dimensions(vector);
        SubLObject dim = NIL;
        SubLObject value = NIL;
        final Iterator cdohash_iterator = getEntrySetIterator(cdohash_table);
        try {
            while (iteratorHasNext(cdohash_iterator)) {
                final Map.Entry cdohash_entry = iteratorNextEntry(cdohash_iterator);
                dim = getEntryKey(cdohash_entry);
                value = getEntryValue(cdohash_entry);
                if (value.numG(max)) {
                    max = value;
                }
            } 
        } finally {
            releaseEntrySetIterator(cdohash_iterator);
        }
        return max;
    }

    /**
     * Adds VECTOR1 to VECTOR2 and returns destructively modified VECTOR2
     *
     * @param VECTOR1
     * 		sparse-vector-p; the vector to add to VECTOR2
     * @param VECTOR2
     * 		sparse-vector-p; the vector to VECTOR1 is added
     * @unknown VECTOR2 is destructively modified
     * @see svector-sum for a nondestructive version of this function
     */
    @LispMethod(comment = "Adds VECTOR1 to VECTOR2 and returns destructively modified VECTOR2\r\n\r\n@param VECTOR1\r\n\t\tsparse-vector-p; the vector to add to VECTOR2\r\n@param VECTOR2\r\n\t\tsparse-vector-p; the vector to VECTOR1 is added\r\n@unknown VECTOR2 is destructively modified\r\n@see svector-sum for a nondestructive version of this function")
    public static final SubLObject svector_add_alt(SubLObject vector2, SubLObject vector1) {
        SubLTrampolineFile.checkType(vector1, SPARSE_VECTOR_P);
        SubLTrampolineFile.checkType(vector2, SPARSE_VECTOR_P);
        {
            SubLObject dimensions2 = svector_dimensions(vector2);
            SubLObject cdohash_table = svector_dimensions(vector1);
            SubLObject dimension = NIL;
            SubLObject value = NIL;
            {
                final Iterator cdohash_iterator = getEntrySetIterator(cdohash_table);
                try {
                    while (iteratorHasNext(cdohash_iterator)) {
                        final Map.Entry cdohash_entry = iteratorNextEntry(cdohash_iterator);
                        dimension = getEntryKey(cdohash_entry);
                        value = getEntryValue(cdohash_entry);
                        sethash(dimension, dimensions2, add(gethash(dimension, dimensions2, ZERO_INTEGER), value));
                    } 
                } finally {
                    releaseEntrySetIterator(cdohash_iterator);
                }
            }
            _csetf_svector_magnitude(vector2, NIL);
            return vector2;
        }
    }

    @LispMethod(comment = "Adds VECTOR1 to VECTOR2 and returns destructively modified VECTOR2\r\n\r\n@param VECTOR1\r\n\t\tsparse-vector-p; the vector to add to VECTOR2\r\n@param VECTOR2\r\n\t\tsparse-vector-p; the vector to VECTOR1 is added\r\n@unknown VECTOR2 is destructively modified\r\n@see svector-sum for a nondestructive version of this function")
    public static SubLObject svector_add(final SubLObject vector2, final SubLObject vector1) {
        assert NIL != sparse_vector_p(vector1) : "! sparse_vector.sparse_vector_p(vector1) " + ("sparse_vector.sparse_vector_p(vector1) " + "CommonSymbols.NIL != sparse_vector.sparse_vector_p(vector1) ") + vector1;
        assert NIL != sparse_vector_p(vector2) : "! sparse_vector.sparse_vector_p(vector2) " + ("sparse_vector.sparse_vector_p(vector2) " + "CommonSymbols.NIL != sparse_vector.sparse_vector_p(vector2) ") + vector2;
        final SubLObject dimensions2 = svector_dimensions(vector2);
        final SubLObject cdohash_table = svector_dimensions(vector1);
        SubLObject dimension = NIL;
        SubLObject value = NIL;
        final Iterator cdohash_iterator = getEntrySetIterator(cdohash_table);
        try {
            while (iteratorHasNext(cdohash_iterator)) {
                final Map.Entry cdohash_entry = iteratorNextEntry(cdohash_iterator);
                dimension = getEntryKey(cdohash_entry);
                value = getEntryValue(cdohash_entry);
                sethash(dimension, dimensions2, add(gethash(dimension, dimensions2, ZERO_INTEGER), value));
            } 
        } finally {
            releaseEntrySetIterator(cdohash_iterator);
        }
        _csetf_svector_magnitude(vector2, NIL);
        return vector2;
    }

    /**
     * Returns a new vector which is the sum of VECTOR1 and VECTOR2
     *
     * @param VECTOR1
    vector-p
     * 		
     * @param VECTOR2
    vector-p
     * 		
     * @see vector-add for a destructive version of this function
     */
    @LispMethod(comment = "Returns a new vector which is the sum of VECTOR1 and VECTOR2\r\n\r\n@param VECTOR1\nvector-p\r\n\t\t\r\n@param VECTOR2\nvector-p\r\n\t\t\r\n@see vector-add for a destructive version of this function")
    public static final SubLObject svector_sum_alt(SubLObject vector1, SubLObject vector2) {
        SubLTrampolineFile.checkType(vector1, SPARSE_VECTOR_P);
        SubLTrampolineFile.checkType(vector2, SPARSE_VECTOR_P);
        {
            SubLObject sum_vector = new_sparse_vector(UNPROVIDED, UNPROVIDED);
            svector_add(vector1, sum_vector);
            svector_add(vector2, sum_vector);
            return sum_vector;
        }
    }

    @LispMethod(comment = "Returns a new vector which is the sum of VECTOR1 and VECTOR2\r\n\r\n@param VECTOR1\n\t\tvector-p\r\n\t\t\r\n@param VECTOR2\n\t\tvector-p\r\n\t\t\r\n@see vector-add for a destructive version of this function")
    public static SubLObject svector_sum(final SubLObject vector1, final SubLObject vector2) {
        assert NIL != sparse_vector_p(vector1) : "! sparse_vector.sparse_vector_p(vector1) " + ("sparse_vector.sparse_vector_p(vector1) " + "CommonSymbols.NIL != sparse_vector.sparse_vector_p(vector1) ") + vector1;
        assert NIL != sparse_vector_p(vector2) : "! sparse_vector.sparse_vector_p(vector2) " + ("sparse_vector.sparse_vector_p(vector2) " + "CommonSymbols.NIL != sparse_vector.sparse_vector_p(vector2) ") + vector2;
        final SubLObject sum_vector = new_sparse_vector(UNPROVIDED, UNPROVIDED);
        svector_add(vector1, sum_vector);
        svector_add(vector2, sum_vector);
        return sum_vector;
    }

    /**
     *
     *
     * @return numberp; the dot product of VECTOR1 and VECTOR2
     */
    @LispMethod(comment = "@return numberp; the dot product of VECTOR1 and VECTOR2")
    public static final SubLObject svector_scalar_product_alt(SubLObject vector1, SubLObject vector2) {
        SubLTrampolineFile.checkType(vector1, SPARSE_VECTOR_P);
        SubLTrampolineFile.checkType(vector2, SPARSE_VECTOR_P);
        {
            SubLObject dot_product = ZERO_INTEGER;
            SubLObject dimensions2 = svector_dimensions(vector2);
            SubLObject cdohash_table = svector_dimensions(vector1);
            SubLObject dimension = NIL;
            SubLObject value = NIL;
            {
                final Iterator cdohash_iterator = getEntrySetIterator(cdohash_table);
                try {
                    while (iteratorHasNext(cdohash_iterator)) {
                        final Map.Entry cdohash_entry = iteratorNextEntry(cdohash_iterator);
                        dimension = getEntryKey(cdohash_entry);
                        value = getEntryValue(cdohash_entry);
                        dot_product = add(dot_product, multiply(value, gethash(dimension, dimensions2, ZERO_INTEGER)));
                    } 
                } finally {
                    releaseEntrySetIterator(cdohash_iterator);
                }
            }
            return dot_product;
        }
    }

    /**
     *
     *
     * @return numberp; the dot product of VECTOR1 and VECTOR2
     */
    @LispMethod(comment = "@return numberp; the dot product of VECTOR1 and VECTOR2")
    public static SubLObject svector_scalar_product(final SubLObject vector1, final SubLObject vector2) {
        assert NIL != sparse_vector_p(vector1) : "! sparse_vector.sparse_vector_p(vector1) " + ("sparse_vector.sparse_vector_p(vector1) " + "CommonSymbols.NIL != sparse_vector.sparse_vector_p(vector1) ") + vector1;
        assert NIL != sparse_vector_p(vector2) : "! sparse_vector.sparse_vector_p(vector2) " + ("sparse_vector.sparse_vector_p(vector2) " + "CommonSymbols.NIL != sparse_vector.sparse_vector_p(vector2) ") + vector2;
        SubLObject dot_product = ZERO_INTEGER;
        final SubLObject dimensions2 = svector_dimensions(vector2);
        final SubLObject cdohash_table = svector_dimensions(vector1);
        SubLObject dimension = NIL;
        SubLObject value = NIL;
        final Iterator cdohash_iterator = getEntrySetIterator(cdohash_table);
        try {
            while (iteratorHasNext(cdohash_iterator)) {
                final Map.Entry cdohash_entry = iteratorNextEntry(cdohash_iterator);
                dimension = getEntryKey(cdohash_entry);
                value = getEntryValue(cdohash_entry);
                dot_product = add(dot_product, multiply(value, gethash(dimension, dimensions2, ZERO_INTEGER)));
            } 
        } finally {
            releaseEntrySetIterator(cdohash_iterator);
        }
        return dot_product;
    }

    /**
     * Scales the length of VECTOR by FACTOR and returns it
     *
     * @param VECTOR
    sparse-vector-p
     * 		
     * @param FACTOR
    numberp
     * 		
     * @unknown VECTOR is destructively modified
     */
    @LispMethod(comment = "Scales the length of VECTOR by FACTOR and returns it\r\n\r\n@param VECTOR\nsparse-vector-p\r\n\t\t\r\n@param FACTOR\nnumberp\r\n\t\t\r\n@unknown VECTOR is destructively modified")
    public static final SubLObject svector_scale_alt(SubLObject vector, SubLObject factor) {
        SubLTrampolineFile.checkType(vector, SPARSE_VECTOR_P);
        SubLTrampolineFile.checkType(factor, NUMBERP);
        _csetf_svector_magnitude(vector, NIL);
        {
            SubLObject cdohash_table = svector_dimensions(vector);
            SubLObject dimension = NIL;
            SubLObject value = NIL;
            {
                final Iterator cdohash_iterator = getEntrySetIterator(cdohash_table);
                try {
                    while (iteratorHasNext(cdohash_iterator)) {
                        final Map.Entry cdohash_entry = iteratorNextEntry(cdohash_iterator);
                        dimension = getEntryKey(cdohash_entry);
                        value = getEntryValue(cdohash_entry);
                        svector_set(vector, dimension, multiply(value, factor));
                    } 
                } finally {
                    releaseEntrySetIterator(cdohash_iterator);
                }
            }
        }
        return vector;
    }

    /**
     * Scales the length of VECTOR by FACTOR and returns it
     *
     * @param VECTOR
    		sparse-vector-p
     * 		
     * @param FACTOR
    		numberp
     * 		
     * @unknown VECTOR is destructively modified
     */
    @LispMethod(comment = "Scales the length of VECTOR by FACTOR and returns it\r\n\r\n@param VECTOR\n\t\tsparse-vector-p\r\n\t\t\r\n@param FACTOR\n\t\tnumberp\r\n\t\t\r\n@unknown VECTOR is destructively modified")
    public static SubLObject svector_scale(final SubLObject vector, final SubLObject factor) {
        assert NIL != sparse_vector_p(vector) : "! sparse_vector.sparse_vector_p(vector) " + ("sparse_vector.sparse_vector_p(vector) " + "CommonSymbols.NIL != sparse_vector.sparse_vector_p(vector) ") + vector;
        assert NIL != numberp(factor) : "! numberp(factor) " + ("Types.numberp(factor) " + "CommonSymbols.NIL != Types.numberp(factor) ") + factor;
        _csetf_svector_magnitude(vector, NIL);
        final SubLObject cdohash_table = svector_dimensions(vector);
        SubLObject dimension = NIL;
        SubLObject value = NIL;
        final Iterator cdohash_iterator = getEntrySetIterator(cdohash_table);
        try {
            while (iteratorHasNext(cdohash_iterator)) {
                final Map.Entry cdohash_entry = iteratorNextEntry(cdohash_iterator);
                dimension = getEntryKey(cdohash_entry);
                value = getEntryValue(cdohash_entry);
                svector_set(vector, dimension, multiply(value, factor));
            } 
        } finally {
            releaseEntrySetIterator(cdohash_iterator);
        }
        return vector;
    }

    /**
     * Normalizes VECTOR to a length of 1
     *
     * @param VECTOR
    sparse-vector-p
     * 		
     * @return sparse-vector-p; VECTOR normalized to a length of (about) 1
     * @exception division
     * 		by zero if VECTOR can not be scaled to a length of 1
     * @unknown due to rounding errors, it is likely that the length will not be precisely 1
     */
    @LispMethod(comment = "Normalizes VECTOR to a length of 1\r\n\r\n@param VECTOR\nsparse-vector-p\r\n\t\t\r\n@return sparse-vector-p; VECTOR normalized to a length of (about) 1\r\n@exception division\r\n\t\tby zero if VECTOR can not be scaled to a length of 1\r\n@unknown due to rounding errors, it is likely that the length will not be precisely 1")
    public static final SubLObject svector_normalize_alt(SubLObject vector) {
        SubLTrampolineFile.checkType(vector, SPARSE_VECTOR_P);
        {
            SubLObject length = svector_length(vector);
            if (!length.isZero()) {
                return svector_scale(vector, divide(ONE_INTEGER, length));
            }
        }
        return NIL;
    }

    @LispMethod(comment = "Normalizes VECTOR to a length of 1\r\n\r\n@param VECTOR\n\t\tsparse-vector-p\r\n\t\t\r\n@return sparse-vector-p; VECTOR normalized to a length of (about) 1\r\n@exception division\r\n\t\tby zero if VECTOR can not be scaled to a length of 1\r\n@unknown due to rounding errors, it is likely that the length will not be precisely 1")
    public static SubLObject svector_normalize(final SubLObject vector) {
        assert NIL != sparse_vector_p(vector) : "! sparse_vector.sparse_vector_p(vector) " + ("sparse_vector.sparse_vector_p(vector) " + "CommonSymbols.NIL != sparse_vector.sparse_vector_p(vector) ") + vector;
        final SubLObject length = svector_length(vector);
        if (!length.isZero()) {
            return svector_scale(vector, divide(ONE_INTEGER, length));
        }
        return NIL;
    }

    /**
     *
     *
     * @param VECTOR
    sparse-vector-p;
     * 		
     * @unknown boolean; t if VECTOR is normalize, nil otherwise
     */
    @LispMethod(comment = "@param VECTOR\nsparse-vector-p;\r\n\t\t\r\n@unknown boolean; t if VECTOR is normalize, nil otherwise")
    public static final SubLObject svector_normalizedP_alt(SubLObject vector) {
        SubLTrampolineFile.checkType(vector, SPARSE_VECTOR_P);
        return numE(svector_length(vector), ONE_INTEGER);
    }

    /**
     *
     *
     * @param VECTOR
    sparse-vector-p;
     * 		
     * @unknown boolean; t if VECTOR is normalize, nil otherwise
     */
    @LispMethod(comment = "@param VECTOR\nsparse-vector-p;\r\n\t\t\r\n@unknown boolean; t if VECTOR is normalize, nil otherwise")
    public static SubLObject svector_normalizedP(final SubLObject vector) {
        assert NIL != sparse_vector_p(vector) : "! sparse_vector.sparse_vector_p(vector) " + ("sparse_vector.sparse_vector_p(vector) " + "CommonSymbols.NIL != sparse_vector.sparse_vector_p(vector) ") + vector;
        return numE(svector_length(vector), ONE_INTEGER);
    }

    /**
     *
     *
     * @return numberp; the Euklidian distance between the tips of VECTOR1 and VECTOR2
     * @param VECTOR1
    sparse-vector-p
     * 		
     * @param VECTOR2
    sparse-vector-p
     * 		
     */
    @LispMethod(comment = "@return numberp; the Euklidian distance between the tips of VECTOR1 and VECTOR2\r\n@param VECTOR1\nsparse-vector-p\r\n\t\t\r\n@param VECTOR2\nsparse-vector-p")
    public static final SubLObject svector_distance_alt(SubLObject vector1, SubLObject vector2) {
        SubLTrampolineFile.checkType(vector1, SPARSE_VECTOR_P);
        SubLTrampolineFile.checkType(vector2, SPARSE_VECTOR_P);
        {
            SubLObject sum = ZERO_INTEGER;
            SubLObject dimensions2 = svector_dimensions(vector2);
            SubLObject cdohash_table = svector_dimensions(vector1);
            SubLObject dimension = NIL;
            SubLObject value = NIL;
            {
                final Iterator cdohash_iterator = getEntrySetIterator(cdohash_table);
                try {
                    while (iteratorHasNext(cdohash_iterator)) {
                        final Map.Entry cdohash_entry = iteratorNextEntry(cdohash_iterator);
                        dimension = getEntryKey(cdohash_entry);
                        value = getEntryValue(cdohash_entry);
                        sum = add(sum, number_utilities.square(subtract(value, gethash(dimension, dimensions2, ZERO_INTEGER))));
                    } 
                } finally {
                    releaseEntrySetIterator(cdohash_iterator);
                }
            }
            return sqrt(sum);
        }
    }

    /**
     *
     *
     * @return numberp; the Euklidian distance between the tips of VECTOR1 and VECTOR2
     * @param VECTOR1
    sparse-vector-p
     * 		
     * @param VECTOR2
    sparse-vector-p
     * 		
     */
    @LispMethod(comment = "@return numberp; the Euklidian distance between the tips of VECTOR1 and VECTOR2\r\n@param VECTOR1\nsparse-vector-p\r\n\t\t\r\n@param VECTOR2\nsparse-vector-p")
    public static SubLObject svector_distance(final SubLObject vector1, final SubLObject vector2) {
        assert NIL != sparse_vector_p(vector1) : "! sparse_vector.sparse_vector_p(vector1) " + ("sparse_vector.sparse_vector_p(vector1) " + "CommonSymbols.NIL != sparse_vector.sparse_vector_p(vector1) ") + vector1;
        assert NIL != sparse_vector_p(vector2) : "! sparse_vector.sparse_vector_p(vector2) " + ("sparse_vector.sparse_vector_p(vector2) " + "CommonSymbols.NIL != sparse_vector.sparse_vector_p(vector2) ") + vector2;
        SubLObject sum = ZERO_INTEGER;
        final SubLObject dimensions2 = svector_dimensions(vector2);
        final SubLObject cdohash_table = svector_dimensions(vector1);
        SubLObject dimension = NIL;
        SubLObject value = NIL;
        final Iterator cdohash_iterator = getEntrySetIterator(cdohash_table);
        try {
            while (iteratorHasNext(cdohash_iterator)) {
                final Map.Entry cdohash_entry = iteratorNextEntry(cdohash_iterator);
                dimension = getEntryKey(cdohash_entry);
                value = getEntryValue(cdohash_entry);
                sum = add(sum, number_utilities.square(subtract(value, gethash(dimension, dimensions2, ZERO_INTEGER))));
            } 
        } finally {
            releaseEntrySetIterator(cdohash_iterator);
        }
        return sqrt(sum);
    }

    /**
     *
     *
     * @param VECTORS
     * 		listp; a list of vectors
     * @return sparse-vector-p; the centroid of VECTORS
     */
    @LispMethod(comment = "@param VECTORS\r\n\t\tlistp; a list of vectors\r\n@return sparse-vector-p; the centroid of VECTORS")
    public static final SubLObject svector_centroid_alt(SubLObject vectors) {
        SubLTrampolineFile.checkType(vectors, NON_EMPTY_LIST_P);
        {
            SubLObject test = svector_test(vectors.first());
            SubLObject centroid = new_sparse_vector(test, UNPROVIDED);
            SubLObject cdolist_list_var = vectors;
            SubLObject vector = NIL;
            for (vector = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , vector = cdolist_list_var.first()) {
                if (!((NIL != sparse_vector_p(vector)) && svector_test(vector).eql(test))) {
                    Errors.error($str_alt28$_a_is_not_a_sparse_vector_with_te, vector, test);
                }
                svector_add(centroid, vector);
            }
            return svector_scale(centroid, divide(ONE_INTEGER, length(vectors)));
        }
    }

    /**
     *
     *
     * @param VECTORS
     * 		listp; a list of vectors
     * @return sparse-vector-p; the centroid of VECTORS
     */
    @LispMethod(comment = "@param VECTORS\r\n\t\tlistp; a list of vectors\r\n@return sparse-vector-p; the centroid of VECTORS")
    public static SubLObject svector_centroid(final SubLObject vectors) {
        assert NIL != list_utilities.non_empty_list_p(vectors) : "! list_utilities.non_empty_list_p(vectors) " + ("list_utilities.non_empty_list_p(vectors) " + "CommonSymbols.NIL != list_utilities.non_empty_list_p(vectors) ") + vectors;
        final SubLObject test = svector_test(vectors.first());
        final SubLObject centroid = new_sparse_vector(test, UNPROVIDED);
        SubLObject cdolist_list_var = vectors;
        SubLObject vector = NIL;
        vector = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if ((NIL == sparse_vector_p(vector)) || (!svector_test(vector).eql(test))) {
                Errors.error($str34$_a_is_not_a_sparse_vector_with_te, vector, test);
            }
            svector_add(centroid, vector);
            cdolist_list_var = cdolist_list_var.rest();
            vector = cdolist_list_var.first();
        } 
        return svector_scale(centroid, divide(ONE_INTEGER, length(vectors)));
    }

    /**
     *
     *
     * @param VECTOR1
    sparse-vector-p
     * 		
     * @param VECTOR2
    sparse-vector-p
     * 		
     * @return numberp; the matching coefficient of VECTOR1 and VECTOR2
     */
    @LispMethod(comment = "@param VECTOR1\nsparse-vector-p\r\n\t\t\r\n@param VECTOR2\nsparse-vector-p\r\n\t\t\r\n@return numberp; the matching coefficient of VECTOR1 and VECTOR2")
    public static final SubLObject svector_matching_coefficient_alt(SubLObject vector1, SubLObject vector2) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            SubLTrampolineFile.checkType(vector1, SPARSE_VECTOR_P);
            SubLTrampolineFile.checkType(vector2, SPARSE_VECTOR_P);
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                if (!svector_test(vector1).eql(svector_test(vector2))) {
                    Errors.error($str_alt29$Non_matching_vector_tests__a_and_, svector_test(vector1), svector_test(vector2));
                }
            }
            {
                SubLObject intersection = set.new_set(svector_test(vector1), $int$64);
                SubLObject cdohash_table = svector_dimensions(vector1);
                SubLObject dimension = NIL;
                SubLObject value = NIL;
                {
                    final Iterator cdohash_iterator = getEntrySetIterator(cdohash_table);
                    try {
                        while (iteratorHasNext(cdohash_iterator)) {
                            final Map.Entry cdohash_entry = iteratorNextEntry(cdohash_iterator);
                            dimension = getEntryKey(cdohash_entry);
                            value = getEntryValue(cdohash_entry);
                            if (!svector_get(vector2, dimension).isZero()) {
                                set.set_add(dimension, intersection);
                            }
                        } 
                    } finally {
                        releaseEntrySetIterator(cdohash_iterator);
                    }
                }
                return set.set_size(intersection);
            }
        }
    }

    /**
     *
     *
     * @param VECTOR1
    sparse-vector-p
     * 		
     * @param VECTOR2
    sparse-vector-p
     * 		
     * @return numberp; the matching coefficient of VECTOR1 and VECTOR2
     */
    @LispMethod(comment = "@param VECTOR1\nsparse-vector-p\r\n\t\t\r\n@param VECTOR2\nsparse-vector-p\r\n\t\t\r\n@return numberp; the matching coefficient of VECTOR1 and VECTOR2")
    public static SubLObject svector_matching_coefficient(final SubLObject vector1, final SubLObject vector2) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != sparse_vector_p(vector1) : "! sparse_vector.sparse_vector_p(vector1) " + ("sparse_vector.sparse_vector_p(vector1) " + "CommonSymbols.NIL != sparse_vector.sparse_vector_p(vector1) ") + vector1;
        assert NIL != sparse_vector_p(vector2) : "! sparse_vector.sparse_vector_p(vector2) " + ("sparse_vector.sparse_vector_p(vector2) " + "CommonSymbols.NIL != sparse_vector.sparse_vector_p(vector2) ") + vector2;
        if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (!svector_test(vector1).eql(svector_test(vector2)))) {
            Errors.error($str35$Non_matching_vector_tests__a_and_, svector_test(vector1), svector_test(vector2));
        }
        final SubLObject intersection = set.new_set(svector_test(vector1), $int$64);
        final SubLObject cdohash_table = svector_dimensions(vector1);
        SubLObject dimension = NIL;
        SubLObject value = NIL;
        final Iterator cdohash_iterator = getEntrySetIterator(cdohash_table);
        try {
            while (iteratorHasNext(cdohash_iterator)) {
                final Map.Entry cdohash_entry = iteratorNextEntry(cdohash_iterator);
                dimension = getEntryKey(cdohash_entry);
                value = getEntryValue(cdohash_entry);
                if (!svector_get(vector2, dimension).isZero()) {
                    set.set_add(dimension, intersection);
                }
            } 
        } finally {
            releaseEntrySetIterator(cdohash_iterator);
        }
        return set.set_size(intersection);
    }

    /**
     *
     *
     * @return numberp; the cosine of the angle between VECTOR1 and VECTOR2
     * @param VECTOR1
    sparse-vector-p
     * 		
     * @param VECTOR2
    sparse-vector-p
     * 		
     */
    @LispMethod(comment = "@return numberp; the cosine of the angle between VECTOR1 and VECTOR2\r\n@param VECTOR1\nsparse-vector-p\r\n\t\t\r\n@param VECTOR2\nsparse-vector-p")
    public static final SubLObject svector_cosine_angle_alt(SubLObject vector1, SubLObject vector2) {
        SubLTrampolineFile.checkType(vector1, SPARSE_VECTOR_P);
        SubLTrampolineFile.checkType(vector2, SPARSE_VECTOR_P);
        return divide(svector_scalar_product(vector1, vector2), multiply(svector_length(vector1), svector_length(vector2)));
    }

    /**
     *
     *
     * @return numberp; the cosine of the angle between VECTOR1 and VECTOR2
     * @param VECTOR1
    sparse-vector-p
     * 		
     * @param VECTOR2
    sparse-vector-p
     * 		
     */
    @LispMethod(comment = "@return numberp; the cosine of the angle between VECTOR1 and VECTOR2\r\n@param VECTOR1\nsparse-vector-p\r\n\t\t\r\n@param VECTOR2\nsparse-vector-p")
    public static SubLObject svector_cosine_angle(final SubLObject vector1, final SubLObject vector2) {
        assert NIL != sparse_vector_p(vector1) : "! sparse_vector.sparse_vector_p(vector1) " + ("sparse_vector.sparse_vector_p(vector1) " + "CommonSymbols.NIL != sparse_vector.sparse_vector_p(vector1) ") + vector1;
        assert NIL != sparse_vector_p(vector2) : "! sparse_vector.sparse_vector_p(vector2) " + ("sparse_vector.sparse_vector_p(vector2) " + "CommonSymbols.NIL != sparse_vector.sparse_vector_p(vector2) ") + vector2;
        return divide(svector_scalar_product(vector1, vector2), multiply(svector_length(vector1), svector_length(vector2)));
    }

    /**
     *
     *
     * @param VECTOR1
    sparse-vector-p
     * 		
     * @param VECTOR2
    sparse-vector-p
     * 		
     * @return numberp; the overlap coefficient of VECTOR1 and VECTOR2
     */
    @LispMethod(comment = "@param VECTOR1\nsparse-vector-p\r\n\t\t\r\n@param VECTOR2\nsparse-vector-p\r\n\t\t\r\n@return numberp; the overlap coefficient of VECTOR1 and VECTOR2")
    public static final SubLObject svector_overlap_coefficient_alt(SubLObject vector1, SubLObject vector2) {
        SubLTrampolineFile.checkType(vector1, SPARSE_VECTOR_P);
        SubLTrampolineFile.checkType(vector2, SPARSE_VECTOR_P);
        return divide(svector_matching_coefficient(vector1, vector2), min(hash_table_count(svector_dimensions(vector1)), hash_table_count(svector_dimensions(vector2))));
    }

    /**
     *
     *
     * @param VECTOR1
    sparse-vector-p
     * 		
     * @param VECTOR2
    sparse-vector-p
     * 		
     * @return numberp; the overlap coefficient of VECTOR1 and VECTOR2
     */
    @LispMethod(comment = "@param VECTOR1\nsparse-vector-p\r\n\t\t\r\n@param VECTOR2\nsparse-vector-p\r\n\t\t\r\n@return numberp; the overlap coefficient of VECTOR1 and VECTOR2")
    public static SubLObject svector_overlap_coefficient(final SubLObject vector1, final SubLObject vector2) {
        assert NIL != sparse_vector_p(vector1) : "! sparse_vector.sparse_vector_p(vector1) " + ("sparse_vector.sparse_vector_p(vector1) " + "CommonSymbols.NIL != sparse_vector.sparse_vector_p(vector1) ") + vector1;
        assert NIL != sparse_vector_p(vector2) : "! sparse_vector.sparse_vector_p(vector2) " + ("sparse_vector.sparse_vector_p(vector2) " + "CommonSymbols.NIL != sparse_vector.sparse_vector_p(vector2) ") + vector2;
        return divide(svector_matching_coefficient(vector1, vector2), min(hash_table_count(svector_dimensions(vector1)), hash_table_count(svector_dimensions(vector2))));
    }

    public static final SubLObject cfasl_output_object_sparse_vector_method_alt(SubLObject v_object, SubLObject stream) {
        return cfasl_output_sparse_vector(v_object, stream);
    }

    public static SubLObject cfasl_output_object_sparse_vector_method(final SubLObject v_object, final SubLObject stream) {
        return cfasl_output_sparse_vector(v_object, stream);
    }

    public static final SubLObject cfasl_output_sparse_vector_alt(SubLObject svector, SubLObject stream) {
        cfasl_raw_write_byte($cfasl_opcode_sparse_vector$.getGlobalValue(), stream);
        cfasl_output(svector_dimensions(svector), stream);
        return svector;
    }

    public static SubLObject cfasl_output_sparse_vector(final SubLObject svector, final SubLObject stream) {
        cfasl_raw_write_byte($cfasl_opcode_sparse_vector$.getGlobalValue(), stream);
        cfasl_output(svector_dimensions(svector), stream);
        return svector;
    }

    public static final SubLObject cfasl_input_sparse_vector_alt(SubLObject stream) {
        {
            SubLObject svector = make_sparse_vector(UNPROVIDED);
            _csetf_svector_dimensions(svector, cfasl_input_object(stream));
            return svector;
        }
    }

    public static SubLObject cfasl_input_sparse_vector(final SubLObject stream) {
        final SubLObject svector = make_sparse_vector(UNPROVIDED);
        _csetf_svector_dimensions(svector, cfasl_input_object(stream));
        return svector;
    }

    public static SubLObject declare_sparse_vector_file() {
        declareFunction("sparse_vector_print_function_trampoline", "SPARSE-VECTOR-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        declareFunction("sparse_vector_p", "SPARSE-VECTOR-P", 1, 0, false);
        new sparse_vector.$sparse_vector_p$UnaryFunction();
        declareFunction("svector_magnitude", "SVECTOR-MAGNITUDE", 1, 0, false);
        declareFunction("svector_dimensions", "SVECTOR-DIMENSIONS", 1, 0, false);
        declareFunction("_csetf_svector_magnitude", "_CSETF-SVECTOR-MAGNITUDE", 2, 0, false);
        declareFunction("_csetf_svector_dimensions", "_CSETF-SVECTOR-DIMENSIONS", 2, 0, false);
        declareFunction("make_sparse_vector", "MAKE-SPARSE-VECTOR", 0, 1, false);
        declareFunction("visit_defstruct_sparse_vector", "VISIT-DEFSTRUCT-SPARSE-VECTOR", 2, 0, false);
        declareFunction("visit_defstruct_object_sparse_vector_method", "VISIT-DEFSTRUCT-OBJECT-SPARSE-VECTOR-METHOD", 2, 0, false);
        declareFunction("new_sparse_vector", "NEW-SPARSE-VECTOR", 0, 2, false);
        declareFunction("svector_print", "SVECTOR-PRINT", 3, 0, false);
        declareFunction("svector_test", "SVECTOR-TEST", 1, 0, false);
        declareFunction("svector_cardinality", "SVECTOR-CARDINALITY", 1, 0, false);
        declareFunction("svector_copy", "SVECTOR-COPY", 1, 0, false);
        declareFunction("svector_get", "SVECTOR-GET", 2, 0, false);
        declareFunction("svector_set", "SVECTOR-SET", 3, 0, false);
        declareFunction("svector_inc", "SVECTOR-INC", 2, 0, false);
        declareFunction("svector_dec", "SVECTOR-DEC", 2, 0, false);
        declareFunction("svector_length", "SVECTOR-LENGTH", 1, 0, false);
        declareMacro("do_svector", "DO-SVECTOR");
        declareFunction("zero_svector_p", "ZERO-SVECTOR-P", 1, 0, false);
        declareFunction("svector_euclidean_norm", "SVECTOR-EUCLIDEAN-NORM", 1, 0, false);
        declareFunction("svector_sum_norm", "SVECTOR-SUM-NORM", 1, 0, false);
        declareFunction("svector_max_norm", "SVECTOR-MAX-NORM", 1, 0, false);
        declareFunction("svector_add", "SVECTOR-ADD", 2, 0, false);
        declareFunction("svector_sum", "SVECTOR-SUM", 2, 0, false);
        declareFunction("svector_scalar_product", "SVECTOR-SCALAR-PRODUCT", 2, 0, false);
        declareFunction("svector_scale", "SVECTOR-SCALE", 2, 0, false);
        declareFunction("svector_normalize", "SVECTOR-NORMALIZE", 1, 0, false);
        declareFunction("svector_normalizedP", "SVECTOR-NORMALIZED?", 1, 0, false);
        declareFunction("svector_distance", "SVECTOR-DISTANCE", 2, 0, false);
        declareFunction("svector_centroid", "SVECTOR-CENTROID", 1, 0, false);
        declareFunction("svector_matching_coefficient", "SVECTOR-MATCHING-COEFFICIENT", 2, 0, false);
        declareFunction("svector_cosine_angle", "SVECTOR-COSINE-ANGLE", 2, 0, false);
        declareFunction("svector_overlap_coefficient", "SVECTOR-OVERLAP-COEFFICIENT", 2, 0, false);
        declareFunction("cfasl_output_object_sparse_vector_method", "CFASL-OUTPUT-OBJECT-SPARSE-VECTOR-METHOD", 2, 0, false);
        declareFunction("cfasl_output_sparse_vector", "CFASL-OUTPUT-SPARSE-VECTOR", 2, 0, false);
        declareFunction("cfasl_input_sparse_vector", "CFASL-INPUT-SPARSE-VECTOR", 1, 0, false);
        return NIL;
    }

    public static SubLObject init_sparse_vector_file() {
        defconstant("*DTP-SPARSE-VECTOR*", SPARSE_VECTOR);
        defconstant("*CFASL-OPCODE-SPARSE-VECTOR*", $int$65);
        return NIL;
    }

    public static SubLObject setup_sparse_vector_file() {
        register_method($print_object_method_table$.getGlobalValue(), $dtp_sparse_vector$.getGlobalValue(), symbol_function(SPARSE_VECTOR_PRINT_FUNCTION_TRAMPOLINE));
        SubLSpecialOperatorDeclarations.proclaim($list8);
        def_csetf(SVECTOR_MAGNITUDE, _CSETF_SVECTOR_MAGNITUDE);
        def_csetf(SVECTOR_DIMENSIONS, _CSETF_SVECTOR_DIMENSIONS);
        identity(SPARSE_VECTOR);
        register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $dtp_sparse_vector$.getGlobalValue(), symbol_function(VISIT_DEFSTRUCT_OBJECT_SPARSE_VECTOR_METHOD));
        register_cfasl_input_function($cfasl_opcode_sparse_vector$.getGlobalValue(), CFASL_INPUT_SPARSE_VECTOR);
        register_method($cfasl_output_object_method_table$.getGlobalValue(), $dtp_sparse_vector$.getGlobalValue(), symbol_function(CFASL_OUTPUT_OBJECT_SPARSE_VECTOR_METHOD));
        return NIL;
    }

    @Override
    public void declareFunctions() {
        declare_sparse_vector_file();
    }

    @Override
    public void initializeVariables() {
        init_sparse_vector_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_sparse_vector_file();
    }

    static {
    }

    public static final class $sparse_vector_native extends SubLStructNative {
        public SubLObject $magnitude;

        public SubLObject $dimensions;

        private static final SubLStructDeclNative structDecl;

        public $sparse_vector_native() {
            sparse_vector.$sparse_vector_native.this.$magnitude = Lisp.NIL;
            sparse_vector.$sparse_vector_native.this.$dimensions = Lisp.NIL;
        }

        @Override
        public SubLStructDecl getStructDecl() {
            return structDecl;
        }

        @Override
        public SubLObject getField2() {
            return sparse_vector.$sparse_vector_native.this.$magnitude;
        }

        @Override
        public SubLObject getField3() {
            return sparse_vector.$sparse_vector_native.this.$dimensions;
        }

        @Override
        public SubLObject setField2(final SubLObject value) {
            return sparse_vector.$sparse_vector_native.this.$magnitude = value;
        }

        @Override
        public SubLObject setField3(final SubLObject value) {
            return sparse_vector.$sparse_vector_native.this.$dimensions = value;
        }

        static {
            structDecl = makeStructDeclNative(com.cyc.cycjava.cycl.sparse_vector.$sparse_vector_native.class, SPARSE_VECTOR, SPARSE_VECTOR_P, $list2, $list3, new String[]{ "$magnitude", "$dimensions" }, $list4, $list5, SVECTOR_PRINT);
        }
    }

    static private final SubLList $list_alt2 = list(makeSymbol("MAGNITUDE"), makeSymbol("DIMENSIONS"));

    static private final SubLList $list_alt3 = list(makeKeyword("MAGNITUDE"), makeKeyword("DIMENSIONS"));

    static private final SubLList $list_alt4 = list(makeSymbol("SVECTOR-MAGNITUDE"), makeSymbol("SVECTOR-DIMENSIONS"));

    static private final SubLList $list_alt5 = list(makeSymbol("_CSETF-SVECTOR-MAGNITUDE"), makeSymbol("_CSETF-SVECTOR-DIMENSIONS"));

    public static final class $sparse_vector_p$UnaryFunction extends UnaryFunction {
        public $sparse_vector_p$UnaryFunction() {
            super(extractFunctionNamed("SPARSE-VECTOR-P"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1) {
            return sparse_vector_p(arg1);
        }
    }

    static private final SubLString $str_alt14$Invalid_slot__S_for_construction_ = makeString("Invalid slot ~S for construction function");

    static private final SubLString $str_alt18$__SVECTOR__ = makeString("#<SVECTOR: ");

    static private final SubLString $str_alt20$____ = makeString(" -> ");

    static private final SubLString $str_alt21$__ = makeString(", ");

    static private final SubLString $str_alt22$___ = makeString("...");

    static private final SubLString $str_alt23$_ = makeString(">");

    static private final SubLList $list_alt25 = list(list(makeSymbol("DIMENSION"), makeSymbol("VALUE"), makeSymbol("VECTOR")), makeSymbol("&BODY"), makeSymbol("BODY"));

    static private final SubLString $str_alt28$_a_is_not_a_sparse_vector_with_te = makeString("~a is not a sparse vector with test ~a");

    static private final SubLString $str_alt29$Non_matching_vector_tests__a_and_ = makeString("Non-matching vector tests ~a and ~a");
}

/**
 * Total time: 321 ms
 */
