/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 */
package com.cyc.cycjava.cycl;

import static com.cyc.cycjava.cycl.constant_handles.reader_make_constant_shell;
import static com.cyc.cycjava.cycl.el_utilities.el_binary_formula_p;
import static com.cyc.cycjava.cycl.el_utilities.el_formula_p;
import static com.cyc.cycjava.cycl.el_utilities.el_ternary_formula_p;
import static com.cyc.cycjava.cycl.el_utilities.list_to_elf;
import static com.cyc.cycjava.cycl.el_utilities.make_formula;
import static com.cyc.cycjava.cycl.el_utilities.replace_formula_arg;
import static com.cyc.cycjava.cycl.el_utilities.unmake_binary_formula;
import static com.cyc.cycjava.cycl.el_utilities.unmake_ternary_formula;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.cons;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.values;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeInteger;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeKeyword;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeString;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeSymbol;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.member;
import static com.cyc.tool.subl.util.SubLFiles.declareFunction;
import static com.cyc.tool.subl.util.SubLFiles.deflexical;

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

/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 * module:      REFORMULATOR-MODULE-QUANTIFIER-OPTIMIZER-3
 * source file: /cyc/top/cycl/reformulator-module-quantifier-optimizer-3.lisp
 * created:     2019/07/03 17:37:33
 */
public final class reformulator_module_quantifier_optimizer_3 extends SubLTranslatedFile implements V12 {
    public static final SubLObject ternary_function_instance_wth_relation_p(SubLObject ternary_function_instance_wth_relation) {
	return classes.subloop_instanceof_class(ternary_function_instance_wth_relation, TERNARY_FUNCTION_INSTANCE_WTH_RELATION);
    }

    public static final SubLObject subloop_reserved_initialize_ternary_function_instance_wth_relation_instance(SubLObject new_instance) {
	classes.subloop_initialize_slot(new_instance, OBJECT, ISOLATED_P, NIL);
	classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_NUMBER, NIL);
	classes.subloop_initialize_slot(new_instance, TEST_CASE, RESULT, NIL);
	classes.subloop_initialize_slot(new_instance, TEST_CASE, TEST_METHOD, NIL);
	classes.subloop_initialize_slot(new_instance, TERNARY_FUNCTION_INSTANCE_WTH_RELATION, IN_CYCL, NIL);
	classes.subloop_initialize_slot(new_instance, TERNARY_FUNCTION_INSTANCE_WTH_RELATION, OUT_CYCL, NIL);
	classes.subloop_initialize_slot(new_instance, TERNARY_FUNCTION_INSTANCE_WTH_RELATION, MT, NIL);
	return NIL;
    }

    public static final SubLObject subloop_reserved_initialize_ternary_function_instance_wth_relation_class(SubLObject new_instance) {
	classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_COUNT, ZERO_INTEGER);
	classes.subloop_initialize_slot(new_instance, TEST_CASE, MODULE, NIL);
	classes.subloop_initialize_slot(new_instance, TEST_CASE, CATEGORIES, NIL);
	classes.subloop_initialize_slot(new_instance, TEST_CASE, SUITES, NIL);
	classes.subloop_initialize_slot(new_instance, TEST_CASE, TEST_METHODS, NIL);
	classes.subloop_initialize_slot(new_instance, TEST_CASE, ENABLED, NIL);
	classes.subloop_initialize_slot(new_instance, TEST_CASE, LOCK, NIL);
	return NIL;
    }

    public static final SubLObject subloop_reserved_initialize_subcollection_function_first_instance(SubLObject new_instance) {
	classes.subloop_initialize_slot(new_instance, OBJECT, ISOLATED_P, NIL);
	classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_NUMBER, NIL);
	classes.subloop_initialize_slot(new_instance, TEST_CASE, RESULT, NIL);
	classes.subloop_initialize_slot(new_instance, TEST_CASE, TEST_METHOD, NIL);
	classes.subloop_initialize_slot(new_instance, SUBCOLLECTION_FUNCTION_FIRST, IN_CYCL, NIL);
	classes.subloop_initialize_slot(new_instance, SUBCOLLECTION_FUNCTION_FIRST, OUT_CYCL, NIL);
	classes.subloop_initialize_slot(new_instance, SUBCOLLECTION_FUNCTION_FIRST, MT, NIL);
	return NIL;
    }

    public static final SubLObject subloop_reserved_initialize_subcollection_function_first_class(SubLObject new_instance) {
	classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_COUNT, ZERO_INTEGER);
	classes.subloop_initialize_slot(new_instance, TEST_CASE, MODULE, NIL);
	classes.subloop_initialize_slot(new_instance, TEST_CASE, CATEGORIES, NIL);
	classes.subloop_initialize_slot(new_instance, TEST_CASE, SUITES, NIL);
	classes.subloop_initialize_slot(new_instance, TEST_CASE, TEST_METHODS, NIL);
	classes.subloop_initialize_slot(new_instance, TEST_CASE, ENABLED, NIL);
	classes.subloop_initialize_slot(new_instance, TEST_CASE, LOCK, NIL);
	return NIL;
    }

    public static final SubLObject subloop_reserved_initialize_instance_level_arg1_constraint_instance(SubLObject new_instance) {
	classes.subloop_initialize_slot(new_instance, OBJECT, ISOLATED_P, NIL);
	classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_NUMBER, NIL);
	classes.subloop_initialize_slot(new_instance, TEST_CASE, RESULT, NIL);
	classes.subloop_initialize_slot(new_instance, TEST_CASE, TEST_METHOD, NIL);
	classes.subloop_initialize_slot(new_instance, INSTANCE_LEVEL_ARG1_CONSTRAINT, IN_CYCL, NIL);
	classes.subloop_initialize_slot(new_instance, INSTANCE_LEVEL_ARG1_CONSTRAINT, OUT_CYCL, NIL);
	classes.subloop_initialize_slot(new_instance, INSTANCE_LEVEL_ARG1_CONSTRAINT, MT, NIL);
	return NIL;
    }

    public static final SubLObject subloop_reserved_initialize_instance_level_arg1_constraint_class(SubLObject new_instance) {
	classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_COUNT, ZERO_INTEGER);
	classes.subloop_initialize_slot(new_instance, TEST_CASE, MODULE, NIL);
	classes.subloop_initialize_slot(new_instance, TEST_CASE, CATEGORIES, NIL);
	classes.subloop_initialize_slot(new_instance, TEST_CASE, SUITES, NIL);
	classes.subloop_initialize_slot(new_instance, TEST_CASE, TEST_METHODS, NIL);
	classes.subloop_initialize_slot(new_instance, TEST_CASE, ENABLED, NIL);
	classes.subloop_initialize_slot(new_instance, TEST_CASE, LOCK, NIL);
	return NIL;
    }

    public static final SubLObject subloop_reserved_initialize_collection_subset_fn_term_instance(SubLObject new_instance) {
	classes.subloop_initialize_slot(new_instance, OBJECT, ISOLATED_P, NIL);
	classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_NUMBER, NIL);
	classes.subloop_initialize_slot(new_instance, TEST_CASE, RESULT, NIL);
	classes.subloop_initialize_slot(new_instance, TEST_CASE, TEST_METHOD, NIL);
	classes.subloop_initialize_slot(new_instance, COLLECTION_SUBSET_FN_TERM, IN_CYCL, NIL);
	classes.subloop_initialize_slot(new_instance, COLLECTION_SUBSET_FN_TERM, OUT_CYCL, NIL);
	classes.subloop_initialize_slot(new_instance, COLLECTION_SUBSET_FN_TERM, MT, NIL);
	return NIL;
    }

    public static final SubLObject subloop_reserved_initialize_collection_subset_fn_term_class(SubLObject new_instance) {
	classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_COUNT, ZERO_INTEGER);
	classes.subloop_initialize_slot(new_instance, TEST_CASE, MODULE, NIL);
	classes.subloop_initialize_slot(new_instance, TEST_CASE, CATEGORIES, NIL);
	classes.subloop_initialize_slot(new_instance, TEST_CASE, SUITES, NIL);
	classes.subloop_initialize_slot(new_instance, TEST_CASE, TEST_METHODS, NIL);
	classes.subloop_initialize_slot(new_instance, TEST_CASE, ENABLED, NIL);
	classes.subloop_initialize_slot(new_instance, TEST_CASE, LOCK, NIL);
	return NIL;
    }

    public static final SubLObject subloop_reserved_initialize_collection_difference_function_instance(SubLObject new_instance) {
	classes.subloop_initialize_slot(new_instance, OBJECT, ISOLATED_P, NIL);
	classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_NUMBER, NIL);
	classes.subloop_initialize_slot(new_instance, TEST_CASE, RESULT, NIL);
	classes.subloop_initialize_slot(new_instance, TEST_CASE, TEST_METHOD, NIL);
	classes.subloop_initialize_slot(new_instance, COLLECTION_DIFFERENCE_FUNCTION, IN_CYCL, NIL);
	classes.subloop_initialize_slot(new_instance, COLLECTION_DIFFERENCE_FUNCTION, OUT_CYCL, NIL);
	classes.subloop_initialize_slot(new_instance, COLLECTION_DIFFERENCE_FUNCTION, MT, NIL);
	return NIL;
    }

    public static final SubLObject subloop_reserved_initialize_collection_difference_function_class(SubLObject new_instance) {
	classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_COUNT, ZERO_INTEGER);
	classes.subloop_initialize_slot(new_instance, TEST_CASE, MODULE, NIL);
	classes.subloop_initialize_slot(new_instance, TEST_CASE, CATEGORIES, NIL);
	classes.subloop_initialize_slot(new_instance, TEST_CASE, SUITES, NIL);
	classes.subloop_initialize_slot(new_instance, TEST_CASE, TEST_METHODS, NIL);
	classes.subloop_initialize_slot(new_instance, TEST_CASE, ENABLED, NIL);
	classes.subloop_initialize_slot(new_instance, TEST_CASE, LOCK, NIL);
	return NIL;
    }

    public static final SubLObject subloop_reserved_initialize_binary_function_reported_instance(SubLObject new_instance) {
	classes.subloop_initialize_slot(new_instance, OBJECT, ISOLATED_P, NIL);
	classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_NUMBER, NIL);
	classes.subloop_initialize_slot(new_instance, TEST_CASE, RESULT, NIL);
	classes.subloop_initialize_slot(new_instance, TEST_CASE, TEST_METHOD, NIL);
	classes.subloop_initialize_slot(new_instance, BINARY_FUNCTION_REPORTED, IN_CYCL, NIL);
	classes.subloop_initialize_slot(new_instance, BINARY_FUNCTION_REPORTED, OUT_CYCL, NIL);
	classes.subloop_initialize_slot(new_instance, BINARY_FUNCTION_REPORTED, MT, NIL);
	return NIL;
    }

    public static final SubLObject subloop_reserved_initialize_binary_function_reported_class(SubLObject new_instance) {
	classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_COUNT, ZERO_INTEGER);
	classes.subloop_initialize_slot(new_instance, TEST_CASE, MODULE, NIL);
	classes.subloop_initialize_slot(new_instance, TEST_CASE, CATEGORIES, NIL);
	classes.subloop_initialize_slot(new_instance, TEST_CASE, SUITES, NIL);
	classes.subloop_initialize_slot(new_instance, TEST_CASE, TEST_METHODS, NIL);
	classes.subloop_initialize_slot(new_instance, TEST_CASE, ENABLED, NIL);
	classes.subloop_initialize_slot(new_instance, TEST_CASE, LOCK, NIL);
	return NIL;
    }

    public static final SubLObject subloop_reserved_initialize_binary_function_coll_intersect_instance(SubLObject new_instance) {
	classes.subloop_initialize_slot(new_instance, OBJECT, ISOLATED_P, NIL);
	classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_NUMBER, NIL);
	classes.subloop_initialize_slot(new_instance, TEST_CASE, RESULT, NIL);
	classes.subloop_initialize_slot(new_instance, TEST_CASE, TEST_METHOD, NIL);
	classes.subloop_initialize_slot(new_instance, BINARY_FUNCTION_COLL_INTERSECT, IN_CYCL, NIL);
	classes.subloop_initialize_slot(new_instance, BINARY_FUNCTION_COLL_INTERSECT, OUT_CYCL, NIL);
	classes.subloop_initialize_slot(new_instance, BINARY_FUNCTION_COLL_INTERSECT, MT, NIL);
	return NIL;
    }

    public static final SubLObject subloop_reserved_initialize_binary_function_coll_intersect_class(SubLObject new_instance) {
	classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_COUNT, ZERO_INTEGER);
	classes.subloop_initialize_slot(new_instance, TEST_CASE, MODULE, NIL);
	classes.subloop_initialize_slot(new_instance, TEST_CASE, CATEGORIES, NIL);
	classes.subloop_initialize_slot(new_instance, TEST_CASE, SUITES, NIL);
	classes.subloop_initialize_slot(new_instance, TEST_CASE, TEST_METHODS, NIL);
	classes.subloop_initialize_slot(new_instance, TEST_CASE, ENABLED, NIL);
	classes.subloop_initialize_slot(new_instance, TEST_CASE, LOCK, NIL);
	return NIL;
    }

    public static final SubLObject subcollection_function_first_p(SubLObject subcollection_function_first) {
	return classes.subloop_instanceof_class(subcollection_function_first, SUBCOLLECTION_FUNCTION_FIRST);
    }

    public static final SubLObject set_ternary_function_instance_wth_relation_out_cycl(SubLObject ternary_function_instance_wth_relation, SubLObject value) {
	return classes.subloop_set_access_protected_instance_slot(ternary_function_instance_wth_relation, value, FOUR_INTEGER, OUT_CYCL);
    }

    public static final SubLObject set_ternary_function_instance_wth_relation_mt(SubLObject ternary_function_instance_wth_relation, SubLObject value) {
	return classes.subloop_set_access_protected_instance_slot(ternary_function_instance_wth_relation, value, FIVE_INTEGER, MT);
    }

    public static final SubLObject set_ternary_function_instance_wth_relation_in_cycl(SubLObject ternary_function_instance_wth_relation, SubLObject value) {
	return classes.subloop_set_access_protected_instance_slot(ternary_function_instance_wth_relation, value, THREE_INTEGER, IN_CYCL);
    }

    public static final SubLObject set_subcollection_function_first_out_cycl(SubLObject subcollection_function_first, SubLObject value) {
	return classes.subloop_set_access_protected_instance_slot(subcollection_function_first, value, FOUR_INTEGER, OUT_CYCL);
    }

    public static final SubLObject set_subcollection_function_first_mt(SubLObject subcollection_function_first, SubLObject value) {
	return classes.subloop_set_access_protected_instance_slot(subcollection_function_first, value, FIVE_INTEGER, MT);
    }

    public static final SubLObject set_subcollection_function_first_in_cycl(SubLObject subcollection_function_first, SubLObject value) {
	return classes.subloop_set_access_protected_instance_slot(subcollection_function_first, value, THREE_INTEGER, IN_CYCL);
    }

    public static final SubLObject set_instance_level_arg1_constraint_out_cycl(SubLObject instance_level_arg1_constraint, SubLObject value) {
	return classes.subloop_set_access_protected_instance_slot(instance_level_arg1_constraint, value, FOUR_INTEGER, OUT_CYCL);
    }

    public static final SubLObject set_instance_level_arg1_constraint_mt(SubLObject instance_level_arg1_constraint, SubLObject value) {
	return classes.subloop_set_access_protected_instance_slot(instance_level_arg1_constraint, value, FIVE_INTEGER, MT);
    }

    public static final SubLObject set_instance_level_arg1_constraint_in_cycl(SubLObject instance_level_arg1_constraint, SubLObject value) {
	return classes.subloop_set_access_protected_instance_slot(instance_level_arg1_constraint, value, THREE_INTEGER, IN_CYCL);
    }

    public static final SubLObject set_collection_subset_fn_term_out_cycl(SubLObject collection_subset_fn_term, SubLObject value) {
	return classes.subloop_set_access_protected_instance_slot(collection_subset_fn_term, value, FOUR_INTEGER, OUT_CYCL);
    }

    public static final SubLObject set_collection_subset_fn_term_mt(SubLObject collection_subset_fn_term, SubLObject value) {
	return classes.subloop_set_access_protected_instance_slot(collection_subset_fn_term, value, FIVE_INTEGER, MT);
    }

    public static final SubLObject set_collection_subset_fn_term_in_cycl(SubLObject collection_subset_fn_term, SubLObject value) {
	return classes.subloop_set_access_protected_instance_slot(collection_subset_fn_term, value, THREE_INTEGER, IN_CYCL);
    }

    public static final SubLObject set_collection_difference_function_out_cycl(SubLObject collection_difference_function, SubLObject value) {
	return classes.subloop_set_access_protected_instance_slot(collection_difference_function, value, FOUR_INTEGER, OUT_CYCL);
    }

    public static final SubLObject set_collection_difference_function_mt(SubLObject collection_difference_function, SubLObject value) {
	return classes.subloop_set_access_protected_instance_slot(collection_difference_function, value, FIVE_INTEGER, MT);
    }

    public static final SubLObject set_collection_difference_function_in_cycl(SubLObject collection_difference_function, SubLObject value) {
	return classes.subloop_set_access_protected_instance_slot(collection_difference_function, value, THREE_INTEGER, IN_CYCL);
    }

    public static final SubLObject set_binary_function_reported_out_cycl(SubLObject binary_function_reported, SubLObject value) {
	return classes.subloop_set_access_protected_instance_slot(binary_function_reported, value, FOUR_INTEGER, OUT_CYCL);
    }

    public static final SubLObject set_binary_function_reported_mt(SubLObject binary_function_reported, SubLObject value) {
	return classes.subloop_set_access_protected_instance_slot(binary_function_reported, value, FIVE_INTEGER, MT);
    }

    public static final SubLObject set_binary_function_reported_in_cycl(SubLObject binary_function_reported, SubLObject value) {
	return classes.subloop_set_access_protected_instance_slot(binary_function_reported, value, THREE_INTEGER, IN_CYCL);
    }

    public static final SubLObject set_binary_function_coll_intersect_out_cycl(SubLObject binary_function_coll_intersect, SubLObject value) {
	return classes.subloop_set_access_protected_instance_slot(binary_function_coll_intersect, value, FOUR_INTEGER, OUT_CYCL);
    }

    public static final SubLObject set_binary_function_coll_intersect_mt(SubLObject binary_function_coll_intersect, SubLObject value) {
	return classes.subloop_set_access_protected_instance_slot(binary_function_coll_intersect, value, FIVE_INTEGER, MT);
    }

    public static final SubLObject set_binary_function_coll_intersect_in_cycl(SubLObject binary_function_coll_intersect, SubLObject value) {
	return classes.subloop_set_access_protected_instance_slot(binary_function_coll_intersect, value, THREE_INTEGER, IN_CYCL);
    }

    public static final SubLObject instance_level_arg1_constraint_p(SubLObject instance_level_arg1_constraint) {
	return classes.subloop_instanceof_class(instance_level_arg1_constraint, INSTANCE_LEVEL_ARG1_CONSTRAINT);
    }

    public static final SubLObject get_ternary_function_instance_wth_relation_out_cycl(SubLObject ternary_function_instance_wth_relation) {
	return classes.subloop_get_access_protected_instance_slot(ternary_function_instance_wth_relation, FOUR_INTEGER, OUT_CYCL);
    }

    public static final SubLObject get_ternary_function_instance_wth_relation_mt(SubLObject ternary_function_instance_wth_relation) {
	return classes.subloop_get_access_protected_instance_slot(ternary_function_instance_wth_relation, FIVE_INTEGER, MT);
    }

    public static final SubLObject get_ternary_function_instance_wth_relation_in_cycl(SubLObject ternary_function_instance_wth_relation) {
	return classes.subloop_get_access_protected_instance_slot(ternary_function_instance_wth_relation, THREE_INTEGER, IN_CYCL);
    }

    public static final SubLObject get_subcollection_function_first_out_cycl(SubLObject subcollection_function_first) {
	return classes.subloop_get_access_protected_instance_slot(subcollection_function_first, FOUR_INTEGER, OUT_CYCL);
    }

    public static final SubLObject get_subcollection_function_first_mt(SubLObject subcollection_function_first) {
	return classes.subloop_get_access_protected_instance_slot(subcollection_function_first, FIVE_INTEGER, MT);
    }

    public static final SubLObject get_subcollection_function_first_in_cycl(SubLObject subcollection_function_first) {
	return classes.subloop_get_access_protected_instance_slot(subcollection_function_first, THREE_INTEGER, IN_CYCL);
    }

    public static final SubLObject get_instance_level_arg1_constraint_out_cycl(SubLObject instance_level_arg1_constraint) {
	return classes.subloop_get_access_protected_instance_slot(instance_level_arg1_constraint, FOUR_INTEGER, OUT_CYCL);
    }

    public static final SubLObject get_instance_level_arg1_constraint_mt(SubLObject instance_level_arg1_constraint) {
	return classes.subloop_get_access_protected_instance_slot(instance_level_arg1_constraint, FIVE_INTEGER, MT);
    }

    public static final SubLObject get_instance_level_arg1_constraint_in_cycl(SubLObject instance_level_arg1_constraint) {
	return classes.subloop_get_access_protected_instance_slot(instance_level_arg1_constraint, THREE_INTEGER, IN_CYCL);
    }

    public static final SubLObject get_collection_subset_fn_term_out_cycl(SubLObject collection_subset_fn_term) {
	return classes.subloop_get_access_protected_instance_slot(collection_subset_fn_term, FOUR_INTEGER, OUT_CYCL);
    }

    public static final SubLObject get_collection_subset_fn_term_mt(SubLObject collection_subset_fn_term) {
	return classes.subloop_get_access_protected_instance_slot(collection_subset_fn_term, FIVE_INTEGER, MT);
    }

    public static final SubLObject get_collection_subset_fn_term_in_cycl(SubLObject collection_subset_fn_term) {
	return classes.subloop_get_access_protected_instance_slot(collection_subset_fn_term, THREE_INTEGER, IN_CYCL);
    }

    public static final SubLObject get_collection_difference_function_out_cycl(SubLObject collection_difference_function) {
	return classes.subloop_get_access_protected_instance_slot(collection_difference_function, FOUR_INTEGER, OUT_CYCL);
    }

    public static final SubLObject get_collection_difference_function_mt(SubLObject collection_difference_function) {
	return classes.subloop_get_access_protected_instance_slot(collection_difference_function, FIVE_INTEGER, MT);
    }

    public static final SubLObject get_collection_difference_function_in_cycl(SubLObject collection_difference_function) {
	return classes.subloop_get_access_protected_instance_slot(collection_difference_function, THREE_INTEGER, IN_CYCL);
    }

    public static final SubLObject get_binary_function_reported_out_cycl(SubLObject binary_function_reported) {
	return classes.subloop_get_access_protected_instance_slot(binary_function_reported, FOUR_INTEGER, OUT_CYCL);
    }

    public static final SubLObject get_binary_function_reported_mt(SubLObject binary_function_reported) {
	return classes.subloop_get_access_protected_instance_slot(binary_function_reported, FIVE_INTEGER, MT);
    }

    public static final SubLObject get_binary_function_reported_in_cycl(SubLObject binary_function_reported) {
	return classes.subloop_get_access_protected_instance_slot(binary_function_reported, THREE_INTEGER, IN_CYCL);
    }

    public static final SubLObject get_binary_function_coll_intersect_out_cycl(SubLObject binary_function_coll_intersect) {
	return classes.subloop_get_access_protected_instance_slot(binary_function_coll_intersect, FOUR_INTEGER, OUT_CYCL);
    }

    public static final SubLObject get_binary_function_coll_intersect_mt(SubLObject binary_function_coll_intersect) {
	return classes.subloop_get_access_protected_instance_slot(binary_function_coll_intersect, FIVE_INTEGER, MT);
    }

    public static final SubLObject get_binary_function_coll_intersect_in_cycl(SubLObject binary_function_coll_intersect) {
	return classes.subloop_get_access_protected_instance_slot(binary_function_coll_intersect, THREE_INTEGER, IN_CYCL);
    }

    public static final SubLObject collection_subset_fn_term_p(SubLObject collection_subset_fn_term) {
	return classes.subloop_instanceof_class(collection_subset_fn_term, COLLECTION_SUBSET_FN_TERM);
    }

    public static final SubLObject collection_difference_function_p(SubLObject collection_difference_function) {
	return classes.subloop_instanceof_class(collection_difference_function, COLLECTION_DIFFERENCE_FUNCTION);
    }

    public static final SubLObject binary_function_reported_p(SubLObject binary_function_reported) {
	return classes.subloop_instanceof_class(binary_function_reported, BINARY_FUNCTION_REPORTED);
    }

    public static final SubLObject binary_function_coll_intersect_p(SubLObject binary_function_coll_intersect) {
	return classes.subloop_instanceof_class(binary_function_coll_intersect, BINARY_FUNCTION_COLL_INTERSECT);
    }

    public static final SubLFile me = new reformulator_module_quantifier_optimizer_3();

 public static final String myName = "com.cyc.cycjava.cycl.reformulator_module_quantifier_optimizer_3";


    // deflexical
    // Definitions
    @LispMethod(comment = "deflexical")
    private static final SubLSymbol $quant_opt_3_microseconds$ = makeSymbol("*QUANT-OPT-3-MICROSECONDS*");

    @LispMethod(comment = "Internal Constants")
    // Internal Constants
    private static final SubLObject $$QuantifierOptimizer_3_RLModule = reader_make_constant_shell("QuantifierOptimizer-3-RLModule");

    static private final SubLList $list1 = list(new SubLObject[] { makeKeyword("REQUIRED"), makeSymbol("QUANT-OPT-3-EXPRESSION-REQUIRED"), $COST, makeSymbol("QUANT-OPT-3-COST-ESTIMATE"), makeKeyword("REFORMULATE"), makeSymbol("QUANT-OPT-3-EXPRESSION-REFORMULATE"),
	    makeKeyword("DOCUMENTATION"), makeString("Reorders quantifiers in NATs so that quantifier expressions are in the right place for \n    the Quantifier Processing RL module to handle them in the proper way."), makeKeyword("EXAMPLE-SOURCE"),
	    makeString("(#$ProspectiveCollectionFn\n      (#$NLQuantFn-3 #$Every-NLAttr\n\t    (#$NLNumberFn #$Singular-NLAttr #$TranscriptCopy) 0)\n\t     #$MessengerRNA)"), makeKeyword("EXAMPLE-TARGET"),
	    makeString("(#$NLQuantFn-3 #$Every-NLAttr\n      (#$NLNumberFn #$Singular-NLAttr\n\t (#$ProspectiveCollectionFn #$TranscriptCopy #$MessengerRNA)) 0)") });

    private static final SubLInteger $int$1200 = makeInteger(1200);

    static private final SubLList $list3 = list(reader_make_constant_shell("NLQuantFn-3"), reader_make_constant_shell("NLDefinitenessFn-3"), reader_make_constant_shell("NLNumberFn"));

    static private final SubLList $list9 = list(reader_make_constant_shell("NLQuantFn-3"), reader_make_constant_shell("NLDefinitenessFn-3"));

    static private final SubLString $str12$Reformulator_Quantifier_Optimizat = makeString("Reformulator Quantifier Optimization");

    static private final SubLString $str13$quant_optimizer_test_suite = makeString("quant-optimizer-test-suite");

    /**
     *
     *
     * @param expression;
     * 		EL FORM
     * @return INTEGER
    Estimates the cost of calling the Quantifier Optimizer RL module
    on EXPRESSION.
     */
    @LispMethod(comment = "@param expression;\r\n\t\tEL FORM\r\n@return INTEGER\r\nEstimates the cost of calling the Quantifier Optimizer RL module\r\non EXPRESSION.")
    public static final SubLObject quant_opt_3_cost_estimate_alt(SubLObject expression, SubLObject mt, SubLObject settings) {
	return $quant_opt_3_microseconds$.getGlobalValue();
    }

    /**
     *
     *
     * @param expression;
     * 		EL FORM
     * @return INTEGER
    Estimates the cost of calling the Quantifier Optimizer RL module
    on EXPRESSION.
     */
    @LispMethod(comment = "@param expression;\r\n\t\tEL FORM\r\n@return INTEGER\r\nEstimates the cost of calling the Quantifier Optimizer RL module\r\non EXPRESSION.")
    public static SubLObject quant_opt_3_cost_estimate(final SubLObject expression, final SubLObject mt, final SubLObject settings) {
	return $quant_opt_3_microseconds$.getGlobalValue();
    }

    /**
     *
     *
     * @param expression;
    el-expression-p
     * 		
     * @param settings;
    a-list
     * 		
     * @return boolean
    Returns T iff the Quantifier Optimizer RL module is likely to apply to
    EXPRESSION, given SETTINGS.
     * @unknown In some cases, although EXPRESSION may pass this simple test, it
    might later turn out that the RL module can in fact not apply to
    EXPRESSION.
     */
    @LispMethod(comment = "@param expression;\nel-expression-p\r\n\t\t\r\n@param settings;\na-list\r\n\t\t\r\n@return boolean\r\nReturns T iff the Quantifier Optimizer RL module is likely to apply to\r\nEXPRESSION, given SETTINGS.\r\n@unknown In some cases, although EXPRESSION may pass this simple test, it\r\nmight later turn out that the RL module can in fact not apply to\r\nEXPRESSION.")
    public static final SubLObject quant_opt_3_expression_required_alt(SubLObject expression, SubLObject mt, SubLObject settings) {
	if (((((NIL != el_formula_p(expression)) && ((NIL != el_binary_formula_p(expression)) || (NIL != el_ternary_formula_p(expression)))) && (NIL != fort_types_interface.functionP(cycl_utilities.formula_operator(expression))))
		&& ((NIL != el_binary_formula_p(cycl_utilities.formula_arg1(expression, UNPROVIDED))) || (NIL != el_ternary_formula_p(cycl_utilities.formula_arg1(expression, UNPROVIDED)))))
		&& (NIL != member(cycl_utilities.formula_operator(cycl_utilities.formula_arg1(expression, UNPROVIDED)), $list_alt3, UNPROVIDED, UNPROVIDED))) {
	    return T;
	} else {
	    if (NIL != com.cyc.cycjava.cycl.reformulator_module_quantifier_optimizer_3.quant_opt_3_isa_collection_subsetP(expression, mt)) {
		return T;
	    } else {
		return NIL;
	    }
	}
    }

    /**
     *
     *
     * @param expression;
    el-expression-p
     * 		
     * @param settings;
    a-list
     * 		
     * @return boolean
    Returns T iff the Quantifier Optimizer RL module is likely to apply to
    EXPRESSION, given SETTINGS.
     * @unknown In some cases, although EXPRESSION may pass this simple test, it
    might later turn out that the RL module can in fact not apply to
    EXPRESSION.
     */
    @LispMethod(comment = "@param expression;\nel-expression-p\r\n\t\t\r\n@param settings;\na-list\r\n\t\t\r\n@return boolean\r\nReturns T iff the Quantifier Optimizer RL module is likely to apply to\r\nEXPRESSION, given SETTINGS.\r\n@unknown In some cases, although EXPRESSION may pass this simple test, it\r\nmight later turn out that the RL module can in fact not apply to\r\nEXPRESSION.")
    public static SubLObject quant_opt_3_expression_required(final SubLObject expression, final SubLObject mt, final SubLObject settings) {
	if (((((NIL != el_formula_p(expression)) && ((NIL != el_binary_formula_p(expression)) || (NIL != el_ternary_formula_p(expression)))) && (NIL != fort_types_interface.functionP(cycl_utilities.formula_operator(expression))))
		&& ((NIL != el_binary_formula_p(cycl_utilities.formula_arg1(expression, UNPROVIDED))) || (NIL != el_ternary_formula_p(cycl_utilities.formula_arg1(expression, UNPROVIDED)))))
		&& (NIL != member(cycl_utilities.formula_operator(cycl_utilities.formula_arg1(expression, UNPROVIDED)), $list3, UNPROVIDED, UNPROVIDED))) {
	    return T;
	}
	if (NIL != quant_opt_3_isa_collection_subsetP(expression, mt)) {
	    return T;
	}
	return NIL;
    }

    public static final SubLObject quant_opt_3_isa_collection_subsetP_alt(SubLObject expression, SubLObject mt) {
	if (((NIL != clauses.clauses_p(expression)) && (NIL != list_utilities.singletonP(expression))) && (NIL != clause_utilities.pos_atomic_cnf_p(expression.first()))) {
	    {
		SubLObject thesent = clause_utilities.gaf_cnf_literal(expression.first());
		SubLObject possible_collsubset_arg = cycl_utilities.formula_arg2(thesent, UNPROVIDED);
		if ((($$isa.eql(cycl_utilities.formula_operator(thesent)) && (NIL != term.nautP(possible_collsubset_arg, UNPROVIDED))) && $$CollectionSubsetFn.eql(cycl_utilities.nat_functor(possible_collsubset_arg)))
			&& $$TheSetOf.eql(cycl_utilities.nat_functor(cycl_utilities.nat_arg2(possible_collsubset_arg, UNPROVIDED)))) {
		    return T;
		} else {
		    return NIL;
		}
	    }
	}
	return NIL;
    }

    public static SubLObject quant_opt_3_isa_collection_subsetP(final SubLObject expression, final SubLObject mt) {
	if (((NIL == clauses.clauses_p(expression)) || (NIL == list_utilities.singletonP(expression))) || (NIL == clause_utilities.pos_atomic_cnf_p(expression.first()))) {
	    return NIL;
	}
	final SubLObject thesent = clause_utilities.gaf_cnf_literal(expression.first());
	final SubLObject possible_collsubset_arg = cycl_utilities.formula_arg2(thesent, UNPROVIDED);
	if ((($$isa.eql(cycl_utilities.formula_operator(thesent)) && (NIL != term.nautP(possible_collsubset_arg, UNPROVIDED))) && $$CollectionSubsetFn.eql(cycl_utilities.nat_functor(possible_collsubset_arg)))
		&& $$TheSetOf.eql(cycl_utilities.nat_functor(cycl_utilities.nat_arg2(possible_collsubset_arg, UNPROVIDED)))) {
	    return T;
	}
	return NIL;
    }

    /**
     * param expression; el-expression-p
     *
     * @param settings;
    a-list
     * 		
     * @return 0 el-expression-p
     * @return 1 boolean
    Returns the refomulated expression together with a T flag (meaning
    input has been modified in the output), or the original EXPRESSION
    with a NIL flag (if reformulation was not possible).
     */
    @LispMethod(comment = "param expression; el-expression-p\r\n\r\n@param settings;\na-list\r\n\t\t\r\n@return 0 el-expression-p\r\n@return 1 boolean\r\nReturns the refomulated expression together with a T flag (meaning\r\ninput has been modified in the output), or the original EXPRESSION\r\nwith a NIL flag (if reformulation was not possible).")
    public static final SubLObject quant_opt_3_expression_reformulate_alt(SubLObject expression, SubLObject original_clause, SubLObject mt, SubLObject settings) {
	{
	    SubLObject result = NIL;
	    if (NIL != com.cyc.cycjava.cycl.reformulator_module_quantifier_optimizer_3.quant_opt_3_isa_collection_subsetP(expression, mt)) {
		result = com.cyc.cycjava.cycl.reformulator_module_quantifier_optimizer_3.quant_opt_3_reformulate_isa_collection_subset(expression, mt);
	    } else {
		result = com.cyc.cycjava.cycl.reformulator_module_quantifier_optimizer_3.quant_opt_3_reformulate_int(expression, mt);
	    }
	    if (NIL != result) {
		return values(result, T);
	    } else {
		return values(expression, NIL);
	    }
	}
    }

    @LispMethod(comment = "param expression; el-expression-p\r\n\r\n@param settings;\n\t\ta-list\r\n\t\t\r\n@return 0 el-expression-p\r\n@return 1 boolean\r\nReturns the refomulated expression together with a T flag (meaning\r\ninput has been modified in the output), or the original EXPRESSION\r\nwith a NIL flag (if reformulation was not possible).")
    public static SubLObject quant_opt_3_expression_reformulate(final SubLObject expression, final SubLObject original_clause, final SubLObject mt, final SubLObject settings) {
	SubLObject result = NIL;
	if (NIL != quant_opt_3_isa_collection_subsetP(expression, mt)) {
	    result = quant_opt_3_reformulate_isa_collection_subset(expression, mt);
	} else {
	    result = quant_opt_3_reformulate_int(expression, mt);
	}
	if (NIL != result) {
	    return values(result, T);
	}
	return values(expression, NIL);
    }

    /**
     *
     *
     * @unknown (isa X (CollectionSubsetFn COLL-SUBSET-FN-ARG (TheSetOf OBJ (thereExists Y...))))
    ==> (and (isa X COLL-SUBSET-FN-ARG) (thereExists Y ...))
     */
    @LispMethod(comment = "@unknown (isa X (CollectionSubsetFn COLL-SUBSET-FN-ARG (TheSetOf OBJ (thereExists Y...))))\r\n==> (and (isa X COLL-SUBSET-FN-ARG) (thereExists Y ...))")
    public static final SubLObject quant_opt_3_reformulate_isa_collection_subset_alt(SubLObject expression, SubLObject mt) {
	{
	    SubLObject thesent = clause_utilities.gaf_cnf_literal(expression.first());
	    SubLObject collection_subset_nat = cycl_utilities.formula_arg2(thesent, UNPROVIDED);
	    SubLObject instance_of_coll_subset_nat = cycl_utilities.formula_arg1(thesent, UNPROVIDED);
	    SubLObject collection_arg = cycl_utilities.nat_arg1(collection_subset_nat, UNPROVIDED);
	    SubLObject the_set_of_arg = cycl_utilities.nat_arg2(collection_subset_nat, UNPROVIDED);
	    if (!$$TheSetOf.eql(cycl_utilities.nat_functor(the_set_of_arg))) {
		return NIL;
	    }
	    {
		SubLObject the_set_of_var = cycl_utilities.nat_arg1(the_set_of_arg, UNPROVIDED);
		SubLObject sentence_arg = cycl_utilities.nat_arg2(the_set_of_arg, UNPROVIDED);
		SubLObject existential_op = cycl_utilities.formula_operator(sentence_arg);
		if ($$thereExists.eql(existential_op)) {
		    {
			SubLObject new_subsentence = cycl_utilities.formula_subst(instance_of_coll_subset_nat, the_set_of_var, sentence_arg, UNPROVIDED, UNPROVIDED);
			return list_to_elf(list($$and, list($$isa, instance_of_coll_subset_nat, collection_arg), new_subsentence));
		    }
		}
		return NIL;
	    }
	}
    }

    /**
     *
     *
     * @unknown (isa X (CollectionSubsetFn COLL-SUBSET-FN-ARG (TheSetOf OBJ (thereExists Y...))))
    ==> (and (isa X COLL-SUBSET-FN-ARG) (thereExists Y ...))
     */
    @LispMethod(comment = "@unknown (isa X (CollectionSubsetFn COLL-SUBSET-FN-ARG (TheSetOf OBJ (thereExists Y...))))\r\n==> (and (isa X COLL-SUBSET-FN-ARG) (thereExists Y ...))")
    public static SubLObject quant_opt_3_reformulate_isa_collection_subset(final SubLObject expression, final SubLObject mt) {
	final SubLObject thesent = clause_utilities.gaf_cnf_literal(expression.first());
	final SubLObject collection_subset_nat = cycl_utilities.formula_arg2(thesent, UNPROVIDED);
	final SubLObject instance_of_coll_subset_nat = cycl_utilities.formula_arg1(thesent, UNPROVIDED);
	final SubLObject collection_arg = cycl_utilities.nat_arg1(collection_subset_nat, UNPROVIDED);
	final SubLObject the_set_of_arg = cycl_utilities.nat_arg2(collection_subset_nat, UNPROVIDED);
	if (!$$TheSetOf.eql(cycl_utilities.nat_functor(the_set_of_arg))) {
	    return NIL;
	}
	final SubLObject the_set_of_var = cycl_utilities.nat_arg1(the_set_of_arg, UNPROVIDED);
	final SubLObject sentence_arg = cycl_utilities.nat_arg2(the_set_of_arg, UNPROVIDED);
	final SubLObject existential_op = cycl_utilities.formula_operator(sentence_arg);
	if ($$thereExists.eql(existential_op)) {
	    final SubLObject new_subsentence = cycl_utilities.formula_subst(instance_of_coll_subset_nat, the_set_of_var, sentence_arg, UNPROVIDED, UNPROVIDED);
	    return list_to_elf(list($$and, list($$isa, instance_of_coll_subset_nat, collection_arg), new_subsentence));
	}
	return NIL;
    }

    public static final SubLObject quant_opt_3_reformulate_int_alt(SubLObject expression, SubLObject mt) {
	if (((NIL != el_binary_formula_p(expression)) || (NIL != el_ternary_formula_p(expression))) && (NIL != com.cyc.cycjava.cycl.reformulator_module_quantifier_optimizer_3.quant_opt_3_applies_to_expressionP(expression, mt))) {
	    return com.cyc.cycjava.cycl.reformulator_module_quantifier_optimizer_3.reformulate_quant_opt_3_expression(expression, mt);
	}
	return NIL;
    }

    public static SubLObject quant_opt_3_reformulate_int(final SubLObject expression, final SubLObject mt) {
	if (((NIL != el_binary_formula_p(expression)) || (NIL != el_ternary_formula_p(expression))) && (NIL != quant_opt_3_applies_to_expressionP(expression, mt))) {
	    return reformulate_quant_opt_3_expression(expression, mt);
	}
	return NIL;
    }

    public static final SubLObject quant_opt_3_applies_to_expressionP_alt(SubLObject expression, SubLObject mt) {
	{
	    SubLObject func = cycl_utilities.formula_operator(expression);
	    SubLObject arg1_consts = kb_accessors.arg1_isa(func, mt);
	    SubLObject first_arg = cycl_utilities.formula_arg1(expression, UNPROVIDED);
	    SubLObject nl_func = cycl_utilities.formula_operator(first_arg);
	    SubLObject second_arg_of_first_arg = cycl_utilities.formula_arg2(first_arg, UNPROVIDED);
	    SubLObject second_nl_func = cycl_utilities.formula_operator(second_arg_of_first_arg);
	    SubLObject col_arg = cycl_utilities.formula_arg2(second_arg_of_first_arg, UNPROVIDED);
	    SubLObject result = NIL;
	    if (!((NIL != subl_promotions.memberP(nl_func, $list_alt9, UNPROVIDED, UNPROVIDED)) && second_nl_func.eql($$NLNumberFn))) {
		return NIL;
	    }
	    if (NIL == result) {
		{
		    SubLObject csome_list_var = arg1_consts;
		    SubLObject arg_const = NIL;
		    for (arg_const = csome_list_var.first(); !((NIL != result) || (NIL == csome_list_var)); csome_list_var = csome_list_var.rest(), arg_const = csome_list_var.first()) {
			if ((NIL != isa.isaP(arg_const, $$CollectionType, mt, UNPROVIDED)) && (NIL != isa.isaP(col_arg, arg_const, mt, UNPROVIDED))) {
			    result = T;
			}
		    }
		}
	    }
	    return result;
	}
    }

    public static SubLObject quant_opt_3_applies_to_expressionP(final SubLObject expression, final SubLObject mt) {
	final SubLObject func = cycl_utilities.formula_operator(expression);
	final SubLObject arg1_consts = kb_accessors.arg1_isa(func, mt);
	final SubLObject first_arg = cycl_utilities.formula_arg1(expression, UNPROVIDED);
	final SubLObject nl_func = cycl_utilities.formula_operator(first_arg);
	final SubLObject second_arg_of_first_arg = cycl_utilities.formula_arg2(first_arg, UNPROVIDED);
	final SubLObject second_nl_func = cycl_utilities.formula_operator(second_arg_of_first_arg);
	final SubLObject col_arg = cycl_utilities.formula_arg2(second_arg_of_first_arg, UNPROVIDED);
	SubLObject result = NIL;
	if ((NIL == subl_promotions.memberP(nl_func, $list9, UNPROVIDED, UNPROVIDED)) || (!second_nl_func.eql($$NLNumberFn))) {
	    return NIL;
	}
	if (NIL == result) {
	    SubLObject csome_list_var = arg1_consts;
	    SubLObject arg_const = NIL;
	    arg_const = csome_list_var.first();
	    while ((NIL == result) && (NIL != csome_list_var)) {
		if ((NIL != isa.isaP(arg_const, $$CollectionType, mt, UNPROVIDED)) && (NIL != isa.isaP(col_arg, arg_const, mt, UNPROVIDED))) {
		    result = T;
		}
		csome_list_var = csome_list_var.rest();
		arg_const = csome_list_var.first();
	    }
	}
	return result;
    }

    public static final SubLObject reformulate_quant_opt_3_expression_alt(SubLObject expression, SubLObject mt) {
	{
	    final SubLThread thread = SubLProcess.currentSubLThread();
	    {
		SubLObject func = cycl_utilities.formula_operator(expression);
		SubLObject first_arg = cycl_utilities.formula_arg1(expression, UNPROVIDED);
		SubLObject second_arg = cycl_utilities.formula_arg2(expression, UNPROVIDED);
		SubLObject inner_form = NIL;
		if (NIL != el_ternary_formula_p(expression)) {
		    if (NIL == fort_types_interface.isa_predicateP(second_arg, mt)) {
			return NIL;
		    }
		}
		thread.resetMultipleValues();
		{
		    SubLObject nl_func = unmake_ternary_formula(first_arg);
		    SubLObject quant_attr = thread.secondMultipleValue();
		    SubLObject number_tagged_term = thread.thirdMultipleValue();
		    SubLObject start_index = thread.fourthMultipleValue();
		    thread.resetMultipleValues();
		    thread.resetMultipleValues();
		    {
			SubLObject nl_number_fn = unmake_binary_formula(number_tagged_term);
			SubLObject number_attr = thread.secondMultipleValue();
			SubLObject col = thread.thirdMultipleValue();
			thread.resetMultipleValues();
			{
			    SubLObject new_expression = replace_formula_arg(ONE_INTEGER, col, expression);
			    inner_form = make_formula(nl_number_fn, list(number_attr, new_expression), UNPROVIDED);
			    return make_formula(nl_func, list(quant_attr, inner_form, start_index), UNPROVIDED);
			}
		    }
		}
	    }
	}
    }

    public static SubLObject reformulate_quant_opt_3_expression(final SubLObject expression, final SubLObject mt) {
	final SubLThread thread = SubLProcess.currentSubLThread();
	final SubLObject func = cycl_utilities.formula_operator(expression);
	final SubLObject first_arg = cycl_utilities.formula_arg1(expression, UNPROVIDED);
	final SubLObject second_arg = cycl_utilities.formula_arg2(expression, UNPROVIDED);
	SubLObject inner_form = NIL;
	if ((NIL != el_ternary_formula_p(expression)) && (NIL == fort_types_interface.isa_predicateP(second_arg, mt))) {
	    return NIL;
	}
	thread.resetMultipleValues();
	final SubLObject nl_func = unmake_ternary_formula(first_arg);
	final SubLObject quant_attr = thread.secondMultipleValue();
	final SubLObject number_tagged_term = thread.thirdMultipleValue();
	final SubLObject start_index = thread.fourthMultipleValue();
	thread.resetMultipleValues();
	thread.resetMultipleValues();
	final SubLObject nl_number_fn = unmake_binary_formula(number_tagged_term);
	final SubLObject number_attr = thread.secondMultipleValue();
	final SubLObject col = thread.thirdMultipleValue();
	thread.resetMultipleValues();
	final SubLObject new_expression = replace_formula_arg(ONE_INTEGER, col, expression);
	inner_form = make_formula(nl_number_fn, list(number_attr, new_expression), UNPROVIDED);
	return make_formula(nl_func, list(quant_attr, inner_form, start_index), UNPROVIDED);
    }

    public static final SubLObject declare_reformulator_module_quantifier_optimizer_3_file_alt() {
	declareFunction("quant_opt_3_cost_estimate", "QUANT-OPT-3-COST-ESTIMATE", 3, 0, false);
	declareFunction("quant_opt_3_expression_required", "QUANT-OPT-3-EXPRESSION-REQUIRED", 3, 0, false);
	declareFunction("quant_opt_3_isa_collection_subsetP", "QUANT-OPT-3-ISA-COLLECTION-SUBSET?", 2, 0, false);
	declareFunction("quant_opt_3_expression_reformulate", "QUANT-OPT-3-EXPRESSION-REFORMULATE", 4, 0, false);
	declareFunction("quant_opt_3_reformulate_isa_collection_subset", "QUANT-OPT-3-REFORMULATE-ISA-COLLECTION-SUBSET", 2, 0, false);
	declareFunction("quant_opt_3_reformulate_int", "QUANT-OPT-3-REFORMULATE-INT", 2, 0, false);
	declareFunction("quant_opt_3_applies_to_expressionP", "QUANT-OPT-3-APPLIES-TO-EXPRESSION?", 2, 0, false);
	declareFunction("reformulate_quant_opt_3_expression", "REFORMULATE-QUANT-OPT-3-EXPRESSION", 2, 0, false);
	declareFunction("get_collection_subset_fn_term_mt", "GET-COLLECTION-SUBSET-FN-TERM-MT", 1, 0, false);
	declareFunction("set_collection_subset_fn_term_mt", "SET-COLLECTION-SUBSET-FN-TERM-MT", 2, 0, false);
	declareFunction("get_collection_subset_fn_term_out_cycl", "GET-COLLECTION-SUBSET-FN-TERM-OUT-CYCL", 1, 0, false);
	declareFunction("set_collection_subset_fn_term_out_cycl", "SET-COLLECTION-SUBSET-FN-TERM-OUT-CYCL", 2, 0, false);
	declareFunction("get_collection_subset_fn_term_in_cycl", "GET-COLLECTION-SUBSET-FN-TERM-IN-CYCL", 1, 0, false);
	declareFunction("set_collection_subset_fn_term_in_cycl", "SET-COLLECTION-SUBSET-FN-TERM-IN-CYCL", 2, 0, false);
	declareFunction("subloop_reserved_initialize_collection_subset_fn_term_class", "SUBLOOP-RESERVED-INITIALIZE-COLLECTION-SUBSET-FN-TERM-CLASS", 1, 0, false);
	declareFunction("subloop_reserved_initialize_collection_subset_fn_term_instance", "SUBLOOP-RESERVED-INITIALIZE-COLLECTION-SUBSET-FN-TERM-INSTANCE", 1, 0, false);
	declareFunction("collection_subset_fn_term_p", "COLLECTION-SUBSET-FN-TERM-P", 1, 0, false);
	declareFunction("get_binary_function_reported_mt", "GET-BINARY-FUNCTION-REPORTED-MT", 1, 0, false);
	declareFunction("set_binary_function_reported_mt", "SET-BINARY-FUNCTION-REPORTED-MT", 2, 0, false);
	declareFunction("get_binary_function_reported_out_cycl", "GET-BINARY-FUNCTION-REPORTED-OUT-CYCL", 1, 0, false);
	declareFunction("set_binary_function_reported_out_cycl", "SET-BINARY-FUNCTION-REPORTED-OUT-CYCL", 2, 0, false);
	declareFunction("get_binary_function_reported_in_cycl", "GET-BINARY-FUNCTION-REPORTED-IN-CYCL", 1, 0, false);
	declareFunction("set_binary_function_reported_in_cycl", "SET-BINARY-FUNCTION-REPORTED-IN-CYCL", 2, 0, false);
	declareFunction("subloop_reserved_initialize_binary_function_reported_class", "SUBLOOP-RESERVED-INITIALIZE-BINARY-FUNCTION-REPORTED-CLASS", 1, 0, false);
	declareFunction("subloop_reserved_initialize_binary_function_reported_instance", "SUBLOOP-RESERVED-INITIALIZE-BINARY-FUNCTION-REPORTED-INSTANCE", 1, 0, false);
	declareFunction("binary_function_reported_p", "BINARY-FUNCTION-REPORTED-P", 1, 0, false);
	declareFunction("get_ternary_function_instance_wth_relation_mt", "GET-TERNARY-FUNCTION-INSTANCE-WTH-RELATION-MT", 1, 0, false);
	declareFunction("set_ternary_function_instance_wth_relation_mt", "SET-TERNARY-FUNCTION-INSTANCE-WTH-RELATION-MT", 2, 0, false);
	declareFunction("get_ternary_function_instance_wth_relation_out_cycl", "GET-TERNARY-FUNCTION-INSTANCE-WTH-RELATION-OUT-CYCL", 1, 0, false);
	declareFunction("set_ternary_function_instance_wth_relation_out_cycl", "SET-TERNARY-FUNCTION-INSTANCE-WTH-RELATION-OUT-CYCL", 2, 0, false);
	declareFunction("get_ternary_function_instance_wth_relation_in_cycl", "GET-TERNARY-FUNCTION-INSTANCE-WTH-RELATION-IN-CYCL", 1, 0, false);
	declareFunction("set_ternary_function_instance_wth_relation_in_cycl", "SET-TERNARY-FUNCTION-INSTANCE-WTH-RELATION-IN-CYCL", 2, 0, false);
	declareFunction("subloop_reserved_initialize_ternary_function_instance_wth_relation_class", "SUBLOOP-RESERVED-INITIALIZE-TERNARY-FUNCTION-INSTANCE-WTH-RELATION-CLASS", 1, 0, false);
	declareFunction("subloop_reserved_initialize_ternary_function_instance_wth_relation_instance", "SUBLOOP-RESERVED-INITIALIZE-TERNARY-FUNCTION-INSTANCE-WTH-RELATION-INSTANCE", 1, 0, false);
	declareFunction("ternary_function_instance_wth_relation_p", "TERNARY-FUNCTION-INSTANCE-WTH-RELATION-P", 1, 0, false);
	declareFunction("get_binary_function_coll_intersect_mt", "GET-BINARY-FUNCTION-COLL-INTERSECT-MT", 1, 0, false);
	declareFunction("set_binary_function_coll_intersect_mt", "SET-BINARY-FUNCTION-COLL-INTERSECT-MT", 2, 0, false);
	declareFunction("get_binary_function_coll_intersect_out_cycl", "GET-BINARY-FUNCTION-COLL-INTERSECT-OUT-CYCL", 1, 0, false);
	declareFunction("set_binary_function_coll_intersect_out_cycl", "SET-BINARY-FUNCTION-COLL-INTERSECT-OUT-CYCL", 2, 0, false);
	declareFunction("get_binary_function_coll_intersect_in_cycl", "GET-BINARY-FUNCTION-COLL-INTERSECT-IN-CYCL", 1, 0, false);
	declareFunction("set_binary_function_coll_intersect_in_cycl", "SET-BINARY-FUNCTION-COLL-INTERSECT-IN-CYCL", 2, 0, false);
	declareFunction("subloop_reserved_initialize_binary_function_coll_intersect_class", "SUBLOOP-RESERVED-INITIALIZE-BINARY-FUNCTION-COLL-INTERSECT-CLASS", 1, 0, false);
	declareFunction("subloop_reserved_initialize_binary_function_coll_intersect_instance", "SUBLOOP-RESERVED-INITIALIZE-BINARY-FUNCTION-COLL-INTERSECT-INSTANCE", 1, 0, false);
	declareFunction("binary_function_coll_intersect_p", "BINARY-FUNCTION-COLL-INTERSECT-P", 1, 0, false);
	declareFunction("get_subcollection_function_first_mt", "GET-SUBCOLLECTION-FUNCTION-FIRST-MT", 1, 0, false);
	declareFunction("set_subcollection_function_first_mt", "SET-SUBCOLLECTION-FUNCTION-FIRST-MT", 2, 0, false);
	declareFunction("get_subcollection_function_first_out_cycl", "GET-SUBCOLLECTION-FUNCTION-FIRST-OUT-CYCL", 1, 0, false);
	declareFunction("set_subcollection_function_first_out_cycl", "SET-SUBCOLLECTION-FUNCTION-FIRST-OUT-CYCL", 2, 0, false);
	declareFunction("get_subcollection_function_first_in_cycl", "GET-SUBCOLLECTION-FUNCTION-FIRST-IN-CYCL", 1, 0, false);
	declareFunction("set_subcollection_function_first_in_cycl", "SET-SUBCOLLECTION-FUNCTION-FIRST-IN-CYCL", 2, 0, false);
	declareFunction("subloop_reserved_initialize_subcollection_function_first_class", "SUBLOOP-RESERVED-INITIALIZE-SUBCOLLECTION-FUNCTION-FIRST-CLASS", 1, 0, false);
	declareFunction("subloop_reserved_initialize_subcollection_function_first_instance", "SUBLOOP-RESERVED-INITIALIZE-SUBCOLLECTION-FUNCTION-FIRST-INSTANCE", 1, 0, false);
	declareFunction("subcollection_function_first_p", "SUBCOLLECTION-FUNCTION-FIRST-P", 1, 0, false);
	declareFunction("get_collection_difference_function_mt", "GET-COLLECTION-DIFFERENCE-FUNCTION-MT", 1, 0, false);
	declareFunction("set_collection_difference_function_mt", "SET-COLLECTION-DIFFERENCE-FUNCTION-MT", 2, 0, false);
	declareFunction("get_collection_difference_function_out_cycl", "GET-COLLECTION-DIFFERENCE-FUNCTION-OUT-CYCL", 1, 0, false);
	declareFunction("set_collection_difference_function_out_cycl", "SET-COLLECTION-DIFFERENCE-FUNCTION-OUT-CYCL", 2, 0, false);
	declareFunction("get_collection_difference_function_in_cycl", "GET-COLLECTION-DIFFERENCE-FUNCTION-IN-CYCL", 1, 0, false);
	declareFunction("set_collection_difference_function_in_cycl", "SET-COLLECTION-DIFFERENCE-FUNCTION-IN-CYCL", 2, 0, false);
	declareFunction("subloop_reserved_initialize_collection_difference_function_class", "SUBLOOP-RESERVED-INITIALIZE-COLLECTION-DIFFERENCE-FUNCTION-CLASS", 1, 0, false);
	declareFunction("subloop_reserved_initialize_collection_difference_function_instance", "SUBLOOP-RESERVED-INITIALIZE-COLLECTION-DIFFERENCE-FUNCTION-INSTANCE", 1, 0, false);
	declareFunction("collection_difference_function_p", "COLLECTION-DIFFERENCE-FUNCTION-P", 1, 0, false);
	declareFunction("get_instance_level_arg1_constraint_mt", "GET-INSTANCE-LEVEL-ARG1-CONSTRAINT-MT", 1, 0, false);
	declareFunction("set_instance_level_arg1_constraint_mt", "SET-INSTANCE-LEVEL-ARG1-CONSTRAINT-MT", 2, 0, false);
	declareFunction("get_instance_level_arg1_constraint_out_cycl", "GET-INSTANCE-LEVEL-ARG1-CONSTRAINT-OUT-CYCL", 1, 0, false);
	declareFunction("set_instance_level_arg1_constraint_out_cycl", "SET-INSTANCE-LEVEL-ARG1-CONSTRAINT-OUT-CYCL", 2, 0, false);
	declareFunction("get_instance_level_arg1_constraint_in_cycl", "GET-INSTANCE-LEVEL-ARG1-CONSTRAINT-IN-CYCL", 1, 0, false);
	declareFunction("set_instance_level_arg1_constraint_in_cycl", "SET-INSTANCE-LEVEL-ARG1-CONSTRAINT-IN-CYCL", 2, 0, false);
	declareFunction("subloop_reserved_initialize_instance_level_arg1_constraint_class", "SUBLOOP-RESERVED-INITIALIZE-INSTANCE-LEVEL-ARG1-CONSTRAINT-CLASS", 1, 0, false);
	declareFunction("subloop_reserved_initialize_instance_level_arg1_constraint_instance", "SUBLOOP-RESERVED-INITIALIZE-INSTANCE-LEVEL-ARG1-CONSTRAINT-INSTANCE", 1, 0, false);
	declareFunction("instance_level_arg1_constraint_p", "INSTANCE-LEVEL-ARG1-CONSTRAINT-P", 1, 0, false);
	return NIL;
    }

    public static SubLObject declare_reformulator_module_quantifier_optimizer_3_file() {
	if (SubLFiles.USE_V1) {
	    declareFunction("quant_opt_3_cost_estimate", "QUANT-OPT-3-COST-ESTIMATE", 3, 0, false);
	    declareFunction("quant_opt_3_expression_required", "QUANT-OPT-3-EXPRESSION-REQUIRED", 3, 0, false);
	    declareFunction("quant_opt_3_isa_collection_subsetP", "QUANT-OPT-3-ISA-COLLECTION-SUBSET?", 2, 0, false);
	    declareFunction("quant_opt_3_expression_reformulate", "QUANT-OPT-3-EXPRESSION-REFORMULATE", 4, 0, false);
	    declareFunction("quant_opt_3_reformulate_isa_collection_subset", "QUANT-OPT-3-REFORMULATE-ISA-COLLECTION-SUBSET", 2, 0, false);
	    declareFunction("quant_opt_3_reformulate_int", "QUANT-OPT-3-REFORMULATE-INT", 2, 0, false);
	    declareFunction("quant_opt_3_applies_to_expressionP", "QUANT-OPT-3-APPLIES-TO-EXPRESSION?", 2, 0, false);
	    declareFunction("reformulate_quant_opt_3_expression", "REFORMULATE-QUANT-OPT-3-EXPRESSION", 2, 0, false);
	}
	if (SubLFiles.USE_V2) {
	    declareFunction("quant_opt_3_cost_estimate", "QUANT-OPT-3-COST-ESTIMATE", 3, 0, false);
	    declareFunction("quant_opt_3_expression_required", "QUANT-OPT-3-EXPRESSION-REQUIRED", 3, 0, false);
	    declareFunction("quant_opt_3_isa_collection_subsetP", "QUANT-OPT-3-ISA-COLLECTION-SUBSET?", 2, 0, false);
	    declareFunction("quant_opt_3_expression_reformulate", "QUANT-OPT-3-EXPRESSION-REFORMULATE", 4, 0, false);
	    declareFunction("quant_opt_3_reformulate_isa_collection_subset", "QUANT-OPT-3-REFORMULATE-ISA-COLLECTION-SUBSET", 2, 0, false);
	    declareFunction("quant_opt_3_reformulate_int", "QUANT-OPT-3-REFORMULATE-INT", 2, 0, false);
	    declareFunction("quant_opt_3_applies_to_expressionP", "QUANT-OPT-3-APPLIES-TO-EXPRESSION?", 2, 0, false);
	    declareFunction("reformulate_quant_opt_3_expression", "REFORMULATE-QUANT-OPT-3-EXPRESSION", 2, 0, false);
	    declareFunction("get_collection_subset_fn_term_mt", "GET-COLLECTION-SUBSET-FN-TERM-MT", 1, 0, false);
	    declareFunction("set_collection_subset_fn_term_mt", "SET-COLLECTION-SUBSET-FN-TERM-MT", 2, 0, false);
	    declareFunction("get_collection_subset_fn_term_out_cycl", "GET-COLLECTION-SUBSET-FN-TERM-OUT-CYCL", 1, 0, false);
	    declareFunction("set_collection_subset_fn_term_out_cycl", "SET-COLLECTION-SUBSET-FN-TERM-OUT-CYCL", 2, 0, false);
	    declareFunction("get_collection_subset_fn_term_in_cycl", "GET-COLLECTION-SUBSET-FN-TERM-IN-CYCL", 1, 0, false);
	    declareFunction("set_collection_subset_fn_term_in_cycl", "SET-COLLECTION-SUBSET-FN-TERM-IN-CYCL", 2, 0, false);
	    declareFunction("subloop_reserved_initialize_collection_subset_fn_term_class", "SUBLOOP-RESERVED-INITIALIZE-COLLECTION-SUBSET-FN-TERM-CLASS", 1, 0, false);
	    declareFunction("subloop_reserved_initialize_collection_subset_fn_term_instance", "SUBLOOP-RESERVED-INITIALIZE-COLLECTION-SUBSET-FN-TERM-INSTANCE", 1, 0, false);
	    declareFunction("collection_subset_fn_term_p", "COLLECTION-SUBSET-FN-TERM-P", 1, 0, false);
	    declareFunction("get_binary_function_reported_mt", "GET-BINARY-FUNCTION-REPORTED-MT", 1, 0, false);
	    declareFunction("set_binary_function_reported_mt", "SET-BINARY-FUNCTION-REPORTED-MT", 2, 0, false);
	    declareFunction("get_binary_function_reported_out_cycl", "GET-BINARY-FUNCTION-REPORTED-OUT-CYCL", 1, 0, false);
	    declareFunction("set_binary_function_reported_out_cycl", "SET-BINARY-FUNCTION-REPORTED-OUT-CYCL", 2, 0, false);
	    declareFunction("get_binary_function_reported_in_cycl", "GET-BINARY-FUNCTION-REPORTED-IN-CYCL", 1, 0, false);
	    declareFunction("set_binary_function_reported_in_cycl", "SET-BINARY-FUNCTION-REPORTED-IN-CYCL", 2, 0, false);
	    declareFunction("subloop_reserved_initialize_binary_function_reported_class", "SUBLOOP-RESERVED-INITIALIZE-BINARY-FUNCTION-REPORTED-CLASS", 1, 0, false);
	    declareFunction("subloop_reserved_initialize_binary_function_reported_instance", "SUBLOOP-RESERVED-INITIALIZE-BINARY-FUNCTION-REPORTED-INSTANCE", 1, 0, false);
	    declareFunction("binary_function_reported_p", "BINARY-FUNCTION-REPORTED-P", 1, 0, false);
	    declareFunction("get_ternary_function_instance_wth_relation_mt", "GET-TERNARY-FUNCTION-INSTANCE-WTH-RELATION-MT", 1, 0, false);
	    declareFunction("set_ternary_function_instance_wth_relation_mt", "SET-TERNARY-FUNCTION-INSTANCE-WTH-RELATION-MT", 2, 0, false);
	    declareFunction("get_ternary_function_instance_wth_relation_out_cycl", "GET-TERNARY-FUNCTION-INSTANCE-WTH-RELATION-OUT-CYCL", 1, 0, false);
	    declareFunction("set_ternary_function_instance_wth_relation_out_cycl", "SET-TERNARY-FUNCTION-INSTANCE-WTH-RELATION-OUT-CYCL", 2, 0, false);
	    declareFunction("get_ternary_function_instance_wth_relation_in_cycl", "GET-TERNARY-FUNCTION-INSTANCE-WTH-RELATION-IN-CYCL", 1, 0, false);
	    declareFunction("set_ternary_function_instance_wth_relation_in_cycl", "SET-TERNARY-FUNCTION-INSTANCE-WTH-RELATION-IN-CYCL", 2, 0, false);
	    declareFunction("subloop_reserved_initialize_ternary_function_instance_wth_relation_class", "SUBLOOP-RESERVED-INITIALIZE-TERNARY-FUNCTION-INSTANCE-WTH-RELATION-CLASS", 1, 0, false);
	    declareFunction("subloop_reserved_initialize_ternary_function_instance_wth_relation_instance", "SUBLOOP-RESERVED-INITIALIZE-TERNARY-FUNCTION-INSTANCE-WTH-RELATION-INSTANCE", 1, 0, false);
	    declareFunction("ternary_function_instance_wth_relation_p", "TERNARY-FUNCTION-INSTANCE-WTH-RELATION-P", 1, 0, false);
	    declareFunction("get_binary_function_coll_intersect_mt", "GET-BINARY-FUNCTION-COLL-INTERSECT-MT", 1, 0, false);
	    declareFunction("set_binary_function_coll_intersect_mt", "SET-BINARY-FUNCTION-COLL-INTERSECT-MT", 2, 0, false);
	    declareFunction("get_binary_function_coll_intersect_out_cycl", "GET-BINARY-FUNCTION-COLL-INTERSECT-OUT-CYCL", 1, 0, false);
	    declareFunction("set_binary_function_coll_intersect_out_cycl", "SET-BINARY-FUNCTION-COLL-INTERSECT-OUT-CYCL", 2, 0, false);
	    declareFunction("get_binary_function_coll_intersect_in_cycl", "GET-BINARY-FUNCTION-COLL-INTERSECT-IN-CYCL", 1, 0, false);
	    declareFunction("set_binary_function_coll_intersect_in_cycl", "SET-BINARY-FUNCTION-COLL-INTERSECT-IN-CYCL", 2, 0, false);
	    declareFunction("subloop_reserved_initialize_binary_function_coll_intersect_class", "SUBLOOP-RESERVED-INITIALIZE-BINARY-FUNCTION-COLL-INTERSECT-CLASS", 1, 0, false);
	    declareFunction("subloop_reserved_initialize_binary_function_coll_intersect_instance", "SUBLOOP-RESERVED-INITIALIZE-BINARY-FUNCTION-COLL-INTERSECT-INSTANCE", 1, 0, false);
	    declareFunction("binary_function_coll_intersect_p", "BINARY-FUNCTION-COLL-INTERSECT-P", 1, 0, false);
	    declareFunction("get_subcollection_function_first_mt", "GET-SUBCOLLECTION-FUNCTION-FIRST-MT", 1, 0, false);
	    declareFunction("set_subcollection_function_first_mt", "SET-SUBCOLLECTION-FUNCTION-FIRST-MT", 2, 0, false);
	    declareFunction("get_subcollection_function_first_out_cycl", "GET-SUBCOLLECTION-FUNCTION-FIRST-OUT-CYCL", 1, 0, false);
	    declareFunction("set_subcollection_function_first_out_cycl", "SET-SUBCOLLECTION-FUNCTION-FIRST-OUT-CYCL", 2, 0, false);
	    declareFunction("get_subcollection_function_first_in_cycl", "GET-SUBCOLLECTION-FUNCTION-FIRST-IN-CYCL", 1, 0, false);
	    declareFunction("set_subcollection_function_first_in_cycl", "SET-SUBCOLLECTION-FUNCTION-FIRST-IN-CYCL", 2, 0, false);
	    declareFunction("subloop_reserved_initialize_subcollection_function_first_class", "SUBLOOP-RESERVED-INITIALIZE-SUBCOLLECTION-FUNCTION-FIRST-CLASS", 1, 0, false);
	    declareFunction("subloop_reserved_initialize_subcollection_function_first_instance", "SUBLOOP-RESERVED-INITIALIZE-SUBCOLLECTION-FUNCTION-FIRST-INSTANCE", 1, 0, false);
	    declareFunction("subcollection_function_first_p", "SUBCOLLECTION-FUNCTION-FIRST-P", 1, 0, false);
	    declareFunction("get_collection_difference_function_mt", "GET-COLLECTION-DIFFERENCE-FUNCTION-MT", 1, 0, false);
	    declareFunction("set_collection_difference_function_mt", "SET-COLLECTION-DIFFERENCE-FUNCTION-MT", 2, 0, false);
	    declareFunction("get_collection_difference_function_out_cycl", "GET-COLLECTION-DIFFERENCE-FUNCTION-OUT-CYCL", 1, 0, false);
	    declareFunction("set_collection_difference_function_out_cycl", "SET-COLLECTION-DIFFERENCE-FUNCTION-OUT-CYCL", 2, 0, false);
	    declareFunction("get_collection_difference_function_in_cycl", "GET-COLLECTION-DIFFERENCE-FUNCTION-IN-CYCL", 1, 0, false);
	    declareFunction("set_collection_difference_function_in_cycl", "SET-COLLECTION-DIFFERENCE-FUNCTION-IN-CYCL", 2, 0, false);
	    declareFunction("subloop_reserved_initialize_collection_difference_function_class", "SUBLOOP-RESERVED-INITIALIZE-COLLECTION-DIFFERENCE-FUNCTION-CLASS", 1, 0, false);
	    declareFunction("subloop_reserved_initialize_collection_difference_function_instance", "SUBLOOP-RESERVED-INITIALIZE-COLLECTION-DIFFERENCE-FUNCTION-INSTANCE", 1, 0, false);
	    declareFunction("collection_difference_function_p", "COLLECTION-DIFFERENCE-FUNCTION-P", 1, 0, false);
	    declareFunction("get_instance_level_arg1_constraint_mt", "GET-INSTANCE-LEVEL-ARG1-CONSTRAINT-MT", 1, 0, false);
	    declareFunction("set_instance_level_arg1_constraint_mt", "SET-INSTANCE-LEVEL-ARG1-CONSTRAINT-MT", 2, 0, false);
	    declareFunction("get_instance_level_arg1_constraint_out_cycl", "GET-INSTANCE-LEVEL-ARG1-CONSTRAINT-OUT-CYCL", 1, 0, false);
	    declareFunction("set_instance_level_arg1_constraint_out_cycl", "SET-INSTANCE-LEVEL-ARG1-CONSTRAINT-OUT-CYCL", 2, 0, false);
	    declareFunction("get_instance_level_arg1_constraint_in_cycl", "GET-INSTANCE-LEVEL-ARG1-CONSTRAINT-IN-CYCL", 1, 0, false);
	    declareFunction("set_instance_level_arg1_constraint_in_cycl", "SET-INSTANCE-LEVEL-ARG1-CONSTRAINT-IN-CYCL", 2, 0, false);
	    declareFunction("subloop_reserved_initialize_instance_level_arg1_constraint_class", "SUBLOOP-RESERVED-INITIALIZE-INSTANCE-LEVEL-ARG1-CONSTRAINT-CLASS", 1, 0, false);
	    declareFunction("subloop_reserved_initialize_instance_level_arg1_constraint_instance", "SUBLOOP-RESERVED-INITIALIZE-INSTANCE-LEVEL-ARG1-CONSTRAINT-INSTANCE", 1, 0, false);
	    declareFunction("instance_level_arg1_constraint_p", "INSTANCE-LEVEL-ARG1-CONSTRAINT-P", 1, 0, false);
	}
	return NIL;
    }

    public static SubLObject declare_reformulator_module_quantifier_optimizer_3_file_Previous() {
	declareFunction("quant_opt_3_cost_estimate", "QUANT-OPT-3-COST-ESTIMATE", 3, 0, false);
	declareFunction("quant_opt_3_expression_required", "QUANT-OPT-3-EXPRESSION-REQUIRED", 3, 0, false);
	declareFunction("quant_opt_3_isa_collection_subsetP", "QUANT-OPT-3-ISA-COLLECTION-SUBSET?", 2, 0, false);
	declareFunction("quant_opt_3_expression_reformulate", "QUANT-OPT-3-EXPRESSION-REFORMULATE", 4, 0, false);
	declareFunction("quant_opt_3_reformulate_isa_collection_subset", "QUANT-OPT-3-REFORMULATE-ISA-COLLECTION-SUBSET", 2, 0, false);
	declareFunction("quant_opt_3_reformulate_int", "QUANT-OPT-3-REFORMULATE-INT", 2, 0, false);
	declareFunction("quant_opt_3_applies_to_expressionP", "QUANT-OPT-3-APPLIES-TO-EXPRESSION?", 2, 0, false);
	declareFunction("reformulate_quant_opt_3_expression", "REFORMULATE-QUANT-OPT-3-EXPRESSION", 2, 0, false);
	return NIL;
    }

    public static SubLObject init_reformulator_module_quantifier_optimizer_3_file() {
	deflexical("*QUANT-OPT-3-MICROSECONDS*", $int$1200);
	return NIL;
    }

    public static final SubLObject setup_reformulator_module_quantifier_optimizer_3_file_alt() {
	reformulator_module_harness.declare_rl_module($$QuantifierOptimizer_3_RLModule, $list_alt1);
	sunit_external.define_test_category($str_alt12$Reformulator_Quantifier_Optimizat, UNPROVIDED);
	sunit_external.define_test_suite($str_alt13$quant_optimizer_test_suite, list($str_alt12$Reformulator_Quantifier_Optimizat), UNPROVIDED, UNPROVIDED);
	sunit_macros.$current_module_sunit_tests$.setDynamicValue(cons(COLLECTION_SUBSET_FN_TERM, sunit_macros.$current_module_sunit_tests$.getDynamicValue()));
	sunit_macros.define_test_case_preamble(COLLECTION_SUBSET_FN_TERM);
	classes.subloop_new_class(COLLECTION_SUBSET_FN_TERM, TEST_CASE, NIL, NIL, $list_alt16);
	classes.class_set_implements_slot_listeners(COLLECTION_SUBSET_FN_TERM, NIL);
	classes.subloop_note_class_initialization_function(COLLECTION_SUBSET_FN_TERM, SUBLOOP_RESERVED_INITIALIZE_COLLECTION_SUBSET_FN_TERM_CLASS);
	classes.subloop_note_instance_initialization_function(COLLECTION_SUBSET_FN_TERM, SUBLOOP_RESERVED_INITIALIZE_COLLECTION_SUBSET_FN_TERM_INSTANCE);
	com.cyc.cycjava.cycl.reformulator_module_quantifier_optimizer_3.subloop_reserved_initialize_collection_subset_fn_term_class(COLLECTION_SUBSET_FN_TERM);
	sunit_macros.define_test_case_postamble(COLLECTION_SUBSET_FN_TERM, $str_alt34$reformulator_module_quantifier_op, $$$cycl, $list_alt36);
	sunit_macros.def_test_method_register(COLLECTION_SUBSET_FN_TERM, QUANTOPT_TEST_REFORMULATION);
	sunit_macros.$current_module_sunit_tests$.setDynamicValue(cons(BINARY_FUNCTION_REPORTED, sunit_macros.$current_module_sunit_tests$.getDynamicValue()));
	sunit_macros.define_test_case_preamble(BINARY_FUNCTION_REPORTED);
	classes.subloop_new_class(BINARY_FUNCTION_REPORTED, TEST_CASE, NIL, NIL, $list_alt16);
	classes.class_set_implements_slot_listeners(BINARY_FUNCTION_REPORTED, NIL);
	classes.subloop_note_class_initialization_function(BINARY_FUNCTION_REPORTED, SUBLOOP_RESERVED_INITIALIZE_BINARY_FUNCTION_REPORTED_CLASS);
	classes.subloop_note_instance_initialization_function(BINARY_FUNCTION_REPORTED, SUBLOOP_RESERVED_INITIALIZE_BINARY_FUNCTION_REPORTED_INSTANCE);
	com.cyc.cycjava.cycl.reformulator_module_quantifier_optimizer_3.subloop_reserved_initialize_binary_function_reported_class(BINARY_FUNCTION_REPORTED);
	sunit_macros.define_test_case_postamble(BINARY_FUNCTION_REPORTED, $str_alt34$reformulator_module_quantifier_op, $$$cycl, $list_alt36);
	sunit_macros.def_test_method_register(BINARY_FUNCTION_REPORTED, QUANTOPT_TEST_REFORMULATION);
	sunit_macros.$current_module_sunit_tests$.setDynamicValue(cons(TERNARY_FUNCTION_INSTANCE_WTH_RELATION, sunit_macros.$current_module_sunit_tests$.getDynamicValue()));
	sunit_macros.define_test_case_preamble(TERNARY_FUNCTION_INSTANCE_WTH_RELATION);
	classes.subloop_new_class(TERNARY_FUNCTION_INSTANCE_WTH_RELATION, TEST_CASE, NIL, NIL, $list_alt16);
	classes.class_set_implements_slot_listeners(TERNARY_FUNCTION_INSTANCE_WTH_RELATION, NIL);
	classes.subloop_note_class_initialization_function(TERNARY_FUNCTION_INSTANCE_WTH_RELATION, $sym42$SUBLOOP_RESERVED_INITIALIZE_TERNARY_FUNCTION_INSTANCE_WTH_RELATIO);
	classes.subloop_note_instance_initialization_function(TERNARY_FUNCTION_INSTANCE_WTH_RELATION, $sym43$SUBLOOP_RESERVED_INITIALIZE_TERNARY_FUNCTION_INSTANCE_WTH_RELATIO);
	com.cyc.cycjava.cycl.reformulator_module_quantifier_optimizer_3.subloop_reserved_initialize_ternary_function_instance_wth_relation_class(TERNARY_FUNCTION_INSTANCE_WTH_RELATION);
	sunit_macros.define_test_case_postamble(TERNARY_FUNCTION_INSTANCE_WTH_RELATION, $str_alt34$reformulator_module_quantifier_op, $$$cycl, $list_alt36);
	sunit_macros.def_test_method_register(TERNARY_FUNCTION_INSTANCE_WTH_RELATION, QUANTOPT_TEST_REFORMULATION);
	sunit_macros.$current_module_sunit_tests$.setDynamicValue(cons(BINARY_FUNCTION_COLL_INTERSECT, sunit_macros.$current_module_sunit_tests$.getDynamicValue()));
	sunit_macros.define_test_case_preamble(BINARY_FUNCTION_COLL_INTERSECT);
	classes.subloop_new_class(BINARY_FUNCTION_COLL_INTERSECT, TEST_CASE, NIL, NIL, $list_alt16);
	classes.class_set_implements_slot_listeners(BINARY_FUNCTION_COLL_INTERSECT, NIL);
	classes.subloop_note_class_initialization_function(BINARY_FUNCTION_COLL_INTERSECT, SUBLOOP_RESERVED_INITIALIZE_BINARY_FUNCTION_COLL_INTERSECT_CLASS);
	classes.subloop_note_instance_initialization_function(BINARY_FUNCTION_COLL_INTERSECT, $sym46$SUBLOOP_RESERVED_INITIALIZE_BINARY_FUNCTION_COLL_INTERSECT_INSTAN);
	com.cyc.cycjava.cycl.reformulator_module_quantifier_optimizer_3.subloop_reserved_initialize_binary_function_coll_intersect_class(BINARY_FUNCTION_COLL_INTERSECT);
	sunit_macros.define_test_case_postamble(BINARY_FUNCTION_COLL_INTERSECT, $str_alt34$reformulator_module_quantifier_op, $$$cycl, $list_alt36);
	sunit_macros.def_test_method_register(BINARY_FUNCTION_COLL_INTERSECT, QUANTOPT_TEST_REFORMULATION);
	sunit_macros.$current_module_sunit_tests$.setDynamicValue(cons(SUBCOLLECTION_FUNCTION_FIRST, sunit_macros.$current_module_sunit_tests$.getDynamicValue()));
	sunit_macros.define_test_case_preamble(SUBCOLLECTION_FUNCTION_FIRST);
	classes.subloop_new_class(SUBCOLLECTION_FUNCTION_FIRST, TEST_CASE, NIL, NIL, $list_alt16);
	classes.class_set_implements_slot_listeners(SUBCOLLECTION_FUNCTION_FIRST, NIL);
	classes.subloop_note_class_initialization_function(SUBCOLLECTION_FUNCTION_FIRST, SUBLOOP_RESERVED_INITIALIZE_SUBCOLLECTION_FUNCTION_FIRST_CLASS);
	classes.subloop_note_instance_initialization_function(SUBCOLLECTION_FUNCTION_FIRST, SUBLOOP_RESERVED_INITIALIZE_SUBCOLLECTION_FUNCTION_FIRST_INSTANCE);
	com.cyc.cycjava.cycl.reformulator_module_quantifier_optimizer_3.subloop_reserved_initialize_subcollection_function_first_class(SUBCOLLECTION_FUNCTION_FIRST);
	sunit_macros.define_test_case_postamble(SUBCOLLECTION_FUNCTION_FIRST, $str_alt34$reformulator_module_quantifier_op, $$$cycl, $list_alt36);
	sunit_macros.def_test_method_register(SUBCOLLECTION_FUNCTION_FIRST, QUANTOPT_TEST_REFORMULATION);
	sunit_macros.$current_module_sunit_tests$.setDynamicValue(cons(COLLECTION_DIFFERENCE_FUNCTION, sunit_macros.$current_module_sunit_tests$.getDynamicValue()));
	sunit_macros.define_test_case_preamble(COLLECTION_DIFFERENCE_FUNCTION);
	classes.subloop_new_class(COLLECTION_DIFFERENCE_FUNCTION, TEST_CASE, NIL, NIL, $list_alt16);
	classes.class_set_implements_slot_listeners(COLLECTION_DIFFERENCE_FUNCTION, NIL);
	classes.subloop_note_class_initialization_function(COLLECTION_DIFFERENCE_FUNCTION, SUBLOOP_RESERVED_INITIALIZE_COLLECTION_DIFFERENCE_FUNCTION_CLASS);
	classes.subloop_note_instance_initialization_function(COLLECTION_DIFFERENCE_FUNCTION, $sym52$SUBLOOP_RESERVED_INITIALIZE_COLLECTION_DIFFERENCE_FUNCTION_INSTAN);
	com.cyc.cycjava.cycl.reformulator_module_quantifier_optimizer_3.subloop_reserved_initialize_collection_difference_function_class(COLLECTION_DIFFERENCE_FUNCTION);
	sunit_macros.define_test_case_postamble(COLLECTION_DIFFERENCE_FUNCTION, $str_alt34$reformulator_module_quantifier_op, $$$cycl, $list_alt36);
	sunit_macros.def_test_method_register(COLLECTION_DIFFERENCE_FUNCTION, QUANTOPT_TEST_REFORMULATION);
	sunit_macros.$current_module_sunit_tests$.setDynamicValue(cons(INSTANCE_LEVEL_ARG1_CONSTRAINT, sunit_macros.$current_module_sunit_tests$.getDynamicValue()));
	sunit_macros.define_test_case_preamble(INSTANCE_LEVEL_ARG1_CONSTRAINT);
	classes.subloop_new_class(INSTANCE_LEVEL_ARG1_CONSTRAINT, TEST_CASE, NIL, NIL, $list_alt16);
	classes.class_set_implements_slot_listeners(INSTANCE_LEVEL_ARG1_CONSTRAINT, NIL);
	classes.subloop_note_class_initialization_function(INSTANCE_LEVEL_ARG1_CONSTRAINT, SUBLOOP_RESERVED_INITIALIZE_INSTANCE_LEVEL_ARG1_CONSTRAINT_CLASS);
	classes.subloop_note_instance_initialization_function(INSTANCE_LEVEL_ARG1_CONSTRAINT, $sym55$SUBLOOP_RESERVED_INITIALIZE_INSTANCE_LEVEL_ARG1_CONSTRAINT_INSTAN);
	com.cyc.cycjava.cycl.reformulator_module_quantifier_optimizer_3.subloop_reserved_initialize_instance_level_arg1_constraint_class(INSTANCE_LEVEL_ARG1_CONSTRAINT);
	sunit_macros.define_test_case_postamble(INSTANCE_LEVEL_ARG1_CONSTRAINT, $str_alt34$reformulator_module_quantifier_op, $$$cycl, $list_alt36);
	sunit_macros.def_test_method_register(INSTANCE_LEVEL_ARG1_CONSTRAINT, QUANTOPT_TEST_REFORMULATION);
	return NIL;
    }

    public static SubLObject setup_reformulator_module_quantifier_optimizer_3_file() {
	if (SubLFiles.USE_V1) {
	    reformulator_module_harness.declare_rl_module($$QuantifierOptimizer_3_RLModule, $list1);
	    sunit_external.define_test_category($str12$Reformulator_Quantifier_Optimizat, UNPROVIDED);
	    sunit_external.define_test_suite($str13$quant_optimizer_test_suite, list($str12$Reformulator_Quantifier_Optimizat), UNPROVIDED, UNPROVIDED);
	}
	if (SubLFiles.USE_V2) {
	    sunit_macros.$current_module_sunit_tests$.setDynamicValue(cons(COLLECTION_SUBSET_FN_TERM, sunit_macros.$current_module_sunit_tests$.getDynamicValue()));
	    sunit_macros.define_test_case_preamble(COLLECTION_SUBSET_FN_TERM);
	    classes.subloop_new_class(COLLECTION_SUBSET_FN_TERM, TEST_CASE, NIL, NIL, $list_alt16);
	    classes.class_set_implements_slot_listeners(COLLECTION_SUBSET_FN_TERM, NIL);
	    classes.subloop_note_class_initialization_function(COLLECTION_SUBSET_FN_TERM, SUBLOOP_RESERVED_INITIALIZE_COLLECTION_SUBSET_FN_TERM_CLASS);
	    classes.subloop_note_instance_initialization_function(COLLECTION_SUBSET_FN_TERM, SUBLOOP_RESERVED_INITIALIZE_COLLECTION_SUBSET_FN_TERM_INSTANCE);
	    com.cyc.cycjava.cycl.reformulator_module_quantifier_optimizer_3.subloop_reserved_initialize_collection_subset_fn_term_class(COLLECTION_SUBSET_FN_TERM);
	    sunit_macros.define_test_case_postamble(COLLECTION_SUBSET_FN_TERM, $str_alt34$reformulator_module_quantifier_op, $$$cycl, $list_alt36);
	    sunit_macros.def_test_method_register(COLLECTION_SUBSET_FN_TERM, QUANTOPT_TEST_REFORMULATION);
	    sunit_macros.$current_module_sunit_tests$.setDynamicValue(cons(BINARY_FUNCTION_REPORTED, sunit_macros.$current_module_sunit_tests$.getDynamicValue()));
	    sunit_macros.define_test_case_preamble(BINARY_FUNCTION_REPORTED);
	    classes.subloop_new_class(BINARY_FUNCTION_REPORTED, TEST_CASE, NIL, NIL, $list_alt16);
	    classes.class_set_implements_slot_listeners(BINARY_FUNCTION_REPORTED, NIL);
	    classes.subloop_note_class_initialization_function(BINARY_FUNCTION_REPORTED, SUBLOOP_RESERVED_INITIALIZE_BINARY_FUNCTION_REPORTED_CLASS);
	    classes.subloop_note_instance_initialization_function(BINARY_FUNCTION_REPORTED, SUBLOOP_RESERVED_INITIALIZE_BINARY_FUNCTION_REPORTED_INSTANCE);
	    com.cyc.cycjava.cycl.reformulator_module_quantifier_optimizer_3.subloop_reserved_initialize_binary_function_reported_class(BINARY_FUNCTION_REPORTED);
	    sunit_macros.define_test_case_postamble(BINARY_FUNCTION_REPORTED, $str_alt34$reformulator_module_quantifier_op, $$$cycl, $list_alt36);
	    sunit_macros.def_test_method_register(BINARY_FUNCTION_REPORTED, QUANTOPT_TEST_REFORMULATION);
	    sunit_macros.$current_module_sunit_tests$.setDynamicValue(cons(TERNARY_FUNCTION_INSTANCE_WTH_RELATION, sunit_macros.$current_module_sunit_tests$.getDynamicValue()));
	    sunit_macros.define_test_case_preamble(TERNARY_FUNCTION_INSTANCE_WTH_RELATION);
	    classes.subloop_new_class(TERNARY_FUNCTION_INSTANCE_WTH_RELATION, TEST_CASE, NIL, NIL, $list_alt16);
	    classes.class_set_implements_slot_listeners(TERNARY_FUNCTION_INSTANCE_WTH_RELATION, NIL);
	    classes.subloop_note_class_initialization_function(TERNARY_FUNCTION_INSTANCE_WTH_RELATION, $sym42$SUBLOOP_RESERVED_INITIALIZE_TERNARY_FUNCTION_INSTANCE_WTH_RELATIO);
	    classes.subloop_note_instance_initialization_function(TERNARY_FUNCTION_INSTANCE_WTH_RELATION, $sym43$SUBLOOP_RESERVED_INITIALIZE_TERNARY_FUNCTION_INSTANCE_WTH_RELATIO);
	    com.cyc.cycjava.cycl.reformulator_module_quantifier_optimizer_3.subloop_reserved_initialize_ternary_function_instance_wth_relation_class(TERNARY_FUNCTION_INSTANCE_WTH_RELATION);
	    sunit_macros.define_test_case_postamble(TERNARY_FUNCTION_INSTANCE_WTH_RELATION, $str_alt34$reformulator_module_quantifier_op, $$$cycl, $list_alt36);
	    sunit_macros.def_test_method_register(TERNARY_FUNCTION_INSTANCE_WTH_RELATION, QUANTOPT_TEST_REFORMULATION);
	    sunit_macros.$current_module_sunit_tests$.setDynamicValue(cons(BINARY_FUNCTION_COLL_INTERSECT, sunit_macros.$current_module_sunit_tests$.getDynamicValue()));
	    sunit_macros.define_test_case_preamble(BINARY_FUNCTION_COLL_INTERSECT);
	    classes.subloop_new_class(BINARY_FUNCTION_COLL_INTERSECT, TEST_CASE, NIL, NIL, $list_alt16);
	    classes.class_set_implements_slot_listeners(BINARY_FUNCTION_COLL_INTERSECT, NIL);
	    classes.subloop_note_class_initialization_function(BINARY_FUNCTION_COLL_INTERSECT, SUBLOOP_RESERVED_INITIALIZE_BINARY_FUNCTION_COLL_INTERSECT_CLASS);
	    classes.subloop_note_instance_initialization_function(BINARY_FUNCTION_COLL_INTERSECT, $sym46$SUBLOOP_RESERVED_INITIALIZE_BINARY_FUNCTION_COLL_INTERSECT_INSTAN);
	    com.cyc.cycjava.cycl.reformulator_module_quantifier_optimizer_3.subloop_reserved_initialize_binary_function_coll_intersect_class(BINARY_FUNCTION_COLL_INTERSECT);
	    sunit_macros.define_test_case_postamble(BINARY_FUNCTION_COLL_INTERSECT, $str_alt34$reformulator_module_quantifier_op, $$$cycl, $list_alt36);
	    sunit_macros.def_test_method_register(BINARY_FUNCTION_COLL_INTERSECT, QUANTOPT_TEST_REFORMULATION);
	    sunit_macros.$current_module_sunit_tests$.setDynamicValue(cons(SUBCOLLECTION_FUNCTION_FIRST, sunit_macros.$current_module_sunit_tests$.getDynamicValue()));
	    sunit_macros.define_test_case_preamble(SUBCOLLECTION_FUNCTION_FIRST);
	    classes.subloop_new_class(SUBCOLLECTION_FUNCTION_FIRST, TEST_CASE, NIL, NIL, $list_alt16);
	    classes.class_set_implements_slot_listeners(SUBCOLLECTION_FUNCTION_FIRST, NIL);
	    classes.subloop_note_class_initialization_function(SUBCOLLECTION_FUNCTION_FIRST, SUBLOOP_RESERVED_INITIALIZE_SUBCOLLECTION_FUNCTION_FIRST_CLASS);
	    classes.subloop_note_instance_initialization_function(SUBCOLLECTION_FUNCTION_FIRST, SUBLOOP_RESERVED_INITIALIZE_SUBCOLLECTION_FUNCTION_FIRST_INSTANCE);
	    com.cyc.cycjava.cycl.reformulator_module_quantifier_optimizer_3.subloop_reserved_initialize_subcollection_function_first_class(SUBCOLLECTION_FUNCTION_FIRST);
	    sunit_macros.define_test_case_postamble(SUBCOLLECTION_FUNCTION_FIRST, $str_alt34$reformulator_module_quantifier_op, $$$cycl, $list_alt36);
	    sunit_macros.def_test_method_register(SUBCOLLECTION_FUNCTION_FIRST, QUANTOPT_TEST_REFORMULATION);
	    sunit_macros.$current_module_sunit_tests$.setDynamicValue(cons(COLLECTION_DIFFERENCE_FUNCTION, sunit_macros.$current_module_sunit_tests$.getDynamicValue()));
	    sunit_macros.define_test_case_preamble(COLLECTION_DIFFERENCE_FUNCTION);
	    classes.subloop_new_class(COLLECTION_DIFFERENCE_FUNCTION, TEST_CASE, NIL, NIL, $list_alt16);
	    classes.class_set_implements_slot_listeners(COLLECTION_DIFFERENCE_FUNCTION, NIL);
	    classes.subloop_note_class_initialization_function(COLLECTION_DIFFERENCE_FUNCTION, SUBLOOP_RESERVED_INITIALIZE_COLLECTION_DIFFERENCE_FUNCTION_CLASS);
	    classes.subloop_note_instance_initialization_function(COLLECTION_DIFFERENCE_FUNCTION, $sym52$SUBLOOP_RESERVED_INITIALIZE_COLLECTION_DIFFERENCE_FUNCTION_INSTAN);
	    com.cyc.cycjava.cycl.reformulator_module_quantifier_optimizer_3.subloop_reserved_initialize_collection_difference_function_class(COLLECTION_DIFFERENCE_FUNCTION);
	    sunit_macros.define_test_case_postamble(COLLECTION_DIFFERENCE_FUNCTION, $str_alt34$reformulator_module_quantifier_op, $$$cycl, $list_alt36);
	    sunit_macros.def_test_method_register(COLLECTION_DIFFERENCE_FUNCTION, QUANTOPT_TEST_REFORMULATION);
	    sunit_macros.$current_module_sunit_tests$.setDynamicValue(cons(INSTANCE_LEVEL_ARG1_CONSTRAINT, sunit_macros.$current_module_sunit_tests$.getDynamicValue()));
	    sunit_macros.define_test_case_preamble(INSTANCE_LEVEL_ARG1_CONSTRAINT);
	    classes.subloop_new_class(INSTANCE_LEVEL_ARG1_CONSTRAINT, TEST_CASE, NIL, NIL, $list_alt16);
	    classes.class_set_implements_slot_listeners(INSTANCE_LEVEL_ARG1_CONSTRAINT, NIL);
	    classes.subloop_note_class_initialization_function(INSTANCE_LEVEL_ARG1_CONSTRAINT, SUBLOOP_RESERVED_INITIALIZE_INSTANCE_LEVEL_ARG1_CONSTRAINT_CLASS);
	    classes.subloop_note_instance_initialization_function(INSTANCE_LEVEL_ARG1_CONSTRAINT, $sym55$SUBLOOP_RESERVED_INITIALIZE_INSTANCE_LEVEL_ARG1_CONSTRAINT_INSTAN);
	    com.cyc.cycjava.cycl.reformulator_module_quantifier_optimizer_3.subloop_reserved_initialize_instance_level_arg1_constraint_class(INSTANCE_LEVEL_ARG1_CONSTRAINT);
	    sunit_macros.define_test_case_postamble(INSTANCE_LEVEL_ARG1_CONSTRAINT, $str_alt34$reformulator_module_quantifier_op, $$$cycl, $list_alt36);
	    sunit_macros.def_test_method_register(INSTANCE_LEVEL_ARG1_CONSTRAINT, QUANTOPT_TEST_REFORMULATION);
	}
	return NIL;
    }

    public static SubLObject setup_reformulator_module_quantifier_optimizer_3_file_Previous() {
	reformulator_module_harness.declare_rl_module($$QuantifierOptimizer_3_RLModule, $list1);
	sunit_external.define_test_category($str12$Reformulator_Quantifier_Optimizat, UNPROVIDED);
	sunit_external.define_test_suite($str13$quant_optimizer_test_suite, list($str12$Reformulator_Quantifier_Optimizat), UNPROVIDED, UNPROVIDED);
	return NIL;
    }

    @Override
    public void declareFunctions() {
	declare_reformulator_module_quantifier_optimizer_3_file();
    }

    @Override
    public void initializeVariables() {
	init_reformulator_module_quantifier_optimizer_3_file();
    }

    @Override
    public void runTopLevelForms() {
	setup_reformulator_module_quantifier_optimizer_3_file();
    }

    

    static private final SubLList $list_alt1 = list(new SubLObject[] { makeKeyword("REQUIRED"), makeSymbol("QUANT-OPT-3-EXPRESSION-REQUIRED"), $COST, makeSymbol("QUANT-OPT-3-COST-ESTIMATE"), makeKeyword("REFORMULATE"), makeSymbol("QUANT-OPT-3-EXPRESSION-REFORMULATE"),
	    makeKeyword("DOCUMENTATION"), makeString("Reorders quantifiers in NATs so that quantifier expressions are in the right place for \n    the Quantifier Processing RL module to handle them in the proper way."), makeKeyword("EXAMPLE-SOURCE"),
	    makeString("(#$ProspectiveCollectionFn\n      (#$NLQuantFn-3 #$Every-NLAttr\n\t    (#$NLNumberFn #$Singular-NLAttr #$TranscriptCopy) 0)\n\t     #$MessengerRNA)"), makeKeyword("EXAMPLE-TARGET"),
	    makeString("(#$NLQuantFn-3 #$Every-NLAttr\n      (#$NLNumberFn #$Singular-NLAttr\n\t (#$ProspectiveCollectionFn #$TranscriptCopy #$MessengerRNA)) 0)") });

    static private final SubLList $list_alt3 = list(reader_make_constant_shell("NLQuantFn-3"), reader_make_constant_shell("NLDefinitenessFn-3"), reader_make_constant_shell("NLNumberFn"));

    static private final SubLList $list_alt9 = list(reader_make_constant_shell("NLQuantFn-3"), reader_make_constant_shell("NLDefinitenessFn-3"));

    static private final SubLString $str_alt12$Reformulator_Quantifier_Optimizat = makeString("Reformulator Quantifier Optimization");

    static private final SubLString $str_alt13$quant_optimizer_test_suite = makeString("quant-optimizer-test-suite");

    private static final SubLSymbol COLLECTION_SUBSET_FN_TERM = makeSymbol("COLLECTION-SUBSET-FN-TERM");

    static private final SubLList $list_alt16 = list(list(makeSymbol("IN-CYCL"), makeKeyword("INSTANCE"), makeKeyword("PRIVATE")), list(makeSymbol("OUT-CYCL"), makeKeyword("INSTANCE"), makeKeyword("PRIVATE")), list(makeSymbol("MT"), makeKeyword("INSTANCE"), makeKeyword("PRIVATE")),
	    list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SETUP"), NIL, makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("CLEANUP"), NIL, makeKeyword("PROTECTED")),
	    list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("QUANTOPT-TEST-REFORMULATION"), NIL, makeKeyword("PROTECTED")));

    private static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_COLLECTION_SUBSET_FN_TERM_CLASS = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-COLLECTION-SUBSET-FN-TERM-CLASS");

    private static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_COLLECTION_SUBSET_FN_TERM_INSTANCE = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-COLLECTION-SUBSET-FN-TERM-INSTANCE");

    static private final SubLString $str_alt34$reformulator_module_quantifier_op = makeString("reformulator-module-quantifier-optimizer-3");

    static private final SubLString $$$cycl = makeString("cycl");

    static private final SubLList $list_alt36 = list(makeString("Reformulator Quantifier Optimization"));

    private static final SubLSymbol QUANTOPT_TEST_REFORMULATION = makeSymbol("QUANTOPT-TEST-REFORMULATION");

    private static final SubLSymbol BINARY_FUNCTION_REPORTED = makeSymbol("BINARY-FUNCTION-REPORTED");

    private static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_BINARY_FUNCTION_REPORTED_CLASS = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-BINARY-FUNCTION-REPORTED-CLASS");

    private static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_BINARY_FUNCTION_REPORTED_INSTANCE = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-BINARY-FUNCTION-REPORTED-INSTANCE");

    private static final SubLSymbol TERNARY_FUNCTION_INSTANCE_WTH_RELATION = makeSymbol("TERNARY-FUNCTION-INSTANCE-WTH-RELATION");

    static private final SubLSymbol $sym42$SUBLOOP_RESERVED_INITIALIZE_TERNARY_FUNCTION_INSTANCE_WTH_RELATIO = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-TERNARY-FUNCTION-INSTANCE-WTH-RELATION-CLASS");

    static private final SubLSymbol $sym43$SUBLOOP_RESERVED_INITIALIZE_TERNARY_FUNCTION_INSTANCE_WTH_RELATIO = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-TERNARY-FUNCTION-INSTANCE-WTH-RELATION-INSTANCE");

    private static final SubLSymbol BINARY_FUNCTION_COLL_INTERSECT = makeSymbol("BINARY-FUNCTION-COLL-INTERSECT");

    private static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_BINARY_FUNCTION_COLL_INTERSECT_CLASS = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-BINARY-FUNCTION-COLL-INTERSECT-CLASS");

    static private final SubLSymbol $sym46$SUBLOOP_RESERVED_INITIALIZE_BINARY_FUNCTION_COLL_INTERSECT_INSTAN = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-BINARY-FUNCTION-COLL-INTERSECT-INSTANCE");

    private static final SubLSymbol SUBCOLLECTION_FUNCTION_FIRST = makeSymbol("SUBCOLLECTION-FUNCTION-FIRST");

    private static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_SUBCOLLECTION_FUNCTION_FIRST_CLASS = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-SUBCOLLECTION-FUNCTION-FIRST-CLASS");

    private static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_SUBCOLLECTION_FUNCTION_FIRST_INSTANCE = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-SUBCOLLECTION-FUNCTION-FIRST-INSTANCE");

    private static final SubLSymbol COLLECTION_DIFFERENCE_FUNCTION = makeSymbol("COLLECTION-DIFFERENCE-FUNCTION");

    private static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_COLLECTION_DIFFERENCE_FUNCTION_CLASS = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-COLLECTION-DIFFERENCE-FUNCTION-CLASS");

    static private final SubLSymbol $sym52$SUBLOOP_RESERVED_INITIALIZE_COLLECTION_DIFFERENCE_FUNCTION_INSTAN = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-COLLECTION-DIFFERENCE-FUNCTION-INSTANCE");

    private static final SubLSymbol INSTANCE_LEVEL_ARG1_CONSTRAINT = makeSymbol("INSTANCE-LEVEL-ARG1-CONSTRAINT");

    private static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_INSTANCE_LEVEL_ARG1_CONSTRAINT_CLASS = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-INSTANCE-LEVEL-ARG1-CONSTRAINT-CLASS");

    static private final SubLSymbol $sym55$SUBLOOP_RESERVED_INITIALIZE_INSTANCE_LEVEL_ARG1_CONSTRAINT_INSTAN = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-INSTANCE-LEVEL-ARG1-CONSTRAINT-INSTANCE");
}

/**
 * Total time: 36 ms
 */
