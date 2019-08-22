/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 */
package com.cyc.cycjava.cycl.inference.harness;


import static com.cyc.cycjava.cycl.access_macros.define_obsolete_register;
import static com.cyc.cycjava.cycl.bindings.add_variable_binding;
import static com.cyc.cycjava.cycl.bindings.apply_bindings;
import static com.cyc.cycjava.cycl.bindings.apply_bindings_backwards;
import static com.cyc.cycjava.cycl.bindings.apply_bindings_backwards_to_values;
import static com.cyc.cycjava.cycl.bindings.bindings_values;
import static com.cyc.cycjava.cycl.bindings.compose_bindings_filtered;
import static com.cyc.cycjava.cycl.bindings.invert_bindings;
import static com.cyc.cycjava.cycl.bindings.transfer_variable_map_to_bindings_backwards_filtered;
import static com.cyc.cycjava.cycl.bindings.transfer_variable_map_to_bindings_filtered;
import static com.cyc.cycjava.cycl.bindings.variable_binding_value;
import static com.cyc.cycjava.cycl.inference.harness.inference_worker_join_ordered.join_ordered_link_focal_mapped_problem;
import static com.cyc.cycjava.cycl.inference.harness.inference_worker_join_ordered.join_ordered_link_focal_problem;
import static com.cyc.cycjava.cycl.inference.harness.inference_worker_join_ordered.join_ordered_link_focal_to_supported_variable_map;
import static com.cyc.cycjava.cycl.inference.harness.inference_worker_join_ordered.join_ordered_link_other_mapped_problem;
import static com.cyc.cycjava.cycl.inference.harness.inference_worker_transformation.compute_canonical_transformation_proof_bindings;
import static com.cyc.cycjava.cycl.inference.harness.inference_worker_transformation.compute_transformation_link_rule_bindings;
import static com.cyc.cycjava.cycl.inference.harness.inference_worker_transformation.merge_dnf;
import static com.cyc.cycjava.cycl.inference.harness.inference_worker_transformation.transformation_link_bindings;
import static com.cyc.cycjava.cycl.inference.harness.inference_worker_transformation.transformation_link_rule_assertion;
import static com.cyc.cycjava.cycl.inference.harness.inference_worker_transformation.transformation_link_supporting_mapped_problem;
import static com.cyc.cycjava.cycl.inference.harness.inference_worker_transformation.transformation_link_supporting_problem;
import static com.cyc.cycjava.cycl.inference.harness.inference_worker_transformation.transformation_link_transformation_mt;
import static com.cyc.cycjava.cycl.list_utilities.fast_set_difference;
import static com.cyc.cycjava.cycl.variables.find_variable_by_id;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.append;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.cons;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.nth;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality.eq;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.add;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.length;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.nreverse;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.position;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.symbol_function;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.values;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeBoolean;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeInteger;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeSymbol;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.fourth;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.intersection;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.second;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.third;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.union;
import static com.cyc.tool.subl.util.SubLFiles.declareFunction;
import static com.cyc.tool.subl.util.SubLFiles.deflexical;
import static com.cyc.tool.subl.util.SubLFiles.defvar;

import com.cyc.cycjava.cycl.V12;
import com.cyc.cycjava.cycl.bindings;
import com.cyc.cycjava.cycl.clauses;
import com.cyc.cycjava.cycl.cycl_utilities;
import com.cyc.cycjava.cycl.list_utilities;
import com.cyc.cycjava.cycl.set_contents;
import com.cyc.cycjava.cycl.unification;
import com.cyc.cycjava.cycl.variables;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.util.SubLFiles.LispMethod;
import com.cyc.tool.subl.util.SubLTrampolineFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 * module:      INFERENCE-WORKER-RESIDUAL-TRANSFORMATION
 * source file: /cyc/top/cycl/inference/harness/inference-worker-residual-transformation.lisp
 * created:     2019/07/03 17:37:40
 */
public final class inference_worker_residual_transformation extends SubLTranslatedFile implements V12 {
    public static final SubLFile me = new inference_worker_residual_transformation();

 public static final String myName = "com.cyc.cycjava.cycl.inference.harness.inference_worker_residual_transformation";


    // deflexical
    // Definitions
    /**
     * The test used in the set-contents for the data of residual transformation
     * links
     */
    @LispMethod(comment = "The test used in the set-contents for the data of residual transformation\r\nlinks\ndeflexical\nThe test used in the set-contents for the data of residual transformation\nlinks")
    private static final SubLSymbol $residual_transformation_link_motivating_object_test$ = makeSymbol("*RESIDUAL-TRANSFORMATION-LINK-MOTIVATING-OBJECT-TEST*");

    // defvar
    @LispMethod(comment = "defvar")
    private static final SubLSymbol $residual_transformation_proof_bubbling_triggers_additional_restrictionsP$ = makeSymbol("*RESIDUAL-TRANSFORMATION-PROOF-BUBBLING-TRIGGERS-ADDITIONAL-RESTRICTIONS?*");

    // defvar
    @LispMethod(comment = "defvar")
    private static final SubLSymbol $residual_transformation_proof_bubbling_opens_split_linksP$ = makeSymbol("*RESIDUAL-TRANSFORMATION-PROOF-BUBBLING-OPENS-SPLIT-LINKS?*");

    private static final SubLSymbol JOIN_ORDERED_LINK_P = makeSymbol("JOIN-ORDERED-LINK-P");

    private static final SubLSymbol TRANSFORMATION_LINK_P = makeSymbol("TRANSFORMATION-LINK-P");

    private static final SubLSymbol RESIDUAL_TRANSFORMATION_LINK_P = makeSymbol("RESIDUAL-TRANSFORMATION-LINK-P");

    private static final SubLSymbol $sym7$HL_VAR_ = makeSymbol("HL-VAR?");

    private static final SubLSymbol SINGLE_CLAUSE_PROBLEM_QUERY_P = makeSymbol("SINGLE-CLAUSE-PROBLEM-QUERY-P");

    private static final SubLInteger $int$150 = makeInteger(150);

    private static final SubLSymbol RESIDUAL_TRANSFORMATION_PROOF_P = makeSymbol("RESIDUAL-TRANSFORMATION-PROOF-P");

    private static final SubLSymbol PROBLEM_STORE_PROBLEMATIC_RESIDUAL_TRANSFORMATION_LINKS = makeSymbol("PROBLEM-STORE-PROBLEMATIC-RESIDUAL-TRANSFORMATION-LINKS");

    private static final SubLList $list13 = list(makeSymbol("NULL"));

    private static final SubLSymbol PROBLEM_STORE_PROBLEMATIC_RESIDUAL_TRANSFORMATION_LINK_COUNT = makeSymbol("PROBLEM-STORE-PROBLEMATIC-RESIDUAL-TRANSFORMATION-LINK-COUNT");

    private static final SubLList $list15 = list(makeSymbol("ZERO"));

    public static final SubLObject residual_transformation_link_p_alt(SubLObject v_object) {
        return makeBoolean((NIL != inference_datastructures_problem_link.problem_link_p(v_object)) && ($RESIDUAL_TRANSFORMATION == inference_datastructures_problem_link.problem_link_type(v_object)));
    }

    public static SubLObject residual_transformation_link_p(final SubLObject v_object) {
        return makeBoolean((NIL != inference_datastructures_problem_link.problem_link_p(v_object)) && ($RESIDUAL_TRANSFORMATION == inference_datastructures_problem_link.problem_link_type(v_object)));
    }

    public static final SubLObject find_residual_transformation_link_alt(SubLObject supported_problem, SubLObject supporting_mapped_problem) {
        return inference_datastructures_problem_link.find_problem_link_of_type_between($RESIDUAL_TRANSFORMATION, supported_problem, supporting_mapped_problem);
    }

    public static SubLObject find_residual_transformation_link(final SubLObject supported_problem, final SubLObject supporting_mapped_problem) {
        return inference_datastructures_problem_link.find_problem_link_of_type_between($RESIDUAL_TRANSFORMATION, supported_problem, supporting_mapped_problem);
    }

    public static final SubLObject new_residual_transformation_link_alt(SubLObject supporting_mapped_problem, SubLObject join_ordered_link, SubLObject transformation_link, SubLObject conjunctive_problem_dont_care_variable_map, SubLObject residual_conjunction_literal_map) {
        SubLTrampolineFile.checkType(supporting_mapped_problem, MAPPED_PROBLEM_P);
        SubLTrampolineFile.checkType(join_ordered_link, JOIN_ORDERED_LINK_P);
        SubLTrampolineFile.checkType(transformation_link, TRANSFORMATION_LINK_P);
        {
            SubLObject motivating_conjunction_problem = inference_datastructures_problem_link.problem_link_supported_problem(join_ordered_link);
            SubLObject supporting_problem = inference_datastructures_problem_link.mapped_problem_problem(supporting_mapped_problem);
            SubLObject rt_link = inference_datastructures_problem_link.new_problem_link($RESIDUAL_TRANSFORMATION, motivating_conjunction_problem);
            inference_datastructures_problem_link.connect_supporting_mapped_problem_with_dependent_link(supporting_mapped_problem, rt_link);
            com.cyc.cycjava.cycl.inference.harness.inference_worker_residual_transformation.set_residual_transformation_link_data(rt_link, join_ordered_link, transformation_link, conjunctive_problem_dont_care_variable_map, residual_conjunction_literal_map);
            inference_datastructures_problem_store.add_problem_store_complex_problem(inference_datastructures_problem_link.problem_link_store(rt_link), supporting_problem);
            inference_datastructures_problem_link.problem_link_open_all(rt_link);
            inference_worker.propagate_problem_link(rt_link);
            return rt_link;
        }
    }

    public static SubLObject new_residual_transformation_link(final SubLObject supporting_mapped_problem, final SubLObject join_ordered_link, final SubLObject transformation_link, final SubLObject conjunctive_problem_dont_care_variable_map, final SubLObject residual_conjunction_literal_map) {
        assert NIL != inference_datastructures_problem_link.mapped_problem_p(supporting_mapped_problem) : "! inference_datastructures_problem_link.mapped_problem_p(supporting_mapped_problem) " + ("inference_datastructures_problem_link.mapped_problem_p(supporting_mapped_problem) " + "CommonSymbols.NIL != inference_datastructures_problem_link.mapped_problem_p(supporting_mapped_problem) ") + supporting_mapped_problem;
        assert NIL != inference_worker_join_ordered.join_ordered_link_p(join_ordered_link) : "! inference_worker_join_ordered.join_ordered_link_p(join_ordered_link) " + ("inference_worker_join_ordered.join_ordered_link_p(join_ordered_link) " + "CommonSymbols.NIL != inference_worker_join_ordered.join_ordered_link_p(join_ordered_link) ") + join_ordered_link;
        assert NIL != inference_worker_transformation.transformation_link_p(transformation_link) : "! inference_worker_transformation.transformation_link_p(transformation_link) " + ("inference_worker_transformation.transformation_link_p(transformation_link) " + "CommonSymbols.NIL != inference_worker_transformation.transformation_link_p(transformation_link) ") + transformation_link;
        final SubLObject motivating_conjunction_problem = inference_datastructures_problem_link.problem_link_supported_problem(join_ordered_link);
        final SubLObject supporting_problem = inference_datastructures_problem_link.mapped_problem_problem(supporting_mapped_problem);
        final SubLObject rt_link = inference_datastructures_problem_link.new_problem_link($RESIDUAL_TRANSFORMATION, motivating_conjunction_problem);
        inference_datastructures_problem_link.connect_supporting_mapped_problem_with_dependent_link(supporting_mapped_problem, rt_link);
        set_residual_transformation_link_data(rt_link, join_ordered_link, transformation_link, conjunctive_problem_dont_care_variable_map, residual_conjunction_literal_map);
        inference_datastructures_problem_store.add_problem_store_complex_problem(inference_datastructures_problem_link.problem_link_store(rt_link), supporting_problem);
        inference_datastructures_problem_link.problem_link_open_all(rt_link);
        inference_worker.propagate_problem_link(rt_link);
        return rt_link;
    }

    public static final SubLObject destroy_residual_transformation_link_alt(SubLObject rt_link) {
        return rt_link;
    }

    public static SubLObject destroy_residual_transformation_link(final SubLObject rt_link) {
        return rt_link;
    }

    /**
     * Removes JO-LINK as a motivator for any and all residual transformation links it may have been motivating.
     */
    @LispMethod(comment = "Removes JO-LINK as a motivator for any and all residual transformation links it may have been motivating.")
    public static final SubLObject destroy_join_ordered_link_wrt_residual_transformation_links_alt(SubLObject jo_link) {
        {
            SubLObject jo_link_var = jo_link;
            SubLObject motivating_conjunction_problem = inference_datastructures_problem_link.problem_link_supported_problem(jo_link_var);
            SubLObject set_contents_var = inference_datastructures_problem.problem_argument_links(motivating_conjunction_problem);
            SubLObject basis_object = set_contents.do_set_contents_basis_object(set_contents_var);
            SubLObject state = NIL;
            for (state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
                {
                    SubLObject rt_link = set_contents.do_set_contents_next(basis_object, state);
                    if (NIL != set_contents.do_set_contents_element_validP(state, rt_link)) {
                        if (NIL != inference_datastructures_problem_link.problem_link_has_typeP(rt_link, $RESIDUAL_TRANSFORMATION)) {
                            if (NIL != com.cyc.cycjava.cycl.inference.harness.inference_worker_residual_transformation.residual_transformation_link_motivated_by_join_ordered_linkP(rt_link, jo_link_var)) {
                                inference_datastructures_problem_link.destroy_problem_link(rt_link);
                            }
                        }
                    }
                }
            }
        }
        return jo_link;
    }

    /**
     * Removes JO-LINK as a motivator for any and all residual transformation links it may have been motivating.
     */
    @LispMethod(comment = "Removes JO-LINK as a motivator for any and all residual transformation links it may have been motivating.")
    public static SubLObject destroy_join_ordered_link_wrt_residual_transformation_links(final SubLObject jo_link) {
        final SubLObject motivating_conjunction_problem = inference_datastructures_problem_link.problem_link_supported_problem(jo_link);
        final SubLObject set_contents_var = inference_datastructures_problem.problem_argument_links(motivating_conjunction_problem);
        SubLObject basis_object;
        SubLObject state;
        SubLObject rt_link;
        for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
            rt_link = set_contents.do_set_contents_next(basis_object, state);
            if (((NIL != set_contents.do_set_contents_element_validP(state, rt_link)) && (NIL != inference_datastructures_problem_link.problem_link_has_typeP(rt_link, $RESIDUAL_TRANSFORMATION))) && (NIL != residual_transformation_link_motivated_by_join_ordered_linkP(rt_link, jo_link))) {
                inference_datastructures_problem_link.destroy_problem_link(rt_link);
            }
        }
        return jo_link;
    }

    /**
     * Removes T-LINK as a motivator for any and all residual transformation links it may have been motivating.
     */
    @LispMethod(comment = "Removes T-LINK as a motivator for any and all residual transformation links it may have been motivating.")
    public static final SubLObject destroy_transformation_link_wrt_residual_transformation_links_alt(SubLObject t_link) {
        {
            SubLObject t_link_var = t_link;
            SubLObject supported_problem = inference_datastructures_problem_link.problem_link_supported_problem(t_link_var);
            SubLObject set_contents_var = inference_datastructures_problem.problem_dependent_links(supported_problem);
            SubLObject basis_object = set_contents.do_set_contents_basis_object(set_contents_var);
            SubLObject state = NIL;
            for (state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
                {
                    SubLObject jo_link_var = set_contents.do_set_contents_next(basis_object, state);
                    if (NIL != set_contents.do_set_contents_element_validP(state, jo_link_var)) {
                        if (NIL != inference_datastructures_problem_link.problem_link_has_typeP(jo_link_var, $JOIN_ORDERED)) {
                            {
                                SubLObject jo_link_var_1 = jo_link_var;
                                SubLObject motivating_conjunction_problem = inference_datastructures_problem_link.problem_link_supported_problem(jo_link_var_1);
                                SubLObject set_contents_var_2 = inference_datastructures_problem.problem_argument_links(motivating_conjunction_problem);
                                SubLObject basis_object_3 = set_contents.do_set_contents_basis_object(set_contents_var_2);
                                SubLObject state_4 = NIL;
                                for (state_4 = set_contents.do_set_contents_initial_state(basis_object_3, set_contents_var_2); NIL == set_contents.do_set_contents_doneP(basis_object_3, state_4); state_4 = set_contents.do_set_contents_update_state(state_4)) {
                                    {
                                        SubLObject rt_link = set_contents.do_set_contents_next(basis_object_3, state_4);
                                        if (NIL != set_contents.do_set_contents_element_validP(state_4, rt_link)) {
                                            if (NIL != inference_datastructures_problem_link.problem_link_has_typeP(rt_link, $RESIDUAL_TRANSFORMATION)) {
                                                if (NIL != com.cyc.cycjava.cycl.inference.harness.inference_worker_residual_transformation.residual_transformation_link_motivated_by_join_ordered_linkP(rt_link, jo_link_var_1)) {
                                                    if (NIL != com.cyc.cycjava.cycl.inference.harness.inference_worker_residual_transformation.residual_transformation_link_motivated_by_transformation_linkP(rt_link, t_link_var)) {
                                                        inference_datastructures_problem_link.destroy_problem_link(rt_link);
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
        return t_link;
    }

    /**
     * Removes T-LINK as a motivator for any and all residual transformation links it may have been motivating.
     */
    @LispMethod(comment = "Removes T-LINK as a motivator for any and all residual transformation links it may have been motivating.")
    public static SubLObject destroy_transformation_link_wrt_residual_transformation_links(final SubLObject t_link) {
        final SubLObject supported_problem = inference_datastructures_problem_link.problem_link_supported_problem(t_link);
        final SubLObject set_contents_var = inference_datastructures_problem.problem_dependent_links(supported_problem);
        SubLObject basis_object;
        SubLObject state;
        SubLObject jo_link_var;
        SubLObject jo_link_var_$1;
        SubLObject motivating_conjunction_problem;
        SubLObject set_contents_var_$2;
        SubLObject basis_object_$3;
        SubLObject state_$4;
        SubLObject rt_link;
        for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
            jo_link_var = set_contents.do_set_contents_next(basis_object, state);
            if ((NIL != set_contents.do_set_contents_element_validP(state, jo_link_var)) && (NIL != inference_datastructures_problem_link.problem_link_has_typeP(jo_link_var, $JOIN_ORDERED))) {
                jo_link_var_$1 = jo_link_var;
                motivating_conjunction_problem = inference_datastructures_problem_link.problem_link_supported_problem(jo_link_var_$1);
                set_contents_var_$2 = inference_datastructures_problem.problem_argument_links(motivating_conjunction_problem);
                for (basis_object_$3 = set_contents.do_set_contents_basis_object(set_contents_var_$2), state_$4 = NIL, state_$4 = set_contents.do_set_contents_initial_state(basis_object_$3, set_contents_var_$2); NIL == set_contents.do_set_contents_doneP(basis_object_$3, state_$4); state_$4 = set_contents.do_set_contents_update_state(state_$4)) {
                    rt_link = set_contents.do_set_contents_next(basis_object_$3, state_$4);
                    if ((((NIL != set_contents.do_set_contents_element_validP(state_$4, rt_link)) && (NIL != inference_datastructures_problem_link.problem_link_has_typeP(rt_link, $RESIDUAL_TRANSFORMATION))) && (NIL != residual_transformation_link_motivated_by_join_ordered_linkP(rt_link, jo_link_var_$1))) && (NIL != residual_transformation_link_motivated_by_transformation_linkP(rt_link, t_link))) {
                        inference_datastructures_problem_link.destroy_problem_link(rt_link);
                    }
                }
            }
        }
        return t_link;
    }

    /**
     *
     *
     * @return mapped-problem-p
     */
    @LispMethod(comment = "@return mapped-problem-p")
    public static final SubLObject residual_transformation_link_supporting_mapped_problem_alt(SubLObject rt_link) {
        return inference_datastructures_problem_link.problem_link_first_supporting_mapped_problem(rt_link);
    }

    /**
     *
     *
     * @return mapped-problem-p
     */
    @LispMethod(comment = "@return mapped-problem-p")
    public static SubLObject residual_transformation_link_supporting_mapped_problem(final SubLObject rt_link) {
        return inference_datastructures_problem_link.problem_link_first_supporting_mapped_problem(rt_link);
    }

    public static final SubLObject residual_transformation_link_supporting_problem_alt(SubLObject rt_link) {
        return inference_datastructures_problem_link.mapped_problem_problem(com.cyc.cycjava.cycl.inference.harness.inference_worker_residual_transformation.residual_transformation_link_supporting_mapped_problem(rt_link));
    }

    public static SubLObject residual_transformation_link_supporting_problem(final SubLObject rt_link) {
        return inference_datastructures_problem_link.mapped_problem_problem(residual_transformation_link_supporting_mapped_problem(rt_link));
    }

    /**
     *
     *
     * @return variable-map-p
     */
    @LispMethod(comment = "@return variable-map-p")
    public static final SubLObject residual_transformation_link_supporting_variable_map_alt(SubLObject rt_link) {
        {
            SubLObject supporting_mapped_problem = com.cyc.cycjava.cycl.inference.harness.inference_worker_residual_transformation.residual_transformation_link_supporting_mapped_problem(rt_link);
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
    public static SubLObject residual_transformation_link_supporting_variable_map(final SubLObject rt_link) {
        final SubLObject supporting_mapped_problem = residual_transformation_link_supporting_mapped_problem(rt_link);
        if (NIL != supporting_mapped_problem) {
            return inference_datastructures_problem_link.mapped_problem_variable_map(supporting_mapped_problem);
        }
        return NIL;
    }

    public static final SubLObject residual_transformation_link_motivating_join_ordered_link_alt(SubLObject rt_link) {
        return inference_datastructures_problem_link.problem_link_data(rt_link).first();
    }

    public static SubLObject residual_transformation_link_motivating_join_ordered_link(final SubLObject rt_link) {
        return inference_datastructures_problem_link.problem_link_data(rt_link).first();
    }

    public static final SubLObject residual_transformation_link_motivating_transformation_link_alt(SubLObject rt_link) {
        return second(inference_datastructures_problem_link.problem_link_data(rt_link));
    }

    public static SubLObject residual_transformation_link_motivating_transformation_link(final SubLObject rt_link) {
        return second(inference_datastructures_problem_link.problem_link_data(rt_link));
    }

    public static final SubLObject residual_transformation_link_conjunctive_problem_dont_care_variable_map_alt(SubLObject rt_link) {
        return third(inference_datastructures_problem_link.problem_link_data(rt_link));
    }

    public static SubLObject residual_transformation_link_conjunctive_problem_dont_care_variable_map(final SubLObject rt_link) {
        return third(inference_datastructures_problem_link.problem_link_data(rt_link));
    }

    public static final SubLObject residual_transformation_link_residual_conjunction_literal_map_alt(SubLObject rt_link) {
        return fourth(inference_datastructures_problem_link.problem_link_data(rt_link));
    }

    public static SubLObject residual_transformation_link_residual_conjunction_literal_map(final SubLObject rt_link) {
        return fourth(inference_datastructures_problem_link.problem_link_data(rt_link));
    }

    /**
     *
     *
     * @return booleanp; whether the combination of JO-LINK and T-LINK motivate the existence of RT-LINK.
     */
    @LispMethod(comment = "@return booleanp; whether the combination of JO-LINK and T-LINK motivate the existence of RT-LINK.")
    public static final SubLObject residual_transformation_link_motivated_by_link_pairP_alt(SubLObject rt_link, SubLObject jo_link, SubLObject t_link) {
        return makeBoolean((NIL != com.cyc.cycjava.cycl.inference.harness.inference_worker_residual_transformation.residual_transformation_link_motivated_by_join_ordered_linkP(rt_link, jo_link)) && (NIL != com.cyc.cycjava.cycl.inference.harness.inference_worker_residual_transformation.residual_transformation_link_motivated_by_transformation_linkP(rt_link, t_link)));
    }

    /**
     *
     *
     * @return booleanp; whether the combination of JO-LINK and T-LINK motivate the existence of RT-LINK.
     */
    @LispMethod(comment = "@return booleanp; whether the combination of JO-LINK and T-LINK motivate the existence of RT-LINK.")
    public static SubLObject residual_transformation_link_motivated_by_link_pairP(final SubLObject rt_link, final SubLObject jo_link, final SubLObject t_link) {
        return makeBoolean((NIL != residual_transformation_link_motivated_by_join_ordered_linkP(rt_link, jo_link)) && (NIL != residual_transformation_link_motivated_by_transformation_linkP(rt_link, t_link)));
    }

    /**
     *
     *
     * @return booleanp; whether JO-LINK provides partial motivation for the existence of RT-LINK.
     */
    @LispMethod(comment = "@return booleanp; whether JO-LINK provides partial motivation for the existence of RT-LINK.")
    public static final SubLObject residual_transformation_link_motivated_by_join_ordered_linkP_alt(SubLObject rt_link, SubLObject jo_link) {
        return eq(jo_link, com.cyc.cycjava.cycl.inference.harness.inference_worker_residual_transformation.residual_transformation_link_motivating_join_ordered_link(rt_link));
    }

    /**
     *
     *
     * @return booleanp; whether JO-LINK provides partial motivation for the existence of RT-LINK.
     */
    @LispMethod(comment = "@return booleanp; whether JO-LINK provides partial motivation for the existence of RT-LINK.")
    public static SubLObject residual_transformation_link_motivated_by_join_ordered_linkP(final SubLObject rt_link, final SubLObject jo_link) {
        return eq(jo_link, residual_transformation_link_motivating_join_ordered_link(rt_link));
    }

    /**
     *
     *
     * @return booleanp; whether T-LINK provides partial motivation for the existence of RT-LINK.
     */
    @LispMethod(comment = "@return booleanp; whether T-LINK provides partial motivation for the existence of RT-LINK.")
    public static final SubLObject residual_transformation_link_motivated_by_transformation_linkP_alt(SubLObject rt_link, SubLObject t_link) {
        return eq(t_link, com.cyc.cycjava.cycl.inference.harness.inference_worker_residual_transformation.residual_transformation_link_motivating_transformation_link(rt_link));
    }

    /**
     *
     *
     * @return booleanp; whether T-LINK provides partial motivation for the existence of RT-LINK.
     */
    @LispMethod(comment = "@return booleanp; whether T-LINK provides partial motivation for the existence of RT-LINK.")
    public static SubLObject residual_transformation_link_motivated_by_transformation_linkP(final SubLObject rt_link, final SubLObject t_link) {
        return eq(t_link, residual_transformation_link_motivating_transformation_link(rt_link));
    }

    public static final SubLObject residual_transformation_link_residual_problem_alt(SubLObject rt_link) {
        {
            SubLObject t_link = com.cyc.cycjava.cycl.inference.harness.inference_worker_residual_transformation.residual_transformation_link_motivating_transformation_link(rt_link);
            return transformation_link_supporting_problem(t_link);
        }
    }

    public static SubLObject residual_transformation_link_residual_problem(final SubLObject rt_link) {
        final SubLObject t_link = residual_transformation_link_motivating_transformation_link(rt_link);
        return inference_worker_transformation.transformation_link_supporting_problem(t_link);
    }

    public static final SubLObject residual_transformation_link_rule_assertion_alt(SubLObject rt_link) {
        {
            SubLObject t_link = com.cyc.cycjava.cycl.inference.harness.inference_worker_residual_transformation.residual_transformation_link_motivating_transformation_link(rt_link);
            return transformation_link_rule_assertion(t_link);
        }
    }

    public static SubLObject residual_transformation_link_rule_assertion(final SubLObject rt_link) {
        final SubLObject t_link = residual_transformation_link_motivating_transformation_link(rt_link);
        return inference_worker_transformation.transformation_link_rule_assertion(t_link);
    }

    public static SubLObject residual_transformation_link_bindings(final SubLObject rt_link) {
        assert NIL != residual_transformation_link_p(rt_link) : "! inference_worker_residual_transformation.residual_transformation_link_p(rt_link) " + ("inference_worker_residual_transformation.residual_transformation_link_p(rt_link) " + "CommonSymbols.NIL != inference_worker_residual_transformation.residual_transformation_link_p(rt_link) ") + rt_link;
        final SubLObject t_link = residual_transformation_link_motivating_transformation_link(rt_link);
        final SubLObject jo_link = residual_transformation_link_motivating_join_ordered_link(rt_link);
        final SubLObject focal_mapped_problem = inference_worker_join_ordered.join_ordered_link_focal_mapped_problem(jo_link);
        final SubLObject focal_variable_map = inference_datastructures_problem_link.mapped_problem_variable_map(focal_mapped_problem);
        final SubLObject t_bindings = inference_worker_transformation.transformation_link_bindings(t_link);
        final SubLObject rt_bindings = bindings.apply_bindings(focal_variable_map, t_bindings);
        return rt_bindings;
    }

    public static SubLObject residual_transformation_link_el_bindings(final SubLObject rt_link) {
        assert NIL != residual_transformation_link_p(rt_link) : "! inference_worker_residual_transformation.residual_transformation_link_p(rt_link) " + ("inference_worker_residual_transformation.residual_transformation_link_p(rt_link) " + "CommonSymbols.NIL != inference_worker_residual_transformation.residual_transformation_link_p(rt_link) ") + rt_link;
        final SubLObject rule_assertion = residual_transformation_link_rule_assertion(rt_link);
        final SubLObject rule_assertion_variable_map = inference_worker_transformation.rule_assertion_variable_map(rule_assertion);
        final SubLObject hl_bindings = residual_transformation_link_bindings(rt_link);
        final SubLObject el_bindings = bindings.apply_bindings_backwards(rule_assertion_variable_map, hl_bindings);
        final SubLObject canon_el_bindings = inference_worker_transformation.canonicalize_bindings_wrt_el_vars(el_bindings);
        return canon_el_bindings;
    }

    public static final SubLObject set_residual_transformation_link_data_alt(SubLObject rt_link, SubLObject join_ordered_link, SubLObject transformation_link, SubLObject conjunctive_problem_dont_care_variable_map, SubLObject residual_conjunction_literal_map) {
        inference_datastructures_problem_link.set_problem_link_data(rt_link, list(join_ordered_link, transformation_link, conjunctive_problem_dont_care_variable_map, residual_conjunction_literal_map));
        return rt_link;
    }

    public static SubLObject set_residual_transformation_link_data(final SubLObject rt_link, final SubLObject join_ordered_link, final SubLObject transformation_link, final SubLObject conjunctive_problem_dont_care_variable_map, final SubLObject residual_conjunction_literal_map) {
        inference_datastructures_problem_link.set_problem_link_data(rt_link, list(join_ordered_link, transformation_link, conjunctive_problem_dont_care_variable_map, residual_conjunction_literal_map));
        return rt_link;
    }

    public static final SubLObject maybe_possibly_add_residual_transformation_links_via_join_ordered_link_alt(SubLObject join_ordered_link) {
        if (NIL == inference_datastructures_problem_store.problem_store_transformation_allowedP(inference_datastructures_problem_link.problem_link_store(join_ordered_link))) {
            return NIL;
        }
        return com.cyc.cycjava.cycl.inference.harness.inference_worker_residual_transformation.possibly_add_residual_transformation_links_via_join_ordered_link(join_ordered_link);
    }

    public static SubLObject maybe_possibly_add_residual_transformation_links_via_join_ordered_link(final SubLObject join_ordered_link) {
        if (NIL == inference_datastructures_problem_store.problem_store_transformation_allowedP(inference_datastructures_problem_link.problem_link_store(join_ordered_link))) {
            return NIL;
        }
        return possibly_add_residual_transformation_links_via_join_ordered_link(join_ordered_link);
    }

    public static final SubLObject maybe_possibly_add_residual_transformation_links_via_transformation_link_alt(SubLObject transformation_link) {
        if (NIL == inference_datastructures_problem_store.problem_store_transformation_allowedP(inference_datastructures_problem_link.problem_link_store(transformation_link))) {
            return NIL;
        }
        if (NIL != inference_datastructures_problem_link.problem_link_with_supporting_problem_p(transformation_link)) {
            return com.cyc.cycjava.cycl.inference.harness.inference_worker_residual_transformation.possibly_add_residual_transformation_links_via_transformation_link(transformation_link);
        }
        return NIL;
    }

    public static SubLObject maybe_possibly_add_residual_transformation_links_via_transformation_link(final SubLObject transformation_link) {
        if (NIL == inference_datastructures_problem_store.problem_store_transformation_allowedP(inference_datastructures_problem_link.problem_link_store(transformation_link))) {
            return NIL;
        }
        if (NIL != inference_datastructures_problem_link.problem_link_with_supporting_problem_p(transformation_link)) {
            return possibly_add_residual_transformation_links_via_transformation_link(transformation_link);
        }
        return NIL;
    }

    public static final SubLObject possibly_add_residual_transformation_links_via_join_ordered_link_alt(SubLObject join_ordered_link) {
        {
            SubLObject focal_problem = join_ordered_link_focal_problem(join_ordered_link);
            SubLObject total = ZERO_INTEGER;
            SubLObject set_contents_var = inference_datastructures_problem.problem_argument_links(focal_problem);
            SubLObject basis_object = set_contents.do_set_contents_basis_object(set_contents_var);
            SubLObject state = NIL;
            for (state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
                {
                    SubLObject transformation_link = set_contents.do_set_contents_next(basis_object, state);
                    if (NIL != set_contents.do_set_contents_element_validP(state, transformation_link)) {
                        if (NIL != inference_datastructures_problem_link.problem_link_has_typeP(transformation_link, $TRANSFORMATION)) {
                            if (NIL != inference_datastructures_problem_link.problem_link_with_supporting_problem_p(transformation_link)) {
                                if (NIL != com.cyc.cycjava.cycl.inference.harness.inference_worker_residual_transformation.possibly_add_residual_transformation_link(join_ordered_link, transformation_link)) {
                                    total = add(total, ONE_INTEGER);
                                }
                            }
                        }
                    }
                }
            }
            return total;
        }
    }

    public static SubLObject possibly_add_residual_transformation_links_via_join_ordered_link(final SubLObject join_ordered_link) {
        final SubLObject focal_problem = inference_worker_join_ordered.join_ordered_link_focal_problem(join_ordered_link);
        SubLObject total = ZERO_INTEGER;
        final SubLObject set_contents_var = inference_datastructures_problem.problem_argument_links(focal_problem);
        SubLObject basis_object;
        SubLObject state;
        SubLObject transformation_link;
        for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
            transformation_link = set_contents.do_set_contents_next(basis_object, state);
            if ((((NIL != set_contents.do_set_contents_element_validP(state, transformation_link)) && (NIL != inference_datastructures_problem_link.problem_link_has_typeP(transformation_link, $TRANSFORMATION))) && (NIL != inference_datastructures_problem_link.problem_link_with_supporting_problem_p(transformation_link))) && (NIL != possibly_add_residual_transformation_link(join_ordered_link, transformation_link))) {
                total = add(total, ONE_INTEGER);
            }
        }
        return total;
    }

    public static final SubLObject possibly_add_residual_transformation_links_via_transformation_link_alt(SubLObject transformation_link) {
        {
            SubLObject supported_problem = inference_datastructures_problem_link.problem_link_supported_problem(transformation_link);
            SubLObject total = ZERO_INTEGER;
            SubLObject problem_var = supported_problem;
            SubLObject set_contents_var = inference_datastructures_problem.problem_dependent_links(supported_problem);
            SubLObject basis_object = set_contents.do_set_contents_basis_object(set_contents_var);
            SubLObject state = NIL;
            for (state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
                {
                    SubLObject join_ordered_link = set_contents.do_set_contents_next(basis_object, state);
                    if (NIL != set_contents.do_set_contents_element_validP(state, join_ordered_link)) {
                        if (NIL != inference_datastructures_problem_link.problem_link_has_typeP(join_ordered_link, $JOIN_ORDERED)) {
                            {
                                SubLObject link_var = join_ordered_link;
                                SubLObject cdolist_list_var = inference_datastructures_problem_link.problem_link_supporting_mapped_problems(link_var);
                                SubLObject conjunct_mapped_problem = NIL;
                                for (conjunct_mapped_problem = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , conjunct_mapped_problem = cdolist_list_var.first()) {
                                    if (NIL != inference_macros.do_problem_link_open_matchP(T, link_var, conjunct_mapped_problem)) {
                                        if (problem_var == inference_datastructures_problem_link.mapped_problem_problem(conjunct_mapped_problem)) {
                                            if (NIL != com.cyc.cycjava.cycl.inference.harness.inference_worker_residual_transformation.possibly_add_residual_transformation_link(join_ordered_link, transformation_link)) {
                                                total = add(total, ONE_INTEGER);
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
            return total;
        }
    }

    public static SubLObject possibly_add_residual_transformation_links_via_transformation_link(final SubLObject transformation_link) {
        final SubLObject supported_problem = inference_datastructures_problem_link.problem_link_supported_problem(transformation_link);
        SubLObject total = ZERO_INTEGER;
        final SubLObject problem_var = supported_problem;
        final SubLObject set_contents_var = inference_datastructures_problem.problem_dependent_links(supported_problem);
        SubLObject basis_object;
        SubLObject state;
        SubLObject join_ordered_link;
        SubLObject link_var;
        SubLObject cdolist_list_var;
        SubLObject conjunct_mapped_problem;
        for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
            join_ordered_link = set_contents.do_set_contents_next(basis_object, state);
            if ((NIL != set_contents.do_set_contents_element_validP(state, join_ordered_link)) && (NIL != inference_datastructures_problem_link.problem_link_has_typeP(join_ordered_link, $JOIN_ORDERED))) {
                link_var = join_ordered_link;
                cdolist_list_var = inference_datastructures_problem_link.problem_link_supporting_mapped_problems(link_var);
                conjunct_mapped_problem = NIL;
                conjunct_mapped_problem = cdolist_list_var.first();
                while (NIL != cdolist_list_var) {
                    if (((NIL != inference_macros.do_problem_link_open_matchP(T, link_var, conjunct_mapped_problem)) && problem_var.eql(inference_datastructures_problem_link.mapped_problem_problem(conjunct_mapped_problem))) && (NIL != possibly_add_residual_transformation_link(join_ordered_link, transformation_link))) {
                        total = add(total, ONE_INTEGER);
                    }
                    cdolist_list_var = cdolist_list_var.rest();
                    conjunct_mapped_problem = cdolist_list_var.first();
                } 
            }
        }
        return total;
    }

    public static final SubLObject possibly_add_residual_transformation_link_alt(SubLObject join_ordered_link, SubLObject transformation_link) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject store = inference_datastructures_problem_link.problem_link_store(join_ordered_link);
                thread.resetMultipleValues();
                {
                    SubLObject residual_conjunction_query = com.cyc.cycjava.cycl.inference.harness.inference_worker_residual_transformation.compute_residual_transformation_link_query(join_ordered_link, transformation_link);
                    SubLObject conjunctive_problem_dont_care_variable_map = thread.secondMultipleValue();
                    thread.resetMultipleValues();
                    {
                        SubLObject residual_conjunction_mapped_problem = inference_worker.find_or_create_problem(store, residual_conjunction_query, T);
                        SubLObject residual_conjunction_literal_map = com.cyc.cycjava.cycl.inference.harness.inference_worker_residual_transformation.compute_residual_conjunction_literal_map(join_ordered_link, transformation_link, conjunctive_problem_dont_care_variable_map, residual_conjunction_mapped_problem);
                        return com.cyc.cycjava.cycl.inference.harness.inference_worker_residual_transformation.new_residual_transformation_link(residual_conjunction_mapped_problem, join_ordered_link, transformation_link, conjunctive_problem_dont_care_variable_map, residual_conjunction_literal_map);
                    }
                }
            }
        }
    }

    public static SubLObject possibly_add_residual_transformation_link(final SubLObject join_ordered_link, final SubLObject transformation_link) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject store = inference_datastructures_problem_link.problem_link_store(join_ordered_link);
        thread.resetMultipleValues();
        final SubLObject residual_conjunction_query = compute_residual_transformation_link_query(join_ordered_link, transformation_link);
        final SubLObject residual_conjunction_free_hl_vars = thread.secondMultipleValue();
        final SubLObject conjunctive_problem_dont_care_variable_map = thread.thirdMultipleValue();
        thread.resetMultipleValues();
        final SubLObject residual_conjunction_mapped_problem = inference_worker.find_or_create_problem(store, residual_conjunction_query, residual_conjunction_free_hl_vars, T);
        final SubLObject residual_conjunction_literal_map = compute_residual_conjunction_literal_map(join_ordered_link, transformation_link, conjunctive_problem_dont_care_variable_map, residual_conjunction_mapped_problem);
        return new_residual_transformation_link(residual_conjunction_mapped_problem, join_ordered_link, transformation_link, conjunctive_problem_dont_care_variable_map, residual_conjunction_literal_map);
    }

    public static final SubLObject compute_residual_transformation_link_query_alt(SubLObject join_ordered_link, SubLObject transformation_link) {
        {
            SubLObject focal_mapped_problem = join_ordered_link_focal_mapped_problem(join_ordered_link);
            SubLObject residual_mapped_problem = transformation_link_supporting_mapped_problem(transformation_link);
            SubLObject residual_problem = inference_datastructures_problem_link.mapped_problem_problem(residual_mapped_problem);
            SubLObject focal_variable_map = inference_datastructures_problem_link.mapped_problem_variable_map(focal_mapped_problem);
            SubLObject residual_variable_map = inference_datastructures_problem_link.mapped_problem_variable_map(residual_mapped_problem);
            SubLObject transformation_link_bindings = transformation_link_bindings(transformation_link);
            SubLObject transformation_variable_map = apply_bindings_backwards_to_values(transformation_link_bindings, residual_variable_map);
            SubLObject transformation_content_bindings = com.cyc.cycjava.cycl.inference.harness.inference_worker_residual_transformation.filter_transformation_link_bindings(transformation_link_bindings);
            SubLObject residual_query = inference_datastructures_problem.problem_query(residual_problem);
            SubLObject residual_query_wrt_conjunct = com.cyc.cycjava.cycl.inference.harness.inference_worker_residual_transformation.rt_apply_bindings(transformation_variable_map, residual_query);
            SubLObject residual_query_wrt_conjunction = com.cyc.cycjava.cycl.inference.harness.inference_worker_residual_transformation.rt_apply_bindings(focal_variable_map, residual_query_wrt_conjunct);
            SubLObject non_focal_mapped_problem = join_ordered_link_other_mapped_problem(join_ordered_link, focal_mapped_problem);
            SubLObject non_focal_problem = inference_datastructures_problem_link.mapped_problem_problem(non_focal_mapped_problem);
            SubLObject non_focal_variable_map = inference_datastructures_problem_link.mapped_problem_variable_map(non_focal_mapped_problem);
            SubLObject non_focal_query = inference_datastructures_problem.problem_query(non_focal_problem);
            SubLObject non_focal_query_wrt_conjunction = com.cyc.cycjava.cycl.inference.harness.inference_worker_residual_transformation.rt_apply_bindings(non_focal_variable_map, non_focal_query);
            SubLObject residual_conjunction_query_wrt_conjunction = com.cyc.cycjava.cycl.inference.harness.inference_worker_residual_transformation.conjoin_problem_queries(non_focal_query_wrt_conjunction, residual_query_wrt_conjunction);
            SubLObject conjunctive_problem_dont_care_variable_map = com.cyc.cycjava.cycl.inference.harness.inference_worker_residual_transformation.compute_conjunctive_problem_dont_care_variable_map(non_focal_variable_map, focal_variable_map, transformation_link);
            SubLObject residual_conjunction_query_wrt_conjunction_extended = com.cyc.cycjava.cycl.inference.harness.inference_worker_residual_transformation.rt_apply_bindings(conjunctive_problem_dont_care_variable_map, residual_conjunction_query_wrt_conjunction);
            SubLObject residual_conjunction_query_wrt_conjunct = apply_bindings_backwards(focal_variable_map, residual_conjunction_query_wrt_conjunction_extended);
            SubLObject residual_conjunction_query_wrt_focal_restricted = com.cyc.cycjava.cycl.inference.harness.inference_worker_residual_transformation.rt_apply_bindings(transformation_content_bindings, residual_conjunction_query_wrt_conjunct);
            SubLObject residual_conjunction_query = apply_bindings_backwards(transformation_variable_map, residual_conjunction_query_wrt_focal_restricted);
            return values(residual_conjunction_query, conjunctive_problem_dont_care_variable_map);
        }
    }

    public static SubLObject compute_residual_transformation_link_query(final SubLObject join_ordered_link, final SubLObject transformation_link) {
        final SubLObject supported_problem = inference_datastructures_problem_link.problem_link_supported_problem(join_ordered_link);
        final SubLObject supported_problem_free_hl_vars = inference_datastructures_problem.problem_free_hl_vars(supported_problem);
        final SubLObject focal_mapped_problem = inference_worker_join_ordered.join_ordered_link_focal_mapped_problem(join_ordered_link);
        final SubLObject residual_mapped_problem = inference_worker_transformation.transformation_link_supporting_mapped_problem(transformation_link);
        final SubLObject residual_problem = inference_datastructures_problem_link.mapped_problem_problem(residual_mapped_problem);
        final SubLObject focal_variable_map = inference_datastructures_problem_link.mapped_problem_variable_map(focal_mapped_problem);
        final SubLObject focal_free_hl_vars = rt_apply_bindings_backwards(focal_variable_map, intersection(bindings.bindings_values(focal_variable_map), supported_problem_free_hl_vars, UNPROVIDED, UNPROVIDED));
        final SubLObject residual_variable_map = inference_datastructures_problem_link.mapped_problem_variable_map(residual_mapped_problem);
        final SubLObject transformation_link_bindings = inference_worker_transformation.transformation_link_bindings(transformation_link);
        final SubLObject transformation_variable_map = bindings.apply_bindings_backwards_to_values(transformation_link_bindings, residual_variable_map);
        final SubLObject transformation_content_bindings = filter_transformation_link_bindings(transformation_link_bindings);
        final SubLObject residual_query = inference_datastructures_problem.problem_query(residual_problem);
        final SubLObject residual_free_hl_vars = intersection(cycl_utilities.expression_gather(residual_query, $sym7$HL_VAR_, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED), bindings.apply_bindings(transformation_variable_map, focal_free_hl_vars), UNPROVIDED, UNPROVIDED);
        final SubLObject residual_query_wrt_conjunct = rt_apply_bindings(transformation_variable_map, residual_query);
        final SubLObject residual_free_hl_vars_wrt_conjunct = rt_apply_bindings(transformation_variable_map, residual_free_hl_vars);
        final SubLObject residual_query_wrt_conjunction = rt_apply_bindings(focal_variable_map, residual_query_wrt_conjunct);
        final SubLObject residual_free_hl_vars_wrt_conjunction = rt_apply_bindings(focal_variable_map, residual_free_hl_vars_wrt_conjunct);
        final SubLObject non_focal_mapped_problem = inference_worker_join_ordered.join_ordered_link_other_mapped_problem(join_ordered_link, focal_mapped_problem);
        final SubLObject non_focal_problem = inference_datastructures_problem_link.mapped_problem_problem(non_focal_mapped_problem);
        final SubLObject non_focal_variable_map = inference_datastructures_problem_link.mapped_problem_variable_map(non_focal_mapped_problem);
        final SubLObject non_focal_query = inference_datastructures_problem.problem_query(non_focal_problem);
        final SubLObject non_focal_free_hl_vars = rt_apply_bindings_backwards(non_focal_variable_map, supported_problem_free_hl_vars);
        final SubLObject non_focal_query_wrt_conjunction = rt_apply_bindings(non_focal_variable_map, non_focal_query);
        final SubLObject non_focal_free_hl_vars_wrt_conjunction = rt_apply_bindings(non_focal_variable_map, non_focal_free_hl_vars);
        final SubLObject residual_conjunction_query_wrt_conjunction = conjoin_problem_queries(non_focal_query_wrt_conjunction, residual_query_wrt_conjunction);
        final SubLObject residual_conjunction_free_hl_vars_wrt_conjunction = union(non_focal_free_hl_vars_wrt_conjunction, residual_free_hl_vars_wrt_conjunction, UNPROVIDED, UNPROVIDED);
        final SubLObject conjunctive_problem_dont_care_variable_map = compute_conjunctive_problem_dont_care_variable_map(non_focal_variable_map, focal_variable_map, transformation_link);
        final SubLObject residual_conjunction_query_wrt_conjunction_extended = rt_apply_bindings(conjunctive_problem_dont_care_variable_map, residual_conjunction_query_wrt_conjunction);
        final SubLObject residual_conjunction_free_hl_vars_wrt_conjunction_extended = rt_apply_bindings(conjunctive_problem_dont_care_variable_map, residual_conjunction_free_hl_vars_wrt_conjunction);
        final SubLObject residual_conjunction_query_wrt_conjunct = bindings.apply_bindings_backwards(focal_variable_map, residual_conjunction_query_wrt_conjunction_extended);
        final SubLObject residual_conjunction_free_hl_vars_wrt_conjunct = bindings.apply_bindings_backwards(focal_variable_map, residual_conjunction_free_hl_vars_wrt_conjunction_extended);
        final SubLObject residual_conjunction_query_wrt_focal_restricted = rt_apply_bindings(transformation_content_bindings, residual_conjunction_query_wrt_conjunct);
        final SubLObject residual_conjunction_free_hl_vars_wrt_focal_restricted = rt_apply_bindings(transformation_content_bindings, residual_conjunction_free_hl_vars_wrt_conjunct);
        final SubLObject residual_conjunction_query = bindings.apply_bindings_backwards(transformation_variable_map, residual_conjunction_query_wrt_focal_restricted);
        final SubLObject residual_conjunction_free_hl_vars_raw = list_utilities.fast_remove_duplicates(bindings.apply_bindings_backwards(transformation_variable_map, residual_conjunction_free_hl_vars_wrt_focal_restricted), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        final SubLObject residual_conjunction_query_vars = cycl_utilities.expression_gather(residual_conjunction_query, $sym7$HL_VAR_, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        final SubLObject residual_conjunction_free_hl_vars = variables.sort_hl_variable_list(intersection(residual_conjunction_free_hl_vars_raw, residual_conjunction_query_vars, UNPROVIDED, UNPROVIDED));
        return values(residual_conjunction_query, residual_conjunction_free_hl_vars, conjunctive_problem_dont_care_variable_map);
    }

    public static final SubLObject compute_residual_conjunction_literal_map_alt(SubLObject join_ordered_link, SubLObject transformation_link, SubLObject conjunctive_problem_dont_care_variable_map, SubLObject residual_conjunction_mapped_problem) {
        {
            SubLObject focal_mapped_problem = join_ordered_link_focal_mapped_problem(join_ordered_link);
            SubLObject residual_mapped_problem = transformation_link_supporting_mapped_problem(transformation_link);
            SubLObject focal_variable_map = inference_datastructures_problem_link.mapped_problem_variable_map(focal_mapped_problem);
            SubLObject residual_variable_map = inference_datastructures_problem_link.mapped_problem_variable_map(residual_mapped_problem);
            SubLObject transformation_link_bindings = transformation_link_bindings(transformation_link);
            SubLObject transformation_variable_map = apply_bindings_backwards_to_values(transformation_link_bindings, residual_variable_map);
            SubLObject transformation_content_bindings = com.cyc.cycjava.cycl.inference.harness.inference_worker_residual_transformation.filter_transformation_link_bindings(transformation_link_bindings);
            SubLObject non_focal_mapped_problem = join_ordered_link_other_mapped_problem(join_ordered_link, focal_mapped_problem);
            SubLObject non_focal_problem = inference_datastructures_problem_link.mapped_problem_problem(non_focal_mapped_problem);
            SubLObject non_focal_variable_map = inference_datastructures_problem_link.mapped_problem_variable_map(non_focal_mapped_problem);
            SubLObject non_focal_query = inference_datastructures_problem.problem_query(non_focal_problem);
            SubLObject non_focal_query_wrt_conjunction = com.cyc.cycjava.cycl.inference.harness.inference_worker_residual_transformation.rt_apply_bindings(non_focal_variable_map, non_focal_query);
            SubLObject conjunction_query = inference_datastructures_problem.problem_query(inference_datastructures_problem_link.problem_link_supported_problem(join_ordered_link));
            SubLObject conjunction_query_wrt_conjunction_extended = com.cyc.cycjava.cycl.inference.harness.inference_worker_residual_transformation.rt_apply_bindings(conjunctive_problem_dont_care_variable_map, conjunction_query);
            SubLObject non_focal_query_wrt_conjunction_extended = com.cyc.cycjava.cycl.inference.harness.inference_worker_residual_transformation.rt_apply_bindings(conjunctive_problem_dont_care_variable_map, non_focal_query_wrt_conjunction);
            SubLObject non_focal_query_wrt_conjunct = apply_bindings_backwards(focal_variable_map, non_focal_query_wrt_conjunction_extended);
            SubLObject non_focal_query_wrt_focal_restricted = com.cyc.cycjava.cycl.inference.harness.inference_worker_residual_transformation.rt_apply_bindings(transformation_content_bindings, non_focal_query_wrt_conjunct);
            SubLObject non_focal_query_wrt_residual_conjunction = apply_bindings_backwards(transformation_variable_map, non_focal_query_wrt_focal_restricted);
            SubLObject actual_residual_conjunction_problem = inference_datastructures_problem_link.mapped_problem_problem(residual_conjunction_mapped_problem);
            SubLObject actual_residual_conjunction_variable_map = inference_datastructures_problem_link.mapped_problem_variable_map(residual_conjunction_mapped_problem);
            SubLObject actual_residual_conjunction_query = inference_datastructures_problem.problem_query(actual_residual_conjunction_problem);
            SubLObject non_focal_query_wrt_actual_residual_conjunction = apply_bindings_backwards(actual_residual_conjunction_variable_map, non_focal_query_wrt_residual_conjunction);
            SubLObject residual_conjunction_literal_map = com.cyc.cycjava.cycl.inference.harness.inference_worker_residual_transformation.compute_residual_conjunction_literal_map_internal(conjunction_query_wrt_conjunction_extended, non_focal_query_wrt_conjunction_extended, non_focal_query_wrt_actual_residual_conjunction, actual_residual_conjunction_query);
            return residual_conjunction_literal_map;
        }
    }

    public static SubLObject compute_residual_conjunction_literal_map(final SubLObject join_ordered_link, final SubLObject transformation_link, final SubLObject conjunctive_problem_dont_care_variable_map, final SubLObject residual_conjunction_mapped_problem) {
        final SubLObject focal_mapped_problem = inference_worker_join_ordered.join_ordered_link_focal_mapped_problem(join_ordered_link);
        final SubLObject residual_mapped_problem = inference_worker_transformation.transformation_link_supporting_mapped_problem(transformation_link);
        final SubLObject focal_variable_map = inference_datastructures_problem_link.mapped_problem_variable_map(focal_mapped_problem);
        final SubLObject residual_variable_map = inference_datastructures_problem_link.mapped_problem_variable_map(residual_mapped_problem);
        final SubLObject transformation_link_bindings = inference_worker_transformation.transformation_link_bindings(transformation_link);
        final SubLObject transformation_variable_map = bindings.apply_bindings_backwards_to_values(transformation_link_bindings, residual_variable_map);
        final SubLObject transformation_content_bindings = filter_transformation_link_bindings(transformation_link_bindings);
        final SubLObject non_focal_mapped_problem = inference_worker_join_ordered.join_ordered_link_other_mapped_problem(join_ordered_link, focal_mapped_problem);
        final SubLObject non_focal_problem = inference_datastructures_problem_link.mapped_problem_problem(non_focal_mapped_problem);
        final SubLObject non_focal_variable_map = inference_datastructures_problem_link.mapped_problem_variable_map(non_focal_mapped_problem);
        final SubLObject non_focal_query = inference_datastructures_problem.problem_query(non_focal_problem);
        final SubLObject non_focal_query_wrt_conjunction = rt_apply_bindings(non_focal_variable_map, non_focal_query);
        final SubLObject conjunction_query = inference_datastructures_problem.problem_query(inference_datastructures_problem_link.problem_link_supported_problem(join_ordered_link));
        final SubLObject conjunction_query_wrt_conjunction_extended = rt_apply_bindings(conjunctive_problem_dont_care_variable_map, conjunction_query);
        final SubLObject non_focal_query_wrt_conjunction_extended = rt_apply_bindings(conjunctive_problem_dont_care_variable_map, non_focal_query_wrt_conjunction);
        final SubLObject non_focal_query_wrt_conjunct = bindings.apply_bindings_backwards(focal_variable_map, non_focal_query_wrt_conjunction_extended);
        final SubLObject non_focal_query_wrt_focal_restricted = rt_apply_bindings(transformation_content_bindings, non_focal_query_wrt_conjunct);
        final SubLObject non_focal_query_wrt_residual_conjunction = bindings.apply_bindings_backwards(transformation_variable_map, non_focal_query_wrt_focal_restricted);
        final SubLObject actual_residual_conjunction_problem = inference_datastructures_problem_link.mapped_problem_problem(residual_conjunction_mapped_problem);
        final SubLObject actual_residual_conjunction_variable_map = inference_datastructures_problem_link.mapped_problem_variable_map(residual_conjunction_mapped_problem);
        final SubLObject actual_residual_conjunction_query = inference_datastructures_problem.problem_query(actual_residual_conjunction_problem);
        final SubLObject non_focal_query_wrt_actual_residual_conjunction = bindings.apply_bindings_backwards(actual_residual_conjunction_variable_map, non_focal_query_wrt_residual_conjunction);
        final SubLObject residual_conjunction_literal_map = compute_residual_conjunction_literal_map_internal(conjunction_query_wrt_conjunction_extended, non_focal_query_wrt_conjunction_extended, non_focal_query_wrt_actual_residual_conjunction, actual_residual_conjunction_query);
        return residual_conjunction_literal_map;
    }

    /**
     * Compute a mapping between the literals in the conjunction-query and the literals in the actual-residual-conjunction-query.
     * The literals transformed away become :transformation.
     */
    @LispMethod(comment = "Compute a mapping between the literals in the conjunction-query and the literals in the actual-residual-conjunction-query.\r\nThe literals transformed away become :transformation.\nCompute a mapping between the literals in the conjunction-query and the literals in the actual-residual-conjunction-query.\nThe literals transformed away become :transformation.")
    public static final SubLObject compute_residual_conjunction_literal_map_internal_alt(SubLObject conjunction_query_wrt_conjunction_extended, SubLObject non_focal_query_wrt_conjunction_extended, SubLObject non_focal_query_wrt_actual_residual_conjunction, SubLObject actual_residual_conjunction_query) {
        {
            SubLObject conjunction_clause = conjunction_query_wrt_conjunction_extended.first();
            SubLObject non_focal_wrt_conjunction_clause = non_focal_query_wrt_conjunction_extended.first();
            SubLObject non_focal_wrt_residual_conjunction_clause = non_focal_query_wrt_actual_residual_conjunction.first();
            SubLObject residual_conjunction_clause = actual_residual_conjunction_query.first();
            SubLObject conj_pos_lits = clauses.pos_lits(conjunction_clause);
            SubLObject nf_conj_pos_lits = clauses.pos_lits(non_focal_wrt_conjunction_clause);
            SubLObject nf_res_conj_pos_lits = clauses.pos_lits(non_focal_wrt_residual_conjunction_clause);
            SubLObject res_conj_pos_lits = clauses.pos_lits(residual_conjunction_clause);
            SubLObject pos_lit_map = NIL;
            SubLObject cdolist_list_var = conj_pos_lits;
            SubLObject conj_pos_lit = NIL;
            for (conj_pos_lit = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , conj_pos_lit = cdolist_list_var.first()) {
                {
                    SubLObject conj_index = position(conj_pos_lit, nf_conj_pos_lits, symbol_function(EQUAL), UNPROVIDED, UNPROVIDED, UNPROVIDED);
                    SubLObject res_conj_index = $TRANSFORMATION;
                    if (NIL != conj_index) {
                        {
                            SubLObject nf_res_conj_pos_lit = nth(conj_index, nf_res_conj_pos_lits);
                            res_conj_index = position(nf_res_conj_pos_lit, res_conj_pos_lits, symbol_function(EQUAL), UNPROVIDED, UNPROVIDED, UNPROVIDED);
                        }
                    }
                    pos_lit_map = cons(res_conj_index, pos_lit_map);
                }
            }
            pos_lit_map = nreverse(pos_lit_map);
            {
                SubLObject literal_map = list(NIL, pos_lit_map);
                return literal_map;
            }
        }
    }

    @LispMethod(comment = "Compute a mapping between the literals in the conjunction-query and the literals in the actual-residual-conjunction-query.\r\nThe literals transformed away become :transformation.\nCompute a mapping between the literals in the conjunction-query and the literals in the actual-residual-conjunction-query.\nThe literals transformed away become :transformation.")
    public static SubLObject compute_residual_conjunction_literal_map_internal(final SubLObject conjunction_query_wrt_conjunction_extended, final SubLObject non_focal_query_wrt_conjunction_extended, final SubLObject non_focal_query_wrt_actual_residual_conjunction, final SubLObject actual_residual_conjunction_query) {
        final SubLObject conjunction_clause = conjunction_query_wrt_conjunction_extended.first();
        final SubLObject non_focal_wrt_conjunction_clause = non_focal_query_wrt_conjunction_extended.first();
        final SubLObject non_focal_wrt_residual_conjunction_clause = non_focal_query_wrt_actual_residual_conjunction.first();
        final SubLObject residual_conjunction_clause = actual_residual_conjunction_query.first();
        final SubLObject conj_pos_lits = clauses.pos_lits(conjunction_clause);
        final SubLObject nf_conj_pos_lits = clauses.pos_lits(non_focal_wrt_conjunction_clause);
        final SubLObject nf_res_conj_pos_lits = clauses.pos_lits(non_focal_wrt_residual_conjunction_clause);
        final SubLObject res_conj_pos_lits = clauses.pos_lits(residual_conjunction_clause);
        SubLObject pos_lit_map = NIL;
        SubLObject cdolist_list_var = conj_pos_lits;
        SubLObject conj_pos_lit = NIL;
        conj_pos_lit = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject conj_index = position(conj_pos_lit, nf_conj_pos_lits, symbol_function(EQUAL), UNPROVIDED, UNPROVIDED, UNPROVIDED);
            SubLObject res_conj_index = $TRANSFORMATION;
            if (NIL != conj_index) {
                final SubLObject nf_res_conj_pos_lit = nth(conj_index, nf_res_conj_pos_lits);
                res_conj_index = position(nf_res_conj_pos_lit, res_conj_pos_lits, symbol_function(EQUAL), UNPROVIDED, UNPROVIDED, UNPROVIDED);
            }
            pos_lit_map = cons(res_conj_index, pos_lit_map);
            cdolist_list_var = cdolist_list_var.rest();
            conj_pos_lit = cdolist_list_var.first();
        } 
        pos_lit_map = nreverse(pos_lit_map);
        final SubLObject literal_map = list(NIL, pos_lit_map);
        return literal_map;
    }

    /**
     *
     *
     * @param VARIABLE-MAP			;
     * 		(^ A D) -> D
     * @return 0 proof-p
     * @return 1 whether the returned proof was newly created
     */
    @LispMethod(comment = "@param VARIABLE-MAP\t\t\t;\r\n\t\t(^ A D) -> D\r\n@return 0 proof-p\r\n@return 1 whether the returned proof was newly created")
    public static final SubLObject new_residual_transformation_proof_alt(SubLObject rt_link, SubLObject subproof, SubLObject variable_map) {
        SubLTrampolineFile.checkType(rt_link, RESIDUAL_TRANSFORMATION_LINK_P);
        SubLTrampolineFile.checkType(subproof, PROOF_P);
        {
            SubLObject jo_link = com.cyc.cycjava.cycl.inference.harness.inference_worker_residual_transformation.residual_transformation_link_motivating_join_ordered_link(rt_link);
            SubLObject t_link = com.cyc.cycjava.cycl.inference.harness.inference_worker_residual_transformation.residual_transformation_link_motivating_transformation_link(rt_link);
            SubLObject t_link_variable_map = inference_datastructures_problem_link.mapped_problem_variable_map(transformation_link_supporting_mapped_problem(t_link));
            SubLObject transformation_bindings = transformation_link_bindings(t_link);
            SubLObject supporting_subproof_bindings = inference_datastructures_proof.proof_bindings(subproof);
            SubLObject residual_bindings = transfer_variable_map_to_bindings_filtered(variable_map, supporting_subproof_bindings);
            SubLObject focal_bindings = compute_canonical_transformation_proof_bindings(t_link_variable_map, transformation_bindings, residual_bindings);
            SubLObject focal_to_motivating_conjunction_variable_map = join_ordered_link_focal_to_supported_variable_map(jo_link);
            SubLObject motivating_conjunction_bindings_b = transfer_variable_map_to_bindings_filtered(focal_to_motivating_conjunction_variable_map, focal_bindings);
            SubLObject extended_extended_non_focal_bindings = residual_bindings;
            SubLObject conjunctive_problem_dont_care_variable_map = com.cyc.cycjava.cycl.inference.harness.inference_worker_residual_transformation.residual_transformation_link_conjunctive_problem_dont_care_variable_map(rt_link);
            SubLObject motivating_conjunction_bindings_a = transfer_variable_map_to_bindings_backwards_filtered(conjunctive_problem_dont_care_variable_map, extended_extended_non_focal_bindings);
            SubLObject motivating_conjunction_bindings = append(motivating_conjunction_bindings_a, motivating_conjunction_bindings_b);
            SubLObject canonical_proof_bindings = inference_worker.canonicalize_proof_bindings(motivating_conjunction_bindings);
            return inference_worker.propose_new_proof_with_bindings(rt_link, canonical_proof_bindings, list(subproof));
        }
    }

    /**
     *
     *
     * @param VARIABLE-MAP			;
     * 		(^ A D) -> D
     * @return 0 proof-p
     * @return 1 whether the returned proof was newly created
     */
    @LispMethod(comment = "@param VARIABLE-MAP\t\t\t;\r\n\t\t(^ A D) -> D\r\n@return 0 proof-p\r\n@return 1 whether the returned proof was newly created")
    public static SubLObject new_residual_transformation_proof(final SubLObject rt_link, final SubLObject subproof, final SubLObject variable_map) {
        assert NIL != residual_transformation_link_p(rt_link) : "! inference_worker_residual_transformation.residual_transformation_link_p(rt_link) " + ("inference_worker_residual_transformation.residual_transformation_link_p(rt_link) " + "CommonSymbols.NIL != inference_worker_residual_transformation.residual_transformation_link_p(rt_link) ") + rt_link;
        assert NIL != inference_datastructures_proof.proof_p(subproof) : "! inference_datastructures_proof.proof_p(subproof) " + ("inference_datastructures_proof.proof_p(subproof) " + "CommonSymbols.NIL != inference_datastructures_proof.proof_p(subproof) ") + subproof;
        final SubLObject jo_link = residual_transformation_link_motivating_join_ordered_link(rt_link);
        final SubLObject t_link = residual_transformation_link_motivating_transformation_link(rt_link);
        final SubLObject t_link_variable_map = inference_datastructures_problem_link.mapped_problem_variable_map(inference_worker_transformation.transformation_link_supporting_mapped_problem(t_link));
        final SubLObject transformation_bindings = inference_worker_transformation.transformation_link_bindings(t_link);
        final SubLObject supporting_subproof_bindings = inference_datastructures_proof.proof_bindings(subproof);
        final SubLObject residual_bindings = bindings.transfer_variable_map_to_bindings_filtered(variable_map, supporting_subproof_bindings);
        final SubLObject focal_bindings = inference_worker_transformation.compute_canonical_transformation_proof_bindings(t_link_variable_map, transformation_bindings, residual_bindings);
        final SubLObject focal_to_motivating_conjunction_variable_map = inference_worker_join_ordered.join_ordered_link_focal_to_supported_variable_map(jo_link);
        final SubLObject motivating_conjunction_bindings_b = bindings.transfer_variable_map_to_bindings_filtered(focal_to_motivating_conjunction_variable_map, focal_bindings);
        final SubLObject extended_extended_non_focal_bindings = residual_bindings;
        final SubLObject conjunctive_problem_dont_care_variable_map = residual_transformation_link_conjunctive_problem_dont_care_variable_map(rt_link);
        final SubLObject motivating_conjunction_bindings_a = bindings.transfer_variable_map_to_bindings_backwards_filtered(conjunctive_problem_dont_care_variable_map, extended_extended_non_focal_bindings);
        final SubLObject motivating_conjunction_bindings = append(motivating_conjunction_bindings_a, motivating_conjunction_bindings_b);
        final SubLObject canonical_proof_bindings = inference_worker.canonicalize_proof_bindings(motivating_conjunction_bindings);
        return inference_worker.propose_new_proof_with_bindings(rt_link, canonical_proof_bindings, list(subproof));
    }

    public static final SubLObject residual_transformation_proof_rule_bindings_alt(SubLObject residual_transformation_proof) {
        {
            SubLObject rt_link = inference_datastructures_proof.proof_link(residual_transformation_proof);
            SubLObject t_link = com.cyc.cycjava.cycl.inference.harness.inference_worker_residual_transformation.residual_transformation_link_motivating_transformation_link(rt_link);
            SubLObject subproof = com.cyc.cycjava.cycl.inference.harness.inference_worker_residual_transformation.residual_transformation_proof_subproof(residual_transformation_proof);
            SubLObject supporting_subproof_bindings = inference_datastructures_proof.proof_bindings(subproof);
            SubLObject variable_map = com.cyc.cycjava.cycl.inference.harness.inference_worker_residual_transformation.residual_transformation_link_supporting_variable_map(rt_link);
            SubLObject residual_bindings = transfer_variable_map_to_bindings_filtered(variable_map, supporting_subproof_bindings);
            SubLObject rule_bindings = compute_transformation_link_rule_bindings(t_link, residual_bindings);
            return rule_bindings;
        }
    }

    public static SubLObject residual_transformation_proof_rule_bindings(final SubLObject residual_transformation_proof) {
        final SubLObject rt_link = inference_datastructures_proof.proof_link(residual_transformation_proof);
        final SubLObject t_link = residual_transformation_link_motivating_transformation_link(rt_link);
        final SubLObject subproof = residual_transformation_proof_subproof(residual_transformation_proof);
        final SubLObject supporting_subproof_bindings = inference_datastructures_proof.proof_bindings(subproof);
        final SubLObject variable_map = residual_transformation_link_supporting_variable_map(rt_link);
        final SubLObject residual_bindings = bindings.transfer_variable_map_to_bindings_filtered(variable_map, supporting_subproof_bindings);
        final SubLObject rule_bindings = inference_worker_transformation.compute_transformation_link_rule_bindings(t_link, residual_bindings);
        return rule_bindings;
    }

    public static final SubLObject residual_transformation_proof_motivating_transformation_link_alt(SubLObject residual_transformation_proof) {
        return com.cyc.cycjava.cycl.inference.harness.inference_worker_residual_transformation.residual_transformation_link_motivating_transformation_link(inference_datastructures_proof.proof_link(residual_transformation_proof));
    }

    public static SubLObject residual_transformation_proof_motivating_transformation_link(final SubLObject residual_transformation_proof) {
        return residual_transformation_link_motivating_transformation_link(inference_datastructures_proof.proof_link(residual_transformation_proof));
    }

    /**
     *
     *
     * @return variable-map-p; A variable map that maps the conjunctive problem (well, at least the B half of it)
    into the variable space of RT-LINK's supported problem, the motivating conjunction problem.
    This variable map is partial.
     */
    @LispMethod(comment = "@return variable-map-p; A variable map that maps the conjunctive problem (well, at least the B half of it)\r\ninto the variable space of RT-LINK\'s supported problem, the motivating conjunction problem.\r\nThis variable map is partial.")
    public static final SubLObject residual_transformation_link_residual_conjunction_to_motivating_conjunction_variable_map_alt(SubLObject rt_link) {
        {
            SubLObject t_link = com.cyc.cycjava.cycl.inference.harness.inference_worker_residual_transformation.residual_transformation_link_motivating_transformation_link(rt_link);
            SubLObject jo_link = com.cyc.cycjava.cycl.inference.harness.inference_worker_residual_transformation.residual_transformation_link_motivating_join_ordered_link(rt_link);
            SubLObject residual_conjunction_to_residual_variable_map = com.cyc.cycjava.cycl.inference.harness.inference_worker_residual_transformation.residual_transformation_link_supporting_variable_map(rt_link);
            SubLObject residual_to_extended_focal_variable_map = inference_datastructures_problem_link.mapped_problem_variable_map(transformation_link_supporting_mapped_problem(t_link));
            SubLObject extended_focal_to_focal_variable_map = invert_bindings(transformation_link_bindings(t_link));
            SubLObject focal_to_supported_variable_map = inference_datastructures_problem_link.mapped_problem_variable_map(join_ordered_link_focal_mapped_problem(jo_link));
            SubLObject residual_conjunction_to_extended_focal_variable_map = compose_bindings_filtered(residual_conjunction_to_residual_variable_map, residual_to_extended_focal_variable_map);
            SubLObject residual_conjunction_to_focal_variable_map = compose_bindings_filtered(residual_conjunction_to_extended_focal_variable_map, extended_focal_to_focal_variable_map);
            SubLObject residual_conjunction_to_supported_variable_map = compose_bindings_filtered(residual_conjunction_to_focal_variable_map, focal_to_supported_variable_map);
            return residual_conjunction_to_supported_variable_map;
        }
    }

    /**
     *
     *
     * @return variable-map-p; A variable map that maps the conjunctive problem (well, at least the B half of it)
    into the variable space of RT-LINK's supported problem, the motivating conjunction problem.
    This variable map is partial.
     */
    @LispMethod(comment = "@return variable-map-p; A variable map that maps the conjunctive problem (well, at least the B half of it)\r\ninto the variable space of RT-LINK\'s supported problem, the motivating conjunction problem.\r\nThis variable map is partial.")
    public static SubLObject residual_transformation_link_residual_conjunction_to_motivating_conjunction_variable_map(final SubLObject rt_link) {
        final SubLObject t_link = residual_transformation_link_motivating_transformation_link(rt_link);
        final SubLObject jo_link = residual_transformation_link_motivating_join_ordered_link(rt_link);
        final SubLObject residual_conjunction_to_residual_variable_map = residual_transformation_link_supporting_variable_map(rt_link);
        final SubLObject residual_to_extended_focal_variable_map = inference_datastructures_problem_link.mapped_problem_variable_map(inference_worker_transformation.transformation_link_supporting_mapped_problem(t_link));
        final SubLObject extended_focal_to_focal_variable_map = bindings.invert_bindings(inference_worker_transformation.transformation_link_bindings(t_link));
        final SubLObject focal_to_supported_variable_map = inference_datastructures_problem_link.mapped_problem_variable_map(inference_worker_join_ordered.join_ordered_link_focal_mapped_problem(jo_link));
        final SubLObject residual_conjunction_to_extended_focal_variable_map = bindings.compose_bindings_filtered(residual_conjunction_to_residual_variable_map, residual_to_extended_focal_variable_map);
        final SubLObject residual_conjunction_to_focal_variable_map = bindings.compose_bindings_filtered(residual_conjunction_to_extended_focal_variable_map, extended_focal_to_focal_variable_map);
        final SubLObject residual_conjunction_to_supported_variable_map = bindings.compose_bindings_filtered(residual_conjunction_to_focal_variable_map, focal_to_supported_variable_map);
        return residual_conjunction_to_supported_variable_map;
    }

    public static final SubLObject conjoin_problem_queries_alt(SubLObject query1, SubLObject query2) {
        SubLTrampolineFile.checkType(query1, SINGLE_CLAUSE_PROBLEM_QUERY_P);
        SubLTrampolineFile.checkType(query2, SINGLE_CLAUSE_PROBLEM_QUERY_P);
        {
            SubLObject clause1 = inference_datastructures_problem_query.sole_contextualized_clause_from_single_clause_problem_query(query1);
            SubLObject clause2 = inference_datastructures_problem_query.sole_contextualized_clause_from_single_clause_problem_query(query2);
            return inference_datastructures_problem_query.new_problem_query_from_contextualized_clause(merge_dnf(clause1, clause2));
        }
    }

    public static SubLObject conjoin_problem_queries(final SubLObject query1, final SubLObject query2) {
        assert NIL != inference_datastructures_problem_query.single_clause_problem_query_p(query1) : "! inference_datastructures_problem_query.single_clause_problem_query_p(query1) " + ("inference_datastructures_problem_query.single_clause_problem_query_p(query1) " + "CommonSymbols.NIL != inference_datastructures_problem_query.single_clause_problem_query_p(query1) ") + query1;
        assert NIL != inference_datastructures_problem_query.single_clause_problem_query_p(query2) : "! inference_datastructures_problem_query.single_clause_problem_query_p(query2) " + ("inference_datastructures_problem_query.single_clause_problem_query_p(query2) " + "CommonSymbols.NIL != inference_datastructures_problem_query.single_clause_problem_query_p(query2) ") + query2;
        final SubLObject clause1 = inference_datastructures_problem_query.sole_contextualized_clause_from_single_clause_problem_query(query1);
        final SubLObject clause2 = inference_datastructures_problem_query.sole_contextualized_clause_from_single_clause_problem_query(query2);
        return inference_datastructures_problem_query.new_problem_query_from_contextualized_clause(inference_worker_transformation.merge_dnf(clause1, clause2));
    }

    public static final SubLObject rt_apply_bindings_alt(SubLObject v_bindings, SubLObject tree) {
        return apply_bindings(v_bindings, tree);
    }

    public static SubLObject rt_apply_bindings(final SubLObject v_bindings, final SubLObject tree) {
        return bindings.apply_bindings(v_bindings, tree);
    }

    public static SubLObject rt_apply_bindings_backwards(final SubLObject v_bindings, final SubLObject tree) {
        return bindings.apply_bindings_backwards(v_bindings, tree);
    }

    public static final SubLObject compute_conjunctive_problem_dont_care_variable_map_alt(SubLObject non_focal_variable_map, SubLObject focal_variable_map, SubLObject transformation_link) {
        {
            SubLObject conjunctive_problem_dont_care_variable_map = NIL;
            SubLObject dont_care_vars_from_non_focal_wrt_conjunction = fast_set_difference(bindings_values(non_focal_variable_map), bindings_values(focal_variable_map), UNPROVIDED);
            SubLObject first_available_non_base_variable_number = com.cyc.cycjava.cycl.inference.harness.inference_worker_residual_transformation.transformation_link_first_unused_extended_var_number(transformation_link);
            SubLObject extended_extended_variable_number = first_available_non_base_variable_number;
            SubLObject cdolist_list_var = dont_care_vars_from_non_focal_wrt_conjunction;
            SubLObject dont_care_var = NIL;
            for (dont_care_var = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , dont_care_var = cdolist_list_var.first()) {
                {
                    SubLObject extended_extended_variable = find_variable_by_id(extended_extended_variable_number);
                    conjunctive_problem_dont_care_variable_map = add_variable_binding(dont_care_var, extended_extended_variable, conjunctive_problem_dont_care_variable_map);
                    extended_extended_variable_number = add(extended_extended_variable_number, ONE_INTEGER);
                }
            }
            return conjunctive_problem_dont_care_variable_map;
        }
    }

    public static SubLObject compute_conjunctive_problem_dont_care_variable_map(final SubLObject non_focal_variable_map, final SubLObject focal_variable_map, final SubLObject transformation_link) {
        SubLObject conjunctive_problem_dont_care_variable_map = NIL;
        final SubLObject dont_care_vars_from_non_focal_wrt_conjunction = list_utilities.fast_set_difference(bindings.bindings_values(non_focal_variable_map), bindings.bindings_values(focal_variable_map), UNPROVIDED);
        SubLObject extended_extended_variable_number;
        final SubLObject first_available_non_base_variable_number = extended_extended_variable_number = transformation_link_first_unused_extended_var_number(transformation_link);
        SubLObject cdolist_list_var = dont_care_vars_from_non_focal_wrt_conjunction;
        SubLObject dont_care_var = NIL;
        dont_care_var = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject extended_extended_variable = variables.find_variable_by_id(extended_extended_variable_number);
            conjunctive_problem_dont_care_variable_map = bindings.add_variable_binding(dont_care_var, extended_extended_variable, conjunctive_problem_dont_care_variable_map);
            extended_extended_variable_number = add(extended_extended_variable_number, ONE_INTEGER);
            cdolist_list_var = cdolist_list_var.rest();
            dont_care_var = cdolist_list_var.first();
        } 
        return conjunctive_problem_dont_care_variable_map;
    }

    public static final SubLObject transformation_link_first_unused_extended_var_number_alt(SubLObject transformation_link) {
        return $int$150;
    }

    public static SubLObject transformation_link_first_unused_extended_var_number(final SubLObject transformation_link) {
        return $int$150;
    }

    /**
     * Transformation link bindings can map to both base and non-base variables;
     * the base variables are the variables of the supported problem and the non-base
     * variables are the variables of the rule assertion.  This function filters out
     * the bindings to non-base variables (i.e. the non-base variables that occur in the values),
     * leaving only the bindings whose values are in the space of the supported problem.  In other words:
     *
     * @param TRANSFORMATION-LINK-BINDINGS;
     * 		extended supported problem vars -> extended supported problem vars or new contents
     * @return SUPPORTED-PROBLEM-BINDINGS; extended supported problem vars -> supported problem vars or new contents
     */
    @LispMethod(comment = "Transformation link bindings can map to both base and non-base variables;\r\nthe base variables are the variables of the supported problem and the non-base\r\nvariables are the variables of the rule assertion.  This function filters out\r\nthe bindings to non-base variables (i.e. the non-base variables that occur in the values),\r\nleaving only the bindings whose values are in the space of the supported problem.  In other words:\r\n\r\n@param TRANSFORMATION-LINK-BINDINGS;\r\n\t\textended supported problem vars -> extended supported problem vars or new contents\r\n@return SUPPORTED-PROBLEM-BINDINGS; extended supported problem vars -> supported problem vars or new contents\nTransformation link bindings can map to both base and non-base variables;\nthe base variables are the variables of the supported problem and the non-base\nvariables are the variables of the rule assertion.  This function filters out\nthe bindings to non-base variables (i.e. the non-base variables that occur in the values),\nleaving only the bindings whose values are in the space of the supported problem.  In other words:")
    public static final SubLObject filter_transformation_link_bindings_alt(SubLObject transformation_link_bindings) {
        {
            SubLObject supported_problem_bindings = NIL;
            SubLObject cdolist_list_var = transformation_link_bindings;
            SubLObject binding = NIL;
            for (binding = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , binding = cdolist_list_var.first()) {
                {
                    SubLObject variable = variable_binding_value(binding);
                    if (NIL == unification.non_base_variable_p(variable)) {
                        supported_problem_bindings = cons(binding, supported_problem_bindings);
                    }
                }
            }
            return nreverse(supported_problem_bindings);
        }
    }

    @LispMethod(comment = "Transformation link bindings can map to both base and non-base variables;\r\nthe base variables are the variables of the supported problem and the non-base\r\nvariables are the variables of the rule assertion.  This function filters out\r\nthe bindings to non-base variables (i.e. the non-base variables that occur in the values),\r\nleaving only the bindings whose values are in the space of the supported problem.  In other words:\r\n\r\n@param TRANSFORMATION-LINK-BINDINGS;\r\n\t\textended supported problem vars -> extended supported problem vars or new contents\r\n@return SUPPORTED-PROBLEM-BINDINGS; extended supported problem vars -> supported problem vars or new contents\nTransformation link bindings can map to both base and non-base variables;\nthe base variables are the variables of the supported problem and the non-base\nvariables are the variables of the rule assertion.  This function filters out\nthe bindings to non-base variables (i.e. the non-base variables that occur in the values),\nleaving only the bindings whose values are in the space of the supported problem.  In other words:")
    public static SubLObject filter_transformation_link_bindings(final SubLObject transformation_link_bindings) {
        SubLObject supported_problem_bindings = NIL;
        SubLObject cdolist_list_var = transformation_link_bindings;
        SubLObject binding = NIL;
        binding = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject variable = bindings.variable_binding_value(binding);
            if (NIL == unification.non_base_variable_p(variable)) {
                supported_problem_bindings = cons(binding, supported_problem_bindings);
            }
            cdolist_list_var = cdolist_list_var.rest();
            binding = cdolist_list_var.first();
        } 
        return nreverse(supported_problem_bindings);
    }

    public static final SubLObject residual_transformation_proof_p_alt(SubLObject v_object) {
        return makeBoolean((NIL != inference_datastructures_proof.proof_p(v_object)) && (NIL != com.cyc.cycjava.cycl.inference.harness.inference_worker_residual_transformation.residual_transformation_link_p(inference_datastructures_proof.proof_link(v_object))));
    }

    public static SubLObject residual_transformation_proof_p(final SubLObject v_object) {
        return makeBoolean((NIL != inference_datastructures_proof.proof_p(v_object)) && (NIL != residual_transformation_link_p(inference_datastructures_proof.proof_link(v_object))));
    }

    public static final SubLObject residual_transformation_proof_rule_assertion_alt(SubLObject proof) {
        {
            SubLObject rt_link = inference_datastructures_proof.proof_link(proof);
            return com.cyc.cycjava.cycl.inference.harness.inference_worker_residual_transformation.residual_transformation_link_rule_assertion(rt_link);
        }
    }

    public static SubLObject residual_transformation_proof_rule_assertion(final SubLObject proof) {
        final SubLObject rt_link = inference_datastructures_proof.proof_link(proof);
        return residual_transformation_link_rule_assertion(rt_link);
    }

    /**
     *
     *
     * @return nil or proof-p
     */
    @LispMethod(comment = "@return nil or proof-p")
    public static final SubLObject residual_transformation_proof_subproof_alt(SubLObject proof) {
        SubLTrampolineFile.checkType(proof, RESIDUAL_TRANSFORMATION_PROOF_P);
        return inference_datastructures_proof.proof_first_subproof(proof);
    }

    /**
     *
     *
     * @return nil or proof-p
     */
    @LispMethod(comment = "@return nil or proof-p")
    public static SubLObject residual_transformation_proof_subproof(final SubLObject proof) {
        assert NIL != residual_transformation_proof_p(proof) : "! inference_worker_residual_transformation.residual_transformation_proof_p(proof) " + ("inference_worker_residual_transformation.residual_transformation_proof_p(proof) " + "CommonSymbols.NIL != inference_worker_residual_transformation.residual_transformation_proof_p(proof) ") + proof;
        return inference_datastructures_proof.proof_first_subproof(proof);
    }

    public static final SubLObject bubble_up_proof_to_residual_transformation_link_alt(SubLObject conjunction_proof, SubLObject conjunction_variable_map, SubLObject rt_link) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            thread.resetMultipleValues();
            {
                SubLObject proof = com.cyc.cycjava.cycl.inference.harness.inference_worker_residual_transformation.new_residual_transformation_proof(rt_link, conjunction_proof, conjunction_variable_map);
                SubLObject newP = thread.secondMultipleValue();
                thread.resetMultipleValues();
                if (NIL != newP) {
                    inference_worker.bubble_up_proof(proof);
                } else {
                    inference_worker.possibly_note_proof_processed(conjunction_proof);
                }
                return proof;
            }
        }
    }

    public static SubLObject bubble_up_proof_to_residual_transformation_link(final SubLObject conjunction_proof, final SubLObject conjunction_variable_map, final SubLObject rt_link) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        thread.resetMultipleValues();
        final SubLObject proof = new_residual_transformation_proof(rt_link, conjunction_proof, conjunction_variable_map);
        final SubLObject newP = thread.secondMultipleValue();
        thread.resetMultipleValues();
        if (NIL != newP) {
            inference_worker.bubble_up_proof(proof);
        } else {
            inference_worker.possibly_note_proof_processed(conjunction_proof);
        }
        return proof;
    }

    public static final SubLObject residual_transformation_proof_abnormalP_alt(SubLObject residual_transformation_proof) {
        {
            SubLObject link = inference_datastructures_proof.proof_link(residual_transformation_proof);
            SubLObject store = inference_datastructures_problem_link.problem_link_store(link);
            SubLObject rule = com.cyc.cycjava.cycl.inference.harness.inference_worker_residual_transformation.residual_transformation_link_rule_assertion(link);
            SubLObject t_link = com.cyc.cycjava.cycl.inference.harness.inference_worker_residual_transformation.residual_transformation_link_motivating_transformation_link(link);
            SubLObject transformation_mt = transformation_link_transformation_mt(t_link);
            SubLObject rule_bindings = com.cyc.cycjava.cycl.inference.harness.inference_worker_residual_transformation.residual_transformation_proof_rule_bindings(residual_transformation_proof);
            return abnormal.rule_bindings_abnormalP(store, rule, rule_bindings, transformation_mt);
        }
    }

    public static SubLObject residual_transformation_proof_abnormalP(final SubLObject residual_transformation_proof) {
        final SubLObject link = inference_datastructures_proof.proof_link(residual_transformation_proof);
        final SubLObject store = inference_datastructures_problem_link.problem_link_store(link);
        final SubLObject rule = residual_transformation_link_rule_assertion(link);
        final SubLObject t_link = residual_transformation_link_motivating_transformation_link(link);
        final SubLObject transformation_mt = inference_worker_transformation.transformation_link_transformation_mt(t_link);
        final SubLObject rule_bindings = residual_transformation_proof_rule_bindings(residual_transformation_proof);
        return abnormal.rule_bindings_abnormalP(store, rule, rule_bindings, transformation_mt);
    }

    public static final SubLObject problem_is_a_residual_conjunctionP_alt(SubLObject problem) {
        {
            SubLObject set_contents_var = inference_datastructures_problem.problem_dependent_links(problem);
            SubLObject basis_object = set_contents.do_set_contents_basis_object(set_contents_var);
            SubLObject state = NIL;
            for (state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
                {
                    SubLObject rt_link = set_contents.do_set_contents_next(basis_object, state);
                    if (NIL != set_contents.do_set_contents_element_validP(state, rt_link)) {
                        if (NIL != inference_datastructures_problem_link.problem_link_has_typeP(rt_link, $RESIDUAL_TRANSFORMATION)) {
                            return T;
                        }
                    }
                }
            }
        }
        return NIL;
    }

    public static SubLObject problem_is_a_residual_conjunctionP(final SubLObject problem) {
        final SubLObject set_contents_var = inference_datastructures_problem.problem_dependent_links(problem);
        SubLObject basis_object;
        SubLObject state;
        SubLObject rt_link;
        for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
            rt_link = set_contents.do_set_contents_next(basis_object, state);
            if ((NIL != set_contents.do_set_contents_element_validP(state, rt_link)) && (NIL != inference_datastructures_problem_link.problem_link_has_typeP(rt_link, $RESIDUAL_TRANSFORMATION))) {
                return T;
            }
        }
        return NIL;
    }

    public static final SubLObject problem_store_problematic_residual_transformation_links_alt(SubLObject store) {
        return NIL;
    }

    public static SubLObject problem_store_problematic_residual_transformation_links(final SubLObject store) {
        return NIL;
    }

    public static final SubLObject problem_store_problematic_residual_transformation_link_count_alt(SubLObject store) {
        return length(com.cyc.cycjava.cycl.inference.harness.inference_worker_residual_transformation.problem_store_problematic_residual_transformation_links(store));
    }

    public static SubLObject problem_store_problematic_residual_transformation_link_count(final SubLObject store) {
        return length(problem_store_problematic_residual_transformation_links(store));
    }

    public static SubLObject declare_inference_worker_residual_transformation_file() {
        declareFunction("residual_transformation_link_p", "RESIDUAL-TRANSFORMATION-LINK-P", 1, 0, false);
        declareFunction("find_residual_transformation_link", "FIND-RESIDUAL-TRANSFORMATION-LINK", 2, 0, false);
        declareFunction("new_residual_transformation_link", "NEW-RESIDUAL-TRANSFORMATION-LINK", 5, 0, false);
        declareFunction("destroy_residual_transformation_link", "DESTROY-RESIDUAL-TRANSFORMATION-LINK", 1, 0, false);
        declareFunction("destroy_join_ordered_link_wrt_residual_transformation_links", "DESTROY-JOIN-ORDERED-LINK-WRT-RESIDUAL-TRANSFORMATION-LINKS", 1, 0, false);
        declareFunction("destroy_transformation_link_wrt_residual_transformation_links", "DESTROY-TRANSFORMATION-LINK-WRT-RESIDUAL-TRANSFORMATION-LINKS", 1, 0, false);
        declareFunction("residual_transformation_link_supporting_mapped_problem", "RESIDUAL-TRANSFORMATION-LINK-SUPPORTING-MAPPED-PROBLEM", 1, 0, false);
        declareFunction("residual_transformation_link_supporting_problem", "RESIDUAL-TRANSFORMATION-LINK-SUPPORTING-PROBLEM", 1, 0, false);
        declareFunction("residual_transformation_link_supporting_variable_map", "RESIDUAL-TRANSFORMATION-LINK-SUPPORTING-VARIABLE-MAP", 1, 0, false);
        declareFunction("residual_transformation_link_motivating_join_ordered_link", "RESIDUAL-TRANSFORMATION-LINK-MOTIVATING-JOIN-ORDERED-LINK", 1, 0, false);
        declareFunction("residual_transformation_link_motivating_transformation_link", "RESIDUAL-TRANSFORMATION-LINK-MOTIVATING-TRANSFORMATION-LINK", 1, 0, false);
        declareFunction("residual_transformation_link_conjunctive_problem_dont_care_variable_map", "RESIDUAL-TRANSFORMATION-LINK-CONJUNCTIVE-PROBLEM-DONT-CARE-VARIABLE-MAP", 1, 0, false);
        declareFunction("residual_transformation_link_residual_conjunction_literal_map", "RESIDUAL-TRANSFORMATION-LINK-RESIDUAL-CONJUNCTION-LITERAL-MAP", 1, 0, false);
        declareFunction("residual_transformation_link_motivated_by_link_pairP", "RESIDUAL-TRANSFORMATION-LINK-MOTIVATED-BY-LINK-PAIR?", 3, 0, false);
        declareFunction("residual_transformation_link_motivated_by_join_ordered_linkP", "RESIDUAL-TRANSFORMATION-LINK-MOTIVATED-BY-JOIN-ORDERED-LINK?", 2, 0, false);
        declareFunction("residual_transformation_link_motivated_by_transformation_linkP", "RESIDUAL-TRANSFORMATION-LINK-MOTIVATED-BY-TRANSFORMATION-LINK?", 2, 0, false);
        declareFunction("residual_transformation_link_residual_problem", "RESIDUAL-TRANSFORMATION-LINK-RESIDUAL-PROBLEM", 1, 0, false);
        declareFunction("residual_transformation_link_rule_assertion", "RESIDUAL-TRANSFORMATION-LINK-RULE-ASSERTION", 1, 0, false);
        declareFunction("residual_transformation_link_bindings", "RESIDUAL-TRANSFORMATION-LINK-BINDINGS", 1, 0, false);
        declareFunction("residual_transformation_link_el_bindings", "RESIDUAL-TRANSFORMATION-LINK-EL-BINDINGS", 1, 0, false);
        declareFunction("set_residual_transformation_link_data", "SET-RESIDUAL-TRANSFORMATION-LINK-DATA", 5, 0, false);
        declareFunction("maybe_possibly_add_residual_transformation_links_via_join_ordered_link", "MAYBE-POSSIBLY-ADD-RESIDUAL-TRANSFORMATION-LINKS-VIA-JOIN-ORDERED-LINK", 1, 0, false);
        declareFunction("maybe_possibly_add_residual_transformation_links_via_transformation_link", "MAYBE-POSSIBLY-ADD-RESIDUAL-TRANSFORMATION-LINKS-VIA-TRANSFORMATION-LINK", 1, 0, false);
        declareFunction("possibly_add_residual_transformation_links_via_join_ordered_link", "POSSIBLY-ADD-RESIDUAL-TRANSFORMATION-LINKS-VIA-JOIN-ORDERED-LINK", 1, 0, false);
        declareFunction("possibly_add_residual_transformation_links_via_transformation_link", "POSSIBLY-ADD-RESIDUAL-TRANSFORMATION-LINKS-VIA-TRANSFORMATION-LINK", 1, 0, false);
        declareFunction("possibly_add_residual_transformation_link", "POSSIBLY-ADD-RESIDUAL-TRANSFORMATION-LINK", 2, 0, false);
        declareFunction("compute_residual_transformation_link_query", "COMPUTE-RESIDUAL-TRANSFORMATION-LINK-QUERY", 2, 0, false);
        declareFunction("compute_residual_conjunction_literal_map", "COMPUTE-RESIDUAL-CONJUNCTION-LITERAL-MAP", 4, 0, false);
        declareFunction("compute_residual_conjunction_literal_map_internal", "COMPUTE-RESIDUAL-CONJUNCTION-LITERAL-MAP-INTERNAL", 4, 0, false);
        declareFunction("new_residual_transformation_proof", "NEW-RESIDUAL-TRANSFORMATION-PROOF", 3, 0, false);
        declareFunction("residual_transformation_proof_rule_bindings", "RESIDUAL-TRANSFORMATION-PROOF-RULE-BINDINGS", 1, 0, false);
        declareFunction("residual_transformation_proof_motivating_transformation_link", "RESIDUAL-TRANSFORMATION-PROOF-MOTIVATING-TRANSFORMATION-LINK", 1, 0, false);
        declareFunction("residual_transformation_link_residual_conjunction_to_motivating_conjunction_variable_map", "RESIDUAL-TRANSFORMATION-LINK-RESIDUAL-CONJUNCTION-TO-MOTIVATING-CONJUNCTION-VARIABLE-MAP", 1, 0, false);
        declareFunction("conjoin_problem_queries", "CONJOIN-PROBLEM-QUERIES", 2, 0, false);
        declareFunction("rt_apply_bindings", "RT-APPLY-BINDINGS", 2, 0, false);
        declareFunction("rt_apply_bindings_backwards", "RT-APPLY-BINDINGS-BACKWARDS", 2, 0, false);
        declareFunction("compute_conjunctive_problem_dont_care_variable_map", "COMPUTE-CONJUNCTIVE-PROBLEM-DONT-CARE-VARIABLE-MAP", 3, 0, false);
        declareFunction("transformation_link_first_unused_extended_var_number", "TRANSFORMATION-LINK-FIRST-UNUSED-EXTENDED-VAR-NUMBER", 1, 0, false);
        declareFunction("filter_transformation_link_bindings", "FILTER-TRANSFORMATION-LINK-BINDINGS", 1, 0, false);
        declareFunction("residual_transformation_proof_p", "RESIDUAL-TRANSFORMATION-PROOF-P", 1, 0, false);
        declareFunction("residual_transformation_proof_rule_assertion", "RESIDUAL-TRANSFORMATION-PROOF-RULE-ASSERTION", 1, 0, false);
        declareFunction("residual_transformation_proof_subproof", "RESIDUAL-TRANSFORMATION-PROOF-SUBPROOF", 1, 0, false);
        declareFunction("bubble_up_proof_to_residual_transformation_link", "BUBBLE-UP-PROOF-TO-RESIDUAL-TRANSFORMATION-LINK", 3, 0, false);
        declareFunction("residual_transformation_proof_abnormalP", "RESIDUAL-TRANSFORMATION-PROOF-ABNORMAL?", 1, 0, false);
        declareFunction("problem_is_a_residual_conjunctionP", "PROBLEM-IS-A-RESIDUAL-CONJUNCTION?", 1, 0, false);
        declareFunction("problem_store_problematic_residual_transformation_links", "PROBLEM-STORE-PROBLEMATIC-RESIDUAL-TRANSFORMATION-LINKS", 1, 0, false);
        declareFunction("problem_store_problematic_residual_transformation_link_count", "PROBLEM-STORE-PROBLEMATIC-RESIDUAL-TRANSFORMATION-LINK-COUNT", 1, 0, false);
        return NIL;
    }

    static private final SubLList $list_alt12 = list(makeSymbol("NULL"));

    static private final SubLList $list_alt14 = list(makeSymbol("ZERO"));

    public static SubLObject init_inference_worker_residual_transformation_file() {
        deflexical("*RESIDUAL-TRANSFORMATION-LINK-MOTIVATING-OBJECT-TEST*", symbol_function(EQUAL));
        defvar("*RESIDUAL-TRANSFORMATION-PROOF-BUBBLING-TRIGGERS-ADDITIONAL-RESTRICTIONS?*", NIL);
        defvar("*RESIDUAL-TRANSFORMATION-PROOF-BUBBLING-OPENS-SPLIT-LINKS?*", NIL);
        return NIL;
    }

    public static final SubLObject setup_inference_worker_residual_transformation_file_alt() {
        define_obsolete_register(PROBLEM_STORE_PROBLEMATIC_RESIDUAL_TRANSFORMATION_LINKS, $list_alt12);
        define_obsolete_register(PROBLEM_STORE_PROBLEMATIC_RESIDUAL_TRANSFORMATION_LINK_COUNT, $list_alt14);
        return NIL;
    }

    public static SubLObject setup_inference_worker_residual_transformation_file() {
        if (SubLFiles.USE_V1) {
            define_obsolete_register(PROBLEM_STORE_PROBLEMATIC_RESIDUAL_TRANSFORMATION_LINKS, $list13);
            define_obsolete_register(PROBLEM_STORE_PROBLEMATIC_RESIDUAL_TRANSFORMATION_LINK_COUNT, $list15);
        }
        if (SubLFiles.USE_V2) {
            define_obsolete_register(PROBLEM_STORE_PROBLEMATIC_RESIDUAL_TRANSFORMATION_LINKS, $list_alt12);
            define_obsolete_register(PROBLEM_STORE_PROBLEMATIC_RESIDUAL_TRANSFORMATION_LINK_COUNT, $list_alt14);
        }
        return NIL;
    }

    public static SubLObject setup_inference_worker_residual_transformation_file_Previous() {
        define_obsolete_register(PROBLEM_STORE_PROBLEMATIC_RESIDUAL_TRANSFORMATION_LINKS, $list13);
        define_obsolete_register(PROBLEM_STORE_PROBLEMATIC_RESIDUAL_TRANSFORMATION_LINK_COUNT, $list15);
        return NIL;
    }

    @Override
    public void declareFunctions() {
        declare_inference_worker_residual_transformation_file();
    }

    @Override
    public void initializeVariables() {
        init_inference_worker_residual_transformation_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_inference_worker_residual_transformation_file();
    }

    
}

/**
 * Total time: 160 ms
 */
