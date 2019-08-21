/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 */
package com.cyc.cycjava.cycl.inference.harness;


import static com.cyc.cycjava.cycl.arguments.support_sentence;
import static com.cyc.cycjava.cycl.assertions_high.assertion_cnf;
import static com.cyc.cycjava.cycl.assertions_high.rule_assertionP;
import static com.cyc.cycjava.cycl.bindings.binding_list_p;
import static com.cyc.cycjava.cycl.bindings.bindings_variables;
import static com.cyc.cycjava.cycl.bindings.compose_bindings;
import static com.cyc.cycjava.cycl.bindings.transfer_variable_map_to_bindings_filtered;
import static com.cyc.cycjava.cycl.clauses.neg_lits;
import static com.cyc.cycjava.cycl.clauses.pos_lits;
import static com.cyc.cycjava.cycl.control_vars.$negation_by_failure$;
import static com.cyc.cycjava.cycl.czer_main.canonicalize_cycl;
import static com.cyc.cycjava.cycl.formula_pattern_match.pattern_transform_formula;
import static com.cyc.cycjava.cycl.id_index.do_id_index_empty_p;
import static com.cyc.cycjava.cycl.id_index.do_id_index_id_and_object_validP;
import static com.cyc.cycjava.cycl.id_index.do_id_index_next_id;
import static com.cyc.cycjava.cycl.id_index.do_id_index_next_state;
import static com.cyc.cycjava.cycl.id_index.do_id_index_state_object;
import static com.cyc.cycjava.cycl.id_index.id_index_dense_objects;
import static com.cyc.cycjava.cycl.id_index.id_index_dense_objects_empty_p;
import static com.cyc.cycjava.cycl.id_index.id_index_objects_empty_p;
import static com.cyc.cycjava.cycl.id_index.id_index_skip_tombstones_p;
import static com.cyc.cycjava.cycl.id_index.id_index_sparse_objects;
import static com.cyc.cycjava.cycl.id_index.id_index_sparse_objects_empty_p;
import static com.cyc.cycjava.cycl.id_index.id_index_tombstone_p;
import static com.cyc.cycjava.cycl.inference.harness.inference_datastructures_problem_query.asent_sense_and_mt_to_problem_query;
import static com.cyc.cycjava.cycl.inference.harness.inference_datastructures_problem_query.single_literal_problem_query_atomic_sentence;
import static com.cyc.cycjava.cycl.inference.harness.inference_modules.hl_module_activeP;
import static com.cyc.cycjava.cycl.inference.harness.inference_modules.hl_module_asent_cost;
import static com.cyc.cycjava.cycl.inference.harness.inference_modules.hl_module_completeness;
import static com.cyc.cycjava.cycl.inference.harness.inference_modules.hl_module_exclusive_func;
import static com.cyc.cycjava.cycl.inference.harness.inference_modules.hl_module_expand_func;
import static com.cyc.cycjava.cycl.inference.harness.inference_modules.hl_module_expand_pattern;
import static com.cyc.cycjava.cycl.inference.harness.inference_modules.hl_module_required_func;
import static com.cyc.cycjava.cycl.inference.harness.inference_modules.hl_module_sense_relevant_p;
import static com.cyc.cycjava.cycl.inference.harness.inference_modules.rewrite_module_closure;
import static com.cyc.cycjava.cycl.inference.harness.inference_modules.rewrite_module_support;
import static com.cyc.cycjava.cycl.inference.harness.inference_modules.rewrite_modules;
import static com.cyc.cycjava.cycl.mt_relevance_macros.$mt$;
import static com.cyc.cycjava.cycl.mt_relevance_macros.$relevant_mt_function$;
import static com.cyc.cycjava.cycl.mt_relevance_macros.$relevant_mts$;
import static com.cyc.cycjava.cycl.mt_relevance_macros.update_inference_mt_relevance_function;
import static com.cyc.cycjava.cycl.mt_relevance_macros.update_inference_mt_relevance_mt;
import static com.cyc.cycjava.cycl.mt_relevance_macros.update_inference_mt_relevance_mt_list;
import static com.cyc.cycjava.cycl.mt_relevance_macros.with_inference_mt_relevance_validate;
import static com.cyc.cycjava.cycl.set.do_set_internal;
import static com.cyc.cycjava.cycl.set_contents.do_set_contents_basis_object;
import static com.cyc.cycjava.cycl.set_contents.do_set_contents_doneP;
import static com.cyc.cycjava.cycl.set_contents.do_set_contents_element_validP;
import static com.cyc.cycjava.cycl.set_contents.do_set_contents_initial_state;
import static com.cyc.cycjava.cycl.set_contents.do_set_contents_next;
import static com.cyc.cycjava.cycl.set_contents.do_set_contents_update_state;
import static com.cyc.cycjava.cycl.unification.unify;
import static com.cyc.cycjava.cycl.unification_utilities.rewrite_asent_unify;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.cons;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality.identity;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions.funcall;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.getEntryKey;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.getEntrySetIterator;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.getEntryValue;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.iteratorHasNext;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.iteratorNextEntry;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.releaseEntrySetIterator;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.add;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.subtract;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.length;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures.def_csetf;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures.makeStructDeclNative;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures.register_method;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.symbol_function;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors.aref;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeBoolean;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeKeyword;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeString;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeSymbol;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.cdestructuring_bind_error;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.destructuring_bind_must_consp;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.cadr;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.cddr;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.member;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high.$print_object_method_table$;
import static com.cyc.tool.subl.util.SubLFiles.declareFunction;
import static com.cyc.tool.subl.util.SubLFiles.defconstant;

import java.util.Iterator;
import java.util.Map;

import org.armedbear.lisp.Lisp;

import com.cyc.cycjava.cycl.V12;
import com.cyc.cycjava.cycl.arguments;
import com.cyc.cycjava.cycl.assertions_high;
import com.cyc.cycjava.cycl.bindings;
import com.cyc.cycjava.cycl.clauses;
import com.cyc.cycjava.cycl.czer_main;
import com.cyc.cycjava.cycl.formula_pattern_match;
import com.cyc.cycjava.cycl.list_utilities;
import com.cyc.cycjava.cycl.mt_relevance_macros;
import com.cyc.cycjava.cycl.set;
import com.cyc.cycjava.cycl.set_contents;
import com.cyc.cycjava.cycl.unification;
import com.cyc.cycjava.cycl.unification_utilities;
import com.cyc.cycjava.cycl.variables;
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
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.compatibility;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.visitation;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLFiles.LispMethod;
import com.cyc.tool.subl.util.SubLTrampolineFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 * module:      INFERENCE-WORKER-REWRITE
 * source file: /cyc/top/cycl/inference/harness/inference-worker-rewrite.lisp
 * created:     2019/07/03 17:37:40
 */
public final class inference_worker_rewrite extends SubLTranslatedFile implements V12 {
    public static final SubLFile me = new inference_worker_rewrite();

 public static final String myName = "com.cyc.cycjava.cycl.inference.harness.inference_worker_rewrite";


    // defconstant
    @LispMethod(comment = "defconstant")
    public static final SubLSymbol $dtp_rewrite_link_data$ = makeSymbol("*DTP-REWRITE-LINK-DATA*");

    // Internal Constants
    @LispMethod(comment = "Internal Constants")
    private static final SubLSymbol REWRITE_LINK_DATA = makeSymbol("REWRITE-LINK-DATA");

    private static final SubLSymbol REWRITE_LINK_DATA_P = makeSymbol("REWRITE-LINK-DATA-P");

    static private final SubLList $list2 = list(makeSymbol("HL-MODULE"), makeSymbol("BINDINGS"), makeSymbol("SUPPORTS"));

    static private final SubLList $list3 = list(makeKeyword("HL-MODULE"), makeKeyword("BINDINGS"), makeKeyword("SUPPORTS"));

    static private final SubLList $list4 = list(makeSymbol("RW-LINK-DATA-HL-MODULE"), makeSymbol("RW-LINK-DATA-BINDINGS"), makeSymbol("RW-LINK-DATA-SUPPORTS"));

    static private final SubLList $list5 = list(makeSymbol("_CSETF-RW-LINK-DATA-HL-MODULE"), makeSymbol("_CSETF-RW-LINK-DATA-BINDINGS"), makeSymbol("_CSETF-RW-LINK-DATA-SUPPORTS"));

    private static final SubLSymbol REWRITE_LINK_DATA_PRINT_FUNCTION_TRAMPOLINE = makeSymbol("REWRITE-LINK-DATA-PRINT-FUNCTION-TRAMPOLINE");

    private static final SubLList $list8 = list(makeSymbol("OPTIMIZE-FUNCALL"), makeSymbol("REWRITE-LINK-DATA-P"));

    private static final SubLSymbol RW_LINK_DATA_HL_MODULE = makeSymbol("RW-LINK-DATA-HL-MODULE");

    private static final SubLSymbol _CSETF_RW_LINK_DATA_HL_MODULE = makeSymbol("_CSETF-RW-LINK-DATA-HL-MODULE");

    private static final SubLSymbol RW_LINK_DATA_BINDINGS = makeSymbol("RW-LINK-DATA-BINDINGS");

    private static final SubLSymbol _CSETF_RW_LINK_DATA_BINDINGS = makeSymbol("_CSETF-RW-LINK-DATA-BINDINGS");

    private static final SubLSymbol RW_LINK_DATA_SUPPORTS = makeSymbol("RW-LINK-DATA-SUPPORTS");

    private static final SubLSymbol _CSETF_RW_LINK_DATA_SUPPORTS = makeSymbol("_CSETF-RW-LINK-DATA-SUPPORTS");

    private static final SubLString $str18$Invalid_slot__S_for_construction_ = makeString("Invalid slot ~S for construction function");

    private static final SubLSymbol MAKE_REWRITE_LINK_DATA = makeSymbol("MAKE-REWRITE-LINK-DATA");

    private static final SubLSymbol VISIT_DEFSTRUCT_OBJECT_REWRITE_LINK_DATA_METHOD = makeSymbol("VISIT-DEFSTRUCT-OBJECT-REWRITE-LINK-DATA-METHOD");

    private static final SubLSymbol REWRITE_LINK_P = makeSymbol("REWRITE-LINK-P");

    private static final SubLString $str31$Bindings__a_are_not_valid_rewrite = makeString("Bindings ~a are not valid rewrite-link bindings.");

    private static final SubLString $str33$No_tactic_found_for__S = makeString("No tactic found for ~S");

    private static final SubLSymbol PROBLEM_QUERY_P = makeSymbol("PROBLEM-QUERY-P");

    private static final SubLList $list37 = list(makeSymbol("ASENT"), makeSymbol("SUPPORTS"));

    private static final SubLSymbol PROBLEM_LINK_WITH_SINGLE_SUPPORTING_PROBLEM_P = makeSymbol("PROBLEM-LINK-WITH-SINGLE-SUPPORTING-PROBLEM-P");

    public static final SubLObject rewrite_link_data_print_function_trampoline_alt(SubLObject v_object, SubLObject stream) {
        compatibility.default_struct_print_function(v_object, stream, ZERO_INTEGER);
        return NIL;
    }

    public static SubLObject rewrite_link_data_print_function_trampoline(final SubLObject v_object, final SubLObject stream) {
        compatibility.default_struct_print_function(v_object, stream, ZERO_INTEGER);
        return NIL;
    }

    public static final SubLObject rewrite_link_data_p_alt(SubLObject v_object) {
        return v_object.getClass() == com.cyc.cycjava.cycl.inference.harness.inference_worker_rewrite.$rewrite_link_data_native.class ? ((SubLObject) (T)) : NIL;
    }

    public static SubLObject rewrite_link_data_p(final SubLObject v_object) {
        return v_object.getClass() == com.cyc.cycjava.cycl.inference.harness.inference_worker_rewrite.$rewrite_link_data_native.class ? T : NIL;
    }

    public static final SubLObject rw_link_data_hl_module_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, REWRITE_LINK_DATA_P);
        return v_object.getField2();
    }

    public static SubLObject rw_link_data_hl_module(final SubLObject v_object) {
        assert NIL != inference_worker_rewrite.rewrite_link_data_p(v_object) : "! inference_worker_rewrite.rewrite_link_data_p(v_object) " + "inference_worker_rewrite.rewrite_link_data_p error :" + v_object;
        return v_object.getField2();
    }

    public static final SubLObject rw_link_data_bindings_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, REWRITE_LINK_DATA_P);
        return v_object.getField3();
    }

    public static SubLObject rw_link_data_bindings(final SubLObject v_object) {
        assert NIL != inference_worker_rewrite.rewrite_link_data_p(v_object) : "! inference_worker_rewrite.rewrite_link_data_p(v_object) " + "inference_worker_rewrite.rewrite_link_data_p error :" + v_object;
        return v_object.getField3();
    }

    public static final SubLObject rw_link_data_supports_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, REWRITE_LINK_DATA_P);
        return v_object.getField4();
    }

    public static SubLObject rw_link_data_supports(final SubLObject v_object) {
        assert NIL != inference_worker_rewrite.rewrite_link_data_p(v_object) : "! inference_worker_rewrite.rewrite_link_data_p(v_object) " + "inference_worker_rewrite.rewrite_link_data_p error :" + v_object;
        return v_object.getField4();
    }

    public static final SubLObject _csetf_rw_link_data_hl_module_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, REWRITE_LINK_DATA_P);
        return v_object.setField2(value);
    }

    public static SubLObject _csetf_rw_link_data_hl_module(final SubLObject v_object, final SubLObject value) {
        assert NIL != inference_worker_rewrite.rewrite_link_data_p(v_object) : "! inference_worker_rewrite.rewrite_link_data_p(v_object) " + "inference_worker_rewrite.rewrite_link_data_p error :" + v_object;
        return v_object.setField2(value);
    }

    public static final SubLObject _csetf_rw_link_data_bindings_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, REWRITE_LINK_DATA_P);
        return v_object.setField3(value);
    }

    public static SubLObject _csetf_rw_link_data_bindings(final SubLObject v_object, final SubLObject value) {
        assert NIL != inference_worker_rewrite.rewrite_link_data_p(v_object) : "! inference_worker_rewrite.rewrite_link_data_p(v_object) " + "inference_worker_rewrite.rewrite_link_data_p error :" + v_object;
        return v_object.setField3(value);
    }

    public static final SubLObject _csetf_rw_link_data_supports_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, REWRITE_LINK_DATA_P);
        return v_object.setField4(value);
    }

    public static SubLObject _csetf_rw_link_data_supports(final SubLObject v_object, final SubLObject value) {
        assert NIL != inference_worker_rewrite.rewrite_link_data_p(v_object) : "! inference_worker_rewrite.rewrite_link_data_p(v_object) " + "inference_worker_rewrite.rewrite_link_data_p error :" + v_object;
        return v_object.setField4(value);
    }

    public static final SubLObject make_rewrite_link_data_alt(SubLObject arglist) {
        if (arglist == UNPROVIDED) {
            arglist = NIL;
        }
        {
            SubLObject v_new = new com.cyc.cycjava.cycl.inference.harness.inference_worker_rewrite.$rewrite_link_data_native();
            SubLObject next = NIL;
            for (next = arglist; NIL != next; next = cddr(next)) {
                {
                    SubLObject current_arg = next.first();
                    SubLObject current_value = cadr(next);
                    SubLObject pcase_var = current_arg;
                    if (pcase_var.eql($HL_MODULE)) {
                        com.cyc.cycjava.cycl.inference.harness.inference_worker_rewrite._csetf_rw_link_data_hl_module(v_new, current_value);
                    } else {
                        if (pcase_var.eql($BINDINGS)) {
                            com.cyc.cycjava.cycl.inference.harness.inference_worker_rewrite._csetf_rw_link_data_bindings(v_new, current_value);
                        } else {
                            if (pcase_var.eql($SUPPORTS)) {
                                com.cyc.cycjava.cycl.inference.harness.inference_worker_rewrite._csetf_rw_link_data_supports(v_new, current_value);
                            } else {
                                Errors.error($str_alt17$Invalid_slot__S_for_construction_, current_arg);
                            }
                        }
                    }
                }
            }
            return v_new;
        }
    }

    public static SubLObject make_rewrite_link_data(SubLObject arglist) {
        if (arglist == UNPROVIDED) {
            arglist = NIL;
        }
        final SubLObject v_new = new com.cyc.cycjava.cycl.inference.harness.inference_worker_rewrite.$rewrite_link_data_native();
        SubLObject next;
        SubLObject current_arg;
        SubLObject current_value;
        SubLObject pcase_var;
        for (next = NIL, next = arglist; NIL != next; next = cddr(next)) {
            current_arg = next.first();
            current_value = cadr(next);
            pcase_var = current_arg;
            if (pcase_var.eql($HL_MODULE)) {
                inference_worker_rewrite._csetf_rw_link_data_hl_module(v_new, current_value);
            } else
                if (pcase_var.eql($BINDINGS)) {
                    inference_worker_rewrite._csetf_rw_link_data_bindings(v_new, current_value);
                } else
                    if (pcase_var.eql($SUPPORTS)) {
                        inference_worker_rewrite._csetf_rw_link_data_supports(v_new, current_value);
                    } else {
                        Errors.error(inference_worker_rewrite.$str18$Invalid_slot__S_for_construction_, current_arg);
                    }


        }
        return v_new;
    }

    public static SubLObject visit_defstruct_rewrite_link_data(final SubLObject obj, final SubLObject visitor_fn) {
        funcall(visitor_fn, obj, $BEGIN, inference_worker_rewrite.MAKE_REWRITE_LINK_DATA, THREE_INTEGER);
        funcall(visitor_fn, obj, $SLOT, $HL_MODULE, inference_worker_rewrite.rw_link_data_hl_module(obj));
        funcall(visitor_fn, obj, $SLOT, $BINDINGS, inference_worker_rewrite.rw_link_data_bindings(obj));
        funcall(visitor_fn, obj, $SLOT, $SUPPORTS, inference_worker_rewrite.rw_link_data_supports(obj));
        funcall(visitor_fn, obj, $END, inference_worker_rewrite.MAKE_REWRITE_LINK_DATA, THREE_INTEGER);
        return obj;
    }

    public static SubLObject visit_defstruct_object_rewrite_link_data_method(final SubLObject obj, final SubLObject visitor_fn) {
        return inference_worker_rewrite.visit_defstruct_rewrite_link_data(obj, visitor_fn);
    }

    /**
     *
     *
     * @return rewrite-link-p
     */
    @LispMethod(comment = "@return rewrite-link-p")
    public static final SubLObject new_rewrite_link_alt(SubLObject supported_problem, SubLObject supporting_mapped_problem, SubLObject hl_module, SubLObject supports) {
        SubLTrampolineFile.checkType(supported_problem, PROBLEM_P);
        if (NIL != supporting_mapped_problem) {
            SubLTrampolineFile.checkType(supporting_mapped_problem, MAPPED_PROBLEM_P);
        }
        SubLTrampolineFile.checkType(hl_module, HL_MODULE_P);
        {
            SubLObject rewrite_link = com.cyc.cycjava.cycl.inference.harness.inference_worker_rewrite.new_rewrite_link_int(supported_problem, hl_module, supports);
            if (NIL != supporting_mapped_problem) {
                inference_datastructures_problem_link.connect_supporting_mapped_problem_with_dependent_link(supporting_mapped_problem, rewrite_link);
            }
            inference_datastructures_problem_link.problem_link_open_all(rewrite_link);
            inference_worker.propagate_problem_link(rewrite_link);
            return rewrite_link;
        }
    }

    /**
     *
     *
     * @return rewrite-link-p
     */
    @LispMethod(comment = "@return rewrite-link-p")
    public static SubLObject new_rewrite_link(final SubLObject supported_problem, final SubLObject supporting_mapped_problem, final SubLObject hl_module, final SubLObject supports) {
        assert NIL != inference_datastructures_problem.problem_p(supported_problem) : "! inference_datastructures_problem.problem_p(supported_problem) " + ("inference_datastructures_problem.problem_p(supported_problem) " + "CommonSymbols.NIL != inference_datastructures_problem.problem_p(supported_problem) ") + supported_problem;
        if (((NIL != supporting_mapped_problem) && (!SubLTrampolineFile.assertionsDisabledInClass)) && (NIL == inference_datastructures_problem_link.mapped_problem_p(supporting_mapped_problem))) {
            throw new AssertionError(supporting_mapped_problem);
        }
        assert NIL != inference_modules.hl_module_p(hl_module) : "! inference_modules.hl_module_p(hl_module) " + ("inference_modules.hl_module_p(hl_module) " + "CommonSymbols.NIL != inference_modules.hl_module_p(hl_module) ") + hl_module;
        final SubLObject rewrite_link = inference_worker_rewrite.new_rewrite_link_int(supported_problem, hl_module, supports);
        if (NIL != supporting_mapped_problem) {
            inference_datastructures_problem_link.connect_supporting_mapped_problem_with_dependent_link(supporting_mapped_problem, rewrite_link);
        }
        inference_datastructures_problem_link.problem_link_open_all(rewrite_link);
        inference_worker.propagate_problem_link(rewrite_link);
        return rewrite_link;
    }

    /**
     * Returns a new :rewrite link
     * with its data properties set to HL-MODULE, BINDINGS, and SUPPORTS,
     * with a supported problem of PROBLEM, and no supporting problems yet.
     */
    @LispMethod(comment = "Returns a new :rewrite link\r\nwith its data properties set to HL-MODULE, BINDINGS, and SUPPORTS,\r\nwith a supported problem of PROBLEM, and no supporting problems yet.\nReturns a new :rewrite link\nwith its data properties set to HL-MODULE, BINDINGS, and SUPPORTS,\nwith a supported problem of PROBLEM, and no supporting problems yet.")
    public static final SubLObject new_rewrite_link_int_alt(SubLObject problem, SubLObject hl_module, SubLObject supports) {
        {
            SubLObject rewrite_link = inference_datastructures_problem_link.new_problem_link($REWRITE, problem);
            com.cyc.cycjava.cycl.inference.harness.inference_worker_rewrite.new_rewrite_link_data(rewrite_link);
            com.cyc.cycjava.cycl.inference.harness.inference_worker_rewrite.set_rewrite_link_hl_module(rewrite_link, hl_module);
            com.cyc.cycjava.cycl.inference.harness.inference_worker_rewrite.set_rewrite_link_bindings(rewrite_link, $UNDETERMINED);
            com.cyc.cycjava.cycl.inference.harness.inference_worker_rewrite.set_rewrite_link_supports(rewrite_link, supports);
            return rewrite_link;
        }
    }

    /**
     * Returns a new :rewrite link
     * with its data properties set to HL-MODULE, BINDINGS, and SUPPORTS,
     * with a supported problem of PROBLEM, and no supporting problems yet.
     */
    @LispMethod(comment = "Returns a new :rewrite link\r\nwith its data properties set to HL-MODULE, BINDINGS, and SUPPORTS,\r\nwith a supported problem of PROBLEM, and no supporting problems yet.\nReturns a new :rewrite link\nwith its data properties set to HL-MODULE, BINDINGS, and SUPPORTS,\nwith a supported problem of PROBLEM, and no supporting problems yet.")
    public static SubLObject new_rewrite_link_int(final SubLObject problem, final SubLObject hl_module, final SubLObject supports) {
        final SubLObject rewrite_link = inference_datastructures_problem_link.new_problem_link($REWRITE, problem);
        inference_worker_rewrite.new_rewrite_link_data(rewrite_link);
        inference_worker_rewrite.set_rewrite_link_hl_module(rewrite_link, hl_module);
        inference_worker_rewrite.set_rewrite_link_bindings(rewrite_link, $UNDETERMINED);
        inference_worker_rewrite.set_rewrite_link_supports(rewrite_link, supports);
        return rewrite_link;
    }

    public static final SubLObject new_rewrite_link_data_alt(SubLObject rewrite_link) {
        {
            SubLObject data = com.cyc.cycjava.cycl.inference.harness.inference_worker_rewrite.make_rewrite_link_data(UNPROVIDED);
            inference_datastructures_problem_link.set_problem_link_data(rewrite_link, data);
        }
        return rewrite_link;
    }

    public static SubLObject new_rewrite_link_data(final SubLObject rewrite_link) {
        final SubLObject data = inference_worker_rewrite.make_rewrite_link_data(UNPROVIDED);
        inference_datastructures_problem_link.set_problem_link_data(rewrite_link, data);
        return rewrite_link;
    }

    public static final SubLObject destroy_rewrite_link_alt(SubLObject rewrite_link) {
        {
            SubLObject data = inference_datastructures_problem_link.problem_link_data(rewrite_link);
            com.cyc.cycjava.cycl.inference.harness.inference_worker_rewrite._csetf_rw_link_data_hl_module(data, $FREE);
            com.cyc.cycjava.cycl.inference.harness.inference_worker_rewrite._csetf_rw_link_data_bindings(data, $FREE);
            com.cyc.cycjava.cycl.inference.harness.inference_worker_rewrite._csetf_rw_link_data_supports(data, $FREE);
        }
        return rewrite_link;
    }

    public static SubLObject destroy_rewrite_link(final SubLObject rewrite_link) {
        final SubLObject data = inference_datastructures_problem_link.problem_link_data(rewrite_link);
        inference_worker_rewrite._csetf_rw_link_data_hl_module(data, $FREE);
        inference_worker_rewrite._csetf_rw_link_data_bindings(data, $FREE);
        inference_worker_rewrite._csetf_rw_link_data_supports(data, $FREE);
        return rewrite_link;
    }

    public static final SubLObject rewrite_link_hl_module_alt(SubLObject rewrite_link) {
        SubLTrampolineFile.checkType(rewrite_link, REWRITE_LINK_P);
        {
            SubLObject data = inference_datastructures_problem_link.problem_link_data(rewrite_link);
            return com.cyc.cycjava.cycl.inference.harness.inference_worker_rewrite.rw_link_data_hl_module(data);
        }
    }

    public static SubLObject rewrite_link_hl_module(final SubLObject rewrite_link) {
        assert NIL != inference_worker_rewrite.rewrite_link_p(rewrite_link) : "! inference_worker_rewrite.rewrite_link_p(rewrite_link) " + ("inference_worker_rewrite.rewrite_link_p(rewrite_link) " + "CommonSymbols.NIL != inference_worker_rewrite.rewrite_link_p(rewrite_link) ") + rewrite_link;
        final SubLObject data = inference_datastructures_problem_link.problem_link_data(rewrite_link);
        return inference_worker_rewrite.rw_link_data_hl_module(data);
    }

    /**
     * The first elements of these bindings are in the space of REWRITE-LINK's
     * supported problem, and their second elements are in the space of
     * REWRITE-LINK's unique supporting problem.
     */
    @LispMethod(comment = "The first elements of these bindings are in the space of REWRITE-LINK\'s\r\nsupported problem, and their second elements are in the space of\r\nREWRITE-LINK\'s unique supporting problem.\nThe first elements of these bindings are in the space of REWRITE-LINK\'s\nsupported problem, and their second elements are in the space of\nREWRITE-LINK\'s unique supporting problem.")
    public static final SubLObject rewrite_link_bindings_alt(SubLObject rewrite_link) {
        SubLTrampolineFile.checkType(rewrite_link, REWRITE_LINK_P);
        {
            SubLObject data = inference_datastructures_problem_link.problem_link_data(rewrite_link);
            SubLObject v_bindings = com.cyc.cycjava.cycl.inference.harness.inference_worker_rewrite.rw_link_data_bindings(data);
            if (v_bindings == $UNDETERMINED) {
                v_bindings = com.cyc.cycjava.cycl.inference.harness.inference_worker_rewrite.compute_rewrite_bindings(rewrite_link);
                com.cyc.cycjava.cycl.inference.harness.inference_worker_rewrite._csetf_rw_link_data_bindings(data, v_bindings);
            }
            return v_bindings;
        }
    }

    /**
     * The first elements of these bindings are in the space of REWRITE-LINK's
     * supported problem, and their second elements are in the space of
     * REWRITE-LINK's unique supporting problem.
     */
    @LispMethod(comment = "The first elements of these bindings are in the space of REWRITE-LINK\'s\r\nsupported problem, and their second elements are in the space of\r\nREWRITE-LINK\'s unique supporting problem.\nThe first elements of these bindings are in the space of REWRITE-LINK\'s\nsupported problem, and their second elements are in the space of\nREWRITE-LINK\'s unique supporting problem.")
    public static SubLObject rewrite_link_bindings(final SubLObject rewrite_link) {
        assert NIL != inference_worker_rewrite.rewrite_link_p(rewrite_link) : "! inference_worker_rewrite.rewrite_link_p(rewrite_link) " + ("inference_worker_rewrite.rewrite_link_p(rewrite_link) " + "CommonSymbols.NIL != inference_worker_rewrite.rewrite_link_p(rewrite_link) ") + rewrite_link;
        final SubLObject data = inference_datastructures_problem_link.problem_link_data(rewrite_link);
        SubLObject v_bindings = inference_worker_rewrite.rw_link_data_bindings(data);
        if (v_bindings == $UNDETERMINED) {
            v_bindings = inference_worker_rewrite.compute_rewrite_bindings(rewrite_link);
            inference_worker_rewrite._csetf_rw_link_data_bindings(data, v_bindings);
        }
        return v_bindings;
    }

    public static final SubLObject rewrite_link_supports_alt(SubLObject rewrite_link) {
        SubLTrampolineFile.checkType(rewrite_link, REWRITE_LINK_P);
        {
            SubLObject data = inference_datastructures_problem_link.problem_link_data(rewrite_link);
            return com.cyc.cycjava.cycl.inference.harness.inference_worker_rewrite.rw_link_data_supports(data);
        }
    }

    public static SubLObject rewrite_link_supports(final SubLObject rewrite_link) {
        assert NIL != inference_worker_rewrite.rewrite_link_p(rewrite_link) : "! inference_worker_rewrite.rewrite_link_p(rewrite_link) " + ("inference_worker_rewrite.rewrite_link_p(rewrite_link) " + "CommonSymbols.NIL != inference_worker_rewrite.rewrite_link_p(rewrite_link) ") + rewrite_link;
        final SubLObject data = inference_datastructures_problem_link.problem_link_data(rewrite_link);
        return inference_worker_rewrite.rw_link_data_supports(data);
    }

    public static final SubLObject set_rewrite_link_hl_module_alt(SubLObject rewrite_link, SubLObject hl_module) {
        SubLTrampolineFile.checkType(rewrite_link, REWRITE_LINK_P);
        SubLTrampolineFile.checkType(hl_module, HL_MODULE_P);
        {
            SubLObject data = inference_datastructures_problem_link.problem_link_data(rewrite_link);
            com.cyc.cycjava.cycl.inference.harness.inference_worker_rewrite._csetf_rw_link_data_hl_module(data, hl_module);
        }
        return rewrite_link;
    }

    public static SubLObject set_rewrite_link_hl_module(final SubLObject rewrite_link, final SubLObject hl_module) {
        assert NIL != inference_worker_rewrite.rewrite_link_p(rewrite_link) : "! inference_worker_rewrite.rewrite_link_p(rewrite_link) " + ("inference_worker_rewrite.rewrite_link_p(rewrite_link) " + "CommonSymbols.NIL != inference_worker_rewrite.rewrite_link_p(rewrite_link) ") + rewrite_link;
        assert NIL != inference_modules.hl_module_p(hl_module) : "! inference_modules.hl_module_p(hl_module) " + ("inference_modules.hl_module_p(hl_module) " + "CommonSymbols.NIL != inference_modules.hl_module_p(hl_module) ") + hl_module;
        final SubLObject data = inference_datastructures_problem_link.problem_link_data(rewrite_link);
        inference_worker_rewrite._csetf_rw_link_data_hl_module(data, hl_module);
        return rewrite_link;
    }

    public static final SubLObject set_rewrite_link_bindings_alt(SubLObject rewrite_link, SubLObject v_bindings) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            SubLTrampolineFile.checkType(rewrite_link, REWRITE_LINK_P);
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                if (!((NIL != bindings.binding_list_p(v_bindings)) || (v_bindings == $UNDETERMINED))) {
                    Errors.error($str_alt25$Bindings__a_are_not_valid_rewrite, v_bindings);
                }
            }
            {
                SubLObject data = inference_datastructures_problem_link.problem_link_data(rewrite_link);
                com.cyc.cycjava.cycl.inference.harness.inference_worker_rewrite._csetf_rw_link_data_bindings(data, v_bindings);
            }
            return rewrite_link;
        }
    }

    public static SubLObject set_rewrite_link_bindings(final SubLObject rewrite_link, final SubLObject v_bindings) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != inference_worker_rewrite.rewrite_link_p(rewrite_link) : "! inference_worker_rewrite.rewrite_link_p(rewrite_link) " + ("inference_worker_rewrite.rewrite_link_p(rewrite_link) " + "CommonSymbols.NIL != inference_worker_rewrite.rewrite_link_p(rewrite_link) ") + rewrite_link;
        if (((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (NIL == binding_list_p(v_bindings))) && (v_bindings != $UNDETERMINED)) {
            Errors.error(inference_worker_rewrite.$str31$Bindings__a_are_not_valid_rewrite, v_bindings);
        }
        final SubLObject data = inference_datastructures_problem_link.problem_link_data(rewrite_link);
        inference_worker_rewrite._csetf_rw_link_data_bindings(data, v_bindings);
        return rewrite_link;
    }

    public static final SubLObject set_rewrite_link_supports_alt(SubLObject rewrite_link, SubLObject supports) {
        SubLTrampolineFile.checkType(rewrite_link, REWRITE_LINK_P);
        SubLTrampolineFile.checkType(supports, HL_JUSTIFICATION_P);
        {
            SubLObject data = inference_datastructures_problem_link.problem_link_data(rewrite_link);
            com.cyc.cycjava.cycl.inference.harness.inference_worker_rewrite._csetf_rw_link_data_supports(data, supports);
        }
        return rewrite_link;
    }

    public static SubLObject set_rewrite_link_supports(final SubLObject rewrite_link, final SubLObject supports) {
        assert NIL != inference_worker_rewrite.rewrite_link_p(rewrite_link) : "! inference_worker_rewrite.rewrite_link_p(rewrite_link) " + ("inference_worker_rewrite.rewrite_link_p(rewrite_link) " + "CommonSymbols.NIL != inference_worker_rewrite.rewrite_link_p(rewrite_link) ") + rewrite_link;
        assert NIL != arguments.hl_justification_p(supports) : "! arguments.hl_justification_p(supports) " + ("arguments.hl_justification_p(supports) " + "CommonSymbols.NIL != arguments.hl_justification_p(supports) ") + supports;
        final SubLObject data = inference_datastructures_problem_link.problem_link_data(rewrite_link);
        inference_worker_rewrite._csetf_rw_link_data_supports(data, supports);
        return rewrite_link;
    }

    public static final SubLObject rewrite_link_tactic_alt(SubLObject rewrite_link) {
        {
            SubLObject problem = inference_datastructures_problem_link.problem_link_supported_problem(rewrite_link);
            SubLObject hl_module = com.cyc.cycjava.cycl.inference.harness.inference_worker_rewrite.rewrite_link_hl_module(rewrite_link);
            SubLObject cdolist_list_var = inference_datastructures_problem.problem_tactics(problem);
            SubLObject candidate_tactic = NIL;
            for (candidate_tactic = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , candidate_tactic = cdolist_list_var.first()) {
                if (NIL != inference_datastructures_problem.do_problem_tactics_type_match(candidate_tactic, $REWRITE)) {
                    if (hl_module == inference_datastructures_tactic.tactic_hl_module(candidate_tactic)) {
                        return candidate_tactic;
                    }
                }
            }
            if (NIL == inference_datastructures_problem.tactically_unexamined_problem_p(problem)) {
                return Errors.error($str_alt27$No_tactic_found_for__S, rewrite_link);
            }
        }
        return NIL;
    }

    public static SubLObject rewrite_link_tactic(final SubLObject rewrite_link) {
        final SubLObject problem = inference_datastructures_problem_link.problem_link_supported_problem(rewrite_link);
        final SubLObject hl_module = inference_worker_rewrite.rewrite_link_hl_module(rewrite_link);
        SubLObject cdolist_list_var = inference_datastructures_problem.problem_tactics(problem);
        SubLObject candidate_tactic = NIL;
        candidate_tactic = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if ((NIL != inference_datastructures_problem.do_problem_tactics_type_match(candidate_tactic, $REWRITE)) && hl_module.eql(inference_datastructures_tactic.tactic_hl_module(candidate_tactic))) {
                return candidate_tactic;
            }
            cdolist_list_var = cdolist_list_var.rest();
            candidate_tactic = cdolist_list_var.first();
        } 
        if (NIL == inference_datastructures_problem.tactically_unexamined_problem_p(problem)) {
            return Errors.error(inference_worker_rewrite.$str33$No_tactic_found_for__S, rewrite_link);
        }
        return NIL;
    }

    /**
     *
     *
     * @return nil or mapped-problem-p
     */
    @LispMethod(comment = "@return nil or mapped-problem-p")
    public static final SubLObject rewrite_link_supporting_mapped_problem_alt(SubLObject rewrite_link) {
        return inference_datastructures_problem_link.problem_link_first_supporting_mapped_problem(rewrite_link);
    }

    /**
     *
     *
     * @return nil or mapped-problem-p
     */
    @LispMethod(comment = "@return nil or mapped-problem-p")
    public static SubLObject rewrite_link_supporting_mapped_problem(final SubLObject rewrite_link) {
        return inference_datastructures_problem_link.problem_link_first_supporting_mapped_problem(rewrite_link);
    }

    /**
     *
     *
     * @return variable-map-p
     */
    @LispMethod(comment = "@return variable-map-p")
    public static final SubLObject rewrite_link_supporting_variable_map_alt(SubLObject rewrite_link) {
        {
            SubLObject supporting_mapped_problem = com.cyc.cycjava.cycl.inference.harness.inference_worker_rewrite.rewrite_link_supporting_mapped_problem(rewrite_link);
            if (NIL != supporting_mapped_problem) {
                return inference_datastructures_problem_link.mapped_problem_variable_map(supporting_mapped_problem);
            } else {
                return NIL;
            }
        }
    }

    /**
     *
     *
     * @return variable-map-p
     */
    @LispMethod(comment = "@return variable-map-p")
    public static SubLObject rewrite_link_supporting_variable_map(final SubLObject rewrite_link) {
        final SubLObject supporting_mapped_problem = inference_worker_rewrite.rewrite_link_supporting_mapped_problem(rewrite_link);
        if (NIL != supporting_mapped_problem) {
            return inference_datastructures_problem_link.mapped_problem_variable_map(supporting_mapped_problem);
        }
        return NIL;
    }

    public static final SubLObject rewrite_link_rewrite_mt_alt(SubLObject rewrite_link) {
        {
            SubLObject problem = inference_datastructures_problem_link.problem_link_supported_problem(rewrite_link);
            return inference_datastructures_problem.single_literal_problem_mt(problem);
        }
    }

    public static SubLObject rewrite_link_rewrite_mt(final SubLObject rewrite_link) {
        final SubLObject problem = inference_datastructures_problem_link.problem_link_supported_problem(rewrite_link);
        return inference_datastructures_problem.single_literal_problem_mt(problem);
    }

    public static final SubLObject rewrite_link_p_alt(SubLObject v_object) {
        return makeBoolean((NIL != inference_datastructures_problem_link.problem_link_p(v_object)) && ($REWRITE == inference_datastructures_problem_link.problem_link_type(v_object)));
    }

    public static SubLObject rewrite_link_p(final SubLObject v_object) {
        return makeBoolean((NIL != inference_datastructures_problem_link.problem_link_p(v_object)) && ($REWRITE == inference_datastructures_problem_link.problem_link_type(v_object)));
    }

    public static final SubLObject rewrite_tactic_p_alt(SubLObject tactic) {
        return makeBoolean((NIL != inference_datastructures_tactic.tactic_p(tactic)) && ($REWRITE == inference_datastructures_tactic.tactic_type(tactic)));
    }

    public static SubLObject rewrite_tactic_p(final SubLObject tactic) {
        return makeBoolean((NIL != inference_datastructures_tactic.tactic_p(tactic)) && ($REWRITE == inference_datastructures_tactic.tactic_type(tactic)));
    }

    /**
     *
     *
     * @return hl-support-p; The rewriting rule for the module of TACTIC.
     */
    @LispMethod(comment = "@return hl-support-p; The rewriting rule for the module of TACTIC.")
    public static final SubLObject rewrite_tactic_support_alt(SubLObject tactic) {
        return rewrite_module_support(inference_datastructures_tactic.tactic_hl_module(tactic));
    }

    /**
     *
     *
     * @return hl-support-p; The rewriting rule for the module of TACTIC.
     */
    @LispMethod(comment = "@return hl-support-p; The rewriting rule for the module of TACTIC.")
    public static SubLObject rewrite_tactic_support(final SubLObject tactic) {
        return inference_modules.rewrite_module_support(inference_datastructures_tactic.tactic_hl_module(tactic));
    }

    public static final SubLObject rewrite_proof_p_alt(SubLObject v_object) {
        return makeBoolean((NIL != inference_datastructures_proof.proof_p(v_object)) && (NIL != com.cyc.cycjava.cycl.inference.harness.inference_worker_rewrite.rewrite_link_p(inference_datastructures_proof.proof_link(v_object))));
    }

    public static SubLObject rewrite_proof_p(final SubLObject v_object) {
        return makeBoolean((NIL != inference_datastructures_proof.proof_p(v_object)) && (NIL != inference_worker_rewrite.rewrite_link_p(inference_datastructures_proof.proof_link(v_object))));
    }

    public static final SubLObject determine_new_literal_rewrite_tactics_alt(SubLObject problem, SubLObject asent, SubLObject sense, SubLObject disabled_hl_modules) {
        if (disabled_hl_modules == UNPROVIDED) {
            disabled_hl_modules = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject tactic_specs = NIL;
                SubLObject supplanted_hl_modules = NIL;
                SubLObject exclusive_foundP = NIL;
                SubLObject rest = NIL;
                for (rest = rewrite_modules(); !((NIL != exclusive_foundP) || (NIL == rest)); rest = rest.rest()) {
                    {
                        SubLObject hl_module = rest.first();
                        if (NIL != hl_module_activeP(hl_module, disabled_hl_modules)) {
                            if (!((NIL != supplanted_hl_modules) && (NIL != member(hl_module, supplanted_hl_modules, UNPROVIDED, UNPROVIDED)))) {
                                if ((NIL != hl_module_sense_relevant_p(hl_module, sense)) && (NIL != inference_worker_removal.hl_module_applicable_to_asentP(hl_module, asent))) {
                                    {
                                        SubLObject exclusive_func = hl_module_exclusive_func(hl_module);
                                        if ((NIL == exclusive_func) || (exclusive_func.isFunctionSpec() && (NIL != funcall(exclusive_func, asent)))) {
                                            if (NIL != exclusive_func) {
                                                thread.resetMultipleValues();
                                                {
                                                    SubLObject exclusive_foundP_1 = inference_worker_removal.update_supplanted_modules_wrt_tactic_specs(hl_module, tactic_specs, supplanted_hl_modules);
                                                    SubLObject tactic_specs_2 = thread.secondMultipleValue();
                                                    SubLObject supplanted_hl_modules_3 = thread.thirdMultipleValue();
                                                    thread.resetMultipleValues();
                                                    exclusive_foundP = exclusive_foundP_1;
                                                    tactic_specs = tactic_specs_2;
                                                    supplanted_hl_modules = supplanted_hl_modules_3;
                                                }
                                            }
                                            {
                                                SubLObject required_func = hl_module_required_func(hl_module);
                                                if ((NIL == required_func) || (required_func.isFunctionSpec() && (NIL != funcall(required_func, asent)))) {
                                                    {
                                                        SubLObject cost = hl_module_asent_cost(hl_module, asent);
                                                        if (NIL != cost) {
                                                            {
                                                                SubLObject productivity = inference_datastructures_enumerated_types.productivity_for_number_of_children(cost);
                                                                SubLObject completeness = hl_module_completeness(hl_module, asent, $COMPLETE);
                                                                SubLObject tactic_spec = list(hl_module, productivity, completeness);
                                                                tactic_specs = cons(tactic_spec, tactic_specs);
                                                                com.cyc.cycjava.cycl.inference.harness.inference_worker_rewrite.new_rewrite_tactic(problem, hl_module, productivity, completeness);
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                return tactic_specs;
            }
        }
    }

    public static SubLObject determine_new_literal_rewrite_tactics(final SubLObject problem, final SubLObject asent, final SubLObject sense, SubLObject disabled_hl_modules) {
        if (disabled_hl_modules == UNPROVIDED) {
            disabled_hl_modules = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject tactic_specs = NIL;
        SubLObject supplanted_hl_modules = NIL;
        SubLObject exclusive_foundP;
        SubLObject rest;
        SubLObject hl_module;
        SubLObject exclusive_func;
        SubLObject exclusive_foundP_$1;
        SubLObject tactic_specs_$2;
        SubLObject supplanted_hl_modules_$3;
        SubLObject required_func;
        SubLObject cost;
        SubLObject productivity;
        SubLObject completeness;
        SubLObject tactic_spec;
        for (exclusive_foundP = NIL, rest = NIL, rest = inference_modules.rewrite_modules(); (NIL == exclusive_foundP) && (NIL != rest); rest = rest.rest()) {
            hl_module = rest.first();
            if ((((NIL != inference_modules.hl_module_activeP(hl_module, disabled_hl_modules)) && ((NIL == supplanted_hl_modules) || (NIL == member(hl_module, supplanted_hl_modules, UNPROVIDED, UNPROVIDED)))) && (NIL != inference_modules.hl_module_sense_relevant_p(hl_module, sense))) && (NIL != inference_worker_removal.hl_module_applicable_to_asentP(hl_module, asent))) {
                exclusive_func = inference_modules.hl_module_exclusive_func(hl_module);
                if ((NIL == exclusive_func) || (exclusive_func.isFunctionSpec() && (NIL != funcall(exclusive_func, asent)))) {
                    if (NIL != exclusive_func) {
                        thread.resetMultipleValues();
                        exclusive_foundP_$1 = inference_worker_removal.update_supplanted_modules_wrt_tactic_specs(hl_module, tactic_specs, supplanted_hl_modules);
                        tactic_specs_$2 = thread.secondMultipleValue();
                        supplanted_hl_modules_$3 = thread.thirdMultipleValue();
                        thread.resetMultipleValues();
                        exclusive_foundP = exclusive_foundP_$1;
                        tactic_specs = tactic_specs_$2;
                        supplanted_hl_modules = supplanted_hl_modules_$3;
                    }
                    required_func = inference_modules.hl_module_required_func(hl_module);
                    if ((NIL == required_func) || (required_func.isFunctionSpec() && (NIL != funcall(required_func, asent)))) {
                        cost = inference_modules.hl_module_asent_cost(hl_module, asent);
                        if (NIL != cost) {
                            productivity = inference_datastructures_enumerated_types.productivity_for_number_of_children(cost);
                            completeness = inference_modules.hl_module_completeness(hl_module, asent, $COMPLETE);
                            tactic_spec = list(hl_module, productivity, completeness);
                            tactic_specs = cons(tactic_spec, tactic_specs);
                            inference_worker_rewrite.new_rewrite_tactic(problem, hl_module, productivity, completeness);
                        }
                    }
                }
            }
        }
        return tactic_specs;
    }

    public static final SubLObject literal_level_rewrite_tactic_p_alt(SubLObject tactic) {
        return makeBoolean((NIL != com.cyc.cycjava.cycl.inference.harness.inference_worker_rewrite.rewrite_tactic_p(tactic)) && (NIL != inference_worker.literal_level_tactic_p(tactic)));
    }

    public static SubLObject literal_level_rewrite_tactic_p(final SubLObject tactic) {
        return makeBoolean((NIL != inference_worker_rewrite.rewrite_tactic_p(tactic)) && (NIL != inference_worker.literal_level_tactic_p(tactic)));
    }

    /**
     *
     *
     * @return nil or rewrite-link-p
    Creates a new rewrite link iff it would be interesting to do so.
     */
    @LispMethod(comment = "@return nil or rewrite-link-p\r\nCreates a new rewrite link iff it would be interesting to do so.")
    public static final SubLObject maybe_new_rewrite_link_alt(SubLObject supported_problem, SubLObject supporting_mapped_problem, SubLObject tactic, SubLObject supports) {
        {
            SubLObject hl_module = inference_datastructures_tactic.tactic_hl_module(tactic);
            SubLObject rewrite_link = com.cyc.cycjava.cycl.inference.harness.inference_worker_rewrite.new_rewrite_link(supported_problem, supporting_mapped_problem, hl_module, supports);
            inference_datastructures_strategy.set_problem_tactics_recompute_thrown_away_wrt_all_relevant_strategies_and_all_motivations(inference_datastructures_problem_link.mapped_problem_problem(supporting_mapped_problem));
            return rewrite_link;
        }
    }

    /**
     *
     *
     * @return nil or rewrite-link-p
    Creates a new rewrite link iff it would be interesting to do so.
     */
    @LispMethod(comment = "@return nil or rewrite-link-p\r\nCreates a new rewrite link iff it would be interesting to do so.")
    public static SubLObject maybe_new_rewrite_link(final SubLObject supported_problem, final SubLObject supporting_mapped_problem, final SubLObject tactic, final SubLObject supports) {
        final SubLObject hl_module = inference_datastructures_tactic.tactic_hl_module(tactic);
        final SubLObject rewrite_link = inference_worker_rewrite.new_rewrite_link(supported_problem, supporting_mapped_problem, hl_module, supports);
        inference_datastructures_strategy.set_problem_tactics_recompute_thrown_away_wrt_all_relevant_strategies(inference_datastructures_problem_link.mapped_problem_problem(supporting_mapped_problem));
        return rewrite_link;
    }

    public static final SubLObject new_rewrite_tactic_alt(SubLObject problem, SubLObject module, SubLObject productivity, SubLObject completeness) {
        {
            SubLObject tactic = inference_datastructures_tactic.new_tactic(problem, module, UNPROVIDED);
            inference_datastructures_tactic.set_tactic_productivity(tactic, productivity, UNPROVIDED);
            inference_datastructures_tactic.set_tactic_completeness(tactic, completeness);
            {
                SubLObject prob = problem;
                SubLObject store = inference_datastructures_problem.problem_store(prob);
                SubLObject idx = inference_datastructures_problem_store.problem_store_inference_id_index(store);
                if (NIL == do_id_index_empty_p(idx, $SKIP)) {
                    {
                        SubLObject id = do_id_index_next_id(idx, NIL, NIL, NIL);
                        SubLObject state_var = do_id_index_next_state(idx, NIL, id, NIL);
                        SubLObject inference = NIL;
                        while (NIL != id) {
                            inference = do_id_index_state_object(idx, $SKIP, id, state_var);
                            if (NIL != do_id_index_id_and_object_validP(id, inference, $SKIP)) {
                                if (NIL != inference_datastructures_problem.problem_relevant_to_inferenceP(prob, inference)) {
                                    {
                                        SubLObject inference_var = inference;
                                        SubLObject set_contents_var = set.do_set_internal(inference_datastructures_inference.inference_strategy_set(inference_var));
                                        SubLObject basis_object = set_contents.do_set_contents_basis_object(set_contents_var);
                                        SubLObject state = NIL;
                                        for (state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
                                            {
                                                SubLObject strategy = set_contents.do_set_contents_next(basis_object, state);
                                                if (NIL != set_contents.do_set_contents_element_validP(state, strategy)) {
                                                    inference_tactician.strategy_note_new_tactic(strategy, tactic);
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                            id = do_id_index_next_id(idx, NIL, id, state_var);
                            state_var = do_id_index_next_state(idx, NIL, id, state_var);
                        } 
                    }
                }
            }
            return tactic;
        }
    }

    public static SubLObject new_rewrite_tactic(final SubLObject problem, final SubLObject module, final SubLObject productivity, final SubLObject completeness) {
        final SubLObject tactic = inference_datastructures_tactic.new_tactic(problem, module, UNPROVIDED);
        inference_datastructures_tactic.set_tactic_productivity(tactic, productivity, UNPROVIDED);
        inference_datastructures_tactic.set_tactic_completeness(tactic, completeness);
        final SubLObject store = inference_datastructures_problem.problem_store(problem);
        final SubLObject idx = inference_datastructures_problem_store.problem_store_inference_id_index(store);
        if (NIL == id_index_objects_empty_p(idx, $SKIP)) {
            final SubLObject idx_$4 = idx;
            if (NIL == id_index_dense_objects_empty_p(idx_$4, $SKIP)) {
                final SubLObject vector_var = id_index_dense_objects(idx_$4);
                final SubLObject backwardP_var = NIL;
                SubLObject length;
                SubLObject v_iteration;
                SubLObject id;
                SubLObject inference;
                SubLObject inference_var;
                SubLObject set_var;
                SubLObject set_contents_var;
                SubLObject basis_object;
                SubLObject state;
                SubLObject strategy;
                for (length = length(vector_var), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = add(v_iteration, ONE_INTEGER)) {
                    id = (NIL != backwardP_var) ? subtract(length, v_iteration, ONE_INTEGER) : v_iteration;
                    inference = aref(vector_var, id);
                    if ((NIL == id_index_tombstone_p(inference)) || (NIL == id_index_skip_tombstones_p($SKIP))) {
                        if (NIL != id_index_tombstone_p(inference)) {
                            inference = $SKIP;
                        }
                        if (NIL != inference_datastructures_problem.problem_relevant_to_inferenceP(problem, inference)) {
                            inference_var = inference;
                            set_var = inference_datastructures_inference.inference_strategy_set(inference_var);
                            set_contents_var = do_set_internal(set_var);
                            for (basis_object = do_set_contents_basis_object(set_contents_var), state = NIL, state = do_set_contents_initial_state(basis_object, set_contents_var); NIL == do_set_contents_doneP(basis_object, state); state = do_set_contents_update_state(state)) {
                                strategy = do_set_contents_next(basis_object, state);
                                if (NIL != do_set_contents_element_validP(state, strategy)) {
                                    inference_tactician.strategy_note_new_tactic(strategy, tactic);
                                }
                            }
                        }
                    }
                }
            }
            final SubLObject idx_$5 = idx;
            if (NIL == id_index_sparse_objects_empty_p(idx_$5)) {
                final SubLObject cdohash_table = id_index_sparse_objects(idx_$5);
                SubLObject id2 = NIL;
                SubLObject inference2 = NIL;
                final Iterator cdohash_iterator = getEntrySetIterator(cdohash_table);
                try {
                    while (iteratorHasNext(cdohash_iterator)) {
                        final Map.Entry cdohash_entry = iteratorNextEntry(cdohash_iterator);
                        id2 = getEntryKey(cdohash_entry);
                        inference2 = getEntryValue(cdohash_entry);
                        if (NIL != inference_datastructures_problem.problem_relevant_to_inferenceP(problem, inference2)) {
                            final SubLObject inference_var2 = inference2;
                            final SubLObject set_var2 = inference_datastructures_inference.inference_strategy_set(inference_var2);
                            final SubLObject set_contents_var2 = do_set_internal(set_var2);
                            SubLObject basis_object2;
                            SubLObject state2;
                            SubLObject strategy2;
                            for (basis_object2 = do_set_contents_basis_object(set_contents_var2), state2 = NIL, state2 = do_set_contents_initial_state(basis_object2, set_contents_var2); NIL == do_set_contents_doneP(basis_object2, state2); state2 = do_set_contents_update_state(state2)) {
                                strategy2 = do_set_contents_next(basis_object2, state2);
                                if (NIL != do_set_contents_element_validP(state2, strategy2)) {
                                    inference_tactician.strategy_note_new_tactic(strategy2, tactic);
                                }
                            }
                        }
                    } 
                } finally {
                    releaseEntrySetIterator(cdohash_iterator);
                }
            }
        }
        return tactic;
    }

    public static final SubLObject compute_strategic_properties_of_rewrite_tactic_alt(SubLObject tactic, SubLObject strategy) {
        return tactic;
    }

    public static SubLObject compute_strategic_properties_of_rewrite_tactic(final SubLObject tactic, final SubLObject strategy) {
        return tactic;
    }

    /**
     *
     *
     * @return hlmt-p;  The current context for the rewrite tactic. Used by rewrite modules.
     */
    @LispMethod(comment = "@return hlmt-p;  The current context for the rewrite tactic. Used by rewrite modules.")
    public static final SubLObject current_rewrite_mt_alt() {
        return inference_datastructures_problem.single_literal_problem_mt(inference_worker.currently_active_problem());
    }

    /**
     *
     *
     * @return hlmt-p;  The current context for the rewrite tactic. Used by rewrite modules.
     */
    @LispMethod(comment = "@return hlmt-p;  The current context for the rewrite tactic. Used by rewrite modules.")
    public static SubLObject current_rewrite_mt() {
        return inference_datastructures_problem.single_literal_problem_mt(inference_worker.currently_active_problem());
    }

    public static final SubLObject execute_literal_level_rewrite_tactic_alt(SubLObject tactic, SubLObject mt, SubLObject asent) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(mt);
                {
                    SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
                    SubLObject _prev_bind_1 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                    SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
                    SubLObject _prev_bind_3 = $negation_by_failure$.currentBinding(thread);
                    try {
                        mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
                        mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
                        mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
                        $negation_by_failure$.bind(inference_datastructures_problem_store.problem_store_negation_by_failureP(inference_datastructures_tactic.tactic_store(tactic)), thread);
                        {
                            SubLObject hl_module = inference_datastructures_tactic.tactic_hl_module(tactic);
                            SubLObject pattern = hl_module_expand_pattern(hl_module);
                            if (NIL != pattern) {
                                formula_pattern_match.pattern_transform_formula(pattern, asent, UNPROVIDED);
                            } else {
                                {
                                    SubLObject function = hl_module_expand_func(hl_module);
                                    if (function.isFunctionSpec()) {
                                        funcall(function, asent);
                                    }
                                }
                            }
                        }
                    } finally {
                        $negation_by_failure$.rebind(_prev_bind_3, thread);
                        mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_2, thread);
                        mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_1, thread);
                        mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
                    }
                }
            }
            return tactic;
        }
    }

    public static SubLObject execute_literal_level_rewrite_tactic(final SubLObject tactic, final SubLObject mt, final SubLObject asent) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject mt_var = with_inference_mt_relevance_validate(mt);
        final SubLObject _prev_bind_0 = $mt$.currentBinding(thread);
        final SubLObject _prev_bind_2 = $relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_3 = $relevant_mts$.currentBinding(thread);
        final SubLObject _prev_bind_4 = $negation_by_failure$.currentBinding(thread);
        try {
            $mt$.bind(update_inference_mt_relevance_mt(mt_var), thread);
            $relevant_mt_function$.bind(update_inference_mt_relevance_function(mt_var), thread);
            $relevant_mts$.bind(update_inference_mt_relevance_mt_list(mt_var), thread);
            $negation_by_failure$.bind(inference_datastructures_problem_store.problem_store_negation_by_failureP(inference_datastructures_tactic.tactic_store(tactic)), thread);
            final SubLObject hl_module = inference_datastructures_tactic.tactic_hl_module(tactic);
            final SubLObject pattern = inference_modules.hl_module_expand_pattern(hl_module);
            if (NIL != pattern) {
                pattern_transform_formula(pattern, asent, UNPROVIDED);
            } else {
                final SubLObject function = inference_modules.hl_module_expand_func(hl_module);
                if (function.isFunctionSpec()) {
                    funcall(function, asent);
                }
            }
        } finally {
            $negation_by_failure$.rebind(_prev_bind_4, thread);
            $relevant_mts$.rebind(_prev_bind_3, thread);
            $relevant_mt_function$.rebind(_prev_bind_2, thread);
            $mt$.rebind(_prev_bind_0, thread);
        }
        return tactic;
    }

    /**
     *
     *
     * @return nil or rewrite-link-p
     * @param QUERY
     * 		problem-query-p is the supporting problem's query.
     */
    @LispMethod(comment = "@return nil or rewrite-link-p\r\n@param QUERY\r\n\t\tproblem-query-p is the supporting problem\'s query.")
    public static final SubLObject rewrite_add_link_alt(SubLObject query, SubLObject supports) {
        SubLTrampolineFile.checkType(query, PROBLEM_QUERY_P);
        SubLTrampolineFile.checkType(supports, HL_JUSTIFICATION_P);
        {
            SubLObject tactic = inference_worker.currently_executing_tactic();
            SubLObject rewrite_support = com.cyc.cycjava.cycl.inference.harness.inference_worker_rewrite.rewrite_tactic_support(tactic);
            SubLObject supported_problem = inference_datastructures_tactic.tactic_problem(tactic);
            SubLObject store = inference_datastructures_problem.problem_store(supported_problem);
            SubLObject supporting_mapped_problem = inference_worker.find_or_create_problem(store, query, UNPROVIDED);
            SubLObject all_supports = (NIL != rewrite_support) ? ((SubLObject) (cons(rewrite_support, supports))) : supports;
            return com.cyc.cycjava.cycl.inference.harness.inference_worker_rewrite.maybe_new_rewrite_link(supported_problem, supporting_mapped_problem, tactic, all_supports);
        }
    }

    /**
     *
     *
     * @return nil or rewrite-link-p
     * @param QUERY
     * 		problem-query-p is the supporting problem's query.
     */
    @LispMethod(comment = "@return nil or rewrite-link-p\r\n@param QUERY\r\n\t\tproblem-query-p is the supporting problem\'s query.")
    public static SubLObject rewrite_add_link(final SubLObject query, final SubLObject supports) {
        assert NIL != inference_datastructures_problem_query.problem_query_p(query) : "! inference_datastructures_problem_query.problem_query_p(query) " + ("inference_datastructures_problem_query.problem_query_p(query) " + "CommonSymbols.NIL != inference_datastructures_problem_query.problem_query_p(query) ") + query;
        assert NIL != arguments.hl_justification_p(supports) : "! arguments.hl_justification_p(supports) " + ("arguments.hl_justification_p(supports) " + "CommonSymbols.NIL != arguments.hl_justification_p(supports) ") + supports;
        final SubLObject tactic = inference_worker.currently_executing_tactic();
        final SubLObject rewrite_support = inference_worker_rewrite.rewrite_tactic_support(tactic);
        final SubLObject supported_problem = inference_datastructures_tactic.tactic_problem(tactic);
        final SubLObject store = inference_datastructures_problem.problem_store(supported_problem);
        final SubLObject free_hl_vars = inference_datastructures_problem.problem_free_hl_vars(supported_problem);
        final SubLObject supporting_mapped_problem = inference_worker.find_or_create_problem(store, query, free_hl_vars, UNPROVIDED);
        final SubLObject all_supports = (NIL != rewrite_support) ? cons(rewrite_support, supports) : supports;
        return inference_worker_rewrite.maybe_new_rewrite_link(supported_problem, supporting_mapped_problem, tactic, all_supports);
    }

    public static final SubLObject compute_rewrite_bindings_alt(SubLObject rewrite_link) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject rewrite_support = com.cyc.cycjava.cycl.inference.harness.inference_worker_rewrite.rewrite_tactic_support(com.cyc.cycjava.cycl.inference.harness.inference_worker_rewrite.rewrite_link_tactic(rewrite_link));
                SubLObject asent = inference_datastructures_problem.single_literal_problem_atomic_sentence(inference_datastructures_problem_link.problem_link_supported_problem(rewrite_link));
                SubLObject rule_cnf = (NIL != assertions_high.rule_assertionP(rewrite_support)) ? ((SubLObject) (assertions_high.assertion_cnf(rewrite_support))) : czer_main.canonicalize_cycl(support_sentence(rewrite_support), UNPROVIDED);
                SubLObject rule_variable_map = (NIL != assertions_high.rule_assertionP(rewrite_support)) ? ((SubLObject) (inference_worker_transformation.rule_assertion_variable_map(rewrite_support))) : com.cyc.cycjava.cycl.inference.harness.inference_worker_rewrite.identity_variable_map_for_sentence(support_sentence(rewrite_support));
                SubLObject poslits = clauses.pos_lits(rule_cnf);
                SubLObject neglits = clauses.neg_lits(rule_cnf);
                SubLObject consequent = poslits.first();
                SubLObject supported_problem_bindings = NIL;
                thread.resetMultipleValues();
                {
                    SubLObject v_bindings = unification.unify(asent, consequent, UNPROVIDED, UNPROVIDED);
                    SubLObject justification = thread.secondMultipleValue();
                    thread.resetMultipleValues();
                    supported_problem_bindings = inference_worker_transformation.unification_bindings_to_transformation_bindings(v_bindings);
                }
                return supported_problem_bindings;
            }
        }
    }

    public static SubLObject compute_rewrite_bindings(final SubLObject rewrite_link) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject rewrite_support = inference_worker_rewrite.rewrite_tactic_support(inference_worker_rewrite.rewrite_link_tactic(rewrite_link));
        final SubLObject asent = inference_datastructures_problem.single_literal_problem_atomic_sentence(inference_datastructures_problem_link.problem_link_supported_problem(rewrite_link));
        final SubLObject rule_cnf = (NIL != rule_assertionP(rewrite_support)) ? assertion_cnf(rewrite_support) : canonicalize_cycl(arguments.support_sentence(rewrite_support), UNPROVIDED);
        final SubLObject rule_variable_map = (NIL != rule_assertionP(rewrite_support)) ? inference_worker_transformation.rule_assertion_variable_map(rewrite_support) : inference_worker_rewrite.identity_variable_map_for_sentence(arguments.support_sentence(rewrite_support));
        final SubLObject poslits = pos_lits(rule_cnf);
        final SubLObject neglits = neg_lits(rule_cnf);
        final SubLObject consequent = poslits.first();
        SubLObject supported_problem_bindings = NIL;
        thread.resetMultipleValues();
        final SubLObject v_bindings = unify(asent, consequent, UNPROVIDED, UNPROVIDED);
        final SubLObject justification = thread.secondMultipleValue();
        thread.resetMultipleValues();
        supported_problem_bindings = inference_worker_transformation.unification_bindings_to_transformation_bindings(v_bindings);
        return supported_problem_bindings;
    }

    public static final SubLObject identity_variable_map_for_sentence_alt(SubLObject sentence) {
        return NIL;
    }

    public static SubLObject identity_variable_map_for_sentence(final SubLObject sentence) {
        return NIL;
    }

    /**
     *
     *
     * @return nil or rewrite-link-p
     * @param QUERY
     * 		problem-query-p is the supporting problem's query.
     */
    @LispMethod(comment = "@return nil or rewrite-link-p\r\n@param QUERY\r\n\t\tproblem-query-p is the supporting problem\'s query.")
    public static final SubLObject restriction_rewrite_add_link_alt(SubLObject query, SubLObject supports) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            SubLTrampolineFile.checkType(query, PROBLEM_QUERY_P);
            SubLTrampolineFile.checkType(supports, HL_JUSTIFICATION_P);
            {
                SubLObject tactic = inference_worker.currently_executing_tactic();
                SubLObject supported_problem = inference_datastructures_tactic.tactic_problem(tactic);
                SubLObject supported_query = inference_datastructures_problem.problem_query(supported_problem);
                SubLObject supported_asent = single_literal_problem_query_atomic_sentence(supported_query);
                SubLObject supporting_asent = single_literal_problem_query_atomic_sentence(query);
                thread.resetMultipleValues();
                {
                    SubLObject restriction_bindings = unification.unify(supporting_asent, supported_asent, T, UNPROVIDED);
                    SubLObject justification = thread.secondMultipleValue();
                    thread.resetMultipleValues();
                    {
                        SubLObject store = inference_datastructures_problem.problem_store(supported_problem);
                        SubLObject supporting_mapped_problem = inference_worker.find_or_create_problem(store, query, UNPROVIDED);
                        SubLObject link = inference_worker_restriction.maybe_new_restriction_link(supported_problem, supporting_mapped_problem, restriction_bindings, T, UNPROVIDED);
                        if (NIL != link) {
                            inference_worker_restriction.add_restriction_link_listener(link, tactic);
                        }
                        return supporting_mapped_problem;
                    }
                }
            }
        }
    }

    /**
     *
     *
     * @return nil or rewrite-link-p
     * @param QUERY
     * 		problem-query-p is the supporting problem's query.
     */
    @LispMethod(comment = "@return nil or rewrite-link-p\r\n@param QUERY\r\n\t\tproblem-query-p is the supporting problem\'s query.")
    public static SubLObject restriction_rewrite_add_link(final SubLObject query, final SubLObject supports) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != inference_datastructures_problem_query.problem_query_p(query) : "! inference_datastructures_problem_query.problem_query_p(query) " + ("inference_datastructures_problem_query.problem_query_p(query) " + "CommonSymbols.NIL != inference_datastructures_problem_query.problem_query_p(query) ") + query;
        assert NIL != arguments.hl_justification_p(supports) : "! arguments.hl_justification_p(supports) " + ("arguments.hl_justification_p(supports) " + "CommonSymbols.NIL != arguments.hl_justification_p(supports) ") + supports;
        final SubLObject tactic = inference_worker.currently_executing_tactic();
        final SubLObject supported_problem = inference_datastructures_tactic.tactic_problem(tactic);
        final SubLObject supported_query = inference_datastructures_problem.problem_query(supported_problem);
        final SubLObject supported_query_free_hl_vars = inference_datastructures_problem.problem_free_hl_vars(supported_problem);
        final SubLObject supported_asent = inference_datastructures_problem_query.single_literal_problem_query_atomic_sentence(supported_query);
        final SubLObject supporting_asent = inference_datastructures_problem_query.single_literal_problem_query_atomic_sentence(query);
        thread.resetMultipleValues();
        final SubLObject restriction_bindings = unify(supporting_asent, supported_asent, T, UNPROVIDED);
        final SubLObject justification = thread.secondMultipleValue();
        thread.resetMultipleValues();
        final SubLObject store = inference_datastructures_problem.problem_store(supported_problem);
        final SubLObject free_hl_vars = variables.sort_hl_variable_list_memoized(list_utilities.fast_set_difference(supported_query_free_hl_vars, bindings_variables(restriction_bindings), UNPROVIDED));
        final SubLObject supporting_mapped_problem = inference_worker.find_or_create_problem(store, query, free_hl_vars, UNPROVIDED);
        final SubLObject link = inference_worker_restriction.maybe_new_restriction_link(supported_problem, supporting_mapped_problem, restriction_bindings, T, UNPROVIDED);
        if (NIL != link) {
            inference_worker_restriction.add_restriction_link_listener(link, tactic);
        }
        return supporting_mapped_problem;
    }

    public static final SubLObject trigger_restriction_link_listeners_alt(SubLObject link, SubLObject proof) {
        if (NIL != inference_worker_restriction.restriction_listening_link_p(link)) {
            {
                SubLObject unrestricted_problem = inference_datastructures_problem_link.problem_link_supported_problem(link);
                SubLObject restricted_mapped_problem = inference_worker_restriction.restriction_link_supporting_mapped_problem(link);
                SubLObject restricted_problem = inference_datastructures_problem_link.mapped_problem_problem(restricted_mapped_problem);
                SubLObject restricted_asent = inference_datastructures_problem.single_literal_problem_atomic_sentence(restricted_problem);
                SubLObject cdolist_list_var = inference_worker_restriction.restriction_link_listeners(link);
                SubLObject tactic = NIL;
                for (tactic = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , tactic = cdolist_list_var.first()) {
                    {
                        SubLObject hl_module = inference_datastructures_tactic.tactic_hl_module(tactic);
                        SubLObject rewrite_closure_fn = rewrite_module_closure(hl_module);
                        SubLObject rewritten_closure = funcall(rewrite_closure_fn, restricted_asent);
                        SubLObject cdolist_list_var_4 = rewritten_closure;
                        SubLObject asent_and_supports = NIL;
                        for (asent_and_supports = cdolist_list_var_4.first(); NIL != cdolist_list_var_4; cdolist_list_var_4 = cdolist_list_var_4.rest() , asent_and_supports = cdolist_list_var_4.first()) {
                            {
                                SubLObject datum = asent_and_supports;
                                SubLObject current = datum;
                                SubLObject asent = NIL;
                                SubLObject supports = NIL;
                                destructuring_bind_must_consp(current, datum, $list_alt31);
                                asent = current.first();
                                current = current.rest();
                                destructuring_bind_must_consp(current, datum, $list_alt31);
                                supports = current.first();
                                current = current.rest();
                                if (NIL == current) {
                                    com.cyc.cycjava.cycl.inference.harness.inference_worker_rewrite.maybe_add_restriction_rewrite_problem(asent, hl_module, tactic, unrestricted_problem, restricted_mapped_problem, supports);
                                } else {
                                    cdestructuring_bind_error(datum, $list_alt31);
                                }
                            }
                        }
                    }
                }
            }
        }
        return NIL;
    }

    public static SubLObject trigger_restriction_link_listeners(final SubLObject link, final SubLObject proof) {
        if (NIL != inference_worker_restriction.restriction_listening_link_p(link)) {
            final SubLObject unrestricted_problem = inference_datastructures_problem_link.problem_link_supported_problem(link);
            final SubLObject restricted_mapped_problem = inference_worker_restriction.restriction_link_supporting_mapped_problem(link);
            final SubLObject restricted_problem = inference_datastructures_problem_link.mapped_problem_problem(restricted_mapped_problem);
            final SubLObject restricted_asent = inference_datastructures_problem.single_literal_problem_atomic_sentence(restricted_problem);
            SubLObject cdolist_list_var = inference_worker_restriction.restriction_link_listeners(link);
            SubLObject tactic = NIL;
            tactic = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                final SubLObject hl_module = inference_datastructures_tactic.tactic_hl_module(tactic);
                final SubLObject rewrite_closure_fn = inference_modules.rewrite_module_closure(hl_module);
                SubLObject cdolist_list_var_$6;
                final SubLObject rewritten_closure = cdolist_list_var_$6 = funcall(rewrite_closure_fn, restricted_asent);
                SubLObject asent_and_supports = NIL;
                asent_and_supports = cdolist_list_var_$6.first();
                while (NIL != cdolist_list_var_$6) {
                    SubLObject current;
                    final SubLObject datum = current = asent_and_supports;
                    SubLObject asent = NIL;
                    SubLObject supports = NIL;
                    destructuring_bind_must_consp(current, datum, inference_worker_rewrite.$list37);
                    asent = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, inference_worker_rewrite.$list37);
                    supports = current.first();
                    current = current.rest();
                    if (NIL == current) {
                        inference_worker_rewrite.maybe_add_restriction_rewrite_problem(asent, hl_module, tactic, unrestricted_problem, restricted_mapped_problem, supports);
                    } else {
                        cdestructuring_bind_error(datum, inference_worker_rewrite.$list37);
                    }
                    cdolist_list_var_$6 = cdolist_list_var_$6.rest();
                    asent_and_supports = cdolist_list_var_$6.first();
                } 
                cdolist_list_var = cdolist_list_var.rest();
                tactic = cdolist_list_var.first();
            } 
        }
        return NIL;
    }

    public static final SubLObject maybe_add_restriction_rewrite_problem_alt(SubLObject rewritten_asent, SubLObject rewrite_module, SubLObject rewrite_tactic, SubLObject unrestricted_problem, SubLObject restricted_mapped_problem, SubLObject supports) {
        {
            SubLObject unrestricted_asent = inference_datastructures_problem.single_literal_problem_atomic_sentence(unrestricted_problem);
            SubLObject restricted_problem = inference_datastructures_problem_link.mapped_problem_problem(restricted_mapped_problem);
            SubLObject mt = inference_datastructures_problem.single_literal_problem_mt(restricted_problem);
            SubLObject sense = inference_datastructures_problem.single_literal_problem_sense(restricted_problem);
            SubLObject query = asent_sense_and_mt_to_problem_query(rewritten_asent, sense, mt);
            SubLObject store = inference_datastructures_problem.problem_store(restricted_problem);
            SubLObject mapped_problem = inference_worker.find_or_create_problem(store, query, UNPROVIDED);
            SubLObject problem = inference_datastructures_problem_link.mapped_problem_problem(mapped_problem);
            if (NIL == com.cyc.cycjava.cycl.inference.harness.inference_worker_rewrite.structurally_redundant_restriction_rewrite_problemP(problem, rewrite_module)) {
                {
                    SubLObject find_problem_var_map = inference_datastructures_problem_link.mapped_problem_variable_map(mapped_problem);
                    SubLObject restricting_var_map = inference_datastructures_problem_link.mapped_problem_variable_map(restricted_mapped_problem);
                    SubLObject new_restriction_var_map = bindings.compose_bindings(find_problem_var_map, restricting_var_map);
                    SubLObject new_mapped_problem = inference_datastructures_problem_link.new_mapped_problem(problem, new_restriction_var_map);
                    SubLObject new_restriction_bindings = unification_utilities.rewrite_asent_unify(unrestricted_asent, rewritten_asent);
                    SubLObject rewrite_support = rewrite_module_support(rewrite_module);
                    SubLObject all_supports = (NIL != rewrite_support) ? ((SubLObject) (cons(rewrite_support, supports))) : supports;
                    inference_worker_restriction.maybe_new_restriction_link(unrestricted_problem, new_mapped_problem, new_restriction_bindings, UNPROVIDED, UNPROVIDED);
                    com.cyc.cycjava.cycl.inference.harness.inference_worker_rewrite.maybe_new_rewrite_link(problem, restricted_mapped_problem, rewrite_tactic, all_supports);
                }
            }
        }
        return NIL;
    }

    public static SubLObject maybe_add_restriction_rewrite_problem(final SubLObject rewritten_asent, final SubLObject rewrite_module, final SubLObject rewrite_tactic, final SubLObject unrestricted_problem, final SubLObject restricted_mapped_problem, final SubLObject supports) {
        final SubLObject unrestricted_asent = inference_datastructures_problem.single_literal_problem_atomic_sentence(unrestricted_problem);
        final SubLObject restricted_problem = inference_datastructures_problem_link.mapped_problem_problem(restricted_mapped_problem);
        final SubLObject mt = inference_datastructures_problem.single_literal_problem_mt(restricted_problem);
        final SubLObject sense = inference_datastructures_problem.single_literal_problem_sense(restricted_problem);
        final SubLObject query = inference_datastructures_problem_query.asent_sense_and_mt_to_problem_query(rewritten_asent, sense, mt);
        final SubLObject store = inference_datastructures_problem.problem_store(restricted_problem);
        final SubLObject mapped_problem = inference_worker.find_or_create_problem(store, query, NIL, UNPROVIDED);
        final SubLObject problem = inference_datastructures_problem_link.mapped_problem_problem(mapped_problem);
        if (NIL == inference_worker_rewrite.structurally_redundant_restriction_rewrite_problemP(problem, rewrite_module)) {
            final SubLObject find_problem_var_map = inference_datastructures_problem_link.mapped_problem_variable_map(mapped_problem);
            final SubLObject restricting_var_map = inference_datastructures_problem_link.mapped_problem_variable_map(restricted_mapped_problem);
            final SubLObject new_restriction_var_map = compose_bindings(find_problem_var_map, restricting_var_map);
            final SubLObject new_mapped_problem = inference_datastructures_problem_link.new_mapped_problem(problem, new_restriction_var_map);
            final SubLObject new_restriction_bindings = rewrite_asent_unify(unrestricted_asent, rewritten_asent);
            final SubLObject rewrite_support = inference_modules.rewrite_module_support(rewrite_module);
            final SubLObject all_supports = (NIL != rewrite_support) ? cons(rewrite_support, supports) : supports;
            inference_worker_restriction.maybe_new_restriction_link(unrestricted_problem, new_mapped_problem, new_restriction_bindings, UNPROVIDED, UNPROVIDED);
            inference_worker_rewrite.maybe_new_rewrite_link(problem, restricted_mapped_problem, rewrite_tactic, all_supports);
        }
        return NIL;
    }

    public static final SubLObject structurally_redundant_restriction_rewrite_problemP_alt(SubLObject problem, SubLObject module) {
        {
            SubLObject set_contents_var = inference_datastructures_problem.problem_argument_links(problem);
            SubLObject basis_object = set_contents.do_set_contents_basis_object(set_contents_var);
            SubLObject state = NIL;
            for (state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
                {
                    SubLObject link = set_contents.do_set_contents_next(basis_object, state);
                    if (NIL != set_contents.do_set_contents_element_validP(state, link)) {
                        if (NIL != inference_datastructures_problem_link.problem_link_has_typeP(link, $REWRITE)) {
                            {
                                SubLObject link_tactic = com.cyc.cycjava.cycl.inference.harness.inference_worker_rewrite.rewrite_link_tactic(link);
                                SubLObject link_module = inference_datastructures_tactic.tactic_hl_module(link_tactic);
                                if (link_module == module) {
                                    return T;
                                }
                            }
                        }
                    }
                }
            }
        }
        return NIL;
    }

    public static SubLObject structurally_redundant_restriction_rewrite_problemP(final SubLObject problem, final SubLObject module) {
        final SubLObject set_contents_var = inference_datastructures_problem.problem_argument_links(problem);
        SubLObject basis_object;
        SubLObject state;
        SubLObject link;
        SubLObject link_tactic;
        SubLObject link_module;
        for (basis_object = do_set_contents_basis_object(set_contents_var), state = NIL, state = do_set_contents_initial_state(basis_object, set_contents_var); NIL == do_set_contents_doneP(basis_object, state); state = do_set_contents_update_state(state)) {
            link = do_set_contents_next(basis_object, state);
            if ((NIL != do_set_contents_element_validP(state, link)) && (NIL != inference_datastructures_problem_link.problem_link_has_typeP(link, $REWRITE))) {
                link_tactic = inference_worker_rewrite.rewrite_link_tactic(link);
                link_module = inference_datastructures_tactic.tactic_hl_module(link_tactic);
                if (link_module.eql(module)) {
                    return T;
                }
            }
        }
        return NIL;
    }

    public static final SubLObject new_rewrite_proof_alt(SubLObject rewrite_link, SubLObject subproof, SubLObject variable_map) {
        SubLTrampolineFile.checkType(rewrite_link, REWRITE_LINK_P);
        if (NIL != subproof) {
            SubLTrampolineFile.checkType(subproof, PROOF_P);
        }
        {
            SubLObject subproofs = (NIL != subproof) ? ((SubLObject) (list(subproof))) : NIL;
            SubLObject supporting_subproof_bindings = (NIL != subproof) ? ((SubLObject) (inference_datastructures_proof.proof_bindings(subproof))) : NIL;
            SubLObject subproof_bindings = bindings.transfer_variable_map_to_bindings_filtered(variable_map, supporting_subproof_bindings);
            SubLObject proof_bindings = inference_worker_transformation.extended_supported_problem_bindings_to_supported_problem_bindings(subproof_bindings);
            SubLObject canonical_proof_bindings = inference_worker.canonicalize_proof_bindings(proof_bindings);
            return inference_worker.propose_new_proof_with_bindings(rewrite_link, canonical_proof_bindings, subproofs);
        }
    }

    public static SubLObject new_rewrite_proof(final SubLObject rewrite_link, final SubLObject subproof, final SubLObject variable_map) {
        assert NIL != inference_worker_rewrite.rewrite_link_p(rewrite_link) : "! inference_worker_rewrite.rewrite_link_p(rewrite_link) " + ("inference_worker_rewrite.rewrite_link_p(rewrite_link) " + "CommonSymbols.NIL != inference_worker_rewrite.rewrite_link_p(rewrite_link) ") + rewrite_link;
        if (((NIL != subproof) && (!SubLTrampolineFile.assertionsDisabledInClass)) && (NIL == inference_datastructures_proof.proof_p(subproof))) {
            throw new AssertionError(subproof);
        }
        final SubLObject subproofs = (NIL != subproof) ? list(subproof) : NIL;
        final SubLObject supporting_subproof_bindings = (NIL != subproof) ? inference_datastructures_proof.proof_bindings(subproof) : NIL;
        final SubLObject subproof_bindings = transfer_variable_map_to_bindings_filtered(variable_map, supporting_subproof_bindings);
        final SubLObject proof_bindings = inference_worker_transformation.extended_supported_problem_bindings_to_supported_problem_bindings(subproof_bindings);
        final SubLObject canonical_proof_bindings = inference_worker.canonicalize_proof_bindings(proof_bindings);
        return inference_worker.propose_new_proof_with_bindings(rewrite_link, canonical_proof_bindings, subproofs);
    }

    public static final SubLObject bubble_up_proof_to_rewrite_link_alt(SubLObject supporting_proof, SubLObject variable_map, SubLObject rewrite_link) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            SubLTrampolineFile.checkType(rewrite_link, PROBLEM_LINK_WITH_SINGLE_SUPPORTING_PROBLEM_P);
            thread.resetMultipleValues();
            {
                SubLObject proof = com.cyc.cycjava.cycl.inference.harness.inference_worker_rewrite.new_rewrite_proof(rewrite_link, supporting_proof, variable_map);
                SubLObject newP = thread.secondMultipleValue();
                thread.resetMultipleValues();
                if (NIL != newP) {
                    inference_worker.bubble_up_proof(proof);
                } else {
                    inference_worker.possibly_note_proof_processed(supporting_proof);
                }
            }
            return NIL;
        }
    }

    public static SubLObject bubble_up_proof_to_rewrite_link(final SubLObject supporting_proof, final SubLObject variable_map, final SubLObject rewrite_link) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != inference_datastructures_problem_link.problem_link_with_single_supporting_problem_p(rewrite_link) : "! inference_datastructures_problem_link.problem_link_with_single_supporting_problem_p(rewrite_link) " + ("inference_datastructures_problem_link.problem_link_with_single_supporting_problem_p(rewrite_link) " + "CommonSymbols.NIL != inference_datastructures_problem_link.problem_link_with_single_supporting_problem_p(rewrite_link) ") + rewrite_link;
        thread.resetMultipleValues();
        final SubLObject proof = inference_worker_rewrite.new_rewrite_proof(rewrite_link, supporting_proof, variable_map);
        final SubLObject newP = thread.secondMultipleValue();
        thread.resetMultipleValues();
        if (NIL != newP) {
            inference_worker.bubble_up_proof(proof);
        } else {
            inference_worker.possibly_note_proof_processed(supporting_proof);
        }
        return NIL;
    }

    public static SubLObject declare_inference_worker_rewrite_file() {
        declareFunction("rewrite_link_data_print_function_trampoline", "REWRITE-LINK-DATA-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        declareFunction("rewrite_link_data_p", "REWRITE-LINK-DATA-P", 1, 0, false);
        new inference_worker_rewrite.$rewrite_link_data_p$UnaryFunction();
        declareFunction("rw_link_data_hl_module", "RW-LINK-DATA-HL-MODULE", 1, 0, false);
        declareFunction("rw_link_data_bindings", "RW-LINK-DATA-BINDINGS", 1, 0, false);
        declareFunction("rw_link_data_supports", "RW-LINK-DATA-SUPPORTS", 1, 0, false);
        declareFunction("_csetf_rw_link_data_hl_module", "_CSETF-RW-LINK-DATA-HL-MODULE", 2, 0, false);
        declareFunction("_csetf_rw_link_data_bindings", "_CSETF-RW-LINK-DATA-BINDINGS", 2, 0, false);
        declareFunction("_csetf_rw_link_data_supports", "_CSETF-RW-LINK-DATA-SUPPORTS", 2, 0, false);
        declareFunction("make_rewrite_link_data", "MAKE-REWRITE-LINK-DATA", 0, 1, false);
        declareFunction("visit_defstruct_rewrite_link_data", "VISIT-DEFSTRUCT-REWRITE-LINK-DATA", 2, 0, false);
        declareFunction("visit_defstruct_object_rewrite_link_data_method", "VISIT-DEFSTRUCT-OBJECT-REWRITE-LINK-DATA-METHOD", 2, 0, false);
        declareFunction("new_rewrite_link", "NEW-REWRITE-LINK", 4, 0, false);
        declareFunction("new_rewrite_link_int", "NEW-REWRITE-LINK-INT", 3, 0, false);
        declareFunction("new_rewrite_link_data", "NEW-REWRITE-LINK-DATA", 1, 0, false);
        declareFunction("destroy_rewrite_link", "DESTROY-REWRITE-LINK", 1, 0, false);
        declareFunction("rewrite_link_hl_module", "REWRITE-LINK-HL-MODULE", 1, 0, false);
        declareFunction("rewrite_link_bindings", "REWRITE-LINK-BINDINGS", 1, 0, false);
        declareFunction("rewrite_link_supports", "REWRITE-LINK-SUPPORTS", 1, 0, false);
        declareFunction("set_rewrite_link_hl_module", "SET-REWRITE-LINK-HL-MODULE", 2, 0, false);
        declareFunction("set_rewrite_link_bindings", "SET-REWRITE-LINK-BINDINGS", 2, 0, false);
        declareFunction("set_rewrite_link_supports", "SET-REWRITE-LINK-SUPPORTS", 2, 0, false);
        declareFunction("rewrite_link_tactic", "REWRITE-LINK-TACTIC", 1, 0, false);
        declareFunction("rewrite_link_supporting_mapped_problem", "REWRITE-LINK-SUPPORTING-MAPPED-PROBLEM", 1, 0, false);
        declareFunction("rewrite_link_supporting_variable_map", "REWRITE-LINK-SUPPORTING-VARIABLE-MAP", 1, 0, false);
        declareFunction("rewrite_link_rewrite_mt", "REWRITE-LINK-REWRITE-MT", 1, 0, false);
        declareFunction("rewrite_link_p", "REWRITE-LINK-P", 1, 0, false);
        declareFunction("rewrite_tactic_p", "REWRITE-TACTIC-P", 1, 0, false);
        declareFunction("rewrite_tactic_support", "REWRITE-TACTIC-SUPPORT", 1, 0, false);
        declareFunction("rewrite_proof_p", "REWRITE-PROOF-P", 1, 0, false);
        declareFunction("determine_new_literal_rewrite_tactics", "DETERMINE-NEW-LITERAL-REWRITE-TACTICS", 3, 1, false);
        declareFunction("literal_level_rewrite_tactic_p", "LITERAL-LEVEL-REWRITE-TACTIC-P", 1, 0, false);
        declareFunction("maybe_new_rewrite_link", "MAYBE-NEW-REWRITE-LINK", 4, 0, false);
        declareFunction("new_rewrite_tactic", "NEW-REWRITE-TACTIC", 4, 0, false);
        declareFunction("compute_strategic_properties_of_rewrite_tactic", "COMPUTE-STRATEGIC-PROPERTIES-OF-REWRITE-TACTIC", 2, 0, false);
        declareFunction("current_rewrite_mt", "CURRENT-REWRITE-MT", 0, 0, false);
        declareFunction("execute_literal_level_rewrite_tactic", "EXECUTE-LITERAL-LEVEL-REWRITE-TACTIC", 3, 0, false);
        declareFunction("rewrite_add_link", "REWRITE-ADD-LINK", 2, 0, false);
        declareFunction("compute_rewrite_bindings", "COMPUTE-REWRITE-BINDINGS", 1, 0, false);
        declareFunction("identity_variable_map_for_sentence", "IDENTITY-VARIABLE-MAP-FOR-SENTENCE", 1, 0, false);
        declareFunction("restriction_rewrite_add_link", "RESTRICTION-REWRITE-ADD-LINK", 2, 0, false);
        declareFunction("trigger_restriction_link_listeners", "TRIGGER-RESTRICTION-LINK-LISTENERS", 2, 0, false);
        declareFunction("maybe_add_restriction_rewrite_problem", "MAYBE-ADD-RESTRICTION-REWRITE-PROBLEM", 6, 0, false);
        declareFunction("structurally_redundant_restriction_rewrite_problemP", "STRUCTURALLY-REDUNDANT-RESTRICTION-REWRITE-PROBLEM?", 2, 0, false);
        declareFunction("new_rewrite_proof", "NEW-REWRITE-PROOF", 3, 0, false);
        declareFunction("bubble_up_proof_to_rewrite_link", "BUBBLE-UP-PROOF-TO-REWRITE-LINK", 3, 0, false);
        return NIL;
    }

    static private final SubLList $list_alt2 = list(makeSymbol("HL-MODULE"), makeSymbol("BINDINGS"), makeSymbol("SUPPORTS"));

    static private final SubLList $list_alt3 = list(makeKeyword("HL-MODULE"), makeKeyword("BINDINGS"), makeKeyword("SUPPORTS"));

    static private final SubLList $list_alt4 = list(makeSymbol("RW-LINK-DATA-HL-MODULE"), makeSymbol("RW-LINK-DATA-BINDINGS"), makeSymbol("RW-LINK-DATA-SUPPORTS"));

    static private final SubLList $list_alt5 = list(makeSymbol("_CSETF-RW-LINK-DATA-HL-MODULE"), makeSymbol("_CSETF-RW-LINK-DATA-BINDINGS"), makeSymbol("_CSETF-RW-LINK-DATA-SUPPORTS"));

    static private final SubLString $str_alt17$Invalid_slot__S_for_construction_ = makeString("Invalid slot ~S for construction function");

    static private final SubLString $str_alt25$Bindings__a_are_not_valid_rewrite = makeString("Bindings ~a are not valid rewrite-link bindings.");

    static private final SubLString $str_alt27$No_tactic_found_for__S = makeString("No tactic found for ~S");

    static private final SubLList $list_alt31 = list(makeSymbol("ASENT"), makeSymbol("SUPPORTS"));

    public static SubLObject init_inference_worker_rewrite_file() {
        defconstant("*DTP-REWRITE-LINK-DATA*", inference_worker_rewrite.REWRITE_LINK_DATA);
        return NIL;
    }

    public static SubLObject setup_inference_worker_rewrite_file() {
        register_method($print_object_method_table$.getGlobalValue(), inference_worker_rewrite.$dtp_rewrite_link_data$.getGlobalValue(), symbol_function(inference_worker_rewrite.REWRITE_LINK_DATA_PRINT_FUNCTION_TRAMPOLINE));
        SubLSpecialOperatorDeclarations.proclaim(inference_worker_rewrite.$list8);
        def_csetf(inference_worker_rewrite.RW_LINK_DATA_HL_MODULE, inference_worker_rewrite._CSETF_RW_LINK_DATA_HL_MODULE);
        def_csetf(inference_worker_rewrite.RW_LINK_DATA_BINDINGS, inference_worker_rewrite._CSETF_RW_LINK_DATA_BINDINGS);
        def_csetf(inference_worker_rewrite.RW_LINK_DATA_SUPPORTS, inference_worker_rewrite._CSETF_RW_LINK_DATA_SUPPORTS);
        identity(inference_worker_rewrite.REWRITE_LINK_DATA);
        register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), inference_worker_rewrite.$dtp_rewrite_link_data$.getGlobalValue(), symbol_function(inference_worker_rewrite.VISIT_DEFSTRUCT_OBJECT_REWRITE_LINK_DATA_METHOD));
        return NIL;
    }

    @Override
    public void declareFunctions() {
        inference_worker_rewrite.declare_inference_worker_rewrite_file();
    }

    @Override
    public void initializeVariables() {
        inference_worker_rewrite.init_inference_worker_rewrite_file();
    }

    @Override
    public void runTopLevelForms() {
        inference_worker_rewrite.setup_inference_worker_rewrite_file();
    }

    static {
    }

    public static final class $rewrite_link_data_native extends SubLStructNative {
        public SubLObject $hl_module;

        public SubLObject $bindings;

        public SubLObject $supports;

        private static final SubLStructDeclNative structDecl;

        public $rewrite_link_data_native() {
            inference_worker_rewrite.$rewrite_link_data_native.this.$hl_module = Lisp.NIL;
            inference_worker_rewrite.$rewrite_link_data_native.this.$bindings = Lisp.NIL;
            inference_worker_rewrite.$rewrite_link_data_native.this.$supports = Lisp.NIL;
        }

        @Override
        public SubLStructDecl getStructDecl() {
            return structDecl;
        }

        @Override
        public SubLObject getField2() {
            return inference_worker_rewrite.$rewrite_link_data_native.this.$hl_module;
        }

        @Override
        public SubLObject getField3() {
            return inference_worker_rewrite.$rewrite_link_data_native.this.$bindings;
        }

        @Override
        public SubLObject getField4() {
            return inference_worker_rewrite.$rewrite_link_data_native.this.$supports;
        }

        @Override
        public SubLObject setField2(final SubLObject value) {
            return inference_worker_rewrite.$rewrite_link_data_native.this.$hl_module = value;
        }

        @Override
        public SubLObject setField3(final SubLObject value) {
            return inference_worker_rewrite.$rewrite_link_data_native.this.$bindings = value;
        }

        @Override
        public SubLObject setField4(final SubLObject value) {
            return inference_worker_rewrite.$rewrite_link_data_native.this.$supports = value;
        }

        static {
            structDecl = makeStructDeclNative(com.cyc.cycjava.cycl.inference.harness.inference_worker_rewrite.$rewrite_link_data_native.class, inference_worker_rewrite.REWRITE_LINK_DATA, inference_worker_rewrite.REWRITE_LINK_DATA_P, inference_worker_rewrite.$list2, inference_worker_rewrite.$list3, new String[]{ "$hl_module", "$bindings", "$supports" }, inference_worker_rewrite.$list4, inference_worker_rewrite.$list5, DEFAULT_STRUCT_PRINT_FUNCTION);
        }
    }

    public static final class $rewrite_link_data_p$UnaryFunction extends UnaryFunction {
        public $rewrite_link_data_p$UnaryFunction() {
            super(extractFunctionNamed("REWRITE-LINK-DATA-P"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1) {
            return inference_worker_rewrite.rewrite_link_data_p(arg1);
        }
    }
}

/**
 * Total time: 434 ms synthetic
 */
