/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 */
package com.cyc.cycjava.cycl;


import static com.cyc.cycjava.cycl.access_macros.register_external_symbol;
import static com.cyc.cycjava.cycl.cyc_testing.generic_testing.define_test_case_table_int;
import static com.cyc.cycjava.cycl.subl_macro_promotions.$with_timeout_nesting_depth$;
import static com.cyc.cycjava.cycl.subl_macro_promotions.$within_with_timeout$;
import static com.cyc.cycjava.cycl.subl_macro_promotions.with_timeout_make_tag;
import static com.cyc.cycjava.cycl.subl_macro_promotions.with_timeout_start_timer;
import static com.cyc.cycjava.cycl.subl_macro_promotions.with_timeout_stop_timer;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.cons;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.listS;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.rplaca;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.rplacd;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.sublisp_throw;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions.funcall;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.add;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.symbol_function;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.$is_thread_performing_cleanupP$;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.getValuesAsVector;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.restoreValuesFromVector;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.values;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeBoolean;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeInteger;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeKeyword;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeString;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeSymbol;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.cdestructuring_bind_error;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.destructuring_bind_must_consp;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.cadr;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.cddr;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.copy_tree;
import static com.cyc.tool.subl.util.SubLFiles.declareFunction;
import static com.cyc.tool.subl.util.SubLFiles.declareMacro;
import static com.cyc.tool.subl.util.SubLFiles.defparameter;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.util.SubLFiles.LispMethod;
import com.cyc.tool.subl.util.SubLTranslatedFile;


public final class transform_list_utilities extends SubLTranslatedFile implements V12 {
    public static final SubLFile me = new transform_list_utilities();

 public static final String myName = "com.cyc.cycjava.cycl.transform_list_utilities";


    // defparameter
    // Definitions
    @LispMethod(comment = "defparameter")
    public static final SubLSymbol $default_recursion_limit$ = makeSymbol("*DEFAULT-RECURSION-LIMIT*");

    // defparameter
    @LispMethod(comment = "defparameter")
    public static final SubLSymbol $default_transformation_max$ = makeSymbol("*DEFAULT-TRANSFORMATION-MAX*");

    // defparameter
    @LispMethod(comment = "defparameter")
    public static final SubLSymbol $default_quiescent_transformation_max$ = makeSymbol("*DEFAULT-QUIESCENT-TRANSFORMATION-MAX*");

    @LispMethod(comment = "Internal Constants")
    // Internal Constants
    private static final SubLInteger $int$212 = makeInteger(212);

    private static final SubLInteger $int$1024 = makeInteger(1024);

    private static final SubLSymbol TRANSFORM = makeSymbol("TRANSFORM");

    private static final SubLSymbol NTRANSFORM = makeSymbol("NTRANSFORM");

    private static final SubLSymbol $TRANSFORMATION_LIMIT_EXCEEDED = makeKeyword("TRANSFORMATION-LIMIT-EXCEEDED");

    static private final SubLList $list5 = list(makeSymbol("NTRANSFORM-INFO"));

    static private final SubLList $list9 = list(makeSymbol("NTRANSFORM-INFO"), makeSymbol("NEW-PARENT-CONS"));

    static private final SubLList $list11 = list(makeSymbol("NTRANSFORM-INFO"), makeSymbol("NEW-SET-OP"));

    static private final SubLList $list13 = list(makeSymbol("NTRANSFORM-INFO"), makeSymbol("NEW-VALUE"));

    private static final SubLSymbol QUIESCENT_TRANSFORM = makeSymbol("QUIESCENT-TRANSFORM");

    private static final SubLSymbol QUIESCENT_NTRANSFORM = makeSymbol("QUIESCENT-NTRANSFORM");

    private static final SubLSymbol TEST_TRANSFORM = makeSymbol("TEST-TRANSFORM");

    private static final SubLList $list27 = list(list(list(list(ONE_INTEGER), makeSymbol("POSITIVE-INTEGER-LESS-THAN-1000-P"), makeSymbol("1+")), list(makeInteger(1000))), list(list(list(ONE_INTEGER, TWO_INTEGER, THREE_INTEGER), makeSymbol("POSITIVE-INTEGER-LESS-THAN-1000-P"), makeSymbol("1+")), list(makeInteger(1000), makeInteger(1000), makeInteger(1000))));

    public static final SubLObject transform_pred_funcall_alt(SubLObject pred, SubLObject v_object) {
        return eval_in_api.possibly_cyc_api_funcall_1(pred, v_object);
    }

    public static SubLObject transform_pred_funcall(final SubLObject pred, final SubLObject v_object) {
        return eval_in_api.possibly_cyc_api_funcall_1(pred, v_object);
    }

    public static final SubLObject transform_key_funcall_alt(SubLObject key, SubLObject v_object) {
        return eval_in_api.possibly_cyc_api_funcall_1(key, v_object);
    }

    public static SubLObject transform_key_funcall(final SubLObject key, final SubLObject v_object) {
        return eval_in_api.possibly_cyc_api_funcall_1(key, v_object);
    }

    public static final SubLObject transform_transform_funcall_alt(SubLObject transform, SubLObject v_object) {
        return eval_in_api.possibly_cyc_api_funcall_1(transform, v_object);
    }

    public static SubLObject transform_transform_funcall(final SubLObject transform, final SubLObject v_object) {
        return eval_in_api.possibly_cyc_api_funcall_1(transform, v_object);
    }

    public static final SubLObject transform_quiescence_funcall_alt(SubLObject quiescence, SubLObject previous, SubLObject v_new) {
        return eval_in_api.possibly_cyc_api_funcall_2(quiescence, previous, v_new);
    }

    public static SubLObject transform_quiescence_funcall(final SubLObject quiescence, final SubLObject previous, final SubLObject v_new) {
        return eval_in_api.possibly_cyc_api_funcall_2(quiescence, previous, v_new);
    }

    /**
     * Recursively descends through OBJECT, destructively applying TRANSFORM when PRED succeeds.
     * Make sure that the result of TRANSFORM will not succeed on PRED, otherwise it may 'infinitely' recurse.
     * example: (transform '(1 "2" (3 4 "5")) #'stringp 'read-from-string) -> (1 2 (3 4 5))
     *
     * @throws :transformation-limit-exceeded
     * 		
     * @unknown pace
     */
    @LispMethod(comment = "Recursively descends through OBJECT, destructively applying TRANSFORM when PRED succeeds.\r\nMake sure that the result of TRANSFORM will not succeed on PRED, otherwise it may \'infinitely\' recurse.\r\nexample: (transform \'(1 \"2\" (3 4 \"5\")) #\'stringp \'read-from-string) -> (1 2 (3 4 5))\r\n\r\n@throws :transformation-limit-exceeded\r\n\t\t\r\n@unknown pace\nRecursively descends through OBJECT, destructively applying TRANSFORM when PRED succeeds.\nMake sure that the result of TRANSFORM will not succeed on PRED, otherwise it may \'infinitely\' recurse.\nexample: (transform \'(1 \"2\" (3 4 \"5\")) #\'stringp \'read-from-string) -> (1 2 (3 4 5))")
    public static final SubLObject transform_alt(SubLObject v_object, SubLObject pred, SubLObject transform, SubLObject key) {
        if (key == UNPROVIDED) {
            key = symbol_function(IDENTITY);
        }
        return com.cyc.cycjava.cycl.transform_list_utilities.ntransform(copy_tree(v_object), pred, transform, key, UNPROVIDED, UNPROVIDED);
    }

    /**
     * Recursively descends through OBJECT, destructively applying TRANSFORM when PRED succeeds.
     * Make sure that the result of TRANSFORM will not succeed on PRED, otherwise it may 'infinitely' recurse.
     * example: (transform '(1 "2" (3 4 "5")) #'stringp 'read-from-string) -> (1 2 (3 4 5))
     *
     * @throws :transformation-limit-exceeded
     * 		
     * @unknown pace
     */
    @LispMethod(comment = "Recursively descends through OBJECT, destructively applying TRANSFORM when PRED succeeds.\r\nMake sure that the result of TRANSFORM will not succeed on PRED, otherwise it may \'infinitely\' recurse.\r\nexample: (transform \'(1 \"2\" (3 4 \"5\")) #\'stringp \'read-from-string) -> (1 2 (3 4 5))\r\n\r\n@throws :transformation-limit-exceeded\r\n\t\t\r\n@unknown pace\nRecursively descends through OBJECT, destructively applying TRANSFORM when PRED succeeds.\nMake sure that the result of TRANSFORM will not succeed on PRED, otherwise it may \'infinitely\' recurse.\nexample: (transform \'(1 \"2\" (3 4 \"5\")) #\'stringp \'read-from-string) -> (1 2 (3 4 5))")
    public static SubLObject transform(final SubLObject v_object, final SubLObject pred, final SubLObject transform, SubLObject key) {
        if (key == UNPROVIDED) {
            key = symbol_function(IDENTITY);
        }
        return ntransform(copy_tree(v_object), pred, transform, key, UNPROVIDED, UNPROVIDED);
    }

    /**
     * A destructive version of @xref transform.
     *
     * @param object;
     * 		The object to be transformed.
     * @param pred;
     * 		A predicate that returns true if an object is to be transformed by transform.
     * @param transform;
     * 		A function that returns the result of transforming an object.
     * @param key;
     * 		A function that maps an object to a value that is to be transformed.
     * @param recursion-limit;
     * 		The maximum depth that the algorithm is allowed to recurse.
     * 		Once this limit is exceeded, the transformation continues by means of an
     * 		iterative algorithm.
     * @param transformation-max;
     * 		The maximum number of transformations to be performed before
     * 		throwing :transformation-limit-exceeded.  If this parameter is given NIL as a value,
     * 		no limit is imposed on the number of transformations.
     * @throws :transformation-limit-exceeded
     * 		
     * @unknown sdevoy
     */
    @LispMethod(comment = "A destructive version of @xref transform.\r\n\r\n@param object;\r\n\t\tThe object to be transformed.\r\n@param pred;\r\n\t\tA predicate that returns true if an object is to be transformed by transform.\r\n@param transform;\r\n\t\tA function that returns the result of transforming an object.\r\n@param key;\r\n\t\tA function that maps an object to a value that is to be transformed.\r\n@param recursion-limit;\r\n\t\tThe maximum depth that the algorithm is allowed to recurse.\r\n\t\tOnce this limit is exceeded, the transformation continues by means of an\r\n\t\titerative algorithm.\r\n@param transformation-max;\r\n\t\tThe maximum number of transformations to be performed before\r\n\t\tthrowing :transformation-limit-exceeded.  If this parameter is given NIL as a value,\r\n\t\tno limit is imposed on the number of transformations.\r\n@throws :transformation-limit-exceeded\r\n\t\t\r\n@unknown sdevoy")
    public static final SubLObject ntransform_alt(SubLObject v_object, SubLObject pred, SubLObject transform, SubLObject key, SubLObject recursion_limit, SubLObject transformation_max) {
        if (key == UNPROVIDED) {
            key = symbol_function(IDENTITY);
        }
        if (recursion_limit == UNPROVIDED) {
            recursion_limit = $default_recursion_limit$.getDynamicValue();
        }
        if (transformation_max == UNPROVIDED) {
            transformation_max = $default_transformation_max$.getDynamicValue();
        }
        return NIL != transformation_max ? ((SubLObject) (com.cyc.cycjava.cycl.transform_list_utilities.shy_ntransform_recursive(v_object, pred, transform, key, recursion_limit, ZERO_INTEGER, transformation_max, ZERO_INTEGER))) : com.cyc.cycjava.cycl.transform_list_utilities.ntransform_recursive(v_object, pred, transform, key, recursion_limit, ZERO_INTEGER);
    }

    /**
     * A destructive version of @xref transform.
     *
     * @param object;
     * 		The object to be transformed.
     * @param pred;
     * 		A predicate that returns true if an object is to be transformed by transform.
     * @param transform;
     * 		A function that returns the result of transforming an object.
     * @param key;
     * 		A function that maps an object to a value that is to be transformed.
     * @param recursion-limit;
     * 		The maximum depth that the algorithm is allowed to recurse.
     * 		Once this limit is exceeded, the transformation continues by means of an
     * 		iterative algorithm.
     * @param transformation-max;
     * 		The maximum number of transformations to be performed before
     * 		throwing :transformation-limit-exceeded.  If this parameter is given NIL as a value,
     * 		no limit is imposed on the number of transformations.
     * @throws :transformation-limit-exceeded
     * 		
     * @unknown sdevoy
     */
    @LispMethod(comment = "A destructive version of @xref transform.\r\n\r\n@param object;\r\n\t\tThe object to be transformed.\r\n@param pred;\r\n\t\tA predicate that returns true if an object is to be transformed by transform.\r\n@param transform;\r\n\t\tA function that returns the result of transforming an object.\r\n@param key;\r\n\t\tA function that maps an object to a value that is to be transformed.\r\n@param recursion-limit;\r\n\t\tThe maximum depth that the algorithm is allowed to recurse.\r\n\t\tOnce this limit is exceeded, the transformation continues by means of an\r\n\t\titerative algorithm.\r\n@param transformation-max;\r\n\t\tThe maximum number of transformations to be performed before\r\n\t\tthrowing :transformation-limit-exceeded.  If this parameter is given NIL as a value,\r\n\t\tno limit is imposed on the number of transformations.\r\n@throws :transformation-limit-exceeded\r\n\t\t\r\n@unknown sdevoy")
    public static SubLObject ntransform(final SubLObject v_object, final SubLObject pred, final SubLObject transform, SubLObject key, SubLObject recursion_limit, SubLObject transformation_max) {
        if (key == UNPROVIDED) {
            key = symbol_function(IDENTITY);
        }
        if (recursion_limit == UNPROVIDED) {
            recursion_limit = $default_recursion_limit$.getDynamicValue();
        }
        if (transformation_max == UNPROVIDED) {
            transformation_max = $default_transformation_max$.getDynamicValue();
        }
        return NIL != transformation_max ? shy_ntransform_recursive(v_object, pred, transform, key, recursion_limit, ZERO_INTEGER, transformation_max, ZERO_INTEGER) : ntransform_recursive(v_object, pred, transform, key, recursion_limit, ZERO_INTEGER);
    }

    /**
     * A destructive recursive version of $xref transform.
     * This function transforms as it iterates down the cdr of transformations and recurses as it
     * transforms their cars.  When the recusion limit is reached, it switches to a purely iterative
     * algorithm by calling ntransform-iterative.
     *
     * @unknown sdevoy
     */
    @LispMethod(comment = "A destructive recursive version of $xref transform.\r\nThis function transforms as it iterates down the cdr of transformations and recurses as it\r\ntransforms their cars.  When the recusion limit is reached, it switches to a purely iterative\r\nalgorithm by calling ntransform-iterative.\r\n\r\n@unknown sdevoy\nA destructive recursive version of $xref transform.\nThis function transforms as it iterates down the cdr of transformations and recurses as it\ntransforms their cars.  When the recusion limit is reached, it switches to a purely iterative\nalgorithm by calling ntransform-iterative.")
    public static final SubLObject ntransform_recursive_alt(SubLObject v_object, SubLObject pred, SubLObject transform, SubLObject key, SubLObject recursion_limit, SubLObject recursion_level) {
        if (recursion_level.numGE(recursion_limit)) {
            return com.cyc.cycjava.cycl.transform_list_utilities.ntransform_iterative(v_object, pred, transform, key);
        } else {
            {
                SubLObject initial_transformed_object = com.cyc.cycjava.cycl.transform_list_utilities.ntransform_perform_transform(v_object, pred, transform, key);
                SubLObject transformed_list_tail = initial_transformed_object;
                for (; !transformed_list_tail.isAtom();) {
                    rplaca(transformed_list_tail, com.cyc.cycjava.cycl.transform_list_utilities.ntransform_recursive(transformed_list_tail.first(), pred, transform, key, recursion_limit, add(recursion_level, ONE_INTEGER)));
                    rplacd(transformed_list_tail, com.cyc.cycjava.cycl.transform_list_utilities.ntransform_perform_transform(transformed_list_tail.rest(), pred, transform, key));
                    transformed_list_tail = transformed_list_tail.rest();
                }
                return initial_transformed_object;
            }
        }
    }

    /**
     * A destructive recursive version of $xref transform.
     * This function transforms as it iterates down the cdr of transformations and recurses as it
     * transforms their cars.  When the recusion limit is reached, it switches to a purely iterative
     * algorithm by calling ntransform-iterative.
     *
     * @unknown sdevoy
     */
    @LispMethod(comment = "A destructive recursive version of $xref transform.\r\nThis function transforms as it iterates down the cdr of transformations and recurses as it\r\ntransforms their cars.  When the recusion limit is reached, it switches to a purely iterative\r\nalgorithm by calling ntransform-iterative.\r\n\r\n@unknown sdevoy\nA destructive recursive version of $xref transform.\nThis function transforms as it iterates down the cdr of transformations and recurses as it\ntransforms their cars.  When the recusion limit is reached, it switches to a purely iterative\nalgorithm by calling ntransform-iterative.")
    public static SubLObject ntransform_recursive(final SubLObject v_object, final SubLObject pred, final SubLObject transform, final SubLObject key, final SubLObject recursion_limit, final SubLObject recursion_level) {
        if (recursion_level.numGE(recursion_limit)) {
            return ntransform_iterative(v_object, pred, transform, key);
        }
        SubLObject transformed_list_tail;
        SubLObject initial_transformed_object;
        for (initial_transformed_object = transformed_list_tail = ntransform_perform_transform(v_object, pred, transform, key); !transformed_list_tail.isAtom(); transformed_list_tail = transformed_list_tail.rest()) {
            rplaca(transformed_list_tail, ntransform_recursive(transformed_list_tail.first(), pred, transform, key, recursion_limit, add(recursion_level, ONE_INTEGER)));
            rplacd(transformed_list_tail, ntransform_perform_transform(transformed_list_tail.rest(), pred, transform, key));
        }
        return initial_transformed_object;
    }

    /**
     * A destructive recursive version of $xref transform.
     * This function transforms as it iterates down the cdr of transformations and recurses as it
     * transforms their cars.  When the recusion limit is reached, it switches to a purely iterative
     * algorithm by calling ntransform-iterative.
     *
     * @unknown sdevoy
     */
    @LispMethod(comment = "A destructive recursive version of $xref transform.\r\nThis function transforms as it iterates down the cdr of transformations and recurses as it\r\ntransforms their cars.  When the recusion limit is reached, it switches to a purely iterative\r\nalgorithm by calling ntransform-iterative.\r\n\r\n@unknown sdevoy\nA destructive recursive version of $xref transform.\nThis function transforms as it iterates down the cdr of transformations and recurses as it\ntransforms their cars.  When the recusion limit is reached, it switches to a purely iterative\nalgorithm by calling ntransform-iterative.")
    public static final SubLObject shy_ntransform_recursive_alt(SubLObject v_object, SubLObject pred, SubLObject transform, SubLObject key, SubLObject recursion_limit, SubLObject recursion_level, SubLObject transformation_max, SubLObject transformation_count) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (recursion_level.numGE(recursion_limit)) {
                return com.cyc.cycjava.cycl.transform_list_utilities.shy_ntransform_iterative(v_object, pred, transform, key, transformation_max, transformation_count);
            } else {
                thread.resetMultipleValues();
                {
                    SubLObject initial_transformed_object = com.cyc.cycjava.cycl.transform_list_utilities.shy_ntransform_perform_transform(v_object, pred, transform, key, transformation_max, transformation_count);
                    SubLObject new_transformation_count = thread.secondMultipleValue();
                    thread.resetMultipleValues();
                    {
                        SubLObject transformed_list_tail = initial_transformed_object;
                        SubLObject next_transformation = NIL;
                        for (; !transformed_list_tail.isAtom();) {
                            thread.resetMultipleValues();
                            {
                                SubLObject next_transformation_1 = com.cyc.cycjava.cycl.transform_list_utilities.shy_ntransform_recursive(transformed_list_tail.first(), pred, transform, key, recursion_limit, add(recursion_level, ONE_INTEGER), transformation_max, new_transformation_count);
                                SubLObject new_transformation_count_2 = thread.secondMultipleValue();
                                thread.resetMultipleValues();
                                next_transformation = next_transformation_1;
                                new_transformation_count = new_transformation_count_2;
                            }
                            rplaca(transformed_list_tail, next_transformation);
                            thread.resetMultipleValues();
                            {
                                SubLObject next_transformation_3 = com.cyc.cycjava.cycl.transform_list_utilities.shy_ntransform_perform_transform(transformed_list_tail.rest(), pred, transform, key, transformation_max, new_transformation_count);
                                SubLObject new_transformation_count_4 = thread.secondMultipleValue();
                                thread.resetMultipleValues();
                                next_transformation = next_transformation_3;
                                new_transformation_count = new_transformation_count_4;
                            }
                            rplacd(transformed_list_tail, next_transformation);
                            transformed_list_tail = transformed_list_tail.rest();
                        }
                        return values(initial_transformed_object, new_transformation_count);
                    }
                }
            }
        }
    }

    /**
     * A destructive recursive version of $xref transform.
     * This function transforms as it iterates down the cdr of transformations and recurses as it
     * transforms their cars.  When the recusion limit is reached, it switches to a purely iterative
     * algorithm by calling ntransform-iterative.
     *
     * @unknown sdevoy
     */
    @LispMethod(comment = "A destructive recursive version of $xref transform.\r\nThis function transforms as it iterates down the cdr of transformations and recurses as it\r\ntransforms their cars.  When the recusion limit is reached, it switches to a purely iterative\r\nalgorithm by calling ntransform-iterative.\r\n\r\n@unknown sdevoy\nA destructive recursive version of $xref transform.\nThis function transforms as it iterates down the cdr of transformations and recurses as it\ntransforms their cars.  When the recusion limit is reached, it switches to a purely iterative\nalgorithm by calling ntransform-iterative.")
    public static SubLObject shy_ntransform_recursive(final SubLObject v_object, final SubLObject pred, final SubLObject transform, final SubLObject key, final SubLObject recursion_limit, final SubLObject recursion_level, final SubLObject transformation_max, final SubLObject transformation_count) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (recursion_level.numGE(recursion_limit)) {
            return shy_ntransform_iterative(v_object, pred, transform, key, transformation_max, transformation_count);
        }
        thread.resetMultipleValues();
        final SubLObject initial_transformed_object = shy_ntransform_perform_transform(v_object, pred, transform, key, transformation_max, transformation_count);
        SubLObject new_transformation_count = thread.secondMultipleValue();
        thread.resetMultipleValues();
        SubLObject transformed_list_tail = initial_transformed_object;
        SubLObject next_transformation = NIL;
        while (!transformed_list_tail.isAtom()) {
            thread.resetMultipleValues();
            final SubLObject next_transformation_$1 = shy_ntransform_recursive(transformed_list_tail.first(), pred, transform, key, recursion_limit, add(recursion_level, ONE_INTEGER), transformation_max, new_transformation_count);
            final SubLObject new_transformation_count_$2 = thread.secondMultipleValue();
            thread.resetMultipleValues();
            next_transformation = next_transformation_$1;
            new_transformation_count = new_transformation_count_$2;
            rplaca(transformed_list_tail, next_transformation);
            thread.resetMultipleValues();
            final SubLObject next_transformation_$2 = shy_ntransform_perform_transform(transformed_list_tail.rest(), pred, transform, key, transformation_max, new_transformation_count);
            final SubLObject new_transformation_count_$3 = thread.secondMultipleValue();
            thread.resetMultipleValues();
            next_transformation = next_transformation_$2;
            new_transformation_count = new_transformation_count_$3;
            rplacd(transformed_list_tail, next_transformation);
            transformed_list_tail = transformed_list_tail.rest();
        } 
        return values(initial_transformed_object, new_transformation_count);
    }

    public static final SubLObject ntransform_perform_transform_alt(SubLObject v_object, SubLObject pred, SubLObject transform, SubLObject key) {
        if (key.eql(symbol_function(IDENTITY)) || key.eql(IDENTITY)) {
            {
                SubLObject previous_transformation = v_object;
                SubLObject transformation = NIL;
                for (transformation = (NIL != com.cyc.cycjava.cycl.transform_list_utilities.transform_pred_funcall(pred, v_object)) ? ((SubLObject) (copy_tree(com.cyc.cycjava.cycl.transform_list_utilities.transform_transform_funcall(transform, v_object)))) : v_object; previous_transformation != transformation; transformation = (NIL != com.cyc.cycjava.cycl.transform_list_utilities.transform_pred_funcall(pred, transformation)) ? ((SubLObject) (copy_tree(com.cyc.cycjava.cycl.transform_list_utilities.transform_transform_funcall(transform, transformation)))) : transformation) {
                    previous_transformation = transformation;
                }
                return transformation;
            }
        } else {
            {
                SubLObject previous_transformation = v_object;
                SubLObject transformation = NIL;
                for (transformation = (NIL != com.cyc.cycjava.cycl.transform_list_utilities.transform_pred_funcall(pred, v_object)) ? ((SubLObject) (copy_tree(com.cyc.cycjava.cycl.transform_list_utilities.transform_transform_funcall(transform, com.cyc.cycjava.cycl.transform_list_utilities.transform_key_funcall(key, v_object))))) : v_object; previous_transformation != transformation; transformation = (NIL != com.cyc.cycjava.cycl.transform_list_utilities.transform_pred_funcall(pred, transformation)) ? ((SubLObject) (copy_tree(com.cyc.cycjava.cycl.transform_list_utilities.transform_transform_funcall(transform, com.cyc.cycjava.cycl.transform_list_utilities.transform_key_funcall(key, transformation))))) : transformation) {
                    previous_transformation = transformation;
                }
                return transformation;
            }
        }
    }

    public static SubLObject ntransform_perform_transform(final SubLObject v_object, final SubLObject pred, final SubLObject transform, final SubLObject key) {
        if (key.eql(symbol_function(IDENTITY)) || key.eql(IDENTITY)) {
            SubLObject previous_transformation;
            SubLObject transformation;
            for (previous_transformation = v_object, transformation = NIL, transformation = (NIL != transform_pred_funcall(pred, v_object)) ? copy_tree(transform_transform_funcall(transform, v_object)) : v_object; !previous_transformation.eql(transformation); previous_transformation = transformation , transformation = (NIL != transform_pred_funcall(pred, transformation)) ? copy_tree(transform_transform_funcall(transform, transformation)) : transformation) {
            }
            return transformation;
        }
        SubLObject previous_transformation;
        SubLObject transformation;
        for (previous_transformation = v_object, transformation = NIL, transformation = (NIL != transform_pred_funcall(pred, v_object)) ? copy_tree(transform_transform_funcall(transform, transform_key_funcall(key, v_object))) : v_object; !previous_transformation.eql(transformation); previous_transformation = transformation , transformation = (NIL != transform_pred_funcall(pred, transformation)) ? copy_tree(transform_transform_funcall(transform, transform_key_funcall(key, transformation))) : transformation) {
        }
        return transformation;
    }

    public static final SubLObject shy_ntransform_perform_transform_alt(SubLObject v_object, SubLObject pred, SubLObject transform, SubLObject key, SubLObject transformation_max, SubLObject transformation_count) {
        if (key.eql(symbol_function(IDENTITY)) || key.eql(IDENTITY)) {
            {
                SubLObject previous_transformation = v_object;
                SubLObject transformation = NIL;
                for (transformation = (NIL != com.cyc.cycjava.cycl.transform_list_utilities.transform_pred_funcall(pred, v_object)) ? ((SubLObject) (copy_tree(com.cyc.cycjava.cycl.transform_list_utilities.transform_transform_funcall(transform, v_object)))) : v_object; !previous_transformation.eql(transformation); transformation = (NIL != com.cyc.cycjava.cycl.transform_list_utilities.transform_pred_funcall(pred, transformation)) ? ((SubLObject) (copy_tree(com.cyc.cycjava.cycl.transform_list_utilities.transform_transform_funcall(transform, transformation)))) : transformation) {
                    if (transformation_count.numGE(transformation_max)) {
                        sublisp_throw($TRANSFORMATION_LIMIT_EXCEEDED, list($TRANSFORMATION_LIMIT_EXCEEDED, transformation_count, transformation_max));
                    }
                    transformation_count = add(transformation_count, ONE_INTEGER);
                    previous_transformation = transformation;
                }
                return values(transformation, transformation_count);
            }
        } else {
            {
                SubLObject previous_transformation = v_object;
                SubLObject transformation = NIL;
                for (transformation = (NIL != com.cyc.cycjava.cycl.transform_list_utilities.transform_pred_funcall(pred, v_object)) ? ((SubLObject) (copy_tree(com.cyc.cycjava.cycl.transform_list_utilities.transform_transform_funcall(transform, com.cyc.cycjava.cycl.transform_list_utilities.transform_key_funcall(key, v_object))))) : v_object; !previous_transformation.eql(transformation); transformation = (NIL != com.cyc.cycjava.cycl.transform_list_utilities.transform_pred_funcall(pred, transformation)) ? ((SubLObject) (copy_tree(com.cyc.cycjava.cycl.transform_list_utilities.transform_transform_funcall(transform, com.cyc.cycjava.cycl.transform_list_utilities.transform_key_funcall(key, transformation))))) : transformation) {
                    if (transformation_count.numGE(transformation_max)) {
                        sublisp_throw($TRANSFORMATION_LIMIT_EXCEEDED, list($TRANSFORMATION_LIMIT_EXCEEDED, transformation_count, transformation_max));
                    }
                    transformation_count = add(transformation_count, ONE_INTEGER);
                    previous_transformation = transformation;
                }
                return values(transformation, transformation_count);
            }
        }
    }

    public static SubLObject shy_ntransform_perform_transform(final SubLObject v_object, final SubLObject pred, final SubLObject transform, final SubLObject key, final SubLObject transformation_max, SubLObject transformation_count) {
        if (key.eql(symbol_function(IDENTITY)) || key.eql(IDENTITY)) {
            SubLObject previous_transformation;
            SubLObject transformation;
            for (previous_transformation = v_object, transformation = NIL, transformation = (NIL != transform_pred_funcall(pred, v_object)) ? copy_tree(transform_transform_funcall(transform, v_object)) : v_object; !previous_transformation.eql(transformation); previous_transformation = transformation , transformation = (NIL != transform_pred_funcall(pred, transformation)) ? copy_tree(transform_transform_funcall(transform, transformation)) : transformation) {
                if (transformation_count.numGE(transformation_max)) {
                    sublisp_throw($TRANSFORMATION_LIMIT_EXCEEDED, list($TRANSFORMATION_LIMIT_EXCEEDED, transformation_count, transformation_max));
                }
                transformation_count = add(transformation_count, ONE_INTEGER);
            }
            return values(transformation, transformation_count);
        }
        SubLObject previous_transformation;
        SubLObject transformation;
        for (previous_transformation = v_object, transformation = NIL, transformation = (NIL != transform_pred_funcall(pred, v_object)) ? copy_tree(transform_transform_funcall(transform, transform_key_funcall(key, v_object))) : v_object; !previous_transformation.eql(transformation); previous_transformation = transformation , transformation = (NIL != transform_pred_funcall(pred, transformation)) ? copy_tree(transform_transform_funcall(transform, transform_key_funcall(key, transformation))) : transformation) {
            if (transformation_count.numGE(transformation_max)) {
                sublisp_throw($TRANSFORMATION_LIMIT_EXCEEDED, list($TRANSFORMATION_LIMIT_EXCEEDED, transformation_count, transformation_max));
            }
            transformation_count = add(transformation_count, ONE_INTEGER);
        }
        return values(transformation, transformation_count);
    }

    public static final SubLObject make_ntransform_info_alt(SubLObject parent_cons, SubLObject set_op, SubLObject value) {
        return listS(parent_cons, set_op, value);
    }

    public static SubLObject make_ntransform_info(final SubLObject parent_cons, final SubLObject set_op, final SubLObject value) {
        return listS(parent_cons, set_op, value);
    }

    public static final SubLObject reuse_ntransform_info_alt(SubLObject info, SubLObject parent_cons, SubLObject set_op, SubLObject value) {
        {
            SubLObject rest_of_info = info.rest();
            rplaca(info, parent_cons);
            rplaca(rest_of_info, set_op);
            rplacd(rest_of_info, value);
            return info;
        }
    }

    public static SubLObject reuse_ntransform_info(final SubLObject info, final SubLObject parent_cons, final SubLObject set_op, final SubLObject value) {
        final SubLObject rest_of_info = info.rest();
        rplaca(info, parent_cons);
        rplaca(rest_of_info, set_op);
        rplacd(rest_of_info, value);
        return info;
    }

    public static final SubLObject get_ntransform_info_parent_cons_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject ntransform_info = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt5);
            ntransform_info = current.first();
            current = current.rest();
            if (NIL == current) {
                return list(CAR, ntransform_info);
            } else {
                cdestructuring_bind_error(datum, $list_alt5);
            }
        }
        return NIL;
    }

    public static SubLObject get_ntransform_info_parent_cons(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject ntransform_info = NIL;
        destructuring_bind_must_consp(current, datum, $list5);
        ntransform_info = current.first();
        current = current.rest();
        if (NIL == current) {
            return list(CAR, ntransform_info);
        }
        cdestructuring_bind_error(datum, $list5);
        return NIL;
    }

    public static final SubLObject get_ntransform_info_set_op_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject ntransform_info = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt5);
            ntransform_info = current.first();
            current = current.rest();
            if (NIL == current) {
                return list(CADR, ntransform_info);
            } else {
                cdestructuring_bind_error(datum, $list_alt5);
            }
        }
        return NIL;
    }

    public static SubLObject get_ntransform_info_set_op(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject ntransform_info = NIL;
        destructuring_bind_must_consp(current, datum, $list5);
        ntransform_info = current.first();
        current = current.rest();
        if (NIL == current) {
            return list(CADR, ntransform_info);
        }
        cdestructuring_bind_error(datum, $list5);
        return NIL;
    }

    public static final SubLObject get_ntransform_info_value_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject ntransform_info = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt5);
            ntransform_info = current.first();
            current = current.rest();
            if (NIL == current) {
                return list(CDDR, ntransform_info);
            } else {
                cdestructuring_bind_error(datum, $list_alt5);
            }
        }
        return NIL;
    }

    public static SubLObject get_ntransform_info_value(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject ntransform_info = NIL;
        destructuring_bind_must_consp(current, datum, $list5);
        ntransform_info = current.first();
        current = current.rest();
        if (NIL == current) {
            return list(CDDR, ntransform_info);
        }
        cdestructuring_bind_error(datum, $list5);
        return NIL;
    }

    public static final SubLObject set_ntransform_info_parent_cons_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject ntransform_info = NIL;
            SubLObject new_parent_cons = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt9);
            ntransform_info = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt9);
            new_parent_cons = current.first();
            current = current.rest();
            if (NIL == current) {
                return list(RPLACA, ntransform_info, new_parent_cons);
            } else {
                cdestructuring_bind_error(datum, $list_alt9);
            }
        }
        return NIL;
    }

    public static SubLObject set_ntransform_info_parent_cons(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject ntransform_info = NIL;
        SubLObject new_parent_cons = NIL;
        destructuring_bind_must_consp(current, datum, $list9);
        ntransform_info = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list9);
        new_parent_cons = current.first();
        current = current.rest();
        if (NIL == current) {
            return list(RPLACA, ntransform_info, new_parent_cons);
        }
        cdestructuring_bind_error(datum, $list9);
        return NIL;
    }

    public static final SubLObject set_ntransform_info_set_op_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject ntransform_info = NIL;
            SubLObject new_set_op = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt11);
            ntransform_info = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt11);
            new_set_op = current.first();
            current = current.rest();
            if (NIL == current) {
                return list(RPLACA, list(CDR, ntransform_info), new_set_op);
            } else {
                cdestructuring_bind_error(datum, $list_alt11);
            }
        }
        return NIL;
    }

    public static SubLObject set_ntransform_info_set_op(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject ntransform_info = NIL;
        SubLObject new_set_op = NIL;
        destructuring_bind_must_consp(current, datum, $list11);
        ntransform_info = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list11);
        new_set_op = current.first();
        current = current.rest();
        if (NIL == current) {
            return list(RPLACA, list(CDR, ntransform_info), new_set_op);
        }
        cdestructuring_bind_error(datum, $list11);
        return NIL;
    }

    public static final SubLObject set_ntransform_info_value_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject ntransform_info = NIL;
            SubLObject new_value = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt13);
            ntransform_info = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt13);
            new_value = current.first();
            current = current.rest();
            if (NIL == current) {
                return list(RPLACD, list(CDR, ntransform_info), new_value);
            } else {
                cdestructuring_bind_error(datum, $list_alt13);
            }
        }
        return NIL;
    }

    public static SubLObject set_ntransform_info_value(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject ntransform_info = NIL;
        SubLObject new_value = NIL;
        destructuring_bind_must_consp(current, datum, $list13);
        ntransform_info = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list13);
        new_value = current.first();
        current = current.rest();
        if (NIL == current) {
            return list(RPLACD, list(CDR, ntransform_info), new_value);
        }
        cdestructuring_bind_error(datum, $list13);
        return NIL;
    }

    /**
     * A destructive version of @xref transform.
     * This function is purely iterative.  While it tries to reuse whatever conses it can,
     * it still is a consing algorithm, thus it is only called when the depth of recursion
     * of ntransform-recursive reaches a predefined limit.
     *
     * @unknown sdevoy
     */
    @LispMethod(comment = "A destructive version of @xref transform.\r\nThis function is purely iterative.  While it tries to reuse whatever conses it can,\r\nit still is a consing algorithm, thus it is only called when the depth of recursion\r\nof ntransform-recursive reaches a predefined limit.\r\n\r\n@unknown sdevoy\nA destructive version of @xref transform.\nThis function is purely iterative.  While it tries to reuse whatever conses it can,\nit still is a consing algorithm, thus it is only called when the depth of recursion\nof ntransform-recursive reaches a predefined limit.")
    public static final SubLObject ntransform_iterative_alt(SubLObject v_object, SubLObject pred, SubLObject transform, SubLObject key) {
        if (key == UNPROVIDED) {
            key = symbol_function(IDENTITY);
        }
        {
            SubLObject new_root = NIL;
            new_root = com.cyc.cycjava.cycl.transform_list_utilities.ntransform_perform_transform(v_object, pred, transform, key);
            if (new_root.isAtom()) {
                return new_root;
            } else {
                {
                    SubLObject parent_cons = NIL;
                    SubLObject set_op = NIL;
                    SubLObject value = NIL;
                    SubLObject new_value = NIL;
                    SubLObject old_cons = NIL;
                    SubLObject queue = NIL;
                    SubLObject current = NIL;
                    for (queue = list(com.cyc.cycjava.cycl.transform_list_utilities.make_ntransform_info(new_root, symbol_function(RPLACA), new_root.first()), com.cyc.cycjava.cycl.transform_list_utilities.make_ntransform_info(new_root, symbol_function(RPLACD), new_root.rest())), current = queue.first(); NIL != queue; queue = queue , current = queue.first()) {
                        old_cons = queue;
                        queue = queue.rest();
                        parent_cons = current.first();
                        set_op = cadr(current);
                        value = cddr(current);
                        new_value = com.cyc.cycjava.cycl.transform_list_utilities.ntransform_perform_transform(value, pred, transform, key);
                        funcall(set_op, parent_cons, new_value);
                        if (!new_value.isAtom()) {
                            queue = list_utilities.recons(com.cyc.cycjava.cycl.transform_list_utilities.make_ntransform_info(new_value, symbol_function(RPLACA), new_value.first()), cons(com.cyc.cycjava.cycl.transform_list_utilities.reuse_ntransform_info(current, new_value, symbol_function(RPLACD), new_value.rest()), queue), old_cons);
                        }
                    }
                    return new_root;
                }
            }
        }
    }

    @LispMethod(comment = "A destructive version of @xref transform.\r\nThis function is purely iterative.  While it tries to reuse whatever conses it can,\r\nit still is a consing algorithm, thus it is only called when the depth of recursion\r\nof ntransform-recursive reaches a predefined limit.\r\n\r\n@unknown sdevoy\nA destructive version of @xref transform.\nThis function is purely iterative.  While it tries to reuse whatever conses it can,\nit still is a consing algorithm, thus it is only called when the depth of recursion\nof ntransform-recursive reaches a predefined limit.")
    public static SubLObject ntransform_iterative(final SubLObject v_object, final SubLObject pred, final SubLObject transform, SubLObject key) {
        if (key == UNPROVIDED) {
            key = symbol_function(IDENTITY);
        }
        SubLObject new_root = NIL;
        new_root = ntransform_perform_transform(v_object, pred, transform, key);
        if (new_root.isAtom()) {
            return new_root;
        }
        SubLObject parent_cons = NIL;
        SubLObject set_op = NIL;
        SubLObject value = NIL;
        SubLObject new_value = NIL;
        SubLObject old_cons = NIL;
        SubLObject queue = NIL;
        SubLObject current = NIL;
        queue = list(make_ntransform_info(new_root, symbol_function(RPLACA), new_root.first()), make_ntransform_info(new_root, symbol_function(RPLACD), new_root.rest()));
        current = queue.first();
        while (NIL != queue) {
            old_cons = queue;
            queue = queue.rest();
            parent_cons = current.first();
            set_op = cadr(current);
            value = cddr(current);
            new_value = ntransform_perform_transform(value, pred, transform, key);
            funcall(set_op, parent_cons, new_value);
            if (!new_value.isAtom()) {
                queue = list_utilities.recons(make_ntransform_info(new_value, symbol_function(RPLACA), new_value.first()), cons(reuse_ntransform_info(current, new_value, symbol_function(RPLACD), new_value.rest()), queue), old_cons);
            }
            // queue = queue;
            current = queue.first();
        } 
        return new_root;
    }/**
     * A destructive version of @xref transform.
     * This function is purely iterative.  While it tries to reuse whatever conses it can,
     * it still is a consing algorithm, thus it is only called when the depth of recursion
     * of ntransform-recursive reaches a predefined limit.
     *
     * @unknown sdevoy
     */


    /**
     * A destructive version of @xref transform.
     * This function is purely iterative.  While it tries to reuse whatever conses it can,
     * it still is a consing algorithm, thus it is only called when the depth of recursion
     * of ntransform-recursive reaches a predefined limit.
     *
     * @unknown sdevoy
     */
    @LispMethod(comment = "A destructive version of @xref transform.\r\nThis function is purely iterative.  While it tries to reuse whatever conses it can,\r\nit still is a consing algorithm, thus it is only called when the depth of recursion\r\nof ntransform-recursive reaches a predefined limit.\r\n\r\n@unknown sdevoy\nA destructive version of @xref transform.\nThis function is purely iterative.  While it tries to reuse whatever conses it can,\nit still is a consing algorithm, thus it is only called when the depth of recursion\nof ntransform-recursive reaches a predefined limit.")
    public static final SubLObject shy_ntransform_iterative_alt(SubLObject v_object, SubLObject pred, SubLObject transform, SubLObject key, SubLObject transformation_max, SubLObject transformation_count) {
        if (key == UNPROVIDED) {
            key = symbol_function(IDENTITY);
        }
        if (transformation_max == UNPROVIDED) {
            transformation_max = $default_transformation_max$.getDynamicValue();
        }
        if (transformation_count == UNPROVIDED) {
            transformation_count = ZERO_INTEGER;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            thread.resetMultipleValues();
            {
                SubLObject new_root = com.cyc.cycjava.cycl.transform_list_utilities.shy_ntransform_perform_transform(v_object, pred, transform, key, transformation_max, transformation_count);
                SubLObject new_transformation_count = thread.secondMultipleValue();
                thread.resetMultipleValues();
                if (new_root.isAtom()) {
                    return new_root;
                } else {
                    {
                        SubLObject parent_cons = NIL;
                        SubLObject set_op = NIL;
                        SubLObject value = NIL;
                        SubLObject new_value = NIL;
                        SubLObject old_cons = NIL;
                        SubLObject queue = NIL;
                        SubLObject current = NIL;
                        for (queue = list(com.cyc.cycjava.cycl.transform_list_utilities.make_ntransform_info(new_root, symbol_function(RPLACA), new_root.first()), com.cyc.cycjava.cycl.transform_list_utilities.make_ntransform_info(new_root, symbol_function(RPLACD), new_root.rest())), current = queue.first(); NIL != queue; queue = queue , current = queue.first()) {
                            old_cons = queue;
                            queue = queue.rest();
                            parent_cons = current.first();
                            set_op = cadr(current);
                            value = cddr(current);
                            thread.resetMultipleValues();
                            {
                                SubLObject new_value_5 = com.cyc.cycjava.cycl.transform_list_utilities.shy_ntransform_perform_transform(value, pred, transform, key, transformation_max, new_transformation_count);
                                SubLObject new_transformation_count_6 = thread.secondMultipleValue();
                                thread.resetMultipleValues();
                                new_value = new_value_5;
                                new_transformation_count = new_transformation_count_6;
                            }
                            funcall(set_op, parent_cons, new_value);
                            if (!new_value.isAtom()) {
                                queue = list_utilities.recons(com.cyc.cycjava.cycl.transform_list_utilities.make_ntransform_info(new_value, symbol_function(RPLACA), new_value.first()), cons(com.cyc.cycjava.cycl.transform_list_utilities.reuse_ntransform_info(current, new_value, symbol_function(RPLACD), new_value.rest()), queue), old_cons);
                            }
                        }
                        return new_root;
                    }
                }
            }
        }
    }

    @LispMethod(comment = "A destructive version of @xref transform.\r\nThis function is purely iterative.  While it tries to reuse whatever conses it can,\r\nit still is a consing algorithm, thus it is only called when the depth of recursion\r\nof ntransform-recursive reaches a predefined limit.\r\n\r\n@unknown sdevoy\nA destructive version of @xref transform.\nThis function is purely iterative.  While it tries to reuse whatever conses it can,\nit still is a consing algorithm, thus it is only called when the depth of recursion\nof ntransform-recursive reaches a predefined limit.")
    public static SubLObject shy_ntransform_iterative(final SubLObject v_object, final SubLObject pred, final SubLObject transform, SubLObject key, SubLObject transformation_max, SubLObject transformation_count) {
        if (key == UNPROVIDED) {
            key = symbol_function(IDENTITY);
        }
        if (transformation_max == UNPROVIDED) {
            transformation_max = $default_transformation_max$.getDynamicValue();
        }
        if (transformation_count == UNPROVIDED) {
            transformation_count = ZERO_INTEGER;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        thread.resetMultipleValues();
        final SubLObject new_root = shy_ntransform_perform_transform(v_object, pred, transform, key, transformation_max, transformation_count);
        SubLObject new_transformation_count = thread.secondMultipleValue();
        thread.resetMultipleValues();
        if (new_root.isAtom()) {
            return new_root;
        }
        SubLObject parent_cons = NIL;
        SubLObject set_op = NIL;
        SubLObject value = NIL;
        SubLObject new_value = NIL;
        SubLObject old_cons = NIL;
        SubLObject queue = NIL;
        SubLObject current = NIL;
        queue = list(make_ntransform_info(new_root, symbol_function(RPLACA), new_root.first()), make_ntransform_info(new_root, symbol_function(RPLACD), new_root.rest()));
        current = queue.first();
        while (NIL != queue) {
            old_cons = queue;
            queue = queue.rest();
            parent_cons = current.first();
            set_op = cadr(current);
            value = cddr(current);
            thread.resetMultipleValues();
            final SubLObject new_value_$5 = shy_ntransform_perform_transform(value, pred, transform, key, transformation_max, new_transformation_count);
            final SubLObject new_transformation_count_$6 = thread.secondMultipleValue();
            thread.resetMultipleValues();
            new_value = new_value_$5;
            new_transformation_count = new_transformation_count_$6;
            funcall(set_op, parent_cons, new_value);
            if (!new_value.isAtom()) {
                queue = list_utilities.recons(make_ntransform_info(new_value, symbol_function(RPLACA), new_value.first()), cons(reuse_ntransform_info(current, new_value, symbol_function(RPLACD), new_value.rest()), queue), old_cons);
            }
            // queue = queue;
            current = queue.first();
        } 
        return new_root;
    }/**
     * A destructive version of @xref transform.
     * This function is purely iterative.  While it tries to reuse whatever conses it can,
     * it still is a consing algorithm, thus it is only called when the depth of recursion
     * of ntransform-recursive reaches a predefined limit.
     *
     * @unknown sdevoy
     */


    public static final SubLObject quiescent_transform_alt(SubLObject v_object, SubLObject pred, SubLObject transform, SubLObject key, SubLObject quiescence) {
        if (key == UNPROVIDED) {
            key = symbol_function(IDENTITY);
        }
        if (quiescence == UNPROVIDED) {
            quiescence = symbol_function(EQUAL);
        }
        return com.cyc.cycjava.cycl.transform_list_utilities.quiescent_ntransform(copy_tree(v_object), pred, transform, key, quiescence, UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject quiescent_transform(final SubLObject v_object, final SubLObject pred, final SubLObject transform, SubLObject key, SubLObject quiescence) {
        if (key == UNPROVIDED) {
            key = symbol_function(IDENTITY);
        }
        if (quiescence == UNPROVIDED) {
            quiescence = symbol_function(EQUAL);
        }
        return quiescent_ntransform(copy_tree(v_object), pred, transform, key, quiescence, UNPROVIDED, UNPROVIDED);
    }

    /**
     * Calls 'quiescent-ntransform-recursive' to iteratively transform object and then its transformation
     * using 'transform' so long as 'pred' succeeds and the application of 'quiescence' to the transformation
     * of the object fails.  Upon finishing a series of transformations, 'quiescent-ntransform-recursive'
     * is then recursively applied to the 'car' of the transformation while successive 'cdrs' of the transformation
     * are transformed according to the same algorithm.  If, in the process of transformation, the recursion
     * limit 'recusion-limit' is reached, then 'quiescent-ntransform-iterative' is called to solve the
     * subtransformation without recursion.
     *
     * @param recursion-limit;
     * 		The maximum depth that the algorithm is allowed to recurse.
     * 		Once this limit is exceeded, the transformation continues by means of an
     * 		iterative algorithm.
     * @param transformation-max;
     * 		The maximum number of transformations to be performed before
     * 		throwing :transformation-limit-exceeded.  If this parameter is given NIL as a value,
     * 		no limit is imposed on the number of transformations.
     * @throws :transformation-limit-exceeded
     * 		
     * @unknown sdevoy
     */
    @LispMethod(comment = "Calls \'quiescent-ntransform-recursive\' to iteratively transform object and then its transformation\r\nusing \'transform\' so long as \'pred\' succeeds and the application of \'quiescence\' to the transformation\r\nof the object fails.  Upon finishing a series of transformations, \'quiescent-ntransform-recursive\'\r\nis then recursively applied to the \'car\' of the transformation while successive \'cdrs\' of the transformation\r\nare transformed according to the same algorithm.  If, in the process of transformation, the recursion\r\nlimit \'recusion-limit\' is reached, then \'quiescent-ntransform-iterative\' is called to solve the\r\nsubtransformation without recursion.\r\n\r\n@param recursion-limit;\r\n\t\tThe maximum depth that the algorithm is allowed to recurse.\r\n\t\tOnce this limit is exceeded, the transformation continues by means of an\r\n\t\titerative algorithm.\r\n@param transformation-max;\r\n\t\tThe maximum number of transformations to be performed before\r\n\t\tthrowing :transformation-limit-exceeded.  If this parameter is given NIL as a value,\r\n\t\tno limit is imposed on the number of transformations.\r\n@throws :transformation-limit-exceeded\r\n\t\t\r\n@unknown sdevoy\nCalls \'quiescent-ntransform-recursive\' to iteratively transform object and then its transformation\nusing \'transform\' so long as \'pred\' succeeds and the application of \'quiescence\' to the transformation\nof the object fails.  Upon finishing a series of transformations, \'quiescent-ntransform-recursive\'\nis then recursively applied to the \'car\' of the transformation while successive \'cdrs\' of the transformation\nare transformed according to the same algorithm.  If, in the process of transformation, the recursion\nlimit \'recusion-limit\' is reached, then \'quiescent-ntransform-iterative\' is called to solve the\nsubtransformation without recursion.")
    public static final SubLObject quiescent_ntransform_alt(SubLObject v_object, SubLObject pred, SubLObject transform, SubLObject key, SubLObject quiescence, SubLObject recursion_limit, SubLObject transformation_max) {
        if (key == UNPROVIDED) {
            key = symbol_function(IDENTITY);
        }
        if (quiescence == UNPROVIDED) {
            quiescence = symbol_function(EQUAL);
        }
        if (recursion_limit == UNPROVIDED) {
            recursion_limit = $default_recursion_limit$.getDynamicValue();
        }
        if (transformation_max == UNPROVIDED) {
            transformation_max = $default_quiescent_transformation_max$.getDynamicValue();
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL != transformation_max) {
                thread.resetMultipleValues();
                {
                    SubLObject transformed_object = com.cyc.cycjava.cycl.transform_list_utilities.shy_quiescent_ntransform_recursive(v_object, pred, transform, key, quiescence, recursion_limit, ZERO_INTEGER, transformation_max, ZERO_INTEGER);
                    SubLObject transformation_count = thread.secondMultipleValue();
                    thread.resetMultipleValues();
                    return transformed_object;
                }
            } else {
                return com.cyc.cycjava.cycl.transform_list_utilities.quiescent_ntransform_recursive(v_object, pred, transform, key, quiescence, recursion_limit, ZERO_INTEGER);
            }
        }
    }

    @LispMethod(comment = "Calls \'quiescent-ntransform-recursive\' to iteratively transform object and then its transformation\r\nusing \'transform\' so long as \'pred\' succeeds and the application of \'quiescence\' to the transformation\r\nof the object fails.  Upon finishing a series of transformations, \'quiescent-ntransform-recursive\'\r\nis then recursively applied to the \'car\' of the transformation while successive \'cdrs\' of the transformation\r\nare transformed according to the same algorithm.  If, in the process of transformation, the recursion\r\nlimit \'recusion-limit\' is reached, then \'quiescent-ntransform-iterative\' is called to solve the\r\nsubtransformation without recursion.\r\n\r\n@param recursion-limit;\r\n\t\tThe maximum depth that the algorithm is allowed to recurse.\r\n\t\tOnce this limit is exceeded, the transformation continues by means of an\r\n\t\titerative algorithm.\r\n@param transformation-max;\r\n\t\tThe maximum number of transformations to be performed before\r\n\t\tthrowing :transformation-limit-exceeded.  If this parameter is given NIL as a value,\r\n\t\tno limit is imposed on the number of transformations.\r\n@throws :transformation-limit-exceeded\r\n\t\t\r\n@unknown sdevoy\nCalls \'quiescent-ntransform-recursive\' to iteratively transform object and then its transformation\nusing \'transform\' so long as \'pred\' succeeds and the application of \'quiescence\' to the transformation\nof the object fails.  Upon finishing a series of transformations, \'quiescent-ntransform-recursive\'\nis then recursively applied to the \'car\' of the transformation while successive \'cdrs\' of the transformation\nare transformed according to the same algorithm.  If, in the process of transformation, the recursion\nlimit \'recusion-limit\' is reached, then \'quiescent-ntransform-iterative\' is called to solve the\nsubtransformation without recursion.")
    public static SubLObject quiescent_ntransform(final SubLObject v_object, final SubLObject pred, final SubLObject transform, SubLObject key, SubLObject quiescence, SubLObject recursion_limit, SubLObject transformation_max) {
        if (key == UNPROVIDED) {
            key = symbol_function(IDENTITY);
        }
        if (quiescence == UNPROVIDED) {
            quiescence = symbol_function(EQUAL);
        }
        if (recursion_limit == UNPROVIDED) {
            recursion_limit = $default_recursion_limit$.getDynamicValue();
        }
        if (transformation_max == UNPROVIDED) {
            transformation_max = $default_quiescent_transformation_max$.getDynamicValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != transformation_max) {
            thread.resetMultipleValues();
            final SubLObject transformed_object = shy_quiescent_ntransform_recursive(v_object, pred, transform, key, quiescence, recursion_limit, ZERO_INTEGER, transformation_max, ZERO_INTEGER);
            final SubLObject transformation_count = thread.secondMultipleValue();
            thread.resetMultipleValues();
            return transformed_object;
        }
        return quiescent_ntransform_recursive(v_object, pred, transform, key, quiescence, recursion_limit, ZERO_INTEGER);
    }/**
     * Calls 'quiescent-ntransform-recursive' to iteratively transform object and then its transformation
     * using 'transform' so long as 'pred' succeeds and the application of 'quiescence' to the transformation
     * of the object fails.  Upon finishing a series of transformations, 'quiescent-ntransform-recursive'
     * is then recursively applied to the 'car' of the transformation while successive 'cdrs' of the transformation
     * are transformed according to the same algorithm.  If, in the process of transformation, the recursion
     * limit 'recusion-limit' is reached, then 'quiescent-ntransform-iterative' is called to solve the
     * subtransformation without recursion.
     *
     * @param recursion-limit;
     * 		The maximum depth that the algorithm is allowed to recurse.
     * 		Once this limit is exceeded, the transformation continues by means of an
     * 		iterative algorithm.
     * @param transformation-max;
     * 		The maximum number of transformations to be performed before
     * 		throwing :transformation-limit-exceeded.  If this parameter is given NIL as a value,
     * 		no limit is imposed on the number of transformations.
     * @throws :transformation-limit-exceeded
     * 		
     * @unknown sdevoy
     */


    /**
     * See documentation for quiescent-ntransform.
     *
     * @unknown sdevoy
     */
    @LispMethod(comment = "See documentation for quiescent-ntransform.\r\n\r\n@unknown sdevoy")
    public static final SubLObject quiescent_ntransform_recursive_alt(SubLObject v_object, SubLObject pred, SubLObject transform, SubLObject key, SubLObject quiescence, SubLObject recursion_limit, SubLObject recursion_level) {
        if (recursion_level.numGE(recursion_limit)) {
            return com.cyc.cycjava.cycl.transform_list_utilities.quiescent_ntransform_iterative(v_object, pred, transform, key, quiescence);
        } else {
            {
                SubLObject initial_transformed_object = com.cyc.cycjava.cycl.transform_list_utilities.ntransform_perform_quiescent_transform(v_object, pred, transform, key, quiescence);
                SubLObject transformed_list_tail = initial_transformed_object;
                for (; !transformed_list_tail.isAtom();) {
                    rplaca(transformed_list_tail, com.cyc.cycjava.cycl.transform_list_utilities.quiescent_ntransform_recursive(transformed_list_tail.first(), pred, transform, key, quiescence, recursion_limit, add(recursion_level, ONE_INTEGER)));
                    rplacd(transformed_list_tail, com.cyc.cycjava.cycl.transform_list_utilities.ntransform_perform_quiescent_transform(transformed_list_tail.rest(), pred, transform, key, quiescence));
                    transformed_list_tail = transformed_list_tail.rest();
                }
                return initial_transformed_object;
            }
        }
    }

    @LispMethod(comment = "See documentation for quiescent-ntransform.\r\n\r\n@unknown sdevoy")
    public static SubLObject quiescent_ntransform_recursive(final SubLObject v_object, final SubLObject pred, final SubLObject transform, final SubLObject key, final SubLObject quiescence, final SubLObject recursion_limit, final SubLObject recursion_level) {
        if (recursion_level.numGE(recursion_limit)) {
            return quiescent_ntransform_iterative(v_object, pred, transform, key, quiescence);
        }
        SubLObject transformed_list_tail;
        SubLObject initial_transformed_object;
        for (initial_transformed_object = transformed_list_tail = ntransform_perform_quiescent_transform(v_object, pred, transform, key, quiescence); !transformed_list_tail.isAtom(); transformed_list_tail = transformed_list_tail.rest()) {
            rplaca(transformed_list_tail, quiescent_ntransform_recursive(transformed_list_tail.first(), pred, transform, key, quiescence, recursion_limit, add(recursion_level, ONE_INTEGER)));
            rplacd(transformed_list_tail, ntransform_perform_quiescent_transform(transformed_list_tail.rest(), pred, transform, key, quiescence));
        }
        return initial_transformed_object;
    }/**
     * See documentation for quiescent-ntransform.
     *
     * @unknown sdevoy
     */


    /**
     * See documentation for quiescent-ntransform.
     *
     * @unknown sdevoy
     */
    @LispMethod(comment = "See documentation for quiescent-ntransform.\r\n\r\n@unknown sdevoy")
    public static final SubLObject shy_quiescent_ntransform_recursive_alt(SubLObject v_object, SubLObject pred, SubLObject transform, SubLObject key, SubLObject quiescence, SubLObject recursion_limit, SubLObject recursion_level, SubLObject transformation_max, SubLObject transformation_count) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (recursion_level.numGE(recursion_limit)) {
                return com.cyc.cycjava.cycl.transform_list_utilities.shy_quiescent_ntransform_iterative(v_object, pred, transform, key, quiescence, transformation_max, transformation_count);
            } else {
                thread.resetMultipleValues();
                {
                    SubLObject initial_transformed_object = com.cyc.cycjava.cycl.transform_list_utilities.shy_ntransform_perform_quiescent_transform(v_object, pred, transform, key, quiescence, transformation_max, transformation_count);
                    SubLObject new_transformation_count = thread.secondMultipleValue();
                    thread.resetMultipleValues();
                    {
                        SubLObject transformed_list_tail = initial_transformed_object;
                        SubLObject transformed_object = NIL;
                        for (; !transformed_list_tail.isAtom();) {
                            thread.resetMultipleValues();
                            {
                                SubLObject transformed_object_7 = com.cyc.cycjava.cycl.transform_list_utilities.shy_quiescent_ntransform_recursive(transformed_list_tail.first(), pred, transform, key, quiescence, recursion_limit, add(recursion_level, ONE_INTEGER), transformation_max, new_transformation_count);
                                SubLObject new_transformation_count_8 = thread.secondMultipleValue();
                                thread.resetMultipleValues();
                                transformed_object = transformed_object_7;
                                new_transformation_count = new_transformation_count_8;
                            }
                            rplaca(transformed_list_tail, transformed_object);
                            thread.resetMultipleValues();
                            {
                                SubLObject transformed_object_9 = com.cyc.cycjava.cycl.transform_list_utilities.shy_ntransform_perform_quiescent_transform(transformed_list_tail.rest(), pred, transform, key, quiescence, transformation_max, new_transformation_count);
                                SubLObject new_transformation_count_10 = thread.secondMultipleValue();
                                thread.resetMultipleValues();
                                transformed_object = transformed_object_9;
                                new_transformation_count = new_transformation_count_10;
                            }
                            rplacd(transformed_list_tail, transformed_object);
                            transformed_list_tail = transformed_list_tail.rest();
                        }
                        return values(initial_transformed_object, new_transformation_count);
                    }
                }
            }
        }
    }

    @LispMethod(comment = "See documentation for quiescent-ntransform.\r\n\r\n@unknown sdevoy")
    public static SubLObject shy_quiescent_ntransform_recursive(final SubLObject v_object, final SubLObject pred, final SubLObject transform, final SubLObject key, final SubLObject quiescence, final SubLObject recursion_limit, final SubLObject recursion_level, final SubLObject transformation_max, final SubLObject transformation_count) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (recursion_level.numGE(recursion_limit)) {
            return shy_quiescent_ntransform_iterative(v_object, pred, transform, key, quiescence, transformation_max, transformation_count);
        }
        thread.resetMultipleValues();
        final SubLObject initial_transformed_object = shy_ntransform_perform_quiescent_transform(v_object, pred, transform, key, quiescence, transformation_max, transformation_count);
        SubLObject new_transformation_count = thread.secondMultipleValue();
        thread.resetMultipleValues();
        SubLObject transformed_list_tail = initial_transformed_object;
        SubLObject transformed_object = NIL;
        while (!transformed_list_tail.isAtom()) {
            thread.resetMultipleValues();
            final SubLObject transformed_object_$7 = shy_quiescent_ntransform_recursive(transformed_list_tail.first(), pred, transform, key, quiescence, recursion_limit, add(recursion_level, ONE_INTEGER), transformation_max, new_transformation_count);
            final SubLObject new_transformation_count_$8 = thread.secondMultipleValue();
            thread.resetMultipleValues();
            transformed_object = transformed_object_$7;
            new_transformation_count = new_transformation_count_$8;
            rplaca(transformed_list_tail, transformed_object);
            thread.resetMultipleValues();
            final SubLObject transformed_object_$8 = shy_ntransform_perform_quiescent_transform(transformed_list_tail.rest(), pred, transform, key, quiescence, transformation_max, new_transformation_count);
            final SubLObject new_transformation_count_$9 = thread.secondMultipleValue();
            thread.resetMultipleValues();
            transformed_object = transformed_object_$8;
            new_transformation_count = new_transformation_count_$9;
            rplacd(transformed_list_tail, transformed_object);
            transformed_list_tail = transformed_list_tail.rest();
        } 
        return values(initial_transformed_object, new_transformation_count);
    }/**
     * See documentation for quiescent-ntransform.
     *
     * @unknown sdevoy
     */


    /**
     * See documentation for quiescent-ntransformation to understand what the algorithm produces.
     * This version employs a stack (named 'queue' for generality (it may be desirable to control the
     * ordering of branching in the future (thus the name 'queue'))) to decompose the problem without
     * recursion.  It does consing, however it employs some reuse to minimize the consing.
     *
     * @unknown sdevoy
     */
    @LispMethod(comment = "See documentation for quiescent-ntransformation to understand what the algorithm produces.\r\nThis version employs a stack (named \'queue\' for generality (it may be desirable to control the\r\nordering of branching in the future (thus the name \'queue\'))) to decompose the problem without\r\nrecursion.  It does consing, however it employs some reuse to minimize the consing.\r\n\r\n@unknown sdevoy\nSee documentation for quiescent-ntransformation to understand what the algorithm produces.\nThis version employs a stack (named \'queue\' for generality (it may be desirable to control the\nordering of branching in the future (thus the name \'queue\'))) to decompose the problem without\nrecursion.  It does consing, however it employs some reuse to minimize the consing.")
    public static final SubLObject quiescent_ntransform_iterative_alt(SubLObject v_object, SubLObject pred, SubLObject transform, SubLObject key, SubLObject quiescence) {
        if (key == UNPROVIDED) {
            key = symbol_function(IDENTITY);
        }
        if (quiescence == UNPROVIDED) {
            quiescence = symbol_function(EQUAL);
        }
        {
            SubLObject new_root = com.cyc.cycjava.cycl.transform_list_utilities.ntransform_perform_quiescent_transform(v_object, pred, transform, key, quiescence);
            if (new_root.isAtom()) {
                return new_root;
            } else {
                {
                    SubLObject parent_cons = NIL;
                    SubLObject set_op = NIL;
                    SubLObject value = NIL;
                    SubLObject new_value = NIL;
                    SubLObject old_cons = NIL;
                    SubLObject queue = NIL;
                    SubLObject current = NIL;
                    for (queue = list(com.cyc.cycjava.cycl.transform_list_utilities.make_ntransform_info(new_root, symbol_function(RPLACA), new_root.first()), com.cyc.cycjava.cycl.transform_list_utilities.make_ntransform_info(new_root, symbol_function(RPLACD), new_root.rest())), current = queue.first(); NIL != queue; queue = queue , current = queue.first()) {
                        old_cons = queue;
                        queue = queue.rest();
                        parent_cons = current.first();
                        set_op = cadr(current);
                        value = cddr(current);
                        new_value = com.cyc.cycjava.cycl.transform_list_utilities.ntransform_perform_quiescent_transform(value, pred, transform, key, quiescence);
                        funcall(set_op, parent_cons, new_value);
                        if (!new_value.isAtom()) {
                            queue = list_utilities.recons(com.cyc.cycjava.cycl.transform_list_utilities.make_ntransform_info(new_value, symbol_function(RPLACA), new_value.first()), cons(com.cyc.cycjava.cycl.transform_list_utilities.reuse_ntransform_info(current, new_value, symbol_function(RPLACD), new_value.rest()), queue), old_cons);
                        }
                    }
                    return new_root;
                }
            }
        }
    }

    @LispMethod(comment = "See documentation for quiescent-ntransformation to understand what the algorithm produces.\r\nThis version employs a stack (named \'queue\' for generality (it may be desirable to control the\r\nordering of branching in the future (thus the name \'queue\'))) to decompose the problem without\r\nrecursion.  It does consing, however it employs some reuse to minimize the consing.\r\n\r\n@unknown sdevoy\nSee documentation for quiescent-ntransformation to understand what the algorithm produces.\nThis version employs a stack (named \'queue\' for generality (it may be desirable to control the\nordering of branching in the future (thus the name \'queue\'))) to decompose the problem without\nrecursion.  It does consing, however it employs some reuse to minimize the consing.")
    public static SubLObject quiescent_ntransform_iterative(final SubLObject v_object, final SubLObject pred, final SubLObject transform, SubLObject key, SubLObject quiescence) {
        if (key == UNPROVIDED) {
            key = symbol_function(IDENTITY);
        }
        if (quiescence == UNPROVIDED) {
            quiescence = symbol_function(EQUAL);
        }
        final SubLObject new_root = ntransform_perform_quiescent_transform(v_object, pred, transform, key, quiescence);
        if (new_root.isAtom()) {
            return new_root;
        }
        SubLObject parent_cons = NIL;
        SubLObject set_op = NIL;
        SubLObject value = NIL;
        SubLObject new_value = NIL;
        SubLObject old_cons = NIL;
        SubLObject queue = NIL;
        SubLObject current = NIL;
        queue = list(make_ntransform_info(new_root, symbol_function(RPLACA), new_root.first()), make_ntransform_info(new_root, symbol_function(RPLACD), new_root.rest()));
        current = queue.first();
        while (NIL != queue) {
            old_cons = queue;
            queue = queue.rest();
            parent_cons = current.first();
            set_op = cadr(current);
            value = cddr(current);
            new_value = ntransform_perform_quiescent_transform(value, pred, transform, key, quiescence);
            funcall(set_op, parent_cons, new_value);
            if (!new_value.isAtom()) {
                queue = list_utilities.recons(make_ntransform_info(new_value, symbol_function(RPLACA), new_value.first()), cons(reuse_ntransform_info(current, new_value, symbol_function(RPLACD), new_value.rest()), queue), old_cons);
            }
            // queue = queue;
            current = queue.first();
        } 
        return new_root;
    }/**
     * See documentation for quiescent-ntransformation to understand what the algorithm produces.
     * This version employs a stack (named 'queue' for generality (it may be desirable to control the
     * ordering of branching in the future (thus the name 'queue'))) to decompose the problem without
     * recursion.  It does consing, however it employs some reuse to minimize the consing.
     *
     * @unknown sdevoy
     */


    /**
     * See documentation for quiescent-ntransformation to understand what the algorithm produces.
     * This version employs a stack (named 'queue' for generality (it may be desirable to control the
     * ordering of branching in the future (thus the name 'queue'))) to decompose the problem without
     * recursion.  It does consing, however it employs some reuse to minimize the consing.
     *
     * @unknown sdevoy
     */
    @LispMethod(comment = "See documentation for quiescent-ntransformation to understand what the algorithm produces.\r\nThis version employs a stack (named \'queue\' for generality (it may be desirable to control the\r\nordering of branching in the future (thus the name \'queue\'))) to decompose the problem without\r\nrecursion.  It does consing, however it employs some reuse to minimize the consing.\r\n\r\n@unknown sdevoy\nSee documentation for quiescent-ntransformation to understand what the algorithm produces.\nThis version employs a stack (named \'queue\' for generality (it may be desirable to control the\nordering of branching in the future (thus the name \'queue\'))) to decompose the problem without\nrecursion.  It does consing, however it employs some reuse to minimize the consing.")
    public static final SubLObject shy_quiescent_ntransform_iterative_alt(SubLObject v_object, SubLObject pred, SubLObject transform, SubLObject key, SubLObject quiescence, SubLObject transformation_max, SubLObject transformation_count) {
        if (key == UNPROVIDED) {
            key = symbol_function(IDENTITY);
        }
        if (quiescence == UNPROVIDED) {
            quiescence = symbol_function(EQUAL);
        }
        if (transformation_max == UNPROVIDED) {
            transformation_max = $default_quiescent_transformation_max$.getDynamicValue();
        }
        if (transformation_count == UNPROVIDED) {
            transformation_count = ZERO_INTEGER;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            thread.resetMultipleValues();
            {
                SubLObject new_root = com.cyc.cycjava.cycl.transform_list_utilities.shy_ntransform_perform_quiescent_transform(v_object, pred, transform, key, quiescence, transformation_max, transformation_count);
                SubLObject new_transformation_count = thread.secondMultipleValue();
                thread.resetMultipleValues();
                if (new_root.isAtom()) {
                    return values(new_root, new_transformation_count);
                } else {
                    {
                        SubLObject parent_cons = NIL;
                        SubLObject set_op = NIL;
                        SubLObject value = NIL;
                        SubLObject new_value = NIL;
                        SubLObject old_cons = NIL;
                        SubLObject queue = NIL;
                        SubLObject current = NIL;
                        for (queue = list(com.cyc.cycjava.cycl.transform_list_utilities.make_ntransform_info(new_root, symbol_function(RPLACA), new_root.first()), com.cyc.cycjava.cycl.transform_list_utilities.make_ntransform_info(new_root, symbol_function(RPLACD), new_root.rest())), current = queue.first(); NIL != queue; queue = queue , current = queue.first()) {
                            old_cons = queue;
                            queue = queue.rest();
                            parent_cons = current.first();
                            set_op = cadr(current);
                            value = cddr(current);
                            thread.resetMultipleValues();
                            {
                                SubLObject new_value_11 = com.cyc.cycjava.cycl.transform_list_utilities.shy_ntransform_perform_quiescent_transform(value, pred, transform, key, quiescence, transformation_max, new_transformation_count);
                                SubLObject new_transformation_count_12 = thread.secondMultipleValue();
                                thread.resetMultipleValues();
                                new_value = new_value_11;
                                new_transformation_count = new_transformation_count_12;
                            }
                            funcall(set_op, parent_cons, new_value);
                            if (!new_value.isAtom()) {
                                queue = list_utilities.recons(com.cyc.cycjava.cycl.transform_list_utilities.make_ntransform_info(new_value, symbol_function(RPLACA), new_value.first()), cons(com.cyc.cycjava.cycl.transform_list_utilities.reuse_ntransform_info(current, new_value, symbol_function(RPLACD), new_value.rest()), queue), old_cons);
                            }
                        }
                        return new_root;
                    }
                }
            }
        }
    }

    @LispMethod(comment = "See documentation for quiescent-ntransformation to understand what the algorithm produces.\r\nThis version employs a stack (named \'queue\' for generality (it may be desirable to control the\r\nordering of branching in the future (thus the name \'queue\'))) to decompose the problem without\r\nrecursion.  It does consing, however it employs some reuse to minimize the consing.\r\n\r\n@unknown sdevoy\nSee documentation for quiescent-ntransformation to understand what the algorithm produces.\nThis version employs a stack (named \'queue\' for generality (it may be desirable to control the\nordering of branching in the future (thus the name \'queue\'))) to decompose the problem without\nrecursion.  It does consing, however it employs some reuse to minimize the consing.")
    public static SubLObject shy_quiescent_ntransform_iterative(final SubLObject v_object, final SubLObject pred, final SubLObject transform, SubLObject key, SubLObject quiescence, SubLObject transformation_max, SubLObject transformation_count) {
        if (key == UNPROVIDED) {
            key = symbol_function(IDENTITY);
        }
        if (quiescence == UNPROVIDED) {
            quiescence = symbol_function(EQUAL);
        }
        if (transformation_max == UNPROVIDED) {
            transformation_max = $default_quiescent_transformation_max$.getDynamicValue();
        }
        if (transformation_count == UNPROVIDED) {
            transformation_count = ZERO_INTEGER;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        thread.resetMultipleValues();
        final SubLObject new_root = shy_ntransform_perform_quiescent_transform(v_object, pred, transform, key, quiescence, transformation_max, transformation_count);
        SubLObject new_transformation_count = thread.secondMultipleValue();
        thread.resetMultipleValues();
        if (new_root.isAtom()) {
            return values(new_root, new_transformation_count);
        }
        SubLObject parent_cons = NIL;
        SubLObject set_op = NIL;
        SubLObject value = NIL;
        SubLObject new_value = NIL;
        SubLObject old_cons = NIL;
        SubLObject queue = NIL;
        SubLObject current = NIL;
        queue = list(make_ntransform_info(new_root, symbol_function(RPLACA), new_root.first()), make_ntransform_info(new_root, symbol_function(RPLACD), new_root.rest()));
        current = queue.first();
        while (NIL != queue) {
            old_cons = queue;
            queue = queue.rest();
            parent_cons = current.first();
            set_op = cadr(current);
            value = cddr(current);
            thread.resetMultipleValues();
            final SubLObject new_value_$11 = shy_ntransform_perform_quiescent_transform(value, pred, transform, key, quiescence, transformation_max, new_transformation_count);
            final SubLObject new_transformation_count_$12 = thread.secondMultipleValue();
            thread.resetMultipleValues();
            new_value = new_value_$11;
            new_transformation_count = new_transformation_count_$12;
            funcall(set_op, parent_cons, new_value);
            if (!new_value.isAtom()) {
                queue = list_utilities.recons(make_ntransform_info(new_value, symbol_function(RPLACA), new_value.first()), cons(reuse_ntransform_info(current, new_value, symbol_function(RPLACD), new_value.rest()), queue), old_cons);
            }
            // queue = queue;
            current = queue.first();
        } 
        return new_root;
    }/**
     * See documentation for quiescent-ntransformation to understand what the algorithm produces.
     * This version employs a stack (named 'queue' for generality (it may be desirable to control the
     * ordering of branching in the future (thus the name 'queue'))) to decompose the problem without
     * recursion.  It does consing, however it employs some reuse to minimize the consing.
     *
     * @unknown sdevoy
     */


    public static final SubLObject ntransform_perform_quiescent_transform_alt(SubLObject v_object, SubLObject pred, SubLObject transform, SubLObject key, SubLObject quiescence) {
        if (key.eql(symbol_function(IDENTITY)) || key.eql(IDENTITY)) {
            if (quiescence.eql(symbol_function(EQUAL)) || quiescence.equal(EQUAL)) {
                {
                    SubLObject previous_transformation = v_object;
                    SubLObject transformation = NIL;
                    for (transformation = (NIL != com.cyc.cycjava.cycl.transform_list_utilities.transform_pred_funcall(pred, v_object)) ? ((SubLObject) (copy_tree(com.cyc.cycjava.cycl.transform_list_utilities.transform_transform_funcall(transform, v_object)))) : v_object; !((previous_transformation == transformation) || previous_transformation.equal(transformation)); transformation = (NIL != com.cyc.cycjava.cycl.transform_list_utilities.transform_pred_funcall(pred, transformation)) ? ((SubLObject) (copy_tree(com.cyc.cycjava.cycl.transform_list_utilities.transform_transform_funcall(transform, transformation)))) : transformation) {
                        previous_transformation = transformation;
                    }
                    return transformation;
                }
            } else {
                {
                    SubLObject previous_transformation = v_object;
                    SubLObject transformation = NIL;
                    for (transformation = (NIL != com.cyc.cycjava.cycl.transform_list_utilities.transform_pred_funcall(pred, v_object)) ? ((SubLObject) (copy_tree(com.cyc.cycjava.cycl.transform_list_utilities.transform_transform_funcall(transform, v_object)))) : v_object; !((previous_transformation == transformation) || (NIL != com.cyc.cycjava.cycl.transform_list_utilities.transform_quiescence_funcall(quiescence, previous_transformation, transformation))); transformation = (NIL != com.cyc.cycjava.cycl.transform_list_utilities.transform_pred_funcall(pred, transformation)) ? ((SubLObject) (copy_tree(com.cyc.cycjava.cycl.transform_list_utilities.transform_transform_funcall(transform, transformation)))) : transformation) {
                        previous_transformation = transformation;
                    }
                    return transformation;
                }
            }
        } else {
            if (quiescence.eql(symbol_function(EQUAL)) || quiescence.equal(EQUAL)) {
                {
                    SubLObject previous_transformation = v_object;
                    SubLObject transformation = NIL;
                    for (transformation = (NIL != com.cyc.cycjava.cycl.transform_list_utilities.transform_pred_funcall(pred, v_object)) ? ((SubLObject) (copy_tree(com.cyc.cycjava.cycl.transform_list_utilities.transform_transform_funcall(transform, com.cyc.cycjava.cycl.transform_list_utilities.transform_key_funcall(key, v_object))))) : v_object; !((previous_transformation == transformation) || previous_transformation.equal(transformation)); transformation = (NIL != com.cyc.cycjava.cycl.transform_list_utilities.transform_pred_funcall(pred, transformation)) ? ((SubLObject) (copy_tree(com.cyc.cycjava.cycl.transform_list_utilities.transform_transform_funcall(transform, com.cyc.cycjava.cycl.transform_list_utilities.transform_key_funcall(key, transformation))))) : transformation) {
                        previous_transformation = transformation;
                    }
                    return transformation;
                }
            } else {
                {
                    SubLObject previous_transformation = v_object;
                    SubLObject transformation = NIL;
                    for (transformation = (NIL != com.cyc.cycjava.cycl.transform_list_utilities.transform_pred_funcall(pred, v_object)) ? ((SubLObject) (copy_tree(com.cyc.cycjava.cycl.transform_list_utilities.transform_transform_funcall(transform, com.cyc.cycjava.cycl.transform_list_utilities.transform_key_funcall(key, v_object))))) : v_object; !((previous_transformation == transformation) || (NIL != com.cyc.cycjava.cycl.transform_list_utilities.transform_quiescence_funcall(quiescence, previous_transformation, transformation))); transformation = (NIL != com.cyc.cycjava.cycl.transform_list_utilities.transform_pred_funcall(pred, transformation)) ? ((SubLObject) (copy_tree(com.cyc.cycjava.cycl.transform_list_utilities.transform_transform_funcall(transform, com.cyc.cycjava.cycl.transform_list_utilities.transform_key_funcall(key, transformation))))) : transformation) {
                        previous_transformation = transformation;
                    }
                    return transformation;
                }
            }
        }
    }

    public static SubLObject ntransform_perform_quiescent_transform(final SubLObject v_object, final SubLObject pred, final SubLObject transform, final SubLObject key, final SubLObject quiescence) {
        if (key.eql(symbol_function(IDENTITY)) || key.eql(IDENTITY)) {
            if (quiescence.eql(symbol_function(EQUAL)) || quiescence.equal(EQUAL)) {
                SubLObject previous_transformation;
                SubLObject transformation;
                for (previous_transformation = v_object, transformation = NIL, transformation = (NIL != transform_pred_funcall(pred, v_object)) ? copy_tree(transform_transform_funcall(transform, v_object)) : v_object; (!previous_transformation.eql(transformation)) && (!previous_transformation.equal(transformation)); previous_transformation = transformation , transformation = (NIL != transform_pred_funcall(pred, transformation)) ? copy_tree(transform_transform_funcall(transform, transformation)) : transformation) {
                }
                return transformation;
            }
            SubLObject previous_transformation;
            SubLObject transformation;
            for (previous_transformation = v_object, transformation = NIL, transformation = (NIL != transform_pred_funcall(pred, v_object)) ? copy_tree(transform_transform_funcall(transform, v_object)) : v_object; (!previous_transformation.eql(transformation)) && (NIL == transform_quiescence_funcall(quiescence, previous_transformation, transformation)); previous_transformation = transformation , transformation = (NIL != transform_pred_funcall(pred, transformation)) ? copy_tree(transform_transform_funcall(transform, transformation)) : transformation) {
            }
            return transformation;
        } else {
            if (quiescence.eql(symbol_function(EQUAL)) || quiescence.equal(EQUAL)) {
                SubLObject previous_transformation;
                SubLObject transformation;
                for (previous_transformation = v_object, transformation = NIL, transformation = (NIL != transform_pred_funcall(pred, v_object)) ? copy_tree(transform_transform_funcall(transform, transform_key_funcall(key, v_object))) : v_object; (!previous_transformation.eql(transformation)) && (!previous_transformation.equal(transformation)); previous_transformation = transformation , transformation = (NIL != transform_pred_funcall(pred, transformation)) ? copy_tree(transform_transform_funcall(transform, transform_key_funcall(key, transformation))) : transformation) {
                }
                return transformation;
            }
            SubLObject previous_transformation;
            SubLObject transformation;
            for (previous_transformation = v_object, transformation = NIL, transformation = (NIL != transform_pred_funcall(pred, v_object)) ? copy_tree(transform_transform_funcall(transform, transform_key_funcall(key, v_object))) : v_object; (!previous_transformation.eql(transformation)) && (NIL == transform_quiescence_funcall(quiescence, previous_transformation, transformation)); previous_transformation = transformation , transformation = (NIL != transform_pred_funcall(pred, transformation)) ? copy_tree(transform_transform_funcall(transform, transform_key_funcall(key, transformation))) : transformation) {
            }
            return transformation;
        }
    }

    public static final SubLObject shy_ntransform_perform_quiescent_transform_alt(SubLObject v_object, SubLObject pred, SubLObject transform, SubLObject key, SubLObject quiescence, SubLObject transformation_max, SubLObject transformation_count) {
        if (key.eql(symbol_function(IDENTITY)) || key.eql(IDENTITY)) {
            if (quiescence.eql(symbol_function(EQUAL)) || quiescence.equal(EQUAL)) {
                {
                    SubLObject previous_transformation = v_object;
                    SubLObject transformation = NIL;
                    for (transformation = (NIL != com.cyc.cycjava.cycl.transform_list_utilities.transform_pred_funcall(pred, v_object)) ? ((SubLObject) (copy_tree(com.cyc.cycjava.cycl.transform_list_utilities.transform_transform_funcall(transform, v_object)))) : v_object; !((previous_transformation == transformation) || previous_transformation.equal(transformation)); transformation = (NIL != com.cyc.cycjava.cycl.transform_list_utilities.transform_pred_funcall(pred, transformation)) ? ((SubLObject) (copy_tree(com.cyc.cycjava.cycl.transform_list_utilities.transform_transform_funcall(transform, transformation)))) : transformation) {
                        if (transformation_count.numGE(transformation_max)) {
                            sublisp_throw($TRANSFORMATION_LIMIT_EXCEEDED, list($TRANSFORMATION_LIMIT_EXCEEDED, transformation_count, transformation_max));
                        }
                        transformation_count = add(transformation_count, ONE_INTEGER);
                        previous_transformation = transformation;
                    }
                    return values(transformation, transformation_count);
                }
            } else {
                {
                    SubLObject previous_transformation = v_object;
                    SubLObject transformation = NIL;
                    for (transformation = (NIL != com.cyc.cycjava.cycl.transform_list_utilities.transform_pred_funcall(pred, v_object)) ? ((SubLObject) (copy_tree(com.cyc.cycjava.cycl.transform_list_utilities.transform_transform_funcall(transform, v_object)))) : v_object; !((previous_transformation == transformation) || (NIL != com.cyc.cycjava.cycl.transform_list_utilities.transform_quiescence_funcall(quiescence, previous_transformation, transformation))); transformation = (NIL != com.cyc.cycjava.cycl.transform_list_utilities.transform_pred_funcall(pred, transformation)) ? ((SubLObject) (copy_tree(com.cyc.cycjava.cycl.transform_list_utilities.transform_transform_funcall(transform, transformation)))) : transformation) {
                        if (transformation_count.numGE(transformation_max)) {
                            sublisp_throw($TRANSFORMATION_LIMIT_EXCEEDED, list($TRANSFORMATION_LIMIT_EXCEEDED, transformation_count, transformation_max));
                        }
                        transformation_count = add(transformation_count, ONE_INTEGER);
                        previous_transformation = transformation;
                    }
                    return values(transformation, transformation_count);
                }
            }
        } else {
            if (quiescence.eql(symbol_function(EQUAL)) || quiescence.equal(EQUAL)) {
                {
                    SubLObject previous_transformation = v_object;
                    SubLObject transformation = NIL;
                    for (transformation = (NIL != com.cyc.cycjava.cycl.transform_list_utilities.transform_pred_funcall(pred, v_object)) ? ((SubLObject) (copy_tree(com.cyc.cycjava.cycl.transform_list_utilities.transform_transform_funcall(transform, com.cyc.cycjava.cycl.transform_list_utilities.transform_key_funcall(key, v_object))))) : v_object; !((previous_transformation == transformation) || previous_transformation.equal(transformation)); transformation = (NIL != com.cyc.cycjava.cycl.transform_list_utilities.transform_pred_funcall(pred, transformation)) ? ((SubLObject) (copy_tree(com.cyc.cycjava.cycl.transform_list_utilities.transform_transform_funcall(transform, com.cyc.cycjava.cycl.transform_list_utilities.transform_key_funcall(key, transformation))))) : transformation) {
                        if (transformation_count.numGE(transformation_max)) {
                            sublisp_throw($TRANSFORMATION_LIMIT_EXCEEDED, list($TRANSFORMATION_LIMIT_EXCEEDED, transformation_count, transformation_max));
                        }
                        transformation_count = add(transformation_count, ONE_INTEGER);
                        previous_transformation = transformation;
                    }
                    return values(transformation, transformation_count);
                }
            } else {
                {
                    SubLObject previous_transformation = v_object;
                    SubLObject transformation = NIL;
                    for (transformation = (NIL != com.cyc.cycjava.cycl.transform_list_utilities.transform_pred_funcall(pred, v_object)) ? ((SubLObject) (copy_tree(com.cyc.cycjava.cycl.transform_list_utilities.transform_transform_funcall(transform, com.cyc.cycjava.cycl.transform_list_utilities.transform_key_funcall(key, v_object))))) : v_object; !((previous_transformation == transformation) || (NIL != com.cyc.cycjava.cycl.transform_list_utilities.transform_quiescence_funcall(quiescence, previous_transformation, transformation))); transformation = (NIL != com.cyc.cycjava.cycl.transform_list_utilities.transform_pred_funcall(pred, transformation)) ? ((SubLObject) (copy_tree(com.cyc.cycjava.cycl.transform_list_utilities.transform_transform_funcall(transform, com.cyc.cycjava.cycl.transform_list_utilities.transform_key_funcall(key, transformation))))) : transformation) {
                        if (transformation_count.numGE(transformation_max)) {
                            sublisp_throw($TRANSFORMATION_LIMIT_EXCEEDED, list($TRANSFORMATION_LIMIT_EXCEEDED, transformation_count, transformation_max));
                        }
                        transformation_count = add(transformation_count, ONE_INTEGER);
                        previous_transformation = transformation;
                    }
                    return values(transformation, transformation_count);
                }
            }
        }
    }

    public static SubLObject shy_ntransform_perform_quiescent_transform(final SubLObject v_object, final SubLObject pred, final SubLObject transform, final SubLObject key, final SubLObject quiescence, final SubLObject transformation_max, SubLObject transformation_count) {
        if (key.eql(symbol_function(IDENTITY)) || key.eql(IDENTITY)) {
            if (quiescence.eql(symbol_function(EQUAL)) || quiescence.equal(EQUAL)) {
                SubLObject previous_transformation;
                SubLObject transformation;
                for (previous_transformation = v_object, transformation = NIL, transformation = (NIL != transform_pred_funcall(pred, v_object)) ? copy_tree(transform_transform_funcall(transform, v_object)) : v_object; (!previous_transformation.eql(transformation)) && (!previous_transformation.equal(transformation)); previous_transformation = transformation , transformation = (NIL != transform_pred_funcall(pred, transformation)) ? copy_tree(transform_transform_funcall(transform, transformation)) : transformation) {
                    if (transformation_count.numGE(transformation_max)) {
                        sublisp_throw($TRANSFORMATION_LIMIT_EXCEEDED, list($TRANSFORMATION_LIMIT_EXCEEDED, transformation_count, transformation_max));
                    }
                    transformation_count = add(transformation_count, ONE_INTEGER);
                }
                return values(transformation, transformation_count);
            }
            SubLObject previous_transformation;
            SubLObject transformation;
            for (previous_transformation = v_object, transformation = NIL, transformation = (NIL != transform_pred_funcall(pred, v_object)) ? copy_tree(transform_transform_funcall(transform, v_object)) : v_object; (!previous_transformation.eql(transformation)) && (NIL == transform_quiescence_funcall(quiescence, previous_transformation, transformation)); previous_transformation = transformation , transformation = (NIL != transform_pred_funcall(pred, transformation)) ? copy_tree(transform_transform_funcall(transform, transformation)) : transformation) {
                if (transformation_count.numGE(transformation_max)) {
                    sublisp_throw($TRANSFORMATION_LIMIT_EXCEEDED, list($TRANSFORMATION_LIMIT_EXCEEDED, transformation_count, transformation_max));
                }
                transformation_count = add(transformation_count, ONE_INTEGER);
            }
            return values(transformation, transformation_count);
        } else {
            if (quiescence.eql(symbol_function(EQUAL)) || quiescence.equal(EQUAL)) {
                SubLObject previous_transformation;
                SubLObject transformation;
                for (previous_transformation = v_object, transformation = NIL, transformation = (NIL != transform_pred_funcall(pred, v_object)) ? copy_tree(transform_transform_funcall(transform, transform_key_funcall(key, v_object))) : v_object; (!previous_transformation.eql(transformation)) && (!previous_transformation.equal(transformation)); previous_transformation = transformation , transformation = (NIL != transform_pred_funcall(pred, transformation)) ? copy_tree(transform_transform_funcall(transform, transform_key_funcall(key, transformation))) : transformation) {
                    if (transformation_count.numGE(transformation_max)) {
                        sublisp_throw($TRANSFORMATION_LIMIT_EXCEEDED, list($TRANSFORMATION_LIMIT_EXCEEDED, transformation_count, transformation_max));
                    }
                    transformation_count = add(transformation_count, ONE_INTEGER);
                }
                return values(transformation, transformation_count);
            }
            SubLObject previous_transformation;
            SubLObject transformation;
            for (previous_transformation = v_object, transformation = NIL, transformation = (NIL != transform_pred_funcall(pred, v_object)) ? copy_tree(transform_transform_funcall(transform, transform_key_funcall(key, v_object))) : v_object; (!previous_transformation.eql(transformation)) && (NIL == transform_quiescence_funcall(quiescence, previous_transformation, transformation)); previous_transformation = transformation , transformation = (NIL != transform_pred_funcall(pred, transformation)) ? copy_tree(transform_transform_funcall(transform, transform_key_funcall(key, transformation))) : transformation) {
                if (transformation_count.numGE(transformation_max)) {
                    sublisp_throw($TRANSFORMATION_LIMIT_EXCEEDED, list($TRANSFORMATION_LIMIT_EXCEEDED, transformation_count, transformation_max));
                }
                transformation_count = add(transformation_count, ONE_INTEGER);
            }
            return values(transformation, transformation_count);
        }
    }

    public static final SubLObject positive_integer_less_than_1000_p_alt(SubLObject v_object) {
        return makeBoolean((NIL != subl_promotions.positive_integer_p(v_object)) && v_object.numL($int$1000));
    }

    public static SubLObject positive_integer_less_than_1000_p(final SubLObject v_object) {
        return makeBoolean((NIL != subl_promotions.positive_integer_p(v_object)) && v_object.numL($int$1000));
    }

    public static final SubLObject test_transform_alt(SubLObject v_object, SubLObject pred, SubLObject transform) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject result = NIL;
                SubLObject error = NIL;
                SubLObject timed_outP = NIL;
                try {
                    {
                        SubLObject tag = with_timeout_make_tag();
                        try {
                            {
                                SubLObject _prev_bind_0 = $within_with_timeout$.currentBinding(thread);
                                try {
                                    $within_with_timeout$.bind(T, thread);
                                    {
                                        SubLObject timer = NIL;
                                        try {
                                            {
                                                SubLObject _prev_bind_0_13 = $with_timeout_nesting_depth$.currentBinding(thread);
                                                try {
                                                    $with_timeout_nesting_depth$.bind(add(ONE_INTEGER, $with_timeout_nesting_depth$.getDynamicValue(thread)), thread);
                                                    timer = with_timeout_start_timer(ONE_INTEGER, tag);
                                                    result = com.cyc.cycjava.cycl.transform_list_utilities.transform(v_object, pred, transform, UNPROVIDED);
                                                } finally {
                                                    $with_timeout_nesting_depth$.rebind(_prev_bind_0_13, thread);
                                                }
                                            }
                                        } finally {
                                            {
                                                SubLObject _prev_bind_0_14 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                try {
                                                    $is_thread_performing_cleanupP$.bind(T, thread);
                                                    with_timeout_stop_timer(timer);
                                                } finally {
                                                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_14, thread);
                                                }
                                            }
                                        }
                                    }
                                } finally {
                                    $within_with_timeout$.rebind(_prev_bind_0, thread);
                                }
                            }
                        } catch (Throwable ccatch_env_var) {
                            timed_outP = Errors.handleThrowable(ccatch_env_var, tag);
                        }
                    }
                } catch (Throwable ccatch_env_var) {
                    error = Errors.handleThrowable(ccatch_env_var, $TRANSFORMATION_LIMIT_EXCEEDED);
                }
                if (NIL != error) {
                    return $ERROR;
                } else {
                    if (NIL != timed_outP) {
                        return $TIMEOUT;
                    } else {
                        return result;
                    }
                }
            }
        }
    }

    public static SubLObject test_transform(final SubLObject v_object, final SubLObject pred, final SubLObject transform) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = NIL;
        SubLObject error = NIL;
        SubLObject timed_outP = NIL;
        try {
            thread.throwStack.push($TRANSFORMATION_LIMIT_EXCEEDED);
            final SubLObject tag = with_timeout_make_tag();
            try {
                thread.throwStack.push(tag);
                final SubLObject _prev_bind_0 = $within_with_timeout$.currentBinding(thread);
                try {
                    $within_with_timeout$.bind(T, thread);
                    SubLObject timer = NIL;
                    try {
                        final SubLObject _prev_bind_0_$13 = $with_timeout_nesting_depth$.currentBinding(thread);
                        try {
                            $with_timeout_nesting_depth$.bind(add(ONE_INTEGER, $with_timeout_nesting_depth$.getDynamicValue(thread)), thread);
                            timer = with_timeout_start_timer(ONE_INTEGER, tag);
                            result = transform(v_object, pred, transform, UNPROVIDED);
                        } finally {
                            $with_timeout_nesting_depth$.rebind(_prev_bind_0_$13, thread);
                        }
                    } finally {
                        final SubLObject _prev_bind_0_$14 = $is_thread_performing_cleanupP$.currentBinding(thread);
                        try {
                            $is_thread_performing_cleanupP$.bind(T, thread);
                            final SubLObject _values = getValuesAsVector();
                            with_timeout_stop_timer(timer);
                            restoreValuesFromVector(_values);
                        } finally {
                            $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$14, thread);
                        }
                    }
                } finally {
                    $within_with_timeout$.rebind(_prev_bind_0, thread);
                }
            } catch (final Throwable ccatch_env_var) {
                timed_outP = Errors.handleThrowable(ccatch_env_var, tag);
            } finally {
                thread.throwStack.pop();
            }
        } catch (final Throwable ccatch_env_var2) {
            error = Errors.handleThrowable(ccatch_env_var2, $TRANSFORMATION_LIMIT_EXCEEDED);
        } finally {
            thread.throwStack.pop();
        }
        if (NIL != error) {
            return $ERROR;
        }
        if (NIL != timed_outP) {
            return $TIMEOUT;
        }
        return result;
    }

    public static final SubLObject test_quiescent_transform_alt(SubLObject v_object, SubLObject pred, SubLObject transform) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject result = NIL;
                SubLObject error = NIL;
                SubLObject timed_outP = NIL;
                try {
                    {
                        SubLObject tag = with_timeout_make_tag();
                        try {
                            {
                                SubLObject _prev_bind_0 = $within_with_timeout$.currentBinding(thread);
                                try {
                                    $within_with_timeout$.bind(T, thread);
                                    {
                                        SubLObject timer = NIL;
                                        try {
                                            {
                                                SubLObject _prev_bind_0_15 = $with_timeout_nesting_depth$.currentBinding(thread);
                                                try {
                                                    $with_timeout_nesting_depth$.bind(add(ONE_INTEGER, $with_timeout_nesting_depth$.getDynamicValue(thread)), thread);
                                                    timer = with_timeout_start_timer(ONE_INTEGER, tag);
                                                    result = com.cyc.cycjava.cycl.transform_list_utilities.quiescent_transform(v_object, pred, transform, UNPROVIDED, UNPROVIDED);
                                                } finally {
                                                    $with_timeout_nesting_depth$.rebind(_prev_bind_0_15, thread);
                                                }
                                            }
                                        } finally {
                                            {
                                                SubLObject _prev_bind_0_16 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                try {
                                                    $is_thread_performing_cleanupP$.bind(T, thread);
                                                    with_timeout_stop_timer(timer);
                                                } finally {
                                                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_16, thread);
                                                }
                                            }
                                        }
                                    }
                                } finally {
                                    $within_with_timeout$.rebind(_prev_bind_0, thread);
                                }
                            }
                        } catch (Throwable ccatch_env_var) {
                            timed_outP = Errors.handleThrowable(ccatch_env_var, tag);
                        }
                    }
                } catch (Throwable ccatch_env_var) {
                    error = Errors.handleThrowable(ccatch_env_var, $TRANSFORMATION_LIMIT_EXCEEDED);
                }
                if (NIL != error) {
                    return $ERROR;
                } else {
                    if (NIL != timed_outP) {
                        return $TIMEOUT;
                    } else {
                        return result;
                    }
                }
            }
        }
    }

    public static SubLObject test_quiescent_transform(final SubLObject v_object, final SubLObject pred, final SubLObject transform) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = NIL;
        SubLObject error = NIL;
        SubLObject timed_outP = NIL;
        try {
            thread.throwStack.push($TRANSFORMATION_LIMIT_EXCEEDED);
            final SubLObject tag = with_timeout_make_tag();
            try {
                thread.throwStack.push(tag);
                final SubLObject _prev_bind_0 = $within_with_timeout$.currentBinding(thread);
                try {
                    $within_with_timeout$.bind(T, thread);
                    SubLObject timer = NIL;
                    try {
                        final SubLObject _prev_bind_0_$15 = $with_timeout_nesting_depth$.currentBinding(thread);
                        try {
                            $with_timeout_nesting_depth$.bind(add(ONE_INTEGER, $with_timeout_nesting_depth$.getDynamicValue(thread)), thread);
                            timer = with_timeout_start_timer(ONE_INTEGER, tag);
                            result = quiescent_transform(v_object, pred, transform, UNPROVIDED, UNPROVIDED);
                        } finally {
                            $with_timeout_nesting_depth$.rebind(_prev_bind_0_$15, thread);
                        }
                    } finally {
                        final SubLObject _prev_bind_0_$16 = $is_thread_performing_cleanupP$.currentBinding(thread);
                        try {
                            $is_thread_performing_cleanupP$.bind(T, thread);
                            final SubLObject _values = getValuesAsVector();
                            with_timeout_stop_timer(timer);
                            restoreValuesFromVector(_values);
                        } finally {
                            $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$16, thread);
                        }
                    }
                } finally {
                    $within_with_timeout$.rebind(_prev_bind_0, thread);
                }
            } catch (final Throwable ccatch_env_var) {
                timed_outP = Errors.handleThrowable(ccatch_env_var, tag);
            } finally {
                thread.throwStack.pop();
            }
        } catch (final Throwable ccatch_env_var2) {
            error = Errors.handleThrowable(ccatch_env_var2, $TRANSFORMATION_LIMIT_EXCEEDED);
        } finally {
            thread.throwStack.pop();
        }
        if (NIL != error) {
            return $ERROR;
        }
        if (NIL != timed_outP) {
            return $TIMEOUT;
        }
        return result;
    }

    public static SubLObject declare_transform_list_utilities_file() {
        declareFunction("transform_pred_funcall", "TRANSFORM-PRED-FUNCALL", 2, 0, false);
        declareFunction("transform_key_funcall", "TRANSFORM-KEY-FUNCALL", 2, 0, false);
        declareFunction("transform_transform_funcall", "TRANSFORM-TRANSFORM-FUNCALL", 2, 0, false);
        declareFunction("transform_quiescence_funcall", "TRANSFORM-QUIESCENCE-FUNCALL", 3, 0, false);
        declareFunction("transform", "TRANSFORM", 3, 1, false);
        declareFunction("ntransform", "NTRANSFORM", 3, 3, false);
        declareFunction("ntransform_recursive", "NTRANSFORM-RECURSIVE", 6, 0, false);
        declareFunction("shy_ntransform_recursive", "SHY-NTRANSFORM-RECURSIVE", 8, 0, false);
        declareFunction("ntransform_perform_transform", "NTRANSFORM-PERFORM-TRANSFORM", 4, 0, false);
        declareFunction("shy_ntransform_perform_transform", "SHY-NTRANSFORM-PERFORM-TRANSFORM", 6, 0, false);
        declareFunction("make_ntransform_info", "MAKE-NTRANSFORM-INFO", 3, 0, false);
        declareFunction("reuse_ntransform_info", "REUSE-NTRANSFORM-INFO", 4, 0, false);
        declareMacro("get_ntransform_info_parent_cons", "GET-NTRANSFORM-INFO-PARENT-CONS");
        declareMacro("get_ntransform_info_set_op", "GET-NTRANSFORM-INFO-SET-OP");
        declareMacro("get_ntransform_info_value", "GET-NTRANSFORM-INFO-VALUE");
        declareMacro("set_ntransform_info_parent_cons", "SET-NTRANSFORM-INFO-PARENT-CONS");
        declareMacro("set_ntransform_info_set_op", "SET-NTRANSFORM-INFO-SET-OP");
        declareMacro("set_ntransform_info_value", "SET-NTRANSFORM-INFO-VALUE");
        declareFunction("ntransform_iterative", "NTRANSFORM-ITERATIVE", 3, 1, false);
        declareFunction("shy_ntransform_iterative", "SHY-NTRANSFORM-ITERATIVE", 3, 3, false);
        declareFunction("quiescent_transform", "QUIESCENT-TRANSFORM", 3, 2, false);
        declareFunction("quiescent_ntransform", "QUIESCENT-NTRANSFORM", 3, 4, false);
        declareFunction("quiescent_ntransform_recursive", "QUIESCENT-NTRANSFORM-RECURSIVE", 7, 0, false);
        declareFunction("shy_quiescent_ntransform_recursive", "SHY-QUIESCENT-NTRANSFORM-RECURSIVE", 9, 0, false);
        declareFunction("quiescent_ntransform_iterative", "QUIESCENT-NTRANSFORM-ITERATIVE", 3, 2, false);
        declareFunction("shy_quiescent_ntransform_iterative", "SHY-QUIESCENT-NTRANSFORM-ITERATIVE", 3, 4, false);
        declareFunction("ntransform_perform_quiescent_transform", "NTRANSFORM-PERFORM-QUIESCENT-TRANSFORM", 5, 0, false);
        declareFunction("shy_ntransform_perform_quiescent_transform", "SHY-NTRANSFORM-PERFORM-QUIESCENT-TRANSFORM", 7, 0, false);
        declareFunction("positive_integer_less_than_1000_p", "POSITIVE-INTEGER-LESS-THAN-1000-P", 1, 0, false);
        declareFunction("test_transform", "TEST-TRANSFORM", 3, 0, false);
        declareFunction("test_quiescent_transform", "TEST-QUIESCENT-TRANSFORM", 3, 0, false);
        return NIL;
    }

    public static SubLObject init_transform_list_utilities_file() {
        defparameter("*DEFAULT-RECURSION-LIMIT*", $int$212);
        defparameter("*DEFAULT-TRANSFORMATION-MAX*", NIL);
        defparameter("*DEFAULT-QUIESCENT-TRANSFORMATION-MAX*", $int$1024);
        return NIL;
    }

    public static final SubLObject setup_transform_list_utilities_file_alt() {
        register_external_symbol(TRANSFORM);
        register_external_symbol(NTRANSFORM);
        register_external_symbol(QUIESCENT_TRANSFORM);
        register_external_symbol(QUIESCENT_NTRANSFORM);
        define_test_case_table_int(TEST_TRANSFORM, list(new SubLObject[]{ $TEST, NIL, $OWNER, $$$pace, $CLASSES, NIL, $KB, $TINY, $WORKING_, T }), $list_alt28);
        return NIL;
    }

    public static SubLObject setup_transform_list_utilities_file() {
        if (SubLFiles.USE_V1) {
            register_external_symbol(TRANSFORM);
            register_external_symbol(NTRANSFORM);
            register_external_symbol(QUIESCENT_TRANSFORM);
            register_external_symbol(QUIESCENT_NTRANSFORM);
            define_test_case_table_int(TEST_TRANSFORM, list(new SubLObject[]{ $TEST, NIL, $OWNER, NIL, $CLASSES, NIL, $KB, $TINY, $WORKING_, T }), $list27);
        }
        if (SubLFiles.USE_V2) {
            define_test_case_table_int(TEST_TRANSFORM, list(new SubLObject[]{ $TEST, NIL, $OWNER, $$$pace, $CLASSES, NIL, $KB, $TINY, $WORKING_, T }), $list_alt28);
        }
        return NIL;
    }

    public static SubLObject setup_transform_list_utilities_file_Previous() {
        register_external_symbol(TRANSFORM);
        register_external_symbol(NTRANSFORM);
        register_external_symbol(QUIESCENT_TRANSFORM);
        register_external_symbol(QUIESCENT_NTRANSFORM);
        define_test_case_table_int(TEST_TRANSFORM, list(new SubLObject[]{ $TEST, NIL, $OWNER, NIL, $CLASSES, NIL, $KB, $TINY, $WORKING_, T }), $list27);
        return NIL;
    }

    @Override
    public void declareFunctions() {
        declare_transform_list_utilities_file();
    }

    @Override
    public void initializeVariables() {
        init_transform_list_utilities_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_transform_list_utilities_file();
    }

    

    static private final SubLList $list_alt5 = list(makeSymbol("NTRANSFORM-INFO"));

    static private final SubLList $list_alt9 = list(makeSymbol("NTRANSFORM-INFO"), makeSymbol("NEW-PARENT-CONS"));

    static private final SubLList $list_alt11 = list(makeSymbol("NTRANSFORM-INFO"), makeSymbol("NEW-SET-OP"));

    static private final SubLList $list_alt13 = list(makeSymbol("NTRANSFORM-INFO"), makeSymbol("NEW-VALUE"));

    static private final SubLString $$$pace = makeString("pace");

    static private final SubLList $list_alt28 = list(list(list(list(ONE_INTEGER), makeSymbol("POSITIVE-INTEGER-LESS-THAN-1000-P"), makeSymbol("1+")), list(makeInteger(1000))), list(list(list(ONE_INTEGER, TWO_INTEGER, THREE_INTEGER), makeSymbol("POSITIVE-INTEGER-LESS-THAN-1000-P"), makeSymbol("1+")), list(makeInteger(1000), makeInteger(1000), makeInteger(1000))));
}

/**
 * Total time: 248 ms
 */
