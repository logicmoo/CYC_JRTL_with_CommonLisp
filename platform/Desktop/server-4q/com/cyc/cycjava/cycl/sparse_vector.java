package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.UnaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDecl;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDeclNative;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLStructNative;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.visitation;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLSpecialOperatorDeclarations;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import java.util.Map;
import java.util.Iterator;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class sparse_vector extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.sparse_vector";
    public static final String myFingerPrint = "19f7471a9e5ee638769e68ee54c1de1d6560a689a64fd84997c2606af3286468";
    @SubLTranslatedFile.SubL(source = "cycl/sparse-vector.lisp", position = 3370L)
    public static SubLSymbol $dtp_sparse_vector$;
    @SubLTranslatedFile.SubL(source = "cycl/sparse-vector.lisp", position = 13767L)
    private static SubLSymbol $cfasl_opcode_sparse_vector$;
    private static final SubLSymbol $sym0$SPARSE_VECTOR;
    private static final SubLSymbol $sym1$SPARSE_VECTOR_P;
    private static final SubLList $list2;
    private static final SubLList $list3;
    private static final SubLList $list4;
    private static final SubLList $list5;
    private static final SubLSymbol $sym6$SVECTOR_PRINT;
    private static final SubLSymbol $sym7$SPARSE_VECTOR_PRINT_FUNCTION_TRAMPOLINE;
    private static final SubLList $list8;
    private static final SubLSymbol $sym9$SVECTOR_MAGNITUDE;
    private static final SubLSymbol $sym10$_CSETF_SVECTOR_MAGNITUDE;
    private static final SubLSymbol $sym11$SVECTOR_DIMENSIONS;
    private static final SubLSymbol $sym12$_CSETF_SVECTOR_DIMENSIONS;
    private static final SubLSymbol $kw13$MAGNITUDE;
    private static final SubLSymbol $kw14$DIMENSIONS;
    private static final SubLString $str15$Invalid_slot__S_for_construction_;
    private static final SubLSymbol $kw16$BEGIN;
    private static final SubLSymbol $sym17$MAKE_SPARSE_VECTOR;
    private static final SubLSymbol $kw18$SLOT;
    private static final SubLSymbol $kw19$END;
    private static final SubLSymbol $sym20$VISIT_DEFSTRUCT_OBJECT_SPARSE_VECTOR_METHOD;
    private static final SubLInteger $int21$50;
    private static final SubLSymbol $sym22$VALID_HASH_TEST_P;
    private static final SubLSymbol $sym23$INTEGERP;
    private static final SubLString $str24$__SVECTOR__;
    private static final SubLSymbol $kw25$DO_HASH_TABLE;
    private static final SubLString $str26$____;
    private static final SubLString $str27$__;
    private static final SubLString $str28$___;
    private static final SubLString $str29$_;
    private static final SubLSymbol $sym30$NUMBERP;
    private static final SubLList $list31;
    private static final SubLSymbol $sym32$CDOHASH;
    private static final SubLSymbol $sym33$NON_EMPTY_LIST_P;
    private static final SubLString $str34$_a_is_not_a_sparse_vector_with_te;
    private static final SubLString $str35$Non_matching_vector_tests__a_and_;
    private static final SubLInteger $int36$64;
    private static final SubLInteger $int37$65;
    private static final SubLSymbol $sym38$CFASL_INPUT_SPARSE_VECTOR;
    private static final SubLSymbol $sym39$CFASL_OUTPUT_OBJECT_SPARSE_VECTOR_METHOD;
    
    @SubLTranslatedFile.SubL(source = "cycl/sparse-vector.lisp", position = 3370L)
    public static SubLObject sparse_vector_print_function_trampoline(final SubLObject v_object, final SubLObject stream) {
        svector_print(v_object, stream, (SubLObject)sparse_vector.ZERO_INTEGER);
        return (SubLObject)sparse_vector.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sparse-vector.lisp", position = 3370L)
    public static SubLObject sparse_vector_p(final SubLObject v_object) {
        return (SubLObject)((v_object.getClass() == $sparse_vector_native.class) ? sparse_vector.T : sparse_vector.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sparse-vector.lisp", position = 3370L)
    public static SubLObject svector_magnitude(final SubLObject v_object) {
        assert sparse_vector.NIL != sparse_vector_p(v_object) : v_object;
        return v_object.getField2();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sparse-vector.lisp", position = 3370L)
    public static SubLObject svector_dimensions(final SubLObject v_object) {
        assert sparse_vector.NIL != sparse_vector_p(v_object) : v_object;
        return v_object.getField3();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sparse-vector.lisp", position = 3370L)
    public static SubLObject _csetf_svector_magnitude(final SubLObject v_object, final SubLObject value) {
        assert sparse_vector.NIL != sparse_vector_p(v_object) : v_object;
        return v_object.setField2(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sparse-vector.lisp", position = 3370L)
    public static SubLObject _csetf_svector_dimensions(final SubLObject v_object, final SubLObject value) {
        assert sparse_vector.NIL != sparse_vector_p(v_object) : v_object;
        return v_object.setField3(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sparse-vector.lisp", position = 3370L)
    public static SubLObject make_sparse_vector(SubLObject arglist) {
        if (arglist == sparse_vector.UNPROVIDED) {
            arglist = (SubLObject)sparse_vector.NIL;
        }
        final SubLObject v_new = (SubLObject)new $sparse_vector_native();
        SubLObject next;
        SubLObject current_arg;
        SubLObject current_value;
        SubLObject pcase_var;
        for (next = (SubLObject)sparse_vector.NIL, next = arglist; sparse_vector.NIL != next; next = conses_high.cddr(next)) {
            current_arg = next.first();
            current_value = conses_high.cadr(next);
            pcase_var = current_arg;
            if (pcase_var.eql((SubLObject)sparse_vector.$kw13$MAGNITUDE)) {
                _csetf_svector_magnitude(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)sparse_vector.$kw14$DIMENSIONS)) {
                _csetf_svector_dimensions(v_new, current_value);
            }
            else {
                Errors.error((SubLObject)sparse_vector.$str15$Invalid_slot__S_for_construction_, current_arg);
            }
        }
        return v_new;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sparse-vector.lisp", position = 3370L)
    public static SubLObject visit_defstruct_sparse_vector(final SubLObject obj, final SubLObject visitor_fn) {
        Functions.funcall(visitor_fn, obj, (SubLObject)sparse_vector.$kw16$BEGIN, (SubLObject)sparse_vector.$sym17$MAKE_SPARSE_VECTOR, (SubLObject)sparse_vector.TWO_INTEGER);
        Functions.funcall(visitor_fn, obj, (SubLObject)sparse_vector.$kw18$SLOT, (SubLObject)sparse_vector.$kw13$MAGNITUDE, svector_magnitude(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)sparse_vector.$kw18$SLOT, (SubLObject)sparse_vector.$kw14$DIMENSIONS, svector_dimensions(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)sparse_vector.$kw19$END, (SubLObject)sparse_vector.$sym17$MAKE_SPARSE_VECTOR, (SubLObject)sparse_vector.TWO_INTEGER);
        return obj;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sparse-vector.lisp", position = 3370L)
    public static SubLObject visit_defstruct_object_sparse_vector_method(final SubLObject obj, final SubLObject visitor_fn) {
        return visit_defstruct_sparse_vector(obj, visitor_fn);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sparse-vector.lisp", position = 3576L)
    public static SubLObject new_sparse_vector(SubLObject test, SubLObject capacity) {
        if (test == sparse_vector.UNPROVIDED) {
            test = (SubLObject)sparse_vector.EQL;
        }
        if (capacity == sparse_vector.UNPROVIDED) {
            capacity = (SubLObject)sparse_vector.$int21$50;
        }
        assert sparse_vector.NIL != hash_table_utilities.valid_hash_test_p(test) : test;
        assert sparse_vector.NIL != Types.integerp(capacity) : capacity;
        final SubLObject vector = make_sparse_vector((SubLObject)sparse_vector.UNPROVIDED);
        _csetf_svector_dimensions(vector, Hashtables.make_hash_table(capacity, test, (SubLObject)sparse_vector.UNPROVIDED));
        return vector;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sparse-vector.lisp", position = 4146L)
    public static SubLObject svector_print(final SubLObject vector, final SubLObject stream, final SubLObject depth) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        streams_high.write_string((SubLObject)sparse_vector.$str24$__SVECTOR__, stream, (SubLObject)sparse_vector.UNPROVIDED, (SubLObject)sparse_vector.UNPROVIDED);
        SubLObject i = (SubLObject)sparse_vector.ZERO_INTEGER;
        final SubLObject count = Hashtables.hash_table_count(svector_dimensions(vector));
        if (!i.numE(Numbers.min(count, (SubLObject)sparse_vector.TEN_INTEGER))) {
            SubLObject catch_var = (SubLObject)sparse_vector.NIL;
            try {
                thread.throwStack.push(sparse_vector.$kw25$DO_HASH_TABLE);
                final SubLObject cdohash_table = svector_dimensions(vector);
                SubLObject dimension = (SubLObject)sparse_vector.NIL;
                SubLObject value = (SubLObject)sparse_vector.NIL;
                final Iterator cdohash_iterator = Hashtables.getEntrySetIterator(cdohash_table);
                try {
                    while (Hashtables.iteratorHasNext(cdohash_iterator)) {
                        final Map.Entry cdohash_entry = Hashtables.iteratorNextEntry(cdohash_iterator);
                        dimension = Hashtables.getEntryKey(cdohash_entry);
                        value = Hashtables.getEntryValue(cdohash_entry);
                        subl_macros.do_hash_table_done_check(Numbers.numE(i, Numbers.min(count, (SubLObject)sparse_vector.TEN_INTEGER)));
                        print_high.princ(dimension, stream);
                        streams_high.write_string((SubLObject)sparse_vector.$str26$____, stream, (SubLObject)sparse_vector.UNPROVIDED, (SubLObject)sparse_vector.UNPROVIDED);
                        print_high.princ(value, stream);
                        print_high.princ((SubLObject)sparse_vector.$str27$__, stream);
                        i = Numbers.add(i, (SubLObject)sparse_vector.ONE_INTEGER);
                    }
                }
                finally {
                    Hashtables.releaseEntrySetIterator(cdohash_iterator);
                }
            }
            catch (Throwable ccatch_env_var) {
                catch_var = Errors.handleThrowable(ccatch_env_var, (SubLObject)sparse_vector.$kw25$DO_HASH_TABLE);
            }
            finally {
                thread.throwStack.pop();
            }
        }
        if (count.numG(i)) {
            streams_high.write_string((SubLObject)sparse_vector.$str28$___, stream, (SubLObject)sparse_vector.UNPROVIDED, (SubLObject)sparse_vector.UNPROVIDED);
        }
        streams_high.write_string((SubLObject)sparse_vector.$str29$_, stream, (SubLObject)sparse_vector.UNPROVIDED, (SubLObject)sparse_vector.UNPROVIDED);
        return vector;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sparse-vector.lisp", position = 4685L)
    public static SubLObject svector_test(final SubLObject vector) {
        assert sparse_vector.NIL != sparse_vector_p(vector) : vector;
        return Hashtables.hash_table_test(svector_dimensions(vector));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sparse-vector.lisp", position = 4898L)
    public static SubLObject svector_cardinality(final SubLObject vector) {
        assert sparse_vector.NIL != sparse_vector_p(vector) : vector;
        return Hashtables.hash_table_count(svector_dimensions(vector));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sparse-vector.lisp", position = 5150L)
    public static SubLObject svector_copy(final SubLObject vector) {
        assert sparse_vector.NIL != sparse_vector_p(vector) : vector;
        final SubLObject copy = new_sparse_vector(svector_test(vector), (SubLObject)sparse_vector.UNPROVIDED);
        final SubLObject cdohash_table = svector_dimensions(vector);
        SubLObject dim = (SubLObject)sparse_vector.NIL;
        SubLObject value = (SubLObject)sparse_vector.NIL;
        final Iterator cdohash_iterator = Hashtables.getEntrySetIterator(cdohash_table);
        try {
            while (Hashtables.iteratorHasNext(cdohash_iterator)) {
                final Map.Entry cdohash_entry = Hashtables.iteratorNextEntry(cdohash_iterator);
                dim = Hashtables.getEntryKey(cdohash_entry);
                value = Hashtables.getEntryValue(cdohash_entry);
                svector_set(copy, dim, value);
            }
        }
        finally {
            Hashtables.releaseEntrySetIterator(cdohash_iterator);
        }
        return copy;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sparse-vector.lisp", position = 5471L)
    public static SubLObject svector_get(final SubLObject vector, final SubLObject dimension) {
        assert sparse_vector.NIL != sparse_vector_p(vector) : vector;
        return Hashtables.gethash(dimension, svector_dimensions(vector), (SubLObject)sparse_vector.ZERO_INTEGER);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sparse-vector.lisp", position = 5730L)
    public static SubLObject svector_set(final SubLObject vector, final SubLObject dimension, final SubLObject value) {
        assert sparse_vector.NIL != sparse_vector_p(vector) : vector;
        assert sparse_vector.NIL != Types.numberp(value) : value;
        if (value.isZero()) {
            Hashtables.remhash(dimension, svector_dimensions(vector));
        }
        else {
            Hashtables.sethash(dimension, svector_dimensions(vector), value);
        }
        return vector;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sparse-vector.lisp", position = 6192L)
    public static SubLObject svector_inc(final SubLObject vector, final SubLObject dimension) {
        assert sparse_vector.NIL != sparse_vector_p(vector) : vector;
        Hashtables.sethash(dimension, svector_dimensions(vector), Numbers.add(Hashtables.gethash(dimension, svector_dimensions(vector), (SubLObject)sparse_vector.ZERO_INTEGER), (SubLObject)sparse_vector.ONE_INTEGER));
        return vector;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sparse-vector.lisp", position = 6501L)
    public static SubLObject svector_dec(final SubLObject vector, final SubLObject dimension) {
        assert sparse_vector.NIL != sparse_vector_p(vector) : vector;
        Hashtables.sethash(dimension, svector_dimensions(vector), Numbers.subtract(Hashtables.gethash(dimension, svector_dimensions(vector), (SubLObject)sparse_vector.ZERO_INTEGER), (SubLObject)sparse_vector.ONE_INTEGER));
        return vector;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sparse-vector.lisp", position = 6810L)
    public static SubLObject svector_length(final SubLObject vector) {
        assert sparse_vector.NIL != sparse_vector_p(vector) : vector;
        if (sparse_vector.NIL == svector_magnitude(vector)) {
            SubLObject sum = (SubLObject)sparse_vector.ZERO_INTEGER;
            final SubLObject cdohash_table = svector_dimensions(vector);
            SubLObject dimension = (SubLObject)sparse_vector.NIL;
            SubLObject value = (SubLObject)sparse_vector.NIL;
            final Iterator cdohash_iterator = Hashtables.getEntrySetIterator(cdohash_table);
            try {
                while (Hashtables.iteratorHasNext(cdohash_iterator)) {
                    final Map.Entry cdohash_entry = Hashtables.iteratorNextEntry(cdohash_iterator);
                    dimension = Hashtables.getEntryKey(cdohash_entry);
                    value = Hashtables.getEntryValue(cdohash_entry);
                    sum = Numbers.add(sum, number_utilities.square(value));
                }
            }
            finally {
                Hashtables.releaseEntrySetIterator(cdohash_iterator);
            }
            _csetf_svector_magnitude(vector, Numbers.sqrt(sum));
        }
        return svector_magnitude(vector);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sparse-vector.lisp", position = 7211L)
    public static SubLObject do_svector(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sparse_vector.$list31);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject dimension = (SubLObject)sparse_vector.NIL;
        SubLObject value = (SubLObject)sparse_vector.NIL;
        SubLObject vector = (SubLObject)sparse_vector.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sparse_vector.$list31);
        dimension = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sparse_vector.$list31);
        value = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sparse_vector.$list31);
        vector = current.first();
        current = current.rest();
        if (sparse_vector.NIL == current) {
            final SubLObject body;
            current = (body = temp);
            return (SubLObject)ConsesLow.listS((SubLObject)sparse_vector.$sym32$CDOHASH, (SubLObject)ConsesLow.list(dimension, value, (SubLObject)ConsesLow.list((SubLObject)sparse_vector.$sym11$SVECTOR_DIMENSIONS, vector)), ConsesLow.append(body, (SubLObject)sparse_vector.NIL));
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)sparse_vector.$list31);
        return (SubLObject)sparse_vector.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sparse-vector.lisp", position = 7466L)
    public static SubLObject zero_svector_p(final SubLObject vector) {
        assert sparse_vector.NIL != sparse_vector_p(vector) : vector;
        return Numbers.zerop(Hashtables.hash_table_count(svector_dimensions(vector)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sparse-vector.lisp", position = 7689L)
    public static SubLObject svector_euclidean_norm(final SubLObject vector) {
        assert sparse_vector.NIL != sparse_vector_p(vector) : vector;
        return svector_length(vector);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sparse-vector.lisp", position = 7891L)
    public static SubLObject svector_sum_norm(final SubLObject vector) {
        assert sparse_vector.NIL != sparse_vector_p(vector) : vector;
        SubLObject norm = (SubLObject)sparse_vector.ZERO_INTEGER;
        final SubLObject cdohash_table = svector_dimensions(vector);
        SubLObject dim = (SubLObject)sparse_vector.NIL;
        SubLObject value = (SubLObject)sparse_vector.NIL;
        final Iterator cdohash_iterator = Hashtables.getEntrySetIterator(cdohash_table);
        try {
            while (Hashtables.iteratorHasNext(cdohash_iterator)) {
                final Map.Entry cdohash_entry = Hashtables.iteratorNextEntry(cdohash_iterator);
                dim = Hashtables.getEntryKey(cdohash_entry);
                value = Hashtables.getEntryValue(cdohash_entry);
                norm = Numbers.add(norm, value);
            }
        }
        finally {
            Hashtables.releaseEntrySetIterator(cdohash_iterator);
        }
        return norm;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sparse-vector.lisp", position = 8181L)
    public static SubLObject svector_max_norm(final SubLObject vector) {
        assert sparse_vector.NIL != sparse_vector_p(vector) : vector;
        SubLObject max = (SubLObject)sparse_vector.ZERO_INTEGER;
        final SubLObject cdohash_table = svector_dimensions(vector);
        SubLObject dim = (SubLObject)sparse_vector.NIL;
        SubLObject value = (SubLObject)sparse_vector.NIL;
        final Iterator cdohash_iterator = Hashtables.getEntrySetIterator(cdohash_table);
        try {
            while (Hashtables.iteratorHasNext(cdohash_iterator)) {
                final Map.Entry cdohash_entry = Hashtables.iteratorNextEntry(cdohash_iterator);
                dim = Hashtables.getEntryKey(cdohash_entry);
                value = Hashtables.getEntryValue(cdohash_entry);
                if (value.numG(max)) {
                    max = value;
                }
            }
        }
        finally {
            Hashtables.releaseEntrySetIterator(cdohash_iterator);
        }
        return max;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sparse-vector.lisp", position = 8495L)
    public static SubLObject svector_add(final SubLObject vector2, final SubLObject vector1) {
        assert sparse_vector.NIL != sparse_vector_p(vector1) : vector1;
        assert sparse_vector.NIL != sparse_vector_p(vector2) : vector2;
        final SubLObject dimensions2 = svector_dimensions(vector2);
        final SubLObject cdohash_table = svector_dimensions(vector1);
        SubLObject dimension = (SubLObject)sparse_vector.NIL;
        SubLObject value = (SubLObject)sparse_vector.NIL;
        final Iterator cdohash_iterator = Hashtables.getEntrySetIterator(cdohash_table);
        try {
            while (Hashtables.iteratorHasNext(cdohash_iterator)) {
                final Map.Entry cdohash_entry = Hashtables.iteratorNextEntry(cdohash_iterator);
                dimension = Hashtables.getEntryKey(cdohash_entry);
                value = Hashtables.getEntryValue(cdohash_entry);
                Hashtables.sethash(dimension, dimensions2, Numbers.add(Hashtables.gethash(dimension, dimensions2, (SubLObject)sparse_vector.ZERO_INTEGER), value));
            }
        }
        finally {
            Hashtables.releaseEntrySetIterator(cdohash_iterator);
        }
        _csetf_svector_magnitude(vector2, (SubLObject)sparse_vector.NIL);
        return vector2;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sparse-vector.lisp", position = 9168L)
    public static SubLObject svector_sum(final SubLObject vector1, final SubLObject vector2) {
        assert sparse_vector.NIL != sparse_vector_p(vector1) : vector1;
        assert sparse_vector.NIL != sparse_vector_p(vector2) : vector2;
        final SubLObject sum_vector = new_sparse_vector((SubLObject)sparse_vector.UNPROVIDED, (SubLObject)sparse_vector.UNPROVIDED);
        svector_add(vector1, sum_vector);
        svector_add(vector2, sum_vector);
        return sum_vector;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sparse-vector.lisp", position = 9613L)
    public static SubLObject svector_scalar_product(final SubLObject vector1, final SubLObject vector2) {
        assert sparse_vector.NIL != sparse_vector_p(vector1) : vector1;
        assert sparse_vector.NIL != sparse_vector_p(vector2) : vector2;
        SubLObject dot_product = (SubLObject)sparse_vector.ZERO_INTEGER;
        final SubLObject dimensions2 = svector_dimensions(vector2);
        final SubLObject cdohash_table = svector_dimensions(vector1);
        SubLObject dimension = (SubLObject)sparse_vector.NIL;
        SubLObject value = (SubLObject)sparse_vector.NIL;
        final Iterator cdohash_iterator = Hashtables.getEntrySetIterator(cdohash_table);
        try {
            while (Hashtables.iteratorHasNext(cdohash_iterator)) {
                final Map.Entry cdohash_entry = Hashtables.iteratorNextEntry(cdohash_iterator);
                dimension = Hashtables.getEntryKey(cdohash_entry);
                value = Hashtables.getEntryValue(cdohash_entry);
                dot_product = Numbers.add(dot_product, Numbers.multiply(value, Hashtables.gethash(dimension, dimensions2, (SubLObject)sparse_vector.ZERO_INTEGER)));
            }
        }
        finally {
            Hashtables.releaseEntrySetIterator(cdohash_iterator);
        }
        return dot_product;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sparse-vector.lisp", position = 10035L)
    public static SubLObject svector_scale(final SubLObject vector, final SubLObject factor) {
        assert sparse_vector.NIL != sparse_vector_p(vector) : vector;
        assert sparse_vector.NIL != Types.numberp(factor) : factor;
        _csetf_svector_magnitude(vector, (SubLObject)sparse_vector.NIL);
        final SubLObject cdohash_table = svector_dimensions(vector);
        SubLObject dimension = (SubLObject)sparse_vector.NIL;
        SubLObject value = (SubLObject)sparse_vector.NIL;
        final Iterator cdohash_iterator = Hashtables.getEntrySetIterator(cdohash_table);
        try {
            while (Hashtables.iteratorHasNext(cdohash_iterator)) {
                final Map.Entry cdohash_entry = Hashtables.iteratorNextEntry(cdohash_iterator);
                dimension = Hashtables.getEntryKey(cdohash_entry);
                value = Hashtables.getEntryValue(cdohash_entry);
                svector_set(vector, dimension, Numbers.multiply(value, factor));
            }
        }
        finally {
            Hashtables.releaseEntrySetIterator(cdohash_iterator);
        }
        return vector;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sparse-vector.lisp", position = 10481L)
    public static SubLObject svector_normalize(final SubLObject vector) {
        assert sparse_vector.NIL != sparse_vector_p(vector) : vector;
        final SubLObject length = svector_length(vector);
        if (!length.isZero()) {
            return svector_scale(vector, Numbers.divide((SubLObject)sparse_vector.ONE_INTEGER, length));
        }
        return (SubLObject)sparse_vector.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sparse-vector.lisp", position = 10983L)
    public static SubLObject svector_normalizedP(final SubLObject vector) {
        assert sparse_vector.NIL != sparse_vector_p(vector) : vector;
        return Numbers.numE(svector_length(vector), (SubLObject)sparse_vector.ONE_INTEGER);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sparse-vector.lisp", position = 11201L)
    public static SubLObject svector_distance(final SubLObject vector1, final SubLObject vector2) {
        assert sparse_vector.NIL != sparse_vector_p(vector1) : vector1;
        assert sparse_vector.NIL != sparse_vector_p(vector2) : vector2;
        SubLObject sum = (SubLObject)sparse_vector.ZERO_INTEGER;
        final SubLObject dimensions2 = svector_dimensions(vector2);
        final SubLObject cdohash_table = svector_dimensions(vector1);
        SubLObject dimension = (SubLObject)sparse_vector.NIL;
        SubLObject value = (SubLObject)sparse_vector.NIL;
        final Iterator cdohash_iterator = Hashtables.getEntrySetIterator(cdohash_table);
        try {
            while (Hashtables.iteratorHasNext(cdohash_iterator)) {
                final Map.Entry cdohash_entry = Hashtables.iteratorNextEntry(cdohash_iterator);
                dimension = Hashtables.getEntryKey(cdohash_entry);
                value = Hashtables.getEntryValue(cdohash_entry);
                sum = Numbers.add(sum, number_utilities.square(Numbers.subtract(value, Hashtables.gethash(dimension, dimensions2, (SubLObject)sparse_vector.ZERO_INTEGER))));
            }
        }
        finally {
            Hashtables.releaseEntrySetIterator(cdohash_iterator);
        }
        return Numbers.sqrt(sum);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sparse-vector.lisp", position = 11701L)
    public static SubLObject svector_centroid(final SubLObject vectors) {
        assert sparse_vector.NIL != list_utilities.non_empty_list_p(vectors) : vectors;
        final SubLObject test = svector_test(vectors.first());
        final SubLObject centroid = new_sparse_vector(test, (SubLObject)sparse_vector.UNPROVIDED);
        SubLObject cdolist_list_var = vectors;
        SubLObject vector = (SubLObject)sparse_vector.NIL;
        vector = cdolist_list_var.first();
        while (sparse_vector.NIL != cdolist_list_var) {
            if (sparse_vector.NIL == sparse_vector_p(vector) || !svector_test(vector).eql(test)) {
                Errors.error((SubLObject)sparse_vector.$str34$_a_is_not_a_sparse_vector_with_te, vector, test);
            }
            svector_add(centroid, vector);
            cdolist_list_var = cdolist_list_var.rest();
            vector = cdolist_list_var.first();
        }
        return svector_scale(centroid, Numbers.divide((SubLObject)sparse_vector.ONE_INTEGER, Sequences.length(vectors)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sparse-vector.lisp", position = 12236L)
    public static SubLObject svector_matching_coefficient(final SubLObject vector1, final SubLObject vector2) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert sparse_vector.NIL != sparse_vector_p(vector1) : vector1;
        assert sparse_vector.NIL != sparse_vector_p(vector2) : vector2;
        if (sparse_vector.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && !svector_test(vector1).eql(svector_test(vector2))) {
            Errors.error((SubLObject)sparse_vector.$str35$Non_matching_vector_tests__a_and_, svector_test(vector1), svector_test(vector2));
        }
        final SubLObject intersection = set.new_set(svector_test(vector1), (SubLObject)sparse_vector.$int36$64);
        final SubLObject cdohash_table = svector_dimensions(vector1);
        SubLObject dimension = (SubLObject)sparse_vector.NIL;
        SubLObject value = (SubLObject)sparse_vector.NIL;
        final Iterator cdohash_iterator = Hashtables.getEntrySetIterator(cdohash_table);
        try {
            while (Hashtables.iteratorHasNext(cdohash_iterator)) {
                final Map.Entry cdohash_entry = Hashtables.iteratorNextEntry(cdohash_iterator);
                dimension = Hashtables.getEntryKey(cdohash_entry);
                value = Hashtables.getEntryValue(cdohash_entry);
                if (!svector_get(vector2, dimension).isZero()) {
                    set.set_add(dimension, intersection);
                }
            }
        }
        finally {
            Hashtables.releaseEntrySetIterator(cdohash_iterator);
        }
        return set.set_size(intersection);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sparse-vector.lisp", position = 12933L)
    public static SubLObject svector_cosine_angle(final SubLObject vector1, final SubLObject vector2) {
        assert sparse_vector.NIL != sparse_vector_p(vector1) : vector1;
        assert sparse_vector.NIL != sparse_vector_p(vector2) : vector2;
        return Numbers.divide(svector_scalar_product(vector1, vector2), Numbers.multiply(svector_length(vector1), svector_length(vector2)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sparse-vector.lisp", position = 13318L)
    public static SubLObject svector_overlap_coefficient(final SubLObject vector1, final SubLObject vector2) {
        assert sparse_vector.NIL != sparse_vector_p(vector1) : vector1;
        assert sparse_vector.NIL != sparse_vector_p(vector2) : vector2;
        return Numbers.divide(svector_matching_coefficient(vector1, vector2), Numbers.min(Hashtables.hash_table_count(svector_dimensions(vector1)), Hashtables.hash_table_count(svector_dimensions(vector2))));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sparse-vector.lisp", position = 13906L)
    public static SubLObject cfasl_output_object_sparse_vector_method(final SubLObject v_object, final SubLObject stream) {
        return cfasl_output_sparse_vector(v_object, stream);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sparse-vector.lisp", position = 14037L)
    public static SubLObject cfasl_output_sparse_vector(final SubLObject svector, final SubLObject stream) {
        cfasl.cfasl_raw_write_byte(sparse_vector.$cfasl_opcode_sparse_vector$.getGlobalValue(), stream);
        cfasl.cfasl_output(svector_dimensions(svector), stream);
        return svector;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sparse-vector.lisp", position = 14230L)
    public static SubLObject cfasl_input_sparse_vector(final SubLObject stream) {
        final SubLObject svector = make_sparse_vector((SubLObject)sparse_vector.UNPROVIDED);
        _csetf_svector_dimensions(svector, cfasl.cfasl_input_object(stream));
        return svector;
    }
    
    public static SubLObject declare_sparse_vector_file() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sparse_vector", "sparse_vector_print_function_trampoline", "SPARSE-VECTOR-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sparse_vector", "sparse_vector_p", "SPARSE-VECTOR-P", 1, 0, false);
        new $sparse_vector_p$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sparse_vector", "svector_magnitude", "SVECTOR-MAGNITUDE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sparse_vector", "svector_dimensions", "SVECTOR-DIMENSIONS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sparse_vector", "_csetf_svector_magnitude", "_CSETF-SVECTOR-MAGNITUDE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sparse_vector", "_csetf_svector_dimensions", "_CSETF-SVECTOR-DIMENSIONS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sparse_vector", "make_sparse_vector", "MAKE-SPARSE-VECTOR", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sparse_vector", "visit_defstruct_sparse_vector", "VISIT-DEFSTRUCT-SPARSE-VECTOR", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sparse_vector", "visit_defstruct_object_sparse_vector_method", "VISIT-DEFSTRUCT-OBJECT-SPARSE-VECTOR-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sparse_vector", "new_sparse_vector", "NEW-SPARSE-VECTOR", 0, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sparse_vector", "svector_print", "SVECTOR-PRINT", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sparse_vector", "svector_test", "SVECTOR-TEST", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sparse_vector", "svector_cardinality", "SVECTOR-CARDINALITY", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sparse_vector", "svector_copy", "SVECTOR-COPY", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sparse_vector", "svector_get", "SVECTOR-GET", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sparse_vector", "svector_set", "SVECTOR-SET", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sparse_vector", "svector_inc", "SVECTOR-INC", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sparse_vector", "svector_dec", "SVECTOR-DEC", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sparse_vector", "svector_length", "SVECTOR-LENGTH", 1, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.sparse_vector", "do_svector", "DO-SVECTOR");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sparse_vector", "zero_svector_p", "ZERO-SVECTOR-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sparse_vector", "svector_euclidean_norm", "SVECTOR-EUCLIDEAN-NORM", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sparse_vector", "svector_sum_norm", "SVECTOR-SUM-NORM", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sparse_vector", "svector_max_norm", "SVECTOR-MAX-NORM", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sparse_vector", "svector_add", "SVECTOR-ADD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sparse_vector", "svector_sum", "SVECTOR-SUM", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sparse_vector", "svector_scalar_product", "SVECTOR-SCALAR-PRODUCT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sparse_vector", "svector_scale", "SVECTOR-SCALE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sparse_vector", "svector_normalize", "SVECTOR-NORMALIZE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sparse_vector", "svector_normalizedP", "SVECTOR-NORMALIZED?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sparse_vector", "svector_distance", "SVECTOR-DISTANCE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sparse_vector", "svector_centroid", "SVECTOR-CENTROID", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sparse_vector", "svector_matching_coefficient", "SVECTOR-MATCHING-COEFFICIENT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sparse_vector", "svector_cosine_angle", "SVECTOR-COSINE-ANGLE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sparse_vector", "svector_overlap_coefficient", "SVECTOR-OVERLAP-COEFFICIENT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sparse_vector", "cfasl_output_object_sparse_vector_method", "CFASL-OUTPUT-OBJECT-SPARSE-VECTOR-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sparse_vector", "cfasl_output_sparse_vector", "CFASL-OUTPUT-SPARSE-VECTOR", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sparse_vector", "cfasl_input_sparse_vector", "CFASL-INPUT-SPARSE-VECTOR", 1, 0, false);
        return (SubLObject)sparse_vector.NIL;
    }
    
    public static SubLObject init_sparse_vector_file() {
        sparse_vector.$dtp_sparse_vector$ = SubLFiles.defconstant("*DTP-SPARSE-VECTOR*", (SubLObject)sparse_vector.$sym0$SPARSE_VECTOR);
        sparse_vector.$cfasl_opcode_sparse_vector$ = SubLFiles.defconstant("*CFASL-OPCODE-SPARSE-VECTOR*", (SubLObject)sparse_vector.$int37$65);
        return (SubLObject)sparse_vector.NIL;
    }
    
    public static SubLObject setup_sparse_vector_file() {
        Structures.register_method(print_high.$print_object_method_table$.getGlobalValue(), sparse_vector.$dtp_sparse_vector$.getGlobalValue(), Symbols.symbol_function((SubLObject)sparse_vector.$sym7$SPARSE_VECTOR_PRINT_FUNCTION_TRAMPOLINE));
        SubLSpecialOperatorDeclarations.proclaim((SubLObject)sparse_vector.$list8);
        Structures.def_csetf((SubLObject)sparse_vector.$sym9$SVECTOR_MAGNITUDE, (SubLObject)sparse_vector.$sym10$_CSETF_SVECTOR_MAGNITUDE);
        Structures.def_csetf((SubLObject)sparse_vector.$sym11$SVECTOR_DIMENSIONS, (SubLObject)sparse_vector.$sym12$_CSETF_SVECTOR_DIMENSIONS);
        Equality.identity((SubLObject)sparse_vector.$sym0$SPARSE_VECTOR);
        Structures.register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), sparse_vector.$dtp_sparse_vector$.getGlobalValue(), Symbols.symbol_function((SubLObject)sparse_vector.$sym20$VISIT_DEFSTRUCT_OBJECT_SPARSE_VECTOR_METHOD));
        cfasl.register_cfasl_input_function(sparse_vector.$cfasl_opcode_sparse_vector$.getGlobalValue(), (SubLObject)sparse_vector.$sym38$CFASL_INPUT_SPARSE_VECTOR);
        Structures.register_method(cfasl.$cfasl_output_object_method_table$.getGlobalValue(), sparse_vector.$dtp_sparse_vector$.getGlobalValue(), Symbols.symbol_function((SubLObject)sparse_vector.$sym39$CFASL_OUTPUT_OBJECT_SPARSE_VECTOR_METHOD));
        return (SubLObject)sparse_vector.NIL;
    }
    
    public void declareFunctions() {
        declare_sparse_vector_file();
    }
    
    public void initializeVariables() {
        init_sparse_vector_file();
    }
    
    public void runTopLevelForms() {
        setup_sparse_vector_file();
    }
    
    static {
        me = (SubLFile)new sparse_vector();
        sparse_vector.$dtp_sparse_vector$ = null;
        sparse_vector.$cfasl_opcode_sparse_vector$ = null;
        $sym0$SPARSE_VECTOR = SubLObjectFactory.makeSymbol("SPARSE-VECTOR");
        $sym1$SPARSE_VECTOR_P = SubLObjectFactory.makeSymbol("SPARSE-VECTOR-P");
        $list2 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("MAGNITUDE"), (SubLObject)SubLObjectFactory.makeSymbol("DIMENSIONS"));
        $list3 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("MAGNITUDE"), (SubLObject)SubLObjectFactory.makeKeyword("DIMENSIONS"));
        $list4 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SVECTOR-MAGNITUDE"), (SubLObject)SubLObjectFactory.makeSymbol("SVECTOR-DIMENSIONS"));
        $list5 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("_CSETF-SVECTOR-MAGNITUDE"), (SubLObject)SubLObjectFactory.makeSymbol("_CSETF-SVECTOR-DIMENSIONS"));
        $sym6$SVECTOR_PRINT = SubLObjectFactory.makeSymbol("SVECTOR-PRINT");
        $sym7$SPARSE_VECTOR_PRINT_FUNCTION_TRAMPOLINE = SubLObjectFactory.makeSymbol("SPARSE-VECTOR-PRINT-FUNCTION-TRAMPOLINE");
        $list8 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("OPTIMIZE-FUNCALL"), (SubLObject)SubLObjectFactory.makeSymbol("SPARSE-VECTOR-P"));
        $sym9$SVECTOR_MAGNITUDE = SubLObjectFactory.makeSymbol("SVECTOR-MAGNITUDE");
        $sym10$_CSETF_SVECTOR_MAGNITUDE = SubLObjectFactory.makeSymbol("_CSETF-SVECTOR-MAGNITUDE");
        $sym11$SVECTOR_DIMENSIONS = SubLObjectFactory.makeSymbol("SVECTOR-DIMENSIONS");
        $sym12$_CSETF_SVECTOR_DIMENSIONS = SubLObjectFactory.makeSymbol("_CSETF-SVECTOR-DIMENSIONS");
        $kw13$MAGNITUDE = SubLObjectFactory.makeKeyword("MAGNITUDE");
        $kw14$DIMENSIONS = SubLObjectFactory.makeKeyword("DIMENSIONS");
        $str15$Invalid_slot__S_for_construction_ = SubLObjectFactory.makeString("Invalid slot ~S for construction function");
        $kw16$BEGIN = SubLObjectFactory.makeKeyword("BEGIN");
        $sym17$MAKE_SPARSE_VECTOR = SubLObjectFactory.makeSymbol("MAKE-SPARSE-VECTOR");
        $kw18$SLOT = SubLObjectFactory.makeKeyword("SLOT");
        $kw19$END = SubLObjectFactory.makeKeyword("END");
        $sym20$VISIT_DEFSTRUCT_OBJECT_SPARSE_VECTOR_METHOD = SubLObjectFactory.makeSymbol("VISIT-DEFSTRUCT-OBJECT-SPARSE-VECTOR-METHOD");
        $int21$50 = SubLObjectFactory.makeInteger(50);
        $sym22$VALID_HASH_TEST_P = SubLObjectFactory.makeSymbol("VALID-HASH-TEST-P");
        $sym23$INTEGERP = SubLObjectFactory.makeSymbol("INTEGERP");
        $str24$__SVECTOR__ = SubLObjectFactory.makeString("#<SVECTOR: ");
        $kw25$DO_HASH_TABLE = SubLObjectFactory.makeKeyword("DO-HASH-TABLE");
        $str26$____ = SubLObjectFactory.makeString(" -> ");
        $str27$__ = SubLObjectFactory.makeString(", ");
        $str28$___ = SubLObjectFactory.makeString("...");
        $str29$_ = SubLObjectFactory.makeString(">");
        $sym30$NUMBERP = SubLObjectFactory.makeSymbol("NUMBERP");
        $list31 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DIMENSION"), (SubLObject)SubLObjectFactory.makeSymbol("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("VECTOR")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $sym32$CDOHASH = SubLObjectFactory.makeSymbol("CDOHASH");
        $sym33$NON_EMPTY_LIST_P = SubLObjectFactory.makeSymbol("NON-EMPTY-LIST-P");
        $str34$_a_is_not_a_sparse_vector_with_te = SubLObjectFactory.makeString("~a is not a sparse vector with test ~a");
        $str35$Non_matching_vector_tests__a_and_ = SubLObjectFactory.makeString("Non-matching vector tests ~a and ~a");
        $int36$64 = SubLObjectFactory.makeInteger(64);
        $int37$65 = SubLObjectFactory.makeInteger(65);
        $sym38$CFASL_INPUT_SPARSE_VECTOR = SubLObjectFactory.makeSymbol("CFASL-INPUT-SPARSE-VECTOR");
        $sym39$CFASL_OUTPUT_OBJECT_SPARSE_VECTOR_METHOD = SubLObjectFactory.makeSymbol("CFASL-OUTPUT-OBJECT-SPARSE-VECTOR-METHOD");
    }
    
    public static final class $sparse_vector_native extends SubLStructNative
    {
        public SubLObject $magnitude;
        public SubLObject $dimensions;
        private static final SubLStructDeclNative structDecl;
        
        public $sparse_vector_native() {
            this.$magnitude = (SubLObject)CommonSymbols.NIL;
            this.$dimensions = (SubLObject)CommonSymbols.NIL;
        }
        
        public SubLStructDecl getStructDecl() {
            return (SubLStructDecl)$sparse_vector_native.structDecl;
        }
        
        public SubLObject getField2() {
            return this.$magnitude;
        }
        
        public SubLObject getField3() {
            return this.$dimensions;
        }
        
        public SubLObject setField2(final SubLObject value) {
            return this.$magnitude = value;
        }
        
        public SubLObject setField3(final SubLObject value) {
            return this.$dimensions = value;
        }
        
        static {
            structDecl = Structures.makeStructDeclNative((Class)$sparse_vector_native.class, sparse_vector.$sym0$SPARSE_VECTOR, sparse_vector.$sym1$SPARSE_VECTOR_P, sparse_vector.$list2, sparse_vector.$list3, new String[] { "$magnitude", "$dimensions" }, sparse_vector.$list4, sparse_vector.$list5, sparse_vector.$sym6$SVECTOR_PRINT);
        }
    }
    
    public static final class $sparse_vector_p$UnaryFunction extends UnaryFunction
    {
        public $sparse_vector_p$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("SPARSE-VECTOR-P"));
        }
        
        public SubLObject processItem(final SubLObject arg1) {
            return sparse_vector.sparse_vector_p(arg1);
        }
    }
}

/*

	Total time: 321 ms
	
*/