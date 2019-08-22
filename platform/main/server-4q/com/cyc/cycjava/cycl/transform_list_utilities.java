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
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


public final class transform_list_utilities extends SubLTranslatedFile {
    public static final SubLFile me = new transform_list_utilities();

    public static final String myName = "com.cyc.cycjava.cycl.transform_list_utilities";

    public static final String myFingerPrint = "95fe18de60efcdccdff48ce22c0909ded4a962986a339d6d8c3580d874f81114";

    // defparameter
    // Definitions
    public static final SubLSymbol $default_recursion_limit$ = makeSymbol("*DEFAULT-RECURSION-LIMIT*");

    // defparameter
    public static final SubLSymbol $default_transformation_max$ = makeSymbol("*DEFAULT-TRANSFORMATION-MAX*");

    // defparameter
    public static final SubLSymbol $default_quiescent_transformation_max$ = makeSymbol("*DEFAULT-QUIESCENT-TRANSFORMATION-MAX*");

    private static final SubLInteger $int$212 = makeInteger(212);

    private static final SubLInteger $int$1024 = makeInteger(1024);

    public static final SubLSymbol TRANSFORM = makeSymbol("TRANSFORM");

    public static final SubLSymbol NTRANSFORM = makeSymbol("NTRANSFORM");

    private static final SubLSymbol $TRANSFORMATION_LIMIT_EXCEEDED = makeKeyword("TRANSFORMATION-LIMIT-EXCEEDED");

    public static final SubLList $list5 = list(makeSymbol("NTRANSFORM-INFO"));







    public static final SubLList $list9 = list(makeSymbol("NTRANSFORM-INFO"), makeSymbol("NEW-PARENT-CONS"));



    public static final SubLList $list11 = list(makeSymbol("NTRANSFORM-INFO"), makeSymbol("NEW-SET-OP"));



    public static final SubLList $list13 = list(makeSymbol("NTRANSFORM-INFO"), makeSymbol("NEW-VALUE"));



    public static final SubLSymbol QUIESCENT_TRANSFORM = makeSymbol("QUIESCENT-TRANSFORM");

    public static final SubLSymbol QUIESCENT_NTRANSFORM = makeSymbol("QUIESCENT-NTRANSFORM");







    public static final SubLSymbol TEST_TRANSFORM = makeSymbol("TEST-TRANSFORM");













    private static final SubLList $list27 = list(list(list(list(ONE_INTEGER), makeSymbol("POSITIVE-INTEGER-LESS-THAN-1000-P"), makeSymbol("1+")), list(makeInteger(1000))), list(list(list(ONE_INTEGER, TWO_INTEGER, THREE_INTEGER), makeSymbol("POSITIVE-INTEGER-LESS-THAN-1000-P"), makeSymbol("1+")), list(makeInteger(1000), makeInteger(1000), makeInteger(1000))));

    public static SubLObject transform_pred_funcall(final SubLObject pred, final SubLObject v_object) {
        return eval_in_api.possibly_cyc_api_funcall_1(pred, v_object);
    }

    public static SubLObject transform_key_funcall(final SubLObject key, final SubLObject v_object) {
        return eval_in_api.possibly_cyc_api_funcall_1(key, v_object);
    }

    public static SubLObject transform_transform_funcall(final SubLObject transform, final SubLObject v_object) {
        return eval_in_api.possibly_cyc_api_funcall_1(transform, v_object);
    }

    public static SubLObject transform_quiescence_funcall(final SubLObject quiescence, final SubLObject previous, final SubLObject v_new) {
        return eval_in_api.possibly_cyc_api_funcall_2(quiescence, previous, v_new);
    }

    public static SubLObject transform(final SubLObject v_object, final SubLObject pred, final SubLObject transform, SubLObject key) {
        if (key == UNPROVIDED) {
            key = symbol_function(IDENTITY);
        }
        return ntransform(copy_tree(v_object), pred, transform, key, UNPROVIDED, UNPROVIDED);
    }

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

    public static SubLObject make_ntransform_info(final SubLObject parent_cons, final SubLObject set_op, final SubLObject value) {
        return listS(parent_cons, set_op, value);
    }

    public static SubLObject reuse_ntransform_info(final SubLObject info, final SubLObject parent_cons, final SubLObject set_op, final SubLObject value) {
        final SubLObject rest_of_info = info.rest();
        rplaca(info, parent_cons);
        rplaca(rest_of_info, set_op);
        rplacd(rest_of_info, value);
        return info;
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
    }

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
    }

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
    }

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
    }

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
    }

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

    public static SubLObject positive_integer_less_than_1000_p(final SubLObject v_object) {
        return makeBoolean((NIL != subl_promotions.positive_integer_p(v_object)) && v_object.numL($int$1000));
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
        declareFunction(me, "transform_pred_funcall", "TRANSFORM-PRED-FUNCALL", 2, 0, false);
        declareFunction(me, "transform_key_funcall", "TRANSFORM-KEY-FUNCALL", 2, 0, false);
        declareFunction(me, "transform_transform_funcall", "TRANSFORM-TRANSFORM-FUNCALL", 2, 0, false);
        declareFunction(me, "transform_quiescence_funcall", "TRANSFORM-QUIESCENCE-FUNCALL", 3, 0, false);
        declareFunction(me, "transform", "TRANSFORM", 3, 1, false);
        declareFunction(me, "ntransform", "NTRANSFORM", 3, 3, false);
        declareFunction(me, "ntransform_recursive", "NTRANSFORM-RECURSIVE", 6, 0, false);
        declareFunction(me, "shy_ntransform_recursive", "SHY-NTRANSFORM-RECURSIVE", 8, 0, false);
        declareFunction(me, "ntransform_perform_transform", "NTRANSFORM-PERFORM-TRANSFORM", 4, 0, false);
        declareFunction(me, "shy_ntransform_perform_transform", "SHY-NTRANSFORM-PERFORM-TRANSFORM", 6, 0, false);
        declareFunction(me, "make_ntransform_info", "MAKE-NTRANSFORM-INFO", 3, 0, false);
        declareFunction(me, "reuse_ntransform_info", "REUSE-NTRANSFORM-INFO", 4, 0, false);
        declareMacro(me, "get_ntransform_info_parent_cons", "GET-NTRANSFORM-INFO-PARENT-CONS");
        declareMacro(me, "get_ntransform_info_set_op", "GET-NTRANSFORM-INFO-SET-OP");
        declareMacro(me, "get_ntransform_info_value", "GET-NTRANSFORM-INFO-VALUE");
        declareMacro(me, "set_ntransform_info_parent_cons", "SET-NTRANSFORM-INFO-PARENT-CONS");
        declareMacro(me, "set_ntransform_info_set_op", "SET-NTRANSFORM-INFO-SET-OP");
        declareMacro(me, "set_ntransform_info_value", "SET-NTRANSFORM-INFO-VALUE");
        declareFunction(me, "ntransform_iterative", "NTRANSFORM-ITERATIVE", 3, 1, false);
        declareFunction(me, "shy_ntransform_iterative", "SHY-NTRANSFORM-ITERATIVE", 3, 3, false);
        declareFunction(me, "quiescent_transform", "QUIESCENT-TRANSFORM", 3, 2, false);
        declareFunction(me, "quiescent_ntransform", "QUIESCENT-NTRANSFORM", 3, 4, false);
        declareFunction(me, "quiescent_ntransform_recursive", "QUIESCENT-NTRANSFORM-RECURSIVE", 7, 0, false);
        declareFunction(me, "shy_quiescent_ntransform_recursive", "SHY-QUIESCENT-NTRANSFORM-RECURSIVE", 9, 0, false);
        declareFunction(me, "quiescent_ntransform_iterative", "QUIESCENT-NTRANSFORM-ITERATIVE", 3, 2, false);
        declareFunction(me, "shy_quiescent_ntransform_iterative", "SHY-QUIESCENT-NTRANSFORM-ITERATIVE", 3, 4, false);
        declareFunction(me, "ntransform_perform_quiescent_transform", "NTRANSFORM-PERFORM-QUIESCENT-TRANSFORM", 5, 0, false);
        declareFunction(me, "shy_ntransform_perform_quiescent_transform", "SHY-NTRANSFORM-PERFORM-QUIESCENT-TRANSFORM", 7, 0, false);
        declareFunction(me, "positive_integer_less_than_1000_p", "POSITIVE-INTEGER-LESS-THAN-1000-P", 1, 0, false);
        declareFunction(me, "test_transform", "TEST-TRANSFORM", 3, 0, false);
        declareFunction(me, "test_quiescent_transform", "TEST-QUIESCENT-TRANSFORM", 3, 0, false);
        return NIL;
    }

    public static SubLObject init_transform_list_utilities_file() {
        defparameter("*DEFAULT-RECURSION-LIMIT*", $int$212);
        defparameter("*DEFAULT-TRANSFORMATION-MAX*", NIL);
        defparameter("*DEFAULT-QUIESCENT-TRANSFORMATION-MAX*", $int$1024);
        return NIL;
    }

    public static SubLObject setup_transform_list_utilities_file() {
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

    
}

/**
 * Total time: 248 ms
 */
